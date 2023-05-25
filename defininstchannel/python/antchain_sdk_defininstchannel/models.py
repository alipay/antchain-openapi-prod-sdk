# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel


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


class BizResult(TeaModel):
    def __init__(
        self,
        success: bool = None,
        error_code: str = None,
        need_retry: bool = None,
        error_msg: str = None,
        error_view_msg: str = None,
        encoded_result_obj: str = None,
    ):
        # 是否成功
        self.success = success
        # 错误码
        self.error_code = error_code
        # 是否重试
        self.need_retry = need_retry
        # 错误描述
        self.error_msg = error_msg
        # 错误描述
        self.error_view_msg = error_view_msg
        # 成功返回信息
        self.encoded_result_obj = encoded_result_obj

    def validate(self):
        self.validate_required(self.success, 'success')
        self.validate_required(self.error_code, 'error_code')
        self.validate_required(self.need_retry, 'need_retry')
        self.validate_required(self.error_msg, 'error_msg')
        self.validate_required(self.error_view_msg, 'error_view_msg')
        self.validate_required(self.encoded_result_obj, 'encoded_result_obj')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.success is not None:
            result['success'] = self.success
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.need_retry is not None:
            result['need_retry'] = self.need_retry
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        if self.error_view_msg is not None:
            result['error_view_msg'] = self.error_view_msg
        if self.encoded_result_obj is not None:
            result['encoded_result_obj'] = self.encoded_result_obj
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('need_retry') is not None:
            self.need_retry = m.get('need_retry')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        if m.get('error_view_msg') is not None:
            self.error_view_msg = m.get('error_view_msg')
        if m.get('encoded_result_obj') is not None:
            self.encoded_result_obj = m.get('encoded_result_obj')
        return self


class SystemParam(TeaModel):
    def __init__(
        self,
        partner: str = None,
        function: str = None,
        request_id: str = None,
    ):
        # 合作方标识，由蚂蚁分配
        self.partner = partner
        # 功能标识，业务接口定义
        self.function = function
        # 请求流水号
        self.request_id = request_id

    def validate(self):
        self.validate_required(self.partner, 'partner')
        self.validate_required(self.function, 'function')
        self.validate_required(self.request_id, 'request_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.partner is not None:
            result['partner'] = self.partner
        if self.function is not None:
            result['function'] = self.function
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('partner') is not None:
            self.partner = m.get('partner')
        if m.get('function') is not None:
            self.function = m.get('function')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class SubmitInstapiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        sys_param: SystemParam = None,
        encoded_biz_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 通用参数
        self.sys_param = sys_param
        # 业务参数
        self.encoded_biz_param = encoded_biz_param

    def validate(self):
        self.validate_required(self.sys_param, 'sys_param')
        if self.sys_param:
            self.sys_param.validate()
        self.validate_required(self.encoded_biz_param, 'encoded_biz_param')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.sys_param is not None:
            result['sys_param'] = self.sys_param.to_map()
        if self.encoded_biz_param is not None:
            result['encoded_biz_param'] = self.encoded_biz_param
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('sys_param') is not None:
            temp_model = SystemParam()
            self.sys_param = temp_model.from_map(m['sys_param'])
        if m.get('encoded_biz_param') is not None:
            self.encoded_biz_param = m.get('encoded_biz_param')
        return self


class SubmitInstapiResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: BizResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务返回
        self.biz_result = biz_result

    def validate(self):
        if self.biz_result:
            self.biz_result.validate()

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            temp_model = BizResult()
            self.biz_result = temp_model.from_map(m['biz_result'])
        return self


class SubmitFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        sys_param: SystemParam = None,
        encoded_biz_param: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 通用参数
        self.sys_param = sys_param
        # 业务参数
        self.encoded_biz_param = encoded_biz_param

    def validate(self):
        self.validate_required(self.sys_param, 'sys_param')
        if self.sys_param:
            self.sys_param.validate()
        self.validate_required(self.encoded_biz_param, 'encoded_biz_param')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.sys_param is not None:
            result['sys_param'] = self.sys_param.to_map()
        if self.encoded_biz_param is not None:
            result['encoded_biz_param'] = self.encoded_biz_param
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('sys_param') is not None:
            temp_model = SystemParam()
            self.sys_param = temp_model.from_map(m['sys_param'])
        if m.get('encoded_biz_param') is not None:
            self.encoded_biz_param = m.get('encoded_biz_param')
        return self


class SubmitFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: BizResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务返回参数
        self.biz_result = biz_result

    def validate(self):
        if self.biz_result:
            self.biz_result.validate()

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            temp_model = BizResult()
            self.biz_result = temp_model.from_map(m['biz_result'])
        return self


