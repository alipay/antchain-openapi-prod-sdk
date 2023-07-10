# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel
from typing import List


class Config(TeaModel):
    """
    Model for initing client
    """
    def __init__(
        self,
        access_key_id: str = None,
        access_key_secret: str = None,
        security_token: str = None,
        protocol: str = None,
        read_timeout: int = None,
        connect_timeout: int = None,
        http_proxy: str = None,
        https_proxy: str = None,
        endpoint: str = None,
        no_proxy: str = None,
        max_idle_conns: int = None,
        user_agent: str = None,
        socks_5proxy: str = None,
        socks_5net_work: str = None,
        max_idle_time_millis: int = None,
        keep_alive_duration_millis: int = None,
        max_requests: int = None,
        max_requests_per_host: int = None,
    ):
        # accesskey id
        self.access_key_id = access_key_id
        # accesskey secret
        self.access_key_secret = access_key_secret
        # security token
        self.security_token = security_token
        # http protocol
        self.protocol = protocol
        # read timeout
        self.read_timeout = read_timeout
        # connect timeout
        self.connect_timeout = connect_timeout
        # http proxy
        self.http_proxy = http_proxy
        # https proxy
        self.https_proxy = https_proxy
        # endpoint
        self.endpoint = endpoint
        # proxy white list
        self.no_proxy = no_proxy
        # max idle conns
        self.max_idle_conns = max_idle_conns
        # user agent
        self.user_agent = user_agent
        # socks5 proxy
        self.socks_5proxy = socks_5proxy
        # socks5 network
        self.socks_5net_work = socks_5net_work
        # 长链接最大空闲时长
        self.max_idle_time_millis = max_idle_time_millis
        # 长链接最大连接时长
        self.keep_alive_duration_millis = keep_alive_duration_millis
        # 最大连接数（长链接最大总数）
        self.max_requests = max_requests
        # 每个目标主机的最大连接数（分主机域名的长链接最大总数
        self.max_requests_per_host = max_requests_per_host

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.access_key_id is not None:
            result['accessKeyId'] = self.access_key_id
        if self.access_key_secret is not None:
            result['accessKeySecret'] = self.access_key_secret
        if self.security_token is not None:
            result['securityToken'] = self.security_token
        if self.protocol is not None:
            result['protocol'] = self.protocol
        if self.read_timeout is not None:
            result['readTimeout'] = self.read_timeout
        if self.connect_timeout is not None:
            result['connectTimeout'] = self.connect_timeout
        if self.http_proxy is not None:
            result['httpProxy'] = self.http_proxy
        if self.https_proxy is not None:
            result['httpsProxy'] = self.https_proxy
        if self.endpoint is not None:
            result['endpoint'] = self.endpoint
        if self.no_proxy is not None:
            result['noProxy'] = self.no_proxy
        if self.max_idle_conns is not None:
            result['maxIdleConns'] = self.max_idle_conns
        if self.user_agent is not None:
            result['userAgent'] = self.user_agent
        if self.socks_5proxy is not None:
            result['socks5Proxy'] = self.socks_5proxy
        if self.socks_5net_work is not None:
            result['socks5NetWork'] = self.socks_5net_work
        if self.max_idle_time_millis is not None:
            result['maxIdleTimeMillis'] = self.max_idle_time_millis
        if self.keep_alive_duration_millis is not None:
            result['keepAliveDurationMillis'] = self.keep_alive_duration_millis
        if self.max_requests is not None:
            result['maxRequests'] = self.max_requests
        if self.max_requests_per_host is not None:
            result['maxRequestsPerHost'] = self.max_requests_per_host
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('accessKeyId') is not None:
            self.access_key_id = m.get('accessKeyId')
        if m.get('accessKeySecret') is not None:
            self.access_key_secret = m.get('accessKeySecret')
        if m.get('securityToken') is not None:
            self.security_token = m.get('securityToken')
        if m.get('protocol') is not None:
            self.protocol = m.get('protocol')
        if m.get('readTimeout') is not None:
            self.read_timeout = m.get('readTimeout')
        if m.get('connectTimeout') is not None:
            self.connect_timeout = m.get('connectTimeout')
        if m.get('httpProxy') is not None:
            self.http_proxy = m.get('httpProxy')
        if m.get('httpsProxy') is not None:
            self.https_proxy = m.get('httpsProxy')
        if m.get('endpoint') is not None:
            self.endpoint = m.get('endpoint')
        if m.get('noProxy') is not None:
            self.no_proxy = m.get('noProxy')
        if m.get('maxIdleConns') is not None:
            self.max_idle_conns = m.get('maxIdleConns')
        if m.get('userAgent') is not None:
            self.user_agent = m.get('userAgent')
        if m.get('socks5Proxy') is not None:
            self.socks_5proxy = m.get('socks5Proxy')
        if m.get('socks5NetWork') is not None:
            self.socks_5net_work = m.get('socks5NetWork')
        if m.get('maxIdleTimeMillis') is not None:
            self.max_idle_time_millis = m.get('maxIdleTimeMillis')
        if m.get('keepAliveDurationMillis') is not None:
            self.keep_alive_duration_millis = m.get('keepAliveDurationMillis')
        if m.get('maxRequests') is not None:
            self.max_requests = m.get('maxRequests')
        if m.get('maxRequestsPerHost') is not None:
            self.max_requests_per_host = m.get('maxRequestsPerHost')
        return self


