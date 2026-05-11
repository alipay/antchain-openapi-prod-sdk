# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_jzqproducta import models as jzqproducta_models
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
        config: jzqproducta_models.Config,
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
                    'sdk_version': '1.0.1',
                    '_prod_code': 'JZQPRODUCTA',
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
                    'sdk_version': '1.0.1',
                    '_prod_code': 'JZQPRODUCTA',
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

    def test_demo(
        self,
        request: jzqproducta_models.TestDemoRequest,
    ) -> jzqproducta_models.TestDemoResponse:
        """
        Description: 1
        Summary: 1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.test_demo_ex(request, headers, runtime)

    async def test_demo_async(
        self,
        request: jzqproducta_models.TestDemoRequest,
    ) -> jzqproducta_models.TestDemoResponse:
        """
        Description: 1
        Summary: 1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.test_demo_ex_async(request, headers, runtime)

    def test_demo_ex(
        self,
        request: jzqproducta_models.TestDemoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.TestDemoResponse:
        """
        Description: 1
        Summary: 1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.TestDemoResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.demo.test', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def test_demo_ex_async(
        self,
        request: jzqproducta_models.TestDemoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.TestDemoResponse:
        """
        Description: 1
        Summary: 1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.TestDemoResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.demo.test', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def api_withdraw(
        self,
        request: jzqproducta_models.ApiWithdrawRequest,
    ) -> jzqproducta_models.ApiWithdrawResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.api_withdraw_ex(request, headers, runtime)

    async def api_withdraw_async(
        self,
        request: jzqproducta_models.ApiWithdrawRequest,
    ) -> jzqproducta_models.ApiWithdrawResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.api_withdraw_ex_async(request, headers, runtime)

    def api_withdraw_ex(
        self,
        request: jzqproducta_models.ApiWithdrawRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.ApiWithdrawResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.ApiWithdrawResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.withdraw.api', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def api_withdraw_ex_async(
        self,
        request: jzqproducta_models.ApiWithdrawRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.ApiWithdrawResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.ApiWithdrawResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.withdraw.api', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_test(
        self,
        request: jzqproducta_models.QueryPreformanceTestRequest,
    ) -> jzqproducta_models.QueryPreformanceTestResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_test_ex(request, headers, runtime)

    async def query_preformance_test_async(
        self,
        request: jzqproducta_models.QueryPreformanceTestRequest,
    ) -> jzqproducta_models.QueryPreformanceTestResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_test_ex_async(request, headers, runtime)

    def query_preformance_test_ex(
        self,
        request: jzqproducta_models.QueryPreformanceTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTestResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTestResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_test_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTestResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTestResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_onjgra(
        self,
        request: jzqproducta_models.QueryPreformanceOnjgraRequest,
    ) -> jzqproducta_models.QueryPreformanceOnjgraResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_onjgra_ex(request, headers, runtime)

    async def query_preformance_onjgra_async(
        self,
        request: jzqproducta_models.QueryPreformanceOnjgraRequest,
    ) -> jzqproducta_models.QueryPreformanceOnjgraResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_onjgra_ex_async(request, headers, runtime)

    def query_preformance_onjgra_ex(
        self,
        request: jzqproducta_models.QueryPreformanceOnjgraRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceOnjgraResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceOnjgraResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.onjgra.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_onjgra_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceOnjgraRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceOnjgraResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceOnjgraResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.onjgra.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_cgsccz(
        self,
        request: jzqproducta_models.QueryPreformanceCgscczRequest,
    ) -> jzqproducta_models.QueryPreformanceCgscczResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_cgsccz_ex(request, headers, runtime)

    async def query_preformance_cgsccz_async(
        self,
        request: jzqproducta_models.QueryPreformanceCgscczRequest,
    ) -> jzqproducta_models.QueryPreformanceCgscczResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_cgsccz_ex_async(request, headers, runtime)

    def query_preformance_cgsccz_ex(
        self,
        request: jzqproducta_models.QueryPreformanceCgscczRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceCgscczResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceCgscczResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.cgsccz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_cgsccz_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceCgscczRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceCgscczResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceCgscczResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.cgsccz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ryhdhn(
        self,
        request: jzqproducta_models.QueryPreformanceRyhdhnRequest,
    ) -> jzqproducta_models.QueryPreformanceRyhdhnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ryhdhn_ex(request, headers, runtime)

    async def query_preformance_ryhdhn_async(
        self,
        request: jzqproducta_models.QueryPreformanceRyhdhnRequest,
    ) -> jzqproducta_models.QueryPreformanceRyhdhnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ryhdhn_ex_async(request, headers, runtime)

    def query_preformance_ryhdhn_ex(
        self,
        request: jzqproducta_models.QueryPreformanceRyhdhnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceRyhdhnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceRyhdhnResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ryhdhn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ryhdhn_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceRyhdhnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceRyhdhnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceRyhdhnResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ryhdhn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_qcbsze(
        self,
        request: jzqproducta_models.QueryPreformanceQcbszeRequest,
    ) -> jzqproducta_models.QueryPreformanceQcbszeResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_qcbsze_ex(request, headers, runtime)

    async def query_preformance_qcbsze_async(
        self,
        request: jzqproducta_models.QueryPreformanceQcbszeRequest,
    ) -> jzqproducta_models.QueryPreformanceQcbszeResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_qcbsze_ex_async(request, headers, runtime)

    def query_preformance_qcbsze_ex(
        self,
        request: jzqproducta_models.QueryPreformanceQcbszeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQcbszeResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQcbszeResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.qcbsze.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_qcbsze_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceQcbszeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQcbszeResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQcbszeResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.qcbsze.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_scilwt(
        self,
        request: jzqproducta_models.QueryPreformanceScilwtRequest,
    ) -> jzqproducta_models.QueryPreformanceScilwtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_scilwt_ex(request, headers, runtime)

    async def query_preformance_scilwt_async(
        self,
        request: jzqproducta_models.QueryPreformanceScilwtRequest,
    ) -> jzqproducta_models.QueryPreformanceScilwtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_scilwt_ex_async(request, headers, runtime)

    def query_preformance_scilwt_ex(
        self,
        request: jzqproducta_models.QueryPreformanceScilwtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceScilwtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceScilwtResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.scilwt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_scilwt_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceScilwtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceScilwtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceScilwtResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.scilwt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_zdsrec(
        self,
        request: jzqproducta_models.QueryPreformanceZdsrecRequest,
    ) -> jzqproducta_models.QueryPreformanceZdsrecResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_zdsrec_ex(request, headers, runtime)

    async def query_preformance_zdsrec_async(
        self,
        request: jzqproducta_models.QueryPreformanceZdsrecRequest,
    ) -> jzqproducta_models.QueryPreformanceZdsrecResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_zdsrec_ex_async(request, headers, runtime)

    def query_preformance_zdsrec_ex(
        self,
        request: jzqproducta_models.QueryPreformanceZdsrecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZdsrecResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZdsrecResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.zdsrec.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_zdsrec_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceZdsrecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZdsrecResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZdsrecResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.zdsrec.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_iezhuc(
        self,
        request: jzqproducta_models.QueryPreformanceIezhucRequest,
    ) -> jzqproducta_models.QueryPreformanceIezhucResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_iezhuc_ex(request, headers, runtime)

    async def query_preformance_iezhuc_async(
        self,
        request: jzqproducta_models.QueryPreformanceIezhucRequest,
    ) -> jzqproducta_models.QueryPreformanceIezhucResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_iezhuc_ex_async(request, headers, runtime)

    def query_preformance_iezhuc_ex(
        self,
        request: jzqproducta_models.QueryPreformanceIezhucRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIezhucResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIezhucResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.iezhuc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_iezhuc_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceIezhucRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIezhucResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIezhucResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.iezhuc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_xjdezp(
        self,
        request: jzqproducta_models.QueryPreformanceXjdezpRequest,
    ) -> jzqproducta_models.QueryPreformanceXjdezpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_xjdezp_ex(request, headers, runtime)

    async def query_preformance_xjdezp_async(
        self,
        request: jzqproducta_models.QueryPreformanceXjdezpRequest,
    ) -> jzqproducta_models.QueryPreformanceXjdezpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_xjdezp_ex_async(request, headers, runtime)

    def query_preformance_xjdezp_ex(
        self,
        request: jzqproducta_models.QueryPreformanceXjdezpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXjdezpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXjdezpResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.xjdezp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_xjdezp_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceXjdezpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXjdezpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXjdezpResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.xjdezp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_djuoin(
        self,
        request: jzqproducta_models.QueryPreformanceDjuoinRequest,
    ) -> jzqproducta_models.QueryPreformanceDjuoinResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_djuoin_ex(request, headers, runtime)

    async def query_preformance_djuoin_async(
        self,
        request: jzqproducta_models.QueryPreformanceDjuoinRequest,
    ) -> jzqproducta_models.QueryPreformanceDjuoinResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_djuoin_ex_async(request, headers, runtime)

    def query_preformance_djuoin_ex(
        self,
        request: jzqproducta_models.QueryPreformanceDjuoinRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDjuoinResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDjuoinResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.djuoin.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_djuoin_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceDjuoinRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDjuoinResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDjuoinResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.djuoin.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_bagemg(
        self,
        request: jzqproducta_models.QueryPreformanceBagemgRequest,
    ) -> jzqproducta_models.QueryPreformanceBagemgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_bagemg_ex(request, headers, runtime)

    async def query_preformance_bagemg_async(
        self,
        request: jzqproducta_models.QueryPreformanceBagemgRequest,
    ) -> jzqproducta_models.QueryPreformanceBagemgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_bagemg_ex_async(request, headers, runtime)

    def query_preformance_bagemg_ex(
        self,
        request: jzqproducta_models.QueryPreformanceBagemgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceBagemgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceBagemgResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.bagemg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_bagemg_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceBagemgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceBagemgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceBagemgResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.bagemg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_dpvzbt(
        self,
        request: jzqproducta_models.QueryPreformanceDpvzbtRequest,
    ) -> jzqproducta_models.QueryPreformanceDpvzbtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_dpvzbt_ex(request, headers, runtime)

    async def query_preformance_dpvzbt_async(
        self,
        request: jzqproducta_models.QueryPreformanceDpvzbtRequest,
    ) -> jzqproducta_models.QueryPreformanceDpvzbtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_dpvzbt_ex_async(request, headers, runtime)

    def query_preformance_dpvzbt_ex(
        self,
        request: jzqproducta_models.QueryPreformanceDpvzbtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDpvzbtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDpvzbtResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.dpvzbt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_dpvzbt_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceDpvzbtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDpvzbtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDpvzbtResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.dpvzbt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_gziwau(
        self,
        request: jzqproducta_models.QueryPreformanceGziwauRequest,
    ) -> jzqproducta_models.QueryPreformanceGziwauResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_gziwau_ex(request, headers, runtime)

    async def query_preformance_gziwau_async(
        self,
        request: jzqproducta_models.QueryPreformanceGziwauRequest,
    ) -> jzqproducta_models.QueryPreformanceGziwauResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_gziwau_ex_async(request, headers, runtime)

    def query_preformance_gziwau_ex(
        self,
        request: jzqproducta_models.QueryPreformanceGziwauRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGziwauResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGziwauResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.gziwau.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_gziwau_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceGziwauRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGziwauResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGziwauResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.gziwau.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_vhpywu(
        self,
        request: jzqproducta_models.QueryPreformanceVhpywuRequest,
    ) -> jzqproducta_models.QueryPreformanceVhpywuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_vhpywu_ex(request, headers, runtime)

    async def query_preformance_vhpywu_async(
        self,
        request: jzqproducta_models.QueryPreformanceVhpywuRequest,
    ) -> jzqproducta_models.QueryPreformanceVhpywuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_vhpywu_ex_async(request, headers, runtime)

    def query_preformance_vhpywu_ex(
        self,
        request: jzqproducta_models.QueryPreformanceVhpywuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVhpywuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVhpywuResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.vhpywu.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_vhpywu_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceVhpywuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVhpywuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVhpywuResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.vhpywu.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_jsulht(
        self,
        request: jzqproducta_models.QueryPreformanceJsulhtRequest,
    ) -> jzqproducta_models.QueryPreformanceJsulhtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_jsulht_ex(request, headers, runtime)

    async def query_preformance_jsulht_async(
        self,
        request: jzqproducta_models.QueryPreformanceJsulhtRequest,
    ) -> jzqproducta_models.QueryPreformanceJsulhtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_jsulht_ex_async(request, headers, runtime)

    def query_preformance_jsulht_ex(
        self,
        request: jzqproducta_models.QueryPreformanceJsulhtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJsulhtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJsulhtResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.jsulht.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_jsulht_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceJsulhtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJsulhtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJsulhtResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.jsulht.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ivcypl(
        self,
        request: jzqproducta_models.QueryPreformanceIvcyplRequest,
    ) -> jzqproducta_models.QueryPreformanceIvcyplResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ivcypl_ex(request, headers, runtime)

    async def query_preformance_ivcypl_async(
        self,
        request: jzqproducta_models.QueryPreformanceIvcyplRequest,
    ) -> jzqproducta_models.QueryPreformanceIvcyplResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ivcypl_ex_async(request, headers, runtime)

    def query_preformance_ivcypl_ex(
        self,
        request: jzqproducta_models.QueryPreformanceIvcyplRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIvcyplResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIvcyplResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ivcypl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ivcypl_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceIvcyplRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIvcyplResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIvcyplResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ivcypl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_gmylkm(
        self,
        request: jzqproducta_models.QueryPreformanceGmylkmRequest,
    ) -> jzqproducta_models.QueryPreformanceGmylkmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_gmylkm_ex(request, headers, runtime)

    async def query_preformance_gmylkm_async(
        self,
        request: jzqproducta_models.QueryPreformanceGmylkmRequest,
    ) -> jzqproducta_models.QueryPreformanceGmylkmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_gmylkm_ex_async(request, headers, runtime)

    def query_preformance_gmylkm_ex(
        self,
        request: jzqproducta_models.QueryPreformanceGmylkmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGmylkmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGmylkmResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.gmylkm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_gmylkm_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceGmylkmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGmylkmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGmylkmResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.gmylkm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ycdqlt(
        self,
        request: jzqproducta_models.QueryPreformanceYcdqltRequest,
    ) -> jzqproducta_models.QueryPreformanceYcdqltResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ycdqlt_ex(request, headers, runtime)

    async def query_preformance_ycdqlt_async(
        self,
        request: jzqproducta_models.QueryPreformanceYcdqltRequest,
    ) -> jzqproducta_models.QueryPreformanceYcdqltResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ycdqlt_ex_async(request, headers, runtime)

    def query_preformance_ycdqlt_ex(
        self,
        request: jzqproducta_models.QueryPreformanceYcdqltRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYcdqltResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYcdqltResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ycdqlt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ycdqlt_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceYcdqltRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYcdqltResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYcdqltResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ycdqlt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_tmspnc(
        self,
        request: jzqproducta_models.QueryPreformanceTmspncRequest,
    ) -> jzqproducta_models.QueryPreformanceTmspncResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_tmspnc_ex(request, headers, runtime)

    async def query_preformance_tmspnc_async(
        self,
        request: jzqproducta_models.QueryPreformanceTmspncRequest,
    ) -> jzqproducta_models.QueryPreformanceTmspncResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_tmspnc_ex_async(request, headers, runtime)

    def query_preformance_tmspnc_ex(
        self,
        request: jzqproducta_models.QueryPreformanceTmspncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTmspncResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTmspncResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.tmspnc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_tmspnc_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceTmspncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTmspncResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTmspncResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.tmspnc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_sghpbd(
        self,
        request: jzqproducta_models.QueryPreformanceSghpbdRequest,
    ) -> jzqproducta_models.QueryPreformanceSghpbdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_sghpbd_ex(request, headers, runtime)

    async def query_preformance_sghpbd_async(
        self,
        request: jzqproducta_models.QueryPreformanceSghpbdRequest,
    ) -> jzqproducta_models.QueryPreformanceSghpbdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_sghpbd_ex_async(request, headers, runtime)

    def query_preformance_sghpbd_ex(
        self,
        request: jzqproducta_models.QueryPreformanceSghpbdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSghpbdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSghpbdResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.sghpbd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_sghpbd_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceSghpbdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSghpbdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSghpbdResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.sghpbd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_rhuirb(
        self,
        request: jzqproducta_models.QueryPreformanceRhuirbRequest,
    ) -> jzqproducta_models.QueryPreformanceRhuirbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_rhuirb_ex(request, headers, runtime)

    async def query_preformance_rhuirb_async(
        self,
        request: jzqproducta_models.QueryPreformanceRhuirbRequest,
    ) -> jzqproducta_models.QueryPreformanceRhuirbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_rhuirb_ex_async(request, headers, runtime)

    def query_preformance_rhuirb_ex(
        self,
        request: jzqproducta_models.QueryPreformanceRhuirbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceRhuirbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceRhuirbResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.rhuirb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_rhuirb_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceRhuirbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceRhuirbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceRhuirbResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.rhuirb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_zcvaea(
        self,
        request: jzqproducta_models.QueryPreformanceZcvaeaRequest,
    ) -> jzqproducta_models.QueryPreformanceZcvaeaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_zcvaea_ex(request, headers, runtime)

    async def query_preformance_zcvaea_async(
        self,
        request: jzqproducta_models.QueryPreformanceZcvaeaRequest,
    ) -> jzqproducta_models.QueryPreformanceZcvaeaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_zcvaea_ex_async(request, headers, runtime)

    def query_preformance_zcvaea_ex(
        self,
        request: jzqproducta_models.QueryPreformanceZcvaeaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZcvaeaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZcvaeaResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.zcvaea.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_zcvaea_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceZcvaeaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZcvaeaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZcvaeaResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.zcvaea.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ghohid(
        self,
        request: jzqproducta_models.QueryPreformanceGhohidRequest,
    ) -> jzqproducta_models.QueryPreformanceGhohidResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ghohid_ex(request, headers, runtime)

    async def query_preformance_ghohid_async(
        self,
        request: jzqproducta_models.QueryPreformanceGhohidRequest,
    ) -> jzqproducta_models.QueryPreformanceGhohidResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ghohid_ex_async(request, headers, runtime)

    def query_preformance_ghohid_ex(
        self,
        request: jzqproducta_models.QueryPreformanceGhohidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGhohidResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGhohidResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ghohid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ghohid_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceGhohidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGhohidResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGhohidResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ghohid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_mcxrxm(
        self,
        request: jzqproducta_models.QueryPreformanceMcxrxmRequest,
    ) -> jzqproducta_models.QueryPreformanceMcxrxmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_mcxrxm_ex(request, headers, runtime)

    async def query_preformance_mcxrxm_async(
        self,
        request: jzqproducta_models.QueryPreformanceMcxrxmRequest,
    ) -> jzqproducta_models.QueryPreformanceMcxrxmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_mcxrxm_ex_async(request, headers, runtime)

    def query_preformance_mcxrxm_ex(
        self,
        request: jzqproducta_models.QueryPreformanceMcxrxmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMcxrxmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMcxrxmResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.mcxrxm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_mcxrxm_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceMcxrxmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMcxrxmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMcxrxmResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.mcxrxm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ydbeoz(
        self,
        request: jzqproducta_models.QueryPreformanceYdbeozRequest,
    ) -> jzqproducta_models.QueryPreformanceYdbeozResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ydbeoz_ex(request, headers, runtime)

    async def query_preformance_ydbeoz_async(
        self,
        request: jzqproducta_models.QueryPreformanceYdbeozRequest,
    ) -> jzqproducta_models.QueryPreformanceYdbeozResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ydbeoz_ex_async(request, headers, runtime)

    def query_preformance_ydbeoz_ex(
        self,
        request: jzqproducta_models.QueryPreformanceYdbeozRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYdbeozResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYdbeozResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ydbeoz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ydbeoz_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceYdbeozRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYdbeozResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYdbeozResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ydbeoz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_gqiyjt(
        self,
        request: jzqproducta_models.QueryPreformanceGqiyjtRequest,
    ) -> jzqproducta_models.QueryPreformanceGqiyjtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_gqiyjt_ex(request, headers, runtime)

    async def query_preformance_gqiyjt_async(
        self,
        request: jzqproducta_models.QueryPreformanceGqiyjtRequest,
    ) -> jzqproducta_models.QueryPreformanceGqiyjtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_gqiyjt_ex_async(request, headers, runtime)

    def query_preformance_gqiyjt_ex(
        self,
        request: jzqproducta_models.QueryPreformanceGqiyjtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGqiyjtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGqiyjtResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.gqiyjt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_gqiyjt_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceGqiyjtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGqiyjtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGqiyjtResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.gqiyjt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_flmtje(
        self,
        request: jzqproducta_models.QueryPreformanceFlmtjeRequest,
    ) -> jzqproducta_models.QueryPreformanceFlmtjeResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_flmtje_ex(request, headers, runtime)

    async def query_preformance_flmtje_async(
        self,
        request: jzqproducta_models.QueryPreformanceFlmtjeRequest,
    ) -> jzqproducta_models.QueryPreformanceFlmtjeResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_flmtje_ex_async(request, headers, runtime)

    def query_preformance_flmtje_ex(
        self,
        request: jzqproducta_models.QueryPreformanceFlmtjeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFlmtjeResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFlmtjeResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.flmtje.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_flmtje_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceFlmtjeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFlmtjeResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFlmtjeResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.flmtje.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ihmckr(
        self,
        request: jzqproducta_models.QueryPreformanceIhmckrRequest,
    ) -> jzqproducta_models.QueryPreformanceIhmckrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ihmckr_ex(request, headers, runtime)

    async def query_preformance_ihmckr_async(
        self,
        request: jzqproducta_models.QueryPreformanceIhmckrRequest,
    ) -> jzqproducta_models.QueryPreformanceIhmckrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ihmckr_ex_async(request, headers, runtime)

    def query_preformance_ihmckr_ex(
        self,
        request: jzqproducta_models.QueryPreformanceIhmckrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIhmckrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIhmckrResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ihmckr.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ihmckr_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceIhmckrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIhmckrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIhmckrResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ihmckr.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_vuhkyn(
        self,
        request: jzqproducta_models.QueryPreformanceVuhkynRequest,
    ) -> jzqproducta_models.QueryPreformanceVuhkynResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_vuhkyn_ex(request, headers, runtime)

    async def query_preformance_vuhkyn_async(
        self,
        request: jzqproducta_models.QueryPreformanceVuhkynRequest,
    ) -> jzqproducta_models.QueryPreformanceVuhkynResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_vuhkyn_ex_async(request, headers, runtime)

    def query_preformance_vuhkyn_ex(
        self,
        request: jzqproducta_models.QueryPreformanceVuhkynRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVuhkynResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVuhkynResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.vuhkyn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_vuhkyn_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceVuhkynRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVuhkynResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVuhkynResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.vuhkyn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_cdyiuj(
        self,
        request: jzqproducta_models.QueryPreformanceCdyiujRequest,
    ) -> jzqproducta_models.QueryPreformanceCdyiujResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_cdyiuj_ex(request, headers, runtime)

    async def query_preformance_cdyiuj_async(
        self,
        request: jzqproducta_models.QueryPreformanceCdyiujRequest,
    ) -> jzqproducta_models.QueryPreformanceCdyiujResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_cdyiuj_ex_async(request, headers, runtime)

    def query_preformance_cdyiuj_ex(
        self,
        request: jzqproducta_models.QueryPreformanceCdyiujRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceCdyiujResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceCdyiujResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.cdyiuj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_cdyiuj_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceCdyiujRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceCdyiujResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceCdyiujResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.cdyiuj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_qcenzc(
        self,
        request: jzqproducta_models.QueryPreformanceQcenzcRequest,
    ) -> jzqproducta_models.QueryPreformanceQcenzcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_qcenzc_ex(request, headers, runtime)

    async def query_preformance_qcenzc_async(
        self,
        request: jzqproducta_models.QueryPreformanceQcenzcRequest,
    ) -> jzqproducta_models.QueryPreformanceQcenzcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_qcenzc_ex_async(request, headers, runtime)

    def query_preformance_qcenzc_ex(
        self,
        request: jzqproducta_models.QueryPreformanceQcenzcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQcenzcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQcenzcResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.qcenzc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_qcenzc_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceQcenzcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQcenzcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQcenzcResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.qcenzc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_krohvy(
        self,
        request: jzqproducta_models.QueryPreformanceKrohvyRequest,
    ) -> jzqproducta_models.QueryPreformanceKrohvyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_krohvy_ex(request, headers, runtime)

    async def query_preformance_krohvy_async(
        self,
        request: jzqproducta_models.QueryPreformanceKrohvyRequest,
    ) -> jzqproducta_models.QueryPreformanceKrohvyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_krohvy_ex_async(request, headers, runtime)

    def query_preformance_krohvy_ex(
        self,
        request: jzqproducta_models.QueryPreformanceKrohvyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKrohvyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKrohvyResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.krohvy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_krohvy_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceKrohvyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKrohvyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKrohvyResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.krohvy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_npyznv(
        self,
        request: jzqproducta_models.QueryPreformanceNpyznvRequest,
    ) -> jzqproducta_models.QueryPreformanceNpyznvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_npyznv_ex(request, headers, runtime)

    async def query_preformance_npyznv_async(
        self,
        request: jzqproducta_models.QueryPreformanceNpyznvRequest,
    ) -> jzqproducta_models.QueryPreformanceNpyznvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_npyznv_ex_async(request, headers, runtime)

    def query_preformance_npyznv_ex(
        self,
        request: jzqproducta_models.QueryPreformanceNpyznvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceNpyznvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceNpyznvResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.npyznv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_npyznv_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceNpyznvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceNpyznvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceNpyznvResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.npyznv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_lqbvkm(
        self,
        request: jzqproducta_models.QueryPreformanceLqbvkmRequest,
    ) -> jzqproducta_models.QueryPreformanceLqbvkmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_lqbvkm_ex(request, headers, runtime)

    async def query_preformance_lqbvkm_async(
        self,
        request: jzqproducta_models.QueryPreformanceLqbvkmRequest,
    ) -> jzqproducta_models.QueryPreformanceLqbvkmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_lqbvkm_ex_async(request, headers, runtime)

    def query_preformance_lqbvkm_ex(
        self,
        request: jzqproducta_models.QueryPreformanceLqbvkmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLqbvkmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLqbvkmResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.lqbvkm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_lqbvkm_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceLqbvkmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLqbvkmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLqbvkmResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.lqbvkm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_fjxvfj(
        self,
        request: jzqproducta_models.QueryPreformanceFjxvfjRequest,
    ) -> jzqproducta_models.QueryPreformanceFjxvfjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_fjxvfj_ex(request, headers, runtime)

    async def query_preformance_fjxvfj_async(
        self,
        request: jzqproducta_models.QueryPreformanceFjxvfjRequest,
    ) -> jzqproducta_models.QueryPreformanceFjxvfjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_fjxvfj_ex_async(request, headers, runtime)

    def query_preformance_fjxvfj_ex(
        self,
        request: jzqproducta_models.QueryPreformanceFjxvfjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFjxvfjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFjxvfjResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.fjxvfj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_fjxvfj_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceFjxvfjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFjxvfjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFjxvfjResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.fjxvfj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_eqoghc(
        self,
        request: jzqproducta_models.QueryPreformanceEqoghcRequest,
    ) -> jzqproducta_models.QueryPreformanceEqoghcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_eqoghc_ex(request, headers, runtime)

    async def query_preformance_eqoghc_async(
        self,
        request: jzqproducta_models.QueryPreformanceEqoghcRequest,
    ) -> jzqproducta_models.QueryPreformanceEqoghcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_eqoghc_ex_async(request, headers, runtime)

    def query_preformance_eqoghc_ex(
        self,
        request: jzqproducta_models.QueryPreformanceEqoghcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEqoghcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEqoghcResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.eqoghc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_eqoghc_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceEqoghcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEqoghcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEqoghcResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.eqoghc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_quklgc(
        self,
        request: jzqproducta_models.QueryPreformanceQuklgcRequest,
    ) -> jzqproducta_models.QueryPreformanceQuklgcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_quklgc_ex(request, headers, runtime)

    async def query_preformance_quklgc_async(
        self,
        request: jzqproducta_models.QueryPreformanceQuklgcRequest,
    ) -> jzqproducta_models.QueryPreformanceQuklgcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_quklgc_ex_async(request, headers, runtime)

    def query_preformance_quklgc_ex(
        self,
        request: jzqproducta_models.QueryPreformanceQuklgcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQuklgcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQuklgcResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.quklgc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_quklgc_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceQuklgcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQuklgcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQuklgcResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.quklgc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_otekpg(
        self,
        request: jzqproducta_models.QueryPreformanceOtekpgRequest,
    ) -> jzqproducta_models.QueryPreformanceOtekpgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_otekpg_ex(request, headers, runtime)

    async def query_preformance_otekpg_async(
        self,
        request: jzqproducta_models.QueryPreformanceOtekpgRequest,
    ) -> jzqproducta_models.QueryPreformanceOtekpgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_otekpg_ex_async(request, headers, runtime)

    def query_preformance_otekpg_ex(
        self,
        request: jzqproducta_models.QueryPreformanceOtekpgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceOtekpgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceOtekpgResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.otekpg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_otekpg_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceOtekpgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceOtekpgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceOtekpgResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.otekpg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_fnipum(
        self,
        request: jzqproducta_models.QueryPreformanceFnipumRequest,
    ) -> jzqproducta_models.QueryPreformanceFnipumResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_fnipum_ex(request, headers, runtime)

    async def query_preformance_fnipum_async(
        self,
        request: jzqproducta_models.QueryPreformanceFnipumRequest,
    ) -> jzqproducta_models.QueryPreformanceFnipumResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_fnipum_ex_async(request, headers, runtime)

    def query_preformance_fnipum_ex(
        self,
        request: jzqproducta_models.QueryPreformanceFnipumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFnipumResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFnipumResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.fnipum.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_fnipum_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceFnipumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFnipumResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFnipumResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.fnipum.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ehhgnq(
        self,
        request: jzqproducta_models.QueryPreformanceEhhgnqRequest,
    ) -> jzqproducta_models.QueryPreformanceEhhgnqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ehhgnq_ex(request, headers, runtime)

    async def query_preformance_ehhgnq_async(
        self,
        request: jzqproducta_models.QueryPreformanceEhhgnqRequest,
    ) -> jzqproducta_models.QueryPreformanceEhhgnqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ehhgnq_ex_async(request, headers, runtime)

    def query_preformance_ehhgnq_ex(
        self,
        request: jzqproducta_models.QueryPreformanceEhhgnqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEhhgnqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEhhgnqResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ehhgnq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ehhgnq_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceEhhgnqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEhhgnqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEhhgnqResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ehhgnq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ntrmkk(
        self,
        request: jzqproducta_models.QueryPreformanceNtrmkkRequest,
    ) -> jzqproducta_models.QueryPreformanceNtrmkkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ntrmkk_ex(request, headers, runtime)

    async def query_preformance_ntrmkk_async(
        self,
        request: jzqproducta_models.QueryPreformanceNtrmkkRequest,
    ) -> jzqproducta_models.QueryPreformanceNtrmkkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ntrmkk_ex_async(request, headers, runtime)

    def query_preformance_ntrmkk_ex(
        self,
        request: jzqproducta_models.QueryPreformanceNtrmkkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceNtrmkkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceNtrmkkResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ntrmkk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ntrmkk_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceNtrmkkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceNtrmkkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceNtrmkkResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ntrmkk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_cdjnvm(
        self,
        request: jzqproducta_models.QueryPreformanceCdjnvmRequest,
    ) -> jzqproducta_models.QueryPreformanceCdjnvmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_cdjnvm_ex(request, headers, runtime)

    async def query_preformance_cdjnvm_async(
        self,
        request: jzqproducta_models.QueryPreformanceCdjnvmRequest,
    ) -> jzqproducta_models.QueryPreformanceCdjnvmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_cdjnvm_ex_async(request, headers, runtime)

    def query_preformance_cdjnvm_ex(
        self,
        request: jzqproducta_models.QueryPreformanceCdjnvmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceCdjnvmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceCdjnvmResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.cdjnvm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_cdjnvm_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceCdjnvmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceCdjnvmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceCdjnvmResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.cdjnvm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_znmzzv(
        self,
        request: jzqproducta_models.QueryPreformanceZnmzzvRequest,
    ) -> jzqproducta_models.QueryPreformanceZnmzzvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_znmzzv_ex(request, headers, runtime)

    async def query_preformance_znmzzv_async(
        self,
        request: jzqproducta_models.QueryPreformanceZnmzzvRequest,
    ) -> jzqproducta_models.QueryPreformanceZnmzzvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_znmzzv_ex_async(request, headers, runtime)

    def query_preformance_znmzzv_ex(
        self,
        request: jzqproducta_models.QueryPreformanceZnmzzvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZnmzzvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZnmzzvResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.znmzzv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_znmzzv_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceZnmzzvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZnmzzvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZnmzzvResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.znmzzv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_jhxufr(
        self,
        request: jzqproducta_models.QueryPreformanceJhxufrRequest,
    ) -> jzqproducta_models.QueryPreformanceJhxufrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_jhxufr_ex(request, headers, runtime)

    async def query_preformance_jhxufr_async(
        self,
        request: jzqproducta_models.QueryPreformanceJhxufrRequest,
    ) -> jzqproducta_models.QueryPreformanceJhxufrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_jhxufr_ex_async(request, headers, runtime)

    def query_preformance_jhxufr_ex(
        self,
        request: jzqproducta_models.QueryPreformanceJhxufrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJhxufrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJhxufrResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.jhxufr.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_jhxufr_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceJhxufrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJhxufrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJhxufrResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.jhxufr.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_bvhiaa(
        self,
        request: jzqproducta_models.QueryPreformanceBvhiaaRequest,
    ) -> jzqproducta_models.QueryPreformanceBvhiaaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_bvhiaa_ex(request, headers, runtime)

    async def query_preformance_bvhiaa_async(
        self,
        request: jzqproducta_models.QueryPreformanceBvhiaaRequest,
    ) -> jzqproducta_models.QueryPreformanceBvhiaaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_bvhiaa_ex_async(request, headers, runtime)

    def query_preformance_bvhiaa_ex(
        self,
        request: jzqproducta_models.QueryPreformanceBvhiaaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceBvhiaaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceBvhiaaResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.bvhiaa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_bvhiaa_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceBvhiaaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceBvhiaaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceBvhiaaResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.bvhiaa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_xkpsmy(
        self,
        request: jzqproducta_models.QueryPreformanceXkpsmyRequest,
    ) -> jzqproducta_models.QueryPreformanceXkpsmyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_xkpsmy_ex(request, headers, runtime)

    async def query_preformance_xkpsmy_async(
        self,
        request: jzqproducta_models.QueryPreformanceXkpsmyRequest,
    ) -> jzqproducta_models.QueryPreformanceXkpsmyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_xkpsmy_ex_async(request, headers, runtime)

    def query_preformance_xkpsmy_ex(
        self,
        request: jzqproducta_models.QueryPreformanceXkpsmyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXkpsmyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXkpsmyResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.xkpsmy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_xkpsmy_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceXkpsmyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXkpsmyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXkpsmyResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.xkpsmy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_uvqflc(
        self,
        request: jzqproducta_models.QueryPreformanceUvqflcRequest,
    ) -> jzqproducta_models.QueryPreformanceUvqflcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_uvqflc_ex(request, headers, runtime)

    async def query_preformance_uvqflc_async(
        self,
        request: jzqproducta_models.QueryPreformanceUvqflcRequest,
    ) -> jzqproducta_models.QueryPreformanceUvqflcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_uvqflc_ex_async(request, headers, runtime)

    def query_preformance_uvqflc_ex(
        self,
        request: jzqproducta_models.QueryPreformanceUvqflcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUvqflcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUvqflcResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.uvqflc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_uvqflc_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceUvqflcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUvqflcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUvqflcResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.uvqflc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_vyjnjh(
        self,
        request: jzqproducta_models.QueryPreformanceVyjnjhRequest,
    ) -> jzqproducta_models.QueryPreformanceVyjnjhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_vyjnjh_ex(request, headers, runtime)

    async def query_preformance_vyjnjh_async(
        self,
        request: jzqproducta_models.QueryPreformanceVyjnjhRequest,
    ) -> jzqproducta_models.QueryPreformanceVyjnjhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_vyjnjh_ex_async(request, headers, runtime)

    def query_preformance_vyjnjh_ex(
        self,
        request: jzqproducta_models.QueryPreformanceVyjnjhRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVyjnjhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVyjnjhResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.vyjnjh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_vyjnjh_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceVyjnjhRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVyjnjhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVyjnjhResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.vyjnjh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_qdweww(
        self,
        request: jzqproducta_models.QueryPreformanceQdwewwRequest,
    ) -> jzqproducta_models.QueryPreformanceQdwewwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_qdweww_ex(request, headers, runtime)

    async def query_preformance_qdweww_async(
        self,
        request: jzqproducta_models.QueryPreformanceQdwewwRequest,
    ) -> jzqproducta_models.QueryPreformanceQdwewwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_qdweww_ex_async(request, headers, runtime)

    def query_preformance_qdweww_ex(
        self,
        request: jzqproducta_models.QueryPreformanceQdwewwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQdwewwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQdwewwResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.qdweww.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_qdweww_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceQdwewwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQdwewwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQdwewwResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.qdweww.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_yxsifp(
        self,
        request: jzqproducta_models.QueryPreformanceYxsifpRequest,
    ) -> jzqproducta_models.QueryPreformanceYxsifpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_yxsifp_ex(request, headers, runtime)

    async def query_preformance_yxsifp_async(
        self,
        request: jzqproducta_models.QueryPreformanceYxsifpRequest,
    ) -> jzqproducta_models.QueryPreformanceYxsifpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_yxsifp_ex_async(request, headers, runtime)

    def query_preformance_yxsifp_ex(
        self,
        request: jzqproducta_models.QueryPreformanceYxsifpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYxsifpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYxsifpResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.yxsifp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_yxsifp_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceYxsifpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYxsifpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYxsifpResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.yxsifp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_efvjvz(
        self,
        request: jzqproducta_models.QueryPreformanceEfvjvzRequest,
    ) -> jzqproducta_models.QueryPreformanceEfvjvzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_efvjvz_ex(request, headers, runtime)

    async def query_preformance_efvjvz_async(
        self,
        request: jzqproducta_models.QueryPreformanceEfvjvzRequest,
    ) -> jzqproducta_models.QueryPreformanceEfvjvzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_efvjvz_ex_async(request, headers, runtime)

    def query_preformance_efvjvz_ex(
        self,
        request: jzqproducta_models.QueryPreformanceEfvjvzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEfvjvzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEfvjvzResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.efvjvz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_efvjvz_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceEfvjvzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEfvjvzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEfvjvzResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.efvjvz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_jppmoh(
        self,
        request: jzqproducta_models.QueryPreformanceJppmohRequest,
    ) -> jzqproducta_models.QueryPreformanceJppmohResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_jppmoh_ex(request, headers, runtime)

    async def query_preformance_jppmoh_async(
        self,
        request: jzqproducta_models.QueryPreformanceJppmohRequest,
    ) -> jzqproducta_models.QueryPreformanceJppmohResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_jppmoh_ex_async(request, headers, runtime)

    def query_preformance_jppmoh_ex(
        self,
        request: jzqproducta_models.QueryPreformanceJppmohRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJppmohResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJppmohResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.jppmoh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_jppmoh_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceJppmohRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJppmohResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJppmohResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.jppmoh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_vcwcvo(
        self,
        request: jzqproducta_models.QueryPreformanceVcwcvoRequest,
    ) -> jzqproducta_models.QueryPreformanceVcwcvoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_vcwcvo_ex(request, headers, runtime)

    async def query_preformance_vcwcvo_async(
        self,
        request: jzqproducta_models.QueryPreformanceVcwcvoRequest,
    ) -> jzqproducta_models.QueryPreformanceVcwcvoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_vcwcvo_ex_async(request, headers, runtime)

    def query_preformance_vcwcvo_ex(
        self,
        request: jzqproducta_models.QueryPreformanceVcwcvoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVcwcvoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVcwcvoResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.vcwcvo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_vcwcvo_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceVcwcvoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVcwcvoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVcwcvoResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.vcwcvo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_bdbqlw(
        self,
        request: jzqproducta_models.QueryPreformanceBdbqlwRequest,
    ) -> jzqproducta_models.QueryPreformanceBdbqlwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_bdbqlw_ex(request, headers, runtime)

    async def query_preformance_bdbqlw_async(
        self,
        request: jzqproducta_models.QueryPreformanceBdbqlwRequest,
    ) -> jzqproducta_models.QueryPreformanceBdbqlwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_bdbqlw_ex_async(request, headers, runtime)

    def query_preformance_bdbqlw_ex(
        self,
        request: jzqproducta_models.QueryPreformanceBdbqlwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceBdbqlwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceBdbqlwResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.bdbqlw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_bdbqlw_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceBdbqlwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceBdbqlwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceBdbqlwResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.bdbqlw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_aqmmru(
        self,
        request: jzqproducta_models.QueryPreformanceAqmmruRequest,
    ) -> jzqproducta_models.QueryPreformanceAqmmruResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_aqmmru_ex(request, headers, runtime)

    async def query_preformance_aqmmru_async(
        self,
        request: jzqproducta_models.QueryPreformanceAqmmruRequest,
    ) -> jzqproducta_models.QueryPreformanceAqmmruResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_aqmmru_ex_async(request, headers, runtime)

    def query_preformance_aqmmru_ex(
        self,
        request: jzqproducta_models.QueryPreformanceAqmmruRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAqmmruResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAqmmruResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.aqmmru.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_aqmmru_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceAqmmruRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAqmmruResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAqmmruResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.aqmmru.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_rvieyv(
        self,
        request: jzqproducta_models.QueryPreformanceRvieyvRequest,
    ) -> jzqproducta_models.QueryPreformanceRvieyvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_rvieyv_ex(request, headers, runtime)

    async def query_preformance_rvieyv_async(
        self,
        request: jzqproducta_models.QueryPreformanceRvieyvRequest,
    ) -> jzqproducta_models.QueryPreformanceRvieyvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_rvieyv_ex_async(request, headers, runtime)

    def query_preformance_rvieyv_ex(
        self,
        request: jzqproducta_models.QueryPreformanceRvieyvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceRvieyvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceRvieyvResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.rvieyv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_rvieyv_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceRvieyvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceRvieyvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceRvieyvResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.rvieyv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_dmopqg(
        self,
        request: jzqproducta_models.QueryPreformanceDmopqgRequest,
    ) -> jzqproducta_models.QueryPreformanceDmopqgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_dmopqg_ex(request, headers, runtime)

    async def query_preformance_dmopqg_async(
        self,
        request: jzqproducta_models.QueryPreformanceDmopqgRequest,
    ) -> jzqproducta_models.QueryPreformanceDmopqgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_dmopqg_ex_async(request, headers, runtime)

    def query_preformance_dmopqg_ex(
        self,
        request: jzqproducta_models.QueryPreformanceDmopqgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDmopqgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDmopqgResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.dmopqg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_dmopqg_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceDmopqgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDmopqgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDmopqgResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.dmopqg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_jiccss(
        self,
        request: jzqproducta_models.QueryPreformanceJiccssRequest,
    ) -> jzqproducta_models.QueryPreformanceJiccssResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_jiccss_ex(request, headers, runtime)

    async def query_preformance_jiccss_async(
        self,
        request: jzqproducta_models.QueryPreformanceJiccssRequest,
    ) -> jzqproducta_models.QueryPreformanceJiccssResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_jiccss_ex_async(request, headers, runtime)

    def query_preformance_jiccss_ex(
        self,
        request: jzqproducta_models.QueryPreformanceJiccssRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJiccssResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJiccssResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.jiccss.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_jiccss_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceJiccssRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJiccssResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJiccssResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.jiccss.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_hlqjtd(
        self,
        request: jzqproducta_models.QueryPreformanceHlqjtdRequest,
    ) -> jzqproducta_models.QueryPreformanceHlqjtdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_hlqjtd_ex(request, headers, runtime)

    async def query_preformance_hlqjtd_async(
        self,
        request: jzqproducta_models.QueryPreformanceHlqjtdRequest,
    ) -> jzqproducta_models.QueryPreformanceHlqjtdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_hlqjtd_ex_async(request, headers, runtime)

    def query_preformance_hlqjtd_ex(
        self,
        request: jzqproducta_models.QueryPreformanceHlqjtdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHlqjtdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHlqjtdResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.hlqjtd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_hlqjtd_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceHlqjtdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHlqjtdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHlqjtdResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.hlqjtd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_laldyf(
        self,
        request: jzqproducta_models.QueryPreformanceLaldyfRequest,
    ) -> jzqproducta_models.QueryPreformanceLaldyfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_laldyf_ex(request, headers, runtime)

    async def query_preformance_laldyf_async(
        self,
        request: jzqproducta_models.QueryPreformanceLaldyfRequest,
    ) -> jzqproducta_models.QueryPreformanceLaldyfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_laldyf_ex_async(request, headers, runtime)

    def query_preformance_laldyf_ex(
        self,
        request: jzqproducta_models.QueryPreformanceLaldyfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLaldyfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLaldyfResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.laldyf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_laldyf_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceLaldyfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLaldyfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLaldyfResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.laldyf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ybynjw(
        self,
        request: jzqproducta_models.QueryPreformanceYbynjwRequest,
    ) -> jzqproducta_models.QueryPreformanceYbynjwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ybynjw_ex(request, headers, runtime)

    async def query_preformance_ybynjw_async(
        self,
        request: jzqproducta_models.QueryPreformanceYbynjwRequest,
    ) -> jzqproducta_models.QueryPreformanceYbynjwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ybynjw_ex_async(request, headers, runtime)

    def query_preformance_ybynjw_ex(
        self,
        request: jzqproducta_models.QueryPreformanceYbynjwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYbynjwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYbynjwResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ybynjw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ybynjw_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceYbynjwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYbynjwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYbynjwResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ybynjw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_fsinwz(
        self,
        request: jzqproducta_models.QueryPreformanceFsinwzRequest,
    ) -> jzqproducta_models.QueryPreformanceFsinwzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_fsinwz_ex(request, headers, runtime)

    async def query_preformance_fsinwz_async(
        self,
        request: jzqproducta_models.QueryPreformanceFsinwzRequest,
    ) -> jzqproducta_models.QueryPreformanceFsinwzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_fsinwz_ex_async(request, headers, runtime)

    def query_preformance_fsinwz_ex(
        self,
        request: jzqproducta_models.QueryPreformanceFsinwzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFsinwzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFsinwzResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.fsinwz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_fsinwz_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceFsinwzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFsinwzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFsinwzResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.fsinwz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_pgfxxn(
        self,
        request: jzqproducta_models.QueryPreformancePgfxxnRequest,
    ) -> jzqproducta_models.QueryPreformancePgfxxnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_pgfxxn_ex(request, headers, runtime)

    async def query_preformance_pgfxxn_async(
        self,
        request: jzqproducta_models.QueryPreformancePgfxxnRequest,
    ) -> jzqproducta_models.QueryPreformancePgfxxnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_pgfxxn_ex_async(request, headers, runtime)

    def query_preformance_pgfxxn_ex(
        self,
        request: jzqproducta_models.QueryPreformancePgfxxnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePgfxxnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePgfxxnResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.pgfxxn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_pgfxxn_ex_async(
        self,
        request: jzqproducta_models.QueryPreformancePgfxxnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePgfxxnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePgfxxnResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.pgfxxn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_quinfl(
        self,
        request: jzqproducta_models.QueryPreformanceQuinflRequest,
    ) -> jzqproducta_models.QueryPreformanceQuinflResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_quinfl_ex(request, headers, runtime)

    async def query_preformance_quinfl_async(
        self,
        request: jzqproducta_models.QueryPreformanceQuinflRequest,
    ) -> jzqproducta_models.QueryPreformanceQuinflResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_quinfl_ex_async(request, headers, runtime)

    def query_preformance_quinfl_ex(
        self,
        request: jzqproducta_models.QueryPreformanceQuinflRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQuinflResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQuinflResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.quinfl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_quinfl_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceQuinflRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQuinflResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQuinflResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.quinfl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_yxgwyy(
        self,
        request: jzqproducta_models.QueryPreformanceYxgwyyRequest,
    ) -> jzqproducta_models.QueryPreformanceYxgwyyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_yxgwyy_ex(request, headers, runtime)

    async def query_preformance_yxgwyy_async(
        self,
        request: jzqproducta_models.QueryPreformanceYxgwyyRequest,
    ) -> jzqproducta_models.QueryPreformanceYxgwyyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_yxgwyy_ex_async(request, headers, runtime)

    def query_preformance_yxgwyy_ex(
        self,
        request: jzqproducta_models.QueryPreformanceYxgwyyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYxgwyyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYxgwyyResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.yxgwyy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_yxgwyy_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceYxgwyyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYxgwyyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYxgwyyResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.yxgwyy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_nendtw(
        self,
        request: jzqproducta_models.QueryPreformanceNendtwRequest,
    ) -> jzqproducta_models.QueryPreformanceNendtwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_nendtw_ex(request, headers, runtime)

    async def query_preformance_nendtw_async(
        self,
        request: jzqproducta_models.QueryPreformanceNendtwRequest,
    ) -> jzqproducta_models.QueryPreformanceNendtwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_nendtw_ex_async(request, headers, runtime)

    def query_preformance_nendtw_ex(
        self,
        request: jzqproducta_models.QueryPreformanceNendtwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceNendtwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceNendtwResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.nendtw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_nendtw_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceNendtwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceNendtwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceNendtwResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.nendtw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ftjecz(
        self,
        request: jzqproducta_models.QueryPreformanceFtjeczRequest,
    ) -> jzqproducta_models.QueryPreformanceFtjeczResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ftjecz_ex(request, headers, runtime)

    async def query_preformance_ftjecz_async(
        self,
        request: jzqproducta_models.QueryPreformanceFtjeczRequest,
    ) -> jzqproducta_models.QueryPreformanceFtjeczResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ftjecz_ex_async(request, headers, runtime)

    def query_preformance_ftjecz_ex(
        self,
        request: jzqproducta_models.QueryPreformanceFtjeczRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFtjeczResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFtjeczResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ftjecz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ftjecz_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceFtjeczRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFtjeczResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFtjeczResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ftjecz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_eputrh(
        self,
        request: jzqproducta_models.QueryPreformanceEputrhRequest,
    ) -> jzqproducta_models.QueryPreformanceEputrhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_eputrh_ex(request, headers, runtime)

    async def query_preformance_eputrh_async(
        self,
        request: jzqproducta_models.QueryPreformanceEputrhRequest,
    ) -> jzqproducta_models.QueryPreformanceEputrhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_eputrh_ex_async(request, headers, runtime)

    def query_preformance_eputrh_ex(
        self,
        request: jzqproducta_models.QueryPreformanceEputrhRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEputrhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEputrhResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.eputrh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_eputrh_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceEputrhRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEputrhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEputrhResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.eputrh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_vspsum(
        self,
        request: jzqproducta_models.QueryPreformanceVspsumRequest,
    ) -> jzqproducta_models.QueryPreformanceVspsumResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_vspsum_ex(request, headers, runtime)

    async def query_preformance_vspsum_async(
        self,
        request: jzqproducta_models.QueryPreformanceVspsumRequest,
    ) -> jzqproducta_models.QueryPreformanceVspsumResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_vspsum_ex_async(request, headers, runtime)

    def query_preformance_vspsum_ex(
        self,
        request: jzqproducta_models.QueryPreformanceVspsumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVspsumResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVspsumResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.vspsum.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_vspsum_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceVspsumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVspsumResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVspsumResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.vspsum.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_zlwaue(
        self,
        request: jzqproducta_models.QueryPreformanceZlwaueRequest,
    ) -> jzqproducta_models.QueryPreformanceZlwaueResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_zlwaue_ex(request, headers, runtime)

    async def query_preformance_zlwaue_async(
        self,
        request: jzqproducta_models.QueryPreformanceZlwaueRequest,
    ) -> jzqproducta_models.QueryPreformanceZlwaueResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_zlwaue_ex_async(request, headers, runtime)

    def query_preformance_zlwaue_ex(
        self,
        request: jzqproducta_models.QueryPreformanceZlwaueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZlwaueResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZlwaueResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.zlwaue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_zlwaue_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceZlwaueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZlwaueResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZlwaueResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.zlwaue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_mqaojr(
        self,
        request: jzqproducta_models.QueryPreformanceMqaojrRequest,
    ) -> jzqproducta_models.QueryPreformanceMqaojrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_mqaojr_ex(request, headers, runtime)

    async def query_preformance_mqaojr_async(
        self,
        request: jzqproducta_models.QueryPreformanceMqaojrRequest,
    ) -> jzqproducta_models.QueryPreformanceMqaojrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_mqaojr_ex_async(request, headers, runtime)

    def query_preformance_mqaojr_ex(
        self,
        request: jzqproducta_models.QueryPreformanceMqaojrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMqaojrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMqaojrResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.mqaojr.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_mqaojr_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceMqaojrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMqaojrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMqaojrResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.mqaojr.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_bfcfqd(
        self,
        request: jzqproducta_models.QueryPreformanceBfcfqdRequest,
    ) -> jzqproducta_models.QueryPreformanceBfcfqdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_bfcfqd_ex(request, headers, runtime)

    async def query_preformance_bfcfqd_async(
        self,
        request: jzqproducta_models.QueryPreformanceBfcfqdRequest,
    ) -> jzqproducta_models.QueryPreformanceBfcfqdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_bfcfqd_ex_async(request, headers, runtime)

    def query_preformance_bfcfqd_ex(
        self,
        request: jzqproducta_models.QueryPreformanceBfcfqdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceBfcfqdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceBfcfqdResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.bfcfqd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_bfcfqd_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceBfcfqdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceBfcfqdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceBfcfqdResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.bfcfqd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ycfsaf(
        self,
        request: jzqproducta_models.QueryPreformanceYcfsafRequest,
    ) -> jzqproducta_models.QueryPreformanceYcfsafResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ycfsaf_ex(request, headers, runtime)

    async def query_preformance_ycfsaf_async(
        self,
        request: jzqproducta_models.QueryPreformanceYcfsafRequest,
    ) -> jzqproducta_models.QueryPreformanceYcfsafResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ycfsaf_ex_async(request, headers, runtime)

    def query_preformance_ycfsaf_ex(
        self,
        request: jzqproducta_models.QueryPreformanceYcfsafRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYcfsafResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYcfsafResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ycfsaf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ycfsaf_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceYcfsafRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYcfsafResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYcfsafResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ycfsaf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_zwpmyi(
        self,
        request: jzqproducta_models.QueryPreformanceZwpmyiRequest,
    ) -> jzqproducta_models.QueryPreformanceZwpmyiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_zwpmyi_ex(request, headers, runtime)

    async def query_preformance_zwpmyi_async(
        self,
        request: jzqproducta_models.QueryPreformanceZwpmyiRequest,
    ) -> jzqproducta_models.QueryPreformanceZwpmyiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_zwpmyi_ex_async(request, headers, runtime)

    def query_preformance_zwpmyi_ex(
        self,
        request: jzqproducta_models.QueryPreformanceZwpmyiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZwpmyiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZwpmyiResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.zwpmyi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_zwpmyi_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceZwpmyiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZwpmyiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZwpmyiResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.zwpmyi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_mvgnla(
        self,
        request: jzqproducta_models.QueryPreformanceMvgnlaRequest,
    ) -> jzqproducta_models.QueryPreformanceMvgnlaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_mvgnla_ex(request, headers, runtime)

    async def query_preformance_mvgnla_async(
        self,
        request: jzqproducta_models.QueryPreformanceMvgnlaRequest,
    ) -> jzqproducta_models.QueryPreformanceMvgnlaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_mvgnla_ex_async(request, headers, runtime)

    def query_preformance_mvgnla_ex(
        self,
        request: jzqproducta_models.QueryPreformanceMvgnlaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMvgnlaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMvgnlaResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.mvgnla.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_mvgnla_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceMvgnlaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMvgnlaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMvgnlaResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.mvgnla.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_vlmrpm(
        self,
        request: jzqproducta_models.QueryPreformanceVlmrpmRequest,
    ) -> jzqproducta_models.QueryPreformanceVlmrpmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_vlmrpm_ex(request, headers, runtime)

    async def query_preformance_vlmrpm_async(
        self,
        request: jzqproducta_models.QueryPreformanceVlmrpmRequest,
    ) -> jzqproducta_models.QueryPreformanceVlmrpmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_vlmrpm_ex_async(request, headers, runtime)

    def query_preformance_vlmrpm_ex(
        self,
        request: jzqproducta_models.QueryPreformanceVlmrpmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVlmrpmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVlmrpmResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.vlmrpm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_vlmrpm_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceVlmrpmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVlmrpmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVlmrpmResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.vlmrpm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_kfygrp(
        self,
        request: jzqproducta_models.QueryPreformanceKfygrpRequest,
    ) -> jzqproducta_models.QueryPreformanceKfygrpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_kfygrp_ex(request, headers, runtime)

    async def query_preformance_kfygrp_async(
        self,
        request: jzqproducta_models.QueryPreformanceKfygrpRequest,
    ) -> jzqproducta_models.QueryPreformanceKfygrpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_kfygrp_ex_async(request, headers, runtime)

    def query_preformance_kfygrp_ex(
        self,
        request: jzqproducta_models.QueryPreformanceKfygrpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKfygrpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKfygrpResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.kfygrp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_kfygrp_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceKfygrpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKfygrpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKfygrpResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.kfygrp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_kqdmyw(
        self,
        request: jzqproducta_models.QueryPreformanceKqdmywRequest,
    ) -> jzqproducta_models.QueryPreformanceKqdmywResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_kqdmyw_ex(request, headers, runtime)

    async def query_preformance_kqdmyw_async(
        self,
        request: jzqproducta_models.QueryPreformanceKqdmywRequest,
    ) -> jzqproducta_models.QueryPreformanceKqdmywResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_kqdmyw_ex_async(request, headers, runtime)

    def query_preformance_kqdmyw_ex(
        self,
        request: jzqproducta_models.QueryPreformanceKqdmywRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKqdmywResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKqdmywResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.kqdmyw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_kqdmyw_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceKqdmywRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKqdmywResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKqdmywResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.kqdmyw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_idrolc(
        self,
        request: jzqproducta_models.QueryPreformanceIdrolcRequest,
    ) -> jzqproducta_models.QueryPreformanceIdrolcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_idrolc_ex(request, headers, runtime)

    async def query_preformance_idrolc_async(
        self,
        request: jzqproducta_models.QueryPreformanceIdrolcRequest,
    ) -> jzqproducta_models.QueryPreformanceIdrolcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_idrolc_ex_async(request, headers, runtime)

    def query_preformance_idrolc_ex(
        self,
        request: jzqproducta_models.QueryPreformanceIdrolcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIdrolcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIdrolcResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.idrolc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_idrolc_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceIdrolcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIdrolcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIdrolcResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.idrolc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_goxdkk(
        self,
        request: jzqproducta_models.QueryPreformanceGoxdkkRequest,
    ) -> jzqproducta_models.QueryPreformanceGoxdkkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_goxdkk_ex(request, headers, runtime)

    async def query_preformance_goxdkk_async(
        self,
        request: jzqproducta_models.QueryPreformanceGoxdkkRequest,
    ) -> jzqproducta_models.QueryPreformanceGoxdkkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_goxdkk_ex_async(request, headers, runtime)

    def query_preformance_goxdkk_ex(
        self,
        request: jzqproducta_models.QueryPreformanceGoxdkkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGoxdkkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGoxdkkResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.goxdkk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_goxdkk_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceGoxdkkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGoxdkkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGoxdkkResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.goxdkk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_jnrlwy(
        self,
        request: jzqproducta_models.QueryPreformanceJnrlwyRequest,
    ) -> jzqproducta_models.QueryPreformanceJnrlwyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_jnrlwy_ex(request, headers, runtime)

    async def query_preformance_jnrlwy_async(
        self,
        request: jzqproducta_models.QueryPreformanceJnrlwyRequest,
    ) -> jzqproducta_models.QueryPreformanceJnrlwyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_jnrlwy_ex_async(request, headers, runtime)

    def query_preformance_jnrlwy_ex(
        self,
        request: jzqproducta_models.QueryPreformanceJnrlwyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJnrlwyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJnrlwyResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.jnrlwy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_jnrlwy_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceJnrlwyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJnrlwyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJnrlwyResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.jnrlwy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_yoiwnf(
        self,
        request: jzqproducta_models.QueryPreformanceYoiwnfRequest,
    ) -> jzqproducta_models.QueryPreformanceYoiwnfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_yoiwnf_ex(request, headers, runtime)

    async def query_preformance_yoiwnf_async(
        self,
        request: jzqproducta_models.QueryPreformanceYoiwnfRequest,
    ) -> jzqproducta_models.QueryPreformanceYoiwnfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_yoiwnf_ex_async(request, headers, runtime)

    def query_preformance_yoiwnf_ex(
        self,
        request: jzqproducta_models.QueryPreformanceYoiwnfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYoiwnfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYoiwnfResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.yoiwnf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_yoiwnf_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceYoiwnfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYoiwnfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYoiwnfResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.yoiwnf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_pxtfgc(
        self,
        request: jzqproducta_models.QueryPreformancePxtfgcRequest,
    ) -> jzqproducta_models.QueryPreformancePxtfgcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_pxtfgc_ex(request, headers, runtime)

    async def query_preformance_pxtfgc_async(
        self,
        request: jzqproducta_models.QueryPreformancePxtfgcRequest,
    ) -> jzqproducta_models.QueryPreformancePxtfgcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_pxtfgc_ex_async(request, headers, runtime)

    def query_preformance_pxtfgc_ex(
        self,
        request: jzqproducta_models.QueryPreformancePxtfgcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePxtfgcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePxtfgcResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.pxtfgc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_pxtfgc_ex_async(
        self,
        request: jzqproducta_models.QueryPreformancePxtfgcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePxtfgcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePxtfgcResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.pxtfgc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_gbigia(
        self,
        request: jzqproducta_models.QueryPreformanceGbigiaRequest,
    ) -> jzqproducta_models.QueryPreformanceGbigiaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_gbigia_ex(request, headers, runtime)

    async def query_preformance_gbigia_async(
        self,
        request: jzqproducta_models.QueryPreformanceGbigiaRequest,
    ) -> jzqproducta_models.QueryPreformanceGbigiaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_gbigia_ex_async(request, headers, runtime)

    def query_preformance_gbigia_ex(
        self,
        request: jzqproducta_models.QueryPreformanceGbigiaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGbigiaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGbigiaResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.gbigia.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_gbigia_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceGbigiaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGbigiaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGbigiaResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.gbigia.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_gohgoo(
        self,
        request: jzqproducta_models.QueryPreformanceGohgooRequest,
    ) -> jzqproducta_models.QueryPreformanceGohgooResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_gohgoo_ex(request, headers, runtime)

    async def query_preformance_gohgoo_async(
        self,
        request: jzqproducta_models.QueryPreformanceGohgooRequest,
    ) -> jzqproducta_models.QueryPreformanceGohgooResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_gohgoo_ex_async(request, headers, runtime)

    def query_preformance_gohgoo_ex(
        self,
        request: jzqproducta_models.QueryPreformanceGohgooRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGohgooResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGohgooResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.gohgoo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_gohgoo_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceGohgooRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGohgooResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGohgooResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.gohgoo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_qzijug(
        self,
        request: jzqproducta_models.QueryPreformanceQzijugRequest,
    ) -> jzqproducta_models.QueryPreformanceQzijugResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_qzijug_ex(request, headers, runtime)

    async def query_preformance_qzijug_async(
        self,
        request: jzqproducta_models.QueryPreformanceQzijugRequest,
    ) -> jzqproducta_models.QueryPreformanceQzijugResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_qzijug_ex_async(request, headers, runtime)

    def query_preformance_qzijug_ex(
        self,
        request: jzqproducta_models.QueryPreformanceQzijugRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQzijugResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQzijugResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.qzijug.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_qzijug_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceQzijugRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQzijugResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQzijugResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.qzijug.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_dtiqsm(
        self,
        request: jzqproducta_models.QueryPreformanceDtiqsmRequest,
    ) -> jzqproducta_models.QueryPreformanceDtiqsmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_dtiqsm_ex(request, headers, runtime)

    async def query_preformance_dtiqsm_async(
        self,
        request: jzqproducta_models.QueryPreformanceDtiqsmRequest,
    ) -> jzqproducta_models.QueryPreformanceDtiqsmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_dtiqsm_ex_async(request, headers, runtime)

    def query_preformance_dtiqsm_ex(
        self,
        request: jzqproducta_models.QueryPreformanceDtiqsmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDtiqsmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDtiqsmResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.dtiqsm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_dtiqsm_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceDtiqsmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDtiqsmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDtiqsmResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.dtiqsm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_iapwkx(
        self,
        request: jzqproducta_models.QueryPreformanceIapwkxRequest,
    ) -> jzqproducta_models.QueryPreformanceIapwkxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_iapwkx_ex(request, headers, runtime)

    async def query_preformance_iapwkx_async(
        self,
        request: jzqproducta_models.QueryPreformanceIapwkxRequest,
    ) -> jzqproducta_models.QueryPreformanceIapwkxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_iapwkx_ex_async(request, headers, runtime)

    def query_preformance_iapwkx_ex(
        self,
        request: jzqproducta_models.QueryPreformanceIapwkxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIapwkxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIapwkxResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.iapwkx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_iapwkx_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceIapwkxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIapwkxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIapwkxResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.iapwkx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_aarwuq(
        self,
        request: jzqproducta_models.QueryPreformanceAarwuqRequest,
    ) -> jzqproducta_models.QueryPreformanceAarwuqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_aarwuq_ex(request, headers, runtime)

    async def query_preformance_aarwuq_async(
        self,
        request: jzqproducta_models.QueryPreformanceAarwuqRequest,
    ) -> jzqproducta_models.QueryPreformanceAarwuqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_aarwuq_ex_async(request, headers, runtime)

    def query_preformance_aarwuq_ex(
        self,
        request: jzqproducta_models.QueryPreformanceAarwuqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAarwuqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAarwuqResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.aarwuq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_aarwuq_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceAarwuqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAarwuqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAarwuqResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.aarwuq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_egsbve(
        self,
        request: jzqproducta_models.QueryPreformanceEgsbveRequest,
    ) -> jzqproducta_models.QueryPreformanceEgsbveResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_egsbve_ex(request, headers, runtime)

    async def query_preformance_egsbve_async(
        self,
        request: jzqproducta_models.QueryPreformanceEgsbveRequest,
    ) -> jzqproducta_models.QueryPreformanceEgsbveResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_egsbve_ex_async(request, headers, runtime)

    def query_preformance_egsbve_ex(
        self,
        request: jzqproducta_models.QueryPreformanceEgsbveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEgsbveResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEgsbveResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.egsbve.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_egsbve_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceEgsbveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEgsbveResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEgsbveResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.egsbve.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_udgzvl(
        self,
        request: jzqproducta_models.QueryPreformanceUdgzvlRequest,
    ) -> jzqproducta_models.QueryPreformanceUdgzvlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_udgzvl_ex(request, headers, runtime)

    async def query_preformance_udgzvl_async(
        self,
        request: jzqproducta_models.QueryPreformanceUdgzvlRequest,
    ) -> jzqproducta_models.QueryPreformanceUdgzvlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_udgzvl_ex_async(request, headers, runtime)

    def query_preformance_udgzvl_ex(
        self,
        request: jzqproducta_models.QueryPreformanceUdgzvlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUdgzvlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUdgzvlResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.udgzvl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_udgzvl_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceUdgzvlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUdgzvlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUdgzvlResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.udgzvl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_oxzmsd(
        self,
        request: jzqproducta_models.QueryPreformanceOxzmsdRequest,
    ) -> jzqproducta_models.QueryPreformanceOxzmsdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_oxzmsd_ex(request, headers, runtime)

    async def query_preformance_oxzmsd_async(
        self,
        request: jzqproducta_models.QueryPreformanceOxzmsdRequest,
    ) -> jzqproducta_models.QueryPreformanceOxzmsdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_oxzmsd_ex_async(request, headers, runtime)

    def query_preformance_oxzmsd_ex(
        self,
        request: jzqproducta_models.QueryPreformanceOxzmsdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceOxzmsdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceOxzmsdResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.oxzmsd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_oxzmsd_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceOxzmsdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceOxzmsdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceOxzmsdResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.oxzmsd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_wrbogx(
        self,
        request: jzqproducta_models.QueryPreformanceWrbogxRequest,
    ) -> jzqproducta_models.QueryPreformanceWrbogxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_wrbogx_ex(request, headers, runtime)

    async def query_preformance_wrbogx_async(
        self,
        request: jzqproducta_models.QueryPreformanceWrbogxRequest,
    ) -> jzqproducta_models.QueryPreformanceWrbogxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_wrbogx_ex_async(request, headers, runtime)

    def query_preformance_wrbogx_ex(
        self,
        request: jzqproducta_models.QueryPreformanceWrbogxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceWrbogxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceWrbogxResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.wrbogx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_wrbogx_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceWrbogxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceWrbogxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceWrbogxResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.wrbogx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_sovdsq(
        self,
        request: jzqproducta_models.QueryPreformanceSovdsqRequest,
    ) -> jzqproducta_models.QueryPreformanceSovdsqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_sovdsq_ex(request, headers, runtime)

    async def query_preformance_sovdsq_async(
        self,
        request: jzqproducta_models.QueryPreformanceSovdsqRequest,
    ) -> jzqproducta_models.QueryPreformanceSovdsqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_sovdsq_ex_async(request, headers, runtime)

    def query_preformance_sovdsq_ex(
        self,
        request: jzqproducta_models.QueryPreformanceSovdsqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSovdsqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSovdsqResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.sovdsq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_sovdsq_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceSovdsqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSovdsqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSovdsqResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.sovdsq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_kmenzi(
        self,
        request: jzqproducta_models.QueryPreformanceKmenziRequest,
    ) -> jzqproducta_models.QueryPreformanceKmenziResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_kmenzi_ex(request, headers, runtime)

    async def query_preformance_kmenzi_async(
        self,
        request: jzqproducta_models.QueryPreformanceKmenziRequest,
    ) -> jzqproducta_models.QueryPreformanceKmenziResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_kmenzi_ex_async(request, headers, runtime)

    def query_preformance_kmenzi_ex(
        self,
        request: jzqproducta_models.QueryPreformanceKmenziRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKmenziResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKmenziResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.kmenzi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_kmenzi_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceKmenziRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKmenziResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKmenziResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.kmenzi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ndyzvb(
        self,
        request: jzqproducta_models.QueryPreformanceNdyzvbRequest,
    ) -> jzqproducta_models.QueryPreformanceNdyzvbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ndyzvb_ex(request, headers, runtime)

    async def query_preformance_ndyzvb_async(
        self,
        request: jzqproducta_models.QueryPreformanceNdyzvbRequest,
    ) -> jzqproducta_models.QueryPreformanceNdyzvbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ndyzvb_ex_async(request, headers, runtime)

    def query_preformance_ndyzvb_ex(
        self,
        request: jzqproducta_models.QueryPreformanceNdyzvbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceNdyzvbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceNdyzvbResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ndyzvb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ndyzvb_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceNdyzvbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceNdyzvbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceNdyzvbResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ndyzvb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_pleorx(
        self,
        request: jzqproducta_models.QueryPreformancePleorxRequest,
    ) -> jzqproducta_models.QueryPreformancePleorxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_pleorx_ex(request, headers, runtime)

    async def query_preformance_pleorx_async(
        self,
        request: jzqproducta_models.QueryPreformancePleorxRequest,
    ) -> jzqproducta_models.QueryPreformancePleorxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_pleorx_ex_async(request, headers, runtime)

    def query_preformance_pleorx_ex(
        self,
        request: jzqproducta_models.QueryPreformancePleorxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePleorxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePleorxResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.pleorx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_pleorx_ex_async(
        self,
        request: jzqproducta_models.QueryPreformancePleorxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePleorxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePleorxResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.pleorx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_erldms(
        self,
        request: jzqproducta_models.QueryPreformanceErldmsRequest,
    ) -> jzqproducta_models.QueryPreformanceErldmsResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_erldms_ex(request, headers, runtime)

    async def query_preformance_erldms_async(
        self,
        request: jzqproducta_models.QueryPreformanceErldmsRequest,
    ) -> jzqproducta_models.QueryPreformanceErldmsResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_erldms_ex_async(request, headers, runtime)

    def query_preformance_erldms_ex(
        self,
        request: jzqproducta_models.QueryPreformanceErldmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceErldmsResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceErldmsResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.erldms.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_erldms_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceErldmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceErldmsResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceErldmsResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.erldms.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_pstmvt(
        self,
        request: jzqproducta_models.QueryPreformancePstmvtRequest,
    ) -> jzqproducta_models.QueryPreformancePstmvtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_pstmvt_ex(request, headers, runtime)

    async def query_preformance_pstmvt_async(
        self,
        request: jzqproducta_models.QueryPreformancePstmvtRequest,
    ) -> jzqproducta_models.QueryPreformancePstmvtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_pstmvt_ex_async(request, headers, runtime)

    def query_preformance_pstmvt_ex(
        self,
        request: jzqproducta_models.QueryPreformancePstmvtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePstmvtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePstmvtResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.pstmvt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_pstmvt_ex_async(
        self,
        request: jzqproducta_models.QueryPreformancePstmvtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePstmvtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePstmvtResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.pstmvt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_rgcens(
        self,
        request: jzqproducta_models.QueryPreformanceRgcensRequest,
    ) -> jzqproducta_models.QueryPreformanceRgcensResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_rgcens_ex(request, headers, runtime)

    async def query_preformance_rgcens_async(
        self,
        request: jzqproducta_models.QueryPreformanceRgcensRequest,
    ) -> jzqproducta_models.QueryPreformanceRgcensResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_rgcens_ex_async(request, headers, runtime)

    def query_preformance_rgcens_ex(
        self,
        request: jzqproducta_models.QueryPreformanceRgcensRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceRgcensResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceRgcensResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.rgcens.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_rgcens_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceRgcensRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceRgcensResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceRgcensResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.rgcens.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_dfawnn(
        self,
        request: jzqproducta_models.QueryPreformanceDfawnnRequest,
    ) -> jzqproducta_models.QueryPreformanceDfawnnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_dfawnn_ex(request, headers, runtime)

    async def query_preformance_dfawnn_async(
        self,
        request: jzqproducta_models.QueryPreformanceDfawnnRequest,
    ) -> jzqproducta_models.QueryPreformanceDfawnnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_dfawnn_ex_async(request, headers, runtime)

    def query_preformance_dfawnn_ex(
        self,
        request: jzqproducta_models.QueryPreformanceDfawnnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDfawnnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDfawnnResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.dfawnn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_dfawnn_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceDfawnnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDfawnnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDfawnnResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.dfawnn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_yzzbsm(
        self,
        request: jzqproducta_models.QueryPreformanceYzzbsmRequest,
    ) -> jzqproducta_models.QueryPreformanceYzzbsmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_yzzbsm_ex(request, headers, runtime)

    async def query_preformance_yzzbsm_async(
        self,
        request: jzqproducta_models.QueryPreformanceYzzbsmRequest,
    ) -> jzqproducta_models.QueryPreformanceYzzbsmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_yzzbsm_ex_async(request, headers, runtime)

    def query_preformance_yzzbsm_ex(
        self,
        request: jzqproducta_models.QueryPreformanceYzzbsmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYzzbsmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYzzbsmResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.yzzbsm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_yzzbsm_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceYzzbsmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYzzbsmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYzzbsmResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.yzzbsm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_sybmpk(
        self,
        request: jzqproducta_models.QueryPreformanceSybmpkRequest,
    ) -> jzqproducta_models.QueryPreformanceSybmpkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_sybmpk_ex(request, headers, runtime)

    async def query_preformance_sybmpk_async(
        self,
        request: jzqproducta_models.QueryPreformanceSybmpkRequest,
    ) -> jzqproducta_models.QueryPreformanceSybmpkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_sybmpk_ex_async(request, headers, runtime)

    def query_preformance_sybmpk_ex(
        self,
        request: jzqproducta_models.QueryPreformanceSybmpkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSybmpkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSybmpkResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.sybmpk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_sybmpk_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceSybmpkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSybmpkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSybmpkResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.sybmpk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ztxnbk(
        self,
        request: jzqproducta_models.QueryPreformanceZtxnbkRequest,
    ) -> jzqproducta_models.QueryPreformanceZtxnbkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ztxnbk_ex(request, headers, runtime)

    async def query_preformance_ztxnbk_async(
        self,
        request: jzqproducta_models.QueryPreformanceZtxnbkRequest,
    ) -> jzqproducta_models.QueryPreformanceZtxnbkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ztxnbk_ex_async(request, headers, runtime)

    def query_preformance_ztxnbk_ex(
        self,
        request: jzqproducta_models.QueryPreformanceZtxnbkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZtxnbkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZtxnbkResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ztxnbk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ztxnbk_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceZtxnbkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZtxnbkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZtxnbkResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ztxnbk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ttttjp(
        self,
        request: jzqproducta_models.QueryPreformanceTtttjpRequest,
    ) -> jzqproducta_models.QueryPreformanceTtttjpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ttttjp_ex(request, headers, runtime)

    async def query_preformance_ttttjp_async(
        self,
        request: jzqproducta_models.QueryPreformanceTtttjpRequest,
    ) -> jzqproducta_models.QueryPreformanceTtttjpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ttttjp_ex_async(request, headers, runtime)

    def query_preformance_ttttjp_ex(
        self,
        request: jzqproducta_models.QueryPreformanceTtttjpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTtttjpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTtttjpResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ttttjp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ttttjp_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceTtttjpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTtttjpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTtttjpResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ttttjp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_kpnmpv(
        self,
        request: jzqproducta_models.QueryPreformanceKpnmpvRequest,
    ) -> jzqproducta_models.QueryPreformanceKpnmpvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_kpnmpv_ex(request, headers, runtime)

    async def query_preformance_kpnmpv_async(
        self,
        request: jzqproducta_models.QueryPreformanceKpnmpvRequest,
    ) -> jzqproducta_models.QueryPreformanceKpnmpvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_kpnmpv_ex_async(request, headers, runtime)

    def query_preformance_kpnmpv_ex(
        self,
        request: jzqproducta_models.QueryPreformanceKpnmpvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKpnmpvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKpnmpvResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.kpnmpv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_kpnmpv_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceKpnmpvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKpnmpvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKpnmpvResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.kpnmpv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_yquegw(
        self,
        request: jzqproducta_models.QueryPreformanceYquegwRequest,
    ) -> jzqproducta_models.QueryPreformanceYquegwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_yquegw_ex(request, headers, runtime)

    async def query_preformance_yquegw_async(
        self,
        request: jzqproducta_models.QueryPreformanceYquegwRequest,
    ) -> jzqproducta_models.QueryPreformanceYquegwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_yquegw_ex_async(request, headers, runtime)

    def query_preformance_yquegw_ex(
        self,
        request: jzqproducta_models.QueryPreformanceYquegwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYquegwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYquegwResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.yquegw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_yquegw_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceYquegwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYquegwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYquegwResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.yquegw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_yjmbyl(
        self,
        request: jzqproducta_models.QueryPreformanceYjmbylRequest,
    ) -> jzqproducta_models.QueryPreformanceYjmbylResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_yjmbyl_ex(request, headers, runtime)

    async def query_preformance_yjmbyl_async(
        self,
        request: jzqproducta_models.QueryPreformanceYjmbylRequest,
    ) -> jzqproducta_models.QueryPreformanceYjmbylResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_yjmbyl_ex_async(request, headers, runtime)

    def query_preformance_yjmbyl_ex(
        self,
        request: jzqproducta_models.QueryPreformanceYjmbylRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYjmbylResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYjmbylResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.yjmbyl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_yjmbyl_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceYjmbylRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYjmbylResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYjmbylResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.yjmbyl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_gjnnnv(
        self,
        request: jzqproducta_models.QueryPreformanceGjnnnvRequest,
    ) -> jzqproducta_models.QueryPreformanceGjnnnvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_gjnnnv_ex(request, headers, runtime)

    async def query_preformance_gjnnnv_async(
        self,
        request: jzqproducta_models.QueryPreformanceGjnnnvRequest,
    ) -> jzqproducta_models.QueryPreformanceGjnnnvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_gjnnnv_ex_async(request, headers, runtime)

    def query_preformance_gjnnnv_ex(
        self,
        request: jzqproducta_models.QueryPreformanceGjnnnvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGjnnnvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGjnnnvResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.gjnnnv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_gjnnnv_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceGjnnnvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGjnnnvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGjnnnvResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.gjnnnv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_cgcmkv(
        self,
        request: jzqproducta_models.QueryPreformanceCgcmkvRequest,
    ) -> jzqproducta_models.QueryPreformanceCgcmkvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_cgcmkv_ex(request, headers, runtime)

    async def query_preformance_cgcmkv_async(
        self,
        request: jzqproducta_models.QueryPreformanceCgcmkvRequest,
    ) -> jzqproducta_models.QueryPreformanceCgcmkvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_cgcmkv_ex_async(request, headers, runtime)

    def query_preformance_cgcmkv_ex(
        self,
        request: jzqproducta_models.QueryPreformanceCgcmkvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceCgcmkvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceCgcmkvResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.cgcmkv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_cgcmkv_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceCgcmkvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceCgcmkvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceCgcmkvResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.cgcmkv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_vtqjti(
        self,
        request: jzqproducta_models.QueryPreformanceVtqjtiRequest,
    ) -> jzqproducta_models.QueryPreformanceVtqjtiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_vtqjti_ex(request, headers, runtime)

    async def query_preformance_vtqjti_async(
        self,
        request: jzqproducta_models.QueryPreformanceVtqjtiRequest,
    ) -> jzqproducta_models.QueryPreformanceVtqjtiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_vtqjti_ex_async(request, headers, runtime)

    def query_preformance_vtqjti_ex(
        self,
        request: jzqproducta_models.QueryPreformanceVtqjtiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVtqjtiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVtqjtiResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.vtqjti.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_vtqjti_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceVtqjtiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVtqjtiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVtqjtiResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.vtqjti.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_zazxkc(
        self,
        request: jzqproducta_models.QueryPreformanceZazxkcRequest,
    ) -> jzqproducta_models.QueryPreformanceZazxkcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_zazxkc_ex(request, headers, runtime)

    async def query_preformance_zazxkc_async(
        self,
        request: jzqproducta_models.QueryPreformanceZazxkcRequest,
    ) -> jzqproducta_models.QueryPreformanceZazxkcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_zazxkc_ex_async(request, headers, runtime)

    def query_preformance_zazxkc_ex(
        self,
        request: jzqproducta_models.QueryPreformanceZazxkcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZazxkcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZazxkcResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.zazxkc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_zazxkc_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceZazxkcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZazxkcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZazxkcResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.zazxkc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_nxifyy(
        self,
        request: jzqproducta_models.QueryPreformanceNxifyyRequest,
    ) -> jzqproducta_models.QueryPreformanceNxifyyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_nxifyy_ex(request, headers, runtime)

    async def query_preformance_nxifyy_async(
        self,
        request: jzqproducta_models.QueryPreformanceNxifyyRequest,
    ) -> jzqproducta_models.QueryPreformanceNxifyyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_nxifyy_ex_async(request, headers, runtime)

    def query_preformance_nxifyy_ex(
        self,
        request: jzqproducta_models.QueryPreformanceNxifyyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceNxifyyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceNxifyyResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.nxifyy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_nxifyy_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceNxifyyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceNxifyyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceNxifyyResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.nxifyy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_znlzki(
        self,
        request: jzqproducta_models.QueryPreformanceZnlzkiRequest,
    ) -> jzqproducta_models.QueryPreformanceZnlzkiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_znlzki_ex(request, headers, runtime)

    async def query_preformance_znlzki_async(
        self,
        request: jzqproducta_models.QueryPreformanceZnlzkiRequest,
    ) -> jzqproducta_models.QueryPreformanceZnlzkiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_znlzki_ex_async(request, headers, runtime)

    def query_preformance_znlzki_ex(
        self,
        request: jzqproducta_models.QueryPreformanceZnlzkiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZnlzkiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZnlzkiResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.znlzki.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_znlzki_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceZnlzkiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZnlzkiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZnlzkiResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.znlzki.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_vcvcvy(
        self,
        request: jzqproducta_models.QueryPreformanceVcvcvyRequest,
    ) -> jzqproducta_models.QueryPreformanceVcvcvyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_vcvcvy_ex(request, headers, runtime)

    async def query_preformance_vcvcvy_async(
        self,
        request: jzqproducta_models.QueryPreformanceVcvcvyRequest,
    ) -> jzqproducta_models.QueryPreformanceVcvcvyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_vcvcvy_ex_async(request, headers, runtime)

    def query_preformance_vcvcvy_ex(
        self,
        request: jzqproducta_models.QueryPreformanceVcvcvyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVcvcvyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVcvcvyResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.vcvcvy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_vcvcvy_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceVcvcvyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVcvcvyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVcvcvyResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.vcvcvy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_xuchrm(
        self,
        request: jzqproducta_models.QueryPreformanceXuchrmRequest,
    ) -> jzqproducta_models.QueryPreformanceXuchrmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_xuchrm_ex(request, headers, runtime)

    async def query_preformance_xuchrm_async(
        self,
        request: jzqproducta_models.QueryPreformanceXuchrmRequest,
    ) -> jzqproducta_models.QueryPreformanceXuchrmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_xuchrm_ex_async(request, headers, runtime)

    def query_preformance_xuchrm_ex(
        self,
        request: jzqproducta_models.QueryPreformanceXuchrmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXuchrmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXuchrmResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.xuchrm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_xuchrm_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceXuchrmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXuchrmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXuchrmResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.xuchrm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ztkrkp(
        self,
        request: jzqproducta_models.QueryPreformanceZtkrkpRequest,
    ) -> jzqproducta_models.QueryPreformanceZtkrkpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ztkrkp_ex(request, headers, runtime)

    async def query_preformance_ztkrkp_async(
        self,
        request: jzqproducta_models.QueryPreformanceZtkrkpRequest,
    ) -> jzqproducta_models.QueryPreformanceZtkrkpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ztkrkp_ex_async(request, headers, runtime)

    def query_preformance_ztkrkp_ex(
        self,
        request: jzqproducta_models.QueryPreformanceZtkrkpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZtkrkpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZtkrkpResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ztkrkp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ztkrkp_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceZtkrkpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZtkrkpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZtkrkpResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ztkrkp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_jetngh(
        self,
        request: jzqproducta_models.QueryPreformanceJetnghRequest,
    ) -> jzqproducta_models.QueryPreformanceJetnghResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_jetngh_ex(request, headers, runtime)

    async def query_preformance_jetngh_async(
        self,
        request: jzqproducta_models.QueryPreformanceJetnghRequest,
    ) -> jzqproducta_models.QueryPreformanceJetnghResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_jetngh_ex_async(request, headers, runtime)

    def query_preformance_jetngh_ex(
        self,
        request: jzqproducta_models.QueryPreformanceJetnghRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJetnghResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJetnghResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.jetngh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_jetngh_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceJetnghRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJetnghResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJetnghResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.jetngh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_bgtghl(
        self,
        request: jzqproducta_models.QueryPreformanceBgtghlRequest,
    ) -> jzqproducta_models.QueryPreformanceBgtghlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_bgtghl_ex(request, headers, runtime)

    async def query_preformance_bgtghl_async(
        self,
        request: jzqproducta_models.QueryPreformanceBgtghlRequest,
    ) -> jzqproducta_models.QueryPreformanceBgtghlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_bgtghl_ex_async(request, headers, runtime)

    def query_preformance_bgtghl_ex(
        self,
        request: jzqproducta_models.QueryPreformanceBgtghlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceBgtghlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceBgtghlResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.bgtghl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_bgtghl_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceBgtghlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceBgtghlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceBgtghlResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.bgtghl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_vwquks(
        self,
        request: jzqproducta_models.QueryPreformanceVwquksRequest,
    ) -> jzqproducta_models.QueryPreformanceVwquksResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_vwquks_ex(request, headers, runtime)

    async def query_preformance_vwquks_async(
        self,
        request: jzqproducta_models.QueryPreformanceVwquksRequest,
    ) -> jzqproducta_models.QueryPreformanceVwquksResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_vwquks_ex_async(request, headers, runtime)

    def query_preformance_vwquks_ex(
        self,
        request: jzqproducta_models.QueryPreformanceVwquksRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVwquksResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVwquksResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.vwquks.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_vwquks_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceVwquksRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVwquksResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVwquksResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.vwquks.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_elcoqa(
        self,
        request: jzqproducta_models.QueryPreformanceElcoqaRequest,
    ) -> jzqproducta_models.QueryPreformanceElcoqaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_elcoqa_ex(request, headers, runtime)

    async def query_preformance_elcoqa_async(
        self,
        request: jzqproducta_models.QueryPreformanceElcoqaRequest,
    ) -> jzqproducta_models.QueryPreformanceElcoqaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_elcoqa_ex_async(request, headers, runtime)

    def query_preformance_elcoqa_ex(
        self,
        request: jzqproducta_models.QueryPreformanceElcoqaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceElcoqaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceElcoqaResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.elcoqa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_elcoqa_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceElcoqaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceElcoqaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceElcoqaResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.elcoqa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_swzidt(
        self,
        request: jzqproducta_models.QueryPreformanceSwzidtRequest,
    ) -> jzqproducta_models.QueryPreformanceSwzidtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_swzidt_ex(request, headers, runtime)

    async def query_preformance_swzidt_async(
        self,
        request: jzqproducta_models.QueryPreformanceSwzidtRequest,
    ) -> jzqproducta_models.QueryPreformanceSwzidtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_swzidt_ex_async(request, headers, runtime)

    def query_preformance_swzidt_ex(
        self,
        request: jzqproducta_models.QueryPreformanceSwzidtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSwzidtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSwzidtResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.swzidt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_swzidt_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceSwzidtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSwzidtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSwzidtResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.swzidt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_lepjay(
        self,
        request: jzqproducta_models.QueryPreformanceLepjayRequest,
    ) -> jzqproducta_models.QueryPreformanceLepjayResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_lepjay_ex(request, headers, runtime)

    async def query_preformance_lepjay_async(
        self,
        request: jzqproducta_models.QueryPreformanceLepjayRequest,
    ) -> jzqproducta_models.QueryPreformanceLepjayResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_lepjay_ex_async(request, headers, runtime)

    def query_preformance_lepjay_ex(
        self,
        request: jzqproducta_models.QueryPreformanceLepjayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLepjayResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLepjayResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.lepjay.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_lepjay_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceLepjayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLepjayResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLepjayResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.lepjay.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_wssfmi(
        self,
        request: jzqproducta_models.QueryPreformanceWssfmiRequest,
    ) -> jzqproducta_models.QueryPreformanceWssfmiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_wssfmi_ex(request, headers, runtime)

    async def query_preformance_wssfmi_async(
        self,
        request: jzqproducta_models.QueryPreformanceWssfmiRequest,
    ) -> jzqproducta_models.QueryPreformanceWssfmiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_wssfmi_ex_async(request, headers, runtime)

    def query_preformance_wssfmi_ex(
        self,
        request: jzqproducta_models.QueryPreformanceWssfmiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceWssfmiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceWssfmiResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.wssfmi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_wssfmi_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceWssfmiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceWssfmiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceWssfmiResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.wssfmi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_hiiibp(
        self,
        request: jzqproducta_models.QueryPreformanceHiiibpRequest,
    ) -> jzqproducta_models.QueryPreformanceHiiibpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_hiiibp_ex(request, headers, runtime)

    async def query_preformance_hiiibp_async(
        self,
        request: jzqproducta_models.QueryPreformanceHiiibpRequest,
    ) -> jzqproducta_models.QueryPreformanceHiiibpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_hiiibp_ex_async(request, headers, runtime)

    def query_preformance_hiiibp_ex(
        self,
        request: jzqproducta_models.QueryPreformanceHiiibpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHiiibpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHiiibpResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.hiiibp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_hiiibp_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceHiiibpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHiiibpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHiiibpResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.hiiibp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ilsifv(
        self,
        request: jzqproducta_models.QueryPreformanceIlsifvRequest,
    ) -> jzqproducta_models.QueryPreformanceIlsifvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ilsifv_ex(request, headers, runtime)

    async def query_preformance_ilsifv_async(
        self,
        request: jzqproducta_models.QueryPreformanceIlsifvRequest,
    ) -> jzqproducta_models.QueryPreformanceIlsifvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ilsifv_ex_async(request, headers, runtime)

    def query_preformance_ilsifv_ex(
        self,
        request: jzqproducta_models.QueryPreformanceIlsifvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIlsifvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIlsifvResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ilsifv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ilsifv_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceIlsifvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIlsifvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIlsifvResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ilsifv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_qrrdcg(
        self,
        request: jzqproducta_models.QueryPreformanceQrrdcgRequest,
    ) -> jzqproducta_models.QueryPreformanceQrrdcgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_qrrdcg_ex(request, headers, runtime)

    async def query_preformance_qrrdcg_async(
        self,
        request: jzqproducta_models.QueryPreformanceQrrdcgRequest,
    ) -> jzqproducta_models.QueryPreformanceQrrdcgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_qrrdcg_ex_async(request, headers, runtime)

    def query_preformance_qrrdcg_ex(
        self,
        request: jzqproducta_models.QueryPreformanceQrrdcgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQrrdcgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQrrdcgResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.qrrdcg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_qrrdcg_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceQrrdcgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQrrdcgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQrrdcgResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.qrrdcg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_oeffbq(
        self,
        request: jzqproducta_models.QueryPreformanceOeffbqRequest,
    ) -> jzqproducta_models.QueryPreformanceOeffbqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_oeffbq_ex(request, headers, runtime)

    async def query_preformance_oeffbq_async(
        self,
        request: jzqproducta_models.QueryPreformanceOeffbqRequest,
    ) -> jzqproducta_models.QueryPreformanceOeffbqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_oeffbq_ex_async(request, headers, runtime)

    def query_preformance_oeffbq_ex(
        self,
        request: jzqproducta_models.QueryPreformanceOeffbqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceOeffbqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceOeffbqResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.oeffbq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_oeffbq_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceOeffbqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceOeffbqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceOeffbqResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.oeffbq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_bfnylc(
        self,
        request: jzqproducta_models.QueryPreformanceBfnylcRequest,
    ) -> jzqproducta_models.QueryPreformanceBfnylcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_bfnylc_ex(request, headers, runtime)

    async def query_preformance_bfnylc_async(
        self,
        request: jzqproducta_models.QueryPreformanceBfnylcRequest,
    ) -> jzqproducta_models.QueryPreformanceBfnylcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_bfnylc_ex_async(request, headers, runtime)

    def query_preformance_bfnylc_ex(
        self,
        request: jzqproducta_models.QueryPreformanceBfnylcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceBfnylcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceBfnylcResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.bfnylc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_bfnylc_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceBfnylcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceBfnylcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceBfnylcResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.bfnylc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_khmkcu(
        self,
        request: jzqproducta_models.QueryPreformanceKhmkcuRequest,
    ) -> jzqproducta_models.QueryPreformanceKhmkcuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_khmkcu_ex(request, headers, runtime)

    async def query_preformance_khmkcu_async(
        self,
        request: jzqproducta_models.QueryPreformanceKhmkcuRequest,
    ) -> jzqproducta_models.QueryPreformanceKhmkcuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_khmkcu_ex_async(request, headers, runtime)

    def query_preformance_khmkcu_ex(
        self,
        request: jzqproducta_models.QueryPreformanceKhmkcuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKhmkcuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKhmkcuResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.khmkcu.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_khmkcu_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceKhmkcuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKhmkcuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKhmkcuResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.khmkcu.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_xahvpk(
        self,
        request: jzqproducta_models.QueryPreformanceXahvpkRequest,
    ) -> jzqproducta_models.QueryPreformanceXahvpkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_xahvpk_ex(request, headers, runtime)

    async def query_preformance_xahvpk_async(
        self,
        request: jzqproducta_models.QueryPreformanceXahvpkRequest,
    ) -> jzqproducta_models.QueryPreformanceXahvpkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_xahvpk_ex_async(request, headers, runtime)

    def query_preformance_xahvpk_ex(
        self,
        request: jzqproducta_models.QueryPreformanceXahvpkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXahvpkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXahvpkResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.xahvpk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_xahvpk_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceXahvpkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXahvpkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXahvpkResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.xahvpk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_pajjzn(
        self,
        request: jzqproducta_models.QueryPreformancePajjznRequest,
    ) -> jzqproducta_models.QueryPreformancePajjznResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_pajjzn_ex(request, headers, runtime)

    async def query_preformance_pajjzn_async(
        self,
        request: jzqproducta_models.QueryPreformancePajjznRequest,
    ) -> jzqproducta_models.QueryPreformancePajjznResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_pajjzn_ex_async(request, headers, runtime)

    def query_preformance_pajjzn_ex(
        self,
        request: jzqproducta_models.QueryPreformancePajjznRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePajjznResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePajjznResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.pajjzn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_pajjzn_ex_async(
        self,
        request: jzqproducta_models.QueryPreformancePajjznRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePajjznResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePajjznResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.pajjzn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_lrwabl(
        self,
        request: jzqproducta_models.QueryPreformanceLrwablRequest,
    ) -> jzqproducta_models.QueryPreformanceLrwablResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_lrwabl_ex(request, headers, runtime)

    async def query_preformance_lrwabl_async(
        self,
        request: jzqproducta_models.QueryPreformanceLrwablRequest,
    ) -> jzqproducta_models.QueryPreformanceLrwablResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_lrwabl_ex_async(request, headers, runtime)

    def query_preformance_lrwabl_ex(
        self,
        request: jzqproducta_models.QueryPreformanceLrwablRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLrwablResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLrwablResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.lrwabl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_lrwabl_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceLrwablRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLrwablResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLrwablResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.lrwabl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_qccygn(
        self,
        request: jzqproducta_models.QueryPreformanceQccygnRequest,
    ) -> jzqproducta_models.QueryPreformanceQccygnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_qccygn_ex(request, headers, runtime)

    async def query_preformance_qccygn_async(
        self,
        request: jzqproducta_models.QueryPreformanceQccygnRequest,
    ) -> jzqproducta_models.QueryPreformanceQccygnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_qccygn_ex_async(request, headers, runtime)

    def query_preformance_qccygn_ex(
        self,
        request: jzqproducta_models.QueryPreformanceQccygnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQccygnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQccygnResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.qccygn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_qccygn_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceQccygnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQccygnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQccygnResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.qccygn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_htqkxt(
        self,
        request: jzqproducta_models.QueryPreformanceHtqkxtRequest,
    ) -> jzqproducta_models.QueryPreformanceHtqkxtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_htqkxt_ex(request, headers, runtime)

    async def query_preformance_htqkxt_async(
        self,
        request: jzqproducta_models.QueryPreformanceHtqkxtRequest,
    ) -> jzqproducta_models.QueryPreformanceHtqkxtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_htqkxt_ex_async(request, headers, runtime)

    def query_preformance_htqkxt_ex(
        self,
        request: jzqproducta_models.QueryPreformanceHtqkxtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHtqkxtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHtqkxtResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.htqkxt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_htqkxt_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceHtqkxtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHtqkxtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHtqkxtResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.htqkxt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_mitdkq(
        self,
        request: jzqproducta_models.QueryPreformanceMitdkqRequest,
    ) -> jzqproducta_models.QueryPreformanceMitdkqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_mitdkq_ex(request, headers, runtime)

    async def query_preformance_mitdkq_async(
        self,
        request: jzqproducta_models.QueryPreformanceMitdkqRequest,
    ) -> jzqproducta_models.QueryPreformanceMitdkqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_mitdkq_ex_async(request, headers, runtime)

    def query_preformance_mitdkq_ex(
        self,
        request: jzqproducta_models.QueryPreformanceMitdkqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMitdkqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMitdkqResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.mitdkq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_mitdkq_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceMitdkqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMitdkqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMitdkqResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.mitdkq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_prbsek(
        self,
        request: jzqproducta_models.QueryPreformancePrbsekRequest,
    ) -> jzqproducta_models.QueryPreformancePrbsekResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_prbsek_ex(request, headers, runtime)

    async def query_preformance_prbsek_async(
        self,
        request: jzqproducta_models.QueryPreformancePrbsekRequest,
    ) -> jzqproducta_models.QueryPreformancePrbsekResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_prbsek_ex_async(request, headers, runtime)

    def query_preformance_prbsek_ex(
        self,
        request: jzqproducta_models.QueryPreformancePrbsekRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePrbsekResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePrbsekResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.prbsek.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_prbsek_ex_async(
        self,
        request: jzqproducta_models.QueryPreformancePrbsekRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePrbsekResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePrbsekResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.prbsek.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_vrqoxo(
        self,
        request: jzqproducta_models.QueryPreformanceVrqoxoRequest,
    ) -> jzqproducta_models.QueryPreformanceVrqoxoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_vrqoxo_ex(request, headers, runtime)

    async def query_preformance_vrqoxo_async(
        self,
        request: jzqproducta_models.QueryPreformanceVrqoxoRequest,
    ) -> jzqproducta_models.QueryPreformanceVrqoxoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_vrqoxo_ex_async(request, headers, runtime)

    def query_preformance_vrqoxo_ex(
        self,
        request: jzqproducta_models.QueryPreformanceVrqoxoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVrqoxoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVrqoxoResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.vrqoxo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_vrqoxo_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceVrqoxoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVrqoxoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVrqoxoResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.vrqoxo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ucltcu(
        self,
        request: jzqproducta_models.QueryPreformanceUcltcuRequest,
    ) -> jzqproducta_models.QueryPreformanceUcltcuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ucltcu_ex(request, headers, runtime)

    async def query_preformance_ucltcu_async(
        self,
        request: jzqproducta_models.QueryPreformanceUcltcuRequest,
    ) -> jzqproducta_models.QueryPreformanceUcltcuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ucltcu_ex_async(request, headers, runtime)

    def query_preformance_ucltcu_ex(
        self,
        request: jzqproducta_models.QueryPreformanceUcltcuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUcltcuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUcltcuResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ucltcu.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ucltcu_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceUcltcuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUcltcuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUcltcuResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ucltcu.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_mzmhjm(
        self,
        request: jzqproducta_models.QueryPreformanceMzmhjmRequest,
    ) -> jzqproducta_models.QueryPreformanceMzmhjmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_mzmhjm_ex(request, headers, runtime)

    async def query_preformance_mzmhjm_async(
        self,
        request: jzqproducta_models.QueryPreformanceMzmhjmRequest,
    ) -> jzqproducta_models.QueryPreformanceMzmhjmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_mzmhjm_ex_async(request, headers, runtime)

    def query_preformance_mzmhjm_ex(
        self,
        request: jzqproducta_models.QueryPreformanceMzmhjmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMzmhjmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMzmhjmResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.mzmhjm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_mzmhjm_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceMzmhjmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMzmhjmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMzmhjmResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.mzmhjm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ugztlu(
        self,
        request: jzqproducta_models.QueryPreformanceUgztluRequest,
    ) -> jzqproducta_models.QueryPreformanceUgztluResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ugztlu_ex(request, headers, runtime)

    async def query_preformance_ugztlu_async(
        self,
        request: jzqproducta_models.QueryPreformanceUgztluRequest,
    ) -> jzqproducta_models.QueryPreformanceUgztluResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ugztlu_ex_async(request, headers, runtime)

    def query_preformance_ugztlu_ex(
        self,
        request: jzqproducta_models.QueryPreformanceUgztluRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUgztluResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUgztluResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ugztlu.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ugztlu_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceUgztluRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUgztluResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUgztluResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ugztlu.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ykrosj(
        self,
        request: jzqproducta_models.QueryPreformanceYkrosjRequest,
    ) -> jzqproducta_models.QueryPreformanceYkrosjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ykrosj_ex(request, headers, runtime)

    async def query_preformance_ykrosj_async(
        self,
        request: jzqproducta_models.QueryPreformanceYkrosjRequest,
    ) -> jzqproducta_models.QueryPreformanceYkrosjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ykrosj_ex_async(request, headers, runtime)

    def query_preformance_ykrosj_ex(
        self,
        request: jzqproducta_models.QueryPreformanceYkrosjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYkrosjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYkrosjResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ykrosj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ykrosj_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceYkrosjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYkrosjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYkrosjResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ykrosj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_gflgul(
        self,
        request: jzqproducta_models.QueryPreformanceGflgulRequest,
    ) -> jzqproducta_models.QueryPreformanceGflgulResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_gflgul_ex(request, headers, runtime)

    async def query_preformance_gflgul_async(
        self,
        request: jzqproducta_models.QueryPreformanceGflgulRequest,
    ) -> jzqproducta_models.QueryPreformanceGflgulResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_gflgul_ex_async(request, headers, runtime)

    def query_preformance_gflgul_ex(
        self,
        request: jzqproducta_models.QueryPreformanceGflgulRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGflgulResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGflgulResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.gflgul.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_gflgul_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceGflgulRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGflgulResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGflgulResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.gflgul.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_xwkppo(
        self,
        request: jzqproducta_models.QueryPreformanceXwkppoRequest,
    ) -> jzqproducta_models.QueryPreformanceXwkppoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_xwkppo_ex(request, headers, runtime)

    async def query_preformance_xwkppo_async(
        self,
        request: jzqproducta_models.QueryPreformanceXwkppoRequest,
    ) -> jzqproducta_models.QueryPreformanceXwkppoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_xwkppo_ex_async(request, headers, runtime)

    def query_preformance_xwkppo_ex(
        self,
        request: jzqproducta_models.QueryPreformanceXwkppoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXwkppoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXwkppoResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.xwkppo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_xwkppo_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceXwkppoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXwkppoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXwkppoResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.xwkppo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_vmvwlq(
        self,
        request: jzqproducta_models.QueryPreformanceVmvwlqRequest,
    ) -> jzqproducta_models.QueryPreformanceVmvwlqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_vmvwlq_ex(request, headers, runtime)

    async def query_preformance_vmvwlq_async(
        self,
        request: jzqproducta_models.QueryPreformanceVmvwlqRequest,
    ) -> jzqproducta_models.QueryPreformanceVmvwlqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_vmvwlq_ex_async(request, headers, runtime)

    def query_preformance_vmvwlq_ex(
        self,
        request: jzqproducta_models.QueryPreformanceVmvwlqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVmvwlqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVmvwlqResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.vmvwlq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_vmvwlq_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceVmvwlqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVmvwlqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVmvwlqResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.vmvwlq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_leciag(
        self,
        request: jzqproducta_models.QueryPreformanceLeciagRequest,
    ) -> jzqproducta_models.QueryPreformanceLeciagResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_leciag_ex(request, headers, runtime)

    async def query_preformance_leciag_async(
        self,
        request: jzqproducta_models.QueryPreformanceLeciagRequest,
    ) -> jzqproducta_models.QueryPreformanceLeciagResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_leciag_ex_async(request, headers, runtime)

    def query_preformance_leciag_ex(
        self,
        request: jzqproducta_models.QueryPreformanceLeciagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLeciagResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLeciagResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.leciag.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_leciag_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceLeciagRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLeciagResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLeciagResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.leciag.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_yhfxnr(
        self,
        request: jzqproducta_models.QueryPreformanceYhfxnrRequest,
    ) -> jzqproducta_models.QueryPreformanceYhfxnrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_yhfxnr_ex(request, headers, runtime)

    async def query_preformance_yhfxnr_async(
        self,
        request: jzqproducta_models.QueryPreformanceYhfxnrRequest,
    ) -> jzqproducta_models.QueryPreformanceYhfxnrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_yhfxnr_ex_async(request, headers, runtime)

    def query_preformance_yhfxnr_ex(
        self,
        request: jzqproducta_models.QueryPreformanceYhfxnrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYhfxnrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYhfxnrResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.yhfxnr.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_yhfxnr_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceYhfxnrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYhfxnrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYhfxnrResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.yhfxnr.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_tmuqns(
        self,
        request: jzqproducta_models.QueryPreformanceTmuqnsRequest,
    ) -> jzqproducta_models.QueryPreformanceTmuqnsResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_tmuqns_ex(request, headers, runtime)

    async def query_preformance_tmuqns_async(
        self,
        request: jzqproducta_models.QueryPreformanceTmuqnsRequest,
    ) -> jzqproducta_models.QueryPreformanceTmuqnsResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_tmuqns_ex_async(request, headers, runtime)

    def query_preformance_tmuqns_ex(
        self,
        request: jzqproducta_models.QueryPreformanceTmuqnsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTmuqnsResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTmuqnsResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.tmuqns.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_tmuqns_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceTmuqnsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTmuqnsResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTmuqnsResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.tmuqns.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_azmyss(
        self,
        request: jzqproducta_models.QueryPreformanceAzmyssRequest,
    ) -> jzqproducta_models.QueryPreformanceAzmyssResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_azmyss_ex(request, headers, runtime)

    async def query_preformance_azmyss_async(
        self,
        request: jzqproducta_models.QueryPreformanceAzmyssRequest,
    ) -> jzqproducta_models.QueryPreformanceAzmyssResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_azmyss_ex_async(request, headers, runtime)

    def query_preformance_azmyss_ex(
        self,
        request: jzqproducta_models.QueryPreformanceAzmyssRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAzmyssResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAzmyssResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.azmyss.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_azmyss_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceAzmyssRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAzmyssResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAzmyssResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.azmyss.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_xnkkmh(
        self,
        request: jzqproducta_models.QueryPreformanceXnkkmhRequest,
    ) -> jzqproducta_models.QueryPreformanceXnkkmhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_xnkkmh_ex(request, headers, runtime)

    async def query_preformance_xnkkmh_async(
        self,
        request: jzqproducta_models.QueryPreformanceXnkkmhRequest,
    ) -> jzqproducta_models.QueryPreformanceXnkkmhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_xnkkmh_ex_async(request, headers, runtime)

    def query_preformance_xnkkmh_ex(
        self,
        request: jzqproducta_models.QueryPreformanceXnkkmhRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXnkkmhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXnkkmhResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.xnkkmh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_xnkkmh_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceXnkkmhRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXnkkmhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXnkkmhResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.xnkkmh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_bngodm(
        self,
        request: jzqproducta_models.QueryPreformanceBngodmRequest,
    ) -> jzqproducta_models.QueryPreformanceBngodmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_bngodm_ex(request, headers, runtime)

    async def query_preformance_bngodm_async(
        self,
        request: jzqproducta_models.QueryPreformanceBngodmRequest,
    ) -> jzqproducta_models.QueryPreformanceBngodmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_bngodm_ex_async(request, headers, runtime)

    def query_preformance_bngodm_ex(
        self,
        request: jzqproducta_models.QueryPreformanceBngodmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceBngodmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceBngodmResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.bngodm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_bngodm_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceBngodmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceBngodmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceBngodmResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.bngodm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ttvegr(
        self,
        request: jzqproducta_models.QueryPreformanceTtvegrRequest,
    ) -> jzqproducta_models.QueryPreformanceTtvegrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ttvegr_ex(request, headers, runtime)

    async def query_preformance_ttvegr_async(
        self,
        request: jzqproducta_models.QueryPreformanceTtvegrRequest,
    ) -> jzqproducta_models.QueryPreformanceTtvegrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ttvegr_ex_async(request, headers, runtime)

    def query_preformance_ttvegr_ex(
        self,
        request: jzqproducta_models.QueryPreformanceTtvegrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTtvegrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTtvegrResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ttvegr.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ttvegr_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceTtvegrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTtvegrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTtvegrResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ttvegr.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_haarbk(
        self,
        request: jzqproducta_models.QueryPreformanceHaarbkRequest,
    ) -> jzqproducta_models.QueryPreformanceHaarbkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_haarbk_ex(request, headers, runtime)

    async def query_preformance_haarbk_async(
        self,
        request: jzqproducta_models.QueryPreformanceHaarbkRequest,
    ) -> jzqproducta_models.QueryPreformanceHaarbkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_haarbk_ex_async(request, headers, runtime)

    def query_preformance_haarbk_ex(
        self,
        request: jzqproducta_models.QueryPreformanceHaarbkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHaarbkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHaarbkResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.haarbk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_haarbk_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceHaarbkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHaarbkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHaarbkResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.haarbk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_onualk(
        self,
        request: jzqproducta_models.QueryPreformanceOnualkRequest,
    ) -> jzqproducta_models.QueryPreformanceOnualkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_onualk_ex(request, headers, runtime)

    async def query_preformance_onualk_async(
        self,
        request: jzqproducta_models.QueryPreformanceOnualkRequest,
    ) -> jzqproducta_models.QueryPreformanceOnualkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_onualk_ex_async(request, headers, runtime)

    def query_preformance_onualk_ex(
        self,
        request: jzqproducta_models.QueryPreformanceOnualkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceOnualkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceOnualkResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.onualk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_onualk_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceOnualkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceOnualkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceOnualkResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.onualk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_zrjcrw(
        self,
        request: jzqproducta_models.QueryPreformanceZrjcrwRequest,
    ) -> jzqproducta_models.QueryPreformanceZrjcrwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_zrjcrw_ex(request, headers, runtime)

    async def query_preformance_zrjcrw_async(
        self,
        request: jzqproducta_models.QueryPreformanceZrjcrwRequest,
    ) -> jzqproducta_models.QueryPreformanceZrjcrwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_zrjcrw_ex_async(request, headers, runtime)

    def query_preformance_zrjcrw_ex(
        self,
        request: jzqproducta_models.QueryPreformanceZrjcrwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZrjcrwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZrjcrwResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.zrjcrw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_zrjcrw_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceZrjcrwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZrjcrwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZrjcrwResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.zrjcrw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_bztkaa(
        self,
        request: jzqproducta_models.QueryPreformanceBztkaaRequest,
    ) -> jzqproducta_models.QueryPreformanceBztkaaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_bztkaa_ex(request, headers, runtime)

    async def query_preformance_bztkaa_async(
        self,
        request: jzqproducta_models.QueryPreformanceBztkaaRequest,
    ) -> jzqproducta_models.QueryPreformanceBztkaaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_bztkaa_ex_async(request, headers, runtime)

    def query_preformance_bztkaa_ex(
        self,
        request: jzqproducta_models.QueryPreformanceBztkaaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceBztkaaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceBztkaaResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.bztkaa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_bztkaa_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceBztkaaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceBztkaaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceBztkaaResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.bztkaa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_mtpvfg(
        self,
        request: jzqproducta_models.QueryPreformanceMtpvfgRequest,
    ) -> jzqproducta_models.QueryPreformanceMtpvfgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_mtpvfg_ex(request, headers, runtime)

    async def query_preformance_mtpvfg_async(
        self,
        request: jzqproducta_models.QueryPreformanceMtpvfgRequest,
    ) -> jzqproducta_models.QueryPreformanceMtpvfgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_mtpvfg_ex_async(request, headers, runtime)

    def query_preformance_mtpvfg_ex(
        self,
        request: jzqproducta_models.QueryPreformanceMtpvfgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMtpvfgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMtpvfgResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.mtpvfg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_mtpvfg_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceMtpvfgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMtpvfgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMtpvfgResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.mtpvfg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_tysxvo(
        self,
        request: jzqproducta_models.QueryPreformanceTysxvoRequest,
    ) -> jzqproducta_models.QueryPreformanceTysxvoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_tysxvo_ex(request, headers, runtime)

    async def query_preformance_tysxvo_async(
        self,
        request: jzqproducta_models.QueryPreformanceTysxvoRequest,
    ) -> jzqproducta_models.QueryPreformanceTysxvoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_tysxvo_ex_async(request, headers, runtime)

    def query_preformance_tysxvo_ex(
        self,
        request: jzqproducta_models.QueryPreformanceTysxvoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTysxvoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTysxvoResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.tysxvo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_tysxvo_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceTysxvoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTysxvoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTysxvoResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.tysxvo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_kmexgp(
        self,
        request: jzqproducta_models.QueryPreformanceKmexgpRequest,
    ) -> jzqproducta_models.QueryPreformanceKmexgpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_kmexgp_ex(request, headers, runtime)

    async def query_preformance_kmexgp_async(
        self,
        request: jzqproducta_models.QueryPreformanceKmexgpRequest,
    ) -> jzqproducta_models.QueryPreformanceKmexgpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_kmexgp_ex_async(request, headers, runtime)

    def query_preformance_kmexgp_ex(
        self,
        request: jzqproducta_models.QueryPreformanceKmexgpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKmexgpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKmexgpResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.kmexgp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_kmexgp_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceKmexgpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKmexgpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKmexgpResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.kmexgp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_pwqvff(
        self,
        request: jzqproducta_models.QueryPreformancePwqvffRequest,
    ) -> jzqproducta_models.QueryPreformancePwqvffResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_pwqvff_ex(request, headers, runtime)

    async def query_preformance_pwqvff_async(
        self,
        request: jzqproducta_models.QueryPreformancePwqvffRequest,
    ) -> jzqproducta_models.QueryPreformancePwqvffResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_pwqvff_ex_async(request, headers, runtime)

    def query_preformance_pwqvff_ex(
        self,
        request: jzqproducta_models.QueryPreformancePwqvffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePwqvffResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePwqvffResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.pwqvff.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_pwqvff_ex_async(
        self,
        request: jzqproducta_models.QueryPreformancePwqvffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePwqvffResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePwqvffResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.pwqvff.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_tuyazj(
        self,
        request: jzqproducta_models.QueryPreformanceTuyazjRequest,
    ) -> jzqproducta_models.QueryPreformanceTuyazjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_tuyazj_ex(request, headers, runtime)

    async def query_preformance_tuyazj_async(
        self,
        request: jzqproducta_models.QueryPreformanceTuyazjRequest,
    ) -> jzqproducta_models.QueryPreformanceTuyazjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_tuyazj_ex_async(request, headers, runtime)

    def query_preformance_tuyazj_ex(
        self,
        request: jzqproducta_models.QueryPreformanceTuyazjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTuyazjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTuyazjResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.tuyazj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_tuyazj_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceTuyazjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTuyazjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTuyazjResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.tuyazj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_seidvg(
        self,
        request: jzqproducta_models.QueryPreformanceSeidvgRequest,
    ) -> jzqproducta_models.QueryPreformanceSeidvgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_seidvg_ex(request, headers, runtime)

    async def query_preformance_seidvg_async(
        self,
        request: jzqproducta_models.QueryPreformanceSeidvgRequest,
    ) -> jzqproducta_models.QueryPreformanceSeidvgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_seidvg_ex_async(request, headers, runtime)

    def query_preformance_seidvg_ex(
        self,
        request: jzqproducta_models.QueryPreformanceSeidvgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSeidvgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSeidvgResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.seidvg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_seidvg_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceSeidvgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSeidvgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSeidvgResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.seidvg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_mbtpaw(
        self,
        request: jzqproducta_models.QueryPreformanceMbtpawRequest,
    ) -> jzqproducta_models.QueryPreformanceMbtpawResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_mbtpaw_ex(request, headers, runtime)

    async def query_preformance_mbtpaw_async(
        self,
        request: jzqproducta_models.QueryPreformanceMbtpawRequest,
    ) -> jzqproducta_models.QueryPreformanceMbtpawResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_mbtpaw_ex_async(request, headers, runtime)

    def query_preformance_mbtpaw_ex(
        self,
        request: jzqproducta_models.QueryPreformanceMbtpawRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMbtpawResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMbtpawResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.mbtpaw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_mbtpaw_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceMbtpawRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMbtpawResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMbtpawResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.mbtpaw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_fxblow(
        self,
        request: jzqproducta_models.QueryPreformanceFxblowRequest,
    ) -> jzqproducta_models.QueryPreformanceFxblowResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_fxblow_ex(request, headers, runtime)

    async def query_preformance_fxblow_async(
        self,
        request: jzqproducta_models.QueryPreformanceFxblowRequest,
    ) -> jzqproducta_models.QueryPreformanceFxblowResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_fxblow_ex_async(request, headers, runtime)

    def query_preformance_fxblow_ex(
        self,
        request: jzqproducta_models.QueryPreformanceFxblowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFxblowResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFxblowResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.fxblow.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_fxblow_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceFxblowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFxblowResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFxblowResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.fxblow.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_aequnw(
        self,
        request: jzqproducta_models.QueryPreformanceAequnwRequest,
    ) -> jzqproducta_models.QueryPreformanceAequnwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_aequnw_ex(request, headers, runtime)

    async def query_preformance_aequnw_async(
        self,
        request: jzqproducta_models.QueryPreformanceAequnwRequest,
    ) -> jzqproducta_models.QueryPreformanceAequnwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_aequnw_ex_async(request, headers, runtime)

    def query_preformance_aequnw_ex(
        self,
        request: jzqproducta_models.QueryPreformanceAequnwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAequnwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAequnwResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.aequnw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_aequnw_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceAequnwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAequnwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAequnwResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.aequnw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_kksgng(
        self,
        request: jzqproducta_models.QueryPreformanceKksgngRequest,
    ) -> jzqproducta_models.QueryPreformanceKksgngResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_kksgng_ex(request, headers, runtime)

    async def query_preformance_kksgng_async(
        self,
        request: jzqproducta_models.QueryPreformanceKksgngRequest,
    ) -> jzqproducta_models.QueryPreformanceKksgngResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_kksgng_ex_async(request, headers, runtime)

    def query_preformance_kksgng_ex(
        self,
        request: jzqproducta_models.QueryPreformanceKksgngRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKksgngResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKksgngResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.kksgng.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_kksgng_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceKksgngRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKksgngResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKksgngResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.kksgng.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_eplydb(
        self,
        request: jzqproducta_models.QueryPreformanceEplydbRequest,
    ) -> jzqproducta_models.QueryPreformanceEplydbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_eplydb_ex(request, headers, runtime)

    async def query_preformance_eplydb_async(
        self,
        request: jzqproducta_models.QueryPreformanceEplydbRequest,
    ) -> jzqproducta_models.QueryPreformanceEplydbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_eplydb_ex_async(request, headers, runtime)

    def query_preformance_eplydb_ex(
        self,
        request: jzqproducta_models.QueryPreformanceEplydbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEplydbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEplydbResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.eplydb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_eplydb_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceEplydbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEplydbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEplydbResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.eplydb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_lkdxvs(
        self,
        request: jzqproducta_models.QueryPreformanceLkdxvsRequest,
    ) -> jzqproducta_models.QueryPreformanceLkdxvsResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_lkdxvs_ex(request, headers, runtime)

    async def query_preformance_lkdxvs_async(
        self,
        request: jzqproducta_models.QueryPreformanceLkdxvsRequest,
    ) -> jzqproducta_models.QueryPreformanceLkdxvsResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_lkdxvs_ex_async(request, headers, runtime)

    def query_preformance_lkdxvs_ex(
        self,
        request: jzqproducta_models.QueryPreformanceLkdxvsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLkdxvsResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLkdxvsResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.lkdxvs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_lkdxvs_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceLkdxvsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLkdxvsResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLkdxvsResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.lkdxvs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_pkwuzm(
        self,
        request: jzqproducta_models.QueryPreformancePkwuzmRequest,
    ) -> jzqproducta_models.QueryPreformancePkwuzmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_pkwuzm_ex(request, headers, runtime)

    async def query_preformance_pkwuzm_async(
        self,
        request: jzqproducta_models.QueryPreformancePkwuzmRequest,
    ) -> jzqproducta_models.QueryPreformancePkwuzmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_pkwuzm_ex_async(request, headers, runtime)

    def query_preformance_pkwuzm_ex(
        self,
        request: jzqproducta_models.QueryPreformancePkwuzmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePkwuzmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePkwuzmResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.pkwuzm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_pkwuzm_ex_async(
        self,
        request: jzqproducta_models.QueryPreformancePkwuzmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePkwuzmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePkwuzmResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.pkwuzm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_tgagmi(
        self,
        request: jzqproducta_models.QueryPreformanceTgagmiRequest,
    ) -> jzqproducta_models.QueryPreformanceTgagmiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_tgagmi_ex(request, headers, runtime)

    async def query_preformance_tgagmi_async(
        self,
        request: jzqproducta_models.QueryPreformanceTgagmiRequest,
    ) -> jzqproducta_models.QueryPreformanceTgagmiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_tgagmi_ex_async(request, headers, runtime)

    def query_preformance_tgagmi_ex(
        self,
        request: jzqproducta_models.QueryPreformanceTgagmiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTgagmiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTgagmiResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.tgagmi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_tgagmi_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceTgagmiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTgagmiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTgagmiResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.tgagmi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_dadqnv(
        self,
        request: jzqproducta_models.QueryPreformanceDadqnvRequest,
    ) -> jzqproducta_models.QueryPreformanceDadqnvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_dadqnv_ex(request, headers, runtime)

    async def query_preformance_dadqnv_async(
        self,
        request: jzqproducta_models.QueryPreformanceDadqnvRequest,
    ) -> jzqproducta_models.QueryPreformanceDadqnvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_dadqnv_ex_async(request, headers, runtime)

    def query_preformance_dadqnv_ex(
        self,
        request: jzqproducta_models.QueryPreformanceDadqnvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDadqnvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDadqnvResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.dadqnv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_dadqnv_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceDadqnvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDadqnvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDadqnvResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.dadqnv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_cfxhof(
        self,
        request: jzqproducta_models.QueryPreformanceCfxhofRequest,
    ) -> jzqproducta_models.QueryPreformanceCfxhofResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_cfxhof_ex(request, headers, runtime)

    async def query_preformance_cfxhof_async(
        self,
        request: jzqproducta_models.QueryPreformanceCfxhofRequest,
    ) -> jzqproducta_models.QueryPreformanceCfxhofResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_cfxhof_ex_async(request, headers, runtime)

    def query_preformance_cfxhof_ex(
        self,
        request: jzqproducta_models.QueryPreformanceCfxhofRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceCfxhofResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceCfxhofResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.cfxhof.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_cfxhof_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceCfxhofRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceCfxhofResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceCfxhofResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.cfxhof.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_flukhl(
        self,
        request: jzqproducta_models.QueryPreformanceFlukhlRequest,
    ) -> jzqproducta_models.QueryPreformanceFlukhlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_flukhl_ex(request, headers, runtime)

    async def query_preformance_flukhl_async(
        self,
        request: jzqproducta_models.QueryPreformanceFlukhlRequest,
    ) -> jzqproducta_models.QueryPreformanceFlukhlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_flukhl_ex_async(request, headers, runtime)

    def query_preformance_flukhl_ex(
        self,
        request: jzqproducta_models.QueryPreformanceFlukhlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFlukhlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFlukhlResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.flukhl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_flukhl_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceFlukhlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFlukhlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFlukhlResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.flukhl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_duwewn(
        self,
        request: jzqproducta_models.QueryPreformanceDuwewnRequest,
    ) -> jzqproducta_models.QueryPreformanceDuwewnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_duwewn_ex(request, headers, runtime)

    async def query_preformance_duwewn_async(
        self,
        request: jzqproducta_models.QueryPreformanceDuwewnRequest,
    ) -> jzqproducta_models.QueryPreformanceDuwewnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_duwewn_ex_async(request, headers, runtime)

    def query_preformance_duwewn_ex(
        self,
        request: jzqproducta_models.QueryPreformanceDuwewnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDuwewnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDuwewnResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.duwewn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_duwewn_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceDuwewnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDuwewnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDuwewnResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.duwewn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_jcgpsj(
        self,
        request: jzqproducta_models.QueryPreformanceJcgpsjRequest,
    ) -> jzqproducta_models.QueryPreformanceJcgpsjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_jcgpsj_ex(request, headers, runtime)

    async def query_preformance_jcgpsj_async(
        self,
        request: jzqproducta_models.QueryPreformanceJcgpsjRequest,
    ) -> jzqproducta_models.QueryPreformanceJcgpsjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_jcgpsj_ex_async(request, headers, runtime)

    def query_preformance_jcgpsj_ex(
        self,
        request: jzqproducta_models.QueryPreformanceJcgpsjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJcgpsjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJcgpsjResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.jcgpsj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_jcgpsj_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceJcgpsjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJcgpsjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJcgpsjResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.jcgpsj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ieexfu(
        self,
        request: jzqproducta_models.QueryPreformanceIeexfuRequest,
    ) -> jzqproducta_models.QueryPreformanceIeexfuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ieexfu_ex(request, headers, runtime)

    async def query_preformance_ieexfu_async(
        self,
        request: jzqproducta_models.QueryPreformanceIeexfuRequest,
    ) -> jzqproducta_models.QueryPreformanceIeexfuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ieexfu_ex_async(request, headers, runtime)

    def query_preformance_ieexfu_ex(
        self,
        request: jzqproducta_models.QueryPreformanceIeexfuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIeexfuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIeexfuResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ieexfu.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ieexfu_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceIeexfuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIeexfuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIeexfuResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ieexfu.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_galthw(
        self,
        request: jzqproducta_models.QueryPreformanceGalthwRequest,
    ) -> jzqproducta_models.QueryPreformanceGalthwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_galthw_ex(request, headers, runtime)

    async def query_preformance_galthw_async(
        self,
        request: jzqproducta_models.QueryPreformanceGalthwRequest,
    ) -> jzqproducta_models.QueryPreformanceGalthwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_galthw_ex_async(request, headers, runtime)

    def query_preformance_galthw_ex(
        self,
        request: jzqproducta_models.QueryPreformanceGalthwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGalthwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGalthwResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.galthw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_galthw_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceGalthwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGalthwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGalthwResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.galthw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_fnmdoh(
        self,
        request: jzqproducta_models.QueryPreformanceFnmdohRequest,
    ) -> jzqproducta_models.QueryPreformanceFnmdohResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_fnmdoh_ex(request, headers, runtime)

    async def query_preformance_fnmdoh_async(
        self,
        request: jzqproducta_models.QueryPreformanceFnmdohRequest,
    ) -> jzqproducta_models.QueryPreformanceFnmdohResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_fnmdoh_ex_async(request, headers, runtime)

    def query_preformance_fnmdoh_ex(
        self,
        request: jzqproducta_models.QueryPreformanceFnmdohRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFnmdohResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFnmdohResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.fnmdoh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_fnmdoh_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceFnmdohRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFnmdohResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFnmdohResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.fnmdoh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_xngfdi(
        self,
        request: jzqproducta_models.QueryPreformanceXngfdiRequest,
    ) -> jzqproducta_models.QueryPreformanceXngfdiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_xngfdi_ex(request, headers, runtime)

    async def query_preformance_xngfdi_async(
        self,
        request: jzqproducta_models.QueryPreformanceXngfdiRequest,
    ) -> jzqproducta_models.QueryPreformanceXngfdiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_xngfdi_ex_async(request, headers, runtime)

    def query_preformance_xngfdi_ex(
        self,
        request: jzqproducta_models.QueryPreformanceXngfdiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXngfdiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXngfdiResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.xngfdi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_xngfdi_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceXngfdiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXngfdiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXngfdiResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.xngfdi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_hynnnn(
        self,
        request: jzqproducta_models.QueryPreformanceHynnnnRequest,
    ) -> jzqproducta_models.QueryPreformanceHynnnnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_hynnnn_ex(request, headers, runtime)

    async def query_preformance_hynnnn_async(
        self,
        request: jzqproducta_models.QueryPreformanceHynnnnRequest,
    ) -> jzqproducta_models.QueryPreformanceHynnnnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_hynnnn_ex_async(request, headers, runtime)

    def query_preformance_hynnnn_ex(
        self,
        request: jzqproducta_models.QueryPreformanceHynnnnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHynnnnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHynnnnResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.hynnnn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_hynnnn_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceHynnnnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHynnnnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHynnnnResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.hynnnn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_dyjtoy(
        self,
        request: jzqproducta_models.QueryPreformanceDyjtoyRequest,
    ) -> jzqproducta_models.QueryPreformanceDyjtoyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_dyjtoy_ex(request, headers, runtime)

    async def query_preformance_dyjtoy_async(
        self,
        request: jzqproducta_models.QueryPreformanceDyjtoyRequest,
    ) -> jzqproducta_models.QueryPreformanceDyjtoyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_dyjtoy_ex_async(request, headers, runtime)

    def query_preformance_dyjtoy_ex(
        self,
        request: jzqproducta_models.QueryPreformanceDyjtoyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDyjtoyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDyjtoyResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.dyjtoy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_dyjtoy_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceDyjtoyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDyjtoyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDyjtoyResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.dyjtoy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_wenfdh(
        self,
        request: jzqproducta_models.QueryPreformanceWenfdhRequest,
    ) -> jzqproducta_models.QueryPreformanceWenfdhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_wenfdh_ex(request, headers, runtime)

    async def query_preformance_wenfdh_async(
        self,
        request: jzqproducta_models.QueryPreformanceWenfdhRequest,
    ) -> jzqproducta_models.QueryPreformanceWenfdhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_wenfdh_ex_async(request, headers, runtime)

    def query_preformance_wenfdh_ex(
        self,
        request: jzqproducta_models.QueryPreformanceWenfdhRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceWenfdhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceWenfdhResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.wenfdh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_wenfdh_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceWenfdhRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceWenfdhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceWenfdhResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.wenfdh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_jrctdx(
        self,
        request: jzqproducta_models.QueryPreformanceJrctdxRequest,
    ) -> jzqproducta_models.QueryPreformanceJrctdxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_jrctdx_ex(request, headers, runtime)

    async def query_preformance_jrctdx_async(
        self,
        request: jzqproducta_models.QueryPreformanceJrctdxRequest,
    ) -> jzqproducta_models.QueryPreformanceJrctdxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_jrctdx_ex_async(request, headers, runtime)

    def query_preformance_jrctdx_ex(
        self,
        request: jzqproducta_models.QueryPreformanceJrctdxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJrctdxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJrctdxResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.jrctdx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_jrctdx_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceJrctdxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJrctdxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJrctdxResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.jrctdx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_dfdlkv(
        self,
        request: jzqproducta_models.QueryPreformanceDfdlkvRequest,
    ) -> jzqproducta_models.QueryPreformanceDfdlkvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_dfdlkv_ex(request, headers, runtime)

    async def query_preformance_dfdlkv_async(
        self,
        request: jzqproducta_models.QueryPreformanceDfdlkvRequest,
    ) -> jzqproducta_models.QueryPreformanceDfdlkvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_dfdlkv_ex_async(request, headers, runtime)

    def query_preformance_dfdlkv_ex(
        self,
        request: jzqproducta_models.QueryPreformanceDfdlkvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDfdlkvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDfdlkvResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.dfdlkv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_dfdlkv_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceDfdlkvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDfdlkvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDfdlkvResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.dfdlkv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_knwgew(
        self,
        request: jzqproducta_models.QueryPreformanceKnwgewRequest,
    ) -> jzqproducta_models.QueryPreformanceKnwgewResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_knwgew_ex(request, headers, runtime)

    async def query_preformance_knwgew_async(
        self,
        request: jzqproducta_models.QueryPreformanceKnwgewRequest,
    ) -> jzqproducta_models.QueryPreformanceKnwgewResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_knwgew_ex_async(request, headers, runtime)

    def query_preformance_knwgew_ex(
        self,
        request: jzqproducta_models.QueryPreformanceKnwgewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKnwgewResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKnwgewResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.knwgew.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_knwgew_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceKnwgewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKnwgewResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKnwgewResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.knwgew.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_apifsy(
        self,
        request: jzqproducta_models.QueryPreformanceApifsyRequest,
    ) -> jzqproducta_models.QueryPreformanceApifsyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_apifsy_ex(request, headers, runtime)

    async def query_preformance_apifsy_async(
        self,
        request: jzqproducta_models.QueryPreformanceApifsyRequest,
    ) -> jzqproducta_models.QueryPreformanceApifsyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_apifsy_ex_async(request, headers, runtime)

    def query_preformance_apifsy_ex(
        self,
        request: jzqproducta_models.QueryPreformanceApifsyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceApifsyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceApifsyResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.apifsy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_apifsy_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceApifsyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceApifsyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceApifsyResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.apifsy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_mjgxpv(
        self,
        request: jzqproducta_models.QueryPreformanceMjgxpvRequest,
    ) -> jzqproducta_models.QueryPreformanceMjgxpvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_mjgxpv_ex(request, headers, runtime)

    async def query_preformance_mjgxpv_async(
        self,
        request: jzqproducta_models.QueryPreformanceMjgxpvRequest,
    ) -> jzqproducta_models.QueryPreformanceMjgxpvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_mjgxpv_ex_async(request, headers, runtime)

    def query_preformance_mjgxpv_ex(
        self,
        request: jzqproducta_models.QueryPreformanceMjgxpvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMjgxpvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMjgxpvResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.mjgxpv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_mjgxpv_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceMjgxpvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMjgxpvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMjgxpvResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.mjgxpv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_askegs(
        self,
        request: jzqproducta_models.QueryPreformanceAskegsRequest,
    ) -> jzqproducta_models.QueryPreformanceAskegsResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_askegs_ex(request, headers, runtime)

    async def query_preformance_askegs_async(
        self,
        request: jzqproducta_models.QueryPreformanceAskegsRequest,
    ) -> jzqproducta_models.QueryPreformanceAskegsResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_askegs_ex_async(request, headers, runtime)

    def query_preformance_askegs_ex(
        self,
        request: jzqproducta_models.QueryPreformanceAskegsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAskegsResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAskegsResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.askegs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_askegs_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceAskegsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAskegsResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAskegsResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.askegs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_jajelf(
        self,
        request: jzqproducta_models.QueryPreformanceJajelfRequest,
    ) -> jzqproducta_models.QueryPreformanceJajelfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_jajelf_ex(request, headers, runtime)

    async def query_preformance_jajelf_async(
        self,
        request: jzqproducta_models.QueryPreformanceJajelfRequest,
    ) -> jzqproducta_models.QueryPreformanceJajelfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_jajelf_ex_async(request, headers, runtime)

    def query_preformance_jajelf_ex(
        self,
        request: jzqproducta_models.QueryPreformanceJajelfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJajelfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJajelfResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.jajelf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_jajelf_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceJajelfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJajelfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJajelfResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.jajelf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_kstsxl(
        self,
        request: jzqproducta_models.QueryPreformanceKstsxlRequest,
    ) -> jzqproducta_models.QueryPreformanceKstsxlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_kstsxl_ex(request, headers, runtime)

    async def query_preformance_kstsxl_async(
        self,
        request: jzqproducta_models.QueryPreformanceKstsxlRequest,
    ) -> jzqproducta_models.QueryPreformanceKstsxlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_kstsxl_ex_async(request, headers, runtime)

    def query_preformance_kstsxl_ex(
        self,
        request: jzqproducta_models.QueryPreformanceKstsxlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKstsxlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKstsxlResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.kstsxl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_kstsxl_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceKstsxlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKstsxlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKstsxlResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.kstsxl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_yihqyc(
        self,
        request: jzqproducta_models.QueryPreformanceYihqycRequest,
    ) -> jzqproducta_models.QueryPreformanceYihqycResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_yihqyc_ex(request, headers, runtime)

    async def query_preformance_yihqyc_async(
        self,
        request: jzqproducta_models.QueryPreformanceYihqycRequest,
    ) -> jzqproducta_models.QueryPreformanceYihqycResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_yihqyc_ex_async(request, headers, runtime)

    def query_preformance_yihqyc_ex(
        self,
        request: jzqproducta_models.QueryPreformanceYihqycRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYihqycResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYihqycResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.yihqyc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_yihqyc_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceYihqycRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYihqycResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYihqycResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.yihqyc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_paqveg(
        self,
        request: jzqproducta_models.QueryPreformancePaqvegRequest,
    ) -> jzqproducta_models.QueryPreformancePaqvegResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_paqveg_ex(request, headers, runtime)

    async def query_preformance_paqveg_async(
        self,
        request: jzqproducta_models.QueryPreformancePaqvegRequest,
    ) -> jzqproducta_models.QueryPreformancePaqvegResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_paqveg_ex_async(request, headers, runtime)

    def query_preformance_paqveg_ex(
        self,
        request: jzqproducta_models.QueryPreformancePaqvegRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePaqvegResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePaqvegResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.paqveg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_paqveg_ex_async(
        self,
        request: jzqproducta_models.QueryPreformancePaqvegRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePaqvegResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePaqvegResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.paqveg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_vgtiiu(
        self,
        request: jzqproducta_models.QueryPreformanceVgtiiuRequest,
    ) -> jzqproducta_models.QueryPreformanceVgtiiuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_vgtiiu_ex(request, headers, runtime)

    async def query_preformance_vgtiiu_async(
        self,
        request: jzqproducta_models.QueryPreformanceVgtiiuRequest,
    ) -> jzqproducta_models.QueryPreformanceVgtiiuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_vgtiiu_ex_async(request, headers, runtime)

    def query_preformance_vgtiiu_ex(
        self,
        request: jzqproducta_models.QueryPreformanceVgtiiuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVgtiiuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVgtiiuResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.vgtiiu.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_vgtiiu_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceVgtiiuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVgtiiuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVgtiiuResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.vgtiiu.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_sdlanz(
        self,
        request: jzqproducta_models.QueryPreformanceSdlanzRequest,
    ) -> jzqproducta_models.QueryPreformanceSdlanzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_sdlanz_ex(request, headers, runtime)

    async def query_preformance_sdlanz_async(
        self,
        request: jzqproducta_models.QueryPreformanceSdlanzRequest,
    ) -> jzqproducta_models.QueryPreformanceSdlanzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_sdlanz_ex_async(request, headers, runtime)

    def query_preformance_sdlanz_ex(
        self,
        request: jzqproducta_models.QueryPreformanceSdlanzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSdlanzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSdlanzResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.sdlanz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_sdlanz_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceSdlanzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSdlanzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSdlanzResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.sdlanz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_kkxxkf(
        self,
        request: jzqproducta_models.QueryPreformanceKkxxkfRequest,
    ) -> jzqproducta_models.QueryPreformanceKkxxkfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_kkxxkf_ex(request, headers, runtime)

    async def query_preformance_kkxxkf_async(
        self,
        request: jzqproducta_models.QueryPreformanceKkxxkfRequest,
    ) -> jzqproducta_models.QueryPreformanceKkxxkfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_kkxxkf_ex_async(request, headers, runtime)

    def query_preformance_kkxxkf_ex(
        self,
        request: jzqproducta_models.QueryPreformanceKkxxkfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKkxxkfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKkxxkfResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.kkxxkf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_kkxxkf_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceKkxxkfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKkxxkfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKkxxkfResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.kkxxkf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_eglmko(
        self,
        request: jzqproducta_models.QueryPreformanceEglmkoRequest,
    ) -> jzqproducta_models.QueryPreformanceEglmkoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_eglmko_ex(request, headers, runtime)

    async def query_preformance_eglmko_async(
        self,
        request: jzqproducta_models.QueryPreformanceEglmkoRequest,
    ) -> jzqproducta_models.QueryPreformanceEglmkoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_eglmko_ex_async(request, headers, runtime)

    def query_preformance_eglmko_ex(
        self,
        request: jzqproducta_models.QueryPreformanceEglmkoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEglmkoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEglmkoResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.eglmko.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_eglmko_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceEglmkoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEglmkoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEglmkoResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.eglmko.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_oquwum(
        self,
        request: jzqproducta_models.QueryPreformanceOquwumRequest,
    ) -> jzqproducta_models.QueryPreformanceOquwumResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_oquwum_ex(request, headers, runtime)

    async def query_preformance_oquwum_async(
        self,
        request: jzqproducta_models.QueryPreformanceOquwumRequest,
    ) -> jzqproducta_models.QueryPreformanceOquwumResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_oquwum_ex_async(request, headers, runtime)

    def query_preformance_oquwum_ex(
        self,
        request: jzqproducta_models.QueryPreformanceOquwumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceOquwumResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceOquwumResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.oquwum.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_oquwum_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceOquwumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceOquwumResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceOquwumResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.oquwum.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_gsnlkh(
        self,
        request: jzqproducta_models.QueryPreformanceGsnlkhRequest,
    ) -> jzqproducta_models.QueryPreformanceGsnlkhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_gsnlkh_ex(request, headers, runtime)

    async def query_preformance_gsnlkh_async(
        self,
        request: jzqproducta_models.QueryPreformanceGsnlkhRequest,
    ) -> jzqproducta_models.QueryPreformanceGsnlkhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_gsnlkh_ex_async(request, headers, runtime)

    def query_preformance_gsnlkh_ex(
        self,
        request: jzqproducta_models.QueryPreformanceGsnlkhRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGsnlkhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGsnlkhResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.gsnlkh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_gsnlkh_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceGsnlkhRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGsnlkhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGsnlkhResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.gsnlkh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ojswwd(
        self,
        request: jzqproducta_models.QueryPreformanceOjswwdRequest,
    ) -> jzqproducta_models.QueryPreformanceOjswwdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ojswwd_ex(request, headers, runtime)

    async def query_preformance_ojswwd_async(
        self,
        request: jzqproducta_models.QueryPreformanceOjswwdRequest,
    ) -> jzqproducta_models.QueryPreformanceOjswwdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ojswwd_ex_async(request, headers, runtime)

    def query_preformance_ojswwd_ex(
        self,
        request: jzqproducta_models.QueryPreformanceOjswwdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceOjswwdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceOjswwdResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ojswwd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ojswwd_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceOjswwdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceOjswwdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceOjswwdResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ojswwd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_lmpubp(
        self,
        request: jzqproducta_models.QueryPreformanceLmpubpRequest,
    ) -> jzqproducta_models.QueryPreformanceLmpubpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_lmpubp_ex(request, headers, runtime)

    async def query_preformance_lmpubp_async(
        self,
        request: jzqproducta_models.QueryPreformanceLmpubpRequest,
    ) -> jzqproducta_models.QueryPreformanceLmpubpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_lmpubp_ex_async(request, headers, runtime)

    def query_preformance_lmpubp_ex(
        self,
        request: jzqproducta_models.QueryPreformanceLmpubpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLmpubpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLmpubpResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.lmpubp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_lmpubp_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceLmpubpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLmpubpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLmpubpResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.lmpubp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_mvjqpq(
        self,
        request: jzqproducta_models.QueryPreformanceMvjqpqRequest,
    ) -> jzqproducta_models.QueryPreformanceMvjqpqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_mvjqpq_ex(request, headers, runtime)

    async def query_preformance_mvjqpq_async(
        self,
        request: jzqproducta_models.QueryPreformanceMvjqpqRequest,
    ) -> jzqproducta_models.QueryPreformanceMvjqpqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_mvjqpq_ex_async(request, headers, runtime)

    def query_preformance_mvjqpq_ex(
        self,
        request: jzqproducta_models.QueryPreformanceMvjqpqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMvjqpqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMvjqpqResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.mvjqpq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_mvjqpq_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceMvjqpqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMvjqpqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMvjqpqResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.mvjqpq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_upavrg(
        self,
        request: jzqproducta_models.QueryPreformanceUpavrgRequest,
    ) -> jzqproducta_models.QueryPreformanceUpavrgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_upavrg_ex(request, headers, runtime)

    async def query_preformance_upavrg_async(
        self,
        request: jzqproducta_models.QueryPreformanceUpavrgRequest,
    ) -> jzqproducta_models.QueryPreformanceUpavrgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_upavrg_ex_async(request, headers, runtime)

    def query_preformance_upavrg_ex(
        self,
        request: jzqproducta_models.QueryPreformanceUpavrgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUpavrgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUpavrgResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.upavrg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_upavrg_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceUpavrgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUpavrgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUpavrgResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.upavrg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_hovxvt(
        self,
        request: jzqproducta_models.QueryPreformanceHovxvtRequest,
    ) -> jzqproducta_models.QueryPreformanceHovxvtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_hovxvt_ex(request, headers, runtime)

    async def query_preformance_hovxvt_async(
        self,
        request: jzqproducta_models.QueryPreformanceHovxvtRequest,
    ) -> jzqproducta_models.QueryPreformanceHovxvtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_hovxvt_ex_async(request, headers, runtime)

    def query_preformance_hovxvt_ex(
        self,
        request: jzqproducta_models.QueryPreformanceHovxvtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHovxvtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHovxvtResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.hovxvt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_hovxvt_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceHovxvtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHovxvtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHovxvtResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.hovxvt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_lpgyzx(
        self,
        request: jzqproducta_models.QueryPreformanceLpgyzxRequest,
    ) -> jzqproducta_models.QueryPreformanceLpgyzxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_lpgyzx_ex(request, headers, runtime)

    async def query_preformance_lpgyzx_async(
        self,
        request: jzqproducta_models.QueryPreformanceLpgyzxRequest,
    ) -> jzqproducta_models.QueryPreformanceLpgyzxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_lpgyzx_ex_async(request, headers, runtime)

    def query_preformance_lpgyzx_ex(
        self,
        request: jzqproducta_models.QueryPreformanceLpgyzxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLpgyzxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLpgyzxResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.lpgyzx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_lpgyzx_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceLpgyzxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLpgyzxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLpgyzxResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.lpgyzx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_phleou(
        self,
        request: jzqproducta_models.QueryPreformancePhleouRequest,
    ) -> jzqproducta_models.QueryPreformancePhleouResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_phleou_ex(request, headers, runtime)

    async def query_preformance_phleou_async(
        self,
        request: jzqproducta_models.QueryPreformancePhleouRequest,
    ) -> jzqproducta_models.QueryPreformancePhleouResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_phleou_ex_async(request, headers, runtime)

    def query_preformance_phleou_ex(
        self,
        request: jzqproducta_models.QueryPreformancePhleouRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePhleouResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePhleouResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.phleou.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_phleou_ex_async(
        self,
        request: jzqproducta_models.QueryPreformancePhleouRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePhleouResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePhleouResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.phleou.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ezhhni(
        self,
        request: jzqproducta_models.QueryPreformanceEzhhniRequest,
    ) -> jzqproducta_models.QueryPreformanceEzhhniResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ezhhni_ex(request, headers, runtime)

    async def query_preformance_ezhhni_async(
        self,
        request: jzqproducta_models.QueryPreformanceEzhhniRequest,
    ) -> jzqproducta_models.QueryPreformanceEzhhniResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ezhhni_ex_async(request, headers, runtime)

    def query_preformance_ezhhni_ex(
        self,
        request: jzqproducta_models.QueryPreformanceEzhhniRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEzhhniResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEzhhniResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ezhhni.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ezhhni_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceEzhhniRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEzhhniResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEzhhniResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ezhhni.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_vmkgga(
        self,
        request: jzqproducta_models.QueryPreformanceVmkggaRequest,
    ) -> jzqproducta_models.QueryPreformanceVmkggaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_vmkgga_ex(request, headers, runtime)

    async def query_preformance_vmkgga_async(
        self,
        request: jzqproducta_models.QueryPreformanceVmkggaRequest,
    ) -> jzqproducta_models.QueryPreformanceVmkggaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_vmkgga_ex_async(request, headers, runtime)

    def query_preformance_vmkgga_ex(
        self,
        request: jzqproducta_models.QueryPreformanceVmkggaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVmkggaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVmkggaResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.vmkgga.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_vmkgga_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceVmkggaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVmkggaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVmkggaResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.vmkgga.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_sbsurx(
        self,
        request: jzqproducta_models.QueryPreformanceSbsurxRequest,
    ) -> jzqproducta_models.QueryPreformanceSbsurxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_sbsurx_ex(request, headers, runtime)

    async def query_preformance_sbsurx_async(
        self,
        request: jzqproducta_models.QueryPreformanceSbsurxRequest,
    ) -> jzqproducta_models.QueryPreformanceSbsurxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_sbsurx_ex_async(request, headers, runtime)

    def query_preformance_sbsurx_ex(
        self,
        request: jzqproducta_models.QueryPreformanceSbsurxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSbsurxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSbsurxResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.sbsurx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_sbsurx_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceSbsurxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSbsurxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSbsurxResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.sbsurx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_gxqzrq(
        self,
        request: jzqproducta_models.QueryPreformanceGxqzrqRequest,
    ) -> jzqproducta_models.QueryPreformanceGxqzrqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_gxqzrq_ex(request, headers, runtime)

    async def query_preformance_gxqzrq_async(
        self,
        request: jzqproducta_models.QueryPreformanceGxqzrqRequest,
    ) -> jzqproducta_models.QueryPreformanceGxqzrqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_gxqzrq_ex_async(request, headers, runtime)

    def query_preformance_gxqzrq_ex(
        self,
        request: jzqproducta_models.QueryPreformanceGxqzrqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGxqzrqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGxqzrqResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.gxqzrq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_gxqzrq_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceGxqzrqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGxqzrqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGxqzrqResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.gxqzrq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_hvgdsq(
        self,
        request: jzqproducta_models.QueryPreformanceHvgdsqRequest,
    ) -> jzqproducta_models.QueryPreformanceHvgdsqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_hvgdsq_ex(request, headers, runtime)

    async def query_preformance_hvgdsq_async(
        self,
        request: jzqproducta_models.QueryPreformanceHvgdsqRequest,
    ) -> jzqproducta_models.QueryPreformanceHvgdsqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_hvgdsq_ex_async(request, headers, runtime)

    def query_preformance_hvgdsq_ex(
        self,
        request: jzqproducta_models.QueryPreformanceHvgdsqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHvgdsqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHvgdsqResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.hvgdsq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_hvgdsq_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceHvgdsqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHvgdsqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHvgdsqResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.hvgdsq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_katrmi(
        self,
        request: jzqproducta_models.QueryPreformanceKatrmiRequest,
    ) -> jzqproducta_models.QueryPreformanceKatrmiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_katrmi_ex(request, headers, runtime)

    async def query_preformance_katrmi_async(
        self,
        request: jzqproducta_models.QueryPreformanceKatrmiRequest,
    ) -> jzqproducta_models.QueryPreformanceKatrmiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_katrmi_ex_async(request, headers, runtime)

    def query_preformance_katrmi_ex(
        self,
        request: jzqproducta_models.QueryPreformanceKatrmiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKatrmiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKatrmiResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.katrmi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_katrmi_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceKatrmiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKatrmiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKatrmiResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.katrmi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_rdkcqd(
        self,
        request: jzqproducta_models.QueryPreformanceRdkcqdRequest,
    ) -> jzqproducta_models.QueryPreformanceRdkcqdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_rdkcqd_ex(request, headers, runtime)

    async def query_preformance_rdkcqd_async(
        self,
        request: jzqproducta_models.QueryPreformanceRdkcqdRequest,
    ) -> jzqproducta_models.QueryPreformanceRdkcqdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_rdkcqd_ex_async(request, headers, runtime)

    def query_preformance_rdkcqd_ex(
        self,
        request: jzqproducta_models.QueryPreformanceRdkcqdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceRdkcqdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceRdkcqdResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.rdkcqd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_rdkcqd_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceRdkcqdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceRdkcqdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceRdkcqdResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.rdkcqd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ydpsao(
        self,
        request: jzqproducta_models.QueryPreformanceYdpsaoRequest,
    ) -> jzqproducta_models.QueryPreformanceYdpsaoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ydpsao_ex(request, headers, runtime)

    async def query_preformance_ydpsao_async(
        self,
        request: jzqproducta_models.QueryPreformanceYdpsaoRequest,
    ) -> jzqproducta_models.QueryPreformanceYdpsaoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ydpsao_ex_async(request, headers, runtime)

    def query_preformance_ydpsao_ex(
        self,
        request: jzqproducta_models.QueryPreformanceYdpsaoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYdpsaoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYdpsaoResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ydpsao.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ydpsao_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceYdpsaoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYdpsaoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYdpsaoResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ydpsao.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_fbqfgd(
        self,
        request: jzqproducta_models.QueryPreformanceFbqfgdRequest,
    ) -> jzqproducta_models.QueryPreformanceFbqfgdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_fbqfgd_ex(request, headers, runtime)

    async def query_preformance_fbqfgd_async(
        self,
        request: jzqproducta_models.QueryPreformanceFbqfgdRequest,
    ) -> jzqproducta_models.QueryPreformanceFbqfgdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_fbqfgd_ex_async(request, headers, runtime)

    def query_preformance_fbqfgd_ex(
        self,
        request: jzqproducta_models.QueryPreformanceFbqfgdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFbqfgdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFbqfgdResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.fbqfgd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_fbqfgd_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceFbqfgdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFbqfgdResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFbqfgdResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.fbqfgd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_vyqznv(
        self,
        request: jzqproducta_models.QueryPreformanceVyqznvRequest,
    ) -> jzqproducta_models.QueryPreformanceVyqznvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_vyqznv_ex(request, headers, runtime)

    async def query_preformance_vyqznv_async(
        self,
        request: jzqproducta_models.QueryPreformanceVyqznvRequest,
    ) -> jzqproducta_models.QueryPreformanceVyqznvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_vyqznv_ex_async(request, headers, runtime)

    def query_preformance_vyqznv_ex(
        self,
        request: jzqproducta_models.QueryPreformanceVyqznvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVyqznvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVyqznvResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.vyqznv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_vyqznv_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceVyqznvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVyqznvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVyqznvResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.vyqznv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_iwhkbp(
        self,
        request: jzqproducta_models.QueryPreformanceIwhkbpRequest,
    ) -> jzqproducta_models.QueryPreformanceIwhkbpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_iwhkbp_ex(request, headers, runtime)

    async def query_preformance_iwhkbp_async(
        self,
        request: jzqproducta_models.QueryPreformanceIwhkbpRequest,
    ) -> jzqproducta_models.QueryPreformanceIwhkbpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_iwhkbp_ex_async(request, headers, runtime)

    def query_preformance_iwhkbp_ex(
        self,
        request: jzqproducta_models.QueryPreformanceIwhkbpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIwhkbpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIwhkbpResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.iwhkbp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_iwhkbp_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceIwhkbpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIwhkbpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIwhkbpResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.iwhkbp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_gcavtc(
        self,
        request: jzqproducta_models.QueryPreformanceGcavtcRequest,
    ) -> jzqproducta_models.QueryPreformanceGcavtcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_gcavtc_ex(request, headers, runtime)

    async def query_preformance_gcavtc_async(
        self,
        request: jzqproducta_models.QueryPreformanceGcavtcRequest,
    ) -> jzqproducta_models.QueryPreformanceGcavtcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_gcavtc_ex_async(request, headers, runtime)

    def query_preformance_gcavtc_ex(
        self,
        request: jzqproducta_models.QueryPreformanceGcavtcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGcavtcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGcavtcResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.gcavtc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_gcavtc_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceGcavtcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGcavtcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGcavtcResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.gcavtc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_eigmbu(
        self,
        request: jzqproducta_models.QueryPreformanceEigmbuRequest,
    ) -> jzqproducta_models.QueryPreformanceEigmbuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_eigmbu_ex(request, headers, runtime)

    async def query_preformance_eigmbu_async(
        self,
        request: jzqproducta_models.QueryPreformanceEigmbuRequest,
    ) -> jzqproducta_models.QueryPreformanceEigmbuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_eigmbu_ex_async(request, headers, runtime)

    def query_preformance_eigmbu_ex(
        self,
        request: jzqproducta_models.QueryPreformanceEigmbuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEigmbuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEigmbuResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.eigmbu.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_eigmbu_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceEigmbuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEigmbuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEigmbuResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.eigmbu.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_nsxzrq(
        self,
        request: jzqproducta_models.QueryPreformanceNsxzrqRequest,
    ) -> jzqproducta_models.QueryPreformanceNsxzrqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_nsxzrq_ex(request, headers, runtime)

    async def query_preformance_nsxzrq_async(
        self,
        request: jzqproducta_models.QueryPreformanceNsxzrqRequest,
    ) -> jzqproducta_models.QueryPreformanceNsxzrqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_nsxzrq_ex_async(request, headers, runtime)

    def query_preformance_nsxzrq_ex(
        self,
        request: jzqproducta_models.QueryPreformanceNsxzrqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceNsxzrqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceNsxzrqResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.nsxzrq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_nsxzrq_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceNsxzrqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceNsxzrqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceNsxzrqResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.nsxzrq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_hzlepw(
        self,
        request: jzqproducta_models.QueryPreformanceHzlepwRequest,
    ) -> jzqproducta_models.QueryPreformanceHzlepwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_hzlepw_ex(request, headers, runtime)

    async def query_preformance_hzlepw_async(
        self,
        request: jzqproducta_models.QueryPreformanceHzlepwRequest,
    ) -> jzqproducta_models.QueryPreformanceHzlepwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_hzlepw_ex_async(request, headers, runtime)

    def query_preformance_hzlepw_ex(
        self,
        request: jzqproducta_models.QueryPreformanceHzlepwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHzlepwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHzlepwResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.hzlepw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_hzlepw_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceHzlepwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHzlepwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHzlepwResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.hzlepw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_upoctv(
        self,
        request: jzqproducta_models.QueryPreformanceUpoctvRequest,
    ) -> jzqproducta_models.QueryPreformanceUpoctvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_upoctv_ex(request, headers, runtime)

    async def query_preformance_upoctv_async(
        self,
        request: jzqproducta_models.QueryPreformanceUpoctvRequest,
    ) -> jzqproducta_models.QueryPreformanceUpoctvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_upoctv_ex_async(request, headers, runtime)

    def query_preformance_upoctv_ex(
        self,
        request: jzqproducta_models.QueryPreformanceUpoctvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUpoctvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUpoctvResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.upoctv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_upoctv_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceUpoctvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUpoctvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUpoctvResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.upoctv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_pdyotj(
        self,
        request: jzqproducta_models.QueryPreformancePdyotjRequest,
    ) -> jzqproducta_models.QueryPreformancePdyotjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_pdyotj_ex(request, headers, runtime)

    async def query_preformance_pdyotj_async(
        self,
        request: jzqproducta_models.QueryPreformancePdyotjRequest,
    ) -> jzqproducta_models.QueryPreformancePdyotjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_pdyotj_ex_async(request, headers, runtime)

    def query_preformance_pdyotj_ex(
        self,
        request: jzqproducta_models.QueryPreformancePdyotjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePdyotjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePdyotjResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.pdyotj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_pdyotj_ex_async(
        self,
        request: jzqproducta_models.QueryPreformancePdyotjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePdyotjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePdyotjResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.pdyotj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_qfhcuy(
        self,
        request: jzqproducta_models.QueryPreformanceQfhcuyRequest,
    ) -> jzqproducta_models.QueryPreformanceQfhcuyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_qfhcuy_ex(request, headers, runtime)

    async def query_preformance_qfhcuy_async(
        self,
        request: jzqproducta_models.QueryPreformanceQfhcuyRequest,
    ) -> jzqproducta_models.QueryPreformanceQfhcuyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_qfhcuy_ex_async(request, headers, runtime)

    def query_preformance_qfhcuy_ex(
        self,
        request: jzqproducta_models.QueryPreformanceQfhcuyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQfhcuyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQfhcuyResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.qfhcuy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_qfhcuy_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceQfhcuyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQfhcuyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQfhcuyResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.qfhcuy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_juynkn(
        self,
        request: jzqproducta_models.QueryPreformanceJuynknRequest,
    ) -> jzqproducta_models.QueryPreformanceJuynknResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_juynkn_ex(request, headers, runtime)

    async def query_preformance_juynkn_async(
        self,
        request: jzqproducta_models.QueryPreformanceJuynknRequest,
    ) -> jzqproducta_models.QueryPreformanceJuynknResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_juynkn_ex_async(request, headers, runtime)

    def query_preformance_juynkn_ex(
        self,
        request: jzqproducta_models.QueryPreformanceJuynknRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJuynknResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJuynknResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.juynkn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_juynkn_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceJuynknRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJuynknResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJuynknResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.juynkn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_txdmeo(
        self,
        request: jzqproducta_models.QueryPreformanceTxdmeoRequest,
    ) -> jzqproducta_models.QueryPreformanceTxdmeoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_txdmeo_ex(request, headers, runtime)

    async def query_preformance_txdmeo_async(
        self,
        request: jzqproducta_models.QueryPreformanceTxdmeoRequest,
    ) -> jzqproducta_models.QueryPreformanceTxdmeoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_txdmeo_ex_async(request, headers, runtime)

    def query_preformance_txdmeo_ex(
        self,
        request: jzqproducta_models.QueryPreformanceTxdmeoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTxdmeoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTxdmeoResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.txdmeo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_txdmeo_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceTxdmeoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTxdmeoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTxdmeoResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.txdmeo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_kcjxng(
        self,
        request: jzqproducta_models.QueryPreformanceKcjxngRequest,
    ) -> jzqproducta_models.QueryPreformanceKcjxngResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_kcjxng_ex(request, headers, runtime)

    async def query_preformance_kcjxng_async(
        self,
        request: jzqproducta_models.QueryPreformanceKcjxngRequest,
    ) -> jzqproducta_models.QueryPreformanceKcjxngResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_kcjxng_ex_async(request, headers, runtime)

    def query_preformance_kcjxng_ex(
        self,
        request: jzqproducta_models.QueryPreformanceKcjxngRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKcjxngResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKcjxngResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.kcjxng.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_kcjxng_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceKcjxngRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceKcjxngResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceKcjxngResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.kcjxng.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_xyfytz(
        self,
        request: jzqproducta_models.QueryPreformanceXyfytzRequest,
    ) -> jzqproducta_models.QueryPreformanceXyfytzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_xyfytz_ex(request, headers, runtime)

    async def query_preformance_xyfytz_async(
        self,
        request: jzqproducta_models.QueryPreformanceXyfytzRequest,
    ) -> jzqproducta_models.QueryPreformanceXyfytzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_xyfytz_ex_async(request, headers, runtime)

    def query_preformance_xyfytz_ex(
        self,
        request: jzqproducta_models.QueryPreformanceXyfytzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXyfytzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXyfytzResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.xyfytz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_xyfytz_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceXyfytzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXyfytzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXyfytzResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.xyfytz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_hxmzyi(
        self,
        request: jzqproducta_models.QueryPreformanceHxmzyiRequest,
    ) -> jzqproducta_models.QueryPreformanceHxmzyiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_hxmzyi_ex(request, headers, runtime)

    async def query_preformance_hxmzyi_async(
        self,
        request: jzqproducta_models.QueryPreformanceHxmzyiRequest,
    ) -> jzqproducta_models.QueryPreformanceHxmzyiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_hxmzyi_ex_async(request, headers, runtime)

    def query_preformance_hxmzyi_ex(
        self,
        request: jzqproducta_models.QueryPreformanceHxmzyiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHxmzyiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHxmzyiResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.hxmzyi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_hxmzyi_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceHxmzyiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHxmzyiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHxmzyiResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.hxmzyi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_sxdzlb(
        self,
        request: jzqproducta_models.QueryPreformanceSxdzlbRequest,
    ) -> jzqproducta_models.QueryPreformanceSxdzlbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_sxdzlb_ex(request, headers, runtime)

    async def query_preformance_sxdzlb_async(
        self,
        request: jzqproducta_models.QueryPreformanceSxdzlbRequest,
    ) -> jzqproducta_models.QueryPreformanceSxdzlbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_sxdzlb_ex_async(request, headers, runtime)

    def query_preformance_sxdzlb_ex(
        self,
        request: jzqproducta_models.QueryPreformanceSxdzlbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSxdzlbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSxdzlbResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.sxdzlb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_sxdzlb_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceSxdzlbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSxdzlbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSxdzlbResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.sxdzlb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_zmuzkg(
        self,
        request: jzqproducta_models.QueryPreformanceZmuzkgRequest,
    ) -> jzqproducta_models.QueryPreformanceZmuzkgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_zmuzkg_ex(request, headers, runtime)

    async def query_preformance_zmuzkg_async(
        self,
        request: jzqproducta_models.QueryPreformanceZmuzkgRequest,
    ) -> jzqproducta_models.QueryPreformanceZmuzkgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_zmuzkg_ex_async(request, headers, runtime)

    def query_preformance_zmuzkg_ex(
        self,
        request: jzqproducta_models.QueryPreformanceZmuzkgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZmuzkgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZmuzkgResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.zmuzkg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_zmuzkg_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceZmuzkgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZmuzkgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZmuzkgResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.zmuzkg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_aiojyz(
        self,
        request: jzqproducta_models.QueryPreformanceAiojyzRequest,
    ) -> jzqproducta_models.QueryPreformanceAiojyzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_aiojyz_ex(request, headers, runtime)

    async def query_preformance_aiojyz_async(
        self,
        request: jzqproducta_models.QueryPreformanceAiojyzRequest,
    ) -> jzqproducta_models.QueryPreformanceAiojyzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_aiojyz_ex_async(request, headers, runtime)

    def query_preformance_aiojyz_ex(
        self,
        request: jzqproducta_models.QueryPreformanceAiojyzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAiojyzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAiojyzResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.aiojyz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_aiojyz_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceAiojyzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAiojyzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAiojyzResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.aiojyz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_qxhgml(
        self,
        request: jzqproducta_models.QueryPreformanceQxhgmlRequest,
    ) -> jzqproducta_models.QueryPreformanceQxhgmlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_qxhgml_ex(request, headers, runtime)

    async def query_preformance_qxhgml_async(
        self,
        request: jzqproducta_models.QueryPreformanceQxhgmlRequest,
    ) -> jzqproducta_models.QueryPreformanceQxhgmlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_qxhgml_ex_async(request, headers, runtime)

    def query_preformance_qxhgml_ex(
        self,
        request: jzqproducta_models.QueryPreformanceQxhgmlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQxhgmlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQxhgmlResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.qxhgml.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_qxhgml_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceQxhgmlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceQxhgmlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceQxhgmlResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.qxhgml.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ubklss(
        self,
        request: jzqproducta_models.QueryPreformanceUbklssRequest,
    ) -> jzqproducta_models.QueryPreformanceUbklssResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ubklss_ex(request, headers, runtime)

    async def query_preformance_ubklss_async(
        self,
        request: jzqproducta_models.QueryPreformanceUbklssRequest,
    ) -> jzqproducta_models.QueryPreformanceUbklssResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ubklss_ex_async(request, headers, runtime)

    def query_preformance_ubklss_ex(
        self,
        request: jzqproducta_models.QueryPreformanceUbklssRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUbklssResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUbklssResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ubklss.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ubklss_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceUbklssRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUbklssResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUbklssResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ubklss.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_gcavnv(
        self,
        request: jzqproducta_models.QueryPreformanceGcavnvRequest,
    ) -> jzqproducta_models.QueryPreformanceGcavnvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_gcavnv_ex(request, headers, runtime)

    async def query_preformance_gcavnv_async(
        self,
        request: jzqproducta_models.QueryPreformanceGcavnvRequest,
    ) -> jzqproducta_models.QueryPreformanceGcavnvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_gcavnv_ex_async(request, headers, runtime)

    def query_preformance_gcavnv_ex(
        self,
        request: jzqproducta_models.QueryPreformanceGcavnvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGcavnvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGcavnvResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.gcavnv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_gcavnv_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceGcavnvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGcavnvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGcavnvResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.gcavnv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ucybsn(
        self,
        request: jzqproducta_models.QueryPreformanceUcybsnRequest,
    ) -> jzqproducta_models.QueryPreformanceUcybsnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ucybsn_ex(request, headers, runtime)

    async def query_preformance_ucybsn_async(
        self,
        request: jzqproducta_models.QueryPreformanceUcybsnRequest,
    ) -> jzqproducta_models.QueryPreformanceUcybsnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ucybsn_ex_async(request, headers, runtime)

    def query_preformance_ucybsn_ex(
        self,
        request: jzqproducta_models.QueryPreformanceUcybsnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUcybsnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUcybsnResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ucybsn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ucybsn_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceUcybsnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUcybsnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUcybsnResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ucybsn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_azwtos(
        self,
        request: jzqproducta_models.QueryPreformanceAzwtosRequest,
    ) -> jzqproducta_models.QueryPreformanceAzwtosResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_azwtos_ex(request, headers, runtime)

    async def query_preformance_azwtos_async(
        self,
        request: jzqproducta_models.QueryPreformanceAzwtosRequest,
    ) -> jzqproducta_models.QueryPreformanceAzwtosResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_azwtos_ex_async(request, headers, runtime)

    def query_preformance_azwtos_ex(
        self,
        request: jzqproducta_models.QueryPreformanceAzwtosRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAzwtosResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAzwtosResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.azwtos.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_azwtos_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceAzwtosRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAzwtosResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAzwtosResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.azwtos.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_wrbbyt(
        self,
        request: jzqproducta_models.QueryPreformanceWrbbytRequest,
    ) -> jzqproducta_models.QueryPreformanceWrbbytResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_wrbbyt_ex(request, headers, runtime)

    async def query_preformance_wrbbyt_async(
        self,
        request: jzqproducta_models.QueryPreformanceWrbbytRequest,
    ) -> jzqproducta_models.QueryPreformanceWrbbytResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_wrbbyt_ex_async(request, headers, runtime)

    def query_preformance_wrbbyt_ex(
        self,
        request: jzqproducta_models.QueryPreformanceWrbbytRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceWrbbytResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceWrbbytResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.wrbbyt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_wrbbyt_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceWrbbytRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceWrbbytResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceWrbbytResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.wrbbyt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ivbcwv(
        self,
        request: jzqproducta_models.QueryPreformanceIvbcwvRequest,
    ) -> jzqproducta_models.QueryPreformanceIvbcwvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ivbcwv_ex(request, headers, runtime)

    async def query_preformance_ivbcwv_async(
        self,
        request: jzqproducta_models.QueryPreformanceIvbcwvRequest,
    ) -> jzqproducta_models.QueryPreformanceIvbcwvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ivbcwv_ex_async(request, headers, runtime)

    def query_preformance_ivbcwv_ex(
        self,
        request: jzqproducta_models.QueryPreformanceIvbcwvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIvbcwvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIvbcwvResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ivbcwv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ivbcwv_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceIvbcwvRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIvbcwvResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIvbcwvResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ivbcwv.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_tvcsig(
        self,
        request: jzqproducta_models.QueryPreformanceTvcsigRequest,
    ) -> jzqproducta_models.QueryPreformanceTvcsigResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_tvcsig_ex(request, headers, runtime)

    async def query_preformance_tvcsig_async(
        self,
        request: jzqproducta_models.QueryPreformanceTvcsigRequest,
    ) -> jzqproducta_models.QueryPreformanceTvcsigResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_tvcsig_ex_async(request, headers, runtime)

    def query_preformance_tvcsig_ex(
        self,
        request: jzqproducta_models.QueryPreformanceTvcsigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTvcsigResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTvcsigResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.tvcsig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_tvcsig_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceTvcsigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceTvcsigResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceTvcsigResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.tvcsig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_vvsvkx(
        self,
        request: jzqproducta_models.QueryPreformanceVvsvkxRequest,
    ) -> jzqproducta_models.QueryPreformanceVvsvkxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_vvsvkx_ex(request, headers, runtime)

    async def query_preformance_vvsvkx_async(
        self,
        request: jzqproducta_models.QueryPreformanceVvsvkxRequest,
    ) -> jzqproducta_models.QueryPreformanceVvsvkxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_vvsvkx_ex_async(request, headers, runtime)

    def query_preformance_vvsvkx_ex(
        self,
        request: jzqproducta_models.QueryPreformanceVvsvkxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVvsvkxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVvsvkxResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.vvsvkx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_vvsvkx_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceVvsvkxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVvsvkxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVvsvkxResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.vvsvkx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_rxetnj(
        self,
        request: jzqproducta_models.QueryPreformanceRxetnjRequest,
    ) -> jzqproducta_models.QueryPreformanceRxetnjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_rxetnj_ex(request, headers, runtime)

    async def query_preformance_rxetnj_async(
        self,
        request: jzqproducta_models.QueryPreformanceRxetnjRequest,
    ) -> jzqproducta_models.QueryPreformanceRxetnjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_rxetnj_ex_async(request, headers, runtime)

    def query_preformance_rxetnj_ex(
        self,
        request: jzqproducta_models.QueryPreformanceRxetnjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceRxetnjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceRxetnjResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.rxetnj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_rxetnj_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceRxetnjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceRxetnjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceRxetnjResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.rxetnj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_dulefc(
        self,
        request: jzqproducta_models.QueryPreformanceDulefcRequest,
    ) -> jzqproducta_models.QueryPreformanceDulefcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_dulefc_ex(request, headers, runtime)

    async def query_preformance_dulefc_async(
        self,
        request: jzqproducta_models.QueryPreformanceDulefcRequest,
    ) -> jzqproducta_models.QueryPreformanceDulefcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_dulefc_ex_async(request, headers, runtime)

    def query_preformance_dulefc_ex(
        self,
        request: jzqproducta_models.QueryPreformanceDulefcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDulefcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDulefcResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.dulefc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_dulefc_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceDulefcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDulefcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDulefcResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.dulefc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_jsazbw(
        self,
        request: jzqproducta_models.QueryPreformanceJsazbwRequest,
    ) -> jzqproducta_models.QueryPreformanceJsazbwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_jsazbw_ex(request, headers, runtime)

    async def query_preformance_jsazbw_async(
        self,
        request: jzqproducta_models.QueryPreformanceJsazbwRequest,
    ) -> jzqproducta_models.QueryPreformanceJsazbwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_jsazbw_ex_async(request, headers, runtime)

    def query_preformance_jsazbw_ex(
        self,
        request: jzqproducta_models.QueryPreformanceJsazbwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJsazbwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJsazbwResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.jsazbw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_jsazbw_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceJsazbwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJsazbwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJsazbwResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.jsazbw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_xhzfca(
        self,
        request: jzqproducta_models.QueryPreformanceXhzfcaRequest,
    ) -> jzqproducta_models.QueryPreformanceXhzfcaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_xhzfca_ex(request, headers, runtime)

    async def query_preformance_xhzfca_async(
        self,
        request: jzqproducta_models.QueryPreformanceXhzfcaRequest,
    ) -> jzqproducta_models.QueryPreformanceXhzfcaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_xhzfca_ex_async(request, headers, runtime)

    def query_preformance_xhzfca_ex(
        self,
        request: jzqproducta_models.QueryPreformanceXhzfcaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXhzfcaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXhzfcaResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.xhzfca.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_xhzfca_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceXhzfcaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXhzfcaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXhzfcaResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.xhzfca.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_dgzghr(
        self,
        request: jzqproducta_models.QueryPreformanceDgzghrRequest,
    ) -> jzqproducta_models.QueryPreformanceDgzghrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_dgzghr_ex(request, headers, runtime)

    async def query_preformance_dgzghr_async(
        self,
        request: jzqproducta_models.QueryPreformanceDgzghrRequest,
    ) -> jzqproducta_models.QueryPreformanceDgzghrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_dgzghr_ex_async(request, headers, runtime)

    def query_preformance_dgzghr_ex(
        self,
        request: jzqproducta_models.QueryPreformanceDgzghrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDgzghrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDgzghrResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.dgzghr.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_dgzghr_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceDgzghrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDgzghrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDgzghrResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.dgzghr.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_dmjttz(
        self,
        request: jzqproducta_models.QueryPreformanceDmjttzRequest,
    ) -> jzqproducta_models.QueryPreformanceDmjttzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_dmjttz_ex(request, headers, runtime)

    async def query_preformance_dmjttz_async(
        self,
        request: jzqproducta_models.QueryPreformanceDmjttzRequest,
    ) -> jzqproducta_models.QueryPreformanceDmjttzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_dmjttz_ex_async(request, headers, runtime)

    def query_preformance_dmjttz_ex(
        self,
        request: jzqproducta_models.QueryPreformanceDmjttzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDmjttzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDmjttzResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.dmjttz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_dmjttz_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceDmjttzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDmjttzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDmjttzResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.dmjttz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_cahjgj(
        self,
        request: jzqproducta_models.QueryPreformanceCahjgjRequest,
    ) -> jzqproducta_models.QueryPreformanceCahjgjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_cahjgj_ex(request, headers, runtime)

    async def query_preformance_cahjgj_async(
        self,
        request: jzqproducta_models.QueryPreformanceCahjgjRequest,
    ) -> jzqproducta_models.QueryPreformanceCahjgjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_cahjgj_ex_async(request, headers, runtime)

    def query_preformance_cahjgj_ex(
        self,
        request: jzqproducta_models.QueryPreformanceCahjgjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceCahjgjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceCahjgjResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.cahjgj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_cahjgj_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceCahjgjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceCahjgjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceCahjgjResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.cahjgj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_rjbfvt(
        self,
        request: jzqproducta_models.QueryPreformanceRjbfvtRequest,
    ) -> jzqproducta_models.QueryPreformanceRjbfvtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_rjbfvt_ex(request, headers, runtime)

    async def query_preformance_rjbfvt_async(
        self,
        request: jzqproducta_models.QueryPreformanceRjbfvtRequest,
    ) -> jzqproducta_models.QueryPreformanceRjbfvtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_rjbfvt_ex_async(request, headers, runtime)

    def query_preformance_rjbfvt_ex(
        self,
        request: jzqproducta_models.QueryPreformanceRjbfvtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceRjbfvtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceRjbfvtResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.rjbfvt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_rjbfvt_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceRjbfvtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceRjbfvtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceRjbfvtResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.rjbfvt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_aywijl(
        self,
        request: jzqproducta_models.QueryPreformanceAywijlRequest,
    ) -> jzqproducta_models.QueryPreformanceAywijlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_aywijl_ex(request, headers, runtime)

    async def query_preformance_aywijl_async(
        self,
        request: jzqproducta_models.QueryPreformanceAywijlRequest,
    ) -> jzqproducta_models.QueryPreformanceAywijlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_aywijl_ex_async(request, headers, runtime)

    def query_preformance_aywijl_ex(
        self,
        request: jzqproducta_models.QueryPreformanceAywijlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAywijlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAywijlResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.aywijl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_aywijl_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceAywijlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAywijlResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAywijlResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.aywijl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_bcjihi(
        self,
        request: jzqproducta_models.QueryPreformanceBcjihiRequest,
    ) -> jzqproducta_models.QueryPreformanceBcjihiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_bcjihi_ex(request, headers, runtime)

    async def query_preformance_bcjihi_async(
        self,
        request: jzqproducta_models.QueryPreformanceBcjihiRequest,
    ) -> jzqproducta_models.QueryPreformanceBcjihiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_bcjihi_ex_async(request, headers, runtime)

    def query_preformance_bcjihi_ex(
        self,
        request: jzqproducta_models.QueryPreformanceBcjihiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceBcjihiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceBcjihiResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.bcjihi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_bcjihi_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceBcjihiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceBcjihiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceBcjihiResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.bcjihi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_vewdbw(
        self,
        request: jzqproducta_models.QueryPreformanceVewdbwRequest,
    ) -> jzqproducta_models.QueryPreformanceVewdbwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_vewdbw_ex(request, headers, runtime)

    async def query_preformance_vewdbw_async(
        self,
        request: jzqproducta_models.QueryPreformanceVewdbwRequest,
    ) -> jzqproducta_models.QueryPreformanceVewdbwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_vewdbw_ex_async(request, headers, runtime)

    def query_preformance_vewdbw_ex(
        self,
        request: jzqproducta_models.QueryPreformanceVewdbwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVewdbwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVewdbwResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.vewdbw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_vewdbw_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceVewdbwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVewdbwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVewdbwResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.vewdbw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_wgbntj(
        self,
        request: jzqproducta_models.QueryPreformanceWgbntjRequest,
    ) -> jzqproducta_models.QueryPreformanceWgbntjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_wgbntj_ex(request, headers, runtime)

    async def query_preformance_wgbntj_async(
        self,
        request: jzqproducta_models.QueryPreformanceWgbntjRequest,
    ) -> jzqproducta_models.QueryPreformanceWgbntjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_wgbntj_ex_async(request, headers, runtime)

    def query_preformance_wgbntj_ex(
        self,
        request: jzqproducta_models.QueryPreformanceWgbntjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceWgbntjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceWgbntjResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.wgbntj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_wgbntj_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceWgbntjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceWgbntjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceWgbntjResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.wgbntj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_dwzzxq(
        self,
        request: jzqproducta_models.QueryPreformanceDwzzxqRequest,
    ) -> jzqproducta_models.QueryPreformanceDwzzxqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_dwzzxq_ex(request, headers, runtime)

    async def query_preformance_dwzzxq_async(
        self,
        request: jzqproducta_models.QueryPreformanceDwzzxqRequest,
    ) -> jzqproducta_models.QueryPreformanceDwzzxqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_dwzzxq_ex_async(request, headers, runtime)

    def query_preformance_dwzzxq_ex(
        self,
        request: jzqproducta_models.QueryPreformanceDwzzxqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDwzzxqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDwzzxqResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.dwzzxq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_dwzzxq_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceDwzzxqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceDwzzxqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceDwzzxqResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.dwzzxq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_mhldih(
        self,
        request: jzqproducta_models.QueryPreformanceMhldihRequest,
    ) -> jzqproducta_models.QueryPreformanceMhldihResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_mhldih_ex(request, headers, runtime)

    async def query_preformance_mhldih_async(
        self,
        request: jzqproducta_models.QueryPreformanceMhldihRequest,
    ) -> jzqproducta_models.QueryPreformanceMhldihResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_mhldih_ex_async(request, headers, runtime)

    def query_preformance_mhldih_ex(
        self,
        request: jzqproducta_models.QueryPreformanceMhldihRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMhldihResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMhldihResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.mhldih.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_mhldih_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceMhldihRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMhldihResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMhldihResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.mhldih.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_utivei(
        self,
        request: jzqproducta_models.QueryPreformanceUtiveiRequest,
    ) -> jzqproducta_models.QueryPreformanceUtiveiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_utivei_ex(request, headers, runtime)

    async def query_preformance_utivei_async(
        self,
        request: jzqproducta_models.QueryPreformanceUtiveiRequest,
    ) -> jzqproducta_models.QueryPreformanceUtiveiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_utivei_ex_async(request, headers, runtime)

    def query_preformance_utivei_ex(
        self,
        request: jzqproducta_models.QueryPreformanceUtiveiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUtiveiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUtiveiResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.utivei.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_utivei_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceUtiveiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUtiveiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUtiveiResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.utivei.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_prgtxg(
        self,
        request: jzqproducta_models.QueryPreformancePrgtxgRequest,
    ) -> jzqproducta_models.QueryPreformancePrgtxgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_prgtxg_ex(request, headers, runtime)

    async def query_preformance_prgtxg_async(
        self,
        request: jzqproducta_models.QueryPreformancePrgtxgRequest,
    ) -> jzqproducta_models.QueryPreformancePrgtxgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_prgtxg_ex_async(request, headers, runtime)

    def query_preformance_prgtxg_ex(
        self,
        request: jzqproducta_models.QueryPreformancePrgtxgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePrgtxgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePrgtxgResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.prgtxg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_prgtxg_ex_async(
        self,
        request: jzqproducta_models.QueryPreformancePrgtxgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePrgtxgResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePrgtxgResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.prgtxg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_xezxoy(
        self,
        request: jzqproducta_models.QueryPreformanceXezxoyRequest,
    ) -> jzqproducta_models.QueryPreformanceXezxoyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_xezxoy_ex(request, headers, runtime)

    async def query_preformance_xezxoy_async(
        self,
        request: jzqproducta_models.QueryPreformanceXezxoyRequest,
    ) -> jzqproducta_models.QueryPreformanceXezxoyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_xezxoy_ex_async(request, headers, runtime)

    def query_preformance_xezxoy_ex(
        self,
        request: jzqproducta_models.QueryPreformanceXezxoyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXezxoyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXezxoyResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.xezxoy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_xezxoy_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceXezxoyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXezxoyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXezxoyResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.xezxoy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_chnteu(
        self,
        request: jzqproducta_models.QueryPreformanceChnteuRequest,
    ) -> jzqproducta_models.QueryPreformanceChnteuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_chnteu_ex(request, headers, runtime)

    async def query_preformance_chnteu_async(
        self,
        request: jzqproducta_models.QueryPreformanceChnteuRequest,
    ) -> jzqproducta_models.QueryPreformanceChnteuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_chnteu_ex_async(request, headers, runtime)

    def query_preformance_chnteu_ex(
        self,
        request: jzqproducta_models.QueryPreformanceChnteuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceChnteuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceChnteuResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.chnteu.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_chnteu_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceChnteuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceChnteuResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceChnteuResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.chnteu.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_gzbbbc(
        self,
        request: jzqproducta_models.QueryPreformanceGzbbbcRequest,
    ) -> jzqproducta_models.QueryPreformanceGzbbbcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_gzbbbc_ex(request, headers, runtime)

    async def query_preformance_gzbbbc_async(
        self,
        request: jzqproducta_models.QueryPreformanceGzbbbcRequest,
    ) -> jzqproducta_models.QueryPreformanceGzbbbcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_gzbbbc_ex_async(request, headers, runtime)

    def query_preformance_gzbbbc_ex(
        self,
        request: jzqproducta_models.QueryPreformanceGzbbbcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGzbbbcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGzbbbcResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.gzbbbc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_gzbbbc_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceGzbbbcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGzbbbcResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGzbbbcResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.gzbbbc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_edwgsr(
        self,
        request: jzqproducta_models.QueryPreformanceEdwgsrRequest,
    ) -> jzqproducta_models.QueryPreformanceEdwgsrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_edwgsr_ex(request, headers, runtime)

    async def query_preformance_edwgsr_async(
        self,
        request: jzqproducta_models.QueryPreformanceEdwgsrRequest,
    ) -> jzqproducta_models.QueryPreformanceEdwgsrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_edwgsr_ex_async(request, headers, runtime)

    def query_preformance_edwgsr_ex(
        self,
        request: jzqproducta_models.QueryPreformanceEdwgsrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEdwgsrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEdwgsrResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.edwgsr.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_edwgsr_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceEdwgsrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEdwgsrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEdwgsrResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.edwgsr.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_edmasf(
        self,
        request: jzqproducta_models.QueryPreformanceEdmasfRequest,
    ) -> jzqproducta_models.QueryPreformanceEdmasfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_edmasf_ex(request, headers, runtime)

    async def query_preformance_edmasf_async(
        self,
        request: jzqproducta_models.QueryPreformanceEdmasfRequest,
    ) -> jzqproducta_models.QueryPreformanceEdmasfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_edmasf_ex_async(request, headers, runtime)

    def query_preformance_edmasf_ex(
        self,
        request: jzqproducta_models.QueryPreformanceEdmasfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEdmasfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEdmasfResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.edmasf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_edmasf_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceEdmasfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEdmasfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEdmasfResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.edmasf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_zzwagi(
        self,
        request: jzqproducta_models.QueryPreformanceZzwagiRequest,
    ) -> jzqproducta_models.QueryPreformanceZzwagiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_zzwagi_ex(request, headers, runtime)

    async def query_preformance_zzwagi_async(
        self,
        request: jzqproducta_models.QueryPreformanceZzwagiRequest,
    ) -> jzqproducta_models.QueryPreformanceZzwagiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_zzwagi_ex_async(request, headers, runtime)

    def query_preformance_zzwagi_ex(
        self,
        request: jzqproducta_models.QueryPreformanceZzwagiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZzwagiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZzwagiResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.zzwagi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_zzwagi_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceZzwagiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceZzwagiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceZzwagiResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.zzwagi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_hlgygq(
        self,
        request: jzqproducta_models.QueryPreformanceHlgygqRequest,
    ) -> jzqproducta_models.QueryPreformanceHlgygqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_hlgygq_ex(request, headers, runtime)

    async def query_preformance_hlgygq_async(
        self,
        request: jzqproducta_models.QueryPreformanceHlgygqRequest,
    ) -> jzqproducta_models.QueryPreformanceHlgygqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_hlgygq_ex_async(request, headers, runtime)

    def query_preformance_hlgygq_ex(
        self,
        request: jzqproducta_models.QueryPreformanceHlgygqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHlgygqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHlgygqResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.hlgygq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_hlgygq_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceHlgygqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHlgygqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHlgygqResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.hlgygq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_xajpki(
        self,
        request: jzqproducta_models.QueryPreformanceXajpkiRequest,
    ) -> jzqproducta_models.QueryPreformanceXajpkiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_xajpki_ex(request, headers, runtime)

    async def query_preformance_xajpki_async(
        self,
        request: jzqproducta_models.QueryPreformanceXajpkiRequest,
    ) -> jzqproducta_models.QueryPreformanceXajpkiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_xajpki_ex_async(request, headers, runtime)

    def query_preformance_xajpki_ex(
        self,
        request: jzqproducta_models.QueryPreformanceXajpkiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXajpkiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXajpkiResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.xajpki.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_xajpki_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceXajpkiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceXajpkiResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceXajpkiResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.xajpki.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_owjbho(
        self,
        request: jzqproducta_models.QueryPreformanceOwjbhoRequest,
    ) -> jzqproducta_models.QueryPreformanceOwjbhoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_owjbho_ex(request, headers, runtime)

    async def query_preformance_owjbho_async(
        self,
        request: jzqproducta_models.QueryPreformanceOwjbhoRequest,
    ) -> jzqproducta_models.QueryPreformanceOwjbhoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_owjbho_ex_async(request, headers, runtime)

    def query_preformance_owjbho_ex(
        self,
        request: jzqproducta_models.QueryPreformanceOwjbhoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceOwjbhoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceOwjbhoResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.owjbho.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_owjbho_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceOwjbhoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceOwjbhoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceOwjbhoResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.owjbho.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ecvcwy(
        self,
        request: jzqproducta_models.QueryPreformanceEcvcwyRequest,
    ) -> jzqproducta_models.QueryPreformanceEcvcwyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ecvcwy_ex(request, headers, runtime)

    async def query_preformance_ecvcwy_async(
        self,
        request: jzqproducta_models.QueryPreformanceEcvcwyRequest,
    ) -> jzqproducta_models.QueryPreformanceEcvcwyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ecvcwy_ex_async(request, headers, runtime)

    def query_preformance_ecvcwy_ex(
        self,
        request: jzqproducta_models.QueryPreformanceEcvcwyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEcvcwyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEcvcwyResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ecvcwy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ecvcwy_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceEcvcwyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEcvcwyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEcvcwyResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ecvcwy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_wxvpvm(
        self,
        request: jzqproducta_models.QueryPreformanceWxvpvmRequest,
    ) -> jzqproducta_models.QueryPreformanceWxvpvmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_wxvpvm_ex(request, headers, runtime)

    async def query_preformance_wxvpvm_async(
        self,
        request: jzqproducta_models.QueryPreformanceWxvpvmRequest,
    ) -> jzqproducta_models.QueryPreformanceWxvpvmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_wxvpvm_ex_async(request, headers, runtime)

    def query_preformance_wxvpvm_ex(
        self,
        request: jzqproducta_models.QueryPreformanceWxvpvmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceWxvpvmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceWxvpvmResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.wxvpvm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_wxvpvm_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceWxvpvmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceWxvpvmResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceWxvpvmResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.wxvpvm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_itjtfb(
        self,
        request: jzqproducta_models.QueryPreformanceItjtfbRequest,
    ) -> jzqproducta_models.QueryPreformanceItjtfbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_itjtfb_ex(request, headers, runtime)

    async def query_preformance_itjtfb_async(
        self,
        request: jzqproducta_models.QueryPreformanceItjtfbRequest,
    ) -> jzqproducta_models.QueryPreformanceItjtfbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_itjtfb_ex_async(request, headers, runtime)

    def query_preformance_itjtfb_ex(
        self,
        request: jzqproducta_models.QueryPreformanceItjtfbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceItjtfbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceItjtfbResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.itjtfb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_itjtfb_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceItjtfbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceItjtfbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceItjtfbResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.itjtfb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_cvlthh(
        self,
        request: jzqproducta_models.QueryPreformanceCvlthhRequest,
    ) -> jzqproducta_models.QueryPreformanceCvlthhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_cvlthh_ex(request, headers, runtime)

    async def query_preformance_cvlthh_async(
        self,
        request: jzqproducta_models.QueryPreformanceCvlthhRequest,
    ) -> jzqproducta_models.QueryPreformanceCvlthhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_cvlthh_ex_async(request, headers, runtime)

    def query_preformance_cvlthh_ex(
        self,
        request: jzqproducta_models.QueryPreformanceCvlthhRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceCvlthhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceCvlthhResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.cvlthh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_cvlthh_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceCvlthhRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceCvlthhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceCvlthhResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.cvlthh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_mnedeh(
        self,
        request: jzqproducta_models.QueryPreformanceMnedehRequest,
    ) -> jzqproducta_models.QueryPreformanceMnedehResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_mnedeh_ex(request, headers, runtime)

    async def query_preformance_mnedeh_async(
        self,
        request: jzqproducta_models.QueryPreformanceMnedehRequest,
    ) -> jzqproducta_models.QueryPreformanceMnedehResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_mnedeh_ex_async(request, headers, runtime)

    def query_preformance_mnedeh_ex(
        self,
        request: jzqproducta_models.QueryPreformanceMnedehRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMnedehResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMnedehResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.mnedeh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_mnedeh_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceMnedehRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMnedehResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMnedehResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.mnedeh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_iisiwt(
        self,
        request: jzqproducta_models.QueryPreformanceIisiwtRequest,
    ) -> jzqproducta_models.QueryPreformanceIisiwtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_iisiwt_ex(request, headers, runtime)

    async def query_preformance_iisiwt_async(
        self,
        request: jzqproducta_models.QueryPreformanceIisiwtRequest,
    ) -> jzqproducta_models.QueryPreformanceIisiwtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_iisiwt_ex_async(request, headers, runtime)

    def query_preformance_iisiwt_ex(
        self,
        request: jzqproducta_models.QueryPreformanceIisiwtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIisiwtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIisiwtResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.iisiwt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_iisiwt_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceIisiwtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceIisiwtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceIisiwtResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.iisiwt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_nbdxum(
        self,
        request: jzqproducta_models.QueryPreformanceNbdxumRequest,
    ) -> jzqproducta_models.QueryPreformanceNbdxumResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_nbdxum_ex(request, headers, runtime)

    async def query_preformance_nbdxum_async(
        self,
        request: jzqproducta_models.QueryPreformanceNbdxumRequest,
    ) -> jzqproducta_models.QueryPreformanceNbdxumResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_nbdxum_ex_async(request, headers, runtime)

    def query_preformance_nbdxum_ex(
        self,
        request: jzqproducta_models.QueryPreformanceNbdxumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceNbdxumResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceNbdxumResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.nbdxum.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_nbdxum_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceNbdxumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceNbdxumResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceNbdxumResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.nbdxum.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_szsmht(
        self,
        request: jzqproducta_models.QueryPreformanceSzsmhtRequest,
    ) -> jzqproducta_models.QueryPreformanceSzsmhtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_szsmht_ex(request, headers, runtime)

    async def query_preformance_szsmht_async(
        self,
        request: jzqproducta_models.QueryPreformanceSzsmhtRequest,
    ) -> jzqproducta_models.QueryPreformanceSzsmhtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_szsmht_ex_async(request, headers, runtime)

    def query_preformance_szsmht_ex(
        self,
        request: jzqproducta_models.QueryPreformanceSzsmhtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSzsmhtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSzsmhtResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.szsmht.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_szsmht_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceSzsmhtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSzsmhtResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSzsmhtResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.szsmht.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_vfruka(
        self,
        request: jzqproducta_models.QueryPreformanceVfrukaRequest,
    ) -> jzqproducta_models.QueryPreformanceVfrukaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_vfruka_ex(request, headers, runtime)

    async def query_preformance_vfruka_async(
        self,
        request: jzqproducta_models.QueryPreformanceVfrukaRequest,
    ) -> jzqproducta_models.QueryPreformanceVfrukaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_vfruka_ex_async(request, headers, runtime)

    def query_preformance_vfruka_ex(
        self,
        request: jzqproducta_models.QueryPreformanceVfrukaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVfrukaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVfrukaResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.vfruka.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_vfruka_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceVfrukaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceVfrukaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceVfrukaResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.vfruka.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_gcvneh(
        self,
        request: jzqproducta_models.QueryPreformanceGcvnehRequest,
    ) -> jzqproducta_models.QueryPreformanceGcvnehResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_gcvneh_ex(request, headers, runtime)

    async def query_preformance_gcvneh_async(
        self,
        request: jzqproducta_models.QueryPreformanceGcvnehRequest,
    ) -> jzqproducta_models.QueryPreformanceGcvnehResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_gcvneh_ex_async(request, headers, runtime)

    def query_preformance_gcvneh_ex(
        self,
        request: jzqproducta_models.QueryPreformanceGcvnehRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGcvnehResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGcvnehResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.gcvneh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_gcvneh_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceGcvnehRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceGcvnehResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceGcvnehResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.gcvneh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_wmxlge(
        self,
        request: jzqproducta_models.QueryPreformanceWmxlgeRequest,
    ) -> jzqproducta_models.QueryPreformanceWmxlgeResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_wmxlge_ex(request, headers, runtime)

    async def query_preformance_wmxlge_async(
        self,
        request: jzqproducta_models.QueryPreformanceWmxlgeRequest,
    ) -> jzqproducta_models.QueryPreformanceWmxlgeResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_wmxlge_ex_async(request, headers, runtime)

    def query_preformance_wmxlge_ex(
        self,
        request: jzqproducta_models.QueryPreformanceWmxlgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceWmxlgeResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceWmxlgeResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.wmxlge.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_wmxlge_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceWmxlgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceWmxlgeResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceWmxlgeResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.wmxlge.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_lcsnas(
        self,
        request: jzqproducta_models.QueryPreformanceLcsnasRequest,
    ) -> jzqproducta_models.QueryPreformanceLcsnasResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_lcsnas_ex(request, headers, runtime)

    async def query_preformance_lcsnas_async(
        self,
        request: jzqproducta_models.QueryPreformanceLcsnasRequest,
    ) -> jzqproducta_models.QueryPreformanceLcsnasResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_lcsnas_ex_async(request, headers, runtime)

    def query_preformance_lcsnas_ex(
        self,
        request: jzqproducta_models.QueryPreformanceLcsnasRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLcsnasResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLcsnasResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.lcsnas.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_lcsnas_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceLcsnasRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLcsnasResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLcsnasResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.lcsnas.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_emfcan(
        self,
        request: jzqproducta_models.QueryPreformanceEmfcanRequest,
    ) -> jzqproducta_models.QueryPreformanceEmfcanResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_emfcan_ex(request, headers, runtime)

    async def query_preformance_emfcan_async(
        self,
        request: jzqproducta_models.QueryPreformanceEmfcanRequest,
    ) -> jzqproducta_models.QueryPreformanceEmfcanResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_emfcan_ex_async(request, headers, runtime)

    def query_preformance_emfcan_ex(
        self,
        request: jzqproducta_models.QueryPreformanceEmfcanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEmfcanResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEmfcanResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.emfcan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_emfcan_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceEmfcanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEmfcanResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEmfcanResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.emfcan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_hmgrsy(
        self,
        request: jzqproducta_models.QueryPreformanceHmgrsyRequest,
    ) -> jzqproducta_models.QueryPreformanceHmgrsyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_hmgrsy_ex(request, headers, runtime)

    async def query_preformance_hmgrsy_async(
        self,
        request: jzqproducta_models.QueryPreformanceHmgrsyRequest,
    ) -> jzqproducta_models.QueryPreformanceHmgrsyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_hmgrsy_ex_async(request, headers, runtime)

    def query_preformance_hmgrsy_ex(
        self,
        request: jzqproducta_models.QueryPreformanceHmgrsyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHmgrsyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHmgrsyResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.hmgrsy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_hmgrsy_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceHmgrsyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHmgrsyResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHmgrsyResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.hmgrsy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_fgadhf(
        self,
        request: jzqproducta_models.QueryPreformanceFgadhfRequest,
    ) -> jzqproducta_models.QueryPreformanceFgadhfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_fgadhf_ex(request, headers, runtime)

    async def query_preformance_fgadhf_async(
        self,
        request: jzqproducta_models.QueryPreformanceFgadhfRequest,
    ) -> jzqproducta_models.QueryPreformanceFgadhfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_fgadhf_ex_async(request, headers, runtime)

    def query_preformance_fgadhf_ex(
        self,
        request: jzqproducta_models.QueryPreformanceFgadhfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFgadhfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFgadhfResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.fgadhf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_fgadhf_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceFgadhfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFgadhfResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFgadhfResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.fgadhf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_rmevfq(
        self,
        request: jzqproducta_models.QueryPreformanceRmevfqRequest,
    ) -> jzqproducta_models.QueryPreformanceRmevfqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_rmevfq_ex(request, headers, runtime)

    async def query_preformance_rmevfq_async(
        self,
        request: jzqproducta_models.QueryPreformanceRmevfqRequest,
    ) -> jzqproducta_models.QueryPreformanceRmevfqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_rmevfq_ex_async(request, headers, runtime)

    def query_preformance_rmevfq_ex(
        self,
        request: jzqproducta_models.QueryPreformanceRmevfqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceRmevfqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceRmevfqResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.rmevfq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_rmevfq_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceRmevfqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceRmevfqResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceRmevfqResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.rmevfq.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_elpwxx(
        self,
        request: jzqproducta_models.QueryPreformanceElpwxxRequest,
    ) -> jzqproducta_models.QueryPreformanceElpwxxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_elpwxx_ex(request, headers, runtime)

    async def query_preformance_elpwxx_async(
        self,
        request: jzqproducta_models.QueryPreformanceElpwxxRequest,
    ) -> jzqproducta_models.QueryPreformanceElpwxxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_elpwxx_ex_async(request, headers, runtime)

    def query_preformance_elpwxx_ex(
        self,
        request: jzqproducta_models.QueryPreformanceElpwxxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceElpwxxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceElpwxxResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.elpwxx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_elpwxx_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceElpwxxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceElpwxxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceElpwxxResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.elpwxx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_aislle(
        self,
        request: jzqproducta_models.QueryPreformanceAislleRequest,
    ) -> jzqproducta_models.QueryPreformanceAislleResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_aislle_ex(request, headers, runtime)

    async def query_preformance_aislle_async(
        self,
        request: jzqproducta_models.QueryPreformanceAislleRequest,
    ) -> jzqproducta_models.QueryPreformanceAislleResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_aislle_ex_async(request, headers, runtime)

    def query_preformance_aislle_ex(
        self,
        request: jzqproducta_models.QueryPreformanceAislleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAislleResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAislleResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.aislle.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_aislle_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceAislleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAislleResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAislleResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.aislle.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_fbupco(
        self,
        request: jzqproducta_models.QueryPreformanceFbupcoRequest,
    ) -> jzqproducta_models.QueryPreformanceFbupcoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_fbupco_ex(request, headers, runtime)

    async def query_preformance_fbupco_async(
        self,
        request: jzqproducta_models.QueryPreformanceFbupcoRequest,
    ) -> jzqproducta_models.QueryPreformanceFbupcoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_fbupco_ex_async(request, headers, runtime)

    def query_preformance_fbupco_ex(
        self,
        request: jzqproducta_models.QueryPreformanceFbupcoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFbupcoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFbupcoResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.fbupco.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_fbupco_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceFbupcoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceFbupcoResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceFbupcoResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.fbupco.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_solifa(
        self,
        request: jzqproducta_models.QueryPreformanceSolifaRequest,
    ) -> jzqproducta_models.QueryPreformanceSolifaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_solifa_ex(request, headers, runtime)

    async def query_preformance_solifa_async(
        self,
        request: jzqproducta_models.QueryPreformanceSolifaRequest,
    ) -> jzqproducta_models.QueryPreformanceSolifaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_solifa_ex_async(request, headers, runtime)

    def query_preformance_solifa_ex(
        self,
        request: jzqproducta_models.QueryPreformanceSolifaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSolifaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSolifaResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.solifa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_solifa_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceSolifaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceSolifaResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceSolifaResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.solifa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ecowvh(
        self,
        request: jzqproducta_models.QueryPreformanceEcowvhRequest,
    ) -> jzqproducta_models.QueryPreformanceEcowvhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ecowvh_ex(request, headers, runtime)

    async def query_preformance_ecowvh_async(
        self,
        request: jzqproducta_models.QueryPreformanceEcowvhRequest,
    ) -> jzqproducta_models.QueryPreformanceEcowvhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ecowvh_ex_async(request, headers, runtime)

    def query_preformance_ecowvh_ex(
        self,
        request: jzqproducta_models.QueryPreformanceEcowvhRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEcowvhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEcowvhResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ecowvh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ecowvh_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceEcowvhRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceEcowvhResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceEcowvhResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ecowvh.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_mudnye(
        self,
        request: jzqproducta_models.QueryPreformanceMudnyeRequest,
    ) -> jzqproducta_models.QueryPreformanceMudnyeResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_mudnye_ex(request, headers, runtime)

    async def query_preformance_mudnye_async(
        self,
        request: jzqproducta_models.QueryPreformanceMudnyeRequest,
    ) -> jzqproducta_models.QueryPreformanceMudnyeResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_mudnye_ex_async(request, headers, runtime)

    def query_preformance_mudnye_ex(
        self,
        request: jzqproducta_models.QueryPreformanceMudnyeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMudnyeResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMudnyeResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.mudnye.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_mudnye_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceMudnyeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceMudnyeResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceMudnyeResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.mudnye.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_lswaxk(
        self,
        request: jzqproducta_models.QueryPreformanceLswaxkRequest,
    ) -> jzqproducta_models.QueryPreformanceLswaxkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_lswaxk_ex(request, headers, runtime)

    async def query_preformance_lswaxk_async(
        self,
        request: jzqproducta_models.QueryPreformanceLswaxkRequest,
    ) -> jzqproducta_models.QueryPreformanceLswaxkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_lswaxk_ex_async(request, headers, runtime)

    def query_preformance_lswaxk_ex(
        self,
        request: jzqproducta_models.QueryPreformanceLswaxkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLswaxkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLswaxkResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.lswaxk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_lswaxk_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceLswaxkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLswaxkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLswaxkResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.lswaxk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_aruxng(
        self,
        request: jzqproducta_models.QueryPreformanceAruxngRequest,
    ) -> jzqproducta_models.QueryPreformanceAruxngResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_aruxng_ex(request, headers, runtime)

    async def query_preformance_aruxng_async(
        self,
        request: jzqproducta_models.QueryPreformanceAruxngRequest,
    ) -> jzqproducta_models.QueryPreformanceAruxngResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_aruxng_ex_async(request, headers, runtime)

    def query_preformance_aruxng_ex(
        self,
        request: jzqproducta_models.QueryPreformanceAruxngRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAruxngResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAruxngResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.aruxng.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_aruxng_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceAruxngRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceAruxngResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceAruxngResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.aruxng.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_hbnwdp(
        self,
        request: jzqproducta_models.QueryPreformanceHbnwdpRequest,
    ) -> jzqproducta_models.QueryPreformanceHbnwdpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_hbnwdp_ex(request, headers, runtime)

    async def query_preformance_hbnwdp_async(
        self,
        request: jzqproducta_models.QueryPreformanceHbnwdpRequest,
    ) -> jzqproducta_models.QueryPreformanceHbnwdpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_hbnwdp_ex_async(request, headers, runtime)

    def query_preformance_hbnwdp_ex(
        self,
        request: jzqproducta_models.QueryPreformanceHbnwdpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHbnwdpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHbnwdpResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.hbnwdp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_hbnwdp_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceHbnwdpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHbnwdpResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHbnwdpResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.hbnwdp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ufdptn(
        self,
        request: jzqproducta_models.QueryPreformanceUfdptnRequest,
    ) -> jzqproducta_models.QueryPreformanceUfdptnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ufdptn_ex(request, headers, runtime)

    async def query_preformance_ufdptn_async(
        self,
        request: jzqproducta_models.QueryPreformanceUfdptnRequest,
    ) -> jzqproducta_models.QueryPreformanceUfdptnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ufdptn_ex_async(request, headers, runtime)

    def query_preformance_ufdptn_ex(
        self,
        request: jzqproducta_models.QueryPreformanceUfdptnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUfdptnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUfdptnResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ufdptn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ufdptn_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceUfdptnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceUfdptnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceUfdptnResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ufdptn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_reyqjr(
        self,
        request: jzqproducta_models.QueryPreformanceReyqjrRequest,
    ) -> jzqproducta_models.QueryPreformanceReyqjrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_reyqjr_ex(request, headers, runtime)

    async def query_preformance_reyqjr_async(
        self,
        request: jzqproducta_models.QueryPreformanceReyqjrRequest,
    ) -> jzqproducta_models.QueryPreformanceReyqjrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_reyqjr_ex_async(request, headers, runtime)

    def query_preformance_reyqjr_ex(
        self,
        request: jzqproducta_models.QueryPreformanceReyqjrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceReyqjrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceReyqjrResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.reyqjr.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_reyqjr_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceReyqjrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceReyqjrResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceReyqjrResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.reyqjr.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_wtxvtj(
        self,
        request: jzqproducta_models.QueryPreformanceWtxvtjRequest,
    ) -> jzqproducta_models.QueryPreformanceWtxvtjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_wtxvtj_ex(request, headers, runtime)

    async def query_preformance_wtxvtj_async(
        self,
        request: jzqproducta_models.QueryPreformanceWtxvtjRequest,
    ) -> jzqproducta_models.QueryPreformanceWtxvtjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_wtxvtj_ex_async(request, headers, runtime)

    def query_preformance_wtxvtj_ex(
        self,
        request: jzqproducta_models.QueryPreformanceWtxvtjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceWtxvtjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceWtxvtjResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.wtxvtj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_wtxvtj_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceWtxvtjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceWtxvtjResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceWtxvtjResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.wtxvtj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ljbjmk(
        self,
        request: jzqproducta_models.QueryPreformanceLjbjmkRequest,
    ) -> jzqproducta_models.QueryPreformanceLjbjmkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ljbjmk_ex(request, headers, runtime)

    async def query_preformance_ljbjmk_async(
        self,
        request: jzqproducta_models.QueryPreformanceLjbjmkRequest,
    ) -> jzqproducta_models.QueryPreformanceLjbjmkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ljbjmk_ex_async(request, headers, runtime)

    def query_preformance_ljbjmk_ex(
        self,
        request: jzqproducta_models.QueryPreformanceLjbjmkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLjbjmkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLjbjmkResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ljbjmk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ljbjmk_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceLjbjmkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceLjbjmkResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceLjbjmkResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ljbjmk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_cryfwz(
        self,
        request: jzqproducta_models.QueryPreformanceCryfwzRequest,
    ) -> jzqproducta_models.QueryPreformanceCryfwzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_cryfwz_ex(request, headers, runtime)

    async def query_preformance_cryfwz_async(
        self,
        request: jzqproducta_models.QueryPreformanceCryfwzRequest,
    ) -> jzqproducta_models.QueryPreformanceCryfwzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_cryfwz_ex_async(request, headers, runtime)

    def query_preformance_cryfwz_ex(
        self,
        request: jzqproducta_models.QueryPreformanceCryfwzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceCryfwzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceCryfwzResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.cryfwz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_cryfwz_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceCryfwzRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceCryfwzResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceCryfwzResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.cryfwz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_pxnzuw(
        self,
        request: jzqproducta_models.QueryPreformancePxnzuwRequest,
    ) -> jzqproducta_models.QueryPreformancePxnzuwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_pxnzuw_ex(request, headers, runtime)

    async def query_preformance_pxnzuw_async(
        self,
        request: jzqproducta_models.QueryPreformancePxnzuwRequest,
    ) -> jzqproducta_models.QueryPreformancePxnzuwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_pxnzuw_ex_async(request, headers, runtime)

    def query_preformance_pxnzuw_ex(
        self,
        request: jzqproducta_models.QueryPreformancePxnzuwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePxnzuwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePxnzuwResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.pxnzuw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_pxnzuw_ex_async(
        self,
        request: jzqproducta_models.QueryPreformancePxnzuwRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePxnzuwResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePxnzuwResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.pxnzuw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_ppefnn(
        self,
        request: jzqproducta_models.QueryPreformancePpefnnRequest,
    ) -> jzqproducta_models.QueryPreformancePpefnnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_ppefnn_ex(request, headers, runtime)

    async def query_preformance_ppefnn_async(
        self,
        request: jzqproducta_models.QueryPreformancePpefnnRequest,
    ) -> jzqproducta_models.QueryPreformancePpefnnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_ppefnn_ex_async(request, headers, runtime)

    def query_preformance_ppefnn_ex(
        self,
        request: jzqproducta_models.QueryPreformancePpefnnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePpefnnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePpefnnResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.ppefnn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_ppefnn_ex_async(
        self,
        request: jzqproducta_models.QueryPreformancePpefnnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformancePpefnnResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformancePpefnnResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.ppefnn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_hhekdx(
        self,
        request: jzqproducta_models.QueryPreformanceHhekdxRequest,
    ) -> jzqproducta_models.QueryPreformanceHhekdxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_hhekdx_ex(request, headers, runtime)

    async def query_preformance_hhekdx_async(
        self,
        request: jzqproducta_models.QueryPreformanceHhekdxRequest,
    ) -> jzqproducta_models.QueryPreformanceHhekdxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_hhekdx_ex_async(request, headers, runtime)

    def query_preformance_hhekdx_ex(
        self,
        request: jzqproducta_models.QueryPreformanceHhekdxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHhekdxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHhekdxResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.hhekdx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_hhekdx_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceHhekdxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceHhekdxResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceHhekdxResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.hhekdx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_yirplb(
        self,
        request: jzqproducta_models.QueryPreformanceYirplbRequest,
    ) -> jzqproducta_models.QueryPreformanceYirplbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_yirplb_ex(request, headers, runtime)

    async def query_preformance_yirplb_async(
        self,
        request: jzqproducta_models.QueryPreformanceYirplbRequest,
    ) -> jzqproducta_models.QueryPreformanceYirplbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_yirplb_ex_async(request, headers, runtime)

    def query_preformance_yirplb_ex(
        self,
        request: jzqproducta_models.QueryPreformanceYirplbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYirplbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYirplbResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.yirplb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_yirplb_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceYirplbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceYirplbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceYirplbResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.yirplb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_preformance_jgxxvb(
        self,
        request: jzqproducta_models.QueryPreformanceJgxxvbRequest,
    ) -> jzqproducta_models.QueryPreformanceJgxxvbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_preformance_jgxxvb_ex(request, headers, runtime)

    async def query_preformance_jgxxvb_async(
        self,
        request: jzqproducta_models.QueryPreformanceJgxxvbRequest,
    ) -> jzqproducta_models.QueryPreformanceJgxxvbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_preformance_jgxxvb_ex_async(request, headers, runtime)

    def query_preformance_jgxxvb_ex(
        self,
        request: jzqproducta_models.QueryPreformanceJgxxvbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJgxxvbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJgxxvbResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.preformance.jgxxvb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_preformance_jgxxvb_ex_async(
        self,
        request: jzqproducta_models.QueryPreformanceJgxxvbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.QueryPreformanceJgxxvbResponse:
        """
        Description: 门户性能测试
        Summary: 门户性能测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.QueryPreformanceJgxxvbResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.preformance.jgxxvb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def api_create_http(
        self,
        request: jzqproducta_models.ApiCreateHttpRequest,
    ) -> jzqproducta_models.ApiCreateHttpResponse:
        """
        Description: 创建http协议api
        Summary: 创建http协议api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.api_create_http_ex(request, headers, runtime)

    async def api_create_http_async(
        self,
        request: jzqproducta_models.ApiCreateHttpRequest,
    ) -> jzqproducta_models.ApiCreateHttpResponse:
        """
        Description: 创建http协议api
        Summary: 创建http协议api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.api_create_http_ex_async(request, headers, runtime)

    def api_create_http_ex(
        self,
        request: jzqproducta_models.ApiCreateHttpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.ApiCreateHttpResponse:
        """
        Description: 创建http协议api
        Summary: 创建http协议api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.ApiCreateHttpResponse(),
            self.do_request('1.0', 'antdigital.jzqproducta.create.http.api', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def api_create_http_ex_async(
        self,
        request: jzqproducta_models.ApiCreateHttpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> jzqproducta_models.ApiCreateHttpResponse:
        """
        Description: 创建http协议api
        Summary: 创建http协议api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            jzqproducta_models.ApiCreateHttpResponse(),
            await self.do_request_async('1.0', 'antdigital.jzqproducta.create.http.api', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
