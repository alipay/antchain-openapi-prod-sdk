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


class FileInfo(TeaModel):
    def __init__(
        self,
        file_name: str = None,
        file_key: str = None,
    ):
        # 文件名称
        self.file_name = file_name
        # 文件key
        self.file_key = file_key

    def validate(self):
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_key, 'file_key')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_key is not None:
            result['file_key'] = self.file_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        return self


class CompanyInfo(TeaModel):
    def __init__(
        self,
        business_license_file: FileInfo = None,
        product_main_class: str = None,
        company_name: str = None,
        company_alias_name: str = None,
        tenant_id: str = None,
        merchant_id: str = None,
        company_mobile: str = None,
        company_address: str = None,
        contact_name: str = None,
        contact_mobile: str = None,
        bind_alipay_no: str = None,
        settle_alipay_no: str = None,
        bind_alipay_uid: str = None,
    ):
        # 营业执照文件信息
        self.business_license_file = business_license_file
        # 业务类型 枚举
        self.product_main_class = product_main_class
        # 公司名称
        self.company_name = company_name
        # 公司别名
        self.company_alias_name = company_alias_name
        # 公司数科租户id
        self.tenant_id = tenant_id
        # 统一社会信用代码
        self.merchant_id = merchant_id
        # 公司联系电话
        self.company_mobile = company_mobile
        # 公司联系地址
        self.company_address = company_address
        # 联系人姓名
        self.contact_name = contact_name
        # 联系人手机号码
        self.contact_mobile = contact_mobile
        # 绑定企业支付宝账号
        self.bind_alipay_no = bind_alipay_no
        # 结算企业支付宝账号
        self.settle_alipay_no = settle_alipay_no
        # 绑定支付宝uid
        self.bind_alipay_uid = bind_alipay_uid

    def validate(self):
        self.validate_required(self.business_license_file, 'business_license_file')
        if self.business_license_file:
            self.business_license_file.validate()
        self.validate_required(self.product_main_class, 'product_main_class')
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.company_alias_name, 'company_alias_name')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.company_mobile, 'company_mobile')
        self.validate_required(self.company_address, 'company_address')
        self.validate_required(self.contact_name, 'contact_name')
        self.validate_required(self.contact_mobile, 'contact_mobile')
        self.validate_required(self.bind_alipay_no, 'bind_alipay_no')
        self.validate_required(self.settle_alipay_no, 'settle_alipay_no')
        self.validate_required(self.bind_alipay_uid, 'bind_alipay_uid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.business_license_file is not None:
            result['business_license_file'] = self.business_license_file.to_map()
        if self.product_main_class is not None:
            result['product_main_class'] = self.product_main_class
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.company_alias_name is not None:
            result['company_alias_name'] = self.company_alias_name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.company_mobile is not None:
            result['company_mobile'] = self.company_mobile
        if self.company_address is not None:
            result['company_address'] = self.company_address
        if self.contact_name is not None:
            result['contact_name'] = self.contact_name
        if self.contact_mobile is not None:
            result['contact_mobile'] = self.contact_mobile
        if self.bind_alipay_no is not None:
            result['bind_alipay_no'] = self.bind_alipay_no
        if self.settle_alipay_no is not None:
            result['settle_alipay_no'] = self.settle_alipay_no
        if self.bind_alipay_uid is not None:
            result['bind_alipay_uid'] = self.bind_alipay_uid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('business_license_file') is not None:
            temp_model = FileInfo()
            self.business_license_file = temp_model.from_map(m['business_license_file'])
        if m.get('product_main_class') is not None:
            self.product_main_class = m.get('product_main_class')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('company_alias_name') is not None:
            self.company_alias_name = m.get('company_alias_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('company_mobile') is not None:
            self.company_mobile = m.get('company_mobile')
        if m.get('company_address') is not None:
            self.company_address = m.get('company_address')
        if m.get('contact_name') is not None:
            self.contact_name = m.get('contact_name')
        if m.get('contact_mobile') is not None:
            self.contact_mobile = m.get('contact_mobile')
        if m.get('bind_alipay_no') is not None:
            self.bind_alipay_no = m.get('bind_alipay_no')
        if m.get('settle_alipay_no') is not None:
            self.settle_alipay_no = m.get('settle_alipay_no')
        if m.get('bind_alipay_uid') is not None:
            self.bind_alipay_uid = m.get('bind_alipay_uid')
        return self


class ActivePayOrder(TeaModel):
    def __init__(
        self,
        trade_no: str = None,
        trade_status: str = None,
        status_reason_code: str = None,
        status_reason_msg: str = None,
        total_amount: int = None,
        paid_amount: int = None,
        receipt_amount: int = None,
        gmt_pay: str = None,
    ):
        # 支付宝支付订单号，用于拉起主动支付页面
        self.trade_no = trade_no
        # 状态
        # INIT：交易创建
        # FAILED：付款失败
        # SUCCESS：付款成功
        self.trade_status = trade_status
        # 状态原因码
        self.status_reason_code = status_reason_code
        # 超时关闭
        self.status_reason_msg = status_reason_msg
        # 本次交易支付的订单金额，单位为分
        # 付款成功或付款成功之后的状态必填
        self.total_amount = total_amount
        # 用户在交易中支付的金额，单位为分
        # 付款成功的状态必填
        self.paid_amount = paid_amount
        # 商家在交易中实际收到的款项，单位为分
        # 付款成功的状态必填
        self.receipt_amount = receipt_amount
        # 交易支付时间
        # 付款成功的状态必填
        self.gmt_pay = gmt_pay

    def validate(self):
        self.validate_required(self.trade_no, 'trade_no')
        if self.trade_no is not None:
            self.validate_max_length(self.trade_no, 'trade_no', 64)
        self.validate_required(self.trade_status, 'trade_status')
        if self.trade_status is not None:
            self.validate_max_length(self.trade_status, 'trade_status', 64)
        if self.total_amount is not None:
            self.validate_minimum(self.total_amount, 'total_amount', 1)
        if self.paid_amount is not None:
            self.validate_minimum(self.paid_amount, 'paid_amount', 1)
        if self.receipt_amount is not None:
            self.validate_minimum(self.receipt_amount, 'receipt_amount', 1)
        if self.gmt_pay is not None:
            self.validate_pattern(self.gmt_pay, 'gmt_pay', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        if self.trade_status is not None:
            result['trade_status'] = self.trade_status
        if self.status_reason_code is not None:
            result['status_reason_code'] = self.status_reason_code
        if self.status_reason_msg is not None:
            result['status_reason_msg'] = self.status_reason_msg
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.paid_amount is not None:
            result['paid_amount'] = self.paid_amount
        if self.receipt_amount is not None:
            result['receipt_amount'] = self.receipt_amount
        if self.gmt_pay is not None:
            result['gmt_pay'] = self.gmt_pay
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        if m.get('trade_status') is not None:
            self.trade_status = m.get('trade_status')
        if m.get('status_reason_code') is not None:
            self.status_reason_code = m.get('status_reason_code')
        if m.get('status_reason_msg') is not None:
            self.status_reason_msg = m.get('status_reason_msg')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('paid_amount') is not None:
            self.paid_amount = m.get('paid_amount')
        if m.get('receipt_amount') is not None:
            self.receipt_amount = m.get('receipt_amount')
        if m.get('gmt_pay') is not None:
            self.gmt_pay = m.get('gmt_pay')
        return self


class ApplicationInfo(TeaModel):
    def __init__(
        self,
        application_scene: str = None,
        tiny_app_id: str = None,
        site_name: str = None,
        sit_url: str = None,
        merchant_name: str = None,
        merchant_service_name: str = None,
        merchant_service_desc: str = None,
    ):
        # 应用场景
        # MINI_APP 小程序
        # APP 自有app
        # ALL 两种都有
        self.application_scene = application_scene
        # 小程序id
        self.tiny_app_id = tiny_app_id
        # 小程序名称
        self.site_name = site_name
        # 网站地址
        self.sit_url = sit_url
        # 商户名称
        self.merchant_name = merchant_name
        # 商户服务名称
        self.merchant_service_name = merchant_service_name
        # 商户服务描述
        self.merchant_service_desc = merchant_service_desc

    def validate(self):
        self.validate_required(self.application_scene, 'application_scene')
        self.validate_required(self.tiny_app_id, 'tiny_app_id')
        self.validate_required(self.site_name, 'site_name')
        self.validate_required(self.sit_url, 'sit_url')
        self.validate_required(self.merchant_name, 'merchant_name')
        self.validate_required(self.merchant_service_name, 'merchant_service_name')
        self.validate_required(self.merchant_service_desc, 'merchant_service_desc')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.application_scene is not None:
            result['application_scene'] = self.application_scene
        if self.tiny_app_id is not None:
            result['tiny_app_id'] = self.tiny_app_id
        if self.site_name is not None:
            result['site_name'] = self.site_name
        if self.sit_url is not None:
            result['sit_url'] = self.sit_url
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.merchant_service_name is not None:
            result['merchant_service_name'] = self.merchant_service_name
        if self.merchant_service_desc is not None:
            result['merchant_service_desc'] = self.merchant_service_desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('application_scene') is not None:
            self.application_scene = m.get('application_scene')
        if m.get('tiny_app_id') is not None:
            self.tiny_app_id = m.get('tiny_app_id')
        if m.get('site_name') is not None:
            self.site_name = m.get('site_name')
        if m.get('sit_url') is not None:
            self.sit_url = m.get('sit_url')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('merchant_service_name') is not None:
            self.merchant_service_name = m.get('merchant_service_name')
        if m.get('merchant_service_desc') is not None:
            self.merchant_service_desc = m.get('merchant_service_desc')
        return self


class LegalInfo(TeaModel):
    def __init__(
        self,
        legal_name: str = None,
        legal_cert_no: str = None,
        legal_cert_front_file: FileInfo = None,
        legal_cert_back_file: FileInfo = None,
    ):
        # 法人名称
        self.legal_name = legal_name
        # 法人证件号
        self.legal_cert_no = legal_cert_no
        # 法人证件正面
        self.legal_cert_front_file = legal_cert_front_file
        # 法人证件反面
        self.legal_cert_back_file = legal_cert_back_file

    def validate(self):
        self.validate_required(self.legal_name, 'legal_name')
        self.validate_required(self.legal_cert_no, 'legal_cert_no')
        self.validate_required(self.legal_cert_front_file, 'legal_cert_front_file')
        if self.legal_cert_front_file:
            self.legal_cert_front_file.validate()
        self.validate_required(self.legal_cert_back_file, 'legal_cert_back_file')
        if self.legal_cert_back_file:
            self.legal_cert_back_file.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.legal_name is not None:
            result['legal_name'] = self.legal_name
        if self.legal_cert_no is not None:
            result['legal_cert_no'] = self.legal_cert_no
        if self.legal_cert_front_file is not None:
            result['legal_cert_front_file'] = self.legal_cert_front_file.to_map()
        if self.legal_cert_back_file is not None:
            result['legal_cert_back_file'] = self.legal_cert_back_file.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('legal_name') is not None:
            self.legal_name = m.get('legal_name')
        if m.get('legal_cert_no') is not None:
            self.legal_cert_no = m.get('legal_cert_no')
        if m.get('legal_cert_front_file') is not None:
            temp_model = FileInfo()
            self.legal_cert_front_file = temp_model.from_map(m['legal_cert_front_file'])
        if m.get('legal_cert_back_file') is not None:
            temp_model = FileInfo()
            self.legal_cert_back_file = temp_model.from_map(m['legal_cert_back_file'])
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


class SyncAntchainAtoTradeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务字段，具体传入信息需参考文档
        # 传入格式需为json字符串
        self.biz_content = biz_content
        # 接口执行类型
        # 
        self.type = type

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class SyncAntchainAtoTradeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # resp信息
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class GetAntchainAtoTradeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询信息，必须遵循json字符串格式
        self.biz_content = biz_content
        # 接口类型
        self.type = type

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class GetAntchainAtoTradeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回的查询值
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class CreateAntchainAtoRealpersonFacevrfRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cert_name: str = None,
        cert_no: str = None,
        identity_type: str = None,
        cert_type: str = None,
        outer_order_no: str = None,
        return_url: str = None,
        order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 真实姓名
        self.cert_name = cert_name
        # 证件号码
        self.cert_no = cert_no
        # 身份信息来源类型，当前仅支持证件（CERT_INFO）
        self.identity_type = identity_type
        # 证件类型，当前仅支持身份证（IDENTITY_CARD）
        self.cert_type = cert_type
        # 商户请求的唯一标识。
        # 
        # 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID。
        self.outer_order_no = outer_order_no
        # 认证结束回跳地址
        self.return_url = return_url
        # 订单id 长度不可超过50
        self.order_id = order_id

    def validate(self):
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.identity_type, 'identity_type')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.return_url, 'return_url')
        self.validate_required(self.order_id, 'order_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.identity_type is not None:
            result['identity_type'] = self.identity_type
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        if self.return_url is not None:
            result['return_url'] = self.return_url
        if self.order_id is not None:
            result['order_id'] = self.order_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('identity_type') is not None:
            self.identity_type = m.get('identity_type')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('outer_order_no') is not None:
            self.outer_order_no = m.get('outer_order_no')
        if m.get('return_url') is not None:
            self.return_url = m.get('return_url')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        return self


class CreateAntchainAtoRealpersonFacevrfResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务返回字段，JSON格式
        self.data = data

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
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class QueryAntchainAtoRealpersonFacevrfRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        certify_id: str = None,
        outer_order_no: str = None,
        order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 可信实人认证的唯一标识
        self.certify_id = certify_id
        # 商户请求的唯一标识。
        # 
        # 值为 32 位长度的字母数字组合。其中，前面几位字符是商户自定义的简称，中间几位可以使用一段时间，后段可以使用一个随机或递增序列。该值也可以使用 UUID。
        self.outer_order_no = outer_order_no
        # 订单id 长度不可超过50
        self.order_id = order_id

    def validate(self):
        self.validate_required(self.certify_id, 'certify_id')
        self.validate_required(self.outer_order_no, 'outer_order_no')
        self.validate_required(self.order_id, 'order_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.certify_id is not None:
            result['certify_id'] = self.certify_id
        if self.outer_order_no is not None:
            result['outer_order_no'] = self.outer_order_no
        if self.order_id is not None:
            result['order_id'] = self.order_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('certify_id') is not None:
            self.certify_id = m.get('certify_id')
        if m.get('outer_order_no') is not None:
            self.outer_order_no = m.get('outer_order_no')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        return self


class QueryAntchainAtoRealpersonFacevrfResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务返回字段，JSON格式
        self.data = data

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
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class AllAntchainAtoSignTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        contract_type: str = None,
        merchant_id: str = None,
        fund_type: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合同类型，如果不传则返回所有
        self.contract_type = contract_type
        # 商户统一社会信用代码，SIT环境，非融必填
        self.merchant_id = merchant_id
        # ● FINANCE 融资
        # ● NON_FINANCE 非融资
        self.fund_type = fund_type
        # 查询融资类型时，需要传入资方统一社会信用代码
        self.fund_id = fund_id

    def validate(self):
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 42)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.contract_type is not None:
            result['contract_type'] = self.contract_type
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_type is not None:
            result['fund_type'] = self.fund_type
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('contract_type') is not None:
            self.contract_type = m.get('contract_type')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_type') is not None:
            self.fund_type = m.get('fund_type')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class AllAntchainAtoSignTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        template_list: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # List<Object>格式，详细参考：
        # [
        # {
        # "templateCode": "TEST_001",
        # "tenantId": "BIPCCOQY",
        # "agreementType": "SERVICE_LEASE",
        # "fileName": "测试模板之协议签署证明",
        # "templateId": "f28038577d664015bfc1034c4a125121",
        # "fieldArgs": "{\"sceneName\":\"测试协议合同签署\",\"title\":\"这是一份证明协议\"}",
        # "userPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"162.44\",\"posY\":\"425\"}]",
        # "orgPos": "[{\"required\":true,\"posPage\":\"1\",\"posX\":\"449.99\",\"posY\":\"420.03\"}]"
        # }
        # ]
        self.template_list = template_list

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
        if self.template_list is not None:
            result['template_list'] = self.template_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('template_list') is not None:
            self.template_list = m.get('template_list')
        return self


class SubmitAntchainAtoSignFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        user_id_type: str = None,
        user_id_number: str = None,
        user_name: str = None,
        user_mobile: str = None,
        user_email: str = None,
        sign_validity: str = None,
        flow_notify_type: str = None,
        business_scene: str = None,
        signed_redirect_url: str = None,
        template_list: str = None,
        alipay_user_id: str = None,
        merchant_name: str = None,
        merchant_tag: str = None,
        merchant_seal_id: str = None,
        merchant_sign_order: int = None,
        merchant_id_type: str = None,
        merchant_id_number: str = None,
        merchant_legal_name: str = None,
        merchant_legal_id_number: str = None,
        third_signer: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_id = order_id
        # CRED_PSN_CH_IDCARD： 大陆身份证
        # CRED_PSN_CH_TWCARD：台湾来往大陆通行证
        # CRED_PSN_CH_MACAO"：澳门来往大陆通行证
        # CRED_PSN_CH_HONGKONG：香港来往大陆通行证
        # CRED_PSN_PASSPORT：护照
        self.user_id_type = user_id_type
        # 用户证件号，需要采用RSA加密传输
        self.user_id_number = user_id_number
        # 姓名，需要采用RSA加密传输
        self.user_name = user_name
        # 用户手机号，可不传；传的话需要采用RSA加密传输
        self.user_mobile = user_mobile
        # 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
        self.user_email = user_email
        # 签署有效期，时间戳，例如：new Date().getTime()
        self.sign_validity = sign_validity
        # 1-短信；2-邮件
        self.flow_notify_type = flow_notify_type
        # 业务场景，电子合同签署协议的时候的标题
        self.business_scene = business_scene
        # 签署完成跳转链接
        self.signed_redirect_url = signed_redirect_url
        # 签署的电子合同模板信息，List<Object>的JSON格式，Object如下：
        # {
        # templateId:__, // String格式
        # templateArgs: {
        # "模板参数key":"模板参数值", // 必须为String
        # }
        # }
        self.template_list = template_list
        # 用户的支付宝uid
        self.alipay_user_id = alipay_user_id
        # 公司名称
        self.merchant_name = merchant_name
        # 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
        self.merchant_tag = merchant_tag
        # 商户需要盖的印章ID
        self.merchant_seal_id = merchant_seal_id
        # 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
        self.merchant_sign_order = merchant_sign_order
        # CRED_ORG_USCC：统一社会信用代码，CRED_ORG_REGCODE：工商注册号，只支持这两个值
        self.merchant_id_type = merchant_id_type
        # 商户证件号，需要采用RSA加密传输
        self.merchant_id_number = merchant_id_number
        # 法人姓名，需要RSA加密传输
        self.merchant_legal_name = merchant_legal_name
        # 法人证件号，需要采用RSA加密传输
        self.merchant_legal_id_number = merchant_legal_id_number
        # 多方签署的其他参与方的签署信息，json的array格式，参考：[{"tag":"zf_a","orgName":"上海网络科技有限公司","orgIdType":"CRED_ORG_REGCODE","orgIdNumber":"12098760923","orgLegalName":"王大浪","orgLegalIdNumber":"107120196708289012"}]，其中：orgIdNumber、orgLegalName、orgLegalIdNumber需要加密传输。
        self.third_signer = third_signer

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.user_id_type, 'user_id_type')
        self.validate_required(self.user_id_number, 'user_id_number')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.business_scene, 'business_scene')
        self.validate_required(self.template_list, 'template_list')
        if self.alipay_user_id is not None:
            self.validate_max_length(self.alipay_user_id, 'alipay_user_id', 20)
        self.validate_required(self.merchant_name, 'merchant_name')
        if self.merchant_name is not None:
            self.validate_max_length(self.merchant_name, 'merchant_name', 256)
        if self.merchant_tag is not None:
            self.validate_max_length(self.merchant_tag, 'merchant_tag', 32)
        if self.merchant_sign_order is not None:
            self.validate_maximum(self.merchant_sign_order, 'merchant_sign_order', 10000)
            self.validate_minimum(self.merchant_sign_order, 'merchant_sign_order', 1)
        self.validate_required(self.merchant_id_type, 'merchant_id_type')
        if self.merchant_id_type is not None:
            self.validate_max_length(self.merchant_id_type, 'merchant_id_type', 20)
        self.validate_required(self.merchant_id_number, 'merchant_id_number')
        if self.merchant_id_number is not None:
            self.validate_max_length(self.merchant_id_number, 'merchant_id_number', 1000)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.user_id_type is not None:
            result['user_id_type'] = self.user_id_type
        if self.user_id_number is not None:
            result['user_id_number'] = self.user_id_number
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_mobile is not None:
            result['user_mobile'] = self.user_mobile
        if self.user_email is not None:
            result['user_email'] = self.user_email
        if self.sign_validity is not None:
            result['sign_validity'] = self.sign_validity
        if self.flow_notify_type is not None:
            result['flow_notify_type'] = self.flow_notify_type
        if self.business_scene is not None:
            result['business_scene'] = self.business_scene
        if self.signed_redirect_url is not None:
            result['signed_redirect_url'] = self.signed_redirect_url
        if self.template_list is not None:
            result['template_list'] = self.template_list
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.merchant_tag is not None:
            result['merchant_tag'] = self.merchant_tag
        if self.merchant_seal_id is not None:
            result['merchant_seal_id'] = self.merchant_seal_id
        if self.merchant_sign_order is not None:
            result['merchant_sign_order'] = self.merchant_sign_order
        if self.merchant_id_type is not None:
            result['merchant_id_type'] = self.merchant_id_type
        if self.merchant_id_number is not None:
            result['merchant_id_number'] = self.merchant_id_number
        if self.merchant_legal_name is not None:
            result['merchant_legal_name'] = self.merchant_legal_name
        if self.merchant_legal_id_number is not None:
            result['merchant_legal_id_number'] = self.merchant_legal_id_number
        if self.third_signer is not None:
            result['third_signer'] = self.third_signer
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('user_id_type') is not None:
            self.user_id_type = m.get('user_id_type')
        if m.get('user_id_number') is not None:
            self.user_id_number = m.get('user_id_number')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_mobile') is not None:
            self.user_mobile = m.get('user_mobile')
        if m.get('user_email') is not None:
            self.user_email = m.get('user_email')
        if m.get('sign_validity') is not None:
            self.sign_validity = m.get('sign_validity')
        if m.get('flow_notify_type') is not None:
            self.flow_notify_type = m.get('flow_notify_type')
        if m.get('business_scene') is not None:
            self.business_scene = m.get('business_scene')
        if m.get('signed_redirect_url') is not None:
            self.signed_redirect_url = m.get('signed_redirect_url')
        if m.get('template_list') is not None:
            self.template_list = m.get('template_list')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('merchant_tag') is not None:
            self.merchant_tag = m.get('merchant_tag')
        if m.get('merchant_seal_id') is not None:
            self.merchant_seal_id = m.get('merchant_seal_id')
        if m.get('merchant_sign_order') is not None:
            self.merchant_sign_order = m.get('merchant_sign_order')
        if m.get('merchant_id_type') is not None:
            self.merchant_id_type = m.get('merchant_id_type')
        if m.get('merchant_id_number') is not None:
            self.merchant_id_number = m.get('merchant_id_number')
        if m.get('merchant_legal_name') is not None:
            self.merchant_legal_name = m.get('merchant_legal_name')
        if m.get('merchant_legal_id_number') is not None:
            self.merchant_legal_id_number = m.get('merchant_legal_id_number')
        if m.get('third_signer') is not None:
            self.third_signer = m.get('third_signer')
        return self


class SubmitAntchainAtoSignFlowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_no: str = None,
        flow_id: str = None,
        account_id: str = None,
        sign_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签署合同单号
        self.sign_no = sign_no
        # 电子签署流程ID
        self.flow_id = flow_id
        # 签署用户ID
        self.account_id = account_id
        # 签署附加信息，用于获取签署链接等。JSON格式的字符串。
        self.sign_info = sign_info

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
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.sign_info is not None:
            result['sign_info'] = self.sign_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('sign_info') is not None:
            self.sign_info = m.get('sign_info')
        return self


class GetAntchainAtoSignFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sign_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 签署合同单号
        self.sign_no = sign_no

    def validate(self):
        self.validate_required(self.sign_no, 'sign_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        return self


class GetAntchainAtoSignFlowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_no: str = None,
        order_id: str = None,
        account_id: str = None,
        status: str = None,
        flow_id: str = None,
        doc_list: str = None,
        business_scene: str = None,
        alipay_user_id: str = None,
        sign_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签署合同单号
        self.sign_no = sign_no
        # 订单号
        self.order_id = order_id
        # 签署用户ID
        self.account_id = account_id
        # 状态：DRAFT - 草稿； SIGNING - 签署中； FINISH - 签署完成；UNDO - 撤销； TERMINATE - 终止； EXPIRE - 过期； REJECTED - 拒签； CANCELLED - 解约
        # 
        self.status = status
        # 签署流程ID
        self.flow_id = flow_id
        # 签署文件列表，参考：
        # _[{"fileItemNo":"10090801000001699892007791144960","agreementType":"COMMON","fileName":"xxx合同","fileSize":228530,"signAccountId":"fe2eb3814c4e49edba2bc012f790771f","fileId":"2c7684461a0f4d33bc02f6d77f7b3937","downloadUrl":"https://dev.oss-cn-shanghai.aliyuncs.com/ag/ord/xxx/16939683744483057_%E6%B5%8B%E8%AF%95%E6%A8%A1%E6%9D%BF%E4%B9%8B%E5%8D%8F%E8%AE%AE%E7%AD%BE%E7%BD%B2%E8%AF%81%E6%98%8E.pdf?Expires=1693971989&OSSAccessKeyId=LTAI5tR3hHiaXPAh8YsY9Dce&Signature=i%2FfAgDem33guI%2F0KjIFj24XZNCc%3D"}]_
        self.doc_list = doc_list
        # 业务场景，主要用于签署合同的标题描述
        self.business_scene = business_scene
        # 签署合同中的订单的uid。
        self.alipay_user_id = alipay_user_id
        # 签署扩展信息，用于获取签署链接等。JSON格式字符串。
        self.sign_info = sign_info

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
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.status is not None:
            result['status'] = self.status
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.doc_list is not None:
            result['doc_list'] = self.doc_list
        if self.business_scene is not None:
            result['business_scene'] = self.business_scene
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        if self.sign_info is not None:
            result['sign_info'] = self.sign_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('doc_list') is not None:
            self.doc_list = m.get('doc_list')
        if m.get('business_scene') is not None:
            self.business_scene = m.get('business_scene')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        if m.get('sign_info') is not None:
            self.sign_info = m.get('sign_info')
        return self


class CreateAntchainAtoWithholdSignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        alipay_merchant_id: str = None,
        alipay_merchant_name: str = None,
        alipay_merchant_service_name: str = None,
        alipay_merchant_service_description: str = None,
        alipay_user_id: str = None,
        return_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 支付宝商户id，使用签约能力前时候进行向平台申请
        self.alipay_merchant_id = alipay_merchant_id
        # 支付宝商户名称，会展示在支付并签约界面
        self.alipay_merchant_name = alipay_merchant_name
        # 支付宝商户服务名称，会展示在支付并签约界面
        self.alipay_merchant_service_name = alipay_merchant_service_name
        # 支付宝商户服务描述，会展示在支付并签约界面
        self.alipay_merchant_service_description = alipay_merchant_service_description
        # 支付宝uid，非必填
        self.alipay_user_id = alipay_user_id
        # 签约完成后的跳转地址，注意只有在h5跳转场景下才有意义其他场景通过方法回调处理业务；无需使用此字段。
        self.return_url = return_url

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        if self.alipay_merchant_id is not None:
            self.validate_max_length(self.alipay_merchant_id, 'alipay_merchant_id', 20)
        if self.alipay_merchant_name is not None:
            self.validate_max_length(self.alipay_merchant_name, 'alipay_merchant_name', 50)
        if self.alipay_merchant_service_name is not None:
            self.validate_max_length(self.alipay_merchant_service_name, 'alipay_merchant_service_name', 50)
        if self.alipay_merchant_service_description is not None:
            self.validate_max_length(self.alipay_merchant_service_description, 'alipay_merchant_service_description', 150)
        if self.alipay_user_id is not None:
            self.validate_max_length(self.alipay_user_id, 'alipay_user_id', 128)
        if self.return_url is not None:
            self.validate_max_length(self.return_url, 'return_url', 256)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.alipay_merchant_id is not None:
            result['alipay_merchant_id'] = self.alipay_merchant_id
        if self.alipay_merchant_name is not None:
            result['alipay_merchant_name'] = self.alipay_merchant_name
        if self.alipay_merchant_service_name is not None:
            result['alipay_merchant_service_name'] = self.alipay_merchant_service_name
        if self.alipay_merchant_service_description is not None:
            result['alipay_merchant_service_description'] = self.alipay_merchant_service_description
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        if self.return_url is not None:
            result['return_url'] = self.return_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('alipay_merchant_id') is not None:
            self.alipay_merchant_id = m.get('alipay_merchant_id')
        if m.get('alipay_merchant_name') is not None:
            self.alipay_merchant_name = m.get('alipay_merchant_name')
        if m.get('alipay_merchant_service_name') is not None:
            self.alipay_merchant_service_name = m.get('alipay_merchant_service_name')
        if m.get('alipay_merchant_service_description') is not None:
            self.alipay_merchant_service_description = m.get('alipay_merchant_service_description')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        if m.get('return_url') is not None:
            self.return_url = m.get('return_url')
        return self


class CreateAntchainAtoWithholdSignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_str: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签约字符串
        self.sign_str = sign_str

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
        if self.sign_str is not None:
            result['sign_str'] = self.sign_str
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_str') is not None:
            self.sign_str = m.get('sign_str')
        return self


class QueryAntchainAtoWithholdSignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        return self


class QueryAntchainAtoWithholdSignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        sign_time: str = None,
        valid_time: str = None,
        invalid_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 协议当前状态
        # 1. UNSIGNED：未签约
        # 2. SIGNED：已签约；
        # 3. TERMINATED：已解约
        self.status = status
        # 协议签署时间
        self.sign_time = sign_time
        # 协议生效时间
        self.valid_time = valid_time
        # 协议失效时间
        self.invalid_time = invalid_time

    def validate(self):
        if self.sign_time is not None:
            self.validate_pattern(self.sign_time, 'sign_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.valid_time is not None:
            self.validate_pattern(self.valid_time, 'valid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.invalid_time is not None:
            self.validate_pattern(self.invalid_time, 'invalid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.sign_time is not None:
            result['sign_time'] = self.sign_time
        if self.valid_time is not None:
            result['valid_time'] = self.valid_time
        if self.invalid_time is not None:
            result['invalid_time'] = self.invalid_time
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
        if m.get('sign_time') is not None:
            self.sign_time = m.get('sign_time')
        if m.get('valid_time') is not None:
            self.valid_time = m.get('valid_time')
        if m.get('invalid_time') is not None:
            self.invalid_time = m.get('invalid_time')
        return self


class AuthAntchainAtoSignFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sign_no: str = None,
        tag: str = None,
        biz_flow_id: str = None,
        account_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 签署的电子合同ID
        self.sign_no = sign_no
        # 签署区域的tag，和发起签署流程的机构的tag对应。
        self.tag = tag
        # 电子合同签署服务返回的biz_flow_id
        self.biz_flow_id = biz_flow_id
        # 电子合同签署服务的返回的account_id
        self.account_id = account_id

    def validate(self):
        self.validate_required(self.sign_no, 'sign_no')
        if self.sign_no is not None:
            self.validate_max_length(self.sign_no, 'sign_no', 64)
        if self.tag is not None:
            self.validate_max_length(self.tag, 'tag', 32)
        if self.biz_flow_id is not None:
            self.validate_max_length(self.biz_flow_id, 'biz_flow_id', 64)
        if self.account_id is not None:
            self.validate_max_length(self.account_id, 'account_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.tag is not None:
            result['tag'] = self.tag
        if self.biz_flow_id is not None:
            result['biz_flow_id'] = self.biz_flow_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('tag') is not None:
            self.tag = m.get('tag')
        if m.get('biz_flow_id') is not None:
            self.biz_flow_id = m.get('biz_flow_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        return self


class AuthAntchainAtoSignFlowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_field_ids: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签署最后落签的签署区域id列表
        self.sign_field_ids = sign_field_ids

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
        if self.sign_field_ids is not None:
            result['sign_field_ids'] = self.sign_field_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_field_ids') is not None:
            self.sign_field_ids = m.get('sign_field_ids')
        return self


class UnbindAntchainAtoWithholdSignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        return self


class UnbindAntchainAtoWithholdSignResponse(TeaModel):
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


class CancelAntchainAtoWithholdPlanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        cancel_reason: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当发现跨天继续提交
        self.order_id = order_id
        # 取消原因
        # RENTING_OUT:退租
        # RENTING_AND_RESALE:租转售
        # 
        # 
        self.cancel_reason = cancel_reason

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.cancel_reason, 'cancel_reason')
        if self.cancel_reason is not None:
            self.validate_max_length(self.cancel_reason, 'cancel_reason', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.cancel_reason is not None:
            result['cancel_reason'] = self.cancel_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('cancel_reason') is not None:
            self.cancel_reason = m.get('cancel_reason')
        return self


class CancelAntchainAtoWithholdPlanResponse(TeaModel):
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


class RepayAntchainAtoWithholdPlanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        period_num: int = None,
        gmt_pay: str = None,
        pay_off_amount: int = None,
        pay_off_type: str = None,
        pay_off_no: str = None,
        pay_off_bank_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 第几期
        self.period_num = period_num
        # 其他方式还款的时间
        self.gmt_pay = gmt_pay
        # 取消订单某一期代扣计划中以其他方式还款金额，单位为分
        self.pay_off_amount = pay_off_amount
        # 变更其他方式还款
        # WECHAT:微信;
        # BANK:银行
        # ALIPAY:支付宝
        self.pay_off_type = pay_off_type
        # 通过其他方式还款单号;例如银行流水号或微信流水号
        self.pay_off_no = pay_off_no
        # 其他方式还款银行名称，还款方式为银行时必填
        self.pay_off_bank_name = pay_off_bank_name

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.period_num, 'period_num')
        if self.period_num is not None:
            self.validate_minimum(self.period_num, 'period_num', 1)
        self.validate_required(self.gmt_pay, 'gmt_pay')
        if self.gmt_pay is not None:
            self.validate_pattern(self.gmt_pay, 'gmt_pay', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.pay_off_amount, 'pay_off_amount')
        if self.pay_off_amount is not None:
            self.validate_minimum(self.pay_off_amount, 'pay_off_amount', 0)
        if self.pay_off_type is not None:
            self.validate_max_length(self.pay_off_type, 'pay_off_type', 64)
        if self.pay_off_no is not None:
            self.validate_max_length(self.pay_off_no, 'pay_off_no', 64)
        if self.pay_off_bank_name is not None:
            self.validate_max_length(self.pay_off_bank_name, 'pay_off_bank_name', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.gmt_pay is not None:
            result['gmt_pay'] = self.gmt_pay
        if self.pay_off_amount is not None:
            result['pay_off_amount'] = self.pay_off_amount
        if self.pay_off_type is not None:
            result['pay_off_type'] = self.pay_off_type
        if self.pay_off_no is not None:
            result['pay_off_no'] = self.pay_off_no
        if self.pay_off_bank_name is not None:
            result['pay_off_bank_name'] = self.pay_off_bank_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('gmt_pay') is not None:
            self.gmt_pay = m.get('gmt_pay')
        if m.get('pay_off_amount') is not None:
            self.pay_off_amount = m.get('pay_off_amount')
        if m.get('pay_off_type') is not None:
            self.pay_off_type = m.get('pay_off_type')
        if m.get('pay_off_no') is not None:
            self.pay_off_no = m.get('pay_off_no')
        if m.get('pay_off_bank_name') is not None:
            self.pay_off_bank_name = m.get('pay_off_bank_name')
        return self


class RepayAntchainAtoWithholdPlanResponse(TeaModel):
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


class SubmitAntchainAtoFrontSignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        user_id_type: str = None,
        user_id_number: str = None,
        user_name: str = None,
        user_mobile: str = None,
        user_email: str = None,
        sign_validity: str = None,
        flow_notify_type: str = None,
        business_scene: str = None,
        signed_redirect_url: str = None,
        template_list: str = None,
        alipay_user_id: str = None,
        merchant_name: str = None,
        merchant_tag: str = None,
        merchant_sign_order: int = None,
        merchant_seal_id: str = None,
        merchant_id_type: str = None,
        merchant_id_number: str = None,
        merchant_legal_name: str = None,
        merchant_legal_id_number: str = None,
        third_signer: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户的订单号
        self.order_id = order_id
        # CRED_PSN_CH_IDCARD： 大陆身份证
        # CRED_PSN_CH_TWCARD：台湾来往大陆通行证
        # CRED_PSN_CH_MACAO"：澳门来往大陆通行证
        # CRED_PSN_CH_HONGKONG：香港来往大陆通行证
        # CRED_PSN_PASSPORT：护照
        self.user_id_type = user_id_type
        # 用户证件号，需要采用RSA加密传输
        self.user_id_number = user_id_number
        # 姓名，需要采用RSA加密传输
        # 
        self.user_name = user_name
        # 用户手机号，可不传；传的话需要采用RSA加密传输
        # 
        self.user_mobile = user_mobile
        # 用户的电子邮箱，可不传；传的话需要采用RSA加密传输
        # 
        self.user_email = user_email
        # 签署有效期，时间戳，例如：new Date().getTime()
        self.sign_validity = sign_validity
        # 1-短信；2-邮件
        self.flow_notify_type = flow_notify_type
        # 业务场景，电子合同签署协议的时候的标题
        # 
        self.business_scene = business_scene
        # 签署完成跳转链接
        # 
        self.signed_redirect_url = signed_redirect_url
        # 签署的电子合同模板信息，List<Object>的JSON格式，Object如下： { templateId:__, // String格式 templateArgs: { "模板参数key":"模板参数值", // 必须为String } }
        self.template_list = template_list
        # 用户的支付宝uid
        self.alipay_user_id = alipay_user_id
        # 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
        self.merchant_name = merchant_name
        # 商户签署区域标识。对应在合同模板的机构签署区域中的tag值(如果合同模板的签署区域的tag值为空，则可以不传这个参数)。必须完全对应，否则在多方签署的情况下根据tag找到不到对应的签署机构，会出错。
        self.merchant_tag = merchant_tag
        # 电子合同签署顺序，如果只有1方企业签署，传入1即可。如果是多方，并且需要设置签署顺序，则需要将这个值以及thirdSigner中的signOrder做一个签署顺序。
        self.merchant_sign_order = merchant_sign_order
        # 商户需要盖的印章ID
        self.merchant_seal_id = merchant_seal_id
        # CRED_ORG_USCC：统一社会信用代码，
        # CRED_ORG_REGCODE：工商注册号，
        # 只支持这两个值
        self.merchant_id_type = merchant_id_type
        # 商户证件号，需要采用RSA加密传输
        self.merchant_id_number = merchant_id_number
        # 法人姓名，需要RSA加密传输
        # 
        self.merchant_legal_name = merchant_legal_name
        # 法人证件号，需要采用RSA加密传输
        # 
        self.merchant_legal_id_number = merchant_legal_id_number
        # 多方签署的其他参与方的签署信息，json的array格式，参考：[{"tag":"zf_a","orgName":"上海网络科技有限公司","orgIdType":"CRED_ORG_REGCODE","orgIdNumber":"12098760923","orgLegalName":"王大浪","orgLegalIdNumber":"107120196708289012","sealIds":["12b2317-0000-3333-2222-ec087dc97d8b"]}]，其中：orgIdNumber、orgLegalName、orgLegalIdNumber需要加密传输。
        self.third_signer = third_signer

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 64)
        self.validate_required(self.user_id_type, 'user_id_type')
        if self.user_id_type is not None:
            self.validate_max_length(self.user_id_type, 'user_id_type', 40)
        self.validate_required(self.user_id_number, 'user_id_number')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.business_scene, 'business_scene')
        if self.business_scene is not None:
            self.validate_max_length(self.business_scene, 'business_scene', 200)
        self.validate_required(self.template_list, 'template_list')
        if self.alipay_user_id is not None:
            self.validate_max_length(self.alipay_user_id, 'alipay_user_id', 24)
        self.validate_required(self.merchant_name, 'merchant_name')
        if self.merchant_tag is not None:
            self.validate_max_length(self.merchant_tag, 'merchant_tag', 32)
        self.validate_required(self.merchant_id_type, 'merchant_id_type')
        if self.merchant_id_type is not None:
            self.validate_max_length(self.merchant_id_type, 'merchant_id_type', 32)
        self.validate_required(self.merchant_id_number, 'merchant_id_number')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.user_id_type is not None:
            result['user_id_type'] = self.user_id_type
        if self.user_id_number is not None:
            result['user_id_number'] = self.user_id_number
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_mobile is not None:
            result['user_mobile'] = self.user_mobile
        if self.user_email is not None:
            result['user_email'] = self.user_email
        if self.sign_validity is not None:
            result['sign_validity'] = self.sign_validity
        if self.flow_notify_type is not None:
            result['flow_notify_type'] = self.flow_notify_type
        if self.business_scene is not None:
            result['business_scene'] = self.business_scene
        if self.signed_redirect_url is not None:
            result['signed_redirect_url'] = self.signed_redirect_url
        if self.template_list is not None:
            result['template_list'] = self.template_list
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.merchant_tag is not None:
            result['merchant_tag'] = self.merchant_tag
        if self.merchant_sign_order is not None:
            result['merchant_sign_order'] = self.merchant_sign_order
        if self.merchant_seal_id is not None:
            result['merchant_seal_id'] = self.merchant_seal_id
        if self.merchant_id_type is not None:
            result['merchant_id_type'] = self.merchant_id_type
        if self.merchant_id_number is not None:
            result['merchant_id_number'] = self.merchant_id_number
        if self.merchant_legal_name is not None:
            result['merchant_legal_name'] = self.merchant_legal_name
        if self.merchant_legal_id_number is not None:
            result['merchant_legal_id_number'] = self.merchant_legal_id_number
        if self.third_signer is not None:
            result['third_signer'] = self.third_signer
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('user_id_type') is not None:
            self.user_id_type = m.get('user_id_type')
        if m.get('user_id_number') is not None:
            self.user_id_number = m.get('user_id_number')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_mobile') is not None:
            self.user_mobile = m.get('user_mobile')
        if m.get('user_email') is not None:
            self.user_email = m.get('user_email')
        if m.get('sign_validity') is not None:
            self.sign_validity = m.get('sign_validity')
        if m.get('flow_notify_type') is not None:
            self.flow_notify_type = m.get('flow_notify_type')
        if m.get('business_scene') is not None:
            self.business_scene = m.get('business_scene')
        if m.get('signed_redirect_url') is not None:
            self.signed_redirect_url = m.get('signed_redirect_url')
        if m.get('template_list') is not None:
            self.template_list = m.get('template_list')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('merchant_tag') is not None:
            self.merchant_tag = m.get('merchant_tag')
        if m.get('merchant_sign_order') is not None:
            self.merchant_sign_order = m.get('merchant_sign_order')
        if m.get('merchant_seal_id') is not None:
            self.merchant_seal_id = m.get('merchant_seal_id')
        if m.get('merchant_id_type') is not None:
            self.merchant_id_type = m.get('merchant_id_type')
        if m.get('merchant_id_number') is not None:
            self.merchant_id_number = m.get('merchant_id_number')
        if m.get('merchant_legal_name') is not None:
            self.merchant_legal_name = m.get('merchant_legal_name')
        if m.get('merchant_legal_id_number') is not None:
            self.merchant_legal_id_number = m.get('merchant_legal_id_number')
        if m.get('third_signer') is not None:
            self.third_signer = m.get('third_signer')
        return self


class SubmitAntchainAtoFrontSignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_no: str = None,
        flow_id: str = None,
        account_id: str = None,
        sign_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签署合同单号
        # 
        self.sign_no = sign_no
        # 电子签署流程ID
        # 
        self.flow_id = flow_id
        # 签署用户ID
        # 
        self.account_id = account_id
        # 签署扩展信息，用于获取签署链接等。JSON格式字符串。
        self.sign_info = sign_info

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
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.account_id is not None:
            result['account_id'] = self.account_id
        if self.sign_info is not None:
            result['sign_info'] = self.sign_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('account_id') is not None:
            self.account_id = m.get('account_id')
        if m.get('sign_info') is not None:
            self.sign_info = m.get('sign_info')
        return self


class SyncAntchainAtoFrontTradeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        type: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 类型
        # 1. orderFullInfo ， 订单所有信息同步
        self.type = type
        # json.toString
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.type is not None:
            result['type'] = self.type
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class SyncAntchainAtoFrontTradeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回信息
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class RetryAntchainAtoWithholdPlanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        period_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 第几期
        self.period_num = period_num

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.period_num, 'period_num')
        if self.period_num is not None:
            self.validate_minimum(self.period_num, 'period_num', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.period_num is not None:
            result['period_num'] = self.period_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        return self


class RetryAntchainAtoWithholdPlanResponse(TeaModel):
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


class ConfirmAntchainAtoWithholdSignasyncunsignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        operate: str = None,
        refuse_reason_code: str = None,
        user_owe_money: int = None,
        user_in_service: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 操作动作
        # 同意：AGREE
        # 拒绝：REFUSE
        self.operate = operate
        # 拒绝原因码,商户拒绝时必填。
        # USER_OWE_MONEY：用户账户存在欠费订单
        # USER_IN_SERVICE：用户有进行的订单
        self.refuse_reason_code = refuse_reason_code
        # 用户欠款金额，单位为分
        # refuse_reason_code=USER_OWE_MONEY时必填
        self.user_owe_money = user_owe_money
        # 用户进行中的服务
        # refuse_reason_code=USER_IN_SERVICE时必填
        self.user_in_service = user_in_service

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.operate, 'operate')
        if self.operate is not None:
            self.validate_max_length(self.operate, 'operate', 16)
        if self.refuse_reason_code is not None:
            self.validate_max_length(self.refuse_reason_code, 'refuse_reason_code', 16)
        if self.user_owe_money is not None:
            self.validate_minimum(self.user_owe_money, 'user_owe_money', 1)
        if self.user_in_service is not None:
            self.validate_max_length(self.user_in_service, 'user_in_service', 128)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.operate is not None:
            result['operate'] = self.operate
        if self.refuse_reason_code is not None:
            result['refuse_reason_code'] = self.refuse_reason_code
        if self.user_owe_money is not None:
            result['user_owe_money'] = self.user_owe_money
        if self.user_in_service is not None:
            result['user_in_service'] = self.user_in_service
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('operate') is not None:
            self.operate = m.get('operate')
        if m.get('refuse_reason_code') is not None:
            self.refuse_reason_code = m.get('refuse_reason_code')
        if m.get('user_owe_money') is not None:
            self.user_owe_money = m.get('user_owe_money')
        if m.get('user_in_service') is not None:
            self.user_in_service = m.get('user_in_service')
        return self


class ConfirmAntchainAtoWithholdSignasyncunsignResponse(TeaModel):
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


class UploadAntchainAtoFundFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_id: str = None,
        order_id: str = None,
        sign_no: str = None,
        file_item_no: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单所属商户的统一社会信用代码
        self.merchant_id = merchant_id
        # 商户的订单号
        self.order_id = order_id
        # 签署合同单号
        self.sign_no = sign_no
        # 返回的文件fileItemNo编号
        self.file_item_no = file_item_no
        # 上传的pdf文件，需要以.pdf后缀结尾
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 资方统一社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.sign_no, 'sign_no')
        self.validate_required(self.file_item_no, 'file_item_no')
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.file_item_no is not None:
            result['file_item_no'] = self.file_item_no
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('file_item_no') is not None:
            self.file_item_no = m.get('file_item_no')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class UploadAntchainAtoFundFlowResponse(TeaModel):
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


class GetAntchainAtoFundFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_id: str = None,
        order_id: str = None,
        contract_type: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单所属商户的统一社会信用代码
        self.merchant_id = merchant_id
        # 商户的订单号
        self.order_id = order_id
        # 合同类型
        self.contract_type = contract_type
        # 资方统一社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.order_id, 'order_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.contract_type is not None:
            result['contract_type'] = self.contract_type
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('contract_type') is not None:
            self.contract_type = m.get('contract_type')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class GetAntchainAtoFundFlowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        contract_list: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商户的订单号
        self.order_id = order_id
        # 需要落章的合同列表，需要status状态为FINISH可以落章
        self.contract_list = contract_list

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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.contract_list is not None:
            result['contract_list'] = self.contract_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('contract_list') is not None:
            self.contract_list = m.get('contract_list')
        return self


class RefuseAntchainAtoFundFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_id: str = None,
        order_id: str = None,
        sign_no: str = None,
        sign_reason: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单所属商户的统一社会信用代码
        self.merchant_id = merchant_id
        # 商户的订单号
        self.order_id = order_id
        # 签署合同单号
        self.sign_no = sign_no
        # 填写拒绝落章原因，如果同意则不用填写
        self.sign_reason = sign_reason
        # 资方统一社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.sign_no, 'sign_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.sign_reason is not None:
            result['sign_reason'] = self.sign_reason
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('sign_reason') is not None:
            self.sign_reason = m.get('sign_reason')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class RefuseAntchainAtoFundFlowResponse(TeaModel):
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


class AuthAntchainAtoFundFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_id: str = None,
        order_id: str = None,
        sign_no: str = None,
        tag: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单所属商户的统一社会信用代码
        self.merchant_id = merchant_id
        # 商户的订单号
        self.order_id = order_id
        # 签署的电子合同ID
        self.sign_no = sign_no
        # 签署区域的tag，和发起签署流程的机构的tag对应
        self.tag = tag

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.sign_no, 'sign_no')
        self.validate_required(self.tag, 'tag')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.tag is not None:
            result['tag'] = self.tag
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('tag') is not None:
            self.tag = m.get('tag')
        return self


class AuthAntchainAtoFundFlowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_field_ids: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签署最后落签的签署区域id列表
        self.sign_field_ids = sign_field_ids

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
        if self.sign_field_ids is not None:
            result['sign_field_ids'] = self.sign_field_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_field_ids') is not None:
            self.sign_field_ids = m.get('sign_field_ids')
        return self


class CreateAntchainAtoWithholdActivepayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        period_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 第几期
        self.period_num = period_num

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.period_num, 'period_num')
        if self.period_num is not None:
            self.validate_minimum(self.period_num, 'period_num', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.period_num is not None:
            result['period_num'] = self.period_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        return self


class CreateAntchainAtoWithholdActivepayResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trade_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 支付宝支付订单号，用于拉起主动支付页面
        self.trade_no = trade_no

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
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        return self


class QueryAntchainAtoWithholdActivepayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        period_num: int = None,
        trade_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 第几期
        self.period_num = period_num
        # 支付宝支付订单号，当传递此单号时，只会返回当前单据
        self.trade_no = trade_no

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.period_num, 'period_num')
        if self.trade_no is not None:
            self.validate_max_length(self.trade_no, 'trade_no', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        return self


class QueryAntchainAtoWithholdActivepayResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current_order: ActivePayOrder = None,
        orders: List[ActivePayOrder] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前支付单
        self.current_order = current_order
        # 主动支付单列表，当不通过trade_no查询时有值
        self.orders = orders

    def validate(self):
        if self.current_order:
            self.current_order.validate()
        if self.orders:
            for k in self.orders:
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
        if self.current_order is not None:
            result['current_order'] = self.current_order.to_map()
        result['orders'] = []
        if self.orders is not None:
            for k in self.orders:
                result['orders'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('current_order') is not None:
            temp_model = ActivePayOrder()
            self.current_order = temp_model.from_map(m['current_order'])
        self.orders = []
        if m.get('orders') is not None:
            for k in m.get('orders'):
                temp_model = ActivePayOrder()
                self.orders.append(temp_model.from_map(k))
        return self


class CancelAntchainAtoWithholdActivepayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        period_num: int = None,
        trade_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 第几期
        self.period_num = period_num
        # 支付宝支付订单号，当传递此单号时，只会取消指定单据号，不传递时取消当前代扣
        self.trade_no = trade_no

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.period_num, 'period_num')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        return self


class CancelAntchainAtoWithholdActivepayResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trade_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 取消的单号
        self.trade_no = trade_no

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
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        return self


class CancelAntchainAtoFundPlanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        cancel_reason: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id 长度不可超过50
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # 取消原因
        # ACTIVE_REDEEM:自主赎回
        # RENTING_OUT_REDEEM:退租赎回
        # RENTING_AND_RESALE_REDEEM:租转售赎回
        self.cancel_reason = cancel_reason
        # 融资单的资方社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.cancel_reason, 'cancel_reason')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.cancel_reason is not None:
            result['cancel_reason'] = self.cancel_reason
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('cancel_reason') is not None:
            self.cancel_reason = m.get('cancel_reason')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class CancelAntchainAtoFundPlanResponse(TeaModel):
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


class CallbackAntchainAtoFundNotifyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        type: str = None,
        data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # ASYNC_UNSIGN_APPLY
        self.type = type
        # 数据
        self.data = data

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.data, 'data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.type is not None:
            result['type'] = self.type
        if self.data is not None:
            result['data'] = self.data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('data') is not None:
            self.data = m.get('data')
        return self


class CallbackAntchainAtoFundNotifyResponse(TeaModel):
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


class SyncAntchainAtoTradeFinanceloanapplyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        merchant_name: str = None,
        fund_id: str = None,
        type: str = None,
        asset_package_id: str = None,
        stage: str = None,
        order_id_list: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # 融资放款申请接口
        self.merchant_name = merchant_name
        # 资方的社会信用代码
        self.fund_id = fund_id
        # 类型
        # ● 默认为：ORDER, 单订单申请
        # ● PACKAGE_ORDER , 资产包订单模式
        self.type = type
        # 资产包id
        # type = PACKAGE_ORDER ， 必填
        self.asset_package_id = asset_package_id
        # type = PACKAGE_ORDER ， 必填
        # 
        # ● APPEND: 追加订单列表
        # ● FINIISH : 结束
        self.stage = stage
        # 订单id列表的jsonArray
        self.order_id_list = order_id_list

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)
        self.validate_required(self.merchant_name, 'merchant_name')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)
        if self.asset_package_id is not None:
            self.validate_max_length(self.asset_package_id, 'asset_package_id', 50)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.type is not None:
            result['type'] = self.type
        if self.asset_package_id is not None:
            result['asset_package_id'] = self.asset_package_id
        if self.stage is not None:
            result['stage'] = self.stage
        if self.order_id_list is not None:
            result['order_id_list'] = self.order_id_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('asset_package_id') is not None:
            self.asset_package_id = m.get('asset_package_id')
        if m.get('stage') is not None:
            self.stage = m.get('stage')
        if m.get('order_id_list') is not None:
            self.order_id_list = m.get('order_id_list')
        return self


