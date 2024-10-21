# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_sp import models as sp_models
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
        config: sp_models.Config,
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
            # 支出配置单对象结果详情
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
                    'sdk_version': '4.9.0',
                    '_prod_code': 'SP',
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
            # 支出配置单对象结果详情
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
                    'sdk_version': '4.9.0',
                    '_prod_code': 'SP',
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

    def update_ability_chain_account(
        self,
        request: sp_models.UpdateAbilityChainAccountRequest,
    ) -> sp_models.UpdateAbilityChainAccountResponse:
        """
        Description: 更新链上账户余额
        Summary: 更新链上账户余额
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_ability_chain_account_ex(request, headers, runtime)

    async def update_ability_chain_account_async(
        self,
        request: sp_models.UpdateAbilityChainAccountRequest,
    ) -> sp_models.UpdateAbilityChainAccountResponse:
        """
        Description: 更新链上账户余额
        Summary: 更新链上账户余额
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_ability_chain_account_ex_async(request, headers, runtime)

    def update_ability_chain_account_ex(
        self,
        request: sp_models.UpdateAbilityChainAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.UpdateAbilityChainAccountResponse:
        """
        Description: 更新链上账户余额
        Summary: 更新链上账户余额
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.UpdateAbilityChainAccountResponse(),
            self.do_request('1.0', 'antcloudspi.ability.chain.account.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_ability_chain_account_ex_async(
        self,
        request: sp_models.UpdateAbilityChainAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.UpdateAbilityChainAccountResponse:
        """
        Description: 更新链上账户余额
        Summary: 更新链上账户余额
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.UpdateAbilityChainAccountResponse(),
            await self.do_request_async('1.0', 'antcloudspi.ability.chain.account.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_ability_chain_asset(
        self,
        request: sp_models.UpdateAbilityChainAssetRequest,
    ) -> sp_models.UpdateAbilityChainAssetResponse:
        """
        Description: 链上资产核销、确认核销成功
        Summary: 链上资产核销确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_ability_chain_asset_ex(request, headers, runtime)

    async def update_ability_chain_asset_async(
        self,
        request: sp_models.UpdateAbilityChainAssetRequest,
    ) -> sp_models.UpdateAbilityChainAssetResponse:
        """
        Description: 链上资产核销、确认核销成功
        Summary: 链上资产核销确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_ability_chain_asset_ex_async(request, headers, runtime)

    def update_ability_chain_asset_ex(
        self,
        request: sp_models.UpdateAbilityChainAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.UpdateAbilityChainAssetResponse:
        """
        Description: 链上资产核销、确认核销成功
        Summary: 链上资产核销确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.UpdateAbilityChainAssetResponse(),
            self.do_request('1.0', 'antcloudspi.ability.chain.asset.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_ability_chain_asset_ex_async(
        self,
        request: sp_models.UpdateAbilityChainAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.UpdateAbilityChainAssetResponse:
        """
        Description: 链上资产核销、确认核销成功
        Summary: 链上资产核销确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.UpdateAbilityChainAssetResponse(),
            await self.do_request_async('1.0', 'antcloudspi.ability.chain.asset.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def stop_sp_product(
        self,
        request: sp_models.StopSpProductRequest,
    ) -> sp_models.StopSpProductResponse:
        """
        Description: 用户资源到期或欠费情况下会对资源先进行停服操作，用于限制用户使用但不能删除用户数据！不同的产品可以根据自身的功能进行不同的限制。
        停服属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
        注意：如果产品的停服为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
        Summary: SPI-停止服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.stop_sp_product_ex(request, headers, runtime)

    async def stop_sp_product_async(
        self,
        request: sp_models.StopSpProductRequest,
    ) -> sp_models.StopSpProductResponse:
        """
        Description: 用户资源到期或欠费情况下会对资源先进行停服操作，用于限制用户使用但不能删除用户数据！不同的产品可以根据自身的功能进行不同的限制。
        停服属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
        注意：如果产品的停服为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
        Summary: SPI-停止服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.stop_sp_product_ex_async(request, headers, runtime)

    def stop_sp_product_ex(
        self,
        request: sp_models.StopSpProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.StopSpProductResponse:
        """
        Description: 用户资源到期或欠费情况下会对资源先进行停服操作，用于限制用户使用但不能删除用户数据！不同的产品可以根据自身的功能进行不同的限制。
        停服属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
        注意：如果产品的停服为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
        Summary: SPI-停止服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.StopSpProductResponse(),
            self.do_request('1.0', 'antcloudspi.sp.product.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def stop_sp_product_ex_async(
        self,
        request: sp_models.StopSpProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.StopSpProductResponse:
        """
        Description: 用户资源到期或欠费情况下会对资源先进行停服操作，用于限制用户使用但不能删除用户数据！不同的产品可以根据自身的功能进行不同的限制。
        停服属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
        注意：如果产品的停服为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
        Summary: SPI-停止服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.StopSpProductResponse(),
            await self.do_request_async('1.0', 'antcloudspi.sp.product.stop', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def resume_sp_product(
        self,
        request: sp_models.ResumeSpProductRequest,
    ) -> sp_models.ResumeSpProductResponse:
        """
        Description: 用户对欠费或者到期实例进行续费操作后，平台会通知产品解除对用户指定实例的操作限制。即恢复正常服务能力。
        恢复指令同样属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
        注意：如果产品的恢复为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
        Summary: SPI-恢复服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.resume_sp_product_ex(request, headers, runtime)

    async def resume_sp_product_async(
        self,
        request: sp_models.ResumeSpProductRequest,
    ) -> sp_models.ResumeSpProductResponse:
        """
        Description: 用户对欠费或者到期实例进行续费操作后，平台会通知产品解除对用户指定实例的操作限制。即恢复正常服务能力。
        恢复指令同样属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
        注意：如果产品的恢复为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
        Summary: SPI-恢复服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.resume_sp_product_ex_async(request, headers, runtime)

    def resume_sp_product_ex(
        self,
        request: sp_models.ResumeSpProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.ResumeSpProductResponse:
        """
        Description: 用户对欠费或者到期实例进行续费操作后，平台会通知产品解除对用户指定实例的操作限制。即恢复正常服务能力。
        恢复指令同样属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
        注意：如果产品的恢复为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
        Summary: SPI-恢复服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.ResumeSpProductResponse(),
            self.do_request('1.0', 'antcloudspi.sp.product.resume', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def resume_sp_product_ex_async(
        self,
        request: sp_models.ResumeSpProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.ResumeSpProductResponse:
        """
        Description: 用户对欠费或者到期实例进行续费操作后，平台会通知产品解除对用户指定实例的操作限制。即恢复正常服务能力。
        恢复指令同样属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔1分钟持续通知（限制100次）。
        注意：如果产品的恢复为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间10s）。
        Summary: SPI-恢复服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.ResumeSpProductResponse(),
            await self.do_request_async('1.0', 'antcloudspi.sp.product.resume', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def provision_sp_product(
        self,
        request: sp_models.ProvisionSpProductRequest,
    ) -> sp_models.ProvisionSpProductResponse:
        """
        Description: 创建产品实例（带配置）支持相同配置一次创建多个实例（最大10个）。比如：用户购买一个BAAS链，就是创建一个BAAS链实例。
        创建产品会生成产品实例Id，后续变配、释放、停服、恢复服务操作都是通过实例Id作为标识。
        异步接口，也支持通过参数指定同步返回。
        能力产品收到指令后需要自行落库，并记录执行结果。如果是异步行为，则创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI。
        注意：中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
        Summary: SPI-创建产品实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.provision_sp_product_ex(request, headers, runtime)

    async def provision_sp_product_async(
        self,
        request: sp_models.ProvisionSpProductRequest,
    ) -> sp_models.ProvisionSpProductResponse:
        """
        Description: 创建产品实例（带配置）支持相同配置一次创建多个实例（最大10个）。比如：用户购买一个BAAS链，就是创建一个BAAS链实例。
        创建产品会生成产品实例Id，后续变配、释放、停服、恢复服务操作都是通过实例Id作为标识。
        异步接口，也支持通过参数指定同步返回。
        能力产品收到指令后需要自行落库，并记录执行结果。如果是异步行为，则创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI。
        注意：中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
        Summary: SPI-创建产品实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.provision_sp_product_ex_async(request, headers, runtime)

    def provision_sp_product_ex(
        self,
        request: sp_models.ProvisionSpProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.ProvisionSpProductResponse:
        """
        Description: 创建产品实例（带配置）支持相同配置一次创建多个实例（最大10个）。比如：用户购买一个BAAS链，就是创建一个BAAS链实例。
        创建产品会生成产品实例Id，后续变配、释放、停服、恢复服务操作都是通过实例Id作为标识。
        异步接口，也支持通过参数指定同步返回。
        能力产品收到指令后需要自行落库，并记录执行结果。如果是异步行为，则创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI。
        注意：中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
        Summary: SPI-创建产品实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.ProvisionSpProductResponse(),
            self.do_request('1.0', 'antcloudspi.sp.product.provision', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def provision_sp_product_ex_async(
        self,
        request: sp_models.ProvisionSpProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.ProvisionSpProductResponse:
        """
        Description: 创建产品实例（带配置）支持相同配置一次创建多个实例（最大10个）。比如：用户购买一个BAAS链，就是创建一个BAAS链实例。
        创建产品会生成产品实例Id，后续变配、释放、停服、恢复服务操作都是通过实例Id作为标识。
        异步接口，也支持通过参数指定同步返回。
        能力产品收到指令后需要自行落库，并记录执行结果。如果是异步行为，则创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI。
        注意：中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
        Summary: SPI-创建产品实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.ProvisionSpProductResponse(),
            await self.do_request_async('1.0', 'antcloudspi.sp.product.provision', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def modify_sp_product(
        self,
        request: sp_models.ModifySpProductRequest,
    ) -> sp_models.ModifySpProductResponse:
        """
        Description: 对已有的实例进行规格变更操作。
        支持同步、异步返回结果
        1.如果变更过程比较耗时，能力产品收到指令后需要自行落库并记录执行结果。创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI
        2.如果变更过程立即生效，则通过sync=true进行返回
        中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
        Summary: SPI-变更产品实例配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.modify_sp_product_ex(request, headers, runtime)

    async def modify_sp_product_async(
        self,
        request: sp_models.ModifySpProductRequest,
    ) -> sp_models.ModifySpProductResponse:
        """
        Description: 对已有的实例进行规格变更操作。
        支持同步、异步返回结果
        1.如果变更过程比较耗时，能力产品收到指令后需要自行落库并记录执行结果。创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI
        2.如果变更过程立即生效，则通过sync=true进行返回
        中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
        Summary: SPI-变更产品实例配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.modify_sp_product_ex_async(request, headers, runtime)

    def modify_sp_product_ex(
        self,
        request: sp_models.ModifySpProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.ModifySpProductResponse:
        """
        Description: 对已有的实例进行规格变更操作。
        支持同步、异步返回结果
        1.如果变更过程比较耗时，能力产品收到指令后需要自行落库并记录执行结果。创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI
        2.如果变更过程立即生效，则通过sync=true进行返回
        中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
        Summary: SPI-变更产品实例配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.ModifySpProductResponse(),
            self.do_request('1.0', 'antcloudspi.sp.product.modify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def modify_sp_product_ex_async(
        self,
        request: sp_models.ModifySpProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.ModifySpProductResponse:
        """
        Description: 对已有的实例进行规格变更操作。
        支持同步、异步返回结果
        1.如果变更过程比较耗时，能力产品收到指令后需要自行落库并记录执行结果。创建完成后结果通过openAPI通知平台，超时未收到结果平台将主动查询SPI
        2.如果变更过程立即生效，则通过sync=true进行返回
        中台会通知能力产品指定集群，如果同步返回结果失败平台会重试调用（最多3次），需要根据订单号order_no做好幂等判断。
        Summary: SPI-变更产品实例配置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.ModifySpProductResponse(),
            await self.do_request_async('1.0', 'antcloudspi.sp.product.modify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def release_sp_product(
        self,
        request: sp_models.ReleaseSpProductRequest,
    ) -> sp_models.ReleaseSpProductResponse:
        """
        Description: 用户主动删除实例或欠费逾期平台按照约定进行强制删除。
        释放操作属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。产品方应保证快速响应。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔2分钟持续通知（限制100次）
        注意：如果产品的释放为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间5s)
        Summary: SPI-释放产品实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.release_sp_product_ex(request, headers, runtime)

    async def release_sp_product_async(
        self,
        request: sp_models.ReleaseSpProductRequest,
    ) -> sp_models.ReleaseSpProductResponse:
        """
        Description: 用户主动删除实例或欠费逾期平台按照约定进行强制删除。
        释放操作属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。产品方应保证快速响应。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔2分钟持续通知（限制100次）
        注意：如果产品的释放为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间5s)
        Summary: SPI-释放产品实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.release_sp_product_ex_async(request, headers, runtime)

    def release_sp_product_ex(
        self,
        request: sp_models.ReleaseSpProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.ReleaseSpProductResponse:
        """
        Description: 用户主动删除实例或欠费逾期平台按照约定进行强制删除。
        释放操作属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。产品方应保证快速响应。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔2分钟持续通知（限制100次）
        注意：如果产品的释放为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间5s)
        Summary: SPI-释放产品实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.ReleaseSpProductResponse(),
            self.do_request('1.0', 'antcloudspi.sp.product.release', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def release_sp_product_ex_async(
        self,
        request: sp_models.ReleaseSpProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.ReleaseSpProductResponse:
        """
        Description: 用户主动删除实例或欠费逾期平台按照约定进行强制删除。
        释放操作属于通知类指令，即平台只负责通知到产品，不关心产品的业务处理结果。产品方应保证快速响应。因为网络问题或者产品系统的故障导致的消息响应失败，平台会间隔2分钟持续通知（限制100次）
        注意：如果产品的释放为耗时操作，在收到通知后需要自行存储消息异步处理，不能阻塞通知请求导致网络超时（超时时间5s)
        Summary: SPI-释放产品实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.ReleaseSpProductResponse(),
            await self.do_request_async('1.0', 'antcloudspi.sp.product.release', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sp_product_order(
        self,
        request: sp_models.GetSpProductOrderRequest,
    ) -> sp_models.GetSpProductOrderResponse:
        """
        Description: 对于操作型指令（创建、变配）平台用来查询底层对指定订单的生产结果（如果超过规定时间没有主动告知平台结果）。
        注意：平台根据 order_no 查询，需要根据order_no做好结果保存。一般不会查询历史订单执行记录，主要用于在规定的生产时间内，底层因为网络、超时等问题导致没有能够将结果”通知“给平台。在产品上架时允许自定义操作指令的超时时间（默认最大120分钟）。建议可以控制产品生产时间的情况下配置一个合理的超时时间，便于及时定位异常问题，减少用户页面等待时间。如需要配置联系平台。
        接口为同步，最大超时时间5s，失败尝试3次（间隔2s）。
        Summary: SPI-获取产品订单结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sp_product_order_ex(request, headers, runtime)

    async def get_sp_product_order_async(
        self,
        request: sp_models.GetSpProductOrderRequest,
    ) -> sp_models.GetSpProductOrderResponse:
        """
        Description: 对于操作型指令（创建、变配）平台用来查询底层对指定订单的生产结果（如果超过规定时间没有主动告知平台结果）。
        注意：平台根据 order_no 查询，需要根据order_no做好结果保存。一般不会查询历史订单执行记录，主要用于在规定的生产时间内，底层因为网络、超时等问题导致没有能够将结果”通知“给平台。在产品上架时允许自定义操作指令的超时时间（默认最大120分钟）。建议可以控制产品生产时间的情况下配置一个合理的超时时间，便于及时定位异常问题，减少用户页面等待时间。如需要配置联系平台。
        接口为同步，最大超时时间5s，失败尝试3次（间隔2s）。
        Summary: SPI-获取产品订单结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sp_product_order_ex_async(request, headers, runtime)

    def get_sp_product_order_ex(
        self,
        request: sp_models.GetSpProductOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.GetSpProductOrderResponse:
        """
        Description: 对于操作型指令（创建、变配）平台用来查询底层对指定订单的生产结果（如果超过规定时间没有主动告知平台结果）。
        注意：平台根据 order_no 查询，需要根据order_no做好结果保存。一般不会查询历史订单执行记录，主要用于在规定的生产时间内，底层因为网络、超时等问题导致没有能够将结果”通知“给平台。在产品上架时允许自定义操作指令的超时时间（默认最大120分钟）。建议可以控制产品生产时间的情况下配置一个合理的超时时间，便于及时定位异常问题，减少用户页面等待时间。如需要配置联系平台。
        接口为同步，最大超时时间5s，失败尝试3次（间隔2s）。
        Summary: SPI-获取产品订单结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.GetSpProductOrderResponse(),
            self.do_request('1.0', 'antcloudspi.sp.product.order.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sp_product_order_ex_async(
        self,
        request: sp_models.GetSpProductOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.GetSpProductOrderResponse:
        """
        Description: 对于操作型指令（创建、变配）平台用来查询底层对指定订单的生产结果（如果超过规定时间没有主动告知平台结果）。
        注意：平台根据 order_no 查询，需要根据order_no做好结果保存。一般不会查询历史订单执行记录，主要用于在规定的生产时间内，底层因为网络、超时等问题导致没有能够将结果”通知“给平台。在产品上架时允许自定义操作指令的超时时间（默认最大120分钟）。建议可以控制产品生产时间的情况下配置一个合理的超时时间，便于及时定位异常问题，减少用户页面等待时间。如需要配置联系平台。
        接口为同步，最大超时时间5s，失败尝试3次（间隔2s）。
        Summary: SPI-获取产品订单结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.GetSpProductOrderResponse(),
            await self.do_request_async('1.0', 'antcloudspi.sp.product.order.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def load_sp_product_orderparameter(
        self,
        request: sp_models.LoadSpProductOrderparameterRequest,
    ) -> sp_models.LoadSpProductOrderparameterResponse:
        """
        Description: 提供订单系统渲染购买页，从产品方加载部分个性化的展示内容。
        Summary: 从产品方加载购买页参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.load_sp_product_orderparameter_ex(request, headers, runtime)

    async def load_sp_product_orderparameter_async(
        self,
        request: sp_models.LoadSpProductOrderparameterRequest,
    ) -> sp_models.LoadSpProductOrderparameterResponse:
        """
        Description: 提供订单系统渲染购买页，从产品方加载部分个性化的展示内容。
        Summary: 从产品方加载购买页参数
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.load_sp_product_orderparameter_ex_async(request, headers, runtime)

    def load_sp_product_orderparameter_ex(
        self,
        request: sp_models.LoadSpProductOrderparameterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.LoadSpProductOrderparameterResponse:
        """
        Description: 提供订单系统渲染购买页，从产品方加载部分个性化的展示内容。
        Summary: 从产品方加载购买页参数
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.LoadSpProductOrderparameterResponse(),
            self.do_request('1.0', 'antcloudspi.sp.product.orderparameter.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def load_sp_product_orderparameter_ex_async(
        self,
        request: sp_models.LoadSpProductOrderparameterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.LoadSpProductOrderparameterResponse:
        """
        Description: 提供订单系统渲染购买页，从产品方加载部分个性化的展示内容。
        Summary: 从产品方加载购买页参数
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.LoadSpProductOrderparameterResponse(),
            await self.do_request_async('1.0', 'antcloudspi.sp.product.orderparameter.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_industry_trade_result(
        self,
        request: sp_models.SyncIndustryTradeResultRequest,
    ) -> sp_models.SyncIndustryTradeResultResponse:
        """
        Description: 交易结果通知
        Summary: 交易结果通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_industry_trade_result_ex(request, headers, runtime)

    async def sync_industry_trade_result_async(
        self,
        request: sp_models.SyncIndustryTradeResultRequest,
    ) -> sp_models.SyncIndustryTradeResultResponse:
        """
        Description: 交易结果通知
        Summary: 交易结果通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_industry_trade_result_ex_async(request, headers, runtime)

    def sync_industry_trade_result_ex(
        self,
        request: sp_models.SyncIndustryTradeResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.SyncIndustryTradeResultResponse:
        """
        Description: 交易结果通知
        Summary: 交易结果通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.SyncIndustryTradeResultResponse(),
            self.do_request('1.0', 'antcloudspi.industry.trade.result.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_industry_trade_result_ex_async(
        self,
        request: sp_models.SyncIndustryTradeResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.SyncIndustryTradeResultResponse:
        """
        Description: 交易结果通知
        Summary: 交易结果通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.SyncIndustryTradeResultResponse(),
            await self.do_request_async('1.0', 'antcloudspi.industry.trade.result.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_merchant_sign_result(
        self,
        request: sp_models.SyncMerchantSignResultRequest,
    ) -> sp_models.SyncMerchantSignResultResponse:
        """
        Description: 商家注册结果通知
        Summary: 商家注册结果通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_merchant_sign_result_ex(request, headers, runtime)

    async def sync_merchant_sign_result_async(
        self,
        request: sp_models.SyncMerchantSignResultRequest,
    ) -> sp_models.SyncMerchantSignResultResponse:
        """
        Description: 商家注册结果通知
        Summary: 商家注册结果通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_merchant_sign_result_ex_async(request, headers, runtime)

    def sync_merchant_sign_result_ex(
        self,
        request: sp_models.SyncMerchantSignResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.SyncMerchantSignResultResponse:
        """
        Description: 商家注册结果通知
        Summary: 商家注册结果通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.SyncMerchantSignResultResponse(),
            self.do_request('1.0', 'antcloudspi.merchant.sign.result.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_merchant_sign_result_ex_async(
        self,
        request: sp_models.SyncMerchantSignResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.SyncMerchantSignResultResponse:
        """
        Description: 商家注册结果通知
        Summary: 商家注册结果通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.SyncMerchantSignResultResponse(),
            await self.do_request_async('1.0', 'antcloudspi.merchant.sign.result.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_merchant_agreement_result(
        self,
        request: sp_models.SyncMerchantAgreementResultRequest,
    ) -> sp_models.SyncMerchantAgreementResultResponse:
        """
        Description: 签约状态变更通知
        Summary: 签约状态变更通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_merchant_agreement_result_ex(request, headers, runtime)

    async def sync_merchant_agreement_result_async(
        self,
        request: sp_models.SyncMerchantAgreementResultRequest,
    ) -> sp_models.SyncMerchantAgreementResultResponse:
        """
        Description: 签约状态变更通知
        Summary: 签约状态变更通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_merchant_agreement_result_ex_async(request, headers, runtime)

    def sync_merchant_agreement_result_ex(
        self,
        request: sp_models.SyncMerchantAgreementResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.SyncMerchantAgreementResultResponse:
        """
        Description: 签约状态变更通知
        Summary: 签约状态变更通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.SyncMerchantAgreementResultResponse(),
            self.do_request('1.0', 'antcloudspi.merchant.agreement.result.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_merchant_agreement_result_ex_async(
        self,
        request: sp_models.SyncMerchantAgreementResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.SyncMerchantAgreementResultResponse:
        """
        Description: 签约状态变更通知
        Summary: 签约状态变更通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.SyncMerchantAgreementResultResponse(),
            await self.do_request_async('1.0', 'antcloudspi.merchant.agreement.result.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_ccc_ccc(
        self,
        request: sp_models.QueryDemoCccCccRequest,
    ) -> sp_models.QueryDemoCccCccResponse:
        """
        Description: pdf
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_ccc_ccc_ex(request, headers, runtime)

    async def query_demo_ccc_ccc_async(
        self,
        request: sp_models.QueryDemoCccCccRequest,
    ) -> sp_models.QueryDemoCccCccResponse:
        """
        Description: pdf
        Summary: test
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_ccc_ccc_ex_async(request, headers, runtime)

    def query_demo_ccc_ccc_ex(
        self,
        request: sp_models.QueryDemoCccCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.QueryDemoCccCccResponse:
        """
        Description: pdf
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.QueryDemoCccCccResponse(),
            self.do_request('1.0', 'antcloudspi.demo.ccc.ccc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_ccc_ccc_ex_async(
        self,
        request: sp_models.QueryDemoCccCccRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.QueryDemoCccCccResponse:
        """
        Description: pdf
        Summary: test
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.QueryDemoCccCccResponse(),
            await self.do_request_async('1.0', 'antcloudspi.demo.ccc.ccc.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_acpartner_project_result(
        self,
        request: sp_models.SyncAcpartnerProjectResultRequest,
    ) -> sp_models.SyncAcpartnerProjectResultResponse:
        """
        Description: 合作方（伙伴、商家等）项目签约结果通知
        Summary: 合作方（伙伴、商家等）项目签约结果通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_acpartner_project_result_ex(request, headers, runtime)

    async def sync_acpartner_project_result_async(
        self,
        request: sp_models.SyncAcpartnerProjectResultRequest,
    ) -> sp_models.SyncAcpartnerProjectResultResponse:
        """
        Description: 合作方（伙伴、商家等）项目签约结果通知
        Summary: 合作方（伙伴、商家等）项目签约结果通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_acpartner_project_result_ex_async(request, headers, runtime)

    def sync_acpartner_project_result_ex(
        self,
        request: sp_models.SyncAcpartnerProjectResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.SyncAcpartnerProjectResultResponse:
        """
        Description: 合作方（伙伴、商家等）项目签约结果通知
        Summary: 合作方（伙伴、商家等）项目签约结果通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.SyncAcpartnerProjectResultResponse(),
            self.do_request('1.0', 'antcloudspi.acpartner.project.result.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_acpartner_project_result_ex_async(
        self,
        request: sp_models.SyncAcpartnerProjectResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.SyncAcpartnerProjectResultResponse:
        """
        Description: 合作方（伙伴、商家等）项目签约结果通知
        Summary: 合作方（伙伴、商家等）项目签约结果通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.SyncAcpartnerProjectResultResponse(),
            await self.do_request_async('1.0', 'antcloudspi.acpartner.project.result.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_acpartner_settlein_result(
        self,
        request: sp_models.SyncAcpartnerSettleinResultRequest,
    ) -> sp_models.SyncAcpartnerSettleinResultResponse:
        """
        Description: 合作方（伙伴、商家等）入驻结果通知
        Summary: 合作方（伙伴、商家等）入驻结果通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_acpartner_settlein_result_ex(request, headers, runtime)

    async def sync_acpartner_settlein_result_async(
        self,
        request: sp_models.SyncAcpartnerSettleinResultRequest,
    ) -> sp_models.SyncAcpartnerSettleinResultResponse:
        """
        Description: 合作方（伙伴、商家等）入驻结果通知
        Summary: 合作方（伙伴、商家等）入驻结果通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_acpartner_settlein_result_ex_async(request, headers, runtime)

    def sync_acpartner_settlein_result_ex(
        self,
        request: sp_models.SyncAcpartnerSettleinResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.SyncAcpartnerSettleinResultResponse:
        """
        Description: 合作方（伙伴、商家等）入驻结果通知
        Summary: 合作方（伙伴、商家等）入驻结果通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.SyncAcpartnerSettleinResultResponse(),
            self.do_request('1.0', 'antcloudspi.acpartner.settlein.result.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_acpartner_settlein_result_ex_async(
        self,
        request: sp_models.SyncAcpartnerSettleinResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.SyncAcpartnerSettleinResultResponse:
        """
        Description: 合作方（伙伴、商家等）入驻结果通知
        Summary: 合作方（伙伴、商家等）入驻结果通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.SyncAcpartnerSettleinResultResponse(),
            await self.do_request_async('1.0', 'antcloudspi.acpartner.settlein.result.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_trade_fulfill_result(
        self,
        request: sp_models.SyncTradeFulfillResultRequest,
    ) -> sp_models.SyncTradeFulfillResultResponse:
        """
        Description: 交易平台履约结果通知
        Summary: 交易平台履约结果通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_trade_fulfill_result_ex(request, headers, runtime)

    async def sync_trade_fulfill_result_async(
        self,
        request: sp_models.SyncTradeFulfillResultRequest,
    ) -> sp_models.SyncTradeFulfillResultResponse:
        """
        Description: 交易平台履约结果通知
        Summary: 交易平台履约结果通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_trade_fulfill_result_ex_async(request, headers, runtime)

    def sync_trade_fulfill_result_ex(
        self,
        request: sp_models.SyncTradeFulfillResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.SyncTradeFulfillResultResponse:
        """
        Description: 交易平台履约结果通知
        Summary: 交易平台履约结果通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.SyncTradeFulfillResultResponse(),
            self.do_request('1.0', 'antcloudspi.trade.fulfill.result.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_trade_fulfill_result_ex_async(
        self,
        request: sp_models.SyncTradeFulfillResultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.SyncTradeFulfillResultResponse:
        """
        Description: 交易平台履约结果通知
        Summary: 交易平台履约结果通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.SyncTradeFulfillResultResponse(),
            await self.do_request_async('1.0', 'antcloudspi.trade.fulfill.result.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_pcc_commodity_status(
        self,
        request: sp_models.SyncPccCommodityStatusRequest,
    ) -> sp_models.SyncPccCommodityStatusResponse:
        """
        Description: 目前仅通知商品上架状态变更事件
        Summary: 商品状态变更通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_pcc_commodity_status_ex(request, headers, runtime)

    async def sync_pcc_commodity_status_async(
        self,
        request: sp_models.SyncPccCommodityStatusRequest,
    ) -> sp_models.SyncPccCommodityStatusResponse:
        """
        Description: 目前仅通知商品上架状态变更事件
        Summary: 商品状态变更通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_pcc_commodity_status_ex_async(request, headers, runtime)

    def sync_pcc_commodity_status_ex(
        self,
        request: sp_models.SyncPccCommodityStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.SyncPccCommodityStatusResponse:
        """
        Description: 目前仅通知商品上架状态变更事件
        Summary: 商品状态变更通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.SyncPccCommodityStatusResponse(),
            self.do_request('1.0', 'antcloudspi.pcc.commodity.status.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_pcc_commodity_status_ex_async(
        self,
        request: sp_models.SyncPccCommodityStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.SyncPccCommodityStatusResponse:
        """
        Description: 目前仅通知商品上架状态变更事件
        Summary: 商品状态变更通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.SyncPccCommodityStatusResponse(),
            await self.do_request_async('1.0', 'antcloudspi.pcc.commodity.status.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_demo_echo(
        self,
        request: sp_models.QueryDemoEchoRequest,
    ) -> sp_models.QueryDemoEchoResponse:
        """
        Description: spi测试
        Summary: spi测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_demo_echo_ex(request, headers, runtime)

    async def query_demo_echo_async(
        self,
        request: sp_models.QueryDemoEchoRequest,
    ) -> sp_models.QueryDemoEchoResponse:
        """
        Description: spi测试
        Summary: spi测试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_demo_echo_ex_async(request, headers, runtime)

    def query_demo_echo_ex(
        self,
        request: sp_models.QueryDemoEchoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.QueryDemoEchoResponse:
        """
        Description: spi测试
        Summary: spi测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.QueryDemoEchoResponse(),
            self.do_request('1.0', 'antcloudspi.demo.echo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_demo_echo_ex_async(
        self,
        request: sp_models.QueryDemoEchoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.QueryDemoEchoResponse:
        """
        Description: spi测试
        Summary: spi测试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.QueryDemoEchoResponse(),
            await self.do_request_async('1.0', 'antcloudspi.demo.echo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sp_product_logicinstance(
        self,
        request: sp_models.CreateSpProductLogicinstanceRequest,
    ) -> sp_models.CreateSpProductLogicinstanceResponse:
        """
        Description: 逻辑实例创建成功后回调
        Summary: 逻辑实例创建成功后回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sp_product_logicinstance_ex(request, headers, runtime)

    async def create_sp_product_logicinstance_async(
        self,
        request: sp_models.CreateSpProductLogicinstanceRequest,
    ) -> sp_models.CreateSpProductLogicinstanceResponse:
        """
        Description: 逻辑实例创建成功后回调
        Summary: 逻辑实例创建成功后回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sp_product_logicinstance_ex_async(request, headers, runtime)

    def create_sp_product_logicinstance_ex(
        self,
        request: sp_models.CreateSpProductLogicinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.CreateSpProductLogicinstanceResponse:
        """
        Description: 逻辑实例创建成功后回调
        Summary: 逻辑实例创建成功后回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.CreateSpProductLogicinstanceResponse(),
            self.do_request('1.0', 'antcloudspi.sp.product.logicinstance.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sp_product_logicinstance_ex_async(
        self,
        request: sp_models.CreateSpProductLogicinstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.CreateSpProductLogicinstanceResponse:
        """
        Description: 逻辑实例创建成功后回调
        Summary: 逻辑实例创建成功后回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.CreateSpProductLogicinstanceResponse(),
            await self.do_request_async('1.0', 'antcloudspi.sp.product.logicinstance.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def renew_sp_product(
        self,
        request: sp_models.RenewSpProductRequest,
    ) -> sp_models.RenewSpProductResponse:
        """
        Description: 商品实例续费，支持已经创建的商品，延长生效时间
        Summary: SPI-商品实例续费
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.renew_sp_product_ex(request, headers, runtime)

    async def renew_sp_product_async(
        self,
        request: sp_models.RenewSpProductRequest,
    ) -> sp_models.RenewSpProductResponse:
        """
        Description: 商品实例续费，支持已经创建的商品，延长生效时间
        Summary: SPI-商品实例续费
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.renew_sp_product_ex_async(request, headers, runtime)

    def renew_sp_product_ex(
        self,
        request: sp_models.RenewSpProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.RenewSpProductResponse:
        """
        Description: 商品实例续费，支持已经创建的商品，延长生效时间
        Summary: SPI-商品实例续费
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.RenewSpProductResponse(),
            self.do_request('1.0', 'antcloudspi.sp.product.renew', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def renew_sp_product_ex_async(
        self,
        request: sp_models.RenewSpProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.RenewSpProductResponse:
        """
        Description: 商品实例续费，支持已经创建的商品，延长生效时间
        Summary: SPI-商品实例续费
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.RenewSpProductResponse(),
            await self.do_request_async('1.0', 'antcloudspi.sp.product.renew', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_sp_product_orderparameter(
        self,
        request: sp_models.CheckSpProductOrderparameterRequest,
    ) -> sp_models.CheckSpProductOrderparameterResponse:
        """
        Description: 官网下单购买页面，用户输入的数据，提供给产品方校验是否符合要求
        Summary: 购买页参数传递给产品方校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_sp_product_orderparameter_ex(request, headers, runtime)

    async def check_sp_product_orderparameter_async(
        self,
        request: sp_models.CheckSpProductOrderparameterRequest,
    ) -> sp_models.CheckSpProductOrderparameterResponse:
        """
        Description: 官网下单购买页面，用户输入的数据，提供给产品方校验是否符合要求
        Summary: 购买页参数传递给产品方校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_sp_product_orderparameter_ex_async(request, headers, runtime)

    def check_sp_product_orderparameter_ex(
        self,
        request: sp_models.CheckSpProductOrderparameterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.CheckSpProductOrderparameterResponse:
        """
        Description: 官网下单购买页面，用户输入的数据，提供给产品方校验是否符合要求
        Summary: 购买页参数传递给产品方校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.CheckSpProductOrderparameterResponse(),
            self.do_request('1.0', 'antcloudspi.sp.product.orderparameter.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_sp_product_orderparameter_ex_async(
        self,
        request: sp_models.CheckSpProductOrderparameterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.CheckSpProductOrderparameterResponse:
        """
        Description: 官网下单购买页面，用户输入的数据，提供给产品方校验是否符合要求
        Summary: 购买页参数传递给产品方校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.CheckSpProductOrderparameterResponse(),
            await self.do_request_async('1.0', 'antcloudspi.sp.product.orderparameter.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def preopen_sp_product(
        self,
        request: sp_models.PreopenSpProductRequest,
    ) -> sp_models.PreopenSpProductResponse:
        """
        Description: 开通前通知
        Summary: 开通前通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.preopen_sp_product_ex(request, headers, runtime)

    async def preopen_sp_product_async(
        self,
        request: sp_models.PreopenSpProductRequest,
    ) -> sp_models.PreopenSpProductResponse:
        """
        Description: 开通前通知
        Summary: 开通前通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.preopen_sp_product_ex_async(request, headers, runtime)

    def preopen_sp_product_ex(
        self,
        request: sp_models.PreopenSpProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.PreopenSpProductResponse:
        """
        Description: 开通前通知
        Summary: 开通前通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.PreopenSpProductResponse(),
            self.do_request('1.0', 'antcloudspi.sp.product.preopen', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def preopen_sp_product_ex_async(
        self,
        request: sp_models.PreopenSpProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.PreopenSpProductResponse:
        """
        Description: 开通前通知
        Summary: 开通前通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.PreopenSpProductResponse(),
            await self.do_request_async('1.0', 'antcloudspi.sp.product.preopen', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def open_sp_product(
        self,
        request: sp_models.OpenSpProductRequest,
    ) -> sp_models.OpenSpProductResponse:
        """
        Description: 产品开通指令。即租户开通了指定产品（比如：开通实人认证）。对于能力产品可能需要初始化操作。
        开通会生成产品实例ID，作为后续生命周期SPI管理资源的标识。用户开通一个产品会生成一个产品实例ID，如果后面欠费释放后再次开通会生成新的产品实例ID。
        目前开通只支持同步操作（目前超时最大5s），对于操作需要进行内部初始化的场景暂不支持。
        注意：开通操作中台会通知能力产品所有集群，如果其中一个集群失败，用户可以重试开通-触发中台重复通知（集群）。需要根据订单号order_no做好幂等判断。
        Summary: SPI-开通产品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.open_sp_product_ex(request, headers, runtime)

    async def open_sp_product_async(
        self,
        request: sp_models.OpenSpProductRequest,
    ) -> sp_models.OpenSpProductResponse:
        """
        Description: 产品开通指令。即租户开通了指定产品（比如：开通实人认证）。对于能力产品可能需要初始化操作。
        开通会生成产品实例ID，作为后续生命周期SPI管理资源的标识。用户开通一个产品会生成一个产品实例ID，如果后面欠费释放后再次开通会生成新的产品实例ID。
        目前开通只支持同步操作（目前超时最大5s），对于操作需要进行内部初始化的场景暂不支持。
        注意：开通操作中台会通知能力产品所有集群，如果其中一个集群失败，用户可以重试开通-触发中台重复通知（集群）。需要根据订单号order_no做好幂等判断。
        Summary: SPI-开通产品
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.open_sp_product_ex_async(request, headers, runtime)

    def open_sp_product_ex(
        self,
        request: sp_models.OpenSpProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.OpenSpProductResponse:
        """
        Description: 产品开通指令。即租户开通了指定产品（比如：开通实人认证）。对于能力产品可能需要初始化操作。
        开通会生成产品实例ID，作为后续生命周期SPI管理资源的标识。用户开通一个产品会生成一个产品实例ID，如果后面欠费释放后再次开通会生成新的产品实例ID。
        目前开通只支持同步操作（目前超时最大5s），对于操作需要进行内部初始化的场景暂不支持。
        注意：开通操作中台会通知能力产品所有集群，如果其中一个集群失败，用户可以重试开通-触发中台重复通知（集群）。需要根据订单号order_no做好幂等判断。
        Summary: SPI-开通产品
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.OpenSpProductResponse(),
            self.do_request('1.0', 'antcloudspi.sp.product.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def open_sp_product_ex_async(
        self,
        request: sp_models.OpenSpProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> sp_models.OpenSpProductResponse:
        """
        Description: 产品开通指令。即租户开通了指定产品（比如：开通实人认证）。对于能力产品可能需要初始化操作。
        开通会生成产品实例ID，作为后续生命周期SPI管理资源的标识。用户开通一个产品会生成一个产品实例ID，如果后面欠费释放后再次开通会生成新的产品实例ID。
        目前开通只支持同步操作（目前超时最大5s），对于操作需要进行内部初始化的场景暂不支持。
        注意：开通操作中台会通知能力产品所有集群，如果其中一个集群失败，用户可以重试开通-触发中台重复通知（集群）。需要根据订单号order_no做好幂等判断。
        Summary: SPI-开通产品
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            sp_models.OpenSpProductResponse(),
            await self.do_request_async('1.0', 'antcloudspi.sp.product.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
