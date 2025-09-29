# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel
from typing import BinaryIO, List


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


class XNameValuePair(TeaModel):
    def __init__(
        self,
        name: str = None,
        value: str = None,
    ):
        # 键名
        self.name = name
        # 键值
        self.value = value

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class ExecDataproductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_code: str = None,
        request_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 数据产品编码
        self.product_code = product_code
        # 请求ID，调用方需要确保唯一
        self.request_id = request_id
        # 业务入参的json字符串
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class ExecDataproductResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
        charge_flag: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务返回值
        # 
        self.biz_result = biz_result
        # 是否计费标识
        # Y 表示计费，N 表示不计费
        self.charge_flag = charge_flag

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        if self.charge_flag is not None:
            result['charge_flag'] = self.charge_flag
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
            self.biz_result = m.get('biz_result')
        if m.get('charge_flag') is not None:
            self.charge_flag = m.get('charge_flag')
        return self


class ExecDataproductAsyncRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_code: str = None,
        product_type: str = None,
        request_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 数据产品编码
        self.product_code = product_code
        # 产品类型
        # 
        self.product_type = product_type
        # 请求ID，调用方需要确保唯一
        # 
        self.request_id = request_id
        # 业务入参的json字符串
        # 
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.product_type, 'product_type')
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.product_type is not None:
            result['product_type'] = self.product_type
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('product_type') is not None:
            self.product_type = m.get('product_type')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class ExecDataproductAsyncResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        exec_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 执行状态
        # RUNNING：执行中
        # SUCCESS：成功
        # FAIL：失败
        self.exec_status = exec_status

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
        if self.exec_status is not None:
            result['exec_status'] = self.exec_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('exec_status') is not None:
            self.exec_status = m.get('exec_status')
        return self


class QueryDataproductAsyncRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_code: str = None,
        product_type: str = None,
        request_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 数据产品编码
        # 
        self.product_code = product_code
        # 产品类型
        # 
        self.product_type = product_type
        # 请求ID，需要确保和异步调用的请求ID一致
        # 
        self.request_id = request_id

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.product_type, 'product_type')
        self.validate_required(self.request_id, 'request_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.product_type is not None:
            result['product_type'] = self.product_type
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('product_type') is not None:
            self.product_type = m.get('product_type')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class QueryDataproductAsyncResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        exec_status: str = None,
        biz_result: str = None,
        charge_flag: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 执行状态
        # INIT：请求已受理
        # RUNNING：执行中
        # SUCCESS：成功
        # FAIL：失败
        self.exec_status = exec_status
        # 业务返回值
        # 
        self.biz_result = biz_result
        # 是否计费标识 Y 表示计费，N 表示不计费
        # 
        self.charge_flag = charge_flag

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
        if self.exec_status is not None:
            result['exec_status'] = self.exec_status
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        if self.charge_flag is not None:
            result['charge_flag'] = self.charge_flag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('exec_status') is not None:
            self.exec_status = m.get('exec_status')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        if m.get('charge_flag') is not None:
            self.charge_flag = m.get('charge_flag')
        return self


class SubmitDrrdataSubscriptionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        biz_type: str = None,
        request_id: str = None,
        mail_no: str = None,
        cp_code: str = None,
        tag: str = None,
        phone: str = None,
        from_city: str = None,
        to_city: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 业务类型
        self.biz_type = biz_type
        # 请求id
        self.request_id = request_id
        # 运单号
        self.mail_no = mail_no
        # 快递公司编码
        self.cp_code = cp_code
        # 自定义标签，可为备注
        self.tag = tag
        # 收、寄件人电话号码
        self.phone = phone
        # 出发地城市
        self.from_city = from_city
        # 目的地城市
        self.to_city = to_city
        # {}
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        if self.biz_type is not None:
            self.validate_max_length(self.biz_type, 'biz_type', 32)
        self.validate_required(self.request_id, 'request_id')
        if self.request_id is not None:
            self.validate_max_length(self.request_id, 'request_id', 64)
        self.validate_required(self.mail_no, 'mail_no')
        if self.mail_no is not None:
            self.validate_max_length(self.mail_no, 'mail_no', 64)
        if self.cp_code is not None:
            self.validate_max_length(self.cp_code, 'cp_code', 64)
        if self.tag is not None:
            self.validate_max_length(self.tag, 'tag', 128)
        if self.phone is not None:
            self.validate_max_length(self.phone, 'phone', 32)
        if self.from_city is not None:
            self.validate_max_length(self.from_city, 'from_city', 128)
        if self.to_city is not None:
            self.validate_max_length(self.to_city, 'to_city', 128)
        if self.biz_content is not None:
            self.validate_max_length(self.biz_content, 'biz_content', 1000)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.mail_no is not None:
            result['mail_no'] = self.mail_no
        if self.cp_code is not None:
            result['cp_code'] = self.cp_code
        if self.tag is not None:
            result['tag'] = self.tag
        if self.phone is not None:
            result['phone'] = self.phone
        if self.from_city is not None:
            result['from_city'] = self.from_city
        if self.to_city is not None:
            result['to_city'] = self.to_city
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('mail_no') is not None:
            self.mail_no = m.get('mail_no')
        if m.get('cp_code') is not None:
            self.cp_code = m.get('cp_code')
        if m.get('tag') is not None:
            self.tag = m.get('tag')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('from_city') is not None:
            self.from_city = m.get('from_city')
        if m.get('to_city') is not None:
            self.to_city = m.get('to_city')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class SubmitDrrdataSubscriptionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务状态
        self.status = status
        # 返回业务参数
        self.biz_result = biz_result

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
        if self.status is not None:
            result['status'] = self.status
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class ReceiveDrrdataTrackRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        biz_type: str = None,
        biz_content: str = None,
        request_id: str = None,
        mail_no: str = None,
        cp_code: str = None,
        tag: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 业务类型
        self.biz_type = biz_type
        # 业务数据
        self.biz_content = biz_content
        # 请求id
        self.request_id = request_id
        # 运单
        self.mail_no = mail_no
        # 快递公司编码
        self.cp_code = cp_code
        # 自定义标签
        self.tag = tag

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.mail_no, 'mail_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.mail_no is not None:
            result['mail_no'] = self.mail_no
        if self.cp_code is not None:
            result['cp_code'] = self.cp_code
        if self.tag is not None:
            result['tag'] = self.tag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('mail_no') is not None:
            self.mail_no = m.get('mail_no')
        if m.get('cp_code') is not None:
            self.cp_code = m.get('cp_code')
        if m.get('tag') is not None:
            self.tag = m.get('tag')
        return self


class ReceiveDrrdataTrackResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务结果数据
        self.biz_result = biz_result
        # 状态
        self.status = status

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        if self.status is not None:
            result['status'] = self.status
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
            self.biz_result = m.get('biz_result')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class QueryDrrdataRiafdRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        trade_no: str = None,
        biz_source: str = None,
        reverse_mail_no: str = None,
        reverse_cp_code: str = None,
        reverse_relate_platform: str = None,
        reverse_receiver_phone: str = None,
        reverse_sender_phone: str = None,
        apply_return_time: str = None,
        claim_processing_time: str = None,
        forward_mail_no: str = None,
        forward_cp_code: str = None,
        forward_relate_platform: str = None,
        forward_receiver_phone: str = None,
        forward_sender_phone: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 业务流水号 需唯一， 格式：日期_客户标识_序列号
        self.trade_no = trade_no
        # 请求来源  国泰-GT
        self.biz_source = biz_source
        # 逆向物流单号
        self.reverse_mail_no = reverse_mail_no
        # 逆向物流快递公司代码
        self.reverse_cp_code = reverse_cp_code
        # 逆向物流关联的电商平台
        self.reverse_relate_platform = reverse_relate_platform
        # 逆向收件人电话后四位
        self.reverse_receiver_phone = reverse_receiver_phone
        # 逆向寄件人电话后四位
        self.reverse_sender_phone = reverse_sender_phone
        # 申请退货时间 格式：yyyy-MM-dd HH:mm:ss
        self.apply_return_time = apply_return_time
        # 申请理赔时间 格式：yyyy-MM-dd HH:mm:ss
        self.claim_processing_time = claim_processing_time
        # 正向物流单号
        self.forward_mail_no = forward_mail_no
        # 正向物流快递公司代码
        self.forward_cp_code = forward_cp_code
        # 正向物流关联的电商平台
        self.forward_relate_platform = forward_relate_platform
        # 正向收件人电话后四位
        self.forward_receiver_phone = forward_receiver_phone
        # 正向寄件人电话后四位
        self.forward_sender_phone = forward_sender_phone

    def validate(self):
        self.validate_required(self.trade_no, 'trade_no')
        self.validate_required(self.biz_source, 'biz_source')
        self.validate_required(self.reverse_mail_no, 'reverse_mail_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        if self.biz_source is not None:
            result['biz_source'] = self.biz_source
        if self.reverse_mail_no is not None:
            result['reverse_mail_no'] = self.reverse_mail_no
        if self.reverse_cp_code is not None:
            result['reverse_cp_code'] = self.reverse_cp_code
        if self.reverse_relate_platform is not None:
            result['reverse_relate_platform'] = self.reverse_relate_platform
        if self.reverse_receiver_phone is not None:
            result['reverse_receiver_phone'] = self.reverse_receiver_phone
        if self.reverse_sender_phone is not None:
            result['reverse_sender_phone'] = self.reverse_sender_phone
        if self.apply_return_time is not None:
            result['apply_return_time'] = self.apply_return_time
        if self.claim_processing_time is not None:
            result['claim_processing_time'] = self.claim_processing_time
        if self.forward_mail_no is not None:
            result['forward_mail_no'] = self.forward_mail_no
        if self.forward_cp_code is not None:
            result['forward_cp_code'] = self.forward_cp_code
        if self.forward_relate_platform is not None:
            result['forward_relate_platform'] = self.forward_relate_platform
        if self.forward_receiver_phone is not None:
            result['forward_receiver_phone'] = self.forward_receiver_phone
        if self.forward_sender_phone is not None:
            result['forward_sender_phone'] = self.forward_sender_phone
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        if m.get('biz_source') is not None:
            self.biz_source = m.get('biz_source')
        if m.get('reverse_mail_no') is not None:
            self.reverse_mail_no = m.get('reverse_mail_no')
        if m.get('reverse_cp_code') is not None:
            self.reverse_cp_code = m.get('reverse_cp_code')
        if m.get('reverse_relate_platform') is not None:
            self.reverse_relate_platform = m.get('reverse_relate_platform')
        if m.get('reverse_receiver_phone') is not None:
            self.reverse_receiver_phone = m.get('reverse_receiver_phone')
        if m.get('reverse_sender_phone') is not None:
            self.reverse_sender_phone = m.get('reverse_sender_phone')
        if m.get('apply_return_time') is not None:
            self.apply_return_time = m.get('apply_return_time')
        if m.get('claim_processing_time') is not None:
            self.claim_processing_time = m.get('claim_processing_time')
        if m.get('forward_mail_no') is not None:
            self.forward_mail_no = m.get('forward_mail_no')
        if m.get('forward_cp_code') is not None:
            self.forward_cp_code = m.get('forward_cp_code')
        if m.get('forward_relate_platform') is not None:
            self.forward_relate_platform = m.get('forward_relate_platform')
        if m.get('forward_receiver_phone') is not None:
            self.forward_receiver_phone = m.get('forward_receiver_phone')
        if m.get('forward_sender_phone') is not None:
            self.forward_sender_phone = m.get('forward_sender_phone')
        return self


class QueryDrrdataRiafdResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 反欺诈业务查询结果，json格式
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
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
            self.biz_result = m.get('biz_result')
        return self


class ExecMultimodalDataprodRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        biz_content: str = None,
        product_code: str = None,
        request_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 文件唯一id
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 业务入参的json字符串
        self.biz_content = biz_content
        # 数据产品编码
        self.product_code = product_code
        # 请求唯一标识
        self.request_id = request_id

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.request_id, 'request_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class ExecMultimodalDataprodResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务返回值json
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
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
            self.biz_result = m.get('biz_result')
        return self


class NotifyMultimodalDataprodRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        biz_content: str = None,
        request_id: str = None,
        biz_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 通知具体json内容
        self.biz_content = biz_content
        # 唯一请求id
        self.request_id = request_id
        # 业务标识
        self.biz_no = biz_no

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.biz_no, 'biz_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        return self


class NotifyMultimodalDataprodResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg

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
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        return self


class QueryDatapromotionDecisionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        insurer_code: str = None,
        insurance_type: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 保司编码
        self.insurer_code = insurer_code
        # 保险险种
        self.insurance_type = insurance_type
        # 业务参数内容JSON字符串
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.insurer_code, 'insurer_code')
        self.validate_required(self.insurance_type, 'insurance_type')
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.insurer_code is not None:
            result['insurer_code'] = self.insurer_code
        if self.insurance_type is not None:
            result['insurance_type'] = self.insurance_type
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('insurer_code') is not None:
            self.insurer_code = m.get('insurer_code')
        if m.get('insurance_type') is not None:
            self.insurance_type = m.get('insurance_type')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class QueryDatapromotionDecisionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务出参JSON字符串
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
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
            self.biz_result = m.get('biz_result')
        return self


class PushDatapromotionTrafficRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        insurer_code: str = None,
        insurance_type: str = None,
        biz_content: str = None,
        push_data_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 保险险种
        self.insurer_code = insurer_code
        # 保险险种
        self.insurance_type = insurance_type
        # 业务参数内容JSON字符串
        self.biz_content = biz_content
        # 协议签署：USER_SIGN_INFO;；
        # 车辆信息上报：CAR_INFO；
        self.push_data_type = push_data_type

    def validate(self):
        self.validate_required(self.insurer_code, 'insurer_code')
        self.validate_required(self.insurance_type, 'insurance_type')
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.push_data_type, 'push_data_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.insurer_code is not None:
            result['insurer_code'] = self.insurer_code
        if self.insurance_type is not None:
            result['insurance_type'] = self.insurance_type
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.push_data_type is not None:
            result['push_data_type'] = self.push_data_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('insurer_code') is not None:
            self.insurer_code = m.get('insurer_code')
        if m.get('insurance_type') is not None:
            self.insurance_type = m.get('insurance_type')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('push_data_type') is not None:
            self.push_data_type = m.get('push_data_type')
        return self


class PushDatapromotionTrafficResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # {}
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
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
            self.biz_result = m.get('biz_result')
        return self


class CreateAntcloudGatewayxFileUploadRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        api_code: str = None,
        file_label: str = None,
        file_metadata: str = None,
        file_name: str = None,
        mime_type: str = None,
        api_cluster: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 上传文件作用的openapi method
        self.api_code = api_code
        # 文件标签，多个标签;分割
        self.file_label = file_label
        # 自定义的文件元数据
        self.file_metadata = file_metadata
        # 文件名，不传则随机生成文件名
        self.file_name = file_name
        # 文件的多媒体类型
        self.mime_type = mime_type
        # 产品方的api归属集群，即productInstanceId
        self.api_cluster = api_cluster

    def validate(self):
        self.validate_required(self.api_code, 'api_code')
        if self.file_label is not None:
            self.validate_max_length(self.file_label, 'file_label', 100)
        if self.file_metadata is not None:
            self.validate_max_length(self.file_metadata, 'file_metadata', 1000)
        if self.file_name is not None:
            self.validate_max_length(self.file_name, 'file_name', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.api_code is not None:
            result['api_code'] = self.api_code
        if self.file_label is not None:
            result['file_label'] = self.file_label
        if self.file_metadata is not None:
            result['file_metadata'] = self.file_metadata
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.mime_type is not None:
            result['mime_type'] = self.mime_type
        if self.api_cluster is not None:
            result['api_cluster'] = self.api_cluster
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('api_code') is not None:
            self.api_code = m.get('api_code')
        if m.get('file_label') is not None:
            self.file_label = m.get('file_label')
        if m.get('file_metadata') is not None:
            self.file_metadata = m.get('file_metadata')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('mime_type') is not None:
            self.mime_type = m.get('mime_type')
        if m.get('api_cluster') is not None:
            self.api_cluster = m.get('api_cluster')
        return self


class CreateAntcloudGatewayxFileUploadResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        expired_time: str = None,
        file_id: str = None,
        upload_headers: List[XNameValuePair] = None,
        upload_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 上传有效期
        self.expired_time = expired_time
        # 32位文件唯一id
        self.file_id = file_id
        # 放入http请求头里
        self.upload_headers = upload_headers
        # 文件上传地址
        self.upload_url = upload_url

    def validate(self):
        if self.expired_time is not None:
            self.validate_pattern(self.expired_time, 'expired_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.upload_headers:
            for k in self.upload_headers:
                if k:
                    k.validate()

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
        if self.expired_time is not None:
            result['expired_time'] = self.expired_time
        if self.file_id is not None:
            result['file_id'] = self.file_id
        result['upload_headers'] = []
        if self.upload_headers is not None:
            for k in self.upload_headers:
                result['upload_headers'].append(k.to_map() if k else None)
        if self.upload_url is not None:
            result['upload_url'] = self.upload_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('expired_time') is not None:
            self.expired_time = m.get('expired_time')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        self.upload_headers = []
        if m.get('upload_headers') is not None:
            for k in m.get('upload_headers'):
                temp_model = XNameValuePair()
                self.upload_headers.append(temp_model.from_map(k))
        if m.get('upload_url') is not None:
            self.upload_url = m.get('upload_url')
        return self


