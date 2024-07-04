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


class PromiseInfo(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        return self


class UserSyncInfo(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
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


class AgreementPage(TeaModel):
    def __init__(
        self,
        agreement_id: str = None,
        merchant_name: str = None,
        tenant_id: str = None,
        product_main_class: str = None,
        agreement_type: str = None,
        sign_status: str = None,
    ):
        # 协议id
        self.agreement_id = agreement_id
        # 代理企业名称
        self.merchant_name = merchant_name
        # 租户8位id
        self.tenant_id = tenant_id
        # 业务类型 枚举
        self.product_main_class = product_main_class
        # 协议类型 枚举
        self.agreement_type = agreement_type
        # 租户签约状态 枚举
        self.sign_status = sign_status

    def validate(self):
        self.validate_required(self.agreement_id, 'agreement_id')
        self.validate_required(self.merchant_name, 'merchant_name')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.product_main_class, 'product_main_class')
        self.validate_required(self.agreement_type, 'agreement_type')
        self.validate_required(self.sign_status, 'sign_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.agreement_id is not None:
            result['agreement_id'] = self.agreement_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.product_main_class is not None:
            result['product_main_class'] = self.product_main_class
        if self.agreement_type is not None:
            result['agreement_type'] = self.agreement_type
        if self.sign_status is not None:
            result['sign_status'] = self.sign_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('agreement_id') is not None:
            self.agreement_id = m.get('agreement_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('product_main_class') is not None:
            self.product_main_class = m.get('product_main_class')
        if m.get('agreement_type') is not None:
            self.agreement_type = m.get('agreement_type')
        if m.get('sign_status') is not None:
            self.sign_status = m.get('sign_status')
        return self


class RiskScene(TeaModel):
    def __init__(
        self,
        scene_code: str = None,
        decision: str = None,
    ):
        # 风险场景编码
        self.scene_code = scene_code
        # 该场景的风险决策结果
        self.decision = decision

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.decision, 'decision')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.decision is not None:
            result['decision'] = self.decision
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        return self


class RiskStrategy(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        decision: str = None,
        scene_code: str = None,
    ):
        # 策略ID
        self.id = id
        # 策略名称
        self.name = name
        # 策略决策结果
        self.decision = decision
        # 风险场景编码
        self.scene_code = scene_code

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.decision, 'decision')
        self.validate_required(self.scene_code, 'scene_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.decision is not None:
            result['decision'] = self.decision
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        return self


class RelationPage(TeaModel):
    def __init__(
        self,
        relation_id: str = None,
        company_name: str = None,
        merchant_id: str = None,
        status: str = None,
    ):
        # 分账关系id
        self.relation_id = relation_id
        # 分账公司名称
        self.company_name = company_name
        # 分账公司名称统一社会信用代码
        self.merchant_id = merchant_id
        # 审核状态
        self.status = status

    def validate(self):
        self.validate_required(self.relation_id, 'relation_id')
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.relation_id is not None:
            result['relation_id'] = self.relation_id
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('relation_id') is not None:
            self.relation_id = m.get('relation_id')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class MerchantAgentPage(TeaModel):
    def __init__(
        self,
        pay_expand_id: str = None,
        agent_name: str = None,
        tenant_id: str = None,
        biz_type: str = None,
        pay_expand_status: str = None,
    ):
        # 进件id
        self.pay_expand_id = pay_expand_id
        # 
        # 代理企业名称
        self.agent_name = agent_name
        # 租户8位id
        self.tenant_id = tenant_id
        # 业务类型
        self.biz_type = biz_type
        # 进件审核状态 枚举
        self.pay_expand_status = pay_expand_status

    def validate(self):
        self.validate_required(self.pay_expand_id, 'pay_expand_id')
        self.validate_required(self.agent_name, 'agent_name')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.pay_expand_status, 'pay_expand_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        if self.agent_name is not None:
            result['agent_name'] = self.agent_name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.pay_expand_status is not None:
            result['pay_expand_status'] = self.pay_expand_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        if m.get('agent_name') is not None:
            self.agent_name = m.get('agent_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('pay_expand_status') is not None:
            self.pay_expand_status = m.get('pay_expand_status')
        return self


class OrderMsgInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        msg_id: str = None,
        msg_publish_type: str = None,
        msg_create_time: str = None,
        msg_status: str = None,
        msg_retry_time: int = None,
        msg_callback_url: str = None,
        msg_content: str = None,
    ):
        # 订单id
        # 
        self.order_id = order_id
        # 消息ID
        # 
        self.msg_id = msg_id
        # 消息类型
        # 
        self.msg_publish_type = msg_publish_type
        # 消息创建时间
        # 
        self.msg_create_time = msg_create_time
        # 消息投递状态 SUCCESS 成功 FAIL 失败 WAIT 等待投递重试
        self.msg_status = msg_status
        # 消息重投次数
        # 
        self.msg_retry_time = msg_retry_time
        # 消息回调地址
        self.msg_callback_url = msg_callback_url
        # 消息体内容
        self.msg_content = msg_content

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.msg_id, 'msg_id')
        self.validate_required(self.msg_publish_type, 'msg_publish_type')
        self.validate_required(self.msg_create_time, 'msg_create_time')
        if self.msg_create_time is not None:
            self.validate_pattern(self.msg_create_time, 'msg_create_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.msg_status, 'msg_status')
        self.validate_required(self.msg_retry_time, 'msg_retry_time')
        self.validate_required(self.msg_callback_url, 'msg_callback_url')
        self.validate_required(self.msg_content, 'msg_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.msg_id is not None:
            result['msg_id'] = self.msg_id
        if self.msg_publish_type is not None:
            result['msg_publish_type'] = self.msg_publish_type
        if self.msg_create_time is not None:
            result['msg_create_time'] = self.msg_create_time
        if self.msg_status is not None:
            result['msg_status'] = self.msg_status
        if self.msg_retry_time is not None:
            result['msg_retry_time'] = self.msg_retry_time
        if self.msg_callback_url is not None:
            result['msg_callback_url'] = self.msg_callback_url
        if self.msg_content is not None:
            result['msg_content'] = self.msg_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('msg_id') is not None:
            self.msg_id = m.get('msg_id')
        if m.get('msg_publish_type') is not None:
            self.msg_publish_type = m.get('msg_publish_type')
        if m.get('msg_create_time') is not None:
            self.msg_create_time = m.get('msg_create_time')
        if m.get('msg_status') is not None:
            self.msg_status = m.get('msg_status')
        if m.get('msg_retry_time') is not None:
            self.msg_retry_time = m.get('msg_retry_time')
        if m.get('msg_callback_url') is not None:
            self.msg_callback_url = m.get('msg_callback_url')
        if m.get('msg_content') is not None:
            self.msg_content = m.get('msg_content')
        return self


class OrderInfo(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
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


class GoodsInfo(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        return self


class PageQuery(TeaModel):
    def __init__(
        self,
        page_size: int = None,
        page_index: int = None,
    ):
        # 页大小
        self.page_size = page_size
        # 当前页
        self.page_index = page_index

    def validate(self):
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.page_index, 'page_index')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_index is not None:
            result['page_index'] = self.page_index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
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


class AuditInfo(TeaModel):
    def __init__(
        self,
        stage: str = None,
        audit_subject: str = None,
        status: str = None,
        apply_date_str: str = None,
        fail_reason: str = None,
    ):
        # 审核步骤
        self.stage = stage
        # 审核主体
        self.audit_subject = audit_subject
        # 审核状态
        self.status = status
        # 审核时间
        self.apply_date_str = apply_date_str
        # 审核失败描述
        self.fail_reason = fail_reason

    def validate(self):
        self.validate_required(self.stage, 'stage')
        self.validate_required(self.audit_subject, 'audit_subject')
        self.validate_required(self.status, 'status')
        self.validate_required(self.apply_date_str, 'apply_date_str')
        self.validate_required(self.fail_reason, 'fail_reason')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.stage is not None:
            result['stage'] = self.stage
        if self.audit_subject is not None:
            result['audit_subject'] = self.audit_subject
        if self.status is not None:
            result['status'] = self.status
        if self.apply_date_str is not None:
            result['apply_date_str'] = self.apply_date_str
        if self.fail_reason is not None:
            result['fail_reason'] = self.fail_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('stage') is not None:
            self.stage = m.get('stage')
        if m.get('audit_subject') is not None:
            self.audit_subject = m.get('audit_subject')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('apply_date_str') is not None:
            self.apply_date_str = m.get('apply_date_str')
        if m.get('fail_reason') is not None:
            self.fail_reason = m.get('fail_reason')
        return self


class RiskModel(TeaModel):
    def __init__(
        self,
        scene_code: str = None,
        score: str = None,
    ):
        # 风险场景编码
        self.scene_code = scene_code
        # 该风险场景的风险分值
        self.score = score

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.score, 'score')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.score is not None:
            result['score'] = self.score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('score') is not None:
            self.score = m.get('score')
        return self


class OrderGoodsModel(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
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


class SyncFundSplittingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        fund_no: str = None,
        order_id: str = None,
        merchant_tenant_id: str = None,
        term_num: int = None,
        deduction_time: str = None,
        deduction_amount: int = None,
        merchant_split_amount: int = None,
        fund_split_amount: int = None,
        other_split_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 资方订单号
        self.fund_no = fund_no
        # 商户的订单号
        self.order_id = order_id
        # 商户的数科租户ID
        self.merchant_tenant_id = merchant_tenant_id
        # 第几期，例如：2表示第二期
        self.term_num = term_num
        # 扣款时间， yyyy-MM-dd HH:mm:ss 格式
        self.deduction_time = deduction_time
        # 扣款金额，单位精确到分， 例如：12462300为124623.00元
        self.deduction_amount = deduction_amount
        # 商户分账金额，单位精确到分，比如：666601 = 6666.01元
        self.merchant_split_amount = merchant_split_amount
        # 资方分账金额，单位精确到分。比如：666610 = 6666.10元
        self.fund_split_amount = fund_split_amount
        # 其他参与方分账信息，JSON格式的数组，样例：
        # [{"participants":"参与方A","amount":666600,"accountNo":"777223","accountType":"ICBC"}]
        self.other_split_info = other_split_info

    def validate(self):
        self.validate_required(self.fund_no, 'fund_no')
        if self.fund_no is not None:
            self.validate_max_length(self.fund_no, 'fund_no', 50)
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 50)
        self.validate_required(self.term_num, 'term_num')
        self.validate_required(self.deduction_time, 'deduction_time')
        self.validate_required(self.deduction_amount, 'deduction_amount')
        self.validate_required(self.merchant_split_amount, 'merchant_split_amount')
        self.validate_required(self.fund_split_amount, 'fund_split_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.fund_no is not None:
            result['fund_no'] = self.fund_no
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.term_num is not None:
            result['term_num'] = self.term_num
        if self.deduction_time is not None:
            result['deduction_time'] = self.deduction_time
        if self.deduction_amount is not None:
            result['deduction_amount'] = self.deduction_amount
        if self.merchant_split_amount is not None:
            result['merchant_split_amount'] = self.merchant_split_amount
        if self.fund_split_amount is not None:
            result['fund_split_amount'] = self.fund_split_amount
        if self.other_split_info is not None:
            result['other_split_info'] = self.other_split_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fund_no') is not None:
            self.fund_no = m.get('fund_no')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('term_num') is not None:
            self.term_num = m.get('term_num')
        if m.get('deduction_time') is not None:
            self.deduction_time = m.get('deduction_time')
        if m.get('deduction_amount') is not None:
            self.deduction_amount = m.get('deduction_amount')
        if m.get('merchant_split_amount') is not None:
            self.merchant_split_amount = m.get('merchant_split_amount')
        if m.get('fund_split_amount') is not None:
            self.fund_split_amount = m.get('fund_split_amount')
        if m.get('other_split_info') is not None:
            self.other_split_info = m.get('other_split_info')
        return self


class SyncFundSplittingResponse(TeaModel):
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
        # 流水同步描述信息
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


class SyncFundOrderfinancialRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_tenant_id: str = None,
        application_id: str = None,
        status: int = None,
        reason: str = None,
        extras: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_id = order_id
        # 商户在数科的租户ID
        self.merchant_tenant_id = merchant_tenant_id
        # 订单融资唯一标识
        self.application_id = application_id
        # 订单融资状态：1-成功；2-失败
        self.status = status
        # 融资结果描述，长度不超过64
        self.reason = reason
        # 额外信息
        self.extras = extras

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 50)
        self.validate_required(self.application_id, 'application_id')
        if self.application_id is not None:
            self.validate_max_length(self.application_id, 'application_id', 128)
        self.validate_required(self.status, 'status')
        if self.reason is not None:
            self.validate_max_length(self.reason, 'reason', 64)

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
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.application_id is not None:
            result['application_id'] = self.application_id
        if self.status is not None:
            result['status'] = self.status
        if self.reason is not None:
            result['reason'] = self.reason
        if self.extras is not None:
            result['extras'] = self.extras
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('application_id') is not None:
            self.application_id = m.get('application_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('reason') is not None:
            self.reason = m.get('reason')
        if m.get('extras') is not None:
            self.extras = m.get('extras')
        return self


class SyncFundOrderfinancialResponse(TeaModel):
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
        # 结果描述信息
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


class SyncFundWithholdingcontractRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_tenant_id: str = None,
        withholding_contract_id: str = None,
        extra_info: str = None,
        status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号
        self.order_id = order_id
        # 商家在数科注册的租户id
        self.merchant_tenant_id = merchant_tenant_id
        # 代扣协议号
        self.withholding_contract_id = withholding_contract_id
        # json的字符串，存储额外信息
        self.extra_info = extra_info
        # 签署状态：
        # - ACCEPT : 接受
        # - REFUSE : 拒绝
        # - TIMEOUT : 超时
        self.status = status

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 50)
        self.validate_required(self.withholding_contract_id, 'withholding_contract_id')
        if self.withholding_contract_id is not None:
            self.validate_max_length(self.withholding_contract_id, 'withholding_contract_id', 100)
        self.validate_required(self.status, 'status')

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
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.withholding_contract_id is not None:
            result['withholding_contract_id'] = self.withholding_contract_id
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('withholding_contract_id') is not None:
            self.withholding_contract_id = m.get('withholding_contract_id')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class SyncFundWithholdingcontractResponse(TeaModel):
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
        # 存储成功
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


class SyncFundOrderfulfillmentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_tenant_id: str = None,
        order_id: str = None,
        lease_term_index: int = None,
        remain_term: int = None,
        total_term: int = None,
        rental_return_state: str = None,
        rental_money: int = None,
        penalty_fee_money: int = None,
        total_money: int = None,
        return_time: str = None,
        return_way: str = None,
        return_voucher_serial: str = None,
        bank_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户id
        self.merchant_tenant_id = merchant_tenant_id
        # 订单id
        self.order_id = order_id
        # 租期编号
        self.lease_term_index = lease_term_index
        # 剩余归还期数
        self.remain_term = remain_term
        # 总期数
        self.total_term = total_term
        # 租金归还状态，
        # RETURN_FULL : 足额归还 【终态】
        # NOT_RETURN : 未归还
        # CANCEL : 取消 【终态】
        self.rental_return_state = rental_return_state
        # 租金归还金额,精确到分，即1234表示12.34元
        self.rental_money = rental_money
        # 罚息金额，分，1234表示12.34元
        self.penalty_fee_money = penalty_fee_money
        # 总金额，单位分
        self.total_money = total_money
        # 归还时间，格式为"2019-07-31 12:00:00"
        self.return_time = return_time
        # 归还方式，
        # ANTDIGITAL： 数科代扣
        # FUND : 资方代扣
        # BANK : 银行转账
        # WECHAT : 微信支付
        self.return_way = return_way
        # 还款凭证编号
        self.return_voucher_serial = return_voucher_serial
        # 银行名字
        self.bank_name = bank_name

    def validate(self):
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 49)
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 49)
        self.validate_required(self.lease_term_index, 'lease_term_index')
        self.validate_required(self.remain_term, 'remain_term')
        self.validate_required(self.total_term, 'total_term')
        self.validate_required(self.rental_return_state, 'rental_return_state')
        self.validate_required(self.rental_money, 'rental_money')
        self.validate_required(self.penalty_fee_money, 'penalty_fee_money')
        self.validate_required(self.total_money, 'total_money')
        if self.return_voucher_serial is not None:
            self.validate_max_length(self.return_voucher_serial, 'return_voucher_serial', 127)
        if self.bank_name is not None:
            self.validate_max_length(self.bank_name, 'bank_name', 127)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.lease_term_index is not None:
            result['lease_term_index'] = self.lease_term_index
        if self.remain_term is not None:
            result['remain_term'] = self.remain_term
        if self.total_term is not None:
            result['total_term'] = self.total_term
        if self.rental_return_state is not None:
            result['rental_return_state'] = self.rental_return_state
        if self.rental_money is not None:
            result['rental_money'] = self.rental_money
        if self.penalty_fee_money is not None:
            result['penalty_fee_money'] = self.penalty_fee_money
        if self.total_money is not None:
            result['total_money'] = self.total_money
        if self.return_time is not None:
            result['return_time'] = self.return_time
        if self.return_way is not None:
            result['return_way'] = self.return_way
        if self.return_voucher_serial is not None:
            result['return_voucher_serial'] = self.return_voucher_serial
        if self.bank_name is not None:
            result['bank_name'] = self.bank_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('lease_term_index') is not None:
            self.lease_term_index = m.get('lease_term_index')
        if m.get('remain_term') is not None:
            self.remain_term = m.get('remain_term')
        if m.get('total_term') is not None:
            self.total_term = m.get('total_term')
        if m.get('rental_return_state') is not None:
            self.rental_return_state = m.get('rental_return_state')
        if m.get('rental_money') is not None:
            self.rental_money = m.get('rental_money')
        if m.get('penalty_fee_money') is not None:
            self.penalty_fee_money = m.get('penalty_fee_money')
        if m.get('total_money') is not None:
            self.total_money = m.get('total_money')
        if m.get('return_time') is not None:
            self.return_time = m.get('return_time')
        if m.get('return_way') is not None:
            self.return_way = m.get('return_way')
        if m.get('return_voucher_serial') is not None:
            self.return_voucher_serial = m.get('return_voucher_serial')
        if m.get('bank_name') is not None:
            self.bank_name = m.get('bank_name')
        return self


class SyncFundOrderfulfillmentResponse(TeaModel):
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
        # 添加成功
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


class GetFundOrderfulfillmentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
        merchant_tenant_id: str = None,
        term_idx: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id
        # 租赁订单所属商家租户id
        self.merchant_tenant_id = merchant_tenant_id
        # 期数
        # 如果填入，获取term_idx下的履约记录
        # 如果不填入，获取order_id下的所有履约记录
        self.term_idx = term_idx

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 49)
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 49)

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
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
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
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('term_idx') is not None:
            self.term_idx = m.get('term_idx')
        return self


class GetFundOrderfulfillmentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_fulfillment_data_list: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单履约信息的列表数组
        # List<OrderFulfillment> 的jsonArray.toString
        self.order_fulfillment_data_list = order_fulfillment_data_list

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
        if self.order_fulfillment_data_list is not None:
            result['order_fulfillment_data_list'] = self.order_fulfillment_data_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_fulfillment_data_list') is not None:
            self.order_fulfillment_data_list = m.get('order_fulfillment_data_list')
        return self


class UploadFundFlowRequest(TeaModel):
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


class UploadFundFlowResponse(TeaModel):
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


class GetFundFlowRequest(TeaModel):
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


class GetFundFlowResponse(TeaModel):
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


class RefuseFundFlowRequest(TeaModel):
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


class RefuseFundFlowResponse(TeaModel):
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


class AuthFundFlowRequest(TeaModel):
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


class AuthFundFlowResponse(TeaModel):
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


class CancelFundPlanRequest(TeaModel):
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


class CancelFundPlanResponse(TeaModel):
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


class CallbackFundNotifyRequest(TeaModel):
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


class CallbackFundNotifyResponse(TeaModel):
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


class SyncFundMerchantpromiseRequest(TeaModel):
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


class SyncFundMerchantpromiseResponse(TeaModel):
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


