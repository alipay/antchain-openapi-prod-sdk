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
            # 阶段评估明细数据
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
                    'sdk_version': '2.11.4',
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
            # 阶段评估明细数据
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
                    'sdk_version': '2.11.4',
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

    def add_pdcp_auth(
        self,
        request: stlr_models.AddPdcpAuthRequest,
    ) -> stlr_models.AddPdcpAuthResponse:
        """
        Description: 新增授权接口
        Summary: 新增授权接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_pdcp_auth_ex(request, headers, runtime)

    async def add_pdcp_auth_async(
        self,
        request: stlr_models.AddPdcpAuthRequest,
    ) -> stlr_models.AddPdcpAuthResponse:
        """
        Description: 新增授权接口
        Summary: 新增授权接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_pdcp_auth_ex_async(request, headers, runtime)

    def add_pdcp_auth_ex(
        self,
        request: stlr_models.AddPdcpAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AddPdcpAuthResponse:
        """
        Description: 新增授权接口
        Summary: 新增授权接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AddPdcpAuthResponse(),
            self.do_request('1.0', 'antchain.carbon.pdcp.auth.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_pdcp_auth_ex_async(
        self,
        request: stlr_models.AddPdcpAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AddPdcpAuthResponse:
        """
        Description: 新增授权接口
        Summary: 新增授权接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AddPdcpAuthResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.pdcp.auth.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_pdcp_auth(
        self,
        request: stlr_models.UpdatePdcpAuthRequest,
    ) -> stlr_models.UpdatePdcpAuthResponse:
        """
        Description: 授权取消、授权审批接口
        Summary: 授权接口变更
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_pdcp_auth_ex(request, headers, runtime)

    async def update_pdcp_auth_async(
        self,
        request: stlr_models.UpdatePdcpAuthRequest,
    ) -> stlr_models.UpdatePdcpAuthResponse:
        """
        Description: 授权取消、授权审批接口
        Summary: 授权接口变更
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_pdcp_auth_ex_async(request, headers, runtime)

    def update_pdcp_auth_ex(
        self,
        request: stlr_models.UpdatePdcpAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.UpdatePdcpAuthResponse:
        """
        Description: 授权取消、授权审批接口
        Summary: 授权接口变更
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.UpdatePdcpAuthResponse(),
            self.do_request('1.0', 'antchain.carbon.pdcp.auth.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_pdcp_auth_ex_async(
        self,
        request: stlr_models.UpdatePdcpAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.UpdatePdcpAuthResponse:
        """
        Description: 授权取消、授权审批接口
        Summary: 授权接口变更
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.UpdatePdcpAuthResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.pdcp.auth.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_gateway_account(
        self,
        request: stlr_models.QueryGatewayAccountRequest,
    ) -> stlr_models.QueryGatewayAccountResponse:
        """
        Description: 路由账户查询接口
        Summary: 路由账户查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_gateway_account_ex(request, headers, runtime)

    async def query_gateway_account_async(
        self,
        request: stlr_models.QueryGatewayAccountRequest,
    ) -> stlr_models.QueryGatewayAccountResponse:
        """
        Description: 路由账户查询接口
        Summary: 路由账户查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_gateway_account_ex_async(request, headers, runtime)

    def query_gateway_account_ex(
        self,
        request: stlr_models.QueryGatewayAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryGatewayAccountResponse:
        """
        Description: 路由账户查询接口
        Summary: 路由账户查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryGatewayAccountResponse(),
            self.do_request('1.0', 'antchain.carbon.gateway.account.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_gateway_account_ex_async(
        self,
        request: stlr_models.QueryGatewayAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryGatewayAccountResponse:
        """
        Description: 路由账户查询接口
        Summary: 路由账户查询接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryGatewayAccountResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.gateway.account.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pdcp_auth(
        self,
        request: stlr_models.QueryPdcpAuthRequest,
    ) -> stlr_models.QueryPdcpAuthResponse:
        """
        Description: 授权记录查询
        Summary: 授权记录查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pdcp_auth_ex(request, headers, runtime)

    async def query_pdcp_auth_async(
        self,
        request: stlr_models.QueryPdcpAuthRequest,
    ) -> stlr_models.QueryPdcpAuthResponse:
        """
        Description: 授权记录查询
        Summary: 授权记录查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pdcp_auth_ex_async(request, headers, runtime)

    def query_pdcp_auth_ex(
        self,
        request: stlr_models.QueryPdcpAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryPdcpAuthResponse:
        """
        Description: 授权记录查询
        Summary: 授权记录查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryPdcpAuthResponse(),
            self.do_request('1.0', 'antchain.carbon.pdcp.auth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pdcp_auth_ex_async(
        self,
        request: stlr_models.QueryPdcpAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryPdcpAuthResponse:
        """
        Description: 授权记录查询
        Summary: 授权记录查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryPdcpAuthResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.pdcp.auth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pdcp_data(
        self,
        request: stlr_models.QueryPdcpDataRequest,
    ) -> stlr_models.QueryPdcpDataResponse:
        """
        Description: 授权数据查询
        Summary: 授权数据查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pdcp_data_ex(request, headers, runtime)

    async def query_pdcp_data_async(
        self,
        request: stlr_models.QueryPdcpDataRequest,
    ) -> stlr_models.QueryPdcpDataResponse:
        """
        Description: 授权数据查询
        Summary: 授权数据查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pdcp_data_ex_async(request, headers, runtime)

    def query_pdcp_data_ex(
        self,
        request: stlr_models.QueryPdcpDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryPdcpDataResponse:
        """
        Description: 授权数据查询
        Summary: 授权数据查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryPdcpDataResponse(),
            self.do_request('1.0', 'antchain.carbon.pdcp.data.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pdcp_data_ex_async(
        self,
        request: stlr_models.QueryPdcpDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryPdcpDataResponse:
        """
        Description: 授权数据查询
        Summary: 授权数据查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryPdcpDataResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.pdcp.data.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_pdcp_deposit(
        self,
        request: stlr_models.DetailPdcpDepositRequest,
    ) -> stlr_models.DetailPdcpDepositResponse:
        """
        Description: 查询存证数据详情，包括存证内容、存证数据值、存证状态、存证交易等信息。 若指定版本，返回指定版本；若未指定，返回最新版本。
        Summary: 查询存证数据详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_pdcp_deposit_ex(request, headers, runtime)

    async def detail_pdcp_deposit_async(
        self,
        request: stlr_models.DetailPdcpDepositRequest,
    ) -> stlr_models.DetailPdcpDepositResponse:
        """
        Description: 查询存证数据详情，包括存证内容、存证数据值、存证状态、存证交易等信息。 若指定版本，返回指定版本；若未指定，返回最新版本。
        Summary: 查询存证数据详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_pdcp_deposit_ex_async(request, headers, runtime)

    def detail_pdcp_deposit_ex(
        self,
        request: stlr_models.DetailPdcpDepositRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DetailPdcpDepositResponse:
        """
        Description: 查询存证数据详情，包括存证内容、存证数据值、存证状态、存证交易等信息。 若指定版本，返回指定版本；若未指定，返回最新版本。
        Summary: 查询存证数据详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DetailPdcpDepositResponse(),
            self.do_request('1.0', 'antchain.carbon.pdcp.deposit.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_pdcp_deposit_ex_async(
        self,
        request: stlr_models.DetailPdcpDepositRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DetailPdcpDepositResponse:
        """
        Description: 查询存证数据详情，包括存证内容、存证数据值、存证状态、存证交易等信息。 若指定版本，返回指定版本；若未指定，返回最新版本。
        Summary: 查询存证数据详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DetailPdcpDepositResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.pdcp.deposit.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pdcp_dtrace(
        self,
        request: stlr_models.QueryPdcpDtraceRequest,
    ) -> stlr_models.QueryPdcpDtraceResponse:
        """
        Description: 查询存证数据历史变更
        Summary: 存证数据变更历史追溯查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pdcp_dtrace_ex(request, headers, runtime)

    async def query_pdcp_dtrace_async(
        self,
        request: stlr_models.QueryPdcpDtraceRequest,
    ) -> stlr_models.QueryPdcpDtraceResponse:
        """
        Description: 查询存证数据历史变更
        Summary: 存证数据变更历史追溯查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pdcp_dtrace_ex_async(request, headers, runtime)

    def query_pdcp_dtrace_ex(
        self,
        request: stlr_models.QueryPdcpDtraceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryPdcpDtraceResponse:
        """
        Description: 查询存证数据历史变更
        Summary: 存证数据变更历史追溯查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryPdcpDtraceResponse(),
            self.do_request('1.0', 'antchain.carbon.pdcp.dtrace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pdcp_dtrace_ex_async(
        self,
        request: stlr_models.QueryPdcpDtraceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryPdcpDtraceResponse:
        """
        Description: 查询存证数据历史变更
        Summary: 存证数据变更历史追溯查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryPdcpDtraceResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.pdcp.dtrace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_pdcp_dtrace(
        self,
        request: stlr_models.CheckPdcpDtraceRequest,
    ) -> stlr_models.CheckPdcpDtraceResponse:
        """
        Description: 通过链山存证内容校验存证数据可信性
        Summary: 存证数据可信校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_pdcp_dtrace_ex(request, headers, runtime)

    async def check_pdcp_dtrace_async(
        self,
        request: stlr_models.CheckPdcpDtraceRequest,
    ) -> stlr_models.CheckPdcpDtraceResponse:
        """
        Description: 通过链山存证内容校验存证数据可信性
        Summary: 存证数据可信校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_pdcp_dtrace_ex_async(request, headers, runtime)

    def check_pdcp_dtrace_ex(
        self,
        request: stlr_models.CheckPdcpDtraceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.CheckPdcpDtraceResponse:
        """
        Description: 通过链山存证内容校验存证数据可信性
        Summary: 存证数据可信校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.CheckPdcpDtraceResponse(),
            self.do_request('1.0', 'antchain.carbon.pdcp.dtrace.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_pdcp_dtrace_ex_async(
        self,
        request: stlr_models.CheckPdcpDtraceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.CheckPdcpDtraceResponse:
        """
        Description: 通过链山存证内容校验存证数据可信性
        Summary: 存证数据可信校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.CheckPdcpDtraceResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.pdcp.dtrace.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_pdcp_data(
        self,
        request: stlr_models.BatchqueryPdcpDataRequest,
    ) -> stlr_models.BatchqueryPdcpDataResponse:
        """
        Description: 根据授权方和被授权方授权关系批量查询授权数据
        Summary: 批量查询授权数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_pdcp_data_ex(request, headers, runtime)

    async def batchquery_pdcp_data_async(
        self,
        request: stlr_models.BatchqueryPdcpDataRequest,
    ) -> stlr_models.BatchqueryPdcpDataResponse:
        """
        Description: 根据授权方和被授权方授权关系批量查询授权数据
        Summary: 批量查询授权数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_pdcp_data_ex_async(request, headers, runtime)

    def batchquery_pdcp_data_ex(
        self,
        request: stlr_models.BatchqueryPdcpDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.BatchqueryPdcpDataResponse:
        """
        Description: 根据授权方和被授权方授权关系批量查询授权数据
        Summary: 批量查询授权数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.BatchqueryPdcpDataResponse(),
            self.do_request('1.0', 'antchain.carbon.pdcp.data.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_pdcp_data_ex_async(
        self,
        request: stlr_models.BatchqueryPdcpDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.BatchqueryPdcpDataResponse:
        """
        Description: 根据授权方和被授权方授权关系批量查询授权数据
        Summary: 批量查询授权数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.BatchqueryPdcpDataResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.pdcp.data.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pdcp_owndata(
        self,
        request: stlr_models.QueryPdcpOwndataRequest,
    ) -> stlr_models.QueryPdcpOwndataResponse:
        """
        Description: 查询用户拥有的数据记录
        Summary: 查询拥有的数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pdcp_owndata_ex(request, headers, runtime)

    async def query_pdcp_owndata_async(
        self,
        request: stlr_models.QueryPdcpOwndataRequest,
    ) -> stlr_models.QueryPdcpOwndataResponse:
        """
        Description: 查询用户拥有的数据记录
        Summary: 查询拥有的数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pdcp_owndata_ex_async(request, headers, runtime)

    def query_pdcp_owndata_ex(
        self,
        request: stlr_models.QueryPdcpOwndataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryPdcpOwndataResponse:
        """
        Description: 查询用户拥有的数据记录
        Summary: 查询拥有的数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryPdcpOwndataResponse(),
            self.do_request('1.0', 'antchain.carbon.pdcp.owndata.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pdcp_owndata_ex_async(
        self,
        request: stlr_models.QueryPdcpOwndataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryPdcpOwndataResponse:
        """
        Description: 查询用户拥有的数据记录
        Summary: 查询拥有的数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryPdcpOwndataResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.pdcp.owndata.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_pdcp_dataasset(
        self,
        request: stlr_models.QueryPdcpDataassetRequest,
    ) -> stlr_models.QueryPdcpDataassetResponse:
        """
        Description: 分页查询数据资产
        Summary: 数据资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_pdcp_dataasset_ex(request, headers, runtime)

    async def query_pdcp_dataasset_async(
        self,
        request: stlr_models.QueryPdcpDataassetRequest,
    ) -> stlr_models.QueryPdcpDataassetResponse:
        """
        Description: 分页查询数据资产
        Summary: 数据资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_pdcp_dataasset_ex_async(request, headers, runtime)

    def query_pdcp_dataasset_ex(
        self,
        request: stlr_models.QueryPdcpDataassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryPdcpDataassetResponse:
        """
        Description: 分页查询数据资产
        Summary: 数据资产
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryPdcpDataassetResponse(),
            self.do_request('1.0', 'antchain.carbon.pdcp.dataasset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_pdcp_dataasset_ex_async(
        self,
        request: stlr_models.QueryPdcpDataassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryPdcpDataassetResponse:
        """
        Description: 分页查询数据资产
        Summary: 数据资产
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryPdcpDataassetResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.pdcp.dataasset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_pdcp_dataasset(
        self,
        request: stlr_models.RegisterPdcpDataassetRequest,
    ) -> stlr_models.RegisterPdcpDataassetResponse:
        """
        Description: 注册数据资产
        Summary: 注册数据资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_pdcp_dataasset_ex(request, headers, runtime)

    async def register_pdcp_dataasset_async(
        self,
        request: stlr_models.RegisterPdcpDataassetRequest,
    ) -> stlr_models.RegisterPdcpDataassetResponse:
        """
        Description: 注册数据资产
        Summary: 注册数据资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_pdcp_dataasset_ex_async(request, headers, runtime)

    def register_pdcp_dataasset_ex(
        self,
        request: stlr_models.RegisterPdcpDataassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.RegisterPdcpDataassetResponse:
        """
        Description: 注册数据资产
        Summary: 注册数据资产
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.RegisterPdcpDataassetResponse(),
            self.do_request('1.0', 'antchain.carbon.pdcp.dataasset.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_pdcp_dataasset_ex_async(
        self,
        request: stlr_models.RegisterPdcpDataassetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.RegisterPdcpDataassetResponse:
        """
        Description: 注册数据资产
        Summary: 注册数据资产
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.RegisterPdcpDataassetResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.pdcp.dataasset.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_auth_admin(
        self,
        request: stlr_models.AddAuthAdminRequest,
    ) -> stlr_models.AddAuthAdminResponse:
        """
        Description: 添加数据授权策略
        Summary: 添加数据授权策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_auth_admin_ex(request, headers, runtime)

    async def add_auth_admin_async(
        self,
        request: stlr_models.AddAuthAdminRequest,
    ) -> stlr_models.AddAuthAdminResponse:
        """
        Description: 添加数据授权策略
        Summary: 添加数据授权策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_auth_admin_ex_async(request, headers, runtime)

    def add_auth_admin_ex(
        self,
        request: stlr_models.AddAuthAdminRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AddAuthAdminResponse:
        """
        Description: 添加数据授权策略
        Summary: 添加数据授权策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AddAuthAdminResponse(),
            self.do_request('1.0', 'antchain.carbon.auth.admin.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_auth_admin_ex_async(
        self,
        request: stlr_models.AddAuthAdminRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AddAuthAdminResponse:
        """
        Description: 添加数据授权策略
        Summary: 添加数据授权策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AddAuthAdminResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.auth.admin.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_auth_admin(
        self,
        request: stlr_models.PagequeryAuthAdminRequest,
    ) -> stlr_models.PagequeryAuthAdminResponse:
        """
        Description: 分页查询数据授权策略
        Summary: 分页查询数据授权策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_auth_admin_ex(request, headers, runtime)

    async def pagequery_auth_admin_async(
        self,
        request: stlr_models.PagequeryAuthAdminRequest,
    ) -> stlr_models.PagequeryAuthAdminResponse:
        """
        Description: 分页查询数据授权策略
        Summary: 分页查询数据授权策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_auth_admin_ex_async(request, headers, runtime)

    def pagequery_auth_admin_ex(
        self,
        request: stlr_models.PagequeryAuthAdminRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.PagequeryAuthAdminResponse:
        """
        Description: 分页查询数据授权策略
        Summary: 分页查询数据授权策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.PagequeryAuthAdminResponse(),
            self.do_request('1.0', 'antchain.carbon.auth.admin.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_auth_admin_ex_async(
        self,
        request: stlr_models.PagequeryAuthAdminRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.PagequeryAuthAdminResponse:
        """
        Description: 分页查询数据授权策略
        Summary: 分页查询数据授权策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.PagequeryAuthAdminResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.auth.admin.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_auth_admin(
        self,
        request: stlr_models.QueryAuthAdminRequest,
    ) -> stlr_models.QueryAuthAdminResponse:
        """
        Description: 查询数据授权策略
        Summary: 查询数据授权策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_auth_admin_ex(request, headers, runtime)

    async def query_auth_admin_async(
        self,
        request: stlr_models.QueryAuthAdminRequest,
    ) -> stlr_models.QueryAuthAdminResponse:
        """
        Description: 查询数据授权策略
        Summary: 查询数据授权策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_auth_admin_ex_async(request, headers, runtime)

    def query_auth_admin_ex(
        self,
        request: stlr_models.QueryAuthAdminRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryAuthAdminResponse:
        """
        Description: 查询数据授权策略
        Summary: 查询数据授权策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryAuthAdminResponse(),
            self.do_request('1.0', 'antchain.carbon.auth.admin.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_auth_admin_ex_async(
        self,
        request: stlr_models.QueryAuthAdminRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryAuthAdminResponse:
        """
        Description: 查询数据授权策略
        Summary: 查询数据授权策略
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryAuthAdminResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.auth.admin.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_dataasset_type(
        self,
        request: stlr_models.AddDataassetTypeRequest,
    ) -> stlr_models.AddDataassetTypeResponse:
        """
        Description: 数据资产添加数据类型
        Summary: 添加数据类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_dataasset_type_ex(request, headers, runtime)

    async def add_dataasset_type_async(
        self,
        request: stlr_models.AddDataassetTypeRequest,
    ) -> stlr_models.AddDataassetTypeResponse:
        """
        Description: 数据资产添加数据类型
        Summary: 添加数据类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_dataasset_type_ex_async(request, headers, runtime)

    def add_dataasset_type_ex(
        self,
        request: stlr_models.AddDataassetTypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AddDataassetTypeResponse:
        """
        Description: 数据资产添加数据类型
        Summary: 添加数据类型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AddDataassetTypeResponse(),
            self.do_request('1.0', 'antchain.carbon.dataasset.type.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_dataasset_type_ex_async(
        self,
        request: stlr_models.AddDataassetTypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AddDataassetTypeResponse:
        """
        Description: 数据资产添加数据类型
        Summary: 添加数据类型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AddDataassetTypeResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.dataasset.type.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_dataasset_type(
        self,
        request: stlr_models.PagequeryDataassetTypeRequest,
    ) -> stlr_models.PagequeryDataassetTypeResponse:
        """
        Description: 分页查询数据资产类型
        Summary: 分页查询数据资产类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_dataasset_type_ex(request, headers, runtime)

    async def pagequery_dataasset_type_async(
        self,
        request: stlr_models.PagequeryDataassetTypeRequest,
    ) -> stlr_models.PagequeryDataassetTypeResponse:
        """
        Description: 分页查询数据资产类型
        Summary: 分页查询数据资产类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_dataasset_type_ex_async(request, headers, runtime)

    def pagequery_dataasset_type_ex(
        self,
        request: stlr_models.PagequeryDataassetTypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.PagequeryDataassetTypeResponse:
        """
        Description: 分页查询数据资产类型
        Summary: 分页查询数据资产类型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.PagequeryDataassetTypeResponse(),
            self.do_request('1.0', 'antchain.carbon.dataasset.type.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_dataasset_type_ex_async(
        self,
        request: stlr_models.PagequeryDataassetTypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.PagequeryDataassetTypeResponse:
        """
        Description: 分页查询数据资产类型
        Summary: 分页查询数据资产类型
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.PagequeryDataassetTypeResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.dataasset.type.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_dataset_collecting(
        self,
        request: stlr_models.StartDatasetCollectingRequest,
    ) -> stlr_models.StartDatasetCollectingResponse:
        """
        Description: 启动数据采集任务，从外部数据读取数据并记录到可信存证
        Summary: 开始采集外部数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_dataset_collecting_ex(request, headers, runtime)

    async def start_dataset_collecting_async(
        self,
        request: stlr_models.StartDatasetCollectingRequest,
    ) -> stlr_models.StartDatasetCollectingResponse:
        """
        Description: 启动数据采集任务，从外部数据读取数据并记录到可信存证
        Summary: 开始采集外部数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_dataset_collecting_ex_async(request, headers, runtime)

    def start_dataset_collecting_ex(
        self,
        request: stlr_models.StartDatasetCollectingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.StartDatasetCollectingResponse:
        """
        Description: 启动数据采集任务，从外部数据读取数据并记录到可信存证
        Summary: 开始采集外部数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.StartDatasetCollectingResponse(),
            self.do_request('1.0', 'antchain.carbon.dataset.collecting.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_dataset_collecting_ex_async(
        self,
        request: stlr_models.StartDatasetCollectingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.StartDatasetCollectingResponse:
        """
        Description: 启动数据采集任务，从外部数据读取数据并记录到可信存证
        Summary: 开始采集外部数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.StartDatasetCollectingResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.dataset.collecting.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dataset_collecting(
        self,
        request: stlr_models.QueryDatasetCollectingRequest,
    ) -> stlr_models.QueryDatasetCollectingResponse:
        """
        Description: 查询外部数据采集状态
        Summary: 查询外部数据采集状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dataset_collecting_ex(request, headers, runtime)

    async def query_dataset_collecting_async(
        self,
        request: stlr_models.QueryDatasetCollectingRequest,
    ) -> stlr_models.QueryDatasetCollectingResponse:
        """
        Description: 查询外部数据采集状态
        Summary: 查询外部数据采集状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dataset_collecting_ex_async(request, headers, runtime)

    def query_dataset_collecting_ex(
        self,
        request: stlr_models.QueryDatasetCollectingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryDatasetCollectingResponse:
        """
        Description: 查询外部数据采集状态
        Summary: 查询外部数据采集状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryDatasetCollectingResponse(),
            self.do_request('1.0', 'antchain.carbon.dataset.collecting.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dataset_collecting_ex_async(
        self,
        request: stlr_models.QueryDatasetCollectingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryDatasetCollectingResponse:
        """
        Description: 查询外部数据采集状态
        Summary: 查询外部数据采集状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryDatasetCollectingResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.dataset.collecting.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
            request.file_object = None
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
            request.file_object = None
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

    def register_ecar_enterprisemember(
        self,
        request: stlr_models.RegisterEcarEnterprisememberRequest,
    ) -> stlr_models.RegisterEcarEnterprisememberResponse:
        """
        Description: 机构会员注册接口，支持根据蚂蚁DID或者姓名+密码注意企业的终端会员
        Summary: 机构会员注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_ecar_enterprisemember_ex(request, headers, runtime)

    async def register_ecar_enterprisemember_async(
        self,
        request: stlr_models.RegisterEcarEnterprisememberRequest,
    ) -> stlr_models.RegisterEcarEnterprisememberResponse:
        """
        Description: 机构会员注册接口，支持根据蚂蚁DID或者姓名+密码注意企业的终端会员
        Summary: 机构会员注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_ecar_enterprisemember_ex_async(request, headers, runtime)

    def register_ecar_enterprisemember_ex(
        self,
        request: stlr_models.RegisterEcarEnterprisememberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.RegisterEcarEnterprisememberResponse:
        """
        Description: 机构会员注册接口，支持根据蚂蚁DID或者姓名+密码注意企业的终端会员
        Summary: 机构会员注册
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.RegisterEcarEnterprisememberResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.enterprisemember.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_ecar_enterprisemember_ex_async(
        self,
        request: stlr_models.RegisterEcarEnterprisememberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.RegisterEcarEnterprisememberResponse:
        """
        Description: 机构会员注册接口，支持根据蚂蚁DID或者姓名+密码注意企业的终端会员
        Summary: 机构会员注册
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.RegisterEcarEnterprisememberResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.enterprisemember.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_ecar_offsetacquisition(
        self,
        request: stlr_models.AddEcarOffsetacquisitionRequest,
    ) -> stlr_models.AddEcarOffsetacquisitionResponse:
        """
        Description: 碳补偿数据采集，提供给碳普惠业务相关接口，外围系统提交碳普惠数据
        Summary: 碳补偿数据采集
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_ecar_offsetacquisition_ex(request, headers, runtime)

    async def add_ecar_offsetacquisition_async(
        self,
        request: stlr_models.AddEcarOffsetacquisitionRequest,
    ) -> stlr_models.AddEcarOffsetacquisitionResponse:
        """
        Description: 碳补偿数据采集，提供给碳普惠业务相关接口，外围系统提交碳普惠数据
        Summary: 碳补偿数据采集
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_ecar_offsetacquisition_ex_async(request, headers, runtime)

    def add_ecar_offsetacquisition_ex(
        self,
        request: stlr_models.AddEcarOffsetacquisitionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AddEcarOffsetacquisitionResponse:
        """
        Description: 碳补偿数据采集，提供给碳普惠业务相关接口，外围系统提交碳普惠数据
        Summary: 碳补偿数据采集
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AddEcarOffsetacquisitionResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.offsetacquisition.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_ecar_offsetacquisition_ex_async(
        self,
        request: stlr_models.AddEcarOffsetacquisitionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AddEcarOffsetacquisitionResponse:
        """
        Description: 碳补偿数据采集，提供给碳普惠业务相关接口，外围系统提交碳普惠数据
        Summary: 碳补偿数据采集
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AddEcarOffsetacquisitionResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.offsetacquisition.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_ecar_offsettranslate(
        self,
        request: stlr_models.AddEcarOffsettranslateRequest,
    ) -> stlr_models.AddEcarOffsettranslateResponse:
        """
        Description: 碳普惠减碳量转移，减碳量在业务端兑换成权益的场景时可使用此接口
        Summary: 碳普惠减碳量转移
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_ecar_offsettranslate_ex(request, headers, runtime)

    async def add_ecar_offsettranslate_async(
        self,
        request: stlr_models.AddEcarOffsettranslateRequest,
    ) -> stlr_models.AddEcarOffsettranslateResponse:
        """
        Description: 碳普惠减碳量转移，减碳量在业务端兑换成权益的场景时可使用此接口
        Summary: 碳普惠减碳量转移
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_ecar_offsettranslate_ex_async(request, headers, runtime)

    def add_ecar_offsettranslate_ex(
        self,
        request: stlr_models.AddEcarOffsettranslateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AddEcarOffsettranslateResponse:
        """
        Description: 碳普惠减碳量转移，减碳量在业务端兑换成权益的场景时可使用此接口
        Summary: 碳普惠减碳量转移
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AddEcarOffsettranslateResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.offsettranslate.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_ecar_offsettranslate_ex_async(
        self,
        request: stlr_models.AddEcarOffsettranslateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AddEcarOffsettranslateResponse:
        """
        Description: 碳普惠减碳量转移，减碳量在业务端兑换成权益的场景时可使用此接口
        Summary: 碳普惠减碳量转移
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AddEcarOffsettranslateResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.offsettranslate.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_ecar_offsetdatum(
        self,
        request: stlr_models.AuthEcarOffsetdatumRequest,
    ) -> stlr_models.AuthEcarOffsetdatumResponse:
        """
        Description: 碳普惠数据授权，授权三方平台租户可访问相关平台方会员的碳普惠数据
        Summary: 碳普惠数据授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_ecar_offsetdatum_ex(request, headers, runtime)

    async def auth_ecar_offsetdatum_async(
        self,
        request: stlr_models.AuthEcarOffsetdatumRequest,
    ) -> stlr_models.AuthEcarOffsetdatumResponse:
        """
        Description: 碳普惠数据授权，授权三方平台租户可访问相关平台方会员的碳普惠数据
        Summary: 碳普惠数据授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_ecar_offsetdatum_ex_async(request, headers, runtime)

    def auth_ecar_offsetdatum_ex(
        self,
        request: stlr_models.AuthEcarOffsetdatumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AuthEcarOffsetdatumResponse:
        """
        Description: 碳普惠数据授权，授权三方平台租户可访问相关平台方会员的碳普惠数据
        Summary: 碳普惠数据授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AuthEcarOffsetdatumResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.offsetdatum.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_ecar_offsetdatum_ex_async(
        self,
        request: stlr_models.AuthEcarOffsetdatumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AuthEcarOffsetdatumResponse:
        """
        Description: 碳普惠数据授权，授权三方平台租户可访问相关平台方会员的碳普惠数据
        Summary: 碳普惠数据授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AuthEcarOffsetdatumResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.offsetdatum.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_ecar_offsetdatum(
        self,
        request: stlr_models.ListEcarOffsetdatumRequest,
    ) -> stlr_models.ListEcarOffsetdatumResponse:
        """
        Description: 碳普惠数据列表查询，根据账户DID和日期查询碳补偿数据
        Summary: 碳普惠数据列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_ecar_offsetdatum_ex(request, headers, runtime)

    async def list_ecar_offsetdatum_async(
        self,
        request: stlr_models.ListEcarOffsetdatumRequest,
    ) -> stlr_models.ListEcarOffsetdatumResponse:
        """
        Description: 碳普惠数据列表查询，根据账户DID和日期查询碳补偿数据
        Summary: 碳普惠数据列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_ecar_offsetdatum_ex_async(request, headers, runtime)

    def list_ecar_offsetdatum_ex(
        self,
        request: stlr_models.ListEcarOffsetdatumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.ListEcarOffsetdatumResponse:
        """
        Description: 碳普惠数据列表查询，根据账户DID和日期查询碳补偿数据
        Summary: 碳普惠数据列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.ListEcarOffsetdatumResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.offsetdatum.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_ecar_offsetdatum_ex_async(
        self,
        request: stlr_models.ListEcarOffsetdatumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.ListEcarOffsetdatumResponse:
        """
        Description: 碳普惠数据列表查询，根据账户DID和日期查询碳补偿数据
        Summary: 碳普惠数据列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.ListEcarOffsetdatumResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.offsetdatum.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_ecar_enterprisemember(
        self,
        request: stlr_models.ListEcarEnterprisememberRequest,
    ) -> stlr_models.ListEcarEnterprisememberResponse:
        """
        Description: 机构会员列表查询，支持分页查询指定时间范围内的会员列表，返回结果按照会员注册时间降序排列
        Summary: 机构会员列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_ecar_enterprisemember_ex(request, headers, runtime)

    async def list_ecar_enterprisemember_async(
        self,
        request: stlr_models.ListEcarEnterprisememberRequest,
    ) -> stlr_models.ListEcarEnterprisememberResponse:
        """
        Description: 机构会员列表查询，支持分页查询指定时间范围内的会员列表，返回结果按照会员注册时间降序排列
        Summary: 机构会员列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_ecar_enterprisemember_ex_async(request, headers, runtime)

    def list_ecar_enterprisemember_ex(
        self,
        request: stlr_models.ListEcarEnterprisememberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.ListEcarEnterprisememberResponse:
        """
        Description: 机构会员列表查询，支持分页查询指定时间范围内的会员列表，返回结果按照会员注册时间降序排列
        Summary: 机构会员列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.ListEcarEnterprisememberResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.enterprisemember.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_ecar_enterprisemember_ex_async(
        self,
        request: stlr_models.ListEcarEnterprisememberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.ListEcarEnterprisememberResponse:
        """
        Description: 机构会员列表查询，支持分页查询指定时间范围内的会员列表，返回结果按照会员注册时间降序排列
        Summary: 机构会员列表查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.ListEcarEnterprisememberResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.enterprisemember.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def preview_ecar_offsetdatum(
        self,
        request: stlr_models.PreviewEcarOffsetdatumRequest,
    ) -> stlr_models.PreviewEcarOffsetdatumResponse:
        """
        Description: 碳普惠项目数据预览，包括注册会员数和累积碳能量值
        Summary: 碳普惠项目数据预览
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.preview_ecar_offsetdatum_ex(request, headers, runtime)

    async def preview_ecar_offsetdatum_async(
        self,
        request: stlr_models.PreviewEcarOffsetdatumRequest,
    ) -> stlr_models.PreviewEcarOffsetdatumResponse:
        """
        Description: 碳普惠项目数据预览，包括注册会员数和累积碳能量值
        Summary: 碳普惠项目数据预览
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.preview_ecar_offsetdatum_ex_async(request, headers, runtime)

    def preview_ecar_offsetdatum_ex(
        self,
        request: stlr_models.PreviewEcarOffsetdatumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.PreviewEcarOffsetdatumResponse:
        """
        Description: 碳普惠项目数据预览，包括注册会员数和累积碳能量值
        Summary: 碳普惠项目数据预览
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.PreviewEcarOffsetdatumResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.offsetdatum.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def preview_ecar_offsetdatum_ex_async(
        self,
        request: stlr_models.PreviewEcarOffsetdatumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.PreviewEcarOffsetdatumResponse:
        """
        Description: 碳普惠项目数据预览，包括注册会员数和累积碳能量值
        Summary: 碳普惠项目数据预览
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.PreviewEcarOffsetdatumResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.offsetdatum.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_ecar_enterprisemember(
        self,
        request: stlr_models.DetailEcarEnterprisememberRequest,
    ) -> stlr_models.DetailEcarEnterprisememberResponse:
        """
        Description: 单个机构会员信息查询，根据会员关键信息，如手机号码、身份证号码查询会员资料
        Summary: 单个机构会员信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_ecar_enterprisemember_ex(request, headers, runtime)

    async def detail_ecar_enterprisemember_async(
        self,
        request: stlr_models.DetailEcarEnterprisememberRequest,
    ) -> stlr_models.DetailEcarEnterprisememberResponse:
        """
        Description: 单个机构会员信息查询，根据会员关键信息，如手机号码、身份证号码查询会员资料
        Summary: 单个机构会员信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_ecar_enterprisemember_ex_async(request, headers, runtime)

    def detail_ecar_enterprisemember_ex(
        self,
        request: stlr_models.DetailEcarEnterprisememberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DetailEcarEnterprisememberResponse:
        """
        Description: 单个机构会员信息查询，根据会员关键信息，如手机号码、身份证号码查询会员资料
        Summary: 单个机构会员信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DetailEcarEnterprisememberResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.enterprisemember.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_ecar_enterprisemember_ex_async(
        self,
        request: stlr_models.DetailEcarEnterprisememberRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DetailEcarEnterprisememberResponse:
        """
        Description: 单个机构会员信息查询，根据会员关键信息，如手机号码、身份证号码查询会员资料
        Summary: 单个机构会员信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DetailEcarEnterprisememberResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.enterprisemember.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ecar_offsetaccount(
        self,
        request: stlr_models.QueryEcarOffsetaccountRequest,
    ) -> stlr_models.QueryEcarOffsetaccountResponse:
        """
        Description: 碳补偿项目账户查询，根据账户DID和项目编码查询账户信息
        Summary: 碳补偿项目账户查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ecar_offsetaccount_ex(request, headers, runtime)

    async def query_ecar_offsetaccount_async(
        self,
        request: stlr_models.QueryEcarOffsetaccountRequest,
    ) -> stlr_models.QueryEcarOffsetaccountResponse:
        """
        Description: 碳补偿项目账户查询，根据账户DID和项目编码查询账户信息
        Summary: 碳补偿项目账户查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ecar_offsetaccount_ex_async(request, headers, runtime)

    def query_ecar_offsetaccount_ex(
        self,
        request: stlr_models.QueryEcarOffsetaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryEcarOffsetaccountResponse:
        """
        Description: 碳补偿项目账户查询，根据账户DID和项目编码查询账户信息
        Summary: 碳补偿项目账户查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryEcarOffsetaccountResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.offsetaccount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ecar_offsetaccount_ex_async(
        self,
        request: stlr_models.QueryEcarOffsetaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryEcarOffsetaccountResponse:
        """
        Description: 碳补偿项目账户查询，根据账户DID和项目编码查询账户信息
        Summary: 碳补偿项目账户查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryEcarOffsetaccountResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.offsetaccount.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_ecar_offsetdatum(
        self,
        request: stlr_models.DetailEcarOffsetdatumRequest,
    ) -> stlr_models.DetailEcarOffsetdatumResponse:
        """
        Description: 查询碳补偿数据详情
        Summary: 碳补偿数据详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_ecar_offsetdatum_ex(request, headers, runtime)

    async def detail_ecar_offsetdatum_async(
        self,
        request: stlr_models.DetailEcarOffsetdatumRequest,
    ) -> stlr_models.DetailEcarOffsetdatumResponse:
        """
        Description: 查询碳补偿数据详情
        Summary: 碳补偿数据详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_ecar_offsetdatum_ex_async(request, headers, runtime)

    def detail_ecar_offsetdatum_ex(
        self,
        request: stlr_models.DetailEcarOffsetdatumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DetailEcarOffsetdatumResponse:
        """
        Description: 查询碳补偿数据详情
        Summary: 碳补偿数据详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DetailEcarOffsetdatumResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.offsetdatum.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_ecar_offsetdatum_ex_async(
        self,
        request: stlr_models.DetailEcarOffsetdatumRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DetailEcarOffsetdatumResponse:
        """
        Description: 查询碳补偿数据详情
        Summary: 碳补偿数据详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DetailEcarOffsetdatumResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.offsetdatum.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_ecar_offsettranslate(
        self,
        request: stlr_models.DetailEcarOffsettranslateRequest,
    ) -> stlr_models.DetailEcarOffsettranslateResponse:
        """
        Description: 查询碳普惠减碳量转移记录详情
        Summary: 碳普惠减碳量转移记录详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_ecar_offsettranslate_ex(request, headers, runtime)

    async def detail_ecar_offsettranslate_async(
        self,
        request: stlr_models.DetailEcarOffsettranslateRequest,
    ) -> stlr_models.DetailEcarOffsettranslateResponse:
        """
        Description: 查询碳普惠减碳量转移记录详情
        Summary: 碳普惠减碳量转移记录详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_ecar_offsettranslate_ex_async(request, headers, runtime)

    def detail_ecar_offsettranslate_ex(
        self,
        request: stlr_models.DetailEcarOffsettranslateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DetailEcarOffsettranslateResponse:
        """
        Description: 查询碳普惠减碳量转移记录详情
        Summary: 碳普惠减碳量转移记录详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DetailEcarOffsettranslateResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.offsettranslate.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_ecar_offsettranslate_ex_async(
        self,
        request: stlr_models.DetailEcarOffsettranslateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DetailEcarOffsettranslateResponse:
        """
        Description: 查询碳普惠减碳量转移记录详情
        Summary: 碳普惠减碳量转移记录详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DetailEcarOffsettranslateResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.offsettranslate.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_ecar_lcaassement(
        self,
        request: stlr_models.SubmitEcarLcaassementRequest,
    ) -> stlr_models.SubmitEcarLcaassementResponse:
        """
        Description: 平台方LCA评估结果提交接口，支持三方平台提交LCA评估结果数据
        Summary: 平台方LCA评估结果提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_ecar_lcaassement_ex(request, headers, runtime)

    async def submit_ecar_lcaassement_async(
        self,
        request: stlr_models.SubmitEcarLcaassementRequest,
    ) -> stlr_models.SubmitEcarLcaassementResponse:
        """
        Description: 平台方LCA评估结果提交接口，支持三方平台提交LCA评估结果数据
        Summary: 平台方LCA评估结果提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_ecar_lcaassement_ex_async(request, headers, runtime)

    def submit_ecar_lcaassement_ex(
        self,
        request: stlr_models.SubmitEcarLcaassementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.SubmitEcarLcaassementResponse:
        """
        Description: 平台方LCA评估结果提交接口，支持三方平台提交LCA评估结果数据
        Summary: 平台方LCA评估结果提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.SubmitEcarLcaassementResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.lcaassement.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_ecar_lcaassement_ex_async(
        self,
        request: stlr_models.SubmitEcarLcaassementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.SubmitEcarLcaassementResponse:
        """
        Description: 平台方LCA评估结果提交接口，支持三方平台提交LCA评估结果数据
        Summary: 平台方LCA评估结果提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.SubmitEcarLcaassementResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.lcaassement.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_ecar_plaformfile(
        self,
        request: stlr_models.UploadEcarPlaformfileRequest,
    ) -> stlr_models.UploadEcarPlaformfileResponse:
        """
        Description: 三方平台文件上传
        Summary: 三方平台文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_ecar_plaformfile_ex(request, headers, runtime)

    async def upload_ecar_plaformfile_async(
        self,
        request: stlr_models.UploadEcarPlaformfileRequest,
    ) -> stlr_models.UploadEcarPlaformfileResponse:
        """
        Description: 三方平台文件上传
        Summary: 三方平台文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_ecar_plaformfile_ex_async(request, headers, runtime)

    def upload_ecar_plaformfile_ex(
        self,
        request: stlr_models.UploadEcarPlaformfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.UploadEcarPlaformfileResponse:
        """
        Description: 三方平台文件上传
        Summary: 三方平台文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = stlr_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.carbon.ecar.plaformfile.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_ecar_plaformfile_response = stlr_models.UploadEcarPlaformfileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_ecar_plaformfile_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.UploadEcarPlaformfileResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.plaformfile.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_ecar_plaformfile_ex_async(
        self,
        request: stlr_models.UploadEcarPlaformfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.UploadEcarPlaformfileResponse:
        """
        Description: 三方平台文件上传
        Summary: 三方平台文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = stlr_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.carbon.ecar.plaformfile.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_ecar_plaformfile_response = stlr_models.UploadEcarPlaformfileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_ecar_plaformfile_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.UploadEcarPlaformfileResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.plaformfile.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_ecar_lcaorderwithcustomer(
        self,
        request: stlr_models.SubmitEcarLcaorderwithcustomerRequest,
    ) -> stlr_models.SubmitEcarLcaorderwithcustomerResponse:
        """
        Description: 三方平台提交LCA订单，同时包括客户入驻信息
        Summary: LCA订单提交(含客户入驻信息)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_ecar_lcaorderwithcustomer_ex(request, headers, runtime)

    async def submit_ecar_lcaorderwithcustomer_async(
        self,
        request: stlr_models.SubmitEcarLcaorderwithcustomerRequest,
    ) -> stlr_models.SubmitEcarLcaorderwithcustomerResponse:
        """
        Description: 三方平台提交LCA订单，同时包括客户入驻信息
        Summary: LCA订单提交(含客户入驻信息)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_ecar_lcaorderwithcustomer_ex_async(request, headers, runtime)

    def submit_ecar_lcaorderwithcustomer_ex(
        self,
        request: stlr_models.SubmitEcarLcaorderwithcustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.SubmitEcarLcaorderwithcustomerResponse:
        """
        Description: 三方平台提交LCA订单，同时包括客户入驻信息
        Summary: LCA订单提交(含客户入驻信息)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.SubmitEcarLcaorderwithcustomerResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.lcaorderwithcustomer.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_ecar_lcaorderwithcustomer_ex_async(
        self,
        request: stlr_models.SubmitEcarLcaorderwithcustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.SubmitEcarLcaorderwithcustomerResponse:
        """
        Description: 三方平台提交LCA订单，同时包括客户入驻信息
        Summary: LCA订单提交(含客户入驻信息)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.SubmitEcarLcaorderwithcustomerResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.lcaorderwithcustomer.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_ecar_plaformauthtoken(
        self,
        request: stlr_models.GetEcarPlaformauthtokenRequest,
    ) -> stlr_models.GetEcarPlaformauthtokenResponse:
        """
        Description: 三方平台信登token获取
        Summary: 三方平台获取信登token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_ecar_plaformauthtoken_ex(request, headers, runtime)

    async def get_ecar_plaformauthtoken_async(
        self,
        request: stlr_models.GetEcarPlaformauthtokenRequest,
    ) -> stlr_models.GetEcarPlaformauthtokenResponse:
        """
        Description: 三方平台信登token获取
        Summary: 三方平台获取信登token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_ecar_plaformauthtoken_ex_async(request, headers, runtime)

    def get_ecar_plaformauthtoken_ex(
        self,
        request: stlr_models.GetEcarPlaformauthtokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.GetEcarPlaformauthtokenResponse:
        """
        Description: 三方平台信登token获取
        Summary: 三方平台获取信登token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.GetEcarPlaformauthtokenResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.plaformauthtoken.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_ecar_plaformauthtoken_ex_async(
        self,
        request: stlr_models.GetEcarPlaformauthtokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.GetEcarPlaformauthtokenResponse:
        """
        Description: 三方平台信登token获取
        Summary: 三方平台获取信登token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.GetEcarPlaformauthtokenResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.plaformauthtoken.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ecar_lcaorder(
        self,
        request: stlr_models.QueryEcarLcaorderRequest,
    ) -> stlr_models.QueryEcarLcaorderResponse:
        """
        Description: LCA订单查询
        Summary: LCA订单查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ecar_lcaorder_ex(request, headers, runtime)

    async def query_ecar_lcaorder_async(
        self,
        request: stlr_models.QueryEcarLcaorderRequest,
    ) -> stlr_models.QueryEcarLcaorderResponse:
        """
        Description: LCA订单查询
        Summary: LCA订单查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ecar_lcaorder_ex_async(request, headers, runtime)

    def query_ecar_lcaorder_ex(
        self,
        request: stlr_models.QueryEcarLcaorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryEcarLcaorderResponse:
        """
        Description: LCA订单查询
        Summary: LCA订单查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryEcarLcaorderResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.lcaorder.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ecar_lcaorder_ex_async(
        self,
        request: stlr_models.QueryEcarLcaorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryEcarLcaorderResponse:
        """
        Description: LCA订单查询
        Summary: LCA订单查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryEcarLcaorderResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.lcaorder.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchcreate_ecar_greencertificategeneration(
        self,
        request: stlr_models.BatchcreateEcarGreencertificategenerationRequest,
    ) -> stlr_models.BatchcreateEcarGreencertificategenerationResponse:
        """
        Description: 绿证发电量数据上报接口
        Summary: 绿证发电量数据上报接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchcreate_ecar_greencertificategeneration_ex(request, headers, runtime)

    async def batchcreate_ecar_greencertificategeneration_async(
        self,
        request: stlr_models.BatchcreateEcarGreencertificategenerationRequest,
    ) -> stlr_models.BatchcreateEcarGreencertificategenerationResponse:
        """
        Description: 绿证发电量数据上报接口
        Summary: 绿证发电量数据上报接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchcreate_ecar_greencertificategeneration_ex_async(request, headers, runtime)

    def batchcreate_ecar_greencertificategeneration_ex(
        self,
        request: stlr_models.BatchcreateEcarGreencertificategenerationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.BatchcreateEcarGreencertificategenerationResponse:
        """
        Description: 绿证发电量数据上报接口
        Summary: 绿证发电量数据上报接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.BatchcreateEcarGreencertificategenerationResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.greencertificategeneration.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchcreate_ecar_greencertificategeneration_ex_async(
        self,
        request: stlr_models.BatchcreateEcarGreencertificategenerationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.BatchcreateEcarGreencertificategenerationResponse:
        """
        Description: 绿证发电量数据上报接口
        Summary: 绿证发电量数据上报接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.BatchcreateEcarGreencertificategenerationResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.greencertificategeneration.batchcreate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_ecar_lcacalc(
        self,
        request: stlr_models.SubmitEcarLcacalcRequest,
    ) -> stlr_models.SubmitEcarLcacalcResponse:
        """
        Description: 产品碳足迹速算请求提交
        Summary: 产品碳足迹速算请求提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_ecar_lcacalc_ex(request, headers, runtime)

    async def submit_ecar_lcacalc_async(
        self,
        request: stlr_models.SubmitEcarLcacalcRequest,
    ) -> stlr_models.SubmitEcarLcacalcResponse:
        """
        Description: 产品碳足迹速算请求提交
        Summary: 产品碳足迹速算请求提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_ecar_lcacalc_ex_async(request, headers, runtime)

    def submit_ecar_lcacalc_ex(
        self,
        request: stlr_models.SubmitEcarLcacalcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.SubmitEcarLcacalcResponse:
        """
        Description: 产品碳足迹速算请求提交
        Summary: 产品碳足迹速算请求提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.SubmitEcarLcacalcResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.lcacalc.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_ecar_lcacalc_ex_async(
        self,
        request: stlr_models.SubmitEcarLcacalcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.SubmitEcarLcacalcResponse:
        """
        Description: 产品碳足迹速算请求提交
        Summary: 产品碳足迹速算请求提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.SubmitEcarLcacalcResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.lcacalc.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_ecar_lcacalc(
        self,
        request: stlr_models.QueryEcarLcacalcRequest,
    ) -> stlr_models.QueryEcarLcacalcResponse:
        """
        Description: 产品碳足迹速算结果查询
        Summary: 产品碳足迹速算结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_ecar_lcacalc_ex(request, headers, runtime)

    async def query_ecar_lcacalc_async(
        self,
        request: stlr_models.QueryEcarLcacalcRequest,
    ) -> stlr_models.QueryEcarLcacalcResponse:
        """
        Description: 产品碳足迹速算结果查询
        Summary: 产品碳足迹速算结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_ecar_lcacalc_ex_async(request, headers, runtime)

    def query_ecar_lcacalc_ex(
        self,
        request: stlr_models.QueryEcarLcacalcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryEcarLcacalcResponse:
        """
        Description: 产品碳足迹速算结果查询
        Summary: 产品碳足迹速算结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryEcarLcacalcResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.lcacalc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_ecar_lcacalc_ex_async(
        self,
        request: stlr_models.QueryEcarLcacalcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryEcarLcacalcResponse:
        """
        Description: 产品碳足迹速算结果查询
        Summary: 产品碳足迹速算结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryEcarLcacalcResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.lcacalc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_ecar_greencertificategenerationfile(
        self,
        request: stlr_models.SubmitEcarGreencertificategenerationfileRequest,
    ) -> stlr_models.SubmitEcarGreencertificategenerationfileResponse:
        """
        Description: 发电数据文件导入开放接口
        Summary: 发电数据文件导入开放接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_ecar_greencertificategenerationfile_ex(request, headers, runtime)

    async def submit_ecar_greencertificategenerationfile_async(
        self,
        request: stlr_models.SubmitEcarGreencertificategenerationfileRequest,
    ) -> stlr_models.SubmitEcarGreencertificategenerationfileResponse:
        """
        Description: 发电数据文件导入开放接口
        Summary: 发电数据文件导入开放接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_ecar_greencertificategenerationfile_ex_async(request, headers, runtime)

    def submit_ecar_greencertificategenerationfile_ex(
        self,
        request: stlr_models.SubmitEcarGreencertificategenerationfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.SubmitEcarGreencertificategenerationfileResponse:
        """
        Description: 发电数据文件导入开放接口
        Summary: 发电数据文件导入开放接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = stlr_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.carbon.ecar.greencertificategenerationfile.submit',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                submit_ecar_greencertificategenerationfile_response = stlr_models.SubmitEcarGreencertificategenerationfileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return submit_ecar_greencertificategenerationfile_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.SubmitEcarGreencertificategenerationfileResponse(),
            self.do_request('1.0', 'antchain.carbon.ecar.greencertificategenerationfile.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_ecar_greencertificategenerationfile_ex_async(
        self,
        request: stlr_models.SubmitEcarGreencertificategenerationfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.SubmitEcarGreencertificategenerationfileResponse:
        """
        Description: 发电数据文件导入开放接口
        Summary: 发电数据文件导入开放接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = stlr_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.carbon.ecar.greencertificategenerationfile.submit',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                submit_ecar_greencertificategenerationfile_response = stlr_models.SubmitEcarGreencertificategenerationfileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return submit_ecar_greencertificategenerationfile_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.SubmitEcarGreencertificategenerationfileResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.ecar.greencertificategenerationfile.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lcaproject_tracetenant(
        self,
        request: stlr_models.QueryLcaprojectTracetenantRequest,
    ) -> stlr_models.QueryLcaprojectTracetenantResponse:
        """
        Description: 溯源检查租户
        Summary: 溯源检查租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lcaproject_tracetenant_ex(request, headers, runtime)

    async def query_lcaproject_tracetenant_async(
        self,
        request: stlr_models.QueryLcaprojectTracetenantRequest,
    ) -> stlr_models.QueryLcaprojectTracetenantResponse:
        """
        Description: 溯源检查租户
        Summary: 溯源检查租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lcaproject_tracetenant_ex_async(request, headers, runtime)

    def query_lcaproject_tracetenant_ex(
        self,
        request: stlr_models.QueryLcaprojectTracetenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryLcaprojectTracetenantResponse:
        """
        Description: 溯源检查租户
        Summary: 溯源检查租户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryLcaprojectTracetenantResponse(),
            self.do_request('1.0', 'antchain.carbon.lcaproject.tracetenant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lcaproject_tracetenant_ex_async(
        self,
        request: stlr_models.QueryLcaprojectTracetenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.QueryLcaprojectTracetenantResponse:
        """
        Description: 溯源检查租户
        Summary: 溯源检查租户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.QueryLcaprojectTracetenantResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.lcaproject.tracetenant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_lcaproject_traceproject(
        self,
        request: stlr_models.ListLcaprojectTraceprojectRequest,
    ) -> stlr_models.ListLcaprojectTraceprojectResponse:
        """
        Description: 溯源查询LCA项目列表
        Summary: 查询LCA项目列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_lcaproject_traceproject_ex(request, headers, runtime)

    async def list_lcaproject_traceproject_async(
        self,
        request: stlr_models.ListLcaprojectTraceprojectRequest,
    ) -> stlr_models.ListLcaprojectTraceprojectResponse:
        """
        Description: 溯源查询LCA项目列表
        Summary: 查询LCA项目列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_lcaproject_traceproject_ex_async(request, headers, runtime)

    def list_lcaproject_traceproject_ex(
        self,
        request: stlr_models.ListLcaprojectTraceprojectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.ListLcaprojectTraceprojectResponse:
        """
        Description: 溯源查询LCA项目列表
        Summary: 查询LCA项目列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.ListLcaprojectTraceprojectResponse(),
            self.do_request('1.0', 'antchain.carbon.lcaproject.traceproject.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_lcaproject_traceproject_ex_async(
        self,
        request: stlr_models.ListLcaprojectTraceprojectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.ListLcaprojectTraceprojectResponse:
        """
        Description: 溯源查询LCA项目列表
        Summary: 查询LCA项目列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.ListLcaprojectTraceprojectResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.lcaproject.traceproject.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_lcaproject_traceproject(
        self,
        request: stlr_models.DetailLcaprojectTraceprojectRequest,
    ) -> stlr_models.DetailLcaprojectTraceprojectResponse:
        """
        Description: 根据请求参数获取LCA项目跟踪信息
        Summary: 根据请求参数获取LCA项目信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_lcaproject_traceproject_ex(request, headers, runtime)

    async def detail_lcaproject_traceproject_async(
        self,
        request: stlr_models.DetailLcaprojectTraceprojectRequest,
    ) -> stlr_models.DetailLcaprojectTraceprojectResponse:
        """
        Description: 根据请求参数获取LCA项目跟踪信息
        Summary: 根据请求参数获取LCA项目信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_lcaproject_traceproject_ex_async(request, headers, runtime)

    def detail_lcaproject_traceproject_ex(
        self,
        request: stlr_models.DetailLcaprojectTraceprojectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DetailLcaprojectTraceprojectResponse:
        """
        Description: 根据请求参数获取LCA项目跟踪信息
        Summary: 根据请求参数获取LCA项目信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DetailLcaprojectTraceprojectResponse(),
            self.do_request('1.0', 'antchain.carbon.lcaproject.traceproject.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_lcaproject_traceproject_ex_async(
        self,
        request: stlr_models.DetailLcaprojectTraceprojectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DetailLcaprojectTraceprojectResponse:
        """
        Description: 根据请求参数获取LCA项目跟踪信息
        Summary: 根据请求参数获取LCA项目信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DetailLcaprojectTraceprojectResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.lcaproject.traceproject.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_lcaproject_tracebinding(
        self,
        request: stlr_models.OperateLcaprojectTracebindingRequest,
    ) -> stlr_models.OperateLcaprojectTracebindingResponse:
        """
        Description: 绑定LCA项目
        Summary: 绑定LCA项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_lcaproject_tracebinding_ex(request, headers, runtime)

    async def operate_lcaproject_tracebinding_async(
        self,
        request: stlr_models.OperateLcaprojectTracebindingRequest,
    ) -> stlr_models.OperateLcaprojectTracebindingResponse:
        """
        Description: 绑定LCA项目
        Summary: 绑定LCA项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_lcaproject_tracebinding_ex_async(request, headers, runtime)

    def operate_lcaproject_tracebinding_ex(
        self,
        request: stlr_models.OperateLcaprojectTracebindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.OperateLcaprojectTracebindingResponse:
        """
        Description: 绑定LCA项目
        Summary: 绑定LCA项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.OperateLcaprojectTracebindingResponse(),
            self.do_request('1.0', 'antchain.carbon.lcaproject.tracebinding.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_lcaproject_tracebinding_ex_async(
        self,
        request: stlr_models.OperateLcaprojectTracebindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.OperateLcaprojectTracebindingResponse:
        """
        Description: 绑定LCA项目
        Summary: 绑定LCA项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.OperateLcaprojectTracebindingResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.lcaproject.tracebinding.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_finance_emission(
        self,
        request: stlr_models.AddFinanceEmissionRequest,
    ) -> stlr_models.AddFinanceEmissionResponse:
        """
        Description: 转型金融排放新增
        Summary: 转型金融排放新增
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_finance_emission_ex(request, headers, runtime)

    async def add_finance_emission_async(
        self,
        request: stlr_models.AddFinanceEmissionRequest,
    ) -> stlr_models.AddFinanceEmissionResponse:
        """
        Description: 转型金融排放新增
        Summary: 转型金融排放新增
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_finance_emission_ex_async(request, headers, runtime)

    def add_finance_emission_ex(
        self,
        request: stlr_models.AddFinanceEmissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AddFinanceEmissionResponse:
        """
        Description: 转型金融排放新增
        Summary: 转型金融排放新增
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AddFinanceEmissionResponse(),
            self.do_request('1.0', 'antchain.carbon.finance.emission.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_finance_emission_ex_async(
        self,
        request: stlr_models.AddFinanceEmissionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AddFinanceEmissionResponse:
        """
        Description: 转型金融排放新增
        Summary: 转型金融排放新增
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AddFinanceEmissionResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.finance.emission.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_finance_company(
        self,
        request: stlr_models.AddFinanceCompanyRequest,
    ) -> stlr_models.AddFinanceCompanyResponse:
        """
        Description: 新增企业或者项目
        Summary: 新增企业或者项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_finance_company_ex(request, headers, runtime)

    async def add_finance_company_async(
        self,
        request: stlr_models.AddFinanceCompanyRequest,
    ) -> stlr_models.AddFinanceCompanyResponse:
        """
        Description: 新增企业或者项目
        Summary: 新增企业或者项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_finance_company_ex_async(request, headers, runtime)

    def add_finance_company_ex(
        self,
        request: stlr_models.AddFinanceCompanyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AddFinanceCompanyResponse:
        """
        Description: 新增企业或者项目
        Summary: 新增企业或者项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AddFinanceCompanyResponse(),
            self.do_request('1.0', 'antchain.carbon.finance.company.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_finance_company_ex_async(
        self,
        request: stlr_models.AddFinanceCompanyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.AddFinanceCompanyResponse:
        """
        Description: 新增企业或者项目
        Summary: 新增企业或者项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.AddFinanceCompanyResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.finance.company.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_finance_company(
        self,
        request: stlr_models.UpdateFinanceCompanyRequest,
    ) -> stlr_models.UpdateFinanceCompanyResponse:
        """
        Description: 企业或者项目更新
        Summary: 企业更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_finance_company_ex(request, headers, runtime)

    async def update_finance_company_async(
        self,
        request: stlr_models.UpdateFinanceCompanyRequest,
    ) -> stlr_models.UpdateFinanceCompanyResponse:
        """
        Description: 企业或者项目更新
        Summary: 企业更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_finance_company_ex_async(request, headers, runtime)

    def update_finance_company_ex(
        self,
        request: stlr_models.UpdateFinanceCompanyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.UpdateFinanceCompanyResponse:
        """
        Description: 企业或者项目更新
        Summary: 企业更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.UpdateFinanceCompanyResponse(),
            self.do_request('1.0', 'antchain.carbon.finance.company.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_finance_company_ex_async(
        self,
        request: stlr_models.UpdateFinanceCompanyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.UpdateFinanceCompanyResponse:
        """
        Description: 企业或者项目更新
        Summary: 企业更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.UpdateFinanceCompanyResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.finance.company.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_finance_company(
        self,
        request: stlr_models.DeleteFinanceCompanyRequest,
    ) -> stlr_models.DeleteFinanceCompanyResponse:
        """
        Description: 删除企业或者项目
        Summary: 删除企业
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_finance_company_ex(request, headers, runtime)

    async def delete_finance_company_async(
        self,
        request: stlr_models.DeleteFinanceCompanyRequest,
    ) -> stlr_models.DeleteFinanceCompanyResponse:
        """
        Description: 删除企业或者项目
        Summary: 删除企业
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_finance_company_ex_async(request, headers, runtime)

    def delete_finance_company_ex(
        self,
        request: stlr_models.DeleteFinanceCompanyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DeleteFinanceCompanyResponse:
        """
        Description: 删除企业或者项目
        Summary: 删除企业
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DeleteFinanceCompanyResponse(),
            self.do_request('1.0', 'antchain.carbon.finance.company.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_finance_company_ex_async(
        self,
        request: stlr_models.DeleteFinanceCompanyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.DeleteFinanceCompanyResponse:
        """
        Description: 删除企业或者项目
        Summary: 删除企业
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.DeleteFinanceCompanyResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.finance.company.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_finance_report(
        self,
        request: stlr_models.ListFinanceReportRequest,
    ) -> stlr_models.ListFinanceReportResponse:
        """
        Description: 排放报告获取
        Summary: 排放报告获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_finance_report_ex(request, headers, runtime)

    async def list_finance_report_async(
        self,
        request: stlr_models.ListFinanceReportRequest,
    ) -> stlr_models.ListFinanceReportResponse:
        """
        Description: 排放报告获取
        Summary: 排放报告获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_finance_report_ex_async(request, headers, runtime)

    def list_finance_report_ex(
        self,
        request: stlr_models.ListFinanceReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.ListFinanceReportResponse:
        """
        Description: 排放报告获取
        Summary: 排放报告获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.ListFinanceReportResponse(),
            self.do_request('1.0', 'antchain.carbon.finance.report.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_finance_report_ex_async(
        self,
        request: stlr_models.ListFinanceReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.ListFinanceReportResponse:
        """
        Description: 排放报告获取
        Summary: 排放报告获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.ListFinanceReportResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.finance.report.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_finance_report(
        self,
        request: stlr_models.CreateFinanceReportRequest,
    ) -> stlr_models.CreateFinanceReportResponse:
        """
        Description: 转型金融报告生成
        Summary: 转型金融报告生成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_finance_report_ex(request, headers, runtime)

    async def create_finance_report_async(
        self,
        request: stlr_models.CreateFinanceReportRequest,
    ) -> stlr_models.CreateFinanceReportResponse:
        """
        Description: 转型金融报告生成
        Summary: 转型金融报告生成
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_finance_report_ex_async(request, headers, runtime)

    def create_finance_report_ex(
        self,
        request: stlr_models.CreateFinanceReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.CreateFinanceReportResponse:
        """
        Description: 转型金融报告生成
        Summary: 转型金融报告生成
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.CreateFinanceReportResponse(),
            self.do_request('1.0', 'antchain.carbon.finance.report.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_finance_report_ex_async(
        self,
        request: stlr_models.CreateFinanceReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.CreateFinanceReportResponse:
        """
        Description: 转型金融报告生成
        Summary: 转型金融报告生成
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.CreateFinanceReportResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.finance.report.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_finance_report(
        self,
        request: stlr_models.UpdateFinanceReportRequest,
    ) -> stlr_models.UpdateFinanceReportResponse:
        """
        Description: 转型报告更新
        Summary: 转型报告更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_finance_report_ex(request, headers, runtime)

    async def update_finance_report_async(
        self,
        request: stlr_models.UpdateFinanceReportRequest,
    ) -> stlr_models.UpdateFinanceReportResponse:
        """
        Description: 转型报告更新
        Summary: 转型报告更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_finance_report_ex_async(request, headers, runtime)

    def update_finance_report_ex(
        self,
        request: stlr_models.UpdateFinanceReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.UpdateFinanceReportResponse:
        """
        Description: 转型报告更新
        Summary: 转型报告更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.UpdateFinanceReportResponse(),
            self.do_request('1.0', 'antchain.carbon.finance.report.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_finance_report_ex_async(
        self,
        request: stlr_models.UpdateFinanceReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> stlr_models.UpdateFinanceReportResponse:
        """
        Description: 转型报告更新
        Summary: 转型报告更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            stlr_models.UpdateFinanceReportResponse(),
            await self.do_request_async('1.0', 'antchain.carbon.finance.report.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
