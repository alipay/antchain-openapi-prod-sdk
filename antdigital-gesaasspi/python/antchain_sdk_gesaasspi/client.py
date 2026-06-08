# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_gesaasspi import models as gesaasspi_models
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
        config: gesaasspi_models.Config,
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
            # 【固定折扣特定信息】
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
                    'sdk_version': '1.5.1',
                    '_prod_code': 'GESAASSPI',
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
            # 【固定折扣特定信息】
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
                    'sdk_version': '1.5.1',
                    '_prod_code': 'GESAASSPI',
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

    def submit_antchain_sds_scenedata_task(
        self,
        request: gesaasspi_models.SubmitAntchainSdsScenedataTaskRequest,
    ) -> gesaasspi_models.SubmitAntchainSdsScenedataTaskResponse:
        """
        Description: 创建任务，获取批次号。
        Summary: 创建任务，获取批次号。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_antchain_sds_scenedata_task_ex(request, headers, runtime)

    async def submit_antchain_sds_scenedata_task_async(
        self,
        request: gesaasspi_models.SubmitAntchainSdsScenedataTaskRequest,
    ) -> gesaasspi_models.SubmitAntchainSdsScenedataTaskResponse:
        """
        Description: 创建任务，获取批次号。
        Summary: 创建任务，获取批次号。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_antchain_sds_scenedata_task_ex_async(request, headers, runtime)

    def submit_antchain_sds_scenedata_task_ex(
        self,
        request: gesaasspi_models.SubmitAntchainSdsScenedataTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.SubmitAntchainSdsScenedataTaskResponse:
        """
        Description: 创建任务，获取批次号。
        Summary: 创建任务，获取批次号。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.SubmitAntchainSdsScenedataTaskResponse(),
            self.do_request('1.0', 'antchain.sds.scenedata.task.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_antchain_sds_scenedata_task_ex_async(
        self,
        request: gesaasspi_models.SubmitAntchainSdsScenedataTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.SubmitAntchainSdsScenedataTaskResponse:
        """
        Description: 创建任务，获取批次号。
        Summary: 创建任务，获取批次号。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.SubmitAntchainSdsScenedataTaskResponse(),
            await self.do_request_async('1.0', 'antchain.sds.scenedata.task.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_antchain_sds_scenedata_file(
        self,
        request: gesaasspi_models.UploadAntchainSdsScenedataFileRequest,
    ) -> gesaasspi_models.UploadAntchainSdsScenedataFileResponse:
        """
        Description: 批次数据文件上传
        Summary: 批次数据文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_antchain_sds_scenedata_file_ex(request, headers, runtime)

    async def upload_antchain_sds_scenedata_file_async(
        self,
        request: gesaasspi_models.UploadAntchainSdsScenedataFileRequest,
    ) -> gesaasspi_models.UploadAntchainSdsScenedataFileResponse:
        """
        Description: 批次数据文件上传
        Summary: 批次数据文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_antchain_sds_scenedata_file_ex_async(request, headers, runtime)

    def upload_antchain_sds_scenedata_file_ex(
        self,
        request: gesaasspi_models.UploadAntchainSdsScenedataFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.UploadAntchainSdsScenedataFileResponse:
        """
        Description: 批次数据文件上传
        Summary: 批次数据文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = gesaasspi_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.sds.scenedata.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_antchain_sds_scenedata_file_response = gesaasspi_models.UploadAntchainSdsScenedataFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_antchain_sds_scenedata_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.UploadAntchainSdsScenedataFileResponse(),
            self.do_request('1.0', 'antchain.sds.scenedata.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_antchain_sds_scenedata_file_ex_async(
        self,
        request: gesaasspi_models.UploadAntchainSdsScenedataFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.UploadAntchainSdsScenedataFileResponse:
        """
        Description: 批次数据文件上传
        Summary: 批次数据文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = gesaasspi_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.sds.scenedata.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_antchain_sds_scenedata_file_response = gesaasspi_models.UploadAntchainSdsScenedataFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_antchain_sds_scenedata_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.UploadAntchainSdsScenedataFileResponse(),
            await self.do_request_async('1.0', 'antchain.sds.scenedata.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_antchain_sds_scenedata_taskresult(
        self,
        request: gesaasspi_models.BatchqueryAntchainSdsScenedataTaskresultRequest,
    ) -> gesaasspi_models.BatchqueryAntchainSdsScenedataTaskresultResponse:
        """
        Description: 任务结果查询
        Summary: 任务结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_antchain_sds_scenedata_taskresult_ex(request, headers, runtime)

    async def batchquery_antchain_sds_scenedata_taskresult_async(
        self,
        request: gesaasspi_models.BatchqueryAntchainSdsScenedataTaskresultRequest,
    ) -> gesaasspi_models.BatchqueryAntchainSdsScenedataTaskresultResponse:
        """
        Description: 任务结果查询
        Summary: 任务结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_antchain_sds_scenedata_taskresult_ex_async(request, headers, runtime)

    def batchquery_antchain_sds_scenedata_taskresult_ex(
        self,
        request: gesaasspi_models.BatchqueryAntchainSdsScenedataTaskresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.BatchqueryAntchainSdsScenedataTaskresultResponse:
        """
        Description: 任务结果查询
        Summary: 任务结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.BatchqueryAntchainSdsScenedataTaskresultResponse(),
            self.do_request('1.0', 'antchain.sds.scenedata.taskresult.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_antchain_sds_scenedata_taskresult_ex_async(
        self,
        request: gesaasspi_models.BatchqueryAntchainSdsScenedataTaskresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.BatchqueryAntchainSdsScenedataTaskresultResponse:
        """
        Description: 任务结果查询
        Summary: 任务结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.BatchqueryAntchainSdsScenedataTaskresultResponse(),
            await self.do_request_async('1.0', 'antchain.sds.scenedata.taskresult.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_sds_scenedata_taskinfo(
        self,
        request: gesaasspi_models.QueryAntchainSdsScenedataTaskinfoRequest,
    ) -> gesaasspi_models.QueryAntchainSdsScenedataTaskinfoResponse:
        """
        Description: 通过批次号查询任务详细信息
        Summary: 通过批次号查询任务详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_sds_scenedata_taskinfo_ex(request, headers, runtime)

    async def query_antchain_sds_scenedata_taskinfo_async(
        self,
        request: gesaasspi_models.QueryAntchainSdsScenedataTaskinfoRequest,
    ) -> gesaasspi_models.QueryAntchainSdsScenedataTaskinfoResponse:
        """
        Description: 通过批次号查询任务详细信息
        Summary: 通过批次号查询任务详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_sds_scenedata_taskinfo_ex_async(request, headers, runtime)

    def query_antchain_sds_scenedata_taskinfo_ex(
        self,
        request: gesaasspi_models.QueryAntchainSdsScenedataTaskinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.QueryAntchainSdsScenedataTaskinfoResponse:
        """
        Description: 通过批次号查询任务详细信息
        Summary: 通过批次号查询任务详细信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.QueryAntchainSdsScenedataTaskinfoResponse(),
            self.do_request('1.0', 'antchain.sds.scenedata.taskinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_sds_scenedata_taskinfo_ex_async(
        self,
        request: gesaasspi_models.QueryAntchainSdsScenedataTaskinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.QueryAntchainSdsScenedataTaskinfoResponse:
        """
        Description: 通过批次号查询任务详细信息
        Summary: 通过批次号查询任务详细信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.QueryAntchainSdsScenedataTaskinfoResponse(),
            await self.do_request_async('1.0', 'antchain.sds.scenedata.taskinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_antchain_sds_favor_stocks(
        self,
        request: gesaasspi_models.QueryAntchainSdsFavorStocksRequest,
    ) -> gesaasspi_models.QueryAntchainSdsFavorStocksResponse:
        """
        Description: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
        Summary: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_antchain_sds_favor_stocks_ex(request, headers, runtime)

    async def query_antchain_sds_favor_stocks_async(
        self,
        request: gesaasspi_models.QueryAntchainSdsFavorStocksRequest,
    ) -> gesaasspi_models.QueryAntchainSdsFavorStocksResponse:
        """
        Description: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
        Summary: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_antchain_sds_favor_stocks_ex_async(request, headers, runtime)

    def query_antchain_sds_favor_stocks_ex(
        self,
        request: gesaasspi_models.QueryAntchainSdsFavorStocksRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.QueryAntchainSdsFavorStocksResponse:
        """
        Description: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
        Summary: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.QueryAntchainSdsFavorStocksResponse(),
            self.do_request('1.0', 'antchain.sds.favor.stocks.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_antchain_sds_favor_stocks_ex_async(
        self,
        request: gesaasspi_models.QueryAntchainSdsFavorStocksRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.QueryAntchainSdsFavorStocksResponse:
        """
        Description: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
        Summary: 微信批次分页条件查询。通过此接口可查询商家多个批次的信息，包括批次的配置信息以及批次概况数据。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.QueryAntchainSdsFavorStocksResponse(),
            await self.do_request_async('1.0', 'antchain.sds.favor.stocks.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def download_antchain_sds_stock_useflow(
        self,
        request: gesaasspi_models.DownloadAntchainSdsStockUseflowRequest,
    ) -> gesaasspi_models.DownloadAntchainSdsStockUseflowResponse:
        """
        Description: 微信核销账单接口
        Summary: 微信核销账单接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.download_antchain_sds_stock_useflow_ex(request, headers, runtime)

    async def download_antchain_sds_stock_useflow_async(
        self,
        request: gesaasspi_models.DownloadAntchainSdsStockUseflowRequest,
    ) -> gesaasspi_models.DownloadAntchainSdsStockUseflowResponse:
        """
        Description: 微信核销账单接口
        Summary: 微信核销账单接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.download_antchain_sds_stock_useflow_ex_async(request, headers, runtime)

    def download_antchain_sds_stock_useflow_ex(
        self,
        request: gesaasspi_models.DownloadAntchainSdsStockUseflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.DownloadAntchainSdsStockUseflowResponse:
        """
        Description: 微信核销账单接口
        Summary: 微信核销账单接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.DownloadAntchainSdsStockUseflowResponse(),
            self.do_request('1.0', 'antchain.sds.stock.useflow.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def download_antchain_sds_stock_useflow_ex_async(
        self,
        request: gesaasspi_models.DownloadAntchainSdsStockUseflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.DownloadAntchainSdsStockUseflowResponse:
        """
        Description: 微信核销账单接口
        Summary: 微信核销账单接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.DownloadAntchainSdsStockUseflowResponse(),
            await self.do_request_async('1.0', 'antchain.sds.stock.useflow.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def download_antchain_sds_stock_refundflow(
        self,
        request: gesaasspi_models.DownloadAntchainSdsStockRefundflowRequest,
    ) -> gesaasspi_models.DownloadAntchainSdsStockRefundflowResponse:
        """
        Description: 微信退款账单接口
        Summary: 微信退款账单接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.download_antchain_sds_stock_refundflow_ex(request, headers, runtime)

    async def download_antchain_sds_stock_refundflow_async(
        self,
        request: gesaasspi_models.DownloadAntchainSdsStockRefundflowRequest,
    ) -> gesaasspi_models.DownloadAntchainSdsStockRefundflowResponse:
        """
        Description: 微信退款账单接口
        Summary: 微信退款账单接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.download_antchain_sds_stock_refundflow_ex_async(request, headers, runtime)

    def download_antchain_sds_stock_refundflow_ex(
        self,
        request: gesaasspi_models.DownloadAntchainSdsStockRefundflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.DownloadAntchainSdsStockRefundflowResponse:
        """
        Description: 微信退款账单接口
        Summary: 微信退款账单接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.DownloadAntchainSdsStockRefundflowResponse(),
            self.do_request('1.0', 'antchain.sds.stock.refundflow.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def download_antchain_sds_stock_refundflow_ex_async(
        self,
        request: gesaasspi_models.DownloadAntchainSdsStockRefundflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.DownloadAntchainSdsStockRefundflowResponse:
        """
        Description: 微信退款账单接口
        Summary: 微信退款账单接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.DownloadAntchainSdsStockRefundflowResponse(),
            await self.do_request_async('1.0', 'antchain.sds.stock.refundflow.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_antchain_sds_scenedata_task(
        self,
        request: gesaasspi_models.UpdateAntchainSdsScenedataTaskRequest,
    ) -> gesaasspi_models.UpdateAntchainSdsScenedataTaskResponse:
        """
        Description: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
        Summary: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_antchain_sds_scenedata_task_ex(request, headers, runtime)

    async def update_antchain_sds_scenedata_task_async(
        self,
        request: gesaasspi_models.UpdateAntchainSdsScenedataTaskRequest,
    ) -> gesaasspi_models.UpdateAntchainSdsScenedataTaskResponse:
        """
        Description: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
        Summary: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_antchain_sds_scenedata_task_ex_async(request, headers, runtime)

    def update_antchain_sds_scenedata_task_ex(
        self,
        request: gesaasspi_models.UpdateAntchainSdsScenedataTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.UpdateAntchainSdsScenedataTaskResponse:
        """
        Description: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
        Summary: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.UpdateAntchainSdsScenedataTaskResponse(),
            self.do_request('1.0', 'antchain.sds.scenedata.task.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_antchain_sds_scenedata_task_ex_async(
        self,
        request: gesaasspi_models.UpdateAntchainSdsScenedataTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.UpdateAntchainSdsScenedataTaskResponse:
        """
        Description: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
        Summary: 【任务修改】修改任务状态，上线的任务可以下线，下线后能够修改任务的动态参数，下线后才能再上线。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.UpdateAntchainSdsScenedataTaskResponse(),
            await self.do_request_async('1.0', 'antchain.sds.scenedata.task.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_antdigital_gesaasspi_rightsprod_status(
        self,
        request: gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodStatusRequest,
    ) -> gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodStatusResponse:
        """
        Description: 权益中心券状态变更回调通知
        Summary: 权益中心券状态变更回调通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_antdigital_gesaasspi_rightsprod_status_ex(request, headers, runtime)

    async def callback_antdigital_gesaasspi_rightsprod_status_async(
        self,
        request: gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodStatusRequest,
    ) -> gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodStatusResponse:
        """
        Description: 权益中心券状态变更回调通知
        Summary: 权益中心券状态变更回调通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_antdigital_gesaasspi_rightsprod_status_ex_async(request, headers, runtime)

    def callback_antdigital_gesaasspi_rightsprod_status_ex(
        self,
        request: gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodStatusResponse:
        """
        Description: 权益中心券状态变更回调通知
        Summary: 权益中心券状态变更回调通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodStatusResponse(),
            self.do_request('1.0', 'antdigital.gesaasspi.rightsprod.status.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_antdigital_gesaasspi_rightsprod_status_ex_async(
        self,
        request: gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodStatusResponse:
        """
        Description: 权益中心券状态变更回调通知
        Summary: 权益中心券状态变更回调通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodStatusResponse(),
            await self.do_request_async('1.0', 'antdigital.gesaasspi.rightsprod.status.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_antdigital_gesaasspi_rightsprod_operation(
        self,
        request: gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodOperationRequest,
    ) -> gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodOperationResponse:
        """
        Description: 券操作回调通知
        Summary: 券操作回调通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_antdigital_gesaasspi_rightsprod_operation_ex(request, headers, runtime)

    async def callback_antdigital_gesaasspi_rightsprod_operation_async(
        self,
        request: gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodOperationRequest,
    ) -> gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodOperationResponse:
        """
        Description: 券操作回调通知
        Summary: 券操作回调通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_antdigital_gesaasspi_rightsprod_operation_ex_async(request, headers, runtime)

    def callback_antdigital_gesaasspi_rightsprod_operation_ex(
        self,
        request: gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodOperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodOperationResponse:
        """
        Description: 券操作回调通知
        Summary: 券操作回调通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodOperationResponse(),
            self.do_request('1.0', 'antdigital.gesaasspi.rightsprod.operation.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_antdigital_gesaasspi_rightsprod_operation_ex_async(
        self,
        request: gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodOperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodOperationResponse:
        """
        Description: 券操作回调通知
        Summary: 券操作回调通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.CallbackAntdigitalGesaasspiRightsprodOperationResponse(),
            await self.do_request_async('1.0', 'antdigital.gesaasspi.rightsprod.operation.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_antdigital_gesaasspi_rightsprod_grantrights(
        self,
        request: gesaasspi_models.PushAntdigitalGesaasspiRightsprodGrantrightsRequest,
    ) -> gesaasspi_models.PushAntdigitalGesaasspiRightsprodGrantrightsResponse:
        """
        Description: 权益供应商权益发放spi
        Summary: 权益供应商权益发放spi
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_antdigital_gesaasspi_rightsprod_grantrights_ex(request, headers, runtime)

    async def push_antdigital_gesaasspi_rightsprod_grantrights_async(
        self,
        request: gesaasspi_models.PushAntdigitalGesaasspiRightsprodGrantrightsRequest,
    ) -> gesaasspi_models.PushAntdigitalGesaasspiRightsprodGrantrightsResponse:
        """
        Description: 权益供应商权益发放spi
        Summary: 权益供应商权益发放spi
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_antdigital_gesaasspi_rightsprod_grantrights_ex_async(request, headers, runtime)

    def push_antdigital_gesaasspi_rightsprod_grantrights_ex(
        self,
        request: gesaasspi_models.PushAntdigitalGesaasspiRightsprodGrantrightsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.PushAntdigitalGesaasspiRightsprodGrantrightsResponse:
        """
        Description: 权益供应商权益发放spi
        Summary: 权益供应商权益发放spi
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.PushAntdigitalGesaasspiRightsprodGrantrightsResponse(),
            self.do_request('1.0', 'antdigital.gesaasspi.rightsprod.grantrights.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_antdigital_gesaasspi_rightsprod_grantrights_ex_async(
        self,
        request: gesaasspi_models.PushAntdigitalGesaasspiRightsprodGrantrightsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.PushAntdigitalGesaasspiRightsprodGrantrightsResponse:
        """
        Description: 权益供应商权益发放spi
        Summary: 权益供应商权益发放spi
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.PushAntdigitalGesaasspiRightsprodGrantrightsResponse(),
            await self.do_request_async('1.0', 'antdigital.gesaasspi.rightsprod.grantrights.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: gesaasspi_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> gesaasspi_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: gesaasspi_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> gesaasspi_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: gesaasspi_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: gesaasspi_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> gesaasspi_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            gesaasspi_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
