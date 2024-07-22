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


class QueryAntchainZkcollabinvLocationInternalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id_number: str = None,
        phone_no: str = None,
        start_time: str = None,
        end_time: str = None,
        center_position: str = None,
        distinct_county: str = None,
        inv_type: int = None,
        api_service_level: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # md5加密的身份证号
        self.id_number = id_number
        # md5加密的手机号
        self.phone_no = phone_no
        # 定位时间范围开始时间
        self.start_time = start_time
        # 定位时间范围结束时间
        self.end_time = end_time
        # 核查中心位置（经度,纬度）
        self.center_position = center_position
        # 核查省市区县范围
        self.distinct_county = distinct_county
        # 协查类型：
        # 0: 为经纬度精准定位协查 (默认)
        # 1:  为区县定位 (省-市-区/县) 协查
        self.inv_type = inv_type
        # 服务级别与结果值定义
        self.api_service_level = api_service_level

    def validate(self):
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')
        self.validate_required(self.api_service_level, 'api_service_level')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id_number is not None:
            result['id_number'] = self.id_number
        if self.phone_no is not None:
            result['phone_no'] = self.phone_no
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.center_position is not None:
            result['center_position'] = self.center_position
        if self.distinct_county is not None:
            result['distinct_county'] = self.distinct_county
        if self.inv_type is not None:
            result['inv_type'] = self.inv_type
        if self.api_service_level is not None:
            result['api_service_level'] = self.api_service_level
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id_number') is not None:
            self.id_number = m.get('id_number')
        if m.get('phone_no') is not None:
            self.phone_no = m.get('phone_no')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('center_position') is not None:
            self.center_position = m.get('center_position')
        if m.get('distinct_county') is not None:
            self.distinct_county = m.get('distinct_county')
        if m.get('inv_type') is not None:
            self.inv_type = m.get('inv_type')
        if m.get('api_service_level') is not None:
            self.api_service_level = m.get('api_service_level')
        return self


class QueryAntchainZkcollabinvLocationInternalResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        confidence_value: str = None,
        ext_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 置信度取值：A/B/C
        self.confidence_value = confidence_value
        # 扩展字段，其他信息
        self.ext_info = ext_info

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
        if self.confidence_value is not None:
            result['confidence_value'] = self.confidence_value
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('confidence_value') is not None:
            self.confidence_value = m.get('confidence_value')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class QueryAntchainZkcollabinvLocationTradeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id_number: str = None,
        phone_no: str = None,
        caller_id: str = None,
        start_time: str = None,
        end_time: str = None,
        center_position: str = None,
        distinct_county: str = None,
        inv_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # md5加密的身份证号
        self.id_number = id_number
        # md5加密的手机号
        self.phone_no = phone_no
        # 调用者用户ID（或外部系统业务ID）
        self.caller_id = caller_id
        # 定位时间范围开始时间
        self.start_time = start_time
        # 定位时间范围结束时间
        self.end_time = end_time
        # 核查中心位置（经度,纬度）
        self.center_position = center_position
        # 核查省市区县范围
        self.distinct_county = distinct_county
        # 协查类型：
        # 0: 为经纬度精准定位协查 (默认)
        # 1:  为区县定位 (省-市-区/县) 协查
        self.inv_type = inv_type

    def validate(self):
        if self.id_number is not None:
            self.validate_max_length(self.id_number, 'id_number', 32)
        if self.phone_no is not None:
            self.validate_max_length(self.phone_no, 'phone_no', 32)
        self.validate_required(self.caller_id, 'caller_id')
        if self.caller_id is not None:
            self.validate_max_length(self.caller_id, 'caller_id', 128)
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_max_length(self.start_time, 'start_time', 19)
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_max_length(self.end_time, 'end_time', 19)
        if self.center_position is not None:
            self.validate_max_length(self.center_position, 'center_position', 64)
        if self.distinct_county is not None:
            self.validate_max_length(self.distinct_county, 'distinct_county', 128)
        if self.inv_type is not None:
            self.validate_max_length(self.inv_type, 'inv_type', 2)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id_number is not None:
            result['id_number'] = self.id_number
        if self.phone_no is not None:
            result['phone_no'] = self.phone_no
        if self.caller_id is not None:
            result['caller_id'] = self.caller_id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.center_position is not None:
            result['center_position'] = self.center_position
        if self.distinct_county is not None:
            result['distinct_county'] = self.distinct_county
        if self.inv_type is not None:
            result['inv_type'] = self.inv_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id_number') is not None:
            self.id_number = m.get('id_number')
        if m.get('phone_no') is not None:
            self.phone_no = m.get('phone_no')
        if m.get('caller_id') is not None:
            self.caller_id = m.get('caller_id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('center_position') is not None:
            self.center_position = m.get('center_position')
        if m.get('distinct_county') is not None:
            self.distinct_county = m.get('distinct_county')
        if m.get('inv_type') is not None:
            self.inv_type = m.get('inv_type')
        return self


class QueryAntchainZkcollabinvLocationTradeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        confidence_value: str = None,
        ext_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 置信度取值：A/B/C
        self.confidence_value = confidence_value
        # 扩展字段，其他信息
        self.ext_info = ext_info

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
        if self.confidence_value is not None:
            result['confidence_value'] = self.confidence_value
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('confidence_value') is not None:
            self.confidence_value = m.get('confidence_value')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


