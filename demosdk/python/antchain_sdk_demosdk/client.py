# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_demosdk import models as demosdk_models
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
        config: demosdk_models.Config,
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
            # 1
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
                    'sdk_version': '1.3.40',
                    '_prod_code': 'DEMOSDK',
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
            # 1
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
                    'sdk_version': '1.3.40',
                    '_prod_code': 'DEMOSDK',
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

    def query_aaa_sdk(
        self,
        request: demosdk_models.QueryAaaSdkRequest,
    ) -> demosdk_models.QueryAaaSdkResponse:
        """
        Description: 这是测试的
        Summary: 这是测试的
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_aaa_sdk_ex(request, headers, runtime)

    async def query_aaa_sdk_async(
        self,
        request: demosdk_models.QueryAaaSdkRequest,
    ) -> demosdk_models.QueryAaaSdkResponse:
        """
        Description: 这是测试的
        Summary: 这是测试的
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_aaa_sdk_ex_async(request, headers, runtime)

    def query_aaa_sdk_ex(
        self,
        request: demosdk_models.QueryAaaSdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.QueryAaaSdkResponse:
        """
        Description: 这是测试的
        Summary: 这是测试的
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.QueryAaaSdkResponse(),
            self.do_request('1.0', 'antchain.demosdk.aaa.sdk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_aaa_sdk_ex_async(
        self,
        request: demosdk_models.QueryAaaSdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.QueryAaaSdkResponse:
        """
        Description: 这是测试的
        Summary: 这是测试的
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.QueryAaaSdkResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.aaa.sdk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_aaa_bbb_ccc(
        self,
        request: demosdk_models.BindAaaBbbCccRequest,
    ) -> demosdk_models.BindAaaBbbCccResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test，请勿修改、删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_aaa_bbb_ccc_ex(request, headers, runtime)

    async def bind_aaa_bbb_ccc_async(
        self,
        request: demosdk_models.BindAaaBbbCccRequest,
    ) -> demosdk_models.BindAaaBbbCccResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test，请勿修改、删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_aaa_bbb_ccc_ex_async(request, headers, runtime)

    def bind_aaa_bbb_ccc_ex(
        self,
        request: demosdk_models.BindAaaBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.BindAaaBbbCccResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test，请勿修改、删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.BindAaaBbbCccResponse(),
            self.do_request('1.0', 'antchain.demosdk.aaa.bbb.ccc.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_aaa_bbb_ccc_ex_async(
        self,
        request: demosdk_models.BindAaaBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.BindAaaBbbCccResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test，请勿修改、删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.BindAaaBbbCccResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.aaa.bbb.ccc.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_aaa_ccd(
        self,
        request: demosdk_models.QueryAaaCcdRequest,
    ) -> demosdk_models.QueryAaaCcdResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test，请勿修改、删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_aaa_ccd_ex(request, headers, runtime)

    async def query_aaa_ccd_async(
        self,
        request: demosdk_models.QueryAaaCcdRequest,
    ) -> demosdk_models.QueryAaaCcdResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test，请勿修改、删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_aaa_ccd_ex_async(request, headers, runtime)

    def query_aaa_ccd_ex(
        self,
        request: demosdk_models.QueryAaaCcdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.QueryAaaCcdResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test，请勿修改、删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.QueryAaaCcdResponse(),
            self.do_request('1.0', 'antchain.demosdk.aaa.ccd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_aaa_ccd_ex_async(
        self,
        request: demosdk_models.QueryAaaCcdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.QueryAaaCcdResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test，请勿修改、删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.QueryAaaCcdResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.aaa.ccd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_xxx(
        self,
        request: demosdk_models.BindXxxRequest,
    ) -> demosdk_models.BindXxxResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test，请勿修改、删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_xxx_ex(request, headers, runtime)

    async def bind_xxx_async(
        self,
        request: demosdk_models.BindXxxRequest,
    ) -> demosdk_models.BindXxxResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test，请勿修改、删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_xxx_ex_async(request, headers, runtime)

    def bind_xxx_ex(
        self,
        request: demosdk_models.BindXxxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.BindXxxResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test，请勿修改、删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.BindXxxResponse(),
            self.do_request('1.0', 'antchain.demosdk.xxx.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_xxx_ex_async(
        self,
        request: demosdk_models.BindXxxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.BindXxxResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test，请勿修改、删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.BindXxxResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.xxx.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_abcd_one(
        self,
        request: demosdk_models.ImportAbcdOneRequest,
    ) -> demosdk_models.ImportAbcdOneResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_abcd_one_ex(request, headers, runtime)

    async def import_abcd_one_async(
        self,
        request: demosdk_models.ImportAbcdOneRequest,
    ) -> demosdk_models.ImportAbcdOneResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_abcd_one_ex_async(request, headers, runtime)

    def import_abcd_one_ex(
        self,
        request: demosdk_models.ImportAbcdOneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.ImportAbcdOneResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.ImportAbcdOneResponse(),
            self.do_request('1.0', 'antchain.demosdk.abcd.one.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_abcd_one_ex_async(
        self,
        request: demosdk_models.ImportAbcdOneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.ImportAbcdOneResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.ImportAbcdOneResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.abcd.one.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def publish_workbench_one(
        self,
        request: demosdk_models.PublishWorkbenchOneRequest,
    ) -> demosdk_models.PublishWorkbenchOneResponse:
        """
        Description: 个人工作台测试使用
        Summary: 个人工作台测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.publish_workbench_one_ex(request, headers, runtime)

    async def publish_workbench_one_async(
        self,
        request: demosdk_models.PublishWorkbenchOneRequest,
    ) -> demosdk_models.PublishWorkbenchOneResponse:
        """
        Description: 个人工作台测试使用
        Summary: 个人工作台测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.publish_workbench_one_ex_async(request, headers, runtime)

    def publish_workbench_one_ex(
        self,
        request: demosdk_models.PublishWorkbenchOneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.PublishWorkbenchOneResponse:
        """
        Description: 个人工作台测试使用
        Summary: 个人工作台测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.PublishWorkbenchOneResponse(),
            self.do_request('1.0', 'antchain.demosdk.workbench.one.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def publish_workbench_one_ex_async(
        self,
        request: demosdk_models.PublishWorkbenchOneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.PublishWorkbenchOneResponse:
        """
        Description: 个人工作台测试使用
        Summary: 个人工作台测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.PublishWorkbenchOneResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.workbench.one.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def publish_workbench_two(
        self,
        request: demosdk_models.PublishWorkbenchTwoRequest,
    ) -> demosdk_models.PublishWorkbenchTwoResponse:
        """
        Description: 个人工作台测试
        Summary: 个人工作台测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.publish_workbench_two_ex(request, headers, runtime)

    async def publish_workbench_two_async(
        self,
        request: demosdk_models.PublishWorkbenchTwoRequest,
    ) -> demosdk_models.PublishWorkbenchTwoResponse:
        """
        Description: 个人工作台测试
        Summary: 个人工作台测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.publish_workbench_two_ex_async(request, headers, runtime)

    def publish_workbench_two_ex(
        self,
        request: demosdk_models.PublishWorkbenchTwoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.PublishWorkbenchTwoResponse:
        """
        Description: 个人工作台测试
        Summary: 个人工作台测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.PublishWorkbenchTwoResponse(),
            self.do_request('1.0', 'antchain.demosdk.workbench.two.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def publish_workbench_two_ex_async(
        self,
        request: demosdk_models.PublishWorkbenchTwoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.PublishWorkbenchTwoResponse:
        """
        Description: 个人工作台测试
        Summary: 个人工作台测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.PublishWorkbenchTwoResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.workbench.two.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_twice_three(
        self,
        request: demosdk_models.ImportTwiceThreeRequest,
    ) -> demosdk_models.ImportTwiceThreeResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_twice_three_ex(request, headers, runtime)

    async def import_twice_three_async(
        self,
        request: demosdk_models.ImportTwiceThreeRequest,
    ) -> demosdk_models.ImportTwiceThreeResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_twice_three_ex_async(request, headers, runtime)

    def import_twice_three_ex(
        self,
        request: demosdk_models.ImportTwiceThreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.ImportTwiceThreeResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.ImportTwiceThreeResponse(),
            self.do_request('1.0', 'antchain.demosdk.twice.three.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_twice_three_ex_async(
        self,
        request: demosdk_models.ImportTwiceThreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.ImportTwiceThreeResponse:
        """
        Description: 个人工作台二期预发测试
        Summary: 个人工作台二期预发测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.ImportTwiceThreeResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.twice.three.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def publish_workbench_three(
        self,
        request: demosdk_models.PublishWorkbenchThreeRequest,
    ) -> demosdk_models.PublishWorkbenchThreeResponse:
        """
        Description: 个人工作台测试使用
        Summary: 个人工作台测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.publish_workbench_three_ex(request, headers, runtime)

    async def publish_workbench_three_async(
        self,
        request: demosdk_models.PublishWorkbenchThreeRequest,
    ) -> demosdk_models.PublishWorkbenchThreeResponse:
        """
        Description: 个人工作台测试使用
        Summary: 个人工作台测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.publish_workbench_three_ex_async(request, headers, runtime)

    def publish_workbench_three_ex(
        self,
        request: demosdk_models.PublishWorkbenchThreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.PublishWorkbenchThreeResponse:
        """
        Description: 个人工作台测试使用
        Summary: 个人工作台测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.PublishWorkbenchThreeResponse(),
            self.do_request('1.0', 'antchain.demosdk.workbench.three.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def publish_workbench_three_ex_async(
        self,
        request: demosdk_models.PublishWorkbenchThreeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.PublishWorkbenchThreeResponse:
        """
        Description: 个人工作台测试使用
        Summary: 个人工作台测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.PublishWorkbenchThreeResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.workbench.three.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def publish_workbench_four(
        self,
        request: demosdk_models.PublishWorkbenchFourRequest,
    ) -> demosdk_models.PublishWorkbenchFourResponse:
        """
        Description: 个人工作台测试使用
        Summary: 个人工作台测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.publish_workbench_four_ex(request, headers, runtime)

    async def publish_workbench_four_async(
        self,
        request: demosdk_models.PublishWorkbenchFourRequest,
    ) -> demosdk_models.PublishWorkbenchFourResponse:
        """
        Description: 个人工作台测试使用
        Summary: 个人工作台测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.publish_workbench_four_ex_async(request, headers, runtime)

    def publish_workbench_four_ex(
        self,
        request: demosdk_models.PublishWorkbenchFourRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.PublishWorkbenchFourResponse:
        """
        Description: 个人工作台测试使用
        Summary: 个人工作台测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.PublishWorkbenchFourResponse(),
            self.do_request('1.0', 'antchain.demosdk.workbench.four.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def publish_workbench_four_ex_async(
        self,
        request: demosdk_models.PublishWorkbenchFourRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.PublishWorkbenchFourResponse:
        """
        Description: 个人工作台测试使用
        Summary: 个人工作台测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.PublishWorkbenchFourResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.workbench.four.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
