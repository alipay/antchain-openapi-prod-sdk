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


class OutboundPhoneResponseData(TeaModel):
    def __init__(
        self,
        acid: str = None,
        asyn: bool = None,
        outcall_request_id: str = None,
        asyn_db_id: str = None,
    ):
        # 通话唯一ID
        self.acid = acid
        # 是否同步
        self.asyn = asyn
        # 外呼ID
        self.outcall_request_id = outcall_request_id
        # 外呼DB的ID
        self.asyn_db_id = asyn_db_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.acid is not None:
            result['acid'] = self.acid
        if self.asyn is not None:
            result['asyn'] = self.asyn
        if self.outcall_request_id is not None:
            result['outcall_request_id'] = self.outcall_request_id
        if self.asyn_db_id is not None:
            result['asyn_db_id'] = self.asyn_db_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('acid') is not None:
            self.acid = m.get('acid')
        if m.get('asyn') is not None:
            self.asyn = m.get('asyn')
        if m.get('outcall_request_id') is not None:
            self.outcall_request_id = m.get('outcall_request_id')
        if m.get('asyn_db_id') is not None:
            self.asyn_db_id = m.get('asyn_db_id')
        return self


class ImportAntchainAioOutboundPhoneRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_code: str = None,
        user_phone: str = None,
        user_id: str = None,
        idempotence_id: str = None,
        biz_ext_info: str = None,
        outcall_timestamp: int = None,
        expiration_timestamp: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_code = task_code
        # 收单手机号
        self.user_phone = user_phone
        # 用户ID
        self.user_id = user_id
        # 幂等控制参数，可以为空。为空时不进行幂等控
        self.idempotence_id = idempotence_id
        # 业务系统在外呼时传入额外参数,json格式
        self.biz_ext_info = biz_ext_info
        # 计划外呼执行时间时间戳。默认为当前时间。单位毫秒
        self.outcall_timestamp = outcall_timestamp
        # 计划外呼过期时间戳。 必须填写，一般为当天22:30左右。单位毫秒
        self.expiration_timestamp = expiration_timestamp

    def validate(self):
        self.validate_required(self.task_code, 'task_code')
        self.validate_required(self.user_phone, 'user_phone')
        self.validate_required(self.expiration_timestamp, 'expiration_timestamp')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_code is not None:
            result['task_code'] = self.task_code
        if self.user_phone is not None:
            result['user_phone'] = self.user_phone
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.idempotence_id is not None:
            result['idempotence_id'] = self.idempotence_id
        if self.biz_ext_info is not None:
            result['biz_ext_info'] = self.biz_ext_info
        if self.outcall_timestamp is not None:
            result['outcall_timestamp'] = self.outcall_timestamp
        if self.expiration_timestamp is not None:
            result['expiration_timestamp'] = self.expiration_timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_code') is not None:
            self.task_code = m.get('task_code')
        if m.get('user_phone') is not None:
            self.user_phone = m.get('user_phone')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('idempotence_id') is not None:
            self.idempotence_id = m.get('idempotence_id')
        if m.get('biz_ext_info') is not None:
            self.biz_ext_info = m.get('biz_ext_info')
        if m.get('outcall_timestamp') is not None:
            self.outcall_timestamp = m.get('outcall_timestamp')
        if m.get('expiration_timestamp') is not None:
            self.expiration_timestamp = m.get('expiration_timestamp')
        return self


class ImportAntchainAioOutboundPhoneResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        code: str = None,
        message: str = None,
        data: OutboundPhoneResponseData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.success = success
        # 返回码
        self.code = code
        # 描述
        self.message = message
        # 内容
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
        if self.success is not None:
            result['success'] = self.success
        if self.code is not None:
            result['code'] = self.code
        if self.message is not None:
            result['message'] = self.message
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
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('message') is not None:
            self.message = m.get('message')
        if m.get('data') is not None:
            temp_model = OutboundPhoneResponseData()
            self.data = temp_model.from_map(m['data'])
        return self


