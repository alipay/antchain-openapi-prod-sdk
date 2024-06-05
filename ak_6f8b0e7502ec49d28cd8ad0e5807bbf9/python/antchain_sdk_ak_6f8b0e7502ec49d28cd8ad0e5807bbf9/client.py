# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_6f8b0e7502ec49d28cd8ad0e5807bbf9 import models as ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models
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
        config: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.Config,
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
                    '_prod_code': 'ak_6f8b0e7502ec49d28cd8ad0e5807bbf9',
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
                    '_prod_code': 'ak_6f8b0e7502ec49d28cd8ad0e5807bbf9',
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

    def query_demo_aaa_bbb_ccc(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAaaBbbCccRequest,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAaaBbbCccResponse:
        """
        Description: 自动化测试创建111
        Summary: 自动化测试创建（勿动）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_aaa_bbb_ccc_ex(request, headers, runtime)

    async def query_demo_aaa_bbb_ccc_async(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAaaBbbCccRequest,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAaaBbbCccResponse:
        """
        Description: 自动化测试创建111
        Summary: 自动化测试创建（勿动）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_aaa_bbb_ccc_ex_async(request, headers, runtime)

    def query_demo_aaa_bbb_ccc_ex(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAaaBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAaaBbbCccResponse:
        """
        Description: 自动化测试创建111
        Summary: 自动化测试创建（勿动）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAaaBbbCccResponse(),
            self.do_request('1.0', 'demo.aaa.bbb.ccc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_aaa_bbb_ccc_ex_async(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAaaBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAaaBbbCccResponse:
        """
        Description: 自动化测试创建111
        Summary: 自动化测试创建（勿动）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAaaBbbCccResponse(),
            await self.do_request_async('1.0', 'demo.aaa.bbb.ccc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_demo_aaa_bbb_ccd(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.BindDemoAaaBbbCcdRequest,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.BindDemoAaaBbbCcdResponse:
        """
        Description: 123
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_demo_aaa_bbb_ccd_ex(request, headers, runtime)

    async def bind_demo_aaa_bbb_ccd_async(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.BindDemoAaaBbbCcdRequest,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.BindDemoAaaBbbCcdResponse:
        """
        Description: 123
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_demo_aaa_bbb_ccd_ex_async(request, headers, runtime)

    def bind_demo_aaa_bbb_ccd_ex(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.BindDemoAaaBbbCcdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.BindDemoAaaBbbCcdResponse:
        """
        Description: 123
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.BindDemoAaaBbbCcdResponse(),
            self.do_request('1.0', 'demo.aaa.bbb.ccd.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_demo_aaa_bbb_ccd_ex_async(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.BindDemoAaaBbbCcdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.BindDemoAaaBbbCcdResponse:
        """
        Description: 123
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.BindDemoAaaBbbCcdResponse(),
            await self.do_request_async('1.0', 'demo.aaa.bbb.ccd.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_acopm_ato_withhold(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAcopmAtoWithholdRequest,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAcopmAtoWithholdResponse:
        """
        Description: 测试
        Summary: 测试ato异常
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_acopm_ato_withhold_ex(request, headers, runtime)

    async def query_demo_acopm_ato_withhold_async(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAcopmAtoWithholdRequest,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAcopmAtoWithholdResponse:
        """
        Description: 测试
        Summary: 测试ato异常
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_acopm_ato_withhold_ex_async(request, headers, runtime)

    def query_demo_acopm_ato_withhold_ex(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAcopmAtoWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAcopmAtoWithholdResponse:
        """
        Description: 测试
        Summary: 测试ato异常
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAcopmAtoWithholdResponse(),
            self.do_request('1.0', 'demo.acopm.ato.withhold.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_acopm_ato_withhold_ex_async(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAcopmAtoWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAcopmAtoWithholdResponse:
        """
        Description: 测试
        Summary: 测试ato异常
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoAcopmAtoWithholdResponse(),
            await self.do_request_async('1.0', 'demo.acopm.ato.withhold.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_apdevcenter_testobject_testsub(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubRequest,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_apdevcenter_testobject_testsub_ex(request, headers, runtime)

    async def query_demo_apdevcenter_testobject_testsub_async(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubRequest,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_apdevcenter_testobject_testsub_ex_async(request, headers, runtime)

    def query_demo_apdevcenter_testobject_testsub_ex(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubResponse(),
            self.do_request('1.0', 'demo.apdevcenter.testobject.testsub.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_apdevcenter_testobject_testsub_ex_async(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubResponse(),
            await self.do_request_async('1.0', 'demo.apdevcenter.testobject.testsub.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_apdevcenter_testobject_testsuba(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubaRequest,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubaResponse:
        """
        Description: testtest
        Summary: 新增API测试查询接口(只是测试使用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_apdevcenter_testobject_testsuba_ex(request, headers, runtime)

    async def query_demo_apdevcenter_testobject_testsuba_async(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubaRequest,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubaResponse:
        """
        Description: testtest
        Summary: 新增API测试查询接口(只是测试使用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_apdevcenter_testobject_testsuba_ex_async(request, headers, runtime)

    def query_demo_apdevcenter_testobject_testsuba_ex(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubaResponse:
        """
        Description: testtest
        Summary: 新增API测试查询接口(只是测试使用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubaResponse(),
            self.do_request('1.0', 'demo.apdevcenter.testobject.testsuba.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_apdevcenter_testobject_testsuba_ex_async(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubaResponse:
        """
        Description: testtest
        Summary: 新增API测试查询接口(只是测试使用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoApdevcenterTestobjectTestsubaResponse(),
            await self.do_request_async('1.0', 'demo.apdevcenter.testobject.testsuba.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_testproduct_testobject_testsubaaa(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoTestproductTestobjectTestsubaaaRequest,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoTestproductTestobjectTestsubaaaResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_testproduct_testobject_testsubaaa_ex(request, headers, runtime)

    async def query_demo_testproduct_testobject_testsubaaa_async(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoTestproductTestobjectTestsubaaaRequest,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoTestproductTestobjectTestsubaaaResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_testproduct_testobject_testsubaaa_ex_async(request, headers, runtime)

    def query_demo_testproduct_testobject_testsubaaa_ex(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoTestproductTestobjectTestsubaaaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoTestproductTestobjectTestsubaaaResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoTestproductTestobjectTestsubaaaResponse(),
            self.do_request('1.0', 'demo.testproduct.testobject.testsubaaa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_testproduct_testobject_testsubaaa_ex_async(
        self,
        request: ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoTestproductTestobjectTestsubaaaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoTestproductTestobjectTestsubaaaResponse:
        """
        Description: test
        Summary: 新增API测试查询接口(只是测试使用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6f_8b_0e_7502ec_49d_28cd_8ad_0e_5807bbf_9_models.QueryDemoTestproductTestobjectTestsubaaaResponse(),
            await self.do_request_async('1.0', 'demo.testproduct.testobject.testsubaaa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
