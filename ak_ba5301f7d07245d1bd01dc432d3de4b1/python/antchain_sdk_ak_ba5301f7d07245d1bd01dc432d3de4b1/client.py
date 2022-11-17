# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_ba5301f7d07245d1bd01dc432d3de4b1 import models as ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models
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
        config: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.Config,
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
                    'sdk_version': '1.0.2',
                    '_prod_code': 'ak_ba5301f7d07245d1bd01dc432d3de4b1',
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
                    'sdk_version': '1.0.2',
                    '_prod_code': 'ak_ba5301f7d07245d1bd01dc432d3de4b1',
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

    def query_demo_saas_test_testa(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.QueryDemoSaasTestTestaRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.QueryDemoSaasTestTestaResponse:
        """
        Description: testa
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_saas_test_testa_ex(request, headers, runtime)

    async def query_demo_saas_test_testa_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.QueryDemoSaasTestTestaRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.QueryDemoSaasTestTestaResponse:
        """
        Description: testa
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_saas_test_testa_ex_async(request, headers, runtime)

    def query_demo_saas_test_testa_ex(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.QueryDemoSaasTestTestaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.QueryDemoSaasTestTestaResponse:
        """
        Description: testa
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.QueryDemoSaasTestTestaResponse(),
            self.do_request('1.0', 'demo.saas.test.testa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_saas_test_testa_ex_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.QueryDemoSaasTestTestaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.QueryDemoSaasTestTestaResponse:
        """
        Description: testa
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.QueryDemoSaasTestTestaResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testa.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_demo_saas_test_testb(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ImportDemoSaasTestTestbRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ImportDemoSaasTestTestbResponse:
        """
        Description: testB
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_demo_saas_test_testb_ex(request, headers, runtime)

    async def import_demo_saas_test_testb_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ImportDemoSaasTestTestbRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ImportDemoSaasTestTestbResponse:
        """
        Description: testB
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_demo_saas_test_testb_ex_async(request, headers, runtime)

    def import_demo_saas_test_testb_ex(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ImportDemoSaasTestTestbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ImportDemoSaasTestTestbResponse:
        """
        Description: testB
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ImportDemoSaasTestTestbResponse(),
            self.do_request('1.0', 'demo.saas.test.testb.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_demo_saas_test_testb_ex_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ImportDemoSaasTestTestbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ImportDemoSaasTestTestbResponse:
        """
        Description: testB
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ImportDemoSaasTestTestbResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testb.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def publish_demo_saas_test_testc(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.PublishDemoSaasTestTestcRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.PublishDemoSaasTestTestcResponse:
        """
        Description: testc
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.publish_demo_saas_test_testc_ex(request, headers, runtime)

    async def publish_demo_saas_test_testc_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.PublishDemoSaasTestTestcRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.PublishDemoSaasTestTestcResponse:
        """
        Description: testc
        Summary: 测试用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.publish_demo_saas_test_testc_ex_async(request, headers, runtime)

    def publish_demo_saas_test_testc_ex(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.PublishDemoSaasTestTestcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.PublishDemoSaasTestTestcResponse:
        """
        Description: testc
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.PublishDemoSaasTestTestcResponse(),
            self.do_request('1.0', 'demo.saas.test.testc.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def publish_demo_saas_test_testc_ex_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.PublishDemoSaasTestTestcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.PublishDemoSaasTestTestcResponse:
        """
        Description: testc
        Summary: 测试用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.PublishDemoSaasTestTestcResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testc.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reset_demo_saas_test_testd(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ResetDemoSaasTestTestdRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ResetDemoSaasTestTestdResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reset_demo_saas_test_testd_ex(request, headers, runtime)

    async def reset_demo_saas_test_testd_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ResetDemoSaasTestTestdRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ResetDemoSaasTestTestdResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reset_demo_saas_test_testd_ex_async(request, headers, runtime)

    def reset_demo_saas_test_testd_ex(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ResetDemoSaasTestTestdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ResetDemoSaasTestTestdResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ResetDemoSaasTestTestdResponse(),
            self.do_request('1.0', 'demo.saas.test.testd.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reset_demo_saas_test_testd_ex_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ResetDemoSaasTestTestdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ResetDemoSaasTestTestdResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ResetDemoSaasTestTestdResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testd.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_demo_saas_test_teste(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OperateDemoSaasTestTesteRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OperateDemoSaasTestTesteResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_demo_saas_test_teste_ex(request, headers, runtime)

    async def operate_demo_saas_test_teste_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OperateDemoSaasTestTesteRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OperateDemoSaasTestTesteResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_demo_saas_test_teste_ex_async(request, headers, runtime)

    def operate_demo_saas_test_teste_ex(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OperateDemoSaasTestTesteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OperateDemoSaasTestTesteResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OperateDemoSaasTestTesteResponse(),
            self.do_request('1.0', 'demo.saas.test.teste.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_demo_saas_test_teste_ex_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OperateDemoSaasTestTesteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OperateDemoSaasTestTesteResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OperateDemoSaasTestTesteResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.teste.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_demo_saas_test_testf(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.BatchcreateDemoSaasTestTestfRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.BatchcreateDemoSaasTestTestfResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_demo_saas_test_testf_ex(request, headers, runtime)

    async def batchcreate_demo_saas_test_testf_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.BatchcreateDemoSaasTestTestfRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.BatchcreateDemoSaasTestTestfResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_demo_saas_test_testf_ex_async(request, headers, runtime)

    def batchcreate_demo_saas_test_testf_ex(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.BatchcreateDemoSaasTestTestfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.BatchcreateDemoSaasTestTestfResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.BatchcreateDemoSaasTestTestfResponse(),
            self.do_request('1.0', 'demo.saas.test.testf.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_demo_saas_test_testf_ex_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.BatchcreateDemoSaasTestTestfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.BatchcreateDemoSaasTestTestfResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.BatchcreateDemoSaasTestTestfResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testf.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def open_demo_saas_test_testg(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OpenDemoSaasTestTestgRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OpenDemoSaasTestTestgResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.open_demo_saas_test_testg_ex(request, headers, runtime)

    async def open_demo_saas_test_testg_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OpenDemoSaasTestTestgRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OpenDemoSaasTestTestgResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.open_demo_saas_test_testg_ex_async(request, headers, runtime)

    def open_demo_saas_test_testg_ex(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OpenDemoSaasTestTestgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OpenDemoSaasTestTestgResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OpenDemoSaasTestTestgResponse(),
            self.do_request('1.0', 'demo.saas.test.testg.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def open_demo_saas_test_testg_ex_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OpenDemoSaasTestTestgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OpenDemoSaasTestTestgResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.OpenDemoSaasTestTestgResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testg.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_demo_saas_test_testh(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTesthRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTesthResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_demo_saas_test_testh_ex(request, headers, runtime)

    async def create_demo_saas_test_testh_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTesthRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTesthResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_demo_saas_test_testh_ex_async(request, headers, runtime)

    def create_demo_saas_test_testh_ex(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTesthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTesthResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTesthResponse(),
            self.do_request('1.0', 'demo.saas.test.testh.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_demo_saas_test_testh_ex_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTesthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTesthResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTesthResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testh.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_demo_saas_test_testi(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTestiRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTestiResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_demo_saas_test_testi_ex(request, headers, runtime)

    async def create_demo_saas_test_testi_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTestiRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTestiResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_demo_saas_test_testi_ex_async(request, headers, runtime)

    def create_demo_saas_test_testi_ex(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTestiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTestiResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTestiResponse(),
            self.do_request('1.0', 'demo.saas.test.testi.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_demo_saas_test_testi_ex_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTestiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTestiResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.CreateDemoSaasTestTestiResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testi.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def replace_demo_saas_test_testj(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ReplaceDemoSaasTestTestjRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ReplaceDemoSaasTestTestjResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.replace_demo_saas_test_testj_ex(request, headers, runtime)

    async def replace_demo_saas_test_testj_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ReplaceDemoSaasTestTestjRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ReplaceDemoSaasTestTestjResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.replace_demo_saas_test_testj_ex_async(request, headers, runtime)

    def replace_demo_saas_test_testj_ex(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ReplaceDemoSaasTestTestjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ReplaceDemoSaasTestTestjResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ReplaceDemoSaasTestTestjResponse(),
            self.do_request('1.0', 'demo.saas.test.testj.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def replace_demo_saas_test_testj_ex_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ReplaceDemoSaasTestTestjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ReplaceDemoSaasTestTestjResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.ReplaceDemoSaasTestTestjResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testj.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_demo_saas_test_testk(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.SendDemoSaasTestTestkRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.SendDemoSaasTestTestkResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_demo_saas_test_testk_ex(request, headers, runtime)

    async def send_demo_saas_test_testk_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.SendDemoSaasTestTestkRequest,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.SendDemoSaasTestTestkResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_demo_saas_test_testk_ex_async(request, headers, runtime)

    def send_demo_saas_test_testk_ex(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.SendDemoSaasTestTestkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.SendDemoSaasTestTestkResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.SendDemoSaasTestTestkResponse(),
            self.do_request('1.0', 'demo.saas.test.testk.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_demo_saas_test_testk_ex_async(
        self,
        request: ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.SendDemoSaasTestTestkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.SendDemoSaasTestTestkResponse:
        """
        Description: 共享能力租户流量测试
        Summary: 共享能力租户流量测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_ba_5301f_7d_07245d_1bd_01dc_432d_3de_4b_1_models.SendDemoSaasTestTestkResponse(),
            await self.do_request_async('1.0', 'demo.saas.test.testk.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