class DeviceRiskReportResultData(TeaModel):
    def __init__(
        self,
        webrtc_url: str = None,
        a_dynamic_swi: str = None,
        dynamic_interval: str = None,
        color: str = None,
        os: str = None,
        dynamic_cmd: str = None,
        time_interval: str = None,
        dynamic_trace: str = None,
        dynamic_num: str = None,
        result_type: str = None,
    ):
        # webrtc_url
        self.webrtc_url = webrtc_url
        # a_dynamic_swi
        self.a_dynamic_swi = a_dynamic_swi
        # dynamic_interval
        self.dynamic_interval = dynamic_interval
        # color
        self.color = color
        # os
        self.os = os
        # dynamic_cmd
        self.dynamic_cmd = dynamic_cmd
        # time_interval
        self.time_interval = time_interval
        # dynamic_trace
        self.dynamic_trace = dynamic_trace
        # dynamic_num
        self.dynamic_num = dynamic_num
        # result_type
        self.result_type = result_type

    def validate(self):
        self.validate_required(self.webrtc_url, 'webrtc_url')
        self.validate_required(self.a_dynamic_swi, 'a_dynamic_swi')
        self.validate_required(self.dynamic_interval, 'dynamic_interval')
        self.validate_required(self.color, 'color')
        self.validate_required(self.os, 'os')
        self.validate_required(self.dynamic_cmd, 'dynamic_cmd')
        self.validate_required(self.time_interval, 'time_interval')
        self.validate_required(self.dynamic_trace, 'dynamic_trace')
        self.validate_required(self.dynamic_num, 'dynamic_num')
        self.validate_required(self.result_type, 'result_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.webrtc_url is not None:
            result['webrtc_url'] = self.webrtc_url
        if self.a_dynamic_swi is not None:
            result['a_dynamic_swi'] = self.a_dynamic_swi
        if self.dynamic_interval is not None:
            result['dynamic_interval'] = self.dynamic_interval
        if self.color is not None:
            result['color'] = self.color
        if self.os is not None:
            result['os'] = self.os
        if self.dynamic_cmd is not None:
            result['dynamic_cmd'] = self.dynamic_cmd
        if self.time_interval is not None:
            result['time_interval'] = self.time_interval
        if self.dynamic_trace is not None:
            result['dynamic_trace'] = self.dynamic_trace
        if self.dynamic_num is not None:
            result['dynamic_num'] = self.dynamic_num
        if self.result_type is not None:
            result['result_type'] = self.result_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('webrtc_url') is not None:
            self.webrtc_url = m.get('webrtc_url')
        if m.get('a_dynamic_swi') is not None:
            self.a_dynamic_swi = m.get('a_dynamic_swi')
        if m.get('dynamic_interval') is not None:
            self.dynamic_interval = m.get('dynamic_interval')
        if m.get('color') is not None:
            self.color = m.get('color')
        if m.get('os') is not None:
            self.os = m.get('os')
        if m.get('dynamic_cmd') is not None:
            self.dynamic_cmd = m.get('dynamic_cmd')
        if m.get('time_interval') is not None:
            self.time_interval = m.get('time_interval')
        if m.get('dynamic_trace') is not None:
            self.dynamic_trace = m.get('dynamic_trace')
        if m.get('dynamic_num') is not None:
            self.dynamic_num = m.get('dynamic_num')
        if m.get('result_type') is not None:
            self.result_type = m.get('result_type')
        return self


class DeviceRiskReportResult(TeaModel):
    def __init__(
        self,
        success: bool = None,
        result_code: str = None,
        result_status: str = None,
        apdid: str = None,
        token: str = None,
        current_time: str = None,
        version: str = None,
        vkey_switch: str = None,
        bug_track_switch: str = None,
        app_list_ver: str = None,
        dynamic_key: str = None,
        result_data: DeviceRiskReportResultData = None,
    ):
        # success
        self.success = success
        # result_code
        self.result_code = result_code
        # result_status
        self.result_status = result_status
        # apdid
        self.apdid = apdid
        # token
        self.token = token
        # current_time
        self.current_time = current_time
        # version
        self.version = version
        # vkey_switch
        self.vkey_switch = vkey_switch
        # bug_track_switch
        self.bug_track_switch = bug_track_switch
        # app_list_ver
        self.app_list_ver = app_list_ver
        # dynamic_key
        self.dynamic_key = dynamic_key
        # result_data
        self.result_data = result_data

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.result_code, 'result_code')
        self.validate_required(self.result_status, 'result_status')
        self.validate_required(self.apdid, 'apdid')
        self.validate_required(self.token, 'token')
        self.validate_required(self.current_time, 'current_time')
        self.validate_required(self.version, 'version')
        self.validate_required(self.vkey_switch, 'vkey_switch')
        self.validate_required(self.bug_track_switch, 'bug_track_switch')
        self.validate_required(self.app_list_ver, 'app_list_ver')
        self.validate_required(self.dynamic_key, 'dynamic_key')
        self.validate_required(self.result_data, 'result_data')
        if self.result_data:
            self.result_data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_status is not None:
            result['result_status'] = self.result_status
        if self.apdid is not None:
            result['apdid'] = self.apdid
        if self.token is not None:
            result['token'] = self.token
        if self.current_time is not None:
            result['current_time'] = self.current_time
        if self.version is not None:
            result['version'] = self.version
        if self.vkey_switch is not None:
            result['vkey_switch'] = self.vkey_switch
        if self.bug_track_switch is not None:
            result['bug_track_switch'] = self.bug_track_switch
        if self.app_list_ver is not None:
            result['app_list_ver'] = self.app_list_ver
        if self.dynamic_key is not None:
            result['dynamic_key'] = self.dynamic_key
        if self.result_data is not None:
            result['result_data'] = self.result_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_status') is not None:
            self.result_status = m.get('result_status')
        if m.get('apdid') is not None:
            self.apdid = m.get('apdid')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('current_time') is not None:
            self.current_time = m.get('current_time')
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('vkey_switch') is not None:
            self.vkey_switch = m.get('vkey_switch')
        if m.get('bug_track_switch') is not None:
            self.bug_track_switch = m.get('bug_track_switch')
        if m.get('app_list_ver') is not None:
            self.app_list_ver = m.get('app_list_ver')
        if m.get('dynamic_key') is not None:
            self.dynamic_key = m.get('dynamic_key')
        if m.get('result_data') is not None:
            temp_model = DeviceRiskReportResultData()
            self.result_data = temp_model.from_map(m['result_data'])
        return self


