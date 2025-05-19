# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_demosdk import models as demosdk_models
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
        config: demosdk_models.Config,
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
            # Demo类1
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
                    'sdk_version': '1.3.22',
                    '_prod_code': 'DEMOSDK',
                    '_prod_channel': 'default'
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
            # Demo类1
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
                    'sdk_version': '1.3.22',
                    '_prod_code': 'DEMOSDK',
                    '_prod_channel': 'default'
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

    def query_bbb_ccc(
        self,
        request: demosdk_models.QueryBbbCccRequest,
    ) -> demosdk_models.QueryBbbCccResponse:
        """
        Description: 测试sdk打包用
        Summary: shiyi.cj
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_bbb_ccc_ex(request, headers, runtime)

    async def query_bbb_ccc_async(
        self,
        request: demosdk_models.QueryBbbCccRequest,
    ) -> demosdk_models.QueryBbbCccResponse:
        """
        Description: 测试sdk打包用
        Summary: shiyi.cj
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_bbb_ccc_ex_async(request, headers, runtime)

    def query_bbb_ccc_ex(
        self,
        request: demosdk_models.QueryBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.QueryBbbCccResponse:
        """
        Description: 测试sdk打包用
        Summary: shiyi.cj
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.QueryBbbCccResponse(),
            self.do_request('1.0', 'antchain.demosdk.bbb.ccc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_bbb_ccc_ex_async(
        self,
        request: demosdk_models.QueryBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.QueryBbbCccResponse:
        """
        Description: 测试sdk打包用
        Summary: shiyi.cj
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.QueryBbbCccResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.bbb.ccc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_bbb_cci(
        self,
        request: demosdk_models.ImportBbbCciRequest,
    ) -> demosdk_models.ImportBbbCciResponse:
        """
        Description: 测试用
        Summary: 测试用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_bbb_cci_ex(request, headers, runtime)

    async def import_bbb_cci_async(
        self,
        request: demosdk_models.ImportBbbCciRequest,
    ) -> demosdk_models.ImportBbbCciResponse:
        """
        Description: 测试用
        Summary: 测试用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_bbb_cci_ex_async(request, headers, runtime)

    def import_bbb_cci_ex(
        self,
        request: demosdk_models.ImportBbbCciRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.ImportBbbCciResponse:
        """
        Description: 测试用
        Summary: 测试用
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = demosdk_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.demosdk.bbb.cci.import',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                import_bbb_cci_response = demosdk_models.ImportBbbCciResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return import_bbb_cci_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.ImportBbbCciResponse(),
            self.do_request('1.0', 'antchain.demosdk.bbb.cci.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_bbb_cci_ex_async(
        self,
        request: demosdk_models.ImportBbbCciRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.ImportBbbCciResponse:
        """
        Description: 测试用
        Summary: 测试用
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = demosdk_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.demosdk.bbb.cci.import',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                import_bbb_cci_response = demosdk_models.ImportBbbCciResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return import_bbb_cci_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.ImportBbbCciResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.bbb.cci.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_time_limit(
        self,
        request: demosdk_models.QueryTimeLimitRequest,
    ) -> demosdk_models.QueryTimeLimitResponse:
        """
        Description: 个人工作台二期全链路测试接口1
        Summary: 个人工作台二期全链路测试接口1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_time_limit_ex(request, headers, runtime)

    async def query_time_limit_async(
        self,
        request: demosdk_models.QueryTimeLimitRequest,
    ) -> demosdk_models.QueryTimeLimitResponse:
        """
        Description: 个人工作台二期全链路测试接口1
        Summary: 个人工作台二期全链路测试接口1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_time_limit_ex_async(request, headers, runtime)

    def query_time_limit_ex(
        self,
        request: demosdk_models.QueryTimeLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.QueryTimeLimitResponse:
        """
        Description: 个人工作台二期全链路测试接口1
        Summary: 个人工作台二期全链路测试接口1
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = demosdk_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.demosdk.time.limit.query',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                query_time_limit_response = demosdk_models.QueryTimeLimitResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return query_time_limit_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.QueryTimeLimitResponse(),
            self.do_request('1.0', 'antchain.demosdk.time.limit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_time_limit_ex_async(
        self,
        request: demosdk_models.QueryTimeLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.QueryTimeLimitResponse:
        """
        Description: 个人工作台二期全链路测试接口1
        Summary: 个人工作台二期全链路测试接口1
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = demosdk_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.demosdk.time.limit.query',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                query_time_limit_response = demosdk_models.QueryTimeLimitResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return query_time_limit_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.QueryTimeLimitResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.time.limit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cache_limit(
        self,
        request: demosdk_models.QueryCacheLimitRequest,
    ) -> demosdk_models.QueryCacheLimitResponse:
        """
        Description: 个人工作台二期测试接口2
        Summary: 个人工作台二期测试接口2
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cache_limit_ex(request, headers, runtime)

    async def query_cache_limit_async(
        self,
        request: demosdk_models.QueryCacheLimitRequest,
    ) -> demosdk_models.QueryCacheLimitResponse:
        """
        Description: 个人工作台二期测试接口2
        Summary: 个人工作台二期测试接口2
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cache_limit_ex_async(request, headers, runtime)

    def query_cache_limit_ex(
        self,
        request: demosdk_models.QueryCacheLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.QueryCacheLimitResponse:
        """
        Description: 个人工作台二期测试接口2
        Summary: 个人工作台二期测试接口2
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.QueryCacheLimitResponse(),
            self.do_request('1.0', 'antchain.demosdk.cache.limit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cache_limit_ex_async(
        self,
        request: demosdk_models.QueryCacheLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.QueryCacheLimitResponse:
        """
        Description: 个人工作台二期测试接口2
        Summary: 个人工作台二期测试接口2
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.QueryCacheLimitResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.cache.limit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def api_file_upload(
        self,
        request: demosdk_models.ApiFileUploadRequest,
    ) -> demosdk_models.ApiFileUploadResponse:
        """
        Description: 个人工作台二期测试使用
        Summary: 个人工作台二期测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.api_file_upload_ex(request, headers, runtime)

    async def api_file_upload_async(
        self,
        request: demosdk_models.ApiFileUploadRequest,
    ) -> demosdk_models.ApiFileUploadResponse:
        """
        Description: 个人工作台二期测试使用
        Summary: 个人工作台二期测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.api_file_upload_ex_async(request, headers, runtime)

    def api_file_upload_ex(
        self,
        request: demosdk_models.ApiFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.ApiFileUploadResponse:
        """
        Description: 个人工作台二期测试使用
        Summary: 个人工作台二期测试使用
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = demosdk_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.demosdk.file.upload.api',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                api_file_upload_response = demosdk_models.ApiFileUploadResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return api_file_upload_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.ApiFileUploadResponse(),
            self.do_request('1.0', 'antchain.demosdk.file.upload.api', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def api_file_upload_ex_async(
        self,
        request: demosdk_models.ApiFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.ApiFileUploadResponse:
        """
        Description: 个人工作台二期测试使用
        Summary: 个人工作台二期测试使用
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = demosdk_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.demosdk.file.upload.api',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                api_file_upload_response = demosdk_models.ApiFileUploadResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return api_file_upload_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.ApiFileUploadResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.file.upload.api', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reset_bbb_ccc(
        self,
        request: demosdk_models.ResetBbbCccRequest,
    ) -> demosdk_models.ResetBbbCccResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reset_bbb_ccc_ex(request, headers, runtime)

    async def reset_bbb_ccc_async(
        self,
        request: demosdk_models.ResetBbbCccRequest,
    ) -> demosdk_models.ResetBbbCccResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reset_bbb_ccc_ex_async(request, headers, runtime)

    def reset_bbb_ccc_ex(
        self,
        request: demosdk_models.ResetBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.ResetBbbCccResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.ResetBbbCccResponse(),
            self.do_request('1.0', 'antchain.demosdk.bbb.ccc.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reset_bbb_ccc_ex_async(
        self,
        request: demosdk_models.ResetBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.ResetBbbCccResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.ResetBbbCccResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.bbb.ccc.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_aaa_bbb_ccc(
        self,
        request: demosdk_models.BindAaaBbbCccRequest,
    ) -> demosdk_models.BindAaaBbbCccResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_aaa_bbb_ccc_ex(request, headers, runtime)

    async def bind_aaa_bbb_ccc_async(
        self,
        request: demosdk_models.BindAaaBbbCccRequest,
    ) -> demosdk_models.BindAaaBbbCccResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_aaa_bbb_ccc_ex_async(request, headers, runtime)

    def bind_aaa_bbb_ccc_ex(
        self,
        request: demosdk_models.BindAaaBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.BindAaaBbbCccResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.BindAaaBbbCccResponse(),
            self.do_request('1.0', 'antchain.demosdk.aaa.bbb.ccc.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_aaa_bbb_ccc_ex_async(
        self,
        request: demosdk_models.BindAaaBbbCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.BindAaaBbbCccResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.BindAaaBbbCccResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.aaa.bbb.ccc.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_aaa_ccd(
        self,
        request: demosdk_models.QueryAaaCcdRequest,
    ) -> demosdk_models.QueryAaaCcdResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_aaa_ccd_ex(request, headers, runtime)

    async def query_aaa_ccd_async(
        self,
        request: demosdk_models.QueryAaaCcdRequest,
    ) -> demosdk_models.QueryAaaCcdResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_aaa_ccd_ex_async(request, headers, runtime)

    def query_aaa_ccd_ex(
        self,
        request: demosdk_models.QueryAaaCcdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.QueryAaaCcdResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.QueryAaaCcdResponse(),
            self.do_request('1.0', 'antchain.demosdk.aaa.ccd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_aaa_ccd_ex_async(
        self,
        request: demosdk_models.QueryAaaCcdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.QueryAaaCcdResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.QueryAaaCcdResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.aaa.ccd.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_xxx(
        self,
        request: demosdk_models.BindXxxRequest,
    ) -> demosdk_models.BindXxxResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_xxx_ex(request, headers, runtime)

    async def bind_xxx_async(
        self,
        request: demosdk_models.BindXxxRequest,
    ) -> demosdk_models.BindXxxResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_xxx_ex_async(request, headers, runtime)

    def bind_xxx_ex(
        self,
        request: demosdk_models.BindXxxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.BindXxxResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.BindXxxResponse(),
            self.do_request('1.0', 'antchain.demosdk.xxx.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_xxx_ex_async(
        self,
        request: demosdk_models.BindXxxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.BindXxxResponse:
        """
        Description: 自动化测试创建test，请勿修改、删除
        Summary: 自动化测试创建test1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.BindXxxResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.xxx.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cc_xx(
        self,
        request: demosdk_models.QueryCcXxRequest,
    ) -> demosdk_models.QueryCcXxResponse:
        """
        Description: 测试
        Summary: 测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cc_xx_ex(request, headers, runtime)

    async def query_cc_xx_async(
        self,
        request: demosdk_models.QueryCcXxRequest,
    ) -> demosdk_models.QueryCcXxResponse:
        """
        Description: 测试
        Summary: 测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cc_xx_ex_async(request, headers, runtime)

    def query_cc_xx_ex(
        self,
        request: demosdk_models.QueryCcXxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.QueryCcXxResponse:
        """
        Description: 测试
        Summary: 测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.QueryCcXxResponse(),
            self.do_request('1.0', 'antchain.demosdk.cc.xx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cc_xx_ex_async(
        self,
        request: demosdk_models.QueryCcXxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.QueryCcXxResponse:
        """
        Description: 测试
        Summary: 测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.QueryCcXxResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.cc.xx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_api_list(
        self,
        request: demosdk_models.VerifyApiListRequest,
    ) -> demosdk_models.VerifyApiListResponse:
        """
        Description: 用于个人工作台二期测试使用
        Summary: 用于个人工作台二期测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_api_list_ex(request, headers, runtime)

    async def verify_api_list_async(
        self,
        request: demosdk_models.VerifyApiListRequest,
    ) -> demosdk_models.VerifyApiListResponse:
        """
        Description: 用于个人工作台二期测试使用
        Summary: 用于个人工作台二期测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_api_list_ex_async(request, headers, runtime)

    def verify_api_list_ex(
        self,
        request: demosdk_models.VerifyApiListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.VerifyApiListResponse:
        """
        Description: 用于个人工作台二期测试使用
        Summary: 用于个人工作台二期测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.VerifyApiListResponse(),
            self.do_request('1.0', 'antchain.demosdk.api.list.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_api_list_ex_async(
        self,
        request: demosdk_models.VerifyApiListRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.VerifyApiListResponse:
        """
        Description: 用于个人工作台二期测试使用
        Summary: 用于个人工作台二期测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.VerifyApiListResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.api.list.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_workbench_test(
        self,
        request: demosdk_models.QueryWorkbenchTestRequest,
    ) -> demosdk_models.QueryWorkbenchTestResponse:
        """
        Description: 用于个人工作台二期测试使用
        Summary: 用于个人工作台二期测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_workbench_test_ex(request, headers, runtime)

    async def query_workbench_test_async(
        self,
        request: demosdk_models.QueryWorkbenchTestRequest,
    ) -> demosdk_models.QueryWorkbenchTestResponse:
        """
        Description: 用于个人工作台二期测试使用
        Summary: 用于个人工作台二期测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_workbench_test_ex_async(request, headers, runtime)

    def query_workbench_test_ex(
        self,
        request: demosdk_models.QueryWorkbenchTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.QueryWorkbenchTestResponse:
        """
        Description: 用于个人工作台二期测试使用
        Summary: 用于个人工作台二期测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.QueryWorkbenchTestResponse(),
            self.do_request('1.0', 'antchain.demosdk.workbench.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_workbench_test_ex_async(
        self,
        request: demosdk_models.QueryWorkbenchTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.QueryWorkbenchTestResponse:
        """
        Description: 用于个人工作台二期测试使用
        Summary: 用于个人工作台二期测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.QueryWorkbenchTestResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.workbench.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_create_test(
        self,
        request: demosdk_models.ImportCreateTestRequest,
    ) -> demosdk_models.ImportCreateTestResponse:
        """
        Description: 用于个人工作台二期测试使用
        Summary: 用于个人工作台二期测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_create_test_ex(request, headers, runtime)

    async def import_create_test_async(
        self,
        request: demosdk_models.ImportCreateTestRequest,
    ) -> demosdk_models.ImportCreateTestResponse:
        """
        Description: 用于个人工作台二期测试使用
        Summary: 用于个人工作台二期测试使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_create_test_ex_async(request, headers, runtime)

    def import_create_test_ex(
        self,
        request: demosdk_models.ImportCreateTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.ImportCreateTestResponse:
        """
        Description: 用于个人工作台二期测试使用
        Summary: 用于个人工作台二期测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.ImportCreateTestResponse(),
            self.do_request('1.0', 'antchain.demosdk.create.test.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_create_test_ex_async(
        self,
        request: demosdk_models.ImportCreateTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.ImportCreateTestResponse:
        """
        Description: 用于个人工作台二期测试使用
        Summary: 用于个人工作台二期测试使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.ImportCreateTestResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.create.test.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_abcd_one(
        self,
        request: demosdk_models.QueryAbcdOneRequest,
    ) -> demosdk_models.QueryAbcdOneResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_abcd_one_ex(request, headers, runtime)

    async def query_abcd_one_async(
        self,
        request: demosdk_models.QueryAbcdOneRequest,
    ) -> demosdk_models.QueryAbcdOneResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_abcd_one_ex_async(request, headers, runtime)

    def query_abcd_one_ex(
        self,
        request: demosdk_models.QueryAbcdOneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.QueryAbcdOneResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.QueryAbcdOneResponse(),
            self.do_request('1.0', 'antchain.demosdk.abcd.one.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_abcd_one_ex_async(
        self,
        request: demosdk_models.QueryAbcdOneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.QueryAbcdOneResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.QueryAbcdOneResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.abcd.one.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_abcd_one(
        self,
        request: demosdk_models.ImportAbcdOneRequest,
    ) -> demosdk_models.ImportAbcdOneResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_abcd_one_ex(request, headers, runtime)

    async def import_abcd_one_async(
        self,
        request: demosdk_models.ImportAbcdOneRequest,
    ) -> demosdk_models.ImportAbcdOneResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_abcd_one_ex_async(request, headers, runtime)

    def import_abcd_one_ex(
        self,
        request: demosdk_models.ImportAbcdOneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.ImportAbcdOneResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.ImportAbcdOneResponse(),
            self.do_request('1.0', 'antchain.demosdk.abcd.one.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_abcd_one_ex_async(
        self,
        request: demosdk_models.ImportAbcdOneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.ImportAbcdOneResponse:
        """
        Description: 个人工作台二期测试接口
        Summary: 个人工作台二期测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.ImportAbcdOneResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.abcd.one.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reset_abcd_limit(
        self,
        request: demosdk_models.ResetAbcdLimitRequest,
    ) -> demosdk_models.ResetAbcdLimitResponse:
        """
        Description: 个人工作台二期分组路由灰度测试接口
        Summary: 个人工作台二期分组路由灰度测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reset_abcd_limit_ex(request, headers, runtime)

    async def reset_abcd_limit_async(
        self,
        request: demosdk_models.ResetAbcdLimitRequest,
    ) -> demosdk_models.ResetAbcdLimitResponse:
        """
        Description: 个人工作台二期分组路由灰度测试接口
        Summary: 个人工作台二期分组路由灰度测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reset_abcd_limit_ex_async(request, headers, runtime)

    def reset_abcd_limit_ex(
        self,
        request: demosdk_models.ResetAbcdLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.ResetAbcdLimitResponse:
        """
        Description: 个人工作台二期分组路由灰度测试接口
        Summary: 个人工作台二期分组路由灰度测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.ResetAbcdLimitResponse(),
            self.do_request('1.0', 'antchain.demosdk.abcd.limit.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reset_abcd_limit_ex_async(
        self,
        request: demosdk_models.ResetAbcdLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.ResetAbcdLimitResponse:
        """
        Description: 个人工作台二期分组路由灰度测试接口
        Summary: 个人工作台二期分组路由灰度测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.ResetAbcdLimitResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.abcd.limit.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_abcd_limit(
        self,
        request: demosdk_models.RegisterAbcdLimitRequest,
    ) -> demosdk_models.RegisterAbcdLimitResponse:
        """
        Description: 个人工作台二期分组路由测试接口
        Summary: 个人工作台二期分组路由测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_abcd_limit_ex(request, headers, runtime)

    async def register_abcd_limit_async(
        self,
        request: demosdk_models.RegisterAbcdLimitRequest,
    ) -> demosdk_models.RegisterAbcdLimitResponse:
        """
        Description: 个人工作台二期分组路由测试接口
        Summary: 个人工作台二期分组路由测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_abcd_limit_ex_async(request, headers, runtime)

    def register_abcd_limit_ex(
        self,
        request: demosdk_models.RegisterAbcdLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.RegisterAbcdLimitResponse:
        """
        Description: 个人工作台二期分组路由测试接口
        Summary: 个人工作台二期分组路由测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.RegisterAbcdLimitResponse(),
            self.do_request('1.0', 'antchain.demosdk.abcd.limit.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_abcd_limit_ex_async(
        self,
        request: demosdk_models.RegisterAbcdLimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.RegisterAbcdLimitResponse:
        """
        Description: 个人工作台二期分组路由测试接口
        Summary: 个人工作台二期分组路由测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.RegisterAbcdLimitResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.abcd.limit.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def param_liuyz_test(
        self,
        request: demosdk_models.ParamLiuyzTestRequest,
    ) -> demosdk_models.ParamLiuyzTestResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.param_liuyz_test_ex(request, headers, runtime)

    async def param_liuyz_test_async(
        self,
        request: demosdk_models.ParamLiuyzTestRequest,
    ) -> demosdk_models.ParamLiuyzTestResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.param_liuyz_test_ex_async(request, headers, runtime)

    def param_liuyz_test_ex(
        self,
        request: demosdk_models.ParamLiuyzTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.ParamLiuyzTestResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.ParamLiuyzTestResponse(),
            self.do_request('1.0', 'antchain.demosdk.liuyz.test.param', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def param_liuyz_test_ex_async(
        self,
        request: demosdk_models.ParamLiuyzTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.ParamLiuyzTestResponse:
        """
        Description: 测试接口
        Summary: 测试接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.ParamLiuyzTestResponse(),
            await self.do_request_async('1.0', 'antchain.demosdk.liuyz.test.param', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: demosdk_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> demosdk_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: demosdk_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> demosdk_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: demosdk_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: demosdk_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> demosdk_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            demosdk_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
