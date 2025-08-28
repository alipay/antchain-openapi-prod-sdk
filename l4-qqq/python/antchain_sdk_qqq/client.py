# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_qqq import models as qqq_models
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
        config: qqq_models.Config,
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
            # 子结构体
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
                    'sdk_version': '2.0.16',
                    '_prod_code': 'QQQ',
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
            # 子结构体
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
                    'sdk_version': '2.0.16',
                    '_prod_code': 'QQQ',
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

    def query_antchain_abc_time_five(
        self,
        request: qqq_models.QueryAntchainAbcTimeFiveRequest,
    ) -> qqq_models.QueryAntchainAbcTimeFiveResponse:
        """
        Description: 压测接口5
        Summary: 压测接口5
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_abc_time_five_ex(request, headers, runtime)

    async def query_antchain_abc_time_five_async(
        self,
        request: qqq_models.QueryAntchainAbcTimeFiveRequest,
    ) -> qqq_models.QueryAntchainAbcTimeFiveResponse:
        """
        Description: 压测接口5
        Summary: 压测接口5
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_abc_time_five_ex_async(request, headers, runtime)

    def query_antchain_abc_time_five_ex(
        self,
        request: qqq_models.QueryAntchainAbcTimeFiveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.QueryAntchainAbcTimeFiveResponse:
        """
        Description: 压测接口5
        Summary: 压测接口5
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.QueryAntchainAbcTimeFiveResponse(),
            self.do_request('1.0', 'antchain.abc.time.five.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_abc_time_five_ex_async(
        self,
        request: qqq_models.QueryAntchainAbcTimeFiveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.QueryAntchainAbcTimeFiveResponse:
        """
        Description: 压测接口5
        Summary: 压测接口5
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.QueryAntchainAbcTimeFiveResponse(),
            await self.do_request_async('1.0', 'antchain.abc.time.five.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_abc_approval_test(
        self,
        request: qqq_models.QueryAntchainAbcApprovalTestRequest,
    ) -> qqq_models.QueryAntchainAbcApprovalTestResponse:
        """
        Description: 用于测试api评审接入SDL/修改后的评审/0323
        Summary: 用于测试api评审接入SDL/修改后的评审/0323
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_abc_approval_test_ex(request, headers, runtime)

    async def query_antchain_abc_approval_test_async(
        self,
        request: qqq_models.QueryAntchainAbcApprovalTestRequest,
    ) -> qqq_models.QueryAntchainAbcApprovalTestResponse:
        """
        Description: 用于测试api评审接入SDL/修改后的评审/0323
        Summary: 用于测试api评审接入SDL/修改后的评审/0323
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_abc_approval_test_ex_async(request, headers, runtime)

    def query_antchain_abc_approval_test_ex(
        self,
        request: qqq_models.QueryAntchainAbcApprovalTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.QueryAntchainAbcApprovalTestResponse:
        """
        Description: 用于测试api评审接入SDL/修改后的评审/0323
        Summary: 用于测试api评审接入SDL/修改后的评审/0323
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.QueryAntchainAbcApprovalTestResponse(),
            self.do_request('1.0', 'antchain.abc.approval.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_abc_approval_test_ex_async(
        self,
        request: qqq_models.QueryAntchainAbcApprovalTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.QueryAntchainAbcApprovalTestResponse:
        """
        Description: 用于测试api评审接入SDL/修改后的评审/0323
        Summary: 用于测试api评审接入SDL/修改后的评审/0323
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.QueryAntchainAbcApprovalTestResponse(),
            await self.do_request_async('1.0', 'antchain.abc.approval.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def api_antchain_abc_test_create(
        self,
        request: qqq_models.ApiAntchainAbcTestCreateRequest,
    ) -> qqq_models.ApiAntchainAbcTestCreateResponse:
        """
        Description: 测试使用api
        Summary: 测试使用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.api_antchain_abc_test_create_ex(request, headers, runtime)

    async def api_antchain_abc_test_create_async(
        self,
        request: qqq_models.ApiAntchainAbcTestCreateRequest,
    ) -> qqq_models.ApiAntchainAbcTestCreateResponse:
        """
        Description: 测试使用api
        Summary: 测试使用api
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.api_antchain_abc_test_create_ex_async(request, headers, runtime)

    def api_antchain_abc_test_create_ex(
        self,
        request: qqq_models.ApiAntchainAbcTestCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.ApiAntchainAbcTestCreateResponse:
        """
        Description: 测试使用api
        Summary: 测试使用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.ApiAntchainAbcTestCreateResponse(),
            self.do_request('1.0', 'antchain.abc.test.create.api', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def api_antchain_abc_test_create_ex_async(
        self,
        request: qqq_models.ApiAntchainAbcTestCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.ApiAntchainAbcTestCreateResponse:
        """
        Description: 测试使用api
        Summary: 测试使用api
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.ApiAntchainAbcTestCreateResponse(),
            await self.do_request_async('1.0', 'antchain.abc.test.create.api', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_abc_one_limit(
        self,
        request: qqq_models.QueryAntchainAbcOneLimitRequest,
    ) -> qqq_models.QueryAntchainAbcOneLimitResponse:
        """
        Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
        Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_abc_one_limit_ex(request, headers, runtime)

    async def query_antchain_abc_one_limit_async(
        self,
        request: qqq_models.QueryAntchainAbcOneLimitRequest,
    ) -> qqq_models.QueryAntchainAbcOneLimitResponse:
        """
        Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
        Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_abc_one_limit_ex_async(request, headers, runtime)

    def query_antchain_abc_one_limit_ex(
        self,
        request: qqq_models.QueryAntchainAbcOneLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.QueryAntchainAbcOneLimitResponse:
        """
        Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
        Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.QueryAntchainAbcOneLimitResponse(),
            self.do_request('1.0', 'antchain.abc.one.limit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_abc_one_limit_ex_async(
        self,
        request: qqq_models.QueryAntchainAbcOneLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.QueryAntchainAbcOneLimitResponse:
        """
        Description: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
        Summary: 哈哈哈哈哈哈哈哈个人工作台二期预发测试qqq
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.QueryAntchainAbcOneLimitResponse(),
            await self.do_request_async('1.0', 'antchain.abc.one.limit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unstabilize_antchain_abc_one_limit(
        self,
        request: qqq_models.UnstabilizeAntchainAbcOneLimitRequest,
    ) -> qqq_models.UnstabilizeAntchainAbcOneLimitResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unstabilize_antchain_abc_one_limit_ex(request, headers, runtime)

    async def unstabilize_antchain_abc_one_limit_async(
        self,
        request: qqq_models.UnstabilizeAntchainAbcOneLimitRequest,
    ) -> qqq_models.UnstabilizeAntchainAbcOneLimitResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unstabilize_antchain_abc_one_limit_ex_async(request, headers, runtime)

    def unstabilize_antchain_abc_one_limit_ex(
        self,
        request: qqq_models.UnstabilizeAntchainAbcOneLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.UnstabilizeAntchainAbcOneLimitResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.UnstabilizeAntchainAbcOneLimitResponse(),
            self.do_request('1.0', 'antchain.abc.one.limit.unstabilize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unstabilize_antchain_abc_one_limit_ex_async(
        self,
        request: qqq_models.UnstabilizeAntchainAbcOneLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.UnstabilizeAntchainAbcOneLimitResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.UnstabilizeAntchainAbcOneLimitResponse(),
            await self.do_request_async('1.0', 'antchain.abc.one.limit.unstabilize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reset_antchain_demosdk_bbb_ccc(
        self,
        request: qqq_models.ResetAntchainDemosdkBbbCccRequest,
    ) -> qqq_models.ResetAntchainDemosdkBbbCccResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reset_antchain_demosdk_bbb_ccc_ex(request, headers, runtime)

    async def reset_antchain_demosdk_bbb_ccc_async(
        self,
        request: qqq_models.ResetAntchainDemosdkBbbCccRequest,
    ) -> qqq_models.ResetAntchainDemosdkBbbCccResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reset_antchain_demosdk_bbb_ccc_ex_async(request, headers, runtime)

    def reset_antchain_demosdk_bbb_ccc_ex(
        self,
        request: qqq_models.ResetAntchainDemosdkBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.ResetAntchainDemosdkBbbCccResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.ResetAntchainDemosdkBbbCccResponse(),
            self.do_request('1.0', 'antchain.demosdk.bbb.ccc.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reset_antchain_demosdk_bbb_ccc_ex_async(
        self,
        request: qqq_models.ResetAntchainDemosdkBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.ResetAntchainDemosdkBbbCccResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.ResetAntchainDemosdkBbbCccResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.bbb.ccc.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_antchain_demosdk_xxx(
        self,
        request: qqq_models.BindAntchainDemosdkXxxRequest,
    ) -> qqq_models.BindAntchainDemosdkXxxResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test，请勿修改、删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_antchain_demosdk_xxx_ex(request, headers, runtime)

    async def bind_antchain_demosdk_xxx_async(
        self,
        request: qqq_models.BindAntchainDemosdkXxxRequest,
    ) -> qqq_models.BindAntchainDemosdkXxxResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test，请勿修改、删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_antchain_demosdk_xxx_ex_async(request, headers, runtime)

    def bind_antchain_demosdk_xxx_ex(
        self,
        request: qqq_models.BindAntchainDemosdkXxxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.BindAntchainDemosdkXxxResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test，请勿修改、删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.BindAntchainDemosdkXxxResponse(),
            self.do_request('1.0', 'antchain.demosdk.xxx.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_antchain_demosdk_xxx_ex_async(
        self,
        request: qqq_models.BindAntchainDemosdkXxxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.BindAntchainDemosdkXxxResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test，请勿修改、删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.BindAntchainDemosdkXxxResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.xxx.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_demosdk_cc_xx(
        self,
        request: qqq_models.QueryAntchainDemosdkCcXxRequest,
    ) -> qqq_models.QueryAntchainDemosdkCcXxResponse:
        """
        Description: 测试
        Summary: 测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_demosdk_cc_xx_ex(request, headers, runtime)

    async def query_antchain_demosdk_cc_xx_async(
        self,
        request: qqq_models.QueryAntchainDemosdkCcXxRequest,
    ) -> qqq_models.QueryAntchainDemosdkCcXxResponse:
        """
        Description: 测试
        Summary: 测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_demosdk_cc_xx_ex_async(request, headers, runtime)

    def query_antchain_demosdk_cc_xx_ex(
        self,
        request: qqq_models.QueryAntchainDemosdkCcXxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.QueryAntchainDemosdkCcXxResponse:
        """
        Description: 测试
        Summary: 测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.QueryAntchainDemosdkCcXxResponse(),
            self.do_request('1.0', 'antchain.demosdk.cc.xx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_demosdk_cc_xx_ex_async(
        self,
        request: qqq_models.QueryAntchainDemosdkCcXxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.QueryAntchainDemosdkCcXxResponse:
        """
        Description: 测试
        Summary: 测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.QueryAntchainDemosdkCcXxResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.cc.xx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reset_antchain_demosdk_abcd_limit(
        self,
        request: qqq_models.ResetAntchainDemosdkAbcdLimitRequest,
    ) -> qqq_models.ResetAntchainDemosdkAbcdLimitResponse:
        """
        Description: 个人工作台二期分组路由灰度测试接口
        Summary: 个人工作台二期分组路由灰度测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reset_antchain_demosdk_abcd_limit_ex(request, headers, runtime)

    async def reset_antchain_demosdk_abcd_limit_async(
        self,
        request: qqq_models.ResetAntchainDemosdkAbcdLimitRequest,
    ) -> qqq_models.ResetAntchainDemosdkAbcdLimitResponse:
        """
        Description: 个人工作台二期分组路由灰度测试接口
        Summary: 个人工作台二期分组路由灰度测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reset_antchain_demosdk_abcd_limit_ex_async(request, headers, runtime)

    def reset_antchain_demosdk_abcd_limit_ex(
        self,
        request: qqq_models.ResetAntchainDemosdkAbcdLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.ResetAntchainDemosdkAbcdLimitResponse:
        """
        Description: 个人工作台二期分组路由灰度测试接口
        Summary: 个人工作台二期分组路由灰度测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.ResetAntchainDemosdkAbcdLimitResponse(),
            self.do_request('1.0', 'antchain.demosdk.abcd.limit.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reset_antchain_demosdk_abcd_limit_ex_async(
        self,
        request: qqq_models.ResetAntchainDemosdkAbcdLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.ResetAntchainDemosdkAbcdLimitResponse:
        """
        Description: 个人工作台二期分组路由灰度测试接口
        Summary: 个人工作台二期分组路由灰度测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.ResetAntchainDemosdkAbcdLimitResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.abcd.limit.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_antchain_demosdk_create_one(
        self,
        request: qqq_models.ImportAntchainDemosdkCreateOneRequest,
    ) -> qqq_models.ImportAntchainDemosdkCreateOneResponse:
        """
        Description: 用于个人工作台二期测试使用
        Summary: 用于个人工作台二期测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_antchain_demosdk_create_one_ex(request, headers, runtime)

    async def import_antchain_demosdk_create_one_async(
        self,
        request: qqq_models.ImportAntchainDemosdkCreateOneRequest,
    ) -> qqq_models.ImportAntchainDemosdkCreateOneResponse:
        """
        Description: 用于个人工作台二期测试使用
        Summary: 用于个人工作台二期测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_antchain_demosdk_create_one_ex_async(request, headers, runtime)

    def import_antchain_demosdk_create_one_ex(
        self,
        request: qqq_models.ImportAntchainDemosdkCreateOneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.ImportAntchainDemosdkCreateOneResponse:
        """
        Description: 用于个人工作台二期测试使用
        Summary: 用于个人工作台二期测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.ImportAntchainDemosdkCreateOneResponse(),
            self.do_request('1.0', 'antchain.demosdk.create.one.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_antchain_demosdk_create_one_ex_async(
        self,
        request: qqq_models.ImportAntchainDemosdkCreateOneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.ImportAntchainDemosdkCreateOneResponse:
        """
        Description: 用于个人工作台二期测试使用
        Summary: 用于个人工作台二期测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.ImportAntchainDemosdkCreateOneResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.create.one.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def withdraw_antchain_demosdk_twice_one(
        self,
        request: qqq_models.WithdrawAntchainDemosdkTwiceOneRequest,
    ) -> qqq_models.WithdrawAntchainDemosdkTwiceOneResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.withdraw_antchain_demosdk_twice_one_ex(request, headers, runtime)

    async def withdraw_antchain_demosdk_twice_one_async(
        self,
        request: qqq_models.WithdrawAntchainDemosdkTwiceOneRequest,
    ) -> qqq_models.WithdrawAntchainDemosdkTwiceOneResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.withdraw_antchain_demosdk_twice_one_ex_async(request, headers, runtime)

    def withdraw_antchain_demosdk_twice_one_ex(
        self,
        request: qqq_models.WithdrawAntchainDemosdkTwiceOneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.WithdrawAntchainDemosdkTwiceOneResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.WithdrawAntchainDemosdkTwiceOneResponse(),
            self.do_request('1.0', 'antchain.demosdk.twice.one.withdraw', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def withdraw_antchain_demosdk_twice_one_ex_async(
        self,
        request: qqq_models.WithdrawAntchainDemosdkTwiceOneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.WithdrawAntchainDemosdkTwiceOneResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.WithdrawAntchainDemosdkTwiceOneResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.twice.one.withdraw', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_antchain_demosdk_twice_one(
        self,
        request: qqq_models.OperateAntchainDemosdkTwiceOneRequest,
    ) -> qqq_models.OperateAntchainDemosdkTwiceOneResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_antchain_demosdk_twice_one_ex(request, headers, runtime)

    async def operate_antchain_demosdk_twice_one_async(
        self,
        request: qqq_models.OperateAntchainDemosdkTwiceOneRequest,
    ) -> qqq_models.OperateAntchainDemosdkTwiceOneResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_antchain_demosdk_twice_one_ex_async(request, headers, runtime)

    def operate_antchain_demosdk_twice_one_ex(
        self,
        request: qqq_models.OperateAntchainDemosdkTwiceOneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.OperateAntchainDemosdkTwiceOneResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.OperateAntchainDemosdkTwiceOneResponse(),
            self.do_request('1.0', 'antchain.demosdk.twice.one.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_antchain_demosdk_twice_one_ex_async(
        self,
        request: qqq_models.OperateAntchainDemosdkTwiceOneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.OperateAntchainDemosdkTwiceOneResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.OperateAntchainDemosdkTwiceOneResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.twice.one.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_demosdk_twice_three(
        self,
        request: qqq_models.QueryAntchainDemosdkTwiceThreeRequest,
    ) -> qqq_models.QueryAntchainDemosdkTwiceThreeResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_demosdk_twice_three_ex(request, headers, runtime)

    async def query_antchain_demosdk_twice_three_async(
        self,
        request: qqq_models.QueryAntchainDemosdkTwiceThreeRequest,
    ) -> qqq_models.QueryAntchainDemosdkTwiceThreeResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_demosdk_twice_three_ex_async(request, headers, runtime)

    def query_antchain_demosdk_twice_three_ex(
        self,
        request: qqq_models.QueryAntchainDemosdkTwiceThreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.QueryAntchainDemosdkTwiceThreeResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.QueryAntchainDemosdkTwiceThreeResponse(),
            self.do_request('1.0', 'antchain.demosdk.twice.three.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_demosdk_twice_three_ex_async(
        self,
        request: qqq_models.QueryAntchainDemosdkTwiceThreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.QueryAntchainDemosdkTwiceThreeResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.QueryAntchainDemosdkTwiceThreeResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.twice.three.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unstabilize_antchain_demosdk_twice_three(
        self,
        request: qqq_models.UnstabilizeAntchainDemosdkTwiceThreeRequest,
    ) -> qqq_models.UnstabilizeAntchainDemosdkTwiceThreeResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unstabilize_antchain_demosdk_twice_three_ex(request, headers, runtime)

    async def unstabilize_antchain_demosdk_twice_three_async(
        self,
        request: qqq_models.UnstabilizeAntchainDemosdkTwiceThreeRequest,
    ) -> qqq_models.UnstabilizeAntchainDemosdkTwiceThreeResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unstabilize_antchain_demosdk_twice_three_ex_async(request, headers, runtime)

    def unstabilize_antchain_demosdk_twice_three_ex(
        self,
        request: qqq_models.UnstabilizeAntchainDemosdkTwiceThreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.UnstabilizeAntchainDemosdkTwiceThreeResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.UnstabilizeAntchainDemosdkTwiceThreeResponse(),
            self.do_request('1.0', 'antchain.demosdk.twice.three.unstabilize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unstabilize_antchain_demosdk_twice_three_ex_async(
        self,
        request: qqq_models.UnstabilizeAntchainDemosdkTwiceThreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.UnstabilizeAntchainDemosdkTwiceThreeResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.UnstabilizeAntchainDemosdkTwiceThreeResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.twice.three.unstabilize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_demosdk_tesx(
        self,
        request: qqq_models.QueryAntchainDemosdkTesxRequest,
    ) -> qqq_models.QueryAntchainDemosdkTesxResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_demosdk_tesx_ex(request, headers, runtime)

    async def query_antchain_demosdk_tesx_async(
        self,
        request: qqq_models.QueryAntchainDemosdkTesxRequest,
    ) -> qqq_models.QueryAntchainDemosdkTesxResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_demosdk_tesx_ex_async(request, headers, runtime)

    def query_antchain_demosdk_tesx_ex(
        self,
        request: qqq_models.QueryAntchainDemosdkTesxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.QueryAntchainDemosdkTesxResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.QueryAntchainDemosdkTesxResponse(),
            self.do_request('1.0', 'antchain.demosdk.tesx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_demosdk_tesx_ex_async(
        self,
        request: qqq_models.QueryAntchainDemosdkTesxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> qqq_models.QueryAntchainDemosdkTesxResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            qqq_models.QueryAntchainDemosdkTesxResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.tesx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
