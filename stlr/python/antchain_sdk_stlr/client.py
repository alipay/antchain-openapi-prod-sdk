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
            # 分类碳排放量
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
                    'sdk_version': '1.0.3'
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
            # 分类碳排放量
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
                    'sdk_version': '1.0.3'
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
        return stlr_models.DescribeAcarActivityResponse().from_map(
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
        return stlr_models.DescribeAcarActivityResponse().from_map(
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
        return stlr_models.DescribeAcarDailyemissionsResponse().from_map(
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
        return stlr_models.DescribeAcarDailyemissionsResponse().from_map(
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
        return stlr_models.DescribeAcarScopemissionResponse().from_map(
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
        return stlr_models.DescribeAcarScopemissionResponse().from_map(
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
        return stlr_models.DescribeAcarReductionemissionsResponse().from_map(
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
        return stlr_models.DescribeAcarReductionemissionsResponse().from_map(
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
        return stlr_models.DescribeAcarLastemissiondataResponse().from_map(
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
        return stlr_models.DescribeAcarLastemissiondataResponse().from_map(
            await self.do_request_async('1.0', 'antchain.carbon.acar.lastemissiondata.describe', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
