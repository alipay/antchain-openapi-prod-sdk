# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_nftx import models as nftx_models
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
        config: nftx_models.Config,
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
            # nft发行的文件
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
                    'sdk_version': '1.4.0'
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
            # nft发行的文件
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
                    'sdk_version': '1.4.0'
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

    def import_nft_create(
        self,
        request: nftx_models.ImportNftCreateRequest,
    ) -> nftx_models.ImportNftCreateResponse:
        """
        Description: B端商户的NFT发行以及铸造
        Summary: B端商户的NFT铸造 (废弃)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_nft_create_ex(request, headers, runtime)

    async def import_nft_create_async(
        self,
        request: nftx_models.ImportNftCreateRequest,
    ) -> nftx_models.ImportNftCreateResponse:
        """
        Description: B端商户的NFT发行以及铸造
        Summary: B端商户的NFT铸造 (废弃)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_nft_create_ex_async(request, headers, runtime)

    def import_nft_create_ex(
        self,
        request: nftx_models.ImportNftCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.ImportNftCreateResponse:
        """
        Description: B端商户的NFT发行以及铸造
        Summary: B端商户的NFT铸造 (废弃)
        """
        UtilClient.validate_model(request)
        return nftx_models.ImportNftCreateResponse().from_map(
            self.do_request('1.0', 'antchain.nftx.nft.create.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_nft_create_ex_async(
        self,
        request: nftx_models.ImportNftCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.ImportNftCreateResponse:
        """
        Description: B端商户的NFT发行以及铸造
        Summary: B端商户的NFT铸造 (废弃)
        """
        UtilClient.validate_model(request)
        return nftx_models.ImportNftCreateResponse().from_map(
            await self.do_request_async('1.0', 'antchain.nftx.nft.create.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_nft_create(
        self,
        request: nftx_models.QueryNftCreateRequest,
    ) -> nftx_models.QueryNftCreateResponse:
        """
        Description: B端商户的NFT发行后查询，包含状态、NFT商品的概要信息
        Summary: B端商户的NFT发行铸造后查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_nft_create_ex(request, headers, runtime)

    async def query_nft_create_async(
        self,
        request: nftx_models.QueryNftCreateRequest,
    ) -> nftx_models.QueryNftCreateResponse:
        """
        Description: B端商户的NFT发行后查询，包含状态、NFT商品的概要信息
        Summary: B端商户的NFT发行铸造后查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_nft_create_ex_async(request, headers, runtime)

    def query_nft_create_ex(
        self,
        request: nftx_models.QueryNftCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.QueryNftCreateResponse:
        """
        Description: B端商户的NFT发行后查询，包含状态、NFT商品的概要信息
        Summary: B端商户的NFT发行铸造后查询
        """
        UtilClient.validate_model(request)
        return nftx_models.QueryNftCreateResponse().from_map(
            self.do_request('1.0', 'antchain.nftx.nft.create.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_nft_create_ex_async(
        self,
        request: nftx_models.QueryNftCreateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.QueryNftCreateResponse:
        """
        Description: B端商户的NFT发行后查询，包含状态、NFT商品的概要信息
        Summary: B端商户的NFT发行铸造后查询
        """
        UtilClient.validate_model(request)
        return nftx_models.QueryNftCreateResponse().from_map(
            await self.do_request_async('1.0', 'antchain.nftx.nft.create.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_nft_transfer(
        self,
        request: nftx_models.ExecNftTransferRequest,
    ) -> nftx_models.ExecNftTransferResponse:
        """
        Description: 按商品编码（skuid）B2C发放NFT
        Summary: 按商品编码B2C发放NFT
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_nft_transfer_ex(request, headers, runtime)

    async def exec_nft_transfer_async(
        self,
        request: nftx_models.ExecNftTransferRequest,
    ) -> nftx_models.ExecNftTransferResponse:
        """
        Description: 按商品编码（skuid）B2C发放NFT
        Summary: 按商品编码B2C发放NFT
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_nft_transfer_ex_async(request, headers, runtime)

    def exec_nft_transfer_ex(
        self,
        request: nftx_models.ExecNftTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.ExecNftTransferResponse:
        """
        Description: 按商品编码（skuid）B2C发放NFT
        Summary: 按商品编码B2C发放NFT
        """
        UtilClient.validate_model(request)
        return nftx_models.ExecNftTransferResponse().from_map(
            self.do_request('1.0', 'antchain.nftx.nft.transfer.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_nft_transfer_ex_async(
        self,
        request: nftx_models.ExecNftTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.ExecNftTransferResponse:
        """
        Description: 按商品编码（skuid）B2C发放NFT
        Summary: 按商品编码B2C发放NFT
        """
        UtilClient.validate_model(request)
        return nftx_models.ExecNftTransferResponse().from_map(
            await self.do_request_async('1.0', 'antchain.nftx.nft.transfer.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_nft_transfer(
        self,
        request: nftx_models.SendNftTransferRequest,
    ) -> nftx_models.SendNftTransferResponse:
        """
        Description: 按项目表编码B2C发放NFT
        Summary: 按项目表编码B2C发放NFT
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_nft_transfer_ex(request, headers, runtime)

    async def send_nft_transfer_async(
        self,
        request: nftx_models.SendNftTransferRequest,
    ) -> nftx_models.SendNftTransferResponse:
        """
        Description: 按项目表编码B2C发放NFT
        Summary: 按项目表编码B2C发放NFT
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_nft_transfer_ex_async(request, headers, runtime)

    def send_nft_transfer_ex(
        self,
        request: nftx_models.SendNftTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.SendNftTransferResponse:
        """
        Description: 按项目表编码B2C发放NFT
        Summary: 按项目表编码B2C发放NFT
        """
        UtilClient.validate_model(request)
        return nftx_models.SendNftTransferResponse().from_map(
            self.do_request('1.0', 'antchain.nftx.nft.transfer.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_nft_transfer_ex_async(
        self,
        request: nftx_models.SendNftTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.SendNftTransferResponse:
        """
        Description: 按项目表编码B2C发放NFT
        Summary: 按项目表编码B2C发放NFT
        """
        UtilClient.validate_model(request)
        return nftx_models.SendNftTransferResponse().from_map(
            await self.do_request_async('1.0', 'antchain.nftx.nft.transfer.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_nft_customer(
        self,
        request: nftx_models.QueryNftCustomerRequest,
    ) -> nftx_models.QueryNftCustomerResponse:
        """
        Description: 根据nftId查询客户NFT资产
        Summary: 根据nftId查询客户NFT资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_nft_customer_ex(request, headers, runtime)

    async def query_nft_customer_async(
        self,
        request: nftx_models.QueryNftCustomerRequest,
    ) -> nftx_models.QueryNftCustomerResponse:
        """
        Description: 根据nftId查询客户NFT资产
        Summary: 根据nftId查询客户NFT资产
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_nft_customer_ex_async(request, headers, runtime)

    def query_nft_customer_ex(
        self,
        request: nftx_models.QueryNftCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.QueryNftCustomerResponse:
        """
        Description: 根据nftId查询客户NFT资产
        Summary: 根据nftId查询客户NFT资产
        """
        UtilClient.validate_model(request)
        return nftx_models.QueryNftCustomerResponse().from_map(
            self.do_request('1.0', 'antchain.nftx.nft.customer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_nft_customer_ex_async(
        self,
        request: nftx_models.QueryNftCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.QueryNftCustomerResponse:
        """
        Description: 根据nftId查询客户NFT资产
        Summary: 根据nftId查询客户NFT资产
        """
        UtilClient.validate_model(request)
        return nftx_models.QueryNftCustomerResponse().from_map(
            await self.do_request_async('1.0', 'antchain.nftx.nft.customer.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_nft_order(
        self,
        request: nftx_models.QueryNftOrderRequest,
    ) -> nftx_models.QueryNftOrderResponse:
        """
        Description: 根据外部订单号查询该订单的NFT流水记录
        Summary: 根据外部订单号查询该订单的NFT流水记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_nft_order_ex(request, headers, runtime)

    async def query_nft_order_async(
        self,
        request: nftx_models.QueryNftOrderRequest,
    ) -> nftx_models.QueryNftOrderResponse:
        """
        Description: 根据外部订单号查询该订单的NFT流水记录
        Summary: 根据外部订单号查询该订单的NFT流水记录
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_nft_order_ex_async(request, headers, runtime)

    def query_nft_order_ex(
        self,
        request: nftx_models.QueryNftOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.QueryNftOrderResponse:
        """
        Description: 根据外部订单号查询该订单的NFT流水记录
        Summary: 根据外部订单号查询该订单的NFT流水记录
        """
        UtilClient.validate_model(request)
        return nftx_models.QueryNftOrderResponse().from_map(
            self.do_request('1.0', 'antchain.nftx.nft.order.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_nft_order_ex_async(
        self,
        request: nftx_models.QueryNftOrderRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.QueryNftOrderResponse:
        """
        Description: 根据外部订单号查询该订单的NFT流水记录
        Summary: 根据外部订单号查询该订单的NFT流水记录
        """
        UtilClient.validate_model(request)
        return nftx_models.QueryNftOrderResponse().from_map(
            await self.do_request_async('1.0', 'antchain.nftx.nft.order.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_nft_issuer(
        self,
        request: nftx_models.CreateNftIssuerRequest,
    ) -> nftx_models.CreateNftIssuerResponse:
        """
        Description: NFT发行审核&铸造
        Summary: NFT发行审核&铸造
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_nft_issuer_ex(request, headers, runtime)

    async def create_nft_issuer_async(
        self,
        request: nftx_models.CreateNftIssuerRequest,
    ) -> nftx_models.CreateNftIssuerResponse:
        """
        Description: NFT发行审核&铸造
        Summary: NFT发行审核&铸造
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_nft_issuer_ex_async(request, headers, runtime)

    def create_nft_issuer_ex(
        self,
        request: nftx_models.CreateNftIssuerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.CreateNftIssuerResponse:
        """
        Description: NFT发行审核&铸造
        Summary: NFT发行审核&铸造
        """
        UtilClient.validate_model(request)
        return nftx_models.CreateNftIssuerResponse().from_map(
            self.do_request('1.0', 'antchain.nftx.nft.issuer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_nft_issuer_ex_async(
        self,
        request: nftx_models.CreateNftIssuerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.CreateNftIssuerResponse:
        """
        Description: NFT发行审核&铸造
        Summary: NFT发行审核&铸造
        """
        UtilClient.validate_model(request)
        return nftx_models.CreateNftIssuerResponse().from_map(
            await self.do_request_async('1.0', 'antchain.nftx.nft.issuer.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pagequery_nft_customer(
        self,
        request: nftx_models.PagequeryNftCustomerRequest,
    ) -> nftx_models.PagequeryNftCustomerResponse:
        """
        Description: B端用户资产列表查询
        Summary: 用户资产列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pagequery_nft_customer_ex(request, headers, runtime)

    async def pagequery_nft_customer_async(
        self,
        request: nftx_models.PagequeryNftCustomerRequest,
    ) -> nftx_models.PagequeryNftCustomerResponse:
        """
        Description: B端用户资产列表查询
        Summary: 用户资产列表查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pagequery_nft_customer_ex_async(request, headers, runtime)

    def pagequery_nft_customer_ex(
        self,
        request: nftx_models.PagequeryNftCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.PagequeryNftCustomerResponse:
        """
        Description: B端用户资产列表查询
        Summary: 用户资产列表查询
        """
        UtilClient.validate_model(request)
        return nftx_models.PagequeryNftCustomerResponse().from_map(
            self.do_request('1.0', 'antchain.nftx.nft.customer.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pagequery_nft_customer_ex_async(
        self,
        request: nftx_models.PagequeryNftCustomerRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.PagequeryNftCustomerResponse:
        """
        Description: B端用户资产列表查询
        Summary: 用户资产列表查询
        """
        UtilClient.validate_model(request)
        return nftx_models.PagequeryNftCustomerResponse().from_map(
            await self.do_request_async('1.0', 'antchain.nftx.nft.customer.pagequery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_nft_publish(
        self,
        request: nftx_models.CreateNftPublishRequest,
    ) -> nftx_models.CreateNftPublishResponse:
        """
        Description: NFT铸造, 带监制方和渠道租户
        Summary: NFT铸造, 带监制方和渠道租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_nft_publish_ex(request, headers, runtime)

    async def create_nft_publish_async(
        self,
        request: nftx_models.CreateNftPublishRequest,
    ) -> nftx_models.CreateNftPublishResponse:
        """
        Description: NFT铸造, 带监制方和渠道租户
        Summary: NFT铸造, 带监制方和渠道租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_nft_publish_ex_async(request, headers, runtime)

    def create_nft_publish_ex(
        self,
        request: nftx_models.CreateNftPublishRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.CreateNftPublishResponse:
        """
        Description: NFT铸造, 带监制方和渠道租户
        Summary: NFT铸造, 带监制方和渠道租户
        """
        UtilClient.validate_model(request)
        return nftx_models.CreateNftPublishResponse().from_map(
            self.do_request('1.0', 'antchain.nftx.nft.publish.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_nft_publish_ex_async(
        self,
        request: nftx_models.CreateNftPublishRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.CreateNftPublishResponse:
        """
        Description: NFT铸造, 带监制方和渠道租户
        Summary: NFT铸造, 带监制方和渠道租户
        """
        UtilClient.validate_model(request)
        return nftx_models.CreateNftPublishResponse().from_map(
            await self.do_request_async('1.0', 'antchain.nftx.nft.publish.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def run_nft_transfer(
        self,
        request: nftx_models.RunNftTransferRequest,
    ) -> nftx_models.RunNftTransferResponse:
        """
        Description: 按项目表编码B2C发放NFT,带渠道租户
        Summary: 按项目表编码B2C发放NFT, (废弃)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.run_nft_transfer_ex(request, headers, runtime)

    async def run_nft_transfer_async(
        self,
        request: nftx_models.RunNftTransferRequest,
    ) -> nftx_models.RunNftTransferResponse:
        """
        Description: 按项目表编码B2C发放NFT,带渠道租户
        Summary: 按项目表编码B2C发放NFT, (废弃)
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.run_nft_transfer_ex_async(request, headers, runtime)

    def run_nft_transfer_ex(
        self,
        request: nftx_models.RunNftTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.RunNftTransferResponse:
        """
        Description: 按项目表编码B2C发放NFT,带渠道租户
        Summary: 按项目表编码B2C发放NFT, (废弃)
        """
        UtilClient.validate_model(request)
        return nftx_models.RunNftTransferResponse().from_map(
            self.do_request('1.0', 'antchain.nftx.nft.transfer.run', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def run_nft_transfer_ex_async(
        self,
        request: nftx_models.RunNftTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.RunNftTransferResponse:
        """
        Description: 按项目表编码B2C发放NFT,带渠道租户
        Summary: 按项目表编码B2C发放NFT, (废弃)
        """
        UtilClient.validate_model(request)
        return nftx_models.RunNftTransferResponse().from_map(
            await self.do_request_async('1.0', 'antchain.nftx.nft.transfer.run', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_nft_transfer(
        self,
        request: nftx_models.ApplyNftTransferRequest,
    ) -> nftx_models.ApplyNftTransferResponse:
        """
        Description: 按商品编码B2C发放NFT 带渠道租户
        Summary: 按商品编码B2C发放NFT 带渠道租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_nft_transfer_ex(request, headers, runtime)

    async def apply_nft_transfer_async(
        self,
        request: nftx_models.ApplyNftTransferRequest,
    ) -> nftx_models.ApplyNftTransferResponse:
        """
        Description: 按商品编码B2C发放NFT 带渠道租户
        Summary: 按商品编码B2C发放NFT 带渠道租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_nft_transfer_ex_async(request, headers, runtime)

    def apply_nft_transfer_ex(
        self,
        request: nftx_models.ApplyNftTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.ApplyNftTransferResponse:
        """
        Description: 按商品编码B2C发放NFT 带渠道租户
        Summary: 按商品编码B2C发放NFT 带渠道租户
        """
        UtilClient.validate_model(request)
        return nftx_models.ApplyNftTransferResponse().from_map(
            self.do_request('1.0', 'antchain.nftx.nft.transfer.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_nft_transfer_ex_async(
        self,
        request: nftx_models.ApplyNftTransferRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.ApplyNftTransferResponse:
        """
        Description: 按商品编码B2C发放NFT 带渠道租户
        Summary: 按商品编码B2C发放NFT 带渠道租户
        """
        UtilClient.validate_model(request)
        return nftx_models.ApplyNftTransferResponse().from_map(
            await self.do_request_async('1.0', 'antchain.nftx.nft.transfer.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_nft_transferbyprojectwithchanneltenant(
        self,
        request: nftx_models.ApplyNftTransferbyprojectwithchanneltenantRequest,
    ) -> nftx_models.ApplyNftTransferbyprojectwithchanneltenantResponse:
        """
        Description: 按项目表编码B2C发放NFT,带渠道租户
        Summary: 按项目表编码B2C发放NFT,带渠道租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_nft_transferbyprojectwithchanneltenant_ex(request, headers, runtime)

    async def apply_nft_transferbyprojectwithchanneltenant_async(
        self,
        request: nftx_models.ApplyNftTransferbyprojectwithchanneltenantRequest,
    ) -> nftx_models.ApplyNftTransferbyprojectwithchanneltenantResponse:
        """
        Description: 按项目表编码B2C发放NFT,带渠道租户
        Summary: 按项目表编码B2C发放NFT,带渠道租户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_nft_transferbyprojectwithchanneltenant_ex_async(request, headers, runtime)

    def apply_nft_transferbyprojectwithchanneltenant_ex(
        self,
        request: nftx_models.ApplyNftTransferbyprojectwithchanneltenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.ApplyNftTransferbyprojectwithchanneltenantResponse:
        """
        Description: 按项目表编码B2C发放NFT,带渠道租户
        Summary: 按项目表编码B2C发放NFT,带渠道租户
        """
        UtilClient.validate_model(request)
        return nftx_models.ApplyNftTransferbyprojectwithchanneltenantResponse().from_map(
            self.do_request('1.0', 'antchain.nftx.nft.transferbyprojectwithchanneltenant.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_nft_transferbyprojectwithchanneltenant_ex_async(
        self,
        request: nftx_models.ApplyNftTransferbyprojectwithchanneltenantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.ApplyNftTransferbyprojectwithchanneltenantResponse:
        """
        Description: 按项目表编码B2C发放NFT,带渠道租户
        Summary: 按项目表编码B2C发放NFT,带渠道租户
        """
        UtilClient.validate_model(request)
        return nftx_models.ApplyNftTransferbyprojectwithchanneltenantResponse().from_map(
            await self.do_request_async('1.0', 'antchain.nftx.nft.transferbyprojectwithchanneltenant.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
