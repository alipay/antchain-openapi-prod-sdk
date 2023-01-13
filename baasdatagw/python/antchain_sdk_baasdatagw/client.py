# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_baasdatagw import models as baasdatagw_models
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
        config: baasdatagw_models.Config,
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
            # 链上交易中的事件
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
                    'sdk_version': '1.3.1',
                    '_prod_code': 'BAASDATAGW',
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
            # 链上交易中的事件
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
                    'sdk_version': '1.3.1',
                    '_prod_code': 'BAASDATAGW',
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

    def query_datasearch_search(
        self,
        request: baasdatagw_models.QueryDatasearchSearchRequest,
    ) -> baasdatagw_models.QueryDatasearchSearchResponse:
        """
        Description: 检索索引的链上数据
        Summary: 检索索引的链上数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_datasearch_search_ex(request, headers, runtime)

    async def query_datasearch_search_async(
        self,
        request: baasdatagw_models.QueryDatasearchSearchRequest,
    ) -> baasdatagw_models.QueryDatasearchSearchResponse:
        """
        Description: 检索索引的链上数据
        Summary: 检索索引的链上数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_datasearch_search_ex_async(request, headers, runtime)

    def query_datasearch_search_ex(
        self,
        request: baasdatagw_models.QueryDatasearchSearchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryDatasearchSearchResponse:
        """
        Description: 检索索引的链上数据
        Summary: 检索索引的链上数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryDatasearchSearchResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.datasearch.search.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_datasearch_search_ex_async(
        self,
        request: baasdatagw_models.QueryDatasearchSearchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryDatasearchSearchResponse:
        """
        Description: 检索索引的链上数据
        Summary: 检索索引的链上数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryDatasearchSearchResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.datasearch.search.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_datasearch_index(
        self,
        request: baasdatagw_models.StartDatasearchIndexRequest,
    ) -> baasdatagw_models.StartDatasearchIndexResponse:
        """
        Description: 针对某个数据类型的数据开启索引；该方法可重入
        Summary: 开启数据索引
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_datasearch_index_ex(request, headers, runtime)

    async def start_datasearch_index_async(
        self,
        request: baasdatagw_models.StartDatasearchIndexRequest,
    ) -> baasdatagw_models.StartDatasearchIndexResponse:
        """
        Description: 针对某个数据类型的数据开启索引；该方法可重入
        Summary: 开启数据索引
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_datasearch_index_ex_async(request, headers, runtime)

    def start_datasearch_index_ex(
        self,
        request: baasdatagw_models.StartDatasearchIndexRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.StartDatasearchIndexResponse:
        """
        Description: 针对某个数据类型的数据开启索引；该方法可重入
        Summary: 开启数据索引
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.StartDatasearchIndexResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.datasearch.index.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_datasearch_index_ex_async(
        self,
        request: baasdatagw_models.StartDatasearchIndexRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.StartDatasearchIndexResponse:
        """
        Description: 针对某个数据类型的数据开启索引；该方法可重入
        Summary: 开启数据索引
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.StartDatasearchIndexResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.datasearch.index.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def stop_datasearch_index(
        self,
        request: baasdatagw_models.StopDatasearchIndexRequest,
    ) -> baasdatagw_models.StopDatasearchIndexResponse:
        """
        Description: 针对某个分组的数据停止索引；该方法可重入
        Summary: 停止数据索引
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.stop_datasearch_index_ex(request, headers, runtime)

    async def stop_datasearch_index_async(
        self,
        request: baasdatagw_models.StopDatasearchIndexRequest,
    ) -> baasdatagw_models.StopDatasearchIndexResponse:
        """
        Description: 针对某个分组的数据停止索引；该方法可重入
        Summary: 停止数据索引
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.stop_datasearch_index_ex_async(request, headers, runtime)

    def stop_datasearch_index_ex(
        self,
        request: baasdatagw_models.StopDatasearchIndexRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.StopDatasearchIndexResponse:
        """
        Description: 针对某个分组的数据停止索引；该方法可重入
        Summary: 停止数据索引
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.StopDatasearchIndexResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.datasearch.index.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def stop_datasearch_index_ex_async(
        self,
        request: baasdatagw_models.StopDatasearchIndexRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.StopDatasearchIndexResponse:
        """
        Description: 针对某个分组的数据停止索引；该方法可重入
        Summary: 停止数据索引
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.StopDatasearchIndexResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.datasearch.index.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def remove_datasearch_index(
        self,
        request: baasdatagw_models.RemoveDatasearchIndexRequest,
    ) -> baasdatagw_models.RemoveDatasearchIndexResponse:
        """
        Description: 针对某个分组的数据删除索引（ES 中的数据仍然存在, 不会删除）；该方法不可重入
        Summary: 删除数据索引
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.remove_datasearch_index_ex(request, headers, runtime)

    async def remove_datasearch_index_async(
        self,
        request: baasdatagw_models.RemoveDatasearchIndexRequest,
    ) -> baasdatagw_models.RemoveDatasearchIndexResponse:
        """
        Description: 针对某个分组的数据删除索引（ES 中的数据仍然存在, 不会删除）；该方法不可重入
        Summary: 删除数据索引
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.remove_datasearch_index_ex_async(request, headers, runtime)

    def remove_datasearch_index_ex(
        self,
        request: baasdatagw_models.RemoveDatasearchIndexRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.RemoveDatasearchIndexResponse:
        """
        Description: 针对某个分组的数据删除索引（ES 中的数据仍然存在, 不会删除）；该方法不可重入
        Summary: 删除数据索引
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.RemoveDatasearchIndexResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.datasearch.index.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def remove_datasearch_index_ex_async(
        self,
        request: baasdatagw_models.RemoveDatasearchIndexRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.RemoveDatasearchIndexResponse:
        """
        Description: 针对某个分组的数据删除索引（ES 中的数据仍然存在, 不会删除）；该方法不可重入
        Summary: 删除数据索引
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.RemoveDatasearchIndexResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.datasearch.index.remove', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_datasearch_index(
        self,
        request: baasdatagw_models.GetDatasearchIndexRequest,
    ) -> baasdatagw_models.GetDatasearchIndexResponse:
        """
        Description: 查询分组的索引进度，返回当前索引的索引进度（块高）
        Summary: 查询数据索引进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_datasearch_index_ex(request, headers, runtime)

    async def get_datasearch_index_async(
        self,
        request: baasdatagw_models.GetDatasearchIndexRequest,
    ) -> baasdatagw_models.GetDatasearchIndexResponse:
        """
        Description: 查询分组的索引进度，返回当前索引的索引进度（块高）
        Summary: 查询数据索引进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_datasearch_index_ex_async(request, headers, runtime)

    def get_datasearch_index_ex(
        self,
        request: baasdatagw_models.GetDatasearchIndexRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.GetDatasearchIndexResponse:
        """
        Description: 查询分组的索引进度，返回当前索引的索引进度（块高）
        Summary: 查询数据索引进度
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.GetDatasearchIndexResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.datasearch.index.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_datasearch_index_ex_async(
        self,
        request: baasdatagw_models.GetDatasearchIndexRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.GetDatasearchIndexResponse:
        """
        Description: 查询分组的索引进度，返回当前索引的索引进度（块高）
        Summary: 查询数据索引进度
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.GetDatasearchIndexResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.datasearch.index.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_contractmeta(
        self,
        request: baasdatagw_models.ListContractmetaRequest,
    ) -> baasdatagw_models.ListContractmetaResponse:
        """
        Description: 列出租户在链上的所有合约Meta
        Summary: 列出租户在链上的所有合约Meta
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_contractmeta_ex(request, headers, runtime)

    async def list_contractmeta_async(
        self,
        request: baasdatagw_models.ListContractmetaRequest,
    ) -> baasdatagw_models.ListContractmetaResponse:
        """
        Description: 列出租户在链上的所有合约Meta
        Summary: 列出租户在链上的所有合约Meta
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_contractmeta_ex_async(request, headers, runtime)

    def list_contractmeta_ex(
        self,
        request: baasdatagw_models.ListContractmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.ListContractmetaResponse:
        """
        Description: 列出租户在链上的所有合约Meta
        Summary: 列出租户在链上的所有合约Meta
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.ListContractmetaResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.contractmeta.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_contractmeta_ex_async(
        self,
        request: baasdatagw_models.ListContractmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.ListContractmetaResponse:
        """
        Description: 列出租户在链上的所有合约Meta
        Summary: 列出租户在链上的所有合约Meta
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.ListContractmetaResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.contractmeta.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_contractmeta(
        self,
        request: baasdatagw_models.AddContractmetaRequest,
    ) -> baasdatagw_models.AddContractmetaResponse:
        """
        Description: 新增合约Meta
        Summary: 新增合约Meta
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_contractmeta_ex(request, headers, runtime)

    async def add_contractmeta_async(
        self,
        request: baasdatagw_models.AddContractmetaRequest,
    ) -> baasdatagw_models.AddContractmetaResponse:
        """
        Description: 新增合约Meta
        Summary: 新增合约Meta
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_contractmeta_ex_async(request, headers, runtime)

    def add_contractmeta_ex(
        self,
        request: baasdatagw_models.AddContractmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.AddContractmetaResponse:
        """
        Description: 新增合约Meta
        Summary: 新增合约Meta
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.AddContractmetaResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.contractmeta.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_contractmeta_ex_async(
        self,
        request: baasdatagw_models.AddContractmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.AddContractmetaResponse:
        """
        Description: 新增合约Meta
        Summary: 新增合约Meta
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.AddContractmetaResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.contractmeta.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_contractmeta(
        self,
        request: baasdatagw_models.DeleteContractmetaRequest,
    ) -> baasdatagw_models.DeleteContractmetaResponse:
        """
        Description: 删除合约meta
        Summary: 删除合约meta
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_contractmeta_ex(request, headers, runtime)

    async def delete_contractmeta_async(
        self,
        request: baasdatagw_models.DeleteContractmetaRequest,
    ) -> baasdatagw_models.DeleteContractmetaResponse:
        """
        Description: 删除合约meta
        Summary: 删除合约meta
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_contractmeta_ex_async(request, headers, runtime)

    def delete_contractmeta_ex(
        self,
        request: baasdatagw_models.DeleteContractmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.DeleteContractmetaResponse:
        """
        Description: 删除合约meta
        Summary: 删除合约meta
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.DeleteContractmetaResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.contractmeta.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_contractmeta_ex_async(
        self,
        request: baasdatagw_models.DeleteContractmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.DeleteContractmetaResponse:
        """
        Description: 删除合约meta
        Summary: 删除合约meta
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.DeleteContractmetaResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.contractmeta.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_contractmeta(
        self,
        request: baasdatagw_models.GetContractmetaRequest,
    ) -> baasdatagw_models.GetContractmetaResponse:
        """
        Description: 查询meta具体信息
        Summary: 获取meta信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_contractmeta_ex(request, headers, runtime)

    async def get_contractmeta_async(
        self,
        request: baasdatagw_models.GetContractmetaRequest,
    ) -> baasdatagw_models.GetContractmetaResponse:
        """
        Description: 查询meta具体信息
        Summary: 获取meta信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_contractmeta_ex_async(request, headers, runtime)

    def get_contractmeta_ex(
        self,
        request: baasdatagw_models.GetContractmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.GetContractmetaResponse:
        """
        Description: 查询meta具体信息
        Summary: 获取meta信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.GetContractmetaResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.contractmeta.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_contractmeta_ex_async(
        self,
        request: baasdatagw_models.GetContractmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.GetContractmetaResponse:
        """
        Description: 查询meta具体信息
        Summary: 获取meta信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.GetContractmetaResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.contractmeta.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_dataexport_previewdata(
        self,
        request: baasdatagw_models.CreateDataexportPreviewdataRequest,
    ) -> baasdatagw_models.CreateDataexportPreviewdataResponse:
        """
        Description: 获取导出任务预览数据的异步任务ID
        Summary: 获取导出任务预览数据的异步任务ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_dataexport_previewdata_ex(request, headers, runtime)

    async def create_dataexport_previewdata_async(
        self,
        request: baasdatagw_models.CreateDataexportPreviewdataRequest,
    ) -> baasdatagw_models.CreateDataexportPreviewdataResponse:
        """
        Description: 获取导出任务预览数据的异步任务ID
        Summary: 获取导出任务预览数据的异步任务ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_dataexport_previewdata_ex_async(request, headers, runtime)

    def create_dataexport_previewdata_ex(
        self,
        request: baasdatagw_models.CreateDataexportPreviewdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.CreateDataexportPreviewdataResponse:
        """
        Description: 获取导出任务预览数据的异步任务ID
        Summary: 获取导出任务预览数据的异步任务ID
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.CreateDataexportPreviewdataResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.dataexport.previewdata.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_dataexport_previewdata_ex_async(
        self,
        request: baasdatagw_models.CreateDataexportPreviewdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.CreateDataexportPreviewdataResponse:
        """
        Description: 获取导出任务预览数据的异步任务ID
        Summary: 获取导出任务预览数据的异步任务ID
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.CreateDataexportPreviewdataResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.dataexport.previewdata.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dataexport_previewdata(
        self,
        request: baasdatagw_models.QueryDataexportPreviewdataRequest,
    ) -> baasdatagw_models.QueryDataexportPreviewdataResponse:
        """
        Description: 查询数据预览任务结果
        Summary: 查询数据预览任务结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dataexport_previewdata_ex(request, headers, runtime)

    async def query_dataexport_previewdata_async(
        self,
        request: baasdatagw_models.QueryDataexportPreviewdataRequest,
    ) -> baasdatagw_models.QueryDataexportPreviewdataResponse:
        """
        Description: 查询数据预览任务结果
        Summary: 查询数据预览任务结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dataexport_previewdata_ex_async(request, headers, runtime)

    def query_dataexport_previewdata_ex(
        self,
        request: baasdatagw_models.QueryDataexportPreviewdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryDataexportPreviewdataResponse:
        """
        Description: 查询数据预览任务结果
        Summary: 查询数据预览任务结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryDataexportPreviewdataResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.dataexport.previewdata.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dataexport_previewdata_ex_async(
        self,
        request: baasdatagw_models.QueryDataexportPreviewdataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryDataexportPreviewdataResponse:
        """
        Description: 查询数据预览任务结果
        Summary: 查询数据预览任务结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryDataexportPreviewdataResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.dataexport.previewdata.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_dataexport_previewsmapping(
        self,
        request: baasdatagw_models.GetDataexportPreviewsmappingRequest,
    ) -> baasdatagw_models.GetDataexportPreviewsmappingResponse:
        """
        Description: 查询默认字段映射
        Summary: 查询默认字段映射
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_dataexport_previewsmapping_ex(request, headers, runtime)

    async def get_dataexport_previewsmapping_async(
        self,
        request: baasdatagw_models.GetDataexportPreviewsmappingRequest,
    ) -> baasdatagw_models.GetDataexportPreviewsmappingResponse:
        """
        Description: 查询默认字段映射
        Summary: 查询默认字段映射
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_dataexport_previewsmapping_ex_async(request, headers, runtime)

    def get_dataexport_previewsmapping_ex(
        self,
        request: baasdatagw_models.GetDataexportPreviewsmappingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.GetDataexportPreviewsmappingResponse:
        """
        Description: 查询默认字段映射
        Summary: 查询默认字段映射
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.GetDataexportPreviewsmappingResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.dataexport.previewsmapping.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_dataexport_previewsmapping_ex_async(
        self,
        request: baasdatagw_models.GetDataexportPreviewsmappingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.GetDataexportPreviewsmappingResponse:
        """
        Description: 查询默认字段映射
        Summary: 查询默认字段映射
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.GetDataexportPreviewsmappingResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.dataexport.previewsmapping.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_dataexport_trigger(
        self,
        request: baasdatagw_models.CreateDataexportTriggerRequest,
    ) -> baasdatagw_models.CreateDataexportTriggerResponse:
        """
        Description: 创建导出任务
        Summary: 创建导出任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_dataexport_trigger_ex(request, headers, runtime)

    async def create_dataexport_trigger_async(
        self,
        request: baasdatagw_models.CreateDataexportTriggerRequest,
    ) -> baasdatagw_models.CreateDataexportTriggerResponse:
        """
        Description: 创建导出任务
        Summary: 创建导出任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_dataexport_trigger_ex_async(request, headers, runtime)

    def create_dataexport_trigger_ex(
        self,
        request: baasdatagw_models.CreateDataexportTriggerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.CreateDataexportTriggerResponse:
        """
        Description: 创建导出任务
        Summary: 创建导出任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.CreateDataexportTriggerResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.dataexport.trigger.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_dataexport_trigger_ex_async(
        self,
        request: baasdatagw_models.CreateDataexportTriggerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.CreateDataexportTriggerResponse:
        """
        Description: 创建导出任务
        Summary: 创建导出任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.CreateDataexportTriggerResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.dataexport.trigger.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dataexport_previewsql(
        self,
        request: baasdatagw_models.QueryDataexportPreviewsqlRequest,
    ) -> baasdatagw_models.QueryDataexportPreviewsqlResponse:
        """
        Description: 查询建表语句
        Summary: 查询建表语句
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dataexport_previewsql_ex(request, headers, runtime)

    async def query_dataexport_previewsql_async(
        self,
        request: baasdatagw_models.QueryDataexportPreviewsqlRequest,
    ) -> baasdatagw_models.QueryDataexportPreviewsqlResponse:
        """
        Description: 查询建表语句
        Summary: 查询建表语句
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dataexport_previewsql_ex_async(request, headers, runtime)

    def query_dataexport_previewsql_ex(
        self,
        request: baasdatagw_models.QueryDataexportPreviewsqlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryDataexportPreviewsqlResponse:
        """
        Description: 查询建表语句
        Summary: 查询建表语句
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryDataexportPreviewsqlResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.dataexport.previewsql.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dataexport_previewsql_ex_async(
        self,
        request: baasdatagw_models.QueryDataexportPreviewsqlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryDataexportPreviewsqlResponse:
        """
        Description: 查询建表语句
        Summary: 查询建表语句
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryDataexportPreviewsqlResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.dataexport.previewsql.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_dataexport_trigger(
        self,
        request: baasdatagw_models.ListDataexportTriggerRequest,
    ) -> baasdatagw_models.ListDataexportTriggerResponse:
        """
        Description: 列出导出任务
        Summary: 列出导出任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_dataexport_trigger_ex(request, headers, runtime)

    async def list_dataexport_trigger_async(
        self,
        request: baasdatagw_models.ListDataexportTriggerRequest,
    ) -> baasdatagw_models.ListDataexportTriggerResponse:
        """
        Description: 列出导出任务
        Summary: 列出导出任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_dataexport_trigger_ex_async(request, headers, runtime)

    def list_dataexport_trigger_ex(
        self,
        request: baasdatagw_models.ListDataexportTriggerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.ListDataexportTriggerResponse:
        """
        Description: 列出导出任务
        Summary: 列出导出任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.ListDataexportTriggerResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.dataexport.trigger.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_dataexport_trigger_ex_async(
        self,
        request: baasdatagw_models.ListDataexportTriggerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.ListDataexportTriggerResponse:
        """
        Description: 列出导出任务
        Summary: 列出导出任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.ListDataexportTriggerResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.dataexport.trigger.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_dataexport_triggerstatus(
        self,
        request: baasdatagw_models.OperateDataexportTriggerstatusRequest,
    ) -> baasdatagw_models.OperateDataexportTriggerstatusResponse:
        """
        Description: 修改导出任务状态
        Summary: 修改导出任务状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_dataexport_triggerstatus_ex(request, headers, runtime)

    async def operate_dataexport_triggerstatus_async(
        self,
        request: baasdatagw_models.OperateDataexportTriggerstatusRequest,
    ) -> baasdatagw_models.OperateDataexportTriggerstatusResponse:
        """
        Description: 修改导出任务状态
        Summary: 修改导出任务状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_dataexport_triggerstatus_ex_async(request, headers, runtime)

    def operate_dataexport_triggerstatus_ex(
        self,
        request: baasdatagw_models.OperateDataexportTriggerstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.OperateDataexportTriggerstatusResponse:
        """
        Description: 修改导出任务状态
        Summary: 修改导出任务状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.OperateDataexportTriggerstatusResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.dataexport.triggerstatus.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_dataexport_triggerstatus_ex_async(
        self,
        request: baasdatagw_models.OperateDataexportTriggerstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.OperateDataexportTriggerstatusResponse:
        """
        Description: 修改导出任务状态
        Summary: 修改导出任务状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.OperateDataexportTriggerstatusResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.dataexport.triggerstatus.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_dataexport_triggerconfig(
        self,
        request: baasdatagw_models.OperateDataexportTriggerconfigRequest,
    ) -> baasdatagw_models.OperateDataexportTriggerconfigResponse:
        """
        Description: 修改导出任务配置
        Summary: 修改导出任务配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_dataexport_triggerconfig_ex(request, headers, runtime)

    async def operate_dataexport_triggerconfig_async(
        self,
        request: baasdatagw_models.OperateDataexportTriggerconfigRequest,
    ) -> baasdatagw_models.OperateDataexportTriggerconfigResponse:
        """
        Description: 修改导出任务配置
        Summary: 修改导出任务配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_dataexport_triggerconfig_ex_async(request, headers, runtime)

    def operate_dataexport_triggerconfig_ex(
        self,
        request: baasdatagw_models.OperateDataexportTriggerconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.OperateDataexportTriggerconfigResponse:
        """
        Description: 修改导出任务配置
        Summary: 修改导出任务配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.OperateDataexportTriggerconfigResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.dataexport.triggerconfig.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_dataexport_triggerconfig_ex_async(
        self,
        request: baasdatagw_models.OperateDataexportTriggerconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.OperateDataexportTriggerconfigResponse:
        """
        Description: 修改导出任务配置
        Summary: 修改导出任务配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.OperateDataexportTriggerconfigResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.dataexport.triggerconfig.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_dataexport_triggerlog(
        self,
        request: baasdatagw_models.ListDataexportTriggerlogRequest,
    ) -> baasdatagw_models.ListDataexportTriggerlogResponse:
        """
        Description: 列出导出任务失败日志
        Summary: 列出导出任务失败日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_dataexport_triggerlog_ex(request, headers, runtime)

    async def list_dataexport_triggerlog_async(
        self,
        request: baasdatagw_models.ListDataexportTriggerlogRequest,
    ) -> baasdatagw_models.ListDataexportTriggerlogResponse:
        """
        Description: 列出导出任务失败日志
        Summary: 列出导出任务失败日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_dataexport_triggerlog_ex_async(request, headers, runtime)

    def list_dataexport_triggerlog_ex(
        self,
        request: baasdatagw_models.ListDataexportTriggerlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.ListDataexportTriggerlogResponse:
        """
        Description: 列出导出任务失败日志
        Summary: 列出导出任务失败日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.ListDataexportTriggerlogResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.dataexport.triggerlog.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_dataexport_triggerlog_ex_async(
        self,
        request: baasdatagw_models.ListDataexportTriggerlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.ListDataexportTriggerlogResponse:
        """
        Description: 列出导出任务失败日志
        Summary: 列出导出任务失败日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.ListDataexportTriggerlogResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.dataexport.triggerlog.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_dataexport_triggerlog(
        self,
        request: baasdatagw_models.OperateDataexportTriggerlogRequest,
    ) -> baasdatagw_models.OperateDataexportTriggerlogResponse:
        """
        Description: 操作导出任务失败日志
        Summary: 操作导出任务失败日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_dataexport_triggerlog_ex(request, headers, runtime)

    async def operate_dataexport_triggerlog_async(
        self,
        request: baasdatagw_models.OperateDataexportTriggerlogRequest,
    ) -> baasdatagw_models.OperateDataexportTriggerlogResponse:
        """
        Description: 操作导出任务失败日志
        Summary: 操作导出任务失败日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_dataexport_triggerlog_ex_async(request, headers, runtime)

    def operate_dataexport_triggerlog_ex(
        self,
        request: baasdatagw_models.OperateDataexportTriggerlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.OperateDataexportTriggerlogResponse:
        """
        Description: 操作导出任务失败日志
        Summary: 操作导出任务失败日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.OperateDataexportTriggerlogResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.dataexport.triggerlog.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_dataexport_triggerlog_ex_async(
        self,
        request: baasdatagw_models.OperateDataexportTriggerlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.OperateDataexportTriggerlogResponse:
        """
        Description: 操作导出任务失败日志
        Summary: 操作导出任务失败日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.OperateDataexportTriggerlogResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.dataexport.triggerlog.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_chaininsight_labels(
        self,
        request: baasdatagw_models.QueryChaininsightLabelsRequest,
    ) -> baasdatagw_models.QueryChaininsightLabelsResponse:
        """
        Description: 查询地址标签
        Summary: 查询地址标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_chaininsight_labels_ex(request, headers, runtime)

    async def query_chaininsight_labels_async(
        self,
        request: baasdatagw_models.QueryChaininsightLabelsRequest,
    ) -> baasdatagw_models.QueryChaininsightLabelsResponse:
        """
        Description: 查询地址标签
        Summary: 查询地址标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_chaininsight_labels_ex_async(request, headers, runtime)

    def query_chaininsight_labels_ex(
        self,
        request: baasdatagw_models.QueryChaininsightLabelsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightLabelsResponse:
        """
        Description: 查询地址标签
        Summary: 查询地址标签
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightLabelsResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.labels.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_chaininsight_labels_ex_async(
        self,
        request: baasdatagw_models.QueryChaininsightLabelsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightLabelsResponse:
        """
        Description: 查询地址标签
        Summary: 查询地址标签
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightLabelsResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.labels.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_chaininsight_labels(
        self,
        request: baasdatagw_models.UpdateChaininsightLabelsRequest,
    ) -> baasdatagw_models.UpdateChaininsightLabelsResponse:
        """
        Description: 更新地址标签
        Summary: 更新地址标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_chaininsight_labels_ex(request, headers, runtime)

    async def update_chaininsight_labels_async(
        self,
        request: baasdatagw_models.UpdateChaininsightLabelsRequest,
    ) -> baasdatagw_models.UpdateChaininsightLabelsResponse:
        """
        Description: 更新地址标签
        Summary: 更新地址标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_chaininsight_labels_ex_async(request, headers, runtime)

    def update_chaininsight_labels_ex(
        self,
        request: baasdatagw_models.UpdateChaininsightLabelsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.UpdateChaininsightLabelsResponse:
        """
        Description: 更新地址标签
        Summary: 更新地址标签
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.UpdateChaininsightLabelsResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.labels.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_chaininsight_labels_ex_async(
        self,
        request: baasdatagw_models.UpdateChaininsightLabelsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.UpdateChaininsightLabelsResponse:
        """
        Description: 更新地址标签
        Summary: 更新地址标签
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.UpdateChaininsightLabelsResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.labels.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_chaininsight_search(
        self,
        request: baasdatagw_models.QueryChaininsightSearchRequest,
    ) -> baasdatagw_models.QueryChaininsightSearchResponse:
        """
        Description: 链上搜索
        Summary: 链上搜索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_chaininsight_search_ex(request, headers, runtime)

    async def query_chaininsight_search_async(
        self,
        request: baasdatagw_models.QueryChaininsightSearchRequest,
    ) -> baasdatagw_models.QueryChaininsightSearchResponse:
        """
        Description: 链上搜索
        Summary: 链上搜索
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_chaininsight_search_ex_async(request, headers, runtime)

    def query_chaininsight_search_ex(
        self,
        request: baasdatagw_models.QueryChaininsightSearchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightSearchResponse:
        """
        Description: 链上搜索
        Summary: 链上搜索
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightSearchResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.search.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_chaininsight_search_ex_async(
        self,
        request: baasdatagw_models.QueryChaininsightSearchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightSearchResponse:
        """
        Description: 链上搜索
        Summary: 链上搜索
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightSearchResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.search.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_chaininsight_address(
        self,
        request: baasdatagw_models.QueryChaininsightAddressRequest,
    ) -> baasdatagw_models.QueryChaininsightAddressResponse:
        """
        Description: 查询链上地址详情
        Summary: 查询链上地址详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_chaininsight_address_ex(request, headers, runtime)

    async def query_chaininsight_address_async(
        self,
        request: baasdatagw_models.QueryChaininsightAddressRequest,
    ) -> baasdatagw_models.QueryChaininsightAddressResponse:
        """
        Description: 查询链上地址详情
        Summary: 查询链上地址详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_chaininsight_address_ex_async(request, headers, runtime)

    def query_chaininsight_address_ex(
        self,
        request: baasdatagw_models.QueryChaininsightAddressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightAddressResponse:
        """
        Description: 查询链上地址详情
        Summary: 查询链上地址详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightAddressResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.address.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_chaininsight_address_ex_async(
        self,
        request: baasdatagw_models.QueryChaininsightAddressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightAddressResponse:
        """
        Description: 查询链上地址详情
        Summary: 查询链上地址详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightAddressResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.address.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_chaininsight_transaction(
        self,
        request: baasdatagw_models.QueryChaininsightTransactionRequest,
    ) -> baasdatagw_models.QueryChaininsightTransactionResponse:
        """
        Description: 查询链上交易详情
        Summary: 查询链上交易详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_chaininsight_transaction_ex(request, headers, runtime)

    async def query_chaininsight_transaction_async(
        self,
        request: baasdatagw_models.QueryChaininsightTransactionRequest,
    ) -> baasdatagw_models.QueryChaininsightTransactionResponse:
        """
        Description: 查询链上交易详情
        Summary: 查询链上交易详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_chaininsight_transaction_ex_async(request, headers, runtime)

    def query_chaininsight_transaction_ex(
        self,
        request: baasdatagw_models.QueryChaininsightTransactionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightTransactionResponse:
        """
        Description: 查询链上交易详情
        Summary: 查询链上交易详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightTransactionResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.transaction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_chaininsight_transaction_ex_async(
        self,
        request: baasdatagw_models.QueryChaininsightTransactionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightTransactionResponse:
        """
        Description: 查询链上交易详情
        Summary: 查询链上交易详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightTransactionResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.transaction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_chaininsight_block(
        self,
        request: baasdatagw_models.QueryChaininsightBlockRequest,
    ) -> baasdatagw_models.QueryChaininsightBlockResponse:
        """
        Description: 查询链上区块详情
        Summary: 查询链上区块详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_chaininsight_block_ex(request, headers, runtime)

    async def query_chaininsight_block_async(
        self,
        request: baasdatagw_models.QueryChaininsightBlockRequest,
    ) -> baasdatagw_models.QueryChaininsightBlockResponse:
        """
        Description: 查询链上区块详情
        Summary: 查询链上区块详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_chaininsight_block_ex_async(request, headers, runtime)

    def query_chaininsight_block_ex(
        self,
        request: baasdatagw_models.QueryChaininsightBlockRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightBlockResponse:
        """
        Description: 查询链上区块详情
        Summary: 查询链上区块详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightBlockResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.block.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_chaininsight_block_ex_async(
        self,
        request: baasdatagw_models.QueryChaininsightBlockRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightBlockResponse:
        """
        Description: 查询链上区块详情
        Summary: 查询链上区块详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightBlockResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.block.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_chaininsight_addresslatesttxs(
        self,
        request: baasdatagw_models.QueryChaininsightAddresslatesttxsRequest,
    ) -> baasdatagw_models.QueryChaininsightAddresslatesttxsResponse:
        """
        Description: 查询地址近期交易
        Summary: 查询地址近期交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_chaininsight_addresslatesttxs_ex(request, headers, runtime)

    async def query_chaininsight_addresslatesttxs_async(
        self,
        request: baasdatagw_models.QueryChaininsightAddresslatesttxsRequest,
    ) -> baasdatagw_models.QueryChaininsightAddresslatesttxsResponse:
        """
        Description: 查询地址近期交易
        Summary: 查询地址近期交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_chaininsight_addresslatesttxs_ex_async(request, headers, runtime)

    def query_chaininsight_addresslatesttxs_ex(
        self,
        request: baasdatagw_models.QueryChaininsightAddresslatesttxsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightAddresslatesttxsResponse:
        """
        Description: 查询地址近期交易
        Summary: 查询地址近期交易
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightAddresslatesttxsResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.addresslatesttxs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_chaininsight_addresslatesttxs_ex_async(
        self,
        request: baasdatagw_models.QueryChaininsightAddresslatesttxsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightAddresslatesttxsResponse:
        """
        Description: 查询地址近期交易
        Summary: 查询地址近期交易
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightAddresslatesttxsResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.addresslatesttxs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_chaininsight_contractinterface(
        self,
        request: baasdatagw_models.ListChaininsightContractinterfaceRequest,
    ) -> baasdatagw_models.ListChaininsightContractinterfaceResponse:
        """
        Description: 列出合约全部接口
        Summary: 列出合约全部接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_chaininsight_contractinterface_ex(request, headers, runtime)

    async def list_chaininsight_contractinterface_async(
        self,
        request: baasdatagw_models.ListChaininsightContractinterfaceRequest,
    ) -> baasdatagw_models.ListChaininsightContractinterfaceResponse:
        """
        Description: 列出合约全部接口
        Summary: 列出合约全部接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_chaininsight_contractinterface_ex_async(request, headers, runtime)

    def list_chaininsight_contractinterface_ex(
        self,
        request: baasdatagw_models.ListChaininsightContractinterfaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.ListChaininsightContractinterfaceResponse:
        """
        Description: 列出合约全部接口
        Summary: 列出合约全部接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.ListChaininsightContractinterfaceResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.contractinterface.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_chaininsight_contractinterface_ex_async(
        self,
        request: baasdatagw_models.ListChaininsightContractinterfaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.ListChaininsightContractinterfaceResponse:
        """
        Description: 列出合约全部接口
        Summary: 列出合约全部接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.ListChaininsightContractinterfaceResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.contractinterface.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_chaininsight_contractinterface(
        self,
        request: baasdatagw_models.DetailChaininsightContractinterfaceRequest,
    ) -> baasdatagw_models.DetailChaininsightContractinterfaceResponse:
        """
        Description: 查询合约接口信息
        Summary: 查询合约接口信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_chaininsight_contractinterface_ex(request, headers, runtime)

    async def detail_chaininsight_contractinterface_async(
        self,
        request: baasdatagw_models.DetailChaininsightContractinterfaceRequest,
    ) -> baasdatagw_models.DetailChaininsightContractinterfaceResponse:
        """
        Description: 查询合约接口信息
        Summary: 查询合约接口信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_chaininsight_contractinterface_ex_async(request, headers, runtime)

    def detail_chaininsight_contractinterface_ex(
        self,
        request: baasdatagw_models.DetailChaininsightContractinterfaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.DetailChaininsightContractinterfaceResponse:
        """
        Description: 查询合约接口信息
        Summary: 查询合约接口信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.DetailChaininsightContractinterfaceResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.contractinterface.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_chaininsight_contractinterface_ex_async(
        self,
        request: baasdatagw_models.DetailChaininsightContractinterfaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.DetailChaininsightContractinterfaceResponse:
        """
        Description: 查询合约接口信息
        Summary: 查询合约接口信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.DetailChaininsightContractinterfaceResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.contractinterface.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_chaininsight_contractinterface(
        self,
        request: baasdatagw_models.UpdateChaininsightContractinterfaceRequest,
    ) -> baasdatagw_models.UpdateChaininsightContractinterfaceResponse:
        """
        Description: 更新合约接口信息
        Summary: 更新合约接口信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_chaininsight_contractinterface_ex(request, headers, runtime)

    async def update_chaininsight_contractinterface_async(
        self,
        request: baasdatagw_models.UpdateChaininsightContractinterfaceRequest,
    ) -> baasdatagw_models.UpdateChaininsightContractinterfaceResponse:
        """
        Description: 更新合约接口信息
        Summary: 更新合约接口信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_chaininsight_contractinterface_ex_async(request, headers, runtime)

    def update_chaininsight_contractinterface_ex(
        self,
        request: baasdatagw_models.UpdateChaininsightContractinterfaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.UpdateChaininsightContractinterfaceResponse:
        """
        Description: 更新合约接口信息
        Summary: 更新合约接口信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.UpdateChaininsightContractinterfaceResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.contractinterface.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_chaininsight_contractinterface_ex_async(
        self,
        request: baasdatagw_models.UpdateChaininsightContractinterfaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.UpdateChaininsightContractinterfaceResponse:
        """
        Description: 更新合约接口信息
        Summary: 更新合约接口信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.UpdateChaininsightContractinterfaceResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.contractinterface.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_chaininsight_abi(
        self,
        request: baasdatagw_models.UploadChaininsightAbiRequest,
    ) -> baasdatagw_models.UploadChaininsightAbiResponse:
        """
        Description: 上传合约ABI文件
        Summary: 上传合约ABI文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_chaininsight_abi_ex(request, headers, runtime)

    async def upload_chaininsight_abi_async(
        self,
        request: baasdatagw_models.UploadChaininsightAbiRequest,
    ) -> baasdatagw_models.UploadChaininsightAbiResponse:
        """
        Description: 上传合约ABI文件
        Summary: 上传合约ABI文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_chaininsight_abi_ex_async(request, headers, runtime)

    def upload_chaininsight_abi_ex(
        self,
        request: baasdatagw_models.UploadChaininsightAbiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.UploadChaininsightAbiResponse:
        """
        Description: 上传合约ABI文件
        Summary: 上传合约ABI文件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.UploadChaininsightAbiResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.abi.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_chaininsight_abi_ex_async(
        self,
        request: baasdatagw_models.UploadChaininsightAbiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.UploadChaininsightAbiResponse:
        """
        Description: 上传合约ABI文件
        Summary: 上传合约ABI文件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.UploadChaininsightAbiResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.abi.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_chaininsight_addresshistogramrx(
        self,
        request: baasdatagw_models.QueryChaininsightAddresshistogramrxRequest,
    ) -> baasdatagw_models.QueryChaininsightAddresshistogramrxResponse:
        """
        Description: 查询地址的接收交易数量趋势
        Summary: 查询地址的接收交易数量趋势
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_chaininsight_addresshistogramrx_ex(request, headers, runtime)

    async def query_chaininsight_addresshistogramrx_async(
        self,
        request: baasdatagw_models.QueryChaininsightAddresshistogramrxRequest,
    ) -> baasdatagw_models.QueryChaininsightAddresshistogramrxResponse:
        """
        Description: 查询地址的接收交易数量趋势
        Summary: 查询地址的接收交易数量趋势
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_chaininsight_addresshistogramrx_ex_async(request, headers, runtime)

    def query_chaininsight_addresshistogramrx_ex(
        self,
        request: baasdatagw_models.QueryChaininsightAddresshistogramrxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightAddresshistogramrxResponse:
        """
        Description: 查询地址的接收交易数量趋势
        Summary: 查询地址的接收交易数量趋势
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightAddresshistogramrxResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.addresshistogramrx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_chaininsight_addresshistogramrx_ex_async(
        self,
        request: baasdatagw_models.QueryChaininsightAddresshistogramrxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightAddresshistogramrxResponse:
        """
        Description: 查询地址的接收交易数量趋势
        Summary: 查询地址的接收交易数量趋势
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightAddresshistogramrxResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.addresshistogramrx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_chaininsight_addresshistogramtx(
        self,
        request: baasdatagw_models.QueryChaininsightAddresshistogramtxRequest,
    ) -> baasdatagw_models.QueryChaininsightAddresshistogramtxResponse:
        """
        Description: 查询地址的发送交易数量趋势
        Summary: 查询地址的发送交易数量趋势
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_chaininsight_addresshistogramtx_ex(request, headers, runtime)

    async def query_chaininsight_addresshistogramtx_async(
        self,
        request: baasdatagw_models.QueryChaininsightAddresshistogramtxRequest,
    ) -> baasdatagw_models.QueryChaininsightAddresshistogramtxResponse:
        """
        Description: 查询地址的发送交易数量趋势
        Summary: 查询地址的发送交易数量趋势
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_chaininsight_addresshistogramtx_ex_async(request, headers, runtime)

    def query_chaininsight_addresshistogramtx_ex(
        self,
        request: baasdatagw_models.QueryChaininsightAddresshistogramtxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightAddresshistogramtxResponse:
        """
        Description: 查询地址的发送交易数量趋势
        Summary: 查询地址的发送交易数量趋势
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightAddresshistogramtxResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.addresshistogramtx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_chaininsight_addresshistogramtx_ex_async(
        self,
        request: baasdatagw_models.QueryChaininsightAddresshistogramtxRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightAddresshistogramtxResponse:
        """
        Description: 查询地址的发送交易数量趋势
        Summary: 查询地址的发送交易数量趋势
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightAddresshistogramtxResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.addresshistogramtx.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_chaininsight_chaintxhistogram(
        self,
        request: baasdatagw_models.QueryChaininsightChaintxhistogramRequest,
    ) -> baasdatagw_models.QueryChaininsightChaintxhistogramResponse:
        """
        Description: 查询链交易数量趋势
        Summary: 查询链交易数量趋势
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_chaininsight_chaintxhistogram_ex(request, headers, runtime)

    async def query_chaininsight_chaintxhistogram_async(
        self,
        request: baasdatagw_models.QueryChaininsightChaintxhistogramRequest,
    ) -> baasdatagw_models.QueryChaininsightChaintxhistogramResponse:
        """
        Description: 查询链交易数量趋势
        Summary: 查询链交易数量趋势
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_chaininsight_chaintxhistogram_ex_async(request, headers, runtime)

    def query_chaininsight_chaintxhistogram_ex(
        self,
        request: baasdatagw_models.QueryChaininsightChaintxhistogramRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightChaintxhistogramResponse:
        """
        Description: 查询链交易数量趋势
        Summary: 查询链交易数量趋势
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightChaintxhistogramResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.chaintxhistogram.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_chaininsight_chaintxhistogram_ex_async(
        self,
        request: baasdatagw_models.QueryChaininsightChaintxhistogramRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightChaintxhistogramResponse:
        """
        Description: 查询链交易数量趋势
        Summary: 查询链交易数量趋势
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightChaintxhistogramResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.chaintxhistogram.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_chaininsight_transaction(
        self,
        request: baasdatagw_models.BatchqueryChaininsightTransactionRequest,
    ) -> baasdatagw_models.BatchqueryChaininsightTransactionResponse:
        """
        Description: 批量查询链上交易详情
        Summary: 批量查询链上交易详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_chaininsight_transaction_ex(request, headers, runtime)

    async def batchquery_chaininsight_transaction_async(
        self,
        request: baasdatagw_models.BatchqueryChaininsightTransactionRequest,
    ) -> baasdatagw_models.BatchqueryChaininsightTransactionResponse:
        """
        Description: 批量查询链上交易详情
        Summary: 批量查询链上交易详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_chaininsight_transaction_ex_async(request, headers, runtime)

    def batchquery_chaininsight_transaction_ex(
        self,
        request: baasdatagw_models.BatchqueryChaininsightTransactionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.BatchqueryChaininsightTransactionResponse:
        """
        Description: 批量查询链上交易详情
        Summary: 批量查询链上交易详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.BatchqueryChaininsightTransactionResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.transaction.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_chaininsight_transaction_ex_async(
        self,
        request: baasdatagw_models.BatchqueryChaininsightTransactionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.BatchqueryChaininsightTransactionResponse:
        """
        Description: 批量查询链上交易详情
        Summary: 批量查询链上交易详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.BatchqueryChaininsightTransactionResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.transaction.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_chaininsight_statistic(
        self,
        request: baasdatagw_models.ListChaininsightStatisticRequest,
    ) -> baasdatagw_models.ListChaininsightStatisticResponse:
        """
        Description: 查询统计任务
        Summary: 查询统计任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_chaininsight_statistic_ex(request, headers, runtime)

    async def list_chaininsight_statistic_async(
        self,
        request: baasdatagw_models.ListChaininsightStatisticRequest,
    ) -> baasdatagw_models.ListChaininsightStatisticResponse:
        """
        Description: 查询统计任务
        Summary: 查询统计任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_chaininsight_statistic_ex_async(request, headers, runtime)

    def list_chaininsight_statistic_ex(
        self,
        request: baasdatagw_models.ListChaininsightStatisticRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.ListChaininsightStatisticResponse:
        """
        Description: 查询统计任务
        Summary: 查询统计任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.ListChaininsightStatisticResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.statistic.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_chaininsight_statistic_ex_async(
        self,
        request: baasdatagw_models.ListChaininsightStatisticRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.ListChaininsightStatisticResponse:
        """
        Description: 查询统计任务
        Summary: 查询统计任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.ListChaininsightStatisticResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.statistic.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_chaininsight_statistic(
        self,
        request: baasdatagw_models.AddChaininsightStatisticRequest,
    ) -> baasdatagw_models.AddChaininsightStatisticResponse:
        """
        Description: 新建统计任务
        Summary: 新建统计任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_chaininsight_statistic_ex(request, headers, runtime)

    async def add_chaininsight_statistic_async(
        self,
        request: baasdatagw_models.AddChaininsightStatisticRequest,
    ) -> baasdatagw_models.AddChaininsightStatisticResponse:
        """
        Description: 新建统计任务
        Summary: 新建统计任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_chaininsight_statistic_ex_async(request, headers, runtime)

    def add_chaininsight_statistic_ex(
        self,
        request: baasdatagw_models.AddChaininsightStatisticRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.AddChaininsightStatisticResponse:
        """
        Description: 新建统计任务
        Summary: 新建统计任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.AddChaininsightStatisticResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.statistic.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_chaininsight_statistic_ex_async(
        self,
        request: baasdatagw_models.AddChaininsightStatisticRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.AddChaininsightStatisticResponse:
        """
        Description: 新建统计任务
        Summary: 新建统计任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.AddChaininsightStatisticResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.statistic.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_chaininsight_statistic(
        self,
        request: baasdatagw_models.OperateChaininsightStatisticRequest,
    ) -> baasdatagw_models.OperateChaininsightStatisticResponse:
        """
        Description: 操作统计任务
        Summary: 操作统计任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_chaininsight_statistic_ex(request, headers, runtime)

    async def operate_chaininsight_statistic_async(
        self,
        request: baasdatagw_models.OperateChaininsightStatisticRequest,
    ) -> baasdatagw_models.OperateChaininsightStatisticResponse:
        """
        Description: 操作统计任务
        Summary: 操作统计任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_chaininsight_statistic_ex_async(request, headers, runtime)

    def operate_chaininsight_statistic_ex(
        self,
        request: baasdatagw_models.OperateChaininsightStatisticRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.OperateChaininsightStatisticResponse:
        """
        Description: 操作统计任务
        Summary: 操作统计任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.OperateChaininsightStatisticResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.statistic.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_chaininsight_statistic_ex_async(
        self,
        request: baasdatagw_models.OperateChaininsightStatisticRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.OperateChaininsightStatisticResponse:
        """
        Description: 操作统计任务
        Summary: 操作统计任务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.OperateChaininsightStatisticResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.statistic.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_chaininsight_statistichistogram(
        self,
        request: baasdatagw_models.QueryChaininsightStatistichistogramRequest,
    ) -> baasdatagw_models.QueryChaininsightStatistichistogramResponse:
        """
        Description: 查询统计任务的统计结果直方图
        Summary: 查询统计任务的统计结果直方图
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_chaininsight_statistichistogram_ex(request, headers, runtime)

    async def query_chaininsight_statistichistogram_async(
        self,
        request: baasdatagw_models.QueryChaininsightStatistichistogramRequest,
    ) -> baasdatagw_models.QueryChaininsightStatistichistogramResponse:
        """
        Description: 查询统计任务的统计结果直方图
        Summary: 查询统计任务的统计结果直方图
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_chaininsight_statistichistogram_ex_async(request, headers, runtime)

    def query_chaininsight_statistichistogram_ex(
        self,
        request: baasdatagw_models.QueryChaininsightStatistichistogramRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightStatistichistogramResponse:
        """
        Description: 查询统计任务的统计结果直方图
        Summary: 查询统计任务的统计结果直方图
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightStatistichistogramResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.statistichistogram.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_chaininsight_statistichistogram_ex_async(
        self,
        request: baasdatagw_models.QueryChaininsightStatistichistogramRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightStatistichistogramResponse:
        """
        Description: 查询统计任务的统计结果直方图
        Summary: 查询统计任务的统计结果直方图
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightStatistichistogramResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.statistichistogram.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_chaininsight_statistictable(
        self,
        request: baasdatagw_models.QueryChaininsightStatistictableRequest,
    ) -> baasdatagw_models.QueryChaininsightStatistictableResponse:
        """
        Description: 查询统计任务的统计结果表格
        Summary: 查询统计任务的统计结果表格
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_chaininsight_statistictable_ex(request, headers, runtime)

    async def query_chaininsight_statistictable_async(
        self,
        request: baasdatagw_models.QueryChaininsightStatistictableRequest,
    ) -> baasdatagw_models.QueryChaininsightStatistictableResponse:
        """
        Description: 查询统计任务的统计结果表格
        Summary: 查询统计任务的统计结果表格
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_chaininsight_statistictable_ex_async(request, headers, runtime)

    def query_chaininsight_statistictable_ex(
        self,
        request: baasdatagw_models.QueryChaininsightStatistictableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightStatistictableResponse:
        """
        Description: 查询统计任务的统计结果表格
        Summary: 查询统计任务的统计结果表格
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightStatistictableResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.statistictable.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_chaininsight_statistictable_ex_async(
        self,
        request: baasdatagw_models.QueryChaininsightStatistictableRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.QueryChaininsightStatistictableResponse:
        """
        Description: 查询统计任务的统计结果表格
        Summary: 查询统计任务的统计结果表格
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.QueryChaininsightStatistictableResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.statistictable.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_chaininsight_qrcode(
        self,
        request: baasdatagw_models.CreateChaininsightQrcodeRequest,
    ) -> baasdatagw_models.CreateChaininsightQrcodeResponse:
        """
        Description: 生成支付宝小程序二维码
        Summary: 生成支付宝小程序二维码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_chaininsight_qrcode_ex(request, headers, runtime)

    async def create_chaininsight_qrcode_async(
        self,
        request: baasdatagw_models.CreateChaininsightQrcodeRequest,
    ) -> baasdatagw_models.CreateChaininsightQrcodeResponse:
        """
        Description: 生成支付宝小程序二维码
        Summary: 生成支付宝小程序二维码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_chaininsight_qrcode_ex_async(request, headers, runtime)

    def create_chaininsight_qrcode_ex(
        self,
        request: baasdatagw_models.CreateChaininsightQrcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.CreateChaininsightQrcodeResponse:
        """
        Description: 生成支付宝小程序二维码
        Summary: 生成支付宝小程序二维码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.CreateChaininsightQrcodeResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chaininsight.qrcode.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_chaininsight_qrcode_ex_async(
        self,
        request: baasdatagw_models.CreateChaininsightQrcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.CreateChaininsightQrcodeResponse:
        """
        Description: 生成支付宝小程序二维码
        Summary: 生成支付宝小程序二维码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.CreateChaininsightQrcodeResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chaininsight.qrcode.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_chains(
        self,
        request: baasdatagw_models.RegisterChainsRequest,
    ) -> baasdatagw_models.RegisterChainsResponse:
        """
        Description: 注册链信息
        Summary: 注册链信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_chains_ex(request, headers, runtime)

    async def register_chains_async(
        self,
        request: baasdatagw_models.RegisterChainsRequest,
    ) -> baasdatagw_models.RegisterChainsResponse:
        """
        Description: 注册链信息
        Summary: 注册链信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_chains_ex_async(request, headers, runtime)

    def register_chains_ex(
        self,
        request: baasdatagw_models.RegisterChainsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.RegisterChainsResponse:
        """
        Description: 注册链信息
        Summary: 注册链信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.RegisterChainsResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chains.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_chains_ex_async(
        self,
        request: baasdatagw_models.RegisterChainsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.RegisterChainsResponse:
        """
        Description: 注册链信息
        Summary: 注册链信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.RegisterChainsResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chains.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_chains(
        self,
        request: baasdatagw_models.OperateChainsRequest,
    ) -> baasdatagw_models.OperateChainsResponse:
        """
        Description: 操作数据网关开通状态
        Summary: 操作数据网关开通状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_chains_ex(request, headers, runtime)

    async def operate_chains_async(
        self,
        request: baasdatagw_models.OperateChainsRequest,
    ) -> baasdatagw_models.OperateChainsResponse:
        """
        Description: 操作数据网关开通状态
        Summary: 操作数据网关开通状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_chains_ex_async(request, headers, runtime)

    def operate_chains_ex(
        self,
        request: baasdatagw_models.OperateChainsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.OperateChainsResponse:
        """
        Description: 操作数据网关开通状态
        Summary: 操作数据网关开通状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.OperateChainsResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chains.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_chains_ex_async(
        self,
        request: baasdatagw_models.OperateChainsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.OperateChainsResponse:
        """
        Description: 操作数据网关开通状态
        Summary: 操作数据网关开通状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.OperateChainsResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chains.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_chains_status(
        self,
        request: baasdatagw_models.GetChainsStatusRequest,
    ) -> baasdatagw_models.GetChainsStatusResponse:
        """
        Description: 查询某条链的服务开通状态
        Summary: 查询某条链的服务开通状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_chains_status_ex(request, headers, runtime)

    async def get_chains_status_async(
        self,
        request: baasdatagw_models.GetChainsStatusRequest,
    ) -> baasdatagw_models.GetChainsStatusResponse:
        """
        Description: 查询某条链的服务开通状态
        Summary: 查询某条链的服务开通状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_chains_status_ex_async(request, headers, runtime)

    def get_chains_status_ex(
        self,
        request: baasdatagw_models.GetChainsStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.GetChainsStatusResponse:
        """
        Description: 查询某条链的服务开通状态
        Summary: 查询某条链的服务开通状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.GetChainsStatusResponse(),
            self.do_request('1.0', 'antchain.baasdatagw.chains.status.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_chains_status_ex_async(
        self,
        request: baasdatagw_models.GetChainsStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> baasdatagw_models.GetChainsStatusResponse:
        """
        Description: 查询某条链的服务开通状态
        Summary: 查询某条链的服务开通状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            baasdatagw_models.GetChainsStatusResponse(),
            await self.do_request_async('1.0', 'antchain.baasdatagw.chains.status.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
