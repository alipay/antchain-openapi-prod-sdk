# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_riskplus import models as riskplus_models
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
                    'req_time': AntchainUtils.get_timestamp(),
                    'req_msg_id': AntchainUtils.get_nonce(),
                    'access_key': self._access_key_id,
                    'base_sdk_version': 'TeaSDK-2.0',
                    'sdk_version': '1.24.9',
                    '_prod_code': 'RISKPLUS',
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
                    'req_time': AntchainUtils.get_timestamp(),
                    'req_msg_id': AntchainUtils.get_nonce(),
                    'access_key': self._access_key_id,
                    'base_sdk_version': 'TeaSDK-2.0',
                    'sdk_version': '1.24.9',
                    '_prod_code': 'RISKPLUS',
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

    def receive_benefithub_risk_pay(
        self,
        request: riskplus_models.ReceiveBenefithubRiskPayRequest,
    ) -> riskplus_models.ReceiveBenefithubRiskPayResponse:
        """
        Description: 支付成功、退款成功、续费扣款、超时关单、签约、解约，渠道方回调结果使用
        Summary: 权益流量业务支付签约相关通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.receive_benefithub_risk_pay_ex(request, headers, runtime)

    async def receive_benefithub_risk_pay_async(
        self,
        request: riskplus_models.ReceiveBenefithubRiskPayRequest,
    ) -> riskplus_models.ReceiveBenefithubRiskPayResponse:
        """
        Description: 支付成功、退款成功、续费扣款、超时关单、签约、解约，渠道方回调结果使用
        Summary: 权益流量业务支付签约相关通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.receive_benefithub_risk_pay_ex_async(request, headers, runtime)

    def receive_benefithub_risk_pay_ex(
        self,
        request: riskplus_models.ReceiveBenefithubRiskPayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ReceiveBenefithubRiskPayResponse:
        """
        Description: 支付成功、退款成功、续费扣款、超时关单、签约、解约，渠道方回调结果使用
        Summary: 权益流量业务支付签约相关通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ReceiveBenefithubRiskPayResponse(),
            self.do_request('1.0', 'riskplus.benefithub.risk.pay.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def receive_benefithub_risk_pay_ex_async(
        self,
        request: riskplus_models.ReceiveBenefithubRiskPayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ReceiveBenefithubRiskPayResponse:
        """
        Description: 支付成功、退款成功、续费扣款、超时关单、签约、解约，渠道方回调结果使用
        Summary: 权益流量业务支付签约相关通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ReceiveBenefithubRiskPayResponse(),
            await self.do_request_async('1.0', 'riskplus.benefithub.risk.pay.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_benefithub_risk_login(
        self,
        request: riskplus_models.NotifyBenefithubRiskLoginRequest,
    ) -> riskplus_models.NotifyBenefithubRiskLoginResponse:
        """
        Description: 渠道、平台方，联合登陆推送登陆通知信息
        Summary: 渠道/平台方推送的用户登陆信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_benefithub_risk_login_ex(request, headers, runtime)

    async def notify_benefithub_risk_login_async(
        self,
        request: riskplus_models.NotifyBenefithubRiskLoginRequest,
    ) -> riskplus_models.NotifyBenefithubRiskLoginResponse:
        """
        Description: 渠道、平台方，联合登陆推送登陆通知信息
        Summary: 渠道/平台方推送的用户登陆信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_benefithub_risk_login_ex_async(request, headers, runtime)

    def notify_benefithub_risk_login_ex(
        self,
        request: riskplus_models.NotifyBenefithubRiskLoginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.NotifyBenefithubRiskLoginResponse:
        """
        Description: 渠道、平台方，联合登陆推送登陆通知信息
        Summary: 渠道/平台方推送的用户登陆信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.NotifyBenefithubRiskLoginResponse(),
            self.do_request('1.0', 'riskplus.benefithub.risk.login.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_benefithub_risk_login_ex_async(
        self,
        request: riskplus_models.NotifyBenefithubRiskLoginRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.NotifyBenefithubRiskLoginResponse:
        """
        Description: 渠道、平台方，联合登陆推送登陆通知信息
        Summary: 渠道/平台方推送的用户登陆信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.NotifyBenefithubRiskLoginResponse(),
            await self.do_request_async('1.0', 'riskplus.benefithub.risk.login.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_creditshield_product_info(
        self,
        request: riskplus_models.BatchqueryCreditshieldProductInfoRequest,
    ) -> riskplus_models.BatchqueryCreditshieldProductInfoResponse:
        """
        Description: 信护盾产品批量查询
        Summary: 信护盾产品批量查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_creditshield_product_info_ex(request, headers, runtime)

    async def batchquery_creditshield_product_info_async(
        self,
        request: riskplus_models.BatchqueryCreditshieldProductInfoRequest,
    ) -> riskplus_models.BatchqueryCreditshieldProductInfoResponse:
        """
        Description: 信护盾产品批量查询
        Summary: 信护盾产品批量查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_creditshield_product_info_ex_async(request, headers, runtime)

    def batchquery_creditshield_product_info_ex(
        self,
        request: riskplus_models.BatchqueryCreditshieldProductInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryCreditshieldProductInfoResponse:
        """
        Description: 信护盾产品批量查询
        Summary: 信护盾产品批量查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryCreditshieldProductInfoResponse(),
            self.do_request('1.0', 'riskplus.creditshield.product.info.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_creditshield_product_info_ex_async(
        self,
        request: riskplus_models.BatchqueryCreditshieldProductInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryCreditshieldProductInfoResponse:
        """
        Description: 信护盾产品批量查询
        Summary: 信护盾产品批量查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryCreditshieldProductInfoResponse(),
            await self.do_request_async('1.0', 'riskplus.creditshield.product.info.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_creditshield_product_callback(
        self,
        request: riskplus_models.QueryCreditshieldProductCallbackRequest,
    ) -> riskplus_models.QueryCreditshieldProductCallbackResponse:
        """
        Description: 信护盾amc机构回调通用接口
        Summary: 信护盾amc机构回调通用接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_creditshield_product_callback_ex(request, headers, runtime)

    async def query_creditshield_product_callback_async(
        self,
        request: riskplus_models.QueryCreditshieldProductCallbackRequest,
    ) -> riskplus_models.QueryCreditshieldProductCallbackResponse:
        """
        Description: 信护盾amc机构回调通用接口
        Summary: 信护盾amc机构回调通用接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_creditshield_product_callback_ex_async(request, headers, runtime)

    def query_creditshield_product_callback_ex(
        self,
        request: riskplus_models.QueryCreditshieldProductCallbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryCreditshieldProductCallbackResponse:
        """
        Description: 信护盾amc机构回调通用接口
        Summary: 信护盾amc机构回调通用接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryCreditshieldProductCallbackResponse(),
            self.do_request('1.0', 'riskplus.creditshield.product.callback.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_creditshield_product_callback_ex_async(
        self,
        request: riskplus_models.QueryCreditshieldProductCallbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryCreditshieldProductCallbackResponse:
        """
        Description: 信护盾amc机构回调通用接口
        Summary: 信护盾amc机构回调通用接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryCreditshieldProductCallbackResponse(),
            await self.do_request_async('1.0', 'riskplus.creditshield.product.callback.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_security_policy(
        self,
        request: riskplus_models.QuerySecurityPolicyRequest,
    ) -> riskplus_models.QuerySecurityPolicyResponse:
        """
        Description: 风控云风险咨询接口
        Summary: 风控云风险咨询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_security_policy_ex(request, headers, runtime)

    async def query_security_policy_async(
        self,
        request: riskplus_models.QuerySecurityPolicyRequest,
    ) -> riskplus_models.QuerySecurityPolicyResponse:
        """
        Description: 风控云风险咨询接口
        Summary: 风控云风险咨询接口
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
        Description: 风控云风险咨询接口
        Summary: 风控云风险咨询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QuerySecurityPolicyResponse(),
            self.do_request('1.0', 'riskplus.security.policy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_security_policy_ex_async(
        self,
        request: riskplus_models.QuerySecurityPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QuerySecurityPolicyResponse:
        """
        Description: 风控云风险咨询接口
        Summary: 风控云风险咨询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QuerySecurityPolicyResponse(),
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
        return TeaCore.from_map(
            riskplus_models.SendSecurityDataResponse(),
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
        return TeaCore.from_map(
            riskplus_models.SendSecurityDataResponse(),
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
        return TeaCore.from_map(
            riskplus_models.ConfirmSecurityPolicyResponse(),
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
        return TeaCore.from_map(
            riskplus_models.ConfirmSecurityPolicyResponse(),
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
        return TeaCore.from_map(
            riskplus_models.CheckSecurityRdsResponse(),
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
        return TeaCore.from_map(
            riskplus_models.CheckSecurityRdsResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QuerySecurityDataResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QuerySecurityDataResponse(),
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
        return TeaCore.from_map(
            riskplus_models.CheckSecurityDataResponse(),
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
        return TeaCore.from_map(
            riskplus_models.CheckSecurityDataResponse(),
            await self.do_request_async('1.0', 'riskplus.security.data.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_security_riskdataservice(
        self,
        request: riskplus_models.ExecSecurityRiskdataserviceRequest,
    ) -> riskplus_models.ExecSecurityRiskdataserviceResponse:
        """
        Description: 反欺诈风险数据服务请求执行
        Summary: 反欺诈风险数据服务请求执行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_security_riskdataservice_ex(request, headers, runtime)

    async def exec_security_riskdataservice_async(
        self,
        request: riskplus_models.ExecSecurityRiskdataserviceRequest,
    ) -> riskplus_models.ExecSecurityRiskdataserviceResponse:
        """
        Description: 反欺诈风险数据服务请求执行
        Summary: 反欺诈风险数据服务请求执行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_security_riskdataservice_ex_async(request, headers, runtime)

    def exec_security_riskdataservice_ex(
        self,
        request: riskplus_models.ExecSecurityRiskdataserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ExecSecurityRiskdataserviceResponse:
        """
        Description: 反欺诈风险数据服务请求执行
        Summary: 反欺诈风险数据服务请求执行
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ExecSecurityRiskdataserviceResponse(),
            self.do_request('1.0', 'riskplus.security.riskdataservice.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_security_riskdataservice_ex_async(
        self,
        request: riskplus_models.ExecSecurityRiskdataserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ExecSecurityRiskdataserviceResponse:
        """
        Description: 反欺诈风险数据服务请求执行
        Summary: 反欺诈风险数据服务请求执行
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ExecSecurityRiskdataserviceResponse(),
            await self.do_request_async('1.0', 'riskplus.security.riskdataservice.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_saas_security_policy(
        self,
        request: riskplus_models.QuerySaasSecurityPolicyRequest,
    ) -> riskplus_models.QuerySaasSecurityPolicyResponse:
        """
        Description: 风控云SaaS租户调用接口
        Summary: 风控云SaaS租户调用接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_saas_security_policy_ex(request, headers, runtime)

    async def query_saas_security_policy_async(
        self,
        request: riskplus_models.QuerySaasSecurityPolicyRequest,
    ) -> riskplus_models.QuerySaasSecurityPolicyResponse:
        """
        Description: 风控云SaaS租户调用接口
        Summary: 风控云SaaS租户调用接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_saas_security_policy_ex_async(request, headers, runtime)

    def query_saas_security_policy_ex(
        self,
        request: riskplus_models.QuerySaasSecurityPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QuerySaasSecurityPolicyResponse:
        """
        Description: 风控云SaaS租户调用接口
        Summary: 风控云SaaS租户调用接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QuerySaasSecurityPolicyResponse(),
            self.do_request('1.0', 'riskplus.saas.security.policy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_saas_security_policy_ex_async(
        self,
        request: riskplus_models.QuerySaasSecurityPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QuerySaasSecurityPolicyResponse:
        """
        Description: 风控云SaaS租户调用接口
        Summary: 风控云SaaS租户调用接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QuerySaasSecurityPolicyResponse(),
            await self.do_request_async('1.0', 'riskplus.saas.security.policy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_batch_security_policy(
        self,
        request: riskplus_models.QueryBatchSecurityPolicyRequest,
    ) -> riskplus_models.QueryBatchSecurityPolicyResponse:
        """
        Description: 批量决策
        Summary: 批量决策查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_batch_security_policy_ex(request, headers, runtime)

    async def query_batch_security_policy_async(
        self,
        request: riskplus_models.QueryBatchSecurityPolicyRequest,
    ) -> riskplus_models.QueryBatchSecurityPolicyResponse:
        """
        Description: 批量决策
        Summary: 批量决策查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_batch_security_policy_ex_async(request, headers, runtime)

    def query_batch_security_policy_ex(
        self,
        request: riskplus_models.QueryBatchSecurityPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryBatchSecurityPolicyResponse:
        """
        Description: 批量决策
        Summary: 批量决策查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryBatchSecurityPolicyResponse(),
            self.do_request('1.0', 'riskplus.batch.security.policy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_batch_security_policy_ex_async(
        self,
        request: riskplus_models.QueryBatchSecurityPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryBatchSecurityPolicyResponse:
        """
        Description: 批量决策
        Summary: 批量决策查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryBatchSecurityPolicyResponse(),
            await self.do_request_async('1.0', 'riskplus.batch.security.policy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_creditshield_product_batch(
        self,
        request: riskplus_models.QueryCreditshieldProductBatchRequest,
    ) -> riskplus_models.QueryCreditshieldProductBatchResponse:
        """
        Description: 信护盾产品批量查询
        Summary: 信护盾产品批量查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_creditshield_product_batch_ex(request, headers, runtime)

    async def query_creditshield_product_batch_async(
        self,
        request: riskplus_models.QueryCreditshieldProductBatchRequest,
    ) -> riskplus_models.QueryCreditshieldProductBatchResponse:
        """
        Description: 信护盾产品批量查询
        Summary: 信护盾产品批量查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_creditshield_product_batch_ex_async(request, headers, runtime)

    def query_creditshield_product_batch_ex(
        self,
        request: riskplus_models.QueryCreditshieldProductBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryCreditshieldProductBatchResponse:
        """
        Description: 信护盾产品批量查询
        Summary: 信护盾产品批量查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryCreditshieldProductBatchResponse(),
            self.do_request('1.0', 'riskplus.creditshield.product.batch.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_creditshield_product_batch_ex_async(
        self,
        request: riskplus_models.QueryCreditshieldProductBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryCreditshieldProductBatchResponse:
        """
        Description: 信护盾产品批量查询
        Summary: 信护盾产品批量查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryCreditshieldProductBatchResponse(),
            await self.do_request_async('1.0', 'riskplus.creditshield.product.batch.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubhe_test(
        self,
        request: riskplus_models.QueryDubheTestRequest,
    ) -> riskplus_models.QueryDubheTestResponse:
        """
        Description: 天枢信贷业务系统线下测试环境测试接口
        Summary: 天枢信贷业务系统线下测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubhe_test_ex(request, headers, runtime)

    async def query_dubhe_test_async(
        self,
        request: riskplus_models.QueryDubheTestRequest,
    ) -> riskplus_models.QueryDubheTestResponse:
        """
        Description: 天枢信贷业务系统线下测试环境测试接口
        Summary: 天枢信贷业务系统线下测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubhe_test_ex_async(request, headers, runtime)

    def query_dubhe_test_ex(
        self,
        request: riskplus_models.QueryDubheTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubheTestResponse:
        """
        Description: 天枢信贷业务系统线下测试环境测试接口
        Summary: 天枢信贷业务系统线下测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubheTestResponse(),
            self.do_request('1.0', 'riskplus.dubhe.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubhe_test_ex_async(
        self,
        request: riskplus_models.QueryDubheTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubheTestResponse:
        """
        Description: 天枢信贷业务系统线下测试环境测试接口
        Summary: 天枢信贷业务系统线下测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubheTestResponse(),
            await self.do_request_async('1.0', 'riskplus.dubhe.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubhe_router_fundrouter(
        self,
        request: riskplus_models.QueryDubheRouterFundrouterRequest,
    ) -> riskplus_models.QueryDubheRouterFundrouterResponse:
        """
        Description: 通过客户三要素信息查询资金方代码(资金路由)
        Summary: 天枢系统资金方代码(资金路由)查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubhe_router_fundrouter_ex(request, headers, runtime)

    async def query_dubhe_router_fundrouter_async(
        self,
        request: riskplus_models.QueryDubheRouterFundrouterRequest,
    ) -> riskplus_models.QueryDubheRouterFundrouterResponse:
        """
        Description: 通过客户三要素信息查询资金方代码(资金路由)
        Summary: 天枢系统资金方代码(资金路由)查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubhe_router_fundrouter_ex_async(request, headers, runtime)

    def query_dubhe_router_fundrouter_ex(
        self,
        request: riskplus_models.QueryDubheRouterFundrouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubheRouterFundrouterResponse:
        """
        Description: 通过客户三要素信息查询资金方代码(资金路由)
        Summary: 天枢系统资金方代码(资金路由)查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubheRouterFundrouterResponse(),
            self.do_request('1.0', 'riskplus.dubhe.router.fundrouter.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubhe_router_fundrouter_ex_async(
        self,
        request: riskplus_models.QueryDubheRouterFundrouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubheRouterFundrouterResponse:
        """
        Description: 通过客户三要素信息查询资金方代码(资金路由)
        Summary: 天枢系统资金方代码(资金路由)查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubheRouterFundrouterResponse(),
            await self.do_request_async('1.0', 'riskplus.dubhe.router.fundrouter.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_dubhe_credit(
        self,
        request: riskplus_models.ApplyDubheCreditRequest,
    ) -> riskplus_models.ApplyDubheCreditResponse:
        """
        Description: 天枢系统授信申请接口
        Summary: 天枢系统授信申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_dubhe_credit_ex(request, headers, runtime)

    async def apply_dubhe_credit_async(
        self,
        request: riskplus_models.ApplyDubheCreditRequest,
    ) -> riskplus_models.ApplyDubheCreditResponse:
        """
        Description: 天枢系统授信申请接口
        Summary: 天枢系统授信申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_dubhe_credit_ex_async(request, headers, runtime)

    def apply_dubhe_credit_ex(
        self,
        request: riskplus_models.ApplyDubheCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyDubheCreditResponse:
        """
        Description: 天枢系统授信申请接口
        Summary: 天枢系统授信申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyDubheCreditResponse(),
            self.do_request('1.0', 'riskplus.dubhe.credit.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_dubhe_credit_ex_async(
        self,
        request: riskplus_models.ApplyDubheCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyDubheCreditResponse:
        """
        Description: 天枢系统授信申请接口
        Summary: 天枢系统授信申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyDubheCreditResponse(),
            await self.do_request_async('1.0', 'riskplus.dubhe.credit.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubhe_credit_status(
        self,
        request: riskplus_models.QueryDubheCreditStatusRequest,
    ) -> riskplus_models.QueryDubheCreditStatusResponse:
        """
        Description: 天枢系统授信额度查询接口
        Summary: 天枢系统授信额度查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubhe_credit_status_ex(request, headers, runtime)

    async def query_dubhe_credit_status_async(
        self,
        request: riskplus_models.QueryDubheCreditStatusRequest,
    ) -> riskplus_models.QueryDubheCreditStatusResponse:
        """
        Description: 天枢系统授信额度查询接口
        Summary: 天枢系统授信额度查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubhe_credit_status_ex_async(request, headers, runtime)

    def query_dubhe_credit_status_ex(
        self,
        request: riskplus_models.QueryDubheCreditStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubheCreditStatusResponse:
        """
        Description: 天枢系统授信额度查询接口
        Summary: 天枢系统授信额度查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubheCreditStatusResponse(),
            self.do_request('1.0', 'riskplus.dubhe.credit.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubhe_credit_status_ex_async(
        self,
        request: riskplus_models.QueryDubheCreditStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubheCreditStatusResponse:
        """
        Description: 天枢系统授信额度查询接口
        Summary: 天枢系统授信额度查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubheCreditStatusResponse(),
            await self.do_request_async('1.0', 'riskplus.dubhe.credit.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_dubhe_repay_reftrial(
        self,
        request: riskplus_models.CountDubheRepayReftrialRequest,
    ) -> riskplus_models.CountDubheRepayReftrialResponse:
        """
        Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
        Summary: 天枢系统还款计划试算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_dubhe_repay_reftrial_ex(request, headers, runtime)

    async def count_dubhe_repay_reftrial_async(
        self,
        request: riskplus_models.CountDubheRepayReftrialRequest,
    ) -> riskplus_models.CountDubheRepayReftrialResponse:
        """
        Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
        Summary: 天枢系统还款计划试算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_dubhe_repay_reftrial_ex_async(request, headers, runtime)

    def count_dubhe_repay_reftrial_ex(
        self,
        request: riskplus_models.CountDubheRepayReftrialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CountDubheRepayReftrialResponse:
        """
        Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
        Summary: 天枢系统还款计划试算
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CountDubheRepayReftrialResponse(),
            self.do_request('1.0', 'riskplus.dubhe.repay.reftrial.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_dubhe_repay_reftrial_ex_async(
        self,
        request: riskplus_models.CountDubheRepayReftrialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CountDubheRepayReftrialResponse:
        """
        Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
        Summary: 天枢系统还款计划试算
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CountDubheRepayReftrialResponse(),
            await self.do_request_async('1.0', 'riskplus.dubhe.repay.reftrial.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubhe_repay_list(
        self,
        request: riskplus_models.QueryDubheRepayListRequest,
    ) -> riskplus_models.QueryDubheRepayListResponse:
        """
        Description: 天枢系统还款计划查询，根据申请订单查询还款计划
        Summary: 天枢系统还款计划查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubhe_repay_list_ex(request, headers, runtime)

    async def query_dubhe_repay_list_async(
        self,
        request: riskplus_models.QueryDubheRepayListRequest,
    ) -> riskplus_models.QueryDubheRepayListResponse:
        """
        Description: 天枢系统还款计划查询，根据申请订单查询还款计划
        Summary: 天枢系统还款计划查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubhe_repay_list_ex_async(request, headers, runtime)

    def query_dubhe_repay_list_ex(
        self,
        request: riskplus_models.QueryDubheRepayListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubheRepayListResponse:
        """
        Description: 天枢系统还款计划查询，根据申请订单查询还款计划
        Summary: 天枢系统还款计划查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubheRepayListResponse(),
            self.do_request('1.0', 'riskplus.dubhe.repay.list.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubhe_repay_list_ex_async(
        self,
        request: riskplus_models.QueryDubheRepayListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubheRepayListResponse:
        """
        Description: 天枢系统还款计划查询，根据申请订单查询还款计划
        Summary: 天枢系统还款计划查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubheRepayListResponse(),
            await self.do_request_async('1.0', 'riskplus.dubhe.repay.list.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_dubhe_usecredit(
        self,
        request: riskplus_models.ApplyDubheUsecreditRequest,
    ) -> riskplus_models.ApplyDubheUsecreditResponse:
        """
        Description: 天枢系统用信申请接口
        Summary: 天枢系统用信申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_dubhe_usecredit_ex(request, headers, runtime)

    async def apply_dubhe_usecredit_async(
        self,
        request: riskplus_models.ApplyDubheUsecreditRequest,
    ) -> riskplus_models.ApplyDubheUsecreditResponse:
        """
        Description: 天枢系统用信申请接口
        Summary: 天枢系统用信申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_dubhe_usecredit_ex_async(request, headers, runtime)

    def apply_dubhe_usecredit_ex(
        self,
        request: riskplus_models.ApplyDubheUsecreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyDubheUsecreditResponse:
        """
        Description: 天枢系统用信申请接口
        Summary: 天枢系统用信申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyDubheUsecreditResponse(),
            self.do_request('1.0', 'riskplus.dubhe.usecredit.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_dubhe_usecredit_ex_async(
        self,
        request: riskplus_models.ApplyDubheUsecreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyDubheUsecreditResponse:
        """
        Description: 天枢系统用信申请接口
        Summary: 天枢系统用信申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyDubheUsecreditResponse(),
            await self.do_request_async('1.0', 'riskplus.dubhe.usecredit.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubhe_usecredit_status(
        self,
        request: riskplus_models.QueryDubheUsecreditStatusRequest,
    ) -> riskplus_models.QueryDubheUsecreditStatusResponse:
        """
        Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
        Summary: 天枢系统用信申请状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubhe_usecredit_status_ex(request, headers, runtime)

    async def query_dubhe_usecredit_status_async(
        self,
        request: riskplus_models.QueryDubheUsecreditStatusRequest,
    ) -> riskplus_models.QueryDubheUsecreditStatusResponse:
        """
        Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
        Summary: 天枢系统用信申请状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubhe_usecredit_status_ex_async(request, headers, runtime)

    def query_dubhe_usecredit_status_ex(
        self,
        request: riskplus_models.QueryDubheUsecreditStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubheUsecreditStatusResponse:
        """
        Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
        Summary: 天枢系统用信申请状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubheUsecreditStatusResponse(),
            self.do_request('1.0', 'riskplus.dubhe.usecredit.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubhe_usecredit_status_ex_async(
        self,
        request: riskplus_models.QueryDubheUsecreditStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubheUsecreditStatusResponse:
        """
        Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
        Summary: 天枢系统用信申请状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubheUsecreditStatusResponse(),
            await self.do_request_async('1.0', 'riskplus.dubhe.usecredit.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_dubhe_repay_trial(
        self,
        request: riskplus_models.CountDubheRepayTrialRequest,
    ) -> riskplus_models.CountDubheRepayTrialResponse:
        """
        Description: 天枢系统还款试算，根据借据号计算还款金额
        Summary: 天枢系统还款试算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_dubhe_repay_trial_ex(request, headers, runtime)

    async def count_dubhe_repay_trial_async(
        self,
        request: riskplus_models.CountDubheRepayTrialRequest,
    ) -> riskplus_models.CountDubheRepayTrialResponse:
        """
        Description: 天枢系统还款试算，根据借据号计算还款金额
        Summary: 天枢系统还款试算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_dubhe_repay_trial_ex_async(request, headers, runtime)

    def count_dubhe_repay_trial_ex(
        self,
        request: riskplus_models.CountDubheRepayTrialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CountDubheRepayTrialResponse:
        """
        Description: 天枢系统还款试算，根据借据号计算还款金额
        Summary: 天枢系统还款试算
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CountDubheRepayTrialResponse(),
            self.do_request('1.0', 'riskplus.dubhe.repay.trial.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_dubhe_repay_trial_ex_async(
        self,
        request: riskplus_models.CountDubheRepayTrialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CountDubheRepayTrialResponse:
        """
        Description: 天枢系统还款试算，根据借据号计算还款金额
        Summary: 天枢系统还款试算
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CountDubheRepayTrialResponse(),
            await self.do_request_async('1.0', 'riskplus.dubhe.repay.trial.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def repay_dubhe_repay_checkstand(
        self,
        request: riskplus_models.RepayDubheRepayCheckstandRequest,
    ) -> riskplus_models.RepayDubheRepayCheckstandResponse:
        """
        Description: 天枢系统主动还款（收银台）接口
        Summary: 天枢系统主动还款（收银台）接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.repay_dubhe_repay_checkstand_ex(request, headers, runtime)

    async def repay_dubhe_repay_checkstand_async(
        self,
        request: riskplus_models.RepayDubheRepayCheckstandRequest,
    ) -> riskplus_models.RepayDubheRepayCheckstandResponse:
        """
        Description: 天枢系统主动还款（收银台）接口
        Summary: 天枢系统主动还款（收银台）接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.repay_dubhe_repay_checkstand_ex_async(request, headers, runtime)

    def repay_dubhe_repay_checkstand_ex(
        self,
        request: riskplus_models.RepayDubheRepayCheckstandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.RepayDubheRepayCheckstandResponse:
        """
        Description: 天枢系统主动还款（收银台）接口
        Summary: 天枢系统主动还款（收银台）接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.RepayDubheRepayCheckstandResponse(),
            self.do_request('1.0', 'riskplus.dubhe.repay.checkstand.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def repay_dubhe_repay_checkstand_ex_async(
        self,
        request: riskplus_models.RepayDubheRepayCheckstandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.RepayDubheRepayCheckstandResponse:
        """
        Description: 天枢系统主动还款（收银台）接口
        Summary: 天枢系统主动还款（收银台）接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.RepayDubheRepayCheckstandResponse(),
            await self.do_request_async('1.0', 'riskplus.dubhe.repay.checkstand.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubhe_repay_info(
        self,
        request: riskplus_models.QueryDubheRepayInfoRequest,
    ) -> riskplus_models.QueryDubheRepayInfoResponse:
        """
        Description: 天枢系统还款信息查询
        Summary: 天枢系统还款信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubhe_repay_info_ex(request, headers, runtime)

    async def query_dubhe_repay_info_async(
        self,
        request: riskplus_models.QueryDubheRepayInfoRequest,
    ) -> riskplus_models.QueryDubheRepayInfoResponse:
        """
        Description: 天枢系统还款信息查询
        Summary: 天枢系统还款信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubhe_repay_info_ex_async(request, headers, runtime)

    def query_dubhe_repay_info_ex(
        self,
        request: riskplus_models.QueryDubheRepayInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubheRepayInfoResponse:
        """
        Description: 天枢系统还款信息查询
        Summary: 天枢系统还款信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubheRepayInfoResponse(),
            self.do_request('1.0', 'riskplus.dubhe.repay.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubhe_repay_info_ex_async(
        self,
        request: riskplus_models.QueryDubheRepayInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubheRepayInfoResponse:
        """
        Description: 天枢系统还款信息查询
        Summary: 天枢系统还款信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubheRepayInfoResponse(),
            await self.do_request_async('1.0', 'riskplus.dubhe.repay.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_dubhe_customer_info(
        self,
        request: riskplus_models.UpdateDubheCustomerInfoRequest,
    ) -> riskplus_models.UpdateDubheCustomerInfoResponse:
        """
        Description: 天枢系统客户信息变更接口（变更客户三要素信息）
        Summary: 天枢系统客户信息变更接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_dubhe_customer_info_ex(request, headers, runtime)

    async def update_dubhe_customer_info_async(
        self,
        request: riskplus_models.UpdateDubheCustomerInfoRequest,
    ) -> riskplus_models.UpdateDubheCustomerInfoResponse:
        """
        Description: 天枢系统客户信息变更接口（变更客户三要素信息）
        Summary: 天枢系统客户信息变更接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_dubhe_customer_info_ex_async(request, headers, runtime)

    def update_dubhe_customer_info_ex(
        self,
        request: riskplus_models.UpdateDubheCustomerInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UpdateDubheCustomerInfoResponse:
        """
        Description: 天枢系统客户信息变更接口（变更客户三要素信息）
        Summary: 天枢系统客户信息变更接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UpdateDubheCustomerInfoResponse(),
            self.do_request('1.0', 'riskplus.dubhe.customer.info.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_dubhe_customer_info_ex_async(
        self,
        request: riskplus_models.UpdateDubheCustomerInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UpdateDubheCustomerInfoResponse:
        """
        Description: 天枢系统客户信息变更接口（变更客户三要素信息）
        Summary: 天枢系统客户信息变更接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UpdateDubheCustomerInfoResponse(),
            await self.do_request_async('1.0', 'riskplus.dubhe.customer.info.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_dubhe_customer_agreementsign(
        self,
        request: riskplus_models.ApplyDubheCustomerAgreementsignRequest,
    ) -> riskplus_models.ApplyDubheCustomerAgreementsignResponse:
        """
        Description: 天枢系统协议签约申请(支付宝
        Summary: 天枢系统协议签约申请(支付宝)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_dubhe_customer_agreementsign_ex(request, headers, runtime)

    async def apply_dubhe_customer_agreementsign_async(
        self,
        request: riskplus_models.ApplyDubheCustomerAgreementsignRequest,
    ) -> riskplus_models.ApplyDubheCustomerAgreementsignResponse:
        """
        Description: 天枢系统协议签约申请(支付宝
        Summary: 天枢系统协议签约申请(支付宝)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_dubhe_customer_agreementsign_ex_async(request, headers, runtime)

    def apply_dubhe_customer_agreementsign_ex(
        self,
        request: riskplus_models.ApplyDubheCustomerAgreementsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyDubheCustomerAgreementsignResponse:
        """
        Description: 天枢系统协议签约申请(支付宝
        Summary: 天枢系统协议签约申请(支付宝)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyDubheCustomerAgreementsignResponse(),
            self.do_request('1.0', 'riskplus.dubhe.customer.agreementsign.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_dubhe_customer_agreementsign_ex_async(
        self,
        request: riskplus_models.ApplyDubheCustomerAgreementsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyDubheCustomerAgreementsignResponse:
        """
        Description: 天枢系统协议签约申请(支付宝
        Summary: 天枢系统协议签约申请(支付宝)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyDubheCustomerAgreementsignResponse(),
            await self.do_request_async('1.0', 'riskplus.dubhe.customer.agreementsign.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubhe_customer_agreementsign(
        self,
        request: riskplus_models.QueryDubheCustomerAgreementsignRequest,
    ) -> riskplus_models.QueryDubheCustomerAgreementsignResponse:
        """
        Description: 天枢系统协议签约查询(支付宝)
        Summary: 天枢系统协议签约查询(支付宝)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubhe_customer_agreementsign_ex(request, headers, runtime)

    async def query_dubhe_customer_agreementsign_async(
        self,
        request: riskplus_models.QueryDubheCustomerAgreementsignRequest,
    ) -> riskplus_models.QueryDubheCustomerAgreementsignResponse:
        """
        Description: 天枢系统协议签约查询(支付宝)
        Summary: 天枢系统协议签约查询(支付宝)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubhe_customer_agreementsign_ex_async(request, headers, runtime)

    def query_dubhe_customer_agreementsign_ex(
        self,
        request: riskplus_models.QueryDubheCustomerAgreementsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubheCustomerAgreementsignResponse:
        """
        Description: 天枢系统协议签约查询(支付宝)
        Summary: 天枢系统协议签约查询(支付宝)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubheCustomerAgreementsignResponse(),
            self.do_request('1.0', 'riskplus.dubhe.customer.agreementsign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubhe_customer_agreementsign_ex_async(
        self,
        request: riskplus_models.QueryDubheCustomerAgreementsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubheCustomerAgreementsignResponse:
        """
        Description: 天枢系统协议签约查询(支付宝)
        Summary: 天枢系统协议签约查询(支付宝)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubheCustomerAgreementsignResponse(),
            await self.do_request_async('1.0', 'riskplus.dubhe.customer.agreementsign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def repay_dubhe_repay_withhold(
        self,
        request: riskplus_models.RepayDubheRepayWithholdRequest,
    ) -> riskplus_models.RepayDubheRepayWithholdResponse:
        """
        Description: 天枢信贷业务系统主动还款（直接代扣）接口
        Summary: 天枢信贷业务系统主动还款（直接代扣）接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.repay_dubhe_repay_withhold_ex(request, headers, runtime)

    async def repay_dubhe_repay_withhold_async(
        self,
        request: riskplus_models.RepayDubheRepayWithholdRequest,
    ) -> riskplus_models.RepayDubheRepayWithholdResponse:
        """
        Description: 天枢信贷业务系统主动还款（直接代扣）接口
        Summary: 天枢信贷业务系统主动还款（直接代扣）接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.repay_dubhe_repay_withhold_ex_async(request, headers, runtime)

    def repay_dubhe_repay_withhold_ex(
        self,
        request: riskplus_models.RepayDubheRepayWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.RepayDubheRepayWithholdResponse:
        """
        Description: 天枢信贷业务系统主动还款（直接代扣）接口
        Summary: 天枢信贷业务系统主动还款（直接代扣）接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.RepayDubheRepayWithholdResponse(),
            self.do_request('1.0', 'riskplus.dubhe.repay.withhold.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def repay_dubhe_repay_withhold_ex_async(
        self,
        request: riskplus_models.RepayDubheRepayWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.RepayDubheRepayWithholdResponse:
        """
        Description: 天枢信贷业务系统主动还款（直接代扣）接口
        Summary: 天枢信贷业务系统主动还款（直接代扣）接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.RepayDubheRepayWithholdResponse(),
            await self.do_request_async('1.0', 'riskplus.dubhe.repay.withhold.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubhe_search_contract(
        self,
        request: riskplus_models.QueryDubheSearchContractRequest,
    ) -> riskplus_models.QueryDubheSearchContractResponse:
        """
        Description: 天枢系统合同获取
        Summary: 天枢系统合同获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubhe_search_contract_ex(request, headers, runtime)

    async def query_dubhe_search_contract_async(
        self,
        request: riskplus_models.QueryDubheSearchContractRequest,
    ) -> riskplus_models.QueryDubheSearchContractResponse:
        """
        Description: 天枢系统合同获取
        Summary: 天枢系统合同获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubhe_search_contract_ex_async(request, headers, runtime)

    def query_dubhe_search_contract_ex(
        self,
        request: riskplus_models.QueryDubheSearchContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubheSearchContractResponse:
        """
        Description: 天枢系统合同获取
        Summary: 天枢系统合同获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubheSearchContractResponse(),
            self.do_request('1.0', 'riskplus.dubhe.search.contract.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubhe_search_contract_ex_async(
        self,
        request: riskplus_models.QueryDubheSearchContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubheSearchContractResponse:
        """
        Description: 天枢系统合同获取
        Summary: 天枢系统合同获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubheSearchContractResponse(),
            await self.do_request_async('1.0', 'riskplus.dubhe.search.contract.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubhe_receipt_overdue(
        self,
        request: riskplus_models.QueryDubheReceiptOverdueRequest,
    ) -> riskplus_models.QueryDubheReceiptOverdueResponse:
        """
        Description: 天枢逾期信息查询接口
        Summary: 逾期信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubhe_receipt_overdue_ex(request, headers, runtime)

    async def query_dubhe_receipt_overdue_async(
        self,
        request: riskplus_models.QueryDubheReceiptOverdueRequest,
    ) -> riskplus_models.QueryDubheReceiptOverdueResponse:
        """
        Description: 天枢逾期信息查询接口
        Summary: 逾期信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubhe_receipt_overdue_ex_async(request, headers, runtime)

    def query_dubhe_receipt_overdue_ex(
        self,
        request: riskplus_models.QueryDubheReceiptOverdueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubheReceiptOverdueResponse:
        """
        Description: 天枢逾期信息查询接口
        Summary: 逾期信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubheReceiptOverdueResponse(),
            self.do_request('1.0', 'riskplus.dubhe.receipt.overdue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubhe_receipt_overdue_ex_async(
        self,
        request: riskplus_models.QueryDubheReceiptOverdueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubheReceiptOverdueResponse:
        """
        Description: 天枢逾期信息查询接口
        Summary: 逾期信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubheReceiptOverdueResponse(),
            await self.do_request_async('1.0', 'riskplus.dubhe.receipt.overdue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_dubbridge_sms(
        self,
        request: riskplus_models.SendDubbridgeSmsRequest,
    ) -> riskplus_models.SendDubbridgeSmsResponse:
        """
        Description: 天枢发送短信接口，适用于一个模板相同参数
        Summary: 天枢发送短信接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_dubbridge_sms_ex(request, headers, runtime)

    async def send_dubbridge_sms_async(
        self,
        request: riskplus_models.SendDubbridgeSmsRequest,
    ) -> riskplus_models.SendDubbridgeSmsResponse:
        """
        Description: 天枢发送短信接口，适用于一个模板相同参数
        Summary: 天枢发送短信接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_dubbridge_sms_ex_async(request, headers, runtime)

    def send_dubbridge_sms_ex(
        self,
        request: riskplus_models.SendDubbridgeSmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SendDubbridgeSmsResponse:
        """
        Description: 天枢发送短信接口，适用于一个模板相同参数
        Summary: 天枢发送短信接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SendDubbridgeSmsResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.sms.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_dubbridge_sms_ex_async(
        self,
        request: riskplus_models.SendDubbridgeSmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SendDubbridgeSmsResponse:
        """
        Description: 天枢发送短信接口，适用于一个模板相同参数
        Summary: 天枢发送短信接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SendDubbridgeSmsResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.sms.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_dubbridge_sms_batch(
        self,
        request: riskplus_models.SendDubbridgeSmsBatchRequest,
    ) -> riskplus_models.SendDubbridgeSmsBatchResponse:
        """
        Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
        Summary: 天枢批量发送短信接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_dubbridge_sms_batch_ex(request, headers, runtime)

    async def send_dubbridge_sms_batch_async(
        self,
        request: riskplus_models.SendDubbridgeSmsBatchRequest,
    ) -> riskplus_models.SendDubbridgeSmsBatchResponse:
        """
        Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
        Summary: 天枢批量发送短信接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_dubbridge_sms_batch_ex_async(request, headers, runtime)

    def send_dubbridge_sms_batch_ex(
        self,
        request: riskplus_models.SendDubbridgeSmsBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SendDubbridgeSmsBatchResponse:
        """
        Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
        Summary: 天枢批量发送短信接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SendDubbridgeSmsBatchResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.sms.batch.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_dubbridge_sms_batch_ex_async(
        self,
        request: riskplus_models.SendDubbridgeSmsBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SendDubbridgeSmsBatchResponse:
        """
        Description: 天枢批量发送短信接口，适合一个短信模板多个不同参数场景
        Summary: 天枢批量发送短信接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SendDubbridgeSmsBatchResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.sms.batch.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_router_fundrouter(
        self,
        request: riskplus_models.QueryDubbridgeRouterFundrouterRequest,
    ) -> riskplus_models.QueryDubbridgeRouterFundrouterResponse:
        """
        Description: 资金路由接口，获取资金方编号
        Summary: 天枢系统资金方代码(资金路由)查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_router_fundrouter_ex(request, headers, runtime)

    async def query_dubbridge_router_fundrouter_async(
        self,
        request: riskplus_models.QueryDubbridgeRouterFundrouterRequest,
    ) -> riskplus_models.QueryDubbridgeRouterFundrouterResponse:
        """
        Description: 资金路由接口，获取资金方编号
        Summary: 天枢系统资金方代码(资金路由)查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_router_fundrouter_ex_async(request, headers, runtime)

    def query_dubbridge_router_fundrouter_ex(
        self,
        request: riskplus_models.QueryDubbridgeRouterFundrouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeRouterFundrouterResponse:
        """
        Description: 资金路由接口，获取资金方编号
        Summary: 天枢系统资金方代码(资金路由)查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeRouterFundrouterResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.router.fundrouter.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_router_fundrouter_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeRouterFundrouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeRouterFundrouterResponse:
        """
        Description: 资金路由接口，获取资金方编号
        Summary: 天枢系统资金方代码(资金路由)查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeRouterFundrouterResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.router.fundrouter.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_dubbridge_credit(
        self,
        request: riskplus_models.ApplyDubbridgeCreditRequest,
    ) -> riskplus_models.ApplyDubbridgeCreditResponse:
        """
        Description: 天枢系统授信申请接口
        Summary: 天枢系统授信申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_dubbridge_credit_ex(request, headers, runtime)

    async def apply_dubbridge_credit_async(
        self,
        request: riskplus_models.ApplyDubbridgeCreditRequest,
    ) -> riskplus_models.ApplyDubbridgeCreditResponse:
        """
        Description: 天枢系统授信申请接口
        Summary: 天枢系统授信申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_dubbridge_credit_ex_async(request, headers, runtime)

    def apply_dubbridge_credit_ex(
        self,
        request: riskplus_models.ApplyDubbridgeCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyDubbridgeCreditResponse:
        """
        Description: 天枢系统授信申请接口
        Summary: 天枢系统授信申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyDubbridgeCreditResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.credit.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_dubbridge_credit_ex_async(
        self,
        request: riskplus_models.ApplyDubbridgeCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyDubbridgeCreditResponse:
        """
        Description: 天枢系统授信申请接口
        Summary: 天枢系统授信申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyDubbridgeCreditResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.credit.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_dubbridge_file(
        self,
        request: riskplus_models.UploadDubbridgeFileRequest,
    ) -> riskplus_models.UploadDubbridgeFileResponse:
        """
        Description: 为流量方提供文件上传接口，用于申请件影像资料上传
        Summary: 天枢文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_dubbridge_file_ex(request, headers, runtime)

    async def upload_dubbridge_file_async(
        self,
        request: riskplus_models.UploadDubbridgeFileRequest,
    ) -> riskplus_models.UploadDubbridgeFileResponse:
        """
        Description: 为流量方提供文件上传接口，用于申请件影像资料上传
        Summary: 天枢文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_dubbridge_file_ex_async(request, headers, runtime)

    def upload_dubbridge_file_ex(
        self,
        request: riskplus_models.UploadDubbridgeFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UploadDubbridgeFileResponse:
        """
        Description: 为流量方提供文件上传接口，用于申请件影像资料上传
        Summary: 天枢文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.dubbridge.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_dubbridge_file_response = riskplus_models.UploadDubbridgeFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_dubbridge_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UploadDubbridgeFileResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_dubbridge_file_ex_async(
        self,
        request: riskplus_models.UploadDubbridgeFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UploadDubbridgeFileResponse:
        """
        Description: 为流量方提供文件上传接口，用于申请件影像资料上传
        Summary: 天枢文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.dubbridge.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_dubbridge_file_response = riskplus_models.UploadDubbridgeFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_dubbridge_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UploadDubbridgeFileResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_dubbridge_customer_bankcard(
        self,
        request: riskplus_models.BindDubbridgeCustomerBankcardRequest,
    ) -> riskplus_models.BindDubbridgeCustomerBankcardResponse:
        """
        Description: 代扣签约绑卡接口
        Summary: 代扣协议签约申请(银行卡绑卡)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_dubbridge_customer_bankcard_ex(request, headers, runtime)

    async def bind_dubbridge_customer_bankcard_async(
        self,
        request: riskplus_models.BindDubbridgeCustomerBankcardRequest,
    ) -> riskplus_models.BindDubbridgeCustomerBankcardResponse:
        """
        Description: 代扣签约绑卡接口
        Summary: 代扣协议签约申请(银行卡绑卡)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_dubbridge_customer_bankcard_ex_async(request, headers, runtime)

    def bind_dubbridge_customer_bankcard_ex(
        self,
        request: riskplus_models.BindDubbridgeCustomerBankcardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BindDubbridgeCustomerBankcardResponse:
        """
        Description: 代扣签约绑卡接口
        Summary: 代扣协议签约申请(银行卡绑卡)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BindDubbridgeCustomerBankcardResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.customer.bankcard.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_dubbridge_customer_bankcard_ex_async(
        self,
        request: riskplus_models.BindDubbridgeCustomerBankcardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BindDubbridgeCustomerBankcardResponse:
        """
        Description: 代扣签约绑卡接口
        Summary: 代扣协议签约申请(银行卡绑卡)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BindDubbridgeCustomerBankcardResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.customer.bankcard.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_dubbridge_customer_bankcard(
        self,
        request: riskplus_models.VerifyDubbridgeCustomerBankcardRequest,
    ) -> riskplus_models.VerifyDubbridgeCustomerBankcardResponse:
        """
        Description: 代扣协议签约提交(银行卡绑卡)
        Summary: 代扣协议签约校验(银行卡绑卡)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_dubbridge_customer_bankcard_ex(request, headers, runtime)

    async def verify_dubbridge_customer_bankcard_async(
        self,
        request: riskplus_models.VerifyDubbridgeCustomerBankcardRequest,
    ) -> riskplus_models.VerifyDubbridgeCustomerBankcardResponse:
        """
        Description: 代扣协议签约提交(银行卡绑卡)
        Summary: 代扣协议签约校验(银行卡绑卡)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_dubbridge_customer_bankcard_ex_async(request, headers, runtime)

    def verify_dubbridge_customer_bankcard_ex(
        self,
        request: riskplus_models.VerifyDubbridgeCustomerBankcardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.VerifyDubbridgeCustomerBankcardResponse:
        """
        Description: 代扣协议签约提交(银行卡绑卡)
        Summary: 代扣协议签约校验(银行卡绑卡)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.VerifyDubbridgeCustomerBankcardResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.customer.bankcard.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_dubbridge_customer_bankcard_ex_async(
        self,
        request: riskplus_models.VerifyDubbridgeCustomerBankcardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.VerifyDubbridgeCustomerBankcardResponse:
        """
        Description: 代扣协议签约提交(银行卡绑卡)
        Summary: 代扣协议签约校验(银行卡绑卡)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.VerifyDubbridgeCustomerBankcardResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.customer.bankcard.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_dubbridge_defininnerchannel(
        self,
        request: riskplus_models.NotifyDubbridgeDefininnerchannelRequest,
    ) -> riskplus_models.NotifyDubbridgeDefininnerchannelResponse:
        """
        Description: 用于机构通道通用回调
        Summary: 机构通道回调通用接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_dubbridge_defininnerchannel_ex(request, headers, runtime)

    async def notify_dubbridge_defininnerchannel_async(
        self,
        request: riskplus_models.NotifyDubbridgeDefininnerchannelRequest,
    ) -> riskplus_models.NotifyDubbridgeDefininnerchannelResponse:
        """
        Description: 用于机构通道通用回调
        Summary: 机构通道回调通用接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_dubbridge_defininnerchannel_ex_async(request, headers, runtime)

    def notify_dubbridge_defininnerchannel_ex(
        self,
        request: riskplus_models.NotifyDubbridgeDefininnerchannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.NotifyDubbridgeDefininnerchannelResponse:
        """
        Description: 用于机构通道通用回调
        Summary: 机构通道回调通用接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.NotifyDubbridgeDefininnerchannelResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.defininnerchannel.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_dubbridge_defininnerchannel_ex_async(
        self,
        request: riskplus_models.NotifyDubbridgeDefininnerchannelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.NotifyDubbridgeDefininnerchannelResponse:
        """
        Description: 用于机构通道通用回调
        Summary: 机构通道回调通用接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.NotifyDubbridgeDefininnerchannelResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.defininnerchannel.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_credit_status(
        self,
        request: riskplus_models.QueryDubbridgeCreditStatusRequest,
    ) -> riskplus_models.QueryDubbridgeCreditStatusResponse:
        """
        Description: 天枢系统授信额度查询接口
        Summary: 天枢系统授信额度查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_credit_status_ex(request, headers, runtime)

    async def query_dubbridge_credit_status_async(
        self,
        request: riskplus_models.QueryDubbridgeCreditStatusRequest,
    ) -> riskplus_models.QueryDubbridgeCreditStatusResponse:
        """
        Description: 天枢系统授信额度查询接口
        Summary: 天枢系统授信额度查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_credit_status_ex_async(request, headers, runtime)

    def query_dubbridge_credit_status_ex(
        self,
        request: riskplus_models.QueryDubbridgeCreditStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeCreditStatusResponse:
        """
        Description: 天枢系统授信额度查询接口
        Summary: 天枢系统授信额度查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeCreditStatusResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.credit.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_credit_status_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeCreditStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeCreditStatusResponse:
        """
        Description: 天枢系统授信额度查询接口
        Summary: 天枢系统授信额度查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeCreditStatusResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.credit.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_riskinfo_enterprisescore(
        self,
        request: riskplus_models.QueryDubbridgeRiskinfoEnterprisescoreRequest,
    ) -> riskplus_models.QueryDubbridgeRiskinfoEnterprisescoreResponse:
        """
        Description: 天枢系统企业小微分查询
        Summary: 天枢系统企业小微分查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_riskinfo_enterprisescore_ex(request, headers, runtime)

    async def query_dubbridge_riskinfo_enterprisescore_async(
        self,
        request: riskplus_models.QueryDubbridgeRiskinfoEnterprisescoreRequest,
    ) -> riskplus_models.QueryDubbridgeRiskinfoEnterprisescoreResponse:
        """
        Description: 天枢系统企业小微分查询
        Summary: 天枢系统企业小微分查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_riskinfo_enterprisescore_ex_async(request, headers, runtime)

    def query_dubbridge_riskinfo_enterprisescore_ex(
        self,
        request: riskplus_models.QueryDubbridgeRiskinfoEnterprisescoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeRiskinfoEnterprisescoreResponse:
        """
        Description: 天枢系统企业小微分查询
        Summary: 天枢系统企业小微分查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeRiskinfoEnterprisescoreResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.riskinfo.enterprisescore.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_riskinfo_enterprisescore_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeRiskinfoEnterprisescoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeRiskinfoEnterprisescoreResponse:
        """
        Description: 天枢系统企业小微分查询
        Summary: 天枢系统企业小微分查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeRiskinfoEnterprisescoreResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.riskinfo.enterprisescore.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_riskinfo_common(
        self,
        request: riskplus_models.QueryDubbridgeRiskinfoCommonRequest,
    ) -> riskplus_models.QueryDubbridgeRiskinfoCommonResponse:
        """
        Description: 天枢系统风控信息通用查询
        Summary: 天枢系统风控信息通用查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_riskinfo_common_ex(request, headers, runtime)

    async def query_dubbridge_riskinfo_common_async(
        self,
        request: riskplus_models.QueryDubbridgeRiskinfoCommonRequest,
    ) -> riskplus_models.QueryDubbridgeRiskinfoCommonResponse:
        """
        Description: 天枢系统风控信息通用查询
        Summary: 天枢系统风控信息通用查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_riskinfo_common_ex_async(request, headers, runtime)

    def query_dubbridge_riskinfo_common_ex(
        self,
        request: riskplus_models.QueryDubbridgeRiskinfoCommonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeRiskinfoCommonResponse:
        """
        Description: 天枢系统风控信息通用查询
        Summary: 天枢系统风控信息通用查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeRiskinfoCommonResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.riskinfo.common.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_riskinfo_common_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeRiskinfoCommonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeRiskinfoCommonResponse:
        """
        Description: 天枢系统风控信息通用查询
        Summary: 天枢系统风控信息通用查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeRiskinfoCommonResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.riskinfo.common.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_dubbridge_institution_credit(
        self,
        request: riskplus_models.UpdateDubbridgeInstitutionCreditRequest,
    ) -> riskplus_models.UpdateDubbridgeInstitutionCreditResponse:
        """
        Description: 额度、利率、状态调整
        Summary: 调额申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_dubbridge_institution_credit_ex(request, headers, runtime)

    async def update_dubbridge_institution_credit_async(
        self,
        request: riskplus_models.UpdateDubbridgeInstitutionCreditRequest,
    ) -> riskplus_models.UpdateDubbridgeInstitutionCreditResponse:
        """
        Description: 额度、利率、状态调整
        Summary: 调额申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_dubbridge_institution_credit_ex_async(request, headers, runtime)

    def update_dubbridge_institution_credit_ex(
        self,
        request: riskplus_models.UpdateDubbridgeInstitutionCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UpdateDubbridgeInstitutionCreditResponse:
        """
        Description: 额度、利率、状态调整
        Summary: 调额申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UpdateDubbridgeInstitutionCreditResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.institution.credit.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_dubbridge_institution_credit_ex_async(
        self,
        request: riskplus_models.UpdateDubbridgeInstitutionCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UpdateDubbridgeInstitutionCreditResponse:
        """
        Description: 额度、利率、状态调整
        Summary: 调额申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UpdateDubbridgeInstitutionCreditResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.institution.credit.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_riskinfo_businessinfo(
        self,
        request: riskplus_models.QueryDubbridgeRiskinfoBusinessinfoRequest,
    ) -> riskplus_models.QueryDubbridgeRiskinfoBusinessinfoResponse:
        """
        Description: 天枢企业经营数据查询
        Summary: 天枢企业经营数据查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_riskinfo_businessinfo_ex(request, headers, runtime)

    async def query_dubbridge_riskinfo_businessinfo_async(
        self,
        request: riskplus_models.QueryDubbridgeRiskinfoBusinessinfoRequest,
    ) -> riskplus_models.QueryDubbridgeRiskinfoBusinessinfoResponse:
        """
        Description: 天枢企业经营数据查询
        Summary: 天枢企业经营数据查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_riskinfo_businessinfo_ex_async(request, headers, runtime)

    def query_dubbridge_riskinfo_businessinfo_ex(
        self,
        request: riskplus_models.QueryDubbridgeRiskinfoBusinessinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeRiskinfoBusinessinfoResponse:
        """
        Description: 天枢企业经营数据查询
        Summary: 天枢企业经营数据查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeRiskinfoBusinessinfoResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.riskinfo.businessinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_riskinfo_businessinfo_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeRiskinfoBusinessinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeRiskinfoBusinessinfoResponse:
        """
        Description: 天枢企业经营数据查询
        Summary: 天枢企业经营数据查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeRiskinfoBusinessinfoResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.riskinfo.businessinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_dubbridge_customer_agreementsign(
        self,
        request: riskplus_models.ApplyDubbridgeCustomerAgreementsignRequest,
    ) -> riskplus_models.ApplyDubbridgeCustomerAgreementsignResponse:
        """
        Description: 天枢系统协议签约申请(支付宝）
        Summary: 天枢系统协议签约申请(支付宝)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_dubbridge_customer_agreementsign_ex(request, headers, runtime)

    async def apply_dubbridge_customer_agreementsign_async(
        self,
        request: riskplus_models.ApplyDubbridgeCustomerAgreementsignRequest,
    ) -> riskplus_models.ApplyDubbridgeCustomerAgreementsignResponse:
        """
        Description: 天枢系统协议签约申请(支付宝）
        Summary: 天枢系统协议签约申请(支付宝)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_dubbridge_customer_agreementsign_ex_async(request, headers, runtime)

    def apply_dubbridge_customer_agreementsign_ex(
        self,
        request: riskplus_models.ApplyDubbridgeCustomerAgreementsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyDubbridgeCustomerAgreementsignResponse:
        """
        Description: 天枢系统协议签约申请(支付宝）
        Summary: 天枢系统协议签约申请(支付宝)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyDubbridgeCustomerAgreementsignResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.customer.agreementsign.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_dubbridge_customer_agreementsign_ex_async(
        self,
        request: riskplus_models.ApplyDubbridgeCustomerAgreementsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyDubbridgeCustomerAgreementsignResponse:
        """
        Description: 天枢系统协议签约申请(支付宝）
        Summary: 天枢系统协议签约申请(支付宝)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyDubbridgeCustomerAgreementsignResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.customer.agreementsign.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_account_status(
        self,
        request: riskplus_models.QueryDubbridgeAccountStatusRequest,
    ) -> riskplus_models.QueryDubbridgeAccountStatusResponse:
        """
        Description: 天枢系统是否授信查询
        Summary: 天枢系统是否授信查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_account_status_ex(request, headers, runtime)

    async def query_dubbridge_account_status_async(
        self,
        request: riskplus_models.QueryDubbridgeAccountStatusRequest,
    ) -> riskplus_models.QueryDubbridgeAccountStatusResponse:
        """
        Description: 天枢系统是否授信查询
        Summary: 天枢系统是否授信查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_account_status_ex_async(request, headers, runtime)

    def query_dubbridge_account_status_ex(
        self,
        request: riskplus_models.QueryDubbridgeAccountStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeAccountStatusResponse:
        """
        Description: 天枢系统是否授信查询
        Summary: 天枢系统是否授信查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeAccountStatusResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.account.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_account_status_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeAccountStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeAccountStatusResponse:
        """
        Description: 天枢系统是否授信查询
        Summary: 天枢系统是否授信查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeAccountStatusResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.account.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_account_custom(
        self,
        request: riskplus_models.QueryDubbridgeAccountCustomRequest,
    ) -> riskplus_models.QueryDubbridgeAccountCustomResponse:
        """
        Description: 天枢系统校验是否联登
        Summary: 天枢系统校验是否联登
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_account_custom_ex(request, headers, runtime)

    async def query_dubbridge_account_custom_async(
        self,
        request: riskplus_models.QueryDubbridgeAccountCustomRequest,
    ) -> riskplus_models.QueryDubbridgeAccountCustomResponse:
        """
        Description: 天枢系统校验是否联登
        Summary: 天枢系统校验是否联登
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_account_custom_ex_async(request, headers, runtime)

    def query_dubbridge_account_custom_ex(
        self,
        request: riskplus_models.QueryDubbridgeAccountCustomRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeAccountCustomResponse:
        """
        Description: 天枢系统校验是否联登
        Summary: 天枢系统校验是否联登
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeAccountCustomResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.account.custom.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_account_custom_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeAccountCustomRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeAccountCustomResponse:
        """
        Description: 天枢系统校验是否联登
        Summary: 天枢系统校验是否联登
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeAccountCustomResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.account.custom.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_dubbridge_account_custom(
        self,
        request: riskplus_models.UpdateDubbridgeAccountCustomRequest,
    ) -> riskplus_models.UpdateDubbridgeAccountCustomResponse:
        """
        Description: 天枢系统更新渠道
        Summary: 天枢系统更新渠道
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_dubbridge_account_custom_ex(request, headers, runtime)

    async def update_dubbridge_account_custom_async(
        self,
        request: riskplus_models.UpdateDubbridgeAccountCustomRequest,
    ) -> riskplus_models.UpdateDubbridgeAccountCustomResponse:
        """
        Description: 天枢系统更新渠道
        Summary: 天枢系统更新渠道
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_dubbridge_account_custom_ex_async(request, headers, runtime)

    def update_dubbridge_account_custom_ex(
        self,
        request: riskplus_models.UpdateDubbridgeAccountCustomRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UpdateDubbridgeAccountCustomResponse:
        """
        Description: 天枢系统更新渠道
        Summary: 天枢系统更新渠道
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UpdateDubbridgeAccountCustomResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.account.custom.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_dubbridge_account_custom_ex_async(
        self,
        request: riskplus_models.UpdateDubbridgeAccountCustomRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UpdateDubbridgeAccountCustomResponse:
        """
        Description: 天枢系统更新渠道
        Summary: 天枢系统更新渠道
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UpdateDubbridgeAccountCustomResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.account.custom.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_customer_agreementsign(
        self,
        request: riskplus_models.QueryDubbridgeCustomerAgreementsignRequest,
    ) -> riskplus_models.QueryDubbridgeCustomerAgreementsignResponse:
        """
        Description: 天枢系统协议签约查询(支付宝)
        Summary: 天枢系统协议签约查询(支付宝)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_customer_agreementsign_ex(request, headers, runtime)

    async def query_dubbridge_customer_agreementsign_async(
        self,
        request: riskplus_models.QueryDubbridgeCustomerAgreementsignRequest,
    ) -> riskplus_models.QueryDubbridgeCustomerAgreementsignResponse:
        """
        Description: 天枢系统协议签约查询(支付宝)
        Summary: 天枢系统协议签约查询(支付宝)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_customer_agreementsign_ex_async(request, headers, runtime)

    def query_dubbridge_customer_agreementsign_ex(
        self,
        request: riskplus_models.QueryDubbridgeCustomerAgreementsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeCustomerAgreementsignResponse:
        """
        Description: 天枢系统协议签约查询(支付宝)
        Summary: 天枢系统协议签约查询(支付宝)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeCustomerAgreementsignResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.customer.agreementsign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_customer_agreementsign_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeCustomerAgreementsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeCustomerAgreementsignResponse:
        """
        Description: 天枢系统协议签约查询(支付宝)
        Summary: 天枢系统协议签约查询(支付宝)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeCustomerAgreementsignResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.customer.agreementsign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_dubbridge_customer_info(
        self,
        request: riskplus_models.UpdateDubbridgeCustomerInfoRequest,
    ) -> riskplus_models.UpdateDubbridgeCustomerInfoResponse:
        """
        Description: 天枢系统客户信息变更接口（变更客户三要素信息）
        Summary: 天枢系统客户信息变更接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_dubbridge_customer_info_ex(request, headers, runtime)

    async def update_dubbridge_customer_info_async(
        self,
        request: riskplus_models.UpdateDubbridgeCustomerInfoRequest,
    ) -> riskplus_models.UpdateDubbridgeCustomerInfoResponse:
        """
        Description: 天枢系统客户信息变更接口（变更客户三要素信息）
        Summary: 天枢系统客户信息变更接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_dubbridge_customer_info_ex_async(request, headers, runtime)

    def update_dubbridge_customer_info_ex(
        self,
        request: riskplus_models.UpdateDubbridgeCustomerInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UpdateDubbridgeCustomerInfoResponse:
        """
        Description: 天枢系统客户信息变更接口（变更客户三要素信息）
        Summary: 天枢系统客户信息变更接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UpdateDubbridgeCustomerInfoResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.customer.info.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_dubbridge_customer_info_ex_async(
        self,
        request: riskplus_models.UpdateDubbridgeCustomerInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UpdateDubbridgeCustomerInfoResponse:
        """
        Description: 天枢系统客户信息变更接口（变更客户三要素信息）
        Summary: 天枢系统客户信息变更接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UpdateDubbridgeCustomerInfoResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.customer.info.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_receipt_overdue(
        self,
        request: riskplus_models.QueryDubbridgeReceiptOverdueRequest,
    ) -> riskplus_models.QueryDubbridgeReceiptOverdueResponse:
        """
        Description: 天枢逾期信息查询接口
        Summary: 逾期信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_receipt_overdue_ex(request, headers, runtime)

    async def query_dubbridge_receipt_overdue_async(
        self,
        request: riskplus_models.QueryDubbridgeReceiptOverdueRequest,
    ) -> riskplus_models.QueryDubbridgeReceiptOverdueResponse:
        """
        Description: 天枢逾期信息查询接口
        Summary: 逾期信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_receipt_overdue_ex_async(request, headers, runtime)

    def query_dubbridge_receipt_overdue_ex(
        self,
        request: riskplus_models.QueryDubbridgeReceiptOverdueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeReceiptOverdueResponse:
        """
        Description: 天枢逾期信息查询接口
        Summary: 逾期信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeReceiptOverdueResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.receipt.overdue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_receipt_overdue_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeReceiptOverdueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeReceiptOverdueResponse:
        """
        Description: 天枢逾期信息查询接口
        Summary: 逾期信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeReceiptOverdueResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.receipt.overdue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def repay_dubbridge_repay_checkstand(
        self,
        request: riskplus_models.RepayDubbridgeRepayCheckstandRequest,
    ) -> riskplus_models.RepayDubbridgeRepayCheckstandResponse:
        """
        Description: 天枢系统主动还款（收银台）接口
        Summary: 天枢系统主动还款（收银台）接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.repay_dubbridge_repay_checkstand_ex(request, headers, runtime)

    async def repay_dubbridge_repay_checkstand_async(
        self,
        request: riskplus_models.RepayDubbridgeRepayCheckstandRequest,
    ) -> riskplus_models.RepayDubbridgeRepayCheckstandResponse:
        """
        Description: 天枢系统主动还款（收银台）接口
        Summary: 天枢系统主动还款（收银台）接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.repay_dubbridge_repay_checkstand_ex_async(request, headers, runtime)

    def repay_dubbridge_repay_checkstand_ex(
        self,
        request: riskplus_models.RepayDubbridgeRepayCheckstandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.RepayDubbridgeRepayCheckstandResponse:
        """
        Description: 天枢系统主动还款（收银台）接口
        Summary: 天枢系统主动还款（收银台）接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.RepayDubbridgeRepayCheckstandResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.repay.checkstand.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def repay_dubbridge_repay_checkstand_ex_async(
        self,
        request: riskplus_models.RepayDubbridgeRepayCheckstandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.RepayDubbridgeRepayCheckstandResponse:
        """
        Description: 天枢系统主动还款（收银台）接口
        Summary: 天枢系统主动还款（收银台）接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.RepayDubbridgeRepayCheckstandResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.repay.checkstand.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_repay_info(
        self,
        request: riskplus_models.QueryDubbridgeRepayInfoRequest,
    ) -> riskplus_models.QueryDubbridgeRepayInfoResponse:
        """
        Description: 天枢系统还款信息查询
        Summary: 天枢系统还款信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_repay_info_ex(request, headers, runtime)

    async def query_dubbridge_repay_info_async(
        self,
        request: riskplus_models.QueryDubbridgeRepayInfoRequest,
    ) -> riskplus_models.QueryDubbridgeRepayInfoResponse:
        """
        Description: 天枢系统还款信息查询
        Summary: 天枢系统还款信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_repay_info_ex_async(request, headers, runtime)

    def query_dubbridge_repay_info_ex(
        self,
        request: riskplus_models.QueryDubbridgeRepayInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeRepayInfoResponse:
        """
        Description: 天枢系统还款信息查询
        Summary: 天枢系统还款信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeRepayInfoResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.repay.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_repay_info_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeRepayInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeRepayInfoResponse:
        """
        Description: 天枢系统还款信息查询
        Summary: 天枢系统还款信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeRepayInfoResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.repay.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_repay_list(
        self,
        request: riskplus_models.QueryDubbridgeRepayListRequest,
    ) -> riskplus_models.QueryDubbridgeRepayListResponse:
        """
        Description: 天枢系统还款计划查询，根据申请订单查询还款计划
        Summary: 天枢系统还款计划查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_repay_list_ex(request, headers, runtime)

    async def query_dubbridge_repay_list_async(
        self,
        request: riskplus_models.QueryDubbridgeRepayListRequest,
    ) -> riskplus_models.QueryDubbridgeRepayListResponse:
        """
        Description: 天枢系统还款计划查询，根据申请订单查询还款计划
        Summary: 天枢系统还款计划查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_repay_list_ex_async(request, headers, runtime)

    def query_dubbridge_repay_list_ex(
        self,
        request: riskplus_models.QueryDubbridgeRepayListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeRepayListResponse:
        """
        Description: 天枢系统还款计划查询，根据申请订单查询还款计划
        Summary: 天枢系统还款计划查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeRepayListResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.repay.list.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_repay_list_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeRepayListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeRepayListResponse:
        """
        Description: 天枢系统还款计划查询，根据申请订单查询还款计划
        Summary: 天枢系统还款计划查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeRepayListResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.repay.list.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_dubbridge_repay_reftrial(
        self,
        request: riskplus_models.CountDubbridgeRepayReftrialRequest,
    ) -> riskplus_models.CountDubbridgeRepayReftrialResponse:
        """
        Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
        Summary: 天枢系统还款计划试算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_dubbridge_repay_reftrial_ex(request, headers, runtime)

    async def count_dubbridge_repay_reftrial_async(
        self,
        request: riskplus_models.CountDubbridgeRepayReftrialRequest,
    ) -> riskplus_models.CountDubbridgeRepayReftrialResponse:
        """
        Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
        Summary: 天枢系统还款计划试算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_dubbridge_repay_reftrial_ex_async(request, headers, runtime)

    def count_dubbridge_repay_reftrial_ex(
        self,
        request: riskplus_models.CountDubbridgeRepayReftrialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CountDubbridgeRepayReftrialResponse:
        """
        Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
        Summary: 天枢系统还款计划试算
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CountDubbridgeRepayReftrialResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.repay.reftrial.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_dubbridge_repay_reftrial_ex_async(
        self,
        request: riskplus_models.CountDubbridgeRepayReftrialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CountDubbridgeRepayReftrialResponse:
        """
        Description: 天枢系统还款计划试算，根据借款金额和期数计算还款计划
        Summary: 天枢系统还款计划试算
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CountDubbridgeRepayReftrialResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.repay.reftrial.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_dubbridge_repay_trial(
        self,
        request: riskplus_models.CountDubbridgeRepayTrialRequest,
    ) -> riskplus_models.CountDubbridgeRepayTrialResponse:
        """
        Description: 天枢系统还款试算，根据借据号计算还款金额
        Summary: 天枢系统还款试算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_dubbridge_repay_trial_ex(request, headers, runtime)

    async def count_dubbridge_repay_trial_async(
        self,
        request: riskplus_models.CountDubbridgeRepayTrialRequest,
    ) -> riskplus_models.CountDubbridgeRepayTrialResponse:
        """
        Description: 天枢系统还款试算，根据借据号计算还款金额
        Summary: 天枢系统还款试算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_dubbridge_repay_trial_ex_async(request, headers, runtime)

    def count_dubbridge_repay_trial_ex(
        self,
        request: riskplus_models.CountDubbridgeRepayTrialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CountDubbridgeRepayTrialResponse:
        """
        Description: 天枢系统还款试算，根据借据号计算还款金额
        Summary: 天枢系统还款试算
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CountDubbridgeRepayTrialResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.repay.trial.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_dubbridge_repay_trial_ex_async(
        self,
        request: riskplus_models.CountDubbridgeRepayTrialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CountDubbridgeRepayTrialResponse:
        """
        Description: 天枢系统还款试算，根据借据号计算还款金额
        Summary: 天枢系统还款试算
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CountDubbridgeRepayTrialResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.repay.trial.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def repay_dubbridge_repay_withhold(
        self,
        request: riskplus_models.RepayDubbridgeRepayWithholdRequest,
    ) -> riskplus_models.RepayDubbridgeRepayWithholdResponse:
        """
        Description: 天枢信贷业务系统主动还款（直接代扣）接口
        Summary: 天枢信贷业务系统主动还款（直接代扣）接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.repay_dubbridge_repay_withhold_ex(request, headers, runtime)

    async def repay_dubbridge_repay_withhold_async(
        self,
        request: riskplus_models.RepayDubbridgeRepayWithholdRequest,
    ) -> riskplus_models.RepayDubbridgeRepayWithholdResponse:
        """
        Description: 天枢信贷业务系统主动还款（直接代扣）接口
        Summary: 天枢信贷业务系统主动还款（直接代扣）接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.repay_dubbridge_repay_withhold_ex_async(request, headers, runtime)

    def repay_dubbridge_repay_withhold_ex(
        self,
        request: riskplus_models.RepayDubbridgeRepayWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.RepayDubbridgeRepayWithholdResponse:
        """
        Description: 天枢信贷业务系统主动还款（直接代扣）接口
        Summary: 天枢信贷业务系统主动还款（直接代扣）接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.RepayDubbridgeRepayWithholdResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.repay.withhold.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def repay_dubbridge_repay_withhold_ex_async(
        self,
        request: riskplus_models.RepayDubbridgeRepayWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.RepayDubbridgeRepayWithholdResponse:
        """
        Description: 天枢信贷业务系统主动还款（直接代扣）接口
        Summary: 天枢信贷业务系统主动还款（直接代扣）接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.RepayDubbridgeRepayWithholdResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.repay.withhold.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_search_contract(
        self,
        request: riskplus_models.QueryDubbridgeSearchContractRequest,
    ) -> riskplus_models.QueryDubbridgeSearchContractResponse:
        """
        Description: 天枢系统合同获取
        Summary: 天枢系统合同获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_search_contract_ex(request, headers, runtime)

    async def query_dubbridge_search_contract_async(
        self,
        request: riskplus_models.QueryDubbridgeSearchContractRequest,
    ) -> riskplus_models.QueryDubbridgeSearchContractResponse:
        """
        Description: 天枢系统合同获取
        Summary: 天枢系统合同获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_search_contract_ex_async(request, headers, runtime)

    def query_dubbridge_search_contract_ex(
        self,
        request: riskplus_models.QueryDubbridgeSearchContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeSearchContractResponse:
        """
        Description: 天枢系统合同获取
        Summary: 天枢系统合同获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeSearchContractResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.search.contract.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_search_contract_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeSearchContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeSearchContractResponse:
        """
        Description: 天枢系统合同获取
        Summary: 天枢系统合同获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeSearchContractResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.search.contract.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_dubbridge_usecredit(
        self,
        request: riskplus_models.ApplyDubbridgeUsecreditRequest,
    ) -> riskplus_models.ApplyDubbridgeUsecreditResponse:
        """
        Description: 天枢系统用信申请接口
        Summary: 天枢系统用信申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_dubbridge_usecredit_ex(request, headers, runtime)

    async def apply_dubbridge_usecredit_async(
        self,
        request: riskplus_models.ApplyDubbridgeUsecreditRequest,
    ) -> riskplus_models.ApplyDubbridgeUsecreditResponse:
        """
        Description: 天枢系统用信申请接口
        Summary: 天枢系统用信申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_dubbridge_usecredit_ex_async(request, headers, runtime)

    def apply_dubbridge_usecredit_ex(
        self,
        request: riskplus_models.ApplyDubbridgeUsecreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyDubbridgeUsecreditResponse:
        """
        Description: 天枢系统用信申请接口
        Summary: 天枢系统用信申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyDubbridgeUsecreditResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.usecredit.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_dubbridge_usecredit_ex_async(
        self,
        request: riskplus_models.ApplyDubbridgeUsecreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyDubbridgeUsecreditResponse:
        """
        Description: 天枢系统用信申请接口
        Summary: 天枢系统用信申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyDubbridgeUsecreditResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.usecredit.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_usecredit_status(
        self,
        request: riskplus_models.QueryDubbridgeUsecreditStatusRequest,
    ) -> riskplus_models.QueryDubbridgeUsecreditStatusResponse:
        """
        Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
        Summary: 天枢系统用信申请状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_usecredit_status_ex(request, headers, runtime)

    async def query_dubbridge_usecredit_status_async(
        self,
        request: riskplus_models.QueryDubbridgeUsecreditStatusRequest,
    ) -> riskplus_models.QueryDubbridgeUsecreditStatusResponse:
        """
        Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
        Summary: 天枢系统用信申请状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_usecredit_status_ex_async(request, headers, runtime)

    def query_dubbridge_usecredit_status_ex(
        self,
        request: riskplus_models.QueryDubbridgeUsecreditStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeUsecreditStatusResponse:
        """
        Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
        Summary: 天枢系统用信申请状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeUsecreditStatusResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.usecredit.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_usecredit_status_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeUsecreditStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeUsecreditStatusResponse:
        """
        Description: 天枢系统用信申请状态查询，返回用信详情及还款计划
        Summary: 天枢系统用信申请状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeUsecreditStatusResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.usecredit.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_receipt_status(
        self,
        request: riskplus_models.QueryDubbridgeReceiptStatusRequest,
    ) -> riskplus_models.QueryDubbridgeReceiptStatusResponse:
        """
        Description: 天枢系统是否结清
        Summary: 天枢系统借款是否结清
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_receipt_status_ex(request, headers, runtime)

    async def query_dubbridge_receipt_status_async(
        self,
        request: riskplus_models.QueryDubbridgeReceiptStatusRequest,
    ) -> riskplus_models.QueryDubbridgeReceiptStatusResponse:
        """
        Description: 天枢系统是否结清
        Summary: 天枢系统借款是否结清
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_receipt_status_ex_async(request, headers, runtime)

    def query_dubbridge_receipt_status_ex(
        self,
        request: riskplus_models.QueryDubbridgeReceiptStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeReceiptStatusResponse:
        """
        Description: 天枢系统是否结清
        Summary: 天枢系统借款是否结清
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeReceiptStatusResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.receipt.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_receipt_status_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeReceiptStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeReceiptStatusResponse:
        """
        Description: 天枢系统是否结清
        Summary: 天枢系统借款是否结清
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeReceiptStatusResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.receipt.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_customer_commonagreementsign(
        self,
        request: riskplus_models.QueryDubbridgeCustomerCommonagreementsignRequest,
    ) -> riskplus_models.QueryDubbridgeCustomerCommonagreementsignResponse:
        """
        Description: 天枢系统协议签约查询(通用)
        Summary: 天枢系统协议签约查询(通用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_customer_commonagreementsign_ex(request, headers, runtime)

    async def query_dubbridge_customer_commonagreementsign_async(
        self,
        request: riskplus_models.QueryDubbridgeCustomerCommonagreementsignRequest,
    ) -> riskplus_models.QueryDubbridgeCustomerCommonagreementsignResponse:
        """
        Description: 天枢系统协议签约查询(通用)
        Summary: 天枢系统协议签约查询(通用)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_customer_commonagreementsign_ex_async(request, headers, runtime)

    def query_dubbridge_customer_commonagreementsign_ex(
        self,
        request: riskplus_models.QueryDubbridgeCustomerCommonagreementsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeCustomerCommonagreementsignResponse:
        """
        Description: 天枢系统协议签约查询(通用)
        Summary: 天枢系统协议签约查询(通用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeCustomerCommonagreementsignResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.customer.commonagreementsign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_customer_commonagreementsign_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeCustomerCommonagreementsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeCustomerCommonagreementsignResponse:
        """
        Description: 天枢系统协议签约查询(通用)
        Summary: 天枢系统协议签约查询(通用)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeCustomerCommonagreementsignResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.customer.commonagreementsign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_dubbridge_file(
        self,
        request: riskplus_models.UpdateDubbridgeFileRequest,
    ) -> riskplus_models.UpdateDubbridgeFileResponse:
        """
        Description: 客户影像信息更新
        Summary: 客户影像信息更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_dubbridge_file_ex(request, headers, runtime)

    async def update_dubbridge_file_async(
        self,
        request: riskplus_models.UpdateDubbridgeFileRequest,
    ) -> riskplus_models.UpdateDubbridgeFileResponse:
        """
        Description: 客户影像信息更新
        Summary: 客户影像信息更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_dubbridge_file_ex_async(request, headers, runtime)

    def update_dubbridge_file_ex(
        self,
        request: riskplus_models.UpdateDubbridgeFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UpdateDubbridgeFileResponse:
        """
        Description: 客户影像信息更新
        Summary: 客户影像信息更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UpdateDubbridgeFileResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.file.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_dubbridge_file_ex_async(
        self,
        request: riskplus_models.UpdateDubbridgeFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UpdateDubbridgeFileResponse:
        """
        Description: 客户影像信息更新
        Summary: 客户影像信息更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UpdateDubbridgeFileResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.file.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_dubbridge_callback(
        self,
        request: riskplus_models.NotifyDubbridgeCallbackRequest,
    ) -> riskplus_models.NotifyDubbridgeCallbackResponse:
        """
        Description: 天枢回调通用接口
        Summary: 天枢回调通用接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_dubbridge_callback_ex(request, headers, runtime)

    async def notify_dubbridge_callback_async(
        self,
        request: riskplus_models.NotifyDubbridgeCallbackRequest,
    ) -> riskplus_models.NotifyDubbridgeCallbackResponse:
        """
        Description: 天枢回调通用接口
        Summary: 天枢回调通用接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_dubbridge_callback_ex_async(request, headers, runtime)

    def notify_dubbridge_callback_ex(
        self,
        request: riskplus_models.NotifyDubbridgeCallbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.NotifyDubbridgeCallbackResponse:
        """
        Description: 天枢回调通用接口
        Summary: 天枢回调通用接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.NotifyDubbridgeCallbackResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.callback.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_dubbridge_callback_ex_async(
        self,
        request: riskplus_models.NotifyDubbridgeCallbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.NotifyDubbridgeCallbackResponse:
        """
        Description: 天枢回调通用接口
        Summary: 天枢回调通用接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.NotifyDubbridgeCallbackResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.callback.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_repay_result(
        self,
        request: riskplus_models.QueryDubbridgeRepayResultRequest,
    ) -> riskplus_models.QueryDubbridgeRepayResultResponse:
        """
        Description: 2.12	天枢系统还款信息查询V2.0
        Summary: 2.12 天枢系统还款信息查询V2.0
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_repay_result_ex(request, headers, runtime)

    async def query_dubbridge_repay_result_async(
        self,
        request: riskplus_models.QueryDubbridgeRepayResultRequest,
    ) -> riskplus_models.QueryDubbridgeRepayResultResponse:
        """
        Description: 2.12	天枢系统还款信息查询V2.0
        Summary: 2.12 天枢系统还款信息查询V2.0
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_repay_result_ex_async(request, headers, runtime)

    def query_dubbridge_repay_result_ex(
        self,
        request: riskplus_models.QueryDubbridgeRepayResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeRepayResultResponse:
        """
        Description: 2.12	天枢系统还款信息查询V2.0
        Summary: 2.12 天枢系统还款信息查询V2.0
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeRepayResultResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.repay.result.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_repay_result_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeRepayResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeRepayResultResponse:
        """
        Description: 2.12	天枢系统还款信息查询V2.0
        Summary: 2.12 天枢系统还款信息查询V2.0
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeRepayResultResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.repay.result.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_credit_permit(
        self,
        request: riskplus_models.QueryDubbridgeCreditPermitRequest,
    ) -> riskplus_models.QueryDubbridgeCreditPermitResponse:
        """
        Description: 天枢准入接口
        Summary: 天枢准入接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_credit_permit_ex(request, headers, runtime)

    async def query_dubbridge_credit_permit_async(
        self,
        request: riskplus_models.QueryDubbridgeCreditPermitRequest,
    ) -> riskplus_models.QueryDubbridgeCreditPermitResponse:
        """
        Description: 天枢准入接口
        Summary: 天枢准入接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_credit_permit_ex_async(request, headers, runtime)

    def query_dubbridge_credit_permit_ex(
        self,
        request: riskplus_models.QueryDubbridgeCreditPermitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeCreditPermitResponse:
        """
        Description: 天枢准入接口
        Summary: 天枢准入接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeCreditPermitResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.credit.permit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_credit_permit_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeCreditPermitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeCreditPermitResponse:
        """
        Description: 天枢准入接口
        Summary: 天枢准入接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeCreditPermitResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.credit.permit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_user_upgradestatus(
        self,
        request: riskplus_models.QueryDubbridgeUserUpgradestatusRequest,
    ) -> riskplus_models.QueryDubbridgeUserUpgradestatusResponse:
        """
        Description: 用户状态判断
        Summary: 用户状态判断
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_user_upgradestatus_ex(request, headers, runtime)

    async def query_dubbridge_user_upgradestatus_async(
        self,
        request: riskplus_models.QueryDubbridgeUserUpgradestatusRequest,
    ) -> riskplus_models.QueryDubbridgeUserUpgradestatusResponse:
        """
        Description: 用户状态判断
        Summary: 用户状态判断
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_user_upgradestatus_ex_async(request, headers, runtime)

    def query_dubbridge_user_upgradestatus_ex(
        self,
        request: riskplus_models.QueryDubbridgeUserUpgradestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeUserUpgradestatusResponse:
        """
        Description: 用户状态判断
        Summary: 用户状态判断
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeUserUpgradestatusResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.user.upgradestatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_user_upgradestatus_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeUserUpgradestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeUserUpgradestatusResponse:
        """
        Description: 用户状态判断
        Summary: 用户状态判断
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeUserUpgradestatusResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.user.upgradestatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_loan_upgradestatus(
        self,
        request: riskplus_models.QueryDubbridgeLoanUpgradestatusRequest,
    ) -> riskplus_models.QueryDubbridgeLoanUpgradestatusResponse:
        """
        Description: 借据状态判断
        Summary: 借据状态判断
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_loan_upgradestatus_ex(request, headers, runtime)

    async def query_dubbridge_loan_upgradestatus_async(
        self,
        request: riskplus_models.QueryDubbridgeLoanUpgradestatusRequest,
    ) -> riskplus_models.QueryDubbridgeLoanUpgradestatusResponse:
        """
        Description: 借据状态判断
        Summary: 借据状态判断
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_loan_upgradestatus_ex_async(request, headers, runtime)

    def query_dubbridge_loan_upgradestatus_ex(
        self,
        request: riskplus_models.QueryDubbridgeLoanUpgradestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeLoanUpgradestatusResponse:
        """
        Description: 借据状态判断
        Summary: 借据状态判断
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeLoanUpgradestatusResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.loan.upgradestatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_loan_upgradestatus_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeLoanUpgradestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeLoanUpgradestatusResponse:
        """
        Description: 借据状态判断
        Summary: 借据状态判断
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeLoanUpgradestatusResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.loan.upgradestatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_customer_bankcardlist(
        self,
        request: riskplus_models.QueryDubbridgeCustomerBankcardlistRequest,
    ) -> riskplus_models.QueryDubbridgeCustomerBankcardlistResponse:
        """
        Description: 支付签约查询(用户绑定银行卡列表)
        Summary: 支付签约查询(用户绑定银行卡列表)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_customer_bankcardlist_ex(request, headers, runtime)

    async def query_dubbridge_customer_bankcardlist_async(
        self,
        request: riskplus_models.QueryDubbridgeCustomerBankcardlistRequest,
    ) -> riskplus_models.QueryDubbridgeCustomerBankcardlistResponse:
        """
        Description: 支付签约查询(用户绑定银行卡列表)
        Summary: 支付签约查询(用户绑定银行卡列表)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_customer_bankcardlist_ex_async(request, headers, runtime)

    def query_dubbridge_customer_bankcardlist_ex(
        self,
        request: riskplus_models.QueryDubbridgeCustomerBankcardlistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeCustomerBankcardlistResponse:
        """
        Description: 支付签约查询(用户绑定银行卡列表)
        Summary: 支付签约查询(用户绑定银行卡列表)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeCustomerBankcardlistResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.customer.bankcardlist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_customer_bankcardlist_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeCustomerBankcardlistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeCustomerBankcardlistResponse:
        """
        Description: 支付签约查询(用户绑定银行卡列表)
        Summary: 支付签约查询(用户绑定银行卡列表)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeCustomerBankcardlistResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.customer.bankcardlist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_router_userselect(
        self,
        request: riskplus_models.QueryDubbridgeRouterUserselectRequest,
    ) -> riskplus_models.QueryDubbridgeRouterUserselectResponse:
        """
        Description: 天枢系统用户前筛查询
        Summary: 天枢系统用户前筛查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_router_userselect_ex(request, headers, runtime)

    async def query_dubbridge_router_userselect_async(
        self,
        request: riskplus_models.QueryDubbridgeRouterUserselectRequest,
    ) -> riskplus_models.QueryDubbridgeRouterUserselectResponse:
        """
        Description: 天枢系统用户前筛查询
        Summary: 天枢系统用户前筛查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_router_userselect_ex_async(request, headers, runtime)

    def query_dubbridge_router_userselect_ex(
        self,
        request: riskplus_models.QueryDubbridgeRouterUserselectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeRouterUserselectResponse:
        """
        Description: 天枢系统用户前筛查询
        Summary: 天枢系统用户前筛查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeRouterUserselectResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.router.userselect.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_router_userselect_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeRouterUserselectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeRouterUserselectResponse:
        """
        Description: 天枢系统用户前筛查询
        Summary: 天枢系统用户前筛查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeRouterUserselectResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.router.userselect.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_settlement_certificate(
        self,
        request: riskplus_models.QueryDubbridgeSettlementCertificateRequest,
    ) -> riskplus_models.QueryDubbridgeSettlementCertificateResponse:
        """
        Description: 天枢系统开具结清证明
        Summary: 天枢系统开具结清证明
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_settlement_certificate_ex(request, headers, runtime)

    async def query_dubbridge_settlement_certificate_async(
        self,
        request: riskplus_models.QueryDubbridgeSettlementCertificateRequest,
    ) -> riskplus_models.QueryDubbridgeSettlementCertificateResponse:
        """
        Description: 天枢系统开具结清证明
        Summary: 天枢系统开具结清证明
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_settlement_certificate_ex_async(request, headers, runtime)

    def query_dubbridge_settlement_certificate_ex(
        self,
        request: riskplus_models.QueryDubbridgeSettlementCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeSettlementCertificateResponse:
        """
        Description: 天枢系统开具结清证明
        Summary: 天枢系统开具结清证明
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeSettlementCertificateResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.settlement.certificate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_settlement_certificate_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeSettlementCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeSettlementCertificateResponse:
        """
        Description: 天枢系统开具结清证明
        Summary: 天枢系统开具结清证明
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeSettlementCertificateResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.settlement.certificate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_agreement_preview(
        self,
        request: riskplus_models.QueryDubbridgeAgreementPreviewRequest,
    ) -> riskplus_models.QueryDubbridgeAgreementPreviewResponse:
        """
        Description: 天枢系统预览协议查询接口
        Summary: 天枢系统预览协议查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_agreement_preview_ex(request, headers, runtime)

    async def query_dubbridge_agreement_preview_async(
        self,
        request: riskplus_models.QueryDubbridgeAgreementPreviewRequest,
    ) -> riskplus_models.QueryDubbridgeAgreementPreviewResponse:
        """
        Description: 天枢系统预览协议查询接口
        Summary: 天枢系统预览协议查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_agreement_preview_ex_async(request, headers, runtime)

    def query_dubbridge_agreement_preview_ex(
        self,
        request: riskplus_models.QueryDubbridgeAgreementPreviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeAgreementPreviewResponse:
        """
        Description: 天枢系统预览协议查询接口
        Summary: 天枢系统预览协议查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeAgreementPreviewResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.agreement.preview.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_agreement_preview_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeAgreementPreviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeAgreementPreviewResponse:
        """
        Description: 天枢系统预览协议查询接口
        Summary: 天枢系统预览协议查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeAgreementPreviewResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.agreement.preview.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_account_usecredit(
        self,
        request: riskplus_models.QueryDubbridgeAccountUsecreditRequest,
    ) -> riskplus_models.QueryDubbridgeAccountUsecreditResponse:
        """
        Description: 用户借款是否结清
        Summary: 用户借款是否结清
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_account_usecredit_ex(request, headers, runtime)

    async def query_dubbridge_account_usecredit_async(
        self,
        request: riskplus_models.QueryDubbridgeAccountUsecreditRequest,
    ) -> riskplus_models.QueryDubbridgeAccountUsecreditResponse:
        """
        Description: 用户借款是否结清
        Summary: 用户借款是否结清
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_account_usecredit_ex_async(request, headers, runtime)

    def query_dubbridge_account_usecredit_ex(
        self,
        request: riskplus_models.QueryDubbridgeAccountUsecreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeAccountUsecreditResponse:
        """
        Description: 用户借款是否结清
        Summary: 用户借款是否结清
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeAccountUsecreditResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.account.usecredit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_account_usecredit_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeAccountUsecreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeAccountUsecreditResponse:
        """
        Description: 用户借款是否结清
        Summary: 用户借款是否结清
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeAccountUsecreditResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.account.usecredit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_user_aggregationinfo(
        self,
        request: riskplus_models.QueryDubbridgeUserAggregationinfoRequest,
    ) -> riskplus_models.QueryDubbridgeUserAggregationinfoResponse:
        """
        Description: 天枢用户聚合状态查询接口
        Summary: 天枢用户聚合状态查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_user_aggregationinfo_ex(request, headers, runtime)

    async def query_dubbridge_user_aggregationinfo_async(
        self,
        request: riskplus_models.QueryDubbridgeUserAggregationinfoRequest,
    ) -> riskplus_models.QueryDubbridgeUserAggregationinfoResponse:
        """
        Description: 天枢用户聚合状态查询接口
        Summary: 天枢用户聚合状态查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_user_aggregationinfo_ex_async(request, headers, runtime)

    def query_dubbridge_user_aggregationinfo_ex(
        self,
        request: riskplus_models.QueryDubbridgeUserAggregationinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeUserAggregationinfoResponse:
        """
        Description: 天枢用户聚合状态查询接口
        Summary: 天枢用户聚合状态查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeUserAggregationinfoResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.user.aggregationinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_user_aggregationinfo_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeUserAggregationinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeUserAggregationinfoResponse:
        """
        Description: 天枢用户聚合状态查询接口
        Summary: 天枢用户聚合状态查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeUserAggregationinfoResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.user.aggregationinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_marketing_couponlist(
        self,
        request: riskplus_models.QueryDubbridgeMarketingCouponlistRequest,
    ) -> riskplus_models.QueryDubbridgeMarketingCouponlistResponse:
        """
        Description: 天枢系统优惠券列表查询接口
        Summary: 天枢系统优惠券列表查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_marketing_couponlist_ex(request, headers, runtime)

    async def query_dubbridge_marketing_couponlist_async(
        self,
        request: riskplus_models.QueryDubbridgeMarketingCouponlistRequest,
    ) -> riskplus_models.QueryDubbridgeMarketingCouponlistResponse:
        """
        Description: 天枢系统优惠券列表查询接口
        Summary: 天枢系统优惠券列表查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_marketing_couponlist_ex_async(request, headers, runtime)

    def query_dubbridge_marketing_couponlist_ex(
        self,
        request: riskplus_models.QueryDubbridgeMarketingCouponlistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeMarketingCouponlistResponse:
        """
        Description: 天枢系统优惠券列表查询接口
        Summary: 天枢系统优惠券列表查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeMarketingCouponlistResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.marketing.couponlist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_marketing_couponlist_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeMarketingCouponlistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeMarketingCouponlistResponse:
        """
        Description: 天枢系统优惠券列表查询接口
        Summary: 天枢系统优惠券列表查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeMarketingCouponlistResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.marketing.couponlist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_repaytype_info(
        self,
        request: riskplus_models.QueryDubbridgeRepaytypeInfoRequest,
    ) -> riskplus_models.QueryDubbridgeRepaytypeInfoResponse:
        """
        Description: 天枢系统还款方式查询
        Summary: 天枢系统还款方式查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_repaytype_info_ex(request, headers, runtime)

    async def query_dubbridge_repaytype_info_async(
        self,
        request: riskplus_models.QueryDubbridgeRepaytypeInfoRequest,
    ) -> riskplus_models.QueryDubbridgeRepaytypeInfoResponse:
        """
        Description: 天枢系统还款方式查询
        Summary: 天枢系统还款方式查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_repaytype_info_ex_async(request, headers, runtime)

    def query_dubbridge_repaytype_info_ex(
        self,
        request: riskplus_models.QueryDubbridgeRepaytypeInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeRepaytypeInfoResponse:
        """
        Description: 天枢系统还款方式查询
        Summary: 天枢系统还款方式查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeRepaytypeInfoResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.repaytype.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_repaytype_info_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeRepaytypeInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeRepaytypeInfoResponse:
        """
        Description: 天枢系统还款方式查询
        Summary: 天枢系统还款方式查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeRepaytypeInfoResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.repaytype.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_installment_creditamt(
        self,
        request: riskplus_models.QueryDubbridgeInstallmentCreditamtRequest,
    ) -> riskplus_models.QueryDubbridgeInstallmentCreditamtResponse:
        """
        Description: 天枢系统授信额度查询接口-分期付
        Summary: 天枢系统授信额度查询接口-分期付
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_installment_creditamt_ex(request, headers, runtime)

    async def query_dubbridge_installment_creditamt_async(
        self,
        request: riskplus_models.QueryDubbridgeInstallmentCreditamtRequest,
    ) -> riskplus_models.QueryDubbridgeInstallmentCreditamtResponse:
        """
        Description: 天枢系统授信额度查询接口-分期付
        Summary: 天枢系统授信额度查询接口-分期付
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_installment_creditamt_ex_async(request, headers, runtime)

    def query_dubbridge_installment_creditamt_ex(
        self,
        request: riskplus_models.QueryDubbridgeInstallmentCreditamtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeInstallmentCreditamtResponse:
        """
        Description: 天枢系统授信额度查询接口-分期付
        Summary: 天枢系统授信额度查询接口-分期付
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeInstallmentCreditamtResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.installment.creditamt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_installment_creditamt_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeInstallmentCreditamtRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeInstallmentCreditamtResponse:
        """
        Description: 天枢系统授信额度查询接口-分期付
        Summary: 天枢系统授信额度查询接口-分期付
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeInstallmentCreditamtResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.installment.creditamt.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_dubbridge_installment_order(
        self,
        request: riskplus_models.CancelDubbridgeInstallmentOrderRequest,
    ) -> riskplus_models.CancelDubbridgeInstallmentOrderResponse:
        """
        Description: 天枢系统取消分期付订单-分期付
        Summary: 天枢系统取消分期付订单-分期付
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_dubbridge_installment_order_ex(request, headers, runtime)

    async def cancel_dubbridge_installment_order_async(
        self,
        request: riskplus_models.CancelDubbridgeInstallmentOrderRequest,
    ) -> riskplus_models.CancelDubbridgeInstallmentOrderResponse:
        """
        Description: 天枢系统取消分期付订单-分期付
        Summary: 天枢系统取消分期付订单-分期付
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_dubbridge_installment_order_ex_async(request, headers, runtime)

    def cancel_dubbridge_installment_order_ex(
        self,
        request: riskplus_models.CancelDubbridgeInstallmentOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CancelDubbridgeInstallmentOrderResponse:
        """
        Description: 天枢系统取消分期付订单-分期付
        Summary: 天枢系统取消分期付订单-分期付
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CancelDubbridgeInstallmentOrderResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.installment.order.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_dubbridge_installment_order_ex_async(
        self,
        request: riskplus_models.CancelDubbridgeInstallmentOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CancelDubbridgeInstallmentOrderResponse:
        """
        Description: 天枢系统取消分期付订单-分期付
        Summary: 天枢系统取消分期付订单-分期付
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CancelDubbridgeInstallmentOrderResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.installment.order.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_dubbridge_installment_supplement(
        self,
        request: riskplus_models.PushDubbridgeInstallmentSupplementRequest,
    ) -> riskplus_models.PushDubbridgeInstallmentSupplementResponse:
        """
        Description: 天枢系统支用后补充材料推送-分期付
        Summary: 天枢系统支用后补充材料推送-分期付
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_dubbridge_installment_supplement_ex(request, headers, runtime)

    async def push_dubbridge_installment_supplement_async(
        self,
        request: riskplus_models.PushDubbridgeInstallmentSupplementRequest,
    ) -> riskplus_models.PushDubbridgeInstallmentSupplementResponse:
        """
        Description: 天枢系统支用后补充材料推送-分期付
        Summary: 天枢系统支用后补充材料推送-分期付
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_dubbridge_installment_supplement_ex_async(request, headers, runtime)

    def push_dubbridge_installment_supplement_ex(
        self,
        request: riskplus_models.PushDubbridgeInstallmentSupplementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushDubbridgeInstallmentSupplementResponse:
        """
        Description: 天枢系统支用后补充材料推送-分期付
        Summary: 天枢系统支用后补充材料推送-分期付
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushDubbridgeInstallmentSupplementResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.installment.supplement.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_dubbridge_installment_supplement_ex_async(
        self,
        request: riskplus_models.PushDubbridgeInstallmentSupplementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushDubbridgeInstallmentSupplementResponse:
        """
        Description: 天枢系统支用后补充材料推送-分期付
        Summary: 天枢系统支用后补充材料推送-分期付
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushDubbridgeInstallmentSupplementResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.installment.supplement.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dubbridge_installment_trial(
        self,
        request: riskplus_models.QueryDubbridgeInstallmentTrialRequest,
    ) -> riskplus_models.QueryDubbridgeInstallmentTrialResponse:
        """
        Description: 天枢系统分期试算
        Summary: 天枢系统分期试算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dubbridge_installment_trial_ex(request, headers, runtime)

    async def query_dubbridge_installment_trial_async(
        self,
        request: riskplus_models.QueryDubbridgeInstallmentTrialRequest,
    ) -> riskplus_models.QueryDubbridgeInstallmentTrialResponse:
        """
        Description: 天枢系统分期试算
        Summary: 天枢系统分期试算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dubbridge_installment_trial_ex_async(request, headers, runtime)

    def query_dubbridge_installment_trial_ex(
        self,
        request: riskplus_models.QueryDubbridgeInstallmentTrialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeInstallmentTrialResponse:
        """
        Description: 天枢系统分期试算
        Summary: 天枢系统分期试算
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeInstallmentTrialResponse(),
            self.do_request('1.0', 'riskplus.dubbridge.installment.trial.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dubbridge_installment_trial_ex_async(
        self,
        request: riskplus_models.QueryDubbridgeInstallmentTrialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryDubbridgeInstallmentTrialResponse:
        """
        Description: 天枢系统分期试算
        Summary: 天枢系统分期试算
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryDubbridgeInstallmentTrialResponse(),
            await self.do_request_async('1.0', 'riskplus.dubbridge.installment.trial.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
        return TeaCore.from_map(
            riskplus_models.VerifyFinserviceZhimaIdentifyResponse(),
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
        return TeaCore.from_map(
            riskplus_models.VerifyFinserviceZhimaIdentifyResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryFinserviceZhimaIdentifyResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryFinserviceZhimaIdentifyResponse(),
            await self.do_request_async('1.0', 'riskplus.finservice.zhima.identify.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mdip_dataservice(
        self,
        request: riskplus_models.QueryMdipDataserviceRequest,
    ) -> riskplus_models.QueryMdipDataserviceResponse:
        """
        Description: 多源融合平台的数据服务查询接口
        Summary: 多源融合平台的数据服务查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mdip_dataservice_ex(request, headers, runtime)

    async def query_mdip_dataservice_async(
        self,
        request: riskplus_models.QueryMdipDataserviceRequest,
    ) -> riskplus_models.QueryMdipDataserviceResponse:
        """
        Description: 多源融合平台的数据服务查询接口
        Summary: 多源融合平台的数据服务查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mdip_dataservice_ex_async(request, headers, runtime)

    def query_mdip_dataservice_ex(
        self,
        request: riskplus_models.QueryMdipDataserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryMdipDataserviceResponse:
        """
        Description: 多源融合平台的数据服务查询接口
        Summary: 多源融合平台的数据服务查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryMdipDataserviceResponse(),
            self.do_request('1.0', 'riskplus.mdip.dataservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mdip_dataservice_ex_async(
        self,
        request: riskplus_models.QueryMdipDataserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryMdipDataserviceResponse:
        """
        Description: 多源融合平台的数据服务查询接口
        Summary: 多源融合平台的数据服务查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryMdipDataserviceResponse(),
            await self.do_request_async('1.0', 'riskplus.mdip.dataservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def receive_mdip_params_file(
        self,
        request: riskplus_models.ReceiveMdipParamsFileRequest,
    ) -> riskplus_models.ReceiveMdipParamsFileResponse:
        """
        Description: 接受op的文件id,支持外网多源文件上传
        Summary: 接受op的文件id,支持外网多源文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.receive_mdip_params_file_ex(request, headers, runtime)

    async def receive_mdip_params_file_async(
        self,
        request: riskplus_models.ReceiveMdipParamsFileRequest,
    ) -> riskplus_models.ReceiveMdipParamsFileResponse:
        """
        Description: 接受op的文件id,支持外网多源文件上传
        Summary: 接受op的文件id,支持外网多源文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.receive_mdip_params_file_ex_async(request, headers, runtime)

    def receive_mdip_params_file_ex(
        self,
        request: riskplus_models.ReceiveMdipParamsFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ReceiveMdipParamsFileResponse:
        """
        Description: 接受op的文件id,支持外网多源文件上传
        Summary: 接受op的文件id,支持外网多源文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.mdip.params.file.receive',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                receive_mdip_params_file_response = riskplus_models.ReceiveMdipParamsFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return receive_mdip_params_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ReceiveMdipParamsFileResponse(),
            self.do_request('1.0', 'riskplus.mdip.params.file.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def receive_mdip_params_file_ex_async(
        self,
        request: riskplus_models.ReceiveMdipParamsFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ReceiveMdipParamsFileResponse:
        """
        Description: 接受op的文件id,支持外网多源文件上传
        Summary: 接受op的文件id,支持外网多源文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.mdip.params.file.receive',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                receive_mdip_params_file_response = riskplus_models.ReceiveMdipParamsFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return receive_mdip_params_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ReceiveMdipParamsFileResponse(),
            await self.do_request_async('1.0', 'riskplus.mdip.params.file.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def receive_mdip_params_rbbfile(
        self,
        request: riskplus_models.ReceiveMdipParamsRbbfileRequest,
    ) -> riskplus_models.ReceiveMdipParamsRbbfileResponse:
        """
        Description: 接受op的文件id,支持风险大脑文件上传
        Summary: 接受op的文件id,支持风险大脑文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.receive_mdip_params_rbbfile_ex(request, headers, runtime)

    async def receive_mdip_params_rbbfile_async(
        self,
        request: riskplus_models.ReceiveMdipParamsRbbfileRequest,
    ) -> riskplus_models.ReceiveMdipParamsRbbfileResponse:
        """
        Description: 接受op的文件id,支持风险大脑文件上传
        Summary: 接受op的文件id,支持风险大脑文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.receive_mdip_params_rbbfile_ex_async(request, headers, runtime)

    def receive_mdip_params_rbbfile_ex(
        self,
        request: riskplus_models.ReceiveMdipParamsRbbfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ReceiveMdipParamsRbbfileResponse:
        """
        Description: 接受op的文件id,支持风险大脑文件上传
        Summary: 接受op的文件id,支持风险大脑文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.mdip.params.rbbfile.receive',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                receive_mdip_params_rbbfile_response = riskplus_models.ReceiveMdipParamsRbbfileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return receive_mdip_params_rbbfile_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ReceiveMdipParamsRbbfileResponse(),
            self.do_request('1.0', 'riskplus.mdip.params.rbbfile.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def receive_mdip_params_rbbfile_ex_async(
        self,
        request: riskplus_models.ReceiveMdipParamsRbbfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ReceiveMdipParamsRbbfileResponse:
        """
        Description: 接受op的文件id,支持风险大脑文件上传
        Summary: 接受op的文件id,支持风险大脑文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.mdip.params.rbbfile.receive',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                receive_mdip_params_rbbfile_response = riskplus_models.ReceiveMdipParamsRbbfileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return receive_mdip_params_rbbfile_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ReceiveMdipParamsRbbfileResponse(),
            await self.do_request_async('1.0', 'riskplus.mdip.params.rbbfile.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_mdip_audit(
        self,
        request: riskplus_models.CallbackMdipAuditRequest,
    ) -> riskplus_models.CallbackMdipAuditResponse:
        """
        Description: 多源平台审批回调接口
        Summary: 多源平台审批回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_mdip_audit_ex(request, headers, runtime)

    async def callback_mdip_audit_async(
        self,
        request: riskplus_models.CallbackMdipAuditRequest,
    ) -> riskplus_models.CallbackMdipAuditResponse:
        """
        Description: 多源平台审批回调接口
        Summary: 多源平台审批回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_mdip_audit_ex_async(request, headers, runtime)

    def callback_mdip_audit_ex(
        self,
        request: riskplus_models.CallbackMdipAuditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CallbackMdipAuditResponse:
        """
        Description: 多源平台审批回调接口
        Summary: 多源平台审批回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CallbackMdipAuditResponse(),
            self.do_request('1.0', 'riskplus.mdip.audit.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_mdip_audit_ex_async(
        self,
        request: riskplus_models.CallbackMdipAuditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CallbackMdipAuditResponse:
        """
        Description: 多源平台审批回调接口
        Summary: 多源平台审批回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CallbackMdipAuditResponse(),
            await self.do_request_async('1.0', 'riskplus.mdip.audit.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mdip_dataservice_poc(
        self,
        request: riskplus_models.QueryMdipDataservicePocRequest,
    ) -> riskplus_models.QueryMdipDataservicePocResponse:
        """
        Description: 该接口仅限于POC场景下使用， 关键时期会执行限流操作，并且不会通知到上游依赖服务。
        Summary: 多源融合平台的POC数据服务查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mdip_dataservice_poc_ex(request, headers, runtime)

    async def query_mdip_dataservice_poc_async(
        self,
        request: riskplus_models.QueryMdipDataservicePocRequest,
    ) -> riskplus_models.QueryMdipDataservicePocResponse:
        """
        Description: 该接口仅限于POC场景下使用， 关键时期会执行限流操作，并且不会通知到上游依赖服务。
        Summary: 多源融合平台的POC数据服务查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mdip_dataservice_poc_ex_async(request, headers, runtime)

    def query_mdip_dataservice_poc_ex(
        self,
        request: riskplus_models.QueryMdipDataservicePocRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryMdipDataservicePocResponse:
        """
        Description: 该接口仅限于POC场景下使用， 关键时期会执行限流操作，并且不会通知到上游依赖服务。
        Summary: 多源融合平台的POC数据服务查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryMdipDataservicePocResponse(),
            self.do_request('1.0', 'riskplus.mdip.dataservice.poc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mdip_dataservice_poc_ex_async(
        self,
        request: riskplus_models.QueryMdipDataservicePocRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryMdipDataservicePocResponse:
        """
        Description: 该接口仅限于POC场景下使用， 关键时期会执行限流操作，并且不会通知到上游依赖服务。
        Summary: 多源融合平台的POC数据服务查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryMdipDataservicePocResponse(),
            await self.do_request_async('1.0', 'riskplus.mdip.dataservice.poc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_mdip_default_supplier(
        self,
        request: riskplus_models.ListMdipDefaultSupplierRequest,
    ) -> riskplus_models.ListMdipDefaultSupplierResponse:
        """
        Description: 查询默认租户的供应商列表
        Summary: 查询默认租户的供应商列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_mdip_default_supplier_ex(request, headers, runtime)

    async def list_mdip_default_supplier_async(
        self,
        request: riskplus_models.ListMdipDefaultSupplierRequest,
    ) -> riskplus_models.ListMdipDefaultSupplierResponse:
        """
        Description: 查询默认租户的供应商列表
        Summary: 查询默认租户的供应商列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_mdip_default_supplier_ex_async(request, headers, runtime)

    def list_mdip_default_supplier_ex(
        self,
        request: riskplus_models.ListMdipDefaultSupplierRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ListMdipDefaultSupplierResponse:
        """
        Description: 查询默认租户的供应商列表
        Summary: 查询默认租户的供应商列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ListMdipDefaultSupplierResponse(),
            self.do_request('1.0', 'riskplus.mdip.default.supplier.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_mdip_default_supplier_ex_async(
        self,
        request: riskplus_models.ListMdipDefaultSupplierRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ListMdipDefaultSupplierResponse:
        """
        Description: 查询默认租户的供应商列表
        Summary: 查询默认租户的供应商列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ListMdipDefaultSupplierResponse(),
            await self.do_request_async('1.0', 'riskplus.mdip.default.supplier.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_mdip_yunfengdie_params(
        self,
        request: riskplus_models.CallbackMdipYunfengdieParamsRequest,
    ) -> riskplus_models.CallbackMdipYunfengdieParamsResponse:
        """
        Description: 数据回调
        Summary: 云凤蝶回调参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_mdip_yunfengdie_params_ex(request, headers, runtime)

    async def callback_mdip_yunfengdie_params_async(
        self,
        request: riskplus_models.CallbackMdipYunfengdieParamsRequest,
    ) -> riskplus_models.CallbackMdipYunfengdieParamsResponse:
        """
        Description: 数据回调
        Summary: 云凤蝶回调参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_mdip_yunfengdie_params_ex_async(request, headers, runtime)

    def callback_mdip_yunfengdie_params_ex(
        self,
        request: riskplus_models.CallbackMdipYunfengdieParamsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CallbackMdipYunfengdieParamsResponse:
        """
        Description: 数据回调
        Summary: 云凤蝶回调参数
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CallbackMdipYunfengdieParamsResponse(),
            self.do_request('1.0', 'riskplus.mdip.yunfengdie.params.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_mdip_yunfengdie_params_ex_async(
        self,
        request: riskplus_models.CallbackMdipYunfengdieParamsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CallbackMdipYunfengdieParamsResponse:
        """
        Description: 数据回调
        Summary: 云凤蝶回调参数
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CallbackMdipYunfengdieParamsResponse(),
            await self.do_request_async('1.0', 'riskplus.mdip.yunfengdie.params.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_qmp_rt_batchmarketing(
        self,
        request: riskplus_models.ApplyQmpRtBatchmarketingRequest,
    ) -> riskplus_models.ApplyQmpRtBatchmarketingResponse:
        """
        Description: 批量实时触达接口
        Summary: 发起触达任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_qmp_rt_batchmarketing_ex(request, headers, runtime)

    async def apply_qmp_rt_batchmarketing_async(
        self,
        request: riskplus_models.ApplyQmpRtBatchmarketingRequest,
    ) -> riskplus_models.ApplyQmpRtBatchmarketingResponse:
        """
        Description: 批量实时触达接口
        Summary: 发起触达任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_qmp_rt_batchmarketing_ex_async(request, headers, runtime)

    def apply_qmp_rt_batchmarketing_ex(
        self,
        request: riskplus_models.ApplyQmpRtBatchmarketingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyQmpRtBatchmarketingResponse:
        """
        Description: 批量实时触达接口
        Summary: 发起触达任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyQmpRtBatchmarketingResponse(),
            self.do_request('1.0', 'riskplus.qmp.rt.batchmarketing.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_qmp_rt_batchmarketing_ex_async(
        self,
        request: riskplus_models.ApplyQmpRtBatchmarketingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyQmpRtBatchmarketingResponse:
        """
        Description: 批量实时触达接口
        Summary: 发起触达任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyQmpRtBatchmarketingResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.rt.batchmarketing.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_qmp_textsms_batch(
        self,
        request: riskplus_models.SendQmpTextsmsBatchRequest,
    ) -> riskplus_models.SendQmpTextsmsBatchResponse:
        """
        Description: 文本短信批量发送接口
        Summary: 文本短信批量发送接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_qmp_textsms_batch_ex(request, headers, runtime)

    async def send_qmp_textsms_batch_async(
        self,
        request: riskplus_models.SendQmpTextsmsBatchRequest,
    ) -> riskplus_models.SendQmpTextsmsBatchResponse:
        """
        Description: 文本短信批量发送接口
        Summary: 文本短信批量发送接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_qmp_textsms_batch_ex_async(request, headers, runtime)

    def send_qmp_textsms_batch_ex(
        self,
        request: riskplus_models.SendQmpTextsmsBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SendQmpTextsmsBatchResponse:
        """
        Description: 文本短信批量发送接口
        Summary: 文本短信批量发送接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SendQmpTextsmsBatchResponse(),
            self.do_request('1.0', 'riskplus.qmp.textsms.batch.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_qmp_textsms_batch_ex_async(
        self,
        request: riskplus_models.SendQmpTextsmsBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SendQmpTextsmsBatchResponse:
        """
        Description: 文本短信批量发送接口
        Summary: 文本短信批量发送接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SendQmpTextsmsBatchResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.textsms.batch.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_qmp_robotcall(
        self,
        request: riskplus_models.ApplyQmpRobotcallRequest,
    ) -> riskplus_models.ApplyQmpRobotcallResponse:
        """
        Description: 发起AI外呼
        Summary: 发起AI外呼
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_qmp_robotcall_ex(request, headers, runtime)

    async def apply_qmp_robotcall_async(
        self,
        request: riskplus_models.ApplyQmpRobotcallRequest,
    ) -> riskplus_models.ApplyQmpRobotcallResponse:
        """
        Description: 发起AI外呼
        Summary: 发起AI外呼
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_qmp_robotcall_ex_async(request, headers, runtime)

    def apply_qmp_robotcall_ex(
        self,
        request: riskplus_models.ApplyQmpRobotcallRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyQmpRobotcallResponse:
        """
        Description: 发起AI外呼
        Summary: 发起AI外呼
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyQmpRobotcallResponse(),
            self.do_request('1.0', 'riskplus.qmp.robotcall.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_qmp_robotcall_ex_async(
        self,
        request: riskplus_models.ApplyQmpRobotcallRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyQmpRobotcallResponse:
        """
        Description: 发起AI外呼
        Summary: 发起AI外呼
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyQmpRobotcallResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.robotcall.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_qmp_cardsms_batch(
        self,
        request: riskplus_models.SendQmpCardsmsBatchRequest,
    ) -> riskplus_models.SendQmpCardsmsBatchResponse:
        """
        Description: 卡片短信批量发送接口
        Summary: 卡片短信批量发送接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_qmp_cardsms_batch_ex(request, headers, runtime)

    async def send_qmp_cardsms_batch_async(
        self,
        request: riskplus_models.SendQmpCardsmsBatchRequest,
    ) -> riskplus_models.SendQmpCardsmsBatchResponse:
        """
        Description: 卡片短信批量发送接口
        Summary: 卡片短信批量发送接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_qmp_cardsms_batch_ex_async(request, headers, runtime)

    def send_qmp_cardsms_batch_ex(
        self,
        request: riskplus_models.SendQmpCardsmsBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SendQmpCardsmsBatchResponse:
        """
        Description: 卡片短信批量发送接口
        Summary: 卡片短信批量发送接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SendQmpCardsmsBatchResponse(),
            self.do_request('1.0', 'riskplus.qmp.cardsms.batch.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_qmp_cardsms_batch_ex_async(
        self,
        request: riskplus_models.SendQmpCardsmsBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SendQmpCardsmsBatchResponse:
        """
        Description: 卡片短信批量发送接口
        Summary: 卡片短信批量发送接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SendQmpCardsmsBatchResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.cardsms.batch.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_qmp_sms_up(
        self,
        request: riskplus_models.CallbackQmpSmsUpRequest,
    ) -> riskplus_models.CallbackQmpSmsUpResponse:
        """
        Description: 上行短信回调
        Summary: 上行短信回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_qmp_sms_up_ex(request, headers, runtime)

    async def callback_qmp_sms_up_async(
        self,
        request: riskplus_models.CallbackQmpSmsUpRequest,
    ) -> riskplus_models.CallbackQmpSmsUpResponse:
        """
        Description: 上行短信回调
        Summary: 上行短信回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_qmp_sms_up_ex_async(request, headers, runtime)

    def callback_qmp_sms_up_ex(
        self,
        request: riskplus_models.CallbackQmpSmsUpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CallbackQmpSmsUpResponse:
        """
        Description: 上行短信回调
        Summary: 上行短信回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CallbackQmpSmsUpResponse(),
            self.do_request('1.0', 'riskplus.qmp.sms.up.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_qmp_sms_up_ex_async(
        self,
        request: riskplus_models.CallbackQmpSmsUpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CallbackQmpSmsUpResponse:
        """
        Description: 上行短信回调
        Summary: 上行短信回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CallbackQmpSmsUpResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.sms.up.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_qmp_sms_report(
        self,
        request: riskplus_models.CallbackQmpSmsReportRequest,
    ) -> riskplus_models.CallbackQmpSmsReportResponse:
        """
        Description: 短信状态回调接口
        Summary: 短信状态回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_qmp_sms_report_ex(request, headers, runtime)

    async def callback_qmp_sms_report_async(
        self,
        request: riskplus_models.CallbackQmpSmsReportRequest,
    ) -> riskplus_models.CallbackQmpSmsReportResponse:
        """
        Description: 短信状态回调接口
        Summary: 短信状态回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_qmp_sms_report_ex_async(request, headers, runtime)

    def callback_qmp_sms_report_ex(
        self,
        request: riskplus_models.CallbackQmpSmsReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CallbackQmpSmsReportResponse:
        """
        Description: 短信状态回调接口
        Summary: 短信状态回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CallbackQmpSmsReportResponse(),
            self.do_request('1.0', 'riskplus.qmp.sms.report.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_qmp_sms_report_ex_async(
        self,
        request: riskplus_models.CallbackQmpSmsReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CallbackQmpSmsReportResponse:
        """
        Description: 短信状态回调接口
        Summary: 短信状态回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CallbackQmpSmsReportResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.sms.report.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_qmp_digitalsms_batch(
        self,
        request: riskplus_models.SendQmpDigitalsmsBatchRequest,
    ) -> riskplus_models.SendQmpDigitalsmsBatchResponse:
        """
        Description: 数字短信批量发送接口（单模板）
        Summary: 数字短信批量发送接口（单模板）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_qmp_digitalsms_batch_ex(request, headers, runtime)

    async def send_qmp_digitalsms_batch_async(
        self,
        request: riskplus_models.SendQmpDigitalsmsBatchRequest,
    ) -> riskplus_models.SendQmpDigitalsmsBatchResponse:
        """
        Description: 数字短信批量发送接口（单模板）
        Summary: 数字短信批量发送接口（单模板）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_qmp_digitalsms_batch_ex_async(request, headers, runtime)

    def send_qmp_digitalsms_batch_ex(
        self,
        request: riskplus_models.SendQmpDigitalsmsBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SendQmpDigitalsmsBatchResponse:
        """
        Description: 数字短信批量发送接口（单模板）
        Summary: 数字短信批量发送接口（单模板）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SendQmpDigitalsmsBatchResponse(),
            self.do_request('1.0', 'riskplus.qmp.digitalsms.batch.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_qmp_digitalsms_batch_ex_async(
        self,
        request: riskplus_models.SendQmpDigitalsmsBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SendQmpDigitalsmsBatchResponse:
        """
        Description: 数字短信批量发送接口（单模板）
        Summary: 数字短信批量发送接口（单模板）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SendQmpDigitalsmsBatchResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.digitalsms.batch.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_qmp_robotcall(
        self,
        request: riskplus_models.CallbackQmpRobotcallRequest,
    ) -> riskplus_models.CallbackQmpRobotcallResponse:
        """
        Description: 新接入ai外呼服务商的回调接口
        Summary:  ai外呼回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_qmp_robotcall_ex(request, headers, runtime)

    async def callback_qmp_robotcall_async(
        self,
        request: riskplus_models.CallbackQmpRobotcallRequest,
    ) -> riskplus_models.CallbackQmpRobotcallResponse:
        """
        Description: 新接入ai外呼服务商的回调接口
        Summary:  ai外呼回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_qmp_robotcall_ex_async(request, headers, runtime)

    def callback_qmp_robotcall_ex(
        self,
        request: riskplus_models.CallbackQmpRobotcallRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CallbackQmpRobotcallResponse:
        """
        Description: 新接入ai外呼服务商的回调接口
        Summary:  ai外呼回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CallbackQmpRobotcallResponse(),
            self.do_request('1.0', 'riskplus.qmp.robotcall.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_qmp_robotcall_ex_async(
        self,
        request: riskplus_models.CallbackQmpRobotcallRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CallbackQmpRobotcallResponse:
        """
        Description: 新接入ai外呼服务商的回调接口
        Summary:  ai外呼回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CallbackQmpRobotcallResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.robotcall.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_qmp_robotcall_detail(
        self,
        request: riskplus_models.QueryQmpRobotcallDetailRequest,
    ) -> riskplus_models.QueryQmpRobotcallDetailResponse:
        """
        Description: 查询ai外呼任务详情
        Summary:  查询ai外呼任务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_qmp_robotcall_detail_ex(request, headers, runtime)

    async def query_qmp_robotcall_detail_async(
        self,
        request: riskplus_models.QueryQmpRobotcallDetailRequest,
    ) -> riskplus_models.QueryQmpRobotcallDetailResponse:
        """
        Description: 查询ai外呼任务详情
        Summary:  查询ai外呼任务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_qmp_robotcall_detail_ex_async(request, headers, runtime)

    def query_qmp_robotcall_detail_ex(
        self,
        request: riskplus_models.QueryQmpRobotcallDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryQmpRobotcallDetailResponse:
        """
        Description: 查询ai外呼任务详情
        Summary:  查询ai外呼任务详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryQmpRobotcallDetailResponse(),
            self.do_request('1.0', 'riskplus.qmp.robotcall.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_qmp_robotcall_detail_ex_async(
        self,
        request: riskplus_models.QueryQmpRobotcallDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryQmpRobotcallDetailResponse:
        """
        Description: 查询ai外呼任务详情
        Summary:  查询ai外呼任务详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryQmpRobotcallDetailResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.robotcall.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_qmp_dataaccess_statistic(
        self,
        request: riskplus_models.QueryQmpDataaccessStatisticRequest,
    ) -> riskplus_models.QueryQmpDataaccessStatisticResponse:
        """
        Description: 流量风控回执统计查询
        Summary: 流量风控回执统计查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_qmp_dataaccess_statistic_ex(request, headers, runtime)

    async def query_qmp_dataaccess_statistic_async(
        self,
        request: riskplus_models.QueryQmpDataaccessStatisticRequest,
    ) -> riskplus_models.QueryQmpDataaccessStatisticResponse:
        """
        Description: 流量风控回执统计查询
        Summary: 流量风控回执统计查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_qmp_dataaccess_statistic_ex_async(request, headers, runtime)

    def query_qmp_dataaccess_statistic_ex(
        self,
        request: riskplus_models.QueryQmpDataaccessStatisticRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryQmpDataaccessStatisticResponse:
        """
        Description: 流量风控回执统计查询
        Summary: 流量风控回执统计查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryQmpDataaccessStatisticResponse(),
            self.do_request('1.0', 'riskplus.qmp.dataaccess.statistic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_qmp_dataaccess_statistic_ex_async(
        self,
        request: riskplus_models.QueryQmpDataaccessStatisticRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryQmpDataaccessStatisticResponse:
        """
        Description: 流量风控回执统计查询
        Summary: 流量风控回执统计查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryQmpDataaccessStatisticResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.dataaccess.statistic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_qmp_robotcall_statisticinfo(
        self,
        request: riskplus_models.QueryQmpRobotcallStatisticinfoRequest,
    ) -> riskplus_models.QueryQmpRobotcallStatisticinfoResponse:
        """
        Description: 外呼任务统计查询接口
        Summary:  外呼任务统计查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_qmp_robotcall_statisticinfo_ex(request, headers, runtime)

    async def query_qmp_robotcall_statisticinfo_async(
        self,
        request: riskplus_models.QueryQmpRobotcallStatisticinfoRequest,
    ) -> riskplus_models.QueryQmpRobotcallStatisticinfoResponse:
        """
        Description: 外呼任务统计查询接口
        Summary:  外呼任务统计查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_qmp_robotcall_statisticinfo_ex_async(request, headers, runtime)

    def query_qmp_robotcall_statisticinfo_ex(
        self,
        request: riskplus_models.QueryQmpRobotcallStatisticinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryQmpRobotcallStatisticinfoResponse:
        """
        Description: 外呼任务统计查询接口
        Summary:  外呼任务统计查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryQmpRobotcallStatisticinfoResponse(),
            self.do_request('1.0', 'riskplus.qmp.robotcall.statisticinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_qmp_robotcall_statisticinfo_ex_async(
        self,
        request: riskplus_models.QueryQmpRobotcallStatisticinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryQmpRobotcallStatisticinfoResponse:
        """
        Description: 外呼任务统计查询接口
        Summary:  外呼任务统计查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryQmpRobotcallStatisticinfoResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.robotcall.statisticinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_qmp_task_detail(
        self,
        request: riskplus_models.BatchqueryQmpTaskDetailRequest,
    ) -> riskplus_models.BatchqueryQmpTaskDetailResponse:
        """
        Description: 触达执行任务详情查询
        Summary: 触达执行任务详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_qmp_task_detail_ex(request, headers, runtime)

    async def batchquery_qmp_task_detail_async(
        self,
        request: riskplus_models.BatchqueryQmpTaskDetailRequest,
    ) -> riskplus_models.BatchqueryQmpTaskDetailResponse:
        """
        Description: 触达执行任务详情查询
        Summary: 触达执行任务详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_qmp_task_detail_ex_async(request, headers, runtime)

    def batchquery_qmp_task_detail_ex(
        self,
        request: riskplus_models.BatchqueryQmpTaskDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryQmpTaskDetailResponse:
        """
        Description: 触达执行任务详情查询
        Summary: 触达执行任务详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryQmpTaskDetailResponse(),
            self.do_request('1.0', 'riskplus.qmp.task.detail.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_qmp_task_detail_ex_async(
        self,
        request: riskplus_models.BatchqueryQmpTaskDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryQmpTaskDetailResponse:
        """
        Description: 触达执行任务详情查询
        Summary: 触达执行任务详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryQmpTaskDetailResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.task.detail.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_qmp_cardsms_support(
        self,
        request: riskplus_models.QueryQmpCardsmsSupportRequest,
    ) -> riskplus_models.QueryQmpCardsmsSupportResponse:
        """
        Description: 卡片短信支持能力查询
        Summary: 卡片短信支持能力查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_qmp_cardsms_support_ex(request, headers, runtime)

    async def query_qmp_cardsms_support_async(
        self,
        request: riskplus_models.QueryQmpCardsmsSupportRequest,
    ) -> riskplus_models.QueryQmpCardsmsSupportResponse:
        """
        Description: 卡片短信支持能力查询
        Summary: 卡片短信支持能力查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_qmp_cardsms_support_ex_async(request, headers, runtime)

    def query_qmp_cardsms_support_ex(
        self,
        request: riskplus_models.QueryQmpCardsmsSupportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryQmpCardsmsSupportResponse:
        """
        Description: 卡片短信支持能力查询
        Summary: 卡片短信支持能力查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryQmpCardsmsSupportResponse(),
            self.do_request('1.0', 'riskplus.qmp.cardsms.support.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_qmp_cardsms_support_ex_async(
        self,
        request: riskplus_models.QueryQmpCardsmsSupportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryQmpCardsmsSupportResponse:
        """
        Description: 卡片短信支持能力查询
        Summary: 卡片短信支持能力查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryQmpCardsmsSupportResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.cardsms.support.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_qmp_actionplan_detail(
        self,
        request: riskplus_models.BatchqueryQmpActionplanDetailRequest,
    ) -> riskplus_models.BatchqueryQmpActionplanDetailResponse:
        """
        Description: 流量风控查询外呼策略详情
        Summary: 流量风控查询外呼策略详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_qmp_actionplan_detail_ex(request, headers, runtime)

    async def batchquery_qmp_actionplan_detail_async(
        self,
        request: riskplus_models.BatchqueryQmpActionplanDetailRequest,
    ) -> riskplus_models.BatchqueryQmpActionplanDetailResponse:
        """
        Description: 流量风控查询外呼策略详情
        Summary: 流量风控查询外呼策略详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_qmp_actionplan_detail_ex_async(request, headers, runtime)

    def batchquery_qmp_actionplan_detail_ex(
        self,
        request: riskplus_models.BatchqueryQmpActionplanDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryQmpActionplanDetailResponse:
        """
        Description: 流量风控查询外呼策略详情
        Summary: 流量风控查询外呼策略详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryQmpActionplanDetailResponse(),
            self.do_request('1.0', 'riskplus.qmp.actionplan.detail.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_qmp_actionplan_detail_ex_async(
        self,
        request: riskplus_models.BatchqueryQmpActionplanDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryQmpActionplanDetailResponse:
        """
        Description: 流量风控查询外呼策略详情
        Summary: 流量风控查询外呼策略详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryQmpActionplanDetailResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.actionplan.detail.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_qmp_phonenumberstatusforsms(
        self,
        request: riskplus_models.ApplyQmpPhonenumberstatusforsmsRequest,
    ) -> riskplus_models.ApplyQmpPhonenumberstatusforsmsResponse:
        """
        Description: 调用流量风控(原营销盾)空号检测
        Summary: 调用流量风控(原营销盾)空号检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_qmp_phonenumberstatusforsms_ex(request, headers, runtime)

    async def apply_qmp_phonenumberstatusforsms_async(
        self,
        request: riskplus_models.ApplyQmpPhonenumberstatusforsmsRequest,
    ) -> riskplus_models.ApplyQmpPhonenumberstatusforsmsResponse:
        """
        Description: 调用流量风控(原营销盾)空号检测
        Summary: 调用流量风控(原营销盾)空号检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_qmp_phonenumberstatusforsms_ex_async(request, headers, runtime)

    def apply_qmp_phonenumberstatusforsms_ex(
        self,
        request: riskplus_models.ApplyQmpPhonenumberstatusforsmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyQmpPhonenumberstatusforsmsResponse:
        """
        Description: 调用流量风控(原营销盾)空号检测
        Summary: 调用流量风控(原营销盾)空号检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyQmpPhonenumberstatusforsmsResponse(),
            self.do_request('1.0', 'riskplus.qmp.phonenumberstatusforsms.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_qmp_phonenumberstatusforsms_ex_async(
        self,
        request: riskplus_models.ApplyQmpPhonenumberstatusforsmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyQmpPhonenumberstatusforsmsResponse:
        """
        Description: 调用流量风控(原营销盾)空号检测
        Summary: 调用流量风控(原营销盾)空号检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyQmpPhonenumberstatusforsmsResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.phonenumberstatusforsms.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_qmp_tenant_actionplaninfo(
        self,
        request: riskplus_models.BatchqueryQmpTenantActionplaninfoRequest,
    ) -> riskplus_models.BatchqueryQmpTenantActionplaninfoResponse:
        """
        Description: 分页查询租户外呼策略
        Summary: 流量风控租户场景批量信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_qmp_tenant_actionplaninfo_ex(request, headers, runtime)

    async def batchquery_qmp_tenant_actionplaninfo_async(
        self,
        request: riskplus_models.BatchqueryQmpTenantActionplaninfoRequest,
    ) -> riskplus_models.BatchqueryQmpTenantActionplaninfoResponse:
        """
        Description: 分页查询租户外呼策略
        Summary: 流量风控租户场景批量信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_qmp_tenant_actionplaninfo_ex_async(request, headers, runtime)

    def batchquery_qmp_tenant_actionplaninfo_ex(
        self,
        request: riskplus_models.BatchqueryQmpTenantActionplaninfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryQmpTenantActionplaninfoResponse:
        """
        Description: 分页查询租户外呼策略
        Summary: 流量风控租户场景批量信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryQmpTenantActionplaninfoResponse(),
            self.do_request('1.0', 'riskplus.qmp.tenant.actionplaninfo.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_qmp_tenant_actionplaninfo_ex_async(
        self,
        request: riskplus_models.BatchqueryQmpTenantActionplaninfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryQmpTenantActionplaninfoResponse:
        """
        Description: 分页查询租户外呼策略
        Summary: 流量风控租户场景批量信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryQmpTenantActionplaninfoResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.tenant.actionplaninfo.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_qmp_tenant_actionplaninfo(
        self,
        request: riskplus_models.QueryQmpTenantActionplaninfoRequest,
    ) -> riskplus_models.QueryQmpTenantActionplaninfoResponse:
        """
        Description: 流量风控租户场景信息查询
        Summary: 流量风控租户场景信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_qmp_tenant_actionplaninfo_ex(request, headers, runtime)

    async def query_qmp_tenant_actionplaninfo_async(
        self,
        request: riskplus_models.QueryQmpTenantActionplaninfoRequest,
    ) -> riskplus_models.QueryQmpTenantActionplaninfoResponse:
        """
        Description: 流量风控租户场景信息查询
        Summary: 流量风控租户场景信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_qmp_tenant_actionplaninfo_ex_async(request, headers, runtime)

    def query_qmp_tenant_actionplaninfo_ex(
        self,
        request: riskplus_models.QueryQmpTenantActionplaninfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryQmpTenantActionplaninfoResponse:
        """
        Description: 流量风控租户场景信息查询
        Summary: 流量风控租户场景信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryQmpTenantActionplaninfoResponse(),
            self.do_request('1.0', 'riskplus.qmp.tenant.actionplaninfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_qmp_tenant_actionplaninfo_ex_async(
        self,
        request: riskplus_models.QueryQmpTenantActionplaninfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryQmpTenantActionplaninfoResponse:
        """
        Description: 流量风控租户场景信息查询
        Summary: 流量风控租户场景信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryQmpTenantActionplaninfoResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.tenant.actionplaninfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_qmp_cpaassms_template(
        self,
        request: riskplus_models.QueryQmpCpaassmsTemplateRequest,
    ) -> riskplus_models.QueryQmpCpaassmsTemplateResponse:
        """
        Description: 分页查询cpaas短信模板
        Summary: cpaas短信模板分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_qmp_cpaassms_template_ex(request, headers, runtime)

    async def query_qmp_cpaassms_template_async(
        self,
        request: riskplus_models.QueryQmpCpaassmsTemplateRequest,
    ) -> riskplus_models.QueryQmpCpaassmsTemplateResponse:
        """
        Description: 分页查询cpaas短信模板
        Summary: cpaas短信模板分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_qmp_cpaassms_template_ex_async(request, headers, runtime)

    def query_qmp_cpaassms_template_ex(
        self,
        request: riskplus_models.QueryQmpCpaassmsTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryQmpCpaassmsTemplateResponse:
        """
        Description: 分页查询cpaas短信模板
        Summary: cpaas短信模板分页查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryQmpCpaassmsTemplateResponse(),
            self.do_request('1.0', 'riskplus.qmp.cpaassms.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_qmp_cpaassms_template_ex_async(
        self,
        request: riskplus_models.QueryQmpCpaassmsTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryQmpCpaassmsTemplateResponse:
        """
        Description: 分页查询cpaas短信模板
        Summary: cpaas短信模板分页查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryQmpCpaassmsTemplateResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.cpaassms.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_qmp_textsms_template(
        self,
        request: riskplus_models.QueryQmpTextsmsTemplateRequest,
    ) -> riskplus_models.QueryQmpTextsmsTemplateResponse:
        """
        Description: 根据sceneStrategyId分页查询文本短信模板
        Summary: 文本短信模板查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_qmp_textsms_template_ex(request, headers, runtime)

    async def query_qmp_textsms_template_async(
        self,
        request: riskplus_models.QueryQmpTextsmsTemplateRequest,
    ) -> riskplus_models.QueryQmpTextsmsTemplateResponse:
        """
        Description: 根据sceneStrategyId分页查询文本短信模板
        Summary: 文本短信模板查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_qmp_textsms_template_ex_async(request, headers, runtime)

    def query_qmp_textsms_template_ex(
        self,
        request: riskplus_models.QueryQmpTextsmsTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryQmpTextsmsTemplateResponse:
        """
        Description: 根据sceneStrategyId分页查询文本短信模板
        Summary: 文本短信模板查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryQmpTextsmsTemplateResponse(),
            self.do_request('1.0', 'riskplus.qmp.textsms.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_qmp_textsms_template_ex_async(
        self,
        request: riskplus_models.QueryQmpTextsmsTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryQmpTextsmsTemplateResponse:
        """
        Description: 根据sceneStrategyId分页查询文本短信模板
        Summary: 文本短信模板查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryQmpTextsmsTemplateResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.textsms.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_qmp_backflow_event(
        self,
        request: riskplus_models.PushQmpBackflowEventRequest,
    ) -> riskplus_models.PushQmpBackflowEventResponse:
        """
        Description: 蚁盾业务回流事件推送
        Summary: 蚁盾业务回流事件推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_qmp_backflow_event_ex(request, headers, runtime)

    async def push_qmp_backflow_event_async(
        self,
        request: riskplus_models.PushQmpBackflowEventRequest,
    ) -> riskplus_models.PushQmpBackflowEventResponse:
        """
        Description: 蚁盾业务回流事件推送
        Summary: 蚁盾业务回流事件推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_qmp_backflow_event_ex_async(request, headers, runtime)

    def push_qmp_backflow_event_ex(
        self,
        request: riskplus_models.PushQmpBackflowEventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushQmpBackflowEventResponse:
        """
        Description: 蚁盾业务回流事件推送
        Summary: 蚁盾业务回流事件推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushQmpBackflowEventResponse(),
            self.do_request('1.0', 'riskplus.qmp.backflow.event.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_qmp_backflow_event_ex_async(
        self,
        request: riskplus_models.PushQmpBackflowEventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushQmpBackflowEventResponse:
        """
        Description: 蚁盾业务回流事件推送
        Summary: 蚁盾业务回流事件推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushQmpBackflowEventResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.backflow.event.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_qmp_backflow_jsondata(
        self,
        request: riskplus_models.PushQmpBackflowJsondataRequest,
    ) -> riskplus_models.PushQmpBackflowJsondataResponse:
        """
        Description: 蚁盾数据回流推送，用于客户定制json数据
        Summary: 蚁盾数据回流json格式推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_qmp_backflow_jsondata_ex(request, headers, runtime)

    async def push_qmp_backflow_jsondata_async(
        self,
        request: riskplus_models.PushQmpBackflowJsondataRequest,
    ) -> riskplus_models.PushQmpBackflowJsondataResponse:
        """
        Description: 蚁盾数据回流推送，用于客户定制json数据
        Summary: 蚁盾数据回流json格式推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_qmp_backflow_jsondata_ex_async(request, headers, runtime)

    def push_qmp_backflow_jsondata_ex(
        self,
        request: riskplus_models.PushQmpBackflowJsondataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushQmpBackflowJsondataResponse:
        """
        Description: 蚁盾数据回流推送，用于客户定制json数据
        Summary: 蚁盾数据回流json格式推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushQmpBackflowJsondataResponse(),
            self.do_request('1.0', 'riskplus.qmp.backflow.jsondata.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_qmp_backflow_jsondata_ex_async(
        self,
        request: riskplus_models.PushQmpBackflowJsondataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushQmpBackflowJsondataResponse:
        """
        Description: 蚁盾数据回流推送，用于客户定制json数据
        Summary: 蚁盾数据回流json格式推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushQmpBackflowJsondataResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.backflow.jsondata.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_qmp_rt_mixedmarketing(
        self,
        request: riskplus_models.BatchqueryQmpRtMixedmarketingRequest,
    ) -> riskplus_models.BatchqueryQmpRtMixedmarketingResponse:
        """
        Description: 智选平台混合策略批量分层服务
        Summary: 智选平台-混合策略批量分层服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_qmp_rt_mixedmarketing_ex(request, headers, runtime)

    async def batchquery_qmp_rt_mixedmarketing_async(
        self,
        request: riskplus_models.BatchqueryQmpRtMixedmarketingRequest,
    ) -> riskplus_models.BatchqueryQmpRtMixedmarketingResponse:
        """
        Description: 智选平台混合策略批量分层服务
        Summary: 智选平台-混合策略批量分层服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_qmp_rt_mixedmarketing_ex_async(request, headers, runtime)

    def batchquery_qmp_rt_mixedmarketing_ex(
        self,
        request: riskplus_models.BatchqueryQmpRtMixedmarketingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryQmpRtMixedmarketingResponse:
        """
        Description: 智选平台混合策略批量分层服务
        Summary: 智选平台-混合策略批量分层服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryQmpRtMixedmarketingResponse(),
            self.do_request('1.0', 'riskplus.qmp.rt.mixedmarketing.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_qmp_rt_mixedmarketing_ex_async(
        self,
        request: riskplus_models.BatchqueryQmpRtMixedmarketingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryQmpRtMixedmarketingResponse:
        """
        Description: 智选平台混合策略批量分层服务
        Summary: 智选平台-混合策略批量分层服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryQmpRtMixedmarketingResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.rt.mixedmarketing.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_qmp_offlinehostplan(
        self,
        request: riskplus_models.UploadQmpOfflinehostplanRequest,
    ) -> riskplus_models.UploadQmpOfflinehostplanResponse:
        """
        Description: 11
        Summary: qmp离线托管文件导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_qmp_offlinehostplan_ex(request, headers, runtime)

    async def upload_qmp_offlinehostplan_async(
        self,
        request: riskplus_models.UploadQmpOfflinehostplanRequest,
    ) -> riskplus_models.UploadQmpOfflinehostplanResponse:
        """
        Description: 11
        Summary: qmp离线托管文件导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_qmp_offlinehostplan_ex_async(request, headers, runtime)

    def upload_qmp_offlinehostplan_ex(
        self,
        request: riskplus_models.UploadQmpOfflinehostplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UploadQmpOfflinehostplanResponse:
        """
        Description: 11
        Summary: qmp离线托管文件导入
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.qmp.offlinehostplan.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_qmp_offlinehostplan_response = riskplus_models.UploadQmpOfflinehostplanResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_qmp_offlinehostplan_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UploadQmpOfflinehostplanResponse(),
            self.do_request('1.0', 'riskplus.qmp.offlinehostplan.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_qmp_offlinehostplan_ex_async(
        self,
        request: riskplus_models.UploadQmpOfflinehostplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UploadQmpOfflinehostplanResponse:
        """
        Description: 11
        Summary: qmp离线托管文件导入
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.qmp.offlinehostplan.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_qmp_offlinehostplan_response = riskplus_models.UploadQmpOfflinehostplanResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_qmp_offlinehostplan_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UploadQmpOfflinehostplanResponse(),
            await self.do_request_async('1.0', 'riskplus.qmp.offlinehostplan.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_rdaas_tax_authinfo(
        self,
        request: riskplus_models.SyncRdaasTaxAuthinfoRequest,
    ) -> riskplus_models.SyncRdaasTaxAuthinfoResponse:
        """
        Description: 企管盾票税交接授权信息表的同步
        Summary: 企管盾票税交接授权信息表的同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_rdaas_tax_authinfo_ex(request, headers, runtime)

    async def sync_rdaas_tax_authinfo_async(
        self,
        request: riskplus_models.SyncRdaasTaxAuthinfoRequest,
    ) -> riskplus_models.SyncRdaasTaxAuthinfoResponse:
        """
        Description: 企管盾票税交接授权信息表的同步
        Summary: 企管盾票税交接授权信息表的同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_rdaas_tax_authinfo_ex_async(request, headers, runtime)

    def sync_rdaas_tax_authinfo_ex(
        self,
        request: riskplus_models.SyncRdaasTaxAuthinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SyncRdaasTaxAuthinfoResponse:
        """
        Description: 企管盾票税交接授权信息表的同步
        Summary: 企管盾票税交接授权信息表的同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SyncRdaasTaxAuthinfoResponse(),
            self.do_request('1.0', 'riskplus.rdaas.tax.authinfo.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_rdaas_tax_authinfo_ex_async(
        self,
        request: riskplus_models.SyncRdaasTaxAuthinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SyncRdaasTaxAuthinfoResponse:
        """
        Description: 企管盾票税交接授权信息表的同步
        Summary: 企管盾票税交接授权信息表的同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SyncRdaasTaxAuthinfoResponse(),
            await self.do_request_async('1.0', 'riskplus.rdaas.tax.authinfo.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_rdaas_tax_authorder(
        self,
        request: riskplus_models.SyncRdaasTaxAuthorderRequest,
    ) -> riskplus_models.SyncRdaasTaxAuthorderResponse:
        """
        Description: 企管盾票税交接授权记录表的同步
        Summary: 企管盾票税交接授权记录表的同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_rdaas_tax_authorder_ex(request, headers, runtime)

    async def sync_rdaas_tax_authorder_async(
        self,
        request: riskplus_models.SyncRdaasTaxAuthorderRequest,
    ) -> riskplus_models.SyncRdaasTaxAuthorderResponse:
        """
        Description: 企管盾票税交接授权记录表的同步
        Summary: 企管盾票税交接授权记录表的同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_rdaas_tax_authorder_ex_async(request, headers, runtime)

    def sync_rdaas_tax_authorder_ex(
        self,
        request: riskplus_models.SyncRdaasTaxAuthorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SyncRdaasTaxAuthorderResponse:
        """
        Description: 企管盾票税交接授权记录表的同步
        Summary: 企管盾票税交接授权记录表的同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SyncRdaasTaxAuthorderResponse(),
            self.do_request('1.0', 'riskplus.rdaas.tax.authorder.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_rdaas_tax_authorder_ex_async(
        self,
        request: riskplus_models.SyncRdaasTaxAuthorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SyncRdaasTaxAuthorderResponse:
        """
        Description: 企管盾票税交接授权记录表的同步
        Summary: 企管盾票税交接授权记录表的同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SyncRdaasTaxAuthorderResponse(),
            await self.do_request_async('1.0', 'riskplus.rdaas.tax.authorder.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_rdaas_tax_callback(
        self,
        request: riskplus_models.NotifyRdaasTaxCallbackRequest,
    ) -> riskplus_models.NotifyRdaasTaxCallbackResponse:
        """
        Description: 企管盾票税交接回调通知
        Summary: 企管盾票税交接回调通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_rdaas_tax_callback_ex(request, headers, runtime)

    async def notify_rdaas_tax_callback_async(
        self,
        request: riskplus_models.NotifyRdaasTaxCallbackRequest,
    ) -> riskplus_models.NotifyRdaasTaxCallbackResponse:
        """
        Description: 企管盾票税交接回调通知
        Summary: 企管盾票税交接回调通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_rdaas_tax_callback_ex_async(request, headers, runtime)

    def notify_rdaas_tax_callback_ex(
        self,
        request: riskplus_models.NotifyRdaasTaxCallbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.NotifyRdaasTaxCallbackResponse:
        """
        Description: 企管盾票税交接回调通知
        Summary: 企管盾票税交接回调通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.NotifyRdaasTaxCallbackResponse(),
            self.do_request('1.0', 'riskplus.rdaas.tax.callback.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_rdaas_tax_callback_ex_async(
        self,
        request: riskplus_models.NotifyRdaasTaxCallbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.NotifyRdaasTaxCallbackResponse:
        """
        Description: 企管盾票税交接回调通知
        Summary: 企管盾票税交接回调通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.NotifyRdaasTaxCallbackResponse(),
            await self.do_request_async('1.0', 'riskplus.rdaas.tax.callback.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rdaas_tax_rpadecisionservice(
        self,
        request: riskplus_models.QueryRdaasTaxRpadecisionserviceRequest,
    ) -> riskplus_models.QueryRdaasTaxRpadecisionserviceResponse:
        """
        Description: 企管盾票税交接RPA决策服务查询
        Summary: 企管盾票税交接RPA决策服务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rdaas_tax_rpadecisionservice_ex(request, headers, runtime)

    async def query_rdaas_tax_rpadecisionservice_async(
        self,
        request: riskplus_models.QueryRdaasTaxRpadecisionserviceRequest,
    ) -> riskplus_models.QueryRdaasTaxRpadecisionserviceResponse:
        """
        Description: 企管盾票税交接RPA决策服务查询
        Summary: 企管盾票税交接RPA决策服务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rdaas_tax_rpadecisionservice_ex_async(request, headers, runtime)

    def query_rdaas_tax_rpadecisionservice_ex(
        self,
        request: riskplus_models.QueryRdaasTaxRpadecisionserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRdaasTaxRpadecisionserviceResponse:
        """
        Description: 企管盾票税交接RPA决策服务查询
        Summary: 企管盾票税交接RPA决策服务查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRdaasTaxRpadecisionserviceResponse(),
            self.do_request('1.0', 'riskplus.rdaas.tax.rpadecisionservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rdaas_tax_rpadecisionservice_ex_async(
        self,
        request: riskplus_models.QueryRdaasTaxRpadecisionserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRdaasTaxRpadecisionserviceResponse:
        """
        Description: 企管盾票税交接RPA决策服务查询
        Summary: 企管盾票税交接RPA决策服务查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRdaasTaxRpadecisionserviceResponse(),
            await self.do_request_async('1.0', 'riskplus.rdaas.tax.rpadecisionservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rdaas_tax_rpadecisionindicator(
        self,
        request: riskplus_models.QueryRdaasTaxRpadecisionindicatorRequest,
    ) -> riskplus_models.QueryRdaasTaxRpadecisionindicatorResponse:
        """
        Description: 企管盾票税交接RPA决策服务指标查询
        Summary: 企管盾票税交接RPA决策服务指标查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rdaas_tax_rpadecisionindicator_ex(request, headers, runtime)

    async def query_rdaas_tax_rpadecisionindicator_async(
        self,
        request: riskplus_models.QueryRdaasTaxRpadecisionindicatorRequest,
    ) -> riskplus_models.QueryRdaasTaxRpadecisionindicatorResponse:
        """
        Description: 企管盾票税交接RPA决策服务指标查询
        Summary: 企管盾票税交接RPA决策服务指标查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rdaas_tax_rpadecisionindicator_ex_async(request, headers, runtime)

    def query_rdaas_tax_rpadecisionindicator_ex(
        self,
        request: riskplus_models.QueryRdaasTaxRpadecisionindicatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRdaasTaxRpadecisionindicatorResponse:
        """
        Description: 企管盾票税交接RPA决策服务指标查询
        Summary: 企管盾票税交接RPA决策服务指标查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRdaasTaxRpadecisionindicatorResponse(),
            self.do_request('1.0', 'riskplus.rdaas.tax.rpadecisionindicator.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rdaas_tax_rpadecisionindicator_ex_async(
        self,
        request: riskplus_models.QueryRdaasTaxRpadecisionindicatorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRdaasTaxRpadecisionindicatorResponse:
        """
        Description: 企管盾票税交接RPA决策服务指标查询
        Summary: 企管盾票税交接RPA决策服务指标查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRdaasTaxRpadecisionindicatorResponse(),
            await self.do_request_async('1.0', 'riskplus.rdaas.tax.rpadecisionindicator.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rdaas_tax_simpleauthdecision(
        self,
        request: riskplus_models.QueryRdaasTaxSimpleauthdecisionRequest,
    ) -> riskplus_models.QueryRdaasTaxSimpleauthdecisionResponse:
        """
        Description: 企管盾票税交接要素授权决策查询
        Summary: 企管盾票税交接要素授权决策查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rdaas_tax_simpleauthdecision_ex(request, headers, runtime)

    async def query_rdaas_tax_simpleauthdecision_async(
        self,
        request: riskplus_models.QueryRdaasTaxSimpleauthdecisionRequest,
    ) -> riskplus_models.QueryRdaasTaxSimpleauthdecisionResponse:
        """
        Description: 企管盾票税交接要素授权决策查询
        Summary: 企管盾票税交接要素授权决策查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rdaas_tax_simpleauthdecision_ex_async(request, headers, runtime)

    def query_rdaas_tax_simpleauthdecision_ex(
        self,
        request: riskplus_models.QueryRdaasTaxSimpleauthdecisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRdaasTaxSimpleauthdecisionResponse:
        """
        Description: 企管盾票税交接要素授权决策查询
        Summary: 企管盾票税交接要素授权决策查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRdaasTaxSimpleauthdecisionResponse(),
            self.do_request('1.0', 'riskplus.rdaas.tax.simpleauthdecision.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rdaas_tax_simpleauthdecision_ex_async(
        self,
        request: riskplus_models.QueryRdaasTaxSimpleauthdecisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRdaasTaxSimpleauthdecisionResponse:
        """
        Description: 企管盾票税交接要素授权决策查询
        Summary: 企管盾票税交接要素授权决策查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRdaasTaxSimpleauthdecisionResponse(),
            await self.do_request_async('1.0', 'riskplus.rdaas.tax.simpleauthdecision.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def receive_rfc_params_file(
        self,
        request: riskplus_models.ReceiveRfcParamsFileRequest,
    ) -> riskplus_models.ReceiveRfcParamsFileResponse:
        """
        Description: rfc外部文件上传
        Summary: rfc外部文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.receive_rfc_params_file_ex(request, headers, runtime)

    async def receive_rfc_params_file_async(
        self,
        request: riskplus_models.ReceiveRfcParamsFileRequest,
    ) -> riskplus_models.ReceiveRfcParamsFileResponse:
        """
        Description: rfc外部文件上传
        Summary: rfc外部文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.receive_rfc_params_file_ex_async(request, headers, runtime)

    def receive_rfc_params_file_ex(
        self,
        request: riskplus_models.ReceiveRfcParamsFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ReceiveRfcParamsFileResponse:
        """
        Description: rfc外部文件上传
        Summary: rfc外部文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.rfc.params.file.receive',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                receive_rfc_params_file_response = riskplus_models.ReceiveRfcParamsFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return receive_rfc_params_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ReceiveRfcParamsFileResponse(),
            self.do_request('1.0', 'riskplus.rfc.params.file.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def receive_rfc_params_file_ex_async(
        self,
        request: riskplus_models.ReceiveRfcParamsFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ReceiveRfcParamsFileResponse:
        """
        Description: rfc外部文件上传
        Summary: rfc外部文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.rfc.params.file.receive',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                receive_rfc_params_file_response = riskplus_models.ReceiveRfcParamsFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return receive_rfc_params_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ReceiveRfcParamsFileResponse(),
            await self.do_request_async('1.0', 'riskplus.rfc.params.file.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_rfc_aibound_file(
        self,
        request: riskplus_models.UploadRfcAiboundFileRequest,
    ) -> riskplus_models.UploadRfcAiboundFileResponse:
        """
        Description: rfc外呼名单文件上传接口
        Summary: rfc外呼名单上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_rfc_aibound_file_ex(request, headers, runtime)

    async def upload_rfc_aibound_file_async(
        self,
        request: riskplus_models.UploadRfcAiboundFileRequest,
    ) -> riskplus_models.UploadRfcAiboundFileResponse:
        """
        Description: rfc外呼名单文件上传接口
        Summary: rfc外呼名单上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_rfc_aibound_file_ex_async(request, headers, runtime)

    def upload_rfc_aibound_file_ex(
        self,
        request: riskplus_models.UploadRfcAiboundFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UploadRfcAiboundFileResponse:
        """
        Description: rfc外呼名单文件上传接口
        Summary: rfc外呼名单上传接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.rfc.aibound.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_rfc_aibound_file_response = riskplus_models.UploadRfcAiboundFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_rfc_aibound_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UploadRfcAiboundFileResponse(),
            self.do_request('1.0', 'riskplus.rfc.aibound.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_rfc_aibound_file_ex_async(
        self,
        request: riskplus_models.UploadRfcAiboundFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UploadRfcAiboundFileResponse:
        """
        Description: rfc外呼名单文件上传接口
        Summary: rfc外呼名单上传接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.rfc.aibound.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_rfc_aibound_file_response = riskplus_models.UploadRfcAiboundFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_rfc_aibound_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UploadRfcAiboundFileResponse(),
            await self.do_request_async('1.0', 'riskplus.rfc.aibound.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rfc_odps_lindorm(
        self,
        request: riskplus_models.QueryRfcOdpsLindormRequest,
    ) -> riskplus_models.QueryRfcOdpsLindormResponse:
        """
        Description: 提供给外部的数据服务接口内容获取
        Summary: 提供给外部的数据服务接口内容获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rfc_odps_lindorm_ex(request, headers, runtime)

    async def query_rfc_odps_lindorm_async(
        self,
        request: riskplus_models.QueryRfcOdpsLindormRequest,
    ) -> riskplus_models.QueryRfcOdpsLindormResponse:
        """
        Description: 提供给外部的数据服务接口内容获取
        Summary: 提供给外部的数据服务接口内容获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rfc_odps_lindorm_ex_async(request, headers, runtime)

    def query_rfc_odps_lindorm_ex(
        self,
        request: riskplus_models.QueryRfcOdpsLindormRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRfcOdpsLindormResponse:
        """
        Description: 提供给外部的数据服务接口内容获取
        Summary: 提供给外部的数据服务接口内容获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRfcOdpsLindormResponse(),
            self.do_request('1.0', 'riskplus.rfc.odps.lindorm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rfc_odps_lindorm_ex_async(
        self,
        request: riskplus_models.QueryRfcOdpsLindormRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRfcOdpsLindormResponse:
        """
        Description: 提供给外部的数据服务接口内容获取
        Summary: 提供给外部的数据服务接口内容获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRfcOdpsLindormResponse(),
            await self.do_request_async('1.0', 'riskplus.rfc.odps.lindorm.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
        return TeaCore.from_map(
            riskplus_models.QueryRbbGenericInvokeResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRbbGenericInvokeResponse(),
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
        return TeaCore.from_map(
            riskplus_models.CreateRbbTokenResponse(),
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
        return TeaCore.from_map(
            riskplus_models.CreateRbbTokenResponse(),
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
        return TeaCore.from_map(
            riskplus_models.CreateRbbApiGwtokenResponse(),
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
        return TeaCore.from_map(
            riskplus_models.CreateRbbApiGwtokenResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRbbGeneralResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRbbGeneralResponse(),
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
        return TeaCore.from_map(
            riskplus_models.GetRbbLoginTokenResponse(),
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
        return TeaCore.from_map(
            riskplus_models.GetRbbLoginTokenResponse(),
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
        return TeaCore.from_map(
            riskplus_models.CreateRbbTenantResponse(),
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
        return TeaCore.from_map(
            riskplus_models.CreateRbbTenantResponse(),
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
        return TeaCore.from_map(
            riskplus_models.CreateRbbUserResponse(),
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
        return TeaCore.from_map(
            riskplus_models.CreateRbbUserResponse(),
            await self.do_request_async('1.0', 'riskplus.rbb.user.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_rbb_company_guard(
        self,
        request: riskplus_models.ExecRbbCompanyGuardRequest,
    ) -> riskplus_models.ExecRbbCompanyGuardResponse:
        """
        Description: 企业准入接口
        Summary: 企业准入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_rbb_company_guard_ex(request, headers, runtime)

    async def exec_rbb_company_guard_async(
        self,
        request: riskplus_models.ExecRbbCompanyGuardRequest,
    ) -> riskplus_models.ExecRbbCompanyGuardResponse:
        """
        Description: 企业准入接口
        Summary: 企业准入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_rbb_company_guard_ex_async(request, headers, runtime)

    def exec_rbb_company_guard_ex(
        self,
        request: riskplus_models.ExecRbbCompanyGuardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ExecRbbCompanyGuardResponse:
        """
        Description: 企业准入接口
        Summary: 企业准入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ExecRbbCompanyGuardResponse(),
            self.do_request('1.0', 'riskplus.rbb.company.guard.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_rbb_company_guard_ex_async(
        self,
        request: riskplus_models.ExecRbbCompanyGuardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ExecRbbCompanyGuardResponse:
        """
        Description: 企业准入接口
        Summary: 企业准入
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ExecRbbCompanyGuardResponse(),
            await self.do_request_async('1.0', 'riskplus.rbb.company.guard.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_rbb_company_credit(
        self,
        request: riskplus_models.ApplyRbbCompanyCreditRequest,
    ) -> riskplus_models.ApplyRbbCompanyCreditResponse:
        """
        Description: 提交授信申请
        Summary: 企业授信申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_rbb_company_credit_ex(request, headers, runtime)

    async def apply_rbb_company_credit_async(
        self,
        request: riskplus_models.ApplyRbbCompanyCreditRequest,
    ) -> riskplus_models.ApplyRbbCompanyCreditResponse:
        """
        Description: 提交授信申请
        Summary: 企业授信申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_rbb_company_credit_ex_async(request, headers, runtime)

    def apply_rbb_company_credit_ex(
        self,
        request: riskplus_models.ApplyRbbCompanyCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyRbbCompanyCreditResponse:
        """
        Description: 提交授信申请
        Summary: 企业授信申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyRbbCompanyCreditResponse(),
            self.do_request('1.0', 'riskplus.rbb.company.credit.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_rbb_company_credit_ex_async(
        self,
        request: riskplus_models.ApplyRbbCompanyCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyRbbCompanyCreditResponse:
        """
        Description: 提交授信申请
        Summary: 企业授信申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyRbbCompanyCreditResponse(),
            await self.do_request_async('1.0', 'riskplus.rbb.company.credit.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rbb_company_credit(
        self,
        request: riskplus_models.QueryRbbCompanyCreditRequest,
    ) -> riskplus_models.QueryRbbCompanyCreditResponse:
        """
        Description: 查询企业授信结果
        Summary: 企业授信结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rbb_company_credit_ex(request, headers, runtime)

    async def query_rbb_company_credit_async(
        self,
        request: riskplus_models.QueryRbbCompanyCreditRequest,
    ) -> riskplus_models.QueryRbbCompanyCreditResponse:
        """
        Description: 查询企业授信结果
        Summary: 企业授信结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rbb_company_credit_ex_async(request, headers, runtime)

    def query_rbb_company_credit_ex(
        self,
        request: riskplus_models.QueryRbbCompanyCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRbbCompanyCreditResponse:
        """
        Description: 查询企业授信结果
        Summary: 企业授信结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRbbCompanyCreditResponse(),
            self.do_request('1.0', 'riskplus.rbb.company.credit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rbb_company_credit_ex_async(
        self,
        request: riskplus_models.QueryRbbCompanyCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRbbCompanyCreditResponse:
        """
        Description: 查询企业授信结果
        Summary: 企业授信结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRbbCompanyCreditResponse(),
            await self.do_request_async('1.0', 'riskplus.rbb.company.credit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rbb_regdatasync_prepared(
        self,
        request: riskplus_models.QueryRbbRegdatasyncPreparedRequest,
    ) -> riskplus_models.QueryRbbRegdatasyncPreparedResponse:
        """
        Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
        Summary: 风险大脑-上交所数据离线同步数据准备状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rbb_regdatasync_prepared_ex(request, headers, runtime)

    async def query_rbb_regdatasync_prepared_async(
        self,
        request: riskplus_models.QueryRbbRegdatasyncPreparedRequest,
    ) -> riskplus_models.QueryRbbRegdatasyncPreparedResponse:
        """
        Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
        Summary: 风险大脑-上交所数据离线同步数据准备状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rbb_regdatasync_prepared_ex_async(request, headers, runtime)

    def query_rbb_regdatasync_prepared_ex(
        self,
        request: riskplus_models.QueryRbbRegdatasyncPreparedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRbbRegdatasyncPreparedResponse:
        """
        Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
        Summary: 风险大脑-上交所数据离线同步数据准备状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRbbRegdatasyncPreparedResponse(),
            self.do_request('1.0', 'riskplus.rbb.regdatasync.prepared.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rbb_regdatasync_prepared_ex_async(
        self,
        request: riskplus_models.QueryRbbRegdatasyncPreparedRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRbbRegdatasyncPreparedResponse:
        """
        Description: 风险大脑-上交所数据离线同步数据准备状态，上交所本地部署鹰眼项目需要获取离线数据是否准备好的信息
        Summary: 风险大脑-上交所数据离线同步数据准备状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRbbRegdatasyncPreparedResponse(),
            await self.do_request_async('1.0', 'riskplus.rbb.regdatasync.prepared.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_rbb_regdatasync_schedule(
        self,
        request: riskplus_models.StartRbbRegdatasyncScheduleRequest,
    ) -> riskplus_models.StartRbbRegdatasyncScheduleResponse:
        """
        Description: 风险大脑-上交所数据离线同步数据开始通知标识
        Summary: 风险大脑-上交所数据离线同步数据开始通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_rbb_regdatasync_schedule_ex(request, headers, runtime)

    async def start_rbb_regdatasync_schedule_async(
        self,
        request: riskplus_models.StartRbbRegdatasyncScheduleRequest,
    ) -> riskplus_models.StartRbbRegdatasyncScheduleResponse:
        """
        Description: 风险大脑-上交所数据离线同步数据开始通知标识
        Summary: 风险大脑-上交所数据离线同步数据开始通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_rbb_regdatasync_schedule_ex_async(request, headers, runtime)

    def start_rbb_regdatasync_schedule_ex(
        self,
        request: riskplus_models.StartRbbRegdatasyncScheduleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.StartRbbRegdatasyncScheduleResponse:
        """
        Description: 风险大脑-上交所数据离线同步数据开始通知标识
        Summary: 风险大脑-上交所数据离线同步数据开始通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.StartRbbRegdatasyncScheduleResponse(),
            self.do_request('1.0', 'riskplus.rbb.regdatasync.schedule.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_rbb_regdatasync_schedule_ex_async(
        self,
        request: riskplus_models.StartRbbRegdatasyncScheduleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.StartRbbRegdatasyncScheduleResponse:
        """
        Description: 风险大脑-上交所数据离线同步数据开始通知标识
        Summary: 风险大脑-上交所数据离线同步数据开始通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.StartRbbRegdatasyncScheduleResponse(),
            await self.do_request_async('1.0', 'riskplus.rbb.regdatasync.schedule.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def finish_rbb_regdatasync_schedule(
        self,
        request: riskplus_models.FinishRbbRegdatasyncScheduleRequest,
    ) -> riskplus_models.FinishRbbRegdatasyncScheduleResponse:
        """
        Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
        Summary: 风险大脑-上交所数据离线同步数据完成记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.finish_rbb_regdatasync_schedule_ex(request, headers, runtime)

    async def finish_rbb_regdatasync_schedule_async(
        self,
        request: riskplus_models.FinishRbbRegdatasyncScheduleRequest,
    ) -> riskplus_models.FinishRbbRegdatasyncScheduleResponse:
        """
        Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
        Summary: 风险大脑-上交所数据离线同步数据完成记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.finish_rbb_regdatasync_schedule_ex_async(request, headers, runtime)

    def finish_rbb_regdatasync_schedule_ex(
        self,
        request: riskplus_models.FinishRbbRegdatasyncScheduleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.FinishRbbRegdatasyncScheduleResponse:
        """
        Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
        Summary: 风险大脑-上交所数据离线同步数据完成记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.FinishRbbRegdatasyncScheduleResponse(),
            self.do_request('1.0', 'riskplus.rbb.regdatasync.schedule.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def finish_rbb_regdatasync_schedule_ex_async(
        self,
        request: riskplus_models.FinishRbbRegdatasyncScheduleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.FinishRbbRegdatasyncScheduleResponse:
        """
        Description: 风险大脑-上交所数据离线同步数据完成记录 记录完成的状态
        Summary: 风险大脑-上交所数据离线同步数据完成记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.FinishRbbRegdatasyncScheduleResponse(),
            await self.do_request_async('1.0', 'riskplus.rbb.regdatasync.schedule.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_rbb_company_guard(
        self,
        request: riskplus_models.ApplyRbbCompanyGuardRequest,
    ) -> riskplus_models.ApplyRbbCompanyGuardResponse:
        """
        Description: 提交准入规则的执行请求
        Summary: 企业准入申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_rbb_company_guard_ex(request, headers, runtime)

    async def apply_rbb_company_guard_async(
        self,
        request: riskplus_models.ApplyRbbCompanyGuardRequest,
    ) -> riskplus_models.ApplyRbbCompanyGuardResponse:
        """
        Description: 提交准入规则的执行请求
        Summary: 企业准入申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_rbb_company_guard_ex_async(request, headers, runtime)

    def apply_rbb_company_guard_ex(
        self,
        request: riskplus_models.ApplyRbbCompanyGuardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyRbbCompanyGuardResponse:
        """
        Description: 提交准入规则的执行请求
        Summary: 企业准入申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyRbbCompanyGuardResponse(),
            self.do_request('1.0', 'riskplus.rbb.company.guard.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_rbb_company_guard_ex_async(
        self,
        request: riskplus_models.ApplyRbbCompanyGuardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyRbbCompanyGuardResponse:
        """
        Description: 提交准入规则的执行请求
        Summary: 企业准入申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyRbbCompanyGuardResponse(),
            await self.do_request_async('1.0', 'riskplus.rbb.company.guard.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rbb_company_guard(
        self,
        request: riskplus_models.QueryRbbCompanyGuardRequest,
    ) -> riskplus_models.QueryRbbCompanyGuardResponse:
        """
        Description: 企业准入结果查询
        Summary: 企业准入结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rbb_company_guard_ex(request, headers, runtime)

    async def query_rbb_company_guard_async(
        self,
        request: riskplus_models.QueryRbbCompanyGuardRequest,
    ) -> riskplus_models.QueryRbbCompanyGuardResponse:
        """
        Description: 企业准入结果查询
        Summary: 企业准入结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rbb_company_guard_ex_async(request, headers, runtime)

    def query_rbb_company_guard_ex(
        self,
        request: riskplus_models.QueryRbbCompanyGuardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRbbCompanyGuardResponse:
        """
        Description: 企业准入结果查询
        Summary: 企业准入结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRbbCompanyGuardResponse(),
            self.do_request('1.0', 'riskplus.rbb.company.guard.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rbb_company_guard_ex_async(
        self,
        request: riskplus_models.QueryRbbCompanyGuardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRbbCompanyGuardResponse:
        """
        Description: 企业准入结果查询
        Summary: 企业准入结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRbbCompanyGuardResponse(),
            await self.do_request_async('1.0', 'riskplus.rbb.company.guard.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rbb_obts_zsearch(
        self,
        request: riskplus_models.QueryRbbObtsZsearchRequest,
    ) -> riskplus_models.QueryRbbObtsZsearchResponse:
        """
        Description: 企业风控给上交所鹰眼使用的zsearch查询
        Summary: 企业风控给鹰眼使用的zsearch查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rbb_obts_zsearch_ex(request, headers, runtime)

    async def query_rbb_obts_zsearch_async(
        self,
        request: riskplus_models.QueryRbbObtsZsearchRequest,
    ) -> riskplus_models.QueryRbbObtsZsearchResponse:
        """
        Description: 企业风控给上交所鹰眼使用的zsearch查询
        Summary: 企业风控给鹰眼使用的zsearch查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rbb_obts_zsearch_ex_async(request, headers, runtime)

    def query_rbb_obts_zsearch_ex(
        self,
        request: riskplus_models.QueryRbbObtsZsearchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRbbObtsZsearchResponse:
        """
        Description: 企业风控给上交所鹰眼使用的zsearch查询
        Summary: 企业风控给鹰眼使用的zsearch查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRbbObtsZsearchResponse(),
            self.do_request('1.0', 'riskplus.rbb.obts.zsearch.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rbb_obts_zsearch_ex_async(
        self,
        request: riskplus_models.QueryRbbObtsZsearchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRbbObtsZsearchResponse:
        """
        Description: 企业风控给上交所鹰眼使用的zsearch查询
        Summary: 企业风控给鹰眼使用的zsearch查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRbbObtsZsearchResponse(),
            await self.do_request_async('1.0', 'riskplus.rbb.obts.zsearch.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_rbb_customer_companyinfo(
        self,
        request: riskplus_models.PushRbbCustomerCompanyinfoRequest,
    ) -> riskplus_models.PushRbbCustomerCompanyinfoResponse:
        """
        Description: 企业风控客户推送的企业信息
        Summary: 企业风控客户推送的企业信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_rbb_customer_companyinfo_ex(request, headers, runtime)

    async def push_rbb_customer_companyinfo_async(
        self,
        request: riskplus_models.PushRbbCustomerCompanyinfoRequest,
    ) -> riskplus_models.PushRbbCustomerCompanyinfoResponse:
        """
        Description: 企业风控客户推送的企业信息
        Summary: 企业风控客户推送的企业信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_rbb_customer_companyinfo_ex_async(request, headers, runtime)

    def push_rbb_customer_companyinfo_ex(
        self,
        request: riskplus_models.PushRbbCustomerCompanyinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushRbbCustomerCompanyinfoResponse:
        """
        Description: 企业风控客户推送的企业信息
        Summary: 企业风控客户推送的企业信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushRbbCustomerCompanyinfoResponse(),
            self.do_request('1.0', 'riskplus.rbb.customer.companyinfo.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_rbb_customer_companyinfo_ex_async(
        self,
        request: riskplus_models.PushRbbCustomerCompanyinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushRbbCustomerCompanyinfoResponse:
        """
        Description: 企业风控客户推送的企业信息
        Summary: 企业风控客户推送的企业信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushRbbCustomerCompanyinfoResponse(),
            await self.do_request_async('1.0', 'riskplus.rbb.customer.companyinfo.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_rbb_file_amap(
        self,
        request: riskplus_models.UploadRbbFileAmapRequest,
    ) -> riskplus_models.UploadRbbFileAmapResponse:
        """
        Description: 企管盾给高德的文件上传，用于小微店铺分
        Summary: 企管盾给高德的文件上传，用于小微店铺分
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_rbb_file_amap_ex(request, headers, runtime)

    async def upload_rbb_file_amap_async(
        self,
        request: riskplus_models.UploadRbbFileAmapRequest,
    ) -> riskplus_models.UploadRbbFileAmapResponse:
        """
        Description: 企管盾给高德的文件上传，用于小微店铺分
        Summary: 企管盾给高德的文件上传，用于小微店铺分
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_rbb_file_amap_ex_async(request, headers, runtime)

    def upload_rbb_file_amap_ex(
        self,
        request: riskplus_models.UploadRbbFileAmapRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UploadRbbFileAmapResponse:
        """
        Description: 企管盾给高德的文件上传，用于小微店铺分
        Summary: 企管盾给高德的文件上传，用于小微店铺分
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.rbb.file.amap.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_rbb_file_amap_response = riskplus_models.UploadRbbFileAmapResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_rbb_file_amap_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UploadRbbFileAmapResponse(),
            self.do_request('1.0', 'riskplus.rbb.file.amap.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_rbb_file_amap_ex_async(
        self,
        request: riskplus_models.UploadRbbFileAmapRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UploadRbbFileAmapResponse:
        """
        Description: 企管盾给高德的文件上传，用于小微店铺分
        Summary: 企管盾给高德的文件上传，用于小微店铺分
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.rbb.file.amap.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_rbb_file_amap_response = riskplus_models.UploadRbbFileAmapResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_rbb_file_amap_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UploadRbbFileAmapResponse(),
            await self.do_request_async('1.0', 'riskplus.rbb.file.amap.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_rbb_credit(
        self,
        request: riskplus_models.OperateRbbCreditRequest,
    ) -> riskplus_models.OperateRbbCreditResponse:
        """
        Description: 信贷操作接口
        Summary: 信贷操作接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_rbb_credit_ex(request, headers, runtime)

    async def operate_rbb_credit_async(
        self,
        request: riskplus_models.OperateRbbCreditRequest,
    ) -> riskplus_models.OperateRbbCreditResponse:
        """
        Description: 信贷操作接口
        Summary: 信贷操作接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_rbb_credit_ex_async(request, headers, runtime)

    def operate_rbb_credit_ex(
        self,
        request: riskplus_models.OperateRbbCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.OperateRbbCreditResponse:
        """
        Description: 信贷操作接口
        Summary: 信贷操作接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.OperateRbbCreditResponse(),
            self.do_request('1.0', 'riskplus.rbb.credit.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_rbb_credit_ex_async(
        self,
        request: riskplus_models.OperateRbbCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.OperateRbbCreditResponse:
        """
        Description: 信贷操作接口
        Summary: 信贷操作接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.OperateRbbCreditResponse(),
            await self.do_request_async('1.0', 'riskplus.rbb.credit.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_rbb_customer_information(
        self,
        request: riskplus_models.PushRbbCustomerInformationRequest,
    ) -> riskplus_models.PushRbbCustomerInformationResponse:
        """
        Description: 获取客户信息
        Summary: 获取客户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_rbb_customer_information_ex(request, headers, runtime)

    async def push_rbb_customer_information_async(
        self,
        request: riskplus_models.PushRbbCustomerInformationRequest,
    ) -> riskplus_models.PushRbbCustomerInformationResponse:
        """
        Description: 获取客户信息
        Summary: 获取客户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_rbb_customer_information_ex_async(request, headers, runtime)

    def push_rbb_customer_information_ex(
        self,
        request: riskplus_models.PushRbbCustomerInformationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushRbbCustomerInformationResponse:
        """
        Description: 获取客户信息
        Summary: 获取客户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushRbbCustomerInformationResponse(),
            self.do_request('1.0', 'riskplus.rbb.customer.information.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_rbb_customer_information_ex_async(
        self,
        request: riskplus_models.PushRbbCustomerInformationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushRbbCustomerInformationResponse:
        """
        Description: 获取客户信息
        Summary: 获取客户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushRbbCustomerInformationResponse(),
            await self.do_request_async('1.0', 'riskplus.rbb.customer.information.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_rbb_taxinvoice_data(
        self,
        request: riskplus_models.GetRbbTaxinvoiceDataRequest,
    ) -> riskplus_models.GetRbbTaxinvoiceDataResponse:
        """
        Description: 获取税票授权数据
        Summary: 获取税票授权数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_rbb_taxinvoice_data_ex(request, headers, runtime)

    async def get_rbb_taxinvoice_data_async(
        self,
        request: riskplus_models.GetRbbTaxinvoiceDataRequest,
    ) -> riskplus_models.GetRbbTaxinvoiceDataResponse:
        """
        Description: 获取税票授权数据
        Summary: 获取税票授权数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_rbb_taxinvoice_data_ex_async(request, headers, runtime)

    def get_rbb_taxinvoice_data_ex(
        self,
        request: riskplus_models.GetRbbTaxinvoiceDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.GetRbbTaxinvoiceDataResponse:
        """
        Description: 获取税票授权数据
        Summary: 获取税票授权数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.GetRbbTaxinvoiceDataResponse(),
            self.do_request('1.0', 'riskplus.rbb.taxinvoice.data.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_rbb_taxinvoice_data_ex_async(
        self,
        request: riskplus_models.GetRbbTaxinvoiceDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.GetRbbTaxinvoiceDataResponse:
        """
        Description: 获取税票授权数据
        Summary: 获取税票授权数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.GetRbbTaxinvoiceDataResponse(),
            await self.do_request_async('1.0', 'riskplus.rbb.taxinvoice.data.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_rbb_customer_status(
        self,
        request: riskplus_models.PushRbbCustomerStatusRequest,
    ) -> riskplus_models.PushRbbCustomerStatusResponse:
        """
        Description: 客户实时状态通知
        Summary: 客户实时状态通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_rbb_customer_status_ex(request, headers, runtime)

    async def push_rbb_customer_status_async(
        self,
        request: riskplus_models.PushRbbCustomerStatusRequest,
    ) -> riskplus_models.PushRbbCustomerStatusResponse:
        """
        Description: 客户实时状态通知
        Summary: 客户实时状态通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_rbb_customer_status_ex_async(request, headers, runtime)

    def push_rbb_customer_status_ex(
        self,
        request: riskplus_models.PushRbbCustomerStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushRbbCustomerStatusResponse:
        """
        Description: 客户实时状态通知
        Summary: 客户实时状态通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushRbbCustomerStatusResponse(),
            self.do_request('1.0', 'riskplus.rbb.customer.status.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_rbb_customer_status_ex_async(
        self,
        request: riskplus_models.PushRbbCustomerStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushRbbCustomerStatusResponse:
        """
        Description: 客户实时状态通知
        Summary: 客户实时状态通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushRbbCustomerStatusResponse(),
            await self.do_request_async('1.0', 'riskplus.rbb.customer.status.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_rbb_invoice_charge(
        self,
        request: riskplus_models.PushRbbInvoiceChargeRequest,
    ) -> riskplus_models.PushRbbInvoiceChargeResponse:
        """
        Description: 票税计费处理推送，由票税侧请求
        Summary: 票税计费处理推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_rbb_invoice_charge_ex(request, headers, runtime)

    async def push_rbb_invoice_charge_async(
        self,
        request: riskplus_models.PushRbbInvoiceChargeRequest,
    ) -> riskplus_models.PushRbbInvoiceChargeResponse:
        """
        Description: 票税计费处理推送，由票税侧请求
        Summary: 票税计费处理推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_rbb_invoice_charge_ex_async(request, headers, runtime)

    def push_rbb_invoice_charge_ex(
        self,
        request: riskplus_models.PushRbbInvoiceChargeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushRbbInvoiceChargeResponse:
        """
        Description: 票税计费处理推送，由票税侧请求
        Summary: 票税计费处理推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushRbbInvoiceChargeResponse(),
            self.do_request('1.0', 'riskplus.rbb.invoice.charge.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_rbb_invoice_charge_ex_async(
        self,
        request: riskplus_models.PushRbbInvoiceChargeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushRbbInvoiceChargeResponse:
        """
        Description: 票税计费处理推送，由票税侧请求
        Summary: 票税计费处理推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushRbbInvoiceChargeResponse(),
            await self.do_request_async('1.0', 'riskplus.rbb.invoice.charge.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def receive_rbb_params_file(
        self,
        request: riskplus_models.ReceiveRbbParamsFileRequest,
    ) -> riskplus_models.ReceiveRbbParamsFileResponse:
        """
        Description: 通过接口进行报告上传
        Summary: 征信报告上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.receive_rbb_params_file_ex(request, headers, runtime)

    async def receive_rbb_params_file_async(
        self,
        request: riskplus_models.ReceiveRbbParamsFileRequest,
    ) -> riskplus_models.ReceiveRbbParamsFileResponse:
        """
        Description: 通过接口进行报告上传
        Summary: 征信报告上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.receive_rbb_params_file_ex_async(request, headers, runtime)

    def receive_rbb_params_file_ex(
        self,
        request: riskplus_models.ReceiveRbbParamsFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ReceiveRbbParamsFileResponse:
        """
        Description: 通过接口进行报告上传
        Summary: 征信报告上传接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.rbb.params.file.receive',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                receive_rbb_params_file_response = riskplus_models.ReceiveRbbParamsFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return receive_rbb_params_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ReceiveRbbParamsFileResponse(),
            self.do_request('1.0', 'riskplus.rbb.params.file.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def receive_rbb_params_file_ex_async(
        self,
        request: riskplus_models.ReceiveRbbParamsFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ReceiveRbbParamsFileResponse:
        """
        Description: 通过接口进行报告上传
        Summary: 征信报告上传接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.rbb.params.file.receive',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                receive_rbb_params_file_response = riskplus_models.ReceiveRbbParamsFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return receive_rbb_params_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ReceiveRbbParamsFileResponse(),
            await self.do_request_async('1.0', 'riskplus.rbb.params.file.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_rpaas_report_answer(
        self,
        request: riskplus_models.PushRpaasReportAnswerRequest,
    ) -> riskplus_models.PushRpaasReportAnswerResponse:
        """
        Description: 报告结果推送，算法调用
        Summary: 报告结果推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_rpaas_report_answer_ex(request, headers, runtime)

    async def push_rpaas_report_answer_async(
        self,
        request: riskplus_models.PushRpaasReportAnswerRequest,
    ) -> riskplus_models.PushRpaasReportAnswerResponse:
        """
        Description: 报告结果推送，算法调用
        Summary: 报告结果推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_rpaas_report_answer_ex_async(request, headers, runtime)

    def push_rpaas_report_answer_ex(
        self,
        request: riskplus_models.PushRpaasReportAnswerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushRpaasReportAnswerResponse:
        """
        Description: 报告结果推送，算法调用
        Summary: 报告结果推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushRpaasReportAnswerResponse(),
            self.do_request('1.0', 'riskplus.rpaas.report.answer.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_rpaas_report_answer_ex_async(
        self,
        request: riskplus_models.PushRpaasReportAnswerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushRpaasReportAnswerResponse:
        """
        Description: 报告结果推送，算法调用
        Summary: 报告结果推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushRpaasReportAnswerResponse(),
            await self.do_request_async('1.0', 'riskplus.rpaas.report.answer.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rpaas_open_service(
        self,
        request: riskplus_models.QueryRpaasOpenServiceRequest,
    ) -> riskplus_models.QueryRpaasOpenServiceResponse:
        """
        Description: 企管盾云开放平台服务调用
        Summary: 企管盾云开放平台服务调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rpaas_open_service_ex(request, headers, runtime)

    async def query_rpaas_open_service_async(
        self,
        request: riskplus_models.QueryRpaasOpenServiceRequest,
    ) -> riskplus_models.QueryRpaasOpenServiceResponse:
        """
        Description: 企管盾云开放平台服务调用
        Summary: 企管盾云开放平台服务调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rpaas_open_service_ex_async(request, headers, runtime)

    def query_rpaas_open_service_ex(
        self,
        request: riskplus_models.QueryRpaasOpenServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRpaasOpenServiceResponse:
        """
        Description: 企管盾云开放平台服务调用
        Summary: 企管盾云开放平台服务调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRpaasOpenServiceResponse(),
            self.do_request('1.0', 'riskplus.rpaas.open.service.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rpaas_open_service_ex_async(
        self,
        request: riskplus_models.QueryRpaasOpenServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRpaasOpenServiceResponse:
        """
        Description: 企管盾云开放平台服务调用
        Summary: 企管盾云开放平台服务调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRpaasOpenServiceResponse(),
            await self.do_request_async('1.0', 'riskplus.rpaas.open.service.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rpgw_sign_url(
        self,
        request: riskplus_models.QueryRpgwSignUrlRequest,
    ) -> riskplus_models.QueryRpgwSignUrlResponse:
        """
        Description: 获取签约接口
        Summary: 获取签约接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rpgw_sign_url_ex(request, headers, runtime)

    async def query_rpgw_sign_url_async(
        self,
        request: riskplus_models.QueryRpgwSignUrlRequest,
    ) -> riskplus_models.QueryRpgwSignUrlResponse:
        """
        Description: 获取签约接口
        Summary: 获取签约接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rpgw_sign_url_ex_async(request, headers, runtime)

    def query_rpgw_sign_url_ex(
        self,
        request: riskplus_models.QueryRpgwSignUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRpgwSignUrlResponse:
        """
        Description: 获取签约接口
        Summary: 获取签约接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRpgwSignUrlResponse(),
            self.do_request('1.0', 'riskplus.rpgw.sign.url.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rpgw_sign_url_ex_async(
        self,
        request: riskplus_models.QueryRpgwSignUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRpgwSignUrlResponse:
        """
        Description: 获取签约接口
        Summary: 获取签约接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRpgwSignUrlResponse(),
            await self.do_request_async('1.0', 'riskplus.rpgw.sign.url.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_rpgw_user_einvoice(
        self,
        request: riskplus_models.RegisterRpgwUserEinvoiceRequest,
    ) -> riskplus_models.RegisterRpgwUserEinvoiceResponse:
        """
        Description: 创建报税用户接口
        Summary: 创建报税用户接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_rpgw_user_einvoice_ex(request, headers, runtime)

    async def register_rpgw_user_einvoice_async(
        self,
        request: riskplus_models.RegisterRpgwUserEinvoiceRequest,
    ) -> riskplus_models.RegisterRpgwUserEinvoiceResponse:
        """
        Description: 创建报税用户接口
        Summary: 创建报税用户接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_rpgw_user_einvoice_ex_async(request, headers, runtime)

    def register_rpgw_user_einvoice_ex(
        self,
        request: riskplus_models.RegisterRpgwUserEinvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.RegisterRpgwUserEinvoiceResponse:
        """
        Description: 创建报税用户接口
        Summary: 创建报税用户接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.RegisterRpgwUserEinvoiceResponse(),
            self.do_request('1.0', 'riskplus.rpgw.user.einvoice.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_rpgw_user_einvoice_ex_async(
        self,
        request: riskplus_models.RegisterRpgwUserEinvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.RegisterRpgwUserEinvoiceResponse:
        """
        Description: 创建报税用户接口
        Summary: 创建报税用户接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.RegisterRpgwUserEinvoiceResponse(),
            await self.do_request_async('1.0', 'riskplus.rpgw.user.einvoice.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_rpgw_user_signurl(
        self,
        request: riskplus_models.QueryRpgwUserSignurlRequest,
    ) -> riskplus_models.QueryRpgwUserSignurlResponse:
        """
        Description: 查询签约接口
        Summary: 获取签约接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_rpgw_user_signurl_ex(request, headers, runtime)

    async def query_rpgw_user_signurl_async(
        self,
        request: riskplus_models.QueryRpgwUserSignurlRequest,
    ) -> riskplus_models.QueryRpgwUserSignurlResponse:
        """
        Description: 查询签约接口
        Summary: 获取签约接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_rpgw_user_signurl_ex_async(request, headers, runtime)

    def query_rpgw_user_signurl_ex(
        self,
        request: riskplus_models.QueryRpgwUserSignurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRpgwUserSignurlResponse:
        """
        Description: 查询签约接口
        Summary: 获取签约接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRpgwUserSignurlResponse(),
            self.do_request('1.0', 'riskplus.rpgw.user.signurl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_rpgw_user_signurl_ex_async(
        self,
        request: riskplus_models.QueryRpgwUserSignurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryRpgwUserSignurlResponse:
        """
        Description: 查询签约接口
        Summary: 获取签约接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryRpgwUserSignurlResponse(),
            await self.do_request_async('1.0', 'riskplus.rpgw.user.signurl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def withdraw_rpgw_user_commission(
        self,
        request: riskplus_models.WithdrawRpgwUserCommissionRequest,
    ) -> riskplus_models.WithdrawRpgwUserCommissionResponse:
        """
        Description: 提现
        Summary: 提现
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.withdraw_rpgw_user_commission_ex(request, headers, runtime)

    async def withdraw_rpgw_user_commission_async(
        self,
        request: riskplus_models.WithdrawRpgwUserCommissionRequest,
    ) -> riskplus_models.WithdrawRpgwUserCommissionResponse:
        """
        Description: 提现
        Summary: 提现
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.withdraw_rpgw_user_commission_ex_async(request, headers, runtime)

    def withdraw_rpgw_user_commission_ex(
        self,
        request: riskplus_models.WithdrawRpgwUserCommissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.WithdrawRpgwUserCommissionResponse:
        """
        Description: 提现
        Summary: 提现
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.WithdrawRpgwUserCommissionResponse(),
            self.do_request('1.0', 'riskplus.rpgw.user.commission.withdraw', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def withdraw_rpgw_user_commission_ex_async(
        self,
        request: riskplus_models.WithdrawRpgwUserCommissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.WithdrawRpgwUserCommissionResponse:
        """
        Description: 提现
        Summary: 提现
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.WithdrawRpgwUserCommissionResponse(),
            await self.do_request_async('1.0', 'riskplus.rpgw.user.commission.withdraw', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_rpgw_user_orderinfo(
        self,
        request: riskplus_models.SyncRpgwUserOrderinfoRequest,
    ) -> riskplus_models.SyncRpgwUserOrderinfoResponse:
        """
        Description: 信息同步
        Summary: 下单等信息同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_rpgw_user_orderinfo_ex(request, headers, runtime)

    async def sync_rpgw_user_orderinfo_async(
        self,
        request: riskplus_models.SyncRpgwUserOrderinfoRequest,
    ) -> riskplus_models.SyncRpgwUserOrderinfoResponse:
        """
        Description: 信息同步
        Summary: 下单等信息同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_rpgw_user_orderinfo_ex_async(request, headers, runtime)

    def sync_rpgw_user_orderinfo_ex(
        self,
        request: riskplus_models.SyncRpgwUserOrderinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SyncRpgwUserOrderinfoResponse:
        """
        Description: 信息同步
        Summary: 下单等信息同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SyncRpgwUserOrderinfoResponse(),
            self.do_request('1.0', 'riskplus.rpgw.user.orderinfo.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_rpgw_user_orderinfo_ex_async(
        self,
        request: riskplus_models.SyncRpgwUserOrderinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SyncRpgwUserOrderinfoResponse:
        """
        Description: 信息同步
        Summary: 下单等信息同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SyncRpgwUserOrderinfoResponse(),
            await self.do_request_async('1.0', 'riskplus.rpgw.user.orderinfo.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_rpgw_user_signresult(
        self,
        request: riskplus_models.NotifyRpgwUserSignresultRequest,
    ) -> riskplus_models.NotifyRpgwUserSignresultResponse:
        """
        Description: 签约结果通知
        Summary: 签约结果通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_rpgw_user_signresult_ex(request, headers, runtime)

    async def notify_rpgw_user_signresult_async(
        self,
        request: riskplus_models.NotifyRpgwUserSignresultRequest,
    ) -> riskplus_models.NotifyRpgwUserSignresultResponse:
        """
        Description: 签约结果通知
        Summary: 签约结果通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_rpgw_user_signresult_ex_async(request, headers, runtime)

    def notify_rpgw_user_signresult_ex(
        self,
        request: riskplus_models.NotifyRpgwUserSignresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.NotifyRpgwUserSignresultResponse:
        """
        Description: 签约结果通知
        Summary: 签约结果通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.NotifyRpgwUserSignresultResponse(),
            self.do_request('1.0', 'riskplus.rpgw.user.signresult.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_rpgw_user_signresult_ex_async(
        self,
        request: riskplus_models.NotifyRpgwUserSignresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.NotifyRpgwUserSignresultResponse:
        """
        Description: 签约结果通知
        Summary: 签约结果通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.NotifyRpgwUserSignresultResponse(),
            await self.do_request_async('1.0', 'riskplus.rpgw.user.signresult.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCompanyOpinionResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCompanyOpinionResponse(),
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
        return TeaCore.from_map(
            riskplus_models.ListRtopCompanyOpinionsResponse(),
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
        return TeaCore.from_map(
            riskplus_models.ListRtopCompanyOpinionsResponse(),
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
        return TeaCore.from_map(
            riskplus_models.GetRtopCompanyMonitorResponse(),
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
        return TeaCore.from_map(
            riskplus_models.GetRtopCompanyMonitorResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCrowdriskStatisticResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCrowdriskStatisticResponse(),
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
        return TeaCore.from_map(
            riskplus_models.ListRtopCrowdriskResponse(),
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
        return TeaCore.from_map(
            riskplus_models.ListRtopCrowdriskResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCrowdriskDetailResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCrowdriskDetailResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopRiskstormResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopRiskstormResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCrowdriskSumResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCrowdriskSumResponse(),
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
        return TeaCore.from_map(
            riskplus_models.GetRtopCompanyDetailResponse(),
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
        return TeaCore.from_map(
            riskplus_models.GetRtopCompanyDetailResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCompanyRiskinfoResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCompanyRiskinfoResponse(),
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
        return TeaCore.from_map(
            riskplus_models.ExecRtopGenericInvokeResponse(),
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
        return TeaCore.from_map(
            riskplus_models.ExecRtopGenericInvokeResponse(),
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
        return TeaCore.from_map(
            riskplus_models.CreateRtopTokenResponse(),
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
        return TeaCore.from_map(
            riskplus_models.CreateRtopTokenResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopRisklabelResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopRisklabelResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCompanyResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCompanyResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopRisklabelFilterResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopRisklabelFilterResponse(),
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
        return TeaCore.from_map(
            riskplus_models.PullRegtechNewsResponse(),
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
        return TeaCore.from_map(
            riskplus_models.PullRegtechNewsResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCompanyFeedbackResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCompanyFeedbackResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCompanyAlarmResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCompanyAlarmResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCompanyRiskyResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCompanyRiskyResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCompanyListResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCompanyListResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopRisklabelConfigResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopRisklabelConfigResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCompanyRiskResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopCompanyRiskResponse(),
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
        return TeaCore.from_map(
            riskplus_models.ListRtopCompanyRelatedResponse(),
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
        return TeaCore.from_map(
            riskplus_models.ListRtopCompanyRelatedResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopTagImageResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRtopTagImageResponse(),
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
        return TeaCore.from_map(
            riskplus_models.ListRtopStarCompanyResponse(),
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
        return TeaCore.from_map(
            riskplus_models.ListRtopStarCompanyResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRpSecurityPolicyResponse(),
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
        return TeaCore.from_map(
            riskplus_models.QueryRpSecurityPolicyResponse(),
            await self.do_request_async('1.0', 'riskplus.rp.security.policy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_snapshot_event(
        self,
        request: riskplus_models.QuerySnapshotEventRequest,
    ) -> riskplus_models.QuerySnapshotEventResponse:
        """
        Description: 风控快照查询
        Summary: 风控事件快照查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_snapshot_event_ex(request, headers, runtime)

    async def query_snapshot_event_async(
        self,
        request: riskplus_models.QuerySnapshotEventRequest,
    ) -> riskplus_models.QuerySnapshotEventResponse:
        """
        Description: 风控快照查询
        Summary: 风控事件快照查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_snapshot_event_ex_async(request, headers, runtime)

    def query_snapshot_event_ex(
        self,
        request: riskplus_models.QuerySnapshotEventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QuerySnapshotEventResponse:
        """
        Description: 风控快照查询
        Summary: 风控事件快照查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QuerySnapshotEventResponse(),
            self.do_request('1.0', 'riskplus.snapshot.event.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_snapshot_event_ex_async(
        self,
        request: riskplus_models.QuerySnapshotEventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QuerySnapshotEventResponse:
        """
        Description: 风控快照查询
        Summary: 风控事件快照查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QuerySnapshotEventResponse(),
            await self.do_request_async('1.0', 'riskplus.snapshot.event.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_tdisaas_security_policy(
        self,
        request: riskplus_models.QueryTdisaasSecurityPolicyRequest,
    ) -> riskplus_models.QueryTdisaasSecurityPolicyResponse:
        """
        Description: saas风险咨询，决策流模式
        Summary: saas风险咨询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_tdisaas_security_policy_ex(request, headers, runtime)

    async def query_tdisaas_security_policy_async(
        self,
        request: riskplus_models.QueryTdisaasSecurityPolicyRequest,
    ) -> riskplus_models.QueryTdisaasSecurityPolicyResponse:
        """
        Description: saas风险咨询，决策流模式
        Summary: saas风险咨询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_tdisaas_security_policy_ex_async(request, headers, runtime)

    def query_tdisaas_security_policy_ex(
        self,
        request: riskplus_models.QueryTdisaasSecurityPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryTdisaasSecurityPolicyResponse:
        """
        Description: saas风险咨询，决策流模式
        Summary: saas风险咨询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryTdisaasSecurityPolicyResponse(),
            self.do_request('1.0', 'riskplus.tdisaas.security.policy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_tdisaas_security_policy_ex_async(
        self,
        request: riskplus_models.QueryTdisaasSecurityPolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryTdisaasSecurityPolicyResponse:
        """
        Description: saas风险咨询，决策流模式
        Summary: saas风险咨询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryTdisaasSecurityPolicyResponse(),
            await self.do_request_async('1.0', 'riskplus.tdisaas.security.policy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_umkt_params_file(
        self,
        request: riskplus_models.UploadUmktParamsFileRequest,
    ) -> riskplus_models.UploadUmktParamsFileResponse:
        """
        Description: 营销盾批量参数文件上传接口
        Summary: 营销盾参数文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_umkt_params_file_ex(request, headers, runtime)

    async def upload_umkt_params_file_async(
        self,
        request: riskplus_models.UploadUmktParamsFileRequest,
    ) -> riskplus_models.UploadUmktParamsFileResponse:
        """
        Description: 营销盾批量参数文件上传接口
        Summary: 营销盾参数文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_umkt_params_file_ex_async(request, headers, runtime)

    def upload_umkt_params_file_ex(
        self,
        request: riskplus_models.UploadUmktParamsFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UploadUmktParamsFileResponse:
        """
        Description: 营销盾批量参数文件上传接口
        Summary: 营销盾参数文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.umkt.params.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_umkt_params_file_response = riskplus_models.UploadUmktParamsFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_umkt_params_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UploadUmktParamsFileResponse(),
            self.do_request('1.0', 'riskplus.umkt.params.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_umkt_params_file_ex_async(
        self,
        request: riskplus_models.UploadUmktParamsFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UploadUmktParamsFileResponse:
        """
        Description: 营销盾批量参数文件上传接口
        Summary: 营销盾参数文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.umkt.params.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_umkt_params_file_response = riskplus_models.UploadUmktParamsFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_umkt_params_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UploadUmktParamsFileResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.params.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_umkt_rt_marketing(
        self,
        request: riskplus_models.BatchqueryUmktRtMarketingRequest,
    ) -> riskplus_models.BatchqueryUmktRtMarketingResponse:
        """
        Description: 营销盾实时营销服务，支持批量
        Summary: 营销盾实时营销服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_umkt_rt_marketing_ex(request, headers, runtime)

    async def batchquery_umkt_rt_marketing_async(
        self,
        request: riskplus_models.BatchqueryUmktRtMarketingRequest,
    ) -> riskplus_models.BatchqueryUmktRtMarketingResponse:
        """
        Description: 营销盾实时营销服务，支持批量
        Summary: 营销盾实时营销服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_umkt_rt_marketing_ex_async(request, headers, runtime)

    def batchquery_umkt_rt_marketing_ex(
        self,
        request: riskplus_models.BatchqueryUmktRtMarketingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryUmktRtMarketingResponse:
        """
        Description: 营销盾实时营销服务，支持批量
        Summary: 营销盾实时营销服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryUmktRtMarketingResponse(),
            self.do_request('1.0', 'riskplus.umkt.rt.marketing.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_umkt_rt_marketing_ex_async(
        self,
        request: riskplus_models.BatchqueryUmktRtMarketingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryUmktRtMarketingResponse:
        """
        Description: 营销盾实时营销服务，支持批量
        Summary: 营销盾实时营销服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryUmktRtMarketingResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.rt.marketing.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_umkt_rt_eventresult(
        self,
        request: riskplus_models.SyncUmktRtEventresultRequest,
    ) -> riskplus_models.SyncUmktRtEventresultResponse:
        """
        Description: 梦网富信投放事件通知
        Summary: 梦网富信投放事件通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_umkt_rt_eventresult_ex(request, headers, runtime)

    async def sync_umkt_rt_eventresult_async(
        self,
        request: riskplus_models.SyncUmktRtEventresultRequest,
    ) -> riskplus_models.SyncUmktRtEventresultResponse:
        """
        Description: 梦网富信投放事件通知
        Summary: 梦网富信投放事件通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_umkt_rt_eventresult_ex_async(request, headers, runtime)

    def sync_umkt_rt_eventresult_ex(
        self,
        request: riskplus_models.SyncUmktRtEventresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SyncUmktRtEventresultResponse:
        """
        Description: 梦网富信投放事件通知
        Summary: 梦网富信投放事件通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SyncUmktRtEventresultResponse(),
            self.do_request('1.0', 'riskplus.umkt.rt.eventresult.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_umkt_rt_eventresult_ex_async(
        self,
        request: riskplus_models.SyncUmktRtEventresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SyncUmktRtEventresultResponse:
        """
        Description: 梦网富信投放事件通知
        Summary: 梦网富信投放事件通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SyncUmktRtEventresultResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.rt.eventresult.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_umkt_scene_upload(
        self,
        request: riskplus_models.ImportUmktSceneUploadRequest,
    ) -> riskplus_models.ImportUmktSceneUploadResponse:
        """
        Description: 营销盾场景租户信息上传or更新
        Summary: 营销盾场景租户信息上传or更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_umkt_scene_upload_ex(request, headers, runtime)

    async def import_umkt_scene_upload_async(
        self,
        request: riskplus_models.ImportUmktSceneUploadRequest,
    ) -> riskplus_models.ImportUmktSceneUploadResponse:
        """
        Description: 营销盾场景租户信息上传or更新
        Summary: 营销盾场景租户信息上传or更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_umkt_scene_upload_ex_async(request, headers, runtime)

    def import_umkt_scene_upload_ex(
        self,
        request: riskplus_models.ImportUmktSceneUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ImportUmktSceneUploadResponse:
        """
        Description: 营销盾场景租户信息上传or更新
        Summary: 营销盾场景租户信息上传or更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ImportUmktSceneUploadResponse(),
            self.do_request('1.0', 'riskplus.umkt.scene.upload.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_umkt_scene_upload_ex_async(
        self,
        request: riskplus_models.ImportUmktSceneUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ImportUmktSceneUploadResponse:
        """
        Description: 营销盾场景租户信息上传or更新
        Summary: 营销盾场景租户信息上传or更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ImportUmktSceneUploadResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.scene.upload.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_umkt_rt_tailmarketing(
        self,
        request: riskplus_models.BatchqueryUmktRtTailmarketingRequest,
    ) -> riskplus_models.BatchqueryUmktRtTailmarketingResponse:
        """
        Description: 富信贴尾实时圈客
        Summary: 富信贴尾实时圈客
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_umkt_rt_tailmarketing_ex(request, headers, runtime)

    async def batchquery_umkt_rt_tailmarketing_async(
        self,
        request: riskplus_models.BatchqueryUmktRtTailmarketingRequest,
    ) -> riskplus_models.BatchqueryUmktRtTailmarketingResponse:
        """
        Description: 富信贴尾实时圈客
        Summary: 富信贴尾实时圈客
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_umkt_rt_tailmarketing_ex_async(request, headers, runtime)

    def batchquery_umkt_rt_tailmarketing_ex(
        self,
        request: riskplus_models.BatchqueryUmktRtTailmarketingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryUmktRtTailmarketingResponse:
        """
        Description: 富信贴尾实时圈客
        Summary: 富信贴尾实时圈客
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryUmktRtTailmarketingResponse(),
            self.do_request('1.0', 'riskplus.umkt.rt.tailmarketing.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_umkt_rt_tailmarketing_ex_async(
        self,
        request: riskplus_models.BatchqueryUmktRtTailmarketingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryUmktRtTailmarketingResponse:
        """
        Description: 富信贴尾实时圈客
        Summary: 富信贴尾实时圈客
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryUmktRtTailmarketingResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.rt.tailmarketing.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_umkt_scenestrategy_test(
        self,
        request: riskplus_models.QueryUmktScenestrategyTestRequest,
    ) -> riskplus_models.QueryUmktScenestrategyTestResponse:
        """
        Description: 实时圈客场景策略测试
        Summary: 实时圈客场景策略测试功能
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_umkt_scenestrategy_test_ex(request, headers, runtime)

    async def query_umkt_scenestrategy_test_async(
        self,
        request: riskplus_models.QueryUmktScenestrategyTestRequest,
    ) -> riskplus_models.QueryUmktScenestrategyTestResponse:
        """
        Description: 实时圈客场景策略测试
        Summary: 实时圈客场景策略测试功能
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_umkt_scenestrategy_test_ex_async(request, headers, runtime)

    def query_umkt_scenestrategy_test_ex(
        self,
        request: riskplus_models.QueryUmktScenestrategyTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktScenestrategyTestResponse:
        """
        Description: 实时圈客场景策略测试
        Summary: 实时圈客场景策略测试功能
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktScenestrategyTestResponse(),
            self.do_request('1.0', 'riskplus.umkt.scenestrategy.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_umkt_scenestrategy_test_ex_async(
        self,
        request: riskplus_models.QueryUmktScenestrategyTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktScenestrategyTestResponse:
        """
        Description: 实时圈客场景策略测试
        Summary: 实时圈客场景策略测试功能
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktScenestrategyTestResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.scenestrategy.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_umkt_robotcall(
        self,
        request: riskplus_models.ApplyUmktRobotcallRequest,
    ) -> riskplus_models.ApplyUmktRobotcallResponse:
        """
        Description: 发起AI外呼
        Summary: 发起AI外呼
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_umkt_robotcall_ex(request, headers, runtime)

    async def apply_umkt_robotcall_async(
        self,
        request: riskplus_models.ApplyUmktRobotcallRequest,
    ) -> riskplus_models.ApplyUmktRobotcallResponse:
        """
        Description: 发起AI外呼
        Summary: 发起AI外呼
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_umkt_robotcall_ex_async(request, headers, runtime)

    def apply_umkt_robotcall_ex(
        self,
        request: riskplus_models.ApplyUmktRobotcallRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyUmktRobotcallResponse:
        """
        Description: 发起AI外呼
        Summary: 发起AI外呼
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyUmktRobotcallResponse(),
            self.do_request('1.0', 'riskplus.umkt.robotcall.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_umkt_robotcall_ex_async(
        self,
        request: riskplus_models.ApplyUmktRobotcallRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyUmktRobotcallResponse:
        """
        Description: 发起AI外呼
        Summary: 发起AI外呼
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyUmktRobotcallResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.robotcall.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_umkt_dataaccess_statistic(
        self,
        request: riskplus_models.QueryUmktDataaccessStatisticRequest,
    ) -> riskplus_models.QueryUmktDataaccessStatisticResponse:
        """
        Description: 营销盾查询回执统计数据接口
        Summary: 营销盾回执统计查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_umkt_dataaccess_statistic_ex(request, headers, runtime)

    async def query_umkt_dataaccess_statistic_async(
        self,
        request: riskplus_models.QueryUmktDataaccessStatisticRequest,
    ) -> riskplus_models.QueryUmktDataaccessStatisticResponse:
        """
        Description: 营销盾查询回执统计数据接口
        Summary: 营销盾回执统计查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_umkt_dataaccess_statistic_ex_async(request, headers, runtime)

    def query_umkt_dataaccess_statistic_ex(
        self,
        request: riskplus_models.QueryUmktDataaccessStatisticRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktDataaccessStatisticResponse:
        """
        Description: 营销盾查询回执统计数据接口
        Summary: 营销盾回执统计查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktDataaccessStatisticResponse(),
            self.do_request('1.0', 'riskplus.umkt.dataaccess.statistic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_umkt_dataaccess_statistic_ex_async(
        self,
        request: riskplus_models.QueryUmktDataaccessStatisticRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktDataaccessStatisticResponse:
        """
        Description: 营销盾查询回执统计数据接口
        Summary: 营销盾回执统计查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktDataaccessStatisticResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.dataaccess.statistic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_umkt_dataaccess_offlinetask(
        self,
        request: riskplus_models.CancelUmktDataaccessOfflinetaskRequest,
    ) -> riskplus_models.CancelUmktDataaccessOfflinetaskResponse:
        """
        Description: 营销盾离线批量任务取消接口
        Summary: 营销盾取消离线批量任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_umkt_dataaccess_offlinetask_ex(request, headers, runtime)

    async def cancel_umkt_dataaccess_offlinetask_async(
        self,
        request: riskplus_models.CancelUmktDataaccessOfflinetaskRequest,
    ) -> riskplus_models.CancelUmktDataaccessOfflinetaskResponse:
        """
        Description: 营销盾离线批量任务取消接口
        Summary: 营销盾取消离线批量任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_umkt_dataaccess_offlinetask_ex_async(request, headers, runtime)

    def cancel_umkt_dataaccess_offlinetask_ex(
        self,
        request: riskplus_models.CancelUmktDataaccessOfflinetaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CancelUmktDataaccessOfflinetaskResponse:
        """
        Description: 营销盾离线批量任务取消接口
        Summary: 营销盾取消离线批量任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CancelUmktDataaccessOfflinetaskResponse(),
            self.do_request('1.0', 'riskplus.umkt.dataaccess.offlinetask.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_umkt_dataaccess_offlinetask_ex_async(
        self,
        request: riskplus_models.CancelUmktDataaccessOfflinetaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CancelUmktDataaccessOfflinetaskResponse:
        """
        Description: 营销盾离线批量任务取消接口
        Summary: 营销盾取消离线批量任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CancelUmktDataaccessOfflinetaskResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.dataaccess.offlinetask.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_umkt_rt_marketing(
        self,
        request: riskplus_models.QueryUmktRtMarketingRequest,
    ) -> riskplus_models.QueryUmktRtMarketingResponse:
        """
        Description: 营销盾实时单一凭证营销接口，服务于近rta的场景
        Summary: 营销盾实时单一凭证营销接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_umkt_rt_marketing_ex(request, headers, runtime)

    async def query_umkt_rt_marketing_async(
        self,
        request: riskplus_models.QueryUmktRtMarketingRequest,
    ) -> riskplus_models.QueryUmktRtMarketingResponse:
        """
        Description: 营销盾实时单一凭证营销接口，服务于近rta的场景
        Summary: 营销盾实时单一凭证营销接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_umkt_rt_marketing_ex_async(request, headers, runtime)

    def query_umkt_rt_marketing_ex(
        self,
        request: riskplus_models.QueryUmktRtMarketingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktRtMarketingResponse:
        """
        Description: 营销盾实时单一凭证营销接口，服务于近rta的场景
        Summary: 营销盾实时单一凭证营销接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktRtMarketingResponse(),
            self.do_request('1.0', 'riskplus.umkt.rt.marketing.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_umkt_rt_marketing_ex_async(
        self,
        request: riskplus_models.QueryUmktRtMarketingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktRtMarketingResponse:
        """
        Description: 营销盾实时单一凭证营销接口，服务于近rta的场景
        Summary: 营销盾实时单一凭证营销接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktRtMarketingResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.rt.marketing.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_umkt_backflow_event(
        self,
        request: riskplus_models.PushUmktBackflowEventRequest,
    ) -> riskplus_models.PushUmktBackflowEventResponse:
        """
        Description: 营销盾业务回流事件推送
        Summary: 营销盾回流事件推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_umkt_backflow_event_ex(request, headers, runtime)

    async def push_umkt_backflow_event_async(
        self,
        request: riskplus_models.PushUmktBackflowEventRequest,
    ) -> riskplus_models.PushUmktBackflowEventResponse:
        """
        Description: 营销盾业务回流事件推送
        Summary: 营销盾回流事件推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_umkt_backflow_event_ex_async(request, headers, runtime)

    def push_umkt_backflow_event_ex(
        self,
        request: riskplus_models.PushUmktBackflowEventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushUmktBackflowEventResponse:
        """
        Description: 营销盾业务回流事件推送
        Summary: 营销盾回流事件推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushUmktBackflowEventResponse(),
            self.do_request('1.0', 'riskplus.umkt.backflow.event.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_umkt_backflow_event_ex_async(
        self,
        request: riskplus_models.PushUmktBackflowEventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushUmktBackflowEventResponse:
        """
        Description: 营销盾业务回流事件推送
        Summary: 营销盾回流事件推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushUmktBackflowEventResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.backflow.event.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_umkt_cardsms_batch(
        self,
        request: riskplus_models.SendUmktCardsmsBatchRequest,
    ) -> riskplus_models.SendUmktCardsmsBatchResponse:
        """
        Description: 卡片短信批量发送接口
        Summary: 卡片短信批量发送接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_umkt_cardsms_batch_ex(request, headers, runtime)

    async def send_umkt_cardsms_batch_async(
        self,
        request: riskplus_models.SendUmktCardsmsBatchRequest,
    ) -> riskplus_models.SendUmktCardsmsBatchResponse:
        """
        Description: 卡片短信批量发送接口
        Summary: 卡片短信批量发送接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_umkt_cardsms_batch_ex_async(request, headers, runtime)

    def send_umkt_cardsms_batch_ex(
        self,
        request: riskplus_models.SendUmktCardsmsBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SendUmktCardsmsBatchResponse:
        """
        Description: 卡片短信批量发送接口
        Summary: 卡片短信批量发送接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SendUmktCardsmsBatchResponse(),
            self.do_request('1.0', 'riskplus.umkt.cardsms.batch.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_umkt_cardsms_batch_ex_async(
        self,
        request: riskplus_models.SendUmktCardsmsBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SendUmktCardsmsBatchResponse:
        """
        Description: 卡片短信批量发送接口
        Summary: 卡片短信批量发送接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SendUmktCardsmsBatchResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.cardsms.batch.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_umkt_cardsms_support(
        self,
        request: riskplus_models.QueryUmktCardsmsSupportRequest,
    ) -> riskplus_models.QueryUmktCardsmsSupportResponse:
        """
        Description: 卡片短信支持能力查询
        Summary: 卡片短信支持能力查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_umkt_cardsms_support_ex(request, headers, runtime)

    async def query_umkt_cardsms_support_async(
        self,
        request: riskplus_models.QueryUmktCardsmsSupportRequest,
    ) -> riskplus_models.QueryUmktCardsmsSupportResponse:
        """
        Description: 卡片短信支持能力查询
        Summary: 卡片短信支持能力查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_umkt_cardsms_support_ex_async(request, headers, runtime)

    def query_umkt_cardsms_support_ex(
        self,
        request: riskplus_models.QueryUmktCardsmsSupportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktCardsmsSupportResponse:
        """
        Description: 卡片短信支持能力查询
        Summary: 卡片短信支持能力查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktCardsmsSupportResponse(),
            self.do_request('1.0', 'riskplus.umkt.cardsms.support.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_umkt_cardsms_support_ex_async(
        self,
        request: riskplus_models.QueryUmktCardsmsSupportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktCardsmsSupportResponse:
        """
        Description: 卡片短信支持能力查询
        Summary: 卡片短信支持能力查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktCardsmsSupportResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.cardsms.support.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_umkt_textsms_batch(
        self,
        request: riskplus_models.SendUmktTextsmsBatchRequest,
    ) -> riskplus_models.SendUmktTextsmsBatchResponse:
        """
        Description: 文本短信批量发送接口
        Summary: 文本短信批量发送接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_umkt_textsms_batch_ex(request, headers, runtime)

    async def send_umkt_textsms_batch_async(
        self,
        request: riskplus_models.SendUmktTextsmsBatchRequest,
    ) -> riskplus_models.SendUmktTextsmsBatchResponse:
        """
        Description: 文本短信批量发送接口
        Summary: 文本短信批量发送接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_umkt_textsms_batch_ex_async(request, headers, runtime)

    def send_umkt_textsms_batch_ex(
        self,
        request: riskplus_models.SendUmktTextsmsBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SendUmktTextsmsBatchResponse:
        """
        Description: 文本短信批量发送接口
        Summary: 文本短信批量发送接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SendUmktTextsmsBatchResponse(),
            self.do_request('1.0', 'riskplus.umkt.textsms.batch.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_umkt_textsms_batch_ex_async(
        self,
        request: riskplus_models.SendUmktTextsmsBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SendUmktTextsmsBatchResponse:
        """
        Description: 文本短信批量发送接口
        Summary: 文本短信批量发送接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SendUmktTextsmsBatchResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.textsms.batch.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_umkt_digitalsms_batch(
        self,
        request: riskplus_models.SendUmktDigitalsmsBatchRequest,
    ) -> riskplus_models.SendUmktDigitalsmsBatchResponse:
        """
        Description: 数字短信批量发送接口（单模板）
        Summary: 数字短信批量发送接口（单模板）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_umkt_digitalsms_batch_ex(request, headers, runtime)

    async def send_umkt_digitalsms_batch_async(
        self,
        request: riskplus_models.SendUmktDigitalsmsBatchRequest,
    ) -> riskplus_models.SendUmktDigitalsmsBatchResponse:
        """
        Description: 数字短信批量发送接口（单模板）
        Summary: 数字短信批量发送接口（单模板）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_umkt_digitalsms_batch_ex_async(request, headers, runtime)

    def send_umkt_digitalsms_batch_ex(
        self,
        request: riskplus_models.SendUmktDigitalsmsBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SendUmktDigitalsmsBatchResponse:
        """
        Description: 数字短信批量发送接口（单模板）
        Summary: 数字短信批量发送接口（单模板）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SendUmktDigitalsmsBatchResponse(),
            self.do_request('1.0', 'riskplus.umkt.digitalsms.batch.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_umkt_digitalsms_batch_ex_async(
        self,
        request: riskplus_models.SendUmktDigitalsmsBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.SendUmktDigitalsmsBatchResponse:
        """
        Description: 数字短信批量发送接口（单模板）
        Summary: 数字短信批量发送接口（单模板）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.SendUmktDigitalsmsBatchResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.digitalsms.batch.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_umkt_cpaassms_template(
        self,
        request: riskplus_models.QueryUmktCpaassmsTemplateRequest,
    ) -> riskplus_models.QueryUmktCpaassmsTemplateResponse:
        """
        Description: 分页查询cpaas短信模板
        Summary: cpaas短信模板分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_umkt_cpaassms_template_ex(request, headers, runtime)

    async def query_umkt_cpaassms_template_async(
        self,
        request: riskplus_models.QueryUmktCpaassmsTemplateRequest,
    ) -> riskplus_models.QueryUmktCpaassmsTemplateResponse:
        """
        Description: 分页查询cpaas短信模板
        Summary: cpaas短信模板分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_umkt_cpaassms_template_ex_async(request, headers, runtime)

    def query_umkt_cpaassms_template_ex(
        self,
        request: riskplus_models.QueryUmktCpaassmsTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktCpaassmsTemplateResponse:
        """
        Description: 分页查询cpaas短信模板
        Summary: cpaas短信模板分页查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktCpaassmsTemplateResponse(),
            self.do_request('1.0', 'riskplus.umkt.cpaassms.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_umkt_cpaassms_template_ex_async(
        self,
        request: riskplus_models.QueryUmktCpaassmsTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktCpaassmsTemplateResponse:
        """
        Description: 分页查询cpaas短信模板
        Summary: cpaas短信模板分页查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktCpaassmsTemplateResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.cpaassms.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_umkt_rt_mixedmarketing(
        self,
        request: riskplus_models.BatchqueryUmktRtMixedmarketingRequest,
    ) -> riskplus_models.BatchqueryUmktRtMixedmarketingResponse:
        """
        Description: 实时混合批量营销圈客
        Summary: 实时混合批量营销圈客
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_umkt_rt_mixedmarketing_ex(request, headers, runtime)

    async def batchquery_umkt_rt_mixedmarketing_async(
        self,
        request: riskplus_models.BatchqueryUmktRtMixedmarketingRequest,
    ) -> riskplus_models.BatchqueryUmktRtMixedmarketingResponse:
        """
        Description: 实时混合批量营销圈客
        Summary: 实时混合批量营销圈客
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_umkt_rt_mixedmarketing_ex_async(request, headers, runtime)

    def batchquery_umkt_rt_mixedmarketing_ex(
        self,
        request: riskplus_models.BatchqueryUmktRtMixedmarketingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryUmktRtMixedmarketingResponse:
        """
        Description: 实时混合批量营销圈客
        Summary: 实时混合批量营销圈客
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryUmktRtMixedmarketingResponse(),
            self.do_request('1.0', 'riskplus.umkt.rt.mixedmarketing.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_umkt_rt_mixedmarketing_ex_async(
        self,
        request: riskplus_models.BatchqueryUmktRtMixedmarketingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryUmktRtMixedmarketingResponse:
        """
        Description: 实时混合批量营销圈客
        Summary: 实时混合批量营销圈客
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryUmktRtMixedmarketingResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.rt.mixedmarketing.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_umkt_phonenumberstatusforsms(
        self,
        request: riskplus_models.ApplyUmktPhonenumberstatusforsmsRequest,
    ) -> riskplus_models.ApplyUmktPhonenumberstatusforsmsResponse:
        """
        Description: 调用营销盾空号检测
        Summary: 调用营销盾空号检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_umkt_phonenumberstatusforsms_ex(request, headers, runtime)

    async def apply_umkt_phonenumberstatusforsms_async(
        self,
        request: riskplus_models.ApplyUmktPhonenumberstatusforsmsRequest,
    ) -> riskplus_models.ApplyUmktPhonenumberstatusforsmsResponse:
        """
        Description: 调用营销盾空号检测
        Summary: 调用营销盾空号检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_umkt_phonenumberstatusforsms_ex_async(request, headers, runtime)

    def apply_umkt_phonenumberstatusforsms_ex(
        self,
        request: riskplus_models.ApplyUmktPhonenumberstatusforsmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyUmktPhonenumberstatusforsmsResponse:
        """
        Description: 调用营销盾空号检测
        Summary: 调用营销盾空号检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyUmktPhonenumberstatusforsmsResponse(),
            self.do_request('1.0', 'riskplus.umkt.phonenumberstatusforsms.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_umkt_phonenumberstatusforsms_ex_async(
        self,
        request: riskplus_models.ApplyUmktPhonenumberstatusforsmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyUmktPhonenumberstatusforsmsResponse:
        """
        Description: 调用营销盾空号检测
        Summary: 调用营销盾空号检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyUmktPhonenumberstatusforsmsResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.phonenumberstatusforsms.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_umkt_rt_topn(
        self,
        request: riskplus_models.BatchqueryUmktRtTopnRequest,
    ) -> riskplus_models.BatchqueryUmktRtTopnResponse:
        """
        Description: 营销实时topN圈客
        Summary: 营销实时topN圈客
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_umkt_rt_topn_ex(request, headers, runtime)

    async def batchquery_umkt_rt_topn_async(
        self,
        request: riskplus_models.BatchqueryUmktRtTopnRequest,
    ) -> riskplus_models.BatchqueryUmktRtTopnResponse:
        """
        Description: 营销实时topN圈客
        Summary: 营销实时topN圈客
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_umkt_rt_topn_ex_async(request, headers, runtime)

    def batchquery_umkt_rt_topn_ex(
        self,
        request: riskplus_models.BatchqueryUmktRtTopnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryUmktRtTopnResponse:
        """
        Description: 营销实时topN圈客
        Summary: 营销实时topN圈客
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryUmktRtTopnResponse(),
            self.do_request('1.0', 'riskplus.umkt.rt.topn.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_umkt_rt_topn_ex_async(
        self,
        request: riskplus_models.BatchqueryUmktRtTopnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryUmktRtTopnResponse:
        """
        Description: 营销实时topN圈客
        Summary: 营销实时topN圈客
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryUmktRtTopnResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.rt.topn.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_umkt_robotcall_statisticinfo(
        self,
        request: riskplus_models.QueryUmktRobotcallStatisticinfoRequest,
    ) -> riskplus_models.QueryUmktRobotcallStatisticinfoResponse:
        """
        Description: 外呼任务统计查询接口
        Summary: 外呼任务统计查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_umkt_robotcall_statisticinfo_ex(request, headers, runtime)

    async def query_umkt_robotcall_statisticinfo_async(
        self,
        request: riskplus_models.QueryUmktRobotcallStatisticinfoRequest,
    ) -> riskplus_models.QueryUmktRobotcallStatisticinfoResponse:
        """
        Description: 外呼任务统计查询接口
        Summary: 外呼任务统计查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_umkt_robotcall_statisticinfo_ex_async(request, headers, runtime)

    def query_umkt_robotcall_statisticinfo_ex(
        self,
        request: riskplus_models.QueryUmktRobotcallStatisticinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktRobotcallStatisticinfoResponse:
        """
        Description: 外呼任务统计查询接口
        Summary: 外呼任务统计查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktRobotcallStatisticinfoResponse(),
            self.do_request('1.0', 'riskplus.umkt.robotcall.statisticinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_umkt_robotcall_statisticinfo_ex_async(
        self,
        request: riskplus_models.QueryUmktRobotcallStatisticinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktRobotcallStatisticinfoResponse:
        """
        Description: 外呼任务统计查询接口
        Summary: 外呼任务统计查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktRobotcallStatisticinfoResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.robotcall.statisticinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_umkt_tenant_actionplaninfo(
        self,
        request: riskplus_models.QueryUmktTenantActionplaninfoRequest,
    ) -> riskplus_models.QueryUmktTenantActionplaninfoResponse:
        """
        Description: 营销盾租户场景信息查询
        Summary: 营销盾租户场景信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_umkt_tenant_actionplaninfo_ex(request, headers, runtime)

    async def query_umkt_tenant_actionplaninfo_async(
        self,
        request: riskplus_models.QueryUmktTenantActionplaninfoRequest,
    ) -> riskplus_models.QueryUmktTenantActionplaninfoResponse:
        """
        Description: 营销盾租户场景信息查询
        Summary: 营销盾租户场景信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_umkt_tenant_actionplaninfo_ex_async(request, headers, runtime)

    def query_umkt_tenant_actionplaninfo_ex(
        self,
        request: riskplus_models.QueryUmktTenantActionplaninfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktTenantActionplaninfoResponse:
        """
        Description: 营销盾租户场景信息查询
        Summary: 营销盾租户场景信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktTenantActionplaninfoResponse(),
            self.do_request('1.0', 'riskplus.umkt.tenant.actionplaninfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_umkt_tenant_actionplaninfo_ex_async(
        self,
        request: riskplus_models.QueryUmktTenantActionplaninfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktTenantActionplaninfoResponse:
        """
        Description: 营销盾租户场景信息查询
        Summary: 营销盾租户场景信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktTenantActionplaninfoResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.tenant.actionplaninfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_umkt_robotcall_detail(
        self,
        request: riskplus_models.QueryUmktRobotcallDetailRequest,
    ) -> riskplus_models.QueryUmktRobotcallDetailResponse:
        """
        Description: 查询ai外呼任务详情
        Summary: 查询ai外呼任务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_umkt_robotcall_detail_ex(request, headers, runtime)

    async def query_umkt_robotcall_detail_async(
        self,
        request: riskplus_models.QueryUmktRobotcallDetailRequest,
    ) -> riskplus_models.QueryUmktRobotcallDetailResponse:
        """
        Description: 查询ai外呼任务详情
        Summary: 查询ai外呼任务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_umkt_robotcall_detail_ex_async(request, headers, runtime)

    def query_umkt_robotcall_detail_ex(
        self,
        request: riskplus_models.QueryUmktRobotcallDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktRobotcallDetailResponse:
        """
        Description: 查询ai外呼任务详情
        Summary: 查询ai外呼任务详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktRobotcallDetailResponse(),
            self.do_request('1.0', 'riskplus.umkt.robotcall.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_umkt_robotcall_detail_ex_async(
        self,
        request: riskplus_models.QueryUmktRobotcallDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktRobotcallDetailResponse:
        """
        Description: 查询ai外呼任务详情
        Summary: 查询ai外呼任务详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktRobotcallDetailResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.robotcall.detail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_umkt_realtimemarketing(
        self,
        request: riskplus_models.ApplyUmktRealtimemarketingRequest,
    ) -> riskplus_models.ApplyUmktRealtimemarketingResponse:
        """
        Description: 发起触达营销任务 ---目前仅支持文本短信
        Summary: 发起触达营销任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_umkt_realtimemarketing_ex(request, headers, runtime)

    async def apply_umkt_realtimemarketing_async(
        self,
        request: riskplus_models.ApplyUmktRealtimemarketingRequest,
    ) -> riskplus_models.ApplyUmktRealtimemarketingResponse:
        """
        Description: 发起触达营销任务 ---目前仅支持文本短信
        Summary: 发起触达营销任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_umkt_realtimemarketing_ex_async(request, headers, runtime)

    def apply_umkt_realtimemarketing_ex(
        self,
        request: riskplus_models.ApplyUmktRealtimemarketingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyUmktRealtimemarketingResponse:
        """
        Description: 发起触达营销任务 ---目前仅支持文本短信
        Summary: 发起触达营销任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyUmktRealtimemarketingResponse(),
            self.do_request('1.0', 'riskplus.umkt.realtimemarketing.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_umkt_realtimemarketing_ex_async(
        self,
        request: riskplus_models.ApplyUmktRealtimemarketingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyUmktRealtimemarketingResponse:
        """
        Description: 发起触达营销任务 ---目前仅支持文本短信
        Summary: 发起触达营销任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyUmktRealtimemarketingResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.realtimemarketing.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_umkt_rt_batchmarketing(
        self,
        request: riskplus_models.ApplyUmktRtBatchmarketingRequest,
    ) -> riskplus_models.ApplyUmktRtBatchmarketingResponse:
        """
        Description: 批量实时策略触达
        Summary: 批量实时策略触达
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_umkt_rt_batchmarketing_ex(request, headers, runtime)

    async def apply_umkt_rt_batchmarketing_async(
        self,
        request: riskplus_models.ApplyUmktRtBatchmarketingRequest,
    ) -> riskplus_models.ApplyUmktRtBatchmarketingResponse:
        """
        Description: 批量实时策略触达
        Summary: 批量实时策略触达
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_umkt_rt_batchmarketing_ex_async(request, headers, runtime)

    def apply_umkt_rt_batchmarketing_ex(
        self,
        request: riskplus_models.ApplyUmktRtBatchmarketingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyUmktRtBatchmarketingResponse:
        """
        Description: 批量实时策略触达
        Summary: 批量实时策略触达
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyUmktRtBatchmarketingResponse(),
            self.do_request('1.0', 'riskplus.umkt.rt.batchmarketing.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_umkt_rt_batchmarketing_ex_async(
        self,
        request: riskplus_models.ApplyUmktRtBatchmarketingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.ApplyUmktRtBatchmarketingResponse:
        """
        Description: 批量实时策略触达
        Summary: 批量实时策略触达
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.ApplyUmktRtBatchmarketingResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.rt.batchmarketing.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_umkt_robotcall(
        self,
        request: riskplus_models.CallbackUmktRobotcallRequest,
    ) -> riskplus_models.CallbackUmktRobotcallResponse:
        """
        Description: 新接入ai外呼服务商的回调接口
        Summary: ai外呼回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_umkt_robotcall_ex(request, headers, runtime)

    async def callback_umkt_robotcall_async(
        self,
        request: riskplus_models.CallbackUmktRobotcallRequest,
    ) -> riskplus_models.CallbackUmktRobotcallResponse:
        """
        Description: 新接入ai外呼服务商的回调接口
        Summary: ai外呼回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_umkt_robotcall_ex_async(request, headers, runtime)

    def callback_umkt_robotcall_ex(
        self,
        request: riskplus_models.CallbackUmktRobotcallRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CallbackUmktRobotcallResponse:
        """
        Description: 新接入ai外呼服务商的回调接口
        Summary: ai外呼回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CallbackUmktRobotcallResponse(),
            self.do_request('1.0', 'riskplus.umkt.robotcall.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_umkt_robotcall_ex_async(
        self,
        request: riskplus_models.CallbackUmktRobotcallRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CallbackUmktRobotcallResponse:
        """
        Description: 新接入ai外呼服务商的回调接口
        Summary: ai外呼回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CallbackUmktRobotcallResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.robotcall.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_umkt_sms_up(
        self,
        request: riskplus_models.CallbackUmktSmsUpRequest,
    ) -> riskplus_models.CallbackUmktSmsUpResponse:
        """
        Description: 营销盾上行短信回调接口
        Summary: 营销盾上行短信回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_umkt_sms_up_ex(request, headers, runtime)

    async def callback_umkt_sms_up_async(
        self,
        request: riskplus_models.CallbackUmktSmsUpRequest,
    ) -> riskplus_models.CallbackUmktSmsUpResponse:
        """
        Description: 营销盾上行短信回调接口
        Summary: 营销盾上行短信回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_umkt_sms_up_ex_async(request, headers, runtime)

    def callback_umkt_sms_up_ex(
        self,
        request: riskplus_models.CallbackUmktSmsUpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CallbackUmktSmsUpResponse:
        """
        Description: 营销盾上行短信回调接口
        Summary: 营销盾上行短信回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CallbackUmktSmsUpResponse(),
            self.do_request('1.0', 'riskplus.umkt.sms.up.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_umkt_sms_up_ex_async(
        self,
        request: riskplus_models.CallbackUmktSmsUpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CallbackUmktSmsUpResponse:
        """
        Description: 营销盾上行短信回调接口
        Summary: 营销盾上行短信回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CallbackUmktSmsUpResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.sms.up.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_umkt_sms_report(
        self,
        request: riskplus_models.CallbackUmktSmsReportRequest,
    ) -> riskplus_models.CallbackUmktSmsReportResponse:
        """
        Description: 营销盾短信状态回调接口
        Summary: 营销盾短信状态回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_umkt_sms_report_ex(request, headers, runtime)

    async def callback_umkt_sms_report_async(
        self,
        request: riskplus_models.CallbackUmktSmsReportRequest,
    ) -> riskplus_models.CallbackUmktSmsReportResponse:
        """
        Description: 营销盾短信状态回调接口
        Summary: 营销盾短信状态回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_umkt_sms_report_ex_async(request, headers, runtime)

    def callback_umkt_sms_report_ex(
        self,
        request: riskplus_models.CallbackUmktSmsReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CallbackUmktSmsReportResponse:
        """
        Description: 营销盾短信状态回调接口
        Summary: 营销盾短信状态回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CallbackUmktSmsReportResponse(),
            self.do_request('1.0', 'riskplus.umkt.sms.report.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_umkt_sms_report_ex_async(
        self,
        request: riskplus_models.CallbackUmktSmsReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CallbackUmktSmsReportResponse:
        """
        Description: 营销盾短信状态回调接口
        Summary: 营销盾短信状态回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CallbackUmktSmsReportResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.sms.report.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_umkt_tenant_actionplaninfo(
        self,
        request: riskplus_models.BatchqueryUmktTenantActionplaninfoRequest,
    ) -> riskplus_models.BatchqueryUmktTenantActionplaninfoResponse:
        """
        Description: 分页查询租户外呼策略
        Summary: 营销盾租户场景批量信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_umkt_tenant_actionplaninfo_ex(request, headers, runtime)

    async def batchquery_umkt_tenant_actionplaninfo_async(
        self,
        request: riskplus_models.BatchqueryUmktTenantActionplaninfoRequest,
    ) -> riskplus_models.BatchqueryUmktTenantActionplaninfoResponse:
        """
        Description: 分页查询租户外呼策略
        Summary: 营销盾租户场景批量信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_umkt_tenant_actionplaninfo_ex_async(request, headers, runtime)

    def batchquery_umkt_tenant_actionplaninfo_ex(
        self,
        request: riskplus_models.BatchqueryUmktTenantActionplaninfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryUmktTenantActionplaninfoResponse:
        """
        Description: 分页查询租户外呼策略
        Summary: 营销盾租户场景批量信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryUmktTenantActionplaninfoResponse(),
            self.do_request('1.0', 'riskplus.umkt.tenant.actionplaninfo.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_umkt_tenant_actionplaninfo_ex_async(
        self,
        request: riskplus_models.BatchqueryUmktTenantActionplaninfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryUmktTenantActionplaninfoResponse:
        """
        Description: 分页查询租户外呼策略
        Summary: 营销盾租户场景批量信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryUmktTenantActionplaninfoResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.tenant.actionplaninfo.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_umkt_robotcall_detail(
        self,
        request: riskplus_models.BatchqueryUmktRobotcallDetailRequest,
    ) -> riskplus_models.BatchqueryUmktRobotcallDetailResponse:
        """
        Description: 营销盾批次外呼内单个/多个手机号查询拨打情况
        (已下线)
        Summary: 营销盾外呼详情查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_umkt_robotcall_detail_ex(request, headers, runtime)

    async def batchquery_umkt_robotcall_detail_async(
        self,
        request: riskplus_models.BatchqueryUmktRobotcallDetailRequest,
    ) -> riskplus_models.BatchqueryUmktRobotcallDetailResponse:
        """
        Description: 营销盾批次外呼内单个/多个手机号查询拨打情况
        (已下线)
        Summary: 营销盾外呼详情查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_umkt_robotcall_detail_ex_async(request, headers, runtime)

    def batchquery_umkt_robotcall_detail_ex(
        self,
        request: riskplus_models.BatchqueryUmktRobotcallDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryUmktRobotcallDetailResponse:
        """
        Description: 营销盾批次外呼内单个/多个手机号查询拨打情况
        (已下线)
        Summary: 营销盾外呼详情查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryUmktRobotcallDetailResponse(),
            self.do_request('1.0', 'riskplus.umkt.robotcall.detail.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_umkt_robotcall_detail_ex_async(
        self,
        request: riskplus_models.BatchqueryUmktRobotcallDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryUmktRobotcallDetailResponse:
        """
        Description: 营销盾批次外呼内单个/多个手机号查询拨打情况
        (已下线)
        Summary: 营销盾外呼详情查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryUmktRobotcallDetailResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.robotcall.detail.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_umkt_actionplan_detail(
        self,
        request: riskplus_models.BatchqueryUmktActionplanDetailRequest,
    ) -> riskplus_models.BatchqueryUmktActionplanDetailResponse:
        """
        Description: 营销盾查询外呼策略详情
        Summary: 营销盾查询外呼策略详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_umkt_actionplan_detail_ex(request, headers, runtime)

    async def batchquery_umkt_actionplan_detail_async(
        self,
        request: riskplus_models.BatchqueryUmktActionplanDetailRequest,
    ) -> riskplus_models.BatchqueryUmktActionplanDetailResponse:
        """
        Description: 营销盾查询外呼策略详情
        Summary: 营销盾查询外呼策略详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_umkt_actionplan_detail_ex_async(request, headers, runtime)

    def batchquery_umkt_actionplan_detail_ex(
        self,
        request: riskplus_models.BatchqueryUmktActionplanDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryUmktActionplanDetailResponse:
        """
        Description: 营销盾查询外呼策略详情
        Summary: 营销盾查询外呼策略详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryUmktActionplanDetailResponse(),
            self.do_request('1.0', 'riskplus.umkt.actionplan.detail.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_umkt_actionplan_detail_ex_async(
        self,
        request: riskplus_models.BatchqueryUmktActionplanDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryUmktActionplanDetailResponse:
        """
        Description: 营销盾查询外呼策略详情
        Summary: 营销盾查询外呼策略详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryUmktActionplanDetailResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.actionplan.detail.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_riskplus_umkt_commonbackflow(
        self,
        request: riskplus_models.PushRiskplusUmktCommonbackflowRequest,
    ) -> riskplus_models.PushRiskplusUmktCommonbackflowResponse:
        """
        Description: 营销盾通用回流推送服务
        Summary: 营销盾通用回流推送服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_riskplus_umkt_commonbackflow_ex(request, headers, runtime)

    async def push_riskplus_umkt_commonbackflow_async(
        self,
        request: riskplus_models.PushRiskplusUmktCommonbackflowRequest,
    ) -> riskplus_models.PushRiskplusUmktCommonbackflowResponse:
        """
        Description: 营销盾通用回流推送服务
        Summary: 营销盾通用回流推送服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_riskplus_umkt_commonbackflow_ex_async(request, headers, runtime)

    def push_riskplus_umkt_commonbackflow_ex(
        self,
        request: riskplus_models.PushRiskplusUmktCommonbackflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushRiskplusUmktCommonbackflowResponse:
        """
        Description: 营销盾通用回流推送服务
        Summary: 营销盾通用回流推送服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushRiskplusUmktCommonbackflowResponse(),
            self.do_request('1.0', 'riskplus.riskplus.umkt.commonbackflow.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_riskplus_umkt_commonbackflow_ex_async(
        self,
        request: riskplus_models.PushRiskplusUmktCommonbackflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushRiskplusUmktCommonbackflowResponse:
        """
        Description: 营销盾通用回流推送服务
        Summary: 营销盾通用回流推送服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushRiskplusUmktCommonbackflowResponse(),
            await self.do_request_async('1.0', 'riskplus.riskplus.umkt.commonbackflow.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_umkt_common_data(
        self,
        request: riskplus_models.PushUmktCommonDataRequest,
    ) -> riskplus_models.PushUmktCommonDataResponse:
        """
        Description: 营销盾通用数据推送服务
        Summary: 营销盾通用数据推送服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_umkt_common_data_ex(request, headers, runtime)

    async def push_umkt_common_data_async(
        self,
        request: riskplus_models.PushUmktCommonDataRequest,
    ) -> riskplus_models.PushUmktCommonDataResponse:
        """
        Description: 营销盾通用数据推送服务
        Summary: 营销盾通用数据推送服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_umkt_common_data_ex_async(request, headers, runtime)

    def push_umkt_common_data_ex(
        self,
        request: riskplus_models.PushUmktCommonDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushUmktCommonDataResponse:
        """
        Description: 营销盾通用数据推送服务
        Summary: 营销盾通用数据推送服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushUmktCommonDataResponse(),
            self.do_request('1.0', 'riskplus.umkt.common.data.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_umkt_common_data_ex_async(
        self,
        request: riskplus_models.PushUmktCommonDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushUmktCommonDataResponse:
        """
        Description: 营销盾通用数据推送服务
        Summary: 营销盾通用数据推送服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushUmktCommonDataResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.common.data.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_umkt_customer_group(
        self,
        request: riskplus_models.PushUmktCustomerGroupRequest,
    ) -> riskplus_models.PushUmktCustomerGroupResponse:
        """
        Description: 营销盾客群推送服务
        Summary: 营销盾客群推送服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_umkt_customer_group_ex(request, headers, runtime)

    async def push_umkt_customer_group_async(
        self,
        request: riskplus_models.PushUmktCustomerGroupRequest,
    ) -> riskplus_models.PushUmktCustomerGroupResponse:
        """
        Description: 营销盾客群推送服务
        Summary: 营销盾客群推送服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_umkt_customer_group_ex_async(request, headers, runtime)

    def push_umkt_customer_group_ex(
        self,
        request: riskplus_models.PushUmktCustomerGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushUmktCustomerGroupResponse:
        """
        Description: 营销盾客群推送服务
        Summary: 营销盾客群推送服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushUmktCustomerGroupResponse(),
            self.do_request('1.0', 'riskplus.umkt.customer.group.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_umkt_customer_group_ex_async(
        self,
        request: riskplus_models.PushUmktCustomerGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushUmktCustomerGroupResponse:
        """
        Description: 营销盾客群推送服务
        Summary: 营销盾客群推送服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushUmktCustomerGroupResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.customer.group.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_umkt_task_detail(
        self,
        request: riskplus_models.BatchqueryUmktTaskDetailRequest,
    ) -> riskplus_models.BatchqueryUmktTaskDetailResponse:
        """
        Description: 触达执行任务详情查询
        Summary: 触达执行任务详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_umkt_task_detail_ex(request, headers, runtime)

    async def batchquery_umkt_task_detail_async(
        self,
        request: riskplus_models.BatchqueryUmktTaskDetailRequest,
    ) -> riskplus_models.BatchqueryUmktTaskDetailResponse:
        """
        Description: 触达执行任务详情查询
        Summary: 触达执行任务详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_umkt_task_detail_ex_async(request, headers, runtime)

    def batchquery_umkt_task_detail_ex(
        self,
        request: riskplus_models.BatchqueryUmktTaskDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryUmktTaskDetailResponse:
        """
        Description: 触达执行任务详情查询
        Summary: 触达执行任务详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryUmktTaskDetailResponse(),
            self.do_request('1.0', 'riskplus.umkt.task.detail.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_umkt_task_detail_ex_async(
        self,
        request: riskplus_models.BatchqueryUmktTaskDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.BatchqueryUmktTaskDetailResponse:
        """
        Description: 触达执行任务详情查询
        Summary: 触达执行任务详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.BatchqueryUmktTaskDetailResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.task.detail.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_umkt_backflow_jsondata(
        self,
        request: riskplus_models.PushUmktBackflowJsondataRequest,
    ) -> riskplus_models.PushUmktBackflowJsondataResponse:
        """
        Description: 营销盾数据回流推送，用于客户定制json数据
        Summary: 营销盾数据回流json格式推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_umkt_backflow_jsondata_ex(request, headers, runtime)

    async def push_umkt_backflow_jsondata_async(
        self,
        request: riskplus_models.PushUmktBackflowJsondataRequest,
    ) -> riskplus_models.PushUmktBackflowJsondataResponse:
        """
        Description: 营销盾数据回流推送，用于客户定制json数据
        Summary: 营销盾数据回流json格式推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_umkt_backflow_jsondata_ex_async(request, headers, runtime)

    def push_umkt_backflow_jsondata_ex(
        self,
        request: riskplus_models.PushUmktBackflowJsondataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushUmktBackflowJsondataResponse:
        """
        Description: 营销盾数据回流推送，用于客户定制json数据
        Summary: 营销盾数据回流json格式推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushUmktBackflowJsondataResponse(),
            self.do_request('1.0', 'riskplus.umkt.backflow.jsondata.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_umkt_backflow_jsondata_ex_async(
        self,
        request: riskplus_models.PushUmktBackflowJsondataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.PushUmktBackflowJsondataResponse:
        """
        Description: 营销盾数据回流推送，用于客户定制json数据
        Summary: 营销盾数据回流json格式推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.PushUmktBackflowJsondataResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.backflow.jsondata.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_umkt_cardsms_analysis(
        self,
        request: riskplus_models.QueryUmktCardsmsAnalysisRequest,
    ) -> riskplus_models.QueryUmktCardsmsAnalysisResponse:
        """
        Description: 营销盾卡短解析服务能力提供接口
        Summary: 营销盾卡短解析服务接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_umkt_cardsms_analysis_ex(request, headers, runtime)

    async def query_umkt_cardsms_analysis_async(
        self,
        request: riskplus_models.QueryUmktCardsmsAnalysisRequest,
    ) -> riskplus_models.QueryUmktCardsmsAnalysisResponse:
        """
        Description: 营销盾卡短解析服务能力提供接口
        Summary: 营销盾卡短解析服务接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_umkt_cardsms_analysis_ex_async(request, headers, runtime)

    def query_umkt_cardsms_analysis_ex(
        self,
        request: riskplus_models.QueryUmktCardsmsAnalysisRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktCardsmsAnalysisResponse:
        """
        Description: 营销盾卡短解析服务能力提供接口
        Summary: 营销盾卡短解析服务接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktCardsmsAnalysisResponse(),
            self.do_request('1.0', 'riskplus.umkt.cardsms.analysis.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_umkt_cardsms_analysis_ex_async(
        self,
        request: riskplus_models.QueryUmktCardsmsAnalysisRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktCardsmsAnalysisResponse:
        """
        Description: 营销盾卡短解析服务能力提供接口
        Summary: 营销盾卡短解析服务接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktCardsmsAnalysisResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.cardsms.analysis.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_umkt_offlinedecision(
        self,
        request: riskplus_models.UploadUmktOfflinedecisionRequest,
    ) -> riskplus_models.UploadUmktOfflinedecisionResponse:
        """
        Description: 营销盾离线圈客文件导入
        Summary: 营销盾离线圈客文件导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_umkt_offlinedecision_ex(request, headers, runtime)

    async def upload_umkt_offlinedecision_async(
        self,
        request: riskplus_models.UploadUmktOfflinedecisionRequest,
    ) -> riskplus_models.UploadUmktOfflinedecisionResponse:
        """
        Description: 营销盾离线圈客文件导入
        Summary: 营销盾离线圈客文件导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_umkt_offlinedecision_ex_async(request, headers, runtime)

    def upload_umkt_offlinedecision_ex(
        self,
        request: riskplus_models.UploadUmktOfflinedecisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UploadUmktOfflinedecisionResponse:
        """
        Description: 营销盾离线圈客文件导入
        Summary: 营销盾离线圈客文件导入
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.umkt.offlinedecision.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_umkt_offlinedecision_response = riskplus_models.UploadUmktOfflinedecisionResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_umkt_offlinedecision_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UploadUmktOfflinedecisionResponse(),
            self.do_request('1.0', 'riskplus.umkt.offlinedecision.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_umkt_offlinedecision_ex_async(
        self,
        request: riskplus_models.UploadUmktOfflinedecisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UploadUmktOfflinedecisionResponse:
        """
        Description: 营销盾离线圈客文件导入
        Summary: 营销盾离线圈客文件导入
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.umkt.offlinedecision.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_umkt_offlinedecision_response = riskplus_models.UploadUmktOfflinedecisionResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_umkt_offlinedecision_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UploadUmktOfflinedecisionResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.offlinedecision.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_umkt_offlinedecision_result(
        self,
        request: riskplus_models.QueryUmktOfflinedecisionResultRequest,
    ) -> riskplus_models.QueryUmktOfflinedecisionResultResponse:
        """
        Description: 营销盾查询可拉取圈客结果的计划集合
        Summary: 营销盾查询可拉取圈客结果的计划集合
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_umkt_offlinedecision_result_ex(request, headers, runtime)

    async def query_umkt_offlinedecision_result_async(
        self,
        request: riskplus_models.QueryUmktOfflinedecisionResultRequest,
    ) -> riskplus_models.QueryUmktOfflinedecisionResultResponse:
        """
        Description: 营销盾查询可拉取圈客结果的计划集合
        Summary: 营销盾查询可拉取圈客结果的计划集合
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_umkt_offlinedecision_result_ex_async(request, headers, runtime)

    def query_umkt_offlinedecision_result_ex(
        self,
        request: riskplus_models.QueryUmktOfflinedecisionResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktOfflinedecisionResultResponse:
        """
        Description: 营销盾查询可拉取圈客结果的计划集合
        Summary: 营销盾查询可拉取圈客结果的计划集合
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktOfflinedecisionResultResponse(),
            self.do_request('1.0', 'riskplus.umkt.offlinedecision.result.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_umkt_offlinedecision_result_ex_async(
        self,
        request: riskplus_models.QueryUmktOfflinedecisionResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktOfflinedecisionResultResponse:
        """
        Description: 营销盾查询可拉取圈客结果的计划集合
        Summary: 营销盾查询可拉取圈客结果的计划集合
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktOfflinedecisionResultResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.offlinedecision.result.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def download_umkt_offlinedecision_result(
        self,
        request: riskplus_models.DownloadUmktOfflinedecisionResultRequest,
    ) -> riskplus_models.DownloadUmktOfflinedecisionResultResponse:
        """
        Description: 营销盾离线圈客结果文件拉取
        Summary: 营销盾离线圈客结果文件拉取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.download_umkt_offlinedecision_result_ex(request, headers, runtime)

    async def download_umkt_offlinedecision_result_async(
        self,
        request: riskplus_models.DownloadUmktOfflinedecisionResultRequest,
    ) -> riskplus_models.DownloadUmktOfflinedecisionResultResponse:
        """
        Description: 营销盾离线圈客结果文件拉取
        Summary: 营销盾离线圈客结果文件拉取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.download_umkt_offlinedecision_result_ex_async(request, headers, runtime)

    def download_umkt_offlinedecision_result_ex(
        self,
        request: riskplus_models.DownloadUmktOfflinedecisionResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.DownloadUmktOfflinedecisionResultResponse:
        """
        Description: 营销盾离线圈客结果文件拉取
        Summary: 营销盾离线圈客结果文件拉取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.DownloadUmktOfflinedecisionResultResponse(),
            self.do_request('1.0', 'riskplus.umkt.offlinedecision.result.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def download_umkt_offlinedecision_result_ex_async(
        self,
        request: riskplus_models.DownloadUmktOfflinedecisionResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.DownloadUmktOfflinedecisionResultResponse:
        """
        Description: 营销盾离线圈客结果文件拉取
        Summary: 营销盾离线圈客结果文件拉取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.DownloadUmktOfflinedecisionResultResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.offlinedecision.result.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_umkt_offlinedecision_plandetails(
        self,
        request: riskplus_models.QueryUmktOfflinedecisionPlandetailsRequest,
    ) -> riskplus_models.QueryUmktOfflinedecisionPlandetailsResponse:
        """
        Description: 包含离线圈客关联计划和任务状态详情
        Summary: 营销盾离线圈客计划执行详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_umkt_offlinedecision_plandetails_ex(request, headers, runtime)

    async def query_umkt_offlinedecision_plandetails_async(
        self,
        request: riskplus_models.QueryUmktOfflinedecisionPlandetailsRequest,
    ) -> riskplus_models.QueryUmktOfflinedecisionPlandetailsResponse:
        """
        Description: 包含离线圈客关联计划和任务状态详情
        Summary: 营销盾离线圈客计划执行详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_umkt_offlinedecision_plandetails_ex_async(request, headers, runtime)

    def query_umkt_offlinedecision_plandetails_ex(
        self,
        request: riskplus_models.QueryUmktOfflinedecisionPlandetailsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktOfflinedecisionPlandetailsResponse:
        """
        Description: 包含离线圈客关联计划和任务状态详情
        Summary: 营销盾离线圈客计划执行详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktOfflinedecisionPlandetailsResponse(),
            self.do_request('1.0', 'riskplus.umkt.offlinedecision.plandetails.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_umkt_offlinedecision_plandetails_ex_async(
        self,
        request: riskplus_models.QueryUmktOfflinedecisionPlandetailsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.QueryUmktOfflinedecisionPlandetailsResponse:
        """
        Description: 包含离线圈客关联计划和任务状态详情
        Summary: 营销盾离线圈客计划执行详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.QueryUmktOfflinedecisionPlandetailsResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.offlinedecision.plandetails.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_umkt_offline_importrecord(
        self,
        request: riskplus_models.UploadUmktOfflineImportrecordRequest,
    ) -> riskplus_models.UploadUmktOfflineImportrecordResponse:
        """
        Description: 营销盾离线圈投一体文件上传
        Summary: 营销盾离线圈投一体文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_umkt_offline_importrecord_ex(request, headers, runtime)

    async def upload_umkt_offline_importrecord_async(
        self,
        request: riskplus_models.UploadUmktOfflineImportrecordRequest,
    ) -> riskplus_models.UploadUmktOfflineImportrecordResponse:
        """
        Description: 营销盾离线圈投一体文件上传
        Summary: 营销盾离线圈投一体文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_umkt_offline_importrecord_ex_async(request, headers, runtime)

    def upload_umkt_offline_importrecord_ex(
        self,
        request: riskplus_models.UploadUmktOfflineImportrecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UploadUmktOfflineImportrecordResponse:
        """
        Description: 营销盾离线圈投一体文件上传
        Summary: 营销盾离线圈投一体文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.umkt.offline.importrecord.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_umkt_offline_importrecord_response = riskplus_models.UploadUmktOfflineImportrecordResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_umkt_offline_importrecord_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UploadUmktOfflineImportrecordResponse(),
            self.do_request('1.0', 'riskplus.umkt.offline.importrecord.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_umkt_offline_importrecord_ex_async(
        self,
        request: riskplus_models.UploadUmktOfflineImportrecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.UploadUmktOfflineImportrecordResponse:
        """
        Description: 营销盾离线圈投一体文件上传
        Summary: 营销盾离线圈投一体文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = riskplus_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='riskplus.umkt.offline.importrecord.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_umkt_offline_importrecord_response = riskplus_models.UploadUmktOfflineImportrecordResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_umkt_offline_importrecord_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.UploadUmktOfflineImportrecordResponse(),
            await self.do_request_async('1.0', 'riskplus.umkt.offline.importrecord.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: riskplus_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> riskplus_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: riskplus_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> riskplus_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: riskplus_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: riskplus_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> riskplus_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            riskplus_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
