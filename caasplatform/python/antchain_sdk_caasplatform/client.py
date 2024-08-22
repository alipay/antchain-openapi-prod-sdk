# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_caasplatform import models as caasplatform_models
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
        config: caasplatform_models.Config,
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
            # 分账明细
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
                    'sdk_version': '1.4.0',
                    '_prod_code': 'CAASPLATFORM',
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
            # 分账明细
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
                    'sdk_version': '1.4.0',
                    '_prod_code': 'CAASPLATFORM',
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

    def create_deposit(
        self,
        request: caasplatform_models.CreateDepositRequest,
    ) -> caasplatform_models.CreateDepositResponse:
        """
        Description: 创建存证
        Summary: 创建存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_deposit_ex(request, headers, runtime)

    async def create_deposit_async(
        self,
        request: caasplatform_models.CreateDepositRequest,
    ) -> caasplatform_models.CreateDepositResponse:
        """
        Description: 创建存证
        Summary: 创建存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_deposit_ex_async(request, headers, runtime)

    def create_deposit_ex(
        self,
        request: caasplatform_models.CreateDepositRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.CreateDepositResponse:
        """
        Description: 创建存证
        Summary: 创建存证
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = caasplatform_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.caasplatform.deposit.create',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                create_deposit_response = caasplatform_models.CreateDepositResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return create_deposit_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.CreateDepositResponse(),
            self.do_request('1.0', 'antchain.caasplatform.deposit.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_deposit_ex_async(
        self,
        request: caasplatform_models.CreateDepositRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.CreateDepositResponse:
        """
        Description: 创建存证
        Summary: 创建存证
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = caasplatform_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.caasplatform.deposit.create',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                create_deposit_response = caasplatform_models.CreateDepositResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return create_deposit_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.CreateDepositResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.deposit.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_deposit(
        self,
        request: caasplatform_models.QueryDepositRequest,
    ) -> caasplatform_models.QueryDepositResponse:
        """
        Description: 存证查询
        Summary: 存证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_deposit_ex(request, headers, runtime)

    async def query_deposit_async(
        self,
        request: caasplatform_models.QueryDepositRequest,
    ) -> caasplatform_models.QueryDepositResponse:
        """
        Description: 存证查询
        Summary: 存证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_deposit_ex_async(request, headers, runtime)

    def query_deposit_ex(
        self,
        request: caasplatform_models.QueryDepositRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.QueryDepositResponse:
        """
        Description: 存证查询
        Summary: 存证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.QueryDepositResponse(),
            self.do_request('1.0', 'antchain.caasplatform.deposit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_deposit_ex_async(
        self,
        request: caasplatform_models.QueryDepositRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.QueryDepositResponse:
        """
        Description: 存证查询
        Summary: 存证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.QueryDepositResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.deposit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_deposit_certificate(
        self,
        request: caasplatform_models.QueryDepositCertificateRequest,
    ) -> caasplatform_models.QueryDepositCertificateResponse:
        """
        Description: 证书存证合约-证书存证查询
        Summary: 证书存证合约-证书存证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_deposit_certificate_ex(request, headers, runtime)

    async def query_deposit_certificate_async(
        self,
        request: caasplatform_models.QueryDepositCertificateRequest,
    ) -> caasplatform_models.QueryDepositCertificateResponse:
        """
        Description: 证书存证合约-证书存证查询
        Summary: 证书存证合约-证书存证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_deposit_certificate_ex_async(request, headers, runtime)

    def query_deposit_certificate_ex(
        self,
        request: caasplatform_models.QueryDepositCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.QueryDepositCertificateResponse:
        """
        Description: 证书存证合约-证书存证查询
        Summary: 证书存证合约-证书存证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.QueryDepositCertificateResponse(),
            self.do_request('1.0', 'antchain.caasplatform.deposit.certificate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_deposit_certificate_ex_async(
        self,
        request: caasplatform_models.QueryDepositCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.QueryDepositCertificateResponse:
        """
        Description: 证书存证合约-证书存证查询
        Summary: 证书存证合约-证书存证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.QueryDepositCertificateResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.deposit.certificate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_deposit_certificate(
        self,
        request: caasplatform_models.CreateDepositCertificateRequest,
    ) -> caasplatform_models.CreateDepositCertificateResponse:
        """
        Description: 证书存证合约-创建证书存证
        Summary: 证书存证合约-创建证书存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_deposit_certificate_ex(request, headers, runtime)

    async def create_deposit_certificate_async(
        self,
        request: caasplatform_models.CreateDepositCertificateRequest,
    ) -> caasplatform_models.CreateDepositCertificateResponse:
        """
        Description: 证书存证合约-创建证书存证
        Summary: 证书存证合约-创建证书存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_deposit_certificate_ex_async(request, headers, runtime)

    def create_deposit_certificate_ex(
        self,
        request: caasplatform_models.CreateDepositCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.CreateDepositCertificateResponse:
        """
        Description: 证书存证合约-创建证书存证
        Summary: 证书存证合约-创建证书存证
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = caasplatform_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.caasplatform.deposit.certificate.create',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                create_deposit_certificate_response = caasplatform_models.CreateDepositCertificateResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return create_deposit_certificate_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.CreateDepositCertificateResponse(),
            self.do_request('1.0', 'antchain.caasplatform.deposit.certificate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_deposit_certificate_ex_async(
        self,
        request: caasplatform_models.CreateDepositCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.CreateDepositCertificateResponse:
        """
        Description: 证书存证合约-创建证书存证
        Summary: 证书存证合约-创建证书存证
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = caasplatform_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.caasplatform.deposit.certificate.create',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                create_deposit_certificate_response = caasplatform_models.CreateDepositCertificateResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return create_deposit_certificate_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.CreateDepositCertificateResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.deposit.certificate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_deposit_charity(
        self,
        request: caasplatform_models.QueryDepositCharityRequest,
    ) -> caasplatform_models.QueryDepositCharityResponse:
        """
        Description: 捐赠合约-捐赠证明查询
        Summary: 捐赠合约-捐赠证明查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_deposit_charity_ex(request, headers, runtime)

    async def query_deposit_charity_async(
        self,
        request: caasplatform_models.QueryDepositCharityRequest,
    ) -> caasplatform_models.QueryDepositCharityResponse:
        """
        Description: 捐赠合约-捐赠证明查询
        Summary: 捐赠合约-捐赠证明查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_deposit_charity_ex_async(request, headers, runtime)

    def query_deposit_charity_ex(
        self,
        request: caasplatform_models.QueryDepositCharityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.QueryDepositCharityResponse:
        """
        Description: 捐赠合约-捐赠证明查询
        Summary: 捐赠合约-捐赠证明查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.QueryDepositCharityResponse(),
            self.do_request('1.0', 'antchain.caasplatform.deposit.charity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_deposit_charity_ex_async(
        self,
        request: caasplatform_models.QueryDepositCharityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.QueryDepositCharityResponse:
        """
        Description: 捐赠合约-捐赠证明查询
        Summary: 捐赠合约-捐赠证明查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.QueryDepositCharityResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.deposit.charity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_deposit_charity(
        self,
        request: caasplatform_models.CreateDepositCharityRequest,
    ) -> caasplatform_models.CreateDepositCharityResponse:
        """
        Description: 捐赠合约-创建捐赠证明
        Summary: 捐赠合约-创建捐赠证明
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_deposit_charity_ex(request, headers, runtime)

    async def create_deposit_charity_async(
        self,
        request: caasplatform_models.CreateDepositCharityRequest,
    ) -> caasplatform_models.CreateDepositCharityResponse:
        """
        Description: 捐赠合约-创建捐赠证明
        Summary: 捐赠合约-创建捐赠证明
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_deposit_charity_ex_async(request, headers, runtime)

    def create_deposit_charity_ex(
        self,
        request: caasplatform_models.CreateDepositCharityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.CreateDepositCharityResponse:
        """
        Description: 捐赠合约-创建捐赠证明
        Summary: 捐赠合约-创建捐赠证明
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = caasplatform_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.caasplatform.deposit.charity.create',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                create_deposit_charity_response = caasplatform_models.CreateDepositCharityResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return create_deposit_charity_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.CreateDepositCharityResponse(),
            self.do_request('1.0', 'antchain.caasplatform.deposit.charity.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_deposit_charity_ex_async(
        self,
        request: caasplatform_models.CreateDepositCharityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.CreateDepositCharityResponse:
        """
        Description: 捐赠合约-创建捐赠证明
        Summary: 捐赠合约-创建捐赠证明
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = caasplatform_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.caasplatform.deposit.charity.create',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                create_deposit_charity_response = caasplatform_models.CreateDepositCharityResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return create_deposit_charity_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.CreateDepositCharityResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.deposit.charity.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_deposit_sweepstakes(
        self,
        request: caasplatform_models.QueryDepositSweepstakesRequest,
    ) -> caasplatform_models.QueryDepositSweepstakesResponse:
        """
        Description: 抽奖活动审计合约-中奖记录查询
        Summary: 抽奖活动审计合约-中奖记录查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_deposit_sweepstakes_ex(request, headers, runtime)

    async def query_deposit_sweepstakes_async(
        self,
        request: caasplatform_models.QueryDepositSweepstakesRequest,
    ) -> caasplatform_models.QueryDepositSweepstakesResponse:
        """
        Description: 抽奖活动审计合约-中奖记录查询
        Summary: 抽奖活动审计合约-中奖记录查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_deposit_sweepstakes_ex_async(request, headers, runtime)

    def query_deposit_sweepstakes_ex(
        self,
        request: caasplatform_models.QueryDepositSweepstakesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.QueryDepositSweepstakesResponse:
        """
        Description: 抽奖活动审计合约-中奖记录查询
        Summary: 抽奖活动审计合约-中奖记录查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.QueryDepositSweepstakesResponse(),
            self.do_request('1.0', 'antchain.caasplatform.deposit.sweepstakes.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_deposit_sweepstakes_ex_async(
        self,
        request: caasplatform_models.QueryDepositSweepstakesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.QueryDepositSweepstakesResponse:
        """
        Description: 抽奖活动审计合约-中奖记录查询
        Summary: 抽奖活动审计合约-中奖记录查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.QueryDepositSweepstakesResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.deposit.sweepstakes.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_deposit_sweepstakes(
        self,
        request: caasplatform_models.CreateDepositSweepstakesRequest,
    ) -> caasplatform_models.CreateDepositSweepstakesResponse:
        """
        Description: 抽奖活动审计合约-创建活动记录
        Summary: 抽奖活动审计合约-创建活动记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_deposit_sweepstakes_ex(request, headers, runtime)

    async def create_deposit_sweepstakes_async(
        self,
        request: caasplatform_models.CreateDepositSweepstakesRequest,
    ) -> caasplatform_models.CreateDepositSweepstakesResponse:
        """
        Description: 抽奖活动审计合约-创建活动记录
        Summary: 抽奖活动审计合约-创建活动记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_deposit_sweepstakes_ex_async(request, headers, runtime)

    def create_deposit_sweepstakes_ex(
        self,
        request: caasplatform_models.CreateDepositSweepstakesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.CreateDepositSweepstakesResponse:
        """
        Description: 抽奖活动审计合约-创建活动记录
        Summary: 抽奖活动审计合约-创建活动记录
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = caasplatform_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.caasplatform.deposit.sweepstakes.create',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                create_deposit_sweepstakes_response = caasplatform_models.CreateDepositSweepstakesResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return create_deposit_sweepstakes_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.CreateDepositSweepstakesResponse(),
            self.do_request('1.0', 'antchain.caasplatform.deposit.sweepstakes.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_deposit_sweepstakes_ex_async(
        self,
        request: caasplatform_models.CreateDepositSweepstakesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.CreateDepositSweepstakesResponse:
        """
        Description: 抽奖活动审计合约-创建活动记录
        Summary: 抽奖活动审计合约-创建活动记录
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = caasplatform_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.caasplatform.deposit.sweepstakes.create',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                create_deposit_sweepstakes_response = caasplatform_models.CreateDepositSweepstakesResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return create_deposit_sweepstakes_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.CreateDepositSweepstakesResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.deposit.sweepstakes.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_general_deposit(
        self,
        request: caasplatform_models.SetGeneralDepositRequest,
    ) -> caasplatform_models.SetGeneralDepositResponse:
        """
        Description: 通用合约调用-结构化存储场景
        Summary: 通用合约调用-结构化存储场景
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_general_deposit_ex(request, headers, runtime)

    async def set_general_deposit_async(
        self,
        request: caasplatform_models.SetGeneralDepositRequest,
    ) -> caasplatform_models.SetGeneralDepositResponse:
        """
        Description: 通用合约调用-结构化存储场景
        Summary: 通用合约调用-结构化存储场景
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_general_deposit_ex_async(request, headers, runtime)

    def set_general_deposit_ex(
        self,
        request: caasplatform_models.SetGeneralDepositRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.SetGeneralDepositResponse:
        """
        Description: 通用合约调用-结构化存储场景
        Summary: 通用合约调用-结构化存储场景
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.SetGeneralDepositResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.deposit.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_general_deposit_ex_async(
        self,
        request: caasplatform_models.SetGeneralDepositRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.SetGeneralDepositResponse:
        """
        Description: 通用合约调用-结构化存储场景
        Summary: 通用合约调用-结构化存储场景
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.SetGeneralDepositResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.deposit.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_general_deposit(
        self,
        request: caasplatform_models.GetGeneralDepositRequest,
    ) -> caasplatform_models.GetGeneralDepositResponse:
        """
        Description: 通用合约调用-结构化查询场景
        Summary: 通用合约调用-结构化查询场景
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_general_deposit_ex(request, headers, runtime)

    async def get_general_deposit_async(
        self,
        request: caasplatform_models.GetGeneralDepositRequest,
    ) -> caasplatform_models.GetGeneralDepositResponse:
        """
        Description: 通用合约调用-结构化查询场景
        Summary: 通用合约调用-结构化查询场景
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_general_deposit_ex_async(request, headers, runtime)

    def get_general_deposit_ex(
        self,
        request: caasplatform_models.GetGeneralDepositRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.GetGeneralDepositResponse:
        """
        Description: 通用合约调用-结构化查询场景
        Summary: 通用合约调用-结构化查询场景
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.GetGeneralDepositResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.deposit.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_general_deposit_ex_async(
        self,
        request: caasplatform_models.GetGeneralDepositRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.GetGeneralDepositResponse:
        """
        Description: 通用合约调用-结构化查询场景
        Summary: 通用合约调用-结构化查询场景
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.GetGeneralDepositResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.deposit.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pay_general_rights(
        self,
        request: caasplatform_models.PayGeneralRightsRequest,
    ) -> caasplatform_models.PayGeneralRightsResponse:
        """
        Description: 通用合约调用-权益-转赠
        Summary: 通用合约调用-权益-转赠
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pay_general_rights_ex(request, headers, runtime)

    async def pay_general_rights_async(
        self,
        request: caasplatform_models.PayGeneralRightsRequest,
    ) -> caasplatform_models.PayGeneralRightsResponse:
        """
        Description: 通用合约调用-权益-转赠
        Summary: 通用合约调用-权益-转赠
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pay_general_rights_ex_async(request, headers, runtime)

    def pay_general_rights_ex(
        self,
        request: caasplatform_models.PayGeneralRightsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.PayGeneralRightsResponse:
        """
        Description: 通用合约调用-权益-转赠
        Summary: 通用合约调用-权益-转赠
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.PayGeneralRightsResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.rights.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pay_general_rights_ex_async(
        self,
        request: caasplatform_models.PayGeneralRightsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.PayGeneralRightsResponse:
        """
        Description: 通用合约调用-权益-转赠
        Summary: 通用合约调用-权益-转赠
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.PayGeneralRightsResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.rights.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_extend_rights(
        self,
        request: caasplatform_models.UploadExtendRightsRequest,
    ) -> caasplatform_models.UploadExtendRightsResponse:
        """
        Description: 资源文件托管
        Summary: 资源文件托管
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_extend_rights_ex(request, headers, runtime)

    async def upload_extend_rights_async(
        self,
        request: caasplatform_models.UploadExtendRightsRequest,
    ) -> caasplatform_models.UploadExtendRightsResponse:
        """
        Description: 资源文件托管
        Summary: 资源文件托管
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_extend_rights_ex_async(request, headers, runtime)

    def upload_extend_rights_ex(
        self,
        request: caasplatform_models.UploadExtendRightsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.UploadExtendRightsResponse:
        """
        Description: 资源文件托管
        Summary: 资源文件托管
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = caasplatform_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.caasplatform.extend.rights.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_extend_rights_response = caasplatform_models.UploadExtendRightsResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_extend_rights_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.UploadExtendRightsResponse(),
            self.do_request('1.0', 'antchain.caasplatform.extend.rights.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_extend_rights_ex_async(
        self,
        request: caasplatform_models.UploadExtendRightsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.UploadExtendRightsResponse:
        """
        Description: 资源文件托管
        Summary: 资源文件托管
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = caasplatform_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.caasplatform.extend.rights.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_extend_rights_response = caasplatform_models.UploadExtendRightsResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_extend_rights_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.UploadExtendRightsResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.extend.rights.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_extend_rights(
        self,
        request: caasplatform_models.CreateExtendRightsRequest,
    ) -> caasplatform_models.CreateExtendRightsResponse:
        """
        Description: 创建链上账户
        Summary: 创建链上账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_extend_rights_ex(request, headers, runtime)

    async def create_extend_rights_async(
        self,
        request: caasplatform_models.CreateExtendRightsRequest,
    ) -> caasplatform_models.CreateExtendRightsResponse:
        """
        Description: 创建链上账户
        Summary: 创建链上账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_extend_rights_ex_async(request, headers, runtime)

    def create_extend_rights_ex(
        self,
        request: caasplatform_models.CreateExtendRightsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.CreateExtendRightsResponse:
        """
        Description: 创建链上账户
        Summary: 创建链上账户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.CreateExtendRightsResponse(),
            self.do_request('1.0', 'antchain.caasplatform.extend.rights.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_extend_rights_ex_async(
        self,
        request: caasplatform_models.CreateExtendRightsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.CreateExtendRightsResponse:
        """
        Description: 创建链上账户
        Summary: 创建链上账户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.CreateExtendRightsResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.extend.rights.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_general_rights(
        self,
        request: caasplatform_models.RegisterGeneralRightsRequest,
    ) -> caasplatform_models.RegisterGeneralRightsResponse:
        """
        Description: 通用合约调用-权益-铸造
        Summary: 通用合约调用-权益-铸造
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_general_rights_ex(request, headers, runtime)

    async def register_general_rights_async(
        self,
        request: caasplatform_models.RegisterGeneralRightsRequest,
    ) -> caasplatform_models.RegisterGeneralRightsResponse:
        """
        Description: 通用合约调用-权益-铸造
        Summary: 通用合约调用-权益-铸造
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_general_rights_ex_async(request, headers, runtime)

    def register_general_rights_ex(
        self,
        request: caasplatform_models.RegisterGeneralRightsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.RegisterGeneralRightsResponse:
        """
        Description: 通用合约调用-权益-铸造
        Summary: 通用合约调用-权益-铸造
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.RegisterGeneralRightsResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.rights.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_general_rights_ex_async(
        self,
        request: caasplatform_models.RegisterGeneralRightsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.RegisterGeneralRightsResponse:
        """
        Description: 通用合约调用-权益-铸造
        Summary: 通用合约调用-权益-铸造
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.RegisterGeneralRightsResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.rights.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_general_rights(
        self,
        request: caasplatform_models.GetGeneralRightsRequest,
    ) -> caasplatform_models.GetGeneralRightsResponse:
        """
        Description: 通用合约调用-权益-URL查询
        Summary: 通用合约调用-权益- URL查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_general_rights_ex(request, headers, runtime)

    async def get_general_rights_async(
        self,
        request: caasplatform_models.GetGeneralRightsRequest,
    ) -> caasplatform_models.GetGeneralRightsResponse:
        """
        Description: 通用合约调用-权益-URL查询
        Summary: 通用合约调用-权益- URL查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_general_rights_ex_async(request, headers, runtime)

    def get_general_rights_ex(
        self,
        request: caasplatform_models.GetGeneralRightsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.GetGeneralRightsResponse:
        """
        Description: 通用合约调用-权益-URL查询
        Summary: 通用合约调用-权益- URL查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.GetGeneralRightsResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.rights.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_general_rights_ex_async(
        self,
        request: caasplatform_models.GetGeneralRightsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.GetGeneralRightsResponse:
        """
        Description: 通用合约调用-权益-URL查询
        Summary: 通用合约调用-权益- URL查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.GetGeneralRightsResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.rights.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_general_divide(
        self,
        request: caasplatform_models.RegisterGeneralDivideRequest,
    ) -> caasplatform_models.RegisterGeneralDivideResponse:
        """
        Description: 1.分账方最大数量限制50
        2.id存在则更新分账方
        3.存在分账记录的分账方不能被更新
        Summary: 分账合约-配置分账方
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_general_divide_ex(request, headers, runtime)

    async def register_general_divide_async(
        self,
        request: caasplatform_models.RegisterGeneralDivideRequest,
    ) -> caasplatform_models.RegisterGeneralDivideResponse:
        """
        Description: 1.分账方最大数量限制50
        2.id存在则更新分账方
        3.存在分账记录的分账方不能被更新
        Summary: 分账合约-配置分账方
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_general_divide_ex_async(request, headers, runtime)

    def register_general_divide_ex(
        self,
        request: caasplatform_models.RegisterGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.RegisterGeneralDivideResponse:
        """
        Description: 1.分账方最大数量限制50
        2.id存在则更新分账方
        3.存在分账记录的分账方不能被更新
        Summary: 分账合约-配置分账方
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.RegisterGeneralDivideResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.divide.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_general_divide_ex_async(
        self,
        request: caasplatform_models.RegisterGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.RegisterGeneralDivideResponse:
        """
        Description: 1.分账方最大数量限制50
        2.id存在则更新分账方
        3.存在分账记录的分账方不能被更新
        Summary: 分账合约-配置分账方
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.RegisterGeneralDivideResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.divide.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_general_divide(
        self,
        request: caasplatform_models.QueryGeneralDivideRequest,
    ) -> caasplatform_models.QueryGeneralDivideResponse:
        """
        Description: 分账合约-查询分账方
        Summary: 分账合约-查询分账方
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_general_divide_ex(request, headers, runtime)

    async def query_general_divide_async(
        self,
        request: caasplatform_models.QueryGeneralDivideRequest,
    ) -> caasplatform_models.QueryGeneralDivideResponse:
        """
        Description: 分账合约-查询分账方
        Summary: 分账合约-查询分账方
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_general_divide_ex_async(request, headers, runtime)

    def query_general_divide_ex(
        self,
        request: caasplatform_models.QueryGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.QueryGeneralDivideResponse:
        """
        Description: 分账合约-查询分账方
        Summary: 分账合约-查询分账方
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.QueryGeneralDivideResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.divide.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_general_divide_ex_async(
        self,
        request: caasplatform_models.QueryGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.QueryGeneralDivideResponse:
        """
        Description: 分账合约-查询分账方
        Summary: 分账合约-查询分账方
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.QueryGeneralDivideResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.divide.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_general_divide(
        self,
        request: caasplatform_models.SetGeneralDivideRequest,
    ) -> caasplatform_models.SetGeneralDivideResponse:
        """
        Description: 1.分账规则id不能重复配置
        2.至少配置一个分账方
        3.分账方id需要已存在
        4.分账份额保留2位小数,多余部分舍弃
        5.分账份额需小于100 且大于0
        6.总份额不能大于100
        Summary: 分账合约-配置分账规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_general_divide_ex(request, headers, runtime)

    async def set_general_divide_async(
        self,
        request: caasplatform_models.SetGeneralDivideRequest,
    ) -> caasplatform_models.SetGeneralDivideResponse:
        """
        Description: 1.分账规则id不能重复配置
        2.至少配置一个分账方
        3.分账方id需要已存在
        4.分账份额保留2位小数,多余部分舍弃
        5.分账份额需小于100 且大于0
        6.总份额不能大于100
        Summary: 分账合约-配置分账规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_general_divide_ex_async(request, headers, runtime)

    def set_general_divide_ex(
        self,
        request: caasplatform_models.SetGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.SetGeneralDivideResponse:
        """
        Description: 1.分账规则id不能重复配置
        2.至少配置一个分账方
        3.分账方id需要已存在
        4.分账份额保留2位小数,多余部分舍弃
        5.分账份额需小于100 且大于0
        6.总份额不能大于100
        Summary: 分账合约-配置分账规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.SetGeneralDivideResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.divide.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_general_divide_ex_async(
        self,
        request: caasplatform_models.SetGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.SetGeneralDivideResponse:
        """
        Description: 1.分账规则id不能重复配置
        2.至少配置一个分账方
        3.分账方id需要已存在
        4.分账份额保留2位小数,多余部分舍弃
        5.分账份额需小于100 且大于0
        6.总份额不能大于100
        Summary: 分账合约-配置分账规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.SetGeneralDivideResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.divide.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_general_divide(
        self,
        request: caasplatform_models.GetGeneralDivideRequest,
    ) -> caasplatform_models.GetGeneralDivideResponse:
        """
        Description: 分账合约-查询分账规则
        Summary: 分账合约-查询分账规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_general_divide_ex(request, headers, runtime)

    async def get_general_divide_async(
        self,
        request: caasplatform_models.GetGeneralDivideRequest,
    ) -> caasplatform_models.GetGeneralDivideResponse:
        """
        Description: 分账合约-查询分账规则
        Summary: 分账合约-查询分账规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_general_divide_ex_async(request, headers, runtime)

    def get_general_divide_ex(
        self,
        request: caasplatform_models.GetGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.GetGeneralDivideResponse:
        """
        Description: 分账合约-查询分账规则
        Summary: 分账合约-查询分账规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.GetGeneralDivideResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.divide.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_general_divide_ex_async(
        self,
        request: caasplatform_models.GetGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.GetGeneralDivideResponse:
        """
        Description: 分账合约-查询分账规则
        Summary: 分账合约-查询分账规则
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.GetGeneralDivideResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.divide.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_general_divide(
        self,
        request: caasplatform_models.DeleteGeneralDivideRequest,
    ) -> caasplatform_models.DeleteGeneralDivideResponse:
        """
        Description: 1.分账方id需存在
        2.已分账的分账方不能删除
        3.已配置分账规则的分账方不能删除
        Summary: 分账合约-删除分账方
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_general_divide_ex(request, headers, runtime)

    async def delete_general_divide_async(
        self,
        request: caasplatform_models.DeleteGeneralDivideRequest,
    ) -> caasplatform_models.DeleteGeneralDivideResponse:
        """
        Description: 1.分账方id需存在
        2.已分账的分账方不能删除
        3.已配置分账规则的分账方不能删除
        Summary: 分账合约-删除分账方
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_general_divide_ex_async(request, headers, runtime)

    def delete_general_divide_ex(
        self,
        request: caasplatform_models.DeleteGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.DeleteGeneralDivideResponse:
        """
        Description: 1.分账方id需存在
        2.已分账的分账方不能删除
        3.已配置分账规则的分账方不能删除
        Summary: 分账合约-删除分账方
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.DeleteGeneralDivideResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.divide.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_general_divide_ex_async(
        self,
        request: caasplatform_models.DeleteGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.DeleteGeneralDivideResponse:
        """
        Description: 1.分账方id需存在
        2.已分账的分账方不能删除
        3.已配置分账规则的分账方不能删除
        Summary: 分账合约-删除分账方
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.DeleteGeneralDivideResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.divide.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pay_general_divide(
        self,
        request: caasplatform_models.PayGeneralDivideRequest,
    ) -> caasplatform_models.PayGeneralDivideResponse:
        """
        Description: 1.订单id不能重复
        2.金额不能小于0，金额保留3位小数多余部分舍弃
        3.分账方id需要已存在
        4.分账规则id需已存在
        Summary: 分账合约-发起分账
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pay_general_divide_ex(request, headers, runtime)

    async def pay_general_divide_async(
        self,
        request: caasplatform_models.PayGeneralDivideRequest,
    ) -> caasplatform_models.PayGeneralDivideResponse:
        """
        Description: 1.订单id不能重复
        2.金额不能小于0，金额保留3位小数多余部分舍弃
        3.分账方id需要已存在
        4.分账规则id需已存在
        Summary: 分账合约-发起分账
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pay_general_divide_ex_async(request, headers, runtime)

    def pay_general_divide_ex(
        self,
        request: caasplatform_models.PayGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.PayGeneralDivideResponse:
        """
        Description: 1.订单id不能重复
        2.金额不能小于0，金额保留3位小数多余部分舍弃
        3.分账方id需要已存在
        4.分账规则id需已存在
        Summary: 分账合约-发起分账
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.PayGeneralDivideResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.divide.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pay_general_divide_ex_async(
        self,
        request: caasplatform_models.PayGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.PayGeneralDivideResponse:
        """
        Description: 1.订单id不能重复
        2.金额不能小于0，金额保留3位小数多余部分舍弃
        3.分账方id需要已存在
        4.分账规则id需已存在
        Summary: 分账合约-发起分账
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.PayGeneralDivideResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.divide.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pull_general_divide(
        self,
        request: caasplatform_models.PullGeneralDivideRequest,
    ) -> caasplatform_models.PullGeneralDivideResponse:
        """
        Description: 分账合约-获取分账方余额
        Summary: 分账合约-获取分账方余额
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pull_general_divide_ex(request, headers, runtime)

    async def pull_general_divide_async(
        self,
        request: caasplatform_models.PullGeneralDivideRequest,
    ) -> caasplatform_models.PullGeneralDivideResponse:
        """
        Description: 分账合约-获取分账方余额
        Summary: 分账合约-获取分账方余额
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pull_general_divide_ex_async(request, headers, runtime)

    def pull_general_divide_ex(
        self,
        request: caasplatform_models.PullGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.PullGeneralDivideResponse:
        """
        Description: 分账合约-获取分账方余额
        Summary: 分账合约-获取分账方余额
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.PullGeneralDivideResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.divide.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pull_general_divide_ex_async(
        self,
        request: caasplatform_models.PullGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.PullGeneralDivideResponse:
        """
        Description: 分账合约-获取分账方余额
        Summary: 分账合约-获取分账方余额
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.PullGeneralDivideResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.divide.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_general_divide(
        self,
        request: caasplatform_models.BatchqueryGeneralDivideRequest,
    ) -> caasplatform_models.BatchqueryGeneralDivideResponse:
        """
        Description: 分账合约-获取订单分账信息
        Summary: 分账合约-获取订单分账信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_general_divide_ex(request, headers, runtime)

    async def batchquery_general_divide_async(
        self,
        request: caasplatform_models.BatchqueryGeneralDivideRequest,
    ) -> caasplatform_models.BatchqueryGeneralDivideResponse:
        """
        Description: 分账合约-获取订单分账信息
        Summary: 分账合约-获取订单分账信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_general_divide_ex_async(request, headers, runtime)

    def batchquery_general_divide_ex(
        self,
        request: caasplatform_models.BatchqueryGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.BatchqueryGeneralDivideResponse:
        """
        Description: 分账合约-获取订单分账信息
        Summary: 分账合约-获取订单分账信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.BatchqueryGeneralDivideResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.divide.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_general_divide_ex_async(
        self,
        request: caasplatform_models.BatchqueryGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.BatchqueryGeneralDivideResponse:
        """
        Description: 分账合约-获取订单分账信息
        Summary: 分账合约-获取订单分账信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.BatchqueryGeneralDivideResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.divide.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_general_tourism(
        self,
        request: caasplatform_models.GetGeneralTourismRequest,
    ) -> caasplatform_models.GetGeneralTourismResponse:
        """
        Description: 旅游文创合约-文创URL查询
        Summary: 旅游文创合约-文创URL查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_general_tourism_ex(request, headers, runtime)

    async def get_general_tourism_async(
        self,
        request: caasplatform_models.GetGeneralTourismRequest,
    ) -> caasplatform_models.GetGeneralTourismResponse:
        """
        Description: 旅游文创合约-文创URL查询
        Summary: 旅游文创合约-文创URL查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_general_tourism_ex_async(request, headers, runtime)

    def get_general_tourism_ex(
        self,
        request: caasplatform_models.GetGeneralTourismRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.GetGeneralTourismResponse:
        """
        Description: 旅游文创合约-文创URL查询
        Summary: 旅游文创合约-文创URL查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.GetGeneralTourismResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.tourism.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_general_tourism_ex_async(
        self,
        request: caasplatform_models.GetGeneralTourismRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.GetGeneralTourismResponse:
        """
        Description: 旅游文创合约-文创URL查询
        Summary: 旅游文创合约-文创URL查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.GetGeneralTourismResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.tourism.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_general_tourism(
        self,
        request: caasplatform_models.RegisterGeneralTourismRequest,
    ) -> caasplatform_models.RegisterGeneralTourismResponse:
        """
        Description: 旅游文创合约-铸造文创
        Summary: 旅游文创合约-铸造文创
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_general_tourism_ex(request, headers, runtime)

    async def register_general_tourism_async(
        self,
        request: caasplatform_models.RegisterGeneralTourismRequest,
    ) -> caasplatform_models.RegisterGeneralTourismResponse:
        """
        Description: 旅游文创合约-铸造文创
        Summary: 旅游文创合约-铸造文创
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_general_tourism_ex_async(request, headers, runtime)

    def register_general_tourism_ex(
        self,
        request: caasplatform_models.RegisterGeneralTourismRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.RegisterGeneralTourismResponse:
        """
        Description: 旅游文创合约-铸造文创
        Summary: 旅游文创合约-铸造文创
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.RegisterGeneralTourismResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.tourism.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_general_tourism_ex_async(
        self,
        request: caasplatform_models.RegisterGeneralTourismRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.RegisterGeneralTourismResponse:
        """
        Description: 旅游文创合约-铸造文创
        Summary: 旅游文创合约-铸造文创
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.RegisterGeneralTourismResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.tourism.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pay_general_tourism(
        self,
        request: caasplatform_models.PayGeneralTourismRequest,
    ) -> caasplatform_models.PayGeneralTourismResponse:
        """
        Description: 旅游文创合约-文创转增
        Summary: 旅游文创合约-文创转增
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pay_general_tourism_ex(request, headers, runtime)

    async def pay_general_tourism_async(
        self,
        request: caasplatform_models.PayGeneralTourismRequest,
    ) -> caasplatform_models.PayGeneralTourismResponse:
        """
        Description: 旅游文创合约-文创转增
        Summary: 旅游文创合约-文创转增
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pay_general_tourism_ex_async(request, headers, runtime)

    def pay_general_tourism_ex(
        self,
        request: caasplatform_models.PayGeneralTourismRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.PayGeneralTourismResponse:
        """
        Description: 旅游文创合约-文创转增
        Summary: 旅游文创合约-文创转增
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.PayGeneralTourismResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.tourism.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pay_general_tourism_ex_async(
        self,
        request: caasplatform_models.PayGeneralTourismRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.PayGeneralTourismResponse:
        """
        Description: 旅游文创合约-文创转增
        Summary: 旅游文创合约-文创转增
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.PayGeneralTourismResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.tourism.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_general_tickets(
        self,
        request: caasplatform_models.GetGeneralTicketsRequest,
    ) -> caasplatform_models.GetGeneralTicketsResponse:
        """
        Description: 线下门票合约-门票URL查询
        Summary: 线下门票合约-门票URL查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_general_tickets_ex(request, headers, runtime)

    async def get_general_tickets_async(
        self,
        request: caasplatform_models.GetGeneralTicketsRequest,
    ) -> caasplatform_models.GetGeneralTicketsResponse:
        """
        Description: 线下门票合约-门票URL查询
        Summary: 线下门票合约-门票URL查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_general_tickets_ex_async(request, headers, runtime)

    def get_general_tickets_ex(
        self,
        request: caasplatform_models.GetGeneralTicketsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.GetGeneralTicketsResponse:
        """
        Description: 线下门票合约-门票URL查询
        Summary: 线下门票合约-门票URL查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.GetGeneralTicketsResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.tickets.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_general_tickets_ex_async(
        self,
        request: caasplatform_models.GetGeneralTicketsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.GetGeneralTicketsResponse:
        """
        Description: 线下门票合约-门票URL查询
        Summary: 线下门票合约-门票URL查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.GetGeneralTicketsResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.tickets.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_general_tickets(
        self,
        request: caasplatform_models.RegisterGeneralTicketsRequest,
    ) -> caasplatform_models.RegisterGeneralTicketsResponse:
        """
        Description: 线下门票合约-铸造线下买票
        Summary: 线下门票合约-铸造线下买票
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_general_tickets_ex(request, headers, runtime)

    async def register_general_tickets_async(
        self,
        request: caasplatform_models.RegisterGeneralTicketsRequest,
    ) -> caasplatform_models.RegisterGeneralTicketsResponse:
        """
        Description: 线下门票合约-铸造线下买票
        Summary: 线下门票合约-铸造线下买票
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_general_tickets_ex_async(request, headers, runtime)

    def register_general_tickets_ex(
        self,
        request: caasplatform_models.RegisterGeneralTicketsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.RegisterGeneralTicketsResponse:
        """
        Description: 线下门票合约-铸造线下买票
        Summary: 线下门票合约-铸造线下买票
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.RegisterGeneralTicketsResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.tickets.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_general_tickets_ex_async(
        self,
        request: caasplatform_models.RegisterGeneralTicketsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.RegisterGeneralTicketsResponse:
        """
        Description: 线下门票合约-铸造线下买票
        Summary: 线下门票合约-铸造线下买票
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.RegisterGeneralTicketsResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.tickets.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pay_general_tickets(
        self,
        request: caasplatform_models.PayGeneralTicketsRequest,
    ) -> caasplatform_models.PayGeneralTicketsResponse:
        """
        Description: 线下门票合约-门票转增
        Summary: 线下门票合约-门票转增
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pay_general_tickets_ex(request, headers, runtime)

    async def pay_general_tickets_async(
        self,
        request: caasplatform_models.PayGeneralTicketsRequest,
    ) -> caasplatform_models.PayGeneralTicketsResponse:
        """
        Description: 线下门票合约-门票转增
        Summary: 线下门票合约-门票转增
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pay_general_tickets_ex_async(request, headers, runtime)

    def pay_general_tickets_ex(
        self,
        request: caasplatform_models.PayGeneralTicketsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.PayGeneralTicketsResponse:
        """
        Description: 线下门票合约-门票转增
        Summary: 线下门票合约-门票转增
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.PayGeneralTicketsResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.tickets.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pay_general_tickets_ex_async(
        self,
        request: caasplatform_models.PayGeneralTicketsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.PayGeneralTicketsResponse:
        """
        Description: 线下门票合约-门票转增
        Summary: 线下门票合约-门票转增
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.PayGeneralTicketsResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.tickets.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_general_divide(
        self,
        request: caasplatform_models.UpdateGeneralDivideRequest,
    ) -> caasplatform_models.UpdateGeneralDivideResponse:
        """
        Description: 进行分账规则的确认
        Summary: 分账规则确认接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_general_divide_ex(request, headers, runtime)

    async def update_general_divide_async(
        self,
        request: caasplatform_models.UpdateGeneralDivideRequest,
    ) -> caasplatform_models.UpdateGeneralDivideResponse:
        """
        Description: 进行分账规则的确认
        Summary: 分账规则确认接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_general_divide_ex_async(request, headers, runtime)

    def update_general_divide_ex(
        self,
        request: caasplatform_models.UpdateGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.UpdateGeneralDivideResponse:
        """
        Description: 进行分账规则的确认
        Summary: 分账规则确认接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.UpdateGeneralDivideResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.divide.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_general_divide_ex_async(
        self,
        request: caasplatform_models.UpdateGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.UpdateGeneralDivideResponse:
        """
        Description: 进行分账规则的确认
        Summary: 分账规则确认接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.UpdateGeneralDivideResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.divide.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_general_divide(
        self,
        request: caasplatform_models.ListGeneralDivideRequest,
    ) -> caasplatform_models.ListGeneralDivideResponse:
        """
        Description: 查询指定分账方的分账明细数据
        Summary: 分账明细查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_general_divide_ex(request, headers, runtime)

    async def list_general_divide_async(
        self,
        request: caasplatform_models.ListGeneralDivideRequest,
    ) -> caasplatform_models.ListGeneralDivideResponse:
        """
        Description: 查询指定分账方的分账明细数据
        Summary: 分账明细查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_general_divide_ex_async(request, headers, runtime)

    def list_general_divide_ex(
        self,
        request: caasplatform_models.ListGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.ListGeneralDivideResponse:
        """
        Description: 查询指定分账方的分账明细数据
        Summary: 分账明细查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.ListGeneralDivideResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.divide.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_general_divide_ex_async(
        self,
        request: caasplatform_models.ListGeneralDivideRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.ListGeneralDivideResponse:
        """
        Description: 查询指定分账方的分账明细数据
        Summary: 分账明细查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.ListGeneralDivideResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.divide.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_general_rightsbalance(
        self,
        request: caasplatform_models.GetGeneralRightsbalanceRequest,
    ) -> caasplatform_models.GetGeneralRightsbalanceResponse:
        """
        Description: 查询某个账户下拥有的资产数量
        Summary: 权证资产合约资产查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_general_rightsbalance_ex(request, headers, runtime)

    async def get_general_rightsbalance_async(
        self,
        request: caasplatform_models.GetGeneralRightsbalanceRequest,
    ) -> caasplatform_models.GetGeneralRightsbalanceResponse:
        """
        Description: 查询某个账户下拥有的资产数量
        Summary: 权证资产合约资产查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_general_rightsbalance_ex_async(request, headers, runtime)

    def get_general_rightsbalance_ex(
        self,
        request: caasplatform_models.GetGeneralRightsbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.GetGeneralRightsbalanceResponse:
        """
        Description: 查询某个账户下拥有的资产数量
        Summary: 权证资产合约资产查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.GetGeneralRightsbalanceResponse(),
            self.do_request('1.0', 'antchain.caasplatform.general.rightsbalance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_general_rightsbalance_ex_async(
        self,
        request: caasplatform_models.GetGeneralRightsbalanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.GetGeneralRightsbalanceResponse:
        """
        Description: 查询某个账户下拥有的资产数量
        Summary: 权证资产合约资产查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.GetGeneralRightsbalanceResponse(),
            await self.do_request_async('1.0', 'antchain.caasplatform.general.rightsbalance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: caasplatform_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> caasplatform_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: caasplatform_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> caasplatform_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: caasplatform_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: caasplatform_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> caasplatform_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            caasplatform_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
