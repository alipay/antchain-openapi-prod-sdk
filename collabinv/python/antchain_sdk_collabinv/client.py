# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_collabinv import models as collabinv_models
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
        config: collabinv_models.Config,
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
            # 特征集信息
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
                    'sdk_version': '1.0.9',
                    '_prod_code': 'COLLABINV',
                    '_prod_channel': 'default'
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
            # 特征集信息
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
                    'sdk_version': '1.0.9',
                    '_prod_code': 'COLLABINV',
                    '_prod_channel': 'default'
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

    def query_location_internal(
        self,
        request: collabinv_models.QueryLocationInternalRequest,
    ) -> collabinv_models.QueryLocationInternalResponse:
        """
        Description: 基于交易数据的定位信息协查
        Summary: 定位协查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_location_internal_ex(request, headers, runtime)

    async def query_location_internal_async(
        self,
        request: collabinv_models.QueryLocationInternalRequest,
    ) -> collabinv_models.QueryLocationInternalResponse:
        """
        Description: 基于交易数据的定位信息协查
        Summary: 定位协查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_location_internal_ex_async(request, headers, runtime)

    def query_location_internal_ex(
        self,
        request: collabinv_models.QueryLocationInternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryLocationInternalResponse:
        """
        Description: 基于交易数据的定位信息协查
        Summary: 定位协查
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryLocationInternalResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.location.internal.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_location_internal_ex_async(
        self,
        request: collabinv_models.QueryLocationInternalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryLocationInternalResponse:
        """
        Description: 基于交易数据的定位信息协查
        Summary: 定位协查
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryLocationInternalResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.location.internal.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_location_trade(
        self,
        request: collabinv_models.QueryLocationTradeRequest,
    ) -> collabinv_models.QueryLocationTradeResponse:
        """
        Description: 基于交易数据的定位信息协查对外接口
        Summary: 定位协查对外接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_location_trade_ex(request, headers, runtime)

    async def query_location_trade_async(
        self,
        request: collabinv_models.QueryLocationTradeRequest,
    ) -> collabinv_models.QueryLocationTradeResponse:
        """
        Description: 基于交易数据的定位信息协查对外接口
        Summary: 定位协查对外接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_location_trade_ex_async(request, headers, runtime)

    def query_location_trade_ex(
        self,
        request: collabinv_models.QueryLocationTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryLocationTradeResponse:
        """
        Description: 基于交易数据的定位信息协查对外接口
        Summary: 定位协查对外接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryLocationTradeResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.location.trade.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_location_trade_ex_async(
        self,
        request: collabinv_models.QueryLocationTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryLocationTradeResponse:
        """
        Description: 基于交易数据的定位信息协查对外接口
        Summary: 定位协查对外接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryLocationTradeResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.location.trade.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_model_samplefile(
        self,
        request: collabinv_models.PushModelSamplefileRequest,
    ) -> collabinv_models.PushModelSamplefileResponse:
        """
        Description: 样本文件摘要
        Summary: 样本文件摘要
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_model_samplefile_ex(request, headers, runtime)

    async def push_model_samplefile_async(
        self,
        request: collabinv_models.PushModelSamplefileRequest,
    ) -> collabinv_models.PushModelSamplefileResponse:
        """
        Description: 样本文件摘要
        Summary: 样本文件摘要
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_model_samplefile_ex_async(request, headers, runtime)

    def push_model_samplefile_ex(
        self,
        request: collabinv_models.PushModelSamplefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.PushModelSamplefileResponse:
        """
        Description: 样本文件摘要
        Summary: 样本文件摘要
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.PushModelSamplefileResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.model.samplefile.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_model_samplefile_ex_async(
        self,
        request: collabinv_models.PushModelSamplefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.PushModelSamplefileResponse:
        """
        Description: 样本文件摘要
        Summary: 样本文件摘要
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.PushModelSamplefileResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.model.samplefile.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_model_sampletask(
        self,
        request: collabinv_models.ExecModelSampletaskRequest,
    ) -> collabinv_models.ExecModelSampletaskResponse:
        """
        Description: 样本任务执行
        Summary: 样本任务执行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_model_sampletask_ex(request, headers, runtime)

    async def exec_model_sampletask_async(
        self,
        request: collabinv_models.ExecModelSampletaskRequest,
    ) -> collabinv_models.ExecModelSampletaskResponse:
        """
        Description: 样本任务执行
        Summary: 样本任务执行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_model_sampletask_ex_async(request, headers, runtime)

    def exec_model_sampletask_ex(
        self,
        request: collabinv_models.ExecModelSampletaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.ExecModelSampletaskResponse:
        """
        Description: 样本任务执行
        Summary: 样本任务执行
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.ExecModelSampletaskResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.model.sampletask.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_model_sampletask_ex_async(
        self,
        request: collabinv_models.ExecModelSampletaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.ExecModelSampletaskResponse:
        """
        Description: 样本任务执行
        Summary: 样本任务执行
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.ExecModelSampletaskResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.model.sampletask.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_model_sampletask(
        self,
        request: collabinv_models.QueryModelSampletaskRequest,
    ) -> collabinv_models.QueryModelSampletaskResponse:
        """
        Description: 任务状态查询
        Summary: 任务状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_model_sampletask_ex(request, headers, runtime)

    async def query_model_sampletask_async(
        self,
        request: collabinv_models.QueryModelSampletaskRequest,
    ) -> collabinv_models.QueryModelSampletaskResponse:
        """
        Description: 任务状态查询
        Summary: 任务状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_model_sampletask_ex_async(request, headers, runtime)

    def query_model_sampletask_ex(
        self,
        request: collabinv_models.QueryModelSampletaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelSampletaskResponse:
        """
        Description: 任务状态查询
        Summary: 任务状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelSampletaskResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.model.sampletask.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_model_sampletask_ex_async(
        self,
        request: collabinv_models.QueryModelSampletaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelSampletaskResponse:
        """
        Description: 任务状态查询
        Summary: 任务状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelSampletaskResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.model.sampletask.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_model_featureset(
        self,
        request: collabinv_models.QueryModelFeaturesetRequest,
    ) -> collabinv_models.QueryModelFeaturesetResponse:
        """
        Description: 特征集查询
        Summary: 特征集查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_model_featureset_ex(request, headers, runtime)

    async def query_model_featureset_async(
        self,
        request: collabinv_models.QueryModelFeaturesetRequest,
    ) -> collabinv_models.QueryModelFeaturesetResponse:
        """
        Description: 特征集查询
        Summary: 特征集查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_model_featureset_ex_async(request, headers, runtime)

    def query_model_featureset_ex(
        self,
        request: collabinv_models.QueryModelFeaturesetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelFeaturesetResponse:
        """
        Description: 特征集查询
        Summary: 特征集查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelFeaturesetResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.model.featureset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_model_featureset_ex_async(
        self,
        request: collabinv_models.QueryModelFeaturesetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelFeaturesetResponse:
        """
        Description: 特征集查询
        Summary: 特征集查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelFeaturesetResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.model.featureset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_model_instance(
        self,
        request: collabinv_models.SubmitModelInstanceRequest,
    ) -> collabinv_models.SubmitModelInstanceResponse:
        """
        Description: 模型保存
        Summary: 模型保存
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_model_instance_ex(request, headers, runtime)

    async def submit_model_instance_async(
        self,
        request: collabinv_models.SubmitModelInstanceRequest,
    ) -> collabinv_models.SubmitModelInstanceResponse:
        """
        Description: 模型保存
        Summary: 模型保存
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_model_instance_ex_async(request, headers, runtime)

    def submit_model_instance_ex(
        self,
        request: collabinv_models.SubmitModelInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.SubmitModelInstanceResponse:
        """
        Description: 模型保存
        Summary: 模型保存
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.SubmitModelInstanceResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.model.instance.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_model_instance_ex_async(
        self,
        request: collabinv_models.SubmitModelInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.SubmitModelInstanceResponse:
        """
        Description: 模型保存
        Summary: 模型保存
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.SubmitModelInstanceResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.model.instance.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_model_stats(
        self,
        request: collabinv_models.QueryModelStatsRequest,
    ) -> collabinv_models.QueryModelStatsResponse:
        """
        Description: 模型调用统计查询
        Summary: 模型调用统计查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_model_stats_ex(request, headers, runtime)

    async def query_model_stats_async(
        self,
        request: collabinv_models.QueryModelStatsRequest,
    ) -> collabinv_models.QueryModelStatsResponse:
        """
        Description: 模型调用统计查询
        Summary: 模型调用统计查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_model_stats_ex_async(request, headers, runtime)

    def query_model_stats_ex(
        self,
        request: collabinv_models.QueryModelStatsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelStatsResponse:
        """
        Description: 模型调用统计查询
        Summary: 模型调用统计查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelStatsResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.model.stats.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_model_stats_ex_async(
        self,
        request: collabinv_models.QueryModelStatsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelStatsResponse:
        """
        Description: 模型调用统计查询
        Summary: 模型调用统计查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelStatsResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.model.stats.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_model_commonscore(
        self,
        request: collabinv_models.QueryModelCommonscoreRequest,
    ) -> collabinv_models.QueryModelCommonscoreResponse:
        """
        Description: 通用查询
        Summary: 通用查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_model_commonscore_ex(request, headers, runtime)

    async def query_model_commonscore_async(
        self,
        request: collabinv_models.QueryModelCommonscoreRequest,
    ) -> collabinv_models.QueryModelCommonscoreResponse:
        """
        Description: 通用查询
        Summary: 通用查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_model_commonscore_ex_async(request, headers, runtime)

    def query_model_commonscore_ex(
        self,
        request: collabinv_models.QueryModelCommonscoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelCommonscoreResponse:
        """
        Description: 通用查询
        Summary: 通用查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelCommonscoreResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.model.commonscore.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_model_commonscore_ex_async(
        self,
        request: collabinv_models.QueryModelCommonscoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.QueryModelCommonscoreResponse:
        """
        Description: 通用查询
        Summary: 通用查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.QueryModelCommonscoreResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.model.commonscore.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_model_commonscore(
        self,
        request: collabinv_models.BatchqueryModelCommonscoreRequest,
    ) -> collabinv_models.BatchqueryModelCommonscoreResponse:
        """
        Description: 模型分
        Summary: 模型分
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_model_commonscore_ex(request, headers, runtime)

    async def batchquery_model_commonscore_async(
        self,
        request: collabinv_models.BatchqueryModelCommonscoreRequest,
    ) -> collabinv_models.BatchqueryModelCommonscoreResponse:
        """
        Description: 模型分
        Summary: 模型分
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_model_commonscore_ex_async(request, headers, runtime)

    def batchquery_model_commonscore_ex(
        self,
        request: collabinv_models.BatchqueryModelCommonscoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.BatchqueryModelCommonscoreResponse:
        """
        Description: 模型分
        Summary: 模型分
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.BatchqueryModelCommonscoreResponse(),
            self.do_request('1.0', 'antchain.zkcollabinv.model.commonscore.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_model_commonscore_ex_async(
        self,
        request: collabinv_models.BatchqueryModelCommonscoreRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> collabinv_models.BatchqueryModelCommonscoreResponse:
        """
        Description: 模型分
        Summary: 模型分
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            collabinv_models.BatchqueryModelCommonscoreResponse(),
            await self.do_request_async('1.0', 'antchain.zkcollabinv.model.commonscore.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
