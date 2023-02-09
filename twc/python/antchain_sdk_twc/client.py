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
            # 司法纠纷平台通用文件信息结构体
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
                    'sdk_version': '1.8.29',
                    '_prod_code': 'TWC',
                    '_prod_channel': 'undefined'
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
            # 司法纠纷平台通用文件信息结构体
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
                    'sdk_version': '1.8.29',
                    '_prod_code': 'TWC',
                    '_prod_channel': 'undefined'
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
        return TeaCore.from_map(
            twc_models.CallbackArbitrationStatusResponse(),
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
        return TeaCore.from_map(
            twc_models.CallbackArbitrationStatusResponse(),
            await self.do_request_async('1.0', 'twc.notary.arbitration.status.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_arbitration_signstatus(
        self,
        request: twc_models.CallbackArbitrationSignstatusRequest,
    ) -> twc_models.CallbackArbitrationSignstatusResponse:
        """
        Description: 仲裁签署状态信息变更回调接口
        Summary: 仲裁签署状态信息变更回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_arbitration_signstatus_ex(request, headers, runtime)

    async def callback_arbitration_signstatus_async(
        self,
        request: twc_models.CallbackArbitrationSignstatusRequest,
    ) -> twc_models.CallbackArbitrationSignstatusResponse:
        """
        Description: 仲裁签署状态信息变更回调接口
        Summary: 仲裁签署状态信息变更回调接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_arbitration_signstatus_ex_async(request, headers, runtime)

    def callback_arbitration_signstatus_ex(
        self,
        request: twc_models.CallbackArbitrationSignstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CallbackArbitrationSignstatusResponse:
        """
        Description: 仲裁签署状态信息变更回调接口
        Summary: 仲裁签署状态信息变更回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CallbackArbitrationSignstatusResponse(),
            self.do_request('1.0', 'twc.notary.arbitration.signstatus.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_arbitration_signstatus_ex_async(
        self,
        request: twc_models.CallbackArbitrationSignstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CallbackArbitrationSignstatusResponse:
        """
        Description: 仲裁签署状态信息变更回调接口
        Summary: 仲裁签署状态信息变更回调接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CallbackArbitrationSignstatusResponse(),
            await self.do_request_async('1.0', 'twc.notary.arbitration.signstatus.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
        return TeaCore.from_map(
            twc_models.CreateContractAccountResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractAccountResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractAccountsealResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractAccountsealResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractOrganizationResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractOrganizationResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractOrgsealResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractOrgsealResponse(),
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
        return TeaCore.from_map(
            twc_models.AuthContractSignResponse(),
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
        return TeaCore.from_map(
            twc_models.AuthContractSignResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractTemplateResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractTemplateResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractFlowResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractFlowResponse(),
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
        return TeaCore.from_map(
            twc_models.AddContractDocumentResponse(),
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
        return TeaCore.from_map(
            twc_models.AddContractDocumentResponse(),
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
        return TeaCore.from_map(
            twc_models.AddContractSignfieldResponse(),
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
        return TeaCore.from_map(
            twc_models.AddContractSignfieldResponse(),
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
        return TeaCore.from_map(
            twc_models.StartContractFlowResponse(),
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
        return TeaCore.from_map(
            twc_models.StartContractFlowResponse(),
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
        return TeaCore.from_map(
            twc_models.SaveContractFlowResponse(),
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
        return TeaCore.from_map(
            twc_models.SaveContractFlowResponse(),
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
        return TeaCore.from_map(
            twc_models.DownloadContractDocumentResponse(),
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
        return TeaCore.from_map(
            twc_models.DownloadContractDocumentResponse(),
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
        return TeaCore.from_map(
            twc_models.AddContractFileResponse(),
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
        return TeaCore.from_map(
            twc_models.AddContractFileResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractPlatformResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractPlatformResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractUserResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractUserResponse(),
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
        return TeaCore.from_map(
            twc_models.StartContractHandsignResponse(),
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
        return TeaCore.from_map(
            twc_models.StartContractHandsignResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractFlowResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractFlowResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractAccountsealimageResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractAccountsealimageResponse(),
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
        return TeaCore.from_map(
            twc_models.GetContractFileuploadurlResponse(),
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
        return TeaCore.from_map(
            twc_models.GetContractFileuploadurlResponse(),
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
        return TeaCore.from_map(
            twc_models.AddContractPlatformsignfieldsResponse(),
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
        return TeaCore.from_map(
            twc_models.AddContractPlatformsignfieldsResponse(),
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
        return TeaCore.from_map(
            twc_models.GetContractFileResponse(),
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
        return TeaCore.from_map(
            twc_models.GetContractFileResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractAccountsealsResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractAccountsealsResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractOrganizationsealsResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractOrganizationsealsResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractFlowsignerResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractFlowsignerResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractSignfieldsResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractSignfieldsResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractAccountResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractAccountResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractOrganizationResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractOrganizationResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractTemplateResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractTemplateResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractSignflowResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractSignflowResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractRegisterzftResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractRegisterzftResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractPlatformtemplateResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractPlatformtemplateResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractMerchantzftResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractMerchantzftResponse(),
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
        return TeaCore.from_map(
            twc_models.ListContractOuttradeidResponse(),
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
        return TeaCore.from_map(
            twc_models.ListContractOuttradeidResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractTradedetailResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractTradedetailResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractMerchantrefundResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractMerchantrefundResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractAdminaccountResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractAdminaccountResponse(),
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
        return TeaCore.from_map(
            twc_models.ListContractTradeidsResponse(),
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
        return TeaCore.from_map(
            twc_models.ListContractTradeidsResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractCommontriggerResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractCommontriggerResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractMerchantindirectzftResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractMerchantindirectzftResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractMerchantindirectzftResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractMerchantindirectzftResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryPayresultfileurlResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryPayresultfileurlResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractMerchantimageResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractMerchantimageResponse(),
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
        return TeaCore.from_map(
            twc_models.CancelContractPaytradeResponse(),
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
        return TeaCore.from_map(
            twc_models.CancelContractPaytradeResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractHandsignflowResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractHandsignflowResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractHandsignfieldResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractHandsignfieldResponse(),
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
        return TeaCore.from_map(
            twc_models.GetContractSignurlResponse(),
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
        return TeaCore.from_map(
            twc_models.GetContractSignurlResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateWithholdAgreementResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateWithholdAgreementResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryWithholdAgreementResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryWithholdAgreementResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryWithholdAgreementurlResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryWithholdAgreementurlResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateWithholdOverduetimeResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateWithholdOverduetimeResponse(),
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
        return TeaCore.from_map(
            twc_models.SendWithholdDeductResponse(),
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
        return TeaCore.from_map(
            twc_models.SendWithholdDeductResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryWithholdPayresultResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryWithholdPayresultResponse(),
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
        return TeaCore.from_map(
            twc_models.SendWithholdRefundResponse(),
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
        return TeaCore.from_map(
            twc_models.SendWithholdRefundResponse(),
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
        return TeaCore.from_map(
            twc_models.SendContractInvitationResponse(),
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
        return TeaCore.from_map(
            twc_models.SendContractInvitationResponse(),
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
        return TeaCore.from_map(
            twc_models.ListContractPayruleResponse(),
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
        return TeaCore.from_map(
            twc_models.ListContractPayruleResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateWithholdQrcodeResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateWithholdQrcodeResponse(),
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
        return TeaCore.from_map(
            twc_models.CancelContractPaysingletradeResponse(),
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
        return TeaCore.from_map(
            twc_models.CancelContractPaysingletradeResponse(),
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
        return TeaCore.from_map(
            twc_models.ApplyContractCallbackkeyResponse(),
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
        return TeaCore.from_map(
            twc_models.ApplyContractCallbackkeyResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractOnestepflowResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractOnestepflowResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractNotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractNotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateEcocontractTransResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateEcocontractTransResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateEcocontractTextResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateEcocontractTextResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractWordspositionResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractWordspositionResponse(),
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
        return TeaCore.from_map(
            twc_models.DeleteContractSignerResponse(),
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
        return TeaCore.from_map(
            twc_models.DeleteContractSignerResponse(),
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
        return TeaCore.from_map(
            twc_models.GetContractCertificateResponse(),
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
        return TeaCore.from_map(
            twc_models.GetContractCertificateResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractSignfieldsealidResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryContractSignfieldsealidResponse(),
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
        return TeaCore.from_map(
            twc_models.NotifyContractSignerResponse(),
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
        return TeaCore.from_map(
            twc_models.NotifyContractSignerResponse(),
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
        return TeaCore.from_map(
            twc_models.UpdateContractPlatformResponse(),
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
        return TeaCore.from_map(
            twc_models.UpdateContractPlatformResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.platform.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_contract_user(
        self,
        request: twc_models.UpdateContractUserRequest,
    ) -> twc_models.UpdateContractUserResponse:
        """
        Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
        Summary: 修改用户注册信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_contract_user_ex(request, headers, runtime)

    async def update_contract_user_async(
        self,
        request: twc_models.UpdateContractUserRequest,
    ) -> twc_models.UpdateContractUserResponse:
        """
        Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
        Summary: 修改用户注册信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_contract_user_ex_async(request, headers, runtime)

    def update_contract_user_ex(
        self,
        request: twc_models.UpdateContractUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateContractUserResponse:
        """
        Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
        Summary: 修改用户注册信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.UpdateContractUserResponse(),
            self.do_request('1.0', 'twc.notary.contract.user.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_contract_user_ex_async(
        self,
        request: twc_models.UpdateContractUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateContractUserResponse:
        """
        Description: 个人的注册信息中证件信息为空时允许修改姓名、证件等各项信息，如果不为空，则不允许修改
        Summary: 修改用户注册信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.UpdateContractUserResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.user.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
        return TeaCore.from_map(
            twc_models.UpdateContractOrganizationResponse(),
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
        return TeaCore.from_map(
            twc_models.UpdateContractOrganizationResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.organization.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_contract_merchant(
        self,
        request: twc_models.ApplyContractMerchantRequest,
    ) -> twc_models.ApplyContractMerchantResponse:
        """
        Description: 商户入驻直付通新接口，通过此接口创建的商户，签约模式默认走单独签约授权模式（即不同商户都需要进行单独的代扣签约授权）。
        Summary: 商户入驻直付通新接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_contract_merchant_ex(request, headers, runtime)

    async def apply_contract_merchant_async(
        self,
        request: twc_models.ApplyContractMerchantRequest,
    ) -> twc_models.ApplyContractMerchantResponse:
        """
        Description: 商户入驻直付通新接口，通过此接口创建的商户，签约模式默认走单独签约授权模式（即不同商户都需要进行单独的代扣签约授权）。
        Summary: 商户入驻直付通新接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_contract_merchant_ex_async(request, headers, runtime)

    def apply_contract_merchant_ex(
        self,
        request: twc_models.ApplyContractMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyContractMerchantResponse:
        """
        Description: 商户入驻直付通新接口，通过此接口创建的商户，签约模式默认走单独签约授权模式（即不同商户都需要进行单独的代扣签约授权）。
        Summary: 商户入驻直付通新接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ApplyContractMerchantResponse(),
            self.do_request('1.0', 'twc.notary.contract.merchant.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_contract_merchant_ex_async(
        self,
        request: twc_models.ApplyContractMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyContractMerchantResponse:
        """
        Description: 商户入驻直付通新接口，通过此接口创建的商户，签约模式默认走单独签约授权模式（即不同商户都需要进行单独的代扣签约授权）。
        Summary: 商户入驻直付通新接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ApplyContractMerchantResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.merchant.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_contract_merchant(
        self,
        request: twc_models.ConfirmContractMerchantRequest,
    ) -> twc_models.ConfirmContractMerchantResponse:
        """
        Description: 直付通商户入驻确认（确认成功则表明入驻成功）
        Summary: 直付通商户入驻确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_contract_merchant_ex(request, headers, runtime)

    async def confirm_contract_merchant_async(
        self,
        request: twc_models.ConfirmContractMerchantRequest,
    ) -> twc_models.ConfirmContractMerchantResponse:
        """
        Description: 直付通商户入驻确认（确认成功则表明入驻成功）
        Summary: 直付通商户入驻确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_contract_merchant_ex_async(request, headers, runtime)

    def confirm_contract_merchant_ex(
        self,
        request: twc_models.ConfirmContractMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ConfirmContractMerchantResponse:
        """
        Description: 直付通商户入驻确认（确认成功则表明入驻成功）
        Summary: 直付通商户入驻确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ConfirmContractMerchantResponse(),
            self.do_request('1.0', 'twc.notary.contract.merchant.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_contract_merchant_ex_async(
        self,
        request: twc_models.ConfirmContractMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ConfirmContractMerchantResponse:
        """
        Description: 直付通商户入驻确认（确认成功则表明入驻成功）
        Summary: 直付通商户入驻确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ConfirmContractMerchantResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.merchant.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_privatecontract_trans(
        self,
        request: twc_models.CreatePrivatecontractTransRequest,
    ) -> twc_models.CreatePrivatecontractTransResponse:
        """
        Description: 创建合同存证事务ID。私有云使用。
        Summary: 创建合同存证事务ID。私有云使用。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_privatecontract_trans_ex(request, headers, runtime)

    async def create_privatecontract_trans_async(
        self,
        request: twc_models.CreatePrivatecontractTransRequest,
    ) -> twc_models.CreatePrivatecontractTransResponse:
        """
        Description: 创建合同存证事务ID。私有云使用。
        Summary: 创建合同存证事务ID。私有云使用。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_privatecontract_trans_ex_async(request, headers, runtime)

    def create_privatecontract_trans_ex(
        self,
        request: twc_models.CreatePrivatecontractTransRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreatePrivatecontractTransResponse:
        """
        Description: 创建合同存证事务ID。私有云使用。
        Summary: 创建合同存证事务ID。私有云使用。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreatePrivatecontractTransResponse(),
            self.do_request('1.0', 'twc.notary.privatecontract.trans.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_privatecontract_trans_ex_async(
        self,
        request: twc_models.CreatePrivatecontractTransRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreatePrivatecontractTransResponse:
        """
        Description: 创建合同存证事务ID。私有云使用。
        Summary: 创建合同存证事务ID。私有云使用。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreatePrivatecontractTransResponse(),
            await self.do_request_async('1.0', 'twc.notary.privatecontract.trans.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_privatecontract_text(
        self,
        request: twc_models.CreatePrivatecontractTextRequest,
    ) -> twc_models.CreatePrivatecontractTextResponse:
        """
        Description: 合同文本存证。私有云使用。
        Summary: 合同文本存证。私有云使用。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_privatecontract_text_ex(request, headers, runtime)

    async def create_privatecontract_text_async(
        self,
        request: twc_models.CreatePrivatecontractTextRequest,
    ) -> twc_models.CreatePrivatecontractTextResponse:
        """
        Description: 合同文本存证。私有云使用。
        Summary: 合同文本存证。私有云使用。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_privatecontract_text_ex_async(request, headers, runtime)

    def create_privatecontract_text_ex(
        self,
        request: twc_models.CreatePrivatecontractTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreatePrivatecontractTextResponse:
        """
        Description: 合同文本存证。私有云使用。
        Summary: 合同文本存证。私有云使用。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreatePrivatecontractTextResponse(),
            self.do_request('1.0', 'twc.notary.privatecontract.text.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_privatecontract_text_ex_async(
        self,
        request: twc_models.CreatePrivatecontractTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreatePrivatecontractTextResponse:
        """
        Description: 合同文本存证。私有云使用。
        Summary: 合同文本存证。私有云使用。
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreatePrivatecontractTextResponse(),
            await self.do_request_async('1.0', 'twc.notary.privatecontract.text.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_privateperson_twometa(
        self,
        request: twc_models.VerifyPrivatepersonTwometaRequest,
    ) -> twc_models.VerifyPrivatepersonTwometaResponse:
        """
        Description: 个人二要素校验
        Summary: 个人二要素校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_privateperson_twometa_ex(request, headers, runtime)

    async def verify_privateperson_twometa_async(
        self,
        request: twc_models.VerifyPrivatepersonTwometaRequest,
    ) -> twc_models.VerifyPrivatepersonTwometaResponse:
        """
        Description: 个人二要素校验
        Summary: 个人二要素校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_privateperson_twometa_ex_async(request, headers, runtime)

    def verify_privateperson_twometa_ex(
        self,
        request: twc_models.VerifyPrivatepersonTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.VerifyPrivatepersonTwometaResponse:
        """
        Description: 个人二要素校验
        Summary: 个人二要素校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.VerifyPrivatepersonTwometaResponse(),
            self.do_request('1.0', 'twc.notary.privateperson.twometa.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_privateperson_twometa_ex_async(
        self,
        request: twc_models.VerifyPrivatepersonTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.VerifyPrivatepersonTwometaResponse:
        """
        Description: 个人二要素校验
        Summary: 个人二要素校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.VerifyPrivatepersonTwometaResponse(),
            await self.do_request_async('1.0', 'twc.notary.privateperson.twometa.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_privatecompany_twometa(
        self,
        request: twc_models.VerifyPrivatecompanyTwometaRequest,
    ) -> twc_models.VerifyPrivatecompanyTwometaResponse:
        """
        Description: 企业二要素校验
        Summary: 企业二要素校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_privatecompany_twometa_ex(request, headers, runtime)

    async def verify_privatecompany_twometa_async(
        self,
        request: twc_models.VerifyPrivatecompanyTwometaRequest,
    ) -> twc_models.VerifyPrivatecompanyTwometaResponse:
        """
        Description: 企业二要素校验
        Summary: 企业二要素校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_privatecompany_twometa_ex_async(request, headers, runtime)

    def verify_privatecompany_twometa_ex(
        self,
        request: twc_models.VerifyPrivatecompanyTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.VerifyPrivatecompanyTwometaResponse:
        """
        Description: 企业二要素校验
        Summary: 企业二要素校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.VerifyPrivatecompanyTwometaResponse(),
            self.do_request('1.0', 'twc.notary.privatecompany.twometa.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_privatecompany_twometa_ex_async(
        self,
        request: twc_models.VerifyPrivatecompanyTwometaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.VerifyPrivatecompanyTwometaResponse:
        """
        Description: 企业二要素校验
        Summary: 企业二要素校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.VerifyPrivatecompanyTwometaResponse(),
            await self.do_request_async('1.0', 'twc.notary.privatecompany.twometa.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_privatecompany_fourmeta(
        self,
        request: twc_models.VerifyPrivatecompanyFourmetaRequest,
    ) -> twc_models.VerifyPrivatecompanyFourmetaResponse:
        """
        Description: 企业四要素校验
        Summary: 企业四要素校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_privatecompany_fourmeta_ex(request, headers, runtime)

    async def verify_privatecompany_fourmeta_async(
        self,
        request: twc_models.VerifyPrivatecompanyFourmetaRequest,
    ) -> twc_models.VerifyPrivatecompanyFourmetaResponse:
        """
        Description: 企业四要素校验
        Summary: 企业四要素校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_privatecompany_fourmeta_ex_async(request, headers, runtime)

    def verify_privatecompany_fourmeta_ex(
        self,
        request: twc_models.VerifyPrivatecompanyFourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.VerifyPrivatecompanyFourmetaResponse:
        """
        Description: 企业四要素校验
        Summary: 企业四要素校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.VerifyPrivatecompanyFourmetaResponse(),
            self.do_request('1.0', 'twc.notary.privatecompany.fourmeta.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_privatecompany_fourmeta_ex_async(
        self,
        request: twc_models.VerifyPrivatecompanyFourmetaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.VerifyPrivatecompanyFourmetaResponse:
        """
        Description: 企业四要素校验
        Summary: 企业四要素校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.VerifyPrivatecompanyFourmetaResponse(),
            await self.do_request_async('1.0', 'twc.notary.privatecompany.fourmeta.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_privatecontract_cert(
        self,
        request: twc_models.ApplyPrivatecontractCertRequest,
    ) -> twc_models.ApplyPrivatecontractCertResponse:
        """
        Description: 开放给私有云的外部用户的注册接口.
        Summary: 私有云的外部用户注册接口.
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_privatecontract_cert_ex(request, headers, runtime)

    async def apply_privatecontract_cert_async(
        self,
        request: twc_models.ApplyPrivatecontractCertRequest,
    ) -> twc_models.ApplyPrivatecontractCertResponse:
        """
        Description: 开放给私有云的外部用户的注册接口.
        Summary: 私有云的外部用户注册接口.
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_privatecontract_cert_ex_async(request, headers, runtime)

    def apply_privatecontract_cert_ex(
        self,
        request: twc_models.ApplyPrivatecontractCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyPrivatecontractCertResponse:
        """
        Description: 开放给私有云的外部用户的注册接口.
        Summary: 私有云的外部用户注册接口.
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ApplyPrivatecontractCertResponse(),
            self.do_request('1.0', 'twc.notary.privatecontract.cert.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_privatecontract_cert_ex_async(
        self,
        request: twc_models.ApplyPrivatecontractCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyPrivatecontractCertResponse:
        """
        Description: 开放给私有云的外部用户的注册接口.
        Summary: 私有云的外部用户注册接口.
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ApplyPrivatecontractCertResponse(),
            await self.do_request_async('1.0', 'twc.notary.privatecontract.cert.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_tradestatus(
        self,
        request: twc_models.QueryContractTradestatusRequest,
    ) -> twc_models.QueryContractTradestatusResponse:
        """
        Description: 代扣计划状态查询接口，仅能查询到由新状态机执行的代扣计划，未切换到新状态机的老数据查询不到
        Summary: 代扣计划状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_tradestatus_ex(request, headers, runtime)

    async def query_contract_tradestatus_async(
        self,
        request: twc_models.QueryContractTradestatusRequest,
    ) -> twc_models.QueryContractTradestatusResponse:
        """
        Description: 代扣计划状态查询接口，仅能查询到由新状态机执行的代扣计划，未切换到新状态机的老数据查询不到
        Summary: 代扣计划状态查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_tradestatus_ex_async(request, headers, runtime)

    def query_contract_tradestatus_ex(
        self,
        request: twc_models.QueryContractTradestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractTradestatusResponse:
        """
        Description: 代扣计划状态查询接口，仅能查询到由新状态机执行的代扣计划，未切换到新状态机的老数据查询不到
        Summary: 代扣计划状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryContractTradestatusResponse(),
            self.do_request('1.0', 'twc.notary.contract.tradestatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_tradestatus_ex_async(
        self,
        request: twc_models.QueryContractTradestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractTradestatusResponse:
        """
        Description: 代扣计划状态查询接口，仅能查询到由新状态机执行的代扣计划，未切换到新状态机的老数据查询不到
        Summary: 代扣计划状态查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryContractTradestatusResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.tradestatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_refund(
        self,
        request: twc_models.QueryContractRefundRequest,
    ) -> twc_models.QueryContractRefundResponse:
        """
        Description: 代扣退款查询，仅支持新代扣状态机处理过的数据，老状态机处理的数据无法查到。
        Summary: 代扣退款查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_refund_ex(request, headers, runtime)

    async def query_contract_refund_async(
        self,
        request: twc_models.QueryContractRefundRequest,
    ) -> twc_models.QueryContractRefundResponse:
        """
        Description: 代扣退款查询，仅支持新代扣状态机处理过的数据，老状态机处理的数据无法查到。
        Summary: 代扣退款查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_refund_ex_async(request, headers, runtime)

    def query_contract_refund_ex(
        self,
        request: twc_models.QueryContractRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractRefundResponse:
        """
        Description: 代扣退款查询，仅支持新代扣状态机处理过的数据，老状态机处理的数据无法查到。
        Summary: 代扣退款查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryContractRefundResponse(),
            self.do_request('1.0', 'twc.notary.contract.refund.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_refund_ex_async(
        self,
        request: twc_models.QueryContractRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractRefundResponse:
        """
        Description: 代扣退款查询，仅支持新代扣状态机处理过的数据，老状态机处理的数据无法查到。
        Summary: 代扣退款查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryContractRefundResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.refund.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_privatecontract_signurl(
        self,
        request: twc_models.GetPrivatecontractSignurlRequest,
    ) -> twc_models.GetPrivatecontractSignurlResponse:
        """
        Description: 私有云合同服务通过调用公有云合同服务，获取可公网访问的外部客户的签署地址
        Summary: 私有云服务获取外部用户签署地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_privatecontract_signurl_ex(request, headers, runtime)

    async def get_privatecontract_signurl_async(
        self,
        request: twc_models.GetPrivatecontractSignurlRequest,
    ) -> twc_models.GetPrivatecontractSignurlResponse:
        """
        Description: 私有云合同服务通过调用公有云合同服务，获取可公网访问的外部客户的签署地址
        Summary: 私有云服务获取外部用户签署地址
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_privatecontract_signurl_ex_async(request, headers, runtime)

    def get_privatecontract_signurl_ex(
        self,
        request: twc_models.GetPrivatecontractSignurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetPrivatecontractSignurlResponse:
        """
        Description: 私有云合同服务通过调用公有云合同服务，获取可公网访问的外部客户的签署地址
        Summary: 私有云服务获取外部用户签署地址
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.GetPrivatecontractSignurlResponse(),
            self.do_request('1.0', 'twc.notary.privatecontract.signurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_privatecontract_signurl_ex_async(
        self,
        request: twc_models.GetPrivatecontractSignurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetPrivatecontractSignurlResponse:
        """
        Description: 私有云合同服务通过调用公有云合同服务，获取可公网访问的外部客户的签署地址
        Summary: 私有云服务获取外部用户签署地址
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.GetPrivatecontractSignurlResponse(),
            await self.do_request_async('1.0', 'twc.notary.privatecontract.signurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_merchantorder(
        self,
        request: twc_models.QueryContractMerchantorderRequest,
    ) -> twc_models.QueryContractMerchantorderResponse:
        """
        Description: 商户入驻直付通进度查询，替代twc.notary.contract.merchantindirectzft.query
        Summary: 商户入驻直付通进度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_merchantorder_ex(request, headers, runtime)

    async def query_contract_merchantorder_async(
        self,
        request: twc_models.QueryContractMerchantorderRequest,
    ) -> twc_models.QueryContractMerchantorderResponse:
        """
        Description: 商户入驻直付通进度查询，替代twc.notary.contract.merchantindirectzft.query
        Summary: 商户入驻直付通进度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_merchantorder_ex_async(request, headers, runtime)

    def query_contract_merchantorder_ex(
        self,
        request: twc_models.QueryContractMerchantorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractMerchantorderResponse:
        """
        Description: 商户入驻直付通进度查询，替代twc.notary.contract.merchantindirectzft.query
        Summary: 商户入驻直付通进度查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryContractMerchantorderResponse(),
            self.do_request('1.0', 'twc.notary.contract.merchantorder.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_merchantorder_ex_async(
        self,
        request: twc_models.QueryContractMerchantorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractMerchantorderResponse:
        """
        Description: 商户入驻直付通进度查询，替代twc.notary.contract.merchantindirectzft.query
        Summary: 商户入驻直付通进度查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryContractMerchantorderResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.merchantorder.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_contract_merchant(
        self,
        request: twc_models.UpdateContractMerchantRequest,
    ) -> twc_models.UpdateContractMerchantResponse:
        """
        Description: 修改商户进件信息，单商户可能被多个用户代理，信息修改会生效到所有代理用户上。
        Summary: 商户进件信息修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_contract_merchant_ex(request, headers, runtime)

    async def update_contract_merchant_async(
        self,
        request: twc_models.UpdateContractMerchantRequest,
    ) -> twc_models.UpdateContractMerchantResponse:
        """
        Description: 修改商户进件信息，单商户可能被多个用户代理，信息修改会生效到所有代理用户上。
        Summary: 商户进件信息修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_contract_merchant_ex_async(request, headers, runtime)

    def update_contract_merchant_ex(
        self,
        request: twc_models.UpdateContractMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateContractMerchantResponse:
        """
        Description: 修改商户进件信息，单商户可能被多个用户代理，信息修改会生效到所有代理用户上。
        Summary: 商户进件信息修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.UpdateContractMerchantResponse(),
            self.do_request('1.0', 'twc.notary.contract.merchant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_contract_merchant_ex_async(
        self,
        request: twc_models.UpdateContractMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdateContractMerchantResponse:
        """
        Description: 修改商户进件信息，单商户可能被多个用户代理，信息修改会生效到所有代理用户上。
        Summary: 商户进件信息修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.UpdateContractMerchantResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.merchant.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def bind_contract_merchant(
        self,
        request: twc_models.BindContractMerchantRequest,
    ) -> twc_models.BindContractMerchantResponse:
        """
        Description: 一个二级商户可以挂接多个平台方用户，此接口可以对已进件的商户进行挂接操作。
        Summary: 二级商户代理挂接接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.bind_contract_merchant_ex(request, headers, runtime)

    async def bind_contract_merchant_async(
        self,
        request: twc_models.BindContractMerchantRequest,
    ) -> twc_models.BindContractMerchantResponse:
        """
        Description: 一个二级商户可以挂接多个平台方用户，此接口可以对已进件的商户进行挂接操作。
        Summary: 二级商户代理挂接接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.bind_contract_merchant_ex_async(request, headers, runtime)

    def bind_contract_merchant_ex(
        self,
        request: twc_models.BindContractMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.BindContractMerchantResponse:
        """
        Description: 一个二级商户可以挂接多个平台方用户，此接口可以对已进件的商户进行挂接操作。
        Summary: 二级商户代理挂接接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.BindContractMerchantResponse(),
            self.do_request('1.0', 'twc.notary.contract.merchant.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def bind_contract_merchant_ex_async(
        self,
        request: twc_models.BindContractMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.BindContractMerchantResponse:
        """
        Description: 一个二级商户可以挂接多个平台方用户，此接口可以对已进件的商户进行挂接操作。
        Summary: 二级商户代理挂接接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.BindContractMerchantResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.merchant.bind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_privatecontract_intance(
        self,
        request: twc_models.InitPrivatecontractIntanceRequest,
    ) -> twc_models.InitPrivatecontractIntanceResponse:
        """
        Description: 初始化私有化合同服务实例，生成服务验签的公/私钥，以及回调使用的公/私钥
        Summary: 初始化新的私有化合同服务实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_privatecontract_intance_ex(request, headers, runtime)

    async def init_privatecontract_intance_async(
        self,
        request: twc_models.InitPrivatecontractIntanceRequest,
    ) -> twc_models.InitPrivatecontractIntanceResponse:
        """
        Description: 初始化私有化合同服务实例，生成服务验签的公/私钥，以及回调使用的公/私钥
        Summary: 初始化新的私有化合同服务实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_privatecontract_intance_ex_async(request, headers, runtime)

    def init_privatecontract_intance_ex(
        self,
        request: twc_models.InitPrivatecontractIntanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.InitPrivatecontractIntanceResponse:
        """
        Description: 初始化私有化合同服务实例，生成服务验签的公/私钥，以及回调使用的公/私钥
        Summary: 初始化新的私有化合同服务实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.InitPrivatecontractIntanceResponse(),
            self.do_request('1.0', 'twc.notary.privatecontract.intance.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_privatecontract_intance_ex_async(
        self,
        request: twc_models.InitPrivatecontractIntanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.InitPrivatecontractIntanceResponse:
        """
        Description: 初始化私有化合同服务实例，生成服务验签的公/私钥，以及回调使用的公/私钥
        Summary: 初始化新的私有化合同服务实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.InitPrivatecontractIntanceResponse(),
            await self.do_request_async('1.0', 'twc.notary.privatecontract.intance.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_privatecontract_intance(
        self,
        request: twc_models.UpdatePrivatecontractIntanceRequest,
    ) -> twc_models.UpdatePrivatecontractIntanceResponse:
        """
        Description: 更新已有的私有化合同服务实例信息，如私有化服务地址
        Summary: 更新私有化合同服务实例信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_privatecontract_intance_ex(request, headers, runtime)

    async def update_privatecontract_intance_async(
        self,
        request: twc_models.UpdatePrivatecontractIntanceRequest,
    ) -> twc_models.UpdatePrivatecontractIntanceResponse:
        """
        Description: 更新已有的私有化合同服务实例信息，如私有化服务地址
        Summary: 更新私有化合同服务实例信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_privatecontract_intance_ex_async(request, headers, runtime)

    def update_privatecontract_intance_ex(
        self,
        request: twc_models.UpdatePrivatecontractIntanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdatePrivatecontractIntanceResponse:
        """
        Description: 更新已有的私有化合同服务实例信息，如私有化服务地址
        Summary: 更新私有化合同服务实例信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.UpdatePrivatecontractIntanceResponse(),
            self.do_request('1.0', 'twc.notary.privatecontract.intance.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_privatecontract_intance_ex_async(
        self,
        request: twc_models.UpdatePrivatecontractIntanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdatePrivatecontractIntanceResponse:
        """
        Description: 更新已有的私有化合同服务实例信息，如私有化服务地址
        Summary: 更新私有化合同服务实例信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.UpdatePrivatecontractIntanceResponse(),
            await self.do_request_async('1.0', 'twc.notary.privatecontract.intance.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_privatecontract_cert(
        self,
        request: twc_models.UpdatePrivatecontractCertRequest,
    ) -> twc_models.UpdatePrivatecontractCertResponse:
        """
        Description: 开放给私有云的外部用户的证书更新接口.
        Summary: 私有云用户证书更新接口.
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_privatecontract_cert_ex(request, headers, runtime)

    async def update_privatecontract_cert_async(
        self,
        request: twc_models.UpdatePrivatecontractCertRequest,
    ) -> twc_models.UpdatePrivatecontractCertResponse:
        """
        Description: 开放给私有云的外部用户的证书更新接口.
        Summary: 私有云用户证书更新接口.
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_privatecontract_cert_ex_async(request, headers, runtime)

    def update_privatecontract_cert_ex(
        self,
        request: twc_models.UpdatePrivatecontractCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdatePrivatecontractCertResponse:
        """
        Description: 开放给私有云的外部用户的证书更新接口.
        Summary: 私有云用户证书更新接口.
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.UpdatePrivatecontractCertResponse(),
            self.do_request('1.0', 'twc.notary.privatecontract.cert.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_privatecontract_cert_ex_async(
        self,
        request: twc_models.UpdatePrivatecontractCertRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UpdatePrivatecontractCertResponse:
        """
        Description: 开放给私有云的外部用户的证书更新接口.
        Summary: 私有云用户证书更新接口.
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.UpdatePrivatecontractCertResponse(),
            await self.do_request_async('1.0', 'twc.notary.privatecontract.cert.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def reset_contract_merchantapply(
        self,
        request: twc_models.ResetContractMerchantapplyRequest,
    ) -> twc_models.ResetContractMerchantapplyResponse:
        """
        Description: 修改商户进件申请信息状态数据，只允许超管租户操作
        Summary: 商户进件申请信息重置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.reset_contract_merchantapply_ex(request, headers, runtime)

    async def reset_contract_merchantapply_async(
        self,
        request: twc_models.ResetContractMerchantapplyRequest,
    ) -> twc_models.ResetContractMerchantapplyResponse:
        """
        Description: 修改商户进件申请信息状态数据，只允许超管租户操作
        Summary: 商户进件申请信息重置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.reset_contract_merchantapply_ex_async(request, headers, runtime)

    def reset_contract_merchantapply_ex(
        self,
        request: twc_models.ResetContractMerchantapplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ResetContractMerchantapplyResponse:
        """
        Description: 修改商户进件申请信息状态数据，只允许超管租户操作
        Summary: 商户进件申请信息重置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ResetContractMerchantapplyResponse(),
            self.do_request('1.0', 'twc.notary.contract.merchantapply.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def reset_contract_merchantapply_ex_async(
        self,
        request: twc_models.ResetContractMerchantapplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ResetContractMerchantapplyResponse:
        """
        Description: 修改商户进件申请信息状态数据，只允许超管租户操作
        Summary: 商户进件申请信息重置
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ResetContractMerchantapplyResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.merchantapply.reset', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_privatecontract_provision(
        self,
        request: twc_models.CheckPrivatecontractProvisionRequest,
    ) -> twc_models.CheckPrivatecontractProvisionResponse:
        """
        Description: 内部接口，校验私有化合同服务实例权限状态，可能为开通/释放/恢复/停服等
        Summary: 校验私有化合同服务实例权限情况
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_privatecontract_provision_ex(request, headers, runtime)

    async def check_privatecontract_provision_async(
        self,
        request: twc_models.CheckPrivatecontractProvisionRequest,
    ) -> twc_models.CheckPrivatecontractProvisionResponse:
        """
        Description: 内部接口，校验私有化合同服务实例权限状态，可能为开通/释放/恢复/停服等
        Summary: 校验私有化合同服务实例权限情况
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_privatecontract_provision_ex_async(request, headers, runtime)

    def check_privatecontract_provision_ex(
        self,
        request: twc_models.CheckPrivatecontractProvisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckPrivatecontractProvisionResponse:
        """
        Description: 内部接口，校验私有化合同服务实例权限状态，可能为开通/释放/恢复/停服等
        Summary: 校验私有化合同服务实例权限情况
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CheckPrivatecontractProvisionResponse(),
            self.do_request('1.0', 'twc.notary.privatecontract.provision.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_privatecontract_provision_ex_async(
        self,
        request: twc_models.CheckPrivatecontractProvisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckPrivatecontractProvisionResponse:
        """
        Description: 内部接口，校验私有化合同服务实例权限状态，可能为开通/释放/恢复/停服等
        Summary: 校验私有化合同服务实例权限情况
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CheckPrivatecontractProvisionResponse(),
            await self.do_request_async('1.0', 'twc.notary.privatecontract.provision.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_privatecontract_gauge(
        self,
        request: twc_models.PushPrivatecontractGaugeRequest,
    ) -> twc_models.PushPrivatecontractGaugeResponse:
        """
        Description: 私有化合同服务实例计量数据推送
        Summary: 私有化合同服务实例计量数据推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_privatecontract_gauge_ex(request, headers, runtime)

    async def push_privatecontract_gauge_async(
        self,
        request: twc_models.PushPrivatecontractGaugeRequest,
    ) -> twc_models.PushPrivatecontractGaugeResponse:
        """
        Description: 私有化合同服务实例计量数据推送
        Summary: 私有化合同服务实例计量数据推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_privatecontract_gauge_ex_async(request, headers, runtime)

    def push_privatecontract_gauge_ex(
        self,
        request: twc_models.PushPrivatecontractGaugeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.PushPrivatecontractGaugeResponse:
        """
        Description: 私有化合同服务实例计量数据推送
        Summary: 私有化合同服务实例计量数据推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.PushPrivatecontractGaugeResponse(),
            self.do_request('1.0', 'twc.notary.privatecontract.gauge.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_privatecontract_gauge_ex_async(
        self,
        request: twc_models.PushPrivatecontractGaugeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.PushPrivatecontractGaugeResponse:
        """
        Description: 私有化合同服务实例计量数据推送
        Summary: 私有化合同服务实例计量数据推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.PushPrivatecontractGaugeResponse(),
            await self.do_request_async('1.0', 'twc.notary.privatecontract.gauge.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_contract_courtdeduct(
        self,
        request: twc_models.CheckContractCourtdeductRequest,
    ) -> twc_models.CheckContractCourtdeductResponse:
        """
        Description: 法院代扣链路，扣款前需要进行账户预校验，验证此接口是否可以进行付款
        Summary: 法院代扣账户扣款预校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_contract_courtdeduct_ex(request, headers, runtime)

    async def check_contract_courtdeduct_async(
        self,
        request: twc_models.CheckContractCourtdeductRequest,
    ) -> twc_models.CheckContractCourtdeductResponse:
        """
        Description: 法院代扣链路，扣款前需要进行账户预校验，验证此接口是否可以进行付款
        Summary: 法院代扣账户扣款预校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_contract_courtdeduct_ex_async(request, headers, runtime)

    def check_contract_courtdeduct_ex(
        self,
        request: twc_models.CheckContractCourtdeductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckContractCourtdeductResponse:
        """
        Description: 法院代扣链路，扣款前需要进行账户预校验，验证此接口是否可以进行付款
        Summary: 法院代扣账户扣款预校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CheckContractCourtdeductResponse(),
            self.do_request('1.0', 'twc.notary.contract.courtdeduct.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_contract_courtdeduct_ex_async(
        self,
        request: twc_models.CheckContractCourtdeductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckContractCourtdeductResponse:
        """
        Description: 法院代扣链路，扣款前需要进行账户预校验，验证此接口是否可以进行付款
        Summary: 法院代扣账户扣款预校验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CheckContractCourtdeductResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.courtdeduct.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_courtdeduct(
        self,
        request: twc_models.CreateContractCourtdeductRequest,
    ) -> twc_models.CreateContractCourtdeductResponse:
        """
        Description: 法院代扣计划创建
        Summary: 法院代扣计划创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_courtdeduct_ex(request, headers, runtime)

    async def create_contract_courtdeduct_async(
        self,
        request: twc_models.CreateContractCourtdeductRequest,
    ) -> twc_models.CreateContractCourtdeductResponse:
        """
        Description: 法院代扣计划创建
        Summary: 法院代扣计划创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_courtdeduct_ex_async(request, headers, runtime)

    def create_contract_courtdeduct_ex(
        self,
        request: twc_models.CreateContractCourtdeductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractCourtdeductResponse:
        """
        Description: 法院代扣计划创建
        Summary: 法院代扣计划创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateContractCourtdeductResponse(),
            self.do_request('1.0', 'twc.notary.contract.courtdeduct.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_courtdeduct_ex_async(
        self,
        request: twc_models.CreateContractCourtdeductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractCourtdeductResponse:
        """
        Description: 法院代扣计划创建
        Summary: 法院代扣计划创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateContractCourtdeductResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.courtdeduct.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_contract_courtdeduct(
        self,
        request: twc_models.ExecContractCourtdeductRequest,
    ) -> twc_models.ExecContractCourtdeductResponse:
        """
        Description: 法院代扣执行扣款
        Summary: 法院代扣执行扣款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_contract_courtdeduct_ex(request, headers, runtime)

    async def exec_contract_courtdeduct_async(
        self,
        request: twc_models.ExecContractCourtdeductRequest,
    ) -> twc_models.ExecContractCourtdeductResponse:
        """
        Description: 法院代扣执行扣款
        Summary: 法院代扣执行扣款
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_contract_courtdeduct_ex_async(request, headers, runtime)

    def exec_contract_courtdeduct_ex(
        self,
        request: twc_models.ExecContractCourtdeductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ExecContractCourtdeductResponse:
        """
        Description: 法院代扣执行扣款
        Summary: 法院代扣执行扣款
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ExecContractCourtdeductResponse(),
            self.do_request('1.0', 'twc.notary.contract.courtdeduct.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_contract_courtdeduct_ex_async(
        self,
        request: twc_models.ExecContractCourtdeductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ExecContractCourtdeductResponse:
        """
        Description: 法院代扣执行扣款
        Summary: 法院代扣执行扣款
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ExecContractCourtdeductResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.courtdeduct.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_contract_textsign(
        self,
        request: twc_models.GetContractTextsignRequest,
    ) -> twc_models.GetContractTextsignResponse:
        """
        Description: 文本签名
        Summary: 文本签接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_contract_textsign_ex(request, headers, runtime)

    async def get_contract_textsign_async(
        self,
        request: twc_models.GetContractTextsignRequest,
    ) -> twc_models.GetContractTextsignResponse:
        """
        Description: 文本签名
        Summary: 文本签接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_contract_textsign_ex_async(request, headers, runtime)

    def get_contract_textsign_ex(
        self,
        request: twc_models.GetContractTextsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetContractTextsignResponse:
        """
        Description: 文本签名
        Summary: 文本签接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.GetContractTextsignResponse(),
            self.do_request('1.0', 'twc.notary.contract.textsign.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_contract_textsign_ex_async(
        self,
        request: twc_models.GetContractTextsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetContractTextsignResponse:
        """
        Description: 文本签名
        Summary: 文本签接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.GetContractTextsignResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.textsign.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_contract_textsign(
        self,
        request: twc_models.VerifyContractTextsignRequest,
    ) -> twc_models.VerifyContractTextsignResponse:
        """
        Description: 文本验签
        Summary: 文本验签接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_contract_textsign_ex(request, headers, runtime)

    async def verify_contract_textsign_async(
        self,
        request: twc_models.VerifyContractTextsignRequest,
    ) -> twc_models.VerifyContractTextsignResponse:
        """
        Description: 文本验签
        Summary: 文本验签接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_contract_textsign_ex_async(request, headers, runtime)

    def verify_contract_textsign_ex(
        self,
        request: twc_models.VerifyContractTextsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.VerifyContractTextsignResponse:
        """
        Description: 文本验签
        Summary: 文本验签接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.VerifyContractTextsignResponse(),
            self.do_request('1.0', 'twc.notary.contract.textsign.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_contract_textsign_ex_async(
        self,
        request: twc_models.VerifyContractTextsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.VerifyContractTextsignResponse:
        """
        Description: 文本验签
        Summary: 文本验签接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.VerifyContractTextsignResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.textsign.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_contract_docsign(
        self,
        request: twc_models.VerifyContractDocsignRequest,
    ) -> twc_models.VerifyContractDocsignResponse:
        """
        Description: 文件签验签
        Summary: 文件签验签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_contract_docsign_ex(request, headers, runtime)

    async def verify_contract_docsign_async(
        self,
        request: twc_models.VerifyContractDocsignRequest,
    ) -> twc_models.VerifyContractDocsignResponse:
        """
        Description: 文件签验签
        Summary: 文件签验签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_contract_docsign_ex_async(request, headers, runtime)

    def verify_contract_docsign_ex(
        self,
        request: twc_models.VerifyContractDocsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.VerifyContractDocsignResponse:
        """
        Description: 文件签验签
        Summary: 文件签验签
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.VerifyContractDocsignResponse(),
            self.do_request('1.0', 'twc.notary.contract.docsign.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_contract_docsign_ex_async(
        self,
        request: twc_models.VerifyContractDocsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.VerifyContractDocsignResponse:
        """
        Description: 文件签验签
        Summary: 文件签验签
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.VerifyContractDocsignResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.docsign.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_contract_signfield(
        self,
        request: twc_models.DeleteContractSignfieldRequest,
    ) -> twc_models.DeleteContractSignfieldResponse:
        """
        Description: 删除签署区
        Summary: 删除签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_contract_signfield_ex(request, headers, runtime)

    async def delete_contract_signfield_async(
        self,
        request: twc_models.DeleteContractSignfieldRequest,
    ) -> twc_models.DeleteContractSignfieldResponse:
        """
        Description: 删除签署区
        Summary: 删除签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_contract_signfield_ex_async(request, headers, runtime)

    def delete_contract_signfield_ex(
        self,
        request: twc_models.DeleteContractSignfieldRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DeleteContractSignfieldResponse:
        """
        Description: 删除签署区
        Summary: 删除签署区
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.DeleteContractSignfieldResponse(),
            self.do_request('1.0', 'twc.notary.contract.signfield.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_contract_signfield_ex_async(
        self,
        request: twc_models.DeleteContractSignfieldRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DeleteContractSignfieldResponse:
        """
        Description: 删除签署区
        Summary: 删除签署区
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.DeleteContractSignfieldResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.signfield.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_encrypteduser(
        self,
        request: twc_models.CreateContractEncrypteduserRequest,
    ) -> twc_models.CreateContractEncrypteduserResponse:
        """
        Description: 创建平台方用户接口twc.notary.contract.user.create加密版
        Summary: 创建平台方用户加密版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_encrypteduser_ex(request, headers, runtime)

    async def create_contract_encrypteduser_async(
        self,
        request: twc_models.CreateContractEncrypteduserRequest,
    ) -> twc_models.CreateContractEncrypteduserResponse:
        """
        Description: 创建平台方用户接口twc.notary.contract.user.create加密版
        Summary: 创建平台方用户加密版
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_encrypteduser_ex_async(request, headers, runtime)

    def create_contract_encrypteduser_ex(
        self,
        request: twc_models.CreateContractEncrypteduserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractEncrypteduserResponse:
        """
        Description: 创建平台方用户接口twc.notary.contract.user.create加密版
        Summary: 创建平台方用户加密版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateContractEncrypteduserResponse(),
            self.do_request('1.0', 'twc.notary.contract.encrypteduser.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_encrypteduser_ex_async(
        self,
        request: twc_models.CreateContractEncrypteduserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractEncrypteduserResponse:
        """
        Description: 创建平台方用户接口twc.notary.contract.user.create加密版
        Summary: 创建平台方用户加密版
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateContractEncrypteduserResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.encrypteduser.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_contract_tenantkey(
        self,
        request: twc_models.SetContractTenantkeyRequest,
    ) -> twc_models.SetContractTenantkeyResponse:
        """
        Description: 用户需要同时设置解密密钥与通信秘钥才可使用文件解密服务；
        Summary: 用户密钥设置接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_contract_tenantkey_ex(request, headers, runtime)

    async def set_contract_tenantkey_async(
        self,
        request: twc_models.SetContractTenantkeyRequest,
    ) -> twc_models.SetContractTenantkeyResponse:
        """
        Description: 用户需要同时设置解密密钥与通信秘钥才可使用文件解密服务；
        Summary: 用户密钥设置接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_contract_tenantkey_ex_async(request, headers, runtime)

    def set_contract_tenantkey_ex(
        self,
        request: twc_models.SetContractTenantkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SetContractTenantkeyResponse:
        """
        Description: 用户需要同时设置解密密钥与通信秘钥才可使用文件解密服务；
        Summary: 用户密钥设置接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.SetContractTenantkeyResponse(),
            self.do_request('1.0', 'twc.notary.contract.tenantkey.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_contract_tenantkey_ex_async(
        self,
        request: twc_models.SetContractTenantkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SetContractTenantkeyResponse:
        """
        Description: 用户需要同时设置解密密钥与通信秘钥才可使用文件解密服务；
        Summary: 用户密钥设置接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.SetContractTenantkeyResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.tenantkey.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_contract_encryptedfileuploadurl(
        self,
        request: twc_models.GetContractEncryptedfileuploadurlRequest,
    ) -> twc_models.GetContractEncryptedfileuploadurlResponse:
        """
        Description: 获取加密文件上传链接
        Summary: 获取加密文件上传链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_contract_encryptedfileuploadurl_ex(request, headers, runtime)

    async def get_contract_encryptedfileuploadurl_async(
        self,
        request: twc_models.GetContractEncryptedfileuploadurlRequest,
    ) -> twc_models.GetContractEncryptedfileuploadurlResponse:
        """
        Description: 获取加密文件上传链接
        Summary: 获取加密文件上传链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_contract_encryptedfileuploadurl_ex_async(request, headers, runtime)

    def get_contract_encryptedfileuploadurl_ex(
        self,
        request: twc_models.GetContractEncryptedfileuploadurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetContractEncryptedfileuploadurlResponse:
        """
        Description: 获取加密文件上传链接
        Summary: 获取加密文件上传链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.GetContractEncryptedfileuploadurlResponse(),
            self.do_request('1.0', 'twc.notary.contract.encryptedfileuploadurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_contract_encryptedfileuploadurl_ex_async(
        self,
        request: twc_models.GetContractEncryptedfileuploadurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetContractEncryptedfileuploadurlResponse:
        """
        Description: 获取加密文件上传链接
        Summary: 获取加密文件上传链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.GetContractEncryptedfileuploadurlResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.encryptedfileuploadurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_contract_task(
        self,
        request: twc_models.CreateContractTaskRequest,
    ) -> twc_models.CreateContractTaskResponse:
        """
        Description: 创建异步任务
        Summary: 创建任务接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_contract_task_ex(request, headers, runtime)

    async def create_contract_task_async(
        self,
        request: twc_models.CreateContractTaskRequest,
    ) -> twc_models.CreateContractTaskResponse:
        """
        Description: 创建异步任务
        Summary: 创建任务接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_contract_task_ex_async(request, headers, runtime)

    def create_contract_task_ex(
        self,
        request: twc_models.CreateContractTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractTaskResponse:
        """
        Description: 创建异步任务
        Summary: 创建任务接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateContractTaskResponse(),
            self.do_request('1.0', 'twc.notary.contract.task.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_contract_task_ex_async(
        self,
        request: twc_models.CreateContractTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateContractTaskResponse:
        """
        Description: 创建异步任务
        Summary: 创建任务接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateContractTaskResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.task.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_task(
        self,
        request: twc_models.QueryContractTaskRequest,
    ) -> twc_models.QueryContractTaskResponse:
        """
        Description: 任务查询接口
        Summary: 任务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_task_ex(request, headers, runtime)

    async def query_contract_task_async(
        self,
        request: twc_models.QueryContractTaskRequest,
    ) -> twc_models.QueryContractTaskResponse:
        """
        Description: 任务查询接口
        Summary: 任务查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_task_ex_async(request, headers, runtime)

    def query_contract_task_ex(
        self,
        request: twc_models.QueryContractTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractTaskResponse:
        """
        Description: 任务查询接口
        Summary: 任务查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryContractTaskResponse(),
            self.do_request('1.0', 'twc.notary.contract.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_task_ex_async(
        self,
        request: twc_models.QueryContractTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractTaskResponse:
        """
        Description: 任务查询接口
        Summary: 任务查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryContractTaskResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_contract_pay(
        self,
        request: twc_models.ExecContractPayRequest,
    ) -> twc_models.ExecContractPayResponse:
        """
        Description: 合同代扣触发接口，每笔订单仅一天仅允许触发一次
        Summary: 合同代扣触发接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_contract_pay_ex(request, headers, runtime)

    async def exec_contract_pay_async(
        self,
        request: twc_models.ExecContractPayRequest,
    ) -> twc_models.ExecContractPayResponse:
        """
        Description: 合同代扣触发接口，每笔订单仅一天仅允许触发一次
        Summary: 合同代扣触发接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_contract_pay_ex_async(request, headers, runtime)

    def exec_contract_pay_ex(
        self,
        request: twc_models.ExecContractPayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ExecContractPayResponse:
        """
        Description: 合同代扣触发接口，每笔订单仅一天仅允许触发一次
        Summary: 合同代扣触发接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ExecContractPayResponse(),
            self.do_request('1.0', 'twc.notary.contract.pay.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_contract_pay_ex_async(
        self,
        request: twc_models.ExecContractPayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ExecContractPayResponse:
        """
        Description: 合同代扣触发接口，每笔订单仅一天仅允许触发一次
        Summary: 合同代扣触发接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ExecContractPayResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.pay.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unbind_contract_pay(
        self,
        request: twc_models.UnbindContractPayRequest,
    ) -> twc_models.UnbindContractPayResponse:
        """
        Description: 强制帮用户接触代扣协议，未执行成功的代扣会被取消，已执行成功的代扣不变。
        Summary: 代扣强制解约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unbind_contract_pay_ex(request, headers, runtime)

    async def unbind_contract_pay_async(
        self,
        request: twc_models.UnbindContractPayRequest,
    ) -> twc_models.UnbindContractPayResponse:
        """
        Description: 强制帮用户接触代扣协议，未执行成功的代扣会被取消，已执行成功的代扣不变。
        Summary: 代扣强制解约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unbind_contract_pay_ex_async(request, headers, runtime)

    def unbind_contract_pay_ex(
        self,
        request: twc_models.UnbindContractPayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UnbindContractPayResponse:
        """
        Description: 强制帮用户接触代扣协议，未执行成功的代扣会被取消，已执行成功的代扣不变。
        Summary: 代扣强制解约
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.UnbindContractPayResponse(),
            self.do_request('1.0', 'twc.notary.contract.pay.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unbind_contract_pay_ex_async(
        self,
        request: twc_models.UnbindContractPayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UnbindContractPayResponse:
        """
        Description: 强制帮用户接触代扣协议，未执行成功的代扣会被取消，已执行成功的代扣不变。
        Summary: 代扣强制解约
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.UnbindContractPayResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.pay.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_complain(
        self,
        request: twc_models.QueryContractComplainRequest,
    ) -> twc_models.QueryContractComplainResponse:
        """
        Description: 商户每次收到客户投诉回调通知，商户端均需要通过此接口来查询投诉数据。
        Summary: 投诉数据查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_complain_ex(request, headers, runtime)

    async def query_contract_complain_async(
        self,
        request: twc_models.QueryContractComplainRequest,
    ) -> twc_models.QueryContractComplainResponse:
        """
        Description: 商户每次收到客户投诉回调通知，商户端均需要通过此接口来查询投诉数据。
        Summary: 投诉数据查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_complain_ex_async(request, headers, runtime)

    def query_contract_complain_ex(
        self,
        request: twc_models.QueryContractComplainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractComplainResponse:
        """
        Description: 商户每次收到客户投诉回调通知，商户端均需要通过此接口来查询投诉数据。
        Summary: 投诉数据查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryContractComplainResponse(),
            self.do_request('1.0', 'twc.notary.contract.complain.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_complain_ex_async(
        self,
        request: twc_models.QueryContractComplainRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractComplainResponse:
        """
        Description: 商户每次收到客户投诉回调通知，商户端均需要通过此接口来查询投诉数据。
        Summary: 投诉数据查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryContractComplainResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.complain.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_contract_complainfeedback(
        self,
        request: twc_models.SendContractComplainfeedbackRequest,
    ) -> twc_models.SendContractComplainfeedbackResponse:
        """
        Description: 商家收到用户投诉后，可通过此接口进行投诉反馈。注意，只有当投诉单状态为MERCHANT_PROCESSING时，才允许商家进行投诉反馈。
        Summary: 投诉反馈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_contract_complainfeedback_ex(request, headers, runtime)

    async def send_contract_complainfeedback_async(
        self,
        request: twc_models.SendContractComplainfeedbackRequest,
    ) -> twc_models.SendContractComplainfeedbackResponse:
        """
        Description: 商家收到用户投诉后，可通过此接口进行投诉反馈。注意，只有当投诉单状态为MERCHANT_PROCESSING时，才允许商家进行投诉反馈。
        Summary: 投诉反馈
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_contract_complainfeedback_ex_async(request, headers, runtime)

    def send_contract_complainfeedback_ex(
        self,
        request: twc_models.SendContractComplainfeedbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SendContractComplainfeedbackResponse:
        """
        Description: 商家收到用户投诉后，可通过此接口进行投诉反馈。注意，只有当投诉单状态为MERCHANT_PROCESSING时，才允许商家进行投诉反馈。
        Summary: 投诉反馈
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.SendContractComplainfeedbackResponse(),
            self.do_request('1.0', 'twc.notary.contract.complainfeedback.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_contract_complainfeedback_ex_async(
        self,
        request: twc_models.SendContractComplainfeedbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SendContractComplainfeedbackResponse:
        """
        Description: 商家收到用户投诉后，可通过此接口进行投诉反馈。注意，只有当投诉单状态为MERCHANT_PROCESSING时，才允许商家进行投诉反馈。
        Summary: 投诉反馈
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.SendContractComplainfeedbackResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.complainfeedback.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_contract_complainimage(
        self,
        request: twc_models.UploadContractComplainimageRequest,
    ) -> twc_models.UploadContractComplainimageResponse:
        """
        Description: 商户上传处理图片
        Summary: 商户上传处理图片
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_contract_complainimage_ex(request, headers, runtime)

    async def upload_contract_complainimage_async(
        self,
        request: twc_models.UploadContractComplainimageRequest,
    ) -> twc_models.UploadContractComplainimageResponse:
        """
        Description: 商户上传处理图片
        Summary: 商户上传处理图片
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_contract_complainimage_ex_async(request, headers, runtime)

    def upload_contract_complainimage_ex(
        self,
        request: twc_models.UploadContractComplainimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UploadContractComplainimageResponse:
        """
        Description: 商户上传处理图片
        Summary: 商户上传处理图片
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.UploadContractComplainimageResponse(),
            self.do_request('1.0', 'twc.notary.contract.complainimage.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_contract_complainimage_ex_async(
        self,
        request: twc_models.UploadContractComplainimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UploadContractComplainimageResponse:
        """
        Description: 商户上传处理图片
        Summary: 商户上传处理图片
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.UploadContractComplainimageResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.complainimage.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_inner_trans(
        self,
        request: twc_models.SyncInnerTransRequest,
    ) -> twc_models.SyncInnerTransResponse:
        """
        Description: baas-notary向notarycore同步生成的事务数据，仅做数据同步使用
        Summary: 向notarycore同步事务数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_inner_trans_ex(request, headers, runtime)

    async def sync_inner_trans_async(
        self,
        request: twc_models.SyncInnerTransRequest,
    ) -> twc_models.SyncInnerTransResponse:
        """
        Description: baas-notary向notarycore同步生成的事务数据，仅做数据同步使用
        Summary: 向notarycore同步事务数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_inner_trans_ex_async(request, headers, runtime)

    def sync_inner_trans_ex(
        self,
        request: twc_models.SyncInnerTransRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SyncInnerTransResponse:
        """
        Description: baas-notary向notarycore同步生成的事务数据，仅做数据同步使用
        Summary: 向notarycore同步事务数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.SyncInnerTransResponse(),
            self.do_request('1.0', 'twc.notary.inner.trans.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_inner_trans_ex_async(
        self,
        request: twc_models.SyncInnerTransRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SyncInnerTransResponse:
        """
        Description: baas-notary向notarycore同步生成的事务数据，仅做数据同步使用
        Summary: 向notarycore同步事务数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.SyncInnerTransResponse(),
            await self.do_request_async('1.0', 'twc.notary.inner.trans.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_inner_notary(
        self,
        request: twc_models.SyncInnerNotaryRequest,
    ) -> twc_models.SyncInnerNotaryResponse:
        """
        Description: 从baas-notary向notarycore同步存证数据
        Summary: 向notarycore同步存证数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_inner_notary_ex(request, headers, runtime)

    async def sync_inner_notary_async(
        self,
        request: twc_models.SyncInnerNotaryRequest,
    ) -> twc_models.SyncInnerNotaryResponse:
        """
        Description: 从baas-notary向notarycore同步存证数据
        Summary: 向notarycore同步存证数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_inner_notary_ex_async(request, headers, runtime)

    def sync_inner_notary_ex(
        self,
        request: twc_models.SyncInnerNotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SyncInnerNotaryResponse:
        """
        Description: 从baas-notary向notarycore同步存证数据
        Summary: 向notarycore同步存证数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.SyncInnerNotaryResponse(),
            self.do_request('1.0', 'twc.notary.inner.notary.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_inner_notary_ex_async(
        self,
        request: twc_models.SyncInnerNotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SyncInnerNotaryResponse:
        """
        Description: 从baas-notary向notarycore同步存证数据
        Summary: 向notarycore同步存证数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.SyncInnerNotaryResponse(),
            await self.do_request_async('1.0', 'twc.notary.inner.notary.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_inner_twcopen(
        self,
        request: twc_models.SyncInnerTwcopenRequest,
    ) -> twc_models.SyncInnerTwcopenResponse:
        """
        Description: 从baas-notary向notarycore同步自租户信息
        Summary: 向notarycore同步子租户数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_inner_twcopen_ex(request, headers, runtime)

    async def sync_inner_twcopen_async(
        self,
        request: twc_models.SyncInnerTwcopenRequest,
    ) -> twc_models.SyncInnerTwcopenResponse:
        """
        Description: 从baas-notary向notarycore同步自租户信息
        Summary: 向notarycore同步子租户数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_inner_twcopen_ex_async(request, headers, runtime)

    def sync_inner_twcopen_ex(
        self,
        request: twc_models.SyncInnerTwcopenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SyncInnerTwcopenResponse:
        """
        Description: 从baas-notary向notarycore同步自租户信息
        Summary: 向notarycore同步子租户数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.SyncInnerTwcopenResponse(),
            self.do_request('1.0', 'twc.notary.inner.twcopen.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_inner_twcopen_ex_async(
        self,
        request: twc_models.SyncInnerTwcopenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SyncInnerTwcopenResponse:
        """
        Description: 从baas-notary向notarycore同步自租户信息
        Summary: 向notarycore同步子租户数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.SyncInnerTwcopenResponse(),
            await self.do_request_async('1.0', 'twc.notary.inner.twcopen.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_inner_provision(
        self,
        request: twc_models.SyncInnerProvisionRequest,
    ) -> twc_models.SyncInnerProvisionResponse:
        """
        Description: 从baas-notary向notarycore同步租户权限数据
        Summary: 向notarycore同步租户数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_inner_provision_ex(request, headers, runtime)

    async def sync_inner_provision_async(
        self,
        request: twc_models.SyncInnerProvisionRequest,
    ) -> twc_models.SyncInnerProvisionResponse:
        """
        Description: 从baas-notary向notarycore同步租户权限数据
        Summary: 向notarycore同步租户数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_inner_provision_ex_async(request, headers, runtime)

    def sync_inner_provision_ex(
        self,
        request: twc_models.SyncInnerProvisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SyncInnerProvisionResponse:
        """
        Description: 从baas-notary向notarycore同步租户权限数据
        Summary: 向notarycore同步租户数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.SyncInnerProvisionResponse(),
            self.do_request('1.0', 'twc.notary.inner.provision.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_inner_provision_ex_async(
        self,
        request: twc_models.SyncInnerProvisionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SyncInnerProvisionResponse:
        """
        Description: 从baas-notary向notarycore同步租户权限数据
        Summary: 向notarycore同步租户数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.SyncInnerProvisionResponse(),
            await self.do_request_async('1.0', 'twc.notary.inner.provision.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_inner_tsr(
        self,
        request: twc_models.SyncInnerTsrRequest,
    ) -> twc_models.SyncInnerTsrResponse:
        """
        Description: 从baas-notary向notarycore同步tsr数据
        Summary: 向notarycore同步tsr数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_inner_tsr_ex(request, headers, runtime)

    async def sync_inner_tsr_async(
        self,
        request: twc_models.SyncInnerTsrRequest,
    ) -> twc_models.SyncInnerTsrResponse:
        """
        Description: 从baas-notary向notarycore同步tsr数据
        Summary: 向notarycore同步tsr数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_inner_tsr_ex_async(request, headers, runtime)

    def sync_inner_tsr_ex(
        self,
        request: twc_models.SyncInnerTsrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SyncInnerTsrResponse:
        """
        Description: 从baas-notary向notarycore同步tsr数据
        Summary: 向notarycore同步tsr数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.SyncInnerTsrResponse(),
            self.do_request('1.0', 'twc.notary.inner.tsr.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_inner_tsr_ex_async(
        self,
        request: twc_models.SyncInnerTsrRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SyncInnerTsrResponse:
        """
        Description: 从baas-notary向notarycore同步tsr数据
        Summary: 向notarycore同步tsr数据
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.SyncInnerTsrResponse(),
            await self.do_request_async('1.0', 'twc.notary.inner.tsr.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
        return TeaCore.from_map(
            twc_models.CheckEpidentityTwometaResponse(),
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
        return TeaCore.from_map(
            twc_models.CheckEpidentityTwometaResponse(),
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
        return TeaCore.from_map(
            twc_models.CheckEpidentityThreemetaResponse(),
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
        return TeaCore.from_map(
            twc_models.CheckEpidentityThreemetaResponse(),
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
        return TeaCore.from_map(
            twc_models.CheckEpidentityFourmetaResponse(),
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
        return TeaCore.from_map(
            twc_models.CheckEpidentityFourmetaResponse(),
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
        return TeaCore.from_map(
            twc_models.CheckNotarizationOrderResponse(),
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
        return TeaCore.from_map(
            twc_models.CheckNotarizationOrderResponse(),
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
        return TeaCore.from_map(
            twc_models.UpdateNotarizationOrderResponse(),
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
        return TeaCore.from_map(
            twc_models.UpdateNotarizationOrderResponse(),
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
        return TeaCore.from_map(
            twc_models.SetNotarizationOrderResponse(),
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
        return TeaCore.from_map(
            twc_models.SetNotarizationOrderResponse(),
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
        return TeaCore.from_map(
            twc_models.InitIdentificationFaceauthResponse(),
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
        return TeaCore.from_map(
            twc_models.InitIdentificationFaceauthResponse(),
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
        return TeaCore.from_map(
            twc_models.CertifyIdentificationFaceauthResponse(),
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
        return TeaCore.from_map(
            twc_models.CertifyIdentificationFaceauthResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryIdentificationFaceauthResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryIdentificationFaceauthResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryEnterpriseFaceauthResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryEnterpriseFaceauthResponse(),
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
        return TeaCore.from_map(
            twc_models.InitEnterpriseFaceauthResponse(),
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
        return TeaCore.from_map(
            twc_models.InitEnterpriseFaceauthResponse(),
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
        return TeaCore.from_map(
            twc_models.CertifyEnterpriseFaceauthResponse(),
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
        return TeaCore.from_map(
            twc_models.CertifyEnterpriseFaceauthResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseOrderResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseOrderResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateNotarizationBillResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateNotarizationBillResponse(),
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
        return TeaCore.from_map(
            twc_models.InitCertificationResponse(),
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
        return TeaCore.from_map(
            twc_models.InitCertificationResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryCertificationResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryCertificationResponse(),
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
        return TeaCore.from_map(
            twc_models.GetTsrCertificateResponse(),
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
        return TeaCore.from_map(
            twc_models.GetTsrCertificateResponse(),
            await self.do_request_async('1.0', 'twc.notary.tsr.certificate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_identification_realperson(
        self,
        request: twc_models.CreateIdentificationRealpersonRequest,
    ) -> twc_models.CreateIdentificationRealpersonResponse:
        """
        Description: 发起实人认证，这是改造后的接口
        Summary: 实人认证创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_identification_realperson_ex(request, headers, runtime)

    async def create_identification_realperson_async(
        self,
        request: twc_models.CreateIdentificationRealpersonRequest,
    ) -> twc_models.CreateIdentificationRealpersonResponse:
        """
        Description: 发起实人认证，这是改造后的接口
        Summary: 实人认证创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_identification_realperson_ex_async(request, headers, runtime)

    def create_identification_realperson_ex(
        self,
        request: twc_models.CreateIdentificationRealpersonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateIdentificationRealpersonResponse:
        """
        Description: 发起实人认证，这是改造后的接口
        Summary: 实人认证创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateIdentificationRealpersonResponse(),
            self.do_request('1.0', 'twc.notary.identification.realperson.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_identification_realperson_ex_async(
        self,
        request: twc_models.CreateIdentificationRealpersonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateIdentificationRealpersonResponse:
        """
        Description: 发起实人认证，这是改造后的接口
        Summary: 实人认证创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateIdentificationRealpersonResponse(),
            await self.do_request_async('1.0', 'twc.notary.identification.realperson.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_identification_realperson(
        self,
        request: twc_models.QueryIdentificationRealpersonRequest,
    ) -> twc_models.QueryIdentificationRealpersonResponse:
        """
        Description: 查询实人认证结果
        Summary: 查询实人认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_identification_realperson_ex(request, headers, runtime)

    async def query_identification_realperson_async(
        self,
        request: twc_models.QueryIdentificationRealpersonRequest,
    ) -> twc_models.QueryIdentificationRealpersonResponse:
        """
        Description: 查询实人认证结果
        Summary: 查询实人认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_identification_realperson_ex_async(request, headers, runtime)

    def query_identification_realperson_ex(
        self,
        request: twc_models.QueryIdentificationRealpersonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryIdentificationRealpersonResponse:
        """
        Description: 查询实人认证结果
        Summary: 查询实人认证结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryIdentificationRealpersonResponse(),
            self.do_request('1.0', 'twc.notary.identification.realperson.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_identification_realperson_ex_async(
        self,
        request: twc_models.QueryIdentificationRealpersonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryIdentificationRealpersonResponse:
        """
        Description: 查询实人认证结果
        Summary: 查询实人认证结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryIdentificationRealpersonResponse(),
            await self.do_request_async('1.0', 'twc.notary.identification.realperson.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
        return TeaCore.from_map(
            twc_models.SaveJointconstraintRecordResponse(),
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
        return TeaCore.from_map(
            twc_models.SaveJointconstraintRecordResponse(),
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
        return TeaCore.from_map(
            twc_models.DeleteJointconstraintRecordResponse(),
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
        return TeaCore.from_map(
            twc_models.DeleteJointconstraintRecordResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryJointconstraintBreachrecordResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryJointconstraintBreachrecordResponse(),
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
        return TeaCore.from_map(
            twc_models.ApplyJusticeMediationResponse(),
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
        return TeaCore.from_map(
            twc_models.ApplyJusticeMediationResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryJusticeMediationResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryJusticeMediationResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryJusticeCaseinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryJusticeCaseinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.GetJusticeUploadfilepathResponse(),
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
        return TeaCore.from_map(
            twc_models.GetJusticeUploadfilepathResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateJusticeCasewritebackResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateJusticeCasewritebackResponse(),
            await self.do_request_async('1.0', 'twc.notary.justice.casewriteback.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_justice_basecase(
        self,
        request: twc_models.QueryJusticeBasecaseRequest,
    ) -> twc_models.QueryJusticeBasecaseResponse:
        """
        Description: 案件基础信息查询
        Summary: 案件基础信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_justice_basecase_ex(request, headers, runtime)

    async def query_justice_basecase_async(
        self,
        request: twc_models.QueryJusticeBasecaseRequest,
    ) -> twc_models.QueryJusticeBasecaseResponse:
        """
        Description: 案件基础信息查询
        Summary: 案件基础信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_justice_basecase_ex_async(request, headers, runtime)

    def query_justice_basecase_ex(
        self,
        request: twc_models.QueryJusticeBasecaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryJusticeBasecaseResponse:
        """
        Description: 案件基础信息查询
        Summary: 案件基础信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryJusticeBasecaseResponse(),
            self.do_request('1.0', 'twc.notary.justice.basecase.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_justice_basecase_ex_async(
        self,
        request: twc_models.QueryJusticeBasecaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryJusticeBasecaseResponse:
        """
        Description: 案件基础信息查询
        Summary: 案件基础信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryJusticeBasecaseResponse(),
            await self.do_request_async('1.0', 'twc.notary.justice.basecase.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def download_justice_casefile(
        self,
        request: twc_models.DownloadJusticeCasefileRequest,
    ) -> twc_models.DownloadJusticeCasefileResponse:
        """
        Description: 案件材料下载
        Summary: 案件材料下载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.download_justice_casefile_ex(request, headers, runtime)

    async def download_justice_casefile_async(
        self,
        request: twc_models.DownloadJusticeCasefileRequest,
    ) -> twc_models.DownloadJusticeCasefileResponse:
        """
        Description: 案件材料下载
        Summary: 案件材料下载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.download_justice_casefile_ex_async(request, headers, runtime)

    def download_justice_casefile_ex(
        self,
        request: twc_models.DownloadJusticeCasefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DownloadJusticeCasefileResponse:
        """
        Description: 案件材料下载
        Summary: 案件材料下载
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.DownloadJusticeCasefileResponse(),
            self.do_request('1.0', 'twc.notary.justice.casefile.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def download_justice_casefile_ex_async(
        self,
        request: twc_models.DownloadJusticeCasefileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DownloadJusticeCasefileResponse:
        """
        Description: 案件材料下载
        Summary: 案件材料下载
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.DownloadJusticeCasefileResponse(),
            await self.do_request_async('1.0', 'twc.notary.justice.casefile.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def open_internal_judicial(
        self,
        request: twc_models.OpenInternalJudicialRequest,
    ) -> twc_models.OpenInternalJudicialResponse:
        """
        Description: 开通纠纷平台使用权限
        Summary: 开通纠纷平台使用权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.open_internal_judicial_ex(request, headers, runtime)

    async def open_internal_judicial_async(
        self,
        request: twc_models.OpenInternalJudicialRequest,
    ) -> twc_models.OpenInternalJudicialResponse:
        """
        Description: 开通纠纷平台使用权限
        Summary: 开通纠纷平台使用权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.open_internal_judicial_ex_async(request, headers, runtime)

    def open_internal_judicial_ex(
        self,
        request: twc_models.OpenInternalJudicialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.OpenInternalJudicialResponse:
        """
        Description: 开通纠纷平台使用权限
        Summary: 开通纠纷平台使用权限
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.OpenInternalJudicialResponse(),
            self.do_request('1.0', 'twc.notary.internal.judicial.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def open_internal_judicial_ex_async(
        self,
        request: twc_models.OpenInternalJudicialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.OpenInternalJudicialResponse:
        """
        Description: 开通纠纷平台使用权限
        Summary: 开通纠纷平台使用权限
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.OpenInternalJudicialResponse(),
            await self.do_request_async('1.0', 'twc.notary.internal.judicial.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_justice_party(
        self,
        request: twc_models.SaveJusticePartyRequest,
    ) -> twc_models.SaveJusticePartyResponse:
        """
        Description: 案件当事人信息保存
        Summary: 案件当事人信息保存
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_justice_party_ex(request, headers, runtime)

    async def save_justice_party_async(
        self,
        request: twc_models.SaveJusticePartyRequest,
    ) -> twc_models.SaveJusticePartyResponse:
        """
        Description: 案件当事人信息保存
        Summary: 案件当事人信息保存
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_justice_party_ex_async(request, headers, runtime)

    def save_justice_party_ex(
        self,
        request: twc_models.SaveJusticePartyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SaveJusticePartyResponse:
        """
        Description: 案件当事人信息保存
        Summary: 案件当事人信息保存
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.SaveJusticePartyResponse(),
            self.do_request('1.0', 'twc.notary.justice.party.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_justice_party_ex_async(
        self,
        request: twc_models.SaveJusticePartyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SaveJusticePartyResponse:
        """
        Description: 案件当事人信息保存
        Summary: 案件当事人信息保存
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.SaveJusticePartyResponse(),
            await self.do_request_async('1.0', 'twc.notary.justice.party.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_justice_normalcase(
        self,
        request: twc_models.CreateJusticeNormalcaseRequest,
    ) -> twc_models.CreateJusticeNormalcaseResponse:
        """
        Description: 普通案件创建
        Summary: 普通案件创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_justice_normalcase_ex(request, headers, runtime)

    async def create_justice_normalcase_async(
        self,
        request: twc_models.CreateJusticeNormalcaseRequest,
    ) -> twc_models.CreateJusticeNormalcaseResponse:
        """
        Description: 普通案件创建
        Summary: 普通案件创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_justice_normalcase_ex_async(request, headers, runtime)

    def create_justice_normalcase_ex(
        self,
        request: twc_models.CreateJusticeNormalcaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateJusticeNormalcaseResponse:
        """
        Description: 普通案件创建
        Summary: 普通案件创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateJusticeNormalcaseResponse(),
            self.do_request('1.0', 'twc.notary.justice.normalcase.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_justice_normalcase_ex_async(
        self,
        request: twc_models.CreateJusticeNormalcaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateJusticeNormalcaseResponse:
        """
        Description: 普通案件创建
        Summary: 普通案件创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateJusticeNormalcaseResponse(),
            await self.do_request_async('1.0', 'twc.notary.justice.normalcase.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_justice_chaincase(
        self,
        request: twc_models.CreateJusticeChaincaseRequest,
    ) -> twc_models.CreateJusticeChaincaseResponse:
        """
        Description: 链上案件创建
        Summary: 链上案件创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_justice_chaincase_ex(request, headers, runtime)

    async def create_justice_chaincase_async(
        self,
        request: twc_models.CreateJusticeChaincaseRequest,
    ) -> twc_models.CreateJusticeChaincaseResponse:
        """
        Description: 链上案件创建
        Summary: 链上案件创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_justice_chaincase_ex_async(request, headers, runtime)

    def create_justice_chaincase_ex(
        self,
        request: twc_models.CreateJusticeChaincaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateJusticeChaincaseResponse:
        """
        Description: 链上案件创建
        Summary: 链上案件创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateJusticeChaincaseResponse(),
            self.do_request('1.0', 'twc.notary.justice.chaincase.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_justice_chaincase_ex_async(
        self,
        request: twc_models.CreateJusticeChaincaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateJusticeChaincaseResponse:
        """
        Description: 链上案件创建
        Summary: 链上案件创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateJusticeChaincaseResponse(),
            await self.do_request_async('1.0', 'twc.notary.justice.chaincase.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def start_justice_case(
        self,
        request: twc_models.StartJusticeCaseRequest,
    ) -> twc_models.StartJusticeCaseResponse:
        """
        Description: 案件维权发起
        Summary: 案件维权发起
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.start_justice_case_ex(request, headers, runtime)

    async def start_justice_case_async(
        self,
        request: twc_models.StartJusticeCaseRequest,
    ) -> twc_models.StartJusticeCaseResponse:
        """
        Description: 案件维权发起
        Summary: 案件维权发起
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.start_justice_case_ex_async(request, headers, runtime)

    def start_justice_case_ex(
        self,
        request: twc_models.StartJusticeCaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.StartJusticeCaseResponse:
        """
        Description: 案件维权发起
        Summary: 案件维权发起
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.StartJusticeCaseResponse(),
            self.do_request('1.0', 'twc.notary.justice.case.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def start_justice_case_ex_async(
        self,
        request: twc_models.StartJusticeCaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.StartJusticeCaseResponse:
        """
        Description: 案件维权发起
        Summary: 案件维权发起
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.StartJusticeCaseResponse(),
            await self.do_request_async('1.0', 'twc.notary.justice.case.start', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_justice_case(
        self,
        request: twc_models.QueryJusticeCaseRequest,
    ) -> twc_models.QueryJusticeCaseResponse:
        """
        Description: 案件查询
        Summary: 案件查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_justice_case_ex(request, headers, runtime)

    async def query_justice_case_async(
        self,
        request: twc_models.QueryJusticeCaseRequest,
    ) -> twc_models.QueryJusticeCaseResponse:
        """
        Description: 案件查询
        Summary: 案件查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_justice_case_ex_async(request, headers, runtime)

    def query_justice_case_ex(
        self,
        request: twc_models.QueryJusticeCaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryJusticeCaseResponse:
        """
        Description: 案件查询
        Summary: 案件查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryJusticeCaseResponse(),
            self.do_request('1.0', 'twc.notary.justice.case.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_justice_case_ex_async(
        self,
        request: twc_models.QueryJusticeCaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryJusticeCaseResponse:
        """
        Description: 案件查询
        Summary: 案件查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryJusticeCaseResponse(),
            await self.do_request_async('1.0', 'twc.notary.justice.case.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def operate_justice_event(
        self,
        request: twc_models.OperateJusticeEventRequest,
    ) -> twc_models.OperateJusticeEventResponse:
        """
        Description: 案件事件响应
        Summary: 案件事件响应
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.operate_justice_event_ex(request, headers, runtime)

    async def operate_justice_event_async(
        self,
        request: twc_models.OperateJusticeEventRequest,
    ) -> twc_models.OperateJusticeEventResponse:
        """
        Description: 案件事件响应
        Summary: 案件事件响应
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.operate_justice_event_ex_async(request, headers, runtime)

    def operate_justice_event_ex(
        self,
        request: twc_models.OperateJusticeEventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.OperateJusticeEventResponse:
        """
        Description: 案件事件响应
        Summary: 案件事件响应
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.OperateJusticeEventResponse(),
            self.do_request('1.0', 'twc.notary.justice.event.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def operate_justice_event_ex_async(
        self,
        request: twc_models.OperateJusticeEventRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.OperateJusticeEventResponse:
        """
        Description: 案件事件响应
        Summary: 案件事件响应
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.OperateJusticeEventResponse(),
            await self.do_request_async('1.0', 'twc.notary.justice.event.operate', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_justice_casetemplate(
        self,
        request: twc_models.CreateJusticeCasetemplateRequest,
    ) -> twc_models.CreateJusticeCasetemplateResponse:
        """
        Description: 司法解纷平台API服务，创建案件要素模板接口
        Summary: 创建案件要素模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_justice_casetemplate_ex(request, headers, runtime)

    async def create_justice_casetemplate_async(
        self,
        request: twc_models.CreateJusticeCasetemplateRequest,
    ) -> twc_models.CreateJusticeCasetemplateResponse:
        """
        Description: 司法解纷平台API服务，创建案件要素模板接口
        Summary: 创建案件要素模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_justice_casetemplate_ex_async(request, headers, runtime)

    def create_justice_casetemplate_ex(
        self,
        request: twc_models.CreateJusticeCasetemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateJusticeCasetemplateResponse:
        """
        Description: 司法解纷平台API服务，创建案件要素模板接口
        Summary: 创建案件要素模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateJusticeCasetemplateResponse(),
            self.do_request('1.0', 'twc.notary.justice.casetemplate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_justice_casetemplate_ex_async(
        self,
        request: twc_models.CreateJusticeCasetemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateJusticeCasetemplateResponse:
        """
        Description: 司法解纷平台API服务，创建案件要素模板接口
        Summary: 创建案件要素模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateJusticeCasetemplateResponse(),
            await self.do_request_async('1.0', 'twc.notary.justice.casetemplate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_justice_rightprotecttemplate(
        self,
        request: twc_models.CreateJusticeRightprotecttemplateRequest,
    ) -> twc_models.CreateJusticeRightprotecttemplateResponse:
        """
        Description: 司法解纷平台API服务，创建维权要素模板接口
        Summary: 创建维权要素模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_justice_rightprotecttemplate_ex(request, headers, runtime)

    async def create_justice_rightprotecttemplate_async(
        self,
        request: twc_models.CreateJusticeRightprotecttemplateRequest,
    ) -> twc_models.CreateJusticeRightprotecttemplateResponse:
        """
        Description: 司法解纷平台API服务，创建维权要素模板接口
        Summary: 创建维权要素模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_justice_rightprotecttemplate_ex_async(request, headers, runtime)

    def create_justice_rightprotecttemplate_ex(
        self,
        request: twc_models.CreateJusticeRightprotecttemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateJusticeRightprotecttemplateResponse:
        """
        Description: 司法解纷平台API服务，创建维权要素模板接口
        Summary: 创建维权要素模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateJusticeRightprotecttemplateResponse(),
            self.do_request('1.0', 'twc.notary.justice.rightprotecttemplate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_justice_rightprotecttemplate_ex_async(
        self,
        request: twc_models.CreateJusticeRightprotecttemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateJusticeRightprotecttemplateResponse:
        """
        Description: 司法解纷平台API服务，创建维权要素模板接口
        Summary: 创建维权要素模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateJusticeRightprotecttemplateResponse(),
            await self.do_request_async('1.0', 'twc.notary.justice.rightprotecttemplate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_justice_fileuploadurl(
        self,
        request: twc_models.GetJusticeFileuploadurlRequest,
    ) -> twc_models.GetJusticeFileuploadurlResponse:
        """
        Description: 获取司法文件上传链接
        Summary: 获取司法文件上传链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_justice_fileuploadurl_ex(request, headers, runtime)

    async def get_justice_fileuploadurl_async(
        self,
        request: twc_models.GetJusticeFileuploadurlRequest,
    ) -> twc_models.GetJusticeFileuploadurlResponse:
        """
        Description: 获取司法文件上传链接
        Summary: 获取司法文件上传链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_justice_fileuploadurl_ex_async(request, headers, runtime)

    def get_justice_fileuploadurl_ex(
        self,
        request: twc_models.GetJusticeFileuploadurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetJusticeFileuploadurlResponse:
        """
        Description: 获取司法文件上传链接
        Summary: 获取司法文件上传链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.GetJusticeFileuploadurlResponse(),
            self.do_request('1.0', 'twc.notary.justice.fileuploadurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_justice_fileuploadurl_ex_async(
        self,
        request: twc_models.GetJusticeFileuploadurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetJusticeFileuploadurlResponse:
        """
        Description: 获取司法文件上传链接
        Summary: 获取司法文件上传链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.GetJusticeFileuploadurlResponse(),
            await self.do_request_async('1.0', 'twc.notary.justice.fileuploadurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_justice_documenttemplate(
        self,
        request: twc_models.CreateJusticeDocumenttemplateRequest,
    ) -> twc_models.CreateJusticeDocumenttemplateResponse:
        """
        Description: 司法解纷平台API服务，创建文书要素模板接口
        Summary: 创建文书要素模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_justice_documenttemplate_ex(request, headers, runtime)

    async def create_justice_documenttemplate_async(
        self,
        request: twc_models.CreateJusticeDocumenttemplateRequest,
    ) -> twc_models.CreateJusticeDocumenttemplateResponse:
        """
        Description: 司法解纷平台API服务，创建文书要素模板接口
        Summary: 创建文书要素模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_justice_documenttemplate_ex_async(request, headers, runtime)

    def create_justice_documenttemplate_ex(
        self,
        request: twc_models.CreateJusticeDocumenttemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateJusticeDocumenttemplateResponse:
        """
        Description: 司法解纷平台API服务，创建文书要素模板接口
        Summary: 创建文书要素模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateJusticeDocumenttemplateResponse(),
            self.do_request('1.0', 'twc.notary.justice.documenttemplate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_justice_documenttemplate_ex_async(
        self,
        request: twc_models.CreateJusticeDocumenttemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateJusticeDocumenttemplateResponse:
        """
        Description: 司法解纷平台API服务，创建文书要素模板接口
        Summary: 创建文书要素模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateJusticeDocumenttemplateResponse(),
            await self.do_request_async('1.0', 'twc.notary.justice.documenttemplate.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_justice_commoncaseinfo(
        self,
        request: twc_models.QueryJusticeCommoncaseinfoRequest,
    ) -> twc_models.QueryJusticeCommoncaseinfoResponse:
        """
        Description: 仲裁-通用版本进件要素信息查询
        Summary: 仲裁-通用版本进件要素信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_justice_commoncaseinfo_ex(request, headers, runtime)

    async def query_justice_commoncaseinfo_async(
        self,
        request: twc_models.QueryJusticeCommoncaseinfoRequest,
    ) -> twc_models.QueryJusticeCommoncaseinfoResponse:
        """
        Description: 仲裁-通用版本进件要素信息查询
        Summary: 仲裁-通用版本进件要素信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_justice_commoncaseinfo_ex_async(request, headers, runtime)

    def query_justice_commoncaseinfo_ex(
        self,
        request: twc_models.QueryJusticeCommoncaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryJusticeCommoncaseinfoResponse:
        """
        Description: 仲裁-通用版本进件要素信息查询
        Summary: 仲裁-通用版本进件要素信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryJusticeCommoncaseinfoResponse(),
            self.do_request('1.0', 'twc.notary.justice.commoncaseinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_justice_commoncaseinfo_ex_async(
        self,
        request: twc_models.QueryJusticeCommoncaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryJusticeCommoncaseinfoResponse:
        """
        Description: 仲裁-通用版本进件要素信息查询
        Summary: 仲裁-通用版本进件要素信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryJusticeCommoncaseinfoResponse(),
            await self.do_request_async('1.0', 'twc.notary.justice.commoncaseinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_justice_agentcase(
        self,
        request: twc_models.CreateJusticeAgentcaseRequest,
    ) -> twc_models.CreateJusticeAgentcaseResponse:
        """
        Description: 1级商户为2级商户进件
        Summary: 代理二级商户进件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_justice_agentcase_ex(request, headers, runtime)

    async def create_justice_agentcase_async(
        self,
        request: twc_models.CreateJusticeAgentcaseRequest,
    ) -> twc_models.CreateJusticeAgentcaseResponse:
        """
        Description: 1级商户为2级商户进件
        Summary: 代理二级商户进件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_justice_agentcase_ex_async(request, headers, runtime)

    def create_justice_agentcase_ex(
        self,
        request: twc_models.CreateJusticeAgentcaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateJusticeAgentcaseResponse:
        """
        Description: 1级商户为2级商户进件
        Summary: 代理二级商户进件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateJusticeAgentcaseResponse(),
            self.do_request('1.0', 'twc.notary.justice.agentcase.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_justice_agentcase_ex_async(
        self,
        request: twc_models.CreateJusticeAgentcaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateJusticeAgentcaseResponse:
        """
        Description: 1级商户为2级商户进件
        Summary: 代理二级商户进件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateJusticeAgentcaseResponse(),
            await self.do_request_async('1.0', 'twc.notary.justice.agentcase.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
        return TeaCore.from_map(
            twc_models.CreateLeaseProductinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseProductinfoResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.productinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
        return TeaCore.from_map(
            twc_models.UpdateLeaseContractResponse(),
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
        return TeaCore.from_map(
            twc_models.UpdateLeaseContractResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.contract.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
        return TeaCore.from_map(
            twc_models.CreateLeaseAssetagentregisterResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseAssetagentregisterResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryLeaseProductinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryLeaseProductinfoResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.productinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_lease_supplierorderstatus(
        self,
        request: twc_models.SyncLeaseSupplierorderstatusRequest,
    ) -> twc_models.SyncLeaseSupplierorderstatusResponse:
        """
        Description: 同步采购平台订单状态
        Summary: 同步采购平台订单状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_lease_supplierorderstatus_ex(request, headers, runtime)

    async def sync_lease_supplierorderstatus_async(
        self,
        request: twc_models.SyncLeaseSupplierorderstatusRequest,
    ) -> twc_models.SyncLeaseSupplierorderstatusResponse:
        """
        Description: 同步采购平台订单状态
        Summary: 同步采购平台订单状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_lease_supplierorderstatus_ex_async(request, headers, runtime)

    def sync_lease_supplierorderstatus_ex(
        self,
        request: twc_models.SyncLeaseSupplierorderstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SyncLeaseSupplierorderstatusResponse:
        """
        Description: 同步采购平台订单状态
        Summary: 同步采购平台订单状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.SyncLeaseSupplierorderstatusResponse(),
            self.do_request('1.0', 'twc.notary.lease.supplierorderstatus.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_lease_supplierorderstatus_ex_async(
        self,
        request: twc_models.SyncLeaseSupplierorderstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.SyncLeaseSupplierorderstatusResponse:
        """
        Description: 同步采购平台订单状态
        Summary: 同步采购平台订单状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.SyncLeaseSupplierorderstatusResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.supplierorderstatus.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_lease_supplier(
        self,
        request: twc_models.InitLeaseSupplierRequest,
    ) -> twc_models.InitLeaseSupplierResponse:
        """
        Description: 采购供应商初始化
        Summary: 采购供应商初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_lease_supplier_ex(request, headers, runtime)

    async def init_lease_supplier_async(
        self,
        request: twc_models.InitLeaseSupplierRequest,
    ) -> twc_models.InitLeaseSupplierResponse:
        """
        Description: 采购供应商初始化
        Summary: 采购供应商初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_lease_supplier_ex_async(request, headers, runtime)

    def init_lease_supplier_ex(
        self,
        request: twc_models.InitLeaseSupplierRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.InitLeaseSupplierResponse:
        """
        Description: 采购供应商初始化
        Summary: 采购供应商初始化
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.InitLeaseSupplierResponse(),
            self.do_request('1.0', 'twc.notary.lease.supplier.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_lease_supplier_ex_async(
        self,
        request: twc_models.InitLeaseSupplierRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.InitLeaseSupplierResponse:
        """
        Description: 采购供应商初始化
        Summary: 采购供应商初始化
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.InitLeaseSupplierResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.supplier.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def finish_lease_supplierstatus(
        self,
        request: twc_models.FinishLeaseSupplierstatusRequest,
    ) -> twc_models.FinishLeaseSupplierstatusResponse:
        """
        Description: 租赁订单接收采购平台的采购状态信息，完成采购流程
        Summary: 租赁订单接收采购状态信息，完成采购流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.finish_lease_supplierstatus_ex(request, headers, runtime)

    async def finish_lease_supplierstatus_async(
        self,
        request: twc_models.FinishLeaseSupplierstatusRequest,
    ) -> twc_models.FinishLeaseSupplierstatusResponse:
        """
        Description: 租赁订单接收采购平台的采购状态信息，完成采购流程
        Summary: 租赁订单接收采购状态信息，完成采购流程
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.finish_lease_supplierstatus_ex_async(request, headers, runtime)

    def finish_lease_supplierstatus_ex(
        self,
        request: twc_models.FinishLeaseSupplierstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.FinishLeaseSupplierstatusResponse:
        """
        Description: 租赁订单接收采购平台的采购状态信息，完成采购流程
        Summary: 租赁订单接收采购状态信息，完成采购流程
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.FinishLeaseSupplierstatusResponse(),
            self.do_request('1.0', 'twc.notary.lease.supplierstatus.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def finish_lease_supplierstatus_ex_async(
        self,
        request: twc_models.FinishLeaseSupplierstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.FinishLeaseSupplierstatusResponse:
        """
        Description: 租赁订单接收采购平台的采购状态信息，完成采购流程
        Summary: 租赁订单接收采购状态信息，完成采购流程
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.FinishLeaseSupplierstatusResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.supplierstatus.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_supplierproduct(
        self,
        request: twc_models.CreateLeaseSupplierproductRequest,
    ) -> twc_models.CreateLeaseSupplierproductResponse:
        """
        Description: 采购商品初始化
        Summary: 采购商品初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_supplierproduct_ex(request, headers, runtime)

    async def create_lease_supplierproduct_async(
        self,
        request: twc_models.CreateLeaseSupplierproductRequest,
    ) -> twc_models.CreateLeaseSupplierproductResponse:
        """
        Description: 采购商品初始化
        Summary: 采购商品初始化
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_supplierproduct_ex_async(request, headers, runtime)

    def create_lease_supplierproduct_ex(
        self,
        request: twc_models.CreateLeaseSupplierproductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseSupplierproductResponse:
        """
        Description: 采购商品初始化
        Summary: 采购商品初始化
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateLeaseSupplierproductResponse(),
            self.do_request('1.0', 'twc.notary.lease.supplierproduct.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_supplierproduct_ex_async(
        self,
        request: twc_models.CreateLeaseSupplierproductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseSupplierproductResponse:
        """
        Description: 采购商品初始化
        Summary: 采购商品初始化
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateLeaseSupplierproductResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.supplierproduct.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_lease_supplierorder(
        self,
        request: twc_models.ApplyLeaseSupplierorderRequest,
    ) -> twc_models.ApplyLeaseSupplierorderResponse:
        """
        Description: 链上采购申请
        Summary: 链上采购申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_lease_supplierorder_ex(request, headers, runtime)

    async def apply_lease_supplierorder_async(
        self,
        request: twc_models.ApplyLeaseSupplierorderRequest,
    ) -> twc_models.ApplyLeaseSupplierorderResponse:
        """
        Description: 链上采购申请
        Summary: 链上采购申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_lease_supplierorder_ex_async(request, headers, runtime)

    def apply_lease_supplierorder_ex(
        self,
        request: twc_models.ApplyLeaseSupplierorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyLeaseSupplierorderResponse:
        """
        Description: 链上采购申请
        Summary: 链上采购申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ApplyLeaseSupplierorderResponse(),
            self.do_request('1.0', 'twc.notary.lease.supplierorder.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_lease_supplierorder_ex_async(
        self,
        request: twc_models.ApplyLeaseSupplierorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyLeaseSupplierorderResponse:
        """
        Description: 链上采购申请
        Summary: 链上采购申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ApplyLeaseSupplierorderResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.supplierorder.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_financecertify(
        self,
        request: twc_models.CreateLeaseFinancecertifyRequest,
    ) -> twc_models.CreateLeaseFinancecertifyResponse:
        """
        Description: 创建融资租赁提前还款人脸认证信息
        Summary: 创建融资租赁提前还款人脸认证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_financecertify_ex(request, headers, runtime)

    async def create_lease_financecertify_async(
        self,
        request: twc_models.CreateLeaseFinancecertifyRequest,
    ) -> twc_models.CreateLeaseFinancecertifyResponse:
        """
        Description: 创建融资租赁提前还款人脸认证信息
        Summary: 创建融资租赁提前还款人脸认证信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_financecertify_ex_async(request, headers, runtime)

    def create_lease_financecertify_ex(
        self,
        request: twc_models.CreateLeaseFinancecertifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseFinancecertifyResponse:
        """
        Description: 创建融资租赁提前还款人脸认证信息
        Summary: 创建融资租赁提前还款人脸认证信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateLeaseFinancecertifyResponse(),
            self.do_request('1.0', 'twc.notary.lease.financecertify.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_financecertify_ex_async(
        self,
        request: twc_models.CreateLeaseFinancecertifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseFinancecertifyResponse:
        """
        Description: 创建融资租赁提前还款人脸认证信息
        Summary: 创建融资租赁提前还款人脸认证信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateLeaseFinancecertifyResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.financecertify.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_financecertify(
        self,
        request: twc_models.QueryLeaseFinancecertifyRequest,
    ) -> twc_models.QueryLeaseFinancecertifyResponse:
        """
        Description: 融资租赁提前还款人脸识别核验
        Summary: 融资租赁提前还款人脸识别核验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_financecertify_ex(request, headers, runtime)

    async def query_lease_financecertify_async(
        self,
        request: twc_models.QueryLeaseFinancecertifyRequest,
    ) -> twc_models.QueryLeaseFinancecertifyResponse:
        """
        Description: 融资租赁提前还款人脸识别核验
        Summary: 融资租赁提前还款人脸识别核验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_financecertify_ex_async(request, headers, runtime)

    def query_lease_financecertify_ex(
        self,
        request: twc_models.QueryLeaseFinancecertifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseFinancecertifyResponse:
        """
        Description: 融资租赁提前还款人脸识别核验
        Summary: 融资租赁提前还款人脸识别核验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseFinancecertifyResponse(),
            self.do_request('1.0', 'twc.notary.lease.financecertify.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_financecertify_ex_async(
        self,
        request: twc_models.QueryLeaseFinancecertifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseFinancecertifyResponse:
        """
        Description: 融资租赁提前还款人脸识别核验
        Summary: 融资租赁提前还款人脸识别核验
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseFinancecertifyResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.financecertify.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_financecertifyincontract(
        self,
        request: twc_models.QueryLeaseFinancecertifyincontractRequest,
    ) -> twc_models.QueryLeaseFinancecertifyincontractResponse:
        """
        Description: 查询融资租赁合约内核验结果
        Summary: 查询融资租赁合约内核验结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_financecertifyincontract_ex(request, headers, runtime)

    async def query_lease_financecertifyincontract_async(
        self,
        request: twc_models.QueryLeaseFinancecertifyincontractRequest,
    ) -> twc_models.QueryLeaseFinancecertifyincontractResponse:
        """
        Description: 查询融资租赁合约内核验结果
        Summary: 查询融资租赁合约内核验结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_financecertifyincontract_ex_async(request, headers, runtime)

    def query_lease_financecertifyincontract_ex(
        self,
        request: twc_models.QueryLeaseFinancecertifyincontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseFinancecertifyincontractResponse:
        """
        Description: 查询融资租赁合约内核验结果
        Summary: 查询融资租赁合约内核验结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseFinancecertifyincontractResponse(),
            self.do_request('1.0', 'twc.notary.lease.financecertifyincontract.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_financecertifyincontract_ex_async(
        self,
        request: twc_models.QueryLeaseFinancecertifyincontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseFinancecertifyincontractResponse:
        """
        Description: 查询融资租赁合约内核验结果
        Summary: 查询融资租赁合约内核验结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseFinancecertifyincontractResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.financecertifyincontract.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_user(
        self,
        request: twc_models.QueryLeaseUserRequest,
    ) -> twc_models.QueryLeaseUserResponse:
        """
        Description: 融资租赁用户信息查询
        Summary: 融资租赁用户信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_user_ex(request, headers, runtime)

    async def query_lease_user_async(
        self,
        request: twc_models.QueryLeaseUserRequest,
    ) -> twc_models.QueryLeaseUserResponse:
        """
        Description: 融资租赁用户信息查询
        Summary: 融资租赁用户信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_user_ex_async(request, headers, runtime)

    def query_lease_user_ex(
        self,
        request: twc_models.QueryLeaseUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseUserResponse:
        """
        Description: 融资租赁用户信息查询
        Summary: 融资租赁用户信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseUserResponse(),
            self.do_request('1.0', 'twc.notary.lease.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_user_ex_async(
        self,
        request: twc_models.QueryLeaseUserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseUserResponse:
        """
        Description: 融资租赁用户信息查询
        Summary: 融资租赁用户信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseUserResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.user.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_orderdetailinfo(
        self,
        request: twc_models.QueryLeaseOrderdetailinfoRequest,
    ) -> twc_models.QueryLeaseOrderdetailinfoResponse:
        """
        Description: 融资租赁订单详情查询
        Summary: 融资租赁订单详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_orderdetailinfo_ex(request, headers, runtime)

    async def query_lease_orderdetailinfo_async(
        self,
        request: twc_models.QueryLeaseOrderdetailinfoRequest,
    ) -> twc_models.QueryLeaseOrderdetailinfoResponse:
        """
        Description: 融资租赁订单详情查询
        Summary: 融资租赁订单详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_orderdetailinfo_ex_async(request, headers, runtime)

    def query_lease_orderdetailinfo_ex(
        self,
        request: twc_models.QueryLeaseOrderdetailinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseOrderdetailinfoResponse:
        """
        Description: 融资租赁订单详情查询
        Summary: 融资租赁订单详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseOrderdetailinfoResponse(),
            self.do_request('1.0', 'twc.notary.lease.orderdetailinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_orderdetailinfo_ex_async(
        self,
        request: twc_models.QueryLeaseOrderdetailinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseOrderdetailinfoResponse:
        """
        Description: 融资租赁订单详情查询
        Summary: 融资租赁订单详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseOrderdetailinfoResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.orderdetailinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_leasepromise(
        self,
        request: twc_models.QueryLeaseLeasepromiseRequest,
    ) -> twc_models.QueryLeaseLeasepromiseResponse:
        """
        Description: 融资租赁租赁机构承诺查询
        Summary: 融资租赁租赁机构承诺查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_leasepromise_ex(request, headers, runtime)

    async def query_lease_leasepromise_async(
        self,
        request: twc_models.QueryLeaseLeasepromiseRequest,
    ) -> twc_models.QueryLeaseLeasepromiseResponse:
        """
        Description: 融资租赁租赁机构承诺查询
        Summary: 融资租赁租赁机构承诺查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_leasepromise_ex_async(request, headers, runtime)

    def query_lease_leasepromise_ex(
        self,
        request: twc_models.QueryLeaseLeasepromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseLeasepromiseResponse:
        """
        Description: 融资租赁租赁机构承诺查询
        Summary: 融资租赁租赁机构承诺查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseLeasepromiseResponse(),
            self.do_request('1.0', 'twc.notary.lease.leasepromise.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_leasepromise_ex_async(
        self,
        request: twc_models.QueryLeaseLeasepromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseLeasepromiseResponse:
        """
        Description: 融资租赁租赁机构承诺查询
        Summary: 融资租赁租赁机构承诺查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseLeasepromiseResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.leasepromise.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_creditpromise(
        self,
        request: twc_models.QueryLeaseCreditpromiseRequest,
    ) -> twc_models.QueryLeaseCreditpromiseResponse:
        """
        Description: 融资租赁资方承诺查询
        Summary: 融资租赁资方承诺查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_creditpromise_ex(request, headers, runtime)

    async def query_lease_creditpromise_async(
        self,
        request: twc_models.QueryLeaseCreditpromiseRequest,
    ) -> twc_models.QueryLeaseCreditpromiseResponse:
        """
        Description: 融资租赁资方承诺查询
        Summary: 融资租赁资方承诺查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_creditpromise_ex_async(request, headers, runtime)

    def query_lease_creditpromise_ex(
        self,
        request: twc_models.QueryLeaseCreditpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseCreditpromiseResponse:
        """
        Description: 融资租赁资方承诺查询
        Summary: 融资租赁资方承诺查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseCreditpromiseResponse(),
            self.do_request('1.0', 'twc.notary.lease.creditpromise.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_creditpromise_ex_async(
        self,
        request: twc_models.QueryLeaseCreditpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseCreditpromiseResponse:
        """
        Description: 融资租赁资方承诺查询
        Summary: 融资租赁资方承诺查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseCreditpromiseResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.creditpromise.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_clearing(
        self,
        request: twc_models.QueryLeaseClearingRequest,
    ) -> twc_models.QueryLeaseClearingResponse:
        """
        Description: 融资租赁订单清分信息查询
        Summary: 融资租赁订单清分信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_clearing_ex(request, headers, runtime)

    async def query_lease_clearing_async(
        self,
        request: twc_models.QueryLeaseClearingRequest,
    ) -> twc_models.QueryLeaseClearingResponse:
        """
        Description: 融资租赁订单清分信息查询
        Summary: 融资租赁订单清分信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_clearing_ex_async(request, headers, runtime)

    def query_lease_clearing_ex(
        self,
        request: twc_models.QueryLeaseClearingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseClearingResponse:
        """
        Description: 融资租赁订单清分信息查询
        Summary: 融资租赁订单清分信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseClearingResponse(),
            self.do_request('1.0', 'twc.notary.lease.clearing.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_clearing_ex_async(
        self,
        request: twc_models.QueryLeaseClearingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseClearingResponse:
        """
        Description: 融资租赁订单清分信息查询
        Summary: 融资租赁订单清分信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseClearingResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.clearing.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_rentalinfo(
        self,
        request: twc_models.QueryLeaseRentalinfoRequest,
    ) -> twc_models.QueryLeaseRentalinfoResponse:
        """
        Description: 融资租赁用户侧还款信息
        Summary: 融资租赁用户侧还款信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_rentalinfo_ex(request, headers, runtime)

    async def query_lease_rentalinfo_async(
        self,
        request: twc_models.QueryLeaseRentalinfoRequest,
    ) -> twc_models.QueryLeaseRentalinfoResponse:
        """
        Description: 融资租赁用户侧还款信息
        Summary: 融资租赁用户侧还款信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_rentalinfo_ex_async(request, headers, runtime)

    def query_lease_rentalinfo_ex(
        self,
        request: twc_models.QueryLeaseRentalinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseRentalinfoResponse:
        """
        Description: 融资租赁用户侧还款信息
        Summary: 融资租赁用户侧还款信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseRentalinfoResponse(),
            self.do_request('1.0', 'twc.notary.lease.rentalinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_rentalinfo_ex_async(
        self,
        request: twc_models.QueryLeaseRentalinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseRentalinfoResponse:
        """
        Description: 融资租赁用户侧还款信息
        Summary: 融资租赁用户侧还款信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseRentalinfoResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.rentalinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_repayment(
        self,
        request: twc_models.QueryLeaseRepaymentRequest,
    ) -> twc_models.QueryLeaseRepaymentResponse:
        """
        Description: 融资租赁资方还款信息查询
        Summary: 融资租赁资方还款信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_repayment_ex(request, headers, runtime)

    async def query_lease_repayment_async(
        self,
        request: twc_models.QueryLeaseRepaymentRequest,
    ) -> twc_models.QueryLeaseRepaymentResponse:
        """
        Description: 融资租赁资方还款信息查询
        Summary: 融资租赁资方还款信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_repayment_ex_async(request, headers, runtime)

    def query_lease_repayment_ex(
        self,
        request: twc_models.QueryLeaseRepaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseRepaymentResponse:
        """
        Description: 融资租赁资方还款信息查询
        Summary: 融资租赁资方还款信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseRepaymentResponse(),
            self.do_request('1.0', 'twc.notary.lease.repayment.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_repayment_ex_async(
        self,
        request: twc_models.QueryLeaseRepaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseRepaymentResponse:
        """
        Description: 融资租赁资方还款信息查询
        Summary: 融资租赁资方还款信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseRepaymentResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.repayment.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_orderproduct(
        self,
        request: twc_models.QueryLeaseOrderproductRequest,
    ) -> twc_models.QueryLeaseOrderproductResponse:
        """
        Description: 查询订单商品信息
        Summary: 查询订单商品信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_orderproduct_ex(request, headers, runtime)

    async def query_lease_orderproduct_async(
        self,
        request: twc_models.QueryLeaseOrderproductRequest,
    ) -> twc_models.QueryLeaseOrderproductResponse:
        """
        Description: 查询订单商品信息
        Summary: 查询订单商品信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_orderproduct_ex_async(request, headers, runtime)

    def query_lease_orderproduct_ex(
        self,
        request: twc_models.QueryLeaseOrderproductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseOrderproductResponse:
        """
        Description: 查询订单商品信息
        Summary: 查询订单商品信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseOrderproductResponse(),
            self.do_request('1.0', 'twc.notary.lease.orderproduct.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_orderproduct_ex_async(
        self,
        request: twc_models.QueryLeaseOrderproductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseOrderproductResponse:
        """
        Description: 查询订单商品信息
        Summary: 查询订单商品信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseOrderproductResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.orderproduct.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_financecredit(
        self,
        request: twc_models.QueryLeaseFinancecreditRequest,
    ) -> twc_models.QueryLeaseFinancecreditResponse:
        """
        Description: 融资租赁查询资金方信息
        Summary: 融资租赁查询资金方信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_financecredit_ex(request, headers, runtime)

    async def query_lease_financecredit_async(
        self,
        request: twc_models.QueryLeaseFinancecreditRequest,
    ) -> twc_models.QueryLeaseFinancecreditResponse:
        """
        Description: 融资租赁查询资金方信息
        Summary: 融资租赁查询资金方信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_financecredit_ex_async(request, headers, runtime)

    def query_lease_financecredit_ex(
        self,
        request: twc_models.QueryLeaseFinancecreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseFinancecreditResponse:
        """
        Description: 融资租赁查询资金方信息
        Summary: 融资租赁查询资金方信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseFinancecreditResponse(),
            self.do_request('1.0', 'twc.notary.lease.financecredit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_financecredit_ex_async(
        self,
        request: twc_models.QueryLeaseFinancecreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseFinancecreditResponse:
        """
        Description: 融资租赁查询资金方信息
        Summary: 融资租赁查询资金方信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseFinancecreditResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.financecredit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_refinance_orderid(
        self,
        request: twc_models.QueryRefinanceOrderidRequest,
    ) -> twc_models.QueryRefinanceOrderidResponse:
        """
        Description: 根据资产包id分页查询再融资订单id
        Summary: 分页查询再融资订单id
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_refinance_orderid_ex(request, headers, runtime)

    async def query_refinance_orderid_async(
        self,
        request: twc_models.QueryRefinanceOrderidRequest,
    ) -> twc_models.QueryRefinanceOrderidResponse:
        """
        Description: 根据资产包id分页查询再融资订单id
        Summary: 分页查询再融资订单id
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_refinance_orderid_ex_async(request, headers, runtime)

    def query_refinance_orderid_ex(
        self,
        request: twc_models.QueryRefinanceOrderidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryRefinanceOrderidResponse:
        """
        Description: 根据资产包id分页查询再融资订单id
        Summary: 分页查询再融资订单id
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryRefinanceOrderidResponse(),
            self.do_request('1.0', 'twc.notary.refinance.orderid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_refinance_orderid_ex_async(
        self,
        request: twc_models.QueryRefinanceOrderidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryRefinanceOrderidResponse:
        """
        Description: 根据资产包id分页查询再融资订单id
        Summary: 分页查询再融资订单id
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryRefinanceOrderidResponse(),
            await self.do_request_async('1.0', 'twc.notary.refinance.orderid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_refinance_order(
        self,
        request: twc_models.QueryRefinanceOrderRequest,
    ) -> twc_models.QueryRefinanceOrderResponse:
        """
        Description: 资产明细查询
        Summary: 资产明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_refinance_order_ex(request, headers, runtime)

    async def query_refinance_order_async(
        self,
        request: twc_models.QueryRefinanceOrderRequest,
    ) -> twc_models.QueryRefinanceOrderResponse:
        """
        Description: 资产明细查询
        Summary: 资产明细
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_refinance_order_ex_async(request, headers, runtime)

    def query_refinance_order_ex(
        self,
        request: twc_models.QueryRefinanceOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryRefinanceOrderResponse:
        """
        Description: 资产明细查询
        Summary: 资产明细
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryRefinanceOrderResponse(),
            self.do_request('1.0', 'twc.notary.refinance.order.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_refinance_order_ex_async(
        self,
        request: twc_models.QueryRefinanceOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryRefinanceOrderResponse:
        """
        Description: 资产明细查询
        Summary: 资产明细
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryRefinanceOrderResponse(),
            await self.do_request_async('1.0', 'twc.notary.refinance.order.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_refinance_product(
        self,
        request: twc_models.QueryRefinanceProductRequest,
    ) -> twc_models.QueryRefinanceProductResponse:
        """
        Description: 再融资的商品信息查询
        Summary: 再融资的商品信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_refinance_product_ex(request, headers, runtime)

    async def query_refinance_product_async(
        self,
        request: twc_models.QueryRefinanceProductRequest,
    ) -> twc_models.QueryRefinanceProductResponse:
        """
        Description: 再融资的商品信息查询
        Summary: 再融资的商品信息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_refinance_product_ex_async(request, headers, runtime)

    def query_refinance_product_ex(
        self,
        request: twc_models.QueryRefinanceProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryRefinanceProductResponse:
        """
        Description: 再融资的商品信息查询
        Summary: 再融资的商品信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryRefinanceProductResponse(),
            self.do_request('1.0', 'twc.notary.refinance.product.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_refinance_product_ex_async(
        self,
        request: twc_models.QueryRefinanceProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryRefinanceProductResponse:
        """
        Description: 再融资的商品信息查询
        Summary: 再融资的商品信息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryRefinanceProductResponse(),
            await self.do_request_async('1.0', 'twc.notary.refinance.product.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_refinance_package(
        self,
        request: twc_models.VerifyRefinancePackageRequest,
    ) -> twc_models.VerifyRefinancePackageResponse:
        """
        Description: 资产包的受让/驳回资产包
        Summary: 资产包的受让/驳回资产包
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_refinance_package_ex(request, headers, runtime)

    async def verify_refinance_package_async(
        self,
        request: twc_models.VerifyRefinancePackageRequest,
    ) -> twc_models.VerifyRefinancePackageResponse:
        """
        Description: 资产包的受让/驳回资产包
        Summary: 资产包的受让/驳回资产包
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_refinance_package_ex_async(request, headers, runtime)

    def verify_refinance_package_ex(
        self,
        request: twc_models.VerifyRefinancePackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.VerifyRefinancePackageResponse:
        """
        Description: 资产包的受让/驳回资产包
        Summary: 资产包的受让/驳回资产包
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.VerifyRefinancePackageResponse(),
            self.do_request('1.0', 'twc.notary.refinance.package.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_refinance_package_ex_async(
        self,
        request: twc_models.VerifyRefinancePackageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.VerifyRefinancePackageResponse:
        """
        Description: 资产包的受让/驳回资产包
        Summary: 资产包的受让/驳回资产包
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.VerifyRefinancePackageResponse(),
            await self.do_request_async('1.0', 'twc.notary.refinance.package.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_orderclearing(
        self,
        request: twc_models.QueryLeaseOrderclearingRequest,
    ) -> twc_models.QueryLeaseOrderclearingResponse:
        """
        Description: 融资租赁查询清分信息
        Summary: 融资租赁查询清分信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_orderclearing_ex(request, headers, runtime)

    async def query_lease_orderclearing_async(
        self,
        request: twc_models.QueryLeaseOrderclearingRequest,
    ) -> twc_models.QueryLeaseOrderclearingResponse:
        """
        Description: 融资租赁查询清分信息
        Summary: 融资租赁查询清分信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_orderclearing_ex_async(request, headers, runtime)

    def query_lease_orderclearing_ex(
        self,
        request: twc_models.QueryLeaseOrderclearingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseOrderclearingResponse:
        """
        Description: 融资租赁查询清分信息
        Summary: 融资租赁查询清分信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseOrderclearingResponse(),
            self.do_request('1.0', 'twc.notary.lease.orderclearing.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_orderclearing_ex_async(
        self,
        request: twc_models.QueryLeaseOrderclearingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseOrderclearingResponse:
        """
        Description: 融资租赁查询清分信息
        Summary: 融资租赁查询清分信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseOrderclearingResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.orderclearing.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_repaymentstatus(
        self,
        request: twc_models.QueryLeaseRepaymentstatusRequest,
    ) -> twc_models.QueryLeaseRepaymentstatusResponse:
        """
        Description: 融资租赁提前还款详情查询
        Summary: 融资租赁提前还款详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_repaymentstatus_ex(request, headers, runtime)

    async def query_lease_repaymentstatus_async(
        self,
        request: twc_models.QueryLeaseRepaymentstatusRequest,
    ) -> twc_models.QueryLeaseRepaymentstatusResponse:
        """
        Description: 融资租赁提前还款详情查询
        Summary: 融资租赁提前还款详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_repaymentstatus_ex_async(request, headers, runtime)

    def query_lease_repaymentstatus_ex(
        self,
        request: twc_models.QueryLeaseRepaymentstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseRepaymentstatusResponse:
        """
        Description: 融资租赁提前还款详情查询
        Summary: 融资租赁提前还款详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseRepaymentstatusResponse(),
            self.do_request('1.0', 'twc.notary.lease.repaymentstatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_repaymentstatus_ex_async(
        self,
        request: twc_models.QueryLeaseRepaymentstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseRepaymentstatusResponse:
        """
        Description: 融资租赁提前还款详情查询
        Summary: 融资租赁提前还款详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseRepaymentstatusResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.repaymentstatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_userperformance(
        self,
        request: twc_models.QueryLeaseUserperformanceRequest,
    ) -> twc_models.QueryLeaseUserperformanceResponse:
        """
        Description: 续租过程中，当前资方希望查询用户历史的履约表现
        Summary: 核验链上用户的履约情况
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_userperformance_ex(request, headers, runtime)

    async def query_lease_userperformance_async(
        self,
        request: twc_models.QueryLeaseUserperformanceRequest,
    ) -> twc_models.QueryLeaseUserperformanceResponse:
        """
        Description: 续租过程中，当前资方希望查询用户历史的履约表现
        Summary: 核验链上用户的履约情况
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_userperformance_ex_async(request, headers, runtime)

    def query_lease_userperformance_ex(
        self,
        request: twc_models.QueryLeaseUserperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseUserperformanceResponse:
        """
        Description: 续租过程中，当前资方希望查询用户历史的履约表现
        Summary: 核验链上用户的履约情况
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseUserperformanceResponse(),
            self.do_request('1.0', 'twc.notary.lease.userperformance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_userperformance_ex_async(
        self,
        request: twc_models.QueryLeaseUserperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseUserperformanceResponse:
        """
        Description: 续租过程中，当前资方希望查询用户历史的履约表现
        Summary: 核验链上用户的履约情况
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseUserperformanceResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.userperformance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_rentalverify(
        self,
        request: twc_models.QueryLeaseRentalverifyRequest,
    ) -> twc_models.QueryLeaseRentalverifyResponse:
        """
        Description: 履约流水核验查询
        Summary: 履约流水核验查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_rentalverify_ex(request, headers, runtime)

    async def query_lease_rentalverify_async(
        self,
        request: twc_models.QueryLeaseRentalverifyRequest,
    ) -> twc_models.QueryLeaseRentalverifyResponse:
        """
        Description: 履约流水核验查询
        Summary: 履约流水核验查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_rentalverify_ex_async(request, headers, runtime)

    def query_lease_rentalverify_ex(
        self,
        request: twc_models.QueryLeaseRentalverifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseRentalverifyResponse:
        """
        Description: 履约流水核验查询
        Summary: 履约流水核验查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseRentalverifyResponse(),
            self.do_request('1.0', 'twc.notary.lease.rentalverify.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_rentalverify_ex_async(
        self,
        request: twc_models.QueryLeaseRentalverifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseRentalverifyResponse:
        """
        Description: 履约流水核验查询
        Summary: 履约流水核验查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseRentalverifyResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.rentalverify.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_installment(
        self,
        request: twc_models.QueryLeaseInstallmentRequest,
    ) -> twc_models.QueryLeaseInstallmentResponse:
        """
        Description: 分期查询用户归还记录 资方还款 清分信息
        Summary: 分期查询用户归还记录 资方还款 清分信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_installment_ex(request, headers, runtime)

    async def query_lease_installment_async(
        self,
        request: twc_models.QueryLeaseInstallmentRequest,
    ) -> twc_models.QueryLeaseInstallmentResponse:
        """
        Description: 分期查询用户归还记录 资方还款 清分信息
        Summary: 分期查询用户归还记录 资方还款 清分信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_installment_ex_async(request, headers, runtime)

    def query_lease_installment_ex(
        self,
        request: twc_models.QueryLeaseInstallmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseInstallmentResponse:
        """
        Description: 分期查询用户归还记录 资方还款 清分信息
        Summary: 分期查询用户归还记录 资方还款 清分信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseInstallmentResponse(),
            self.do_request('1.0', 'twc.notary.lease.installment.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_installment_ex_async(
        self,
        request: twc_models.QueryLeaseInstallmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseInstallmentResponse:
        """
        Description: 分期查询用户归还记录 资方还款 清分信息
        Summary: 分期查询用户归还记录 资方还款 清分信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseInstallmentResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.installment.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_lease_insurance(
        self,
        request: twc_models.CancelLeaseInsuranceRequest,
    ) -> twc_models.CancelLeaseInsuranceResponse:
        """
        Description: 租赁保险退保接口
        Summary: 租赁保险退保
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_lease_insurance_ex(request, headers, runtime)

    async def cancel_lease_insurance_async(
        self,
        request: twc_models.CancelLeaseInsuranceRequest,
    ) -> twc_models.CancelLeaseInsuranceResponse:
        """
        Description: 租赁保险退保接口
        Summary: 租赁保险退保
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_lease_insurance_ex_async(request, headers, runtime)

    def cancel_lease_insurance_ex(
        self,
        request: twc_models.CancelLeaseInsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CancelLeaseInsuranceResponse:
        """
        Description: 租赁保险退保接口
        Summary: 租赁保险退保
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CancelLeaseInsuranceResponse(),
            self.do_request('1.0', 'twc.notary.lease.insurance.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_lease_insurance_ex_async(
        self,
        request: twc_models.CancelLeaseInsuranceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CancelLeaseInsuranceResponse:
        """
        Description: 租赁保险退保接口
        Summary: 租赁保险退保
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CancelLeaseInsuranceResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.insurance.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_refinance_invalidorder(
        self,
        request: twc_models.PushRefinanceInvalidorderRequest,
    ) -> twc_models.PushRefinanceInvalidorderResponse:
        """
        Description: 二级资方调用，通过此接口将资产包中的无效或者有效资产推送至租赁平台
        Summary: 再融资资产推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_refinance_invalidorder_ex(request, headers, runtime)

    async def push_refinance_invalidorder_async(
        self,
        request: twc_models.PushRefinanceInvalidorderRequest,
    ) -> twc_models.PushRefinanceInvalidorderResponse:
        """
        Description: 二级资方调用，通过此接口将资产包中的无效或者有效资产推送至租赁平台
        Summary: 再融资资产推送
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_refinance_invalidorder_ex_async(request, headers, runtime)

    def push_refinance_invalidorder_ex(
        self,
        request: twc_models.PushRefinanceInvalidorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.PushRefinanceInvalidorderResponse:
        """
        Description: 二级资方调用，通过此接口将资产包中的无效或者有效资产推送至租赁平台
        Summary: 再融资资产推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.PushRefinanceInvalidorderResponse(),
            self.do_request('1.0', 'twc.notary.refinance.invalidorder.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_refinance_invalidorder_ex_async(
        self,
        request: twc_models.PushRefinanceInvalidorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.PushRefinanceInvalidorderResponse:
        """
        Description: 二级资方调用，通过此接口将资产包中的无效或者有效资产推送至租赁平台
        Summary: 再融资资产推送
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.PushRefinanceInvalidorderResponse(),
            await self.do_request_async('1.0', 'twc.notary.refinance.invalidorder.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_risk(
        self,
        request: twc_models.CreateLeaseRiskRequest,
    ) -> twc_models.CreateLeaseRiskResponse:
        """
        Description: 蚂蚁链租赁的风控
        Summary: 蚂蚁链租赁的风控
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_risk_ex(request, headers, runtime)

    async def create_lease_risk_async(
        self,
        request: twc_models.CreateLeaseRiskRequest,
    ) -> twc_models.CreateLeaseRiskResponse:
        """
        Description: 蚂蚁链租赁的风控
        Summary: 蚂蚁链租赁的风控
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_risk_ex_async(request, headers, runtime)

    def create_lease_risk_ex(
        self,
        request: twc_models.CreateLeaseRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseRiskResponse:
        """
        Description: 蚂蚁链租赁的风控
        Summary: 蚂蚁链租赁的风控
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateLeaseRiskResponse(),
            self.do_request('1.0', 'twc.notary.lease.risk.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_risk_ex_async(
        self,
        request: twc_models.CreateLeaseRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseRiskResponse:
        """
        Description: 蚂蚁链租赁的风控
        Summary: 蚂蚁链租赁的风控
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateLeaseRiskResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.risk.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_asyncverifyinfo(
        self,
        request: twc_models.CreateLeaseAsyncverifyinfoRequest,
    ) -> twc_models.CreateLeaseAsyncverifyinfoResponse:
        """
        Description: 融资平台上传租赁物购买贷款订单信息，此接口为异步接口，上链结果需调用查询接口来查
        Summary: 上传租赁物购买贷款订单信息（异步）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_asyncverifyinfo_ex(request, headers, runtime)

    async def create_lease_asyncverifyinfo_async(
        self,
        request: twc_models.CreateLeaseAsyncverifyinfoRequest,
    ) -> twc_models.CreateLeaseAsyncverifyinfoResponse:
        """
        Description: 融资平台上传租赁物购买贷款订单信息，此接口为异步接口，上链结果需调用查询接口来查
        Summary: 上传租赁物购买贷款订单信息（异步）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_asyncverifyinfo_ex_async(request, headers, runtime)

    def create_lease_asyncverifyinfo_ex(
        self,
        request: twc_models.CreateLeaseAsyncverifyinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseAsyncverifyinfoResponse:
        """
        Description: 融资平台上传租赁物购买贷款订单信息，此接口为异步接口，上链结果需调用查询接口来查
        Summary: 上传租赁物购买贷款订单信息（异步）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateLeaseAsyncverifyinfoResponse(),
            self.do_request('1.0', 'twc.notary.lease.asyncverifyinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_asyncverifyinfo_ex_async(
        self,
        request: twc_models.CreateLeaseAsyncverifyinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseAsyncverifyinfoResponse:
        """
        Description: 融资平台上传租赁物购买贷款订单信息，此接口为异步接口，上链结果需调用查询接口来查
        Summary: 上传租赁物购买贷款订单信息（异步）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateLeaseAsyncverifyinfoResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.asyncverifyinfo.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_asynccreditpromise(
        self,
        request: twc_models.CreateLeaseAsynccreditpromiseRequest,
    ) -> twc_models.CreateLeaseAsynccreditpromiseResponse:
        """
        Description: 融资方上传承诺信息，此接口异步上合约，合约调用结果需调用查询接口
        Summary: 融资方上传承诺信息(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_asynccreditpromise_ex(request, headers, runtime)

    async def create_lease_asynccreditpromise_async(
        self,
        request: twc_models.CreateLeaseAsynccreditpromiseRequest,
    ) -> twc_models.CreateLeaseAsynccreditpromiseResponse:
        """
        Description: 融资方上传承诺信息，此接口异步上合约，合约调用结果需调用查询接口
        Summary: 融资方上传承诺信息(异步)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_asynccreditpromise_ex_async(request, headers, runtime)

    def create_lease_asynccreditpromise_ex(
        self,
        request: twc_models.CreateLeaseAsynccreditpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseAsynccreditpromiseResponse:
        """
        Description: 融资方上传承诺信息，此接口异步上合约，合约调用结果需调用查询接口
        Summary: 融资方上传承诺信息(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateLeaseAsynccreditpromiseResponse(),
            self.do_request('1.0', 'twc.notary.lease.asynccreditpromise.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_asynccreditpromise_ex_async(
        self,
        request: twc_models.CreateLeaseAsynccreditpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseAsynccreditpromiseResponse:
        """
        Description: 融资方上传承诺信息，此接口异步上合约，合约调用结果需调用查询接口
        Summary: 融资方上传承诺信息(异步)
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateLeaseAsynccreditpromiseResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.asynccreditpromise.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_asyncclearing(
        self,
        request: twc_models.CreateLeaseAsyncclearingRequest,
    ) -> twc_models.CreateLeaseAsyncclearingResponse:
        """
        Description: 清分服务机构上传资金清算记录，分期上传。异步上链，上链结果需要调用查询接口。
        Summary: 清分服务机构上传资金清算记录，分期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_asyncclearing_ex(request, headers, runtime)

    async def create_lease_asyncclearing_async(
        self,
        request: twc_models.CreateLeaseAsyncclearingRequest,
    ) -> twc_models.CreateLeaseAsyncclearingResponse:
        """
        Description: 清分服务机构上传资金清算记录，分期上传。异步上链，上链结果需要调用查询接口。
        Summary: 清分服务机构上传资金清算记录，分期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_asyncclearing_ex_async(request, headers, runtime)

    def create_lease_asyncclearing_ex(
        self,
        request: twc_models.CreateLeaseAsyncclearingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseAsyncclearingResponse:
        """
        Description: 清分服务机构上传资金清算记录，分期上传。异步上链，上链结果需要调用查询接口。
        Summary: 清分服务机构上传资金清算记录，分期
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateLeaseAsyncclearingResponse(),
            self.do_request('1.0', 'twc.notary.lease.asyncclearing.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_asyncclearing_ex_async(
        self,
        request: twc_models.CreateLeaseAsyncclearingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseAsyncclearingResponse:
        """
        Description: 清分服务机构上传资金清算记录，分期上传。异步上链，上链结果需要调用查询接口。
        Summary: 清分服务机构上传资金清算记录，分期
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateLeaseAsyncclearingResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.asyncclearing.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_asyncrepayment(
        self,
        request: twc_models.CreateLeaseAsyncrepaymentRequest,
    ) -> twc_models.CreateLeaseAsyncrepaymentResponse:
        """
        Description: 融资金融机构上传还款信息 每期。异步上链，上链结果需要调用查询接口
        Summary: 融资金融机构上传还款信息 每期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_asyncrepayment_ex(request, headers, runtime)

    async def create_lease_asyncrepayment_async(
        self,
        request: twc_models.CreateLeaseAsyncrepaymentRequest,
    ) -> twc_models.CreateLeaseAsyncrepaymentResponse:
        """
        Description: 融资金融机构上传还款信息 每期。异步上链，上链结果需要调用查询接口
        Summary: 融资金融机构上传还款信息 每期
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_asyncrepayment_ex_async(request, headers, runtime)

    def create_lease_asyncrepayment_ex(
        self,
        request: twc_models.CreateLeaseAsyncrepaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseAsyncrepaymentResponse:
        """
        Description: 融资金融机构上传还款信息 每期。异步上链，上链结果需要调用查询接口
        Summary: 融资金融机构上传还款信息 每期
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateLeaseAsyncrepaymentResponse(),
            self.do_request('1.0', 'twc.notary.lease.asyncrepayment.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_asyncrepayment_ex_async(
        self,
        request: twc_models.CreateLeaseAsyncrepaymentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseAsyncrepaymentResponse:
        """
        Description: 融资金融机构上传还款信息 每期。异步上链，上链结果需要调用查询接口
        Summary: 融资金融机构上传还款信息 每期
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateLeaseAsyncrepaymentResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.asyncrepayment.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_asyncaudit(
        self,
        request: twc_models.CreateLeaseAsyncauditRequest,
    ) -> twc_models.CreateLeaseAsyncauditResponse:
        """
        Description: 融资平台审核订单信息，异步上链，上链结果可调用查询接口
        Summary: 融资平台审核订单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_asyncaudit_ex(request, headers, runtime)

    async def create_lease_asyncaudit_async(
        self,
        request: twc_models.CreateLeaseAsyncauditRequest,
    ) -> twc_models.CreateLeaseAsyncauditResponse:
        """
        Description: 融资平台审核订单信息，异步上链，上链结果可调用查询接口
        Summary: 融资平台审核订单信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_asyncaudit_ex_async(request, headers, runtime)

    def create_lease_asyncaudit_ex(
        self,
        request: twc_models.CreateLeaseAsyncauditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseAsyncauditResponse:
        """
        Description: 融资平台审核订单信息，异步上链，上链结果可调用查询接口
        Summary: 融资平台审核订单信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateLeaseAsyncauditResponse(),
            self.do_request('1.0', 'twc.notary.lease.asyncaudit.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_asyncaudit_ex_async(
        self,
        request: twc_models.CreateLeaseAsyncauditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseAsyncauditResponse:
        """
        Description: 融资平台审核订单信息，异步上链，上链结果可调用查询接口
        Summary: 融资平台审核订单信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateLeaseAsyncauditResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.asyncaudit.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_lease_asyncpaymentfile(
        self,
        request: twc_models.CreateLeaseAsyncpaymentfileRequest,
    ) -> twc_models.CreateLeaseAsyncpaymentfileResponse:
        """
        Description: 租赁平台上传付款通知信息，异步上链，上链结果可调用查询接口
        Summary: 租赁平台上传付款通知信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_lease_asyncpaymentfile_ex(request, headers, runtime)

    async def create_lease_asyncpaymentfile_async(
        self,
        request: twc_models.CreateLeaseAsyncpaymentfileRequest,
    ) -> twc_models.CreateLeaseAsyncpaymentfileResponse:
        """
        Description: 租赁平台上传付款通知信息，异步上链，上链结果可调用查询接口
        Summary: 租赁平台上传付款通知信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_lease_asyncpaymentfile_ex_async(request, headers, runtime)

    def create_lease_asyncpaymentfile_ex(
        self,
        request: twc_models.CreateLeaseAsyncpaymentfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseAsyncpaymentfileResponse:
        """
        Description: 租赁平台上传付款通知信息，异步上链，上链结果可调用查询接口
        Summary: 租赁平台上传付款通知信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateLeaseAsyncpaymentfileResponse(),
            self.do_request('1.0', 'twc.notary.lease.asyncpaymentfile.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_lease_asyncpaymentfile_ex_async(
        self,
        request: twc_models.CreateLeaseAsyncpaymentfileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateLeaseAsyncpaymentfileResponse:
        """
        Description: 租赁平台上传付款通知信息，异步上链，上链结果可调用查询接口
        Summary: 租赁平台上传付款通知信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateLeaseAsyncpaymentfileResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.asyncpaymentfile.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_asyncencryptedinfo(
        self,
        request: twc_models.QueryLeaseAsyncencryptedinfoRequest,
    ) -> twc_models.QueryLeaseAsyncencryptedinfoResponse:
        """
        Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密。此接口为异步查询接口，建议间隔一段时间后再次查询获取结果
        Summary: 查询用户等加密信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_asyncencryptedinfo_ex(request, headers, runtime)

    async def query_lease_asyncencryptedinfo_async(
        self,
        request: twc_models.QueryLeaseAsyncencryptedinfoRequest,
    ) -> twc_models.QueryLeaseAsyncencryptedinfoResponse:
        """
        Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密。此接口为异步查询接口，建议间隔一段时间后再次查询获取结果
        Summary: 查询用户等加密信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_asyncencryptedinfo_ex_async(request, headers, runtime)

    def query_lease_asyncencryptedinfo_ex(
        self,
        request: twc_models.QueryLeaseAsyncencryptedinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseAsyncencryptedinfoResponse:
        """
        Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密。此接口为异步查询接口，建议间隔一段时间后再次查询获取结果
        Summary: 查询用户等加密信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseAsyncencryptedinfoResponse(),
            self.do_request('1.0', 'twc.notary.lease.asyncencryptedinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_asyncencryptedinfo_ex_async(
        self,
        request: twc_models.QueryLeaseAsyncencryptedinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseAsyncencryptedinfoResponse:
        """
        Description: 查询用户等加密信息，返回加密后的结果，用户自己进行解密。此接口为异步查询接口，建议间隔一段时间后再次查询获取结果
        Summary: 查询用户等加密信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseAsyncencryptedinfoResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.asyncencryptedinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_lease_asynccall(
        self,
        request: twc_models.QueryLeaseAsynccallRequest,
    ) -> twc_models.QueryLeaseAsynccallResponse:
        """
        Description: 租赁异步调用上链结果回查
        Summary: 租赁异步调用上链结果回查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_lease_asynccall_ex(request, headers, runtime)

    async def query_lease_asynccall_async(
        self,
        request: twc_models.QueryLeaseAsynccallRequest,
    ) -> twc_models.QueryLeaseAsynccallResponse:
        """
        Description: 租赁异步调用上链结果回查
        Summary: 租赁异步调用上链结果回查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_lease_asynccall_ex_async(request, headers, runtime)

    def query_lease_asynccall_ex(
        self,
        request: twc_models.QueryLeaseAsynccallRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseAsynccallResponse:
        """
        Description: 租赁异步调用上链结果回查
        Summary: 租赁异步调用上链结果回查
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseAsynccallResponse(),
            self.do_request('1.0', 'twc.notary.lease.asynccall.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_lease_asynccall_ex_async(
        self,
        request: twc_models.QueryLeaseAsynccallRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryLeaseAsynccallResponse:
        """
        Description: 租赁异步调用上链结果回查
        Summary: 租赁异步调用上链结果回查
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryLeaseAsynccallResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.asynccall.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
        return TeaCore.from_map(
            twc_models.CreateWitnessFlowResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateWitnessFlowResponse(),
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
        return TeaCore.from_map(
            twc_models.SaveWitnessSnapshotResponse(),
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
        return TeaCore.from_map(
            twc_models.SaveWitnessSnapshotResponse(),
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
        return TeaCore.from_map(
            twc_models.CheckWitnessSignaccessResponse(),
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
        return TeaCore.from_map(
            twc_models.CheckWitnessSignaccessResponse(),
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
        return TeaCore.from_map(
            twc_models.AuthWitnessFlowResponse(),
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
        return TeaCore.from_map(
            twc_models.AuthWitnessFlowResponse(),
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
        return TeaCore.from_map(
            twc_models.ConfirmWitnessFlowResponse(),
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
        return TeaCore.from_map(
            twc_models.ConfirmWitnessFlowResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateTransResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateTransResponse(),
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
        return TeaCore.from_map(
            twc_models.GetTransResponse(),
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
        return TeaCore.from_map(
            twc_models.GetTransResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateTextResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateTextResponse(),
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
        return TeaCore.from_map(
            twc_models.GetTextResponse(),
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
        return TeaCore.from_map(
            twc_models.GetTextResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateFileResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateFileResponse(),
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
        return TeaCore.from_map(
            twc_models.GetFileResponse(),
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
        return TeaCore.from_map(
            twc_models.GetFileResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateSourceResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateSourceResponse(),
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
        return TeaCore.from_map(
            twc_models.GetSourceResponse(),
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
        return TeaCore.from_map(
            twc_models.GetSourceResponse(),
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
        return TeaCore.from_map(
            twc_models.CheckStatusResponse(),
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
        return TeaCore.from_map(
            twc_models.CheckStatusResponse(),
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
        return TeaCore.from_map(
            twc_models.DeployLeaseContractResponse(),
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
        return TeaCore.from_map(
            twc_models.DeployLeaseContractResponse(),
            await self.do_request_async('1.0', 'twc.notary.lease.contract.deploy', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
        return TeaCore.from_map(
            twc_models.AuthLeaseContractResponse(),
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
        return TeaCore.from_map(
            twc_models.AuthLeaseContractResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseUserinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseUserinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseOrderinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseOrderinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeasePromiseResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeasePromiseResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseVerifyinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseVerifyinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseCreditpromiseResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseCreditpromiseResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseDisburseinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseDisburseinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryLeaseOrderinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryLeaseOrderinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateFinanceTextnotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateFinanceTextnotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.GetFinanceTextnotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.GetFinanceTextnotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateFinanceFilenotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateFinanceFilenotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.GetFinanceFilenotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.GetFinanceFilenotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.CheckIndustryNotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.CheckIndustryNotaryResponse(),
            await self.do_request_async('1.0', 'twc.notary.industry.notary.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
        return TeaCore.from_map(
            twc_models.CreateSueBreakpromiseinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateSueBreakpromiseinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.UpdateSueBreakpromiseinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.UpdateSueBreakpromiseinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.DeleteSueBreakpromiseinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.DeleteSueBreakpromiseinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.QuerySueUserinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.QuerySueUserinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.UpdateSueExeplarycontractResponse(),
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
        return TeaCore.from_map(
            twc_models.UpdateSueExeplarycontractResponse(),
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
        return TeaCore.from_map(
            twc_models.UpdateSueExemplaryrevertResponse(),
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
        return TeaCore.from_map(
            twc_models.UpdateSueExemplaryrevertResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseAuditResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseAuditResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeasePaymentfileResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeasePaymentfileResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseRentalResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseRentalResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseClearingResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseClearingResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseRepaymentResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseRepaymentResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseNotifyregisterResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseNotifyregisterResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryLeaseIotinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryLeaseIotinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateCourtTextnotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateCourtTextnotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.GetCourtTextnotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.GetCourtTextnotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateCourtFilenotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateCourtFilenotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.GetCourtFilenotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.GetCourtFilenotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseRouteResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseRouteResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryLeaseEncryptedinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryLeaseEncryptedinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractTextResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateContractTextResponse(),
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
        return TeaCore.from_map(
            twc_models.ApplyContractReportResponse(),
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
        return TeaCore.from_map(
            twc_models.ApplyContractReportResponse(),
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
        return TeaCore.from_map(
            twc_models.GetContractTextResponse(),
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
        return TeaCore.from_map(
            twc_models.GetContractTextResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateInternalTransResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateInternalTransResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateInternalTextResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateInternalTextResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseTextResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseTextResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseFileResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseFileResponse(),
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
        return TeaCore.from_map(
            twc_models.ListLeaseNotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.ListLeaseNotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryLeaseApplicationResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryLeaseApplicationResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryLeaseApplicationdetailinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryLeaseApplicationdetailinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.SetLeaseRepaymentstatusResponse(),
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
        return TeaCore.from_map(
            twc_models.SetLeaseRepaymentstatusResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseSupplierinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseSupplierinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.DeployMytfTappResponse(),
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
        return TeaCore.from_map(
            twc_models.DeployMytfTappResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseSupplierdynamicinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseSupplierdynamicinfoResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseBizResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseBizResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryLeaseProofResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryLeaseProofResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLargefileResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLargefileResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryLeaseBizResponse(),
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
        return TeaCore.from_map(
            twc_models.QueryLeaseBizResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseBiznotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseBiznotaryResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateInternalContractResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateInternalContractResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseZftagreementsignResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseZftagreementsignResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseZftagreementunsignResponse(),
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
        return TeaCore.from_map(
            twc_models.CreateLeaseZftagreementunsignResponse(),
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
        return TeaCore.from_map(
            twc_models.GetCertificateDetailResponse(),
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
        return TeaCore.from_map(
            twc_models.GetCertificateDetailResponse(),
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
        return TeaCore.from_map(
            twc_models.GetInternalTextResponse(),
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
        return TeaCore.from_map(
            twc_models.GetInternalTextResponse(),
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
        return TeaCore.from_map(
            twc_models.OpenInternalTwcResponse(),
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
        return TeaCore.from_map(
            twc_models.OpenInternalTwcResponse(),
            await self.do_request_async('1.0', 'twc.notary.internal.twc.open', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_specify_trans(
        self,
        request: twc_models.CreateSpecifyTransRequest,
    ) -> twc_models.CreateSpecifyTransResponse:
        """
        Description: 指定节点获取存证事务Id
        Summary: 指定节点获取存证事务id
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_specify_trans_ex(request, headers, runtime)

    async def create_specify_trans_async(
        self,
        request: twc_models.CreateSpecifyTransRequest,
    ) -> twc_models.CreateSpecifyTransResponse:
        """
        Description: 指定节点获取存证事务Id
        Summary: 指定节点获取存证事务id
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_specify_trans_ex_async(request, headers, runtime)

    def create_specify_trans_ex(
        self,
        request: twc_models.CreateSpecifyTransRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateSpecifyTransResponse:
        """
        Description: 指定节点获取存证事务Id
        Summary: 指定节点获取存证事务id
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateSpecifyTransResponse(),
            self.do_request('1.0', 'twc.notary.specify.trans.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_specify_trans_ex_async(
        self,
        request: twc_models.CreateSpecifyTransRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateSpecifyTransResponse:
        """
        Description: 指定节点获取存证事务Id
        Summary: 指定节点获取存证事务id
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateSpecifyTransResponse(),
            await self.do_request_async('1.0', 'twc.notary.specify.trans.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_specify_text(
        self,
        request: twc_models.CreateSpecifyTextRequest,
    ) -> twc_models.CreateSpecifyTextResponse:
        """
        Description: 指定节点文本存证
        Summary: 指定节点文本存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_specify_text_ex(request, headers, runtime)

    async def create_specify_text_async(
        self,
        request: twc_models.CreateSpecifyTextRequest,
    ) -> twc_models.CreateSpecifyTextResponse:
        """
        Description: 指定节点文本存证
        Summary: 指定节点文本存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_specify_text_ex_async(request, headers, runtime)

    def create_specify_text_ex(
        self,
        request: twc_models.CreateSpecifyTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateSpecifyTextResponse:
        """
        Description: 指定节点文本存证
        Summary: 指定节点文本存证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateSpecifyTextResponse(),
            self.do_request('1.0', 'twc.notary.specify.text.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_specify_text_ex_async(
        self,
        request: twc_models.CreateSpecifyTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateSpecifyTextResponse:
        """
        Description: 指定节点文本存证
        Summary: 指定节点文本存证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateSpecifyTextResponse(),
            await self.do_request_async('1.0', 'twc.notary.specify.text.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_internal_file(
        self,
        request: twc_models.CreateInternalFileRequest,
    ) -> twc_models.CreateInternalFileResponse:
        """
        Description: 文件存证大租户内部接口
        Summary: 文件存证内部接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_internal_file_ex(request, headers, runtime)

    async def create_internal_file_async(
        self,
        request: twc_models.CreateInternalFileRequest,
    ) -> twc_models.CreateInternalFileResponse:
        """
        Description: 文件存证大租户内部接口
        Summary: 文件存证内部接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_internal_file_ex_async(request, headers, runtime)

    def create_internal_file_ex(
        self,
        request: twc_models.CreateInternalFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateInternalFileResponse:
        """
        Description: 文件存证大租户内部接口
        Summary: 文件存证内部接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateInternalFileResponse(),
            self.do_request('1.0', 'twc.notary.internal.file.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_internal_file_ex_async(
        self,
        request: twc_models.CreateInternalFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateInternalFileResponse:
        """
        Description: 文件存证大租户内部接口
        Summary: 文件存证内部接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateInternalFileResponse(),
            await self.do_request_async('1.0', 'twc.notary.internal.file.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_internal_file(
        self,
        request: twc_models.GetInternalFileRequest,
    ) -> twc_models.GetInternalFileResponse:
        """
        Description: 获取文件存证内容内部接口
        Summary: 获取文件存证内容内部接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_internal_file_ex(request, headers, runtime)

    async def get_internal_file_async(
        self,
        request: twc_models.GetInternalFileRequest,
    ) -> twc_models.GetInternalFileResponse:
        """
        Description: 获取文件存证内容内部接口
        Summary: 获取文件存证内容内部接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_internal_file_ex_async(request, headers, runtime)

    def get_internal_file_ex(
        self,
        request: twc_models.GetInternalFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetInternalFileResponse:
        """
        Description: 获取文件存证内容内部接口
        Summary: 获取文件存证内容内部接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.GetInternalFileResponse(),
            self.do_request('1.0', 'twc.notary.internal.file.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_internal_file_ex_async(
        self,
        request: twc_models.GetInternalFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetInternalFileResponse:
        """
        Description: 获取文件存证内容内部接口
        Summary: 获取文件存证内容内部接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.GetInternalFileResponse(),
            await self.do_request_async('1.0', 'twc.notary.internal.file.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_dataflow_text(
        self,
        request: twc_models.CreateDataflowTextRequest,
    ) -> twc_models.CreateDataflowTextResponse:
        """
        Description: 数据流转文本存证
        Summary: 数据流转文本存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_dataflow_text_ex(request, headers, runtime)

    async def create_dataflow_text_async(
        self,
        request: twc_models.CreateDataflowTextRequest,
    ) -> twc_models.CreateDataflowTextResponse:
        """
        Description: 数据流转文本存证
        Summary: 数据流转文本存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_dataflow_text_ex_async(request, headers, runtime)

    def create_dataflow_text_ex(
        self,
        request: twc_models.CreateDataflowTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateDataflowTextResponse:
        """
        Description: 数据流转文本存证
        Summary: 数据流转文本存证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateDataflowTextResponse(),
            self.do_request('1.0', 'twc.notary.dataflow.text.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_dataflow_text_ex_async(
        self,
        request: twc_models.CreateDataflowTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateDataflowTextResponse:
        """
        Description: 数据流转文本存证
        Summary: 数据流转文本存证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateDataflowTextResponse(),
            await self.do_request_async('1.0', 'twc.notary.dataflow.text.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_dataflow_text(
        self,
        request: twc_models.GetDataflowTextRequest,
    ) -> twc_models.GetDataflowTextResponse:
        """
        Description: 查询数据流转文本存证内容
        Summary: 查询数据流转文本存证内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_dataflow_text_ex(request, headers, runtime)

    async def get_dataflow_text_async(
        self,
        request: twc_models.GetDataflowTextRequest,
    ) -> twc_models.GetDataflowTextResponse:
        """
        Description: 查询数据流转文本存证内容
        Summary: 查询数据流转文本存证内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_dataflow_text_ex_async(request, headers, runtime)

    def get_dataflow_text_ex(
        self,
        request: twc_models.GetDataflowTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetDataflowTextResponse:
        """
        Description: 查询数据流转文本存证内容
        Summary: 查询数据流转文本存证内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.GetDataflowTextResponse(),
            self.do_request('1.0', 'twc.notary.dataflow.text.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_dataflow_text_ex_async(
        self,
        request: twc_models.GetDataflowTextRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.GetDataflowTextResponse:
        """
        Description: 查询数据流转文本存证内容
        Summary: 查询数据流转文本存证内容
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.GetDataflowTextResponse(),
            await self.do_request_async('1.0', 'twc.notary.dataflow.text.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_dataflow_trans(
        self,
        request: twc_models.CreateDataflowTransRequest,
    ) -> twc_models.CreateDataflowTransResponse:
        """
        Description: 数据流转存证创建存证事务
        Summary: 数据流转存证创建存证事务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_dataflow_trans_ex(request, headers, runtime)

    async def create_dataflow_trans_async(
        self,
        request: twc_models.CreateDataflowTransRequest,
    ) -> twc_models.CreateDataflowTransResponse:
        """
        Description: 数据流转存证创建存证事务
        Summary: 数据流转存证创建存证事务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_dataflow_trans_ex_async(request, headers, runtime)

    def create_dataflow_trans_ex(
        self,
        request: twc_models.CreateDataflowTransRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateDataflowTransResponse:
        """
        Description: 数据流转存证创建存证事务
        Summary: 数据流转存证创建存证事务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateDataflowTransResponse(),
            self.do_request('1.0', 'twc.notary.dataflow.trans.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_dataflow_trans_ex_async(
        self,
        request: twc_models.CreateDataflowTransRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateDataflowTransResponse:
        """
        Description: 数据流转存证创建存证事务
        Summary: 数据流转存证创建存证事务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateDataflowTransResponse(),
            await self.do_request_async('1.0', 'twc.notary.dataflow.trans.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def deploy_dataflow_contract(
        self,
        request: twc_models.DeployDataflowContractRequest,
    ) -> twc_models.DeployDataflowContractResponse:
        """
        Description: 数据流转存证需要通过存证合约进行授权和流转的管理，存证方可以通过本接口发起管理合约的部署。
        Summary: 发起管理合约部署
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.deploy_dataflow_contract_ex(request, headers, runtime)

    async def deploy_dataflow_contract_async(
        self,
        request: twc_models.DeployDataflowContractRequest,
    ) -> twc_models.DeployDataflowContractResponse:
        """
        Description: 数据流转存证需要通过存证合约进行授权和流转的管理，存证方可以通过本接口发起管理合约的部署。
        Summary: 发起管理合约部署
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.deploy_dataflow_contract_ex_async(request, headers, runtime)

    def deploy_dataflow_contract_ex(
        self,
        request: twc_models.DeployDataflowContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DeployDataflowContractResponse:
        """
        Description: 数据流转存证需要通过存证合约进行授权和流转的管理，存证方可以通过本接口发起管理合约的部署。
        Summary: 发起管理合约部署
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.DeployDataflowContractResponse(),
            self.do_request('1.0', 'twc.notary.dataflow.contract.deploy', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def deploy_dataflow_contract_ex_async(
        self,
        request: twc_models.DeployDataflowContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DeployDataflowContractResponse:
        """
        Description: 数据流转存证需要通过存证合约进行授权和流转的管理，存证方可以通过本接口发起管理合约的部署。
        Summary: 发起管理合约部署
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.DeployDataflowContractResponse(),
            await self.do_request_async('1.0', 'twc.notary.dataflow.contract.deploy', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_dataflow_authorize(
        self,
        request: twc_models.CreateDataflowAuthorizeRequest,
    ) -> twc_models.CreateDataflowAuthorizeResponse:
        """
        Description: 存证方对证据的使用方进行各类型的权限授予，允许使用方调用存证合约中的对应方法。
        Summary: 发起授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_dataflow_authorize_ex(request, headers, runtime)

    async def create_dataflow_authorize_async(
        self,
        request: twc_models.CreateDataflowAuthorizeRequest,
    ) -> twc_models.CreateDataflowAuthorizeResponse:
        """
        Description: 存证方对证据的使用方进行各类型的权限授予，允许使用方调用存证合约中的对应方法。
        Summary: 发起授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_dataflow_authorize_ex_async(request, headers, runtime)

    def create_dataflow_authorize_ex(
        self,
        request: twc_models.CreateDataflowAuthorizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateDataflowAuthorizeResponse:
        """
        Description: 存证方对证据的使用方进行各类型的权限授予，允许使用方调用存证合约中的对应方法。
        Summary: 发起授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateDataflowAuthorizeResponse(),
            self.do_request('1.0', 'twc.notary.dataflow.authorize.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_dataflow_authorize_ex_async(
        self,
        request: twc_models.CreateDataflowAuthorizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateDataflowAuthorizeResponse:
        """
        Description: 存证方对证据的使用方进行各类型的权限授予，允许使用方调用存证合约中的对应方法。
        Summary: 发起授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateDataflowAuthorizeResponse(),
            await self.do_request_async('1.0', 'twc.notary.dataflow.authorize.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_dataflow_authorize(
        self,
        request: twc_models.CancelDataflowAuthorizeRequest,
    ) -> twc_models.CancelDataflowAuthorizeResponse:
        """
        Description: 存证方对撤销已经发起的权限授予。
        Summary: 撤销授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_dataflow_authorize_ex(request, headers, runtime)

    async def cancel_dataflow_authorize_async(
        self,
        request: twc_models.CancelDataflowAuthorizeRequest,
    ) -> twc_models.CancelDataflowAuthorizeResponse:
        """
        Description: 存证方对撤销已经发起的权限授予。
        Summary: 撤销授权
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_dataflow_authorize_ex_async(request, headers, runtime)

    def cancel_dataflow_authorize_ex(
        self,
        request: twc_models.CancelDataflowAuthorizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CancelDataflowAuthorizeResponse:
        """
        Description: 存证方对撤销已经发起的权限授予。
        Summary: 撤销授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CancelDataflowAuthorizeResponse(),
            self.do_request('1.0', 'twc.notary.dataflow.authorize.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_dataflow_authorize_ex_async(
        self,
        request: twc_models.CancelDataflowAuthorizeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CancelDataflowAuthorizeResponse:
        """
        Description: 存证方对撤销已经发起的权限授予。
        Summary: 撤销授权
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CancelDataflowAuthorizeResponse(),
            await self.do_request_async('1.0', 'twc.notary.dataflow.authorize.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dataflow_action(
        self,
        request: twc_models.QueryDataflowActionRequest,
    ) -> twc_models.QueryDataflowActionResponse:
        """
        Description: 查询存证管理合约的部署/授权/撤销授权/密钥上传等操作的执行结果。
        Summary: 查询对存证合约的各类操作执行结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dataflow_action_ex(request, headers, runtime)

    async def query_dataflow_action_async(
        self,
        request: twc_models.QueryDataflowActionRequest,
    ) -> twc_models.QueryDataflowActionResponse:
        """
        Description: 查询存证管理合约的部署/授权/撤销授权/密钥上传等操作的执行结果。
        Summary: 查询对存证合约的各类操作执行结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dataflow_action_ex_async(request, headers, runtime)

    def query_dataflow_action_ex(
        self,
        request: twc_models.QueryDataflowActionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryDataflowActionResponse:
        """
        Description: 查询存证管理合约的部署/授权/撤销授权/密钥上传等操作的执行结果。
        Summary: 查询对存证合约的各类操作执行结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryDataflowActionResponse(),
            self.do_request('1.0', 'twc.notary.dataflow.action.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dataflow_action_ex_async(
        self,
        request: twc_models.QueryDataflowActionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryDataflowActionResponse:
        """
        Description: 查询存证管理合约的部署/授权/撤销授权/密钥上传等操作的执行结果。
        Summary: 查询对存证合约的各类操作执行结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryDataflowActionResponse(),
            await self.do_request_async('1.0', 'twc.notary.dataflow.action.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_dataflow_pubkey(
        self,
        request: twc_models.UploadDataflowPubkeyRequest,
    ) -> twc_models.UploadDataflowPubkeyResponse:
        """
        Description: 存证的使用方，在获得密钥上传（PUBKEY_UPLOAD）授权后，使用本接口上传信封密钥，后续查询存证时，会使用此信封密钥对存证原文加密，将密文返回，保障数据安全。
        Summary: 发起信封密钥上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_dataflow_pubkey_ex(request, headers, runtime)

    async def upload_dataflow_pubkey_async(
        self,
        request: twc_models.UploadDataflowPubkeyRequest,
    ) -> twc_models.UploadDataflowPubkeyResponse:
        """
        Description: 存证的使用方，在获得密钥上传（PUBKEY_UPLOAD）授权后，使用本接口上传信封密钥，后续查询存证时，会使用此信封密钥对存证原文加密，将密文返回，保障数据安全。
        Summary: 发起信封密钥上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_dataflow_pubkey_ex_async(request, headers, runtime)

    def upload_dataflow_pubkey_ex(
        self,
        request: twc_models.UploadDataflowPubkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UploadDataflowPubkeyResponse:
        """
        Description: 存证的使用方，在获得密钥上传（PUBKEY_UPLOAD）授权后，使用本接口上传信封密钥，后续查询存证时，会使用此信封密钥对存证原文加密，将密文返回，保障数据安全。
        Summary: 发起信封密钥上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.UploadDataflowPubkeyResponse(),
            self.do_request('1.0', 'twc.notary.dataflow.pubkey.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_dataflow_pubkey_ex_async(
        self,
        request: twc_models.UploadDataflowPubkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.UploadDataflowPubkeyResponse:
        """
        Description: 存证的使用方，在获得密钥上传（PUBKEY_UPLOAD）授权后，使用本接口上传信封密钥，后续查询存证时，会使用此信封密钥对存证原文加密，将密文返回，保障数据安全。
        Summary: 发起信封密钥上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.UploadDataflowPubkeyResponse(),
            await self.do_request_async('1.0', 'twc.notary.dataflow.pubkey.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_dataflow_account(
        self,
        request: twc_models.CreateDataflowAccountRequest,
    ) -> twc_models.CreateDataflowAccountResponse:
        """
        Description: 数据流转存证创建链上账户
        Summary: 数据流转存证创建链上账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_dataflow_account_ex(request, headers, runtime)

    async def create_dataflow_account_async(
        self,
        request: twc_models.CreateDataflowAccountRequest,
    ) -> twc_models.CreateDataflowAccountResponse:
        """
        Description: 数据流转存证创建链上账户
        Summary: 数据流转存证创建链上账户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_dataflow_account_ex_async(request, headers, runtime)

    def create_dataflow_account_ex(
        self,
        request: twc_models.CreateDataflowAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateDataflowAccountResponse:
        """
        Description: 数据流转存证创建链上账户
        Summary: 数据流转存证创建链上账户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateDataflowAccountResponse(),
            self.do_request('1.0', 'twc.notary.dataflow.account.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_dataflow_account_ex_async(
        self,
        request: twc_models.CreateDataflowAccountRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateDataflowAccountResponse:
        """
        Description: 数据流转存证创建链上账户
        Summary: 数据流转存证创建链上账户
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateDataflowAccountResponse(),
            await self.do_request_async('1.0', 'twc.notary.dataflow.account.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_flow_instance(
        self,
        request: twc_models.CreateFlowInstanceRequest,
    ) -> twc_models.CreateFlowInstanceResponse:
        """
        Description: 创建存证流程实例
        Summary: 创建存证流程实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_flow_instance_ex(request, headers, runtime)

    async def create_flow_instance_async(
        self,
        request: twc_models.CreateFlowInstanceRequest,
    ) -> twc_models.CreateFlowInstanceResponse:
        """
        Description: 创建存证流程实例
        Summary: 创建存证流程实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_flow_instance_ex_async(request, headers, runtime)

    def create_flow_instance_ex(
        self,
        request: twc_models.CreateFlowInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateFlowInstanceResponse:
        """
        Description: 创建存证流程实例
        Summary: 创建存证流程实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateFlowInstanceResponse(),
            self.do_request('1.0', 'twc.notary.flow.instance.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_flow_instance_ex_async(
        self,
        request: twc_models.CreateFlowInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateFlowInstanceResponse:
        """
        Description: 创建存证流程实例
        Summary: 创建存证流程实例
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateFlowInstanceResponse(),
            await self.do_request_async('1.0', 'twc.notary.flow.instance.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def finish_flow_instance(
        self,
        request: twc_models.FinishFlowInstanceRequest,
    ) -> twc_models.FinishFlowInstanceResponse:
        """
        Description: 存证流程实例完结
        Summary: 存证流程实例完结
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.finish_flow_instance_ex(request, headers, runtime)

    async def finish_flow_instance_async(
        self,
        request: twc_models.FinishFlowInstanceRequest,
    ) -> twc_models.FinishFlowInstanceResponse:
        """
        Description: 存证流程实例完结
        Summary: 存证流程实例完结
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.finish_flow_instance_ex_async(request, headers, runtime)

    def finish_flow_instance_ex(
        self,
        request: twc_models.FinishFlowInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.FinishFlowInstanceResponse:
        """
        Description: 存证流程实例完结
        Summary: 存证流程实例完结
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.FinishFlowInstanceResponse(),
            self.do_request('1.0', 'twc.notary.flow.instance.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def finish_flow_instance_ex_async(
        self,
        request: twc_models.FinishFlowInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.FinishFlowInstanceResponse:
        """
        Description: 存证流程实例完结
        Summary: 存证流程实例完结
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.FinishFlowInstanceResponse(),
            await self.do_request_async('1.0', 'twc.notary.flow.instance.finish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def init_flow_phase(
        self,
        request: twc_models.InitFlowPhaseRequest,
    ) -> twc_models.InitFlowPhaseResponse:
        """
        Description: 创建阶段存证
        Summary: 创建阶段存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.init_flow_phase_ex(request, headers, runtime)

    async def init_flow_phase_async(
        self,
        request: twc_models.InitFlowPhaseRequest,
    ) -> twc_models.InitFlowPhaseResponse:
        """
        Description: 创建阶段存证
        Summary: 创建阶段存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.init_flow_phase_ex_async(request, headers, runtime)

    def init_flow_phase_ex(
        self,
        request: twc_models.InitFlowPhaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.InitFlowPhaseResponse:
        """
        Description: 创建阶段存证
        Summary: 创建阶段存证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.InitFlowPhaseResponse(),
            self.do_request('1.0', 'twc.notary.flow.phase.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def init_flow_phase_ex_async(
        self,
        request: twc_models.InitFlowPhaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.InitFlowPhaseResponse:
        """
        Description: 创建阶段存证
        Summary: 创建阶段存证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.InitFlowPhaseResponse(),
            await self.do_request_async('1.0', 'twc.notary.flow.phase.init', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_flow_phase(
        self,
        request: twc_models.QueryFlowPhaseRequest,
    ) -> twc_models.QueryFlowPhaseResponse:
        """
        Description: 查询阶段存证结果
        Summary: 查询阶段存证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_flow_phase_ex(request, headers, runtime)

    async def query_flow_phase_async(
        self,
        request: twc_models.QueryFlowPhaseRequest,
    ) -> twc_models.QueryFlowPhaseResponse:
        """
        Description: 查询阶段存证结果
        Summary: 查询阶段存证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_flow_phase_ex_async(request, headers, runtime)

    def query_flow_phase_ex(
        self,
        request: twc_models.QueryFlowPhaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryFlowPhaseResponse:
        """
        Description: 查询阶段存证结果
        Summary: 查询阶段存证结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryFlowPhaseResponse(),
            self.do_request('1.0', 'twc.notary.flow.phase.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_flow_phase_ex_async(
        self,
        request: twc_models.QueryFlowPhaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryFlowPhaseResponse:
        """
        Description: 查询阶段存证结果
        Summary: 查询阶段存证结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryFlowPhaseResponse(),
            await self.do_request_async('1.0', 'twc.notary.flow.phase.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_flow_phase(
        self,
        request: twc_models.DetailFlowPhaseRequest,
    ) -> twc_models.DetailFlowPhaseResponse:
        """
        Description: 阶段存证数据详情
        Summary: 阶段存证数据详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_flow_phase_ex(request, headers, runtime)

    async def detail_flow_phase_async(
        self,
        request: twc_models.DetailFlowPhaseRequest,
    ) -> twc_models.DetailFlowPhaseResponse:
        """
        Description: 阶段存证数据详情
        Summary: 阶段存证数据详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_flow_phase_ex_async(request, headers, runtime)

    def detail_flow_phase_ex(
        self,
        request: twc_models.DetailFlowPhaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DetailFlowPhaseResponse:
        """
        Description: 阶段存证数据详情
        Summary: 阶段存证数据详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.DetailFlowPhaseResponse(),
            self.do_request('1.0', 'twc.notary.flow.phase.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_flow_phase_ex_async(
        self,
        request: twc_models.DetailFlowPhaseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DetailFlowPhaseResponse:
        """
        Description: 阶段存证数据详情
        Summary: 阶段存证数据详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.DetailFlowPhaseResponse(),
            await self.do_request_async('1.0', 'twc.notary.flow.phase.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_flow_onestepnotary(
        self,
        request: twc_models.CreateFlowOnestepnotaryRequest,
    ) -> twc_models.CreateFlowOnestepnotaryResponse:
        """
        Description: 一键创建全流程存证实例和阶段存证
        Summary: 一键创建全流程存证实例和阶段存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_flow_onestepnotary_ex(request, headers, runtime)

    async def create_flow_onestepnotary_async(
        self,
        request: twc_models.CreateFlowOnestepnotaryRequest,
    ) -> twc_models.CreateFlowOnestepnotaryResponse:
        """
        Description: 一键创建全流程存证实例和阶段存证
        Summary: 一键创建全流程存证实例和阶段存证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_flow_onestepnotary_ex_async(request, headers, runtime)

    def create_flow_onestepnotary_ex(
        self,
        request: twc_models.CreateFlowOnestepnotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateFlowOnestepnotaryResponse:
        """
        Description: 一键创建全流程存证实例和阶段存证
        Summary: 一键创建全流程存证实例和阶段存证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateFlowOnestepnotaryResponse(),
            self.do_request('1.0', 'twc.notary.flow.onestepnotary.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_flow_onestepnotary_ex_async(
        self,
        request: twc_models.CreateFlowOnestepnotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateFlowOnestepnotaryResponse:
        """
        Description: 一键创建全流程存证实例和阶段存证
        Summary: 一键创建全流程存证实例和阶段存证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateFlowOnestepnotaryResponse(),
            await self.do_request_async('1.0', 'twc.notary.flow.onestepnotary.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_flow_onestepnotary(
        self,
        request: twc_models.QueryFlowOnestepnotaryRequest,
    ) -> twc_models.QueryFlowOnestepnotaryResponse:
        """
        Description: 查询一键创建全流程存证进度状态
        Summary: 查询一键创建全流程存证进度状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_flow_onestepnotary_ex(request, headers, runtime)

    async def query_flow_onestepnotary_async(
        self,
        request: twc_models.QueryFlowOnestepnotaryRequest,
    ) -> twc_models.QueryFlowOnestepnotaryResponse:
        """
        Description: 查询一键创建全流程存证进度状态
        Summary: 查询一键创建全流程存证进度状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_flow_onestepnotary_ex_async(request, headers, runtime)

    def query_flow_onestepnotary_ex(
        self,
        request: twc_models.QueryFlowOnestepnotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryFlowOnestepnotaryResponse:
        """
        Description: 查询一键创建全流程存证进度状态
        Summary: 查询一键创建全流程存证进度状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryFlowOnestepnotaryResponse(),
            self.do_request('1.0', 'twc.notary.flow.onestepnotary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_flow_onestepnotary_ex_async(
        self,
        request: twc_models.QueryFlowOnestepnotaryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryFlowOnestepnotaryResponse:
        """
        Description: 查询一键创建全流程存证进度状态
        Summary: 查询一键创建全流程存证进度状态
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryFlowOnestepnotaryResponse(),
            await self.do_request_async('1.0', 'twc.notary.flow.onestepnotary.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_flow_certificate(
        self,
        request: twc_models.ApplyFlowCertificateRequest,
    ) -> twc_models.ApplyFlowCertificateResponse:
        """
        Description: 存证全流程证明申请
        Summary: 存证全流程证明申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_flow_certificate_ex(request, headers, runtime)

    async def apply_flow_certificate_async(
        self,
        request: twc_models.ApplyFlowCertificateRequest,
    ) -> twc_models.ApplyFlowCertificateResponse:
        """
        Description: 存证全流程证明申请
        Summary: 存证全流程证明申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_flow_certificate_ex_async(request, headers, runtime)

    def apply_flow_certificate_ex(
        self,
        request: twc_models.ApplyFlowCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyFlowCertificateResponse:
        """
        Description: 存证全流程证明申请
        Summary: 存证全流程证明申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ApplyFlowCertificateResponse(),
            self.do_request('1.0', 'twc.notary.flow.certificate.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_flow_certificate_ex_async(
        self,
        request: twc_models.ApplyFlowCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyFlowCertificateResponse:
        """
        Description: 存证全流程证明申请
        Summary: 存证全流程证明申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ApplyFlowCertificateResponse(),
            await self.do_request_async('1.0', 'twc.notary.flow.certificate.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_flow_certificate(
        self,
        request: twc_models.QueryFlowCertificateRequest,
    ) -> twc_models.QueryFlowCertificateResponse:
        """
        Description: 存证全流程证明出证进度查询
        Summary: 存证全流程证明出证进度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_flow_certificate_ex(request, headers, runtime)

    async def query_flow_certificate_async(
        self,
        request: twc_models.QueryFlowCertificateRequest,
    ) -> twc_models.QueryFlowCertificateResponse:
        """
        Description: 存证全流程证明出证进度查询
        Summary: 存证全流程证明出证进度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_flow_certificate_ex_async(request, headers, runtime)

    def query_flow_certificate_ex(
        self,
        request: twc_models.QueryFlowCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryFlowCertificateResponse:
        """
        Description: 存证全流程证明出证进度查询
        Summary: 存证全流程证明出证进度查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryFlowCertificateResponse(),
            self.do_request('1.0', 'twc.notary.flow.certificate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_flow_certificate_ex_async(
        self,
        request: twc_models.QueryFlowCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryFlowCertificateResponse:
        """
        Description: 存证全流程证明出证进度查询
        Summary: 存证全流程证明出证进度查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryFlowCertificateResponse(),
            await self.do_request_async('1.0', 'twc.notary.flow.certificate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_stub_certificate(
        self,
        request: twc_models.ApplyStubCertificateRequest,
    ) -> twc_models.ApplyStubCertificateResponse:
        """
        Description: 数字票根全流程出证申请
        Summary: 数字票根全流程出证申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_stub_certificate_ex(request, headers, runtime)

    async def apply_stub_certificate_async(
        self,
        request: twc_models.ApplyStubCertificateRequest,
    ) -> twc_models.ApplyStubCertificateResponse:
        """
        Description: 数字票根全流程出证申请
        Summary: 数字票根全流程出证申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_stub_certificate_ex_async(request, headers, runtime)

    def apply_stub_certificate_ex(
        self,
        request: twc_models.ApplyStubCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyStubCertificateResponse:
        """
        Description: 数字票根全流程出证申请
        Summary: 数字票根全流程出证申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ApplyStubCertificateResponse(),
            self.do_request('1.0', 'twc.notary.stub.certificate.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_stub_certificate_ex_async(
        self,
        request: twc_models.ApplyStubCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyStubCertificateResponse:
        """
        Description: 数字票根全流程出证申请
        Summary: 数字票根全流程出证申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ApplyStubCertificateResponse(),
            await self.do_request_async('1.0', 'twc.notary.stub.certificate.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_stub_certificate(
        self,
        request: twc_models.QueryStubCertificateRequest,
    ) -> twc_models.QueryStubCertificateResponse:
        """
        Description: 数字票根全流程证明出证进度查询
        Summary: 数字票根全流程证明出证进度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_stub_certificate_ex(request, headers, runtime)

    async def query_stub_certificate_async(
        self,
        request: twc_models.QueryStubCertificateRequest,
    ) -> twc_models.QueryStubCertificateResponse:
        """
        Description: 数字票根全流程证明出证进度查询
        Summary: 数字票根全流程证明出证进度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_stub_certificate_ex_async(request, headers, runtime)

    def query_stub_certificate_ex(
        self,
        request: twc_models.QueryStubCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryStubCertificateResponse:
        """
        Description: 数字票根全流程证明出证进度查询
        Summary: 数字票根全流程证明出证进度查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryStubCertificateResponse(),
            self.do_request('1.0', 'twc.notary.stub.certificate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_stub_certificate_ex_async(
        self,
        request: twc_models.QueryStubCertificateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryStubCertificateResponse:
        """
        Description: 数字票根全流程证明出证进度查询
        Summary: 数字票根全流程证明出证进度查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryStubCertificateResponse(),
            await self.do_request_async('1.0', 'twc.notary.stub.certificate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_stub(
        self,
        request: twc_models.QueryStubRequest,
    ) -> twc_models.QueryStubResponse:
        """
        Description: 数字票根全流程存证进度查询
        Summary: 数字票根全流程存证进度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_stub_ex(request, headers, runtime)

    async def query_stub_async(
        self,
        request: twc_models.QueryStubRequest,
    ) -> twc_models.QueryStubResponse:
        """
        Description: 数字票根全流程存证进度查询
        Summary: 数字票根全流程存证进度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_stub_ex_async(request, headers, runtime)

    def query_stub_ex(
        self,
        request: twc_models.QueryStubRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryStubResponse:
        """
        Description: 数字票根全流程存证进度查询
        Summary: 数字票根全流程存证进度查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryStubResponse(),
            self.do_request('1.0', 'twc.notary.stub.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_stub_ex_async(
        self,
        request: twc_models.QueryStubRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryStubResponse:
        """
        Description: 数字票根全流程存证进度查询
        Summary: 数字票根全流程存证进度查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryStubResponse(),
            await self.do_request_async('1.0', 'twc.notary.stub.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_stub(
        self,
        request: twc_models.CreateStubRequest,
    ) -> twc_models.CreateStubResponse:
        """
        Description: 数字票根全流程存证创建
        Summary: 数字票根全流程存证创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_stub_ex(request, headers, runtime)

    async def create_stub_async(
        self,
        request: twc_models.CreateStubRequest,
    ) -> twc_models.CreateStubResponse:
        """
        Description: 数字票根全流程存证创建
        Summary: 数字票根全流程存证创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_stub_ex_async(request, headers, runtime)

    def create_stub_ex(
        self,
        request: twc_models.CreateStubRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateStubResponse:
        """
        Description: 数字票根全流程存证创建
        Summary: 数字票根全流程存证创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateStubResponse(),
            self.do_request('1.0', 'twc.notary.stub.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_stub_ex_async(
        self,
        request: twc_models.CreateStubRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateStubResponse:
        """
        Description: 数字票根全流程存证创建
        Summary: 数字票根全流程存证创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateStubResponse(),
            await self.do_request_async('1.0', 'twc.notary.stub.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exist_stub(
        self,
        request: twc_models.ExistStubRequest,
    ) -> twc_models.ExistStubResponse:
        """
        Description: 查询数字票根是否存在
        Summary: 查询数字票根是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exist_stub_ex(request, headers, runtime)

    async def exist_stub_async(
        self,
        request: twc_models.ExistStubRequest,
    ) -> twc_models.ExistStubResponse:
        """
        Description: 查询数字票根是否存在
        Summary: 查询数字票根是否存在
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exist_stub_ex_async(request, headers, runtime)

    def exist_stub_ex(
        self,
        request: twc_models.ExistStubRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ExistStubResponse:
        """
        Description: 查询数字票根是否存在
        Summary: 查询数字票根是否存在
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ExistStubResponse(),
            self.do_request('1.0', 'twc.notary.stub.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exist_stub_ex_async(
        self,
        request: twc_models.ExistStubRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ExistStubResponse:
        """
        Description: 查询数字票根是否存在
        Summary: 查询数字票根是否存在
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ExistStubResponse(),
            await self.do_request_async('1.0', 'twc.notary.stub.exist', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_stub_clearing(
        self,
        request: twc_models.CreateStubClearingRequest,
    ) -> twc_models.CreateStubClearingResponse:
        """
        Description: 数字票根-清分接口
        Summary: 数字票根-清分接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_stub_clearing_ex(request, headers, runtime)

    async def create_stub_clearing_async(
        self,
        request: twc_models.CreateStubClearingRequest,
    ) -> twc_models.CreateStubClearingResponse:
        """
        Description: 数字票根-清分接口
        Summary: 数字票根-清分接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_stub_clearing_ex_async(request, headers, runtime)

    def create_stub_clearing_ex(
        self,
        request: twc_models.CreateStubClearingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateStubClearingResponse:
        """
        Description: 数字票根-清分接口
        Summary: 数字票根-清分接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateStubClearingResponse(),
            self.do_request('1.0', 'twc.notary.stub.clearing.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_stub_clearing_ex_async(
        self,
        request: twc_models.CreateStubClearingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CreateStubClearingResponse:
        """
        Description: 数字票根-清分接口
        Summary: 数字票根-清分接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CreateStubClearingResponse(),
            await self.do_request_async('1.0', 'twc.notary.stub.clearing.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_flow_evidence(
        self,
        request: twc_models.ApplyFlowEvidenceRequest,
    ) -> twc_models.ApplyFlowEvidenceResponse:
        """
        Description: 申请全流程证据包，包括链上证据包和链下证据包
        Summary: 申请全流程证据包
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_flow_evidence_ex(request, headers, runtime)

    async def apply_flow_evidence_async(
        self,
        request: twc_models.ApplyFlowEvidenceRequest,
    ) -> twc_models.ApplyFlowEvidenceResponse:
        """
        Description: 申请全流程证据包，包括链上证据包和链下证据包
        Summary: 申请全流程证据包
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_flow_evidence_ex_async(request, headers, runtime)

    def apply_flow_evidence_ex(
        self,
        request: twc_models.ApplyFlowEvidenceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyFlowEvidenceResponse:
        """
        Description: 申请全流程证据包，包括链上证据包和链下证据包
        Summary: 申请全流程证据包
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ApplyFlowEvidenceResponse(),
            self.do_request('1.0', 'twc.notary.flow.evidence.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_flow_evidence_ex_async(
        self,
        request: twc_models.ApplyFlowEvidenceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyFlowEvidenceResponse:
        """
        Description: 申请全流程证据包，包括链上证据包和链下证据包
        Summary: 申请全流程证据包
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ApplyFlowEvidenceResponse(),
            await self.do_request_async('1.0', 'twc.notary.flow.evidence.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_flow_evidence(
        self,
        request: twc_models.QueryFlowEvidenceRequest,
    ) -> twc_models.QueryFlowEvidenceResponse:
        """
        Description: 全流程证据包生成进度查询
        Summary: 全流程证据包生成进度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_flow_evidence_ex(request, headers, runtime)

    async def query_flow_evidence_async(
        self,
        request: twc_models.QueryFlowEvidenceRequest,
    ) -> twc_models.QueryFlowEvidenceResponse:
        """
        Description: 全流程证据包生成进度查询
        Summary: 全流程证据包生成进度查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_flow_evidence_ex_async(request, headers, runtime)

    def query_flow_evidence_ex(
        self,
        request: twc_models.QueryFlowEvidenceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryFlowEvidenceResponse:
        """
        Description: 全流程证据包生成进度查询
        Summary: 全流程证据包生成进度查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryFlowEvidenceResponse(),
            self.do_request('1.0', 'twc.notary.flow.evidence.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_flow_evidence_ex_async(
        self,
        request: twc_models.QueryFlowEvidenceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryFlowEvidenceResponse:
        """
        Description: 全流程证据包生成进度查询
        Summary: 全流程证据包生成进度查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryFlowEvidenceResponse(),
            await self.do_request_async('1.0', 'twc.notary.flow.evidence.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_flow_auth(
        self,
        request: twc_models.ApplyFlowAuthRequest,
    ) -> twc_models.ApplyFlowAuthResponse:
        """
        Description: 全流程证据授权码申请
        Summary: 全流程证据授权码申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_flow_auth_ex(request, headers, runtime)

    async def apply_flow_auth_async(
        self,
        request: twc_models.ApplyFlowAuthRequest,
    ) -> twc_models.ApplyFlowAuthResponse:
        """
        Description: 全流程证据授权码申请
        Summary: 全流程证据授权码申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_flow_auth_ex_async(request, headers, runtime)

    def apply_flow_auth_ex(
        self,
        request: twc_models.ApplyFlowAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyFlowAuthResponse:
        """
        Description: 全流程证据授权码申请
        Summary: 全流程证据授权码申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ApplyFlowAuthResponse(),
            self.do_request('1.0', 'twc.notary.flow.auth.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_flow_auth_ex_async(
        self,
        request: twc_models.ApplyFlowAuthRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.ApplyFlowAuthResponse:
        """
        Description: 全流程证据授权码申请
        Summary: 全流程证据授权码申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.ApplyFlowAuthResponse(),
            await self.do_request_async('1.0', 'twc.notary.flow.auth.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_flow_instance(
        self,
        request: twc_models.DetailFlowInstanceRequest,
    ) -> twc_models.DetailFlowInstanceResponse:
        """
        Description: 全流程详情查询
        Summary: 全流程详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_flow_instance_ex(request, headers, runtime)

    async def detail_flow_instance_async(
        self,
        request: twc_models.DetailFlowInstanceRequest,
    ) -> twc_models.DetailFlowInstanceResponse:
        """
        Description: 全流程详情查询
        Summary: 全流程详情查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_flow_instance_ex_async(request, headers, runtime)

    def detail_flow_instance_ex(
        self,
        request: twc_models.DetailFlowInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DetailFlowInstanceResponse:
        """
        Description: 全流程详情查询
        Summary: 全流程详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.DetailFlowInstanceResponse(),
            self.do_request('1.0', 'twc.notary.flow.instance.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_flow_instance_ex_async(
        self,
        request: twc_models.DetailFlowInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.DetailFlowInstanceResponse:
        """
        Description: 全流程详情查询
        Summary: 全流程详情查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.DetailFlowInstanceResponse(),
            await self.do_request_async('1.0', 'twc.notary.flow.instance.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def check_contract(
        self,
        request: twc_models.CheckContractRequest,
    ) -> twc_models.CheckContractResponse:
        """
        Description: 合约校验接口
        Summary: 合约校验接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.check_contract_ex(request, headers, runtime)

    async def check_contract_async(
        self,
        request: twc_models.CheckContractRequest,
    ) -> twc_models.CheckContractResponse:
        """
        Description: 合约校验接口
        Summary: 合约校验接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.check_contract_ex_async(request, headers, runtime)

    def check_contract_ex(
        self,
        request: twc_models.CheckContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckContractResponse:
        """
        Description: 合约校验接口
        Summary: 合约校验接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CheckContractResponse(),
            self.do_request('1.0', 'twc.notary.contract.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def check_contract_ex_async(
        self,
        request: twc_models.CheckContractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.CheckContractResponse:
        """
        Description: 合约校验接口
        Summary: 合约校验接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.CheckContractResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.check', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_contract_status(
        self,
        request: twc_models.QueryContractStatusRequest,
    ) -> twc_models.QueryContractStatusResponse:
        """
        Description: 查询合约核验结果
        Summary: 查询合约核验结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_contract_status_ex(request, headers, runtime)

    async def query_contract_status_async(
        self,
        request: twc_models.QueryContractStatusRequest,
    ) -> twc_models.QueryContractStatusResponse:
        """
        Description: 查询合约核验结果
        Summary: 查询合约核验结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_contract_status_ex_async(request, headers, runtime)

    def query_contract_status_ex(
        self,
        request: twc_models.QueryContractStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractStatusResponse:
        """
        Description: 查询合约核验结果
        Summary: 查询合约核验结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryContractStatusResponse(),
            self.do_request('1.0', 'twc.notary.contract.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_contract_status_ex_async(
        self,
        request: twc_models.QueryContractStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> twc_models.QueryContractStatusResponse:
        """
        Description: 查询合约核验结果
        Summary: 查询合约核验结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            twc_models.QueryContractStatusResponse(),
            await self.do_request_async('1.0', 'twc.notary.contract.status.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
