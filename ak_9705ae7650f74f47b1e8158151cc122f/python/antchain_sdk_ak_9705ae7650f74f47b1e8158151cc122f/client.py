# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_9705ae7650f74f47b1e8158151cc122f import models as ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models
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
        config: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.Config,
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
            # 联系人信息
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
                    'sdk_version': '1.0.0',
                    '_prod_code': 'ak_9705ae7650f74f47b1e8158151cc122f',
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
            # 联系人信息
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
                    'sdk_version': '1.0.0',
                    '_prod_code': 'ak_9705ae7650f74f47b1e8158151cc122f',
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

    def create_blockchain_bccr_dci_registration(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationResponse:
        """
        Description: 发起数登申请
        Summary: 发起数登申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_blockchain_bccr_dci_registration_ex(request, headers, runtime)

    async def create_blockchain_bccr_dci_registration_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationResponse:
        """
        Description: 发起数登申请
        Summary: 发起数登申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_blockchain_bccr_dci_registration_ex_async(request, headers, runtime)

    def create_blockchain_bccr_dci_registration_ex(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationResponse:
        """
        Description: 发起数登申请
        Summary: 发起数登申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.registration.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_blockchain_bccr_dci_registration_ex_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationResponse:
        """
        Description: 发起数登申请
        Summary: 发起数登申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registration.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockchain_bccr_dci_registrationsubmit(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationsubmitRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationsubmitResponse:
        """
        Description: 已废弃接口
        Summary: 已废弃接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bccr_dci_registrationsubmit_ex(request, headers, runtime)

    async def query_blockchain_bccr_dci_registrationsubmit_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationsubmitRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationsubmitResponse:
        """
        Description: 已废弃接口
        Summary: 已废弃接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bccr_dci_registrationsubmit_ex_async(request, headers, runtime)

    def query_blockchain_bccr_dci_registrationsubmit_ex(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationsubmitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationsubmitResponse:
        """
        Description: 已废弃接口
        Summary: 已废弃接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationsubmitResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.registrationsubmit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bccr_dci_registrationsubmit_ex_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationsubmitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationsubmitResponse:
        """
        Description: 已废弃接口
        Summary: 已废弃接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationsubmitResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registrationsubmit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockchain_bccr_dci_registration(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationResponse:
        """
        Description: 查询数登结果
        Summary: 查询数登结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bccr_dci_registration_ex(request, headers, runtime)

    async def query_blockchain_bccr_dci_registration_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationResponse:
        """
        Description: 查询数登结果
        Summary: 查询数登结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bccr_dci_registration_ex_async(request, headers, runtime)

    def query_blockchain_bccr_dci_registration_ex(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationResponse:
        """
        Description: 查询数登结果
        Summary: 查询数登结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.registration.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bccr_dci_registration_ex_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationResponse:
        """
        Description: 查询数登结果
        Summary: 查询数登结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registration.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_blockchain_bccr_dci_registrationcert(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciRegistrationcertRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciRegistrationcertResponse:
        """
        Description: 获取数登证书下载链接
        Summary: 获取数登证书下载链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_blockchain_bccr_dci_registrationcert_ex(request, headers, runtime)

    async def get_blockchain_bccr_dci_registrationcert_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciRegistrationcertRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciRegistrationcertResponse:
        """
        Description: 获取数登证书下载链接
        Summary: 获取数登证书下载链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_blockchain_bccr_dci_registrationcert_ex_async(request, headers, runtime)

    def get_blockchain_bccr_dci_registrationcert_ex(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciRegistrationcertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciRegistrationcertResponse:
        """
        Description: 获取数登证书下载链接
        Summary: 获取数登证书下载链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciRegistrationcertResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.registrationcert.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_blockchain_bccr_dci_registrationcert_ex_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciRegistrationcertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciRegistrationcertResponse:
        """
        Description: 获取数登证书下载链接
        Summary: 获取数登证书下载链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciRegistrationcertResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registrationcert.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_blockchain_bccr_dci_registrationcert(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationcertRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationcertResponse:
        """
        Description: 创建数字登记证书
        Summary: 创建数字登记证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_blockchain_bccr_dci_registrationcert_ex(request, headers, runtime)

    async def create_blockchain_bccr_dci_registrationcert_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationcertRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationcertResponse:
        """
        Description: 创建数字登记证书
        Summary: 创建数字登记证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_blockchain_bccr_dci_registrationcert_ex_async(request, headers, runtime)

    def create_blockchain_bccr_dci_registrationcert_ex(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationcertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationcertResponse:
        """
        Description: 创建数字登记证书
        Summary: 创建数字登记证书
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationcertResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.registrationcert.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_blockchain_bccr_dci_registrationcert_ex_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationcertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationcertResponse:
        """
        Description: 创建数字登记证书
        Summary: 创建数字登记证书
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrDciRegistrationcertResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registrationcert.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockchain_bccr_dci_registrationcert(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationcertRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationcertResponse:
        """
        Description: 已废弃接口
        Summary: 已废弃接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bccr_dci_registrationcert_ex(request, headers, runtime)

    async def query_blockchain_bccr_dci_registrationcert_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationcertRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationcertResponse:
        """
        Description: 已废弃接口
        Summary: 已废弃接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bccr_dci_registrationcert_ex_async(request, headers, runtime)

    def query_blockchain_bccr_dci_registrationcert_ex(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationcertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationcertResponse:
        """
        Description: 已废弃接口
        Summary: 已废弃接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationcertResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.registrationcert.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bccr_dci_registrationcert_ex_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationcertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationcertResponse:
        """
        Description: 已废弃接口
        Summary: 已废弃接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciRegistrationcertResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registrationcert.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_blockchain_bccr_dci_payurl(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciPayurlRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciPayurlResponse:
        """
        Description: 发起支付，获取支付链接
        Summary: 数登支付-发起支付
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_blockchain_bccr_dci_payurl_ex(request, headers, runtime)

    async def get_blockchain_bccr_dci_payurl_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciPayurlRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciPayurlResponse:
        """
        Description: 发起支付，获取支付链接
        Summary: 数登支付-发起支付
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_blockchain_bccr_dci_payurl_ex_async(request, headers, runtime)

    def get_blockchain_bccr_dci_payurl_ex(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciPayurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciPayurlResponse:
        """
        Description: 发起支付，获取支付链接
        Summary: 数登支付-发起支付
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciPayurlResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.payurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_blockchain_bccr_dci_payurl_ex_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciPayurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciPayurlResponse:
        """
        Description: 发起支付，获取支付链接
        Summary: 数登支付-发起支付
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.GetBlockchainBccrDciPayurlResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.payurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockchain_bccr_dci_pay(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciPayRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciPayResponse:
        """
        Description: 查询数登支付结果
        Summary: 查询数登支付结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bccr_dci_pay_ex(request, headers, runtime)

    async def query_blockchain_bccr_dci_pay_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciPayRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciPayResponse:
        """
        Description: 查询数登支付结果
        Summary: 查询数登支付结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bccr_dci_pay_ex_async(request, headers, runtime)

    def query_blockchain_bccr_dci_pay_ex(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciPayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciPayResponse:
        """
        Description: 查询数登支付结果
        Summary: 查询数登支付结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciPayResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.pay.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bccr_dci_pay_ex_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciPayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciPayResponse:
        """
        Description: 查询数登支付结果
        Summary: 查询数登支付结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrDciPayResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.pay.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_blockchain_bccr_dci_payresult(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CallbackBlockchainBccrDciPayresultRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CallbackBlockchainBccrDciPayresultResponse:
        """
        Description: 支付结果回调
        Summary: 数登支付-支付结果回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_blockchain_bccr_dci_payresult_ex(request, headers, runtime)

    async def callback_blockchain_bccr_dci_payresult_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CallbackBlockchainBccrDciPayresultRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CallbackBlockchainBccrDciPayresultResponse:
        """
        Description: 支付结果回调
        Summary: 数登支付-支付结果回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_blockchain_bccr_dci_payresult_ex_async(request, headers, runtime)

    def callback_blockchain_bccr_dci_payresult_ex(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CallbackBlockchainBccrDciPayresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CallbackBlockchainBccrDciPayresultResponse:
        """
        Description: 支付结果回调
        Summary: 数登支付-支付结果回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CallbackBlockchainBccrDciPayresultResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.payresult.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_blockchain_bccr_dci_payresult_ex_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CallbackBlockchainBccrDciPayresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CallbackBlockchainBccrDciPayresultResponse:
        """
        Description: 支付结果回调
        Summary: 数登支付-支付结果回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CallbackBlockchainBccrDciPayresultResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.payresult.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def refuse_blockchain_bccr_dci_registration(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RefuseBlockchainBccrDciRegistrationRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RefuseBlockchainBccrDciRegistrationResponse:
        """
        Description: 数登审核失败结果回调
        Summary: 数登审核失败结果回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.refuse_blockchain_bccr_dci_registration_ex(request, headers, runtime)

    async def refuse_blockchain_bccr_dci_registration_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RefuseBlockchainBccrDciRegistrationRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RefuseBlockchainBccrDciRegistrationResponse:
        """
        Description: 数登审核失败结果回调
        Summary: 数登审核失败结果回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.refuse_blockchain_bccr_dci_registration_ex_async(request, headers, runtime)

    def refuse_blockchain_bccr_dci_registration_ex(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RefuseBlockchainBccrDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RefuseBlockchainBccrDciRegistrationResponse:
        """
        Description: 数登审核失败结果回调
        Summary: 数登审核失败结果回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RefuseBlockchainBccrDciRegistrationResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.registration.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def refuse_blockchain_bccr_dci_registration_ex_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RefuseBlockchainBccrDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RefuseBlockchainBccrDciRegistrationResponse:
        """
        Description: 数登审核失败结果回调
        Summary: 数登审核失败结果回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RefuseBlockchainBccrDciRegistrationResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registration.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_blockchain_bccr_dci_registration(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RetryBlockchainBccrDciRegistrationRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RetryBlockchainBccrDciRegistrationResponse:
        """
        Description: 补正数登申请
        Summary: 补正数登申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_blockchain_bccr_dci_registration_ex(request, headers, runtime)

    async def retry_blockchain_bccr_dci_registration_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RetryBlockchainBccrDciRegistrationRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RetryBlockchainBccrDciRegistrationResponse:
        """
        Description: 补正数登申请
        Summary: 补正数登申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_blockchain_bccr_dci_registration_ex_async(request, headers, runtime)

    def retry_blockchain_bccr_dci_registration_ex(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RetryBlockchainBccrDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RetryBlockchainBccrDciRegistrationResponse:
        """
        Description: 补正数登申请
        Summary: 补正数登申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RetryBlockchainBccrDciRegistrationResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.registration.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_blockchain_bccr_dci_registration_ex_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RetryBlockchainBccrDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RetryBlockchainBccrDciRegistrationResponse:
        """
        Description: 补正数登申请
        Summary: 补正数登申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.RetryBlockchainBccrDciRegistrationResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registration.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def close_blockchain_bccr_dci_registration(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CloseBlockchainBccrDciRegistrationRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CloseBlockchainBccrDciRegistrationResponse:
        """
        Description: 数登停止申请
        Summary: 数登停止申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.close_blockchain_bccr_dci_registration_ex(request, headers, runtime)

    async def close_blockchain_bccr_dci_registration_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CloseBlockchainBccrDciRegistrationRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CloseBlockchainBccrDciRegistrationResponse:
        """
        Description: 数登停止申请
        Summary: 数登停止申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.close_blockchain_bccr_dci_registration_ex_async(request, headers, runtime)

    def close_blockchain_bccr_dci_registration_ex(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CloseBlockchainBccrDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CloseBlockchainBccrDciRegistrationResponse:
        """
        Description: 数登停止申请
        Summary: 数登停止申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CloseBlockchainBccrDciRegistrationResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.registration.close', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def close_blockchain_bccr_dci_registration_ex_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CloseBlockchainBccrDciRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CloseBlockchainBccrDciRegistrationResponse:
        """
        Description: 数登停止申请
        Summary: 数登停止申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CloseBlockchainBccrDciRegistrationResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registration.close', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_blockchain_bccr_order(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrOrderRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrOrderResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_blockchain_bccr_order_ex(request, headers, runtime)

    async def create_blockchain_bccr_order_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrOrderRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrOrderResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_blockchain_bccr_order_ex_async(request, headers, runtime)

    def create_blockchain_bccr_order_ex(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrOrderResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrOrderResponse(),
            self.do_request('1.0', 'blockchain.bccr.order.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_blockchain_bccr_order_ex_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrOrderResponse:
        """
        Description: 创建订单
        Summary: 创建订单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.CreateBlockchainBccrOrderResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.order.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockchain_bccr_order_payurl(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrOrderPayurlRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrOrderPayurlResponse:
        """
        Description: 查询订单支付链接
        Summary: 查询订单支付链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bccr_order_payurl_ex(request, headers, runtime)

    async def query_blockchain_bccr_order_payurl_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrOrderPayurlRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrOrderPayurlResponse:
        """
        Description: 查询订单支付链接
        Summary: 查询订单支付链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bccr_order_payurl_ex_async(request, headers, runtime)

    def query_blockchain_bccr_order_payurl_ex(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrOrderPayurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrOrderPayurlResponse:
        """
        Description: 查询订单支付链接
        Summary: 查询订单支付链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrOrderPayurlResponse(),
            self.do_request('1.0', 'blockchain.bccr.order.payurl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bccr_order_payurl_ex_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrOrderPayurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrOrderPayurlResponse:
        """
        Description: 查询订单支付链接
        Summary: 查询订单支付链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.QueryBlockchainBccrOrderPayurlResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.order.payurl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def finish_blockchain_bccr_dci_registrationcert(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.FinishBlockchainBccrDciRegistrationcertRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.FinishBlockchainBccrDciRegistrationcertResponse:
        """
        Description: 版保完成数登证书回调
        Summary: 版保完成数登证书回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.finish_blockchain_bccr_dci_registrationcert_ex(request, headers, runtime)

    async def finish_blockchain_bccr_dci_registrationcert_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.FinishBlockchainBccrDciRegistrationcertRequest,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.FinishBlockchainBccrDciRegistrationcertResponse:
        """
        Description: 版保完成数登证书回调
        Summary: 版保完成数登证书回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.finish_blockchain_bccr_dci_registrationcert_ex_async(request, headers, runtime)

    def finish_blockchain_bccr_dci_registrationcert_ex(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.FinishBlockchainBccrDciRegistrationcertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.FinishBlockchainBccrDciRegistrationcertResponse:
        """
        Description: 版保完成数登证书回调
        Summary: 版保完成数登证书回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.FinishBlockchainBccrDciRegistrationcertResponse(),
            self.do_request('1.0', 'blockchain.bccr.dci.registrationcert.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def finish_blockchain_bccr_dci_registrationcert_ex_async(
        self,
        request: ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.FinishBlockchainBccrDciRegistrationcertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.FinishBlockchainBccrDciRegistrationcertResponse:
        """
        Description: 版保完成数登证书回调
        Summary: 版保完成数登证书回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__9705ae_7650f_74f_47b_1e_8158151cc_122f_models.FinishBlockchainBccrDciRegistrationcertResponse(),
            await self.do_request_async('1.0', 'blockchain.bccr.dci.registrationcert.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
