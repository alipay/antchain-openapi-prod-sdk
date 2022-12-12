# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_stlr import models as stlr_models
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
        config: stlr_models.Config,
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
            # 证书授权产品信息
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
                    'sdk_version': '2.1.0',
                    '_prod_code': 'STLR',
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
            # 证书授权产品信息
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
                    'sdk_version': '2.1.0',
                    '_prod_code': 'STLR',
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

    def describe_acar_activity(
        self,
        request: stlr_models.DescribeAcarActivityRequest,
    ) -> stlr_models.DescribeAcarActivityResponse:
        """
        Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
        Summary: 查询当前活动资料信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.describe_acar_activity_ex(request, headers, runtime)

    async def describe_acar_activity_async(
        self,
        request: stlr_models.DescribeAcarActivityRequest,
    ) -> stlr_models.DescribeAcarActivityResponse:
        """
        Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
        Summary: 查询当前活动资料信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.describe_acar_activity_ex_async(request, headers, runtime)

    def describe_acar_activity_ex(
        self,
        request: stlr_models.DescribeAcarActivityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DescribeAcarActivityResponse:
        """
        Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
        Summary: 查询当前活动资料信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DescribeAcarActivityResponse(),
            self.do_request('1.0', 'antchain.carbon.acar.activity.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def describe_acar_activity_ex_async(
        self,
        request: stlr_models.DescribeAcarActivityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DescribeAcarActivityResponse:
        """
        Description: 查询活动资料描述信息，包括大型会展信息及当前开展的活动日期等等
        Summary: 查询当前活动资料信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DescribeAcarActivityResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.acar.activity.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def describe_acar_dailyemissions(
        self,
        request: stlr_models.DescribeAcarDailyemissionsRequest,
    ) -> stlr_models.DescribeAcarDailyemissionsResponse:
        """
        Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
        Summary: 查询当前活动的每日碳排放量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.describe_acar_dailyemissions_ex(request, headers, runtime)

    async def describe_acar_dailyemissions_async(
        self,
        request: stlr_models.DescribeAcarDailyemissionsRequest,
    ) -> stlr_models.DescribeAcarDailyemissionsResponse:
        """
        Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
        Summary: 查询当前活动的每日碳排放量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.describe_acar_dailyemissions_ex_async(request, headers, runtime)

    def describe_acar_dailyemissions_ex(
        self,
        request: stlr_models.DescribeAcarDailyemissionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DescribeAcarDailyemissionsResponse:
        """
        Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
        Summary: 查询当前活动的每日碳排放量
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DescribeAcarDailyemissionsResponse(),
            self.do_request('1.0', 'antchain.carbon.acar.dailyemissions.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def describe_acar_dailyemissions_ex_async(
        self,
        request: stlr_models.DescribeAcarDailyemissionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DescribeAcarDailyemissionsResponse:
        """
        Description: 返回当前活动累计的碳排放量，以及每日累计的总排放量。
        Summary: 查询当前活动的每日碳排放量
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DescribeAcarDailyemissionsResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.acar.dailyemissions.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def describe_acar_scopemission(
        self,
        request: stlr_models.DescribeAcarScopemissionRequest,
    ) -> stlr_models.DescribeAcarScopemissionResponse:
        """
        Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
        Summary: 查询当前活动各范围的碳排放量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.describe_acar_scopemission_ex(request, headers, runtime)

    async def describe_acar_scopemission_async(
        self,
        request: stlr_models.DescribeAcarScopemissionRequest,
    ) -> stlr_models.DescribeAcarScopemissionResponse:
        """
        Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
        Summary: 查询当前活动各范围的碳排放量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.describe_acar_scopemission_ex_async(request, headers, runtime)

    def describe_acar_scopemission_ex(
        self,
        request: stlr_models.DescribeAcarScopemissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DescribeAcarScopemissionResponse:
        """
        Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
        Summary: 查询当前活动各范围的碳排放量
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DescribeAcarScopemissionResponse(),
            self.do_request('1.0', 'antchain.carbon.acar.scopemission.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def describe_acar_scopemission_ex_async(
        self,
        request: stlr_models.DescribeAcarScopemissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DescribeAcarScopemissionResponse:
        """
        Description: 查询当前活动各范围的碳排放量，返回各范围的排放占比，以及范围下各分类的碳排放量。
        Summary: 查询当前活动各范围的碳排放量
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DescribeAcarScopemissionResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.acar.scopemission.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def describe_acar_reductionemissions(
        self,
        request: stlr_models.DescribeAcarReductionemissionsRequest,
    ) -> stlr_models.DescribeAcarReductionemissionsResponse:
        """
        Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
        Summary: 获取减排情况
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.describe_acar_reductionemissions_ex(request, headers, runtime)

    async def describe_acar_reductionemissions_async(
        self,
        request: stlr_models.DescribeAcarReductionemissionsRequest,
    ) -> stlr_models.DescribeAcarReductionemissionsResponse:
        """
        Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
        Summary: 获取减排情况
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.describe_acar_reductionemissions_ex_async(request, headers, runtime)

    def describe_acar_reductionemissions_ex(
        self,
        request: stlr_models.DescribeAcarReductionemissionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DescribeAcarReductionemissionsResponse:
        """
        Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
        Summary: 获取减排情况
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DescribeAcarReductionemissionsResponse(),
            self.do_request('1.0', 'antchain.carbon.acar.reductionemissions.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def describe_acar_reductionemissions_ex_async(
        self,
        request: stlr_models.DescribeAcarReductionemissionsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DescribeAcarReductionemissionsResponse:
        """
        Description: 获取减排情况，返回多项减排方案实施下相关的减排情况
        Summary: 获取减排情况
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DescribeAcarReductionemissionsResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.acar.reductionemissions.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def describe_acar_lastemissiondata(
        self,
        request: stlr_models.DescribeAcarLastemissiondataRequest,
    ) -> stlr_models.DescribeAcarLastemissiondataResponse:
        """
        Description: 查询最近排放数据，返回最近排放数据信息
        Summary: 查询最近排放数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.describe_acar_lastemissiondata_ex(request, headers, runtime)

    async def describe_acar_lastemissiondata_async(
        self,
        request: stlr_models.DescribeAcarLastemissiondataRequest,
    ) -> stlr_models.DescribeAcarLastemissiondataResponse:
        """
        Description: 查询最近排放数据，返回最近排放数据信息
        Summary: 查询最近排放数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.describe_acar_lastemissiondata_ex_async(request, headers, runtime)

    def describe_acar_lastemissiondata_ex(
        self,
        request: stlr_models.DescribeAcarLastemissiondataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DescribeAcarLastemissiondataResponse:
        """
        Description: 查询最近排放数据，返回最近排放数据信息
        Summary: 查询最近排放数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DescribeAcarLastemissiondataResponse(),
            self.do_request('1.0', 'antchain.carbon.acar.lastemissiondata.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def describe_acar_lastemissiondata_ex_async(
        self,
        request: stlr_models.DescribeAcarLastemissiondataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DescribeAcarLastemissiondataResponse:
        """
        Description: 查询最近排放数据，返回最近排放数据信息
        Summary: 查询最近排放数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DescribeAcarLastemissiondataResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.acar.lastemissiondata.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_emission_total(
        self,
        request: stlr_models.QueryEmissionTotalRequest,
    ) -> stlr_models.QueryEmissionTotalResponse:
        """
        Description: 碳总量查询
        Summary: 碳总量查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_emission_total_ex(request, headers, runtime)

    async def query_emission_total_async(
        self,
        request: stlr_models.QueryEmissionTotalRequest,
    ) -> stlr_models.QueryEmissionTotalResponse:
        """
        Description: 碳总量查询
        Summary: 碳总量查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_emission_total_ex_async(request, headers, runtime)

    def query_emission_total_ex(
        self,
        request: stlr_models.QueryEmissionTotalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryEmissionTotalResponse:
        """
        Description: 碳总量查询
        Summary: 碳总量查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryEmissionTotalResponse(),
            self.do_request('1.0', 'antchain.carbon.emission.total.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_emission_total_ex_async(
        self,
        request: stlr_models.QueryEmissionTotalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryEmissionTotalResponse:
        """
        Description: 碳总量查询
        Summary: 碳总量查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryEmissionTotalResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.emission.total.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_emission_groupbycategory(
        self,
        request: stlr_models.QueryEmissionGroupbycategoryRequest,
    ) -> stlr_models.QueryEmissionGroupbycategoryResponse:
        """
        Description: 碳排放总量分类统计
        Summary: 碳排放总量分类统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_emission_groupbycategory_ex(request, headers, runtime)

    async def query_emission_groupbycategory_async(
        self,
        request: stlr_models.QueryEmissionGroupbycategoryRequest,
    ) -> stlr_models.QueryEmissionGroupbycategoryResponse:
        """
        Description: 碳排放总量分类统计
        Summary: 碳排放总量分类统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_emission_groupbycategory_ex_async(request, headers, runtime)

    def query_emission_groupbycategory_ex(
        self,
        request: stlr_models.QueryEmissionGroupbycategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryEmissionGroupbycategoryResponse:
        """
        Description: 碳排放总量分类统计
        Summary: 碳排放总量分类统计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryEmissionGroupbycategoryResponse(),
            self.do_request('1.0', 'antchain.carbon.emission.groupbycategory.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_emission_groupbycategory_ex_async(
        self,
        request: stlr_models.QueryEmissionGroupbycategoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryEmissionGroupbycategoryResponse:
        """
        Description: 碳排放总量分类统计
        Summary: 碳排放总量分类统计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryEmissionGroupbycategoryResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.emission.groupbycategory.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_emission_groupbylocation(
        self,
        request: stlr_models.QueryEmissionGroupbylocationRequest,
    ) -> stlr_models.QueryEmissionGroupbylocationResponse:
        """
        Description: 碳排放总量分单元统计
        Summary: 碳排放总量分单元统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_emission_groupbylocation_ex(request, headers, runtime)

    async def query_emission_groupbylocation_async(
        self,
        request: stlr_models.QueryEmissionGroupbylocationRequest,
    ) -> stlr_models.QueryEmissionGroupbylocationResponse:
        """
        Description: 碳排放总量分单元统计
        Summary: 碳排放总量分单元统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_emission_groupbylocation_ex_async(request, headers, runtime)

    def query_emission_groupbylocation_ex(
        self,
        request: stlr_models.QueryEmissionGroupbylocationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryEmissionGroupbylocationResponse:
        """
        Description: 碳排放总量分单元统计
        Summary: 碳排放总量分单元统计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryEmissionGroupbylocationResponse(),
            self.do_request('1.0', 'antchain.carbon.emission.groupbylocation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_emission_groupbylocation_ex_async(
        self,
        request: stlr_models.QueryEmissionGroupbylocationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryEmissionGroupbylocationResponse:
        """
        Description: 碳排放总量分单元统计
        Summary: 碳排放总量分单元统计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryEmissionGroupbylocationResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.emission.groupbylocation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_emission_groupbycity(
        self,
        request: stlr_models.QueryEmissionGroupbycityRequest,
    ) -> stlr_models.QueryEmissionGroupbycityResponse:
        """
        Description: 碳排放总量分城市统计
        Summary: 碳排放总量分城市统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_emission_groupbycity_ex(request, headers, runtime)

    async def query_emission_groupbycity_async(
        self,
        request: stlr_models.QueryEmissionGroupbycityRequest,
    ) -> stlr_models.QueryEmissionGroupbycityResponse:
        """
        Description: 碳排放总量分城市统计
        Summary: 碳排放总量分城市统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_emission_groupbycity_ex_async(request, headers, runtime)

    def query_emission_groupbycity_ex(
        self,
        request: stlr_models.QueryEmissionGroupbycityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryEmissionGroupbycityResponse:
        """
        Description: 碳排放总量分城市统计
        Summary: 碳排放总量分城市统计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryEmissionGroupbycityResponse(),
            self.do_request('1.0', 'antchain.carbon.emission.groupbycity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_emission_groupbycity_ex_async(
        self,
        request: stlr_models.QueryEmissionGroupbycityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryEmissionGroupbycityResponse:
        """
        Description: 碳排放总量分城市统计
        Summary: 碳排放总量分城市统计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryEmissionGroupbycityResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.emission.groupbycity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_emission_reduction(
        self,
        request: stlr_models.QueryEmissionReductionRequest,
    ) -> stlr_models.QueryEmissionReductionResponse:
        """
        Description: 减排统计查询
        Summary: 减排统计查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_emission_reduction_ex(request, headers, runtime)

    async def query_emission_reduction_async(
        self,
        request: stlr_models.QueryEmissionReductionRequest,
    ) -> stlr_models.QueryEmissionReductionResponse:
        """
        Description: 减排统计查询
        Summary: 减排统计查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_emission_reduction_ex_async(request, headers, runtime)

    def query_emission_reduction_ex(
        self,
        request: stlr_models.QueryEmissionReductionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryEmissionReductionResponse:
        """
        Description: 减排统计查询
        Summary: 减排统计查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryEmissionReductionResponse(),
            self.do_request('1.0', 'antchain.carbon.emission.reduction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_emission_reduction_ex_async(
        self,
        request: stlr_models.QueryEmissionReductionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryEmissionReductionResponse:
        """
        Description: 减排统计查询
        Summary: 减排统计查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryEmissionReductionResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.emission.reduction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_emission_counteraction(
        self,
        request: stlr_models.QueryEmissionCounteractionRequest,
    ) -> stlr_models.QueryEmissionCounteractionResponse:
        """
        Description: 碳抵消量统计
        Summary: 碳抵消量统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_emission_counteraction_ex(request, headers, runtime)

    async def query_emission_counteraction_async(
        self,
        request: stlr_models.QueryEmissionCounteractionRequest,
    ) -> stlr_models.QueryEmissionCounteractionResponse:
        """
        Description: 碳抵消量统计
        Summary: 碳抵消量统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_emission_counteraction_ex_async(request, headers, runtime)

    def query_emission_counteraction_ex(
        self,
        request: stlr_models.QueryEmissionCounteractionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryEmissionCounteractionResponse:
        """
        Description: 碳抵消量统计
        Summary: 碳抵消量统计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryEmissionCounteractionResponse(),
            self.do_request('1.0', 'antchain.carbon.emission.counteraction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_emission_counteraction_ex_async(
        self,
        request: stlr_models.QueryEmissionCounteractionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryEmissionCounteractionResponse:
        """
        Description: 碳抵消量统计
        Summary: 碳抵消量统计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryEmissionCounteractionResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.emission.counteraction.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_pdcp_account(
        self,
        request: stlr_models.RegisterPdcpAccountRequest,
    ) -> stlr_models.RegisterPdcpAccountResponse:
        """
        Description: 账户开通接口。开通协作平台和链上账户
        Summary: 账户开通接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_pdcp_account_ex(request, headers, runtime)

    async def register_pdcp_account_async(
        self,
        request: stlr_models.RegisterPdcpAccountRequest,
    ) -> stlr_models.RegisterPdcpAccountResponse:
        """
        Description: 账户开通接口。开通协作平台和链上账户
        Summary: 账户开通接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_pdcp_account_ex_async(request, headers, runtime)

    def register_pdcp_account_ex(
        self,
        request: stlr_models.RegisterPdcpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.RegisterPdcpAccountResponse:
        """
        Description: 账户开通接口。开通协作平台和链上账户
        Summary: 账户开通接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.RegisterPdcpAccountResponse(),
            self.do_request('1.0', 'antchain.carbon.pdcp.account.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_pdcp_account_ex_async(
        self,
        request: stlr_models.RegisterPdcpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.RegisterPdcpAccountResponse:
        """
        Description: 账户开通接口。开通协作平台和链上账户
        Summary: 账户开通接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.RegisterPdcpAccountResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.pdcp.account.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_pdcp_blockchain(
        self,
        request: stlr_models.PushPdcpBlockchainRequest,
    ) -> stlr_models.PushPdcpBlockchainResponse:
        """
        Description: 存证接口
        Summary: 存证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_pdcp_blockchain_ex(request, headers, runtime)

    async def push_pdcp_blockchain_async(
        self,
        request: stlr_models.PushPdcpBlockchainRequest,
    ) -> stlr_models.PushPdcpBlockchainResponse:
        """
        Description: 存证接口
        Summary: 存证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_pdcp_blockchain_ex_async(request, headers, runtime)

    def push_pdcp_blockchain_ex(
        self,
        request: stlr_models.PushPdcpBlockchainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.PushPdcpBlockchainResponse:
        """
        Description: 存证接口
        Summary: 存证接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.PushPdcpBlockchainResponse(),
            self.do_request('1.0', 'antchain.carbon.pdcp.blockchain.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_pdcp_blockchain_ex_async(
        self,
        request: stlr_models.PushPdcpBlockchainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.PushPdcpBlockchainResponse:
        """
        Description: 存证接口
        Summary: 存证接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.PushPdcpBlockchainResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.pdcp.blockchain.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_pdcp_blockchain(
        self,
        request: stlr_models.UploadPdcpBlockchainRequest,
    ) -> stlr_models.UploadPdcpBlockchainResponse:
        """
        Description: 异步存证接口
        Summary: 异步存证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_pdcp_blockchain_ex(request, headers, runtime)

    async def upload_pdcp_blockchain_async(
        self,
        request: stlr_models.UploadPdcpBlockchainRequest,
    ) -> stlr_models.UploadPdcpBlockchainResponse:
        """
        Description: 异步存证接口
        Summary: 异步存证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_pdcp_blockchain_ex_async(request, headers, runtime)

    def upload_pdcp_blockchain_ex(
        self,
        request: stlr_models.UploadPdcpBlockchainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.UploadPdcpBlockchainResponse:
        """
        Description: 异步存证接口
        Summary: 异步存证接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.UploadPdcpBlockchainResponse(),
            self.do_request('1.0', 'antchain.carbon.pdcp.blockchain.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_pdcp_blockchain_ex_async(
        self,
        request: stlr_models.UploadPdcpBlockchainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.UploadPdcpBlockchainResponse:
        """
        Description: 异步存证接口
        Summary: 异步存证接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.UploadPdcpBlockchainResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.pdcp.blockchain.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_pdcp_blockchain(
        self,
        request: stlr_models.GetPdcpBlockchainRequest,
    ) -> stlr_models.GetPdcpBlockchainResponse:
        """
        Description: 查询异步存证结果
        Summary: 查询异步存证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_pdcp_blockchain_ex(request, headers, runtime)

    async def get_pdcp_blockchain_async(
        self,
        request: stlr_models.GetPdcpBlockchainRequest,
    ) -> stlr_models.GetPdcpBlockchainResponse:
        """
        Description: 查询异步存证结果
        Summary: 查询异步存证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_pdcp_blockchain_ex_async(request, headers, runtime)

    def get_pdcp_blockchain_ex(
        self,
        request: stlr_models.GetPdcpBlockchainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.GetPdcpBlockchainResponse:
        """
        Description: 查询异步存证结果
        Summary: 查询异步存证结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.GetPdcpBlockchainResponse(),
            self.do_request('1.0', 'antchain.carbon.pdcp.blockchain.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_pdcp_blockchain_ex_async(
        self,
        request: stlr_models.GetPdcpBlockchainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.GetPdcpBlockchainResponse:
        """
        Description: 查询异步存证结果
        Summary: 查询异步存证结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.GetPdcpBlockchainResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.pdcp.blockchain.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pdcp_account(
        self,
        request: stlr_models.QueryPdcpAccountRequest,
    ) -> stlr_models.QueryPdcpAccountResponse:
        """
        Description: 链上账户查询接口
        Summary: 链上账户查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pdcp_account_ex(request, headers, runtime)

    async def query_pdcp_account_async(
        self,
        request: stlr_models.QueryPdcpAccountRequest,
    ) -> stlr_models.QueryPdcpAccountResponse:
        """
        Description: 链上账户查询接口
        Summary: 链上账户查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pdcp_account_ex_async(request, headers, runtime)

    def query_pdcp_account_ex(
        self,
        request: stlr_models.QueryPdcpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryPdcpAccountResponse:
        """
        Description: 链上账户查询接口
        Summary: 链上账户查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryPdcpAccountResponse(),
            self.do_request('1.0', 'antchain.carbon.pdcp.account.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pdcp_account_ex_async(
        self,
        request: stlr_models.QueryPdcpAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryPdcpAccountResponse:
        """
        Description: 链上账户查询接口
        Summary: 链上账户查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryPdcpAccountResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.pdcp.account.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_ecar_avitivedata(
        self,
        request: stlr_models.AddEcarAvitivedataRequest,
    ) -> stlr_models.AddEcarAvitivedataResponse:
        """
        Description: 新增排放活动数据
        Summary: 新增排放活动数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_ecar_avitivedata_ex(request, headers, runtime)

    async def add_ecar_avitivedata_async(
        self,
        request: stlr_models.AddEcarAvitivedataRequest,
    ) -> stlr_models.AddEcarAvitivedataResponse:
        """
        Description: 新增排放活动数据
        Summary: 新增排放活动数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_ecar_avitivedata_ex_async(request, headers, runtime)

    def add_ecar_avitivedata_ex(
        self,
        request: stlr_models.AddEcarAvitivedataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AddEcarAvitivedataResponse:
        """
        Description: 新增排放活动数据
        Summary: 新增排放活动数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AddEcarAvitivedataResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.avitivedata.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_ecar_avitivedata_ex_async(
        self,
        request: stlr_models.AddEcarAvitivedataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AddEcarAvitivedataResponse:
        """
        Description: 新增排放活动数据
        Summary: 新增排放活动数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AddEcarAvitivedataResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.avitivedata.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_ecar_avitivedata(
        self,
        request: stlr_models.DetailEcarAvitivedataRequest,
    ) -> stlr_models.DetailEcarAvitivedataResponse:
        """
        Description: 查询排放活动数据详情
        Summary: 查询排放活动数据详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_ecar_avitivedata_ex(request, headers, runtime)

    async def detail_ecar_avitivedata_async(
        self,
        request: stlr_models.DetailEcarAvitivedataRequest,
    ) -> stlr_models.DetailEcarAvitivedataResponse:
        """
        Description: 查询排放活动数据详情
        Summary: 查询排放活动数据详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_ecar_avitivedata_ex_async(request, headers, runtime)

    def detail_ecar_avitivedata_ex(
        self,
        request: stlr_models.DetailEcarAvitivedataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DetailEcarAvitivedataResponse:
        """
        Description: 查询排放活动数据详情
        Summary: 查询排放活动数据详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DetailEcarAvitivedataResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.avitivedata.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_ecar_avitivedata_ex_async(
        self,
        request: stlr_models.DetailEcarAvitivedataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DetailEcarAvitivedataResponse:
        """
        Description: 查询排放活动数据详情
        Summary: 查询排放活动数据详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DetailEcarAvitivedataResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.avitivedata.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_ecar_activedata(
        self,
        request: stlr_models.CountEcarActivedataRequest,
    ) -> stlr_models.CountEcarActivedataResponse:
        """
        Description: 排放活动数据统计计算
        Summary: 排放活动数据统计计算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_ecar_activedata_ex(request, headers, runtime)

    async def count_ecar_activedata_async(
        self,
        request: stlr_models.CountEcarActivedataRequest,
    ) -> stlr_models.CountEcarActivedataResponse:
        """
        Description: 排放活动数据统计计算
        Summary: 排放活动数据统计计算
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_ecar_activedata_ex_async(request, headers, runtime)

    def count_ecar_activedata_ex(
        self,
        request: stlr_models.CountEcarActivedataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.CountEcarActivedataResponse:
        """
        Description: 排放活动数据统计计算
        Summary: 排放活动数据统计计算
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.CountEcarActivedataResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.activedata.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_ecar_activedata_ex_async(
        self,
        request: stlr_models.CountEcarActivedataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.CountEcarActivedataResponse:
        """
        Description: 排放活动数据统计计算
        Summary: 排放活动数据统计计算
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.CountEcarActivedataResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.activedata.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_ecar_file(
        self,
        request: stlr_models.UploadEcarFileRequest,
    ) -> stlr_models.UploadEcarFileResponse:
        """
        Description: 文件上传接口
        Summary: 文件上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_ecar_file_ex(request, headers, runtime)

    async def upload_ecar_file_async(
        self,
        request: stlr_models.UploadEcarFileRequest,
    ) -> stlr_models.UploadEcarFileResponse:
        """
        Description: 文件上传接口
        Summary: 文件上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_ecar_file_ex_async(request, headers, runtime)

    def upload_ecar_file_ex(
        self,
        request: stlr_models.UploadEcarFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.UploadEcarFileResponse:
        """
        Description: 文件上传接口
        Summary: 文件上传接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = stlr_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.carbon.ecar.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_ecar_file_response = stlr_models.UploadEcarFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_ecar_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.UploadEcarFileResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_ecar_file_ex_async(
        self,
        request: stlr_models.UploadEcarFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.UploadEcarFileResponse:
        """
        Description: 文件上传接口
        Summary: 文件上传接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = stlr_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.carbon.ecar.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_ecar_file_response = stlr_models.UploadEcarFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_ecar_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.UploadEcarFileResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_ecar_greenoperation(
        self,
        request: stlr_models.AddEcarGreenoperationRequest,
    ) -> stlr_models.AddEcarGreenoperationResponse:
        """
        Description: 录入绿色行为数据，支持绿色定义或电子发票等多种绿色行为类型的数据提交
        Summary: 录入绿色行为数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_ecar_greenoperation_ex(request, headers, runtime)

    async def add_ecar_greenoperation_async(
        self,
        request: stlr_models.AddEcarGreenoperationRequest,
    ) -> stlr_models.AddEcarGreenoperationResponse:
        """
        Description: 录入绿色行为数据，支持绿色定义或电子发票等多种绿色行为类型的数据提交
        Summary: 录入绿色行为数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_ecar_greenoperation_ex_async(request, headers, runtime)

    def add_ecar_greenoperation_ex(
        self,
        request: stlr_models.AddEcarGreenoperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AddEcarGreenoperationResponse:
        """
        Description: 录入绿色行为数据，支持绿色定义或电子发票等多种绿色行为类型的数据提交
        Summary: 录入绿色行为数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AddEcarGreenoperationResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.greenoperation.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_ecar_greenoperation_ex_async(
        self,
        request: stlr_models.AddEcarGreenoperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AddEcarGreenoperationResponse:
        """
        Description: 录入绿色行为数据，支持绿色定义或电子发票等多种绿色行为类型的数据提交
        Summary: 录入绿色行为数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AddEcarGreenoperationResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.greenoperation.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_ecar_greenoperation(
        self,
        request: stlr_models.CountEcarGreenoperationRequest,
    ) -> stlr_models.CountEcarGreenoperationResponse:
        """
        Description: 统计绿色行为数据，返回时间范围内的、按绿色行为类型统计的绿色行为数据
        Summary: 统计绿色行为数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_ecar_greenoperation_ex(request, headers, runtime)

    async def count_ecar_greenoperation_async(
        self,
        request: stlr_models.CountEcarGreenoperationRequest,
    ) -> stlr_models.CountEcarGreenoperationResponse:
        """
        Description: 统计绿色行为数据，返回时间范围内的、按绿色行为类型统计的绿色行为数据
        Summary: 统计绿色行为数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_ecar_greenoperation_ex_async(request, headers, runtime)

    def count_ecar_greenoperation_ex(
        self,
        request: stlr_models.CountEcarGreenoperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.CountEcarGreenoperationResponse:
        """
        Description: 统计绿色行为数据，返回时间范围内的、按绿色行为类型统计的绿色行为数据
        Summary: 统计绿色行为数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.CountEcarGreenoperationResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.greenoperation.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_ecar_greenoperation_ex_async(
        self,
        request: stlr_models.CountEcarGreenoperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.CountEcarGreenoperationResponse:
        """
        Description: 统计绿色行为数据，返回时间范围内的、按绿色行为类型统计的绿色行为数据
        Summary: 统计绿色行为数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.CountEcarGreenoperationResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.greenoperation.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_ecar_greenoperation(
        self,
        request: stlr_models.ListEcarGreenoperationRequest,
    ) -> stlr_models.ListEcarGreenoperationResponse:
        """
        Description: 查询最近发生的绿色行为数据列表，按照请求的记录条数限制查询最近的绿色数据
        Summary: 查询最近的绿色行为数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_ecar_greenoperation_ex(request, headers, runtime)

    async def list_ecar_greenoperation_async(
        self,
        request: stlr_models.ListEcarGreenoperationRequest,
    ) -> stlr_models.ListEcarGreenoperationResponse:
        """
        Description: 查询最近发生的绿色行为数据列表，按照请求的记录条数限制查询最近的绿色数据
        Summary: 查询最近的绿色行为数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_ecar_greenoperation_ex_async(request, headers, runtime)

    def list_ecar_greenoperation_ex(
        self,
        request: stlr_models.ListEcarGreenoperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.ListEcarGreenoperationResponse:
        """
        Description: 查询最近发生的绿色行为数据列表，按照请求的记录条数限制查询最近的绿色数据
        Summary: 查询最近的绿色行为数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.ListEcarGreenoperationResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.greenoperation.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_ecar_greenoperation_ex_async(
        self,
        request: stlr_models.ListEcarGreenoperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.ListEcarGreenoperationResponse:
        """
        Description: 查询最近发生的绿色行为数据列表，按照请求的记录条数限制查询最近的绿色数据
        Summary: 查询最近的绿色行为数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.ListEcarGreenoperationResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.greenoperation.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def preview_ecar_avitivedata(
        self,
        request: stlr_models.PreviewEcarAvitivedataRequest,
    ) -> stlr_models.PreviewEcarAvitivedataResponse:
        """
        Description: 按年度统计排放数据，用于一般的总的预览页展示数据
        Summary: 预览本年度排放统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.preview_ecar_avitivedata_ex(request, headers, runtime)

    async def preview_ecar_avitivedata_async(
        self,
        request: stlr_models.PreviewEcarAvitivedataRequest,
    ) -> stlr_models.PreviewEcarAvitivedataResponse:
        """
        Description: 按年度统计排放数据，用于一般的总的预览页展示数据
        Summary: 预览本年度排放统计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.preview_ecar_avitivedata_ex_async(request, headers, runtime)

    def preview_ecar_avitivedata_ex(
        self,
        request: stlr_models.PreviewEcarAvitivedataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.PreviewEcarAvitivedataResponse:
        """
        Description: 按年度统计排放数据，用于一般的总的预览页展示数据
        Summary: 预览本年度排放统计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.PreviewEcarAvitivedataResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.avitivedata.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def preview_ecar_avitivedata_ex_async(
        self,
        request: stlr_models.PreviewEcarAvitivedataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.PreviewEcarAvitivedataResponse:
        """
        Description: 按年度统计排放数据，用于一般的总的预览页展示数据
        Summary: 预览本年度排放统计
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.PreviewEcarAvitivedataResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.avitivedata.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_third_cert(
        self,
        request: stlr_models.QueryThirdCertRequest,
    ) -> stlr_models.QueryThirdCertResponse:
        """
        Description: 三方平台调用此接口，查询用户的证书信息
        Summary: 证书查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_third_cert_ex(request, headers, runtime)

    async def query_third_cert_async(
        self,
        request: stlr_models.QueryThirdCertRequest,
    ) -> stlr_models.QueryThirdCertResponse:
        """
        Description: 三方平台调用此接口，查询用户的证书信息
        Summary: 证书查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_third_cert_ex_async(request, headers, runtime)

    def query_third_cert_ex(
        self,
        request: stlr_models.QueryThirdCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryThirdCertResponse:
        """
        Description: 三方平台调用此接口，查询用户的证书信息
        Summary: 证书查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryThirdCertResponse(),
            self.do_request('1.0', 'antchain.carbon.third.cert.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_third_cert_ex_async(
        self,
        request: stlr_models.QueryThirdCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryThirdCertResponse:
        """
        Description: 三方平台调用此接口，查询用户的证书信息
        Summary: 证书查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryThirdCertResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.third.cert.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: stlr_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> stlr_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: stlr_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> stlr_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: stlr_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: stlr_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
