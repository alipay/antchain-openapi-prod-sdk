# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_mq import models as mq_models
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
        config: mq_models.Config,
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
            # schema元数据对象
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
                    'sdk_version': '3.8.22'
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
            # schema元数据对象
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
                    'sdk_version': '3.8.22'
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

    def status_mq_message_undelivery(
        self,
        request: mq_models.StatusMqMessageUndeliveryRequest,
    ) -> mq_models.StatusMqMessageUndeliveryResponse:
        """
        Description: Query undelivery message status.
        Summary: query undelivery message status
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.status_mq_message_undelivery_ex(request, headers, runtime)

    async def status_mq_message_undelivery_async(
        self,
        request: mq_models.StatusMqMessageUndeliveryRequest,
    ) -> mq_models.StatusMqMessageUndeliveryResponse:
        """
        Description: Query undelivery message status.
        Summary: query undelivery message status
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.status_mq_message_undelivery_ex_async(request, headers, runtime)

    def status_mq_message_undelivery_ex(
        self,
        request: mq_models.StatusMqMessageUndeliveryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.StatusMqMessageUndeliveryResponse:
        """
        Description: Query undelivery message status.
        Summary: query undelivery message status
        """
        UtilClient.validate_model(request)
        return mq_models.StatusMqMessageUndeliveryResponse().from_map(
            self.do_request('1.0', 'mq.message.undelivery.status', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def status_mq_message_undelivery_ex_async(
        self,
        request: mq_models.StatusMqMessageUndeliveryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.StatusMqMessageUndeliveryResponse:
        """
        Description: Query undelivery message status.
        Summary: query undelivery message status
        """
        UtilClient.validate_model(request)
        return mq_models.StatusMqMessageUndeliveryResponse().from_map(
            await self.do_request_async('1.0', 'mq.message.undelivery.status', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def undeliver_message_status(
        self,
        request: mq_models.UndeliverMessageStatusRequest,
    ) -> mq_models.UndeliverMessageStatusResponse:
        """
        Description: Query undelivery message status.
        Summary: query undelivery message status
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.undeliver_message_status_ex(request, headers, runtime)

    async def undeliver_message_status_async(
        self,
        request: mq_models.UndeliverMessageStatusRequest,
    ) -> mq_models.UndeliverMessageStatusResponse:
        """
        Description: Query undelivery message status.
        Summary: query undelivery message status
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.undeliver_message_status_ex_async(request, headers, runtime)

    def undeliver_message_status_ex(
        self,
        request: mq_models.UndeliverMessageStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UndeliverMessageStatusResponse:
        """
        Description: Query undelivery message status.
        Summary: query undelivery message status
        """
        UtilClient.validate_model(request)
        return mq_models.UndeliverMessageStatusResponse().from_map(
            self.do_request('1.0', 'sofa.mq.message.status.undeliver', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def undeliver_message_status_ex_async(
        self,
        request: mq_models.UndeliverMessageStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UndeliverMessageStatusResponse:
        """
        Description: Query undelivery message status.
        Summary: query undelivery message status
        """
        UtilClient.validate_model(request)
        return mq_models.UndeliverMessageStatusResponse().from_map(
            await self.do_request_async('1.0', 'sofa.mq.message.status.undeliver', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_msgtype(
        self,
        request: mq_models.AddMsgtypeRequest,
    ) -> mq_models.AddMsgtypeResponse:
        """
        Description: Add a message type.
        Summary: add a message type
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_msgtype_ex(request, headers, runtime)

    async def add_msgtype_async(
        self,
        request: mq_models.AddMsgtypeRequest,
    ) -> mq_models.AddMsgtypeResponse:
        """
        Description: Add a message type.
        Summary: add a message type
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_msgtype_ex_async(request, headers, runtime)

    def add_msgtype_ex(
        self,
        request: mq_models.AddMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.AddMsgtypeResponse:
        """
        Description: Add a message type.
        Summary: add a message type
        """
        UtilClient.validate_model(request)
        return mq_models.AddMsgtypeResponse().from_map(
            self.do_request('1.0', 'sofa.mq.msgtype.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_msgtype_ex_async(
        self,
        request: mq_models.AddMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.AddMsgtypeResponse:
        """
        Description: Add a message type.
        Summary: add a message type
        """
        UtilClient.validate_model(request)
        return mq_models.AddMsgtypeResponse().from_map(
            await self.do_request_async('1.0', 'sofa.mq.msgtype.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_msgtype(
        self,
        request: mq_models.UpdateMsgtypeRequest,
    ) -> mq_models.UpdateMsgtypeResponse:
        """
        Description: Update a message type.
        Summary: update a message type
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_msgtype_ex(request, headers, runtime)

    async def update_msgtype_async(
        self,
        request: mq_models.UpdateMsgtypeRequest,
    ) -> mq_models.UpdateMsgtypeResponse:
        """
        Description: Update a message type.
        Summary: update a message type
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_msgtype_ex_async(request, headers, runtime)

    def update_msgtype_ex(
        self,
        request: mq_models.UpdateMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMsgtypeResponse:
        """
        Description: Update a message type.
        Summary: update a message type
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMsgtypeResponse().from_map(
            self.do_request('1.0', 'sofa.mq.msgtype.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_msgtype_ex_async(
        self,
        request: mq_models.UpdateMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMsgtypeResponse:
        """
        Description: Update a message type.
        Summary: update a message type
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMsgtypeResponse().from_map(
            await self.do_request_async('1.0', 'sofa.mq.msgtype.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_msgtype(
        self,
        request: mq_models.DeleteMsgtypeRequest,
    ) -> mq_models.DeleteMsgtypeResponse:
        """
        Description: Delete a message type.
        Summary: delete a message type
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_msgtype_ex(request, headers, runtime)

    async def delete_msgtype_async(
        self,
        request: mq_models.DeleteMsgtypeRequest,
    ) -> mq_models.DeleteMsgtypeResponse:
        """
        Description: Delete a message type.
        Summary: delete a message type
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_msgtype_ex_async(request, headers, runtime)

    def delete_msgtype_ex(
        self,
        request: mq_models.DeleteMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteMsgtypeResponse:
        """
        Description: Delete a message type.
        Summary: delete a message type
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteMsgtypeResponse().from_map(
            self.do_request('1.0', 'sofa.mq.msgtype.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_msgtype_ex_async(
        self,
        request: mq_models.DeleteMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteMsgtypeResponse:
        """
        Description: Delete a message type.
        Summary: delete a message type
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteMsgtypeResponse().from_map(
            await self.do_request_async('1.0', 'sofa.mq.msgtype.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_msgtype(
        self,
        request: mq_models.QueryMsgtypeRequest,
    ) -> mq_models.QueryMsgtypeResponse:
        """
        Description: Query the collection of message type.
        Summary: query the collection of message type
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_msgtype_ex(request, headers, runtime)

    async def query_msgtype_async(
        self,
        request: mq_models.QueryMsgtypeRequest,
    ) -> mq_models.QueryMsgtypeResponse:
        """
        Description: Query the collection of message type.
        Summary: query the collection of message type
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_msgtype_ex_async(request, headers, runtime)

    def query_msgtype_ex(
        self,
        request: mq_models.QueryMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMsgtypeResponse:
        """
        Description: Query the collection of message type.
        Summary: query the collection of message type
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMsgtypeResponse().from_map(
            self.do_request('1.0', 'sofa.mq.msgtype.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_msgtype_ex_async(
        self,
        request: mq_models.QueryMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMsgtypeResponse:
        """
        Description: Query the collection of message type.
        Summary: query the collection of message type
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMsgtypeResponse().from_map(
            await self.do_request_async('1.0', 'sofa.mq.msgtype.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_binding(
        self,
        request: mq_models.AddBindingRequest,
    ) -> mq_models.AddBindingResponse:
        """
        Description: Add a binding.
        Summary: add a binding
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_binding_ex(request, headers, runtime)

    async def add_binding_async(
        self,
        request: mq_models.AddBindingRequest,
    ) -> mq_models.AddBindingResponse:
        """
        Description: Add a binding.
        Summary: add a binding
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_binding_ex_async(request, headers, runtime)

    def add_binding_ex(
        self,
        request: mq_models.AddBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.AddBindingResponse:
        """
        Description: Add a binding.
        Summary: add a binding
        """
        UtilClient.validate_model(request)
        return mq_models.AddBindingResponse().from_map(
            self.do_request('1.0', 'sofa.mq.binding.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_binding_ex_async(
        self,
        request: mq_models.AddBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.AddBindingResponse:
        """
        Description: Add a binding.
        Summary: add a binding
        """
        UtilClient.validate_model(request)
        return mq_models.AddBindingResponse().from_map(
            await self.do_request_async('1.0', 'sofa.mq.binding.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_binding(
        self,
        request: mq_models.UpdateBindingRequest,
    ) -> mq_models.UpdateBindingResponse:
        """
        Description: Update a binding.
        Summary: update a binding
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_binding_ex(request, headers, runtime)

    async def update_binding_async(
        self,
        request: mq_models.UpdateBindingRequest,
    ) -> mq_models.UpdateBindingResponse:
        """
        Description: Update a binding.
        Summary: update a binding
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_binding_ex_async(request, headers, runtime)

    def update_binding_ex(
        self,
        request: mq_models.UpdateBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateBindingResponse:
        """
        Description: Update a binding.
        Summary: update a binding
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateBindingResponse().from_map(
            self.do_request('1.0', 'sofa.mq.binding.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_binding_ex_async(
        self,
        request: mq_models.UpdateBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateBindingResponse:
        """
        Description: Update a binding.
        Summary: update a binding
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateBindingResponse().from_map(
            await self.do_request_async('1.0', 'sofa.mq.binding.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_binding(
        self,
        request: mq_models.DeleteBindingRequest,
    ) -> mq_models.DeleteBindingResponse:
        """
        Description: Delete a binding.
        Summary: delete a binding
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_binding_ex(request, headers, runtime)

    async def delete_binding_async(
        self,
        request: mq_models.DeleteBindingRequest,
    ) -> mq_models.DeleteBindingResponse:
        """
        Description: Delete a binding.
        Summary: delete a binding
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_binding_ex_async(request, headers, runtime)

    def delete_binding_ex(
        self,
        request: mq_models.DeleteBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteBindingResponse:
        """
        Description: Delete a binding.
        Summary: delete a binding
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteBindingResponse().from_map(
            self.do_request('1.0', 'sofa.mq.binding.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_binding_ex_async(
        self,
        request: mq_models.DeleteBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteBindingResponse:
        """
        Description: Delete a binding.
        Summary: delete a binding
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteBindingResponse().from_map(
            await self.do_request_async('1.0', 'sofa.mq.binding.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_binding(
        self,
        request: mq_models.QueryBindingRequest,
    ) -> mq_models.QueryBindingResponse:
        """
        Description: Query the collection of binding.
        Summary: query the collection of binding
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_binding_ex(request, headers, runtime)

    async def query_binding_async(
        self,
        request: mq_models.QueryBindingRequest,
    ) -> mq_models.QueryBindingResponse:
        """
        Description: Query the collection of binding.
        Summary: query the collection of binding
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_binding_ex_async(request, headers, runtime)

    def query_binding_ex(
        self,
        request: mq_models.QueryBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryBindingResponse:
        """
        Description: Query the collection of binding.
        Summary: query the collection of binding
        """
        UtilClient.validate_model(request)
        return mq_models.QueryBindingResponse().from_map(
            self.do_request('1.0', 'sofa.mq.binding.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_binding_ex_async(
        self,
        request: mq_models.QueryBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryBindingResponse:
        """
        Description: Query the collection of binding.
        Summary: query the collection of binding
        """
        UtilClient.validate_model(request)
        return mq_models.QueryBindingResponse().from_map(
            await self.do_request_async('1.0', 'sofa.mq.binding.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def execute_switchover(
        self,
        request: mq_models.ExecuteSwitchoverRequest,
    ) -> mq_models.ExecuteSwitchoverResponse:
        """
        Description: Queue switchover execute.
        Summary: Queue switchover execute
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.execute_switchover_ex(request, headers, runtime)

    async def execute_switchover_async(
        self,
        request: mq_models.ExecuteSwitchoverRequest,
    ) -> mq_models.ExecuteSwitchoverResponse:
        """
        Description: Queue switchover execute.
        Summary: Queue switchover execute
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.execute_switchover_ex_async(request, headers, runtime)

    def execute_switchover_ex(
        self,
        request: mq_models.ExecuteSwitchoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ExecuteSwitchoverResponse:
        """
        Description: Queue switchover execute.
        Summary: Queue switchover execute
        """
        UtilClient.validate_model(request)
        return mq_models.ExecuteSwitchoverResponse().from_map(
            self.do_request('1.0', 'sofa.mq.switchover.execute', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def execute_switchover_ex_async(
        self,
        request: mq_models.ExecuteSwitchoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ExecuteSwitchoverResponse:
        """
        Description: Queue switchover execute.
        Summary: Queue switchover execute
        """
        UtilClient.validate_model(request)
        return mq_models.ExecuteSwitchoverResponse().from_map(
            await self.do_request_async('1.0', 'sofa.mq.switchover.execute', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_switchover(
        self,
        request: mq_models.CancelSwitchoverRequest,
    ) -> mq_models.CancelSwitchoverResponse:
        """
        Description: Queue switchover cancel.
        Summary: Queue switchover cancel
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_switchover_ex(request, headers, runtime)

    async def cancel_switchover_async(
        self,
        request: mq_models.CancelSwitchoverRequest,
    ) -> mq_models.CancelSwitchoverResponse:
        """
        Description: Queue switchover cancel.
        Summary: Queue switchover cancel
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_switchover_ex_async(request, headers, runtime)

    def cancel_switchover_ex(
        self,
        request: mq_models.CancelSwitchoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CancelSwitchoverResponse:
        """
        Description: Queue switchover cancel.
        Summary: Queue switchover cancel
        """
        UtilClient.validate_model(request)
        return mq_models.CancelSwitchoverResponse().from_map(
            self.do_request('1.0', 'sofa.mq.switchover.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_switchover_ex_async(
        self,
        request: mq_models.CancelSwitchoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CancelSwitchoverResponse:
        """
        Description: Queue switchover cancel.
        Summary: Queue switchover cancel
        """
        UtilClient.validate_model(request)
        return mq_models.CancelSwitchoverResponse().from_map(
            await self.do_request_async('1.0', 'sofa.mq.switchover.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_switchover(
        self,
        request: mq_models.QuerySwitchoverRequest,
    ) -> mq_models.QuerySwitchoverResponse:
        """
        Description: Queue switchover query.
        Summary: Queue switchover query
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_switchover_ex(request, headers, runtime)

    async def query_switchover_async(
        self,
        request: mq_models.QuerySwitchoverRequest,
    ) -> mq_models.QuerySwitchoverResponse:
        """
        Description: Queue switchover query.
        Summary: Queue switchover query
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_switchover_ex_async(request, headers, runtime)

    def query_switchover_ex(
        self,
        request: mq_models.QuerySwitchoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySwitchoverResponse:
        """
        Description: Queue switchover query.
        Summary: Queue switchover query
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySwitchoverResponse().from_map(
            self.do_request('1.0', 'sofa.mq.switchover.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_switchover_ex_async(
        self,
        request: mq_models.QuerySwitchoverRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySwitchoverResponse:
        """
        Description: Queue switchover query.
        Summary: Queue switchover query
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySwitchoverResponse().from_map(
            await self.do_request_async('1.0', 'sofa.mq.switchover.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_msgtype(
        self,
        request: mq_models.GetMsgtypeRequest,
    ) -> mq_models.GetMsgtypeResponse:
        """
        Description: Query the collection of message type.
        Summary: query the collection of message type
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_msgtype_ex(request, headers, runtime)

    async def get_msgtype_async(
        self,
        request: mq_models.GetMsgtypeRequest,
    ) -> mq_models.GetMsgtypeResponse:
        """
        Description: Query the collection of message type.
        Summary: query the collection of message type
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_msgtype_ex_async(request, headers, runtime)

    def get_msgtype_ex(
        self,
        request: mq_models.GetMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetMsgtypeResponse:
        """
        Description: Query the collection of message type.
        Summary: query the collection of message type
        """
        UtilClient.validate_model(request)
        return mq_models.GetMsgtypeResponse().from_map(
            self.do_request('2.0', 'sofa.mq.msgtype.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_msgtype_ex_async(
        self,
        request: mq_models.GetMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetMsgtypeResponse:
        """
        Description: Query the collection of message type.
        Summary: query the collection of message type
        """
        UtilClient.validate_model(request)
        return mq_models.GetMsgtypeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.msgtype.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def undelivery_message_status(
        self,
        request: mq_models.UndeliveryMessageStatusRequest,
    ) -> mq_models.UndeliveryMessageStatusResponse:
        """
        Description: Query undelivery message status.
        Summary: query undelivery message status
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.undelivery_message_status_ex(request, headers, runtime)

    async def undelivery_message_status_async(
        self,
        request: mq_models.UndeliveryMessageStatusRequest,
    ) -> mq_models.UndeliveryMessageStatusResponse:
        """
        Description: Query undelivery message status.
        Summary: query undelivery message status
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.undelivery_message_status_ex_async(request, headers, runtime)

    def undelivery_message_status_ex(
        self,
        request: mq_models.UndeliveryMessageStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UndeliveryMessageStatusResponse:
        """
        Description: Query undelivery message status.
        Summary: query undelivery message status
        """
        UtilClient.validate_model(request)
        return mq_models.UndeliveryMessageStatusResponse().from_map(
            self.do_request('2.0', 'sofa.mq.message.status.undelivery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def undelivery_message_status_ex_async(
        self,
        request: mq_models.UndeliveryMessageStatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UndeliveryMessageStatusResponse:
        """
        Description: Query undelivery message status.
        Summary: query undelivery message status
        """
        UtilClient.validate_model(request)
        return mq_models.UndeliveryMessageStatusResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.message.status.undelivery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_topics(
        self,
        request: mq_models.QueryTopicsRequest,
    ) -> mq_models.QueryTopicsResponse:
        """
        Description: query topics
        Summary: query topics
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_topics_ex(request, headers, runtime)

    async def query_topics_async(
        self,
        request: mq_models.QueryTopicsRequest,
    ) -> mq_models.QueryTopicsResponse:
        """
        Description: query topics
        Summary: query topics
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_topics_ex_async(request, headers, runtime)

    def query_topics_ex(
        self,
        request: mq_models.QueryTopicsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryTopicsResponse:
        """
        Description: query topics
        Summary: query topics
        """
        UtilClient.validate_model(request)
        return mq_models.QueryTopicsResponse().from_map(
            self.do_request('2.0', 'sofa.mq.topics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_topics_ex_async(
        self,
        request: mq_models.QueryTopicsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryTopicsResponse:
        """
        Description: query topics
        Summary: query topics
        """
        UtilClient.validate_model(request)
        return mq_models.QueryTopicsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.topics.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def id_topic_query(
        self,
        request: mq_models.IdTopicQueryRequest,
    ) -> mq_models.IdTopicQueryResponse:
        """
        Description: query topic
        Summary: query topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.id_topic_query_ex(request, headers, runtime)

    async def id_topic_query_async(
        self,
        request: mq_models.IdTopicQueryRequest,
    ) -> mq_models.IdTopicQueryResponse:
        """
        Description: query topic
        Summary: query topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.id_topic_query_ex_async(request, headers, runtime)

    def id_topic_query_ex(
        self,
        request: mq_models.IdTopicQueryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.IdTopicQueryResponse:
        """
        Description: query topic
        Summary: query topic
        """
        UtilClient.validate_model(request)
        return mq_models.IdTopicQueryResponse().from_map(
            self.do_request('2.0', 'sofa.mq.topic.query.id', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def id_topic_query_ex_async(
        self,
        request: mq_models.IdTopicQueryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.IdTopicQueryResponse:
        """
        Description: query topic
        Summary: query topic
        """
        UtilClient.validate_model(request)
        return mq_models.IdTopicQueryResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.topic.query.id', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_topic(
        self,
        request: mq_models.AddTopicRequest,
    ) -> mq_models.AddTopicResponse:
        """
        Description: add topic
        Summary: add topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_topic_ex(request, headers, runtime)

    async def add_topic_async(
        self,
        request: mq_models.AddTopicRequest,
    ) -> mq_models.AddTopicResponse:
        """
        Description: add topic
        Summary: add topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_topic_ex_async(request, headers, runtime)

    def add_topic_ex(
        self,
        request: mq_models.AddTopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.AddTopicResponse:
        """
        Description: add topic
        Summary: add topic
        """
        UtilClient.validate_model(request)
        return mq_models.AddTopicResponse().from_map(
            self.do_request('2.0', 'sofa.mq.topic.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_topic_ex_async(
        self,
        request: mq_models.AddTopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.AddTopicResponse:
        """
        Description: add topic
        Summary: add topic
        """
        UtilClient.validate_model(request)
        return mq_models.AddTopicResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.topic.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_topic(
        self,
        request: mq_models.UpdateTopicRequest,
    ) -> mq_models.UpdateTopicResponse:
        """
        Description: update topic
        Summary: update topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_topic_ex(request, headers, runtime)

    async def update_topic_async(
        self,
        request: mq_models.UpdateTopicRequest,
    ) -> mq_models.UpdateTopicResponse:
        """
        Description: update topic
        Summary: update topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_topic_ex_async(request, headers, runtime)

    def update_topic_ex(
        self,
        request: mq_models.UpdateTopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateTopicResponse:
        """
        Description: update topic
        Summary: update topic
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateTopicResponse().from_map(
            self.do_request('2.0', 'sofa.mq.topic.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_topic_ex_async(
        self,
        request: mq_models.UpdateTopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateTopicResponse:
        """
        Description: update topic
        Summary: update topic
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateTopicResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.topic.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_topic(
        self,
        request: mq_models.DeleteTopicRequest,
    ) -> mq_models.DeleteTopicResponse:
        """
        Description: delete topic
        Summary: delete topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_topic_ex(request, headers, runtime)

    async def delete_topic_async(
        self,
        request: mq_models.DeleteTopicRequest,
    ) -> mq_models.DeleteTopicResponse:
        """
        Description: delete topic
        Summary: delete topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_topic_ex_async(request, headers, runtime)

    def delete_topic_ex(
        self,
        request: mq_models.DeleteTopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteTopicResponse:
        """
        Description: delete topic
        Summary: delete topic
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteTopicResponse().from_map(
            self.do_request('2.0', 'sofa.mq.topic.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_topic_ex_async(
        self,
        request: mq_models.DeleteTopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteTopicResponse:
        """
        Description: delete topic
        Summary: delete topic
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteTopicResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.topic.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_bindings(
        self,
        request: mq_models.QueryBindingsRequest,
    ) -> mq_models.QueryBindingsResponse:
        """
        Description: query bindings
        Summary: query bindings
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_bindings_ex(request, headers, runtime)

    async def query_bindings_async(
        self,
        request: mq_models.QueryBindingsRequest,
    ) -> mq_models.QueryBindingsResponse:
        """
        Description: query bindings
        Summary: query bindings
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_bindings_ex_async(request, headers, runtime)

    def query_bindings_ex(
        self,
        request: mq_models.QueryBindingsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryBindingsResponse:
        """
        Description: query bindings
        Summary: query bindings
        """
        UtilClient.validate_model(request)
        return mq_models.QueryBindingsResponse().from_map(
            self.do_request('2.0', 'sofa.mq.bindings.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_bindings_ex_async(
        self,
        request: mq_models.QueryBindingsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryBindingsResponse:
        """
        Description: query bindings
        Summary: query bindings
        """
        UtilClient.validate_model(request)
        return mq_models.QueryBindingsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.bindings.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def id_binding_query(
        self,
        request: mq_models.IdBindingQueryRequest,
    ) -> mq_models.IdBindingQueryResponse:
        """
        Description: query binding
        Summary: query binding
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.id_binding_query_ex(request, headers, runtime)

    async def id_binding_query_async(
        self,
        request: mq_models.IdBindingQueryRequest,
    ) -> mq_models.IdBindingQueryResponse:
        """
        Description: query binding
        Summary: query binding
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.id_binding_query_ex_async(request, headers, runtime)

    def id_binding_query_ex(
        self,
        request: mq_models.IdBindingQueryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.IdBindingQueryResponse:
        """
        Description: query binding
        Summary: query binding
        """
        UtilClient.validate_model(request)
        return mq_models.IdBindingQueryResponse().from_map(
            self.do_request('2.0', 'sofa.mq.binding.query.id', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def id_binding_query_ex_async(
        self,
        request: mq_models.IdBindingQueryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.IdBindingQueryResponse:
        """
        Description: query binding
        Summary: query binding
        """
        UtilClient.validate_model(request)
        return mq_models.IdBindingQueryResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.binding.query.id', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_topic(
        self,
        request: mq_models.ListSofamqTopicRequest,
    ) -> mq_models.ListSofamqTopicResponse:
        """
        Description: 查询指定实例下 Topic 的信息列表。
        Summary: 查询Topic列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_topic_ex(request, headers, runtime)

    async def list_sofamq_topic_async(
        self,
        request: mq_models.ListSofamqTopicRequest,
    ) -> mq_models.ListSofamqTopicResponse:
        """
        Description: 查询指定实例下 Topic 的信息列表。
        Summary: 查询Topic列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_topic_ex_async(request, headers, runtime)

    def list_sofamq_topic_ex(
        self,
        request: mq_models.ListSofamqTopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqTopicResponse:
        """
        Description: 查询指定实例下 Topic 的信息列表。
        Summary: 查询Topic列表
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqTopicResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.topic.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_topic_ex_async(
        self,
        request: mq_models.ListSofamqTopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqTopicResponse:
        """
        Description: 查询指定实例下 Topic 的信息列表。
        Summary: 查询Topic列表
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqTopicResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.topic.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_topic(
        self,
        request: mq_models.CreateSofamqTopicRequest,
    ) -> mq_models.CreateSofamqTopicResponse:
        """
        Description: 在指定环境实例下创建一个 Topic，需要指定消息类型与 Topic 名称。
        Summary: 创建Topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_topic_ex(request, headers, runtime)

    async def create_sofamq_topic_async(
        self,
        request: mq_models.CreateSofamqTopicRequest,
    ) -> mq_models.CreateSofamqTopicResponse:
        """
        Description: 在指定环境实例下创建一个 Topic，需要指定消息类型与 Topic 名称。
        Summary: 创建Topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_topic_ex_async(request, headers, runtime)

    def create_sofamq_topic_ex(
        self,
        request: mq_models.CreateSofamqTopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqTopicResponse:
        """
        Description: 在指定环境实例下创建一个 Topic，需要指定消息类型与 Topic 名称。
        Summary: 创建Topic
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqTopicResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.topic.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_topic_ex_async(
        self,
        request: mq_models.CreateSofamqTopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqTopicResponse:
        """
        Description: 在指定环境实例下创建一个 Topic，需要指定消息类型与 Topic 名称。
        Summary: 创建Topic
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqTopicResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.topic.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_topic(
        self,
        request: mq_models.DeleteSofamqTopicRequest,
    ) -> mq_models.DeleteSofamqTopicResponse:
        """
        Description: 删除指定的 Topic。删除后，该 Topic 下所有的订阅关系会被清理，需谨慎调用。
        Summary: 删除Topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_topic_ex(request, headers, runtime)

    async def delete_sofamq_topic_async(
        self,
        request: mq_models.DeleteSofamqTopicRequest,
    ) -> mq_models.DeleteSofamqTopicResponse:
        """
        Description: 删除指定的 Topic。删除后，该 Topic 下所有的订阅关系会被清理，需谨慎调用。
        Summary: 删除Topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_topic_ex_async(request, headers, runtime)

    def delete_sofamq_topic_ex(
        self,
        request: mq_models.DeleteSofamqTopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqTopicResponse:
        """
        Description: 删除指定的 Topic。删除后，该 Topic 下所有的订阅关系会被清理，需谨慎调用。
        Summary: 删除Topic
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqTopicResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.topic.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_topic_ex_async(
        self,
        request: mq_models.DeleteSofamqTopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqTopicResponse:
        """
        Description: 删除指定的 Topic。删除后，该 Topic 下所有的订阅关系会被清理，需谨慎调用。
        Summary: 删除Topic
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqTopicResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.topic.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sofamq_topic(
        self,
        request: mq_models.UpdateSofamqTopicRequest,
    ) -> mq_models.UpdateSofamqTopicResponse:
        """
        Description: 更新指定 Topic 的读写权限配置。
        Summary: 更新Topic读写权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sofamq_topic_ex(request, headers, runtime)

    async def update_sofamq_topic_async(
        self,
        request: mq_models.UpdateSofamqTopicRequest,
    ) -> mq_models.UpdateSofamqTopicResponse:
        """
        Description: 更新指定 Topic 的读写权限配置。
        Summary: 更新Topic读写权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sofamq_topic_ex_async(request, headers, runtime)

    def update_sofamq_topic_ex(
        self,
        request: mq_models.UpdateSofamqTopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqTopicResponse:
        """
        Description: 更新指定 Topic 的读写权限配置。
        Summary: 更新Topic读写权限
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqTopicResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.topic.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sofamq_topic_ex_async(
        self,
        request: mq_models.UpdateSofamqTopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqTopicResponse:
        """
        Description: 更新指定 Topic 的读写权限配置。
        Summary: 更新Topic读写权限
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqTopicResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.topic.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_instance(
        self,
        request: mq_models.ListSofamqInstanceRequest,
    ) -> mq_models.ListSofamqInstanceResponse:
        """
        Description: sofamq list instance
        Summary: sofamq list instance
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_instance_ex(request, headers, runtime)

    async def list_sofamq_instance_async(
        self,
        request: mq_models.ListSofamqInstanceRequest,
    ) -> mq_models.ListSofamqInstanceResponse:
        """
        Description: sofamq list instance
        Summary: sofamq list instance
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_instance_ex_async(request, headers, runtime)

    def list_sofamq_instance_ex(
        self,
        request: mq_models.ListSofamqInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqInstanceResponse:
        """
        Description: sofamq list instance
        Summary: sofamq list instance
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqInstanceResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.instance.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_instance_ex_async(
        self,
        request: mq_models.ListSofamqInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqInstanceResponse:
        """
        Description: sofamq list instance
        Summary: sofamq list instance
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqInstanceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.instance.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_instance(
        self,
        request: mq_models.CreateSofamqInstanceRequest,
    ) -> mq_models.CreateSofamqInstanceResponse:
        """
        Description: sofamq instance create
        Summary: instance create
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_instance_ex(request, headers, runtime)

    async def create_sofamq_instance_async(
        self,
        request: mq_models.CreateSofamqInstanceRequest,
    ) -> mq_models.CreateSofamqInstanceResponse:
        """
        Description: sofamq instance create
        Summary: instance create
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_instance_ex_async(request, headers, runtime)

    def create_sofamq_instance_ex(
        self,
        request: mq_models.CreateSofamqInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqInstanceResponse:
        """
        Description: sofamq instance create
        Summary: instance create
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqInstanceResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.instance.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_instance_ex_async(
        self,
        request: mq_models.CreateSofamqInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqInstanceResponse:
        """
        Description: sofamq instance create
        Summary: instance create
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqInstanceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.instance.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_instance(
        self,
        request: mq_models.DeleteSofamqInstanceRequest,
    ) -> mq_models.DeleteSofamqInstanceResponse:
        """
        Description: instance delete
        Summary: instance delete
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_instance_ex(request, headers, runtime)

    async def delete_sofamq_instance_async(
        self,
        request: mq_models.DeleteSofamqInstanceRequest,
    ) -> mq_models.DeleteSofamqInstanceResponse:
        """
        Description: instance delete
        Summary: instance delete
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_instance_ex_async(request, headers, runtime)

    def delete_sofamq_instance_ex(
        self,
        request: mq_models.DeleteSofamqInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqInstanceResponse:
        """
        Description: instance delete
        Summary: instance delete
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqInstanceResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.instance.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_instance_ex_async(
        self,
        request: mq_models.DeleteSofamqInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqInstanceResponse:
        """
        Description: instance delete
        Summary: instance delete
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqInstanceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.instance.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sofamq_instance(
        self,
        request: mq_models.UpdateSofamqInstanceRequest,
    ) -> mq_models.UpdateSofamqInstanceResponse:
        """
        Description: 使用 InstanceUpdate 更新实例名称和描述
        Summary: instance update
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sofamq_instance_ex(request, headers, runtime)

    async def update_sofamq_instance_async(
        self,
        request: mq_models.UpdateSofamqInstanceRequest,
    ) -> mq_models.UpdateSofamqInstanceResponse:
        """
        Description: 使用 InstanceUpdate 更新实例名称和描述
        Summary: instance update
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sofamq_instance_ex_async(request, headers, runtime)

    def update_sofamq_instance_ex(
        self,
        request: mq_models.UpdateSofamqInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqInstanceResponse:
        """
        Description: 使用 InstanceUpdate 更新实例名称和描述
        Summary: instance update
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqInstanceResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.instance.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sofamq_instance_ex_async(
        self,
        request: mq_models.UpdateSofamqInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqInstanceResponse:
        """
        Description: 使用 InstanceUpdate 更新实例名称和描述
        Summary: instance update
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqInstanceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.instance.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_group(
        self,
        request: mq_models.CreateSofamqGroupRequest,
    ) -> mq_models.CreateSofamqGroupResponse:
        """
        Description: 创建 Group ID。创建的 Group ID 用于发布和订阅消息。
        Summary: 创建Group
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_group_ex(request, headers, runtime)

    async def create_sofamq_group_async(
        self,
        request: mq_models.CreateSofamqGroupRequest,
    ) -> mq_models.CreateSofamqGroupResponse:
        """
        Description: 创建 Group ID。创建的 Group ID 用于发布和订阅消息。
        Summary: 创建Group
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_group_ex_async(request, headers, runtime)

    def create_sofamq_group_ex(
        self,
        request: mq_models.CreateSofamqGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqGroupResponse:
        """
        Description: 创建 Group ID。创建的 Group ID 用于发布和订阅消息。
        Summary: 创建Group
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqGroupResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.group.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_group_ex_async(
        self,
        request: mq_models.CreateSofamqGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqGroupResponse:
        """
        Description: 创建 Group ID。创建的 Group ID 用于发布和订阅消息。
        Summary: 创建Group
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqGroupResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.group.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_group(
        self,
        request: mq_models.ListSofamqGroupRequest,
    ) -> mq_models.ListSofamqGroupResponse:
        """
        Description: 查询指定环境实例下 Group ID 资源的信息列表。
        Summary: 查询Group列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_group_ex(request, headers, runtime)

    async def list_sofamq_group_async(
        self,
        request: mq_models.ListSofamqGroupRequest,
    ) -> mq_models.ListSofamqGroupResponse:
        """
        Description: 查询指定环境实例下 Group ID 资源的信息列表。
        Summary: 查询Group列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_group_ex_async(request, headers, runtime)

    def list_sofamq_group_ex(
        self,
        request: mq_models.ListSofamqGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqGroupResponse:
        """
        Description: 查询指定环境实例下 Group ID 资源的信息列表。
        Summary: 查询Group列表
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqGroupResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.group.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_group_ex_async(
        self,
        request: mq_models.ListSofamqGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqGroupResponse:
        """
        Description: 查询指定环境实例下 Group ID 资源的信息列表。
        Summary: 查询Group列表
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqGroupResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.group.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_group(
        self,
        request: mq_models.DeleteSofamqGroupRequest,
    ) -> mq_models.DeleteSofamqGroupResponse:
        """
        Description: 删除指定的 Group。
        Summary: 删除Group
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_group_ex(request, headers, runtime)

    async def delete_sofamq_group_async(
        self,
        request: mq_models.DeleteSofamqGroupRequest,
    ) -> mq_models.DeleteSofamqGroupResponse:
        """
        Description: 删除指定的 Group。
        Summary: 删除Group
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_group_ex_async(request, headers, runtime)

    def delete_sofamq_group_ex(
        self,
        request: mq_models.DeleteSofamqGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqGroupResponse:
        """
        Description: 删除指定的 Group。
        Summary: 删除Group
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqGroupResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.group.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_group_ex_async(
        self,
        request: mq_models.DeleteSofamqGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqGroupResponse:
        """
        Description: 删除指定的 Group。
        Summary: 删除Group
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqGroupResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.group.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sofamq_group(
        self,
        request: mq_models.UpdateSofamqGroupRequest,
    ) -> mq_models.UpdateSofamqGroupResponse:
        """
        Description: 更新指定 Group 的读权限配置。
        Summary: 更新Group读权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sofamq_group_ex(request, headers, runtime)

    async def update_sofamq_group_async(
        self,
        request: mq_models.UpdateSofamqGroupRequest,
    ) -> mq_models.UpdateSofamqGroupResponse:
        """
        Description: 更新指定 Group 的读权限配置。
        Summary: 更新Group读权限
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sofamq_group_ex_async(request, headers, runtime)

    def update_sofamq_group_ex(
        self,
        request: mq_models.UpdateSofamqGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqGroupResponse:
        """
        Description: 更新指定 Group 的读权限配置。
        Summary: 更新Group读权限
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqGroupResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.group.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sofamq_group_ex_async(
        self,
        request: mq_models.UpdateSofamqGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqGroupResponse:
        """
        Description: 更新指定 Group 的读权限配置。
        Summary: 更新Group读权限
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqGroupResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.group.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_topicstatus(
        self,
        request: mq_models.QuerySofamqTopicstatusRequest,
    ) -> mq_models.QuerySofamqTopicstatusResponse:
        """
        Description: 查询指定的 Topic 下的消息总量以及 Topic 的最后更新时间。
        Summary: 查询Topic状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_topicstatus_ex(request, headers, runtime)

    async def query_sofamq_topicstatus_async(
        self,
        request: mq_models.QuerySofamqTopicstatusRequest,
    ) -> mq_models.QuerySofamqTopicstatusResponse:
        """
        Description: 查询指定的 Topic 下的消息总量以及 Topic 的最后更新时间。
        Summary: 查询Topic状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_topicstatus_ex_async(request, headers, runtime)

    def query_sofamq_topicstatus_ex(
        self,
        request: mq_models.QuerySofamqTopicstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqTopicstatusResponse:
        """
        Description: 查询指定的 Topic 下的消息总量以及 Topic 的最后更新时间。
        Summary: 查询Topic状态
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqTopicstatusResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.topicstatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_topicstatus_ex_async(
        self,
        request: mq_models.QuerySofamqTopicstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqTopicstatusResponse:
        """
        Description: 查询指定的 Topic 下的消息总量以及 Topic 的最后更新时间。
        Summary: 查询Topic状态
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqTopicstatusResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.topicstatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_topicsubdetail(
        self,
        request: mq_models.QuerySofamqTopicsubdetailRequest,
    ) -> mq_models.QuerySofamqTopicsubdetailResponse:
        """
        Description: 查询指定的 Topic 被哪些在线的订阅组订阅了。
        Summary: 查看在线订阅组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_topicsubdetail_ex(request, headers, runtime)

    async def query_sofamq_topicsubdetail_async(
        self,
        request: mq_models.QuerySofamqTopicsubdetailRequest,
    ) -> mq_models.QuerySofamqTopicsubdetailResponse:
        """
        Description: 查询指定的 Topic 被哪些在线的订阅组订阅了。
        Summary: 查看在线订阅组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_topicsubdetail_ex_async(request, headers, runtime)

    def query_sofamq_topicsubdetail_ex(
        self,
        request: mq_models.QuerySofamqTopicsubdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqTopicsubdetailResponse:
        """
        Description: 查询指定的 Topic 被哪些在线的订阅组订阅了。
        Summary: 查看在线订阅组
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqTopicsubdetailResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.topicsubdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_topicsubdetail_ex_async(
        self,
        request: mq_models.QuerySofamqTopicsubdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqTopicsubdetailResponse:
        """
        Description: 查询指定的 Topic 被哪些在线的订阅组订阅了。
        Summary: 查看在线订阅组
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqTopicsubdetailResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.topicsubdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_node(
        self,
        request: mq_models.ListSofamqNodeRequest,
    ) -> mq_models.ListSofamqNodeResponse:
        """
        Description: node list
        Summary: node list
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_node_ex(request, headers, runtime)

    async def list_sofamq_node_async(
        self,
        request: mq_models.ListSofamqNodeRequest,
    ) -> mq_models.ListSofamqNodeResponse:
        """
        Description: node list
        Summary: node list
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_node_ex_async(request, headers, runtime)

    def list_sofamq_node_ex(
        self,
        request: mq_models.ListSofamqNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqNodeResponse:
        """
        Description: node list
        Summary: node list
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqNodeResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.node.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_node_ex_async(
        self,
        request: mq_models.ListSofamqNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqNodeResponse:
        """
        Description: node list
        Summary: node list
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqNodeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.node.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_node(
        self,
        request: mq_models.CreateSofamqNodeRequest,
    ) -> mq_models.CreateSofamqNodeResponse:
        """
        Description: create node
        Summary: create node
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_node_ex(request, headers, runtime)

    async def create_sofamq_node_async(
        self,
        request: mq_models.CreateSofamqNodeRequest,
    ) -> mq_models.CreateSofamqNodeResponse:
        """
        Description: create node
        Summary: create node
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_node_ex_async(request, headers, runtime)

    def create_sofamq_node_ex(
        self,
        request: mq_models.CreateSofamqNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqNodeResponse:
        """
        Description: create node
        Summary: create node
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqNodeResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.node.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_node_ex_async(
        self,
        request: mq_models.CreateSofamqNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqNodeResponse:
        """
        Description: create node
        Summary: create node
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqNodeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.node.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_room(
        self,
        request: mq_models.CreateSofamqRoomRequest,
    ) -> mq_models.CreateSofamqRoomResponse:
        """
        Description: room create
        Summary: room create
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_room_ex(request, headers, runtime)

    async def create_sofamq_room_async(
        self,
        request: mq_models.CreateSofamqRoomRequest,
    ) -> mq_models.CreateSofamqRoomResponse:
        """
        Description: room create
        Summary: room create
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_room_ex_async(request, headers, runtime)

    def create_sofamq_room_ex(
        self,
        request: mq_models.CreateSofamqRoomRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqRoomResponse:
        """
        Description: room create
        Summary: room create
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqRoomResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.room.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_room_ex_async(
        self,
        request: mq_models.CreateSofamqRoomRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqRoomResponse:
        """
        Description: room create
        Summary: room create
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqRoomResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.room.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_cell(
        self,
        request: mq_models.CreateSofamqCellRequest,
    ) -> mq_models.CreateSofamqCellResponse:
        """
        Description: create cell
        Summary: create cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_cell_ex(request, headers, runtime)

    async def create_sofamq_cell_async(
        self,
        request: mq_models.CreateSofamqCellRequest,
    ) -> mq_models.CreateSofamqCellResponse:
        """
        Description: create cell
        Summary: create cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_cell_ex_async(request, headers, runtime)

    def create_sofamq_cell_ex(
        self,
        request: mq_models.CreateSofamqCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqCellResponse:
        """
        Description: create cell
        Summary: create cell
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqCellResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.cell.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_cell_ex_async(
        self,
        request: mq_models.CreateSofamqCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqCellResponse:
        """
        Description: create cell
        Summary: create cell
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqCellResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.cell.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_cluster(
        self,
        request: mq_models.CreateSofamqClusterRequest,
    ) -> mq_models.CreateSofamqClusterResponse:
        """
        Description: create cluster
        Summary: create cluster
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_cluster_ex(request, headers, runtime)

    async def create_sofamq_cluster_async(
        self,
        request: mq_models.CreateSofamqClusterRequest,
    ) -> mq_models.CreateSofamqClusterResponse:
        """
        Description: create cluster
        Summary: create cluster
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_cluster_ex_async(request, headers, runtime)

    def create_sofamq_cluster_ex(
        self,
        request: mq_models.CreateSofamqClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqClusterResponse:
        """
        Description: create cluster
        Summary: create cluster
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqClusterResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.cluster.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_cluster_ex_async(
        self,
        request: mq_models.CreateSofamqClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqClusterResponse:
        """
        Description: create cluster
        Summary: create cluster
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqClusterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.cluster.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_namespace(
        self,
        request: mq_models.CreateSofamqNamespaceRequest,
    ) -> mq_models.CreateSofamqNamespaceResponse:
        """
        Description: create namespace
        Summary: create namespace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_namespace_ex(request, headers, runtime)

    async def create_sofamq_namespace_async(
        self,
        request: mq_models.CreateSofamqNamespaceRequest,
    ) -> mq_models.CreateSofamqNamespaceResponse:
        """
        Description: create namespace
        Summary: create namespace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_namespace_ex_async(request, headers, runtime)

    def create_sofamq_namespace_ex(
        self,
        request: mq_models.CreateSofamqNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqNamespaceResponse:
        """
        Description: create namespace
        Summary: create namespace
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqNamespaceResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.namespace.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_namespace_ex_async(
        self,
        request: mq_models.CreateSofamqNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqNamespaceResponse:
        """
        Description: create namespace
        Summary: create namespace
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqNamespaceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.namespace.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_room(
        self,
        request: mq_models.ListSofamqRoomRequest,
    ) -> mq_models.ListSofamqRoomResponse:
        """
        Description: room list
        Summary: room list
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_room_ex(request, headers, runtime)

    async def list_sofamq_room_async(
        self,
        request: mq_models.ListSofamqRoomRequest,
    ) -> mq_models.ListSofamqRoomResponse:
        """
        Description: room list
        Summary: room list
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_room_ex_async(request, headers, runtime)

    def list_sofamq_room_ex(
        self,
        request: mq_models.ListSofamqRoomRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqRoomResponse:
        """
        Description: room list
        Summary: room list
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqRoomResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.room.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_room_ex_async(
        self,
        request: mq_models.ListSofamqRoomRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqRoomResponse:
        """
        Description: room list
        Summary: room list
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqRoomResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.room.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_cell(
        self,
        request: mq_models.ListSofamqCellRequest,
    ) -> mq_models.ListSofamqCellResponse:
        """
        Description: 查询cell列表
        Summary: 查询cell列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_cell_ex(request, headers, runtime)

    async def list_sofamq_cell_async(
        self,
        request: mq_models.ListSofamqCellRequest,
    ) -> mq_models.ListSofamqCellResponse:
        """
        Description: 查询cell列表
        Summary: 查询cell列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_cell_ex_async(request, headers, runtime)

    def list_sofamq_cell_ex(
        self,
        request: mq_models.ListSofamqCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqCellResponse:
        """
        Description: 查询cell列表
        Summary: 查询cell列表
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqCellResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.cell.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_cell_ex_async(
        self,
        request: mq_models.ListSofamqCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqCellResponse:
        """
        Description: 查询cell列表
        Summary: 查询cell列表
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqCellResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.cell.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_cluster(
        self,
        request: mq_models.ListSofamqClusterRequest,
    ) -> mq_models.ListSofamqClusterResponse:
        """
        Description: list cluster
        Summary: list cluster
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_cluster_ex(request, headers, runtime)

    async def list_sofamq_cluster_async(
        self,
        request: mq_models.ListSofamqClusterRequest,
    ) -> mq_models.ListSofamqClusterResponse:
        """
        Description: list cluster
        Summary: list cluster
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_cluster_ex_async(request, headers, runtime)

    def list_sofamq_cluster_ex(
        self,
        request: mq_models.ListSofamqClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqClusterResponse:
        """
        Description: list cluster
        Summary: list cluster
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqClusterResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.cluster.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_cluster_ex_async(
        self,
        request: mq_models.ListSofamqClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqClusterResponse:
        """
        Description: list cluster
        Summary: list cluster
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqClusterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.cluster.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_groupsubdetail(
        self,
        request: mq_models.QuerySofamqGroupsubdetailRequest,
    ) -> mq_models.QuerySofamqGroupsubdetailResponse:
        """
        Description: 查看指定的 Group ID 订阅了哪些 Topic。如果 Group ID 对应的消费者实例不在线，则查不到数据。
        Summary: 查看在线订阅组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_groupsubdetail_ex(request, headers, runtime)

    async def query_sofamq_groupsubdetail_async(
        self,
        request: mq_models.QuerySofamqGroupsubdetailRequest,
    ) -> mq_models.QuerySofamqGroupsubdetailResponse:
        """
        Description: 查看指定的 Group ID 订阅了哪些 Topic。如果 Group ID 对应的消费者实例不在线，则查不到数据。
        Summary: 查看在线订阅组
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_groupsubdetail_ex_async(request, headers, runtime)

    def query_sofamq_groupsubdetail_ex(
        self,
        request: mq_models.QuerySofamqGroupsubdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqGroupsubdetailResponse:
        """
        Description: 查看指定的 Group ID 订阅了哪些 Topic。如果 Group ID 对应的消费者实例不在线，则查不到数据。
        Summary: 查看在线订阅组
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqGroupsubdetailResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.groupsubdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_groupsubdetail_ex_async(
        self,
        request: mq_models.QuerySofamqGroupsubdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqGroupsubdetailResponse:
        """
        Description: 查看指定的 Group ID 订阅了哪些 Topic。如果 Group ID 对应的消费者实例不在线，则查不到数据。
        Summary: 查看在线订阅组
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqGroupsubdetailResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.groupsubdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sofamq_instancebaseinfo(
        self,
        request: mq_models.GetSofamqInstancebaseinfoRequest,
    ) -> mq_models.GetSofamqInstancebaseinfoResponse:
        """
        Description: 查询实例基本信息和收发消息的接入点
        Summary: 查询实例基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sofamq_instancebaseinfo_ex(request, headers, runtime)

    async def get_sofamq_instancebaseinfo_async(
        self,
        request: mq_models.GetSofamqInstancebaseinfoRequest,
    ) -> mq_models.GetSofamqInstancebaseinfoResponse:
        """
        Description: 查询实例基本信息和收发消息的接入点
        Summary: 查询实例基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sofamq_instancebaseinfo_ex_async(request, headers, runtime)

    def get_sofamq_instancebaseinfo_ex(
        self,
        request: mq_models.GetSofamqInstancebaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetSofamqInstancebaseinfoResponse:
        """
        Description: 查询实例基本信息和收发消息的接入点
        Summary: 查询实例基本信息
        """
        UtilClient.validate_model(request)
        return mq_models.GetSofamqInstancebaseinfoResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.instancebaseinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sofamq_instancebaseinfo_ex_async(
        self,
        request: mq_models.GetSofamqInstancebaseinfoRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetSofamqInstancebaseinfoResponse:
        """
        Description: 查询实例基本信息和收发消息的接入点
        Summary: 查询实例基本信息
        """
        UtilClient.validate_model(request)
        return mq_models.GetSofamqInstancebaseinfoResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.instancebaseinfo.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_sofamq_consumerresetoffset(
        self,
        request: mq_models.ExecSofamqConsumerresetoffsetRequest,
    ) -> mq_models.ExecSofamqConsumerresetoffsetResponse:
        """
        Description: 重置指定的 Group ID 的消费位点到指定时间戳。本接口一般用于清理堆积消息，或者回溯消费。提供以下两种清理方式：清理所有消息、清理消费进度到指定的时间。
        Summary: 重置消费位点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_sofamq_consumerresetoffset_ex(request, headers, runtime)

    async def exec_sofamq_consumerresetoffset_async(
        self,
        request: mq_models.ExecSofamqConsumerresetoffsetRequest,
    ) -> mq_models.ExecSofamqConsumerresetoffsetResponse:
        """
        Description: 重置指定的 Group ID 的消费位点到指定时间戳。本接口一般用于清理堆积消息，或者回溯消费。提供以下两种清理方式：清理所有消息、清理消费进度到指定的时间。
        Summary: 重置消费位点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_sofamq_consumerresetoffset_ex_async(request, headers, runtime)

    def exec_sofamq_consumerresetoffset_ex(
        self,
        request: mq_models.ExecSofamqConsumerresetoffsetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ExecSofamqConsumerresetoffsetResponse:
        """
        Description: 重置指定的 Group ID 的消费位点到指定时间戳。本接口一般用于清理堆积消息，或者回溯消费。提供以下两种清理方式：清理所有消息、清理消费进度到指定的时间。
        Summary: 重置消费位点
        """
        UtilClient.validate_model(request)
        return mq_models.ExecSofamqConsumerresetoffsetResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.consumerresetoffset.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_sofamq_consumerresetoffset_ex_async(
        self,
        request: mq_models.ExecSofamqConsumerresetoffsetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ExecSofamqConsumerresetoffsetResponse:
        """
        Description: 重置指定的 Group ID 的消费位点到指定时间戳。本接口一般用于清理堆积消息，或者回溯消费。提供以下两种清理方式：清理所有消息、清理消费进度到指定的时间。
        Summary: 重置消费位点
        """
        UtilClient.validate_model(request)
        return mq_models.ExecSofamqConsumerresetoffsetResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.consumerresetoffset.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_consumeraccumulate(
        self,
        request: mq_models.QuerySofamqConsumeraccumulateRequest,
    ) -> mq_models.QuerySofamqConsumeraccumulateResponse:
        """
        Description: 消费堆积查询一般在生产环境中需要关注 Group ID 消费进度时使用，用于粗略判断消息消费情况和延迟情况。您不仅可以查到该 Group ID 订阅的所有 Topic 的消息堆积情况，还可以查到每个 Topic 各自的消息堆积情况。
        Summary: 消费者堆积查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_consumeraccumulate_ex(request, headers, runtime)

    async def query_sofamq_consumeraccumulate_async(
        self,
        request: mq_models.QuerySofamqConsumeraccumulateRequest,
    ) -> mq_models.QuerySofamqConsumeraccumulateResponse:
        """
        Description: 消费堆积查询一般在生产环境中需要关注 Group ID 消费进度时使用，用于粗略判断消息消费情况和延迟情况。您不仅可以查到该 Group ID 订阅的所有 Topic 的消息堆积情况，还可以查到每个 Topic 各自的消息堆积情况。
        Summary: 消费者堆积查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_consumeraccumulate_ex_async(request, headers, runtime)

    def query_sofamq_consumeraccumulate_ex(
        self,
        request: mq_models.QuerySofamqConsumeraccumulateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConsumeraccumulateResponse:
        """
        Description: 消费堆积查询一般在生产环境中需要关注 Group ID 消费进度时使用，用于粗略判断消息消费情况和延迟情况。您不仅可以查到该 Group ID 订阅的所有 Topic 的消息堆积情况，还可以查到每个 Topic 各自的消息堆积情况。
        Summary: 消费者堆积查询
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConsumeraccumulateResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.consumeraccumulate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_consumeraccumulate_ex_async(
        self,
        request: mq_models.QuerySofamqConsumeraccumulateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConsumeraccumulateResponse:
        """
        Description: 消费堆积查询一般在生产环境中需要关注 Group ID 消费进度时使用，用于粗略判断消息消费情况和延迟情况。您不仅可以查到该 Group ID 订阅的所有 Topic 的消息堆积情况，还可以查到每个 Topic 各自的消息堆积情况。
        Summary: 消费者堆积查询
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConsumeraccumulateResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.consumeraccumulate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_consumerconnection(
        self,
        request: mq_models.QuerySofamqConsumerconnectionRequest,
    ) -> mq_models.QuerySofamqConsumerconnectionResponse:
        """
        Description: 判断指定 Group ID 的消费者是否在线，并获取详细的客户端连接的列表。
        Summary: 查询指定当前客户端的连接情况。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_consumerconnection_ex(request, headers, runtime)

    async def query_sofamq_consumerconnection_async(
        self,
        request: mq_models.QuerySofamqConsumerconnectionRequest,
    ) -> mq_models.QuerySofamqConsumerconnectionResponse:
        """
        Description: 判断指定 Group ID 的消费者是否在线，并获取详细的客户端连接的列表。
        Summary: 查询指定当前客户端的连接情况。
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_consumerconnection_ex_async(request, headers, runtime)

    def query_sofamq_consumerconnection_ex(
        self,
        request: mq_models.QuerySofamqConsumerconnectionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConsumerconnectionResponse:
        """
        Description: 判断指定 Group ID 的消费者是否在线，并获取详细的客户端连接的列表。
        Summary: 查询指定当前客户端的连接情况。
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConsumerconnectionResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.consumerconnection.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_consumerconnection_ex_async(
        self,
        request: mq_models.QuerySofamqConsumerconnectionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConsumerconnectionResponse:
        """
        Description: 判断指定 Group ID 的消费者是否在线，并获取详细的客户端连接的列表。
        Summary: 查询指定当前客户端的连接情况。
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConsumerconnectionResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.consumerconnection.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_consumertimespan(
        self,
        request: mq_models.QuerySofamqConsumertimespanRequest,
    ) -> mq_models.QuerySofamqConsumertimespanResponse:
        """
        Description: 查询指定的 Group ID 订阅的 Topic 的最新消息时间戳以及消费的最新时间。可以查询某个 Topic 当前服务器上存在的消息的最新时间和最早时间，以及查询消费端最近消费的时间。本接口一般用于展示消费进度的概况，与 QueryMqSofamqConsumerAccumulate 接口配合使用。
        Summary: 查询时间跨度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_consumertimespan_ex(request, headers, runtime)

    async def query_sofamq_consumertimespan_async(
        self,
        request: mq_models.QuerySofamqConsumertimespanRequest,
    ) -> mq_models.QuerySofamqConsumertimespanResponse:
        """
        Description: 查询指定的 Group ID 订阅的 Topic 的最新消息时间戳以及消费的最新时间。可以查询某个 Topic 当前服务器上存在的消息的最新时间和最早时间，以及查询消费端最近消费的时间。本接口一般用于展示消费进度的概况，与 QueryMqSofamqConsumerAccumulate 接口配合使用。
        Summary: 查询时间跨度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_consumertimespan_ex_async(request, headers, runtime)

    def query_sofamq_consumertimespan_ex(
        self,
        request: mq_models.QuerySofamqConsumertimespanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConsumertimespanResponse:
        """
        Description: 查询指定的 Group ID 订阅的 Topic 的最新消息时间戳以及消费的最新时间。可以查询某个 Topic 当前服务器上存在的消息的最新时间和最早时间，以及查询消费端最近消费的时间。本接口一般用于展示消费进度的概况，与 QueryMqSofamqConsumerAccumulate 接口配合使用。
        Summary: 查询时间跨度
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConsumertimespanResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.consumertimespan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_consumertimespan_ex_async(
        self,
        request: mq_models.QuerySofamqConsumertimespanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConsumertimespanResponse:
        """
        Description: 查询指定的 Group ID 订阅的 Topic 的最新消息时间戳以及消费的最新时间。可以查询某个 Topic 当前服务器上存在的消息的最新时间和最早时间，以及查询消费端最近消费的时间。本接口一般用于展示消费进度的概况，与 QueryMqSofamqConsumerAccumulate 接口配合使用。
        Summary: 查询时间跨度
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConsumertimespanResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.consumertimespan.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_messagetrace(
        self,
        request: mq_models.QuerySofamqMessagetraceRequest,
    ) -> mq_models.QuerySofamqMessagetraceResponse:
        """
        Description: 本接口的实现基于消息队列 Sofamq的内部位点机制，在大部分场景下判断结果可信，但如果应用方进行过重置位点已经清除消息等操作，则判断结果可能有误。
        Summary: 判断目标消息是否曾被消费过
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_messagetrace_ex(request, headers, runtime)

    async def query_sofamq_messagetrace_async(
        self,
        request: mq_models.QuerySofamqMessagetraceRequest,
    ) -> mq_models.QuerySofamqMessagetraceResponse:
        """
        Description: 本接口的实现基于消息队列 Sofamq的内部位点机制，在大部分场景下判断结果可信，但如果应用方进行过重置位点已经清除消息等操作，则判断结果可能有误。
        Summary: 判断目标消息是否曾被消费过
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_messagetrace_ex_async(request, headers, runtime)

    def query_sofamq_messagetrace_ex(
        self,
        request: mq_models.QuerySofamqMessagetraceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqMessagetraceResponse:
        """
        Description: 本接口的实现基于消息队列 Sofamq的内部位点机制，在大部分场景下判断结果可信，但如果应用方进行过重置位点已经清除消息等操作，则判断结果可能有误。
        Summary: 判断目标消息是否曾被消费过
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqMessagetraceResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.messagetrace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_messagetrace_ex_async(
        self,
        request: mq_models.QuerySofamqMessagetraceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqMessagetraceResponse:
        """
        Description: 本接口的实现基于消息队列 Sofamq的内部位点机制，在大部分场景下判断结果可信，但如果应用方进行过重置位点已经清除消息等操作，则判断结果可能有误。
        Summary: 判断目标消息是否曾被消费过
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqMessagetraceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.messagetrace.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sofamq_messagebymsgid(
        self,
        request: mq_models.GetSofamqMessagebymsgidRequest,
    ) -> mq_models.GetSofamqMessagebymsgidResponse:
        """
        Description: 根据指定的 Message ID，查询消息。该查询方式属于精确查询。查询条件需要的 Message ID 从每次消息发送成功的 SendResult 中获取，因此业务方必须存储每次发送消息的结果。
        Summary: 按Message ID查询消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sofamq_messagebymsgid_ex(request, headers, runtime)

    async def get_sofamq_messagebymsgid_async(
        self,
        request: mq_models.GetSofamqMessagebymsgidRequest,
    ) -> mq_models.GetSofamqMessagebymsgidResponse:
        """
        Description: 根据指定的 Message ID，查询消息。该查询方式属于精确查询。查询条件需要的 Message ID 从每次消息发送成功的 SendResult 中获取，因此业务方必须存储每次发送消息的结果。
        Summary: 按Message ID查询消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sofamq_messagebymsgid_ex_async(request, headers, runtime)

    def get_sofamq_messagebymsgid_ex(
        self,
        request: mq_models.GetSofamqMessagebymsgidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetSofamqMessagebymsgidResponse:
        """
        Description: 根据指定的 Message ID，查询消息。该查询方式属于精确查询。查询条件需要的 Message ID 从每次消息发送成功的 SendResult 中获取，因此业务方必须存储每次发送消息的结果。
        Summary: 按Message ID查询消息
        """
        UtilClient.validate_model(request)
        return mq_models.GetSofamqMessagebymsgidResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.messagebymsgid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sofamq_messagebymsgid_ex_async(
        self,
        request: mq_models.GetSofamqMessagebymsgidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetSofamqMessagebymsgidResponse:
        """
        Description: 根据指定的 Message ID，查询消息。该查询方式属于精确查询。查询条件需要的 Message ID 从每次消息发送成功的 SendResult 中获取，因此业务方必须存储每次发送消息的结果。
        Summary: 按Message ID查询消息
        """
        UtilClient.validate_model(request)
        return mq_models.GetSofamqMessagebymsgidResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.messagebymsgid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_messagebykey(
        self,
        request: mq_models.QuerySofamqMessagebykeyRequest,
    ) -> mq_models.QuerySofamqMessagebykeyResponse:
        """
        Description: 根据指定的 Message Key，查询消息，该查询方式属于模糊查询。由于业务方的 Key 可能不唯一，所以查询结果可能为多条。
        Summary: 按Message Key查询消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_messagebykey_ex(request, headers, runtime)

    async def query_sofamq_messagebykey_async(
        self,
        request: mq_models.QuerySofamqMessagebykeyRequest,
    ) -> mq_models.QuerySofamqMessagebykeyResponse:
        """
        Description: 根据指定的 Message Key，查询消息，该查询方式属于模糊查询。由于业务方的 Key 可能不唯一，所以查询结果可能为多条。
        Summary: 按Message Key查询消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_messagebykey_ex_async(request, headers, runtime)

    def query_sofamq_messagebykey_ex(
        self,
        request: mq_models.QuerySofamqMessagebykeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqMessagebykeyResponse:
        """
        Description: 根据指定的 Message Key，查询消息，该查询方式属于模糊查询。由于业务方的 Key 可能不唯一，所以查询结果可能为多条。
        Summary: 按Message Key查询消息
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqMessagebykeyResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.messagebykey.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_messagebykey_ex_async(
        self,
        request: mq_models.QuerySofamqMessagebykeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqMessagebykeyResponse:
        """
        Description: 根据指定的 Message Key，查询消息，该查询方式属于模糊查询。由于业务方的 Key 可能不唯一，所以查询结果可能为多条。
        Summary: 按Message Key查询消息
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqMessagebykeyResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.messagebykey.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sofamq_tracebymsgid(
        self,
        request: mq_models.GetSofamqTracebymsgidRequest,
    ) -> mq_models.GetSofamqTracebymsgidResponse:
        """
        Description: 已记录了某消息的 Message ID，如需根据此 Message ID 查询该消息的投递轨迹信息，可调用本接口创建查询任务。本接口返回任务 ID 后，可调用 GetMqSofamqTraceResult 接口传入任务 ID，以获取轨迹查询结果。
        Summary: 通过MsgId创建轨迹查询任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sofamq_tracebymsgid_ex(request, headers, runtime)

    async def get_sofamq_tracebymsgid_async(
        self,
        request: mq_models.GetSofamqTracebymsgidRequest,
    ) -> mq_models.GetSofamqTracebymsgidResponse:
        """
        Description: 已记录了某消息的 Message ID，如需根据此 Message ID 查询该消息的投递轨迹信息，可调用本接口创建查询任务。本接口返回任务 ID 后，可调用 GetMqSofamqTraceResult 接口传入任务 ID，以获取轨迹查询结果。
        Summary: 通过MsgId创建轨迹查询任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sofamq_tracebymsgid_ex_async(request, headers, runtime)

    def get_sofamq_tracebymsgid_ex(
        self,
        request: mq_models.GetSofamqTracebymsgidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetSofamqTracebymsgidResponse:
        """
        Description: 已记录了某消息的 Message ID，如需根据此 Message ID 查询该消息的投递轨迹信息，可调用本接口创建查询任务。本接口返回任务 ID 后，可调用 GetMqSofamqTraceResult 接口传入任务 ID，以获取轨迹查询结果。
        Summary: 通过MsgId创建轨迹查询任务
        """
        UtilClient.validate_model(request)
        return mq_models.GetSofamqTracebymsgidResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.tracebymsgid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sofamq_tracebymsgid_ex_async(
        self,
        request: mq_models.GetSofamqTracebymsgidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetSofamqTracebymsgidResponse:
        """
        Description: 已记录了某消息的 Message ID，如需根据此 Message ID 查询该消息的投递轨迹信息，可调用本接口创建查询任务。本接口返回任务 ID 后，可调用 GetMqSofamqTraceResult 接口传入任务 ID，以获取轨迹查询结果。
        Summary: 通过MsgId创建轨迹查询任务
        """
        UtilClient.validate_model(request)
        return mq_models.GetSofamqTracebymsgidResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.tracebymsgid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_tracebymsgkey(
        self,
        request: mq_models.QuerySofamqTracebymsgkeyRequest,
    ) -> mq_models.QuerySofamqTracebymsgkeyResponse:
        """
        Description: 已记录了 Message Key ，如需根据此 Message Key 查询该消息的投递轨迹信息，即可调用本接口创建查询任务。
        Summary: 通过MsgKey创建轨迹查询任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_tracebymsgkey_ex(request, headers, runtime)

    async def query_sofamq_tracebymsgkey_async(
        self,
        request: mq_models.QuerySofamqTracebymsgkeyRequest,
    ) -> mq_models.QuerySofamqTracebymsgkeyResponse:
        """
        Description: 已记录了 Message Key ，如需根据此 Message Key 查询该消息的投递轨迹信息，即可调用本接口创建查询任务。
        Summary: 通过MsgKey创建轨迹查询任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_tracebymsgkey_ex_async(request, headers, runtime)

    def query_sofamq_tracebymsgkey_ex(
        self,
        request: mq_models.QuerySofamqTracebymsgkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqTracebymsgkeyResponse:
        """
        Description: 已记录了 Message Key ，如需根据此 Message Key 查询该消息的投递轨迹信息，即可调用本接口创建查询任务。
        Summary: 通过MsgKey创建轨迹查询任务
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqTracebymsgkeyResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.tracebymsgkey.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_tracebymsgkey_ex_async(
        self,
        request: mq_models.QuerySofamqTracebymsgkeyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqTracebymsgkeyResponse:
        """
        Description: 已记录了 Message Key ，如需根据此 Message Key 查询该消息的投递轨迹信息，即可调用本接口创建查询任务。
        Summary: 通过MsgKey创建轨迹查询任务
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqTracebymsgkeyResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.tracebymsgkey.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sofamq_traceresult(
        self,
        request: mq_models.GetSofamqTraceresultRequest,
    ) -> mq_models.GetSofamqTraceresultResponse:
        """
        Description: 已根据 Message ID 或者 Message Key 创建了轨迹查询任务，并得到了查询任务的 ID。此时，可调用本接口通过传入该查询任务 ID，获取对应的轨迹查询的结果明细。
        Summary: 获取轨迹查询结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sofamq_traceresult_ex(request, headers, runtime)

    async def get_sofamq_traceresult_async(
        self,
        request: mq_models.GetSofamqTraceresultRequest,
    ) -> mq_models.GetSofamqTraceresultResponse:
        """
        Description: 已根据 Message ID 或者 Message Key 创建了轨迹查询任务，并得到了查询任务的 ID。此时，可调用本接口通过传入该查询任务 ID，获取对应的轨迹查询的结果明细。
        Summary: 获取轨迹查询结果
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sofamq_traceresult_ex_async(request, headers, runtime)

    def get_sofamq_traceresult_ex(
        self,
        request: mq_models.GetSofamqTraceresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetSofamqTraceresultResponse:
        """
        Description: 已根据 Message ID 或者 Message Key 创建了轨迹查询任务，并得到了查询任务的 ID。此时，可调用本接口通过传入该查询任务 ID，获取对应的轨迹查询的结果明细。
        Summary: 获取轨迹查询结果
        """
        UtilClient.validate_model(request)
        return mq_models.GetSofamqTraceresultResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.traceresult.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sofamq_traceresult_ex_async(
        self,
        request: mq_models.GetSofamqTraceresultRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetSofamqTraceresultResponse:
        """
        Description: 已根据 Message ID 或者 Message Key 创建了轨迹查询任务，并得到了查询任务的 ID。此时，可调用本接口通过传入该查询任务 ID，获取对应的轨迹查询的结果明细。
        Summary: 获取轨迹查询结果
        """
        UtilClient.validate_model(request)
        return mq_models.GetSofamqTraceresultResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.traceresult.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_inputtps(
        self,
        request: mq_models.QuerySofamqInputtpsRequest,
    ) -> mq_models.QuerySofamqInputtpsResponse:
        """
        Description: 您可以使用本接口获取在线上环境统计的 Topic 的消息数据信息，可以根据需要择查询指定时间段内 Topic 的写入量或者 TPS 曲线数据。
        Summary: 查询一段时间写入报表数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_inputtps_ex(request, headers, runtime)

    async def query_sofamq_inputtps_async(
        self,
        request: mq_models.QuerySofamqInputtpsRequest,
    ) -> mq_models.QuerySofamqInputtpsResponse:
        """
        Description: 您可以使用本接口获取在线上环境统计的 Topic 的消息数据信息，可以根据需要择查询指定时间段内 Topic 的写入量或者 TPS 曲线数据。
        Summary: 查询一段时间写入报表数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_inputtps_ex_async(request, headers, runtime)

    def query_sofamq_inputtps_ex(
        self,
        request: mq_models.QuerySofamqInputtpsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqInputtpsResponse:
        """
        Description: 您可以使用本接口获取在线上环境统计的 Topic 的消息数据信息，可以根据需要择查询指定时间段内 Topic 的写入量或者 TPS 曲线数据。
        Summary: 查询一段时间写入报表数据
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqInputtpsResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.inputtps.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_inputtps_ex_async(
        self,
        request: mq_models.QuerySofamqInputtpsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqInputtpsResponse:
        """
        Description: 您可以使用本接口获取在线上环境统计的 Topic 的消息数据信息，可以根据需要择查询指定时间段内 Topic 的写入量或者 TPS 曲线数据。
        Summary: 查询一段时间写入报表数据
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqInputtpsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.inputtps.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_outputtps(
        self,
        request: mq_models.QuerySofamqOutputtpsRequest,
    ) -> mq_models.QuerySofamqOutputtpsResponse:
        """
        Description: 线上环境生成消费数据报表时，可以使用本接口查询指定的 Group ID 在一段时间内的以下统计信息：
        消费消息总量的统计曲线
        消费消息 TPS 的统计曲线
        Summary: 查询一段时间内消费消息统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_outputtps_ex(request, headers, runtime)

    async def query_sofamq_outputtps_async(
        self,
        request: mq_models.QuerySofamqOutputtpsRequest,
    ) -> mq_models.QuerySofamqOutputtpsResponse:
        """
        Description: 线上环境生成消费数据报表时，可以使用本接口查询指定的 Group ID 在一段时间内的以下统计信息：
        消费消息总量的统计曲线
        消费消息 TPS 的统计曲线
        Summary: 查询一段时间内消费消息统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_outputtps_ex_async(request, headers, runtime)

    def query_sofamq_outputtps_ex(
        self,
        request: mq_models.QuerySofamqOutputtpsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqOutputtpsResponse:
        """
        Description: 线上环境生成消费数据报表时，可以使用本接口查询指定的 Group ID 在一段时间内的以下统计信息：
        消费消息总量的统计曲线
        消费消息 TPS 的统计曲线
        Summary: 查询一段时间内消费消息统计信息
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqOutputtpsResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.outputtps.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_outputtps_ex_async(
        self,
        request: mq_models.QuerySofamqOutputtpsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqOutputtpsResponse:
        """
        Description: 线上环境生成消费数据报表时，可以使用本接口查询指定的 Group ID 在一段时间内的以下统计信息：
        消费消息总量的统计曲线
        消费消息 TPS 的统计曲线
        Summary: 查询一段时间内消费消息统计信息
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqOutputtpsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.outputtps.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sofamq_dlqbyid(
        self,
        request: mq_models.GetSofamqDlqbyidRequest,
    ) -> mq_models.GetSofamqDlqbyidResponse:
        """
        Description: 根据 Message ID，查询死信消息。该查询方式属于精确查询。查询条件需要的 Message ID 从消息发送成功的 SendResult 中获取，或者从批量查询的接口中获取。
        Summary: 按Message ID查询死信消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sofamq_dlqbyid_ex(request, headers, runtime)

    async def get_sofamq_dlqbyid_async(
        self,
        request: mq_models.GetSofamqDlqbyidRequest,
    ) -> mq_models.GetSofamqDlqbyidResponse:
        """
        Description: 根据 Message ID，查询死信消息。该查询方式属于精确查询。查询条件需要的 Message ID 从消息发送成功的 SendResult 中获取，或者从批量查询的接口中获取。
        Summary: 按Message ID查询死信消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sofamq_dlqbyid_ex_async(request, headers, runtime)

    def get_sofamq_dlqbyid_ex(
        self,
        request: mq_models.GetSofamqDlqbyidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetSofamqDlqbyidResponse:
        """
        Description: 根据 Message ID，查询死信消息。该查询方式属于精确查询。查询条件需要的 Message ID 从消息发送成功的 SendResult 中获取，或者从批量查询的接口中获取。
        Summary: 按Message ID查询死信消息
        """
        UtilClient.validate_model(request)
        return mq_models.GetSofamqDlqbyidResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.dlqbyid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sofamq_dlqbyid_ex_async(
        self,
        request: mq_models.GetSofamqDlqbyidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetSofamqDlqbyidResponse:
        """
        Description: 根据 Message ID，查询死信消息。该查询方式属于精确查询。查询条件需要的 Message ID 从消息发送成功的 SendResult 中获取，或者从批量查询的接口中获取。
        Summary: 按Message ID查询死信消息
        """
        UtilClient.validate_model(request)
        return mq_models.GetSofamqDlqbyidResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.dlqbyid.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_sofamq_dlqresendbyid(
        self,
        request: mq_models.ExecSofamqDlqresendbyidRequest,
    ) -> mq_models.ExecSofamqDlqresendbyidResponse:
        """
        Description: 重发指定 Message ID 的死信消息。使该死信消息复活，让消息能够被 Consumer 再消费一次。
        死信消息已达最大重试次数，若重发后再次消费失败，则死信队列中将增加一条 Message ID 相同的消息，可通过控制台死信队列的查询页面或者管控 API 查看该结果。您可通过同一 Message ID 的消息出现次数判断重发后依然消费失败的次数。
        Summary: 重新发送死信消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_sofamq_dlqresendbyid_ex(request, headers, runtime)

    async def exec_sofamq_dlqresendbyid_async(
        self,
        request: mq_models.ExecSofamqDlqresendbyidRequest,
    ) -> mq_models.ExecSofamqDlqresendbyidResponse:
        """
        Description: 重发指定 Message ID 的死信消息。使该死信消息复活，让消息能够被 Consumer 再消费一次。
        死信消息已达最大重试次数，若重发后再次消费失败，则死信队列中将增加一条 Message ID 相同的消息，可通过控制台死信队列的查询页面或者管控 API 查看该结果。您可通过同一 Message ID 的消息出现次数判断重发后依然消费失败的次数。
        Summary: 重新发送死信消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_sofamq_dlqresendbyid_ex_async(request, headers, runtime)

    def exec_sofamq_dlqresendbyid_ex(
        self,
        request: mq_models.ExecSofamqDlqresendbyidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ExecSofamqDlqresendbyidResponse:
        """
        Description: 重发指定 Message ID 的死信消息。使该死信消息复活，让消息能够被 Consumer 再消费一次。
        死信消息已达最大重试次数，若重发后再次消费失败，则死信队列中将增加一条 Message ID 相同的消息，可通过控制台死信队列的查询页面或者管控 API 查看该结果。您可通过同一 Message ID 的消息出现次数判断重发后依然消费失败的次数。
        Summary: 重新发送死信消息
        """
        UtilClient.validate_model(request)
        return mq_models.ExecSofamqDlqresendbyidResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.dlqresendbyid.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_sofamq_dlqresendbyid_ex_async(
        self,
        request: mq_models.ExecSofamqDlqresendbyidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ExecSofamqDlqresendbyidResponse:
        """
        Description: 重发指定 Message ID 的死信消息。使该死信消息复活，让消息能够被 Consumer 再消费一次。
        死信消息已达最大重试次数，若重发后再次消费失败，则死信队列中将增加一条 Message ID 相同的消息，可通过控制台死信队列的查询页面或者管控 API 查看该结果。您可通过同一 Message ID 的消息出现次数判断重发后依然消费失败的次数。
        Summary: 重新发送死信消息
        """
        UtilClient.validate_model(request)
        return mq_models.ExecSofamqDlqresendbyidResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.dlqresendbyid.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_namespace(
        self,
        request: mq_models.ListSofamqNamespaceRequest,
    ) -> mq_models.ListSofamqNamespaceResponse:
        """
        Description: list ns
        Summary: list ns
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_namespace_ex(request, headers, runtime)

    async def list_sofamq_namespace_async(
        self,
        request: mq_models.ListSofamqNamespaceRequest,
    ) -> mq_models.ListSofamqNamespaceResponse:
        """
        Description: list ns
        Summary: list ns
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_namespace_ex_async(request, headers, runtime)

    def list_sofamq_namespace_ex(
        self,
        request: mq_models.ListSofamqNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqNamespaceResponse:
        """
        Description: list ns
        Summary: list ns
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqNamespaceResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.namespace.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_namespace_ex_async(
        self,
        request: mq_models.ListSofamqNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqNamespaceResponse:
        """
        Description: list ns
        Summary: list ns
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqNamespaceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.namespace.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def send_sofamq_message(
        self,
        request: mq_models.SendSofamqMessageRequest,
    ) -> mq_models.SendSofamqMessageResponse:
        """
        Description: 发送测试消息
        Summary: 发送测试信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.send_sofamq_message_ex(request, headers, runtime)

    async def send_sofamq_message_async(
        self,
        request: mq_models.SendSofamqMessageRequest,
    ) -> mq_models.SendSofamqMessageResponse:
        """
        Description: 发送测试消息
        Summary: 发送测试信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.send_sofamq_message_ex_async(request, headers, runtime)

    def send_sofamq_message_ex(
        self,
        request: mq_models.SendSofamqMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.SendSofamqMessageResponse:
        """
        Description: 发送测试消息
        Summary: 发送测试信息
        """
        UtilClient.validate_model(request)
        return mq_models.SendSofamqMessageResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.message.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def send_sofamq_message_ex_async(
        self,
        request: mq_models.SendSofamqMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.SendSofamqMessageResponse:
        """
        Description: 发送测试消息
        Summary: 发送测试信息
        """
        UtilClient.validate_model(request)
        return mq_models.SendSofamqMessageResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.message.send', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_sofamq_message(
        self,
        request: mq_models.PushSofamqMessageRequest,
    ) -> mq_models.PushSofamqMessageResponse:
        """
        Description: 消费验证
        Summary: 消费验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_sofamq_message_ex(request, headers, runtime)

    async def push_sofamq_message_async(
        self,
        request: mq_models.PushSofamqMessageRequest,
    ) -> mq_models.PushSofamqMessageResponse:
        """
        Description: 消费验证
        Summary: 消费验证
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_sofamq_message_ex_async(request, headers, runtime)

    def push_sofamq_message_ex(
        self,
        request: mq_models.PushSofamqMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.PushSofamqMessageResponse:
        """
        Description: 消费验证
        Summary: 消费验证
        """
        UtilClient.validate_model(request)
        return mq_models.PushSofamqMessageResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.message.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_sofamq_message_ex_async(
        self,
        request: mq_models.PushSofamqMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.PushSofamqMessageResponse:
        """
        Description: 消费验证
        Summary: 消费验证
        """
        UtilClient.validate_model(request)
        return mq_models.PushSofamqMessageResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.message.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_nodebynamespaceid(
        self,
        request: mq_models.QuerySofamqNodebynamespaceidRequest,
    ) -> mq_models.QuerySofamqNodebynamespaceidResponse:
        """
        Description: getNodesByNamespaceId
        Summary: get nodes by ns id
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_nodebynamespaceid_ex(request, headers, runtime)

    async def query_sofamq_nodebynamespaceid_async(
        self,
        request: mq_models.QuerySofamqNodebynamespaceidRequest,
    ) -> mq_models.QuerySofamqNodebynamespaceidResponse:
        """
        Description: getNodesByNamespaceId
        Summary: get nodes by ns id
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_nodebynamespaceid_ex_async(request, headers, runtime)

    def query_sofamq_nodebynamespaceid_ex(
        self,
        request: mq_models.QuerySofamqNodebynamespaceidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqNodebynamespaceidResponse:
        """
        Description: getNodesByNamespaceId
        Summary: get nodes by ns id
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqNodebynamespaceidResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.nodebynamespaceid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_nodebynamespaceid_ex_async(
        self,
        request: mq_models.QuerySofamqNodebynamespaceidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqNodebynamespaceidResponse:
        """
        Description: getNodesByNamespaceId
        Summary: get nodes by ns id
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqNodebynamespaceidResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.nodebynamespaceid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_roombynamespaceid(
        self,
        request: mq_models.QuerySofamqRoombynamespaceidRequest,
    ) -> mq_models.QuerySofamqRoombynamespaceidResponse:
        """
        Description: query room by ns
        Summary: query room by ns
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_roombynamespaceid_ex(request, headers, runtime)

    async def query_sofamq_roombynamespaceid_async(
        self,
        request: mq_models.QuerySofamqRoombynamespaceidRequest,
    ) -> mq_models.QuerySofamqRoombynamespaceidResponse:
        """
        Description: query room by ns
        Summary: query room by ns
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_roombynamespaceid_ex_async(request, headers, runtime)

    def query_sofamq_roombynamespaceid_ex(
        self,
        request: mq_models.QuerySofamqRoombynamespaceidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqRoombynamespaceidResponse:
        """
        Description: query room by ns
        Summary: query room by ns
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqRoombynamespaceidResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.roombynamespaceid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_roombynamespaceid_ex_async(
        self,
        request: mq_models.QuerySofamqRoombynamespaceidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqRoombynamespaceidResponse:
        """
        Description: query room by ns
        Summary: query room by ns
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqRoombynamespaceidResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.roombynamespaceid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_messagebytopic(
        self,
        request: mq_models.QuerySofamqMessagebytopicRequest,
    ) -> mq_models.QuerySofamqMessagebytopicResponse:
        """
        Description: 通过传入 Topic 名称和时间段，分页查询指定时间段内该 Topic 内存在的所有消息。
        Summary: 按Topic查询消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_messagebytopic_ex(request, headers, runtime)

    async def query_sofamq_messagebytopic_async(
        self,
        request: mq_models.QuerySofamqMessagebytopicRequest,
    ) -> mq_models.QuerySofamqMessagebytopicResponse:
        """
        Description: 通过传入 Topic 名称和时间段，分页查询指定时间段内该 Topic 内存在的所有消息。
        Summary: 按Topic查询消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_messagebytopic_ex_async(request, headers, runtime)

    def query_sofamq_messagebytopic_ex(
        self,
        request: mq_models.QuerySofamqMessagebytopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqMessagebytopicResponse:
        """
        Description: 通过传入 Topic 名称和时间段，分页查询指定时间段内该 Topic 内存在的所有消息。
        Summary: 按Topic查询消息
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqMessagebytopicResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.messagebytopic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_messagebytopic_ex_async(
        self,
        request: mq_models.QuerySofamqMessagebytopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqMessagebytopicResponse:
        """
        Description: 通过传入 Topic 名称和时间段，分页查询指定时间段内该 Topic 内存在的所有消息。
        Summary: 按Topic查询消息
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqMessagebytopicResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.messagebytopic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_dlqbygroupid(
        self,
        request: mq_models.QuerySofamqDlqbygroupidRequest,
    ) -> mq_models.QuerySofamqDlqbygroupidResponse:
        """
        Description: 通过传入 Group ID 和时间段，分页查询指定时间段内该 Group ID 内存在的所有死信消息。
        Summary: 按Group ID查询死信消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_dlqbygroupid_ex(request, headers, runtime)

    async def query_sofamq_dlqbygroupid_async(
        self,
        request: mq_models.QuerySofamqDlqbygroupidRequest,
    ) -> mq_models.QuerySofamqDlqbygroupidResponse:
        """
        Description: 通过传入 Group ID 和时间段，分页查询指定时间段内该 Group ID 内存在的所有死信消息。
        Summary: 按Group ID查询死信消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_dlqbygroupid_ex_async(request, headers, runtime)

    def query_sofamq_dlqbygroupid_ex(
        self,
        request: mq_models.QuerySofamqDlqbygroupidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqDlqbygroupidResponse:
        """
        Description: 通过传入 Group ID 和时间段，分页查询指定时间段内该 Group ID 内存在的所有死信消息。
        Summary: 按Group ID查询死信消息
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqDlqbygroupidResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.dlqbygroupid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_dlqbygroupid_ex_async(
        self,
        request: mq_models.QuerySofamqDlqbygroupidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqDlqbygroupidResponse:
        """
        Description: 通过传入 Group ID 和时间段，分页查询指定时间段内该 Group ID 内存在的所有死信消息。
        Summary: 按Group ID查询死信消息
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqDlqbygroupidResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.dlqbygroupid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sofamq_consumerstatus(
        self,
        request: mq_models.GetSofamqConsumerstatusRequest,
    ) -> mq_models.GetSofamqConsumerstatusResponse:
        """
        Description: 查询指定 Group ID 的详细状态数据，包含订阅关系检查、消费 TPS 统计、负载均衡状态、消费端连接等。
        Summary: 查询消费状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sofamq_consumerstatus_ex(request, headers, runtime)

    async def get_sofamq_consumerstatus_async(
        self,
        request: mq_models.GetSofamqConsumerstatusRequest,
    ) -> mq_models.GetSofamqConsumerstatusResponse:
        """
        Description: 查询指定 Group ID 的详细状态数据，包含订阅关系检查、消费 TPS 统计、负载均衡状态、消费端连接等。
        Summary: 查询消费状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sofamq_consumerstatus_ex_async(request, headers, runtime)

    def get_sofamq_consumerstatus_ex(
        self,
        request: mq_models.GetSofamqConsumerstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetSofamqConsumerstatusResponse:
        """
        Description: 查询指定 Group ID 的详细状态数据，包含订阅关系检查、消费 TPS 统计、负载均衡状态、消费端连接等。
        Summary: 查询消费状态
        """
        UtilClient.validate_model(request)
        return mq_models.GetSofamqConsumerstatusResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.consumerstatus.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sofamq_consumerstatus_ex_async(
        self,
        request: mq_models.GetSofamqConsumerstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetSofamqConsumerstatusResponse:
        """
        Description: 查询指定 Group ID 的详细状态数据，包含订阅关系检查、消费 TPS 统计、负载均衡状态、消费端连接等。
        Summary: 查询消费状态
        """
        UtilClient.validate_model(request)
        return mq_models.GetSofamqConsumerstatusResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.consumerstatus.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sofamq_topicremark(
        self,
        request: mq_models.UpdateSofamqTopicremarkRequest,
    ) -> mq_models.UpdateSofamqTopicremarkResponse:
        """
        Description: 更新指定 Topic 的描述信息。
        Summary: 更新Topic的描述
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sofamq_topicremark_ex(request, headers, runtime)

    async def update_sofamq_topicremark_async(
        self,
        request: mq_models.UpdateSofamqTopicremarkRequest,
    ) -> mq_models.UpdateSofamqTopicremarkResponse:
        """
        Description: 更新指定 Topic 的描述信息。
        Summary: 更新Topic的描述
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sofamq_topicremark_ex_async(request, headers, runtime)

    def update_sofamq_topicremark_ex(
        self,
        request: mq_models.UpdateSofamqTopicremarkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqTopicremarkResponse:
        """
        Description: 更新指定 Topic 的描述信息。
        Summary: 更新Topic的描述
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqTopicremarkResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.topicremark.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sofamq_topicremark_ex_async(
        self,
        request: mq_models.UpdateSofamqTopicremarkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqTopicremarkResponse:
        """
        Description: 更新指定 Topic 的描述信息。
        Summary: 更新Topic的描述
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqTopicremarkResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.topicremark.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_datacenter(
        self,
        request: mq_models.CreateSofamqDatacenterRequest,
    ) -> mq_models.CreateSofamqDatacenterResponse:
        """
        Description: datacenter list
        Summary: datacenter
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_datacenter_ex(request, headers, runtime)

    async def create_sofamq_datacenter_async(
        self,
        request: mq_models.CreateSofamqDatacenterRequest,
    ) -> mq_models.CreateSofamqDatacenterResponse:
        """
        Description: datacenter list
        Summary: datacenter
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_datacenter_ex_async(request, headers, runtime)

    def create_sofamq_datacenter_ex(
        self,
        request: mq_models.CreateSofamqDatacenterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqDatacenterResponse:
        """
        Description: datacenter list
        Summary: datacenter
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqDatacenterResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.datacenter.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_datacenter_ex_async(
        self,
        request: mq_models.CreateSofamqDatacenterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqDatacenterResponse:
        """
        Description: datacenter list
        Summary: datacenter
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqDatacenterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.datacenter.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_datacenter(
        self,
        request: mq_models.ListSofamqDatacenterRequest,
    ) -> mq_models.ListSofamqDatacenterResponse:
        """
        Description: datacenter list
        Summary: datacenter list
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_datacenter_ex(request, headers, runtime)

    async def list_sofamq_datacenter_async(
        self,
        request: mq_models.ListSofamqDatacenterRequest,
    ) -> mq_models.ListSofamqDatacenterResponse:
        """
        Description: datacenter list
        Summary: datacenter list
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_datacenter_ex_async(request, headers, runtime)

    def list_sofamq_datacenter_ex(
        self,
        request: mq_models.ListSofamqDatacenterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqDatacenterResponse:
        """
        Description: datacenter list
        Summary: datacenter list
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqDatacenterResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.datacenter.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_datacenter_ex_async(
        self,
        request: mq_models.ListSofamqDatacenterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqDatacenterResponse:
        """
        Description: datacenter list
        Summary: datacenter list
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqDatacenterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.datacenter.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_config(
        self,
        request: mq_models.ListSofamqConfigRequest,
    ) -> mq_models.ListSofamqConfigResponse:
        """
        Description: config list
        Summary: config list
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_config_ex(request, headers, runtime)

    async def list_sofamq_config_async(
        self,
        request: mq_models.ListSofamqConfigRequest,
    ) -> mq_models.ListSofamqConfigResponse:
        """
        Description: config list
        Summary: config list
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_config_ex_async(request, headers, runtime)

    def list_sofamq_config_ex(
        self,
        request: mq_models.ListSofamqConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqConfigResponse:
        """
        Description: config list
        Summary: config list
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqConfigResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.config.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_config_ex_async(
        self,
        request: mq_models.ListSofamqConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqConfigResponse:
        """
        Description: config list
        Summary: config list
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqConfigResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.config.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sofamq_groupremark(
        self,
        request: mq_models.UpdateSofamqGroupremarkRequest,
    ) -> mq_models.UpdateSofamqGroupremarkResponse:
        """
        Description: 更新指定 Group 的描述信息。
        Summary: 更新Group的描述
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sofamq_groupremark_ex(request, headers, runtime)

    async def update_sofamq_groupremark_async(
        self,
        request: mq_models.UpdateSofamqGroupremarkRequest,
    ) -> mq_models.UpdateSofamqGroupremarkResponse:
        """
        Description: 更新指定 Group 的描述信息。
        Summary: 更新Group的描述
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sofamq_groupremark_ex_async(request, headers, runtime)

    def update_sofamq_groupremark_ex(
        self,
        request: mq_models.UpdateSofamqGroupremarkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqGroupremarkResponse:
        """
        Description: 更新指定 Group 的描述信息。
        Summary: 更新Group的描述
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqGroupremarkResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.groupremark.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sofamq_groupremark_ex_async(
        self,
        request: mq_models.UpdateSofamqGroupremarkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqGroupremarkResponse:
        """
        Description: 更新指定 Group 的描述信息。
        Summary: 更新Group的描述
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqGroupremarkResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.groupremark.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def download_sofamq_message(
        self,
        request: mq_models.DownloadSofamqMessageRequest,
    ) -> mq_models.DownloadSofamqMessageResponse:
        """
        Description: 下载消息
        Summary: 下载消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.download_sofamq_message_ex(request, headers, runtime)

    async def download_sofamq_message_async(
        self,
        request: mq_models.DownloadSofamqMessageRequest,
    ) -> mq_models.DownloadSofamqMessageResponse:
        """
        Description: 下载消息
        Summary: 下载消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.download_sofamq_message_ex_async(request, headers, runtime)

    def download_sofamq_message_ex(
        self,
        request: mq_models.DownloadSofamqMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DownloadSofamqMessageResponse:
        """
        Description: 下载消息
        Summary: 下载消息
        """
        UtilClient.validate_model(request)
        return mq_models.DownloadSofamqMessageResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.message.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def download_sofamq_message_ex_async(
        self,
        request: mq_models.DownloadSofamqMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DownloadSofamqMessageResponse:
        """
        Description: 下载消息
        Summary: 下载消息
        """
        UtilClient.validate_model(request)
        return mq_models.DownloadSofamqMessageResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.message.download', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_metrics_topic(
        self,
        request: mq_models.QueryMetricsTopicRequest,
    ) -> mq_models.QueryMetricsTopicResponse:
        """
        Description: 获取指定或全部的 Topic 资源监控统计信息。
        Summary: 获取 topic 统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_metrics_topic_ex(request, headers, runtime)

    async def query_metrics_topic_async(
        self,
        request: mq_models.QueryMetricsTopicRequest,
    ) -> mq_models.QueryMetricsTopicResponse:
        """
        Description: 获取指定或全部的 Topic 资源监控统计信息。
        Summary: 获取 topic 统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_metrics_topic_ex_async(request, headers, runtime)

    def query_metrics_topic_ex(
        self,
        request: mq_models.QueryMetricsTopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMetricsTopicResponse:
        """
        Description: 获取指定或全部的 Topic 资源监控统计信息。
        Summary: 获取 topic 统计信息
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMetricsTopicResponse().from_map(
            self.do_request('2.0', 'sofa.mq.metrics.topic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_metrics_topic_ex_async(
        self,
        request: mq_models.QueryMetricsTopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMetricsTopicResponse:
        """
        Description: 获取指定或全部的 Topic 资源监控统计信息。
        Summary: 获取 topic 统计信息
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMetricsTopicResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.metrics.topic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_metrics_backlog(
        self,
        request: mq_models.QueryMetricsBacklogRequest,
    ) -> mq_models.QueryMetricsBacklogResponse:
        """
        Description: 查询指定时间范围内的积压数据。
        Summary: 查看积压数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_metrics_backlog_ex(request, headers, runtime)

    async def query_metrics_backlog_async(
        self,
        request: mq_models.QueryMetricsBacklogRequest,
    ) -> mq_models.QueryMetricsBacklogResponse:
        """
        Description: 查询指定时间范围内的积压数据。
        Summary: 查看积压数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_metrics_backlog_ex_async(request, headers, runtime)

    def query_metrics_backlog_ex(
        self,
        request: mq_models.QueryMetricsBacklogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMetricsBacklogResponse:
        """
        Description: 查询指定时间范围内的积压数据。
        Summary: 查看积压数据
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMetricsBacklogResponse().from_map(
            self.do_request('2.0', 'sofa.mq.metrics.backlog.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_metrics_backlog_ex_async(
        self,
        request: mq_models.QueryMetricsBacklogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMetricsBacklogResponse:
        """
        Description: 查询指定时间范围内的积压数据。
        Summary: 查看积压数据
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMetricsBacklogResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.metrics.backlog.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_metrics_overview(
        self,
        request: mq_models.QueryMetricsOverviewRequest,
    ) -> mq_models.QueryMetricsOverviewResponse:
        """
        Description: 查询监控数据概览信息，包括消息堆积数量、死信消息数量、订阅关系数量等。
        Summary: 监控数据概览
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_metrics_overview_ex(request, headers, runtime)

    async def query_metrics_overview_async(
        self,
        request: mq_models.QueryMetricsOverviewRequest,
    ) -> mq_models.QueryMetricsOverviewResponse:
        """
        Description: 查询监控数据概览信息，包括消息堆积数量、死信消息数量、订阅关系数量等。
        Summary: 监控数据概览
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_metrics_overview_ex_async(request, headers, runtime)

    def query_metrics_overview_ex(
        self,
        request: mq_models.QueryMetricsOverviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMetricsOverviewResponse:
        """
        Description: 查询监控数据概览信息，包括消息堆积数量、死信消息数量、订阅关系数量等。
        Summary: 监控数据概览
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMetricsOverviewResponse().from_map(
            self.do_request('2.0', 'sofa.mq.metrics.overview.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_metrics_overview_ex_async(
        self,
        request: mq_models.QueryMetricsOverviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMetricsOverviewResponse:
        """
        Description: 查询监控数据概览信息，包括消息堆积数量、死信消息数量、订阅关系数量等。
        Summary: 监控数据概览
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMetricsOverviewResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.metrics.overview.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_router(
        self,
        request: mq_models.ListSofamqRouterRequest,
    ) -> mq_models.ListSofamqRouterResponse:
        """
        Description: 查询消息路由列表信息。
        Summary: 查询路由列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_router_ex(request, headers, runtime)

    async def list_sofamq_router_async(
        self,
        request: mq_models.ListSofamqRouterRequest,
    ) -> mq_models.ListSofamqRouterResponse:
        """
        Description: 查询消息路由列表信息。
        Summary: 查询路由列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_router_ex_async(request, headers, runtime)

    def list_sofamq_router_ex(
        self,
        request: mq_models.ListSofamqRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqRouterResponse:
        """
        Description: 查询消息路由列表信息。
        Summary: 查询路由列表
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqRouterResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.router.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_router_ex_async(
        self,
        request: mq_models.ListSofamqRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqRouterResponse:
        """
        Description: 查询消息路由列表信息。
        Summary: 查询路由列表
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqRouterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.router.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_router(
        self,
        request: mq_models.CreateSofamqRouterRequest,
    ) -> mq_models.CreateSofamqRouterResponse:
        """
        Description: 创建一个消息路由任务。
        Summary: 创建路由
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_router_ex(request, headers, runtime)

    async def create_sofamq_router_async(
        self,
        request: mq_models.CreateSofamqRouterRequest,
    ) -> mq_models.CreateSofamqRouterResponse:
        """
        Description: 创建一个消息路由任务。
        Summary: 创建路由
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_router_ex_async(request, headers, runtime)

    def create_sofamq_router_ex(
        self,
        request: mq_models.CreateSofamqRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqRouterResponse:
        """
        Description: 创建一个消息路由任务。
        Summary: 创建路由
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqRouterResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.router.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_router_ex_async(
        self,
        request: mq_models.CreateSofamqRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqRouterResponse:
        """
        Description: 创建一个消息路由任务。
        Summary: 创建路由
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqRouterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.router.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_node(
        self,
        request: mq_models.DeleteSofamqNodeRequest,
    ) -> mq_models.DeleteSofamqNodeResponse:
        """
        Description: delete node
        Summary: delete node
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_node_ex(request, headers, runtime)

    async def delete_sofamq_node_async(
        self,
        request: mq_models.DeleteSofamqNodeRequest,
    ) -> mq_models.DeleteSofamqNodeResponse:
        """
        Description: delete node
        Summary: delete node
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_node_ex_async(request, headers, runtime)

    def delete_sofamq_node_ex(
        self,
        request: mq_models.DeleteSofamqNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqNodeResponse:
        """
        Description: delete node
        Summary: delete node
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqNodeResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.node.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_node_ex_async(
        self,
        request: mq_models.DeleteSofamqNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqNodeResponse:
        """
        Description: delete node
        Summary: delete node
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqNodeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.node.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_room(
        self,
        request: mq_models.DeleteSofamqRoomRequest,
    ) -> mq_models.DeleteSofamqRoomResponse:
        """
        Description: delete room
        Summary: delete room
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_room_ex(request, headers, runtime)

    async def delete_sofamq_room_async(
        self,
        request: mq_models.DeleteSofamqRoomRequest,
    ) -> mq_models.DeleteSofamqRoomResponse:
        """
        Description: delete room
        Summary: delete room
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_room_ex_async(request, headers, runtime)

    def delete_sofamq_room_ex(
        self,
        request: mq_models.DeleteSofamqRoomRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqRoomResponse:
        """
        Description: delete room
        Summary: delete room
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqRoomResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.room.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_room_ex_async(
        self,
        request: mq_models.DeleteSofamqRoomRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqRoomResponse:
        """
        Description: delete room
        Summary: delete room
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqRoomResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.room.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_cell(
        self,
        request: mq_models.DeleteSofamqCellRequest,
    ) -> mq_models.DeleteSofamqCellResponse:
        """
        Description: del cell
        Summary: del cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_cell_ex(request, headers, runtime)

    async def delete_sofamq_cell_async(
        self,
        request: mq_models.DeleteSofamqCellRequest,
    ) -> mq_models.DeleteSofamqCellResponse:
        """
        Description: del cell
        Summary: del cell
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_cell_ex_async(request, headers, runtime)

    def delete_sofamq_cell_ex(
        self,
        request: mq_models.DeleteSofamqCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqCellResponse:
        """
        Description: del cell
        Summary: del cell
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqCellResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.cell.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_cell_ex_async(
        self,
        request: mq_models.DeleteSofamqCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqCellResponse:
        """
        Description: del cell
        Summary: del cell
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqCellResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.cell.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_cluster(
        self,
        request: mq_models.DeleteSofamqClusterRequest,
    ) -> mq_models.DeleteSofamqClusterResponse:
        """
        Description: del cluster
        Summary: del cluster
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_cluster_ex(request, headers, runtime)

    async def delete_sofamq_cluster_async(
        self,
        request: mq_models.DeleteSofamqClusterRequest,
    ) -> mq_models.DeleteSofamqClusterResponse:
        """
        Description: del cluster
        Summary: del cluster
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_cluster_ex_async(request, headers, runtime)

    def delete_sofamq_cluster_ex(
        self,
        request: mq_models.DeleteSofamqClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqClusterResponse:
        """
        Description: del cluster
        Summary: del cluster
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqClusterResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.cluster.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_cluster_ex_async(
        self,
        request: mq_models.DeleteSofamqClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqClusterResponse:
        """
        Description: del cluster
        Summary: del cluster
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqClusterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.cluster.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_namespace(
        self,
        request: mq_models.DeleteSofamqNamespaceRequest,
    ) -> mq_models.DeleteSofamqNamespaceResponse:
        """
        Description: del ns
        Summary: del ns
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_namespace_ex(request, headers, runtime)

    async def delete_sofamq_namespace_async(
        self,
        request: mq_models.DeleteSofamqNamespaceRequest,
    ) -> mq_models.DeleteSofamqNamespaceResponse:
        """
        Description: del ns
        Summary: del ns
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_namespace_ex_async(request, headers, runtime)

    def delete_sofamq_namespace_ex(
        self,
        request: mq_models.DeleteSofamqNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqNamespaceResponse:
        """
        Description: del ns
        Summary: del ns
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqNamespaceResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.namespace.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_namespace_ex_async(
        self,
        request: mq_models.DeleteSofamqNamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqNamespaceResponse:
        """
        Description: del ns
        Summary: del ns
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqNamespaceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.namespace.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_datacenter(
        self,
        request: mq_models.DeleteSofamqDatacenterRequest,
    ) -> mq_models.DeleteSofamqDatacenterResponse:
        """
        Description: del dc
        Summary: del dc
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_datacenter_ex(request, headers, runtime)

    async def delete_sofamq_datacenter_async(
        self,
        request: mq_models.DeleteSofamqDatacenterRequest,
    ) -> mq_models.DeleteSofamqDatacenterResponse:
        """
        Description: del dc
        Summary: del dc
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_datacenter_ex_async(request, headers, runtime)

    def delete_sofamq_datacenter_ex(
        self,
        request: mq_models.DeleteSofamqDatacenterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqDatacenterResponse:
        """
        Description: del dc
        Summary: del dc
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqDatacenterResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.datacenter.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_datacenter_ex_async(
        self,
        request: mq_models.DeleteSofamqDatacenterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqDatacenterResponse:
        """
        Description: del dc
        Summary: del dc
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqDatacenterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.datacenter.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_router(
        self,
        request: mq_models.DeleteSofamqRouterRequest,
    ) -> mq_models.DeleteSofamqRouterResponse:
        """
        Description: 删除指定的消息路由任务。
        Summary: 删除路由
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_router_ex(request, headers, runtime)

    async def delete_sofamq_router_async(
        self,
        request: mq_models.DeleteSofamqRouterRequest,
    ) -> mq_models.DeleteSofamqRouterResponse:
        """
        Description: 删除指定的消息路由任务。
        Summary: 删除路由
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_router_ex_async(request, headers, runtime)

    def delete_sofamq_router_ex(
        self,
        request: mq_models.DeleteSofamqRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqRouterResponse:
        """
        Description: 删除指定的消息路由任务。
        Summary: 删除路由
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqRouterResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.router.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_router_ex_async(
        self,
        request: mq_models.DeleteSofamqRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqRouterResponse:
        """
        Description: 删除指定的消息路由任务。
        Summary: 删除路由
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqRouterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.router.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_config(
        self,
        request: mq_models.CreateSofamqConfigRequest,
    ) -> mq_models.CreateSofamqConfigResponse:
        """
        Description: create config
        Summary: create config
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_config_ex(request, headers, runtime)

    async def create_sofamq_config_async(
        self,
        request: mq_models.CreateSofamqConfigRequest,
    ) -> mq_models.CreateSofamqConfigResponse:
        """
        Description: create config
        Summary: create config
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_config_ex_async(request, headers, runtime)

    def create_sofamq_config_ex(
        self,
        request: mq_models.CreateSofamqConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqConfigResponse:
        """
        Description: create config
        Summary: create config
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqConfigResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.config.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_config_ex_async(
        self,
        request: mq_models.CreateSofamqConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqConfigResponse:
        """
        Description: create config
        Summary: create config
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqConfigResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.config.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_cell(
        self,
        request: mq_models.QuerySofamqCellRequest,
    ) -> mq_models.QuerySofamqCellResponse:
        """
        Description: query cells
        Summary: query cells
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_cell_ex(request, headers, runtime)

    async def query_sofamq_cell_async(
        self,
        request: mq_models.QuerySofamqCellRequest,
    ) -> mq_models.QuerySofamqCellResponse:
        """
        Description: query cells
        Summary: query cells
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_cell_ex_async(request, headers, runtime)

    def query_sofamq_cell_ex(
        self,
        request: mq_models.QuerySofamqCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqCellResponse:
        """
        Description: query cells
        Summary: query cells
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqCellResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.cell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_cell_ex_async(
        self,
        request: mq_models.QuerySofamqCellRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqCellResponse:
        """
        Description: query cells
        Summary: query cells
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqCellResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.cell.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_router(
        self,
        request: mq_models.QuerySofamqRouterRequest,
    ) -> mq_models.QuerySofamqRouterResponse:
        """
        Description: 查询路由
        Summary: 查询路由
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_router_ex(request, headers, runtime)

    async def query_sofamq_router_async(
        self,
        request: mq_models.QuerySofamqRouterRequest,
    ) -> mq_models.QuerySofamqRouterResponse:
        """
        Description: 查询路由
        Summary: 查询路由
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_router_ex_async(request, headers, runtime)

    def query_sofamq_router_ex(
        self,
        request: mq_models.QuerySofamqRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqRouterResponse:
        """
        Description: 查询路由
        Summary: 查询路由
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqRouterResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.router.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_router_ex_async(
        self,
        request: mq_models.QuerySofamqRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqRouterResponse:
        """
        Description: 查询路由
        Summary: 查询路由
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqRouterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.router.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_middleware_instance(
        self,
        request: mq_models.GetMiddlewareInstanceRequest,
    ) -> mq_models.GetMiddlewareInstanceResponse:
        """
        Description: get instance
        Summary: get instance
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_middleware_instance_ex(request, headers, runtime)

    async def get_middleware_instance_async(
        self,
        request: mq_models.GetMiddlewareInstanceRequest,
    ) -> mq_models.GetMiddlewareInstanceResponse:
        """
        Description: get instance
        Summary: get instance
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_middleware_instance_ex_async(request, headers, runtime)

    def get_middleware_instance_ex(
        self,
        request: mq_models.GetMiddlewareInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetMiddlewareInstanceResponse:
        """
        Description: get instance
        Summary: get instance
        """
        UtilClient.validate_model(request)
        return mq_models.GetMiddlewareInstanceResponse().from_map(
            self.do_request('2.0', 'sofa.mq.middleware.instance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_middleware_instance_ex_async(
        self,
        request: mq_models.GetMiddlewareInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetMiddlewareInstanceResponse:
        """
        Description: get instance
        Summary: get instance
        """
        UtilClient.validate_model(request)
        return mq_models.GetMiddlewareInstanceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.middleware.instance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_middleware_endpoint(
        self,
        request: mq_models.GetMiddlewareEndpointRequest,
    ) -> mq_models.GetMiddlewareEndpointResponse:
        """
        Description: get endpoint
        Summary: get endpoint
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_middleware_endpoint_ex(request, headers, runtime)

    async def get_middleware_endpoint_async(
        self,
        request: mq_models.GetMiddlewareEndpointRequest,
    ) -> mq_models.GetMiddlewareEndpointResponse:
        """
        Description: get endpoint
        Summary: get endpoint
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_middleware_endpoint_ex_async(request, headers, runtime)

    def get_middleware_endpoint_ex(
        self,
        request: mq_models.GetMiddlewareEndpointRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetMiddlewareEndpointResponse:
        """
        Description: get endpoint
        Summary: get endpoint
        """
        UtilClient.validate_model(request)
        return mq_models.GetMiddlewareEndpointResponse().from_map(
            self.do_request('2.0', 'sofa.mq.middleware.endpoint.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_middleware_endpoint_ex_async(
        self,
        request: mq_models.GetMiddlewareEndpointRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetMiddlewareEndpointResponse:
        """
        Description: get endpoint
        Summary: get endpoint
        """
        UtilClient.validate_model(request)
        return mq_models.GetMiddlewareEndpointResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.middleware.endpoint.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_cellbytype(
        self,
        request: mq_models.QuerySofamqCellbytypeRequest,
    ) -> mq_models.QuerySofamqCellbytypeResponse:
        """
        Description: cellbytype
        Summary: cellbytype
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_cellbytype_ex(request, headers, runtime)

    async def query_sofamq_cellbytype_async(
        self,
        request: mq_models.QuerySofamqCellbytypeRequest,
    ) -> mq_models.QuerySofamqCellbytypeResponse:
        """
        Description: cellbytype
        Summary: cellbytype
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_cellbytype_ex_async(request, headers, runtime)

    def query_sofamq_cellbytype_ex(
        self,
        request: mq_models.QuerySofamqCellbytypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqCellbytypeResponse:
        """
        Description: cellbytype
        Summary: cellbytype
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqCellbytypeResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.cellbytype.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_cellbytype_ex_async(
        self,
        request: mq_models.QuerySofamqCellbytypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqCellbytypeResponse:
        """
        Description: cellbytype
        Summary: cellbytype
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqCellbytypeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.cellbytype.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_trace(
        self,
        request: mq_models.ListSofamqTraceRequest,
    ) -> mq_models.ListSofamqTraceResponse:
        """
        Description: 查询指定实例下的消息轨迹查询任务列表信息。
        Summary: 查询trace请求列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_trace_ex(request, headers, runtime)

    async def list_sofamq_trace_async(
        self,
        request: mq_models.ListSofamqTraceRequest,
    ) -> mq_models.ListSofamqTraceResponse:
        """
        Description: 查询指定实例下的消息轨迹查询任务列表信息。
        Summary: 查询trace请求列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_trace_ex_async(request, headers, runtime)

    def list_sofamq_trace_ex(
        self,
        request: mq_models.ListSofamqTraceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqTraceResponse:
        """
        Description: 查询指定实例下的消息轨迹查询任务列表信息。
        Summary: 查询trace请求列表
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqTraceResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.trace.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_trace_ex_async(
        self,
        request: mq_models.ListSofamqTraceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqTraceResponse:
        """
        Description: 查询指定实例下的消息轨迹查询任务列表信息。
        Summary: 查询trace请求列表
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqTraceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.trace.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_trace(
        self,
        request: mq_models.DeleteSofamqTraceRequest,
    ) -> mq_models.DeleteSofamqTraceResponse:
        """
        Description: 删除指定的消息轨迹查询任务。
        Summary: 删除trace查询任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_trace_ex(request, headers, runtime)

    async def delete_sofamq_trace_async(
        self,
        request: mq_models.DeleteSofamqTraceRequest,
    ) -> mq_models.DeleteSofamqTraceResponse:
        """
        Description: 删除指定的消息轨迹查询任务。
        Summary: 删除trace查询任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_trace_ex_async(request, headers, runtime)

    def delete_sofamq_trace_ex(
        self,
        request: mq_models.DeleteSofamqTraceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqTraceResponse:
        """
        Description: 删除指定的消息轨迹查询任务。
        Summary: 删除trace查询任务
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqTraceResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.trace.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_trace_ex_async(
        self,
        request: mq_models.DeleteSofamqTraceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqTraceResponse:
        """
        Description: 删除指定的消息轨迹查询任务。
        Summary: 删除trace查询任务
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqTraceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.trace.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_tracebytopic(
        self,
        request: mq_models.QuerySofamqTracebytopicRequest,
    ) -> mq_models.QuerySofamqTracebytopicResponse:
        """
        Description: 通过传入 Topic 名称创建消息轨迹查询任务，得到该查询任务的 ID。
        Summary: 通过Topic创建轨迹查询任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_tracebytopic_ex(request, headers, runtime)

    async def query_sofamq_tracebytopic_async(
        self,
        request: mq_models.QuerySofamqTracebytopicRequest,
    ) -> mq_models.QuerySofamqTracebytopicResponse:
        """
        Description: 通过传入 Topic 名称创建消息轨迹查询任务，得到该查询任务的 ID。
        Summary: 通过Topic创建轨迹查询任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_tracebytopic_ex_async(request, headers, runtime)

    def query_sofamq_tracebytopic_ex(
        self,
        request: mq_models.QuerySofamqTracebytopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqTracebytopicResponse:
        """
        Description: 通过传入 Topic 名称创建消息轨迹查询任务，得到该查询任务的 ID。
        Summary: 通过Topic创建轨迹查询任务
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqTracebytopicResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.tracebytopic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_tracebytopic_ex_async(
        self,
        request: mq_models.QuerySofamqTracebytopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqTracebytopicResponse:
        """
        Description: 通过传入 Topic 名称创建消息轨迹查询任务，得到该查询任务的 ID。
        Summary: 通过Topic创建轨迹查询任务
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqTracebytopicResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.tracebytopic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_spi_paycallback(
        self,
        request: mq_models.PushSpiPaycallbackRequest,
    ) -> mq_models.PushSpiPaycallbackResponse:
        """
        Description: sofamq 支付后回调
        Summary: sofamq 支付后回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_spi_paycallback_ex(request, headers, runtime)

    async def push_spi_paycallback_async(
        self,
        request: mq_models.PushSpiPaycallbackRequest,
    ) -> mq_models.PushSpiPaycallbackResponse:
        """
        Description: sofamq 支付后回调
        Summary: sofamq 支付后回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_spi_paycallback_ex_async(request, headers, runtime)

    def push_spi_paycallback_ex(
        self,
        request: mq_models.PushSpiPaycallbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.PushSpiPaycallbackResponse:
        """
        Description: sofamq 支付后回调
        Summary: sofamq 支付后回调
        """
        UtilClient.validate_model(request)
        return mq_models.PushSpiPaycallbackResponse().from_map(
            self.do_request('2.0', 'sofa.mq.spi.paycallback.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_spi_paycallback_ex_async(
        self,
        request: mq_models.PushSpiPaycallbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.PushSpiPaycallbackResponse:
        """
        Description: sofamq 支付后回调
        Summary: sofamq 支付后回调
        """
        UtilClient.validate_model(request)
        return mq_models.PushSpiPaycallbackResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.spi.paycallback.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_spi_completecommodity(
        self,
        request: mq_models.PushSpiCompletecommodityRequest,
    ) -> mq_models.PushSpiCompletecommodityResponse:
        """
        Description: 补全商品信息
        Summary: 补全商品信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_spi_completecommodity_ex(request, headers, runtime)

    async def push_spi_completecommodity_async(
        self,
        request: mq_models.PushSpiCompletecommodityRequest,
    ) -> mq_models.PushSpiCompletecommodityResponse:
        """
        Description: 补全商品信息
        Summary: 补全商品信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_spi_completecommodity_ex_async(request, headers, runtime)

    def push_spi_completecommodity_ex(
        self,
        request: mq_models.PushSpiCompletecommodityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.PushSpiCompletecommodityResponse:
        """
        Description: 补全商品信息
        Summary: 补全商品信息
        """
        UtilClient.validate_model(request)
        return mq_models.PushSpiCompletecommodityResponse().from_map(
            self.do_request('2.0', 'sofa.mq.spi.completecommodity.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_spi_completecommodity_ex_async(
        self,
        request: mq_models.PushSpiCompletecommodityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.PushSpiCompletecommodityResponse:
        """
        Description: 补全商品信息
        Summary: 补全商品信息
        """
        UtilClient.validate_model(request)
        return mq_models.PushSpiCompletecommodityResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.spi.completecommodity.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_spi_orderverify(
        self,
        request: mq_models.PushSpiOrderverifyRequest,
    ) -> mq_models.PushSpiOrderverifyResponse:
        """
        Description: 订单校验
        Summary: 订单校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_spi_orderverify_ex(request, headers, runtime)

    async def push_spi_orderverify_async(
        self,
        request: mq_models.PushSpiOrderverifyRequest,
    ) -> mq_models.PushSpiOrderverifyResponse:
        """
        Description: 订单校验
        Summary: 订单校验
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_spi_orderverify_ex_async(request, headers, runtime)

    def push_spi_orderverify_ex(
        self,
        request: mq_models.PushSpiOrderverifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.PushSpiOrderverifyResponse:
        """
        Description: 订单校验
        Summary: 订单校验
        """
        UtilClient.validate_model(request)
        return mq_models.PushSpiOrderverifyResponse().from_map(
            self.do_request('2.0', 'sofa.mq.spi.orderverify.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_spi_orderverify_ex_async(
        self,
        request: mq_models.PushSpiOrderverifyRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.PushSpiOrderverifyResponse:
        """
        Description: 订单校验
        Summary: 订单校验
        """
        UtilClient.validate_model(request)
        return mq_models.PushSpiOrderverifyResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.spi.orderverify.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def push_spi_opencallback(
        self,
        request: mq_models.PushSpiOpencallbackRequest,
    ) -> mq_models.PushSpiOpencallbackResponse:
        """
        Description: 生命周期回调
        Summary: 生命周期回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.push_spi_opencallback_ex(request, headers, runtime)

    async def push_spi_opencallback_async(
        self,
        request: mq_models.PushSpiOpencallbackRequest,
    ) -> mq_models.PushSpiOpencallbackResponse:
        """
        Description: 生命周期回调
        Summary: 生命周期回调
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.push_spi_opencallback_ex_async(request, headers, runtime)

    def push_spi_opencallback_ex(
        self,
        request: mq_models.PushSpiOpencallbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.PushSpiOpencallbackResponse:
        """
        Description: 生命周期回调
        Summary: 生命周期回调
        """
        UtilClient.validate_model(request)
        return mq_models.PushSpiOpencallbackResponse().from_map(
            self.do_request('2.0', 'sofa.mq.spi.opencallback.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def push_spi_opencallback_ex_async(
        self,
        request: mq_models.PushSpiOpencallbackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.PushSpiOpencallbackResponse:
        """
        Description: 生命周期回调
        Summary: 生命周期回调
        """
        UtilClient.validate_model(request)
        return mq_models.PushSpiOpencallbackResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.spi.opencallback.push', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sofamq_ldcbynamespace(
        self,
        request: mq_models.GetSofamqLdcbynamespaceRequest,
    ) -> mq_models.GetSofamqLdcbynamespaceResponse:
        """
        Description: getldcbynamespace
        Summary: getldcbynamespace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sofamq_ldcbynamespace_ex(request, headers, runtime)

    async def get_sofamq_ldcbynamespace_async(
        self,
        request: mq_models.GetSofamqLdcbynamespaceRequest,
    ) -> mq_models.GetSofamqLdcbynamespaceResponse:
        """
        Description: getldcbynamespace
        Summary: getldcbynamespace
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sofamq_ldcbynamespace_ex_async(request, headers, runtime)

    def get_sofamq_ldcbynamespace_ex(
        self,
        request: mq_models.GetSofamqLdcbynamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetSofamqLdcbynamespaceResponse:
        """
        Description: getldcbynamespace
        Summary: getldcbynamespace
        """
        UtilClient.validate_model(request)
        return mq_models.GetSofamqLdcbynamespaceResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.ldcbynamespace.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sofamq_ldcbynamespace_ex_async(
        self,
        request: mq_models.GetSofamqLdcbynamespaceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetSofamqLdcbynamespaceResponse:
        """
        Description: getldcbynamespace
        Summary: getldcbynamespace
        """
        UtilClient.validate_model(request)
        return mq_models.GetSofamqLdcbynamespaceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.ldcbynamespace.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sofamq_router(
        self,
        request: mq_models.UpdateSofamqRouterRequest,
    ) -> mq_models.UpdateSofamqRouterResponse:
        """
        Description: 更新指定的消息路由任务的配置信息。
        Summary: 更新路由配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sofamq_router_ex(request, headers, runtime)

    async def update_sofamq_router_async(
        self,
        request: mq_models.UpdateSofamqRouterRequest,
    ) -> mq_models.UpdateSofamqRouterResponse:
        """
        Description: 更新指定的消息路由任务的配置信息。
        Summary: 更新路由配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sofamq_router_ex_async(request, headers, runtime)

    def update_sofamq_router_ex(
        self,
        request: mq_models.UpdateSofamqRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqRouterResponse:
        """
        Description: 更新指定的消息路由任务的配置信息。
        Summary: 更新路由配置
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqRouterResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.router.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sofamq_router_ex_async(
        self,
        request: mq_models.UpdateSofamqRouterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqRouterResponse:
        """
        Description: 更新指定的消息路由任务的配置信息。
        Summary: 更新路由配置
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqRouterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.router.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_sofamq_dlqresendbatch(
        self,
        request: mq_models.ExecSofamqDlqresendbatchRequest,
    ) -> mq_models.ExecSofamqDlqresendbatchResponse:
        """
        Description: 批量重发指定 Message ID 的死信消息，使这些消息能够被 Consumer 再次消费。
        Summary: 批量重发死信消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_sofamq_dlqresendbatch_ex(request, headers, runtime)

    async def exec_sofamq_dlqresendbatch_async(
        self,
        request: mq_models.ExecSofamqDlqresendbatchRequest,
    ) -> mq_models.ExecSofamqDlqresendbatchResponse:
        """
        Description: 批量重发指定 Message ID 的死信消息，使这些消息能够被 Consumer 再次消费。
        Summary: 批量重发死信消息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_sofamq_dlqresendbatch_ex_async(request, headers, runtime)

    def exec_sofamq_dlqresendbatch_ex(
        self,
        request: mq_models.ExecSofamqDlqresendbatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ExecSofamqDlqresendbatchResponse:
        """
        Description: 批量重发指定 Message ID 的死信消息，使这些消息能够被 Consumer 再次消费。
        Summary: 批量重发死信消息
        """
        UtilClient.validate_model(request)
        return mq_models.ExecSofamqDlqresendbatchResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.dlqresendbatch.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_sofamq_dlqresendbatch_ex_async(
        self,
        request: mq_models.ExecSofamqDlqresendbatchRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ExecSofamqDlqresendbatchResponse:
        """
        Description: 批量重发指定 Message ID 的死信消息，使这些消息能够被 Consumer 再次消费。
        Summary: 批量重发死信消息
        """
        UtilClient.validate_model(request)
        return mq_models.ExecSofamqDlqresendbatchResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.dlqresendbatch.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_warn(
        self,
        request: mq_models.ListSofamqWarnRequest,
    ) -> mq_models.ListSofamqWarnResponse:
        """
        Description: 获取报警规则列表信息。
        Summary: 获取告警列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_warn_ex(request, headers, runtime)

    async def list_sofamq_warn_async(
        self,
        request: mq_models.ListSofamqWarnRequest,
    ) -> mq_models.ListSofamqWarnResponse:
        """
        Description: 获取报警规则列表信息。
        Summary: 获取告警列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_warn_ex_async(request, headers, runtime)

    def list_sofamq_warn_ex(
        self,
        request: mq_models.ListSofamqWarnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqWarnResponse:
        """
        Description: 获取报警规则列表信息。
        Summary: 获取告警列表
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqWarnResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.warn.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_warn_ex_async(
        self,
        request: mq_models.ListSofamqWarnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqWarnResponse:
        """
        Description: 获取报警规则列表信息。
        Summary: 获取告警列表
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqWarnResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.warn.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_warn(
        self,
        request: mq_models.CreateSofamqWarnRequest,
    ) -> mq_models.CreateSofamqWarnResponse:
        """
        Description: 创建一条报警规则。
        Summary: 创建告警规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_warn_ex(request, headers, runtime)

    async def create_sofamq_warn_async(
        self,
        request: mq_models.CreateSofamqWarnRequest,
    ) -> mq_models.CreateSofamqWarnResponse:
        """
        Description: 创建一条报警规则。
        Summary: 创建告警规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_warn_ex_async(request, headers, runtime)

    def create_sofamq_warn_ex(
        self,
        request: mq_models.CreateSofamqWarnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqWarnResponse:
        """
        Description: 创建一条报警规则。
        Summary: 创建告警规则
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqWarnResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.warn.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_warn_ex_async(
        self,
        request: mq_models.CreateSofamqWarnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqWarnResponse:
        """
        Description: 创建一条报警规则。
        Summary: 创建告警规则
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqWarnResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.warn.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_warn(
        self,
        request: mq_models.DeleteSofamqWarnRequest,
    ) -> mq_models.DeleteSofamqWarnResponse:
        """
        Description: 通过传入报警规则 ID，删除指定的报警规则。
        Summary: 删除告警规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_warn_ex(request, headers, runtime)

    async def delete_sofamq_warn_async(
        self,
        request: mq_models.DeleteSofamqWarnRequest,
    ) -> mq_models.DeleteSofamqWarnResponse:
        """
        Description: 通过传入报警规则 ID，删除指定的报警规则。
        Summary: 删除告警规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_warn_ex_async(request, headers, runtime)

    def delete_sofamq_warn_ex(
        self,
        request: mq_models.DeleteSofamqWarnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqWarnResponse:
        """
        Description: 通过传入报警规则 ID，删除指定的报警规则。
        Summary: 删除告警规则
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqWarnResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.warn.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_warn_ex_async(
        self,
        request: mq_models.DeleteSofamqWarnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqWarnResponse:
        """
        Description: 通过传入报警规则 ID，删除指定的报警规则。
        Summary: 删除告警规则
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqWarnResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.warn.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sofamq_warn(
        self,
        request: mq_models.UpdateSofamqWarnRequest,
    ) -> mq_models.UpdateSofamqWarnResponse:
        """
        Description: 更新指定报警规则的配置信息。
        Summary: 更新告警规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sofamq_warn_ex(request, headers, runtime)

    async def update_sofamq_warn_async(
        self,
        request: mq_models.UpdateSofamqWarnRequest,
    ) -> mq_models.UpdateSofamqWarnResponse:
        """
        Description: 更新指定报警规则的配置信息。
        Summary: 更新告警规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sofamq_warn_ex_async(request, headers, runtime)

    def update_sofamq_warn_ex(
        self,
        request: mq_models.UpdateSofamqWarnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqWarnResponse:
        """
        Description: 更新指定报警规则的配置信息。
        Summary: 更新告警规则
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqWarnResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.warn.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sofamq_warn_ex_async(
        self,
        request: mq_models.UpdateSofamqWarnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqWarnResponse:
        """
        Description: 更新指定报警规则的配置信息。
        Summary: 更新告警规则
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqWarnResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.warn.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_sofamq_warn(
        self,
        request: mq_models.EnableSofamqWarnRequest,
    ) -> mq_models.EnableSofamqWarnResponse:
        """
        Description: 通过传入报警规则 ID，启用指定的报警规则。
        Summary: 打开告警开关
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_sofamq_warn_ex(request, headers, runtime)

    async def enable_sofamq_warn_async(
        self,
        request: mq_models.EnableSofamqWarnRequest,
    ) -> mq_models.EnableSofamqWarnResponse:
        """
        Description: 通过传入报警规则 ID，启用指定的报警规则。
        Summary: 打开告警开关
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_sofamq_warn_ex_async(request, headers, runtime)

    def enable_sofamq_warn_ex(
        self,
        request: mq_models.EnableSofamqWarnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.EnableSofamqWarnResponse:
        """
        Description: 通过传入报警规则 ID，启用指定的报警规则。
        Summary: 打开告警开关
        """
        UtilClient.validate_model(request)
        return mq_models.EnableSofamqWarnResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.warn.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_sofamq_warn_ex_async(
        self,
        request: mq_models.EnableSofamqWarnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.EnableSofamqWarnResponse:
        """
        Description: 通过传入报警规则 ID，启用指定的报警规则。
        Summary: 打开告警开关
        """
        UtilClient.validate_model(request)
        return mq_models.EnableSofamqWarnResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.warn.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def disable_sofamq_warn(
        self,
        request: mq_models.DisableSofamqWarnRequest,
    ) -> mq_models.DisableSofamqWarnResponse:
        """
        Description: 通过传入报警规则 ID，禁用指定的报警规则。
        Summary: 关闭告警开关
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.disable_sofamq_warn_ex(request, headers, runtime)

    async def disable_sofamq_warn_async(
        self,
        request: mq_models.DisableSofamqWarnRequest,
    ) -> mq_models.DisableSofamqWarnResponse:
        """
        Description: 通过传入报警规则 ID，禁用指定的报警规则。
        Summary: 关闭告警开关
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.disable_sofamq_warn_ex_async(request, headers, runtime)

    def disable_sofamq_warn_ex(
        self,
        request: mq_models.DisableSofamqWarnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DisableSofamqWarnResponse:
        """
        Description: 通过传入报警规则 ID，禁用指定的报警规则。
        Summary: 关闭告警开关
        """
        UtilClient.validate_model(request)
        return mq_models.DisableSofamqWarnResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.warn.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def disable_sofamq_warn_ex_async(
        self,
        request: mq_models.DisableSofamqWarnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DisableSofamqWarnResponse:
        """
        Description: 通过传入报警规则 ID，禁用指定的报警规则。
        Summary: 关闭告警开关
        """
        UtilClient.validate_model(request)
        return mq_models.DisableSofamqWarnResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.warn.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_warnlog(
        self,
        request: mq_models.ListSofamqWarnlogRequest,
    ) -> mq_models.ListSofamqWarnlogResponse:
        """
        Description: 可以通过本接口查询历史报警记录，目前默认保存 30 天以内的报警信息。
        Summary: 查询告警日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_warnlog_ex(request, headers, runtime)

    async def list_sofamq_warnlog_async(
        self,
        request: mq_models.ListSofamqWarnlogRequest,
    ) -> mq_models.ListSofamqWarnlogResponse:
        """
        Description: 可以通过本接口查询历史报警记录，目前默认保存 30 天以内的报警信息。
        Summary: 查询告警日志
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_warnlog_ex_async(request, headers, runtime)

    def list_sofamq_warnlog_ex(
        self,
        request: mq_models.ListSofamqWarnlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqWarnlogResponse:
        """
        Description: 可以通过本接口查询历史报警记录，目前默认保存 30 天以内的报警信息。
        Summary: 查询告警日志
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqWarnlogResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.warnlog.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_warnlog_ex_async(
        self,
        request: mq_models.ListSofamqWarnlogRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqWarnlogResponse:
        """
        Description: 可以通过本接口查询历史报警记录，目前默认保存 30 天以内的报警信息。
        Summary: 查询告警日志
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqWarnlogResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.warnlog.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_admintopic(
        self,
        request: mq_models.ListSofamqAdmintopicRequest,
    ) -> mq_models.ListSofamqAdmintopicResponse:
        """
        Description: 管理员查看topic
        Summary: 管理员查看topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_admintopic_ex(request, headers, runtime)

    async def list_sofamq_admintopic_async(
        self,
        request: mq_models.ListSofamqAdmintopicRequest,
    ) -> mq_models.ListSofamqAdmintopicResponse:
        """
        Description: 管理员查看topic
        Summary: 管理员查看topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_admintopic_ex_async(request, headers, runtime)

    def list_sofamq_admintopic_ex(
        self,
        request: mq_models.ListSofamqAdmintopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqAdmintopicResponse:
        """
        Description: 管理员查看topic
        Summary: 管理员查看topic
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqAdmintopicResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.admintopic.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_admintopic_ex_async(
        self,
        request: mq_models.ListSofamqAdmintopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqAdmintopicResponse:
        """
        Description: 管理员查看topic
        Summary: 管理员查看topic
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqAdmintopicResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.admintopic.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_metrics_tginstant(
        self,
        request: mq_models.QueryMetricsTginstantRequest,
    ) -> mq_models.QueryMetricsTginstantResponse:
        """
        Description: 查询 Topic、Group 实时的发送消费速度。
        Summary: topicgroup实时的发送消费速度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_metrics_tginstant_ex(request, headers, runtime)

    async def query_metrics_tginstant_async(
        self,
        request: mq_models.QueryMetricsTginstantRequest,
    ) -> mq_models.QueryMetricsTginstantResponse:
        """
        Description: 查询 Topic、Group 实时的发送消费速度。
        Summary: topicgroup实时的发送消费速度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_metrics_tginstant_ex_async(request, headers, runtime)

    def query_metrics_tginstant_ex(
        self,
        request: mq_models.QueryMetricsTginstantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMetricsTginstantResponse:
        """
        Description: 查询 Topic、Group 实时的发送消费速度。
        Summary: topicgroup实时的发送消费速度
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMetricsTginstantResponse().from_map(
            self.do_request('2.0', 'sofa.mq.metrics.tginstant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_metrics_tginstant_ex_async(
        self,
        request: mq_models.QueryMetricsTginstantRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMetricsTginstantResponse:
        """
        Description: 查询 Topic、Group 实时的发送消费速度。
        Summary: topicgroup实时的发送消费速度
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMetricsTginstantResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.metrics.tginstant.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_metrics_tghistory(
        self,
        request: mq_models.QueryMetricsTghistoryRequest,
    ) -> mq_models.QueryMetricsTghistoryResponse:
        """
        Description: 查询指定时间端内 Topic、Group 的历史统计数据。
        Summary: 获取 topic、group 的历史数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_metrics_tghistory_ex(request, headers, runtime)

    async def query_metrics_tghistory_async(
        self,
        request: mq_models.QueryMetricsTghistoryRequest,
    ) -> mq_models.QueryMetricsTghistoryResponse:
        """
        Description: 查询指定时间端内 Topic、Group 的历史统计数据。
        Summary: 获取 topic、group 的历史数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_metrics_tghistory_ex_async(request, headers, runtime)

    def query_metrics_tghistory_ex(
        self,
        request: mq_models.QueryMetricsTghistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMetricsTghistoryResponse:
        """
        Description: 查询指定时间端内 Topic、Group 的历史统计数据。
        Summary: 获取 topic、group 的历史数据
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMetricsTghistoryResponse().from_map(
            self.do_request('2.0', 'sofa.mq.metrics.tghistory.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_metrics_tghistory_ex_async(
        self,
        request: mq_models.QueryMetricsTghistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMetricsTghistoryResponse:
        """
        Description: 查询指定时间端内 Topic、Group 的历史统计数据。
        Summary: 获取 topic、group 的历史数据
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMetricsTghistoryResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.metrics.tghistory.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_metrics_instance(
        self,
        request: mq_models.QueryMetricsInstanceRequest,
    ) -> mq_models.QueryMetricsInstanceResponse:
        """
        Description: 根据实例 ID，查询该实例的资源统计信息，包括 Topic 数量、订阅关系数量、死信数量等。
        Summary: 获取实例的基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_metrics_instance_ex(request, headers, runtime)

    async def query_metrics_instance_async(
        self,
        request: mq_models.QueryMetricsInstanceRequest,
    ) -> mq_models.QueryMetricsInstanceResponse:
        """
        Description: 根据实例 ID，查询该实例的资源统计信息，包括 Topic 数量、订阅关系数量、死信数量等。
        Summary: 获取实例的基本信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_metrics_instance_ex_async(request, headers, runtime)

    def query_metrics_instance_ex(
        self,
        request: mq_models.QueryMetricsInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMetricsInstanceResponse:
        """
        Description: 根据实例 ID，查询该实例的资源统计信息，包括 Topic 数量、订阅关系数量、死信数量等。
        Summary: 获取实例的基本信息
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMetricsInstanceResponse().from_map(
            self.do_request('2.0', 'sofa.mq.metrics.instance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_metrics_instance_ex_async(
        self,
        request: mq_models.QueryMetricsInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMetricsInstanceResponse:
        """
        Description: 根据实例 ID，查询该实例的资源统计信息，包括 Topic 数量、订阅关系数量、死信数量等。
        Summary: 获取实例的基本信息
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMetricsInstanceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.metrics.instance.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_metrics_instancehistory(
        self,
        request: mq_models.QueryMetricsInstancehistoryRequest,
    ) -> mq_models.QueryMetricsInstancehistoryResponse:
        """
        Description: 查询指定实例下的历史统计数据，包括每分钟消费数据大小、每分钟发送消息大小等。
        Summary: 获取实例的历史统计数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_metrics_instancehistory_ex(request, headers, runtime)

    async def query_metrics_instancehistory_async(
        self,
        request: mq_models.QueryMetricsInstancehistoryRequest,
    ) -> mq_models.QueryMetricsInstancehistoryResponse:
        """
        Description: 查询指定实例下的历史统计数据，包括每分钟消费数据大小、每分钟发送消息大小等。
        Summary: 获取实例的历史统计数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_metrics_instancehistory_ex_async(request, headers, runtime)

    def query_metrics_instancehistory_ex(
        self,
        request: mq_models.QueryMetricsInstancehistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMetricsInstancehistoryResponse:
        """
        Description: 查询指定实例下的历史统计数据，包括每分钟消费数据大小、每分钟发送消息大小等。
        Summary: 获取实例的历史统计数据
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMetricsInstancehistoryResponse().from_map(
            self.do_request('2.0', 'sofa.mq.metrics.instancehistory.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_metrics_instancehistory_ex_async(
        self,
        request: mq_models.QueryMetricsInstancehistoryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMetricsInstancehistoryResponse:
        """
        Description: 查询指定实例下的历史统计数据，包括每分钟消费数据大小、每分钟发送消息大小等。
        Summary: 获取实例的历史统计数据
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMetricsInstancehistoryResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.metrics.instancehistory.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_stats_topic(
        self,
        request: mq_models.QueryStatsTopicRequest,
    ) -> mq_models.QueryStatsTopicResponse:
        """
        Description: 查询指定实例下 Topic 的统计列表信息。
        Summary: 查询 topic 统计列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_stats_topic_ex(request, headers, runtime)

    async def query_stats_topic_async(
        self,
        request: mq_models.QueryStatsTopicRequest,
    ) -> mq_models.QueryStatsTopicResponse:
        """
        Description: 查询指定实例下 Topic 的统计列表信息。
        Summary: 查询 topic 统计列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_stats_topic_ex_async(request, headers, runtime)

    def query_stats_topic_ex(
        self,
        request: mq_models.QueryStatsTopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryStatsTopicResponse:
        """
        Description: 查询指定实例下 Topic 的统计列表信息。
        Summary: 查询 topic 统计列表
        """
        UtilClient.validate_model(request)
        return mq_models.QueryStatsTopicResponse().from_map(
            self.do_request('2.0', 'sofa.mq.stats.topic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_stats_topic_ex_async(
        self,
        request: mq_models.QueryStatsTopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryStatsTopicResponse:
        """
        Description: 查询指定实例下 Topic 的统计列表信息。
        Summary: 查询 topic 统计列表
        """
        UtilClient.validate_model(request)
        return mq_models.QueryStatsTopicResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.stats.topic.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_stats_group(
        self,
        request: mq_models.QueryStatsGroupRequest,
    ) -> mq_models.QueryStatsGroupResponse:
        """
        Description: 获取指定实例下 Group 的统计信息。
        Summary: 获取当前实例的 group 统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_stats_group_ex(request, headers, runtime)

    async def query_stats_group_async(
        self,
        request: mq_models.QueryStatsGroupRequest,
    ) -> mq_models.QueryStatsGroupResponse:
        """
        Description: 获取指定实例下 Group 的统计信息。
        Summary: 获取当前实例的 group 统计信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_stats_group_ex_async(request, headers, runtime)

    def query_stats_group_ex(
        self,
        request: mq_models.QueryStatsGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryStatsGroupResponse:
        """
        Description: 获取指定实例下 Group 的统计信息。
        Summary: 获取当前实例的 group 统计信息
        """
        UtilClient.validate_model(request)
        return mq_models.QueryStatsGroupResponse().from_map(
            self.do_request('2.0', 'sofa.mq.stats.group.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_stats_group_ex_async(
        self,
        request: mq_models.QueryStatsGroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryStatsGroupResponse:
        """
        Description: 获取指定实例下 Group 的统计信息。
        Summary: 获取当前实例的 group 统计信息
        """
        UtilClient.validate_model(request)
        return mq_models.QueryStatsGroupResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.stats.group.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_admingroup(
        self,
        request: mq_models.ListSofamqAdmingroupRequest,
    ) -> mq_models.ListSofamqAdmingroupResponse:
        """
        Description: 管理员查看group
        Summary: 管理员查看group
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_admingroup_ex(request, headers, runtime)

    async def list_sofamq_admingroup_async(
        self,
        request: mq_models.ListSofamqAdmingroupRequest,
    ) -> mq_models.ListSofamqAdmingroupResponse:
        """
        Description: 管理员查看group
        Summary: 管理员查看group
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_admingroup_ex_async(request, headers, runtime)

    def list_sofamq_admingroup_ex(
        self,
        request: mq_models.ListSofamqAdmingroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqAdmingroupResponse:
        """
        Description: 管理员查看group
        Summary: 管理员查看group
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqAdmingroupResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.admingroup.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_admingroup_ex_async(
        self,
        request: mq_models.ListSofamqAdmingroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqAdmingroupResponse:
        """
        Description: 管理员查看group
        Summary: 管理员查看group
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqAdmingroupResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.admingroup.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_kvconfig(
        self,
        request: mq_models.ListSofamqKvconfigRequest,
    ) -> mq_models.ListSofamqKvconfigResponse:
        """
        Description: 查询kv配置
        Summary: 查询kv配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_kvconfig_ex(request, headers, runtime)

    async def list_sofamq_kvconfig_async(
        self,
        request: mq_models.ListSofamqKvconfigRequest,
    ) -> mq_models.ListSofamqKvconfigResponse:
        """
        Description: 查询kv配置
        Summary: 查询kv配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_kvconfig_ex_async(request, headers, runtime)

    def list_sofamq_kvconfig_ex(
        self,
        request: mq_models.ListSofamqKvconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqKvconfigResponse:
        """
        Description: 查询kv配置
        Summary: 查询kv配置
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqKvconfigResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.kvconfig.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_kvconfig_ex_async(
        self,
        request: mq_models.ListSofamqKvconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqKvconfigResponse:
        """
        Description: 查询kv配置
        Summary: 查询kv配置
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqKvconfigResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.kvconfig.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_kvconfig(
        self,
        request: mq_models.CreateSofamqKvconfigRequest,
    ) -> mq_models.CreateSofamqKvconfigResponse:
        """
        Description: 创建kvconfig
        Summary: 创建kvconfig
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_kvconfig_ex(request, headers, runtime)

    async def create_sofamq_kvconfig_async(
        self,
        request: mq_models.CreateSofamqKvconfigRequest,
    ) -> mq_models.CreateSofamqKvconfigResponse:
        """
        Description: 创建kvconfig
        Summary: 创建kvconfig
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_kvconfig_ex_async(request, headers, runtime)

    def create_sofamq_kvconfig_ex(
        self,
        request: mq_models.CreateSofamqKvconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqKvconfigResponse:
        """
        Description: 创建kvconfig
        Summary: 创建kvconfig
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqKvconfigResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.kvconfig.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_kvconfig_ex_async(
        self,
        request: mq_models.CreateSofamqKvconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqKvconfigResponse:
        """
        Description: 创建kvconfig
        Summary: 创建kvconfig
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqKvconfigResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.kvconfig.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_kvconfig(
        self,
        request: mq_models.DeleteSofamqKvconfigRequest,
    ) -> mq_models.DeleteSofamqKvconfigResponse:
        """
        Description: 删除kvconfig
        Summary: 删除kvconfig
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_kvconfig_ex(request, headers, runtime)

    async def delete_sofamq_kvconfig_async(
        self,
        request: mq_models.DeleteSofamqKvconfigRequest,
    ) -> mq_models.DeleteSofamqKvconfigResponse:
        """
        Description: 删除kvconfig
        Summary: 删除kvconfig
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_kvconfig_ex_async(request, headers, runtime)

    def delete_sofamq_kvconfig_ex(
        self,
        request: mq_models.DeleteSofamqKvconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqKvconfigResponse:
        """
        Description: 删除kvconfig
        Summary: 删除kvconfig
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqKvconfigResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.kvconfig.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_kvconfig_ex_async(
        self,
        request: mq_models.DeleteSofamqKvconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqKvconfigResponse:
        """
        Description: 删除kvconfig
        Summary: 删除kvconfig
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqKvconfigResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.kvconfig.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sofamq_kvconfig(
        self,
        request: mq_models.UpdateSofamqKvconfigRequest,
    ) -> mq_models.UpdateSofamqKvconfigResponse:
        """
        Description: 修改kvconfig值
        Summary: 修改kvconfig值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sofamq_kvconfig_ex(request, headers, runtime)

    async def update_sofamq_kvconfig_async(
        self,
        request: mq_models.UpdateSofamqKvconfigRequest,
    ) -> mq_models.UpdateSofamqKvconfigResponse:
        """
        Description: 修改kvconfig值
        Summary: 修改kvconfig值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sofamq_kvconfig_ex_async(request, headers, runtime)

    def update_sofamq_kvconfig_ex(
        self,
        request: mq_models.UpdateSofamqKvconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqKvconfigResponse:
        """
        Description: 修改kvconfig值
        Summary: 修改kvconfig值
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqKvconfigResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.kvconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sofamq_kvconfig_ex_async(
        self,
        request: mq_models.UpdateSofamqKvconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqKvconfigResponse:
        """
        Description: 修改kvconfig值
        Summary: 修改kvconfig值
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqKvconfigResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.kvconfig.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_config(
        self,
        request: mq_models.DeleteSofamqConfigRequest,
    ) -> mq_models.DeleteSofamqConfigResponse:
        """
        Description: 删除config配置
        Summary: 删除config配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_config_ex(request, headers, runtime)

    async def delete_sofamq_config_async(
        self,
        request: mq_models.DeleteSofamqConfigRequest,
    ) -> mq_models.DeleteSofamqConfigResponse:
        """
        Description: 删除config配置
        Summary: 删除config配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_config_ex_async(request, headers, runtime)

    def delete_sofamq_config_ex(
        self,
        request: mq_models.DeleteSofamqConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqConfigResponse:
        """
        Description: 删除config配置
        Summary: 删除config配置
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqConfigResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.config.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_config_ex_async(
        self,
        request: mq_models.DeleteSofamqConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqConfigResponse:
        """
        Description: 删除config配置
        Summary: 删除config配置
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqConfigResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.config.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sofamq_config(
        self,
        request: mq_models.UpdateSofamqConfigRequest,
    ) -> mq_models.UpdateSofamqConfigResponse:
        """
        Description: 更新config配置
        Summary: 更新config配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sofamq_config_ex(request, headers, runtime)

    async def update_sofamq_config_async(
        self,
        request: mq_models.UpdateSofamqConfigRequest,
    ) -> mq_models.UpdateSofamqConfigResponse:
        """
        Description: 更新config配置
        Summary: 更新config配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sofamq_config_ex_async(request, headers, runtime)

    def update_sofamq_config_ex(
        self,
        request: mq_models.UpdateSofamqConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqConfigResponse:
        """
        Description: 更新config配置
        Summary: 更新config配置
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqConfigResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.config.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sofamq_config_ex_async(
        self,
        request: mq_models.UpdateSofamqConfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqConfigResponse:
        """
        Description: 更新config配置
        Summary: 更新config配置
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqConfigResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.config.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sofamq_cluster(
        self,
        request: mq_models.UpdateSofamqClusterRequest,
    ) -> mq_models.UpdateSofamqClusterResponse:
        """
        Description: update cluster
        Summary: update cluster
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sofamq_cluster_ex(request, headers, runtime)

    async def update_sofamq_cluster_async(
        self,
        request: mq_models.UpdateSofamqClusterRequest,
    ) -> mq_models.UpdateSofamqClusterResponse:
        """
        Description: update cluster
        Summary: update cluster
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sofamq_cluster_ex_async(request, headers, runtime)

    def update_sofamq_cluster_ex(
        self,
        request: mq_models.UpdateSofamqClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqClusterResponse:
        """
        Description: update cluster
        Summary: update cluster
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqClusterResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.cluster.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sofamq_cluster_ex_async(
        self,
        request: mq_models.UpdateSofamqClusterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqClusterResponse:
        """
        Description: update cluster
        Summary: update cluster
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqClusterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.cluster.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sofamq_datacenter(
        self,
        request: mq_models.UpdateSofamqDatacenterRequest,
    ) -> mq_models.UpdateSofamqDatacenterResponse:
        """
        Description: update dc
        Summary: update dc
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sofamq_datacenter_ex(request, headers, runtime)

    async def update_sofamq_datacenter_async(
        self,
        request: mq_models.UpdateSofamqDatacenterRequest,
    ) -> mq_models.UpdateSofamqDatacenterResponse:
        """
        Description: update dc
        Summary: update dc
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sofamq_datacenter_ex_async(request, headers, runtime)

    def update_sofamq_datacenter_ex(
        self,
        request: mq_models.UpdateSofamqDatacenterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqDatacenterResponse:
        """
        Description: update dc
        Summary: update dc
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqDatacenterResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.datacenter.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sofamq_datacenter_ex_async(
        self,
        request: mq_models.UpdateSofamqDatacenterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqDatacenterResponse:
        """
        Description: update dc
        Summary: update dc
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqDatacenterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.datacenter.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sofamq_room(
        self,
        request: mq_models.UpdateSofamqRoomRequest,
    ) -> mq_models.UpdateSofamqRoomResponse:
        """
        Description: update room
        Summary: update room
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sofamq_room_ex(request, headers, runtime)

    async def update_sofamq_room_async(
        self,
        request: mq_models.UpdateSofamqRoomRequest,
    ) -> mq_models.UpdateSofamqRoomResponse:
        """
        Description: update room
        Summary: update room
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sofamq_room_ex_async(request, headers, runtime)

    def update_sofamq_room_ex(
        self,
        request: mq_models.UpdateSofamqRoomRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqRoomResponse:
        """
        Description: update room
        Summary: update room
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqRoomResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.room.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sofamq_room_ex_async(
        self,
        request: mq_models.UpdateSofamqRoomRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqRoomResponse:
        """
        Description: update room
        Summary: update room
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqRoomResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.room.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sofamq_node(
        self,
        request: mq_models.UpdateSofamqNodeRequest,
    ) -> mq_models.UpdateSofamqNodeResponse:
        """
        Description: update node
        Summary: update node
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sofamq_node_ex(request, headers, runtime)

    async def update_sofamq_node_async(
        self,
        request: mq_models.UpdateSofamqNodeRequest,
    ) -> mq_models.UpdateSofamqNodeResponse:
        """
        Description: update node
        Summary: update node
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sofamq_node_ex_async(request, headers, runtime)

    def update_sofamq_node_ex(
        self,
        request: mq_models.UpdateSofamqNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqNodeResponse:
        """
        Description: update node
        Summary: update node
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqNodeResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.node.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sofamq_node_ex_async(
        self,
        request: mq_models.UpdateSofamqNodeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqNodeResponse:
        """
        Description: update node
        Summary: update node
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqNodeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.node.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_topicqueue(
        self,
        request: mq_models.QuerySofamqTopicqueueRequest,
    ) -> mq_models.QuerySofamqTopicqueueResponse:
        """
        Description: 查询指定的 Topic 的队列信息。
        Summary: 查询topic的队列信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_topicqueue_ex(request, headers, runtime)

    async def query_sofamq_topicqueue_async(
        self,
        request: mq_models.QuerySofamqTopicqueueRequest,
    ) -> mq_models.QuerySofamqTopicqueueResponse:
        """
        Description: 查询指定的 Topic 的队列信息。
        Summary: 查询topic的队列信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_topicqueue_ex_async(request, headers, runtime)

    def query_sofamq_topicqueue_ex(
        self,
        request: mq_models.QuerySofamqTopicqueueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqTopicqueueResponse:
        """
        Description: 查询指定的 Topic 的队列信息。
        Summary: 查询topic的队列信息
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqTopicqueueResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.topicqueue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_topicqueue_ex_async(
        self,
        request: mq_models.QuerySofamqTopicqueueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqTopicqueueResponse:
        """
        Description: 查询指定的 Topic 的队列信息。
        Summary: 查询topic的队列信息
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqTopicqueueResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.topicqueue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_admingroupsubdetail(
        self,
        request: mq_models.QuerySofamqAdmingroupsubdetailRequest,
    ) -> mq_models.QuerySofamqAdmingroupsubdetailResponse:
        """
        Description: 查看在线订阅topic
        Summary: 查看在线订阅topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_admingroupsubdetail_ex(request, headers, runtime)

    async def query_sofamq_admingroupsubdetail_async(
        self,
        request: mq_models.QuerySofamqAdmingroupsubdetailRequest,
    ) -> mq_models.QuerySofamqAdmingroupsubdetailResponse:
        """
        Description: 查看在线订阅topic
        Summary: 查看在线订阅topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_admingroupsubdetail_ex_async(request, headers, runtime)

    def query_sofamq_admingroupsubdetail_ex(
        self,
        request: mq_models.QuerySofamqAdmingroupsubdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqAdmingroupsubdetailResponse:
        """
        Description: 查看在线订阅topic
        Summary: 查看在线订阅topic
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqAdmingroupsubdetailResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.admingroupsubdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_admingroupsubdetail_ex_async(
        self,
        request: mq_models.QuerySofamqAdmingroupsubdetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqAdmingroupsubdetailResponse:
        """
        Description: 查看在线订阅topic
        Summary: 查看在线订阅topic
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqAdmingroupsubdetailResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.admingroupsubdetail.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_adminuser(
        self,
        request: mq_models.ListSofamqAdminuserRequest,
    ) -> mq_models.ListSofamqAdminuserResponse:
        """
        Description: 管理员列表
        Summary: 管理员列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_adminuser_ex(request, headers, runtime)

    async def list_sofamq_adminuser_async(
        self,
        request: mq_models.ListSofamqAdminuserRequest,
    ) -> mq_models.ListSofamqAdminuserResponse:
        """
        Description: 管理员列表
        Summary: 管理员列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_adminuser_ex_async(request, headers, runtime)

    def list_sofamq_adminuser_ex(
        self,
        request: mq_models.ListSofamqAdminuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqAdminuserResponse:
        """
        Description: 管理员列表
        Summary: 管理员列表
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqAdminuserResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.adminuser.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_adminuser_ex_async(
        self,
        request: mq_models.ListSofamqAdminuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqAdminuserResponse:
        """
        Description: 管理员列表
        Summary: 管理员列表
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqAdminuserResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.adminuser.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_adminuser(
        self,
        request: mq_models.CreateSofamqAdminuserRequest,
    ) -> mq_models.CreateSofamqAdminuserResponse:
        """
        Description: 添加用户
        Summary: 添加用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_adminuser_ex(request, headers, runtime)

    async def create_sofamq_adminuser_async(
        self,
        request: mq_models.CreateSofamqAdminuserRequest,
    ) -> mq_models.CreateSofamqAdminuserResponse:
        """
        Description: 添加用户
        Summary: 添加用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_adminuser_ex_async(request, headers, runtime)

    def create_sofamq_adminuser_ex(
        self,
        request: mq_models.CreateSofamqAdminuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqAdminuserResponse:
        """
        Description: 添加用户
        Summary: 添加用户
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqAdminuserResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.adminuser.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_adminuser_ex_async(
        self,
        request: mq_models.CreateSofamqAdminuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqAdminuserResponse:
        """
        Description: 添加用户
        Summary: 添加用户
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqAdminuserResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.adminuser.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_adminuser(
        self,
        request: mq_models.DeleteSofamqAdminuserRequest,
    ) -> mq_models.DeleteSofamqAdminuserResponse:
        """
        Description: 删除管理员用户
        Summary: 删除管理员用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_adminuser_ex(request, headers, runtime)

    async def delete_sofamq_adminuser_async(
        self,
        request: mq_models.DeleteSofamqAdminuserRequest,
    ) -> mq_models.DeleteSofamqAdminuserResponse:
        """
        Description: 删除管理员用户
        Summary: 删除管理员用户
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_adminuser_ex_async(request, headers, runtime)

    def delete_sofamq_adminuser_ex(
        self,
        request: mq_models.DeleteSofamqAdminuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqAdminuserResponse:
        """
        Description: 删除管理员用户
        Summary: 删除管理员用户
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqAdminuserResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.adminuser.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_adminuser_ex_async(
        self,
        request: mq_models.DeleteSofamqAdminuserRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqAdminuserResponse:
        """
        Description: 删除管理员用户
        Summary: 删除管理员用户
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqAdminuserResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.adminuser.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_adminapi(
        self,
        request: mq_models.ListSofamqAdminapiRequest,
    ) -> mq_models.ListSofamqAdminapiResponse:
        """
        Description: 查询用户侧接口列表
        Summary: 查询用户侧接口列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_adminapi_ex(request, headers, runtime)

    async def list_sofamq_adminapi_async(
        self,
        request: mq_models.ListSofamqAdminapiRequest,
    ) -> mq_models.ListSofamqAdminapiResponse:
        """
        Description: 查询用户侧接口列表
        Summary: 查询用户侧接口列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_adminapi_ex_async(request, headers, runtime)

    def list_sofamq_adminapi_ex(
        self,
        request: mq_models.ListSofamqAdminapiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqAdminapiResponse:
        """
        Description: 查询用户侧接口列表
        Summary: 查询用户侧接口列表
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqAdminapiResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.adminapi.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_adminapi_ex_async(
        self,
        request: mq_models.ListSofamqAdminapiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqAdminapiResponse:
        """
        Description: 查询用户侧接口列表
        Summary: 查询用户侧接口列表
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqAdminapiResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.adminapi.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def switch_sofamq_adminapi(
        self,
        request: mq_models.SwitchSofamqAdminapiRequest,
    ) -> mq_models.SwitchSofamqAdminapiResponse:
        """
        Description: api权限更新
        Summary: api权限更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.switch_sofamq_adminapi_ex(request, headers, runtime)

    async def switch_sofamq_adminapi_async(
        self,
        request: mq_models.SwitchSofamqAdminapiRequest,
    ) -> mq_models.SwitchSofamqAdminapiResponse:
        """
        Description: api权限更新
        Summary: api权限更新
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.switch_sofamq_adminapi_ex_async(request, headers, runtime)

    def switch_sofamq_adminapi_ex(
        self,
        request: mq_models.SwitchSofamqAdminapiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.SwitchSofamqAdminapiResponse:
        """
        Description: api权限更新
        Summary: api权限更新
        """
        UtilClient.validate_model(request)
        return mq_models.SwitchSofamqAdminapiResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.adminapi.switch', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def switch_sofamq_adminapi_ex_async(
        self,
        request: mq_models.SwitchSofamqAdminapiRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.SwitchSofamqAdminapiResponse:
        """
        Description: api权限更新
        Summary: api权限更新
        """
        UtilClient.validate_model(request)
        return mq_models.SwitchSofamqAdminapiResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.adminapi.switch', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_dms_msgtype(
        self,
        request: mq_models.AddDmsMsgtypeRequest,
    ) -> mq_models.AddDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_dms_msgtype_ex(request, headers, runtime)

    async def add_dms_msgtype_async(
        self,
        request: mq_models.AddDmsMsgtypeRequest,
    ) -> mq_models.AddDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_dms_msgtype_ex_async(request, headers, runtime)

    def add_dms_msgtype_ex(
        self,
        request: mq_models.AddDmsMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.AddDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.AddDmsMsgtypeResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.msgtype.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_dms_msgtype_ex_async(
        self,
        request: mq_models.AddDmsMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.AddDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.AddDmsMsgtypeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.msgtype.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_dms_msgtype(
        self,
        request: mq_models.ListDmsMsgtypeRequest,
    ) -> mq_models.ListDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_dms_msgtype_ex(request, headers, runtime)

    async def list_dms_msgtype_async(
        self,
        request: mq_models.ListDmsMsgtypeRequest,
    ) -> mq_models.ListDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_dms_msgtype_ex_async(request, headers, runtime)

    def list_dms_msgtype_ex(
        self,
        request: mq_models.ListDmsMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.ListDmsMsgtypeResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.msgtype.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_dms_msgtype_ex_async(
        self,
        request: mq_models.ListDmsMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.ListDmsMsgtypeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.msgtype.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_dms_binding(
        self,
        request: mq_models.CreateDmsBindingRequest,
    ) -> mq_models.CreateDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_dms_binding_ex(request, headers, runtime)

    async def create_dms_binding_async(
        self,
        request: mq_models.CreateDmsBindingRequest,
    ) -> mq_models.CreateDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_dms_binding_ex_async(request, headers, runtime)

    def create_dms_binding_ex(
        self,
        request: mq_models.CreateDmsBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.CreateDmsBindingResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.binding.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_dms_binding_ex_async(
        self,
        request: mq_models.CreateDmsBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.CreateDmsBindingResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.binding.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_dms_binding(
        self,
        request: mq_models.ListDmsBindingRequest,
    ) -> mq_models.ListDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_dms_binding_ex(request, headers, runtime)

    async def list_dms_binding_async(
        self,
        request: mq_models.ListDmsBindingRequest,
    ) -> mq_models.ListDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_dms_binding_ex_async(request, headers, runtime)

    def list_dms_binding_ex(
        self,
        request: mq_models.ListDmsBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.ListDmsBindingResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.binding.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_dms_binding_ex_async(
        self,
        request: mq_models.ListDmsBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.ListDmsBindingResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.binding.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_dms_msgtype(
        self,
        request: mq_models.DeleteDmsMsgtypeRequest,
    ) -> mq_models.DeleteDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_dms_msgtype_ex(request, headers, runtime)

    async def delete_dms_msgtype_async(
        self,
        request: mq_models.DeleteDmsMsgtypeRequest,
    ) -> mq_models.DeleteDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_dms_msgtype_ex_async(request, headers, runtime)

    def delete_dms_msgtype_ex(
        self,
        request: mq_models.DeleteDmsMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteDmsMsgtypeResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.msgtype.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_dms_msgtype_ex_async(
        self,
        request: mq_models.DeleteDmsMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteDmsMsgtypeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.msgtype.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_dms_binding(
        self,
        request: mq_models.DeleteDmsBindingRequest,
    ) -> mq_models.DeleteDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_dms_binding_ex(request, headers, runtime)

    async def delete_dms_binding_async(
        self,
        request: mq_models.DeleteDmsBindingRequest,
    ) -> mq_models.DeleteDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_dms_binding_ex_async(request, headers, runtime)

    def delete_dms_binding_ex(
        self,
        request: mq_models.DeleteDmsBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteDmsBindingResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.binding.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_dms_binding_ex_async(
        self,
        request: mq_models.DeleteDmsBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteDmsBindingResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.binding.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_dms_msgtype(
        self,
        request: mq_models.UpdateDmsMsgtypeRequest,
    ) -> mq_models.UpdateDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_dms_msgtype_ex(request, headers, runtime)

    async def update_dms_msgtype_async(
        self,
        request: mq_models.UpdateDmsMsgtypeRequest,
    ) -> mq_models.UpdateDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_dms_msgtype_ex_async(request, headers, runtime)

    def update_dms_msgtype_ex(
        self,
        request: mq_models.UpdateDmsMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateDmsMsgtypeResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.msgtype.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_dms_msgtype_ex_async(
        self,
        request: mq_models.UpdateDmsMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateDmsMsgtypeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.msgtype.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_dms_binding(
        self,
        request: mq_models.UpdateDmsBindingRequest,
    ) -> mq_models.UpdateDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_dms_binding_ex(request, headers, runtime)

    async def update_dms_binding_async(
        self,
        request: mq_models.UpdateDmsBindingRequest,
    ) -> mq_models.UpdateDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_dms_binding_ex_async(request, headers, runtime)

    def update_dms_binding_ex(
        self,
        request: mq_models.UpdateDmsBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateDmsBindingResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.binding.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_dms_binding_ex_async(
        self,
        request: mq_models.UpdateDmsBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateDmsBindingResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.binding.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dms_msg(
        self,
        request: mq_models.QueryDmsMsgRequest,
    ) -> mq_models.QueryDmsMsgResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dms_msg_ex(request, headers, runtime)

    async def query_dms_msg_async(
        self,
        request: mq_models.QueryDmsMsgRequest,
    ) -> mq_models.QueryDmsMsgResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dms_msg_ex_async(request, headers, runtime)

    def query_dms_msg_ex(
        self,
        request: mq_models.QueryDmsMsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryDmsMsgResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.QueryDmsMsgResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.msg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dms_msg_ex_async(
        self,
        request: mq_models.QueryDmsMsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryDmsMsgResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.QueryDmsMsgResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.msg.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchquery_dms_msg(
        self,
        request: mq_models.BatchqueryDmsMsgRequest,
    ) -> mq_models.BatchqueryDmsMsgResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchquery_dms_msg_ex(request, headers, runtime)

    async def batchquery_dms_msg_async(
        self,
        request: mq_models.BatchqueryDmsMsgRequest,
    ) -> mq_models.BatchqueryDmsMsgResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchquery_dms_msg_ex_async(request, headers, runtime)

    def batchquery_dms_msg_ex(
        self,
        request: mq_models.BatchqueryDmsMsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.BatchqueryDmsMsgResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.BatchqueryDmsMsgResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.msg.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchquery_dms_msg_ex_async(
        self,
        request: mq_models.BatchqueryDmsMsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.BatchqueryDmsMsgResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.BatchqueryDmsMsgResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.msg.batchquery', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_dms_msg(
        self,
        request: mq_models.DeleteDmsMsgRequest,
    ) -> mq_models.DeleteDmsMsgResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_dms_msg_ex(request, headers, runtime)

    async def delete_dms_msg_async(
        self,
        request: mq_models.DeleteDmsMsgRequest,
    ) -> mq_models.DeleteDmsMsgResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_dms_msg_ex_async(request, headers, runtime)

    def delete_dms_msg_ex(
        self,
        request: mq_models.DeleteDmsMsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteDmsMsgResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteDmsMsgResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.msg.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_dms_msg_ex_async(
        self,
        request: mq_models.DeleteDmsMsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteDmsMsgResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteDmsMsgResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.msg.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def batchdelete_dms_msg(
        self,
        request: mq_models.BatchdeleteDmsMsgRequest,
    ) -> mq_models.BatchdeleteDmsMsgResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.batchdelete_dms_msg_ex(request, headers, runtime)

    async def batchdelete_dms_msg_async(
        self,
        request: mq_models.BatchdeleteDmsMsgRequest,
    ) -> mq_models.BatchdeleteDmsMsgResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.batchdelete_dms_msg_ex_async(request, headers, runtime)

    def batchdelete_dms_msg_ex(
        self,
        request: mq_models.BatchdeleteDmsMsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.BatchdeleteDmsMsgResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.BatchdeleteDmsMsgResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.msg.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def batchdelete_dms_msg_ex_async(
        self,
        request: mq_models.BatchdeleteDmsMsgRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.BatchdeleteDmsMsgResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.BatchdeleteDmsMsgResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.msg.batchdelete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_dms_msgtype(
        self,
        request: mq_models.ExportDmsMsgtypeRequest,
    ) -> mq_models.ExportDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_dms_msgtype_ex(request, headers, runtime)

    async def export_dms_msgtype_async(
        self,
        request: mq_models.ExportDmsMsgtypeRequest,
    ) -> mq_models.ExportDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_dms_msgtype_ex_async(request, headers, runtime)

    def export_dms_msgtype_ex(
        self,
        request: mq_models.ExportDmsMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ExportDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.ExportDmsMsgtypeResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.msgtype.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_dms_msgtype_ex_async(
        self,
        request: mq_models.ExportDmsMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ExportDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.ExportDmsMsgtypeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.msgtype.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_dms_msgtype(
        self,
        request: mq_models.ImportDmsMsgtypeRequest,
    ) -> mq_models.ImportDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_dms_msgtype_ex(request, headers, runtime)

    async def import_dms_msgtype_async(
        self,
        request: mq_models.ImportDmsMsgtypeRequest,
    ) -> mq_models.ImportDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_dms_msgtype_ex_async(request, headers, runtime)

    def import_dms_msgtype_ex(
        self,
        request: mq_models.ImportDmsMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ImportDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.ImportDmsMsgtypeResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.msgtype.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_dms_msgtype_ex_async(
        self,
        request: mq_models.ImportDmsMsgtypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ImportDmsMsgtypeResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.ImportDmsMsgtypeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.msgtype.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_dms_binding(
        self,
        request: mq_models.ExportDmsBindingRequest,
    ) -> mq_models.ExportDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_dms_binding_ex(request, headers, runtime)

    async def export_dms_binding_async(
        self,
        request: mq_models.ExportDmsBindingRequest,
    ) -> mq_models.ExportDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_dms_binding_ex_async(request, headers, runtime)

    def export_dms_binding_ex(
        self,
        request: mq_models.ExportDmsBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ExportDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.ExportDmsBindingResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.binding.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_dms_binding_ex_async(
        self,
        request: mq_models.ExportDmsBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ExportDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.ExportDmsBindingResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.binding.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_dms_binding(
        self,
        request: mq_models.ImportDmsBindingRequest,
    ) -> mq_models.ImportDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_dms_binding_ex(request, headers, runtime)

    async def import_dms_binding_async(
        self,
        request: mq_models.ImportDmsBindingRequest,
    ) -> mq_models.ImportDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_dms_binding_ex_async(request, headers, runtime)

    def import_dms_binding_ex(
        self,
        request: mq_models.ImportDmsBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ImportDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.ImportDmsBindingResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.binding.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_dms_binding_ex_async(
        self,
        request: mq_models.ImportDmsBindingRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ImportDmsBindingResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.ImportDmsBindingResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.binding.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_dms_whitelist(
        self,
        request: mq_models.ListDmsWhitelistRequest,
    ) -> mq_models.ListDmsWhitelistResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_dms_whitelist_ex(request, headers, runtime)

    async def list_dms_whitelist_async(
        self,
        request: mq_models.ListDmsWhitelistRequest,
    ) -> mq_models.ListDmsWhitelistResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_dms_whitelist_ex_async(request, headers, runtime)

    def list_dms_whitelist_ex(
        self,
        request: mq_models.ListDmsWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListDmsWhitelistResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.ListDmsWhitelistResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.whitelist.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_dms_whitelist_ex_async(
        self,
        request: mq_models.ListDmsWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListDmsWhitelistResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.ListDmsWhitelistResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.whitelist.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def add_dms_whitelist(
        self,
        request: mq_models.AddDmsWhitelistRequest,
    ) -> mq_models.AddDmsWhitelistResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.add_dms_whitelist_ex(request, headers, runtime)

    async def add_dms_whitelist_async(
        self,
        request: mq_models.AddDmsWhitelistRequest,
    ) -> mq_models.AddDmsWhitelistResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.add_dms_whitelist_ex_async(request, headers, runtime)

    def add_dms_whitelist_ex(
        self,
        request: mq_models.AddDmsWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.AddDmsWhitelistResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.AddDmsWhitelistResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.whitelist.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def add_dms_whitelist_ex_async(
        self,
        request: mq_models.AddDmsWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.AddDmsWhitelistResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.AddDmsWhitelistResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.whitelist.add', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_dms_whitelist(
        self,
        request: mq_models.DeleteDmsWhitelistRequest,
    ) -> mq_models.DeleteDmsWhitelistResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_dms_whitelist_ex(request, headers, runtime)

    async def delete_dms_whitelist_async(
        self,
        request: mq_models.DeleteDmsWhitelistRequest,
    ) -> mq_models.DeleteDmsWhitelistResponse:
        """
        Description: dms
        Summary: dms
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_dms_whitelist_ex_async(request, headers, runtime)

    def delete_dms_whitelist_ex(
        self,
        request: mq_models.DeleteDmsWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteDmsWhitelistResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteDmsWhitelistResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.whitelist.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_dms_whitelist_ex_async(
        self,
        request: mq_models.DeleteDmsWhitelistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteDmsWhitelistResponse:
        """
        Description: dms
        Summary: dms
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteDmsWhitelistResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.whitelist.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_dms_topics(
        self,
        request: mq_models.GetDmsTopicsRequest,
    ) -> mq_models.GetDmsTopicsResponse:
        """
        Description: admin
        Summary: topics
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_dms_topics_ex(request, headers, runtime)

    async def get_dms_topics_async(
        self,
        request: mq_models.GetDmsTopicsRequest,
    ) -> mq_models.GetDmsTopicsResponse:
        """
        Description: admin
        Summary: topics
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_dms_topics_ex_async(request, headers, runtime)

    def get_dms_topics_ex(
        self,
        request: mq_models.GetDmsTopicsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetDmsTopicsResponse:
        """
        Description: admin
        Summary: topics
        """
        UtilClient.validate_model(request)
        return mq_models.GetDmsTopicsResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.topics.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_dms_topics_ex_async(
        self,
        request: mq_models.GetDmsTopicsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetDmsTopicsResponse:
        """
        Description: admin
        Summary: topics
        """
        UtilClient.validate_model(request)
        return mq_models.GetDmsTopicsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.topics.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sofamq_consumerjstack(
        self,
        request: mq_models.GetSofamqConsumerjstackRequest,
    ) -> mq_models.GetSofamqConsumerjstackResponse:
        """
        Description: 查询消费者堆栈信息，便于定位问题。
        Summary: 查询消费者堆栈信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sofamq_consumerjstack_ex(request, headers, runtime)

    async def get_sofamq_consumerjstack_async(
        self,
        request: mq_models.GetSofamqConsumerjstackRequest,
    ) -> mq_models.GetSofamqConsumerjstackResponse:
        """
        Description: 查询消费者堆栈信息，便于定位问题。
        Summary: 查询消费者堆栈信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sofamq_consumerjstack_ex_async(request, headers, runtime)

    def get_sofamq_consumerjstack_ex(
        self,
        request: mq_models.GetSofamqConsumerjstackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetSofamqConsumerjstackResponse:
        """
        Description: 查询消费者堆栈信息，便于定位问题。
        Summary: 查询消费者堆栈信息
        """
        UtilClient.validate_model(request)
        return mq_models.GetSofamqConsumerjstackResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.consumerjstack.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sofamq_consumerjstack_ex_async(
        self,
        request: mq_models.GetSofamqConsumerjstackRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetSofamqConsumerjstackResponse:
        """
        Description: 查询消费者堆栈信息，便于定位问题。
        Summary: 查询消费者堆栈信息
        """
        UtilClient.validate_model(request)
        return mq_models.GetSofamqConsumerjstackResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.consumerjstack.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_dms_uploadurl(
        self,
        request: mq_models.QueryDmsUploadurlRequest,
    ) -> mq_models.QueryDmsUploadurlResponse:
        """
        Description: uploadurl
        Summary: uploadurl
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_dms_uploadurl_ex(request, headers, runtime)

    async def query_dms_uploadurl_async(
        self,
        request: mq_models.QueryDmsUploadurlRequest,
    ) -> mq_models.QueryDmsUploadurlResponse:
        """
        Description: uploadurl
        Summary: uploadurl
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_dms_uploadurl_ex_async(request, headers, runtime)

    def query_dms_uploadurl_ex(
        self,
        request: mq_models.QueryDmsUploadurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryDmsUploadurlResponse:
        """
        Description: uploadurl
        Summary: uploadurl
        """
        UtilClient.validate_model(request)
        return mq_models.QueryDmsUploadurlResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.uploadurl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_dms_uploadurl_ex_async(
        self,
        request: mq_models.QueryDmsUploadurlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryDmsUploadurlResponse:
        """
        Description: uploadurl
        Summary: uploadurl
        """
        UtilClient.validate_model(request)
        return mq_models.QueryDmsUploadurlResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.uploadurl.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_dms_msgtypetemplate(
        self,
        request: mq_models.GetDmsMsgtypetemplateRequest,
    ) -> mq_models.GetDmsMsgtypetemplateResponse:
        """
        Description: msgtypetemplate
        Summary: msgtypetemplate
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_dms_msgtypetemplate_ex(request, headers, runtime)

    async def get_dms_msgtypetemplate_async(
        self,
        request: mq_models.GetDmsMsgtypetemplateRequest,
    ) -> mq_models.GetDmsMsgtypetemplateResponse:
        """
        Description: msgtypetemplate
        Summary: msgtypetemplate
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_dms_msgtypetemplate_ex_async(request, headers, runtime)

    def get_dms_msgtypetemplate_ex(
        self,
        request: mq_models.GetDmsMsgtypetemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetDmsMsgtypetemplateResponse:
        """
        Description: msgtypetemplate
        Summary: msgtypetemplate
        """
        UtilClient.validate_model(request)
        return mq_models.GetDmsMsgtypetemplateResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.msgtypetemplate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_dms_msgtypetemplate_ex_async(
        self,
        request: mq_models.GetDmsMsgtypetemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetDmsMsgtypetemplateResponse:
        """
        Description: msgtypetemplate
        Summary: msgtypetemplate
        """
        UtilClient.validate_model(request)
        return mq_models.GetDmsMsgtypetemplateResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.msgtypetemplate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_dms_bindingtemplate(
        self,
        request: mq_models.GetDmsBindingtemplateRequest,
    ) -> mq_models.GetDmsBindingtemplateResponse:
        """
        Description: template
        Summary: template
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_dms_bindingtemplate_ex(request, headers, runtime)

    async def get_dms_bindingtemplate_async(
        self,
        request: mq_models.GetDmsBindingtemplateRequest,
    ) -> mq_models.GetDmsBindingtemplateResponse:
        """
        Description: template
        Summary: template
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_dms_bindingtemplate_ex_async(request, headers, runtime)

    def get_dms_bindingtemplate_ex(
        self,
        request: mq_models.GetDmsBindingtemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetDmsBindingtemplateResponse:
        """
        Description: template
        Summary: template
        """
        UtilClient.validate_model(request)
        return mq_models.GetDmsBindingtemplateResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.bindingtemplate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_dms_bindingtemplate_ex_async(
        self,
        request: mq_models.GetDmsBindingtemplateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetDmsBindingtemplateResponse:
        """
        Description: template
        Summary: template
        """
        UtilClient.validate_model(request)
        return mq_models.GetDmsBindingtemplateResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.bindingtemplate.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_msgdump_source(
        self,
        request: mq_models.QueryMsgdumpSourceRequest,
    ) -> mq_models.QueryMsgdumpSourceResponse:
        """
        Description: 查询msgdump消息同步任务源端资源
        Summary: 查询msgdump消息同步任务源端资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_msgdump_source_ex(request, headers, runtime)

    async def query_msgdump_source_async(
        self,
        request: mq_models.QueryMsgdumpSourceRequest,
    ) -> mq_models.QueryMsgdumpSourceResponse:
        """
        Description: 查询msgdump消息同步任务源端资源
        Summary: 查询msgdump消息同步任务源端资源
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_msgdump_source_ex_async(request, headers, runtime)

    def query_msgdump_source_ex(
        self,
        request: mq_models.QueryMsgdumpSourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMsgdumpSourceResponse:
        """
        Description: 查询msgdump消息同步任务源端资源
        Summary: 查询msgdump消息同步任务源端资源
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMsgdumpSourceResponse().from_map(
            self.do_request('2.0', 'sofa.mq.msgdump.source.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_msgdump_source_ex_async(
        self,
        request: mq_models.QueryMsgdumpSourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMsgdumpSourceResponse:
        """
        Description: 查询msgdump消息同步任务源端资源
        Summary: 查询msgdump消息同步任务源端资源
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMsgdumpSourceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.msgdump.source.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_msgdump_task(
        self,
        request: mq_models.CreateMsgdumpTaskRequest,
    ) -> mq_models.CreateMsgdumpTaskResponse:
        """
        Description: 创建 msgdump 同步任务
        Summary: 创建同步任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_msgdump_task_ex(request, headers, runtime)

    async def create_msgdump_task_async(
        self,
        request: mq_models.CreateMsgdumpTaskRequest,
    ) -> mq_models.CreateMsgdumpTaskResponse:
        """
        Description: 创建 msgdump 同步任务
        Summary: 创建同步任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_msgdump_task_ex_async(request, headers, runtime)

    def create_msgdump_task_ex(
        self,
        request: mq_models.CreateMsgdumpTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateMsgdumpTaskResponse:
        """
        Description: 创建 msgdump 同步任务
        Summary: 创建同步任务
        """
        UtilClient.validate_model(request)
        return mq_models.CreateMsgdumpTaskResponse().from_map(
            self.do_request('2.0', 'sofa.mq.msgdump.task.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_msgdump_task_ex_async(
        self,
        request: mq_models.CreateMsgdumpTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateMsgdumpTaskResponse:
        """
        Description: 创建 msgdump 同步任务
        Summary: 创建同步任务
        """
        UtilClient.validate_model(request)
        return mq_models.CreateMsgdumpTaskResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.msgdump.task.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_msgdump_task(
        self,
        request: mq_models.QueryMsgdumpTaskRequest,
    ) -> mq_models.QueryMsgdumpTaskResponse:
        """
        Description: 查询消息同步任务
        Summary: 查询消息同步任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_msgdump_task_ex(request, headers, runtime)

    async def query_msgdump_task_async(
        self,
        request: mq_models.QueryMsgdumpTaskRequest,
    ) -> mq_models.QueryMsgdumpTaskResponse:
        """
        Description: 查询消息同步任务
        Summary: 查询消息同步任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_msgdump_task_ex_async(request, headers, runtime)

    def query_msgdump_task_ex(
        self,
        request: mq_models.QueryMsgdumpTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMsgdumpTaskResponse:
        """
        Description: 查询消息同步任务
        Summary: 查询消息同步任务
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMsgdumpTaskResponse().from_map(
            self.do_request('2.0', 'sofa.mq.msgdump.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_msgdump_task_ex_async(
        self,
        request: mq_models.QueryMsgdumpTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMsgdumpTaskResponse:
        """
        Description: 查询消息同步任务
        Summary: 查询消息同步任务
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMsgdumpTaskResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.msgdump.task.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_msgdump_task(
        self,
        request: mq_models.DeleteMsgdumpTaskRequest,
    ) -> mq_models.DeleteMsgdumpTaskResponse:
        """
        Description: 删除 msgdump 任务
        Summary: 删除 msgdump 任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_msgdump_task_ex(request, headers, runtime)

    async def delete_msgdump_task_async(
        self,
        request: mq_models.DeleteMsgdumpTaskRequest,
    ) -> mq_models.DeleteMsgdumpTaskResponse:
        """
        Description: 删除 msgdump 任务
        Summary: 删除 msgdump 任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_msgdump_task_ex_async(request, headers, runtime)

    def delete_msgdump_task_ex(
        self,
        request: mq_models.DeleteMsgdumpTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteMsgdumpTaskResponse:
        """
        Description: 删除 msgdump 任务
        Summary: 删除 msgdump 任务
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteMsgdumpTaskResponse().from_map(
            self.do_request('2.0', 'sofa.mq.msgdump.task.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_msgdump_task_ex_async(
        self,
        request: mq_models.DeleteMsgdumpTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteMsgdumpTaskResponse:
        """
        Description: 删除 msgdump 任务
        Summary: 删除 msgdump 任务
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteMsgdumpTaskResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.msgdump.task.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_msgdump_task(
        self,
        request: mq_models.EnableMsgdumpTaskRequest,
    ) -> mq_models.EnableMsgdumpTaskResponse:
        """
        Description: 更新msgdump任务状态
        Summary: 更新msgdump任务状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_msgdump_task_ex(request, headers, runtime)

    async def enable_msgdump_task_async(
        self,
        request: mq_models.EnableMsgdumpTaskRequest,
    ) -> mq_models.EnableMsgdumpTaskResponse:
        """
        Description: 更新msgdump任务状态
        Summary: 更新msgdump任务状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_msgdump_task_ex_async(request, headers, runtime)

    def enable_msgdump_task_ex(
        self,
        request: mq_models.EnableMsgdumpTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.EnableMsgdumpTaskResponse:
        """
        Description: 更新msgdump任务状态
        Summary: 更新msgdump任务状态
        """
        UtilClient.validate_model(request)
        return mq_models.EnableMsgdumpTaskResponse().from_map(
            self.do_request('2.0', 'sofa.mq.msgdump.task.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_msgdump_task_ex_async(
        self,
        request: mq_models.EnableMsgdumpTaskRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.EnableMsgdumpTaskResponse:
        """
        Description: 更新msgdump任务状态
        Summary: 更新msgdump任务状态
        """
        UtilClient.validate_model(request)
        return mq_models.EnableMsgdumpTaskResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.msgdump.task.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_schema_adminmetadata(
        self,
        request: mq_models.ListSchemaAdminmetadataRequest,
    ) -> mq_models.ListSchemaAdminmetadataResponse:
        """
        Description: schema metadata 分页查询
        Summary: schema metadata 分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_schema_adminmetadata_ex(request, headers, runtime)

    async def list_schema_adminmetadata_async(
        self,
        request: mq_models.ListSchemaAdminmetadataRequest,
    ) -> mq_models.ListSchemaAdminmetadataResponse:
        """
        Description: schema metadata 分页查询
        Summary: schema metadata 分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_schema_adminmetadata_ex_async(request, headers, runtime)

    def list_schema_adminmetadata_ex(
        self,
        request: mq_models.ListSchemaAdminmetadataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSchemaAdminmetadataResponse:
        """
        Description: schema metadata 分页查询
        Summary: schema metadata 分页查询
        """
        UtilClient.validate_model(request)
        return mq_models.ListSchemaAdminmetadataResponse().from_map(
            self.do_request('2.0', 'sofa.mq.schema.adminmetadata.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_schema_adminmetadata_ex_async(
        self,
        request: mq_models.ListSchemaAdminmetadataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSchemaAdminmetadataResponse:
        """
        Description: schema metadata 分页查询
        Summary: schema metadata 分页查询
        """
        UtilClient.validate_model(request)
        return mq_models.ListSchemaAdminmetadataResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.schema.adminmetadata.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_schema_adminmetadata(
        self,
        request: mq_models.CreateSchemaAdminmetadataRequest,
    ) -> mq_models.CreateSchemaAdminmetadataResponse:
        """
        Description: 新增schema的metadata信息
        Summary: 新增schema的metadata信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_schema_adminmetadata_ex(request, headers, runtime)

    async def create_schema_adminmetadata_async(
        self,
        request: mq_models.CreateSchemaAdminmetadataRequest,
    ) -> mq_models.CreateSchemaAdminmetadataResponse:
        """
        Description: 新增schema的metadata信息
        Summary: 新增schema的metadata信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_schema_adminmetadata_ex_async(request, headers, runtime)

    def create_schema_adminmetadata_ex(
        self,
        request: mq_models.CreateSchemaAdminmetadataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSchemaAdminmetadataResponse:
        """
        Description: 新增schema的metadata信息
        Summary: 新增schema的metadata信息
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSchemaAdminmetadataResponse().from_map(
            self.do_request('2.0', 'sofa.mq.schema.adminmetadata.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_schema_adminmetadata_ex_async(
        self,
        request: mq_models.CreateSchemaAdminmetadataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSchemaAdminmetadataResponse:
        """
        Description: 新增schema的metadata信息
        Summary: 新增schema的metadata信息
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSchemaAdminmetadataResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.schema.adminmetadata.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_schema_adminmetadata(
        self,
        request: mq_models.UpdateSchemaAdminmetadataRequest,
    ) -> mq_models.UpdateSchemaAdminmetadataResponse:
        """
        Description: 更新schema元信息
        Summary: 更新schema元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_schema_adminmetadata_ex(request, headers, runtime)

    async def update_schema_adminmetadata_async(
        self,
        request: mq_models.UpdateSchemaAdminmetadataRequest,
    ) -> mq_models.UpdateSchemaAdminmetadataResponse:
        """
        Description: 更新schema元信息
        Summary: 更新schema元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_schema_adminmetadata_ex_async(request, headers, runtime)

    def update_schema_adminmetadata_ex(
        self,
        request: mq_models.UpdateSchemaAdminmetadataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSchemaAdminmetadataResponse:
        """
        Description: 更新schema元信息
        Summary: 更新schema元信息
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSchemaAdminmetadataResponse().from_map(
            self.do_request('2.0', 'sofa.mq.schema.adminmetadata.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_schema_adminmetadata_ex_async(
        self,
        request: mq_models.UpdateSchemaAdminmetadataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSchemaAdminmetadataResponse:
        """
        Description: 更新schema元信息
        Summary: 更新schema元信息
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSchemaAdminmetadataResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.schema.adminmetadata.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_schema_adminmetadata(
        self,
        request: mq_models.DeleteSchemaAdminmetadataRequest,
    ) -> mq_models.DeleteSchemaAdminmetadataResponse:
        """
        Description: 删除schema元信息
        Summary: 删除schema元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_schema_adminmetadata_ex(request, headers, runtime)

    async def delete_schema_adminmetadata_async(
        self,
        request: mq_models.DeleteSchemaAdminmetadataRequest,
    ) -> mq_models.DeleteSchemaAdminmetadataResponse:
        """
        Description: 删除schema元信息
        Summary: 删除schema元信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_schema_adminmetadata_ex_async(request, headers, runtime)

    def delete_schema_adminmetadata_ex(
        self,
        request: mq_models.DeleteSchemaAdminmetadataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSchemaAdminmetadataResponse:
        """
        Description: 删除schema元信息
        Summary: 删除schema元信息
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSchemaAdminmetadataResponse().from_map(
            self.do_request('2.0', 'sofa.mq.schema.adminmetadata.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_schema_adminmetadata_ex_async(
        self,
        request: mq_models.DeleteSchemaAdminmetadataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSchemaAdminmetadataResponse:
        """
        Description: 删除schema元信息
        Summary: 删除schema元信息
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSchemaAdminmetadataResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.schema.adminmetadata.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_schema_admindetail(
        self,
        request: mq_models.ListSchemaAdmindetailRequest,
    ) -> mq_models.ListSchemaAdmindetailResponse:
        """
        Description: 分页查看schema详情
        Summary: 分页查看schema详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_schema_admindetail_ex(request, headers, runtime)

    async def list_schema_admindetail_async(
        self,
        request: mq_models.ListSchemaAdmindetailRequest,
    ) -> mq_models.ListSchemaAdmindetailResponse:
        """
        Description: 分页查看schema详情
        Summary: 分页查看schema详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_schema_admindetail_ex_async(request, headers, runtime)

    def list_schema_admindetail_ex(
        self,
        request: mq_models.ListSchemaAdmindetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSchemaAdmindetailResponse:
        """
        Description: 分页查看schema详情
        Summary: 分页查看schema详情
        """
        UtilClient.validate_model(request)
        return mq_models.ListSchemaAdmindetailResponse().from_map(
            self.do_request('2.0', 'sofa.mq.schema.admindetail.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_schema_admindetail_ex_async(
        self,
        request: mq_models.ListSchemaAdmindetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSchemaAdmindetailResponse:
        """
        Description: 分页查看schema详情
        Summary: 分页查看schema详情
        """
        UtilClient.validate_model(request)
        return mq_models.ListSchemaAdmindetailResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.schema.admindetail.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_schema_admindetail(
        self,
        request: mq_models.CreateSchemaAdmindetailRequest,
    ) -> mq_models.CreateSchemaAdmindetailResponse:
        """
        Description: 新增schema详情
        Summary: 新增schema详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_schema_admindetail_ex(request, headers, runtime)

    async def create_schema_admindetail_async(
        self,
        request: mq_models.CreateSchemaAdmindetailRequest,
    ) -> mq_models.CreateSchemaAdmindetailResponse:
        """
        Description: 新增schema详情
        Summary: 新增schema详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_schema_admindetail_ex_async(request, headers, runtime)

    def create_schema_admindetail_ex(
        self,
        request: mq_models.CreateSchemaAdmindetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSchemaAdmindetailResponse:
        """
        Description: 新增schema详情
        Summary: 新增schema详情
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSchemaAdmindetailResponse().from_map(
            self.do_request('2.0', 'sofa.mq.schema.admindetail.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_schema_admindetail_ex_async(
        self,
        request: mq_models.CreateSchemaAdmindetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSchemaAdmindetailResponse:
        """
        Description: 新增schema详情
        Summary: 新增schema详情
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSchemaAdmindetailResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.schema.admindetail.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_schema_admindetail(
        self,
        request: mq_models.DeleteSchemaAdmindetailRequest,
    ) -> mq_models.DeleteSchemaAdmindetailResponse:
        """
        Description: admindetail
        Summary: 删除schema详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_schema_admindetail_ex(request, headers, runtime)

    async def delete_schema_admindetail_async(
        self,
        request: mq_models.DeleteSchemaAdmindetailRequest,
    ) -> mq_models.DeleteSchemaAdmindetailResponse:
        """
        Description: admindetail
        Summary: 删除schema详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_schema_admindetail_ex_async(request, headers, runtime)

    def delete_schema_admindetail_ex(
        self,
        request: mq_models.DeleteSchemaAdmindetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSchemaAdmindetailResponse:
        """
        Description: admindetail
        Summary: 删除schema详情
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSchemaAdmindetailResponse().from_map(
            self.do_request('2.0', 'sofa.mq.schema.admindetail.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_schema_admindetail_ex_async(
        self,
        request: mq_models.DeleteSchemaAdmindetailRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSchemaAdmindetailResponse:
        """
        Description: admindetail
        Summary: 删除schema详情
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSchemaAdmindetailResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.schema.admindetail.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_endpoint(
        self,
        request: mq_models.QuerySofamqEndpointRequest,
    ) -> mq_models.QuerySofamqEndpointResponse:
        """
        Description: 查询endpoint
        Summary: 查询endpoint
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_endpoint_ex(request, headers, runtime)

    async def query_sofamq_endpoint_async(
        self,
        request: mq_models.QuerySofamqEndpointRequest,
    ) -> mq_models.QuerySofamqEndpointResponse:
        """
        Description: 查询endpoint
        Summary: 查询endpoint
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_endpoint_ex_async(request, headers, runtime)

    def query_sofamq_endpoint_ex(
        self,
        request: mq_models.QuerySofamqEndpointRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqEndpointResponse:
        """
        Description: 查询endpoint
        Summary: 查询endpoint
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqEndpointResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.endpoint.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_endpoint_ex_async(
        self,
        request: mq_models.QuerySofamqEndpointRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqEndpointResponse:
        """
        Description: 查询endpoint
        Summary: 查询endpoint
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqEndpointResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.endpoint.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_schema_adminmetadata(
        self,
        request: mq_models.QuerySchemaAdminmetadataRequest,
    ) -> mq_models.QuerySchemaAdminmetadataResponse:
        """
        Description: 按照条件查看schema元数据
        Summary: 按照条件查看schema元数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_schema_adminmetadata_ex(request, headers, runtime)

    async def query_schema_adminmetadata_async(
        self,
        request: mq_models.QuerySchemaAdminmetadataRequest,
    ) -> mq_models.QuerySchemaAdminmetadataResponse:
        """
        Description: 按照条件查看schema元数据
        Summary: 按照条件查看schema元数据
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_schema_adminmetadata_ex_async(request, headers, runtime)

    def query_schema_adminmetadata_ex(
        self,
        request: mq_models.QuerySchemaAdminmetadataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySchemaAdminmetadataResponse:
        """
        Description: 按照条件查看schema元数据
        Summary: 按照条件查看schema元数据
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySchemaAdminmetadataResponse().from_map(
            self.do_request('2.0', 'sofa.mq.schema.adminmetadata.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_schema_adminmetadata_ex_async(
        self,
        request: mq_models.QuerySchemaAdminmetadataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySchemaAdminmetadataResponse:
        """
        Description: 按照条件查看schema元数据
        Summary: 按照条件查看schema元数据
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySchemaAdminmetadataResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.schema.adminmetadata.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_schema_adminconfig(
        self,
        request: mq_models.QuerySchemaAdminconfigRequest,
    ) -> mq_models.QuerySchemaAdminconfigResponse:
        """
        Description: 查询schema的config配置
        Summary: 查询schema的config配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_schema_adminconfig_ex(request, headers, runtime)

    async def query_schema_adminconfig_async(
        self,
        request: mq_models.QuerySchemaAdminconfigRequest,
    ) -> mq_models.QuerySchemaAdminconfigResponse:
        """
        Description: 查询schema的config配置
        Summary: 查询schema的config配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_schema_adminconfig_ex_async(request, headers, runtime)

    def query_schema_adminconfig_ex(
        self,
        request: mq_models.QuerySchemaAdminconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySchemaAdminconfigResponse:
        """
        Description: 查询schema的config配置
        Summary: 查询schema的config配置
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySchemaAdminconfigResponse().from_map(
            self.do_request('2.0', 'sofa.mq.schema.adminconfig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_schema_adminconfig_ex_async(
        self,
        request: mq_models.QuerySchemaAdminconfigRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySchemaAdminconfigResponse:
        """
        Description: 查询schema的config配置
        Summary: 查询schema的config配置
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySchemaAdminconfigResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.schema.adminconfig.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_link(
        self,
        request: mq_models.QuerySofamqLinkRequest,
    ) -> mq_models.QuerySofamqLinkResponse:
        """
        Description: 查询console页面的链接
        Summary: 查询console页面的链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_link_ex(request, headers, runtime)

    async def query_sofamq_link_async(
        self,
        request: mq_models.QuerySofamqLinkRequest,
    ) -> mq_models.QuerySofamqLinkResponse:
        """
        Description: 查询console页面的链接
        Summary: 查询console页面的链接
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_link_ex_async(request, headers, runtime)

    def query_sofamq_link_ex(
        self,
        request: mq_models.QuerySofamqLinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqLinkResponse:
        """
        Description: 查询console页面的链接
        Summary: 查询console页面的链接
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqLinkResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.link.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_link_ex_async(
        self,
        request: mq_models.QuerySofamqLinkRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqLinkResponse:
        """
        Description: 查询console页面的链接
        Summary: 查询console页面的链接
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqLinkResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.link.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_topicname(
        self,
        request: mq_models.QuerySofamqTopicnameRequest,
    ) -> mq_models.QuerySofamqTopicnameResponse:
        """
        Description: 查询全部topic名字
        Summary: 查询全部topic名字
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_topicname_ex(request, headers, runtime)

    async def query_sofamq_topicname_async(
        self,
        request: mq_models.QuerySofamqTopicnameRequest,
    ) -> mq_models.QuerySofamqTopicnameResponse:
        """
        Description: 查询全部topic名字
        Summary: 查询全部topic名字
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_topicname_ex_async(request, headers, runtime)

    def query_sofamq_topicname_ex(
        self,
        request: mq_models.QuerySofamqTopicnameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqTopicnameResponse:
        """
        Description: 查询全部topic名字
        Summary: 查询全部topic名字
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqTopicnameResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.topicname.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_topicname_ex_async(
        self,
        request: mq_models.QuerySofamqTopicnameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqTopicnameResponse:
        """
        Description: 查询全部topic名字
        Summary: 查询全部topic名字
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqTopicnameResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.topicname.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_groupname(
        self,
        request: mq_models.QuerySofamqGroupnameRequest,
    ) -> mq_models.QuerySofamqGroupnameResponse:
        """
        Description: 查询全部group名字
        Summary: 查询全部group名字
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_groupname_ex(request, headers, runtime)

    async def query_sofamq_groupname_async(
        self,
        request: mq_models.QuerySofamqGroupnameRequest,
    ) -> mq_models.QuerySofamqGroupnameResponse:
        """
        Description: 查询全部group名字
        Summary: 查询全部group名字
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_groupname_ex_async(request, headers, runtime)

    def query_sofamq_groupname_ex(
        self,
        request: mq_models.QuerySofamqGroupnameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqGroupnameResponse:
        """
        Description: 查询全部group名字
        Summary: 查询全部group名字
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqGroupnameResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.groupname.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_groupname_ex_async(
        self,
        request: mq_models.QuerySofamqGroupnameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqGroupnameResponse:
        """
        Description: 查询全部group名字
        Summary: 查询全部group名字
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqGroupnameResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.groupname.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_admintopic(
        self,
        request: mq_models.CreateSofamqAdmintopicRequest,
    ) -> mq_models.CreateSofamqAdmintopicResponse:
        """
        Description: 管理员创建topic
        Summary: 管理员创建topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_admintopic_ex(request, headers, runtime)

    async def create_sofamq_admintopic_async(
        self,
        request: mq_models.CreateSofamqAdmintopicRequest,
    ) -> mq_models.CreateSofamqAdmintopicResponse:
        """
        Description: 管理员创建topic
        Summary: 管理员创建topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_admintopic_ex_async(request, headers, runtime)

    def create_sofamq_admintopic_ex(
        self,
        request: mq_models.CreateSofamqAdmintopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqAdmintopicResponse:
        """
        Description: 管理员创建topic
        Summary: 管理员创建topic
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqAdmintopicResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.admintopic.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_admintopic_ex_async(
        self,
        request: mq_models.CreateSofamqAdmintopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqAdmintopicResponse:
        """
        Description: 管理员创建topic
        Summary: 管理员创建topic
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqAdmintopicResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.admintopic.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_admingroup(
        self,
        request: mq_models.CreateSofamqAdmingroupRequest,
    ) -> mq_models.CreateSofamqAdmingroupResponse:
        """
        Description: 管理员创建group
        Summary: 管理员创建group
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_admingroup_ex(request, headers, runtime)

    async def create_sofamq_admingroup_async(
        self,
        request: mq_models.CreateSofamqAdmingroupRequest,
    ) -> mq_models.CreateSofamqAdmingroupResponse:
        """
        Description: 管理员创建group
        Summary: 管理员创建group
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_admingroup_ex_async(request, headers, runtime)

    def create_sofamq_admingroup_ex(
        self,
        request: mq_models.CreateSofamqAdmingroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqAdmingroupResponse:
        """
        Description: 管理员创建group
        Summary: 管理员创建group
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqAdmingroupResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.admingroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_admingroup_ex_async(
        self,
        request: mq_models.CreateSofamqAdmingroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqAdmingroupResponse:
        """
        Description: 管理员创建group
        Summary: 管理员创建group
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqAdmingroupResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.admingroup.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_connector(
        self,
        request: mq_models.QuerySofamqConnectorRequest,
    ) -> mq_models.QuerySofamqConnectorResponse:
        """
        Description: 查询特定的连接任务详情
        Summary: 查询特定的连接任务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_connector_ex(request, headers, runtime)

    async def query_sofamq_connector_async(
        self,
        request: mq_models.QuerySofamqConnectorRequest,
    ) -> mq_models.QuerySofamqConnectorResponse:
        """
        Description: 查询特定的连接任务详情
        Summary: 查询特定的连接任务详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_connector_ex_async(request, headers, runtime)

    def query_sofamq_connector_ex(
        self,
        request: mq_models.QuerySofamqConnectorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectorResponse:
        """
        Description: 查询特定的连接任务详情
        Summary: 查询特定的连接任务详情
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectorResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connector.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_connector_ex_async(
        self,
        request: mq_models.QuerySofamqConnectorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectorResponse:
        """
        Description: 查询特定的连接任务详情
        Summary: 查询特定的连接任务详情
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectorResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connector.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_connector(
        self,
        request: mq_models.CreateSofamqConnectorRequest,
    ) -> mq_models.CreateSofamqConnectorResponse:
        """
        Description: 新增一个连接器任务
        Summary: 新增一个连接器任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_connector_ex(request, headers, runtime)

    async def create_sofamq_connector_async(
        self,
        request: mq_models.CreateSofamqConnectorRequest,
    ) -> mq_models.CreateSofamqConnectorResponse:
        """
        Description: 新增一个连接器任务
        Summary: 新增一个连接器任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_connector_ex_async(request, headers, runtime)

    def create_sofamq_connector_ex(
        self,
        request: mq_models.CreateSofamqConnectorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqConnectorResponse:
        """
        Description: 新增一个连接器任务
        Summary: 新增一个连接器任务
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqConnectorResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connector.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_connector_ex_async(
        self,
        request: mq_models.CreateSofamqConnectorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqConnectorResponse:
        """
        Description: 新增一个连接器任务
        Summary: 新增一个连接器任务
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqConnectorResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connector.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_connector(
        self,
        request: mq_models.ListSofamqConnectorRequest,
    ) -> mq_models.ListSofamqConnectorResponse:
        """
        Description: 查询所有的连接任务，允许携带查询条件
        Summary: 查询连接任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_connector_ex(request, headers, runtime)

    async def list_sofamq_connector_async(
        self,
        request: mq_models.ListSofamqConnectorRequest,
    ) -> mq_models.ListSofamqConnectorResponse:
        """
        Description: 查询所有的连接任务，允许携带查询条件
        Summary: 查询连接任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_connector_ex_async(request, headers, runtime)

    def list_sofamq_connector_ex(
        self,
        request: mq_models.ListSofamqConnectorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqConnectorResponse:
        """
        Description: 查询所有的连接任务，允许携带查询条件
        Summary: 查询连接任务
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqConnectorResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connector.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_connector_ex_async(
        self,
        request: mq_models.ListSofamqConnectorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqConnectorResponse:
        """
        Description: 查询所有的连接任务，允许携带查询条件
        Summary: 查询连接任务
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqConnectorResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connector.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_connector(
        self,
        request: mq_models.DeleteSofamqConnectorRequest,
    ) -> mq_models.DeleteSofamqConnectorResponse:
        """
        Description: 删除一个连接器任务
        Summary: 删除一个连接器任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_connector_ex(request, headers, runtime)

    async def delete_sofamq_connector_async(
        self,
        request: mq_models.DeleteSofamqConnectorRequest,
    ) -> mq_models.DeleteSofamqConnectorResponse:
        """
        Description: 删除一个连接器任务
        Summary: 删除一个连接器任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_connector_ex_async(request, headers, runtime)

    def delete_sofamq_connector_ex(
        self,
        request: mq_models.DeleteSofamqConnectorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqConnectorResponse:
        """
        Description: 删除一个连接器任务
        Summary: 删除一个连接器任务
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqConnectorResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connector.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_connector_ex_async(
        self,
        request: mq_models.DeleteSofamqConnectorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqConnectorResponse:
        """
        Description: 删除一个连接器任务
        Summary: 删除一个连接器任务
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqConnectorResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connector.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def enable_sofamq_connector(
        self,
        request: mq_models.EnableSofamqConnectorRequest,
    ) -> mq_models.EnableSofamqConnectorResponse:
        """
        Description: 启动一个连接器的任务
        Summary: 启动一个连接器的任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.enable_sofamq_connector_ex(request, headers, runtime)

    async def enable_sofamq_connector_async(
        self,
        request: mq_models.EnableSofamqConnectorRequest,
    ) -> mq_models.EnableSofamqConnectorResponse:
        """
        Description: 启动一个连接器的任务
        Summary: 启动一个连接器的任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.enable_sofamq_connector_ex_async(request, headers, runtime)

    def enable_sofamq_connector_ex(
        self,
        request: mq_models.EnableSofamqConnectorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.EnableSofamqConnectorResponse:
        """
        Description: 启动一个连接器的任务
        Summary: 启动一个连接器的任务
        """
        UtilClient.validate_model(request)
        return mq_models.EnableSofamqConnectorResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connector.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def enable_sofamq_connector_ex_async(
        self,
        request: mq_models.EnableSofamqConnectorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.EnableSofamqConnectorResponse:
        """
        Description: 启动一个连接器的任务
        Summary: 启动一个连接器的任务
        """
        UtilClient.validate_model(request)
        return mq_models.EnableSofamqConnectorResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connector.enable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def disable_sofamq_connector(
        self,
        request: mq_models.DisableSofamqConnectorRequest,
    ) -> mq_models.DisableSofamqConnectorResponse:
        """
        Description: 停止一个连接器任务
        Summary: 停止一个连接器任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.disable_sofamq_connector_ex(request, headers, runtime)

    async def disable_sofamq_connector_async(
        self,
        request: mq_models.DisableSofamqConnectorRequest,
    ) -> mq_models.DisableSofamqConnectorResponse:
        """
        Description: 停止一个连接器任务
        Summary: 停止一个连接器任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.disable_sofamq_connector_ex_async(request, headers, runtime)

    def disable_sofamq_connector_ex(
        self,
        request: mq_models.DisableSofamqConnectorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DisableSofamqConnectorResponse:
        """
        Description: 停止一个连接器任务
        Summary: 停止一个连接器任务
        """
        UtilClient.validate_model(request)
        return mq_models.DisableSofamqConnectorResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connector.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def disable_sofamq_connector_ex_async(
        self,
        request: mq_models.DisableSofamqConnectorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DisableSofamqConnectorResponse:
        """
        Description: 停止一个连接器任务
        Summary: 停止一个连接器任务
        """
        UtilClient.validate_model(request)
        return mq_models.DisableSofamqConnectorResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connector.disable', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_connectorscheuletype(
        self,
        request: mq_models.ListSofamqConnectorscheuletypeRequest,
    ) -> mq_models.ListSofamqConnectorscheuletypeResponse:
        """
        Description: 列出所有任务的调度类型
        Summary: 列出所有任务的调度类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_connectorscheuletype_ex(request, headers, runtime)

    async def list_sofamq_connectorscheuletype_async(
        self,
        request: mq_models.ListSofamqConnectorscheuletypeRequest,
    ) -> mq_models.ListSofamqConnectorscheuletypeResponse:
        """
        Description: 列出所有任务的调度类型
        Summary: 列出所有任务的调度类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_connectorscheuletype_ex_async(request, headers, runtime)

    def list_sofamq_connectorscheuletype_ex(
        self,
        request: mq_models.ListSofamqConnectorscheuletypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqConnectorscheuletypeResponse:
        """
        Description: 列出所有任务的调度类型
        Summary: 列出所有任务的调度类型
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqConnectorscheuletypeResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorscheuletype.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_connectorscheuletype_ex_async(
        self,
        request: mq_models.ListSofamqConnectorscheuletypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqConnectorscheuletypeResponse:
        """
        Description: 列出所有任务的调度类型
        Summary: 列出所有任务的调度类型
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqConnectorscheuletypeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorscheuletype.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_connectorsourcetype(
        self,
        request: mq_models.ListSofamqConnectorsourcetypeRequest,
    ) -> mq_models.ListSofamqConnectorsourcetypeResponse:
        """
        Description: 列出所有支持的来源类型
        Summary: 列出所有支持的来源类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_connectorsourcetype_ex(request, headers, runtime)

    async def list_sofamq_connectorsourcetype_async(
        self,
        request: mq_models.ListSofamqConnectorsourcetypeRequest,
    ) -> mq_models.ListSofamqConnectorsourcetypeResponse:
        """
        Description: 列出所有支持的来源类型
        Summary: 列出所有支持的来源类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_connectorsourcetype_ex_async(request, headers, runtime)

    def list_sofamq_connectorsourcetype_ex(
        self,
        request: mq_models.ListSofamqConnectorsourcetypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqConnectorsourcetypeResponse:
        """
        Description: 列出所有支持的来源类型
        Summary: 列出所有支持的来源类型
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqConnectorsourcetypeResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorsourcetype.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_connectorsourcetype_ex_async(
        self,
        request: mq_models.ListSofamqConnectorsourcetypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqConnectorsourcetypeResponse:
        """
        Description: 列出所有支持的来源类型
        Summary: 列出所有支持的来源类型
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqConnectorsourcetypeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorsourcetype.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_connectorsinktype(
        self,
        request: mq_models.ListSofamqConnectorsinktypeRequest,
    ) -> mq_models.ListSofamqConnectorsinktypeResponse:
        """
        Description: 列出所有支持的去向类型
        Summary: 列出所有支持的去向类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_connectorsinktype_ex(request, headers, runtime)

    async def list_sofamq_connectorsinktype_async(
        self,
        request: mq_models.ListSofamqConnectorsinktypeRequest,
    ) -> mq_models.ListSofamqConnectorsinktypeResponse:
        """
        Description: 列出所有支持的去向类型
        Summary: 列出所有支持的去向类型
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_connectorsinktype_ex_async(request, headers, runtime)

    def list_sofamq_connectorsinktype_ex(
        self,
        request: mq_models.ListSofamqConnectorsinktypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqConnectorsinktypeResponse:
        """
        Description: 列出所有支持的去向类型
        Summary: 列出所有支持的去向类型
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqConnectorsinktypeResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorsinktype.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_connectorsinktype_ex_async(
        self,
        request: mq_models.ListSofamqConnectorsinktypeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqConnectorsinktypeResponse:
        """
        Description: 列出所有支持的去向类型
        Summary: 列出所有支持的去向类型
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqConnectorsinktypeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorsinktype.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def load_sofamq_connectorconfigs(
        self,
        request: mq_models.LoadSofamqConnectorconfigsRequest,
    ) -> mq_models.LoadSofamqConnectorconfigsResponse:
        """
        Description: 根据不同的来源或去向的类型，加载出前端需要渲染出来 让用户配置的  配置项控件。
        Summary: 加载不同数据来源和去向对应的前端配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.load_sofamq_connectorconfigs_ex(request, headers, runtime)

    async def load_sofamq_connectorconfigs_async(
        self,
        request: mq_models.LoadSofamqConnectorconfigsRequest,
    ) -> mq_models.LoadSofamqConnectorconfigsResponse:
        """
        Description: 根据不同的来源或去向的类型，加载出前端需要渲染出来 让用户配置的  配置项控件。
        Summary: 加载不同数据来源和去向对应的前端配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.load_sofamq_connectorconfigs_ex_async(request, headers, runtime)

    def load_sofamq_connectorconfigs_ex(
        self,
        request: mq_models.LoadSofamqConnectorconfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.LoadSofamqConnectorconfigsResponse:
        """
        Description: 根据不同的来源或去向的类型，加载出前端需要渲染出来 让用户配置的  配置项控件。
        Summary: 加载不同数据来源和去向对应的前端配置
        """
        UtilClient.validate_model(request)
        return mq_models.LoadSofamqConnectorconfigsResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorconfigs.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def load_sofamq_connectorconfigs_ex_async(
        self,
        request: mq_models.LoadSofamqConnectorconfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.LoadSofamqConnectorconfigsResponse:
        """
        Description: 根据不同的来源或去向的类型，加载出前端需要渲染出来 让用户配置的  配置项控件。
        Summary: 加载不同数据来源和去向对应的前端配置
        """
        UtilClient.validate_model(request)
        return mq_models.LoadSofamqConnectorconfigsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorconfigs.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_connectordate(
        self,
        request: mq_models.QuerySofamqConnectordateRequest,
    ) -> mq_models.QuerySofamqConnectordateResponse:
        """
        Description: connect按照时间段返回当前任务的执行记录
        Summary: connect执行记录查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_connectordate_ex(request, headers, runtime)

    async def query_sofamq_connectordate_async(
        self,
        request: mq_models.QuerySofamqConnectordateRequest,
    ) -> mq_models.QuerySofamqConnectordateResponse:
        """
        Description: connect按照时间段返回当前任务的执行记录
        Summary: connect执行记录查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_connectordate_ex_async(request, headers, runtime)

    def query_sofamq_connectordate_ex(
        self,
        request: mq_models.QuerySofamqConnectordateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectordateResponse:
        """
        Description: connect按照时间段返回当前任务的执行记录
        Summary: connect执行记录查询
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectordateResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectordate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_connectordate_ex_async(
        self,
        request: mq_models.QuerySofamqConnectordateRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectordateResponse:
        """
        Description: connect按照时间段返回当前任务的执行记录
        Summary: connect执行记录查询
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectordateResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectordate.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_connectorrecord(
        self,
        request: mq_models.QuerySofamqConnectorrecordRequest,
    ) -> mq_models.QuerySofamqConnectorrecordResponse:
        """
        Description: 根据执行时间返回当前的任务记录执行详情
        Summary: 根据执行时间返回当前的任务记录执行详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_connectorrecord_ex(request, headers, runtime)

    async def query_sofamq_connectorrecord_async(
        self,
        request: mq_models.QuerySofamqConnectorrecordRequest,
    ) -> mq_models.QuerySofamqConnectorrecordResponse:
        """
        Description: 根据执行时间返回当前的任务记录执行详情
        Summary: 根据执行时间返回当前的任务记录执行详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_connectorrecord_ex_async(request, headers, runtime)

    def query_sofamq_connectorrecord_ex(
        self,
        request: mq_models.QuerySofamqConnectorrecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectorrecordResponse:
        """
        Description: 根据执行时间返回当前的任务记录执行详情
        Summary: 根据执行时间返回当前的任务记录执行详情
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectorrecordResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorrecord.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_connectorrecord_ex_async(
        self,
        request: mq_models.QuerySofamqConnectorrecordRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectorrecordResponse:
        """
        Description: 根据执行时间返回当前的任务记录执行详情
        Summary: 根据执行时间返回当前的任务记录执行详情
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectorrecordResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorrecord.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def load_sofamq_connectorsource(
        self,
        request: mq_models.LoadSofamqConnectorsourceRequest,
    ) -> mq_models.LoadSofamqConnectorsourceResponse:
        """
        Description: 加载数据源对应的结构信息
        Summary: 加载数据源对应的结构信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.load_sofamq_connectorsource_ex(request, headers, runtime)

    async def load_sofamq_connectorsource_async(
        self,
        request: mq_models.LoadSofamqConnectorsourceRequest,
    ) -> mq_models.LoadSofamqConnectorsourceResponse:
        """
        Description: 加载数据源对应的结构信息
        Summary: 加载数据源对应的结构信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.load_sofamq_connectorsource_ex_async(request, headers, runtime)

    def load_sofamq_connectorsource_ex(
        self,
        request: mq_models.LoadSofamqConnectorsourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.LoadSofamqConnectorsourceResponse:
        """
        Description: 加载数据源对应的结构信息
        Summary: 加载数据源对应的结构信息
        """
        UtilClient.validate_model(request)
        return mq_models.LoadSofamqConnectorsourceResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorsource.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def load_sofamq_connectorsource_ex_async(
        self,
        request: mq_models.LoadSofamqConnectorsourceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.LoadSofamqConnectorsourceResponse:
        """
        Description: 加载数据源对应的结构信息
        Summary: 加载数据源对应的结构信息
        """
        UtilClient.validate_model(request)
        return mq_models.LoadSofamqConnectorsourceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorsource.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mesh_queue(
        self,
        request: mq_models.QueryMeshQueueRequest,
    ) -> mq_models.QueryMeshQueueResponse:
        """
        Description: 查询队列详情信息以及分页信息
        Summary: 查询队列详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mesh_queue_ex(request, headers, runtime)

    async def query_mesh_queue_async(
        self,
        request: mq_models.QueryMeshQueueRequest,
    ) -> mq_models.QueryMeshQueueResponse:
        """
        Description: 查询队列详情信息以及分页信息
        Summary: 查询队列详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mesh_queue_ex_async(request, headers, runtime)

    def query_mesh_queue_ex(
        self,
        request: mq_models.QueryMeshQueueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshQueueResponse:
        """
        Description: 查询队列详情信息以及分页信息
        Summary: 查询队列详情
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshQueueResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mesh_queue_ex_async(
        self,
        request: mq_models.QueryMeshQueueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshQueueResponse:
        """
        Description: 查询队列详情信息以及分页信息
        Summary: 查询队列详情
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshQueueResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_mesh_queue(
        self,
        request: mq_models.ImportMeshQueueRequest,
    ) -> mq_models.ImportMeshQueueResponse:
        """
        Description: 新增队列
        Summary: 新增队列
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_mesh_queue_ex(request, headers, runtime)

    async def import_mesh_queue_async(
        self,
        request: mq_models.ImportMeshQueueRequest,
    ) -> mq_models.ImportMeshQueueResponse:
        """
        Description: 新增队列
        Summary: 新增队列
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_mesh_queue_ex_async(request, headers, runtime)

    def import_mesh_queue_ex(
        self,
        request: mq_models.ImportMeshQueueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ImportMeshQueueResponse:
        """
        Description: 新增队列
        Summary: 新增队列
        """
        UtilClient.validate_model(request)
        return mq_models.ImportMeshQueueResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queue.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_mesh_queue_ex_async(
        self,
        request: mq_models.ImportMeshQueueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ImportMeshQueueResponse:
        """
        Description: 新增队列
        Summary: 新增队列
        """
        UtilClient.validate_model(request)
        return mq_models.ImportMeshQueueResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queue.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_mesh_queue(
        self,
        request: mq_models.DeleteMeshQueueRequest,
    ) -> mq_models.DeleteMeshQueueResponse:
        """
        Description: 删除队列
        Summary: 删除队列
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_mesh_queue_ex(request, headers, runtime)

    async def delete_mesh_queue_async(
        self,
        request: mq_models.DeleteMeshQueueRequest,
    ) -> mq_models.DeleteMeshQueueResponse:
        """
        Description: 删除队列
        Summary: 删除队列
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_mesh_queue_ex_async(request, headers, runtime)

    def delete_mesh_queue_ex(
        self,
        request: mq_models.DeleteMeshQueueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteMeshQueueResponse:
        """
        Description: 删除队列
        Summary: 删除队列
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteMeshQueueResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queue.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_mesh_queue_ex_async(
        self,
        request: mq_models.DeleteMeshQueueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteMeshQueueResponse:
        """
        Description: 删除队列
        Summary: 删除队列
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteMeshQueueResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queue.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_mesh_queue(
        self,
        request: mq_models.UpdateMeshQueueRequest,
    ) -> mq_models.UpdateMeshQueueResponse:
        """
        Description: 更新队列
        Summary: 更新队列
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_mesh_queue_ex(request, headers, runtime)

    async def update_mesh_queue_async(
        self,
        request: mq_models.UpdateMeshQueueRequest,
    ) -> mq_models.UpdateMeshQueueResponse:
        """
        Description: 更新队列
        Summary: 更新队列
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_mesh_queue_ex_async(request, headers, runtime)

    def update_mesh_queue_ex(
        self,
        request: mq_models.UpdateMeshQueueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMeshQueueResponse:
        """
        Description: 更新队列
        Summary: 更新队列
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMeshQueueResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queue.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_mesh_queue_ex_async(
        self,
        request: mq_models.UpdateMeshQueueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMeshQueueResponse:
        """
        Description: 更新队列
        Summary: 更新队列
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMeshQueueResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queue.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mesh_queuelimitrules(
        self,
        request: mq_models.QueryMeshQueuelimitrulesRequest,
    ) -> mq_models.QueryMeshQueuelimitrulesResponse:
        """
        Description: 查询限流规则
        Summary: 查询限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mesh_queuelimitrules_ex(request, headers, runtime)

    async def query_mesh_queuelimitrules_async(
        self,
        request: mq_models.QueryMeshQueuelimitrulesRequest,
    ) -> mq_models.QueryMeshQueuelimitrulesResponse:
        """
        Description: 查询限流规则
        Summary: 查询限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mesh_queuelimitrules_ex_async(request, headers, runtime)

    def query_mesh_queuelimitrules_ex(
        self,
        request: mq_models.QueryMeshQueuelimitrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshQueuelimitrulesResponse:
        """
        Description: 查询限流规则
        Summary: 查询限流规则
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshQueuelimitrulesResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queuelimitrules.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mesh_queuelimitrules_ex_async(
        self,
        request: mq_models.QueryMeshQueuelimitrulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshQueuelimitrulesResponse:
        """
        Description: 查询限流规则
        Summary: 查询限流规则
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshQueuelimitrulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queuelimitrules.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sofamq_connector(
        self,
        request: mq_models.UpdateSofamqConnectorRequest,
    ) -> mq_models.UpdateSofamqConnectorResponse:
        """
        Description: 修改一个连接器任务
        Summary: 修改一个连接器任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sofamq_connector_ex(request, headers, runtime)

    async def update_sofamq_connector_async(
        self,
        request: mq_models.UpdateSofamqConnectorRequest,
    ) -> mq_models.UpdateSofamqConnectorResponse:
        """
        Description: 修改一个连接器任务
        Summary: 修改一个连接器任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sofamq_connector_ex_async(request, headers, runtime)

    def update_sofamq_connector_ex(
        self,
        request: mq_models.UpdateSofamqConnectorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqConnectorResponse:
        """
        Description: 修改一个连接器任务
        Summary: 修改一个连接器任务
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqConnectorResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connector.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sofamq_connector_ex_async(
        self,
        request: mq_models.UpdateSofamqConnectorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqConnectorResponse:
        """
        Description: 修改一个连接器任务
        Summary: 修改一个连接器任务
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqConnectorResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connector.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mesh_queuelimitvalue(
        self,
        request: mq_models.QueryMeshQueuelimitvalueRequest,
    ) -> mq_models.QueryMeshQueuelimitvalueResponse:
        """
        Description: 查询限流规则域值
        Summary: 查询限流规则域值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mesh_queuelimitvalue_ex(request, headers, runtime)

    async def query_mesh_queuelimitvalue_async(
        self,
        request: mq_models.QueryMeshQueuelimitvalueRequest,
    ) -> mq_models.QueryMeshQueuelimitvalueResponse:
        """
        Description: 查询限流规则域值
        Summary: 查询限流规则域值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mesh_queuelimitvalue_ex_async(request, headers, runtime)

    def query_mesh_queuelimitvalue_ex(
        self,
        request: mq_models.QueryMeshQueuelimitvalueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshQueuelimitvalueResponse:
        """
        Description: 查询限流规则域值
        Summary: 查询限流规则域值
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshQueuelimitvalueResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queuelimitvalue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mesh_queuelimitvalue_ex_async(
        self,
        request: mq_models.QueryMeshQueuelimitvalueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshQueuelimitvalueResponse:
        """
        Description: 查询限流规则域值
        Summary: 查询限流规则域值
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshQueuelimitvalueResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queuelimitvalue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_mesh_queuelimit(
        self,
        request: mq_models.UpdateMeshQueuelimitRequest,
    ) -> mq_models.UpdateMeshQueuelimitResponse:
        """
        Description: 更新限流规则
        Summary: 更新限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_mesh_queuelimit_ex(request, headers, runtime)

    async def update_mesh_queuelimit_async(
        self,
        request: mq_models.UpdateMeshQueuelimitRequest,
    ) -> mq_models.UpdateMeshQueuelimitResponse:
        """
        Description: 更新限流规则
        Summary: 更新限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_mesh_queuelimit_ex_async(request, headers, runtime)

    def update_mesh_queuelimit_ex(
        self,
        request: mq_models.UpdateMeshQueuelimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMeshQueuelimitResponse:
        """
        Description: 更新限流规则
        Summary: 更新限流规则
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMeshQueuelimitResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queuelimit.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_mesh_queuelimit_ex_async(
        self,
        request: mq_models.UpdateMeshQueuelimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMeshQueuelimitResponse:
        """
        Description: 更新限流规则
        Summary: 更新限流规则
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMeshQueuelimitResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queuelimit.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_mesh_queuelimit(
        self,
        request: mq_models.ImportMeshQueuelimitRequest,
    ) -> mq_models.ImportMeshQueuelimitResponse:
        """
        Description: 添加限流规则
        Summary: 添加限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_mesh_queuelimit_ex(request, headers, runtime)

    async def import_mesh_queuelimit_async(
        self,
        request: mq_models.ImportMeshQueuelimitRequest,
    ) -> mq_models.ImportMeshQueuelimitResponse:
        """
        Description: 添加限流规则
        Summary: 添加限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_mesh_queuelimit_ex_async(request, headers, runtime)

    def import_mesh_queuelimit_ex(
        self,
        request: mq_models.ImportMeshQueuelimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ImportMeshQueuelimitResponse:
        """
        Description: 添加限流规则
        Summary: 添加限流规则
        """
        UtilClient.validate_model(request)
        return mq_models.ImportMeshQueuelimitResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queuelimit.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_mesh_queuelimit_ex_async(
        self,
        request: mq_models.ImportMeshQueuelimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ImportMeshQueuelimitResponse:
        """
        Description: 添加限流规则
        Summary: 添加限流规则
        """
        UtilClient.validate_model(request)
        return mq_models.ImportMeshQueuelimitResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queuelimit.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_mesh_queuelimit(
        self,
        request: mq_models.DeleteMeshQueuelimitRequest,
    ) -> mq_models.DeleteMeshQueuelimitResponse:
        """
        Description: 删除限流规则
        Summary: 删除限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_mesh_queuelimit_ex(request, headers, runtime)

    async def delete_mesh_queuelimit_async(
        self,
        request: mq_models.DeleteMeshQueuelimitRequest,
    ) -> mq_models.DeleteMeshQueuelimitResponse:
        """
        Description: 删除限流规则
        Summary: 删除限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_mesh_queuelimit_ex_async(request, headers, runtime)

    def delete_mesh_queuelimit_ex(
        self,
        request: mq_models.DeleteMeshQueuelimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteMeshQueuelimitResponse:
        """
        Description: 删除限流规则
        Summary: 删除限流规则
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteMeshQueuelimitResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queuelimit.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_mesh_queuelimit_ex_async(
        self,
        request: mq_models.DeleteMeshQueuelimitRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteMeshQueuelimitResponse:
        """
        Description: 删除限流规则
        Summary: 删除限流规则
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteMeshQueuelimitResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queuelimit.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_mesh_queuelimitvalue(
        self,
        request: mq_models.DeleteMeshQueuelimitvalueRequest,
    ) -> mq_models.DeleteMeshQueuelimitvalueResponse:
        """
        Description: 删除限流域值
        Summary: 删除规则的限流域值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_mesh_queuelimitvalue_ex(request, headers, runtime)

    async def delete_mesh_queuelimitvalue_async(
        self,
        request: mq_models.DeleteMeshQueuelimitvalueRequest,
    ) -> mq_models.DeleteMeshQueuelimitvalueResponse:
        """
        Description: 删除限流域值
        Summary: 删除规则的限流域值
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_mesh_queuelimitvalue_ex_async(request, headers, runtime)

    def delete_mesh_queuelimitvalue_ex(
        self,
        request: mq_models.DeleteMeshQueuelimitvalueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteMeshQueuelimitvalueResponse:
        """
        Description: 删除限流域值
        Summary: 删除规则的限流域值
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteMeshQueuelimitvalueResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queuelimitvalue.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_mesh_queuelimitvalue_ex_async(
        self,
        request: mq_models.DeleteMeshQueuelimitvalueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteMeshQueuelimitvalueResponse:
        """
        Description: 删除限流域值
        Summary: 删除规则的限流域值
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteMeshQueuelimitvalueResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queuelimitvalue.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mesh_queuerouterules(
        self,
        request: mq_models.QueryMeshQueuerouterulesRequest,
    ) -> mq_models.QueryMeshQueuerouterulesResponse:
        """
        Description: 查询路由规则
        Summary: 查询路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mesh_queuerouterules_ex(request, headers, runtime)

    async def query_mesh_queuerouterules_async(
        self,
        request: mq_models.QueryMeshQueuerouterulesRequest,
    ) -> mq_models.QueryMeshQueuerouterulesResponse:
        """
        Description: 查询路由规则
        Summary: 查询路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mesh_queuerouterules_ex_async(request, headers, runtime)

    def query_mesh_queuerouterules_ex(
        self,
        request: mq_models.QueryMeshQueuerouterulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshQueuerouterulesResponse:
        """
        Description: 查询路由规则
        Summary: 查询路由规则
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshQueuerouterulesResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queuerouterules.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mesh_queuerouterules_ex_async(
        self,
        request: mq_models.QueryMeshQueuerouterulesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshQueuerouterulesResponse:
        """
        Description: 查询路由规则
        Summary: 查询路由规则
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshQueuerouterulesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queuerouterules.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mesh_queuerouteedition(
        self,
        request: mq_models.QueryMeshQueuerouteeditionRequest,
    ) -> mq_models.QueryMeshQueuerouteeditionResponse:
        """
        Description: 查询路由版本
        Summary: 查询路由版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mesh_queuerouteedition_ex(request, headers, runtime)

    async def query_mesh_queuerouteedition_async(
        self,
        request: mq_models.QueryMeshQueuerouteeditionRequest,
    ) -> mq_models.QueryMeshQueuerouteeditionResponse:
        """
        Description: 查询路由版本
        Summary: 查询路由版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mesh_queuerouteedition_ex_async(request, headers, runtime)

    def query_mesh_queuerouteedition_ex(
        self,
        request: mq_models.QueryMeshQueuerouteeditionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshQueuerouteeditionResponse:
        """
        Description: 查询路由版本
        Summary: 查询路由版本
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshQueuerouteeditionResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queuerouteedition.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mesh_queuerouteedition_ex_async(
        self,
        request: mq_models.QueryMeshQueuerouteeditionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshQueuerouteeditionResponse:
        """
        Description: 查询路由版本
        Summary: 查询路由版本
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshQueuerouteeditionResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queuerouteedition.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_mesh_queueroute(
        self,
        request: mq_models.ImportMeshQueuerouteRequest,
    ) -> mq_models.ImportMeshQueuerouteResponse:
        """
        Description: 添加路由规则
        Summary: 添加路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_mesh_queueroute_ex(request, headers, runtime)

    async def import_mesh_queueroute_async(
        self,
        request: mq_models.ImportMeshQueuerouteRequest,
    ) -> mq_models.ImportMeshQueuerouteResponse:
        """
        Description: 添加路由规则
        Summary: 添加路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_mesh_queueroute_ex_async(request, headers, runtime)

    def import_mesh_queueroute_ex(
        self,
        request: mq_models.ImportMeshQueuerouteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ImportMeshQueuerouteResponse:
        """
        Description: 添加路由规则
        Summary: 添加路由规则
        """
        UtilClient.validate_model(request)
        return mq_models.ImportMeshQueuerouteResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queueroute.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_mesh_queueroute_ex_async(
        self,
        request: mq_models.ImportMeshQueuerouteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ImportMeshQueuerouteResponse:
        """
        Description: 添加路由规则
        Summary: 添加路由规则
        """
        UtilClient.validate_model(request)
        return mq_models.ImportMeshQueuerouteResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queueroute.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_mesh_queueroute(
        self,
        request: mq_models.UpdateMeshQueuerouteRequest,
    ) -> mq_models.UpdateMeshQueuerouteResponse:
        """
        Description: 更新路由规则
        Summary: 更新路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_mesh_queueroute_ex(request, headers, runtime)

    async def update_mesh_queueroute_async(
        self,
        request: mq_models.UpdateMeshQueuerouteRequest,
    ) -> mq_models.UpdateMeshQueuerouteResponse:
        """
        Description: 更新路由规则
        Summary: 更新路由规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_mesh_queueroute_ex_async(request, headers, runtime)

    def update_mesh_queueroute_ex(
        self,
        request: mq_models.UpdateMeshQueuerouteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMeshQueuerouteResponse:
        """
        Description: 更新路由规则
        Summary: 更新路由规则
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMeshQueuerouteResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queueroute.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_mesh_queueroute_ex_async(
        self,
        request: mq_models.UpdateMeshQueuerouteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMeshQueuerouteResponse:
        """
        Description: 更新路由规则
        Summary: 更新路由规则
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMeshQueuerouteResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queueroute.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_mesh_queueroute(
        self,
        request: mq_models.DeleteMeshQueuerouteRequest,
    ) -> mq_models.DeleteMeshQueuerouteResponse:
        """
        Description: 删除限流规则
        Summary: 删除限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_mesh_queueroute_ex(request, headers, runtime)

    async def delete_mesh_queueroute_async(
        self,
        request: mq_models.DeleteMeshQueuerouteRequest,
    ) -> mq_models.DeleteMeshQueuerouteResponse:
        """
        Description: 删除限流规则
        Summary: 删除限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_mesh_queueroute_ex_async(request, headers, runtime)

    def delete_mesh_queueroute_ex(
        self,
        request: mq_models.DeleteMeshQueuerouteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteMeshQueuerouteResponse:
        """
        Description: 删除限流规则
        Summary: 删除限流规则
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteMeshQueuerouteResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queueroute.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_mesh_queueroute_ex_async(
        self,
        request: mq_models.DeleteMeshQueuerouteRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteMeshQueuerouteResponse:
        """
        Description: 删除限流规则
        Summary: 删除限流规则
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteMeshQueuerouteResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queueroute.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_mesh_queuerouteedition(
        self,
        request: mq_models.DeleteMeshQueuerouteeditionRequest,
    ) -> mq_models.DeleteMeshQueuerouteeditionResponse:
        """
        Description: 删除路由版本
        Summary: 删除路由版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_mesh_queuerouteedition_ex(request, headers, runtime)

    async def delete_mesh_queuerouteedition_async(
        self,
        request: mq_models.DeleteMeshQueuerouteeditionRequest,
    ) -> mq_models.DeleteMeshQueuerouteeditionResponse:
        """
        Description: 删除路由版本
        Summary: 删除路由版本
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_mesh_queuerouteedition_ex_async(request, headers, runtime)

    def delete_mesh_queuerouteedition_ex(
        self,
        request: mq_models.DeleteMeshQueuerouteeditionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteMeshQueuerouteeditionResponse:
        """
        Description: 删除路由版本
        Summary: 删除路由版本
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteMeshQueuerouteeditionResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queuerouteedition.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_mesh_queuerouteedition_ex_async(
        self,
        request: mq_models.DeleteMeshQueuerouteeditionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteMeshQueuerouteeditionResponse:
        """
        Description: 删除路由版本
        Summary: 删除路由版本
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteMeshQueuerouteeditionResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queuerouteedition.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mesh_queuerouteapp(
        self,
        request: mq_models.QueryMeshQueuerouteappRequest,
    ) -> mq_models.QueryMeshQueuerouteappResponse:
        """
        Description: 查询路由规则应用
        Summary: 查询路由规则应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mesh_queuerouteapp_ex(request, headers, runtime)

    async def query_mesh_queuerouteapp_async(
        self,
        request: mq_models.QueryMeshQueuerouteappRequest,
    ) -> mq_models.QueryMeshQueuerouteappResponse:
        """
        Description: 查询路由规则应用
        Summary: 查询路由规则应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mesh_queuerouteapp_ex_async(request, headers, runtime)

    def query_mesh_queuerouteapp_ex(
        self,
        request: mq_models.QueryMeshQueuerouteappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshQueuerouteappResponse:
        """
        Description: 查询路由规则应用
        Summary: 查询路由规则应用
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshQueuerouteappResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queuerouteapp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mesh_queuerouteapp_ex_async(
        self,
        request: mq_models.QueryMeshQueuerouteappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshQueuerouteappResponse:
        """
        Description: 查询路由规则应用
        Summary: 查询路由规则应用
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshQueuerouteappResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queuerouteapp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mesh_queuebyid(
        self,
        request: mq_models.QueryMeshQueuebyidRequest,
    ) -> mq_models.QueryMeshQueuebyidResponse:
        """
        Description: 根据队列id查询队列详情
        Summary: 根据队列id查询队列详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mesh_queuebyid_ex(request, headers, runtime)

    async def query_mesh_queuebyid_async(
        self,
        request: mq_models.QueryMeshQueuebyidRequest,
    ) -> mq_models.QueryMeshQueuebyidResponse:
        """
        Description: 根据队列id查询队列详情
        Summary: 根据队列id查询队列详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mesh_queuebyid_ex_async(request, headers, runtime)

    def query_mesh_queuebyid_ex(
        self,
        request: mq_models.QueryMeshQueuebyidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshQueuebyidResponse:
        """
        Description: 根据队列id查询队列详情
        Summary: 根据队列id查询队列详情
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshQueuebyidResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queuebyid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mesh_queuebyid_ex_async(
        self,
        request: mq_models.QueryMeshQueuebyidRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshQueuebyidResponse:
        """
        Description: 根据队列id查询队列详情
        Summary: 根据队列id查询队列详情
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshQueuebyidResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queuebyid.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_mesh_queuelimitstatus(
        self,
        request: mq_models.UpdateMeshQueuelimitstatusRequest,
    ) -> mq_models.UpdateMeshQueuelimitstatusResponse:
        """
        Description: zhaolei
        Summary: 更新限流状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_mesh_queuelimitstatus_ex(request, headers, runtime)

    async def update_mesh_queuelimitstatus_async(
        self,
        request: mq_models.UpdateMeshQueuelimitstatusRequest,
    ) -> mq_models.UpdateMeshQueuelimitstatusResponse:
        """
        Description: zhaolei
        Summary: 更新限流状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_mesh_queuelimitstatus_ex_async(request, headers, runtime)

    def update_mesh_queuelimitstatus_ex(
        self,
        request: mq_models.UpdateMeshQueuelimitstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMeshQueuelimitstatusResponse:
        """
        Description: zhaolei
        Summary: 更新限流状态
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMeshQueuelimitstatusResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queuelimitstatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_mesh_queuelimitstatus_ex_async(
        self,
        request: mq_models.UpdateMeshQueuelimitstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMeshQueuelimitstatusResponse:
        """
        Description: zhaolei
        Summary: 更新限流状态
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMeshQueuelimitstatusResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queuelimitstatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_mesh_queueroutestatus(
        self,
        request: mq_models.UpdateMeshQueueroutestatusRequest,
    ) -> mq_models.UpdateMeshQueueroutestatusResponse:
        """
        Description: 更新路由规则状态
        Summary: 更新路由规则状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_mesh_queueroutestatus_ex(request, headers, runtime)

    async def update_mesh_queueroutestatus_async(
        self,
        request: mq_models.UpdateMeshQueueroutestatusRequest,
    ) -> mq_models.UpdateMeshQueueroutestatusResponse:
        """
        Description: 更新路由规则状态
        Summary: 更新路由规则状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_mesh_queueroutestatus_ex_async(request, headers, runtime)

    def update_mesh_queueroutestatus_ex(
        self,
        request: mq_models.UpdateMeshQueueroutestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMeshQueueroutestatusResponse:
        """
        Description: 更新路由规则状态
        Summary: 更新路由规则状态
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMeshQueueroutestatusResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queueroutestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_mesh_queueroutestatus_ex_async(
        self,
        request: mq_models.UpdateMeshQueueroutestatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMeshQueueroutestatusResponse:
        """
        Description: 更新路由规则状态
        Summary: 更新路由规则状态
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMeshQueueroutestatusResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queueroutestatus.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sofamq_admintopic(
        self,
        request: mq_models.UpdateSofamqAdmintopicRequest,
    ) -> mq_models.UpdateSofamqAdmintopicResponse:
        """
        Description: 管理员更新topic
        Summary: 管理员更新topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sofamq_admintopic_ex(request, headers, runtime)

    async def update_sofamq_admintopic_async(
        self,
        request: mq_models.UpdateSofamqAdmintopicRequest,
    ) -> mq_models.UpdateSofamqAdmintopicResponse:
        """
        Description: 管理员更新topic
        Summary: 管理员更新topic
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sofamq_admintopic_ex_async(request, headers, runtime)

    def update_sofamq_admintopic_ex(
        self,
        request: mq_models.UpdateSofamqAdmintopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqAdmintopicResponse:
        """
        Description: 管理员更新topic
        Summary: 管理员更新topic
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqAdmintopicResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.admintopic.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sofamq_admintopic_ex_async(
        self,
        request: mq_models.UpdateSofamqAdmintopicRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqAdmintopicResponse:
        """
        Description: 管理员更新topic
        Summary: 管理员更新topic
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqAdmintopicResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.admintopic.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sofamq_admingroup(
        self,
        request: mq_models.UpdateSofamqAdmingroupRequest,
    ) -> mq_models.UpdateSofamqAdmingroupResponse:
        """
        Description: 管理员更新group
        Summary: 管理员更新group
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sofamq_admingroup_ex(request, headers, runtime)

    async def update_sofamq_admingroup_async(
        self,
        request: mq_models.UpdateSofamqAdmingroupRequest,
    ) -> mq_models.UpdateSofamqAdmingroupResponse:
        """
        Description: 管理员更新group
        Summary: 管理员更新group
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sofamq_admingroup_ex_async(request, headers, runtime)

    def update_sofamq_admingroup_ex(
        self,
        request: mq_models.UpdateSofamqAdmingroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqAdmingroupResponse:
        """
        Description: 管理员更新group
        Summary: 管理员更新group
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqAdmingroupResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.admingroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sofamq_admingroup_ex_async(
        self,
        request: mq_models.UpdateSofamqAdmingroupRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqAdmingroupResponse:
        """
        Description: 管理员更新group
        Summary: 管理员更新group
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqAdmingroupResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.admingroup.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def run_sofamq_connectorjob(
        self,
        request: mq_models.RunSofamqConnectorjobRequest,
    ) -> mq_models.RunSofamqConnectorjobResponse:
        """
        Description: 手动触发一次任务的执行
        Summary: 手动触发一次任务的执行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.run_sofamq_connectorjob_ex(request, headers, runtime)

    async def run_sofamq_connectorjob_async(
        self,
        request: mq_models.RunSofamqConnectorjobRequest,
    ) -> mq_models.RunSofamqConnectorjobResponse:
        """
        Description: 手动触发一次任务的执行
        Summary: 手动触发一次任务的执行
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.run_sofamq_connectorjob_ex_async(request, headers, runtime)

    def run_sofamq_connectorjob_ex(
        self,
        request: mq_models.RunSofamqConnectorjobRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.RunSofamqConnectorjobResponse:
        """
        Description: 手动触发一次任务的执行
        Summary: 手动触发一次任务的执行
        """
        UtilClient.validate_model(request)
        return mq_models.RunSofamqConnectorjobResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorjob.run', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def run_sofamq_connectorjob_ex_async(
        self,
        request: mq_models.RunSofamqConnectorjobRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.RunSofamqConnectorjobResponse:
        """
        Description: 手动触发一次任务的执行
        Summary: 手动触发一次任务的执行
        """
        UtilClient.validate_model(request)
        return mq_models.RunSofamqConnectorjobResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorjob.run', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pause_sofamq_connectorjob(
        self,
        request: mq_models.PauseSofamqConnectorjobRequest,
    ) -> mq_models.PauseSofamqConnectorjobResponse:
        """
        Description: 暂停一个Connector任务
        Summary: 暂停一个任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pause_sofamq_connectorjob_ex(request, headers, runtime)

    async def pause_sofamq_connectorjob_async(
        self,
        request: mq_models.PauseSofamqConnectorjobRequest,
    ) -> mq_models.PauseSofamqConnectorjobResponse:
        """
        Description: 暂停一个Connector任务
        Summary: 暂停一个任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pause_sofamq_connectorjob_ex_async(request, headers, runtime)

    def pause_sofamq_connectorjob_ex(
        self,
        request: mq_models.PauseSofamqConnectorjobRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.PauseSofamqConnectorjobResponse:
        """
        Description: 暂停一个Connector任务
        Summary: 暂停一个任务
        """
        UtilClient.validate_model(request)
        return mq_models.PauseSofamqConnectorjobResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorjob.pause', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pause_sofamq_connectorjob_ex_async(
        self,
        request: mq_models.PauseSofamqConnectorjobRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.PauseSofamqConnectorjobResponse:
        """
        Description: 暂停一个Connector任务
        Summary: 暂停一个任务
        """
        UtilClient.validate_model(request)
        return mq_models.PauseSofamqConnectorjobResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorjob.pause', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def resume_sofamq_connectorjob(
        self,
        request: mq_models.ResumeSofamqConnectorjobRequest,
    ) -> mq_models.ResumeSofamqConnectorjobResponse:
        """
        Description: 恢复一个暂停的任务
        Summary: 恢复一个暂停的任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.resume_sofamq_connectorjob_ex(request, headers, runtime)

    async def resume_sofamq_connectorjob_async(
        self,
        request: mq_models.ResumeSofamqConnectorjobRequest,
    ) -> mq_models.ResumeSofamqConnectorjobResponse:
        """
        Description: 恢复一个暂停的任务
        Summary: 恢复一个暂停的任务
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.resume_sofamq_connectorjob_ex_async(request, headers, runtime)

    def resume_sofamq_connectorjob_ex(
        self,
        request: mq_models.ResumeSofamqConnectorjobRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ResumeSofamqConnectorjobResponse:
        """
        Description: 恢复一个暂停的任务
        Summary: 恢复一个暂停的任务
        """
        UtilClient.validate_model(request)
        return mq_models.ResumeSofamqConnectorjobResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorjob.resume', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def resume_sofamq_connectorjob_ex_async(
        self,
        request: mq_models.ResumeSofamqConnectorjobRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ResumeSofamqConnectorjobResponse:
        """
        Description: 恢复一个暂停的任务
        Summary: 恢复一个暂停的任务
        """
        UtilClient.validate_model(request)
        return mq_models.ResumeSofamqConnectorjobResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorjob.resume', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_mesh_queueroutestatusconfirm(
        self,
        request: mq_models.UpdateMeshQueueroutestatusconfirmRequest,
    ) -> mq_models.UpdateMeshQueueroutestatusconfirmResponse:
        """
        Description: 确认覆盖路有规则状态
        Summary: 确认覆盖路由规则状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_mesh_queueroutestatusconfirm_ex(request, headers, runtime)

    async def update_mesh_queueroutestatusconfirm_async(
        self,
        request: mq_models.UpdateMeshQueueroutestatusconfirmRequest,
    ) -> mq_models.UpdateMeshQueueroutestatusconfirmResponse:
        """
        Description: 确认覆盖路有规则状态
        Summary: 确认覆盖路由规则状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_mesh_queueroutestatusconfirm_ex_async(request, headers, runtime)

    def update_mesh_queueroutestatusconfirm_ex(
        self,
        request: mq_models.UpdateMeshQueueroutestatusconfirmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMeshQueueroutestatusconfirmResponse:
        """
        Description: 确认覆盖路有规则状态
        Summary: 确认覆盖路由规则状态
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMeshQueueroutestatusconfirmResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queueroutestatusconfirm.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_mesh_queueroutestatusconfirm_ex_async(
        self,
        request: mq_models.UpdateMeshQueueroutestatusconfirmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMeshQueueroutestatusconfirmResponse:
        """
        Description: 确认覆盖路有规则状态
        Summary: 确认覆盖路由规则状态
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMeshQueueroutestatusconfirmResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queueroutestatusconfirm.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_mesh_queuelimitstatusconfirm(
        self,
        request: mq_models.UpdateMeshQueuelimitstatusconfirmRequest,
    ) -> mq_models.UpdateMeshQueuelimitstatusconfirmResponse:
        """
        Description: 更细限流状态
        Summary: 更新限流状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_mesh_queuelimitstatusconfirm_ex(request, headers, runtime)

    async def update_mesh_queuelimitstatusconfirm_async(
        self,
        request: mq_models.UpdateMeshQueuelimitstatusconfirmRequest,
    ) -> mq_models.UpdateMeshQueuelimitstatusconfirmResponse:
        """
        Description: 更细限流状态
        Summary: 更新限流状态
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_mesh_queuelimitstatusconfirm_ex_async(request, headers, runtime)

    def update_mesh_queuelimitstatusconfirm_ex(
        self,
        request: mq_models.UpdateMeshQueuelimitstatusconfirmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMeshQueuelimitstatusconfirmResponse:
        """
        Description: 更细限流状态
        Summary: 更新限流状态
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMeshQueuelimitstatusconfirmResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.queuelimitstatusconfirm.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_mesh_queuelimitstatusconfirm_ex_async(
        self,
        request: mq_models.UpdateMeshQueuelimitstatusconfirmRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMeshQueuelimitstatusconfirmResponse:
        """
        Description: 更细限流状态
        Summary: 更新限流状态
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMeshQueuelimitstatusconfirmResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.queuelimitstatusconfirm.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def exec_sofamq_dailycheck(
        self,
        request: mq_models.ExecSofamqDailycheckRequest,
    ) -> mq_models.ExecSofamqDailycheckResponse:
        """
        Description: 日切检查，验证是否可以完成日切
        Summary: 日切检查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.exec_sofamq_dailycheck_ex(request, headers, runtime)

    async def exec_sofamq_dailycheck_async(
        self,
        request: mq_models.ExecSofamqDailycheckRequest,
    ) -> mq_models.ExecSofamqDailycheckResponse:
        """
        Description: 日切检查，验证是否可以完成日切
        Summary: 日切检查
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.exec_sofamq_dailycheck_ex_async(request, headers, runtime)

    def exec_sofamq_dailycheck_ex(
        self,
        request: mq_models.ExecSofamqDailycheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ExecSofamqDailycheckResponse:
        """
        Description: 日切检查，验证是否可以完成日切
        Summary: 日切检查
        """
        UtilClient.validate_model(request)
        return mq_models.ExecSofamqDailycheckResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.dailycheck.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def exec_sofamq_dailycheck_ex_async(
        self,
        request: mq_models.ExecSofamqDailycheckRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ExecSofamqDailycheckResponse:
        """
        Description: 日切检查，验证是否可以完成日切
        Summary: 日切检查
        """
        UtilClient.validate_model(request)
        return mq_models.ExecSofamqDailycheckResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.dailycheck.exec', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mesh_application(
        self,
        request: mq_models.QueryMeshApplicationRequest,
    ) -> mq_models.QueryMeshApplicationResponse:
        """
        Description: 查询应用详情
        Summary: 查询应用详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mesh_application_ex(request, headers, runtime)

    async def query_mesh_application_async(
        self,
        request: mq_models.QueryMeshApplicationRequest,
    ) -> mq_models.QueryMeshApplicationResponse:
        """
        Description: 查询应用详情
        Summary: 查询应用详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mesh_application_ex_async(request, headers, runtime)

    def query_mesh_application_ex(
        self,
        request: mq_models.QueryMeshApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshApplicationResponse:
        """
        Description: 查询应用详情
        Summary: 查询应用详情
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshApplicationResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.application.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mesh_application_ex_async(
        self,
        request: mq_models.QueryMeshApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshApplicationResponse:
        """
        Description: 查询应用详情
        Summary: 查询应用详情
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshApplicationResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.application.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def import_mesh_application(
        self,
        request: mq_models.ImportMeshApplicationRequest,
    ) -> mq_models.ImportMeshApplicationResponse:
        """
        Description: 新增应用
        Summary: 新增应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.import_mesh_application_ex(request, headers, runtime)

    async def import_mesh_application_async(
        self,
        request: mq_models.ImportMeshApplicationRequest,
    ) -> mq_models.ImportMeshApplicationResponse:
        """
        Description: 新增应用
        Summary: 新增应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.import_mesh_application_ex_async(request, headers, runtime)

    def import_mesh_application_ex(
        self,
        request: mq_models.ImportMeshApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ImportMeshApplicationResponse:
        """
        Description: 新增应用
        Summary: 新增应用
        """
        UtilClient.validate_model(request)
        return mq_models.ImportMeshApplicationResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.application.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def import_mesh_application_ex_async(
        self,
        request: mq_models.ImportMeshApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ImportMeshApplicationResponse:
        """
        Description: 新增应用
        Summary: 新增应用
        """
        UtilClient.validate_model(request)
        return mq_models.ImportMeshApplicationResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.application.import', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_mesh_application(
        self,
        request: mq_models.UpdateMeshApplicationRequest,
    ) -> mq_models.UpdateMeshApplicationResponse:
        """
        Description: 更新应用
        Summary: 更新应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_mesh_application_ex(request, headers, runtime)

    async def update_mesh_application_async(
        self,
        request: mq_models.UpdateMeshApplicationRequest,
    ) -> mq_models.UpdateMeshApplicationResponse:
        """
        Description: 更新应用
        Summary: 更新应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_mesh_application_ex_async(request, headers, runtime)

    def update_mesh_application_ex(
        self,
        request: mq_models.UpdateMeshApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMeshApplicationResponse:
        """
        Description: 更新应用
        Summary: 更新应用
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMeshApplicationResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.application.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_mesh_application_ex_async(
        self,
        request: mq_models.UpdateMeshApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMeshApplicationResponse:
        """
        Description: 更新应用
        Summary: 更新应用
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMeshApplicationResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.application.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_mesh_application(
        self,
        request: mq_models.DeleteMeshApplicationRequest,
    ) -> mq_models.DeleteMeshApplicationResponse:
        """
        Description: 删除应用
        Summary: 删除应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_mesh_application_ex(request, headers, runtime)

    async def delete_mesh_application_async(
        self,
        request: mq_models.DeleteMeshApplicationRequest,
    ) -> mq_models.DeleteMeshApplicationResponse:
        """
        Description: 删除应用
        Summary: 删除应用
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_mesh_application_ex_async(request, headers, runtime)

    def delete_mesh_application_ex(
        self,
        request: mq_models.DeleteMeshApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteMeshApplicationResponse:
        """
        Description: 删除应用
        Summary: 删除应用
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteMeshApplicationResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.application.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_mesh_application_ex_async(
        self,
        request: mq_models.DeleteMeshApplicationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteMeshApplicationResponse:
        """
        Description: 删除应用
        Summary: 删除应用
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteMeshApplicationResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.application.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mesh_applicationservice(
        self,
        request: mq_models.QueryMeshApplicationserviceRequest,
    ) -> mq_models.QueryMeshApplicationserviceResponse:
        """
        Description: 查询应用服务id
        Summary: 查询应用服务id
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mesh_applicationservice_ex(request, headers, runtime)

    async def query_mesh_applicationservice_async(
        self,
        request: mq_models.QueryMeshApplicationserviceRequest,
    ) -> mq_models.QueryMeshApplicationserviceResponse:
        """
        Description: 查询应用服务id
        Summary: 查询应用服务id
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mesh_applicationservice_ex_async(request, headers, runtime)

    def query_mesh_applicationservice_ex(
        self,
        request: mq_models.QueryMeshApplicationserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshApplicationserviceResponse:
        """
        Description: 查询应用服务id
        Summary: 查询应用服务id
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshApplicationserviceResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.applicationservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mesh_applicationservice_ex_async(
        self,
        request: mq_models.QueryMeshApplicationserviceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshApplicationserviceResponse:
        """
        Description: 查询应用服务id
        Summary: 查询应用服务id
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshApplicationserviceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.applicationservice.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mesh_applicationbyname(
        self,
        request: mq_models.QueryMeshApplicationbynameRequest,
    ) -> mq_models.QueryMeshApplicationbynameResponse:
        """
        Description: 根据应用名查应用详情
        Summary: 根据应用名查应用详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mesh_applicationbyname_ex(request, headers, runtime)

    async def query_mesh_applicationbyname_async(
        self,
        request: mq_models.QueryMeshApplicationbynameRequest,
    ) -> mq_models.QueryMeshApplicationbynameResponse:
        """
        Description: 根据应用名查应用详情
        Summary: 根据应用名查应用详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mesh_applicationbyname_ex_async(request, headers, runtime)

    def query_mesh_applicationbyname_ex(
        self,
        request: mq_models.QueryMeshApplicationbynameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshApplicationbynameResponse:
        """
        Description: 根据应用名查应用详情
        Summary: 根据应用名查应用详情
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshApplicationbynameResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.applicationbyname.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mesh_applicationbyname_ex_async(
        self,
        request: mq_models.QueryMeshApplicationbynameRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshApplicationbynameResponse:
        """
        Description: 根据应用名查应用详情
        Summary: 根据应用名查应用详情
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshApplicationbynameResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.applicationbyname.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mesh_applicationlist(
        self,
        request: mq_models.QueryMeshApplicationlistRequest,
    ) -> mq_models.QueryMeshApplicationlistResponse:
        """
        Description: 查询队列的应用列表
        Summary: 查询队列的应用列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mesh_applicationlist_ex(request, headers, runtime)

    async def query_mesh_applicationlist_async(
        self,
        request: mq_models.QueryMeshApplicationlistRequest,
    ) -> mq_models.QueryMeshApplicationlistResponse:
        """
        Description: 查询队列的应用列表
        Summary: 查询队列的应用列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mesh_applicationlist_ex_async(request, headers, runtime)

    def query_mesh_applicationlist_ex(
        self,
        request: mq_models.QueryMeshApplicationlistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshApplicationlistResponse:
        """
        Description: 查询队列的应用列表
        Summary: 查询队列的应用列表
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshApplicationlistResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.applicationlist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mesh_applicationlist_ex_async(
        self,
        request: mq_models.QueryMeshApplicationlistRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshApplicationlistResponse:
        """
        Description: 查询队列的应用列表
        Summary: 查询队列的应用列表
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshApplicationlistResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.applicationlist.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_mesh_applicationqueuenames(
        self,
        request: mq_models.QueryMeshApplicationqueuenamesRequest,
    ) -> mq_models.QueryMeshApplicationqueuenamesResponse:
        """
        Description: 应用队列下拉框
        Summary: 应用队列下拉框
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_mesh_applicationqueuenames_ex(request, headers, runtime)

    async def query_mesh_applicationqueuenames_async(
        self,
        request: mq_models.QueryMeshApplicationqueuenamesRequest,
    ) -> mq_models.QueryMeshApplicationqueuenamesResponse:
        """
        Description: 应用队列下拉框
        Summary: 应用队列下拉框
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_mesh_applicationqueuenames_ex_async(request, headers, runtime)

    def query_mesh_applicationqueuenames_ex(
        self,
        request: mq_models.QueryMeshApplicationqueuenamesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshApplicationqueuenamesResponse:
        """
        Description: 应用队列下拉框
        Summary: 应用队列下拉框
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshApplicationqueuenamesResponse().from_map(
            self.do_request('2.0', 'sofa.mq.mesh.applicationqueuenames.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_mesh_applicationqueuenames_ex_async(
        self,
        request: mq_models.QueryMeshApplicationqueuenamesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryMeshApplicationqueuenamesResponse:
        """
        Description: 应用队列下拉框
        Summary: 应用队列下拉框
        """
        UtilClient.validate_model(request)
        return mq_models.QueryMeshApplicationqueuenamesResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.mesh.applicationqueuenames.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def pause_sofamq_connectorplan(
        self,
        request: mq_models.PauseSofamqConnectorplanRequest,
    ) -> mq_models.PauseSofamqConnectorplanResponse:
        """
        Description: 暂停一个Connector执行计划
        Summary: 暂停一个Connector执行计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.pause_sofamq_connectorplan_ex(request, headers, runtime)

    async def pause_sofamq_connectorplan_async(
        self,
        request: mq_models.PauseSofamqConnectorplanRequest,
    ) -> mq_models.PauseSofamqConnectorplanResponse:
        """
        Description: 暂停一个Connector执行计划
        Summary: 暂停一个Connector执行计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.pause_sofamq_connectorplan_ex_async(request, headers, runtime)

    def pause_sofamq_connectorplan_ex(
        self,
        request: mq_models.PauseSofamqConnectorplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.PauseSofamqConnectorplanResponse:
        """
        Description: 暂停一个Connector执行计划
        Summary: 暂停一个Connector执行计划
        """
        UtilClient.validate_model(request)
        return mq_models.PauseSofamqConnectorplanResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorplan.pause', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def pause_sofamq_connectorplan_ex_async(
        self,
        request: mq_models.PauseSofamqConnectorplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.PauseSofamqConnectorplanResponse:
        """
        Description: 暂停一个Connector执行计划
        Summary: 暂停一个Connector执行计划
        """
        UtilClient.validate_model(request)
        return mq_models.PauseSofamqConnectorplanResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorplan.pause', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def resume_sofamq_connectorplan(
        self,
        request: mq_models.ResumeSofamqConnectorplanRequest,
    ) -> mq_models.ResumeSofamqConnectorplanResponse:
        """
        Description: 恢复一个connector执行计划
        Summary: 恢复一个connector执行计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.resume_sofamq_connectorplan_ex(request, headers, runtime)

    async def resume_sofamq_connectorplan_async(
        self,
        request: mq_models.ResumeSofamqConnectorplanRequest,
    ) -> mq_models.ResumeSofamqConnectorplanResponse:
        """
        Description: 恢复一个connector执行计划
        Summary: 恢复一个connector执行计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.resume_sofamq_connectorplan_ex_async(request, headers, runtime)

    def resume_sofamq_connectorplan_ex(
        self,
        request: mq_models.ResumeSofamqConnectorplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ResumeSofamqConnectorplanResponse:
        """
        Description: 恢复一个connector执行计划
        Summary: 恢复一个connector执行计划
        """
        UtilClient.validate_model(request)
        return mq_models.ResumeSofamqConnectorplanResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorplan.resume', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def resume_sofamq_connectorplan_ex_async(
        self,
        request: mq_models.ResumeSofamqConnectorplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ResumeSofamqConnectorplanResponse:
        """
        Description: 恢复一个connector执行计划
        Summary: 恢复一个connector执行计划
        """
        UtilClient.validate_model(request)
        return mq_models.ResumeSofamqConnectorplanResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorplan.resume', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def retry_sofamq_connectorplan(
        self,
        request: mq_models.RetrySofamqConnectorplanRequest,
    ) -> mq_models.RetrySofamqConnectorplanResponse:
        """
        Description: 重启一个已有的connector任务计划，会删除当前的执行计划和执行进度
        Summary: 重启一个已有的connector任务计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.retry_sofamq_connectorplan_ex(request, headers, runtime)

    async def retry_sofamq_connectorplan_async(
        self,
        request: mq_models.RetrySofamqConnectorplanRequest,
    ) -> mq_models.RetrySofamqConnectorplanResponse:
        """
        Description: 重启一个已有的connector任务计划，会删除当前的执行计划和执行进度
        Summary: 重启一个已有的connector任务计划
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.retry_sofamq_connectorplan_ex_async(request, headers, runtime)

    def retry_sofamq_connectorplan_ex(
        self,
        request: mq_models.RetrySofamqConnectorplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.RetrySofamqConnectorplanResponse:
        """
        Description: 重启一个已有的connector任务计划，会删除当前的执行计划和执行进度
        Summary: 重启一个已有的connector任务计划
        """
        UtilClient.validate_model(request)
        return mq_models.RetrySofamqConnectorplanResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorplan.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def retry_sofamq_connectorplan_ex_async(
        self,
        request: mq_models.RetrySofamqConnectorplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.RetrySofamqConnectorplanResponse:
        """
        Description: 重启一个已有的connector任务计划，会删除当前的执行计划和执行进度
        Summary: 重启一个已有的connector任务计划
        """
        UtilClient.validate_model(request)
        return mq_models.RetrySofamqConnectorplanResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorplan.retry', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_connectorconfigs(
        self,
        request: mq_models.QuerySofamqConnectorconfigsRequest,
    ) -> mq_models.QuerySofamqConnectorconfigsResponse:
        """
        Description: 根据来源类型或去向类型，查询某个任务的所有配置，包括是否可以修改等
        Summary: 查询任务不同来源去向的配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_connectorconfigs_ex(request, headers, runtime)

    async def query_sofamq_connectorconfigs_async(
        self,
        request: mq_models.QuerySofamqConnectorconfigsRequest,
    ) -> mq_models.QuerySofamqConnectorconfigsResponse:
        """
        Description: 根据来源类型或去向类型，查询某个任务的所有配置，包括是否可以修改等
        Summary: 查询任务不同来源去向的配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_connectorconfigs_ex_async(request, headers, runtime)

    def query_sofamq_connectorconfigs_ex(
        self,
        request: mq_models.QuerySofamqConnectorconfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectorconfigsResponse:
        """
        Description: 根据来源类型或去向类型，查询某个任务的所有配置，包括是否可以修改等
        Summary: 查询任务不同来源去向的配置
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectorconfigsResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorconfigs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_connectorconfigs_ex_async(
        self,
        request: mq_models.QuerySofamqConnectorconfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectorconfigsResponse:
        """
        Description: 根据来源类型或去向类型，查询某个任务的所有配置，包括是否可以修改等
        Summary: 查询任务不同来源去向的配置
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectorconfigsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorconfigs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_consumelimiter(
        self,
        request: mq_models.CreateSofamqConsumelimiterRequest,
    ) -> mq_models.CreateSofamqConsumelimiterResponse:
        """
        Description: 创建消费限流规则
        Summary: 创建消费限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_consumelimiter_ex(request, headers, runtime)

    async def create_sofamq_consumelimiter_async(
        self,
        request: mq_models.CreateSofamqConsumelimiterRequest,
    ) -> mq_models.CreateSofamqConsumelimiterResponse:
        """
        Description: 创建消费限流规则
        Summary: 创建消费限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_consumelimiter_ex_async(request, headers, runtime)

    def create_sofamq_consumelimiter_ex(
        self,
        request: mq_models.CreateSofamqConsumelimiterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqConsumelimiterResponse:
        """
        Description: 创建消费限流规则
        Summary: 创建消费限流规则
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqConsumelimiterResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.consumelimiter.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_consumelimiter_ex_async(
        self,
        request: mq_models.CreateSofamqConsumelimiterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqConsumelimiterResponse:
        """
        Description: 创建消费限流规则
        Summary: 创建消费限流规则
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqConsumelimiterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.consumelimiter.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sofamq_consumelimiter(
        self,
        request: mq_models.UpdateSofamqConsumelimiterRequest,
    ) -> mq_models.UpdateSofamqConsumelimiterResponse:
        """
        Description: 更新限流规则
        Summary: 更新限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sofamq_consumelimiter_ex(request, headers, runtime)

    async def update_sofamq_consumelimiter_async(
        self,
        request: mq_models.UpdateSofamqConsumelimiterRequest,
    ) -> mq_models.UpdateSofamqConsumelimiterResponse:
        """
        Description: 更新限流规则
        Summary: 更新限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sofamq_consumelimiter_ex_async(request, headers, runtime)

    def update_sofamq_consumelimiter_ex(
        self,
        request: mq_models.UpdateSofamqConsumelimiterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqConsumelimiterResponse:
        """
        Description: 更新限流规则
        Summary: 更新限流规则
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqConsumelimiterResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.consumelimiter.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sofamq_consumelimiter_ex_async(
        self,
        request: mq_models.UpdateSofamqConsumelimiterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqConsumelimiterResponse:
        """
        Description: 更新限流规则
        Summary: 更新限流规则
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqConsumelimiterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.consumelimiter.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_consumelimiter(
        self,
        request: mq_models.DeleteSofamqConsumelimiterRequest,
    ) -> mq_models.DeleteSofamqConsumelimiterResponse:
        """
        Description: 删除限流规则
        Summary: 删除限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_consumelimiter_ex(request, headers, runtime)

    async def delete_sofamq_consumelimiter_async(
        self,
        request: mq_models.DeleteSofamqConsumelimiterRequest,
    ) -> mq_models.DeleteSofamqConsumelimiterResponse:
        """
        Description: 删除限流规则
        Summary: 删除限流规则
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_consumelimiter_ex_async(request, headers, runtime)

    def delete_sofamq_consumelimiter_ex(
        self,
        request: mq_models.DeleteSofamqConsumelimiterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqConsumelimiterResponse:
        """
        Description: 删除限流规则
        Summary: 删除限流规则
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqConsumelimiterResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.consumelimiter.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_consumelimiter_ex_async(
        self,
        request: mq_models.DeleteSofamqConsumelimiterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqConsumelimiterResponse:
        """
        Description: 删除限流规则
        Summary: 删除限流规则
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqConsumelimiterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.consumelimiter.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_consumelimiter(
        self,
        request: mq_models.QuerySofamqConsumelimiterRequest,
    ) -> mq_models.QuerySofamqConsumelimiterResponse:
        """
        Description: 获取限流规则
        Summary: 限流规则获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_consumelimiter_ex(request, headers, runtime)

    async def query_sofamq_consumelimiter_async(
        self,
        request: mq_models.QuerySofamqConsumelimiterRequest,
    ) -> mq_models.QuerySofamqConsumelimiterResponse:
        """
        Description: 获取限流规则
        Summary: 限流规则获取
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_consumelimiter_ex_async(request, headers, runtime)

    def query_sofamq_consumelimiter_ex(
        self,
        request: mq_models.QuerySofamqConsumelimiterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConsumelimiterResponse:
        """
        Description: 获取限流规则
        Summary: 限流规则获取
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConsumelimiterResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.consumelimiter.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_consumelimiter_ex_async(
        self,
        request: mq_models.QuerySofamqConsumelimiterRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConsumelimiterResponse:
        """
        Description: 获取限流规则
        Summary: 限流规则获取
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConsumelimiterResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.consumelimiter.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_dms_instance(
        self,
        request: mq_models.GetDmsInstanceRequest,
    ) -> mq_models.GetDmsInstanceResponse:
        """
        Description: dd
        Summary: dd
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_dms_instance_ex(request, headers, runtime)

    async def get_dms_instance_async(
        self,
        request: mq_models.GetDmsInstanceRequest,
    ) -> mq_models.GetDmsInstanceResponse:
        """
        Description: dd
        Summary: dd
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_dms_instance_ex_async(request, headers, runtime)

    def get_dms_instance_ex(
        self,
        request: mq_models.GetDmsInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetDmsInstanceResponse:
        """
        Description: dd
        Summary: dd
        """
        UtilClient.validate_model(request)
        return mq_models.GetDmsInstanceResponse().from_map(
            self.do_request('2.0', 'sofa.mq.dms.instance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_dms_instance_ex_async(
        self,
        request: mq_models.GetDmsInstanceRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetDmsInstanceResponse:
        """
        Description: dd
        Summary: dd
        """
        UtilClient.validate_model(request)
        return mq_models.GetDmsInstanceResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.dms.instance.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_labels(
        self,
        request: mq_models.QuerySofamqLabelsRequest,
    ) -> mq_models.QuerySofamqLabelsResponse:
        """
        Description: 查询标签
        Summary: 查询标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_labels_ex(request, headers, runtime)

    async def query_sofamq_labels_async(
        self,
        request: mq_models.QuerySofamqLabelsRequest,
    ) -> mq_models.QuerySofamqLabelsResponse:
        """
        Description: 查询标签
        Summary: 查询标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_labels_ex_async(request, headers, runtime)

    def query_sofamq_labels_ex(
        self,
        request: mq_models.QuerySofamqLabelsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqLabelsResponse:
        """
        Description: 查询标签
        Summary: 查询标签
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqLabelsResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.labels.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_labels_ex_async(
        self,
        request: mq_models.QuerySofamqLabelsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqLabelsResponse:
        """
        Description: 查询标签
        Summary: 查询标签
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqLabelsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.labels.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_labels(
        self,
        request: mq_models.CreateSofamqLabelsRequest,
    ) -> mq_models.CreateSofamqLabelsResponse:
        """
        Description: SofaMQ 创建资源标签
        Summary: 创建资源标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_labels_ex(request, headers, runtime)

    async def create_sofamq_labels_async(
        self,
        request: mq_models.CreateSofamqLabelsRequest,
    ) -> mq_models.CreateSofamqLabelsResponse:
        """
        Description: SofaMQ 创建资源标签
        Summary: 创建资源标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_labels_ex_async(request, headers, runtime)

    def create_sofamq_labels_ex(
        self,
        request: mq_models.CreateSofamqLabelsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqLabelsResponse:
        """
        Description: SofaMQ 创建资源标签
        Summary: 创建资源标签
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqLabelsResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.labels.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_labels_ex_async(
        self,
        request: mq_models.CreateSofamqLabelsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqLabelsResponse:
        """
        Description: SofaMQ 创建资源标签
        Summary: 创建资源标签
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqLabelsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.labels.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_labels(
        self,
        request: mq_models.DeleteSofamqLabelsRequest,
    ) -> mq_models.DeleteSofamqLabelsResponse:
        """
        Description: 删除资源标签
        Summary: 删除资源标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_labels_ex(request, headers, runtime)

    async def delete_sofamq_labels_async(
        self,
        request: mq_models.DeleteSofamqLabelsRequest,
    ) -> mq_models.DeleteSofamqLabelsResponse:
        """
        Description: 删除资源标签
        Summary: 删除资源标签
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_labels_ex_async(request, headers, runtime)

    def delete_sofamq_labels_ex(
        self,
        request: mq_models.DeleteSofamqLabelsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqLabelsResponse:
        """
        Description: 删除资源标签
        Summary: 删除资源标签
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqLabelsResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.labels.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_labels_ex_async(
        self,
        request: mq_models.DeleteSofamqLabelsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqLabelsResponse:
        """
        Description: 删除资源标签
        Summary: 删除资源标签
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqLabelsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.labels.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_schema(
        self,
        request: mq_models.ListSofamqSchemaRequest,
    ) -> mq_models.ListSofamqSchemaResponse:
        """
        Description: 获取特定Topic的Schema列表
        Summary: 获取Topic的Schema列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_schema_ex(request, headers, runtime)

    async def list_sofamq_schema_async(
        self,
        request: mq_models.ListSofamqSchemaRequest,
    ) -> mq_models.ListSofamqSchemaResponse:
        """
        Description: 获取特定Topic的Schema列表
        Summary: 获取Topic的Schema列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_schema_ex_async(request, headers, runtime)

    def list_sofamq_schema_ex(
        self,
        request: mq_models.ListSofamqSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqSchemaResponse:
        """
        Description: 获取特定Topic的Schema列表
        Summary: 获取Topic的Schema列表
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqSchemaResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.schema.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_schema_ex_async(
        self,
        request: mq_models.ListSofamqSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqSchemaResponse:
        """
        Description: 获取特定Topic的Schema列表
        Summary: 获取Topic的Schema列表
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqSchemaResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.schema.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_sofamq_schema(
        self,
        request: mq_models.CreateSofamqSchemaRequest,
    ) -> mq_models.CreateSofamqSchemaResponse:
        """
        Description: 创建Topic的Schema
        Summary: 创建Schema
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_sofamq_schema_ex(request, headers, runtime)

    async def create_sofamq_schema_async(
        self,
        request: mq_models.CreateSofamqSchemaRequest,
    ) -> mq_models.CreateSofamqSchemaResponse:
        """
        Description: 创建Topic的Schema
        Summary: 创建Schema
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_sofamq_schema_ex_async(request, headers, runtime)

    def create_sofamq_schema_ex(
        self,
        request: mq_models.CreateSofamqSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqSchemaResponse:
        """
        Description: 创建Topic的Schema
        Summary: 创建Schema
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqSchemaResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.schema.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_sofamq_schema_ex_async(
        self,
        request: mq_models.CreateSofamqSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CreateSofamqSchemaResponse:
        """
        Description: 创建Topic的Schema
        Summary: 创建Schema
        """
        UtilClient.validate_model(request)
        return mq_models.CreateSofamqSchemaResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.schema.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_sofamq_schema(
        self,
        request: mq_models.GetSofamqSchemaRequest,
    ) -> mq_models.GetSofamqSchemaResponse:
        """
        Description: 获取特定Topic特定版本的Schema
        Summary: 获取Schema详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_sofamq_schema_ex(request, headers, runtime)

    async def get_sofamq_schema_async(
        self,
        request: mq_models.GetSofamqSchemaRequest,
    ) -> mq_models.GetSofamqSchemaResponse:
        """
        Description: 获取特定Topic特定版本的Schema
        Summary: 获取Schema详情
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_sofamq_schema_ex_async(request, headers, runtime)

    def get_sofamq_schema_ex(
        self,
        request: mq_models.GetSofamqSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetSofamqSchemaResponse:
        """
        Description: 获取特定Topic特定版本的Schema
        Summary: 获取Schema详情
        """
        UtilClient.validate_model(request)
        return mq_models.GetSofamqSchemaResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.schema.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_sofamq_schema_ex_async(
        self,
        request: mq_models.GetSofamqSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.GetSofamqSchemaResponse:
        """
        Description: 获取特定Topic特定版本的Schema
        Summary: 获取Schema详情
        """
        UtilClient.validate_model(request)
        return mq_models.GetSofamqSchemaResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.schema.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_sofamq_schema(
        self,
        request: mq_models.ExportSofamqSchemaRequest,
    ) -> mq_models.ExportSofamqSchemaResponse:
        """
        Description: 根据Schema生成对应的POJO代码
        Summary: 获取schema对应的代码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_sofamq_schema_ex(request, headers, runtime)

    async def export_sofamq_schema_async(
        self,
        request: mq_models.ExportSofamqSchemaRequest,
    ) -> mq_models.ExportSofamqSchemaResponse:
        """
        Description: 根据Schema生成对应的POJO代码
        Summary: 获取schema对应的代码
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_sofamq_schema_ex_async(request, headers, runtime)

    def export_sofamq_schema_ex(
        self,
        request: mq_models.ExportSofamqSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ExportSofamqSchemaResponse:
        """
        Description: 根据Schema生成对应的POJO代码
        Summary: 获取schema对应的代码
        """
        UtilClient.validate_model(request)
        return mq_models.ExportSofamqSchemaResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.schema.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_sofamq_schema_ex_async(
        self,
        request: mq_models.ExportSofamqSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ExportSofamqSchemaResponse:
        """
        Description: 根据Schema生成对应的POJO代码
        Summary: 获取schema对应的代码
        """
        UtilClient.validate_model(request)
        return mq_models.ExportSofamqSchemaResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.schema.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_sofamq_schema(
        self,
        request: mq_models.UpdateSofamqSchemaRequest,
    ) -> mq_models.UpdateSofamqSchemaResponse:
        """
        Description: 更新schema信息（schema仅允许更新部分信息，比如描述信息；schema的内容是不能修改的）
        Summary: 更新schema
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_sofamq_schema_ex(request, headers, runtime)

    async def update_sofamq_schema_async(
        self,
        request: mq_models.UpdateSofamqSchemaRequest,
    ) -> mq_models.UpdateSofamqSchemaResponse:
        """
        Description: 更新schema信息（schema仅允许更新部分信息，比如描述信息；schema的内容是不能修改的）
        Summary: 更新schema
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_sofamq_schema_ex_async(request, headers, runtime)

    def update_sofamq_schema_ex(
        self,
        request: mq_models.UpdateSofamqSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqSchemaResponse:
        """
        Description: 更新schema信息（schema仅允许更新部分信息，比如描述信息；schema的内容是不能修改的）
        Summary: 更新schema
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqSchemaResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.schema.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_sofamq_schema_ex_async(
        self,
        request: mq_models.UpdateSofamqSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateSofamqSchemaResponse:
        """
        Description: 更新schema信息（schema仅允许更新部分信息，比如描述信息；schema的内容是不能修改的）
        Summary: 更新schema
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateSofamqSchemaResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.schema.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def all_sofamq_schema(
        self,
        request: mq_models.AllSofamqSchemaRequest,
    ) -> mq_models.AllSofamqSchemaResponse:
        """
        Description: 获取Schema的版本号列表，结果按版本号大小降序排列
        Summary: 获取Schema的版本号列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.all_sofamq_schema_ex(request, headers, runtime)

    async def all_sofamq_schema_async(
        self,
        request: mq_models.AllSofamqSchemaRequest,
    ) -> mq_models.AllSofamqSchemaResponse:
        """
        Description: 获取Schema的版本号列表，结果按版本号大小降序排列
        Summary: 获取Schema的版本号列表
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.all_sofamq_schema_ex_async(request, headers, runtime)

    def all_sofamq_schema_ex(
        self,
        request: mq_models.AllSofamqSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.AllSofamqSchemaResponse:
        """
        Description: 获取Schema的版本号列表，结果按版本号大小降序排列
        Summary: 获取Schema的版本号列表
        """
        UtilClient.validate_model(request)
        return mq_models.AllSofamqSchemaResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.schema.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def all_sofamq_schema_ex_async(
        self,
        request: mq_models.AllSofamqSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.AllSofamqSchemaResponse:
        """
        Description: 获取Schema的版本号列表，结果按版本号大小降序排列
        Summary: 获取Schema的版本号列表
        """
        UtilClient.validate_model(request)
        return mq_models.AllSofamqSchemaResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.schema.all', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def export_sofamq_message(
        self,
        request: mq_models.ExportSofamqMessageRequest,
    ) -> mq_models.ExportSofamqMessageResponse:
        """
        Description: 根据Schema解析消息体，查看消息体的详细数据
        Summary: 查看消息内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.export_sofamq_message_ex(request, headers, runtime)

    async def export_sofamq_message_async(
        self,
        request: mq_models.ExportSofamqMessageRequest,
    ) -> mq_models.ExportSofamqMessageResponse:
        """
        Description: 根据Schema解析消息体，查看消息体的详细数据
        Summary: 查看消息内容
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.export_sofamq_message_ex_async(request, headers, runtime)

    def export_sofamq_message_ex(
        self,
        request: mq_models.ExportSofamqMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ExportSofamqMessageResponse:
        """
        Description: 根据Schema解析消息体，查看消息体的详细数据
        Summary: 查看消息内容
        """
        UtilClient.validate_model(request)
        return mq_models.ExportSofamqMessageResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.message.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def export_sofamq_message_ex_async(
        self,
        request: mq_models.ExportSofamqMessageRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ExportSofamqMessageResponse:
        """
        Description: 根据Schema解析消息体，查看消息体的详细数据
        Summary: 查看消息内容
        """
        UtilClient.validate_model(request)
        return mq_models.ExportSofamqMessageResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.message.export', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_schemacompatibility(
        self,
        request: mq_models.ListSofamqSchemacompatibilityRequest,
    ) -> mq_models.ListSofamqSchemacompatibilityResponse:
        """
        Description: 获取系统支持的兼容性策略
        Summary: 获取系统支持的兼容性策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_schemacompatibility_ex(request, headers, runtime)

    async def list_sofamq_schemacompatibility_async(
        self,
        request: mq_models.ListSofamqSchemacompatibilityRequest,
    ) -> mq_models.ListSofamqSchemacompatibilityResponse:
        """
        Description: 获取系统支持的兼容性策略
        Summary: 获取系统支持的兼容性策略
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_schemacompatibility_ex_async(request, headers, runtime)

    def list_sofamq_schemacompatibility_ex(
        self,
        request: mq_models.ListSofamqSchemacompatibilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqSchemacompatibilityResponse:
        """
        Description: 获取系统支持的兼容性策略
        Summary: 获取系统支持的兼容性策略
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqSchemacompatibilityResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.schemacompatibility.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_schemacompatibility_ex_async(
        self,
        request: mq_models.ListSofamqSchemacompatibilityRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqSchemacompatibilityResponse:
        """
        Description: 获取系统支持的兼容性策略
        Summary: 获取系统支持的兼容性策略
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqSchemacompatibilityResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.schemacompatibility.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_schemaserialization(
        self,
        request: mq_models.ListSofamqSchemaserializationRequest,
    ) -> mq_models.ListSofamqSchemaserializationResponse:
        """
        Description: 获取系统支持的序列化方式
        Summary: 获取系统支持的序列化方式
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_schemaserialization_ex(request, headers, runtime)

    async def list_sofamq_schemaserialization_async(
        self,
        request: mq_models.ListSofamqSchemaserializationRequest,
    ) -> mq_models.ListSofamqSchemaserializationResponse:
        """
        Description: 获取系统支持的序列化方式
        Summary: 获取系统支持的序列化方式
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_schemaserialization_ex_async(request, headers, runtime)

    def list_sofamq_schemaserialization_ex(
        self,
        request: mq_models.ListSofamqSchemaserializationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqSchemaserializationResponse:
        """
        Description: 获取系统支持的序列化方式
        Summary: 获取系统支持的序列化方式
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqSchemaserializationResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.schemaserialization.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_schemaserialization_ex_async(
        self,
        request: mq_models.ListSofamqSchemaserializationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqSchemaserializationResponse:
        """
        Description: 获取系统支持的序列化方式
        Summary: 获取系统支持的序列化方式
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqSchemaserializationResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.schemaserialization.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_schema(
        self,
        request: mq_models.DeleteSofamqSchemaRequest,
    ) -> mq_models.DeleteSofamqSchemaResponse:
        """
        Description: 删除特定的Schema
        Summary: 删除特定的Schema
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_schema_ex(request, headers, runtime)

    async def delete_sofamq_schema_async(
        self,
        request: mq_models.DeleteSofamqSchemaRequest,
    ) -> mq_models.DeleteSofamqSchemaResponse:
        """
        Description: 删除特定的Schema
        Summary: 删除特定的Schema
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_schema_ex_async(request, headers, runtime)

    def delete_sofamq_schema_ex(
        self,
        request: mq_models.DeleteSofamqSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqSchemaResponse:
        """
        Description: 删除特定的Schema
        Summary: 删除特定的Schema
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqSchemaResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.schema.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_schema_ex_async(
        self,
        request: mq_models.DeleteSofamqSchemaRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqSchemaResponse:
        """
        Description: 删除特定的Schema
        Summary: 删除特定的Schema
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqSchemaResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.schema.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_connectorprocess(
        self,
        request: mq_models.QuerySofamqConnectorprocessRequest,
    ) -> mq_models.QuerySofamqConnectorprocessResponse:
        """
        Description: Connector工单查询
        Summary: Connector工单查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_connectorprocess_ex(request, headers, runtime)

    async def query_sofamq_connectorprocess_async(
        self,
        request: mq_models.QuerySofamqConnectorprocessRequest,
    ) -> mq_models.QuerySofamqConnectorprocessResponse:
        """
        Description: Connector工单查询
        Summary: Connector工单查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_connectorprocess_ex_async(request, headers, runtime)

    def query_sofamq_connectorprocess_ex(
        self,
        request: mq_models.QuerySofamqConnectorprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectorprocessResponse:
        """
        Description: Connector工单查询
        Summary: Connector工单查询
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectorprocessResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorprocess.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_connectorprocess_ex_async(
        self,
        request: mq_models.QuerySofamqConnectorprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectorprocessResponse:
        """
        Description: Connector工单查询
        Summary: Connector工单查询
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectorprocessResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorprocess.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_sofamq_connectorprocess(
        self,
        request: mq_models.CancelSofamqConnectorprocessRequest,
    ) -> mq_models.CancelSofamqConnectorprocessResponse:
        """
        Description: Connector任务撤回审批
        Summary: Connector任务撤回审批
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_sofamq_connectorprocess_ex(request, headers, runtime)

    async def cancel_sofamq_connectorprocess_async(
        self,
        request: mq_models.CancelSofamqConnectorprocessRequest,
    ) -> mq_models.CancelSofamqConnectorprocessResponse:
        """
        Description: Connector任务撤回审批
        Summary: Connector任务撤回审批
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_sofamq_connectorprocess_ex_async(request, headers, runtime)

    def cancel_sofamq_connectorprocess_ex(
        self,
        request: mq_models.CancelSofamqConnectorprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CancelSofamqConnectorprocessResponse:
        """
        Description: Connector任务撤回审批
        Summary: Connector任务撤回审批
        """
        UtilClient.validate_model(request)
        return mq_models.CancelSofamqConnectorprocessResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorprocess.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_sofamq_connectorprocess_ex_async(
        self,
        request: mq_models.CancelSofamqConnectorprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CancelSofamqConnectorprocessResponse:
        """
        Description: Connector任务撤回审批
        Summary: Connector任务撤回审批
        """
        UtilClient.validate_model(request)
        return mq_models.CancelSofamqConnectorprocessResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorprocess.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def resume_sofamq_connectorprocess(
        self,
        request: mq_models.ResumeSofamqConnectorprocessRequest,
    ) -> mq_models.ResumeSofamqConnectorprocessResponse:
        """
        Description: Connector重新提交工单
        Summary: Connector重新提交工单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.resume_sofamq_connectorprocess_ex(request, headers, runtime)

    async def resume_sofamq_connectorprocess_async(
        self,
        request: mq_models.ResumeSofamqConnectorprocessRequest,
    ) -> mq_models.ResumeSofamqConnectorprocessResponse:
        """
        Description: Connector重新提交工单
        Summary: Connector重新提交工单
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.resume_sofamq_connectorprocess_ex_async(request, headers, runtime)

    def resume_sofamq_connectorprocess_ex(
        self,
        request: mq_models.ResumeSofamqConnectorprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ResumeSofamqConnectorprocessResponse:
        """
        Description: Connector重新提交工单
        Summary: Connector重新提交工单
        """
        UtilClient.validate_model(request)
        return mq_models.ResumeSofamqConnectorprocessResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorprocess.resume', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def resume_sofamq_connectorprocess_ex_async(
        self,
        request: mq_models.ResumeSofamqConnectorprocessRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ResumeSofamqConnectorprocessResponse:
        """
        Description: Connector重新提交工单
        Summary: Connector重新提交工单
        """
        UtilClient.validate_model(request)
        return mq_models.ResumeSofamqConnectorprocessResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorprocess.resume', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def verify_sofamq_connectoroperation(
        self,
        request: mq_models.VerifySofamqConnectoroperationRequest,
    ) -> mq_models.VerifySofamqConnectoroperationResponse:
        """
        Description: 校验一个connector的操作是否合法
        Summary: 校验一个connector的操作是否合法
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.verify_sofamq_connectoroperation_ex(request, headers, runtime)

    async def verify_sofamq_connectoroperation_async(
        self,
        request: mq_models.VerifySofamqConnectoroperationRequest,
    ) -> mq_models.VerifySofamqConnectoroperationResponse:
        """
        Description: 校验一个connector的操作是否合法
        Summary: 校验一个connector的操作是否合法
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.verify_sofamq_connectoroperation_ex_async(request, headers, runtime)

    def verify_sofamq_connectoroperation_ex(
        self,
        request: mq_models.VerifySofamqConnectoroperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.VerifySofamqConnectoroperationResponse:
        """
        Description: 校验一个connector的操作是否合法
        Summary: 校验一个connector的操作是否合法
        """
        UtilClient.validate_model(request)
        return mq_models.VerifySofamqConnectoroperationResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectoroperation.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def verify_sofamq_connectoroperation_ex_async(
        self,
        request: mq_models.VerifySofamqConnectoroperationRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.VerifySofamqConnectoroperationResponse:
        """
        Description: 校验一个connector的操作是否合法
        Summary: 校验一个connector的操作是否合法
        """
        UtilClient.validate_model(request)
        return mq_models.VerifySofamqConnectoroperationResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectoroperation.verify', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def list_sofamq_auditor(
        self,
        request: mq_models.ListSofamqAuditorRequest,
    ) -> mq_models.ListSofamqAuditorResponse:
        """
        Description: 查看操作审计
        Summary: 查看操作审计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.list_sofamq_auditor_ex(request, headers, runtime)

    async def list_sofamq_auditor_async(
        self,
        request: mq_models.ListSofamqAuditorRequest,
    ) -> mq_models.ListSofamqAuditorResponse:
        """
        Description: 查看操作审计
        Summary: 查看操作审计
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.list_sofamq_auditor_ex_async(request, headers, runtime)

    def list_sofamq_auditor_ex(
        self,
        request: mq_models.ListSofamqAuditorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqAuditorResponse:
        """
        Description: 查看操作审计
        Summary: 查看操作审计
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqAuditorResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.auditor.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def list_sofamq_auditor_ex_async(
        self,
        request: mq_models.ListSofamqAuditorRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.ListSofamqAuditorResponse:
        """
        Description: 查看操作审计
        Summary: 查看操作审计
        """
        UtilClient.validate_model(request)
        return mq_models.ListSofamqAuditorResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.auditor.list', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_connectorjobapp(
        self,
        request: mq_models.QuerySofamqConnectorjobappRequest,
    ) -> mq_models.QuerySofamqConnectorjobappResponse:
        """
        Description: connector任务对应的应用名称查询
        Summary: connector任务对应的应用名称查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_connectorjobapp_ex(request, headers, runtime)

    async def query_sofamq_connectorjobapp_async(
        self,
        request: mq_models.QuerySofamqConnectorjobappRequest,
    ) -> mq_models.QuerySofamqConnectorjobappResponse:
        """
        Description: connector任务对应的应用名称查询
        Summary: connector任务对应的应用名称查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_connectorjobapp_ex_async(request, headers, runtime)

    def query_sofamq_connectorjobapp_ex(
        self,
        request: mq_models.QuerySofamqConnectorjobappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectorjobappResponse:
        """
        Description: connector任务对应的应用名称查询
        Summary: connector任务对应的应用名称查询
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectorjobappResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorjobapp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_connectorjobapp_ex_async(
        self,
        request: mq_models.QuerySofamqConnectorjobappRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectorjobappResponse:
        """
        Description: connector任务对应的应用名称查询
        Summary: connector任务对应的应用名称查询
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectorjobappResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorjobapp.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def cancel_sofamq_connectorplan(
        self,
        request: mq_models.CancelSofamqConnectorplanRequest,
    ) -> mq_models.CancelSofamqConnectorplanResponse:
        """
        Description: 取消Connector运行实例
        Summary: 取消Connector运行实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.cancel_sofamq_connectorplan_ex(request, headers, runtime)

    async def cancel_sofamq_connectorplan_async(
        self,
        request: mq_models.CancelSofamqConnectorplanRequest,
    ) -> mq_models.CancelSofamqConnectorplanResponse:
        """
        Description: 取消Connector运行实例
        Summary: 取消Connector运行实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.cancel_sofamq_connectorplan_ex_async(request, headers, runtime)

    def cancel_sofamq_connectorplan_ex(
        self,
        request: mq_models.CancelSofamqConnectorplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CancelSofamqConnectorplanResponse:
        """
        Description: 取消Connector运行实例
        Summary: 取消Connector运行实例
        """
        UtilClient.validate_model(request)
        return mq_models.CancelSofamqConnectorplanResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorplan.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def cancel_sofamq_connectorplan_ex_async(
        self,
        request: mq_models.CancelSofamqConnectorplanRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CancelSofamqConnectorplanResponse:
        """
        Description: 取消Connector运行实例
        Summary: 取消Connector运行实例
        """
        UtilClient.validate_model(request)
        return mq_models.CancelSofamqConnectorplanResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorplan.cancel', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def set_sofamq_connectorplancheckpoint(
        self,
        request: mq_models.SetSofamqConnectorplancheckpointRequest,
    ) -> mq_models.SetSofamqConnectorplancheckpointResponse:
        """
        Description: 重置任务实例位点
        Summary: 重置任务实例位点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.set_sofamq_connectorplancheckpoint_ex(request, headers, runtime)

    async def set_sofamq_connectorplancheckpoint_async(
        self,
        request: mq_models.SetSofamqConnectorplancheckpointRequest,
    ) -> mq_models.SetSofamqConnectorplancheckpointResponse:
        """
        Description: 重置任务实例位点
        Summary: 重置任务实例位点
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.set_sofamq_connectorplancheckpoint_ex_async(request, headers, runtime)

    def set_sofamq_connectorplancheckpoint_ex(
        self,
        request: mq_models.SetSofamqConnectorplancheckpointRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.SetSofamqConnectorplancheckpointResponse:
        """
        Description: 重置任务实例位点
        Summary: 重置任务实例位点
        """
        UtilClient.validate_model(request)
        return mq_models.SetSofamqConnectorplancheckpointResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorplancheckpoint.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def set_sofamq_connectorplancheckpoint_ex_async(
        self,
        request: mq_models.SetSofamqConnectorplancheckpointRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.SetSofamqConnectorplancheckpointResponse:
        """
        Description: 重置任务实例位点
        Summary: 重置任务实例位点
        """
        UtilClient.validate_model(request)
        return mq_models.SetSofamqConnectorplancheckpointResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorplancheckpoint.set', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_connectorplansingleton(
        self,
        request: mq_models.QuerySofamqConnectorplansingletonRequest,
    ) -> mq_models.QuerySofamqConnectorplansingletonResponse:
        """
        Description: 活跃的conenctor实例【常驻任务】
        Summary: 活跃的conenctor实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_connectorplansingleton_ex(request, headers, runtime)

    async def query_sofamq_connectorplansingleton_async(
        self,
        request: mq_models.QuerySofamqConnectorplansingletonRequest,
    ) -> mq_models.QuerySofamqConnectorplansingletonResponse:
        """
        Description: 活跃的conenctor实例【常驻任务】
        Summary: 活跃的conenctor实例
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_connectorplansingleton_ex_async(request, headers, runtime)

    def query_sofamq_connectorplansingleton_ex(
        self,
        request: mq_models.QuerySofamqConnectorplansingletonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectorplansingletonResponse:
        """
        Description: 活跃的conenctor实例【常驻任务】
        Summary: 活跃的conenctor实例
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectorplansingletonResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorplansingleton.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_connectorplansingleton_ex_async(
        self,
        request: mq_models.QuerySofamqConnectorplansingletonRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectorplansingletonResponse:
        """
        Description: 活跃的conenctor实例【常驻任务】
        Summary: 活跃的conenctor实例
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectorplansingletonResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorplansingleton.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_connectorjobdelay(
        self,
        request: mq_models.QuerySofamqConnectorjobdelayRequest,
    ) -> mq_models.QuerySofamqConnectorjobdelayResponse:
        """
        Description: 获取延迟时间
        Summary: 获取延迟时间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_connectorjobdelay_ex(request, headers, runtime)

    async def query_sofamq_connectorjobdelay_async(
        self,
        request: mq_models.QuerySofamqConnectorjobdelayRequest,
    ) -> mq_models.QuerySofamqConnectorjobdelayResponse:
        """
        Description: 获取延迟时间
        Summary: 获取延迟时间
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_connectorjobdelay_ex_async(request, headers, runtime)

    def query_sofamq_connectorjobdelay_ex(
        self,
        request: mq_models.QuerySofamqConnectorjobdelayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectorjobdelayResponse:
        """
        Description: 获取延迟时间
        Summary: 获取延迟时间
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectorjobdelayResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorjobdelay.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_connectorjobdelay_ex_async(
        self,
        request: mq_models.QuerySofamqConnectorjobdelayRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectorjobdelayResponse:
        """
        Description: 获取延迟时间
        Summary: 获取延迟时间
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectorjobdelayResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorjobdelay.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_connectorjobpartitionstatuscolumn(
        self,
        request: mq_models.QuerySofamqConnectorjobpartitionstatuscolumnRequest,
    ) -> mq_models.QuerySofamqConnectorjobpartitionstatuscolumnResponse:
        """
        Description: 常驻任务分区信息详情
        Summary: 分区状态详情列名
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_connectorjobpartitionstatuscolumn_ex(request, headers, runtime)

    async def query_sofamq_connectorjobpartitionstatuscolumn_async(
        self,
        request: mq_models.QuerySofamqConnectorjobpartitionstatuscolumnRequest,
    ) -> mq_models.QuerySofamqConnectorjobpartitionstatuscolumnResponse:
        """
        Description: 常驻任务分区信息详情
        Summary: 分区状态详情列名
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_connectorjobpartitionstatuscolumn_ex_async(request, headers, runtime)

    def query_sofamq_connectorjobpartitionstatuscolumn_ex(
        self,
        request: mq_models.QuerySofamqConnectorjobpartitionstatuscolumnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectorjobpartitionstatuscolumnResponse:
        """
        Description: 常驻任务分区信息详情
        Summary: 分区状态详情列名
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectorjobpartitionstatuscolumnResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorjobpartitionstatuscolumn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_connectorjobpartitionstatuscolumn_ex_async(
        self,
        request: mq_models.QuerySofamqConnectorjobpartitionstatuscolumnRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectorjobpartitionstatuscolumnResponse:
        """
        Description: 常驻任务分区信息详情
        Summary: 分区状态详情列名
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectorjobpartitionstatuscolumnResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorjobpartitionstatuscolumn.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_connectorjobpartitionstatus(
        self,
        request: mq_models.QuerySofamqConnectorjobpartitionstatusRequest,
    ) -> mq_models.QuerySofamqConnectorjobpartitionstatusResponse:
        """
        Description: 分区状态分页查询
        Summary: 分区状态分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_connectorjobpartitionstatus_ex(request, headers, runtime)

    async def query_sofamq_connectorjobpartitionstatus_async(
        self,
        request: mq_models.QuerySofamqConnectorjobpartitionstatusRequest,
    ) -> mq_models.QuerySofamqConnectorjobpartitionstatusResponse:
        """
        Description: 分区状态分页查询
        Summary: 分区状态分页查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_connectorjobpartitionstatus_ex_async(request, headers, runtime)

    def query_sofamq_connectorjobpartitionstatus_ex(
        self,
        request: mq_models.QuerySofamqConnectorjobpartitionstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectorjobpartitionstatusResponse:
        """
        Description: 分区状态分页查询
        Summary: 分区状态分页查询
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectorjobpartitionstatusResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectorjobpartitionstatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_connectorjobpartitionstatus_ex_async(
        self,
        request: mq_models.QuerySofamqConnectorjobpartitionstatusRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectorjobpartitionstatusResponse:
        """
        Description: 分区状态分页查询
        Summary: 分区状态分页查询
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectorjobpartitionstatusResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectorjobpartitionstatus.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_connectortriggerconfigs(
        self,
        request: mq_models.QuerySofamqConnectortriggerconfigsRequest,
    ) -> mq_models.QuerySofamqConnectortriggerconfigsResponse:
        """
        Description: 手动触发UI
        Summary: 手动触发UI
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_connectortriggerconfigs_ex(request, headers, runtime)

    async def query_sofamq_connectortriggerconfigs_async(
        self,
        request: mq_models.QuerySofamqConnectortriggerconfigsRequest,
    ) -> mq_models.QuerySofamqConnectortriggerconfigsResponse:
        """
        Description: 手动触发UI
        Summary: 手动触发UI
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_connectortriggerconfigs_ex_async(request, headers, runtime)

    def query_sofamq_connectortriggerconfigs_ex(
        self,
        request: mq_models.QuerySofamqConnectortriggerconfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectortriggerconfigsResponse:
        """
        Description: 手动触发UI
        Summary: 手动触发UI
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectortriggerconfigsResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.connectortriggerconfigs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_connectortriggerconfigs_ex_async(
        self,
        request: mq_models.QuerySofamqConnectortriggerconfigsRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConnectortriggerconfigsResponse:
        """
        Description: 手动触发UI
        Summary: 手动触发UI
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConnectortriggerconfigsResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.connectortriggerconfigs.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def delete_sofamq_offset(
        self,
        request: mq_models.DeleteSofamqOffsetRequest,
    ) -> mq_models.DeleteSofamqOffsetResponse:
        """
        Description: 清除消费进度
        Summary: 清除消费进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.delete_sofamq_offset_ex(request, headers, runtime)

    async def delete_sofamq_offset_async(
        self,
        request: mq_models.DeleteSofamqOffsetRequest,
    ) -> mq_models.DeleteSofamqOffsetResponse:
        """
        Description: 清除消费进度
        Summary: 清除消费进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.delete_sofamq_offset_ex_async(request, headers, runtime)

    def delete_sofamq_offset_ex(
        self,
        request: mq_models.DeleteSofamqOffsetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqOffsetResponse:
        """
        Description: 清除消费进度
        Summary: 清除消费进度
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqOffsetResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.offset.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def delete_sofamq_offset_ex_async(
        self,
        request: mq_models.DeleteSofamqOffsetRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.DeleteSofamqOffsetResponse:
        """
        Description: 清除消费进度
        Summary: 清除消费进度
        """
        UtilClient.validate_model(request)
        return mq_models.DeleteSofamqOffsetResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.offset.delete', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_sofamq_consumption(
        self,
        request: mq_models.QuerySofamqConsumptionRequest,
    ) -> mq_models.QuerySofamqConsumptionResponse:
        """
        Description: 用户端查询消费进度
        Summary: 用户端查询消费进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_sofamq_consumption_ex(request, headers, runtime)

    async def query_sofamq_consumption_async(
        self,
        request: mq_models.QuerySofamqConsumptionRequest,
    ) -> mq_models.QuerySofamqConsumptionResponse:
        """
        Description: 用户端查询消费进度
        Summary: 用户端查询消费进度
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_sofamq_consumption_ex_async(request, headers, runtime)

    def query_sofamq_consumption_ex(
        self,
        request: mq_models.QuerySofamqConsumptionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConsumptionResponse:
        """
        Description: 用户端查询消费进度
        Summary: 用户端查询消费进度
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConsumptionResponse().from_map(
            self.do_request('2.0', 'sofa.mq.sofamq.consumption.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_sofamq_consumption_ex_async(
        self,
        request: mq_models.QuerySofamqConsumptionRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QuerySofamqConsumptionResponse:
        """
        Description: 用户端查询消费进度
        Summary: 用户端查询消费进度
        """
        UtilClient.validate_model(request)
        return mq_models.QuerySofamqConsumptionResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.sofamq.consumption.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def query_user_topicqueue(
        self,
        request: mq_models.QueryUserTopicqueueRequest,
    ) -> mq_models.QueryUserTopicqueueResponse:
        """
        Description: 查询用户端topic的queue信息
        Summary: 查询用户端topic的queue信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.query_user_topicqueue_ex(request, headers, runtime)

    async def query_user_topicqueue_async(
        self,
        request: mq_models.QueryUserTopicqueueRequest,
    ) -> mq_models.QueryUserTopicqueueResponse:
        """
        Description: 查询用户端topic的queue信息
        Summary: 查询用户端topic的queue信息
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.query_user_topicqueue_ex_async(request, headers, runtime)

    def query_user_topicqueue_ex(
        self,
        request: mq_models.QueryUserTopicqueueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryUserTopicqueueResponse:
        """
        Description: 查询用户端topic的queue信息
        Summary: 查询用户端topic的queue信息
        """
        UtilClient.validate_model(request)
        return mq_models.QueryUserTopicqueueResponse().from_map(
            self.do_request('2.0', 'sofa.mq.user.topicqueue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def query_user_topicqueue_ex_async(
        self,
        request: mq_models.QueryUserTopicqueueRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.QueryUserTopicqueueResponse:
        """
        Description: 查询用户端topic的queue信息
        Summary: 查询用户端topic的queue信息
        """
        UtilClient.validate_model(request)
        return mq_models.QueryUserTopicqueueResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.user.topicqueue.query', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def update_message_nextdeliverytime(
        self,
        request: mq_models.UpdateMessageNextdeliverytimeRequest,
    ) -> mq_models.UpdateMessageNextdeliverytimeResponse:
        """
        Description: update next delivery time
        Summary: update delivery time
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.update_message_nextdeliverytime_ex(request, headers, runtime)

    async def update_message_nextdeliverytime_async(
        self,
        request: mq_models.UpdateMessageNextdeliverytimeRequest,
    ) -> mq_models.UpdateMessageNextdeliverytimeResponse:
        """
        Description: update next delivery time
        Summary: update delivery time
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.update_message_nextdeliverytime_ex_async(request, headers, runtime)

    def update_message_nextdeliverytime_ex(
        self,
        request: mq_models.UpdateMessageNextdeliverytimeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMessageNextdeliverytimeResponse:
        """
        Description: update next delivery time
        Summary: update delivery time
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMessageNextdeliverytimeResponse().from_map(
            self.do_request('2.0', 'sofa.mq.message.nextdeliverytime.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def update_message_nextdeliverytime_ex_async(
        self,
        request: mq_models.UpdateMessageNextdeliverytimeRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.UpdateMessageNextdeliverytimeResponse:
        """
        Description: update next delivery time
        Summary: update delivery time
        """
        UtilClient.validate_model(request)
        return mq_models.UpdateMessageNextdeliverytimeResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.message.nextdeliverytime.update', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def count_message_undelivery(
        self,
        request: mq_models.CountMessageUndeliveryRequest,
    ) -> mq_models.CountMessageUndeliveryResponse:
        """
        Description: 统计未投递消息数量
        Summary: 统计未投递消息数量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.count_message_undelivery_ex(request, headers, runtime)

    async def count_message_undelivery_async(
        self,
        request: mq_models.CountMessageUndeliveryRequest,
    ) -> mq_models.CountMessageUndeliveryResponse:
        """
        Description: 统计未投递消息数量
        Summary: 统计未投递消息数量
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.count_message_undelivery_ex_async(request, headers, runtime)

    def count_message_undelivery_ex(
        self,
        request: mq_models.CountMessageUndeliveryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CountMessageUndeliveryResponse:
        """
        Description: 统计未投递消息数量
        Summary: 统计未投递消息数量
        """
        UtilClient.validate_model(request)
        return mq_models.CountMessageUndeliveryResponse().from_map(
            self.do_request('2.0', 'sofa.mq.message.undelivery.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def count_message_undelivery_ex_async(
        self,
        request: mq_models.CountMessageUndeliveryRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.CountMessageUndeliveryResponse:
        """
        Description: 统计未投递消息数量
        Summary: 统计未投递消息数量
        """
        UtilClient.validate_model(request)
        return mq_models.CountMessageUndeliveryResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.message.undelivery.count', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def load_connectorjob_sloview(
        self,
        request: mq_models.LoadConnectorjobSloviewRequest,
    ) -> mq_models.LoadConnectorjobSloviewResponse:
        """
        Description: 加载任务SLO配置页面
        Summary: 任务SLO配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.load_connectorjob_sloview_ex(request, headers, runtime)

    async def load_connectorjob_sloview_async(
        self,
        request: mq_models.LoadConnectorjobSloviewRequest,
    ) -> mq_models.LoadConnectorjobSloviewResponse:
        """
        Description: 加载任务SLO配置页面
        Summary: 任务SLO配置
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.load_connectorjob_sloview_ex_async(request, headers, runtime)

    def load_connectorjob_sloview_ex(
        self,
        request: mq_models.LoadConnectorjobSloviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.LoadConnectorjobSloviewResponse:
        """
        Description: 加载任务SLO配置页面
        Summary: 任务SLO配置
        """
        UtilClient.validate_model(request)
        return mq_models.LoadConnectorjobSloviewResponse().from_map(
            self.do_request('2.0', 'sofa.mq.connectorjob.sloview.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def load_connectorjob_sloview_ex_async(
        self,
        request: mq_models.LoadConnectorjobSloviewRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> mq_models.LoadConnectorjobSloviewResponse:
        """
        Description: 加载任务SLO配置页面
        Summary: 任务SLO配置
        """
        UtilClient.validate_model(request)
        return mq_models.LoadConnectorjobSloviewResponse().from_map(
            await self.do_request_async('2.0', 'sofa.mq.connectorjob.sloview.load', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
