# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_ato import models as ato_models
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
        config: ato_models.Config,
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
            # 订单还款计划
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
                    'sdk_version': '1.7.13',
                    '_prod_code': 'ATO',
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
            # 订单还款计划
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
                    'sdk_version': '1.7.13',
                    '_prod_code': 'ATO',
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

    def sync_fund_splitting(
        self,
        request: ato_models.SyncFundSplittingRequest,
    ) -> ato_models.SyncFundSplittingResponse:
        """
        Description: 分账流水同步
        Summary: 【仅测试环境生效】分账流水同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_fund_splitting_ex(request, headers, runtime)

    async def sync_fund_splitting_async(
        self,
        request: ato_models.SyncFundSplittingRequest,
    ) -> ato_models.SyncFundSplittingResponse:
        """
        Description: 分账流水同步
        Summary: 【仅测试环境生效】分账流水同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_fund_splitting_ex_async(request, headers, runtime)

    def sync_fund_splitting_ex(
        self,
        request: ato_models.SyncFundSplittingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundSplittingResponse:
        """
        Description: 分账流水同步
        Summary: 【仅测试环境生效】分账流水同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundSplittingResponse(),
            self.do_request('1.0', 'antchain.ato.fund.splitting.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_fund_splitting_ex_async(
        self,
        request: ato_models.SyncFundSplittingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundSplittingResponse:
        """
        Description: 分账流水同步
        Summary: 【仅测试环境生效】分账流水同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundSplittingResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.splitting.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_fund_orderfinancial(
        self,
        request: ato_models.SyncFundOrderfinancialRequest,
    ) -> ato_models.SyncFundOrderfinancialResponse:
        """
        Description: 提供给融资资金方，用以订单融资结果同步
        Summary: 【废弃】订单融资结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_fund_orderfinancial_ex(request, headers, runtime)

    async def sync_fund_orderfinancial_async(
        self,
        request: ato_models.SyncFundOrderfinancialRequest,
    ) -> ato_models.SyncFundOrderfinancialResponse:
        """
        Description: 提供给融资资金方，用以订单融资结果同步
        Summary: 【废弃】订单融资结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_fund_orderfinancial_ex_async(request, headers, runtime)

    def sync_fund_orderfinancial_ex(
        self,
        request: ato_models.SyncFundOrderfinancialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundOrderfinancialResponse:
        """
        Description: 提供给融资资金方，用以订单融资结果同步
        Summary: 【废弃】订单融资结果同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundOrderfinancialResponse(),
            self.do_request('1.0', 'antchain.ato.fund.orderfinancial.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_fund_orderfinancial_ex_async(
        self,
        request: ato_models.SyncFundOrderfinancialRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundOrderfinancialResponse:
        """
        Description: 提供给融资资金方，用以订单融资结果同步
        Summary: 【废弃】订单融资结果同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundOrderfinancialResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.orderfinancial.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_fund_withholdingcontract(
        self,
        request: ato_models.SyncFundWithholdingcontractRequest,
    ) -> ato_models.SyncFundWithholdingcontractResponse:
        """
        Description: 同步租赁订单的代扣协议
        Summary: 【仅测试环境生效】同步租赁订单的代扣协议
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_fund_withholdingcontract_ex(request, headers, runtime)

    async def sync_fund_withholdingcontract_async(
        self,
        request: ato_models.SyncFundWithholdingcontractRequest,
    ) -> ato_models.SyncFundWithholdingcontractResponse:
        """
        Description: 同步租赁订单的代扣协议
        Summary: 【仅测试环境生效】同步租赁订单的代扣协议
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_fund_withholdingcontract_ex_async(request, headers, runtime)

    def sync_fund_withholdingcontract_ex(
        self,
        request: ato_models.SyncFundWithholdingcontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundWithholdingcontractResponse:
        """
        Description: 同步租赁订单的代扣协议
        Summary: 【仅测试环境生效】同步租赁订单的代扣协议
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundWithholdingcontractResponse(),
            self.do_request('1.0', 'antchain.ato.fund.withholdingcontract.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_fund_withholdingcontract_ex_async(
        self,
        request: ato_models.SyncFundWithholdingcontractRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundWithholdingcontractResponse:
        """
        Description: 同步租赁订单的代扣协议
        Summary: 【仅测试环境生效】同步租赁订单的代扣协议
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundWithholdingcontractResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.withholdingcontract.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_fund_orderfulfillment(
        self,
        request: ato_models.SyncFundOrderfulfillmentRequest,
    ) -> ato_models.SyncFundOrderfulfillmentResponse:
        """
        Description: 资方回传一条订单还款履约信息
        Summary: 【仅测试环境生效】同步订单还款履约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_fund_orderfulfillment_ex(request, headers, runtime)

    async def sync_fund_orderfulfillment_async(
        self,
        request: ato_models.SyncFundOrderfulfillmentRequest,
    ) -> ato_models.SyncFundOrderfulfillmentResponse:
        """
        Description: 资方回传一条订单还款履约信息
        Summary: 【仅测试环境生效】同步订单还款履约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_fund_orderfulfillment_ex_async(request, headers, runtime)

    def sync_fund_orderfulfillment_ex(
        self,
        request: ato_models.SyncFundOrderfulfillmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundOrderfulfillmentResponse:
        """
        Description: 资方回传一条订单还款履约信息
        Summary: 【仅测试环境生效】同步订单还款履约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundOrderfulfillmentResponse(),
            self.do_request('1.0', 'antchain.ato.fund.orderfulfillment.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_fund_orderfulfillment_ex_async(
        self,
        request: ato_models.SyncFundOrderfulfillmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundOrderfulfillmentResponse:
        """
        Description: 资方回传一条订单还款履约信息
        Summary: 【仅测试环境生效】同步订单还款履约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundOrderfulfillmentResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.orderfulfillment.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_fund_orderfulfillment(
        self,
        request: ato_models.GetFundOrderfulfillmentRequest,
    ) -> ato_models.GetFundOrderfulfillmentResponse:
        """
        Description: 获取订单的履约信息
        Summary: 【仅测试环境生效】获取订单的履约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_fund_orderfulfillment_ex(request, headers, runtime)

    async def get_fund_orderfulfillment_async(
        self,
        request: ato_models.GetFundOrderfulfillmentRequest,
    ) -> ato_models.GetFundOrderfulfillmentResponse:
        """
        Description: 获取订单的履约信息
        Summary: 【仅测试环境生效】获取订单的履约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_fund_orderfulfillment_ex_async(request, headers, runtime)

    def get_fund_orderfulfillment_ex(
        self,
        request: ato_models.GetFundOrderfulfillmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundOrderfulfillmentResponse:
        """
        Description: 获取订单的履约信息
        Summary: 【仅测试环境生效】获取订单的履约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundOrderfulfillmentResponse(),
            self.do_request('1.0', 'antchain.ato.fund.orderfulfillment.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_fund_orderfulfillment_ex_async(
        self,
        request: ato_models.GetFundOrderfulfillmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundOrderfulfillmentResponse:
        """
        Description: 获取订单的履约信息
        Summary: 【仅测试环境生效】获取订单的履约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundOrderfulfillmentResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.orderfulfillment.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_fund_flow(
        self,
        request: ato_models.UploadFundFlowRequest,
    ) -> ato_models.UploadFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传
        Summary: 资方合同文件上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_fund_flow_ex(request, headers, runtime)

    async def upload_fund_flow_async(
        self,
        request: ato_models.UploadFundFlowRequest,
    ) -> ato_models.UploadFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传
        Summary: 资方合同文件上传接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_fund_flow_ex_async(request, headers, runtime)

    def upload_fund_flow_ex(
        self,
        request: ato_models.UploadFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传
        Summary: 资方合同文件上传接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ato_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.ato.fund.flow.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_fund_flow_response = ato_models.UploadFundFlowResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_fund_flow_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadFundFlowResponse(),
            self.do_request('1.0', 'antchain.ato.fund.flow.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_fund_flow_ex_async(
        self,
        request: ato_models.UploadFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传
        Summary: 资方合同文件上传接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ato_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.ato.fund.flow.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_fund_flow_response = ato_models.UploadFundFlowResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_fund_flow_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadFundFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.flow.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_fund_flow(
        self,
        request: ato_models.GetFundFlowRequest,
    ) -> ato_models.GetFundFlowResponse:
        """
        Description: 获取商户签署后的合同文件，用于资方签署落章
        Summary: 资方合同文件获取接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_fund_flow_ex(request, headers, runtime)

    async def get_fund_flow_async(
        self,
        request: ato_models.GetFundFlowRequest,
    ) -> ato_models.GetFundFlowResponse:
        """
        Description: 获取商户签署后的合同文件，用于资方签署落章
        Summary: 资方合同文件获取接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_fund_flow_ex_async(request, headers, runtime)

    def get_fund_flow_ex(
        self,
        request: ato_models.GetFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundFlowResponse:
        """
        Description: 获取商户签署后的合同文件，用于资方签署落章
        Summary: 资方合同文件获取接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundFlowResponse(),
            self.do_request('1.0', 'antchain.ato.fund.flow.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_fund_flow_ex_async(
        self,
        request: ato_models.GetFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundFlowResponse:
        """
        Description: 获取商户签署后的合同文件，用于资方签署落章
        Summary: 资方合同文件获取接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.flow.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def refuse_fund_flow(
        self,
        request: ato_models.RefuseFundFlowRequest,
    ) -> ato_models.RefuseFundFlowResponse:
        """
        Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
        Summary: 资方合同签署状态通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.refuse_fund_flow_ex(request, headers, runtime)

    async def refuse_fund_flow_async(
        self,
        request: ato_models.RefuseFundFlowRequest,
    ) -> ato_models.RefuseFundFlowResponse:
        """
        Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
        Summary: 资方合同签署状态通知
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.refuse_fund_flow_ex_async(request, headers, runtime)

    def refuse_fund_flow_ex(
        self,
        request: ato_models.RefuseFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RefuseFundFlowResponse:
        """
        Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
        Summary: 资方合同签署状态通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RefuseFundFlowResponse(),
            self.do_request('1.0', 'antchain.ato.fund.flow.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def refuse_fund_flow_ex_async(
        self,
        request: ato_models.RefuseFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RefuseFundFlowResponse:
        """
        Description: 用户资方通知合同签署的状态，一般用于拒绝落章文件时，需要通知拒绝原因
        Summary: 资方合同签署状态通知
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RefuseFundFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.flow.refuse', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_fund_flow(
        self,
        request: ato_models.AuthFundFlowRequest,
    ) -> ato_models.AuthFundFlowResponse:
        """
        Description: 资方调用，授权通过e签宝进行落签
        Summary: 资方e签宝落签接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_fund_flow_ex(request, headers, runtime)

    async def auth_fund_flow_async(
        self,
        request: ato_models.AuthFundFlowRequest,
    ) -> ato_models.AuthFundFlowResponse:
        """
        Description: 资方调用，授权通过e签宝进行落签
        Summary: 资方e签宝落签接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_fund_flow_ex_async(request, headers, runtime)

    def auth_fund_flow_ex(
        self,
        request: ato_models.AuthFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AuthFundFlowResponse:
        """
        Description: 资方调用，授权通过e签宝进行落签
        Summary: 资方e签宝落签接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AuthFundFlowResponse(),
            self.do_request('1.0', 'antchain.ato.fund.flow.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_fund_flow_ex_async(
        self,
        request: ato_models.AuthFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AuthFundFlowResponse:
        """
        Description: 资方调用，授权通过e签宝进行落签
        Summary: 资方e签宝落签接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AuthFundFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.flow.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_fund_plan(
        self,
        request: ato_models.CancelFundPlanRequest,
    ) -> ato_models.CancelFundPlanResponse:
        """
        Description: 资方调用，取消商户履约计划
        Summary: 商户履约计划取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_fund_plan_ex(request, headers, runtime)

    async def cancel_fund_plan_async(
        self,
        request: ato_models.CancelFundPlanRequest,
    ) -> ato_models.CancelFundPlanResponse:
        """
        Description: 资方调用，取消商户履约计划
        Summary: 商户履约计划取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_fund_plan_ex_async(request, headers, runtime)

    def cancel_fund_plan_ex(
        self,
        request: ato_models.CancelFundPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CancelFundPlanResponse:
        """
        Description: 资方调用，取消商户履约计划
        Summary: 商户履约计划取消
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CancelFundPlanResponse(),
            self.do_request('1.0', 'antchain.ato.fund.plan.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_fund_plan_ex_async(
        self,
        request: ato_models.CancelFundPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CancelFundPlanResponse:
        """
        Description: 资方调用，取消商户履约计划
        Summary: 商户履约计划取消
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CancelFundPlanResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.plan.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_fund_notify(
        self,
        request: ato_models.CallbackFundNotifyRequest,
    ) -> ato_models.CallbackFundNotifyResponse:
        """
        Description: 通知回调
        Summary: 通知回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_fund_notify_ex(request, headers, runtime)

    async def callback_fund_notify_async(
        self,
        request: ato_models.CallbackFundNotifyRequest,
    ) -> ato_models.CallbackFundNotifyResponse:
        """
        Description: 通知回调
        Summary: 通知回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_fund_notify_ex_async(request, headers, runtime)

    def callback_fund_notify_ex(
        self,
        request: ato_models.CallbackFundNotifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CallbackFundNotifyResponse:
        """
        Description: 通知回调
        Summary: 通知回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CallbackFundNotifyResponse(),
            self.do_request('1.0', 'antchain.ato.fund.notify.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_fund_notify_ex_async(
        self,
        request: ato_models.CallbackFundNotifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CallbackFundNotifyResponse:
        """
        Description: 通知回调
        Summary: 通知回调
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CallbackFundNotifyResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.notify.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_fund_merchantpromise(
        self,
        request: ato_models.SyncFundMerchantpromiseRequest,
    ) -> ato_models.SyncFundMerchantpromiseResponse:
        """
        Description: 商户还款承诺同步
        Summary: 商户还款承诺同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_fund_merchantpromise_ex(request, headers, runtime)

    async def sync_fund_merchantpromise_async(
        self,
        request: ato_models.SyncFundMerchantpromiseRequest,
    ) -> ato_models.SyncFundMerchantpromiseResponse:
        """
        Description: 商户还款承诺同步
        Summary: 商户还款承诺同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_fund_merchantpromise_ex_async(request, headers, runtime)

    def sync_fund_merchantpromise_ex(
        self,
        request: ato_models.SyncFundMerchantpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundMerchantpromiseResponse:
        """
        Description: 商户还款承诺同步
        Summary: 商户还款承诺同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundMerchantpromiseResponse(),
            self.do_request('1.0', 'antchain.ato.fund.merchantpromise.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_fund_merchantpromise_ex_async(
        self,
        request: ato_models.SyncFundMerchantpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundMerchantpromiseResponse:
        """
        Description: 商户还款承诺同步
        Summary: 商户还款承诺同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundMerchantpromiseResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.merchantpromise.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_fund_financeloanresults(
        self,
        request: ato_models.SyncFundFinanceloanresultsRequest,
    ) -> ato_models.SyncFundFinanceloanresultsResponse:
        """
        Description: 融资放款结果同步
        Summary: 融资放款结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_fund_financeloanresults_ex(request, headers, runtime)

    async def sync_fund_financeloanresults_async(
        self,
        request: ato_models.SyncFundFinanceloanresultsRequest,
    ) -> ato_models.SyncFundFinanceloanresultsResponse:
        """
        Description: 融资放款结果同步
        Summary: 融资放款结果同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_fund_financeloanresults_ex_async(request, headers, runtime)

    def sync_fund_financeloanresults_ex(
        self,
        request: ato_models.SyncFundFinanceloanresultsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundFinanceloanresultsResponse:
        """
        Description: 融资放款结果同步
        Summary: 融资放款结果同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundFinanceloanresultsResponse(),
            self.do_request('1.0', 'antchain.ato.fund.financeloanresults.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_fund_financeloanresults_ex_async(
        self,
        request: ato_models.SyncFundFinanceloanresultsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFundFinanceloanresultsResponse:
        """
        Description: 融资放款结果同步
        Summary: 融资放款结果同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFundFinanceloanresultsResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.financeloanresults.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_fund_userpromise(
        self,
        request: ato_models.GetFundUserpromiseRequest,
    ) -> ato_models.GetFundUserpromiseResponse:
        """
        Description: 查询用户承诺
        Summary: 查询用户承诺
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_fund_userpromise_ex(request, headers, runtime)

    async def get_fund_userpromise_async(
        self,
        request: ato_models.GetFundUserpromiseRequest,
    ) -> ato_models.GetFundUserpromiseResponse:
        """
        Description: 查询用户承诺
        Summary: 查询用户承诺
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_fund_userpromise_ex_async(request, headers, runtime)

    def get_fund_userpromise_ex(
        self,
        request: ato_models.GetFundUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundUserpromiseResponse:
        """
        Description: 查询用户承诺
        Summary: 查询用户承诺
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundUserpromiseResponse(),
            self.do_request('1.0', 'antchain.ato.fund.userpromise.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_fund_userpromise_ex_async(
        self,
        request: ato_models.GetFundUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundUserpromiseResponse:
        """
        Description: 查询用户承诺
        Summary: 查询用户承诺
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundUserpromiseResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.userpromise.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_fund_userperformance(
        self,
        request: ato_models.GetFundUserperformanceRequest,
    ) -> ato_models.GetFundUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+履约记录）
        Summary: 用户履约信息查询（履约承诺+履约记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_fund_userperformance_ex(request, headers, runtime)

    async def get_fund_userperformance_async(
        self,
        request: ato_models.GetFundUserperformanceRequest,
    ) -> ato_models.GetFundUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+履约记录）
        Summary: 用户履约信息查询（履约承诺+履约记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_fund_userperformance_ex_async(request, headers, runtime)

    def get_fund_userperformance_ex(
        self,
        request: ato_models.GetFundUserperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+履约记录）
        Summary: 用户履约信息查询（履约承诺+履约记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundUserperformanceResponse(),
            self.do_request('1.0', 'antchain.ato.fund.userperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_fund_userperformance_ex_async(
        self,
        request: ato_models.GetFundUserperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+履约记录）
        Summary: 用户履约信息查询（履约承诺+履约记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundUserperformanceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.userperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_fund_merchantperformance(
        self,
        request: ato_models.GetFundMerchantperformanceRequest,
    ) -> ato_models.GetFundMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_fund_merchantperformance_ex(request, headers, runtime)

    async def get_fund_merchantperformance_async(
        self,
        request: ato_models.GetFundMerchantperformanceRequest,
    ) -> ato_models.GetFundMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_fund_merchantperformance_ex_async(request, headers, runtime)

    def get_fund_merchantperformance_ex(
        self,
        request: ato_models.GetFundMerchantperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundMerchantperformanceResponse(),
            self.do_request('1.0', 'antchain.ato.fund.merchantperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_fund_merchantperformance_ex_async(
        self,
        request: ato_models.GetFundMerchantperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundMerchantperformanceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.merchantperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_fund_orderfullinfo(
        self,
        request: ato_models.GetFundOrderfullinfoRequest,
    ) -> ato_models.GetFundOrderfullinfoResponse:
        """
        Description: 资方查询订单详情
        Summary: 资方查询订单详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_fund_orderfullinfo_ex(request, headers, runtime)

    async def get_fund_orderfullinfo_async(
        self,
        request: ato_models.GetFundOrderfullinfoRequest,
    ) -> ato_models.GetFundOrderfullinfoResponse:
        """
        Description: 资方查询订单详情
        Summary: 资方查询订单详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_fund_orderfullinfo_ex_async(request, headers, runtime)

    def get_fund_orderfullinfo_ex(
        self,
        request: ato_models.GetFundOrderfullinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundOrderfullinfoResponse:
        """
        Description: 资方查询订单详情
        Summary: 资方查询订单详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundOrderfullinfoResponse(),
            self.do_request('1.0', 'antchain.ato.fund.orderfullinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_fund_orderfullinfo_ex_async(
        self,
        request: ato_models.GetFundOrderfullinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetFundOrderfullinfoResponse:
        """
        Description: 资方查询订单详情
        Summary: 资方查询订单详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetFundOrderfullinfoResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.orderfullinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_realperson_facevrf(
        self,
        request: ato_models.CreateRealpersonFacevrfRequest,
    ) -> ato_models.CreateRealpersonFacevrfResponse:
        """
        Description: 可信身份认证，创建认证
        Summary: 创建认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_realperson_facevrf_ex(request, headers, runtime)

    async def create_realperson_facevrf_async(
        self,
        request: ato_models.CreateRealpersonFacevrfRequest,
    ) -> ato_models.CreateRealpersonFacevrfResponse:
        """
        Description: 可信身份认证，创建认证
        Summary: 创建认证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_realperson_facevrf_ex_async(request, headers, runtime)

    def create_realperson_facevrf_ex(
        self,
        request: ato_models.CreateRealpersonFacevrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateRealpersonFacevrfResponse:
        """
        Description: 可信身份认证，创建认证
        Summary: 创建认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateRealpersonFacevrfResponse(),
            self.do_request('1.0', 'antchain.ato.realperson.facevrf.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_realperson_facevrf_ex_async(
        self,
        request: ato_models.CreateRealpersonFacevrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateRealpersonFacevrfResponse:
        """
        Description: 可信身份认证，创建认证
        Summary: 创建认证
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateRealpersonFacevrfResponse(),
            await self.do_request_async('1.0', 'antchain.ato.realperson.facevrf.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_realperson_facevrf(
        self,
        request: ato_models.QueryRealpersonFacevrfRequest,
    ) -> ato_models.QueryRealpersonFacevrfResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 查询认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_realperson_facevrf_ex(request, headers, runtime)

    async def query_realperson_facevrf_async(
        self,
        request: ato_models.QueryRealpersonFacevrfRequest,
    ) -> ato_models.QueryRealpersonFacevrfResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 查询认证结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_realperson_facevrf_ex_async(request, headers, runtime)

    def query_realperson_facevrf_ex(
        self,
        request: ato_models.QueryRealpersonFacevrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryRealpersonFacevrfResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 查询认证结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryRealpersonFacevrfResponse(),
            self.do_request('1.0', 'antchain.ato.realperson.facevrf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_realperson_facevrf_ex_async(
        self,
        request: ato_models.QueryRealpersonFacevrfRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryRealpersonFacevrfResponse:
        """
        Description: 查询认证的结果和相关信息
        Summary: 查询认证结果
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryRealpersonFacevrfResponse(),
            await self.do_request_async('1.0', 'antchain.ato.realperson.facevrf.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_sign_template(
        self,
        request: ato_models.AllSignTemplateRequest,
    ) -> ato_models.AllSignTemplateResponse:
        """
        Description: 电子合同签署的合同模板查询服务
        Summary: 电子合同签署的合同模板查询服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_sign_template_ex(request, headers, runtime)

    async def all_sign_template_async(
        self,
        request: ato_models.AllSignTemplateRequest,
    ) -> ato_models.AllSignTemplateResponse:
        """
        Description: 电子合同签署的合同模板查询服务
        Summary: 电子合同签署的合同模板查询服务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_sign_template_ex_async(request, headers, runtime)

    def all_sign_template_ex(
        self,
        request: ato_models.AllSignTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AllSignTemplateResponse:
        """
        Description: 电子合同签署的合同模板查询服务
        Summary: 电子合同签署的合同模板查询服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AllSignTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.sign.template.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_sign_template_ex_async(
        self,
        request: ato_models.AllSignTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AllSignTemplateResponse:
        """
        Description: 电子合同签署的合同模板查询服务
        Summary: 电子合同签署的合同模板查询服务
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AllSignTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.template.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_sign_flow(
        self,
        request: ato_models.SubmitSignFlowRequest,
    ) -> ato_models.SubmitSignFlowResponse:
        """
        Description: 提交电子合同的签署流程(后置签署模式)
        Summary: 提交电子合同的签署流程（后置签署模式）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_sign_flow_ex(request, headers, runtime)

    async def submit_sign_flow_async(
        self,
        request: ato_models.SubmitSignFlowRequest,
    ) -> ato_models.SubmitSignFlowResponse:
        """
        Description: 提交电子合同的签署流程(后置签署模式)
        Summary: 提交电子合同的签署流程（后置签署模式）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_sign_flow_ex_async(request, headers, runtime)

    def submit_sign_flow_ex(
        self,
        request: ato_models.SubmitSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitSignFlowResponse:
        """
        Description: 提交电子合同的签署流程(后置签署模式)
        Summary: 提交电子合同的签署流程（后置签署模式）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitSignFlowResponse(),
            self.do_request('1.0', 'antchain.ato.sign.flow.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_sign_flow_ex_async(
        self,
        request: ato_models.SubmitSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitSignFlowResponse:
        """
        Description: 提交电子合同的签署流程(后置签署模式)
        Summary: 提交电子合同的签署流程（后置签署模式）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitSignFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.flow.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sign_flow(
        self,
        request: ato_models.GetSignFlowRequest,
    ) -> ato_models.GetSignFlowResponse:
        """
        Description: 查询签署流程详情
        Summary: 查询签署流程详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sign_flow_ex(request, headers, runtime)

    async def get_sign_flow_async(
        self,
        request: ato_models.GetSignFlowRequest,
    ) -> ato_models.GetSignFlowResponse:
        """
        Description: 查询签署流程详情
        Summary: 查询签署流程详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sign_flow_ex_async(request, headers, runtime)

    def get_sign_flow_ex(
        self,
        request: ato_models.GetSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetSignFlowResponse:
        """
        Description: 查询签署流程详情
        Summary: 查询签署流程详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetSignFlowResponse(),
            self.do_request('1.0', 'antchain.ato.sign.flow.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sign_flow_ex_async(
        self,
        request: ato_models.GetSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetSignFlowResponse:
        """
        Description: 查询签署流程详情
        Summary: 查询签署流程详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetSignFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.flow.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def auth_sign_flow(
        self,
        request: ato_models.AuthSignFlowRequest,
    ) -> ato_models.AuthSignFlowResponse:
        """
        Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
        Summary: 电子合同签署流程落签操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.auth_sign_flow_ex(request, headers, runtime)

    async def auth_sign_flow_async(
        self,
        request: ato_models.AuthSignFlowRequest,
    ) -> ato_models.AuthSignFlowResponse:
        """
        Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
        Summary: 电子合同签署流程落签操作
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.auth_sign_flow_ex_async(request, headers, runtime)

    def auth_sign_flow_ex(
        self,
        request: ato_models.AuthSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AuthSignFlowResponse:
        """
        Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
        Summary: 电子合同签署流程落签操作
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AuthSignFlowResponse(),
            self.do_request('1.0', 'antchain.ato.sign.flow.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def auth_sign_flow_ex_async(
        self,
        request: ato_models.AuthSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AuthSignFlowResponse:
        """
        Description: 电子合同签署模块，机构调用这个接口进行签署的授权落签
        Summary: 电子合同签署流程落签操作
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AuthSignFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.flow.auth', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_front_sign(
        self,
        request: ato_models.SubmitFrontSignRequest,
    ) -> ato_models.SubmitFrontSignResponse:
        """
        Description: 提交前置签署的电子合同签署流程（前置签署模式）
        Summary: 提交签署的电子合同签署流程（前置签署）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_front_sign_ex(request, headers, runtime)

    async def submit_front_sign_async(
        self,
        request: ato_models.SubmitFrontSignRequest,
    ) -> ato_models.SubmitFrontSignResponse:
        """
        Description: 提交前置签署的电子合同签署流程（前置签署模式）
        Summary: 提交签署的电子合同签署流程（前置签署）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_front_sign_ex_async(request, headers, runtime)

    def submit_front_sign_ex(
        self,
        request: ato_models.SubmitFrontSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitFrontSignResponse:
        """
        Description: 提交前置签署的电子合同签署流程（前置签署模式）
        Summary: 提交签署的电子合同签署流程（前置签署）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitFrontSignResponse(),
            self.do_request('1.0', 'antchain.ato.front.sign.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_front_sign_ex_async(
        self,
        request: ato_models.SubmitFrontSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitFrontSignResponse:
        """
        Description: 提交前置签署的电子合同签署流程（前置签署模式）
        Summary: 提交签署的电子合同签署流程（前置签署）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitFrontSignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.front.sign.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_sign_flow(
        self,
        request: ato_models.UploadSignFlowRequest,
    ) -> ato_models.UploadSignFlowResponse:
        """
        Description: 调用该接口，追加上传无法在原有链路上签署的合同
        Summary: 商户调用合同追加接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_sign_flow_ex(request, headers, runtime)

    async def upload_sign_flow_async(
        self,
        request: ato_models.UploadSignFlowRequest,
    ) -> ato_models.UploadSignFlowResponse:
        """
        Description: 调用该接口，追加上传无法在原有链路上签署的合同
        Summary: 商户调用合同追加接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_sign_flow_ex_async(request, headers, runtime)

    def upload_sign_flow_ex(
        self,
        request: ato_models.UploadSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadSignFlowResponse:
        """
        Description: 调用该接口，追加上传无法在原有链路上签署的合同
        Summary: 商户调用合同追加接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ato_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.ato.sign.flow.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_sign_flow_response = ato_models.UploadSignFlowResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_sign_flow_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadSignFlowResponse(),
            self.do_request('1.0', 'antchain.ato.sign.flow.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_sign_flow_ex_async(
        self,
        request: ato_models.UploadSignFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadSignFlowResponse:
        """
        Description: 调用该接口，追加上传无法在原有链路上签署的合同
        Summary: 商户调用合同追加接口
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ato_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.ato.sign.flow.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_sign_flow_response = ato_models.UploadSignFlowResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_sign_flow_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadSignFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.flow.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_trade(
        self,
        request: ato_models.SyncTradeRequest,
    ) -> ato_models.SyncTradeResponse:
        """
        Description: 对账saas交易信息同步接口
        Summary: 对账saas交易信息同步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_trade_ex(request, headers, runtime)

    async def sync_trade_async(
        self,
        request: ato_models.SyncTradeRequest,
    ) -> ato_models.SyncTradeResponse:
        """
        Description: 对账saas交易信息同步接口
        Summary: 对账saas交易信息同步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_trade_ex_async(request, headers, runtime)

    def sync_trade_ex(
        self,
        request: ato_models.SyncTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncTradeResponse:
        """
        Description: 对账saas交易信息同步接口
        Summary: 对账saas交易信息同步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncTradeResponse(),
            self.do_request('1.0', 'antchain.ato.trade.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_trade_ex_async(
        self,
        request: ato_models.SyncTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncTradeResponse:
        """
        Description: 对账saas交易信息同步接口
        Summary: 对账saas交易信息同步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncTradeResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_trade(
        self,
        request: ato_models.GetTradeRequest,
    ) -> ato_models.GetTradeResponse:
        """
        Description: 获取详情
        Summary: 获取详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_trade_ex(request, headers, runtime)

    async def get_trade_async(
        self,
        request: ato_models.GetTradeRequest,
    ) -> ato_models.GetTradeResponse:
        """
        Description: 获取详情
        Summary: 获取详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_trade_ex_async(request, headers, runtime)

    def get_trade_ex(
        self,
        request: ato_models.GetTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetTradeResponse:
        """
        Description: 获取详情
        Summary: 获取详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetTradeResponse(),
            self.do_request('1.0', 'antchain.ato.trade.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_trade_ex_async(
        self,
        request: ato_models.GetTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetTradeResponse:
        """
        Description: 获取详情
        Summary: 获取详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetTradeResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_front_trade(
        self,
        request: ato_models.SyncFrontTradeRequest,
    ) -> ato_models.SyncFrontTradeResponse:
        """
        Description: 订单创建，前置签署
        Summary: 前置签署订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_front_trade_ex(request, headers, runtime)

    async def sync_front_trade_async(
        self,
        request: ato_models.SyncFrontTradeRequest,
    ) -> ato_models.SyncFrontTradeResponse:
        """
        Description: 订单创建，前置签署
        Summary: 前置签署订单创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_front_trade_ex_async(request, headers, runtime)

    def sync_front_trade_ex(
        self,
        request: ato_models.SyncFrontTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFrontTradeResponse:
        """
        Description: 订单创建，前置签署
        Summary: 前置签署订单创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFrontTradeResponse(),
            self.do_request('1.0', 'antchain.ato.front.trade.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_front_trade_ex_async(
        self,
        request: ato_models.SyncFrontTradeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFrontTradeResponse:
        """
        Description: 订单创建，前置签署
        Summary: 前置签署订单创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFrontTradeResponse(),
            await self.do_request_async('1.0', 'antchain.ato.front.trade.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_trade_financeloanapply(
        self,
        request: ato_models.SyncTradeFinanceloanapplyRequest,
    ) -> ato_models.SyncTradeFinanceloanapplyResponse:
        """
        Description: 融资放款申请接口
        Summary: 融资放款申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_trade_financeloanapply_ex(request, headers, runtime)

    async def sync_trade_financeloanapply_async(
        self,
        request: ato_models.SyncTradeFinanceloanapplyRequest,
    ) -> ato_models.SyncTradeFinanceloanapplyResponse:
        """
        Description: 融资放款申请接口
        Summary: 融资放款申请接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_trade_financeloanapply_ex_async(request, headers, runtime)

    def sync_trade_financeloanapply_ex(
        self,
        request: ato_models.SyncTradeFinanceloanapplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncTradeFinanceloanapplyResponse:
        """
        Description: 融资放款申请接口
        Summary: 融资放款申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncTradeFinanceloanapplyResponse(),
            self.do_request('1.0', 'antchain.ato.trade.financeloanapply.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_trade_financeloanapply_ex_async(
        self,
        request: ato_models.SyncTradeFinanceloanapplyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncTradeFinanceloanapplyResponse:
        """
        Description: 融资放款申请接口
        Summary: 融资放款申请接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncTradeFinanceloanapplyResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.financeloanapply.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_trade_merchantfulfillment(
        self,
        request: ato_models.GetTradeMerchantfulfillmentRequest,
    ) -> ato_models.GetTradeMerchantfulfillmentResponse:
        """
        Description: 商户履约查询
        Summary: 商户履约查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_trade_merchantfulfillment_ex(request, headers, runtime)

    async def get_trade_merchantfulfillment_async(
        self,
        request: ato_models.GetTradeMerchantfulfillmentRequest,
    ) -> ato_models.GetTradeMerchantfulfillmentResponse:
        """
        Description: 商户履约查询
        Summary: 商户履约查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_trade_merchantfulfillment_ex_async(request, headers, runtime)

    def get_trade_merchantfulfillment_ex(
        self,
        request: ato_models.GetTradeMerchantfulfillmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetTradeMerchantfulfillmentResponse:
        """
        Description: 商户履约查询
        Summary: 商户履约查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetTradeMerchantfulfillmentResponse(),
            self.do_request('1.0', 'antchain.ato.trade.merchantfulfillment.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_trade_merchantfulfillment_ex_async(
        self,
        request: ato_models.GetTradeMerchantfulfillmentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetTradeMerchantfulfillmentResponse:
        """
        Description: 商户履约查询
        Summary: 商户履约查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetTradeMerchantfulfillmentResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.merchantfulfillment.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_trade_userperformance(
        self,
        request: ato_models.GetTradeUserperformanceRequest,
    ) -> ato_models.GetTradeUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+记录）
        Summary: 用户履约信息查询（履约承诺+记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_trade_userperformance_ex(request, headers, runtime)

    async def get_trade_userperformance_async(
        self,
        request: ato_models.GetTradeUserperformanceRequest,
    ) -> ato_models.GetTradeUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+记录）
        Summary: 用户履约信息查询（履约承诺+记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_trade_userperformance_ex_async(request, headers, runtime)

    def get_trade_userperformance_ex(
        self,
        request: ato_models.GetTradeUserperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetTradeUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+记录）
        Summary: 用户履约信息查询（履约承诺+记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetTradeUserperformanceResponse(),
            self.do_request('1.0', 'antchain.ato.trade.userperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_trade_userperformance_ex_async(
        self,
        request: ato_models.GetTradeUserperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetTradeUserperformanceResponse:
        """
        Description: 用户履约信息查询（履约承诺+记录）
        Summary: 用户履约信息查询（履约承诺+记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetTradeUserperformanceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.userperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_trade_merchantperformance(
        self,
        request: ato_models.GetTradeMerchantperformanceRequest,
    ) -> ato_models.GetTradeMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_trade_merchantperformance_ex(request, headers, runtime)

    async def get_trade_merchantperformance_async(
        self,
        request: ato_models.GetTradeMerchantperformanceRequest,
    ) -> ato_models.GetTradeMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_trade_merchantperformance_ex_async(request, headers, runtime)

    def get_trade_merchantperformance_ex(
        self,
        request: ato_models.GetTradeMerchantperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetTradeMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetTradeMerchantperformanceResponse(),
            self.do_request('1.0', 'antchain.ato.trade.merchantperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_trade_merchantperformance_ex_async(
        self,
        request: ato_models.GetTradeMerchantperformanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetTradeMerchantperformanceResponse:
        """
        Description: 商户履约信息查询（履约承诺+履约记录）
        Summary: 商户履约信息查询（履约承诺+履约记录）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetTradeMerchantperformanceResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.merchantperformance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_withhold_sign(
        self,
        request: ato_models.CreateWithholdSignRequest,
    ) -> ato_models.CreateWithholdSignResponse:
        """
        Description: 代扣签约
        Summary: 代扣签约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_withhold_sign_ex(request, headers, runtime)

    async def create_withhold_sign_async(
        self,
        request: ato_models.CreateWithholdSignRequest,
    ) -> ato_models.CreateWithholdSignResponse:
        """
        Description: 代扣签约
        Summary: 代扣签约
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_withhold_sign_ex_async(request, headers, runtime)

    def create_withhold_sign_ex(
        self,
        request: ato_models.CreateWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateWithholdSignResponse:
        """
        Description: 代扣签约
        Summary: 代扣签约
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateWithholdSignResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.sign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_withhold_sign_ex_async(
        self,
        request: ato_models.CreateWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateWithholdSignResponse:
        """
        Description: 代扣签约
        Summary: 代扣签约
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateWithholdSignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.sign.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_withhold_sign(
        self,
        request: ato_models.QueryWithholdSignRequest,
    ) -> ato_models.QueryWithholdSignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_withhold_sign_ex(request, headers, runtime)

    async def query_withhold_sign_async(
        self,
        request: ato_models.QueryWithholdSignRequest,
    ) -> ato_models.QueryWithholdSignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_withhold_sign_ex_async(request, headers, runtime)

    def query_withhold_sign_ex(
        self,
        request: ato_models.QueryWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryWithholdSignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryWithholdSignResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.sign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_withhold_sign_ex_async(
        self,
        request: ato_models.QueryWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryWithholdSignResponse:
        """
        Description: 代扣签约查询
        Summary: 代扣签约查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryWithholdSignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.sign.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def unbind_withhold_sign(
        self,
        request: ato_models.UnbindWithholdSignRequest,
    ) -> ato_models.UnbindWithholdSignResponse:
        """
        Description: 订单关闭后,可以通过此接口解绑签约
        Summary: 代扣签约解绑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.unbind_withhold_sign_ex(request, headers, runtime)

    async def unbind_withhold_sign_async(
        self,
        request: ato_models.UnbindWithholdSignRequest,
    ) -> ato_models.UnbindWithholdSignResponse:
        """
        Description: 订单关闭后,可以通过此接口解绑签约
        Summary: 代扣签约解绑
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.unbind_withhold_sign_ex_async(request, headers, runtime)

    def unbind_withhold_sign_ex(
        self,
        request: ato_models.UnbindWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UnbindWithholdSignResponse:
        """
        Description: 订单关闭后,可以通过此接口解绑签约
        Summary: 代扣签约解绑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UnbindWithholdSignResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.sign.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def unbind_withhold_sign_ex_async(
        self,
        request: ato_models.UnbindWithholdSignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UnbindWithholdSignResponse:
        """
        Description: 订单关闭后,可以通过此接口解绑签约
        Summary: 代扣签约解绑
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UnbindWithholdSignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.sign.unbind', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_withhold_plan(
        self,
        request: ato_models.CancelWithholdPlanRequest,
    ) -> ato_models.CancelWithholdPlanResponse:
        """
        Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
        Summary: 取消代扣计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_withhold_plan_ex(request, headers, runtime)

    async def cancel_withhold_plan_async(
        self,
        request: ato_models.CancelWithholdPlanRequest,
    ) -> ato_models.CancelWithholdPlanResponse:
        """
        Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
        Summary: 取消代扣计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_withhold_plan_ex_async(request, headers, runtime)

    def cancel_withhold_plan_ex(
        self,
        request: ato_models.CancelWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CancelWithholdPlanResponse:
        """
        Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
        Summary: 取消代扣计划
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CancelWithholdPlanResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.plan.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_withhold_plan_ex_async(
        self,
        request: ato_models.CancelWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CancelWithholdPlanResponse:
        """
        Description: 取消代扣计划，将未扣款的全部代扣计划进行取消
        Summary: 取消代扣计划
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CancelWithholdPlanResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.plan.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def repay_withhold_plan(
        self,
        request: ato_models.RepayWithholdPlanRequest,
    ) -> ato_models.RepayWithholdPlanResponse:
        """
        Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
        Summary: 代扣计划清偿/清欠
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.repay_withhold_plan_ex(request, headers, runtime)

    async def repay_withhold_plan_async(
        self,
        request: ato_models.RepayWithholdPlanRequest,
    ) -> ato_models.RepayWithholdPlanResponse:
        """
        Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
        Summary: 代扣计划清偿/清欠
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.repay_withhold_plan_ex_async(request, headers, runtime)

    def repay_withhold_plan_ex(
        self,
        request: ato_models.RepayWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RepayWithholdPlanResponse:
        """
        Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
        Summary: 代扣计划清偿/清欠
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RepayWithholdPlanResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.plan.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def repay_withhold_plan_ex_async(
        self,
        request: ato_models.RepayWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RepayWithholdPlanResponse:
        """
        Description: 代扣计划清偿/清欠，通过其他收款后通过子接口通知
        Summary: 代扣计划清偿/清欠
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RepayWithholdPlanResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.plan.repay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_withhold_plan(
        self,
        request: ato_models.RetryWithholdPlanRequest,
    ) -> ato_models.RetryWithholdPlanResponse:
        """
        Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
        Summary: 扣款计划重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_withhold_plan_ex(request, headers, runtime)

    async def retry_withhold_plan_async(
        self,
        request: ato_models.RetryWithholdPlanRequest,
    ) -> ato_models.RetryWithholdPlanResponse:
        """
        Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
        Summary: 扣款计划重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_withhold_plan_ex_async(request, headers, runtime)

    def retry_withhold_plan_ex(
        self,
        request: ato_models.RetryWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RetryWithholdPlanResponse:
        """
        Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
        Summary: 扣款计划重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RetryWithholdPlanResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.plan.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_withhold_plan_ex_async(
        self,
        request: ato_models.RetryWithholdPlanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RetryWithholdPlanResponse:
        """
        Description: 当代扣未成功时，商户可与用户进行沟通补款到支付宝，补款完成后通过代扣重试能力实时触发重试扣款。
        Summary: 扣款计划重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RetryWithholdPlanResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.plan.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def confirm_withhold_signasyncunsign(
        self,
        request: ato_models.ConfirmWithholdSignasyncunsignRequest,
    ) -> ato_models.ConfirmWithholdSignasyncunsignResponse:
        """
        Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
        Summary: 代扣签约的异步解约确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.confirm_withhold_signasyncunsign_ex(request, headers, runtime)

    async def confirm_withhold_signasyncunsign_async(
        self,
        request: ato_models.ConfirmWithholdSignasyncunsignRequest,
    ) -> ato_models.ConfirmWithholdSignasyncunsignResponse:
        """
        Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
        Summary: 代扣签约的异步解约确认
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.confirm_withhold_signasyncunsign_ex_async(request, headers, runtime)

    def confirm_withhold_signasyncunsign_ex(
        self,
        request: ato_models.ConfirmWithholdSignasyncunsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ConfirmWithholdSignasyncunsignResponse:
        """
        Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
        Summary: 代扣签约的异步解约确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ConfirmWithholdSignasyncunsignResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.signasyncunsign.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def confirm_withhold_signasyncunsign_ex_async(
        self,
        request: ato_models.ConfirmWithholdSignasyncunsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ConfirmWithholdSignasyncunsignResponse:
        """
        Description: 当代扣签约时，用户在支付宝侧发起异步解约，此时需要经过商户确认才可以完成解约。saas会通知商户用户的异步解约申请，由商户通过此接口确认是否解约
        Summary: 代扣签约的异步解约确认
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ConfirmWithholdSignasyncunsignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.signasyncunsign.confirm', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_withhold_activepay(
        self,
        request: ato_models.CreateWithholdActivepayRequest,
    ) -> ato_models.CreateWithholdActivepayResponse:
        """
        Description: 代扣主动支付创建
        Summary: 代扣主动支付创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_withhold_activepay_ex(request, headers, runtime)

    async def create_withhold_activepay_async(
        self,
        request: ato_models.CreateWithholdActivepayRequest,
    ) -> ato_models.CreateWithholdActivepayResponse:
        """
        Description: 代扣主动支付创建
        Summary: 代扣主动支付创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_withhold_activepay_ex_async(request, headers, runtime)

    def create_withhold_activepay_ex(
        self,
        request: ato_models.CreateWithholdActivepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateWithholdActivepayResponse:
        """
        Description: 代扣主动支付创建
        Summary: 代扣主动支付创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateWithholdActivepayResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.activepay.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_withhold_activepay_ex_async(
        self,
        request: ato_models.CreateWithholdActivepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateWithholdActivepayResponse:
        """
        Description: 代扣主动支付创建
        Summary: 代扣主动支付创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateWithholdActivepayResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.activepay.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_withhold_activepay(
        self,
        request: ato_models.QueryWithholdActivepayRequest,
    ) -> ato_models.QueryWithholdActivepayResponse:
        """
        Description: 代扣主动支付查询
        Summary: 代扣主动支付查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_withhold_activepay_ex(request, headers, runtime)

    async def query_withhold_activepay_async(
        self,
        request: ato_models.QueryWithholdActivepayRequest,
    ) -> ato_models.QueryWithholdActivepayResponse:
        """
        Description: 代扣主动支付查询
        Summary: 代扣主动支付查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_withhold_activepay_ex_async(request, headers, runtime)

    def query_withhold_activepay_ex(
        self,
        request: ato_models.QueryWithholdActivepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryWithholdActivepayResponse:
        """
        Description: 代扣主动支付查询
        Summary: 代扣主动支付查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryWithholdActivepayResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.activepay.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_withhold_activepay_ex_async(
        self,
        request: ato_models.QueryWithholdActivepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryWithholdActivepayResponse:
        """
        Description: 代扣主动支付查询
        Summary: 代扣主动支付查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryWithholdActivepayResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.activepay.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_withhold_activepay(
        self,
        request: ato_models.CancelWithholdActivepayRequest,
    ) -> ato_models.CancelWithholdActivepayResponse:
        """
        Description: 代扣主动支付取消
        Summary: 代扣主动支付取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_withhold_activepay_ex(request, headers, runtime)

    async def cancel_withhold_activepay_async(
        self,
        request: ato_models.CancelWithholdActivepayRequest,
    ) -> ato_models.CancelWithholdActivepayResponse:
        """
        Description: 代扣主动支付取消
        Summary: 代扣主动支付取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_withhold_activepay_ex_async(request, headers, runtime)

    def cancel_withhold_activepay_ex(
        self,
        request: ato_models.CancelWithholdActivepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CancelWithholdActivepayResponse:
        """
        Description: 代扣主动支付取消
        Summary: 代扣主动支付取消
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CancelWithholdActivepayResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.activepay.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_withhold_activepay_ex_async(
        self,
        request: ato_models.CancelWithholdActivepayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CancelWithholdActivepayResponse:
        """
        Description: 代扣主动支付取消
        Summary: 代扣主动支付取消
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CancelWithholdActivepayResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.activepay.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: ato_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> ato_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: ato_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> ato_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: ato_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: ato_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
