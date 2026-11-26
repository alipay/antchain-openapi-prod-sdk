# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
import time

from Tea.exceptions import TeaException, UnretryableException
from Tea.request import TeaRequest
from Tea.core import TeaCore
from antchain_alipay_util.antchain_utils import AntchainUtils
from typing import Dict

from antchain_sdk_insurancesaas import models as insurancesaas_models
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
        config: insurancesaas_models.Config,
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
            # 转化数据条目
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
                    'sdk_version': '1.1.0',
                    '_prod_code': 'INSURANCESAAS',
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
            # 转化数据条目
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
                    'sdk_version': '1.1.0',
                    '_prod_code': 'INSURANCESAAS',
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

    def upload_antcloud_insurance_mkt_file(
        self,
        request: insurancesaas_models.UploadAntcloudInsuranceMktFileRequest,
    ) -> insurancesaas_models.UploadAntcloudInsuranceMktFileResponse:
        """
        Description: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
        Summary: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.upload_antcloud_insurance_mkt_file_ex(request, headers, runtime)

    async def upload_antcloud_insurance_mkt_file_async(
        self,
        request: insurancesaas_models.UploadAntcloudInsuranceMktFileRequest,
    ) -> insurancesaas_models.UploadAntcloudInsuranceMktFileResponse:
        """
        Description: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
        Summary: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.upload_antcloud_insurance_mkt_file_ex_async(request, headers, runtime)

    def upload_antcloud_insurance_mkt_file_ex(
        self,
        request: insurancesaas_models.UploadAntcloudInsuranceMktFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.UploadAntcloudInsuranceMktFileResponse:
        """
        Description: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
        Summary: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = insurancesaas_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antcloud.insurance.mkt.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_antcloud_insurance_mkt_file_response = insurancesaas_models.UploadAntcloudInsuranceMktFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_antcloud_insurance_mkt_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.UploadAntcloudInsuranceMktFileResponse(),
            self.do_request('1.0', 'antcloud.insurance.mkt.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def upload_antcloud_insurance_mkt_file_ex_async(
        self,
        request: insurancesaas_models.UploadAntcloudInsuranceMktFileRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.UploadAntcloudInsuranceMktFileResponse:
        """
        Description: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
        Summary: 保险营销文件上传，营销链路中涉及到文件上传，均可使用本接口，根据上传的数据类型做区分
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = insurancesaas_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antcloud.insurance.mkt.file.upload',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                upload_antcloud_insurance_mkt_file_response = insurancesaas_models.UploadAntcloudInsuranceMktFileResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return upload_antcloud_insurance_mkt_file_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.UploadAntcloudInsuranceMktFileResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.mkt.file.upload', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_antcloud_insurance_mkt_effect(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktEffectRequest,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktEffectResponse:
        """
        Description: 保险营销效果回传
        Summary: 保险营销效果回传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_antcloud_insurance_mkt_effect_ex(request, headers, runtime)

    async def callback_antcloud_insurance_mkt_effect_async(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktEffectRequest,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktEffectResponse:
        """
        Description: 保险营销效果回传
        Summary: 保险营销效果回传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_antcloud_insurance_mkt_effect_ex_async(request, headers, runtime)

    def callback_antcloud_insurance_mkt_effect_ex(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktEffectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktEffectResponse:
        """
        Description: 保险营销效果回传
        Summary: 保险营销效果回传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.CallbackAntcloudInsuranceMktEffectResponse(),
            self.do_request('1.0', 'antcloud.insurance.mkt.effect.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_antcloud_insurance_mkt_effect_ex_async(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktEffectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktEffectResponse:
        """
        Description: 保险营销效果回传
        Summary: 保险营销效果回传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.CallbackAntcloudInsuranceMktEffectResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.mkt.effect.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_antcloud_insurance_mkt_liveeffect(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktLiveeffectRequest,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktLiveeffectResponse:
        """
        Description: 保险营销效果回传接口——媒体
        Summary: 保险营销效果回传接口——媒体
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_antcloud_insurance_mkt_liveeffect_ex(request, headers, runtime)

    async def callback_antcloud_insurance_mkt_liveeffect_async(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktLiveeffectRequest,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktLiveeffectResponse:
        """
        Description: 保险营销效果回传接口——媒体
        Summary: 保险营销效果回传接口——媒体
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_antcloud_insurance_mkt_liveeffect_ex_async(request, headers, runtime)

    def callback_antcloud_insurance_mkt_liveeffect_ex(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktLiveeffectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktLiveeffectResponse:
        """
        Description: 保险营销效果回传接口——媒体
        Summary: 保险营销效果回传接口——媒体
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.CallbackAntcloudInsuranceMktLiveeffectResponse(),
            self.do_request('1.0', 'antcloud.insurance.mkt.liveeffect.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_antcloud_insurance_mkt_liveeffect_ex_async(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktLiveeffectRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktLiveeffectResponse:
        """
        Description: 保险营销效果回传接口——媒体
        Summary: 保险营销效果回传接口——媒体
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.CallbackAntcloudInsuranceMktLiveeffectResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.mkt.liveeffect.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_antcloud_insurance_mkt_realtimemkt(
        self,
        request: insurancesaas_models.ApplyAntcloudInsuranceMktRealtimemktRequest,
    ) -> insurancesaas_models.ApplyAntcloudInsuranceMktRealtimemktResponse:
        """
        Description: 保险实时营销提交
        Summary: 保险实时营销提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_antcloud_insurance_mkt_realtimemkt_ex(request, headers, runtime)

    async def apply_antcloud_insurance_mkt_realtimemkt_async(
        self,
        request: insurancesaas_models.ApplyAntcloudInsuranceMktRealtimemktRequest,
    ) -> insurancesaas_models.ApplyAntcloudInsuranceMktRealtimemktResponse:
        """
        Description: 保险实时营销提交
        Summary: 保险实时营销提交
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_antcloud_insurance_mkt_realtimemkt_ex_async(request, headers, runtime)

    def apply_antcloud_insurance_mkt_realtimemkt_ex(
        self,
        request: insurancesaas_models.ApplyAntcloudInsuranceMktRealtimemktRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.ApplyAntcloudInsuranceMktRealtimemktResponse:
        """
        Description: 保险实时营销提交
        Summary: 保险实时营销提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.ApplyAntcloudInsuranceMktRealtimemktResponse(),
            self.do_request('1.0', 'antcloud.insurance.mkt.realtimemkt.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_antcloud_insurance_mkt_realtimemkt_ex_async(
        self,
        request: insurancesaas_models.ApplyAntcloudInsuranceMktRealtimemktRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.ApplyAntcloudInsuranceMktRealtimemktResponse:
        """
        Description: 保险实时营销提交
        Summary: 保险实时营销提交
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.ApplyAntcloudInsuranceMktRealtimemktResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.mkt.realtimemkt.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_antcloud_insurance_mkt_monitordata(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktMonitordataRequest,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktMonitordataResponse:
        """
        Description: 保司营销监测数据回传
        Summary: 保司营销监测数据回传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_antcloud_insurance_mkt_monitordata_ex(request, headers, runtime)

    async def callback_antcloud_insurance_mkt_monitordata_async(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktMonitordataRequest,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktMonitordataResponse:
        """
        Description: 保司营销监测数据回传
        Summary: 保司营销监测数据回传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_antcloud_insurance_mkt_monitordata_ex_async(request, headers, runtime)

    def callback_antcloud_insurance_mkt_monitordata_ex(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktMonitordataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktMonitordataResponse:
        """
        Description: 保司营销监测数据回传
        Summary: 保司营销监测数据回传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.CallbackAntcloudInsuranceMktMonitordataResponse(),
            self.do_request('1.0', 'antcloud.insurance.mkt.monitordata.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_antcloud_insurance_mkt_monitordata_ex_async(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktMonitordataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktMonitordataResponse:
        """
        Description: 保司营销监测数据回传
        Summary: 保司营销监测数据回传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.CallbackAntcloudInsuranceMktMonitordataResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.mkt.monitordata.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_antcloud_insurance_mkt_mediastatisticaldata(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktMediastatisticaldataRequest,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktMediastatisticaldataResponse:
        """
        Description: 媒体点击统计数据回传
        Summary: 媒体点击统计数据回传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_antcloud_insurance_mkt_mediastatisticaldata_ex(request, headers, runtime)

    async def callback_antcloud_insurance_mkt_mediastatisticaldata_async(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktMediastatisticaldataRequest,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktMediastatisticaldataResponse:
        """
        Description: 媒体点击统计数据回传
        Summary: 媒体点击统计数据回传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_antcloud_insurance_mkt_mediastatisticaldata_ex_async(request, headers, runtime)

    def callback_antcloud_insurance_mkt_mediastatisticaldata_ex(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktMediastatisticaldataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktMediastatisticaldataResponse:
        """
        Description: 媒体点击统计数据回传
        Summary: 媒体点击统计数据回传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.CallbackAntcloudInsuranceMktMediastatisticaldataResponse(),
            self.do_request('1.0', 'antcloud.insurance.mkt.mediastatisticaldata.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_antcloud_insurance_mkt_mediastatisticaldata_ex_async(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktMediastatisticaldataRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktMediastatisticaldataResponse:
        """
        Description: 媒体点击统计数据回传
        Summary: 媒体点击统计数据回传
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.CallbackAntcloudInsuranceMktMediastatisticaldataResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.mkt.mediastatisticaldata.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def callback_antcloud_insurance_mkt_effectsimple(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktEffectsimpleRequest,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktEffectsimpleResponse:
        """
        Description: 营销效果节点数据（简版）
        Summary: 营销效果节点数据（简版）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.callback_antcloud_insurance_mkt_effectsimple_ex(request, headers, runtime)

    async def callback_antcloud_insurance_mkt_effectsimple_async(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktEffectsimpleRequest,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktEffectsimpleResponse:
        """
        Description: 营销效果节点数据（简版）
        Summary: 营销效果节点数据（简版）
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.callback_antcloud_insurance_mkt_effectsimple_ex_async(request, headers, runtime)

    def callback_antcloud_insurance_mkt_effectsimple_ex(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktEffectsimpleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktEffectsimpleResponse:
        """
        Description: 营销效果节点数据（简版）
        Summary: 营销效果节点数据（简版）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.CallbackAntcloudInsuranceMktEffectsimpleResponse(),
            self.do_request('1.0', 'antcloud.insurance.mkt.effectsimple.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def callback_antcloud_insurance_mkt_effectsimple_ex_async(
        self,
        request: insurancesaas_models.CallbackAntcloudInsuranceMktEffectsimpleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.CallbackAntcloudInsuranceMktEffectsimpleResponse:
        """
        Description: 营销效果节点数据（简版）
        Summary: 营销效果节点数据（简版）
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.CallbackAntcloudInsuranceMktEffectsimpleResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.mkt.effectsimple.callback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def apply_antcloud_insurance_mktserviceprovider_audiencecircle(
        self,
        request: insurancesaas_models.ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest,
    ) -> insurancesaas_models.ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse:
        """
        Description: 保险营销服务商人群圈选
        Summary: 保险营销服务商人群圈选
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.apply_antcloud_insurance_mktserviceprovider_audiencecircle_ex(request, headers, runtime)

    async def apply_antcloud_insurance_mktserviceprovider_audiencecircle_async(
        self,
        request: insurancesaas_models.ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest,
    ) -> insurancesaas_models.ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse:
        """
        Description: 保险营销服务商人群圈选
        Summary: 保险营销服务商人群圈选
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.apply_antcloud_insurance_mktserviceprovider_audiencecircle_ex_async(request, headers, runtime)

    def apply_antcloud_insurance_mktserviceprovider_audiencecircle_ex(
        self,
        request: insurancesaas_models.ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse:
        """
        Description: 保险营销服务商人群圈选
        Summary: 保险营销服务商人群圈选
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse(),
            self.do_request('1.0', 'antcloud.insurance.mktserviceprovider.audiencecircle.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def apply_antcloud_insurance_mktserviceprovider_audiencecircle_ex_async(
        self,
        request: insurancesaas_models.ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse:
        """
        Description: 保险营销服务商人群圈选
        Summary: 保险营销服务商人群圈选
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.mktserviceprovider.audiencecircle.apply', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def get_antcloud_insurance_mkt_extresulturl(
        self,
        request: insurancesaas_models.GetAntcloudInsuranceMktExtresulturlRequest,
    ) -> insurancesaas_models.GetAntcloudInsuranceMktExtresulturlResponse:
        """
        Description: 营销人群底包析出结果查询
        Summary: 营销人群底包析出结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.get_antcloud_insurance_mkt_extresulturl_ex(request, headers, runtime)

    async def get_antcloud_insurance_mkt_extresulturl_async(
        self,
        request: insurancesaas_models.GetAntcloudInsuranceMktExtresulturlRequest,
    ) -> insurancesaas_models.GetAntcloudInsuranceMktExtresulturlResponse:
        """
        Description: 营销人群底包析出结果查询
        Summary: 营销人群底包析出结果查询
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.get_antcloud_insurance_mkt_extresulturl_ex_async(request, headers, runtime)

    def get_antcloud_insurance_mkt_extresulturl_ex(
        self,
        request: insurancesaas_models.GetAntcloudInsuranceMktExtresulturlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.GetAntcloudInsuranceMktExtresulturlResponse:
        """
        Description: 营销人群底包析出结果查询
        Summary: 营销人群底包析出结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.GetAntcloudInsuranceMktExtresulturlResponse(),
            self.do_request('1.0', 'antcloud.insurance.mkt.extresulturl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def get_antcloud_insurance_mkt_extresulturl_ex_async(
        self,
        request: insurancesaas_models.GetAntcloudInsuranceMktExtresulturlRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.GetAntcloudInsuranceMktExtresulturlResponse:
        """
        Description: 营销人群底包析出结果查询
        Summary: 营销人群底包析出结果查询
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.GetAntcloudInsuranceMktExtresulturlResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.mkt.extresulturl.get', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def receive_antcloud_insurance_lead_opportunities(
        self,
        request: insurancesaas_models.ReceiveAntcloudInsuranceLeadOpportunitiesRequest,
    ) -> insurancesaas_models.ReceiveAntcloudInsuranceLeadOpportunitiesResponse:
        """
        Description: 商机接收-既往症人群评分-对客
        Summary: 商机接收-既往症人群评分-对客
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.receive_antcloud_insurance_lead_opportunities_ex(request, headers, runtime)

    async def receive_antcloud_insurance_lead_opportunities_async(
        self,
        request: insurancesaas_models.ReceiveAntcloudInsuranceLeadOpportunitiesRequest,
    ) -> insurancesaas_models.ReceiveAntcloudInsuranceLeadOpportunitiesResponse:
        """
        Description: 商机接收-既往症人群评分-对客
        Summary: 商机接收-既往症人群评分-对客
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.receive_antcloud_insurance_lead_opportunities_ex_async(request, headers, runtime)

    def receive_antcloud_insurance_lead_opportunities_ex(
        self,
        request: insurancesaas_models.ReceiveAntcloudInsuranceLeadOpportunitiesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.ReceiveAntcloudInsuranceLeadOpportunitiesResponse:
        """
        Description: 商机接收-既往症人群评分-对客
        Summary: 商机接收-既往症人群评分-对客
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = insurancesaas_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antcloud.insurance.lead.opportunities.receive',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                receive_antcloud_insurance_lead_opportunities_response = insurancesaas_models.ReceiveAntcloudInsuranceLeadOpportunitiesResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return receive_antcloud_insurance_lead_opportunities_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.ReceiveAntcloudInsuranceLeadOpportunitiesResponse(),
            self.do_request('1.0', 'antcloud.insurance.lead.opportunities.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def receive_antcloud_insurance_lead_opportunities_ex_async(
        self,
        request: insurancesaas_models.ReceiveAntcloudInsuranceLeadOpportunitiesRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.ReceiveAntcloudInsuranceLeadOpportunitiesResponse:
        """
        Description: 商机接收-既往症人群评分-对客
        Summary: 商机接收-既往症人群评分-对客
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = insurancesaas_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antcloud.insurance.lead.opportunities.receive',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                receive_antcloud_insurance_lead_opportunities_response = insurancesaas_models.ReceiveAntcloudInsuranceLeadOpportunitiesResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return receive_antcloud_insurance_lead_opportunities_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.ReceiveAntcloudInsuranceLeadOpportunitiesResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.lead.opportunities.receive', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def postback_antcloud_insurance_lead_receive(
        self,
        request: insurancesaas_models.PostbackAntcloudInsuranceLeadReceiveRequest,
    ) -> insurancesaas_models.PostbackAntcloudInsuranceLeadReceiveResponse:
        """
        Description: 既往症线索供给方评分结果文件回传
        Summary: 既往症线索供给方评分结果文件回传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.postback_antcloud_insurance_lead_receive_ex(request, headers, runtime)

    async def postback_antcloud_insurance_lead_receive_async(
        self,
        request: insurancesaas_models.PostbackAntcloudInsuranceLeadReceiveRequest,
    ) -> insurancesaas_models.PostbackAntcloudInsuranceLeadReceiveResponse:
        """
        Description: 既往症线索供给方评分结果文件回传
        Summary: 既往症线索供给方评分结果文件回传
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.postback_antcloud_insurance_lead_receive_ex_async(request, headers, runtime)

    def postback_antcloud_insurance_lead_receive_ex(
        self,
        request: insurancesaas_models.PostbackAntcloudInsuranceLeadReceiveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.PostbackAntcloudInsuranceLeadReceiveResponse:
        """
        Description: 既往症线索供给方评分结果文件回传
        Summary: 既往症线索供给方评分结果文件回传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = insurancesaas_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antcloud.insurance.lead.receive.postback',
                file_name=request.file_object_name
            )
            upload_resp = self.create_antcloud_gatewayx_file_upload_ex(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                postback_antcloud_insurance_lead_receive_response = insurancesaas_models.PostbackAntcloudInsuranceLeadReceiveResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return postback_antcloud_insurance_lead_receive_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            AntchainUtils.put_object(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.PostbackAntcloudInsuranceLeadReceiveResponse(),
            self.do_request('1.0', 'antcloud.insurance.lead.receive.postback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def postback_antcloud_insurance_lead_receive_ex_async(
        self,
        request: insurancesaas_models.PostbackAntcloudInsuranceLeadReceiveRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.PostbackAntcloudInsuranceLeadReceiveResponse:
        """
        Description: 既往症线索供给方评分结果文件回传
        Summary: 既往症线索供给方评分结果文件回传
        """
        if not UtilClient.is_unset(request.file_object):
            upload_req = insurancesaas_models.CreateAntcloudGatewayxFileUploadRequest(
                auth_token=request.auth_token,
                api_code='antcloud.insurance.lead.receive.postback',
                file_name=request.file_object_name
            )
            upload_resp = await self.create_antcloud_gatewayx_file_upload_ex_async(upload_req, headers, runtime)
            if not AntchainUtils.is_success(upload_resp.result_code, 'ok'):
                postback_antcloud_insurance_lead_receive_response = insurancesaas_models.PostbackAntcloudInsuranceLeadReceiveResponse(
                    req_msg_id=upload_resp.req_msg_id,
                    result_code=upload_resp.result_code,
                    result_msg=upload_resp.result_msg
                )
                return postback_antcloud_insurance_lead_receive_response
            upload_headers = AntchainUtils.parse_upload_headers(upload_resp.upload_headers)
            await AntchainUtils.put_object_async(request.file_object, upload_headers, upload_resp.upload_url)
            request.file_id = upload_resp.file_id
            request.file_object = None
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.PostbackAntcloudInsuranceLeadReceiveResponse(),
            await self.do_request_async('1.0', 'antcloud.insurance.lead.receive.postback', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    def create_antcloud_gatewayx_file_upload(
        self,
        request: insurancesaas_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> insurancesaas_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return self.create_antcloud_gatewayx_file_upload_ex(request, headers, runtime)

    async def create_antcloud_gatewayx_file_upload_async(
        self,
        request: insurancesaas_models.CreateAntcloudGatewayxFileUploadRequest,
    ) -> insurancesaas_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        runtime = util_models.RuntimeOptions()
        headers = {}
        return await self.create_antcloud_gatewayx_file_upload_ex_async(request, headers, runtime)

    def create_antcloud_gatewayx_file_upload_ex(
        self,
        request: insurancesaas_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.CreateAntcloudGatewayxFileUploadResponse(),
            self.do_request('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )

    async def create_antcloud_gatewayx_file_upload_ex_async(
        self,
        request: insurancesaas_models.CreateAntcloudGatewayxFileUploadRequest,
        headers: Dict[str, str],
        runtime: util_models.RuntimeOptions,
    ) -> insurancesaas_models.CreateAntcloudGatewayxFileUploadResponse:
        """
        Description: 创建HTTP PUT提交的文件上传
        Summary: 文件上传创建
        """
        UtilClient.validate_model(request)
        return TeaCore.from_map(
            insurancesaas_models.CreateAntcloudGatewayxFileUploadResponse(),
            await self.do_request_async('1.0', 'antcloud.gatewayx.file.upload.create', 'HTTPS', 'POST', f'/gateway.do', TeaCore.to_map(request), headers, runtime)
        )
