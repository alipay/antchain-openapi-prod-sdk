# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel
from typing import List, BinaryIO


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


class CardInfo(TeaModel):
    def __init__(
        self,
        account_holder_name: str = None,
        account_no: str = None,
        account_inst_name: str = None,
        account_inst_id: str = None,
        usage_type: str = None,
        bank_code: str = None,
        account_inst_province: str = None,
        account_inst_city: str = None,
        account_branch_name: str = None,
    ):
        # 卡户名
        self.account_holder_name = account_holder_name
        # 卡号
        self.account_no = account_no
        # 银行名称
        self.account_inst_name = account_inst_name
        # 银行缩写
        self.account_inst_id = account_inst_id
        # 账号使用类型
        # 对公-01
        # 对私-02
        self.usage_type = usage_type
        # 联行号
        self.bank_code = bank_code
        # 开户行所在省份
        self.account_inst_province = account_inst_province
        # 开户行所在城市
        self.account_inst_city = account_inst_city
        # 开户行支行名称
        self.account_branch_name = account_branch_name

    def validate(self):
        self.validate_required(self.account_holder_name, 'account_holder_name')
        self.validate_required(self.account_no, 'account_no')
        self.validate_required(self.account_inst_name, 'account_inst_name')
        self.validate_required(self.account_inst_id, 'account_inst_id')
        self.validate_required(self.usage_type, 'usage_type')
        self.validate_required(self.account_inst_province, 'account_inst_province')
        self.validate_required(self.account_inst_city, 'account_inst_city')
        self.validate_required(self.account_branch_name, 'account_branch_name')

    def to_map(self):
        result = dict()
        if self.account_holder_name is not None:
            result['account_holder_name'] = self.account_holder_name
        if self.account_no is not None:
            result['account_no'] = self.account_no
        if self.account_inst_name is not None:
            result['account_inst_name'] = self.account_inst_name
        if self.account_inst_id is not None:
            result['account_inst_id'] = self.account_inst_id
        if self.usage_type is not None:
            result['usage_type'] = self.usage_type
        if self.bank_code is not None:
            result['bank_code'] = self.bank_code
        if self.account_inst_province is not None:
            result['account_inst_province'] = self.account_inst_province
        if self.account_inst_city is not None:
            result['account_inst_city'] = self.account_inst_city
        if self.account_branch_name is not None:
            result['account_branch_name'] = self.account_branch_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('account_holder_name') is not None:
            self.account_holder_name = m.get('account_holder_name')
        if m.get('account_no') is not None:
            self.account_no = m.get('account_no')
        if m.get('account_inst_name') is not None:
            self.account_inst_name = m.get('account_inst_name')
        if m.get('account_inst_id') is not None:
            self.account_inst_id = m.get('account_inst_id')
        if m.get('usage_type') is not None:
            self.usage_type = m.get('usage_type')
        if m.get('bank_code') is not None:
            self.bank_code = m.get('bank_code')
        if m.get('account_inst_province') is not None:
            self.account_inst_province = m.get('account_inst_province')
        if m.get('account_inst_city') is not None:
            self.account_inst_city = m.get('account_inst_city')
        if m.get('account_branch_name') is not None:
            self.account_branch_name = m.get('account_branch_name')
        return self


class AddressInfo(TeaModel):
    def __init__(
        self,
        province_code: str = None,
        city_code: str = None,
        district_code: str = None,
        address: str = None,
    ):
        # 省份编码
        self.province_code = province_code
        # 城市编码
        self.city_code = city_code
        # 区域编码
        self.district_code = district_code
        # 详细地址
        self.address = address

    def validate(self):
        self.validate_required(self.province_code, 'province_code')
        self.validate_required(self.city_code, 'city_code')
        self.validate_required(self.district_code, 'district_code')
        self.validate_required(self.address, 'address')

    def to_map(self):
        result = dict()
        if self.province_code is not None:
            result['province_code'] = self.province_code
        if self.city_code is not None:
            result['city_code'] = self.city_code
        if self.district_code is not None:
            result['district_code'] = self.district_code
        if self.address is not None:
            result['address'] = self.address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('province_code') is not None:
            self.province_code = m.get('province_code')
        if m.get('city_code') is not None:
            self.city_code = m.get('city_code')
        if m.get('district_code') is not None:
            self.district_code = m.get('district_code')
        if m.get('address') is not None:
            self.address = m.get('address')
        return self


