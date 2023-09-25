# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_identitymarriage import models as identitymarriage_models
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
        config: identitymarriage_models.Config,
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
            # 键值对
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
                    '_prod_code': 'IDENTITYMARRIAGE',
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
            # 键值对
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
                    '_prod_code': 'IDENTITYMARRIAGE',
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

    def check_marriage_info(
        self,
        request: identitymarriage_models.CheckMarriageInfoRequest,
    ) -> identitymarriage_models.CheckMarriageInfoResponse:
        """
        Description: 婚姻状况核查
        Summary: 婚姻状况核查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_marriage_info_ex(request, headers, runtime)

    async def check_marriage_info_async(
        self,
        request: identitymarriage_models.CheckMarriageInfoRequest,
    ) -> identitymarriage_models.CheckMarriageInfoResponse:
        """
        Description: 婚姻状况核查
        Summary: 婚姻状况核查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_marriage_info_ex_async(request, headers, runtime)

    def check_marriage_info_ex(
        self,
        request: identitymarriage_models.CheckMarriageInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> identitymarriage_models.CheckMarriageInfoResponse:
        """
        Description: 婚姻状况核查
        Summary: 婚姻状况核查
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            identitymarriage_models.CheckMarriageInfoResponse(),
            self.do_request('1.0', 'identity.marriage.marriage.info.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_marriage_info_ex_async(
        self,
        request: identitymarriage_models.CheckMarriageInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> identitymarriage_models.CheckMarriageInfoResponse:
        """
        Description: 婚姻状况核查
        Summary: 婚姻状况核查
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            identitymarriage_models.CheckMarriageInfoResponse(),
            await self.do_request_async('1.0', 'identity.marriage.marriage.info.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_marriage_info(
        self,
        request: identitymarriage_models.NotifyMarriageInfoRequest,
    ) -> identitymarriage_models.NotifyMarriageInfoResponse:
        """
        Description: 婚姻状况通知
        Summary: 婚姻状况通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_marriage_info_ex(request, headers, runtime)

    async def notify_marriage_info_async(
        self,
        request: identitymarriage_models.NotifyMarriageInfoRequest,
    ) -> identitymarriage_models.NotifyMarriageInfoResponse:
        """
        Description: 婚姻状况通知
        Summary: 婚姻状况通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_marriage_info_ex_async(request, headers, runtime)

    def notify_marriage_info_ex(
        self,
        request: identitymarriage_models.NotifyMarriageInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> identitymarriage_models.NotifyMarriageInfoResponse:
        """
        Description: 婚姻状况通知
        Summary: 婚姻状况通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            identitymarriage_models.NotifyMarriageInfoResponse(),
            self.do_request('1.0', 'identity.marriage.marriage.info.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_marriage_info_ex_async(
        self,
        request: identitymarriage_models.NotifyMarriageInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> identitymarriage_models.NotifyMarriageInfoResponse:
        """
        Description: 婚姻状况通知
        Summary: 婚姻状况通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            identitymarriage_models.NotifyMarriageInfoResponse(),
            await self.do_request_async('1.0', 'identity.marriage.marriage.info.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_file_data(
        self,
        request: identitymarriage_models.UploadFileDataRequest,
    ) -> identitymarriage_models.UploadFileDataResponse:
        """
        Description: 核婚授权文件上传
        Summary: 核婚授权文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_file_data_ex(request, headers, runtime)

    async def upload_file_data_async(
        self,
        request: identitymarriage_models.UploadFileDataRequest,
    ) -> identitymarriage_models.UploadFileDataResponse:
        """
        Description: 核婚授权文件上传
        Summary: 核婚授权文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_file_data_ex_async(request, headers, runtime)

    def upload_file_data_ex(
        self,
        request: identitymarriage_models.UploadFileDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> identitymarriage_models.UploadFileDataResponse:
        """
        Description: 核婚授权文件上传
        Summary: 核婚授权文件上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            identitymarriage_models.UploadFileDataResponse(),
            self.do_request('1.0', 'identity.marriage.file.data.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_file_data_ex_async(
        self,
        request: identitymarriage_models.UploadFileDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> identitymarriage_models.UploadFileDataResponse:
        """
        Description: 核婚授权文件上传
        Summary: 核婚授权文件上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            identitymarriage_models.UploadFileDataResponse(),
            await self.do_request_async('1.0', 'identity.marriage.file.data.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_marriage_coupleinfo(
        self,
        request: identitymarriage_models.CheckMarriageCoupleinfoRequest,
    ) -> identitymarriage_models.CheckMarriageCoupleinfoResponse:
        """
        Description: 双人婚姻状况核查
        Summary: 双人婚姻状况核查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_marriage_coupleinfo_ex(request, headers, runtime)

    async def check_marriage_coupleinfo_async(
        self,
        request: identitymarriage_models.CheckMarriageCoupleinfoRequest,
    ) -> identitymarriage_models.CheckMarriageCoupleinfoResponse:
        """
        Description: 双人婚姻状况核查
        Summary: 双人婚姻状况核查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_marriage_coupleinfo_ex_async(request, headers, runtime)

    def check_marriage_coupleinfo_ex(
        self,
        request: identitymarriage_models.CheckMarriageCoupleinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> identitymarriage_models.CheckMarriageCoupleinfoResponse:
        """
        Description: 双人婚姻状况核查
        Summary: 双人婚姻状况核查
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            identitymarriage_models.CheckMarriageCoupleinfoResponse(),
            self.do_request('1.0', 'identity.marriage.marriage.coupleinfo.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_marriage_coupleinfo_ex_async(
        self,
        request: identitymarriage_models.CheckMarriageCoupleinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> identitymarriage_models.CheckMarriageCoupleinfoResponse:
        """
        Description: 双人婚姻状况核查
        Summary: 双人婚姻状况核查
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            identitymarriage_models.CheckMarriageCoupleinfoResponse(),
            await self.do_request_async('1.0', 'identity.marriage.marriage.coupleinfo.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_marriage_info(
        self,
        request: identitymarriage_models.SubmitMarriageInfoRequest,
    ) -> identitymarriage_models.SubmitMarriageInfoResponse:
        """
        Description: 单人婚姻状况核查异步提交
        Summary: 单人婚姻状况核查异步提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_marriage_info_ex(request, headers, runtime)

    async def submit_marriage_info_async(
        self,
        request: identitymarriage_models.SubmitMarriageInfoRequest,
    ) -> identitymarriage_models.SubmitMarriageInfoResponse:
        """
        Description: 单人婚姻状况核查异步提交
        Summary: 单人婚姻状况核查异步提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_marriage_info_ex_async(request, headers, runtime)

    def submit_marriage_info_ex(
        self,
        request: identitymarriage_models.SubmitMarriageInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> identitymarriage_models.SubmitMarriageInfoResponse:
        """
        Description: 单人婚姻状况核查异步提交
        Summary: 单人婚姻状况核查异步提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            identitymarriage_models.SubmitMarriageInfoResponse(),
            self.do_request('1.0', 'identity.marriage.marriage.info.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_marriage_info_ex_async(
        self,
        request: identitymarriage_models.SubmitMarriageInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> identitymarriage_models.SubmitMarriageInfoResponse:
        """
        Description: 单人婚姻状况核查异步提交
        Summary: 单人婚姻状况核查异步提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            identitymarriage_models.SubmitMarriageInfoResponse(),
            await self.do_request_async('1.0', 'identity.marriage.marriage.info.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_marriage_coupleinfo(
        self,
        request: identitymarriage_models.SubmitMarriageCoupleinfoRequest,
    ) -> identitymarriage_models.SubmitMarriageCoupleinfoResponse:
        """
        Description: 双人婚姻状况核查异步提交
        Summary: 双人婚姻状况核查异步提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_marriage_coupleinfo_ex(request, headers, runtime)

    async def submit_marriage_coupleinfo_async(
        self,
        request: identitymarriage_models.SubmitMarriageCoupleinfoRequest,
    ) -> identitymarriage_models.SubmitMarriageCoupleinfoResponse:
        """
        Description: 双人婚姻状况核查异步提交
        Summary: 双人婚姻状况核查异步提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_marriage_coupleinfo_ex_async(request, headers, runtime)

    def submit_marriage_coupleinfo_ex(
        self,
        request: identitymarriage_models.SubmitMarriageCoupleinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> identitymarriage_models.SubmitMarriageCoupleinfoResponse:
        """
        Description: 双人婚姻状况核查异步提交
        Summary: 双人婚姻状况核查异步提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            identitymarriage_models.SubmitMarriageCoupleinfoResponse(),
            self.do_request('1.0', 'identity.marriage.marriage.coupleinfo.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_marriage_coupleinfo_ex_async(
        self,
        request: identitymarriage_models.SubmitMarriageCoupleinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> identitymarriage_models.SubmitMarriageCoupleinfoResponse:
        """
        Description: 双人婚姻状况核查异步提交
        Summary: 双人婚姻状况核查异步提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            identitymarriage_models.SubmitMarriageCoupleinfoResponse(),
            await self.do_request_async('1.0', 'identity.marriage.marriage.coupleinfo.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_marriage_info(
        self,
        request: identitymarriage_models.QueryMarriageInfoRequest,
    ) -> identitymarriage_models.QueryMarriageInfoResponse:
        """
        Description: 婚姻状况核查异步查询
        Summary: 婚姻状况核查异步查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_marriage_info_ex(request, headers, runtime)

    async def query_marriage_info_async(
        self,
        request: identitymarriage_models.QueryMarriageInfoRequest,
    ) -> identitymarriage_models.QueryMarriageInfoResponse:
        """
        Description: 婚姻状况核查异步查询
        Summary: 婚姻状况核查异步查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_marriage_info_ex_async(request, headers, runtime)

    def query_marriage_info_ex(
        self,
        request: identitymarriage_models.QueryMarriageInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> identitymarriage_models.QueryMarriageInfoResponse:
        """
        Description: 婚姻状况核查异步查询
        Summary: 婚姻状况核查异步查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            identitymarriage_models.QueryMarriageInfoResponse(),
            self.do_request('1.0', 'identity.marriage.marriage.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_marriage_info_ex_async(
        self,
        request: identitymarriage_models.QueryMarriageInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> identitymarriage_models.QueryMarriageInfoResponse:
        """
        Description: 婚姻状况核查异步查询
        Summary: 婚姻状况核查异步查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            identitymarriage_models.QueryMarriageInfoResponse(),
            await self.do_request_async('1.0', 'identity.marriage.marriage.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_marriage_file(
        self,
        request: identitymarriage_models.UploadMarriageFileRequest,
    ) -> identitymarriage_models.UploadMarriageFileResponse:
        """
        Description: 授权文件上传接口
        Summary: 上传文件接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_marriage_file_ex(request, headers, runtime)

    async def upload_marriage_file_async(
        self,
        request: identitymarriage_models.UploadMarriageFileRequest,
    ) -> identitymarriage_models.UploadMarriageFileResponse:
        """
        Description: 授权文件上传接口
        Summary: 上传文件接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_marriage_file_ex_async(request, headers, runtime)

    def upload_marriage_file_ex(
        self,
        request: identitymarriage_models.UploadMarriageFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> identitymarriage_models.UploadMarriageFileResponse:
        """
        Description: 授权文件上传接口
        Summary: 上传文件接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = identitymarriage_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='identity.marriage.marriage.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_marriage_file_response = identitymarriage_models.UploadMarriageFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_marriage_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            identitymarriage_models.UploadMarriageFileResponse(),
            self.do_request('1.0', 'identity.marriage.marriage.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_marriage_file_ex_async(
        self,
        request: identitymarriage_models.UploadMarriageFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> identitymarriage_models.UploadMarriageFileResponse:
        """
        Description: 授权文件上传接口
        Summary: 上传文件接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = identitymarriage_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='identity.marriage.marriage.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_marriage_file_response = identitymarriage_models.UploadMarriageFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_marriage_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            identitymarriage_models.UploadMarriageFileResponse(),
            await self.do_request_async('1.0', 'identity.marriage.marriage.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: identitymarriage_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> identitymarriage_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: identitymarriage_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> identitymarriage_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: identitymarriage_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> identitymarriage_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            identitymarriage_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: identitymarriage_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> identitymarriage_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            identitymarriage_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
