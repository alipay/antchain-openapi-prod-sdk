# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_intellicar import models as intellicar_models
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
        config: intellicar_models.Config,
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
            # 高德潜客uv指数
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
                    'sdk_version': '1.0.36',
                    '_prod_code': 'INTELLICAR',
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
            # 高德潜客uv指数
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
                    'sdk_version': '1.0.36',
                    '_prod_code': 'INTELLICAR',
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

    def push_carloan(
        self,
        request: intellicar_models.PushCarloanRequest,
    ) -> intellicar_models.PushCarloanResponse:
        """
        Description: 推送星贷车信息
        Summary: 推送星贷车信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_carloan_ex(request, headers, runtime)

    async def push_carloan_async(
        self,
        request: intellicar_models.PushCarloanRequest,
    ) -> intellicar_models.PushCarloanResponse:
        """
        Description: 推送星贷车信息
        Summary: 推送星贷车信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_carloan_ex_async(request, headers, runtime)

    def push_carloan_ex(
        self,
        request: intellicar_models.PushCarloanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.PushCarloanResponse:
        """
        Description: 推送星贷车信息
        Summary: 推送星贷车信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.PushCarloanResponse(),
            self.do_request('1.0', 'antdigital.intellicar.carloan.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_carloan_ex_async(
        self,
        request: intellicar_models.PushCarloanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.PushCarloanResponse:
        """
        Description: 推送星贷车信息
        Summary: 推送星贷车信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.PushCarloanResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.carloan.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_carowner(
        self,
        request: intellicar_models.RegisterCarownerRequest,
    ) -> intellicar_models.RegisterCarownerResponse:
        """
        Description: 车主信息提交
        Summary:  车主信息提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_carowner_ex(request, headers, runtime)

    async def register_carowner_async(
        self,
        request: intellicar_models.RegisterCarownerRequest,
    ) -> intellicar_models.RegisterCarownerResponse:
        """
        Description: 车主信息提交
        Summary:  车主信息提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_carowner_ex_async(request, headers, runtime)

    def register_carowner_ex(
        self,
        request: intellicar_models.RegisterCarownerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.RegisterCarownerResponse:
        """
        Description: 车主信息提交
        Summary:  车主信息提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.RegisterCarownerResponse(),
            self.do_request('1.0', 'antdigital.intellicar.carowner.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_carowner_ex_async(
        self,
        request: intellicar_models.RegisterCarownerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.RegisterCarownerResponse:
        """
        Description: 车主信息提交
        Summary:  车主信息提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.RegisterCarownerResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.carowner.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_newcar(
        self,
        request: intellicar_models.BatchcreateNewcarRequest,
    ) -> intellicar_models.BatchcreateNewcarResponse:
        """
        Description: 新车线索批量提交
        Summary: 新车线索批量提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_newcar_ex(request, headers, runtime)

    async def batchcreate_newcar_async(
        self,
        request: intellicar_models.BatchcreateNewcarRequest,
    ) -> intellicar_models.BatchcreateNewcarResponse:
        """
        Description: 新车线索批量提交
        Summary: 新车线索批量提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_newcar_ex_async(request, headers, runtime)

    def batchcreate_newcar_ex(
        self,
        request: intellicar_models.BatchcreateNewcarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.BatchcreateNewcarResponse:
        """
        Description: 新车线索批量提交
        Summary: 新车线索批量提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.BatchcreateNewcarResponse(),
            self.do_request('1.0', 'antdigital.intellicar.newcar.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_newcar_ex_async(
        self,
        request: intellicar_models.BatchcreateNewcarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.BatchcreateNewcarResponse:
        """
        Description: 新车线索批量提交
        Summary: 新车线索批量提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.BatchcreateNewcarResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.newcar.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_newcar(
        self,
        request: intellicar_models.SubmitNewcarRequest,
    ) -> intellicar_models.SubmitNewcarResponse:
        """
        Description: 提交新车线索
        Summary:  提交新车线索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_newcar_ex(request, headers, runtime)

    async def submit_newcar_async(
        self,
        request: intellicar_models.SubmitNewcarRequest,
    ) -> intellicar_models.SubmitNewcarResponse:
        """
        Description: 提交新车线索
        Summary:  提交新车线索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_newcar_ex_async(request, headers, runtime)

    def submit_newcar_ex(
        self,
        request: intellicar_models.SubmitNewcarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.SubmitNewcarResponse:
        """
        Description: 提交新车线索
        Summary:  提交新车线索
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.SubmitNewcarResponse(),
            self.do_request('1.0', 'antdigital.intellicar.newcar.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_newcar_ex_async(
        self,
        request: intellicar_models.SubmitNewcarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.SubmitNewcarResponse:
        """
        Description: 提交新车线索
        Summary:  提交新车线索
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.SubmitNewcarResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.newcar.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_carowner_cy(
        self,
        request: intellicar_models.RegisterCarownerCyRequest,
    ) -> intellicar_models.RegisterCarownerCyResponse:
        """
        Description: 常岳线索推送接口
        Summary: 常岳线索推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_carowner_cy_ex(request, headers, runtime)

    async def register_carowner_cy_async(
        self,
        request: intellicar_models.RegisterCarownerCyRequest,
    ) -> intellicar_models.RegisterCarownerCyResponse:
        """
        Description: 常岳线索推送接口
        Summary: 常岳线索推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_carowner_cy_ex_async(request, headers, runtime)

    def register_carowner_cy_ex(
        self,
        request: intellicar_models.RegisterCarownerCyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.RegisterCarownerCyResponse:
        """
        Description: 常岳线索推送接口
        Summary: 常岳线索推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.RegisterCarownerCyResponse(),
            self.do_request('1.0', 'antdigital.intellicar.carowner.cy.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_carowner_cy_ex_async(
        self,
        request: intellicar_models.RegisterCarownerCyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.RegisterCarownerCyResponse:
        """
        Description: 常岳线索推送接口
        Summary: 常岳线索推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.RegisterCarownerCyResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.carowner.cy.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_car_price(
        self,
        request: intellicar_models.QueryCarPriceRequest,
    ) -> intellicar_models.QueryCarPriceResponse:
        """
        Description: 车辆价格查询
        Summary: 车辆价格查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_car_price_ex(request, headers, runtime)

    async def query_car_price_async(
        self,
        request: intellicar_models.QueryCarPriceRequest,
    ) -> intellicar_models.QueryCarPriceResponse:
        """
        Description: 车辆价格查询
        Summary: 车辆价格查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_car_price_ex_async(request, headers, runtime)

    def query_car_price_ex(
        self,
        request: intellicar_models.QueryCarPriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryCarPriceResponse:
        """
        Description: 车辆价格查询
        Summary: 车辆价格查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryCarPriceResponse(),
            self.do_request('1.0', 'antdigital.intellicar.car.price.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_car_price_ex_async(
        self,
        request: intellicar_models.QueryCarPriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryCarPriceResponse:
        """
        Description: 车辆价格查询
        Summary: 车辆价格查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryCarPriceResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.car.price.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_car_file(
        self,
        request: intellicar_models.ImportCarFileRequest,
    ) -> intellicar_models.ImportCarFileResponse:
        """
        Description: 文件引入
        Summary: 文件引入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_car_file_ex(request, headers, runtime)

    async def import_car_file_async(
        self,
        request: intellicar_models.ImportCarFileRequest,
    ) -> intellicar_models.ImportCarFileResponse:
        """
        Description: 文件引入
        Summary: 文件引入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_car_file_ex_async(request, headers, runtime)

    def import_car_file_ex(
        self,
        request: intellicar_models.ImportCarFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.ImportCarFileResponse:
        """
        Description: 文件引入
        Summary: 文件引入
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = intellicar_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antdigital.intellicar.car.file.import',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                import_car_file_response = intellicar_models.ImportCarFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return import_car_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.ImportCarFileResponse(),
            self.do_request('1.0', 'antdigital.intellicar.car.file.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_car_file_ex_async(
        self,
        request: intellicar_models.ImportCarFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.ImportCarFileResponse:
        """
        Description: 文件引入
        Summary: 文件引入
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = intellicar_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antdigital.intellicar.car.file.import',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                import_car_file_response = intellicar_models.ImportCarFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return import_car_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.ImportCarFileResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.car.file.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_usedcar(
        self,
        request: intellicar_models.QueryUsedcarRequest,
    ) -> intellicar_models.QueryUsedcarResponse:
        """
        Description: 汽车之家区域接口
        Summary: 汽车之家区域接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_usedcar_ex(request, headers, runtime)

    async def query_usedcar_async(
        self,
        request: intellicar_models.QueryUsedcarRequest,
    ) -> intellicar_models.QueryUsedcarResponse:
        """
        Description: 汽车之家区域接口
        Summary: 汽车之家区域接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_usedcar_ex_async(request, headers, runtime)

    def query_usedcar_ex(
        self,
        request: intellicar_models.QueryUsedcarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryUsedcarResponse:
        """
        Description: 汽车之家区域接口
        Summary: 汽车之家区域接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryUsedcarResponse(),
            self.do_request('1.0', 'antdigital.intellicar.usedcar.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_usedcar_ex_async(
        self,
        request: intellicar_models.QueryUsedcarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryUsedcarResponse:
        """
        Description: 汽车之家区域接口
        Summary: 汽车之家区域接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryUsedcarResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.usedcar.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_ionchi(
        self,
        request: intellicar_models.SubmitIonchiRequest,
    ) -> intellicar_models.SubmitIonchiResponse:
        """
        Description: 逸安启回调接口
        Summary: 逸安启回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_ionchi_ex(request, headers, runtime)

    async def submit_ionchi_async(
        self,
        request: intellicar_models.SubmitIonchiRequest,
    ) -> intellicar_models.SubmitIonchiResponse:
        """
        Description: 逸安启回调接口
        Summary: 逸安启回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_ionchi_ex_async(request, headers, runtime)

    def submit_ionchi_ex(
        self,
        request: intellicar_models.SubmitIonchiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.SubmitIonchiResponse:
        """
        Description: 逸安启回调接口
        Summary: 逸安启回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.SubmitIonchiResponse(),
            self.do_request('1.0', 'antdigital.intellicar.ionchi.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_ionchi_ex_async(
        self,
        request: intellicar_models.SubmitIonchiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.SubmitIonchiResponse:
        """
        Description: 逸安启回调接口
        Summary: 逸安启回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.SubmitIonchiResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.ionchi.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gd_flow(
        self,
        request: intellicar_models.QueryGdFlowRequest,
    ) -> intellicar_models.QueryGdFlowResponse:
        """
        Description: 对接高德，查询潜客流向以及重叠的数据
        Summary: 【高德】流向与重叠数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gd_flow_ex(request, headers, runtime)

    async def query_gd_flow_async(
        self,
        request: intellicar_models.QueryGdFlowRequest,
    ) -> intellicar_models.QueryGdFlowResponse:
        """
        Description: 对接高德，查询潜客流向以及重叠的数据
        Summary: 【高德】流向与重叠数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gd_flow_ex_async(request, headers, runtime)

    def query_gd_flow_ex(
        self,
        request: intellicar_models.QueryGdFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryGdFlowResponse:
        """
        Description: 对接高德，查询潜客流向以及重叠的数据
        Summary: 【高德】流向与重叠数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryGdFlowResponse(),
            self.do_request('1.0', 'antdigital.intellicar.gd.flow.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gd_flow_ex_async(
        self,
        request: intellicar_models.QueryGdFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryGdFlowResponse:
        """
        Description: 对接高德，查询潜客流向以及重叠的数据
        Summary: 【高德】流向与重叠数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryGdFlowResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.gd.flow.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_battery_report(
        self,
        request: intellicar_models.QueryBatteryReportRequest,
    ) -> intellicar_models.QueryBatteryReportResponse:
        """
        Description: 电池衰退权益报告查询接口
        Summary: 电池衰退权益报告查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_battery_report_ex(request, headers, runtime)

    async def query_battery_report_async(
        self,
        request: intellicar_models.QueryBatteryReportRequest,
    ) -> intellicar_models.QueryBatteryReportResponse:
        """
        Description: 电池衰退权益报告查询接口
        Summary: 电池衰退权益报告查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_battery_report_ex_async(request, headers, runtime)

    def query_battery_report_ex(
        self,
        request: intellicar_models.QueryBatteryReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryBatteryReportResponse:
        """
        Description: 电池衰退权益报告查询接口
        Summary: 电池衰退权益报告查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryBatteryReportResponse(),
            self.do_request('1.0', 'antdigital.intellicar.battery.report.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_battery_report_ex_async(
        self,
        request: intellicar_models.QueryBatteryReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryBatteryReportResponse:
        """
        Description: 电池衰退权益报告查询接口
        Summary: 电池衰退权益报告查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryBatteryReportResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.battery.report.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_newcar_qczj(
        self,
        request: intellicar_models.QueryNewcarQczjRequest,
    ) -> intellicar_models.QueryNewcarQczjResponse:
        """
        Description: 用来查询汽车之家车型和城市列表
        Summary: 用来查询汽车之家车型和城市列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_newcar_qczj_ex(request, headers, runtime)

    async def query_newcar_qczj_async(
        self,
        request: intellicar_models.QueryNewcarQczjRequest,
    ) -> intellicar_models.QueryNewcarQczjResponse:
        """
        Description: 用来查询汽车之家车型和城市列表
        Summary: 用来查询汽车之家车型和城市列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_newcar_qczj_ex_async(request, headers, runtime)

    def query_newcar_qczj_ex(
        self,
        request: intellicar_models.QueryNewcarQczjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryNewcarQczjResponse:
        """
        Description: 用来查询汽车之家车型和城市列表
        Summary: 用来查询汽车之家车型和城市列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryNewcarQczjResponse(),
            self.do_request('1.0', 'antdigital.intellicar.newcar.qczj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_newcar_qczj_ex_async(
        self,
        request: intellicar_models.QueryNewcarQczjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryNewcarQczjResponse:
        """
        Description: 用来查询汽车之家车型和城市列表
        Summary: 用来查询汽车之家车型和城市列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryNewcarQczjResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.newcar.qczj.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gd_store(
        self,
        request: intellicar_models.QueryGdStoreRequest,
    ) -> intellicar_models.QueryGdStoreResponse:
        """
        Description: 【高德】查询店铺基本信息
        Summary: 【高德】查询店铺基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gd_store_ex(request, headers, runtime)

    async def query_gd_store_async(
        self,
        request: intellicar_models.QueryGdStoreRequest,
    ) -> intellicar_models.QueryGdStoreResponse:
        """
        Description: 【高德】查询店铺基本信息
        Summary: 【高德】查询店铺基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gd_store_ex_async(request, headers, runtime)

    def query_gd_store_ex(
        self,
        request: intellicar_models.QueryGdStoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryGdStoreResponse:
        """
        Description: 【高德】查询店铺基本信息
        Summary: 【高德】查询店铺基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryGdStoreResponse(),
            self.do_request('1.0', 'antdigital.intellicar.gd.store.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gd_store_ex_async(
        self,
        request: intellicar_models.QueryGdStoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryGdStoreResponse:
        """
        Description: 【高德】查询店铺基本信息
        Summary: 【高德】查询店铺基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryGdStoreResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.gd.store.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gd_poential(
        self,
        request: intellicar_models.QueryGdPoentialRequest,
    ) -> intellicar_models.QueryGdPoentialResponse:
        """
        Description: 【高德】潜客指数数据
        Summary: 【高德】潜客指数数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gd_poential_ex(request, headers, runtime)

    async def query_gd_poential_async(
        self,
        request: intellicar_models.QueryGdPoentialRequest,
    ) -> intellicar_models.QueryGdPoentialResponse:
        """
        Description: 【高德】潜客指数数据
        Summary: 【高德】潜客指数数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gd_poential_ex_async(request, headers, runtime)

    def query_gd_poential_ex(
        self,
        request: intellicar_models.QueryGdPoentialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryGdPoentialResponse:
        """
        Description: 【高德】潜客指数数据
        Summary: 【高德】潜客指数数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryGdPoentialResponse(),
            self.do_request('1.0', 'antdigital.intellicar.gd.poential.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gd_poential_ex_async(
        self,
        request: intellicar_models.QueryGdPoentialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryGdPoentialResponse:
        """
        Description: 【高德】潜客指数数据
        Summary: 【高德】潜客指数数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryGdPoentialResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.gd.poential.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_cdsq_scratches(
        self,
        request: intellicar_models.RegisterCdsqScratchesRequest,
    ) -> intellicar_models.RegisterCdsqScratchesResponse:
        """
        Description: 对接车道山前擦碰无忧接口
        Summary: 对接车道山前擦碰无忧接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_cdsq_scratches_ex(request, headers, runtime)

    async def register_cdsq_scratches_async(
        self,
        request: intellicar_models.RegisterCdsqScratchesRequest,
    ) -> intellicar_models.RegisterCdsqScratchesResponse:
        """
        Description: 对接车道山前擦碰无忧接口
        Summary: 对接车道山前擦碰无忧接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_cdsq_scratches_ex_async(request, headers, runtime)

    def register_cdsq_scratches_ex(
        self,
        request: intellicar_models.RegisterCdsqScratchesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.RegisterCdsqScratchesResponse:
        """
        Description: 对接车道山前擦碰无忧接口
        Summary: 对接车道山前擦碰无忧接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.RegisterCdsqScratchesResponse(),
            self.do_request('1.0', 'antdigital.intellicar.cdsq.scratches.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_cdsq_scratches_ex_async(
        self,
        request: intellicar_models.RegisterCdsqScratchesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.RegisterCdsqScratchesResponse:
        """
        Description: 对接车道山前擦碰无忧接口
        Summary: 对接车道山前擦碰无忧接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.RegisterCdsqScratchesResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.cdsq.scratches.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cdsq_scratches(
        self,
        request: intellicar_models.QueryCdsqScratchesRequest,
    ) -> intellicar_models.QueryCdsqScratchesResponse:
        """
        Description: 车到山前查询权益接口
        Summary: 车到山前查询权益接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cdsq_scratches_ex(request, headers, runtime)

    async def query_cdsq_scratches_async(
        self,
        request: intellicar_models.QueryCdsqScratchesRequest,
    ) -> intellicar_models.QueryCdsqScratchesResponse:
        """
        Description: 车到山前查询权益接口
        Summary: 车到山前查询权益接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cdsq_scratches_ex_async(request, headers, runtime)

    def query_cdsq_scratches_ex(
        self,
        request: intellicar_models.QueryCdsqScratchesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryCdsqScratchesResponse:
        """
        Description: 车到山前查询权益接口
        Summary: 车到山前查询权益接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryCdsqScratchesResponse(),
            self.do_request('1.0', 'antdigital.intellicar.cdsq.scratches.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cdsq_scratches_ex_async(
        self,
        request: intellicar_models.QueryCdsqScratchesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryCdsqScratchesResponse:
        """
        Description: 车到山前查询权益接口
        Summary: 车到山前查询权益接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryCdsqScratchesResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.cdsq.scratches.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_cdsq_scratches(
        self,
        request: intellicar_models.DeleteCdsqScratchesRequest,
    ) -> intellicar_models.DeleteCdsqScratchesResponse:
        """
        Description: 车到山前权益退保接口
        Summary: 车到山前权益退保接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_cdsq_scratches_ex(request, headers, runtime)

    async def delete_cdsq_scratches_async(
        self,
        request: intellicar_models.DeleteCdsqScratchesRequest,
    ) -> intellicar_models.DeleteCdsqScratchesResponse:
        """
        Description: 车到山前权益退保接口
        Summary: 车到山前权益退保接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_cdsq_scratches_ex_async(request, headers, runtime)

    def delete_cdsq_scratches_ex(
        self,
        request: intellicar_models.DeleteCdsqScratchesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.DeleteCdsqScratchesResponse:
        """
        Description: 车到山前权益退保接口
        Summary: 车到山前权益退保接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.DeleteCdsqScratchesResponse(),
            self.do_request('1.0', 'antdigital.intellicar.cdsq.scratches.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_cdsq_scratches_ex_async(
        self,
        request: intellicar_models.DeleteCdsqScratchesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.DeleteCdsqScratchesResponse:
        """
        Description: 车到山前权益退保接口
        Summary: 车到山前权益退保接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.DeleteCdsqScratchesResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.cdsq.scratches.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_cdsq_scratches(
        self,
        request: intellicar_models.CallbackCdsqScratchesRequest,
    ) -> intellicar_models.CallbackCdsqScratchesResponse:
        """
        Description: 车到山前权益退保回调接口
        Summary: 车到山前权益退保回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_cdsq_scratches_ex(request, headers, runtime)

    async def callback_cdsq_scratches_async(
        self,
        request: intellicar_models.CallbackCdsqScratchesRequest,
    ) -> intellicar_models.CallbackCdsqScratchesResponse:
        """
        Description: 车到山前权益退保回调接口
        Summary: 车到山前权益退保回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_cdsq_scratches_ex_async(request, headers, runtime)

    def callback_cdsq_scratches_ex(
        self,
        request: intellicar_models.CallbackCdsqScratchesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.CallbackCdsqScratchesResponse:
        """
        Description: 车到山前权益退保回调接口
        Summary: 车到山前权益退保回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.CallbackCdsqScratchesResponse(),
            self.do_request('1.0', 'antdigital.intellicar.cdsq.scratches.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_cdsq_scratches_ex_async(
        self,
        request: intellicar_models.CallbackCdsqScratchesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.CallbackCdsqScratchesResponse:
        """
        Description: 车到山前权益退保回调接口
        Summary: 车到山前权益退保回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.CallbackCdsqScratchesResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.cdsq.scratches.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_cdsq_scratches(
        self,
        request: intellicar_models.SaveCdsqScratchesRequest,
    ) -> intellicar_models.SaveCdsqScratchesResponse:
        """
        Description: 车到山前权益状态查询
        Summary: 车到山前权益状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_cdsq_scratches_ex(request, headers, runtime)

    async def save_cdsq_scratches_async(
        self,
        request: intellicar_models.SaveCdsqScratchesRequest,
    ) -> intellicar_models.SaveCdsqScratchesResponse:
        """
        Description: 车到山前权益状态查询
        Summary: 车到山前权益状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_cdsq_scratches_ex_async(request, headers, runtime)

    def save_cdsq_scratches_ex(
        self,
        request: intellicar_models.SaveCdsqScratchesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.SaveCdsqScratchesResponse:
        """
        Description: 车到山前权益状态查询
        Summary: 车到山前权益状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.SaveCdsqScratchesResponse(),
            self.do_request('1.0', 'antdigital.intellicar.cdsq.scratches.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_cdsq_scratches_ex_async(
        self,
        request: intellicar_models.SaveCdsqScratchesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.SaveCdsqScratchesResponse:
        """
        Description: 车到山前权益状态查询
        Summary: 车到山前权益状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.SaveCdsqScratchesResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.cdsq.scratches.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_car_vin(
        self,
        request: intellicar_models.QueryCarVinRequest,
    ) -> intellicar_models.QueryCarVinResponse:
        """
        Description: 常岳车贷线索预判接口
        Summary: 常岳车贷线索预判接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_car_vin_ex(request, headers, runtime)

    async def query_car_vin_async(
        self,
        request: intellicar_models.QueryCarVinRequest,
    ) -> intellicar_models.QueryCarVinResponse:
        """
        Description: 常岳车贷线索预判接口
        Summary: 常岳车贷线索预判接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_car_vin_ex_async(request, headers, runtime)

    def query_car_vin_ex(
        self,
        request: intellicar_models.QueryCarVinRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryCarVinResponse:
        """
        Description: 常岳车贷线索预判接口
        Summary: 常岳车贷线索预判接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryCarVinResponse(),
            self.do_request('1.0', 'antdigital.intellicar.car.vin.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_car_vin_ex_async(
        self,
        request: intellicar_models.QueryCarVinRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryCarVinResponse:
        """
        Description: 常岳车贷线索预判接口
        Summary: 常岳车贷线索预判接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryCarVinResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.car.vin.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_tag_changan(
        self,
        request: intellicar_models.RegisterTagChanganRequest,
    ) -> intellicar_models.RegisterTagChanganResponse:
        """
        Description: 长安画像标签授权接口
        Summary: 长安画像标签授权接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_tag_changan_ex(request, headers, runtime)

    async def register_tag_changan_async(
        self,
        request: intellicar_models.RegisterTagChanganRequest,
    ) -> intellicar_models.RegisterTagChanganResponse:
        """
        Description: 长安画像标签授权接口
        Summary: 长安画像标签授权接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_tag_changan_ex_async(request, headers, runtime)

    def register_tag_changan_ex(
        self,
        request: intellicar_models.RegisterTagChanganRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.RegisterTagChanganResponse:
        """
        Description: 长安画像标签授权接口
        Summary: 长安画像标签授权接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.RegisterTagChanganResponse(),
            self.do_request('1.0', 'antdigital.intellicar.tag.changan.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_tag_changan_ex_async(
        self,
        request: intellicar_models.RegisterTagChanganRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.RegisterTagChanganResponse:
        """
        Description: 长安画像标签授权接口
        Summary: 长安画像标签授权接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.RegisterTagChanganResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.tag.changan.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_tag_changan(
        self,
        request: intellicar_models.QueryTagChanganRequest,
    ) -> intellicar_models.QueryTagChanganResponse:
        """
        Description: 长安画像标签用户id标签查询1
        Summary: 长安画像标签用户id标签查询1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_tag_changan_ex(request, headers, runtime)

    async def query_tag_changan_async(
        self,
        request: intellicar_models.QueryTagChanganRequest,
    ) -> intellicar_models.QueryTagChanganResponse:
        """
        Description: 长安画像标签用户id标签查询1
        Summary: 长安画像标签用户id标签查询1
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_tag_changan_ex_async(request, headers, runtime)

    def query_tag_changan_ex(
        self,
        request: intellicar_models.QueryTagChanganRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryTagChanganResponse:
        """
        Description: 长安画像标签用户id标签查询1
        Summary: 长安画像标签用户id标签查询1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryTagChanganResponse(),
            self.do_request('1.0', 'antdigital.intellicar.tag.changan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_tag_changan_ex_async(
        self,
        request: intellicar_models.QueryTagChanganRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryTagChanganResponse:
        """
        Description: 长安画像标签用户id标签查询1
        Summary: 长安画像标签用户id标签查询1
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryTagChanganResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.tag.changan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_usedcar_area(
        self,
        request: intellicar_models.QueryUsedcarAreaRequest,
    ) -> intellicar_models.QueryUsedcarAreaResponse:
        """
        Description: 汽车之家区域接口
        Summary: 汽车之家区域接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_usedcar_area_ex(request, headers, runtime)

    async def query_usedcar_area_async(
        self,
        request: intellicar_models.QueryUsedcarAreaRequest,
    ) -> intellicar_models.QueryUsedcarAreaResponse:
        """
        Description: 汽车之家区域接口
        Summary: 汽车之家区域接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_usedcar_area_ex_async(request, headers, runtime)

    def query_usedcar_area_ex(
        self,
        request: intellicar_models.QueryUsedcarAreaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryUsedcarAreaResponse:
        """
        Description: 汽车之家区域接口
        Summary: 汽车之家区域接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryUsedcarAreaResponse(),
            self.do_request('1.0', 'antdigital.intellicar.usedcar.area.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_usedcar_area_ex_async(
        self,
        request: intellicar_models.QueryUsedcarAreaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryUsedcarAreaResponse:
        """
        Description: 汽车之家区域接口
        Summary: 汽车之家区域接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryUsedcarAreaResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.usedcar.area.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_usedcar_brands(
        self,
        request: intellicar_models.QueryUsedcarBrandsRequest,
    ) -> intellicar_models.QueryUsedcarBrandsResponse:
        """
        Description: 获取汽车之家品牌信息
        Summary: 获取汽车之家品牌信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_usedcar_brands_ex(request, headers, runtime)

    async def query_usedcar_brands_async(
        self,
        request: intellicar_models.QueryUsedcarBrandsRequest,
    ) -> intellicar_models.QueryUsedcarBrandsResponse:
        """
        Description: 获取汽车之家品牌信息
        Summary: 获取汽车之家品牌信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_usedcar_brands_ex_async(request, headers, runtime)

    def query_usedcar_brands_ex(
        self,
        request: intellicar_models.QueryUsedcarBrandsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryUsedcarBrandsResponse:
        """
        Description: 获取汽车之家品牌信息
        Summary: 获取汽车之家品牌信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryUsedcarBrandsResponse(),
            self.do_request('1.0', 'antdigital.intellicar.usedcar.brands.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_usedcar_brands_ex_async(
        self,
        request: intellicar_models.QueryUsedcarBrandsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryUsedcarBrandsResponse:
        """
        Description: 获取汽车之家品牌信息
        Summary: 获取汽车之家品牌信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryUsedcarBrandsResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.usedcar.brands.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_usedcar_series(
        self,
        request: intellicar_models.QueryUsedcarSeriesRequest,
    ) -> intellicar_models.QueryUsedcarSeriesResponse:
        """
        Description: 汽车之家车系接口
        Summary: 汽车之家车系接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_usedcar_series_ex(request, headers, runtime)

    async def query_usedcar_series_async(
        self,
        request: intellicar_models.QueryUsedcarSeriesRequest,
    ) -> intellicar_models.QueryUsedcarSeriesResponse:
        """
        Description: 汽车之家车系接口
        Summary: 汽车之家车系接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_usedcar_series_ex_async(request, headers, runtime)

    def query_usedcar_series_ex(
        self,
        request: intellicar_models.QueryUsedcarSeriesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryUsedcarSeriesResponse:
        """
        Description: 汽车之家车系接口
        Summary: 汽车之家车系接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryUsedcarSeriesResponse(),
            self.do_request('1.0', 'antdigital.intellicar.usedcar.series.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_usedcar_series_ex_async(
        self,
        request: intellicar_models.QueryUsedcarSeriesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryUsedcarSeriesResponse:
        """
        Description: 汽车之家车系接口
        Summary: 汽车之家车系接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryUsedcarSeriesResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.usedcar.series.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_usedcar_products(
        self,
        request: intellicar_models.QueryUsedcarProductsRequest,
    ) -> intellicar_models.QueryUsedcarProductsResponse:
        """
        Description: 汽车之家车型接口
        Summary: 汽车之家车型接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_usedcar_products_ex(request, headers, runtime)

    async def query_usedcar_products_async(
        self,
        request: intellicar_models.QueryUsedcarProductsRequest,
    ) -> intellicar_models.QueryUsedcarProductsResponse:
        """
        Description: 汽车之家车型接口
        Summary: 汽车之家车型接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_usedcar_products_ex_async(request, headers, runtime)

    def query_usedcar_products_ex(
        self,
        request: intellicar_models.QueryUsedcarProductsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryUsedcarProductsResponse:
        """
        Description: 汽车之家车型接口
        Summary: 汽车之家车型接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryUsedcarProductsResponse(),
            self.do_request('1.0', 'antdigital.intellicar.usedcar.products.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_usedcar_products_ex_async(
        self,
        request: intellicar_models.QueryUsedcarProductsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryUsedcarProductsResponse:
        """
        Description: 汽车之家车型接口
        Summary: 汽车之家车型接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryUsedcarProductsResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.usedcar.products.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_usedcar(
        self,
        request: intellicar_models.SyncUsedcarRequest,
    ) -> intellicar_models.SyncUsedcarResponse:
        """
        Description: 获取二手车线索状态
        Summary: 获取二手车线索状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_usedcar_ex(request, headers, runtime)

    async def sync_usedcar_async(
        self,
        request: intellicar_models.SyncUsedcarRequest,
    ) -> intellicar_models.SyncUsedcarResponse:
        """
        Description: 获取二手车线索状态
        Summary: 获取二手车线索状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_usedcar_ex_async(request, headers, runtime)

    def sync_usedcar_ex(
        self,
        request: intellicar_models.SyncUsedcarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.SyncUsedcarResponse:
        """
        Description: 获取二手车线索状态
        Summary: 获取二手车线索状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.SyncUsedcarResponse(),
            self.do_request('1.0', 'antdigital.intellicar.usedcar.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_usedcar_ex_async(
        self,
        request: intellicar_models.SyncUsedcarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.SyncUsedcarResponse:
        """
        Description: 获取二手车线索状态
        Summary: 获取二手车线索状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.SyncUsedcarResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.usedcar.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_cdsq_tireinsurance(
        self,
        request: intellicar_models.RegisterCdsqTireinsuranceRequest,
    ) -> intellicar_models.RegisterCdsqTireinsuranceResponse:
        """
        Description: 轮胎投保接口
        Summary: 轮胎投保接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_cdsq_tireinsurance_ex(request, headers, runtime)

    async def register_cdsq_tireinsurance_async(
        self,
        request: intellicar_models.RegisterCdsqTireinsuranceRequest,
    ) -> intellicar_models.RegisterCdsqTireinsuranceResponse:
        """
        Description: 轮胎投保接口
        Summary: 轮胎投保接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_cdsq_tireinsurance_ex_async(request, headers, runtime)

    def register_cdsq_tireinsurance_ex(
        self,
        request: intellicar_models.RegisterCdsqTireinsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.RegisterCdsqTireinsuranceResponse:
        """
        Description: 轮胎投保接口
        Summary: 轮胎投保接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.RegisterCdsqTireinsuranceResponse(),
            self.do_request('1.0', 'antdigital.intellicar.cdsq.tireinsurance.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_cdsq_tireinsurance_ex_async(
        self,
        request: intellicar_models.RegisterCdsqTireinsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.RegisterCdsqTireinsuranceResponse:
        """
        Description: 轮胎投保接口
        Summary: 轮胎投保接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.RegisterCdsqTireinsuranceResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.cdsq.tireinsurance.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_cdsq_tireinsurance(
        self,
        request: intellicar_models.CallbackCdsqTireinsuranceRequest,
    ) -> intellicar_models.CallbackCdsqTireinsuranceResponse:
        """
        Description: 轮胎回调接口
        Summary: 轮胎回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_cdsq_tireinsurance_ex(request, headers, runtime)

    async def callback_cdsq_tireinsurance_async(
        self,
        request: intellicar_models.CallbackCdsqTireinsuranceRequest,
    ) -> intellicar_models.CallbackCdsqTireinsuranceResponse:
        """
        Description: 轮胎回调接口
        Summary: 轮胎回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_cdsq_tireinsurance_ex_async(request, headers, runtime)

    def callback_cdsq_tireinsurance_ex(
        self,
        request: intellicar_models.CallbackCdsqTireinsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.CallbackCdsqTireinsuranceResponse:
        """
        Description: 轮胎回调接口
        Summary: 轮胎回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.CallbackCdsqTireinsuranceResponse(),
            self.do_request('1.0', 'antdigital.intellicar.cdsq.tireinsurance.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_cdsq_tireinsurance_ex_async(
        self,
        request: intellicar_models.CallbackCdsqTireinsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.CallbackCdsqTireinsuranceResponse:
        """
        Description: 轮胎回调接口
        Summary: 轮胎回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.CallbackCdsqTireinsuranceResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.cdsq.tireinsurance.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cdsq_tireinsurance(
        self,
        request: intellicar_models.QueryCdsqTireinsuranceRequest,
    ) -> intellicar_models.QueryCdsqTireinsuranceResponse:
        """
        Description: 轮胎权益接口查询状态
        Summary: 轮胎权益接口查询状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cdsq_tireinsurance_ex(request, headers, runtime)

    async def query_cdsq_tireinsurance_async(
        self,
        request: intellicar_models.QueryCdsqTireinsuranceRequest,
    ) -> intellicar_models.QueryCdsqTireinsuranceResponse:
        """
        Description: 轮胎权益接口查询状态
        Summary: 轮胎权益接口查询状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cdsq_tireinsurance_ex_async(request, headers, runtime)

    def query_cdsq_tireinsurance_ex(
        self,
        request: intellicar_models.QueryCdsqTireinsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryCdsqTireinsuranceResponse:
        """
        Description: 轮胎权益接口查询状态
        Summary: 轮胎权益接口查询状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryCdsqTireinsuranceResponse(),
            self.do_request('1.0', 'antdigital.intellicar.cdsq.tireinsurance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cdsq_tireinsurance_ex_async(
        self,
        request: intellicar_models.QueryCdsqTireinsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.QueryCdsqTireinsuranceResponse:
        """
        Description: 轮胎权益接口查询状态
        Summary: 轮胎权益接口查询状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.QueryCdsqTireinsuranceResponse(),
            await self.do_request_async('1.0', 'antdigital.intellicar.cdsq.tireinsurance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: intellicar_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> intellicar_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: intellicar_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> intellicar_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: intellicar_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: intellicar_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> intellicar_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            intellicar_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
