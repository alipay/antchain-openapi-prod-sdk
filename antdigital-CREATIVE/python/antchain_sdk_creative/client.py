# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_creative import models as creative_models
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
        config: creative_models.Config,
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
            # 只计一次的请求级费用明细
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
                    'sdk_version': '1.1.0',
                    '_prod_code': 'CREATIVE',
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
            # 只计一次的请求级费用明细
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
                    'sdk_version': '1.1.0',
                    '_prod_code': 'CREATIVE',
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

    def push_videogeneration(
        self,
        request: creative_models.PushVideogenerationRequest,
    ) -> creative_models.PushVideogenerationResponse:
        """
        Description: 内容创作平台-视频生成-推送
        Summary: 内容创作平台-视频生成-推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_videogeneration_ex(request, headers, runtime)

    async def push_videogeneration_async(
        self,
        request: creative_models.PushVideogenerationRequest,
    ) -> creative_models.PushVideogenerationResponse:
        """
        Description: 内容创作平台-视频生成-推送
        Summary: 内容创作平台-视频生成-推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_videogeneration_ex_async(request, headers, runtime)

    def push_videogeneration_ex(
        self,
        request: creative_models.PushVideogenerationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.PushVideogenerationResponse:
        """
        Description: 内容创作平台-视频生成-推送
        Summary: 内容创作平台-视频生成-推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.PushVideogenerationResponse(),
            self.do_request('1.0', 'antdigital.creative.videogeneration.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_videogeneration_ex_async(
        self,
        request: creative_models.PushVideogenerationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.PushVideogenerationResponse:
        """
        Description: 内容创作平台-视频生成-推送
        Summary: 内容创作平台-视频生成-推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.PushVideogenerationResponse(),
            await self.do_request_async('1.0', 'antdigital.creative.videogeneration.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_videogeneration(
        self,
        request: creative_models.QueryVideogenerationRequest,
    ) -> creative_models.QueryVideogenerationResponse:
        """
        Description: 视频创作接口查询
        Summary: 视频创作接口查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_videogeneration_ex(request, headers, runtime)

    async def query_videogeneration_async(
        self,
        request: creative_models.QueryVideogenerationRequest,
    ) -> creative_models.QueryVideogenerationResponse:
        """
        Description: 视频创作接口查询
        Summary: 视频创作接口查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_videogeneration_ex_async(request, headers, runtime)

    def query_videogeneration_ex(
        self,
        request: creative_models.QueryVideogenerationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.QueryVideogenerationResponse:
        """
        Description: 视频创作接口查询
        Summary: 视频创作接口查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.QueryVideogenerationResponse(),
            self.do_request('1.0', 'antdigital.creative.videogeneration.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_videogeneration_ex_async(
        self,
        request: creative_models.QueryVideogenerationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.QueryVideogenerationResponse:
        """
        Description: 视频创作接口查询
        Summary: 视频创作接口查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.QueryVideogenerationResponse(),
            await self.do_request_async('1.0', 'antdigital.creative.videogeneration.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_asset(
        self,
        request: creative_models.UploadAssetRequest,
    ) -> creative_models.UploadAssetResponse:
        """
        Description: 资产上传接口
        Summary: 资产上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_asset_ex(request, headers, runtime)

    async def upload_asset_async(
        self,
        request: creative_models.UploadAssetRequest,
    ) -> creative_models.UploadAssetResponse:
        """
        Description: 资产上传接口
        Summary: 资产上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_asset_ex_async(request, headers, runtime)

    def upload_asset_ex(
        self,
        request: creative_models.UploadAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.UploadAssetResponse:
        """
        Description: 资产上传接口
        Summary: 资产上传接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.UploadAssetResponse(),
            self.do_request('1.0', 'antdigital.creative.asset.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_asset_ex_async(
        self,
        request: creative_models.UploadAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.UploadAssetResponse:
        """
        Description: 资产上传接口
        Summary: 资产上传接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.UploadAssetResponse(),
            await self.do_request_async('1.0', 'antdigital.creative.asset.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_asset(
        self,
        request: creative_models.QueryAssetRequest,
    ) -> creative_models.QueryAssetResponse:
        """
        Description: 资产查询接口
        Summary: 资产查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_asset_ex(request, headers, runtime)

    async def query_asset_async(
        self,
        request: creative_models.QueryAssetRequest,
    ) -> creative_models.QueryAssetResponse:
        """
        Description: 资产查询接口
        Summary: 资产查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_asset_ex_async(request, headers, runtime)

    def query_asset_ex(
        self,
        request: creative_models.QueryAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.QueryAssetResponse:
        """
        Description: 资产查询接口
        Summary: 资产查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.QueryAssetResponse(),
            self.do_request('1.0', 'antdigital.creative.asset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_asset_ex_async(
        self,
        request: creative_models.QueryAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.QueryAssetResponse:
        """
        Description: 资产查询接口
        Summary: 资产查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.QueryAssetResponse(),
            await self.do_request_async('1.0', 'antdigital.creative.asset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_maas_asset(
        self,
        request: creative_models.UploadMaasAssetRequest,
    ) -> creative_models.UploadMaasAssetResponse:
        """
        Description: 上传资产
        Summary: 上传资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_maas_asset_ex(request, headers, runtime)

    async def upload_maas_asset_async(
        self,
        request: creative_models.UploadMaasAssetRequest,
    ) -> creative_models.UploadMaasAssetResponse:
        """
        Description: 上传资产
        Summary: 上传资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_maas_asset_ex_async(request, headers, runtime)

    def upload_maas_asset_ex(
        self,
        request: creative_models.UploadMaasAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.UploadMaasAssetResponse:
        """
        Description: 上传资产
        Summary: 上传资产
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.UploadMaasAssetResponse(),
            self.do_request('1.0', 'antdigital.creative.maas.asset.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_maas_asset_ex_async(
        self,
        request: creative_models.UploadMaasAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.UploadMaasAssetResponse:
        """
        Description: 上传资产
        Summary: 上传资产
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.UploadMaasAssetResponse(),
            await self.do_request_async('1.0', 'antdigital.creative.maas.asset.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_maas_asset(
        self,
        request: creative_models.QueryMaasAssetRequest,
    ) -> creative_models.QueryMaasAssetResponse:
        """
        Description: 查询资产
        Summary: 查询资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_maas_asset_ex(request, headers, runtime)

    async def query_maas_asset_async(
        self,
        request: creative_models.QueryMaasAssetRequest,
    ) -> creative_models.QueryMaasAssetResponse:
        """
        Description: 查询资产
        Summary: 查询资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_maas_asset_ex_async(request, headers, runtime)

    def query_maas_asset_ex(
        self,
        request: creative_models.QueryMaasAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.QueryMaasAssetResponse:
        """
        Description: 查询资产
        Summary: 查询资产
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.QueryMaasAssetResponse(),
            self.do_request('1.0', 'antdigital.creative.maas.asset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_maas_asset_ex_async(
        self,
        request: creative_models.QueryMaasAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.QueryMaasAssetResponse:
        """
        Description: 查询资产
        Summary: 查询资产
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.QueryMaasAssetResponse(),
            await self.do_request_async('1.0', 'antdigital.creative.maas.asset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_maas_video(
        self,
        request: creative_models.PushMaasVideoRequest,
    ) -> creative_models.PushMaasVideoResponse:
        """
        Description: 创建视频任务
        Summary: 创建视频任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_maas_video_ex(request, headers, runtime)

    async def push_maas_video_async(
        self,
        request: creative_models.PushMaasVideoRequest,
    ) -> creative_models.PushMaasVideoResponse:
        """
        Description: 创建视频任务
        Summary: 创建视频任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_maas_video_ex_async(request, headers, runtime)

    def push_maas_video_ex(
        self,
        request: creative_models.PushMaasVideoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.PushMaasVideoResponse:
        """
        Description: 创建视频任务
        Summary: 创建视频任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.PushMaasVideoResponse(),
            self.do_request('1.0', 'antdigital.creative.maas.video.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_maas_video_ex_async(
        self,
        request: creative_models.PushMaasVideoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.PushMaasVideoResponse:
        """
        Description: 创建视频任务
        Summary: 创建视频任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.PushMaasVideoResponse(),
            await self.do_request_async('1.0', 'antdigital.creative.maas.video.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_maas_video(
        self,
        request: creative_models.QueryMaasVideoRequest,
    ) -> creative_models.QueryMaasVideoResponse:
        """
        Description: 查询视频任务
        Summary: 查询视频任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_maas_video_ex(request, headers, runtime)

    async def query_maas_video_async(
        self,
        request: creative_models.QueryMaasVideoRequest,
    ) -> creative_models.QueryMaasVideoResponse:
        """
        Description: 查询视频任务
        Summary: 查询视频任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_maas_video_ex_async(request, headers, runtime)

    def query_maas_video_ex(
        self,
        request: creative_models.QueryMaasVideoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.QueryMaasVideoResponse:
        """
        Description: 查询视频任务
        Summary: 查询视频任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.QueryMaasVideoResponse(),
            self.do_request('1.0', 'antdigital.creative.maas.video.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_maas_video_ex_async(
        self,
        request: creative_models.QueryMaasVideoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.QueryMaasVideoResponse:
        """
        Description: 查询视频任务
        Summary: 查询视频任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.QueryMaasVideoResponse(),
            await self.do_request_async('1.0', 'antdigital.creative.maas.video.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_maas_image(
        self,
        request: creative_models.PushMaasImageRequest,
    ) -> creative_models.PushMaasImageResponse:
        """
        Description: 生成图片
        Summary: 生成图片
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_maas_image_ex(request, headers, runtime)

    async def push_maas_image_async(
        self,
        request: creative_models.PushMaasImageRequest,
    ) -> creative_models.PushMaasImageResponse:
        """
        Description: 生成图片
        Summary: 生成图片
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_maas_image_ex_async(request, headers, runtime)

    def push_maas_image_ex(
        self,
        request: creative_models.PushMaasImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.PushMaasImageResponse:
        """
        Description: 生成图片
        Summary: 生成图片
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.PushMaasImageResponse(),
            self.do_request('1.0', 'antdigital.creative.maas.image.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_maas_image_ex_async(
        self,
        request: creative_models.PushMaasImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.PushMaasImageResponse:
        """
        Description: 生成图片
        Summary: 生成图片
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.PushMaasImageResponse(),
            await self.do_request_async('1.0', 'antdigital.creative.maas.image.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_maas_image(
        self,
        request: creative_models.QueryMaasImageRequest,
    ) -> creative_models.QueryMaasImageResponse:
        """
        Description: 查询图片任务
        Summary: 查询图片任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_maas_image_ex(request, headers, runtime)

    async def query_maas_image_async(
        self,
        request: creative_models.QueryMaasImageRequest,
    ) -> creative_models.QueryMaasImageResponse:
        """
        Description: 查询图片任务
        Summary: 查询图片任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_maas_image_ex_async(request, headers, runtime)

    def query_maas_image_ex(
        self,
        request: creative_models.QueryMaasImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.QueryMaasImageResponse:
        """
        Description: 查询图片任务
        Summary: 查询图片任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.QueryMaasImageResponse(),
            self.do_request('1.0', 'antdigital.creative.maas.image.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_maas_image_ex_async(
        self,
        request: creative_models.QueryMaasImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.QueryMaasImageResponse:
        """
        Description: 查询图片任务
        Summary: 查询图片任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.QueryMaasImageResponse(),
            await self.do_request_async('1.0', 'antdigital.creative.maas.image.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_maas_audio(
        self,
        request: creative_models.PushMaasAudioRequest,
    ) -> creative_models.PushMaasAudioResponse:
        """
        Description: 创建音频任务
        Summary: 创建音频任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_maas_audio_ex(request, headers, runtime)

    async def push_maas_audio_async(
        self,
        request: creative_models.PushMaasAudioRequest,
    ) -> creative_models.PushMaasAudioResponse:
        """
        Description: 创建音频任务
        Summary: 创建音频任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_maas_audio_ex_async(request, headers, runtime)

    def push_maas_audio_ex(
        self,
        request: creative_models.PushMaasAudioRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.PushMaasAudioResponse:
        """
        Description: 创建音频任务
        Summary: 创建音频任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.PushMaasAudioResponse(),
            self.do_request('1.0', 'antdigital.creative.maas.audio.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_maas_audio_ex_async(
        self,
        request: creative_models.PushMaasAudioRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.PushMaasAudioResponse:
        """
        Description: 创建音频任务
        Summary: 创建音频任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.PushMaasAudioResponse(),
            await self.do_request_async('1.0', 'antdigital.creative.maas.audio.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_maas_audio(
        self,
        request: creative_models.QueryMaasAudioRequest,
    ) -> creative_models.QueryMaasAudioResponse:
        """
        Description: 查询音频任务
        Summary: 查询音频任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_maas_audio_ex(request, headers, runtime)

    async def query_maas_audio_async(
        self,
        request: creative_models.QueryMaasAudioRequest,
    ) -> creative_models.QueryMaasAudioResponse:
        """
        Description: 查询音频任务
        Summary: 查询音频任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_maas_audio_ex_async(request, headers, runtime)

    def query_maas_audio_ex(
        self,
        request: creative_models.QueryMaasAudioRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.QueryMaasAudioResponse:
        """
        Description: 查询音频任务
        Summary: 查询音频任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.QueryMaasAudioResponse(),
            self.do_request('1.0', 'antdigital.creative.maas.audio.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_maas_audio_ex_async(
        self,
        request: creative_models.QueryMaasAudioRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.QueryMaasAudioResponse:
        """
        Description: 查询音频任务
        Summary: 查询音频任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.QueryMaasAudioResponse(),
            await self.do_request_async('1.0', 'antdigital.creative.maas.audio.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_maas_chatsync(
        self,
        request: creative_models.ExecMaasChatsyncRequest,
    ) -> creative_models.ExecMaasChatsyncResponse:
        """
        Description: 文本同步调用
        Summary: 文本同步调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_maas_chatsync_ex(request, headers, runtime)

    async def exec_maas_chatsync_async(
        self,
        request: creative_models.ExecMaasChatsyncRequest,
    ) -> creative_models.ExecMaasChatsyncResponse:
        """
        Description: 文本同步调用
        Summary: 文本同步调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_maas_chatsync_ex_async(request, headers, runtime)

    def exec_maas_chatsync_ex(
        self,
        request: creative_models.ExecMaasChatsyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.ExecMaasChatsyncResponse:
        """
        Description: 文本同步调用
        Summary: 文本同步调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.ExecMaasChatsyncResponse(),
            self.do_request('1.0', 'antdigital.creative.maas.chatsync.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_maas_chatsync_ex_async(
        self,
        request: creative_models.ExecMaasChatsyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.ExecMaasChatsyncResponse:
        """
        Description: 文本同步调用
        Summary: 文本同步调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.ExecMaasChatsyncResponse(),
            await self.do_request_async('1.0', 'antdigital.creative.maas.chatsync.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_maas_price(
        self,
        request: creative_models.ExecMaasPriceRequest,
    ) -> creative_models.ExecMaasPriceResponse:
        """
        Description: 价格试算
        Summary: 价格试算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_maas_price_ex(request, headers, runtime)

    async def exec_maas_price_async(
        self,
        request: creative_models.ExecMaasPriceRequest,
    ) -> creative_models.ExecMaasPriceResponse:
        """
        Description: 价格试算
        Summary: 价格试算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_maas_price_ex_async(request, headers, runtime)

    def exec_maas_price_ex(
        self,
        request: creative_models.ExecMaasPriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.ExecMaasPriceResponse:
        """
        Description: 价格试算
        Summary: 价格试算
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.ExecMaasPriceResponse(),
            self.do_request('1.0', 'antdigital.creative.maas.price.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_maas_price_ex_async(
        self,
        request: creative_models.ExecMaasPriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> creative_models.ExecMaasPriceResponse:
        """
        Description: 价格试算
        Summary: 价格试算
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            creative_models.ExecMaasPriceResponse(),
            await self.do_request_async('1.0', 'antdigital.creative.maas.price.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
