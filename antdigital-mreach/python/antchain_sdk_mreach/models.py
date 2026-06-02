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


class SmsSendDetail(TeaModel):
    def __init__(
        self,
        err_code: str = None,
        receive_date: str = None,
        send_date: str = None,
        phone_number: str = None,
        content: str = None,
        template_id: str = None,
        status: int = None,
    ):
        # 错误码
        self.err_code = err_code
        # 接受日期
        self.receive_date = receive_date
        # 发送日期
        self.send_date = send_date
        # 接收短信的手机号码
        self.phone_number = phone_number
        # 短信内容
        self.content = content
        # 模板id
        self.template_id = template_id
        # 短信发送状态：1-等待回执，2-发送失败，3-发送成功。
        self.status = status

    def validate(self):
        self.validate_required(self.err_code, 'err_code')
        self.validate_required(self.receive_date, 'receive_date')
        self.validate_required(self.send_date, 'send_date')
        self.validate_required(self.phone_number, 'phone_number')
        self.validate_required(self.content, 'content')
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.err_code is not None:
            result['err_code'] = self.err_code
        if self.receive_date is not None:
            result['receive_date'] = self.receive_date
        if self.send_date is not None:
            result['send_date'] = self.send_date
        if self.phone_number is not None:
            result['phone_number'] = self.phone_number
        if self.content is not None:
            result['content'] = self.content
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('err_code') is not None:
            self.err_code = m.get('err_code')
        if m.get('receive_date') is not None:
            self.receive_date = m.get('receive_date')
        if m.get('send_date') is not None:
            self.send_date = m.get('send_date')
        if m.get('phone_number') is not None:
            self.phone_number = m.get('phone_number')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class CradSmsSendDetail(TeaModel):
    def __init__(
        self,
        message_id: str = None,
        phone_number: str = None,
        template_id: str = None,
        final_receive_type: str = None,
        status: int = None,
        error_code: str = None,
        error_message: str = None,
        report_time: str = None,
        content: str = None,
    ):
        # 消息ID
        self.message_id = message_id
        # 接收手机号
        self.phone_number = phone_number
        # 卡片短信模板ID
        self.template_id = template_id
        # 最终接收类型: CARD_SMS-卡片短信送达, SMS-回落为普通短信送达。
        self.final_receive_type = final_receive_type
        # 短信发送状态。1-等待回执，2-发送失败，3-发送成功。
        self.status = status
        # 错误码（发送失败时返回）
        self.error_code = error_code
        # 错误描述（发送失败时返回）
        self.error_message = error_message
        # 回执时间,yyyy-MM-dd HH:mm:ss格式
        self.report_time = report_time
        # 回落短信正文（仅 finalReceiveType=SMS 时有值）
        self.content = content

    def validate(self):
        self.validate_required(self.message_id, 'message_id')
        self.validate_required(self.phone_number, 'phone_number')
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.final_receive_type, 'final_receive_type')
        self.validate_required(self.status, 'status')
        self.validate_required(self.error_code, 'error_code')
        self.validate_required(self.error_message, 'error_message')
        self.validate_required(self.report_time, 'report_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.message_id is not None:
            result['message_id'] = self.message_id
        if self.phone_number is not None:
            result['phone_number'] = self.phone_number
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.final_receive_type is not None:
            result['final_receive_type'] = self.final_receive_type
        if self.status is not None:
            result['status'] = self.status
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.report_time is not None:
            result['report_time'] = self.report_time
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        if m.get('phone_number') is not None:
            self.phone_number = m.get('phone_number')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('final_receive_type') is not None:
            self.final_receive_type = m.get('final_receive_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('report_time') is not None:
            self.report_time = m.get('report_time')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class PushSmsDomesticRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        phone_numbers: List[str] = None,
        template_id: str = None,
        sign_name: str = None,
        template_params: str = None,
        extra_params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务流水号，最长64字符
        self.biz_id = biz_id
        # 接收手机号列表
        self.phone_numbers = phone_numbers
        # 模板ID
        self.template_id = template_id
        # 短信签名
        self.sign_name = sign_name
        # 模板参数
        self.template_params = template_params
        # 扩展参数
        self.extra_params = extra_params

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.phone_numbers, 'phone_numbers')
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.sign_name, 'sign_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.phone_numbers is not None:
            result['phone_numbers'] = self.phone_numbers
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.sign_name is not None:
            result['sign_name'] = self.sign_name
        if self.template_params is not None:
            result['template_params'] = self.template_params
        if self.extra_params is not None:
            result['extra_params'] = self.extra_params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('phone_numbers') is not None:
            self.phone_numbers = m.get('phone_numbers')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('sign_name') is not None:
            self.sign_name = m.get('sign_name')
        if m.get('template_params') is not None:
            self.template_params = m.get('template_params')
        if m.get('extra_params') is not None:
            self.extra_params = m.get('extra_params')
        return self


class PushSmsDomesticResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        message_id: str = None,
        status: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 消息id
        self.message_id = message_id
        # 短信发送状态。1-等待回执，2-发送失败，3-发送成功。
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
        if self.message_id is not None:
            result['message_id'] = self.message_id
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
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class QuerySmsDomesticRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        message_id: str = None,
        phone_number: str = None,
        send_date: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 消息id
        self.message_id = message_id
        # 接收短信的手机号码
        self.phone_number = phone_number
        # 短信发送日期，支持查询最近 30 天的记录。格式：yyyyMMdd。
        self.send_date = send_date

    def validate(self):
        self.validate_required(self.message_id, 'message_id')
        self.validate_required(self.send_date, 'send_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.message_id is not None:
            result['message_id'] = self.message_id
        if self.phone_number is not None:
            result['phone_number'] = self.phone_number
        if self.send_date is not None:
            result['send_date'] = self.send_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        if m.get('phone_number') is not None:
            self.phone_number = m.get('phone_number')
        if m.get('send_date') is not None:
            self.send_date = m.get('send_date')
        return self


class QuerySmsDomesticResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        send_datals: List[SmsSendDetail] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 短信发送详情
        self.send_datals = send_datals

    def validate(self):
        if self.send_datals:
            for k in self.send_datals:
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
        result['send_datals'] = []
        if self.send_datals is not None:
            for k in self.send_datals:
                result['send_datals'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.send_datals = []
        if m.get('send_datals') is not None:
            for k in m.get('send_datals'):
                temp_model = SmsSendDetail()
                self.send_datals.append(temp_model.from_map(k))
        return self


class PushCardsmsDomesticRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_id: str = None,
        phone_numbers: List[str] = None,
        template_id: str = None,
        sign_name: str = None,
        card_params: str = None,
        fallback_type: str = None,
        fallback_template_id: str = None,
        fallback_params: str = None,
        custom_url: str = None,
        extra_params: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务流水号，最长64字符
        self.biz_id = biz_id
        # 接收手机号列表
        self.phone_numbers = phone_numbers
        # 卡片短信模版ID
        self.template_id = template_id
        # 卡片短信签名
        self.sign_name = sign_name
        # 卡片动参
        self.card_params = card_params
        # 回落类型: SMS-回落为普通短信, NONE-不回落。
        self.fallback_type = fallback_type
        # 回落普通短信的平台模板编码。
        self.fallback_template_id = fallback_template_id
        # 回落普通短信的模板参数，键值对形式Str
        self.fallback_params = fallback_params
        # 卡片短信渲染失败后跳转链接
        self.custom_url = custom_url
        # 扩展参数
        self.extra_params = extra_params

    def validate(self):
        self.validate_required(self.biz_id, 'biz_id')
        self.validate_required(self.phone_numbers, 'phone_numbers')
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.sign_name, 'sign_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.phone_numbers is not None:
            result['phone_numbers'] = self.phone_numbers
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.sign_name is not None:
            result['sign_name'] = self.sign_name
        if self.card_params is not None:
            result['card_params'] = self.card_params
        if self.fallback_type is not None:
            result['fallback_type'] = self.fallback_type
        if self.fallback_template_id is not None:
            result['fallback_template_id'] = self.fallback_template_id
        if self.fallback_params is not None:
            result['fallback_params'] = self.fallback_params
        if self.custom_url is not None:
            result['custom_url'] = self.custom_url
        if self.extra_params is not None:
            result['extra_params'] = self.extra_params
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('phone_numbers') is not None:
            self.phone_numbers = m.get('phone_numbers')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('sign_name') is not None:
            self.sign_name = m.get('sign_name')
        if m.get('card_params') is not None:
            self.card_params = m.get('card_params')
        if m.get('fallback_type') is not None:
            self.fallback_type = m.get('fallback_type')
        if m.get('fallback_template_id') is not None:
            self.fallback_template_id = m.get('fallback_template_id')
        if m.get('fallback_params') is not None:
            self.fallback_params = m.get('fallback_params')
        if m.get('custom_url') is not None:
            self.custom_url = m.get('custom_url')
        if m.get('extra_params') is not None:
            self.extra_params = m.get('extra_params')
        return self


class PushCardsmsDomesticResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        message_id: str = None,
        status: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 卡片消息ID
        self.message_id = message_id
        # 短信发送状态。1-等待回执，2-发送失败，3-发送成功。
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
        if self.message_id is not None:
            result['message_id'] = self.message_id
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
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class QueryCardsmsDomesticRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        message_id: str = None,
        phone_number: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 消息ID
        self.message_id = message_id
        # 接收短信的手机号码
        self.phone_number = phone_number

    def validate(self):
        self.validate_required(self.message_id, 'message_id')
        self.validate_required(self.phone_number, 'phone_number')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.message_id is not None:
            result['message_id'] = self.message_id
        if self.phone_number is not None:
            result['phone_number'] = self.phone_number
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('message_id') is not None:
            self.message_id = m.get('message_id')
        if m.get('phone_number') is not None:
            self.phone_number = m.get('phone_number')
        return self


class QueryCardsmsDomesticResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        send_datals: List[CradSmsSendDetail] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 短信发送详情
        self.send_datals = send_datals

    def validate(self):
        if self.send_datals:
            for k in self.send_datals:
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
        result['send_datals'] = []
        if self.send_datals is not None:
            for k in self.send_datals:
                result['send_datals'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.send_datals = []
        if m.get('send_datals') is not None:
            for k in m.get('send_datals'):
                temp_model = CradSmsSendDetail()
                self.send_datals.append(temp_model.from_map(k))
        return self