class SyncFundFinanceloanresultsRequest(TeaModel):
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


class SyncFundFinanceloanresultsResponse(TeaModel):
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


class GetFundUserpromiseRequest(TeaModel):
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


class GetFundUserpromiseResponse(TeaModel):
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


class GetFundUserperformanceRequest(TeaModel):
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


class GetFundUserperformanceResponse(TeaModel):
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


class GetFundMerchantperformanceRequest(TeaModel):
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


class GetFundMerchantperformanceResponse(TeaModel):
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


class GetFundOrderfullinfoRequest(TeaModel):
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


class GetFundOrderfullinfoResponse(TeaModel):
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


class NotifyFundFlowRequest(TeaModel):
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


class NotifyFundFlowResponse(TeaModel):
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


class UploadFundCreditRequest(TeaModel):
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


class UploadFundCreditResponse(TeaModel):
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


class QueryFundCreditRequest(TeaModel):
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


class QueryFundCreditResponse(TeaModel):
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


class GetInnerProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_tenant_id: str = None,
        merchant_id: str = None,
        product_id: str = None,
        product_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户在数科的租户id
        self.merchant_tenant_id = merchant_tenant_id
        # 商户统一社会信用代码
        self.merchant_id = merchant_id
        # 商品id
        self.product_id = product_id
        # 商品版本
        self.product_version = product_version

    def validate(self):
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 32)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 199)
        self.validate_required(self.product_id, 'product_id')
        if self.product_id is not None:
            self.validate_max_length(self.product_id, 'product_id', 32)
        self.validate_required(self.product_version, 'product_version')
        if self.product_version is not None:
            self.validate_max_length(self.product_version, 'product_version', 10)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.product_id is not None:
            result['product_id'] = self.product_id
        if self.product_version is not None:
            result['product_version'] = self.product_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        if m.get('product_version') is not None:
            self.product_version = m.get('product_version')
        return self


class GetInnerProductResponse(TeaModel):
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
        # {}json字符串
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


class GetInnerTenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户在数科的租户id
        self.merchant_tenant_id = merchant_tenant_id

    def validate(self):
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 32)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        return self


class GetInnerTenantResponse(TeaModel):
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
        # {}租户信息
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


class SyncInnerMeterforwholeorderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_tenant_id: str = None,
        merchant_id: str = None,
        meter_product_code: str = None,
        order_id: str = None,
        order_rent_term: int = None,
        order_total_money: int = None,
        sys_name: str = None,
        order_product_subclass: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户租户id
        self.merchant_tenant_id = merchant_tenant_id
        # 商户统一社会信用代码
        self.merchant_id = merchant_id
        # 商户购买的产品code
        self.meter_product_code = meter_product_code
        # 订单id
        self.order_id = order_id
        # 订单总租期
        self.order_rent_term = order_rent_term
        # 订单总租金，单位为分
        self.order_total_money = order_total_money
        # 系统名称
        self.sys_name = sys_name
        # 订单产品的二级类目
        self.order_product_subclass = order_product_subclass

    def validate(self):
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 32)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 199)
        self.validate_required(self.meter_product_code, 'meter_product_code')
        if self.meter_product_code is not None:
            self.validate_max_length(self.meter_product_code, 'meter_product_code', 64)
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 49)
        self.validate_required(self.order_rent_term, 'order_rent_term')
        self.validate_required(self.order_total_money, 'order_total_money')
        self.validate_required(self.sys_name, 'sys_name')
        if self.sys_name is not None:
            self.validate_max_length(self.sys_name, 'sys_name', 32)
        self.validate_required(self.order_product_subclass, 'order_product_subclass')
        if self.order_product_subclass is not None:
            self.validate_max_length(self.order_product_subclass, 'order_product_subclass', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.meter_product_code is not None:
            result['meter_product_code'] = self.meter_product_code
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.order_rent_term is not None:
            result['order_rent_term'] = self.order_rent_term
        if self.order_total_money is not None:
            result['order_total_money'] = self.order_total_money
        if self.sys_name is not None:
            result['sys_name'] = self.sys_name
        if self.order_product_subclass is not None:
            result['order_product_subclass'] = self.order_product_subclass
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('meter_product_code') is not None:
            self.meter_product_code = m.get('meter_product_code')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('order_rent_term') is not None:
            self.order_rent_term = m.get('order_rent_term')
        if m.get('order_total_money') is not None:
            self.order_total_money = m.get('order_total_money')
        if m.get('sys_name') is not None:
            self.sys_name = m.get('sys_name')
        if m.get('order_product_subclass') is not None:
            self.order_product_subclass = m.get('order_product_subclass')
        return self


class SyncInnerMeterforwholeorderResponse(TeaModel):
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


class SyncInnerMeterforagsignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        merchant_tenant_id: str = None,
        merchant_id: str = None,
        meter_product_code: str = None,
        sys_name: str = None,
        order_id: str = None,
        sign_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户租户id
        self.merchant_tenant_id = merchant_tenant_id
        # 商户社会信用代码
        self.merchant_id = merchant_id
        # 计量上报Code
        self.meter_product_code = meter_product_code
        # 系统名字
        self.sys_name = sys_name
        # 订单id
        self.order_id = order_id
        # 合同编号
        self.sign_no = sign_no

    def validate(self):
        self.validate_required(self.merchant_tenant_id, 'merchant_tenant_id')
        if self.merchant_tenant_id is not None:
            self.validate_max_length(self.merchant_tenant_id, 'merchant_tenant_id', 32)
        self.validate_required(self.merchant_id, 'merchant_id')
        if self.merchant_id is not None:
            self.validate_max_length(self.merchant_id, 'merchant_id', 199)
        self.validate_required(self.meter_product_code, 'meter_product_code')
        if self.meter_product_code is not None:
            self.validate_max_length(self.meter_product_code, 'meter_product_code', 64)
        self.validate_required(self.sys_name, 'sys_name')
        if self.sys_name is not None:
            self.validate_max_length(self.sys_name, 'sys_name', 32)
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 49)
        self.validate_required(self.sign_no, 'sign_no')
        if self.sign_no is not None:
            self.validate_max_length(self.sign_no, 'sign_no', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.merchant_tenant_id is not None:
            result['merchant_tenant_id'] = self.merchant_tenant_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.meter_product_code is not None:
            result['meter_product_code'] = self.meter_product_code
        if self.sys_name is not None:
            result['sys_name'] = self.sys_name
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('merchant_tenant_id') is not None:
            self.merchant_tenant_id = m.get('merchant_tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('meter_product_code') is not None:
            self.meter_product_code = m.get('meter_product_code')
        if m.get('sys_name') is not None:
            self.sys_name = m.get('sys_name')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        return self


class SyncInnerMeterforagsignResponse(TeaModel):
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


class AllInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_info: PageQuery = None,
        tenant_id: str = None,
        template_code: str = None,
        template_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分页查询结构体
        self.page_info = page_info
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 魔法库模板code
        self.template_code = template_code
        # 魔法库模板文件名称
        self.template_name = template_name

    def validate(self):
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_name is not None:
            result['template_name'] = self.template_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_name') is not None:
            self.template_name = m.get('template_name')
        return self


class AllInnerTemplateResponse(TeaModel):
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
        # 模板列表数据
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


class ListInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_info: PageQuery = None,
        tenant_id: str = None,
        template_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 分页查询
        self.page_info = page_info
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 魔法库模板code
        self.template_code = template_code

    def validate(self):
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_code is not None:
            result['template_code'] = self.template_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        return self


class ListInnerTemplateResponse(TeaModel):
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
        # 模板列表数据
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


class DetailInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 魔法库模板code
        self.template_code = template_code
        # 魔法库模板版本
        self.template_version = template_version

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        return self


class DetailInnerTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        template_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模板详情信息
        self.template_info = template_info

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
        if self.template_info is not None:
            result['template_info'] = self.template_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('template_info') is not None:
            self.template_info = m.get('template_info')
        return self


class CreateInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_name: str = None,
        file_key: str = None,
        file_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 创建的模板名称
        self.template_name = template_name
        # 文件oss存储的key
        self.file_key = file_key
        # 模板文件的名称
        self.file_name = file_name

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_name, 'template_name')
        if self.template_name is not None:
            self.validate_max_length(self.template_name, 'template_name', 32)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_name is not None:
            result['template_name'] = self.template_name
        if self.file_key is not None:
            result['file_key'] = self.file_key
        if self.file_name is not None:
            result['file_name'] = self.file_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_name') is not None:
            self.template_name = m.get('template_name')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        return self


class CreateInnerTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        template_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 魔法库模板code
        self.template_code = template_code

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
        if self.template_code is not None:
            result['template_code'] = self.template_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        return self


class SaveInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version: str = None,
        preview_address: str = None,
        template_element_list: str = None,
        file_key: str = None,
        confirm: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 魔法库模板code
        self.template_code = template_code
        # 魔法库模板版本
        self.template_version = template_version
        # 文件预览地址
        self.preview_address = preview_address
        # 创建模板的元素列表
        self.template_element_list = template_element_list
        # 文件oss存储的key
        self.file_key = file_key
        # 是否确认保存。点击”保存“按钮传false、点击”下一步“按钮传true
        self.confirm = confirm

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')
        self.validate_required(self.preview_address, 'preview_address')
        self.validate_required(self.file_key, 'file_key')
        self.validate_required(self.confirm, 'confirm')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        if self.preview_address is not None:
            result['preview_address'] = self.preview_address
        if self.template_element_list is not None:
            result['template_element_list'] = self.template_element_list
        if self.file_key is not None:
            result['file_key'] = self.file_key
        if self.confirm is not None:
            result['confirm'] = self.confirm
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        if m.get('preview_address') is not None:
            self.preview_address = m.get('preview_address')
        if m.get('template_element_list') is not None:
            self.template_element_list = m.get('template_element_list')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        if m.get('confirm') is not None:
            self.confirm = m.get('confirm')
        return self


class SaveInnerTemplateResponse(TeaModel):
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


class SaveInnerSignfieldsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version: str = None,
        sign_field_list: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 魔法库模板code
        self.template_code = template_code
        # 魔法库模板版本
        self.template_version = template_version
        # 模板签署区列表
        self.sign_field_list = sign_field_list

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')
        self.validate_required(self.sign_field_list, 'sign_field_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        if self.sign_field_list is not None:
            result['sign_field_list'] = self.sign_field_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        if m.get('sign_field_list') is not None:
            self.sign_field_list = m.get('sign_field_list')
        return self


class SaveInnerSignfieldsResponse(TeaModel):
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


class PublishInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 魔法库模板code
        self.template_code = template_code
        # 魔法库版本id
        self.template_version_id = template_version_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version_id, 'template_version_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version_id is not None:
            result['template_version_id'] = self.template_version_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version_id') is not None:
            self.template_version_id = m.get('template_version_id')
        return self


class PublishInnerTemplateResponse(TeaModel):
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


class PreviewInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        file_key: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 文件oss存储的key
        self.file_key = file_key

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.file_key, 'file_key')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.file_key is not None:
            result['file_key'] = self.file_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        return self


class PreviewInnerTemplateResponse(TeaModel):
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
        # 预览接口返回
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


class DeleteInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version: str = None,
        template_version_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 魔法库模板code
        self.template_code = template_code
        # 魔法库模板版本
        self.template_version = template_version
        # 魔法库模板版本id
        self.template_version_id = template_version_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')
        self.validate_required(self.template_version_id, 'template_version_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        if self.template_version_id is not None:
            result['template_version_id'] = self.template_version_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        if m.get('template_version_id') is not None:
            self.template_version_id = m.get('template_version_id')
        return self


class DeleteInnerTemplateResponse(TeaModel):
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


class CloneInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        voucher_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 模板code
        self.template_code = template_code
        # 魔法库对应模板的模板复制id
        self.voucher_id = voucher_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.voucher_id, 'voucher_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.voucher_id is not None:
            result['voucher_id'] = self.voucher_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('voucher_id') is not None:
            self.voucher_id = m.get('voucher_id')
        return self


class CloneInnerTemplateResponse(TeaModel):
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


class UploadInnerFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        file_name: str = None,
        biz_scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 文件名称
        self.file_name = file_name
        # ● BUSINESS_LICENSE 营业执照
        # ● CARD_FRONT 身份证正面
        # ● CARD_BACK 身份证反面
        # ● SPLITTING 分账
        # ● CONTRACT_TEMPLATE 合同模板
        self.biz_scene = biz_scene

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
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
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        return self


class UploadInnerFileResponse(TeaModel):
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
        # 临时上传地址
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


class DownloadInnerFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        file_key: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 文件key
        self.file_key = file_key

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.file_key, 'file_key')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.file_key is not None:
            result['file_key'] = self.file_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        return self


class DownloadInnerFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        download_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文件临时下载地址
        self.download_url = download_url

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
        if self.download_url is not None:
            result['download_url'] = self.download_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('download_url') is not None:
            self.download_url = m.get('download_url')
        return self


class GetInnerTemplateofficeurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 魔法库模板code
        self.template_code = template_code
        # 魔法库模板版本
        self.template_version = template_version

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        return self


class GetInnerTemplateofficeurlResponse(TeaModel):
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
        # 返回值
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


class RefreshInnerTemplatetokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        access_token: str = None,
        refresh_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # accessToken
        self.access_token = access_token
        # refreshToekn
        self.refresh_token = refresh_token

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.access_token, 'access_token')
        self.validate_required(self.refresh_token, 'refresh_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.access_token is not None:
            result['access_token'] = self.access_token
        if self.refresh_token is not None:
            result['refresh_token'] = self.refresh_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        if m.get('refresh_token') is not None:
            self.refresh_token = m.get('refresh_token')
        return self


class RefreshInnerTemplatetokenResponse(TeaModel):
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
        # 返回值
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


class CreateInnerTemplatetextareaRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version: str = None,
        component_type: str = None,
        component_name: str = None,
        required: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 模板编码
        self.template_code = template_code
        # 模板版本号
        self.template_version = template_version
        # 组件类型，INPUT:单行文本 TEXTAREA:多行文本
        self.component_type = component_type
        # 组件名称（占位符）
        self.component_name = component_name
        # 是否必填
        self.required = required

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')
        self.validate_required(self.component_type, 'component_type')
        self.validate_required(self.component_name, 'component_name')
        self.validate_required(self.required, 'required')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        if self.component_type is not None:
            result['component_type'] = self.component_type
        if self.component_name is not None:
            result['component_name'] = self.component_name
        if self.required is not None:
            result['required'] = self.required
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        if m.get('component_type') is not None:
            self.component_type = m.get('component_type')
        if m.get('component_name') is not None:
            self.component_name = m.get('component_name')
        if m.get('required') is not None:
            self.required = m.get('required')
        return self


class CreateInnerTemplatetextareaResponse(TeaModel):
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
        # 创建成功的文本域组件信息
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


class QueryInnerTemplateimageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        page_info: PageQuery = None,
        template_code: str = None,
        template_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 分页查询结构体
        self.page_info = page_info
        # 魔法库模板code
        self.template_code = template_code
        # 魔法库模板版本
        self.template_version = template_version

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        return self


class QueryInnerTemplateimageResponse(TeaModel):
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
        # 模板图片列表
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


class CreateInnerFunddividerelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        relation_id: str = None,
        company_name: str = None,
        merchant_id: str = None,
        contract_files: List[FileInfo] = None,
        desc: str = None,
        alipay_pid: str = None,
        alipay_account: str = None,
        submit: str = None,
        user_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 第一次暂存或提交可以不传，由后端生成
        self.relation_id = relation_id
        # 分账公司名称
        self.company_name = company_name
        # 分账公司社会信用代码
        self.merchant_id = merchant_id
        # 分账合同或协议
        self.contract_files = contract_files
        # 分账关系说明
        self.desc = desc
        # 分账方企业pid
        self.alipay_pid = alipay_pid
        # 分账方企业支付宝账号
        self.alipay_account = alipay_account
        # 是否直接提交
        # SUBMITTED 直接提交
        # STAGE 暂存
        self.submit = submit
        # 操作人名称
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        if self.contract_files:
            for k in self.contract_files:
                if k:
                    k.validate()
        self.validate_required(self.submit, 'submit')
        self.validate_required(self.user_name, 'user_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.relation_id is not None:
            result['relation_id'] = self.relation_id
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        result['contract_files'] = []
        if self.contract_files is not None:
            for k in self.contract_files:
                result['contract_files'].append(k.to_map() if k else None)
        if self.desc is not None:
            result['desc'] = self.desc
        if self.alipay_pid is not None:
            result['alipay_pid'] = self.alipay_pid
        if self.alipay_account is not None:
            result['alipay_account'] = self.alipay_account
        if self.submit is not None:
            result['submit'] = self.submit
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('relation_id') is not None:
            self.relation_id = m.get('relation_id')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        self.contract_files = []
        if m.get('contract_files') is not None:
            for k in m.get('contract_files'):
                temp_model = FileInfo()
                self.contract_files.append(temp_model.from_map(k))
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('alipay_pid') is not None:
            self.alipay_pid = m.get('alipay_pid')
        if m.get('alipay_account') is not None:
            self.alipay_account = m.get('alipay_account')
        if m.get('submit') is not None:
            self.submit = m.get('submit')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class CreateInnerFunddividerelationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        relation_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分账关系id
        self.relation_id = relation_id

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
        if self.relation_id is not None:
            result['relation_id'] = self.relation_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('relation_id') is not None:
            self.relation_id = m.get('relation_id')
        return self


class SubmitInnerFunddividerelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        relation_id: str = None,
        user_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 分账关系id
        self.relation_id = relation_id
        # 操作人名称
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.relation_id, 'relation_id')
        self.validate_required(self.user_name, 'user_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.relation_id is not None:
            result['relation_id'] = self.relation_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('relation_id') is not None:
            self.relation_id = m.get('relation_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class SubmitInnerFunddividerelationResponse(TeaModel):
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


class QueryInnerFunddividerelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        relation_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 分账关系id
        self.relation_id = relation_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.relation_id, 'relation_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.relation_id is not None:
            result['relation_id'] = self.relation_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('relation_id') is not None:
            self.relation_id = m.get('relation_id')
        return self


class QueryInnerFunddividerelationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        company_name: str = None,
        subject_merchant_id: str = None,
        merchant_id: str = None,
        contract_files: List[FileInfo] = None,
        desc: str = None,
        alipay_pid: str = None,
        alipay_account: str = None,
        audit_infos: List[AuditInfo] = None,
        relation_status: str = None,
        relation_fail_reason: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分账公司名称
        self.company_name = company_name
        # 分账主体企业统一社会信用代码
        self.subject_merchant_id = subject_merchant_id
        # 分账对象统一社会信用代码
        self.merchant_id = merchant_id
        # 分账合同或协议
        self.contract_files = contract_files
        # 分账关系说明
        self.desc = desc
        # 分账方企业pid
        self.alipay_pid = alipay_pid
        # 分账方企业支付宝账号
        self.alipay_account = alipay_account
        # 审核列表
        self.audit_infos = audit_infos
        # INIT:待提交 AUDIT:审批中 AUDIT_PASSED:审批通过 AUDIT_NOT_PASSED:审批不通过
        self.relation_status = relation_status
        # 分账关系绑定失败原因
        self.relation_fail_reason = relation_fail_reason

    def validate(self):
        if self.contract_files:
            for k in self.contract_files:
                if k:
                    k.validate()
        if self.audit_infos:
            for k in self.audit_infos:
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
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.subject_merchant_id is not None:
            result['subject_merchant_id'] = self.subject_merchant_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        result['contract_files'] = []
        if self.contract_files is not None:
            for k in self.contract_files:
                result['contract_files'].append(k.to_map() if k else None)
        if self.desc is not None:
            result['desc'] = self.desc
        if self.alipay_pid is not None:
            result['alipay_pid'] = self.alipay_pid
        if self.alipay_account is not None:
            result['alipay_account'] = self.alipay_account
        result['audit_infos'] = []
        if self.audit_infos is not None:
            for k in self.audit_infos:
                result['audit_infos'].append(k.to_map() if k else None)
        if self.relation_status is not None:
            result['relation_status'] = self.relation_status
        if self.relation_fail_reason is not None:
            result['relation_fail_reason'] = self.relation_fail_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('subject_merchant_id') is not None:
            self.subject_merchant_id = m.get('subject_merchant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        self.contract_files = []
        if m.get('contract_files') is not None:
            for k in m.get('contract_files'):
                temp_model = FileInfo()
                self.contract_files.append(temp_model.from_map(k))
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('alipay_pid') is not None:
            self.alipay_pid = m.get('alipay_pid')
        if m.get('alipay_account') is not None:
            self.alipay_account = m.get('alipay_account')
        self.audit_infos = []
        if m.get('audit_infos') is not None:
            for k in m.get('audit_infos'):
                temp_model = AuditInfo()
                self.audit_infos.append(temp_model.from_map(k))
        if m.get('relation_status') is not None:
            self.relation_status = m.get('relation_status')
        if m.get('relation_fail_reason') is not None:
            self.relation_fail_reason = m.get('relation_fail_reason')
        return self


class PagequeryInnerFunddividerelationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        page_info: PageQuery = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 分页查询对象
        self.page_info = page_info

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class PagequeryInnerFunddividerelationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_size: int = None,
        relations: List[RelationPage] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据总量
        self.total_size = total_size
        # 分账关系页对象列表
        self.relations = relations

    def validate(self):
        if self.relations:
            for k in self.relations:
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
        if self.total_size is not None:
            result['total_size'] = self.total_size
        result['relations'] = []
        if self.relations is not None:
            for k in self.relations:
                result['relations'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_size') is not None:
            self.total_size = m.get('total_size')
        self.relations = []
        if m.get('relations') is not None:
            for k in m.get('relations'):
                temp_model = RelationPage()
                self.relations.append(temp_model.from_map(k))
        return self


class CreateInnerMerchantagreementRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        agreement_id: str = None,
        sign_action: str = None,
        user_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 协议编号
        self.agreement_id = agreement_id
        # 签署动作
        self.sign_action = sign_action
        # 操作人名称
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.agreement_id, 'agreement_id')
        self.validate_required(self.sign_action, 'sign_action')
        self.validate_required(self.user_name, 'user_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.agreement_id is not None:
            result['agreement_id'] = self.agreement_id
        if self.sign_action is not None:
            result['sign_action'] = self.sign_action
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('agreement_id') is not None:
            self.agreement_id = m.get('agreement_id')
        if m.get('sign_action') is not None:
            self.sign_action = m.get('sign_action')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class CreateInnerMerchantagreementResponse(TeaModel):
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


class QueryInnerMerchantagreementRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        agreement_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 协议id
        self.agreement_id = agreement_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.agreement_id, 'agreement_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.agreement_id is not None:
            result['agreement_id'] = self.agreement_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('agreement_id') is not None:
            self.agreement_id = m.get('agreement_id')
        return self


class QueryInnerMerchantagreementResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_status: str = None,
        sign_date_str: str = None,
        agreement_content: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签约状态 枚举
        # TOBE 待签
        # FAIL 签约失败
        # SUCCESS 签约成功
        self.sign_status = sign_status
        # 签约时间
        self.sign_date_str = sign_date_str
        # 协议内容 富文本
        self.agreement_content = agreement_content

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
        if self.sign_status is not None:
            result['sign_status'] = self.sign_status
        if self.sign_date_str is not None:
            result['sign_date_str'] = self.sign_date_str
        if self.agreement_content is not None:
            result['agreement_content'] = self.agreement_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_status') is not None:
            self.sign_status = m.get('sign_status')
        if m.get('sign_date_str') is not None:
            self.sign_date_str = m.get('sign_date_str')
        if m.get('agreement_content') is not None:
            self.agreement_content = m.get('agreement_content')
        return self


class PagequeryInnerMerchantagreementRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        page_info: PageQuery = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 分页对象
        self.page_info = page_info

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class PagequeryInnerMerchantagreementResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_size: int = None,
        agreement_page: List[AgreementPage] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据总量
        self.total_size = total_size
        # 协议分页对象
        self.agreement_page = agreement_page

    def validate(self):
        if self.agreement_page:
            for k in self.agreement_page:
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
        if self.total_size is not None:
            result['total_size'] = self.total_size
        result['agreement_page'] = []
        if self.agreement_page is not None:
            for k in self.agreement_page:
                result['agreement_page'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_size') is not None:
            self.total_size = m.get('total_size')
        self.agreement_page = []
        if m.get('agreement_page') is not None:
            for k in m.get('agreement_page'):
                temp_model = AgreementPage()
                self.agreement_page.append(temp_model.from_map(k))
        return self


class CreateInnerMerchantpayexpandRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        company_info: CompanyInfo = None,
        legal_info: LegalInfo = None,
        application_info: ApplicationInfo = None,
        submit: str = None,
        expand_mode: str = None,
        sub_tenant_id: str = None,
        user_name: str = None,
        pay_expand_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户ID
        self.tenant_id = tenant_id
        # 公司信息
        self.company_info = company_info
        # 法人信息
        self.legal_info = legal_info
        # 应用信息
        self.application_info = application_info
        # 是否直接提交
        # SUBMITTED 直接提交
        # STAGE 暂存
        self.submit = submit
        # 进件模式
        # DIRECT(直连进件)
        # AGENT(代理进件)
        self.expand_mode = expand_mode
        # expand_mode=_AGENT_ 必填
        self.sub_tenant_id = sub_tenant_id
        # 操作人名称
        self.user_name = user_name
        # 第一次暂存或保存可以不传，后端直接生成
        self.pay_expand_id = pay_expand_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.company_info, 'company_info')
        if self.company_info:
            self.company_info.validate()
        self.validate_required(self.legal_info, 'legal_info')
        if self.legal_info:
            self.legal_info.validate()
        self.validate_required(self.application_info, 'application_info')
        if self.application_info:
            self.application_info.validate()
        self.validate_required(self.submit, 'submit')
        self.validate_required(self.expand_mode, 'expand_mode')
        self.validate_required(self.user_name, 'user_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.company_info is not None:
            result['company_info'] = self.company_info.to_map()
        if self.legal_info is not None:
            result['legal_info'] = self.legal_info.to_map()
        if self.application_info is not None:
            result['application_info'] = self.application_info.to_map()
        if self.submit is not None:
            result['submit'] = self.submit
        if self.expand_mode is not None:
            result['expand_mode'] = self.expand_mode
        if self.sub_tenant_id is not None:
            result['sub_tenant_id'] = self.sub_tenant_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('company_info') is not None:
            temp_model = CompanyInfo()
            self.company_info = temp_model.from_map(m['company_info'])
        if m.get('legal_info') is not None:
            temp_model = LegalInfo()
            self.legal_info = temp_model.from_map(m['legal_info'])
        if m.get('application_info') is not None:
            temp_model = ApplicationInfo()
            self.application_info = temp_model.from_map(m['application_info'])
        if m.get('submit') is not None:
            self.submit = m.get('submit')
        if m.get('expand_mode') is not None:
            self.expand_mode = m.get('expand_mode')
        if m.get('sub_tenant_id') is not None:
            self.sub_tenant_id = m.get('sub_tenant_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        return self


class CreateInnerMerchantpayexpandResponse(TeaModel):
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


class SubmitInnerMerchantpayexpandRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        pay_expand_id: str = None,
        user_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 进件id
        self.pay_expand_id = pay_expand_id
        # 操作人名称
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.pay_expand_id, 'pay_expand_id')
        self.validate_required(self.user_name, 'user_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class SubmitInnerMerchantpayexpandResponse(TeaModel):
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


class QueryInnerMerchantpayexpandRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        pay_expand_id: str = None,
        expand_mode: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 进件id expand_mode=AGENT 必填 DIRECT可以根据tenant_id推断
        self.pay_expand_id = pay_expand_id
        # 进件模式 DIRECT(直连进件) AGENT(代理进件)
        self.expand_mode = expand_mode

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        if self.expand_mode is not None:
            result['expand_mode'] = self.expand_mode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        if m.get('expand_mode') is not None:
            self.expand_mode = m.get('expand_mode')
        return self


class QueryInnerMerchantpayexpandResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        company_info: CompanyInfo = None,
        legal_info: LegalInfo = None,
        application_info: ApplicationInfo = None,
        audit_infos: List[AuditInfo] = None,
        pay_expand_id: str = None,
        expand_mode: str = None,
        expand_status: str = None,
        expand_fail_reason: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 公司信息
        self.company_info = company_info
        # 法人信息
        self.legal_info = legal_info
        # 应用信息
        self.application_info = application_info
        # 审核列表
        self.audit_infos = audit_infos
        # 进件流水号
        self.pay_expand_id = pay_expand_id
        # 进件模式 DIRECT(直连进件) AGENT(代理进件)
        self.expand_mode = expand_mode
        # INIT:草稿态 SUB_MERCHANT_CREDIT:二级户商户签约中 AUDIT:审核中 AUDIT_PASSED:进件成功 AUDIT_NOT_PASSED:进件失败 MERCHANT_CONFIRM:待商户确认
        self.expand_status = expand_status
        # 进件失败描述
        self.expand_fail_reason = expand_fail_reason

    def validate(self):
        if self.company_info:
            self.company_info.validate()
        if self.legal_info:
            self.legal_info.validate()
        if self.application_info:
            self.application_info.validate()
        if self.audit_infos:
            for k in self.audit_infos:
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
        if self.company_info is not None:
            result['company_info'] = self.company_info.to_map()
        if self.legal_info is not None:
            result['legal_info'] = self.legal_info.to_map()
        if self.application_info is not None:
            result['application_info'] = self.application_info.to_map()
        result['audit_infos'] = []
        if self.audit_infos is not None:
            for k in self.audit_infos:
                result['audit_infos'].append(k.to_map() if k else None)
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        if self.expand_mode is not None:
            result['expand_mode'] = self.expand_mode
        if self.expand_status is not None:
            result['expand_status'] = self.expand_status
        if self.expand_fail_reason is not None:
            result['expand_fail_reason'] = self.expand_fail_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('company_info') is not None:
            temp_model = CompanyInfo()
            self.company_info = temp_model.from_map(m['company_info'])
        if m.get('legal_info') is not None:
            temp_model = LegalInfo()
            self.legal_info = temp_model.from_map(m['legal_info'])
        if m.get('application_info') is not None:
            temp_model = ApplicationInfo()
            self.application_info = temp_model.from_map(m['application_info'])
        self.audit_infos = []
        if m.get('audit_infos') is not None:
            for k in m.get('audit_infos'):
                temp_model = AuditInfo()
                self.audit_infos.append(temp_model.from_map(k))
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        if m.get('expand_mode') is not None:
            self.expand_mode = m.get('expand_mode')
        if m.get('expand_status') is not None:
            self.expand_status = m.get('expand_status')
        if m.get('expand_fail_reason') is not None:
            self.expand_fail_reason = m.get('expand_fail_reason')
        return self


class PagequeryInnerMerchantagentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        agent_name: str = None,
        page_info: PageQuery = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        self.tenant_id = tenant_id
        # 代理商户名称
        self.agent_name = agent_name
        # 分页对象
        self.page_info = page_info

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.agent_name, 'agent_name')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.agent_name is not None:
            result['agent_name'] = self.agent_name
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('agent_name') is not None:
            self.agent_name = m.get('agent_name')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class PagequeryInnerMerchantagentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_size: int = None,
        merchant_agent_page: List[MerchantAgentPage] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据总量
        self.total_size = total_size
        # 代理租户分页对象
        self.merchant_agent_page = merchant_agent_page

    def validate(self):
        if self.merchant_agent_page:
            for k in self.merchant_agent_page:
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
        if self.total_size is not None:
            result['total_size'] = self.total_size
        result['merchant_agent_page'] = []
        if self.merchant_agent_page is not None:
            for k in self.merchant_agent_page:
                result['merchant_agent_page'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_size') is not None:
            self.total_size = m.get('total_size')
        self.merchant_agent_page = []
        if m.get('merchant_agent_page') is not None:
            for k in m.get('merchant_agent_page'):
                temp_model = MerchantAgentPage()
                self.merchant_agent_page.append(temp_model.from_map(k))
        return self


class CloneInnerTemplatefileaddressRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        file_key: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 模板编码
        self.template_code = template_code
        # 文件key
        self.file_key = file_key

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.file_key, 'file_key')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.file_key is not None:
            result['file_key'] = self.file_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        return self


class CloneInnerTemplatefileaddressResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        file_key: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 拷贝后的文件key
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
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        return self


class QueryInnerSignfieldsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 魔法库模板code
        self.template_code = template_code
        # 魔法库模板版本
        self.template_version = template_version

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        return self


class QueryInnerSignfieldsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign_field_list: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 签署区列表
        self.sign_field_list = sign_field_list

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
        if self.sign_field_list is not None:
            result['sign_field_list'] = self.sign_field_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign_field_list') is not None:
            self.sign_field_list = m.get('sign_field_list')
        return self


class SyncInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        source_template_code: str = None,
        target_template_name: str = None,
        scene: str = None,
        source_template_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 来源魔法库模板code
        self.source_template_code = source_template_code
        # 目标魔法库模板名称
        self.target_template_name = target_template_name
        # 模板同步的场景，值参考：CREATE_TEMPLATE、SYNC_PROD
        self.scene = scene
        # 魔法库来源模板版本
        self.source_template_version = source_template_version

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.source_template_code, 'source_template_code')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.source_template_version, 'source_template_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.source_template_code is not None:
            result['source_template_code'] = self.source_template_code
        if self.target_template_name is not None:
            result['target_template_name'] = self.target_template_name
        if self.scene is not None:
            result['scene'] = self.scene
        if self.source_template_version is not None:
            result['source_template_version'] = self.source_template_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('source_template_code') is not None:
            self.source_template_code = m.get('source_template_code')
        if m.get('target_template_name') is not None:
            self.target_template_name = m.get('target_template_name')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('source_template_version') is not None:
            self.source_template_version = m.get('source_template_version')
        return self


class SyncInnerTemplateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        target_template_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 同步后的新模板code
        self.target_template_code = target_template_code

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
        if self.target_template_code is not None:
            result['target_template_code'] = self.target_template_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('target_template_code') is not None:
            self.target_template_code = m.get('target_template_code')
        return self


class UpdateInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_version_id: str = None,
        template_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商户对应租户ID
        self.tenant_id = tenant_id
        # 魔法库版本id
        self.template_version_id = template_version_id
        # 模板名称
        self.template_name = template_name

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_version_id, 'template_version_id')
        self.validate_required(self.template_name, 'template_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_version_id is not None:
            result['template_version_id'] = self.template_version_id
        if self.template_name is not None:
            result['template_name'] = self.template_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_version_id') is not None:
            self.template_version_id = m.get('template_version_id')
        if m.get('template_name') is not None:
            self.template_name = m.get('template_name')
        return self


class UpdateInnerTemplateResponse(TeaModel):
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


class QueryInnerTemplateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        template_code: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 模板code
        self.template_code = template_code
        # 租户8位id
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryInnerTemplateResponse(TeaModel):
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
        # 模板的基本信息，json格式
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


class QueryInnerTemplateelementlinkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 模板code
        self.template_code = template_code
        # 模板版本
        self.template_version = template_version

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        return self


class QueryInnerTemplateelementlinkResponse(TeaModel):
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
        # 模板元素列表，json格式
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


class QueryInnerTemplateversionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        template_code: str = None,
        template_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 模板编码
        self.template_code = template_code
        # 模板的版本号，示例：1、2、3等
        self.template_version = template_version

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        return self


class QueryInnerTemplateversionResponse(TeaModel):
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
        # 模板的版本详情信息
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


class PagequeryInnerOrdermsgRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        order_id: str = None,
        msg_publish_type: str = None,
        msg_create_time_from: str = None,
        msg_create_time_to: str = None,
        env: str = None,
        page_info: PageQuery = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户8位id
        # 
        self.tenant_id = tenant_id
        # 订单ID
        self.order_id = order_id
        # 消息类型
        self.msg_publish_type = msg_publish_type
        # 消息创建时间起始
        self.msg_create_time_from = msg_create_time_from
        # 消息创建时间结束
        self.msg_create_time_to = msg_create_time_to
        # SANDBOX 沙箱 ；PROD 生产
        self.env = env
        # 分页查询对象
        self.page_info = page_info

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.order_id, 'order_id')
        if self.msg_create_time_from is not None:
            self.validate_pattern(self.msg_create_time_from, 'msg_create_time_from', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.msg_create_time_to is not None:
            self.validate_pattern(self.msg_create_time_to, 'msg_create_time_to', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.env, 'env')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.msg_publish_type is not None:
            result['msg_publish_type'] = self.msg_publish_type
        if self.msg_create_time_from is not None:
            result['msg_create_time_from'] = self.msg_create_time_from
        if self.msg_create_time_to is not None:
            result['msg_create_time_to'] = self.msg_create_time_to
        if self.env is not None:
            result['env'] = self.env
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('msg_publish_type') is not None:
            self.msg_publish_type = m.get('msg_publish_type')
        if m.get('msg_create_time_from') is not None:
            self.msg_create_time_from = m.get('msg_create_time_from')
        if m.get('msg_create_time_to') is not None:
            self.msg_create_time_to = m.get('msg_create_time_to')
        if m.get('env') is not None:
            self.env = m.get('env')
        if m.get('page_info') is not None:
            temp_model = PageQuery()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class PagequeryInnerOrdermsgResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_size: int = None,
        order_msg_infos: List[OrderMsgInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据总量
        self.total_size = total_size
        # 消息内容列表
        self.order_msg_infos = order_msg_infos

    def validate(self):
        if self.order_msg_infos:
            for k in self.order_msg_infos:
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
        if self.total_size is not None:
            result['total_size'] = self.total_size
        result['order_msg_infos'] = []
        if self.order_msg_infos is not None:
            for k in self.order_msg_infos:
                result['order_msg_infos'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_size') is not None:
            self.total_size = m.get('total_size')
        self.order_msg_infos = []
        if m.get('order_msg_infos') is not None:
            for k in m.get('order_msg_infos'):
                temp_model = OrderMsgInfo()
                self.order_msg_infos.append(temp_model.from_map(k))
        return self


class RetryInnerOrdermsgRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        env: str = None,
        order_id: str = None,
        msg_id: str = None,
        using_new_callback_url: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户ID
        self.tenant_id = tenant_id
        # SANDBOX 沙箱 PROD 生产
        self.env = env
        # 订单id
        # 
        self.order_id = order_id
        # 消息ID
        # 
        self.msg_id = msg_id
        # 使用租户新回调地址
        self.using_new_callback_url = using_new_callback_url

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.env, 'env')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.msg_id, 'msg_id')
        self.validate_required(self.using_new_callback_url, 'using_new_callback_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.env is not None:
            result['env'] = self.env
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.msg_id is not None:
            result['msg_id'] = self.msg_id
        if self.using_new_callback_url is not None:
            result['using_new_callback_url'] = self.using_new_callback_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('env') is not None:
            self.env = m.get('env')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('msg_id') is not None:
            self.msg_id = m.get('msg_id')
        if m.get('using_new_callback_url') is not None:
            self.using_new_callback_url = m.get('using_new_callback_url')
        return self


class RetryInnerOrdermsgResponse(TeaModel):
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


class RegisterMerchantexpandMerchantRequest(TeaModel):
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


class RegisterMerchantexpandMerchantResponse(TeaModel):
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


class UploadMerchantexpandFileRequest(TeaModel):
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


class UploadMerchantexpandFileResponse(TeaModel):
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


class QueryMerchantexpandMerchantRequest(TeaModel):
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


class QueryMerchantexpandMerchantResponse(TeaModel):
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


class CreateRealpersonFacevrfRequest(TeaModel):
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


class CreateRealpersonFacevrfResponse(TeaModel):
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


class QueryRealpersonFacevrfRequest(TeaModel):
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


class QueryRealpersonFacevrfResponse(TeaModel):
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


class QueryRiskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        user_name: str = None,
        cert_no: str = None,
        mobile: str = None,
        ip: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 账户ID
        self.user_id = user_id
        # 用户姓名
        self.user_name = user_name
        # 用户证件号码
        self.cert_no = cert_no
        # 用户手机号码
        self.mobile = mobile
        # 用户ip地址
        self.ip = ip

    def validate(self):
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.mobile, 'mobile')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.ip is not None:
            result['ip'] = self.ip
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('ip') is not None:
            self.ip = m.get('ip')
        return self


class QueryRiskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        security_id: str = None,
        decision: str = None,
        scenes: List[RiskScene] = None,
        strategies: List[RiskStrategy] = None,
        models: List[RiskModel] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求唯一ID标识，为空则是异常
        self.security_id = security_id
        # 总风险决策结果，枚举值为：reject[拒绝],validate[待定],accept[通过]。
        self.decision = decision
        # 风险场景的决策结果
        self.scenes = scenes
        # 策略结果详情
        self.strategies = strategies
        # 模型结果详情
        self.models = models

    def validate(self):
        if self.scenes:
            for k in self.scenes:
                if k:
                    k.validate()
        if self.strategies:
            for k in self.strategies:
                if k:
                    k.validate()
        if self.models:
            for k in self.models:
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
        if self.security_id is not None:
            result['security_id'] = self.security_id
        if self.decision is not None:
            result['decision'] = self.decision
        result['scenes'] = []
        if self.scenes is not None:
            for k in self.scenes:
                result['scenes'].append(k.to_map() if k else None)
        result['strategies'] = []
        if self.strategies is not None:
            for k in self.strategies:
                result['strategies'].append(k.to_map() if k else None)
        result['models'] = []
        if self.models is not None:
            for k in self.models:
                result['models'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('security_id') is not None:
            self.security_id = m.get('security_id')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        self.scenes = []
        if m.get('scenes') is not None:
            for k in m.get('scenes'):
                temp_model = RiskScene()
                self.scenes.append(temp_model.from_map(k))
        self.strategies = []
        if m.get('strategies') is not None:
            for k in m.get('strategies'):
                temp_model = RiskStrategy()
                self.strategies.append(temp_model.from_map(k))
        self.models = []
        if m.get('models') is not None:
            for k in m.get('models'):
                temp_model = RiskModel()
                self.models.append(temp_model.from_map(k))
        return self


class AllSignTemplateRequest(TeaModel):
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


class AllSignTemplateResponse(TeaModel):
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


class SubmitSignFlowRequest(TeaModel):
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


class SubmitSignFlowResponse(TeaModel):
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


class GetSignFlowRequest(TeaModel):
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


class GetSignFlowResponse(TeaModel):
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


class AuthSignFlowRequest(TeaModel):
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


class AuthSignFlowResponse(TeaModel):
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


class SubmitFrontSignRequest(TeaModel):
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


class SubmitFrontSignResponse(TeaModel):
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


class UploadSignFlowRequest(TeaModel):
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


class UploadSignFlowResponse(TeaModel):
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


class UploadSignTemplateRequest(TeaModel):
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


class UploadSignTemplateResponse(TeaModel):
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


class UploadSignCreditRequest(TeaModel):
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
        merchant_id: str = None,
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
        # 商户统一社会信用代码
        self.merchant_id = merchant_id

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


class UploadSignCreditResponse(TeaModel):
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


class QuerySignCreditRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no_type: str = None,
        order_no: str = None,
        merchant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号类型
        self.order_no_type = order_no_type
        # 订单号，或资产包号
        self.order_no = order_no
        # 商户统一社会信用代码
        self.merchant_id = merchant_id

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
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class QuerySignCreditResponse(TeaModel):
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


class SyncTradeRequest(TeaModel):
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


class SyncTradeResponse(TeaModel):
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


class GetTradeRequest(TeaModel):
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


class GetTradeResponse(TeaModel):
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


class SyncFrontTradeRequest(TeaModel):
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


class SyncFrontTradeResponse(TeaModel):
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


class SyncTradeFinanceloanapplyRequest(TeaModel):
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


class SyncTradeFinanceloanapplyResponse(TeaModel):
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


class GetTradeMerchantfulfillmentRequest(TeaModel):
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


class GetTradeMerchantfulfillmentResponse(TeaModel):
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


class GetTradeUserperformanceRequest(TeaModel):
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


class GetTradeUserperformanceResponse(TeaModel):
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


class GetTradeMerchantperformanceRequest(TeaModel):
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


class GetTradeMerchantperformanceResponse(TeaModel):
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


class UpdateTradeUserpromiseRequest(TeaModel):
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


class UpdateTradeUserpromiseResponse(TeaModel):
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


class SyncFrontIndirectorderRequest(TeaModel):
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


class SyncFrontIndirectorderResponse(TeaModel):
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


class SyncTradeIndirectorderRequest(TeaModel):
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


class SyncTradeIndirectorderResponse(TeaModel):
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


class CreateWithholdSignRequest(TeaModel):
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


class CreateWithholdSignResponse(TeaModel):
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


class QueryWithholdSignRequest(TeaModel):
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


class QueryWithholdSignResponse(TeaModel):
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


class UnbindWithholdSignRequest(TeaModel):
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


class UnbindWithholdSignResponse(TeaModel):
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


class CancelWithholdPlanRequest(TeaModel):
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


class CancelWithholdPlanResponse(TeaModel):
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


class RepayWithholdPlanRequest(TeaModel):
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


class RepayWithholdPlanResponse(TeaModel):
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


class RetryWithholdPlanRequest(TeaModel):
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


class RetryWithholdPlanResponse(TeaModel):
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


class ConfirmWithholdSignasyncunsignRequest(TeaModel):
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


class ConfirmWithholdSignasyncunsignResponse(TeaModel):
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


class CreateWithholdActivepayRequest(TeaModel):
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


class CreateWithholdActivepayResponse(TeaModel):
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


class QueryWithholdActivepayRequest(TeaModel):
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


class QueryWithholdActivepayResponse(TeaModel):
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


class CancelWithholdActivepayRequest(TeaModel):
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


class CancelWithholdActivepayResponse(TeaModel):
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


class CreateWithholdRefundRequest(TeaModel):
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


class CreateWithholdRefundResponse(TeaModel):
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


class QueryWithholdRefundRequest(TeaModel):
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


class QueryWithholdRefundResponse(TeaModel):
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


