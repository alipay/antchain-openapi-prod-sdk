# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_d3c4f09125a14cd587057c405561809a import models as ak_d_3c_4f_09125a_14cd_587057c_405561809a_models
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
        config: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.Config,
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
            # 跨链账号明细
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
                    'sdk_version': '1.1.2',
                    '_prod_code': 'ak_d3c4f09125a14cd587057c405561809a',
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
            # 跨链账号明细
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
                    'sdk_version': '1.1.2',
                    '_prod_code': 'ak_d3c4f09125a14cd587057c405561809a',
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

    def update_antdigital_webtrwatrade_issuer_price(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.UpdateAntdigitalWebtrwatradeIssuerPriceRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.UpdateAntdigitalWebtrwatradeIssuerPriceResponse:
        """
        Description: 更新项目净值
        Summary: 更新项目净值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_antdigital_webtrwatrade_issuer_price_ex(request, headers, runtime)

    async def update_antdigital_webtrwatrade_issuer_price_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.UpdateAntdigitalWebtrwatradeIssuerPriceRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.UpdateAntdigitalWebtrwatradeIssuerPriceResponse:
        """
        Description: 更新项目净值
        Summary: 更新项目净值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_antdigital_webtrwatrade_issuer_price_ex_async(request, headers, runtime)

    def update_antdigital_webtrwatrade_issuer_price_ex(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.UpdateAntdigitalWebtrwatradeIssuerPriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.UpdateAntdigitalWebtrwatradeIssuerPriceResponse:
        """
        Description: 更新项目净值
        Summary: 更新项目净值
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.UpdateAntdigitalWebtrwatradeIssuerPriceResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.price.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_antdigital_webtrwatrade_issuer_price_ex_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.UpdateAntdigitalWebtrwatradeIssuerPriceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.UpdateAntdigitalWebtrwatradeIssuerPriceResponse:
        """
        Description: 更新项目净值
        Summary: 更新项目净值
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.UpdateAntdigitalWebtrwatradeIssuerPriceResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.price.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_antdigital_webtrwatrade_issuer_operationloglogininfo(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse:
        """
        Description: 发行机构查询登录登出操作日志
        Summary: 发行机构查询登录登出操作日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_antdigital_webtrwatrade_issuer_operationloglogininfo_ex(request, headers, runtime)

    async def list_antdigital_webtrwatrade_issuer_operationloglogininfo_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse:
        """
        Description: 发行机构查询登录登出操作日志
        Summary: 发行机构查询登录登出操作日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_antdigital_webtrwatrade_issuer_operationloglogininfo_ex_async(request, headers, runtime)

    def list_antdigital_webtrwatrade_issuer_operationloglogininfo_ex(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse:
        """
        Description: 发行机构查询登录登出操作日志
        Summary: 发行机构查询登录登出操作日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.operationloglogininfo.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_antdigital_webtrwatrade_issuer_operationloglogininfo_ex_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationloglogininfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse:
        """
        Description: 发行机构查询登录登出操作日志
        Summary: 发行机构查询登录登出操作日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationloglogininfoResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.operationloglogininfo.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_antdigital_webtrwatrade_distributor_operationloglogininfo(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse:
        """
        Description: 代销机构查询登录登出操作日志
        Summary: 代销机构查询登录登出操作日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_antdigital_webtrwatrade_distributor_operationloglogininfo_ex(request, headers, runtime)

    async def list_antdigital_webtrwatrade_distributor_operationloglogininfo_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse:
        """
        Description: 代销机构查询登录登出操作日志
        Summary: 代销机构查询登录登出操作日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_antdigital_webtrwatrade_distributor_operationloglogininfo_ex_async(request, headers, runtime)

    def list_antdigital_webtrwatrade_distributor_operationloglogininfo_ex(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse:
        """
        Description: 代销机构查询登录登出操作日志
        Summary: 代销机构查询登录登出操作日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.operationloglogininfo.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_antdigital_webtrwatrade_distributor_operationloglogininfo_ex_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationloglogininfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse:
        """
        Description: 代销机构查询登录登出操作日志
        Summary: 代销机构查询登录登出操作日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationloglogininfoResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.operationloglogininfo.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antdigital_webtrwatrade_issuer_subuserdetail(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse:
        """
        Description: 发行机构获取二级用户详情数据
        Summary: 发行机构获取二级用户详情数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antdigital_webtrwatrade_issuer_subuserdetail_ex(request, headers, runtime)

    async def query_antdigital_webtrwatrade_issuer_subuserdetail_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse:
        """
        Description: 发行机构获取二级用户详情数据
        Summary: 发行机构获取二级用户详情数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antdigital_webtrwatrade_issuer_subuserdetail_ex_async(request, headers, runtime)

    def query_antdigital_webtrwatrade_issuer_subuserdetail_ex(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse:
        """
        Description: 发行机构获取二级用户详情数据
        Summary: 发行机构获取二级用户详情数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.subuserdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antdigital_webtrwatrade_issuer_subuserdetail_ex_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeIssuerSubuserdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse:
        """
        Description: 发行机构获取二级用户详情数据
        Summary: 发行机构获取二级用户详情数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeIssuerSubuserdetailResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.subuserdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antdigital_webtrwatrade_distributor_subuserdetail(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse:
        """
        Description: 代销机构获取二级用户详情数据
        Summary: 代销机构获取二级用户详情数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antdigital_webtrwatrade_distributor_subuserdetail_ex(request, headers, runtime)

    async def query_antdigital_webtrwatrade_distributor_subuserdetail_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse:
        """
        Description: 代销机构获取二级用户详情数据
        Summary: 代销机构获取二级用户详情数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antdigital_webtrwatrade_distributor_subuserdetail_ex_async(request, headers, runtime)

    def query_antdigital_webtrwatrade_distributor_subuserdetail_ex(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse:
        """
        Description: 代销机构获取二级用户详情数据
        Summary: 代销机构获取二级用户详情数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.subuserdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antdigital_webtrwatrade_distributor_subuserdetail_ex_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeDistributorSubuserdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse:
        """
        Description: 代销机构获取二级用户详情数据
        Summary: 代销机构获取二级用户详情数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.QueryAntdigitalWebtrwatradeDistributorSubuserdetailResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.subuserdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_antdigital_webtrwatrade_issuer_crosschainaccount(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse:
        """
        Description: 发行机构跨链账号明细
        Summary: 发行机构跨链账号明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_antdigital_webtrwatrade_issuer_crosschainaccount_ex(request, headers, runtime)

    async def list_antdigital_webtrwatrade_issuer_crosschainaccount_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse:
        """
        Description: 发行机构跨链账号明细
        Summary: 发行机构跨链账号明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_antdigital_webtrwatrade_issuer_crosschainaccount_ex_async(request, headers, runtime)

    def list_antdigital_webtrwatrade_issuer_crosschainaccount_ex(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse:
        """
        Description: 发行机构跨链账号明细
        Summary: 发行机构跨链账号明细
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.crosschainaccount.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_antdigital_webtrwatrade_issuer_crosschainaccount_ex_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerCrosschainaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse:
        """
        Description: 发行机构跨链账号明细
        Summary: 发行机构跨链账号明细
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerCrosschainaccountResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.crosschainaccount.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_antdigital_webtrwatrade_distributor_crosschainaccount(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse:
        """
        Description: 代销机构跨链账号明细
        Summary: 代销机构跨链账号明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_antdigital_webtrwatrade_distributor_crosschainaccount_ex(request, headers, runtime)

    async def list_antdigital_webtrwatrade_distributor_crosschainaccount_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse:
        """
        Description: 代销机构跨链账号明细
        Summary: 代销机构跨链账号明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_antdigital_webtrwatrade_distributor_crosschainaccount_ex_async(request, headers, runtime)

    def list_antdigital_webtrwatrade_distributor_crosschainaccount_ex(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse:
        """
        Description: 代销机构跨链账号明细
        Summary: 代销机构跨链账号明细
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.crosschainaccount.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_antdigital_webtrwatrade_distributor_crosschainaccount_ex_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorCrosschainaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse:
        """
        Description: 代销机构跨链账号明细
        Summary: 代销机构跨链账号明细
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorCrosschainaccountResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.crosschainaccount.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_antdigital_webtrwatrade_issuer_projectwithrole(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse:
        """
        Description: 发行机构查询项目及角色信息
        Summary: 发行机构查询项目及角色信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_antdigital_webtrwatrade_issuer_projectwithrole_ex(request, headers, runtime)

    async def detail_antdigital_webtrwatrade_issuer_projectwithrole_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse:
        """
        Description: 发行机构查询项目及角色信息
        Summary: 发行机构查询项目及角色信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_antdigital_webtrwatrade_issuer_projectwithrole_ex_async(request, headers, runtime)

    def detail_antdigital_webtrwatrade_issuer_projectwithrole_ex(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse:
        """
        Description: 发行机构查询项目及角色信息
        Summary: 发行机构查询项目及角色信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.projectwithrole.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_antdigital_webtrwatrade_issuer_projectwithrole_ex_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.DetailAntdigitalWebtrwatradeIssuerProjectwithroleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse:
        """
        Description: 发行机构查询项目及角色信息
        Summary: 发行机构查询项目及角色信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.DetailAntdigitalWebtrwatradeIssuerProjectwithroleResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.projectwithrole.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_antdigital_webtrwatrade_issuer_operationlog(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationlogRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationlogResponse:
        """
        Description: 发行机构查询所有操作员的操作日志
        Summary: 发行机构查询所有操作员的操作日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_antdigital_webtrwatrade_issuer_operationlog_ex(request, headers, runtime)

    async def list_antdigital_webtrwatrade_issuer_operationlog_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationlogRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationlogResponse:
        """
        Description: 发行机构查询所有操作员的操作日志
        Summary: 发行机构查询所有操作员的操作日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_antdigital_webtrwatrade_issuer_operationlog_ex_async(request, headers, runtime)

    def list_antdigital_webtrwatrade_issuer_operationlog_ex(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationlogResponse:
        """
        Description: 发行机构查询所有操作员的操作日志
        Summary: 发行机构查询所有操作员的操作日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationlogResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.operationlog.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_antdigital_webtrwatrade_issuer_operationlog_ex_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationlogResponse:
        """
        Description: 发行机构查询所有操作员的操作日志
        Summary: 发行机构查询所有操作员的操作日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerOperationlogResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.operationlog.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_antdigital_webtrwatrade_distributor_operationlog(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationlogRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationlogResponse:
        """
        Description: 代销机构查询所有操作员的操作日志
        Summary: 代销机构查询所有操作员的操作日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_antdigital_webtrwatrade_distributor_operationlog_ex(request, headers, runtime)

    async def list_antdigital_webtrwatrade_distributor_operationlog_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationlogRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationlogResponse:
        """
        Description: 代销机构查询所有操作员的操作日志
        Summary: 代销机构查询所有操作员的操作日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_antdigital_webtrwatrade_distributor_operationlog_ex_async(request, headers, runtime)

    def list_antdigital_webtrwatrade_distributor_operationlog_ex(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationlogResponse:
        """
        Description: 代销机构查询所有操作员的操作日志
        Summary: 代销机构查询所有操作员的操作日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationlogResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.operationlog.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_antdigital_webtrwatrade_distributor_operationlog_ex_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationlogResponse:
        """
        Description: 代销机构查询所有操作员的操作日志
        Summary: 代销机构查询所有操作员的操作日志
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorOperationlogResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.operationlog.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_antdigital_webtrwatrade_issuer_project(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerProjectRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerProjectResponse:
        """
        Description: 查询发行机构下所有的项目
        Summary: 查询发行机构下所有的项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_antdigital_webtrwatrade_issuer_project_ex(request, headers, runtime)

    async def list_antdigital_webtrwatrade_issuer_project_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerProjectRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerProjectResponse:
        """
        Description: 查询发行机构下所有的项目
        Summary: 查询发行机构下所有的项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_antdigital_webtrwatrade_issuer_project_ex_async(request, headers, runtime)

    def list_antdigital_webtrwatrade_issuer_project_ex(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerProjectResponse:
        """
        Description: 查询发行机构下所有的项目
        Summary: 查询发行机构下所有的项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerProjectResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.project.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_antdigital_webtrwatrade_issuer_project_ex_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerProjectResponse:
        """
        Description: 查询发行机构下所有的项目
        Summary: 查询发行机构下所有的项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerProjectResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.project.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_antdigital_webtrwatrade_distributor_project(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorProjectRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorProjectResponse:
        """
        Description: 查询代销机构下所有的项目
        Summary: 查询代销机构下所有的项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_antdigital_webtrwatrade_distributor_project_ex(request, headers, runtime)

    async def list_antdigital_webtrwatrade_distributor_project_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorProjectRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorProjectResponse:
        """
        Description: 查询代销机构下所有的项目
        Summary: 查询代销机构下所有的项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_antdigital_webtrwatrade_distributor_project_ex_async(request, headers, runtime)

    def list_antdigital_webtrwatrade_distributor_project_ex(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorProjectResponse:
        """
        Description: 查询代销机构下所有的项目
        Summary: 查询代销机构下所有的项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorProjectResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.project.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_antdigital_webtrwatrade_distributor_project_ex_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorProjectResponse:
        """
        Description: 查询代销机构下所有的项目
        Summary: 查询代销机构下所有的项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorProjectResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.project.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_antdigital_webtrwatrade_issuer_subuser(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerSubuserRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerSubuserResponse:
        """
        Description: 查询发行机构和项目下所有关联的二级用户信息
        Summary: 查询机构和项目下所有关联的二级用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_antdigital_webtrwatrade_issuer_subuser_ex(request, headers, runtime)

    async def list_antdigital_webtrwatrade_issuer_subuser_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerSubuserRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerSubuserResponse:
        """
        Description: 查询发行机构和项目下所有关联的二级用户信息
        Summary: 查询机构和项目下所有关联的二级用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_antdigital_webtrwatrade_issuer_subuser_ex_async(request, headers, runtime)

    def list_antdigital_webtrwatrade_issuer_subuser_ex(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerSubuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerSubuserResponse:
        """
        Description: 查询发行机构和项目下所有关联的二级用户信息
        Summary: 查询机构和项目下所有关联的二级用户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerSubuserResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.issuer.subuser.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_antdigital_webtrwatrade_issuer_subuser_ex_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerSubuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerSubuserResponse:
        """
        Description: 查询发行机构和项目下所有关联的二级用户信息
        Summary: 查询机构和项目下所有关联的二级用户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeIssuerSubuserResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.issuer.subuser.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_antdigital_webtrwatrade_distributor_subuser(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorSubuserRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorSubuserResponse:
        """
        Description: 查询代销机构和项目下所有关联的二级用户信息
        Summary: 查询机构和项目下所有关联的二级用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_antdigital_webtrwatrade_distributor_subuser_ex(request, headers, runtime)

    async def list_antdigital_webtrwatrade_distributor_subuser_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorSubuserRequest,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorSubuserResponse:
        """
        Description: 查询代销机构和项目下所有关联的二级用户信息
        Summary: 查询机构和项目下所有关联的二级用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_antdigital_webtrwatrade_distributor_subuser_ex_async(request, headers, runtime)

    def list_antdigital_webtrwatrade_distributor_subuser_ex(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorSubuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorSubuserResponse:
        """
        Description: 查询代销机构和项目下所有关联的二级用户信息
        Summary: 查询机构和项目下所有关联的二级用户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorSubuserResponse(),
            self.do_request('1.0', 'antdigital.webtrwatrade.distributor.subuser.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_antdigital_webtrwatrade_distributor_subuser_ex_async(
        self,
        request: ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorSubuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorSubuserResponse:
        """
        Description: 查询代销机构和项目下所有关联的二级用户信息
        Summary: 查询机构和项目下所有关联的二级用户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak_d_3c_4f_09125a_14cd_587057c_405561809a_models.ListAntdigitalWebtrwatradeDistributorSubuserResponse(),
            await self.do_request_async('1.0', 'antdigital.webtrwatrade.distributor.subuser.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