class SettleRule(TeaModel):
    def __init__(
        self,
        default_settle_type: str = None,
        default_settle_target: str = None,
    ):
        # 结算类型， bankCard-表示结算到银行卡；alipayAccount-表示结算到支付宝账号
        self.default_settle_type = default_settle_type
        # 结算目标
        # 如果settle_type = bankCard, 这里填写银行卡卡号;
        # 如果settle_type = alipayAccount, 这里填写支付宝账号登录号, 且要求与商户名称name同名
        self.default_settle_target = default_settle_target

    def validate(self):
        self.validate_required(self.default_settle_type, 'default_settle_type')
        self.validate_required(self.default_settle_target, 'default_settle_target')

    def to_map(self):
        result = dict()
        if self.default_settle_type is not None:
            result['default_settle_type'] = self.default_settle_type
        if self.default_settle_target is not None:
            result['default_settle_target'] = self.default_settle_target
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('default_settle_type') is not None:
            self.default_settle_type = m.get('default_settle_type')
        if m.get('default_settle_target') is not None:
            self.default_settle_target = m.get('default_settle_target')
        return self


class ContactInfo(TeaModel):
    def __init__(
        self,
        name: str = None,
        mobile: str = None,
        phone: str = None,
        type: str = None,
    ):
        # 联系人姓名
        self.name = name
        # 联系人手机号码
        self.mobile = mobile
        # 联系人电话号码
        self.phone = phone
        # 联系人类型, LEGAL_PERSON-法人；CONTROLLER-实际控制人；AGENT-代理人；OTHER-其他
        self.type = type

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.mobile, 'mobile')
        self.validate_required(self.type, 'type')

    def to_map(self):
        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.phone is not None:
            result['phone'] = self.phone
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class MerchantOrderInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        merchant_user_id: str = None,
        status: str = None,
        fk_audit: str = None,
        fk_audit_memo: str = None,
        kz_audit: str = None,
        kz_audit_memo: str = None,
        sub_confirm: str = None,
        remark: str = None,
    ):
        # 申请单id
        self.order_id = order_id
        # 平台方的用户id, 保持唯一
        self.merchant_user_id = merchant_user_id
        # 申请状态 99-已完结;-1-失败;031-审核中
        self.status = status
        # 风控审批状态。CREATE：已创建待审批、SKIP：跳过风控审批步骤、PASS：风控审核通过、REJECT：风控审批拒绝
        self.fk_audit = fk_audit
        # 风控审批备注
        self.fk_audit_memo = fk_audit_memo
        # 客资审核状态。CREATE：已创建待审批、SKIP：跳过客资审批步骤、PASS：客资审核通过、REJECT：客资审批拒绝客资审核状态。CREATE：已创建待审批、SKIP：跳过客资审批步骤、PASS：客资审核通过、REJECT：客资审批拒绝
        self.kz_audit = kz_audit
        # 客资审批备注
        self.kz_audit_memo = kz_audit_memo
        # 二级商户确认状态。CREATE：已发起二级商户确认、SKIP：无需确认、FAIL：签约失败、NOT_CONFIRM：商户未确认、FINISH签约完成
        self.sub_confirm = sub_confirm
        # 进件备注, 主要用于保存审核拒绝原因
        self.remark = remark

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.merchant_user_id, 'merchant_user_id')
        self.validate_required(self.status, 'status')

    def to_map(self):
        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_user_id is not None:
            result['merchant_user_id'] = self.merchant_user_id
        if self.status is not None:
            result['status'] = self.status
        if self.fk_audit is not None:
            result['fk_audit'] = self.fk_audit
        if self.fk_audit_memo is not None:
            result['fk_audit_memo'] = self.fk_audit_memo
        if self.kz_audit is not None:
            result['kz_audit'] = self.kz_audit
        if self.kz_audit_memo is not None:
            result['kz_audit_memo'] = self.kz_audit_memo
        if self.sub_confirm is not None:
            result['sub_confirm'] = self.sub_confirm
        if self.remark is not None:
            result['remark'] = self.remark
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_user_id') is not None:
            self.merchant_user_id = m.get('merchant_user_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('fk_audit') is not None:
            self.fk_audit = m.get('fk_audit')
        if m.get('fk_audit_memo') is not None:
            self.fk_audit_memo = m.get('fk_audit_memo')
        if m.get('kz_audit') is not None:
            self.kz_audit = m.get('kz_audit')
        if m.get('kz_audit_memo') is not None:
            self.kz_audit_memo = m.get('kz_audit_memo')
        if m.get('sub_confirm') is not None:
            self.sub_confirm = m.get('sub_confirm')
        if m.get('remark') is not None:
            self.remark = m.get('remark')
        return self


class QualificationInfo(TeaModel):
    def __init__(
        self,
        industry_qualification_type: str = None,
        industry_qualification_image: str = None,
    ):
        # 商户行业资质类型,  参考https://mif-pub.alipayobjects.com/QualificationType.xlsx
        self.industry_qualification_type = industry_qualification_type
        # 商户行业资质图片
        self.industry_qualification_image = industry_qualification_image

    def validate(self):
        self.validate_required(self.industry_qualification_type, 'industry_qualification_type')
        self.validate_required(self.industry_qualification_image, 'industry_qualification_image')

    def to_map(self):
        result = dict()
        if self.industry_qualification_type is not None:
            result['industry_qualification_type'] = self.industry_qualification_type
        if self.industry_qualification_image is not None:
            result['industry_qualification_image'] = self.industry_qualification_image
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('industry_qualification_type') is not None:
            self.industry_qualification_type = m.get('industry_qualification_type')
        if m.get('industry_qualification_image') is not None:
            self.industry_qualification_image = m.get('industry_qualification_image')
        return self


class SiteInfo(TeaModel):
    def __init__(
        self,
        site_type: str = None,
        site_name: str = None,
        site_url: str = None,
    ):
        # 站点类型 网站-01 APP-02 服务窗-03 公众号-04 其他-05 支付宝小程序-06
        self.site_type = site_type
        # 站点名称
        self.site_name = site_name
        # 站点地址
        self.site_url = site_url

    def validate(self):
        self.validate_required(self.site_type, 'site_type')
        self.validate_required(self.site_url, 'site_url')

    def to_map(self):
        result = dict()
        if self.site_type is not None:
            result['site_type'] = self.site_type
        if self.site_name is not None:
            result['site_name'] = self.site_name
        if self.site_url is not None:
            result['site_url'] = self.site_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('site_type') is not None:
            self.site_type = m.get('site_type')
        if m.get('site_name') is not None:
            self.site_name = m.get('site_name')
        if m.get('site_url') is not None:
            self.site_url = m.get('site_url')
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


class CreateMerchantSellerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        source: str = None,
        merchant_user_id: str = None,
        merchant_login_name: str = None,
        merchant_alias_name: str = None,
        mcc: str = None,
        legal_name: str = None,
        legal_cert_type: str = None,
        legal_cert_no: str = None,
        business_address: AddressInfo = None,
        contact_infos: List[ContactInfo] = None,
        service: List[str] = None,
        default_settle_rule: SettleRule = None,
        biz_cards: CardInfo = None,
        request_id: str = None,
        cert_image: str = None,
        legal_cert_front_image: str = None,
        legal_cert_back_image: str = None,
        qualifications: List[QualificationInfo] = None,
        license_auth_letter_image: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # source, 由中台为业务方分配, 作为业务来源标识
        self.source = source
        # 平台方下的用户id, 唯一， 跟merchant_login_name不能同时为空
        self.merchant_user_id = merchant_user_id
        # 商户登录账号, 跟merchant_user_id不能同时为空
        self.merchant_login_name = merchant_login_name
        # 商户别名, 会展示在账单以及支付结果页中
        self.merchant_alias_name = merchant_alias_name
        # 商户类别码mcc，参见https://gw.alipayobjects.com/os/bmw-prod/05c9a32e-42d1-436b-ace7-13101d91f672.xlsx
        self.mcc = mcc
        # 法人姓名，merchant_type = 01时必填
        self.legal_name = legal_name
        # 默认可不填，认为legal_cert_no是大陆身份证。类型包括：100 大陆身份证；105 港澳居民往来内地通行证；106 台湾同胞往来大陆通行证；108 外国人居留证
        self.legal_cert_type = legal_cert_type
        # 商户法人身份证号码, merchant_type = 01时必填
        self.legal_cert_no = legal_cert_no
        # 商户经营地址
        self.business_address = business_address
        # 商户联系人信息
        self.contact_infos = contact_infos
        # 商户使用服务 当面付、app支付、wap支付、电脑支付
        self.service = service
        # 默认结算规则
        self.default_settle_rule = default_settle_rule
        # 银行卡结算信息, 结算到银行卡时必填, 当前仅支持填入一张卡
        self.biz_cards = biz_cards
        # 请求单据号，32位。
        self.request_id = request_id
        # 商户证件图片，如果是特殊行业必填
        self.cert_image = cert_image
        # 法人身份证正面图片 ，如果是特殊行业必填
        self.legal_cert_front_image = legal_cert_front_image
        # 法人身份证反面图片，如果是特殊行业必填
        self.legal_cert_back_image = legal_cert_back_image
        # 商户行业资质, 如果是特殊行业必填
        self.qualifications = qualifications
        # 授权函图片。当商户名与结算卡户名不一致（模板参考https://gw.alipayobjects.com/os/skylark-tools/public/files/d5fcbe7463d7159a0d362da417d157ed.docx），或涉及外籍法人（这种情况上传任意能证明身份的图片）时必填
        self.license_auth_letter_image = license_auth_letter_image

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.merchant_alias_name, 'merchant_alias_name')
        self.validate_required(self.mcc, 'mcc')
        self.validate_required(self.business_address, 'business_address')
        if self.business_address:
            self.business_address.validate()
        self.validate_required(self.contact_infos, 'contact_infos')
        if self.contact_infos:
            for k in self.contact_infos:
                if k:
                    k.validate()
        self.validate_required(self.service, 'service')
        self.validate_required(self.default_settle_rule, 'default_settle_rule')
        if self.default_settle_rule:
            self.default_settle_rule.validate()
        if self.biz_cards:
            self.biz_cards.validate()
        self.validate_required(self.request_id, 'request_id')
        if self.qualifications:
            for k in self.qualifications:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.source is not None:
            result['source'] = self.source
        if self.merchant_user_id is not None:
            result['merchant_user_id'] = self.merchant_user_id
        if self.merchant_login_name is not None:
            result['merchant_login_name'] = self.merchant_login_name
        if self.merchant_alias_name is not None:
            result['merchant_alias_name'] = self.merchant_alias_name
        if self.mcc is not None:
            result['mcc'] = self.mcc
        if self.legal_name is not None:
            result['legal_name'] = self.legal_name
        if self.legal_cert_type is not None:
            result['legal_cert_type'] = self.legal_cert_type
        if self.legal_cert_no is not None:
            result['legal_cert_no'] = self.legal_cert_no
        if self.business_address is not None:
            result['business_address'] = self.business_address.to_map()
        result['contact_infos'] = []
        if self.contact_infos is not None:
            for k in self.contact_infos:
                result['contact_infos'].append(k.to_map() if k else None)
        if self.service is not None:
            result['service'] = self.service
        if self.default_settle_rule is not None:
            result['default_settle_rule'] = self.default_settle_rule.to_map()
        if self.biz_cards is not None:
            result['biz_cards'] = self.biz_cards.to_map()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.cert_image is not None:
            result['cert_image'] = self.cert_image
        if self.legal_cert_front_image is not None:
            result['legal_cert_front_image'] = self.legal_cert_front_image
        if self.legal_cert_back_image is not None:
            result['legal_cert_back_image'] = self.legal_cert_back_image
        result['qualifications'] = []
        if self.qualifications is not None:
            for k in self.qualifications:
                result['qualifications'].append(k.to_map() if k else None)
        if self.license_auth_letter_image is not None:
            result['license_auth_letter_image'] = self.license_auth_letter_image
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('merchant_user_id') is not None:
            self.merchant_user_id = m.get('merchant_user_id')
        if m.get('merchant_login_name') is not None:
            self.merchant_login_name = m.get('merchant_login_name')
        if m.get('merchant_alias_name') is not None:
            self.merchant_alias_name = m.get('merchant_alias_name')
        if m.get('mcc') is not None:
            self.mcc = m.get('mcc')
        if m.get('legal_name') is not None:
            self.legal_name = m.get('legal_name')
        if m.get('legal_cert_type') is not None:
            self.legal_cert_type = m.get('legal_cert_type')
        if m.get('legal_cert_no') is not None:
            self.legal_cert_no = m.get('legal_cert_no')
        if m.get('business_address') is not None:
            temp_model = AddressInfo()
            self.business_address = temp_model.from_map(m['business_address'])
        self.contact_infos = []
        if m.get('contact_infos') is not None:
            for k in m.get('contact_infos'):
                temp_model = ContactInfo()
                self.contact_infos.append(temp_model.from_map(k))
        if m.get('service') is not None:
            self.service = m.get('service')
        if m.get('default_settle_rule') is not None:
            temp_model = SettleRule()
            self.default_settle_rule = temp_model.from_map(m['default_settle_rule'])
        if m.get('biz_cards') is not None:
            temp_model = CardInfo()
            self.biz_cards = temp_model.from_map(m['biz_cards'])
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('cert_image') is not None:
            self.cert_image = m.get('cert_image')
        if m.get('legal_cert_front_image') is not None:
            self.legal_cert_front_image = m.get('legal_cert_front_image')
        if m.get('legal_cert_back_image') is not None:
            self.legal_cert_back_image = m.get('legal_cert_back_image')
        self.qualifications = []
        if m.get('qualifications') is not None:
            for k in m.get('qualifications'):
                temp_model = QualificationInfo()
                self.qualifications.append(temp_model.from_map(k))
        if m.get('license_auth_letter_image') is not None:
            self.license_auth_letter_image = m.get('license_auth_letter_image')
        return self


class CreateMerchantSellerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        merchant_user_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 申请单id
        self.order_id = order_id
        # 商户user_id
        self.merchant_user_id = merchant_user_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_user_id is not None:
            result['merchant_user_id'] = self.merchant_user_id
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
        if m.get('merchant_user_id') is not None:
            self.merchant_user_id = m.get('merchant_user_id')
        return self


class QueryMerchantSignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        source: str = None,
        order_id: str = None,
        merchant_user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # source, 由中台为业务方分配, 标识业务来源
        self.source = source
        # 申请单id, 跟merchant_user_id不能同时为空
        self.order_id = order_id
        # 平台方下的用户id, 保持唯一，跟order_id不能同时为空; 如果只传该字段, 获取该用户id的最新一次进件结果
        self.merchant_user_id = merchant_user_id

    def validate(self):
        self.validate_required(self.source, 'source')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.source is not None:
            result['source'] = self.source
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.merchant_user_id is not None:
            result['merchant_user_id'] = self.merchant_user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('merchant_user_id') is not None:
            self.merchant_user_id = m.get('merchant_user_id')
        return self


class QueryMerchantSignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_info: MerchantOrderInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 进件申请单信息
        self.order_info = order_info

    def validate(self):
        if self.order_info:
            self.order_info.validate()

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.order_info is not None:
            result['order_info'] = self.order_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_info') is not None:
            temp_model = MerchantOrderInfo()
            self.order_info = temp_model.from_map(m['order_info'])
        return self


class UploadMerchantImageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        source: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # source, 由中台为业务方分配, 作为业务来源标识
        self.source = source
        # file_id
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.file_id, 'file_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.source is not None:
            result['source'] = self.source
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
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class UploadMerchantImageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        image_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 图片id
        self.image_id = image_id

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.image_id is not None:
            result['image_id'] = self.image_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('image_id') is not None:
            self.image_id = m.get('image_id')
        return self


class SignMerchantAgreementRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        source: str = None,
        merchant_user_id: str = None,
        personal_product_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 来源场景码, 由中台为业务方分配
        self.source = source
        # 商家pid
        self.merchant_user_id = merchant_user_id
        # 个人签约产品码，商户代扣场景固定GENERAL_WITHHOLDING_P
        self.personal_product_code = personal_product_code

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.merchant_user_id, 'merchant_user_id')
        self.validate_required(self.personal_product_code, 'personal_product_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.source is not None:
            result['source'] = self.source
        if self.merchant_user_id is not None:
            result['merchant_user_id'] = self.merchant_user_id
        if self.personal_product_code is not None:
            result['personal_product_code'] = self.personal_product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('merchant_user_id') is not None:
            self.merchant_user_id = m.get('merchant_user_id')
        if m.get('personal_product_code') is not None:
            self.personal_product_code = m.get('personal_product_code')
        return self


class SignMerchantAgreementResponse(TeaModel):
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


class PayTradePageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        source: str = None,
        channel: str = None,
        return_url: str = None,
        merchant_order_no: str = None,
        total_amount: str = None,
        subject: str = None,
        pay_product_code: str = None,
        trans_currency: str = None,
        merchant_user_id: str = None,
        body: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 来源场景码,IP版权默认传IP_COPYRIGHT
        self.source = source
        # 渠道 自营平台、第三方平台等
        self.channel = channel
        # 支付成功后returl地址
        self.return_url = return_url
        # 外部单据号。32 个字符以内的大小，仅支持字母、数字。需保证该参数在业务侧不重复。
        self.merchant_order_no = merchant_order_no
        # 收单金额，"10.11"代表10.11元,最小粒度到分,小数点后2位，不支持高精度和负数
        self.total_amount = total_amount
        # 交易标题等。注意：不可使用特殊字符，如 /，=，& 等。不超过256
        self.subject = subject
        # 支付渠道产品码；
        # 目前只支持直付通，code= ZFT;
        self.pay_product_code = pay_product_code
        # 默认：人民币（156）
        self.trans_currency = trans_currency
        # 平台方下的用户id (即商家id)
        self.merchant_user_id = merchant_user_id
        # 订单描述。不超过128长度
        self.body = body

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.channel, 'channel')
        self.validate_required(self.return_url, 'return_url')
        self.validate_required(self.merchant_order_no, 'merchant_order_no')
        self.validate_required(self.total_amount, 'total_amount')
        self.validate_required(self.subject, 'subject')
        self.validate_required(self.pay_product_code, 'pay_product_code')
        self.validate_required(self.merchant_user_id, 'merchant_user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.source is not None:
            result['source'] = self.source
        if self.channel is not None:
            result['channel'] = self.channel
        if self.return_url is not None:
            result['return_url'] = self.return_url
        if self.merchant_order_no is not None:
            result['merchant_order_no'] = self.merchant_order_no
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.subject is not None:
            result['subject'] = self.subject
        if self.pay_product_code is not None:
            result['pay_product_code'] = self.pay_product_code
        if self.trans_currency is not None:
            result['trans_currency'] = self.trans_currency
        if self.merchant_user_id is not None:
            result['merchant_user_id'] = self.merchant_user_id
        if self.body is not None:
            result['body'] = self.body
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('return_url') is not None:
            self.return_url = m.get('return_url')
        if m.get('merchant_order_no') is not None:
            self.merchant_order_no = m.get('merchant_order_no')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('subject') is not None:
            self.subject = m.get('subject')
        if m.get('pay_product_code') is not None:
            self.pay_product_code = m.get('pay_product_code')
        if m.get('trans_currency') is not None:
            self.trans_currency = m.get('trans_currency')
        if m.get('merchant_user_id') is not None:
            self.merchant_user_id = m.get('merchant_user_id')
        if m.get('body') is not None:
            self.body = m.get('body')
        return self


class PayTradePageResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        form: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 收银台页面String
        self.form = form

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.form is not None:
            result['form'] = self.form
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('form') is not None:
            self.form = m.get('form')
        return self


class QueryTradeOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        source: str = None,
        merchant_order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 中台颁发的场景码，IP_COPYRIGHT
        self.source = source
        # 外部商户订单号，不超32位
        self.merchant_order_no = merchant_order_no

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.merchant_order_no, 'merchant_order_no')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.source is not None:
            result['source'] = self.source
        if self.merchant_order_no is not None:
            result['merchant_order_no'] = self.merchant_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('merchant_order_no') is not None:
            self.merchant_order_no = m.get('merchant_order_no')
        return self


class QueryTradeOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trade_no: str = None,
        trade_status: str = None,
        total_amount: str = None,
        out_trade_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 支付宝交易号
        self.trade_no = trade_no
        # 交易状态：WAIT_BUYER_PAY（交易创建，等待买家付款）、TRADE_CLOSED（未付款交易超时关闭，或支付完成后全额退款）、TRADE_SUCCESS（交易支付成功）
        self.trade_status = trade_status
        # 交易金额，"10.11"
        self.total_amount = total_amount
        # 商户订单号out_trade_no
        self.out_trade_no = out_trade_no

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        if self.trade_status is not None:
            result['trade_status'] = self.trade_status
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.out_trade_no is not None:
            result['out_trade_no'] = self.out_trade_no
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
        if m.get('trade_status') is not None:
            self.trade_status = m.get('trade_status')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('out_trade_no') is not None:
            self.out_trade_no = m.get('out_trade_no')
        return self


class CreateTradeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        source: str = None,
        channel: str = None,
        return_url: str = None,
        merchant_order_no: str = None,
        total_amount: str = None,
        subject: str = None,
        pay_product_code: str = None,
        trans_currency: str = None,
        merchant_user_id: str = None,
        buyer_id: str = None,
        body: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 来源场景码, 由中台分配给业务方
        self.source = source
        # 渠道 自营平台、第三方平台等
        self.channel = channel
        # 支付成功后returl地址
        self.return_url = return_url
        # 外部单据号。32 个字符以内的大小，仅支持字母、数字。需保证该参数在业务侧不重复。
        self.merchant_order_no = merchant_order_no
        # 收单金额，"10.11"代表10.11元,最小粒度到分,小数点后2位，不支持高精度和负数
        self.total_amount = total_amount
        # 交易标题等。注意：不可使用特殊字符，如 /，=，& 等。不超过256
        self.subject = subject
        # 支付渠道产品码； 目前只支持直付通，code= ZFT;
        self.pay_product_code = pay_product_code
        # 交易币种，默认：人民币（156）
        self.trans_currency = trans_currency
        # 平台方下的商家id
        self.merchant_user_id = merchant_user_id
        # 买家的支付宝唯一用户号（2088开头的16位纯数字）。
        # 小程序支付场景必填。
        self.buyer_id = buyer_id
        # 对一笔交易的具体描述信息。如果是多种商品，请将商品描述字符串累加传给body。
        self.body = body

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.channel, 'channel')
        self.validate_required(self.merchant_order_no, 'merchant_order_no')
        self.validate_required(self.total_amount, 'total_amount')
        self.validate_required(self.subject, 'subject')
        self.validate_required(self.merchant_user_id, 'merchant_user_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.source is not None:
            result['source'] = self.source
        if self.channel is not None:
            result['channel'] = self.channel
        if self.return_url is not None:
            result['return_url'] = self.return_url
        if self.merchant_order_no is not None:
            result['merchant_order_no'] = self.merchant_order_no
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.subject is not None:
            result['subject'] = self.subject
        if self.pay_product_code is not None:
            result['pay_product_code'] = self.pay_product_code
        if self.trans_currency is not None:
            result['trans_currency'] = self.trans_currency
        if self.merchant_user_id is not None:
            result['merchant_user_id'] = self.merchant_user_id
        if self.buyer_id is not None:
            result['buyer_id'] = self.buyer_id
        if self.body is not None:
            result['body'] = self.body
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('return_url') is not None:
            self.return_url = m.get('return_url')
        if m.get('merchant_order_no') is not None:
            self.merchant_order_no = m.get('merchant_order_no')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('subject') is not None:
            self.subject = m.get('subject')
        if m.get('pay_product_code') is not None:
            self.pay_product_code = m.get('pay_product_code')
        if m.get('trans_currency') is not None:
            self.trans_currency = m.get('trans_currency')
        if m.get('merchant_user_id') is not None:
            self.merchant_user_id = m.get('merchant_user_id')
        if m.get('buyer_id') is not None:
            self.buyer_id = m.get('buyer_id')
        if m.get('body') is not None:
            self.body = m.get('body')
        return self


class CreateTradeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trade_no: str = None,
        merchant_order_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 支付宝交易号，64位以内
        self.trade_no = trade_no
        # 外部单据号。32 个字符以内的大小，仅支持字母、数字。需保证该参数在业务侧不重复。
        self.merchant_order_no = merchant_order_no

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        if self.merchant_order_no is not None:
            result['merchant_order_no'] = self.merchant_order_no
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
        if m.get('merchant_order_no') is not None:
            self.merchant_order_no = m.get('merchant_order_no')
        return self


class PayTradeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        source: str = None,
        merchant_order_no: str = None,
        total_amount: str = None,
        subject: str = None,
        merchant_user_id: str = None,
        trans_currency: str = None,
        buyer_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 来源场景码, 由中台分配给业务方
        self.source = source
        # 外部单据号。32 个字符以内的大小，仅支持字母、数字。需保证该参数在业务侧不重复。
        self.merchant_order_no = merchant_order_no
        # 收单金额，"10.11"代表10.11元,最小粒度到分,小数点后2位，不支持高精度和负数
        self.total_amount = total_amount
        # 交易标题等。注意：不可使用特殊字符，如 /，=，& 等。不超过256
        self.subject = subject
        # 平台方下的商家id
        self.merchant_user_id = merchant_user_id
        # 交易币种，默认：人民币（156）
        self.trans_currency = trans_currency
        # 买家支付宝uid
        self.buyer_id = buyer_id

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.merchant_order_no, 'merchant_order_no')
        self.validate_required(self.total_amount, 'total_amount')
        self.validate_required(self.subject, 'subject')
        self.validate_required(self.merchant_user_id, 'merchant_user_id')
        self.validate_required(self.buyer_id, 'buyer_id')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.source is not None:
            result['source'] = self.source
        if self.merchant_order_no is not None:
            result['merchant_order_no'] = self.merchant_order_no
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.subject is not None:
            result['subject'] = self.subject
        if self.merchant_user_id is not None:
            result['merchant_user_id'] = self.merchant_user_id
        if self.trans_currency is not None:
            result['trans_currency'] = self.trans_currency
        if self.buyer_id is not None:
            result['buyer_id'] = self.buyer_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('merchant_order_no') is not None:
            self.merchant_order_no = m.get('merchant_order_no')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('subject') is not None:
            self.subject = m.get('subject')
        if m.get('merchant_user_id') is not None:
            self.merchant_user_id = m.get('merchant_user_id')
        if m.get('trans_currency') is not None:
            self.trans_currency = m.get('trans_currency')
        if m.get('buyer_id') is not None:
            self.buyer_id = m.get('buyer_id')
        return self


class PayTradeResponse(TeaModel):
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
        # 支付宝交易号，64位以内
        self.trade_no = trade_no

    def validate(self):
        pass

    def to_map(self):
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


