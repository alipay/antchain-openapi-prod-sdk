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
            # 文件信息
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
                    'sdk_version': '1.8.81',
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
            # 文件信息
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
                    'sdk_version': '1.8.81',
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

    def notify_fund_flow(
        self,
        request: ato_models.NotifyFundFlowRequest,
    ) -> ato_models.NotifyFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
        Summary: 资方合同文件已上传确认接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.notify_fund_flow_ex(request, headers, runtime)

    async def notify_fund_flow_async(
        self,
        request: ato_models.NotifyFundFlowRequest,
    ) -> ato_models.NotifyFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
        Summary: 资方合同文件已上传确认接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.notify_fund_flow_ex_async(request, headers, runtime)

    def notify_fund_flow_ex(
        self,
        request: ato_models.NotifyFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.NotifyFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
        Summary: 资方合同文件已上传确认接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.NotifyFundFlowResponse(),
            self.do_request('1.0', 'antchain.ato.fund.flow.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def notify_fund_flow_ex_async(
        self,
        request: ato_models.NotifyFundFlowRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.NotifyFundFlowResponse:
        """
        Description: 用于资方将盖章后的合同文件上传给ISV后，ISV通过该接口通知资方已上传合同
        Summary: 资方合同文件已上传确认接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.NotifyFundFlowResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.flow.notify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_fund_credit(
        self,
        request: ato_models.UploadFundCreditRequest,
    ) -> ato_models.UploadFundCreditResponse:
        """
        Description: 资方资产凭证上传，可以是文本或文件
        Summary: 资方资产凭证上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_fund_credit_ex(request, headers, runtime)

    async def upload_fund_credit_async(
        self,
        request: ato_models.UploadFundCreditRequest,
    ) -> ato_models.UploadFundCreditResponse:
        """
        Description: 资方资产凭证上传，可以是文本或文件
        Summary: 资方资产凭证上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_fund_credit_ex_async(request, headers, runtime)

    def upload_fund_credit_ex(
        self,
        request: ato_models.UploadFundCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadFundCreditResponse:
        """
        Description: 资方资产凭证上传，可以是文本或文件
        Summary: 资方资产凭证上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadFundCreditResponse(),
            self.do_request('1.0', 'antchain.ato.fund.credit.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_fund_credit_ex_async(
        self,
        request: ato_models.UploadFundCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadFundCreditResponse:
        """
        Description: 资方资产凭证上传，可以是文本或文件
        Summary: 资方资产凭证上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadFundCreditResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.credit.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_fund_credit(
        self,
        request: ato_models.QueryFundCreditRequest,
    ) -> ato_models.QueryFundCreditResponse:
        """
        Description: 资方资产凭证查询，需要提供订单号或资产包号
        Summary: 资方资产凭证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_fund_credit_ex(request, headers, runtime)

    async def query_fund_credit_async(
        self,
        request: ato_models.QueryFundCreditRequest,
    ) -> ato_models.QueryFundCreditResponse:
        """
        Description: 资方资产凭证查询，需要提供订单号或资产包号
        Summary: 资方资产凭证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_fund_credit_ex_async(request, headers, runtime)

    def query_fund_credit_ex(
        self,
        request: ato_models.QueryFundCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryFundCreditResponse:
        """
        Description: 资方资产凭证查询，需要提供订单号或资产包号
        Summary: 资方资产凭证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryFundCreditResponse(),
            self.do_request('1.0', 'antchain.ato.fund.credit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_fund_credit_ex_async(
        self,
        request: ato_models.QueryFundCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryFundCreditResponse:
        """
        Description: 资方资产凭证查询，需要提供订单号或资产包号
        Summary: 资方资产凭证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryFundCreditResponse(),
            await self.do_request_async('1.0', 'antchain.ato.fund.credit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_inner_product(
        self,
        request: ato_models.GetInnerProductRequest,
    ) -> ato_models.GetInnerProductResponse:
        """
        Description: 内部调用,商品信息获取
        Summary: 商品信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_inner_product_ex(request, headers, runtime)

    async def get_inner_product_async(
        self,
        request: ato_models.GetInnerProductRequest,
    ) -> ato_models.GetInnerProductResponse:
        """
        Description: 内部调用,商品信息获取
        Summary: 商品信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_inner_product_ex_async(request, headers, runtime)

    def get_inner_product_ex(
        self,
        request: ato_models.GetInnerProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerProductResponse:
        """
        Description: 内部调用,商品信息获取
        Summary: 商品信息获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerProductResponse(),
            self.do_request('1.0', 'antchain.ato.inner.product.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_inner_product_ex_async(
        self,
        request: ato_models.GetInnerProductRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerProductResponse:
        """
        Description: 内部调用,商品信息获取
        Summary: 商品信息获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerProductResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.product.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_inner_tenant(
        self,
        request: ato_models.GetInnerTenantRequest,
    ) -> ato_models.GetInnerTenantResponse:
        """
        Description: ato内部服务，客户系统不可访问；租户信息获取
        Summary: 租户信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_inner_tenant_ex(request, headers, runtime)

    async def get_inner_tenant_async(
        self,
        request: ato_models.GetInnerTenantRequest,
    ) -> ato_models.GetInnerTenantResponse:
        """
        Description: ato内部服务，客户系统不可访问；租户信息获取
        Summary: 租户信息获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_inner_tenant_ex_async(request, headers, runtime)

    def get_inner_tenant_ex(
        self,
        request: ato_models.GetInnerTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerTenantResponse:
        """
        Description: ato内部服务，客户系统不可访问；租户信息获取
        Summary: 租户信息获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerTenantResponse(),
            self.do_request('1.0', 'antchain.ato.inner.tenant.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_inner_tenant_ex_async(
        self,
        request: ato_models.GetInnerTenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerTenantResponse:
        """
        Description: ato内部服务，客户系统不可访问；租户信息获取
        Summary: 租户信息获取
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerTenantResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.tenant.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_inner_meterforwholeorder(
        self,
        request: ato_models.SyncInnerMeterforwholeorderRequest,
    ) -> ato_models.SyncInnerMeterforwholeorderResponse:
        """
        Description: 内部接口，客户系统不能调用。上报整单结算计量信息
        Summary: 上报整单结算计量信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_inner_meterforwholeorder_ex(request, headers, runtime)

    async def sync_inner_meterforwholeorder_async(
        self,
        request: ato_models.SyncInnerMeterforwholeorderRequest,
    ) -> ato_models.SyncInnerMeterforwholeorderResponse:
        """
        Description: 内部接口，客户系统不能调用。上报整单结算计量信息
        Summary: 上报整单结算计量信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_inner_meterforwholeorder_ex_async(request, headers, runtime)

    def sync_inner_meterforwholeorder_ex(
        self,
        request: ato_models.SyncInnerMeterforwholeorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncInnerMeterforwholeorderResponse:
        """
        Description: 内部接口，客户系统不能调用。上报整单结算计量信息
        Summary: 上报整单结算计量信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncInnerMeterforwholeorderResponse(),
            self.do_request('1.0', 'antchain.ato.inner.meterforwholeorder.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_inner_meterforwholeorder_ex_async(
        self,
        request: ato_models.SyncInnerMeterforwholeorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncInnerMeterforwholeorderResponse:
        """
        Description: 内部接口，客户系统不能调用。上报整单结算计量信息
        Summary: 上报整单结算计量信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncInnerMeterforwholeorderResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.meterforwholeorder.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_inner_meterforagsign(
        self,
        request: ato_models.SyncInnerMeterforagsignRequest,
    ) -> ato_models.SyncInnerMeterforagsignResponse:
        """
        Description: 内部调用，合同签署计量上报接口
        Summary: 合同签署计量上报同步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_inner_meterforagsign_ex(request, headers, runtime)

    async def sync_inner_meterforagsign_async(
        self,
        request: ato_models.SyncInnerMeterforagsignRequest,
    ) -> ato_models.SyncInnerMeterforagsignResponse:
        """
        Description: 内部调用，合同签署计量上报接口
        Summary: 合同签署计量上报同步接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_inner_meterforagsign_ex_async(request, headers, runtime)

    def sync_inner_meterforagsign_ex(
        self,
        request: ato_models.SyncInnerMeterforagsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncInnerMeterforagsignResponse:
        """
        Description: 内部调用，合同签署计量上报接口
        Summary: 合同签署计量上报同步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncInnerMeterforagsignResponse(),
            self.do_request('1.0', 'antchain.ato.inner.meterforagsign.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_inner_meterforagsign_ex_async(
        self,
        request: ato_models.SyncInnerMeterforagsignRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncInnerMeterforagsignResponse:
        """
        Description: 内部调用，合同签署计量上报接口
        Summary: 合同签署计量上报同步接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncInnerMeterforagsignResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.meterforagsign.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_inner_template(
        self,
        request: ato_models.AllInnerTemplateRequest,
    ) -> ato_models.AllInnerTemplateResponse:
        """
        Description: 内部接口，根据租户查询合同模板列表
        Summary: 查询模板列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_inner_template_ex(request, headers, runtime)

    async def all_inner_template_async(
        self,
        request: ato_models.AllInnerTemplateRequest,
    ) -> ato_models.AllInnerTemplateResponse:
        """
        Description: 内部接口，根据租户查询合同模板列表
        Summary: 查询模板列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_inner_template_ex_async(request, headers, runtime)

    def all_inner_template_ex(
        self,
        request: ato_models.AllInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AllInnerTemplateResponse:
        """
        Description: 内部接口，根据租户查询合同模板列表
        Summary: 查询模板列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AllInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_inner_template_ex_async(
        self,
        request: ato_models.AllInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.AllInnerTemplateResponse:
        """
        Description: 内部接口，根据租户查询合同模板列表
        Summary: 查询模板列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.AllInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_inner_template(
        self,
        request: ato_models.ListInnerTemplateRequest,
    ) -> ato_models.ListInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询合同模板版本列表
        Summary: 查询魔法库某一模板版本列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_inner_template_ex(request, headers, runtime)

    async def list_inner_template_async(
        self,
        request: ato_models.ListInnerTemplateRequest,
    ) -> ato_models.ListInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询合同模板版本列表
        Summary: 查询魔法库某一模板版本列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_inner_template_ex_async(request, headers, runtime)

    def list_inner_template_ex(
        self,
        request: ato_models.ListInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ListInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询合同模板版本列表
        Summary: 查询魔法库某一模板版本列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ListInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_inner_template_ex_async(
        self,
        request: ato_models.ListInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.ListInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询合同模板版本列表
        Summary: 查询魔法库某一模板版本列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.ListInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def detail_inner_template(
        self,
        request: ato_models.DetailInnerTemplateRequest,
    ) -> ato_models.DetailInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询指定版本的模板详情
        Summary: 查询魔法库模板详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.detail_inner_template_ex(request, headers, runtime)

    async def detail_inner_template_async(
        self,
        request: ato_models.DetailInnerTemplateRequest,
    ) -> ato_models.DetailInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询指定版本的模板详情
        Summary: 查询魔法库模板详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.detail_inner_template_ex_async(request, headers, runtime)

    def detail_inner_template_ex(
        self,
        request: ato_models.DetailInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DetailInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询指定版本的模板详情
        Summary: 查询魔法库模板详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DetailInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def detail_inner_template_ex_async(
        self,
        request: ato_models.DetailInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DetailInnerTemplateResponse:
        """
        Description: 内部接口，根据模板code查询指定版本的模板详情
        Summary: 查询魔法库模板详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DetailInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.detail', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_inner_template(
        self,
        request: ato_models.CreateInnerTemplateRequest,
    ) -> ato_models.CreateInnerTemplateResponse:
        """
        Description: 内部接口，创建魔法库模板
        Summary: 创建模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_inner_template_ex(request, headers, runtime)

    async def create_inner_template_async(
        self,
        request: ato_models.CreateInnerTemplateRequest,
    ) -> ato_models.CreateInnerTemplateResponse:
        """
        Description: 内部接口，创建魔法库模板
        Summary: 创建模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_inner_template_ex_async(request, headers, runtime)

    def create_inner_template_ex(
        self,
        request: ato_models.CreateInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerTemplateResponse:
        """
        Description: 内部接口，创建魔法库模板
        Summary: 创建模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_inner_template_ex_async(
        self,
        request: ato_models.CreateInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerTemplateResponse:
        """
        Description: 内部接口，创建魔法库模板
        Summary: 创建模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_inner_template(
        self,
        request: ato_models.SaveInnerTemplateRequest,
    ) -> ato_models.SaveInnerTemplateResponse:
        """
        Description: 内部接口，保存魔法库模板
        Summary: 保存魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_inner_template_ex(request, headers, runtime)

    async def save_inner_template_async(
        self,
        request: ato_models.SaveInnerTemplateRequest,
    ) -> ato_models.SaveInnerTemplateResponse:
        """
        Description: 内部接口，保存魔法库模板
        Summary: 保存魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_inner_template_ex_async(request, headers, runtime)

    def save_inner_template_ex(
        self,
        request: ato_models.SaveInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SaveInnerTemplateResponse:
        """
        Description: 内部接口，保存魔法库模板
        Summary: 保存魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SaveInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_inner_template_ex_async(
        self,
        request: ato_models.SaveInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SaveInnerTemplateResponse:
        """
        Description: 内部接口，保存魔法库模板
        Summary: 保存魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SaveInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def save_inner_signfields(
        self,
        request: ato_models.SaveInnerSignfieldsRequest,
    ) -> ato_models.SaveInnerSignfieldsResponse:
        """
        Description: 内部接口，保存魔法库模板签署区
        Summary: 保存魔法库模板签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.save_inner_signfields_ex(request, headers, runtime)

    async def save_inner_signfields_async(
        self,
        request: ato_models.SaveInnerSignfieldsRequest,
    ) -> ato_models.SaveInnerSignfieldsResponse:
        """
        Description: 内部接口，保存魔法库模板签署区
        Summary: 保存魔法库模板签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.save_inner_signfields_ex_async(request, headers, runtime)

    def save_inner_signfields_ex(
        self,
        request: ato_models.SaveInnerSignfieldsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SaveInnerSignfieldsResponse:
        """
        Description: 内部接口，保存魔法库模板签署区
        Summary: 保存魔法库模板签署区
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SaveInnerSignfieldsResponse(),
            self.do_request('1.0', 'antchain.ato.inner.signfields.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def save_inner_signfields_ex_async(
        self,
        request: ato_models.SaveInnerSignfieldsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SaveInnerSignfieldsResponse:
        """
        Description: 内部接口，保存魔法库模板签署区
        Summary: 保存魔法库模板签署区
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SaveInnerSignfieldsResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.signfields.save', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def publish_inner_template(
        self,
        request: ato_models.PublishInnerTemplateRequest,
    ) -> ato_models.PublishInnerTemplateResponse:
        """
        Description: 内部接口，发布魔法库模板
        Summary: 发布魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.publish_inner_template_ex(request, headers, runtime)

    async def publish_inner_template_async(
        self,
        request: ato_models.PublishInnerTemplateRequest,
    ) -> ato_models.PublishInnerTemplateResponse:
        """
        Description: 内部接口，发布魔法库模板
        Summary: 发布魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.publish_inner_template_ex_async(request, headers, runtime)

    def publish_inner_template_ex(
        self,
        request: ato_models.PublishInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PublishInnerTemplateResponse:
        """
        Description: 内部接口，发布魔法库模板
        Summary: 发布魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PublishInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def publish_inner_template_ex_async(
        self,
        request: ato_models.PublishInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PublishInnerTemplateResponse:
        """
        Description: 内部接口，发布魔法库模板
        Summary: 发布魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PublishInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.publish', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def preview_inner_template(
        self,
        request: ato_models.PreviewInnerTemplateRequest,
    ) -> ato_models.PreviewInnerTemplateResponse:
        """
        Description: 内部接口，根据code预览对应魔法库模板
        Summary: 预览魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.preview_inner_template_ex(request, headers, runtime)

    async def preview_inner_template_async(
        self,
        request: ato_models.PreviewInnerTemplateRequest,
    ) -> ato_models.PreviewInnerTemplateResponse:
        """
        Description: 内部接口，根据code预览对应魔法库模板
        Summary: 预览魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.preview_inner_template_ex_async(request, headers, runtime)

    def preview_inner_template_ex(
        self,
        request: ato_models.PreviewInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PreviewInnerTemplateResponse:
        """
        Description: 内部接口，根据code预览对应魔法库模板
        Summary: 预览魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PreviewInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def preview_inner_template_ex_async(
        self,
        request: ato_models.PreviewInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PreviewInnerTemplateResponse:
        """
        Description: 内部接口，根据code预览对应魔法库模板
        Summary: 预览魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PreviewInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.preview', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_inner_template(
        self,
        request: ato_models.DeleteInnerTemplateRequest,
    ) -> ato_models.DeleteInnerTemplateResponse:
        """
        Description: 内部接口，根据code删除对应魔法库模板
        Summary: 删除魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_inner_template_ex(request, headers, runtime)

    async def delete_inner_template_async(
        self,
        request: ato_models.DeleteInnerTemplateRequest,
    ) -> ato_models.DeleteInnerTemplateResponse:
        """
        Description: 内部接口，根据code删除对应魔法库模板
        Summary: 删除魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_inner_template_ex_async(request, headers, runtime)

    def delete_inner_template_ex(
        self,
        request: ato_models.DeleteInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DeleteInnerTemplateResponse:
        """
        Description: 内部接口，根据code删除对应魔法库模板
        Summary: 删除魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DeleteInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_inner_template_ex_async(
        self,
        request: ato_models.DeleteInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DeleteInnerTemplateResponse:
        """
        Description: 内部接口，根据code删除对应魔法库模板
        Summary: 删除魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DeleteInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def clone_inner_template(
        self,
        request: ato_models.CloneInnerTemplateRequest,
    ) -> ato_models.CloneInnerTemplateResponse:
        """
        Description: 内部接口，复制一个魔法库模板
        Summary: 复制魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.clone_inner_template_ex(request, headers, runtime)

    async def clone_inner_template_async(
        self,
        request: ato_models.CloneInnerTemplateRequest,
    ) -> ato_models.CloneInnerTemplateResponse:
        """
        Description: 内部接口，复制一个魔法库模板
        Summary: 复制魔法库模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.clone_inner_template_ex_async(request, headers, runtime)

    def clone_inner_template_ex(
        self,
        request: ato_models.CloneInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CloneInnerTemplateResponse:
        """
        Description: 内部接口，复制一个魔法库模板
        Summary: 复制魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CloneInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.clone', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def clone_inner_template_ex_async(
        self,
        request: ato_models.CloneInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CloneInnerTemplateResponse:
        """
        Description: 内部接口，复制一个魔法库模板
        Summary: 复制魔法库模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CloneInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.clone', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_inner_file(
        self,
        request: ato_models.UploadInnerFileRequest,
    ) -> ato_models.UploadInnerFileResponse:
        """
        Description: ato文件上传
        Summary: ato文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_inner_file_ex(request, headers, runtime)

    async def upload_inner_file_async(
        self,
        request: ato_models.UploadInnerFileRequest,
    ) -> ato_models.UploadInnerFileResponse:
        """
        Description: ato文件上传
        Summary: ato文件上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_inner_file_ex_async(request, headers, runtime)

    def upload_inner_file_ex(
        self,
        request: ato_models.UploadInnerFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadInnerFileResponse:
        """
        Description: ato文件上传
        Summary: ato文件上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadInnerFileResponse(),
            self.do_request('1.0', 'antchain.ato.inner.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_inner_file_ex_async(
        self,
        request: ato_models.UploadInnerFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadInnerFileResponse:
        """
        Description: ato文件上传
        Summary: ato文件上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadInnerFileResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def download_inner_file(
        self,
        request: ato_models.DownloadInnerFileRequest,
    ) -> ato_models.DownloadInnerFileResponse:
        """
        Description: ato文件下载
        Summary: ato文件下载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.download_inner_file_ex(request, headers, runtime)

    async def download_inner_file_async(
        self,
        request: ato_models.DownloadInnerFileRequest,
    ) -> ato_models.DownloadInnerFileResponse:
        """
        Description: ato文件下载
        Summary: ato文件下载
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.download_inner_file_ex_async(request, headers, runtime)

    def download_inner_file_ex(
        self,
        request: ato_models.DownloadInnerFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DownloadInnerFileResponse:
        """
        Description: ato文件下载
        Summary: ato文件下载
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DownloadInnerFileResponse(),
            self.do_request('1.0', 'antchain.ato.inner.file.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def download_inner_file_ex_async(
        self,
        request: ato_models.DownloadInnerFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.DownloadInnerFileResponse:
        """
        Description: ato文件下载
        Summary: ato文件下载
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.DownloadInnerFileResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.file.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_inner_templateofficeurl(
        self,
        request: ato_models.GetInnerTemplateofficeurlRequest,
    ) -> ato_models.GetInnerTemplateofficeurlResponse:
        """
        Description: 获取 webofficeURL（透传）
        Summary: 获取 webofficeURL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_inner_templateofficeurl_ex(request, headers, runtime)

    async def get_inner_templateofficeurl_async(
        self,
        request: ato_models.GetInnerTemplateofficeurlRequest,
    ) -> ato_models.GetInnerTemplateofficeurlResponse:
        """
        Description: 获取 webofficeURL（透传）
        Summary: 获取 webofficeURL
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_inner_templateofficeurl_ex_async(request, headers, runtime)

    def get_inner_templateofficeurl_ex(
        self,
        request: ato_models.GetInnerTemplateofficeurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerTemplateofficeurlResponse:
        """
        Description: 获取 webofficeURL（透传）
        Summary: 获取 webofficeURL
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerTemplateofficeurlResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templateofficeurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_inner_templateofficeurl_ex_async(
        self,
        request: ato_models.GetInnerTemplateofficeurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.GetInnerTemplateofficeurlResponse:
        """
        Description: 获取 webofficeURL（透传）
        Summary: 获取 webofficeURL
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.GetInnerTemplateofficeurlResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templateofficeurl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def refresh_inner_templatetoken(
        self,
        request: ato_models.RefreshInnerTemplatetokenRequest,
    ) -> ato_models.RefreshInnerTemplatetokenResponse:
        """
        Description: 魔法库控制台刷新token
        Summary: 刷新token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.refresh_inner_templatetoken_ex(request, headers, runtime)

    async def refresh_inner_templatetoken_async(
        self,
        request: ato_models.RefreshInnerTemplatetokenRequest,
    ) -> ato_models.RefreshInnerTemplatetokenResponse:
        """
        Description: 魔法库控制台刷新token
        Summary: 刷新token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.refresh_inner_templatetoken_ex_async(request, headers, runtime)

    def refresh_inner_templatetoken_ex(
        self,
        request: ato_models.RefreshInnerTemplatetokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RefreshInnerTemplatetokenResponse:
        """
        Description: 魔法库控制台刷新token
        Summary: 刷新token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RefreshInnerTemplatetokenResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templatetoken.refresh', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def refresh_inner_templatetoken_ex_async(
        self,
        request: ato_models.RefreshInnerTemplatetokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RefreshInnerTemplatetokenResponse:
        """
        Description: 魔法库控制台刷新token
        Summary: 刷新token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RefreshInnerTemplatetokenResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templatetoken.refresh', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_inner_templatetextarea(
        self,
        request: ato_models.CreateInnerTemplatetextareaRequest,
    ) -> ato_models.CreateInnerTemplatetextareaResponse:
        """
        Description: 创建文本域（组件）
        Summary: 创建文本域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_inner_templatetextarea_ex(request, headers, runtime)

    async def create_inner_templatetextarea_async(
        self,
        request: ato_models.CreateInnerTemplatetextareaRequest,
    ) -> ato_models.CreateInnerTemplatetextareaResponse:
        """
        Description: 创建文本域（组件）
        Summary: 创建文本域
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_inner_templatetextarea_ex_async(request, headers, runtime)

    def create_inner_templatetextarea_ex(
        self,
        request: ato_models.CreateInnerTemplatetextareaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerTemplatetextareaResponse:
        """
        Description: 创建文本域（组件）
        Summary: 创建文本域
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerTemplatetextareaResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templatetextarea.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_inner_templatetextarea_ex_async(
        self,
        request: ato_models.CreateInnerTemplatetextareaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerTemplatetextareaResponse:
        """
        Description: 创建文本域（组件）
        Summary: 创建文本域
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerTemplatetextareaResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templatetextarea.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_templateimage(
        self,
        request: ato_models.QueryInnerTemplateimageRequest,
    ) -> ato_models.QueryInnerTemplateimageResponse:
        """
        Description: 获取模板的图片列表
        Summary: 获取模板的图片列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_templateimage_ex(request, headers, runtime)

    async def query_inner_templateimage_async(
        self,
        request: ato_models.QueryInnerTemplateimageRequest,
    ) -> ato_models.QueryInnerTemplateimageResponse:
        """
        Description: 获取模板的图片列表
        Summary: 获取模板的图片列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_templateimage_ex_async(request, headers, runtime)

    def query_inner_templateimage_ex(
        self,
        request: ato_models.QueryInnerTemplateimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTemplateimageResponse:
        """
        Description: 获取模板的图片列表
        Summary: 获取模板的图片列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTemplateimageResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templateimage.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_templateimage_ex_async(
        self,
        request: ato_models.QueryInnerTemplateimageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTemplateimageResponse:
        """
        Description: 获取模板的图片列表
        Summary: 获取模板的图片列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTemplateimageResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templateimage.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_inner_funddividerelation(
        self,
        request: ato_models.CreateInnerFunddividerelationRequest,
    ) -> ato_models.CreateInnerFunddividerelationResponse:
        """
        Description: 保存/编辑分账关系信息
        Summary: 保存/编辑分账关系信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_inner_funddividerelation_ex(request, headers, runtime)

    async def create_inner_funddividerelation_async(
        self,
        request: ato_models.CreateInnerFunddividerelationRequest,
    ) -> ato_models.CreateInnerFunddividerelationResponse:
        """
        Description: 保存/编辑分账关系信息
        Summary: 保存/编辑分账关系信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_inner_funddividerelation_ex_async(request, headers, runtime)

    def create_inner_funddividerelation_ex(
        self,
        request: ato_models.CreateInnerFunddividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerFunddividerelationResponse:
        """
        Description: 保存/编辑分账关系信息
        Summary: 保存/编辑分账关系信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerFunddividerelationResponse(),
            self.do_request('1.0', 'antchain.ato.inner.funddividerelation.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_inner_funddividerelation_ex_async(
        self,
        request: ato_models.CreateInnerFunddividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerFunddividerelationResponse:
        """
        Description: 保存/编辑分账关系信息
        Summary: 保存/编辑分账关系信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerFunddividerelationResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.funddividerelation.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_inner_funddividerelation(
        self,
        request: ato_models.SubmitInnerFunddividerelationRequest,
    ) -> ato_models.SubmitInnerFunddividerelationResponse:
        """
        Description: 提交分账关系信息
        Summary: 提交分账关系信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_inner_funddividerelation_ex(request, headers, runtime)

    async def submit_inner_funddividerelation_async(
        self,
        request: ato_models.SubmitInnerFunddividerelationRequest,
    ) -> ato_models.SubmitInnerFunddividerelationResponse:
        """
        Description: 提交分账关系信息
        Summary: 提交分账关系信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_inner_funddividerelation_ex_async(request, headers, runtime)

    def submit_inner_funddividerelation_ex(
        self,
        request: ato_models.SubmitInnerFunddividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerFunddividerelationResponse:
        """
        Description: 提交分账关系信息
        Summary: 提交分账关系信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerFunddividerelationResponse(),
            self.do_request('1.0', 'antchain.ato.inner.funddividerelation.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_inner_funddividerelation_ex_async(
        self,
        request: ato_models.SubmitInnerFunddividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerFunddividerelationResponse:
        """
        Description: 提交分账关系信息
        Summary: 提交分账关系信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerFunddividerelationResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.funddividerelation.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_funddividerelation(
        self,
        request: ato_models.QueryInnerFunddividerelationRequest,
    ) -> ato_models.QueryInnerFunddividerelationResponse:
        """
        Description: 查询分账关系信息
        Summary: 查询分账关系信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_funddividerelation_ex(request, headers, runtime)

    async def query_inner_funddividerelation_async(
        self,
        request: ato_models.QueryInnerFunddividerelationRequest,
    ) -> ato_models.QueryInnerFunddividerelationResponse:
        """
        Description: 查询分账关系信息
        Summary: 查询分账关系信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_funddividerelation_ex_async(request, headers, runtime)

    def query_inner_funddividerelation_ex(
        self,
        request: ato_models.QueryInnerFunddividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerFunddividerelationResponse:
        """
        Description: 查询分账关系信息
        Summary: 查询分账关系信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerFunddividerelationResponse(),
            self.do_request('1.0', 'antchain.ato.inner.funddividerelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_funddividerelation_ex_async(
        self,
        request: ato_models.QueryInnerFunddividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerFunddividerelationResponse:
        """
        Description: 查询分账关系信息
        Summary: 查询分账关系信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerFunddividerelationResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.funddividerelation.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_funddividerelation(
        self,
        request: ato_models.PagequeryInnerFunddividerelationRequest,
    ) -> ato_models.PagequeryInnerFunddividerelationResponse:
        """
        Description: 查询分账关系分页列表
        Summary: 查询分账关系分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_funddividerelation_ex(request, headers, runtime)

    async def pagequery_inner_funddividerelation_async(
        self,
        request: ato_models.PagequeryInnerFunddividerelationRequest,
    ) -> ato_models.PagequeryInnerFunddividerelationResponse:
        """
        Description: 查询分账关系分页列表
        Summary: 查询分账关系分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_funddividerelation_ex_async(request, headers, runtime)

    def pagequery_inner_funddividerelation_ex(
        self,
        request: ato_models.PagequeryInnerFunddividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerFunddividerelationResponse:
        """
        Description: 查询分账关系分页列表
        Summary: 查询分账关系分页列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerFunddividerelationResponse(),
            self.do_request('1.0', 'antchain.ato.inner.funddividerelation.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_funddividerelation_ex_async(
        self,
        request: ato_models.PagequeryInnerFunddividerelationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerFunddividerelationResponse:
        """
        Description: 查询分账关系分页列表
        Summary: 查询分账关系分页列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerFunddividerelationResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.funddividerelation.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_inner_merchantagreement(
        self,
        request: ato_models.CreateInnerMerchantagreementRequest,
    ) -> ato_models.CreateInnerMerchantagreementResponse:
        """
        Description: 保存租户签约信息
        Summary: 保存租户签约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_inner_merchantagreement_ex(request, headers, runtime)

    async def create_inner_merchantagreement_async(
        self,
        request: ato_models.CreateInnerMerchantagreementRequest,
    ) -> ato_models.CreateInnerMerchantagreementResponse:
        """
        Description: 保存租户签约信息
        Summary: 保存租户签约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_inner_merchantagreement_ex_async(request, headers, runtime)

    def create_inner_merchantagreement_ex(
        self,
        request: ato_models.CreateInnerMerchantagreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerMerchantagreementResponse:
        """
        Description: 保存租户签约信息
        Summary: 保存租户签约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerMerchantagreementResponse(),
            self.do_request('1.0', 'antchain.ato.inner.merchantagreement.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_inner_merchantagreement_ex_async(
        self,
        request: ato_models.CreateInnerMerchantagreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerMerchantagreementResponse:
        """
        Description: 保存租户签约信息
        Summary: 保存租户签约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerMerchantagreementResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.merchantagreement.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_merchantagreement(
        self,
        request: ato_models.QueryInnerMerchantagreementRequest,
    ) -> ato_models.QueryInnerMerchantagreementResponse:
        """
        Description: 查询租户签约信息
        Summary: 查询租户签约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_merchantagreement_ex(request, headers, runtime)

    async def query_inner_merchantagreement_async(
        self,
        request: ato_models.QueryInnerMerchantagreementRequest,
    ) -> ato_models.QueryInnerMerchantagreementResponse:
        """
        Description: 查询租户签约信息
        Summary: 查询租户签约信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_merchantagreement_ex_async(request, headers, runtime)

    def query_inner_merchantagreement_ex(
        self,
        request: ato_models.QueryInnerMerchantagreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerMerchantagreementResponse:
        """
        Description: 查询租户签约信息
        Summary: 查询租户签约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerMerchantagreementResponse(),
            self.do_request('1.0', 'antchain.ato.inner.merchantagreement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_merchantagreement_ex_async(
        self,
        request: ato_models.QueryInnerMerchantagreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerMerchantagreementResponse:
        """
        Description: 查询租户签约信息
        Summary: 查询租户签约信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerMerchantagreementResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.merchantagreement.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_merchantagreement(
        self,
        request: ato_models.PagequeryInnerMerchantagreementRequest,
    ) -> ato_models.PagequeryInnerMerchantagreementResponse:
        """
        Description: 查询租户签约协议分页列表
        Summary: 查询租户签约协议分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_merchantagreement_ex(request, headers, runtime)

    async def pagequery_inner_merchantagreement_async(
        self,
        request: ato_models.PagequeryInnerMerchantagreementRequest,
    ) -> ato_models.PagequeryInnerMerchantagreementResponse:
        """
        Description: 查询租户签约协议分页列表
        Summary: 查询租户签约协议分页列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_merchantagreement_ex_async(request, headers, runtime)

    def pagequery_inner_merchantagreement_ex(
        self,
        request: ato_models.PagequeryInnerMerchantagreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerMerchantagreementResponse:
        """
        Description: 查询租户签约协议分页列表
        Summary: 查询租户签约协议分页列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerMerchantagreementResponse(),
            self.do_request('1.0', 'antchain.ato.inner.merchantagreement.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_merchantagreement_ex_async(
        self,
        request: ato_models.PagequeryInnerMerchantagreementRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerMerchantagreementResponse:
        """
        Description: 查询租户签约协议分页列表
        Summary: 查询租户签约协议分页列表
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerMerchantagreementResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.merchantagreement.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_inner_merchantpayexpand(
        self,
        request: ato_models.CreateInnerMerchantpayexpandRequest,
    ) -> ato_models.CreateInnerMerchantpayexpandResponse:
        """
        Description: 保存/编辑进件信息
        Summary: 保存/编辑进件信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_inner_merchantpayexpand_ex(request, headers, runtime)

    async def create_inner_merchantpayexpand_async(
        self,
        request: ato_models.CreateInnerMerchantpayexpandRequest,
    ) -> ato_models.CreateInnerMerchantpayexpandResponse:
        """
        Description: 保存/编辑进件信息
        Summary: 保存/编辑进件信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_inner_merchantpayexpand_ex_async(request, headers, runtime)

    def create_inner_merchantpayexpand_ex(
        self,
        request: ato_models.CreateInnerMerchantpayexpandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerMerchantpayexpandResponse:
        """
        Description: 保存/编辑进件信息
        Summary: 保存/编辑进件信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerMerchantpayexpandResponse(),
            self.do_request('1.0', 'antchain.ato.inner.merchantpayexpand.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_inner_merchantpayexpand_ex_async(
        self,
        request: ato_models.CreateInnerMerchantpayexpandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateInnerMerchantpayexpandResponse:
        """
        Description: 保存/编辑进件信息
        Summary: 保存/编辑进件信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateInnerMerchantpayexpandResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.merchantpayexpand.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def submit_inner_merchantpayexpand(
        self,
        request: ato_models.SubmitInnerMerchantpayexpandRequest,
    ) -> ato_models.SubmitInnerMerchantpayexpandResponse:
        """
        Description: 提交进件信息
        Summary: 提交进件信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.submit_inner_merchantpayexpand_ex(request, headers, runtime)

    async def submit_inner_merchantpayexpand_async(
        self,
        request: ato_models.SubmitInnerMerchantpayexpandRequest,
    ) -> ato_models.SubmitInnerMerchantpayexpandResponse:
        """
        Description: 提交进件信息
        Summary: 提交进件信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.submit_inner_merchantpayexpand_ex_async(request, headers, runtime)

    def submit_inner_merchantpayexpand_ex(
        self,
        request: ato_models.SubmitInnerMerchantpayexpandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerMerchantpayexpandResponse:
        """
        Description: 提交进件信息
        Summary: 提交进件信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerMerchantpayexpandResponse(),
            self.do_request('1.0', 'antchain.ato.inner.merchantpayexpand.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def submit_inner_merchantpayexpand_ex_async(
        self,
        request: ato_models.SubmitInnerMerchantpayexpandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SubmitInnerMerchantpayexpandResponse:
        """
        Description: 提交进件信息
        Summary: 提交进件信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SubmitInnerMerchantpayexpandResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.merchantpayexpand.submit', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_merchantpayexpand(
        self,
        request: ato_models.QueryInnerMerchantpayexpandRequest,
    ) -> ato_models.QueryInnerMerchantpayexpandResponse:
        """
        Description: 查询进件信息
        Summary: 查询进件信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_merchantpayexpand_ex(request, headers, runtime)

    async def query_inner_merchantpayexpand_async(
        self,
        request: ato_models.QueryInnerMerchantpayexpandRequest,
    ) -> ato_models.QueryInnerMerchantpayexpandResponse:
        """
        Description: 查询进件信息
        Summary: 查询进件信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_merchantpayexpand_ex_async(request, headers, runtime)

    def query_inner_merchantpayexpand_ex(
        self,
        request: ato_models.QueryInnerMerchantpayexpandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerMerchantpayexpandResponse:
        """
        Description: 查询进件信息
        Summary: 查询进件信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerMerchantpayexpandResponse(),
            self.do_request('1.0', 'antchain.ato.inner.merchantpayexpand.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_merchantpayexpand_ex_async(
        self,
        request: ato_models.QueryInnerMerchantpayexpandRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerMerchantpayexpandResponse:
        """
        Description: 查询进件信息
        Summary: 查询进件信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerMerchantpayexpandResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.merchantpayexpand.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_merchantagent(
        self,
        request: ato_models.PagequeryInnerMerchantagentRequest,
    ) -> ato_models.PagequeryInnerMerchantagentResponse:
        """
        Description: 查询代理商户分页列表-间连商户使用
        Summary: 查询代理商户分页列表-间连商户使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_merchantagent_ex(request, headers, runtime)

    async def pagequery_inner_merchantagent_async(
        self,
        request: ato_models.PagequeryInnerMerchantagentRequest,
    ) -> ato_models.PagequeryInnerMerchantagentResponse:
        """
        Description: 查询代理商户分页列表-间连商户使用
        Summary: 查询代理商户分页列表-间连商户使用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_merchantagent_ex_async(request, headers, runtime)

    def pagequery_inner_merchantagent_ex(
        self,
        request: ato_models.PagequeryInnerMerchantagentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerMerchantagentResponse:
        """
        Description: 查询代理商户分页列表-间连商户使用
        Summary: 查询代理商户分页列表-间连商户使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerMerchantagentResponse(),
            self.do_request('1.0', 'antchain.ato.inner.merchantagent.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_merchantagent_ex_async(
        self,
        request: ato_models.PagequeryInnerMerchantagentRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerMerchantagentResponse:
        """
        Description: 查询代理商户分页列表-间连商户使用
        Summary: 查询代理商户分页列表-间连商户使用
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerMerchantagentResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.merchantagent.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def clone_inner_templatefileaddress(
        self,
        request: ato_models.CloneInnerTemplatefileaddressRequest,
    ) -> ato_models.CloneInnerTemplatefileaddressResponse:
        """
        Description: 拷贝模板文件，可用于保存模板的入参
        Summary: 拷贝模板文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.clone_inner_templatefileaddress_ex(request, headers, runtime)

    async def clone_inner_templatefileaddress_async(
        self,
        request: ato_models.CloneInnerTemplatefileaddressRequest,
    ) -> ato_models.CloneInnerTemplatefileaddressResponse:
        """
        Description: 拷贝模板文件，可用于保存模板的入参
        Summary: 拷贝模板文件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.clone_inner_templatefileaddress_ex_async(request, headers, runtime)

    def clone_inner_templatefileaddress_ex(
        self,
        request: ato_models.CloneInnerTemplatefileaddressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CloneInnerTemplatefileaddressResponse:
        """
        Description: 拷贝模板文件，可用于保存模板的入参
        Summary: 拷贝模板文件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CloneInnerTemplatefileaddressResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templatefileaddress.clone', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def clone_inner_templatefileaddress_ex_async(
        self,
        request: ato_models.CloneInnerTemplatefileaddressRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CloneInnerTemplatefileaddressResponse:
        """
        Description: 拷贝模板文件，可用于保存模板的入参
        Summary: 拷贝模板文件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CloneInnerTemplatefileaddressResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templatefileaddress.clone', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_signfields(
        self,
        request: ato_models.QueryInnerSignfieldsRequest,
    ) -> ato_models.QueryInnerSignfieldsResponse:
        """
        Description: 查询签署区
        Summary: 查询签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_signfields_ex(request, headers, runtime)

    async def query_inner_signfields_async(
        self,
        request: ato_models.QueryInnerSignfieldsRequest,
    ) -> ato_models.QueryInnerSignfieldsResponse:
        """
        Description: 查询签署区
        Summary: 查询签署区
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_signfields_ex_async(request, headers, runtime)

    def query_inner_signfields_ex(
        self,
        request: ato_models.QueryInnerSignfieldsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerSignfieldsResponse:
        """
        Description: 查询签署区
        Summary: 查询签署区
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerSignfieldsResponse(),
            self.do_request('1.0', 'antchain.ato.inner.signfields.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_signfields_ex_async(
        self,
        request: ato_models.QueryInnerSignfieldsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerSignfieldsResponse:
        """
        Description: 查询签署区
        Summary: 查询签署区
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerSignfieldsResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.signfields.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_inner_template(
        self,
        request: ato_models.SyncInnerTemplateRequest,
    ) -> ato_models.SyncInnerTemplateResponse:
        """
        Description: 同步已发布的模板
        Summary: 同步已发布的模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_inner_template_ex(request, headers, runtime)

    async def sync_inner_template_async(
        self,
        request: ato_models.SyncInnerTemplateRequest,
    ) -> ato_models.SyncInnerTemplateResponse:
        """
        Description: 同步已发布的模板
        Summary: 同步已发布的模板
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_inner_template_ex_async(request, headers, runtime)

    def sync_inner_template_ex(
        self,
        request: ato_models.SyncInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncInnerTemplateResponse:
        """
        Description: 同步已发布的模板
        Summary: 同步已发布的模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_inner_template_ex_async(
        self,
        request: ato_models.SyncInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncInnerTemplateResponse:
        """
        Description: 同步已发布的模板
        Summary: 同步已发布的模板
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_inner_template(
        self,
        request: ato_models.UpdateInnerTemplateRequest,
    ) -> ato_models.UpdateInnerTemplateResponse:
        """
        Description: 更新魔法库模板基本信息
        Summary: 更新魔法库模板基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_inner_template_ex(request, headers, runtime)

    async def update_inner_template_async(
        self,
        request: ato_models.UpdateInnerTemplateRequest,
    ) -> ato_models.UpdateInnerTemplateResponse:
        """
        Description: 更新魔法库模板基本信息
        Summary: 更新魔法库模板基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_inner_template_ex_async(request, headers, runtime)

    def update_inner_template_ex(
        self,
        request: ato_models.UpdateInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateInnerTemplateResponse:
        """
        Description: 更新魔法库模板基本信息
        Summary: 更新魔法库模板基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_inner_template_ex_async(
        self,
        request: ato_models.UpdateInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateInnerTemplateResponse:
        """
        Description: 更新魔法库模板基本信息
        Summary: 更新魔法库模板基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_template(
        self,
        request: ato_models.QueryInnerTemplateRequest,
    ) -> ato_models.QueryInnerTemplateResponse:
        """
        Description: 通过模板code更新模板的基本信息，比如模板名称等
        Summary: 查询模板的基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_template_ex(request, headers, runtime)

    async def query_inner_template_async(
        self,
        request: ato_models.QueryInnerTemplateRequest,
    ) -> ato_models.QueryInnerTemplateResponse:
        """
        Description: 通过模板code更新模板的基本信息，比如模板名称等
        Summary: 查询模板的基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_template_ex_async(request, headers, runtime)

    def query_inner_template_ex(
        self,
        request: ato_models.QueryInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTemplateResponse:
        """
        Description: 通过模板code更新模板的基本信息，比如模板名称等
        Summary: 查询模板的基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.inner.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_template_ex_async(
        self,
        request: ato_models.QueryInnerTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTemplateResponse:
        """
        Description: 通过模板code更新模板的基本信息，比如模板名称等
        Summary: 查询模板的基本信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.template.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_templateelementlink(
        self,
        request: ato_models.QueryInnerTemplateelementlinkRequest,
    ) -> ato_models.QueryInnerTemplateelementlinkResponse:
        """
        Description: 获取模板关联的元素列表信息，包括组件信息
        Summary: 获取模板关联的元素列表信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_templateelementlink_ex(request, headers, runtime)

    async def query_inner_templateelementlink_async(
        self,
        request: ato_models.QueryInnerTemplateelementlinkRequest,
    ) -> ato_models.QueryInnerTemplateelementlinkResponse:
        """
        Description: 获取模板关联的元素列表信息，包括组件信息
        Summary: 获取模板关联的元素列表信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_templateelementlink_ex_async(request, headers, runtime)

    def query_inner_templateelementlink_ex(
        self,
        request: ato_models.QueryInnerTemplateelementlinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTemplateelementlinkResponse:
        """
        Description: 获取模板关联的元素列表信息，包括组件信息
        Summary: 获取模板关联的元素列表信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTemplateelementlinkResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templateelementlink.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_templateelementlink_ex_async(
        self,
        request: ato_models.QueryInnerTemplateelementlinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTemplateelementlinkResponse:
        """
        Description: 获取模板关联的元素列表信息，包括组件信息
        Summary: 获取模板关联的元素列表信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTemplateelementlinkResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templateelementlink.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_inner_templateversion(
        self,
        request: ato_models.QueryInnerTemplateversionRequest,
    ) -> ato_models.QueryInnerTemplateversionResponse:
        """
        Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
        Summary: 查询模板的版本详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_inner_templateversion_ex(request, headers, runtime)

    async def query_inner_templateversion_async(
        self,
        request: ato_models.QueryInnerTemplateversionRequest,
    ) -> ato_models.QueryInnerTemplateversionResponse:
        """
        Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
        Summary: 查询模板的版本详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_inner_templateversion_ex_async(request, headers, runtime)

    def query_inner_templateversion_ex(
        self,
        request: ato_models.QueryInnerTemplateversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTemplateversionResponse:
        """
        Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
        Summary: 查询模板的版本详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTemplateversionResponse(),
            self.do_request('1.0', 'antchain.ato.inner.templateversion.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_inner_templateversion_ex_async(
        self,
        request: ato_models.QueryInnerTemplateversionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryInnerTemplateversionResponse:
        """
        Description: 通过模板code、模板版本号获取模板某个版本的详情信息，包括id、文件地址等
        Summary: 查询模板的版本详情
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryInnerTemplateversionResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.templateversion.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_inner_ordermsg(
        self,
        request: ato_models.PagequeryInnerOrdermsgRequest,
    ) -> ato_models.PagequeryInnerOrdermsgResponse:
        """
        Description: 订单消息查询
        Summary: 订单消息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_inner_ordermsg_ex(request, headers, runtime)

    async def pagequery_inner_ordermsg_async(
        self,
        request: ato_models.PagequeryInnerOrdermsgRequest,
    ) -> ato_models.PagequeryInnerOrdermsgResponse:
        """
        Description: 订单消息查询
        Summary: 订单消息查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_inner_ordermsg_ex_async(request, headers, runtime)

    def pagequery_inner_ordermsg_ex(
        self,
        request: ato_models.PagequeryInnerOrdermsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerOrdermsgResponse:
        """
        Description: 订单消息查询
        Summary: 订单消息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerOrdermsgResponse(),
            self.do_request('1.0', 'antchain.ato.inner.ordermsg.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_inner_ordermsg_ex_async(
        self,
        request: ato_models.PagequeryInnerOrdermsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.PagequeryInnerOrdermsgResponse:
        """
        Description: 订单消息查询
        Summary: 订单消息查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.PagequeryInnerOrdermsgResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.ordermsg.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_inner_ordermsg(
        self,
        request: ato_models.RetryInnerOrdermsgRequest,
    ) -> ato_models.RetryInnerOrdermsgResponse:
        """
        Description: 订单消息重试
        Summary: 订单消息重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_inner_ordermsg_ex(request, headers, runtime)

    async def retry_inner_ordermsg_async(
        self,
        request: ato_models.RetryInnerOrdermsgRequest,
    ) -> ato_models.RetryInnerOrdermsgResponse:
        """
        Description: 订单消息重试
        Summary: 订单消息重试
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_inner_ordermsg_ex_async(request, headers, runtime)

    def retry_inner_ordermsg_ex(
        self,
        request: ato_models.RetryInnerOrdermsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RetryInnerOrdermsgResponse:
        """
        Description: 订单消息重试
        Summary: 订单消息重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RetryInnerOrdermsgResponse(),
            self.do_request('1.0', 'antchain.ato.inner.ordermsg.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_inner_ordermsg_ex_async(
        self,
        request: ato_models.RetryInnerOrdermsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RetryInnerOrdermsgResponse:
        """
        Description: 订单消息重试
        Summary: 订单消息重试
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RetryInnerOrdermsgResponse(),
            await self.do_request_async('1.0', 'antchain.ato.inner.ordermsg.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def register_merchantexpand_merchant(
        self,
        request: ato_models.RegisterMerchantexpandMerchantRequest,
    ) -> ato_models.RegisterMerchantexpandMerchantResponse:
        """
        Description: 商户入驻
        Summary: 商户入驻
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.register_merchantexpand_merchant_ex(request, headers, runtime)

    async def register_merchantexpand_merchant_async(
        self,
        request: ato_models.RegisterMerchantexpandMerchantRequest,
    ) -> ato_models.RegisterMerchantexpandMerchantResponse:
        """
        Description: 商户入驻
        Summary: 商户入驻
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.register_merchantexpand_merchant_ex_async(request, headers, runtime)

    def register_merchantexpand_merchant_ex(
        self,
        request: ato_models.RegisterMerchantexpandMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RegisterMerchantexpandMerchantResponse:
        """
        Description: 商户入驻
        Summary: 商户入驻
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RegisterMerchantexpandMerchantResponse(),
            self.do_request('1.0', 'antchain.ato.merchantexpand.merchant.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def register_merchantexpand_merchant_ex_async(
        self,
        request: ato_models.RegisterMerchantexpandMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.RegisterMerchantexpandMerchantResponse:
        """
        Description: 商户入驻
        Summary: 商户入驻
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.RegisterMerchantexpandMerchantResponse(),
            await self.do_request_async('1.0', 'antchain.ato.merchantexpand.merchant.register', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_merchantexpand_file(
        self,
        request: ato_models.UploadMerchantexpandFileRequest,
    ) -> ato_models.UploadMerchantexpandFileResponse:
        """
        Description: 获取临时上传文件链接
        Summary: 获取临时上传文件链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_merchantexpand_file_ex(request, headers, runtime)

    async def upload_merchantexpand_file_async(
        self,
        request: ato_models.UploadMerchantexpandFileRequest,
    ) -> ato_models.UploadMerchantexpandFileResponse:
        """
        Description: 获取临时上传文件链接
        Summary: 获取临时上传文件链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_merchantexpand_file_ex_async(request, headers, runtime)

    def upload_merchantexpand_file_ex(
        self,
        request: ato_models.UploadMerchantexpandFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadMerchantexpandFileResponse:
        """
        Description: 获取临时上传文件链接
        Summary: 获取临时上传文件链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadMerchantexpandFileResponse(),
            self.do_request('1.0', 'antchain.ato.merchantexpand.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_merchantexpand_file_ex_async(
        self,
        request: ato_models.UploadMerchantexpandFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadMerchantexpandFileResponse:
        """
        Description: 获取临时上传文件链接
        Summary: 获取临时上传文件链接
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadMerchantexpandFileResponse(),
            await self.do_request_async('1.0', 'antchain.ato.merchantexpand.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_merchantexpand_merchant(
        self,
        request: ato_models.QueryMerchantexpandMerchantRequest,
    ) -> ato_models.QueryMerchantexpandMerchantResponse:
        """
        Description: 商户入驻查询
        Summary: 商户入驻查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_merchantexpand_merchant_ex(request, headers, runtime)

    async def query_merchantexpand_merchant_async(
        self,
        request: ato_models.QueryMerchantexpandMerchantRequest,
    ) -> ato_models.QueryMerchantexpandMerchantResponse:
        """
        Description: 商户入驻查询
        Summary: 商户入驻查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_merchantexpand_merchant_ex_async(request, headers, runtime)

    def query_merchantexpand_merchant_ex(
        self,
        request: ato_models.QueryMerchantexpandMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryMerchantexpandMerchantResponse:
        """
        Description: 商户入驻查询
        Summary: 商户入驻查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryMerchantexpandMerchantResponse(),
            self.do_request('1.0', 'antchain.ato.merchantexpand.merchant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_merchantexpand_merchant_ex_async(
        self,
        request: ato_models.QueryMerchantexpandMerchantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryMerchantexpandMerchantResponse:
        """
        Description: 商户入驻查询
        Summary: 商户入驻查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryMerchantexpandMerchantResponse(),
            await self.do_request_async('1.0', 'antchain.ato.merchantexpand.merchant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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

    def query_risk(
        self,
        request: ato_models.QueryRiskRequest,
    ) -> ato_models.QueryRiskResponse:
        """
        Description: 发起风控分析，获取风险分
        Summary: 发起风控分析，获取风险分
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_risk_ex(request, headers, runtime)

    async def query_risk_async(
        self,
        request: ato_models.QueryRiskRequest,
    ) -> ato_models.QueryRiskResponse:
        """
        Description: 发起风控分析，获取风险分
        Summary: 发起风控分析，获取风险分
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_risk_ex_async(request, headers, runtime)

    def query_risk_ex(
        self,
        request: ato_models.QueryRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryRiskResponse:
        """
        Description: 发起风控分析，获取风险分
        Summary: 发起风控分析，获取风险分
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryRiskResponse(),
            self.do_request('1.0', 'antchain.ato.risk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_risk_ex_async(
        self,
        request: ato_models.QueryRiskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryRiskResponse:
        """
        Description: 发起风控分析，获取风险分
        Summary: 发起风控分析，获取风险分
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryRiskResponse(),
            await self.do_request_async('1.0', 'antchain.ato.risk.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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

    def upload_sign_template(
        self,
        request: ato_models.UploadSignTemplateRequest,
    ) -> ato_models.UploadSignTemplateResponse:
        """
        Description: 商户合同模板上传接口
        Summary: 商户合同模板上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_sign_template_ex(request, headers, runtime)

    async def upload_sign_template_async(
        self,
        request: ato_models.UploadSignTemplateRequest,
    ) -> ato_models.UploadSignTemplateResponse:
        """
        Description: 商户合同模板上传接口
        Summary: 商户合同模板上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_sign_template_ex_async(request, headers, runtime)

    def upload_sign_template_ex(
        self,
        request: ato_models.UploadSignTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadSignTemplateResponse:
        """
        Description: 商户合同模板上传接口
        Summary: 商户合同模板上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ato_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.ato.sign.template.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_sign_template_response = ato_models.UploadSignTemplateResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_sign_template_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadSignTemplateResponse(),
            self.do_request('1.0', 'antchain.ato.sign.template.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_sign_template_ex_async(
        self,
        request: ato_models.UploadSignTemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadSignTemplateResponse:
        """
        Description: 商户合同模板上传接口
        Summary: 商户合同模板上传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = ato_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antchain.ato.sign.template.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_sign_template_response = ato_models.UploadSignTemplateResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_sign_template_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadSignTemplateResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.template.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def upload_sign_credit(
        self,
        request: ato_models.UploadSignCreditRequest,
    ) -> ato_models.UploadSignCreditResponse:
        """
        Description: 商户资产凭证上传，可以是文本或文件
        Summary: 商户资产凭证上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_sign_credit_ex(request, headers, runtime)

    async def upload_sign_credit_async(
        self,
        request: ato_models.UploadSignCreditRequest,
    ) -> ato_models.UploadSignCreditResponse:
        """
        Description: 商户资产凭证上传，可以是文本或文件
        Summary: 商户资产凭证上传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_sign_credit_ex_async(request, headers, runtime)

    def upload_sign_credit_ex(
        self,
        request: ato_models.UploadSignCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadSignCreditResponse:
        """
        Description: 商户资产凭证上传，可以是文本或文件
        Summary: 商户资产凭证上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadSignCreditResponse(),
            self.do_request('1.0', 'antchain.ato.sign.credit.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_sign_credit_ex_async(
        self,
        request: ato_models.UploadSignCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UploadSignCreditResponse:
        """
        Description: 商户资产凭证上传，可以是文本或文件
        Summary: 商户资产凭证上传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UploadSignCreditResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.credit.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sign_credit(
        self,
        request: ato_models.QuerySignCreditRequest,
    ) -> ato_models.QuerySignCreditResponse:
        """
        Description: 商户资产凭证查询，需要提供订单号或资产包号
        Summary: 商户资产凭证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sign_credit_ex(request, headers, runtime)

    async def query_sign_credit_async(
        self,
        request: ato_models.QuerySignCreditRequest,
    ) -> ato_models.QuerySignCreditResponse:
        """
        Description: 商户资产凭证查询，需要提供订单号或资产包号
        Summary: 商户资产凭证查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sign_credit_ex_async(request, headers, runtime)

    def query_sign_credit_ex(
        self,
        request: ato_models.QuerySignCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QuerySignCreditResponse:
        """
        Description: 商户资产凭证查询，需要提供订单号或资产包号
        Summary: 商户资产凭证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QuerySignCreditResponse(),
            self.do_request('1.0', 'antchain.ato.sign.credit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sign_credit_ex_async(
        self,
        request: ato_models.QuerySignCreditRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QuerySignCreditResponse:
        """
        Description: 商户资产凭证查询，需要提供订单号或资产包号
        Summary: 商户资产凭证查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QuerySignCreditResponse(),
            await self.do_request_async('1.0', 'antchain.ato.sign.credit.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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

    def update_trade_userpromise(
        self,
        request: ato_models.UpdateTradeUserpromiseRequest,
    ) -> ato_models.UpdateTradeUserpromiseResponse:
        """
        Description: 商户调用，修改订单的用户还款承诺
        Summary: 用户还款承诺信息修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_trade_userpromise_ex(request, headers, runtime)

    async def update_trade_userpromise_async(
        self,
        request: ato_models.UpdateTradeUserpromiseRequest,
    ) -> ato_models.UpdateTradeUserpromiseResponse:
        """
        Description: 商户调用，修改订单的用户还款承诺
        Summary: 用户还款承诺信息修改
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_trade_userpromise_ex_async(request, headers, runtime)

    def update_trade_userpromise_ex(
        self,
        request: ato_models.UpdateTradeUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateTradeUserpromiseResponse:
        """
        Description: 商户调用，修改订单的用户还款承诺
        Summary: 用户还款承诺信息修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateTradeUserpromiseResponse(),
            self.do_request('1.0', 'antchain.ato.trade.userpromise.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_trade_userpromise_ex_async(
        self,
        request: ato_models.UpdateTradeUserpromiseRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.UpdateTradeUserpromiseResponse:
        """
        Description: 商户调用，修改订单的用户还款承诺
        Summary: 用户还款承诺信息修改
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.UpdateTradeUserpromiseResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.userpromise.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_front_indirectorder(
        self,
        request: ato_models.SyncFrontIndirectorderRequest,
    ) -> ato_models.SyncFrontIndirectorderResponse:
        """
        Description: 前置签署间联模式订单进件
        Summary: 前置签署间联模式订单进件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_front_indirectorder_ex(request, headers, runtime)

    async def sync_front_indirectorder_async(
        self,
        request: ato_models.SyncFrontIndirectorderRequest,
    ) -> ato_models.SyncFrontIndirectorderResponse:
        """
        Description: 前置签署间联模式订单进件
        Summary: 前置签署间联模式订单进件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_front_indirectorder_ex_async(request, headers, runtime)

    def sync_front_indirectorder_ex(
        self,
        request: ato_models.SyncFrontIndirectorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFrontIndirectorderResponse:
        """
        Description: 前置签署间联模式订单进件
        Summary: 前置签署间联模式订单进件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFrontIndirectorderResponse(),
            self.do_request('1.0', 'antchain.ato.front.indirectorder.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_front_indirectorder_ex_async(
        self,
        request: ato_models.SyncFrontIndirectorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncFrontIndirectorderResponse:
        """
        Description: 前置签署间联模式订单进件
        Summary: 前置签署间联模式订单进件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncFrontIndirectorderResponse(),
            await self.do_request_async('1.0', 'antchain.ato.front.indirectorder.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_trade_indirectorder(
        self,
        request: ato_models.SyncTradeIndirectorderRequest,
    ) -> ato_models.SyncTradeIndirectorderResponse:
        """
        Description: 间联模式-后置模式订单进件
        Summary: 间联模式-后置模式订单进件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_trade_indirectorder_ex(request, headers, runtime)

    async def sync_trade_indirectorder_async(
        self,
        request: ato_models.SyncTradeIndirectorderRequest,
    ) -> ato_models.SyncTradeIndirectorderResponse:
        """
        Description: 间联模式-后置模式订单进件
        Summary: 间联模式-后置模式订单进件
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_trade_indirectorder_ex_async(request, headers, runtime)

    def sync_trade_indirectorder_ex(
        self,
        request: ato_models.SyncTradeIndirectorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncTradeIndirectorderResponse:
        """
        Description: 间联模式-后置模式订单进件
        Summary: 间联模式-后置模式订单进件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncTradeIndirectorderResponse(),
            self.do_request('1.0', 'antchain.ato.trade.indirectorder.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_trade_indirectorder_ex_async(
        self,
        request: ato_models.SyncTradeIndirectorderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.SyncTradeIndirectorderResponse:
        """
        Description: 间联模式-后置模式订单进件
        Summary: 间联模式-后置模式订单进件
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.SyncTradeIndirectorderResponse(),
            await self.do_request_async('1.0', 'antchain.ato.trade.indirectorder.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_withhold_sign(
        self,
        request: ato_models.CreateWithholdSignRequest,
    ) -> ato_models.CreateWithholdSignResponse:
        """
        Description: 代扣签约创建
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
        Description: 代扣签约创建
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
        Description: 代扣签约创建
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
        Description: 代扣签约创建
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
        Description: 重要说明：
        1. 这个接口是取消订单某一期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
        2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
        Summary: 单期代扣取消
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.repay_withhold_plan_ex(request, headers, runtime)

    async def repay_withhold_plan_async(
        self,
        request: ato_models.RepayWithholdPlanRequest,
    ) -> ato_models.RepayWithholdPlanResponse:
        """
        Description: 重要说明：
        1. 这个接口是取消订单某一期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
        2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
        Summary: 单期代扣取消
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
        Description: 重要说明：
        1. 这个接口是取消订单某一期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
        2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
        Summary: 单期代扣取消
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
        Description: 重要说明：
        1. 这个接口是取消订单某一期代扣计划中以其他方式还款的金额，取消之后代扣不再执行该期计划。
        2. 对通过其他方式还款的第三方单号留存;例如：银行流水号或微信流水号。
        Summary: 单期代扣取消
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

    def create_withhold_refund(
        self,
        request: ato_models.CreateWithholdRefundRequest,
    ) -> ato_models.CreateWithholdRefundResponse:
        """
        Description: 创建退款请求
        Summary: 创建退款申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_withhold_refund_ex(request, headers, runtime)

    async def create_withhold_refund_async(
        self,
        request: ato_models.CreateWithholdRefundRequest,
    ) -> ato_models.CreateWithholdRefundResponse:
        """
        Description: 创建退款请求
        Summary: 创建退款申请
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_withhold_refund_ex_async(request, headers, runtime)

    def create_withhold_refund_ex(
        self,
        request: ato_models.CreateWithholdRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateWithholdRefundResponse:
        """
        Description: 创建退款请求
        Summary: 创建退款申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateWithholdRefundResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.refund.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_withhold_refund_ex_async(
        self,
        request: ato_models.CreateWithholdRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.CreateWithholdRefundResponse:
        """
        Description: 创建退款请求
        Summary: 创建退款申请
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.CreateWithholdRefundResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.refund.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_withhold_refund(
        self,
        request: ato_models.QueryWithholdRefundRequest,
    ) -> ato_models.QueryWithholdRefundResponse:
        """
        Description: 退款申请结果查询
        Summary: 退款申请结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_withhold_refund_ex(request, headers, runtime)

    async def query_withhold_refund_async(
        self,
        request: ato_models.QueryWithholdRefundRequest,
    ) -> ato_models.QueryWithholdRefundResponse:
        """
        Description: 退款申请结果查询
        Summary: 退款申请结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_withhold_refund_ex_async(request, headers, runtime)

    def query_withhold_refund_ex(
        self,
        request: ato_models.QueryWithholdRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryWithholdRefundResponse:
        """
        Description: 退款申请结果查询
        Summary: 退款申请结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryWithholdRefundResponse(),
            self.do_request('1.0', 'antchain.ato.withhold.refund.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_withhold_refund_ex_async(
        self,
        request: ato_models.QueryWithholdRefundRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> ato_models.QueryWithholdRefundResponse:
        """
        Description: 退款申请结果查询
        Summary: 退款申请结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            ato_models.QueryWithholdRefundResponse(),
            await self.do_request_async('1.0', 'antchain.ato.withhold.refund.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
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
