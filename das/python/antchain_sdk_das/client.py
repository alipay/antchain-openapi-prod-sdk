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
            # 主要人员
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
                    'sdk_version': '1.1.74',
                    '_prod_code': 'DAS',
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
            # 主要人员
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
                    'sdk_version': '1.1.74',
                    '_prod_code': 'DAS',
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
            request.file_object = None
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
            request.file_object = None
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

    def upload_application_authfile(
        self,
        request: das_models.UploadApplicationAuthfileRequest,
    ) -> das_models.UploadApplicationAuthfileResponse:
        """
        Description: 上传授权协议文件
        Summary: 上传授权协议文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_application_authfile_ex(request, headers, runtime)

    async def upload_application_authfile_async(
        self,
        request: das_models.UploadApplicationAuthfileRequest,
    ) -> das_models.UploadApplicationAuthfileResponse:
        """
        Description: 上传授权协议文件
        Summary: 上传授权协议文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_application_authfile_ex_async(request, headers, runtime)

    def upload_application_authfile_ex(
        self,
        request: das_models.UploadApplicationAuthfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.UploadApplicationAuthfileResponse:
        """
        Description: 上传授权协议文件
        Summary: 上传授权协议文件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = das_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.das.application.authfile.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_application_authfile_response = das_models.UploadApplicationAuthfileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_application_authfile_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.UploadApplicationAuthfileResponse(),
            self.do_request('1.0', 'antchain.das.application.authfile.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_application_authfile_ex_async(
        self,
        request: das_models.UploadApplicationAuthfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.UploadApplicationAuthfileResponse:
        """
        Description: 上传授权协议文件
        Summary: 上传授权协议文件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = das_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.das.application.authfile.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_application_authfile_response = das_models.UploadApplicationAuthfileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_application_authfile_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.UploadApplicationAuthfileResponse(),
            await self.do_request_async('1.0', 'antchain.das.application.authfile.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_application_hascar(
        self,
        request: das_models.CheckApplicationHascarRequest,
    ) -> das_models.CheckApplicationHascarResponse:
        """
        Description: 校验用户是否车
        Summary: 校验用户是否车
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_application_hascar_ex(request, headers, runtime)

    async def check_application_hascar_async(
        self,
        request: das_models.CheckApplicationHascarRequest,
    ) -> das_models.CheckApplicationHascarResponse:
        """
        Description: 校验用户是否车
        Summary: 校验用户是否车
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_application_hascar_ex_async(request, headers, runtime)

    def check_application_hascar_ex(
        self,
        request: das_models.CheckApplicationHascarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.CheckApplicationHascarResponse:
        """
        Description: 校验用户是否车
        Summary: 校验用户是否车
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.CheckApplicationHascarResponse(),
            self.do_request('1.0', 'antchain.das.application.hascar.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_application_hascar_ex_async(
        self,
        request: das_models.CheckApplicationHascarRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.CheckApplicationHascarResponse:
        """
        Description: 校验用户是否车
        Summary: 校验用户是否车
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.CheckApplicationHascarResponse(),
            await self.do_request_async('1.0', 'antchain.das.application.hascar.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_application_basecarinfo(
        self,
        request: das_models.QueryApplicationBasecarinfoRequest,
    ) -> das_models.QueryApplicationBasecarinfoResponse:
        """
        Description: 查询车辆基础信息
        Summary: 查询车辆基础信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_application_basecarinfo_ex(request, headers, runtime)

    async def query_application_basecarinfo_async(
        self,
        request: das_models.QueryApplicationBasecarinfoRequest,
    ) -> das_models.QueryApplicationBasecarinfoResponse:
        """
        Description: 查询车辆基础信息
        Summary: 查询车辆基础信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_application_basecarinfo_ex_async(request, headers, runtime)

    def query_application_basecarinfo_ex(
        self,
        request: das_models.QueryApplicationBasecarinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationBasecarinfoResponse:
        """
        Description: 查询车辆基础信息
        Summary: 查询车辆基础信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationBasecarinfoResponse(),
            self.do_request('1.0', 'antchain.das.application.basecarinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_application_basecarinfo_ex_async(
        self,
        request: das_models.QueryApplicationBasecarinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationBasecarinfoResponse:
        """
        Description: 查询车辆基础信息
        Summary: 查询车辆基础信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationBasecarinfoResponse(),
            await self.do_request_async('1.0', 'antchain.das.application.basecarinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_application_detailcarinfo(
        self,
        request: das_models.QueryApplicationDetailcarinfoRequest,
    ) -> das_models.QueryApplicationDetailcarinfoResponse:
        """
        Description: 查询车辆详细信息
        Summary: 查询车辆详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_application_detailcarinfo_ex(request, headers, runtime)

    async def query_application_detailcarinfo_async(
        self,
        request: das_models.QueryApplicationDetailcarinfoRequest,
    ) -> das_models.QueryApplicationDetailcarinfoResponse:
        """
        Description: 查询车辆详细信息
        Summary: 查询车辆详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_application_detailcarinfo_ex_async(request, headers, runtime)

    def query_application_detailcarinfo_ex(
        self,
        request: das_models.QueryApplicationDetailcarinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationDetailcarinfoResponse:
        """
        Description: 查询车辆详细信息
        Summary: 查询车辆详细信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationDetailcarinfoResponse(),
            self.do_request('1.0', 'antchain.das.application.detailcarinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_application_detailcarinfo_ex_async(
        self,
        request: das_models.QueryApplicationDetailcarinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationDetailcarinfoResponse:
        """
        Description: 查询车辆详细信息
        Summary: 查询车辆详细信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationDetailcarinfoResponse(),
            await self.do_request_async('1.0', 'antchain.das.application.detailcarinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sign_application_resume(
        self,
        request: das_models.SignApplicationResumeRequest,
    ) -> das_models.SignApplicationResumeResponse:
        """
        Description: 授权简历查询服务
        Summary: 授权简历查询服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sign_application_resume_ex(request, headers, runtime)

    async def sign_application_resume_async(
        self,
        request: das_models.SignApplicationResumeRequest,
    ) -> das_models.SignApplicationResumeResponse:
        """
        Description: 授权简历查询服务
        Summary: 授权简历查询服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sign_application_resume_ex_async(request, headers, runtime)

    def sign_application_resume_ex(
        self,
        request: das_models.SignApplicationResumeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.SignApplicationResumeResponse:
        """
        Description: 授权简历查询服务
        Summary: 授权简历查询服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.SignApplicationResumeResponse(),
            self.do_request('1.0', 'antchain.das.application.resume.sign', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sign_application_resume_ex_async(
        self,
        request: das_models.SignApplicationResumeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.SignApplicationResumeResponse:
        """
        Description: 授权简历查询服务
        Summary: 授权简历查询服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.SignApplicationResumeResponse(),
            await self.do_request_async('1.0', 'antchain.das.application.resume.sign', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_application_resume(
        self,
        request: das_models.QueryApplicationResumeRequest,
    ) -> das_models.QueryApplicationResumeResponse:
        """
        Description: 查询简历信息
        Summary: 查询简历信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_application_resume_ex(request, headers, runtime)

    async def query_application_resume_async(
        self,
        request: das_models.QueryApplicationResumeRequest,
    ) -> das_models.QueryApplicationResumeResponse:
        """
        Description: 查询简历信息
        Summary: 查询简历信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_application_resume_ex_async(request, headers, runtime)

    def query_application_resume_ex(
        self,
        request: das_models.QueryApplicationResumeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationResumeResponse:
        """
        Description: 查询简历信息
        Summary: 查询简历信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationResumeResponse(),
            self.do_request('1.0', 'antchain.das.application.resume.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_application_resume_ex_async(
        self,
        request: das_models.QueryApplicationResumeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationResumeResponse:
        """
        Description: 查询简历信息
        Summary: 查询简历信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationResumeResponse(),
            await self.do_request_async('1.0', 'antchain.das.application.resume.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_detailcarinfo_pesonandlic(
        self,
        request: das_models.QueryDetailcarinfoPesonandlicRequest,
    ) -> das_models.QueryDetailcarinfoPesonandlicResponse:
        """
        Description: 人车核验并查询车辆详细信息
        Summary: 人车核验并查询车辆详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_detailcarinfo_pesonandlic_ex(request, headers, runtime)

    async def query_detailcarinfo_pesonandlic_async(
        self,
        request: das_models.QueryDetailcarinfoPesonandlicRequest,
    ) -> das_models.QueryDetailcarinfoPesonandlicResponse:
        """
        Description: 人车核验并查询车辆详细信息
        Summary: 人车核验并查询车辆详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_detailcarinfo_pesonandlic_ex_async(request, headers, runtime)

    def query_detailcarinfo_pesonandlic_ex(
        self,
        request: das_models.QueryDetailcarinfoPesonandlicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryDetailcarinfoPesonandlicResponse:
        """
        Description: 人车核验并查询车辆详细信息
        Summary: 人车核验并查询车辆详细信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryDetailcarinfoPesonandlicResponse(),
            self.do_request('1.0', 'antchain.das.detailcarinfo.pesonandlic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_detailcarinfo_pesonandlic_ex_async(
        self,
        request: das_models.QueryDetailcarinfoPesonandlicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryDetailcarinfoPesonandlicResponse:
        """
        Description: 人车核验并查询车辆详细信息
        Summary: 人车核验并查询车辆详细信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryDetailcarinfoPesonandlicResponse(),
            await self.do_request_async('1.0', 'antchain.das.detailcarinfo.pesonandlic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_idnumber_educationtaginfo(
        self,
        request: das_models.QueryIdnumberEducationtaginfoRequest,
    ) -> das_models.QueryIdnumberEducationtaginfoResponse:
        """
        Description: 教育标签(姓名身份证)信息查询
        Summary: 教育标签(姓名身份证)信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_idnumber_educationtaginfo_ex(request, headers, runtime)

    async def query_idnumber_educationtaginfo_async(
        self,
        request: das_models.QueryIdnumberEducationtaginfoRequest,
    ) -> das_models.QueryIdnumberEducationtaginfoResponse:
        """
        Description: 教育标签(姓名身份证)信息查询
        Summary: 教育标签(姓名身份证)信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_idnumber_educationtaginfo_ex_async(request, headers, runtime)

    def query_idnumber_educationtaginfo_ex(
        self,
        request: das_models.QueryIdnumberEducationtaginfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryIdnumberEducationtaginfoResponse:
        """
        Description: 教育标签(姓名身份证)信息查询
        Summary: 教育标签(姓名身份证)信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryIdnumberEducationtaginfoResponse(),
            self.do_request('1.0', 'antchain.das.idnumber.educationtaginfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_idnumber_educationtaginfo_ex_async(
        self,
        request: das_models.QueryIdnumberEducationtaginfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryIdnumberEducationtaginfoResponse:
        """
        Description: 教育标签(姓名身份证)信息查询
        Summary: 教育标签(姓名身份证)信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryIdnumberEducationtaginfoResponse(),
            await self.do_request_async('1.0', 'antchain.das.idnumber.educationtaginfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_phonenumber_educationinfo(
        self,
        request: das_models.QueryPhonenumberEducationinfoRequest,
    ) -> das_models.QueryPhonenumberEducationinfoResponse:
        """
        Description: 教育信息查询（姓名手机号/姓名身份证）
        Summary: 教育信息查询（姓名手机号/姓名身份证）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_phonenumber_educationinfo_ex(request, headers, runtime)

    async def query_phonenumber_educationinfo_async(
        self,
        request: das_models.QueryPhonenumberEducationinfoRequest,
    ) -> das_models.QueryPhonenumberEducationinfoResponse:
        """
        Description: 教育信息查询（姓名手机号/姓名身份证）
        Summary: 教育信息查询（姓名手机号/姓名身份证）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_phonenumber_educationinfo_ex_async(request, headers, runtime)

    def query_phonenumber_educationinfo_ex(
        self,
        request: das_models.QueryPhonenumberEducationinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryPhonenumberEducationinfoResponse:
        """
        Description: 教育信息查询（姓名手机号/姓名身份证）
        Summary: 教育信息查询（姓名手机号/姓名身份证）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryPhonenumberEducationinfoResponse(),
            self.do_request('1.0', 'antchain.das.phonenumber.educationinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_phonenumber_educationinfo_ex_async(
        self,
        request: das_models.QueryPhonenumberEducationinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryPhonenumberEducationinfoResponse:
        """
        Description: 教育信息查询（姓名手机号/姓名身份证）
        Summary: 教育信息查询（姓名手机号/姓名身份证）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryPhonenumberEducationinfoResponse(),
            await self.do_request_async('1.0', 'antchain.das.phonenumber.educationinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_application_unifiedentrance(
        self,
        request: das_models.QueryApplicationUnifiedentranceRequest,
    ) -> das_models.QueryApplicationUnifiedentranceResponse:
        """
        Description: 数据应用统一入口
        Summary: 数据应用统一入口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_application_unifiedentrance_ex(request, headers, runtime)

    async def query_application_unifiedentrance_async(
        self,
        request: das_models.QueryApplicationUnifiedentranceRequest,
    ) -> das_models.QueryApplicationUnifiedentranceResponse:
        """
        Description: 数据应用统一入口
        Summary: 数据应用统一入口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_application_unifiedentrance_ex_async(request, headers, runtime)

    def query_application_unifiedentrance_ex(
        self,
        request: das_models.QueryApplicationUnifiedentranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationUnifiedentranceResponse:
        """
        Description: 数据应用统一入口
        Summary: 数据应用统一入口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationUnifiedentranceResponse(),
            self.do_request('1.0', 'antchain.das.application.unifiedentrance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_application_unifiedentrance_ex_async(
        self,
        request: das_models.QueryApplicationUnifiedentranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationUnifiedentranceResponse:
        """
        Description: 数据应用统一入口
        Summary: 数据应用统一入口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationUnifiedentranceResponse(),
            await self.do_request_async('1.0', 'antchain.das.application.unifiedentrance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_application_driverlicensecert(
        self,
        request: das_models.QueryApplicationDriverlicensecertRequest,
    ) -> das_models.QueryApplicationDriverlicensecertResponse:
        """
        Description: 根据姓名和身份证，返回驾驶证核验信息
        Summary: 驾驶证核验信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_application_driverlicensecert_ex(request, headers, runtime)

    async def query_application_driverlicensecert_async(
        self,
        request: das_models.QueryApplicationDriverlicensecertRequest,
    ) -> das_models.QueryApplicationDriverlicensecertResponse:
        """
        Description: 根据姓名和身份证，返回驾驶证核验信息
        Summary: 驾驶证核验信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_application_driverlicensecert_ex_async(request, headers, runtime)

    def query_application_driverlicensecert_ex(
        self,
        request: das_models.QueryApplicationDriverlicensecertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationDriverlicensecertResponse:
        """
        Description: 根据姓名和身份证，返回驾驶证核验信息
        Summary: 驾驶证核验信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationDriverlicensecertResponse(),
            self.do_request('1.0', 'antchain.das.application.driverlicensecert.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_application_driverlicensecert_ex_async(
        self,
        request: das_models.QueryApplicationDriverlicensecertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationDriverlicensecertResponse:
        """
        Description: 根据姓名和身份证，返回驾驶证核验信息
        Summary: 驾驶证核验信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationDriverlicensecertResponse(),
            await self.do_request_async('1.0', 'antchain.das.application.driverlicensecert.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_application_vehiclelicensecert(
        self,
        request: das_models.QueryApplicationVehiclelicensecertRequest,
    ) -> das_models.QueryApplicationVehiclelicensecertResponse:
        """
        Description: 根据车牌号所有人等信息，返回行驶证核验结果
        Summary: 行驶证核验信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_application_vehiclelicensecert_ex(request, headers, runtime)

    async def query_application_vehiclelicensecert_async(
        self,
        request: das_models.QueryApplicationVehiclelicensecertRequest,
    ) -> das_models.QueryApplicationVehiclelicensecertResponse:
        """
        Description: 根据车牌号所有人等信息，返回行驶证核验结果
        Summary: 行驶证核验信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_application_vehiclelicensecert_ex_async(request, headers, runtime)

    def query_application_vehiclelicensecert_ex(
        self,
        request: das_models.QueryApplicationVehiclelicensecertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationVehiclelicensecertResponse:
        """
        Description: 根据车牌号所有人等信息，返回行驶证核验结果
        Summary: 行驶证核验信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationVehiclelicensecertResponse(),
            self.do_request('1.0', 'antchain.das.application.vehiclelicensecert.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_application_vehiclelicensecert_ex_async(
        self,
        request: das_models.QueryApplicationVehiclelicensecertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationVehiclelicensecertResponse:
        """
        Description: 根据车牌号所有人等信息，返回行驶证核验结果
        Summary: 行驶证核验信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationVehiclelicensecertResponse(),
            await self.do_request_async('1.0', 'antchain.das.application.vehiclelicensecert.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_application_educationstatus(
        self,
        request: das_models.QueryApplicationEducationstatusRequest,
    ) -> das_models.QueryApplicationEducationstatusResponse:
        """
        Description: 根据姓名身份证信息查询学籍信息
        Summary: 根据姓名身份证信息查询学籍
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_application_educationstatus_ex(request, headers, runtime)

    async def query_application_educationstatus_async(
        self,
        request: das_models.QueryApplicationEducationstatusRequest,
    ) -> das_models.QueryApplicationEducationstatusResponse:
        """
        Description: 根据姓名身份证信息查询学籍信息
        Summary: 根据姓名身份证信息查询学籍
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_application_educationstatus_ex_async(request, headers, runtime)

    def query_application_educationstatus_ex(
        self,
        request: das_models.QueryApplicationEducationstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationEducationstatusResponse:
        """
        Description: 根据姓名身份证信息查询学籍信息
        Summary: 根据姓名身份证信息查询学籍
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationEducationstatusResponse(),
            self.do_request('1.0', 'antchain.das.application.educationstatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_application_educationstatus_ex_async(
        self,
        request: das_models.QueryApplicationEducationstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationEducationstatusResponse:
        """
        Description: 根据姓名身份证信息查询学籍信息
        Summary: 根据姓名身份证信息查询学籍
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationEducationstatusResponse(),
            await self.do_request_async('1.0', 'antchain.das.application.educationstatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_service_authfile(
        self,
        request: das_models.UploadServiceAuthfileRequest,
    ) -> das_models.UploadServiceAuthfileResponse:
        """
        Description: 数据服务授权文件上传
        Summary: 数据服务授权文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_service_authfile_ex(request, headers, runtime)

    async def upload_service_authfile_async(
        self,
        request: das_models.UploadServiceAuthfileRequest,
    ) -> das_models.UploadServiceAuthfileResponse:
        """
        Description: 数据服务授权文件上传
        Summary: 数据服务授权文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_service_authfile_ex_async(request, headers, runtime)

    def upload_service_authfile_ex(
        self,
        request: das_models.UploadServiceAuthfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.UploadServiceAuthfileResponse:
        """
        Description: 数据服务授权文件上传
        Summary: 数据服务授权文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = das_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.das.service.authfile.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_service_authfile_response = das_models.UploadServiceAuthfileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_service_authfile_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.UploadServiceAuthfileResponse(),
            self.do_request('1.0', 'antchain.das.service.authfile.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_service_authfile_ex_async(
        self,
        request: das_models.UploadServiceAuthfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.UploadServiceAuthfileResponse:
        """
        Description: 数据服务授权文件上传
        Summary: 数据服务授权文件上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = das_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.das.service.authfile.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_service_authfile_response = das_models.UploadServiceAuthfileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_service_authfile_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.UploadServiceAuthfileResponse(),
            await self.do_request_async('1.0', 'antchain.das.service.authfile.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_domestictrademark_extensioninfo(
        self,
        request: das_models.QueryDomestictrademarkExtensioninfoRequest,
    ) -> das_models.QueryDomestictrademarkExtensioninfoResponse:
        """
        Description: 查询国内商标扩展信息
        Summary: 查询国内商标扩展信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_domestictrademark_extensioninfo_ex(request, headers, runtime)

    async def query_domestictrademark_extensioninfo_async(
        self,
        request: das_models.QueryDomestictrademarkExtensioninfoRequest,
    ) -> das_models.QueryDomestictrademarkExtensioninfoResponse:
        """
        Description: 查询国内商标扩展信息
        Summary: 查询国内商标扩展信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_domestictrademark_extensioninfo_ex_async(request, headers, runtime)

    def query_domestictrademark_extensioninfo_ex(
        self,
        request: das_models.QueryDomestictrademarkExtensioninfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryDomestictrademarkExtensioninfoResponse:
        """
        Description: 查询国内商标扩展信息
        Summary: 查询国内商标扩展信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryDomestictrademarkExtensioninfoResponse(),
            self.do_request('1.0', 'antchain.das.domestictrademark.extensioninfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_domestictrademark_extensioninfo_ex_async(
        self,
        request: das_models.QueryDomestictrademarkExtensioninfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryDomestictrademarkExtensioninfoResponse:
        """
        Description: 查询国内商标扩展信息
        Summary: 查询国内商标扩展信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryDomestictrademarkExtensioninfoResponse(),
            await self.do_request_async('1.0', 'antchain.das.domestictrademark.extensioninfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_application_fileentrance(
        self,
        request: das_models.GetApplicationFileentranceRequest,
    ) -> das_models.GetApplicationFileentranceResponse:
        """
        Description: 文件类型数据服务统一接口
        Summary: 文件类型服务统一接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_application_fileentrance_ex(request, headers, runtime)

    async def get_application_fileentrance_async(
        self,
        request: das_models.GetApplicationFileentranceRequest,
    ) -> das_models.GetApplicationFileentranceResponse:
        """
        Description: 文件类型数据服务统一接口
        Summary: 文件类型服务统一接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_application_fileentrance_ex_async(request, headers, runtime)

    def get_application_fileentrance_ex(
        self,
        request: das_models.GetApplicationFileentranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.GetApplicationFileentranceResponse:
        """
        Description: 文件类型数据服务统一接口
        Summary: 文件类型服务统一接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.GetApplicationFileentranceResponse(),
            self.do_request('1.0', 'antchain.das.application.fileentrance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_application_fileentrance_ex_async(
        self,
        request: das_models.GetApplicationFileentranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.GetApplicationFileentranceResponse:
        """
        Description: 文件类型数据服务统一接口
        Summary: 文件类型服务统一接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.GetApplicationFileentranceResponse(),
            await self.do_request_async('1.0', 'antchain.das.application.fileentrance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_unifiedentrance_async(
        self,
        request: das_models.InitUnifiedentranceAsyncRequest,
    ) -> das_models.InitUnifiedentranceAsyncResponse:
        """
        Description: 万文
        Summary: 异步入口--获取流水号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_unifiedentrance_async_ex(request, headers, runtime)

    async def init_unifiedentrance_async_async(
        self,
        request: das_models.InitUnifiedentranceAsyncRequest,
    ) -> das_models.InitUnifiedentranceAsyncResponse:
        """
        Description: 万文
        Summary: 异步入口--获取流水号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_unifiedentrance_async_ex_async(request, headers, runtime)

    def init_unifiedentrance_async_ex(
        self,
        request: das_models.InitUnifiedentranceAsyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.InitUnifiedentranceAsyncResponse:
        """
        Description: 万文
        Summary: 异步入口--获取流水号
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.InitUnifiedentranceAsyncResponse(),
            self.do_request('1.0', 'antchain.das.unifiedentrance.async.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_unifiedentrance_async_ex_async(
        self,
        request: das_models.InitUnifiedentranceAsyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.InitUnifiedentranceAsyncResponse:
        """
        Description: 万文
        Summary: 异步入口--获取流水号
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.InitUnifiedentranceAsyncResponse(),
            await self.do_request_async('1.0', 'antchain.das.unifiedentrance.async.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_unifiedentrance_async(
        self,
        request: das_models.QueryUnifiedentranceAsyncRequest,
    ) -> das_models.QueryUnifiedentranceAsyncResponse:
        """
        Description: 获取异步结果
        Summary: 获取异步结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_unifiedentrance_async_ex(request, headers, runtime)

    async def query_unifiedentrance_async_async(
        self,
        request: das_models.QueryUnifiedentranceAsyncRequest,
    ) -> das_models.QueryUnifiedentranceAsyncResponse:
        """
        Description: 获取异步结果
        Summary: 获取异步结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_unifiedentrance_async_ex_async(request, headers, runtime)

    def query_unifiedentrance_async_ex(
        self,
        request: das_models.QueryUnifiedentranceAsyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryUnifiedentranceAsyncResponse:
        """
        Description: 获取异步结果
        Summary: 获取异步结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryUnifiedentranceAsyncResponse(),
            self.do_request('1.0', 'antchain.das.unifiedentrance.async.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_unifiedentrance_async_ex_async(
        self,
        request: das_models.QueryUnifiedentranceAsyncRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryUnifiedentranceAsyncResponse:
        """
        Description: 获取异步结果
        Summary: 获取异步结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryUnifiedentranceAsyncResponse(),
            await self.do_request_async('1.0', 'antchain.das.unifiedentrance.async.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mainsite_unifiedentrance(
        self,
        request: das_models.QueryMainsiteUnifiedentranceRequest,
    ) -> das_models.QueryMainsiteUnifiedentranceResponse:
        """
        Description: 数据应用统一入口，主站调用
        Summary: 数据应用统一入口，主站调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mainsite_unifiedentrance_ex(request, headers, runtime)

    async def query_mainsite_unifiedentrance_async(
        self,
        request: das_models.QueryMainsiteUnifiedentranceRequest,
    ) -> das_models.QueryMainsiteUnifiedentranceResponse:
        """
        Description: 数据应用统一入口，主站调用
        Summary: 数据应用统一入口，主站调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mainsite_unifiedentrance_ex_async(request, headers, runtime)

    def query_mainsite_unifiedentrance_ex(
        self,
        request: das_models.QueryMainsiteUnifiedentranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryMainsiteUnifiedentranceResponse:
        """
        Description: 数据应用统一入口，主站调用
        Summary: 数据应用统一入口，主站调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryMainsiteUnifiedentranceResponse(),
            self.do_request('1.0', 'antchain.das.mainsite.unifiedentrance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mainsite_unifiedentrance_ex_async(
        self,
        request: das_models.QueryMainsiteUnifiedentranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryMainsiteUnifiedentranceResponse:
        """
        Description: 数据应用统一入口，主站调用
        Summary: 数据应用统一入口，主站调用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryMainsiteUnifiedentranceResponse(),
            await self.do_request_async('1.0', 'antchain.das.mainsite.unifiedentrance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_application_proxysign(
        self,
        request: das_models.GetApplicationProxysignRequest,
    ) -> das_models.GetApplicationProxysignResponse:
        """
        Description: 代客签名
        Summary: 代客签名
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_application_proxysign_ex(request, headers, runtime)

    async def get_application_proxysign_async(
        self,
        request: das_models.GetApplicationProxysignRequest,
    ) -> das_models.GetApplicationProxysignResponse:
        """
        Description: 代客签名
        Summary: 代客签名
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_application_proxysign_ex_async(request, headers, runtime)

    def get_application_proxysign_ex(
        self,
        request: das_models.GetApplicationProxysignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.GetApplicationProxysignResponse:
        """
        Description: 代客签名
        Summary: 代客签名
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.GetApplicationProxysignResponse(),
            self.do_request('1.0', 'antchain.das.application.proxysign.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_application_proxysign_ex_async(
        self,
        request: das_models.GetApplicationProxysignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.GetApplicationProxysignResponse:
        """
        Description: 代客签名
        Summary: 代客签名
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.GetApplicationProxysignResponse(),
            await self.do_request_async('1.0', 'antchain.das.application.proxysign.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_application_channelunifiedentrance(
        self,
        request: das_models.QueryApplicationChannelunifiedentranceRequest,
    ) -> das_models.QueryApplicationChannelunifiedentranceResponse:
        """
        Description: 数据服务内部渠道统一查询入口
        Summary: 数据服务内部渠道统一查询入口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_application_channelunifiedentrance_ex(request, headers, runtime)

    async def query_application_channelunifiedentrance_async(
        self,
        request: das_models.QueryApplicationChannelunifiedentranceRequest,
    ) -> das_models.QueryApplicationChannelunifiedentranceResponse:
        """
        Description: 数据服务内部渠道统一查询入口
        Summary: 数据服务内部渠道统一查询入口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_application_channelunifiedentrance_ex_async(request, headers, runtime)

    def query_application_channelunifiedentrance_ex(
        self,
        request: das_models.QueryApplicationChannelunifiedentranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationChannelunifiedentranceResponse:
        """
        Description: 数据服务内部渠道统一查询入口
        Summary: 数据服务内部渠道统一查询入口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationChannelunifiedentranceResponse(),
            self.do_request('1.0', 'antchain.das.application.channelunifiedentrance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_application_channelunifiedentrance_ex_async(
        self,
        request: das_models.QueryApplicationChannelunifiedentranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationChannelunifiedentranceResponse:
        """
        Description: 数据服务内部渠道统一查询入口
        Summary: 数据服务内部渠道统一查询入口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationChannelunifiedentranceResponse(),
            await self.do_request_async('1.0', 'antchain.das.application.channelunifiedentrance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_application_channelauthfile(
        self,
        request: das_models.UploadApplicationChannelauthfileRequest,
    ) -> das_models.UploadApplicationChannelauthfileResponse:
        """
        Description: 渠道调用上传授权协议文件
        Summary: 渠道调用上传授权协议文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_application_channelauthfile_ex(request, headers, runtime)

    async def upload_application_channelauthfile_async(
        self,
        request: das_models.UploadApplicationChannelauthfileRequest,
    ) -> das_models.UploadApplicationChannelauthfileResponse:
        """
        Description: 渠道调用上传授权协议文件
        Summary: 渠道调用上传授权协议文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_application_channelauthfile_ex_async(request, headers, runtime)

    def upload_application_channelauthfile_ex(
        self,
        request: das_models.UploadApplicationChannelauthfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.UploadApplicationChannelauthfileResponse:
        """
        Description: 渠道调用上传授权协议文件
        Summary: 渠道调用上传授权协议文件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = das_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.das.application.channelauthfile.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_application_channelauthfile_response = das_models.UploadApplicationChannelauthfileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_application_channelauthfile_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.UploadApplicationChannelauthfileResponse(),
            self.do_request('1.0', 'antchain.das.application.channelauthfile.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_application_channelauthfile_ex_async(
        self,
        request: das_models.UploadApplicationChannelauthfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.UploadApplicationChannelauthfileResponse:
        """
        Description: 渠道调用上传授权协议文件
        Summary: 渠道调用上传授权协议文件
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = das_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.das.application.channelauthfile.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_application_channelauthfile_response = das_models.UploadApplicationChannelauthfileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_application_channelauthfile_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.UploadApplicationChannelauthfileResponse(),
            await self.do_request_async('1.0', 'antchain.das.application.channelauthfile.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_application_marriage(
        self,
        request: das_models.QueryApplicationMarriageRequest,
    ) -> das_models.QueryApplicationMarriageResponse:
        """
        Description: 核婚的查询
        Summary: 核婚的查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_application_marriage_ex(request, headers, runtime)

    async def query_application_marriage_async(
        self,
        request: das_models.QueryApplicationMarriageRequest,
    ) -> das_models.QueryApplicationMarriageResponse:
        """
        Description: 核婚的查询
        Summary: 核婚的查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_application_marriage_ex_async(request, headers, runtime)

    def query_application_marriage_ex(
        self,
        request: das_models.QueryApplicationMarriageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationMarriageResponse:
        """
        Description: 核婚的查询
        Summary: 核婚的查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationMarriageResponse(),
            self.do_request('1.0', 'antchain.das.application.marriage.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_application_marriage_ex_async(
        self,
        request: das_models.QueryApplicationMarriageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.QueryApplicationMarriageResponse:
        """
        Description: 核婚的查询
        Summary: 核婚的查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.QueryApplicationMarriageResponse(),
            await self.do_request_async('1.0', 'antchain.das.application.marriage.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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

    def add_auth_config(
        self,
        request: das_models.AddAuthConfigRequest,
    ) -> das_models.AddAuthConfigResponse:
        """
        Description: 新增数据授权配置
        Summary: 新增数据授权配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_auth_config_ex(request, headers, runtime)

    async def add_auth_config_async(
        self,
        request: das_models.AddAuthConfigRequest,
    ) -> das_models.AddAuthConfigResponse:
        """
        Description: 新增数据授权配置
        Summary: 新增数据授权配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_auth_config_ex_async(request, headers, runtime)

    def add_auth_config_ex(
        self,
        request: das_models.AddAuthConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.AddAuthConfigResponse:
        """
        Description: 新增数据授权配置
        Summary: 新增数据授权配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.AddAuthConfigResponse(),
            self.do_request('1.0', 'antchain.das.auth.config.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_auth_config_ex_async(
        self,
        request: das_models.AddAuthConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.AddAuthConfigResponse:
        """
        Description: 新增数据授权配置
        Summary: 新增数据授权配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.AddAuthConfigResponse(),
            await self.do_request_async('1.0', 'antchain.das.auth.config.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_auth_config(
        self,
        request: das_models.UpdateAuthConfigRequest,
    ) -> das_models.UpdateAuthConfigResponse:
        """
        Description: 编辑数据授权配置
        Summary: 编辑数据授权配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_auth_config_ex(request, headers, runtime)

    async def update_auth_config_async(
        self,
        request: das_models.UpdateAuthConfigRequest,
    ) -> das_models.UpdateAuthConfigResponse:
        """
        Description: 编辑数据授权配置
        Summary: 编辑数据授权配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_auth_config_ex_async(request, headers, runtime)

    def update_auth_config_ex(
        self,
        request: das_models.UpdateAuthConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.UpdateAuthConfigResponse:
        """
        Description: 编辑数据授权配置
        Summary: 编辑数据授权配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.UpdateAuthConfigResponse(),
            self.do_request('1.0', 'antchain.das.auth.config.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_auth_config_ex_async(
        self,
        request: das_models.UpdateAuthConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.UpdateAuthConfigResponse:
        """
        Description: 编辑数据授权配置
        Summary: 编辑数据授权配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.UpdateAuthConfigResponse(),
            await self.do_request_async('1.0', 'antchain.das.auth.config.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_auth_agreement(
        self,
        request: das_models.UploadAuthAgreementRequest,
    ) -> das_models.UploadAuthAgreementResponse:
        """
        Description: 上传授权协议
        Summary: 上传授权协议
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_auth_agreement_ex(request, headers, runtime)

    async def upload_auth_agreement_async(
        self,
        request: das_models.UploadAuthAgreementRequest,
    ) -> das_models.UploadAuthAgreementResponse:
        """
        Description: 上传授权协议
        Summary: 上传授权协议
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_auth_agreement_ex_async(request, headers, runtime)

    def upload_auth_agreement_ex(
        self,
        request: das_models.UploadAuthAgreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.UploadAuthAgreementResponse:
        """
        Description: 上传授权协议
        Summary: 上传授权协议
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.UploadAuthAgreementResponse(),
            self.do_request('1.0', 'antchain.das.auth.agreement.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_auth_agreement_ex_async(
        self,
        request: das_models.UploadAuthAgreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.UploadAuthAgreementResponse:
        """
        Description: 上传授权协议
        Summary: 上传授权协议
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.UploadAuthAgreementResponse(),
            await self.do_request_async('1.0', 'antchain.das.auth.agreement.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_auth_picture(
        self,
        request: das_models.UploadAuthPictureRequest,
    ) -> das_models.UploadAuthPictureResponse:
        """
        Description: 上传图片
        Summary: 上传图片
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_auth_picture_ex(request, headers, runtime)

    async def upload_auth_picture_async(
        self,
        request: das_models.UploadAuthPictureRequest,
    ) -> das_models.UploadAuthPictureResponse:
        """
        Description: 上传图片
        Summary: 上传图片
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_auth_picture_ex_async(request, headers, runtime)

    def upload_auth_picture_ex(
        self,
        request: das_models.UploadAuthPictureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.UploadAuthPictureResponse:
        """
        Description: 上传图片
        Summary: 上传图片
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.UploadAuthPictureResponse(),
            self.do_request('1.0', 'antchain.das.auth.picture.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_auth_picture_ex_async(
        self,
        request: das_models.UploadAuthPictureRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.UploadAuthPictureResponse:
        """
        Description: 上传图片
        Summary: 上传图片
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.UploadAuthPictureResponse(),
            await self.do_request_async('1.0', 'antchain.das.auth.picture.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_auth_product(
        self,
        request: das_models.ListAuthProductRequest,
    ) -> das_models.ListAuthProductResponse:
        """
        Description: 查询授权产品列表
        Summary: 查询授权产品列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_auth_product_ex(request, headers, runtime)

    async def list_auth_product_async(
        self,
        request: das_models.ListAuthProductRequest,
    ) -> das_models.ListAuthProductResponse:
        """
        Description: 查询授权产品列表
        Summary: 查询授权产品列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_auth_product_ex_async(request, headers, runtime)

    def list_auth_product_ex(
        self,
        request: das_models.ListAuthProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.ListAuthProductResponse:
        """
        Description: 查询授权产品列表
        Summary: 查询授权产品列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.ListAuthProductResponse(),
            self.do_request('1.0', 'antchain.das.auth.product.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_auth_product_ex_async(
        self,
        request: das_models.ListAuthProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.ListAuthProductResponse:
        """
        Description: 查询授权产品列表
        Summary: 查询授权产品列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.ListAuthProductResponse(),
            await self.do_request_async('1.0', 'antchain.das.auth.product.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_auth_config(
        self,
        request: das_models.ListAuthConfigRequest,
    ) -> das_models.ListAuthConfigResponse:
        """
        Description: 查询数据授权配置列表
        Summary: 查询数据授权配置列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_auth_config_ex(request, headers, runtime)

    async def list_auth_config_async(
        self,
        request: das_models.ListAuthConfigRequest,
    ) -> das_models.ListAuthConfigResponse:
        """
        Description: 查询数据授权配置列表
        Summary: 查询数据授权配置列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_auth_config_ex_async(request, headers, runtime)

    def list_auth_config_ex(
        self,
        request: das_models.ListAuthConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.ListAuthConfigResponse:
        """
        Description: 查询数据授权配置列表
        Summary: 查询数据授权配置列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.ListAuthConfigResponse(),
            self.do_request('1.0', 'antchain.das.auth.config.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_auth_config_ex_async(
        self,
        request: das_models.ListAuthConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> das_models.ListAuthConfigResponse:
        """
        Description: 查询数据授权配置列表
        Summary: 查询数据授权配置列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            das_models.ListAuthConfigResponse(),
            await self.do_request_async('1.0', 'antchain.das.auth.config.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