class SyncAntchainAtoTradeFinanceloanapplyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        merchant_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id

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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class GetAntchainAtoTradeMerchantfulfillmentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        term_idx: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # 履约期数，不填返回为所有履约期的履约信息
        # - 如果有填写，返回当前期数的履约信息，列表长度为1
        self.term_idx = term_idx

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.term_idx is not None:
            result['term_idx'] = self.term_idx
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('term_idx') is not None:
            self.term_idx = m.get('term_idx')
        return self


class GetAntchainAtoTradeMerchantfulfillmentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回值为 「MerchantFulfillmentResp」的json字符串
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class SyncAntchainAtoFundMerchantpromiseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        biz_content: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # json字符串,填入「MerchantPromiseReq」的json字符串
        self.biz_content = biz_content
        # 资方公司社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)
        self.validate_required(self.biz_content, 'biz_content')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class SyncAntchainAtoFundMerchantpromiseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        merchant_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单id
        self.order_id = order_id
        # 订单所属商家社会信用代码
        self.merchant_id = merchant_id

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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class SyncAntchainAtoFundFinanceloanresultsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        biz_content: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 商家的社会信用代码
        self.merchant_id = merchant_id
        # json字符串,填入「FinanceLoanResultsReq」的json字符串
        self.biz_content = biz_content
        # 资方的社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 200)
        self.validate_required(self.biz_content, 'biz_content')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class SyncAntchainAtoFundFinanceloanresultsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        merchant_id: str = None,
        loan_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # "ERROR": 放款同步异常
        # “SUCCESS":放款同步成功
        self.loan_result = loan_result

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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.loan_result is not None:
            result['loan_result'] = self.loan_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('loan_result') is not None:
            self.loan_result = m.get('loan_result')
        return self


class GetAntchainAtoFundUserpromiseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # 资方的社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 200)
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class GetAntchainAtoFundUserpromiseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回值为「OrderPromise」的json字符串
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class GetAntchainAtoTradeUserperformanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 商家公司社会信用代码
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class GetAntchainAtoTradeUserperformanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 「UserPerformanceInfo」的json字符串
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class GetAntchainAtoTradeMerchantperformanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class GetAntchainAtoTradeMerchantperformanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 「MerchantPerformanceInfo」的json字符串
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class GetAntchainAtoFundUserperformanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # 订单所属融资公司的社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 64)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)
        self.validate_required(self.fund_id, 'fund_id')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class GetAntchainAtoFundUserperformanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 「UserPerformanceInfo」的json字符串
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class GetAntchainAtoFundMerchantperformanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # 订单所属融资方的社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)
        self.validate_required(self.fund_id, 'fund_id')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class GetAntchainAtoFundMerchantperformanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 「MerchantPerformanceInfo」的json字符串
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class GetAntchainAtoFundOrderfullinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单Id
        self.order_id = order_id
        # 订单所属商户的社会信用代码
        self.merchant_id = merchant_id
        # 订单所属商户的社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 64)
        self.validate_required(self.fund_id, 'fund_id')
        if self.fund_id is not None:
            self.validate_max_length(self.fund_id, 'fund_id', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class GetAntchainAtoFundOrderfullinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # OrderFullInfoResp的json字符串
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class UploadAntchainAtoSignFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_id: str = None,
        order_id: str = None,
        sign_no: str = None,
        template_id: str = None,
        sign_time: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        # 订单所属商户的统一社会信用代码
        self.merchant_id = merchant_id
        # 
        # 商户的订单号
        self.order_id = order_id
        # 签署合同单号
        self.sign_no = sign_no
        # 模板id
        self.template_id = template_id
        # 合同签署时间，格式为yyyy-MM-dd HH:mm:ss
        self.sign_time = sign_time
        # 上传的pdf文件，需要以.pdf后缀结尾
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.sign_no, 'sign_no')
        self.validate_required(self.template_id, 'template_id')
        self.validate_required(self.sign_time, 'sign_time')
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.sign_time is not None:
            result['sign_time'] = self.sign_time
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('sign_time') is not None:
            self.sign_time = m.get('sign_time')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class UploadAntchainAtoSignFlowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        file_item_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文件编号
        self.file_item_no = file_item_no

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
        if self.file_item_no is not None:
            result['file_item_no'] = self.file_item_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('file_item_no') is not None:
            self.file_item_no = m.get('file_item_no')
        return self


class CreateAntchainAtoWithholdRefundRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        period_num: int = None,
        refund_request_no: str = None,
        refund_money: int = None,
        refund_reason: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 第几期
        # 针对用户履约的第几期进行退款申请
        self.period_num = period_num
        # 外部系统传入的退款请求号
        self.refund_request_no = refund_request_no
        # 本次请求的退款金额，单位为分
        # 1234=12.34元
        self.refund_money = refund_money
        # 退款原因
        self.refund_reason = refund_reason

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 128)
        self.validate_required(self.period_num, 'period_num')
        if self.period_num is not None:
            self.validate_minimum(self.period_num, 'period_num', 1)
        self.validate_required(self.refund_request_no, 'refund_request_no')
        if self.refund_request_no is not None:
            self.validate_max_length(self.refund_request_no, 'refund_request_no', 128)
        self.validate_required(self.refund_money, 'refund_money')
        if self.refund_money is not None:
            self.validate_minimum(self.refund_money, 'refund_money', 1)
        if self.refund_reason is not None:
            self.validate_max_length(self.refund_reason, 'refund_reason', 200)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.refund_request_no is not None:
            result['refund_request_no'] = self.refund_request_no
        if self.refund_money is not None:
            result['refund_money'] = self.refund_money
        if self.refund_reason is not None:
            result['refund_reason'] = self.refund_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('refund_request_no') is not None:
            self.refund_request_no = m.get('refund_request_no')
        if m.get('refund_money') is not None:
            self.refund_money = m.get('refund_money')
        if m.get('refund_reason') is not None:
            self.refund_reason = m.get('refund_reason')
        return self


class CreateAntchainAtoWithholdRefundResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        refund_request_no: str = None,
        status: str = None,
        refund_order_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 外部系统传入的退款请求号
        self.refund_request_no = refund_request_no
        # ACCEPT : 受理成功
        self.status = status
        # 请求支付宝的退款单据号
        self.refund_order_no = refund_order_no

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
        if self.refund_request_no is not None:
            result['refund_request_no'] = self.refund_request_no
        if self.status is not None:
            result['status'] = self.status
        if self.refund_order_no is not None:
            result['refund_order_no'] = self.refund_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('refund_request_no') is not None:
            self.refund_request_no = m.get('refund_request_no')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('refund_order_no') is not None:
            self.refund_order_no = m.get('refund_order_no')
        return self


class QueryAntchainAtoWithholdRefundRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        period_num: int = None,
        refund_request_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 几期
        # 针对用户履约的第几期进行退款申请
        self.period_num = period_num
        # 外部系统传入的退款请求号
        self.refund_request_no = refund_request_no

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 128)
        self.validate_required(self.period_num, 'period_num')
        if self.period_num is not None:
            self.validate_minimum(self.period_num, 'period_num', 1)
        self.validate_required(self.refund_request_no, 'refund_request_no')
        if self.refund_request_no is not None:
            self.validate_max_length(self.refund_request_no, 'refund_request_no', 128)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.refund_request_no is not None:
            result['refund_request_no'] = self.refund_request_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('refund_request_no') is not None:
            self.refund_request_no = m.get('refund_request_no')
        return self


class QueryAntchainAtoWithholdRefundResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        refund_request_no: str = None,
        refund_order_no: str = None,
        status: str = None,
        refund_error_msg: str = None,
        total_refund_amount: int = None,
        send_back_amount: int = None,
        gmt_refund_pay: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 外部系统传入的退款请求号
        self.refund_request_no = refund_request_no
        # 请求支付宝的退款单据号
        self.refund_order_no = refund_order_no
        # 退款请求状态
        # ● ACCEPT: 受理成功
        # ● PENDING: 需人工介入
        # ● SUCCESS: 成功
        # ● FAILED : 失败
        self.status = status
        # 退款失败原因
        self.refund_error_msg = refund_error_msg
        # 本笔交易总退款金额，单位为分
        # 12300=123元
        self.total_refund_amount = total_refund_amount
        # 本次退款申请的实际退款金额，单位为分
        # 12300=123元
        self.send_back_amount = send_back_amount
        # 实际退款时间,13位时间戳（毫秒）
        self.gmt_refund_pay = gmt_refund_pay

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
        if self.refund_request_no is not None:
            result['refund_request_no'] = self.refund_request_no
        if self.refund_order_no is not None:
            result['refund_order_no'] = self.refund_order_no
        if self.status is not None:
            result['status'] = self.status
        if self.refund_error_msg is not None:
            result['refund_error_msg'] = self.refund_error_msg
        if self.total_refund_amount is not None:
            result['total_refund_amount'] = self.total_refund_amount
        if self.send_back_amount is not None:
            result['send_back_amount'] = self.send_back_amount
        if self.gmt_refund_pay is not None:
            result['gmt_refund_pay'] = self.gmt_refund_pay
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('refund_request_no') is not None:
            self.refund_request_no = m.get('refund_request_no')
        if m.get('refund_order_no') is not None:
            self.refund_order_no = m.get('refund_order_no')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('refund_error_msg') is not None:
            self.refund_error_msg = m.get('refund_error_msg')
        if m.get('total_refund_amount') is not None:
            self.total_refund_amount = m.get('total_refund_amount')
        if m.get('send_back_amount') is not None:
            self.send_back_amount = m.get('send_back_amount')
        if m.get('gmt_refund_pay') is not None:
            self.gmt_refund_pay = m.get('gmt_refund_pay')
        return self


class UpdateAntchainAtoTradeUserpromiseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_id: str = None,
        term_idx: int = None,
        updated_rental_money: int = None,
        reason: str = None,
        desc: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 商家社会信用代码
        self.merchant_id = merchant_id
        # 修改的用户履约期数
        self.term_idx = term_idx
        # 更新后的租金，单位为分
        # 1234=12.34元
        self.updated_rental_money = updated_rental_money
        # 调整原因，枚举
        # ● A01 : 违章罚金
        # ● A02 : 水电煤费用
        self.reason = reason
        # 调整说明，本说明同步到支付宝账户备注中，需准确填写
        self.desc = desc

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 49)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 199)
        self.validate_required(self.term_idx, 'term_idx')
        self.validate_required(self.updated_rental_money, 'updated_rental_money')
        self.validate_required(self.reason, 'reason')
        if self.reason is not None:
            self.validate_max_length(self.reason, 'reason', 10)
        self.validate_required(self.desc, 'desc')
        if self.desc is not None:
            self.validate_max_length(self.desc, 'desc', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.term_idx is not None:
            result['term_idx'] = self.term_idx
        if self.updated_rental_money is not None:
            result['updated_rental_money'] = self.updated_rental_money
        if self.reason is not None:
            result['reason'] = self.reason
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('term_idx') is not None:
            self.term_idx = m.get('term_idx')
        if m.get('updated_rental_money') is not None:
            self.updated_rental_money = m.get('updated_rental_money')
        if m.get('reason') is not None:
            self.reason = m.get('reason')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class UpdateAntchainAtoTradeUserpromiseResponse(TeaModel):
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


class NotifyAntchainAtoFundFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_id: str = None,
        order_id: str = None,
        sign_no: str = None,
        file_item_no: str = None,
        fund_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单所属商户的统一社会信用代码
        self.merchant_id = merchant_id
        # 商户的订单号
        self.order_id = order_id
        # 签署合同单号
        self.sign_no = sign_no
        # 返回的文件fileItemNo编号
        self.file_item_no = file_item_no
        # 资方统一社会信用代码
        self.fund_id = fund_id

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.sign_no, 'sign_no')
        self.validate_required(self.file_item_no, 'file_item_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.file_item_no is not None:
            result['file_item_no'] = self.file_item_no
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('file_item_no') is not None:
            self.file_item_no = m.get('file_item_no')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        return self


class NotifyAntchainAtoFundFlowResponse(TeaModel):
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


class SyncAntchainAtoFrontIndirectorderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务参数,json.toString
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class SyncAntchainAtoFrontIndirectorderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回值，json字符串
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class SyncAntchainAtoTradeIndirectorderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务参数,json.toString
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class SyncAntchainAtoTradeIndirectorderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回业务参数，json.toString
        self.response_data = response_data

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
        if self.response_data is not None:
            result['response_data'] = self.response_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response_data') is not None:
            self.response_data = m.get('response_data')
        return self


class RegisterAntchainAtoMerchantexpandMerchantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        company_info: CompanyInfo = None,
        legal_info: LegalInfo = None,
        application_info: ApplicationInfo = None,
        expand_mode: str = None,
        sub_tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 公司信息
        self.company_info = company_info
        # 法人信息
        self.legal_info = legal_info
        # 应用信息
        self.application_info = application_info
        # 进件模式 DIRECT(直连进件) AGENT(代理进件)
        self.expand_mode = expand_mode
        # expand_mode=_AGENT_ 必填
        self.sub_tenant_id = sub_tenant_id

    def validate(self):
        self.validate_required(self.company_info, 'company_info')
        if self.company_info:
            self.company_info.validate()
        self.validate_required(self.legal_info, 'legal_info')
        if self.legal_info:
            self.legal_info.validate()
        self.validate_required(self.application_info, 'application_info')
        if self.application_info:
            self.application_info.validate()
        self.validate_required(self.expand_mode, 'expand_mode')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.company_info is not None:
            result['company_info'] = self.company_info.to_map()
        if self.legal_info is not None:
            result['legal_info'] = self.legal_info.to_map()
        if self.application_info is not None:
            result['application_info'] = self.application_info.to_map()
        if self.expand_mode is not None:
            result['expand_mode'] = self.expand_mode
        if self.sub_tenant_id is not None:
            result['sub_tenant_id'] = self.sub_tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('company_info') is not None:
            temp_model = CompanyInfo()
            self.company_info = temp_model.from_map(m['company_info'])
        if m.get('legal_info') is not None:
            temp_model = LegalInfo()
            self.legal_info = temp_model.from_map(m['legal_info'])
        if m.get('application_info') is not None:
            temp_model = ApplicationInfo()
            self.application_info = temp_model.from_map(m['application_info'])
        if m.get('expand_mode') is not None:
            self.expand_mode = m.get('expand_mode')
        if m.get('sub_tenant_id') is not None:
            self.sub_tenant_id = m.get('sub_tenant_id')
        return self


class RegisterAntchainAtoMerchantexpandMerchantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pay_expand_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 进件流水号
        self.pay_expand_id = pay_expand_id

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
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        return self


class UploadAntchainAtoMerchantexpandFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_name: str = None,
        biz_scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件名称 包含后缀
        self.file_name = file_name
        # ● BUSINESS_LICENSE 营业执照 ● CARD_FRONT 身份证正面 ● CARD_BACK 身份证反面 ● SPLITTING 分账
        self.biz_scene = biz_scene

    def validate(self):
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.biz_scene, 'biz_scene')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        return self


class UploadAntchainAtoMerchantexpandFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        upload_url: str = None,
        file_key: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 临时上传文件地址
        self.upload_url = upload_url
        # 文件key
        self.file_key = file_key

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
        if self.upload_url is not None:
            result['upload_url'] = self.upload_url
        if self.file_key is not None:
            result['file_key'] = self.file_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('upload_url') is not None:
            self.upload_url = m.get('upload_url')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        return self


class QueryAntchainAtoMerchantexpandMerchantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        pay_expand_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户入驻返回的进件编号 expand_mode=AGENT必填
        self.pay_expand_id = pay_expand_id

    def validate(self):
        self.validate_required(self.pay_expand_id, 'pay_expand_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        return self


class QueryAntchainAtoMerchantexpandMerchantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        enrollment_status: str = None,
        fail_reason: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商户入驻状态
        # INIT 入驻中
        # SUCCESS 入驻成功
        # FAIL 入驻失败
        self.enrollment_status = enrollment_status
        # 入驻失败原因
        self.fail_reason = fail_reason

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
        if self.enrollment_status is not None:
            result['enrollment_status'] = self.enrollment_status
        if self.fail_reason is not None:
            result['fail_reason'] = self.fail_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('enrollment_status') is not None:
            self.enrollment_status = m.get('enrollment_status')
        if m.get('fail_reason') is not None:
            self.fail_reason = m.get('fail_reason')
        return self


class UploadAntchainAtoSignTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_id: str = None,
        contract_type: str = None,
        agreement_type: str = None,
        pos_conf: str = None,
        template_args: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单所属商户的统一社会信用代码
        self.merchant_id = merchant_id
        # 合同类型
        self.contract_type = contract_type
        # 模板类型
        self.agreement_type = agreement_type
        # 签署区坐标配置
        self.pos_conf = pos_conf
        # 模板参数
        self.template_args = template_args
        # 上传的pdf文件，需要以.pdf后缀结尾
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.contract_type, 'contract_type')
        self.validate_required(self.agreement_type, 'agreement_type')
        self.validate_required(self.pos_conf, 'pos_conf')
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.contract_type is not None:
            result['contract_type'] = self.contract_type
        if self.agreement_type is not None:
            result['agreement_type'] = self.agreement_type
        if self.pos_conf is not None:
            result['pos_conf'] = self.pos_conf
        if self.template_args is not None:
            result['template_args'] = self.template_args
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('contract_type') is not None:
            self.contract_type = m.get('contract_type')
        if m.get('agreement_type') is not None:
            self.agreement_type = m.get('agreement_type')
        if m.get('pos_conf') is not None:
            self.pos_conf = m.get('pos_conf')
        if m.get('template_args') is not None:
            self.template_args = m.get('template_args')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class UploadAntchainAtoSignTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        template_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 上传模板后返回的模板id
        self.template_id = template_id

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
        if self.template_id is not None:
            result['template_id'] = self.template_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        return self


class UploadAntchainAtoFundCreditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no_type: str = None,
        order_no: str = None,
        fund_id: str = None,
        credit_type: str = None,
        credit_name: str = None,
        content_type: str = None,
        file_url: str = None,
        content: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号类型
        self.order_no_type = order_no_type
        # 订单号，或资产包号
        self.order_no = order_no
        # 资方统一社会信用代码
        self.fund_id = fund_id
        # 凭证类型
        self.credit_type = credit_type
        # 凭证名称
        self.credit_name = credit_name
        # 文本类型
        self.content_type = content_type
        # 文本下载链接，如果类型是FILE则必填
        self.file_url = file_url
        # 内容数据，格式为JSON类型文本，如果类型是JSON_TEXT则必填
        self.content = content
        # 商户统一社会信用代码
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.order_no_type, 'order_no_type')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.fund_id, 'fund_id')
        self.validate_required(self.credit_type, 'credit_type')
        self.validate_required(self.content_type, 'content_type')
        self.validate_required(self.merchant_id, 'merchant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no_type is not None:
            result['order_no_type'] = self.order_no_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.credit_type is not None:
            result['credit_type'] = self.credit_type
        if self.credit_name is not None:
            result['credit_name'] = self.credit_name
        if self.content_type is not None:
            result['content_type'] = self.content_type
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.content is not None:
            result['content'] = self.content
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no_type') is not None:
            self.order_no_type = m.get('order_no_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('credit_type') is not None:
            self.credit_type = m.get('credit_type')
        if m.get('credit_name') is not None:
            self.credit_name = m.get('credit_name')
        if m.get('content_type') is not None:
            self.content_type = m.get('content_type')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class UploadAntchainAtoFundCreditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 凭证内容id
        self.content_id = content_id

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
        if self.content_id is not None:
            result['content_id'] = self.content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        return self


class UploadAntchainAtoSignCreditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no_type: str = None,
        order_no: str = None,
        credit_type: str = None,
        credit_name: str = None,
        content_type: str = None,
        file_url: str = None,
        content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号类型
        self.order_no_type = order_no_type
        # 订单号，或资产包号
        self.order_no = order_no
        # 凭证合同类型
        self.credit_type = credit_type
        # 凭证名称
        self.credit_name = credit_name
        # 文本类型
        self.content_type = content_type
        # 文本下载链接，如果类型是FILE则必填
        self.file_url = file_url
        # 内容数据，格式为JSON类型文本，如果类型是JSON_TEXT则必填
        self.content = content

    def validate(self):
        self.validate_required(self.order_no_type, 'order_no_type')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.credit_type, 'credit_type')
        self.validate_required(self.content_type, 'content_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no_type is not None:
            result['order_no_type'] = self.order_no_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.credit_type is not None:
            result['credit_type'] = self.credit_type
        if self.credit_name is not None:
            result['credit_name'] = self.credit_name
        if self.content_type is not None:
            result['content_type'] = self.content_type
        if self.file_url is not None:
            result['file_url'] = self.file_url
        if self.content is not None:
            result['content'] = self.content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no_type') is not None:
            self.order_no_type = m.get('order_no_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('credit_type') is not None:
            self.credit_type = m.get('credit_type')
        if m.get('credit_name') is not None:
            self.credit_name = m.get('credit_name')
        if m.get('content_type') is not None:
            self.content_type = m.get('content_type')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        if m.get('content') is not None:
            self.content = m.get('content')
        return self


class UploadAntchainAtoSignCreditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 凭证内容id
        self.content_id = content_id

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
        if self.content_id is not None:
            result['content_id'] = self.content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        return self


class QueryAntchainAtoFundCreditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no_type: str = None,
        order_no: str = None,
        fund_id: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号类型
        self.order_no_type = order_no_type
        # 订单号，或资产包号
        self.order_no = order_no
        # 资方统一社会信用代码
        self.fund_id = fund_id
        # 商户统一社会信用代码
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.order_no_type, 'order_no_type')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.fund_id, 'fund_id')
        self.validate_required(self.merchant_id, 'merchant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no_type is not None:
            result['order_no_type'] = self.order_no_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no_type') is not None:
            self.order_no_type = m.get('order_no_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class QueryAntchainAtoFundCreditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 内容信息
        self.content_info = content_info

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
        if self.content_info is not None:
            result['content_info'] = self.content_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content_info') is not None:
            self.content_info = m.get('content_info')
        return self


class QueryAntchainAtoSignCreditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no_type: str = None,
        order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号类型
        self.order_no_type = order_no_type
        # 订单号，或资产包号
        self.order_no = order_no

    def validate(self):
        self.validate_required(self.order_no_type, 'order_no_type')
        self.validate_required(self.order_no, 'order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no_type is not None:
            result['order_no_type'] = self.order_no_type
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no_type') is not None:
            self.order_no_type = m.get('order_no_type')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class QueryAntchainAtoSignCreditResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 内容信息
        self.content_info = content_info

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
        if self.content_info is not None:
            result['content_info'] = self.content_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content_info') is not None:
            self.content_info = m.get('content_info')
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


