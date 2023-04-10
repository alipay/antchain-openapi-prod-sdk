# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_fairopennet import models as fairopennet_models
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
        config: fairopennet_models.Config,
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
            # 静态DSL
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
                    'sdk_version': '1.0.3',
                    '_prod_code': 'FAIROPENNET',
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
            # 静态DSL
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
                    'sdk_version': '1.0.3',
                    '_prod_code': 'FAIROPENNET',
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

    def start_test(
        self,
        request: fairopennet_models.StartTestRequest,
    ) -> fairopennet_models.StartTestResponse:
        """
        Description: 测试用
        Summary: 测试用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_test_ex(request, headers, runtime)

    async def start_test_async(
        self,
        request: fairopennet_models.StartTestRequest,
    ) -> fairopennet_models.StartTestResponse:
        """
        Description: 测试用
        Summary: 测试用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_test_ex_async(request, headers, runtime)

    def start_test_ex(
        self,
        request: fairopennet_models.StartTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.StartTestResponse:
        """
        Description: 测试用
        Summary: 测试用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.StartTestResponse(),
            self.do_request('1.0', 'antchain.fairopennet.test.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_test_ex_async(
        self,
        request: fairopennet_models.StartTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.StartTestResponse:
        """
        Description: 测试用
        Summary: 测试用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.StartTestResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.test.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_client_config(
        self,
        request: fairopennet_models.InitClientConfigRequest,
    ) -> fairopennet_models.InitClientConfigResponse:
        """
        Description:
        Summary: 初始化客户端配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_client_config_ex(request, headers, runtime)

    async def init_client_config_async(
        self,
        request: fairopennet_models.InitClientConfigRequest,
    ) -> fairopennet_models.InitClientConfigResponse:
        """
        Description:
        Summary: 初始化客户端配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_client_config_ex_async(request, headers, runtime)

    def init_client_config_ex(
        self,
        request: fairopennet_models.InitClientConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.InitClientConfigResponse:
        """
        Description:
        Summary: 初始化客户端配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.InitClientConfigResponse(),
            self.do_request('1.0', 'antchain.fairopennet.client.config.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_client_config_ex_async(
        self,
        request: fairopennet_models.InitClientConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.InitClientConfigResponse:
        """
        Description:
        Summary: 初始化客户端配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.InitClientConfigResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.client.config.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_client(
        self,
        request: fairopennet_models.StartClientRequest,
    ) -> fairopennet_models.StartClientResponse:
        """
        Description: 启动客户端，测试连接到FAIR节点
        Summary: 启动客户端
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_client_ex(request, headers, runtime)

    async def start_client_async(
        self,
        request: fairopennet_models.StartClientRequest,
    ) -> fairopennet_models.StartClientResponse:
        """
        Description: 启动客户端，测试连接到FAIR节点
        Summary: 启动客户端
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_client_ex_async(request, headers, runtime)

    def start_client_ex(
        self,
        request: fairopennet_models.StartClientRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.StartClientResponse:
        """
        Description: 启动客户端，测试连接到FAIR节点
        Summary: 启动客户端
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.StartClientResponse(),
            self.do_request('1.0', 'antchain.fairopennet.client.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_client_ex_async(
        self,
        request: fairopennet_models.StartClientRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.StartClientResponse:
        """
        Description: 启动客户端，测试连接到FAIR节点
        Summary: 启动客户端
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.StartClientResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.client.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_governancemodule_networkid(
        self,
        request: fairopennet_models.GetGovernancemoduleNetworkidRequest,
    ) -> fairopennet_models.GetGovernancemoduleNetworkidResponse:
        """
        Description: 获取治理模块静态配置自启动协作网络的ID
        Summary: 获取治理模块静态配置自启动协作网络的ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_governancemodule_networkid_ex(request, headers, runtime)

    async def get_governancemodule_networkid_async(
        self,
        request: fairopennet_models.GetGovernancemoduleNetworkidRequest,
    ) -> fairopennet_models.GetGovernancemoduleNetworkidResponse:
        """
        Description: 获取治理模块静态配置自启动协作网络的ID
        Summary: 获取治理模块静态配置自启动协作网络的ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_governancemodule_networkid_ex_async(request, headers, runtime)

    def get_governancemodule_networkid_ex(
        self,
        request: fairopennet_models.GetGovernancemoduleNetworkidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.GetGovernancemoduleNetworkidResponse:
        """
        Description: 获取治理模块静态配置自启动协作网络的ID
        Summary: 获取治理模块静态配置自启动协作网络的ID
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.GetGovernancemoduleNetworkidResponse(),
            self.do_request('1.0', 'antchain.fairopennet.governancemodule.networkid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_governancemodule_networkid_ex_async(
        self,
        request: fairopennet_models.GetGovernancemoduleNetworkidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.GetGovernancemoduleNetworkidResponse:
        """
        Description: 获取治理模块静态配置自启动协作网络的ID
        Summary: 获取治理模块静态配置自启动协作网络的ID
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.GetGovernancemoduleNetworkidResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.governancemodule.networkid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_network_status(
        self,
        request: fairopennet_models.GetNetworkStatusRequest,
    ) -> fairopennet_models.GetNetworkStatusResponse:
        """
        Description: 获取协作网络状态
        Summary: 获取协作网络状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_network_status_ex(request, headers, runtime)

    async def get_network_status_async(
        self,
        request: fairopennet_models.GetNetworkStatusRequest,
    ) -> fairopennet_models.GetNetworkStatusResponse:
        """
        Description: 获取协作网络状态
        Summary: 获取协作网络状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_network_status_ex_async(request, headers, runtime)

    def get_network_status_ex(
        self,
        request: fairopennet_models.GetNetworkStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.GetNetworkStatusResponse:
        """
        Description: 获取协作网络状态
        Summary: 获取协作网络状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.GetNetworkStatusResponse(),
            self.do_request('1.0', 'antchain.fairopennet.network.status.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_network_status_ex_async(
        self,
        request: fairopennet_models.GetNetworkStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.GetNetworkStatusResponse:
        """
        Description: 获取协作网络状态
        Summary: 获取协作网络状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.GetNetworkStatusResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.network.status.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_mycubenode_info(
        self,
        request: fairopennet_models.GetMycubenodeInfoRequest,
    ) -> fairopennet_models.GetMycubenodeInfoResponse:
        """
        Description: 获取cube节点信息
        Summary: 获取cube节点信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_mycubenode_info_ex(request, headers, runtime)

    async def get_mycubenode_info_async(
        self,
        request: fairopennet_models.GetMycubenodeInfoRequest,
    ) -> fairopennet_models.GetMycubenodeInfoResponse:
        """
        Description: 获取cube节点信息
        Summary: 获取cube节点信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_mycubenode_info_ex_async(request, headers, runtime)

    def get_mycubenode_info_ex(
        self,
        request: fairopennet_models.GetMycubenodeInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.GetMycubenodeInfoResponse:
        """
        Description: 获取cube节点信息
        Summary: 获取cube节点信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.GetMycubenodeInfoResponse(),
            self.do_request('1.0', 'antchain.fairopennet.mycubenode.info.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_mycubenode_info_ex_async(
        self,
        request: fairopennet_models.GetMycubenodeInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.GetMycubenodeInfoResponse:
        """
        Description: 获取cube节点信息
        Summary: 获取cube节点信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.GetMycubenodeInfoResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.mycubenode.info.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_trustedcubenode_info(
        self,
        request: fairopennet_models.AddTrustedcubenodeInfoRequest,
    ) -> fairopennet_models.AddTrustedcubenodeInfoResponse:
        """
        Description: 手动添加cube节点
        Summary: 手动添加cube节点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_trustedcubenode_info_ex(request, headers, runtime)

    async def add_trustedcubenode_info_async(
        self,
        request: fairopennet_models.AddTrustedcubenodeInfoRequest,
    ) -> fairopennet_models.AddTrustedcubenodeInfoResponse:
        """
        Description: 手动添加cube节点
        Summary: 手动添加cube节点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_trustedcubenode_info_ex_async(request, headers, runtime)

    def add_trustedcubenode_info_ex(
        self,
        request: fairopennet_models.AddTrustedcubenodeInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.AddTrustedcubenodeInfoResponse:
        """
        Description: 手动添加cube节点
        Summary: 手动添加cube节点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.AddTrustedcubenodeInfoResponse(),
            self.do_request('1.0', 'antchain.fairopennet.trustedcubenode.info.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_trustedcubenode_info_ex_async(
        self,
        request: fairopennet_models.AddTrustedcubenodeInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.AddTrustedcubenodeInfoResponse:
        """
        Description: 手动添加cube节点
        Summary: 手动添加cube节点
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.AddTrustedcubenodeInfoResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.trustedcubenode.info.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_normal_node(
        self,
        request: fairopennet_models.RegisterNormalNodeRequest,
    ) -> fairopennet_models.RegisterNormalNodeResponse:
        """
        Description: 将普通节点加入协作网络。治理节点预先批准普通节点的身份信息加入到网络，然后返回EntranceInfo给到普通节点，普通节点根据EntranceInfo连入网络。对应sdk enrollNormalNode接口
        Summary: 普通节点加入协作网络
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_normal_node_ex(request, headers, runtime)

    async def register_normal_node_async(
        self,
        request: fairopennet_models.RegisterNormalNodeRequest,
    ) -> fairopennet_models.RegisterNormalNodeResponse:
        """
        Description: 将普通节点加入协作网络。治理节点预先批准普通节点的身份信息加入到网络，然后返回EntranceInfo给到普通节点，普通节点根据EntranceInfo连入网络。对应sdk enrollNormalNode接口
        Summary: 普通节点加入协作网络
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_normal_node_ex_async(request, headers, runtime)

    def register_normal_node_ex(
        self,
        request: fairopennet_models.RegisterNormalNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.RegisterNormalNodeResponse:
        """
        Description: 将普通节点加入协作网络。治理节点预先批准普通节点的身份信息加入到网络，然后返回EntranceInfo给到普通节点，普通节点根据EntranceInfo连入网络。对应sdk enrollNormalNode接口
        Summary: 普通节点加入协作网络
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.RegisterNormalNodeResponse(),
            self.do_request('1.0', 'antchain.fairopennet.normal.node.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_normal_node_ex_async(
        self,
        request: fairopennet_models.RegisterNormalNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.RegisterNormalNodeResponse:
        """
        Description: 将普通节点加入协作网络。治理节点预先批准普通节点的身份信息加入到网络，然后返回EntranceInfo给到普通节点，普通节点根据EntranceInfo连入网络。对应sdk enrollNormalNode接口
        Summary: 普通节点加入协作网络
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.RegisterNormalNodeResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.normal.node.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_space(
        self,
        request: fairopennet_models.CreateSpaceRequest,
    ) -> fairopennet_models.CreateSpaceResponse:
        """
        Description: 后续由各普通节点将其所有的参与方加入到协作网络，然后由治理节点管理哪些参与方可以加入协作空间
        Summary: 新建协作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_space_ex(request, headers, runtime)

    async def create_space_async(
        self,
        request: fairopennet_models.CreateSpaceRequest,
    ) -> fairopennet_models.CreateSpaceResponse:
        """
        Description: 后续由各普通节点将其所有的参与方加入到协作网络，然后由治理节点管理哪些参与方可以加入协作空间
        Summary: 新建协作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_space_ex_async(request, headers, runtime)

    def create_space_ex(
        self,
        request: fairopennet_models.CreateSpaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.CreateSpaceResponse:
        """
        Description: 后续由各普通节点将其所有的参与方加入到协作网络，然后由治理节点管理哪些参与方可以加入协作空间
        Summary: 新建协作空间
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.CreateSpaceResponse(),
            self.do_request('1.0', 'antchain.fairopennet.space.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_space_ex_async(
        self,
        request: fairopennet_models.CreateSpaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.CreateSpaceResponse:
        """
        Description: 后续由各普通节点将其所有的参与方加入到协作网络，然后由治理节点管理哪些参与方可以加入协作空间
        Summary: 新建协作空间
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.CreateSpaceResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.space.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_party_space(
        self,
        request: fairopennet_models.AddPartySpaceRequest,
    ) -> fairopennet_models.AddPartySpaceResponse:
        """
        Description: 添加协作参与方到协作空间
        Summary: 添加协作参与方到协作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_party_space_ex(request, headers, runtime)

    async def add_party_space_async(
        self,
        request: fairopennet_models.AddPartySpaceRequest,
    ) -> fairopennet_models.AddPartySpaceResponse:
        """
        Description: 添加协作参与方到协作空间
        Summary: 添加协作参与方到协作空间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_party_space_ex_async(request, headers, runtime)

    def add_party_space_ex(
        self,
        request: fairopennet_models.AddPartySpaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.AddPartySpaceResponse:
        """
        Description: 添加协作参与方到协作空间
        Summary: 添加协作参与方到协作空间
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.AddPartySpaceResponse(),
            self.do_request('1.0', 'antchain.fairopennet.party.space.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_party_space_ex_async(
        self,
        request: fairopennet_models.AddPartySpaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.AddPartySpaceResponse:
        """
        Description: 添加协作参与方到协作空间
        Summary: 添加协作参与方到协作空间
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.AddPartySpaceResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.party.space.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_network_snapshot(
        self,
        request: fairopennet_models.GetNetworkSnapshotRequest,
    ) -> fairopennet_models.GetNetworkSnapshotResponse:
        """
        Description: 获取协作网络快照，包含整个协作网络最新的全部信息
        Summary: 获取协作网络快照
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_network_snapshot_ex(request, headers, runtime)

    async def get_network_snapshot_async(
        self,
        request: fairopennet_models.GetNetworkSnapshotRequest,
    ) -> fairopennet_models.GetNetworkSnapshotResponse:
        """
        Description: 获取协作网络快照，包含整个协作网络最新的全部信息
        Summary: 获取协作网络快照
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_network_snapshot_ex_async(request, headers, runtime)

    def get_network_snapshot_ex(
        self,
        request: fairopennet_models.GetNetworkSnapshotRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.GetNetworkSnapshotResponse:
        """
        Description: 获取协作网络快照，包含整个协作网络最新的全部信息
        Summary: 获取协作网络快照
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.GetNetworkSnapshotResponse(),
            self.do_request('1.0', 'antchain.fairopennet.network.snapshot.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_network_snapshot_ex_async(
        self,
        request: fairopennet_models.GetNetworkSnapshotRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.GetNetworkSnapshotResponse:
        """
        Description: 获取协作网络快照，包含整个协作网络最新的全部信息
        Summary: 获取协作网络快照
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.GetNetworkSnapshotResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.network.snapshot.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def stop_client(
        self,
        request: fairopennet_models.StopClientRequest,
    ) -> fairopennet_models.StopClientResponse:
        """
        Description: shutdown client
        Summary: shutdown client
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.stop_client_ex(request, headers, runtime)

    async def stop_client_async(
        self,
        request: fairopennet_models.StopClientRequest,
    ) -> fairopennet_models.StopClientResponse:
        """
        Description: shutdown client
        Summary: shutdown client
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.stop_client_ex_async(request, headers, runtime)

    def stop_client_ex(
        self,
        request: fairopennet_models.StopClientRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.StopClientResponse:
        """
        Description: shutdown client
        Summary: shutdown client
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.StopClientResponse(),
            self.do_request('1.0', 'antchain.fairopennet.client.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def stop_client_ex_async(
        self,
        request: fairopennet_models.StopClientRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.StopClientResponse:
        """
        Description: shutdown client
        Summary: shutdown client
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.StopClientResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.client.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_normalmodule_nodeid(
        self,
        request: fairopennet_models.GetNormalmoduleNodeidRequest,
    ) -> fairopennet_models.GetNormalmoduleNodeidResponse:
        """
        Description: 获取普通节点自身的节点ID
        Summary: 获取普通节点自身的节点ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_normalmodule_nodeid_ex(request, headers, runtime)

    async def get_normalmodule_nodeid_async(
        self,
        request: fairopennet_models.GetNormalmoduleNodeidRequest,
    ) -> fairopennet_models.GetNormalmoduleNodeidResponse:
        """
        Description: 获取普通节点自身的节点ID
        Summary: 获取普通节点自身的节点ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_normalmodule_nodeid_ex_async(request, headers, runtime)

    def get_normalmodule_nodeid_ex(
        self,
        request: fairopennet_models.GetNormalmoduleNodeidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.GetNormalmoduleNodeidResponse:
        """
        Description: 获取普通节点自身的节点ID
        Summary: 获取普通节点自身的节点ID
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.GetNormalmoduleNodeidResponse(),
            self.do_request('1.0', 'antchain.fairopennet.normalmodule.nodeid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_normalmodule_nodeid_ex_async(
        self,
        request: fairopennet_models.GetNormalmoduleNodeidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.GetNormalmoduleNodeidResponse:
        """
        Description: 获取普通节点自身的节点ID
        Summary: 获取普通节点自身的节点ID
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.GetNormalmoduleNodeidResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.normalmodule.nodeid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_party(
        self,
        request: fairopennet_models.AddPartyRequest,
    ) -> fairopennet_models.AddPartyResponse:
        """
        Description: 添加协作参与方信息，协作参与方身份为独立身份，通用于未来加入的不同协作网络
        Summary: 添加协作参与方信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_party_ex(request, headers, runtime)

    async def add_party_async(
        self,
        request: fairopennet_models.AddPartyRequest,
    ) -> fairopennet_models.AddPartyResponse:
        """
        Description: 添加协作参与方信息，协作参与方身份为独立身份，通用于未来加入的不同协作网络
        Summary: 添加协作参与方信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_party_ex_async(request, headers, runtime)

    def add_party_ex(
        self,
        request: fairopennet_models.AddPartyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.AddPartyResponse:
        """
        Description: 添加协作参与方信息，协作参与方身份为独立身份，通用于未来加入的不同协作网络
        Summary: 添加协作参与方信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.AddPartyResponse(),
            self.do_request('1.0', 'antchain.fairopennet.party.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_party_ex_async(
        self,
        request: fairopennet_models.AddPartyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.AddPartyResponse:
        """
        Description: 添加协作参与方信息，协作参与方身份为独立身份，通用于未来加入的不同协作网络
        Summary: 添加协作参与方信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.AddPartyResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.party.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_normalnode_identityinfo(
        self,
        request: fairopennet_models.GetNormalnodeIdentityinfoRequest,
    ) -> fairopennet_models.GetNormalnodeIdentityinfoResponse:
        """
        Description: 获取普通节点身份信息
        Summary: 获取普通节点身份信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_normalnode_identityinfo_ex(request, headers, runtime)

    async def get_normalnode_identityinfo_async(
        self,
        request: fairopennet_models.GetNormalnodeIdentityinfoRequest,
    ) -> fairopennet_models.GetNormalnodeIdentityinfoResponse:
        """
        Description: 获取普通节点身份信息
        Summary: 获取普通节点身份信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_normalnode_identityinfo_ex_async(request, headers, runtime)

    def get_normalnode_identityinfo_ex(
        self,
        request: fairopennet_models.GetNormalnodeIdentityinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.GetNormalnodeIdentityinfoResponse:
        """
        Description: 获取普通节点身份信息
        Summary: 获取普通节点身份信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.GetNormalnodeIdentityinfoResponse(),
            self.do_request('1.0', 'antchain.fairopennet.normalnode.identityinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_normalnode_identityinfo_ex_async(
        self,
        request: fairopennet_models.GetNormalnodeIdentityinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.GetNormalnodeIdentityinfoResponse:
        """
        Description: 获取普通节点身份信息
        Summary: 获取普通节点身份信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.GetNormalnodeIdentityinfoResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.normalnode.identityinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_network_normalnode(
        self,
        request: fairopennet_models.AddNetworkNormalnodeRequest,
    ) -> fairopennet_models.AddNetworkNormalnodeResponse:
        """
        Description: 治理节点批准加入网络后，传回网络进入信息，由普通节点加入网络
        Summary: 普通节点加入网络
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_network_normalnode_ex(request, headers, runtime)

    async def add_network_normalnode_async(
        self,
        request: fairopennet_models.AddNetworkNormalnodeRequest,
    ) -> fairopennet_models.AddNetworkNormalnodeResponse:
        """
        Description: 治理节点批准加入网络后，传回网络进入信息，由普通节点加入网络
        Summary: 普通节点加入网络
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_network_normalnode_ex_async(request, headers, runtime)

    def add_network_normalnode_ex(
        self,
        request: fairopennet_models.AddNetworkNormalnodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.AddNetworkNormalnodeResponse:
        """
        Description: 治理节点批准加入网络后，传回网络进入信息，由普通节点加入网络
        Summary: 普通节点加入网络
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.AddNetworkNormalnodeResponse(),
            self.do_request('1.0', 'antchain.fairopennet.network.normalnode.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_network_normalnode_ex_async(
        self,
        request: fairopennet_models.AddNetworkNormalnodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.AddNetworkNormalnodeResponse:
        """
        Description: 治理节点批准加入网络后，传回网络进入信息，由普通节点加入网络
        Summary: 普通节点加入网络
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.AddNetworkNormalnodeResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.network.normalnode.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_allcubenode_info(
        self,
        request: fairopennet_models.GetAllcubenodeInfoRequest,
    ) -> fairopennet_models.GetAllcubenodeInfoResponse:
        """
        Description: 获取所有cube节点信息
        Summary: 获取所有cube节点信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_allcubenode_info_ex(request, headers, runtime)

    async def get_allcubenode_info_async(
        self,
        request: fairopennet_models.GetAllcubenodeInfoRequest,
    ) -> fairopennet_models.GetAllcubenodeInfoResponse:
        """
        Description: 获取所有cube节点信息
        Summary: 获取所有cube节点信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_allcubenode_info_ex_async(request, headers, runtime)

    def get_allcubenode_info_ex(
        self,
        request: fairopennet_models.GetAllcubenodeInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.GetAllcubenodeInfoResponse:
        """
        Description: 获取所有cube节点信息
        Summary: 获取所有cube节点信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.GetAllcubenodeInfoResponse(),
            self.do_request('1.0', 'antchain.fairopennet.allcubenode.info.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_allcubenode_info_ex_async(
        self,
        request: fairopennet_models.GetAllcubenodeInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.GetAllcubenodeInfoResponse:
        """
        Description: 获取所有cube节点信息
        Summary: 获取所有cube节点信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.GetAllcubenodeInfoResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.allcubenode.info.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_party_network(
        self,
        request: fairopennet_models.ApplyPartyNetworkRequest,
    ) -> fairopennet_models.ApplyPartyNetworkResponse:
        """
        Description: 添加协作参与方到一个区块链协作网络
        Summary: 添加协作参与方到一个区块链协作网络
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_party_network_ex(request, headers, runtime)

    async def apply_party_network_async(
        self,
        request: fairopennet_models.ApplyPartyNetworkRequest,
    ) -> fairopennet_models.ApplyPartyNetworkResponse:
        """
        Description: 添加协作参与方到一个区块链协作网络
        Summary: 添加协作参与方到一个区块链协作网络
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_party_network_ex_async(request, headers, runtime)

    def apply_party_network_ex(
        self,
        request: fairopennet_models.ApplyPartyNetworkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.ApplyPartyNetworkResponse:
        """
        Description: 添加协作参与方到一个区块链协作网络
        Summary: 添加协作参与方到一个区块链协作网络
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.ApplyPartyNetworkResponse(),
            self.do_request('1.0', 'antchain.fairopennet.party.network.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_party_network_ex_async(
        self,
        request: fairopennet_models.ApplyPartyNetworkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.ApplyPartyNetworkResponse:
        """
        Description: 添加协作参与方到一个区块链协作网络
        Summary: 添加协作参与方到一个区块链协作网络
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.ApplyPartyNetworkResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.party.network.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_flow(
        self,
        request: fairopennet_models.CreateFlowRequest,
    ) -> fairopennet_models.CreateFlowResponse:
        """
        Description: 创建一个工作流
        Summary: 创建一个工作流
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_flow_ex(request, headers, runtime)

    async def create_flow_async(
        self,
        request: fairopennet_models.CreateFlowRequest,
    ) -> fairopennet_models.CreateFlowResponse:
        """
        Description: 创建一个工作流
        Summary: 创建一个工作流
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_flow_ex_async(request, headers, runtime)

    def create_flow_ex(
        self,
        request: fairopennet_models.CreateFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.CreateFlowResponse:
        """
        Description: 创建一个工作流
        Summary: 创建一个工作流
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.CreateFlowResponse(),
            self.do_request('1.0', 'antchain.fairopennet.flow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_flow_ex_async(
        self,
        request: fairopennet_models.CreateFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.CreateFlowResponse:
        """
        Description: 创建一个工作流
        Summary: 创建一个工作流
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.CreateFlowResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.flow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def run_flow_instance(
        self,
        request: fairopennet_models.RunFlowInstanceRequest,
    ) -> fairopennet_models.RunFlowInstanceResponse:
        """
        Description: 运行工作流实例，提供动态配置
        Summary: 运行工作流实例，提供动态配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.run_flow_instance_ex(request, headers, runtime)

    async def run_flow_instance_async(
        self,
        request: fairopennet_models.RunFlowInstanceRequest,
    ) -> fairopennet_models.RunFlowInstanceResponse:
        """
        Description: 运行工作流实例，提供动态配置
        Summary: 运行工作流实例，提供动态配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.run_flow_instance_ex_async(request, headers, runtime)

    def run_flow_instance_ex(
        self,
        request: fairopennet_models.RunFlowInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.RunFlowInstanceResponse:
        """
        Description: 运行工作流实例，提供动态配置
        Summary: 运行工作流实例，提供动态配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.RunFlowInstanceResponse(),
            self.do_request('1.0', 'antchain.fairopennet.flow.instance.run', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def run_flow_instance_ex_async(
        self,
        request: fairopennet_models.RunFlowInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.RunFlowInstanceResponse:
        """
        Description: 运行工作流实例，提供动态配置
        Summary: 运行工作流实例，提供动态配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.RunFlowInstanceResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.flow.instance.run', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def stop_flowinstance(
        self,
        request: fairopennet_models.StopFlowinstanceRequest,
    ) -> fairopennet_models.StopFlowinstanceResponse:
        """
        Description: 停止运行中的工作流实例
        Summary: 停止运行中的工作流实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.stop_flowinstance_ex(request, headers, runtime)

    async def stop_flowinstance_async(
        self,
        request: fairopennet_models.StopFlowinstanceRequest,
    ) -> fairopennet_models.StopFlowinstanceResponse:
        """
        Description: 停止运行中的工作流实例
        Summary: 停止运行中的工作流实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.stop_flowinstance_ex_async(request, headers, runtime)

    def stop_flowinstance_ex(
        self,
        request: fairopennet_models.StopFlowinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.StopFlowinstanceResponse:
        """
        Description: 停止运行中的工作流实例
        Summary: 停止运行中的工作流实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.StopFlowinstanceResponse(),
            self.do_request('1.0', 'antchain.fairopennet.flowinstance.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def stop_flowinstance_ex_async(
        self,
        request: fairopennet_models.StopFlowinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.StopFlowinstanceResponse:
        """
        Description: 停止运行中的工作流实例
        Summary: 停止运行中的工作流实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.StopFlowinstanceResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.flowinstance.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_flowinstance_status(
        self,
        request: fairopennet_models.QueryFlowinstanceStatusRequest,
    ) -> fairopennet_models.QueryFlowinstanceStatusResponse:
        """
        Description: 查询工作流实例状态
        Summary: 查询工作流实例状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_flowinstance_status_ex(request, headers, runtime)

    async def query_flowinstance_status_async(
        self,
        request: fairopennet_models.QueryFlowinstanceStatusRequest,
    ) -> fairopennet_models.QueryFlowinstanceStatusResponse:
        """
        Description: 查询工作流实例状态
        Summary: 查询工作流实例状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_flowinstance_status_ex_async(request, headers, runtime)

    def query_flowinstance_status_ex(
        self,
        request: fairopennet_models.QueryFlowinstanceStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.QueryFlowinstanceStatusResponse:
        """
        Description: 查询工作流实例状态
        Summary: 查询工作流实例状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.QueryFlowinstanceStatusResponse(),
            self.do_request('1.0', 'antchain.fairopennet.flowinstance.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_flowinstance_status_ex_async(
        self,
        request: fairopennet_models.QueryFlowinstanceStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.QueryFlowinstanceStatusResponse:
        """
        Description: 查询工作流实例状态
        Summary: 查询工作流实例状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.QueryFlowinstanceStatusResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.flowinstance.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_file(
        self,
        request: fairopennet_models.UploadFileRequest,
    ) -> fairopennet_models.UploadFileResponse:
        """
        Description: 上传文件
        Summary: 上传文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_file_ex(request, headers, runtime)

    async def upload_file_async(
        self,
        request: fairopennet_models.UploadFileRequest,
    ) -> fairopennet_models.UploadFileResponse:
        """
        Description: 上传文件
        Summary: 上传文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_file_ex_async(request, headers, runtime)

    def upload_file_ex(
        self,
        request: fairopennet_models.UploadFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.UploadFileResponse:
        """
        Description: 上传文件
        Summary: 上传文件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = fairopennet_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.fairopennet.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_file_response = fairopennet_models.UploadFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.UploadFileResponse(),
            self.do_request('1.0', 'antchain.fairopennet.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_file_ex_async(
        self,
        request: fairopennet_models.UploadFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.UploadFileResponse:
        """
        Description: 上传文件
        Summary: 上传文件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = fairopennet_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.fairopennet.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_file_response = fairopennet_models.UploadFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.UploadFileResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def download_file(
        self,
        request: fairopennet_models.DownloadFileRequest,
    ) -> fairopennet_models.DownloadFileResponse:
        """
        Description: 下载文件
        Summary: 下载文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.download_file_ex(request, headers, runtime)

    async def download_file_async(
        self,
        request: fairopennet_models.DownloadFileRequest,
    ) -> fairopennet_models.DownloadFileResponse:
        """
        Description: 下载文件
        Summary: 下载文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.download_file_ex_async(request, headers, runtime)

    def download_file_ex(
        self,
        request: fairopennet_models.DownloadFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.DownloadFileResponse:
        """
        Description: 下载文件
        Summary: 下载文件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = fairopennet_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.fairopennet.file.download',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                download_file_response = fairopennet_models.DownloadFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return download_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.DownloadFileResponse(),
            self.do_request('1.0', 'antchain.fairopennet.file.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def download_file_ex_async(
        self,
        request: fairopennet_models.DownloadFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.DownloadFileResponse:
        """
        Description: 下载文件
        Summary: 下载文件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = fairopennet_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.fairopennet.file.download',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                download_file_response = fairopennet_models.DownloadFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return download_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.DownloadFileResponse(),
            await self.do_request_async('1.0', 'antchain.fairopennet.file.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: fairopennet_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> fairopennet_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: fairopennet_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> fairopennet_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: fairopennet_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: fairopennet_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> fairopennet_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            fairopennet_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
