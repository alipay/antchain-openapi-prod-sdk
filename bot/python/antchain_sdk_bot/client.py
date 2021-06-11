# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_bot import models as bot_models
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
        config: bot_models.Config,
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
            # 原始数据包
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
                    'sdk_version': '1.5.4'
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
            # 原始数据包
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
                    'sdk_version': '1.5.4'
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

    def query_iotplatform_purchaseorder(
        self,
        request: bot_models.QueryIotplatformPurchaseorderRequest,
    ) -> bot_models.QueryIotplatformPurchaseorderResponse:
        """
        Description: 根据设备串号查询采购设备
        Summary: 根据设备串号查询采购设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_iotplatform_purchaseorder_ex(request, headers, runtime)

    async def query_iotplatform_purchaseorder_async(
        self,
        request: bot_models.QueryIotplatformPurchaseorderRequest,
    ) -> bot_models.QueryIotplatformPurchaseorderResponse:
        """
        Description: 根据设备串号查询采购设备
        Summary: 根据设备串号查询采购设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_iotplatform_purchaseorder_ex_async(request, headers, runtime)

    def query_iotplatform_purchaseorder_ex(
        self,
        request: bot_models.QueryIotplatformPurchaseorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryIotplatformPurchaseorderResponse:
        """
        Description: 根据设备串号查询采购设备
        Summary: 根据设备串号查询采购设备
        """
        UtilClient.validate_model(request)
        return bot_models.QueryIotplatformPurchaseorderResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.iotplatform.purchaseorder.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_iotplatform_purchaseorder_ex_async(
        self,
        request: bot_models.QueryIotplatformPurchaseorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryIotplatformPurchaseorderResponse:
        """
        Description: 根据设备串号查询采购设备
        Summary: 根据设备串号查询采购设备
        """
        UtilClient.validate_model(request)
        return bot_models.QueryIotplatformPurchaseorderResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.iotplatform.purchaseorder.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_iotplatform_meshid(
        self,
        request: bot_models.ImportIotplatformMeshidRequest,
    ) -> bot_models.ImportIotplatformMeshidResponse:
        """
        Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
        Summary: 绑定MeshId及设备SN
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_iotplatform_meshid_ex(request, headers, runtime)

    async def import_iotplatform_meshid_async(
        self,
        request: bot_models.ImportIotplatformMeshidRequest,
    ) -> bot_models.ImportIotplatformMeshidResponse:
        """
        Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
        Summary: 绑定MeshId及设备SN
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_iotplatform_meshid_ex_async(request, headers, runtime)

    def import_iotplatform_meshid_ex(
        self,
        request: bot_models.ImportIotplatformMeshidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ImportIotplatformMeshidResponse:
        """
        Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
        Summary: 绑定MeshId及设备SN
        """
        UtilClient.validate_model(request)
        return bot_models.ImportIotplatformMeshidResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.iotplatform.meshid.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_iotplatform_meshid_ex_async(
        self,
        request: bot_models.ImportIotplatformMeshidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ImportIotplatformMeshidResponse:
        """
        Description: 设备租赁业务中在PC设备出厂时进行MeshId及SN号的关联绑定
        Summary: 绑定MeshId及设备SN
        """
        UtilClient.validate_model(request)
        return bot_models.ImportIotplatformMeshidResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.iotplatform.meshid.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_device_datamodel(
        self,
        request: bot_models.CreateDeviceDatamodelRequest,
    ) -> bot_models.CreateDeviceDatamodelResponse:
        """
        Description: 创建数据模型
        Summary: 创建数据模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_device_datamodel_ex(request, headers, runtime)

    async def create_device_datamodel_async(
        self,
        request: bot_models.CreateDeviceDatamodelRequest,
    ) -> bot_models.CreateDeviceDatamodelResponse:
        """
        Description: 创建数据模型
        Summary: 创建数据模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_device_datamodel_ex_async(request, headers, runtime)

    def create_device_datamodel_ex(
        self,
        request: bot_models.CreateDeviceDatamodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDeviceDatamodelResponse:
        """
        Description: 创建数据模型
        Summary: 创建数据模型
        """
        UtilClient.validate_model(request)
        return bot_models.CreateDeviceDatamodelResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.device.datamodel.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_device_datamodel_ex_async(
        self,
        request: bot_models.CreateDeviceDatamodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDeviceDatamodelResponse:
        """
        Description: 创建数据模型
        Summary: 创建数据模型
        """
        UtilClient.validate_model(request)
        return bot_models.CreateDeviceDatamodelResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.device.datamodel.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_device_datamodel(
        self,
        request: bot_models.GetDeviceDatamodelRequest,
    ) -> bot_models.GetDeviceDatamodelResponse:
        """
        Description: 获取数据模型
        Summary: 获取数据模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_device_datamodel_ex(request, headers, runtime)

    async def get_device_datamodel_async(
        self,
        request: bot_models.GetDeviceDatamodelRequest,
    ) -> bot_models.GetDeviceDatamodelResponse:
        """
        Description: 获取数据模型
        Summary: 获取数据模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_device_datamodel_ex_async(request, headers, runtime)

    def get_device_datamodel_ex(
        self,
        request: bot_models.GetDeviceDatamodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDeviceDatamodelResponse:
        """
        Description: 获取数据模型
        Summary: 获取数据模型
        """
        UtilClient.validate_model(request)
        return bot_models.GetDeviceDatamodelResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.device.datamodel.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_device_datamodel_ex_async(
        self,
        request: bot_models.GetDeviceDatamodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDeviceDatamodelResponse:
        """
        Description: 获取数据模型
        Summary: 获取数据模型
        """
        UtilClient.validate_model(request)
        return bot_models.GetDeviceDatamodelResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.device.datamodel.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_device(
        self,
        request: bot_models.ImportDeviceRequest,
    ) -> bot_models.ImportDeviceResponse:
        """
        Description: 注册设备
        Summary: 注册设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_device_ex(request, headers, runtime)

    async def import_device_async(
        self,
        request: bot_models.ImportDeviceRequest,
    ) -> bot_models.ImportDeviceResponse:
        """
        Description: 注册设备
        Summary: 注册设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_device_ex_async(request, headers, runtime)

    def import_device_ex(
        self,
        request: bot_models.ImportDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ImportDeviceResponse:
        """
        Description: 注册设备
        Summary: 注册设备
        """
        UtilClient.validate_model(request)
        return bot_models.ImportDeviceResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.device.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_device_ex_async(
        self,
        request: bot_models.ImportDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ImportDeviceResponse:
        """
        Description: 注册设备
        Summary: 注册设备
        """
        UtilClient.validate_model(request)
        return bot_models.ImportDeviceResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.device.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_device_bychainid(
        self,
        request: bot_models.GetDeviceBychainidRequest,
    ) -> bot_models.GetDeviceBychainidResponse:
        """
        Description: 通过chainId获取设备详情
        Summary: 通过chainId获取设备详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_device_bychainid_ex(request, headers, runtime)

    async def get_device_bychainid_async(
        self,
        request: bot_models.GetDeviceBychainidRequest,
    ) -> bot_models.GetDeviceBychainidResponse:
        """
        Description: 通过chainId获取设备详情
        Summary: 通过chainId获取设备详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_device_bychainid_ex_async(request, headers, runtime)

    def get_device_bychainid_ex(
        self,
        request: bot_models.GetDeviceBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDeviceBychainidResponse:
        """
        Description: 通过chainId获取设备详情
        Summary: 通过chainId获取设备详情
        """
        UtilClient.validate_model(request)
        return bot_models.GetDeviceBychainidResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.device.bychainid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_device_bychainid_ex_async(
        self,
        request: bot_models.GetDeviceBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDeviceBychainidResponse:
        """
        Description: 通过chainId获取设备详情
        Summary: 通过chainId获取设备详情
        """
        UtilClient.validate_model(request)
        return bot_models.GetDeviceBychainidResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.device.bychainid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_device_bydeviceid(
        self,
        request: bot_models.GetDeviceBydeviceidRequest,
    ) -> bot_models.GetDeviceBydeviceidResponse:
        """
        Description: 通过deviceId获取设备详情
        Summary: 通过deviceId获取设备详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_device_bydeviceid_ex(request, headers, runtime)

    async def get_device_bydeviceid_async(
        self,
        request: bot_models.GetDeviceBydeviceidRequest,
    ) -> bot_models.GetDeviceBydeviceidResponse:
        """
        Description: 通过deviceId获取设备详情
        Summary: 通过deviceId获取设备详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_device_bydeviceid_ex_async(request, headers, runtime)

    def get_device_bydeviceid_ex(
        self,
        request: bot_models.GetDeviceBydeviceidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDeviceBydeviceidResponse:
        """
        Description: 通过deviceId获取设备详情
        Summary: 通过deviceId获取设备详情
        """
        UtilClient.validate_model(request)
        return bot_models.GetDeviceBydeviceidResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.device.bydeviceid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_device_bydeviceid_ex_async(
        self,
        request: bot_models.GetDeviceBydeviceidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDeviceBydeviceidResponse:
        """
        Description: 通过deviceId获取设备详情
        Summary: 通过deviceId获取设备详情
        """
        UtilClient.validate_model(request)
        return bot_models.GetDeviceBydeviceidResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.device.bydeviceid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_device_byscene(
        self,
        request: bot_models.ListDeviceBysceneRequest,
    ) -> bot_models.ListDeviceBysceneResponse:
        """
        Description: 通过场景码列举设备
        Summary: 通过场景码列举设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_device_byscene_ex(request, headers, runtime)

    async def list_device_byscene_async(
        self,
        request: bot_models.ListDeviceBysceneRequest,
    ) -> bot_models.ListDeviceBysceneResponse:
        """
        Description: 通过场景码列举设备
        Summary: 通过场景码列举设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_device_byscene_ex_async(request, headers, runtime)

    def list_device_byscene_ex(
        self,
        request: bot_models.ListDeviceBysceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ListDeviceBysceneResponse:
        """
        Description: 通过场景码列举设备
        Summary: 通过场景码列举设备
        """
        UtilClient.validate_model(request)
        return bot_models.ListDeviceBysceneResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.device.byscene.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_device_byscene_ex_async(
        self,
        request: bot_models.ListDeviceBysceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ListDeviceBysceneResponse:
        """
        Description: 通过场景码列举设备
        Summary: 通过场景码列举设备
        """
        UtilClient.validate_model(request)
        return bot_models.ListDeviceBysceneResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.device.byscene.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_device_info(
        self,
        request: bot_models.UpdateDeviceInfoRequest,
    ) -> bot_models.UpdateDeviceInfoResponse:
        """
        Description: 更新设备信息
        Summary: 更新设备信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_device_info_ex(request, headers, runtime)

    async def update_device_info_async(
        self,
        request: bot_models.UpdateDeviceInfoRequest,
    ) -> bot_models.UpdateDeviceInfoResponse:
        """
        Description: 更新设备信息
        Summary: 更新设备信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_device_info_ex_async(request, headers, runtime)

    def update_device_info_ex(
        self,
        request: bot_models.UpdateDeviceInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateDeviceInfoResponse:
        """
        Description: 更新设备信息
        Summary: 更新设备信息
        """
        UtilClient.validate_model(request)
        return bot_models.UpdateDeviceInfoResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.device.info.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_device_info_ex_async(
        self,
        request: bot_models.UpdateDeviceInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateDeviceInfoResponse:
        """
        Description: 更新设备信息
        Summary: 更新设备信息
        """
        UtilClient.validate_model(request)
        return bot_models.UpdateDeviceInfoResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.device.info.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_distributedevice_bydeviceid(
        self,
        request: bot_models.CreateDistributedeviceBydeviceidRequest,
    ) -> bot_models.CreateDistributedeviceBydeviceidResponse:
        """
        Description: 通过deviceId发行设备
        Summary: 通过deviceId发行设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_distributedevice_bydeviceid_ex(request, headers, runtime)

    async def create_distributedevice_bydeviceid_async(
        self,
        request: bot_models.CreateDistributedeviceBydeviceidRequest,
    ) -> bot_models.CreateDistributedeviceBydeviceidResponse:
        """
        Description: 通过deviceId发行设备
        Summary: 通过deviceId发行设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_distributedevice_bydeviceid_ex_async(request, headers, runtime)

    def create_distributedevice_bydeviceid_ex(
        self,
        request: bot_models.CreateDistributedeviceBydeviceidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceBydeviceidResponse:
        """
        Description: 通过deviceId发行设备
        Summary: 通过deviceId发行设备
        """
        UtilClient.validate_model(request)
        return bot_models.CreateDistributedeviceBydeviceidResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.distributedevice.bydeviceid.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_distributedevice_bydeviceid_ex_async(
        self,
        request: bot_models.CreateDistributedeviceBydeviceidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceBydeviceidResponse:
        """
        Description: 通过deviceId发行设备
        Summary: 通过deviceId发行设备
        """
        UtilClient.validate_model(request)
        return bot_models.CreateDistributedeviceBydeviceidResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.bydeviceid.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_distributedevice_bychainid(
        self,
        request: bot_models.CreateDistributedeviceBychainidRequest,
    ) -> bot_models.CreateDistributedeviceBychainidResponse:
        """
        Description: 通过链上设备Id发行
        Summary: 通过链上设备Id发行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_distributedevice_bychainid_ex(request, headers, runtime)

    async def create_distributedevice_bychainid_async(
        self,
        request: bot_models.CreateDistributedeviceBychainidRequest,
    ) -> bot_models.CreateDistributedeviceBychainidResponse:
        """
        Description: 通过链上设备Id发行
        Summary: 通过链上设备Id发行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_distributedevice_bychainid_ex_async(request, headers, runtime)

    def create_distributedevice_bychainid_ex(
        self,
        request: bot_models.CreateDistributedeviceBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceBychainidResponse:
        """
        Description: 通过链上设备Id发行
        Summary: 通过链上设备Id发行
        """
        UtilClient.validate_model(request)
        return bot_models.CreateDistributedeviceBychainidResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.distributedevice.bychainid.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_distributedevice_bychainid_ex_async(
        self,
        request: bot_models.CreateDistributedeviceBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceBychainidResponse:
        """
        Description: 通过链上设备Id发行
        Summary: 通过链上设备Id发行
        """
        UtilClient.validate_model(request)
        return bot_models.CreateDistributedeviceBychainidResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.bychainid.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def replace_distributedevice_bychainid(
        self,
        request: bot_models.ReplaceDistributedeviceBychainidRequest,
    ) -> bot_models.ReplaceDistributedeviceBychainidResponse:
        """
        Description: 替换发行设备
        Summary: 替换发行设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.replace_distributedevice_bychainid_ex(request, headers, runtime)

    async def replace_distributedevice_bychainid_async(
        self,
        request: bot_models.ReplaceDistributedeviceBychainidRequest,
    ) -> bot_models.ReplaceDistributedeviceBychainidResponse:
        """
        Description: 替换发行设备
        Summary: 替换发行设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.replace_distributedevice_bychainid_ex_async(request, headers, runtime)

    def replace_distributedevice_bychainid_ex(
        self,
        request: bot_models.ReplaceDistributedeviceBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ReplaceDistributedeviceBychainidResponse:
        """
        Description: 替换发行设备
        Summary: 替换发行设备
        """
        UtilClient.validate_model(request)
        return bot_models.ReplaceDistributedeviceBychainidResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.distributedevice.bychainid.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def replace_distributedevice_bychainid_ex_async(
        self,
        request: bot_models.ReplaceDistributedeviceBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ReplaceDistributedeviceBychainidResponse:
        """
        Description: 替换发行设备
        Summary: 替换发行设备
        """
        UtilClient.validate_model(request)
        return bot_models.ReplaceDistributedeviceBychainidResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.bychainid.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_collector_bychainid(
        self,
        request: bot_models.SendCollectorBychainidRequest,
    ) -> bot_models.SendCollectorBychainidResponse:
        """
        Description: 上传单个设备所产生的设备数据
        Summary: 上传设备数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_collector_bychainid_ex(request, headers, runtime)

    async def send_collector_bychainid_async(
        self,
        request: bot_models.SendCollectorBychainidRequest,
    ) -> bot_models.SendCollectorBychainidResponse:
        """
        Description: 上传单个设备所产生的设备数据
        Summary: 上传设备数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_collector_bychainid_ex_async(request, headers, runtime)

    def send_collector_bychainid_ex(
        self,
        request: bot_models.SendCollectorBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendCollectorBychainidResponse:
        """
        Description: 上传单个设备所产生的设备数据
        Summary: 上传设备数据
        """
        UtilClient.validate_model(request)
        return bot_models.SendCollectorBychainidResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.collector.bychainid.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_collector_bychainid_ex_async(
        self,
        request: bot_models.SendCollectorBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendCollectorBychainidResponse:
        """
        Description: 上传单个设备所产生的设备数据
        Summary: 上传设备数据
        """
        UtilClient.validate_model(request)
        return bot_models.SendCollectorBychainidResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.collector.bychainid.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_distributedevice_bychainid(
        self,
        request: bot_models.GetDistributedeviceBychainidRequest,
    ) -> bot_models.GetDistributedeviceBychainidResponse:
        """
        Description: 通过Id获取发行设备
        Summary: 通过Id获取发行设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_distributedevice_bychainid_ex(request, headers, runtime)

    async def get_distributedevice_bychainid_async(
        self,
        request: bot_models.GetDistributedeviceBychainidRequest,
    ) -> bot_models.GetDistributedeviceBychainidResponse:
        """
        Description: 通过Id获取发行设备
        Summary: 通过Id获取发行设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_distributedevice_bychainid_ex_async(request, headers, runtime)

    def get_distributedevice_bychainid_ex(
        self,
        request: bot_models.GetDistributedeviceBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDistributedeviceBychainidResponse:
        """
        Description: 通过Id获取发行设备
        Summary: 通过Id获取发行设备
        """
        UtilClient.validate_model(request)
        return bot_models.GetDistributedeviceBychainidResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.distributedevice.bychainid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_distributedevice_bychainid_ex_async(
        self,
        request: bot_models.GetDistributedeviceBychainidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDistributedeviceBychainidResponse:
        """
        Description: 通过Id获取发行设备
        Summary: 通过Id获取发行设备
        """
        UtilClient.validate_model(request)
        return bot_models.GetDistributedeviceBychainidResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.bychainid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_distributedevice_byscene(
        self,
        request: bot_models.ListDistributedeviceBysceneRequest,
    ) -> bot_models.ListDistributedeviceBysceneResponse:
        """
        Description: 通过场景码列举发行设备
        Summary: 通过场景码列举发行设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_distributedevice_byscene_ex(request, headers, runtime)

    async def list_distributedevice_byscene_async(
        self,
        request: bot_models.ListDistributedeviceBysceneRequest,
    ) -> bot_models.ListDistributedeviceBysceneResponse:
        """
        Description: 通过场景码列举发行设备
        Summary: 通过场景码列举发行设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_distributedevice_byscene_ex_async(request, headers, runtime)

    def list_distributedevice_byscene_ex(
        self,
        request: bot_models.ListDistributedeviceBysceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ListDistributedeviceBysceneResponse:
        """
        Description: 通过场景码列举发行设备
        Summary: 通过场景码列举发行设备
        """
        UtilClient.validate_model(request)
        return bot_models.ListDistributedeviceBysceneResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.distributedevice.byscene.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_distributedevice_byscene_ex_async(
        self,
        request: bot_models.ListDistributedeviceBysceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ListDistributedeviceBysceneResponse:
        """
        Description: 通过场景码列举发行设备
        Summary: 通过场景码列举发行设备
        """
        UtilClient.validate_model(request)
        return bot_models.ListDistributedeviceBysceneResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.byscene.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_consumer(
        self,
        request: bot_models.CreateConsumerRequest,
    ) -> bot_models.CreateConsumerResponse:
        """
        Description: 创建消费者
        Summary: 创建消费者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_consumer_ex(request, headers, runtime)

    async def create_consumer_async(
        self,
        request: bot_models.CreateConsumerRequest,
    ) -> bot_models.CreateConsumerResponse:
        """
        Description: 创建消费者
        Summary: 创建消费者
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_consumer_ex_async(request, headers, runtime)

    def create_consumer_ex(
        self,
        request: bot_models.CreateConsumerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateConsumerResponse:
        """
        Description: 创建消费者
        Summary: 创建消费者
        """
        UtilClient.validate_model(request)
        return bot_models.CreateConsumerResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.consumer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_consumer_ex_async(
        self,
        request: bot_models.CreateConsumerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateConsumerResponse:
        """
        Description: 创建消费者
        Summary: 创建消费者
        """
        UtilClient.validate_model(request)
        return bot_models.CreateConsumerResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.consumer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_consumer_subscribe(
        self,
        request: bot_models.SetConsumerSubscribeRequest,
    ) -> bot_models.SetConsumerSubscribeResponse:
        """
        Description: 消费者订阅
        Summary: 消费者订阅
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_consumer_subscribe_ex(request, headers, runtime)

    async def set_consumer_subscribe_async(
        self,
        request: bot_models.SetConsumerSubscribeRequest,
    ) -> bot_models.SetConsumerSubscribeResponse:
        """
        Description: 消费者订阅
        Summary: 消费者订阅
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_consumer_subscribe_ex_async(request, headers, runtime)

    def set_consumer_subscribe_ex(
        self,
        request: bot_models.SetConsumerSubscribeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SetConsumerSubscribeResponse:
        """
        Description: 消费者订阅
        Summary: 消费者订阅
        """
        UtilClient.validate_model(request)
        return bot_models.SetConsumerSubscribeResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.consumer.subscribe.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_consumer_subscribe_ex_async(
        self,
        request: bot_models.SetConsumerSubscribeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SetConsumerSubscribeResponse:
        """
        Description: 消费者订阅
        Summary: 消费者订阅
        """
        UtilClient.validate_model(request)
        return bot_models.SetConsumerSubscribeResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.consumer.subscribe.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_consumer_unsubscribe(
        self,
        request: bot_models.SetConsumerUnsubscribeRequest,
    ) -> bot_models.SetConsumerUnsubscribeResponse:
        """
        Description: 消费者取消订阅设备
        Summary: 消费者取消订阅设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_consumer_unsubscribe_ex(request, headers, runtime)

    async def set_consumer_unsubscribe_async(
        self,
        request: bot_models.SetConsumerUnsubscribeRequest,
    ) -> bot_models.SetConsumerUnsubscribeResponse:
        """
        Description: 消费者取消订阅设备
        Summary: 消费者取消订阅设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_consumer_unsubscribe_ex_async(request, headers, runtime)

    def set_consumer_unsubscribe_ex(
        self,
        request: bot_models.SetConsumerUnsubscribeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SetConsumerUnsubscribeResponse:
        """
        Description: 消费者取消订阅设备
        Summary: 消费者取消订阅设备
        """
        UtilClient.validate_model(request)
        return bot_models.SetConsumerUnsubscribeResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.consumer.unsubscribe.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_consumer_unsubscribe_ex_async(
        self,
        request: bot_models.SetConsumerUnsubscribeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SetConsumerUnsubscribeResponse:
        """
        Description: 消费者取消订阅设备
        Summary: 消费者取消订阅设备
        """
        UtilClient.validate_model(request)
        return bot_models.SetConsumerUnsubscribeResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.consumer.unsubscribe.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pull_consumer_datasource(
        self,
        request: bot_models.PullConsumerDatasourceRequest,
    ) -> bot_models.PullConsumerDatasourceResponse:
        """
        Description: 消费者获取数据
        Summary: 消费者获取数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pull_consumer_datasource_ex(request, headers, runtime)

    async def pull_consumer_datasource_async(
        self,
        request: bot_models.PullConsumerDatasourceRequest,
    ) -> bot_models.PullConsumerDatasourceResponse:
        """
        Description: 消费者获取数据
        Summary: 消费者获取数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pull_consumer_datasource_ex_async(request, headers, runtime)

    def pull_consumer_datasource_ex(
        self,
        request: bot_models.PullConsumerDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.PullConsumerDatasourceResponse:
        """
        Description: 消费者获取数据
        Summary: 消费者获取数据
        """
        UtilClient.validate_model(request)
        return bot_models.PullConsumerDatasourceResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.consumer.datasource.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pull_consumer_datasource_ex_async(
        self,
        request: bot_models.PullConsumerDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.PullConsumerDatasourceResponse:
        """
        Description: 消费者获取数据
        Summary: 消费者获取数据
        """
        UtilClient.validate_model(request)
        return bot_models.PullConsumerDatasourceResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.consumer.datasource.pull', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_distributedevice_bydeviceid(
        self,
        request: bot_models.GetDistributedeviceBydeviceidRequest,
    ) -> bot_models.GetDistributedeviceBydeviceidResponse:
        """
        Description: 通过设备id获取发行设备详情
        Summary: 通过设备id获取发行设备详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_distributedevice_bydeviceid_ex(request, headers, runtime)

    async def get_distributedevice_bydeviceid_async(
        self,
        request: bot_models.GetDistributedeviceBydeviceidRequest,
    ) -> bot_models.GetDistributedeviceBydeviceidResponse:
        """
        Description: 通过设备id获取发行设备详情
        Summary: 通过设备id获取发行设备详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_distributedevice_bydeviceid_ex_async(request, headers, runtime)

    def get_distributedevice_bydeviceid_ex(
        self,
        request: bot_models.GetDistributedeviceBydeviceidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDistributedeviceBydeviceidResponse:
        """
        Description: 通过设备id获取发行设备详情
        Summary: 通过设备id获取发行设备详情
        """
        UtilClient.validate_model(request)
        return bot_models.GetDistributedeviceBydeviceidResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.distributedevice.bydeviceid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_distributedevice_bydeviceid_ex_async(
        self,
        request: bot_models.GetDistributedeviceBydeviceidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDistributedeviceBydeviceidResponse:
        """
        Description: 通过设备id获取发行设备详情
        Summary: 通过设备id获取发行设备详情
        """
        UtilClient.validate_model(request)
        return bot_models.GetDistributedeviceBydeviceidResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.bydeviceid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_distributedevice_bydisid(
        self,
        request: bot_models.GetDistributedeviceBydisidRequest,
    ) -> bot_models.GetDistributedeviceBydisidResponse:
        """
        Description: 通过发行id获取设备
        Summary: 通过发行id获取设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_distributedevice_bydisid_ex(request, headers, runtime)

    async def get_distributedevice_bydisid_async(
        self,
        request: bot_models.GetDistributedeviceBydisidRequest,
    ) -> bot_models.GetDistributedeviceBydisidResponse:
        """
        Description: 通过发行id获取设备
        Summary: 通过发行id获取设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_distributedevice_bydisid_ex_async(request, headers, runtime)

    def get_distributedevice_bydisid_ex(
        self,
        request: bot_models.GetDistributedeviceBydisidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDistributedeviceBydisidResponse:
        """
        Description: 通过发行id获取设备
        Summary: 通过发行id获取设备
        """
        UtilClient.validate_model(request)
        return bot_models.GetDistributedeviceBydisidResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.distributedevice.bydisid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_distributedevice_bydisid_ex_async(
        self,
        request: bot_models.GetDistributedeviceBydisidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDistributedeviceBydisidResponse:
        """
        Description: 通过发行id获取设备
        Summary: 通过发行id获取设备
        """
        UtilClient.validate_model(request)
        return bot_models.GetDistributedeviceBydisidResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.bydisid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_peripheral(
        self,
        request: bot_models.ImportPeripheralRequest,
    ) -> bot_models.ImportPeripheralResponse:
        """
        Description: 注册外围设备
        Summary: 注册外围设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_peripheral_ex(request, headers, runtime)

    async def import_peripheral_async(
        self,
        request: bot_models.ImportPeripheralRequest,
    ) -> bot_models.ImportPeripheralResponse:
        """
        Description: 注册外围设备
        Summary: 注册外围设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_peripheral_ex_async(request, headers, runtime)

    def import_peripheral_ex(
        self,
        request: bot_models.ImportPeripheralRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ImportPeripheralResponse:
        """
        Description: 注册外围设备
        Summary: 注册外围设备
        """
        UtilClient.validate_model(request)
        return bot_models.ImportPeripheralResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.peripheral.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_peripheral_ex_async(
        self,
        request: bot_models.ImportPeripheralRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ImportPeripheralResponse:
        """
        Description: 注册外围设备
        Summary: 注册外围设备
        """
        UtilClient.validate_model(request)
        return bot_models.ImportPeripheralResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.peripheral.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_peripheral_bychainperipheralid(
        self,
        request: bot_models.GetPeripheralBychainperipheralidRequest,
    ) -> bot_models.GetPeripheralBychainperipheralidResponse:
        """
        Description: 通过链上外围设备ID获取详情
        Summary: 通过链上外围设备ID获取详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_peripheral_bychainperipheralid_ex(request, headers, runtime)

    async def get_peripheral_bychainperipheralid_async(
        self,
        request: bot_models.GetPeripheralBychainperipheralidRequest,
    ) -> bot_models.GetPeripheralBychainperipheralidResponse:
        """
        Description: 通过链上外围设备ID获取详情
        Summary: 通过链上外围设备ID获取详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_peripheral_bychainperipheralid_ex_async(request, headers, runtime)

    def get_peripheral_bychainperipheralid_ex(
        self,
        request: bot_models.GetPeripheralBychainperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetPeripheralBychainperipheralidResponse:
        """
        Description: 通过链上外围设备ID获取详情
        Summary: 通过链上外围设备ID获取详情
        """
        UtilClient.validate_model(request)
        return bot_models.GetPeripheralBychainperipheralidResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.peripheral.bychainperipheralid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_peripheral_bychainperipheralid_ex_async(
        self,
        request: bot_models.GetPeripheralBychainperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetPeripheralBychainperipheralidResponse:
        """
        Description: 通过链上外围设备ID获取详情
        Summary: 通过链上外围设备ID获取详情
        """
        UtilClient.validate_model(request)
        return bot_models.GetPeripheralBychainperipheralidResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.peripheral.bychainperipheralid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_peripheral_byperipheralid(
        self,
        request: bot_models.GetPeripheralByperipheralidRequest,
    ) -> bot_models.GetPeripheralByperipheralidResponse:
        """
        Description: 通过外围设备ID获取详情
        Summary: 通过外围设备ID获取详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_peripheral_byperipheralid_ex(request, headers, runtime)

    async def get_peripheral_byperipheralid_async(
        self,
        request: bot_models.GetPeripheralByperipheralidRequest,
    ) -> bot_models.GetPeripheralByperipheralidResponse:
        """
        Description: 通过外围设备ID获取详情
        Summary: 通过外围设备ID获取详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_peripheral_byperipheralid_ex_async(request, headers, runtime)

    def get_peripheral_byperipheralid_ex(
        self,
        request: bot_models.GetPeripheralByperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetPeripheralByperipheralidResponse:
        """
        Description: 通过外围设备ID获取详情
        Summary: 通过外围设备ID获取详情
        """
        UtilClient.validate_model(request)
        return bot_models.GetPeripheralByperipheralidResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.peripheral.byperipheralid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_peripheral_byperipheralid_ex_async(
        self,
        request: bot_models.GetPeripheralByperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetPeripheralByperipheralidResponse:
        """
        Description: 通过外围设备ID获取详情
        Summary: 通过外围设备ID获取详情
        """
        UtilClient.validate_model(request)
        return bot_models.GetPeripheralByperipheralidResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.peripheral.byperipheralid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_peripheral_byscene(
        self,
        request: bot_models.ListPeripheralBysceneRequest,
    ) -> bot_models.ListPeripheralBysceneResponse:
        """
        Description: 根据场景列举外围设备
        Summary: 根据场景列举外围设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_peripheral_byscene_ex(request, headers, runtime)

    async def list_peripheral_byscene_async(
        self,
        request: bot_models.ListPeripheralBysceneRequest,
    ) -> bot_models.ListPeripheralBysceneResponse:
        """
        Description: 根据场景列举外围设备
        Summary: 根据场景列举外围设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_peripheral_byscene_ex_async(request, headers, runtime)

    def list_peripheral_byscene_ex(
        self,
        request: bot_models.ListPeripheralBysceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ListPeripheralBysceneResponse:
        """
        Description: 根据场景列举外围设备
        Summary: 根据场景列举外围设备
        """
        UtilClient.validate_model(request)
        return bot_models.ListPeripheralBysceneResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.peripheral.byscene.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_peripheral_byscene_ex_async(
        self,
        request: bot_models.ListPeripheralBysceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ListPeripheralBysceneResponse:
        """
        Description: 根据场景列举外围设备
        Summary: 根据场景列举外围设备
        """
        UtilClient.validate_model(request)
        return bot_models.ListPeripheralBysceneResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.peripheral.byscene.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_distributedevice_byperipheralid(
        self,
        request: bot_models.CreateDistributedeviceByperipheralidRequest,
    ) -> bot_models.CreateDistributedeviceByperipheralidResponse:
        """
        Description: 通过外围设备Id发行
        Summary: 通过外围设备Id发行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_distributedevice_byperipheralid_ex(request, headers, runtime)

    async def create_distributedevice_byperipheralid_async(
        self,
        request: bot_models.CreateDistributedeviceByperipheralidRequest,
    ) -> bot_models.CreateDistributedeviceByperipheralidResponse:
        """
        Description: 通过外围设备Id发行
        Summary: 通过外围设备Id发行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_distributedevice_byperipheralid_ex_async(request, headers, runtime)

    def create_distributedevice_byperipheralid_ex(
        self,
        request: bot_models.CreateDistributedeviceByperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceByperipheralidResponse:
        """
        Description: 通过外围设备Id发行
        Summary: 通过外围设备Id发行
        """
        UtilClient.validate_model(request)
        return bot_models.CreateDistributedeviceByperipheralidResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.distributedevice.byperipheralid.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_distributedevice_byperipheralid_ex_async(
        self,
        request: bot_models.CreateDistributedeviceByperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceByperipheralidResponse:
        """
        Description: 通过外围设备Id发行
        Summary: 通过外围设备Id发行
        """
        UtilClient.validate_model(request)
        return bot_models.CreateDistributedeviceByperipheralidResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.byperipheralid.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_distributedevice_bychainperipheralid(
        self,
        request: bot_models.CreateDistributedeviceBychainperipheralidRequest,
    ) -> bot_models.CreateDistributedeviceBychainperipheralidResponse:
        """
        Description: 通过链上外围设备Id发行
        Summary: 通过链上外围设备Id发行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_distributedevice_bychainperipheralid_ex(request, headers, runtime)

    async def create_distributedevice_bychainperipheralid_async(
        self,
        request: bot_models.CreateDistributedeviceBychainperipheralidRequest,
    ) -> bot_models.CreateDistributedeviceBychainperipheralidResponse:
        """
        Description: 通过链上外围设备Id发行
        Summary: 通过链上外围设备Id发行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_distributedevice_bychainperipheralid_ex_async(request, headers, runtime)

    def create_distributedevice_bychainperipheralid_ex(
        self,
        request: bot_models.CreateDistributedeviceBychainperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceBychainperipheralidResponse:
        """
        Description: 通过链上外围设备Id发行
        Summary: 通过链上外围设备Id发行
        """
        UtilClient.validate_model(request)
        return bot_models.CreateDistributedeviceBychainperipheralidResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.distributedevice.bychainperipheralid.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_distributedevice_bychainperipheralid_ex_async(
        self,
        request: bot_models.CreateDistributedeviceBychainperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceBychainperipheralidResponse:
        """
        Description: 通过链上外围设备Id发行
        Summary: 通过链上外围设备Id发行
        """
        UtilClient.validate_model(request)
        return bot_models.CreateDistributedeviceBychainperipheralidResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.bychainperipheralid.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def replace_distributedevice_bychainperipheralid(
        self,
        request: bot_models.ReplaceDistributedeviceBychainperipheralidRequest,
    ) -> bot_models.ReplaceDistributedeviceBychainperipheralidResponse:
        """
        Description: 替换发行外围设备 by 链上外围设备ID
        Summary: 替换发行外围设备 by 链上外围设备ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.replace_distributedevice_bychainperipheralid_ex(request, headers, runtime)

    async def replace_distributedevice_bychainperipheralid_async(
        self,
        request: bot_models.ReplaceDistributedeviceBychainperipheralidRequest,
    ) -> bot_models.ReplaceDistributedeviceBychainperipheralidResponse:
        """
        Description: 替换发行外围设备 by 链上外围设备ID
        Summary: 替换发行外围设备 by 链上外围设备ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.replace_distributedevice_bychainperipheralid_ex_async(request, headers, runtime)

    def replace_distributedevice_bychainperipheralid_ex(
        self,
        request: bot_models.ReplaceDistributedeviceBychainperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ReplaceDistributedeviceBychainperipheralidResponse:
        """
        Description: 替换发行外围设备 by 链上外围设备ID
        Summary: 替换发行外围设备 by 链上外围设备ID
        """
        UtilClient.validate_model(request)
        return bot_models.ReplaceDistributedeviceBychainperipheralidResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.distributedevice.bychainperipheralid.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def replace_distributedevice_bychainperipheralid_ex_async(
        self,
        request: bot_models.ReplaceDistributedeviceBychainperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ReplaceDistributedeviceBychainperipheralidResponse:
        """
        Description: 替换发行外围设备 by 链上外围设备ID
        Summary: 替换发行外围设备 by 链上外围设备ID
        """
        UtilClient.validate_model(request)
        return bot_models.ReplaceDistributedeviceBychainperipheralidResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.bychainperipheralid.replace', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_distributedevice_byperipheralscene(
        self,
        request: bot_models.ListDistributedeviceByperipheralsceneRequest,
    ) -> bot_models.ListDistributedeviceByperipheralsceneResponse:
        """
        Description: 根据场景列举发行外围设备
        Summary: 根据场景列举发行外围设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_distributedevice_byperipheralscene_ex(request, headers, runtime)

    async def list_distributedevice_byperipheralscene_async(
        self,
        request: bot_models.ListDistributedeviceByperipheralsceneRequest,
    ) -> bot_models.ListDistributedeviceByperipheralsceneResponse:
        """
        Description: 根据场景列举发行外围设备
        Summary: 根据场景列举发行外围设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_distributedevice_byperipheralscene_ex_async(request, headers, runtime)

    def list_distributedevice_byperipheralscene_ex(
        self,
        request: bot_models.ListDistributedeviceByperipheralsceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ListDistributedeviceByperipheralsceneResponse:
        """
        Description: 根据场景列举发行外围设备
        Summary: 根据场景列举发行外围设备
        """
        UtilClient.validate_model(request)
        return bot_models.ListDistributedeviceByperipheralsceneResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.distributedevice.byperipheralscene.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_distributedevice_byperipheralscene_ex_async(
        self,
        request: bot_models.ListDistributedeviceByperipheralsceneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ListDistributedeviceByperipheralsceneResponse:
        """
        Description: 根据场景列举发行外围设备
        Summary: 根据场景列举发行外围设备
        """
        UtilClient.validate_model(request)
        return bot_models.ListDistributedeviceByperipheralsceneResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.byperipheralscene.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_distributedevice_byperipheralid(
        self,
        request: bot_models.GetDistributedeviceByperipheralidRequest,
    ) -> bot_models.GetDistributedeviceByperipheralidResponse:
        """
        Description: 通过外围设备ID获取发行外围设备信息
        Summary: 通过外围设备ID获取发行外围设备信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_distributedevice_byperipheralid_ex(request, headers, runtime)

    async def get_distributedevice_byperipheralid_async(
        self,
        request: bot_models.GetDistributedeviceByperipheralidRequest,
    ) -> bot_models.GetDistributedeviceByperipheralidResponse:
        """
        Description: 通过外围设备ID获取发行外围设备信息
        Summary: 通过外围设备ID获取发行外围设备信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_distributedevice_byperipheralid_ex_async(request, headers, runtime)

    def get_distributedevice_byperipheralid_ex(
        self,
        request: bot_models.GetDistributedeviceByperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDistributedeviceByperipheralidResponse:
        """
        Description: 通过外围设备ID获取发行外围设备信息
        Summary: 通过外围设备ID获取发行外围设备信息
        """
        UtilClient.validate_model(request)
        return bot_models.GetDistributedeviceByperipheralidResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.distributedevice.byperipheralid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_distributedevice_byperipheralid_ex_async(
        self,
        request: bot_models.GetDistributedeviceByperipheralidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.GetDistributedeviceByperipheralidResponse:
        """
        Description: 通过外围设备ID获取发行外围设备信息
        Summary: 通过外围设备ID获取发行外围设备信息
        """
        UtilClient.validate_model(request)
        return bot_models.GetDistributedeviceByperipheralidResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.byperipheralid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_distributedevice_bydevice(
        self,
        request: bot_models.CreateDistributedeviceBydeviceRequest,
    ) -> bot_models.CreateDistributedeviceBydeviceResponse:
        """
        Description: 发行设备by_devcie
        Summary: 发行设备by_devcie
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_distributedevice_bydevice_ex(request, headers, runtime)

    async def create_distributedevice_bydevice_async(
        self,
        request: bot_models.CreateDistributedeviceBydeviceRequest,
    ) -> bot_models.CreateDistributedeviceBydeviceResponse:
        """
        Description: 发行设备by_devcie
        Summary: 发行设备by_devcie
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_distributedevice_bydevice_ex_async(request, headers, runtime)

    def create_distributedevice_bydevice_ex(
        self,
        request: bot_models.CreateDistributedeviceBydeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceBydeviceResponse:
        """
        Description: 发行设备by_devcie
        Summary: 发行设备by_devcie
        """
        UtilClient.validate_model(request)
        return bot_models.CreateDistributedeviceBydeviceResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.distributedevice.bydevice.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_distributedevice_bydevice_ex_async(
        self,
        request: bot_models.CreateDistributedeviceBydeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateDistributedeviceBydeviceResponse:
        """
        Description: 发行设备by_devcie
        Summary: 发行设备by_devcie
        """
        UtilClient.validate_model(request)
        return bot_models.CreateDistributedeviceBydeviceResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.distributedevice.bydevice.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_task(
        self,
        request: bot_models.CreateTaskRequest,
    ) -> bot_models.CreateTaskResponse:
        """
        Description: 远程任务创建
        Summary: 远程任务创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_task_ex(request, headers, runtime)

    async def create_task_async(
        self,
        request: bot_models.CreateTaskRequest,
    ) -> bot_models.CreateTaskResponse:
        """
        Description: 远程任务创建
        Summary: 远程任务创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_task_ex_async(request, headers, runtime)

    def create_task_ex(
        self,
        request: bot_models.CreateTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateTaskResponse:
        """
        Description: 远程任务创建
        Summary: 远程任务创建
        """
        UtilClient.validate_model(request)
        return bot_models.CreateTaskResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.task.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_task_ex_async(
        self,
        request: bot_models.CreateTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateTaskResponse:
        """
        Description: 远程任务创建
        Summary: 远程任务创建
        """
        UtilClient.validate_model(request)
        return bot_models.CreateTaskResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.task.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_task(
        self,
        request: bot_models.QueryTaskRequest,
    ) -> bot_models.QueryTaskResponse:
        """
        Description: 远程任务查询
        Summary: 远程任务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_task_ex(request, headers, runtime)

    async def query_task_async(
        self,
        request: bot_models.QueryTaskRequest,
    ) -> bot_models.QueryTaskResponse:
        """
        Description: 远程任务查询
        Summary: 远程任务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_task_ex_async(request, headers, runtime)

    def query_task_ex(
        self,
        request: bot_models.QueryTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryTaskResponse:
        """
        Description: 远程任务查询
        Summary: 远程任务查询
        """
        UtilClient.validate_model(request)
        return bot_models.QueryTaskResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_task_ex_async(
        self,
        request: bot_models.QueryTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryTaskResponse:
        """
        Description: 远程任务查询
        Summary: 远程任务查询
        """
        UtilClient.validate_model(request)
        return bot_models.QueryTaskResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_analysis(
        self,
        request: bot_models.QueryAnalysisRequest,
    ) -> bot_models.QueryAnalysisResponse:
        """
        Description: 分析数据查询
        Summary: 分析数据查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_analysis_ex(request, headers, runtime)

    async def query_analysis_async(
        self,
        request: bot_models.QueryAnalysisRequest,
    ) -> bot_models.QueryAnalysisResponse:
        """
        Description: 分析数据查询
        Summary: 分析数据查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_analysis_ex_async(request, headers, runtime)

    def query_analysis_ex(
        self,
        request: bot_models.QueryAnalysisRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryAnalysisResponse:
        """
        Description: 分析数据查询
        Summary: 分析数据查询
        """
        UtilClient.validate_model(request)
        return bot_models.QueryAnalysisResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.analysis.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_analysis_ex_async(
        self,
        request: bot_models.QueryAnalysisRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryAnalysisResponse:
        """
        Description: 分析数据查询
        Summary: 分析数据查询
        """
        UtilClient.validate_model(request)
        return bot_models.QueryAnalysisResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.analysis.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_collector_bychainidmul(
        self,
        request: bot_models.SendCollectorBychainidmulRequest,
    ) -> bot_models.SendCollectorBychainidmulResponse:
        """
        Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
        Summary: 上传设备数据mul
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_collector_bychainidmul_ex(request, headers, runtime)

    async def send_collector_bychainidmul_async(
        self,
        request: bot_models.SendCollectorBychainidmulRequest,
    ) -> bot_models.SendCollectorBychainidmulResponse:
        """
        Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
        Summary: 上传设备数据mul
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_collector_bychainidmul_ex_async(request, headers, runtime)

    def send_collector_bychainidmul_ex(
        self,
        request: bot_models.SendCollectorBychainidmulRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendCollectorBychainidmulResponse:
        """
        Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
        Summary: 上传设备数据mul
        """
        UtilClient.validate_model(request)
        return bot_models.SendCollectorBychainidmulResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.collector.bychainidmul.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_collector_bychainidmul_ex_async(
        self,
        request: bot_models.SendCollectorBychainidmulRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendCollectorBychainidmulResponse:
        """
        Description: 上传数据mul（可能是多个不同的设备分别产生的多条数据）
        Summary: 上传设备数据mul
        """
        UtilClient.validate_model(request)
        return bot_models.SendCollectorBychainidmulResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.collector.bychainidmul.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_collector_devicebizdata(
        self,
        request: bot_models.SendCollectorDevicebizdataRequest,
    ) -> bot_models.SendCollectorDevicebizdataResponse:
        """
        Description: 上传设备业务数据
        Summary: 上传设备业务数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_collector_devicebizdata_ex(request, headers, runtime)

    async def send_collector_devicebizdata_async(
        self,
        request: bot_models.SendCollectorDevicebizdataRequest,
    ) -> bot_models.SendCollectorDevicebizdataResponse:
        """
        Description: 上传设备业务数据
        Summary: 上传设备业务数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_collector_devicebizdata_ex_async(request, headers, runtime)

    def send_collector_devicebizdata_ex(
        self,
        request: bot_models.SendCollectorDevicebizdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendCollectorDevicebizdataResponse:
        """
        Description: 上传设备业务数据
        Summary: 上传设备业务数据
        """
        UtilClient.validate_model(request)
        return bot_models.SendCollectorDevicebizdataResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.collector.devicebizdata.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_collector_devicebizdata_ex_async(
        self,
        request: bot_models.SendCollectorDevicebizdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SendCollectorDevicebizdataResponse:
        """
        Description: 上传设备业务数据
        Summary: 上传设备业务数据
        """
        UtilClient.validate_model(request)
        return bot_models.SendCollectorDevicebizdataResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.collector.devicebizdata.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_device_infobydevice(
        self,
        request: bot_models.UpdateDeviceInfobydeviceRequest,
    ) -> bot_models.UpdateDeviceInfobydeviceResponse:
        """
        Description: 更新设备信息by_devcie
        Summary: 更新设备信息by_devcie
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_device_infobydevice_ex(request, headers, runtime)

    async def update_device_infobydevice_async(
        self,
        request: bot_models.UpdateDeviceInfobydeviceRequest,
    ) -> bot_models.UpdateDeviceInfobydeviceResponse:
        """
        Description: 更新设备信息by_devcie
        Summary: 更新设备信息by_devcie
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_device_infobydevice_ex_async(request, headers, runtime)

    def update_device_infobydevice_ex(
        self,
        request: bot_models.UpdateDeviceInfobydeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateDeviceInfobydeviceResponse:
        """
        Description: 更新设备信息by_devcie
        Summary: 更新设备信息by_devcie
        """
        UtilClient.validate_model(request)
        return bot_models.UpdateDeviceInfobydeviceResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.device.infobydevice.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_device_infobydevice_ex_async(
        self,
        request: bot_models.UpdateDeviceInfobydeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateDeviceInfobydeviceResponse:
        """
        Description: 更新设备信息by_devcie
        Summary: 更新设备信息by_devcie
        """
        UtilClient.validate_model(request)
        return bot_models.UpdateDeviceInfobydeviceResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.device.infobydevice.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def offline_device(
        self,
        request: bot_models.OfflineDeviceRequest,
    ) -> bot_models.OfflineDeviceResponse:
        """
        Description: 下线设备
        Summary: 下线设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.offline_device_ex(request, headers, runtime)

    async def offline_device_async(
        self,
        request: bot_models.OfflineDeviceRequest,
    ) -> bot_models.OfflineDeviceResponse:
        """
        Description: 下线设备
        Summary: 下线设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.offline_device_ex_async(request, headers, runtime)

    def offline_device_ex(
        self,
        request: bot_models.OfflineDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OfflineDeviceResponse:
        """
        Description: 下线设备
        Summary: 下线设备
        """
        UtilClient.validate_model(request)
        return bot_models.OfflineDeviceResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.device.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def offline_device_ex_async(
        self,
        request: bot_models.OfflineDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OfflineDeviceResponse:
        """
        Description: 下线设备
        Summary: 下线设备
        """
        UtilClient.validate_model(request)
        return bot_models.OfflineDeviceResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.device.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_mqtoken(
        self,
        request: bot_models.ApplyMqtokenRequest,
    ) -> bot_models.ApplyMqtokenResponse:
        """
        Description: 申请MQTT token
        Summary: 申请MQTT token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_mqtoken_ex(request, headers, runtime)

    async def apply_mqtoken_async(
        self,
        request: bot_models.ApplyMqtokenRequest,
    ) -> bot_models.ApplyMqtokenResponse:
        """
        Description: 申请MQTT token
        Summary: 申请MQTT token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_mqtoken_ex_async(request, headers, runtime)

    def apply_mqtoken_ex(
        self,
        request: bot_models.ApplyMqtokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ApplyMqtokenResponse:
        """
        Description: 申请MQTT token
        Summary: 申请MQTT token
        """
        UtilClient.validate_model(request)
        return bot_models.ApplyMqtokenResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.mqtoken.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_mqtoken_ex_async(
        self,
        request: bot_models.ApplyMqtokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ApplyMqtokenResponse:
        """
        Description: 申请MQTT token
        Summary: 申请MQTT token
        """
        UtilClient.validate_model(request)
        return bot_models.ApplyMqtokenResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.mqtoken.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_device_registration(
        self,
        request: bot_models.QueryDeviceRegistrationRequest,
    ) -> bot_models.QueryDeviceRegistrationResponse:
        """
        Description: 查询设备所注册的公钥是否正确
        Summary: 查询注册信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_device_registration_ex(request, headers, runtime)

    async def query_device_registration_async(
        self,
        request: bot_models.QueryDeviceRegistrationRequest,
    ) -> bot_models.QueryDeviceRegistrationResponse:
        """
        Description: 查询设备所注册的公钥是否正确
        Summary: 查询注册信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_device_registration_ex_async(request, headers, runtime)

    def query_device_registration_ex(
        self,
        request: bot_models.QueryDeviceRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryDeviceRegistrationResponse:
        """
        Description: 查询设备所注册的公钥是否正确
        Summary: 查询注册信息
        """
        UtilClient.validate_model(request)
        return bot_models.QueryDeviceRegistrationResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.device.registration.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_device_registration_ex_async(
        self,
        request: bot_models.QueryDeviceRegistrationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryDeviceRegistrationResponse:
        """
        Description: 查询设备所注册的公钥是否正确
        Summary: 查询注册信息
        """
        UtilClient.validate_model(request)
        return bot_models.QueryDeviceRegistrationResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.device.registration.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_abnormal(
        self,
        request: bot_models.AddAbnormalRequest,
    ) -> bot_models.AddAbnormalResponse:
        """
        Description: 设备异常上报
        Summary: 设备异常上报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_abnormal_ex(request, headers, runtime)

    async def add_abnormal_async(
        self,
        request: bot_models.AddAbnormalRequest,
    ) -> bot_models.AddAbnormalResponse:
        """
        Description: 设备异常上报
        Summary: 设备异常上报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_abnormal_ex_async(request, headers, runtime)

    def add_abnormal_ex(
        self,
        request: bot_models.AddAbnormalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddAbnormalResponse:
        """
        Description: 设备异常上报
        Summary: 设备异常上报
        """
        UtilClient.validate_model(request)
        return bot_models.AddAbnormalResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.abnormal.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_abnormal_ex_async(
        self,
        request: bot_models.AddAbnormalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddAbnormalResponse:
        """
        Description: 设备异常上报
        Summary: 设备异常上报
        """
        UtilClient.validate_model(request)
        return bot_models.AddAbnormalResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.abnormal.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def online_device(
        self,
        request: bot_models.OnlineDeviceRequest,
    ) -> bot_models.OnlineDeviceResponse:
        """
        Description: 设备下线后，可通过此接口重新上线
        Summary: 设置设备状态为上线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.online_device_ex(request, headers, runtime)

    async def online_device_async(
        self,
        request: bot_models.OnlineDeviceRequest,
    ) -> bot_models.OnlineDeviceResponse:
        """
        Description: 设备下线后，可通过此接口重新上线
        Summary: 设置设备状态为上线
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.online_device_ex_async(request, headers, runtime)

    def online_device_ex(
        self,
        request: bot_models.OnlineDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OnlineDeviceResponse:
        """
        Description: 设备下线后，可通过此接口重新上线
        Summary: 设置设备状态为上线
        """
        UtilClient.validate_model(request)
        return bot_models.OnlineDeviceResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.device.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def online_device_ex_async(
        self,
        request: bot_models.OnlineDeviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OnlineDeviceResponse:
        """
        Description: 设备下线后，可通过此接口重新上线
        Summary: 设置设备状态为上线
        """
        UtilClient.validate_model(request)
        return bot_models.OnlineDeviceResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.device.online', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def offline_device_byunregister(
        self,
        request: bot_models.OfflineDeviceByunregisterRequest,
    ) -> bot_models.OfflineDeviceByunregisterResponse:
        """
        Description: 注销设备
        Summary: 注销设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.offline_device_byunregister_ex(request, headers, runtime)

    async def offline_device_byunregister_async(
        self,
        request: bot_models.OfflineDeviceByunregisterRequest,
    ) -> bot_models.OfflineDeviceByunregisterResponse:
        """
        Description: 注销设备
        Summary: 注销设备
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.offline_device_byunregister_ex_async(request, headers, runtime)

    def offline_device_byunregister_ex(
        self,
        request: bot_models.OfflineDeviceByunregisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OfflineDeviceByunregisterResponse:
        """
        Description: 注销设备
        Summary: 注销设备
        """
        UtilClient.validate_model(request)
        return bot_models.OfflineDeviceByunregisterResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.device.byunregister.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def offline_device_byunregister_ex_async(
        self,
        request: bot_models.OfflineDeviceByunregisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.OfflineDeviceByunregisterResponse:
        """
        Description: 注销设备
        Summary: 注销设备
        """
        UtilClient.validate_model(request)
        return bot_models.OfflineDeviceByunregisterResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.device.byunregister.offline', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_label_trace(
        self,
        request: bot_models.QueryLabelTraceRequest,
    ) -> bot_models.QueryLabelTraceResponse:
        """
        Description: 标签状态查询
        Summary: 标签状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_label_trace_ex(request, headers, runtime)

    async def query_label_trace_async(
        self,
        request: bot_models.QueryLabelTraceRequest,
    ) -> bot_models.QueryLabelTraceResponse:
        """
        Description: 标签状态查询
        Summary: 标签状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_label_trace_ex_async(request, headers, runtime)

    def query_label_trace_ex(
        self,
        request: bot_models.QueryLabelTraceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryLabelTraceResponse:
        """
        Description: 标签状态查询
        Summary: 标签状态查询
        """
        UtilClient.validate_model(request)
        return bot_models.QueryLabelTraceResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.label.trace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_label_trace_ex_async(
        self,
        request: bot_models.QueryLabelTraceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryLabelTraceResponse:
        """
        Description: 标签状态查询
        Summary: 标签状态查询
        """
        UtilClient.validate_model(request)
        return bot_models.QueryLabelTraceResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.label.trace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_label_transfer(
        self,
        request: bot_models.SyncLabelTransferRequest,
    ) -> bot_models.SyncLabelTransferResponse:
        """
        Description: 标签流转状态同步
        Summary: 标签流转状态同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_label_transfer_ex(request, headers, runtime)

    async def sync_label_transfer_async(
        self,
        request: bot_models.SyncLabelTransferRequest,
    ) -> bot_models.SyncLabelTransferResponse:
        """
        Description: 标签流转状态同步
        Summary: 标签流转状态同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_label_transfer_ex_async(request, headers, runtime)

    def sync_label_transfer_ex(
        self,
        request: bot_models.SyncLabelTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SyncLabelTransferResponse:
        """
        Description: 标签流转状态同步
        Summary: 标签流转状态同步
        """
        UtilClient.validate_model(request)
        return bot_models.SyncLabelTransferResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.label.transfer.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_label_transfer_ex_async(
        self,
        request: bot_models.SyncLabelTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.SyncLabelTransferResponse:
        """
        Description: 标签流转状态同步
        Summary: 标签流转状态同步
        """
        UtilClient.validate_model(request)
        return bot_models.SyncLabelTransferResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.label.transfer.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_label_asset(
        self,
        request: bot_models.AddLabelAssetRequest,
    ) -> bot_models.AddLabelAssetResponse:
        """
        Description: 标签资产绑定
        Summary: 标签资产绑定
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_label_asset_ex(request, headers, runtime)

    async def add_label_asset_async(
        self,
        request: bot_models.AddLabelAssetRequest,
    ) -> bot_models.AddLabelAssetResponse:
        """
        Description: 标签资产绑定
        Summary: 标签资产绑定
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_label_asset_ex_async(request, headers, runtime)

    def add_label_asset_ex(
        self,
        request: bot_models.AddLabelAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddLabelAssetResponse:
        """
        Description: 标签资产绑定
        Summary: 标签资产绑定
        """
        UtilClient.validate_model(request)
        return bot_models.AddLabelAssetResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.label.asset.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_label_asset_ex_async(
        self,
        request: bot_models.AddLabelAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.AddLabelAssetResponse:
        """
        Description: 标签资产绑定
        Summary: 标签资产绑定
        """
        UtilClient.validate_model(request)
        return bot_models.AddLabelAssetResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.label.asset.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_data_bytxhash(
        self,
        request: bot_models.QueryDataBytxhashRequest,
    ) -> bot_models.QueryDataBytxhashResponse:
        """
        Description: 通过tx_hash查询上链信息
        Summary: 链上信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_data_bytxhash_ex(request, headers, runtime)

    async def query_data_bytxhash_async(
        self,
        request: bot_models.QueryDataBytxhashRequest,
    ) -> bot_models.QueryDataBytxhashResponse:
        """
        Description: 通过tx_hash查询上链信息
        Summary: 链上信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_data_bytxhash_ex_async(request, headers, runtime)

    def query_data_bytxhash_ex(
        self,
        request: bot_models.QueryDataBytxhashRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryDataBytxhashResponse:
        """
        Description: 通过tx_hash查询上链信息
        Summary: 链上信息查询
        """
        UtilClient.validate_model(request)
        return bot_models.QueryDataBytxhashResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.data.bytxhash.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_data_bytxhash_ex_async(
        self,
        request: bot_models.QueryDataBytxhashRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryDataBytxhashResponse:
        """
        Description: 通过tx_hash查询上链信息
        Summary: 链上信息查询
        """
        UtilClient.validate_model(request)
        return bot_models.QueryDataBytxhashResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.data.bytxhash.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_thingsdid_oneapi(
        self,
        request: bot_models.ExecThingsdidOneapiRequest,
    ) -> bot_models.ExecThingsdidOneapiResponse:
        """
        Description: 信物链oneapi
        Summary: 信物链oneapi
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_thingsdid_oneapi_ex(request, headers, runtime)

    async def exec_thingsdid_oneapi_async(
        self,
        request: bot_models.ExecThingsdidOneapiRequest,
    ) -> bot_models.ExecThingsdidOneapiResponse:
        """
        Description: 信物链oneapi
        Summary: 信物链oneapi
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_thingsdid_oneapi_ex_async(request, headers, runtime)

    def exec_thingsdid_oneapi_ex(
        self,
        request: bot_models.ExecThingsdidOneapiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ExecThingsdidOneapiResponse:
        """
        Description: 信物链oneapi
        Summary: 信物链oneapi
        """
        UtilClient.validate_model(request)
        return bot_models.ExecThingsdidOneapiResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.thingsdid.oneapi.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_thingsdid_oneapi_ex_async(
        self,
        request: bot_models.ExecThingsdidOneapiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.ExecThingsdidOneapiResponse:
        """
        Description: 信物链oneapi
        Summary: 信物链oneapi
        """
        UtilClient.validate_model(request)
        return bot_models.ExecThingsdidOneapiResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.thingsdid.oneapi.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_evidence_store(
        self,
        request: bot_models.StartEvidenceStoreRequest,
    ) -> bot_models.StartEvidenceStoreResponse:
        """
        Description: 信物链存证
        Summary: 信物链存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_evidence_store_ex(request, headers, runtime)

    async def start_evidence_store_async(
        self,
        request: bot_models.StartEvidenceStoreRequest,
    ) -> bot_models.StartEvidenceStoreResponse:
        """
        Description: 信物链存证
        Summary: 信物链存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_evidence_store_ex_async(request, headers, runtime)

    def start_evidence_store_ex(
        self,
        request: bot_models.StartEvidenceStoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StartEvidenceStoreResponse:
        """
        Description: 信物链存证
        Summary: 信物链存证
        """
        UtilClient.validate_model(request)
        return bot_models.StartEvidenceStoreResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.evidence.store.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_evidence_store_ex_async(
        self,
        request: bot_models.StartEvidenceStoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StartEvidenceStoreResponse:
        """
        Description: 信物链存证
        Summary: 信物链存证
        """
        UtilClient.validate_model(request)
        return bot_models.StartEvidenceStoreResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.evidence.store.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_evidence_query(
        self,
        request: bot_models.StartEvidenceQueryRequest,
    ) -> bot_models.StartEvidenceQueryResponse:
        """
        Description: 信物链存证查询
        Summary: 信物链存证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_evidence_query_ex(request, headers, runtime)

    async def start_evidence_query_async(
        self,
        request: bot_models.StartEvidenceQueryRequest,
    ) -> bot_models.StartEvidenceQueryResponse:
        """
        Description: 信物链存证查询
        Summary: 信物链存证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_evidence_query_ex_async(request, headers, runtime)

    def start_evidence_query_ex(
        self,
        request: bot_models.StartEvidenceQueryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StartEvidenceQueryResponse:
        """
        Description: 信物链存证查询
        Summary: 信物链存证查询
        """
        UtilClient.validate_model(request)
        return bot_models.StartEvidenceQueryResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.evidence.query.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_evidence_query_ex_async(
        self,
        request: bot_models.StartEvidenceQueryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StartEvidenceQueryResponse:
        """
        Description: 信物链存证查询
        Summary: 信物链存证查询
        """
        UtilClient.validate_model(request)
        return bot_models.StartEvidenceQueryResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.evidence.query.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_thingsdid_register(
        self,
        request: bot_models.StartThingsdidRegisterRequest,
    ) -> bot_models.StartThingsdidRegisterResponse:
        """
        Description: 信物链实体身份注册
        Summary: 信物链实体身份注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_thingsdid_register_ex(request, headers, runtime)

    async def start_thingsdid_register_async(
        self,
        request: bot_models.StartThingsdidRegisterRequest,
    ) -> bot_models.StartThingsdidRegisterResponse:
        """
        Description: 信物链实体身份注册
        Summary: 信物链实体身份注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_thingsdid_register_ex_async(request, headers, runtime)

    def start_thingsdid_register_ex(
        self,
        request: bot_models.StartThingsdidRegisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StartThingsdidRegisterResponse:
        """
        Description: 信物链实体身份注册
        Summary: 信物链实体身份注册
        """
        UtilClient.validate_model(request)
        return bot_models.StartThingsdidRegisterResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.thingsdid.register.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_thingsdid_register_ex_async(
        self,
        request: bot_models.StartThingsdidRegisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StartThingsdidRegisterResponse:
        """
        Description: 信物链实体身份注册
        Summary: 信物链实体身份注册
        """
        UtilClient.validate_model(request)
        return bot_models.StartThingsdidRegisterResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.thingsdid.register.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_thingsdid_asyncprocess(
        self,
        request: bot_models.QueryThingsdidAsyncprocessRequest,
    ) -> bot_models.QueryThingsdidAsyncprocessResponse:
        """
        Description: 信物链异步操作查询
        智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
        Summary: 信物链异步操作查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_thingsdid_asyncprocess_ex(request, headers, runtime)

    async def query_thingsdid_asyncprocess_async(
        self,
        request: bot_models.QueryThingsdidAsyncprocessRequest,
    ) -> bot_models.QueryThingsdidAsyncprocessResponse:
        """
        Description: 信物链异步操作查询
        智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
        Summary: 信物链异步操作查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_thingsdid_asyncprocess_ex_async(request, headers, runtime)

    def query_thingsdid_asyncprocess_ex(
        self,
        request: bot_models.QueryThingsdidAsyncprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryThingsdidAsyncprocessResponse:
        """
        Description: 信物链异步操作查询
        智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
        Summary: 信物链异步操作查询
        """
        UtilClient.validate_model(request)
        return bot_models.QueryThingsdidAsyncprocessResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.thingsdid.asyncprocess.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_thingsdid_asyncprocess_ex_async(
        self,
        request: bot_models.QueryThingsdidAsyncprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryThingsdidAsyncprocessResponse:
        """
        Description: 信物链异步操作查询
        智能合约操作由于比较耗时，因此内部实现通过异步实现，调用完exectuted返回是false的API后，需要调用此api来轮询原先操作是否完成。
        Summary: 信物链异步操作查询
        """
        UtilClient.validate_model(request)
        return bot_models.QueryThingsdidAsyncprocessResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.thingsdid.asyncprocess.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_thingsdid_status(
        self,
        request: bot_models.UpdateThingsdidStatusRequest,
    ) -> bot_models.UpdateThingsdidStatusResponse:
        """
        Description: 信物链身份状态更新，此API目前仅支持设备状态更新
        Summary: 信物链身份状态更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_thingsdid_status_ex(request, headers, runtime)

    async def update_thingsdid_status_async(
        self,
        request: bot_models.UpdateThingsdidStatusRequest,
    ) -> bot_models.UpdateThingsdidStatusResponse:
        """
        Description: 信物链身份状态更新，此API目前仅支持设备状态更新
        Summary: 信物链身份状态更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_thingsdid_status_ex_async(request, headers, runtime)

    def update_thingsdid_status_ex(
        self,
        request: bot_models.UpdateThingsdidStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateThingsdidStatusResponse:
        """
        Description: 信物链身份状态更新，此API目前仅支持设备状态更新
        Summary: 信物链身份状态更新
        """
        UtilClient.validate_model(request)
        return bot_models.UpdateThingsdidStatusResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.thingsdid.status.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_thingsdid_status_ex_async(
        self,
        request: bot_models.UpdateThingsdidStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateThingsdidStatusResponse:
        """
        Description: 信物链身份状态更新，此API目前仅支持设备状态更新
        Summary: 信物链身份状态更新
        """
        UtilClient.validate_model(request)
        return bot_models.UpdateThingsdidStatusResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.thingsdid.status.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_thingsdid_devicespace(
        self,
        request: bot_models.UpdateThingsdidDevicespaceRequest,
    ) -> bot_models.UpdateThingsdidDevicespaceResponse:
        """
        Description: 信物链设备空间关联更新，完成设备和空间关联绑定
        Summary: 信物链设备空间关联更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_thingsdid_devicespace_ex(request, headers, runtime)

    async def update_thingsdid_devicespace_async(
        self,
        request: bot_models.UpdateThingsdidDevicespaceRequest,
    ) -> bot_models.UpdateThingsdidDevicespaceResponse:
        """
        Description: 信物链设备空间关联更新，完成设备和空间关联绑定
        Summary: 信物链设备空间关联更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_thingsdid_devicespace_ex_async(request, headers, runtime)

    def update_thingsdid_devicespace_ex(
        self,
        request: bot_models.UpdateThingsdidDevicespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateThingsdidDevicespaceResponse:
        """
        Description: 信物链设备空间关联更新，完成设备和空间关联绑定
        Summary: 信物链设备空间关联更新
        """
        UtilClient.validate_model(request)
        return bot_models.UpdateThingsdidDevicespaceResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.thingsdid.devicespace.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_thingsdid_devicespace_ex_async(
        self,
        request: bot_models.UpdateThingsdidDevicespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateThingsdidDevicespaceResponse:
        """
        Description: 信物链设备空间关联更新，完成设备和空间关联绑定
        Summary: 信物链设备空间关联更新
        """
        UtilClient.validate_model(request)
        return bot_models.UpdateThingsdidDevicespaceResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.thingsdid.devicespace.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_thingsdid_did(
        self,
        request: bot_models.QueryThingsdidDidRequest,
    ) -> bot_models.QueryThingsdidDidResponse:
        """
        Description: 信物链实体did查询，根据dataFilter过滤输出
        Summary: 信物链实体did查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_thingsdid_did_ex(request, headers, runtime)

    async def query_thingsdid_did_async(
        self,
        request: bot_models.QueryThingsdidDidRequest,
    ) -> bot_models.QueryThingsdidDidResponse:
        """
        Description: 信物链实体did查询，根据dataFilter过滤输出
        Summary: 信物链实体did查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_thingsdid_did_ex_async(request, headers, runtime)

    def query_thingsdid_did_ex(
        self,
        request: bot_models.QueryThingsdidDidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryThingsdidDidResponse:
        """
        Description: 信物链实体did查询，根据dataFilter过滤输出
        Summary: 信物链实体did查询
        """
        UtilClient.validate_model(request)
        return bot_models.QueryThingsdidDidResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.thingsdid.did.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_thingsdid_did_ex_async(
        self,
        request: bot_models.QueryThingsdidDidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.QueryThingsdidDidResponse:
        """
        Description: 信物链实体did查询，根据dataFilter过滤输出
        Summary: 信物链实体did查询
        """
        UtilClient.validate_model(request)
        return bot_models.QueryThingsdidDidResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.thingsdid.did.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_thingsdid_did(
        self,
        request: bot_models.UpdateThingsdidDidRequest,
    ) -> bot_models.UpdateThingsdidDidResponse:
        """
        Description: 信物链实体身份更新，字段空则不更新。
        Summary: 信物链实体身份更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_thingsdid_did_ex(request, headers, runtime)

    async def update_thingsdid_did_async(
        self,
        request: bot_models.UpdateThingsdidDidRequest,
    ) -> bot_models.UpdateThingsdidDidResponse:
        """
        Description: 信物链实体身份更新，字段空则不更新。
        Summary: 信物链实体身份更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_thingsdid_did_ex_async(request, headers, runtime)

    def update_thingsdid_did_ex(
        self,
        request: bot_models.UpdateThingsdidDidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateThingsdidDidResponse:
        """
        Description: 信物链实体身份更新，字段空则不更新。
        Summary: 信物链实体身份更新
        """
        UtilClient.validate_model(request)
        return bot_models.UpdateThingsdidDidResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.thingsdid.did.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_thingsdid_did_ex_async(
        self,
        request: bot_models.UpdateThingsdidDidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateThingsdidDidResponse:
        """
        Description: 信物链实体身份更新，字段空则不更新。
        Summary: 信物链实体身份更新
        """
        UtilClient.validate_model(request)
        return bot_models.UpdateThingsdidDidResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.thingsdid.did.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_tenant_bindinfo(
        self,
        request: bot_models.StartTenantBindinfoRequest,
    ) -> bot_models.StartTenantBindinfoResponse:
        """
        Description: 信物链租户信息关联
        Summary: 信物链租户信息关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_tenant_bindinfo_ex(request, headers, runtime)

    async def start_tenant_bindinfo_async(
        self,
        request: bot_models.StartTenantBindinfoRequest,
    ) -> bot_models.StartTenantBindinfoResponse:
        """
        Description: 信物链租户信息关联
        Summary: 信物链租户信息关联
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_tenant_bindinfo_ex_async(request, headers, runtime)

    def start_tenant_bindinfo_ex(
        self,
        request: bot_models.StartTenantBindinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StartTenantBindinfoResponse:
        """
        Description: 信物链租户信息关联
        Summary: 信物链租户信息关联
        """
        UtilClient.validate_model(request)
        return bot_models.StartTenantBindinfoResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.tenant.bindinfo.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_tenant_bindinfo_ex_async(
        self,
        request: bot_models.StartTenantBindinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.StartTenantBindinfoResponse:
        """
        Description: 信物链租户信息关联
        Summary: 信物链租户信息关联
        """
        UtilClient.validate_model(request)
        return bot_models.StartTenantBindinfoResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.tenant.bindinfo.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_tenant_project(
        self,
        request: bot_models.CreateTenantProjectRequest,
    ) -> bot_models.CreateTenantProjectResponse:
        """
        Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
        Summary: 信物链租户项目创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_tenant_project_ex(request, headers, runtime)

    async def create_tenant_project_async(
        self,
        request: bot_models.CreateTenantProjectRequest,
    ) -> bot_models.CreateTenantProjectResponse:
        """
        Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
        Summary: 信物链租户项目创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_tenant_project_ex_async(request, headers, runtime)

    def create_tenant_project_ex(
        self,
        request: bot_models.CreateTenantProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateTenantProjectResponse:
        """
        Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
        Summary: 信物链租户项目创建
        """
        UtilClient.validate_model(request)
        return bot_models.CreateTenantProjectResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.tenant.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_tenant_project_ex_async(
        self,
        request: bot_models.CreateTenantProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.CreateTenantProjectResponse:
        """
        Description: 信物链租户项目创建，项目可以用来管理同一租户不同业务的存证
        Summary: 信物链租户项目创建
        """
        UtilClient.validate_model(request)
        return bot_models.CreateTenantProjectResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.tenant.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_thingsdid_tenant(
        self,
        request: bot_models.UpdateThingsdidTenantRequest,
    ) -> bot_models.UpdateThingsdidTenantResponse:
        """
        Description: 信物链实体访问权限更新
        所有者/使用者/观察者权限更新
        Summary: 信物链实体访问权限更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_thingsdid_tenant_ex(request, headers, runtime)

    async def update_thingsdid_tenant_async(
        self,
        request: bot_models.UpdateThingsdidTenantRequest,
    ) -> bot_models.UpdateThingsdidTenantResponse:
        """
        Description: 信物链实体访问权限更新
        所有者/使用者/观察者权限更新
        Summary: 信物链实体访问权限更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_thingsdid_tenant_ex_async(request, headers, runtime)

    def update_thingsdid_tenant_ex(
        self,
        request: bot_models.UpdateThingsdidTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateThingsdidTenantResponse:
        """
        Description: 信物链实体访问权限更新
        所有者/使用者/观察者权限更新
        Summary: 信物链实体访问权限更新
        """
        UtilClient.validate_model(request)
        return bot_models.UpdateThingsdidTenantResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.thingsdid.tenant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_thingsdid_tenant_ex_async(
        self,
        request: bot_models.UpdateThingsdidTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.UpdateThingsdidTenantResponse:
        """
        Description: 信物链实体访问权限更新
        所有者/使用者/观察者权限更新
        Summary: 信物链实体访问权限更新
        """
        UtilClient.validate_model(request)
        return bot_models.UpdateThingsdidTenantResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.thingsdid.tenant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def load_tsm_certificatetsm(
        self,
        request: bot_models.LoadTsmCertificatetsmRequest,
    ) -> bot_models.LoadTsmCertificatetsmResponse:
        """
        Description: LoadCertificateTSMCmd，仅限内部使用api
        Summary: TSM迁移内部使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.load_tsm_certificatetsm_ex(request, headers, runtime)

    async def load_tsm_certificatetsm_async(
        self,
        request: bot_models.LoadTsmCertificatetsmRequest,
    ) -> bot_models.LoadTsmCertificatetsmResponse:
        """
        Description: LoadCertificateTSMCmd，仅限内部使用api
        Summary: TSM迁移内部使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.load_tsm_certificatetsm_ex_async(request, headers, runtime)

    def load_tsm_certificatetsm_ex(
        self,
        request: bot_models.LoadTsmCertificatetsmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.LoadTsmCertificatetsmResponse:
        """
        Description: LoadCertificateTSMCmd，仅限内部使用api
        Summary: TSM迁移内部使用
        """
        UtilClient.validate_model(request)
        return bot_models.LoadTsmCertificatetsmResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.tsm.certificatetsm.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def load_tsm_certificatetsm_ex_async(
        self,
        request: bot_models.LoadTsmCertificatetsmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.LoadTsmCertificatetsmResponse:
        """
        Description: LoadCertificateTSMCmd，仅限内部使用api
        Summary: TSM迁移内部使用
        """
        UtilClient.validate_model(request)
        return bot_models.LoadTsmCertificatetsmResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.tsm.certificatetsm.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def load_tsm_resourcefile(
        self,
        request: bot_models.LoadTsmResourcefileRequest,
    ) -> bot_models.LoadTsmResourcefileResponse:
        """
        Description: TSM迁移内部使用
        Summary: loadResourceFile
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.load_tsm_resourcefile_ex(request, headers, runtime)

    async def load_tsm_resourcefile_async(
        self,
        request: bot_models.LoadTsmResourcefileRequest,
    ) -> bot_models.LoadTsmResourcefileResponse:
        """
        Description: TSM迁移内部使用
        Summary: loadResourceFile
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.load_tsm_resourcefile_ex_async(request, headers, runtime)

    def load_tsm_resourcefile_ex(
        self,
        request: bot_models.LoadTsmResourcefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.LoadTsmResourcefileResponse:
        """
        Description: TSM迁移内部使用
        Summary: loadResourceFile
        """
        UtilClient.validate_model(request)
        return bot_models.LoadTsmResourcefileResponse().from_map(
            self.do_request('1.0', 'blockchain.bot.tsm.resourcefile.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def load_tsm_resourcefile_ex_async(
        self,
        request: bot_models.LoadTsmResourcefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> bot_models.LoadTsmResourcefileResponse:
        """
        Description: TSM迁移内部使用
        Summary: loadResourceFile
        """
        UtilClient.validate_model(request)
        return bot_models.LoadTsmResourcefileResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.bot.tsm.resourcefile.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
