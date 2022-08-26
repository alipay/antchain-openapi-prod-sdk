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


class AuthBlockchainTaxIcmInvoiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_id: str = None,
        nsrsbh: str = None,
        corp_name: str = None,
        identity_number: str = None,
        cognizant_mobile: str = None,
        cognizant_name: str = None,
        biz_context: str = None,
        auth_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
        self.request_id = request_id
        # 查询的企业纳税人识别号
        # 
        self.nsrsbh = nsrsbh
        # 企业名称
        self.corp_name = corp_name
        # 身份证号
        self.identity_number = identity_number
        # 已认证的法人手机号
        self.cognizant_mobile = cognizant_mobile
        # 已认证的法人姓名
        self.cognizant_name = cognizant_name
        # 透传字段
        self.biz_context = biz_context
        # 授权业务类型
        self.auth_type = auth_type

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.nsrsbh, 'nsrsbh')
        self.validate_required(self.corp_name, 'corp_name')
        self.validate_required(self.identity_number, 'identity_number')
        self.validate_required(self.cognizant_mobile, 'cognizant_mobile')
        self.validate_required(self.cognizant_name, 'cognizant_name')
        self.validate_required(self.auth_type, 'auth_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.nsrsbh is not None:
            result['nsrsbh'] = self.nsrsbh
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.identity_number is not None:
            result['identity_number'] = self.identity_number
        if self.cognizant_mobile is not None:
            result['cognizant_mobile'] = self.cognizant_mobile
        if self.cognizant_name is not None:
            result['cognizant_name'] = self.cognizant_name
        if self.biz_context is not None:
            result['biz_context'] = self.biz_context
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('nsrsbh') is not None:
            self.nsrsbh = m.get('nsrsbh')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('identity_number') is not None:
            self.identity_number = m.get('identity_number')
        if m.get('cognizant_mobile') is not None:
            self.cognizant_mobile = m.get('cognizant_mobile')
        if m.get('cognizant_name') is not None:
            self.cognizant_name = m.get('cognizant_name')
        if m.get('biz_context') is not None:
            self.biz_context = m.get('biz_context')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        return self


class AuthBlockchainTaxIcmInvoiceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: str = None,
        biz_context: str = None,
        nsrsbh: str = None,
        expired_time: str = None,
        request_id: str = None,
        error_code: str = None,
        error_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权是否成功：true：成功 false：失败
        self.success = success
        # 透传字段
        self.biz_context = biz_context
        # 纳税人识别号
        self.nsrsbh = nsrsbh
        # 过期时间
        self.expired_time = expired_time
        # 业务请求id
        self.request_id = request_id
        # 错误码
        self.error_code = error_code
        # 错误信息
        self.error_msg = error_msg

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
        if self.success is not None:
            result['success'] = self.success
        if self.biz_context is not None:
            result['biz_context'] = self.biz_context
        if self.nsrsbh is not None:
            result['nsrsbh'] = self.nsrsbh
        if self.expired_time is not None:
            result['expired_time'] = self.expired_time
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
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
        if m.get('biz_context') is not None:
            self.biz_context = m.get('biz_context')
        if m.get('nsrsbh') is not None:
            self.nsrsbh = m.get('nsrsbh')
        if m.get('expired_time') is not None:
            self.expired_time = m.get('expired_time')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class QueryBlockchainTaxIcmInvoiceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        app_id: str = None,
        auth_type: str = None,
        callback_url: str = None,
        end_amount: int = None,
        end_date: str = None,
        invoice_type: str = None,
        nsrsbh: str = None,
        request_id: str = None,
        start_amount: int = None,
        start_date: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # ISV名称，用于标识合作的企业
        self.app_id = app_id
        # 授权类型
        # 01:发票归集授权; 02:记账; 03:报销; 11:发票贷授权; （0X发票相关授权，1X金融类授权）
        self.auth_type = auth_type
        # 数据通知地址接口 (当type=02或者03时必填) 用于数据采集完毕后通知该接口如何取发票数据
        # 
        self.callback_url = callback_url
        # java long型
        # 起始金额，当type=03（报销查询）时必填
        self.end_amount = end_amount
        # 查询起始时间(当auth_type=02或者03时必填)
        # 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
        # 最大查询范围为6.1-6.30
        self.end_date = end_date
        # 非必填，不填则查询所有类型发票
        # "01": "增值税专用发票"
        # "04": "增值税普通发票"
        # "10": "增值税电子普通发票"
        self.invoice_type = invoice_type
        # 查询的企业纳税人识别号
        self.nsrsbh = nsrsbh
        # 请求号，调用方企业保证每次调用唯一，蚂蚁发票平台通过该字段和app_id两个字段做幂等判断
        self.request_id = request_id
        # java long型
        # 起始金额，当type=03（报销查询）时必填
        self.start_amount = start_amount
        # 查询起始时间(当auth_type=02或者03时必填)
        # 当auth_type=02(记账查询)时，查询起始时间和查询截止时间必须在同一个月内，如查询起始日期是6.31，截止日期为7.1，则会提示查询时间不能跨月，最长时间为一个月
        # 最大查询范围为6.1-6.30
        self.start_date = start_date

    def validate(self):
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.auth_type, 'auth_type')
        if self.end_date is not None:
            self.validate_pattern(self.end_date, 'end_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.nsrsbh, 'nsrsbh')
        self.validate_required(self.request_id, 'request_id')
        if self.start_date is not None:
            self.validate_pattern(self.start_date, 'start_date', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        if self.callback_url is not None:
            result['callback_url'] = self.callback_url
        if self.end_amount is not None:
            result['end_amount'] = self.end_amount
        if self.end_date is not None:
            result['end_date'] = self.end_date
        if self.invoice_type is not None:
            result['invoice_type'] = self.invoice_type
        if self.nsrsbh is not None:
            result['nsrsbh'] = self.nsrsbh
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.start_amount is not None:
            result['start_amount'] = self.start_amount
        if self.start_date is not None:
            result['start_date'] = self.start_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        if m.get('callback_url') is not None:
            self.callback_url = m.get('callback_url')
        if m.get('end_amount') is not None:
            self.end_amount = m.get('end_amount')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        if m.get('invoice_type') is not None:
            self.invoice_type = m.get('invoice_type')
        if m.get('nsrsbh') is not None:
            self.nsrsbh = m.get('nsrsbh')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('start_amount') is not None:
            self.start_amount = m.get('start_amount')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        return self


class QueryBlockchainTaxIcmInvoiceResponse(TeaModel):
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