class DeviceRiskResp(TeaModel):
    def __init__(
        self,
        apdid: str = None,
        apdid_token: str = None,
        risk_level: int = None,
        risk_desc: str = None,
        sug_action: str = None,
        risk_labels: List[str] = None,
    ):
        # apdid
        self.apdid = apdid
        # apdid
        self.apdid_token = apdid_token
        # riskLevel
        self.risk_level = risk_level
        # risk_desc
        self.risk_desc = risk_desc
        # sug_action
        self.sug_action = sug_action
        # risk_labels
        self.risk_labels = risk_labels

    def validate(self):
        self.validate_required(self.apdid, 'apdid')
        self.validate_required(self.apdid_token, 'apdid_token')
        self.validate_required(self.risk_level, 'risk_level')
        self.validate_required(self.risk_desc, 'risk_desc')
        self.validate_required(self.sug_action, 'sug_action')
        self.validate_required(self.risk_labels, 'risk_labels')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.apdid is not None:
            result['apdid'] = self.apdid
        if self.apdid_token is not None:
            result['apdid_token'] = self.apdid_token
        if self.risk_level is not None:
            result['risk_level'] = self.risk_level
        if self.risk_desc is not None:
            result['risk_desc'] = self.risk_desc
        if self.sug_action is not None:
            result['sug_action'] = self.sug_action
        if self.risk_labels is not None:
            result['risk_labels'] = self.risk_labels
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('apdid') is not None:
            self.apdid = m.get('apdid')
        if m.get('apdid_token') is not None:
            self.apdid_token = m.get('apdid_token')
        if m.get('risk_level') is not None:
            self.risk_level = m.get('risk_level')
        if m.get('risk_desc') is not None:
            self.risk_desc = m.get('risk_desc')
        if m.get('sug_action') is not None:
            self.sug_action = m.get('sug_action')
        if m.get('risk_labels') is not None:
            self.risk_labels = m.get('risk_labels')
        return self


