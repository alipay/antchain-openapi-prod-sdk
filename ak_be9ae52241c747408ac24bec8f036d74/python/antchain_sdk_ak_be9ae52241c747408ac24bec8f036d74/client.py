# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_be9ae52241c747408ac24bec8f036d74 import models as ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models
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
        config: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.Config,
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
            # 该参与方的输入数据配置
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
                    'sdk_version': '1.0.1',
                    '_prod_code': 'ak_be9ae52241c747408ac24bec8f036d74',
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
            # 该参与方的输入数据配置
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
                    'sdk_version': '1.0.1',
                    '_prod_code': 'ak_be9ae52241c747408ac24bec8f036d74',
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

    def create_antchain_pdcp_datasource(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasourceRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasourceResponse:
        """
        Description: 请求创建数据源
        Summary: 创建新的数据源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antchain_pdcp_datasource_ex(request, headers, runtime)

    async def create_antchain_pdcp_datasource_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasourceRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasourceResponse:
        """
        Description: 请求创建数据源
        Summary: 创建新的数据源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antchain_pdcp_datasource_ex_async(request, headers, runtime)

    def create_antchain_pdcp_datasource_ex(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasourceResponse:
        """
        Description: 请求创建数据源
        Summary: 创建新的数据源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasourceResponse(),
            self.do_request('1.0', 'antchain.pdcp.datasource.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antchain_pdcp_datasource_ex_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasourceResponse:
        """
        Description: 请求创建数据源
        Summary: 创建新的数据源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasourceResponse(),
            await self.do_request_async('1.0', 'antchain.pdcp.datasource.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_antchain_pdcp_datasource(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasourceRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasourceResponse:
        """
        Description: 请求删除指定的数据源。
        Summary: 删除指定的数据源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_antchain_pdcp_datasource_ex(request, headers, runtime)

    async def delete_antchain_pdcp_datasource_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasourceRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasourceResponse:
        """
        Description: 请求删除指定的数据源。
        Summary: 删除指定的数据源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_antchain_pdcp_datasource_ex_async(request, headers, runtime)

    def delete_antchain_pdcp_datasource_ex(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasourceResponse:
        """
        Description: 请求删除指定的数据源。
        Summary: 删除指定的数据源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasourceResponse(),
            self.do_request('1.0', 'antchain.pdcp.datasource.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_antchain_pdcp_datasource_ex_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasourceResponse:
        """
        Description: 请求删除指定的数据源。
        Summary: 删除指定的数据源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasourceResponse(),
            await self.do_request_async('1.0', 'antchain.pdcp.datasource.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_antchain_pdcp_datasource(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasourceRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasourceResponse:
        """
        Description: 请求更新指定数据源的信息。
        Summary: 更新指定数据源的信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_antchain_pdcp_datasource_ex(request, headers, runtime)

    async def update_antchain_pdcp_datasource_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasourceRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasourceResponse:
        """
        Description: 请求更新指定数据源的信息。
        Summary: 更新指定数据源的信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_antchain_pdcp_datasource_ex_async(request, headers, runtime)

    def update_antchain_pdcp_datasource_ex(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasourceResponse:
        """
        Description: 请求更新指定数据源的信息。
        Summary: 更新指定数据源的信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasourceResponse(),
            self.do_request('1.0', 'antchain.pdcp.datasource.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_antchain_pdcp_datasource_ex_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasourceResponse:
        """
        Description: 请求更新指定数据源的信息。
        Summary: 更新指定数据源的信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasourceResponse(),
            await self.do_request_async('1.0', 'antchain.pdcp.datasource.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_pdcp_datasource(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasourceRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasourceResponse:
        """
        Description: 请求查询指定的数据源信息。
        Summary: 查询指定的数据源信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_pdcp_datasource_ex(request, headers, runtime)

    async def query_antchain_pdcp_datasource_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasourceRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasourceResponse:
        """
        Description: 请求查询指定的数据源信息。
        Summary: 查询指定的数据源信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_pdcp_datasource_ex_async(request, headers, runtime)

    def query_antchain_pdcp_datasource_ex(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasourceResponse:
        """
        Description: 请求查询指定的数据源信息。
        Summary: 查询指定的数据源信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasourceResponse(),
            self.do_request('1.0', 'antchain.pdcp.datasource.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_pdcp_datasource_ex_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasourceResponse:
        """
        Description: 请求查询指定的数据源信息。
        Summary: 查询指定的数据源信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasourceResponse(),
            await self.do_request_async('1.0', 'antchain.pdcp.datasource.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_antchain_pdcp_datasource(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasourceRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasourceResponse:
        """
        Description: 分页搜索数据源
        Summary: 分页搜索数据源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_antchain_pdcp_datasource_ex(request, headers, runtime)

    async def pagequery_antchain_pdcp_datasource_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasourceRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasourceResponse:
        """
        Description: 分页搜索数据源
        Summary: 分页搜索数据源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_antchain_pdcp_datasource_ex_async(request, headers, runtime)

    def pagequery_antchain_pdcp_datasource_ex(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasourceResponse:
        """
        Description: 分页搜索数据源
        Summary: 分页搜索数据源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasourceResponse(),
            self.do_request('1.0', 'antchain.pdcp.datasource.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_antchain_pdcp_datasource_ex_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasourceResponse:
        """
        Description: 分页搜索数据源
        Summary: 分页搜索数据源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasourceResponse(),
            await self.do_request_async('1.0', 'antchain.pdcp.datasource.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antchain_pdcp_dataset(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasetRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasetResponse:
        """
        Description: 创建新的数据集
        Summary: 创建新的数据集
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antchain_pdcp_dataset_ex(request, headers, runtime)

    async def create_antchain_pdcp_dataset_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasetRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasetResponse:
        """
        Description: 创建新的数据集
        Summary: 创建新的数据集
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antchain_pdcp_dataset_ex_async(request, headers, runtime)

    def create_antchain_pdcp_dataset_ex(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasetResponse:
        """
        Description: 创建新的数据集
        Summary: 创建新的数据集
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasetResponse(),
            self.do_request('1.0', 'antchain.pdcp.dataset.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antchain_pdcp_dataset_ex_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasetResponse:
        """
        Description: 创建新的数据集
        Summary: 创建新的数据集
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpDatasetResponse(),
            await self.do_request_async('1.0', 'antchain.pdcp.dataset.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_antchain_pdcp_dataset(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasetRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasetResponse:
        """
        Description: 删除指定数据集
        Summary: 删除指定数据集
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_antchain_pdcp_dataset_ex(request, headers, runtime)

    async def delete_antchain_pdcp_dataset_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasetRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasetResponse:
        """
        Description: 删除指定数据集
        Summary: 删除指定数据集
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_antchain_pdcp_dataset_ex_async(request, headers, runtime)

    def delete_antchain_pdcp_dataset_ex(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasetResponse:
        """
        Description: 删除指定数据集
        Summary: 删除指定数据集
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasetResponse(),
            self.do_request('1.0', 'antchain.pdcp.dataset.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_antchain_pdcp_dataset_ex_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasetResponse:
        """
        Description: 删除指定数据集
        Summary: 删除指定数据集
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.DeleteAntchainPdcpDatasetResponse(),
            await self.do_request_async('1.0', 'antchain.pdcp.dataset.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_antchain_pdcp_dataset(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasetRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasetResponse:
        """
        Description: 更新指定数据集信息
        Summary: 更新指定数据集信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_antchain_pdcp_dataset_ex(request, headers, runtime)

    async def update_antchain_pdcp_dataset_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasetRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasetResponse:
        """
        Description: 更新指定数据集信息
        Summary: 更新指定数据集信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_antchain_pdcp_dataset_ex_async(request, headers, runtime)

    def update_antchain_pdcp_dataset_ex(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasetResponse:
        """
        Description: 更新指定数据集信息
        Summary: 更新指定数据集信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasetResponse(),
            self.do_request('1.0', 'antchain.pdcp.dataset.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_antchain_pdcp_dataset_ex_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasetResponse:
        """
        Description: 更新指定数据集信息
        Summary: 更新指定数据集信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.UpdateAntchainPdcpDatasetResponse(),
            await self.do_request_async('1.0', 'antchain.pdcp.dataset.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_pdcp_dataset(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasetRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasetResponse:
        """
        Description: 查询指定数据集信息
        Summary: 查询指定数据集信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_pdcp_dataset_ex(request, headers, runtime)

    async def query_antchain_pdcp_dataset_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasetRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasetResponse:
        """
        Description: 查询指定数据集信息
        Summary: 查询指定数据集信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_pdcp_dataset_ex_async(request, headers, runtime)

    def query_antchain_pdcp_dataset_ex(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasetResponse:
        """
        Description: 查询指定数据集信息
        Summary: 查询指定数据集信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasetResponse(),
            self.do_request('1.0', 'antchain.pdcp.dataset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_pdcp_dataset_ex_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasetResponse:
        """
        Description: 查询指定数据集信息
        Summary: 查询指定数据集信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpDatasetResponse(),
            await self.do_request_async('1.0', 'antchain.pdcp.dataset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_antchain_pdcp_dataset(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasetRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasetResponse:
        """
        Description: 分页搜索数据集
        Summary: 分页搜索数据集
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_antchain_pdcp_dataset_ex(request, headers, runtime)

    async def pagequery_antchain_pdcp_dataset_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasetRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasetResponse:
        """
        Description: 分页搜索数据集
        Summary: 分页搜索数据集
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_antchain_pdcp_dataset_ex_async(request, headers, runtime)

    def pagequery_antchain_pdcp_dataset_ex(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasetResponse:
        """
        Description: 分页搜索数据集
        Summary: 分页搜索数据集
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasetResponse(),
            self.do_request('1.0', 'antchain.pdcp.dataset.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_antchain_pdcp_dataset_ex_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasetResponse:
        """
        Description: 分页搜索数据集
        Summary: 分页搜索数据集
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpDatasetResponse(),
            await self.do_request_async('1.0', 'antchain.pdcp.dataset.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def recognize_antchain_pdcp_dataset_schema(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.RecognizeAntchainPdcpDatasetSchemaRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.RecognizeAntchainPdcpDatasetSchemaResponse:
        """
        Description: 识别数据集的 schema 信息
        Summary: 识别数据集的 schema 信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.recognize_antchain_pdcp_dataset_schema_ex(request, headers, runtime)

    async def recognize_antchain_pdcp_dataset_schema_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.RecognizeAntchainPdcpDatasetSchemaRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.RecognizeAntchainPdcpDatasetSchemaResponse:
        """
        Description: 识别数据集的 schema 信息
        Summary: 识别数据集的 schema 信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.recognize_antchain_pdcp_dataset_schema_ex_async(request, headers, runtime)

    def recognize_antchain_pdcp_dataset_schema_ex(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.RecognizeAntchainPdcpDatasetSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.RecognizeAntchainPdcpDatasetSchemaResponse:
        """
        Description: 识别数据集的 schema 信息
        Summary: 识别数据集的 schema 信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.RecognizeAntchainPdcpDatasetSchemaResponse(),
            self.do_request('1.0', 'antchain.pdcp.dataset.schema.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def recognize_antchain_pdcp_dataset_schema_ex_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.RecognizeAntchainPdcpDatasetSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.RecognizeAntchainPdcpDatasetSchemaResponse:
        """
        Description: 识别数据集的 schema 信息
        Summary: 识别数据集的 schema 信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.RecognizeAntchainPdcpDatasetSchemaResponse(),
            await self.do_request_async('1.0', 'antchain.pdcp.dataset.schema.recognize', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antchain_pdcp_project(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpProjectRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpProjectResponse:
        """
        Description: 创建项目，添加线下参与方协作节点
        Summary: 创建项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antchain_pdcp_project_ex(request, headers, runtime)

    async def create_antchain_pdcp_project_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpProjectRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpProjectResponse:
        """
        Description: 创建项目，添加线下参与方协作节点
        Summary: 创建项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antchain_pdcp_project_ex_async(request, headers, runtime)

    def create_antchain_pdcp_project_ex(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpProjectResponse:
        """
        Description: 创建项目，添加线下参与方协作节点
        Summary: 创建项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpProjectResponse(),
            self.do_request('1.0', 'antchain.pdcp.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antchain_pdcp_project_ex_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpProjectResponse:
        """
        Description: 创建项目，添加线下参与方协作节点
        Summary: 创建项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.CreateAntchainPdcpProjectResponse(),
            await self.do_request_async('1.0', 'antchain.pdcp.project.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antchain_pdcp_project(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.GetAntchainPdcpProjectRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.GetAntchainPdcpProjectResponse:
        """
        Description: 根据项目ID查询项目信息
        Summary: 根据项目ID查询项目信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antchain_pdcp_project_ex(request, headers, runtime)

    async def get_antchain_pdcp_project_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.GetAntchainPdcpProjectRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.GetAntchainPdcpProjectResponse:
        """
        Description: 根据项目ID查询项目信息
        Summary: 根据项目ID查询项目信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antchain_pdcp_project_ex_async(request, headers, runtime)

    def get_antchain_pdcp_project_ex(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.GetAntchainPdcpProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.GetAntchainPdcpProjectResponse:
        """
        Description: 根据项目ID查询项目信息
        Summary: 根据项目ID查询项目信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.GetAntchainPdcpProjectResponse(),
            self.do_request('1.0', 'antchain.pdcp.project.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antchain_pdcp_project_ex_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.GetAntchainPdcpProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.GetAntchainPdcpProjectResponse:
        """
        Description: 根据项目ID查询项目信息
        Summary: 根据项目ID查询项目信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.GetAntchainPdcpProjectResponse(),
            await self.do_request_async('1.0', 'antchain.pdcp.project.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_antchain_pdcp_project_dataset(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasetRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasetResponse:
        """
        Description: 授权dataset至项目内，/api/project/dataset/auth，后续创建任务时仅允许选择已授权至项目内的数据集列表
        Summary: 授权某个本地的数据集至项目中
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_antchain_pdcp_project_dataset_ex(request, headers, runtime)

    async def auth_antchain_pdcp_project_dataset_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasetRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasetResponse:
        """
        Description: 授权dataset至项目内，/api/project/dataset/auth，后续创建任务时仅允许选择已授权至项目内的数据集列表
        Summary: 授权某个本地的数据集至项目中
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_antchain_pdcp_project_dataset_ex_async(request, headers, runtime)

    def auth_antchain_pdcp_project_dataset_ex(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasetResponse:
        """
        Description: 授权dataset至项目内，/api/project/dataset/auth，后续创建任务时仅允许选择已授权至项目内的数据集列表
        Summary: 授权某个本地的数据集至项目中
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasetResponse(),
            self.do_request('1.0', 'antchain.pdcp.project.dataset.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_antchain_pdcp_project_dataset_ex_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasetResponse:
        """
        Description: 授权dataset至项目内，/api/project/dataset/auth，后续创建任务时仅允许选择已授权至项目内的数据集列表
        Summary: 授权某个本地的数据集至项目中
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasetResponse(),
            await self.do_request_async('1.0', 'antchain.pdcp.project.dataset.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_antchain_pdcp_project_datasource(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasourceRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasourceResponse:
        """
        Description: 授权数据源至项目/api/project/datasource/auth
        Summary: 授权某个本地数据源至项目中
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_antchain_pdcp_project_datasource_ex(request, headers, runtime)

    async def auth_antchain_pdcp_project_datasource_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasourceRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasourceResponse:
        """
        Description: 授权数据源至项目/api/project/datasource/auth
        Summary: 授权某个本地数据源至项目中
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_antchain_pdcp_project_datasource_ex_async(request, headers, runtime)

    def auth_antchain_pdcp_project_datasource_ex(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasourceResponse:
        """
        Description: 授权数据源至项目/api/project/datasource/auth
        Summary: 授权某个本地数据源至项目中
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasourceResponse(),
            self.do_request('1.0', 'antchain.pdcp.project.datasource.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_antchain_pdcp_project_datasource_ex_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasourceResponse:
        """
        Description: 授权数据源至项目/api/project/datasource/auth
        Summary: 授权某个本地数据源至项目中
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.AuthAntchainPdcpProjectDatasourceResponse(),
            await self.do_request_async('1.0', 'antchain.pdcp.project.datasource.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_antchain_pdcp_project_authdataset(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasetRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasetResponse:
        """
        Description: 分页查询项目内已授权的数据集列表
        Summary: 分页查询项目内已授权的数据集列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_antchain_pdcp_project_authdataset_ex(request, headers, runtime)

    async def pagequery_antchain_pdcp_project_authdataset_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasetRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasetResponse:
        """
        Description: 分页查询项目内已授权的数据集列表
        Summary: 分页查询项目内已授权的数据集列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_antchain_pdcp_project_authdataset_ex_async(request, headers, runtime)

    def pagequery_antchain_pdcp_project_authdataset_ex(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasetResponse:
        """
        Description: 分页查询项目内已授权的数据集列表
        Summary: 分页查询项目内已授权的数据集列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasetResponse(),
            self.do_request('1.0', 'antchain.pdcp.project.authdataset.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_antchain_pdcp_project_authdataset_ex_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasetResponse:
        """
        Description: 分页查询项目内已授权的数据集列表
        Summary: 分页查询项目内已授权的数据集列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasetResponse(),
            await self.do_request_async('1.0', 'antchain.pdcp.project.authdataset.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_antchain_pdcp_project_authdatasource(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasourceRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasourceResponse:
        """
        Description: 分页查询项目内已授权的数据源列表
        Summary: 分页查询项目内已授权的数据源列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_antchain_pdcp_project_authdatasource_ex(request, headers, runtime)

    async def pagequery_antchain_pdcp_project_authdatasource_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasourceRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasourceResponse:
        """
        Description: 分页查询项目内已授权的数据源列表
        Summary: 分页查询项目内已授权的数据源列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_antchain_pdcp_project_authdatasource_ex_async(request, headers, runtime)

    def pagequery_antchain_pdcp_project_authdatasource_ex(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasourceResponse:
        """
        Description: 分页查询项目内已授权的数据源列表
        Summary: 分页查询项目内已授权的数据源列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasourceResponse(),
            self.do_request('1.0', 'antchain.pdcp.project.authdatasource.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_antchain_pdcp_project_authdatasource_ex_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasourceResponse:
        """
        Description: 分页查询项目内已授权的数据源列表
        Summary: 分页查询项目内已授权的数据源列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.PagequeryAntchainPdcpProjectAuthdatasourceResponse(),
            await self.do_request_async('1.0', 'antchain.pdcp.project.authdatasource.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_pdcp_job_psi(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpJobPsiRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpJobPsiResponse:
        """
        Description: 查询任务信息
        Summary: 查询任务状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_pdcp_job_psi_ex(request, headers, runtime)

    async def query_antchain_pdcp_job_psi_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpJobPsiRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpJobPsiResponse:
        """
        Description: 查询任务信息
        Summary: 查询任务状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_pdcp_job_psi_ex_async(request, headers, runtime)

    def query_antchain_pdcp_job_psi_ex(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpJobPsiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpJobPsiResponse:
        """
        Description: 查询任务信息
        Summary: 查询任务状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpJobPsiResponse(),
            self.do_request('1.0', 'antchain.pdcp.job.psi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_pdcp_job_psi_ex_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpJobPsiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpJobPsiResponse:
        """
        Description: 查询任务信息
        Summary: 查询任务状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.QueryAntchainPdcpJobPsiResponse(),
            await self.do_request_async('1.0', 'antchain.pdcp.job.psi.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_antchain_pdcp_job_psi(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.SubmitAntchainPdcpJobPsiRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.SubmitAntchainPdcpJobPsiResponse:
        """
        Description: 提交psi任务接口
        Summary: 提交psi任务接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_antchain_pdcp_job_psi_ex(request, headers, runtime)

    async def submit_antchain_pdcp_job_psi_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.SubmitAntchainPdcpJobPsiRequest,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.SubmitAntchainPdcpJobPsiResponse:
        """
        Description: 提交psi任务接口
        Summary: 提交psi任务接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_antchain_pdcp_job_psi_ex_async(request, headers, runtime)

    def submit_antchain_pdcp_job_psi_ex(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.SubmitAntchainPdcpJobPsiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.SubmitAntchainPdcpJobPsiResponse:
        """
        Description: 提交psi任务接口
        Summary: 提交psi任务接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.SubmitAntchainPdcpJobPsiResponse(),
            self.do_request('1.0', 'antchain.pdcp.job.psi.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_antchain_pdcp_job_psi_ex_async(
        self,
        request: ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.SubmitAntchainPdcpJobPsiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.SubmitAntchainPdcpJobPsiResponse:
        """
        Description: 提交psi任务接口
        Summary: 提交psi任务接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_be_9ae_52241c_747408ac_24bec_8f_036d_74_models.SubmitAntchainPdcpJobPsiResponse(),
            await self.do_request_async('1.0', 'antchain.pdcp.job.psi.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
