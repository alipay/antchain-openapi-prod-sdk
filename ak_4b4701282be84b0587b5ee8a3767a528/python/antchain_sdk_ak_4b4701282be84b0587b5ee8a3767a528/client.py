# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_4b4701282be84b0587b5ee8a3767a528 import models as ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models
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
        config: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.Config,
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
            # 账号模型
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
                    'sdk_version': '1.0.0'
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
            'ignoreSSL': runtime.ignore_ssl,
            # 账号模型
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
                    'sdk_version': '1.0.0'
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

    def query_antchain_defincashier_saas_account(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAccountRequest,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAccountResponse:
        """
        Description: 用于外部业务平台会员查询已绑定账号
        Summary: B2B资金服务账号查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_defincashier_saas_account_ex(request, headers, runtime)

    async def query_antchain_defincashier_saas_account_async(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAccountRequest,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAccountResponse:
        """
        Description: 用于外部业务平台会员查询已绑定账号
        Summary: B2B资金服务账号查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_defincashier_saas_account_ex_async(request, headers, runtime)

    def query_antchain_defincashier_saas_account_ex(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAccountResponse:
        """
        Description: 用于外部业务平台会员查询已绑定账号
        Summary: B2B资金服务账号查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAccountResponse(),
            self.do_request('1.0', 'antchain.defincashier.saas.account.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_defincashier_saas_account_ex_async(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAccountResponse:
        """
        Description: 用于外部业务平台会员查询已绑定账号
        Summary: B2B资金服务账号查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAccountResponse(),
            await self.do_request_async('1.0', 'antchain.defincashier.saas.account.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_defincashier_saas_agreement(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAgreementRequest,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAgreementResponse:
        """
        Description: 查询会员的产品签约协议
        Summary: B2B资金服务签约查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_defincashier_saas_agreement_ex(request, headers, runtime)

    async def query_antchain_defincashier_saas_agreement_async(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAgreementRequest,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAgreementResponse:
        """
        Description: 查询会员的产品签约协议
        Summary: B2B资金服务签约查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_defincashier_saas_agreement_ex_async(request, headers, runtime)

    def query_antchain_defincashier_saas_agreement_ex(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAgreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAgreementResponse:
        """
        Description: 查询会员的产品签约协议
        Summary: B2B资金服务签约查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAgreementResponse(),
            self.do_request('1.0', 'antchain.defincashier.saas.agreement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_defincashier_saas_agreement_ex_async(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAgreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAgreementResponse:
        """
        Description: 查询会员的产品签约协议
        Summary: B2B资金服务签约查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasAgreementResponse(),
            await self.do_request_async('1.0', 'antchain.defincashier.saas.agreement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_defincashier_saas_funditem(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasFunditemRequest,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasFunditemResponse:
        """
        Description: 可以根据流水号查询请款，退款等资金操作明细
        Summary: B2B资金服务交易资金操作明细查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_defincashier_saas_funditem_ex(request, headers, runtime)

    async def query_antchain_defincashier_saas_funditem_async(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasFunditemRequest,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasFunditemResponse:
        """
        Description: 可以根据流水号查询请款，退款等资金操作明细
        Summary: B2B资金服务交易资金操作明细查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_defincashier_saas_funditem_ex_async(request, headers, runtime)

    def query_antchain_defincashier_saas_funditem_ex(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasFunditemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasFunditemResponse:
        """
        Description: 可以根据流水号查询请款，退款等资金操作明细
        Summary: B2B资金服务交易资金操作明细查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasFunditemResponse(),
            self.do_request('1.0', 'antchain.defincashier.saas.funditem.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_defincashier_saas_funditem_ex_async(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasFunditemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasFunditemResponse:
        """
        Description: 可以根据流水号查询请款，退款等资金操作明细
        Summary: B2B资金服务交易资金操作明细查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasFunditemResponse(),
            await self.do_request_async('1.0', 'antchain.defincashier.saas.funditem.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_defincashier_saas_inst(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasInstRequest,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasInstResponse:
        """
        Description: 用于外部业务平台会员查询机构（银行）的联行号和机构编码
        Summary: B2B资金服务机构信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_defincashier_saas_inst_ex(request, headers, runtime)

    async def query_antchain_defincashier_saas_inst_async(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasInstRequest,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasInstResponse:
        """
        Description: 用于外部业务平台会员查询机构（银行）的联行号和机构编码
        Summary: B2B资金服务机构信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_defincashier_saas_inst_ex_async(request, headers, runtime)

    def query_antchain_defincashier_saas_inst_ex(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasInstRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasInstResponse:
        """
        Description: 用于外部业务平台会员查询机构（银行）的联行号和机构编码
        Summary: B2B资金服务机构信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasInstResponse(),
            self.do_request('1.0', 'antchain.defincashier.saas.inst.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_defincashier_saas_inst_ex_async(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasInstRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasInstResponse:
        """
        Description: 用于外部业务平台会员查询机构（银行）的联行号和机构编码
        Summary: B2B资金服务机构信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasInstResponse(),
            await self.do_request_async('1.0', 'antchain.defincashier.saas.inst.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_antchain_defincashier_saas_payment(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CancelAntchainDefincashierSaasPaymentRequest,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CancelAntchainDefincashierSaasPaymentResponse:
        """
        Description: 撤销适用于商户、用户创建交易后，业务上不需要继续完成支付或放款。由业务平台或商户发起交易撤销动作，当交易未支付成功时，直接关单；当担保交易模式预授权成功时，完成预授权资金的解冻或退回。系统内部同步受理，异步处理，以异步处理结果为准。未支付交易只能撤销一次，已支付交易支持部分金额撤销，总撤销金额不超过支付金额。
        Summary: B2B资金服务交易撤销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_antchain_defincashier_saas_payment_ex(request, headers, runtime)

    async def cancel_antchain_defincashier_saas_payment_async(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CancelAntchainDefincashierSaasPaymentRequest,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CancelAntchainDefincashierSaasPaymentResponse:
        """
        Description: 撤销适用于商户、用户创建交易后，业务上不需要继续完成支付或放款。由业务平台或商户发起交易撤销动作，当交易未支付成功时，直接关单；当担保交易模式预授权成功时，完成预授权资金的解冻或退回。系统内部同步受理，异步处理，以异步处理结果为准。未支付交易只能撤销一次，已支付交易支持部分金额撤销，总撤销金额不超过支付金额。
        Summary: B2B资金服务交易撤销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_antchain_defincashier_saas_payment_ex_async(request, headers, runtime)

    def cancel_antchain_defincashier_saas_payment_ex(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CancelAntchainDefincashierSaasPaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CancelAntchainDefincashierSaasPaymentResponse:
        """
        Description: 撤销适用于商户、用户创建交易后，业务上不需要继续完成支付或放款。由业务平台或商户发起交易撤销动作，当交易未支付成功时，直接关单；当担保交易模式预授权成功时，完成预授权资金的解冻或退回。系统内部同步受理，异步处理，以异步处理结果为准。未支付交易只能撤销一次，已支付交易支持部分金额撤销，总撤销金额不超过支付金额。
        Summary: B2B资金服务交易撤销
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CancelAntchainDefincashierSaasPaymentResponse(),
            self.do_request('1.0', 'antchain.defincashier.saas.payment.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_antchain_defincashier_saas_payment_ex_async(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CancelAntchainDefincashierSaasPaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CancelAntchainDefincashierSaasPaymentResponse:
        """
        Description: 撤销适用于商户、用户创建交易后，业务上不需要继续完成支付或放款。由业务平台或商户发起交易撤销动作，当交易未支付成功时，直接关单；当担保交易模式预授权成功时，完成预授权资金的解冻或退回。系统内部同步受理，异步处理，以异步处理结果为准。未支付交易只能撤销一次，已支付交易支持部分金额撤销，总撤销金额不超过支付金额。
        Summary: B2B资金服务交易撤销
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CancelAntchainDefincashierSaasPaymentResponse(),
            await self.do_request_async('1.0', 'antchain.defincashier.saas.payment.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def capture_antchain_defincashier_saas_payment(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CaptureAntchainDefincashierSaasPaymentRequest,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CaptureAntchainDefincashierSaasPaymentResponse:
        """
        Description: 请款适用于商户、用户创建担保交易(预授权资金模式)，用户预授权成功完成资金冻结后，由业务平台确认到达打款给商户的时机后发起请款。完成预授权冻结资金解冻，并打款给商户。系统内部同步受理，异步处理，以异步交易结果通知为准。每笔交易支持多次部分请款，总请款金额不超过支付金额。
        Summary: B2B资金服务交易请款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.capture_antchain_defincashier_saas_payment_ex(request, headers, runtime)

    async def capture_antchain_defincashier_saas_payment_async(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CaptureAntchainDefincashierSaasPaymentRequest,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CaptureAntchainDefincashierSaasPaymentResponse:
        """
        Description: 请款适用于商户、用户创建担保交易(预授权资金模式)，用户预授权成功完成资金冻结后，由业务平台确认到达打款给商户的时机后发起请款。完成预授权冻结资金解冻，并打款给商户。系统内部同步受理，异步处理，以异步交易结果通知为准。每笔交易支持多次部分请款，总请款金额不超过支付金额。
        Summary: B2B资金服务交易请款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.capture_antchain_defincashier_saas_payment_ex_async(request, headers, runtime)

    def capture_antchain_defincashier_saas_payment_ex(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CaptureAntchainDefincashierSaasPaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CaptureAntchainDefincashierSaasPaymentResponse:
        """
        Description: 请款适用于商户、用户创建担保交易(预授权资金模式)，用户预授权成功完成资金冻结后，由业务平台确认到达打款给商户的时机后发起请款。完成预授权冻结资金解冻，并打款给商户。系统内部同步受理，异步处理，以异步交易结果通知为准。每笔交易支持多次部分请款，总请款金额不超过支付金额。
        Summary: B2B资金服务交易请款
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CaptureAntchainDefincashierSaasPaymentResponse(),
            self.do_request('1.0', 'antchain.defincashier.saas.payment.capture', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def capture_antchain_defincashier_saas_payment_ex_async(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CaptureAntchainDefincashierSaasPaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CaptureAntchainDefincashierSaasPaymentResponse:
        """
        Description: 请款适用于商户、用户创建担保交易(预授权资金模式)，用户预授权成功完成资金冻结后，由业务平台确认到达打款给商户的时机后发起请款。完成预授权冻结资金解冻，并打款给商户。系统内部同步受理，异步处理，以异步交易结果通知为准。每笔交易支持多次部分请款，总请款金额不超过支付金额。
        Summary: B2B资金服务交易请款
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CaptureAntchainDefincashierSaasPaymentResponse(),
            await self.do_request_async('1.0', 'antchain.defincashier.saas.payment.capture', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_antchain_defincashier_saas_payment(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CheckAntchainDefincashierSaasPaymentRequest,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CheckAntchainDefincashierSaasPaymentResponse:
        """
        Description: B2B支付场景，创建交易前检查
        Summary: B2B资金服务交易前检查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_antchain_defincashier_saas_payment_ex(request, headers, runtime)

    async def check_antchain_defincashier_saas_payment_async(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CheckAntchainDefincashierSaasPaymentRequest,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CheckAntchainDefincashierSaasPaymentResponse:
        """
        Description: B2B支付场景，创建交易前检查
        Summary: B2B资金服务交易前检查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_antchain_defincashier_saas_payment_ex_async(request, headers, runtime)

    def check_antchain_defincashier_saas_payment_ex(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CheckAntchainDefincashierSaasPaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CheckAntchainDefincashierSaasPaymentResponse:
        """
        Description: B2B支付场景，创建交易前检查
        Summary: B2B资金服务交易前检查
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CheckAntchainDefincashierSaasPaymentResponse(),
            self.do_request('1.0', 'antchain.defincashier.saas.payment.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_antchain_defincashier_saas_payment_ex_async(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CheckAntchainDefincashierSaasPaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CheckAntchainDefincashierSaasPaymentResponse:
        """
        Description: B2B支付场景，创建交易前检查
        Summary: B2B资金服务交易前检查
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CheckAntchainDefincashierSaasPaymentResponse(),
            await self.do_request_async('1.0', 'antchain.defincashier.saas.payment.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antchain_defincashier_saas_payment(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CreateAntchainDefincashierSaasPaymentRequest,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CreateAntchainDefincashierSaasPaymentResponse:
        """
        Description: B2B支付场景，创建交易服务
        Summary: B2B资金服务创建交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antchain_defincashier_saas_payment_ex(request, headers, runtime)

    async def create_antchain_defincashier_saas_payment_async(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CreateAntchainDefincashierSaasPaymentRequest,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CreateAntchainDefincashierSaasPaymentResponse:
        """
        Description: B2B支付场景，创建交易服务
        Summary: B2B资金服务创建交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antchain_defincashier_saas_payment_ex_async(request, headers, runtime)

    def create_antchain_defincashier_saas_payment_ex(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CreateAntchainDefincashierSaasPaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CreateAntchainDefincashierSaasPaymentResponse:
        """
        Description: B2B支付场景，创建交易服务
        Summary: B2B资金服务创建交易
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CreateAntchainDefincashierSaasPaymentResponse(),
            self.do_request('1.0', 'antchain.defincashier.saas.payment.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antchain_defincashier_saas_payment_ex_async(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CreateAntchainDefincashierSaasPaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CreateAntchainDefincashierSaasPaymentResponse:
        """
        Description: B2B支付场景，创建交易服务
        Summary: B2B资金服务创建交易
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.CreateAntchainDefincashierSaasPaymentResponse(),
            await self.do_request_async('1.0', 'antchain.defincashier.saas.payment.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_defincashier_saas_payment(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasPaymentRequest,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasPaymentResponse:
        """
        Description: 适用于创建交易后，查询交易详情。
        Summary: B2B资金服务查询交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_defincashier_saas_payment_ex(request, headers, runtime)

    async def query_antchain_defincashier_saas_payment_async(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasPaymentRequest,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasPaymentResponse:
        """
        Description: 适用于创建交易后，查询交易详情。
        Summary: B2B资金服务查询交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_defincashier_saas_payment_ex_async(request, headers, runtime)

    def query_antchain_defincashier_saas_payment_ex(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasPaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasPaymentResponse:
        """
        Description: 适用于创建交易后，查询交易详情。
        Summary: B2B资金服务查询交易
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasPaymentResponse(),
            self.do_request('1.0', 'antchain.defincashier.saas.payment.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_defincashier_saas_payment_ex_async(
        self,
        request: ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasPaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasPaymentResponse:
        """
        Description: 适用于创建交易后，查询交易详情。
        Summary: B2B资金服务查询交易
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__4b_4701282be_84b_0587b_5ee_8a_3767a_528_models.QueryAntchainDefincashierSaasPaymentResponse(),
            await self.do_request_async('1.0', 'antchain.defincashier.saas.payment.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
