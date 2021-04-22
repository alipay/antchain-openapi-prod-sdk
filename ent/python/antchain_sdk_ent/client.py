# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ent import models as ent_models
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
        config: ent_models.Config,
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
            # 收益模型
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
                    'sdk_version': '1.4.6'
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
            # 收益模型
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
                    'sdk_version': '1.4.6'
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

    def query_customer_project(
        self,
        request: ent_models.QueryCustomerProjectRequest,
    ) -> ent_models.QueryCustomerProjectResponse:
        """
        Description: 查询用户参与的所有项目
        Summary: 用户参与的项目查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_customer_project_ex(request, headers, runtime)

    async def query_customer_project_async(
        self,
        request: ent_models.QueryCustomerProjectRequest,
    ) -> ent_models.QueryCustomerProjectResponse:
        """
        Description: 查询用户参与的所有项目
        Summary: 用户参与的项目查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_customer_project_ex_async(request, headers, runtime)

    def query_customer_project_ex(
        self,
        request: ent_models.QueryCustomerProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.QueryCustomerProjectResponse:
        """
        Description: 查询用户参与的所有项目
        Summary: 用户参与的项目查询
        """
        UtilClient.validate_model(request)
        return ent_models.QueryCustomerProjectResponse().from_map(
            self.do_request('1.0', 'antchain.ent.customer.project.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_customer_project_ex_async(
        self,
        request: ent_models.QueryCustomerProjectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.QueryCustomerProjectResponse:
        """
        Description: 查询用户参与的所有项目
        Summary: 用户参与的项目查询
        """
        UtilClient.validate_model(request)
        return ent_models.QueryCustomerProjectResponse().from_map(
            await self.do_request_async('1.0', 'antchain.ent.customer.project.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_customer_data(
        self,
        request: ent_models.QueryCustomerDataRequest,
    ) -> ent_models.QueryCustomerDataResponse:
        """
        Description: 查询用户数据的接口
        Summary: 用户数据查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_customer_data_ex(request, headers, runtime)

    async def query_customer_data_async(
        self,
        request: ent_models.QueryCustomerDataRequest,
    ) -> ent_models.QueryCustomerDataResponse:
        """
        Description: 查询用户数据的接口
        Summary: 用户数据查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_customer_data_ex_async(request, headers, runtime)

    def query_customer_data_ex(
        self,
        request: ent_models.QueryCustomerDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.QueryCustomerDataResponse:
        """
        Description: 查询用户数据的接口
        Summary: 用户数据查询接口
        """
        UtilClient.validate_model(request)
        return ent_models.QueryCustomerDataResponse().from_map(
            self.do_request('1.0', 'antchain.ent.customer.data.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_customer_data_ex_async(
        self,
        request: ent_models.QueryCustomerDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.QueryCustomerDataResponse:
        """
        Description: 查询用户数据的接口
        Summary: 用户数据查询接口
        """
        UtilClient.validate_model(request)
        return ent_models.QueryCustomerDataResponse().from_map(
            await self.do_request_async('1.0', 'antchain.ent.customer.data.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_user_sharecode(
        self,
        request: ent_models.GetUserSharecodeRequest,
    ) -> ent_models.GetUserSharecodeResponse:
        """
        Description: 为用户创建分享码
        Summary: 用户分享码创建接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_user_sharecode_ex(request, headers, runtime)

    async def get_user_sharecode_async(
        self,
        request: ent_models.GetUserSharecodeRequest,
    ) -> ent_models.GetUserSharecodeResponse:
        """
        Description: 为用户创建分享码
        Summary: 用户分享码创建接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_user_sharecode_ex_async(request, headers, runtime)

    def get_user_sharecode_ex(
        self,
        request: ent_models.GetUserSharecodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.GetUserSharecodeResponse:
        """
        Description: 为用户创建分享码
        Summary: 用户分享码创建接口
        """
        UtilClient.validate_model(request)
        return ent_models.GetUserSharecodeResponse().from_map(
            self.do_request('1.0', 'antchain.ent.user.sharecode.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_user_sharecode_ex_async(
        self,
        request: ent_models.GetUserSharecodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.GetUserSharecodeResponse:
        """
        Description: 为用户创建分享码
        Summary: 用户分享码创建接口
        """
        UtilClient.validate_model(request)
        return ent_models.GetUserSharecodeResponse().from_map(
            await self.do_request_async('1.0', 'antchain.ent.user.sharecode.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_user_projectordermsg(
        self,
        request: ent_models.SendUserProjectordermsgRequest,
    ) -> ent_models.SendUserProjectordermsgResponse:
        """
        Description: 发送用户的项目订单数据
        Summary: 用户项目订单消息发送接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_user_projectordermsg_ex(request, headers, runtime)

    async def send_user_projectordermsg_async(
        self,
        request: ent_models.SendUserProjectordermsgRequest,
    ) -> ent_models.SendUserProjectordermsgResponse:
        """
        Description: 发送用户的项目订单数据
        Summary: 用户项目订单消息发送接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_user_projectordermsg_ex_async(request, headers, runtime)

    def send_user_projectordermsg_ex(
        self,
        request: ent_models.SendUserProjectordermsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.SendUserProjectordermsgResponse:
        """
        Description: 发送用户的项目订单数据
        Summary: 用户项目订单消息发送接口
        """
        UtilClient.validate_model(request)
        return ent_models.SendUserProjectordermsgResponse().from_map(
            self.do_request('1.0', 'antchain.ent.user.projectordermsg.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_user_projectordermsg_ex_async(
        self,
        request: ent_models.SendUserProjectordermsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.SendUserProjectordermsgResponse:
        """
        Description: 发送用户的项目订单数据
        Summary: 用户项目订单消息发送接口
        """
        UtilClient.validate_model(request)
        return ent_models.SendUserProjectordermsgResponse().from_map(
            await self.do_request_async('1.0', 'antchain.ent.user.projectordermsg.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_project_info(
        self,
        request: ent_models.QueryProjectInfoRequest,
    ) -> ent_models.QueryProjectInfoResponse:
        """
        Description: 查询项目信息查询
        Summary: 项目信息查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_project_info_ex(request, headers, runtime)

    async def query_project_info_async(
        self,
        request: ent_models.QueryProjectInfoRequest,
    ) -> ent_models.QueryProjectInfoResponse:
        """
        Description: 查询项目信息查询
        Summary: 项目信息查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_project_info_ex_async(request, headers, runtime)

    def query_project_info_ex(
        self,
        request: ent_models.QueryProjectInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.QueryProjectInfoResponse:
        """
        Description: 查询项目信息查询
        Summary: 项目信息查询接口
        """
        UtilClient.validate_model(request)
        return ent_models.QueryProjectInfoResponse().from_map(
            self.do_request('1.0', 'antchain.ent.project.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_project_info_ex_async(
        self,
        request: ent_models.QueryProjectInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.QueryProjectInfoResponse:
        """
        Description: 查询项目信息查询
        Summary: 项目信息查询接口
        """
        UtilClient.validate_model(request)
        return ent_models.QueryProjectInfoResponse().from_map(
            await self.do_request_async('1.0', 'antchain.ent.project.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_user_info(
        self,
        request: ent_models.QueryUserInfoRequest,
    ) -> ent_models.QueryUserInfoResponse:
        """
        Description: 查询用户信息
        Summary: 用户信息查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_user_info_ex(request, headers, runtime)

    async def query_user_info_async(
        self,
        request: ent_models.QueryUserInfoRequest,
    ) -> ent_models.QueryUserInfoResponse:
        """
        Description: 查询用户信息
        Summary: 用户信息查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_user_info_ex_async(request, headers, runtime)

    def query_user_info_ex(
        self,
        request: ent_models.QueryUserInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.QueryUserInfoResponse:
        """
        Description: 查询用户信息
        Summary: 用户信息查询接口
        """
        UtilClient.validate_model(request)
        return ent_models.QueryUserInfoResponse().from_map(
            self.do_request('1.0', 'antchain.ent.user.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_user_info_ex_async(
        self,
        request: ent_models.QueryUserInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.QueryUserInfoResponse:
        """
        Description: 查询用户信息
        Summary: 用户信息查询接口
        """
        UtilClient.validate_model(request)
        return ent_models.QueryUserInfoResponse().from_map(
            await self.do_request_async('1.0', 'antchain.ent.user.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_user_tokenallocationdetail(
        self,
        request: ent_models.QueryUserTokenallocationdetailRequest,
    ) -> ent_models.QueryUserTokenallocationdetailResponse:
        """
        Description: 查询用户粉丝粒获得明细
        Summary: 用户粉丝粒获得明细查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_user_tokenallocationdetail_ex(request, headers, runtime)

    async def query_user_tokenallocationdetail_async(
        self,
        request: ent_models.QueryUserTokenallocationdetailRequest,
    ) -> ent_models.QueryUserTokenallocationdetailResponse:
        """
        Description: 查询用户粉丝粒获得明细
        Summary: 用户粉丝粒获得明细查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_user_tokenallocationdetail_ex_async(request, headers, runtime)

    def query_user_tokenallocationdetail_ex(
        self,
        request: ent_models.QueryUserTokenallocationdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.QueryUserTokenallocationdetailResponse:
        """
        Description: 查询用户粉丝粒获得明细
        Summary: 用户粉丝粒获得明细查询接口
        """
        UtilClient.validate_model(request)
        return ent_models.QueryUserTokenallocationdetailResponse().from_map(
            self.do_request('1.0', 'antchain.ent.user.tokenallocationdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_user_tokenallocationdetail_ex_async(
        self,
        request: ent_models.QueryUserTokenallocationdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.QueryUserTokenallocationdetailResponse:
        """
        Description: 查询用户粉丝粒获得明细
        Summary: 用户粉丝粒获得明细查询接口
        """
        UtilClient.validate_model(request)
        return ent_models.QueryUserTokenallocationdetailResponse().from_map(
            await self.do_request_async('1.0', 'antchain.ent.user.tokenallocationdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_user_tokenredeemdetail(
        self,
        request: ent_models.QueryUserTokenredeemdetailRequest,
    ) -> ent_models.QueryUserTokenredeemdetailResponse:
        """
        Description: 查询用户粉丝粒兑现明细
        Summary: 用户粉丝粒兑现明细查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_user_tokenredeemdetail_ex(request, headers, runtime)

    async def query_user_tokenredeemdetail_async(
        self,
        request: ent_models.QueryUserTokenredeemdetailRequest,
    ) -> ent_models.QueryUserTokenredeemdetailResponse:
        """
        Description: 查询用户粉丝粒兑现明细
        Summary: 用户粉丝粒兑现明细查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_user_tokenredeemdetail_ex_async(request, headers, runtime)

    def query_user_tokenredeemdetail_ex(
        self,
        request: ent_models.QueryUserTokenredeemdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.QueryUserTokenredeemdetailResponse:
        """
        Description: 查询用户粉丝粒兑现明细
        Summary: 用户粉丝粒兑现明细查询接口
        """
        UtilClient.validate_model(request)
        return ent_models.QueryUserTokenredeemdetailResponse().from_map(
            self.do_request('1.0', 'antchain.ent.user.tokenredeemdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_user_tokenredeemdetail_ex_async(
        self,
        request: ent_models.QueryUserTokenredeemdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.QueryUserTokenredeemdetailResponse:
        """
        Description: 查询用户粉丝粒兑现明细
        Summary: 用户粉丝粒兑现明细查询接口
        """
        UtilClient.validate_model(request)
        return ent_models.QueryUserTokenredeemdetailResponse().from_map(
            await self.do_request_async('1.0', 'antchain.ent.user.tokenredeemdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_event_report(
        self,
        request: ent_models.ExecEventReportRequest,
    ) -> ent_models.ExecEventReportResponse:
        """
        Description: 上报事件
        Summary: 事件上报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_event_report_ex(request, headers, runtime)

    async def exec_event_report_async(
        self,
        request: ent_models.ExecEventReportRequest,
    ) -> ent_models.ExecEventReportResponse:
        """
        Description: 上报事件
        Summary: 事件上报
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_event_report_ex_async(request, headers, runtime)

    def exec_event_report_ex(
        self,
        request: ent_models.ExecEventReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.ExecEventReportResponse:
        """
        Description: 上报事件
        Summary: 事件上报
        """
        UtilClient.validate_model(request)
        return ent_models.ExecEventReportResponse().from_map(
            self.do_request('1.0', 'antchain.ent.event.report.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_event_report_ex_async(
        self,
        request: ent_models.ExecEventReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.ExecEventReportResponse:
        """
        Description: 上报事件
        Summary: 事件上报
        """
        UtilClient.validate_model(request)
        return ent_models.ExecEventReportResponse().from_map(
            await self.do_request_async('1.0', 'antchain.ent.event.report.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_event_info(
        self,
        request: ent_models.QueryEventInfoRequest,
    ) -> ent_models.QueryEventInfoResponse:
        """
        Description: 查询事件信息
        Summary: 事件信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_event_info_ex(request, headers, runtime)

    async def query_event_info_async(
        self,
        request: ent_models.QueryEventInfoRequest,
    ) -> ent_models.QueryEventInfoResponse:
        """
        Description: 查询事件信息
        Summary: 事件信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_event_info_ex_async(request, headers, runtime)

    def query_event_info_ex(
        self,
        request: ent_models.QueryEventInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.QueryEventInfoResponse:
        """
        Description: 查询事件信息
        Summary: 事件信息查询
        """
        UtilClient.validate_model(request)
        return ent_models.QueryEventInfoResponse().from_map(
            self.do_request('1.0', 'antchain.ent.event.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_event_info_ex_async(
        self,
        request: ent_models.QueryEventInfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.QueryEventInfoResponse:
        """
        Description: 查询事件信息
        Summary: 事件信息查询
        """
        UtilClient.validate_model(request)
        return ent_models.QueryEventInfoResponse().from_map(
            await self.do_request_async('1.0', 'antchain.ent.event.info.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_nft_meta(
        self,
        request: ent_models.ImportNftMetaRequest,
    ) -> ent_models.ImportNftMetaResponse:
        """
        Description: 阿里拍卖nft资产元数据导入
        Summary: 阿里拍卖nft资产元数据导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_nft_meta_ex(request, headers, runtime)

    async def import_nft_meta_async(
        self,
        request: ent_models.ImportNftMetaRequest,
    ) -> ent_models.ImportNftMetaResponse:
        """
        Description: 阿里拍卖nft资产元数据导入
        Summary: 阿里拍卖nft资产元数据导入
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_nft_meta_ex_async(request, headers, runtime)

    def import_nft_meta_ex(
        self,
        request: ent_models.ImportNftMetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.ImportNftMetaResponse:
        """
        Description: 阿里拍卖nft资产元数据导入
        Summary: 阿里拍卖nft资产元数据导入
        """
        UtilClient.validate_model(request)
        return ent_models.ImportNftMetaResponse().from_map(
            self.do_request('1.0', 'antchain.ent.nft.meta.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_nft_meta_ex_async(
        self,
        request: ent_models.ImportNftMetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.ImportNftMetaResponse:
        """
        Description: 阿里拍卖nft资产元数据导入
        Summary: 阿里拍卖nft资产元数据导入
        """
        UtilClient.validate_model(request)
        return ent_models.ImportNftMetaResponse().from_map(
            await self.do_request_async('1.0', 'antchain.ent.nft.meta.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_nft_transfer(
        self,
        request: ent_models.ExecNftTransferRequest,
    ) -> ent_models.ExecNftTransferResponse:
        """
        Description: nft资产订单落库，链上流转
        Summary: nft资产流转
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_nft_transfer_ex(request, headers, runtime)

    async def exec_nft_transfer_async(
        self,
        request: ent_models.ExecNftTransferRequest,
    ) -> ent_models.ExecNftTransferResponse:
        """
        Description: nft资产订单落库，链上流转
        Summary: nft资产流转
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_nft_transfer_ex_async(request, headers, runtime)

    def exec_nft_transfer_ex(
        self,
        request: ent_models.ExecNftTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.ExecNftTransferResponse:
        """
        Description: nft资产订单落库，链上流转
        Summary: nft资产流转
        """
        UtilClient.validate_model(request)
        return ent_models.ExecNftTransferResponse().from_map(
            self.do_request('1.0', 'antchain.ent.nft.transfer.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_nft_transfer_ex_async(
        self,
        request: ent_models.ExecNftTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.ExecNftTransferResponse:
        """
        Description: nft资产订单落库，链上流转
        Summary: nft资产流转
        """
        UtilClient.validate_model(request)
        return ent_models.ExecNftTransferResponse().from_map(
            await self.do_request_async('1.0', 'antchain.ent.nft.transfer.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_isv_sharecode(
        self,
        request: ent_models.GetIsvSharecodeRequest,
    ) -> ent_models.GetIsvSharecodeResponse:
        """
        Description: 外部ISV获取分享码接口
        Summary: 获得ISV分享码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_isv_sharecode_ex(request, headers, runtime)

    async def get_isv_sharecode_async(
        self,
        request: ent_models.GetIsvSharecodeRequest,
    ) -> ent_models.GetIsvSharecodeResponse:
        """
        Description: 外部ISV获取分享码接口
        Summary: 获得ISV分享码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_isv_sharecode_ex_async(request, headers, runtime)

    def get_isv_sharecode_ex(
        self,
        request: ent_models.GetIsvSharecodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.GetIsvSharecodeResponse:
        """
        Description: 外部ISV获取分享码接口
        Summary: 获得ISV分享码
        """
        UtilClient.validate_model(request)
        return ent_models.GetIsvSharecodeResponse().from_map(
            self.do_request('1.0', 'antchain.ent.isv.sharecode.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_isv_sharecode_ex_async(
        self,
        request: ent_models.GetIsvSharecodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.GetIsvSharecodeResponse:
        """
        Description: 外部ISV获取分享码接口
        Summary: 获得ISV分享码
        """
        UtilClient.validate_model(request)
        return ent_models.GetIsvSharecodeResponse().from_map(
            await self.do_request_async('1.0', 'antchain.ent.isv.sharecode.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_provision(
        self,
        request: ent_models.AddProvisionRequest,
    ) -> ent_models.AddProvisionResponse:
        """
        Description: 备付金追加接口
        Summary: 备付金追加接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_provision_ex(request, headers, runtime)

    async def add_provision_async(
        self,
        request: ent_models.AddProvisionRequest,
    ) -> ent_models.AddProvisionResponse:
        """
        Description: 备付金追加接口
        Summary: 备付金追加接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_provision_ex_async(request, headers, runtime)

    def add_provision_ex(
        self,
        request: ent_models.AddProvisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.AddProvisionResponse:
        """
        Description: 备付金追加接口
        Summary: 备付金追加接口
        """
        UtilClient.validate_model(request)
        return ent_models.AddProvisionResponse().from_map(
            self.do_request('1.0', 'antchain.ent.provision.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_provision_ex_async(
        self,
        request: ent_models.AddProvisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.AddProvisionResponse:
        """
        Description: 备付金追加接口
        Summary: 备付金追加接口
        """
        UtilClient.validate_model(request)
        return ent_models.AddProvisionResponse().from_map(
            await self.do_request_async('1.0', 'antchain.ent.provision.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reclaim_provision_extraprovision(
        self,
        request: ent_models.ReclaimProvisionExtraprovisionRequest,
    ) -> ent_models.ReclaimProvisionExtraprovisionResponse:
        """
        Description: 赎回链上多余备付金
        Summary: 赎回链上多余备付金
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reclaim_provision_extraprovision_ex(request, headers, runtime)

    async def reclaim_provision_extraprovision_async(
        self,
        request: ent_models.ReclaimProvisionExtraprovisionRequest,
    ) -> ent_models.ReclaimProvisionExtraprovisionResponse:
        """
        Description: 赎回链上多余备付金
        Summary: 赎回链上多余备付金
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reclaim_provision_extraprovision_ex_async(request, headers, runtime)

    def reclaim_provision_extraprovision_ex(
        self,
        request: ent_models.ReclaimProvisionExtraprovisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.ReclaimProvisionExtraprovisionResponse:
        """
        Description: 赎回链上多余备付金
        Summary: 赎回链上多余备付金
        """
        UtilClient.validate_model(request)
        return ent_models.ReclaimProvisionExtraprovisionResponse().from_map(
            self.do_request('1.0', 'antchain.ent.provision.extraprovision.reclaim', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reclaim_provision_extraprovision_ex_async(
        self,
        request: ent_models.ReclaimProvisionExtraprovisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.ReclaimProvisionExtraprovisionResponse:
        """
        Description: 赎回链上多余备付金
        Summary: 赎回链上多余备付金
        """
        UtilClient.validate_model(request)
        return ent_models.ReclaimProvisionExtraprovisionResponse().from_map(
            await self.do_request_async('1.0', 'antchain.ent.provision.extraprovision.reclaim', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_token_redeem(
        self,
        request: ent_models.ExecTokenRedeemRequest,
    ) -> ent_models.ExecTokenRedeemResponse:
        """
        Description: 链上Token兑现接口
        Summary: 链上Token兑现接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_token_redeem_ex(request, headers, runtime)

    async def exec_token_redeem_async(
        self,
        request: ent_models.ExecTokenRedeemRequest,
    ) -> ent_models.ExecTokenRedeemResponse:
        """
        Description: 链上Token兑现接口
        Summary: 链上Token兑现接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_token_redeem_ex_async(request, headers, runtime)

    def exec_token_redeem_ex(
        self,
        request: ent_models.ExecTokenRedeemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.ExecTokenRedeemResponse:
        """
        Description: 链上Token兑现接口
        Summary: 链上Token兑现接口
        """
        UtilClient.validate_model(request)
        return ent_models.ExecTokenRedeemResponse().from_map(
            self.do_request('1.0', 'antchain.ent.token.redeem.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_token_redeem_ex_async(
        self,
        request: ent_models.ExecTokenRedeemRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.ExecTokenRedeemResponse:
        """
        Description: 链上Token兑现接口
        Summary: 链上Token兑现接口
        """
        UtilClient.validate_model(request)
        return ent_models.ExecTokenRedeemResponse().from_map(
            await self.do_request_async('1.0', 'antchain.ent.token.redeem.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_tpp_sharecode(
        self,
        request: ent_models.GetTppSharecodeRequest,
    ) -> ent_models.GetTppSharecodeResponse:
        """
        Description: 针对淘票票的获取专属邀请码获取接口
        Summary: 淘票票专属邀请码获取接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_tpp_sharecode_ex(request, headers, runtime)

    async def get_tpp_sharecode_async(
        self,
        request: ent_models.GetTppSharecodeRequest,
    ) -> ent_models.GetTppSharecodeResponse:
        """
        Description: 针对淘票票的获取专属邀请码获取接口
        Summary: 淘票票专属邀请码获取接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_tpp_sharecode_ex_async(request, headers, runtime)

    def get_tpp_sharecode_ex(
        self,
        request: ent_models.GetTppSharecodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.GetTppSharecodeResponse:
        """
        Description: 针对淘票票的获取专属邀请码获取接口
        Summary: 淘票票专属邀请码获取接口
        """
        UtilClient.validate_model(request)
        return ent_models.GetTppSharecodeResponse().from_map(
            self.do_request('1.0', 'antchain.ent.tpp.sharecode.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_tpp_sharecode_ex_async(
        self,
        request: ent_models.GetTppSharecodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.GetTppSharecodeResponse:
        """
        Description: 针对淘票票的获取专属邀请码获取接口
        Summary: 淘票票专属邀请码获取接口
        """
        UtilClient.validate_model(request)
        return ent_models.GetTppSharecodeResponse().from_map(
            await self.do_request_async('1.0', 'antchain.ent.tpp.sharecode.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_tpp_allinfo(
        self,
        request: ent_models.QueryTppAllinfoRequest,
    ) -> ent_models.QueryTppAllinfoResponse:
        """
        Description: 针对淘票票的查询全部必要信息的接口
        Summary: 淘票票查询全部必要信息接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_tpp_allinfo_ex(request, headers, runtime)

    async def query_tpp_allinfo_async(
        self,
        request: ent_models.QueryTppAllinfoRequest,
    ) -> ent_models.QueryTppAllinfoResponse:
        """
        Description: 针对淘票票的查询全部必要信息的接口
        Summary: 淘票票查询全部必要信息接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_tpp_allinfo_ex_async(request, headers, runtime)

    def query_tpp_allinfo_ex(
        self,
        request: ent_models.QueryTppAllinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.QueryTppAllinfoResponse:
        """
        Description: 针对淘票票的查询全部必要信息的接口
        Summary: 淘票票查询全部必要信息接口
        """
        UtilClient.validate_model(request)
        return ent_models.QueryTppAllinfoResponse().from_map(
            self.do_request('1.0', 'antchain.ent.tpp.allinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_tpp_allinfo_ex_async(
        self,
        request: ent_models.QueryTppAllinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.QueryTppAllinfoResponse:
        """
        Description: 针对淘票票的查询全部必要信息的接口
        Summary: 淘票票查询全部必要信息接口
        """
        UtilClient.validate_model(request)
        return ent_models.QueryTppAllinfoResponse().from_map(
            await self.do_request_async('1.0', 'antchain.ent.tpp.allinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_tpp_participationinfo(
        self,
        request: ent_models.QueryTppParticipationinfoRequest,
    ) -> ent_models.QueryTppParticipationinfoResponse:
        """
        Description: 针对淘票票的参与信息查询接口
        Summary: 淘票票参与信息查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_tpp_participationinfo_ex(request, headers, runtime)

    async def query_tpp_participationinfo_async(
        self,
        request: ent_models.QueryTppParticipationinfoRequest,
    ) -> ent_models.QueryTppParticipationinfoResponse:
        """
        Description: 针对淘票票的参与信息查询接口
        Summary: 淘票票参与信息查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_tpp_participationinfo_ex_async(request, headers, runtime)

    def query_tpp_participationinfo_ex(
        self,
        request: ent_models.QueryTppParticipationinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.QueryTppParticipationinfoResponse:
        """
        Description: 针对淘票票的参与信息查询接口
        Summary: 淘票票参与信息查询接口
        """
        UtilClient.validate_model(request)
        return ent_models.QueryTppParticipationinfoResponse().from_map(
            self.do_request('1.0', 'antchain.ent.tpp.participationinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_tpp_participationinfo_ex_async(
        self,
        request: ent_models.QueryTppParticipationinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ent_models.QueryTppParticipationinfoResponse:
        """
        Description: 针对淘票票的参与信息查询接口
        Summary: 淘票票参与信息查询接口
        """
        UtilClient.validate_model(request)
        return ent_models.QueryTppParticipationinfoResponse().from_map(
            await self.do_request_async('1.0', 'antchain.ent.tpp.participationinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
