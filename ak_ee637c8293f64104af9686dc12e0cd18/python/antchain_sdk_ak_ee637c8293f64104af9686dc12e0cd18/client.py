# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_ee637c8293f64104af9686dc12e0cd18 import models as ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models
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
        config: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.Config,
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
            # 大安全佐罗测试接口结构体
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
                    'sdk_version': '1.0.2',
                    '_prod_code': 'ak_ee637c8293f64104af9686dc12e0cd18',
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
            'ignoreSSL': runtime.ignore_ssl,
            # 大安全佐罗测试接口结构体
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
                    'sdk_version': '1.0.2',
                    '_prod_code': 'ak_ee637c8293f64104af9686dc12e0cd18',
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

    def bind_demo_sss_ss_ss(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSssSsSsRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSssSsSsResponse:
        """
        Description: sss
        Summary: ss
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_demo_sss_ss_ss_ex(request, headers, runtime)

    async def bind_demo_sss_ss_ss_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSssSsSsRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSssSsSsResponse:
        """
        Description: sss
        Summary: ss
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_demo_sss_ss_ss_ex_async(request, headers, runtime)

    def bind_demo_sss_ss_ss_ex(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSssSsSsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSssSsSsResponse:
        """
        Description: sss
        Summary: ss
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSssSsSsResponse(),
            self.do_request('1.0', 'demo.sss.ss.ss.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_demo_sss_ss_ss_ex_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSssSsSsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSssSsSsResponse:
        """
        Description: sss
        Summary: ss
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSssSsSsResponse(),
            await self.do_request_async('1.0', 'demo.sss.ss.ss.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_demo_test_test_test(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoTestTestTestRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoTestTestTestResponse:
        """
        Description: testaaa
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_demo_test_test_test_ex(request, headers, runtime)

    async def bind_demo_test_test_test_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoTestTestTestRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoTestTestTestResponse:
        """
        Description: testaaa
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_demo_test_test_test_ex_async(request, headers, runtime)

    def bind_demo_test_test_test_ex(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoTestTestTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoTestTestTestResponse:
        """
        Description: testaaa
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoTestTestTestResponse(),
            self.do_request('1.0', 'demo.test.test.test.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_demo_test_test_test_ex_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoTestTestTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoTestTestTestResponse:
        """
        Description: testaaa
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoTestTestTestResponse(),
            await self.do_request_async('1.0', 'demo.test.test.test.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_test_testobject_bbb(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestTestobjectBbbRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestTestobjectBbbResponse:
        """
        Description: 测试添加api
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_test_testobject_bbb_ex(request, headers, runtime)

    async def query_demo_test_testobject_bbb_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestTestobjectBbbRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestTestobjectBbbResponse:
        """
        Description: 测试添加api
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_test_testobject_bbb_ex_async(request, headers, runtime)

    def query_demo_test_testobject_bbb_ex(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestTestobjectBbbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestTestobjectBbbResponse:
        """
        Description: 测试添加api
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestTestobjectBbbResponse(),
            self.do_request('1.0', 'demo.test.testobject.bbb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_test_testobject_bbb_ex_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestTestobjectBbbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestTestobjectBbbResponse:
        """
        Description: 测试添加api
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestTestobjectBbbResponse(),
            await self.do_request_async('1.0', 'demo.test.testobject.bbb.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_demo_sdf_sss_sss(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSdfSssSssRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSdfSssSssResponse:
        """
        Description: sdf
        Summary: sdf
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_demo_sdf_sss_sss_ex(request, headers, runtime)

    async def bind_demo_sdf_sss_sss_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSdfSssSssRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSdfSssSssResponse:
        """
        Description: sdf
        Summary: sdf
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_demo_sdf_sss_sss_ex_async(request, headers, runtime)

    def bind_demo_sdf_sss_sss_ex(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSdfSssSssRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSdfSssSssResponse:
        """
        Description: sdf
        Summary: sdf
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSdfSssSssResponse(),
            self.do_request('1.0', 'demo.sdf.sss.sss.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_demo_sdf_sss_sss_ex_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSdfSssSssRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSdfSssSssResponse:
        """
        Description: sdf
        Summary: sdf
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.BindDemoSdfSssSssResponse(),
            await self.do_request_async('1.0', 'demo.sdf.sss.sss.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_demo_test_bizevent_message(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.RegisterDemoTestBizeventMessageRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.RegisterDemoTestBizeventMessageResponse:
        """
        Description: 随机测试
        Summary: 消息发送及消费
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_demo_test_bizevent_message_ex(request, headers, runtime)

    async def register_demo_test_bizevent_message_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.RegisterDemoTestBizeventMessageRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.RegisterDemoTestBizeventMessageResponse:
        """
        Description: 随机测试
        Summary: 消息发送及消费
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_demo_test_bizevent_message_ex_async(request, headers, runtime)

    def register_demo_test_bizevent_message_ex(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.RegisterDemoTestBizeventMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.RegisterDemoTestBizeventMessageResponse:
        """
        Description: 随机测试
        Summary: 消息发送及消费
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.RegisterDemoTestBizeventMessageResponse(),
            self.do_request('1.0', 'demo.test.bizevent.message.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_demo_test_bizevent_message_ex_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.RegisterDemoTestBizeventMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.RegisterDemoTestBizeventMessageResponse:
        """
        Description: 随机测试
        Summary: 消息发送及消费
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.RegisterDemoTestBizeventMessageResponse(),
            await self.do_request_async('1.0', 'demo.test.bizevent.message.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_cjtest_cj_res(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoCjtestCjResRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoCjtestCjResResponse:
        """
        Description: cj test
        Summary: cj test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_cjtest_cj_res_ex(request, headers, runtime)

    async def query_demo_cjtest_cj_res_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoCjtestCjResRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoCjtestCjResResponse:
        """
        Description: cj test
        Summary: cj test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_cjtest_cj_res_ex_async(request, headers, runtime)

    def query_demo_cjtest_cj_res_ex(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoCjtestCjResRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoCjtestCjResResponse:
        """
        Description: cj test
        Summary: cj test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoCjtestCjResResponse(),
            self.do_request('1.0', 'demo.cjtest.cj.res.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_cjtest_cj_res_ex_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoCjtestCjResRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoCjtestCjResResponse:
        """
        Description: cj test
        Summary: cj test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoCjtestCjResResponse(),
            await self.do_request_async('1.0', 'demo.cjtest.cj.res.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def publish_demo_saas_test_testc(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.PublishDemoSaasTestTestcRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.PublishDemoSaasTestTestcResponse:
        """
        Description: testc
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.publish_demo_saas_test_testc_ex(request, headers, runtime)

    async def publish_demo_saas_test_testc_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.PublishDemoSaasTestTestcRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.PublishDemoSaasTestTestcResponse:
        """
        Description: testc
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.publish_demo_saas_test_testc_ex_async(request, headers, runtime)

    def publish_demo_saas_test_testc_ex(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.PublishDemoSaasTestTestcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.PublishDemoSaasTestTestcResponse:
        """
        Description: testc
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.PublishDemoSaasTestTestcResponse(),
            self.do_request('1.0', 'demo.saas.test.testc.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def publish_demo_saas_test_testc_ex_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.PublishDemoSaasTestTestcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.PublishDemoSaasTestTestcResponse:
        """
        Description: testc
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.PublishDemoSaasTestTestcResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testc.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_demo_saas_test_testh(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTesthRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTesthResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_demo_saas_test_testh_ex(request, headers, runtime)

    async def create_demo_saas_test_testh_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTesthRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTesthResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_demo_saas_test_testh_ex_async(request, headers, runtime)

    def create_demo_saas_test_testh_ex(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTesthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTesthResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTesthResponse(),
            self.do_request('1.0', 'demo.saas.test.testh.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_demo_saas_test_testh_ex_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTesthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTesthResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTesthResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testh.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_demo_saas_test_testi(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTestiRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTestiResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_demo_saas_test_testi_ex(request, headers, runtime)

    async def create_demo_saas_test_testi_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTestiRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTestiResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_demo_saas_test_testi_ex_async(request, headers, runtime)

    def create_demo_saas_test_testi_ex(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTestiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTestiResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTestiResponse(),
            self.do_request('1.0', 'demo.saas.test.testi.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_demo_saas_test_testi_ex_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTestiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTestiResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.CreateDemoSaasTestTestiResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testi.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def replace_demo_saas_test_testj(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.ReplaceDemoSaasTestTestjRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.ReplaceDemoSaasTestTestjResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.replace_demo_saas_test_testj_ex(request, headers, runtime)

    async def replace_demo_saas_test_testj_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.ReplaceDemoSaasTestTestjRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.ReplaceDemoSaasTestTestjResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.replace_demo_saas_test_testj_ex_async(request, headers, runtime)

    def replace_demo_saas_test_testj_ex(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.ReplaceDemoSaasTestTestjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.ReplaceDemoSaasTestTestjResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.ReplaceDemoSaasTestTestjResponse(),
            self.do_request('1.0', 'demo.saas.test.testj.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def replace_demo_saas_test_testj_ex_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.ReplaceDemoSaasTestTestjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.ReplaceDemoSaasTestTestjResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.ReplaceDemoSaasTestTestjResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testj.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_testyy_q(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestyyQRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestyyQResponse:
        """
        Description: 2
        Summary: 2
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_testyy_qex(request, headers, runtime)

    async def query_demo_testyy_q_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestyyQRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestyyQResponse:
        """
        Description: 2
        Summary: 2
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_testyy_qex_async(request, headers, runtime)

    def query_demo_testyy_qex(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestyyQRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestyyQResponse:
        """
        Description: 2
        Summary: 2
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestyyQResponse(),
            self.do_request('1.0', 'demo.testyy.q.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_testyy_qex_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestyyQRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestyyQResponse:
        """
        Description: 2
        Summary: 2
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestyyQResponse(),
            await self.do_request_async('1.0', 'demo.testyy.q.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_testzz_q(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzQRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzQResponse:
        """
        Description: 1
        Summary: 1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_testzz_qex(request, headers, runtime)

    async def query_demo_testzz_q_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzQRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzQResponse:
        """
        Description: 1
        Summary: 1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_testzz_qex_async(request, headers, runtime)

    def query_demo_testzz_qex(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzQRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzQResponse:
        """
        Description: 1
        Summary: 1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzQResponse(),
            self.do_request('1.0', 'demo.testzz.q.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_testzz_qex_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzQRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzQResponse:
        """
        Description: 1
        Summary: 1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzQResponse(),
            await self.do_request_async('1.0', 'demo.testzz.q.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_testzzz_q(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzzQRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzzQResponse:
        """
        Description: 1
        Summary: 1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_testzzz_qex(request, headers, runtime)

    async def query_demo_testzzz_q_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzzQRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzzQResponse:
        """
        Description: 1
        Summary: 1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_testzzz_qex_async(request, headers, runtime)

    def query_demo_testzzz_qex(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzzQRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzzQResponse:
        """
        Description: 1
        Summary: 1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzzQResponse(),
            self.do_request('1.0', 'demo.testzzz.q.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_testzzz_qex_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzzQRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzzQResponse:
        """
        Description: 1
        Summary: 1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoTestzzzQResponse(),
            await self.do_request_async('1.0', 'demo.testzzz.q.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_zoloz_facecompare(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoZolozFacecompareRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoZolozFacecompareResponse:
        """
        Description: 测试佐罗接口
        Summary: 测试佐罗接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_zoloz_facecompare_ex(request, headers, runtime)

    async def query_demo_zoloz_facecompare_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoZolozFacecompareRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoZolozFacecompareResponse:
        """
        Description: 测试佐罗接口
        Summary: 测试佐罗接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_zoloz_facecompare_ex_async(request, headers, runtime)

    def query_demo_zoloz_facecompare_ex(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoZolozFacecompareRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoZolozFacecompareResponse:
        """
        Description: 测试佐罗接口
        Summary: 测试佐罗接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoZolozFacecompareResponse(),
            self.do_request('1.0', 'demo.zoloz.facecompare.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_zoloz_facecompare_ex_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoZolozFacecompareRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoZolozFacecompareResponse:
        """
        Description: 测试佐罗接口
        Summary: 测试佐罗接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoZolozFacecompareResponse(),
            await self.do_request_async('1.0', 'demo.zoloz.facecompare.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_xyz_demo_xxx(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoXyzDemoXxxRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoXyzDemoXxxResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_xyz_demo_xxx_ex(request, headers, runtime)

    async def query_demo_xyz_demo_xxx_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoXyzDemoXxxRequest,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoXyzDemoXxxResponse:
        """
        Description: test
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_xyz_demo_xxx_ex_async(request, headers, runtime)

    def query_demo_xyz_demo_xxx_ex(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoXyzDemoXxxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoXyzDemoXxxResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoXyzDemoXxxResponse(),
            self.do_request('1.0', 'demo.xyz.demo.xxx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_xyz_demo_xxx_ex_async(
        self,
        request: ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoXyzDemoXxxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoXyzDemoXxxResponse:
        """
        Description: test
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ee_637c_8293f_64104af_9686dc_12e_0cd_18_models.QueryDemoXyzDemoXxxResponse(),
            await self.do_request_async('1.0', 'demo.xyz.demo.xxx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
