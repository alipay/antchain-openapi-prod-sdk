# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_tdm import models as tdm_models
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
        config: tdm_models.Config,
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
            # 链的信息
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
                    'sdk_version': '1.0.12'
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
            # 链的信息
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
                    'sdk_version': '1.0.12'
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

    def open_cpf_cert(
        self,
        request: tdm_models.OpenCpfCertRequest,
    ) -> tdm_models.OpenCpfCertResponse:
        """
        Description: 公积金证明开具接口
        Summary: 公积金证明开具接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.open_cpf_cert_ex(request, headers, runtime)

    async def open_cpf_cert_async(
        self,
        request: tdm_models.OpenCpfCertRequest,
    ) -> tdm_models.OpenCpfCertResponse:
        """
        Description: 公积金证明开具接口
        Summary: 公积金证明开具接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.open_cpf_cert_ex_async(request, headers, runtime)

    def open_cpf_cert_ex(
        self,
        request: tdm_models.OpenCpfCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.OpenCpfCertResponse:
        """
        Description: 公积金证明开具接口
        Summary: 公积金证明开具接口
        """
        UtilClient.validate_model(request)
        return tdm_models.OpenCpfCertResponse().from_map(
            self.do_request('1.0', 'antchain.tdm.cpf.cert.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def open_cpf_cert_ex_async(
        self,
        request: tdm_models.OpenCpfCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.OpenCpfCertResponse:
        """
        Description: 公积金证明开具接口
        Summary: 公积金证明开具接口
        """
        UtilClient.validate_model(request)
        return tdm_models.OpenCpfCertResponse().from_map(
            await self.do_request_async('1.0', 'antchain.tdm.cpf.cert.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cpf_cert(
        self,
        request: tdm_models.ListCpfCertRequest,
    ) -> tdm_models.ListCpfCertResponse:
        """
        Description: 证明列表查询接口
        Summary: 证明列表查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cpf_cert_ex(request, headers, runtime)

    async def list_cpf_cert_async(
        self,
        request: tdm_models.ListCpfCertRequest,
    ) -> tdm_models.ListCpfCertResponse:
        """
        Description: 证明列表查询接口
        Summary: 证明列表查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cpf_cert_ex_async(request, headers, runtime)

    def list_cpf_cert_ex(
        self,
        request: tdm_models.ListCpfCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.ListCpfCertResponse:
        """
        Description: 证明列表查询接口
        Summary: 证明列表查询接口
        """
        UtilClient.validate_model(request)
        return tdm_models.ListCpfCertResponse().from_map(
            self.do_request('1.0', 'antchain.tdm.cpf.cert.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cpf_cert_ex_async(
        self,
        request: tdm_models.ListCpfCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.ListCpfCertResponse:
        """
        Description: 证明列表查询接口
        Summary: 证明列表查询接口
        """
        UtilClient.validate_model(request)
        return tdm_models.ListCpfCertResponse().from_map(
            await self.do_request_async('1.0', 'antchain.tdm.cpf.cert.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_cpf_cert(
        self,
        request: tdm_models.CheckCpfCertRequest,
    ) -> tdm_models.CheckCpfCertResponse:
        """
        Description: 扫码验真
        Summary: 扫码验真
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_cpf_cert_ex(request, headers, runtime)

    async def check_cpf_cert_async(
        self,
        request: tdm_models.CheckCpfCertRequest,
    ) -> tdm_models.CheckCpfCertResponse:
        """
        Description: 扫码验真
        Summary: 扫码验真
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_cpf_cert_ex_async(request, headers, runtime)

    def check_cpf_cert_ex(
        self,
        request: tdm_models.CheckCpfCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.CheckCpfCertResponse:
        """
        Description: 扫码验真
        Summary: 扫码验真
        """
        UtilClient.validate_model(request)
        return tdm_models.CheckCpfCertResponse().from_map(
            self.do_request('1.0', 'antchain.tdm.cpf.cert.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_cpf_cert_ex_async(
        self,
        request: tdm_models.CheckCpfCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.CheckCpfCertResponse:
        """
        Description: 扫码验真
        Summary: 扫码验真
        """
        UtilClient.validate_model(request)
        return tdm_models.CheckCpfCertResponse().from_map(
            await self.do_request_async('1.0', 'antchain.tdm.cpf.cert.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_cpf_certuse(
        self,
        request: tdm_models.SaveCpfCertuseRequest,
    ) -> tdm_models.SaveCpfCertuseResponse:
        """
        Description: 证明使用记录保存
        Summary: 证明使用记录保存
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_cpf_certuse_ex(request, headers, runtime)

    async def save_cpf_certuse_async(
        self,
        request: tdm_models.SaveCpfCertuseRequest,
    ) -> tdm_models.SaveCpfCertuseResponse:
        """
        Description: 证明使用记录保存
        Summary: 证明使用记录保存
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_cpf_certuse_ex_async(request, headers, runtime)

    def save_cpf_certuse_ex(
        self,
        request: tdm_models.SaveCpfCertuseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.SaveCpfCertuseResponse:
        """
        Description: 证明使用记录保存
        Summary: 证明使用记录保存
        """
        UtilClient.validate_model(request)
        return tdm_models.SaveCpfCertuseResponse().from_map(
            self.do_request('1.0', 'antchain.tdm.cpf.certuse.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_cpf_certuse_ex_async(
        self,
        request: tdm_models.SaveCpfCertuseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.SaveCpfCertuseResponse:
        """
        Description: 证明使用记录保存
        Summary: 证明使用记录保存
        """
        UtilClient.validate_model(request)
        return tdm_models.SaveCpfCertuseResponse().from_map(
            await self.do_request_async('1.0', 'antchain.tdm.cpf.certuse.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_cpf_certuse(
        self,
        request: tdm_models.GetCpfCertuseRequest,
    ) -> tdm_models.GetCpfCertuseResponse:
        """
        Description: 机构扫码用证
        Summary: 扫码用证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_cpf_certuse_ex(request, headers, runtime)

    async def get_cpf_certuse_async(
        self,
        request: tdm_models.GetCpfCertuseRequest,
    ) -> tdm_models.GetCpfCertuseResponse:
        """
        Description: 机构扫码用证
        Summary: 扫码用证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_cpf_certuse_ex_async(request, headers, runtime)

    def get_cpf_certuse_ex(
        self,
        request: tdm_models.GetCpfCertuseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.GetCpfCertuseResponse:
        """
        Description: 机构扫码用证
        Summary: 扫码用证接口
        """
        UtilClient.validate_model(request)
        return tdm_models.GetCpfCertuseResponse().from_map(
            self.do_request('1.0', 'antchain.tdm.cpf.certuse.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_cpf_certuse_ex_async(
        self,
        request: tdm_models.GetCpfCertuseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.GetCpfCertuseResponse:
        """
        Description: 机构扫码用证
        Summary: 扫码用证接口
        """
        UtilClient.validate_model(request)
        return tdm_models.GetCpfCertuseResponse().from_map(
            await self.do_request_async('1.0', 'antchain.tdm.cpf.certuse.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_cpf_cert(
        self,
        request: tdm_models.GetCpfCertRequest,
    ) -> tdm_models.GetCpfCertResponse:
        """
        Description: 已开具证明查询
        Summary: 已开具证明查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_cpf_cert_ex(request, headers, runtime)

    async def get_cpf_cert_async(
        self,
        request: tdm_models.GetCpfCertRequest,
    ) -> tdm_models.GetCpfCertResponse:
        """
        Description: 已开具证明查询
        Summary: 已开具证明查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_cpf_cert_ex_async(request, headers, runtime)

    def get_cpf_cert_ex(
        self,
        request: tdm_models.GetCpfCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.GetCpfCertResponse:
        """
        Description: 已开具证明查询
        Summary: 已开具证明查询
        """
        UtilClient.validate_model(request)
        return tdm_models.GetCpfCertResponse().from_map(
            self.do_request('1.0', 'antchain.tdm.cpf.cert.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_cpf_cert_ex_async(
        self,
        request: tdm_models.GetCpfCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.GetCpfCertResponse:
        """
        Description: 已开具证明查询
        Summary: 已开具证明查询
        """
        UtilClient.validate_model(request)
        return tdm_models.GetCpfCertResponse().from_map(
            await self.do_request_async('1.0', 'antchain.tdm.cpf.cert.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cpf_certuse(
        self,
        request: tdm_models.ListCpfCertuseRequest,
    ) -> tdm_models.ListCpfCertuseResponse:
        """
        Description: 证明使用记录查询
        Summary: 证明使用记录查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cpf_certuse_ex(request, headers, runtime)

    async def list_cpf_certuse_async(
        self,
        request: tdm_models.ListCpfCertuseRequest,
    ) -> tdm_models.ListCpfCertuseResponse:
        """
        Description: 证明使用记录查询
        Summary: 证明使用记录查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cpf_certuse_ex_async(request, headers, runtime)

    def list_cpf_certuse_ex(
        self,
        request: tdm_models.ListCpfCertuseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.ListCpfCertuseResponse:
        """
        Description: 证明使用记录查询
        Summary: 证明使用记录查询
        """
        UtilClient.validate_model(request)
        return tdm_models.ListCpfCertuseResponse().from_map(
            self.do_request('1.0', 'antchain.tdm.cpf.certuse.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cpf_certuse_ex_async(
        self,
        request: tdm_models.ListCpfCertuseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.ListCpfCertuseResponse:
        """
        Description: 证明使用记录查询
        Summary: 证明使用记录查询
        """
        UtilClient.validate_model(request)
        return tdm_models.ListCpfCertuseResponse().from_map(
            await self.do_request_async('1.0', 'antchain.tdm.cpf.certuse.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_cpf_data(
        self,
        request: tdm_models.GetCpfDataRequest,
    ) -> tdm_models.GetCpfDataResponse:
        """
        Description: 机构获取用户公积金数据（授权、用数分离时接口）
        Summary: 数据使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_cpf_data_ex(request, headers, runtime)

    async def get_cpf_data_async(
        self,
        request: tdm_models.GetCpfDataRequest,
    ) -> tdm_models.GetCpfDataResponse:
        """
        Description: 机构获取用户公积金数据（授权、用数分离时接口）
        Summary: 数据使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_cpf_data_ex_async(request, headers, runtime)

    def get_cpf_data_ex(
        self,
        request: tdm_models.GetCpfDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.GetCpfDataResponse:
        """
        Description: 机构获取用户公积金数据（授权、用数分离时接口）
        Summary: 数据使用
        """
        UtilClient.validate_model(request)
        return tdm_models.GetCpfDataResponse().from_map(
            self.do_request('1.0', 'antchain.tdm.cpf.data.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_cpf_data_ex_async(
        self,
        request: tdm_models.GetCpfDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.GetCpfDataResponse:
        """
        Description: 机构获取用户公积金数据（授权、用数分离时接口）
        Summary: 数据使用
        """
        UtilClient.validate_model(request)
        return tdm_models.GetCpfDataResponse().from_map(
            await self.do_request_async('1.0', 'antchain.tdm.cpf.data.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_cpf_datause(
        self,
        request: tdm_models.ListCpfDatauseRequest,
    ) -> tdm_models.ListCpfDatauseResponse:
        """
        Description: 机构用数记录查询
        Summary: 数据使用记录查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_cpf_datause_ex(request, headers, runtime)

    async def list_cpf_datause_async(
        self,
        request: tdm_models.ListCpfDatauseRequest,
    ) -> tdm_models.ListCpfDatauseResponse:
        """
        Description: 机构用数记录查询
        Summary: 数据使用记录查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_cpf_datause_ex_async(request, headers, runtime)

    def list_cpf_datause_ex(
        self,
        request: tdm_models.ListCpfDatauseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.ListCpfDatauseResponse:
        """
        Description: 机构用数记录查询
        Summary: 数据使用记录查询
        """
        UtilClient.validate_model(request)
        return tdm_models.ListCpfDatauseResponse().from_map(
            self.do_request('1.0', 'antchain.tdm.cpf.datause.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_cpf_datause_ex_async(
        self,
        request: tdm_models.ListCpfDatauseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.ListCpfDatauseResponse:
        """
        Description: 机构用数记录查询
        Summary: 数据使用记录查询
        """
        UtilClient.validate_model(request)
        return tdm_models.ListCpfDatauseResponse().from_map(
            await self.do_request_async('1.0', 'antchain.tdm.cpf.datause.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_cpf_user(
        self,
        request: tdm_models.QueryCpfUserRequest,
    ) -> tdm_models.QueryCpfUserResponse:
        """
        Description: 查询用户在公积金中心的个人账户、贷款合同信息
        Summary: 公积金中心用户信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_cpf_user_ex(request, headers, runtime)

    async def query_cpf_user_async(
        self,
        request: tdm_models.QueryCpfUserRequest,
    ) -> tdm_models.QueryCpfUserResponse:
        """
        Description: 查询用户在公积金中心的个人账户、贷款合同信息
        Summary: 公积金中心用户信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_cpf_user_ex_async(request, headers, runtime)

    def query_cpf_user_ex(
        self,
        request: tdm_models.QueryCpfUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.QueryCpfUserResponse:
        """
        Description: 查询用户在公积金中心的个人账户、贷款合同信息
        Summary: 公积金中心用户信息查询
        """
        UtilClient.validate_model(request)
        return tdm_models.QueryCpfUserResponse().from_map(
            self.do_request('1.0', 'antchain.tdm.cpf.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_cpf_user_ex_async(
        self,
        request: tdm_models.QueryCpfUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.QueryCpfUserResponse:
        """
        Description: 查询用户在公积金中心的个人账户、贷款合同信息
        Summary: 公积金中心用户信息查询
        """
        UtilClient.validate_model(request)
        return tdm_models.QueryCpfUserResponse().from_map(
            await self.do_request_async('1.0', 'antchain.tdm.cpf.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_auth(
        self,
        request: tdm_models.ExecAuthRequest,
    ) -> tdm_models.ExecAuthResponse:
        """
        Description: 可信数据流转授权
        Summary: 授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_auth_ex(request, headers, runtime)

    async def exec_auth_async(
        self,
        request: tdm_models.ExecAuthRequest,
    ) -> tdm_models.ExecAuthResponse:
        """
        Description: 可信数据流转授权
        Summary: 授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_auth_ex_async(request, headers, runtime)

    def exec_auth_ex(
        self,
        request: tdm_models.ExecAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.ExecAuthResponse:
        """
        Description: 可信数据流转授权
        Summary: 授权
        """
        UtilClient.validate_model(request)
        return tdm_models.ExecAuthResponse().from_map(
            self.do_request('1.0', 'antchain.tdm.auth.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_auth_ex_async(
        self,
        request: tdm_models.ExecAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.ExecAuthResponse:
        """
        Description: 可信数据流转授权
        Summary: 授权
        """
        UtilClient.validate_model(request)
        return tdm_models.ExecAuthResponse().from_map(
            await self.do_request_async('1.0', 'antchain.tdm.auth.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_auth(
        self,
        request: tdm_models.CancelAuthRequest,
    ) -> tdm_models.CancelAuthResponse:
        """
        Description: 取消授权
        Summary: 取消授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_auth_ex(request, headers, runtime)

    async def cancel_auth_async(
        self,
        request: tdm_models.CancelAuthRequest,
    ) -> tdm_models.CancelAuthResponse:
        """
        Description: 取消授权
        Summary: 取消授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_auth_ex_async(request, headers, runtime)

    def cancel_auth_ex(
        self,
        request: tdm_models.CancelAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.CancelAuthResponse:
        """
        Description: 取消授权
        Summary: 取消授权
        """
        UtilClient.validate_model(request)
        return tdm_models.CancelAuthResponse().from_map(
            self.do_request('1.0', 'antchain.tdm.auth.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_auth_ex_async(
        self,
        request: tdm_models.CancelAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.CancelAuthResponse:
        """
        Description: 取消授权
        Summary: 取消授权
        """
        UtilClient.validate_model(request)
        return tdm_models.CancelAuthResponse().from_map(
            await self.do_request_async('1.0', 'antchain.tdm.auth.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_auth(
        self,
        request: tdm_models.QueryAuthRequest,
    ) -> tdm_models.QueryAuthResponse:
        """
        Description: 用权
        Summary: 用权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_auth_ex(request, headers, runtime)

    async def query_auth_async(
        self,
        request: tdm_models.QueryAuthRequest,
    ) -> tdm_models.QueryAuthResponse:
        """
        Description: 用权
        Summary: 用权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_auth_ex_async(request, headers, runtime)

    def query_auth_ex(
        self,
        request: tdm_models.QueryAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.QueryAuthResponse:
        """
        Description: 用权
        Summary: 用权
        """
        UtilClient.validate_model(request)
        return tdm_models.QueryAuthResponse().from_map(
            self.do_request('1.0', 'antchain.tdm.auth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_auth_ex_async(
        self,
        request: tdm_models.QueryAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.QueryAuthResponse:
        """
        Description: 用权
        Summary: 用权
        """
        UtilClient.validate_model(request)
        return tdm_models.QueryAuthResponse().from_map(
            await self.do_request_async('1.0', 'antchain.tdm.auth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_auth_owner(
        self,
        request: tdm_models.QueryAuthOwnerRequest,
    ) -> tdm_models.QueryAuthOwnerResponse:
        """
        Description: 授权记录查询（个人授权记录查询）
        Summary: 授权记录查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_auth_owner_ex(request, headers, runtime)

    async def query_auth_owner_async(
        self,
        request: tdm_models.QueryAuthOwnerRequest,
    ) -> tdm_models.QueryAuthOwnerResponse:
        """
        Description: 授权记录查询（个人授权记录查询）
        Summary: 授权记录查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_auth_owner_ex_async(request, headers, runtime)

    def query_auth_owner_ex(
        self,
        request: tdm_models.QueryAuthOwnerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.QueryAuthOwnerResponse:
        """
        Description: 授权记录查询（个人授权记录查询）
        Summary: 授权记录查询
        """
        UtilClient.validate_model(request)
        return tdm_models.QueryAuthOwnerResponse().from_map(
            self.do_request('1.0', 'antchain.tdm.auth.owner.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_auth_owner_ex_async(
        self,
        request: tdm_models.QueryAuthOwnerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.QueryAuthOwnerResponse:
        """
        Description: 授权记录查询（个人授权记录查询）
        Summary: 授权记录查询
        """
        UtilClient.validate_model(request)
        return tdm_models.QueryAuthOwnerResponse().from_map(
            await self.do_request_async('1.0', 'antchain.tdm.auth.owner.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_authuse_owner(
        self,
        request: tdm_models.QueryAuthuseOwnerRequest,
    ) -> tdm_models.QueryAuthuseOwnerResponse:
        """
        Description: 授权使用记录查询（个人查询维度）
        Summary: 授权使用记录查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_authuse_owner_ex(request, headers, runtime)

    async def query_authuse_owner_async(
        self,
        request: tdm_models.QueryAuthuseOwnerRequest,
    ) -> tdm_models.QueryAuthuseOwnerResponse:
        """
        Description: 授权使用记录查询（个人查询维度）
        Summary: 授权使用记录查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_authuse_owner_ex_async(request, headers, runtime)

    def query_authuse_owner_ex(
        self,
        request: tdm_models.QueryAuthuseOwnerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.QueryAuthuseOwnerResponse:
        """
        Description: 授权使用记录查询（个人查询维度）
        Summary: 授权使用记录查询
        """
        UtilClient.validate_model(request)
        return tdm_models.QueryAuthuseOwnerResponse().from_map(
            self.do_request('1.0', 'antchain.tdm.authuse.owner.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_authuse_owner_ex_async(
        self,
        request: tdm_models.QueryAuthuseOwnerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.QueryAuthuseOwnerResponse:
        """
        Description: 授权使用记录查询（个人查询维度）
        Summary: 授权使用记录查询
        """
        UtilClient.validate_model(request)
        return tdm_models.QueryAuthuseOwnerResponse().from_map(
            await self.do_request_async('1.0', 'antchain.tdm.authuse.owner.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_authuse(
        self,
        request: tdm_models.ExecAuthuseRequest,
    ) -> tdm_models.ExecAuthuseResponse:
        """
        Description: 授权数据使用
        Summary: 授权数据使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_authuse_ex(request, headers, runtime)

    async def exec_authuse_async(
        self,
        request: tdm_models.ExecAuthuseRequest,
    ) -> tdm_models.ExecAuthuseResponse:
        """
        Description: 授权数据使用
        Summary: 授权数据使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_authuse_ex_async(request, headers, runtime)

    def exec_authuse_ex(
        self,
        request: tdm_models.ExecAuthuseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.ExecAuthuseResponse:
        """
        Description: 授权数据使用
        Summary: 授权数据使用
        """
        UtilClient.validate_model(request)
        return tdm_models.ExecAuthuseResponse().from_map(
            self.do_request('1.0', 'antchain.tdm.authuse.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_authuse_ex_async(
        self,
        request: tdm_models.ExecAuthuseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.ExecAuthuseResponse:
        """
        Description: 授权数据使用
        Summary: 授权数据使用
        """
        UtilClient.validate_model(request)
        return tdm_models.ExecAuthuseResponse().from_map(
            await self.do_request_async('1.0', 'antchain.tdm.authuse.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_verify(
        self,
        request: tdm_models.InitVerifyRequest,
    ) -> tdm_models.InitVerifyResponse:
        """
        Description: 核身初始化接口
        Summary: 核身初始化接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_verify_ex(request, headers, runtime)

    async def init_verify_async(
        self,
        request: tdm_models.InitVerifyRequest,
    ) -> tdm_models.InitVerifyResponse:
        """
        Description: 核身初始化接口
        Summary: 核身初始化接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_verify_ex_async(request, headers, runtime)

    def init_verify_ex(
        self,
        request: tdm_models.InitVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.InitVerifyResponse:
        """
        Description: 核身初始化接口
        Summary: 核身初始化接口
        """
        UtilClient.validate_model(request)
        return tdm_models.InitVerifyResponse().from_map(
            self.do_request('1.0', 'antchain.tdm.verify.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_verify_ex_async(
        self,
        request: tdm_models.InitVerifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> tdm_models.InitVerifyResponse:
        """
        Description: 核身初始化接口
        Summary: 核身初始化接口
        """
        UtilClient.validate_model(request)
        return tdm_models.InitVerifyResponse().from_map(
            await self.do_request_async('1.0', 'antchain.tdm.verify.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
