# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_mycharity import models as mycharity_models
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
        config: mycharity_models.Config,
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
            # 批次详情
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
                    'sdk_version': '1.0.16',
                    '_prod_code': 'MYCHARITY',
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
            # 批次详情
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
                    'sdk_version': '1.0.16',
                    '_prod_code': 'MYCHARITY',
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

    def create_alipaysign(
        self,
        request: mycharity_models.CreateAlipaysignRequest,
    ) -> mycharity_models.CreateAlipaysignResponse:
        """
        Description: 待签约账号创建
        Summary: 待签约账号创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_alipaysign_ex(request, headers, runtime)

    async def create_alipaysign_async(
        self,
        request: mycharity_models.CreateAlipaysignRequest,
    ) -> mycharity_models.CreateAlipaysignResponse:
        """
        Description: 待签约账号创建
        Summary: 待签约账号创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_alipaysign_ex_async(request, headers, runtime)

    def create_alipaysign_ex(
        self,
        request: mycharity_models.CreateAlipaysignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.CreateAlipaysignResponse:
        """
        Description: 待签约账号创建
        Summary: 待签约账号创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.CreateAlipaysignResponse(),
            self.do_request('1.0', 'antchain.mycharity.alipaysign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_alipaysign_ex_async(
        self,
        request: mycharity_models.CreateAlipaysignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.CreateAlipaysignResponse:
        """
        Description: 待签约账号创建
        Summary: 待签约账号创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.CreateAlipaysignResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.alipaysign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_alipaysign_state(
        self,
        request: mycharity_models.QueryAlipaysignStateRequest,
    ) -> mycharity_models.QueryAlipaysignStateResponse:
        """
        Description: 机构下代扣账号签约状态查询
        Summary: 机构下代扣账号签约状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_alipaysign_state_ex(request, headers, runtime)

    async def query_alipaysign_state_async(
        self,
        request: mycharity_models.QueryAlipaysignStateRequest,
    ) -> mycharity_models.QueryAlipaysignStateResponse:
        """
        Description: 机构下代扣账号签约状态查询
        Summary: 机构下代扣账号签约状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_alipaysign_state_ex_async(request, headers, runtime)

    def query_alipaysign_state_ex(
        self,
        request: mycharity_models.QueryAlipaysignStateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.QueryAlipaysignStateResponse:
        """
        Description: 机构下代扣账号签约状态查询
        Summary: 机构下代扣账号签约状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.QueryAlipaysignStateResponse(),
            self.do_request('1.0', 'antchain.mycharity.alipaysign.state.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_alipaysign_state_ex_async(
        self,
        request: mycharity_models.QueryAlipaysignStateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.QueryAlipaysignStateResponse:
        """
        Description: 机构下代扣账号签约状态查询
        Summary: 机构下代扣账号签约状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.QueryAlipaysignStateResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.alipaysign.state.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_alipaysign_qrcode(
        self,
        request: mycharity_models.QueryAlipaysignQrcodeRequest,
    ) -> mycharity_models.QueryAlipaysignQrcodeResponse:
        """
        Description: 账号签约二维码获取
        Summary: 账号签约二维码获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_alipaysign_qrcode_ex(request, headers, runtime)

    async def query_alipaysign_qrcode_async(
        self,
        request: mycharity_models.QueryAlipaysignQrcodeRequest,
    ) -> mycharity_models.QueryAlipaysignQrcodeResponse:
        """
        Description: 账号签约二维码获取
        Summary: 账号签约二维码获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_alipaysign_qrcode_ex_async(request, headers, runtime)

    def query_alipaysign_qrcode_ex(
        self,
        request: mycharity_models.QueryAlipaysignQrcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.QueryAlipaysignQrcodeResponse:
        """
        Description: 账号签约二维码获取
        Summary: 账号签约二维码获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.QueryAlipaysignQrcodeResponse(),
            self.do_request('1.0', 'antchain.mycharity.alipaysign.qrcode.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_alipaysign_qrcode_ex_async(
        self,
        request: mycharity_models.QueryAlipaysignQrcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.QueryAlipaysignQrcodeResponse:
        """
        Description: 账号签约二维码获取
        Summary: 账号签约二维码获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.QueryAlipaysignQrcodeResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.alipaysign.qrcode.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_person_permission(
        self,
        request: mycharity_models.CreatePersonPermissionRequest,
    ) -> mycharity_models.CreatePersonPermissionResponse:
        """
        Description: 创建人员并配置权限。如人员已经存在，则不创建。
        Summary: 创建人员及配置权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_person_permission_ex(request, headers, runtime)

    async def create_person_permission_async(
        self,
        request: mycharity_models.CreatePersonPermissionRequest,
    ) -> mycharity_models.CreatePersonPermissionResponse:
        """
        Description: 创建人员并配置权限。如人员已经存在，则不创建。
        Summary: 创建人员及配置权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_person_permission_ex_async(request, headers, runtime)

    def create_person_permission_ex(
        self,
        request: mycharity_models.CreatePersonPermissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.CreatePersonPermissionResponse:
        """
        Description: 创建人员并配置权限。如人员已经存在，则不创建。
        Summary: 创建人员及配置权限
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.CreatePersonPermissionResponse(),
            self.do_request('1.0', 'antchain.mycharity.person.permission.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_person_permission_ex_async(
        self,
        request: mycharity_models.CreatePersonPermissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.CreatePersonPermissionResponse:
        """
        Description: 创建人员并配置权限。如人员已经存在，则不创建。
        Summary: 创建人员及配置权限
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.CreatePersonPermissionResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.person.permission.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_person(
        self,
        request: mycharity_models.DeletePersonRequest,
    ) -> mycharity_models.DeletePersonResponse:
        """
        Description: 允许已授权的用户通过此接口删除人员权限。
        Summary: 配置权限删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_person_ex(request, headers, runtime)

    async def delete_person_async(
        self,
        request: mycharity_models.DeletePersonRequest,
    ) -> mycharity_models.DeletePersonResponse:
        """
        Description: 允许已授权的用户通过此接口删除人员权限。
        Summary: 配置权限删除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_person_ex_async(request, headers, runtime)

    def delete_person_ex(
        self,
        request: mycharity_models.DeletePersonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.DeletePersonResponse:
        """
        Description: 允许已授权的用户通过此接口删除人员权限。
        Summary: 配置权限删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.DeletePersonResponse(),
            self.do_request('1.0', 'antchain.mycharity.person.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_person_ex_async(
        self,
        request: mycharity_models.DeletePersonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.DeletePersonResponse:
        """
        Description: 允许已授权的用户通过此接口删除人员权限。
        Summary: 配置权限删除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.DeletePersonResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.person.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_batch(
        self,
        request: mycharity_models.InitBatchRequest,
    ) -> mycharity_models.InitBatchResponse:
        """
        Description: 创建批次
        Summary: 创建批次
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_batch_ex(request, headers, runtime)

    async def init_batch_async(
        self,
        request: mycharity_models.InitBatchRequest,
    ) -> mycharity_models.InitBatchResponse:
        """
        Description: 创建批次
        Summary: 创建批次
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_batch_ex_async(request, headers, runtime)

    def init_batch_ex(
        self,
        request: mycharity_models.InitBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.InitBatchResponse:
        """
        Description: 创建批次
        Summary: 创建批次
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.InitBatchResponse(),
            self.do_request('1.0', 'antchain.mycharity.batch.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_batch_ex_async(
        self,
        request: mycharity_models.InitBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.InitBatchResponse:
        """
        Description: 创建批次
        Summary: 创建批次
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.InitBatchResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.batch.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_batch(
        self,
        request: mycharity_models.UpdateBatchRequest,
    ) -> mycharity_models.UpdateBatchResponse:
        """
        Description: 修改批次状态
        Summary: 修改批次状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_batch_ex(request, headers, runtime)

    async def update_batch_async(
        self,
        request: mycharity_models.UpdateBatchRequest,
    ) -> mycharity_models.UpdateBatchResponse:
        """
        Description: 修改批次状态
        Summary: 修改批次状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_batch_ex_async(request, headers, runtime)

    def update_batch_ex(
        self,
        request: mycharity_models.UpdateBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.UpdateBatchResponse:
        """
        Description: 修改批次状态
        Summary: 修改批次状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.UpdateBatchResponse(),
            self.do_request('1.0', 'antchain.mycharity.batch.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_batch_ex_async(
        self,
        request: mycharity_models.UpdateBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.UpdateBatchResponse:
        """
        Description: 修改批次状态
        Summary: 修改批次状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.UpdateBatchResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.batch.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_batch(
        self,
        request: mycharity_models.DeleteBatchRequest,
    ) -> mycharity_models.DeleteBatchResponse:
        """
        Description: 删除批次
        Summary: 删除批次
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_batch_ex(request, headers, runtime)

    async def delete_batch_async(
        self,
        request: mycharity_models.DeleteBatchRequest,
    ) -> mycharity_models.DeleteBatchResponse:
        """
        Description: 删除批次
        Summary: 删除批次
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_batch_ex_async(request, headers, runtime)

    def delete_batch_ex(
        self,
        request: mycharity_models.DeleteBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.DeleteBatchResponse:
        """
        Description: 删除批次
        Summary: 删除批次
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.DeleteBatchResponse(),
            self.do_request('1.0', 'antchain.mycharity.batch.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_batch_ex_async(
        self,
        request: mycharity_models.DeleteBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.DeleteBatchResponse:
        """
        Description: 删除批次
        Summary: 删除批次
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.DeleteBatchResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.batch.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_stages(
        self,
        request: mycharity_models.CreateStagesRequest,
    ) -> mycharity_models.CreateStagesResponse:
        """
        Description: 创建项目分期
        Summary: 创建分期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_stages_ex(request, headers, runtime)

    async def create_stages_async(
        self,
        request: mycharity_models.CreateStagesRequest,
    ) -> mycharity_models.CreateStagesResponse:
        """
        Description: 创建项目分期
        Summary: 创建分期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_stages_ex_async(request, headers, runtime)

    def create_stages_ex(
        self,
        request: mycharity_models.CreateStagesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.CreateStagesResponse:
        """
        Description: 创建项目分期
        Summary: 创建分期
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.CreateStagesResponse(),
            self.do_request('1.0', 'antchain.mycharity.stages.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_stages_ex_async(
        self,
        request: mycharity_models.CreateStagesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.CreateStagesResponse:
        """
        Description: 创建项目分期
        Summary: 创建分期
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.CreateStagesResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.stages.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_batch(
        self,
        request: mycharity_models.QueryBatchRequest,
    ) -> mycharity_models.QueryBatchResponse:
        """
        Description: 查询批次
        Summary: 查询批次
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_batch_ex(request, headers, runtime)

    async def query_batch_async(
        self,
        request: mycharity_models.QueryBatchRequest,
    ) -> mycharity_models.QueryBatchResponse:
        """
        Description: 查询批次
        Summary: 查询批次
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_batch_ex_async(request, headers, runtime)

    def query_batch_ex(
        self,
        request: mycharity_models.QueryBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.QueryBatchResponse:
        """
        Description: 查询批次
        Summary: 查询批次
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.QueryBatchResponse(),
            self.do_request('1.0', 'antchain.mycharity.batch.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_batch_ex_async(
        self,
        request: mycharity_models.QueryBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.QueryBatchResponse:
        """
        Description: 查询批次
        Summary: 查询批次
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.QueryBatchResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.batch.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_stages(
        self,
        request: mycharity_models.UpdateStagesRequest,
    ) -> mycharity_models.UpdateStagesResponse:
        """
        Description: 更新项目分期
        Summary: 更新分期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_stages_ex(request, headers, runtime)

    async def update_stages_async(
        self,
        request: mycharity_models.UpdateStagesRequest,
    ) -> mycharity_models.UpdateStagesResponse:
        """
        Description: 更新项目分期
        Summary: 更新分期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_stages_ex_async(request, headers, runtime)

    def update_stages_ex(
        self,
        request: mycharity_models.UpdateStagesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.UpdateStagesResponse:
        """
        Description: 更新项目分期
        Summary: 更新分期
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.UpdateStagesResponse(),
            self.do_request('1.0', 'antchain.mycharity.stages.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_stages_ex_async(
        self,
        request: mycharity_models.UpdateStagesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.UpdateStagesResponse:
        """
        Description: 更新项目分期
        Summary: 更新分期
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.UpdateStagesResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.stages.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_org(
        self,
        request: mycharity_models.CreateOrgRequest,
    ) -> mycharity_models.CreateOrgResponse:
        """
        Description: 创建机构
        Summary: 创建机构
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_org_ex(request, headers, runtime)

    async def create_org_async(
        self,
        request: mycharity_models.CreateOrgRequest,
    ) -> mycharity_models.CreateOrgResponse:
        """
        Description: 创建机构
        Summary: 创建机构
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_org_ex_async(request, headers, runtime)

    def create_org_ex(
        self,
        request: mycharity_models.CreateOrgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.CreateOrgResponse:
        """
        Description: 创建机构
        Summary: 创建机构
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.CreateOrgResponse(),
            self.do_request('1.0', 'antchain.mycharity.org.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_org_ex_async(
        self,
        request: mycharity_models.CreateOrgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.CreateOrgResponse:
        """
        Description: 创建机构
        Summary: 创建机构
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.CreateOrgResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.org.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_stages(
        self,
        request: mycharity_models.QueryStagesRequest,
    ) -> mycharity_models.QueryStagesResponse:
        """
        Description: 查询分期
        Summary: 查询分期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_stages_ex(request, headers, runtime)

    async def query_stages_async(
        self,
        request: mycharity_models.QueryStagesRequest,
    ) -> mycharity_models.QueryStagesResponse:
        """
        Description: 查询分期
        Summary: 查询分期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_stages_ex_async(request, headers, runtime)

    def query_stages_ex(
        self,
        request: mycharity_models.QueryStagesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.QueryStagesResponse:
        """
        Description: 查询分期
        Summary: 查询分期
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.QueryStagesResponse(),
            self.do_request('1.0', 'antchain.mycharity.stages.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_stages_ex_async(
        self,
        request: mycharity_models.QueryStagesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.QueryStagesResponse:
        """
        Description: 查询分期
        Summary: 查询分期
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.QueryStagesResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.stages.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_org(
        self,
        request: mycharity_models.UpdateOrgRequest,
    ) -> mycharity_models.UpdateOrgResponse:
        """
        Description: 更新机构
        Summary: 更新机构
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_org_ex(request, headers, runtime)

    async def update_org_async(
        self,
        request: mycharity_models.UpdateOrgRequest,
    ) -> mycharity_models.UpdateOrgResponse:
        """
        Description: 更新机构
        Summary: 更新机构
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_org_ex_async(request, headers, runtime)

    def update_org_ex(
        self,
        request: mycharity_models.UpdateOrgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.UpdateOrgResponse:
        """
        Description: 更新机构
        Summary: 更新机构
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.UpdateOrgResponse(),
            self.do_request('1.0', 'antchain.mycharity.org.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_org_ex_async(
        self,
        request: mycharity_models.UpdateOrgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.UpdateOrgResponse:
        """
        Description: 更新机构
        Summary: 更新机构
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.UpdateOrgResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.org.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_combination(
        self,
        request: mycharity_models.CreateCombinationRequest,
    ) -> mycharity_models.CreateCombinationResponse:
        """
        Description: 创建实施内容
        Summary: 创建实施内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_combination_ex(request, headers, runtime)

    async def create_combination_async(
        self,
        request: mycharity_models.CreateCombinationRequest,
    ) -> mycharity_models.CreateCombinationResponse:
        """
        Description: 创建实施内容
        Summary: 创建实施内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_combination_ex_async(request, headers, runtime)

    def create_combination_ex(
        self,
        request: mycharity_models.CreateCombinationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.CreateCombinationResponse:
        """
        Description: 创建实施内容
        Summary: 创建实施内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.CreateCombinationResponse(),
            self.do_request('1.0', 'antchain.mycharity.combination.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_combination_ex_async(
        self,
        request: mycharity_models.CreateCombinationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.CreateCombinationResponse:
        """
        Description: 创建实施内容
        Summary: 创建实施内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.CreateCombinationResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.combination.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_org(
        self,
        request: mycharity_models.DetailOrgRequest,
    ) -> mycharity_models.DetailOrgResponse:
        """
        Description: 机构详情
        Summary: 机构详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_org_ex(request, headers, runtime)

    async def detail_org_async(
        self,
        request: mycharity_models.DetailOrgRequest,
    ) -> mycharity_models.DetailOrgResponse:
        """
        Description: 机构详情
        Summary: 机构详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_org_ex_async(request, headers, runtime)

    def detail_org_ex(
        self,
        request: mycharity_models.DetailOrgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.DetailOrgResponse:
        """
        Description: 机构详情
        Summary: 机构详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.DetailOrgResponse(),
            self.do_request('1.0', 'antchain.mycharity.org.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_org_ex_async(
        self,
        request: mycharity_models.DetailOrgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.DetailOrgResponse:
        """
        Description: 机构详情
        Summary: 机构详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.DetailOrgResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.org.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_combination(
        self,
        request: mycharity_models.UpdateCombinationRequest,
    ) -> mycharity_models.UpdateCombinationResponse:
        """
        Description: 修改实施内容
        Summary: 修改实施内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_combination_ex(request, headers, runtime)

    async def update_combination_async(
        self,
        request: mycharity_models.UpdateCombinationRequest,
    ) -> mycharity_models.UpdateCombinationResponse:
        """
        Description: 修改实施内容
        Summary: 修改实施内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_combination_ex_async(request, headers, runtime)

    def update_combination_ex(
        self,
        request: mycharity_models.UpdateCombinationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.UpdateCombinationResponse:
        """
        Description: 修改实施内容
        Summary: 修改实施内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.UpdateCombinationResponse(),
            self.do_request('1.0', 'antchain.mycharity.combination.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_combination_ex_async(
        self,
        request: mycharity_models.UpdateCombinationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.UpdateCombinationResponse:
        """
        Description: 修改实施内容
        Summary: 修改实施内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.UpdateCombinationResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.combination.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_project(
        self,
        request: mycharity_models.CreateProjectRequest,
    ) -> mycharity_models.CreateProjectResponse:
        """
        Description: 创建项目
        Summary: 创建项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_project_ex(request, headers, runtime)

    async def create_project_async(
        self,
        request: mycharity_models.CreateProjectRequest,
    ) -> mycharity_models.CreateProjectResponse:
        """
        Description: 创建项目
        Summary: 创建项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_project_ex_async(request, headers, runtime)

    def create_project_ex(
        self,
        request: mycharity_models.CreateProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.CreateProjectResponse:
        """
        Description: 创建项目
        Summary: 创建项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.CreateProjectResponse(),
            self.do_request('1.0', 'antchain.mycharity.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_project_ex_async(
        self,
        request: mycharity_models.CreateProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.CreateProjectResponse:
        """
        Description: 创建项目
        Summary: 创建项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.CreateProjectResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_project(
        self,
        request: mycharity_models.UpdateProjectRequest,
    ) -> mycharity_models.UpdateProjectResponse:
        """
        Description: 更新项目
        Summary: 更新项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_project_ex(request, headers, runtime)

    async def update_project_async(
        self,
        request: mycharity_models.UpdateProjectRequest,
    ) -> mycharity_models.UpdateProjectResponse:
        """
        Description: 更新项目
        Summary: 更新项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_project_ex_async(request, headers, runtime)

    def update_project_ex(
        self,
        request: mycharity_models.UpdateProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.UpdateProjectResponse:
        """
        Description: 更新项目
        Summary: 更新项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.UpdateProjectResponse(),
            self.do_request('1.0', 'antchain.mycharity.project.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_project_ex_async(
        self,
        request: mycharity_models.UpdateProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.UpdateProjectResponse:
        """
        Description: 更新项目
        Summary: 更新项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.UpdateProjectResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.project.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_project(
        self,
        request: mycharity_models.DetailProjectRequest,
    ) -> mycharity_models.DetailProjectResponse:
        """
        Description: 项目详情
        Summary: 项目详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_project_ex(request, headers, runtime)

    async def detail_project_async(
        self,
        request: mycharity_models.DetailProjectRequest,
    ) -> mycharity_models.DetailProjectResponse:
        """
        Description: 项目详情
        Summary: 项目详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_project_ex_async(request, headers, runtime)

    def detail_project_ex(
        self,
        request: mycharity_models.DetailProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.DetailProjectResponse:
        """
        Description: 项目详情
        Summary: 项目详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.DetailProjectResponse(),
            self.do_request('1.0', 'antchain.mycharity.project.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_project_ex_async(
        self,
        request: mycharity_models.DetailProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.DetailProjectResponse:
        """
        Description: 项目详情
        Summary: 项目详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.DetailProjectResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.project.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_combination(
        self,
        request: mycharity_models.QueryCombinationRequest,
    ) -> mycharity_models.QueryCombinationResponse:
        """
        Description: 查询实施内容
        Summary: 查询实施内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_combination_ex(request, headers, runtime)

    async def query_combination_async(
        self,
        request: mycharity_models.QueryCombinationRequest,
    ) -> mycharity_models.QueryCombinationResponse:
        """
        Description: 查询实施内容
        Summary: 查询实施内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_combination_ex_async(request, headers, runtime)

    def query_combination_ex(
        self,
        request: mycharity_models.QueryCombinationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.QueryCombinationResponse:
        """
        Description: 查询实施内容
        Summary: 查询实施内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.QueryCombinationResponse(),
            self.do_request('1.0', 'antchain.mycharity.combination.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_combination_ex_async(
        self,
        request: mycharity_models.QueryCombinationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.QueryCombinationResponse:
        """
        Description: 查询实施内容
        Summary: 查询实施内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.QueryCombinationResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.combination.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_record(
        self,
        request: mycharity_models.BatchcreateRecordRequest,
    ) -> mycharity_models.BatchcreateRecordResponse:
        """
        Description: 批量创建执行记录
        Summary: 批量创建执行记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_record_ex(request, headers, runtime)

    async def batchcreate_record_async(
        self,
        request: mycharity_models.BatchcreateRecordRequest,
    ) -> mycharity_models.BatchcreateRecordResponse:
        """
        Description: 批量创建执行记录
        Summary: 批量创建执行记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_record_ex_async(request, headers, runtime)

    def batchcreate_record_ex(
        self,
        request: mycharity_models.BatchcreateRecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.BatchcreateRecordResponse:
        """
        Description: 批量创建执行记录
        Summary: 批量创建执行记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.BatchcreateRecordResponse(),
            self.do_request('1.0', 'antchain.mycharity.record.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_record_ex_async(
        self,
        request: mycharity_models.BatchcreateRecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.BatchcreateRecordResponse:
        """
        Description: 批量创建执行记录
        Summary: 批量创建执行记录
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.BatchcreateRecordResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.record.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_batch(
        self,
        request: mycharity_models.CreateBatchRequest,
    ) -> mycharity_models.CreateBatchResponse:
        """
        Description: 创建批次
        Summary: 创建批次
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_batch_ex(request, headers, runtime)

    async def create_batch_async(
        self,
        request: mycharity_models.CreateBatchRequest,
    ) -> mycharity_models.CreateBatchResponse:
        """
        Description: 创建批次
        Summary: 创建批次
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_batch_ex_async(request, headers, runtime)

    def create_batch_ex(
        self,
        request: mycharity_models.CreateBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.CreateBatchResponse:
        """
        Description: 创建批次
        Summary: 创建批次
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.CreateBatchResponse(),
            self.do_request('1.0', 'antchain.mycharity.batch.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_batch_ex_async(
        self,
        request: mycharity_models.CreateBatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.CreateBatchResponse:
        """
        Description: 创建批次
        Summary: 创建批次
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.CreateBatchResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.batch.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_record(
        self,
        request: mycharity_models.UpdateRecordRequest,
    ) -> mycharity_models.UpdateRecordResponse:
        """
        Description: 修改执行记录状态
        Summary: 修改执行记录状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_record_ex(request, headers, runtime)

    async def update_record_async(
        self,
        request: mycharity_models.UpdateRecordRequest,
    ) -> mycharity_models.UpdateRecordResponse:
        """
        Description: 修改执行记录状态
        Summary: 修改执行记录状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_record_ex_async(request, headers, runtime)

    def update_record_ex(
        self,
        request: mycharity_models.UpdateRecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.UpdateRecordResponse:
        """
        Description: 修改执行记录状态
        Summary: 修改执行记录状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.UpdateRecordResponse(),
            self.do_request('1.0', 'antchain.mycharity.record.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_record_ex_async(
        self,
        request: mycharity_models.UpdateRecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.UpdateRecordResponse:
        """
        Description: 修改执行记录状态
        Summary: 修改执行记录状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.UpdateRecordResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.record.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_combination(
        self,
        request: mycharity_models.BatchcreateCombinationRequest,
    ) -> mycharity_models.BatchcreateCombinationResponse:
        """
        Description: 批量创建、修改、删除实施内容
        Summary: 批量创建、修改、删除实施内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_combination_ex(request, headers, runtime)

    async def batchcreate_combination_async(
        self,
        request: mycharity_models.BatchcreateCombinationRequest,
    ) -> mycharity_models.BatchcreateCombinationResponse:
        """
        Description: 批量创建、修改、删除实施内容
        Summary: 批量创建、修改、删除实施内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_combination_ex_async(request, headers, runtime)

    def batchcreate_combination_ex(
        self,
        request: mycharity_models.BatchcreateCombinationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.BatchcreateCombinationResponse:
        """
        Description: 批量创建、修改、删除实施内容
        Summary: 批量创建、修改、删除实施内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.BatchcreateCombinationResponse(),
            self.do_request('1.0', 'antchain.mycharity.combination.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_combination_ex_async(
        self,
        request: mycharity_models.BatchcreateCombinationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.BatchcreateCombinationResponse:
        """
        Description: 批量创建、修改、删除实施内容
        Summary: 批量创建、修改、删除实施内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.BatchcreateCombinationResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.combination.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_alipaysign(
        self,
        request: mycharity_models.BatchcreateAlipaysignRequest,
    ) -> mycharity_models.BatchcreateAlipaysignResponse:
        """
        Description: 代扣签约账号批量创建接口
        Summary: 代扣签约账号批量创建接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_alipaysign_ex(request, headers, runtime)

    async def batchcreate_alipaysign_async(
        self,
        request: mycharity_models.BatchcreateAlipaysignRequest,
    ) -> mycharity_models.BatchcreateAlipaysignResponse:
        """
        Description: 代扣签约账号批量创建接口
        Summary: 代扣签约账号批量创建接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_alipaysign_ex_async(request, headers, runtime)

    def batchcreate_alipaysign_ex(
        self,
        request: mycharity_models.BatchcreateAlipaysignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.BatchcreateAlipaysignResponse:
        """
        Description: 代扣签约账号批量创建接口
        Summary: 代扣签约账号批量创建接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.BatchcreateAlipaysignResponse(),
            self.do_request('1.0', 'antchain.mycharity.alipaysign.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_alipaysign_ex_async(
        self,
        request: mycharity_models.BatchcreateAlipaysignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mycharity_models.BatchcreateAlipaysignResponse:
        """
        Description: 代扣签约账号批量创建接口
        Summary: 代扣签约账号批量创建接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            mycharity_models.BatchcreateAlipaysignResponse(),
            await self.do_request_async('1.0', 'antchain.mycharity.alipaysign.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
