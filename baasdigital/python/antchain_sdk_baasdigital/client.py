# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_baasdigital import models as baasdigital_models
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
        config: baasdigital_models.Config,
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
            # 查询所有数字权证项目接口结构体
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
                    'sdk_version': '1.2.1',
                    '_prod_code': 'BAASDIGITAL',
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
            # 查询所有数字权证项目接口结构体
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
                    'sdk_version': '1.2.1',
                    '_prod_code': 'BAASDIGITAL',
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

    def judge_aliyun_service(
        self,
        request: baasdigital_models.JudgeAliyunServiceRequest,
    ) -> baasdigital_models.JudgeAliyunServiceResponse:
        """
        Description: 数字权证服务开通状态检测
        Summary: 数字权证服务开通状态检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.judge_aliyun_service_ex(request, headers, runtime)

    async def judge_aliyun_service_async(
        self,
        request: baasdigital_models.JudgeAliyunServiceRequest,
    ) -> baasdigital_models.JudgeAliyunServiceResponse:
        """
        Description: 数字权证服务开通状态检测
        Summary: 数字权证服务开通状态检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.judge_aliyun_service_ex_async(request, headers, runtime)

    def judge_aliyun_service_ex(
        self,
        request: baasdigital_models.JudgeAliyunServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.JudgeAliyunServiceResponse:
        """
        Description: 数字权证服务开通状态检测
        Summary: 数字权证服务开通状态检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.JudgeAliyunServiceResponse(),
            self.do_request('1.0', 'antchain.baasdigital.aliyun.service.judge', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def judge_aliyun_service_ex_async(
        self,
        request: baasdigital_models.JudgeAliyunServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.JudgeAliyunServiceResponse:
        """
        Description: 数字权证服务开通状态检测
        Summary: 数字权证服务开通状态检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.JudgeAliyunServiceResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.aliyun.service.judge', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def open_aliyun_service(
        self,
        request: baasdigital_models.OpenAliyunServiceRequest,
    ) -> baasdigital_models.OpenAliyunServiceResponse:
        """
        Description: 开通数字权证链服务
        Summary: 开通数字权证链服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.open_aliyun_service_ex(request, headers, runtime)

    async def open_aliyun_service_async(
        self,
        request: baasdigital_models.OpenAliyunServiceRequest,
    ) -> baasdigital_models.OpenAliyunServiceResponse:
        """
        Description: 开通数字权证链服务
        Summary: 开通数字权证链服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.open_aliyun_service_ex_async(request, headers, runtime)

    def open_aliyun_service_ex(
        self,
        request: baasdigital_models.OpenAliyunServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.OpenAliyunServiceResponse:
        """
        Description: 开通数字权证链服务
        Summary: 开通数字权证链服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.OpenAliyunServiceResponse(),
            self.do_request('1.0', 'antchain.baasdigital.aliyun.service.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def open_aliyun_service_ex_async(
        self,
        request: baasdigital_models.OpenAliyunServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.OpenAliyunServiceResponse:
        """
        Description: 开通数字权证链服务
        Summary: 开通数字权证链服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.OpenAliyunServiceResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.aliyun.service.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_aliyun_service(
        self,
        request: baasdigital_models.DetailAliyunServiceRequest,
    ) -> baasdigital_models.DetailAliyunServiceResponse:
        """
        Description: 查询数字权证服务开通详情
        Summary: 数字权证服务开通信息详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_aliyun_service_ex(request, headers, runtime)

    async def detail_aliyun_service_async(
        self,
        request: baasdigital_models.DetailAliyunServiceRequest,
    ) -> baasdigital_models.DetailAliyunServiceResponse:
        """
        Description: 查询数字权证服务开通详情
        Summary: 数字权证服务开通信息详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_aliyun_service_ex_async(request, headers, runtime)

    def detail_aliyun_service_ex(
        self,
        request: baasdigital_models.DetailAliyunServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.DetailAliyunServiceResponse:
        """
        Description: 查询数字权证服务开通详情
        Summary: 数字权证服务开通信息详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.DetailAliyunServiceResponse(),
            self.do_request('1.0', 'antchain.baasdigital.aliyun.service.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_aliyun_service_ex_async(
        self,
        request: baasdigital_models.DetailAliyunServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.DetailAliyunServiceResponse:
        """
        Description: 查询数字权证服务开通详情
        Summary: 数字权证服务开通信息详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.DetailAliyunServiceResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.aliyun.service.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_aliyun_project(
        self,
        request: baasdigital_models.QueryAliyunProjectRequest,
    ) -> baasdigital_models.QueryAliyunProjectResponse:
        """
        Description: 查询数字权证项目列表内容
        Summary: 查询数字权证项目列表内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_aliyun_project_ex(request, headers, runtime)

    async def query_aliyun_project_async(
        self,
        request: baasdigital_models.QueryAliyunProjectRequest,
    ) -> baasdigital_models.QueryAliyunProjectResponse:
        """
        Description: 查询数字权证项目列表内容
        Summary: 查询数字权证项目列表内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_aliyun_project_ex_async(request, headers, runtime)

    def query_aliyun_project_ex(
        self,
        request: baasdigital_models.QueryAliyunProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.QueryAliyunProjectResponse:
        """
        Description: 查询数字权证项目列表内容
        Summary: 查询数字权证项目列表内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.QueryAliyunProjectResponse(),
            self.do_request('1.0', 'antchain.baasdigital.aliyun.project.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_aliyun_project_ex_async(
        self,
        request: baasdigital_models.QueryAliyunProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.QueryAliyunProjectResponse:
        """
        Description: 查询数字权证项目列表内容
        Summary: 查询数字权证项目列表内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.QueryAliyunProjectResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.aliyun.project.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_aliyun_access(
        self,
        request: baasdigital_models.CheckAliyunAccessRequest,
    ) -> baasdigital_models.CheckAliyunAccessResponse:
        """
        Description: 检测链ID是否为数字权证链
        Summary: 检测链ID是否为数字权证链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_aliyun_access_ex(request, headers, runtime)

    async def check_aliyun_access_async(
        self,
        request: baasdigital_models.CheckAliyunAccessRequest,
    ) -> baasdigital_models.CheckAliyunAccessResponse:
        """
        Description: 检测链ID是否为数字权证链
        Summary: 检测链ID是否为数字权证链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_aliyun_access_ex_async(request, headers, runtime)

    def check_aliyun_access_ex(
        self,
        request: baasdigital_models.CheckAliyunAccessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.CheckAliyunAccessResponse:
        """
        Description: 检测链ID是否为数字权证链
        Summary: 检测链ID是否为数字权证链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.CheckAliyunAccessResponse(),
            self.do_request('1.0', 'antchain.baasdigital.aliyun.access.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_aliyun_access_ex_async(
        self,
        request: baasdigital_models.CheckAliyunAccessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.CheckAliyunAccessResponse:
        """
        Description: 检测链ID是否为数字权证链
        Summary: 检测链ID是否为数字权证链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.CheckAliyunAccessResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.aliyun.access.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_account(
        self,
        request: baasdigital_models.CheckAccountRequest,
    ) -> baasdigital_models.CheckAccountResponse:
        """
        Description: 检测账户名称是否已经在区块链注册
        Summary: 检测账户名称是否已经在区块链注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_account_ex(request, headers, runtime)

    async def check_account_async(
        self,
        request: baasdigital_models.CheckAccountRequest,
    ) -> baasdigital_models.CheckAccountResponse:
        """
        Description: 检测账户名称是否已经在区块链注册
        Summary: 检测账户名称是否已经在区块链注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_account_ex_async(request, headers, runtime)

    def check_account_ex(
        self,
        request: baasdigital_models.CheckAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.CheckAccountResponse:
        """
        Description: 检测账户名称是否已经在区块链注册
        Summary: 检测账户名称是否已经在区块链注册
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.CheckAccountResponse(),
            self.do_request('1.0', 'antchain.baasdigital.account.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_account_ex_async(
        self,
        request: baasdigital_models.CheckAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.CheckAccountResponse:
        """
        Description: 检测账户名称是否已经在区块链注册
        Summary: 检测账户名称是否已经在区块链注册
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.CheckAccountResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.account.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_account_kms(
        self,
        request: baasdigital_models.CreateAccountKmsRequest,
    ) -> baasdigital_models.CreateAccountKmsResponse:
        """
        Description: 创建MyChain托管账户
        Summary: 创建MyChain托管账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_account_kms_ex(request, headers, runtime)

    async def create_account_kms_async(
        self,
        request: baasdigital_models.CreateAccountKmsRequest,
    ) -> baasdigital_models.CreateAccountKmsResponse:
        """
        Description: 创建MyChain托管账户
        Summary: 创建MyChain托管账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_account_kms_ex_async(request, headers, runtime)

    def create_account_kms_ex(
        self,
        request: baasdigital_models.CreateAccountKmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.CreateAccountKmsResponse:
        """
        Description: 创建MyChain托管账户
        Summary: 创建MyChain托管账户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.CreateAccountKmsResponse(),
            self.do_request('1.0', 'antchain.baasdigital.account.kms.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_account_kms_ex_async(
        self,
        request: baasdigital_models.CreateAccountKmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.CreateAccountKmsResponse:
        """
        Description: 创建MyChain托管账户
        Summary: 创建MyChain托管账户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.CreateAccountKmsResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.account.kms.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_resource_policy(
        self,
        request: baasdigital_models.CreateResourcePolicyRequest,
    ) -> baasdigital_models.CreateResourcePolicyResponse:
        """
        Description: 创建oss上传policy，客户端使用http方式自主上传文件
        Summary: 创建资源上传规则url
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_resource_policy_ex(request, headers, runtime)

    async def create_resource_policy_async(
        self,
        request: baasdigital_models.CreateResourcePolicyRequest,
    ) -> baasdigital_models.CreateResourcePolicyResponse:
        """
        Description: 创建oss上传policy，客户端使用http方式自主上传文件
        Summary: 创建资源上传规则url
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_resource_policy_ex_async(request, headers, runtime)

    def create_resource_policy_ex(
        self,
        request: baasdigital_models.CreateResourcePolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.CreateResourcePolicyResponse:
        """
        Description: 创建oss上传policy，客户端使用http方式自主上传文件
        Summary: 创建资源上传规则url
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.CreateResourcePolicyResponse(),
            self.do_request('1.0', 'antchain.baasdigital.resource.policy.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_resource_policy_ex_async(
        self,
        request: baasdigital_models.CreateResourcePolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.CreateResourcePolicyResponse:
        """
        Description: 创建oss上传policy，客户端使用http方式自主上传文件
        Summary: 创建资源上传规则url
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.CreateResourcePolicyResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.resource.policy.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_resource(
        self,
        request: baasdigital_models.CheckResourceRequest,
    ) -> baasdigital_models.CheckResourceResponse:
        """
        Description: 上传文件状态检测
        Summary: 上传文件状态检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_resource_ex(request, headers, runtime)

    async def check_resource_async(
        self,
        request: baasdigital_models.CheckResourceRequest,
    ) -> baasdigital_models.CheckResourceResponse:
        """
        Description: 上传文件状态检测
        Summary: 上传文件状态检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_resource_ex_async(request, headers, runtime)

    def check_resource_ex(
        self,
        request: baasdigital_models.CheckResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.CheckResourceResponse:
        """
        Description: 上传文件状态检测
        Summary: 上传文件状态检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.CheckResourceResponse(),
            self.do_request('1.0', 'antchain.baasdigital.resource.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_resource_ex_async(
        self,
        request: baasdigital_models.CheckResourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.CheckResourceResponse:
        """
        Description: 上传文件状态检测
        Summary: 上传文件状态检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.CheckResourceResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.resource.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_asseturi(
        self,
        request: baasdigital_models.CreateAsseturiRequest,
    ) -> baasdigital_models.CreateAsseturiResponse:
        """
        Description: 定义数字权证AssetUri，包括权证所需各种属性
        Summary: 定义数字权证AssetUri
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_asseturi_ex(request, headers, runtime)

    async def create_asseturi_async(
        self,
        request: baasdigital_models.CreateAsseturiRequest,
    ) -> baasdigital_models.CreateAsseturiResponse:
        """
        Description: 定义数字权证AssetUri，包括权证所需各种属性
        Summary: 定义数字权证AssetUri
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_asseturi_ex_async(request, headers, runtime)

    def create_asseturi_ex(
        self,
        request: baasdigital_models.CreateAsseturiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.CreateAsseturiResponse:
        """
        Description: 定义数字权证AssetUri，包括权证所需各种属性
        Summary: 定义数字权证AssetUri
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.CreateAsseturiResponse(),
            self.do_request('1.0', 'antchain.baasdigital.asseturi.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_asseturi_ex_async(
        self,
        request: baasdigital_models.CreateAsseturiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.CreateAsseturiResponse:
        """
        Description: 定义数字权证AssetUri，包括权证所需各种属性
        Summary: 定义数字权证AssetUri
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.CreateAsseturiResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.asseturi.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_project(
        self,
        request: baasdigital_models.QueryProjectRequest,
    ) -> baasdigital_models.QueryProjectResponse:
        """
        Description: 查询单个权证项目信息
        Summary: 查询单个权证项目信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_project_ex(request, headers, runtime)

    async def query_project_async(
        self,
        request: baasdigital_models.QueryProjectRequest,
    ) -> baasdigital_models.QueryProjectResponse:
        """
        Description: 查询单个权证项目信息
        Summary: 查询单个权证项目信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_project_ex_async(request, headers, runtime)

    def query_project_ex(
        self,
        request: baasdigital_models.QueryProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.QueryProjectResponse:
        """
        Description: 查询单个权证项目信息
        Summary: 查询单个权证项目信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.QueryProjectResponse(),
            self.do_request('1.0', 'antchain.baasdigital.project.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_project_ex_async(
        self,
        request: baasdigital_models.QueryProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.QueryProjectResponse:
        """
        Description: 查询单个权证项目信息
        Summary: 查询单个权证项目信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.QueryProjectResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.project.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_project(
        self,
        request: baasdigital_models.CreateProjectRequest,
    ) -> baasdigital_models.CreateProjectResponse:
        """
        Description: 创建数字权证项目
        Summary: 创建数字权证项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_project_ex(request, headers, runtime)

    async def create_project_async(
        self,
        request: baasdigital_models.CreateProjectRequest,
    ) -> baasdigital_models.CreateProjectResponse:
        """
        Description: 创建数字权证项目
        Summary: 创建数字权证项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_project_ex_async(request, headers, runtime)

    def create_project_ex(
        self,
        request: baasdigital_models.CreateProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.CreateProjectResponse:
        """
        Description: 创建数字权证项目
        Summary: 创建数字权证项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.CreateProjectResponse(),
            self.do_request('1.0', 'antchain.baasdigital.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_project_ex_async(
        self,
        request: baasdigital_models.CreateProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.CreateProjectResponse:
        """
        Description: 创建数字权证项目
        Summary: 创建数字权证项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.CreateProjectResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_project(
        self,
        request: baasdigital_models.UpdateProjectRequest,
    ) -> baasdigital_models.UpdateProjectResponse:
        """
        Description: 更新数字权证项目信息
        Summary: 更新数字权证项目信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_project_ex(request, headers, runtime)

    async def update_project_async(
        self,
        request: baasdigital_models.UpdateProjectRequest,
    ) -> baasdigital_models.UpdateProjectResponse:
        """
        Description: 更新数字权证项目信息
        Summary: 更新数字权证项目信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_project_ex_async(request, headers, runtime)

    def update_project_ex(
        self,
        request: baasdigital_models.UpdateProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.UpdateProjectResponse:
        """
        Description: 更新数字权证项目信息
        Summary: 更新数字权证项目信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.UpdateProjectResponse(),
            self.do_request('1.0', 'antchain.baasdigital.project.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_project_ex_async(
        self,
        request: baasdigital_models.UpdateProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.UpdateProjectResponse:
        """
        Description: 更新数字权证项目信息
        Summary: 更新数字权证项目信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.UpdateProjectResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.project.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_contract_issue(
        self,
        request: baasdigital_models.ExecContractIssueRequest,
    ) -> baasdigital_models.ExecContractIssueResponse:
        """
        Description: 数字权证签发(异步)
        Summary: 数字权证签发(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_contract_issue_ex(request, headers, runtime)

    async def exec_contract_issue_async(
        self,
        request: baasdigital_models.ExecContractIssueRequest,
    ) -> baasdigital_models.ExecContractIssueResponse:
        """
        Description: 数字权证签发(异步)
        Summary: 数字权证签发(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_contract_issue_ex_async(request, headers, runtime)

    def exec_contract_issue_ex(
        self,
        request: baasdigital_models.ExecContractIssueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecContractIssueResponse:
        """
        Description: 数字权证签发(异步)
        Summary: 数字权证签发(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecContractIssueResponse(),
            self.do_request('1.0', 'antchain.baasdigital.contract.issue.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_contract_issue_ex_async(
        self,
        request: baasdigital_models.ExecContractIssueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecContractIssueResponse:
        """
        Description: 数字权证签发(异步)
        Summary: 数字权证签发(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecContractIssueResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.contract.issue.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_project(
        self,
        request: baasdigital_models.ListProjectRequest,
    ) -> baasdigital_models.ListProjectResponse:
        """
        Description: 查询所有项目ID列表
        Summary: 查询所有项目ID列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_project_ex(request, headers, runtime)

    async def list_project_async(
        self,
        request: baasdigital_models.ListProjectRequest,
    ) -> baasdigital_models.ListProjectResponse:
        """
        Description: 查询所有项目ID列表
        Summary: 查询所有项目ID列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_project_ex_async(request, headers, runtime)

    def list_project_ex(
        self,
        request: baasdigital_models.ListProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ListProjectResponse:
        """
        Description: 查询所有项目ID列表
        Summary: 查询所有项目ID列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ListProjectResponse(),
            self.do_request('1.0', 'antchain.baasdigital.project.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_project_ex_async(
        self,
        request: baasdigital_models.ListProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ListProjectResponse:
        """
        Description: 查询所有项目ID列表
        Summary: 查询所有项目ID列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ListProjectResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.project.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_transaction(
        self,
        request: baasdigital_models.QueryContractTransactionRequest,
    ) -> baasdigital_models.QueryContractTransactionResponse:
        """
        Description: 查询发送到链上的交易内容
        Summary: 查询交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_transaction_ex(request, headers, runtime)

    async def query_contract_transaction_async(
        self,
        request: baasdigital_models.QueryContractTransactionRequest,
    ) -> baasdigital_models.QueryContractTransactionResponse:
        """
        Description: 查询发送到链上的交易内容
        Summary: 查询交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_transaction_ex_async(request, headers, runtime)

    def query_contract_transaction_ex(
        self,
        request: baasdigital_models.QueryContractTransactionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.QueryContractTransactionResponse:
        """
        Description: 查询发送到链上的交易内容
        Summary: 查询交易
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.QueryContractTransactionResponse(),
            self.do_request('1.0', 'antchain.baasdigital.contract.transaction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_transaction_ex_async(
        self,
        request: baasdigital_models.QueryContractTransactionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.QueryContractTransactionResponse:
        """
        Description: 查询发送到链上的交易内容
        Summary: 查询交易
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.QueryContractTransactionResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.contract.transaction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_receipt(
        self,
        request: baasdigital_models.QueryContractReceiptRequest,
    ) -> baasdigital_models.QueryContractReceiptResponse:
        """
        Description: 查询发送到链上的交易执行的结果
        Summary: 查询交易执行回执
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_receipt_ex(request, headers, runtime)

    async def query_contract_receipt_async(
        self,
        request: baasdigital_models.QueryContractReceiptRequest,
    ) -> baasdigital_models.QueryContractReceiptResponse:
        """
        Description: 查询发送到链上的交易执行的结果
        Summary: 查询交易执行回执
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_receipt_ex_async(request, headers, runtime)

    def query_contract_receipt_ex(
        self,
        request: baasdigital_models.QueryContractReceiptRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.QueryContractReceiptResponse:
        """
        Description: 查询发送到链上的交易执行的结果
        Summary: 查询交易执行回执
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.QueryContractReceiptResponse(),
            self.do_request('1.0', 'antchain.baasdigital.contract.receipt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_receipt_ex_async(
        self,
        request: baasdigital_models.QueryContractReceiptRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.QueryContractReceiptResponse:
        """
        Description: 查询发送到链上的交易执行的结果
        Summary: 查询交易执行回执
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.QueryContractReceiptResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.contract.receipt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_contract_addsupply(
        self,
        request: baasdigital_models.ExecContractAddsupplyRequest,
    ) -> baasdigital_models.ExecContractAddsupplyResponse:
        """
        Description: 数字权证增发(异步)，高性能版本暂不支持此接口
        Summary: 数字权证增发(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_contract_addsupply_ex(request, headers, runtime)

    async def exec_contract_addsupply_async(
        self,
        request: baasdigital_models.ExecContractAddsupplyRequest,
    ) -> baasdigital_models.ExecContractAddsupplyResponse:
        """
        Description: 数字权证增发(异步)，高性能版本暂不支持此接口
        Summary: 数字权证增发(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_contract_addsupply_ex_async(request, headers, runtime)

    def exec_contract_addsupply_ex(
        self,
        request: baasdigital_models.ExecContractAddsupplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecContractAddsupplyResponse:
        """
        Description: 数字权证增发(异步)，高性能版本暂不支持此接口
        Summary: 数字权证增发(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecContractAddsupplyResponse(),
            self.do_request('1.0', 'antchain.baasdigital.contract.addsupply.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_contract_addsupply_ex_async(
        self,
        request: baasdigital_models.ExecContractAddsupplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecContractAddsupplyResponse:
        """
        Description: 数字权证增发(异步)，高性能版本暂不支持此接口
        Summary: 数字权证增发(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecContractAddsupplyResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.contract.addsupply.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_contract_transfer(
        self,
        request: baasdigital_models.ExecContractTransferRequest,
    ) -> baasdigital_models.ExecContractTransferResponse:
        """
        Description: 数字权证转移(异步)
        Summary: 数字权证转移(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_contract_transfer_ex(request, headers, runtime)

    async def exec_contract_transfer_async(
        self,
        request: baasdigital_models.ExecContractTransferRequest,
    ) -> baasdigital_models.ExecContractTransferResponse:
        """
        Description: 数字权证转移(异步)
        Summary: 数字权证转移(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_contract_transfer_ex_async(request, headers, runtime)

    def exec_contract_transfer_ex(
        self,
        request: baasdigital_models.ExecContractTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecContractTransferResponse:
        """
        Description: 数字权证转移(异步)
        Summary: 数字权证转移(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecContractTransferResponse(),
            self.do_request('1.0', 'antchain.baasdigital.contract.transfer.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_contract_transfer_ex_async(
        self,
        request: baasdigital_models.ExecContractTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecContractTransferResponse:
        """
        Description: 数字权证转移(异步)
        Summary: 数字权证转移(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecContractTransferResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.contract.transfer.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_contract_writeoff(
        self,
        request: baasdigital_models.ExecContractWriteoffRequest,
    ) -> baasdigital_models.ExecContractWriteoffResponse:
        """
        Description: 数字权证核销(异步)
        Summary: 数字权证核销(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_contract_writeoff_ex(request, headers, runtime)

    async def exec_contract_writeoff_async(
        self,
        request: baasdigital_models.ExecContractWriteoffRequest,
    ) -> baasdigital_models.ExecContractWriteoffResponse:
        """
        Description: 数字权证核销(异步)
        Summary: 数字权证核销(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_contract_writeoff_ex_async(request, headers, runtime)

    def exec_contract_writeoff_ex(
        self,
        request: baasdigital_models.ExecContractWriteoffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecContractWriteoffResponse:
        """
        Description: 数字权证核销(异步)
        Summary: 数字权证核销(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecContractWriteoffResponse(),
            self.do_request('1.0', 'antchain.baasdigital.contract.writeoff.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_contract_writeoff_ex_async(
        self,
        request: baasdigital_models.ExecContractWriteoffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecContractWriteoffResponse:
        """
        Description: 数字权证核销(异步)
        Summary: 数字权证核销(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecContractWriteoffResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.contract.writeoff.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_contract_burnoff(
        self,
        request: baasdigital_models.ExecContractBurnoffRequest,
    ) -> baasdigital_models.ExecContractBurnoffResponse:
        """
        Description: 数字权证销毁(异步)
        Summary: 数字权证销毁(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_contract_burnoff_ex(request, headers, runtime)

    async def exec_contract_burnoff_async(
        self,
        request: baasdigital_models.ExecContractBurnoffRequest,
    ) -> baasdigital_models.ExecContractBurnoffResponse:
        """
        Description: 数字权证销毁(异步)
        Summary: 数字权证销毁(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_contract_burnoff_ex_async(request, headers, runtime)

    def exec_contract_burnoff_ex(
        self,
        request: baasdigital_models.ExecContractBurnoffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecContractBurnoffResponse:
        """
        Description: 数字权证销毁(异步)
        Summary: 数字权证销毁(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecContractBurnoffResponse(),
            self.do_request('1.0', 'antchain.baasdigital.contract.burnoff.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_contract_burnoff_ex_async(
        self,
        request: baasdigital_models.ExecContractBurnoffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecContractBurnoffResponse:
        """
        Description: 数字权证销毁(异步)
        Summary: 数字权证销毁(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecContractBurnoffResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.contract.burnoff.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_asset(
        self,
        request: baasdigital_models.QueryContractAssetRequest,
    ) -> baasdigital_models.QueryContractAssetResponse:
        """
        Description: 查询特定账户下的权证信息，高性能版本暂不支持此接口
        Summary: 查询特定账户下的权证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_asset_ex(request, headers, runtime)

    async def query_contract_asset_async(
        self,
        request: baasdigital_models.QueryContractAssetRequest,
    ) -> baasdigital_models.QueryContractAssetResponse:
        """
        Description: 查询特定账户下的权证信息，高性能版本暂不支持此接口
        Summary: 查询特定账户下的权证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_asset_ex_async(request, headers, runtime)

    def query_contract_asset_ex(
        self,
        request: baasdigital_models.QueryContractAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.QueryContractAssetResponse:
        """
        Description: 查询特定账户下的权证信息，高性能版本暂不支持此接口
        Summary: 查询特定账户下的权证信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.QueryContractAssetResponse(),
            self.do_request('1.0', 'antchain.baasdigital.contract.asset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_asset_ex_async(
        self,
        request: baasdigital_models.QueryContractAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.QueryContractAssetResponse:
        """
        Description: 查询特定账户下的权证信息，高性能版本暂不支持此接口
        Summary: 查询特定账户下的权证信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.QueryContractAssetResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.contract.asset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_asseturi(
        self,
        request: baasdigital_models.QueryContractAsseturiRequest,
    ) -> baasdigital_models.QueryContractAsseturiResponse:
        """
        Description: 查询特定权证的uri meta信息
        Summary: 查询特定权证的uri meta信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_asseturi_ex(request, headers, runtime)

    async def query_contract_asseturi_async(
        self,
        request: baasdigital_models.QueryContractAsseturiRequest,
    ) -> baasdigital_models.QueryContractAsseturiResponse:
        """
        Description: 查询特定权证的uri meta信息
        Summary: 查询特定权证的uri meta信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_asseturi_ex_async(request, headers, runtime)

    def query_contract_asseturi_ex(
        self,
        request: baasdigital_models.QueryContractAsseturiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.QueryContractAsseturiResponse:
        """
        Description: 查询特定权证的uri meta信息
        Summary: 查询特定权证的uri meta信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.QueryContractAsseturiResponse(),
            self.do_request('1.0', 'antchain.baasdigital.contract.asseturi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_asseturi_ex_async(
        self,
        request: baasdigital_models.QueryContractAsseturiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.QueryContractAsseturiResponse:
        """
        Description: 查询特定权证的uri meta信息
        Summary: 查询特定权证的uri meta信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.QueryContractAsseturiResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.contract.asseturi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_contract_approve(
        self,
        request: baasdigital_models.ExecContractApproveRequest,
    ) -> baasdigital_models.ExecContractApproveResponse:
        """
        Description: 授权权证给某个账户
        Summary: 数字权证授权(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_contract_approve_ex(request, headers, runtime)

    async def exec_contract_approve_async(
        self,
        request: baasdigital_models.ExecContractApproveRequest,
    ) -> baasdigital_models.ExecContractApproveResponse:
        """
        Description: 授权权证给某个账户
        Summary: 数字权证授权(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_contract_approve_ex_async(request, headers, runtime)

    def exec_contract_approve_ex(
        self,
        request: baasdigital_models.ExecContractApproveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecContractApproveResponse:
        """
        Description: 授权权证给某个账户
        Summary: 数字权证授权(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecContractApproveResponse(),
            self.do_request('1.0', 'antchain.baasdigital.contract.approve.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_contract_approve_ex_async(
        self,
        request: baasdigital_models.ExecContractApproveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecContractApproveResponse:
        """
        Description: 授权权证给某个账户
        Summary: 数字权证授权(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecContractApproveResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.contract.approve.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_contract_approve(
        self,
        request: baasdigital_models.CancelContractApproveRequest,
    ) -> baasdigital_models.CancelContractApproveResponse:
        """
        Description: 取消数字权证授权
        Summary: 取消数字权证授权(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_contract_approve_ex(request, headers, runtime)

    async def cancel_contract_approve_async(
        self,
        request: baasdigital_models.CancelContractApproveRequest,
    ) -> baasdigital_models.CancelContractApproveResponse:
        """
        Description: 取消数字权证授权
        Summary: 取消数字权证授权(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_contract_approve_ex_async(request, headers, runtime)

    def cancel_contract_approve_ex(
        self,
        request: baasdigital_models.CancelContractApproveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.CancelContractApproveResponse:
        """
        Description: 取消数字权证授权
        Summary: 取消数字权证授权(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.CancelContractApproveResponse(),
            self.do_request('1.0', 'antchain.baasdigital.contract.approve.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_contract_approve_ex_async(
        self,
        request: baasdigital_models.CancelContractApproveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.CancelContractApproveResponse:
        """
        Description: 取消数字权证授权
        Summary: 取消数字权证授权(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.CancelContractApproveResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.contract.approve.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_contract_role(
        self,
        request: baasdigital_models.SetContractRoleRequest,
    ) -> baasdigital_models.SetContractRoleResponse:
        """
        Description: 为某个账户授权权证管理角色，目前支持设置【发行者】，【核销者】两种。
        同一个账户可具备多个角色，同一个角色可有多个账户。
        Summary: 授权项目权证管理角色(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_contract_role_ex(request, headers, runtime)

    async def set_contract_role_async(
        self,
        request: baasdigital_models.SetContractRoleRequest,
    ) -> baasdigital_models.SetContractRoleResponse:
        """
        Description: 为某个账户授权权证管理角色，目前支持设置【发行者】，【核销者】两种。
        同一个账户可具备多个角色，同一个角色可有多个账户。
        Summary: 授权项目权证管理角色(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_contract_role_ex_async(request, headers, runtime)

    def set_contract_role_ex(
        self,
        request: baasdigital_models.SetContractRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.SetContractRoleResponse:
        """
        Description: 为某个账户授权权证管理角色，目前支持设置【发行者】，【核销者】两种。
        同一个账户可具备多个角色，同一个角色可有多个账户。
        Summary: 授权项目权证管理角色(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.SetContractRoleResponse(),
            self.do_request('1.0', 'antchain.baasdigital.contract.role.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_contract_role_ex_async(
        self,
        request: baasdigital_models.SetContractRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.SetContractRoleResponse:
        """
        Description: 为某个账户授权权证管理角色，目前支持设置【发行者】，【核销者】两种。
        同一个账户可具备多个角色，同一个角色可有多个账户。
        Summary: 授权项目权证管理角色(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.SetContractRoleResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.contract.role.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_contract_role(
        self,
        request: baasdigital_models.CancelContractRoleRequest,
    ) -> baasdigital_models.CancelContractRoleResponse:
        """
        Description: 取消某个账户已经拥有的管理角色，目前支持设置【发行者】，【核销者】两种。
        Summary: 取消项目管理角色(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_contract_role_ex(request, headers, runtime)

    async def cancel_contract_role_async(
        self,
        request: baasdigital_models.CancelContractRoleRequest,
    ) -> baasdigital_models.CancelContractRoleResponse:
        """
        Description: 取消某个账户已经拥有的管理角色，目前支持设置【发行者】，【核销者】两种。
        Summary: 取消项目管理角色(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_contract_role_ex_async(request, headers, runtime)

    def cancel_contract_role_ex(
        self,
        request: baasdigital_models.CancelContractRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.CancelContractRoleResponse:
        """
        Description: 取消某个账户已经拥有的管理角色，目前支持设置【发行者】，【核销者】两种。
        Summary: 取消项目管理角色(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.CancelContractRoleResponse(),
            self.do_request('1.0', 'antchain.baasdigital.contract.role.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_contract_role_ex_async(
        self,
        request: baasdigital_models.CancelContractRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.CancelContractRoleResponse:
        """
        Description: 取消某个账户已经拥有的管理角色，目前支持设置【发行者】，【核销者】两种。
        Summary: 取消项目管理角色(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.CancelContractRoleResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.contract.role.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_contract_batchissue(
        self,
        request: baasdigital_models.ExecContractBatchissueRequest,
    ) -> baasdigital_models.ExecContractBatchissueResponse:
        """
        Description: 共享型项目批量发行权证到指定账户，非共享型项目及高性能版本无法使用此接口
        Summary: 批量发行权证到指定账户(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_contract_batchissue_ex(request, headers, runtime)

    async def exec_contract_batchissue_async(
        self,
        request: baasdigital_models.ExecContractBatchissueRequest,
    ) -> baasdigital_models.ExecContractBatchissueResponse:
        """
        Description: 共享型项目批量发行权证到指定账户，非共享型项目及高性能版本无法使用此接口
        Summary: 批量发行权证到指定账户(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_contract_batchissue_ex_async(request, headers, runtime)

    def exec_contract_batchissue_ex(
        self,
        request: baasdigital_models.ExecContractBatchissueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecContractBatchissueResponse:
        """
        Description: 共享型项目批量发行权证到指定账户，非共享型项目及高性能版本无法使用此接口
        Summary: 批量发行权证到指定账户(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecContractBatchissueResponse(),
            self.do_request('1.0', 'antchain.baasdigital.contract.batchissue.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_contract_batchissue_ex_async(
        self,
        request: baasdigital_models.ExecContractBatchissueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecContractBatchissueResponse:
        """
        Description: 共享型项目批量发行权证到指定账户，非共享型项目及高性能版本无法使用此接口
        Summary: 批量发行权证到指定账户(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecContractBatchissueResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.contract.batchissue.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_contract_listissue(
        self,
        request: baasdigital_models.ExecContractListissueRequest,
    ) -> baasdigital_models.ExecContractListissueResponse:
        """
        Description: 高性能共享型批量发行权证到指定账户，非高性能共享型项目无法使用此接口
        Summary: 批量发行权证到指定账户(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_contract_listissue_ex(request, headers, runtime)

    async def exec_contract_listissue_async(
        self,
        request: baasdigital_models.ExecContractListissueRequest,
    ) -> baasdigital_models.ExecContractListissueResponse:
        """
        Description: 高性能共享型批量发行权证到指定账户，非高性能共享型项目无法使用此接口
        Summary: 批量发行权证到指定账户(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_contract_listissue_ex_async(request, headers, runtime)

    def exec_contract_listissue_ex(
        self,
        request: baasdigital_models.ExecContractListissueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecContractListissueResponse:
        """
        Description: 高性能共享型批量发行权证到指定账户，非高性能共享型项目无法使用此接口
        Summary: 批量发行权证到指定账户(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecContractListissueResponse(),
            self.do_request('1.0', 'antchain.baasdigital.contract.listissue.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_contract_listissue_ex_async(
        self,
        request: baasdigital_models.ExecContractListissueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecContractListissueResponse:
        """
        Description: 高性能共享型批量发行权证到指定账户，非高性能共享型项目无法使用此接口
        Summary: 批量发行权证到指定账户(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecContractListissueResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.contract.listissue.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_owner(
        self,
        request: baasdigital_models.QueryContractOwnerRequest,
    ) -> baasdigital_models.QueryContractOwnerResponse:
        """
        Description: 查询特定资产权证的所有者
        Summary: 查询特定资产权证的所有者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_owner_ex(request, headers, runtime)

    async def query_contract_owner_async(
        self,
        request: baasdigital_models.QueryContractOwnerRequest,
    ) -> baasdigital_models.QueryContractOwnerResponse:
        """
        Description: 查询特定资产权证的所有者
        Summary: 查询特定资产权证的所有者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_owner_ex_async(request, headers, runtime)

    def query_contract_owner_ex(
        self,
        request: baasdigital_models.QueryContractOwnerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.QueryContractOwnerResponse:
        """
        Description: 查询特定资产权证的所有者
        Summary: 查询特定资产权证的所有者
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.QueryContractOwnerResponse(),
            self.do_request('1.0', 'antchain.baasdigital.contract.owner.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_owner_ex_async(
        self,
        request: baasdigital_models.QueryContractOwnerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.QueryContractOwnerResponse:
        """
        Description: 查询特定资产权证的所有者
        Summary: 查询特定资产权证的所有者
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.QueryContractOwnerResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.contract.owner.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_status(
        self,
        request: baasdigital_models.QueryContractStatusRequest,
    ) -> baasdigital_models.QueryContractStatusResponse:
        """
        Description: 查询特定资产权证的状态。0：可用；1：已核销；2：已销毁
        Summary: 查询特定资产权证的状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_status_ex(request, headers, runtime)

    async def query_contract_status_async(
        self,
        request: baasdigital_models.QueryContractStatusRequest,
    ) -> baasdigital_models.QueryContractStatusResponse:
        """
        Description: 查询特定资产权证的状态。0：可用；1：已核销；2：已销毁
        Summary: 查询特定资产权证的状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_status_ex_async(request, headers, runtime)

    def query_contract_status_ex(
        self,
        request: baasdigital_models.QueryContractStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.QueryContractStatusResponse:
        """
        Description: 查询特定资产权证的状态。0：可用；1：已核销；2：已销毁
        Summary: 查询特定资产权证的状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.QueryContractStatusResponse(),
            self.do_request('1.0', 'antchain.baasdigital.contract.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_status_ex_async(
        self,
        request: baasdigital_models.QueryContractStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.QueryContractStatusResponse:
        """
        Description: 查询特定资产权证的状态。0：可用；1：已核销；2：已销毁
        Summary: 查询特定资产权证的状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.QueryContractStatusResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.contract.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_multi_issue(
        self,
        request: baasdigital_models.ExecMultiIssueRequest,
    ) -> baasdigital_models.ExecMultiIssueResponse:
        """
        Description: 数字权证签发(异步)-1155标准专用
        Summary: 数字权证签发(异步)-1155标准专用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_multi_issue_ex(request, headers, runtime)

    async def exec_multi_issue_async(
        self,
        request: baasdigital_models.ExecMultiIssueRequest,
    ) -> baasdigital_models.ExecMultiIssueResponse:
        """
        Description: 数字权证签发(异步)-1155标准专用
        Summary: 数字权证签发(异步)-1155标准专用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_multi_issue_ex_async(request, headers, runtime)

    def exec_multi_issue_ex(
        self,
        request: baasdigital_models.ExecMultiIssueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecMultiIssueResponse:
        """
        Description: 数字权证签发(异步)-1155标准专用
        Summary: 数字权证签发(异步)-1155标准专用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecMultiIssueResponse(),
            self.do_request('1.0', 'antchain.baasdigital.multi.issue.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_multi_issue_ex_async(
        self,
        request: baasdigital_models.ExecMultiIssueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecMultiIssueResponse:
        """
        Description: 数字权证签发(异步)-1155标准专用
        Summary: 数字权证签发(异步)-1155标准专用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecMultiIssueResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.multi.issue.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_multi_transfer(
        self,
        request: baasdigital_models.ExecMultiTransferRequest,
    ) -> baasdigital_models.ExecMultiTransferResponse:
        """
        Description: 数字权证转移(异步)-1155标准专用
        Summary: 数字权证转移(异步)-1155标准专用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_multi_transfer_ex(request, headers, runtime)

    async def exec_multi_transfer_async(
        self,
        request: baasdigital_models.ExecMultiTransferRequest,
    ) -> baasdigital_models.ExecMultiTransferResponse:
        """
        Description: 数字权证转移(异步)-1155标准专用
        Summary: 数字权证转移(异步)-1155标准专用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_multi_transfer_ex_async(request, headers, runtime)

    def exec_multi_transfer_ex(
        self,
        request: baasdigital_models.ExecMultiTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecMultiTransferResponse:
        """
        Description: 数字权证转移(异步)-1155标准专用
        Summary: 数字权证转移(异步)-1155标准专用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecMultiTransferResponse(),
            self.do_request('1.0', 'antchain.baasdigital.multi.transfer.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_multi_transfer_ex_async(
        self,
        request: baasdigital_models.ExecMultiTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecMultiTransferResponse:
        """
        Description: 数字权证转移(异步)-1155标准专用
        Summary: 数字权证转移(异步)-1155标准专用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecMultiTransferResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.multi.transfer.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_multi_writeoff(
        self,
        request: baasdigital_models.ExecMultiWriteoffRequest,
    ) -> baasdigital_models.ExecMultiWriteoffResponse:
        """
        Description: 数字权证核销(异步)-1155标准专用
        Summary: 数字权证核销(异步)-1155标准专用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_multi_writeoff_ex(request, headers, runtime)

    async def exec_multi_writeoff_async(
        self,
        request: baasdigital_models.ExecMultiWriteoffRequest,
    ) -> baasdigital_models.ExecMultiWriteoffResponse:
        """
        Description: 数字权证核销(异步)-1155标准专用
        Summary: 数字权证核销(异步)-1155标准专用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_multi_writeoff_ex_async(request, headers, runtime)

    def exec_multi_writeoff_ex(
        self,
        request: baasdigital_models.ExecMultiWriteoffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecMultiWriteoffResponse:
        """
        Description: 数字权证核销(异步)-1155标准专用
        Summary: 数字权证核销(异步)-1155标准专用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecMultiWriteoffResponse(),
            self.do_request('1.0', 'antchain.baasdigital.multi.writeoff.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_multi_writeoff_ex_async(
        self,
        request: baasdigital_models.ExecMultiWriteoffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecMultiWriteoffResponse:
        """
        Description: 数字权证核销(异步)-1155标准专用
        Summary: 数字权证核销(异步)-1155标准专用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecMultiWriteoffResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.multi.writeoff.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_multi_burnoff(
        self,
        request: baasdigital_models.ExecMultiBurnoffRequest,
    ) -> baasdigital_models.ExecMultiBurnoffResponse:
        """
        Description: 数字权证销毁(异步)-1155标准专用
        Summary: 数字权证销毁(异步)-1155标准专用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_multi_burnoff_ex(request, headers, runtime)

    async def exec_multi_burnoff_async(
        self,
        request: baasdigital_models.ExecMultiBurnoffRequest,
    ) -> baasdigital_models.ExecMultiBurnoffResponse:
        """
        Description: 数字权证销毁(异步)-1155标准专用
        Summary: 数字权证销毁(异步)-1155标准专用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_multi_burnoff_ex_async(request, headers, runtime)

    def exec_multi_burnoff_ex(
        self,
        request: baasdigital_models.ExecMultiBurnoffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecMultiBurnoffResponse:
        """
        Description: 数字权证销毁(异步)-1155标准专用
        Summary: 数字权证销毁(异步)-1155标准专用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecMultiBurnoffResponse(),
            self.do_request('1.0', 'antchain.baasdigital.multi.burnoff.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_multi_burnoff_ex_async(
        self,
        request: baasdigital_models.ExecMultiBurnoffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdigital_models.ExecMultiBurnoffResponse:
        """
        Description: 数字权证销毁(异步)-1155标准专用
        Summary: 数字权证销毁(异步)-1155标准专用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdigital_models.ExecMultiBurnoffResponse(),
            await self.do_request_async('1.0', 'antchain.baasdigital.multi.burnoff.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
