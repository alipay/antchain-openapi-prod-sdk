# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from typing import Dict

from antchain_sdk_riskplus import models as riskplus_models
from alibabacloud_tea_util.client import Client as UtilClient
from alibabacloud_tea_util import models as util_models
from antchain_alipay_util.client import Client as AntchainUtilClient
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
        config: riskplus_models.Config,
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
            'ignoreSSL': runtime.ignore_ssl,
            # 企业风险等级分布统计
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
                    'req_time': AntchainUtilClient.get_timestamp(),
                    'req_msg_id': AntchainUtilClient.get_nonce(),
                    'access_key': self._access_key_id,
                    'base_sdk_version': 'TeaSDK-2.0',
                    'sdk_version': '1.6.5'
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
                _request.query['sign'] = AntchainUtilClient.get_signature(signed_param, self._access_key_secret)
                _last_request = _request
                _response = TeaCore.do_action(_request, _runtime)
                raw = UtilClient.read_as_string(_response.body)
                obj = UtilClient.parse_json(raw)
                res = UtilClient.assert_as_map(obj)
                resp = UtilClient.assert_as_map(res.get('response'))
                if AntchainUtilClient.has_error(raw, self._access_key_secret):
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
            'ignoreSSL': runtime.ignore_ssl,
            # 企业风险等级分布统计
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
                    'req_time': AntchainUtilClient.get_timestamp(),
                    'req_msg_id': AntchainUtilClient.get_nonce(),
                    'access_key': self._access_key_id,
                    'base_sdk_version': 'TeaSDK-2.0',
                    'sdk_version': '1.6.5'
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
                _request.query['sign'] = AntchainUtilClient.get_signature(signed_param, self._access_key_secret)
                _last_request = _request
                _response = await TeaCore.async_do_action(_request, _runtime)
                raw = await UtilClient.read_as_string_async(_response.body)
                obj = UtilClient.parse_json(raw)
                res = UtilClient.assert_as_map(obj)
                resp = UtilClient.assert_as_map(res.get('response'))
                if AntchainUtilClient.has_error(raw, self._access_key_secret):
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

    def query_security_policy(
        self,
        request: riskplus_models.QuerySecurityPolicyRequest,
    ) -> riskplus_models.QuerySecurityPolicyResponse:
        """
        Description: 外部客户业务接入风控+，进行风险识别和风险决策。
        Summary: 策略咨询服务输出
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_security_policy_ex(request, headers, runtime)

    async def query_security_policy_async(
        self,
        request: riskplus_models.QuerySecurityPolicyRequest,
    ) -> riskplus_models.QuerySecurityPolicyResponse:
        """
        Description: 外部客户业务接入风控+，进行风险识别和风险决策。
        Summary: 策略咨询服务输出
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_security_policy_ex_async(request, headers, runtime)

    def query_security_policy_ex(
        self,
        request: riskplus_models.QuerySecurityPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QuerySecurityPolicyResponse:
        """
        Description: 外部客户业务接入风控+，进行风险识别和风险决策。
        Summary: 策略咨询服务输出
        """
        UtilClient.validate_model(request)
        return riskplus_models.QuerySecurityPolicyResponse().from_map(
            self.do_request('1.0', 'riskplus.security.policy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_security_policy_ex_async(
        self,
        request: riskplus_models.QuerySecurityPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QuerySecurityPolicyResponse:
        """
        Description: 外部客户业务接入风控+，进行风险识别和风险决策。
        Summary: 策略咨询服务输出
        """
        UtilClient.validate_model(request)
        return riskplus_models.QuerySecurityPolicyResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.security.policy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_security_data(
        self,
        request: riskplus_models.SendSecurityDataRequest,
    ) -> riskplus_models.SendSecurityDataResponse:
        """
        Description: 向风控发送异步安全数据
        Summary: 异步发送安全数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_security_data_ex(request, headers, runtime)

    async def send_security_data_async(
        self,
        request: riskplus_models.SendSecurityDataRequest,
    ) -> riskplus_models.SendSecurityDataResponse:
        """
        Description: 向风控发送异步安全数据
        Summary: 异步发送安全数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_security_data_ex_async(request, headers, runtime)

    def send_security_data_ex(
        self,
        request: riskplus_models.SendSecurityDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SendSecurityDataResponse:
        """
        Description: 向风控发送异步安全数据
        Summary: 异步发送安全数据
        """
        UtilClient.validate_model(request)
        return riskplus_models.SendSecurityDataResponse().from_map(
            self.do_request('1.0', 'riskplus.security.data.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_security_data_ex_async(
        self,
        request: riskplus_models.SendSecurityDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SendSecurityDataResponse:
        """
        Description: 向风控发送异步安全数据
        Summary: 异步发送安全数据
        """
        UtilClient.validate_model(request)
        return riskplus_models.SendSecurityDataResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.security.data.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_security_policy(
        self,
        request: riskplus_models.ConfirmSecurityPolicyRequest,
    ) -> riskplus_models.ConfirmSecurityPolicyResponse:
        """
        Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
        Summary: 安全策略确认服务输出
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_security_policy_ex(request, headers, runtime)

    async def confirm_security_policy_async(
        self,
        request: riskplus_models.ConfirmSecurityPolicyRequest,
    ) -> riskplus_models.ConfirmSecurityPolicyResponse:
        """
        Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
        Summary: 安全策略确认服务输出
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_security_policy_ex_async(request, headers, runtime)

    def confirm_security_policy_ex(
        self,
        request: riskplus_models.ConfirmSecurityPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ConfirmSecurityPolicyResponse:
        """
        Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
        Summary: 安全策略确认服务输出
        """
        UtilClient.validate_model(request)
        return riskplus_models.ConfirmSecurityPolicyResponse().from_map(
            self.do_request('1.0', 'riskplus.security.policy.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_security_policy_ex_async(
        self,
        request: riskplus_models.ConfirmSecurityPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ConfirmSecurityPolicyResponse:
        """
        Description: 外部客户业务接入蚂蚁风控，进行风险识别和风险决策输出核身后，进行二次确认
        Summary: 安全策略确认服务输出
        """
        UtilClient.validate_model(request)
        return riskplus_models.ConfirmSecurityPolicyResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.security.policy.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_security_rds(
        self,
        request: riskplus_models.CheckSecurityRdsRequest,
    ) -> riskplus_models.CheckSecurityRdsResponse:
        """
        Description: 外部客户业务接入风控+，进行人机识别判断。
        Summary: 策略咨询服务输出
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_security_rds_ex(request, headers, runtime)

    async def check_security_rds_async(
        self,
        request: riskplus_models.CheckSecurityRdsRequest,
    ) -> riskplus_models.CheckSecurityRdsResponse:
        """
        Description: 外部客户业务接入风控+，进行人机识别判断。
        Summary: 策略咨询服务输出
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_security_rds_ex_async(request, headers, runtime)

    def check_security_rds_ex(
        self,
        request: riskplus_models.CheckSecurityRdsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CheckSecurityRdsResponse:
        """
        Description: 外部客户业务接入风控+，进行人机识别判断。
        Summary: 策略咨询服务输出
        """
        UtilClient.validate_model(request)
        return riskplus_models.CheckSecurityRdsResponse().from_map(
            self.do_request('1.0', 'riskplus.security.rds.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_security_rds_ex_async(
        self,
        request: riskplus_models.CheckSecurityRdsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CheckSecurityRdsResponse:
        """
        Description: 外部客户业务接入风控+，进行人机识别判断。
        Summary: 策略咨询服务输出
        """
        UtilClient.validate_model(request)
        return riskplus_models.CheckSecurityRdsResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.security.rds.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_security_data(
        self,
        request: riskplus_models.QuerySecurityDataRequest,
    ) -> riskplus_models.QuerySecurityDataResponse:
        """
        Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
        Summary: 安全数据服务输出
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_security_data_ex(request, headers, runtime)

    async def query_security_data_async(
        self,
        request: riskplus_models.QuerySecurityDataRequest,
    ) -> riskplus_models.QuerySecurityDataResponse:
        """
        Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
        Summary: 安全数据服务输出
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_security_data_ex_async(request, headers, runtime)

    def query_security_data_ex(
        self,
        request: riskplus_models.QuerySecurityDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QuerySecurityDataResponse:
        """
        Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
        Summary: 安全数据服务输出
        """
        UtilClient.validate_model(request)
        return riskplus_models.QuerySecurityDataResponse().from_map(
            self.do_request('1.0', 'riskplus.security.data.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_security_data_ex_async(
        self,
        request: riskplus_models.QuerySecurityDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QuerySecurityDataResponse:
        """
        Description: 外部客户业务接入风控+，请求安全数据如ip画像等。
        Summary: 安全数据服务输出
        """
        UtilClient.validate_model(request)
        return riskplus_models.QuerySecurityDataResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.security.data.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_security_data(
        self,
        request: riskplus_models.CheckSecurityDataRequest,
    ) -> riskplus_models.CheckSecurityDataResponse:
        """
        Description: 外部客户数据校验接口，比如端防护
        Summary: 安全数据服务校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_security_data_ex(request, headers, runtime)

    async def check_security_data_async(
        self,
        request: riskplus_models.CheckSecurityDataRequest,
    ) -> riskplus_models.CheckSecurityDataResponse:
        """
        Description: 外部客户数据校验接口，比如端防护
        Summary: 安全数据服务校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_security_data_ex_async(request, headers, runtime)

    def check_security_data_ex(
        self,
        request: riskplus_models.CheckSecurityDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CheckSecurityDataResponse:
        """
        Description: 外部客户数据校验接口，比如端防护
        Summary: 安全数据服务校验
        """
        UtilClient.validate_model(request)
        return riskplus_models.CheckSecurityDataResponse().from_map(
            self.do_request('1.0', 'riskplus.security.data.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_security_data_ex_async(
        self,
        request: riskplus_models.CheckSecurityDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CheckSecurityDataResponse:
        """
        Description: 外部客户数据校验接口，比如端防护
        Summary: 安全数据服务校验
        """
        UtilClient.validate_model(request)
        return riskplus_models.CheckSecurityDataResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.security.data.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_finservice_zhima_identify(
        self,
        request: riskplus_models.VerifyFinserviceZhimaIdentifyRequest,
    ) -> riskplus_models.VerifyFinserviceZhimaIdentifyResponse:
        """
        Description: 四要素认证首先调用此接口
        Summary: 芝麻四要素接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_finservice_zhima_identify_ex(request, headers, runtime)

    async def verify_finservice_zhima_identify_async(
        self,
        request: riskplus_models.VerifyFinserviceZhimaIdentifyRequest,
    ) -> riskplus_models.VerifyFinserviceZhimaIdentifyResponse:
        """
        Description: 四要素认证首先调用此接口
        Summary: 芝麻四要素接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_finservice_zhima_identify_ex_async(request, headers, runtime)

    def verify_finservice_zhima_identify_ex(
        self,
        request: riskplus_models.VerifyFinserviceZhimaIdentifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.VerifyFinserviceZhimaIdentifyResponse:
        """
        Description: 四要素认证首先调用此接口
        Summary: 芝麻四要素接口
        """
        UtilClient.validate_model(request)
        return riskplus_models.VerifyFinserviceZhimaIdentifyResponse().from_map(
            self.do_request('1.0', 'riskplus.finservice.zhima.identify.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_finservice_zhima_identify_ex_async(
        self,
        request: riskplus_models.VerifyFinserviceZhimaIdentifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.VerifyFinserviceZhimaIdentifyResponse:
        """
        Description: 四要素认证首先调用此接口
        Summary: 芝麻四要素接口
        """
        UtilClient.validate_model(request)
        return riskplus_models.VerifyFinserviceZhimaIdentifyResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.finservice.zhima.identify.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_finservice_zhima_identify(
        self,
        request: riskplus_models.QueryFinserviceZhimaIdentifyRequest,
    ) -> riskplus_models.QueryFinserviceZhimaIdentifyResponse:
        """
        Description:
        Summary: 芝麻四要素认证结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_finservice_zhima_identify_ex(request, headers, runtime)

    async def query_finservice_zhima_identify_async(
        self,
        request: riskplus_models.QueryFinserviceZhimaIdentifyRequest,
    ) -> riskplus_models.QueryFinserviceZhimaIdentifyResponse:
        """
        Description:
        Summary: 芝麻四要素认证结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_finservice_zhima_identify_ex_async(request, headers, runtime)

    def query_finservice_zhima_identify_ex(
        self,
        request: riskplus_models.QueryFinserviceZhimaIdentifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryFinserviceZhimaIdentifyResponse:
        """
        Description:
        Summary: 芝麻四要素认证结果查询
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryFinserviceZhimaIdentifyResponse().from_map(
            self.do_request('1.0', 'riskplus.finservice.zhima.identify.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_finservice_zhima_identify_ex_async(
        self,
        request: riskplus_models.QueryFinserviceZhimaIdentifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryFinserviceZhimaIdentifyResponse:
        """
        Description:
        Summary: 芝麻四要素认证结果查询
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryFinserviceZhimaIdentifyResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.finservice.zhima.identify.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rbb_generic_invoke(
        self,
        request: riskplus_models.QueryRbbGenericInvokeRequest,
    ) -> riskplus_models.QueryRbbGenericInvokeResponse:
        """
        Description: 风险大脑企业版通用查询接口
        Summary: 【已废弃】
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rbb_generic_invoke_ex(request, headers, runtime)

    async def query_rbb_generic_invoke_async(
        self,
        request: riskplus_models.QueryRbbGenericInvokeRequest,
    ) -> riskplus_models.QueryRbbGenericInvokeResponse:
        """
        Description: 风险大脑企业版通用查询接口
        Summary: 【已废弃】
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rbb_generic_invoke_ex_async(request, headers, runtime)

    def query_rbb_generic_invoke_ex(
        self,
        request: riskplus_models.QueryRbbGenericInvokeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRbbGenericInvokeResponse:
        """
        Description: 风险大脑企业版通用查询接口
        Summary: 【已废弃】
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRbbGenericInvokeResponse().from_map(
            self.do_request('1.0', 'riskplus.rbb.generic.invoke.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rbb_generic_invoke_ex_async(
        self,
        request: riskplus_models.QueryRbbGenericInvokeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRbbGenericInvokeResponse:
        """
        Description: 风险大脑企业版通用查询接口
        Summary: 【已废弃】
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRbbGenericInvokeResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rbb.generic.invoke.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_rbb_token(
        self,
        request: riskplus_models.CreateRbbTokenRequest,
    ) -> riskplus_models.CreateRbbTokenResponse:
        """
        Description: 风险大脑企业版token生成
        Summary: 【已废弃】
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_rbb_token_ex(request, headers, runtime)

    async def create_rbb_token_async(
        self,
        request: riskplus_models.CreateRbbTokenRequest,
    ) -> riskplus_models.CreateRbbTokenResponse:
        """
        Description: 风险大脑企业版token生成
        Summary: 【已废弃】
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_rbb_token_ex_async(request, headers, runtime)

    def create_rbb_token_ex(
        self,
        request: riskplus_models.CreateRbbTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CreateRbbTokenResponse:
        """
        Description: 风险大脑企业版token生成
        Summary: 【已废弃】
        """
        UtilClient.validate_model(request)
        return riskplus_models.CreateRbbTokenResponse().from_map(
            self.do_request('1.0', 'riskplus.rbb.token.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_rbb_token_ex_async(
        self,
        request: riskplus_models.CreateRbbTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CreateRbbTokenResponse:
        """
        Description: 风险大脑企业版token生成
        Summary: 【已废弃】
        """
        UtilClient.validate_model(request)
        return riskplus_models.CreateRbbTokenResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rbb.token.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_rbb_api_gwtoken(
        self,
        request: riskplus_models.CreateRbbApiGwtokenRequest,
    ) -> riskplus_models.CreateRbbApiGwtokenResponse:
        """
        Description: 获取风险大脑企业版登录token
        Summary: 【已废弃】
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_rbb_api_gwtoken_ex(request, headers, runtime)

    async def create_rbb_api_gwtoken_async(
        self,
        request: riskplus_models.CreateRbbApiGwtokenRequest,
    ) -> riskplus_models.CreateRbbApiGwtokenResponse:
        """
        Description: 获取风险大脑企业版登录token
        Summary: 【已废弃】
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_rbb_api_gwtoken_ex_async(request, headers, runtime)

    def create_rbb_api_gwtoken_ex(
        self,
        request: riskplus_models.CreateRbbApiGwtokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CreateRbbApiGwtokenResponse:
        """
        Description: 获取风险大脑企业版登录token
        Summary: 【已废弃】
        """
        UtilClient.validate_model(request)
        return riskplus_models.CreateRbbApiGwtokenResponse().from_map(
            self.do_request('1.0', 'riskplus.rbb.api.gwtoken.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_rbb_api_gwtoken_ex_async(
        self,
        request: riskplus_models.CreateRbbApiGwtokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CreateRbbApiGwtokenResponse:
        """
        Description: 获取风险大脑企业版登录token
        Summary: 【已废弃】
        """
        UtilClient.validate_model(request)
        return riskplus_models.CreateRbbApiGwtokenResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rbb.api.gwtoken.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rbb_general(
        self,
        request: riskplus_models.QueryRbbGeneralRequest,
    ) -> riskplus_models.QueryRbbGeneralResponse:
        """
        Description: 风险大脑企业版通用查询OpenAPI
        Summary: 风险大脑企业版通用查询OpenAPI
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rbb_general_ex(request, headers, runtime)

    async def query_rbb_general_async(
        self,
        request: riskplus_models.QueryRbbGeneralRequest,
    ) -> riskplus_models.QueryRbbGeneralResponse:
        """
        Description: 风险大脑企业版通用查询OpenAPI
        Summary: 风险大脑企业版通用查询OpenAPI
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rbb_general_ex_async(request, headers, runtime)

    def query_rbb_general_ex(
        self,
        request: riskplus_models.QueryRbbGeneralRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRbbGeneralResponse:
        """
        Description: 风险大脑企业版通用查询OpenAPI
        Summary: 风险大脑企业版通用查询OpenAPI
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRbbGeneralResponse().from_map(
            self.do_request('1.0', 'riskplus.rbb.general.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rbb_general_ex_async(
        self,
        request: riskplus_models.QueryRbbGeneralRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRbbGeneralResponse:
        """
        Description: 风险大脑企业版通用查询OpenAPI
        Summary: 风险大脑企业版通用查询OpenAPI
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRbbGeneralResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rbb.general.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_rbb_login_token(
        self,
        request: riskplus_models.GetRbbLoginTokenRequest,
    ) -> riskplus_models.GetRbbLoginTokenResponse:
        """
        Description: 获取登录Token
        Summary: 获取登录Token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_rbb_login_token_ex(request, headers, runtime)

    async def get_rbb_login_token_async(
        self,
        request: riskplus_models.GetRbbLoginTokenRequest,
    ) -> riskplus_models.GetRbbLoginTokenResponse:
        """
        Description: 获取登录Token
        Summary: 获取登录Token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_rbb_login_token_ex_async(request, headers, runtime)

    def get_rbb_login_token_ex(
        self,
        request: riskplus_models.GetRbbLoginTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.GetRbbLoginTokenResponse:
        """
        Description: 获取登录Token
        Summary: 获取登录Token
        """
        UtilClient.validate_model(request)
        return riskplus_models.GetRbbLoginTokenResponse().from_map(
            self.do_request('1.0', 'riskplus.rbb.login.token.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_rbb_login_token_ex_async(
        self,
        request: riskplus_models.GetRbbLoginTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.GetRbbLoginTokenResponse:
        """
        Description: 获取登录Token
        Summary: 获取登录Token
        """
        UtilClient.validate_model(request)
        return riskplus_models.GetRbbLoginTokenResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rbb.login.token.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_rbb_tenant(
        self,
        request: riskplus_models.CreateRbbTenantRequest,
    ) -> riskplus_models.CreateRbbTenantResponse:
        """
        Description: 风险大脑企业版创建租户
        Summary: 风险大脑企业版创建租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_rbb_tenant_ex(request, headers, runtime)

    async def create_rbb_tenant_async(
        self,
        request: riskplus_models.CreateRbbTenantRequest,
    ) -> riskplus_models.CreateRbbTenantResponse:
        """
        Description: 风险大脑企业版创建租户
        Summary: 风险大脑企业版创建租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_rbb_tenant_ex_async(request, headers, runtime)

    def create_rbb_tenant_ex(
        self,
        request: riskplus_models.CreateRbbTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CreateRbbTenantResponse:
        """
        Description: 风险大脑企业版创建租户
        Summary: 风险大脑企业版创建租户
        """
        UtilClient.validate_model(request)
        return riskplus_models.CreateRbbTenantResponse().from_map(
            self.do_request('1.0', 'riskplus.rbb.tenant.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_rbb_tenant_ex_async(
        self,
        request: riskplus_models.CreateRbbTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CreateRbbTenantResponse:
        """
        Description: 风险大脑企业版创建租户
        Summary: 风险大脑企业版创建租户
        """
        UtilClient.validate_model(request)
        return riskplus_models.CreateRbbTenantResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rbb.tenant.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_rbb_user(
        self,
        request: riskplus_models.CreateRbbUserRequest,
    ) -> riskplus_models.CreateRbbUserResponse:
        """
        Description: 风险大脑企业版创建用户
        Summary: 风险大脑企业版创建用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_rbb_user_ex(request, headers, runtime)

    async def create_rbb_user_async(
        self,
        request: riskplus_models.CreateRbbUserRequest,
    ) -> riskplus_models.CreateRbbUserResponse:
        """
        Description: 风险大脑企业版创建用户
        Summary: 风险大脑企业版创建用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_rbb_user_ex_async(request, headers, runtime)

    def create_rbb_user_ex(
        self,
        request: riskplus_models.CreateRbbUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CreateRbbUserResponse:
        """
        Description: 风险大脑企业版创建用户
        Summary: 风险大脑企业版创建用户
        """
        UtilClient.validate_model(request)
        return riskplus_models.CreateRbbUserResponse().from_map(
            self.do_request('1.0', 'riskplus.rbb.user.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_rbb_user_ex_async(
        self,
        request: riskplus_models.CreateRbbUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CreateRbbUserResponse:
        """
        Description: 风险大脑企业版创建用户
        Summary: 风险大脑企业版创建用户
        """
        UtilClient.validate_model(request)
        return riskplus_models.CreateRbbUserResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rbb.user.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rtop_company_opinion(
        self,
        request: riskplus_models.QueryRtopCompanyOpinionRequest,
    ) -> riskplus_models.QueryRtopCompanyOpinionResponse:
        """
        Description: 查询所在地的负面舆情企业列表
        Summary: 查询所在地的负面舆情企业列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rtop_company_opinion_ex(request, headers, runtime)

    async def query_rtop_company_opinion_async(
        self,
        request: riskplus_models.QueryRtopCompanyOpinionRequest,
    ) -> riskplus_models.QueryRtopCompanyOpinionResponse:
        """
        Description: 查询所在地的负面舆情企业列表
        Summary: 查询所在地的负面舆情企业列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rtop_company_opinion_ex_async(request, headers, runtime)

    def query_rtop_company_opinion_ex(
        self,
        request: riskplus_models.QueryRtopCompanyOpinionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCompanyOpinionResponse:
        """
        Description: 查询所在地的负面舆情企业列表
        Summary: 查询所在地的负面舆情企业列表
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCompanyOpinionResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.company.opinion.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rtop_company_opinion_ex_async(
        self,
        request: riskplus_models.QueryRtopCompanyOpinionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCompanyOpinionResponse:
        """
        Description: 查询所在地的负面舆情企业列表
        Summary: 查询所在地的负面舆情企业列表
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCompanyOpinionResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.company.opinion.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_rtop_company_opinions(
        self,
        request: riskplus_models.ListRtopCompanyOpinionsRequest,
    ) -> riskplus_models.ListRtopCompanyOpinionsResponse:
        """
        Description: 查询企业的舆情详情信息
        Summary: 查询企业的舆情详情信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_rtop_company_opinions_ex(request, headers, runtime)

    async def list_rtop_company_opinions_async(
        self,
        request: riskplus_models.ListRtopCompanyOpinionsRequest,
    ) -> riskplus_models.ListRtopCompanyOpinionsResponse:
        """
        Description: 查询企业的舆情详情信息
        Summary: 查询企业的舆情详情信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_rtop_company_opinions_ex_async(request, headers, runtime)

    def list_rtop_company_opinions_ex(
        self,
        request: riskplus_models.ListRtopCompanyOpinionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ListRtopCompanyOpinionsResponse:
        """
        Description: 查询企业的舆情详情信息
        Summary: 查询企业的舆情详情信息
        """
        UtilClient.validate_model(request)
        return riskplus_models.ListRtopCompanyOpinionsResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.company.opinions.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_rtop_company_opinions_ex_async(
        self,
        request: riskplus_models.ListRtopCompanyOpinionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ListRtopCompanyOpinionsResponse:
        """
        Description: 查询企业的舆情详情信息
        Summary: 查询企业的舆情详情信息
        """
        UtilClient.validate_model(request)
        return riskplus_models.ListRtopCompanyOpinionsResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.company.opinions.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_rtop_company_monitor(
        self,
        request: riskplus_models.GetRtopCompanyMonitorRequest,
    ) -> riskplus_models.GetRtopCompanyMonitorResponse:
        """
        Description: 查询监测企业的详情
        Summary: 查询监测企业的详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_rtop_company_monitor_ex(request, headers, runtime)

    async def get_rtop_company_monitor_async(
        self,
        request: riskplus_models.GetRtopCompanyMonitorRequest,
    ) -> riskplus_models.GetRtopCompanyMonitorResponse:
        """
        Description: 查询监测企业的详情
        Summary: 查询监测企业的详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_rtop_company_monitor_ex_async(request, headers, runtime)

    def get_rtop_company_monitor_ex(
        self,
        request: riskplus_models.GetRtopCompanyMonitorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.GetRtopCompanyMonitorResponse:
        """
        Description: 查询监测企业的详情
        Summary: 查询监测企业的详情
        """
        UtilClient.validate_model(request)
        return riskplus_models.GetRtopCompanyMonitorResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.company.monitor.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_rtop_company_monitor_ex_async(
        self,
        request: riskplus_models.GetRtopCompanyMonitorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.GetRtopCompanyMonitorResponse:
        """
        Description: 查询监测企业的详情
        Summary: 查询监测企业的详情
        """
        UtilClient.validate_model(request)
        return riskplus_models.GetRtopCompanyMonitorResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.company.monitor.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rtop_crowdrisk_statistic(
        self,
        request: riskplus_models.QueryRtopCrowdriskStatisticRequest,
    ) -> riskplus_models.QueryRtopCrowdriskStatisticResponse:
        """
        Description: 查询所在地的涉众风险企业统计信息
        Summary: 查询所在地的涉众风险企业统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rtop_crowdrisk_statistic_ex(request, headers, runtime)

    async def query_rtop_crowdrisk_statistic_async(
        self,
        request: riskplus_models.QueryRtopCrowdriskStatisticRequest,
    ) -> riskplus_models.QueryRtopCrowdriskStatisticResponse:
        """
        Description: 查询所在地的涉众风险企业统计信息
        Summary: 查询所在地的涉众风险企业统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rtop_crowdrisk_statistic_ex_async(request, headers, runtime)

    def query_rtop_crowdrisk_statistic_ex(
        self,
        request: riskplus_models.QueryRtopCrowdriskStatisticRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCrowdriskStatisticResponse:
        """
        Description: 查询所在地的涉众风险企业统计信息
        Summary: 查询所在地的涉众风险企业统计信息
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCrowdriskStatisticResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.crowdrisk.statistic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rtop_crowdrisk_statistic_ex_async(
        self,
        request: riskplus_models.QueryRtopCrowdriskStatisticRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCrowdriskStatisticResponse:
        """
        Description: 查询所在地的涉众风险企业统计信息
        Summary: 查询所在地的涉众风险企业统计信息
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCrowdriskStatisticResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.crowdrisk.statistic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_rtop_crowdrisk(
        self,
        request: riskplus_models.ListRtopCrowdriskRequest,
    ) -> riskplus_models.ListRtopCrowdriskResponse:
        """
        Description: 查询涉众风险企业的列表
        Summary: 查询涉众风险企业的列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_rtop_crowdrisk_ex(request, headers, runtime)

    async def list_rtop_crowdrisk_async(
        self,
        request: riskplus_models.ListRtopCrowdriskRequest,
    ) -> riskplus_models.ListRtopCrowdriskResponse:
        """
        Description: 查询涉众风险企业的列表
        Summary: 查询涉众风险企业的列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_rtop_crowdrisk_ex_async(request, headers, runtime)

    def list_rtop_crowdrisk_ex(
        self,
        request: riskplus_models.ListRtopCrowdriskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ListRtopCrowdriskResponse:
        """
        Description: 查询涉众风险企业的列表
        Summary: 查询涉众风险企业的列表
        """
        UtilClient.validate_model(request)
        return riskplus_models.ListRtopCrowdriskResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.crowdrisk.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_rtop_crowdrisk_ex_async(
        self,
        request: riskplus_models.ListRtopCrowdriskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ListRtopCrowdriskResponse:
        """
        Description: 查询涉众风险企业的列表
        Summary: 查询涉众风险企业的列表
        """
        UtilClient.validate_model(request)
        return riskplus_models.ListRtopCrowdriskResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.crowdrisk.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rtop_crowdrisk_detail(
        self,
        request: riskplus_models.QueryRtopCrowdriskDetailRequest,
    ) -> riskplus_models.QueryRtopCrowdriskDetailResponse:
        """
        Description: 查询涉众风险企业的详细信息
        Summary: 查询涉众风险企业的详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rtop_crowdrisk_detail_ex(request, headers, runtime)

    async def query_rtop_crowdrisk_detail_async(
        self,
        request: riskplus_models.QueryRtopCrowdriskDetailRequest,
    ) -> riskplus_models.QueryRtopCrowdriskDetailResponse:
        """
        Description: 查询涉众风险企业的详细信息
        Summary: 查询涉众风险企业的详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rtop_crowdrisk_detail_ex_async(request, headers, runtime)

    def query_rtop_crowdrisk_detail_ex(
        self,
        request: riskplus_models.QueryRtopCrowdriskDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCrowdriskDetailResponse:
        """
        Description: 查询涉众风险企业的详细信息
        Summary: 查询涉众风险企业的详细信息
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCrowdriskDetailResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.crowdrisk.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rtop_crowdrisk_detail_ex_async(
        self,
        request: riskplus_models.QueryRtopCrowdriskDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCrowdriskDetailResponse:
        """
        Description: 查询涉众风险企业的详细信息
        Summary: 查询涉众风险企业的详细信息
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCrowdriskDetailResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.crowdrisk.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rtop_riskstorm(
        self,
        request: riskplus_models.QueryRtopRiskstormRequest,
    ) -> riskplus_models.QueryRtopRiskstormResponse:
        """
        Description: 查询风报的详细信息
        Summary: 查询风报的详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rtop_riskstorm_ex(request, headers, runtime)

    async def query_rtop_riskstorm_async(
        self,
        request: riskplus_models.QueryRtopRiskstormRequest,
    ) -> riskplus_models.QueryRtopRiskstormResponse:
        """
        Description: 查询风报的详细信息
        Summary: 查询风报的详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rtop_riskstorm_ex_async(request, headers, runtime)

    def query_rtop_riskstorm_ex(
        self,
        request: riskplus_models.QueryRtopRiskstormRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopRiskstormResponse:
        """
        Description: 查询风报的详细信息
        Summary: 查询风报的详细信息
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopRiskstormResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.riskstorm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rtop_riskstorm_ex_async(
        self,
        request: riskplus_models.QueryRtopRiskstormRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopRiskstormResponse:
        """
        Description: 查询风报的详细信息
        Summary: 查询风报的详细信息
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopRiskstormResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.riskstorm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rtop_crowdrisk_sum(
        self,
        request: riskplus_models.QueryRtopCrowdriskSumRequest,
    ) -> riskplus_models.QueryRtopCrowdriskSumResponse:
        """
        Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
        Summary: 监管涉众风险一批企业的影响人数影响金额
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rtop_crowdrisk_sum_ex(request, headers, runtime)

    async def query_rtop_crowdrisk_sum_async(
        self,
        request: riskplus_models.QueryRtopCrowdriskSumRequest,
    ) -> riskplus_models.QueryRtopCrowdriskSumResponse:
        """
        Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
        Summary: 监管涉众风险一批企业的影响人数影响金额
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rtop_crowdrisk_sum_ex_async(request, headers, runtime)

    def query_rtop_crowdrisk_sum_ex(
        self,
        request: riskplus_models.QueryRtopCrowdriskSumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCrowdriskSumResponse:
        """
        Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
        Summary: 监管涉众风险一批企业的影响人数影响金额
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCrowdriskSumResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.crowdrisk.sum.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rtop_crowdrisk_sum_ex_async(
        self,
        request: riskplus_models.QueryRtopCrowdriskSumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCrowdriskSumResponse:
        """
        Description: 监管涉众风险指定的一批企业的影响人数之和、影响金额之和
        Summary: 监管涉众风险一批企业的影响人数影响金额
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCrowdriskSumResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.crowdrisk.sum.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_rtop_company_detail(
        self,
        request: riskplus_models.GetRtopCompanyDetailRequest,
    ) -> riskplus_models.GetRtopCompanyDetailResponse:
        """
        Description: 监管企业详情获取，包括风险分数、风险标签。
        Summary: 监管企业详情获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_rtop_company_detail_ex(request, headers, runtime)

    async def get_rtop_company_detail_async(
        self,
        request: riskplus_models.GetRtopCompanyDetailRequest,
    ) -> riskplus_models.GetRtopCompanyDetailResponse:
        """
        Description: 监管企业详情获取，包括风险分数、风险标签。
        Summary: 监管企业详情获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_rtop_company_detail_ex_async(request, headers, runtime)

    def get_rtop_company_detail_ex(
        self,
        request: riskplus_models.GetRtopCompanyDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.GetRtopCompanyDetailResponse:
        """
        Description: 监管企业详情获取，包括风险分数、风险标签。
        Summary: 监管企业详情获取
        """
        UtilClient.validate_model(request)
        return riskplus_models.GetRtopCompanyDetailResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.company.detail.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_rtop_company_detail_ex_async(
        self,
        request: riskplus_models.GetRtopCompanyDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.GetRtopCompanyDetailResponse:
        """
        Description: 监管企业详情获取，包括风险分数、风险标签。
        Summary: 监管企业详情获取
        """
        UtilClient.validate_model(request)
        return riskplus_models.GetRtopCompanyDetailResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.company.detail.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rtop_company_riskinfo(
        self,
        request: riskplus_models.QueryRtopCompanyRiskinfoRequest,
    ) -> riskplus_models.QueryRtopCompanyRiskinfoResponse:
        """
        Description: 企业风险查询接口
        Summary: 企业风险查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rtop_company_riskinfo_ex(request, headers, runtime)

    async def query_rtop_company_riskinfo_async(
        self,
        request: riskplus_models.QueryRtopCompanyRiskinfoRequest,
    ) -> riskplus_models.QueryRtopCompanyRiskinfoResponse:
        """
        Description: 企业风险查询接口
        Summary: 企业风险查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rtop_company_riskinfo_ex_async(request, headers, runtime)

    def query_rtop_company_riskinfo_ex(
        self,
        request: riskplus_models.QueryRtopCompanyRiskinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCompanyRiskinfoResponse:
        """
        Description: 企业风险查询接口
        Summary: 企业风险查询接口
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCompanyRiskinfoResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.company.riskinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rtop_company_riskinfo_ex_async(
        self,
        request: riskplus_models.QueryRtopCompanyRiskinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCompanyRiskinfoResponse:
        """
        Description: 企业风险查询接口
        Summary: 企业风险查询接口
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCompanyRiskinfoResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.company.riskinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_rtop_generic_invoke(
        self,
        request: riskplus_models.ExecRtopGenericInvokeRequest,
    ) -> riskplus_models.ExecRtopGenericInvokeResponse:
        """
        Description: 公有云通用风险信息接口
        Summary: 公有云通用风险信息接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_rtop_generic_invoke_ex(request, headers, runtime)

    async def exec_rtop_generic_invoke_async(
        self,
        request: riskplus_models.ExecRtopGenericInvokeRequest,
    ) -> riskplus_models.ExecRtopGenericInvokeResponse:
        """
        Description: 公有云通用风险信息接口
        Summary: 公有云通用风险信息接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_rtop_generic_invoke_ex_async(request, headers, runtime)

    def exec_rtop_generic_invoke_ex(
        self,
        request: riskplus_models.ExecRtopGenericInvokeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ExecRtopGenericInvokeResponse:
        """
        Description: 公有云通用风险信息接口
        Summary: 公有云通用风险信息接口
        """
        UtilClient.validate_model(request)
        return riskplus_models.ExecRtopGenericInvokeResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.generic.invoke.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_rtop_generic_invoke_ex_async(
        self,
        request: riskplus_models.ExecRtopGenericInvokeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ExecRtopGenericInvokeResponse:
        """
        Description: 公有云通用风险信息接口
        Summary: 公有云通用风险信息接口
        """
        UtilClient.validate_model(request)
        return riskplus_models.ExecRtopGenericInvokeResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.generic.invoke.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_rtop_token(
        self,
        request: riskplus_models.CreateRtopTokenRequest,
    ) -> riskplus_models.CreateRtopTokenResponse:
        """
        Description: 公有云生成token
        Summary: 公有云生成token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_rtop_token_ex(request, headers, runtime)

    async def create_rtop_token_async(
        self,
        request: riskplus_models.CreateRtopTokenRequest,
    ) -> riskplus_models.CreateRtopTokenResponse:
        """
        Description: 公有云生成token
        Summary: 公有云生成token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_rtop_token_ex_async(request, headers, runtime)

    def create_rtop_token_ex(
        self,
        request: riskplus_models.CreateRtopTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CreateRtopTokenResponse:
        """
        Description: 公有云生成token
        Summary: 公有云生成token
        """
        UtilClient.validate_model(request)
        return riskplus_models.CreateRtopTokenResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.token.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_rtop_token_ex_async(
        self,
        request: riskplus_models.CreateRtopTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CreateRtopTokenResponse:
        """
        Description: 公有云生成token
        Summary: 公有云生成token
        """
        UtilClient.validate_model(request)
        return riskplus_models.CreateRtopTokenResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.token.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rtop_risklabel(
        self,
        request: riskplus_models.QueryRtopRisklabelRequest,
    ) -> riskplus_models.QueryRtopRisklabelResponse:
        """
        Description: 标签全量信息获取
        Summary: 标签全量信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rtop_risklabel_ex(request, headers, runtime)

    async def query_rtop_risklabel_async(
        self,
        request: riskplus_models.QueryRtopRisklabelRequest,
    ) -> riskplus_models.QueryRtopRisklabelResponse:
        """
        Description: 标签全量信息获取
        Summary: 标签全量信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rtop_risklabel_ex_async(request, headers, runtime)

    def query_rtop_risklabel_ex(
        self,
        request: riskplus_models.QueryRtopRisklabelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopRisklabelResponse:
        """
        Description: 标签全量信息获取
        Summary: 标签全量信息获取
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopRisklabelResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.risklabel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rtop_risklabel_ex_async(
        self,
        request: riskplus_models.QueryRtopRisklabelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopRisklabelResponse:
        """
        Description: 标签全量信息获取
        Summary: 标签全量信息获取
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopRisklabelResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.risklabel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rtop_company(
        self,
        request: riskplus_models.QueryRtopCompanyRequest,
    ) -> riskplus_models.QueryRtopCompanyResponse:
        """
        Description: 企业全量信息获取
        Summary: 企业全量信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rtop_company_ex(request, headers, runtime)

    async def query_rtop_company_async(
        self,
        request: riskplus_models.QueryRtopCompanyRequest,
    ) -> riskplus_models.QueryRtopCompanyResponse:
        """
        Description: 企业全量信息获取
        Summary: 企业全量信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rtop_company_ex_async(request, headers, runtime)

    def query_rtop_company_ex(
        self,
        request: riskplus_models.QueryRtopCompanyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCompanyResponse:
        """
        Description: 企业全量信息获取
        Summary: 企业全量信息获取
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCompanyResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.company.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rtop_company_ex_async(
        self,
        request: riskplus_models.QueryRtopCompanyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCompanyResponse:
        """
        Description: 企业全量信息获取
        Summary: 企业全量信息获取
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCompanyResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.company.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rtop_risklabel_filter(
        self,
        request: riskplus_models.QueryRtopRisklabelFilterRequest,
    ) -> riskplus_models.QueryRtopRisklabelFilterResponse:
        """
        Description: 标签配置全量信息获取
        rtop_company_tag_filter_config
        Summary: 标签配置全量信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rtop_risklabel_filter_ex(request, headers, runtime)

    async def query_rtop_risklabel_filter_async(
        self,
        request: riskplus_models.QueryRtopRisklabelFilterRequest,
    ) -> riskplus_models.QueryRtopRisklabelFilterResponse:
        """
        Description: 标签配置全量信息获取
        rtop_company_tag_filter_config
        Summary: 标签配置全量信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rtop_risklabel_filter_ex_async(request, headers, runtime)

    def query_rtop_risklabel_filter_ex(
        self,
        request: riskplus_models.QueryRtopRisklabelFilterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopRisklabelFilterResponse:
        """
        Description: 标签配置全量信息获取
        rtop_company_tag_filter_config
        Summary: 标签配置全量信息获取
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopRisklabelFilterResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.risklabel.filter.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rtop_risklabel_filter_ex_async(
        self,
        request: riskplus_models.QueryRtopRisklabelFilterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopRisklabelFilterResponse:
        """
        Description: 标签配置全量信息获取
        rtop_company_tag_filter_config
        Summary: 标签配置全量信息获取
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopRisklabelFilterResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.risklabel.filter.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pull_regtech_news(
        self,
        request: riskplus_models.PullRegtechNewsRequest,
    ) -> riskplus_models.PullRegtechNewsResponse:
        """
        Description: 用于鹰眼项目舆情同步
        Summary: 鹰眼项目舆情同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pull_regtech_news_ex(request, headers, runtime)

    async def pull_regtech_news_async(
        self,
        request: riskplus_models.PullRegtechNewsRequest,
    ) -> riskplus_models.PullRegtechNewsResponse:
        """
        Description: 用于鹰眼项目舆情同步
        Summary: 鹰眼项目舆情同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pull_regtech_news_ex_async(request, headers, runtime)

    def pull_regtech_news_ex(
        self,
        request: riskplus_models.PullRegtechNewsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PullRegtechNewsResponse:
        """
        Description: 用于鹰眼项目舆情同步
        Summary: 鹰眼项目舆情同步
        """
        UtilClient.validate_model(request)
        return riskplus_models.PullRegtechNewsResponse().from_map(
            self.do_request('1.0', 'riskplus.regtech.news.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pull_regtech_news_ex_async(
        self,
        request: riskplus_models.PullRegtechNewsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PullRegtechNewsResponse:
        """
        Description: 用于鹰眼项目舆情同步
        Summary: 鹰眼项目舆情同步
        """
        UtilClient.validate_model(request)
        return riskplus_models.PullRegtechNewsResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.regtech.news.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rtop_company_feedback(
        self,
        request: riskplus_models.QueryRtopCompanyFeedbackRequest,
    ) -> riskplus_models.QueryRtopCompanyFeedbackResponse:
        """
        Description: 查看企业反馈
        Summary: 查看企业反馈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rtop_company_feedback_ex(request, headers, runtime)

    async def query_rtop_company_feedback_async(
        self,
        request: riskplus_models.QueryRtopCompanyFeedbackRequest,
    ) -> riskplus_models.QueryRtopCompanyFeedbackResponse:
        """
        Description: 查看企业反馈
        Summary: 查看企业反馈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rtop_company_feedback_ex_async(request, headers, runtime)

    def query_rtop_company_feedback_ex(
        self,
        request: riskplus_models.QueryRtopCompanyFeedbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCompanyFeedbackResponse:
        """
        Description: 查看企业反馈
        Summary: 查看企业反馈
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCompanyFeedbackResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.company.feedback.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rtop_company_feedback_ex_async(
        self,
        request: riskplus_models.QueryRtopCompanyFeedbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCompanyFeedbackResponse:
        """
        Description: 查看企业反馈
        Summary: 查看企业反馈
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCompanyFeedbackResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.company.feedback.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rtop_company_alarm(
        self,
        request: riskplus_models.QueryRtopCompanyAlarmRequest,
    ) -> riskplus_models.QueryRtopCompanyAlarmResponse:
        """
        Description: 全局动态中的预警企业详细列表查询
        Summary: 全局动态中的预警企业详细列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rtop_company_alarm_ex(request, headers, runtime)

    async def query_rtop_company_alarm_async(
        self,
        request: riskplus_models.QueryRtopCompanyAlarmRequest,
    ) -> riskplus_models.QueryRtopCompanyAlarmResponse:
        """
        Description: 全局动态中的预警企业详细列表查询
        Summary: 全局动态中的预警企业详细列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rtop_company_alarm_ex_async(request, headers, runtime)

    def query_rtop_company_alarm_ex(
        self,
        request: riskplus_models.QueryRtopCompanyAlarmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCompanyAlarmResponse:
        """
        Description: 全局动态中的预警企业详细列表查询
        Summary: 全局动态中的预警企业详细列表查询
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCompanyAlarmResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.company.alarm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rtop_company_alarm_ex_async(
        self,
        request: riskplus_models.QueryRtopCompanyAlarmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCompanyAlarmResponse:
        """
        Description: 全局动态中的预警企业详细列表查询
        Summary: 全局动态中的预警企业详细列表查询
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCompanyAlarmResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.company.alarm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rtop_company_risky(
        self,
        request: riskplus_models.QueryRtopCompanyRiskyRequest,
    ) -> riskplus_models.QueryRtopCompanyRiskyResponse:
        """
        Description: 查询全局动态中的企业列表里的全部列表
        Summary: 查询全局动态中的企业列表里的全部列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rtop_company_risky_ex(request, headers, runtime)

    async def query_rtop_company_risky_async(
        self,
        request: riskplus_models.QueryRtopCompanyRiskyRequest,
    ) -> riskplus_models.QueryRtopCompanyRiskyResponse:
        """
        Description: 查询全局动态中的企业列表里的全部列表
        Summary: 查询全局动态中的企业列表里的全部列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rtop_company_risky_ex_async(request, headers, runtime)

    def query_rtop_company_risky_ex(
        self,
        request: riskplus_models.QueryRtopCompanyRiskyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCompanyRiskyResponse:
        """
        Description: 查询全局动态中的企业列表里的全部列表
        Summary: 查询全局动态中的企业列表里的全部列表
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCompanyRiskyResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.company.risky.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rtop_company_risky_ex_async(
        self,
        request: riskplus_models.QueryRtopCompanyRiskyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCompanyRiskyResponse:
        """
        Description: 查询全局动态中的企业列表里的全部列表
        Summary: 查询全局动态中的企业列表里的全部列表
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCompanyRiskyResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.company.risky.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rtop_company_list(
        self,
        request: riskplus_models.QueryRtopCompanyListRequest,
    ) -> riskplus_models.QueryRtopCompanyListResponse:
        """
        Description: 查询企业列表
        Summary: 查询企业列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rtop_company_list_ex(request, headers, runtime)

    async def query_rtop_company_list_async(
        self,
        request: riskplus_models.QueryRtopCompanyListRequest,
    ) -> riskplus_models.QueryRtopCompanyListResponse:
        """
        Description: 查询企业列表
        Summary: 查询企业列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rtop_company_list_ex_async(request, headers, runtime)

    def query_rtop_company_list_ex(
        self,
        request: riskplus_models.QueryRtopCompanyListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCompanyListResponse:
        """
        Description: 查询企业列表
        Summary: 查询企业列表
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCompanyListResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.company.list.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rtop_company_list_ex_async(
        self,
        request: riskplus_models.QueryRtopCompanyListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCompanyListResponse:
        """
        Description: 查询企业列表
        Summary: 查询企业列表
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCompanyListResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.company.list.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rtop_risklabel_config(
        self,
        request: riskplus_models.QueryRtopRisklabelConfigRequest,
    ) -> riskplus_models.QueryRtopRisklabelConfigResponse:
        """
        Description: 标签配置全量信息获取
        Summary: 标签配置全量信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rtop_risklabel_config_ex(request, headers, runtime)

    async def query_rtop_risklabel_config_async(
        self,
        request: riskplus_models.QueryRtopRisklabelConfigRequest,
    ) -> riskplus_models.QueryRtopRisklabelConfigResponse:
        """
        Description: 标签配置全量信息获取
        Summary: 标签配置全量信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rtop_risklabel_config_ex_async(request, headers, runtime)

    def query_rtop_risklabel_config_ex(
        self,
        request: riskplus_models.QueryRtopRisklabelConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopRisklabelConfigResponse:
        """
        Description: 标签配置全量信息获取
        Summary: 标签配置全量信息获取
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopRisklabelConfigResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.risklabel.config.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rtop_risklabel_config_ex_async(
        self,
        request: riskplus_models.QueryRtopRisklabelConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopRisklabelConfigResponse:
        """
        Description: 标签配置全量信息获取
        Summary: 标签配置全量信息获取
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopRisklabelConfigResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.risklabel.config.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rtop_company_risk(
        self,
        request: riskplus_models.QueryRtopCompanyRiskRequest,
    ) -> riskplus_models.QueryRtopCompanyRiskResponse:
        """
        Description: 企业风险标签信息查询
        Summary: 企业风险标签信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rtop_company_risk_ex(request, headers, runtime)

    async def query_rtop_company_risk_async(
        self,
        request: riskplus_models.QueryRtopCompanyRiskRequest,
    ) -> riskplus_models.QueryRtopCompanyRiskResponse:
        """
        Description: 企业风险标签信息查询
        Summary: 企业风险标签信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rtop_company_risk_ex_async(request, headers, runtime)

    def query_rtop_company_risk_ex(
        self,
        request: riskplus_models.QueryRtopCompanyRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCompanyRiskResponse:
        """
        Description: 企业风险标签信息查询
        Summary: 企业风险标签信息查询
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCompanyRiskResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.company.risk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rtop_company_risk_ex_async(
        self,
        request: riskplus_models.QueryRtopCompanyRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopCompanyRiskResponse:
        """
        Description: 企业风险标签信息查询
        Summary: 企业风险标签信息查询
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopCompanyRiskResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.company.risk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_rtop_company_related(
        self,
        request: riskplus_models.ListRtopCompanyRelatedRequest,
    ) -> riskplus_models.ListRtopCompanyRelatedResponse:
        """
        Description: 查看重点关联企业
        Summary: 重点关联企业
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_rtop_company_related_ex(request, headers, runtime)

    async def list_rtop_company_related_async(
        self,
        request: riskplus_models.ListRtopCompanyRelatedRequest,
    ) -> riskplus_models.ListRtopCompanyRelatedResponse:
        """
        Description: 查看重点关联企业
        Summary: 重点关联企业
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_rtop_company_related_ex_async(request, headers, runtime)

    def list_rtop_company_related_ex(
        self,
        request: riskplus_models.ListRtopCompanyRelatedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ListRtopCompanyRelatedResponse:
        """
        Description: 查看重点关联企业
        Summary: 重点关联企业
        """
        UtilClient.validate_model(request)
        return riskplus_models.ListRtopCompanyRelatedResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.company.related.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_rtop_company_related_ex_async(
        self,
        request: riskplus_models.ListRtopCompanyRelatedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ListRtopCompanyRelatedResponse:
        """
        Description: 查看重点关联企业
        Summary: 重点关联企业
        """
        UtilClient.validate_model(request)
        return riskplus_models.ListRtopCompanyRelatedResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.company.related.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rtop_tag_image(
        self,
        request: riskplus_models.QueryRtopTagImageRequest,
    ) -> riskplus_models.QueryRtopTagImageResponse:
        """
        Description: 风险标签图片查询
        Summary: 风险标签图片查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rtop_tag_image_ex(request, headers, runtime)

    async def query_rtop_tag_image_async(
        self,
        request: riskplus_models.QueryRtopTagImageRequest,
    ) -> riskplus_models.QueryRtopTagImageResponse:
        """
        Description: 风险标签图片查询
        Summary: 风险标签图片查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rtop_tag_image_ex_async(request, headers, runtime)

    def query_rtop_tag_image_ex(
        self,
        request: riskplus_models.QueryRtopTagImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopTagImageResponse:
        """
        Description: 风险标签图片查询
        Summary: 风险标签图片查询
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopTagImageResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.tag.image.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rtop_tag_image_ex_async(
        self,
        request: riskplus_models.QueryRtopTagImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRtopTagImageResponse:
        """
        Description: 风险标签图片查询
        Summary: 风险标签图片查询
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRtopTagImageResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.tag.image.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_rtop_star_company(
        self,
        request: riskplus_models.ListRtopStarCompanyRequest,
    ) -> riskplus_models.ListRtopStarCompanyResponse:
        """
        Description: 查询用户收藏企业列表
        Summary: 查询用户收藏企业列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_rtop_star_company_ex(request, headers, runtime)

    async def list_rtop_star_company_async(
        self,
        request: riskplus_models.ListRtopStarCompanyRequest,
    ) -> riskplus_models.ListRtopStarCompanyResponse:
        """
        Description: 查询用户收藏企业列表
        Summary: 查询用户收藏企业列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_rtop_star_company_ex_async(request, headers, runtime)

    def list_rtop_star_company_ex(
        self,
        request: riskplus_models.ListRtopStarCompanyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ListRtopStarCompanyResponse:
        """
        Description: 查询用户收藏企业列表
        Summary: 查询用户收藏企业列表
        """
        UtilClient.validate_model(request)
        return riskplus_models.ListRtopStarCompanyResponse().from_map(
            self.do_request('1.0', 'riskplus.rtop.star.company.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_rtop_star_company_ex_async(
        self,
        request: riskplus_models.ListRtopStarCompanyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ListRtopStarCompanyResponse:
        """
        Description: 查询用户收藏企业列表
        Summary: 查询用户收藏企业列表
        """
        UtilClient.validate_model(request)
        return riskplus_models.ListRtopStarCompanyResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rtop.star.company.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rp_security_policy(
        self,
        request: riskplus_models.QueryRpSecurityPolicyRequest,
    ) -> riskplus_models.QueryRpSecurityPolicyResponse:
        """
        Description: 策略咨询服务输出(saas)
        Summary: 策略咨询服务输出(saas)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rp_security_policy_ex(request, headers, runtime)

    async def query_rp_security_policy_async(
        self,
        request: riskplus_models.QueryRpSecurityPolicyRequest,
    ) -> riskplus_models.QueryRpSecurityPolicyResponse:
        """
        Description: 策略咨询服务输出(saas)
        Summary: 策略咨询服务输出(saas)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rp_security_policy_ex_async(request, headers, runtime)

    def query_rp_security_policy_ex(
        self,
        request: riskplus_models.QueryRpSecurityPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRpSecurityPolicyResponse:
        """
        Description: 策略咨询服务输出(saas)
        Summary: 策略咨询服务输出(saas)
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRpSecurityPolicyResponse().from_map(
            self.do_request('1.0', 'riskplus.rp.security.policy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rp_security_policy_ex_async(
        self,
        request: riskplus_models.QueryRpSecurityPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRpSecurityPolicyResponse:
        """
        Description: 策略咨询服务输出(saas)
        Summary: 策略咨询服务输出(saas)
        """
        UtilClient.validate_model(request)
        return riskplus_models.QueryRpSecurityPolicyResponse().from_map(
            await self.do_request_async('1.0', 'riskplus.rp.security.policy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
