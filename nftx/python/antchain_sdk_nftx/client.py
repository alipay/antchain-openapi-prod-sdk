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
                    'sdk_version': '1.9.4',
                    '_prod_code': 'NFTX',
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
                    'sdk_version': '1.9.4',
                    '_prod_code': 'NFTX',
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
        return TeaCore.from_map(
            nftx_models.ImportNftCreateResponse(),
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
        return TeaCore.from_map(
            nftx_models.ImportNftCreateResponse(),
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
        return TeaCore.from_map(
            nftx_models.QueryNftCreateResponse(),
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
        return TeaCore.from_map(
            nftx_models.QueryNftCreateResponse(),
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
        return TeaCore.from_map(
            nftx_models.ExecNftTransferResponse(),
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
        return TeaCore.from_map(
            nftx_models.ExecNftTransferResponse(),
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
        return TeaCore.from_map(
            nftx_models.SendNftTransferResponse(),
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
        return TeaCore.from_map(
            nftx_models.SendNftTransferResponse(),
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
        return TeaCore.from_map(
            nftx_models.QueryNftCustomerResponse(),
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
        return TeaCore.from_map(
            nftx_models.QueryNftCustomerResponse(),
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
        return TeaCore.from_map(
            nftx_models.QueryNftOrderResponse(),
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
        return TeaCore.from_map(
            nftx_models.QueryNftOrderResponse(),
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
        return TeaCore.from_map(
            nftx_models.CreateNftIssuerResponse(),
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
        return TeaCore.from_map(
            nftx_models.CreateNftIssuerResponse(),
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
        return TeaCore.from_map(
            nftx_models.PagequeryNftCustomerResponse(),
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
        return TeaCore.from_map(
            nftx_models.PagequeryNftCustomerResponse(),
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
        return TeaCore.from_map(
            nftx_models.CreateNftPublishResponse(),
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
        return TeaCore.from_map(
            nftx_models.CreateNftPublishResponse(),
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
        return TeaCore.from_map(
            nftx_models.RunNftTransferResponse(),
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
        return TeaCore.from_map(
            nftx_models.RunNftTransferResponse(),
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
        return TeaCore.from_map(
            nftx_models.ApplyNftTransferResponse(),
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
        return TeaCore.from_map(
            nftx_models.ApplyNftTransferResponse(),
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
        return TeaCore.from_map(
            nftx_models.ApplyNftTransferbyprojectwithchanneltenantResponse(),
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
        return TeaCore.from_map(
            nftx_models.ApplyNftTransferbyprojectwithchanneltenantResponse(),
            await self.do_request_async('1.0', 'antchain.nftx.nft.transferbyprojectwithchanneltenant.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_nft_asset(
        self,
        request: nftx_models.QueryNftAssetRequest,
    ) -> nftx_models.QueryNftAssetResponse:
        """
        Description: 第三方通过accessToken和nftId校验藏品归属及查询相应藏品信息
        Summary: 校验藏品归属及查询相应藏品信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_nft_asset_ex(request, headers, runtime)

    async def query_nft_asset_async(
        self,
        request: nftx_models.QueryNftAssetRequest,
    ) -> nftx_models.QueryNftAssetResponse:
        """
        Description: 第三方通过accessToken和nftId校验藏品归属及查询相应藏品信息
        Summary: 校验藏品归属及查询相应藏品信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_nft_asset_ex_async(request, headers, runtime)

    def query_nft_asset_ex(
        self,
        request: nftx_models.QueryNftAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.QueryNftAssetResponse:
        """
        Description: 第三方通过accessToken和nftId校验藏品归属及查询相应藏品信息
        Summary: 校验藏品归属及查询相应藏品信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftx_models.QueryNftAssetResponse(),
            self.do_request('1.0', 'antchain.nftx.nft.asset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_nft_asset_ex_async(
        self,
        request: nftx_models.QueryNftAssetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.QueryNftAssetResponse:
        """
        Description: 第三方通过accessToken和nftId校验藏品归属及查询相应藏品信息
        Summary: 校验藏品归属及查询相应藏品信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftx_models.QueryNftAssetResponse(),
            await self.do_request_async('1.0', 'antchain.nftx.nft.asset.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_nft_assetbysku(
        self,
        request: nftx_models.QueryNftAssetbyskuRequest,
    ) -> nftx_models.QueryNftAssetbyskuResponse:
        """
        Description: 基于sku查询用户资产信息
        Summary: 基于sku查询用户资产信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_nft_assetbysku_ex(request, headers, runtime)

    async def query_nft_assetbysku_async(
        self,
        request: nftx_models.QueryNftAssetbyskuRequest,
    ) -> nftx_models.QueryNftAssetbyskuResponse:
        """
        Description: 基于sku查询用户资产信息
        Summary: 基于sku查询用户资产信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_nft_assetbysku_ex_async(request, headers, runtime)

    def query_nft_assetbysku_ex(
        self,
        request: nftx_models.QueryNftAssetbyskuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.QueryNftAssetbyskuResponse:
        """
        Description: 基于sku查询用户资产信息
        Summary: 基于sku查询用户资产信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftx_models.QueryNftAssetbyskuResponse(),
            self.do_request('1.0', 'antchain.nftx.nft.assetbysku.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_nft_assetbysku_ex_async(
        self,
        request: nftx_models.QueryNftAssetbyskuRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.QueryNftAssetbyskuResponse:
        """
        Description: 基于sku查询用户资产信息
        Summary: 基于sku查询用户资产信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftx_models.QueryNftAssetbyskuResponse(),
            await self.do_request_async('1.0', 'antchain.nftx.nft.assetbysku.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pay_order_data(
        self,
        request: nftx_models.PayOrderDataRequest,
    ) -> nftx_models.PayOrderDataResponse:
        """
        Description: 基于直付通模式的开放订单支付接口
        Summary: 开放订单支付接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pay_order_data_ex(request, headers, runtime)

    async def pay_order_data_async(
        self,
        request: nftx_models.PayOrderDataRequest,
    ) -> nftx_models.PayOrderDataResponse:
        """
        Description: 基于直付通模式的开放订单支付接口
        Summary: 开放订单支付接口
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pay_order_data_ex_async(request, headers, runtime)

    def pay_order_data_ex(
        self,
        request: nftx_models.PayOrderDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.PayOrderDataResponse:
        """
        Description: 基于直付通模式的开放订单支付接口
        Summary: 开放订单支付接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftx_models.PayOrderDataResponse(),
            self.do_request('1.0', 'antchain.nftx.order.data.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pay_order_data_ex_async(
        self,
        request: nftx_models.PayOrderDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.PayOrderDataResponse:
        """
        Description: 基于直付通模式的开放订单支付接口
        Summary: 开放订单支付接口
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftx_models.PayOrderDataResponse(),
            await self.do_request_async('1.0', 'antchain.nftx.order.data.pay', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def sync_order_data(
        self,
        request: nftx_models.SyncOrderDataRequest,
    ) -> nftx_models.SyncOrderDataResponse:
        """
        Description: 外部订单数据同步，包括取消、完成，未来会扩展额外数据
        Summary: 外部订单数据同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.sync_order_data_ex(request, headers, runtime)

    async def sync_order_data_async(
        self,
        request: nftx_models.SyncOrderDataRequest,
    ) -> nftx_models.SyncOrderDataResponse:
        """
        Description: 外部订单数据同步，包括取消、完成，未来会扩展额外数据
        Summary: 外部订单数据同步
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.sync_order_data_ex_async(request, headers, runtime)

    def sync_order_data_ex(
        self,
        request: nftx_models.SyncOrderDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.SyncOrderDataResponse:
        """
        Description: 外部订单数据同步，包括取消、完成，未来会扩展额外数据
        Summary: 外部订单数据同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftx_models.SyncOrderDataResponse(),
            self.do_request('1.0', 'antchain.nftx.order.data.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def sync_order_data_ex_async(
        self,
        request: nftx_models.SyncOrderDataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.SyncOrderDataResponse:
        """
        Description: 外部订单数据同步，包括取消、完成，未来会扩展额外数据
        Summary: 外部订单数据同步
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftx_models.SyncOrderDataResponse(),
            await self.do_request_async('1.0', 'antchain.nftx.order.data.sync', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_resource_image(
        self,
        request: nftx_models.QueryResourceImageRequest,
    ) -> nftx_models.QueryResourceImageResponse:
        """
        Description: 查询实物定制图片
        Summary: 查询实物定制图片
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_resource_image_ex(request, headers, runtime)

    async def query_resource_image_async(
        self,
        request: nftx_models.QueryResourceImageRequest,
    ) -> nftx_models.QueryResourceImageResponse:
        """
        Description: 查询实物定制图片
        Summary: 查询实物定制图片
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_resource_image_ex_async(request, headers, runtime)

    def query_resource_image_ex(
        self,
        request: nftx_models.QueryResourceImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.QueryResourceImageResponse:
        """
        Description: 查询实物定制图片
        Summary: 查询实物定制图片
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftx_models.QueryResourceImageResponse(),
            self.do_request('1.0', 'antchain.nftx.resource.image.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_resource_image_ex_async(
        self,
        request: nftx_models.QueryResourceImageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.QueryResourceImageResponse:
        """
        Description: 查询实物定制图片
        Summary: 查询实物定制图片
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftx_models.QueryResourceImageResponse(),
            await self.do_request_async('1.0', 'antchain.nftx.resource.image.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_resource_consigneeinfo(
        self,
        request: nftx_models.ImportResourceConsigneeinfoRequest,
    ) -> nftx_models.ImportResourceConsigneeinfoResponse:
        """
        Description: 用户收货信息存档
        Summary: 用户收货信息存档
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_resource_consigneeinfo_ex(request, headers, runtime)

    async def import_resource_consigneeinfo_async(
        self,
        request: nftx_models.ImportResourceConsigneeinfoRequest,
    ) -> nftx_models.ImportResourceConsigneeinfoResponse:
        """
        Description: 用户收货信息存档
        Summary: 用户收货信息存档
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_resource_consigneeinfo_ex_async(request, headers, runtime)

    def import_resource_consigneeinfo_ex(
        self,
        request: nftx_models.ImportResourceConsigneeinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.ImportResourceConsigneeinfoResponse:
        """
        Description: 用户收货信息存档
        Summary: 用户收货信息存档
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftx_models.ImportResourceConsigneeinfoResponse(),
            self.do_request('1.0', 'antchain.nftx.resource.consigneeinfo.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_resource_consigneeinfo_ex_async(
        self,
        request: nftx_models.ImportResourceConsigneeinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.ImportResourceConsigneeinfoResponse:
        """
        Description: 用户收货信息存档
        Summary: 用户收货信息存档
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftx_models.ImportResourceConsigneeinfoResponse(),
            await self.do_request_async('1.0', 'antchain.nftx.resource.consigneeinfo.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_nft_property(
        self,
        request: nftx_models.UpdateNftPropertyRequest,
    ) -> nftx_models.UpdateNftPropertyResponse:
        """
        Description: 资产属性更新开放接口
        Summary: 资产属性更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_nft_property_ex(request, headers, runtime)

    async def update_nft_property_async(
        self,
        request: nftx_models.UpdateNftPropertyRequest,
    ) -> nftx_models.UpdateNftPropertyResponse:
        """
        Description: 资产属性更新开放接口
        Summary: 资产属性更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_nft_property_ex_async(request, headers, runtime)

    def update_nft_property_ex(
        self,
        request: nftx_models.UpdateNftPropertyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.UpdateNftPropertyResponse:
        """
        Description: 资产属性更新开放接口
        Summary: 资产属性更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftx_models.UpdateNftPropertyResponse(),
            self.do_request('1.0', 'antchain.nftx.nft.property.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_nft_property_ex_async(
        self,
        request: nftx_models.UpdateNftPropertyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.UpdateNftPropertyResponse:
        """
        Description: 资产属性更新开放接口
        Summary: 资产属性更新
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftx_models.UpdateNftPropertyResponse(),
            await self.do_request_async('1.0', 'antchain.nftx.nft.property.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_oauth_token(
        self,
        request: nftx_models.ApplyOauthTokenRequest,
    ) -> nftx_models.ApplyOauthTokenResponse:
        """
        Description: 拿authcode换token
        Summary: 拿authcode换token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_oauth_token_ex(request, headers, runtime)

    async def apply_oauth_token_async(
        self,
        request: nftx_models.ApplyOauthTokenRequest,
    ) -> nftx_models.ApplyOauthTokenResponse:
        """
        Description: 拿authcode换token
        Summary: 拿authcode换token
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_oauth_token_ex_async(request, headers, runtime)

    def apply_oauth_token_ex(
        self,
        request: nftx_models.ApplyOauthTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.ApplyOauthTokenResponse:
        """
        Description: 拿authcode换token
        Summary: 拿authcode换token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftx_models.ApplyOauthTokenResponse(),
            self.do_request('1.0', 'antchain.nftx.oauth.token.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_oauth_token_ex_async(
        self,
        request: nftx_models.ApplyOauthTokenRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.ApplyOauthTokenResponse:
        """
        Description: 拿authcode换token
        Summary: 拿authcode换token
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftx_models.ApplyOauthTokenResponse(),
            await self.do_request_async('1.0', 'antchain.nftx.oauth.token.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_oauth_userinfo(
        self,
        request: nftx_models.QueryOauthUserinfoRequest,
    ) -> nftx_models.QueryOauthUserinfoResponse:
        """
        Description: 获取用户信息
        Summary: 获取用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_oauth_userinfo_ex(request, headers, runtime)

    async def query_oauth_userinfo_async(
        self,
        request: nftx_models.QueryOauthUserinfoRequest,
    ) -> nftx_models.QueryOauthUserinfoResponse:
        """
        Description: 获取用户信息
        Summary: 获取用户信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_oauth_userinfo_ex_async(request, headers, runtime)

    def query_oauth_userinfo_ex(
        self,
        request: nftx_models.QueryOauthUserinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.QueryOauthUserinfoResponse:
        """
        Description: 获取用户信息
        Summary: 获取用户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftx_models.QueryOauthUserinfoResponse(),
            self.do_request('1.0', 'antchain.nftx.oauth.userinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_oauth_userinfo_ex_async(
        self,
        request: nftx_models.QueryOauthUserinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> nftx_models.QueryOauthUserinfoResponse:
        """
        Description: 获取用户信息
        Summary: 获取用户信息
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            nftx_models.QueryOauthUserinfoResponse(),
            await self.do_request_async('1.0', 'antchain.nftx.oauth.userinfo.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
