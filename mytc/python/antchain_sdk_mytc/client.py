# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_mytc import models as mytc_models
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
        config: mytc_models.Config,
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
            # 上传者信息
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
                    'sdk_version': '1.2.5'
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
            # 上传者信息
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
                    'sdk_version': '1.2.5'
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

    def recognize_anti_qrcodeac(
        self,
        request: mytc_models.RecognizeAntiQrcodeacRequest,
    ) -> mytc_models.RecognizeAntiQrcodeacResponse:
        """
        Description: 主要用于二维码防伪识别，内部集成安创的二维码验真能力。
        Summary: 二维码防伪识别
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.recognize_anti_qrcodeac_ex(request, headers, runtime)

    async def recognize_anti_qrcodeac_async(
        self,
        request: mytc_models.RecognizeAntiQrcodeacRequest,
    ) -> mytc_models.RecognizeAntiQrcodeacResponse:
        """
        Description: 主要用于二维码防伪识别，内部集成安创的二维码验真能力。
        Summary: 二维码防伪识别
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.recognize_anti_qrcodeac_ex_async(request, headers, runtime)

    def recognize_anti_qrcodeac_ex(
        self,
        request: mytc_models.RecognizeAntiQrcodeacRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.RecognizeAntiQrcodeacResponse:
        """
        Description: 主要用于二维码防伪识别，内部集成安创的二维码验真能力。
        Summary: 二维码防伪识别
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = mytc_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.mytc.anti.qrcodeac.recognize',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                recognize_anti_qrcodeac_response = mytc_models.RecognizeAntiQrcodeacResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return recognize_anti_qrcodeac_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.RecognizeAntiQrcodeacResponse(),
            self.do_request('1.0', 'antchain.mytc.anti.qrcodeac.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def recognize_anti_qrcodeac_ex_async(
        self,
        request: mytc_models.RecognizeAntiQrcodeacRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.RecognizeAntiQrcodeacResponse:
        """
        Description: 主要用于二维码防伪识别，内部集成安创的二维码验真能力。
        Summary: 二维码防伪识别
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = mytc_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.mytc.anti.qrcodeac.recognize',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                recognize_anti_qrcodeac_response = mytc_models.RecognizeAntiQrcodeacResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return recognize_anti_qrcodeac_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.RecognizeAntiQrcodeacResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.anti.qrcodeac.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_anti_imagesync(
        self,
        request: mytc_models.InitAntiImagesyncRequest,
    ) -> mytc_models.InitAntiImagesyncResponse:
        """
        Description: 防伪码平台防伪底图上传，初始化上传记录
        Summary: 防伪码平台防伪底图上传初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_anti_imagesync_ex(request, headers, runtime)

    async def init_anti_imagesync_async(
        self,
        request: mytc_models.InitAntiImagesyncRequest,
    ) -> mytc_models.InitAntiImagesyncResponse:
        """
        Description: 防伪码平台防伪底图上传，初始化上传记录
        Summary: 防伪码平台防伪底图上传初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_anti_imagesync_ex_async(request, headers, runtime)

    def init_anti_imagesync_ex(
        self,
        request: mytc_models.InitAntiImagesyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.InitAntiImagesyncResponse:
        """
        Description: 防伪码平台防伪底图上传，初始化上传记录
        Summary: 防伪码平台防伪底图上传初始化
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.InitAntiImagesyncResponse(),
            self.do_request('1.0', 'antchain.mytc.anti.imagesync.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_anti_imagesync_ex_async(
        self,
        request: mytc_models.InitAntiImagesyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.InitAntiImagesyncResponse:
        """
        Description: 防伪码平台防伪底图上传，初始化上传记录
        Summary: 防伪码平台防伪底图上传初始化
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.InitAntiImagesyncResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.anti.imagesync.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_anti_imagesync(
        self,
        request: mytc_models.UploadAntiImagesyncRequest,
    ) -> mytc_models.UploadAntiImagesyncResponse:
        """
        Description: 防伪码图片上传
        Summary: 防伪码平台防伪码图片上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_anti_imagesync_ex(request, headers, runtime)

    async def upload_anti_imagesync_async(
        self,
        request: mytc_models.UploadAntiImagesyncRequest,
    ) -> mytc_models.UploadAntiImagesyncResponse:
        """
        Description: 防伪码图片上传
        Summary: 防伪码平台防伪码图片上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_anti_imagesync_ex_async(request, headers, runtime)

    def upload_anti_imagesync_ex(
        self,
        request: mytc_models.UploadAntiImagesyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.UploadAntiImagesyncResponse:
        """
        Description: 防伪码图片上传
        Summary: 防伪码平台防伪码图片上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = mytc_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.mytc.anti.imagesync.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_anti_imagesync_response = mytc_models.UploadAntiImagesyncResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_anti_imagesync_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.UploadAntiImagesyncResponse(),
            self.do_request('1.0', 'antchain.mytc.anti.imagesync.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_anti_imagesync_ex_async(
        self,
        request: mytc_models.UploadAntiImagesyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.UploadAntiImagesyncResponse:
        """
        Description: 防伪码图片上传
        Summary: 防伪码平台防伪码图片上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = mytc_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.mytc.anti.imagesync.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_anti_imagesync_response = mytc_models.UploadAntiImagesyncResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_anti_imagesync_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.UploadAntiImagesyncResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.anti.imagesync.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def finish_anti_imagesync(
        self,
        request: mytc_models.FinishAntiImagesyncRequest,
    ) -> mytc_models.FinishAntiImagesyncResponse:
        """
        Description: 防伪码平台防伪底图上传完成
        Summary: 防伪码平台防伪底图上传完成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.finish_anti_imagesync_ex(request, headers, runtime)

    async def finish_anti_imagesync_async(
        self,
        request: mytc_models.FinishAntiImagesyncRequest,
    ) -> mytc_models.FinishAntiImagesyncResponse:
        """
        Description: 防伪码平台防伪底图上传完成
        Summary: 防伪码平台防伪底图上传完成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.finish_anti_imagesync_ex_async(request, headers, runtime)

    def finish_anti_imagesync_ex(
        self,
        request: mytc_models.FinishAntiImagesyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.FinishAntiImagesyncResponse:
        """
        Description: 防伪码平台防伪底图上传完成
        Summary: 防伪码平台防伪底图上传完成
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.FinishAntiImagesyncResponse(),
            self.do_request('1.0', 'antchain.mytc.anti.imagesync.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def finish_anti_imagesync_ex_async(
        self,
        request: mytc_models.FinishAntiImagesyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.FinishAntiImagesyncResponse:
        """
        Description: 防伪码平台防伪底图上传完成
        Summary: 防伪码平台防伪底图上传完成
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.FinishAntiImagesyncResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.anti.imagesync.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_anti_qrcodeimage(
        self,
        request: mytc_models.CreateAntiQrcodeimageRequest,
    ) -> mytc_models.CreateAntiQrcodeimageResponse:
        """
        Description: 自研二维码生成
        Summary: 二维码防伪图片生成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_anti_qrcodeimage_ex(request, headers, runtime)

    async def create_anti_qrcodeimage_async(
        self,
        request: mytc_models.CreateAntiQrcodeimageRequest,
    ) -> mytc_models.CreateAntiQrcodeimageResponse:
        """
        Description: 自研二维码生成
        Summary: 二维码防伪图片生成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_anti_qrcodeimage_ex_async(request, headers, runtime)

    def create_anti_qrcodeimage_ex(
        self,
        request: mytc_models.CreateAntiQrcodeimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.CreateAntiQrcodeimageResponse:
        """
        Description: 自研二维码生成
        Summary: 二维码防伪图片生成
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.CreateAntiQrcodeimageResponse(),
            self.do_request('1.0', 'antchain.mytc.anti.qrcodeimage.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_anti_qrcodeimage_ex_async(
        self,
        request: mytc_models.CreateAntiQrcodeimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.CreateAntiQrcodeimageResponse:
        """
        Description: 自研二维码生成
        Summary: 二维码防伪图片生成
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.CreateAntiQrcodeimageResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.anti.qrcodeimage.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_code_registration(
        self,
        request: mytc_models.CreateCodeRegistrationRequest,
    ) -> mytc_models.CreateCodeRegistrationResponse:
        """
        Description: 溯源码注册, 会根据bizType+code确定唯一一条记录信息。
        主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
        Summary: 溯源码注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_code_registration_ex(request, headers, runtime)

    async def create_code_registration_async(
        self,
        request: mytc_models.CreateCodeRegistrationRequest,
    ) -> mytc_models.CreateCodeRegistrationResponse:
        """
        Description: 溯源码注册, 会根据bizType+code确定唯一一条记录信息。
        主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
        Summary: 溯源码注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_code_registration_ex_async(request, headers, runtime)

    def create_code_registration_ex(
        self,
        request: mytc_models.CreateCodeRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.CreateCodeRegistrationResponse:
        """
        Description: 溯源码注册, 会根据bizType+code确定唯一一条记录信息。
        主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
        Summary: 溯源码注册
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.CreateCodeRegistrationResponse(),
            self.do_request('1.0', 'antchain.mytc.code.registration.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_code_registration_ex_async(
        self,
        request: mytc_models.CreateCodeRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.CreateCodeRegistrationResponse:
        """
        Description: 溯源码注册, 会根据bizType+code确定唯一一条记录信息。
        主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
        Summary: 溯源码注册
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.CreateCodeRegistrationResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.code.registration.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_code_registration(
        self,
        request: mytc_models.DeleteCodeRegistrationRequest,
    ) -> mytc_models.DeleteCodeRegistrationResponse:
        """
        Description: 若溯源码注册的最新记录未上链，则可以被删除。若删除后，通过antchain.mytc.code.combine.query接口不能查询到相关码注册记录
        Summary: 溯源码注册记录删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_code_registration_ex(request, headers, runtime)

    async def delete_code_registration_async(
        self,
        request: mytc_models.DeleteCodeRegistrationRequest,
    ) -> mytc_models.DeleteCodeRegistrationResponse:
        """
        Description: 若溯源码注册的最新记录未上链，则可以被删除。若删除后，通过antchain.mytc.code.combine.query接口不能查询到相关码注册记录
        Summary: 溯源码注册记录删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_code_registration_ex_async(request, headers, runtime)

    def delete_code_registration_ex(
        self,
        request: mytc_models.DeleteCodeRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.DeleteCodeRegistrationResponse:
        """
        Description: 若溯源码注册的最新记录未上链，则可以被删除。若删除后，通过antchain.mytc.code.combine.query接口不能查询到相关码注册记录
        Summary: 溯源码注册记录删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.DeleteCodeRegistrationResponse(),
            self.do_request('1.0', 'antchain.mytc.code.registration.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_code_registration_ex_async(
        self,
        request: mytc_models.DeleteCodeRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.DeleteCodeRegistrationResponse:
        """
        Description: 若溯源码注册的最新记录未上链，则可以被删除。若删除后，通过antchain.mytc.code.combine.query接口不能查询到相关码注册记录
        Summary: 溯源码注册记录删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.DeleteCodeRegistrationResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.code.registration.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_code_relation(
        self,
        request: mytc_models.CreateCodeRelationRequest,
    ) -> mytc_models.CreateCodeRelationResponse:
        """
        Description: 将关联信息绑定到溯源码上。
        该接口调用存在以下业务维度限制：
        1. code + bizLables + bizType做唯一性判断。
        Summary: 溯源码关联信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_code_relation_ex(request, headers, runtime)

    async def create_code_relation_async(
        self,
        request: mytc_models.CreateCodeRelationRequest,
    ) -> mytc_models.CreateCodeRelationResponse:
        """
        Description: 将关联信息绑定到溯源码上。
        该接口调用存在以下业务维度限制：
        1. code + bizLables + bizType做唯一性判断。
        Summary: 溯源码关联信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_code_relation_ex_async(request, headers, runtime)

    def create_code_relation_ex(
        self,
        request: mytc_models.CreateCodeRelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.CreateCodeRelationResponse:
        """
        Description: 将关联信息绑定到溯源码上。
        该接口调用存在以下业务维度限制：
        1. code + bizLables + bizType做唯一性判断。
        Summary: 溯源码关联信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.CreateCodeRelationResponse(),
            self.do_request('1.0', 'antchain.mytc.code.relation.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_code_relation_ex_async(
        self,
        request: mytc_models.CreateCodeRelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.CreateCodeRelationResponse:
        """
        Description: 将关联信息绑定到溯源码上。
        该接口调用存在以下业务维度限制：
        1. code + bizLables + bizType做唯一性判断。
        Summary: 溯源码关联信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.CreateCodeRelationResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.code.relation.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_code_relation(
        self,
        request: mytc_models.DeleteCodeRelationRequest,
    ) -> mytc_models.DeleteCodeRelationResponse:
        """
        Description: 仅未上链的码关联信息可以被删除。仅删除code,bizType,bizSub1,bizSub2,bizSub3全部匹配的未上链的关联信息。
        若删除后，通过antchain.mytc.code.combine.query接口不能查询到该码关联记录。
        Summary: 溯源码关联信息删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_code_relation_ex(request, headers, runtime)

    async def delete_code_relation_async(
        self,
        request: mytc_models.DeleteCodeRelationRequest,
    ) -> mytc_models.DeleteCodeRelationResponse:
        """
        Description: 仅未上链的码关联信息可以被删除。仅删除code,bizType,bizSub1,bizSub2,bizSub3全部匹配的未上链的关联信息。
        若删除后，通过antchain.mytc.code.combine.query接口不能查询到该码关联记录。
        Summary: 溯源码关联信息删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_code_relation_ex_async(request, headers, runtime)

    def delete_code_relation_ex(
        self,
        request: mytc_models.DeleteCodeRelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.DeleteCodeRelationResponse:
        """
        Description: 仅未上链的码关联信息可以被删除。仅删除code,bizType,bizSub1,bizSub2,bizSub3全部匹配的未上链的关联信息。
        若删除后，通过antchain.mytc.code.combine.query接口不能查询到该码关联记录。
        Summary: 溯源码关联信息删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.DeleteCodeRelationResponse(),
            self.do_request('1.0', 'antchain.mytc.code.relation.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_code_relation_ex_async(
        self,
        request: mytc_models.DeleteCodeRelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.DeleteCodeRelationResponse:
        """
        Description: 仅未上链的码关联信息可以被删除。仅删除code,bizType,bizSub1,bizSub2,bizSub3全部匹配的未上链的关联信息。
        若删除后，通过antchain.mytc.code.combine.query接口不能查询到该码关联记录。
        Summary: 溯源码关联信息删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.DeleteCodeRelationResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.code.relation.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_code_combine(
        self,
        request: mytc_models.QueryCodeCombineRequest,
    ) -> mytc_models.QueryCodeCombineResponse:
        """
        Description: 查询当前账户下的溯源码信息。
        会查询最新的溯源码注册信息，以及各个业务维度的最新关联信息列表。
        Summary: 溯源码查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_code_combine_ex(request, headers, runtime)

    async def query_code_combine_async(
        self,
        request: mytc_models.QueryCodeCombineRequest,
    ) -> mytc_models.QueryCodeCombineResponse:
        """
        Description: 查询当前账户下的溯源码信息。
        会查询最新的溯源码注册信息，以及各个业务维度的最新关联信息列表。
        Summary: 溯源码查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_code_combine_ex_async(request, headers, runtime)

    def query_code_combine_ex(
        self,
        request: mytc_models.QueryCodeCombineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.QueryCodeCombineResponse:
        """
        Description: 查询当前账户下的溯源码信息。
        会查询最新的溯源码注册信息，以及各个业务维度的最新关联信息列表。
        Summary: 溯源码查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.QueryCodeCombineResponse(),
            self.do_request('1.0', 'antchain.mytc.code.combine.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_code_combine_ex_async(
        self,
        request: mytc_models.QueryCodeCombineRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.QueryCodeCombineResponse:
        """
        Description: 查询当前账户下的溯源码信息。
        会查询最新的溯源码注册信息，以及各个业务维度的最新关联信息列表。
        Summary: 溯源码查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.QueryCodeCombineResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.code.combine.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_code_registration(
        self,
        request: mytc_models.QueryCodeRegistrationRequest,
    ) -> mytc_models.QueryCodeRegistrationResponse:
        """
        Description: 溯源码注册历史查询
        Summary: 溯源码注册历史查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_code_registration_ex(request, headers, runtime)

    async def query_code_registration_async(
        self,
        request: mytc_models.QueryCodeRegistrationRequest,
    ) -> mytc_models.QueryCodeRegistrationResponse:
        """
        Description: 溯源码注册历史查询
        Summary: 溯源码注册历史查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_code_registration_ex_async(request, headers, runtime)

    def query_code_registration_ex(
        self,
        request: mytc_models.QueryCodeRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.QueryCodeRegistrationResponse:
        """
        Description: 溯源码注册历史查询
        Summary: 溯源码注册历史查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.QueryCodeRegistrationResponse(),
            self.do_request('1.0', 'antchain.mytc.code.registration.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_code_registration_ex_async(
        self,
        request: mytc_models.QueryCodeRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.QueryCodeRegistrationResponse:
        """
        Description: 溯源码注册历史查询
        Summary: 溯源码注册历史查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.QueryCodeRegistrationResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.code.registration.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_code_relation(
        self,
        request: mytc_models.QueryCodeRelationRequest,
    ) -> mytc_models.QueryCodeRelationResponse:
        """
        Description: 溯源码关联历史信息查询
        Summary: 溯源码关联历史信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_code_relation_ex(request, headers, runtime)

    async def query_code_relation_async(
        self,
        request: mytc_models.QueryCodeRelationRequest,
    ) -> mytc_models.QueryCodeRelationResponse:
        """
        Description: 溯源码关联历史信息查询
        Summary: 溯源码关联历史信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_code_relation_ex_async(request, headers, runtime)

    def query_code_relation_ex(
        self,
        request: mytc_models.QueryCodeRelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.QueryCodeRelationResponse:
        """
        Description: 溯源码关联历史信息查询
        Summary: 溯源码关联历史信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.QueryCodeRelationResponse(),
            self.do_request('1.0', 'antchain.mytc.code.relation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_code_relation_ex_async(
        self,
        request: mytc_models.QueryCodeRelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.QueryCodeRelationResponse:
        """
        Description: 溯源码关联历史信息查询
        Summary: 溯源码关联历史信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.QueryCodeRelationResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.code.relation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_code_deposit(
        self,
        request: mytc_models.AddCodeDepositRequest,
    ) -> mytc_models.AddCodeDepositResponse:
        """
        Description: 1. 原生存证，交易内容上链存证，返回链上唯一交易哈希。
        2. 存证内容超过链上限制仅会将存证内容hash值上链。
        Summary: 原生存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_code_deposit_ex(request, headers, runtime)

    async def add_code_deposit_async(
        self,
        request: mytc_models.AddCodeDepositRequest,
    ) -> mytc_models.AddCodeDepositResponse:
        """
        Description: 1. 原生存证，交易内容上链存证，返回链上唯一交易哈希。
        2. 存证内容超过链上限制仅会将存证内容hash值上链。
        Summary: 原生存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_code_deposit_ex_async(request, headers, runtime)

    def add_code_deposit_ex(
        self,
        request: mytc_models.AddCodeDepositRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.AddCodeDepositResponse:
        """
        Description: 1. 原生存证，交易内容上链存证，返回链上唯一交易哈希。
        2. 存证内容超过链上限制仅会将存证内容hash值上链。
        Summary: 原生存证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.AddCodeDepositResponse(),
            self.do_request('1.0', 'antchain.mytc.code.deposit.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_code_deposit_ex_async(
        self,
        request: mytc_models.AddCodeDepositRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.AddCodeDepositResponse:
        """
        Description: 1. 原生存证，交易内容上链存证，返回链上唯一交易哈希。
        2. 存证内容超过链上限制仅会将存证内容hash值上链。
        Summary: 原生存证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.AddCodeDepositResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.code.deposit.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_code_cert(
        self,
        request: mytc_models.QueryCodeCertRequest,
    ) -> mytc_models.QueryCodeCertResponse:
        """
        Description: 链上交易详情查询
        Summary: 链上交易证书查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_code_cert_ex(request, headers, runtime)

    async def query_code_cert_async(
        self,
        request: mytc_models.QueryCodeCertRequest,
    ) -> mytc_models.QueryCodeCertResponse:
        """
        Description: 链上交易详情查询
        Summary: 链上交易证书查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_code_cert_ex_async(request, headers, runtime)

    def query_code_cert_ex(
        self,
        request: mytc_models.QueryCodeCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.QueryCodeCertResponse:
        """
        Description: 链上交易详情查询
        Summary: 链上交易证书查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.QueryCodeCertResponse(),
            self.do_request('1.0', 'antchain.mytc.code.cert.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_code_cert_ex_async(
        self,
        request: mytc_models.QueryCodeCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.QueryCodeCertResponse:
        """
        Description: 链上交易详情查询
        Summary: 链上交易证书查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.QueryCodeCertResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.code.cert.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_code_stat(
        self,
        request: mytc_models.QueryCodeStatRequest,
    ) -> mytc_models.QueryCodeStatResponse:
        """
        Description: 溯源统计信息查询，不填写starTime和endTime会查询全量注册信息。
        若填写starTime和endTime，统计时间范围不能超过7天。
        Summary: 溯源统计信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_code_stat_ex(request, headers, runtime)

    async def query_code_stat_async(
        self,
        request: mytc_models.QueryCodeStatRequest,
    ) -> mytc_models.QueryCodeStatResponse:
        """
        Description: 溯源统计信息查询，不填写starTime和endTime会查询全量注册信息。
        若填写starTime和endTime，统计时间范围不能超过7天。
        Summary: 溯源统计信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_code_stat_ex_async(request, headers, runtime)

    def query_code_stat_ex(
        self,
        request: mytc_models.QueryCodeStatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.QueryCodeStatResponse:
        """
        Description: 溯源统计信息查询，不填写starTime和endTime会查询全量注册信息。
        若填写starTime和endTime，统计时间范围不能超过7天。
        Summary: 溯源统计信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.QueryCodeStatResponse(),
            self.do_request('1.0', 'antchain.mytc.code.stat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_code_stat_ex_async(
        self,
        request: mytc_models.QueryCodeStatRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.QueryCodeStatResponse:
        """
        Description: 溯源统计信息查询，不填写starTime和endTime会查询全量注册信息。
        若填写starTime和endTime，统计时间范围不能超过7天。
        Summary: 溯源统计信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.QueryCodeStatResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.code.stat.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_code_registration(
        self,
        request: mytc_models.AddCodeRegistrationRequest,
    ) -> mytc_models.AddCodeRegistrationResponse:
        """
        Description: 溯源码注册，可重复注册。 主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
        Summary: 溯源码(可重复)注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_code_registration_ex(request, headers, runtime)

    async def add_code_registration_async(
        self,
        request: mytc_models.AddCodeRegistrationRequest,
    ) -> mytc_models.AddCodeRegistrationResponse:
        """
        Description: 溯源码注册，可重复注册。 主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
        Summary: 溯源码(可重复)注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_code_registration_ex_async(request, headers, runtime)

    def add_code_registration_ex(
        self,
        request: mytc_models.AddCodeRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.AddCodeRegistrationResponse:
        """
        Description: 溯源码注册，可重复注册。 主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
        Summary: 溯源码(可重复)注册
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.AddCodeRegistrationResponse(),
            self.do_request('1.0', 'antchain.mytc.code.registration.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_code_registration_ex_async(
        self,
        request: mytc_models.AddCodeRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.AddCodeRegistrationResponse:
        """
        Description: 溯源码注册，可重复注册。 主要用于绑定关联码(relationCodes)、自定义维度(bizLables)等码全局信息，在没有码全局信息的情况下，可以不注册。
        Summary: 溯源码(可重复)注册
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.AddCodeRegistrationResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.code.registration.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_code_registration(
        self,
        request: mytc_models.UpdateCodeRegistrationRequest,
    ) -> mytc_models.UpdateCodeRegistrationResponse:
        """
        Description: 更新已注册的溯源信息
        Summary: 溯源注册信息更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_code_registration_ex(request, headers, runtime)

    async def update_code_registration_async(
        self,
        request: mytc_models.UpdateCodeRegistrationRequest,
    ) -> mytc_models.UpdateCodeRegistrationResponse:
        """
        Description: 更新已注册的溯源信息
        Summary: 溯源注册信息更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_code_registration_ex_async(request, headers, runtime)

    def update_code_registration_ex(
        self,
        request: mytc_models.UpdateCodeRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.UpdateCodeRegistrationResponse:
        """
        Description: 更新已注册的溯源信息
        Summary: 溯源注册信息更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.UpdateCodeRegistrationResponse(),
            self.do_request('1.0', 'antchain.mytc.code.registration.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_code_registration_ex_async(
        self,
        request: mytc_models.UpdateCodeRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.UpdateCodeRegistrationResponse:
        """
        Description: 更新已注册的溯源信息
        Summary: 溯源注册信息更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.UpdateCodeRegistrationResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.code.registration.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_code_relation(
        self,
        request: mytc_models.AddCodeRelationRequest,
    ) -> mytc_models.AddCodeRelationResponse:
        """
        Description: 将关联信息绑定到溯源码上，可重复注册。 该接口调用存在以下业务维度限制： 1. code + bizLables + bizType做唯一性判断。
        Summary: 溯源码(可重复)关联信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_code_relation_ex(request, headers, runtime)

    async def add_code_relation_async(
        self,
        request: mytc_models.AddCodeRelationRequest,
    ) -> mytc_models.AddCodeRelationResponse:
        """
        Description: 将关联信息绑定到溯源码上，可重复注册。 该接口调用存在以下业务维度限制： 1. code + bizLables + bizType做唯一性判断。
        Summary: 溯源码(可重复)关联信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_code_relation_ex_async(request, headers, runtime)

    def add_code_relation_ex(
        self,
        request: mytc_models.AddCodeRelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.AddCodeRelationResponse:
        """
        Description: 将关联信息绑定到溯源码上，可重复注册。 该接口调用存在以下业务维度限制： 1. code + bizLables + bizType做唯一性判断。
        Summary: 溯源码(可重复)关联信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.AddCodeRelationResponse(),
            self.do_request('1.0', 'antchain.mytc.code.relation.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_code_relation_ex_async(
        self,
        request: mytc_models.AddCodeRelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.AddCodeRelationResponse:
        """
        Description: 将关联信息绑定到溯源码上，可重复注册。 该接口调用存在以下业务维度限制： 1. code + bizLables + bizType做唯一性判断。
        Summary: 溯源码(可重复)关联信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.AddCodeRelationResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.code.relation.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_code_relation(
        self,
        request: mytc_models.UpdateCodeRelationRequest,
    ) -> mytc_models.UpdateCodeRelationResponse:
        """
        Description: 更新绑定到溯源码上的关联信息。
        Summary: 溯源码关联信息更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_code_relation_ex(request, headers, runtime)

    async def update_code_relation_async(
        self,
        request: mytc_models.UpdateCodeRelationRequest,
    ) -> mytc_models.UpdateCodeRelationResponse:
        """
        Description: 更新绑定到溯源码上的关联信息。
        Summary: 溯源码关联信息更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_code_relation_ex_async(request, headers, runtime)

    def update_code_relation_ex(
        self,
        request: mytc_models.UpdateCodeRelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.UpdateCodeRelationResponse:
        """
        Description: 更新绑定到溯源码上的关联信息。
        Summary: 溯源码关联信息更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.UpdateCodeRelationResponse(),
            self.do_request('1.0', 'antchain.mytc.code.relation.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_code_relation_ex_async(
        self,
        request: mytc_models.UpdateCodeRelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.UpdateCodeRelationResponse:
        """
        Description: 更新绑定到溯源码上的关联信息。
        Summary: 溯源码关联信息更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.UpdateCodeRelationResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.code.relation.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mini_code(
        self,
        request: mytc_models.QueryMiniCodeRequest,
    ) -> mytc_models.QueryMiniCodeResponse:
        """
        Description: 溯源码详情查询
        Summary: 溯源码详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mini_code_ex(request, headers, runtime)

    async def query_mini_code_async(
        self,
        request: mytc_models.QueryMiniCodeRequest,
    ) -> mytc_models.QueryMiniCodeResponse:
        """
        Description: 溯源码详情查询
        Summary: 溯源码详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mini_code_ex_async(request, headers, runtime)

    def query_mini_code_ex(
        self,
        request: mytc_models.QueryMiniCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.QueryMiniCodeResponse:
        """
        Description: 溯源码详情查询
        Summary: 溯源码详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.QueryMiniCodeResponse(),
            self.do_request('1.0', 'antchain.mytc.mini.code.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mini_code_ex_async(
        self,
        request: mytc_models.QueryMiniCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.QueryMiniCodeResponse:
        """
        Description: 溯源码详情查询
        Summary: 溯源码详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.QueryMiniCodeResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.mini.code.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mini_cert(
        self,
        request: mytc_models.QueryMiniCertRequest,
    ) -> mytc_models.QueryMiniCertResponse:
        """
        Description: 溯源证书查询
        Summary: 溯源证书查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mini_cert_ex(request, headers, runtime)

    async def query_mini_cert_async(
        self,
        request: mytc_models.QueryMiniCertRequest,
    ) -> mytc_models.QueryMiniCertResponse:
        """
        Description: 溯源证书查询
        Summary: 溯源证书查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mini_cert_ex_async(request, headers, runtime)

    def query_mini_cert_ex(
        self,
        request: mytc_models.QueryMiniCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.QueryMiniCertResponse:
        """
        Description: 溯源证书查询
        Summary: 溯源证书查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.QueryMiniCertResponse(),
            self.do_request('1.0', 'antchain.mytc.mini.cert.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mini_cert_ex_async(
        self,
        request: mytc_models.QueryMiniCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.QueryMiniCertResponse:
        """
        Description: 溯源证书查询
        Summary: 溯源证书查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.QueryMiniCertResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.mini.cert.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_mini_nfc(
        self,
        request: mytc_models.VerifyMiniNfcRequest,
    ) -> mytc_models.VerifyMiniNfcResponse:
        """
        Description: 动态秘钥NFC二维码校验
        Summary: 动态秘钥NFC二维码校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_mini_nfc_ex(request, headers, runtime)

    async def verify_mini_nfc_async(
        self,
        request: mytc_models.VerifyMiniNfcRequest,
    ) -> mytc_models.VerifyMiniNfcResponse:
        """
        Description: 动态秘钥NFC二维码校验
        Summary: 动态秘钥NFC二维码校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_mini_nfc_ex_async(request, headers, runtime)

    def verify_mini_nfc_ex(
        self,
        request: mytc_models.VerifyMiniNfcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.VerifyMiniNfcResponse:
        """
        Description: 动态秘钥NFC二维码校验
        Summary: 动态秘钥NFC二维码校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.VerifyMiniNfcResponse(),
            self.do_request('1.0', 'antchain.mytc.mini.nfc.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_mini_nfc_ex_async(
        self,
        request: mytc_models.VerifyMiniNfcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.VerifyMiniNfcResponse:
        """
        Description: 动态秘钥NFC二维码校验
        Summary: 动态秘钥NFC二维码校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.VerifyMiniNfcResponse(),
            await self.do_request_async('1.0', 'antchain.mytc.mini.nfc.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: mytc_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> mytc_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: mytc_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> mytc_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: mytc_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: mytc_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mytc_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mytc_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
