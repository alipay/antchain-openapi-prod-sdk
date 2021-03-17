# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from typing import Dict

from antchain_sdk_arec import models as arec_models
from alibabacloud_tea_util.client import Client as UtilClient
from alibabacloud_tea_util import models as util_models
from antchain_alipay_util.client import Client as AntchainUtilClient
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
        config: arec_models.Config,
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
            # 个人
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
                    'req_time': AntchainUtilClient.get_timestamp(),
                    'req_msg_id': AntchainUtilClient.get_nonce(),
                    'access_key': self._access_key_id,
                    'base_sdk_version': 'TeaSDK-2.0',
                    'sdk_version': '1.4.10'
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
                _request.query['sign'] = AntchainUtilClient.get_signature(signed_param, self._access_key_secret)
                _last_request = _request
                _response = TeaCore.do_action(_request, _runtime)
                raw = UtilClient.read_as_string(_response.body)
                obj = UtilClient.parse_json(raw)
                res = UtilClient.assert_as_map(obj)
                resp = UtilClient.assert_as_map(res.get('response'))
                if AntchainUtilClient.has_error(raw, self._access_key_secret):
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
            # 个人
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
                    'req_time': AntchainUtilClient.get_timestamp(),
                    'req_msg_id': AntchainUtilClient.get_nonce(),
                    'access_key': self._access_key_id,
                    'base_sdk_version': 'TeaSDK-2.0',
                    'sdk_version': '1.4.10'
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
                _request.query['sign'] = AntchainUtilClient.get_signature(signed_param, self._access_key_secret)
                _last_request = _request
                _response = await TeaCore.async_do_action(_request, _runtime)
                raw = await UtilClient.read_as_string_async(_response.body)
                obj = UtilClient.parse_json(raw)
                res = UtilClient.assert_as_map(obj)
                resp = UtilClient.assert_as_map(res.get('response'))
                if AntchainUtilClient.has_error(raw, self._access_key_secret):
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

    def start_rcp_hq(
        self,
        request: arec_models.StartRcpHqRequest,
    ) -> arec_models.StartRcpHqResponse:
        """
        Description: 发起房产查询
        Summary: 发起房产查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_rcp_hq_ex(request, headers, runtime)

    async def start_rcp_hq_async(
        self,
        request: arec_models.StartRcpHqRequest,
    ) -> arec_models.StartRcpHqResponse:
        """
        Description: 发起房产查询
        Summary: 发起房产查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_rcp_hq_ex_async(request, headers, runtime)

    def start_rcp_hq_ex(
        self,
        request: arec_models.StartRcpHqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.StartRcpHqResponse:
        """
        Description: 发起房产查询
        Summary: 发起房产查询
        """
        UtilClient.validate_model(request)
        return arec_models.StartRcpHqResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.rcp.hq.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_rcp_hq_ex_async(
        self,
        request: arec_models.StartRcpHqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.StartRcpHqResponse:
        """
        Description: 发起房产查询
        Summary: 发起房产查询
        """
        UtilClient.validate_model(request)
        return arec_models.StartRcpHqResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.rcp.hq.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_rcp_hq(
        self,
        request: arec_models.GetRcpHqRequest,
    ) -> arec_models.GetRcpHqResponse:
        """
        Description: 获取房产查询单信息
        Summary: 获取房产查询单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_rcp_hq_ex(request, headers, runtime)

    async def get_rcp_hq_async(
        self,
        request: arec_models.GetRcpHqRequest,
    ) -> arec_models.GetRcpHqResponse:
        """
        Description: 获取房产查询单信息
        Summary: 获取房产查询单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_rcp_hq_ex_async(request, headers, runtime)

    def get_rcp_hq_ex(
        self,
        request: arec_models.GetRcpHqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.GetRcpHqResponse:
        """
        Description: 获取房产查询单信息
        Summary: 获取房产查询单信息
        """
        UtilClient.validate_model(request)
        return arec_models.GetRcpHqResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.rcp.hq.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_rcp_hq_ex_async(
        self,
        request: arec_models.GetRcpHqRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.GetRcpHqResponse:
        """
        Description: 获取房产查询单信息
        Summary: 获取房产查询单信息
        """
        UtilClient.validate_model(request)
        return arec_models.GetRcpHqResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.rcp.hq.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_rcp_mgr(
        self,
        request: arec_models.StartRcpMgrRequest,
    ) -> arec_models.StartRcpMgrResponse:
        """
        Description: 发起解抵押(宁波模式)
        Summary: 发起解抵押(宁波模式)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_rcp_mgr_ex(request, headers, runtime)

    async def start_rcp_mgr_async(
        self,
        request: arec_models.StartRcpMgrRequest,
    ) -> arec_models.StartRcpMgrResponse:
        """
        Description: 发起解抵押(宁波模式)
        Summary: 发起解抵押(宁波模式)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_rcp_mgr_ex_async(request, headers, runtime)

    def start_rcp_mgr_ex(
        self,
        request: arec_models.StartRcpMgrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.StartRcpMgrResponse:
        """
        Description: 发起解抵押(宁波模式)
        Summary: 发起解抵押(宁波模式)
        """
        UtilClient.validate_model(request)
        return arec_models.StartRcpMgrResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.rcp.mgr.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_rcp_mgr_ex_async(
        self,
        request: arec_models.StartRcpMgrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.StartRcpMgrResponse:
        """
        Description: 发起解抵押(宁波模式)
        Summary: 发起解抵押(宁波模式)
        """
        UtilClient.validate_model(request)
        return arec_models.StartRcpMgrResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.rcp.mgr.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_rcp_mgr(
        self,
        request: arec_models.ConfirmRcpMgrRequest,
    ) -> arec_models.ConfirmRcpMgrResponse:
        """
        Description: 确认解抵押(宁波模式)
        Summary: 确认解抵押(宁波模式)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_rcp_mgr_ex(request, headers, runtime)

    async def confirm_rcp_mgr_async(
        self,
        request: arec_models.ConfirmRcpMgrRequest,
    ) -> arec_models.ConfirmRcpMgrResponse:
        """
        Description: 确认解抵押(宁波模式)
        Summary: 确认解抵押(宁波模式)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_rcp_mgr_ex_async(request, headers, runtime)

    def confirm_rcp_mgr_ex(
        self,
        request: arec_models.ConfirmRcpMgrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.ConfirmRcpMgrResponse:
        """
        Description: 确认解抵押(宁波模式)
        Summary: 确认解抵押(宁波模式)
        """
        UtilClient.validate_model(request)
        return arec_models.ConfirmRcpMgrResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.rcp.mgr.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_rcp_mgr_ex_async(
        self,
        request: arec_models.ConfirmRcpMgrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.ConfirmRcpMgrResponse:
        """
        Description: 确认解抵押(宁波模式)
        Summary: 确认解抵押(宁波模式)
        """
        UtilClient.validate_model(request)
        return arec_models.ConfirmRcpMgrResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.rcp.mgr.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_rcp_mgr(
        self,
        request: arec_models.GetRcpMgrRequest,
    ) -> arec_models.GetRcpMgrResponse:
        """
        Description: 查询解抵押单(宁波模式)
        Summary: 查询解抵押单(宁波模式)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_rcp_mgr_ex(request, headers, runtime)

    async def get_rcp_mgr_async(
        self,
        request: arec_models.GetRcpMgrRequest,
    ) -> arec_models.GetRcpMgrResponse:
        """
        Description: 查询解抵押单(宁波模式)
        Summary: 查询解抵押单(宁波模式)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_rcp_mgr_ex_async(request, headers, runtime)

    def get_rcp_mgr_ex(
        self,
        request: arec_models.GetRcpMgrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.GetRcpMgrResponse:
        """
        Description: 查询解抵押单(宁波模式)
        Summary: 查询解抵押单(宁波模式)
        """
        UtilClient.validate_model(request)
        return arec_models.GetRcpMgrResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.rcp.mgr.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_rcp_mgr_ex_async(
        self,
        request: arec_models.GetRcpMgrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.GetRcpMgrResponse:
        """
        Description: 查询解抵押单(宁波模式)
        Summary: 查询解抵押单(宁波模式)
        """
        UtilClient.validate_model(request)
        return arec_models.GetRcpMgrResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.rcp.mgr.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_rcp_mg(
        self,
        request: arec_models.StartRcpMgRequest,
    ) -> arec_models.StartRcpMgResponse:
        """
        Description: 房屋抵押贷款业务，发起抵押登记服务
        Summary: 发起抵押登记
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_rcp_mg_ex(request, headers, runtime)

    async def start_rcp_mg_async(
        self,
        request: arec_models.StartRcpMgRequest,
    ) -> arec_models.StartRcpMgResponse:
        """
        Description: 房屋抵押贷款业务，发起抵押登记服务
        Summary: 发起抵押登记
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_rcp_mg_ex_async(request, headers, runtime)

    def start_rcp_mg_ex(
        self,
        request: arec_models.StartRcpMgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.StartRcpMgResponse:
        """
        Description: 房屋抵押贷款业务，发起抵押登记服务
        Summary: 发起抵押登记
        """
        UtilClient.validate_model(request)
        return arec_models.StartRcpMgResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.rcp.mg.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_rcp_mg_ex_async(
        self,
        request: arec_models.StartRcpMgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.StartRcpMgResponse:
        """
        Description: 房屋抵押贷款业务，发起抵押登记服务
        Summary: 发起抵押登记
        """
        UtilClient.validate_model(request)
        return arec_models.StartRcpMgResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.rcp.mg.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_rcp_mg(
        self,
        request: arec_models.GetRcpMgRequest,
    ) -> arec_models.GetRcpMgResponse:
        """
        Description: 根据抵押单号查询抵押单
        Summary: 查询抵押单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_rcp_mg_ex(request, headers, runtime)

    async def get_rcp_mg_async(
        self,
        request: arec_models.GetRcpMgRequest,
    ) -> arec_models.GetRcpMgResponse:
        """
        Description: 根据抵押单号查询抵押单
        Summary: 查询抵押单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_rcp_mg_ex_async(request, headers, runtime)

    def get_rcp_mg_ex(
        self,
        request: arec_models.GetRcpMgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.GetRcpMgResponse:
        """
        Description: 根据抵押单号查询抵押单
        Summary: 查询抵押单
        """
        UtilClient.validate_model(request)
        return arec_models.GetRcpMgResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.rcp.mg.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_rcp_mg_ex_async(
        self,
        request: arec_models.GetRcpMgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.GetRcpMgResponse:
        """
        Description: 根据抵押单号查询抵押单
        Summary: 查询抵押单
        """
        UtilClient.validate_model(request)
        return arec_models.GetRcpMgResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.rcp.mg.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_rcp_mg(
        self,
        request: arec_models.ConfirmRcpMgRequest,
    ) -> arec_models.ConfirmRcpMgResponse:
        """
        Description: 房屋抵押登记业务，银行确认抵押登记服务
        Summary: 确认抵押登记
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_rcp_mg_ex(request, headers, runtime)

    async def confirm_rcp_mg_async(
        self,
        request: arec_models.ConfirmRcpMgRequest,
    ) -> arec_models.ConfirmRcpMgResponse:
        """
        Description: 房屋抵押登记业务，银行确认抵押登记服务
        Summary: 确认抵押登记
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_rcp_mg_ex_async(request, headers, runtime)

    def confirm_rcp_mg_ex(
        self,
        request: arec_models.ConfirmRcpMgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.ConfirmRcpMgResponse:
        """
        Description: 房屋抵押登记业务，银行确认抵押登记服务
        Summary: 确认抵押登记
        """
        UtilClient.validate_model(request)
        return arec_models.ConfirmRcpMgResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.rcp.mg.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_rcp_mg_ex_async(
        self,
        request: arec_models.ConfirmRcpMgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.ConfirmRcpMgResponse:
        """
        Description: 房屋抵押登记业务，银行确认抵押登记服务
        Summary: 确认抵押登记
        """
        UtilClient.validate_model(request)
        return arec_models.ConfirmRcpMgResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.rcp.mg.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_rcp_mg(
        self,
        request: arec_models.InitRcpMgRequest,
    ) -> arec_models.InitRcpMgResponse:
        """
        Description: 确认预抵押登记，预抵押登记是正式抵押登记前置步骤
        Summary: 确认进行预抵押登记
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_rcp_mg_ex(request, headers, runtime)

    async def init_rcp_mg_async(
        self,
        request: arec_models.InitRcpMgRequest,
    ) -> arec_models.InitRcpMgResponse:
        """
        Description: 确认预抵押登记，预抵押登记是正式抵押登记前置步骤
        Summary: 确认进行预抵押登记
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_rcp_mg_ex_async(request, headers, runtime)

    def init_rcp_mg_ex(
        self,
        request: arec_models.InitRcpMgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.InitRcpMgResponse:
        """
        Description: 确认预抵押登记，预抵押登记是正式抵押登记前置步骤
        Summary: 确认进行预抵押登记
        """
        UtilClient.validate_model(request)
        return arec_models.InitRcpMgResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.rcp.mg.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_rcp_mg_ex_async(
        self,
        request: arec_models.InitRcpMgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.InitRcpMgResponse:
        """
        Description: 确认预抵押登记，预抵押登记是正式抵押登记前置步骤
        Summary: 确认进行预抵押登记
        """
        UtilClient.validate_model(request)
        return arec_models.InitRcpMgResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.rcp.mg.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_rcp_mgvtwo(
        self,
        request: arec_models.StartRcpMgvtwoRequest,
    ) -> arec_models.StartRcpMgvtwoResponse:
        """
        Description: 发起抵押(宁波模式)
        Summary: 发起抵押(宁波模式)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_rcp_mgvtwo_ex(request, headers, runtime)

    async def start_rcp_mgvtwo_async(
        self,
        request: arec_models.StartRcpMgvtwoRequest,
    ) -> arec_models.StartRcpMgvtwoResponse:
        """
        Description: 发起抵押(宁波模式)
        Summary: 发起抵押(宁波模式)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_rcp_mgvtwo_ex_async(request, headers, runtime)

    def start_rcp_mgvtwo_ex(
        self,
        request: arec_models.StartRcpMgvtwoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.StartRcpMgvtwoResponse:
        """
        Description: 发起抵押(宁波模式)
        Summary: 发起抵押(宁波模式)
        """
        UtilClient.validate_model(request)
        return arec_models.StartRcpMgvtwoResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.rcp.mgvtwo.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_rcp_mgvtwo_ex_async(
        self,
        request: arec_models.StartRcpMgvtwoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.StartRcpMgvtwoResponse:
        """
        Description: 发起抵押(宁波模式)
        Summary: 发起抵押(宁波模式)
        """
        UtilClient.validate_model(request)
        return arec_models.StartRcpMgvtwoResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.rcp.mgvtwo.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_rcp_mgvtwo(
        self,
        request: arec_models.ConfirmRcpMgvtwoRequest,
    ) -> arec_models.ConfirmRcpMgvtwoResponse:
        """
        Description: 确认抵押(宁波模式)
        Summary: 确认抵押(宁波模式)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_rcp_mgvtwo_ex(request, headers, runtime)

    async def confirm_rcp_mgvtwo_async(
        self,
        request: arec_models.ConfirmRcpMgvtwoRequest,
    ) -> arec_models.ConfirmRcpMgvtwoResponse:
        """
        Description: 确认抵押(宁波模式)
        Summary: 确认抵押(宁波模式)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_rcp_mgvtwo_ex_async(request, headers, runtime)

    def confirm_rcp_mgvtwo_ex(
        self,
        request: arec_models.ConfirmRcpMgvtwoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.ConfirmRcpMgvtwoResponse:
        """
        Description: 确认抵押(宁波模式)
        Summary: 确认抵押(宁波模式)
        """
        UtilClient.validate_model(request)
        return arec_models.ConfirmRcpMgvtwoResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.rcp.mgvtwo.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_rcp_mgvtwo_ex_async(
        self,
        request: arec_models.ConfirmRcpMgvtwoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.ConfirmRcpMgvtwoResponse:
        """
        Description: 确认抵押(宁波模式)
        Summary: 确认抵押(宁波模式)
        """
        UtilClient.validate_model(request)
        return arec_models.ConfirmRcpMgvtwoResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.rcp.mgvtwo.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def close_rcp_mgvtwo(
        self,
        request: arec_models.CloseRcpMgvtwoRequest,
    ) -> arec_models.CloseRcpMgvtwoResponse:
        """
        Description: 终止抵押(宁波模式)
        Summary: 终止抵押(宁波模式)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.close_rcp_mgvtwo_ex(request, headers, runtime)

    async def close_rcp_mgvtwo_async(
        self,
        request: arec_models.CloseRcpMgvtwoRequest,
    ) -> arec_models.CloseRcpMgvtwoResponse:
        """
        Description: 终止抵押(宁波模式)
        Summary: 终止抵押(宁波模式)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.close_rcp_mgvtwo_ex_async(request, headers, runtime)

    def close_rcp_mgvtwo_ex(
        self,
        request: arec_models.CloseRcpMgvtwoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.CloseRcpMgvtwoResponse:
        """
        Description: 终止抵押(宁波模式)
        Summary: 终止抵押(宁波模式)
        """
        UtilClient.validate_model(request)
        return arec_models.CloseRcpMgvtwoResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.rcp.mgvtwo.close', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def close_rcp_mgvtwo_ex_async(
        self,
        request: arec_models.CloseRcpMgvtwoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.CloseRcpMgvtwoResponse:
        """
        Description: 终止抵押(宁波模式)
        Summary: 终止抵押(宁波模式)
        """
        UtilClient.validate_model(request)
        return arec_models.CloseRcpMgvtwoResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.rcp.mgvtwo.close', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_rcp_mgvtwo(
        self,
        request: arec_models.GetRcpMgvtwoRequest,
    ) -> arec_models.GetRcpMgvtwoResponse:
        """
        Description: 查询抵押单(宁波模式)
        Summary: 查询抵押单(宁波模式)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_rcp_mgvtwo_ex(request, headers, runtime)

    async def get_rcp_mgvtwo_async(
        self,
        request: arec_models.GetRcpMgvtwoRequest,
    ) -> arec_models.GetRcpMgvtwoResponse:
        """
        Description: 查询抵押单(宁波模式)
        Summary: 查询抵押单(宁波模式)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_rcp_mgvtwo_ex_async(request, headers, runtime)

    def get_rcp_mgvtwo_ex(
        self,
        request: arec_models.GetRcpMgvtwoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.GetRcpMgvtwoResponse:
        """
        Description: 查询抵押单(宁波模式)
        Summary: 查询抵押单(宁波模式)
        """
        UtilClient.validate_model(request)
        return arec_models.GetRcpMgvtwoResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.rcp.mgvtwo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_rcp_mgvtwo_ex_async(
        self,
        request: arec_models.GetRcpMgvtwoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.GetRcpMgvtwoResponse:
        """
        Description: 查询抵押单(宁波模式)
        Summary: 查询抵押单(宁波模式)
        """
        UtilClient.validate_model(request)
        return arec_models.GetRcpMgvtwoResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.rcp.mgvtwo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_rcp_rtc(
        self,
        request: arec_models.AuthRcpRtcRequest,
    ) -> arec_models.AuthRcpRtcResponse:
        """
        Description: 不动产中心通知房产链待签约的合同列表，用户签约后表示授权办理相关业务。比如房产抵押。
        Summary: 接收不动产中心授权签约列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_rcp_rtc_ex(request, headers, runtime)

    async def auth_rcp_rtc_async(
        self,
        request: arec_models.AuthRcpRtcRequest,
    ) -> arec_models.AuthRcpRtcResponse:
        """
        Description: 不动产中心通知房产链待签约的合同列表，用户签约后表示授权办理相关业务。比如房产抵押。
        Summary: 接收不动产中心授权签约列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_rcp_rtc_ex_async(request, headers, runtime)

    def auth_rcp_rtc_ex(
        self,
        request: arec_models.AuthRcpRtcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.AuthRcpRtcResponse:
        """
        Description: 不动产中心通知房产链待签约的合同列表，用户签约后表示授权办理相关业务。比如房产抵押。
        Summary: 接收不动产中心授权签约列表
        """
        UtilClient.validate_model(request)
        return arec_models.AuthRcpRtcResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.rcp.rtc.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_rcp_rtc_ex_async(
        self,
        request: arec_models.AuthRcpRtcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.AuthRcpRtcResponse:
        """
        Description: 不动产中心通知房产链待签约的合同列表，用户签约后表示授权办理相关业务。比如房产抵押。
        Summary: 接收不动产中心授权签约列表
        """
        UtilClient.validate_model(request)
        return arec_models.AuthRcpRtcResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.rcp.rtc.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def finish_rcp_rtc(
        self,
        request: arec_models.FinishRcpRtcRequest,
    ) -> arec_models.FinishRcpRtcResponse:
        """
        Description: 接收不动产中心业务处理结果，比如抵押登记完成后的结果
        Summary: 接收不动产中心业务处理结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.finish_rcp_rtc_ex(request, headers, runtime)

    async def finish_rcp_rtc_async(
        self,
        request: arec_models.FinishRcpRtcRequest,
    ) -> arec_models.FinishRcpRtcResponse:
        """
        Description: 接收不动产中心业务处理结果，比如抵押登记完成后的结果
        Summary: 接收不动产中心业务处理结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.finish_rcp_rtc_ex_async(request, headers, runtime)

    def finish_rcp_rtc_ex(
        self,
        request: arec_models.FinishRcpRtcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.FinishRcpRtcResponse:
        """
        Description: 接收不动产中心业务处理结果，比如抵押登记完成后的结果
        Summary: 接收不动产中心业务处理结果
        """
        UtilClient.validate_model(request)
        return arec_models.FinishRcpRtcResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.rcp.rtc.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def finish_rcp_rtc_ex_async(
        self,
        request: arec_models.FinishRcpRtcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.FinishRcpRtcResponse:
        """
        Description: 接收不动产中心业务处理结果，比如抵押登记完成后的结果
        Summary: 接收不动产中心业务处理结果
        """
        UtilClient.validate_model(request)
        return arec_models.FinishRcpRtcResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.rcp.rtc.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def finish_rcp_ningbo(
        self,
        request: arec_models.FinishRcpNingboRequest,
    ) -> arec_models.FinishRcpNingboResponse:
        """
        Description: 请求不动产中心发起抵押后，在抵押办理完成式，不动产中心通过此接口通知抵押结果。
        Summary: 通知抵押结果完成(宁波)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.finish_rcp_ningbo_ex(request, headers, runtime)

    async def finish_rcp_ningbo_async(
        self,
        request: arec_models.FinishRcpNingboRequest,
    ) -> arec_models.FinishRcpNingboResponse:
        """
        Description: 请求不动产中心发起抵押后，在抵押办理完成式，不动产中心通过此接口通知抵押结果。
        Summary: 通知抵押结果完成(宁波)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.finish_rcp_ningbo_ex_async(request, headers, runtime)

    def finish_rcp_ningbo_ex(
        self,
        request: arec_models.FinishRcpNingboRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.FinishRcpNingboResponse:
        """
        Description: 请求不动产中心发起抵押后，在抵押办理完成式，不动产中心通过此接口通知抵押结果。
        Summary: 通知抵押结果完成(宁波)
        """
        UtilClient.validate_model(request)
        return arec_models.FinishRcpNingboResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.rcp.ningbo.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def finish_rcp_ningbo_ex_async(
        self,
        request: arec_models.FinishRcpNingboRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.FinishRcpNingboResponse:
        """
        Description: 请求不动产中心发起抵押后，在抵押办理完成式，不动产中心通过此接口通知抵押结果。
        Summary: 通知抵押结果完成(宁波)
        """
        UtilClient.validate_model(request)
        return arec_models.FinishRcpNingboResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.rcp.ningbo.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def refuse_rcp_ningbo(
        self,
        request: arec_models.RefuseRcpNingboRequest,
    ) -> arec_models.RefuseRcpNingboResponse:
        """
        Description: 通知抵押驳回
        Summary: 通知抵押驳回(宁波)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.refuse_rcp_ningbo_ex(request, headers, runtime)

    async def refuse_rcp_ningbo_async(
        self,
        request: arec_models.RefuseRcpNingboRequest,
    ) -> arec_models.RefuseRcpNingboResponse:
        """
        Description: 通知抵押驳回
        Summary: 通知抵押驳回(宁波)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.refuse_rcp_ningbo_ex_async(request, headers, runtime)

    def refuse_rcp_ningbo_ex(
        self,
        request: arec_models.RefuseRcpNingboRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.RefuseRcpNingboResponse:
        """
        Description: 通知抵押驳回
        Summary: 通知抵押驳回(宁波)
        """
        UtilClient.validate_model(request)
        return arec_models.RefuseRcpNingboResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.rcp.ningbo.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def refuse_rcp_ningbo_ex_async(
        self,
        request: arec_models.RefuseRcpNingboRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.RefuseRcpNingboResponse:
        """
        Description: 通知抵押驳回
        Summary: 通知抵押驳回(宁波)
        """
        UtilClient.validate_model(request)
        return arec_models.RefuseRcpNingboResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.rcp.ningbo.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_realtytrade_org(
        self,
        request: arec_models.CreateRealtytradeOrgRequest,
    ) -> arec_models.CreateRealtytradeOrgResponse:
        """
        Description: 提供企业账户创建接口，根据参数创建数字房产账户和区块链合同的机构账号。
        Summary: 注册企业账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_realtytrade_org_ex(request, headers, runtime)

    async def create_realtytrade_org_async(
        self,
        request: arec_models.CreateRealtytradeOrgRequest,
    ) -> arec_models.CreateRealtytradeOrgResponse:
        """
        Description: 提供企业账户创建接口，根据参数创建数字房产账户和区块链合同的机构账号。
        Summary: 注册企业账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_realtytrade_org_ex_async(request, headers, runtime)

    def create_realtytrade_org_ex(
        self,
        request: arec_models.CreateRealtytradeOrgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.CreateRealtytradeOrgResponse:
        """
        Description: 提供企业账户创建接口，根据参数创建数字房产账户和区块链合同的机构账号。
        Summary: 注册企业账户
        """
        UtilClient.validate_model(request)
        return arec_models.CreateRealtytradeOrgResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.realtytrade.org.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_realtytrade_org_ex_async(
        self,
        request: arec_models.CreateRealtytradeOrgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.CreateRealtytradeOrgResponse:
        """
        Description: 提供企业账户创建接口，根据参数创建数字房产账户和区块链合同的机构账号。
        Summary: 注册企业账户
        """
        UtilClient.validate_model(request)
        return arec_models.CreateRealtytradeOrgResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.realtytrade.org.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_realtytrade_orgseal(
        self,
        request: arec_models.CreateRealtytradeOrgsealRequest,
    ) -> arec_models.CreateRealtytradeOrgsealResponse:
        """
        Description: 提供企业账户印章创建接口，该企业印章将展示在电子合同中企业盖章区域。
        Summary: 创建企业印章
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_realtytrade_orgseal_ex(request, headers, runtime)

    async def create_realtytrade_orgseal_async(
        self,
        request: arec_models.CreateRealtytradeOrgsealRequest,
    ) -> arec_models.CreateRealtytradeOrgsealResponse:
        """
        Description: 提供企业账户印章创建接口，该企业印章将展示在电子合同中企业盖章区域。
        Summary: 创建企业印章
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_realtytrade_orgseal_ex_async(request, headers, runtime)

    def create_realtytrade_orgseal_ex(
        self,
        request: arec_models.CreateRealtytradeOrgsealRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.CreateRealtytradeOrgsealResponse:
        """
        Description: 提供企业账户印章创建接口，该企业印章将展示在电子合同中企业盖章区域。
        Summary: 创建企业印章
        """
        UtilClient.validate_model(request)
        return arec_models.CreateRealtytradeOrgsealResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.realtytrade.orgseal.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_realtytrade_orgseal_ex_async(
        self,
        request: arec_models.CreateRealtytradeOrgsealRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.CreateRealtytradeOrgsealResponse:
        """
        Description: 提供企业账户印章创建接口，该企业印章将展示在电子合同中企业盖章区域。
        Summary: 创建企业印章
        """
        UtilClient.validate_model(request)
        return arec_models.CreateRealtytradeOrgsealResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.realtytrade.orgseal.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_realtytrade_personal(
        self,
        request: arec_models.CreateRealtytradePersonalRequest,
    ) -> arec_models.CreateRealtytradePersonalResponse:
        """
        Description: 提供个人账户注册接口，注册数字房产账户以及关联的区块链合同签署数字证书等
        Summary: 注册个人账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_realtytrade_personal_ex(request, headers, runtime)

    async def create_realtytrade_personal_async(
        self,
        request: arec_models.CreateRealtytradePersonalRequest,
    ) -> arec_models.CreateRealtytradePersonalResponse:
        """
        Description: 提供个人账户注册接口，注册数字房产账户以及关联的区块链合同签署数字证书等
        Summary: 注册个人账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_realtytrade_personal_ex_async(request, headers, runtime)

    def create_realtytrade_personal_ex(
        self,
        request: arec_models.CreateRealtytradePersonalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.CreateRealtytradePersonalResponse:
        """
        Description: 提供个人账户注册接口，注册数字房产账户以及关联的区块链合同签署数字证书等
        Summary: 注册个人账户
        """
        UtilClient.validate_model(request)
        return arec_models.CreateRealtytradePersonalResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.realtytrade.personal.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_realtytrade_personal_ex_async(
        self,
        request: arec_models.CreateRealtytradePersonalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.CreateRealtytradePersonalResponse:
        """
        Description: 提供个人账户注册接口，注册数字房产账户以及关联的区块链合同签署数字证书等
        Summary: 注册个人账户
        """
        UtilClient.validate_model(request)
        return arec_models.CreateRealtytradePersonalResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.realtytrade.personal.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_realtytrade_personalseal(
        self,
        request: arec_models.CreateRealtytradePersonalsealRequest,
    ) -> arec_models.CreateRealtytradePersonalsealResponse:
        """
        Description: 提供个人账户印章创建接口，该印章将展示在电子合同中企业盖章区域，最后一次创建的印章作为个人默认的印章。
        Summary: 创建个人图片印章
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_realtytrade_personalseal_ex(request, headers, runtime)

    async def create_realtytrade_personalseal_async(
        self,
        request: arec_models.CreateRealtytradePersonalsealRequest,
    ) -> arec_models.CreateRealtytradePersonalsealResponse:
        """
        Description: 提供个人账户印章创建接口，该印章将展示在电子合同中企业盖章区域，最后一次创建的印章作为个人默认的印章。
        Summary: 创建个人图片印章
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_realtytrade_personalseal_ex_async(request, headers, runtime)

    def create_realtytrade_personalseal_ex(
        self,
        request: arec_models.CreateRealtytradePersonalsealRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.CreateRealtytradePersonalsealResponse:
        """
        Description: 提供个人账户印章创建接口，该印章将展示在电子合同中企业盖章区域，最后一次创建的印章作为个人默认的印章。
        Summary: 创建个人图片印章
        """
        UtilClient.validate_model(request)
        return arec_models.CreateRealtytradePersonalsealResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.realtytrade.personalseal.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_realtytrade_personalseal_ex_async(
        self,
        request: arec_models.CreateRealtytradePersonalsealRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.CreateRealtytradePersonalsealResponse:
        """
        Description: 提供个人账户印章创建接口，该印章将展示在电子合同中企业盖章区域，最后一次创建的印章作为个人默认的印章。
        Summary: 创建个人图片印章
        """
        UtilClient.validate_model(request)
        return arec_models.CreateRealtytradePersonalsealResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.realtytrade.personalseal.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_realtytrade_signing(
        self,
        request: arec_models.StartRealtytradeSigningRequest,
    ) -> arec_models.StartRealtytradeSigningResponse:
        """
        Description: 当调用方已渲染和填充完成待签署的合同文件(PDF格式)， 则可以提交文件来创建签署流程，一个流程支持关联多个待签署合同文件。
        Summary: 发起签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_realtytrade_signing_ex(request, headers, runtime)

    async def start_realtytrade_signing_async(
        self,
        request: arec_models.StartRealtytradeSigningRequest,
    ) -> arec_models.StartRealtytradeSigningResponse:
        """
        Description: 当调用方已渲染和填充完成待签署的合同文件(PDF格式)， 则可以提交文件来创建签署流程，一个流程支持关联多个待签署合同文件。
        Summary: 发起签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_realtytrade_signing_ex_async(request, headers, runtime)

    def start_realtytrade_signing_ex(
        self,
        request: arec_models.StartRealtytradeSigningRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.StartRealtytradeSigningResponse:
        """
        Description: 当调用方已渲染和填充完成待签署的合同文件(PDF格式)， 则可以提交文件来创建签署流程，一个流程支持关联多个待签署合同文件。
        Summary: 发起签署流程
        """
        UtilClient.validate_model(request)
        return arec_models.StartRealtytradeSigningResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.realtytrade.signing.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_realtytrade_signing_ex_async(
        self,
        request: arec_models.StartRealtytradeSigningRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.StartRealtytradeSigningResponse:
        """
        Description: 当调用方已渲染和填充完成待签署的合同文件(PDF格式)， 则可以提交文件来创建签署流程，一个流程支持关联多个待签署合同文件。
        Summary: 发起签署流程
        """
        UtilClient.validate_model(request)
        return arec_models.StartRealtytradeSigningResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.realtytrade.signing.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_realtytrade_signing(
        self,
        request: arec_models.QueryRealtytradeSigningRequest,
    ) -> arec_models.QueryRealtytradeSigningResponse:
        """
        Description: 数字房产会处理所有签署成功的签署流程，并提供签署成功的电子合同文档下载服务。本接口由数字房产提供给天猫好房，用于签署完成后下载已归档电子合同文件。
        Summary: 查看签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_realtytrade_signing_ex(request, headers, runtime)

    async def query_realtytrade_signing_async(
        self,
        request: arec_models.QueryRealtytradeSigningRequest,
    ) -> arec_models.QueryRealtytradeSigningResponse:
        """
        Description: 数字房产会处理所有签署成功的签署流程，并提供签署成功的电子合同文档下载服务。本接口由数字房产提供给天猫好房，用于签署完成后下载已归档电子合同文件。
        Summary: 查看签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_realtytrade_signing_ex_async(request, headers, runtime)

    def query_realtytrade_signing_ex(
        self,
        request: arec_models.QueryRealtytradeSigningRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.QueryRealtytradeSigningResponse:
        """
        Description: 数字房产会处理所有签署成功的签署流程，并提供签署成功的电子合同文档下载服务。本接口由数字房产提供给天猫好房，用于签署完成后下载已归档电子合同文件。
        Summary: 查看签署流程
        """
        UtilClient.validate_model(request)
        return arec_models.QueryRealtytradeSigningResponse().from_map(
            self.do_request('1.0', 'blockchain.arec.realtytrade.signing.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_realtytrade_signing_ex_async(
        self,
        request: arec_models.QueryRealtytradeSigningRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> arec_models.QueryRealtytradeSigningResponse:
        """
        Description: 数字房产会处理所有签署成功的签署流程，并提供签署成功的电子合同文档下载服务。本接口由数字房产提供给天猫好房，用于签署完成后下载已归档电子合同文件。
        Summary: 查看签署流程
        """
        UtilClient.validate_model(request)
        return arec_models.QueryRealtytradeSigningResponse().from_map(
            await self.do_request_async('1.0', 'blockchain.arec.realtytrade.signing.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
