# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_das import models as das_models
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
        config: das_models.Config,
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
            # 数据源接口入参定义
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
                    'sdk_version': '1.1.16'
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
            # 数据源接口入参定义
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
                    'sdk_version': '1.1.16'
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

    def upload_application_batchqueryfile(
        self,
        request: das_models.UploadApplicationBatchqueryfileRequest,
    ) -> das_models.UploadApplicationBatchqueryfileResponse:
        """
        Description: 上传批量查询数据文件
        Summary: 上传批量查询数据文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_application_batchqueryfile_ex(request, headers, runtime)

    async def upload_application_batchqueryfile_async(
        self,
        request: das_models.UploadApplicationBatchqueryfileRequest,
    ) -> das_models.UploadApplicationBatchqueryfileResponse:
        """
        Description: 上传批量查询数据文件
        Summary: 上传批量查询数据文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_application_batchqueryfile_ex_async(request, headers, runtime)

    def upload_application_batchqueryfile_ex(
        self,
        request: das_models.UploadApplicationBatchqueryfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.UploadApplicationBatchqueryfileResponse:
        """
        Description: 上传批量查询数据文件
        Summary: 上传批量查询数据文件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = das_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.das.application.batchqueryfile.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_application_batchqueryfile_response = das_models.UploadApplicationBatchqueryfileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_application_batchqueryfile_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.UploadApplicationBatchqueryfileResponse(),
            self.do_request('1.0', 'antchain.das.application.batchqueryfile.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_application_batchqueryfile_ex_async(
        self,
        request: das_models.UploadApplicationBatchqueryfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.UploadApplicationBatchqueryfileResponse:
        """
        Description: 上传批量查询数据文件
        Summary: 上传批量查询数据文件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = das_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.das.application.batchqueryfile.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_application_batchqueryfile_response = das_models.UploadApplicationBatchqueryfileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_application_batchqueryfile_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.UploadApplicationBatchqueryfileResponse(),
            await self.do_request_async('1.0', 'antchain.das.application.batchqueryfile.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_application_batchqueryresult(
        self,
        request: das_models.QueryApplicationBatchqueryresultRequest,
    ) -> das_models.QueryApplicationBatchqueryresultResponse:
        """
        Description: 获取查询数据集任务结果
        Summary: 获取查询数据集任务结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_application_batchqueryresult_ex(request, headers, runtime)

    async def query_application_batchqueryresult_async(
        self,
        request: das_models.QueryApplicationBatchqueryresultRequest,
    ) -> das_models.QueryApplicationBatchqueryresultResponse:
        """
        Description: 获取查询数据集任务结果
        Summary: 获取查询数据集任务结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_application_batchqueryresult_ex_async(request, headers, runtime)

    def query_application_batchqueryresult_ex(
        self,
        request: das_models.QueryApplicationBatchqueryresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationBatchqueryresultResponse:
        """
        Description: 获取查询数据集任务结果
        Summary: 获取查询数据集任务结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationBatchqueryresultResponse(),
            self.do_request('1.0', 'antchain.das.application.batchqueryresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_application_batchqueryresult_ex_async(
        self,
        request: das_models.QueryApplicationBatchqueryresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationBatchqueryresultResponse:
        """
        Description: 获取查询数据集任务结果
        Summary: 获取查询数据集任务结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationBatchqueryresultResponse(),
            await self.do_request_async('1.0', 'antchain.das.application.batchqueryresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_application_data(
        self,
        request: das_models.QueryApplicationDataRequest,
    ) -> das_models.QueryApplicationDataResponse:
        """
        Description: 实时获取数据源数据
        Summary: 实时查询数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_application_data_ex(request, headers, runtime)

    async def query_application_data_async(
        self,
        request: das_models.QueryApplicationDataRequest,
    ) -> das_models.QueryApplicationDataResponse:
        """
        Description: 实时获取数据源数据
        Summary: 实时查询数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_application_data_ex_async(request, headers, runtime)

    def query_application_data_ex(
        self,
        request: das_models.QueryApplicationDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationDataResponse:
        """
        Description: 实时获取数据源数据
        Summary: 实时查询数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationDataResponse(),
            self.do_request('1.0', 'antchain.das.application.data.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_application_data_ex_async(
        self,
        request: das_models.QueryApplicationDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationDataResponse:
        """
        Description: 实时获取数据源数据
        Summary: 实时查询数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationDataResponse(),
            await self.do_request_async('1.0', 'antchain.das.application.data.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_application_ipe(
        self,
        request: das_models.QueryApplicationIpeRequest,
    ) -> das_models.QueryApplicationIpeResponse:
        """
        Description: 知识产权实时接口
        Summary: 知识产权实时接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_application_ipe_ex(request, headers, runtime)

    async def query_application_ipe_async(
        self,
        request: das_models.QueryApplicationIpeRequest,
    ) -> das_models.QueryApplicationIpeResponse:
        """
        Description: 知识产权实时接口
        Summary: 知识产权实时接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_application_ipe_ex_async(request, headers, runtime)

    def query_application_ipe_ex(
        self,
        request: das_models.QueryApplicationIpeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationIpeResponse:
        """
        Description: 知识产权实时接口
        Summary: 知识产权实时接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationIpeResponse(),
            self.do_request('1.0', 'antchain.das.application.ipe.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_application_ipe_ex_async(
        self,
        request: das_models.QueryApplicationIpeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationIpeResponse:
        """
        Description: 知识产权实时接口
        Summary: 知识产权实时接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationIpeResponse(),
            await self.do_request_async('1.0', 'antchain.das.application.ipe.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_domestic_trademark(
        self,
        request: das_models.QueryDomesticTrademarkRequest,
    ) -> das_models.QueryDomesticTrademarkResponse:
        """
        Description: 查询国内商标数据
        Summary: 查询国内商标数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_domestic_trademark_ex(request, headers, runtime)

    async def query_domestic_trademark_async(
        self,
        request: das_models.QueryDomesticTrademarkRequest,
    ) -> das_models.QueryDomesticTrademarkResponse:
        """
        Description: 查询国内商标数据
        Summary: 查询国内商标数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_domestic_trademark_ex_async(request, headers, runtime)

    def query_domestic_trademark_ex(
        self,
        request: das_models.QueryDomesticTrademarkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryDomesticTrademarkResponse:
        """
        Description: 查询国内商标数据
        Summary: 查询国内商标数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryDomesticTrademarkResponse(),
            self.do_request('1.0', 'antchain.das.domestic.trademark.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_domestic_trademark_ex_async(
        self,
        request: das_models.QueryDomesticTrademarkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryDomesticTrademarkResponse:
        """
        Description: 查询国内商标数据
        Summary: 查询国内商标数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryDomesticTrademarkResponse(),
            await self.do_request_async('1.0', 'antchain.das.domestic.trademark.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_domestic_trademarklogo(
        self,
        request: das_models.GetDomesticTrademarklogoRequest,
    ) -> das_models.GetDomesticTrademarklogoResponse:
        """
        Description: 获取国内商标LOGO文件
        Summary: 获取国内商标LOGO文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_domestic_trademarklogo_ex(request, headers, runtime)

    async def get_domestic_trademarklogo_async(
        self,
        request: das_models.GetDomesticTrademarklogoRequest,
    ) -> das_models.GetDomesticTrademarklogoResponse:
        """
        Description: 获取国内商标LOGO文件
        Summary: 获取国内商标LOGO文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_domestic_trademarklogo_ex_async(request, headers, runtime)

    def get_domestic_trademarklogo_ex(
        self,
        request: das_models.GetDomesticTrademarklogoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.GetDomesticTrademarklogoResponse:
        """
        Description: 获取国内商标LOGO文件
        Summary: 获取国内商标LOGO文件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.GetDomesticTrademarklogoResponse(),
            self.do_request('1.0', 'antchain.das.domestic.trademarklogo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_domestic_trademarklogo_ex_async(
        self,
        request: das_models.GetDomesticTrademarklogoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.GetDomesticTrademarklogoResponse:
        """
        Description: 获取国内商标LOGO文件
        Summary: 获取国内商标LOGO文件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.GetDomesticTrademarklogoResponse(),
            await self.do_request_async('1.0', 'antchain.das.domestic.trademarklogo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_encrypt_enterpriseinfo(
        self,
        request: das_models.QueryEncryptEnterpriseinfoRequest,
    ) -> das_models.QueryEncryptEnterpriseinfoResponse:
        """
        Description: 查询加密的企业工商信息
        Summary: 查询加密的企业工商信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_encrypt_enterpriseinfo_ex(request, headers, runtime)

    async def query_encrypt_enterpriseinfo_async(
        self,
        request: das_models.QueryEncryptEnterpriseinfoRequest,
    ) -> das_models.QueryEncryptEnterpriseinfoResponse:
        """
        Description: 查询加密的企业工商信息
        Summary: 查询加密的企业工商信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_encrypt_enterpriseinfo_ex_async(request, headers, runtime)

    def query_encrypt_enterpriseinfo_ex(
        self,
        request: das_models.QueryEncryptEnterpriseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryEncryptEnterpriseinfoResponse:
        """
        Description: 查询加密的企业工商信息
        Summary: 查询加密的企业工商信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryEncryptEnterpriseinfoResponse(),
            self.do_request('1.0', 'antchain.das.encrypt.enterpriseinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_encrypt_enterpriseinfo_ex_async(
        self,
        request: das_models.QueryEncryptEnterpriseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryEncryptEnterpriseinfoResponse:
        """
        Description: 查询加密的企业工商信息
        Summary: 查询加密的企业工商信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryEncryptEnterpriseinfoResponse(),
            await self.do_request_async('1.0', 'antchain.das.encrypt.enterpriseinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_das_link(
        self,
        request: das_models.GetDasLinkRequest,
    ) -> das_models.GetDasLinkResponse:
        """
        Description: 获取授权H5页面链接
        Summary: 获取授权H5页面链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_das_link_ex(request, headers, runtime)

    async def get_das_link_async(
        self,
        request: das_models.GetDasLinkRequest,
    ) -> das_models.GetDasLinkResponse:
        """
        Description: 获取授权H5页面链接
        Summary: 获取授权H5页面链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_das_link_ex_async(request, headers, runtime)

    def get_das_link_ex(
        self,
        request: das_models.GetDasLinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.GetDasLinkResponse:
        """
        Description: 获取授权H5页面链接
        Summary: 获取授权H5页面链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.GetDasLinkResponse(),
            self.do_request('1.0', 'antchain.das.das.link.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_das_link_ex_async(
        self,
        request: das_models.GetDasLinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.GetDasLinkResponse:
        """
        Description: 获取授权H5页面链接
        Summary: 获取授权H5页面链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.GetDasLinkResponse(),
            await self.do_request_async('1.0', 'antchain.das.das.link.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_das_enterprisevc(
        self,
        request: das_models.GetDasEnterprisevcRequest,
    ) -> das_models.GetDasEnterprisevcResponse:
        """
        Description: 获取授权企业VC
        Summary: 获取授权企业VC
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_das_enterprisevc_ex(request, headers, runtime)

    async def get_das_enterprisevc_async(
        self,
        request: das_models.GetDasEnterprisevcRequest,
    ) -> das_models.GetDasEnterprisevcResponse:
        """
        Description: 获取授权企业VC
        Summary: 获取授权企业VC
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_das_enterprisevc_ex_async(request, headers, runtime)

    def get_das_enterprisevc_ex(
        self,
        request: das_models.GetDasEnterprisevcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.GetDasEnterprisevcResponse:
        """
        Description: 获取授权企业VC
        Summary: 获取授权企业VC
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.GetDasEnterprisevcResponse(),
            self.do_request('1.0', 'antchain.das.das.enterprisevc.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_das_enterprisevc_ex_async(
        self,
        request: das_models.GetDasEnterprisevcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.GetDasEnterprisevcResponse:
        """
        Description: 获取授权企业VC
        Summary: 获取授权企业VC
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.GetDasEnterprisevcResponse(),
            await self.do_request_async('1.0', 'antchain.das.das.enterprisevc.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_das_individualvc(
        self,
        request: das_models.GetDasIndividualvcRequest,
    ) -> das_models.GetDasIndividualvcResponse:
        """
        Description: 获取个人VC
        Summary: 获取个人VC
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_das_individualvc_ex(request, headers, runtime)

    async def get_das_individualvc_async(
        self,
        request: das_models.GetDasIndividualvcRequest,
    ) -> das_models.GetDasIndividualvcResponse:
        """
        Description: 获取个人VC
        Summary: 获取个人VC
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_das_individualvc_ex_async(request, headers, runtime)

    def get_das_individualvc_ex(
        self,
        request: das_models.GetDasIndividualvcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.GetDasIndividualvcResponse:
        """
        Description: 获取个人VC
        Summary: 获取个人VC
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.GetDasIndividualvcResponse(),
            self.do_request('1.0', 'antchain.das.das.individualvc.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_das_individualvc_ex_async(
        self,
        request: das_models.GetDasIndividualvcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.GetDasIndividualvcResponse:
        """
        Description: 获取个人VC
        Summary: 获取个人VC
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.GetDasIndividualvcResponse(),
            await self.do_request_async('1.0', 'antchain.das.das.individualvc.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_das_sms(
        self,
        request: das_models.SendDasSmsRequest,
    ) -> das_models.SendDasSmsResponse:
        """
        Description: 发送短信验证码
        Summary: 发送短信验证码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_das_sms_ex(request, headers, runtime)

    async def send_das_sms_async(
        self,
        request: das_models.SendDasSmsRequest,
    ) -> das_models.SendDasSmsResponse:
        """
        Description: 发送短信验证码
        Summary: 发送短信验证码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_das_sms_ex_async(request, headers, runtime)

    def send_das_sms_ex(
        self,
        request: das_models.SendDasSmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.SendDasSmsResponse:
        """
        Description: 发送短信验证码
        Summary: 发送短信验证码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.SendDasSmsResponse(),
            self.do_request('1.0', 'antchain.das.das.sms.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_das_sms_ex_async(
        self,
        request: das_models.SendDasSmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.SendDasSmsResponse:
        """
        Description: 发送短信验证码
        Summary: 发送短信验证码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.SendDasSmsResponse(),
            await self.do_request_async('1.0', 'antchain.das.das.sms.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_das_sms(
        self,
        request: das_models.AuthDasSmsRequest,
    ) -> das_models.AuthDasSmsResponse:
        """
        Description: 通过短信验证码授权
        Summary: 通过短信验证码授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_das_sms_ex(request, headers, runtime)

    async def auth_das_sms_async(
        self,
        request: das_models.AuthDasSmsRequest,
    ) -> das_models.AuthDasSmsResponse:
        """
        Description: 通过短信验证码授权
        Summary: 通过短信验证码授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_das_sms_ex_async(request, headers, runtime)

    def auth_das_sms_ex(
        self,
        request: das_models.AuthDasSmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.AuthDasSmsResponse:
        """
        Description: 通过短信验证码授权
        Summary: 通过短信验证码授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.AuthDasSmsResponse(),
            self.do_request('1.0', 'antchain.das.das.sms.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_das_sms_ex_async(
        self,
        request: das_models.AuthDasSmsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.AuthDasSmsResponse:
        """
        Description: 通过短信验证码授权
        Summary: 通过短信验证码授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.AuthDasSmsResponse(),
            await self.do_request_async('1.0', 'antchain.das.das.sms.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_das_enterprise(
        self,
        request: das_models.VerifyDasEnterpriseRequest,
    ) -> das_models.VerifyDasEnterpriseResponse:
        """
        Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
        Summary: 企业信息核验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_das_enterprise_ex(request, headers, runtime)

    async def verify_das_enterprise_async(
        self,
        request: das_models.VerifyDasEnterpriseRequest,
    ) -> das_models.VerifyDasEnterpriseResponse:
        """
        Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
        Summary: 企业信息核验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_das_enterprise_ex_async(request, headers, runtime)

    def verify_das_enterprise_ex(
        self,
        request: das_models.VerifyDasEnterpriseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.VerifyDasEnterpriseResponse:
        """
        Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
        Summary: 企业信息核验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.VerifyDasEnterpriseResponse(),
            self.do_request('1.0', 'antchain.das.das.enterprise.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_das_enterprise_ex_async(
        self,
        request: das_models.VerifyDasEnterpriseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.VerifyDasEnterpriseResponse:
        """
        Description: 根据VC针对提供的授权企业、被授权企业、授权数据做核验。
        Summary: 企业信息核验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.VerifyDasEnterpriseResponse(),
            await self.do_request_async('1.0', 'antchain.das.das.enterprise.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_das_individual(
        self,
        request: das_models.VerifyDasIndividualRequest,
    ) -> das_models.VerifyDasIndividualResponse:
        """
        Description: 个人信息核验
        Summary: 个人信息核验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_das_individual_ex(request, headers, runtime)

    async def verify_das_individual_async(
        self,
        request: das_models.VerifyDasIndividualRequest,
    ) -> das_models.VerifyDasIndividualResponse:
        """
        Description: 个人信息核验
        Summary: 个人信息核验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_das_individual_ex_async(request, headers, runtime)

    def verify_das_individual_ex(
        self,
        request: das_models.VerifyDasIndividualRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.VerifyDasIndividualResponse:
        """
        Description: 个人信息核验
        Summary: 个人信息核验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.VerifyDasIndividualResponse(),
            self.do_request('1.0', 'antchain.das.das.individual.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_das_individual_ex_async(
        self,
        request: das_models.VerifyDasIndividualRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.VerifyDasIndividualResponse:
        """
        Description: 个人信息核验
        Summary: 个人信息核验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.VerifyDasIndividualResponse(),
            await self.do_request_async('1.0', 'antchain.das.das.individual.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_das_datasource(
        self,
        request: das_models.CreateDasDatasourceRequest,
    ) -> das_models.CreateDasDatasourceResponse:
        """
        Description: 创建数据源
        Summary: 创建数据源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_das_datasource_ex(request, headers, runtime)

    async def create_das_datasource_async(
        self,
        request: das_models.CreateDasDatasourceRequest,
    ) -> das_models.CreateDasDatasourceResponse:
        """
        Description: 创建数据源
        Summary: 创建数据源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_das_datasource_ex_async(request, headers, runtime)

    def create_das_datasource_ex(
        self,
        request: das_models.CreateDasDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.CreateDasDatasourceResponse:
        """
        Description: 创建数据源
        Summary: 创建数据源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.CreateDasDatasourceResponse(),
            self.do_request('1.0', 'antchain.das.das.datasource.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_das_datasource_ex_async(
        self,
        request: das_models.CreateDasDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.CreateDasDatasourceResponse:
        """
        Description: 创建数据源
        Summary: 创建数据源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.CreateDasDatasourceResponse(),
            await self.do_request_async('1.0', 'antchain.das.das.datasource.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_das_datasource(
        self,
        request: das_models.UpdateDasDatasourceRequest,
    ) -> das_models.UpdateDasDatasourceResponse:
        """
        Description: 更新数据源
        Summary: 更新数据源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_das_datasource_ex(request, headers, runtime)

    async def update_das_datasource_async(
        self,
        request: das_models.UpdateDasDatasourceRequest,
    ) -> das_models.UpdateDasDatasourceResponse:
        """
        Description: 更新数据源
        Summary: 更新数据源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_das_datasource_ex_async(request, headers, runtime)

    def update_das_datasource_ex(
        self,
        request: das_models.UpdateDasDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.UpdateDasDatasourceResponse:
        """
        Description: 更新数据源
        Summary: 更新数据源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.UpdateDasDatasourceResponse(),
            self.do_request('1.0', 'antchain.das.das.datasource.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_das_datasource_ex_async(
        self,
        request: das_models.UpdateDasDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.UpdateDasDatasourceResponse:
        """
        Description: 更新数据源
        Summary: 更新数据源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.UpdateDasDatasourceResponse(),
            await self.do_request_async('1.0', 'antchain.das.das.datasource.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_das_datasource(
        self,
        request: das_models.DeleteDasDatasourceRequest,
    ) -> das_models.DeleteDasDatasourceResponse:
        """
        Description: 删除数据源
        Summary: 删除数据源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_das_datasource_ex(request, headers, runtime)

    async def delete_das_datasource_async(
        self,
        request: das_models.DeleteDasDatasourceRequest,
    ) -> das_models.DeleteDasDatasourceResponse:
        """
        Description: 删除数据源
        Summary: 删除数据源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_das_datasource_ex_async(request, headers, runtime)

    def delete_das_datasource_ex(
        self,
        request: das_models.DeleteDasDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.DeleteDasDatasourceResponse:
        """
        Description: 删除数据源
        Summary: 删除数据源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.DeleteDasDatasourceResponse(),
            self.do_request('1.0', 'antchain.das.das.datasource.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_das_datasource_ex_async(
        self,
        request: das_models.DeleteDasDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.DeleteDasDatasourceResponse:
        """
        Description: 删除数据源
        Summary: 删除数据源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.DeleteDasDatasourceResponse(),
            await self.do_request_async('1.0', 'antchain.das.das.datasource.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_das_datasource(
        self,
        request: das_models.QueryDasDatasourceRequest,
    ) -> das_models.QueryDasDatasourceResponse:
        """
        Description: 查询数据源信息
        Summary: 查询数据源信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_das_datasource_ex(request, headers, runtime)

    async def query_das_datasource_async(
        self,
        request: das_models.QueryDasDatasourceRequest,
    ) -> das_models.QueryDasDatasourceResponse:
        """
        Description: 查询数据源信息
        Summary: 查询数据源信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_das_datasource_ex_async(request, headers, runtime)

    def query_das_datasource_ex(
        self,
        request: das_models.QueryDasDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryDasDatasourceResponse:
        """
        Description: 查询数据源信息
        Summary: 查询数据源信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryDasDatasourceResponse(),
            self.do_request('1.0', 'antchain.das.das.datasource.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_das_datasource_ex_async(
        self,
        request: das_models.QueryDasDatasourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryDasDatasourceResponse:
        """
        Description: 查询数据源信息
        Summary: 查询数据源信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryDasDatasourceResponse(),
            await self.do_request_async('1.0', 'antchain.das.das.datasource.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_das_authresult(
        self,
        request: das_models.VerifyDasAuthresultRequest,
    ) -> das_models.VerifyDasAuthresultResponse:
        """
        Description: 校验授权结果
        Summary: 校验授权结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_das_authresult_ex(request, headers, runtime)

    async def verify_das_authresult_async(
        self,
        request: das_models.VerifyDasAuthresultRequest,
    ) -> das_models.VerifyDasAuthresultResponse:
        """
        Description: 校验授权结果
        Summary: 校验授权结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_das_authresult_ex_async(request, headers, runtime)

    def verify_das_authresult_ex(
        self,
        request: das_models.VerifyDasAuthresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.VerifyDasAuthresultResponse:
        """
        Description: 校验授权结果
        Summary: 校验授权结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.VerifyDasAuthresultResponse(),
            self.do_request('1.0', 'antchain.das.das.authresult.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_das_authresult_ex_async(
        self,
        request: das_models.VerifyDasAuthresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.VerifyDasAuthresultResponse:
        """
        Description: 校验授权结果
        Summary: 校验授权结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.VerifyDasAuthresultResponse(),
            await self.do_request_async('1.0', 'antchain.das.das.authresult.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_das_authresult(
        self,
        request: das_models.AuthDasAuthresultRequest,
    ) -> das_models.AuthDasAuthresultResponse:
        """
        Description: 根据授权三方信息做授权
        Summary: 根据授权三方信息做授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_das_authresult_ex(request, headers, runtime)

    async def auth_das_authresult_async(
        self,
        request: das_models.AuthDasAuthresultRequest,
    ) -> das_models.AuthDasAuthresultResponse:
        """
        Description: 根据授权三方信息做授权
        Summary: 根据授权三方信息做授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_das_authresult_ex_async(request, headers, runtime)

    def auth_das_authresult_ex(
        self,
        request: das_models.AuthDasAuthresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.AuthDasAuthresultResponse:
        """
        Description: 根据授权三方信息做授权
        Summary: 根据授权三方信息做授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.AuthDasAuthresultResponse(),
            self.do_request('1.0', 'antchain.das.das.authresult.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_das_authresult_ex_async(
        self,
        request: das_models.AuthDasAuthresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.AuthDasAuthresultResponse:
        """
        Description: 根据授权三方信息做授权
        Summary: 根据授权三方信息做授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.AuthDasAuthresultResponse(),
            await self.do_request_async('1.0', 'antchain.das.das.authresult.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: das_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> das_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: das_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> das_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: das_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: das_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
