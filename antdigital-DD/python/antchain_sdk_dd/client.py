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
                    'sdk_version': '1.1.1',
                    '_prod_code': 'DD',
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
                    'sdk_version': '1.1.1',
                    '_prod_code': 'DD',
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

    def query_demo_test_testjl(
        self,
        request: dd_models.QueryDemoTestTestjlRequest,
    ) -> dd_models.QueryDemoTestTestjlResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_test_testjl_ex(request, headers, runtime)

    async def query_demo_test_testjl_async(
        self,
        request: dd_models.QueryDemoTestTestjlRequest,
    ) -> dd_models.QueryDemoTestTestjlResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_test_testjl_ex_async(request, headers, runtime)

    def query_demo_test_testjl_ex(
        self,
        request: dd_models.QueryDemoTestTestjlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryDemoTestTestjlResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryDemoTestTestjlResponse(),
            self.do_request('1.0', 'demo.test.testjl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_test_testjl_ex_async(
        self,
        request: dd_models.QueryDemoTestTestjlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryDemoTestTestjlResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryDemoTestTestjlResponse(),
            await self.do_request_async('1.0', 'demo.test.testjl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_demo_business_orderpp(
        self,
        request: dd_models.CreateDemoBusinessOrderppRequest,
    ) -> dd_models.CreateDemoBusinessOrderppResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_demo_business_orderpp_ex(request, headers, runtime)

    async def create_demo_business_orderpp_async(
        self,
        request: dd_models.CreateDemoBusinessOrderppRequest,
    ) -> dd_models.CreateDemoBusinessOrderppResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_demo_business_orderpp_ex_async(request, headers, runtime)

    def create_demo_business_orderpp_ex(
        self,
        request: dd_models.CreateDemoBusinessOrderppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderppResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderppResponse(),
            self.do_request('1.0', 'demo.business.orderpp.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_demo_business_orderpp_ex_async(
        self,
        request: dd_models.CreateDemoBusinessOrderppRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderppResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderppResponse(),
            await self.do_request_async('1.0', 'demo.business.orderpp.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_demo_business_orderxxx(
        self,
        request: dd_models.CreateDemoBusinessOrderxxxRequest,
    ) -> dd_models.CreateDemoBusinessOrderxxxResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_demo_business_orderxxx_ex(request, headers, runtime)

    async def create_demo_business_orderxxx_async(
        self,
        request: dd_models.CreateDemoBusinessOrderxxxRequest,
    ) -> dd_models.CreateDemoBusinessOrderxxxResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_demo_business_orderxxx_ex_async(request, headers, runtime)

    def create_demo_business_orderxxx_ex(
        self,
        request: dd_models.CreateDemoBusinessOrderxxxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderxxxResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderxxxResponse(),
            self.do_request('1.0', 'demo.business.orderxxx.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_demo_business_orderxxx_ex_async(
        self,
        request: dd_models.CreateDemoBusinessOrderxxxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderxxxResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderxxxResponse(),
            await self.do_request_async('1.0', 'demo.business.orderxxx.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_demo_business_order(
        self,
        request: dd_models.CreateDemoBusinessOrderRequest,
    ) -> dd_models.CreateDemoBusinessOrderResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_demo_business_order_ex(request, headers, runtime)

    async def create_demo_business_order_async(
        self,
        request: dd_models.CreateDemoBusinessOrderRequest,
    ) -> dd_models.CreateDemoBusinessOrderResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_demo_business_order_ex_async(request, headers, runtime)

    def create_demo_business_order_ex(
        self,
        request: dd_models.CreateDemoBusinessOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderResponse(),
            self.do_request('1.0', 'demo.business.order.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_demo_business_order_ex_async(
        self,
        request: dd_models.CreateDemoBusinessOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderResponse(),
            await self.do_request_async('1.0', 'demo.business.order.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_demo_business_orderzzz(
        self,
        request: dd_models.CreateDemoBusinessOrderzzzRequest,
    ) -> dd_models.CreateDemoBusinessOrderzzzResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_demo_business_orderzzz_ex(request, headers, runtime)

    async def create_demo_business_orderzzz_async(
        self,
        request: dd_models.CreateDemoBusinessOrderzzzRequest,
    ) -> dd_models.CreateDemoBusinessOrderzzzResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_demo_business_orderzzz_ex_async(request, headers, runtime)

    def create_demo_business_orderzzz_ex(
        self,
        request: dd_models.CreateDemoBusinessOrderzzzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderzzzResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderzzzResponse(),
            self.do_request('1.0', 'demo.business.orderzzz.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_demo_business_orderzzz_ex_async(
        self,
        request: dd_models.CreateDemoBusinessOrderzzzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateDemoBusinessOrderzzzResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateDemoBusinessOrderzzzResponse(),
            await self.do_request_async('1.0', 'demo.business.orderzzz.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apixa_demo_cli_create(
        self,
        request: dd_models.ApixaDemoCliCreateRequest,
    ) -> dd_models.ApixaDemoCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apixa_demo_cli_create_ex(request, headers, runtime)

    async def apixa_demo_cli_create_async(
        self,
        request: dd_models.ApixaDemoCliCreateRequest,
    ) -> dd_models.ApixaDemoCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apixa_demo_cli_create_ex_async(request, headers, runtime)

    def apixa_demo_cli_create_ex(
        self,
        request: dd_models.ApixaDemoCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ApixaDemoCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ApixaDemoCliCreateResponse(),
            self.do_request('1.0', 'demo.cli.create.apixa', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apixa_demo_cli_create_ex_async(
        self,
        request: dd_models.ApixaDemoCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ApixaDemoCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ApixaDemoCliCreateResponse(),
            await self.do_request_async('1.0', 'demo.cli.create.apixa', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apixb_demo_cli_create(
        self,
        request: dd_models.ApixbDemoCliCreateRequest,
    ) -> dd_models.ApixbDemoCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apixb_demo_cli_create_ex(request, headers, runtime)

    async def apixb_demo_cli_create_async(
        self,
        request: dd_models.ApixbDemoCliCreateRequest,
    ) -> dd_models.ApixbDemoCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apixb_demo_cli_create_ex_async(request, headers, runtime)

    def apixb_demo_cli_create_ex(
        self,
        request: dd_models.ApixbDemoCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ApixbDemoCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ApixbDemoCliCreateResponse(),
            self.do_request('1.0', 'demo.cli.create.apixb', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apixb_demo_cli_create_ex_async(
        self,
        request: dd_models.ApixbDemoCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ApixbDemoCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ApixbDemoCliCreateResponse(),
            await self.do_request_async('1.0', 'demo.cli.create.apixb', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apiz_demo_cli_create(
        self,
        request: dd_models.ApizDemoCliCreateRequest,
    ) -> dd_models.ApizDemoCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apiz_demo_cli_create_ex(request, headers, runtime)

    async def apiz_demo_cli_create_async(
        self,
        request: dd_models.ApizDemoCliCreateRequest,
    ) -> dd_models.ApizDemoCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apiz_demo_cli_create_ex_async(request, headers, runtime)

    def apiz_demo_cli_create_ex(
        self,
        request: dd_models.ApizDemoCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ApizDemoCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ApizDemoCliCreateResponse(),
            self.do_request('1.0', 'demo.cli.create.apiz', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apiz_demo_cli_create_ex_async(
        self,
        request: dd_models.ApizDemoCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ApizDemoCliCreateResponse:
        """
        Description: cli创建测试接口A
        Summary: cli创建测试接口A
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ApizDemoCliCreateResponse(),
            await self.do_request_async('1.0', 'demo.cli.create.apiz', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_acm_antchain_tenant(
        self,
        request: dd_models.CreateAntcloudAcmAntchainTenantRequest,
    ) -> dd_models.CreateAntcloudAcmAntchainTenantResponse:
        """
        Description: 账号创建
        Summary: 账号创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_acm_antchain_tenant_ex(request, headers, runtime)

    async def create_antcloud_acm_antchain_tenant_async(
        self,
        request: dd_models.CreateAntcloudAcmAntchainTenantRequest,
    ) -> dd_models.CreateAntcloudAcmAntchainTenantResponse:
        """
        Description: 账号创建
        Summary: 账号创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_acm_antchain_tenant_ex_async(request, headers, runtime)

    def create_antcloud_acm_antchain_tenant_ex(
        self,
        request: dd_models.CreateAntcloudAcmAntchainTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateAntcloudAcmAntchainTenantResponse:
        """
        Description: 账号创建
        Summary: 账号创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateAntcloudAcmAntchainTenantResponse(),
            self.do_request('1.0', 'antcloud.acm.antchain.tenant.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_acm_antchain_tenant_ex_async(
        self,
        request: dd_models.CreateAntcloudAcmAntchainTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateAntcloudAcmAntchainTenantResponse:
        """
        Description: 账号创建
        Summary: 账号创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateAntcloudAcmAntchainTenantResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.antchain.tenant.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_antcloud_acm_customer_identity(
        self,
        request: dd_models.UpdateAntcloudAcmCustomerIdentityRequest,
    ) -> dd_models.UpdateAntcloudAcmCustomerIdentityResponse:
        """
        Description: 客户认证信息更新
        Summary: 客户认证信息更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_antcloud_acm_customer_identity_ex(request, headers, runtime)

    async def update_antcloud_acm_customer_identity_async(
        self,
        request: dd_models.UpdateAntcloudAcmCustomerIdentityRequest,
    ) -> dd_models.UpdateAntcloudAcmCustomerIdentityResponse:
        """
        Description: 客户认证信息更新
        Summary: 客户认证信息更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_antcloud_acm_customer_identity_ex_async(request, headers, runtime)

    def update_antcloud_acm_customer_identity_ex(
        self,
        request: dd_models.UpdateAntcloudAcmCustomerIdentityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.UpdateAntcloudAcmCustomerIdentityResponse:
        """
        Description: 客户认证信息更新
        Summary: 客户认证信息更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.UpdateAntcloudAcmCustomerIdentityResponse(),
            self.do_request('1.0', 'antcloud.acm.customer.identity.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_antcloud_acm_customer_identity_ex_async(
        self,
        request: dd_models.UpdateAntcloudAcmCustomerIdentityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.UpdateAntcloudAcmCustomerIdentityResponse:
        """
        Description: 客户认证信息更新
        Summary: 客户认证信息更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.UpdateAntcloudAcmCustomerIdentityResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.customer.identity.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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

    def update_antcloud_acm_tenant_country(
        self,
        request: dd_models.UpdateAntcloudAcmTenantCountryRequest,
    ) -> dd_models.UpdateAntcloudAcmTenantCountryResponse:
        """
        Description: 更新蚂蚁链账号的国家代码
        Summary: 更新蚂蚁链账号的国家代码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_antcloud_acm_tenant_country_ex(request, headers, runtime)

    async def update_antcloud_acm_tenant_country_async(
        self,
        request: dd_models.UpdateAntcloudAcmTenantCountryRequest,
    ) -> dd_models.UpdateAntcloudAcmTenantCountryResponse:
        """
        Description: 更新蚂蚁链账号的国家代码
        Summary: 更新蚂蚁链账号的国家代码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_antcloud_acm_tenant_country_ex_async(request, headers, runtime)

    def update_antcloud_acm_tenant_country_ex(
        self,
        request: dd_models.UpdateAntcloudAcmTenantCountryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.UpdateAntcloudAcmTenantCountryResponse:
        """
        Description: 更新蚂蚁链账号的国家代码
        Summary: 更新蚂蚁链账号的国家代码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.UpdateAntcloudAcmTenantCountryResponse(),
            self.do_request('1.0', 'antcloud.acm.tenant.country.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_antcloud_acm_tenant_country_ex_async(
        self,
        request: dd_models.UpdateAntcloudAcmTenantCountryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.UpdateAntcloudAcmTenantCountryResponse:
        """
        Description: 更新蚂蚁链账号的国家代码
        Summary: 更新蚂蚁链账号的国家代码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.UpdateAntcloudAcmTenantCountryResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.tenant.country.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antcloud_acm_tenant_project(
        self,
        request: dd_models.QueryAntcloudAcmTenantProjectRequest,
    ) -> dd_models.QueryAntcloudAcmTenantProjectResponse:
        """
        Description: 查询租户下项目列表
        Summary: 查询租户下项目列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antcloud_acm_tenant_project_ex(request, headers, runtime)

    async def query_antcloud_acm_tenant_project_async(
        self,
        request: dd_models.QueryAntcloudAcmTenantProjectRequest,
    ) -> dd_models.QueryAntcloudAcmTenantProjectResponse:
        """
        Description: 查询租户下项目列表
        Summary: 查询租户下项目列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antcloud_acm_tenant_project_ex_async(request, headers, runtime)

    def query_antcloud_acm_tenant_project_ex(
        self,
        request: dd_models.QueryAntcloudAcmTenantProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudAcmTenantProjectResponse:
        """
        Description: 查询租户下项目列表
        Summary: 查询租户下项目列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudAcmTenantProjectResponse(),
            self.do_request('1.0', 'antcloud.acm.tenant.project.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antcloud_acm_tenant_project_ex_async(
        self,
        request: dd_models.QueryAntcloudAcmTenantProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudAcmTenantProjectResponse:
        """
        Description: 查询租户下项目列表
        Summary: 查询租户下项目列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudAcmTenantProjectResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.tenant.project.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_acm_tenant_project(
        self,
        request: dd_models.CreateAntcloudAcmTenantProjectRequest,
    ) -> dd_models.CreateAntcloudAcmTenantProjectResponse:
        """
        Description: 创建项目
        Summary: 创建项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_acm_tenant_project_ex(request, headers, runtime)

    async def create_antcloud_acm_tenant_project_async(
        self,
        request: dd_models.CreateAntcloudAcmTenantProjectRequest,
    ) -> dd_models.CreateAntcloudAcmTenantProjectResponse:
        """
        Description: 创建项目
        Summary: 创建项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_acm_tenant_project_ex_async(request, headers, runtime)

    def create_antcloud_acm_tenant_project_ex(
        self,
        request: dd_models.CreateAntcloudAcmTenantProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateAntcloudAcmTenantProjectResponse:
        """
        Description: 创建项目
        Summary: 创建项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateAntcloudAcmTenantProjectResponse(),
            self.do_request('1.0', 'antcloud.acm.tenant.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_acm_tenant_project_ex_async(
        self,
        request: dd_models.CreateAntcloudAcmTenantProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateAntcloudAcmTenantProjectResponse:
        """
        Description: 创建项目
        Summary: 创建项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateAntcloudAcmTenantProjectResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.tenant.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_antcloud_acm_tenant_project(
        self,
        request: dd_models.UpdateAntcloudAcmTenantProjectRequest,
    ) -> dd_models.UpdateAntcloudAcmTenantProjectResponse:
        """
        Description: 编辑项目
        Summary: 编辑项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_antcloud_acm_tenant_project_ex(request, headers, runtime)

    async def update_antcloud_acm_tenant_project_async(
        self,
        request: dd_models.UpdateAntcloudAcmTenantProjectRequest,
    ) -> dd_models.UpdateAntcloudAcmTenantProjectResponse:
        """
        Description: 编辑项目
        Summary: 编辑项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_antcloud_acm_tenant_project_ex_async(request, headers, runtime)

    def update_antcloud_acm_tenant_project_ex(
        self,
        request: dd_models.UpdateAntcloudAcmTenantProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.UpdateAntcloudAcmTenantProjectResponse:
        """
        Description: 编辑项目
        Summary: 编辑项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.UpdateAntcloudAcmTenantProjectResponse(),
            self.do_request('1.0', 'antcloud.acm.tenant.project.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_antcloud_acm_tenant_project_ex_async(
        self,
        request: dd_models.UpdateAntcloudAcmTenantProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.UpdateAntcloudAcmTenantProjectResponse:
        """
        Description: 编辑项目
        Summary: 编辑项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.UpdateAntcloudAcmTenantProjectResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.tenant.project.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_antcloud_acm_project_status(
        self,
        request: dd_models.UpdateAntcloudAcmProjectStatusRequest,
    ) -> dd_models.UpdateAntcloudAcmProjectStatusResponse:
        """
        Description: 更新项目状态
        Summary: 更新项目状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_antcloud_acm_project_status_ex(request, headers, runtime)

    async def update_antcloud_acm_project_status_async(
        self,
        request: dd_models.UpdateAntcloudAcmProjectStatusRequest,
    ) -> dd_models.UpdateAntcloudAcmProjectStatusResponse:
        """
        Description: 更新项目状态
        Summary: 更新项目状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_antcloud_acm_project_status_ex_async(request, headers, runtime)

    def update_antcloud_acm_project_status_ex(
        self,
        request: dd_models.UpdateAntcloudAcmProjectStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.UpdateAntcloudAcmProjectStatusResponse:
        """
        Description: 更新项目状态
        Summary: 更新项目状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.UpdateAntcloudAcmProjectStatusResponse(),
            self.do_request('1.0', 'antcloud.acm.project.status.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_antcloud_acm_project_status_ex_async(
        self,
        request: dd_models.UpdateAntcloudAcmProjectStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.UpdateAntcloudAcmProjectStatusResponse:
        """
        Description: 更新项目状态
        Summary: 更新项目状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.UpdateAntcloudAcmProjectStatusResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.project.status.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antcloud_acm_project_member(
        self,
        request: dd_models.QueryAntcloudAcmProjectMemberRequest,
    ) -> dd_models.QueryAntcloudAcmProjectMemberResponse:
        """
        Description: 分页查询项目成员列表
        Summary: 分页查询项目成员列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antcloud_acm_project_member_ex(request, headers, runtime)

    async def query_antcloud_acm_project_member_async(
        self,
        request: dd_models.QueryAntcloudAcmProjectMemberRequest,
    ) -> dd_models.QueryAntcloudAcmProjectMemberResponse:
        """
        Description: 分页查询项目成员列表
        Summary: 分页查询项目成员列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antcloud_acm_project_member_ex_async(request, headers, runtime)

    def query_antcloud_acm_project_member_ex(
        self,
        request: dd_models.QueryAntcloudAcmProjectMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudAcmProjectMemberResponse:
        """
        Description: 分页查询项目成员列表
        Summary: 分页查询项目成员列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudAcmProjectMemberResponse(),
            self.do_request('1.0', 'antcloud.acm.project.member.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antcloud_acm_project_member_ex_async(
        self,
        request: dd_models.QueryAntcloudAcmProjectMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudAcmProjectMemberResponse:
        """
        Description: 分页查询项目成员列表
        Summary: 分页查询项目成员列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudAcmProjectMemberResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.project.member.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_antcloud_acm_project_member(
        self,
        request: dd_models.AddAntcloudAcmProjectMemberRequest,
    ) -> dd_models.AddAntcloudAcmProjectMemberResponse:
        """
        Description: 批量添加项目成员
        Summary: 批量添加项目成员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_antcloud_acm_project_member_ex(request, headers, runtime)

    async def add_antcloud_acm_project_member_async(
        self,
        request: dd_models.AddAntcloudAcmProjectMemberRequest,
    ) -> dd_models.AddAntcloudAcmProjectMemberResponse:
        """
        Description: 批量添加项目成员
        Summary: 批量添加项目成员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_antcloud_acm_project_member_ex_async(request, headers, runtime)

    def add_antcloud_acm_project_member_ex(
        self,
        request: dd_models.AddAntcloudAcmProjectMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.AddAntcloudAcmProjectMemberResponse:
        """
        Description: 批量添加项目成员
        Summary: 批量添加项目成员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.AddAntcloudAcmProjectMemberResponse(),
            self.do_request('1.0', 'antcloud.acm.project.member.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_antcloud_acm_project_member_ex_async(
        self,
        request: dd_models.AddAntcloudAcmProjectMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.AddAntcloudAcmProjectMemberResponse:
        """
        Description: 批量添加项目成员
        Summary: 批量添加项目成员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.AddAntcloudAcmProjectMemberResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.project.member.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_antcloud_acm_project_member(
        self,
        request: dd_models.RemoveAntcloudAcmProjectMemberRequest,
    ) -> dd_models.RemoveAntcloudAcmProjectMemberResponse:
        """
        Description: 移除项目成员
        Summary: 移除项目成员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_antcloud_acm_project_member_ex(request, headers, runtime)

    async def remove_antcloud_acm_project_member_async(
        self,
        request: dd_models.RemoveAntcloudAcmProjectMemberRequest,
    ) -> dd_models.RemoveAntcloudAcmProjectMemberResponse:
        """
        Description: 移除项目成员
        Summary: 移除项目成员
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_antcloud_acm_project_member_ex_async(request, headers, runtime)

    def remove_antcloud_acm_project_member_ex(
        self,
        request: dd_models.RemoveAntcloudAcmProjectMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.RemoveAntcloudAcmProjectMemberResponse:
        """
        Description: 移除项目成员
        Summary: 移除项目成员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.RemoveAntcloudAcmProjectMemberResponse(),
            self.do_request('1.0', 'antcloud.acm.project.member.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_antcloud_acm_project_member_ex_async(
        self,
        request: dd_models.RemoveAntcloudAcmProjectMemberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.RemoveAntcloudAcmProjectMemberResponse:
        """
        Description: 移除项目成员
        Summary: 移除项目成员
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.RemoveAntcloudAcmProjectMemberResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.project.member.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antcloud_acm_project_user(
        self,
        request: dd_models.QueryAntcloudAcmProjectUserRequest,
    ) -> dd_models.QueryAntcloudAcmProjectUserResponse:
        """
        Description: 查询尚未加入该项目的用户列表
        Summary: 查询尚未加入该项目的用户列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antcloud_acm_project_user_ex(request, headers, runtime)

    async def query_antcloud_acm_project_user_async(
        self,
        request: dd_models.QueryAntcloudAcmProjectUserRequest,
    ) -> dd_models.QueryAntcloudAcmProjectUserResponse:
        """
        Description: 查询尚未加入该项目的用户列表
        Summary: 查询尚未加入该项目的用户列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antcloud_acm_project_user_ex_async(request, headers, runtime)

    def query_antcloud_acm_project_user_ex(
        self,
        request: dd_models.QueryAntcloudAcmProjectUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudAcmProjectUserResponse:
        """
        Description: 查询尚未加入该项目的用户列表
        Summary: 查询尚未加入该项目的用户列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudAcmProjectUserResponse(),
            self.do_request('1.0', 'antcloud.acm.project.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antcloud_acm_project_user_ex_async(
        self,
        request: dd_models.QueryAntcloudAcmProjectUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudAcmProjectUserResponse:
        """
        Description: 查询尚未加入该项目的用户列表
        Summary: 查询尚未加入该项目的用户列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudAcmProjectUserResponse(),
            await self.do_request_async('1.0', 'antcloud.acm.project.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_antcloud_offer_instance(
        self,
        request: dd_models.ListAntcloudOfferInstanceRequest,
    ) -> dd_models.ListAntcloudOfferInstanceResponse:
        """
        Description: 根据租户查询实例列表
        Summary: 根据租户查询实例列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_antcloud_offer_instance_ex(request, headers, runtime)

    async def list_antcloud_offer_instance_async(
        self,
        request: dd_models.ListAntcloudOfferInstanceRequest,
    ) -> dd_models.ListAntcloudOfferInstanceResponse:
        """
        Description: 根据租户查询实例列表
        Summary: 根据租户查询实例列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_antcloud_offer_instance_ex_async(request, headers, runtime)

    def list_antcloud_offer_instance_ex(
        self,
        request: dd_models.ListAntcloudOfferInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ListAntcloudOfferInstanceResponse:
        """
        Description: 根据租户查询实例列表
        Summary: 根据租户查询实例列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ListAntcloudOfferInstanceResponse(),
            self.do_request('1.0', 'antcloud.offer.instance.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_antcloud_offer_instance_ex_async(
        self,
        request: dd_models.ListAntcloudOfferInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ListAntcloudOfferInstanceResponse:
        """
        Description: 根据租户查询实例列表
        Summary: 根据租户查询实例列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ListAntcloudOfferInstanceResponse(),
            await self.do_request_async('1.0', 'antcloud.offer.instance.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_antcloud_billing_respackage_count(
        self,
        request: dd_models.ApplyAntcloudBillingRespackageCountRequest,
    ) -> dd_models.ApplyAntcloudBillingRespackageCountResponse:
        """
        Description: 由外部业务系统来调用触发抵扣接口
        Summary: 由外部业务系统来调用触发抵扣接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_antcloud_billing_respackage_count_ex(request, headers, runtime)

    async def apply_antcloud_billing_respackage_count_async(
        self,
        request: dd_models.ApplyAntcloudBillingRespackageCountRequest,
    ) -> dd_models.ApplyAntcloudBillingRespackageCountResponse:
        """
        Description: 由外部业务系统来调用触发抵扣接口
        Summary: 由外部业务系统来调用触发抵扣接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_antcloud_billing_respackage_count_ex_async(request, headers, runtime)

    def apply_antcloud_billing_respackage_count_ex(
        self,
        request: dd_models.ApplyAntcloudBillingRespackageCountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ApplyAntcloudBillingRespackageCountResponse:
        """
        Description: 由外部业务系统来调用触发抵扣接口
        Summary: 由外部业务系统来调用触发抵扣接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ApplyAntcloudBillingRespackageCountResponse(),
            self.do_request('1.0', 'antcloud.billing.respackage.count.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_antcloud_billing_respackage_count_ex_async(
        self,
        request: dd_models.ApplyAntcloudBillingRespackageCountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ApplyAntcloudBillingRespackageCountResponse:
        """
        Description: 由外部业务系统来调用触发抵扣接口
        Summary: 由外部业务系统来调用触发抵扣接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ApplyAntcloudBillingRespackageCountResponse(),
            await self.do_request_async('1.0', 'antcloud.billing.respackage.count.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antcloud_billing_respackage_balance(
        self,
        request: dd_models.QueryAntcloudBillingRespackageBalanceRequest,
    ) -> dd_models.QueryAntcloudBillingRespackageBalanceResponse:
        """
        Description: 根据租户、抵扣的量价商品查询资源包余量
        Summary: 根据租户、抵扣的量价商品查询资源包余量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antcloud_billing_respackage_balance_ex(request, headers, runtime)

    async def query_antcloud_billing_respackage_balance_async(
        self,
        request: dd_models.QueryAntcloudBillingRespackageBalanceRequest,
    ) -> dd_models.QueryAntcloudBillingRespackageBalanceResponse:
        """
        Description: 根据租户、抵扣的量价商品查询资源包余量
        Summary: 根据租户、抵扣的量价商品查询资源包余量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antcloud_billing_respackage_balance_ex_async(request, headers, runtime)

    def query_antcloud_billing_respackage_balance_ex(
        self,
        request: dd_models.QueryAntcloudBillingRespackageBalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudBillingRespackageBalanceResponse:
        """
        Description: 根据租户、抵扣的量价商品查询资源包余量
        Summary: 根据租户、抵扣的量价商品查询资源包余量
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudBillingRespackageBalanceResponse(),
            self.do_request('1.0', 'antcloud.billing.respackage.balance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antcloud_billing_respackage_balance_ex_async(
        self,
        request: dd_models.QueryAntcloudBillingRespackageBalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudBillingRespackageBalanceResponse:
        """
        Description: 根据租户、抵扣的量价商品查询资源包余量
        Summary: 根据租户、抵扣的量价商品查询资源包余量
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudBillingRespackageBalanceResponse(),
            await self.do_request_async('1.0', 'antcloud.billing.respackage.balance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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

    def query_antcloud_marketing_partner_coupon(
        self,
        request: dd_models.QueryAntcloudMarketingPartnerCouponRequest,
    ) -> dd_models.QueryAntcloudMarketingPartnerCouponResponse:
        """
        Description: 查询指定租户指定产品列表可用优惠券
        Summary: 查询指定租户指定产品列表可用优惠券
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antcloud_marketing_partner_coupon_ex(request, headers, runtime)

    async def query_antcloud_marketing_partner_coupon_async(
        self,
        request: dd_models.QueryAntcloudMarketingPartnerCouponRequest,
    ) -> dd_models.QueryAntcloudMarketingPartnerCouponResponse:
        """
        Description: 查询指定租户指定产品列表可用优惠券
        Summary: 查询指定租户指定产品列表可用优惠券
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antcloud_marketing_partner_coupon_ex_async(request, headers, runtime)

    def query_antcloud_marketing_partner_coupon_ex(
        self,
        request: dd_models.QueryAntcloudMarketingPartnerCouponRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudMarketingPartnerCouponResponse:
        """
        Description: 查询指定租户指定产品列表可用优惠券
        Summary: 查询指定租户指定产品列表可用优惠券
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudMarketingPartnerCouponResponse(),
            self.do_request('1.0', 'antcloud.marketing.partner.coupon.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antcloud_marketing_partner_coupon_ex_async(
        self,
        request: dd_models.QueryAntcloudMarketingPartnerCouponRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudMarketingPartnerCouponResponse:
        """
        Description: 查询指定租户指定产品列表可用优惠券
        Summary: 查询指定租户指定产品列表可用优惠券
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudMarketingPartnerCouponResponse(),
            await self.do_request_async('1.0', 'antcloud.marketing.partner.coupon.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_antcloud_marketing_partner_coupontemplate(
        self,
        request: dd_models.ListAntcloudMarketingPartnerCoupontemplateRequest,
    ) -> dd_models.ListAntcloudMarketingPartnerCoupontemplateResponse:
        """
        Description: 用于查询可用的优惠券模板信息
        Summary: 用于查询可用的优惠券模板信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_antcloud_marketing_partner_coupontemplate_ex(request, headers, runtime)

    async def list_antcloud_marketing_partner_coupontemplate_async(
        self,
        request: dd_models.ListAntcloudMarketingPartnerCoupontemplateRequest,
    ) -> dd_models.ListAntcloudMarketingPartnerCoupontemplateResponse:
        """
        Description: 用于查询可用的优惠券模板信息
        Summary: 用于查询可用的优惠券模板信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_antcloud_marketing_partner_coupontemplate_ex_async(request, headers, runtime)

    def list_antcloud_marketing_partner_coupontemplate_ex(
        self,
        request: dd_models.ListAntcloudMarketingPartnerCoupontemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ListAntcloudMarketingPartnerCoupontemplateResponse:
        """
        Description: 用于查询可用的优惠券模板信息
        Summary: 用于查询可用的优惠券模板信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ListAntcloudMarketingPartnerCoupontemplateResponse(),
            self.do_request('1.0', 'antcloud.marketing.partner.coupontemplate.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_antcloud_marketing_partner_coupontemplate_ex_async(
        self,
        request: dd_models.ListAntcloudMarketingPartnerCoupontemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ListAntcloudMarketingPartnerCoupontemplateResponse:
        """
        Description: 用于查询可用的优惠券模板信息
        Summary: 用于查询可用的优惠券模板信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ListAntcloudMarketingPartnerCoupontemplateResponse(),
            await self.do_request_async('1.0', 'antcloud.marketing.partner.coupontemplate.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antcloud_trade_combo_price(
        self,
        request: dd_models.QueryAntcloudTradeComboPriceRequest,
    ) -> dd_models.QueryAntcloudTradeComboPriceResponse:
        """
        Description: 套餐询价接口
        Summary: 套餐询价接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antcloud_trade_combo_price_ex(request, headers, runtime)

    async def query_antcloud_trade_combo_price_async(
        self,
        request: dd_models.QueryAntcloudTradeComboPriceRequest,
    ) -> dd_models.QueryAntcloudTradeComboPriceResponse:
        """
        Description: 套餐询价接口
        Summary: 套餐询价接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antcloud_trade_combo_price_ex_async(request, headers, runtime)

    def query_antcloud_trade_combo_price_ex(
        self,
        request: dd_models.QueryAntcloudTradeComboPriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudTradeComboPriceResponse:
        """
        Description: 套餐询价接口
        Summary: 套餐询价接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudTradeComboPriceResponse(),
            self.do_request('1.0', 'antcloud.trade.combo.price.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antcloud_trade_combo_price_ex_async(
        self,
        request: dd_models.QueryAntcloudTradeComboPriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudTradeComboPriceResponse:
        """
        Description: 套餐询价接口
        Summary: 套餐询价接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudTradeComboPriceResponse(),
            await self.do_request_async('1.0', 'antcloud.trade.combo.price.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pay_antcloud_trade_combo_order(
        self,
        request: dd_models.PayAntcloudTradeComboOrderRequest,
    ) -> dd_models.PayAntcloudTradeComboOrderResponse:
        """
        Description: 套餐订单支付接口
        Summary: 套餐订单支付接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pay_antcloud_trade_combo_order_ex(request, headers, runtime)

    async def pay_antcloud_trade_combo_order_async(
        self,
        request: dd_models.PayAntcloudTradeComboOrderRequest,
    ) -> dd_models.PayAntcloudTradeComboOrderResponse:
        """
        Description: 套餐订单支付接口
        Summary: 套餐订单支付接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pay_antcloud_trade_combo_order_ex_async(request, headers, runtime)

    def pay_antcloud_trade_combo_order_ex(
        self,
        request: dd_models.PayAntcloudTradeComboOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.PayAntcloudTradeComboOrderResponse:
        """
        Description: 套餐订单支付接口
        Summary: 套餐订单支付接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.PayAntcloudTradeComboOrderResponse(),
            self.do_request('1.0', 'antcloud.trade.combo.order.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pay_antcloud_trade_combo_order_ex_async(
        self,
        request: dd_models.PayAntcloudTradeComboOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.PayAntcloudTradeComboOrderResponse:
        """
        Description: 套餐订单支付接口
        Summary: 套餐订单支付接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.PayAntcloudTradeComboOrderResponse(),
            await self.do_request_async('1.0', 'antcloud.trade.combo.order.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antcloud_trade_price(
        self,
        request: dd_models.QueryAntcloudTradePriceRequest,
    ) -> dd_models.QueryAntcloudTradePriceResponse:
        """
        Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
        Summary: 单商品询价接口，支持抵扣优惠券和命中折扣活动
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antcloud_trade_price_ex(request, headers, runtime)

    async def query_antcloud_trade_price_async(
        self,
        request: dd_models.QueryAntcloudTradePriceRequest,
    ) -> dd_models.QueryAntcloudTradePriceResponse:
        """
        Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
        Summary: 单商品询价接口，支持抵扣优惠券和命中折扣活动
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antcloud_trade_price_ex_async(request, headers, runtime)

    def query_antcloud_trade_price_ex(
        self,
        request: dd_models.QueryAntcloudTradePriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudTradePriceResponse:
        """
        Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
        Summary: 单商品询价接口，支持抵扣优惠券和命中折扣活动
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudTradePriceResponse(),
            self.do_request('1.0', 'antcloud.trade.price.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antcloud_trade_price_ex_async(
        self,
        request: dd_models.QueryAntcloudTradePriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudTradePriceResponse:
        """
        Description: 单商品询价接口，支持抵扣优惠券和命中折扣活动
        Summary: 单商品询价接口，支持抵扣优惠券和命中折扣活动
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudTradePriceResponse(),
            await self.do_request_async('1.0', 'antcloud.trade.price.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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

    def get_antcloud_trade_order(
        self,
        request: dd_models.GetAntcloudTradeOrderRequest,
    ) -> dd_models.GetAntcloudTradeOrderResponse:
        """
        Description: 单商品订单履约状态查询
        Summary: 单商品订单履约状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antcloud_trade_order_ex(request, headers, runtime)

    async def get_antcloud_trade_order_async(
        self,
        request: dd_models.GetAntcloudTradeOrderRequest,
    ) -> dd_models.GetAntcloudTradeOrderResponse:
        """
        Description: 单商品订单履约状态查询
        Summary: 单商品订单履约状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antcloud_trade_order_ex_async(request, headers, runtime)

    def get_antcloud_trade_order_ex(
        self,
        request: dd_models.GetAntcloudTradeOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.GetAntcloudTradeOrderResponse:
        """
        Description: 单商品订单履约状态查询
        Summary: 单商品订单履约状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.GetAntcloudTradeOrderResponse(),
            self.do_request('1.0', 'antcloud.trade.order.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antcloud_trade_order_ex_async(
        self,
        request: dd_models.GetAntcloudTradeOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.GetAntcloudTradeOrderResponse:
        """
        Description: 单商品订单履约状态查询
        Summary: 单商品订单履约状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.GetAntcloudTradeOrderResponse(),
            await self.do_request_async('1.0', 'antcloud.trade.order.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def use_antchain_abc_just_test(
        self,
        request: dd_models.UseAntchainAbcJustTestRequest,
    ) -> dd_models.UseAntchainAbcJustTestResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.use_antchain_abc_just_test_ex(request, headers, runtime)

    async def use_antchain_abc_just_test_async(
        self,
        request: dd_models.UseAntchainAbcJustTestRequest,
    ) -> dd_models.UseAntchainAbcJustTestResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.use_antchain_abc_just_test_ex_async(request, headers, runtime)

    def use_antchain_abc_just_test_ex(
        self,
        request: dd_models.UseAntchainAbcJustTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.UseAntchainAbcJustTestResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.UseAntchainAbcJustTestResponse(),
            self.do_request('1.0', 'antchain.abc.just.test.use', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def use_antchain_abc_just_test_ex_async(
        self,
        request: dd_models.UseAntchainAbcJustTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.UseAntchainAbcJustTestResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.UseAntchainAbcJustTestResponse(),
            await self.do_request_async('1.0', 'antchain.abc.just.test.use', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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

    def query_antcloud_invoice_intlconfig_userinfo(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlconfigUserinfoRequest,
    ) -> dd_models.QueryAntcloudInvoiceIntlconfigUserinfoResponse:
        """
        Description: 国际开票场景下查询客户信息
        Summary: 国际开票场景下查询客户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antcloud_invoice_intlconfig_userinfo_ex(request, headers, runtime)

    async def query_antcloud_invoice_intlconfig_userinfo_async(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlconfigUserinfoRequest,
    ) -> dd_models.QueryAntcloudInvoiceIntlconfigUserinfoResponse:
        """
        Description: 国际开票场景下查询客户信息
        Summary: 国际开票场景下查询客户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antcloud_invoice_intlconfig_userinfo_ex_async(request, headers, runtime)

    def query_antcloud_invoice_intlconfig_userinfo_ex(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlconfigUserinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudInvoiceIntlconfigUserinfoResponse:
        """
        Description: 国际开票场景下查询客户信息
        Summary: 国际开票场景下查询客户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudInvoiceIntlconfigUserinfoResponse(),
            self.do_request('1.0', 'antcloud.invoice.intlconfig.userinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antcloud_invoice_intlconfig_userinfo_ex_async(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlconfigUserinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudInvoiceIntlconfigUserinfoResponse:
        """
        Description: 国际开票场景下查询客户信息
        Summary: 国际开票场景下查询客户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudInvoiceIntlconfigUserinfoResponse(),
            await self.do_request_async('1.0', 'antcloud.invoice.intlconfig.userinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antcloud_invoice_intlamount_rcpt(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlamountRcptRequest,
    ) -> dd_models.QueryAntcloudInvoiceIntlamountRcptResponse:
        """
        Description: 国际发票场景果询可开票单据
        Summary: 国际发票场景果询可开票单据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antcloud_invoice_intlamount_rcpt_ex(request, headers, runtime)

    async def query_antcloud_invoice_intlamount_rcpt_async(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlamountRcptRequest,
    ) -> dd_models.QueryAntcloudInvoiceIntlamountRcptResponse:
        """
        Description: 国际发票场景果询可开票单据
        Summary: 国际发票场景果询可开票单据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antcloud_invoice_intlamount_rcpt_ex_async(request, headers, runtime)

    def query_antcloud_invoice_intlamount_rcpt_ex(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlamountRcptRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudInvoiceIntlamountRcptResponse:
        """
        Description: 国际发票场景果询可开票单据
        Summary: 国际发票场景果询可开票单据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudInvoiceIntlamountRcptResponse(),
            self.do_request('1.0', 'antcloud.invoice.intlamount.rcpt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antcloud_invoice_intlamount_rcpt_ex_async(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlamountRcptRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudInvoiceIntlamountRcptResponse:
        """
        Description: 国际发票场景果询可开票单据
        Summary: 国际发票场景果询可开票单据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudInvoiceIntlamountRcptResponse(),
            await self.do_request_async('1.0', 'antcloud.invoice.intlamount.rcpt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antcloud_invoice_intlinvoices_apply(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlinvoicesApplyRequest,
    ) -> dd_models.QueryAntcloudInvoiceIntlinvoicesApplyResponse:
        """
        Description: 国际发票场景下查询开票申请列表
        Summary: 国际发票场景下查询开票申请列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antcloud_invoice_intlinvoices_apply_ex(request, headers, runtime)

    async def query_antcloud_invoice_intlinvoices_apply_async(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlinvoicesApplyRequest,
    ) -> dd_models.QueryAntcloudInvoiceIntlinvoicesApplyResponse:
        """
        Description: 国际发票场景下查询开票申请列表
        Summary: 国际发票场景下查询开票申请列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antcloud_invoice_intlinvoices_apply_ex_async(request, headers, runtime)

    def query_antcloud_invoice_intlinvoices_apply_ex(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlinvoicesApplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudInvoiceIntlinvoicesApplyResponse:
        """
        Description: 国际发票场景下查询开票申请列表
        Summary: 国际发票场景下查询开票申请列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudInvoiceIntlinvoicesApplyResponse(),
            self.do_request('1.0', 'antcloud.invoice.intlinvoices.apply.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antcloud_invoice_intlinvoices_apply_ex_async(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlinvoicesApplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudInvoiceIntlinvoicesApplyResponse:
        """
        Description: 国际发票场景下查询开票申请列表
        Summary: 国际发票场景下查询开票申请列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudInvoiceIntlinvoicesApplyResponse(),
            await self.do_request_async('1.0', 'antcloud.invoice.intlinvoices.apply.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antcloud_invoice_intlinvoices_fileurl(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlinvoicesFileurlRequest,
    ) -> dd_models.QueryAntcloudInvoiceIntlinvoicesFileurlResponse:
        """
        Description: 根据业务号和发票ID获取国际发票文件下载地址
        Summary: 根据业务号和发票ID获取国际发票文件下载地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antcloud_invoice_intlinvoices_fileurl_ex(request, headers, runtime)

    async def query_antcloud_invoice_intlinvoices_fileurl_async(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlinvoicesFileurlRequest,
    ) -> dd_models.QueryAntcloudInvoiceIntlinvoicesFileurlResponse:
        """
        Description: 根据业务号和发票ID获取国际发票文件下载地址
        Summary: 根据业务号和发票ID获取国际发票文件下载地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antcloud_invoice_intlinvoices_fileurl_ex_async(request, headers, runtime)

    def query_antcloud_invoice_intlinvoices_fileurl_ex(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlinvoicesFileurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudInvoiceIntlinvoicesFileurlResponse:
        """
        Description: 根据业务号和发票ID获取国际发票文件下载地址
        Summary: 根据业务号和发票ID获取国际发票文件下载地址
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudInvoiceIntlinvoicesFileurlResponse(),
            self.do_request('1.0', 'antcloud.invoice.intlinvoices.fileurl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antcloud_invoice_intlinvoices_fileurl_ex_async(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlinvoicesFileurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudInvoiceIntlinvoicesFileurlResponse:
        """
        Description: 根据业务号和发票ID获取国际发票文件下载地址
        Summary: 根据业务号和发票ID获取国际发票文件下载地址
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudInvoiceIntlinvoicesFileurlResponse(),
            await self.do_request_async('1.0', 'antcloud.invoice.intlinvoices.fileurl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_antcloud_invoice_intlinvoices_proformainvoice(
        self,
        request: dd_models.PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest,
    ) -> dd_models.PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse:
        """
        Description: 提交国际形式发票开票申请
        Summary: 提交国际形式发票开票申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_antcloud_invoice_intlinvoices_proformainvoice_ex(request, headers, runtime)

    async def push_antcloud_invoice_intlinvoices_proformainvoice_async(
        self,
        request: dd_models.PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest,
    ) -> dd_models.PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse:
        """
        Description: 提交国际形式发票开票申请
        Summary: 提交国际形式发票开票申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_antcloud_invoice_intlinvoices_proformainvoice_ex_async(request, headers, runtime)

    def push_antcloud_invoice_intlinvoices_proformainvoice_ex(
        self,
        request: dd_models.PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse:
        """
        Description: 提交国际形式发票开票申请
        Summary: 提交国际形式发票开票申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse(),
            self.do_request('1.0', 'antcloud.invoice.intlinvoices.proformainvoice.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_antcloud_invoice_intlinvoices_proformainvoice_ex_async(
        self,
        request: dd_models.PushAntcloudInvoiceIntlinvoicesProformainvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse:
        """
        Description: 提交国际形式发票开票申请
        Summary: 提交国际形式发票开票申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.PushAntcloudInvoiceIntlinvoicesProformainvoiceResponse(),
            await self.do_request_async('1.0', 'antcloud.invoice.intlinvoices.proformainvoice.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antcloud_invoice_intlconfig_allcountrycnen(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest,
    ) -> dd_models.QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse:
        """
        Description: 查询国家代码选择信息
        Summary: 查询国家代码选择信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antcloud_invoice_intlconfig_allcountrycnen_ex(request, headers, runtime)

    async def query_antcloud_invoice_intlconfig_allcountrycnen_async(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest,
    ) -> dd_models.QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse:
        """
        Description: 查询国家代码选择信息
        Summary: 查询国家代码选择信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antcloud_invoice_intlconfig_allcountrycnen_ex_async(request, headers, runtime)

    def query_antcloud_invoice_intlconfig_allcountrycnen_ex(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse:
        """
        Description: 查询国家代码选择信息
        Summary: 查询国家代码选择信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse(),
            self.do_request('1.0', 'antcloud.invoice.intlconfig.allcountrycnen.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antcloud_invoice_intlconfig_allcountrycnen_ex_async(
        self,
        request: dd_models.QueryAntcloudInvoiceIntlconfigAllcountrycnenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse:
        """
        Description: 查询国家代码选择信息
        Summary: 查询国家代码选择信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudInvoiceIntlconfigAllcountrycnenResponse(),
            await self.do_request_async('1.0', 'antcloud.invoice.intlconfig.allcountrycnen.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apia_antdigital_testliuyzp_cli_create(
        self,
        request: dd_models.ApiaAntdigitalTestliuyzpCliCreateRequest,
    ) -> dd_models.ApiaAntdigitalTestliuyzpCliCreateResponse:
        """
        Description: cli创建测试接口a
        Summary: cli创建测试接口a
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apia_antdigital_testliuyzp_cli_create_ex(request, headers, runtime)

    async def apia_antdigital_testliuyzp_cli_create_async(
        self,
        request: dd_models.ApiaAntdigitalTestliuyzpCliCreateRequest,
    ) -> dd_models.ApiaAntdigitalTestliuyzpCliCreateResponse:
        """
        Description: cli创建测试接口a
        Summary: cli创建测试接口a
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apia_antdigital_testliuyzp_cli_create_ex_async(request, headers, runtime)

    def apia_antdigital_testliuyzp_cli_create_ex(
        self,
        request: dd_models.ApiaAntdigitalTestliuyzpCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ApiaAntdigitalTestliuyzpCliCreateResponse:
        """
        Description: cli创建测试接口a
        Summary: cli创建测试接口a
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ApiaAntdigitalTestliuyzpCliCreateResponse(),
            self.do_request('1.0', 'antdigital.testliuyzp.cli.create.apia', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apia_antdigital_testliuyzp_cli_create_ex_async(
        self,
        request: dd_models.ApiaAntdigitalTestliuyzpCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ApiaAntdigitalTestliuyzpCliCreateResponse:
        """
        Description: cli创建测试接口a
        Summary: cli创建测试接口a
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ApiaAntdigitalTestliuyzpCliCreateResponse(),
            await self.do_request_async('1.0', 'antdigital.testliuyzp.cli.create.apia', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antcloud_demositdevsy_tesx_xxx(
        self,
        request: dd_models.QueryAntcloudDemositdevsyTesxXxxRequest,
    ) -> dd_models.QueryAntcloudDemositdevsyTesxXxxResponse:
        """
        Description: plugin测试编辑接口
        Summary: plugin测试编辑接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antcloud_demositdevsy_tesx_xxx_ex(request, headers, runtime)

    async def query_antcloud_demositdevsy_tesx_xxx_async(
        self,
        request: dd_models.QueryAntcloudDemositdevsyTesxXxxRequest,
    ) -> dd_models.QueryAntcloudDemositdevsyTesxXxxResponse:
        """
        Description: plugin测试编辑接口
        Summary: plugin测试编辑接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antcloud_demositdevsy_tesx_xxx_ex_async(request, headers, runtime)

    def query_antcloud_demositdevsy_tesx_xxx_ex(
        self,
        request: dd_models.QueryAntcloudDemositdevsyTesxXxxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudDemositdevsyTesxXxxResponse:
        """
        Description: plugin测试编辑接口
        Summary: plugin测试编辑接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudDemositdevsyTesxXxxResponse(),
            self.do_request('1.0', 'antcloud.demositdevsy.tesx.xxx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antcloud_demositdevsy_tesx_xxx_ex_async(
        self,
        request: dd_models.QueryAntcloudDemositdevsyTesxXxxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.QueryAntcloudDemositdevsyTesxXxxResponse:
        """
        Description: plugin测试编辑接口
        Summary: plugin测试编辑接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.QueryAntcloudDemositdevsyTesxXxxResponse(),
            await self.do_request_async('1.0', 'antcloud.demositdevsy.tesx.xxx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apia_antcloud_demositdevsy_cli_create(
        self,
        request: dd_models.ApiaAntcloudDemositdevsyCliCreateRequest,
    ) -> dd_models.ApiaAntcloudDemositdevsyCliCreateResponse:
        """
        Description: cli创建测试接口a
        Summary: cli创建测试接口a
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apia_antcloud_demositdevsy_cli_create_ex(request, headers, runtime)

    async def apia_antcloud_demositdevsy_cli_create_async(
        self,
        request: dd_models.ApiaAntcloudDemositdevsyCliCreateRequest,
    ) -> dd_models.ApiaAntcloudDemositdevsyCliCreateResponse:
        """
        Description: cli创建测试接口a
        Summary: cli创建测试接口a
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apia_antcloud_demositdevsy_cli_create_ex_async(request, headers, runtime)

    def apia_antcloud_demositdevsy_cli_create_ex(
        self,
        request: dd_models.ApiaAntcloudDemositdevsyCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ApiaAntcloudDemositdevsyCliCreateResponse:
        """
        Description: cli创建测试接口a
        Summary: cli创建测试接口a
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ApiaAntcloudDemositdevsyCliCreateResponse(),
            self.do_request('1.0', 'antcloud.demositdevsy.cli.create.apia', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apia_antcloud_demositdevsy_cli_create_ex_async(
        self,
        request: dd_models.ApiaAntcloudDemositdevsyCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ApiaAntcloudDemositdevsyCliCreateResponse:
        """
        Description: cli创建测试接口a
        Summary: cli创建测试接口a
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ApiaAntcloudDemositdevsyCliCreateResponse(),
            await self.do_request_async('1.0', 'antcloud.demositdevsy.cli.create.apia', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apia_antcloud_workbenchphaseiia_cli_create(
        self,
        request: dd_models.ApiaAntcloudWorkbenchphaseiiaCliCreateRequest,
    ) -> dd_models.ApiaAntcloudWorkbenchphaseiiaCliCreateResponse:
        """
        Description: gatewat-plugin创建接口a
        Summary: gatewat-plugin创建接口a
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apia_antcloud_workbenchphaseiia_cli_create_ex(request, headers, runtime)

    async def apia_antcloud_workbenchphaseiia_cli_create_async(
        self,
        request: dd_models.ApiaAntcloudWorkbenchphaseiiaCliCreateRequest,
    ) -> dd_models.ApiaAntcloudWorkbenchphaseiiaCliCreateResponse:
        """
        Description: gatewat-plugin创建接口a
        Summary: gatewat-plugin创建接口a
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apia_antcloud_workbenchphaseiia_cli_create_ex_async(request, headers, runtime)

    def apia_antcloud_workbenchphaseiia_cli_create_ex(
        self,
        request: dd_models.ApiaAntcloudWorkbenchphaseiiaCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ApiaAntcloudWorkbenchphaseiiaCliCreateResponse:
        """
        Description: gatewat-plugin创建接口a
        Summary: gatewat-plugin创建接口a
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = dd_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antcloud.workbenchphaseiia.cli.create.apia',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                apia_antcloud_workbenchphaseiia_cli_create_response = dd_models.ApiaAntcloudWorkbenchphaseiiaCliCreateResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return apia_antcloud_workbenchphaseiia_cli_create_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ApiaAntcloudWorkbenchphaseiiaCliCreateResponse(),
            self.do_request('1.0', 'antcloud.workbenchphaseiia.cli.create.apia', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apia_antcloud_workbenchphaseiia_cli_create_ex_async(
        self,
        request: dd_models.ApiaAntcloudWorkbenchphaseiiaCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ApiaAntcloudWorkbenchphaseiiaCliCreateResponse:
        """
        Description: gatewat-plugin创建接口a
        Summary: gatewat-plugin创建接口a
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = dd_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antcloud.workbenchphaseiia.cli.create.apia',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                apia_antcloud_workbenchphaseiia_cli_create_response = dd_models.ApiaAntcloudWorkbenchphaseiiaCliCreateResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return apia_antcloud_workbenchphaseiia_cli_create_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ApiaAntcloudWorkbenchphaseiiaCliCreateResponse(),
            await self.do_request_async('1.0', 'antcloud.workbenchphaseiia.cli.create.apia', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apib_antcloud_workbenchphaseiia_cli_create(
        self,
        request: dd_models.ApibAntcloudWorkbenchphaseiiaCliCreateRequest,
    ) -> dd_models.ApibAntcloudWorkbenchphaseiiaCliCreateResponse:
        """
        Description: gateway-plugin创建接口b
        Summary: gateway-plugin创建接口b
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apib_antcloud_workbenchphaseiia_cli_create_ex(request, headers, runtime)

    async def apib_antcloud_workbenchphaseiia_cli_create_async(
        self,
        request: dd_models.ApibAntcloudWorkbenchphaseiiaCliCreateRequest,
    ) -> dd_models.ApibAntcloudWorkbenchphaseiiaCliCreateResponse:
        """
        Description: gateway-plugin创建接口b
        Summary: gateway-plugin创建接口b
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apib_antcloud_workbenchphaseiia_cli_create_ex_async(request, headers, runtime)

    def apib_antcloud_workbenchphaseiia_cli_create_ex(
        self,
        request: dd_models.ApibAntcloudWorkbenchphaseiiaCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ApibAntcloudWorkbenchphaseiiaCliCreateResponse:
        """
        Description: gateway-plugin创建接口b
        Summary: gateway-plugin创建接口b
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = dd_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antcloud.workbenchphaseiia.cli.create.apib',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                apib_antcloud_workbenchphaseiia_cli_create_response = dd_models.ApibAntcloudWorkbenchphaseiiaCliCreateResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return apib_antcloud_workbenchphaseiia_cli_create_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ApibAntcloudWorkbenchphaseiiaCliCreateResponse(),
            self.do_request('1.0', 'antcloud.workbenchphaseiia.cli.create.apib', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apib_antcloud_workbenchphaseiia_cli_create_ex_async(
        self,
        request: dd_models.ApibAntcloudWorkbenchphaseiiaCliCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.ApibAntcloudWorkbenchphaseiiaCliCreateResponse:
        """
        Description: gateway-plugin创建接口b
        Summary: gateway-plugin创建接口b
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = dd_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antcloud.workbenchphaseiia.cli.create.apib',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                apib_antcloud_workbenchphaseiia_cli_create_response = dd_models.ApibAntcloudWorkbenchphaseiiaCliCreateResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return apib_antcloud_workbenchphaseiia_cli_create_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.ApibAntcloudWorkbenchphaseiiaCliCreateResponse(),
            await self.do_request_async('1.0', 'antcloud.workbenchphaseiia.cli.create.apib', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: dd_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> dd_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: dd_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> dd_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: dd_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: dd_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> dd_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            dd_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
