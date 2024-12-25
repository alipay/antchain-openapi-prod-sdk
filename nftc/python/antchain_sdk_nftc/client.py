# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_nftc import models as nftc_models
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
        config: nftc_models.Config,
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
            # 数字人部件素材对象
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
                    'sdk_version': '1.0.30',
                    '_prod_code': 'NFTC',
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
            # 数字人部件素材对象
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
                    'sdk_version': '1.0.30',
                    '_prod_code': 'NFTC',
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

    def query_aso_distinct(
        self,
        request: nftc_models.QueryAsoDistinctRequest,
    ) -> nftc_models.QueryAsoDistinctResponse:
        """
        Description: ASO排重
        Summary: ASO排重
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_aso_distinct_ex(request, headers, runtime)

    async def query_aso_distinct_async(
        self,
        request: nftc_models.QueryAsoDistinctRequest,
    ) -> nftc_models.QueryAsoDistinctResponse:
        """
        Description: ASO排重
        Summary: ASO排重
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_aso_distinct_ex_async(request, headers, runtime)

    def query_aso_distinct_ex(
        self,
        request: nftc_models.QueryAsoDistinctRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryAsoDistinctResponse:
        """
        Description: ASO排重
        Summary: ASO排重
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryAsoDistinctResponse(),
            self.do_request('1.0', 'antchain.nftc.aso.distinct.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_aso_distinct_ex_async(
        self,
        request: nftc_models.QueryAsoDistinctRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryAsoDistinctResponse:
        """
        Description: ASO排重
        Summary: ASO排重
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryAsoDistinctResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.aso.distinct.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_aso_click(
        self,
        request: nftc_models.SubmitAsoClickRequest,
    ) -> nftc_models.SubmitAsoClickResponse:
        """
        Description: ASO点击
        Summary: ASO点击
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_aso_click_ex(request, headers, runtime)

    async def submit_aso_click_async(
        self,
        request: nftc_models.SubmitAsoClickRequest,
    ) -> nftc_models.SubmitAsoClickResponse:
        """
        Description: ASO点击
        Summary: ASO点击
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_aso_click_ex_async(request, headers, runtime)

    def submit_aso_click_ex(
        self,
        request: nftc_models.SubmitAsoClickRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.SubmitAsoClickResponse:
        """
        Description: ASO点击
        Summary: ASO点击
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.SubmitAsoClickResponse(),
            self.do_request('1.0', 'antchain.nftc.aso.click.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_aso_click_ex_async(
        self,
        request: nftc_models.SubmitAsoClickRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.SubmitAsoClickResponse:
        """
        Description: ASO点击
        Summary: ASO点击
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.SubmitAsoClickResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.aso.click.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_avatar_profile(
        self,
        request: nftc_models.QueryAvatarProfileRequest,
    ) -> nftc_models.QueryAvatarProfileResponse:
        """
        Description: 获取当前用户的数字人形象，进而在NBA空间内进行渲染
        Summary: 查询当前数字人形象
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_avatar_profile_ex(request, headers, runtime)

    async def query_avatar_profile_async(
        self,
        request: nftc_models.QueryAvatarProfileRequest,
    ) -> nftc_models.QueryAvatarProfileResponse:
        """
        Description: 获取当前用户的数字人形象，进而在NBA空间内进行渲染
        Summary: 查询当前数字人形象
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_avatar_profile_ex_async(request, headers, runtime)

    def query_avatar_profile_ex(
        self,
        request: nftc_models.QueryAvatarProfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryAvatarProfileResponse:
        """
        Description: 获取当前用户的数字人形象，进而在NBA空间内进行渲染
        Summary: 查询当前数字人形象
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryAvatarProfileResponse(),
            self.do_request('1.0', 'antchain.nftc.avatar.profile.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_avatar_profile_ex_async(
        self,
        request: nftc_models.QueryAvatarProfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryAvatarProfileResponse:
        """
        Description: 获取当前用户的数字人形象，进而在NBA空间内进行渲染
        Summary: 查询当前数字人形象
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryAvatarProfileResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.avatar.profile.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_promote_activity(
        self,
        request: nftc_models.QueryPromoteActivityRequest,
    ) -> nftc_models.QueryPromoteActivityResponse:
        """
        Description: 根据活动编码以及用户的openUid查询用户当前助力活动的状态以及进度
        Summary: 查询用户助力活动信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_promote_activity_ex(request, headers, runtime)

    async def query_promote_activity_async(
        self,
        request: nftc_models.QueryPromoteActivityRequest,
    ) -> nftc_models.QueryPromoteActivityResponse:
        """
        Description: 根据活动编码以及用户的openUid查询用户当前助力活动的状态以及进度
        Summary: 查询用户助力活动信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_promote_activity_ex_async(request, headers, runtime)

    def query_promote_activity_ex(
        self,
        request: nftc_models.QueryPromoteActivityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryPromoteActivityResponse:
        """
        Description: 根据活动编码以及用户的openUid查询用户当前助力活动的状态以及进度
        Summary: 查询用户助力活动信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryPromoteActivityResponse(),
            self.do_request('1.0', 'antchain.nftc.promote.activity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_promote_activity_ex_async(
        self,
        request: nftc_models.QueryPromoteActivityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryPromoteActivityResponse:
        """
        Description: 根据活动编码以及用户的openUid查询用户当前助力活动的状态以及进度
        Summary: 查询用户助力活动信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryPromoteActivityResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.promote.activity.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_promote_shareurl(
        self,
        request: nftc_models.GetPromoteShareurlRequest,
    ) -> nftc_models.GetPromoteShareurlResponse:
        """
        Description: 根据活动编码以及用户的openUid发起助力，获取分享的url链接
        Summary: 发起助力分享
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_promote_shareurl_ex(request, headers, runtime)

    async def get_promote_shareurl_async(
        self,
        request: nftc_models.GetPromoteShareurlRequest,
    ) -> nftc_models.GetPromoteShareurlResponse:
        """
        Description: 根据活动编码以及用户的openUid发起助力，获取分享的url链接
        Summary: 发起助力分享
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_promote_shareurl_ex_async(request, headers, runtime)

    def get_promote_shareurl_ex(
        self,
        request: nftc_models.GetPromoteShareurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.GetPromoteShareurlResponse:
        """
        Description: 根据活动编码以及用户的openUid发起助力，获取分享的url链接
        Summary: 发起助力分享
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.GetPromoteShareurlResponse(),
            self.do_request('1.0', 'antchain.nftc.promote.shareurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_promote_shareurl_ex_async(
        self,
        request: nftc_models.GetPromoteShareurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.GetPromoteShareurlResponse:
        """
        Description: 根据活动编码以及用户的openUid发起助力，获取分享的url链接
        Summary: 发起助力分享
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.GetPromoteShareurlResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.promote.shareurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_task_reward(
        self,
        request: nftc_models.ConfirmTaskRewardRequest,
    ) -> nftc_models.ConfirmTaskRewardResponse:
        """
        Description: 确认奖励到账
        Summary: 确认奖励到账
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_task_reward_ex(request, headers, runtime)

    async def confirm_task_reward_async(
        self,
        request: nftc_models.ConfirmTaskRewardRequest,
    ) -> nftc_models.ConfirmTaskRewardResponse:
        """
        Description: 确认奖励到账
        Summary: 确认奖励到账
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_task_reward_ex_async(request, headers, runtime)

    def confirm_task_reward_ex(
        self,
        request: nftc_models.ConfirmTaskRewardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.ConfirmTaskRewardResponse:
        """
        Description: 确认奖励到账
        Summary: 确认奖励到账
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.ConfirmTaskRewardResponse(),
            self.do_request('1.0', 'antchain.nftc.task.reward.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_task_reward_ex_async(
        self,
        request: nftc_models.ConfirmTaskRewardRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.ConfirmTaskRewardResponse:
        """
        Description: 确认奖励到账
        Summary: 确认奖励到账
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.ConfirmTaskRewardResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.task.reward.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_oauth_token(
        self,
        request: nftc_models.ApplyOauthTokenRequest,
    ) -> nftc_models.ApplyOauthTokenResponse:
        """
        Description: authcode换取token
        Summary: authcode换取token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_oauth_token_ex(request, headers, runtime)

    async def apply_oauth_token_async(
        self,
        request: nftc_models.ApplyOauthTokenRequest,
    ) -> nftc_models.ApplyOauthTokenResponse:
        """
        Description: authcode换取token
        Summary: authcode换取token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_oauth_token_ex_async(request, headers, runtime)

    def apply_oauth_token_ex(
        self,
        request: nftc_models.ApplyOauthTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.ApplyOauthTokenResponse:
        """
        Description: authcode换取token
        Summary: authcode换取token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.ApplyOauthTokenResponse(),
            self.do_request('1.0', 'antchain.nftc.oauth.token.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_oauth_token_ex_async(
        self,
        request: nftc_models.ApplyOauthTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.ApplyOauthTokenResponse:
        """
        Description: authcode换取token
        Summary: authcode换取token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.ApplyOauthTokenResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.oauth.token.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_oauth_userinfo(
        self,
        request: nftc_models.QueryOauthUserinfoRequest,
    ) -> nftc_models.QueryOauthUserinfoResponse:
        """
        Description: token获取头像/昵称
        Summary: token获取头像/昵称
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_oauth_userinfo_ex(request, headers, runtime)

    async def query_oauth_userinfo_async(
        self,
        request: nftc_models.QueryOauthUserinfoRequest,
    ) -> nftc_models.QueryOauthUserinfoResponse:
        """
        Description: token获取头像/昵称
        Summary: token获取头像/昵称
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_oauth_userinfo_ex_async(request, headers, runtime)

    def query_oauth_userinfo_ex(
        self,
        request: nftc_models.QueryOauthUserinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryOauthUserinfoResponse:
        """
        Description: token获取头像/昵称
        Summary: token获取头像/昵称
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryOauthUserinfoResponse(),
            self.do_request('1.0', 'antchain.nftc.oauth.userinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_oauth_userinfo_ex_async(
        self,
        request: nftc_models.QueryOauthUserinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryOauthUserinfoResponse:
        """
        Description: token获取头像/昵称
        Summary: token获取头像/昵称
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryOauthUserinfoResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.oauth.userinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_oauth_userinfotoken(
        self,
        request: nftc_models.ApplyOauthUserinfotokenRequest,
    ) -> nftc_models.ApplyOauthUserinfotokenResponse:
        """
        Description: 获取用户Token
        Summary: 获取用户Token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_oauth_userinfotoken_ex(request, headers, runtime)

    async def apply_oauth_userinfotoken_async(
        self,
        request: nftc_models.ApplyOauthUserinfotokenRequest,
    ) -> nftc_models.ApplyOauthUserinfotokenResponse:
        """
        Description: 获取用户Token
        Summary: 获取用户Token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_oauth_userinfotoken_ex_async(request, headers, runtime)

    def apply_oauth_userinfotoken_ex(
        self,
        request: nftc_models.ApplyOauthUserinfotokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.ApplyOauthUserinfotokenResponse:
        """
        Description: 获取用户Token
        Summary: 获取用户Token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.ApplyOauthUserinfotokenResponse(),
            self.do_request('1.0', 'antchain.nftc.oauth.userinfotoken.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_oauth_userinfotoken_ex_async(
        self,
        request: nftc_models.ApplyOauthUserinfotokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.ApplyOauthUserinfotokenResponse:
        """
        Description: 获取用户Token
        Summary: 获取用户Token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.ApplyOauthUserinfotokenResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.oauth.userinfotoken.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_oauth_realnameinfo(
        self,
        request: nftc_models.QueryOauthRealnameinfoRequest,
    ) -> nftc_models.QueryOauthRealnameinfoResponse:
        """
        Description: token获取实名信息
        Summary: token获取实名认证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_oauth_realnameinfo_ex(request, headers, runtime)

    async def query_oauth_realnameinfo_async(
        self,
        request: nftc_models.QueryOauthRealnameinfoRequest,
    ) -> nftc_models.QueryOauthRealnameinfoResponse:
        """
        Description: token获取实名信息
        Summary: token获取实名认证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_oauth_realnameinfo_ex_async(request, headers, runtime)

    def query_oauth_realnameinfo_ex(
        self,
        request: nftc_models.QueryOauthRealnameinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryOauthRealnameinfoResponse:
        """
        Description: token获取实名信息
        Summary: token获取实名认证信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryOauthRealnameinfoResponse(),
            self.do_request('1.0', 'antchain.nftc.oauth.realnameinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_oauth_realnameinfo_ex_async(
        self,
        request: nftc_models.QueryOauthRealnameinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryOauthRealnameinfoResponse:
        """
        Description: token获取实名信息
        Summary: token获取实名认证信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryOauthRealnameinfoResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.oauth.realnameinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_sms_message(
        self,
        request: nftc_models.SendSmsMessageRequest,
    ) -> nftc_models.SendSmsMessageResponse:
        """
        Description: 短信发送
        Summary: 短信发送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_sms_message_ex(request, headers, runtime)

    async def send_sms_message_async(
        self,
        request: nftc_models.SendSmsMessageRequest,
    ) -> nftc_models.SendSmsMessageResponse:
        """
        Description: 短信发送
        Summary: 短信发送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_sms_message_ex_async(request, headers, runtime)

    def send_sms_message_ex(
        self,
        request: nftc_models.SendSmsMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.SendSmsMessageResponse:
        """
        Description: 短信发送
        Summary: 短信发送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.SendSmsMessageResponse(),
            self.do_request('1.0', 'antchain.nftc.sms.message.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_sms_message_ex_async(
        self,
        request: nftc_models.SendSmsMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.SendSmsMessageResponse:
        """
        Description: 短信发送
        Summary: 短信发送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.SendSmsMessageResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.sms.message.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def publish_merchant_diysku(
        self,
        request: nftc_models.PublishMerchantDiyskuRequest,
    ) -> nftc_models.PublishMerchantDiyskuResponse:
        """
        Description: DIY藏品发放
        Summary: DIY藏品发放
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.publish_merchant_diysku_ex(request, headers, runtime)

    async def publish_merchant_diysku_async(
        self,
        request: nftc_models.PublishMerchantDiyskuRequest,
    ) -> nftc_models.PublishMerchantDiyskuResponse:
        """
        Description: DIY藏品发放
        Summary: DIY藏品发放
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.publish_merchant_diysku_ex_async(request, headers, runtime)

    def publish_merchant_diysku_ex(
        self,
        request: nftc_models.PublishMerchantDiyskuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.PublishMerchantDiyskuResponse:
        """
        Description: DIY藏品发放
        Summary: DIY藏品发放
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.PublishMerchantDiyskuResponse(),
            self.do_request('1.0', 'antchain.nftc.merchant.diysku.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def publish_merchant_diysku_ex_async(
        self,
        request: nftc_models.PublishMerchantDiyskuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.PublishMerchantDiyskuResponse:
        """
        Description: DIY藏品发放
        Summary: DIY藏品发放
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.PublishMerchantDiyskuResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.merchant.diysku.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_merchant_diysku(
        self,
        request: nftc_models.QueryMerchantDiyskuRequest,
    ) -> nftc_models.QueryMerchantDiyskuResponse:
        """
        Description: DIY藏品发放查询
        Summary: DIY藏品发放查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_merchant_diysku_ex(request, headers, runtime)

    async def query_merchant_diysku_async(
        self,
        request: nftc_models.QueryMerchantDiyskuRequest,
    ) -> nftc_models.QueryMerchantDiyskuResponse:
        """
        Description: DIY藏品发放查询
        Summary: DIY藏品发放查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_merchant_diysku_ex_async(request, headers, runtime)

    def query_merchant_diysku_ex(
        self,
        request: nftc_models.QueryMerchantDiyskuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryMerchantDiyskuResponse:
        """
        Description: DIY藏品发放查询
        Summary: DIY藏品发放查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryMerchantDiyskuResponse(),
            self.do_request('1.0', 'antchain.nftc.merchant.diysku.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_merchant_diysku_ex_async(
        self,
        request: nftc_models.QueryMerchantDiyskuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryMerchantDiyskuResponse:
        """
        Description: DIY藏品发放查询
        Summary: DIY藏品发放查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryMerchantDiyskuResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.merchant.diysku.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_merchant_ugcimages(
        self,
        request: nftc_models.QueryMerchantUgcimagesRequest,
    ) -> nftc_models.QueryMerchantUgcimagesResponse:
        """
        Description: 提供ISV  ugc铸造图片查询的openapi服务
        Summary: ugc铸造图片查询的openapi接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_merchant_ugcimages_ex(request, headers, runtime)

    async def query_merchant_ugcimages_async(
        self,
        request: nftc_models.QueryMerchantUgcimagesRequest,
    ) -> nftc_models.QueryMerchantUgcimagesResponse:
        """
        Description: 提供ISV  ugc铸造图片查询的openapi服务
        Summary: ugc铸造图片查询的openapi接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_merchant_ugcimages_ex_async(request, headers, runtime)

    def query_merchant_ugcimages_ex(
        self,
        request: nftc_models.QueryMerchantUgcimagesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryMerchantUgcimagesResponse:
        """
        Description: 提供ISV  ugc铸造图片查询的openapi服务
        Summary: ugc铸造图片查询的openapi接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryMerchantUgcimagesResponse(),
            self.do_request('1.0', 'antchain.nftc.merchant.ugcimages.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_merchant_ugcimages_ex_async(
        self,
        request: nftc_models.QueryMerchantUgcimagesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryMerchantUgcimagesResponse:
        """
        Description: 提供ISV  ugc铸造图片查询的openapi服务
        Summary: ugc铸造图片查询的openapi接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryMerchantUgcimagesResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.merchant.ugcimages.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_nft_transfer(
        self,
        request: nftc_models.ApplyNftTransferRequest,
    ) -> nftc_models.ApplyNftTransferResponse:
        """
        Description: 租户根据sku给用户发放藏品
        Summary: 发放藏品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_nft_transfer_ex(request, headers, runtime)

    async def apply_nft_transfer_async(
        self,
        request: nftc_models.ApplyNftTransferRequest,
    ) -> nftc_models.ApplyNftTransferResponse:
        """
        Description: 租户根据sku给用户发放藏品
        Summary: 发放藏品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_nft_transfer_ex_async(request, headers, runtime)

    def apply_nft_transfer_ex(
        self,
        request: nftc_models.ApplyNftTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.ApplyNftTransferResponse:
        """
        Description: 租户根据sku给用户发放藏品
        Summary: 发放藏品
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.ApplyNftTransferResponse(),
            self.do_request('1.0', 'antchain.nftc.nft.transfer.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_nft_transfer_ex_async(
        self,
        request: nftc_models.ApplyNftTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.ApplyNftTransferResponse:
        """
        Description: 租户根据sku给用户发放藏品
        Summary: 发放藏品
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.ApplyNftTransferResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.nft.transfer.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_nft_customer(
        self,
        request: nftc_models.PagequeryNftCustomerRequest,
    ) -> nftc_models.PagequeryNftCustomerResponse:
        """
        Description: 调用租户分页查询用户该租户发行的sku的资产
        Summary: 查询藏品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_nft_customer_ex(request, headers, runtime)

    async def pagequery_nft_customer_async(
        self,
        request: nftc_models.PagequeryNftCustomerRequest,
    ) -> nftc_models.PagequeryNftCustomerResponse:
        """
        Description: 调用租户分页查询用户该租户发行的sku的资产
        Summary: 查询藏品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_nft_customer_ex_async(request, headers, runtime)

    def pagequery_nft_customer_ex(
        self,
        request: nftc_models.PagequeryNftCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.PagequeryNftCustomerResponse:
        """
        Description: 调用租户分页查询用户该租户发行的sku的资产
        Summary: 查询藏品
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.PagequeryNftCustomerResponse(),
            self.do_request('1.0', 'antchain.nftc.nft.customer.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_nft_customer_ex_async(
        self,
        request: nftc_models.PagequeryNftCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.PagequeryNftCustomerResponse:
        """
        Description: 调用租户分页查询用户该租户发行的sku的资产
        Summary: 查询藏品
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.PagequeryNftCustomerResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.nft.customer.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_nft_order(
        self,
        request: nftc_models.QueryNftOrderRequest,
    ) -> nftc_models.QueryNftOrderResponse:
        """
        Description: 查询支付结果
        Summary: 查询支付结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_nft_order_ex(request, headers, runtime)

    async def query_nft_order_async(
        self,
        request: nftc_models.QueryNftOrderRequest,
    ) -> nftc_models.QueryNftOrderResponse:
        """
        Description: 查询支付结果
        Summary: 查询支付结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_nft_order_ex_async(request, headers, runtime)

    def query_nft_order_ex(
        self,
        request: nftc_models.QueryNftOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryNftOrderResponse:
        """
        Description: 查询支付结果
        Summary: 查询支付结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryNftOrderResponse(),
            self.do_request('1.0', 'antchain.nftc.nft.order.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_nft_order_ex_async(
        self,
        request: nftc_models.QueryNftOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryNftOrderResponse:
        """
        Description: 查询支付结果
        Summary: 查询支付结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryNftOrderResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.nft.order.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_nft_assetbysku(
        self,
        request: nftc_models.QueryNftAssetbyskuRequest,
    ) -> nftc_models.QueryNftAssetbyskuResponse:
        """
        Description: 根据skuId维度查询藏品
        Summary: 根据skuId维度查询藏品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_nft_assetbysku_ex(request, headers, runtime)

    async def query_nft_assetbysku_async(
        self,
        request: nftc_models.QueryNftAssetbyskuRequest,
    ) -> nftc_models.QueryNftAssetbyskuResponse:
        """
        Description: 根据skuId维度查询藏品
        Summary: 根据skuId维度查询藏品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_nft_assetbysku_ex_async(request, headers, runtime)

    def query_nft_assetbysku_ex(
        self,
        request: nftc_models.QueryNftAssetbyskuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryNftAssetbyskuResponse:
        """
        Description: 根据skuId维度查询藏品
        Summary: 根据skuId维度查询藏品
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryNftAssetbyskuResponse(),
            self.do_request('1.0', 'antchain.nftc.nft.assetbysku.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_nft_assetbysku_ex_async(
        self,
        request: nftc_models.QueryNftAssetbyskuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryNftAssetbyskuResponse:
        """
        Description: 根据skuId维度查询藏品
        Summary: 根据skuId维度查询藏品
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryNftAssetbyskuResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.nft.assetbysku.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_nft_assetbysku(
        self,
        request: nftc_models.CheckNftAssetbyskuRequest,
    ) -> nftc_models.CheckNftAssetbyskuResponse:
        """
        Description: 根据skuId维度校验藏品是否已拥有
        Summary: 根据skuId维度校验藏品是否已拥有
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_nft_assetbysku_ex(request, headers, runtime)

    async def check_nft_assetbysku_async(
        self,
        request: nftc_models.CheckNftAssetbyskuRequest,
    ) -> nftc_models.CheckNftAssetbyskuResponse:
        """
        Description: 根据skuId维度校验藏品是否已拥有
        Summary: 根据skuId维度校验藏品是否已拥有
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_nft_assetbysku_ex_async(request, headers, runtime)

    def check_nft_assetbysku_ex(
        self,
        request: nftc_models.CheckNftAssetbyskuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.CheckNftAssetbyskuResponse:
        """
        Description: 根据skuId维度校验藏品是否已拥有
        Summary: 根据skuId维度校验藏品是否已拥有
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.CheckNftAssetbyskuResponse(),
            self.do_request('1.0', 'antchain.nftc.nft.assetbysku.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_nft_assetbysku_ex_async(
        self,
        request: nftc_models.CheckNftAssetbyskuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.CheckNftAssetbyskuResponse:
        """
        Description: 根据skuId维度校验藏品是否已拥有
        Summary: 根据skuId维度校验藏品是否已拥有
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.CheckNftAssetbyskuResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.nft.assetbysku.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_promo_prize(
        self,
        request: nftc_models.SendPromoPrizeRequest,
    ) -> nftc_models.SendPromoPrizeResponse:
        """
        Description: 支付宝海豚优惠券发放
        Summary: 支付宝海豚优惠券发放
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_promo_prize_ex(request, headers, runtime)

    async def send_promo_prize_async(
        self,
        request: nftc_models.SendPromoPrizeRequest,
    ) -> nftc_models.SendPromoPrizeResponse:
        """
        Description: 支付宝海豚优惠券发放
        Summary: 支付宝海豚优惠券发放
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_promo_prize_ex_async(request, headers, runtime)

    def send_promo_prize_ex(
        self,
        request: nftc_models.SendPromoPrizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.SendPromoPrizeResponse:
        """
        Description: 支付宝海豚优惠券发放
        Summary: 支付宝海豚优惠券发放
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.SendPromoPrizeResponse(),
            self.do_request('1.0', 'antchain.nftc.promo.prize.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_promo_prize_ex_async(
        self,
        request: nftc_models.SendPromoPrizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.SendPromoPrizeResponse:
        """
        Description: 支付宝海豚优惠券发放
        Summary: 支付宝海豚优惠券发放
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.SendPromoPrizeResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.promo.prize.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_resource_generalresource(
        self,
        request: nftc_models.CreateResourceGeneralresourceRequest,
    ) -> nftc_models.CreateResourceGeneralresourceResponse:
        """
        Description: 创建通用资源
        Summary: 创建通用资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_resource_generalresource_ex(request, headers, runtime)

    async def create_resource_generalresource_async(
        self,
        request: nftc_models.CreateResourceGeneralresourceRequest,
    ) -> nftc_models.CreateResourceGeneralresourceResponse:
        """
        Description: 创建通用资源
        Summary: 创建通用资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_resource_generalresource_ex_async(request, headers, runtime)

    def create_resource_generalresource_ex(
        self,
        request: nftc_models.CreateResourceGeneralresourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.CreateResourceGeneralresourceResponse:
        """
        Description: 创建通用资源
        Summary: 创建通用资源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.CreateResourceGeneralresourceResponse(),
            self.do_request('1.0', 'antchain.nftc.resource.generalresource.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_resource_generalresource_ex_async(
        self,
        request: nftc_models.CreateResourceGeneralresourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.CreateResourceGeneralresourceResponse:
        """
        Description: 创建通用资源
        Summary: 创建通用资源
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.CreateResourceGeneralresourceResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.resource.generalresource.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_resource_generalresourcefile(
        self,
        request: nftc_models.BindResourceGeneralresourcefileRequest,
    ) -> nftc_models.BindResourceGeneralresourcefileResponse:
        """
        Description: 绑定文件到通用资源ID
        Summary: 绑定文件到通用资源ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_resource_generalresourcefile_ex(request, headers, runtime)

    async def bind_resource_generalresourcefile_async(
        self,
        request: nftc_models.BindResourceGeneralresourcefileRequest,
    ) -> nftc_models.BindResourceGeneralresourcefileResponse:
        """
        Description: 绑定文件到通用资源ID
        Summary: 绑定文件到通用资源ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_resource_generalresourcefile_ex_async(request, headers, runtime)

    def bind_resource_generalresourcefile_ex(
        self,
        request: nftc_models.BindResourceGeneralresourcefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.BindResourceGeneralresourcefileResponse:
        """
        Description: 绑定文件到通用资源ID
        Summary: 绑定文件到通用资源ID
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.BindResourceGeneralresourcefileResponse(),
            self.do_request('1.0', 'antchain.nftc.resource.generalresourcefile.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_resource_generalresourcefile_ex_async(
        self,
        request: nftc_models.BindResourceGeneralresourcefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.BindResourceGeneralresourcefileResponse:
        """
        Description: 绑定文件到通用资源ID
        Summary: 绑定文件到通用资源ID
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.BindResourceGeneralresourcefileResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.resource.generalresourcefile.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def publish_resource_generalresourcefile(
        self,
        request: nftc_models.PublishResourceGeneralresourcefileRequest,
    ) -> nftc_models.PublishResourceGeneralresourcefileResponse:
        """
        Description: 发布通用资源文件
        Summary: 发布通用资源文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.publish_resource_generalresourcefile_ex(request, headers, runtime)

    async def publish_resource_generalresourcefile_async(
        self,
        request: nftc_models.PublishResourceGeneralresourcefileRequest,
    ) -> nftc_models.PublishResourceGeneralresourcefileResponse:
        """
        Description: 发布通用资源文件
        Summary: 发布通用资源文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.publish_resource_generalresourcefile_ex_async(request, headers, runtime)

    def publish_resource_generalresourcefile_ex(
        self,
        request: nftc_models.PublishResourceGeneralresourcefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.PublishResourceGeneralresourcefileResponse:
        """
        Description: 发布通用资源文件
        Summary: 发布通用资源文件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.PublishResourceGeneralresourcefileResponse(),
            self.do_request('1.0', 'antchain.nftc.resource.generalresourcefile.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def publish_resource_generalresourcefile_ex_async(
        self,
        request: nftc_models.PublishResourceGeneralresourcefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.PublishResourceGeneralresourcefileResponse:
        """
        Description: 发布通用资源文件
        Summary: 发布通用资源文件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.PublishResourceGeneralresourcefileResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.resource.generalresourcefile.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_resource_patchlist(
        self,
        request: nftc_models.QueryResourcePatchlistRequest,
    ) -> nftc_models.QueryResourcePatchlistResponse:
        """
        Description: 查询资源文件差量包列表
        Summary: 查询资源文件差量包列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_resource_patchlist_ex(request, headers, runtime)

    async def query_resource_patchlist_async(
        self,
        request: nftc_models.QueryResourcePatchlistRequest,
    ) -> nftc_models.QueryResourcePatchlistResponse:
        """
        Description: 查询资源文件差量包列表
        Summary: 查询资源文件差量包列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_resource_patchlist_ex_async(request, headers, runtime)

    def query_resource_patchlist_ex(
        self,
        request: nftc_models.QueryResourcePatchlistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryResourcePatchlistResponse:
        """
        Description: 查询资源文件差量包列表
        Summary: 查询资源文件差量包列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryResourcePatchlistResponse(),
            self.do_request('1.0', 'antchain.nftc.resource.patchlist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_resource_patchlist_ex_async(
        self,
        request: nftc_models.QueryResourcePatchlistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.QueryResourcePatchlistResponse:
        """
        Description: 查询资源文件差量包列表
        Summary: 查询资源文件差量包列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.QueryResourcePatchlistResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.resource.patchlist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_resource_filetoken(
        self,
        request: nftc_models.ApplyResourceFiletokenRequest,
    ) -> nftc_models.ApplyResourceFiletokenResponse:
        """
        Description: 资源管理平台-申请文件上传token
        Summary: 资源管理平台-申请文件上传token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_resource_filetoken_ex(request, headers, runtime)

    async def apply_resource_filetoken_async(
        self,
        request: nftc_models.ApplyResourceFiletokenRequest,
    ) -> nftc_models.ApplyResourceFiletokenResponse:
        """
        Description: 资源管理平台-申请文件上传token
        Summary: 资源管理平台-申请文件上传token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_resource_filetoken_ex_async(request, headers, runtime)

    def apply_resource_filetoken_ex(
        self,
        request: nftc_models.ApplyResourceFiletokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.ApplyResourceFiletokenResponse:
        """
        Description: 资源管理平台-申请文件上传token
        Summary: 资源管理平台-申请文件上传token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.ApplyResourceFiletokenResponse(),
            self.do_request('1.0', 'antchain.nftc.resource.filetoken.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_resource_filetoken_ex_async(
        self,
        request: nftc_models.ApplyResourceFiletokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftc_models.ApplyResourceFiletokenResponse:
        """
        Description: 资源管理平台-申请文件上传token
        Summary: 资源管理平台-申请文件上传token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftc_models.ApplyResourceFiletokenResponse(),
            await self.do_request_async('1.0', 'antchain.nftc.resource.filetoken.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
