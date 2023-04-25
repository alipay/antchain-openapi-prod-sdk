# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_partner import models as partner_models
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
        config: partner_models.Config,
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
            # 支出配置单商品价格条件属性
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
                    'sdk_version': '1.0.21',
                    '_prod_code': 'PARTNER',
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
            # 支出配置单商品价格条件属性
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
                    'sdk_version': '1.0.21',
                    '_prod_code': 'PARTNER',
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

    def query_eco_commodity(
        self,
        request: partner_models.QueryEcoCommodityRequest,
    ) -> partner_models.QueryEcoCommodityResponse:
        """
        Description: 获取合作伙伴销售商品对应的政策ID
        Summary: 获取合作伙伴销售商品对应的政策ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_eco_commodity_ex(request, headers, runtime)

    async def query_eco_commodity_async(
        self,
        request: partner_models.QueryEcoCommodityRequest,
    ) -> partner_models.QueryEcoCommodityResponse:
        """
        Description: 获取合作伙伴销售商品对应的政策ID
        Summary: 获取合作伙伴销售商品对应的政策ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_eco_commodity_ex_async(request, headers, runtime)

    def query_eco_commodity_ex(
        self,
        request: partner_models.QueryEcoCommodityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.QueryEcoCommodityResponse:
        """
        Description: 获取合作伙伴销售商品对应的政策ID
        Summary: 获取合作伙伴销售商品对应的政策ID
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.QueryEcoCommodityResponse(),
            self.do_request('1.0', 'antcloud.partner.eco.commodity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_eco_commodity_ex_async(
        self,
        request: partner_models.QueryEcoCommodityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.QueryEcoCommodityResponse:
        """
        Description: 获取合作伙伴销售商品对应的政策ID
        Summary: 获取合作伙伴销售商品对应的政策ID
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.QueryEcoCommodityResponse(),
            await self.do_request_async('1.0', 'antcloud.partner.eco.commodity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_partner_settlein(
        self,
        request: partner_models.ApplyPartnerSettleinRequest,
    ) -> partner_models.ApplyPartnerSettleinResponse:
        """
        Description: 合作方（伙伴、商家等）入驻申请
        Summary: 合作方（伙伴、商家等）入驻申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_partner_settlein_ex(request, headers, runtime)

    async def apply_partner_settlein_async(
        self,
        request: partner_models.ApplyPartnerSettleinRequest,
    ) -> partner_models.ApplyPartnerSettleinResponse:
        """
        Description: 合作方（伙伴、商家等）入驻申请
        Summary: 合作方（伙伴、商家等）入驻申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_partner_settlein_ex_async(request, headers, runtime)

    def apply_partner_settlein_ex(
        self,
        request: partner_models.ApplyPartnerSettleinRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.ApplyPartnerSettleinResponse:
        """
        Description: 合作方（伙伴、商家等）入驻申请
        Summary: 合作方（伙伴、商家等）入驻申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.ApplyPartnerSettleinResponse(),
            self.do_request('1.0', 'antcloud.partner.partner.settlein.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_partner_settlein_ex_async(
        self,
        request: partner_models.ApplyPartnerSettleinRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.ApplyPartnerSettleinResponse:
        """
        Description: 合作方（伙伴、商家等）入驻申请
        Summary: 合作方（伙伴、商家等）入驻申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.ApplyPartnerSettleinResponse(),
            await self.do_request_async('1.0', 'antcloud.partner.partner.settlein.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_partner_settlein(
        self,
        request: partner_models.CancelPartnerSettleinRequest,
    ) -> partner_models.CancelPartnerSettleinResponse:
        """
        Description: 合作方（伙伴、商家等）入驻撤销
        Summary: 合作方（伙伴、商家等）入驻撤销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_partner_settlein_ex(request, headers, runtime)

    async def cancel_partner_settlein_async(
        self,
        request: partner_models.CancelPartnerSettleinRequest,
    ) -> partner_models.CancelPartnerSettleinResponse:
        """
        Description: 合作方（伙伴、商家等）入驻撤销
        Summary: 合作方（伙伴、商家等）入驻撤销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_partner_settlein_ex_async(request, headers, runtime)

    def cancel_partner_settlein_ex(
        self,
        request: partner_models.CancelPartnerSettleinRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.CancelPartnerSettleinResponse:
        """
        Description: 合作方（伙伴、商家等）入驻撤销
        Summary: 合作方（伙伴、商家等）入驻撤销
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.CancelPartnerSettleinResponse(),
            self.do_request('1.0', 'antcloud.partner.partner.settlein.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_partner_settlein_ex_async(
        self,
        request: partner_models.CancelPartnerSettleinRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.CancelPartnerSettleinResponse:
        """
        Description: 合作方（伙伴、商家等）入驻撤销
        Summary: 合作方（伙伴、商家等）入驻撤销
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.CancelPartnerSettleinResponse(),
            await self.do_request_async('1.0', 'antcloud.partner.partner.settlein.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_partner_settlein(
        self,
        request: partner_models.QueryPartnerSettleinRequest,
    ) -> partner_models.QueryPartnerSettleinResponse:
        """
        Description: 合作方（伙伴、商家等）入驻申请结果查询
        Summary: 合作方（伙伴、商家等）入驻申请结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_partner_settlein_ex(request, headers, runtime)

    async def query_partner_settlein_async(
        self,
        request: partner_models.QueryPartnerSettleinRequest,
    ) -> partner_models.QueryPartnerSettleinResponse:
        """
        Description: 合作方（伙伴、商家等）入驻申请结果查询
        Summary: 合作方（伙伴、商家等）入驻申请结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_partner_settlein_ex_async(request, headers, runtime)

    def query_partner_settlein_ex(
        self,
        request: partner_models.QueryPartnerSettleinRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.QueryPartnerSettleinResponse:
        """
        Description: 合作方（伙伴、商家等）入驻申请结果查询
        Summary: 合作方（伙伴、商家等）入驻申请结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.QueryPartnerSettleinResponse(),
            self.do_request('1.0', 'antcloud.partner.partner.settlein.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_partner_settlein_ex_async(
        self,
        request: partner_models.QueryPartnerSettleinRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.QueryPartnerSettleinResponse:
        """
        Description: 合作方（伙伴、商家等）入驻申请结果查询
        Summary: 合作方（伙伴、商家等）入驻申请结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.QueryPartnerSettleinResponse(),
            await self.do_request_async('1.0', 'antcloud.partner.partner.settlein.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_settlein_contract(
        self,
        request: partner_models.QuerySettleinContractRequest,
    ) -> partner_models.QuerySettleinContractResponse:
        """
        Description: 合作方（伙伴、商家等）入驻标准合同查询
        Summary: 合作方（伙伴、商家等）入驻标准合同查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_settlein_contract_ex(request, headers, runtime)

    async def query_settlein_contract_async(
        self,
        request: partner_models.QuerySettleinContractRequest,
    ) -> partner_models.QuerySettleinContractResponse:
        """
        Description: 合作方（伙伴、商家等）入驻标准合同查询
        Summary: 合作方（伙伴、商家等）入驻标准合同查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_settlein_contract_ex_async(request, headers, runtime)

    def query_settlein_contract_ex(
        self,
        request: partner_models.QuerySettleinContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.QuerySettleinContractResponse:
        """
        Description: 合作方（伙伴、商家等）入驻标准合同查询
        Summary: 合作方（伙伴、商家等）入驻标准合同查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.QuerySettleinContractResponse(),
            self.do_request('1.0', 'antcloud.partner.settlein.contract.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_settlein_contract_ex_async(
        self,
        request: partner_models.QuerySettleinContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.QuerySettleinContractResponse:
        """
        Description: 合作方（伙伴、商家等）入驻标准合同查询
        Summary: 合作方（伙伴、商家等）入驻标准合同查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.QuerySettleinContractResponse(),
            await self.do_request_async('1.0', 'antcloud.partner.settlein.contract.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_expenditure_project(
        self,
        request: partner_models.CreateExpenditureProjectRequest,
    ) -> partner_models.CreateExpenditureProjectResponse:
        """
        Description: 合作方（伙伴、商家等）支出项目创建接口
        Summary: 合作方（伙伴、商家等）支出项目创建接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_expenditure_project_ex(request, headers, runtime)

    async def create_expenditure_project_async(
        self,
        request: partner_models.CreateExpenditureProjectRequest,
    ) -> partner_models.CreateExpenditureProjectResponse:
        """
        Description: 合作方（伙伴、商家等）支出项目创建接口
        Summary: 合作方（伙伴、商家等）支出项目创建接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_expenditure_project_ex_async(request, headers, runtime)

    def create_expenditure_project_ex(
        self,
        request: partner_models.CreateExpenditureProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.CreateExpenditureProjectResponse:
        """
        Description: 合作方（伙伴、商家等）支出项目创建接口
        Summary: 合作方（伙伴、商家等）支出项目创建接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.CreateExpenditureProjectResponse(),
            self.do_request('1.0', 'antcloud.partner.expenditure.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_expenditure_project_ex_async(
        self,
        request: partner_models.CreateExpenditureProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.CreateExpenditureProjectResponse:
        """
        Description: 合作方（伙伴、商家等）支出项目创建接口
        Summary: 合作方（伙伴、商家等）支出项目创建接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.CreateExpenditureProjectResponse(),
            await self.do_request_async('1.0', 'antcloud.partner.expenditure.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_expenditure_project(
        self,
        request: partner_models.QueryExpenditureProjectRequest,
    ) -> partner_models.QueryExpenditureProjectResponse:
        """
        Description: 合作方（伙伴、商家等）支出项目查询接口
        Summary: 合作方（伙伴、商家等）支出项目查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_expenditure_project_ex(request, headers, runtime)

    async def query_expenditure_project_async(
        self,
        request: partner_models.QueryExpenditureProjectRequest,
    ) -> partner_models.QueryExpenditureProjectResponse:
        """
        Description: 合作方（伙伴、商家等）支出项目查询接口
        Summary: 合作方（伙伴、商家等）支出项目查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_expenditure_project_ex_async(request, headers, runtime)

    def query_expenditure_project_ex(
        self,
        request: partner_models.QueryExpenditureProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.QueryExpenditureProjectResponse:
        """
        Description: 合作方（伙伴、商家等）支出项目查询接口
        Summary: 合作方（伙伴、商家等）支出项目查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.QueryExpenditureProjectResponse(),
            self.do_request('1.0', 'antcloud.partner.expenditure.project.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_expenditure_project_ex_async(
        self,
        request: partner_models.QueryExpenditureProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.QueryExpenditureProjectResponse:
        """
        Description: 合作方（伙伴、商家等）支出项目查询接口
        Summary: 合作方（伙伴、商家等）支出项目查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.QueryExpenditureProjectResponse(),
            await self.do_request_async('1.0', 'antcloud.partner.expenditure.project.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_expenditure_project(
        self,
        request: partner_models.CancelExpenditureProjectRequest,
    ) -> partner_models.CancelExpenditureProjectResponse:
        """
        Description: 合作方（伙伴、商家等）支出项目撤销接口
        Summary: 合作方（伙伴、商家等）支出项目撤销接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_expenditure_project_ex(request, headers, runtime)

    async def cancel_expenditure_project_async(
        self,
        request: partner_models.CancelExpenditureProjectRequest,
    ) -> partner_models.CancelExpenditureProjectResponse:
        """
        Description: 合作方（伙伴、商家等）支出项目撤销接口
        Summary: 合作方（伙伴、商家等）支出项目撤销接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_expenditure_project_ex_async(request, headers, runtime)

    def cancel_expenditure_project_ex(
        self,
        request: partner_models.CancelExpenditureProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.CancelExpenditureProjectResponse:
        """
        Description: 合作方（伙伴、商家等）支出项目撤销接口
        Summary: 合作方（伙伴、商家等）支出项目撤销接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.CancelExpenditureProjectResponse(),
            self.do_request('1.0', 'antcloud.partner.expenditure.project.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_expenditure_project_ex_async(
        self,
        request: partner_models.CancelExpenditureProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.CancelExpenditureProjectResponse:
        """
        Description: 合作方（伙伴、商家等）支出项目撤销接口
        Summary: 合作方（伙伴、商家等）支出项目撤销接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.CancelExpenditureProjectResponse(),
            await self.do_request_async('1.0', 'antcloud.partner.expenditure.project.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_expenditure_project(
        self,
        request: partner_models.ConfirmExpenditureProjectRequest,
    ) -> partner_models.ConfirmExpenditureProjectResponse:
        """
        Description: 支出项目合同确认接口
        Summary: 支出项目合同确认接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_expenditure_project_ex(request, headers, runtime)

    async def confirm_expenditure_project_async(
        self,
        request: partner_models.ConfirmExpenditureProjectRequest,
    ) -> partner_models.ConfirmExpenditureProjectResponse:
        """
        Description: 支出项目合同确认接口
        Summary: 支出项目合同确认接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_expenditure_project_ex_async(request, headers, runtime)

    def confirm_expenditure_project_ex(
        self,
        request: partner_models.ConfirmExpenditureProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.ConfirmExpenditureProjectResponse:
        """
        Description: 支出项目合同确认接口
        Summary: 支出项目合同确认接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.ConfirmExpenditureProjectResponse(),
            self.do_request('1.0', 'antcloud.partner.expenditure.project.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_expenditure_project_ex_async(
        self,
        request: partner_models.ConfirmExpenditureProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.ConfirmExpenditureProjectResponse:
        """
        Description: 支出项目合同确认接口
        Summary: 支出项目合同确认接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.ConfirmExpenditureProjectResponse(),
            await self.do_request_async('1.0', 'antcloud.partner.expenditure.project.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_standard_agreement(
        self,
        request: partner_models.QueryStandardAgreementRequest,
    ) -> partner_models.QueryStandardAgreementResponse:
        """
        Description: 合作方（伙伴、商家等）标准额合同查询接口
        Summary: 合作方（伙伴、商家等）标准额合同查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_standard_agreement_ex(request, headers, runtime)

    async def query_standard_agreement_async(
        self,
        request: partner_models.QueryStandardAgreementRequest,
    ) -> partner_models.QueryStandardAgreementResponse:
        """
        Description: 合作方（伙伴、商家等）标准额合同查询接口
        Summary: 合作方（伙伴、商家等）标准额合同查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_standard_agreement_ex_async(request, headers, runtime)

    def query_standard_agreement_ex(
        self,
        request: partner_models.QueryStandardAgreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.QueryStandardAgreementResponse:
        """
        Description: 合作方（伙伴、商家等）标准额合同查询接口
        Summary: 合作方（伙伴、商家等）标准额合同查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.QueryStandardAgreementResponse(),
            self.do_request('1.0', 'antcloud.partner.standard.agreement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_standard_agreement_ex_async(
        self,
        request: partner_models.QueryStandardAgreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.QueryStandardAgreementResponse:
        """
        Description: 合作方（伙伴、商家等）标准额合同查询接口
        Summary: 合作方（伙伴、商家等）标准额合同查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.QueryStandardAgreementResponse(),
            await self.do_request_async('1.0', 'antcloud.partner.standard.agreement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_area_province(
        self,
        request: partner_models.QueryAreaProvinceRequest,
    ) -> partner_models.QueryAreaProvinceResponse:
        """
        Description: 生态伙伴区域省份查询接口
        Summary: 生态伙伴区域省份查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_area_province_ex(request, headers, runtime)

    async def query_area_province_async(
        self,
        request: partner_models.QueryAreaProvinceRequest,
    ) -> partner_models.QueryAreaProvinceResponse:
        """
        Description: 生态伙伴区域省份查询接口
        Summary: 生态伙伴区域省份查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_area_province_ex_async(request, headers, runtime)

    def query_area_province_ex(
        self,
        request: partner_models.QueryAreaProvinceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.QueryAreaProvinceResponse:
        """
        Description: 生态伙伴区域省份查询接口
        Summary: 生态伙伴区域省份查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.QueryAreaProvinceResponse(),
            self.do_request('1.0', 'antcloud.partner.area.province.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_area_province_ex_async(
        self,
        request: partner_models.QueryAreaProvinceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.QueryAreaProvinceResponse:
        """
        Description: 生态伙伴区域省份查询接口
        Summary: 生态伙伴区域省份查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.QueryAreaProvinceResponse(),
            await self.do_request_async('1.0', 'antcloud.partner.area.province.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_area_city(
        self,
        request: partner_models.QueryAreaCityRequest,
    ) -> partner_models.QueryAreaCityResponse:
        """
        Description: 合作方（伙伴、商家等）区域信息查询-指定身份关联的城市信息
        Summary: 合作方（伙伴、商家等）区域信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_area_city_ex(request, headers, runtime)

    async def query_area_city_async(
        self,
        request: partner_models.QueryAreaCityRequest,
    ) -> partner_models.QueryAreaCityResponse:
        """
        Description: 合作方（伙伴、商家等）区域信息查询-指定身份关联的城市信息
        Summary: 合作方（伙伴、商家等）区域信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_area_city_ex_async(request, headers, runtime)

    def query_area_city_ex(
        self,
        request: partner_models.QueryAreaCityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.QueryAreaCityResponse:
        """
        Description: 合作方（伙伴、商家等）区域信息查询-指定身份关联的城市信息
        Summary: 合作方（伙伴、商家等）区域信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.QueryAreaCityResponse(),
            self.do_request('1.0', 'antcloud.partner.area.city.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_area_city_ex_async(
        self,
        request: partner_models.QueryAreaCityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.QueryAreaCityResponse:
        """
        Description: 合作方（伙伴、商家等）区域信息查询-指定身份关联的城市信息
        Summary: 合作方（伙伴、商家等）区域信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.QueryAreaCityResponse(),
            await self.do_request_async('1.0', 'antcloud.partner.area.city.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pbc_institution(
        self,
        request: partner_models.QueryPbcInstitutionRequest,
    ) -> partner_models.QueryPbcInstitutionResponse:
        """
        Description: 联行号关联银行机构信息查询
        Summary: 联行号关联银行机构信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pbc_institution_ex(request, headers, runtime)

    async def query_pbc_institution_async(
        self,
        request: partner_models.QueryPbcInstitutionRequest,
    ) -> partner_models.QueryPbcInstitutionResponse:
        """
        Description: 联行号关联银行机构信息查询
        Summary: 联行号关联银行机构信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pbc_institution_ex_async(request, headers, runtime)

    def query_pbc_institution_ex(
        self,
        request: partner_models.QueryPbcInstitutionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.QueryPbcInstitutionResponse:
        """
        Description: 联行号关联银行机构信息查询
        Summary: 联行号关联银行机构信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.QueryPbcInstitutionResponse(),
            self.do_request('1.0', 'antcloud.partner.pbc.institution.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pbc_institution_ex_async(
        self,
        request: partner_models.QueryPbcInstitutionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.QueryPbcInstitutionResponse:
        """
        Description: 联行号关联银行机构信息查询
        Summary: 联行号关联银行机构信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.QueryPbcInstitutionResponse(),
            await self.do_request_async('1.0', 'antcloud.partner.pbc.institution.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pbc_name(
        self,
        request: partner_models.QueryPbcNameRequest,
    ) -> partner_models.QueryPbcNameResponse:
        """
        Description: 输入联行号相关的省市以及机构名称，通过支行名称进行模糊查询联行号相关信息
        Summary: 合作方（伙伴、商家等）支行信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pbc_name_ex(request, headers, runtime)

    async def query_pbc_name_async(
        self,
        request: partner_models.QueryPbcNameRequest,
    ) -> partner_models.QueryPbcNameResponse:
        """
        Description: 输入联行号相关的省市以及机构名称，通过支行名称进行模糊查询联行号相关信息
        Summary: 合作方（伙伴、商家等）支行信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pbc_name_ex_async(request, headers, runtime)

    def query_pbc_name_ex(
        self,
        request: partner_models.QueryPbcNameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.QueryPbcNameResponse:
        """
        Description: 输入联行号相关的省市以及机构名称，通过支行名称进行模糊查询联行号相关信息
        Summary: 合作方（伙伴、商家等）支行信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.QueryPbcNameResponse(),
            self.do_request('1.0', 'antcloud.partner.pbc.name.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pbc_name_ex_async(
        self,
        request: partner_models.QueryPbcNameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> partner_models.QueryPbcNameResponse:
        """
        Description: 输入联行号相关的省市以及机构名称，通过支行名称进行模糊查询联行号相关信息
        Summary: 合作方（伙伴、商家等）支行信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            partner_models.QueryPbcNameResponse(),
            await self.do_request_async('1.0', 'antcloud.partner.pbc.name.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
