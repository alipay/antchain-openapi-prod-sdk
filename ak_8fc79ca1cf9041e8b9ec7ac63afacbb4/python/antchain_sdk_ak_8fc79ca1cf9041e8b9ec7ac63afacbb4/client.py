# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ak_8fc79ca1cf9041e8b9ec7ac63afacbb4 import models as ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models
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
        config: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.Config,
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
            # 客户认证结果
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
                    'sdk_version': '1.0.2',
                    '_prod_code': 'ak_8fc79ca1cf9041e8b9ec7ac63afacbb4',
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
            # 客户认证结果
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
                    'sdk_version': '1.0.2',
                    '_prod_code': 'ak_8fc79ca1cf9041e8b9ec7ac63afacbb4',
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

    def auth_antchain_bbp_customer(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.AuthAntchainBbpCustomerRequest,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.AuthAntchainBbpCustomerResponse:
        """
        Description: 对企业/个人进行身份认证
        Summary: 统一客户认证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_antchain_bbp_customer_ex(request, headers, runtime)

    async def auth_antchain_bbp_customer_async(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.AuthAntchainBbpCustomerRequest,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.AuthAntchainBbpCustomerResponse:
        """
        Description: 对企业/个人进行身份认证
        Summary: 统一客户认证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_antchain_bbp_customer_ex_async(request, headers, runtime)

    def auth_antchain_bbp_customer_ex(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.AuthAntchainBbpCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.AuthAntchainBbpCustomerResponse:
        """
        Description: 对企业/个人进行身份认证
        Summary: 统一客户认证接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.AuthAntchainBbpCustomerResponse(),
            self.do_request('1.0', 'antchain.bbp.customer.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_antchain_bbp_customer_ex_async(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.AuthAntchainBbpCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.AuthAntchainBbpCustomerResponse:
        """
        Description: 对企业/个人进行身份认证
        Summary: 统一客户认证接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.AuthAntchainBbpCustomerResponse(),
            await self.do_request_async('1.0', 'antchain.bbp.customer.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_demo_cjtest_cj(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UpdateDemoCjtestCjRequest,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UpdateDemoCjtestCjResponse:
        """
        Description: 测试网关评审能力
        Summary: 评审测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_demo_cjtest_cj_ex(request, headers, runtime)

    async def update_demo_cjtest_cj_async(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UpdateDemoCjtestCjRequest,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UpdateDemoCjtestCjResponse:
        """
        Description: 测试网关评审能力
        Summary: 评审测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_demo_cjtest_cj_ex_async(request, headers, runtime)

    def update_demo_cjtest_cj_ex(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UpdateDemoCjtestCjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UpdateDemoCjtestCjResponse:
        """
        Description: 测试网关评审能力
        Summary: 评审测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UpdateDemoCjtestCjResponse(),
            self.do_request('1.0', 'demo.cjtest.cj.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_demo_cjtest_cj_ex_async(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UpdateDemoCjtestCjRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UpdateDemoCjtestCjResponse:
        """
        Description: 测试网关评审能力
        Summary: 评审测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UpdateDemoCjtestCjResponse(),
            await self.do_request_async('1.0', 'demo.cjtest.cj.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_demo_cjtest_source_file(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UploadDemoCjtestSourceFileRequest,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UploadDemoCjtestSourceFileResponse:
        """
        Description: 文件测试
        Summary: 文件测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_demo_cjtest_source_file_ex(request, headers, runtime)

    async def upload_demo_cjtest_source_file_async(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UploadDemoCjtestSourceFileRequest,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UploadDemoCjtestSourceFileResponse:
        """
        Description: 文件测试
        Summary: 文件测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_demo_cjtest_source_file_ex_async(request, headers, runtime)

    def upload_demo_cjtest_source_file_ex(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UploadDemoCjtestSourceFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UploadDemoCjtestSourceFileResponse:
        """
        Description: 文件测试
        Summary: 文件测试
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='demo.cjtest.source.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_demo_cjtest_source_file_response = ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UploadDemoCjtestSourceFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_demo_cjtest_source_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UploadDemoCjtestSourceFileResponse(),
            self.do_request('1.0', 'demo.cjtest.source.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_demo_cjtest_source_file_ex_async(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UploadDemoCjtestSourceFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UploadDemoCjtestSourceFileResponse:
        """
        Description: 文件测试
        Summary: 文件测试
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='demo.cjtest.source.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_demo_cjtest_source_file_response = ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UploadDemoCjtestSourceFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_demo_cjtest_source_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.UploadDemoCjtestSourceFileResponse(),
            await self.do_request_async('1.0', 'demo.cjtest.source.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reset_demo_com_cn_cc(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ResetDemoComCnCcRequest,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ResetDemoComCnCcResponse:
        """
        Description: 测试api描述
        Summary: api简介
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reset_demo_com_cn_cc_ex(request, headers, runtime)

    async def reset_demo_com_cn_cc_async(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ResetDemoComCnCcRequest,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ResetDemoComCnCcResponse:
        """
        Description: 测试api描述
        Summary: api简介
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reset_demo_com_cn_cc_ex_async(request, headers, runtime)

    def reset_demo_com_cn_cc_ex(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ResetDemoComCnCcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ResetDemoComCnCcResponse:
        """
        Description: 测试api描述
        Summary: api简介
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ResetDemoComCnCcResponse(),
            self.do_request('1.0', 'demo.com.cn.cc.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reset_demo_com_cn_cc_ex_async(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ResetDemoComCnCcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ResetDemoComCnCcResponse:
        """
        Description: 测试api描述
        Summary: api简介
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ResetDemoComCnCcResponse(),
            await self.do_request_async('1.0', 'demo.com.cn.cc.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_demo_com_cn_test(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ImportDemoComCnTestRequest,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ImportDemoComCnTestResponse:
        """
        Description: 长捷,qiujianglong.qjl
        Summary: api简介
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_demo_com_cn_test_ex(request, headers, runtime)

    async def import_demo_com_cn_test_async(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ImportDemoComCnTestRequest,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ImportDemoComCnTestResponse:
        """
        Description: 长捷,qiujianglong.qjl
        Summary: api简介
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_demo_com_cn_test_ex_async(request, headers, runtime)

    def import_demo_com_cn_test_ex(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ImportDemoComCnTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ImportDemoComCnTestResponse:
        """
        Description: 长捷,qiujianglong.qjl
        Summary: api简介
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='demo.com.cn.test.import',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                import_demo_com_cn_test_response = ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ImportDemoComCnTestResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return import_demo_com_cn_test_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ImportDemoComCnTestResponse(),
            self.do_request('1.0', 'demo.com.cn.test.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_demo_com_cn_test_ex_async(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ImportDemoComCnTestRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ImportDemoComCnTestResponse:
        """
        Description: 长捷,qiujianglong.qjl
        Summary: api简介
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='demo.com.cn.test.import',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                import_demo_com_cn_test_response = ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ImportDemoComCnTestResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return import_demo_com_cn_test_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.ImportDemoComCnTestResponse(),
            await self.do_request_async('1.0', 'demo.com.cn.test.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_gateway_check_echoten(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.QueryDemoGatewayCheckEchotenRequest,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.QueryDemoGatewayCheckEchotenResponse:
        """
        Description: 10  测测aa
        Summary: 10s
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_gateway_check_echoten_ex(request, headers, runtime)

    async def query_demo_gateway_check_echoten_async(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.QueryDemoGatewayCheckEchotenRequest,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.QueryDemoGatewayCheckEchotenResponse:
        """
        Description: 10  测测aa
        Summary: 10s
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_gateway_check_echoten_ex_async(request, headers, runtime)

    def query_demo_gateway_check_echoten_ex(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.QueryDemoGatewayCheckEchotenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.QueryDemoGatewayCheckEchotenResponse:
        """
        Description: 10  测测aa
        Summary: 10s
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.QueryDemoGatewayCheckEchotenResponse(),
            self.do_request('1.0', 'demo.gateway.check.echoten.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_gateway_check_echoten_ex_async(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.QueryDemoGatewayCheckEchotenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.QueryDemoGatewayCheckEchotenResponse:
        """
        Description: 10  测测aa
        Summary: 10s
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.QueryDemoGatewayCheckEchotenResponse(),
            await self.do_request_async('1.0', 'demo.gateway.check.echoten.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ak__8fc_79ca_1cf_9041e_8b_9ec_7ac_63afacbb_4_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
