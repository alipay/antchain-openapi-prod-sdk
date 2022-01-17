# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_shuziwuliu import models as shuziwuliu_models
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
        config: shuziwuliu_models.Config,
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
            # 创建凭证One
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
                    'sdk_version': '1.3.136'
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
            # 创建凭证One
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
                    'sdk_version': '1.3.136'
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

    def create_receivable_bill(
        self,
        request: shuziwuliu_models.CreateReceivableBillRequest,
    ) -> shuziwuliu_models.CreateReceivableBillResponse:
        """
        Description: 标准化应收账单
        Summary: 标准化应收账单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_receivable_bill_ex(request, headers, runtime)

    async def create_receivable_bill_async(
        self,
        request: shuziwuliu_models.CreateReceivableBillRequest,
    ) -> shuziwuliu_models.CreateReceivableBillResponse:
        """
        Description: 标准化应收账单
        Summary: 标准化应收账单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_receivable_bill_ex_async(request, headers, runtime)

    def create_receivable_bill_ex(
        self,
        request: shuziwuliu_models.CreateReceivableBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateReceivableBillResponse:
        """
        Description: 标准化应收账单
        Summary: 标准化应收账单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateReceivableBillResponse().from_map(
            self.do_request('1.0', 'digital.logistic.receivable.bill.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_receivable_bill_ex_async(
        self,
        request: shuziwuliu_models.CreateReceivableBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateReceivableBillResponse:
        """
        Description: 标准化应收账单
        Summary: 标准化应收账单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateReceivableBillResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.receivable.bill.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_standard_voucher(
        self,
        request: shuziwuliu_models.CreateStandardVoucherRequest,
    ) -> shuziwuliu_models.CreateStandardVoucherResponse:
        """
        Description: 创建凭证
        Summary: 创建凭证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_standard_voucher_ex(request, headers, runtime)

    async def create_standard_voucher_async(
        self,
        request: shuziwuliu_models.CreateStandardVoucherRequest,
    ) -> shuziwuliu_models.CreateStandardVoucherResponse:
        """
        Description: 创建凭证
        Summary: 创建凭证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_standard_voucher_ex_async(request, headers, runtime)

    def create_standard_voucher_ex(
        self,
        request: shuziwuliu_models.CreateStandardVoucherRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateStandardVoucherResponse:
        """
        Description: 创建凭证
        Summary: 创建凭证
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateStandardVoucherResponse().from_map(
            self.do_request('1.0', 'digital.logistic.standard.voucher.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_standard_voucher_ex_async(
        self,
        request: shuziwuliu_models.CreateStandardVoucherRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateStandardVoucherResponse:
        """
        Description: 创建凭证
        Summary: 创建凭证
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateStandardVoucherResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.standard.voucher.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_platform_did(
        self,
        request: shuziwuliu_models.CreatePlatformDidRequest,
    ) -> shuziwuliu_models.CreatePlatformDidResponse:
        """
        Description: 无车承运平台为自身申请DIS分布式数字身份
        Summary: 无车承运平台DIS分布式数字身份申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_platform_did_ex(request, headers, runtime)

    async def create_platform_did_async(
        self,
        request: shuziwuliu_models.CreatePlatformDidRequest,
    ) -> shuziwuliu_models.CreatePlatformDidResponse:
        """
        Description: 无车承运平台为自身申请DIS分布式数字身份
        Summary: 无车承运平台DIS分布式数字身份申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_platform_did_ex_async(request, headers, runtime)

    def create_platform_did_ex(
        self,
        request: shuziwuliu_models.CreatePlatformDidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreatePlatformDidResponse:
        """
        Description: 无车承运平台为自身申请DIS分布式数字身份
        Summary: 无车承运平台DIS分布式数字身份申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreatePlatformDidResponse().from_map(
            self.do_request('1.0', 'digital.logistic.platform.did.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_platform_did_ex_async(
        self,
        request: shuziwuliu_models.CreatePlatformDidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreatePlatformDidResponse:
        """
        Description: 无车承运平台为自身申请DIS分布式数字身份
        Summary: 无车承运平台DIS分布式数字身份申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreatePlatformDidResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.platform.did.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_agent_did(
        self,
        request: shuziwuliu_models.CreateAgentDidRequest,
    ) -> shuziwuliu_models.CreateAgentDidResponse:
        """
        Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
        Summary: 无车承运平台DIS分布式数字身份代理申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_agent_did_ex(request, headers, runtime)

    async def create_agent_did_async(
        self,
        request: shuziwuliu_models.CreateAgentDidRequest,
    ) -> shuziwuliu_models.CreateAgentDidResponse:
        """
        Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
        Summary: 无车承运平台DIS分布式数字身份代理申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_agent_did_ex_async(request, headers, runtime)

    def create_agent_did_ex(
        self,
        request: shuziwuliu_models.CreateAgentDidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateAgentDidResponse:
        """
        Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
        Summary: 无车承运平台DIS分布式数字身份代理申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateAgentDidResponse().from_map(
            self.do_request('1.0', 'digital.logistic.agent.did.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_agent_did_ex_async(
        self,
        request: shuziwuliu_models.CreateAgentDidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateAgentDidResponse:
        """
        Description: 代理申请无车承运平台的DIS分布式数字身份。无车saas平台需要为平台中的各个无车承运平台创建dis时需要使用代理创建的模式为其创建分布式数字身份。代理申请分布式数字身份的前置条件为自身需已有分布式数字身份。
        Summary: 无车承运平台DIS分布式数字身份代理申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateAgentDidResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.agent.did.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_consignor_dis(
        self,
        request: shuziwuliu_models.CreateConsignorDisRequest,
    ) -> shuziwuliu_models.CreateConsignorDisResponse:
        """
        Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
        Summary: 货主DIS分布式数字身份申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_consignor_dis_ex(request, headers, runtime)

    async def create_consignor_dis_async(
        self,
        request: shuziwuliu_models.CreateConsignorDisRequest,
    ) -> shuziwuliu_models.CreateConsignorDisResponse:
        """
        Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
        Summary: 货主DIS分布式数字身份申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_consignor_dis_ex_async(request, headers, runtime)

    def create_consignor_dis_ex(
        self,
        request: shuziwuliu_models.CreateConsignorDisRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateConsignorDisResponse:
        """
        Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
        Summary: 货主DIS分布式数字身份申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateConsignorDisResponse().from_map(
            self.do_request('1.0', 'digital.logistic.consignor.dis.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_consignor_dis_ex_async(
        self,
        request: shuziwuliu_models.CreateConsignorDisRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateConsignorDisResponse:
        """
        Description: 无车承运平台为货主申请联盟中唯一标识货主的DIS分布式数字身份,会对企业信息做核验，同一个企业多次申请dis将会返回相同的分布式数字身份。为货主申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
        Summary: 货主DIS分布式数字身份申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateConsignorDisResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.consignor.dis.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_driver_dis(
        self,
        request: shuziwuliu_models.CreateDriverDisRequest,
    ) -> shuziwuliu_models.CreateDriverDisResponse:
        """
        Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
        Summary: 司机DIS分布式数字身份申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_driver_dis_ex(request, headers, runtime)

    async def create_driver_dis_async(
        self,
        request: shuziwuliu_models.CreateDriverDisRequest,
    ) -> shuziwuliu_models.CreateDriverDisResponse:
        """
        Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
        Summary: 司机DIS分布式数字身份申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_driver_dis_ex_async(request, headers, runtime)

    def create_driver_dis_ex(
        self,
        request: shuziwuliu_models.CreateDriverDisRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateDriverDisResponse:
        """
        Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
        Summary: 司机DIS分布式数字身份申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDriverDisResponse().from_map(
            self.do_request('1.0', 'digital.logistic.driver.dis.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_driver_dis_ex_async(
        self,
        request: shuziwuliu_models.CreateDriverDisRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateDriverDisResponse:
        """
        Description: 无车承运平台为司机申请DIS分布式数字身份,会对司机做实人认证，同一个司机多次申请dis会返回相同的分布式数字身份。为司机申请分布式数字身份的前置条件为无车承运平台需已有分布式数字身份。
        Summary: 司机DIS分布式数字身份申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDriverDisResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.driver.dis.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_cargo_order(
        self,
        request: shuziwuliu_models.CreateCargoOrderRequest,
    ) -> shuziwuliu_models.CreateCargoOrderResponse:
        """
        Description: 货源订单创建，货主发货给平台时的订单信息
        Summary: 货源订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_cargo_order_ex(request, headers, runtime)

    async def create_cargo_order_async(
        self,
        request: shuziwuliu_models.CreateCargoOrderRequest,
    ) -> shuziwuliu_models.CreateCargoOrderResponse:
        """
        Description: 货源订单创建，货主发货给平台时的订单信息
        Summary: 货源订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_cargo_order_ex_async(request, headers, runtime)

    def create_cargo_order_ex(
        self,
        request: shuziwuliu_models.CreateCargoOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateCargoOrderResponse:
        """
        Description: 货源订单创建，货主发货给平台时的订单信息
        Summary: 货源订单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateCargoOrderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.cargo.order.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_cargo_order_ex_async(
        self,
        request: shuziwuliu_models.CreateCargoOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateCargoOrderResponse:
        """
        Description: 货源订单创建，货主发货给平台时的订单信息
        Summary: 货源订单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateCargoOrderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.cargo.order.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_cargo_pay(
        self,
        request: shuziwuliu_models.CreateCargoPayRequest,
    ) -> shuziwuliu_models.CreateCargoPayResponse:
        """
        Description: 货源支付订单创建,货源订单需存在。
        Summary: 货源支付订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_cargo_pay_ex(request, headers, runtime)

    async def create_cargo_pay_async(
        self,
        request: shuziwuliu_models.CreateCargoPayRequest,
    ) -> shuziwuliu_models.CreateCargoPayResponse:
        """
        Description: 货源支付订单创建,货源订单需存在。
        Summary: 货源支付订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_cargo_pay_ex_async(request, headers, runtime)

    def create_cargo_pay_ex(
        self,
        request: shuziwuliu_models.CreateCargoPayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateCargoPayResponse:
        """
        Description: 货源支付订单创建,货源订单需存在。
        Summary: 货源支付订单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateCargoPayResponse().from_map(
            self.do_request('1.0', 'digital.logistic.cargo.pay.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_cargo_pay_ex_async(
        self,
        request: shuziwuliu_models.CreateCargoPayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateCargoPayResponse:
        """
        Description: 货源支付订单创建,货源订单需存在。
        Summary: 货源支付订单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateCargoPayResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.cargo.pay.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_waybill_order(
        self,
        request: shuziwuliu_models.CreateWaybillOrderRequest,
    ) -> shuziwuliu_models.CreateWaybillOrderResponse:
        """
        Description: 物流平台将运单指派给下游（承运商、司机）时产生
        Summary: 运单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_waybill_order_ex(request, headers, runtime)

    async def create_waybill_order_async(
        self,
        request: shuziwuliu_models.CreateWaybillOrderRequest,
    ) -> shuziwuliu_models.CreateWaybillOrderResponse:
        """
        Description: 物流平台将运单指派给下游（承运商、司机）时产生
        Summary: 运单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_waybill_order_ex_async(request, headers, runtime)

    def create_waybill_order_ex(
        self,
        request: shuziwuliu_models.CreateWaybillOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateWaybillOrderResponse:
        """
        Description: 物流平台将运单指派给下游（承运商、司机）时产生
        Summary: 运单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateWaybillOrderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.waybill.order.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_waybill_order_ex_async(
        self,
        request: shuziwuliu_models.CreateWaybillOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateWaybillOrderResponse:
        """
        Description: 物流平台将运单指派给下游（承运商、司机）时产生
        Summary: 运单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateWaybillOrderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.waybill.order.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_waybill_pay(
        self,
        request: shuziwuliu_models.CreateWaybillPayRequest,
    ) -> shuziwuliu_models.CreateWaybillPayResponse:
        """
        Description: 创建物流支付订单，运单需已存在并且未结束
        Summary: 运单支付订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_waybill_pay_ex(request, headers, runtime)

    async def create_waybill_pay_async(
        self,
        request: shuziwuliu_models.CreateWaybillPayRequest,
    ) -> shuziwuliu_models.CreateWaybillPayResponse:
        """
        Description: 创建物流支付订单，运单需已存在并且未结束
        Summary: 运单支付订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_waybill_pay_ex_async(request, headers, runtime)

    def create_waybill_pay_ex(
        self,
        request: shuziwuliu_models.CreateWaybillPayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateWaybillPayResponse:
        """
        Description: 创建物流支付订单，运单需已存在并且未结束
        Summary: 运单支付订单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateWaybillPayResponse().from_map(
            self.do_request('1.0', 'digital.logistic.waybill.pay.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_waybill_pay_ex_async(
        self,
        request: shuziwuliu_models.CreateWaybillPayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateWaybillPayResponse:
        """
        Description: 创建物流支付订单，运单需已存在并且未结束
        Summary: 运单支付订单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateWaybillPayResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.waybill.pay.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_waybill_location(
        self,
        request: shuziwuliu_models.ImportWaybillLocationRequest,
    ) -> shuziwuliu_models.ImportWaybillLocationResponse:
        """
        Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
        Summary: 第三方位置信息上报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_waybill_location_ex(request, headers, runtime)

    async def import_waybill_location_async(
        self,
        request: shuziwuliu_models.ImportWaybillLocationRequest,
    ) -> shuziwuliu_models.ImportWaybillLocationResponse:
        """
        Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
        Summary: 第三方位置信息上报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_waybill_location_ex_async(request, headers, runtime)

    def import_waybill_location_ex(
        self,
        request: shuziwuliu_models.ImportWaybillLocationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ImportWaybillLocationResponse:
        """
        Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
        Summary: 第三方位置信息上报
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ImportWaybillLocationResponse().from_map(
            self.do_request('1.0', 'digital.logistic.waybill.location.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_waybill_location_ex_async(
        self,
        request: shuziwuliu_models.ImportWaybillLocationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ImportWaybillLocationResponse:
        """
        Description: 用于上报第三方的轨迹位置信息，运单需已存在并且未结束
        Summary: 第三方位置信息上报
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ImportWaybillLocationResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.waybill.location.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_waybill_bill(
        self,
        request: shuziwuliu_models.CreateWaybillBillRequest,
    ) -> shuziwuliu_models.CreateWaybillBillResponse:
        """
        Description: 发票订单创建
        Summary: 发票订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_waybill_bill_ex(request, headers, runtime)

    async def create_waybill_bill_async(
        self,
        request: shuziwuliu_models.CreateWaybillBillRequest,
    ) -> shuziwuliu_models.CreateWaybillBillResponse:
        """
        Description: 发票订单创建
        Summary: 发票订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_waybill_bill_ex_async(request, headers, runtime)

    def create_waybill_bill_ex(
        self,
        request: shuziwuliu_models.CreateWaybillBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateWaybillBillResponse:
        """
        Description: 发票订单创建
        Summary: 发票订单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateWaybillBillResponse().from_map(
            self.do_request('1.0', 'digital.logistic.waybill.bill.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_waybill_bill_ex_async(
        self,
        request: shuziwuliu_models.CreateWaybillBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateWaybillBillResponse:
        """
        Description: 发票订单创建
        Summary: 发票订单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateWaybillBillResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.waybill.bill.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_waybill_status(
        self,
        request: shuziwuliu_models.QueryWaybillStatusRequest,
    ) -> shuziwuliu_models.QueryWaybillStatusResponse:
        """
        Description: 查询物流运单状态
        Summary: 查询运单状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_waybill_status_ex(request, headers, runtime)

    async def query_waybill_status_async(
        self,
        request: shuziwuliu_models.QueryWaybillStatusRequest,
    ) -> shuziwuliu_models.QueryWaybillStatusResponse:
        """
        Description: 查询物流运单状态
        Summary: 查询运单状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_waybill_status_ex_async(request, headers, runtime)

    def query_waybill_status_ex(
        self,
        request: shuziwuliu_models.QueryWaybillStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryWaybillStatusResponse:
        """
        Description: 查询物流运单状态
        Summary: 查询运单状态
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryWaybillStatusResponse().from_map(
            self.do_request('1.0', 'digital.logistic.waybill.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_waybill_status_ex_async(
        self,
        request: shuziwuliu_models.QueryWaybillStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryWaybillStatusResponse:
        """
        Description: 查询物流运单状态
        Summary: 查询运单状态
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryWaybillStatusResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.waybill.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def finish_waybill_order(
        self,
        request: shuziwuliu_models.FinishWaybillOrderRequest,
    ) -> shuziwuliu_models.FinishWaybillOrderResponse:
        """
        Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
        完成后的运单无法再调用支付订单与轨迹位置上传接口。
        Summary: 运单完成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.finish_waybill_order_ex(request, headers, runtime)

    async def finish_waybill_order_async(
        self,
        request: shuziwuliu_models.FinishWaybillOrderRequest,
    ) -> shuziwuliu_models.FinishWaybillOrderResponse:
        """
        Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
        完成后的运单无法再调用支付订单与轨迹位置上传接口。
        Summary: 运单完成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.finish_waybill_order_ex_async(request, headers, runtime)

    def finish_waybill_order_ex(
        self,
        request: shuziwuliu_models.FinishWaybillOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.FinishWaybillOrderResponse:
        """
        Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
        完成后的运单无法再调用支付订单与轨迹位置上传接口。
        Summary: 运单完成
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.FinishWaybillOrderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.waybill.order.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def finish_waybill_order_ex_async(
        self,
        request: shuziwuliu_models.FinishWaybillOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.FinishWaybillOrderResponse:
        """
        Description: 运单完成表示整个运单的生命周期结束的最终状态，一般为和司机已进行确认结算后调用
        完成后的运单无法再调用支付订单与轨迹位置上传接口。
        Summary: 运单完成
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.FinishWaybillOrderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.waybill.order.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_cargo_payorder(
        self,
        request: shuziwuliu_models.CreateCargoPayorderRequest,
    ) -> shuziwuliu_models.CreateCargoPayorderResponse:
        """
        Description: 货源支付订单创建,货源订单需存在。
        Summary: 货源支付订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_cargo_payorder_ex(request, headers, runtime)

    async def create_cargo_payorder_async(
        self,
        request: shuziwuliu_models.CreateCargoPayorderRequest,
    ) -> shuziwuliu_models.CreateCargoPayorderResponse:
        """
        Description: 货源支付订单创建,货源订单需存在。
        Summary: 货源支付订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_cargo_payorder_ex_async(request, headers, runtime)

    def create_cargo_payorder_ex(
        self,
        request: shuziwuliu_models.CreateCargoPayorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateCargoPayorderResponse:
        """
        Description: 货源支付订单创建,货源订单需存在。
        Summary: 货源支付订单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateCargoPayorderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.cargo.payorder.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_cargo_payorder_ex_async(
        self,
        request: shuziwuliu_models.CreateCargoPayorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateCargoPayorderResponse:
        """
        Description: 货源支付订单创建,货源订单需存在。
        Summary: 货源支付订单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateCargoPayorderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.cargo.payorder.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_waybill_order(
        self,
        request: shuziwuliu_models.SaveWaybillOrderRequest,
    ) -> shuziwuliu_models.SaveWaybillOrderResponse:
        """
        Description: 当货物到达目的地时，调用此接口
        Summary: 运单运输完成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_waybill_order_ex(request, headers, runtime)

    async def save_waybill_order_async(
        self,
        request: shuziwuliu_models.SaveWaybillOrderRequest,
    ) -> shuziwuliu_models.SaveWaybillOrderResponse:
        """
        Description: 当货物到达目的地时，调用此接口
        Summary: 运单运输完成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_waybill_order_ex_async(request, headers, runtime)

    def save_waybill_order_ex(
        self,
        request: shuziwuliu_models.SaveWaybillOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveWaybillOrderResponse:
        """
        Description: 当货物到达目的地时，调用此接口
        Summary: 运单运输完成
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveWaybillOrderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.waybill.order.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_waybill_order_ex_async(
        self,
        request: shuziwuliu_models.SaveWaybillOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveWaybillOrderResponse:
        """
        Description: 当货物到达目的地时，调用此接口
        Summary: 运单运输完成
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveWaybillOrderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.waybill.order.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def close_waybill_order(
        self,
        request: shuziwuliu_models.CloseWaybillOrderRequest,
    ) -> shuziwuliu_models.CloseWaybillOrderResponse:
        """
        Description: 运单关闭
        Summary: 运单关闭
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.close_waybill_order_ex(request, headers, runtime)

    async def close_waybill_order_async(
        self,
        request: shuziwuliu_models.CloseWaybillOrderRequest,
    ) -> shuziwuliu_models.CloseWaybillOrderResponse:
        """
        Description: 运单关闭
        Summary: 运单关闭
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.close_waybill_order_ex_async(request, headers, runtime)

    def close_waybill_order_ex(
        self,
        request: shuziwuliu_models.CloseWaybillOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CloseWaybillOrderResponse:
        """
        Description: 运单关闭
        Summary: 运单关闭
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CloseWaybillOrderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.waybill.order.close', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def close_waybill_order_ex_async(
        self,
        request: shuziwuliu_models.CloseWaybillOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CloseWaybillOrderResponse:
        """
        Description: 运单关闭
        Summary: 运单关闭
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CloseWaybillOrderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.waybill.order.close', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def finish_finance_waybill(
        self,
        request: shuziwuliu_models.FinishFinanceWaybillRequest,
    ) -> shuziwuliu_models.FinishFinanceWaybillResponse:
        """
        Description: 完成物流运单
        Summary: 完成物流运单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.finish_finance_waybill_ex(request, headers, runtime)

    async def finish_finance_waybill_async(
        self,
        request: shuziwuliu_models.FinishFinanceWaybillRequest,
    ) -> shuziwuliu_models.FinishFinanceWaybillResponse:
        """
        Description: 完成物流运单
        Summary: 完成物流运单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.finish_finance_waybill_ex_async(request, headers, runtime)

    def finish_finance_waybill_ex(
        self,
        request: shuziwuliu_models.FinishFinanceWaybillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.FinishFinanceWaybillResponse:
        """
        Description: 完成物流运单
        Summary: 完成物流运单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.FinishFinanceWaybillResponse().from_map(
            self.do_request('1.0', 'digital.logistic.finance.waybill.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def finish_finance_waybill_ex_async(
        self,
        request: shuziwuliu_models.FinishFinanceWaybillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.FinishFinanceWaybillResponse:
        """
        Description: 完成物流运单
        Summary: 完成物流运单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.FinishFinanceWaybillResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.finance.waybill.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def finish_finance_transport(
        self,
        request: shuziwuliu_models.FinishFinanceTransportRequest,
    ) -> shuziwuliu_models.FinishFinanceTransportResponse:
        """
        Description: 运输完成
        Summary: 运输完成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.finish_finance_transport_ex(request, headers, runtime)

    async def finish_finance_transport_async(
        self,
        request: shuziwuliu_models.FinishFinanceTransportRequest,
    ) -> shuziwuliu_models.FinishFinanceTransportResponse:
        """
        Description: 运输完成
        Summary: 运输完成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.finish_finance_transport_ex_async(request, headers, runtime)

    def finish_finance_transport_ex(
        self,
        request: shuziwuliu_models.FinishFinanceTransportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.FinishFinanceTransportResponse:
        """
        Description: 运输完成
        Summary: 运输完成
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.FinishFinanceTransportResponse().from_map(
            self.do_request('1.0', 'digital.logistic.finance.transport.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def finish_finance_transport_ex_async(
        self,
        request: shuziwuliu_models.FinishFinanceTransportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.FinishFinanceTransportResponse:
        """
        Description: 运输完成
        Summary: 运输完成
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.FinishFinanceTransportResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.finance.transport.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_finance_waybill(
        self,
        request: shuziwuliu_models.UpdateFinanceWaybillRequest,
    ) -> shuziwuliu_models.UpdateFinanceWaybillResponse:
        """
        Description: 对运单信息项需更新时调用
        Summary: 更新运单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_finance_waybill_ex(request, headers, runtime)

    async def update_finance_waybill_async(
        self,
        request: shuziwuliu_models.UpdateFinanceWaybillRequest,
    ) -> shuziwuliu_models.UpdateFinanceWaybillResponse:
        """
        Description: 对运单信息项需更新时调用
        Summary: 更新运单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_finance_waybill_ex_async(request, headers, runtime)

    def update_finance_waybill_ex(
        self,
        request: shuziwuliu_models.UpdateFinanceWaybillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateFinanceWaybillResponse:
        """
        Description: 对运单信息项需更新时调用
        Summary: 更新运单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateFinanceWaybillResponse().from_map(
            self.do_request('1.0', 'digital.logistic.finance.waybill.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_finance_waybill_ex_async(
        self,
        request: shuziwuliu_models.UpdateFinanceWaybillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateFinanceWaybillResponse:
        """
        Description: 对运单信息项需更新时调用
        Summary: 更新运单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateFinanceWaybillResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.finance.waybill.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_finance_waybill(
        self,
        request: shuziwuliu_models.StartFinanceWaybillRequest,
    ) -> shuziwuliu_models.StartFinanceWaybillResponse:
        """
        Description: 当司机到达货主装货地后，调用此接口
        Summary: 起运运单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_finance_waybill_ex(request, headers, runtime)

    async def start_finance_waybill_async(
        self,
        request: shuziwuliu_models.StartFinanceWaybillRequest,
    ) -> shuziwuliu_models.StartFinanceWaybillResponse:
        """
        Description: 当司机到达货主装货地后，调用此接口
        Summary: 起运运单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_finance_waybill_ex_async(request, headers, runtime)

    def start_finance_waybill_ex(
        self,
        request: shuziwuliu_models.StartFinanceWaybillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.StartFinanceWaybillResponse:
        """
        Description: 当司机到达货主装货地后，调用此接口
        Summary: 起运运单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.StartFinanceWaybillResponse().from_map(
            self.do_request('1.0', 'digital.logistic.finance.waybill.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_finance_waybill_ex_async(
        self,
        request: shuziwuliu_models.StartFinanceWaybillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.StartFinanceWaybillResponse:
        """
        Description: 当司机到达货主装货地后，调用此接口
        Summary: 起运运单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.StartFinanceWaybillResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.finance.waybill.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_captain_dis(
        self,
        request: shuziwuliu_models.CreateCaptainDisRequest,
    ) -> shuziwuliu_models.CreateCaptainDisResponse:
        """
        Description: 创建承运商账户
        Summary: 创建承运商账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_captain_dis_ex(request, headers, runtime)

    async def create_captain_dis_async(
        self,
        request: shuziwuliu_models.CreateCaptainDisRequest,
    ) -> shuziwuliu_models.CreateCaptainDisResponse:
        """
        Description: 创建承运商账户
        Summary: 创建承运商账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_captain_dis_ex_async(request, headers, runtime)

    def create_captain_dis_ex(
        self,
        request: shuziwuliu_models.CreateCaptainDisRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateCaptainDisResponse:
        """
        Description: 创建承运商账户
        Summary: 创建承运商账户
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateCaptainDisResponse().from_map(
            self.do_request('1.0', 'digital.logistic.captain.dis.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_captain_dis_ex_async(
        self,
        request: shuziwuliu_models.CreateCaptainDisRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateCaptainDisResponse:
        """
        Description: 创建承运商账户
        Summary: 创建承运商账户
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateCaptainDisResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.captain.dis.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_cargowaybill_bill(
        self,
        request: shuziwuliu_models.CreateCargowaybillBillRequest,
    ) -> shuziwuliu_models.CreateCargowaybillBillResponse:
        """
        Description: 创建货主账单
        Summary: 货主账单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_cargowaybill_bill_ex(request, headers, runtime)

    async def create_cargowaybill_bill_async(
        self,
        request: shuziwuliu_models.CreateCargowaybillBillRequest,
    ) -> shuziwuliu_models.CreateCargowaybillBillResponse:
        """
        Description: 创建货主账单
        Summary: 货主账单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_cargowaybill_bill_ex_async(request, headers, runtime)

    def create_cargowaybill_bill_ex(
        self,
        request: shuziwuliu_models.CreateCargowaybillBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateCargowaybillBillResponse:
        """
        Description: 创建货主账单
        Summary: 货主账单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateCargowaybillBillResponse().from_map(
            self.do_request('1.0', 'digital.logistic.cargowaybill.bill.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_cargowaybill_bill_ex_async(
        self,
        request: shuziwuliu_models.CreateCargowaybillBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateCargowaybillBillResponse:
        """
        Description: 创建货主账单
        Summary: 货主账单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateCargowaybillBillResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.cargowaybill.bill.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_cargowaybill_bill(
        self,
        request: shuziwuliu_models.ConfirmCargowaybillBillRequest,
    ) -> shuziwuliu_models.ConfirmCargowaybillBillResponse:
        """
        Description: 确认货主账单
        Summary: 货主账单确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_cargowaybill_bill_ex(request, headers, runtime)

    async def confirm_cargowaybill_bill_async(
        self,
        request: shuziwuliu_models.ConfirmCargowaybillBillRequest,
    ) -> shuziwuliu_models.ConfirmCargowaybillBillResponse:
        """
        Description: 确认货主账单
        Summary: 货主账单确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_cargowaybill_bill_ex_async(request, headers, runtime)

    def confirm_cargowaybill_bill_ex(
        self,
        request: shuziwuliu_models.ConfirmCargowaybillBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ConfirmCargowaybillBillResponse:
        """
        Description: 确认货主账单
        Summary: 货主账单确认
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ConfirmCargowaybillBillResponse().from_map(
            self.do_request('1.0', 'digital.logistic.cargowaybill.bill.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_cargowaybill_bill_ex_async(
        self,
        request: shuziwuliu_models.ConfirmCargowaybillBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ConfirmCargowaybillBillResponse:
        """
        Description: 确认货主账单
        Summary: 货主账单确认
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ConfirmCargowaybillBillResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.cargowaybill.bill.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_cargowaybill_billsettle(
        self,
        request: shuziwuliu_models.CreateCargowaybillBillsettleRequest,
    ) -> shuziwuliu_models.CreateCargowaybillBillsettleResponse:
        """
        Description: 结算货主账单
        Summary: 货主账单结算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_cargowaybill_billsettle_ex(request, headers, runtime)

    async def create_cargowaybill_billsettle_async(
        self,
        request: shuziwuliu_models.CreateCargowaybillBillsettleRequest,
    ) -> shuziwuliu_models.CreateCargowaybillBillsettleResponse:
        """
        Description: 结算货主账单
        Summary: 货主账单结算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_cargowaybill_billsettle_ex_async(request, headers, runtime)

    def create_cargowaybill_billsettle_ex(
        self,
        request: shuziwuliu_models.CreateCargowaybillBillsettleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateCargowaybillBillsettleResponse:
        """
        Description: 结算货主账单
        Summary: 货主账单结算
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateCargowaybillBillsettleResponse().from_map(
            self.do_request('1.0', 'digital.logistic.cargowaybill.billsettle.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_cargowaybill_billsettle_ex_async(
        self,
        request: shuziwuliu_models.CreateCargowaybillBillsettleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateCargowaybillBillsettleResponse:
        """
        Description: 结算货主账单
        Summary: 货主账单结算
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateCargowaybillBillsettleResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.cargowaybill.billsettle.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_waybillorder_platformdid(
        self,
        request: shuziwuliu_models.UpdateWaybillorderPlatformdidRequest,
    ) -> shuziwuliu_models.UpdateWaybillorderPlatformdidResponse:
        """
        Description: 运单平台did更新
        Summary: 运单平台did更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_waybillorder_platformdid_ex(request, headers, runtime)

    async def update_waybillorder_platformdid_async(
        self,
        request: shuziwuliu_models.UpdateWaybillorderPlatformdidRequest,
    ) -> shuziwuliu_models.UpdateWaybillorderPlatformdidResponse:
        """
        Description: 运单平台did更新
        Summary: 运单平台did更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_waybillorder_platformdid_ex_async(request, headers, runtime)

    def update_waybillorder_platformdid_ex(
        self,
        request: shuziwuliu_models.UpdateWaybillorderPlatformdidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateWaybillorderPlatformdidResponse:
        """
        Description: 运单平台did更新
        Summary: 运单平台did更新
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateWaybillorderPlatformdidResponse().from_map(
            self.do_request('1.0', 'digital.logistic.waybillorder.platformdid.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_waybillorder_platformdid_ex_async(
        self,
        request: shuziwuliu_models.UpdateWaybillorderPlatformdidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateWaybillorderPlatformdidResponse:
        """
        Description: 运单平台did更新
        Summary: 运单平台did更新
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateWaybillorderPlatformdidResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.waybillorder.platformdid.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_cargowaybill_bill(
        self,
        request: shuziwuliu_models.UpdateCargowaybillBillRequest,
    ) -> shuziwuliu_models.UpdateCargowaybillBillResponse:
        """
        Description: 更新货主账单
        Summary: 货主账单更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_cargowaybill_bill_ex(request, headers, runtime)

    async def update_cargowaybill_bill_async(
        self,
        request: shuziwuliu_models.UpdateCargowaybillBillRequest,
    ) -> shuziwuliu_models.UpdateCargowaybillBillResponse:
        """
        Description: 更新货主账单
        Summary: 货主账单更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_cargowaybill_bill_ex_async(request, headers, runtime)

    def update_cargowaybill_bill_ex(
        self,
        request: shuziwuliu_models.UpdateCargowaybillBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateCargowaybillBillResponse:
        """
        Description: 更新货主账单
        Summary: 货主账单更新
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateCargowaybillBillResponse().from_map(
            self.do_request('1.0', 'digital.logistic.cargowaybill.bill.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_cargowaybill_bill_ex_async(
        self,
        request: shuziwuliu_models.UpdateCargowaybillBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateCargowaybillBillResponse:
        """
        Description: 更新货主账单
        Summary: 货主账单更新
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateCargowaybillBillResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.cargowaybill.bill.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_dis_did(
        self,
        request: shuziwuliu_models.CreateDisDidRequest,
    ) -> shuziwuliu_models.CreateDisDidResponse:
        """
        Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
        Summary: 分布式数字身份申请did集合
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_dis_did_ex(request, headers, runtime)

    async def create_dis_did_async(
        self,
        request: shuziwuliu_models.CreateDisDidRequest,
    ) -> shuziwuliu_models.CreateDisDidResponse:
        """
        Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
        Summary: 分布式数字身份申请did集合
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_dis_did_ex_async(request, headers, runtime)

    def create_dis_did_ex(
        self,
        request: shuziwuliu_models.CreateDisDidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateDisDidResponse:
        """
        Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
        Summary: 分布式数字身份申请did集合
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDisDidResponse().from_map(
            self.do_request('1.0', 'digital.logistic.dis.did.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_dis_did_ex_async(
        self,
        request: shuziwuliu_models.CreateDisDidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateDisDidResponse:
        """
        Description: 分布式申请did账户集合，可通过此接口申请个人类型角色为货主、承运商、司机的分布式数字身份did；可申请企业类型角色为货主、网络货运平台、道路运输企业/3pl、承运商、子平台的分布式数字身份did。注：接口可允许多次调用，但每次调用只允许申请一个角色，不允许一次调用申请多个角色
        Summary: 分布式数字身份申请did集合
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDisDidResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.dis.did.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_transport_contract(
        self,
        request: shuziwuliu_models.UploadTransportContractRequest,
    ) -> shuziwuliu_models.UploadTransportContractResponse:
        """
        Description: 3PL运输合同上传
        Summary: 3PL运输合同上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_transport_contract_ex(request, headers, runtime)

    async def upload_transport_contract_async(
        self,
        request: shuziwuliu_models.UploadTransportContractRequest,
    ) -> shuziwuliu_models.UploadTransportContractResponse:
        """
        Description: 3PL运输合同上传
        Summary: 3PL运输合同上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_transport_contract_ex_async(request, headers, runtime)

    def upload_transport_contract_ex(
        self,
        request: shuziwuliu_models.UploadTransportContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadTransportContractResponse:
        """
        Description: 3PL运输合同上传
        Summary: 3PL运输合同上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadTransportContractResponse().from_map(
            self.do_request('1.0', 'digital.logistic.transport.contract.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_transport_contract_ex_async(
        self,
        request: shuziwuliu_models.UploadTransportContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadTransportContractResponse:
        """
        Description: 3PL运输合同上传
        Summary: 3PL运输合同上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadTransportContractResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.transport.contract.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_transport_route(
        self,
        request: shuziwuliu_models.UploadTransportRouteRequest,
    ) -> shuziwuliu_models.UploadTransportRouteResponse:
        """
        Description: 3PL运输线路上传
        Summary: 3PL运输线路上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_transport_route_ex(request, headers, runtime)

    async def upload_transport_route_async(
        self,
        request: shuziwuliu_models.UploadTransportRouteRequest,
    ) -> shuziwuliu_models.UploadTransportRouteResponse:
        """
        Description: 3PL运输线路上传
        Summary: 3PL运输线路上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_transport_route_ex_async(request, headers, runtime)

    def upload_transport_route_ex(
        self,
        request: shuziwuliu_models.UploadTransportRouteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadTransportRouteResponse:
        """
        Description: 3PL运输线路上传
        Summary: 3PL运输线路上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadTransportRouteResponse().from_map(
            self.do_request('1.0', 'digital.logistic.transport.route.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_transport_route_ex_async(
        self,
        request: shuziwuliu_models.UploadTransportRouteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadTransportRouteResponse:
        """
        Description: 3PL运输线路上传
        Summary: 3PL运输线路上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadTransportRouteResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.transport.route.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_transport_waybill(
        self,
        request: shuziwuliu_models.CreateTransportWaybillRequest,
    ) -> shuziwuliu_models.CreateTransportWaybillResponse:
        """
        Description: 3PL运单创建
        Summary: 3PL运单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_transport_waybill_ex(request, headers, runtime)

    async def create_transport_waybill_async(
        self,
        request: shuziwuliu_models.CreateTransportWaybillRequest,
    ) -> shuziwuliu_models.CreateTransportWaybillResponse:
        """
        Description: 3PL运单创建
        Summary: 3PL运单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_transport_waybill_ex_async(request, headers, runtime)

    def create_transport_waybill_ex(
        self,
        request: shuziwuliu_models.CreateTransportWaybillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateTransportWaybillResponse:
        """
        Description: 3PL运单创建
        Summary: 3PL运单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateTransportWaybillResponse().from_map(
            self.do_request('1.0', 'digital.logistic.transport.waybill.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_transport_waybill_ex_async(
        self,
        request: shuziwuliu_models.CreateTransportWaybillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateTransportWaybillResponse:
        """
        Description: 3PL运单创建
        Summary: 3PL运单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateTransportWaybillResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.transport.waybill.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_waybill_action(
        self,
        request: shuziwuliu_models.UpdateWaybillActionRequest,
    ) -> shuziwuliu_models.UpdateWaybillActionResponse:
        """
        Description: 3PL运单状态更新
        Summary: 3PL运单状态更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_waybill_action_ex(request, headers, runtime)

    async def update_waybill_action_async(
        self,
        request: shuziwuliu_models.UpdateWaybillActionRequest,
    ) -> shuziwuliu_models.UpdateWaybillActionResponse:
        """
        Description: 3PL运单状态更新
        Summary: 3PL运单状态更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_waybill_action_ex_async(request, headers, runtime)

    def update_waybill_action_ex(
        self,
        request: shuziwuliu_models.UpdateWaybillActionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateWaybillActionResponse:
        """
        Description: 3PL运单状态更新
        Summary: 3PL运单状态更新
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateWaybillActionResponse().from_map(
            self.do_request('1.0', 'digital.logistic.waybill.action.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_waybill_action_ex_async(
        self,
        request: shuziwuliu_models.UpdateWaybillActionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateWaybillActionResponse:
        """
        Description: 3PL运单状态更新
        Summary: 3PL运单状态更新
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateWaybillActionResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.waybill.action.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_transport_waybill(
        self,
        request: shuziwuliu_models.UpdateTransportWaybillRequest,
    ) -> shuziwuliu_models.UpdateTransportWaybillResponse:
        """
        Description: 3PL运单修改
        Summary: 3PL运单修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_transport_waybill_ex(request, headers, runtime)

    async def update_transport_waybill_async(
        self,
        request: shuziwuliu_models.UpdateTransportWaybillRequest,
    ) -> shuziwuliu_models.UpdateTransportWaybillResponse:
        """
        Description: 3PL运单修改
        Summary: 3PL运单修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_transport_waybill_ex_async(request, headers, runtime)

    def update_transport_waybill_ex(
        self,
        request: shuziwuliu_models.UpdateTransportWaybillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateTransportWaybillResponse:
        """
        Description: 3PL运单修改
        Summary: 3PL运单修改
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateTransportWaybillResponse().from_map(
            self.do_request('1.0', 'digital.logistic.transport.waybill.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_transport_waybill_ex_async(
        self,
        request: shuziwuliu_models.UpdateTransportWaybillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateTransportWaybillResponse:
        """
        Description: 3PL运单修改
        Summary: 3PL运单修改
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateTransportWaybillResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.transport.waybill.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_transport_receipt(
        self,
        request: shuziwuliu_models.UploadTransportReceiptRequest,
    ) -> shuziwuliu_models.UploadTransportReceiptResponse:
        """
        Description: 3PL回单上传
        Summary: 3PL回单上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_transport_receipt_ex(request, headers, runtime)

    async def upload_transport_receipt_async(
        self,
        request: shuziwuliu_models.UploadTransportReceiptRequest,
    ) -> shuziwuliu_models.UploadTransportReceiptResponse:
        """
        Description: 3PL回单上传
        Summary: 3PL回单上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_transport_receipt_ex_async(request, headers, runtime)

    def upload_transport_receipt_ex(
        self,
        request: shuziwuliu_models.UploadTransportReceiptRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadTransportReceiptResponse:
        """
        Description: 3PL回单上传
        Summary: 3PL回单上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadTransportReceiptResponse().from_map(
            self.do_request('1.0', 'digital.logistic.transport.receipt.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_transport_receipt_ex_async(
        self,
        request: shuziwuliu_models.UploadTransportReceiptRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadTransportReceiptResponse:
        """
        Description: 3PL回单上传
        Summary: 3PL回单上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadTransportReceiptResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.transport.receipt.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_bill_receivablebill(
        self,
        request: shuziwuliu_models.CreateBillReceivablebillRequest,
    ) -> shuziwuliu_models.CreateBillReceivablebillResponse:
        """
        Description: 应收账单创建
        Summary: 应收账单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_bill_receivablebill_ex(request, headers, runtime)

    async def create_bill_receivablebill_async(
        self,
        request: shuziwuliu_models.CreateBillReceivablebillRequest,
    ) -> shuziwuliu_models.CreateBillReceivablebillResponse:
        """
        Description: 应收账单创建
        Summary: 应收账单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_bill_receivablebill_ex_async(request, headers, runtime)

    def create_bill_receivablebill_ex(
        self,
        request: shuziwuliu_models.CreateBillReceivablebillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateBillReceivablebillResponse:
        """
        Description: 应收账单创建
        Summary: 应收账单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateBillReceivablebillResponse().from_map(
            self.do_request('1.0', 'digital.logistic.bill.receivablebill.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_bill_receivablebill_ex_async(
        self,
        request: shuziwuliu_models.CreateBillReceivablebillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateBillReceivablebillResponse:
        """
        Description: 应收账单创建
        Summary: 应收账单创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateBillReceivablebillResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.bill.receivablebill.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_receivablebill_status(
        self,
        request: shuziwuliu_models.UpdateReceivablebillStatusRequest,
    ) -> shuziwuliu_models.UpdateReceivablebillStatusResponse:
        """
        Description: 应收账单状态更新
        Summary: 应收账单状态更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_receivablebill_status_ex(request, headers, runtime)

    async def update_receivablebill_status_async(
        self,
        request: shuziwuliu_models.UpdateReceivablebillStatusRequest,
    ) -> shuziwuliu_models.UpdateReceivablebillStatusResponse:
        """
        Description: 应收账单状态更新
        Summary: 应收账单状态更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_receivablebill_status_ex_async(request, headers, runtime)

    def update_receivablebill_status_ex(
        self,
        request: shuziwuliu_models.UpdateReceivablebillStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateReceivablebillStatusResponse:
        """
        Description: 应收账单状态更新
        Summary: 应收账单状态更新
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateReceivablebillStatusResponse().from_map(
            self.do_request('1.0', 'digital.logistic.receivablebill.status.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_receivablebill_status_ex_async(
        self,
        request: shuziwuliu_models.UpdateReceivablebillStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateReceivablebillStatusResponse:
        """
        Description: 应收账单状态更新
        Summary: 应收账单状态更新
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateReceivablebillStatusResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.receivablebill.status.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_bill_receivablebill(
        self,
        request: shuziwuliu_models.UpdateBillReceivablebillRequest,
    ) -> shuziwuliu_models.UpdateBillReceivablebillResponse:
        """
        Description: 应收账单修改
        Summary: 应收账单修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_bill_receivablebill_ex(request, headers, runtime)

    async def update_bill_receivablebill_async(
        self,
        request: shuziwuliu_models.UpdateBillReceivablebillRequest,
    ) -> shuziwuliu_models.UpdateBillReceivablebillResponse:
        """
        Description: 应收账单修改
        Summary: 应收账单修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_bill_receivablebill_ex_async(request, headers, runtime)

    def update_bill_receivablebill_ex(
        self,
        request: shuziwuliu_models.UpdateBillReceivablebillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateBillReceivablebillResponse:
        """
        Description: 应收账单修改
        Summary: 应收账单修改
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateBillReceivablebillResponse().from_map(
            self.do_request('1.0', 'digital.logistic.bill.receivablebill.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_bill_receivablebill_ex_async(
        self,
        request: shuziwuliu_models.UpdateBillReceivablebillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateBillReceivablebillResponse:
        """
        Description: 应收账单修改
        Summary: 应收账单修改
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateBillReceivablebillResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.bill.receivablebill.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_highway_invoice(
        self,
        request: shuziwuliu_models.CreateHighwayInvoiceRequest,
    ) -> shuziwuliu_models.CreateHighwayInvoiceResponse:
        """
        Description: 路运发票创建
        Summary: 路运发票创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_highway_invoice_ex(request, headers, runtime)

    async def create_highway_invoice_async(
        self,
        request: shuziwuliu_models.CreateHighwayInvoiceRequest,
    ) -> shuziwuliu_models.CreateHighwayInvoiceResponse:
        """
        Description: 路运发票创建
        Summary: 路运发票创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_highway_invoice_ex_async(request, headers, runtime)

    def create_highway_invoice_ex(
        self,
        request: shuziwuliu_models.CreateHighwayInvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateHighwayInvoiceResponse:
        """
        Description: 路运发票创建
        Summary: 路运发票创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateHighwayInvoiceResponse().from_map(
            self.do_request('1.0', 'digital.logistic.highway.invoice.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_highway_invoice_ex_async(
        self,
        request: shuziwuliu_models.CreateHighwayInvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateHighwayInvoiceResponse:
        """
        Description: 路运发票创建
        Summary: 路运发票创建
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateHighwayInvoiceResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.highway.invoice.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_waybill_info(
        self,
        request: shuziwuliu_models.QueryWaybillInfoRequest,
    ) -> shuziwuliu_models.QueryWaybillInfoResponse:
        """
        Description: 查询运单信息
        Summary: 运单信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_waybill_info_ex(request, headers, runtime)

    async def query_waybill_info_async(
        self,
        request: shuziwuliu_models.QueryWaybillInfoRequest,
    ) -> shuziwuliu_models.QueryWaybillInfoResponse:
        """
        Description: 查询运单信息
        Summary: 运单信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_waybill_info_ex_async(request, headers, runtime)

    def query_waybill_info_ex(
        self,
        request: shuziwuliu_models.QueryWaybillInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryWaybillInfoResponse:
        """
        Description: 查询运单信息
        Summary: 运单信息查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryWaybillInfoResponse().from_map(
            self.do_request('1.0', 'digital.logistic.waybill.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_waybill_info_ex_async(
        self,
        request: shuziwuliu_models.QueryWaybillInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryWaybillInfoResponse:
        """
        Description: 查询运单信息
        Summary: 运单信息查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryWaybillInfoResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.waybill.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_bill_receivablebillnodetail(
        self,
        request: shuziwuliu_models.CreateBillReceivablebillnodetailRequest,
    ) -> shuziwuliu_models.CreateBillReceivablebillnodetailResponse:
        """
        Description: 应收账单创建无明细版
        Summary: 应收账单创建无明细版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_bill_receivablebillnodetail_ex(request, headers, runtime)

    async def create_bill_receivablebillnodetail_async(
        self,
        request: shuziwuliu_models.CreateBillReceivablebillnodetailRequest,
    ) -> shuziwuliu_models.CreateBillReceivablebillnodetailResponse:
        """
        Description: 应收账单创建无明细版
        Summary: 应收账单创建无明细版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_bill_receivablebillnodetail_ex_async(request, headers, runtime)

    def create_bill_receivablebillnodetail_ex(
        self,
        request: shuziwuliu_models.CreateBillReceivablebillnodetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateBillReceivablebillnodetailResponse:
        """
        Description: 应收账单创建无明细版
        Summary: 应收账单创建无明细版
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateBillReceivablebillnodetailResponse().from_map(
            self.do_request('1.0', 'digital.logistic.bill.receivablebillnodetail.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_bill_receivablebillnodetail_ex_async(
        self,
        request: shuziwuliu_models.CreateBillReceivablebillnodetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateBillReceivablebillnodetailResponse:
        """
        Description: 应收账单创建无明细版
        Summary: 应收账单创建无明细版
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateBillReceivablebillnodetailResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.bill.receivablebillnodetail.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_trailer_corp(
        self,
        request: shuziwuliu_models.SaveTrailerCorpRequest,
    ) -> shuziwuliu_models.SaveTrailerCorpResponse:
        """
        Description: 企业信息上传/更新
        Summary: 企业信息上传/更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_trailer_corp_ex(request, headers, runtime)

    async def save_trailer_corp_async(
        self,
        request: shuziwuliu_models.SaveTrailerCorpRequest,
    ) -> shuziwuliu_models.SaveTrailerCorpResponse:
        """
        Description: 企业信息上传/更新
        Summary: 企业信息上传/更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_trailer_corp_ex_async(request, headers, runtime)

    def save_trailer_corp_ex(
        self,
        request: shuziwuliu_models.SaveTrailerCorpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveTrailerCorpResponse:
        """
        Description: 企业信息上传/更新
        Summary: 企业信息上传/更新
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveTrailerCorpResponse().from_map(
            self.do_request('1.0', 'digital.logistic.trailer.corp.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_trailer_corp_ex_async(
        self,
        request: shuziwuliu_models.SaveTrailerCorpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveTrailerCorpResponse:
        """
        Description: 企业信息上传/更新
        Summary: 企业信息上传/更新
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveTrailerCorpResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.trailer.corp.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_trailer_transport(
        self,
        request: shuziwuliu_models.SaveTrailerTransportRequest,
    ) -> shuziwuliu_models.SaveTrailerTransportResponse:
        """
        Description: 企业运营数据上传/更新
        Summary: 企业运营数据上传/更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_trailer_transport_ex(request, headers, runtime)

    async def save_trailer_transport_async(
        self,
        request: shuziwuliu_models.SaveTrailerTransportRequest,
    ) -> shuziwuliu_models.SaveTrailerTransportResponse:
        """
        Description: 企业运营数据上传/更新
        Summary: 企业运营数据上传/更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_trailer_transport_ex_async(request, headers, runtime)

    def save_trailer_transport_ex(
        self,
        request: shuziwuliu_models.SaveTrailerTransportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveTrailerTransportResponse:
        """
        Description: 企业运营数据上传/更新
        Summary: 企业运营数据上传/更新
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveTrailerTransportResponse().from_map(
            self.do_request('1.0', 'digital.logistic.trailer.transport.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_trailer_transport_ex_async(
        self,
        request: shuziwuliu_models.SaveTrailerTransportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveTrailerTransportResponse:
        """
        Description: 企业运营数据上传/更新
        Summary: 企业运营数据上传/更新
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveTrailerTransportResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.trailer.transport.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_business_instancestatus(
        self,
        request: shuziwuliu_models.QueryBusinessInstancestatusRequest,
    ) -> shuziwuliu_models.QueryBusinessInstancestatusResponse:
        """
        Description: 根据实例id，查询实例状态
        Summary: 实例状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_business_instancestatus_ex(request, headers, runtime)

    async def query_business_instancestatus_async(
        self,
        request: shuziwuliu_models.QueryBusinessInstancestatusRequest,
    ) -> shuziwuliu_models.QueryBusinessInstancestatusResponse:
        """
        Description: 根据实例id，查询实例状态
        Summary: 实例状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_business_instancestatus_ex_async(request, headers, runtime)

    def query_business_instancestatus_ex(
        self,
        request: shuziwuliu_models.QueryBusinessInstancestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryBusinessInstancestatusResponse:
        """
        Description: 根据实例id，查询实例状态
        Summary: 实例状态查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryBusinessInstancestatusResponse().from_map(
            self.do_request('1.0', 'digital.logistic.business.instancestatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_business_instancestatus_ex_async(
        self,
        request: shuziwuliu_models.QueryBusinessInstancestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryBusinessInstancestatusResponse:
        """
        Description: 根据实例id，查询实例状态
        Summary: 实例状态查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryBusinessInstancestatusResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.business.instancestatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def open_credit_driver(
        self,
        request: shuziwuliu_models.OpenCreditDriverRequest,
    ) -> shuziwuliu_models.OpenCreditDriverResponse:
        """
        Description: 司机信用流转协议签署并开通流转能力
        Summary: 司机信用流转协议签署并开通流转能力
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.open_credit_driver_ex(request, headers, runtime)

    async def open_credit_driver_async(
        self,
        request: shuziwuliu_models.OpenCreditDriverRequest,
    ) -> shuziwuliu_models.OpenCreditDriverResponse:
        """
        Description: 司机信用流转协议签署并开通流转能力
        Summary: 司机信用流转协议签署并开通流转能力
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.open_credit_driver_ex_async(request, headers, runtime)

    def open_credit_driver_ex(
        self,
        request: shuziwuliu_models.OpenCreditDriverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.OpenCreditDriverResponse:
        """
        Description: 司机信用流转协议签署并开通流转能力
        Summary: 司机信用流转协议签署并开通流转能力
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.OpenCreditDriverResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.driver.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def open_credit_driver_ex_async(
        self,
        request: shuziwuliu_models.OpenCreditDriverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.OpenCreditDriverResponse:
        """
        Description: 司机信用流转协议签署并开通流转能力
        Summary: 司机信用流转协议签署并开通流转能力
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.OpenCreditDriverResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.driver.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_credit_driver(
        self,
        request: shuziwuliu_models.QueryCreditDriverRequest,
    ) -> shuziwuliu_models.QueryCreditDriverResponse:
        """
        Description: 查询司机信用流转能力开通情况
        Summary: 查询司机信用流转能力开通情况
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_credit_driver_ex(request, headers, runtime)

    async def query_credit_driver_async(
        self,
        request: shuziwuliu_models.QueryCreditDriverRequest,
    ) -> shuziwuliu_models.QueryCreditDriverResponse:
        """
        Description: 查询司机信用流转能力开通情况
        Summary: 查询司机信用流转能力开通情况
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_credit_driver_ex_async(request, headers, runtime)

    def query_credit_driver_ex(
        self,
        request: shuziwuliu_models.QueryCreditDriverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditDriverResponse:
        """
        Description: 查询司机信用流转能力开通情况
        Summary: 查询司机信用流转能力开通情况
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditDriverResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.driver.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_credit_driver_ex_async(
        self,
        request: shuziwuliu_models.QueryCreditDriverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditDriverResponse:
        """
        Description: 查询司机信用流转能力开通情况
        Summary: 查询司机信用流转能力开通情况
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditDriverResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.driver.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_credit_consignor(
        self,
        request: shuziwuliu_models.QueryCreditConsignorRequest,
    ) -> shuziwuliu_models.QueryCreditConsignorResponse:
        """
        Description: 查询货主信用流转能力开通情况
        Summary: 查询货主信用流转能力开通情况
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_credit_consignor_ex(request, headers, runtime)

    async def query_credit_consignor_async(
        self,
        request: shuziwuliu_models.QueryCreditConsignorRequest,
    ) -> shuziwuliu_models.QueryCreditConsignorResponse:
        """
        Description: 查询货主信用流转能力开通情况
        Summary: 查询货主信用流转能力开通情况
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_credit_consignor_ex_async(request, headers, runtime)

    def query_credit_consignor_ex(
        self,
        request: shuziwuliu_models.QueryCreditConsignorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditConsignorResponse:
        """
        Description: 查询货主信用流转能力开通情况
        Summary: 查询货主信用流转能力开通情况
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditConsignorResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.consignor.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_credit_consignor_ex_async(
        self,
        request: shuziwuliu_models.QueryCreditConsignorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditConsignorResponse:
        """
        Description: 查询货主信用流转能力开通情况
        Summary: 查询货主信用流转能力开通情况
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditConsignorResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.consignor.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_credit_balance(
        self,
        request: shuziwuliu_models.QueryCreditBalanceRequest,
    ) -> shuziwuliu_models.QueryCreditBalanceResponse:
        """
        Description: 查询货主信用流转额度
        Summary: 查询货主信用流转额度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_credit_balance_ex(request, headers, runtime)

    async def query_credit_balance_async(
        self,
        request: shuziwuliu_models.QueryCreditBalanceRequest,
    ) -> shuziwuliu_models.QueryCreditBalanceResponse:
        """
        Description: 查询货主信用流转额度
        Summary: 查询货主信用流转额度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_credit_balance_ex_async(request, headers, runtime)

    def query_credit_balance_ex(
        self,
        request: shuziwuliu_models.QueryCreditBalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditBalanceResponse:
        """
        Description: 查询货主信用流转额度
        Summary: 查询货主信用流转额度
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditBalanceResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.balance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_credit_balance_ex_async(
        self,
        request: shuziwuliu_models.QueryCreditBalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditBalanceResponse:
        """
        Description: 查询货主信用流转额度
        Summary: 查询货主信用流转额度
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditBalanceResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.balance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_credit_issue(
        self,
        request: shuziwuliu_models.UploadCreditIssueRequest,
    ) -> shuziwuliu_models.UploadCreditIssueResponse:
        """
        Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
        Summary: 发行信用流转批次信息上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_credit_issue_ex(request, headers, runtime)

    async def upload_credit_issue_async(
        self,
        request: shuziwuliu_models.UploadCreditIssueRequest,
    ) -> shuziwuliu_models.UploadCreditIssueResponse:
        """
        Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
        Summary: 发行信用流转批次信息上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_credit_issue_ex_async(request, headers, runtime)

    def upload_credit_issue_ex(
        self,
        request: shuziwuliu_models.UploadCreditIssueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadCreditIssueResponse:
        """
        Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
        Summary: 发行信用流转批次信息上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadCreditIssueResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.issue.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_credit_issue_ex_async(
        self,
        request: shuziwuliu_models.UploadCreditIssueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadCreditIssueResponse:
        """
        Description: 发行信用流转批次信息上传（只做信息上传，供真正web端发行时使用）
        Summary: 发行信用流转批次信息上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadCreditIssueResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.issue.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_credit_issuebatchstatus(
        self,
        request: shuziwuliu_models.QueryCreditIssuebatchstatusRequest,
    ) -> shuziwuliu_models.QueryCreditIssuebatchstatusResponse:
        """
        Description: 信用流转批次状态查询
        Summary: 信用流转批次状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_credit_issuebatchstatus_ex(request, headers, runtime)

    async def query_credit_issuebatchstatus_async(
        self,
        request: shuziwuliu_models.QueryCreditIssuebatchstatusRequest,
    ) -> shuziwuliu_models.QueryCreditIssuebatchstatusResponse:
        """
        Description: 信用流转批次状态查询
        Summary: 信用流转批次状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_credit_issuebatchstatus_ex_async(request, headers, runtime)

    def query_credit_issuebatchstatus_ex(
        self,
        request: shuziwuliu_models.QueryCreditIssuebatchstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditIssuebatchstatusResponse:
        """
        Description: 信用流转批次状态查询
        Summary: 信用流转批次状态查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditIssuebatchstatusResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.issuebatchstatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_credit_issuebatchstatus_ex_async(
        self,
        request: shuziwuliu_models.QueryCreditIssuebatchstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditIssuebatchstatusResponse:
        """
        Description: 信用流转批次状态查询
        Summary: 信用流转批次状态查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditIssuebatchstatusResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.issuebatchstatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_credit_issuebatch(
        self,
        request: shuziwuliu_models.CancelCreditIssuebatchRequest,
    ) -> shuziwuliu_models.CancelCreditIssuebatchResponse:
        """
        Description: 支付批次撤销
        Summary: 支付批次撤销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_credit_issuebatch_ex(request, headers, runtime)

    async def cancel_credit_issuebatch_async(
        self,
        request: shuziwuliu_models.CancelCreditIssuebatchRequest,
    ) -> shuziwuliu_models.CancelCreditIssuebatchResponse:
        """
        Description: 支付批次撤销
        Summary: 支付批次撤销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_credit_issuebatch_ex_async(request, headers, runtime)

    def cancel_credit_issuebatch_ex(
        self,
        request: shuziwuliu_models.CancelCreditIssuebatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CancelCreditIssuebatchResponse:
        """
        Description: 支付批次撤销
        Summary: 支付批次撤销
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CancelCreditIssuebatchResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.issuebatch.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_credit_issuebatch_ex_async(
        self,
        request: shuziwuliu_models.CancelCreditIssuebatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CancelCreditIssuebatchResponse:
        """
        Description: 支付批次撤销
        Summary: 支付批次撤销
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CancelCreditIssuebatchResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.issuebatch.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_credit_issuebyid(
        self,
        request: shuziwuliu_models.QueryCreditIssuebyidRequest,
    ) -> shuziwuliu_models.QueryCreditIssuebyidResponse:
        """
        Description: 根据id查询信用凭证信息
        Summary: 根据id查询信用凭证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_credit_issuebyid_ex(request, headers, runtime)

    async def query_credit_issuebyid_async(
        self,
        request: shuziwuliu_models.QueryCreditIssuebyidRequest,
    ) -> shuziwuliu_models.QueryCreditIssuebyidResponse:
        """
        Description: 根据id查询信用凭证信息
        Summary: 根据id查询信用凭证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_credit_issuebyid_ex_async(request, headers, runtime)

    def query_credit_issuebyid_ex(
        self,
        request: shuziwuliu_models.QueryCreditIssuebyidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditIssuebyidResponse:
        """
        Description: 根据id查询信用凭证信息
        Summary: 根据id查询信用凭证信息
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditIssuebyidResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.issuebyid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_credit_issuebyid_ex_async(
        self,
        request: shuziwuliu_models.QueryCreditIssuebyidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditIssuebyidResponse:
        """
        Description: 根据id查询信用凭证信息
        Summary: 根据id查询信用凭证信息
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditIssuebyidResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.issuebyid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_credit_issuebytime(
        self,
        request: shuziwuliu_models.QueryCreditIssuebytimeRequest,
    ) -> shuziwuliu_models.QueryCreditIssuebytimeResponse:
        """
        Description: 根据时间查询信用凭证信息
        Summary: 根据时间查询信用凭证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_credit_issuebytime_ex(request, headers, runtime)

    async def query_credit_issuebytime_async(
        self,
        request: shuziwuliu_models.QueryCreditIssuebytimeRequest,
    ) -> shuziwuliu_models.QueryCreditIssuebytimeResponse:
        """
        Description: 根据时间查询信用凭证信息
        Summary: 根据时间查询信用凭证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_credit_issuebytime_ex_async(request, headers, runtime)

    def query_credit_issuebytime_ex(
        self,
        request: shuziwuliu_models.QueryCreditIssuebytimeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditIssuebytimeResponse:
        """
        Description: 根据时间查询信用凭证信息
        Summary: 根据时间查询信用凭证信息
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditIssuebytimeResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.issuebytime.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_credit_issuebytime_ex_async(
        self,
        request: shuziwuliu_models.QueryCreditIssuebytimeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditIssuebytimeResponse:
        """
        Description: 根据时间查询信用凭证信息
        Summary: 根据时间查询信用凭证信息
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditIssuebytimeResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.issuebytime.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_credit_userissue(
        self,
        request: shuziwuliu_models.QueryCreditUserissueRequest,
    ) -> shuziwuliu_models.QueryCreditUserissueResponse:
        """
        Description: 查询用户持有的信用凭证信息
        Summary: 查询用户持有的信用凭证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_credit_userissue_ex(request, headers, runtime)

    async def query_credit_userissue_async(
        self,
        request: shuziwuliu_models.QueryCreditUserissueRequest,
    ) -> shuziwuliu_models.QueryCreditUserissueResponse:
        """
        Description: 查询用户持有的信用凭证信息
        Summary: 查询用户持有的信用凭证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_credit_userissue_ex_async(request, headers, runtime)

    def query_credit_userissue_ex(
        self,
        request: shuziwuliu_models.QueryCreditUserissueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditUserissueResponse:
        """
        Description: 查询用户持有的信用凭证信息
        Summary: 查询用户持有的信用凭证信息
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditUserissueResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.userissue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_credit_userissue_ex_async(
        self,
        request: shuziwuliu_models.QueryCreditUserissueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditUserissueResponse:
        """
        Description: 查询用户持有的信用凭证信息
        Summary: 查询用户持有的信用凭证信息
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditUserissueResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.userissue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_credit_statement(
        self,
        request: shuziwuliu_models.QueryCreditStatementRequest,
    ) -> shuziwuliu_models.QueryCreditStatementResponse:
        """
        Description: 查询用户信用流转流水记录
        Summary: 查询用户信用流转流水记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_credit_statement_ex(request, headers, runtime)

    async def query_credit_statement_async(
        self,
        request: shuziwuliu_models.QueryCreditStatementRequest,
    ) -> shuziwuliu_models.QueryCreditStatementResponse:
        """
        Description: 查询用户信用流转流水记录
        Summary: 查询用户信用流转流水记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_credit_statement_ex_async(request, headers, runtime)

    def query_credit_statement_ex(
        self,
        request: shuziwuliu_models.QueryCreditStatementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditStatementResponse:
        """
        Description: 查询用户信用流转流水记录
        Summary: 查询用户信用流转流水记录
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditStatementResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.statement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_credit_statement_ex_async(
        self,
        request: shuziwuliu_models.QueryCreditStatementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditStatementResponse:
        """
        Description: 查询用户信用流转流水记录
        Summary: 查询用户信用流转流水记录
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditStatementResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.statement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_credit_issuetransfer(
        self,
        request: shuziwuliu_models.CreateCreditIssuetransferRequest,
    ) -> shuziwuliu_models.CreateCreditIssuetransferResponse:
        """
        Description: 信用凭证拆分转让申请
        Summary: 信用凭证拆分转让申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_credit_issuetransfer_ex(request, headers, runtime)

    async def create_credit_issuetransfer_async(
        self,
        request: shuziwuliu_models.CreateCreditIssuetransferRequest,
    ) -> shuziwuliu_models.CreateCreditIssuetransferResponse:
        """
        Description: 信用凭证拆分转让申请
        Summary: 信用凭证拆分转让申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_credit_issuetransfer_ex_async(request, headers, runtime)

    def create_credit_issuetransfer_ex(
        self,
        request: shuziwuliu_models.CreateCreditIssuetransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateCreditIssuetransferResponse:
        """
        Description: 信用凭证拆分转让申请
        Summary: 信用凭证拆分转让申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateCreditIssuetransferResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.issuetransfer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_credit_issuetransfer_ex_async(
        self,
        request: shuziwuliu_models.CreateCreditIssuetransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateCreditIssuetransferResponse:
        """
        Description: 信用凭证拆分转让申请
        Summary: 信用凭证拆分转让申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateCreditIssuetransferResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.issuetransfer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_credit_issuetransfer(
        self,
        request: shuziwuliu_models.QueryCreditIssuetransferRequest,
    ) -> shuziwuliu_models.QueryCreditIssuetransferResponse:
        """
        Description: 信用凭证拆分转让结果查询
        Summary: 信用凭证拆分转让结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_credit_issuetransfer_ex(request, headers, runtime)

    async def query_credit_issuetransfer_async(
        self,
        request: shuziwuliu_models.QueryCreditIssuetransferRequest,
    ) -> shuziwuliu_models.QueryCreditIssuetransferResponse:
        """
        Description: 信用凭证拆分转让结果查询
        Summary: 信用凭证拆分转让结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_credit_issuetransfer_ex_async(request, headers, runtime)

    def query_credit_issuetransfer_ex(
        self,
        request: shuziwuliu_models.QueryCreditIssuetransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditIssuetransferResponse:
        """
        Description: 信用凭证拆分转让结果查询
        Summary: 信用凭证拆分转让结果查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditIssuetransferResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.issuetransfer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_credit_issuetransfer_ex_async(
        self,
        request: shuziwuliu_models.QueryCreditIssuetransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditIssuetransferResponse:
        """
        Description: 信用凭证拆分转让结果查询
        Summary: 信用凭证拆分转让结果查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditIssuetransferResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.issuetransfer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_credit_issuefinance(
        self,
        request: shuziwuliu_models.CreateCreditIssuefinanceRequest,
    ) -> shuziwuliu_models.CreateCreditIssuefinanceResponse:
        """
        Description: 信用凭证融资申请
        Summary: 信用凭证融资申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_credit_issuefinance_ex(request, headers, runtime)

    async def create_credit_issuefinance_async(
        self,
        request: shuziwuliu_models.CreateCreditIssuefinanceRequest,
    ) -> shuziwuliu_models.CreateCreditIssuefinanceResponse:
        """
        Description: 信用凭证融资申请
        Summary: 信用凭证融资申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_credit_issuefinance_ex_async(request, headers, runtime)

    def create_credit_issuefinance_ex(
        self,
        request: shuziwuliu_models.CreateCreditIssuefinanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateCreditIssuefinanceResponse:
        """
        Description: 信用凭证融资申请
        Summary: 信用凭证融资申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateCreditIssuefinanceResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.issuefinance.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_credit_issuefinance_ex_async(
        self,
        request: shuziwuliu_models.CreateCreditIssuefinanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateCreditIssuefinanceResponse:
        """
        Description: 信用凭证融资申请
        Summary: 信用凭证融资申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateCreditIssuefinanceResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.issuefinance.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_credit_issuefinance(
        self,
        request: shuziwuliu_models.QueryCreditIssuefinanceRequest,
    ) -> shuziwuliu_models.QueryCreditIssuefinanceResponse:
        """
        Description: 信用凭证融资结果查询
        Summary: 信用凭证融资结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_credit_issuefinance_ex(request, headers, runtime)

    async def query_credit_issuefinance_async(
        self,
        request: shuziwuliu_models.QueryCreditIssuefinanceRequest,
    ) -> shuziwuliu_models.QueryCreditIssuefinanceResponse:
        """
        Description: 信用凭证融资结果查询
        Summary: 信用凭证融资结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_credit_issuefinance_ex_async(request, headers, runtime)

    def query_credit_issuefinance_ex(
        self,
        request: shuziwuliu_models.QueryCreditIssuefinanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditIssuefinanceResponse:
        """
        Description: 信用凭证融资结果查询
        Summary: 信用凭证融资结果查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditIssuefinanceResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.issuefinance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_credit_issuefinance_ex_async(
        self,
        request: shuziwuliu_models.QueryCreditIssuefinanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditIssuefinanceResponse:
        """
        Description: 信用凭证融资结果查询
        Summary: 信用凭证融资结果查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditIssuefinanceResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.issuefinance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_credit_issuereceivable(
        self,
        request: shuziwuliu_models.QueryCreditIssuereceivableRequest,
    ) -> shuziwuliu_models.QueryCreditIssuereceivableResponse:
        """
        Description: 信用凭证清分信息查询
        Summary: 信用凭证清分信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_credit_issuereceivable_ex(request, headers, runtime)

    async def query_credit_issuereceivable_async(
        self,
        request: shuziwuliu_models.QueryCreditIssuereceivableRequest,
    ) -> shuziwuliu_models.QueryCreditIssuereceivableResponse:
        """
        Description: 信用凭证清分信息查询
        Summary: 信用凭证清分信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_credit_issuereceivable_ex_async(request, headers, runtime)

    def query_credit_issuereceivable_ex(
        self,
        request: shuziwuliu_models.QueryCreditIssuereceivableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditIssuereceivableResponse:
        """
        Description: 信用凭证清分信息查询
        Summary: 信用凭证清分信息查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditIssuereceivableResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.issuereceivable.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_credit_issuereceivable_ex_async(
        self,
        request: shuziwuliu_models.QueryCreditIssuereceivableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditIssuereceivableResponse:
        """
        Description: 信用凭证清分信息查询
        Summary: 信用凭证清分信息查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditIssuereceivableResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.issuereceivable.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_credit_issueamount(
        self,
        request: shuziwuliu_models.QueryCreditIssueamountRequest,
    ) -> shuziwuliu_models.QueryCreditIssueamountResponse:
        """
        Description: 信用凭证资产查询
        Summary: 信用凭证资产查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_credit_issueamount_ex(request, headers, runtime)

    async def query_credit_issueamount_async(
        self,
        request: shuziwuliu_models.QueryCreditIssueamountRequest,
    ) -> shuziwuliu_models.QueryCreditIssueamountResponse:
        """
        Description: 信用凭证资产查询
        Summary: 信用凭证资产查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_credit_issueamount_ex_async(request, headers, runtime)

    def query_credit_issueamount_ex(
        self,
        request: shuziwuliu_models.QueryCreditIssueamountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditIssueamountResponse:
        """
        Description: 信用凭证资产查询
        Summary: 信用凭证资产查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditIssueamountResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.issueamount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_credit_issueamount_ex_async(
        self,
        request: shuziwuliu_models.QueryCreditIssueamountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditIssueamountResponse:
        """
        Description: 信用凭证资产查询
        Summary: 信用凭证资产查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditIssueamountResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.issueamount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_credit_common(
        self,
        request: shuziwuliu_models.CallbackCreditCommonRequest,
    ) -> shuziwuliu_models.CallbackCreditCommonResponse:
        """
        Description: 物流金融统一回调接口
        Summary: 物流金融统一回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_credit_common_ex(request, headers, runtime)

    async def callback_credit_common_async(
        self,
        request: shuziwuliu_models.CallbackCreditCommonRequest,
    ) -> shuziwuliu_models.CallbackCreditCommonResponse:
        """
        Description: 物流金融统一回调接口
        Summary: 物流金融统一回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_credit_common_ex_async(request, headers, runtime)

    def callback_credit_common_ex(
        self,
        request: shuziwuliu_models.CallbackCreditCommonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CallbackCreditCommonResponse:
        """
        Description: 物流金融统一回调接口
        Summary: 物流金融统一回调接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CallbackCreditCommonResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.common.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_credit_common_ex_async(
        self,
        request: shuziwuliu_models.CallbackCreditCommonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CallbackCreditCommonResponse:
        """
        Description: 物流金融统一回调接口
        Summary: 物流金融统一回调接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CallbackCreditCommonResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.common.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_credit_issueclear(
        self,
        request: shuziwuliu_models.ApplyCreditIssueclearRequest,
    ) -> shuziwuliu_models.ApplyCreditIssueclearResponse:
        """
        Description: 信用凭证主动清分
        Summary: 信用凭证主动清分
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_credit_issueclear_ex(request, headers, runtime)

    async def apply_credit_issueclear_async(
        self,
        request: shuziwuliu_models.ApplyCreditIssueclearRequest,
    ) -> shuziwuliu_models.ApplyCreditIssueclearResponse:
        """
        Description: 信用凭证主动清分
        Summary: 信用凭证主动清分
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_credit_issueclear_ex_async(request, headers, runtime)

    def apply_credit_issueclear_ex(
        self,
        request: shuziwuliu_models.ApplyCreditIssueclearRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyCreditIssueclearResponse:
        """
        Description: 信用凭证主动清分
        Summary: 信用凭证主动清分
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyCreditIssueclearResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.issueclear.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_credit_issueclear_ex_async(
        self,
        request: shuziwuliu_models.ApplyCreditIssueclearRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyCreditIssueclearResponse:
        """
        Description: 信用凭证主动清分
        Summary: 信用凭证主动清分
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyCreditIssueclearResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.issueclear.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_credit_proxy(
        self,
        request: shuziwuliu_models.SendCreditProxyRequest,
    ) -> shuziwuliu_models.SendCreditProxyResponse:
        """
        Description: 物流金融代理消息
        Summary: 物流金融代理消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_credit_proxy_ex(request, headers, runtime)

    async def send_credit_proxy_async(
        self,
        request: shuziwuliu_models.SendCreditProxyRequest,
    ) -> shuziwuliu_models.SendCreditProxyResponse:
        """
        Description: 物流金融代理消息
        Summary: 物流金融代理消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_credit_proxy_ex_async(request, headers, runtime)

    def send_credit_proxy_ex(
        self,
        request: shuziwuliu_models.SendCreditProxyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SendCreditProxyResponse:
        """
        Description: 物流金融代理消息
        Summary: 物流金融代理消息
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SendCreditProxyResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.proxy.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_credit_proxy_ex_async(
        self,
        request: shuziwuliu_models.SendCreditProxyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SendCreditProxyResponse:
        """
        Description: 物流金融代理消息
        Summary: 物流金融代理消息
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SendCreditProxyResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.proxy.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_credit_waybill(
        self,
        request: shuziwuliu_models.CheckCreditWaybillRequest,
    ) -> shuziwuliu_models.CheckCreditWaybillResponse:
        """
        Description: 运单信用流转核验结果查询
        Summary: 运单信用流转核验结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_credit_waybill_ex(request, headers, runtime)

    async def check_credit_waybill_async(
        self,
        request: shuziwuliu_models.CheckCreditWaybillRequest,
    ) -> shuziwuliu_models.CheckCreditWaybillResponse:
        """
        Description: 运单信用流转核验结果查询
        Summary: 运单信用流转核验结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_credit_waybill_ex_async(request, headers, runtime)

    def check_credit_waybill_ex(
        self,
        request: shuziwuliu_models.CheckCreditWaybillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CheckCreditWaybillResponse:
        """
        Description: 运单信用流转核验结果查询
        Summary: 运单信用流转核验结果查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CheckCreditWaybillResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.waybill.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_credit_waybill_ex_async(
        self,
        request: shuziwuliu_models.CheckCreditWaybillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CheckCreditWaybillResponse:
        """
        Description: 运单信用流转核验结果查询
        Summary: 运单信用流转核验结果查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CheckCreditWaybillResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.waybill.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reopen_credit_driver(
        self,
        request: shuziwuliu_models.ReopenCreditDriverRequest,
    ) -> shuziwuliu_models.ReopenCreditDriverResponse:
        """
        Description: 物流金融信用流转司机换绑
        Summary: 物流金融信用流转司机换绑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reopen_credit_driver_ex(request, headers, runtime)

    async def reopen_credit_driver_async(
        self,
        request: shuziwuliu_models.ReopenCreditDriverRequest,
    ) -> shuziwuliu_models.ReopenCreditDriverResponse:
        """
        Description: 物流金融信用流转司机换绑
        Summary: 物流金融信用流转司机换绑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reopen_credit_driver_ex_async(request, headers, runtime)

    def reopen_credit_driver_ex(
        self,
        request: shuziwuliu_models.ReopenCreditDriverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ReopenCreditDriverResponse:
        """
        Description: 物流金融信用流转司机换绑
        Summary: 物流金融信用流转司机换绑
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ReopenCreditDriverResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.driver.reopen', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reopen_credit_driver_ex_async(
        self,
        request: shuziwuliu_models.ReopenCreditDriverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ReopenCreditDriverResponse:
        """
        Description: 物流金融信用流转司机换绑
        Summary: 物流金融信用流转司机换绑
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ReopenCreditDriverResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.driver.reopen', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_credit_authorization(
        self,
        request: shuziwuliu_models.UploadCreditAuthorizationRequest,
    ) -> shuziwuliu_models.UploadCreditAuthorizationResponse:
        """
        Description: 线下协议授权关系上传
        Summary: 线下协议授权关系上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_credit_authorization_ex(request, headers, runtime)

    async def upload_credit_authorization_async(
        self,
        request: shuziwuliu_models.UploadCreditAuthorizationRequest,
    ) -> shuziwuliu_models.UploadCreditAuthorizationResponse:
        """
        Description: 线下协议授权关系上传
        Summary: 线下协议授权关系上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_credit_authorization_ex_async(request, headers, runtime)

    def upload_credit_authorization_ex(
        self,
        request: shuziwuliu_models.UploadCreditAuthorizationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadCreditAuthorizationResponse:
        """
        Description: 线下协议授权关系上传
        Summary: 线下协议授权关系上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadCreditAuthorizationResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.authorization.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_credit_authorization_ex_async(
        self,
        request: shuziwuliu_models.UploadCreditAuthorizationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadCreditAuthorizationResponse:
        """
        Description: 线下协议授权关系上传
        Summary: 线下协议授权关系上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadCreditAuthorizationResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.authorization.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_credit_confirm(
        self,
        request: shuziwuliu_models.UploadCreditConfirmRequest,
    ) -> shuziwuliu_models.UploadCreditConfirmResponse:
        """
        Description: 线上应收转让确认关系
        Summary: 线上应收转让确认关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_credit_confirm_ex(request, headers, runtime)

    async def upload_credit_confirm_async(
        self,
        request: shuziwuliu_models.UploadCreditConfirmRequest,
    ) -> shuziwuliu_models.UploadCreditConfirmResponse:
        """
        Description: 线上应收转让确认关系
        Summary: 线上应收转让确认关系
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_credit_confirm_ex_async(request, headers, runtime)

    def upload_credit_confirm_ex(
        self,
        request: shuziwuliu_models.UploadCreditConfirmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadCreditConfirmResponse:
        """
        Description: 线上应收转让确认关系
        Summary: 线上应收转让确认关系
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadCreditConfirmResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.confirm.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_credit_confirm_ex_async(
        self,
        request: shuziwuliu_models.UploadCreditConfirmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadCreditConfirmResponse:
        """
        Description: 线上应收转让确认关系
        Summary: 线上应收转让确认关系
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadCreditConfirmResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.confirm.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_creditmode_issue(
        self,
        request: shuziwuliu_models.BatchcreateCreditmodeIssueRequest,
    ) -> shuziwuliu_models.BatchcreateCreditmodeIssueResponse:
        """
        Description: 物流信用流转凭证批量发行
        Summary: 物流信用流转凭证批量发行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_creditmode_issue_ex(request, headers, runtime)

    async def batchcreate_creditmode_issue_async(
        self,
        request: shuziwuliu_models.BatchcreateCreditmodeIssueRequest,
    ) -> shuziwuliu_models.BatchcreateCreditmodeIssueResponse:
        """
        Description: 物流信用流转凭证批量发行
        Summary: 物流信用流转凭证批量发行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_creditmode_issue_ex_async(request, headers, runtime)

    def batchcreate_creditmode_issue_ex(
        self,
        request: shuziwuliu_models.BatchcreateCreditmodeIssueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.BatchcreateCreditmodeIssueResponse:
        """
        Description: 物流信用流转凭证批量发行
        Summary: 物流信用流转凭证批量发行
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.BatchcreateCreditmodeIssueResponse().from_map(
            self.do_request('1.0', 'digital.logistic.creditmode.issue.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_creditmode_issue_ex_async(
        self,
        request: shuziwuliu_models.BatchcreateCreditmodeIssueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.BatchcreateCreditmodeIssueResponse:
        """
        Description: 物流信用流转凭证批量发行
        Summary: 物流信用流转凭证批量发行
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.BatchcreateCreditmodeIssueResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.creditmode.issue.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_creditmode_issueclear(
        self,
        request: shuziwuliu_models.ApplyCreditmodeIssueclearRequest,
    ) -> shuziwuliu_models.ApplyCreditmodeIssueclearResponse:
        """
        Description: 物流信用流转按模式主动清分
        Summary: 物流信用流转按模式主动清分
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_creditmode_issueclear_ex(request, headers, runtime)

    async def apply_creditmode_issueclear_async(
        self,
        request: shuziwuliu_models.ApplyCreditmodeIssueclearRequest,
    ) -> shuziwuliu_models.ApplyCreditmodeIssueclearResponse:
        """
        Description: 物流信用流转按模式主动清分
        Summary: 物流信用流转按模式主动清分
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_creditmode_issueclear_ex_async(request, headers, runtime)

    def apply_creditmode_issueclear_ex(
        self,
        request: shuziwuliu_models.ApplyCreditmodeIssueclearRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyCreditmodeIssueclearResponse:
        """
        Description: 物流信用流转按模式主动清分
        Summary: 物流信用流转按模式主动清分
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyCreditmodeIssueclearResponse().from_map(
            self.do_request('1.0', 'digital.logistic.creditmode.issueclear.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_creditmode_issueclear_ex_async(
        self,
        request: shuziwuliu_models.ApplyCreditmodeIssueclearRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyCreditmodeIssueclearResponse:
        """
        Description: 物流信用流转按模式主动清分
        Summary: 物流信用流转按模式主动清分
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyCreditmodeIssueclearResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.creditmode.issueclear.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_credit_issuebysaas(
        self,
        request: shuziwuliu_models.UploadCreditIssuebysaasRequest,
    ) -> shuziwuliu_models.UploadCreditIssuebysaasResponse:
        """
        Description: 信用流转发行信息上传SAAS版
        Summary: 信用流转发行信息上传SAAS版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_credit_issuebysaas_ex(request, headers, runtime)

    async def upload_credit_issuebysaas_async(
        self,
        request: shuziwuliu_models.UploadCreditIssuebysaasRequest,
    ) -> shuziwuliu_models.UploadCreditIssuebysaasResponse:
        """
        Description: 信用流转发行信息上传SAAS版
        Summary: 信用流转发行信息上传SAAS版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_credit_issuebysaas_ex_async(request, headers, runtime)

    def upload_credit_issuebysaas_ex(
        self,
        request: shuziwuliu_models.UploadCreditIssuebysaasRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadCreditIssuebysaasResponse:
        """
        Description: 信用流转发行信息上传SAAS版
        Summary: 信用流转发行信息上传SAAS版
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadCreditIssuebysaasResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.issuebysaas.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_credit_issuebysaas_ex_async(
        self,
        request: shuziwuliu_models.UploadCreditIssuebysaasRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadCreditIssuebysaasResponse:
        """
        Description: 信用流转发行信息上传SAAS版
        Summary: 信用流转发行信息上传SAAS版
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadCreditIssuebysaasResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.issuebysaas.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_credit_issuebatchbysaas(
        self,
        request: shuziwuliu_models.CancelCreditIssuebatchbysaasRequest,
    ) -> shuziwuliu_models.CancelCreditIssuebatchbysaasResponse:
        """
        Description: 信用流转B模式发行批次撤销SAAS版
        Summary: 信用流转B模式发行批次撤销SAAS版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_credit_issuebatchbysaas_ex(request, headers, runtime)

    async def cancel_credit_issuebatchbysaas_async(
        self,
        request: shuziwuliu_models.CancelCreditIssuebatchbysaasRequest,
    ) -> shuziwuliu_models.CancelCreditIssuebatchbysaasResponse:
        """
        Description: 信用流转B模式发行批次撤销SAAS版
        Summary: 信用流转B模式发行批次撤销SAAS版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_credit_issuebatchbysaas_ex_async(request, headers, runtime)

    def cancel_credit_issuebatchbysaas_ex(
        self,
        request: shuziwuliu_models.CancelCreditIssuebatchbysaasRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CancelCreditIssuebatchbysaasResponse:
        """
        Description: 信用流转B模式发行批次撤销SAAS版
        Summary: 信用流转B模式发行批次撤销SAAS版
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CancelCreditIssuebatchbysaasResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.issuebatchbysaas.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_credit_issuebatchbysaas_ex_async(
        self,
        request: shuziwuliu_models.CancelCreditIssuebatchbysaasRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CancelCreditIssuebatchbysaasResponse:
        """
        Description: 信用流转B模式发行批次撤销SAAS版
        Summary: 信用流转B模式发行批次撤销SAAS版
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CancelCreditIssuebatchbysaasResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.issuebatchbysaas.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_credit_balancebysaas(
        self,
        request: shuziwuliu_models.QueryCreditBalancebysaasRequest,
    ) -> shuziwuliu_models.QueryCreditBalancebysaasResponse:
        """
        Description: 信用流转可用额度查询SAAS版
        Summary: 信用流转可用额度查询SAAS版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_credit_balancebysaas_ex(request, headers, runtime)

    async def query_credit_balancebysaas_async(
        self,
        request: shuziwuliu_models.QueryCreditBalancebysaasRequest,
    ) -> shuziwuliu_models.QueryCreditBalancebysaasResponse:
        """
        Description: 信用流转可用额度查询SAAS版
        Summary: 信用流转可用额度查询SAAS版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_credit_balancebysaas_ex_async(request, headers, runtime)

    def query_credit_balancebysaas_ex(
        self,
        request: shuziwuliu_models.QueryCreditBalancebysaasRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditBalancebysaasResponse:
        """
        Description: 信用流转可用额度查询SAAS版
        Summary: 信用流转可用额度查询SAAS版
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditBalancebysaasResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.balancebysaas.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_credit_balancebysaas_ex_async(
        self,
        request: shuziwuliu_models.QueryCreditBalancebysaasRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditBalancebysaasResponse:
        """
        Description: 信用流转可用额度查询SAAS版
        Summary: 信用流转可用额度查询SAAS版
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditBalancebysaasResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.balancebysaas.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_credit_issuescpticket(
        self,
        request: shuziwuliu_models.GetCreditIssuescpticketRequest,
    ) -> shuziwuliu_models.GetCreditIssuescpticketResponse:
        """
        Description: 信用凭证电子回单获取
        Summary: 信用凭证电子回单获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_credit_issuescpticket_ex(request, headers, runtime)

    async def get_credit_issuescpticket_async(
        self,
        request: shuziwuliu_models.GetCreditIssuescpticketRequest,
    ) -> shuziwuliu_models.GetCreditIssuescpticketResponse:
        """
        Description: 信用凭证电子回单获取
        Summary: 信用凭证电子回单获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_credit_issuescpticket_ex_async(request, headers, runtime)

    def get_credit_issuescpticket_ex(
        self,
        request: shuziwuliu_models.GetCreditIssuescpticketRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.GetCreditIssuescpticketResponse:
        """
        Description: 信用凭证电子回单获取
        Summary: 信用凭证电子回单获取
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.GetCreditIssuescpticketResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.issuescpticket.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_credit_issuescpticket_ex_async(
        self,
        request: shuziwuliu_models.GetCreditIssuescpticketRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.GetCreditIssuescpticketResponse:
        """
        Description: 信用凭证电子回单获取
        Summary: 信用凭证电子回单获取
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.GetCreditIssuescpticketResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.issuescpticket.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_credit_issuescpticketresult(
        self,
        request: shuziwuliu_models.QueryCreditIssuescpticketresultRequest,
    ) -> shuziwuliu_models.QueryCreditIssuescpticketresultResponse:
        """
        Description: 信用凭证电子回单获取结果查询接口
        Summary: 信用凭证电子回单获取结果查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_credit_issuescpticketresult_ex(request, headers, runtime)

    async def query_credit_issuescpticketresult_async(
        self,
        request: shuziwuliu_models.QueryCreditIssuescpticketresultRequest,
    ) -> shuziwuliu_models.QueryCreditIssuescpticketresultResponse:
        """
        Description: 信用凭证电子回单获取结果查询接口
        Summary: 信用凭证电子回单获取结果查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_credit_issuescpticketresult_ex_async(request, headers, runtime)

    def query_credit_issuescpticketresult_ex(
        self,
        request: shuziwuliu_models.QueryCreditIssuescpticketresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditIssuescpticketresultResponse:
        """
        Description: 信用凭证电子回单获取结果查询接口
        Summary: 信用凭证电子回单获取结果查询接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditIssuescpticketresultResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.issuescpticketresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_credit_issuescpticketresult_ex_async(
        self,
        request: shuziwuliu_models.QueryCreditIssuescpticketresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditIssuescpticketresultResponse:
        """
        Description: 信用凭证电子回单获取结果查询接口
        Summary: 信用凭证电子回单获取结果查询接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditIssuescpticketresultResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.issuescpticketresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_credit_aplusissue(
        self,
        request: shuziwuliu_models.UploadCreditAplusissueRequest,
    ) -> shuziwuliu_models.UploadCreditAplusissueResponse:
        """
        Description: 信用流转A+模式发行信息上传
        Summary: 信用流转A+模式发行信息上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_credit_aplusissue_ex(request, headers, runtime)

    async def upload_credit_aplusissue_async(
        self,
        request: shuziwuliu_models.UploadCreditAplusissueRequest,
    ) -> shuziwuliu_models.UploadCreditAplusissueResponse:
        """
        Description: 信用流转A+模式发行信息上传
        Summary: 信用流转A+模式发行信息上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_credit_aplusissue_ex_async(request, headers, runtime)

    def upload_credit_aplusissue_ex(
        self,
        request: shuziwuliu_models.UploadCreditAplusissueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadCreditAplusissueResponse:
        """
        Description: 信用流转A+模式发行信息上传
        Summary: 信用流转A+模式发行信息上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadCreditAplusissueResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.aplusissue.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_credit_aplusissue_ex_async(
        self,
        request: shuziwuliu_models.UploadCreditAplusissueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadCreditAplusissueResponse:
        """
        Description: 信用流转A+模式发行信息上传
        Summary: 信用流转A+模式发行信息上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadCreditAplusissueResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.aplusissue.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_credit_creditamount(
        self,
        request: shuziwuliu_models.QueryCreditCreditamountRequest,
    ) -> shuziwuliu_models.QueryCreditCreditamountResponse:
        """
        Description: 信用流转可用额度查询接口
        Summary: 信用流转可用额度查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_credit_creditamount_ex(request, headers, runtime)

    async def query_credit_creditamount_async(
        self,
        request: shuziwuliu_models.QueryCreditCreditamountRequest,
    ) -> shuziwuliu_models.QueryCreditCreditamountResponse:
        """
        Description: 信用流转可用额度查询接口
        Summary: 信用流转可用额度查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_credit_creditamount_ex_async(request, headers, runtime)

    def query_credit_creditamount_ex(
        self,
        request: shuziwuliu_models.QueryCreditCreditamountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditCreditamountResponse:
        """
        Description: 信用流转可用额度查询接口
        Summary: 信用流转可用额度查询接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditCreditamountResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.creditamount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_credit_creditamount_ex_async(
        self,
        request: shuziwuliu_models.QueryCreditCreditamountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditCreditamountResponse:
        """
        Description: 信用流转可用额度查询接口
        Summary: 信用流转可用额度查询接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditCreditamountResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.creditamount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_credit_commonsign(
        self,
        request: shuziwuliu_models.CreateCreditCommonsignRequest,
    ) -> shuziwuliu_models.CreateCreditCommonsignResponse:
        """
        Description: 信用流转非授信通用签约接口
        Summary: 信用流转非授信通用签约接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_credit_commonsign_ex(request, headers, runtime)

    async def create_credit_commonsign_async(
        self,
        request: shuziwuliu_models.CreateCreditCommonsignRequest,
    ) -> shuziwuliu_models.CreateCreditCommonsignResponse:
        """
        Description: 信用流转非授信通用签约接口
        Summary: 信用流转非授信通用签约接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_credit_commonsign_ex_async(request, headers, runtime)

    def create_credit_commonsign_ex(
        self,
        request: shuziwuliu_models.CreateCreditCommonsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateCreditCommonsignResponse:
        """
        Description: 信用流转非授信通用签约接口
        Summary: 信用流转非授信通用签约接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateCreditCommonsignResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.commonsign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_credit_commonsign_ex_async(
        self,
        request: shuziwuliu_models.CreateCreditCommonsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateCreditCommonsignResponse:
        """
        Description: 信用流转非授信通用签约接口
        Summary: 信用流转非授信通用签约接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateCreditCommonsignResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.commonsign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_credit_commonsign(
        self,
        request: shuziwuliu_models.QueryCreditCommonsignRequest,
    ) -> shuziwuliu_models.QueryCreditCommonsignResponse:
        """
        Description: 信用流转非授信通用签约查询接口
        Summary: 信用流转非授信通用签约查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_credit_commonsign_ex(request, headers, runtime)

    async def query_credit_commonsign_async(
        self,
        request: shuziwuliu_models.QueryCreditCommonsignRequest,
    ) -> shuziwuliu_models.QueryCreditCommonsignResponse:
        """
        Description: 信用流转非授信通用签约查询接口
        Summary: 信用流转非授信通用签约查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_credit_commonsign_ex_async(request, headers, runtime)

    def query_credit_commonsign_ex(
        self,
        request: shuziwuliu_models.QueryCreditCommonsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditCommonsignResponse:
        """
        Description: 信用流转非授信通用签约查询接口
        Summary: 信用流转非授信通用签约查询接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditCommonsignResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.commonsign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_credit_commonsign_ex_async(
        self,
        request: shuziwuliu_models.QueryCreditCommonsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryCreditCommonsignResponse:
        """
        Description: 信用流转非授信通用签约查询接口
        Summary: 信用流转非授信通用签约查询接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryCreditCommonsignResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.commonsign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_credit_issue(
        self,
        request: shuziwuliu_models.BatchcreateCreditIssueRequest,
    ) -> shuziwuliu_models.BatchcreateCreditIssueResponse:
        """
        Description: 信用流转凭证合并发行接口
        Summary: 信用流转凭证合并发行接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_credit_issue_ex(request, headers, runtime)

    async def batchcreate_credit_issue_async(
        self,
        request: shuziwuliu_models.BatchcreateCreditIssueRequest,
    ) -> shuziwuliu_models.BatchcreateCreditIssueResponse:
        """
        Description: 信用流转凭证合并发行接口
        Summary: 信用流转凭证合并发行接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_credit_issue_ex_async(request, headers, runtime)

    def batchcreate_credit_issue_ex(
        self,
        request: shuziwuliu_models.BatchcreateCreditIssueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.BatchcreateCreditIssueResponse:
        """
        Description: 信用流转凭证合并发行接口
        Summary: 信用流转凭证合并发行接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.BatchcreateCreditIssueResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.issue.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_credit_issue_ex_async(
        self,
        request: shuziwuliu_models.BatchcreateCreditIssueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.BatchcreateCreditIssueResponse:
        """
        Description: 信用流转凭证合并发行接口
        Summary: 信用流转凭证合并发行接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.BatchcreateCreditIssueResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.issue.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_credit_issuebatch(
        self,
        request: shuziwuliu_models.UploadCreditIssuebatchRequest,
    ) -> shuziwuliu_models.UploadCreditIssuebatchResponse:
        """
        Description: 信用流转凭证合并发行信息上传接口
        Summary: 信用流转凭证合并发行信息上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_credit_issuebatch_ex(request, headers, runtime)

    async def upload_credit_issuebatch_async(
        self,
        request: shuziwuliu_models.UploadCreditIssuebatchRequest,
    ) -> shuziwuliu_models.UploadCreditIssuebatchResponse:
        """
        Description: 信用流转凭证合并发行信息上传接口
        Summary: 信用流转凭证合并发行信息上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_credit_issuebatch_ex_async(request, headers, runtime)

    def upload_credit_issuebatch_ex(
        self,
        request: shuziwuliu_models.UploadCreditIssuebatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadCreditIssuebatchResponse:
        """
        Description: 信用流转凭证合并发行信息上传接口
        Summary: 信用流转凭证合并发行信息上传接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadCreditIssuebatchResponse().from_map(
            self.do_request('1.0', 'digital.logistic.credit.issuebatch.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_credit_issuebatch_ex_async(
        self,
        request: shuziwuliu_models.UploadCreditIssuebatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadCreditIssuebatchResponse:
        """
        Description: 信用流转凭证合并发行信息上传接口
        Summary: 信用流转凭证合并发行信息上传接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadCreditIssuebatchResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.credit.issuebatch.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_issue_transferfile(
        self,
        request: shuziwuliu_models.GetIssueTransferfileRequest,
    ) -> shuziwuliu_models.GetIssueTransferfileResponse:
        """
        Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
        Summary: 信用凭证电子回单获取(新)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_issue_transferfile_ex(request, headers, runtime)

    async def get_issue_transferfile_async(
        self,
        request: shuziwuliu_models.GetIssueTransferfileRequest,
    ) -> shuziwuliu_models.GetIssueTransferfileResponse:
        """
        Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
        Summary: 信用凭证电子回单获取(新)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_issue_transferfile_ex_async(request, headers, runtime)

    def get_issue_transferfile_ex(
        self,
        request: shuziwuliu_models.GetIssueTransferfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.GetIssueTransferfileResponse:
        """
        Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
        Summary: 信用凭证电子回单获取(新)
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.GetIssueTransferfileResponse().from_map(
            self.do_request('1.0', 'digital.logistic.issue.transferfile.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_issue_transferfile_ex_async(
        self,
        request: shuziwuliu_models.GetIssueTransferfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.GetIssueTransferfileResponse:
        """
        Description: 信用凭证电子回单获取(新)，明确了凭证的转出方did和转入方did
        Summary: 信用凭证电子回单获取(新)
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.GetIssueTransferfileResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.issue.transferfile.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_insurancepolicy_zhonghuacaixian(
        self,
        request: shuziwuliu_models.ApplyInsurancepolicyZhonghuacaixianRequest,
    ) -> shuziwuliu_models.ApplyInsurancepolicyZhonghuacaixianResponse:
        """
        Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
        Summary: 投保接口-中华财险-承运人责任险
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_insurancepolicy_zhonghuacaixian_ex(request, headers, runtime)

    async def apply_insurancepolicy_zhonghuacaixian_async(
        self,
        request: shuziwuliu_models.ApplyInsurancepolicyZhonghuacaixianRequest,
    ) -> shuziwuliu_models.ApplyInsurancepolicyZhonghuacaixianResponse:
        """
        Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
        Summary: 投保接口-中华财险-承运人责任险
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_insurancepolicy_zhonghuacaixian_ex_async(request, headers, runtime)

    def apply_insurancepolicy_zhonghuacaixian_ex(
        self,
        request: shuziwuliu_models.ApplyInsurancepolicyZhonghuacaixianRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsurancepolicyZhonghuacaixianResponse:
        """
        Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
        Summary: 投保接口-中华财险-承运人责任险
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsurancepolicyZhonghuacaixianResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurancepolicy.zhonghuacaixian.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_insurancepolicy_zhonghuacaixian_ex_async(
        self,
        request: shuziwuliu_models.ApplyInsurancepolicyZhonghuacaixianRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsurancepolicyZhonghuacaixianResponse:
        """
        Description: 保险服务，投保接口。接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
        Summary: 投保接口-中华财险-承运人责任险
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsurancepolicyZhonghuacaixianResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurancepolicy.zhonghuacaixian.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_insurancepolicy_zhonghuacaixian(
        self,
        request: shuziwuliu_models.CancelInsurancepolicyZhonghuacaixianRequest,
    ) -> shuziwuliu_models.CancelInsurancepolicyZhonghuacaixianResponse:
        """
        Description: 数字物流保险，退保接口
        Summary: 退保接口-中华财险-承运人责任险
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_insurancepolicy_zhonghuacaixian_ex(request, headers, runtime)

    async def cancel_insurancepolicy_zhonghuacaixian_async(
        self,
        request: shuziwuliu_models.CancelInsurancepolicyZhonghuacaixianRequest,
    ) -> shuziwuliu_models.CancelInsurancepolicyZhonghuacaixianResponse:
        """
        Description: 数字物流保险，退保接口
        Summary: 退保接口-中华财险-承运人责任险
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_insurancepolicy_zhonghuacaixian_ex_async(request, headers, runtime)

    def cancel_insurancepolicy_zhonghuacaixian_ex(
        self,
        request: shuziwuliu_models.CancelInsurancepolicyZhonghuacaixianRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CancelInsurancepolicyZhonghuacaixianResponse:
        """
        Description: 数字物流保险，退保接口
        Summary: 退保接口-中华财险-承运人责任险
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CancelInsurancepolicyZhonghuacaixianResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurancepolicy.zhonghuacaixian.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_insurancepolicy_zhonghuacaixian_ex_async(
        self,
        request: shuziwuliu_models.CancelInsurancepolicyZhonghuacaixianRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CancelInsurancepolicyZhonghuacaixianResponse:
        """
        Description: 数字物流保险，退保接口
        Summary: 退保接口-中华财险-承运人责任险
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CancelInsurancepolicyZhonghuacaixianResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurancepolicy.zhonghuacaixian.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_insurancenotify_claim(
        self,
        request: shuziwuliu_models.PushInsurancenotifyClaimRequest,
    ) -> shuziwuliu_models.PushInsurancenotifyClaimResponse:
        """
        Description: 保险理赔通知
        Summary: 保险理赔通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_insurancenotify_claim_ex(request, headers, runtime)

    async def push_insurancenotify_claim_async(
        self,
        request: shuziwuliu_models.PushInsurancenotifyClaimRequest,
    ) -> shuziwuliu_models.PushInsurancenotifyClaimResponse:
        """
        Description: 保险理赔通知
        Summary: 保险理赔通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_insurancenotify_claim_ex_async(request, headers, runtime)

    def push_insurancenotify_claim_ex(
        self,
        request: shuziwuliu_models.PushInsurancenotifyClaimRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.PushInsurancenotifyClaimResponse:
        """
        Description: 保险理赔通知
        Summary: 保险理赔通知
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.PushInsurancenotifyClaimResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurancenotify.claim.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_insurancenotify_claim_ex_async(
        self,
        request: shuziwuliu_models.PushInsurancenotifyClaimRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.PushInsurancenotifyClaimResponse:
        """
        Description: 保险理赔通知
        Summary: 保险理赔通知
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.PushInsurancenotifyClaimResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurancenotify.claim.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_insurance_fileurl(
        self,
        request: shuziwuliu_models.ApplyInsuranceFileurlRequest,
    ) -> shuziwuliu_models.ApplyInsuranceFileurlResponse:
        """
        Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
        Summary: 上传文件链接申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_insurance_fileurl_ex(request, headers, runtime)

    async def apply_insurance_fileurl_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceFileurlRequest,
    ) -> shuziwuliu_models.ApplyInsuranceFileurlResponse:
        """
        Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
        Summary: 上传文件链接申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_insurance_fileurl_ex_async(request, headers, runtime)

    def apply_insurance_fileurl_ex(
        self,
        request: shuziwuliu_models.ApplyInsuranceFileurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceFileurlResponse:
        """
        Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
        Summary: 上传文件链接申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceFileurlResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurance.fileurl.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_insurance_fileurl_ex_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceFileurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceFileurlResponse:
        """
        Description: 系统会生成上传文件的连接，使用方使用该链接进行文件上传。该链接具有一定的时效性，因此建议按需按时申请使用
        Summary: 上传文件链接申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceFileurlResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurance.fileurl.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_insurancepolicy_universal(
        self,
        request: shuziwuliu_models.ApplyInsurancepolicyUniversalRequest,
    ) -> shuziwuliu_models.ApplyInsurancepolicyUniversalResponse:
        """
        Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
        接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
        Summary: 投保接口-承运人平台责任险
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_insurancepolicy_universal_ex(request, headers, runtime)

    async def apply_insurancepolicy_universal_async(
        self,
        request: shuziwuliu_models.ApplyInsurancepolicyUniversalRequest,
    ) -> shuziwuliu_models.ApplyInsurancepolicyUniversalResponse:
        """
        Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
        接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
        Summary: 投保接口-承运人平台责任险
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_insurancepolicy_universal_ex_async(request, headers, runtime)

    def apply_insurancepolicy_universal_ex(
        self,
        request: shuziwuliu_models.ApplyInsurancepolicyUniversalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsurancepolicyUniversalResponse:
        """
        Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
        接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
        Summary: 投保接口-承运人平台责任险
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsurancepolicyUniversalResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurancepolicy.universal.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_insurancepolicy_universal_ex_async(
        self,
        request: shuziwuliu_models.ApplyInsurancepolicyUniversalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsurancepolicyUniversalResponse:
        """
        Description: 保险服务-平台责任险投保接口。根据运输货物货值生成相应的保费。
        接口提供幂等逻辑，请求后接口会返回成功、失败、处理中。其中处理中是极端场景，需要客户端使用相同的业务流水号发起重试，以免造成重复投保
        Summary: 投保接口-承运人平台责任险
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsurancepolicyUniversalResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurancepolicy.universal.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_insurancepolicy_universal(
        self,
        request: shuziwuliu_models.CancelInsurancepolicyUniversalRequest,
    ) -> shuziwuliu_models.CancelInsurancepolicyUniversalResponse:
        """
        Description: 数字物流保险，退保接口
        Summary: 退保接口-承运人平台责任险
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_insurancepolicy_universal_ex(request, headers, runtime)

    async def cancel_insurancepolicy_universal_async(
        self,
        request: shuziwuliu_models.CancelInsurancepolicyUniversalRequest,
    ) -> shuziwuliu_models.CancelInsurancepolicyUniversalResponse:
        """
        Description: 数字物流保险，退保接口
        Summary: 退保接口-承运人平台责任险
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_insurancepolicy_universal_ex_async(request, headers, runtime)

    def cancel_insurancepolicy_universal_ex(
        self,
        request: shuziwuliu_models.CancelInsurancepolicyUniversalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CancelInsurancepolicyUniversalResponse:
        """
        Description: 数字物流保险，退保接口
        Summary: 退保接口-承运人平台责任险
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CancelInsurancepolicyUniversalResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurancepolicy.universal.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_insurancepolicy_universal_ex_async(
        self,
        request: shuziwuliu_models.CancelInsurancepolicyUniversalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CancelInsurancepolicyUniversalResponse:
        """
        Description: 数字物流保险，退保接口
        Summary: 退保接口-承运人平台责任险
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CancelInsurancepolicyUniversalResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurancepolicy.universal.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_insurance_olp(
        self,
        request: shuziwuliu_models.PushInsuranceOlpRequest,
    ) -> shuziwuliu_models.PushInsuranceOlpResponse:
        """
        Description: 利用区块链智能合约进行离线保单存证
        Summary: 离线保单存证推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_insurance_olp_ex(request, headers, runtime)

    async def push_insurance_olp_async(
        self,
        request: shuziwuliu_models.PushInsuranceOlpRequest,
    ) -> shuziwuliu_models.PushInsuranceOlpResponse:
        """
        Description: 利用区块链智能合约进行离线保单存证
        Summary: 离线保单存证推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_insurance_olp_ex_async(request, headers, runtime)

    def push_insurance_olp_ex(
        self,
        request: shuziwuliu_models.PushInsuranceOlpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.PushInsuranceOlpResponse:
        """
        Description: 利用区块链智能合约进行离线保单存证
        Summary: 离线保单存证推送
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.PushInsuranceOlpResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurance.olp.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_insurance_olp_ex_async(
        self,
        request: shuziwuliu_models.PushInsuranceOlpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.PushInsuranceOlpResponse:
        """
        Description: 利用区块链智能合约进行离线保单存证
        Summary: 离线保单存证推送
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.PushInsuranceOlpResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurance.olp.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_insurance_olp(
        self,
        request: shuziwuliu_models.UpdateInsuranceOlpRequest,
    ) -> shuziwuliu_models.UpdateInsuranceOlpResponse:
        """
        Description: 利用区块链智能合约进行离线保单信息更新追踪
        Summary: 离线保单更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_insurance_olp_ex(request, headers, runtime)

    async def update_insurance_olp_async(
        self,
        request: shuziwuliu_models.UpdateInsuranceOlpRequest,
    ) -> shuziwuliu_models.UpdateInsuranceOlpResponse:
        """
        Description: 利用区块链智能合约进行离线保单信息更新追踪
        Summary: 离线保单更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_insurance_olp_ex_async(request, headers, runtime)

    def update_insurance_olp_ex(
        self,
        request: shuziwuliu_models.UpdateInsuranceOlpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateInsuranceOlpResponse:
        """
        Description: 利用区块链智能合约进行离线保单信息更新追踪
        Summary: 离线保单更新
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateInsuranceOlpResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurance.olp.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_insurance_olp_ex_async(
        self,
        request: shuziwuliu_models.UpdateInsuranceOlpRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateInsuranceOlpResponse:
        """
        Description: 利用区块链智能合约进行离线保单信息更新追踪
        Summary: 离线保单更新
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateInsuranceOlpResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurance.olp.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_insurance_reppolicy(
        self,
        request: shuziwuliu_models.PushInsuranceReppolicyRequest,
    ) -> shuziwuliu_models.PushInsuranceReppolicyResponse:
        """
        Description: 再保分保单推送接口
        Summary: 再保分保单推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_insurance_reppolicy_ex(request, headers, runtime)

    async def push_insurance_reppolicy_async(
        self,
        request: shuziwuliu_models.PushInsuranceReppolicyRequest,
    ) -> shuziwuliu_models.PushInsuranceReppolicyResponse:
        """
        Description: 再保分保单推送接口
        Summary: 再保分保单推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_insurance_reppolicy_ex_async(request, headers, runtime)

    def push_insurance_reppolicy_ex(
        self,
        request: shuziwuliu_models.PushInsuranceReppolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.PushInsuranceReppolicyResponse:
        """
        Description: 再保分保单推送接口
        Summary: 再保分保单推送
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.PushInsuranceReppolicyResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurance.reppolicy.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_insurance_reppolicy_ex_async(
        self,
        request: shuziwuliu_models.PushInsuranceReppolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.PushInsuranceReppolicyResponse:
        """
        Description: 再保分保单推送接口
        Summary: 再保分保单推送
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.PushInsuranceReppolicyResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurance.reppolicy.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_insurance_repcorrect(
        self,
        request: shuziwuliu_models.PushInsuranceRepcorrectRequest,
    ) -> shuziwuliu_models.PushInsuranceRepcorrectResponse:
        """
        Description: 再保批改单推送
        Summary: 再保批改单推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_insurance_repcorrect_ex(request, headers, runtime)

    async def push_insurance_repcorrect_async(
        self,
        request: shuziwuliu_models.PushInsuranceRepcorrectRequest,
    ) -> shuziwuliu_models.PushInsuranceRepcorrectResponse:
        """
        Description: 再保批改单推送
        Summary: 再保批改单推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_insurance_repcorrect_ex_async(request, headers, runtime)

    def push_insurance_repcorrect_ex(
        self,
        request: shuziwuliu_models.PushInsuranceRepcorrectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.PushInsuranceRepcorrectResponse:
        """
        Description: 再保批改单推送
        Summary: 再保批改单推送
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.PushInsuranceRepcorrectResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurance.repcorrect.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_insurance_repcorrect_ex_async(
        self,
        request: shuziwuliu_models.PushInsuranceRepcorrectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.PushInsuranceRepcorrectResponse:
        """
        Description: 再保批改单推送
        Summary: 再保批改单推送
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.PushInsuranceRepcorrectResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurance.repcorrect.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_insurance_cbrf(
        self,
        request: shuziwuliu_models.ApplyInsuranceCbrfRequest,
    ) -> shuziwuliu_models.ApplyInsuranceCbrfResponse:
        """
        Description: 跨境运费险投保申请
        Summary: 跨境运费险投保
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_insurance_cbrf_ex(request, headers, runtime)

    async def apply_insurance_cbrf_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceCbrfRequest,
    ) -> shuziwuliu_models.ApplyInsuranceCbrfResponse:
        """
        Description: 跨境运费险投保申请
        Summary: 跨境运费险投保
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_insurance_cbrf_ex_async(request, headers, runtime)

    def apply_insurance_cbrf_ex(
        self,
        request: shuziwuliu_models.ApplyInsuranceCbrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceCbrfResponse:
        """
        Description: 跨境运费险投保申请
        Summary: 跨境运费险投保
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceCbrfResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurance.cbrf.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_insurance_cbrf_ex_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceCbrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceCbrfResponse:
        """
        Description: 跨境运费险投保申请
        Summary: 跨境运费险投保
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceCbrfResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurance.cbrf.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def repay_insurance_cbrf(
        self,
        request: shuziwuliu_models.RepayInsuranceCbrfRequest,
    ) -> shuziwuliu_models.RepayInsuranceCbrfResponse:
        """
        Description: 跨境运费险理赔
        Summary: 跨境运费险理赔
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.repay_insurance_cbrf_ex(request, headers, runtime)

    async def repay_insurance_cbrf_async(
        self,
        request: shuziwuliu_models.RepayInsuranceCbrfRequest,
    ) -> shuziwuliu_models.RepayInsuranceCbrfResponse:
        """
        Description: 跨境运费险理赔
        Summary: 跨境运费险理赔
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.repay_insurance_cbrf_ex_async(request, headers, runtime)

    def repay_insurance_cbrf_ex(
        self,
        request: shuziwuliu_models.RepayInsuranceCbrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.RepayInsuranceCbrfResponse:
        """
        Description: 跨境运费险理赔
        Summary: 跨境运费险理赔
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.RepayInsuranceCbrfResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurance.cbrf.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def repay_insurance_cbrf_ex_async(
        self,
        request: shuziwuliu_models.RepayInsuranceCbrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.RepayInsuranceCbrfResponse:
        """
        Description: 跨境运费险理赔
        Summary: 跨境运费险理赔
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.RepayInsuranceCbrfResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurance.cbrf.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_insurance_cbec(
        self,
        request: shuziwuliu_models.ApplyInsuranceCbecRequest,
    ) -> shuziwuliu_models.ApplyInsuranceCbecResponse:
        """
        Description: 跨境出口货运险投保
        Summary: 跨境出口货运险投保
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_insurance_cbec_ex(request, headers, runtime)

    async def apply_insurance_cbec_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceCbecRequest,
    ) -> shuziwuliu_models.ApplyInsuranceCbecResponse:
        """
        Description: 跨境出口货运险投保
        Summary: 跨境出口货运险投保
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_insurance_cbec_ex_async(request, headers, runtime)

    def apply_insurance_cbec_ex(
        self,
        request: shuziwuliu_models.ApplyInsuranceCbecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceCbecResponse:
        """
        Description: 跨境出口货运险投保
        Summary: 跨境出口货运险投保
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceCbecResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurance.cbec.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_insurance_cbec_ex_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceCbecRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceCbecResponse:
        """
        Description: 跨境出口货运险投保
        Summary: 跨境出口货运险投保
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceCbecResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurance.cbec.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_insurance_stockin(
        self,
        request: shuziwuliu_models.ApplyInsuranceStockinRequest,
    ) -> shuziwuliu_models.ApplyInsuranceStockinResponse:
        """
        Description: 货物入库申报
        Summary: 货物入库申报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_insurance_stockin_ex(request, headers, runtime)

    async def apply_insurance_stockin_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceStockinRequest,
    ) -> shuziwuliu_models.ApplyInsuranceStockinResponse:
        """
        Description: 货物入库申报
        Summary: 货物入库申报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_insurance_stockin_ex_async(request, headers, runtime)

    def apply_insurance_stockin_ex(
        self,
        request: shuziwuliu_models.ApplyInsuranceStockinRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceStockinResponse:
        """
        Description: 货物入库申报
        Summary: 货物入库申报
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceStockinResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurance.stockin.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_insurance_stockin_ex_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceStockinRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceStockinResponse:
        """
        Description: 货物入库申报
        Summary: 货物入库申报
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceStockinResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurance.stockin.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_insurance_inventory(
        self,
        request: shuziwuliu_models.ApplyInsuranceInventoryRequest,
    ) -> shuziwuliu_models.ApplyInsuranceInventoryResponse:
        """
        Description: 货物库存申报
        Summary: 货物库存申报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_insurance_inventory_ex(request, headers, runtime)

    async def apply_insurance_inventory_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceInventoryRequest,
    ) -> shuziwuliu_models.ApplyInsuranceInventoryResponse:
        """
        Description: 货物库存申报
        Summary: 货物库存申报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_insurance_inventory_ex_async(request, headers, runtime)

    def apply_insurance_inventory_ex(
        self,
        request: shuziwuliu_models.ApplyInsuranceInventoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceInventoryResponse:
        """
        Description: 货物库存申报
        Summary: 货物库存申报
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceInventoryResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurance.inventory.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_insurance_inventory_ex_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceInventoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceInventoryResponse:
        """
        Description: 货物库存申报
        Summary: 货物库存申报
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceInventoryResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurance.inventory.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_insurance_ospi(
        self,
        request: shuziwuliu_models.ApplyInsuranceOspiRequest,
    ) -> shuziwuliu_models.ApplyInsuranceOspiResponse:
        """
        Description: 海外邮包险投保api
        Summary: 海外邮包险投保
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_insurance_ospi_ex(request, headers, runtime)

    async def apply_insurance_ospi_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceOspiRequest,
    ) -> shuziwuliu_models.ApplyInsuranceOspiResponse:
        """
        Description: 海外邮包险投保api
        Summary: 海外邮包险投保
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_insurance_ospi_ex_async(request, headers, runtime)

    def apply_insurance_ospi_ex(
        self,
        request: shuziwuliu_models.ApplyInsuranceOspiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceOspiResponse:
        """
        Description: 海外邮包险投保api
        Summary: 海外邮包险投保
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceOspiResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurance.ospi.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_insurance_ospi_ex_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceOspiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceOspiResponse:
        """
        Description: 海外邮包险投保api
        Summary: 海外邮包险投保
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceOspiResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurance.ospi.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_insurance_ospireport(
        self,
        request: shuziwuliu_models.ApplyInsuranceOspireportRequest,
    ) -> shuziwuliu_models.ApplyInsuranceOspireportResponse:
        """
        Description: 海外、跨境邮包险理赔报案
        Summary: 海外、跨境邮包险报案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_insurance_ospireport_ex(request, headers, runtime)

    async def apply_insurance_ospireport_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceOspireportRequest,
    ) -> shuziwuliu_models.ApplyInsuranceOspireportResponse:
        """
        Description: 海外、跨境邮包险理赔报案
        Summary: 海外、跨境邮包险报案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_insurance_ospireport_ex_async(request, headers, runtime)

    def apply_insurance_ospireport_ex(
        self,
        request: shuziwuliu_models.ApplyInsuranceOspireportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceOspireportResponse:
        """
        Description: 海外、跨境邮包险理赔报案
        Summary: 海外、跨境邮包险报案
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceOspireportResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurance.ospireport.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_insurance_ospireport_ex_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceOspireportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceOspireportResponse:
        """
        Description: 海外、跨境邮包险理赔报案
        Summary: 海外、跨境邮包险报案
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceOspireportResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurance.ospireport.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_insurance_ospireport(
        self,
        request: shuziwuliu_models.NotifyInsuranceOspireportRequest,
    ) -> shuziwuliu_models.NotifyInsuranceOspireportResponse:
        """
        Description: 海外、跨境邮包险案件结果通知
        Summary: 海外、跨境邮包险案件结果通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_insurance_ospireport_ex(request, headers, runtime)

    async def notify_insurance_ospireport_async(
        self,
        request: shuziwuliu_models.NotifyInsuranceOspireportRequest,
    ) -> shuziwuliu_models.NotifyInsuranceOspireportResponse:
        """
        Description: 海外、跨境邮包险案件结果通知
        Summary: 海外、跨境邮包险案件结果通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_insurance_ospireport_ex_async(request, headers, runtime)

    def notify_insurance_ospireport_ex(
        self,
        request: shuziwuliu_models.NotifyInsuranceOspireportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.NotifyInsuranceOspireportResponse:
        """
        Description: 海外、跨境邮包险案件结果通知
        Summary: 海外、跨境邮包险案件结果通知
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.NotifyInsuranceOspireportResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurance.ospireport.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_insurance_ospireport_ex_async(
        self,
        request: shuziwuliu_models.NotifyInsuranceOspireportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.NotifyInsuranceOspireportResponse:
        """
        Description: 海外、跨境邮包险案件结果通知
        Summary: 海外、跨境邮包险案件结果通知
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.NotifyInsuranceOspireportResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurance.ospireport.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_insurance_yzb(
        self,
        request: shuziwuliu_models.ApplyInsuranceYzbRequest,
    ) -> shuziwuliu_models.ApplyInsuranceYzbResponse:
        """
        Description: 驿站宝投保
        Summary: 驿站宝投保
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_insurance_yzb_ex(request, headers, runtime)

    async def apply_insurance_yzb_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceYzbRequest,
    ) -> shuziwuliu_models.ApplyInsuranceYzbResponse:
        """
        Description: 驿站宝投保
        Summary: 驿站宝投保
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_insurance_yzb_ex_async(request, headers, runtime)

    def apply_insurance_yzb_ex(
        self,
        request: shuziwuliu_models.ApplyInsuranceYzbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceYzbResponse:
        """
        Description: 驿站宝投保
        Summary: 驿站宝投保
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceYzbResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurance.yzb.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_insurance_yzb_ex_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceYzbRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceYzbResponse:
        """
        Description: 驿站宝投保
        Summary: 驿站宝投保
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceYzbResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurance.yzb.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_insurance_cbpi(
        self,
        request: shuziwuliu_models.ApplyInsuranceCbpiRequest,
    ) -> shuziwuliu_models.ApplyInsuranceCbpiResponse:
        """
        Description: 跨境邮包险投保
        Summary: 跨境邮包险投保
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_insurance_cbpi_ex(request, headers, runtime)

    async def apply_insurance_cbpi_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceCbpiRequest,
    ) -> shuziwuliu_models.ApplyInsuranceCbpiResponse:
        """
        Description: 跨境邮包险投保
        Summary: 跨境邮包险投保
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_insurance_cbpi_ex_async(request, headers, runtime)

    def apply_insurance_cbpi_ex(
        self,
        request: shuziwuliu_models.ApplyInsuranceCbpiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceCbpiResponse:
        """
        Description: 跨境邮包险投保
        Summary: 跨境邮包险投保
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceCbpiResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurance.cbpi.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_insurance_cbpi_ex_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceCbpiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceCbpiResponse:
        """
        Description: 跨境邮包险投保
        Summary: 跨境邮包险投保
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceCbpiResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurance.cbpi.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_insurance_yzbreport(
        self,
        request: shuziwuliu_models.ApplyInsuranceYzbreportRequest,
    ) -> shuziwuliu_models.ApplyInsuranceYzbreportResponse:
        """
        Description: 驿站宝报案
        Summary: 驿站宝报案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_insurance_yzbreport_ex(request, headers, runtime)

    async def apply_insurance_yzbreport_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceYzbreportRequest,
    ) -> shuziwuliu_models.ApplyInsuranceYzbreportResponse:
        """
        Description: 驿站宝报案
        Summary: 驿站宝报案
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_insurance_yzbreport_ex_async(request, headers, runtime)

    def apply_insurance_yzbreport_ex(
        self,
        request: shuziwuliu_models.ApplyInsuranceYzbreportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceYzbreportResponse:
        """
        Description: 驿站宝报案
        Summary: 驿站宝报案
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceYzbreportResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurance.yzbreport.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_insurance_yzbreport_ex_async(
        self,
        request: shuziwuliu_models.ApplyInsuranceYzbreportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyInsuranceYzbreportResponse:
        """
        Description: 驿站宝报案
        Summary: 驿站宝报案
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyInsuranceYzbreportResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurance.yzbreport.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_insurance_yzbreport(
        self,
        request: shuziwuliu_models.QueryInsuranceYzbreportRequest,
    ) -> shuziwuliu_models.QueryInsuranceYzbreportResponse:
        """
        Description: 驿站宝案件进度查询
        Summary: 驿站宝案件进度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_insurance_yzbreport_ex(request, headers, runtime)

    async def query_insurance_yzbreport_async(
        self,
        request: shuziwuliu_models.QueryInsuranceYzbreportRequest,
    ) -> shuziwuliu_models.QueryInsuranceYzbreportResponse:
        """
        Description: 驿站宝案件进度查询
        Summary: 驿站宝案件进度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_insurance_yzbreport_ex_async(request, headers, runtime)

    def query_insurance_yzbreport_ex(
        self,
        request: shuziwuliu_models.QueryInsuranceYzbreportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryInsuranceYzbreportResponse:
        """
        Description: 驿站宝案件进度查询
        Summary: 驿站宝案件进度查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryInsuranceYzbreportResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurance.yzbreport.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_insurance_yzbreport_ex_async(
        self,
        request: shuziwuliu_models.QueryInsuranceYzbreportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryInsuranceYzbreportResponse:
        """
        Description: 驿站宝案件进度查询
        Summary: 驿站宝案件进度查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryInsuranceYzbreportResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurance.yzbreport.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_insurance_waybill(
        self,
        request: shuziwuliu_models.SaveInsuranceWaybillRequest,
    ) -> shuziwuliu_models.SaveInsuranceWaybillResponse:
        """
        Description: 零担快运运单上链存证接口
        Summary: 零担快运运单上链存证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_insurance_waybill_ex(request, headers, runtime)

    async def save_insurance_waybill_async(
        self,
        request: shuziwuliu_models.SaveInsuranceWaybillRequest,
    ) -> shuziwuliu_models.SaveInsuranceWaybillResponse:
        """
        Description: 零担快运运单上链存证接口
        Summary: 零担快运运单上链存证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_insurance_waybill_ex_async(request, headers, runtime)

    def save_insurance_waybill_ex(
        self,
        request: shuziwuliu_models.SaveInsuranceWaybillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveInsuranceWaybillResponse:
        """
        Description: 零担快运运单上链存证接口
        Summary: 零担快运运单上链存证接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveInsuranceWaybillResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurance.waybill.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_insurance_waybill_ex_async(
        self,
        request: shuziwuliu_models.SaveInsuranceWaybillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveInsuranceWaybillResponse:
        """
        Description: 零担快运运单上链存证接口
        Summary: 零担快运运单上链存证接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveInsuranceWaybillResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurance.waybill.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_insurance_epolicy(
        self,
        request: shuziwuliu_models.QueryInsuranceEpolicyRequest,
    ) -> shuziwuliu_models.QueryInsuranceEpolicyResponse:
        """
        Description: 保险电子保单查询
        Summary: 保险电子保单查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_insurance_epolicy_ex(request, headers, runtime)

    async def query_insurance_epolicy_async(
        self,
        request: shuziwuliu_models.QueryInsuranceEpolicyRequest,
    ) -> shuziwuliu_models.QueryInsuranceEpolicyResponse:
        """
        Description: 保险电子保单查询
        Summary: 保险电子保单查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_insurance_epolicy_ex_async(request, headers, runtime)

    def query_insurance_epolicy_ex(
        self,
        request: shuziwuliu_models.QueryInsuranceEpolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryInsuranceEpolicyResponse:
        """
        Description: 保险电子保单查询
        Summary: 保险电子保单查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryInsuranceEpolicyResponse().from_map(
            self.do_request('1.0', 'digital.logistic.insurance.epolicy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_insurance_epolicy_ex_async(
        self,
        request: shuziwuliu_models.QueryInsuranceEpolicyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryInsuranceEpolicyResponse:
        """
        Description: 保险电子保单查询
        Summary: 保险电子保单查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryInsuranceEpolicyResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.insurance.epolicy.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_auth_signinfo(
        self,
        request: shuziwuliu_models.PushAuthSigninfoRequest,
    ) -> shuziwuliu_models.PushAuthSigninfoResponse:
        """
        Description: 授权签署信息推送
        Summary: 授权签署信息推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_auth_signinfo_ex(request, headers, runtime)

    async def push_auth_signinfo_async(
        self,
        request: shuziwuliu_models.PushAuthSigninfoRequest,
    ) -> shuziwuliu_models.PushAuthSigninfoResponse:
        """
        Description: 授权签署信息推送
        Summary: 授权签署信息推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_auth_signinfo_ex_async(request, headers, runtime)

    def push_auth_signinfo_ex(
        self,
        request: shuziwuliu_models.PushAuthSigninfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.PushAuthSigninfoResponse:
        """
        Description: 授权签署信息推送
        Summary: 授权签署信息推送
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.PushAuthSigninfoResponse().from_map(
            self.do_request('1.0', 'digital.logistic.auth.signinfo.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_auth_signinfo_ex_async(
        self,
        request: shuziwuliu_models.PushAuthSigninfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.PushAuthSigninfoResponse:
        """
        Description: 授权签署信息推送
        Summary: 授权签署信息推送
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.PushAuthSigninfoResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.auth.signinfo.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pf_payment(
        self,
        request: shuziwuliu_models.QueryPfPaymentRequest,
    ) -> shuziwuliu_models.QueryPfPaymentResponse:
        """
        Description: 池融资委托支付入账查询
        Summary: 委托支付入账查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pf_payment_ex(request, headers, runtime)

    async def query_pf_payment_async(
        self,
        request: shuziwuliu_models.QueryPfPaymentRequest,
    ) -> shuziwuliu_models.QueryPfPaymentResponse:
        """
        Description: 池融资委托支付入账查询
        Summary: 委托支付入账查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pf_payment_ex_async(request, headers, runtime)

    def query_pf_payment_ex(
        self,
        request: shuziwuliu_models.QueryPfPaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryPfPaymentResponse:
        """
        Description: 池融资委托支付入账查询
        Summary: 委托支付入账查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryPfPaymentResponse().from_map(
            self.do_request('1.0', 'digital.logistic.pf.payment.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pf_payment_ex_async(
        self,
        request: shuziwuliu_models.QueryPfPaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryPfPaymentResponse:
        """
        Description: 池融资委托支付入账查询
        Summary: 委托支付入账查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryPfPaymentResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.pf.payment.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pf_iou(
        self,
        request: shuziwuliu_models.QueryPfIouRequest,
    ) -> shuziwuliu_models.QueryPfIouResponse:
        """
        Description: 池融资借据信息查询
        Summary: 借据信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pf_iou_ex(request, headers, runtime)

    async def query_pf_iou_async(
        self,
        request: shuziwuliu_models.QueryPfIouRequest,
    ) -> shuziwuliu_models.QueryPfIouResponse:
        """
        Description: 池融资借据信息查询
        Summary: 借据信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pf_iou_ex_async(request, headers, runtime)

    def query_pf_iou_ex(
        self,
        request: shuziwuliu_models.QueryPfIouRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryPfIouResponse:
        """
        Description: 池融资借据信息查询
        Summary: 借据信息查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryPfIouResponse().from_map(
            self.do_request('1.0', 'digital.logistic.pf.iou.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pf_iou_ex_async(
        self,
        request: shuziwuliu_models.QueryPfIouRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryPfIouResponse:
        """
        Description: 池融资借据信息查询
        Summary: 借据信息查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryPfIouResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.pf.iou.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pf_quota(
        self,
        request: shuziwuliu_models.QueryPfQuotaRequest,
    ) -> shuziwuliu_models.QueryPfQuotaResponse:
        """
        Description: 池融资授信额度查询
        Summary: 授信额度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pf_quota_ex(request, headers, runtime)

    async def query_pf_quota_async(
        self,
        request: shuziwuliu_models.QueryPfQuotaRequest,
    ) -> shuziwuliu_models.QueryPfQuotaResponse:
        """
        Description: 池融资授信额度查询
        Summary: 授信额度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pf_quota_ex_async(request, headers, runtime)

    def query_pf_quota_ex(
        self,
        request: shuziwuliu_models.QueryPfQuotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryPfQuotaResponse:
        """
        Description: 池融资授信额度查询
        Summary: 授信额度查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryPfQuotaResponse().from_map(
            self.do_request('1.0', 'digital.logistic.pf.quota.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pf_quota_ex_async(
        self,
        request: shuziwuliu_models.QueryPfQuotaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryPfQuotaResponse:
        """
        Description: 池融资授信额度查询
        Summary: 授信额度查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryPfQuotaResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.pf.quota.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_pf_waybillfinancing(
        self,
        request: shuziwuliu_models.ApplyPfWaybillfinancingRequest,
    ) -> shuziwuliu_models.ApplyPfWaybillfinancingResponse:
        """
        Description: 池融资支用申请
        Summary: 池融资支用申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_pf_waybillfinancing_ex(request, headers, runtime)

    async def apply_pf_waybillfinancing_async(
        self,
        request: shuziwuliu_models.ApplyPfWaybillfinancingRequest,
    ) -> shuziwuliu_models.ApplyPfWaybillfinancingResponse:
        """
        Description: 池融资支用申请
        Summary: 池融资支用申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_pf_waybillfinancing_ex_async(request, headers, runtime)

    def apply_pf_waybillfinancing_ex(
        self,
        request: shuziwuliu_models.ApplyPfWaybillfinancingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyPfWaybillfinancingResponse:
        """
        Description: 池融资支用申请
        Summary: 池融资支用申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyPfWaybillfinancingResponse().from_map(
            self.do_request('1.0', 'digital.logistic.pf.waybillfinancing.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_pf_waybillfinancing_ex_async(
        self,
        request: shuziwuliu_models.ApplyPfWaybillfinancingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyPfWaybillfinancingResponse:
        """
        Description: 池融资支用申请
        Summary: 池融资支用申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyPfWaybillfinancingResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.pf.waybillfinancing.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_pf_pledge(
        self,
        request: shuziwuliu_models.PushPfPledgeRequest,
    ) -> shuziwuliu_models.PushPfPledgeResponse:
        """
        Description: 池融资账单质押，用于入池
        Summary: 池融资账单质押
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_pf_pledge_ex(request, headers, runtime)

    async def push_pf_pledge_async(
        self,
        request: shuziwuliu_models.PushPfPledgeRequest,
    ) -> shuziwuliu_models.PushPfPledgeResponse:
        """
        Description: 池融资账单质押，用于入池
        Summary: 池融资账单质押
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_pf_pledge_ex_async(request, headers, runtime)

    def push_pf_pledge_ex(
        self,
        request: shuziwuliu_models.PushPfPledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.PushPfPledgeResponse:
        """
        Description: 池融资账单质押，用于入池
        Summary: 池融资账单质押
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.PushPfPledgeResponse().from_map(
            self.do_request('1.0', 'digital.logistic.pf.pledge.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_pf_pledge_ex_async(
        self,
        request: shuziwuliu_models.PushPfPledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.PushPfPledgeResponse:
        """
        Description: 池融资账单质押，用于入池
        Summary: 池融资账单质押
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.PushPfPledgeResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.pf.pledge.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pf_pledge(
        self,
        request: shuziwuliu_models.QueryPfPledgeRequest,
    ) -> shuziwuliu_models.QueryPfPledgeResponse:
        """
        Description: 入池账单质押状态查询
        Summary: 质押状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pf_pledge_ex(request, headers, runtime)

    async def query_pf_pledge_async(
        self,
        request: shuziwuliu_models.QueryPfPledgeRequest,
    ) -> shuziwuliu_models.QueryPfPledgeResponse:
        """
        Description: 入池账单质押状态查询
        Summary: 质押状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pf_pledge_ex_async(request, headers, runtime)

    def query_pf_pledge_ex(
        self,
        request: shuziwuliu_models.QueryPfPledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryPfPledgeResponse:
        """
        Description: 入池账单质押状态查询
        Summary: 质押状态查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryPfPledgeResponse().from_map(
            self.do_request('1.0', 'digital.logistic.pf.pledge.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pf_pledge_ex_async(
        self,
        request: shuziwuliu_models.QueryPfPledgeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryPfPledgeResponse:
        """
        Description: 入池账单质押状态查询
        Summary: 质押状态查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryPfPledgeResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.pf.pledge.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pf_financing(
        self,
        request: shuziwuliu_models.QueryPfFinancingRequest,
    ) -> shuziwuliu_models.QueryPfFinancingResponse:
        """
        Description: 池融资融资支用状态查询
        Summary: 池融资融资支用状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pf_financing_ex(request, headers, runtime)

    async def query_pf_financing_async(
        self,
        request: shuziwuliu_models.QueryPfFinancingRequest,
    ) -> shuziwuliu_models.QueryPfFinancingResponse:
        """
        Description: 池融资融资支用状态查询
        Summary: 池融资融资支用状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pf_financing_ex_async(request, headers, runtime)

    def query_pf_financing_ex(
        self,
        request: shuziwuliu_models.QueryPfFinancingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryPfFinancingResponse:
        """
        Description: 池融资融资支用状态查询
        Summary: 池融资融资支用状态查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryPfFinancingResponse().from_map(
            self.do_request('1.0', 'digital.logistic.pf.financing.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pf_financing_ex_async(
        self,
        request: shuziwuliu_models.QueryPfFinancingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryPfFinancingResponse:
        """
        Description: 池融资融资支用状态查询
        Summary: 池融资融资支用状态查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryPfFinancingResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.pf.financing.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_pf_voucher(
        self,
        request: shuziwuliu_models.CheckPfVoucherRequest,
    ) -> shuziwuliu_models.CheckPfVoucherResponse:
        """
        Description: 池融资凭证核验结果查询
        Summary: 池融资凭证核验结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_pf_voucher_ex(request, headers, runtime)

    async def check_pf_voucher_async(
        self,
        request: shuziwuliu_models.CheckPfVoucherRequest,
    ) -> shuziwuliu_models.CheckPfVoucherResponse:
        """
        Description: 池融资凭证核验结果查询
        Summary: 池融资凭证核验结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_pf_voucher_ex_async(request, headers, runtime)

    def check_pf_voucher_ex(
        self,
        request: shuziwuliu_models.CheckPfVoucherRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CheckPfVoucherResponse:
        """
        Description: 池融资凭证核验结果查询
        Summary: 池融资凭证核验结果查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CheckPfVoucherResponse().from_map(
            self.do_request('1.0', 'digital.logistic.pf.voucher.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_pf_voucher_ex_async(
        self,
        request: shuziwuliu_models.CheckPfVoucherRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CheckPfVoucherResponse:
        """
        Description: 池融资凭证核验结果查询
        Summary: 池融资凭证核验结果查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CheckPfVoucherResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.pf.voucher.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_pf_confirmation(
        self,
        request: shuziwuliu_models.ApplyPfConfirmationRequest,
    ) -> shuziwuliu_models.ApplyPfConfirmationResponse:
        """
        Description: 池融资提款确认书申请
        Summary: 提款确认书申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_pf_confirmation_ex(request, headers, runtime)

    async def apply_pf_confirmation_async(
        self,
        request: shuziwuliu_models.ApplyPfConfirmationRequest,
    ) -> shuziwuliu_models.ApplyPfConfirmationResponse:
        """
        Description: 池融资提款确认书申请
        Summary: 提款确认书申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_pf_confirmation_ex_async(request, headers, runtime)

    def apply_pf_confirmation_ex(
        self,
        request: shuziwuliu_models.ApplyPfConfirmationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyPfConfirmationResponse:
        """
        Description: 池融资提款确认书申请
        Summary: 提款确认书申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyPfConfirmationResponse().from_map(
            self.do_request('1.0', 'digital.logistic.pf.confirmation.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_pf_confirmation_ex_async(
        self,
        request: shuziwuliu_models.ApplyPfConfirmationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyPfConfirmationResponse:
        """
        Description: 池融资提款确认书申请
        Summary: 提款确认书申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyPfConfirmationResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.pf.confirmation.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_pf_financingqualification(
        self,
        request: shuziwuliu_models.ApplyPfFinancingqualificationRequest,
    ) -> shuziwuliu_models.ApplyPfFinancingqualificationResponse:
        """
        Description: 池融资融资资格申请
        Summary: 池融资融资资格申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_pf_financingqualification_ex(request, headers, runtime)

    async def apply_pf_financingqualification_async(
        self,
        request: shuziwuliu_models.ApplyPfFinancingqualificationRequest,
    ) -> shuziwuliu_models.ApplyPfFinancingqualificationResponse:
        """
        Description: 池融资融资资格申请
        Summary: 池融资融资资格申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_pf_financingqualification_ex_async(request, headers, runtime)

    def apply_pf_financingqualification_ex(
        self,
        request: shuziwuliu_models.ApplyPfFinancingqualificationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyPfFinancingqualificationResponse:
        """
        Description: 池融资融资资格申请
        Summary: 池融资融资资格申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyPfFinancingqualificationResponse().from_map(
            self.do_request('1.0', 'digital.logistic.pf.financingqualification.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_pf_financingqualification_ex_async(
        self,
        request: shuziwuliu_models.ApplyPfFinancingqualificationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.ApplyPfFinancingqualificationResponse:
        """
        Description: 池融资融资资格申请
        Summary: 池融资融资资格申请
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.ApplyPfFinancingqualificationResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.pf.financingqualification.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pf_financingqualification(
        self,
        request: shuziwuliu_models.QueryPfFinancingqualificationRequest,
    ) -> shuziwuliu_models.QueryPfFinancingqualificationResponse:
        """
        Description: 池融资融资资格申请结果查询
        Summary: 池融资融资资格申请结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pf_financingqualification_ex(request, headers, runtime)

    async def query_pf_financingqualification_async(
        self,
        request: shuziwuliu_models.QueryPfFinancingqualificationRequest,
    ) -> shuziwuliu_models.QueryPfFinancingqualificationResponse:
        """
        Description: 池融资融资资格申请结果查询
        Summary: 池融资融资资格申请结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pf_financingqualification_ex_async(request, headers, runtime)

    def query_pf_financingqualification_ex(
        self,
        request: shuziwuliu_models.QueryPfFinancingqualificationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryPfFinancingqualificationResponse:
        """
        Description: 池融资融资资格申请结果查询
        Summary: 池融资融资资格申请结果查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryPfFinancingqualificationResponse().from_map(
            self.do_request('1.0', 'digital.logistic.pf.financingqualification.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pf_financingqualification_ex_async(
        self,
        request: shuziwuliu_models.QueryPfFinancingqualificationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryPfFinancingqualificationResponse:
        """
        Description: 池融资融资资格申请结果查询
        Summary: 池融资融资资格申请结果查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryPfFinancingqualificationResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.pf.financingqualification.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_pf_definpf(
        self,
        request: shuziwuliu_models.CallbackPfDefinpfRequest,
    ) -> shuziwuliu_models.CallbackPfDefinpfResponse:
        """
        Description: 池融资主站回调金融云接口
        Summary: 池融资主站回调金融云接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_pf_definpf_ex(request, headers, runtime)

    async def callback_pf_definpf_async(
        self,
        request: shuziwuliu_models.CallbackPfDefinpfRequest,
    ) -> shuziwuliu_models.CallbackPfDefinpfResponse:
        """
        Description: 池融资主站回调金融云接口
        Summary: 池融资主站回调金融云接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_pf_definpf_ex_async(request, headers, runtime)

    def callback_pf_definpf_ex(
        self,
        request: shuziwuliu_models.CallbackPfDefinpfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CallbackPfDefinpfResponse:
        """
        Description: 池融资主站回调金融云接口
        Summary: 池融资主站回调金融云接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CallbackPfDefinpfResponse().from_map(
            self.do_request('1.0', 'digital.logistic.pf.definpf.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_pf_definpf_ex_async(
        self,
        request: shuziwuliu_models.CallbackPfDefinpfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CallbackPfDefinpfResponse:
        """
        Description: 池融资主站回调金融云接口
        Summary: 池融资主站回调金融云接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CallbackPfDefinpfResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.pf.definpf.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pf_withdraw(
        self,
        request: shuziwuliu_models.QueryPfWithdrawRequest,
    ) -> shuziwuliu_models.QueryPfWithdrawResponse:
        """
        Description: 用于查询可提款额度
        Summary: 可提款额度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pf_withdraw_ex(request, headers, runtime)

    async def query_pf_withdraw_async(
        self,
        request: shuziwuliu_models.QueryPfWithdrawRequest,
    ) -> shuziwuliu_models.QueryPfWithdrawResponse:
        """
        Description: 用于查询可提款额度
        Summary: 可提款额度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pf_withdraw_ex_async(request, headers, runtime)

    def query_pf_withdraw_ex(
        self,
        request: shuziwuliu_models.QueryPfWithdrawRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryPfWithdrawResponse:
        """
        Description: 用于查询可提款额度
        Summary: 可提款额度查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryPfWithdrawResponse().from_map(
            self.do_request('1.0', 'digital.logistic.pf.withdraw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pf_withdraw_ex_async(
        self,
        request: shuziwuliu_models.QueryPfWithdrawRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryPfWithdrawResponse:
        """
        Description: 用于查询可提款额度
        Summary: 可提款额度查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryPfWithdrawResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.pf.withdraw.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_did_forwarder(
        self,
        request: shuziwuliu_models.CreateDidForwarderRequest,
    ) -> shuziwuliu_models.CreateDidForwarderResponse:
        """
        Description: 创建货代did
        Summary: 创建货代did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_did_forwarder_ex(request, headers, runtime)

    async def create_did_forwarder_async(
        self,
        request: shuziwuliu_models.CreateDidForwarderRequest,
    ) -> shuziwuliu_models.CreateDidForwarderResponse:
        """
        Description: 创建货代did
        Summary: 创建货代did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_did_forwarder_ex_async(request, headers, runtime)

    def create_did_forwarder_ex(
        self,
        request: shuziwuliu_models.CreateDidForwarderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateDidForwarderResponse:
        """
        Description: 创建货代did
        Summary: 创建货代did
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDidForwarderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.did.forwarder.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_did_forwarder_ex_async(
        self,
        request: shuziwuliu_models.CreateDidForwarderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateDidForwarderResponse:
        """
        Description: 创建货代did
        Summary: 创建货代did
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDidForwarderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.did.forwarder.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_did_saasplatform(
        self,
        request: shuziwuliu_models.CreateDidSaasplatformRequest,
    ) -> shuziwuliu_models.CreateDidSaasplatformResponse:
        """
        Description: 创建saas平台did
        Summary: 创建saas平台did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_did_saasplatform_ex(request, headers, runtime)

    async def create_did_saasplatform_async(
        self,
        request: shuziwuliu_models.CreateDidSaasplatformRequest,
    ) -> shuziwuliu_models.CreateDidSaasplatformResponse:
        """
        Description: 创建saas平台did
        Summary: 创建saas平台did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_did_saasplatform_ex_async(request, headers, runtime)

    def create_did_saasplatform_ex(
        self,
        request: shuziwuliu_models.CreateDidSaasplatformRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateDidSaasplatformResponse:
        """
        Description: 创建saas平台did
        Summary: 创建saas平台did
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDidSaasplatformResponse().from_map(
            self.do_request('1.0', 'digital.logistic.did.saasplatform.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_did_saasplatform_ex_async(
        self,
        request: shuziwuliu_models.CreateDidSaasplatformRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateDidSaasplatformResponse:
        """
        Description: 创建saas平台did
        Summary: 创建saas平台did
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDidSaasplatformResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.did.saasplatform.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_did_client(
        self,
        request: shuziwuliu_models.CreateDidClientRequest,
    ) -> shuziwuliu_models.CreateDidClientResponse:
        """
        Description: 创建直客did
        Summary: 创建直客did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_did_client_ex(request, headers, runtime)

    async def create_did_client_async(
        self,
        request: shuziwuliu_models.CreateDidClientRequest,
    ) -> shuziwuliu_models.CreateDidClientResponse:
        """
        Description: 创建直客did
        Summary: 创建直客did
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_did_client_ex_async(request, headers, runtime)

    def create_did_client_ex(
        self,
        request: shuziwuliu_models.CreateDidClientRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateDidClientResponse:
        """
        Description: 创建直客did
        Summary: 创建直客did
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDidClientResponse().from_map(
            self.do_request('1.0', 'digital.logistic.did.client.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_did_client_ex_async(
        self,
        request: shuziwuliu_models.CreateDidClientRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateDidClientResponse:
        """
        Description: 创建直客did
        Summary: 创建直客did
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDidClientResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.did.client.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_biz_order(
        self,
        request: shuziwuliu_models.SaveBizOrderRequest,
    ) -> shuziwuliu_models.SaveBizOrderResponse:
        """
        Description: 保存订单
        Summary: 保存订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_biz_order_ex(request, headers, runtime)

    async def save_biz_order_async(
        self,
        request: shuziwuliu_models.SaveBizOrderRequest,
    ) -> shuziwuliu_models.SaveBizOrderResponse:
        """
        Description: 保存订单
        Summary: 保存订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_biz_order_ex_async(request, headers, runtime)

    def save_biz_order_ex(
        self,
        request: shuziwuliu_models.SaveBizOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizOrderResponse:
        """
        Description: 保存订单
        Summary: 保存订单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizOrderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biz.order.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_biz_order_ex_async(
        self,
        request: shuziwuliu_models.SaveBizOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizOrderResponse:
        """
        Description: 保存订单
        Summary: 保存订单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizOrderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biz.order.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_biz_consignorder(
        self,
        request: shuziwuliu_models.SaveBizConsignorderRequest,
    ) -> shuziwuliu_models.SaveBizConsignorderResponse:
        """
        Description: 保存托单文件
        Summary: 保存托单文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_biz_consignorder_ex(request, headers, runtime)

    async def save_biz_consignorder_async(
        self,
        request: shuziwuliu_models.SaveBizConsignorderRequest,
    ) -> shuziwuliu_models.SaveBizConsignorderResponse:
        """
        Description: 保存托单文件
        Summary: 保存托单文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_biz_consignorder_ex_async(request, headers, runtime)

    def save_biz_consignorder_ex(
        self,
        request: shuziwuliu_models.SaveBizConsignorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizConsignorderResponse:
        """
        Description: 保存托单文件
        Summary: 保存托单文件
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizConsignorderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biz.consignorder.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_biz_consignorder_ex_async(
        self,
        request: shuziwuliu_models.SaveBizConsignorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizConsignorderResponse:
        """
        Description: 保存托单文件
        Summary: 保存托单文件
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizConsignorderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biz.consignorder.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_biz_goods(
        self,
        request: shuziwuliu_models.SaveBizGoodsRequest,
    ) -> shuziwuliu_models.SaveBizGoodsResponse:
        """
        Description: 保存货物
        Summary: 保存货物
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_biz_goods_ex(request, headers, runtime)

    async def save_biz_goods_async(
        self,
        request: shuziwuliu_models.SaveBizGoodsRequest,
    ) -> shuziwuliu_models.SaveBizGoodsResponse:
        """
        Description: 保存货物
        Summary: 保存货物
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_biz_goods_ex_async(request, headers, runtime)

    def save_biz_goods_ex(
        self,
        request: shuziwuliu_models.SaveBizGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizGoodsResponse:
        """
        Description: 保存货物
        Summary: 保存货物
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizGoodsResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biz.goods.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_biz_goods_ex_async(
        self,
        request: shuziwuliu_models.SaveBizGoodsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizGoodsResponse:
        """
        Description: 保存货物
        Summary: 保存货物
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizGoodsResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biz.goods.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_biz_sonotify(
        self,
        request: shuziwuliu_models.SaveBizSonotifyRequest,
    ) -> shuziwuliu_models.SaveBizSonotifyResponse:
        """
        Description: 保存SO入货通知
        Summary: 保存SO入货通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_biz_sonotify_ex(request, headers, runtime)

    async def save_biz_sonotify_async(
        self,
        request: shuziwuliu_models.SaveBizSonotifyRequest,
    ) -> shuziwuliu_models.SaveBizSonotifyResponse:
        """
        Description: 保存SO入货通知
        Summary: 保存SO入货通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_biz_sonotify_ex_async(request, headers, runtime)

    def save_biz_sonotify_ex(
        self,
        request: shuziwuliu_models.SaveBizSonotifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizSonotifyResponse:
        """
        Description: 保存SO入货通知
        Summary: 保存SO入货通知
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizSonotifyResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biz.sonotify.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_biz_sonotify_ex_async(
        self,
        request: shuziwuliu_models.SaveBizSonotifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizSonotifyResponse:
        """
        Description: 保存SO入货通知
        Summary: 保存SO入货通知
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizSonotifyResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biz.sonotify.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_biz_bookingorder(
        self,
        request: shuziwuliu_models.SaveBizBookingorderRequest,
    ) -> shuziwuliu_models.SaveBizBookingorderResponse:
        """
        Description: 保存订舱单
        Summary: 保存订舱单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_biz_bookingorder_ex(request, headers, runtime)

    async def save_biz_bookingorder_async(
        self,
        request: shuziwuliu_models.SaveBizBookingorderRequest,
    ) -> shuziwuliu_models.SaveBizBookingorderResponse:
        """
        Description: 保存订舱单
        Summary: 保存订舱单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_biz_bookingorder_ex_async(request, headers, runtime)

    def save_biz_bookingorder_ex(
        self,
        request: shuziwuliu_models.SaveBizBookingorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizBookingorderResponse:
        """
        Description: 保存订舱单
        Summary: 保存订舱单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizBookingorderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biz.bookingorder.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_biz_bookingorder_ex_async(
        self,
        request: shuziwuliu_models.SaveBizBookingorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizBookingorderResponse:
        """
        Description: 保存订舱单
        Summary: 保存订舱单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizBookingorderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biz.bookingorder.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_biz_container(
        self,
        request: shuziwuliu_models.SaveBizContainerRequest,
    ) -> shuziwuliu_models.SaveBizContainerResponse:
        """
        Description: 保存集装箱
        Summary: 保存集装箱
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_biz_container_ex(request, headers, runtime)

    async def save_biz_container_async(
        self,
        request: shuziwuliu_models.SaveBizContainerRequest,
    ) -> shuziwuliu_models.SaveBizContainerResponse:
        """
        Description: 保存集装箱
        Summary: 保存集装箱
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_biz_container_ex_async(request, headers, runtime)

    def save_biz_container_ex(
        self,
        request: shuziwuliu_models.SaveBizContainerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizContainerResponse:
        """
        Description: 保存集装箱
        Summary: 保存集装箱
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizContainerResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biz.container.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_biz_container_ex_async(
        self,
        request: shuziwuliu_models.SaveBizContainerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizContainerResponse:
        """
        Description: 保存集装箱
        Summary: 保存集装箱
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizContainerResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biz.container.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_biz_customsorder(
        self,
        request: shuziwuliu_models.SaveBizCustomsorderRequest,
    ) -> shuziwuliu_models.SaveBizCustomsorderResponse:
        """
        Description: 保存报关单
        Summary: 保存报关单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_biz_customsorder_ex(request, headers, runtime)

    async def save_biz_customsorder_async(
        self,
        request: shuziwuliu_models.SaveBizCustomsorderRequest,
    ) -> shuziwuliu_models.SaveBizCustomsorderResponse:
        """
        Description: 保存报关单
        Summary: 保存报关单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_biz_customsorder_ex_async(request, headers, runtime)

    def save_biz_customsorder_ex(
        self,
        request: shuziwuliu_models.SaveBizCustomsorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizCustomsorderResponse:
        """
        Description: 保存报关单
        Summary: 保存报关单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizCustomsorderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biz.customsorder.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_biz_customsorder_ex_async(
        self,
        request: shuziwuliu_models.SaveBizCustomsorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizCustomsorderResponse:
        """
        Description: 保存报关单
        Summary: 保存报关单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizCustomsorderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biz.customsorder.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_biz_vehicle(
        self,
        request: shuziwuliu_models.SaveBizVehicleRequest,
    ) -> shuziwuliu_models.SaveBizVehicleResponse:
        """
        Description: 保存拖车单
        Summary: 保存拖车单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_biz_vehicle_ex(request, headers, runtime)

    async def save_biz_vehicle_async(
        self,
        request: shuziwuliu_models.SaveBizVehicleRequest,
    ) -> shuziwuliu_models.SaveBizVehicleResponse:
        """
        Description: 保存拖车单
        Summary: 保存拖车单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_biz_vehicle_ex_async(request, headers, runtime)

    def save_biz_vehicle_ex(
        self,
        request: shuziwuliu_models.SaveBizVehicleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizVehicleResponse:
        """
        Description: 保存拖车单
        Summary: 保存拖车单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizVehicleResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biz.vehicle.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_biz_vehicle_ex_async(
        self,
        request: shuziwuliu_models.SaveBizVehicleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizVehicleResponse:
        """
        Description: 保存拖车单
        Summary: 保存拖车单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizVehicleResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biz.vehicle.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_biz_masterbl(
        self,
        request: shuziwuliu_models.SaveBizMasterblRequest,
    ) -> shuziwuliu_models.SaveBizMasterblResponse:
        """
        Description: 保存master提单
        Summary: 保存master提单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_biz_masterbl_ex(request, headers, runtime)

    async def save_biz_masterbl_async(
        self,
        request: shuziwuliu_models.SaveBizMasterblRequest,
    ) -> shuziwuliu_models.SaveBizMasterblResponse:
        """
        Description: 保存master提单
        Summary: 保存master提单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_biz_masterbl_ex_async(request, headers, runtime)

    def save_biz_masterbl_ex(
        self,
        request: shuziwuliu_models.SaveBizMasterblRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizMasterblResponse:
        """
        Description: 保存master提单
        Summary: 保存master提单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizMasterblResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biz.masterbl.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_biz_masterbl_ex_async(
        self,
        request: shuziwuliu_models.SaveBizMasterblRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizMasterblResponse:
        """
        Description: 保存master提单
        Summary: 保存master提单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizMasterblResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biz.masterbl.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def finish_biz_audit(
        self,
        request: shuziwuliu_models.FinishBizAuditRequest,
    ) -> shuziwuliu_models.FinishBizAuditResponse:
        """
        Description: 内审完成
        Summary: 内审完成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.finish_biz_audit_ex(request, headers, runtime)

    async def finish_biz_audit_async(
        self,
        request: shuziwuliu_models.FinishBizAuditRequest,
    ) -> shuziwuliu_models.FinishBizAuditResponse:
        """
        Description: 内审完成
        Summary: 内审完成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.finish_biz_audit_ex_async(request, headers, runtime)

    def finish_biz_audit_ex(
        self,
        request: shuziwuliu_models.FinishBizAuditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.FinishBizAuditResponse:
        """
        Description: 内审完成
        Summary: 内审完成
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.FinishBizAuditResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biz.audit.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def finish_biz_audit_ex_async(
        self,
        request: shuziwuliu_models.FinishBizAuditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.FinishBizAuditResponse:
        """
        Description: 内审完成
        Summary: 内审完成
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.FinishBizAuditResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biz.audit.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_biz_housebl(
        self,
        request: shuziwuliu_models.SaveBizHouseblRequest,
    ) -> shuziwuliu_models.SaveBizHouseblResponse:
        """
        Description: 保存house提单
        Summary: 保存house提单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_biz_housebl_ex(request, headers, runtime)

    async def save_biz_housebl_async(
        self,
        request: shuziwuliu_models.SaveBizHouseblRequest,
    ) -> shuziwuliu_models.SaveBizHouseblResponse:
        """
        Description: 保存house提单
        Summary: 保存house提单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_biz_housebl_ex_async(request, headers, runtime)

    def save_biz_housebl_ex(
        self,
        request: shuziwuliu_models.SaveBizHouseblRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizHouseblResponse:
        """
        Description: 保存house提单
        Summary: 保存house提单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizHouseblResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biz.housebl.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_biz_housebl_ex_async(
        self,
        request: shuziwuliu_models.SaveBizHouseblRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizHouseblResponse:
        """
        Description: 保存house提单
        Summary: 保存house提单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizHouseblResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biz.housebl.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_bill_paybillorder(
        self,
        request: shuziwuliu_models.CreateBillPaybillorderRequest,
    ) -> shuziwuliu_models.CreateBillPaybillorderResponse:
        """
        Description: 创建应付账单
        Summary: 创建应付账单(已下)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_bill_paybillorder_ex(request, headers, runtime)

    async def create_bill_paybillorder_async(
        self,
        request: shuziwuliu_models.CreateBillPaybillorderRequest,
    ) -> shuziwuliu_models.CreateBillPaybillorderResponse:
        """
        Description: 创建应付账单
        Summary: 创建应付账单(已下)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_bill_paybillorder_ex_async(request, headers, runtime)

    def create_bill_paybillorder_ex(
        self,
        request: shuziwuliu_models.CreateBillPaybillorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateBillPaybillorderResponse:
        """
        Description: 创建应付账单
        Summary: 创建应付账单(已下)
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateBillPaybillorderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.bill.paybillorder.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_bill_paybillorder_ex_async(
        self,
        request: shuziwuliu_models.CreateBillPaybillorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateBillPaybillorderResponse:
        """
        Description: 创建应付账单
        Summary: 创建应付账单(已下)
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateBillPaybillorderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.bill.paybillorder.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_bill_receiptbillorder(
        self,
        request: shuziwuliu_models.CreateBillReceiptbillorderRequest,
    ) -> shuziwuliu_models.CreateBillReceiptbillorderResponse:
        """
        Description: 创建应收账单
        Summary: 创建应收账单(已下)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_bill_receiptbillorder_ex(request, headers, runtime)

    async def create_bill_receiptbillorder_async(
        self,
        request: shuziwuliu_models.CreateBillReceiptbillorderRequest,
    ) -> shuziwuliu_models.CreateBillReceiptbillorderResponse:
        """
        Description: 创建应收账单
        Summary: 创建应收账单(已下)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_bill_receiptbillorder_ex_async(request, headers, runtime)

    def create_bill_receiptbillorder_ex(
        self,
        request: shuziwuliu_models.CreateBillReceiptbillorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateBillReceiptbillorderResponse:
        """
        Description: 创建应收账单
        Summary: 创建应收账单(已下)
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateBillReceiptbillorderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.bill.receiptbillorder.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_bill_receiptbillorder_ex_async(
        self,
        request: shuziwuliu_models.CreateBillReceiptbillorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateBillReceiptbillorderResponse:
        """
        Description: 创建应收账单
        Summary: 创建应收账单(已下)
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateBillReceiptbillorderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.bill.receiptbillorder.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_bill_paybilltariff(
        self,
        request: shuziwuliu_models.SaveBillPaybilltariffRequest,
    ) -> shuziwuliu_models.SaveBillPaybilltariffResponse:
        """
        Description: 保存应付资费项
        Summary: 保存应付资费项
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_bill_paybilltariff_ex(request, headers, runtime)

    async def save_bill_paybilltariff_async(
        self,
        request: shuziwuliu_models.SaveBillPaybilltariffRequest,
    ) -> shuziwuliu_models.SaveBillPaybilltariffResponse:
        """
        Description: 保存应付资费项
        Summary: 保存应付资费项
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_bill_paybilltariff_ex_async(request, headers, runtime)

    def save_bill_paybilltariff_ex(
        self,
        request: shuziwuliu_models.SaveBillPaybilltariffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBillPaybilltariffResponse:
        """
        Description: 保存应付资费项
        Summary: 保存应付资费项
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBillPaybilltariffResponse().from_map(
            self.do_request('1.0', 'digital.logistic.bill.paybilltariff.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_bill_paybilltariff_ex_async(
        self,
        request: shuziwuliu_models.SaveBillPaybilltariffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBillPaybilltariffResponse:
        """
        Description: 保存应付资费项
        Summary: 保存应付资费项
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBillPaybilltariffResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.bill.paybilltariff.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_bill_receiptbilltariff(
        self,
        request: shuziwuliu_models.SaveBillReceiptbilltariffRequest,
    ) -> shuziwuliu_models.SaveBillReceiptbilltariffResponse:
        """
        Description: 保存应收资费项
        Summary: 保存应收资费项
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_bill_receiptbilltariff_ex(request, headers, runtime)

    async def save_bill_receiptbilltariff_async(
        self,
        request: shuziwuliu_models.SaveBillReceiptbilltariffRequest,
    ) -> shuziwuliu_models.SaveBillReceiptbilltariffResponse:
        """
        Description: 保存应收资费项
        Summary: 保存应收资费项
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_bill_receiptbilltariff_ex_async(request, headers, runtime)

    def save_bill_receiptbilltariff_ex(
        self,
        request: shuziwuliu_models.SaveBillReceiptbilltariffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBillReceiptbilltariffResponse:
        """
        Description: 保存应收资费项
        Summary: 保存应收资费项
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBillReceiptbilltariffResponse().from_map(
            self.do_request('1.0', 'digital.logistic.bill.receiptbilltariff.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_bill_receiptbilltariff_ex_async(
        self,
        request: shuziwuliu_models.SaveBillReceiptbilltariffRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBillReceiptbilltariffResponse:
        """
        Description: 保存应收资费项
        Summary: 保存应收资费项
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBillReceiptbilltariffResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.bill.receiptbilltariff.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_bill_paybill(
        self,
        request: shuziwuliu_models.VerifyBillPaybillRequest,
    ) -> shuziwuliu_models.VerifyBillPaybillResponse:
        """
        Description: 核销应付资费项
        Summary: 核销应付资费项
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_bill_paybill_ex(request, headers, runtime)

    async def verify_bill_paybill_async(
        self,
        request: shuziwuliu_models.VerifyBillPaybillRequest,
    ) -> shuziwuliu_models.VerifyBillPaybillResponse:
        """
        Description: 核销应付资费项
        Summary: 核销应付资费项
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_bill_paybill_ex_async(request, headers, runtime)

    def verify_bill_paybill_ex(
        self,
        request: shuziwuliu_models.VerifyBillPaybillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.VerifyBillPaybillResponse:
        """
        Description: 核销应付资费项
        Summary: 核销应付资费项
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.VerifyBillPaybillResponse().from_map(
            self.do_request('1.0', 'digital.logistic.bill.paybill.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_bill_paybill_ex_async(
        self,
        request: shuziwuliu_models.VerifyBillPaybillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.VerifyBillPaybillResponse:
        """
        Description: 核销应付资费项
        Summary: 核销应付资费项
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.VerifyBillPaybillResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.bill.paybill.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_bill_receiptbillorder(
        self,
        request: shuziwuliu_models.VerifyBillReceiptbillorderRequest,
    ) -> shuziwuliu_models.VerifyBillReceiptbillorderResponse:
        """
        Description: 核销应收资费项
        Summary: 核销应收资费项
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_bill_receiptbillorder_ex(request, headers, runtime)

    async def verify_bill_receiptbillorder_async(
        self,
        request: shuziwuliu_models.VerifyBillReceiptbillorderRequest,
    ) -> shuziwuliu_models.VerifyBillReceiptbillorderResponse:
        """
        Description: 核销应收资费项
        Summary: 核销应收资费项
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_bill_receiptbillorder_ex_async(request, headers, runtime)

    def verify_bill_receiptbillorder_ex(
        self,
        request: shuziwuliu_models.VerifyBillReceiptbillorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.VerifyBillReceiptbillorderResponse:
        """
        Description: 核销应收资费项
        Summary: 核销应收资费项
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.VerifyBillReceiptbillorderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.bill.receiptbillorder.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_bill_receiptbillorder_ex_async(
        self,
        request: shuziwuliu_models.VerifyBillReceiptbillorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.VerifyBillReceiptbillorderResponse:
        """
        Description: 核销应收资费项
        Summary: 核销应收资费项
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.VerifyBillReceiptbillorderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.bill.receiptbillorder.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_bill_paybillorder(
        self,
        request: shuziwuliu_models.UpdateBillPaybillorderRequest,
    ) -> shuziwuliu_models.UpdateBillPaybillorderResponse:
        """
        Description: 更新应付账单
        Summary: 更新应付账单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_bill_paybillorder_ex(request, headers, runtime)

    async def update_bill_paybillorder_async(
        self,
        request: shuziwuliu_models.UpdateBillPaybillorderRequest,
    ) -> shuziwuliu_models.UpdateBillPaybillorderResponse:
        """
        Description: 更新应付账单
        Summary: 更新应付账单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_bill_paybillorder_ex_async(request, headers, runtime)

    def update_bill_paybillorder_ex(
        self,
        request: shuziwuliu_models.UpdateBillPaybillorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateBillPaybillorderResponse:
        """
        Description: 更新应付账单
        Summary: 更新应付账单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateBillPaybillorderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.bill.paybillorder.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_bill_paybillorder_ex_async(
        self,
        request: shuziwuliu_models.UpdateBillPaybillorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateBillPaybillorderResponse:
        """
        Description: 更新应付账单
        Summary: 更新应付账单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateBillPaybillorderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.bill.paybillorder.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_bill_receiptbillorder(
        self,
        request: shuziwuliu_models.UpdateBillReceiptbillorderRequest,
    ) -> shuziwuliu_models.UpdateBillReceiptbillorderResponse:
        """
        Description: 更新应收账单
        Summary: 更新应收账单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_bill_receiptbillorder_ex(request, headers, runtime)

    async def update_bill_receiptbillorder_async(
        self,
        request: shuziwuliu_models.UpdateBillReceiptbillorderRequest,
    ) -> shuziwuliu_models.UpdateBillReceiptbillorderResponse:
        """
        Description: 更新应收账单
        Summary: 更新应收账单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_bill_receiptbillorder_ex_async(request, headers, runtime)

    def update_bill_receiptbillorder_ex(
        self,
        request: shuziwuliu_models.UpdateBillReceiptbillorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateBillReceiptbillorderResponse:
        """
        Description: 更新应收账单
        Summary: 更新应收账单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateBillReceiptbillorderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.bill.receiptbillorder.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_bill_receiptbillorder_ex_async(
        self,
        request: shuziwuliu_models.UpdateBillReceiptbillorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateBillReceiptbillorderResponse:
        """
        Description: 更新应收账单
        Summary: 更新应收账单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateBillReceiptbillorderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.bill.receiptbillorder.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_bill_payinvoice(
        self,
        request: shuziwuliu_models.SaveBillPayinvoiceRequest,
    ) -> shuziwuliu_models.SaveBillPayinvoiceResponse:
        """
        Description: 保存应付发票
        Summary: 保存应付发票
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_bill_payinvoice_ex(request, headers, runtime)

    async def save_bill_payinvoice_async(
        self,
        request: shuziwuliu_models.SaveBillPayinvoiceRequest,
    ) -> shuziwuliu_models.SaveBillPayinvoiceResponse:
        """
        Description: 保存应付发票
        Summary: 保存应付发票
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_bill_payinvoice_ex_async(request, headers, runtime)

    def save_bill_payinvoice_ex(
        self,
        request: shuziwuliu_models.SaveBillPayinvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBillPayinvoiceResponse:
        """
        Description: 保存应付发票
        Summary: 保存应付发票
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBillPayinvoiceResponse().from_map(
            self.do_request('1.0', 'digital.logistic.bill.payinvoice.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_bill_payinvoice_ex_async(
        self,
        request: shuziwuliu_models.SaveBillPayinvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBillPayinvoiceResponse:
        """
        Description: 保存应付发票
        Summary: 保存应付发票
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBillPayinvoiceResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.bill.payinvoice.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_bill_receiptinvoice(
        self,
        request: shuziwuliu_models.SaveBillReceiptinvoiceRequest,
    ) -> shuziwuliu_models.SaveBillReceiptinvoiceResponse:
        """
        Description: 保存应收发票
        Summary: 保存应收发票
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_bill_receiptinvoice_ex(request, headers, runtime)

    async def save_bill_receiptinvoice_async(
        self,
        request: shuziwuliu_models.SaveBillReceiptinvoiceRequest,
    ) -> shuziwuliu_models.SaveBillReceiptinvoiceResponse:
        """
        Description: 保存应收发票
        Summary: 保存应收发票
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_bill_receiptinvoice_ex_async(request, headers, runtime)

    def save_bill_receiptinvoice_ex(
        self,
        request: shuziwuliu_models.SaveBillReceiptinvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBillReceiptinvoiceResponse:
        """
        Description: 保存应收发票
        Summary: 保存应收发票
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBillReceiptinvoiceResponse().from_map(
            self.do_request('1.0', 'digital.logistic.bill.receiptinvoice.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_bill_receiptinvoice_ex_async(
        self,
        request: shuziwuliu_models.SaveBillReceiptinvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBillReceiptinvoiceResponse:
        """
        Description: 保存应收发票
        Summary: 保存应收发票
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBillReceiptinvoiceResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.bill.receiptinvoice.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_biz_financing(
        self,
        request: shuziwuliu_models.UploadBizFinancingRequest,
    ) -> shuziwuliu_models.UploadBizFinancingResponse:
        """
        Description: 上传历史数据
        Summary: 上传历史数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_biz_financing_ex(request, headers, runtime)

    async def upload_biz_financing_async(
        self,
        request: shuziwuliu_models.UploadBizFinancingRequest,
    ) -> shuziwuliu_models.UploadBizFinancingResponse:
        """
        Description: 上传历史数据
        Summary: 上传历史数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_biz_financing_ex_async(request, headers, runtime)

    def upload_biz_financing_ex(
        self,
        request: shuziwuliu_models.UploadBizFinancingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadBizFinancingResponse:
        """
        Description: 上传历史数据
        Summary: 上传历史数据
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadBizFinancingResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biz.financing.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_biz_financing_ex_async(
        self,
        request: shuziwuliu_models.UploadBizFinancingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadBizFinancingResponse:
        """
        Description: 上传历史数据
        Summary: 上传历史数据
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadBizFinancingResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biz.financing.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_biz_order(
        self,
        request: shuziwuliu_models.UploadBizOrderRequest,
    ) -> shuziwuliu_models.UploadBizOrderResponse:
        """
        Description: 上传订单
        Summary: 上传订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_biz_order_ex(request, headers, runtime)

    async def upload_biz_order_async(
        self,
        request: shuziwuliu_models.UploadBizOrderRequest,
    ) -> shuziwuliu_models.UploadBizOrderResponse:
        """
        Description: 上传订单
        Summary: 上传订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_biz_order_ex_async(request, headers, runtime)

    def upload_biz_order_ex(
        self,
        request: shuziwuliu_models.UploadBizOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadBizOrderResponse:
        """
        Description: 上传订单
        Summary: 上传订单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadBizOrderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biz.order.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_biz_order_ex_async(
        self,
        request: shuziwuliu_models.UploadBizOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadBizOrderResponse:
        """
        Description: 上传订单
        Summary: 上传订单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadBizOrderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biz.order.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_did_carrier(
        self,
        request: shuziwuliu_models.CreateDidCarrierRequest,
    ) -> shuziwuliu_models.CreateDidCarrierResponse:
        """
        Description: 创建船公司did账户
        Summary: 创建船公司did账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_did_carrier_ex(request, headers, runtime)

    async def create_did_carrier_async(
        self,
        request: shuziwuliu_models.CreateDidCarrierRequest,
    ) -> shuziwuliu_models.CreateDidCarrierResponse:
        """
        Description: 创建船公司did账户
        Summary: 创建船公司did账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_did_carrier_ex_async(request, headers, runtime)

    def create_did_carrier_ex(
        self,
        request: shuziwuliu_models.CreateDidCarrierRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateDidCarrierResponse:
        """
        Description: 创建船公司did账户
        Summary: 创建船公司did账户
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDidCarrierResponse().from_map(
            self.do_request('1.0', 'digital.logistic.did.carrier.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_did_carrier_ex_async(
        self,
        request: shuziwuliu_models.CreateDidCarrierRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.CreateDidCarrierResponse:
        """
        Description: 创建船公司did账户
        Summary: 创建船公司did账户
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.CreateDidCarrierResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.did.carrier.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_sys_forwarder(
        self,
        request: shuziwuliu_models.AuthSysForwarderRequest,
    ) -> shuziwuliu_models.AuthSysForwarderResponse:
        """
        Description:  货代授权
        Summary:  货代授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_sys_forwarder_ex(request, headers, runtime)

    async def auth_sys_forwarder_async(
        self,
        request: shuziwuliu_models.AuthSysForwarderRequest,
    ) -> shuziwuliu_models.AuthSysForwarderResponse:
        """
        Description:  货代授权
        Summary:  货代授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_sys_forwarder_ex_async(request, headers, runtime)

    def auth_sys_forwarder_ex(
        self,
        request: shuziwuliu_models.AuthSysForwarderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.AuthSysForwarderResponse:
        """
        Description:  货代授权
        Summary:  货代授权
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.AuthSysForwarderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.sys.forwarder.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_sys_forwarder_ex_async(
        self,
        request: shuziwuliu_models.AuthSysForwarderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.AuthSysForwarderResponse:
        """
        Description:  货代授权
        Summary:  货代授权
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.AuthSysForwarderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.sys.forwarder.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_biz_masterbl(
        self,
        request: shuziwuliu_models.QueryBizMasterblRequest,
    ) -> shuziwuliu_models.QueryBizMasterblResponse:
        """
        Description: master提单信息查询
        Summary: master提单信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_biz_masterbl_ex(request, headers, runtime)

    async def query_biz_masterbl_async(
        self,
        request: shuziwuliu_models.QueryBizMasterblRequest,
    ) -> shuziwuliu_models.QueryBizMasterblResponse:
        """
        Description: master提单信息查询
        Summary: master提单信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_biz_masterbl_ex_async(request, headers, runtime)

    def query_biz_masterbl_ex(
        self,
        request: shuziwuliu_models.QueryBizMasterblRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryBizMasterblResponse:
        """
        Description: master提单信息查询
        Summary: master提单信息查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryBizMasterblResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biz.masterbl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_biz_masterbl_ex_async(
        self,
        request: shuziwuliu_models.QueryBizMasterblRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.QueryBizMasterblResponse:
        """
        Description: master提单信息查询
        Summary: master提单信息查询
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.QueryBizMasterblResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biz.masterbl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_biz_payinvoicefile(
        self,
        request: shuziwuliu_models.SaveBizPayinvoicefileRequest,
    ) -> shuziwuliu_models.SaveBizPayinvoicefileResponse:
        """
        Description: 应付发票文件上传接口
        Summary: 应付发票文件上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_biz_payinvoicefile_ex(request, headers, runtime)

    async def save_biz_payinvoicefile_async(
        self,
        request: shuziwuliu_models.SaveBizPayinvoicefileRequest,
    ) -> shuziwuliu_models.SaveBizPayinvoicefileResponse:
        """
        Description: 应付发票文件上传接口
        Summary: 应付发票文件上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_biz_payinvoicefile_ex_async(request, headers, runtime)

    def save_biz_payinvoicefile_ex(
        self,
        request: shuziwuliu_models.SaveBizPayinvoicefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizPayinvoicefileResponse:
        """
        Description: 应付发票文件上传接口
        Summary: 应付发票文件上传接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizPayinvoicefileResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biz.payinvoicefile.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_biz_payinvoicefile_ex_async(
        self,
        request: shuziwuliu_models.SaveBizPayinvoicefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBizPayinvoicefileResponse:
        """
        Description: 应付发票文件上传接口
        Summary: 应付发票文件上传接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBizPayinvoicefileResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biz.payinvoicefile.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_biznew_order(
        self,
        request: shuziwuliu_models.SaveBiznewOrderRequest,
    ) -> shuziwuliu_models.SaveBiznewOrderResponse:
        """
        Description: 托运订单保存接口
        Summary: 托运订单保存接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_biznew_order_ex(request, headers, runtime)

    async def save_biznew_order_async(
        self,
        request: shuziwuliu_models.SaveBiznewOrderRequest,
    ) -> shuziwuliu_models.SaveBiznewOrderResponse:
        """
        Description: 托运订单保存接口
        Summary: 托运订单保存接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_biznew_order_ex_async(request, headers, runtime)

    def save_biznew_order_ex(
        self,
        request: shuziwuliu_models.SaveBiznewOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBiznewOrderResponse:
        """
        Description: 托运订单保存接口
        Summary: 托运订单保存接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBiznewOrderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biznew.order.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_biznew_order_ex_async(
        self,
        request: shuziwuliu_models.SaveBiznewOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBiznewOrderResponse:
        """
        Description: 托运订单保存接口
        Summary: 托运订单保存接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBiznewOrderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biznew.order.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_biznew_booking(
        self,
        request: shuziwuliu_models.SaveBiznewBookingRequest,
    ) -> shuziwuliu_models.SaveBiznewBookingResponse:
        """
        Description: 订舱单创建接口
        Summary: 订舱单创建接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_biznew_booking_ex(request, headers, runtime)

    async def save_biznew_booking_async(
        self,
        request: shuziwuliu_models.SaveBiznewBookingRequest,
    ) -> shuziwuliu_models.SaveBiznewBookingResponse:
        """
        Description: 订舱单创建接口
        Summary: 订舱单创建接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_biznew_booking_ex_async(request, headers, runtime)

    def save_biznew_booking_ex(
        self,
        request: shuziwuliu_models.SaveBiznewBookingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBiznewBookingResponse:
        """
        Description: 订舱单创建接口
        Summary: 订舱单创建接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBiznewBookingResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biznew.booking.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_biznew_booking_ex_async(
        self,
        request: shuziwuliu_models.SaveBiznewBookingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBiznewBookingResponse:
        """
        Description: 订舱单创建接口
        Summary: 订舱单创建接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBiznewBookingResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biznew.booking.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_biznew_vehicle(
        self,
        request: shuziwuliu_models.SaveBiznewVehicleRequest,
    ) -> shuziwuliu_models.SaveBiznewVehicleResponse:
        """
        Description: 拖车单保存接口
        Summary: 拖车单保存接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_biznew_vehicle_ex(request, headers, runtime)

    async def save_biznew_vehicle_async(
        self,
        request: shuziwuliu_models.SaveBiznewVehicleRequest,
    ) -> shuziwuliu_models.SaveBiznewVehicleResponse:
        """
        Description: 拖车单保存接口
        Summary: 拖车单保存接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_biznew_vehicle_ex_async(request, headers, runtime)

    def save_biznew_vehicle_ex(
        self,
        request: shuziwuliu_models.SaveBiznewVehicleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBiznewVehicleResponse:
        """
        Description: 拖车单保存接口
        Summary: 拖车单保存接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBiznewVehicleResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biznew.vehicle.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_biznew_vehicle_ex_async(
        self,
        request: shuziwuliu_models.SaveBiznewVehicleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBiznewVehicleResponse:
        """
        Description: 拖车单保存接口
        Summary: 拖车单保存接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBiznewVehicleResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biznew.vehicle.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_biznew_customs(
        self,
        request: shuziwuliu_models.SaveBiznewCustomsRequest,
    ) -> shuziwuliu_models.SaveBiznewCustomsResponse:
        """
        Description: 报关单保存接口
        Summary: 报关单保存接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_biznew_customs_ex(request, headers, runtime)

    async def save_biznew_customs_async(
        self,
        request: shuziwuliu_models.SaveBiznewCustomsRequest,
    ) -> shuziwuliu_models.SaveBiznewCustomsResponse:
        """
        Description: 报关单保存接口
        Summary: 报关单保存接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_biznew_customs_ex_async(request, headers, runtime)

    def save_biznew_customs_ex(
        self,
        request: shuziwuliu_models.SaveBiznewCustomsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBiznewCustomsResponse:
        """
        Description: 报关单保存接口
        Summary: 报关单保存接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBiznewCustomsResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biznew.customs.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_biznew_customs_ex_async(
        self,
        request: shuziwuliu_models.SaveBiznewCustomsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBiznewCustomsResponse:
        """
        Description: 报关单保存接口
        Summary: 报关单保存接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBiznewCustomsResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biznew.customs.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_biznew_master(
        self,
        request: shuziwuliu_models.SaveBiznewMasterRequest,
    ) -> shuziwuliu_models.SaveBiznewMasterResponse:
        """
        Description: 航运提单保存接口
        Summary: 航运提单保存接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_biznew_master_ex(request, headers, runtime)

    async def save_biznew_master_async(
        self,
        request: shuziwuliu_models.SaveBiznewMasterRequest,
    ) -> shuziwuliu_models.SaveBiznewMasterResponse:
        """
        Description: 航运提单保存接口
        Summary: 航运提单保存接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_biznew_master_ex_async(request, headers, runtime)

    def save_biznew_master_ex(
        self,
        request: shuziwuliu_models.SaveBiznewMasterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBiznewMasterResponse:
        """
        Description: 航运提单保存接口
        Summary: 航运提单保存接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBiznewMasterResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biznew.master.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_biznew_master_ex_async(
        self,
        request: shuziwuliu_models.SaveBiznewMasterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBiznewMasterResponse:
        """
        Description: 航运提单保存接口
        Summary: 航运提单保存接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBiznewMasterResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biznew.master.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_biznew_paybillorder(
        self,
        request: shuziwuliu_models.SaveBiznewPaybillorderRequest,
    ) -> shuziwuliu_models.SaveBiznewPaybillorderResponse:
        """
        Description: 应付账单保存接口
        Summary: 应付账单保存接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_biznew_paybillorder_ex(request, headers, runtime)

    async def save_biznew_paybillorder_async(
        self,
        request: shuziwuliu_models.SaveBiznewPaybillorderRequest,
    ) -> shuziwuliu_models.SaveBiznewPaybillorderResponse:
        """
        Description: 应付账单保存接口
        Summary: 应付账单保存接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_biznew_paybillorder_ex_async(request, headers, runtime)

    def save_biznew_paybillorder_ex(
        self,
        request: shuziwuliu_models.SaveBiznewPaybillorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBiznewPaybillorderResponse:
        """
        Description: 应付账单保存接口
        Summary: 应付账单保存接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBiznewPaybillorderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biznew.paybillorder.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_biznew_paybillorder_ex_async(
        self,
        request: shuziwuliu_models.SaveBiznewPaybillorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBiznewPaybillorderResponse:
        """
        Description: 应付账单保存接口
        Summary: 应付账单保存接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBiznewPaybillorderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biznew.paybillorder.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_biznew_receiptbillorder(
        self,
        request: shuziwuliu_models.SaveBiznewReceiptbillorderRequest,
    ) -> shuziwuliu_models.SaveBiznewReceiptbillorderResponse:
        """
        Description: 应收账单保存接口
        Summary: 应收账单保存接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_biznew_receiptbillorder_ex(request, headers, runtime)

    async def save_biznew_receiptbillorder_async(
        self,
        request: shuziwuliu_models.SaveBiznewReceiptbillorderRequest,
    ) -> shuziwuliu_models.SaveBiznewReceiptbillorderResponse:
        """
        Description: 应收账单保存接口
        Summary: 应收账单保存接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_biznew_receiptbillorder_ex_async(request, headers, runtime)

    def save_biznew_receiptbillorder_ex(
        self,
        request: shuziwuliu_models.SaveBiznewReceiptbillorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBiznewReceiptbillorderResponse:
        """
        Description: 应收账单保存接口
        Summary: 应收账单保存接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBiznewReceiptbillorderResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biznew.receiptbillorder.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_biznew_receiptbillorder_ex_async(
        self,
        request: shuziwuliu_models.SaveBiznewReceiptbillorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBiznewReceiptbillorderResponse:
        """
        Description: 应收账单保存接口
        Summary: 应收账单保存接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBiznewReceiptbillorderResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biznew.receiptbillorder.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_biznew_invoice(
        self,
        request: shuziwuliu_models.SaveBiznewInvoiceRequest,
    ) -> shuziwuliu_models.SaveBiznewInvoiceResponse:
        """
        Description: 航运发票保存接口
        Summary: 航运发票保存接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_biznew_invoice_ex(request, headers, runtime)

    async def save_biznew_invoice_async(
        self,
        request: shuziwuliu_models.SaveBiznewInvoiceRequest,
    ) -> shuziwuliu_models.SaveBiznewInvoiceResponse:
        """
        Description: 航运发票保存接口
        Summary: 航运发票保存接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_biznew_invoice_ex_async(request, headers, runtime)

    def save_biznew_invoice_ex(
        self,
        request: shuziwuliu_models.SaveBiznewInvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBiznewInvoiceResponse:
        """
        Description: 航运发票保存接口
        Summary: 航运发票保存接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBiznewInvoiceResponse().from_map(
            self.do_request('1.0', 'digital.logistic.biznew.invoice.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_biznew_invoice_ex_async(
        self,
        request: shuziwuliu_models.SaveBiznewInvoiceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.SaveBiznewInvoiceResponse:
        """
        Description: 航运发票保存接口
        Summary: 航运发票保存接口
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.SaveBiznewInvoiceResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.biznew.invoice.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_shipping_ebl(
        self,
        request: shuziwuliu_models.UploadShippingEblRequest,
    ) -> shuziwuliu_models.UploadShippingEblResponse:
        """
        Description: 上传电子提单
        Summary: 上传电子提单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_shipping_ebl_ex(request, headers, runtime)

    async def upload_shipping_ebl_async(
        self,
        request: shuziwuliu_models.UploadShippingEblRequest,
    ) -> shuziwuliu_models.UploadShippingEblResponse:
        """
        Description: 上传电子提单
        Summary: 上传电子提单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_shipping_ebl_ex_async(request, headers, runtime)

    def upload_shipping_ebl_ex(
        self,
        request: shuziwuliu_models.UploadShippingEblRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadShippingEblResponse:
        """
        Description: 上传电子提单
        Summary: 上传电子提单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadShippingEblResponse().from_map(
            self.do_request('1.0', 'digital.logistic.shipping.ebl.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_shipping_ebl_ex_async(
        self,
        request: shuziwuliu_models.UploadShippingEblRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadShippingEblResponse:
        """
        Description: 上传电子提单
        Summary: 上传电子提单
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadShippingEblResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.shipping.ebl.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_shipping_eblbatch(
        self,
        request: shuziwuliu_models.UploadShippingEblbatchRequest,
    ) -> shuziwuliu_models.UploadShippingEblbatchResponse:
        """
        Description: 电子提单批次上传，一个I批次下传递多个提单
        Summary: 电子提单批次上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_shipping_eblbatch_ex(request, headers, runtime)

    async def upload_shipping_eblbatch_async(
        self,
        request: shuziwuliu_models.UploadShippingEblbatchRequest,
    ) -> shuziwuliu_models.UploadShippingEblbatchResponse:
        """
        Description: 电子提单批次上传，一个I批次下传递多个提单
        Summary: 电子提单批次上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_shipping_eblbatch_ex_async(request, headers, runtime)

    def upload_shipping_eblbatch_ex(
        self,
        request: shuziwuliu_models.UploadShippingEblbatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadShippingEblbatchResponse:
        """
        Description: 电子提单批次上传，一个I批次下传递多个提单
        Summary: 电子提单批次上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadShippingEblbatchResponse().from_map(
            self.do_request('1.0', 'digital.logistic.shipping.eblbatch.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_shipping_eblbatch_ex_async(
        self,
        request: shuziwuliu_models.UploadShippingEblbatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UploadShippingEblbatchResponse:
        """
        Description: 电子提单批次上传，一个I批次下传递多个提单
        Summary: 电子提单批次上传
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UploadShippingEblbatchResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.shipping.eblbatch.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_shipping_eblbatchstatus(
        self,
        request: shuziwuliu_models.UpdateShippingEblbatchstatusRequest,
    ) -> shuziwuliu_models.UpdateShippingEblbatchstatusResponse:
        """
        Description: 感知收货人提单状态的变更
        Summary: 电子提单批次状态变更
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_shipping_eblbatchstatus_ex(request, headers, runtime)

    async def update_shipping_eblbatchstatus_async(
        self,
        request: shuziwuliu_models.UpdateShippingEblbatchstatusRequest,
    ) -> shuziwuliu_models.UpdateShippingEblbatchstatusResponse:
        """
        Description: 感知收货人提单状态的变更
        Summary: 电子提单批次状态变更
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_shipping_eblbatchstatus_ex_async(request, headers, runtime)

    def update_shipping_eblbatchstatus_ex(
        self,
        request: shuziwuliu_models.UpdateShippingEblbatchstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateShippingEblbatchstatusResponse:
        """
        Description: 感知收货人提单状态的变更
        Summary: 电子提单批次状态变更
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateShippingEblbatchstatusResponse().from_map(
            self.do_request('1.0', 'digital.logistic.shipping.eblbatchstatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_shipping_eblbatchstatus_ex_async(
        self,
        request: shuziwuliu_models.UpdateShippingEblbatchstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> shuziwuliu_models.UpdateShippingEblbatchstatusResponse:
        """
        Description: 感知收货人提单状态的变更
        Summary: 电子提单批次状态变更
        """
        UtilClient.validate_model(request)
        return shuziwuliu_models.UpdateShippingEblbatchstatusResponse().from_map(
            await self.do_request_async('1.0', 'digital.logistic.shipping.eblbatchstatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
