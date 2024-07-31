# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_320bc483f2434f39a3af9ec9f04d3cc0 import models as ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models
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
        config: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.Config,
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
            # CA电子签约正文章信息
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
                    'sdk_version': '2.0.3',
                    '_prod_code': 'ak_320bc483f2434f39a3af9ec9f04d3cc0',
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
            # CA电子签约正文章信息
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
                    'sdk_version': '2.0.3',
                    '_prod_code': 'ak_320bc483f2434f39a3af9ec9f04d3cc0',
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

    def sign_antsaas_staffingc_contract_send(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractSendRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractSendResponse:
        """
        Description: 发起签约调用接口
        Summary: 发起签约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sign_antsaas_staffingc_contract_send_ex(request, headers, runtime)

    async def sign_antsaas_staffingc_contract_send_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractSendRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractSendResponse:
        """
        Description: 发起签约调用接口
        Summary: 发起签约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sign_antsaas_staffingc_contract_send_ex_async(request, headers, runtime)

    def sign_antsaas_staffingc_contract_send_ex(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractSendRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractSendResponse:
        """
        Description: 发起签约调用接口
        Summary: 发起签约
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antsaas.staffingc.contract.send.sign',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                sign_antsaas_staffingc_contract_send_response = ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractSendResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return sign_antsaas_staffingc_contract_send_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractSendResponse(),
            self.do_request('1.0', 'antsaas.staffingc.contract.send.sign', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sign_antsaas_staffingc_contract_send_ex_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractSendRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractSendResponse:
        """
        Description: 发起签约调用接口
        Summary: 发起签约
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antsaas.staffingc.contract.send.sign',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                sign_antsaas_staffingc_contract_send_response = ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractSendResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return sign_antsaas_staffingc_contract_send_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractSendResponse(),
            await self.do_request_async('1.0', 'antsaas.staffingc.contract.send.sign', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antsaas_staffingc_contract_sign(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractSignRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractSignResponse:
        """
        Description: 签约结果查询
        Summary: 查询签约结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antsaas_staffingc_contract_sign_ex(request, headers, runtime)

    async def query_antsaas_staffingc_contract_sign_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractSignRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractSignResponse:
        """
        Description: 签约结果查询
        Summary: 查询签约结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antsaas_staffingc_contract_sign_ex_async(request, headers, runtime)

    def query_antsaas_staffingc_contract_sign_ex(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractSignResponse:
        """
        Description: 签约结果查询
        Summary: 查询签约结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractSignResponse(),
            self.do_request('1.0', 'antsaas.staffingc.contract.sign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antsaas_staffingc_contract_sign_ex_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractSignResponse:
        """
        Description: 签约结果查询
        Summary: 查询签约结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractSignResponse(),
            await self.do_request_async('1.0', 'antsaas.staffingc.contract.sign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antsaas_staffingc_epcertification_url(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationUrlRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationUrlResponse:
        """
        Description: 企业认证授权url查询接口
        Summary: 企业认证授权url查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antsaas_staffingc_epcertification_url_ex(request, headers, runtime)

    async def query_antsaas_staffingc_epcertification_url_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationUrlRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationUrlResponse:
        """
        Description: 企业认证授权url查询接口
        Summary: 企业认证授权url查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antsaas_staffingc_epcertification_url_ex_async(request, headers, runtime)

    def query_antsaas_staffingc_epcertification_url_ex(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationUrlResponse:
        """
        Description: 企业认证授权url查询接口
        Summary: 企业认证授权url查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationUrlResponse(),
            self.do_request('1.0', 'antsaas.staffingc.epcertification.url.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antsaas_staffingc_epcertification_url_ex_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationUrlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationUrlResponse:
        """
        Description: 企业认证授权url查询接口
        Summary: 企业认证授权url查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationUrlResponse(),
            await self.do_request_async('1.0', 'antsaas.staffingc.epcertification.url.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antsaas_staffingc_epcertification_authorize(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntsaasStaffingcEpcertificationAuthorizeRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntsaasStaffingcEpcertificationAuthorizeResponse:
        """
        Description: 企业认证创建接口
        Summary: 企业认证创建接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antsaas_staffingc_epcertification_authorize_ex(request, headers, runtime)

    async def create_antsaas_staffingc_epcertification_authorize_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntsaasStaffingcEpcertificationAuthorizeRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntsaasStaffingcEpcertificationAuthorizeResponse:
        """
        Description: 企业认证创建接口
        Summary: 企业认证创建接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antsaas_staffingc_epcertification_authorize_ex_async(request, headers, runtime)

    def create_antsaas_staffingc_epcertification_authorize_ex(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntsaasStaffingcEpcertificationAuthorizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntsaasStaffingcEpcertificationAuthorizeResponse:
        """
        Description: 企业认证创建接口
        Summary: 企业认证创建接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntsaasStaffingcEpcertificationAuthorizeResponse(),
            self.do_request('1.0', 'antsaas.staffingc.epcertification.authorize.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antsaas_staffingc_epcertification_authorize_ex_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntsaasStaffingcEpcertificationAuthorizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntsaasStaffingcEpcertificationAuthorizeResponse:
        """
        Description: 企业认证创建接口
        Summary: 企业认证创建接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntsaasStaffingcEpcertificationAuthorizeResponse(),
            await self.do_request_async('1.0', 'antsaas.staffingc.epcertification.authorize.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antsaas_staffingc_epcertification_risk(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationRiskRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationRiskResponse:
        """
        Description: 企业认证风险查询接口
        Summary: 企业认证风险查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antsaas_staffingc_epcertification_risk_ex(request, headers, runtime)

    async def query_antsaas_staffingc_epcertification_risk_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationRiskRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationRiskResponse:
        """
        Description: 企业认证风险查询接口
        Summary: 企业认证风险查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antsaas_staffingc_epcertification_risk_ex_async(request, headers, runtime)

    def query_antsaas_staffingc_epcertification_risk_ex(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationRiskResponse:
        """
        Description: 企业认证风险查询接口
        Summary: 企业认证风险查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationRiskResponse(),
            self.do_request('1.0', 'antsaas.staffingc.epcertification.risk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antsaas_staffingc_epcertification_risk_ex_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationRiskResponse:
        """
        Description: 企业认证风险查询接口
        Summary: 企业认证风险查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcEpcertificationRiskResponse(),
            await self.do_request_async('1.0', 'antsaas.staffingc.epcertification.risk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_antsaas_staffingc_insure_signurl(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ApplyAntsaasStaffingcInsureSignurlRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ApplyAntsaasStaffingcInsureSignurlResponse:
        """
        Description: 获取保险签约认证连接
        Summary: 获取保险签约认证连接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_antsaas_staffingc_insure_signurl_ex(request, headers, runtime)

    async def apply_antsaas_staffingc_insure_signurl_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ApplyAntsaasStaffingcInsureSignurlRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ApplyAntsaasStaffingcInsureSignurlResponse:
        """
        Description: 获取保险签约认证连接
        Summary: 获取保险签约认证连接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_antsaas_staffingc_insure_signurl_ex_async(request, headers, runtime)

    def apply_antsaas_staffingc_insure_signurl_ex(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ApplyAntsaasStaffingcInsureSignurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ApplyAntsaasStaffingcInsureSignurlResponse:
        """
        Description: 获取保险签约认证连接
        Summary: 获取保险签约认证连接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ApplyAntsaasStaffingcInsureSignurlResponse(),
            self.do_request('1.0', 'antsaas.staffingc.insure.signurl.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_antsaas_staffingc_insure_signurl_ex_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ApplyAntsaasStaffingcInsureSignurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ApplyAntsaasStaffingcInsureSignurlResponse:
        """
        Description: 获取保险签约认证连接
        Summary: 获取保险签约认证连接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ApplyAntsaasStaffingcInsureSignurlResponse(),
            await self.do_request_async('1.0', 'antsaas.staffingc.insure.signurl.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_antsaas_staffingc_insure_product(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ListAntsaasStaffingcInsureProductRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ListAntsaasStaffingcInsureProductResponse:
        """
        Description: 查询可投保的保险产品
        Summary: 查询可投保的保险产品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_antsaas_staffingc_insure_product_ex(request, headers, runtime)

    async def list_antsaas_staffingc_insure_product_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ListAntsaasStaffingcInsureProductRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ListAntsaasStaffingcInsureProductResponse:
        """
        Description: 查询可投保的保险产品
        Summary: 查询可投保的保险产品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_antsaas_staffingc_insure_product_ex_async(request, headers, runtime)

    def list_antsaas_staffingc_insure_product_ex(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ListAntsaasStaffingcInsureProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ListAntsaasStaffingcInsureProductResponse:
        """
        Description: 查询可投保的保险产品
        Summary: 查询可投保的保险产品
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ListAntsaasStaffingcInsureProductResponse(),
            self.do_request('1.0', 'antsaas.staffingc.insure.product.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_antsaas_staffingc_insure_product_ex_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ListAntsaasStaffingcInsureProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ListAntsaasStaffingcInsureProductResponse:
        """
        Description: 查询可投保的保险产品
        Summary: 查询可投保的保险产品
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.ListAntsaasStaffingcInsureProductResponse(),
            await self.do_request_async('1.0', 'antsaas.staffingc.insure.product.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antsaas_staffingc_insure_price(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcInsurePriceRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcInsurePriceResponse:
        """
        Description: 查询保险产品价格相关信息
        Summary: 查询保险产品价格相关信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antsaas_staffingc_insure_price_ex(request, headers, runtime)

    async def query_antsaas_staffingc_insure_price_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcInsurePriceRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcInsurePriceResponse:
        """
        Description: 查询保险产品价格相关信息
        Summary: 查询保险产品价格相关信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antsaas_staffingc_insure_price_ex_async(request, headers, runtime)

    def query_antsaas_staffingc_insure_price_ex(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcInsurePriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcInsurePriceResponse:
        """
        Description: 查询保险产品价格相关信息
        Summary: 查询保险产品价格相关信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcInsurePriceResponse(),
            self.do_request('1.0', 'antsaas.staffingc.insure.price.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antsaas_staffingc_insure_price_ex_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcInsurePriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcInsurePriceResponse:
        """
        Description: 查询保险产品价格相关信息
        Summary: 查询保险产品价格相关信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcInsurePriceResponse(),
            await self.do_request_async('1.0', 'antsaas.staffingc.insure.price.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_antsaas_staffingc_insure(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureResponse:
        """
        Description: 执行投保
        Summary: 执行投保
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_antsaas_staffingc_insure_ex(request, headers, runtime)

    async def send_antsaas_staffingc_insure_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureResponse:
        """
        Description: 执行投保
        Summary: 执行投保
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_antsaas_staffingc_insure_ex_async(request, headers, runtime)

    def send_antsaas_staffingc_insure_ex(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureResponse:
        """
        Description: 执行投保
        Summary: 执行投保
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureResponse(),
            self.do_request('1.0', 'antsaas.staffingc.insure.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_antsaas_staffingc_insure_ex_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureResponse:
        """
        Description: 执行投保
        Summary: 执行投保
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureResponse(),
            await self.do_request_async('1.0', 'antsaas.staffingc.insure.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_antsaas_staffingc_insure_refund(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureRefundRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureRefundResponse:
        """
        Description: 退保接口
        Summary: 退保接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_antsaas_staffingc_insure_refund_ex(request, headers, runtime)

    async def send_antsaas_staffingc_insure_refund_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureRefundRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureRefundResponse:
        """
        Description: 退保接口
        Summary: 退保接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_antsaas_staffingc_insure_refund_ex_async(request, headers, runtime)

    def send_antsaas_staffingc_insure_refund_ex(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureRefundResponse:
        """
        Description: 退保接口
        Summary: 退保接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureRefundResponse(),
            self.do_request('1.0', 'antsaas.staffingc.insure.refund.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_antsaas_staffingc_insure_refund_ex_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureRefundResponse:
        """
        Description: 退保接口
        Summary: 退保接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SendAntsaasStaffingcInsureRefundResponse(),
            await self.do_request_async('1.0', 'antsaas.staffingc.insure.refund.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sign_antsaas_staffingc_contract_ca(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractCaRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractCaResponse:
        """
        Description: CA电子签
        Summary: CA电子签约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sign_antsaas_staffingc_contract_ca_ex(request, headers, runtime)

    async def sign_antsaas_staffingc_contract_ca_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractCaRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractCaResponse:
        """
        Description: CA电子签
        Summary: CA电子签约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sign_antsaas_staffingc_contract_ca_ex_async(request, headers, runtime)

    def sign_antsaas_staffingc_contract_ca_ex(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractCaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractCaResponse:
        """
        Description: CA电子签
        Summary: CA电子签约
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antsaas.staffingc.contract.ca.sign',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                sign_antsaas_staffingc_contract_ca_response = ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractCaResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return sign_antsaas_staffingc_contract_ca_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractCaResponse(),
            self.do_request('1.0', 'antsaas.staffingc.contract.ca.sign', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sign_antsaas_staffingc_contract_ca_ex_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractCaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractCaResponse:
        """
        Description: CA电子签
        Summary: CA电子签约
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antsaas.staffingc.contract.ca.sign',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                sign_antsaas_staffingc_contract_ca_response = ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractCaResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return sign_antsaas_staffingc_contract_ca_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.SignAntsaasStaffingcContractCaResponse(),
            await self.do_request_async('1.0', 'antsaas.staffingc.contract.ca.sign', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antsaas_staffingc_contract_ca(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractCaRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractCaResponse:
        """
        Description: 查询签约结果
        Summary: 查询签约结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antsaas_staffingc_contract_ca_ex(request, headers, runtime)

    async def query_antsaas_staffingc_contract_ca_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractCaRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractCaResponse:
        """
        Description: 查询签约结果
        Summary: 查询签约结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antsaas_staffingc_contract_ca_ex_async(request, headers, runtime)

    def query_antsaas_staffingc_contract_ca_ex(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractCaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractCaResponse:
        """
        Description: 查询签约结果
        Summary: 查询签约结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractCaResponse(),
            self.do_request('1.0', 'antsaas.staffingc.contract.ca.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antsaas_staffingc_contract_ca_ex_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractCaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractCaResponse:
        """
        Description: 查询签约结果
        Summary: 查询签约结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.QueryAntsaasStaffingcContractCaResponse(),
            await self.do_request_async('1.0', 'antsaas.staffingc.contract.ca.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__320bc_483f_2434f_39a_3af_9ec_9f_04d_3cc_0_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
