# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_bot import models as bot_models
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
        config: bot_models.Config,
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
            # 资源定位信息
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
                    'sdk_version': '1.7.19',
                    '_prod_code': 'BOT',
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
            # 资源定位信息
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
                    'sdk_version': '1.7.19',
                    '_prod_code': 'BOT',
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

    def open_acec_contract(
        self,
        request: bot_models.OpenAcecContractRequest,
    ) -> bot_models.OpenAcecContractResponse:
        """
        Description: acec提供的SPI服务开通接口
        Summary: acec提供的SPI服务开通接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.open_acec_contract_ex(request, headers, runtime)

    async def open_acec_contract_async(
        self,
        request: bot_models.OpenAcecContractRequest,
    ) -> bot_models.OpenAcecContractResponse:
        """
        Description: acec提供的SPI服务开通接口
        Summary: acec提供的SPI服务开通接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.open_acec_contract_ex_async(request, headers, runtime)

    def open_acec_contract_ex(
        self,
        request: bot_models.OpenAcecContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OpenAcecContractResponse:
        """
        Description: acec提供的SPI服务开通接口
        Summary: acec提供的SPI服务开通接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OpenAcecContractResponse(),
            self.do_request('1.0', 'blockchain.bot.acec.contract.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def open_acec_contract_ex_async(
        self,
        request: bot_models.OpenAcecContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OpenAcecContractResponse:
        """
        Description: acec提供的SPI服务开通接口
        Summary: acec提供的SPI服务开通接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OpenAcecContractResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.acec.contract.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def stop_acec_contract(
        self,
        request: bot_models.StopAcecContractRequest,
    ) -> bot_models.StopAcecContractResponse:
        """
        Description: AI服务组提供的SPI服务停止接口
        Summary: acec提供的SPI服务停止接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.stop_acec_contract_ex(request, headers, runtime)

    async def stop_acec_contract_async(
        self,
        request: bot_models.StopAcecContractRequest,
    ) -> bot_models.StopAcecContractResponse:
        """
        Description: AI服务组提供的SPI服务停止接口
        Summary: acec提供的SPI服务停止接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.stop_acec_contract_ex_async(request, headers, runtime)

    def stop_acec_contract_ex(
        self,
        request: bot_models.StopAcecContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StopAcecContractResponse:
        """
        Description: AI服务组提供的SPI服务停止接口
        Summary: acec提供的SPI服务停止接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.StopAcecContractResponse(),
            self.do_request('1.0', 'blockchain.bot.acec.contract.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def stop_acec_contract_ex_async(
        self,
        request: bot_models.StopAcecContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StopAcecContractResponse:
        """
        Description: AI服务组提供的SPI服务停止接口
        Summary: acec提供的SPI服务停止接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.StopAcecContractResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.acec.contract.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def resume_acec_contract(
        self,
        request: bot_models.ResumeAcecContractRequest,
    ) -> bot_models.ResumeAcecContractResponse:
        """
        Description: acec提供的SPI服务复入接口
        Summary: acec提供的SPI服务复入接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.resume_acec_contract_ex(request, headers, runtime)

    async def resume_acec_contract_async(
        self,
        request: bot_models.ResumeAcecContractRequest,
    ) -> bot_models.ResumeAcecContractResponse:
        """
        Description: acec提供的SPI服务复入接口
        Summary: acec提供的SPI服务复入接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.resume_acec_contract_ex_async(request, headers, runtime)

    def resume_acec_contract_ex(
        self,
        request: bot_models.ResumeAcecContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ResumeAcecContractResponse:
        """
        Description: acec提供的SPI服务复入接口
        Summary: acec提供的SPI服务复入接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ResumeAcecContractResponse(),
            self.do_request('1.0', 'blockchain.bot.acec.contract.resume', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def resume_acec_contract_ex_async(
        self,
        request: bot_models.ResumeAcecContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ResumeAcecContractResponse:
        """
        Description: acec提供的SPI服务复入接口
        Summary: acec提供的SPI服务复入接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ResumeAcecContractResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.acec.contract.resume', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_realperson(
        self,
        request: bot_models.CreateLeaseRealpersonRequest,
    ) -> bot_models.CreateLeaseRealpersonResponse:
        """
        Description: 租赁智能中心实人认证创建服务
        Summary: 租赁智能中心实人认证创建服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_realperson_ex(request, headers, runtime)

    async def create_lease_realperson_async(
        self,
        request: bot_models.CreateLeaseRealpersonRequest,
    ) -> bot_models.CreateLeaseRealpersonResponse:
        """
        Description: 租赁智能中心实人认证创建服务
        Summary: 租赁智能中心实人认证创建服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_realperson_ex_async(request, headers, runtime)

    def create_lease_realperson_ex(
        self,
        request: bot_models.CreateLeaseRealpersonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateLeaseRealpersonResponse:
        """
        Description: 租赁智能中心实人认证创建服务
        Summary: 租赁智能中心实人认证创建服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateLeaseRealpersonResponse(),
            self.do_request('1.0', 'blockchain.bot.lease.realperson.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_realperson_ex_async(
        self,
        request: bot_models.CreateLeaseRealpersonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateLeaseRealpersonResponse:
        """
        Description: 租赁智能中心实人认证创建服务
        Summary: 租赁智能中心实人认证创建服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateLeaseRealpersonResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.lease.realperson.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_realperson(
        self,
        request: bot_models.QueryLeaseRealpersonRequest,
    ) -> bot_models.QueryLeaseRealpersonResponse:
        """
        Description: 租赁智能中心实人认证查询服务
        Summary: 租赁智能中心实人认证查询服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_realperson_ex(request, headers, runtime)

    async def query_lease_realperson_async(
        self,
        request: bot_models.QueryLeaseRealpersonRequest,
    ) -> bot_models.QueryLeaseRealpersonResponse:
        """
        Description: 租赁智能中心实人认证查询服务
        Summary: 租赁智能中心实人认证查询服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_realperson_ex_async(request, headers, runtime)

    def query_lease_realperson_ex(
        self,
        request: bot_models.QueryLeaseRealpersonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryLeaseRealpersonResponse:
        """
        Description: 租赁智能中心实人认证查询服务
        Summary: 租赁智能中心实人认证查询服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryLeaseRealpersonResponse(),
            self.do_request('1.0', 'blockchain.bot.lease.realperson.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_realperson_ex_async(
        self,
        request: bot_models.QueryLeaseRealpersonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryLeaseRealpersonResponse:
        """
        Description: 租赁智能中心实人认证查询服务
        Summary: 租赁智能中心实人认证查询服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryLeaseRealpersonResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.lease.realperson.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_risk(
        self,
        request: bot_models.QueryLeaseRiskRequest,
    ) -> bot_models.QueryLeaseRiskResponse:
        """
        Description: 租赁智能中心风控查询服务
        Summary: 租赁智能中心风控查询服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_risk_ex(request, headers, runtime)

    async def query_lease_risk_async(
        self,
        request: bot_models.QueryLeaseRiskRequest,
    ) -> bot_models.QueryLeaseRiskResponse:
        """
        Description: 租赁智能中心风控查询服务
        Summary: 租赁智能中心风控查询服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_risk_ex_async(request, headers, runtime)

    def query_lease_risk_ex(
        self,
        request: bot_models.QueryLeaseRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryLeaseRiskResponse:
        """
        Description: 租赁智能中心风控查询服务
        Summary: 租赁智能中心风控查询服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryLeaseRiskResponse(),
            self.do_request('1.0', 'blockchain.bot.lease.risk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_risk_ex_async(
        self,
        request: bot_models.QueryLeaseRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryLeaseRiskResponse:
        """
        Description: 租赁智能中心风控查询服务
        Summary: 租赁智能中心风控查询服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryLeaseRiskResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.lease.risk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_bai_ocr(
        self,
        request: bot_models.QueryBaiOcrRequest,
    ) -> bot_models.QueryBaiOcrResponse:
        """
        Description: BAI提供的OCR服务接口
        Summary: BAI提供的OCR服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_bai_ocr_ex(request, headers, runtime)

    async def query_bai_ocr_async(
        self,
        request: bot_models.QueryBaiOcrRequest,
    ) -> bot_models.QueryBaiOcrResponse:
        """
        Description: BAI提供的OCR服务接口
        Summary: BAI提供的OCR服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_bai_ocr_ex_async(request, headers, runtime)

    def query_bai_ocr_ex(
        self,
        request: bot_models.QueryBaiOcrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryBaiOcrResponse:
        """
        Description: BAI提供的OCR服务接口
        Summary: BAI提供的OCR服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryBaiOcrResponse(),
            self.do_request('1.0', 'blockchain.bot.bai.ocr.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_bai_ocr_ex_async(
        self,
        request: bot_models.QueryBaiOcrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryBaiOcrResponse:
        """
        Description: BAI提供的OCR服务接口
        Summary: BAI提供的OCR服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryBaiOcrResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.bai.ocr.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_aiidentification_qrcode(
        self,
        request: bot_models.QueryAiidentificationQrcodeRequest,
    ) -> bot_models.QueryAiidentificationQrcodeResponse:
        """
        Description: AI二维码验真
        Summary: AI二维码验真
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_aiidentification_qrcode_ex(request, headers, runtime)

    async def query_aiidentification_qrcode_async(
        self,
        request: bot_models.QueryAiidentificationQrcodeRequest,
    ) -> bot_models.QueryAiidentificationQrcodeResponse:
        """
        Description: AI二维码验真
        Summary: AI二维码验真
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_aiidentification_qrcode_ex_async(request, headers, runtime)

    def query_aiidentification_qrcode_ex(
        self,
        request: bot_models.QueryAiidentificationQrcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryAiidentificationQrcodeResponse:
        """
        Description: AI二维码验真
        Summary: AI二维码验真
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = bot_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='blockchain.bot.aiidentification.qrcode.query',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                query_aiidentification_qrcode_response = bot_models.QueryAiidentificationQrcodeResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return query_aiidentification_qrcode_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryAiidentificationQrcodeResponse(),
            self.do_request('1.0', 'blockchain.bot.aiidentification.qrcode.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_aiidentification_qrcode_ex_async(
        self,
        request: bot_models.QueryAiidentificationQrcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryAiidentificationQrcodeResponse:
        """
        Description: AI二维码验真
        Summary: AI二维码验真
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = bot_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='blockchain.bot.aiidentification.qrcode.query',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                query_aiidentification_qrcode_response = bot_models.QueryAiidentificationQrcodeResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return query_aiidentification_qrcode_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryAiidentificationQrcodeResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.aiidentification.qrcode.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_aiidentification_goods(
        self,
        request: bot_models.QueryAiidentificationGoodsRequest,
    ) -> bot_models.QueryAiidentificationGoodsResponse:
        """
        Description: AI商品鉴定
        Summary: AI商品鉴定
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_aiidentification_goods_ex(request, headers, runtime)

    async def query_aiidentification_goods_async(
        self,
        request: bot_models.QueryAiidentificationGoodsRequest,
    ) -> bot_models.QueryAiidentificationGoodsResponse:
        """
        Description: AI商品鉴定
        Summary: AI商品鉴定
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_aiidentification_goods_ex_async(request, headers, runtime)

    def query_aiidentification_goods_ex(
        self,
        request: bot_models.QueryAiidentificationGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryAiidentificationGoodsResponse:
        """
        Description: AI商品鉴定
        Summary: AI商品鉴定
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryAiidentificationGoodsResponse(),
            self.do_request('1.0', 'blockchain.bot.aiidentification.goods.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_aiidentification_goods_ex_async(
        self,
        request: bot_models.QueryAiidentificationGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryAiidentificationGoodsResponse:
        """
        Description: AI商品鉴定
        Summary: AI商品鉴定
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryAiidentificationGoodsResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.aiidentification.goods.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_aiidentification_goodspoint(
        self,
        request: bot_models.CheckAiidentificationGoodspointRequest,
    ) -> bot_models.CheckAiidentificationGoodspointResponse:
        """
        Description: 商品鉴定点图片检测
        Summary: 商品鉴定点图片检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_aiidentification_goodspoint_ex(request, headers, runtime)

    async def check_aiidentification_goodspoint_async(
        self,
        request: bot_models.CheckAiidentificationGoodspointRequest,
    ) -> bot_models.CheckAiidentificationGoodspointResponse:
        """
        Description: 商品鉴定点图片检测
        Summary: 商品鉴定点图片检测
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_aiidentification_goodspoint_ex_async(request, headers, runtime)

    def check_aiidentification_goodspoint_ex(
        self,
        request: bot_models.CheckAiidentificationGoodspointRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CheckAiidentificationGoodspointResponse:
        """
        Description: 商品鉴定点图片检测
        Summary: 商品鉴定点图片检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CheckAiidentificationGoodspointResponse(),
            self.do_request('1.0', 'blockchain.bot.aiidentification.goodspoint.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_aiidentification_goodspoint_ex_async(
        self,
        request: bot_models.CheckAiidentificationGoodspointRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CheckAiidentificationGoodspointResponse:
        """
        Description: 商品鉴定点图片检测
        Summary: 商品鉴定点图片检测
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CheckAiidentificationGoodspointResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.aiidentification.goodspoint.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_aiidentification_qrcode(
        self,
        request: bot_models.CheckAiidentificationQrcodeRequest,
    ) -> bot_models.CheckAiidentificationQrcodeResponse:
        """
        Description: 溯源码比对服务
        Summary: AI溯源码验真
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_aiidentification_qrcode_ex(request, headers, runtime)

    async def check_aiidentification_qrcode_async(
        self,
        request: bot_models.CheckAiidentificationQrcodeRequest,
    ) -> bot_models.CheckAiidentificationQrcodeResponse:
        """
        Description: 溯源码比对服务
        Summary: AI溯源码验真
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_aiidentification_qrcode_ex_async(request, headers, runtime)

    def check_aiidentification_qrcode_ex(
        self,
        request: bot_models.CheckAiidentificationQrcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CheckAiidentificationQrcodeResponse:
        """
        Description: 溯源码比对服务
        Summary: AI溯源码验真
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CheckAiidentificationQrcodeResponse(),
            self.do_request('1.0', 'blockchain.bot.aiidentification.qrcode.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_aiidentification_qrcode_ex_async(
        self,
        request: bot_models.CheckAiidentificationQrcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CheckAiidentificationQrcodeResponse:
        """
        Description: 溯源码比对服务
        Summary: AI溯源码验真
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CheckAiidentificationQrcodeResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.aiidentification.qrcode.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_aiidentification_qrcode(
        self,
        request: bot_models.CreateAiidentificationQrcodeRequest,
    ) -> bot_models.CreateAiidentificationQrcodeResponse:
        """
        Description: 用于生成溯源防伪码
        Summary: 溯源防伪码生成接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_aiidentification_qrcode_ex(request, headers, runtime)

    async def create_aiidentification_qrcode_async(
        self,
        request: bot_models.CreateAiidentificationQrcodeRequest,
    ) -> bot_models.CreateAiidentificationQrcodeResponse:
        """
        Description: 用于生成溯源防伪码
        Summary: 溯源防伪码生成接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_aiidentification_qrcode_ex_async(request, headers, runtime)

    def create_aiidentification_qrcode_ex(
        self,
        request: bot_models.CreateAiidentificationQrcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateAiidentificationQrcodeResponse:
        """
        Description: 用于生成溯源防伪码
        Summary: 溯源防伪码生成接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateAiidentificationQrcodeResponse(),
            self.do_request('1.0', 'blockchain.bot.aiidentification.qrcode.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_aiidentification_qrcode_ex_async(
        self,
        request: bot_models.CreateAiidentificationQrcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateAiidentificationQrcodeResponse:
        """
        Description: 用于生成溯源防伪码
        Summary: 溯源防伪码生成接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateAiidentificationQrcodeResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.aiidentification.qrcode.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_aiidentification_qrcode(
        self,
        request: bot_models.VerifyAiidentificationQrcodeRequest,
    ) -> bot_models.VerifyAiidentificationQrcodeResponse:
        """
        Description: B端二维码质检
        Summary: B端二维码质检
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_aiidentification_qrcode_ex(request, headers, runtime)

    async def verify_aiidentification_qrcode_async(
        self,
        request: bot_models.VerifyAiidentificationQrcodeRequest,
    ) -> bot_models.VerifyAiidentificationQrcodeResponse:
        """
        Description: B端二维码质检
        Summary: B端二维码质检
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_aiidentification_qrcode_ex_async(request, headers, runtime)

    def verify_aiidentification_qrcode_ex(
        self,
        request: bot_models.VerifyAiidentificationQrcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.VerifyAiidentificationQrcodeResponse:
        """
        Description: B端二维码质检
        Summary: B端二维码质检
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.VerifyAiidentificationQrcodeResponse(),
            self.do_request('1.0', 'blockchain.bot.aiidentification.qrcode.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_aiidentification_qrcode_ex_async(
        self,
        request: bot_models.VerifyAiidentificationQrcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.VerifyAiidentificationQrcodeResponse:
        """
        Description: B端二维码质检
        Summary: B端二维码质检
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.VerifyAiidentificationQrcodeResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.aiidentification.qrcode.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_aiidentification_goodspoint(
        self,
        request: bot_models.QueryAiidentificationGoodspointRequest,
    ) -> bot_models.QueryAiidentificationGoodspointResponse:
        """
        Description: 商品鉴定
        Summary: 商品鉴定
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_aiidentification_goodspoint_ex(request, headers, runtime)

    async def query_aiidentification_goodspoint_async(
        self,
        request: bot_models.QueryAiidentificationGoodspointRequest,
    ) -> bot_models.QueryAiidentificationGoodspointResponse:
        """
        Description: 商品鉴定
        Summary: 商品鉴定
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_aiidentification_goodspoint_ex_async(request, headers, runtime)

    def query_aiidentification_goodspoint_ex(
        self,
        request: bot_models.QueryAiidentificationGoodspointRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryAiidentificationGoodspointResponse:
        """
        Description: 商品鉴定
        Summary: 商品鉴定
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryAiidentificationGoodspointResponse(),
            self.do_request('1.0', 'blockchain.bot.aiidentification.goodspoint.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_aiidentification_goodspoint_ex_async(
        self,
        request: bot_models.QueryAiidentificationGoodspointRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryAiidentificationGoodspointResponse:
        """
        Description: 商品鉴定
        Summary: 商品鉴定
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryAiidentificationGoodspointResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.aiidentification.goodspoint.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_acs_device(
        self,
        request: bot_models.CreateAcsDeviceRequest,
    ) -> bot_models.CreateAcsDeviceResponse:
        """
        Description: biot 私有化 设备注册接口
        Summary: biot 私有化 设备注册接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_acs_device_ex(request, headers, runtime)

    async def create_acs_device_async(
        self,
        request: bot_models.CreateAcsDeviceRequest,
    ) -> bot_models.CreateAcsDeviceResponse:
        """
        Description: biot 私有化 设备注册接口
        Summary: biot 私有化 设备注册接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_acs_device_ex_async(request, headers, runtime)

    def create_acs_device_ex(
        self,
        request: bot_models.CreateAcsDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateAcsDeviceResponse:
        """
        Description: biot 私有化 设备注册接口
        Summary: biot 私有化 设备注册接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateAcsDeviceResponse(),
            self.do_request('1.0', 'blockchain.bot.acs.device.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_acs_device_ex_async(
        self,
        request: bot_models.CreateAcsDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateAcsDeviceResponse:
        """
        Description: biot 私有化 设备注册接口
        Summary: biot 私有化 设备注册接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateAcsDeviceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.acs.device.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_acs_collector(
        self,
        request: bot_models.SendAcsCollectorRequest,
    ) -> bot_models.SendAcsCollectorResponse:
        """
        Description: biot 私有化 业务数据上报
        Summary: biot 私有化 业务数据上报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_acs_collector_ex(request, headers, runtime)

    async def send_acs_collector_async(
        self,
        request: bot_models.SendAcsCollectorRequest,
    ) -> bot_models.SendAcsCollectorResponse:
        """
        Description: biot 私有化 业务数据上报
        Summary: biot 私有化 业务数据上报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_acs_collector_ex_async(request, headers, runtime)

    def send_acs_collector_ex(
        self,
        request: bot_models.SendAcsCollectorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendAcsCollectorResponse:
        """
        Description: biot 私有化 业务数据上报
        Summary: biot 私有化 业务数据上报
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SendAcsCollectorResponse(),
            self.do_request('1.0', 'blockchain.bot.acs.collector.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_acs_collector_ex_async(
        self,
        request: bot_models.SendAcsCollectorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendAcsCollectorResponse:
        """
        Description: biot 私有化 业务数据上报
        Summary: biot 私有化 业务数据上报
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SendAcsCollectorResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.acs.collector.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_iotbasic_device(
        self,
        request: bot_models.QueryIotbasicDeviceRequest,
    ) -> bot_models.QueryIotbasicDeviceResponse:
        """
        Description: 提供设备基础信息查询服务
        Summary: IoT设备平台-设备查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_iotbasic_device_ex(request, headers, runtime)

    async def query_iotbasic_device_async(
        self,
        request: bot_models.QueryIotbasicDeviceRequest,
    ) -> bot_models.QueryIotbasicDeviceResponse:
        """
        Description: 提供设备基础信息查询服务
        Summary: IoT设备平台-设备查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_iotbasic_device_ex_async(request, headers, runtime)

    def query_iotbasic_device_ex(
        self,
        request: bot_models.QueryIotbasicDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryIotbasicDeviceResponse:
        """
        Description: 提供设备基础信息查询服务
        Summary: IoT设备平台-设备查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryIotbasicDeviceResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.device.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_iotbasic_device_ex_async(
        self,
        request: bot_models.QueryIotbasicDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryIotbasicDeviceResponse:
        """
        Description: 提供设备基础信息查询服务
        Summary: IoT设备平台-设备查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryIotbasicDeviceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.device.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def recognize_iotbasic_customer(
        self,
        request: bot_models.RecognizeIotbasicCustomerRequest,
    ) -> bot_models.RecognizeIotbasicCustomerResponse:
        """
        Description: IoT产品开通状态查询
        Summary: IoT产品开通状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.recognize_iotbasic_customer_ex(request, headers, runtime)

    async def recognize_iotbasic_customer_async(
        self,
        request: bot_models.RecognizeIotbasicCustomerRequest,
    ) -> bot_models.RecognizeIotbasicCustomerResponse:
        """
        Description: IoT产品开通状态查询
        Summary: IoT产品开通状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.recognize_iotbasic_customer_ex_async(request, headers, runtime)

    def recognize_iotbasic_customer_ex(
        self,
        request: bot_models.RecognizeIotbasicCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.RecognizeIotbasicCustomerResponse:
        """
        Description: IoT产品开通状态查询
        Summary: IoT产品开通状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.RecognizeIotbasicCustomerResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.customer.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def recognize_iotbasic_customer_ex_async(
        self,
        request: bot_models.RecognizeIotbasicCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.RecognizeIotbasicCustomerResponse:
        """
        Description: IoT产品开通状态查询
        Summary: IoT产品开通状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.RecognizeIotbasicCustomerResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.customer.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def certify_iotbasic_device(
        self,
        request: bot_models.CertifyIotbasicDeviceRequest,
    ) -> bot_models.CertifyIotbasicDeviceResponse:
        """
        Description: IoT设备平台-设备认证
        Summary: IoT设备平台-设备认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.certify_iotbasic_device_ex(request, headers, runtime)

    async def certify_iotbasic_device_async(
        self,
        request: bot_models.CertifyIotbasicDeviceRequest,
    ) -> bot_models.CertifyIotbasicDeviceResponse:
        """
        Description: IoT设备平台-设备认证
        Summary: IoT设备平台-设备认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.certify_iotbasic_device_ex_async(request, headers, runtime)

    def certify_iotbasic_device_ex(
        self,
        request: bot_models.CertifyIotbasicDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CertifyIotbasicDeviceResponse:
        """
        Description: IoT设备平台-设备认证
        Summary: IoT设备平台-设备认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CertifyIotbasicDeviceResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.device.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def certify_iotbasic_device_ex_async(
        self,
        request: bot_models.CertifyIotbasicDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CertifyIotbasicDeviceResponse:
        """
        Description: IoT设备平台-设备认证
        Summary: IoT设备平台-设备认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CertifyIotbasicDeviceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.device.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_iotbasic_user(
        self,
        request: bot_models.OperateIotbasicUserRequest,
    ) -> bot_models.OperateIotbasicUserResponse:
        """
        Description: iot平台用户注册操作，新增用户，删除用户，绑定角色等操作
        Summary: iot平台用户注册操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_iotbasic_user_ex(request, headers, runtime)

    async def operate_iotbasic_user_async(
        self,
        request: bot_models.OperateIotbasicUserRequest,
    ) -> bot_models.OperateIotbasicUserResponse:
        """
        Description: iot平台用户注册操作，新增用户，删除用户，绑定角色等操作
        Summary: iot平台用户注册操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_iotbasic_user_ex_async(request, headers, runtime)

    def operate_iotbasic_user_ex(
        self,
        request: bot_models.OperateIotbasicUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OperateIotbasicUserResponse:
        """
        Description: iot平台用户注册操作，新增用户，删除用户，绑定角色等操作
        Summary: iot平台用户注册操作
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OperateIotbasicUserResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.user.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_iotbasic_user_ex_async(
        self,
        request: bot_models.OperateIotbasicUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OperateIotbasicUserResponse:
        """
        Description: iot平台用户注册操作，新增用户，删除用户，绑定角色等操作
        Summary: iot平台用户注册操作
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OperateIotbasicUserResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.user.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_iotbasic_permission(
        self,
        request: bot_models.OperateIotbasicPermissionRequest,
    ) -> bot_models.OperateIotbasicPermissionResponse:
        """
        Description: iot 平台权限操作
        Summary: iot 平台权限操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_iotbasic_permission_ex(request, headers, runtime)

    async def operate_iotbasic_permission_async(
        self,
        request: bot_models.OperateIotbasicPermissionRequest,
    ) -> bot_models.OperateIotbasicPermissionResponse:
        """
        Description: iot 平台权限操作
        Summary: iot 平台权限操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_iotbasic_permission_ex_async(request, headers, runtime)

    def operate_iotbasic_permission_ex(
        self,
        request: bot_models.OperateIotbasicPermissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OperateIotbasicPermissionResponse:
        """
        Description: iot 平台权限操作
        Summary: iot 平台权限操作
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OperateIotbasicPermissionResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.permission.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_iotbasic_permission_ex_async(
        self,
        request: bot_models.OperateIotbasicPermissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OperateIotbasicPermissionResponse:
        """
        Description: iot 平台权限操作
        Summary: iot 平台权限操作
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OperateIotbasicPermissionResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.permission.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_iotbasic_sn(
        self,
        request: bot_models.QueryIotbasicSnRequest,
    ) -> bot_models.QueryIotbasicSnResponse:
        """
        Description: IoT设备平台-设备sn列表查询
        Summary: IoT设备平台-设备sn列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_iotbasic_sn_ex(request, headers, runtime)

    async def query_iotbasic_sn_async(
        self,
        request: bot_models.QueryIotbasicSnRequest,
    ) -> bot_models.QueryIotbasicSnResponse:
        """
        Description: IoT设备平台-设备sn列表查询
        Summary: IoT设备平台-设备sn列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_iotbasic_sn_ex_async(request, headers, runtime)

    def query_iotbasic_sn_ex(
        self,
        request: bot_models.QueryIotbasicSnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryIotbasicSnResponse:
        """
        Description: IoT设备平台-设备sn列表查询
        Summary: IoT设备平台-设备sn列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryIotbasicSnResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.sn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_iotbasic_sn_ex_async(
        self,
        request: bot_models.QueryIotbasicSnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryIotbasicSnResponse:
        """
        Description: IoT设备平台-设备sn列表查询
        Summary: IoT设备平台-设备sn列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryIotbasicSnResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.sn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_device_specs(
        self,
        request: bot_models.QueryDeviceSpecsRequest,
    ) -> bot_models.QueryDeviceSpecsResponse:
        """
        Description: IoT设备平台-设备规格查询
        Summary: IoT设备平台-设备规格查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_device_specs_ex(request, headers, runtime)

    async def query_device_specs_async(
        self,
        request: bot_models.QueryDeviceSpecsRequest,
    ) -> bot_models.QueryDeviceSpecsResponse:
        """
        Description: IoT设备平台-设备规格查询
        Summary: IoT设备平台-设备规格查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_device_specs_ex_async(request, headers, runtime)

    def query_device_specs_ex(
        self,
        request: bot_models.QueryDeviceSpecsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryDeviceSpecsResponse:
        """
        Description: IoT设备平台-设备规格查询
        Summary: IoT设备平台-设备规格查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryDeviceSpecsResponse(),
            self.do_request('1.0', 'blockchain.bot.device.specs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_device_specs_ex_async(
        self,
        request: bot_models.QueryDeviceSpecsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryDeviceSpecsResponse:
        """
        Description: IoT设备平台-设备规格查询
        Summary: IoT设备平台-设备规格查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryDeviceSpecsResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.device.specs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_iotbasic_relration(
        self,
        request: bot_models.OperateIotbasicRelrationRequest,
    ) -> bot_models.OperateIotbasicRelrationResponse:
        """
        Description: IoT设备平台-设备规格关系维护
        Summary: IoT设备平台-设备规格关系维护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_iotbasic_relration_ex(request, headers, runtime)

    async def operate_iotbasic_relration_async(
        self,
        request: bot_models.OperateIotbasicRelrationRequest,
    ) -> bot_models.OperateIotbasicRelrationResponse:
        """
        Description: IoT设备平台-设备规格关系维护
        Summary: IoT设备平台-设备规格关系维护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_iotbasic_relration_ex_async(request, headers, runtime)

    def operate_iotbasic_relration_ex(
        self,
        request: bot_models.OperateIotbasicRelrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OperateIotbasicRelrationResponse:
        """
        Description: IoT设备平台-设备规格关系维护
        Summary: IoT设备平台-设备规格关系维护
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OperateIotbasicRelrationResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.relration.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_iotbasic_relration_ex_async(
        self,
        request: bot_models.OperateIotbasicRelrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OperateIotbasicRelrationResponse:
        """
        Description: IoT设备平台-设备规格关系维护
        Summary: IoT设备平台-设备规格关系维护
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OperateIotbasicRelrationResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.relration.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_iotbasic_dictionary(
        self,
        request: bot_models.OperateIotbasicDictionaryRequest,
    ) -> bot_models.OperateIotbasicDictionaryResponse:
        """
        Description: IoT设备平台-设备字典数据维护
        Summary: IoT设备平台-设备字典数据维护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_iotbasic_dictionary_ex(request, headers, runtime)

    async def operate_iotbasic_dictionary_async(
        self,
        request: bot_models.OperateIotbasicDictionaryRequest,
    ) -> bot_models.OperateIotbasicDictionaryResponse:
        """
        Description: IoT设备平台-设备字典数据维护
        Summary: IoT设备平台-设备字典数据维护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_iotbasic_dictionary_ex_async(request, headers, runtime)

    def operate_iotbasic_dictionary_ex(
        self,
        request: bot_models.OperateIotbasicDictionaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OperateIotbasicDictionaryResponse:
        """
        Description: IoT设备平台-设备字典数据维护
        Summary: IoT设备平台-设备字典数据维护
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OperateIotbasicDictionaryResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.dictionary.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_iotbasic_dictionary_ex_async(
        self,
        request: bot_models.OperateIotbasicDictionaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OperateIotbasicDictionaryResponse:
        """
        Description: IoT设备平台-设备字典数据维护
        Summary: IoT设备平台-设备字典数据维护
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OperateIotbasicDictionaryResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.dictionary.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_iotbasic_category(
        self,
        request: bot_models.OperateIotbasicCategoryRequest,
    ) -> bot_models.OperateIotbasicCategoryResponse:
        """
        Description: IoT设备平台-设备品类数据维护
        Summary: IoT设备平台-设备品类数据维护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_iotbasic_category_ex(request, headers, runtime)

    async def operate_iotbasic_category_async(
        self,
        request: bot_models.OperateIotbasicCategoryRequest,
    ) -> bot_models.OperateIotbasicCategoryResponse:
        """
        Description: IoT设备平台-设备品类数据维护
        Summary: IoT设备平台-设备品类数据维护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_iotbasic_category_ex_async(request, headers, runtime)

    def operate_iotbasic_category_ex(
        self,
        request: bot_models.OperateIotbasicCategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OperateIotbasicCategoryResponse:
        """
        Description: IoT设备平台-设备品类数据维护
        Summary: IoT设备平台-设备品类数据维护
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OperateIotbasicCategoryResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.category.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_iotbasic_category_ex_async(
        self,
        request: bot_models.OperateIotbasicCategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OperateIotbasicCategoryResponse:
        """
        Description: IoT设备平台-设备品类数据维护
        Summary: IoT设备平台-设备品类数据维护
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OperateIotbasicCategoryResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.category.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_iotbasic_controlconfig(
        self,
        request: bot_models.OperateIotbasicControlconfigRequest,
    ) -> bot_models.OperateIotbasicControlconfigResponse:
        """
        Description: IoT设备平台-设备管控配置维护
        Summary: IoT设备平台-设备管控配置维护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_iotbasic_controlconfig_ex(request, headers, runtime)

    async def operate_iotbasic_controlconfig_async(
        self,
        request: bot_models.OperateIotbasicControlconfigRequest,
    ) -> bot_models.OperateIotbasicControlconfigResponse:
        """
        Description: IoT设备平台-设备管控配置维护
        Summary: IoT设备平台-设备管控配置维护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_iotbasic_controlconfig_ex_async(request, headers, runtime)

    def operate_iotbasic_controlconfig_ex(
        self,
        request: bot_models.OperateIotbasicControlconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OperateIotbasicControlconfigResponse:
        """
        Description: IoT设备平台-设备管控配置维护
        Summary: IoT设备平台-设备管控配置维护
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OperateIotbasicControlconfigResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.controlconfig.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_iotbasic_controlconfig_ex_async(
        self,
        request: bot_models.OperateIotbasicControlconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OperateIotbasicControlconfigResponse:
        """
        Description: IoT设备平台-设备管控配置维护
        Summary: IoT设备平台-设备管控配置维护
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OperateIotbasicControlconfigResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.controlconfig.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_iotbasic_chainmodel(
        self,
        request: bot_models.OperateIotbasicChainmodelRequest,
    ) -> bot_models.OperateIotbasicChainmodelResponse:
        """
        Description: IoT设备平台-上链业务模型配置维护
        Summary: IoT设备平台-上链业务模型配置维护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_iotbasic_chainmodel_ex(request, headers, runtime)

    async def operate_iotbasic_chainmodel_async(
        self,
        request: bot_models.OperateIotbasicChainmodelRequest,
    ) -> bot_models.OperateIotbasicChainmodelResponse:
        """
        Description: IoT设备平台-上链业务模型配置维护
        Summary: IoT设备平台-上链业务模型配置维护
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_iotbasic_chainmodel_ex_async(request, headers, runtime)

    def operate_iotbasic_chainmodel_ex(
        self,
        request: bot_models.OperateIotbasicChainmodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OperateIotbasicChainmodelResponse:
        """
        Description: IoT设备平台-上链业务模型配置维护
        Summary: IoT设备平台-上链业务模型配置维护
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OperateIotbasicChainmodelResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.chainmodel.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_iotbasic_chainmodel_ex_async(
        self,
        request: bot_models.OperateIotbasicChainmodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OperateIotbasicChainmodelResponse:
        """
        Description: IoT设备平台-上链业务模型配置维护
        Summary: IoT设备平台-上链业务模型配置维护
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OperateIotbasicChainmodelResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.chainmodel.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_iotbasic_device(
        self,
        request: bot_models.OperateIotbasicDeviceRequest,
    ) -> bot_models.OperateIotbasicDeviceResponse:
        """
        Description: IoT设备平台-设备不可操作标记更新
        Summary: IoT设备平台-设备不可操作标记更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_iotbasic_device_ex(request, headers, runtime)

    async def operate_iotbasic_device_async(
        self,
        request: bot_models.OperateIotbasicDeviceRequest,
    ) -> bot_models.OperateIotbasicDeviceResponse:
        """
        Description: IoT设备平台-设备不可操作标记更新
        Summary: IoT设备平台-设备不可操作标记更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_iotbasic_device_ex_async(request, headers, runtime)

    def operate_iotbasic_device_ex(
        self,
        request: bot_models.OperateIotbasicDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OperateIotbasicDeviceResponse:
        """
        Description: IoT设备平台-设备不可操作标记更新
        Summary: IoT设备平台-设备不可操作标记更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OperateIotbasicDeviceResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.device.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_iotbasic_device_ex_async(
        self,
        request: bot_models.OperateIotbasicDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OperateIotbasicDeviceResponse:
        """
        Description: IoT设备平台-设备不可操作标记更新
        Summary: IoT设备平台-设备不可操作标记更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OperateIotbasicDeviceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.device.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_iotbasic_device(
        self,
        request: bot_models.CreateIotbasicDeviceRequest,
    ) -> bot_models.CreateIotbasicDeviceResponse:
        """
        Description: biot设备注册-创建设备
        Summary: biot设备注册-创建设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_iotbasic_device_ex(request, headers, runtime)

    async def create_iotbasic_device_async(
        self,
        request: bot_models.CreateIotbasicDeviceRequest,
    ) -> bot_models.CreateIotbasicDeviceResponse:
        """
        Description: biot设备注册-创建设备
        Summary: biot设备注册-创建设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_iotbasic_device_ex_async(request, headers, runtime)

    def create_iotbasic_device_ex(
        self,
        request: bot_models.CreateIotbasicDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateIotbasicDeviceResponse:
        """
        Description: biot设备注册-创建设备
        Summary: biot设备注册-创建设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateIotbasicDeviceResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.device.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_iotbasic_device_ex_async(
        self,
        request: bot_models.CreateIotbasicDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateIotbasicDeviceResponse:
        """
        Description: biot设备注册-创建设备
        Summary: biot设备注册-创建设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateIotbasicDeviceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.device.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_iotbasic_device(
        self,
        request: bot_models.BatchcreateIotbasicDeviceRequest,
    ) -> bot_models.BatchcreateIotbasicDeviceResponse:
        """
        Description: biot设备注册-批量创建设备
        Summary: biot设备注册-批量创建设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_iotbasic_device_ex(request, headers, runtime)

    async def batchcreate_iotbasic_device_async(
        self,
        request: bot_models.BatchcreateIotbasicDeviceRequest,
    ) -> bot_models.BatchcreateIotbasicDeviceResponse:
        """
        Description: biot设备注册-批量创建设备
        Summary: biot设备注册-批量创建设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_iotbasic_device_ex_async(request, headers, runtime)

    def batchcreate_iotbasic_device_ex(
        self,
        request: bot_models.BatchcreateIotbasicDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.BatchcreateIotbasicDeviceResponse:
        """
        Description: biot设备注册-批量创建设备
        Summary: biot设备注册-批量创建设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.BatchcreateIotbasicDeviceResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.device.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_iotbasic_device_ex_async(
        self,
        request: bot_models.BatchcreateIotbasicDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.BatchcreateIotbasicDeviceResponse:
        """
        Description: biot设备注册-批量创建设备
        Summary: biot设备注册-批量创建设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.BatchcreateIotbasicDeviceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.device.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_iotbasic_devicestatus(
        self,
        request: bot_models.SyncIotbasicDevicestatusRequest,
    ) -> bot_models.SyncIotbasicDevicestatusResponse:
        """
        Description: biot设备状态同步
        Summary: biot设备状态同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_iotbasic_devicestatus_ex(request, headers, runtime)

    async def sync_iotbasic_devicestatus_async(
        self,
        request: bot_models.SyncIotbasicDevicestatusRequest,
    ) -> bot_models.SyncIotbasicDevicestatusResponse:
        """
        Description: biot设备状态同步
        Summary: biot设备状态同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_iotbasic_devicestatus_ex_async(request, headers, runtime)

    def sync_iotbasic_devicestatus_ex(
        self,
        request: bot_models.SyncIotbasicDevicestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SyncIotbasicDevicestatusResponse:
        """
        Description: biot设备状态同步
        Summary: biot设备状态同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SyncIotbasicDevicestatusResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.devicestatus.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_iotbasic_devicestatus_ex_async(
        self,
        request: bot_models.SyncIotbasicDevicestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SyncIotbasicDevicestatusResponse:
        """
        Description: biot设备状态同步
        Summary: biot设备状态同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SyncIotbasicDevicestatusResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.devicestatus.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_iotbasic_identify(
        self,
        request: bot_models.VerifyIotbasicIdentifyRequest,
    ) -> bot_models.VerifyIotbasicIdentifyResponse:
        """
        Description: biot设备-安全认证
        Summary: biot设备-安全认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_iotbasic_identify_ex(request, headers, runtime)

    async def verify_iotbasic_identify_async(
        self,
        request: bot_models.VerifyIotbasicIdentifyRequest,
    ) -> bot_models.VerifyIotbasicIdentifyResponse:
        """
        Description: biot设备-安全认证
        Summary: biot设备-安全认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_iotbasic_identify_ex_async(request, headers, runtime)

    def verify_iotbasic_identify_ex(
        self,
        request: bot_models.VerifyIotbasicIdentifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.VerifyIotbasicIdentifyResponse:
        """
        Description: biot设备-安全认证
        Summary: biot设备-安全认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.VerifyIotbasicIdentifyResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.identify.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_iotbasic_identify_ex_async(
        self,
        request: bot_models.VerifyIotbasicIdentifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.VerifyIotbasicIdentifyResponse:
        """
        Description: biot设备-安全认证
        Summary: biot设备-安全认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.VerifyIotbasicIdentifyResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.identify.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_iotbasic_device(
        self,
        request: bot_models.UpdateIotbasicDeviceRequest,
    ) -> bot_models.UpdateIotbasicDeviceResponse:
        """
        Description: IoT设备平台-更新设备信息
        Summary: IoT设备平台-更新设备信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_iotbasic_device_ex(request, headers, runtime)

    async def update_iotbasic_device_async(
        self,
        request: bot_models.UpdateIotbasicDeviceRequest,
    ) -> bot_models.UpdateIotbasicDeviceResponse:
        """
        Description: IoT设备平台-更新设备信息
        Summary: IoT设备平台-更新设备信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_iotbasic_device_ex_async(request, headers, runtime)

    def update_iotbasic_device_ex(
        self,
        request: bot_models.UpdateIotbasicDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateIotbasicDeviceResponse:
        """
        Description: IoT设备平台-更新设备信息
        Summary: IoT设备平台-更新设备信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateIotbasicDeviceResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.device.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_iotbasic_device_ex_async(
        self,
        request: bot_models.UpdateIotbasicDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateIotbasicDeviceResponse:
        """
        Description: IoT设备平台-更新设备信息
        Summary: IoT设备平台-更新设备信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateIotbasicDeviceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.device.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_iotplatform_purchaseorder(
        self,
        request: bot_models.QueryIotplatformPurchaseorderRequest,
    ) -> bot_models.QueryIotplatformPurchaseorderResponse:
        """
        Description: 根据设备串号查询采购设备
        Summary: 根据设备串号查询采购设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_iotplatform_purchaseorder_ex(request, headers, runtime)

    async def query_iotplatform_purchaseorder_async(
        self,
        request: bot_models.QueryIotplatformPurchaseorderRequest,
    ) -> bot_models.QueryIotplatformPurchaseorderResponse:
        """
        Description: 根据设备串号查询采购设备
        Summary: 根据设备串号查询采购设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_iotplatform_purchaseorder_ex_async(request, headers, runtime)

    def query_iotplatform_purchaseorder_ex(
        self,
        request: bot_models.QueryIotplatformPurchaseorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryIotplatformPurchaseorderResponse:
        """
        Description: 根据设备串号查询采购设备
        Summary: 根据设备串号查询采购设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryIotplatformPurchaseorderResponse(),
            self.do_request('1.0', 'blockchain.bot.iotplatform.purchaseorder.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_iotplatform_purchaseorder_ex_async(
        self,
        request: bot_models.QueryIotplatformPurchaseorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryIotplatformPurchaseorderResponse:
        """
        Description: 根据设备串号查询采购设备
        Summary: 根据设备串号查询采购设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryIotplatformPurchaseorderResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotplatform.purchaseorder.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_iotplatform_meshid(
        self,
        request: bot_models.ImportIotplatformMeshidRequest,
    ) -> bot_models.ImportIotplatformMeshidResponse:
        """
        Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
        Summary: 绑定MeshId及设备SN
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_iotplatform_meshid_ex(request, headers, runtime)

    async def import_iotplatform_meshid_async(
        self,
        request: bot_models.ImportIotplatformMeshidRequest,
    ) -> bot_models.ImportIotplatformMeshidResponse:
        """
        Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
        Summary: 绑定MeshId及设备SN
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_iotplatform_meshid_ex_async(request, headers, runtime)

    def import_iotplatform_meshid_ex(
        self,
        request: bot_models.ImportIotplatformMeshidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ImportIotplatformMeshidResponse:
        """
        Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
        Summary: 绑定MeshId及设备SN
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ImportIotplatformMeshidResponse(),
            self.do_request('1.0', 'blockchain.bot.iotplatform.meshid.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_iotplatform_meshid_ex_async(
        self,
        request: bot_models.ImportIotplatformMeshidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ImportIotplatformMeshidResponse:
        """
        Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
        Summary: 绑定MeshId及设备SN
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ImportIotplatformMeshidResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotplatform.meshid.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_purchaseorder_thirdparty(
        self,
        request: bot_models.ImportPurchaseorderThirdpartyRequest,
    ) -> bot_models.ImportPurchaseorderThirdpartyResponse:
        """
        Description: 与租赁宝对接采购订单导入的接口
        Summary: 与租赁宝对接采购订单导入的接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_purchaseorder_thirdparty_ex(request, headers, runtime)

    async def import_purchaseorder_thirdparty_async(
        self,
        request: bot_models.ImportPurchaseorderThirdpartyRequest,
    ) -> bot_models.ImportPurchaseorderThirdpartyResponse:
        """
        Description: 与租赁宝对接采购订单导入的接口
        Summary: 与租赁宝对接采购订单导入的接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_purchaseorder_thirdparty_ex_async(request, headers, runtime)

    def import_purchaseorder_thirdparty_ex(
        self,
        request: bot_models.ImportPurchaseorderThirdpartyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ImportPurchaseorderThirdpartyResponse:
        """
        Description: 与租赁宝对接采购订单导入的接口
        Summary: 与租赁宝对接采购订单导入的接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ImportPurchaseorderThirdpartyResponse(),
            self.do_request('1.0', 'blockchain.bot.purchaseorder.thirdparty.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_purchaseorder_thirdparty_ex_async(
        self,
        request: bot_models.ImportPurchaseorderThirdpartyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ImportPurchaseorderThirdpartyResponse:
        """
        Description: 与租赁宝对接采购订单导入的接口
        Summary: 与租赁宝对接采购订单导入的接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ImportPurchaseorderThirdpartyResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.purchaseorder.thirdparty.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_user_role(
        self,
        request: bot_models.AddUserRoleRequest,
    ) -> bot_models.AddUserRoleResponse:
        """
        Description: 采购平台新增供应商角色
        Summary: 采购平台新增供应商角色
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_user_role_ex(request, headers, runtime)

    async def add_user_role_async(
        self,
        request: bot_models.AddUserRoleRequest,
    ) -> bot_models.AddUserRoleResponse:
        """
        Description: 采购平台新增供应商角色
        Summary: 采购平台新增供应商角色
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_user_role_ex_async(request, headers, runtime)

    def add_user_role_ex(
        self,
        request: bot_models.AddUserRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddUserRoleResponse:
        """
        Description: 采购平台新增供应商角色
        Summary: 采购平台新增供应商角色
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddUserRoleResponse(),
            self.do_request('1.0', 'blockchain.bot.user.role.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_user_role_ex_async(
        self,
        request: bot_models.AddUserRoleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddUserRoleResponse:
        """
        Description: 采购平台新增供应商角色
        Summary: 采购平台新增供应商角色
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddUserRoleResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.user.role.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_goods_sku(
        self,
        request: bot_models.AddGoodsSkuRequest,
    ) -> bot_models.AddGoodsSkuResponse:
        """
        Description: 采购平台新增SKU
        Summary: 采购平台新增SKU
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_goods_sku_ex(request, headers, runtime)

    async def add_goods_sku_async(
        self,
        request: bot_models.AddGoodsSkuRequest,
    ) -> bot_models.AddGoodsSkuResponse:
        """
        Description: 采购平台新增SKU
        Summary: 采购平台新增SKU
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_goods_sku_ex_async(request, headers, runtime)

    def add_goods_sku_ex(
        self,
        request: bot_models.AddGoodsSkuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddGoodsSkuResponse:
        """
        Description: 采购平台新增SKU
        Summary: 采购平台新增SKU
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddGoodsSkuResponse(),
            self.do_request('1.0', 'blockchain.bot.goods.sku.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_goods_sku_ex_async(
        self,
        request: bot_models.AddGoodsSkuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddGoodsSkuResponse:
        """
        Description: 采购平台新增SKU
        Summary: 采购平台新增SKU
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddGoodsSkuResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.goods.sku.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_device_datamodel(
        self,
        request: bot_models.CreateDeviceDatamodelRequest,
    ) -> bot_models.CreateDeviceDatamodelResponse:
        """
        Description: 创建数据模型
        Summary: 创建数据模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_device_datamodel_ex(request, headers, runtime)

    async def create_device_datamodel_async(
        self,
        request: bot_models.CreateDeviceDatamodelRequest,
    ) -> bot_models.CreateDeviceDatamodelResponse:
        """
        Description: 创建数据模型
        Summary: 创建数据模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_device_datamodel_ex_async(request, headers, runtime)

    def create_device_datamodel_ex(
        self,
        request: bot_models.CreateDeviceDatamodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDeviceDatamodelResponse:
        """
        Description: 创建数据模型
        Summary: 创建数据模型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateDeviceDatamodelResponse(),
            self.do_request('1.0', 'blockchain.bot.device.datamodel.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_device_datamodel_ex_async(
        self,
        request: bot_models.CreateDeviceDatamodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDeviceDatamodelResponse:
        """
        Description: 创建数据模型
        Summary: 创建数据模型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateDeviceDatamodelResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.device.datamodel.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_device_datamodel(
        self,
        request: bot_models.GetDeviceDatamodelRequest,
    ) -> bot_models.GetDeviceDatamodelResponse:
        """
        Description: 获取数据模型
        Summary: 获取数据模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_device_datamodel_ex(request, headers, runtime)

    async def get_device_datamodel_async(
        self,
        request: bot_models.GetDeviceDatamodelRequest,
    ) -> bot_models.GetDeviceDatamodelResponse:
        """
        Description: 获取数据模型
        Summary: 获取数据模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_device_datamodel_ex_async(request, headers, runtime)

    def get_device_datamodel_ex(
        self,
        request: bot_models.GetDeviceDatamodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDeviceDatamodelResponse:
        """
        Description: 获取数据模型
        Summary: 获取数据模型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.GetDeviceDatamodelResponse(),
            self.do_request('1.0', 'blockchain.bot.device.datamodel.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_device_datamodel_ex_async(
        self,
        request: bot_models.GetDeviceDatamodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDeviceDatamodelResponse:
        """
        Description: 获取数据模型
        Summary: 获取数据模型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.GetDeviceDatamodelResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.device.datamodel.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_device(
        self,
        request: bot_models.ImportDeviceRequest,
    ) -> bot_models.ImportDeviceResponse:
        """
        Description: 注册设备
        Summary: 注册设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_device_ex(request, headers, runtime)

    async def import_device_async(
        self,
        request: bot_models.ImportDeviceRequest,
    ) -> bot_models.ImportDeviceResponse:
        """
        Description: 注册设备
        Summary: 注册设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_device_ex_async(request, headers, runtime)

    def import_device_ex(
        self,
        request: bot_models.ImportDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ImportDeviceResponse:
        """
        Description: 注册设备
        Summary: 注册设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ImportDeviceResponse(),
            self.do_request('1.0', 'blockchain.bot.device.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_device_ex_async(
        self,
        request: bot_models.ImportDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ImportDeviceResponse:
        """
        Description: 注册设备
        Summary: 注册设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ImportDeviceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.device.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_device_bychainid(
        self,
        request: bot_models.GetDeviceBychainidRequest,
    ) -> bot_models.GetDeviceBychainidResponse:
        """
        Description: 通过chainId获取设备详情
        Summary: 通过chainId获取设备详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_device_bychainid_ex(request, headers, runtime)

    async def get_device_bychainid_async(
        self,
        request: bot_models.GetDeviceBychainidRequest,
    ) -> bot_models.GetDeviceBychainidResponse:
        """
        Description: 通过chainId获取设备详情
        Summary: 通过chainId获取设备详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_device_bychainid_ex_async(request, headers, runtime)

    def get_device_bychainid_ex(
        self,
        request: bot_models.GetDeviceBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDeviceBychainidResponse:
        """
        Description: 通过chainId获取设备详情
        Summary: 通过chainId获取设备详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.GetDeviceBychainidResponse(),
            self.do_request('1.0', 'blockchain.bot.device.bychainid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_device_bychainid_ex_async(
        self,
        request: bot_models.GetDeviceBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDeviceBychainidResponse:
        """
        Description: 通过chainId获取设备详情
        Summary: 通过chainId获取设备详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.GetDeviceBychainidResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.device.bychainid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_device_bydeviceid(
        self,
        request: bot_models.GetDeviceBydeviceidRequest,
    ) -> bot_models.GetDeviceBydeviceidResponse:
        """
        Description: 通过deviceId获取设备详情
        Summary: 通过deviceId获取设备详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_device_bydeviceid_ex(request, headers, runtime)

    async def get_device_bydeviceid_async(
        self,
        request: bot_models.GetDeviceBydeviceidRequest,
    ) -> bot_models.GetDeviceBydeviceidResponse:
        """
        Description: 通过deviceId获取设备详情
        Summary: 通过deviceId获取设备详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_device_bydeviceid_ex_async(request, headers, runtime)

    def get_device_bydeviceid_ex(
        self,
        request: bot_models.GetDeviceBydeviceidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDeviceBydeviceidResponse:
        """
        Description: 通过deviceId获取设备详情
        Summary: 通过deviceId获取设备详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.GetDeviceBydeviceidResponse(),
            self.do_request('1.0', 'blockchain.bot.device.bydeviceid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_device_bydeviceid_ex_async(
        self,
        request: bot_models.GetDeviceBydeviceidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDeviceBydeviceidResponse:
        """
        Description: 通过deviceId获取设备详情
        Summary: 通过deviceId获取设备详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.GetDeviceBydeviceidResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.device.bydeviceid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_device_byscene(
        self,
        request: bot_models.ListDeviceBysceneRequest,
    ) -> bot_models.ListDeviceBysceneResponse:
        """
        Description: 通过场景码列举设备
        Summary: 通过场景码列举设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_device_byscene_ex(request, headers, runtime)

    async def list_device_byscene_async(
        self,
        request: bot_models.ListDeviceBysceneRequest,
    ) -> bot_models.ListDeviceBysceneResponse:
        """
        Description: 通过场景码列举设备
        Summary: 通过场景码列举设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_device_byscene_ex_async(request, headers, runtime)

    def list_device_byscene_ex(
        self,
        request: bot_models.ListDeviceBysceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ListDeviceBysceneResponse:
        """
        Description: 通过场景码列举设备
        Summary: 通过场景码列举设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ListDeviceBysceneResponse(),
            self.do_request('1.0', 'blockchain.bot.device.byscene.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_device_byscene_ex_async(
        self,
        request: bot_models.ListDeviceBysceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ListDeviceBysceneResponse:
        """
        Description: 通过场景码列举设备
        Summary: 通过场景码列举设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ListDeviceBysceneResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.device.byscene.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_device_info(
        self,
        request: bot_models.UpdateDeviceInfoRequest,
    ) -> bot_models.UpdateDeviceInfoResponse:
        """
        Description: 更新设备信息
        Summary: 更新设备信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_device_info_ex(request, headers, runtime)

    async def update_device_info_async(
        self,
        request: bot_models.UpdateDeviceInfoRequest,
    ) -> bot_models.UpdateDeviceInfoResponse:
        """
        Description: 更新设备信息
        Summary: 更新设备信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_device_info_ex_async(request, headers, runtime)

    def update_device_info_ex(
        self,
        request: bot_models.UpdateDeviceInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateDeviceInfoResponse:
        """
        Description: 更新设备信息
        Summary: 更新设备信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateDeviceInfoResponse(),
            self.do_request('1.0', 'blockchain.bot.device.info.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_device_info_ex_async(
        self,
        request: bot_models.UpdateDeviceInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateDeviceInfoResponse:
        """
        Description: 更新设备信息
        Summary: 更新设备信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateDeviceInfoResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.device.info.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_distributedevice_bydeviceid(
        self,
        request: bot_models.CreateDistributedeviceBydeviceidRequest,
    ) -> bot_models.CreateDistributedeviceBydeviceidResponse:
        """
        Description: 通过deviceId发行设备
        Summary: 通过deviceId发行设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_distributedevice_bydeviceid_ex(request, headers, runtime)

    async def create_distributedevice_bydeviceid_async(
        self,
        request: bot_models.CreateDistributedeviceBydeviceidRequest,
    ) -> bot_models.CreateDistributedeviceBydeviceidResponse:
        """
        Description: 通过deviceId发行设备
        Summary: 通过deviceId发行设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_distributedevice_bydeviceid_ex_async(request, headers, runtime)

    def create_distributedevice_bydeviceid_ex(
        self,
        request: bot_models.CreateDistributedeviceBydeviceidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceBydeviceidResponse:
        """
        Description: 通过deviceId发行设备
        Summary: 通过deviceId发行设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateDistributedeviceBydeviceidResponse(),
            self.do_request('1.0', 'blockchain.bot.distributedevice.bydeviceid.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_distributedevice_bydeviceid_ex_async(
        self,
        request: bot_models.CreateDistributedeviceBydeviceidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceBydeviceidResponse:
        """
        Description: 通过deviceId发行设备
        Summary: 通过deviceId发行设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateDistributedeviceBydeviceidResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.bydeviceid.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_distributedevice_bychainid(
        self,
        request: bot_models.CreateDistributedeviceBychainidRequest,
    ) -> bot_models.CreateDistributedeviceBychainidResponse:
        """
        Description: 通过链上设备Id发行
        Summary: 通过链上设备Id发行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_distributedevice_bychainid_ex(request, headers, runtime)

    async def create_distributedevice_bychainid_async(
        self,
        request: bot_models.CreateDistributedeviceBychainidRequest,
    ) -> bot_models.CreateDistributedeviceBychainidResponse:
        """
        Description: 通过链上设备Id发行
        Summary: 通过链上设备Id发行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_distributedevice_bychainid_ex_async(request, headers, runtime)

    def create_distributedevice_bychainid_ex(
        self,
        request: bot_models.CreateDistributedeviceBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceBychainidResponse:
        """
        Description: 通过链上设备Id发行
        Summary: 通过链上设备Id发行
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateDistributedeviceBychainidResponse(),
            self.do_request('1.0', 'blockchain.bot.distributedevice.bychainid.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_distributedevice_bychainid_ex_async(
        self,
        request: bot_models.CreateDistributedeviceBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceBychainidResponse:
        """
        Description: 通过链上设备Id发行
        Summary: 通过链上设备Id发行
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateDistributedeviceBychainidResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.bychainid.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def replace_distributedevice_bychainid(
        self,
        request: bot_models.ReplaceDistributedeviceBychainidRequest,
    ) -> bot_models.ReplaceDistributedeviceBychainidResponse:
        """
        Description: 替换发行设备
        Summary: 替换发行设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.replace_distributedevice_bychainid_ex(request, headers, runtime)

    async def replace_distributedevice_bychainid_async(
        self,
        request: bot_models.ReplaceDistributedeviceBychainidRequest,
    ) -> bot_models.ReplaceDistributedeviceBychainidResponse:
        """
        Description: 替换发行设备
        Summary: 替换发行设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.replace_distributedevice_bychainid_ex_async(request, headers, runtime)

    def replace_distributedevice_bychainid_ex(
        self,
        request: bot_models.ReplaceDistributedeviceBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ReplaceDistributedeviceBychainidResponse:
        """
        Description: 替换发行设备
        Summary: 替换发行设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ReplaceDistributedeviceBychainidResponse(),
            self.do_request('1.0', 'blockchain.bot.distributedevice.bychainid.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def replace_distributedevice_bychainid_ex_async(
        self,
        request: bot_models.ReplaceDistributedeviceBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ReplaceDistributedeviceBychainidResponse:
        """
        Description: 替换发行设备
        Summary: 替换发行设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ReplaceDistributedeviceBychainidResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.bychainid.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_collector_bychainid(
        self,
        request: bot_models.SendCollectorBychainidRequest,
    ) -> bot_models.SendCollectorBychainidResponse:
        """
        Description: 上传单个设备所产生的设备数据
        Summary: 上传设备数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_collector_bychainid_ex(request, headers, runtime)

    async def send_collector_bychainid_async(
        self,
        request: bot_models.SendCollectorBychainidRequest,
    ) -> bot_models.SendCollectorBychainidResponse:
        """
        Description: 上传单个设备所产生的设备数据
        Summary: 上传设备数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_collector_bychainid_ex_async(request, headers, runtime)

    def send_collector_bychainid_ex(
        self,
        request: bot_models.SendCollectorBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendCollectorBychainidResponse:
        """
        Description: 上传单个设备所产生的设备数据
        Summary: 上传设备数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SendCollectorBychainidResponse(),
            self.do_request('1.0', 'blockchain.bot.collector.bychainid.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_collector_bychainid_ex_async(
        self,
        request: bot_models.SendCollectorBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendCollectorBychainidResponse:
        """
        Description: 上传单个设备所产生的设备数据
        Summary: 上传设备数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SendCollectorBychainidResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.collector.bychainid.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_distributedevice_bychainid(
        self,
        request: bot_models.GetDistributedeviceBychainidRequest,
    ) -> bot_models.GetDistributedeviceBychainidResponse:
        """
        Description: 通过Id获取发行设备
        Summary: 通过Id获取发行设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_distributedevice_bychainid_ex(request, headers, runtime)

    async def get_distributedevice_bychainid_async(
        self,
        request: bot_models.GetDistributedeviceBychainidRequest,
    ) -> bot_models.GetDistributedeviceBychainidResponse:
        """
        Description: 通过Id获取发行设备
        Summary: 通过Id获取发行设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_distributedevice_bychainid_ex_async(request, headers, runtime)

    def get_distributedevice_bychainid_ex(
        self,
        request: bot_models.GetDistributedeviceBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDistributedeviceBychainidResponse:
        """
        Description: 通过Id获取发行设备
        Summary: 通过Id获取发行设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.GetDistributedeviceBychainidResponse(),
            self.do_request('1.0', 'blockchain.bot.distributedevice.bychainid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_distributedevice_bychainid_ex_async(
        self,
        request: bot_models.GetDistributedeviceBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDistributedeviceBychainidResponse:
        """
        Description: 通过Id获取发行设备
        Summary: 通过Id获取发行设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.GetDistributedeviceBychainidResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.bychainid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_distributedevice_byscene(
        self,
        request: bot_models.ListDistributedeviceBysceneRequest,
    ) -> bot_models.ListDistributedeviceBysceneResponse:
        """
        Description: 通过场景码列举发行设备
        Summary: 通过场景码列举发行设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_distributedevice_byscene_ex(request, headers, runtime)

    async def list_distributedevice_byscene_async(
        self,
        request: bot_models.ListDistributedeviceBysceneRequest,
    ) -> bot_models.ListDistributedeviceBysceneResponse:
        """
        Description: 通过场景码列举发行设备
        Summary: 通过场景码列举发行设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_distributedevice_byscene_ex_async(request, headers, runtime)

    def list_distributedevice_byscene_ex(
        self,
        request: bot_models.ListDistributedeviceBysceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ListDistributedeviceBysceneResponse:
        """
        Description: 通过场景码列举发行设备
        Summary: 通过场景码列举发行设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ListDistributedeviceBysceneResponse(),
            self.do_request('1.0', 'blockchain.bot.distributedevice.byscene.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_distributedevice_byscene_ex_async(
        self,
        request: bot_models.ListDistributedeviceBysceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ListDistributedeviceBysceneResponse:
        """
        Description: 通过场景码列举发行设备
        Summary: 通过场景码列举发行设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ListDistributedeviceBysceneResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.byscene.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_consumer(
        self,
        request: bot_models.CreateConsumerRequest,
    ) -> bot_models.CreateConsumerResponse:
        """
        Description: 创建消费者
        Summary: 创建消费者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_consumer_ex(request, headers, runtime)

    async def create_consumer_async(
        self,
        request: bot_models.CreateConsumerRequest,
    ) -> bot_models.CreateConsumerResponse:
        """
        Description: 创建消费者
        Summary: 创建消费者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_consumer_ex_async(request, headers, runtime)

    def create_consumer_ex(
        self,
        request: bot_models.CreateConsumerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateConsumerResponse:
        """
        Description: 创建消费者
        Summary: 创建消费者
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateConsumerResponse(),
            self.do_request('1.0', 'blockchain.bot.consumer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_consumer_ex_async(
        self,
        request: bot_models.CreateConsumerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateConsumerResponse:
        """
        Description: 创建消费者
        Summary: 创建消费者
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateConsumerResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.consumer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_consumer_subscribe(
        self,
        request: bot_models.SetConsumerSubscribeRequest,
    ) -> bot_models.SetConsumerSubscribeResponse:
        """
        Description: 消费者订阅
        Summary: 消费者订阅
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_consumer_subscribe_ex(request, headers, runtime)

    async def set_consumer_subscribe_async(
        self,
        request: bot_models.SetConsumerSubscribeRequest,
    ) -> bot_models.SetConsumerSubscribeResponse:
        """
        Description: 消费者订阅
        Summary: 消费者订阅
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_consumer_subscribe_ex_async(request, headers, runtime)

    def set_consumer_subscribe_ex(
        self,
        request: bot_models.SetConsumerSubscribeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SetConsumerSubscribeResponse:
        """
        Description: 消费者订阅
        Summary: 消费者订阅
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SetConsumerSubscribeResponse(),
            self.do_request('1.0', 'blockchain.bot.consumer.subscribe.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_consumer_subscribe_ex_async(
        self,
        request: bot_models.SetConsumerSubscribeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SetConsumerSubscribeResponse:
        """
        Description: 消费者订阅
        Summary: 消费者订阅
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SetConsumerSubscribeResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.consumer.subscribe.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_consumer_unsubscribe(
        self,
        request: bot_models.SetConsumerUnsubscribeRequest,
    ) -> bot_models.SetConsumerUnsubscribeResponse:
        """
        Description: 消费者取消订阅设备
        Summary: 消费者取消订阅设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_consumer_unsubscribe_ex(request, headers, runtime)

    async def set_consumer_unsubscribe_async(
        self,
        request: bot_models.SetConsumerUnsubscribeRequest,
    ) -> bot_models.SetConsumerUnsubscribeResponse:
        """
        Description: 消费者取消订阅设备
        Summary: 消费者取消订阅设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_consumer_unsubscribe_ex_async(request, headers, runtime)

    def set_consumer_unsubscribe_ex(
        self,
        request: bot_models.SetConsumerUnsubscribeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SetConsumerUnsubscribeResponse:
        """
        Description: 消费者取消订阅设备
        Summary: 消费者取消订阅设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SetConsumerUnsubscribeResponse(),
            self.do_request('1.0', 'blockchain.bot.consumer.unsubscribe.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_consumer_unsubscribe_ex_async(
        self,
        request: bot_models.SetConsumerUnsubscribeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SetConsumerUnsubscribeResponse:
        """
        Description: 消费者取消订阅设备
        Summary: 消费者取消订阅设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SetConsumerUnsubscribeResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.consumer.unsubscribe.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pull_consumer_datasource(
        self,
        request: bot_models.PullConsumerDatasourceRequest,
    ) -> bot_models.PullConsumerDatasourceResponse:
        """
        Description: 消费者获取数据
        Summary: 消费者获取数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pull_consumer_datasource_ex(request, headers, runtime)

    async def pull_consumer_datasource_async(
        self,
        request: bot_models.PullConsumerDatasourceRequest,
    ) -> bot_models.PullConsumerDatasourceResponse:
        """
        Description: 消费者获取数据
        Summary: 消费者获取数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pull_consumer_datasource_ex_async(request, headers, runtime)

    def pull_consumer_datasource_ex(
        self,
        request: bot_models.PullConsumerDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.PullConsumerDatasourceResponse:
        """
        Description: 消费者获取数据
        Summary: 消费者获取数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.PullConsumerDatasourceResponse(),
            self.do_request('1.0', 'blockchain.bot.consumer.datasource.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pull_consumer_datasource_ex_async(
        self,
        request: bot_models.PullConsumerDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.PullConsumerDatasourceResponse:
        """
        Description: 消费者获取数据
        Summary: 消费者获取数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.PullConsumerDatasourceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.consumer.datasource.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_distributedevice_bydeviceid(
        self,
        request: bot_models.GetDistributedeviceBydeviceidRequest,
    ) -> bot_models.GetDistributedeviceBydeviceidResponse:
        """
        Description: 通过设备id获取发行设备详情
        Summary: 通过设备id获取发行设备详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_distributedevice_bydeviceid_ex(request, headers, runtime)

    async def get_distributedevice_bydeviceid_async(
        self,
        request: bot_models.GetDistributedeviceBydeviceidRequest,
    ) -> bot_models.GetDistributedeviceBydeviceidResponse:
        """
        Description: 通过设备id获取发行设备详情
        Summary: 通过设备id获取发行设备详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_distributedevice_bydeviceid_ex_async(request, headers, runtime)

    def get_distributedevice_bydeviceid_ex(
        self,
        request: bot_models.GetDistributedeviceBydeviceidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDistributedeviceBydeviceidResponse:
        """
        Description: 通过设备id获取发行设备详情
        Summary: 通过设备id获取发行设备详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.GetDistributedeviceBydeviceidResponse(),
            self.do_request('1.0', 'blockchain.bot.distributedevice.bydeviceid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_distributedevice_bydeviceid_ex_async(
        self,
        request: bot_models.GetDistributedeviceBydeviceidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDistributedeviceBydeviceidResponse:
        """
        Description: 通过设备id获取发行设备详情
        Summary: 通过设备id获取发行设备详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.GetDistributedeviceBydeviceidResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.bydeviceid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_distributedevice_bydisid(
        self,
        request: bot_models.GetDistributedeviceBydisidRequest,
    ) -> bot_models.GetDistributedeviceBydisidResponse:
        """
        Description: 通过发行id获取设备
        Summary: 通过发行id获取设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_distributedevice_bydisid_ex(request, headers, runtime)

    async def get_distributedevice_bydisid_async(
        self,
        request: bot_models.GetDistributedeviceBydisidRequest,
    ) -> bot_models.GetDistributedeviceBydisidResponse:
        """
        Description: 通过发行id获取设备
        Summary: 通过发行id获取设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_distributedevice_bydisid_ex_async(request, headers, runtime)

    def get_distributedevice_bydisid_ex(
        self,
        request: bot_models.GetDistributedeviceBydisidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDistributedeviceBydisidResponse:
        """
        Description: 通过发行id获取设备
        Summary: 通过发行id获取设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.GetDistributedeviceBydisidResponse(),
            self.do_request('1.0', 'blockchain.bot.distributedevice.bydisid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_distributedevice_bydisid_ex_async(
        self,
        request: bot_models.GetDistributedeviceBydisidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDistributedeviceBydisidResponse:
        """
        Description: 通过发行id获取设备
        Summary: 通过发行id获取设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.GetDistributedeviceBydisidResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.bydisid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_peripheral(
        self,
        request: bot_models.ImportPeripheralRequest,
    ) -> bot_models.ImportPeripheralResponse:
        """
        Description: 注册外围设备
        Summary: 注册外围设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_peripheral_ex(request, headers, runtime)

    async def import_peripheral_async(
        self,
        request: bot_models.ImportPeripheralRequest,
    ) -> bot_models.ImportPeripheralResponse:
        """
        Description: 注册外围设备
        Summary: 注册外围设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_peripheral_ex_async(request, headers, runtime)

    def import_peripheral_ex(
        self,
        request: bot_models.ImportPeripheralRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ImportPeripheralResponse:
        """
        Description: 注册外围设备
        Summary: 注册外围设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ImportPeripheralResponse(),
            self.do_request('1.0', 'blockchain.bot.peripheral.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_peripheral_ex_async(
        self,
        request: bot_models.ImportPeripheralRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ImportPeripheralResponse:
        """
        Description: 注册外围设备
        Summary: 注册外围设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ImportPeripheralResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.peripheral.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_peripheral_bychainperipheralid(
        self,
        request: bot_models.GetPeripheralBychainperipheralidRequest,
    ) -> bot_models.GetPeripheralBychainperipheralidResponse:
        """
        Description: 通过链上外围设备ID获取详情
        Summary: 通过链上外围设备ID获取详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_peripheral_bychainperipheralid_ex(request, headers, runtime)

    async def get_peripheral_bychainperipheralid_async(
        self,
        request: bot_models.GetPeripheralBychainperipheralidRequest,
    ) -> bot_models.GetPeripheralBychainperipheralidResponse:
        """
        Description: 通过链上外围设备ID获取详情
        Summary: 通过链上外围设备ID获取详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_peripheral_bychainperipheralid_ex_async(request, headers, runtime)

    def get_peripheral_bychainperipheralid_ex(
        self,
        request: bot_models.GetPeripheralBychainperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetPeripheralBychainperipheralidResponse:
        """
        Description: 通过链上外围设备ID获取详情
        Summary: 通过链上外围设备ID获取详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.GetPeripheralBychainperipheralidResponse(),
            self.do_request('1.0', 'blockchain.bot.peripheral.bychainperipheralid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_peripheral_bychainperipheralid_ex_async(
        self,
        request: bot_models.GetPeripheralBychainperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetPeripheralBychainperipheralidResponse:
        """
        Description: 通过链上外围设备ID获取详情
        Summary: 通过链上外围设备ID获取详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.GetPeripheralBychainperipheralidResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.peripheral.bychainperipheralid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_peripheral_byperipheralid(
        self,
        request: bot_models.GetPeripheralByperipheralidRequest,
    ) -> bot_models.GetPeripheralByperipheralidResponse:
        """
        Description: 通过外围设备ID获取详情
        Summary: 通过外围设备ID获取详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_peripheral_byperipheralid_ex(request, headers, runtime)

    async def get_peripheral_byperipheralid_async(
        self,
        request: bot_models.GetPeripheralByperipheralidRequest,
    ) -> bot_models.GetPeripheralByperipheralidResponse:
        """
        Description: 通过外围设备ID获取详情
        Summary: 通过外围设备ID获取详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_peripheral_byperipheralid_ex_async(request, headers, runtime)

    def get_peripheral_byperipheralid_ex(
        self,
        request: bot_models.GetPeripheralByperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetPeripheralByperipheralidResponse:
        """
        Description: 通过外围设备ID获取详情
        Summary: 通过外围设备ID获取详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.GetPeripheralByperipheralidResponse(),
            self.do_request('1.0', 'blockchain.bot.peripheral.byperipheralid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_peripheral_byperipheralid_ex_async(
        self,
        request: bot_models.GetPeripheralByperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetPeripheralByperipheralidResponse:
        """
        Description: 通过外围设备ID获取详情
        Summary: 通过外围设备ID获取详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.GetPeripheralByperipheralidResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.peripheral.byperipheralid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_peripheral_byscene(
        self,
        request: bot_models.ListPeripheralBysceneRequest,
    ) -> bot_models.ListPeripheralBysceneResponse:
        """
        Description: 根据场景列举外围设备
        Summary: 根据场景列举外围设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_peripheral_byscene_ex(request, headers, runtime)

    async def list_peripheral_byscene_async(
        self,
        request: bot_models.ListPeripheralBysceneRequest,
    ) -> bot_models.ListPeripheralBysceneResponse:
        """
        Description: 根据场景列举外围设备
        Summary: 根据场景列举外围设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_peripheral_byscene_ex_async(request, headers, runtime)

    def list_peripheral_byscene_ex(
        self,
        request: bot_models.ListPeripheralBysceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ListPeripheralBysceneResponse:
        """
        Description: 根据场景列举外围设备
        Summary: 根据场景列举外围设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ListPeripheralBysceneResponse(),
            self.do_request('1.0', 'blockchain.bot.peripheral.byscene.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_peripheral_byscene_ex_async(
        self,
        request: bot_models.ListPeripheralBysceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ListPeripheralBysceneResponse:
        """
        Description: 根据场景列举外围设备
        Summary: 根据场景列举外围设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ListPeripheralBysceneResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.peripheral.byscene.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_distributedevice_byperipheralid(
        self,
        request: bot_models.CreateDistributedeviceByperipheralidRequest,
    ) -> bot_models.CreateDistributedeviceByperipheralidResponse:
        """
        Description: 通过外围设备Id发行
        Summary: 通过外围设备Id发行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_distributedevice_byperipheralid_ex(request, headers, runtime)

    async def create_distributedevice_byperipheralid_async(
        self,
        request: bot_models.CreateDistributedeviceByperipheralidRequest,
    ) -> bot_models.CreateDistributedeviceByperipheralidResponse:
        """
        Description: 通过外围设备Id发行
        Summary: 通过外围设备Id发行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_distributedevice_byperipheralid_ex_async(request, headers, runtime)

    def create_distributedevice_byperipheralid_ex(
        self,
        request: bot_models.CreateDistributedeviceByperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceByperipheralidResponse:
        """
        Description: 通过外围设备Id发行
        Summary: 通过外围设备Id发行
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateDistributedeviceByperipheralidResponse(),
            self.do_request('1.0', 'blockchain.bot.distributedevice.byperipheralid.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_distributedevice_byperipheralid_ex_async(
        self,
        request: bot_models.CreateDistributedeviceByperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceByperipheralidResponse:
        """
        Description: 通过外围设备Id发行
        Summary: 通过外围设备Id发行
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateDistributedeviceByperipheralidResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.byperipheralid.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_distributedevice_bychainperipheralid(
        self,
        request: bot_models.CreateDistributedeviceBychainperipheralidRequest,
    ) -> bot_models.CreateDistributedeviceBychainperipheralidResponse:
        """
        Description: 通过链上外围设备Id发行
        Summary: 通过链上外围设备Id发行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_distributedevice_bychainperipheralid_ex(request, headers, runtime)

    async def create_distributedevice_bychainperipheralid_async(
        self,
        request: bot_models.CreateDistributedeviceBychainperipheralidRequest,
    ) -> bot_models.CreateDistributedeviceBychainperipheralidResponse:
        """
        Description: 通过链上外围设备Id发行
        Summary: 通过链上外围设备Id发行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_distributedevice_bychainperipheralid_ex_async(request, headers, runtime)

    def create_distributedevice_bychainperipheralid_ex(
        self,
        request: bot_models.CreateDistributedeviceBychainperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceBychainperipheralidResponse:
        """
        Description: 通过链上外围设备Id发行
        Summary: 通过链上外围设备Id发行
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateDistributedeviceBychainperipheralidResponse(),
            self.do_request('1.0', 'blockchain.bot.distributedevice.bychainperipheralid.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_distributedevice_bychainperipheralid_ex_async(
        self,
        request: bot_models.CreateDistributedeviceBychainperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceBychainperipheralidResponse:
        """
        Description: 通过链上外围设备Id发行
        Summary: 通过链上外围设备Id发行
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateDistributedeviceBychainperipheralidResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.bychainperipheralid.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def replace_distributedevice_bychainperipheralid(
        self,
        request: bot_models.ReplaceDistributedeviceBychainperipheralidRequest,
    ) -> bot_models.ReplaceDistributedeviceBychainperipheralidResponse:
        """
        Description: 替换发行外围设备 by 链上外围设备ID
        Summary: 替换发行外围设备 by 链上外围设备ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.replace_distributedevice_bychainperipheralid_ex(request, headers, runtime)

    async def replace_distributedevice_bychainperipheralid_async(
        self,
        request: bot_models.ReplaceDistributedeviceBychainperipheralidRequest,
    ) -> bot_models.ReplaceDistributedeviceBychainperipheralidResponse:
        """
        Description: 替换发行外围设备 by 链上外围设备ID
        Summary: 替换发行外围设备 by 链上外围设备ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.replace_distributedevice_bychainperipheralid_ex_async(request, headers, runtime)

    def replace_distributedevice_bychainperipheralid_ex(
        self,
        request: bot_models.ReplaceDistributedeviceBychainperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ReplaceDistributedeviceBychainperipheralidResponse:
        """
        Description: 替换发行外围设备 by 链上外围设备ID
        Summary: 替换发行外围设备 by 链上外围设备ID
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ReplaceDistributedeviceBychainperipheralidResponse(),
            self.do_request('1.0', 'blockchain.bot.distributedevice.bychainperipheralid.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def replace_distributedevice_bychainperipheralid_ex_async(
        self,
        request: bot_models.ReplaceDistributedeviceBychainperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ReplaceDistributedeviceBychainperipheralidResponse:
        """
        Description: 替换发行外围设备 by 链上外围设备ID
        Summary: 替换发行外围设备 by 链上外围设备ID
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ReplaceDistributedeviceBychainperipheralidResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.bychainperipheralid.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_distributedevice_byperipheralscene(
        self,
        request: bot_models.ListDistributedeviceByperipheralsceneRequest,
    ) -> bot_models.ListDistributedeviceByperipheralsceneResponse:
        """
        Description: 根据场景列举发行外围设备
        Summary: 根据场景列举发行外围设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_distributedevice_byperipheralscene_ex(request, headers, runtime)

    async def list_distributedevice_byperipheralscene_async(
        self,
        request: bot_models.ListDistributedeviceByperipheralsceneRequest,
    ) -> bot_models.ListDistributedeviceByperipheralsceneResponse:
        """
        Description: 根据场景列举发行外围设备
        Summary: 根据场景列举发行外围设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_distributedevice_byperipheralscene_ex_async(request, headers, runtime)

    def list_distributedevice_byperipheralscene_ex(
        self,
        request: bot_models.ListDistributedeviceByperipheralsceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ListDistributedeviceByperipheralsceneResponse:
        """
        Description: 根据场景列举发行外围设备
        Summary: 根据场景列举发行外围设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ListDistributedeviceByperipheralsceneResponse(),
            self.do_request('1.0', 'blockchain.bot.distributedevice.byperipheralscene.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_distributedevice_byperipheralscene_ex_async(
        self,
        request: bot_models.ListDistributedeviceByperipheralsceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ListDistributedeviceByperipheralsceneResponse:
        """
        Description: 根据场景列举发行外围设备
        Summary: 根据场景列举发行外围设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ListDistributedeviceByperipheralsceneResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.byperipheralscene.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_distributedevice_byperipheralid(
        self,
        request: bot_models.GetDistributedeviceByperipheralidRequest,
    ) -> bot_models.GetDistributedeviceByperipheralidResponse:
        """
        Description: 通过外围设备ID获取发行外围设备信息
        Summary: 通过外围设备ID获取发行外围设备信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_distributedevice_byperipheralid_ex(request, headers, runtime)

    async def get_distributedevice_byperipheralid_async(
        self,
        request: bot_models.GetDistributedeviceByperipheralidRequest,
    ) -> bot_models.GetDistributedeviceByperipheralidResponse:
        """
        Description: 通过外围设备ID获取发行外围设备信息
        Summary: 通过外围设备ID获取发行外围设备信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_distributedevice_byperipheralid_ex_async(request, headers, runtime)

    def get_distributedevice_byperipheralid_ex(
        self,
        request: bot_models.GetDistributedeviceByperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDistributedeviceByperipheralidResponse:
        """
        Description: 通过外围设备ID获取发行外围设备信息
        Summary: 通过外围设备ID获取发行外围设备信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.GetDistributedeviceByperipheralidResponse(),
            self.do_request('1.0', 'blockchain.bot.distributedevice.byperipheralid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_distributedevice_byperipheralid_ex_async(
        self,
        request: bot_models.GetDistributedeviceByperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDistributedeviceByperipheralidResponse:
        """
        Description: 通过外围设备ID获取发行外围设备信息
        Summary: 通过外围设备ID获取发行外围设备信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.GetDistributedeviceByperipheralidResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.byperipheralid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_distributedevice_bydevice(
        self,
        request: bot_models.CreateDistributedeviceBydeviceRequest,
    ) -> bot_models.CreateDistributedeviceBydeviceResponse:
        """
        Description: 发行设备by_devcie
        Summary: 发行设备by_devcie
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_distributedevice_bydevice_ex(request, headers, runtime)

    async def create_distributedevice_bydevice_async(
        self,
        request: bot_models.CreateDistributedeviceBydeviceRequest,
    ) -> bot_models.CreateDistributedeviceBydeviceResponse:
        """
        Description: 发行设备by_devcie
        Summary: 发行设备by_devcie
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_distributedevice_bydevice_ex_async(request, headers, runtime)

    def create_distributedevice_bydevice_ex(
        self,
        request: bot_models.CreateDistributedeviceBydeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceBydeviceResponse:
        """
        Description: 发行设备by_devcie
        Summary: 发行设备by_devcie
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateDistributedeviceBydeviceResponse(),
            self.do_request('1.0', 'blockchain.bot.distributedevice.bydevice.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_distributedevice_bydevice_ex_async(
        self,
        request: bot_models.CreateDistributedeviceBydeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceBydeviceResponse:
        """
        Description: 发行设备by_devcie
        Summary: 发行设备by_devcie
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateDistributedeviceBydeviceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.bydevice.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_task(
        self,
        request: bot_models.CreateTaskRequest,
    ) -> bot_models.CreateTaskResponse:
        """
        Description: 远程任务创建
        Summary: 远程任务创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_task_ex(request, headers, runtime)

    async def create_task_async(
        self,
        request: bot_models.CreateTaskRequest,
    ) -> bot_models.CreateTaskResponse:
        """
        Description: 远程任务创建
        Summary: 远程任务创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_task_ex_async(request, headers, runtime)

    def create_task_ex(
        self,
        request: bot_models.CreateTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateTaskResponse:
        """
        Description: 远程任务创建
        Summary: 远程任务创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateTaskResponse(),
            self.do_request('1.0', 'blockchain.bot.task.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_task_ex_async(
        self,
        request: bot_models.CreateTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateTaskResponse:
        """
        Description: 远程任务创建
        Summary: 远程任务创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateTaskResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.task.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_task(
        self,
        request: bot_models.QueryTaskRequest,
    ) -> bot_models.QueryTaskResponse:
        """
        Description: 远程任务查询
        Summary: 远程任务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_task_ex(request, headers, runtime)

    async def query_task_async(
        self,
        request: bot_models.QueryTaskRequest,
    ) -> bot_models.QueryTaskResponse:
        """
        Description: 远程任务查询
        Summary: 远程任务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_task_ex_async(request, headers, runtime)

    def query_task_ex(
        self,
        request: bot_models.QueryTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryTaskResponse:
        """
        Description: 远程任务查询
        Summary: 远程任务查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryTaskResponse(),
            self.do_request('1.0', 'blockchain.bot.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_task_ex_async(
        self,
        request: bot_models.QueryTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryTaskResponse:
        """
        Description: 远程任务查询
        Summary: 远程任务查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryTaskResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_analysis(
        self,
        request: bot_models.QueryAnalysisRequest,
    ) -> bot_models.QueryAnalysisResponse:
        """
        Description: 分析数据查询
        Summary: 分析数据查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_analysis_ex(request, headers, runtime)

    async def query_analysis_async(
        self,
        request: bot_models.QueryAnalysisRequest,
    ) -> bot_models.QueryAnalysisResponse:
        """
        Description: 分析数据查询
        Summary: 分析数据查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_analysis_ex_async(request, headers, runtime)

    def query_analysis_ex(
        self,
        request: bot_models.QueryAnalysisRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryAnalysisResponse:
        """
        Description: 分析数据查询
        Summary: 分析数据查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryAnalysisResponse(),
            self.do_request('1.0', 'blockchain.bot.analysis.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_analysis_ex_async(
        self,
        request: bot_models.QueryAnalysisRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryAnalysisResponse:
        """
        Description: 分析数据查询
        Summary: 分析数据查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryAnalysisResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.analysis.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_collector_bychainidmul(
        self,
        request: bot_models.SendCollectorBychainidmulRequest,
    ) -> bot_models.SendCollectorBychainidmulResponse:
        """
        Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
        Summary: 上传设备数据mul
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_collector_bychainidmul_ex(request, headers, runtime)

    async def send_collector_bychainidmul_async(
        self,
        request: bot_models.SendCollectorBychainidmulRequest,
    ) -> bot_models.SendCollectorBychainidmulResponse:
        """
        Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
        Summary: 上传设备数据mul
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_collector_bychainidmul_ex_async(request, headers, runtime)

    def send_collector_bychainidmul_ex(
        self,
        request: bot_models.SendCollectorBychainidmulRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendCollectorBychainidmulResponse:
        """
        Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
        Summary: 上传设备数据mul
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SendCollectorBychainidmulResponse(),
            self.do_request('1.0', 'blockchain.bot.collector.bychainidmul.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_collector_bychainidmul_ex_async(
        self,
        request: bot_models.SendCollectorBychainidmulRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendCollectorBychainidmulResponse:
        """
        Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
        Summary: 上传设备数据mul
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SendCollectorBychainidmulResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.collector.bychainidmul.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_collector_devicebizdata(
        self,
        request: bot_models.SendCollectorDevicebizdataRequest,
    ) -> bot_models.SendCollectorDevicebizdataResponse:
        """
        Description: 上传设备业务数据
        Summary: 上传设备业务数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_collector_devicebizdata_ex(request, headers, runtime)

    async def send_collector_devicebizdata_async(
        self,
        request: bot_models.SendCollectorDevicebizdataRequest,
    ) -> bot_models.SendCollectorDevicebizdataResponse:
        """
        Description: 上传设备业务数据
        Summary: 上传设备业务数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_collector_devicebizdata_ex_async(request, headers, runtime)

    def send_collector_devicebizdata_ex(
        self,
        request: bot_models.SendCollectorDevicebizdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendCollectorDevicebizdataResponse:
        """
        Description: 上传设备业务数据
        Summary: 上传设备业务数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SendCollectorDevicebizdataResponse(),
            self.do_request('1.0', 'blockchain.bot.collector.devicebizdata.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_collector_devicebizdata_ex_async(
        self,
        request: bot_models.SendCollectorDevicebizdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendCollectorDevicebizdataResponse:
        """
        Description: 上传设备业务数据
        Summary: 上传设备业务数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SendCollectorDevicebizdataResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.collector.devicebizdata.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_device_infobydevice(
        self,
        request: bot_models.UpdateDeviceInfobydeviceRequest,
    ) -> bot_models.UpdateDeviceInfobydeviceResponse:
        """
        Description: 更新设备信息by_devcie
        Summary: 更新设备信息by_devcie
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_device_infobydevice_ex(request, headers, runtime)

    async def update_device_infobydevice_async(
        self,
        request: bot_models.UpdateDeviceInfobydeviceRequest,
    ) -> bot_models.UpdateDeviceInfobydeviceResponse:
        """
        Description: 更新设备信息by_devcie
        Summary: 更新设备信息by_devcie
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_device_infobydevice_ex_async(request, headers, runtime)

    def update_device_infobydevice_ex(
        self,
        request: bot_models.UpdateDeviceInfobydeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateDeviceInfobydeviceResponse:
        """
        Description: 更新设备信息by_devcie
        Summary: 更新设备信息by_devcie
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateDeviceInfobydeviceResponse(),
            self.do_request('1.0', 'blockchain.bot.device.infobydevice.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_device_infobydevice_ex_async(
        self,
        request: bot_models.UpdateDeviceInfobydeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateDeviceInfobydeviceResponse:
        """
        Description: 更新设备信息by_devcie
        Summary: 更新设备信息by_devcie
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateDeviceInfobydeviceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.device.infobydevice.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def offline_device(
        self,
        request: bot_models.OfflineDeviceRequest,
    ) -> bot_models.OfflineDeviceResponse:
        """
        Description: 下线设备
        Summary: 下线设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.offline_device_ex(request, headers, runtime)

    async def offline_device_async(
        self,
        request: bot_models.OfflineDeviceRequest,
    ) -> bot_models.OfflineDeviceResponse:
        """
        Description: 下线设备
        Summary: 下线设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.offline_device_ex_async(request, headers, runtime)

    def offline_device_ex(
        self,
        request: bot_models.OfflineDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OfflineDeviceResponse:
        """
        Description: 下线设备
        Summary: 下线设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OfflineDeviceResponse(),
            self.do_request('1.0', 'blockchain.bot.device.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def offline_device_ex_async(
        self,
        request: bot_models.OfflineDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OfflineDeviceResponse:
        """
        Description: 下线设备
        Summary: 下线设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OfflineDeviceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.device.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_mqtoken(
        self,
        request: bot_models.ApplyMqtokenRequest,
    ) -> bot_models.ApplyMqtokenResponse:
        """
        Description: 申请MQTT token
        Summary: 申请MQTT token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_mqtoken_ex(request, headers, runtime)

    async def apply_mqtoken_async(
        self,
        request: bot_models.ApplyMqtokenRequest,
    ) -> bot_models.ApplyMqtokenResponse:
        """
        Description: 申请MQTT token
        Summary: 申请MQTT token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_mqtoken_ex_async(request, headers, runtime)

    def apply_mqtoken_ex(
        self,
        request: bot_models.ApplyMqtokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ApplyMqtokenResponse:
        """
        Description: 申请MQTT token
        Summary: 申请MQTT token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ApplyMqtokenResponse(),
            self.do_request('1.0', 'blockchain.bot.mqtoken.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_mqtoken_ex_async(
        self,
        request: bot_models.ApplyMqtokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ApplyMqtokenResponse:
        """
        Description: 申请MQTT token
        Summary: 申请MQTT token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ApplyMqtokenResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.mqtoken.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_device_registration(
        self,
        request: bot_models.QueryDeviceRegistrationRequest,
    ) -> bot_models.QueryDeviceRegistrationResponse:
        """
        Description: 查询设备所注册的公钥是否正确
        Summary: 查询注册信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_device_registration_ex(request, headers, runtime)

    async def query_device_registration_async(
        self,
        request: bot_models.QueryDeviceRegistrationRequest,
    ) -> bot_models.QueryDeviceRegistrationResponse:
        """
        Description: 查询设备所注册的公钥是否正确
        Summary: 查询注册信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_device_registration_ex_async(request, headers, runtime)

    def query_device_registration_ex(
        self,
        request: bot_models.QueryDeviceRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryDeviceRegistrationResponse:
        """
        Description: 查询设备所注册的公钥是否正确
        Summary: 查询注册信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryDeviceRegistrationResponse(),
            self.do_request('1.0', 'blockchain.bot.device.registration.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_device_registration_ex_async(
        self,
        request: bot_models.QueryDeviceRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryDeviceRegistrationResponse:
        """
        Description: 查询设备所注册的公钥是否正确
        Summary: 查询注册信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryDeviceRegistrationResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.device.registration.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_abnormal(
        self,
        request: bot_models.AddAbnormalRequest,
    ) -> bot_models.AddAbnormalResponse:
        """
        Description: 设备异常上报
        Summary: 设备异常上报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_abnormal_ex(request, headers, runtime)

    async def add_abnormal_async(
        self,
        request: bot_models.AddAbnormalRequest,
    ) -> bot_models.AddAbnormalResponse:
        """
        Description: 设备异常上报
        Summary: 设备异常上报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_abnormal_ex_async(request, headers, runtime)

    def add_abnormal_ex(
        self,
        request: bot_models.AddAbnormalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddAbnormalResponse:
        """
        Description: 设备异常上报
        Summary: 设备异常上报
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddAbnormalResponse(),
            self.do_request('1.0', 'blockchain.bot.abnormal.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_abnormal_ex_async(
        self,
        request: bot_models.AddAbnormalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddAbnormalResponse:
        """
        Description: 设备异常上报
        Summary: 设备异常上报
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddAbnormalResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.abnormal.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def online_device(
        self,
        request: bot_models.OnlineDeviceRequest,
    ) -> bot_models.OnlineDeviceResponse:
        """
        Description: 设备下线后，可通过此接口重新上线
        Summary: 设置设备状态为上线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.online_device_ex(request, headers, runtime)

    async def online_device_async(
        self,
        request: bot_models.OnlineDeviceRequest,
    ) -> bot_models.OnlineDeviceResponse:
        """
        Description: 设备下线后，可通过此接口重新上线
        Summary: 设置设备状态为上线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.online_device_ex_async(request, headers, runtime)

    def online_device_ex(
        self,
        request: bot_models.OnlineDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OnlineDeviceResponse:
        """
        Description: 设备下线后，可通过此接口重新上线
        Summary: 设置设备状态为上线
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OnlineDeviceResponse(),
            self.do_request('1.0', 'blockchain.bot.device.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def online_device_ex_async(
        self,
        request: bot_models.OnlineDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OnlineDeviceResponse:
        """
        Description: 设备下线后，可通过此接口重新上线
        Summary: 设置设备状态为上线
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OnlineDeviceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.device.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def offline_device_byunregister(
        self,
        request: bot_models.OfflineDeviceByunregisterRequest,
    ) -> bot_models.OfflineDeviceByunregisterResponse:
        """
        Description: 注销设备
        Summary: 注销设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.offline_device_byunregister_ex(request, headers, runtime)

    async def offline_device_byunregister_async(
        self,
        request: bot_models.OfflineDeviceByunregisterRequest,
    ) -> bot_models.OfflineDeviceByunregisterResponse:
        """
        Description: 注销设备
        Summary: 注销设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.offline_device_byunregister_ex_async(request, headers, runtime)

    def offline_device_byunregister_ex(
        self,
        request: bot_models.OfflineDeviceByunregisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OfflineDeviceByunregisterResponse:
        """
        Description: 注销设备
        Summary: 注销设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OfflineDeviceByunregisterResponse(),
            self.do_request('1.0', 'blockchain.bot.device.byunregister.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def offline_device_byunregister_ex_async(
        self,
        request: bot_models.OfflineDeviceByunregisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OfflineDeviceByunregisterResponse:
        """
        Description: 注销设备
        Summary: 注销设备
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.OfflineDeviceByunregisterResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.device.byunregister.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_label_trace(
        self,
        request: bot_models.QueryLabelTraceRequest,
    ) -> bot_models.QueryLabelTraceResponse:
        """
        Description: 标签状态查询
        Summary: 标签状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_label_trace_ex(request, headers, runtime)

    async def query_label_trace_async(
        self,
        request: bot_models.QueryLabelTraceRequest,
    ) -> bot_models.QueryLabelTraceResponse:
        """
        Description: 标签状态查询
        Summary: 标签状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_label_trace_ex_async(request, headers, runtime)

    def query_label_trace_ex(
        self,
        request: bot_models.QueryLabelTraceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryLabelTraceResponse:
        """
        Description: 标签状态查询
        Summary: 标签状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryLabelTraceResponse(),
            self.do_request('1.0', 'blockchain.bot.label.trace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_label_trace_ex_async(
        self,
        request: bot_models.QueryLabelTraceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryLabelTraceResponse:
        """
        Description: 标签状态查询
        Summary: 标签状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryLabelTraceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.label.trace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_label_transfer(
        self,
        request: bot_models.SyncLabelTransferRequest,
    ) -> bot_models.SyncLabelTransferResponse:
        """
        Description: 标签流转状态同步
        Summary: 标签流转状态同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_label_transfer_ex(request, headers, runtime)

    async def sync_label_transfer_async(
        self,
        request: bot_models.SyncLabelTransferRequest,
    ) -> bot_models.SyncLabelTransferResponse:
        """
        Description: 标签流转状态同步
        Summary: 标签流转状态同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_label_transfer_ex_async(request, headers, runtime)

    def sync_label_transfer_ex(
        self,
        request: bot_models.SyncLabelTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SyncLabelTransferResponse:
        """
        Description: 标签流转状态同步
        Summary: 标签流转状态同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SyncLabelTransferResponse(),
            self.do_request('1.0', 'blockchain.bot.label.transfer.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_label_transfer_ex_async(
        self,
        request: bot_models.SyncLabelTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SyncLabelTransferResponse:
        """
        Description: 标签流转状态同步
        Summary: 标签流转状态同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SyncLabelTransferResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.label.transfer.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_label_asset(
        self,
        request: bot_models.AddLabelAssetRequest,
    ) -> bot_models.AddLabelAssetResponse:
        """
        Description: 标签资产绑定
        Summary: 标签资产绑定
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_label_asset_ex(request, headers, runtime)

    async def add_label_asset_async(
        self,
        request: bot_models.AddLabelAssetRequest,
    ) -> bot_models.AddLabelAssetResponse:
        """
        Description: 标签资产绑定
        Summary: 标签资产绑定
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_label_asset_ex_async(request, headers, runtime)

    def add_label_asset_ex(
        self,
        request: bot_models.AddLabelAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddLabelAssetResponse:
        """
        Description: 标签资产绑定
        Summary: 标签资产绑定
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddLabelAssetResponse(),
            self.do_request('1.0', 'blockchain.bot.label.asset.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_label_asset_ex_async(
        self,
        request: bot_models.AddLabelAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddLabelAssetResponse:
        """
        Description: 标签资产绑定
        Summary: 标签资产绑定
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddLabelAssetResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.label.asset.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_data_bytxhash(
        self,
        request: bot_models.QueryDataBytxhashRequest,
    ) -> bot_models.QueryDataBytxhashResponse:
        """
        Description: 通过tx_hash查询上链信息
        Summary: 链上信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_data_bytxhash_ex(request, headers, runtime)

    async def query_data_bytxhash_async(
        self,
        request: bot_models.QueryDataBytxhashRequest,
    ) -> bot_models.QueryDataBytxhashResponse:
        """
        Description: 通过tx_hash查询上链信息
        Summary: 链上信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_data_bytxhash_ex_async(request, headers, runtime)

    def query_data_bytxhash_ex(
        self,
        request: bot_models.QueryDataBytxhashRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryDataBytxhashResponse:
        """
        Description: 通过tx_hash查询上链信息
        Summary: 链上信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryDataBytxhashResponse(),
            self.do_request('1.0', 'blockchain.bot.data.bytxhash.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_data_bytxhash_ex_async(
        self,
        request: bot_models.QueryDataBytxhashRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryDataBytxhashResponse:
        """
        Description: 通过tx_hash查询上链信息
        Summary: 链上信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryDataBytxhashResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.data.bytxhash.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_unprocessed_task(
        self,
        request: bot_models.ExecUnprocessedTaskRequest,
    ) -> bot_models.ExecUnprocessedTaskResponse:
        """
        Description: 根据taskId 执行未处理的任务
        Summary: 执行未处理的任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_unprocessed_task_ex(request, headers, runtime)

    async def exec_unprocessed_task_async(
        self,
        request: bot_models.ExecUnprocessedTaskRequest,
    ) -> bot_models.ExecUnprocessedTaskResponse:
        """
        Description: 根据taskId 执行未处理的任务
        Summary: 执行未处理的任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_unprocessed_task_ex_async(request, headers, runtime)

    def exec_unprocessed_task_ex(
        self,
        request: bot_models.ExecUnprocessedTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ExecUnprocessedTaskResponse:
        """
        Description: 根据taskId 执行未处理的任务
        Summary: 执行未处理的任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ExecUnprocessedTaskResponse(),
            self.do_request('1.0', 'blockchain.bot.unprocessed.task.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_unprocessed_task_ex_async(
        self,
        request: bot_models.ExecUnprocessedTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ExecUnprocessedTaskResponse:
        """
        Description: 根据taskId 执行未处理的任务
        Summary: 执行未处理的任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ExecUnprocessedTaskResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.unprocessed.task.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_collector_summarydata(
        self,
        request: bot_models.SendCollectorSummarydataRequest,
    ) -> bot_models.SendCollectorSummarydataResponse:
        """
        Description: 上传汇总数据
        Summary: 上传汇总数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_collector_summarydata_ex(request, headers, runtime)

    async def send_collector_summarydata_async(
        self,
        request: bot_models.SendCollectorSummarydataRequest,
    ) -> bot_models.SendCollectorSummarydataResponse:
        """
        Description: 上传汇总数据
        Summary: 上传汇总数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_collector_summarydata_ex_async(request, headers, runtime)

    def send_collector_summarydata_ex(
        self,
        request: bot_models.SendCollectorSummarydataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendCollectorSummarydataResponse:
        """
        Description: 上传汇总数据
        Summary: 上传汇总数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SendCollectorSummarydataResponse(),
            self.do_request('1.0', 'blockchain.bot.collector.summarydata.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_collector_summarydata_ex_async(
        self,
        request: bot_models.SendCollectorSummarydataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendCollectorSummarydataResponse:
        """
        Description: 上传汇总数据
        Summary: 上传汇总数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SendCollectorSummarydataResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.collector.summarydata.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_certificate(
        self,
        request: bot_models.AddCertificateRequest,
    ) -> bot_models.AddCertificateResponse:
        """
        Description: 根据请求体内容保存密钥
        Summary: 保存公钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_certificate_ex(request, headers, runtime)

    async def add_certificate_async(
        self,
        request: bot_models.AddCertificateRequest,
    ) -> bot_models.AddCertificateResponse:
        """
        Description: 根据请求体内容保存密钥
        Summary: 保存公钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_certificate_ex_async(request, headers, runtime)

    def add_certificate_ex(
        self,
        request: bot_models.AddCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddCertificateResponse:
        """
        Description: 根据请求体内容保存密钥
        Summary: 保存公钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddCertificateResponse(),
            self.do_request('1.0', 'blockchain.bot.certificate.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_certificate_ex_async(
        self,
        request: bot_models.AddCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddCertificateResponse:
        """
        Description: 根据请求体内容保存密钥
        Summary: 保存公钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddCertificateResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.certificate.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_tenant(
        self,
        request: bot_models.AddTenantRequest,
    ) -> bot_models.AddTenantResponse:
        """
        Description: 新增租户
        Summary: 新增租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_tenant_ex(request, headers, runtime)

    async def add_tenant_async(
        self,
        request: bot_models.AddTenantRequest,
    ) -> bot_models.AddTenantResponse:
        """
        Description: 新增租户
        Summary: 新增租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_tenant_ex_async(request, headers, runtime)

    def add_tenant_ex(
        self,
        request: bot_models.AddTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddTenantResponse:
        """
        Description: 新增租户
        Summary: 新增租户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddTenantResponse(),
            self.do_request('1.0', 'blockchain.bot.tenant.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_tenant_ex_async(
        self,
        request: bot_models.AddTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddTenantResponse:
        """
        Description: 新增租户
        Summary: 新增租户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddTenantResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.tenant.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_scene(
        self,
        request: bot_models.AddSceneRequest,
    ) -> bot_models.AddSceneResponse:
        """
        Description: 新增场景码
        Summary: 新增场景码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_scene_ex(request, headers, runtime)

    async def add_scene_async(
        self,
        request: bot_models.AddSceneRequest,
    ) -> bot_models.AddSceneResponse:
        """
        Description: 新增场景码
        Summary: 新增场景码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_scene_ex_async(request, headers, runtime)

    def add_scene_ex(
        self,
        request: bot_models.AddSceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddSceneResponse:
        """
        Description: 新增场景码
        Summary: 新增场景码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddSceneResponse(),
            self.do_request('1.0', 'blockchain.bot.scene.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_scene_ex_async(
        self,
        request: bot_models.AddSceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddSceneResponse:
        """
        Description: 新增场景码
        Summary: 新增场景码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddSceneResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.scene.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def deploy_scene(
        self,
        request: bot_models.DeploySceneRequest,
    ) -> bot_models.DeploySceneResponse:
        """
        Description: 部署场景合同
        Summary: 部署场景合同
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.deploy_scene_ex(request, headers, runtime)

    async def deploy_scene_async(
        self,
        request: bot_models.DeploySceneRequest,
    ) -> bot_models.DeploySceneResponse:
        """
        Description: 部署场景合同
        Summary: 部署场景合同
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.deploy_scene_ex_async(request, headers, runtime)

    def deploy_scene_ex(
        self,
        request: bot_models.DeploySceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.DeploySceneResponse:
        """
        Description: 部署场景合同
        Summary: 部署场景合同
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.DeploySceneResponse(),
            self.do_request('1.0', 'blockchain.bot.scene.deploy', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def deploy_scene_ex_async(
        self,
        request: bot_models.DeploySceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.DeploySceneResponse:
        """
        Description: 部署场景合同
        Summary: 部署场景合同
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.DeploySceneResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.scene.deploy', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_sdk(
        self,
        request: bot_models.AddSdkRequest,
    ) -> bot_models.AddSdkResponse:
        """
        Description: 新增sdk
        Summary: 新增sdk
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_sdk_ex(request, headers, runtime)

    async def add_sdk_async(
        self,
        request: bot_models.AddSdkRequest,
    ) -> bot_models.AddSdkResponse:
        """
        Description: 新增sdk
        Summary: 新增sdk
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_sdk_ex_async(request, headers, runtime)

    def add_sdk_ex(
        self,
        request: bot_models.AddSdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddSdkResponse:
        """
        Description: 新增sdk
        Summary: 新增sdk
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddSdkResponse(),
            self.do_request('1.0', 'blockchain.bot.sdk.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_sdk_ex_async(
        self,
        request: bot_models.AddSdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddSdkResponse:
        """
        Description: 新增sdk
        Summary: 新增sdk
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddSdkResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.sdk.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sdk(
        self,
        request: bot_models.UpdateSdkRequest,
    ) -> bot_models.UpdateSdkResponse:
        """
        Description: 更新sdk
        Summary: 更新sdk
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sdk_ex(request, headers, runtime)

    async def update_sdk_async(
        self,
        request: bot_models.UpdateSdkRequest,
    ) -> bot_models.UpdateSdkResponse:
        """
        Description: 更新sdk
        Summary: 更新sdk
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sdk_ex_async(request, headers, runtime)

    def update_sdk_ex(
        self,
        request: bot_models.UpdateSdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateSdkResponse:
        """
        Description: 更新sdk
        Summary: 更新sdk
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateSdkResponse(),
            self.do_request('1.0', 'blockchain.bot.sdk.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sdk_ex_async(
        self,
        request: bot_models.UpdateSdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateSdkResponse:
        """
        Description: 更新sdk
        Summary: 更新sdk
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateSdkResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.sdk.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_productkey(
        self,
        request: bot_models.AddProductkeyRequest,
    ) -> bot_models.AddProductkeyResponse:
        """
        Description: 新增productKey
        Summary: 新增productKey
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_productkey_ex(request, headers, runtime)

    async def add_productkey_async(
        self,
        request: bot_models.AddProductkeyRequest,
    ) -> bot_models.AddProductkeyResponse:
        """
        Description: 新增productKey
        Summary: 新增productKey
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_productkey_ex_async(request, headers, runtime)

    def add_productkey_ex(
        self,
        request: bot_models.AddProductkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddProductkeyResponse:
        """
        Description: 新增productKey
        Summary: 新增productKey
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddProductkeyResponse(),
            self.do_request('1.0', 'blockchain.bot.productkey.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_productkey_ex_async(
        self,
        request: bot_models.AddProductkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddProductkeyResponse:
        """
        Description: 新增productKey
        Summary: 新增productKey
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddProductkeyResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.productkey.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_productkey(
        self,
        request: bot_models.UpdateProductkeyRequest,
    ) -> bot_models.UpdateProductkeyResponse:
        """
        Description: 更新productKey
        Summary: 更新productKey
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_productkey_ex(request, headers, runtime)

    async def update_productkey_async(
        self,
        request: bot_models.UpdateProductkeyRequest,
    ) -> bot_models.UpdateProductkeyResponse:
        """
        Description: 更新productKey
        Summary: 更新productKey
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_productkey_ex_async(request, headers, runtime)

    def update_productkey_ex(
        self,
        request: bot_models.UpdateProductkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateProductkeyResponse:
        """
        Description: 更新productKey
        Summary: 更新productKey
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateProductkeyResponse(),
            self.do_request('1.0', 'blockchain.bot.productkey.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_productkey_ex_async(
        self,
        request: bot_models.UpdateProductkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateProductkeyResponse:
        """
        Description: 更新productKey
        Summary: 更新productKey
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateProductkeyResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.productkey.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_tenant(
        self,
        request: bot_models.UpdateTenantRequest,
    ) -> bot_models.UpdateTenantResponse:
        """
        Description: 更新租户
        Summary: 更新租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_tenant_ex(request, headers, runtime)

    async def update_tenant_async(
        self,
        request: bot_models.UpdateTenantRequest,
    ) -> bot_models.UpdateTenantResponse:
        """
        Description: 更新租户
        Summary: 更新租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_tenant_ex_async(request, headers, runtime)

    def update_tenant_ex(
        self,
        request: bot_models.UpdateTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateTenantResponse:
        """
        Description: 更新租户
        Summary: 更新租户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateTenantResponse(),
            self.do_request('1.0', 'blockchain.bot.tenant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_tenant_ex_async(
        self,
        request: bot_models.UpdateTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateTenantResponse:
        """
        Description: 更新租户
        Summary: 更新租户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateTenantResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.tenant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_scene(
        self,
        request: bot_models.UpdateSceneRequest,
    ) -> bot_models.UpdateSceneResponse:
        """
        Description: 更新场景码
        Summary: 更新场景码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_scene_ex(request, headers, runtime)

    async def update_scene_async(
        self,
        request: bot_models.UpdateSceneRequest,
    ) -> bot_models.UpdateSceneResponse:
        """
        Description: 更新场景码
        Summary: 更新场景码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_scene_ex_async(request, headers, runtime)

    def update_scene_ex(
        self,
        request: bot_models.UpdateSceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateSceneResponse:
        """
        Description: 更新场景码
        Summary: 更新场景码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateSceneResponse(),
            self.do_request('1.0', 'blockchain.bot.scene.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_scene_ex_async(
        self,
        request: bot_models.UpdateSceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateSceneResponse:
        """
        Description: 更新场景码
        Summary: 更新场景码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateSceneResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.scene.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_label_transferonasync(
        self,
        request: bot_models.SendLabelTransferonasyncRequest,
    ) -> bot_models.SendLabelTransferonasyncResponse:
        """
        Description: 上报标签流转的异步接口，是 blockchain.bot.label.transfer.sync的异步接口版本
        Summary: 上报标签流转的异步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_label_transferonasync_ex(request, headers, runtime)

    async def send_label_transferonasync_async(
        self,
        request: bot_models.SendLabelTransferonasyncRequest,
    ) -> bot_models.SendLabelTransferonasyncResponse:
        """
        Description: 上报标签流转的异步接口，是 blockchain.bot.label.transfer.sync的异步接口版本
        Summary: 上报标签流转的异步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_label_transferonasync_ex_async(request, headers, runtime)

    def send_label_transferonasync_ex(
        self,
        request: bot_models.SendLabelTransferonasyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendLabelTransferonasyncResponse:
        """
        Description: 上报标签流转的异步接口，是 blockchain.bot.label.transfer.sync的异步接口版本
        Summary: 上报标签流转的异步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SendLabelTransferonasyncResponse(),
            self.do_request('1.0', 'blockchain.bot.label.transferonasync.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_label_transferonasync_ex_async(
        self,
        request: bot_models.SendLabelTransferonasyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendLabelTransferonasyncResponse:
        """
        Description: 上报标签流转的异步接口，是 blockchain.bot.label.transfer.sync的异步接口版本
        Summary: 上报标签流转的异步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SendLabelTransferonasyncResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.label.transferonasync.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_async_request(
        self,
        request: bot_models.QueryAsyncRequestRequest,
    ) -> bot_models.QueryAsyncRequestResponse:
        """
        Description: 调用异步接口后，在reponsePeriod 天内，可调用此接口查询异步接口的执行结果
        Summary: 异步接口结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_async_request_ex(request, headers, runtime)

    async def query_async_request_async(
        self,
        request: bot_models.QueryAsyncRequestRequest,
    ) -> bot_models.QueryAsyncRequestResponse:
        """
        Description: 调用异步接口后，在reponsePeriod 天内，可调用此接口查询异步接口的执行结果
        Summary: 异步接口结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_async_request_ex_async(request, headers, runtime)

    def query_async_request_ex(
        self,
        request: bot_models.QueryAsyncRequestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryAsyncRequestResponse:
        """
        Description: 调用异步接口后，在reponsePeriod 天内，可调用此接口查询异步接口的执行结果
        Summary: 异步接口结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryAsyncRequestResponse(),
            self.do_request('1.0', 'blockchain.bot.async.request.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_async_request_ex_async(
        self,
        request: bot_models.QueryAsyncRequestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryAsyncRequestResponse:
        """
        Description: 调用异步接口后，在reponsePeriod 天内，可调用此接口查询异步接口的执行结果
        Summary: 异步接口结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryAsyncRequestResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.async.request.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_tenant(
        self,
        request: bot_models.PagequeryTenantRequest,
    ) -> bot_models.PagequeryTenantResponse:
        """
        Description: 分页查询租户
        Summary: 分页查询租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_tenant_ex(request, headers, runtime)

    async def pagequery_tenant_async(
        self,
        request: bot_models.PagequeryTenantRequest,
    ) -> bot_models.PagequeryTenantResponse:
        """
        Description: 分页查询租户
        Summary: 分页查询租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_tenant_ex_async(request, headers, runtime)

    def pagequery_tenant_ex(
        self,
        request: bot_models.PagequeryTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.PagequeryTenantResponse:
        """
        Description: 分页查询租户
        Summary: 分页查询租户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.PagequeryTenantResponse(),
            self.do_request('1.0', 'blockchain.bot.tenant.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_tenant_ex_async(
        self,
        request: bot_models.PagequeryTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.PagequeryTenantResponse:
        """
        Description: 分页查询租户
        Summary: 分页查询租户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.PagequeryTenantResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.tenant.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_scene(
        self,
        request: bot_models.PagequerySceneRequest,
    ) -> bot_models.PagequerySceneResponse:
        """
        Description: 分页查询场景码
        Summary: 分页查询场景码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_scene_ex(request, headers, runtime)

    async def pagequery_scene_async(
        self,
        request: bot_models.PagequerySceneRequest,
    ) -> bot_models.PagequerySceneResponse:
        """
        Description: 分页查询场景码
        Summary: 分页查询场景码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_scene_ex_async(request, headers, runtime)

    def pagequery_scene_ex(
        self,
        request: bot_models.PagequerySceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.PagequerySceneResponse:
        """
        Description: 分页查询场景码
        Summary: 分页查询场景码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.PagequerySceneResponse(),
            self.do_request('1.0', 'blockchain.bot.scene.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_scene_ex_async(
        self,
        request: bot_models.PagequerySceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.PagequerySceneResponse:
        """
        Description: 分页查询场景码
        Summary: 分页查询场景码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.PagequerySceneResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.scene.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_sdk(
        self,
        request: bot_models.PagequerySdkRequest,
    ) -> bot_models.PagequerySdkResponse:
        """
        Description: 分页查询sdk
        Summary: 分页查询sdk
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_sdk_ex(request, headers, runtime)

    async def pagequery_sdk_async(
        self,
        request: bot_models.PagequerySdkRequest,
    ) -> bot_models.PagequerySdkResponse:
        """
        Description: 分页查询sdk
        Summary: 分页查询sdk
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_sdk_ex_async(request, headers, runtime)

    def pagequery_sdk_ex(
        self,
        request: bot_models.PagequerySdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.PagequerySdkResponse:
        """
        Description: 分页查询sdk
        Summary: 分页查询sdk
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.PagequerySdkResponse(),
            self.do_request('1.0', 'blockchain.bot.sdk.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_sdk_ex_async(
        self,
        request: bot_models.PagequerySdkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.PagequerySdkResponse:
        """
        Description: 分页查询sdk
        Summary: 分页查询sdk
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.PagequerySdkResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.sdk.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_productkey(
        self,
        request: bot_models.PagequeryProductkeyRequest,
    ) -> bot_models.PagequeryProductkeyResponse:
        """
        Description: 分页查询productKey
        Summary: 分页查询productKey
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_productkey_ex(request, headers, runtime)

    async def pagequery_productkey_async(
        self,
        request: bot_models.PagequeryProductkeyRequest,
    ) -> bot_models.PagequeryProductkeyResponse:
        """
        Description: 分页查询productKey
        Summary: 分页查询productKey
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_productkey_ex_async(request, headers, runtime)

    def pagequery_productkey_ex(
        self,
        request: bot_models.PagequeryProductkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.PagequeryProductkeyResponse:
        """
        Description: 分页查询productKey
        Summary: 分页查询productKey
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.PagequeryProductkeyResponse(),
            self.do_request('1.0', 'blockchain.bot.productkey.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_productkey_ex_async(
        self,
        request: bot_models.PagequeryProductkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.PagequeryProductkeyResponse:
        """
        Description: 分页查询productKey
        Summary: 分页查询productKey
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.PagequeryProductkeyResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.productkey.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_dataverify_failure(
        self,
        request: bot_models.PagequeryDataverifyFailureRequest,
    ) -> bot_models.PagequeryDataverifyFailureResponse:
        """
        Description: 分页查询校验失败的数据
        Summary: 分页查询校验失败的数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_dataverify_failure_ex(request, headers, runtime)

    async def pagequery_dataverify_failure_async(
        self,
        request: bot_models.PagequeryDataverifyFailureRequest,
    ) -> bot_models.PagequeryDataverifyFailureResponse:
        """
        Description: 分页查询校验失败的数据
        Summary: 分页查询校验失败的数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_dataverify_failure_ex_async(request, headers, runtime)

    def pagequery_dataverify_failure_ex(
        self,
        request: bot_models.PagequeryDataverifyFailureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.PagequeryDataverifyFailureResponse:
        """
        Description: 分页查询校验失败的数据
        Summary: 分页查询校验失败的数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.PagequeryDataverifyFailureResponse(),
            self.do_request('1.0', 'blockchain.bot.dataverify.failure.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_dataverify_failure_ex_async(
        self,
        request: bot_models.PagequeryDataverifyFailureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.PagequeryDataverifyFailureResponse:
        """
        Description: 分页查询校验失败的数据
        Summary: 分页查询校验失败的数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.PagequeryDataverifyFailureResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.dataverify.failure.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_alert_strategy(
        self,
        request: bot_models.AddAlertStrategyRequest,
    ) -> bot_models.AddAlertStrategyResponse:
        """
        Description:  新增告警策略
        Summary:  新增告警策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_alert_strategy_ex(request, headers, runtime)

    async def add_alert_strategy_async(
        self,
        request: bot_models.AddAlertStrategyRequest,
    ) -> bot_models.AddAlertStrategyResponse:
        """
        Description:  新增告警策略
        Summary:  新增告警策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_alert_strategy_ex_async(request, headers, runtime)

    def add_alert_strategy_ex(
        self,
        request: bot_models.AddAlertStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddAlertStrategyResponse:
        """
        Description:  新增告警策略
        Summary:  新增告警策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddAlertStrategyResponse(),
            self.do_request('1.0', 'blockchain.bot.alert.strategy.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_alert_strategy_ex_async(
        self,
        request: bot_models.AddAlertStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddAlertStrategyResponse:
        """
        Description:  新增告警策略
        Summary:  新增告警策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.AddAlertStrategyResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.alert.strategy.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_alert_strategy(
        self,
        request: bot_models.UpdateAlertStrategyRequest,
    ) -> bot_models.UpdateAlertStrategyResponse:
        """
        Description: 更新告警策略接口
        Summary: 更新告警策略接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_alert_strategy_ex(request, headers, runtime)

    async def update_alert_strategy_async(
        self,
        request: bot_models.UpdateAlertStrategyRequest,
    ) -> bot_models.UpdateAlertStrategyResponse:
        """
        Description: 更新告警策略接口
        Summary: 更新告警策略接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_alert_strategy_ex_async(request, headers, runtime)

    def update_alert_strategy_ex(
        self,
        request: bot_models.UpdateAlertStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateAlertStrategyResponse:
        """
        Description: 更新告警策略接口
        Summary: 更新告警策略接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateAlertStrategyResponse(),
            self.do_request('1.0', 'blockchain.bot.alert.strategy.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_alert_strategy_ex_async(
        self,
        request: bot_models.UpdateAlertStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateAlertStrategyResponse:
        """
        Description: 更新告警策略接口
        Summary: 更新告警策略接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateAlertStrategyResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.alert.strategy.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_alert_strategy(
        self,
        request: bot_models.PagequeryAlertStrategyRequest,
    ) -> bot_models.PagequeryAlertStrategyResponse:
        """
        Description: 分页查询告警策略接口
        Summary: 分页查询告警策略接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_alert_strategy_ex(request, headers, runtime)

    async def pagequery_alert_strategy_async(
        self,
        request: bot_models.PagequeryAlertStrategyRequest,
    ) -> bot_models.PagequeryAlertStrategyResponse:
        """
        Description: 分页查询告警策略接口
        Summary: 分页查询告警策略接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_alert_strategy_ex_async(request, headers, runtime)

    def pagequery_alert_strategy_ex(
        self,
        request: bot_models.PagequeryAlertStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.PagequeryAlertStrategyResponse:
        """
        Description: 分页查询告警策略接口
        Summary: 分页查询告警策略接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.PagequeryAlertStrategyResponse(),
            self.do_request('1.0', 'blockchain.bot.alert.strategy.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_alert_strategy_ex_async(
        self,
        request: bot_models.PagequeryAlertStrategyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.PagequeryAlertStrategyResponse:
        """
        Description: 分页查询告警策略接口
        Summary: 分页查询告警策略接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.PagequeryAlertStrategyResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.alert.strategy.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_label_transferraw(
        self,
        request: bot_models.SyncLabelTransferrawRequest,
    ) -> bot_models.SyncLabelTransferrawResponse:
        """
        Description: 标签流转状态同步（元数据，无签名）
        Summary: 标签流转状态同步（元数据，无签名）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_label_transferraw_ex(request, headers, runtime)

    async def sync_label_transferraw_async(
        self,
        request: bot_models.SyncLabelTransferrawRequest,
    ) -> bot_models.SyncLabelTransferrawResponse:
        """
        Description: 标签流转状态同步（元数据，无签名）
        Summary: 标签流转状态同步（元数据，无签名）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_label_transferraw_ex_async(request, headers, runtime)

    def sync_label_transferraw_ex(
        self,
        request: bot_models.SyncLabelTransferrawRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SyncLabelTransferrawResponse:
        """
        Description: 标签流转状态同步（元数据，无签名）
        Summary: 标签流转状态同步（元数据，无签名）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SyncLabelTransferrawResponse(),
            self.do_request('1.0', 'blockchain.bot.label.transferraw.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_label_transferraw_ex_async(
        self,
        request: bot_models.SyncLabelTransferrawRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SyncLabelTransferrawResponse:
        """
        Description: 标签流转状态同步（元数据，无签名）
        Summary: 标签流转状态同步（元数据，无签名）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SyncLabelTransferrawResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.label.transferraw.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_label_transferrawonasync(
        self,
        request: bot_models.SendLabelTransferrawonasyncRequest,
    ) -> bot_models.SendLabelTransferrawonasyncResponse:
        """
        Description: 上报标签流转的异步接口（元数据，无签名），是 blockchain.bot.label.transferraw.sync的异步接口版本
        Summary: 上报标签流转的异步接口（元数据，无签名）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_label_transferrawonasync_ex(request, headers, runtime)

    async def send_label_transferrawonasync_async(
        self,
        request: bot_models.SendLabelTransferrawonasyncRequest,
    ) -> bot_models.SendLabelTransferrawonasyncResponse:
        """
        Description: 上报标签流转的异步接口（元数据，无签名），是 blockchain.bot.label.transferraw.sync的异步接口版本
        Summary: 上报标签流转的异步接口（元数据，无签名）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_label_transferrawonasync_ex_async(request, headers, runtime)

    def send_label_transferrawonasync_ex(
        self,
        request: bot_models.SendLabelTransferrawonasyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendLabelTransferrawonasyncResponse:
        """
        Description: 上报标签流转的异步接口（元数据，无签名），是 blockchain.bot.label.transferraw.sync的异步接口版本
        Summary: 上报标签流转的异步接口（元数据，无签名）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SendLabelTransferrawonasyncResponse(),
            self.do_request('1.0', 'blockchain.bot.label.transferrawonasync.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_label_transferrawonasync_ex_async(
        self,
        request: bot_models.SendLabelTransferrawonasyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendLabelTransferrawonasyncResponse:
        """
        Description: 上报标签流转的异步接口（元数据，无签名），是 blockchain.bot.label.transferraw.sync的异步接口版本
        Summary: 上报标签流转的异步接口（元数据，无签名）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.SendLabelTransferrawonasyncResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.label.transferrawonasync.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_docked_data(
        self,
        request: bot_models.QueryDockedDataRequest,
    ) -> bot_models.QueryDockedDataResponse:
        """
        Description: 根据接口名和关键key（deviceId等）, 查询验收已对接的数据
        Summary: 查询验收已对接的数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_docked_data_ex(request, headers, runtime)

    async def query_docked_data_async(
        self,
        request: bot_models.QueryDockedDataRequest,
    ) -> bot_models.QueryDockedDataResponse:
        """
        Description: 根据接口名和关键key（deviceId等）, 查询验收已对接的数据
        Summary: 查询验收已对接的数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_docked_data_ex_async(request, headers, runtime)

    def query_docked_data_ex(
        self,
        request: bot_models.QueryDockedDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryDockedDataResponse:
        """
        Description: 根据接口名和关键key（deviceId等）, 查询验收已对接的数据
        Summary: 查询验收已对接的数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryDockedDataResponse(),
            self.do_request('1.0', 'blockchain.bot.docked.data.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_docked_data_ex_async(
        self,
        request: bot_models.QueryDockedDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryDockedDataResponse:
        """
        Description: 根据接口名和关键key（deviceId等）, 查询验收已对接的数据
        Summary: 查询验收已对接的数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryDockedDataResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.docked.data.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_device_relation(
        self,
        request: bot_models.CreateDeviceRelationRequest,
    ) -> bot_models.CreateDeviceRelationResponse:
        """
        Description: 创建实体关联关系
        Summary: 创建实体关联关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_device_relation_ex(request, headers, runtime)

    async def create_device_relation_async(
        self,
        request: bot_models.CreateDeviceRelationRequest,
    ) -> bot_models.CreateDeviceRelationResponse:
        """
        Description: 创建实体关联关系
        Summary: 创建实体关联关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_device_relation_ex_async(request, headers, runtime)

    def create_device_relation_ex(
        self,
        request: bot_models.CreateDeviceRelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDeviceRelationResponse:
        """
        Description: 创建实体关联关系
        Summary: 创建实体关联关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateDeviceRelationResponse(),
            self.do_request('1.0', 'blockchain.bot.device.relation.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_device_relation_ex_async(
        self,
        request: bot_models.CreateDeviceRelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDeviceRelationResponse:
        """
        Description: 创建实体关联关系
        Summary: 创建实体关联关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateDeviceRelationResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.device.relation.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_device_relation(
        self,
        request: bot_models.DeleteDeviceRelationRequest,
    ) -> bot_models.DeleteDeviceRelationResponse:
        """
        Description: 删除实体关联关系
        Summary: 删除实体关联关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_device_relation_ex(request, headers, runtime)

    async def delete_device_relation_async(
        self,
        request: bot_models.DeleteDeviceRelationRequest,
    ) -> bot_models.DeleteDeviceRelationResponse:
        """
        Description: 删除实体关联关系
        Summary: 删除实体关联关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_device_relation_ex_async(request, headers, runtime)

    def delete_device_relation_ex(
        self,
        request: bot_models.DeleteDeviceRelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.DeleteDeviceRelationResponse:
        """
        Description: 删除实体关联关系
        Summary: 删除实体关联关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.DeleteDeviceRelationResponse(),
            self.do_request('1.0', 'blockchain.bot.device.relation.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_device_relation_ex_async(
        self,
        request: bot_models.DeleteDeviceRelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.DeleteDeviceRelationResponse:
        """
        Description: 删除实体关联关系
        Summary: 删除实体关联关系
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.DeleteDeviceRelationResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.device.relation.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_collectot_bychainid(
        self,
        request: bot_models.PushCollectotBychainidRequest,
    ) -> bot_models.PushCollectotBychainidResponse:
        """
        Description: 推送单个设备所产生的设备数据
        Summary: 推送设备数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_collectot_bychainid_ex(request, headers, runtime)

    async def push_collectot_bychainid_async(
        self,
        request: bot_models.PushCollectotBychainidRequest,
    ) -> bot_models.PushCollectotBychainidResponse:
        """
        Description: 推送单个设备所产生的设备数据
        Summary: 推送设备数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_collectot_bychainid_ex_async(request, headers, runtime)

    def push_collectot_bychainid_ex(
        self,
        request: bot_models.PushCollectotBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.PushCollectotBychainidResponse:
        """
        Description: 推送单个设备所产生的设备数据
        Summary: 推送设备数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.PushCollectotBychainidResponse(),
            self.do_request('1.0', 'blockchain.bot.collectot.bychainid.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_collectot_bychainid_ex_async(
        self,
        request: bot_models.PushCollectotBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.PushCollectotBychainidResponse:
        """
        Description: 推送单个设备所产生的设备数据
        Summary: 推送设备数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.PushCollectotBychainidResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.collectot.bychainid.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_pullstrategy_changestatus(
        self,
        request: bot_models.NotifyPullstrategyChangestatusRequest,
    ) -> bot_models.NotifyPullstrategyChangestatusResponse:
        """
        Description: 推送设备状态变更信息
        Summary: 推送设备状态变更信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_pullstrategy_changestatus_ex(request, headers, runtime)

    async def notify_pullstrategy_changestatus_async(
        self,
        request: bot_models.NotifyPullstrategyChangestatusRequest,
    ) -> bot_models.NotifyPullstrategyChangestatusResponse:
        """
        Description: 推送设备状态变更信息
        Summary: 推送设备状态变更信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_pullstrategy_changestatus_ex_async(request, headers, runtime)

    def notify_pullstrategy_changestatus_ex(
        self,
        request: bot_models.NotifyPullstrategyChangestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.NotifyPullstrategyChangestatusResponse:
        """
        Description: 推送设备状态变更信息
        Summary: 推送设备状态变更信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.NotifyPullstrategyChangestatusResponse(),
            self.do_request('1.0', 'blockchain.bot.pullstrategy.changestatus.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_pullstrategy_changestatus_ex_async(
        self,
        request: bot_models.NotifyPullstrategyChangestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.NotifyPullstrategyChangestatusResponse:
        """
        Description: 推送设备状态变更信息
        Summary: 推送设备状态变更信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.NotifyPullstrategyChangestatusResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.pullstrategy.changestatus.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_pullstrategy_chargeorderinfo(
        self,
        request: bot_models.NotifyPullstrategyChargeorderinfoRequest,
    ) -> bot_models.NotifyPullstrategyChargeorderinfoResponse:
        """
        Description: 推送订单信息
        Summary: 推送订单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_pullstrategy_chargeorderinfo_ex(request, headers, runtime)

    async def notify_pullstrategy_chargeorderinfo_async(
        self,
        request: bot_models.NotifyPullstrategyChargeorderinfoRequest,
    ) -> bot_models.NotifyPullstrategyChargeorderinfoResponse:
        """
        Description: 推送订单信息
        Summary: 推送订单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_pullstrategy_chargeorderinfo_ex_async(request, headers, runtime)

    def notify_pullstrategy_chargeorderinfo_ex(
        self,
        request: bot_models.NotifyPullstrategyChargeorderinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.NotifyPullstrategyChargeorderinfoResponse:
        """
        Description: 推送订单信息
        Summary: 推送订单信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.NotifyPullstrategyChargeorderinfoResponse(),
            self.do_request('1.0', 'blockchain.bot.pullstrategy.chargeorderinfo.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_pullstrategy_chargeorderinfo_ex_async(
        self,
        request: bot_models.NotifyPullstrategyChargeorderinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.NotifyPullstrategyChargeorderinfoResponse:
        """
        Description: 推送订单信息
        Summary: 推送订单信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.NotifyPullstrategyChargeorderinfoResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.pullstrategy.chargeorderinfo.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_scflease_eqpinfo(
        self,
        request: bot_models.QueryScfleaseEqpinfoRequest,
    ) -> bot_models.QueryScfleaseEqpinfoResponse:
        """
        Description: 菜鸟设备监控信息获取
        Summary: 菜鸟设备监控信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_scflease_eqpinfo_ex(request, headers, runtime)

    async def query_scflease_eqpinfo_async(
        self,
        request: bot_models.QueryScfleaseEqpinfoRequest,
    ) -> bot_models.QueryScfleaseEqpinfoResponse:
        """
        Description: 菜鸟设备监控信息获取
        Summary: 菜鸟设备监控信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_scflease_eqpinfo_ex_async(request, headers, runtime)

    def query_scflease_eqpinfo_ex(
        self,
        request: bot_models.QueryScfleaseEqpinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryScfleaseEqpinfoResponse:
        """
        Description: 菜鸟设备监控信息获取
        Summary: 菜鸟设备监控信息获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryScfleaseEqpinfoResponse(),
            self.do_request('1.0', 'blockchain.bot.scflease.eqpinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_scflease_eqpinfo_ex_async(
        self,
        request: bot_models.QueryScfleaseEqpinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryScfleaseEqpinfoResponse:
        """
        Description: 菜鸟设备监控信息获取
        Summary: 菜鸟设备监控信息获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryScfleaseEqpinfoResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.scflease.eqpinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_customer_entity(
        self,
        request: bot_models.CreateCustomerEntityRequest,
    ) -> bot_models.CreateCustomerEntityResponse:
        """
        Description: 创建自定义的实体数据
        Summary: 创建自定义实体
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_customer_entity_ex(request, headers, runtime)

    async def create_customer_entity_async(
        self,
        request: bot_models.CreateCustomerEntityRequest,
    ) -> bot_models.CreateCustomerEntityResponse:
        """
        Description: 创建自定义的实体数据
        Summary: 创建自定义实体
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_customer_entity_ex_async(request, headers, runtime)

    def create_customer_entity_ex(
        self,
        request: bot_models.CreateCustomerEntityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateCustomerEntityResponse:
        """
        Description: 创建自定义的实体数据
        Summary: 创建自定义实体
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateCustomerEntityResponse(),
            self.do_request('1.0', 'blockchain.bot.customer.entity.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_customer_entity_ex_async(
        self,
        request: bot_models.CreateCustomerEntityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateCustomerEntityResponse:
        """
        Description: 创建自定义的实体数据
        Summary: 创建自定义实体
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateCustomerEntityResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.customer.entity.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_customer_entity(
        self,
        request: bot_models.UpdateCustomerEntityRequest,
    ) -> bot_models.UpdateCustomerEntityResponse:
        """
        Description: 更新自定义实体，通过场景码+实体ID来更新 实体内容或实体名称
        Summary: 更新自定义实体
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_customer_entity_ex(request, headers, runtime)

    async def update_customer_entity_async(
        self,
        request: bot_models.UpdateCustomerEntityRequest,
    ) -> bot_models.UpdateCustomerEntityResponse:
        """
        Description: 更新自定义实体，通过场景码+实体ID来更新 实体内容或实体名称
        Summary: 更新自定义实体
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_customer_entity_ex_async(request, headers, runtime)

    def update_customer_entity_ex(
        self,
        request: bot_models.UpdateCustomerEntityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateCustomerEntityResponse:
        """
        Description: 更新自定义实体，通过场景码+实体ID来更新 实体内容或实体名称
        Summary: 更新自定义实体
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateCustomerEntityResponse(),
            self.do_request('1.0', 'blockchain.bot.customer.entity.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_customer_entity_ex_async(
        self,
        request: bot_models.UpdateCustomerEntityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateCustomerEntityResponse:
        """
        Description: 更新自定义实体，通过场景码+实体ID来更新 实体内容或实体名称
        Summary: 更新自定义实体
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateCustomerEntityResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.customer.entity.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_thingmodel(
        self,
        request: bot_models.CreateThingmodelRequest,
    ) -> bot_models.CreateThingmodelResponse:
        """
        Description: 为租户创建物模型
        Summary: 为租户创建物模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_thingmodel_ex(request, headers, runtime)

    async def create_thingmodel_async(
        self,
        request: bot_models.CreateThingmodelRequest,
    ) -> bot_models.CreateThingmodelResponse:
        """
        Description: 为租户创建物模型
        Summary: 为租户创建物模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_thingmodel_ex_async(request, headers, runtime)

    def create_thingmodel_ex(
        self,
        request: bot_models.CreateThingmodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateThingmodelResponse:
        """
        Description: 为租户创建物模型
        Summary: 为租户创建物模型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateThingmodelResponse(),
            self.do_request('1.0', 'blockchain.bot.thingmodel.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_thingmodel_ex_async(
        self,
        request: bot_models.CreateThingmodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateThingmodelResponse:
        """
        Description: 为租户创建物模型
        Summary: 为租户创建物模型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateThingmodelResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.thingmodel.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_thingmodel(
        self,
        request: bot_models.QueryThingmodelRequest,
    ) -> bot_models.QueryThingmodelResponse:
        """
        Description: 查询租户的物模型
        Summary: 查询租户的物模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_thingmodel_ex(request, headers, runtime)

    async def query_thingmodel_async(
        self,
        request: bot_models.QueryThingmodelRequest,
    ) -> bot_models.QueryThingmodelResponse:
        """
        Description: 查询租户的物模型
        Summary: 查询租户的物模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_thingmodel_ex_async(request, headers, runtime)

    def query_thingmodel_ex(
        self,
        request: bot_models.QueryThingmodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryThingmodelResponse:
        """
        Description: 查询租户的物模型
        Summary: 查询租户的物模型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryThingmodelResponse(),
            self.do_request('1.0', 'blockchain.bot.thingmodel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_thingmodel_ex_async(
        self,
        request: bot_models.QueryThingmodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryThingmodelResponse:
        """
        Description: 查询租户的物模型
        Summary: 查询租户的物模型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryThingmodelResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.thingmodel.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_thingsdid_oneapi(
        self,
        request: bot_models.ExecThingsdidOneapiRequest,
    ) -> bot_models.ExecThingsdidOneapiResponse:
        """
        Description: 信物链oneapi
        Summary: 信物链oneapi
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_thingsdid_oneapi_ex(request, headers, runtime)

    async def exec_thingsdid_oneapi_async(
        self,
        request: bot_models.ExecThingsdidOneapiRequest,
    ) -> bot_models.ExecThingsdidOneapiResponse:
        """
        Description: 信物链oneapi
        Summary: 信物链oneapi
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_thingsdid_oneapi_ex_async(request, headers, runtime)

    def exec_thingsdid_oneapi_ex(
        self,
        request: bot_models.ExecThingsdidOneapiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ExecThingsdidOneapiResponse:
        """
        Description: 信物链oneapi
        Summary: 信物链oneapi
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ExecThingsdidOneapiResponse(),
            self.do_request('1.0', 'blockchain.bot.thingsdid.oneapi.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_thingsdid_oneapi_ex_async(
        self,
        request: bot_models.ExecThingsdidOneapiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ExecThingsdidOneapiResponse:
        """
        Description: 信物链oneapi
        Summary: 信物链oneapi
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.ExecThingsdidOneapiResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.thingsdid.oneapi.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_evidence_store(
        self,
        request: bot_models.StartEvidenceStoreRequest,
    ) -> bot_models.StartEvidenceStoreResponse:
        """
        Description: 信物链存证
        Summary: 信物链存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_evidence_store_ex(request, headers, runtime)

    async def start_evidence_store_async(
        self,
        request: bot_models.StartEvidenceStoreRequest,
    ) -> bot_models.StartEvidenceStoreResponse:
        """
        Description: 信物链存证
        Summary: 信物链存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_evidence_store_ex_async(request, headers, runtime)

    def start_evidence_store_ex(
        self,
        request: bot_models.StartEvidenceStoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StartEvidenceStoreResponse:
        """
        Description: 信物链存证
        Summary: 信物链存证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.StartEvidenceStoreResponse(),
            self.do_request('1.0', 'blockchain.bot.evidence.store.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_evidence_store_ex_async(
        self,
        request: bot_models.StartEvidenceStoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StartEvidenceStoreResponse:
        """
        Description: 信物链存证
        Summary: 信物链存证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.StartEvidenceStoreResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.evidence.store.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_evidence_query(
        self,
        request: bot_models.StartEvidenceQueryRequest,
    ) -> bot_models.StartEvidenceQueryResponse:
        """
        Description: 信物链存证查询
        Summary: 信物链存证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_evidence_query_ex(request, headers, runtime)

    async def start_evidence_query_async(
        self,
        request: bot_models.StartEvidenceQueryRequest,
    ) -> bot_models.StartEvidenceQueryResponse:
        """
        Description: 信物链存证查询
        Summary: 信物链存证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_evidence_query_ex_async(request, headers, runtime)

    def start_evidence_query_ex(
        self,
        request: bot_models.StartEvidenceQueryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StartEvidenceQueryResponse:
        """
        Description: 信物链存证查询
        Summary: 信物链存证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.StartEvidenceQueryResponse(),
            self.do_request('1.0', 'blockchain.bot.evidence.query.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_evidence_query_ex_async(
        self,
        request: bot_models.StartEvidenceQueryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StartEvidenceQueryResponse:
        """
        Description: 信物链存证查询
        Summary: 信物链存证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.StartEvidenceQueryResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.evidence.query.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_thingsdid_register(
        self,
        request: bot_models.StartThingsdidRegisterRequest,
    ) -> bot_models.StartThingsdidRegisterResponse:
        """
        Description: 信物链实体身份注册
        Summary: 信物链实体身份注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_thingsdid_register_ex(request, headers, runtime)

    async def start_thingsdid_register_async(
        self,
        request: bot_models.StartThingsdidRegisterRequest,
    ) -> bot_models.StartThingsdidRegisterResponse:
        """
        Description: 信物链实体身份注册
        Summary: 信物链实体身份注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_thingsdid_register_ex_async(request, headers, runtime)

    def start_thingsdid_register_ex(
        self,
        request: bot_models.StartThingsdidRegisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StartThingsdidRegisterResponse:
        """
        Description: 信物链实体身份注册
        Summary: 信物链实体身份注册
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.StartThingsdidRegisterResponse(),
            self.do_request('1.0', 'blockchain.bot.thingsdid.register.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_thingsdid_register_ex_async(
        self,
        request: bot_models.StartThingsdidRegisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StartThingsdidRegisterResponse:
        """
        Description: 信物链实体身份注册
        Summary: 信物链实体身份注册
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.StartThingsdidRegisterResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.thingsdid.register.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_thingsdid_asyncprocess(
        self,
        request: bot_models.QueryThingsdidAsyncprocessRequest,
    ) -> bot_models.QueryThingsdidAsyncprocessResponse:
        """
        Description: 信物链异步操作查询
        智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
        Summary: 信物链异步操作查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_thingsdid_asyncprocess_ex(request, headers, runtime)

    async def query_thingsdid_asyncprocess_async(
        self,
        request: bot_models.QueryThingsdidAsyncprocessRequest,
    ) -> bot_models.QueryThingsdidAsyncprocessResponse:
        """
        Description: 信物链异步操作查询
        智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
        Summary: 信物链异步操作查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_thingsdid_asyncprocess_ex_async(request, headers, runtime)

    def query_thingsdid_asyncprocess_ex(
        self,
        request: bot_models.QueryThingsdidAsyncprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryThingsdidAsyncprocessResponse:
        """
        Description: 信物链异步操作查询
        智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
        Summary: 信物链异步操作查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryThingsdidAsyncprocessResponse(),
            self.do_request('1.0', 'blockchain.bot.thingsdid.asyncprocess.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_thingsdid_asyncprocess_ex_async(
        self,
        request: bot_models.QueryThingsdidAsyncprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryThingsdidAsyncprocessResponse:
        """
        Description: 信物链异步操作查询
        智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
        Summary: 信物链异步操作查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryThingsdidAsyncprocessResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.thingsdid.asyncprocess.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_thingsdid_status(
        self,
        request: bot_models.UpdateThingsdidStatusRequest,
    ) -> bot_models.UpdateThingsdidStatusResponse:
        """
        Description: 信物链身份状态更新，此API目前仅支持设备状态更新
        Summary: 信物链身份状态更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_thingsdid_status_ex(request, headers, runtime)

    async def update_thingsdid_status_async(
        self,
        request: bot_models.UpdateThingsdidStatusRequest,
    ) -> bot_models.UpdateThingsdidStatusResponse:
        """
        Description: 信物链身份状态更新，此API目前仅支持设备状态更新
        Summary: 信物链身份状态更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_thingsdid_status_ex_async(request, headers, runtime)

    def update_thingsdid_status_ex(
        self,
        request: bot_models.UpdateThingsdidStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateThingsdidStatusResponse:
        """
        Description: 信物链身份状态更新，此API目前仅支持设备状态更新
        Summary: 信物链身份状态更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateThingsdidStatusResponse(),
            self.do_request('1.0', 'blockchain.bot.thingsdid.status.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_thingsdid_status_ex_async(
        self,
        request: bot_models.UpdateThingsdidStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateThingsdidStatusResponse:
        """
        Description: 信物链身份状态更新，此API目前仅支持设备状态更新
        Summary: 信物链身份状态更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateThingsdidStatusResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.thingsdid.status.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_thingsdid_devicespace(
        self,
        request: bot_models.UpdateThingsdidDevicespaceRequest,
    ) -> bot_models.UpdateThingsdidDevicespaceResponse:
        """
        Description: 信物链设备空间关联更新，完成设备和空间关联绑定
        Summary: 信物链设备空间关联更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_thingsdid_devicespace_ex(request, headers, runtime)

    async def update_thingsdid_devicespace_async(
        self,
        request: bot_models.UpdateThingsdidDevicespaceRequest,
    ) -> bot_models.UpdateThingsdidDevicespaceResponse:
        """
        Description: 信物链设备空间关联更新，完成设备和空间关联绑定
        Summary: 信物链设备空间关联更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_thingsdid_devicespace_ex_async(request, headers, runtime)

    def update_thingsdid_devicespace_ex(
        self,
        request: bot_models.UpdateThingsdidDevicespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateThingsdidDevicespaceResponse:
        """
        Description: 信物链设备空间关联更新，完成设备和空间关联绑定
        Summary: 信物链设备空间关联更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateThingsdidDevicespaceResponse(),
            self.do_request('1.0', 'blockchain.bot.thingsdid.devicespace.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_thingsdid_devicespace_ex_async(
        self,
        request: bot_models.UpdateThingsdidDevicespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateThingsdidDevicespaceResponse:
        """
        Description: 信物链设备空间关联更新，完成设备和空间关联绑定
        Summary: 信物链设备空间关联更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateThingsdidDevicespaceResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.thingsdid.devicespace.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_thingsdid_did(
        self,
        request: bot_models.QueryThingsdidDidRequest,
    ) -> bot_models.QueryThingsdidDidResponse:
        """
        Description: 信物链实体did查询，根据dataFilter过滤输出
        Summary: 信物链实体did查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_thingsdid_did_ex(request, headers, runtime)

    async def query_thingsdid_did_async(
        self,
        request: bot_models.QueryThingsdidDidRequest,
    ) -> bot_models.QueryThingsdidDidResponse:
        """
        Description: 信物链实体did查询，根据dataFilter过滤输出
        Summary: 信物链实体did查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_thingsdid_did_ex_async(request, headers, runtime)

    def query_thingsdid_did_ex(
        self,
        request: bot_models.QueryThingsdidDidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryThingsdidDidResponse:
        """
        Description: 信物链实体did查询，根据dataFilter过滤输出
        Summary: 信物链实体did查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryThingsdidDidResponse(),
            self.do_request('1.0', 'blockchain.bot.thingsdid.did.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_thingsdid_did_ex_async(
        self,
        request: bot_models.QueryThingsdidDidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryThingsdidDidResponse:
        """
        Description: 信物链实体did查询，根据dataFilter过滤输出
        Summary: 信物链实体did查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryThingsdidDidResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.thingsdid.did.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_thingsdid_did(
        self,
        request: bot_models.UpdateThingsdidDidRequest,
    ) -> bot_models.UpdateThingsdidDidResponse:
        """
        Description: 信物链实体身份更新，字段空则不更新。
        Summary: 信物链实体身份更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_thingsdid_did_ex(request, headers, runtime)

    async def update_thingsdid_did_async(
        self,
        request: bot_models.UpdateThingsdidDidRequest,
    ) -> bot_models.UpdateThingsdidDidResponse:
        """
        Description: 信物链实体身份更新，字段空则不更新。
        Summary: 信物链实体身份更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_thingsdid_did_ex_async(request, headers, runtime)

    def update_thingsdid_did_ex(
        self,
        request: bot_models.UpdateThingsdidDidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateThingsdidDidResponse:
        """
        Description: 信物链实体身份更新，字段空则不更新。
        Summary: 信物链实体身份更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateThingsdidDidResponse(),
            self.do_request('1.0', 'blockchain.bot.thingsdid.did.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_thingsdid_did_ex_async(
        self,
        request: bot_models.UpdateThingsdidDidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateThingsdidDidResponse:
        """
        Description: 信物链实体身份更新，字段空则不更新。
        Summary: 信物链实体身份更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateThingsdidDidResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.thingsdid.did.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_tenant_bindinfo(
        self,
        request: bot_models.StartTenantBindinfoRequest,
    ) -> bot_models.StartTenantBindinfoResponse:
        """
        Description: 信物链租户信息关联
        Summary: 信物链租户信息关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_tenant_bindinfo_ex(request, headers, runtime)

    async def start_tenant_bindinfo_async(
        self,
        request: bot_models.StartTenantBindinfoRequest,
    ) -> bot_models.StartTenantBindinfoResponse:
        """
        Description: 信物链租户信息关联
        Summary: 信物链租户信息关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_tenant_bindinfo_ex_async(request, headers, runtime)

    def start_tenant_bindinfo_ex(
        self,
        request: bot_models.StartTenantBindinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StartTenantBindinfoResponse:
        """
        Description: 信物链租户信息关联
        Summary: 信物链租户信息关联
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.StartTenantBindinfoResponse(),
            self.do_request('1.0', 'blockchain.bot.tenant.bindinfo.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_tenant_bindinfo_ex_async(
        self,
        request: bot_models.StartTenantBindinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StartTenantBindinfoResponse:
        """
        Description: 信物链租户信息关联
        Summary: 信物链租户信息关联
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.StartTenantBindinfoResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.tenant.bindinfo.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_tenant_project(
        self,
        request: bot_models.CreateTenantProjectRequest,
    ) -> bot_models.CreateTenantProjectResponse:
        """
        Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
        Summary: 信物链租户项目创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_tenant_project_ex(request, headers, runtime)

    async def create_tenant_project_async(
        self,
        request: bot_models.CreateTenantProjectRequest,
    ) -> bot_models.CreateTenantProjectResponse:
        """
        Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
        Summary: 信物链租户项目创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_tenant_project_ex_async(request, headers, runtime)

    def create_tenant_project_ex(
        self,
        request: bot_models.CreateTenantProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateTenantProjectResponse:
        """
        Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
        Summary: 信物链租户项目创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateTenantProjectResponse(),
            self.do_request('1.0', 'blockchain.bot.tenant.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_tenant_project_ex_async(
        self,
        request: bot_models.CreateTenantProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateTenantProjectResponse:
        """
        Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
        Summary: 信物链租户项目创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateTenantProjectResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.tenant.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_thingsdid_tenant(
        self,
        request: bot_models.UpdateThingsdidTenantRequest,
    ) -> bot_models.UpdateThingsdidTenantResponse:
        """
        Description: 信物链实体访问权限更新
        所有者/使用者/观察者权限更新
        Summary: 信物链实体访问权限更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_thingsdid_tenant_ex(request, headers, runtime)

    async def update_thingsdid_tenant_async(
        self,
        request: bot_models.UpdateThingsdidTenantRequest,
    ) -> bot_models.UpdateThingsdidTenantResponse:
        """
        Description: 信物链实体访问权限更新
        所有者/使用者/观察者权限更新
        Summary: 信物链实体访问权限更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_thingsdid_tenant_ex_async(request, headers, runtime)

    def update_thingsdid_tenant_ex(
        self,
        request: bot_models.UpdateThingsdidTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateThingsdidTenantResponse:
        """
        Description: 信物链实体访问权限更新
        所有者/使用者/观察者权限更新
        Summary: 信物链实体访问权限更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateThingsdidTenantResponse(),
            self.do_request('1.0', 'blockchain.bot.thingsdid.tenant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_thingsdid_tenant_ex_async(
        self,
        request: bot_models.UpdateThingsdidTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateThingsdidTenantResponse:
        """
        Description: 信物链实体访问权限更新
        所有者/使用者/观察者权限更新
        Summary: 信物链实体访问权限更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.UpdateThingsdidTenantResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.thingsdid.tenant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def load_tsm_certificatetsm(
        self,
        request: bot_models.LoadTsmCertificatetsmRequest,
    ) -> bot_models.LoadTsmCertificatetsmResponse:
        """
        Description: LoadCertificateTSMCmd，仅限内部使用api
        Summary: TSM迁移内部使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.load_tsm_certificatetsm_ex(request, headers, runtime)

    async def load_tsm_certificatetsm_async(
        self,
        request: bot_models.LoadTsmCertificatetsmRequest,
    ) -> bot_models.LoadTsmCertificatetsmResponse:
        """
        Description: LoadCertificateTSMCmd，仅限内部使用api
        Summary: TSM迁移内部使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.load_tsm_certificatetsm_ex_async(request, headers, runtime)

    def load_tsm_certificatetsm_ex(
        self,
        request: bot_models.LoadTsmCertificatetsmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.LoadTsmCertificatetsmResponse:
        """
        Description: LoadCertificateTSMCmd，仅限内部使用api
        Summary: TSM迁移内部使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.LoadTsmCertificatetsmResponse(),
            self.do_request('1.0', 'blockchain.bot.tsm.certificatetsm.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def load_tsm_certificatetsm_ex_async(
        self,
        request: bot_models.LoadTsmCertificatetsmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.LoadTsmCertificatetsmResponse:
        """
        Description: LoadCertificateTSMCmd，仅限内部使用api
        Summary: TSM迁移内部使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.LoadTsmCertificatetsmResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.tsm.certificatetsm.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def load_tsm_resourcefile(
        self,
        request: bot_models.LoadTsmResourcefileRequest,
    ) -> bot_models.LoadTsmResourcefileResponse:
        """
        Description: TSM迁移内部使用
        Summary: loadResourceFile
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.load_tsm_resourcefile_ex(request, headers, runtime)

    async def load_tsm_resourcefile_async(
        self,
        request: bot_models.LoadTsmResourcefileRequest,
    ) -> bot_models.LoadTsmResourcefileResponse:
        """
        Description: TSM迁移内部使用
        Summary: loadResourceFile
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.load_tsm_resourcefile_ex_async(request, headers, runtime)

    def load_tsm_resourcefile_ex(
        self,
        request: bot_models.LoadTsmResourcefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.LoadTsmResourcefileResponse:
        """
        Description: TSM迁移内部使用
        Summary: loadResourceFile
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.LoadTsmResourcefileResponse(),
            self.do_request('1.0', 'blockchain.bot.tsm.resourcefile.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def load_tsm_resourcefile_ex_async(
        self,
        request: bot_models.LoadTsmResourcefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.LoadTsmResourcefileResponse:
        """
        Description: TSM迁移内部使用
        Summary: loadResourceFile
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.LoadTsmResourcefileResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.tsm.resourcefile.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_tlsnotary_task(
        self,
        request: bot_models.StartTlsnotaryTaskRequest,
    ) -> bot_models.StartTlsnotaryTaskResponse:
        """
        Description: 触发tlsnotary文件认证任务
        Summary: 触发tlsnotary文件认证任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_tlsnotary_task_ex(request, headers, runtime)

    async def start_tlsnotary_task_async(
        self,
        request: bot_models.StartTlsnotaryTaskRequest,
    ) -> bot_models.StartTlsnotaryTaskResponse:
        """
        Description: 触发tlsnotary文件认证任务
        Summary: 触发tlsnotary文件认证任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_tlsnotary_task_ex_async(request, headers, runtime)

    def start_tlsnotary_task_ex(
        self,
        request: bot_models.StartTlsnotaryTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StartTlsnotaryTaskResponse:
        """
        Description: 触发tlsnotary文件认证任务
        Summary: 触发tlsnotary文件认证任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.StartTlsnotaryTaskResponse(),
            self.do_request('1.0', 'blockchain.bot.tlsnotary.task.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_tlsnotary_task_ex_async(
        self,
        request: bot_models.StartTlsnotaryTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StartTlsnotaryTaskResponse:
        """
        Description: 触发tlsnotary文件认证任务
        Summary: 触发tlsnotary文件认证任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.StartTlsnotaryTaskResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.tlsnotary.task.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_tlsnotary_task(
        self,
        request: bot_models.QueryTlsnotaryTaskRequest,
    ) -> bot_models.QueryTlsnotaryTaskResponse:
        """
        Description: 查询tlsnotary文件认证任务结果
        Summary: 查询tlsnotary文件认证任务结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_tlsnotary_task_ex(request, headers, runtime)

    async def query_tlsnotary_task_async(
        self,
        request: bot_models.QueryTlsnotaryTaskRequest,
    ) -> bot_models.QueryTlsnotaryTaskResponse:
        """
        Description: 查询tlsnotary文件认证任务结果
        Summary: 查询tlsnotary文件认证任务结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_tlsnotary_task_ex_async(request, headers, runtime)

    def query_tlsnotary_task_ex(
        self,
        request: bot_models.QueryTlsnotaryTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryTlsnotaryTaskResponse:
        """
        Description: 查询tlsnotary文件认证任务结果
        Summary: 查询tlsnotary文件认证任务结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryTlsnotaryTaskResponse(),
            self.do_request('1.0', 'blockchain.bot.tlsnotary.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_tlsnotary_task_ex_async(
        self,
        request: bot_models.QueryTlsnotaryTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryTlsnotaryTaskResponse:
        """
        Description: 查询tlsnotary文件认证任务结果
        Summary: 查询tlsnotary文件认证任务结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.QueryTlsnotaryTaskResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.tlsnotary.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: bot_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> bot_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: bot_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> bot_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: bot_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: bot_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            bot_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
