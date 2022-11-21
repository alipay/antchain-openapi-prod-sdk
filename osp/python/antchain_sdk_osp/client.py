# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_osp import models as osp_models
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
        config: osp_models.Config,
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
            # meter 数据项
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
                    'sdk_version': '1.2.0',
                    '_prod_code': 'osp',
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
            # meter 数据项
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
                    'sdk_version': '1.2.0',
                    '_prod_code': 'osp',
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

    def query_instances(
        self,
        request: osp_models.QueryInstancesRequest,
    ) -> osp_models.QueryInstancesResponse:
        """
        Description: 查询实例信息
        Summary: 查询实例信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_instances_ex(request, headers, runtime)

    async def query_instances_async(
        self,
        request: osp_models.QueryInstancesRequest,
    ) -> osp_models.QueryInstancesResponse:
        """
        Description: 查询实例信息
        Summary: 查询实例信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_instances_ex_async(request, headers, runtime)

    def query_instances_ex(
        self,
        request: osp_models.QueryInstancesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.QueryInstancesResponse:
        """
        Description: 查询实例信息
        Summary: 查询实例信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.QueryInstancesResponse(),
            self.do_request('2.0', 'sofa.osp.instances.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_instances_ex_async(
        self,
        request: osp_models.QueryInstancesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.QueryInstancesResponse:
        """
        Description: 查询实例信息
        Summary: 查询实例信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.QueryInstancesResponse(),
            await self.do_request_async('2.0', 'sofa.osp.instances.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_products(
        self,
        request: osp_models.QueryProductsRequest,
    ) -> osp_models.QueryProductsResponse:
        """
        Description: 查询产品信息
        Summary: 查询产品信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_products_ex(request, headers, runtime)

    async def query_products_async(
        self,
        request: osp_models.QueryProductsRequest,
    ) -> osp_models.QueryProductsResponse:
        """
        Description: 查询产品信息
        Summary: 查询产品信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_products_ex_async(request, headers, runtime)

    def query_products_ex(
        self,
        request: osp_models.QueryProductsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.QueryProductsResponse:
        """
        Description: 查询产品信息
        Summary: 查询产品信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.QueryProductsResponse(),
            self.do_request('2.0', 'sofa.osp.products.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_products_ex_async(
        self,
        request: osp_models.QueryProductsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.QueryProductsResponse:
        """
        Description: 查询产品信息
        Summary: 查询产品信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.QueryProductsResponse(),
            await self.do_request_async('2.0', 'sofa.osp.products.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_endpoints(
        self,
        request: osp_models.QueryEndpointsRequest,
    ) -> osp_models.QueryEndpointsResponse:
        """
        Description: 获取共享中间件参数信息
        Summary: 获取共享中间件参数信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_endpoints_ex(request, headers, runtime)

    async def query_endpoints_async(
        self,
        request: osp_models.QueryEndpointsRequest,
    ) -> osp_models.QueryEndpointsResponse:
        """
        Description: 获取共享中间件参数信息
        Summary: 获取共享中间件参数信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_endpoints_ex_async(request, headers, runtime)

    def query_endpoints_ex(
        self,
        request: osp_models.QueryEndpointsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.QueryEndpointsResponse:
        """
        Description: 获取共享中间件参数信息
        Summary: 获取共享中间件参数信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.QueryEndpointsResponse(),
            self.do_request('2.0', 'sofa.osp.endpoints.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_endpoints_ex_async(
        self,
        request: osp_models.QueryEndpointsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.QueryEndpointsResponse:
        """
        Description: 获取共享中间件参数信息
        Summary: 获取共享中间件参数信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.QueryEndpointsResponse(),
            await self.do_request_async('2.0', 'sofa.osp.endpoints.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def scaleout_clusters(
        self,
        request: osp_models.ScaleoutClustersRequest,
    ) -> osp_models.ScaleoutClustersResponse:
        """
        Description: 针对 domain 进行扩容操作
        Summary: 扩容接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.scaleout_clusters_ex(request, headers, runtime)

    async def scaleout_clusters_async(
        self,
        request: osp_models.ScaleoutClustersRequest,
    ) -> osp_models.ScaleoutClustersResponse:
        """
        Description: 针对 domain 进行扩容操作
        Summary: 扩容接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.scaleout_clusters_ex_async(request, headers, runtime)

    def scaleout_clusters_ex(
        self,
        request: osp_models.ScaleoutClustersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.ScaleoutClustersResponse:
        """
        Description: 针对 domain 进行扩容操作
        Summary: 扩容接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.ScaleoutClustersResponse(),
            self.do_request('1.0', 'sofa.osp.clusters.scaleout', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def scaleout_clusters_ex_async(
        self,
        request: osp_models.ScaleoutClustersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.ScaleoutClustersResponse:
        """
        Description: 针对 domain 进行扩容操作
        Summary: 扩容接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.ScaleoutClustersResponse(),
            await self.do_request_async('1.0', 'sofa.osp.clusters.scaleout', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def scalein_cluster(
        self,
        request: osp_models.ScaleinClusterRequest,
    ) -> osp_models.ScaleinClusterResponse:
        """
        Description: 针对 domain 进行缩容
        Summary: 缩容接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.scalein_cluster_ex(request, headers, runtime)

    async def scalein_cluster_async(
        self,
        request: osp_models.ScaleinClusterRequest,
    ) -> osp_models.ScaleinClusterResponse:
        """
        Description: 针对 domain 进行缩容
        Summary: 缩容接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.scalein_cluster_ex_async(request, headers, runtime)

    def scalein_cluster_ex(
        self,
        request: osp_models.ScaleinClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.ScaleinClusterResponse:
        """
        Description: 针对 domain 进行缩容
        Summary: 缩容接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.ScaleinClusterResponse(),
            self.do_request('1.0', 'sofa.osp.cluster.scalein', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def scalein_cluster_ex_async(
        self,
        request: osp_models.ScaleinClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.ScaleinClusterResponse:
        """
        Description: 针对 domain 进行缩容
        Summary: 缩容接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.ScaleinClusterResponse(),
            await self.do_request_async('1.0', 'sofa.osp.cluster.scalein', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_clusters(
        self,
        request: osp_models.SetClustersRequest,
    ) -> osp_models.SetClustersResponse:
        """
        Description: 设置节点是否生效（上下线）
        Summary: 设置节点是否生效（上下线）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_clusters_ex(request, headers, runtime)

    async def set_clusters_async(
        self,
        request: osp_models.SetClustersRequest,
    ) -> osp_models.SetClustersResponse:
        """
        Description: 设置节点是否生效（上下线）
        Summary: 设置节点是否生效（上下线）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_clusters_ex_async(request, headers, runtime)

    def set_clusters_ex(
        self,
        request: osp_models.SetClustersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.SetClustersResponse:
        """
        Description: 设置节点是否生效（上下线）
        Summary: 设置节点是否生效（上下线）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.SetClustersResponse(),
            self.do_request('1.0', 'sofa.osp.clusters.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_clusters_ex_async(
        self,
        request: osp_models.SetClustersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.SetClustersResponse:
        """
        Description: 设置节点是否生效（上下线）
        Summary: 设置节点是否生效（上下线）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.SetClustersResponse(),
            await self.do_request_async('1.0', 'sofa.osp.clusters.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_instances(
        self,
        request: osp_models.GetInstancesRequest,
    ) -> osp_models.GetInstancesResponse:
        """
        Description: 根据instanceId获取对应的tenant和workspace的信息
        Summary: 获取instance详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_instances_ex(request, headers, runtime)

    async def get_instances_async(
        self,
        request: osp_models.GetInstancesRequest,
    ) -> osp_models.GetInstancesResponse:
        """
        Description: 根据instanceId获取对应的tenant和workspace的信息
        Summary: 获取instance详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_instances_ex_async(request, headers, runtime)

    def get_instances_ex(
        self,
        request: osp_models.GetInstancesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.GetInstancesResponse:
        """
        Description: 根据instanceId获取对应的tenant和workspace的信息
        Summary: 获取instance详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.GetInstancesResponse(),
            self.do_request('1.0', 'sofa.osp.instances.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_instances_ex_async(
        self,
        request: osp_models.GetInstancesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.GetInstancesResponse:
        """
        Description: 根据instanceId获取对应的tenant和workspace的信息
        Summary: 获取instance详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.GetInstancesResponse(),
            await self.do_request_async('1.0', 'sofa.osp.instances.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_accesskey(
        self,
        request: osp_models.CreateAccesskeyRequest,
    ) -> osp_models.CreateAccesskeyResponse:
        """
        Description: 用户传入 instanceId 和 name 两个参数 ，然后该接口根据这些参数 生成对应的AK/SK 后返回
        Summary: 创建AK/SK的接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_accesskey_ex(request, headers, runtime)

    async def create_accesskey_async(
        self,
        request: osp_models.CreateAccesskeyRequest,
    ) -> osp_models.CreateAccesskeyResponse:
        """
        Description: 用户传入 instanceId 和 name 两个参数 ，然后该接口根据这些参数 生成对应的AK/SK 后返回
        Summary: 创建AK/SK的接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_accesskey_ex_async(request, headers, runtime)

    def create_accesskey_ex(
        self,
        request: osp_models.CreateAccesskeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.CreateAccesskeyResponse:
        """
        Description: 用户传入 instanceId 和 name 两个参数 ，然后该接口根据这些参数 生成对应的AK/SK 后返回
        Summary: 创建AK/SK的接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.CreateAccesskeyResponse(),
            self.do_request('1.0', 'sofa.osp.accesskey.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_accesskey_ex_async(
        self,
        request: osp_models.CreateAccesskeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.CreateAccesskeyResponse:
        """
        Description: 用户传入 instanceId 和 name 两个参数 ，然后该接口根据这些参数 生成对应的AK/SK 后返回
        Summary: 创建AK/SK的接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.CreateAccesskeyResponse(),
            await self.do_request_async('1.0', 'sofa.osp.accesskey.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_accesskey(
        self,
        request: osp_models.GetAccesskeyRequest,
    ) -> osp_models.GetAccesskeyResponse:
        """
        Description: 根据 instanceId 和 name获取AK/SK的接口
        Summary: 获取AK/SK的接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_accesskey_ex(request, headers, runtime)

    async def get_accesskey_async(
        self,
        request: osp_models.GetAccesskeyRequest,
    ) -> osp_models.GetAccesskeyResponse:
        """
        Description: 根据 instanceId 和 name获取AK/SK的接口
        Summary: 获取AK/SK的接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_accesskey_ex_async(request, headers, runtime)

    def get_accesskey_ex(
        self,
        request: osp_models.GetAccesskeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.GetAccesskeyResponse:
        """
        Description: 根据 instanceId 和 name获取AK/SK的接口
        Summary: 获取AK/SK的接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.GetAccesskeyResponse(),
            self.do_request('1.0', 'sofa.osp.accesskey.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_accesskey_ex_async(
        self,
        request: osp_models.GetAccesskeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.GetAccesskeyResponse:
        """
        Description: 根据 instanceId 和 name获取AK/SK的接口
        Summary: 获取AK/SK的接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.GetAccesskeyResponse(),
            await self.do_request_async('1.0', 'sofa.osp.accesskey.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_middleware_meta(
        self,
        request: osp_models.GetMiddlewareMetaRequest,
    ) -> osp_models.GetMiddlewareMetaResponse:
        """
        Description: 中间件元数据获取
        Summary: 中间件元数据获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_middleware_meta_ex(request, headers, runtime)

    async def get_middleware_meta_async(
        self,
        request: osp_models.GetMiddlewareMetaRequest,
    ) -> osp_models.GetMiddlewareMetaResponse:
        """
        Description: 中间件元数据获取
        Summary: 中间件元数据获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_middleware_meta_ex_async(request, headers, runtime)

    def get_middleware_meta_ex(
        self,
        request: osp_models.GetMiddlewareMetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.GetMiddlewareMetaResponse:
        """
        Description: 中间件元数据获取
        Summary: 中间件元数据获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.GetMiddlewareMetaResponse(),
            self.do_request('1.0', 'sofa.osp.middleware.meta.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_middleware_meta_ex_async(
        self,
        request: osp_models.GetMiddlewareMetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.GetMiddlewareMetaResponse:
        """
        Description: 中间件元数据获取
        Summary: 中间件元数据获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.GetMiddlewareMetaResponse(),
            await self.do_request_async('1.0', 'sofa.osp.middleware.meta.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_workspacegroup_instance(
        self,
        request: osp_models.GetWorkspacegroupInstanceRequest,
    ) -> osp_models.GetWorkspacegroupInstanceResponse:
        """
        Description: 根据workspaceGroup查询instanceId
        Summary: 查询instanceId
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_workspacegroup_instance_ex(request, headers, runtime)

    async def get_workspacegroup_instance_async(
        self,
        request: osp_models.GetWorkspacegroupInstanceRequest,
    ) -> osp_models.GetWorkspacegroupInstanceResponse:
        """
        Description: 根据workspaceGroup查询instanceId
        Summary: 查询instanceId
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_workspacegroup_instance_ex_async(request, headers, runtime)

    def get_workspacegroup_instance_ex(
        self,
        request: osp_models.GetWorkspacegroupInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.GetWorkspacegroupInstanceResponse:
        """
        Description: 根据workspaceGroup查询instanceId
        Summary: 查询instanceId
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.GetWorkspacegroupInstanceResponse(),
            self.do_request('1.0', 'sofa.osp.workspacegroup.instance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_workspacegroup_instance_ex_async(
        self,
        request: osp_models.GetWorkspacegroupInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.GetWorkspacegroupInstanceResponse:
        """
        Description: 根据workspaceGroup查询instanceId
        Summary: 查询instanceId
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.GetWorkspacegroupInstanceResponse(),
            await self.do_request_async('1.0', 'sofa.osp.workspacegroup.instance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_middleware_clustermode(
        self,
        request: osp_models.QueryMiddlewareClustermodeRequest,
    ) -> osp_models.QueryMiddlewareClustermodeResponse:
        """
        Description: 查询中间件集群模式
        Summary: 查询中间件集群模式
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_middleware_clustermode_ex(request, headers, runtime)

    async def query_middleware_clustermode_async(
        self,
        request: osp_models.QueryMiddlewareClustermodeRequest,
    ) -> osp_models.QueryMiddlewareClustermodeResponse:
        """
        Description: 查询中间件集群模式
        Summary: 查询中间件集群模式
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_middleware_clustermode_ex_async(request, headers, runtime)

    def query_middleware_clustermode_ex(
        self,
        request: osp_models.QueryMiddlewareClustermodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.QueryMiddlewareClustermodeResponse:
        """
        Description: 查询中间件集群模式
        Summary: 查询中间件集群模式
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.QueryMiddlewareClustermodeResponse(),
            self.do_request('1.0', 'sofa.osp.middleware.clustermode.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_middleware_clustermode_ex_async(
        self,
        request: osp_models.QueryMiddlewareClustermodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.QueryMiddlewareClustermodeResponse:
        """
        Description: 查询中间件集群模式
        Summary: 查询中间件集群模式
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.QueryMiddlewareClustermodeResponse(),
            await self.do_request_async('1.0', 'sofa.osp.middleware.clustermode.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_middleware_clusters(
        self,
        request: osp_models.QueryMiddlewareClustersRequest,
    ) -> osp_models.QueryMiddlewareClustersResponse:
        """
        Description: 查询中间件集群列表
        Summary: 查询中间件集群列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_middleware_clusters_ex(request, headers, runtime)

    async def query_middleware_clusters_async(
        self,
        request: osp_models.QueryMiddlewareClustersRequest,
    ) -> osp_models.QueryMiddlewareClustersResponse:
        """
        Description: 查询中间件集群列表
        Summary: 查询中间件集群列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_middleware_clusters_ex_async(request, headers, runtime)

    def query_middleware_clusters_ex(
        self,
        request: osp_models.QueryMiddlewareClustersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.QueryMiddlewareClustersResponse:
        """
        Description: 查询中间件集群列表
        Summary: 查询中间件集群列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.QueryMiddlewareClustersResponse(),
            self.do_request('1.0', 'sofa.osp.middleware.clusters.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_middleware_clusters_ex_async(
        self,
        request: osp_models.QueryMiddlewareClustersRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.QueryMiddlewareClustersResponse:
        """
        Description: 查询中间件集群列表
        Summary: 查询中间件集群列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.QueryMiddlewareClustersResponse(),
            await self.do_request_async('1.0', 'sofa.osp.middleware.clusters.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_middleware_instance(
        self,
        request: osp_models.BindMiddlewareInstanceRequest,
    ) -> osp_models.BindMiddlewareInstanceResponse:
        """
        Description: 绑定中间件列表
        Summary: 绑定中间件列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_middleware_instance_ex(request, headers, runtime)

    async def bind_middleware_instance_async(
        self,
        request: osp_models.BindMiddlewareInstanceRequest,
    ) -> osp_models.BindMiddlewareInstanceResponse:
        """
        Description: 绑定中间件列表
        Summary: 绑定中间件列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_middleware_instance_ex_async(request, headers, runtime)

    def bind_middleware_instance_ex(
        self,
        request: osp_models.BindMiddlewareInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.BindMiddlewareInstanceResponse:
        """
        Description: 绑定中间件列表
        Summary: 绑定中间件列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.BindMiddlewareInstanceResponse(),
            self.do_request('1.0', 'sofa.osp.middleware.instance.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_middleware_instance_ex_async(
        self,
        request: osp_models.BindMiddlewareInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.BindMiddlewareInstanceResponse:
        """
        Description: 绑定中间件列表
        Summary: 绑定中间件列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.BindMiddlewareInstanceResponse(),
            await self.do_request_async('1.0', 'sofa.osp.middleware.instance.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unbind_middleware_instance(
        self,
        request: osp_models.UnbindMiddlewareInstanceRequest,
    ) -> osp_models.UnbindMiddlewareInstanceResponse:
        """
        Description: paas 解绑中间件
        Summary: 解绑中间件实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unbind_middleware_instance_ex(request, headers, runtime)

    async def unbind_middleware_instance_async(
        self,
        request: osp_models.UnbindMiddlewareInstanceRequest,
    ) -> osp_models.UnbindMiddlewareInstanceResponse:
        """
        Description: paas 解绑中间件
        Summary: 解绑中间件实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unbind_middleware_instance_ex_async(request, headers, runtime)

    def unbind_middleware_instance_ex(
        self,
        request: osp_models.UnbindMiddlewareInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.UnbindMiddlewareInstanceResponse:
        """
        Description: paas 解绑中间件
        Summary: 解绑中间件实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.UnbindMiddlewareInstanceResponse(),
            self.do_request('1.0', 'sofa.osp.middleware.instance.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unbind_middleware_instance_ex_async(
        self,
        request: osp_models.UnbindMiddlewareInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.UnbindMiddlewareInstanceResponse:
        """
        Description: paas 解绑中间件
        Summary: 解绑中间件实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.UnbindMiddlewareInstanceResponse(),
            await self.do_request_async('1.0', 'sofa.osp.middleware.instance.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_licence_meterdata(
        self,
        request: osp_models.PushLicenceMeterdataRequest,
    ) -> osp_models.PushLicenceMeterdataResponse:
        """
        Description: licence 实时计量数据推送
        Summary: licence 实时计量数据推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_licence_meterdata_ex(request, headers, runtime)

    async def push_licence_meterdata_async(
        self,
        request: osp_models.PushLicenceMeterdataRequest,
    ) -> osp_models.PushLicenceMeterdataResponse:
        """
        Description: licence 实时计量数据推送
        Summary: licence 实时计量数据推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_licence_meterdata_ex_async(request, headers, runtime)

    def push_licence_meterdata_ex(
        self,
        request: osp_models.PushLicenceMeterdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.PushLicenceMeterdataResponse:
        """
        Description: licence 实时计量数据推送
        Summary: licence 实时计量数据推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.PushLicenceMeterdataResponse(),
            self.do_request('1.0', 'sofa.osp.licence.meterdata.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_licence_meterdata_ex_async(
        self,
        request: osp_models.PushLicenceMeterdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.PushLicenceMeterdataResponse:
        """
        Description: licence 实时计量数据推送
        Summary: licence 实时计量数据推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.PushLicenceMeterdataResponse(),
            await self.do_request_async('1.0', 'sofa.osp.licence.meterdata.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_licence_meterdata(
        self,
        request: osp_models.PagequeryLicenceMeterdataRequest,
    ) -> osp_models.PagequeryLicenceMeterdataResponse:
        """
        Description: 分页查询 license 的计量数据
        Summary: 分页查询 license 的计量数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_licence_meterdata_ex(request, headers, runtime)

    async def pagequery_licence_meterdata_async(
        self,
        request: osp_models.PagequeryLicenceMeterdataRequest,
    ) -> osp_models.PagequeryLicenceMeterdataResponse:
        """
        Description: 分页查询 license 的计量数据
        Summary: 分页查询 license 的计量数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_licence_meterdata_ex_async(request, headers, runtime)

    def pagequery_licence_meterdata_ex(
        self,
        request: osp_models.PagequeryLicenceMeterdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.PagequeryLicenceMeterdataResponse:
        """
        Description: 分页查询 license 的计量数据
        Summary: 分页查询 license 的计量数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.PagequeryLicenceMeterdataResponse(),
            self.do_request('1.0', 'sofa.osp.licence.meterdata.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_licence_meterdata_ex_async(
        self,
        request: osp_models.PagequeryLicenceMeterdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> osp_models.PagequeryLicenceMeterdataResponse:
        """
        Description: 分页查询 license 的计量数据
        Summary: 分页查询 license 的计量数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            osp_models.PagequeryLicenceMeterdataResponse(),
            await self.do_request_async('1.0', 'sofa.osp.licence.meterdata.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