class QueryHksecuritytechGatewayDeviceriskFingerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        apdid_token: str = None,
        client_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # apdid_token
        self.apdid_token = apdid_token
        # client_id
        self.client_id = client_id

    def validate(self):
        self.validate_required(self.apdid_token, 'apdid_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.apdid_token is not None:
            result['apdid_token'] = self.apdid_token
        if self.client_id is not None:
            result['client_id'] = self.client_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('apdid_token') is not None:
            self.apdid_token = m.get('apdid_token')
        if m.get('client_id') is not None:
            self.client_id = m.get('client_id')
        return self


class QueryHksecuritytechGatewayDeviceriskFingerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        message: str = None,
        request_id: str = None,
        success: bool = None,
        data: DeviceRiskResp = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # code
        self.code = code
        # message
        self.message = message
        # request_id
        self.request_id = request_id
        # success
        self.success = success
        # data
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.success is not None:
            result['success'] = self.success
        if self.data is not None:
            result['data'] = self.data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('data') is not None:
            temp_model = DeviceRiskResp()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryHksecuritytechGatewayDeviceriskDeviceriskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        apdid_token: str = None,
        client_id: str = None,
        app_id: str = None,
        env_id: str = None,
        tenant_id: str = None,
        merchant_id: str = None,
        app_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # apdid_token
        self.apdid_token = apdid_token
        # client_id
        self.client_id = client_id
        # app_id
        self.app_id = app_id
        # env_id
        self.env_id = env_id
        # tenant_id
        self.tenant_id = tenant_id
        # merchant_id
        self.merchant_id = merchant_id
        # app_name
        self.app_name = app_name

    def validate(self):
        self.validate_required(self.apdid_token, 'apdid_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.apdid_token is not None:
            result['apdid_token'] = self.apdid_token
        if self.client_id is not None:
            result['client_id'] = self.client_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.env_id is not None:
            result['env_id'] = self.env_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.app_name is not None:
            result['app_name'] = self.app_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('apdid_token') is not None:
            self.apdid_token = m.get('apdid_token')
        if m.get('client_id') is not None:
            self.client_id = m.get('client_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('env_id') is not None:
            self.env_id = m.get('env_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('app_name') is not None:
            self.app_name = m.get('app_name')
        return self


class QueryHksecuritytechGatewayDeviceriskDeviceriskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: int = None,
        message: str = None,
        request_id: str = None,
        success: bool = None,
        data: DeviceRiskResp = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # code
        self.code = code
        # message
        self.message = message
        # request_id
        self.request_id = request_id
        # success
        self.success = success
        # data
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.success is not None:
            result['success'] = self.success
        if self.data is not None:
            result['data'] = self.data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('data') is not None:
            temp_model = DeviceRiskResp()
            self.data = temp_model.from_map(m['data'])
        return self


class SubmitHksecuritytechGatewayDeviceriskReportRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_data: str = None,
        result: DeviceRiskReportResult = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # request_data
        self.request_data = request_data
        # result
        self.result = result

    def validate(self):
        self.validate_required(self.request_data, 'request_data')
        self.validate_required(self.result, 'result')
        if self.result:
            self.result.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.request_data is not None:
            result['request_data'] = self.request_data
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_data') is not None:
            self.request_data = m.get('request_data')
        if m.get('result') is not None:
            temp_model = DeviceRiskReportResult()
            self.result = temp_model.from_map(m['result'])
        return self


class SubmitHksecuritytechGatewayDeviceriskReportResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_status: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 1000
        self.result_status = result_status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.result_status is not None:
            result['result_status'] = self.result_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result_status') is not None:
            self.result_status = m.get('result_status')
        return self


