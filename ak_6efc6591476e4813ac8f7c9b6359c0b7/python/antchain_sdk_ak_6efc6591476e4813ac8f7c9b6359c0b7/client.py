# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_6efc6591476e4813ac8f7c9b6359c0b7 import models as ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models
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
        config: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.Config,
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
            # 大安全接口入参
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
                    'sdk_version': '1.0.10',
                    '_prod_code': 'ak_6efc6591476e4813ac8f7c9b6359c0b7',
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
            'ignoreSSL': runtime.ignore_ssl,
            # 大安全接口入参
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
                    'sdk_version': '1.0.10',
                    '_prod_code': 'ak_6efc6591476e4813ac8f7c9b6359c0b7',
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

    def run_antchain_saas_market_service(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.RunAntchainSaasMarketServiceRequest,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.RunAntchainSaasMarketServiceResponse:
        """
        Description: SaaS服务调用
        Summary: SaaS服务调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.run_antchain_saas_market_service_ex(request, headers, runtime)

    async def run_antchain_saas_market_service_async(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.RunAntchainSaasMarketServiceRequest,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.RunAntchainSaasMarketServiceResponse:
        """
        Description: SaaS服务调用
        Summary: SaaS服务调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.run_antchain_saas_market_service_ex_async(request, headers, runtime)

    def run_antchain_saas_market_service_ex(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.RunAntchainSaasMarketServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.RunAntchainSaasMarketServiceResponse:
        """
        Description: SaaS服务调用
        Summary: SaaS服务调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.RunAntchainSaasMarketServiceResponse(),
            self.do_request('1.0', 'antchain.saas.market.service.run', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def run_antchain_saas_market_service_ex_async(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.RunAntchainSaasMarketServiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.RunAntchainSaasMarketServiceResponse:
        """
        Description: SaaS服务调用
        Summary: SaaS服务调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.RunAntchainSaasMarketServiceResponse(),
            await self.do_request_async('1.0', 'antchain.saas.market.service.run', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_saas_security_infosec_opencheckservicecheck(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityInfosecOpencheckservicecheckRequest,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityInfosecOpencheckservicecheckResponse:
        """
        Description: 大安全检验内容安全接口
        Summary: 大安全检验内容安全接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_saas_security_infosec_opencheckservicecheck_ex(request, headers, runtime)

    async def check_saas_security_infosec_opencheckservicecheck_async(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityInfosecOpencheckservicecheckRequest,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityInfosecOpencheckservicecheckResponse:
        """
        Description: 大安全检验内容安全接口
        Summary: 大安全检验内容安全接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_saas_security_infosec_opencheckservicecheck_ex_async(request, headers, runtime)

    def check_saas_security_infosec_opencheckservicecheck_ex(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityInfosecOpencheckservicecheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityInfosecOpencheckservicecheckResponse:
        """
        Description: 大安全检验内容安全接口
        Summary: 大安全检验内容安全接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityInfosecOpencheckservicecheckResponse(),
            self.do_request('1.0', 'saas.security.infosec.opencheckservicecheck.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_saas_security_infosec_opencheckservicecheck_ex_async(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityInfosecOpencheckservicecheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityInfosecOpencheckservicecheckResponse:
        """
        Description: 大安全检验内容安全接口
        Summary: 大安全检验内容安全接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityInfosecOpencheckservicecheckResponse(),
            await self.do_request_async('1.0', 'saas.security.infosec.opencheckservicecheck.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_saas_security_infosec_opencheckservicequery(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityInfosecOpencheckservicequeryRequest,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityInfosecOpencheckservicequeryResponse:
        """
        Description: 大安全内容检测结果查询接口
        Summary: 大安全内容检测结果查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_saas_security_infosec_opencheckservicequery_ex(request, headers, runtime)

    async def query_saas_security_infosec_opencheckservicequery_async(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityInfosecOpencheckservicequeryRequest,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityInfosecOpencheckservicequeryResponse:
        """
        Description: 大安全内容检测结果查询接口
        Summary: 大安全内容检测结果查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_saas_security_infosec_opencheckservicequery_ex_async(request, headers, runtime)

    def query_saas_security_infosec_opencheckservicequery_ex(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityInfosecOpencheckservicequeryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityInfosecOpencheckservicequeryResponse:
        """
        Description: 大安全内容检测结果查询接口
        Summary: 大安全内容检测结果查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityInfosecOpencheckservicequeryResponse(),
            self.do_request('1.0', 'saas.security.infosec.opencheckservicequery.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_saas_security_infosec_opencheckservicequery_ex_async(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityInfosecOpencheckservicequeryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityInfosecOpencheckservicequeryResponse:
        """
        Description: 大安全内容检测结果查询接口
        Summary: 大安全内容检测结果查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityInfosecOpencheckservicequeryResponse(),
            await self.do_request_async('1.0', 'saas.security.infosec.opencheckservicequery.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_saas_security_rds_rdsservice(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityRdsRdsserviceRequest,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityRdsRdsserviceResponse:
        """
        Description: 大安全接口
        Summary: 大安全接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_saas_security_rds_rdsservice_ex(request, headers, runtime)

    async def check_saas_security_rds_rdsservice_async(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityRdsRdsserviceRequest,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityRdsRdsserviceResponse:
        """
        Description: 大安全接口
        Summary: 大安全接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_saas_security_rds_rdsservice_ex_async(request, headers, runtime)

    def check_saas_security_rds_rdsservice_ex(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityRdsRdsserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityRdsRdsserviceResponse:
        """
        Description: 大安全接口
        Summary: 大安全接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityRdsRdsserviceResponse(),
            self.do_request('1.0', 'saas.security.rds.rdsservice.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_saas_security_rds_rdsservice_ex_async(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityRdsRdsserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityRdsRdsserviceResponse:
        """
        Description: 大安全接口
        Summary: 大安全接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.CheckSaasSecurityRdsRdsserviceResponse(),
            await self.do_request_async('1.0', 'saas.security.rds.rdsservice.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_saas_security_rdslib_antcaptchaservice(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.VerifySaasSecurityRdslibAntcaptchaserviceRequest,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.VerifySaasSecurityRdslibAntcaptchaserviceResponse:
        """
        Description: 大安全接口
        Summary: 大安全接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_saas_security_rdslib_antcaptchaservice_ex(request, headers, runtime)

    async def verify_saas_security_rdslib_antcaptchaservice_async(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.VerifySaasSecurityRdslibAntcaptchaserviceRequest,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.VerifySaasSecurityRdslibAntcaptchaserviceResponse:
        """
        Description: 大安全接口
        Summary: 大安全接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_saas_security_rdslib_antcaptchaservice_ex_async(request, headers, runtime)

    def verify_saas_security_rdslib_antcaptchaservice_ex(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.VerifySaasSecurityRdslibAntcaptchaserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.VerifySaasSecurityRdslibAntcaptchaserviceResponse:
        """
        Description: 大安全接口
        Summary: 大安全接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.VerifySaasSecurityRdslibAntcaptchaserviceResponse(),
            self.do_request('1.0', 'saas.security.rdslib.antcaptchaservice.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_saas_security_rdslib_antcaptchaservice_ex_async(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.VerifySaasSecurityRdslibAntcaptchaserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.VerifySaasSecurityRdslibAntcaptchaserviceResponse:
        """
        Description: 大安全接口
        Summary: 大安全接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.VerifySaasSecurityRdslibAntcaptchaserviceResponse(),
            await self.do_request_async('1.0', 'saas.security.rdslib.antcaptchaservice.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_saas_security_securitycore_securityuniformservice(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse:
        """
        Description: 大安全接口
        Summary: 大安全接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_saas_security_securitycore_securityuniformservice_ex(request, headers, runtime)

    async def query_saas_security_securitycore_securityuniformservice_async(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse:
        """
        Description: 大安全接口
        Summary: 大安全接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_saas_security_securitycore_securityuniformservice_ex_async(request, headers, runtime)

    def query_saas_security_securitycore_securityuniformservice_ex(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse:
        """
        Description: 大安全接口
        Summary: 大安全接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse(),
            self.do_request('1.0', 'saas.security.securitycore.securityuniformservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_saas_security_securitycore_securityuniformservice_ex_async(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecuritySecuritycoreSecurityuniformserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse:
        """
        Description: 大安全接口
        Summary: 大安全接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecuritySecuritycoreSecurityuniformserviceResponse(),
            await self.do_request_async('1.0', 'saas.security.securitycore.securityuniformservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_saas_security_tscenter_umidqueryservice(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityTscenterUmidqueryserviceRequest,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityTscenterUmidqueryserviceResponse:
        """
        Description: 大安全接口
        Summary: 大安全接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_saas_security_tscenter_umidqueryservice_ex(request, headers, runtime)

    async def query_saas_security_tscenter_umidqueryservice_async(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityTscenterUmidqueryserviceRequest,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityTscenterUmidqueryserviceResponse:
        """
        Description: 大安全接口
        Summary: 大安全接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_saas_security_tscenter_umidqueryservice_ex_async(request, headers, runtime)

    def query_saas_security_tscenter_umidqueryservice_ex(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityTscenterUmidqueryserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityTscenterUmidqueryserviceResponse:
        """
        Description: 大安全接口
        Summary: 大安全接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityTscenterUmidqueryserviceResponse(),
            self.do_request('1.0', 'saas.security.tscenter.umidqueryservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_saas_security_tscenter_umidqueryservice_ex_async(
        self,
        request: ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityTscenterUmidqueryserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityTscenterUmidqueryserviceResponse:
        """
        Description: 大安全接口
        Summary: 大安全接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__6efc_6591476e_4813ac_8f_7c_9b_6359c_0b_7_models.QuerySaasSecurityTscenterUmidqueryserviceResponse(),
            await self.do_request_async('1.0', 'saas.security.tscenter.umidqueryservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
