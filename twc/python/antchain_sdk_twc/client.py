# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_twc import models as twc_models
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
        config: twc_models.Config,
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
            # 订单商品信息
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
                    'sdk_version': '1.5.13'
                }
                if not UtilClient.empty(self._security_token):
                    _request.query['security_token'] = self._security_token
                _request.headers = TeaCore.merge({
                    'host': UtilClient.default_string(self._endpoint, 'twc-openapi.antchain.antgroup.com'),
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
            # 订单商品信息
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
                    'sdk_version': '1.5.13'
                }
                if not UtilClient.empty(self._security_token):
                    _request.query['security_token'] = self._security_token
                _request.headers = TeaCore.merge({
                    'host': UtilClient.default_string(self._endpoint, 'twc-openapi.antchain.antgroup.com'),
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

    def callback_arbitration_status(
        self,
        request: twc_models.CallbackArbitrationStatusRequest,
    ) -> twc_models.CallbackArbitrationStatusResponse:
        """
        Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
        Summary: 仲裁状态信息变更回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_arbitration_status_ex(request, headers, runtime)

    async def callback_arbitration_status_async(
        self,
        request: twc_models.CallbackArbitrationStatusRequest,
    ) -> twc_models.CallbackArbitrationStatusResponse:
        """
        Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
        Summary: 仲裁状态信息变更回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_arbitration_status_ex_async(request, headers, runtime)

    def callback_arbitration_status_ex(
        self,
        request: twc_models.CallbackArbitrationStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CallbackArbitrationStatusResponse:
        """
        Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
        Summary: 仲裁状态信息变更回调接口
        """
        UtilClient.validate_model(request)
        return twc_models.CallbackArbitrationStatusResponse().from_map(
            self.do_request('1.0', 'twc.notary.arbitration.status.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_arbitration_status_ex_async(
        self,
        request: twc_models.CallbackArbitrationStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CallbackArbitrationStatusResponse:
        """
        Description: 提供给第三方仲裁isv的仲裁申请状态变化回调接口
        Summary: 仲裁状态信息变更回调接口
        """
        UtilClient.validate_model(request)
        return twc_models.CallbackArbitrationStatusResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.arbitration.status.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_account(
        self,
        request: twc_models.CreateContractAccountRequest,
    ) -> twc_models.CreateContractAccountResponse:
        """
        Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
        Summary: 创建电子合同签署个人帐户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_account_ex(request, headers, runtime)

    async def create_contract_account_async(
        self,
        request: twc_models.CreateContractAccountRequest,
    ) -> twc_models.CreateContractAccountResponse:
        """
        Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
        Summary: 创建电子合同签署个人帐户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_account_ex_async(request, headers, runtime)

    def create_contract_account_ex(
        self,
        request: twc_models.CreateContractAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractAccountResponse:
        """
        Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
        Summary: 创建电子合同签署个人帐户
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractAccountResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.account.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_account_ex_async(
        self,
        request: twc_models.CreateContractAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractAccountResponse:
        """
        Description: 调用本接口创建个人账号，后续有关该用户的所有操作都需使用该用户的accountId。如提供用户证件信息，则将根据提供的用户证件信息申请数字证书。
        Summary: 创建电子合同签署个人帐户
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractAccountResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.account.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_accountseal(
        self,
        request: twc_models.CreateContractAccountsealRequest,
    ) -> twc_models.CreateContractAccountsealResponse:
        """
        Description: 通过模版参数，创建个人印章
        Summary: 创建电子合同个人帐户印章
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_accountseal_ex(request, headers, runtime)

    async def create_contract_accountseal_async(
        self,
        request: twc_models.CreateContractAccountsealRequest,
    ) -> twc_models.CreateContractAccountsealResponse:
        """
        Description: 通过模版参数，创建个人印章
        Summary: 创建电子合同个人帐户印章
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_accountseal_ex_async(request, headers, runtime)

    def create_contract_accountseal_ex(
        self,
        request: twc_models.CreateContractAccountsealRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractAccountsealResponse:
        """
        Description: 通过模版参数，创建个人印章
        Summary: 创建电子合同个人帐户印章
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractAccountsealResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.accountseal.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_accountseal_ex_async(
        self,
        request: twc_models.CreateContractAccountsealRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractAccountsealResponse:
        """
        Description: 通过模版参数，创建个人印章
        Summary: 创建电子合同个人帐户印章
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractAccountsealResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.accountseal.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_organization(
        self,
        request: twc_models.CreateContractOrganizationRequest,
    ) -> twc_models.CreateContractOrganizationResponse:
        """
        Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
        创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
        Summary: 创建电子合同签署机构帐户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_organization_ex(request, headers, runtime)

    async def create_contract_organization_async(
        self,
        request: twc_models.CreateContractOrganizationRequest,
    ) -> twc_models.CreateContractOrganizationResponse:
        """
        Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
        创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
        Summary: 创建电子合同签署机构帐户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_organization_ex_async(request, headers, runtime)

    def create_contract_organization_ex(
        self,
        request: twc_models.CreateContractOrganizationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractOrganizationResponse:
        """
        Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
        创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
        Summary: 创建电子合同签署机构帐户
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractOrganizationResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.organization.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_organization_ex_async(
        self,
        request: twc_models.CreateContractOrganizationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractOrganizationResponse:
        """
        Description: 对接方调用本接口创建机构账号，后续有关该机构的所有操作都需使用该机构的orgId。如提供机构证件信息，则将根据提供的机构证件信息申请数字证书。
        创建机构账号前需要先创建一个个人账号并通过本接口传给服务器，该个人账号将作为该机构签署的经办人，代表企业完成实名认证和意愿认证，并完成签署操作。
        Summary: 创建电子合同签署机构帐户
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractOrganizationResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.organization.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_orgseal(
        self,
        request: twc_models.CreateContractOrgsealRequest,
    ) -> twc_models.CreateContractOrgsealResponse:
        """
        Description: 通过模版参数，创建机构印章
        Summary: 创建电子合同机构帐户印章
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_orgseal_ex(request, headers, runtime)

    async def create_contract_orgseal_async(
        self,
        request: twc_models.CreateContractOrgsealRequest,
    ) -> twc_models.CreateContractOrgsealResponse:
        """
        Description: 通过模版参数，创建机构印章
        Summary: 创建电子合同机构帐户印章
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_orgseal_ex_async(request, headers, runtime)

    def create_contract_orgseal_ex(
        self,
        request: twc_models.CreateContractOrgsealRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractOrgsealResponse:
        """
        Description: 通过模版参数，创建机构印章
        Summary: 创建电子合同机构帐户印章
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractOrgsealResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.orgseal.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_orgseal_ex_async(
        self,
        request: twc_models.CreateContractOrgsealRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractOrgsealResponse:
        """
        Description: 通过模版参数，创建机构印章
        Summary: 创建电子合同机构帐户印章
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractOrgsealResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.orgseal.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_contract_sign(
        self,
        request: twc_models.AuthContractSignRequest,
    ) -> twc_models.AuthContractSignResponse:
        """
        Description: 静默签署授权
        Summary: 静默签署授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_contract_sign_ex(request, headers, runtime)

    async def auth_contract_sign_async(
        self,
        request: twc_models.AuthContractSignRequest,
    ) -> twc_models.AuthContractSignResponse:
        """
        Description: 静默签署授权
        Summary: 静默签署授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_contract_sign_ex_async(request, headers, runtime)

    def auth_contract_sign_ex(
        self,
        request: twc_models.AuthContractSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.AuthContractSignResponse:
        """
        Description: 静默签署授权
        Summary: 静默签署授权
        """
        UtilClient.validate_model(request)
        return twc_models.AuthContractSignResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.sign.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_contract_sign_ex_async(
        self,
        request: twc_models.AuthContractSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.AuthContractSignResponse:
        """
        Description: 静默签署授权
        Summary: 静默签署授权
        """
        UtilClient.validate_model(request)
        return twc_models.AuthContractSignResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.sign.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_template(
        self,
        request: twc_models.CreateContractTemplateRequest,
    ) -> twc_models.CreateContractTemplateResponse:
        """
        Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
        Summary: 通过文件上传方式创建电子合同签署模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_template_ex(request, headers, runtime)

    async def create_contract_template_async(
        self,
        request: twc_models.CreateContractTemplateRequest,
    ) -> twc_models.CreateContractTemplateResponse:
        """
        Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
        Summary: 通过文件上传方式创建电子合同签署模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_template_ex_async(request, headers, runtime)

    def create_contract_template_ex(
        self,
        request: twc_models.CreateContractTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractTemplateResponse:
        """
        Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
        Summary: 通过文件上传方式创建电子合同签署模板
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractTemplateResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_template_ex_async(
        self,
        request: twc_models.CreateContractTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractTemplateResponse:
        """
        Description: 通过文件直传地址创建模板，创建模板后上传文件，上传方法请参考文件流上传方法
        Summary: 通过文件上传方式创建电子合同签署模板
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractTemplateResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_flow(
        self,
        request: twc_models.CreateContractFlowRequest,
    ) -> twc_models.CreateContractFlowResponse:
        """
        Description: 创建签署流程
        Summary: 创建电子合同签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_flow_ex(request, headers, runtime)

    async def create_contract_flow_async(
        self,
        request: twc_models.CreateContractFlowRequest,
    ) -> twc_models.CreateContractFlowResponse:
        """
        Description: 创建签署流程
        Summary: 创建电子合同签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_flow_ex_async(request, headers, runtime)

    def create_contract_flow_ex(
        self,
        request: twc_models.CreateContractFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractFlowResponse:
        """
        Description: 创建签署流程
        Summary: 创建电子合同签署流程
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractFlowResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.flow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_flow_ex_async(
        self,
        request: twc_models.CreateContractFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractFlowResponse:
        """
        Description: 创建签署流程
        Summary: 创建电子合同签署流程
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractFlowResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.flow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_contract_document(
        self,
        request: twc_models.AddContractDocumentRequest,
    ) -> twc_models.AddContractDocumentResponse:
        """
        Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
        Summary: 向电子合同签署流程中添加待签署文档
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_contract_document_ex(request, headers, runtime)

    async def add_contract_document_async(
        self,
        request: twc_models.AddContractDocumentRequest,
    ) -> twc_models.AddContractDocumentResponse:
        """
        Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
        Summary: 向电子合同签署流程中添加待签署文档
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_contract_document_ex_async(request, headers, runtime)

    def add_contract_document_ex(
        self,
        request: twc_models.AddContractDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.AddContractDocumentResponse:
        """
        Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
        Summary: 向电子合同签署流程中添加待签署文档
        """
        UtilClient.validate_model(request)
        return twc_models.AddContractDocumentResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.document.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_contract_document_ex_async(
        self,
        request: twc_models.AddContractDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.AddContractDocumentResponse:
        """
        Description: 向流程中添加待签署文档，文档必须先用文档管理接口创建，创建方式请参见文件管理接口文档。已经开启的流程不能再添加签署文档。
        Summary: 向电子合同签署流程中添加待签署文档
        """
        UtilClient.validate_model(request)
        return twc_models.AddContractDocumentResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.document.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_contract_signfield(
        self,
        request: twc_models.AddContractSignfieldRequest,
    ) -> twc_models.AddContractSignfieldResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
        Summary: 添加电子合同签署方自动盖章签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_contract_signfield_ex(request, headers, runtime)

    async def add_contract_signfield_async(
        self,
        request: twc_models.AddContractSignfieldRequest,
    ) -> twc_models.AddContractSignfieldResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
        Summary: 添加电子合同签署方自动盖章签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_contract_signfield_ex_async(request, headers, runtime)

    def add_contract_signfield_ex(
        self,
        request: twc_models.AddContractSignfieldRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.AddContractSignfieldResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
        Summary: 添加电子合同签署方自动盖章签署区
        """
        UtilClient.validate_model(request)
        return twc_models.AddContractSignfieldResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.signfield.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_contract_signfield_ex_async(
        self,
        request: twc_models.AddContractSignfieldRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.AddContractSignfieldResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署人、签署文档信息。 签署区创建完成，流程开启后，系统将自动完成“用户自动盖章签署区”的盖章。用户可全程无感完成本次签署。创建签署方自动盖章签署区前，需确定已完成账号静默签署授权。签署方自动盖章的合同，需要由对接平台方自行校验真实身份和真实意愿
        Summary: 添加电子合同签署方自动盖章签署区
        """
        UtilClient.validate_model(request)
        return twc_models.AddContractSignfieldResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.signfield.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_contract_flow(
        self,
        request: twc_models.StartContractFlowRequest,
    ) -> twc_models.StartContractFlowResponse:
        """
        Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
        Summary: 电子合同签署流程开启
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_contract_flow_ex(request, headers, runtime)

    async def start_contract_flow_async(
        self,
        request: twc_models.StartContractFlowRequest,
    ) -> twc_models.StartContractFlowResponse:
        """
        Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
        Summary: 电子合同签署流程开启
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_contract_flow_ex_async(request, headers, runtime)

    def start_contract_flow_ex(
        self,
        request: twc_models.StartContractFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.StartContractFlowResponse:
        """
        Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
        Summary: 电子合同签署流程开启
        """
        UtilClient.validate_model(request)
        return twc_models.StartContractFlowResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.flow.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_contract_flow_ex_async(
        self,
        request: twc_models.StartContractFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.StartContractFlowResponse:
        """
        Description: 开启签署流程，开启后流程文档不可再添加或修改文档，签署任务会自动按照设置开始流转。流程开启后，归档前，可随时追加签署区（指定签署人的签署信息）
        Summary: 电子合同签署流程开启
        """
        UtilClient.validate_model(request)
        return twc_models.StartContractFlowResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.flow.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_contract_flow(
        self,
        request: twc_models.SaveContractFlowRequest,
    ) -> twc_models.SaveContractFlowResponse:
        """
        Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
        Summary: 电子合同签署流程归档
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_contract_flow_ex(request, headers, runtime)

    async def save_contract_flow_async(
        self,
        request: twc_models.SaveContractFlowRequest,
    ) -> twc_models.SaveContractFlowResponse:
        """
        Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
        Summary: 电子合同签署流程归档
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_contract_flow_ex_async(request, headers, runtime)

    def save_contract_flow_ex(
        self,
        request: twc_models.SaveContractFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SaveContractFlowResponse:
        """
        Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
        Summary: 电子合同签署流程归档
        """
        UtilClient.validate_model(request)
        return twc_models.SaveContractFlowResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.flow.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_contract_flow_ex_async(
        self,
        request: twc_models.SaveContractFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SaveContractFlowResponse:
        """
        Description: 手动归档签署流程，归档后所有资源均不可修改。归档前签署流程中的所有签署人必须都签署完成。如创建流程时设置了自动归档，则无需调用本接口，签署完成后系统会自动调用
        Summary: 电子合同签署流程归档
        """
        UtilClient.validate_model(request)
        return twc_models.SaveContractFlowResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.flow.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def download_contract_document(
        self,
        request: twc_models.DownloadContractDocumentRequest,
    ) -> twc_models.DownloadContractDocumentResponse:
        """
        Description: 流程归档后，查询和下载签署后的文件
        Summary: 电子合同流程文档下载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.download_contract_document_ex(request, headers, runtime)

    async def download_contract_document_async(
        self,
        request: twc_models.DownloadContractDocumentRequest,
    ) -> twc_models.DownloadContractDocumentResponse:
        """
        Description: 流程归档后，查询和下载签署后的文件
        Summary: 电子合同流程文档下载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.download_contract_document_ex_async(request, headers, runtime)

    def download_contract_document_ex(
        self,
        request: twc_models.DownloadContractDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DownloadContractDocumentResponse:
        """
        Description: 流程归档后，查询和下载签署后的文件
        Summary: 电子合同流程文档下载
        """
        UtilClient.validate_model(request)
        return twc_models.DownloadContractDocumentResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.document.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def download_contract_document_ex_async(
        self,
        request: twc_models.DownloadContractDocumentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DownloadContractDocumentResponse:
        """
        Description: 流程归档后，查询和下载签署后的文件
        Summary: 电子合同流程文档下载
        """
        UtilClient.validate_model(request)
        return twc_models.DownloadContractDocumentResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.document.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_contract_file(
        self,
        request: twc_models.AddContractFileRequest,
    ) -> twc_models.AddContractFileResponse:
        """
        Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
        Summary: 通过电子合同模板添加文档
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_contract_file_ex(request, headers, runtime)

    async def add_contract_file_async(
        self,
        request: twc_models.AddContractFileRequest,
    ) -> twc_models.AddContractFileResponse:
        """
        Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
        Summary: 通过电子合同模板添加文档
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_contract_file_ex_async(request, headers, runtime)

    def add_contract_file_ex(
        self,
        request: twc_models.AddContractFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.AddContractFileResponse:
        """
        Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
        Summary: 通过电子合同模板添加文档
        """
        UtilClient.validate_model(request)
        return twc_models.AddContractFileResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.file.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_contract_file_ex_async(
        self,
        request: twc_models.AddContractFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.AddContractFileResponse:
        """
        Description: 基于文件模板生成待签文件用于后续文件，该文件可用用于签署，也可作为附件
        Summary: 通过电子合同模板添加文档
        """
        UtilClient.validate_model(request)
        return twc_models.AddContractFileResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.file.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_platform(
        self,
        request: twc_models.CreateContractPlatformRequest,
    ) -> twc_models.CreateContractPlatformResponse:
        """
        Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
        Summary: 电子合同平台方注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_platform_ex(request, headers, runtime)

    async def create_contract_platform_async(
        self,
        request: twc_models.CreateContractPlatformRequest,
    ) -> twc_models.CreateContractPlatformResponse:
        """
        Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
        Summary: 电子合同平台方注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_platform_ex_async(request, headers, runtime)

    def create_contract_platform_ex(
        self,
        request: twc_models.CreateContractPlatformRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractPlatformResponse:
        """
        Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
        Summary: 电子合同平台方注册
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractPlatformResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.platform.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_platform_ex_async(
        self,
        request: twc_models.CreateContractPlatformRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractPlatformResponse:
        """
        Description: 电子合同平台方发起注册，提供企业信息、合同签署的经办人信息，注册成为电子合同平台方用户
        Summary: 电子合同平台方注册
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractPlatformResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.platform.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_user(
        self,
        request: twc_models.CreateContractUserRequest,
    ) -> twc_models.CreateContractUserResponse:
        """
        Description: 电子合同平台方提供用户信息，注册成为平台用户
        Summary: 电子合同平台方的用户注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_user_ex(request, headers, runtime)

    async def create_contract_user_async(
        self,
        request: twc_models.CreateContractUserRequest,
    ) -> twc_models.CreateContractUserResponse:
        """
        Description: 电子合同平台方提供用户信息，注册成为平台用户
        Summary: 电子合同平台方的用户注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_user_ex_async(request, headers, runtime)

    def create_contract_user_ex(
        self,
        request: twc_models.CreateContractUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractUserResponse:
        """
        Description: 电子合同平台方提供用户信息，注册成为平台用户
        Summary: 电子合同平台方的用户注册
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractUserResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.user.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_user_ex_async(
        self,
        request: twc_models.CreateContractUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractUserResponse:
        """
        Description: 电子合同平台方提供用户信息，注册成为平台用户
        Summary: 电子合同平台方的用户注册
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractUserResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.user.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_contract_handsign(
        self,
        request: twc_models.StartContractHandsignRequest,
    ) -> twc_models.StartContractHandsignResponse:
        """
        Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
        Summary: 电子合同平台方发起手动签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_contract_handsign_ex(request, headers, runtime)

    async def start_contract_handsign_async(
        self,
        request: twc_models.StartContractHandsignRequest,
    ) -> twc_models.StartContractHandsignResponse:
        """
        Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
        Summary: 电子合同平台方发起手动签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_contract_handsign_ex_async(request, headers, runtime)

    def start_contract_handsign_ex(
        self,
        request: twc_models.StartContractHandsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.StartContractHandsignResponse:
        """
        Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
        Summary: 电子合同平台方发起手动签署流程
        """
        UtilClient.validate_model(request)
        return twc_models.StartContractHandsignResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.handsign.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_contract_handsign_ex_async(
        self,
        request: twc_models.StartContractHandsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.StartContractHandsignResponse:
        """
        Description: 电子合同平台方发起签署流程，用户在H5页面完成手动签署
        Summary: 电子合同平台方发起手动签署流程
        """
        UtilClient.validate_model(request)
        return twc_models.StartContractHandsignResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.handsign.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_flow(
        self,
        request: twc_models.QueryContractFlowRequest,
    ) -> twc_models.QueryContractFlowResponse:
        """
        Description: 查询签署流程的详细信息，包括流程配置、签署状态等
        Summary: 签署流程查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_flow_ex(request, headers, runtime)

    async def query_contract_flow_async(
        self,
        request: twc_models.QueryContractFlowRequest,
    ) -> twc_models.QueryContractFlowResponse:
        """
        Description: 查询签署流程的详细信息，包括流程配置、签署状态等
        Summary: 签署流程查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_flow_ex_async(request, headers, runtime)

    def query_contract_flow_ex(
        self,
        request: twc_models.QueryContractFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractFlowResponse:
        """
        Description: 查询签署流程的详细信息，包括流程配置、签署状态等
        Summary: 签署流程查询
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractFlowResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.flow.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_flow_ex_async(
        self,
        request: twc_models.QueryContractFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractFlowResponse:
        """
        Description: 查询签署流程的详细信息，包括流程配置、签署状态等
        Summary: 签署流程查询
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractFlowResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.flow.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_accountsealimage(
        self,
        request: twc_models.CreateContractAccountsealimageRequest,
    ) -> twc_models.CreateContractAccountsealimageResponse:
        """
        Description: 创建个人/机构图片印章
        Summary: 创建个人/机构图片印章
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_accountsealimage_ex(request, headers, runtime)

    async def create_contract_accountsealimage_async(
        self,
        request: twc_models.CreateContractAccountsealimageRequest,
    ) -> twc_models.CreateContractAccountsealimageResponse:
        """
        Description: 创建个人/机构图片印章
        Summary: 创建个人/机构图片印章
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_accountsealimage_ex_async(request, headers, runtime)

    def create_contract_accountsealimage_ex(
        self,
        request: twc_models.CreateContractAccountsealimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractAccountsealimageResponse:
        """
        Description: 创建个人/机构图片印章
        Summary: 创建个人/机构图片印章
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractAccountsealimageResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.accountsealimage.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_accountsealimage_ex_async(
        self,
        request: twc_models.CreateContractAccountsealimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractAccountsealimageResponse:
        """
        Description: 创建个人/机构图片印章
        Summary: 创建个人/机构图片印章
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractAccountsealimageResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.accountsealimage.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_contract_fileuploadurl(
        self,
        request: twc_models.GetContractFileuploadurlRequest,
    ) -> twc_models.GetContractFileuploadurlResponse:
        """
        Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
        Summary: 通过上传方式创建文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_contract_fileuploadurl_ex(request, headers, runtime)

    async def get_contract_fileuploadurl_async(
        self,
        request: twc_models.GetContractFileuploadurlRequest,
    ) -> twc_models.GetContractFileuploadurlResponse:
        """
        Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
        Summary: 通过上传方式创建文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_contract_fileuploadurl_ex_async(request, headers, runtime)

    def get_contract_fileuploadurl_ex(
        self,
        request: twc_models.GetContractFileuploadurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetContractFileuploadurlResponse:
        """
        Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
        Summary: 通过上传方式创建文件
        """
        UtilClient.validate_model(request)
        return twc_models.GetContractFileuploadurlResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.fileuploadurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_contract_fileuploadurl_ex_async(
        self,
        request: twc_models.GetContractFileuploadurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetContractFileuploadurlResponse:
        """
        Description: 采用文件直传的方式完成用户文件的上传。对接方通过该接口获取文件上传的授权地址
        Summary: 通过上传方式创建文件
        """
        UtilClient.validate_model(request)
        return twc_models.GetContractFileuploadurlResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.fileuploadurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_contract_platformsignfields(
        self,
        request: twc_models.AddContractPlatformsignfieldsRequest,
    ) -> twc_models.AddContractPlatformsignfieldsResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
        签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
        Summary: 添加平台自动盖章签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_contract_platformsignfields_ex(request, headers, runtime)

    async def add_contract_platformsignfields_async(
        self,
        request: twc_models.AddContractPlatformsignfieldsRequest,
    ) -> twc_models.AddContractPlatformsignfieldsResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
        签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
        Summary: 添加平台自动盖章签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_contract_platformsignfields_ex_async(request, headers, runtime)

    def add_contract_platformsignfields_ex(
        self,
        request: twc_models.AddContractPlatformsignfieldsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.AddContractPlatformsignfieldsResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
        签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
        Summary: 添加平台自动盖章签署区
        """
        UtilClient.validate_model(request)
        return twc_models.AddContractPlatformsignfieldsResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.platformsignfields.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_contract_platformsignfields_ex_async(
        self,
        request: twc_models.AddContractPlatformsignfieldsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.AddContractPlatformsignfieldsResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息（平台自动签无需指定签署人信息，默认签署人是对接的企业）。
        签署区创建完成，流程开启后，系统将自动完成“对接平台自动盖章签署区”的盖章，对接平台可全程无感完成本次签署。
        Summary: 添加平台自动盖章签署区
        """
        UtilClient.validate_model(request)
        return twc_models.AddContractPlatformsignfieldsResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.platformsignfields.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_contract_file(
        self,
        request: twc_models.GetContractFileRequest,
    ) -> twc_models.GetContractFileResponse:
        """
        Description: 查询文件详情，包括文件名称、大小、下载地址等
        Summary: 查询文件详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_contract_file_ex(request, headers, runtime)

    async def get_contract_file_async(
        self,
        request: twc_models.GetContractFileRequest,
    ) -> twc_models.GetContractFileResponse:
        """
        Description: 查询文件详情，包括文件名称、大小、下载地址等
        Summary: 查询文件详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_contract_file_ex_async(request, headers, runtime)

    def get_contract_file_ex(
        self,
        request: twc_models.GetContractFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetContractFileResponse:
        """
        Description: 查询文件详情，包括文件名称、大小、下载地址等
        Summary: 查询文件详情
        """
        UtilClient.validate_model(request)
        return twc_models.GetContractFileResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.file.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_contract_file_ex_async(
        self,
        request: twc_models.GetContractFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetContractFileResponse:
        """
        Description: 查询文件详情，包括文件名称、大小、下载地址等
        Summary: 查询文件详情
        """
        UtilClient.validate_model(request)
        return twc_models.GetContractFileResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.file.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_accountseals(
        self,
        request: twc_models.QueryContractAccountsealsRequest,
    ) -> twc_models.QueryContractAccountsealsResponse:
        """
        Description: 查询个人所有印章
        Summary: 查询个人印章
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_accountseals_ex(request, headers, runtime)

    async def query_contract_accountseals_async(
        self,
        request: twc_models.QueryContractAccountsealsRequest,
    ) -> twc_models.QueryContractAccountsealsResponse:
        """
        Description: 查询个人所有印章
        Summary: 查询个人印章
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_accountseals_ex_async(request, headers, runtime)

    def query_contract_accountseals_ex(
        self,
        request: twc_models.QueryContractAccountsealsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractAccountsealsResponse:
        """
        Description: 查询个人所有印章
        Summary: 查询个人印章
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractAccountsealsResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.accountseals.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_accountseals_ex_async(
        self,
        request: twc_models.QueryContractAccountsealsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractAccountsealsResponse:
        """
        Description: 查询个人所有印章
        Summary: 查询个人印章
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractAccountsealsResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.accountseals.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_organizationseals(
        self,
        request: twc_models.QueryContractOrganizationsealsRequest,
    ) -> twc_models.QueryContractOrganizationsealsResponse:
        """
        Description: 查询机构所有印章
        Summary: 查询机构印章
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_organizationseals_ex(request, headers, runtime)

    async def query_contract_organizationseals_async(
        self,
        request: twc_models.QueryContractOrganizationsealsRequest,
    ) -> twc_models.QueryContractOrganizationsealsResponse:
        """
        Description: 查询机构所有印章
        Summary: 查询机构印章
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_organizationseals_ex_async(request, headers, runtime)

    def query_contract_organizationseals_ex(
        self,
        request: twc_models.QueryContractOrganizationsealsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractOrganizationsealsResponse:
        """
        Description: 查询机构所有印章
        Summary: 查询机构印章
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractOrganizationsealsResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.organizationseals.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_organizationseals_ex_async(
        self,
        request: twc_models.QueryContractOrganizationsealsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractOrganizationsealsResponse:
        """
        Description: 查询机构所有印章
        Summary: 查询机构印章
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractOrganizationsealsResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.organizationseals.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_flowsigner(
        self,
        request: twc_models.QueryContractFlowsignerRequest,
    ) -> twc_models.QueryContractFlowsignerResponse:
        """
        Description: 查询流程所有签署人列表。
        Summary: 查询流程签署人列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_flowsigner_ex(request, headers, runtime)

    async def query_contract_flowsigner_async(
        self,
        request: twc_models.QueryContractFlowsignerRequest,
    ) -> twc_models.QueryContractFlowsignerResponse:
        """
        Description: 查询流程所有签署人列表。
        Summary: 查询流程签署人列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_flowsigner_ex_async(request, headers, runtime)

    def query_contract_flowsigner_ex(
        self,
        request: twc_models.QueryContractFlowsignerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractFlowsignerResponse:
        """
        Description: 查询流程所有签署人列表。
        Summary: 查询流程签署人列表
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractFlowsignerResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.flowsigner.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_flowsigner_ex_async(
        self,
        request: twc_models.QueryContractFlowsignerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractFlowsignerResponse:
        """
        Description: 查询流程所有签署人列表。
        Summary: 查询流程签署人列表
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractFlowsignerResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.flowsigner.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_signfields(
        self,
        request: twc_models.QueryContractSignfieldsRequest,
    ) -> twc_models.QueryContractSignfieldsResponse:
        """
        Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
        Summary: 查询签署区列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_signfields_ex(request, headers, runtime)

    async def query_contract_signfields_async(
        self,
        request: twc_models.QueryContractSignfieldsRequest,
    ) -> twc_models.QueryContractSignfieldsResponse:
        """
        Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
        Summary: 查询签署区列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_signfields_ex_async(request, headers, runtime)

    def query_contract_signfields_ex(
        self,
        request: twc_models.QueryContractSignfieldsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractSignfieldsResponse:
        """
        Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
        Summary: 查询签署区列表
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractSignfieldsResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.signfields.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_signfields_ex_async(
        self,
        request: twc_models.QueryContractSignfieldsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractSignfieldsResponse:
        """
        Description: 查询流程签署区列表，可以查询指定指定id或者签署人所属的签署区
        Summary: 查询签署区列表
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractSignfieldsResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.signfields.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_account(
        self,
        request: twc_models.QueryContractAccountRequest,
    ) -> twc_models.QueryContractAccountResponse:
        """
        Description: 使用创建账号返回的账号id查询用户的账号。
        Summary: 查询个人账号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_account_ex(request, headers, runtime)

    async def query_contract_account_async(
        self,
        request: twc_models.QueryContractAccountRequest,
    ) -> twc_models.QueryContractAccountResponse:
        """
        Description: 使用创建账号返回的账号id查询用户的账号。
        Summary: 查询个人账号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_account_ex_async(request, headers, runtime)

    def query_contract_account_ex(
        self,
        request: twc_models.QueryContractAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractAccountResponse:
        """
        Description: 使用创建账号返回的账号id查询用户的账号。
        Summary: 查询个人账号
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractAccountResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.account.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_account_ex_async(
        self,
        request: twc_models.QueryContractAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractAccountResponse:
        """
        Description: 使用创建账号返回的账号id查询用户的账号。
        Summary: 查询个人账号
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractAccountResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.account.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_organization(
        self,
        request: twc_models.QueryContractOrganizationRequest,
    ) -> twc_models.QueryContractOrganizationResponse:
        """
        Description: 使用创建账号返回的账号id查询机构账号。
        Summary: 查询机构账号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_organization_ex(request, headers, runtime)

    async def query_contract_organization_async(
        self,
        request: twc_models.QueryContractOrganizationRequest,
    ) -> twc_models.QueryContractOrganizationResponse:
        """
        Description: 使用创建账号返回的账号id查询机构账号。
        Summary: 查询机构账号
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_organization_ex_async(request, headers, runtime)

    def query_contract_organization_ex(
        self,
        request: twc_models.QueryContractOrganizationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractOrganizationResponse:
        """
        Description: 使用创建账号返回的账号id查询机构账号。
        Summary: 查询机构账号
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractOrganizationResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.organization.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_organization_ex_async(
        self,
        request: twc_models.QueryContractOrganizationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractOrganizationResponse:
        """
        Description: 使用创建账号返回的账号id查询机构账号。
        Summary: 查询机构账号
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractOrganizationResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.organization.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_template(
        self,
        request: twc_models.QueryContractTemplateRequest,
    ) -> twc_models.QueryContractTemplateResponse:
        """
        Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
        Summary: 查询模板详情详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_template_ex(request, headers, runtime)

    async def query_contract_template_async(
        self,
        request: twc_models.QueryContractTemplateRequest,
    ) -> twc_models.QueryContractTemplateResponse:
        """
        Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
        Summary: 查询模板详情详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_template_ex_async(request, headers, runtime)

    def query_contract_template_ex(
        self,
        request: twc_models.QueryContractTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractTemplateResponse:
        """
        Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
        Summary: 查询模板详情详情
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractTemplateResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_template_ex_async(
        self,
        request: twc_models.QueryContractTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractTemplateResponse:
        """
        Description: 查询模板详情，包括文件模板基本信息和输入项组件信息
        Summary: 查询模板详情详情
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractTemplateResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_signflow(
        self,
        request: twc_models.CreateContractSignflowRequest,
    ) -> twc_models.CreateContractSignflowResponse:
        """
        Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
        Summary: 创建签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_signflow_ex(request, headers, runtime)

    async def create_contract_signflow_async(
        self,
        request: twc_models.CreateContractSignflowRequest,
    ) -> twc_models.CreateContractSignflowResponse:
        """
        Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
        Summary: 创建签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_signflow_ex_async(request, headers, runtime)

    def create_contract_signflow_ex(
        self,
        request: twc_models.CreateContractSignflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractSignflowResponse:
        """
        Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
        Summary: 创建签署流程
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractSignflowResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.signflow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_signflow_ex_async(
        self,
        request: twc_models.CreateContractSignflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractSignflowResponse:
        """
        Description: 平台方制定签约模板和用户，发起手动签署流程，获得签署流程ID
        Summary: 创建签署流程
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractSignflowResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.signflow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_registerzft(
        self,
        request: twc_models.CreateContractRegisterzftRequest,
    ) -> twc_models.CreateContractRegisterzftResponse:
        """
        Description: 商户签署直付通协议
        Summary: 商户签署直付通协议
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_registerzft_ex(request, headers, runtime)

    async def create_contract_registerzft_async(
        self,
        request: twc_models.CreateContractRegisterzftRequest,
    ) -> twc_models.CreateContractRegisterzftResponse:
        """
        Description: 商户签署直付通协议
        Summary: 商户签署直付通协议
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_registerzft_ex_async(request, headers, runtime)

    def create_contract_registerzft_ex(
        self,
        request: twc_models.CreateContractRegisterzftRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractRegisterzftResponse:
        """
        Description: 商户签署直付通协议
        Summary: 商户签署直付通协议
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractRegisterzftResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.registerzft.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_registerzft_ex_async(
        self,
        request: twc_models.CreateContractRegisterzftRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractRegisterzftResponse:
        """
        Description: 商户签署直付通协议
        Summary: 商户签署直付通协议
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractRegisterzftResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.registerzft.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_platformtemplate(
        self,
        request: twc_models.CreateContractPlatformtemplateRequest,
    ) -> twc_models.CreateContractPlatformtemplateResponse:
        """
        Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
        Summary: 创建智能合同模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_platformtemplate_ex(request, headers, runtime)

    async def create_contract_platformtemplate_async(
        self,
        request: twc_models.CreateContractPlatformtemplateRequest,
    ) -> twc_models.CreateContractPlatformtemplateResponse:
        """
        Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
        Summary: 创建智能合同模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_platformtemplate_ex_async(request, headers, runtime)

    def create_contract_platformtemplate_ex(
        self,
        request: twc_models.CreateContractPlatformtemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractPlatformtemplateResponse:
        """
        Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
        Summary: 创建智能合同模板
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractPlatformtemplateResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.platformtemplate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_platformtemplate_ex_async(
        self,
        request: twc_models.CreateContractPlatformtemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractPlatformtemplateResponse:
        """
        Description: 创建模板的同时，指定平台方签署信息，完成智能合同模板创建
        Summary: 创建智能合同模板
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractPlatformtemplateResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.platformtemplate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_merchantzft(
        self,
        request: twc_models.QueryContractMerchantzftRequest,
    ) -> twc_models.QueryContractMerchantzftResponse:
        """
        Description: 查询商户直付通入驻信息
        Summary: 查询商户直付通入驻信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_merchantzft_ex(request, headers, runtime)

    async def query_contract_merchantzft_async(
        self,
        request: twc_models.QueryContractMerchantzftRequest,
    ) -> twc_models.QueryContractMerchantzftResponse:
        """
        Description: 查询商户直付通入驻信息
        Summary: 查询商户直付通入驻信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_merchantzft_ex_async(request, headers, runtime)

    def query_contract_merchantzft_ex(
        self,
        request: twc_models.QueryContractMerchantzftRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractMerchantzftResponse:
        """
        Description: 查询商户直付通入驻信息
        Summary: 查询商户直付通入驻信息
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractMerchantzftResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.merchantzft.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_merchantzft_ex_async(
        self,
        request: twc_models.QueryContractMerchantzftRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractMerchantzftResponse:
        """
        Description: 查询商户直付通入驻信息
        Summary: 查询商户直付通入驻信息
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractMerchantzftResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.merchantzft.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_contract_outtradeid(
        self,
        request: twc_models.ListContractOuttradeidRequest,
    ) -> twc_models.ListContractOuttradeidResponse:
        """
        Description: 列举本租户合同相关交易
        Summary: 列举本租户合同相关交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_contract_outtradeid_ex(request, headers, runtime)

    async def list_contract_outtradeid_async(
        self,
        request: twc_models.ListContractOuttradeidRequest,
    ) -> twc_models.ListContractOuttradeidResponse:
        """
        Description: 列举本租户合同相关交易
        Summary: 列举本租户合同相关交易
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_contract_outtradeid_ex_async(request, headers, runtime)

    def list_contract_outtradeid_ex(
        self,
        request: twc_models.ListContractOuttradeidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ListContractOuttradeidResponse:
        """
        Description: 列举本租户合同相关交易
        Summary: 列举本租户合同相关交易
        """
        UtilClient.validate_model(request)
        return twc_models.ListContractOuttradeidResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.outtradeid.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_contract_outtradeid_ex_async(
        self,
        request: twc_models.ListContractOuttradeidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ListContractOuttradeidResponse:
        """
        Description: 列举本租户合同相关交易
        Summary: 列举本租户合同相关交易
        """
        UtilClient.validate_model(request)
        return twc_models.ListContractOuttradeidResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.outtradeid.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_tradedetail(
        self,
        request: twc_models.QueryContractTradedetailRequest,
    ) -> twc_models.QueryContractTradedetailResponse:
        """
        Description: 根据订单id查询订单代扣详情
        Summary: 根据订单id查询订单代扣详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_tradedetail_ex(request, headers, runtime)

    async def query_contract_tradedetail_async(
        self,
        request: twc_models.QueryContractTradedetailRequest,
    ) -> twc_models.QueryContractTradedetailResponse:
        """
        Description: 根据订单id查询订单代扣详情
        Summary: 根据订单id查询订单代扣详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_tradedetail_ex_async(request, headers, runtime)

    def query_contract_tradedetail_ex(
        self,
        request: twc_models.QueryContractTradedetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractTradedetailResponse:
        """
        Description: 根据订单id查询订单代扣详情
        Summary: 根据订单id查询订单代扣详情
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractTradedetailResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.tradedetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_tradedetail_ex_async(
        self,
        request: twc_models.QueryContractTradedetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractTradedetailResponse:
        """
        Description: 根据订单id查询订单代扣详情
        Summary: 根据订单id查询订单代扣详情
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractTradedetailResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.tradedetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_merchantrefund(
        self,
        request: twc_models.CreateContractMerchantrefundRequest,
    ) -> twc_models.CreateContractMerchantrefundResponse:
        """
        Description: 商户根据订单id退款
        Summary: 商户根据订单id退款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_merchantrefund_ex(request, headers, runtime)

    async def create_contract_merchantrefund_async(
        self,
        request: twc_models.CreateContractMerchantrefundRequest,
    ) -> twc_models.CreateContractMerchantrefundResponse:
        """
        Description: 商户根据订单id退款
        Summary: 商户根据订单id退款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_merchantrefund_ex_async(request, headers, runtime)

    def create_contract_merchantrefund_ex(
        self,
        request: twc_models.CreateContractMerchantrefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractMerchantrefundResponse:
        """
        Description: 商户根据订单id退款
        Summary: 商户根据订单id退款
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractMerchantrefundResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.merchantrefund.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_merchantrefund_ex_async(
        self,
        request: twc_models.CreateContractMerchantrefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractMerchantrefundResponse:
        """
        Description: 商户根据订单id退款
        Summary: 商户根据订单id退款
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractMerchantrefundResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.merchantrefund.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_adminaccount(
        self,
        request: twc_models.CreateContractAdminaccountRequest,
    ) -> twc_models.CreateContractAdminaccountResponse:
        """
        Description: 创建蚂蚁区块链账户
        Summary: 创建蚂蚁区块链账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_adminaccount_ex(request, headers, runtime)

    async def create_contract_adminaccount_async(
        self,
        request: twc_models.CreateContractAdminaccountRequest,
    ) -> twc_models.CreateContractAdminaccountResponse:
        """
        Description: 创建蚂蚁区块链账户
        Summary: 创建蚂蚁区块链账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_adminaccount_ex_async(request, headers, runtime)

    def create_contract_adminaccount_ex(
        self,
        request: twc_models.CreateContractAdminaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractAdminaccountResponse:
        """
        Description: 创建蚂蚁区块链账户
        Summary: 创建蚂蚁区块链账户
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractAdminaccountResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.adminaccount.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_adminaccount_ex_async(
        self,
        request: twc_models.CreateContractAdminaccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractAdminaccountResponse:
        """
        Description: 创建蚂蚁区块链账户
        Summary: 创建蚂蚁区块链账户
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractAdminaccountResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.adminaccount.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_contract_tradeids(
        self,
        request: twc_models.ListContractTradeidsRequest,
    ) -> twc_models.ListContractTradeidsResponse:
        """
        Description: 商户根据合同id列举所有的tradeId
        Summary: 商户根据合同id列举所有的tradeId
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_contract_tradeids_ex(request, headers, runtime)

    async def list_contract_tradeids_async(
        self,
        request: twc_models.ListContractTradeidsRequest,
    ) -> twc_models.ListContractTradeidsResponse:
        """
        Description: 商户根据合同id列举所有的tradeId
        Summary: 商户根据合同id列举所有的tradeId
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_contract_tradeids_ex_async(request, headers, runtime)

    def list_contract_tradeids_ex(
        self,
        request: twc_models.ListContractTradeidsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ListContractTradeidsResponse:
        """
        Description: 商户根据合同id列举所有的tradeId
        Summary: 商户根据合同id列举所有的tradeId
        """
        UtilClient.validate_model(request)
        return twc_models.ListContractTradeidsResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.tradeids.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_contract_tradeids_ex_async(
        self,
        request: twc_models.ListContractTradeidsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ListContractTradeidsResponse:
        """
        Description: 商户根据合同id列举所有的tradeId
        Summary: 商户根据合同id列举所有的tradeId
        """
        UtilClient.validate_model(request)
        return twc_models.ListContractTradeidsResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.tradeids.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_commontrigger(
        self,
        request: twc_models.CreateContractCommontriggerRequest,
    ) -> twc_models.CreateContractCommontriggerResponse:
        """
        Description: 商户上传代扣规则
        Summary: 商户上传代扣规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_commontrigger_ex(request, headers, runtime)

    async def create_contract_commontrigger_async(
        self,
        request: twc_models.CreateContractCommontriggerRequest,
    ) -> twc_models.CreateContractCommontriggerResponse:
        """
        Description: 商户上传代扣规则
        Summary: 商户上传代扣规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_commontrigger_ex_async(request, headers, runtime)

    def create_contract_commontrigger_ex(
        self,
        request: twc_models.CreateContractCommontriggerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractCommontriggerResponse:
        """
        Description: 商户上传代扣规则
        Summary: 商户上传代扣规则
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractCommontriggerResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.commontrigger.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_commontrigger_ex_async(
        self,
        request: twc_models.CreateContractCommontriggerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractCommontriggerResponse:
        """
        Description: 商户上传代扣规则
        Summary: 商户上传代扣规则
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractCommontriggerResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.commontrigger.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_merchantindirectzft(
        self,
        request: twc_models.CreateContractMerchantindirectzftRequest,
    ) -> twc_models.CreateContractMerchantindirectzftResponse:
        """
        Description: 商户入驻直付通
        Summary: 商户入驻直付通
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_merchantindirectzft_ex(request, headers, runtime)

    async def create_contract_merchantindirectzft_async(
        self,
        request: twc_models.CreateContractMerchantindirectzftRequest,
    ) -> twc_models.CreateContractMerchantindirectzftResponse:
        """
        Description: 商户入驻直付通
        Summary: 商户入驻直付通
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_merchantindirectzft_ex_async(request, headers, runtime)

    def create_contract_merchantindirectzft_ex(
        self,
        request: twc_models.CreateContractMerchantindirectzftRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractMerchantindirectzftResponse:
        """
        Description: 商户入驻直付通
        Summary: 商户入驻直付通
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractMerchantindirectzftResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.merchantindirectzft.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_merchantindirectzft_ex_async(
        self,
        request: twc_models.CreateContractMerchantindirectzftRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractMerchantindirectzftResponse:
        """
        Description: 商户入驻直付通
        Summary: 商户入驻直付通
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractMerchantindirectzftResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.merchantindirectzft.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_merchantindirectzft(
        self,
        request: twc_models.QueryContractMerchantindirectzftRequest,
    ) -> twc_models.QueryContractMerchantindirectzftResponse:
        """
        Description: 根据订单id查询直付通商户入驻信息
        Summary: 根据订单id查询直付通商户入驻信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_merchantindirectzft_ex(request, headers, runtime)

    async def query_contract_merchantindirectzft_async(
        self,
        request: twc_models.QueryContractMerchantindirectzftRequest,
    ) -> twc_models.QueryContractMerchantindirectzftResponse:
        """
        Description: 根据订单id查询直付通商户入驻信息
        Summary: 根据订单id查询直付通商户入驻信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_merchantindirectzft_ex_async(request, headers, runtime)

    def query_contract_merchantindirectzft_ex(
        self,
        request: twc_models.QueryContractMerchantindirectzftRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractMerchantindirectzftResponse:
        """
        Description: 根据订单id查询直付通商户入驻信息
        Summary: 根据订单id查询直付通商户入驻信息
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractMerchantindirectzftResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.merchantindirectzft.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_merchantindirectzft_ex_async(
        self,
        request: twc_models.QueryContractMerchantindirectzftRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractMerchantindirectzftResponse:
        """
        Description: 根据订单id查询直付通商户入驻信息
        Summary: 根据订单id查询直付通商户入驻信息
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractMerchantindirectzftResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.merchantindirectzft.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_payresultfileurl(
        self,
        request: twc_models.QueryPayresultfileurlRequest,
    ) -> twc_models.QueryPayresultfileurlResponse:
        """
        Description: 获取支付对账文件的url
        Summary: 获取支付对账文件的url
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_payresultfileurl_ex(request, headers, runtime)

    async def query_payresultfileurl_async(
        self,
        request: twc_models.QueryPayresultfileurlRequest,
    ) -> twc_models.QueryPayresultfileurlResponse:
        """
        Description: 获取支付对账文件的url
        Summary: 获取支付对账文件的url
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_payresultfileurl_ex_async(request, headers, runtime)

    def query_payresultfileurl_ex(
        self,
        request: twc_models.QueryPayresultfileurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryPayresultfileurlResponse:
        """
        Description: 获取支付对账文件的url
        Summary: 获取支付对账文件的url
        """
        UtilClient.validate_model(request)
        return twc_models.QueryPayresultfileurlResponse().from_map(
            self.do_request('1.0', 'twc.notary.payresultfileurl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_payresultfileurl_ex_async(
        self,
        request: twc_models.QueryPayresultfileurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryPayresultfileurlResponse:
        """
        Description: 获取支付对账文件的url
        Summary: 获取支付对账文件的url
        """
        UtilClient.validate_model(request)
        return twc_models.QueryPayresultfileurlResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.payresultfileurl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_merchantimage(
        self,
        request: twc_models.CreateContractMerchantimageRequest,
    ) -> twc_models.CreateContractMerchantimageResponse:
        """
        Description: 智能合同图片上传
        Summary: 智能合同图片上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_merchantimage_ex(request, headers, runtime)

    async def create_contract_merchantimage_async(
        self,
        request: twc_models.CreateContractMerchantimageRequest,
    ) -> twc_models.CreateContractMerchantimageResponse:
        """
        Description: 智能合同图片上传
        Summary: 智能合同图片上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_merchantimage_ex_async(request, headers, runtime)

    def create_contract_merchantimage_ex(
        self,
        request: twc_models.CreateContractMerchantimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractMerchantimageResponse:
        """
        Description: 智能合同图片上传
        Summary: 智能合同图片上传
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractMerchantimageResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.merchantimage.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_merchantimage_ex_async(
        self,
        request: twc_models.CreateContractMerchantimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractMerchantimageResponse:
        """
        Description: 智能合同图片上传
        Summary: 智能合同图片上传
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractMerchantimageResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.merchantimage.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_contract_paytrade(
        self,
        request: twc_models.CancelContractPaytradeRequest,
    ) -> twc_models.CancelContractPaytradeResponse:
        """
        Description: 取消智能合同剩余代扣条目
        Summary: 取消智能合同剩余代扣条目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_contract_paytrade_ex(request, headers, runtime)

    async def cancel_contract_paytrade_async(
        self,
        request: twc_models.CancelContractPaytradeRequest,
    ) -> twc_models.CancelContractPaytradeResponse:
        """
        Description: 取消智能合同剩余代扣条目
        Summary: 取消智能合同剩余代扣条目
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_contract_paytrade_ex_async(request, headers, runtime)

    def cancel_contract_paytrade_ex(
        self,
        request: twc_models.CancelContractPaytradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CancelContractPaytradeResponse:
        """
        Description: 取消智能合同剩余代扣条目
        Summary: 取消智能合同剩余代扣条目
        """
        UtilClient.validate_model(request)
        return twc_models.CancelContractPaytradeResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.paytrade.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_contract_paytrade_ex_async(
        self,
        request: twc_models.CancelContractPaytradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CancelContractPaytradeResponse:
        """
        Description: 取消智能合同剩余代扣条目
        Summary: 取消智能合同剩余代扣条目
        """
        UtilClient.validate_model(request)
        return twc_models.CancelContractPaytradeResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.paytrade.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_handsignflow(
        self,
        request: twc_models.CreateContractHandsignflowRequest,
    ) -> twc_models.CreateContractHandsignflowResponse:
        """
        Description: 创建手动签署流程
        Summary: 创建手动签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_handsignflow_ex(request, headers, runtime)

    async def create_contract_handsignflow_async(
        self,
        request: twc_models.CreateContractHandsignflowRequest,
    ) -> twc_models.CreateContractHandsignflowResponse:
        """
        Description: 创建手动签署流程
        Summary: 创建手动签署流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_handsignflow_ex_async(request, headers, runtime)

    def create_contract_handsignflow_ex(
        self,
        request: twc_models.CreateContractHandsignflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractHandsignflowResponse:
        """
        Description: 创建手动签署流程
        Summary: 创建手动签署流程
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractHandsignflowResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.handsignflow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_handsignflow_ex_async(
        self,
        request: twc_models.CreateContractHandsignflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractHandsignflowResponse:
        """
        Description: 创建手动签署流程
        Summary: 创建手动签署流程
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractHandsignflowResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.handsignflow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_handsignfield(
        self,
        request: twc_models.CreateContractHandsignfieldRequest,
    ) -> twc_models.CreateContractHandsignfieldResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
        Summary: 添加电子合同签署方手动盖章签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_handsignfield_ex(request, headers, runtime)

    async def create_contract_handsignfield_async(
        self,
        request: twc_models.CreateContractHandsignfieldRequest,
    ) -> twc_models.CreateContractHandsignfieldResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
        Summary: 添加电子合同签署方手动盖章签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_handsignfield_ex_async(request, headers, runtime)

    def create_contract_handsignfield_ex(
        self,
        request: twc_models.CreateContractHandsignfieldRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractHandsignfieldResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
        Summary: 添加电子合同签署方手动盖章签署区
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractHandsignfieldResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.handsignfield.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_handsignfield_ex_async(
        self,
        request: twc_models.CreateContractHandsignfieldRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractHandsignfieldResponse:
        """
        Description: 向指定流程中创建签署区，每个签署区视为一个任务，系统会自动按照流程流转。 签署区的添加必须在签署文档添加之后, 签署区信息内部包含签署文档信息。签署区创建完成，流程开启后，通过获取签署地址接口，可获取用户手动签署链接，通过此链接可打开文件签署页面，进行人工确认签署。
        Summary: 添加电子合同签署方手动盖章签署区
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractHandsignfieldResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.handsignfield.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_contract_signurl(
        self,
        request: twc_models.GetContractSignurlRequest,
    ) -> twc_models.GetContractSignurlResponse:
        """
        Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
        Summary: 获取签署地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_contract_signurl_ex(request, headers, runtime)

    async def get_contract_signurl_async(
        self,
        request: twc_models.GetContractSignurlRequest,
    ) -> twc_models.GetContractSignurlResponse:
        """
        Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
        Summary: 获取签署地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_contract_signurl_ex_async(request, headers, runtime)

    def get_contract_signurl_ex(
        self,
        request: twc_models.GetContractSignurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetContractSignurlResponse:
        """
        Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
        Summary: 获取签署地址
        """
        UtilClient.validate_model(request)
        return twc_models.GetContractSignurlResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.signurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_contract_signurl_ex_async(
        self,
        request: twc_models.GetContractSignurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetContractSignurlResponse:
        """
        Description: 流程开启后，获取指定签署人的签署链接地址，如仅传入签署人账号id，则获取的签署任务链接仅包含本人的签署任务；如同时签署人账号id+机构id，则获取的签署任务链接包含机构与个人的签署任务；organizeId传入0，则返回的任务链接包含签署人“本人+所有代签机构”的签署任务。
        Summary: 获取签署地址
        """
        UtilClient.validate_model(request)
        return twc_models.GetContractSignurlResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.signurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_withhold_agreement(
        self,
        request: twc_models.CreateWithholdAgreementRequest,
    ) -> twc_models.CreateWithholdAgreementResponse:
        """
        Description: 可信付代扣规则内容创建
        Summary: 可信付代扣规则内容创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_withhold_agreement_ex(request, headers, runtime)

    async def create_withhold_agreement_async(
        self,
        request: twc_models.CreateWithholdAgreementRequest,
    ) -> twc_models.CreateWithholdAgreementResponse:
        """
        Description: 可信付代扣规则内容创建
        Summary: 可信付代扣规则内容创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_withhold_agreement_ex_async(request, headers, runtime)

    def create_withhold_agreement_ex(
        self,
        request: twc_models.CreateWithholdAgreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateWithholdAgreementResponse:
        """
        Description: 可信付代扣规则内容创建
        Summary: 可信付代扣规则内容创建
        """
        UtilClient.validate_model(request)
        return twc_models.CreateWithholdAgreementResponse().from_map(
            self.do_request('1.0', 'twc.notary.withhold.agreement.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_withhold_agreement_ex_async(
        self,
        request: twc_models.CreateWithholdAgreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateWithholdAgreementResponse:
        """
        Description: 可信付代扣规则内容创建
        Summary: 可信付代扣规则内容创建
        """
        UtilClient.validate_model(request)
        return twc_models.CreateWithholdAgreementResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.withhold.agreement.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_withhold_agreement(
        self,
        request: twc_models.QueryWithholdAgreementRequest,
    ) -> twc_models.QueryWithholdAgreementResponse:
        """
        Description: 查询消金代扣协议
        Summary: 查询可信付代扣协议内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_withhold_agreement_ex(request, headers, runtime)

    async def query_withhold_agreement_async(
        self,
        request: twc_models.QueryWithholdAgreementRequest,
    ) -> twc_models.QueryWithholdAgreementResponse:
        """
        Description: 查询消金代扣协议
        Summary: 查询可信付代扣协议内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_withhold_agreement_ex_async(request, headers, runtime)

    def query_withhold_agreement_ex(
        self,
        request: twc_models.QueryWithholdAgreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryWithholdAgreementResponse:
        """
        Description: 查询消金代扣协议
        Summary: 查询可信付代扣协议内容
        """
        UtilClient.validate_model(request)
        return twc_models.QueryWithholdAgreementResponse().from_map(
            self.do_request('1.0', 'twc.notary.withhold.agreement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_withhold_agreement_ex_async(
        self,
        request: twc_models.QueryWithholdAgreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryWithholdAgreementResponse:
        """
        Description: 查询消金代扣协议
        Summary: 查询可信付代扣协议内容
        """
        UtilClient.validate_model(request)
        return twc_models.QueryWithholdAgreementResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.withhold.agreement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_withhold_agreementurl(
        self,
        request: twc_models.QueryWithholdAgreementurlRequest,
    ) -> twc_models.QueryWithholdAgreementurlResponse:
        """
        Description: 查询可信付协议的入口
        Summary: 查询可信付协议的入口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_withhold_agreementurl_ex(request, headers, runtime)

    async def query_withhold_agreementurl_async(
        self,
        request: twc_models.QueryWithholdAgreementurlRequest,
    ) -> twc_models.QueryWithholdAgreementurlResponse:
        """
        Description: 查询可信付协议的入口
        Summary: 查询可信付协议的入口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_withhold_agreementurl_ex_async(request, headers, runtime)

    def query_withhold_agreementurl_ex(
        self,
        request: twc_models.QueryWithholdAgreementurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryWithholdAgreementurlResponse:
        """
        Description: 查询可信付协议的入口
        Summary: 查询可信付协议的入口
        """
        UtilClient.validate_model(request)
        return twc_models.QueryWithholdAgreementurlResponse().from_map(
            self.do_request('1.0', 'twc.notary.withhold.agreementurl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_withhold_agreementurl_ex_async(
        self,
        request: twc_models.QueryWithholdAgreementurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryWithholdAgreementurlResponse:
        """
        Description: 查询可信付协议的入口
        Summary: 查询可信付协议的入口
        """
        UtilClient.validate_model(request)
        return twc_models.QueryWithholdAgreementurlResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.withhold.agreementurl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_withhold_overduetime(
        self,
        request: twc_models.CreateWithholdOverduetimeRequest,
    ) -> twc_models.CreateWithholdOverduetimeResponse:
        """
        Description: 后台录入商家的产品的逾期日
        Summary: 后台录入商家的产品的逾期日
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_withhold_overduetime_ex(request, headers, runtime)

    async def create_withhold_overduetime_async(
        self,
        request: twc_models.CreateWithholdOverduetimeRequest,
    ) -> twc_models.CreateWithholdOverduetimeResponse:
        """
        Description: 后台录入商家的产品的逾期日
        Summary: 后台录入商家的产品的逾期日
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_withhold_overduetime_ex_async(request, headers, runtime)

    def create_withhold_overduetime_ex(
        self,
        request: twc_models.CreateWithholdOverduetimeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateWithholdOverduetimeResponse:
        """
        Description: 后台录入商家的产品的逾期日
        Summary: 后台录入商家的产品的逾期日
        """
        UtilClient.validate_model(request)
        return twc_models.CreateWithholdOverduetimeResponse().from_map(
            self.do_request('1.0', 'twc.notary.withhold.overduetime.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_withhold_overduetime_ex_async(
        self,
        request: twc_models.CreateWithholdOverduetimeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateWithholdOverduetimeResponse:
        """
        Description: 后台录入商家的产品的逾期日
        Summary: 后台录入商家的产品的逾期日
        """
        UtilClient.validate_model(request)
        return twc_models.CreateWithholdOverduetimeResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.withhold.overduetime.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_withhold_deduct(
        self,
        request: twc_models.SendWithholdDeductRequest,
    ) -> twc_models.SendWithholdDeductResponse:
        """
        Description: 可信付代扣的扣费请求
        Summary: 发送代扣请求
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_withhold_deduct_ex(request, headers, runtime)

    async def send_withhold_deduct_async(
        self,
        request: twc_models.SendWithholdDeductRequest,
    ) -> twc_models.SendWithholdDeductResponse:
        """
        Description: 可信付代扣的扣费请求
        Summary: 发送代扣请求
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_withhold_deduct_ex_async(request, headers, runtime)

    def send_withhold_deduct_ex(
        self,
        request: twc_models.SendWithholdDeductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SendWithholdDeductResponse:
        """
        Description: 可信付代扣的扣费请求
        Summary: 发送代扣请求
        """
        UtilClient.validate_model(request)
        return twc_models.SendWithholdDeductResponse().from_map(
            self.do_request('1.0', 'twc.notary.withhold.deduct.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_withhold_deduct_ex_async(
        self,
        request: twc_models.SendWithholdDeductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SendWithholdDeductResponse:
        """
        Description: 可信付代扣的扣费请求
        Summary: 发送代扣请求
        """
        UtilClient.validate_model(request)
        return twc_models.SendWithholdDeductResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.withhold.deduct.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_withhold_payresult(
        self,
        request: twc_models.QueryWithholdPayresultRequest,
    ) -> twc_models.QueryWithholdPayresultResponse:
        """
        Description: 可信付代扣结果查询
        Summary: 可信付代扣结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_withhold_payresult_ex(request, headers, runtime)

    async def query_withhold_payresult_async(
        self,
        request: twc_models.QueryWithholdPayresultRequest,
    ) -> twc_models.QueryWithholdPayresultResponse:
        """
        Description: 可信付代扣结果查询
        Summary: 可信付代扣结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_withhold_payresult_ex_async(request, headers, runtime)

    def query_withhold_payresult_ex(
        self,
        request: twc_models.QueryWithholdPayresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryWithholdPayresultResponse:
        """
        Description: 可信付代扣结果查询
        Summary: 可信付代扣结果查询
        """
        UtilClient.validate_model(request)
        return twc_models.QueryWithholdPayresultResponse().from_map(
            self.do_request('1.0', 'twc.notary.withhold.payresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_withhold_payresult_ex_async(
        self,
        request: twc_models.QueryWithholdPayresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryWithholdPayresultResponse:
        """
        Description: 可信付代扣结果查询
        Summary: 可信付代扣结果查询
        """
        UtilClient.validate_model(request)
        return twc_models.QueryWithholdPayresultResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.withhold.payresult.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_withhold_refund(
        self,
        request: twc_models.SendWithholdRefundRequest,
    ) -> twc_models.SendWithholdRefundResponse:
        """
        Description: 可信付退款请求
        Summary: 可信付退款请求
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_withhold_refund_ex(request, headers, runtime)

    async def send_withhold_refund_async(
        self,
        request: twc_models.SendWithholdRefundRequest,
    ) -> twc_models.SendWithholdRefundResponse:
        """
        Description: 可信付退款请求
        Summary: 可信付退款请求
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_withhold_refund_ex_async(request, headers, runtime)

    def send_withhold_refund_ex(
        self,
        request: twc_models.SendWithholdRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SendWithholdRefundResponse:
        """
        Description: 可信付退款请求
        Summary: 可信付退款请求
        """
        UtilClient.validate_model(request)
        return twc_models.SendWithholdRefundResponse().from_map(
            self.do_request('1.0', 'twc.notary.withhold.refund.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_withhold_refund_ex_async(
        self,
        request: twc_models.SendWithholdRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SendWithholdRefundResponse:
        """
        Description: 可信付退款请求
        Summary: 可信付退款请求
        """
        UtilClient.validate_model(request)
        return twc_models.SendWithholdRefundResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.withhold.refund.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_contract_invitation(
        self,
        request: twc_models.SendContractInvitationRequest,
    ) -> twc_models.SendContractInvitationResponse:
        """
        Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
        Summary: 创建注册邀请任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_contract_invitation_ex(request, headers, runtime)

    async def send_contract_invitation_async(
        self,
        request: twc_models.SendContractInvitationRequest,
    ) -> twc_models.SendContractInvitationResponse:
        """
        Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
        Summary: 创建注册邀请任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_contract_invitation_ex_async(request, headers, runtime)

    def send_contract_invitation_ex(
        self,
        request: twc_models.SendContractInvitationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SendContractInvitationResponse:
        """
        Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
        Summary: 创建注册邀请任务
        """
        UtilClient.validate_model(request)
        return twc_models.SendContractInvitationResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.invitation.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_contract_invitation_ex_async(
        self,
        request: twc_models.SendContractInvitationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SendContractInvitationResponse:
        """
        Description: 创建邀请任务，被邀请人收到通知后需要注册并完成实名认证方可开通电子签名服务。
        Summary: 创建注册邀请任务
        """
        UtilClient.validate_model(request)
        return twc_models.SendContractInvitationResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.invitation.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_contract_payrule(
        self,
        request: twc_models.ListContractPayruleRequest,
    ) -> twc_models.ListContractPayruleResponse:
        """
        Description: 查询代扣规则
        Summary: 查询代扣规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_contract_payrule_ex(request, headers, runtime)

    async def list_contract_payrule_async(
        self,
        request: twc_models.ListContractPayruleRequest,
    ) -> twc_models.ListContractPayruleResponse:
        """
        Description: 查询代扣规则
        Summary: 查询代扣规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_contract_payrule_ex_async(request, headers, runtime)

    def list_contract_payrule_ex(
        self,
        request: twc_models.ListContractPayruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ListContractPayruleResponse:
        """
        Description: 查询代扣规则
        Summary: 查询代扣规则
        """
        UtilClient.validate_model(request)
        return twc_models.ListContractPayruleResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.payrule.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_contract_payrule_ex_async(
        self,
        request: twc_models.ListContractPayruleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ListContractPayruleResponse:
        """
        Description: 查询代扣规则
        Summary: 查询代扣规则
        """
        UtilClient.validate_model(request)
        return twc_models.ListContractPayruleResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.payrule.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_withhold_qrcode(
        self,
        request: twc_models.CreateWithholdQrcodeRequest,
    ) -> twc_models.CreateWithholdQrcodeResponse:
        """
        Description: 获取可信付免签协议的二维码
        Summary: 获取可信付免签协议的二维码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_withhold_qrcode_ex(request, headers, runtime)

    async def create_withhold_qrcode_async(
        self,
        request: twc_models.CreateWithholdQrcodeRequest,
    ) -> twc_models.CreateWithholdQrcodeResponse:
        """
        Description: 获取可信付免签协议的二维码
        Summary: 获取可信付免签协议的二维码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_withhold_qrcode_ex_async(request, headers, runtime)

    def create_withhold_qrcode_ex(
        self,
        request: twc_models.CreateWithholdQrcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateWithholdQrcodeResponse:
        """
        Description: 获取可信付免签协议的二维码
        Summary: 获取可信付免签协议的二维码
        """
        UtilClient.validate_model(request)
        return twc_models.CreateWithholdQrcodeResponse().from_map(
            self.do_request('1.0', 'twc.notary.withhold.qrcode.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_withhold_qrcode_ex_async(
        self,
        request: twc_models.CreateWithholdQrcodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateWithholdQrcodeResponse:
        """
        Description: 获取可信付免签协议的二维码
        Summary: 获取可信付免签协议的二维码
        """
        UtilClient.validate_model(request)
        return twc_models.CreateWithholdQrcodeResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.withhold.qrcode.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_contract_paysingletrade(
        self,
        request: twc_models.CancelContractPaysingletradeRequest,
    ) -> twc_models.CancelContractPaysingletradeResponse:
        """
        Description: 取消某一期的代扣规则
        Summary: 取消某一期的代扣规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_contract_paysingletrade_ex(request, headers, runtime)

    async def cancel_contract_paysingletrade_async(
        self,
        request: twc_models.CancelContractPaysingletradeRequest,
    ) -> twc_models.CancelContractPaysingletradeResponse:
        """
        Description: 取消某一期的代扣规则
        Summary: 取消某一期的代扣规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_contract_paysingletrade_ex_async(request, headers, runtime)

    def cancel_contract_paysingletrade_ex(
        self,
        request: twc_models.CancelContractPaysingletradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CancelContractPaysingletradeResponse:
        """
        Description: 取消某一期的代扣规则
        Summary: 取消某一期的代扣规则
        """
        UtilClient.validate_model(request)
        return twc_models.CancelContractPaysingletradeResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.paysingletrade.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_contract_paysingletrade_ex_async(
        self,
        request: twc_models.CancelContractPaysingletradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CancelContractPaysingletradeResponse:
        """
        Description: 取消某一期的代扣规则
        Summary: 取消某一期的代扣规则
        """
        UtilClient.validate_model(request)
        return twc_models.CancelContractPaysingletradeResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.paysingletrade.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_contract_callbackkey(
        self,
        request: twc_models.ApplyContractCallbackkeyRequest,
    ) -> twc_models.ApplyContractCallbackkeyResponse:
        """
        Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
        Summary: 申请区块链合同回调加签key
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_contract_callbackkey_ex(request, headers, runtime)

    async def apply_contract_callbackkey_async(
        self,
        request: twc_models.ApplyContractCallbackkeyRequest,
    ) -> twc_models.ApplyContractCallbackkeyResponse:
        """
        Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
        Summary: 申请区块链合同回调加签key
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_contract_callbackkey_ex_async(request, headers, runtime)

    def apply_contract_callbackkey_ex(
        self,
        request: twc_models.ApplyContractCallbackkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyContractCallbackkeyResponse:
        """
        Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
        Summary: 申请区块链合同回调加签key
        """
        UtilClient.validate_model(request)
        return twc_models.ApplyContractCallbackkeyResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.callbackkey.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_contract_callbackkey_ex_async(
        self,
        request: twc_models.ApplyContractCallbackkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyContractCallbackkeyResponse:
        """
        Description: 使用区块链合同回调服务，需要申请加签时使用的key。该key每个平台方对应一个，不可变更，多次申请结果幂等。
        Summary: 申请区块链合同回调加签key
        """
        UtilClient.validate_model(request)
        return twc_models.ApplyContractCallbackkeyResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.callbackkey.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_onestepflow(
        self,
        request: twc_models.CreateContractOnestepflowRequest,
    ) -> twc_models.CreateContractOnestepflowResponse:
        """
        Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
        Summary: 一步创建签署流程接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_onestepflow_ex(request, headers, runtime)

    async def create_contract_onestepflow_async(
        self,
        request: twc_models.CreateContractOnestepflowRequest,
    ) -> twc_models.CreateContractOnestepflowResponse:
        """
        Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
        Summary: 一步创建签署流程接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_onestepflow_ex_async(request, headers, runtime)

    def create_contract_onestepflow_ex(
        self,
        request: twc_models.CreateContractOnestepflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractOnestepflowResponse:
        """
        Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
        Summary: 一步创建签署流程接口
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractOnestepflowResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.onestepflow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_onestepflow_ex_async(
        self,
        request: twc_models.CreateContractOnestepflowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractOnestepflowResponse:
        """
        Description: 快速创建签署流程，完成添加待签文档、流程基本信息、签署方，支持自动开启、自动归档。
        Summary: 一步创建签署流程接口
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractOnestepflowResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.onestepflow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_notary(
        self,
        request: twc_models.QueryContractNotaryRequest,
    ) -> twc_models.QueryContractNotaryResponse:
        """
        Description: 通过流程ID查询合同存证信息
        Summary: 查询合同存证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_notary_ex(request, headers, runtime)

    async def query_contract_notary_async(
        self,
        request: twc_models.QueryContractNotaryRequest,
    ) -> twc_models.QueryContractNotaryResponse:
        """
        Description: 通过流程ID查询合同存证信息
        Summary: 查询合同存证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_notary_ex_async(request, headers, runtime)

    def query_contract_notary_ex(
        self,
        request: twc_models.QueryContractNotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractNotaryResponse:
        """
        Description: 通过流程ID查询合同存证信息
        Summary: 查询合同存证信息
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractNotaryResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.notary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_notary_ex_async(
        self,
        request: twc_models.QueryContractNotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractNotaryResponse:
        """
        Description: 通过流程ID查询合同存证信息
        Summary: 查询合同存证信息
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractNotaryResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.notary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_ecocontract_trans(
        self,
        request: twc_models.CreateEcocontractTransRequest,
    ) -> twc_models.CreateEcocontractTransResponse:
        """
        Description: 获取合同存证事务ID
        Summary: 获取合同存证事务ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_ecocontract_trans_ex(request, headers, runtime)

    async def create_ecocontract_trans_async(
        self,
        request: twc_models.CreateEcocontractTransRequest,
    ) -> twc_models.CreateEcocontractTransResponse:
        """
        Description: 获取合同存证事务ID
        Summary: 获取合同存证事务ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_ecocontract_trans_ex_async(request, headers, runtime)

    def create_ecocontract_trans_ex(
        self,
        request: twc_models.CreateEcocontractTransRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateEcocontractTransResponse:
        """
        Description: 获取合同存证事务ID
        Summary: 获取合同存证事务ID
        """
        UtilClient.validate_model(request)
        return twc_models.CreateEcocontractTransResponse().from_map(
            self.do_request('1.0', 'twc.notary.ecocontract.trans.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_ecocontract_trans_ex_async(
        self,
        request: twc_models.CreateEcocontractTransRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateEcocontractTransResponse:
        """
        Description: 获取合同存证事务ID
        Summary: 获取合同存证事务ID
        """
        UtilClient.validate_model(request)
        return twc_models.CreateEcocontractTransResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.ecocontract.trans.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_ecocontract_text(
        self,
        request: twc_models.CreateEcocontractTextRequest,
    ) -> twc_models.CreateEcocontractTextResponse:
        """
        Description: 合同文本存证
        Summary: 合同文本存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_ecocontract_text_ex(request, headers, runtime)

    async def create_ecocontract_text_async(
        self,
        request: twc_models.CreateEcocontractTextRequest,
    ) -> twc_models.CreateEcocontractTextResponse:
        """
        Description: 合同文本存证
        Summary: 合同文本存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_ecocontract_text_ex_async(request, headers, runtime)

    def create_ecocontract_text_ex(
        self,
        request: twc_models.CreateEcocontractTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateEcocontractTextResponse:
        """
        Description: 合同文本存证
        Summary: 合同文本存证
        """
        UtilClient.validate_model(request)
        return twc_models.CreateEcocontractTextResponse().from_map(
            self.do_request('1.0', 'twc.notary.ecocontract.text.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_ecocontract_text_ex_async(
        self,
        request: twc_models.CreateEcocontractTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateEcocontractTextResponse:
        """
        Description: 合同文本存证
        Summary: 合同文本存证
        """
        UtilClient.validate_model(request)
        return twc_models.CreateEcocontractTextResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.ecocontract.text.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_wordsposition(
        self,
        request: twc_models.QueryContractWordspositionRequest,
    ) -> twc_models.QueryContractWordspositionResponse:
        """
        Description: 搜索关键字坐标，以关键字左下角为原点去查询坐标
        Summary: 搜索关键字坐标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_wordsposition_ex(request, headers, runtime)

    async def query_contract_wordsposition_async(
        self,
        request: twc_models.QueryContractWordspositionRequest,
    ) -> twc_models.QueryContractWordspositionResponse:
        """
        Description: 搜索关键字坐标，以关键字左下角为原点去查询坐标
        Summary: 搜索关键字坐标
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_wordsposition_ex_async(request, headers, runtime)

    def query_contract_wordsposition_ex(
        self,
        request: twc_models.QueryContractWordspositionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractWordspositionResponse:
        """
        Description: 搜索关键字坐标，以关键字左下角为原点去查询坐标
        Summary: 搜索关键字坐标
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractWordspositionResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.wordsposition.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_wordsposition_ex_async(
        self,
        request: twc_models.QueryContractWordspositionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractWordspositionResponse:
        """
        Description: 搜索关键字坐标，以关键字左下角为原点去查询坐标
        Summary: 搜索关键字坐标
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractWordspositionResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.wordsposition.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_contract_signer(
        self,
        request: twc_models.DeleteContractSignerRequest,
    ) -> twc_models.DeleteContractSignerResponse:
        """
        Description: 执行签署人删除逻辑
        Summary: 删除签署人
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_contract_signer_ex(request, headers, runtime)

    async def delete_contract_signer_async(
        self,
        request: twc_models.DeleteContractSignerRequest,
    ) -> twc_models.DeleteContractSignerResponse:
        """
        Description: 执行签署人删除逻辑
        Summary: 删除签署人
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_contract_signer_ex_async(request, headers, runtime)

    def delete_contract_signer_ex(
        self,
        request: twc_models.DeleteContractSignerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DeleteContractSignerResponse:
        """
        Description: 执行签署人删除逻辑
        Summary: 删除签署人
        """
        UtilClient.validate_model(request)
        return twc_models.DeleteContractSignerResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.signer.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_contract_signer_ex_async(
        self,
        request: twc_models.DeleteContractSignerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DeleteContractSignerResponse:
        """
        Description: 执行签署人删除逻辑
        Summary: 删除签署人
        """
        UtilClient.validate_model(request)
        return twc_models.DeleteContractSignerResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.signer.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_contract_certificate(
        self,
        request: twc_models.GetContractCertificateRequest,
    ) -> twc_models.GetContractCertificateResponse:
        """
        Description: 获取区块链合同存证证明
        Summary: 获取区块链合同存证证明
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_contract_certificate_ex(request, headers, runtime)

    async def get_contract_certificate_async(
        self,
        request: twc_models.GetContractCertificateRequest,
    ) -> twc_models.GetContractCertificateResponse:
        """
        Description: 获取区块链合同存证证明
        Summary: 获取区块链合同存证证明
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_contract_certificate_ex_async(request, headers, runtime)

    def get_contract_certificate_ex(
        self,
        request: twc_models.GetContractCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetContractCertificateResponse:
        """
        Description: 获取区块链合同存证证明
        Summary: 获取区块链合同存证证明
        """
        UtilClient.validate_model(request)
        return twc_models.GetContractCertificateResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.certificate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_contract_certificate_ex_async(
        self,
        request: twc_models.GetContractCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetContractCertificateResponse:
        """
        Description: 获取区块链合同存证证明
        Summary: 获取区块链合同存证证明
        """
        UtilClient.validate_model(request)
        return twc_models.GetContractCertificateResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.certificate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_signfieldsealid(
        self,
        request: twc_models.QueryContractSignfieldsealidRequest,
    ) -> twc_models.QueryContractSignfieldsealidResponse:
        """
        Description: 已归档的合同，支持根据合同流程签署区查询已使用的印章id
        Summary: 根据合同流程签署区查询已使用的印章id
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_signfieldsealid_ex(request, headers, runtime)

    async def query_contract_signfieldsealid_async(
        self,
        request: twc_models.QueryContractSignfieldsealidRequest,
    ) -> twc_models.QueryContractSignfieldsealidResponse:
        """
        Description: 已归档的合同，支持根据合同流程签署区查询已使用的印章id
        Summary: 根据合同流程签署区查询已使用的印章id
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_signfieldsealid_ex_async(request, headers, runtime)

    def query_contract_signfieldsealid_ex(
        self,
        request: twc_models.QueryContractSignfieldsealidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractSignfieldsealidResponse:
        """
        Description: 已归档的合同，支持根据合同流程签署区查询已使用的印章id
        Summary: 根据合同流程签署区查询已使用的印章id
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractSignfieldsealidResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.signfieldsealid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_signfieldsealid_ex_async(
        self,
        request: twc_models.QueryContractSignfieldsealidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractSignfieldsealidResponse:
        """
        Description: 已归档的合同，支持根据合同流程签署区查询已使用的印章id
        Summary: 根据合同流程签署区查询已使用的印章id
        """
        UtilClient.validate_model(request)
        return twc_models.QueryContractSignfieldsealidResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.signfieldsealid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def notify_contract_signer(
        self,
        request: twc_models.NotifyContractSignerRequest,
    ) -> twc_models.NotifyContractSignerResponse:
        """
        Description: 本接口功能默认不开启，如有需求请联系技术支持。添加手动签署区，并启动签署流程之后，触发通知，提醒签署方执行签署。通知方式以创建流程时的配置为准（目前仅支持短信）。
        Summary: 通知签署方执行合同签署
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_contract_signer_ex(request, headers, runtime)

    async def notify_contract_signer_async(
        self,
        request: twc_models.NotifyContractSignerRequest,
    ) -> twc_models.NotifyContractSignerResponse:
        """
        Description: 本接口功能默认不开启，如有需求请联系技术支持。添加手动签署区，并启动签署流程之后，触发通知，提醒签署方执行签署。通知方式以创建流程时的配置为准（目前仅支持短信）。
        Summary: 通知签署方执行合同签署
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_contract_signer_ex_async(request, headers, runtime)

    def notify_contract_signer_ex(
        self,
        request: twc_models.NotifyContractSignerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.NotifyContractSignerResponse:
        """
        Description: 本接口功能默认不开启，如有需求请联系技术支持。添加手动签署区，并启动签署流程之后，触发通知，提醒签署方执行签署。通知方式以创建流程时的配置为准（目前仅支持短信）。
        Summary: 通知签署方执行合同签署
        """
        UtilClient.validate_model(request)
        return twc_models.NotifyContractSignerResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.signer.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_contract_signer_ex_async(
        self,
        request: twc_models.NotifyContractSignerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.NotifyContractSignerResponse:
        """
        Description: 本接口功能默认不开启，如有需求请联系技术支持。添加手动签署区，并启动签署流程之后，触发通知，提醒签署方执行签署。通知方式以创建流程时的配置为准（目前仅支持短信）。
        Summary: 通知签署方执行合同签署
        """
        UtilClient.validate_model(request)
        return twc_models.NotifyContractSignerResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.signer.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_contract_platform(
        self,
        request: twc_models.UpdateContractPlatformRequest,
    ) -> twc_models.UpdateContractPlatformResponse:
        """
        Description: 通过配置白名单，临时允许修改证件号/名称等所有字段以及经办人的信息，修改后从白名单中去除
        Summary: 修改平台方注册信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_contract_platform_ex(request, headers, runtime)

    async def update_contract_platform_async(
        self,
        request: twc_models.UpdateContractPlatformRequest,
    ) -> twc_models.UpdateContractPlatformResponse:
        """
        Description: 通过配置白名单，临时允许修改证件号/名称等所有字段以及经办人的信息，修改后从白名单中去除
        Summary: 修改平台方注册信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_contract_platform_ex_async(request, headers, runtime)

    def update_contract_platform_ex(
        self,
        request: twc_models.UpdateContractPlatformRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateContractPlatformResponse:
        """
        Description: 通过配置白名单，临时允许修改证件号/名称等所有字段以及经办人的信息，修改后从白名单中去除
        Summary: 修改平台方注册信息
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateContractPlatformResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.platform.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_contract_platform_ex_async(
        self,
        request: twc_models.UpdateContractPlatformRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateContractPlatformResponse:
        """
        Description: 通过配置白名单，临时允许修改证件号/名称等所有字段以及经办人的信息，修改后从白名单中去除
        Summary: 修改平台方注册信息
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateContractPlatformResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.platform.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_contract_person(
        self,
        request: twc_models.UpdateContractPersonRequest,
    ) -> twc_models.UpdateContractPersonResponse:
        """
        Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
        Summary: 修改用户注册信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_contract_person_ex(request, headers, runtime)

    async def update_contract_person_async(
        self,
        request: twc_models.UpdateContractPersonRequest,
    ) -> twc_models.UpdateContractPersonResponse:
        """
        Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
        Summary: 修改用户注册信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_contract_person_ex_async(request, headers, runtime)

    def update_contract_person_ex(
        self,
        request: twc_models.UpdateContractPersonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateContractPersonResponse:
        """
        Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
        Summary: 修改用户注册信息
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateContractPersonResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.person.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_contract_person_ex_async(
        self,
        request: twc_models.UpdateContractPersonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateContractPersonResponse:
        """
        Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
        Summary: 修改用户注册信息
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateContractPersonResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.person.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_contract_organization(
        self,
        request: twc_models.UpdateContractOrganizationRequest,
    ) -> twc_models.UpdateContractOrganizationResponse:
        """
        Description: 机构的注册信息中证件信息为空时允许修改机构名、证件等各项信息，但不允许修改经办人信息，如果不为空，则无法修改
        Summary: 修改机构用户注册信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_contract_organization_ex(request, headers, runtime)

    async def update_contract_organization_async(
        self,
        request: twc_models.UpdateContractOrganizationRequest,
    ) -> twc_models.UpdateContractOrganizationResponse:
        """
        Description: 机构的注册信息中证件信息为空时允许修改机构名、证件等各项信息，但不允许修改经办人信息，如果不为空，则无法修改
        Summary: 修改机构用户注册信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_contract_organization_ex_async(request, headers, runtime)

    def update_contract_organization_ex(
        self,
        request: twc_models.UpdateContractOrganizationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateContractOrganizationResponse:
        """
        Description: 机构的注册信息中证件信息为空时允许修改机构名、证件等各项信息，但不允许修改经办人信息，如果不为空，则无法修改
        Summary: 修改机构用户注册信息
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateContractOrganizationResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.organization.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_contract_organization_ex_async(
        self,
        request: twc_models.UpdateContractOrganizationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateContractOrganizationResponse:
        """
        Description: 机构的注册信息中证件信息为空时允许修改机构名、证件等各项信息，但不允许修改经办人信息，如果不为空，则无法修改
        Summary: 修改机构用户注册信息
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateContractOrganizationResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.organization.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_epidentity_twometa(
        self,
        request: twc_models.CheckEpidentityTwometaRequest,
    ) -> twc_models.CheckEpidentityTwometaResponse:
        """
        Description: 输入企业名+证件号，发起企业二要素认证请求。
        Summary: 企业二要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_epidentity_twometa_ex(request, headers, runtime)

    async def check_epidentity_twometa_async(
        self,
        request: twc_models.CheckEpidentityTwometaRequest,
    ) -> twc_models.CheckEpidentityTwometaResponse:
        """
        Description: 输入企业名+证件号，发起企业二要素认证请求。
        Summary: 企业二要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_epidentity_twometa_ex_async(request, headers, runtime)

    def check_epidentity_twometa_ex(
        self,
        request: twc_models.CheckEpidentityTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckEpidentityTwometaResponse:
        """
        Description: 输入企业名+证件号，发起企业二要素认证请求。
        Summary: 企业二要素认证
        """
        UtilClient.validate_model(request)
        return twc_models.CheckEpidentityTwometaResponse().from_map(
            self.do_request('1.0', 'twc.notary.epidentity.twometa.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_epidentity_twometa_ex_async(
        self,
        request: twc_models.CheckEpidentityTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckEpidentityTwometaResponse:
        """
        Description: 输入企业名+证件号，发起企业二要素认证请求。
        Summary: 企业二要素认证
        """
        UtilClient.validate_model(request)
        return twc_models.CheckEpidentityTwometaResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.epidentity.twometa.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_epidentity_threemeta(
        self,
        request: twc_models.CheckEpidentityThreemetaRequest,
    ) -> twc_models.CheckEpidentityThreemetaResponse:
        """
        Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
        Summary: 企业三要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_epidentity_threemeta_ex(request, headers, runtime)

    async def check_epidentity_threemeta_async(
        self,
        request: twc_models.CheckEpidentityThreemetaRequest,
    ) -> twc_models.CheckEpidentityThreemetaResponse:
        """
        Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
        Summary: 企业三要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_epidentity_threemeta_ex_async(request, headers, runtime)

    def check_epidentity_threemeta_ex(
        self,
        request: twc_models.CheckEpidentityThreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckEpidentityThreemetaResponse:
        """
        Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
        Summary: 企业三要素认证
        """
        UtilClient.validate_model(request)
        return twc_models.CheckEpidentityThreemetaResponse().from_map(
            self.do_request('1.0', 'twc.notary.epidentity.threemeta.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_epidentity_threemeta_ex_async(
        self,
        request: twc_models.CheckEpidentityThreemetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckEpidentityThreemetaResponse:
        """
        Description: 输入企业名+证件号+企业法人姓名，发起企业三要素认证请求。
        Summary: 企业三要素认证
        """
        UtilClient.validate_model(request)
        return twc_models.CheckEpidentityThreemetaResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.epidentity.threemeta.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_epidentity_fourmeta(
        self,
        request: twc_models.CheckEpidentityFourmetaRequest,
    ) -> twc_models.CheckEpidentityFourmetaResponse:
        """
        Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
        Summary: 企业四要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_epidentity_fourmeta_ex(request, headers, runtime)

    async def check_epidentity_fourmeta_async(
        self,
        request: twc_models.CheckEpidentityFourmetaRequest,
    ) -> twc_models.CheckEpidentityFourmetaResponse:
        """
        Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
        Summary: 企业四要素认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_epidentity_fourmeta_ex_async(request, headers, runtime)

    def check_epidentity_fourmeta_ex(
        self,
        request: twc_models.CheckEpidentityFourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckEpidentityFourmetaResponse:
        """
        Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
        Summary: 企业四要素认证
        """
        UtilClient.validate_model(request)
        return twc_models.CheckEpidentityFourmetaResponse().from_map(
            self.do_request('1.0', 'twc.notary.epidentity.fourmeta.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_epidentity_fourmeta_ex_async(
        self,
        request: twc_models.CheckEpidentityFourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckEpidentityFourmetaResponse:
        """
        Description: 输入企业名+证件号+企业法人姓+法人证件号，发起企业四要素认证请求。
        Summary: 企业四要素认证
        """
        UtilClient.validate_model(request)
        return twc_models.CheckEpidentityFourmetaResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.epidentity.fourmeta.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_notarization_order(
        self,
        request: twc_models.CheckNotarizationOrderRequest,
    ) -> twc_models.CheckNotarizationOrderResponse:
        """
        Description: 查询公证订单的有效性
        Summary: 查询公证订单的有效性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_notarization_order_ex(request, headers, runtime)

    async def check_notarization_order_async(
        self,
        request: twc_models.CheckNotarizationOrderRequest,
    ) -> twc_models.CheckNotarizationOrderResponse:
        """
        Description: 查询公证订单的有效性
        Summary: 查询公证订单的有效性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_notarization_order_ex_async(request, headers, runtime)

    def check_notarization_order_ex(
        self,
        request: twc_models.CheckNotarizationOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckNotarizationOrderResponse:
        """
        Description: 查询公证订单的有效性
        Summary: 查询公证订单的有效性
        """
        UtilClient.validate_model(request)
        return twc_models.CheckNotarizationOrderResponse().from_map(
            self.do_request('1.0', 'twc.notary.notarization.order.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_notarization_order_ex_async(
        self,
        request: twc_models.CheckNotarizationOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckNotarizationOrderResponse:
        """
        Description: 查询公证订单的有效性
        Summary: 查询公证订单的有效性
        """
        UtilClient.validate_model(request)
        return twc_models.CheckNotarizationOrderResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.notarization.order.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_notarization_order(
        self,
        request: twc_models.UpdateNotarizationOrderRequest,
    ) -> twc_models.UpdateNotarizationOrderResponse:
        """
        Description: 更新公证订单状态
        Summary: 更新公证订单状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_notarization_order_ex(request, headers, runtime)

    async def update_notarization_order_async(
        self,
        request: twc_models.UpdateNotarizationOrderRequest,
    ) -> twc_models.UpdateNotarizationOrderResponse:
        """
        Description: 更新公证订单状态
        Summary: 更新公证订单状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_notarization_order_ex_async(request, headers, runtime)

    def update_notarization_order_ex(
        self,
        request: twc_models.UpdateNotarizationOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateNotarizationOrderResponse:
        """
        Description: 更新公证订单状态
        Summary: 更新公证订单状态
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateNotarizationOrderResponse().from_map(
            self.do_request('1.0', 'twc.notary.notarization.order.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_notarization_order_ex_async(
        self,
        request: twc_models.UpdateNotarizationOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateNotarizationOrderResponse:
        """
        Description: 更新公证订单状态
        Summary: 更新公证订单状态
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateNotarizationOrderResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.notarization.order.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_notarization_order(
        self,
        request: twc_models.SetNotarizationOrderRequest,
    ) -> twc_models.SetNotarizationOrderResponse:
        """
        Description: 设置订单属性
        Summary: 设置订单属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_notarization_order_ex(request, headers, runtime)

    async def set_notarization_order_async(
        self,
        request: twc_models.SetNotarizationOrderRequest,
    ) -> twc_models.SetNotarizationOrderResponse:
        """
        Description: 设置订单属性
        Summary: 设置订单属性
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_notarization_order_ex_async(request, headers, runtime)

    def set_notarization_order_ex(
        self,
        request: twc_models.SetNotarizationOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SetNotarizationOrderResponse:
        """
        Description: 设置订单属性
        Summary: 设置订单属性
        """
        UtilClient.validate_model(request)
        return twc_models.SetNotarizationOrderResponse().from_map(
            self.do_request('1.0', 'twc.notary.notarization.order.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_notarization_order_ex_async(
        self,
        request: twc_models.SetNotarizationOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SetNotarizationOrderResponse:
        """
        Description: 设置订单属性
        Summary: 设置订单属性
        """
        UtilClient.validate_model(request)
        return twc_models.SetNotarizationOrderResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.notarization.order.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_identification_faceauth(
        self,
        request: twc_models.InitIdentificationFaceauthRequest,
    ) -> twc_models.InitIdentificationFaceauthResponse:
        """
        Description: 实人认证初始化
        Summary: 实人认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_identification_faceauth_ex(request, headers, runtime)

    async def init_identification_faceauth_async(
        self,
        request: twc_models.InitIdentificationFaceauthRequest,
    ) -> twc_models.InitIdentificationFaceauthResponse:
        """
        Description: 实人认证初始化
        Summary: 实人认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_identification_faceauth_ex_async(request, headers, runtime)

    def init_identification_faceauth_ex(
        self,
        request: twc_models.InitIdentificationFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.InitIdentificationFaceauthResponse:
        """
        Description: 实人认证初始化
        Summary: 实人认证初始化
        """
        UtilClient.validate_model(request)
        return twc_models.InitIdentificationFaceauthResponse().from_map(
            self.do_request('1.0', 'twc.notary.identification.faceauth.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_identification_faceauth_ex_async(
        self,
        request: twc_models.InitIdentificationFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.InitIdentificationFaceauthResponse:
        """
        Description: 实人认证初始化
        Summary: 实人认证初始化
        """
        UtilClient.validate_model(request)
        return twc_models.InitIdentificationFaceauthResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.identification.faceauth.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def certify_identification_faceauth(
        self,
        request: twc_models.CertifyIdentificationFaceauthRequest,
    ) -> twc_models.CertifyIdentificationFaceauthResponse:
        """
        Description: 发起实人认证
        Summary: 发起实人认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.certify_identification_faceauth_ex(request, headers, runtime)

    async def certify_identification_faceauth_async(
        self,
        request: twc_models.CertifyIdentificationFaceauthRequest,
    ) -> twc_models.CertifyIdentificationFaceauthResponse:
        """
        Description: 发起实人认证
        Summary: 发起实人认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.certify_identification_faceauth_ex_async(request, headers, runtime)

    def certify_identification_faceauth_ex(
        self,
        request: twc_models.CertifyIdentificationFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CertifyIdentificationFaceauthResponse:
        """
        Description: 发起实人认证
        Summary: 发起实人认证
        """
        UtilClient.validate_model(request)
        return twc_models.CertifyIdentificationFaceauthResponse().from_map(
            self.do_request('1.0', 'twc.notary.identification.faceauth.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def certify_identification_faceauth_ex_async(
        self,
        request: twc_models.CertifyIdentificationFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CertifyIdentificationFaceauthResponse:
        """
        Description: 发起实人认证
        Summary: 发起实人认证
        """
        UtilClient.validate_model(request)
        return twc_models.CertifyIdentificationFaceauthResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.identification.faceauth.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_identification_faceauth(
        self,
        request: twc_models.QueryIdentificationFaceauthRequest,
    ) -> twc_models.QueryIdentificationFaceauthResponse:
        """
        Description: 查询实人认证结果
        Summary: 查询实人认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_identification_faceauth_ex(request, headers, runtime)

    async def query_identification_faceauth_async(
        self,
        request: twc_models.QueryIdentificationFaceauthRequest,
    ) -> twc_models.QueryIdentificationFaceauthResponse:
        """
        Description: 查询实人认证结果
        Summary: 查询实人认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_identification_faceauth_ex_async(request, headers, runtime)

    def query_identification_faceauth_ex(
        self,
        request: twc_models.QueryIdentificationFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryIdentificationFaceauthResponse:
        """
        Description: 查询实人认证结果
        Summary: 查询实人认证结果
        """
        UtilClient.validate_model(request)
        return twc_models.QueryIdentificationFaceauthResponse().from_map(
            self.do_request('1.0', 'twc.notary.identification.faceauth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_identification_faceauth_ex_async(
        self,
        request: twc_models.QueryIdentificationFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryIdentificationFaceauthResponse:
        """
        Description: 查询实人认证结果
        Summary: 查询实人认证结果
        """
        UtilClient.validate_model(request)
        return twc_models.QueryIdentificationFaceauthResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.identification.faceauth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_enterprise_faceauth(
        self,
        request: twc_models.QueryEnterpriseFaceauthRequest,
    ) -> twc_models.QueryEnterpriseFaceauthResponse:
        """
        Description: 企业法人认证查询结果接口
        Summary: 企业法人认证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_enterprise_faceauth_ex(request, headers, runtime)

    async def query_enterprise_faceauth_async(
        self,
        request: twc_models.QueryEnterpriseFaceauthRequest,
    ) -> twc_models.QueryEnterpriseFaceauthResponse:
        """
        Description: 企业法人认证查询结果接口
        Summary: 企业法人认证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_enterprise_faceauth_ex_async(request, headers, runtime)

    def query_enterprise_faceauth_ex(
        self,
        request: twc_models.QueryEnterpriseFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryEnterpriseFaceauthResponse:
        """
        Description: 企业法人认证查询结果接口
        Summary: 企业法人认证查询
        """
        UtilClient.validate_model(request)
        return twc_models.QueryEnterpriseFaceauthResponse().from_map(
            self.do_request('1.0', 'twc.notary.enterprise.faceauth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_enterprise_faceauth_ex_async(
        self,
        request: twc_models.QueryEnterpriseFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryEnterpriseFaceauthResponse:
        """
        Description: 企业法人认证查询结果接口
        Summary: 企业法人认证查询
        """
        UtilClient.validate_model(request)
        return twc_models.QueryEnterpriseFaceauthResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.enterprise.faceauth.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_enterprise_faceauth(
        self,
        request: twc_models.InitEnterpriseFaceauthRequest,
    ) -> twc_models.InitEnterpriseFaceauthResponse:
        """
        Description: 企业法人认证初始化接口
        Summary: 企业法人认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_enterprise_faceauth_ex(request, headers, runtime)

    async def init_enterprise_faceauth_async(
        self,
        request: twc_models.InitEnterpriseFaceauthRequest,
    ) -> twc_models.InitEnterpriseFaceauthResponse:
        """
        Description: 企业法人认证初始化接口
        Summary: 企业法人认证初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_enterprise_faceauth_ex_async(request, headers, runtime)

    def init_enterprise_faceauth_ex(
        self,
        request: twc_models.InitEnterpriseFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.InitEnterpriseFaceauthResponse:
        """
        Description: 企业法人认证初始化接口
        Summary: 企业法人认证初始化
        """
        UtilClient.validate_model(request)
        return twc_models.InitEnterpriseFaceauthResponse().from_map(
            self.do_request('1.0', 'twc.notary.enterprise.faceauth.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_enterprise_faceauth_ex_async(
        self,
        request: twc_models.InitEnterpriseFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.InitEnterpriseFaceauthResponse:
        """
        Description: 企业法人认证初始化接口
        Summary: 企业法人认证初始化
        """
        UtilClient.validate_model(request)
        return twc_models.InitEnterpriseFaceauthResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.enterprise.faceauth.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def certify_enterprise_faceauth(
        self,
        request: twc_models.CertifyEnterpriseFaceauthRequest,
    ) -> twc_models.CertifyEnterpriseFaceauthResponse:
        """
        Description: 企业法人认证开始接口
        Summary: 企业法人认证开始
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.certify_enterprise_faceauth_ex(request, headers, runtime)

    async def certify_enterprise_faceauth_async(
        self,
        request: twc_models.CertifyEnterpriseFaceauthRequest,
    ) -> twc_models.CertifyEnterpriseFaceauthResponse:
        """
        Description: 企业法人认证开始接口
        Summary: 企业法人认证开始
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.certify_enterprise_faceauth_ex_async(request, headers, runtime)

    def certify_enterprise_faceauth_ex(
        self,
        request: twc_models.CertifyEnterpriseFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CertifyEnterpriseFaceauthResponse:
        """
        Description: 企业法人认证开始接口
        Summary: 企业法人认证开始
        """
        UtilClient.validate_model(request)
        return twc_models.CertifyEnterpriseFaceauthResponse().from_map(
            self.do_request('1.0', 'twc.notary.enterprise.faceauth.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def certify_enterprise_faceauth_ex_async(
        self,
        request: twc_models.CertifyEnterpriseFaceauthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CertifyEnterpriseFaceauthResponse:
        """
        Description: 企业法人认证开始接口
        Summary: 企业法人认证开始
        """
        UtilClient.validate_model(request)
        return twc_models.CertifyEnterpriseFaceauthResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.enterprise.faceauth.certify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_order(
        self,
        request: twc_models.CreateLeaseOrderRequest,
    ) -> twc_models.CreateLeaseOrderResponse:
        """
        Description: 创建租赁订单
        Summary: 租赁订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_order_ex(request, headers, runtime)

    async def create_lease_order_async(
        self,
        request: twc_models.CreateLeaseOrderRequest,
    ) -> twc_models.CreateLeaseOrderResponse:
        """
        Description: 创建租赁订单
        Summary: 租赁订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_order_ex_async(request, headers, runtime)

    def create_lease_order_ex(
        self,
        request: twc_models.CreateLeaseOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseOrderResponse:
        """
        Description: 创建租赁订单
        Summary: 租赁订单创建
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseOrderResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.order.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_order_ex_async(
        self,
        request: twc_models.CreateLeaseOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseOrderResponse:
        """
        Description: 创建租赁订单
        Summary: 租赁订单创建
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseOrderResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.order.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_notarization_bill(
        self,
        request: twc_models.CreateNotarizationBillRequest,
    ) -> twc_models.CreateNotarizationBillResponse:
        """
        Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
        Summary: 公证场景创建收费订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_notarization_bill_ex(request, headers, runtime)

    async def create_notarization_bill_async(
        self,
        request: twc_models.CreateNotarizationBillRequest,
    ) -> twc_models.CreateNotarizationBillResponse:
        """
        Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
        Summary: 公证场景创建收费订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_notarization_bill_ex_async(request, headers, runtime)

    def create_notarization_bill_ex(
        self,
        request: twc_models.CreateNotarizationBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateNotarizationBillResponse:
        """
        Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
        Summary: 公证场景创建收费订单
        """
        UtilClient.validate_model(request)
        return twc_models.CreateNotarizationBillResponse().from_map(
            self.do_request('1.0', 'twc.notary.notarization.bill.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_notarization_bill_ex_async(
        self,
        request: twc_models.CreateNotarizationBillRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateNotarizationBillResponse:
        """
        Description: 电子公证或存证证明场景中，用户通过回传相关信息创建收费订单。
        Summary: 公证场景创建收费订单
        """
        UtilClient.validate_model(request)
        return twc_models.CreateNotarizationBillResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.notarization.bill.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_certification(
        self,
        request: twc_models.InitCertificationRequest,
    ) -> twc_models.InitCertificationResponse:
        """
        Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
        Summary: 初始化存证证明订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_certification_ex(request, headers, runtime)

    async def init_certification_async(
        self,
        request: twc_models.InitCertificationRequest,
    ) -> twc_models.InitCertificationResponse:
        """
        Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
        Summary: 初始化存证证明订单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_certification_ex_async(request, headers, runtime)

    def init_certification_ex(
        self,
        request: twc_models.InitCertificationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.InitCertificationResponse:
        """
        Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
        Summary: 初始化存证证明订单
        """
        UtilClient.validate_model(request)
        return twc_models.InitCertificationResponse().from_map(
            self.do_request('1.0', 'twc.notary.certification.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_certification_ex_async(
        self,
        request: twc_models.InitCertificationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.InitCertificationResponse:
        """
        Description: 提供必要的存证信息，初始化一个存证证明的订单，提交公证处审核，并返回订单号
        Summary: 初始化存证证明订单
        """
        UtilClient.validate_model(request)
        return twc_models.InitCertificationResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.certification.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_certification(
        self,
        request: twc_models.QueryCertificationRequest,
    ) -> twc_models.QueryCertificationResponse:
        """
        Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
        Summary: 查询存证证明申请状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_certification_ex(request, headers, runtime)

    async def query_certification_async(
        self,
        request: twc_models.QueryCertificationRequest,
    ) -> twc_models.QueryCertificationResponse:
        """
        Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
        Summary: 查询存证证明申请状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_certification_ex_async(request, headers, runtime)

    def query_certification_ex(
        self,
        request: twc_models.QueryCertificationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryCertificationResponse:
        """
        Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
        Summary: 查询存证证明申请状态
        """
        UtilClient.validate_model(request)
        return twc_models.QueryCertificationResponse().from_map(
            self.do_request('1.0', 'twc.notary.certification.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_certification_ex_async(
        self,
        request: twc_models.QueryCertificationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryCertificationResponse:
        """
        Description: 输入申请ID，查询存证证明申请状态，成功后返回下载地址等信息
        Summary: 查询存证证明申请状态
        """
        UtilClient.validate_model(request)
        return twc_models.QueryCertificationResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.certification.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_tsr_certificate(
        self,
        request: twc_models.GetTsrCertificateRequest,
    ) -> twc_models.GetTsrCertificateResponse:
        """
        Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
        Summary: 可信时间凭证服务 - 获取时间凭证证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_tsr_certificate_ex(request, headers, runtime)

    async def get_tsr_certificate_async(
        self,
        request: twc_models.GetTsrCertificateRequest,
    ) -> twc_models.GetTsrCertificateResponse:
        """
        Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
        Summary: 可信时间凭证服务 - 获取时间凭证证书
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_tsr_certificate_ex_async(request, headers, runtime)

    def get_tsr_certificate_ex(
        self,
        request: twc_models.GetTsrCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetTsrCertificateResponse:
        """
        Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
        Summary: 可信时间凭证服务 - 获取时间凭证证书
        """
        UtilClient.validate_model(request)
        return twc_models.GetTsrCertificateResponse().from_map(
            self.do_request('1.0', 'twc.notary.tsr.certificate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_tsr_certificate_ex_async(
        self,
        request: twc_models.GetTsrCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetTsrCertificateResponse:
        """
        Description: 可以根据存证过程中获得当可信时间戳凭证，获取国家授时中心颁发的PDF格式可信时间证书
        Summary: 可信时间凭证服务 - 获取时间凭证证书
        """
        UtilClient.validate_model(request)
        return twc_models.GetTsrCertificateResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.tsr.certificate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_jointconstraint_record(
        self,
        request: twc_models.SaveJointconstraintRecordRequest,
    ) -> twc_models.SaveJointconstraintRecordResponse:
        """
        Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
        Summary: 联合执行履行记录新增/修改接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_jointconstraint_record_ex(request, headers, runtime)

    async def save_jointconstraint_record_async(
        self,
        request: twc_models.SaveJointconstraintRecordRequest,
    ) -> twc_models.SaveJointconstraintRecordResponse:
        """
        Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
        Summary: 联合执行履行记录新增/修改接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_jointconstraint_record_ex_async(request, headers, runtime)

    def save_jointconstraint_record_ex(
        self,
        request: twc_models.SaveJointconstraintRecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SaveJointconstraintRecordResponse:
        """
        Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
        Summary: 联合执行履行记录新增/修改接口
        """
        UtilClient.validate_model(request)
        return twc_models.SaveJointconstraintRecordResponse().from_map(
            self.do_request('1.0', 'twc.notary.jointconstraint.record.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_jointconstraint_record_ex_async(
        self,
        request: twc_models.SaveJointconstraintRecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SaveJointconstraintRecordResponse:
        """
        Description: 新增/修改履行记录，依据contractCode与contractFulfillmentCode判断唯一性
        Summary: 联合执行履行记录新增/修改接口
        """
        UtilClient.validate_model(request)
        return twc_models.SaveJointconstraintRecordResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.jointconstraint.record.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_jointconstraint_record(
        self,
        request: twc_models.DeleteJointconstraintRecordRequest,
    ) -> twc_models.DeleteJointconstraintRecordResponse:
        """
        Description: 删除履行记录
        Summary: 履行记录删除接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_jointconstraint_record_ex(request, headers, runtime)

    async def delete_jointconstraint_record_async(
        self,
        request: twc_models.DeleteJointconstraintRecordRequest,
    ) -> twc_models.DeleteJointconstraintRecordResponse:
        """
        Description: 删除履行记录
        Summary: 履行记录删除接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_jointconstraint_record_ex_async(request, headers, runtime)

    def delete_jointconstraint_record_ex(
        self,
        request: twc_models.DeleteJointconstraintRecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DeleteJointconstraintRecordResponse:
        """
        Description: 删除履行记录
        Summary: 履行记录删除接口
        """
        UtilClient.validate_model(request)
        return twc_models.DeleteJointconstraintRecordResponse().from_map(
            self.do_request('1.0', 'twc.notary.jointconstraint.record.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_jointconstraint_record_ex_async(
        self,
        request: twc_models.DeleteJointconstraintRecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DeleteJointconstraintRecordResponse:
        """
        Description: 删除履行记录
        Summary: 履行记录删除接口
        """
        UtilClient.validate_model(request)
        return twc_models.DeleteJointconstraintRecordResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.jointconstraint.record.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_jointconstraint_breachrecord(
        self,
        request: twc_models.QueryJointconstraintBreachrecordRequest,
    ) -> twc_models.QueryJointconstraintBreachrecordResponse:
        """
        Description: 查询违约记录
        Summary: 违约记录查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_jointconstraint_breachrecord_ex(request, headers, runtime)

    async def query_jointconstraint_breachrecord_async(
        self,
        request: twc_models.QueryJointconstraintBreachrecordRequest,
    ) -> twc_models.QueryJointconstraintBreachrecordResponse:
        """
        Description: 查询违约记录
        Summary: 违约记录查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_jointconstraint_breachrecord_ex_async(request, headers, runtime)

    def query_jointconstraint_breachrecord_ex(
        self,
        request: twc_models.QueryJointconstraintBreachrecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryJointconstraintBreachrecordResponse:
        """
        Description: 查询违约记录
        Summary: 违约记录查询接口
        """
        UtilClient.validate_model(request)
        return twc_models.QueryJointconstraintBreachrecordResponse().from_map(
            self.do_request('1.0', 'twc.notary.jointconstraint.breachrecord.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_jointconstraint_breachrecord_ex_async(
        self,
        request: twc_models.QueryJointconstraintBreachrecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryJointconstraintBreachrecordResponse:
        """
        Description: 查询违约记录
        Summary: 违约记录查询接口
        """
        UtilClient.validate_model(request)
        return twc_models.QueryJointconstraintBreachrecordResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.jointconstraint.breachrecord.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_justice_mediation(
        self,
        request: twc_models.ApplyJusticeMediationRequest,
    ) -> twc_models.ApplyJusticeMediationResponse:
        """
        Description: 提供给第三方调解申请提交
        Summary: 调解申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_justice_mediation_ex(request, headers, runtime)

    async def apply_justice_mediation_async(
        self,
        request: twc_models.ApplyJusticeMediationRequest,
    ) -> twc_models.ApplyJusticeMediationResponse:
        """
        Description: 提供给第三方调解申请提交
        Summary: 调解申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_justice_mediation_ex_async(request, headers, runtime)

    def apply_justice_mediation_ex(
        self,
        request: twc_models.ApplyJusticeMediationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyJusticeMediationResponse:
        """
        Description: 提供给第三方调解申请提交
        Summary: 调解申请
        """
        UtilClient.validate_model(request)
        return twc_models.ApplyJusticeMediationResponse().from_map(
            self.do_request('1.0', 'twc.notary.justice.mediation.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_justice_mediation_ex_async(
        self,
        request: twc_models.ApplyJusticeMediationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyJusticeMediationResponse:
        """
        Description: 提供给第三方调解申请提交
        Summary: 调解申请
        """
        UtilClient.validate_model(request)
        return twc_models.ApplyJusticeMediationResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.justice.mediation.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_justice_mediation(
        self,
        request: twc_models.QueryJusticeMediationRequest,
    ) -> twc_models.QueryJusticeMediationResponse:
        """
        Description: 调解申请进度查询
        Summary: 调解申请进度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_justice_mediation_ex(request, headers, runtime)

    async def query_justice_mediation_async(
        self,
        request: twc_models.QueryJusticeMediationRequest,
    ) -> twc_models.QueryJusticeMediationResponse:
        """
        Description: 调解申请进度查询
        Summary: 调解申请进度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_justice_mediation_ex_async(request, headers, runtime)

    def query_justice_mediation_ex(
        self,
        request: twc_models.QueryJusticeMediationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryJusticeMediationResponse:
        """
        Description: 调解申请进度查询
        Summary: 调解申请进度查询
        """
        UtilClient.validate_model(request)
        return twc_models.QueryJusticeMediationResponse().from_map(
            self.do_request('1.0', 'twc.notary.justice.mediation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_justice_mediation_ex_async(
        self,
        request: twc_models.QueryJusticeMediationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryJusticeMediationResponse:
        """
        Description: 调解申请进度查询
        Summary: 调解申请进度查询
        """
        UtilClient.validate_model(request)
        return twc_models.QueryJusticeMediationResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.justice.mediation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_justice_caseinfo(
        self,
        request: twc_models.QueryJusticeCaseinfoRequest,
    ) -> twc_models.QueryJusticeCaseinfoResponse:
        """
        Description: 汇裁证据要素查询接口
        Summary: 汇裁证据要素查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_justice_caseinfo_ex(request, headers, runtime)

    async def query_justice_caseinfo_async(
        self,
        request: twc_models.QueryJusticeCaseinfoRequest,
    ) -> twc_models.QueryJusticeCaseinfoResponse:
        """
        Description: 汇裁证据要素查询接口
        Summary: 汇裁证据要素查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_justice_caseinfo_ex_async(request, headers, runtime)

    def query_justice_caseinfo_ex(
        self,
        request: twc_models.QueryJusticeCaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryJusticeCaseinfoResponse:
        """
        Description: 汇裁证据要素查询接口
        Summary: 汇裁证据要素查询接口
        """
        UtilClient.validate_model(request)
        return twc_models.QueryJusticeCaseinfoResponse().from_map(
            self.do_request('1.0', 'twc.notary.justice.caseinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_justice_caseinfo_ex_async(
        self,
        request: twc_models.QueryJusticeCaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryJusticeCaseinfoResponse:
        """
        Description: 汇裁证据要素查询接口
        Summary: 汇裁证据要素查询接口
        """
        UtilClient.validate_model(request)
        return twc_models.QueryJusticeCaseinfoResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.justice.caseinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_justice_uploadfilepath(
        self,
        request: twc_models.GetJusticeUploadfilepathRequest,
    ) -> twc_models.GetJusticeUploadfilepathResponse:
        """
        Description: 获取oss文件上传路径，返回业务方oss文件上传链接和fileKey
        Summary: 获取OSS文件上传路径
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_justice_uploadfilepath_ex(request, headers, runtime)

    async def get_justice_uploadfilepath_async(
        self,
        request: twc_models.GetJusticeUploadfilepathRequest,
    ) -> twc_models.GetJusticeUploadfilepathResponse:
        """
        Description: 获取oss文件上传路径，返回业务方oss文件上传链接和fileKey
        Summary: 获取OSS文件上传路径
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_justice_uploadfilepath_ex_async(request, headers, runtime)

    def get_justice_uploadfilepath_ex(
        self,
        request: twc_models.GetJusticeUploadfilepathRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetJusticeUploadfilepathResponse:
        """
        Description: 获取oss文件上传路径，返回业务方oss文件上传链接和fileKey
        Summary: 获取OSS文件上传路径
        """
        UtilClient.validate_model(request)
        return twc_models.GetJusticeUploadfilepathResponse().from_map(
            self.do_request('1.0', 'twc.notary.justice.uploadfilepath.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_justice_uploadfilepath_ex_async(
        self,
        request: twc_models.GetJusticeUploadfilepathRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetJusticeUploadfilepathResponse:
        """
        Description: 获取oss文件上传路径，返回业务方oss文件上传链接和fileKey
        Summary: 获取OSS文件上传路径
        """
        UtilClient.validate_model(request)
        return twc_models.GetJusticeUploadfilepathResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.justice.uploadfilepath.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_justice_casewriteback(
        self,
        request: twc_models.CreateJusticeCasewritebackRequest,
    ) -> twc_models.CreateJusticeCasewritebackResponse:
        """
        Description: 纠纷处理平台提供回调接口供业务平台自动插入案件模型中，业务方需要调用回写接口创建案件。
        Summary: 自动进件案件回写
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_justice_casewriteback_ex(request, headers, runtime)

    async def create_justice_casewriteback_async(
        self,
        request: twc_models.CreateJusticeCasewritebackRequest,
    ) -> twc_models.CreateJusticeCasewritebackResponse:
        """
        Description: 纠纷处理平台提供回调接口供业务平台自动插入案件模型中，业务方需要调用回写接口创建案件。
        Summary: 自动进件案件回写
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_justice_casewriteback_ex_async(request, headers, runtime)

    def create_justice_casewriteback_ex(
        self,
        request: twc_models.CreateJusticeCasewritebackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateJusticeCasewritebackResponse:
        """
        Description: 纠纷处理平台提供回调接口供业务平台自动插入案件模型中，业务方需要调用回写接口创建案件。
        Summary: 自动进件案件回写
        """
        UtilClient.validate_model(request)
        return twc_models.CreateJusticeCasewritebackResponse().from_map(
            self.do_request('1.0', 'twc.notary.justice.casewriteback.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_justice_casewriteback_ex_async(
        self,
        request: twc_models.CreateJusticeCasewritebackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateJusticeCasewritebackResponse:
        """
        Description: 纠纷处理平台提供回调接口供业务平台自动插入案件模型中，业务方需要调用回写接口创建案件。
        Summary: 自动进件案件回写
        """
        UtilClient.validate_model(request)
        return twc_models.CreateJusticeCasewritebackResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.justice.casewriteback.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_assetagentregister(
        self,
        request: twc_models.CreateLeaseAssetagentregisterRequest,
    ) -> twc_models.CreateLeaseAssetagentregisterResponse:
        """
        Description: 租赁平台isv模式代理商户入驻
        Summary: 租赁平台isv模式代理商户入驻
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_assetagentregister_ex(request, headers, runtime)

    async def create_lease_assetagentregister_async(
        self,
        request: twc_models.CreateLeaseAssetagentregisterRequest,
    ) -> twc_models.CreateLeaseAssetagentregisterResponse:
        """
        Description: 租赁平台isv模式代理商户入驻
        Summary: 租赁平台isv模式代理商户入驻
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_assetagentregister_ex_async(request, headers, runtime)

    def create_lease_assetagentregister_ex(
        self,
        request: twc_models.CreateLeaseAssetagentregisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseAssetagentregisterResponse:
        """
        Description: 租赁平台isv模式代理商户入驻
        Summary: 租赁平台isv模式代理商户入驻
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseAssetagentregisterResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.assetagentregister.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_assetagentregister_ex_async(
        self,
        request: twc_models.CreateLeaseAssetagentregisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseAssetagentregisterResponse:
        """
        Description: 租赁平台isv模式代理商户入驻
        Summary: 租赁平台isv模式代理商户入驻
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseAssetagentregisterResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.assetagentregister.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_productinfo(
        self,
        request: twc_models.QueryLeaseProductinfoRequest,
    ) -> twc_models.QueryLeaseProductinfoResponse:
        """
        Description: 融资租赁商品信息查询接口
        Summary: 融资租赁商品信息查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_productinfo_ex(request, headers, runtime)

    async def query_lease_productinfo_async(
        self,
        request: twc_models.QueryLeaseProductinfoRequest,
    ) -> twc_models.QueryLeaseProductinfoResponse:
        """
        Description: 融资租赁商品信息查询接口
        Summary: 融资租赁商品信息查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_productinfo_ex_async(request, headers, runtime)

    def query_lease_productinfo_ex(
        self,
        request: twc_models.QueryLeaseProductinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseProductinfoResponse:
        """
        Description: 融资租赁商品信息查询接口
        Summary: 融资租赁商品信息查询接口
        """
        UtilClient.validate_model(request)
        return twc_models.QueryLeaseProductinfoResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.productinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_productinfo_ex_async(
        self,
        request: twc_models.QueryLeaseProductinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseProductinfoResponse:
        """
        Description: 融资租赁商品信息查询接口
        Summary: 融资租赁商品信息查询接口
        """
        UtilClient.validate_model(request)
        return twc_models.QueryLeaseProductinfoResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.productinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_witness_flow(
        self,
        request: twc_models.CreateWitnessFlowRequest,
    ) -> twc_models.CreateWitnessFlowResponse:
        """
        Description: 创建签署见证流程
        Summary: 创建见证流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_witness_flow_ex(request, headers, runtime)

    async def create_witness_flow_async(
        self,
        request: twc_models.CreateWitnessFlowRequest,
    ) -> twc_models.CreateWitnessFlowResponse:
        """
        Description: 创建签署见证流程
        Summary: 创建见证流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_witness_flow_ex_async(request, headers, runtime)

    def create_witness_flow_ex(
        self,
        request: twc_models.CreateWitnessFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateWitnessFlowResponse:
        """
        Description: 创建签署见证流程
        Summary: 创建见证流程
        """
        UtilClient.validate_model(request)
        return twc_models.CreateWitnessFlowResponse().from_map(
            self.do_request('1.0', 'twc.notary.witness.flow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_witness_flow_ex_async(
        self,
        request: twc_models.CreateWitnessFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateWitnessFlowResponse:
        """
        Description: 创建签署见证流程
        Summary: 创建见证流程
        """
        UtilClient.validate_model(request)
        return twc_models.CreateWitnessFlowResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.witness.flow.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_witness_snapshot(
        self,
        request: twc_models.SaveWitnessSnapshotRequest,
    ) -> twc_models.SaveWitnessSnapshotResponse:
        """
        Description: 保存见证流程快照数据
        Summary: 保存见证流程快照数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_witness_snapshot_ex(request, headers, runtime)

    async def save_witness_snapshot_async(
        self,
        request: twc_models.SaveWitnessSnapshotRequest,
    ) -> twc_models.SaveWitnessSnapshotResponse:
        """
        Description: 保存见证流程快照数据
        Summary: 保存见证流程快照数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_witness_snapshot_ex_async(request, headers, runtime)

    def save_witness_snapshot_ex(
        self,
        request: twc_models.SaveWitnessSnapshotRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SaveWitnessSnapshotResponse:
        """
        Description: 保存见证流程快照数据
        Summary: 保存见证流程快照数据
        """
        UtilClient.validate_model(request)
        return twc_models.SaveWitnessSnapshotResponse().from_map(
            self.do_request('1.0', 'twc.notary.witness.snapshot.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_witness_snapshot_ex_async(
        self,
        request: twc_models.SaveWitnessSnapshotRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SaveWitnessSnapshotResponse:
        """
        Description: 保存见证流程快照数据
        Summary: 保存见证流程快照数据
        """
        UtilClient.validate_model(request)
        return twc_models.SaveWitnessSnapshotResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.witness.snapshot.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_witness_signaccess(
        self,
        request: twc_models.CheckWitnessSignaccessRequest,
    ) -> twc_models.CheckWitnessSignaccessResponse:
        """
        Description: 见证流程签署权限校验
        Summary: 见证流程签署权限校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_witness_signaccess_ex(request, headers, runtime)

    async def check_witness_signaccess_async(
        self,
        request: twc_models.CheckWitnessSignaccessRequest,
    ) -> twc_models.CheckWitnessSignaccessResponse:
        """
        Description: 见证流程签署权限校验
        Summary: 见证流程签署权限校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_witness_signaccess_ex_async(request, headers, runtime)

    def check_witness_signaccess_ex(
        self,
        request: twc_models.CheckWitnessSignaccessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckWitnessSignaccessResponse:
        """
        Description: 见证流程签署权限校验
        Summary: 见证流程签署权限校验
        """
        UtilClient.validate_model(request)
        return twc_models.CheckWitnessSignaccessResponse().from_map(
            self.do_request('1.0', 'twc.notary.witness.signaccess.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_witness_signaccess_ex_async(
        self,
        request: twc_models.CheckWitnessSignaccessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckWitnessSignaccessResponse:
        """
        Description: 见证流程签署权限校验
        Summary: 见证流程签署权限校验
        """
        UtilClient.validate_model(request)
        return twc_models.CheckWitnessSignaccessResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.witness.signaccess.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_witness_flow(
        self,
        request: twc_models.AuthWitnessFlowRequest,
    ) -> twc_models.AuthWitnessFlowResponse:
        """
        Description: 见证流程签署
        Summary: 见证流程签署
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_witness_flow_ex(request, headers, runtime)

    async def auth_witness_flow_async(
        self,
        request: twc_models.AuthWitnessFlowRequest,
    ) -> twc_models.AuthWitnessFlowResponse:
        """
        Description: 见证流程签署
        Summary: 见证流程签署
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_witness_flow_ex_async(request, headers, runtime)

    def auth_witness_flow_ex(
        self,
        request: twc_models.AuthWitnessFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.AuthWitnessFlowResponse:
        """
        Description: 见证流程签署
        Summary: 见证流程签署
        """
        UtilClient.validate_model(request)
        return twc_models.AuthWitnessFlowResponse().from_map(
            self.do_request('1.0', 'twc.notary.witness.flow.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_witness_flow_ex_async(
        self,
        request: twc_models.AuthWitnessFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.AuthWitnessFlowResponse:
        """
        Description: 见证流程签署
        Summary: 见证流程签署
        """
        UtilClient.validate_model(request)
        return twc_models.AuthWitnessFlowResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.witness.flow.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_witness_flow(
        self,
        request: twc_models.ConfirmWitnessFlowRequest,
    ) -> twc_models.ConfirmWitnessFlowResponse:
        """
        Description: 见证流程签署确认
        Summary: 见证流程签署确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_witness_flow_ex(request, headers, runtime)

    async def confirm_witness_flow_async(
        self,
        request: twc_models.ConfirmWitnessFlowRequest,
    ) -> twc_models.ConfirmWitnessFlowResponse:
        """
        Description: 见证流程签署确认
        Summary: 见证流程签署确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_witness_flow_ex_async(request, headers, runtime)

    def confirm_witness_flow_ex(
        self,
        request: twc_models.ConfirmWitnessFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ConfirmWitnessFlowResponse:
        """
        Description: 见证流程签署确认
        Summary: 见证流程签署确认
        """
        UtilClient.validate_model(request)
        return twc_models.ConfirmWitnessFlowResponse().from_map(
            self.do_request('1.0', 'twc.notary.witness.flow.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_witness_flow_ex_async(
        self,
        request: twc_models.ConfirmWitnessFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ConfirmWitnessFlowResponse:
        """
        Description: 见证流程签署确认
        Summary: 见证流程签署确认
        """
        UtilClient.validate_model(request)
        return twc_models.ConfirmWitnessFlowResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.witness.flow.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_trans(
        self,
        request: twc_models.CreateTransRequest,
    ) -> twc_models.CreateTransResponse:
        """
        Description: 获取存证事务ID
        Summary: 获取存证事务ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_trans_ex(request, headers, runtime)

    async def create_trans_async(
        self,
        request: twc_models.CreateTransRequest,
    ) -> twc_models.CreateTransResponse:
        """
        Description: 获取存证事务ID
        Summary: 获取存证事务ID
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_trans_ex_async(request, headers, runtime)

    def create_trans_ex(
        self,
        request: twc_models.CreateTransRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateTransResponse:
        """
        Description: 获取存证事务ID
        Summary: 获取存证事务ID
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTransResponse().from_map(
            self.do_request('1.0', 'twc.notary.trans.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_trans_ex_async(
        self,
        request: twc_models.CreateTransRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateTransResponse:
        """
        Description: 获取存证事务ID
        Summary: 获取存证事务ID
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTransResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.trans.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_trans(
        self,
        request: twc_models.GetTransRequest,
    ) -> twc_models.GetTransResponse:
        """
        Description: 通过存证事务Token，获取事务中所有的存证信息
        Summary: 获取事务中所有的存证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_trans_ex(request, headers, runtime)

    async def get_trans_async(
        self,
        request: twc_models.GetTransRequest,
    ) -> twc_models.GetTransResponse:
        """
        Description: 通过存证事务Token，获取事务中所有的存证信息
        Summary: 获取事务中所有的存证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_trans_ex_async(request, headers, runtime)

    def get_trans_ex(
        self,
        request: twc_models.GetTransRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetTransResponse:
        """
        Description: 通过存证事务Token，获取事务中所有的存证信息
        Summary: 获取事务中所有的存证信息
        """
        UtilClient.validate_model(request)
        return twc_models.GetTransResponse().from_map(
            self.do_request('1.0', 'twc.notary.trans.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_trans_ex_async(
        self,
        request: twc_models.GetTransRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetTransResponse:
        """
        Description: 通过存证事务Token，获取事务中所有的存证信息
        Summary: 获取事务中所有的存证信息
        """
        UtilClient.validate_model(request)
        return twc_models.GetTransResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.trans.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_text(
        self,
        request: twc_models.CreateTextRequest,
    ) -> twc_models.CreateTextResponse:
        """
        Description: 发起文本存证，将文本内容存证上链
        Summary: 文本存证，将文本内容存证上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_text_ex(request, headers, runtime)

    async def create_text_async(
        self,
        request: twc_models.CreateTextRequest,
    ) -> twc_models.CreateTextResponse:
        """
        Description: 发起文本存证，将文本内容存证上链
        Summary: 文本存证，将文本内容存证上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_text_ex_async(request, headers, runtime)

    def create_text_ex(
        self,
        request: twc_models.CreateTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateTextResponse:
        """
        Description: 发起文本存证，将文本内容存证上链
        Summary: 文本存证，将文本内容存证上链
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTextResponse().from_map(
            self.do_request('1.0', 'twc.notary.text.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_text_ex_async(
        self,
        request: twc_models.CreateTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateTextResponse:
        """
        Description: 发起文本存证，将文本内容存证上链
        Summary: 文本存证，将文本内容存证上链
        """
        UtilClient.validate_model(request)
        return twc_models.CreateTextResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.text.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_text(
        self,
        request: twc_models.GetTextRequest,
    ) -> twc_models.GetTextResponse:
        """
        Description: 用户通过交易哈希获取自己上传的文本存证内容
        Summary: 获取文本存证内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_text_ex(request, headers, runtime)

    async def get_text_async(
        self,
        request: twc_models.GetTextRequest,
    ) -> twc_models.GetTextResponse:
        """
        Description: 用户通过交易哈希获取自己上传的文本存证内容
        Summary: 获取文本存证内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_text_ex_async(request, headers, runtime)

    def get_text_ex(
        self,
        request: twc_models.GetTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetTextResponse:
        """
        Description: 用户通过交易哈希获取自己上传的文本存证内容
        Summary: 获取文本存证内容
        """
        UtilClient.validate_model(request)
        return twc_models.GetTextResponse().from_map(
            self.do_request('1.0', 'twc.notary.text.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_text_ex_async(
        self,
        request: twc_models.GetTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetTextResponse:
        """
        Description: 用户通过交易哈希获取自己上传的文本存证内容
        Summary: 获取文本存证内容
        """
        UtilClient.validate_model(request)
        return twc_models.GetTextResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.text.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_file(
        self,
        request: twc_models.CreateFileRequest,
    ) -> twc_models.CreateFileResponse:
        """
        Description: 发起文件存证，将文件内容存证上链
        Summary: 文件内容存证上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_file_ex(request, headers, runtime)

    async def create_file_async(
        self,
        request: twc_models.CreateFileRequest,
    ) -> twc_models.CreateFileResponse:
        """
        Description: 发起文件存证，将文件内容存证上链
        Summary: 文件内容存证上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_file_ex_async(request, headers, runtime)

    def create_file_ex(
        self,
        request: twc_models.CreateFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateFileResponse:
        """
        Description: 发起文件存证，将文件内容存证上链
        Summary: 文件内容存证上链
        """
        UtilClient.validate_model(request)
        return twc_models.CreateFileResponse().from_map(
            self.do_request('1.0', 'twc.notary.file.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_file_ex_async(
        self,
        request: twc_models.CreateFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateFileResponse:
        """
        Description: 发起文件存证，将文件内容存证上链
        Summary: 文件内容存证上链
        """
        UtilClient.validate_model(request)
        return twc_models.CreateFileResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.file.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_file(
        self,
        request: twc_models.GetFileRequest,
    ) -> twc_models.GetFileResponse:
        """
        Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
        Summary: 获取文件存证oss下载地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_file_ex(request, headers, runtime)

    async def get_file_async(
        self,
        request: twc_models.GetFileRequest,
    ) -> twc_models.GetFileResponse:
        """
        Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
        Summary: 获取文件存证oss下载地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_file_ex_async(request, headers, runtime)

    def get_file_ex(
        self,
        request: twc_models.GetFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetFileResponse:
        """
        Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
        Summary: 获取文件存证oss下载地址
        """
        UtilClient.validate_model(request)
        return twc_models.GetFileResponse().from_map(
            self.do_request('1.0', 'twc.notary.file.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_file_ex_async(
        self,
        request: twc_models.GetFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetFileResponse:
        """
        Description: 用户通过交易哈希获取自己上传的文件存证oss下载地址
        Summary: 获取文件存证oss下载地址
        """
        UtilClient.validate_model(request)
        return twc_models.GetFileResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.file.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_source(
        self,
        request: twc_models.CreateSourceRequest,
    ) -> twc_models.CreateSourceResponse:
        """
        Description: 发起原文存证，将原文内容存证上链
        Summary: 原文内容存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_source_ex(request, headers, runtime)

    async def create_source_async(
        self,
        request: twc_models.CreateSourceRequest,
    ) -> twc_models.CreateSourceResponse:
        """
        Description: 发起原文存证，将原文内容存证上链
        Summary: 原文内容存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_source_ex_async(request, headers, runtime)

    def create_source_ex(
        self,
        request: twc_models.CreateSourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateSourceResponse:
        """
        Description: 发起原文存证，将原文内容存证上链
        Summary: 原文内容存证
        """
        UtilClient.validate_model(request)
        return twc_models.CreateSourceResponse().from_map(
            self.do_request('1.0', 'twc.notary.source.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_source_ex_async(
        self,
        request: twc_models.CreateSourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateSourceResponse:
        """
        Description: 发起原文存证，将原文内容存证上链
        Summary: 原文内容存证
        """
        UtilClient.validate_model(request)
        return twc_models.CreateSourceResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.source.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_source(
        self,
        request: twc_models.GetSourceRequest,
    ) -> twc_models.GetSourceResponse:
        """
        Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
        Summary: 获取原文存证oss下载地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_source_ex(request, headers, runtime)

    async def get_source_async(
        self,
        request: twc_models.GetSourceRequest,
    ) -> twc_models.GetSourceResponse:
        """
        Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
        Summary: 获取原文存证oss下载地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_source_ex_async(request, headers, runtime)

    def get_source_ex(
        self,
        request: twc_models.GetSourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetSourceResponse:
        """
        Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
        Summary: 获取原文存证oss下载地址
        """
        UtilClient.validate_model(request)
        return twc_models.GetSourceResponse().from_map(
            self.do_request('1.0', 'twc.notary.source.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_source_ex_async(
        self,
        request: twc_models.GetSourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetSourceResponse:
        """
        Description: 用户通过交易哈希获取自己上传的原文存证oss下载地址
        Summary: 获取原文存证oss下载地址
        """
        UtilClient.validate_model(request)
        return twc_models.GetSourceResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.source.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_status(
        self,
        request: twc_models.CheckStatusRequest,
    ) -> twc_models.CheckStatusResponse:
        """
        Description: 创建存证后，使用存证凭据核验存证状态。
        Summary: 存证内容核验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_status_ex(request, headers, runtime)

    async def check_status_async(
        self,
        request: twc_models.CheckStatusRequest,
    ) -> twc_models.CheckStatusResponse:
        """
        Description: 创建存证后，使用存证凭据核验存证状态。
        Summary: 存证内容核验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_status_ex_async(request, headers, runtime)

    def check_status_ex(
        self,
        request: twc_models.CheckStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckStatusResponse:
        """
        Description: 创建存证后，使用存证凭据核验存证状态。
        Summary: 存证内容核验
        """
        UtilClient.validate_model(request)
        return twc_models.CheckStatusResponse().from_map(
            self.do_request('1.0', 'twc.notary.status.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_status_ex_async(
        self,
        request: twc_models.CheckStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckStatusResponse:
        """
        Description: 创建存证后，使用存证凭据核验存证状态。
        Summary: 存证内容核验
        """
        UtilClient.validate_model(request)
        return twc_models.CheckStatusResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.status.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def deploy_lease_contract(
        self,
        request: twc_models.DeployLeaseContractRequest,
    ) -> twc_models.DeployLeaseContractResponse:
        """
        Description: 融资服务平台部署合约
        Summary: 融资服务平台部署合约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.deploy_lease_contract_ex(request, headers, runtime)

    async def deploy_lease_contract_async(
        self,
        request: twc_models.DeployLeaseContractRequest,
    ) -> twc_models.DeployLeaseContractResponse:
        """
        Description: 融资服务平台部署合约
        Summary: 融资服务平台部署合约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.deploy_lease_contract_ex_async(request, headers, runtime)

    def deploy_lease_contract_ex(
        self,
        request: twc_models.DeployLeaseContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DeployLeaseContractResponse:
        """
        Description: 融资服务平台部署合约
        Summary: 融资服务平台部署合约
        """
        UtilClient.validate_model(request)
        return twc_models.DeployLeaseContractResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.contract.deploy', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def deploy_lease_contract_ex_async(
        self,
        request: twc_models.DeployLeaseContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DeployLeaseContractResponse:
        """
        Description: 融资服务平台部署合约
        Summary: 融资服务平台部署合约
        """
        UtilClient.validate_model(request)
        return twc_models.DeployLeaseContractResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.contract.deploy', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_productinfo(
        self,
        request: twc_models.CreateLeaseProductinfoRequest,
    ) -> twc_models.CreateLeaseProductinfoResponse:
        """
        Description: 融资服务平台上传商品类别信息
        Summary: 融资服务平台上传商品类别信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_productinfo_ex(request, headers, runtime)

    async def create_lease_productinfo_async(
        self,
        request: twc_models.CreateLeaseProductinfoRequest,
    ) -> twc_models.CreateLeaseProductinfoResponse:
        """
        Description: 融资服务平台上传商品类别信息
        Summary: 融资服务平台上传商品类别信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_productinfo_ex_async(request, headers, runtime)

    def create_lease_productinfo_ex(
        self,
        request: twc_models.CreateLeaseProductinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseProductinfoResponse:
        """
        Description: 融资服务平台上传商品类别信息
        Summary: 融资服务平台上传商品类别信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseProductinfoResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.productinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_productinfo_ex_async(
        self,
        request: twc_models.CreateLeaseProductinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseProductinfoResponse:
        """
        Description: 融资服务平台上传商品类别信息
        Summary: 融资服务平台上传商品类别信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseProductinfoResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.productinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_lease_contract(
        self,
        request: twc_models.AuthLeaseContractRequest,
    ) -> twc_models.AuthLeaseContractResponse:
        """
        Description: 租赁服务平台授权融资服务平台
        Summary: 租赁服务平台授权融资服务平台
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_lease_contract_ex(request, headers, runtime)

    async def auth_lease_contract_async(
        self,
        request: twc_models.AuthLeaseContractRequest,
    ) -> twc_models.AuthLeaseContractResponse:
        """
        Description: 租赁服务平台授权融资服务平台
        Summary: 租赁服务平台授权融资服务平台
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_lease_contract_ex_async(request, headers, runtime)

    def auth_lease_contract_ex(
        self,
        request: twc_models.AuthLeaseContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.AuthLeaseContractResponse:
        """
        Description: 租赁服务平台授权融资服务平台
        Summary: 租赁服务平台授权融资服务平台
        """
        UtilClient.validate_model(request)
        return twc_models.AuthLeaseContractResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.contract.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_lease_contract_ex_async(
        self,
        request: twc_models.AuthLeaseContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.AuthLeaseContractResponse:
        """
        Description: 租赁服务平台授权融资服务平台
        Summary: 租赁服务平台授权融资服务平台
        """
        UtilClient.validate_model(request)
        return twc_models.AuthLeaseContractResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.contract.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_userinfo(
        self,
        request: twc_models.CreateLeaseUserinfoRequest,
    ) -> twc_models.CreateLeaseUserinfoResponse:
        """
        Description: 租赁服务平台上传用户信息
        Summary: 租赁服务平台上传用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_userinfo_ex(request, headers, runtime)

    async def create_lease_userinfo_async(
        self,
        request: twc_models.CreateLeaseUserinfoRequest,
    ) -> twc_models.CreateLeaseUserinfoResponse:
        """
        Description: 租赁服务平台上传用户信息
        Summary: 租赁服务平台上传用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_userinfo_ex_async(request, headers, runtime)

    def create_lease_userinfo_ex(
        self,
        request: twc_models.CreateLeaseUserinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseUserinfoResponse:
        """
        Description: 租赁服务平台上传用户信息
        Summary: 租赁服务平台上传用户信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseUserinfoResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.userinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_userinfo_ex_async(
        self,
        request: twc_models.CreateLeaseUserinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseUserinfoResponse:
        """
        Description: 租赁服务平台上传用户信息
        Summary: 租赁服务平台上传用户信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseUserinfoResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.userinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_orderinfo(
        self,
        request: twc_models.CreateLeaseOrderinfoRequest,
    ) -> twc_models.CreateLeaseOrderinfoResponse:
        """
        Description: 租赁服务平台上传订单产品/服务信息
        Summary: 租赁服务平台上传订单产品/服务信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_orderinfo_ex(request, headers, runtime)

    async def create_lease_orderinfo_async(
        self,
        request: twc_models.CreateLeaseOrderinfoRequest,
    ) -> twc_models.CreateLeaseOrderinfoResponse:
        """
        Description: 租赁服务平台上传订单产品/服务信息
        Summary: 租赁服务平台上传订单产品/服务信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_orderinfo_ex_async(request, headers, runtime)

    def create_lease_orderinfo_ex(
        self,
        request: twc_models.CreateLeaseOrderinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseOrderinfoResponse:
        """
        Description: 租赁服务平台上传订单产品/服务信息
        Summary: 租赁服务平台上传订单产品/服务信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseOrderinfoResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.orderinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_orderinfo_ex_async(
        self,
        request: twc_models.CreateLeaseOrderinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseOrderinfoResponse:
        """
        Description: 租赁服务平台上传订单产品/服务信息
        Summary: 租赁服务平台上传订单产品/服务信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseOrderinfoResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.orderinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_promise(
        self,
        request: twc_models.CreateLeasePromiseRequest,
    ) -> twc_models.CreateLeasePromiseResponse:
        """
        Description: 租赁服务平台上传承诺信息
        Summary: 租赁服务平台上传承诺信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_promise_ex(request, headers, runtime)

    async def create_lease_promise_async(
        self,
        request: twc_models.CreateLeasePromiseRequest,
    ) -> twc_models.CreateLeasePromiseResponse:
        """
        Description: 租赁服务平台上传承诺信息
        Summary: 租赁服务平台上传承诺信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_promise_ex_async(request, headers, runtime)

    def create_lease_promise_ex(
        self,
        request: twc_models.CreateLeasePromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeasePromiseResponse:
        """
        Description: 租赁服务平台上传承诺信息
        Summary: 租赁服务平台上传承诺信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeasePromiseResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.promise.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_promise_ex_async(
        self,
        request: twc_models.CreateLeasePromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeasePromiseResponse:
        """
        Description: 租赁服务平台上传承诺信息
        Summary: 租赁服务平台上传承诺信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeasePromiseResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.promise.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_verifyinfo(
        self,
        request: twc_models.CreateLeaseVerifyinfoRequest,
    ) -> twc_models.CreateLeaseVerifyinfoResponse:
        """
        Description: 融资平台上传租赁物购买贷款订单信息
        Summary: 融资平台上传租赁物购买贷款订单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_verifyinfo_ex(request, headers, runtime)

    async def create_lease_verifyinfo_async(
        self,
        request: twc_models.CreateLeaseVerifyinfoRequest,
    ) -> twc_models.CreateLeaseVerifyinfoResponse:
        """
        Description: 融资平台上传租赁物购买贷款订单信息
        Summary: 融资平台上传租赁物购买贷款订单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_verifyinfo_ex_async(request, headers, runtime)

    def create_lease_verifyinfo_ex(
        self,
        request: twc_models.CreateLeaseVerifyinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseVerifyinfoResponse:
        """
        Description: 融资平台上传租赁物购买贷款订单信息
        Summary: 融资平台上传租赁物购买贷款订单信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseVerifyinfoResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.verifyinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_verifyinfo_ex_async(
        self,
        request: twc_models.CreateLeaseVerifyinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseVerifyinfoResponse:
        """
        Description: 融资平台上传租赁物购买贷款订单信息
        Summary: 融资平台上传租赁物购买贷款订单信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseVerifyinfoResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.verifyinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_creditpromise(
        self,
        request: twc_models.CreateLeaseCreditpromiseRequest,
    ) -> twc_models.CreateLeaseCreditpromiseResponse:
        """
        Description: 融资方上传承诺信息
        Summary: 融资方上传承诺信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_creditpromise_ex(request, headers, runtime)

    async def create_lease_creditpromise_async(
        self,
        request: twc_models.CreateLeaseCreditpromiseRequest,
    ) -> twc_models.CreateLeaseCreditpromiseResponse:
        """
        Description: 融资方上传承诺信息
        Summary: 融资方上传承诺信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_creditpromise_ex_async(request, headers, runtime)

    def create_lease_creditpromise_ex(
        self,
        request: twc_models.CreateLeaseCreditpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseCreditpromiseResponse:
        """
        Description: 融资方上传承诺信息
        Summary: 融资方上传承诺信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseCreditpromiseResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.creditpromise.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_creditpromise_ex_async(
        self,
        request: twc_models.CreateLeaseCreditpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseCreditpromiseResponse:
        """
        Description: 融资方上传承诺信息
        Summary: 融资方上传承诺信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseCreditpromiseResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.creditpromise.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_disburseinfo(
        self,
        request: twc_models.CreateLeaseDisburseinfoRequest,
    ) -> twc_models.CreateLeaseDisburseinfoResponse:
        """
        Description: 租赁平台上传支用/还款信息
        Summary: 租赁平台上传支用/还款信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_disburseinfo_ex(request, headers, runtime)

    async def create_lease_disburseinfo_async(
        self,
        request: twc_models.CreateLeaseDisburseinfoRequest,
    ) -> twc_models.CreateLeaseDisburseinfoResponse:
        """
        Description: 租赁平台上传支用/还款信息
        Summary: 租赁平台上传支用/还款信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_disburseinfo_ex_async(request, headers, runtime)

    def create_lease_disburseinfo_ex(
        self,
        request: twc_models.CreateLeaseDisburseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseDisburseinfoResponse:
        """
        Description: 租赁平台上传支用/还款信息
        Summary: 租赁平台上传支用/还款信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseDisburseinfoResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.disburseinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_disburseinfo_ex_async(
        self,
        request: twc_models.CreateLeaseDisburseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseDisburseinfoResponse:
        """
        Description: 租赁平台上传支用/还款信息
        Summary: 租赁平台上传支用/还款信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseDisburseinfoResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.disburseinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_orderinfo(
        self,
        request: twc_models.QueryLeaseOrderinfoRequest,
    ) -> twc_models.QueryLeaseOrderinfoResponse:
        """
        Description:  查询订单详细信息
        Summary:  查询订单详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_orderinfo_ex(request, headers, runtime)

    async def query_lease_orderinfo_async(
        self,
        request: twc_models.QueryLeaseOrderinfoRequest,
    ) -> twc_models.QueryLeaseOrderinfoResponse:
        """
        Description:  查询订单详细信息
        Summary:  查询订单详细信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_orderinfo_ex_async(request, headers, runtime)

    def query_lease_orderinfo_ex(
        self,
        request: twc_models.QueryLeaseOrderinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseOrderinfoResponse:
        """
        Description:  查询订单详细信息
        Summary:  查询订单详细信息
        """
        UtilClient.validate_model(request)
        return twc_models.QueryLeaseOrderinfoResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.orderinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_orderinfo_ex_async(
        self,
        request: twc_models.QueryLeaseOrderinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseOrderinfoResponse:
        """
        Description:  查询订单详细信息
        Summary:  查询订单详细信息
        """
        UtilClient.validate_model(request)
        return twc_models.QueryLeaseOrderinfoResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.orderinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_finance_textnotary(
        self,
        request: twc_models.CreateFinanceTextnotaryRequest,
    ) -> twc_models.CreateFinanceTextnotaryResponse:
        """
        Description: 创建金融行业标准文本存证
        Summary: 创建金融行业文本存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_finance_textnotary_ex(request, headers, runtime)

    async def create_finance_textnotary_async(
        self,
        request: twc_models.CreateFinanceTextnotaryRequest,
    ) -> twc_models.CreateFinanceTextnotaryResponse:
        """
        Description: 创建金融行业标准文本存证
        Summary: 创建金融行业文本存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_finance_textnotary_ex_async(request, headers, runtime)

    def create_finance_textnotary_ex(
        self,
        request: twc_models.CreateFinanceTextnotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateFinanceTextnotaryResponse:
        """
        Description: 创建金融行业标准文本存证
        Summary: 创建金融行业文本存证
        """
        UtilClient.validate_model(request)
        return twc_models.CreateFinanceTextnotaryResponse().from_map(
            self.do_request('1.0', 'twc.notary.finance.textnotary.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_finance_textnotary_ex_async(
        self,
        request: twc_models.CreateFinanceTextnotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateFinanceTextnotaryResponse:
        """
        Description: 创建金融行业标准文本存证
        Summary: 创建金融行业文本存证
        """
        UtilClient.validate_model(request)
        return twc_models.CreateFinanceTextnotaryResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.finance.textnotary.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_finance_textnotary(
        self,
        request: twc_models.GetFinanceTextnotaryRequest,
    ) -> twc_models.GetFinanceTextnotaryResponse:
        """
        Description: 获取金融行业文本存证接口描述
        Summary: 获取金融行业文本存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_finance_textnotary_ex(request, headers, runtime)

    async def get_finance_textnotary_async(
        self,
        request: twc_models.GetFinanceTextnotaryRequest,
    ) -> twc_models.GetFinanceTextnotaryResponse:
        """
        Description: 获取金融行业文本存证接口描述
        Summary: 获取金融行业文本存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_finance_textnotary_ex_async(request, headers, runtime)

    def get_finance_textnotary_ex(
        self,
        request: twc_models.GetFinanceTextnotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetFinanceTextnotaryResponse:
        """
        Description: 获取金融行业文本存证接口描述
        Summary: 获取金融行业文本存证
        """
        UtilClient.validate_model(request)
        return twc_models.GetFinanceTextnotaryResponse().from_map(
            self.do_request('1.0', 'twc.notary.finance.textnotary.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_finance_textnotary_ex_async(
        self,
        request: twc_models.GetFinanceTextnotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetFinanceTextnotaryResponse:
        """
        Description: 获取金融行业文本存证接口描述
        Summary: 获取金融行业文本存证
        """
        UtilClient.validate_model(request)
        return twc_models.GetFinanceTextnotaryResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.finance.textnotary.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_finance_filenotary(
        self,
        request: twc_models.CreateFinanceFilenotaryRequest,
    ) -> twc_models.CreateFinanceFilenotaryResponse:
        """
        Description: 创建金融行业文件存证接口描述
        Summary: 创建金融行业文件存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_finance_filenotary_ex(request, headers, runtime)

    async def create_finance_filenotary_async(
        self,
        request: twc_models.CreateFinanceFilenotaryRequest,
    ) -> twc_models.CreateFinanceFilenotaryResponse:
        """
        Description: 创建金融行业文件存证接口描述
        Summary: 创建金融行业文件存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_finance_filenotary_ex_async(request, headers, runtime)

    def create_finance_filenotary_ex(
        self,
        request: twc_models.CreateFinanceFilenotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateFinanceFilenotaryResponse:
        """
        Description: 创建金融行业文件存证接口描述
        Summary: 创建金融行业文件存证
        """
        UtilClient.validate_model(request)
        return twc_models.CreateFinanceFilenotaryResponse().from_map(
            self.do_request('1.0', 'twc.notary.finance.filenotary.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_finance_filenotary_ex_async(
        self,
        request: twc_models.CreateFinanceFilenotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateFinanceFilenotaryResponse:
        """
        Description: 创建金融行业文件存证接口描述
        Summary: 创建金融行业文件存证
        """
        UtilClient.validate_model(request)
        return twc_models.CreateFinanceFilenotaryResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.finance.filenotary.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_finance_filenotary(
        self,
        request: twc_models.GetFinanceFilenotaryRequest,
    ) -> twc_models.GetFinanceFilenotaryResponse:
        """
        Description: 获取金融行业文件存证接口描述
        Summary: 获取金融行业文件存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_finance_filenotary_ex(request, headers, runtime)

    async def get_finance_filenotary_async(
        self,
        request: twc_models.GetFinanceFilenotaryRequest,
    ) -> twc_models.GetFinanceFilenotaryResponse:
        """
        Description: 获取金融行业文件存证接口描述
        Summary: 获取金融行业文件存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_finance_filenotary_ex_async(request, headers, runtime)

    def get_finance_filenotary_ex(
        self,
        request: twc_models.GetFinanceFilenotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetFinanceFilenotaryResponse:
        """
        Description: 获取金融行业文件存证接口描述
        Summary: 获取金融行业文件存证
        """
        UtilClient.validate_model(request)
        return twc_models.GetFinanceFilenotaryResponse().from_map(
            self.do_request('1.0', 'twc.notary.finance.filenotary.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_finance_filenotary_ex_async(
        self,
        request: twc_models.GetFinanceFilenotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetFinanceFilenotaryResponse:
        """
        Description: 获取金融行业文件存证接口描述
        Summary: 获取金融行业文件存证
        """
        UtilClient.validate_model(request)
        return twc_models.GetFinanceFilenotaryResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.finance.filenotary.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_industry_notary(
        self,
        request: twc_models.CheckIndustryNotaryRequest,
    ) -> twc_models.CheckIndustryNotaryResponse:
        """
        Description: 统一存证核验接口
        Summary: 统一存证核验接口（已下架）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_industry_notary_ex(request, headers, runtime)

    async def check_industry_notary_async(
        self,
        request: twc_models.CheckIndustryNotaryRequest,
    ) -> twc_models.CheckIndustryNotaryResponse:
        """
        Description: 统一存证核验接口
        Summary: 统一存证核验接口（已下架）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_industry_notary_ex_async(request, headers, runtime)

    def check_industry_notary_ex(
        self,
        request: twc_models.CheckIndustryNotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckIndustryNotaryResponse:
        """
        Description: 统一存证核验接口
        Summary: 统一存证核验接口（已下架）
        """
        UtilClient.validate_model(request)
        return twc_models.CheckIndustryNotaryResponse().from_map(
            self.do_request('1.0', 'twc.notary.industry.notary.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_industry_notary_ex_async(
        self,
        request: twc_models.CheckIndustryNotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckIndustryNotaryResponse:
        """
        Description: 统一存证核验接口
        Summary: 统一存证核验接口（已下架）
        """
        UtilClient.validate_model(request)
        return twc_models.CheckIndustryNotaryResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.industry.notary.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_lease_contract(
        self,
        request: twc_models.UpdateLeaseContractRequest,
    ) -> twc_models.UpdateLeaseContractResponse:
        """
        Description: 升级融资租赁合约
        Summary: 升级融资租赁合约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_lease_contract_ex(request, headers, runtime)

    async def update_lease_contract_async(
        self,
        request: twc_models.UpdateLeaseContractRequest,
    ) -> twc_models.UpdateLeaseContractResponse:
        """
        Description: 升级融资租赁合约
        Summary: 升级融资租赁合约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_lease_contract_ex_async(request, headers, runtime)

    def update_lease_contract_ex(
        self,
        request: twc_models.UpdateLeaseContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateLeaseContractResponse:
        """
        Description: 升级融资租赁合约
        Summary: 升级融资租赁合约
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateLeaseContractResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.contract.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_lease_contract_ex_async(
        self,
        request: twc_models.UpdateLeaseContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateLeaseContractResponse:
        """
        Description: 升级融资租赁合约
        Summary: 升级融资租赁合约
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateLeaseContractResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.contract.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sue_breakpromiseinfo(
        self,
        request: twc_models.CreateSueBreakpromiseinfoRequest,
    ) -> twc_models.CreateSueBreakpromiseinfoResponse:
        """
        Description: 违约案件信息提交服务
        Summary: 违约案件信息提交服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sue_breakpromiseinfo_ex(request, headers, runtime)

    async def create_sue_breakpromiseinfo_async(
        self,
        request: twc_models.CreateSueBreakpromiseinfoRequest,
    ) -> twc_models.CreateSueBreakpromiseinfoResponse:
        """
        Description: 违约案件信息提交服务
        Summary: 违约案件信息提交服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sue_breakpromiseinfo_ex_async(request, headers, runtime)

    def create_sue_breakpromiseinfo_ex(
        self,
        request: twc_models.CreateSueBreakpromiseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateSueBreakpromiseinfoResponse:
        """
        Description: 违约案件信息提交服务
        Summary: 违约案件信息提交服务
        """
        UtilClient.validate_model(request)
        return twc_models.CreateSueBreakpromiseinfoResponse().from_map(
            self.do_request('1.0', 'twc.notary.sue.breakpromiseinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sue_breakpromiseinfo_ex_async(
        self,
        request: twc_models.CreateSueBreakpromiseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateSueBreakpromiseinfoResponse:
        """
        Description: 违约案件信息提交服务
        Summary: 违约案件信息提交服务
        """
        UtilClient.validate_model(request)
        return twc_models.CreateSueBreakpromiseinfoResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.sue.breakpromiseinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sue_breakpromiseinfo(
        self,
        request: twc_models.UpdateSueBreakpromiseinfoRequest,
    ) -> twc_models.UpdateSueBreakpromiseinfoResponse:
        """
        Description: 违约案件信息修改服务
        Summary: 违约案件信息修改服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sue_breakpromiseinfo_ex(request, headers, runtime)

    async def update_sue_breakpromiseinfo_async(
        self,
        request: twc_models.UpdateSueBreakpromiseinfoRequest,
    ) -> twc_models.UpdateSueBreakpromiseinfoResponse:
        """
        Description: 违约案件信息修改服务
        Summary: 违约案件信息修改服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sue_breakpromiseinfo_ex_async(request, headers, runtime)

    def update_sue_breakpromiseinfo_ex(
        self,
        request: twc_models.UpdateSueBreakpromiseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateSueBreakpromiseinfoResponse:
        """
        Description: 违约案件信息修改服务
        Summary: 违约案件信息修改服务
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateSueBreakpromiseinfoResponse().from_map(
            self.do_request('1.0', 'twc.notary.sue.breakpromiseinfo.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sue_breakpromiseinfo_ex_async(
        self,
        request: twc_models.UpdateSueBreakpromiseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateSueBreakpromiseinfoResponse:
        """
        Description: 违约案件信息修改服务
        Summary: 违约案件信息修改服务
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateSueBreakpromiseinfoResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.sue.breakpromiseinfo.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sue_breakpromiseinfo(
        self,
        request: twc_models.DeleteSueBreakpromiseinfoRequest,
    ) -> twc_models.DeleteSueBreakpromiseinfoResponse:
        """
        Description: 违约案件信息删除服务
        Summary: 违约案件信息删除服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sue_breakpromiseinfo_ex(request, headers, runtime)

    async def delete_sue_breakpromiseinfo_async(
        self,
        request: twc_models.DeleteSueBreakpromiseinfoRequest,
    ) -> twc_models.DeleteSueBreakpromiseinfoResponse:
        """
        Description: 违约案件信息删除服务
        Summary: 违约案件信息删除服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sue_breakpromiseinfo_ex_async(request, headers, runtime)

    def delete_sue_breakpromiseinfo_ex(
        self,
        request: twc_models.DeleteSueBreakpromiseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DeleteSueBreakpromiseinfoResponse:
        """
        Description: 违约案件信息删除服务
        Summary: 违约案件信息删除服务
        """
        UtilClient.validate_model(request)
        return twc_models.DeleteSueBreakpromiseinfoResponse().from_map(
            self.do_request('1.0', 'twc.notary.sue.breakpromiseinfo.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sue_breakpromiseinfo_ex_async(
        self,
        request: twc_models.DeleteSueBreakpromiseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DeleteSueBreakpromiseinfoResponse:
        """
        Description: 违约案件信息删除服务
        Summary: 违约案件信息删除服务
        """
        UtilClient.validate_model(request)
        return twc_models.DeleteSueBreakpromiseinfoResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.sue.breakpromiseinfo.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sue_userinfo(
        self,
        request: twc_models.QuerySueUserinfoRequest,
    ) -> twc_models.QuerySueUserinfoResponse:
        """
        Description: 查询惩戒信息
        Summary: 查询惩戒信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sue_userinfo_ex(request, headers, runtime)

    async def query_sue_userinfo_async(
        self,
        request: twc_models.QuerySueUserinfoRequest,
    ) -> twc_models.QuerySueUserinfoResponse:
        """
        Description: 查询惩戒信息
        Summary: 查询惩戒信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sue_userinfo_ex_async(request, headers, runtime)

    def query_sue_userinfo_ex(
        self,
        request: twc_models.QuerySueUserinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QuerySueUserinfoResponse:
        """
        Description: 查询惩戒信息
        Summary: 查询惩戒信息
        """
        UtilClient.validate_model(request)
        return twc_models.QuerySueUserinfoResponse().from_map(
            self.do_request('1.0', 'twc.notary.sue.userinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sue_userinfo_ex_async(
        self,
        request: twc_models.QuerySueUserinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QuerySueUserinfoResponse:
        """
        Description: 查询惩戒信息
        Summary: 查询惩戒信息
        """
        UtilClient.validate_model(request)
        return twc_models.QuerySueUserinfoResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.sue.userinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sue_exeplarycontract(
        self,
        request: twc_models.UpdateSueExeplarycontractRequest,
    ) -> twc_models.UpdateSueExeplarycontractResponse:
        """
        Description: 升级用户管理合约
        Summary: 升级用户管理合约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sue_exeplarycontract_ex(request, headers, runtime)

    async def update_sue_exeplarycontract_async(
        self,
        request: twc_models.UpdateSueExeplarycontractRequest,
    ) -> twc_models.UpdateSueExeplarycontractResponse:
        """
        Description: 升级用户管理合约
        Summary: 升级用户管理合约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sue_exeplarycontract_ex_async(request, headers, runtime)

    def update_sue_exeplarycontract_ex(
        self,
        request: twc_models.UpdateSueExeplarycontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateSueExeplarycontractResponse:
        """
        Description: 升级用户管理合约
        Summary: 升级用户管理合约
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateSueExeplarycontractResponse().from_map(
            self.do_request('1.0', 'twc.notary.sue.exeplarycontract.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sue_exeplarycontract_ex_async(
        self,
        request: twc_models.UpdateSueExeplarycontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateSueExeplarycontractResponse:
        """
        Description: 升级用户管理合约
        Summary: 升级用户管理合约
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateSueExeplarycontractResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.sue.exeplarycontract.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sue_exemplaryrevert(
        self,
        request: twc_models.UpdateSueExemplaryrevertRequest,
    ) -> twc_models.UpdateSueExemplaryrevertResponse:
        """
        Description: 回退用户管理合约
        Summary: 回退用户管理合约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sue_exemplaryrevert_ex(request, headers, runtime)

    async def update_sue_exemplaryrevert_async(
        self,
        request: twc_models.UpdateSueExemplaryrevertRequest,
    ) -> twc_models.UpdateSueExemplaryrevertResponse:
        """
        Description: 回退用户管理合约
        Summary: 回退用户管理合约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sue_exemplaryrevert_ex_async(request, headers, runtime)

    def update_sue_exemplaryrevert_ex(
        self,
        request: twc_models.UpdateSueExemplaryrevertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateSueExemplaryrevertResponse:
        """
        Description: 回退用户管理合约
        Summary: 回退用户管理合约
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateSueExemplaryrevertResponse().from_map(
            self.do_request('1.0', 'twc.notary.sue.exemplaryrevert.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sue_exemplaryrevert_ex_async(
        self,
        request: twc_models.UpdateSueExemplaryrevertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateSueExemplaryrevertResponse:
        """
        Description: 回退用户管理合约
        Summary: 回退用户管理合约
        """
        UtilClient.validate_model(request)
        return twc_models.UpdateSueExemplaryrevertResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.sue.exemplaryrevert.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_audit(
        self,
        request: twc_models.CreateLeaseAuditRequest,
    ) -> twc_models.CreateLeaseAuditResponse:
        """
        Description: 融资平台审核订单信息
        Summary: 融资平台审核订单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_audit_ex(request, headers, runtime)

    async def create_lease_audit_async(
        self,
        request: twc_models.CreateLeaseAuditRequest,
    ) -> twc_models.CreateLeaseAuditResponse:
        """
        Description: 融资平台审核订单信息
        Summary: 融资平台审核订单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_audit_ex_async(request, headers, runtime)

    def create_lease_audit_ex(
        self,
        request: twc_models.CreateLeaseAuditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseAuditResponse:
        """
        Description: 融资平台审核订单信息
        Summary: 融资平台审核订单信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseAuditResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.audit.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_audit_ex_async(
        self,
        request: twc_models.CreateLeaseAuditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseAuditResponse:
        """
        Description: 融资平台审核订单信息
        Summary: 融资平台审核订单信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseAuditResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.audit.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_paymentfile(
        self,
        request: twc_models.CreateLeasePaymentfileRequest,
    ) -> twc_models.CreateLeasePaymentfileResponse:
        """
        Description: 租赁平台上传付款通知信息
        Summary: 租赁平台上传付款通知信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_paymentfile_ex(request, headers, runtime)

    async def create_lease_paymentfile_async(
        self,
        request: twc_models.CreateLeasePaymentfileRequest,
    ) -> twc_models.CreateLeasePaymentfileResponse:
        """
        Description: 租赁平台上传付款通知信息
        Summary: 租赁平台上传付款通知信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_paymentfile_ex_async(request, headers, runtime)

    def create_lease_paymentfile_ex(
        self,
        request: twc_models.CreateLeasePaymentfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeasePaymentfileResponse:
        """
        Description: 租赁平台上传付款通知信息
        Summary: 租赁平台上传付款通知信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeasePaymentfileResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.paymentfile.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_paymentfile_ex_async(
        self,
        request: twc_models.CreateLeasePaymentfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeasePaymentfileResponse:
        """
        Description: 租赁平台上传付款通知信息
        Summary: 租赁平台上传付款通知信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeasePaymentfileResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.paymentfile.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_rental(
        self,
        request: twc_models.CreateLeaseRentalRequest,
    ) -> twc_models.CreateLeaseRentalResponse:
        """
        Description: 租赁系统上传租金归还记录 分期调用
        Summary: 租赁系统上传租金归还记录 分期调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_rental_ex(request, headers, runtime)

    async def create_lease_rental_async(
        self,
        request: twc_models.CreateLeaseRentalRequest,
    ) -> twc_models.CreateLeaseRentalResponse:
        """
        Description: 租赁系统上传租金归还记录 分期调用
        Summary: 租赁系统上传租金归还记录 分期调用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_rental_ex_async(request, headers, runtime)

    def create_lease_rental_ex(
        self,
        request: twc_models.CreateLeaseRentalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseRentalResponse:
        """
        Description: 租赁系统上传租金归还记录 分期调用
        Summary: 租赁系统上传租金归还记录 分期调用
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseRentalResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.rental.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_rental_ex_async(
        self,
        request: twc_models.CreateLeaseRentalRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseRentalResponse:
        """
        Description: 租赁系统上传租金归还记录 分期调用
        Summary: 租赁系统上传租金归还记录 分期调用
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseRentalResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.rental.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_clearing(
        self,
        request: twc_models.CreateLeaseClearingRequest,
    ) -> twc_models.CreateLeaseClearingResponse:
        """
        Description: 清分服务机构上传资金清算记录，分期
        Summary: 清分服务机构上传资金清算记录，分期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_clearing_ex(request, headers, runtime)

    async def create_lease_clearing_async(
        self,
        request: twc_models.CreateLeaseClearingRequest,
    ) -> twc_models.CreateLeaseClearingResponse:
        """
        Description: 清分服务机构上传资金清算记录，分期
        Summary: 清分服务机构上传资金清算记录，分期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_clearing_ex_async(request, headers, runtime)

    def create_lease_clearing_ex(
        self,
        request: twc_models.CreateLeaseClearingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseClearingResponse:
        """
        Description: 清分服务机构上传资金清算记录，分期
        Summary: 清分服务机构上传资金清算记录，分期
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseClearingResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.clearing.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_clearing_ex_async(
        self,
        request: twc_models.CreateLeaseClearingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseClearingResponse:
        """
        Description: 清分服务机构上传资金清算记录，分期
        Summary: 清分服务机构上传资金清算记录，分期
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseClearingResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.clearing.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_repayment(
        self,
        request: twc_models.CreateLeaseRepaymentRequest,
    ) -> twc_models.CreateLeaseRepaymentResponse:
        """
        Description: 融资金融机构上传还款信息 每期
        Summary: 融资金融机构上传还款信息 每期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_repayment_ex(request, headers, runtime)

    async def create_lease_repayment_async(
        self,
        request: twc_models.CreateLeaseRepaymentRequest,
    ) -> twc_models.CreateLeaseRepaymentResponse:
        """
        Description: 融资金融机构上传还款信息 每期
        Summary: 融资金融机构上传还款信息 每期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_repayment_ex_async(request, headers, runtime)

    def create_lease_repayment_ex(
        self,
        request: twc_models.CreateLeaseRepaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseRepaymentResponse:
        """
        Description: 融资金融机构上传还款信息 每期
        Summary: 融资金融机构上传还款信息 每期
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseRepaymentResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.repayment.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_repayment_ex_async(
        self,
        request: twc_models.CreateLeaseRepaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseRepaymentResponse:
        """
        Description: 融资金融机构上传还款信息 每期
        Summary: 融资金融机构上传还款信息 每期
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseRepaymentResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.repayment.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_notifyregister(
        self,
        request: twc_models.CreateLeaseNotifyregisterRequest,
    ) -> twc_models.CreateLeaseNotifyregisterResponse:
        """
        Description: 融资租赁通知系统注册
        Summary: 融资租赁通知系统注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_notifyregister_ex(request, headers, runtime)

    async def create_lease_notifyregister_async(
        self,
        request: twc_models.CreateLeaseNotifyregisterRequest,
    ) -> twc_models.CreateLeaseNotifyregisterResponse:
        """
        Description: 融资租赁通知系统注册
        Summary: 融资租赁通知系统注册
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_notifyregister_ex_async(request, headers, runtime)

    def create_lease_notifyregister_ex(
        self,
        request: twc_models.CreateLeaseNotifyregisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseNotifyregisterResponse:
        """
        Description: 融资租赁通知系统注册
        Summary: 融资租赁通知系统注册
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseNotifyregisterResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.notifyregister.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_notifyregister_ex_async(
        self,
        request: twc_models.CreateLeaseNotifyregisterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseNotifyregisterResponse:
        """
        Description: 融资租赁通知系统注册
        Summary: 融资租赁通知系统注册
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseNotifyregisterResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.notifyregister.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_iotinfo(
        self,
        request: twc_models.QueryLeaseIotinfoRequest,
    ) -> twc_models.QueryLeaseIotinfoResponse:
        """
        Description: 根据imeiID查询iot设备的详情
        Summary: 根据imeiID查询iot设备的详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_iotinfo_ex(request, headers, runtime)

    async def query_lease_iotinfo_async(
        self,
        request: twc_models.QueryLeaseIotinfoRequest,
    ) -> twc_models.QueryLeaseIotinfoResponse:
        """
        Description: 根据imeiID查询iot设备的详情
        Summary: 根据imeiID查询iot设备的详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_iotinfo_ex_async(request, headers, runtime)

    def query_lease_iotinfo_ex(
        self,
        request: twc_models.QueryLeaseIotinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseIotinfoResponse:
        """
        Description: 根据imeiID查询iot设备的详情
        Summary: 根据imeiID查询iot设备的详情
        """
        UtilClient.validate_model(request)
        return twc_models.QueryLeaseIotinfoResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.iotinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_iotinfo_ex_async(
        self,
        request: twc_models.QueryLeaseIotinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseIotinfoResponse:
        """
        Description: 根据imeiID查询iot设备的详情
        Summary: 根据imeiID查询iot设备的详情
        """
        UtilClient.validate_model(request)
        return twc_models.QueryLeaseIotinfoResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.iotinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_court_textnotary(
        self,
        request: twc_models.CreateCourtTextnotaryRequest,
    ) -> twc_models.CreateCourtTextnotaryResponse:
        """
        Description: 创建法院通用文本存证
        Summary: 法院通用文本存证创建接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_court_textnotary_ex(request, headers, runtime)

    async def create_court_textnotary_async(
        self,
        request: twc_models.CreateCourtTextnotaryRequest,
    ) -> twc_models.CreateCourtTextnotaryResponse:
        """
        Description: 创建法院通用文本存证
        Summary: 法院通用文本存证创建接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_court_textnotary_ex_async(request, headers, runtime)

    def create_court_textnotary_ex(
        self,
        request: twc_models.CreateCourtTextnotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateCourtTextnotaryResponse:
        """
        Description: 创建法院通用文本存证
        Summary: 法院通用文本存证创建接口
        """
        UtilClient.validate_model(request)
        return twc_models.CreateCourtTextnotaryResponse().from_map(
            self.do_request('1.0', 'twc.notary.court.textnotary.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_court_textnotary_ex_async(
        self,
        request: twc_models.CreateCourtTextnotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateCourtTextnotaryResponse:
        """
        Description: 创建法院通用文本存证
        Summary: 法院通用文本存证创建接口
        """
        UtilClient.validate_model(request)
        return twc_models.CreateCourtTextnotaryResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.court.textnotary.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_court_textnotary(
        self,
        request: twc_models.GetCourtTextnotaryRequest,
    ) -> twc_models.GetCourtTextnotaryResponse:
        """
        Description: 获取法院通用文本存证
        Summary: 法院通用文本存证获取接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_court_textnotary_ex(request, headers, runtime)

    async def get_court_textnotary_async(
        self,
        request: twc_models.GetCourtTextnotaryRequest,
    ) -> twc_models.GetCourtTextnotaryResponse:
        """
        Description: 获取法院通用文本存证
        Summary: 法院通用文本存证获取接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_court_textnotary_ex_async(request, headers, runtime)

    def get_court_textnotary_ex(
        self,
        request: twc_models.GetCourtTextnotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetCourtTextnotaryResponse:
        """
        Description: 获取法院通用文本存证
        Summary: 法院通用文本存证获取接口
        """
        UtilClient.validate_model(request)
        return twc_models.GetCourtTextnotaryResponse().from_map(
            self.do_request('1.0', 'twc.notary.court.textnotary.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_court_textnotary_ex_async(
        self,
        request: twc_models.GetCourtTextnotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetCourtTextnotaryResponse:
        """
        Description: 获取法院通用文本存证
        Summary: 法院通用文本存证获取接口
        """
        UtilClient.validate_model(request)
        return twc_models.GetCourtTextnotaryResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.court.textnotary.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_court_filenotary(
        self,
        request: twc_models.CreateCourtFilenotaryRequest,
    ) -> twc_models.CreateCourtFilenotaryResponse:
        """
        Description: 创建法院通用文件存证接口
        Summary: 法院通用文件存证创建接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_court_filenotary_ex(request, headers, runtime)

    async def create_court_filenotary_async(
        self,
        request: twc_models.CreateCourtFilenotaryRequest,
    ) -> twc_models.CreateCourtFilenotaryResponse:
        """
        Description: 创建法院通用文件存证接口
        Summary: 法院通用文件存证创建接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_court_filenotary_ex_async(request, headers, runtime)

    def create_court_filenotary_ex(
        self,
        request: twc_models.CreateCourtFilenotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateCourtFilenotaryResponse:
        """
        Description: 创建法院通用文件存证接口
        Summary: 法院通用文件存证创建接口
        """
        UtilClient.validate_model(request)
        return twc_models.CreateCourtFilenotaryResponse().from_map(
            self.do_request('1.0', 'twc.notary.court.filenotary.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_court_filenotary_ex_async(
        self,
        request: twc_models.CreateCourtFilenotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateCourtFilenotaryResponse:
        """
        Description: 创建法院通用文件存证接口
        Summary: 法院通用文件存证创建接口
        """
        UtilClient.validate_model(request)
        return twc_models.CreateCourtFilenotaryResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.court.filenotary.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_court_filenotary(
        self,
        request: twc_models.GetCourtFilenotaryRequest,
    ) -> twc_models.GetCourtFilenotaryResponse:
        """
        Description: 获取法院通用文件存证
        Summary: 法院通用文件存证获取接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_court_filenotary_ex(request, headers, runtime)

    async def get_court_filenotary_async(
        self,
        request: twc_models.GetCourtFilenotaryRequest,
    ) -> twc_models.GetCourtFilenotaryResponse:
        """
        Description: 获取法院通用文件存证
        Summary: 法院通用文件存证获取接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_court_filenotary_ex_async(request, headers, runtime)

    def get_court_filenotary_ex(
        self,
        request: twc_models.GetCourtFilenotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetCourtFilenotaryResponse:
        """
        Description: 获取法院通用文件存证
        Summary: 法院通用文件存证获取接口
        """
        UtilClient.validate_model(request)
        return twc_models.GetCourtFilenotaryResponse().from_map(
            self.do_request('1.0', 'twc.notary.court.filenotary.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_court_filenotary_ex_async(
        self,
        request: twc_models.GetCourtFilenotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetCourtFilenotaryResponse:
        """
        Description: 获取法院通用文件存证
        Summary: 法院通用文件存证获取接口
        """
        UtilClient.validate_model(request)
        return twc_models.GetCourtFilenotaryResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.court.filenotary.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_route(
        self,
        request: twc_models.CreateLeaseRouteRequest,
    ) -> twc_models.CreateLeaseRouteResponse:
        """
        Description: 融资租赁定制化统一入口
        Summary: 融资租赁定制化统一入口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_route_ex(request, headers, runtime)

    async def create_lease_route_async(
        self,
        request: twc_models.CreateLeaseRouteRequest,
    ) -> twc_models.CreateLeaseRouteResponse:
        """
        Description: 融资租赁定制化统一入口
        Summary: 融资租赁定制化统一入口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_route_ex_async(request, headers, runtime)

    def create_lease_route_ex(
        self,
        request: twc_models.CreateLeaseRouteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseRouteResponse:
        """
        Description: 融资租赁定制化统一入口
        Summary: 融资租赁定制化统一入口
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseRouteResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.route.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_route_ex_async(
        self,
        request: twc_models.CreateLeaseRouteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseRouteResponse:
        """
        Description: 融资租赁定制化统一入口
        Summary: 融资租赁定制化统一入口
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseRouteResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.route.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_encryptedinfo(
        self,
        request: twc_models.QueryLeaseEncryptedinfoRequest,
    ) -> twc_models.QueryLeaseEncryptedinfoResponse:
        """
        Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
        Summary: 查询用户等加密信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_encryptedinfo_ex(request, headers, runtime)

    async def query_lease_encryptedinfo_async(
        self,
        request: twc_models.QueryLeaseEncryptedinfoRequest,
    ) -> twc_models.QueryLeaseEncryptedinfoResponse:
        """
        Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
        Summary: 查询用户等加密信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_encryptedinfo_ex_async(request, headers, runtime)

    def query_lease_encryptedinfo_ex(
        self,
        request: twc_models.QueryLeaseEncryptedinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseEncryptedinfoResponse:
        """
        Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
        Summary: 查询用户等加密信息
        """
        UtilClient.validate_model(request)
        return twc_models.QueryLeaseEncryptedinfoResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.encryptedinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_encryptedinfo_ex_async(
        self,
        request: twc_models.QueryLeaseEncryptedinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseEncryptedinfoResponse:
        """
        Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密
        Summary: 查询用户等加密信息
        """
        UtilClient.validate_model(request)
        return twc_models.QueryLeaseEncryptedinfoResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.encryptedinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_text(
        self,
        request: twc_models.CreateContractTextRequest,
    ) -> twc_models.CreateContractTextResponse:
        """
        Description: 电子合同文本存证
        Summary: 电子合同文本存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_text_ex(request, headers, runtime)

    async def create_contract_text_async(
        self,
        request: twc_models.CreateContractTextRequest,
    ) -> twc_models.CreateContractTextResponse:
        """
        Description: 电子合同文本存证
        Summary: 电子合同文本存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_text_ex_async(request, headers, runtime)

    def create_contract_text_ex(
        self,
        request: twc_models.CreateContractTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractTextResponse:
        """
        Description: 电子合同文本存证
        Summary: 电子合同文本存证
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractTextResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.text.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_text_ex_async(
        self,
        request: twc_models.CreateContractTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractTextResponse:
        """
        Description: 电子合同文本存证
        Summary: 电子合同文本存证
        """
        UtilClient.validate_model(request)
        return twc_models.CreateContractTextResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.text.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_contract_report(
        self,
        request: twc_models.ApplyContractReportRequest,
    ) -> twc_models.ApplyContractReportResponse:
        """
        Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
        Summary: 申请电子合同存证报告
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_contract_report_ex(request, headers, runtime)

    async def apply_contract_report_async(
        self,
        request: twc_models.ApplyContractReportRequest,
    ) -> twc_models.ApplyContractReportResponse:
        """
        Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
        Summary: 申请电子合同存证报告
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_contract_report_ex_async(request, headers, runtime)

    def apply_contract_report_ex(
        self,
        request: twc_models.ApplyContractReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyContractReportResponse:
        """
        Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
        Summary: 申请电子合同存证报告
        """
        UtilClient.validate_model(request)
        return twc_models.ApplyContractReportResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.report.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_contract_report_ex_async(
        self,
        request: twc_models.ApplyContractReportRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyContractReportResponse:
        """
        Description: 全流程存证后，批量提交全流程核验信息，申请出证报告授权码。成功后可生成全流程上链报告
        Summary: 申请电子合同存证报告
        """
        UtilClient.validate_model(request)
        return twc_models.ApplyContractReportResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.report.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_contract_text(
        self,
        request: twc_models.GetContractTextRequest,
    ) -> twc_models.GetContractTextResponse:
        """
        Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
        Summary: 下载合同存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_contract_text_ex(request, headers, runtime)

    async def get_contract_text_async(
        self,
        request: twc_models.GetContractTextRequest,
    ) -> twc_models.GetContractTextResponse:
        """
        Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
        Summary: 下载合同存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_contract_text_ex_async(request, headers, runtime)

    def get_contract_text_ex(
        self,
        request: twc_models.GetContractTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetContractTextResponse:
        """
        Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
        Summary: 下载合同存证
        """
        UtilClient.validate_model(request)
        return twc_models.GetContractTextResponse().from_map(
            self.do_request('1.0', 'twc.notary.contract.text.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_contract_text_ex_async(
        self,
        request: twc_models.GetContractTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetContractTextResponse:
        """
        Description: 下载合同存证某个环节的内容，得到存证信息对象最终上链的JSON序列化形式，该内容可用于统一核验
        Summary: 下载合同存证
        """
        UtilClient.validate_model(request)
        return twc_models.GetContractTextResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.contract.text.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_internal_trans(
        self,
        request: twc_models.CreateInternalTransRequest,
    ) -> twc_models.CreateInternalTransResponse:
        """
        Description: 获取存证事务ID内部接口
        Summary: 获取存证事务ID内部接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_internal_trans_ex(request, headers, runtime)

    async def create_internal_trans_async(
        self,
        request: twc_models.CreateInternalTransRequest,
    ) -> twc_models.CreateInternalTransResponse:
        """
        Description: 获取存证事务ID内部接口
        Summary: 获取存证事务ID内部接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_internal_trans_ex_async(request, headers, runtime)

    def create_internal_trans_ex(
        self,
        request: twc_models.CreateInternalTransRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateInternalTransResponse:
        """
        Description: 获取存证事务ID内部接口
        Summary: 获取存证事务ID内部接口
        """
        UtilClient.validate_model(request)
        return twc_models.CreateInternalTransResponse().from_map(
            self.do_request('1.0', 'twc.notary.internal.trans.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_internal_trans_ex_async(
        self,
        request: twc_models.CreateInternalTransRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateInternalTransResponse:
        """
        Description: 获取存证事务ID内部接口
        Summary: 获取存证事务ID内部接口
        """
        UtilClient.validate_model(request)
        return twc_models.CreateInternalTransResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.internal.trans.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_internal_text(
        self,
        request: twc_models.CreateInternalTextRequest,
    ) -> twc_models.CreateInternalTextResponse:
        """
        Description: 文本存证内部接口，将文本内容存证上链
        Summary: 文本存证内部接口，将文本内容存证上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_internal_text_ex(request, headers, runtime)

    async def create_internal_text_async(
        self,
        request: twc_models.CreateInternalTextRequest,
    ) -> twc_models.CreateInternalTextResponse:
        """
        Description: 文本存证内部接口，将文本内容存证上链
        Summary: 文本存证内部接口，将文本内容存证上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_internal_text_ex_async(request, headers, runtime)

    def create_internal_text_ex(
        self,
        request: twc_models.CreateInternalTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateInternalTextResponse:
        """
        Description: 文本存证内部接口，将文本内容存证上链
        Summary: 文本存证内部接口，将文本内容存证上链
        """
        UtilClient.validate_model(request)
        return twc_models.CreateInternalTextResponse().from_map(
            self.do_request('1.0', 'twc.notary.internal.text.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_internal_text_ex_async(
        self,
        request: twc_models.CreateInternalTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateInternalTextResponse:
        """
        Description: 文本存证内部接口，将文本内容存证上链
        Summary: 文本存证内部接口，将文本内容存证上链
        """
        UtilClient.validate_model(request)
        return twc_models.CreateInternalTextResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.internal.text.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_text(
        self,
        request: twc_models.CreateLeaseTextRequest,
    ) -> twc_models.CreateLeaseTextResponse:
        """
        Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
        Summary: 租赁业务文本存证，将文本内容存证上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_text_ex(request, headers, runtime)

    async def create_lease_text_async(
        self,
        request: twc_models.CreateLeaseTextRequest,
    ) -> twc_models.CreateLeaseTextResponse:
        """
        Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
        Summary: 租赁业务文本存证，将文本内容存证上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_text_ex_async(request, headers, runtime)

    def create_lease_text_ex(
        self,
        request: twc_models.CreateLeaseTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseTextResponse:
        """
        Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
        Summary: 租赁业务文本存证，将文本内容存证上链
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseTextResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.text.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_text_ex_async(
        self,
        request: twc_models.CreateLeaseTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseTextResponse:
        """
        Description: 发起文本存证，将文本内容存证上链，租赁业务专用。
        Summary: 租赁业务文本存证，将文本内容存证上链
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseTextResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.text.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_file(
        self,
        request: twc_models.CreateLeaseFileRequest,
    ) -> twc_models.CreateLeaseFileResponse:
        """
        Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
        Summary: 租赁业务文件内容存证上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_file_ex(request, headers, runtime)

    async def create_lease_file_async(
        self,
        request: twc_models.CreateLeaseFileRequest,
    ) -> twc_models.CreateLeaseFileResponse:
        """
        Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
        Summary: 租赁业务文件内容存证上链
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_file_ex_async(request, headers, runtime)

    def create_lease_file_ex(
        self,
        request: twc_models.CreateLeaseFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseFileResponse:
        """
        Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
        Summary: 租赁业务文件内容存证上链
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseFileResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.file.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_file_ex_async(
        self,
        request: twc_models.CreateLeaseFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseFileResponse:
        """
        Description: 发起文件存证，将文件内容存证上链，租赁业务专用。
        Summary: 租赁业务文件内容存证上链
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseFileResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.file.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_lease_notary(
        self,
        request: twc_models.ListLeaseNotaryRequest,
    ) -> twc_models.ListLeaseNotaryResponse:
        """
        Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
        Summary: 租赁业务获取订单存证列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_lease_notary_ex(request, headers, runtime)

    async def list_lease_notary_async(
        self,
        request: twc_models.ListLeaseNotaryRequest,
    ) -> twc_models.ListLeaseNotaryResponse:
        """
        Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
        Summary: 租赁业务获取订单存证列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_lease_notary_ex_async(request, headers, runtime)

    def list_lease_notary_ex(
        self,
        request: twc_models.ListLeaseNotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ListLeaseNotaryResponse:
        """
        Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
        Summary: 租赁业务获取订单存证列表
        """
        UtilClient.validate_model(request)
        return twc_models.ListLeaseNotaryResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.notary.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_lease_notary_ex_async(
        self,
        request: twc_models.ListLeaseNotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ListLeaseNotaryResponse:
        """
        Description: 使用接口查询订单存证的信息，需要在完成订单回传后才可返回。获取到txhash后，用户可使用 获取文本存证、存证核验 等存证服务功能。
        Summary: 租赁业务获取订单存证列表
        """
        UtilClient.validate_model(request)
        return twc_models.ListLeaseNotaryResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.notary.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_application(
        self,
        request: twc_models.QueryLeaseApplicationRequest,
    ) -> twc_models.QueryLeaseApplicationResponse:
        """
        Description: 查询融资租赁application
        Summary: 查询融资租赁application
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_application_ex(request, headers, runtime)

    async def query_lease_application_async(
        self,
        request: twc_models.QueryLeaseApplicationRequest,
    ) -> twc_models.QueryLeaseApplicationResponse:
        """
        Description: 查询融资租赁application
        Summary: 查询融资租赁application
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_application_ex_async(request, headers, runtime)

    def query_lease_application_ex(
        self,
        request: twc_models.QueryLeaseApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseApplicationResponse:
        """
        Description: 查询融资租赁application
        Summary: 查询融资租赁application
        """
        UtilClient.validate_model(request)
        return twc_models.QueryLeaseApplicationResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.application.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_application_ex_async(
        self,
        request: twc_models.QueryLeaseApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseApplicationResponse:
        """
        Description: 查询融资租赁application
        Summary: 查询融资租赁application
        """
        UtilClient.validate_model(request)
        return twc_models.QueryLeaseApplicationResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.application.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_applicationdetailinfo(
        self,
        request: twc_models.QueryLeaseApplicationdetailinfoRequest,
    ) -> twc_models.QueryLeaseApplicationdetailinfoResponse:
        """
        Description: 查询融资租赁application的定义详情
        Summary: 查询application的定义详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_applicationdetailinfo_ex(request, headers, runtime)

    async def query_lease_applicationdetailinfo_async(
        self,
        request: twc_models.QueryLeaseApplicationdetailinfoRequest,
    ) -> twc_models.QueryLeaseApplicationdetailinfoResponse:
        """
        Description: 查询融资租赁application的定义详情
        Summary: 查询application的定义详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_applicationdetailinfo_ex_async(request, headers, runtime)

    def query_lease_applicationdetailinfo_ex(
        self,
        request: twc_models.QueryLeaseApplicationdetailinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseApplicationdetailinfoResponse:
        """
        Description: 查询融资租赁application的定义详情
        Summary: 查询application的定义详情
        """
        UtilClient.validate_model(request)
        return twc_models.QueryLeaseApplicationdetailinfoResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.applicationdetailinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_applicationdetailinfo_ex_async(
        self,
        request: twc_models.QueryLeaseApplicationdetailinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseApplicationdetailinfoResponse:
        """
        Description: 查询融资租赁application的定义详情
        Summary: 查询application的定义详情
        """
        UtilClient.validate_model(request)
        return twc_models.QueryLeaseApplicationdetailinfoResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.applicationdetailinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_lease_repaymentstatus(
        self,
        request: twc_models.SetLeaseRepaymentstatusRequest,
    ) -> twc_models.SetLeaseRepaymentstatusResponse:
        """
        Description: 融资租赁资方重置订单状态
        Summary: 融资租赁资方重置订单状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_lease_repaymentstatus_ex(request, headers, runtime)

    async def set_lease_repaymentstatus_async(
        self,
        request: twc_models.SetLeaseRepaymentstatusRequest,
    ) -> twc_models.SetLeaseRepaymentstatusResponse:
        """
        Description: 融资租赁资方重置订单状态
        Summary: 融资租赁资方重置订单状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_lease_repaymentstatus_ex_async(request, headers, runtime)

    def set_lease_repaymentstatus_ex(
        self,
        request: twc_models.SetLeaseRepaymentstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SetLeaseRepaymentstatusResponse:
        """
        Description: 融资租赁资方重置订单状态
        Summary: 融资租赁资方重置订单状态
        """
        UtilClient.validate_model(request)
        return twc_models.SetLeaseRepaymentstatusResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.repaymentstatus.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_lease_repaymentstatus_ex_async(
        self,
        request: twc_models.SetLeaseRepaymentstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SetLeaseRepaymentstatusResponse:
        """
        Description: 融资租赁资方重置订单状态
        Summary: 融资租赁资方重置订单状态
        """
        UtilClient.validate_model(request)
        return twc_models.SetLeaseRepaymentstatusResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.repaymentstatus.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_supplierinfo(
        self,
        request: twc_models.CreateLeaseSupplierinfoRequest,
    ) -> twc_models.CreateLeaseSupplierinfoResponse:
        """
        Description: 供应商上传采购等相关信息
        Summary: 供应商上传采购等相关信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_supplierinfo_ex(request, headers, runtime)

    async def create_lease_supplierinfo_async(
        self,
        request: twc_models.CreateLeaseSupplierinfoRequest,
    ) -> twc_models.CreateLeaseSupplierinfoResponse:
        """
        Description: 供应商上传采购等相关信息
        Summary: 供应商上传采购等相关信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_supplierinfo_ex_async(request, headers, runtime)

    def create_lease_supplierinfo_ex(
        self,
        request: twc_models.CreateLeaseSupplierinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseSupplierinfoResponse:
        """
        Description: 供应商上传采购等相关信息
        Summary: 供应商上传采购等相关信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseSupplierinfoResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.supplierinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_supplierinfo_ex_async(
        self,
        request: twc_models.CreateLeaseSupplierinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseSupplierinfoResponse:
        """
        Description: 供应商上传采购等相关信息
        Summary: 供应商上传采购等相关信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseSupplierinfoResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.supplierinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def deploy_mytf_tapp(
        self,
        request: twc_models.DeployMytfTappRequest,
    ) -> twc_models.DeployMytfTappResponse:
        """
        Description: mytf的tapp部署
        Summary: mytf的tapp部署
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.deploy_mytf_tapp_ex(request, headers, runtime)

    async def deploy_mytf_tapp_async(
        self,
        request: twc_models.DeployMytfTappRequest,
    ) -> twc_models.DeployMytfTappResponse:
        """
        Description: mytf的tapp部署
        Summary: mytf的tapp部署
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.deploy_mytf_tapp_ex_async(request, headers, runtime)

    def deploy_mytf_tapp_ex(
        self,
        request: twc_models.DeployMytfTappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DeployMytfTappResponse:
        """
        Description: mytf的tapp部署
        Summary: mytf的tapp部署
        """
        UtilClient.validate_model(request)
        return twc_models.DeployMytfTappResponse().from_map(
            self.do_request('1.0', 'twc.notary.mytf.tapp.deploy', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def deploy_mytf_tapp_ex_async(
        self,
        request: twc_models.DeployMytfTappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DeployMytfTappResponse:
        """
        Description: mytf的tapp部署
        Summary: mytf的tapp部署
        """
        UtilClient.validate_model(request)
        return twc_models.DeployMytfTappResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.mytf.tapp.deploy', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_supplierdynamicinfo(
        self,
        request: twc_models.CreateLeaseSupplierdynamicinfoRequest,
    ) -> twc_models.CreateLeaseSupplierdynamicinfoResponse:
        """
        Description: 供应商更新物流状态、签收记录等信息
        Summary: 供应商更新物流状态、签收记录等信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_supplierdynamicinfo_ex(request, headers, runtime)

    async def create_lease_supplierdynamicinfo_async(
        self,
        request: twc_models.CreateLeaseSupplierdynamicinfoRequest,
    ) -> twc_models.CreateLeaseSupplierdynamicinfoResponse:
        """
        Description: 供应商更新物流状态、签收记录等信息
        Summary: 供应商更新物流状态、签收记录等信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_supplierdynamicinfo_ex_async(request, headers, runtime)

    def create_lease_supplierdynamicinfo_ex(
        self,
        request: twc_models.CreateLeaseSupplierdynamicinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseSupplierdynamicinfoResponse:
        """
        Description: 供应商更新物流状态、签收记录等信息
        Summary: 供应商更新物流状态、签收记录等信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseSupplierdynamicinfoResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.supplierdynamicinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_supplierdynamicinfo_ex_async(
        self,
        request: twc_models.CreateLeaseSupplierdynamicinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseSupplierdynamicinfoResponse:
        """
        Description: 供应商更新物流状态、签收记录等信息
        Summary: 供应商更新物流状态、签收记录等信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseSupplierdynamicinfoResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.supplierdynamicinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_biz(
        self,
        request: twc_models.CreateLeaseBizRequest,
    ) -> twc_models.CreateLeaseBizResponse:
        """
        Description: 创建租赁订单相关信息，融资租赁的前置条件
        Summary: 创建租赁订单相关信息，融资租赁的前置条件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_biz_ex(request, headers, runtime)

    async def create_lease_biz_async(
        self,
        request: twc_models.CreateLeaseBizRequest,
    ) -> twc_models.CreateLeaseBizResponse:
        """
        Description: 创建租赁订单相关信息，融资租赁的前置条件
        Summary: 创建租赁订单相关信息，融资租赁的前置条件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_biz_ex_async(request, headers, runtime)

    def create_lease_biz_ex(
        self,
        request: twc_models.CreateLeaseBizRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseBizResponse:
        """
        Description: 创建租赁订单相关信息，融资租赁的前置条件
        Summary: 创建租赁订单相关信息，融资租赁的前置条件
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseBizResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.biz.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_biz_ex_async(
        self,
        request: twc_models.CreateLeaseBizRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseBizResponse:
        """
        Description: 创建租赁订单相关信息，融资租赁的前置条件
        Summary: 创建租赁订单相关信息，融资租赁的前置条件
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseBizResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.biz.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_proof(
        self,
        request: twc_models.QueryLeaseProofRequest,
    ) -> twc_models.QueryLeaseProofResponse:
        """
        Description: 查询核验结果
        Summary: 查询核验结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_proof_ex(request, headers, runtime)

    async def query_lease_proof_async(
        self,
        request: twc_models.QueryLeaseProofRequest,
    ) -> twc_models.QueryLeaseProofResponse:
        """
        Description: 查询核验结果
        Summary: 查询核验结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_proof_ex_async(request, headers, runtime)

    def query_lease_proof_ex(
        self,
        request: twc_models.QueryLeaseProofRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseProofResponse:
        """
        Description: 查询核验结果
        Summary: 查询核验结果
        """
        UtilClient.validate_model(request)
        return twc_models.QueryLeaseProofResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.proof.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_proof_ex_async(
        self,
        request: twc_models.QueryLeaseProofRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseProofResponse:
        """
        Description: 查询核验结果
        Summary: 查询核验结果
        """
        UtilClient.validate_model(request)
        return twc_models.QueryLeaseProofResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.proof.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_largefile(
        self,
        request: twc_models.CreateLargefileRequest,
    ) -> twc_models.CreateLargefileResponse:
        """
        Description: 发起文件存证，将文件内容存证上链，可存证10M以内的文件
        Summary: 大文件内容存证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_largefile_ex(request, headers, runtime)

    async def create_largefile_async(
        self,
        request: twc_models.CreateLargefileRequest,
    ) -> twc_models.CreateLargefileResponse:
        """
        Description: 发起文件存证，将文件内容存证上链，可存证10M以内的文件
        Summary: 大文件内容存证接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_largefile_ex_async(request, headers, runtime)

    def create_largefile_ex(
        self,
        request: twc_models.CreateLargefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLargefileResponse:
        """
        Description: 发起文件存证，将文件内容存证上链，可存证10M以内的文件
        Summary: 大文件内容存证接口
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLargefileResponse().from_map(
            self.do_request('1.0', 'twc.notary.largefile.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_largefile_ex_async(
        self,
        request: twc_models.CreateLargefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLargefileResponse:
        """
        Description: 发起文件存证，将文件内容存证上链，可存证10M以内的文件
        Summary: 大文件内容存证接口
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLargefileResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.largefile.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_biz(
        self,
        request: twc_models.QueryLeaseBizRequest,
    ) -> twc_models.QueryLeaseBizResponse:
        """
        Description: 租赁平台查询接口
        Summary: 租赁平台查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_biz_ex(request, headers, runtime)

    async def query_lease_biz_async(
        self,
        request: twc_models.QueryLeaseBizRequest,
    ) -> twc_models.QueryLeaseBizResponse:
        """
        Description: 租赁平台查询接口
        Summary: 租赁平台查询接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_biz_ex_async(request, headers, runtime)

    def query_lease_biz_ex(
        self,
        request: twc_models.QueryLeaseBizRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseBizResponse:
        """
        Description: 租赁平台查询接口
        Summary: 租赁平台查询接口
        """
        UtilClient.validate_model(request)
        return twc_models.QueryLeaseBizResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.biz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_biz_ex_async(
        self,
        request: twc_models.QueryLeaseBizRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseBizResponse:
        """
        Description: 租赁平台查询接口
        Summary: 租赁平台查询接口
        """
        UtilClient.validate_model(request)
        return twc_models.QueryLeaseBizResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.biz.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_biznotary(
        self,
        request: twc_models.CreateLeaseBiznotaryRequest,
    ) -> twc_models.CreateLeaseBiznotaryResponse:
        """
        Description: 租赁宝哈希存证
        Summary: 租赁宝哈希存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_biznotary_ex(request, headers, runtime)

    async def create_lease_biznotary_async(
        self,
        request: twc_models.CreateLeaseBiznotaryRequest,
    ) -> twc_models.CreateLeaseBiznotaryResponse:
        """
        Description: 租赁宝哈希存证
        Summary: 租赁宝哈希存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_biznotary_ex_async(request, headers, runtime)

    def create_lease_biznotary_ex(
        self,
        request: twc_models.CreateLeaseBiznotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseBiznotaryResponse:
        """
        Description: 租赁宝哈希存证
        Summary: 租赁宝哈希存证
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseBiznotaryResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.biznotary.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_biznotary_ex_async(
        self,
        request: twc_models.CreateLeaseBiznotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseBiznotaryResponse:
        """
        Description: 租赁宝哈希存证
        Summary: 租赁宝哈希存证
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseBiznotaryResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.biznotary.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_internal_contract(
        self,
        request: twc_models.CreateInternalContractRequest,
    ) -> twc_models.CreateInternalContractResponse:
        """
        Description: 合同内部文本存证
        Summary: 合同内部文本存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_internal_contract_ex(request, headers, runtime)

    async def create_internal_contract_async(
        self,
        request: twc_models.CreateInternalContractRequest,
    ) -> twc_models.CreateInternalContractResponse:
        """
        Description: 合同内部文本存证
        Summary: 合同内部文本存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_internal_contract_ex_async(request, headers, runtime)

    def create_internal_contract_ex(
        self,
        request: twc_models.CreateInternalContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateInternalContractResponse:
        """
        Description: 合同内部文本存证
        Summary: 合同内部文本存证
        """
        UtilClient.validate_model(request)
        return twc_models.CreateInternalContractResponse().from_map(
            self.do_request('1.0', 'twc.notary.internal.contract.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_internal_contract_ex_async(
        self,
        request: twc_models.CreateInternalContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateInternalContractResponse:
        """
        Description: 合同内部文本存证
        Summary: 合同内部文本存证
        """
        UtilClient.validate_model(request)
        return twc_models.CreateInternalContractResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.internal.contract.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_zftagreementsign(
        self,
        request: twc_models.CreateLeaseZftagreementsignRequest,
    ) -> twc_models.CreateLeaseZftagreementsignResponse:
        """
        Description: 资方上传网商直付通代扣协议核验结果
        Summary: 资方上传网商直付通代扣协议核验结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_zftagreementsign_ex(request, headers, runtime)

    async def create_lease_zftagreementsign_async(
        self,
        request: twc_models.CreateLeaseZftagreementsignRequest,
    ) -> twc_models.CreateLeaseZftagreementsignResponse:
        """
        Description: 资方上传网商直付通代扣协议核验结果
        Summary: 资方上传网商直付通代扣协议核验结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_zftagreementsign_ex_async(request, headers, runtime)

    def create_lease_zftagreementsign_ex(
        self,
        request: twc_models.CreateLeaseZftagreementsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseZftagreementsignResponse:
        """
        Description: 资方上传网商直付通代扣协议核验结果
        Summary: 资方上传网商直付通代扣协议核验结果
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseZftagreementsignResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.zftagreementsign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_zftagreementsign_ex_async(
        self,
        request: twc_models.CreateLeaseZftagreementsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseZftagreementsignResponse:
        """
        Description: 资方上传网商直付通代扣协议核验结果
        Summary: 资方上传网商直付通代扣协议核验结果
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseZftagreementsignResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.zftagreementsign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_zftagreementunsign(
        self,
        request: twc_models.CreateLeaseZftagreementunsignRequest,
    ) -> twc_models.CreateLeaseZftagreementunsignResponse:
        """
        Description: 资方上传网商直付通代扣协议解约相关信息
        Summary: 资方上传网商直付通代扣协议解约相关信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_zftagreementunsign_ex(request, headers, runtime)

    async def create_lease_zftagreementunsign_async(
        self,
        request: twc_models.CreateLeaseZftagreementunsignRequest,
    ) -> twc_models.CreateLeaseZftagreementunsignResponse:
        """
        Description: 资方上传网商直付通代扣协议解约相关信息
        Summary: 资方上传网商直付通代扣协议解约相关信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_zftagreementunsign_ex_async(request, headers, runtime)

    def create_lease_zftagreementunsign_ex(
        self,
        request: twc_models.CreateLeaseZftagreementunsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseZftagreementunsignResponse:
        """
        Description: 资方上传网商直付通代扣协议解约相关信息
        Summary: 资方上传网商直付通代扣协议解约相关信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseZftagreementunsignResponse().from_map(
            self.do_request('1.0', 'twc.notary.lease.zftagreementunsign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_zftagreementunsign_ex_async(
        self,
        request: twc_models.CreateLeaseZftagreementunsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseZftagreementunsignResponse:
        """
        Description: 资方上传网商直付通代扣协议解约相关信息
        Summary: 资方上传网商直付通代扣协议解约相关信息
        """
        UtilClient.validate_model(request)
        return twc_models.CreateLeaseZftagreementunsignResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.lease.zftagreementunsign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_certificate_detail(
        self,
        request: twc_models.GetCertificateDetailRequest,
    ) -> twc_models.GetCertificateDetailResponse:
        """
        Description: 获取蚂蚁链版存证证明
        Summary: 获取蚂蚁链版存证证明
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_certificate_detail_ex(request, headers, runtime)

    async def get_certificate_detail_async(
        self,
        request: twc_models.GetCertificateDetailRequest,
    ) -> twc_models.GetCertificateDetailResponse:
        """
        Description: 获取蚂蚁链版存证证明
        Summary: 获取蚂蚁链版存证证明
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_certificate_detail_ex_async(request, headers, runtime)

    def get_certificate_detail_ex(
        self,
        request: twc_models.GetCertificateDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetCertificateDetailResponse:
        """
        Description: 获取蚂蚁链版存证证明
        Summary: 获取蚂蚁链版存证证明
        """
        UtilClient.validate_model(request)
        return twc_models.GetCertificateDetailResponse().from_map(
            self.do_request('1.0', 'twc.notary.certificate.detail.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_certificate_detail_ex_async(
        self,
        request: twc_models.GetCertificateDetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetCertificateDetailResponse:
        """
        Description: 获取蚂蚁链版存证证明
        Summary: 获取蚂蚁链版存证证明
        """
        UtilClient.validate_model(request)
        return twc_models.GetCertificateDetailResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.certificate.detail.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_internal_text(
        self,
        request: twc_models.GetInternalTextRequest,
    ) -> twc_models.GetInternalTextResponse:
        """
        Description: 用户通过交易哈希获取自己上传的文本存证内容
        Summary: 获取文本存证内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_internal_text_ex(request, headers, runtime)

    async def get_internal_text_async(
        self,
        request: twc_models.GetInternalTextRequest,
    ) -> twc_models.GetInternalTextResponse:
        """
        Description: 用户通过交易哈希获取自己上传的文本存证内容
        Summary: 获取文本存证内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_internal_text_ex_async(request, headers, runtime)

    def get_internal_text_ex(
        self,
        request: twc_models.GetInternalTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetInternalTextResponse:
        """
        Description: 用户通过交易哈希获取自己上传的文本存证内容
        Summary: 获取文本存证内容
        """
        UtilClient.validate_model(request)
        return twc_models.GetInternalTextResponse().from_map(
            self.do_request('1.0', 'twc.notary.internal.text.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_internal_text_ex_async(
        self,
        request: twc_models.GetInternalTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetInternalTextResponse:
        """
        Description: 用户通过交易哈希获取自己上传的文本存证内容
        Summary: 获取文本存证内容
        """
        UtilClient.validate_model(request)
        return twc_models.GetInternalTextResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.internal.text.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def open_internal_twc(
        self,
        request: twc_models.OpenInternalTwcRequest,
    ) -> twc_models.OpenInternalTwcResponse:
        """
        Description: 三方服务获取开通权限，标记开通状态。
        Summary: 三方服务获取开通权限，标记开通状态。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.open_internal_twc_ex(request, headers, runtime)

    async def open_internal_twc_async(
        self,
        request: twc_models.OpenInternalTwcRequest,
    ) -> twc_models.OpenInternalTwcResponse:
        """
        Description: 三方服务获取开通权限，标记开通状态。
        Summary: 三方服务获取开通权限，标记开通状态。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.open_internal_twc_ex_async(request, headers, runtime)

    def open_internal_twc_ex(
        self,
        request: twc_models.OpenInternalTwcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.OpenInternalTwcResponse:
        """
        Description: 三方服务获取开通权限，标记开通状态。
        Summary: 三方服务获取开通权限，标记开通状态。
        """
        UtilClient.validate_model(request)
        return twc_models.OpenInternalTwcResponse().from_map(
            self.do_request('1.0', 'twc.notary.internal.twc.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def open_internal_twc_ex_async(
        self,
        request: twc_models.OpenInternalTwcRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.OpenInternalTwcResponse:
        """
        Description: 三方服务获取开通权限，标记开通状态。
        Summary: 三方服务获取开通权限，标记开通状态。
        """
        UtilClient.validate_model(request)
        return twc_models.OpenInternalTwcResponse().from_map(
            await self.do_request_async('1.0', 'twc.notary.internal.twc.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
