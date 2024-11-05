# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_tam import models as tam_models
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
        config: tam_models.Config,
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
            # 附件上传表单参数
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
                    'sdk_version': '1.3.5',
                    '_prod_code': 'TAM',
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
            # 附件上传表单参数
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
                    'sdk_version': '1.3.5',
                    '_prod_code': 'TAM',
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

    def query_custom(
        self,
        request: tam_models.QueryCustomRequest,
    ) -> tam_models.QueryCustomResponse:
        """
        Description: 查询售后中心项目信息
        Summary: 查询售后中心项目信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_custom_ex(request, headers, runtime)

    async def query_custom_async(
        self,
        request: tam_models.QueryCustomRequest,
    ) -> tam_models.QueryCustomResponse:
        """
        Description: 查询售后中心项目信息
        Summary: 查询售后中心项目信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_custom_ex_async(request, headers, runtime)

    def query_custom_ex(
        self,
        request: tam_models.QueryCustomRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.QueryCustomResponse:
        """
        Description: 查询售后中心项目信息
        Summary: 查询售后中心项目信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.QueryCustomResponse(),
            self.do_request('1.0', 'antcloud.tam.custom.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_custom_ex_async(
        self,
        request: tam_models.QueryCustomRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.QueryCustomResponse:
        """
        Description: 查询售后中心项目信息
        Summary: 查询售后中心项目信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.QueryCustomResponse(),
            await self.do_request_async('1.0', 'antcloud.tam.custom.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_code(
        self,
        request: tam_models.QueryCodeRequest,
    ) -> tam_models.QueryCodeResponse:
        """
        Description:
        Summary: 查询双百L3code
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_code_ex(request, headers, runtime)

    async def query_code_async(
        self,
        request: tam_models.QueryCodeRequest,
    ) -> tam_models.QueryCodeResponse:
        """
        Description:
        Summary: 查询双百L3code
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_code_ex_async(request, headers, runtime)

    def query_code_ex(
        self,
        request: tam_models.QueryCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.QueryCodeResponse:
        """
        Description:
        Summary: 查询双百L3code
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.QueryCodeResponse(),
            self.do_request('1.0', 'antcloud.tam.code.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_code_ex_async(
        self,
        request: tam_models.QueryCodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.QueryCodeResponse:
        """
        Description:
        Summary: 查询双百L3code
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.QueryCodeResponse(),
            await self.do_request_async('1.0', 'antcloud.tam.code.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_product(
        self,
        request: tam_models.QueryProductRequest,
    ) -> tam_models.QueryProductResponse:
        """
        Description:
        Summary: 根据l3code列表查询产品信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_product_ex(request, headers, runtime)

    async def query_product_async(
        self,
        request: tam_models.QueryProductRequest,
    ) -> tam_models.QueryProductResponse:
        """
        Description:
        Summary: 根据l3code列表查询产品信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_product_ex_async(request, headers, runtime)

    def query_product_ex(
        self,
        request: tam_models.QueryProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.QueryProductResponse:
        """
        Description:
        Summary: 根据l3code列表查询产品信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.QueryProductResponse(),
            self.do_request('1.0', 'antcloud.tam.product.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_product_ex_async(
        self,
        request: tam_models.QueryProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.QueryProductResponse:
        """
        Description:
        Summary: 根据l3code列表查询产品信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.QueryProductResponse(),
            await self.do_request_async('1.0', 'antcloud.tam.product.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_project_pagequery(
        self,
        request: tam_models.QueryProjectPagequeryRequest,
    ) -> tam_models.QueryProjectPagequeryResponse:
        """
        Description: 查询商务中心项目，便于获取增值服务项目
        Summary: 查询商务中心项目，便于获取增值服务项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_project_pagequery_ex(request, headers, runtime)

    async def query_project_pagequery_async(
        self,
        request: tam_models.QueryProjectPagequeryRequest,
    ) -> tam_models.QueryProjectPagequeryResponse:
        """
        Description: 查询商务中心项目，便于获取增值服务项目
        Summary: 查询商务中心项目，便于获取增值服务项目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_project_pagequery_ex_async(request, headers, runtime)

    def query_project_pagequery_ex(
        self,
        request: tam_models.QueryProjectPagequeryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.QueryProjectPagequeryResponse:
        """
        Description: 查询商务中心项目，便于获取增值服务项目
        Summary: 查询商务中心项目，便于获取增值服务项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.QueryProjectPagequeryResponse(),
            self.do_request('1.0', 'antcloud.tam.project.pagequery.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_project_pagequery_ex_async(
        self,
        request: tam_models.QueryProjectPagequeryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.QueryProjectPagequeryResponse:
        """
        Description: 查询商务中心项目，便于获取增值服务项目
        Summary: 查询商务中心项目，便于获取增值服务项目
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.QueryProjectPagequeryResponse(),
            await self.do_request_async('1.0', 'antcloud.tam.project.pagequery.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_project_getproject(
        self,
        request: tam_models.QueryProjectGetprojectRequest,
    ) -> tam_models.QueryProjectGetprojectResponse:
        """
        Description: 查询商务中心项目信息
        Summary: 查询商务中心项目信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_project_getproject_ex(request, headers, runtime)

    async def query_project_getproject_async(
        self,
        request: tam_models.QueryProjectGetprojectRequest,
    ) -> tam_models.QueryProjectGetprojectResponse:
        """
        Description: 查询商务中心项目信息
        Summary: 查询商务中心项目信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_project_getproject_ex_async(request, headers, runtime)

    def query_project_getproject_ex(
        self,
        request: tam_models.QueryProjectGetprojectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.QueryProjectGetprojectResponse:
        """
        Description: 查询商务中心项目信息
        Summary: 查询商务中心项目信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.QueryProjectGetprojectResponse(),
            self.do_request('1.0', 'antcloud.tam.project.getproject.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_project_getproject_ex_async(
        self,
        request: tam_models.QueryProjectGetprojectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.QueryProjectGetprojectResponse:
        """
        Description: 查询商务中心项目信息
        Summary: 查询商务中心项目信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.QueryProjectGetprojectResponse(),
            await self.do_request_async('1.0', 'antcloud.tam.project.getproject.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_aone(
        self,
        request: tam_models.SaveAoneRequest,
    ) -> tam_models.SaveAoneResponse:
        """
        Description: 提交到aone
        Summary: 提交到aone
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_aone_ex(request, headers, runtime)

    async def save_aone_async(
        self,
        request: tam_models.SaveAoneRequest,
    ) -> tam_models.SaveAoneResponse:
        """
        Description: 提交到aone
        Summary: 提交到aone
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_aone_ex_async(request, headers, runtime)

    def save_aone_ex(
        self,
        request: tam_models.SaveAoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.SaveAoneResponse:
        """
        Description: 提交到aone
        Summary: 提交到aone
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.SaveAoneResponse(),
            self.do_request('1.0', 'antcloud.tam.aone.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_aone_ex_async(
        self,
        request: tam_models.SaveAoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.SaveAoneResponse:
        """
        Description: 提交到aone
        Summary: 提交到aone
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.SaveAoneResponse(),
            await self.do_request_async('1.0', 'antcloud.tam.aone.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_aone(
        self,
        request: tam_models.QueryAoneRequest,
    ) -> tam_models.QueryAoneResponse:
        """
        Description: 查询aone详情
        Summary: 查询aone详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_aone_ex(request, headers, runtime)

    async def query_aone_async(
        self,
        request: tam_models.QueryAoneRequest,
    ) -> tam_models.QueryAoneResponse:
        """
        Description: 查询aone详情
        Summary: 查询aone详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_aone_ex_async(request, headers, runtime)

    def query_aone_ex(
        self,
        request: tam_models.QueryAoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.QueryAoneResponse:
        """
        Description: 查询aone详情
        Summary: 查询aone详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.QueryAoneResponse(),
            self.do_request('1.0', 'antcloud.tam.aone.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_aone_ex_async(
        self,
        request: tam_models.QueryAoneRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.QueryAoneResponse:
        """
        Description: 查询aone详情
        Summary: 查询aone详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.QueryAoneResponse(),
            await self.do_request_async('1.0', 'antcloud.tam.aone.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_sc_operationcenter(
        self,
        request: tam_models.ImportScOperationcenterRequest,
    ) -> tam_models.ImportScOperationcenterResponse:
        """
        Description: 智能外呼需求，前端提交表单后调用此接口将数据落入售后中心
        Summary: 前端提交需求表单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_sc_operationcenter_ex(request, headers, runtime)

    async def import_sc_operationcenter_async(
        self,
        request: tam_models.ImportScOperationcenterRequest,
    ) -> tam_models.ImportScOperationcenterResponse:
        """
        Description: 智能外呼需求，前端提交表单后调用此接口将数据落入售后中心
        Summary: 前端提交需求表单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_sc_operationcenter_ex_async(request, headers, runtime)

    def import_sc_operationcenter_ex(
        self,
        request: tam_models.ImportScOperationcenterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.ImportScOperationcenterResponse:
        """
        Description: 智能外呼需求，前端提交表单后调用此接口将数据落入售后中心
        Summary: 前端提交需求表单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.ImportScOperationcenterResponse(),
            self.do_request('1.0', 'antcloud.tam.sc.operationcenter.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_sc_operationcenter_ex_async(
        self,
        request: tam_models.ImportScOperationcenterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.ImportScOperationcenterResponse:
        """
        Description: 智能外呼需求，前端提交表单后调用此接口将数据落入售后中心
        Summary: 前端提交需求表单
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.ImportScOperationcenterResponse(),
            await self.do_request_async('1.0', 'antcloud.tam.sc.operationcenter.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_sc_operationcenter(
        self,
        request: tam_models.OperateScOperationcenterRequest,
    ) -> tam_models.OperateScOperationcenterResponse:
        """
        Description: 发送验证码
        Summary: 发送验证码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_sc_operationcenter_ex(request, headers, runtime)

    async def operate_sc_operationcenter_async(
        self,
        request: tam_models.OperateScOperationcenterRequest,
    ) -> tam_models.OperateScOperationcenterResponse:
        """
        Description: 发送验证码
        Summary: 发送验证码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_sc_operationcenter_ex_async(request, headers, runtime)

    def operate_sc_operationcenter_ex(
        self,
        request: tam_models.OperateScOperationcenterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.OperateScOperationcenterResponse:
        """
        Description: 发送验证码
        Summary: 发送验证码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.OperateScOperationcenterResponse(),
            self.do_request('1.0', 'antcloud.tam.sc.operationcenter.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_sc_operationcenter_ex_async(
        self,
        request: tam_models.OperateScOperationcenterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.OperateScOperationcenterResponse:
        """
        Description: 发送验证码
        Summary: 发送验证码
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.OperateScOperationcenterResponse(),
            await self.do_request_async('1.0', 'antcloud.tam.sc.operationcenter.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sc_operationcenter(
        self,
        request: tam_models.QueryScOperationcenterRequest,
    ) -> tam_models.QueryScOperationcenterResponse:
        """
        Description: 查询跟进情况
        Summary: 查询跟进情况
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sc_operationcenter_ex(request, headers, runtime)

    async def query_sc_operationcenter_async(
        self,
        request: tam_models.QueryScOperationcenterRequest,
    ) -> tam_models.QueryScOperationcenterResponse:
        """
        Description: 查询跟进情况
        Summary: 查询跟进情况
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sc_operationcenter_ex_async(request, headers, runtime)

    def query_sc_operationcenter_ex(
        self,
        request: tam_models.QueryScOperationcenterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.QueryScOperationcenterResponse:
        """
        Description: 查询跟进情况
        Summary: 查询跟进情况
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.QueryScOperationcenterResponse(),
            self.do_request('1.0', 'antcloud.tam.sc.operationcenter.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sc_operationcenter_ex_async(
        self,
        request: tam_models.QueryScOperationcenterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.QueryScOperationcenterResponse:
        """
        Description: 查询跟进情况
        Summary: 查询跟进情况
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.QueryScOperationcenterResponse(),
            await self.do_request_async('1.0', 'antcloud.tam.sc.operationcenter.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_sc_file(
        self,
        request: tam_models.ImportScFileRequest,
    ) -> tam_models.ImportScFileResponse:
        """
        Description: 附件上传
        Summary: 附件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_sc_file_ex(request, headers, runtime)

    async def import_sc_file_async(
        self,
        request: tam_models.ImportScFileRequest,
    ) -> tam_models.ImportScFileResponse:
        """
        Description: 附件上传
        Summary: 附件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_sc_file_ex_async(request, headers, runtime)

    def import_sc_file_ex(
        self,
        request: tam_models.ImportScFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.ImportScFileResponse:
        """
        Description: 附件上传
        Summary: 附件上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.ImportScFileResponse(),
            self.do_request('1.0', 'antcloud.tam.sc.file.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_sc_file_ex_async(
        self,
        request: tam_models.ImportScFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.ImportScFileResponse:
        """
        Description: 附件上传
        Summary: 附件上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.ImportScFileResponse(),
            await self.do_request_async('1.0', 'antcloud.tam.sc.file.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sc_test(
        self,
        request: tam_models.QueryScTestRequest,
    ) -> tam_models.QueryScTestResponse:
        """
        Description:
        Summary: 测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sc_test_ex(request, headers, runtime)

    async def query_sc_test_async(
        self,
        request: tam_models.QueryScTestRequest,
    ) -> tam_models.QueryScTestResponse:
        """
        Description:
        Summary: 测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sc_test_ex_async(request, headers, runtime)

    def query_sc_test_ex(
        self,
        request: tam_models.QueryScTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.QueryScTestResponse:
        """
        Description:
        Summary: 测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.QueryScTestResponse(),
            self.do_request('1.0', 'antcloud.tam.sc.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sc_test_ex_async(
        self,
        request: tam_models.QueryScTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tam_models.QueryScTestResponse:
        """
        Description:
        Summary: 测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            tam_models.QueryScTestResponse(),
            await self.do_request_async('1.0', 'antcloud.tam.sc.test.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
