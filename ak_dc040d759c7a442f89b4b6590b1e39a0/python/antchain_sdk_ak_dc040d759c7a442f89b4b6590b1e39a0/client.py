# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_dc040d759c7a442f89b4b6590b1e39a0 import models as ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models
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
        config: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.Config,
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
            # ekyt响应头
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
                    '_prod_code': 'ak_dc040d759c7a442f89b4b6590b1e39a0',
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
            # ekyt响应头
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
                    '_prod_code': 'ak_dc040d759c7a442f89b4b6590b1e39a0',
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

    def operate_blockchain_bot_iotbasic_devicecollect(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicDevicecollectRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicDevicecollectResponse:
        """
        Description: IoT设备平台-设备上链
        Summary: IoT设备平台-设备上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_blockchain_bot_iotbasic_devicecollect_ex(request, headers, runtime)

    async def operate_blockchain_bot_iotbasic_devicecollect_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicDevicecollectRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicDevicecollectResponse:
        """
        Description: IoT设备平台-设备上链
        Summary: IoT设备平台-设备上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_blockchain_bot_iotbasic_devicecollect_ex_async(request, headers, runtime)

    def operate_blockchain_bot_iotbasic_devicecollect_ex(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicDevicecollectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicDevicecollectResponse:
        """
        Description: IoT设备平台-设备上链
        Summary: IoT设备平台-设备上链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicDevicecollectResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.devicecollect.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_blockchain_bot_iotbasic_devicecollect_ex_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicDevicecollectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicDevicecollectResponse:
        """
        Description: IoT设备平台-设备上链
        Summary: IoT设备平台-设备上链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicDevicecollectResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.devicecollect.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_blockchain_bot_iotbasic_batchcollect(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicBatchcollectRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicBatchcollectResponse:
        """
        Description: IoT设备平台-批量数据上链
        Summary: IoT设备平台-批量数据上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_blockchain_bot_iotbasic_batchcollect_ex(request, headers, runtime)

    async def operate_blockchain_bot_iotbasic_batchcollect_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicBatchcollectRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicBatchcollectResponse:
        """
        Description: IoT设备平台-批量数据上链
        Summary: IoT设备平台-批量数据上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_blockchain_bot_iotbasic_batchcollect_ex_async(request, headers, runtime)

    def operate_blockchain_bot_iotbasic_batchcollect_ex(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicBatchcollectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicBatchcollectResponse:
        """
        Description: IoT设备平台-批量数据上链
        Summary: IoT设备平台-批量数据上链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicBatchcollectResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.batchcollect.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_blockchain_bot_iotbasic_batchcollect_ex_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicBatchcollectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicBatchcollectResponse:
        """
        Description: IoT设备平台-批量数据上链
        Summary: IoT设备平台-批量数据上链
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.OperateBlockchainBotIotbasicBatchcollectResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.batchcollect.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockchain_bot_iotbasic_devicecollect(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotIotbasicDevicecollectRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotIotbasicDevicecollectResponse:
        """
        Description: 上链数据分页查询
        Summary: 上链数据分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bot_iotbasic_devicecollect_ex(request, headers, runtime)

    async def query_blockchain_bot_iotbasic_devicecollect_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotIotbasicDevicecollectRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotIotbasicDevicecollectResponse:
        """
        Description: 上链数据分页查询
        Summary: 上链数据分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bot_iotbasic_devicecollect_ex_async(request, headers, runtime)

    def query_blockchain_bot_iotbasic_devicecollect_ex(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotIotbasicDevicecollectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotIotbasicDevicecollectResponse:
        """
        Description: 上链数据分页查询
        Summary: 上链数据分页查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotIotbasicDevicecollectResponse(),
            self.do_request('1.0', 'blockchain.bot.iotbasic.devicecollect.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bot_iotbasic_devicecollect_ex_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotIotbasicDevicecollectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotIotbasicDevicecollectResponse:
        """
        Description: 上链数据分页查询
        Summary: 上链数据分页查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotIotbasicDevicecollectResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.iotbasic.devicecollect.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antsecuritytech_gateway_ekyt_driver(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryAntsecuritytechGatewayEkytDriverRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryAntsecuritytechGatewayEkytDriverResponse:
        """
        Description: eKYT风险评估服务-出行场景司机
        Summary: eKYT风险评估服务-出行场景司机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antsecuritytech_gateway_ekyt_driver_ex(request, headers, runtime)

    async def query_antsecuritytech_gateway_ekyt_driver_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryAntsecuritytechGatewayEkytDriverRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryAntsecuritytechGatewayEkytDriverResponse:
        """
        Description: eKYT风险评估服务-出行场景司机
        Summary: eKYT风险评估服务-出行场景司机
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antsecuritytech_gateway_ekyt_driver_ex_async(request, headers, runtime)

    def query_antsecuritytech_gateway_ekyt_driver_ex(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryAntsecuritytechGatewayEkytDriverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryAntsecuritytechGatewayEkytDriverResponse:
        """
        Description: eKYT风险评估服务-出行场景司机
        Summary: eKYT风险评估服务-出行场景司机
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryAntsecuritytechGatewayEkytDriverResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.ekyt.driver.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antsecuritytech_gateway_ekyt_driver_ex_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryAntsecuritytechGatewayEkytDriverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryAntsecuritytechGatewayEkytDriverResponse:
        """
        Description: eKYT风险评估服务-出行场景司机
        Summary: eKYT风险评估服务-出行场景司机
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryAntsecuritytechGatewayEkytDriverResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.ekyt.driver.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_antsecuritytech_gateway_iifaa_devicekey(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.ApplyAntsecuritytechGatewayIifaaDevicekeyRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.ApplyAntsecuritytechGatewayIifaaDevicekeyResponse:
        """
        Description: 申请设备设备密钥
        Summary: 申请设备设备密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_antsecuritytech_gateway_iifaa_devicekey_ex(request, headers, runtime)

    async def apply_antsecuritytech_gateway_iifaa_devicekey_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.ApplyAntsecuritytechGatewayIifaaDevicekeyRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.ApplyAntsecuritytechGatewayIifaaDevicekeyResponse:
        """
        Description: 申请设备设备密钥
        Summary: 申请设备设备密钥
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_antsecuritytech_gateway_iifaa_devicekey_ex_async(request, headers, runtime)

    def apply_antsecuritytech_gateway_iifaa_devicekey_ex(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.ApplyAntsecuritytechGatewayIifaaDevicekeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.ApplyAntsecuritytechGatewayIifaaDevicekeyResponse:
        """
        Description: 申请设备设备密钥
        Summary: 申请设备设备密钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.ApplyAntsecuritytechGatewayIifaaDevicekeyResponse(),
            self.do_request('1.0', 'antsecuritytech.gateway.iifaa.devicekey.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_antsecuritytech_gateway_iifaa_devicekey_ex_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.ApplyAntsecuritytechGatewayIifaaDevicekeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.ApplyAntsecuritytechGatewayIifaaDevicekeyResponse:
        """
        Description: 申请设备设备密钥
        Summary: 申请设备设备密钥
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.ApplyAntsecuritytechGatewayIifaaDevicekeyResponse(),
            await self.do_request_async('1.0', 'antsecuritytech.gateway.iifaa.devicekey.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_blockchain_bot_devicecorp_thingmodel(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CreateBlockchainBotDevicecorpThingmodelRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CreateBlockchainBotDevicecorpThingmodelResponse:
        """
        Description: iotbasic-设备厂商创建物模型
        Summary: iotbasic-设备厂商创建物模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_blockchain_bot_devicecorp_thingmodel_ex(request, headers, runtime)

    async def create_blockchain_bot_devicecorp_thingmodel_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CreateBlockchainBotDevicecorpThingmodelRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CreateBlockchainBotDevicecorpThingmodelResponse:
        """
        Description: iotbasic-设备厂商创建物模型
        Summary: iotbasic-设备厂商创建物模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_blockchain_bot_devicecorp_thingmodel_ex_async(request, headers, runtime)

    def create_blockchain_bot_devicecorp_thingmodel_ex(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CreateBlockchainBotDevicecorpThingmodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CreateBlockchainBotDevicecorpThingmodelResponse:
        """
        Description: iotbasic-设备厂商创建物模型
        Summary: iotbasic-设备厂商创建物模型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CreateBlockchainBotDevicecorpThingmodelResponse(),
            self.do_request('1.0', 'blockchain.bot.devicecorp.thingmodel.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_blockchain_bot_devicecorp_thingmodel_ex_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CreateBlockchainBotDevicecorpThingmodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CreateBlockchainBotDevicecorpThingmodelResponse:
        """
        Description: iotbasic-设备厂商创建物模型
        Summary: iotbasic-设备厂商创建物模型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CreateBlockchainBotDevicecorpThingmodelResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.devicecorp.thingmodel.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_blockchain_bot_devicecorp_thingmodel(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.DeleteBlockchainBotDevicecorpThingmodelRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.DeleteBlockchainBotDevicecorpThingmodelResponse:
        """
        Description: iotbasic-设备厂商删除物模型
        Summary: iotbasic-设备厂商删除物模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_blockchain_bot_devicecorp_thingmodel_ex(request, headers, runtime)

    async def delete_blockchain_bot_devicecorp_thingmodel_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.DeleteBlockchainBotDevicecorpThingmodelRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.DeleteBlockchainBotDevicecorpThingmodelResponse:
        """
        Description: iotbasic-设备厂商删除物模型
        Summary: iotbasic-设备厂商删除物模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_blockchain_bot_devicecorp_thingmodel_ex_async(request, headers, runtime)

    def delete_blockchain_bot_devicecorp_thingmodel_ex(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.DeleteBlockchainBotDevicecorpThingmodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.DeleteBlockchainBotDevicecorpThingmodelResponse:
        """
        Description: iotbasic-设备厂商删除物模型
        Summary: iotbasic-设备厂商删除物模型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.DeleteBlockchainBotDevicecorpThingmodelResponse(),
            self.do_request('1.0', 'blockchain.bot.devicecorp.thingmodel.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_blockchain_bot_devicecorp_thingmodel_ex_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.DeleteBlockchainBotDevicecorpThingmodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.DeleteBlockchainBotDevicecorpThingmodelResponse:
        """
        Description: iotbasic-设备厂商删除物模型
        Summary: iotbasic-设备厂商删除物模型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.DeleteBlockchainBotDevicecorpThingmodelResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.devicecorp.thingmodel.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def publish_blockchain_bot_devicecorp_thingmodel(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PublishBlockchainBotDevicecorpThingmodelRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PublishBlockchainBotDevicecorpThingmodelResponse:
        """
        Description: iotbasic-设备厂商发布物模型
        Summary: iotbasic-设备厂商发布物模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.publish_blockchain_bot_devicecorp_thingmodel_ex(request, headers, runtime)

    async def publish_blockchain_bot_devicecorp_thingmodel_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PublishBlockchainBotDevicecorpThingmodelRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PublishBlockchainBotDevicecorpThingmodelResponse:
        """
        Description: iotbasic-设备厂商发布物模型
        Summary: iotbasic-设备厂商发布物模型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.publish_blockchain_bot_devicecorp_thingmodel_ex_async(request, headers, runtime)

    def publish_blockchain_bot_devicecorp_thingmodel_ex(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PublishBlockchainBotDevicecorpThingmodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PublishBlockchainBotDevicecorpThingmodelResponse:
        """
        Description: iotbasic-设备厂商发布物模型
        Summary: iotbasic-设备厂商发布物模型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PublishBlockchainBotDevicecorpThingmodelResponse(),
            self.do_request('1.0', 'blockchain.bot.devicecorp.thingmodel.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def publish_blockchain_bot_devicecorp_thingmodel_ex_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PublishBlockchainBotDevicecorpThingmodelRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PublishBlockchainBotDevicecorpThingmodelResponse:
        """
        Description: iotbasic-设备厂商发布物模型
        Summary: iotbasic-设备厂商发布物模型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PublishBlockchainBotDevicecorpThingmodelResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.devicecorp.thingmodel.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sign_blockchain_bot_digitalkey_withhold(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.SignBlockchainBotDigitalkeyWithholdRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.SignBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣签约链接获取
        Summary: 代扣签约链接获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sign_blockchain_bot_digitalkey_withhold_ex(request, headers, runtime)

    async def sign_blockchain_bot_digitalkey_withhold_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.SignBlockchainBotDigitalkeyWithholdRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.SignBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣签约链接获取
        Summary: 代扣签约链接获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sign_blockchain_bot_digitalkey_withhold_ex_async(request, headers, runtime)

    def sign_blockchain_bot_digitalkey_withhold_ex(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.SignBlockchainBotDigitalkeyWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.SignBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣签约链接获取
        Summary: 代扣签约链接获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.SignBlockchainBotDigitalkeyWithholdResponse(),
            self.do_request('1.0', 'blockchain.bot.digitalkey.withhold.sign', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sign_blockchain_bot_digitalkey_withhold_ex_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.SignBlockchainBotDigitalkeyWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.SignBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣签约链接获取
        Summary: 代扣签约链接获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.SignBlockchainBotDigitalkeyWithholdResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.digitalkey.withhold.sign', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unbind_blockchain_bot_digitalkey_withhold(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.UnbindBlockchainBotDigitalkeyWithholdRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.UnbindBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣签约解除
        Summary: 代扣签约解除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unbind_blockchain_bot_digitalkey_withhold_ex(request, headers, runtime)

    async def unbind_blockchain_bot_digitalkey_withhold_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.UnbindBlockchainBotDigitalkeyWithholdRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.UnbindBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣签约解除
        Summary: 代扣签约解除
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unbind_blockchain_bot_digitalkey_withhold_ex_async(request, headers, runtime)

    def unbind_blockchain_bot_digitalkey_withhold_ex(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.UnbindBlockchainBotDigitalkeyWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.UnbindBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣签约解除
        Summary: 代扣签约解除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.UnbindBlockchainBotDigitalkeyWithholdResponse(),
            self.do_request('1.0', 'blockchain.bot.digitalkey.withhold.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unbind_blockchain_bot_digitalkey_withhold_ex_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.UnbindBlockchainBotDigitalkeyWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.UnbindBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣签约解除
        Summary: 代扣签约解除
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.UnbindBlockchainBotDigitalkeyWithholdResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.digitalkey.withhold.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pay_blockchain_bot_digitalkey_withhold(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PayBlockchainBotDigitalkeyWithholdRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PayBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣支付
        Summary: 代扣支付
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pay_blockchain_bot_digitalkey_withhold_ex(request, headers, runtime)

    async def pay_blockchain_bot_digitalkey_withhold_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PayBlockchainBotDigitalkeyWithholdRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PayBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣支付
        Summary: 代扣支付
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pay_blockchain_bot_digitalkey_withhold_ex_async(request, headers, runtime)

    def pay_blockchain_bot_digitalkey_withhold_ex(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PayBlockchainBotDigitalkeyWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PayBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣支付
        Summary: 代扣支付
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PayBlockchainBotDigitalkeyWithholdResponse(),
            self.do_request('1.0', 'blockchain.bot.digitalkey.withhold.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pay_blockchain_bot_digitalkey_withhold_ex_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PayBlockchainBotDigitalkeyWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PayBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣支付
        Summary: 代扣支付
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.PayBlockchainBotDigitalkeyWithholdResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.digitalkey.withhold.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def refuse_blockchain_bot_digitalkey_withhold(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.RefuseBlockchainBotDigitalkeyWithholdRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.RefuseBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣支付退款
        Summary: 代扣支付退款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.refuse_blockchain_bot_digitalkey_withhold_ex(request, headers, runtime)

    async def refuse_blockchain_bot_digitalkey_withhold_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.RefuseBlockchainBotDigitalkeyWithholdRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.RefuseBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣支付退款
        Summary: 代扣支付退款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.refuse_blockchain_bot_digitalkey_withhold_ex_async(request, headers, runtime)

    def refuse_blockchain_bot_digitalkey_withhold_ex(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.RefuseBlockchainBotDigitalkeyWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.RefuseBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣支付退款
        Summary: 代扣支付退款
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.RefuseBlockchainBotDigitalkeyWithholdResponse(),
            self.do_request('1.0', 'blockchain.bot.digitalkey.withhold.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def refuse_blockchain_bot_digitalkey_withhold_ex_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.RefuseBlockchainBotDigitalkeyWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.RefuseBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣支付退款
        Summary: 代扣支付退款
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.RefuseBlockchainBotDigitalkeyWithholdResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.digitalkey.withhold.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_blockchain_bot_digitalkey_withhold(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotDigitalkeyWithholdRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣协议查询
        Summary: 代扣协议查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_blockchain_bot_digitalkey_withhold_ex(request, headers, runtime)

    async def query_blockchain_bot_digitalkey_withhold_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotDigitalkeyWithholdRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣协议查询
        Summary: 代扣协议查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_blockchain_bot_digitalkey_withhold_ex_async(request, headers, runtime)

    def query_blockchain_bot_digitalkey_withhold_ex(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotDigitalkeyWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣协议查询
        Summary: 代扣协议查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotDigitalkeyWithholdResponse(),
            self.do_request('1.0', 'blockchain.bot.digitalkey.withhold.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_blockchain_bot_digitalkey_withhold_ex_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotDigitalkeyWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣协议查询
        Summary: 代扣协议查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.QueryBlockchainBotDigitalkeyWithholdResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.digitalkey.withhold.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_blockchain_bot_digitalkey_withhold(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CancelBlockchainBotDigitalkeyWithholdRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CancelBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣撤销
        Summary: 代扣撤销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_blockchain_bot_digitalkey_withhold_ex(request, headers, runtime)

    async def cancel_blockchain_bot_digitalkey_withhold_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CancelBlockchainBotDigitalkeyWithholdRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CancelBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣撤销
        Summary: 代扣撤销
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_blockchain_bot_digitalkey_withhold_ex_async(request, headers, runtime)

    def cancel_blockchain_bot_digitalkey_withhold_ex(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CancelBlockchainBotDigitalkeyWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CancelBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣撤销
        Summary: 代扣撤销
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CancelBlockchainBotDigitalkeyWithholdResponse(),
            self.do_request('1.0', 'blockchain.bot.digitalkey.withhold.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_blockchain_bot_digitalkey_withhold_ex_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CancelBlockchainBotDigitalkeyWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CancelBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣撤销
        Summary: 代扣撤销
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.CancelBlockchainBotDigitalkeyWithholdResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.digitalkey.withhold.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_blockchain_bot_digitalkey_withhold(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.NotifyBlockchainBotDigitalkeyWithholdRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.NotifyBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣扣款前预通知
        Summary: 代扣扣款前预通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_blockchain_bot_digitalkey_withhold_ex(request, headers, runtime)

    async def notify_blockchain_bot_digitalkey_withhold_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.NotifyBlockchainBotDigitalkeyWithholdRequest,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.NotifyBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣扣款前预通知
        Summary: 代扣扣款前预通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_blockchain_bot_digitalkey_withhold_ex_async(request, headers, runtime)

    def notify_blockchain_bot_digitalkey_withhold_ex(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.NotifyBlockchainBotDigitalkeyWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.NotifyBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣扣款前预通知
        Summary: 代扣扣款前预通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.NotifyBlockchainBotDigitalkeyWithholdResponse(),
            self.do_request('1.0', 'blockchain.bot.digitalkey.withhold.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_blockchain_bot_digitalkey_withhold_ex_async(
        self,
        request: ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.NotifyBlockchainBotDigitalkeyWithholdRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.NotifyBlockchainBotDigitalkeyWithholdResponse:
        """
        Description: 代扣扣款前预通知
        Summary: 代扣扣款前预通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_dc_040d_759c_7a_442f_89b_4b_6590b_1e_39a_0_models.NotifyBlockchainBotDigitalkeyWithholdResponse(),
            await self.do_request_async('1.0', 'blockchain.bot.digitalkey.withhold.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
