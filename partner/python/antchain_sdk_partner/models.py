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


class ExpenditureQuotationOfferPriceConditionAttr(TeaModel):
    def __init__(
        self,
        attr_code: str = None,
        attr_value_code: str = None,
        attr_value_name: str = None,
        operator: str = None,
    ):
        # 属性code
        self.attr_code = attr_code
        # 属性值code
        self.attr_value_code = attr_value_code
        # 属性值名称
        self.attr_value_name = attr_value_name
        # 运算符
        self.operator = operator

    def validate(self):
        self.validate_required(self.attr_code, 'attr_code')
        self.validate_required(self.attr_value_code, 'attr_value_code')
        self.validate_required(self.attr_value_name, 'attr_value_name')
        self.validate_required(self.operator, 'operator')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.attr_code is not None:
            result['attr_code'] = self.attr_code
        if self.attr_value_code is not None:
            result['attr_value_code'] = self.attr_value_code
        if self.attr_value_name is not None:
            result['attr_value_name'] = self.attr_value_name
        if self.operator is not None:
            result['operator'] = self.operator
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('attr_code') is not None:
            self.attr_code = m.get('attr_code')
        if m.get('attr_value_code') is not None:
            self.attr_value_code = m.get('attr_value_code')
        if m.get('attr_value_name') is not None:
            self.attr_value_name = m.get('attr_value_name')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        return self


class PartnerSignFile(TeaModel):
    def __init__(
        self,
        type: str = None,
        name: str = None,
        oss_url: str = None,
    ):
        # 文件类型
        self.type = type
        # 文件名称
        self.name = name
        # 可预览地址
        self.oss_url = oss_url

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.name, 'name')
        self.validate_required(self.oss_url, 'oss_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.name is not None:
            result['name'] = self.name
        if self.oss_url is not None:
            result['oss_url'] = self.oss_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('oss_url') is not None:
            self.oss_url = m.get('oss_url')
        return self


class ExpenditureQuotationOfferPrice(TeaModel):
    def __init__(
        self,
        condition_attrs: List[ExpenditureQuotationOfferPriceConditionAttr] = None,
        ladder_start: str = None,
        ladder_end: str = None,
        price: str = None,
        currency: str = None,
    ):
        # 定价条件
        self.condition_attrs = condition_attrs
        # 阶梯起始值
        self.ladder_start = ladder_start
        # 阶梯结束值
        self.ladder_end = ladder_end
        # 价格
        self.price = price
        # 币种
        self.currency = currency

    def validate(self):
        if self.condition_attrs:
            for k in self.condition_attrs:
                if k:
                    k.validate()
        self.validate_required(self.ladder_start, 'ladder_start')
        self.validate_required(self.ladder_end, 'ladder_end')
        self.validate_required(self.price, 'price')
        self.validate_required(self.currency, 'currency')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['condition_attrs'] = []
        if self.condition_attrs is not None:
            for k in self.condition_attrs:
                result['condition_attrs'].append(k.to_map() if k else None)
        if self.ladder_start is not None:
            result['ladder_start'] = self.ladder_start
        if self.ladder_end is not None:
            result['ladder_end'] = self.ladder_end
        if self.price is not None:
            result['price'] = self.price
        if self.currency is not None:
            result['currency'] = self.currency
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.condition_attrs = []
        if m.get('condition_attrs') is not None:
            for k in m.get('condition_attrs'):
                temp_model = ExpenditureQuotationOfferPriceConditionAttr()
                self.condition_attrs.append(temp_model.from_map(k))
        if m.get('ladder_start') is not None:
            self.ladder_start = m.get('ladder_start')
        if m.get('ladder_end') is not None:
            self.ladder_end = m.get('ladder_end')
        if m.get('price') is not None:
            self.price = m.get('price')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        return self


class SignRecord(TeaModel):
    def __init__(
        self,
        contract_type: str = None,
        seal_mode: str = None,
        sign_status: str = None,
        files: List[PartnerSignFile] = None,
    ):
        # 合同类型：标准、自定义
        self.contract_type = contract_type
        # 签约模式：ENTITY_SEAL（实体章）、ELECTRONIC_SEAL（电子章）
        self.seal_mode = seal_mode
        # 签约状态
        self.sign_status = sign_status
        # 签约记录关联的文件信息
        self.files = files

    def validate(self):
        self.validate_required(self.contract_type, 'contract_type')
        self.validate_required(self.seal_mode, 'seal_mode')
        self.validate_required(self.sign_status, 'sign_status')
        self.validate_required(self.files, 'files')
        if self.files:
            for k in self.files:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.contract_type is not None:
            result['contract_type'] = self.contract_type
        if self.seal_mode is not None:
            result['seal_mode'] = self.seal_mode
        if self.sign_status is not None:
            result['sign_status'] = self.sign_status
        result['files'] = []
        if self.files is not None:
            for k in self.files:
                result['files'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('contract_type') is not None:
            self.contract_type = m.get('contract_type')
        if m.get('seal_mode') is not None:
            self.seal_mode = m.get('seal_mode')
        if m.get('sign_status') is not None:
            self.sign_status = m.get('sign_status')
        self.files = []
        if m.get('files') is not None:
            for k in m.get('files'):
                temp_model = PartnerSignFile()
                self.files.append(temp_model.from_map(k))
        return self


class ExpenditureSettlementRule(TeaModel):
    def __init__(
        self,
        pay_type: str = None,
        bank_no: str = None,
        bank_account_name: str = None,
        bank_branch_name: str = None,
        alipay_account: str = None,
    ):
        # 支付方式
        # Alipay("01","Alipay","ALIPAYACCOUNT", "企业支付宝账号"),
        # BankCard("02","BankCard", "BANKCARD", "银行卡账号")
        self.pay_type = pay_type
        # 银行卡账号
        self.bank_no = bank_no
        # 银行用户名称
        self.bank_account_name = bank_account_name
        # 开户行支行名称
        self.bank_branch_name = bank_branch_name
        # 支付宝账号
        self.alipay_account = alipay_account

    def validate(self):
        self.validate_required(self.pay_type, 'pay_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pay_type is not None:
            result['pay_type'] = self.pay_type
        if self.bank_no is not None:
            result['bank_no'] = self.bank_no
        if self.bank_account_name is not None:
            result['bank_account_name'] = self.bank_account_name
        if self.bank_branch_name is not None:
            result['bank_branch_name'] = self.bank_branch_name
        if self.alipay_account is not None:
            result['alipay_account'] = self.alipay_account
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pay_type') is not None:
            self.pay_type = m.get('pay_type')
        if m.get('bank_no') is not None:
            self.bank_no = m.get('bank_no')
        if m.get('bank_account_name') is not None:
            self.bank_account_name = m.get('bank_account_name')
        if m.get('bank_branch_name') is not None:
            self.bank_branch_name = m.get('bank_branch_name')
        if m.get('alipay_account') is not None:
            self.alipay_account = m.get('alipay_account')
        return self


class ExpenditureQuotationOffer(TeaModel):
    def __init__(
        self,
        id: int = None,
        personal_price: List[ExpenditureQuotationOfferPrice] = None,
        out_business_no: str = None,
        arrangement_no: str = None,
    ):
        # 支出配置单商品主键id
        self.id = id
        # 一客一价
        self.personal_price = personal_price
        # 外部业务单据号
        self.out_business_no = out_business_no
        # 支出订购id
        self.arrangement_no = arrangement_no

    def validate(self):
        if self.personal_price:
            for k in self.personal_price:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        result['personal_price'] = []
        if self.personal_price is not None:
            for k in self.personal_price:
                result['personal_price'].append(k.to_map() if k else None)
        if self.out_business_no is not None:
            result['out_business_no'] = self.out_business_no
        if self.arrangement_no is not None:
            result['arrangement_no'] = self.arrangement_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        self.personal_price = []
        if m.get('personal_price') is not None:
            for k in m.get('personal_price'):
                temp_model = ExpenditureQuotationOfferPrice()
                self.personal_price.append(temp_model.from_map(k))
        if m.get('out_business_no') is not None:
            self.out_business_no = m.get('out_business_no')
        if m.get('arrangement_no') is not None:
            self.arrangement_no = m.get('arrangement_no')
        return self


class ExpenditureQuotation(TeaModel):
    def __init__(
        self,
        quotation_offers: List[ExpenditureQuotationOffer] = None,
    ):
        # 支出配置单商品
        self.quotation_offers = quotation_offers

    def validate(self):
        if self.quotation_offers:
            for k in self.quotation_offers:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['quotation_offers'] = []
        if self.quotation_offers is not None:
            for k in self.quotation_offers:
                result['quotation_offers'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.quotation_offers = []
        if m.get('quotation_offers') is not None:
            for k in m.get('quotation_offers'):
                temp_model = ExpenditureQuotationOffer()
                self.quotation_offers.append(temp_model.from_map(k))
        return self


class PartnerBasicInformation(TeaModel):
    def __init__(
        self,
        industry: str = None,
        enterprise_legal_person: str = None,
        registered_capital: str = None,
        employee_count: str = None,
        enterprise_register_province: str = None,
        enterprise_register_city: str = None,
        company_url: str = None,
        listed: bool = None,
        brief_introduction: str = None,
        sub_industry: str = None,
    ):
        # 行业类型，值列表详见文档：https://yuque.antfin-inc.com/docs/share/684c97a8-bd5f-40e0-aab6-a1a69bc3d881?#
        self.industry = industry
        # 企业法人
        self.enterprise_legal_person = enterprise_legal_person
        # 注册资本
        self.registered_capital = registered_capital
        # 人员规模
        self.employee_count = employee_count
        # 企业注册省份
        self.enterprise_register_province = enterprise_register_province
        # 企业注册城市
        self.enterprise_register_city = enterprise_register_city
        # 公司官网地址
        self.company_url = company_url
        # 是否上市公司
        self.listed = listed
        # 企业简介
        self.brief_introduction = brief_introduction
        # 二级行业，值列表详见文档：https://yuque.antfin-inc.com/docs/share/684c97a8-bd5f-40e0-aab6-a1a69bc3d881?# 《合作方企业基本信息说明》
        self.sub_industry = sub_industry

    def validate(self):
        self.validate_required(self.industry, 'industry')
        self.validate_required(self.enterprise_legal_person, 'enterprise_legal_person')
        self.validate_required(self.registered_capital, 'registered_capital')
        self.validate_required(self.employee_count, 'employee_count')
        self.validate_required(self.enterprise_register_province, 'enterprise_register_province')
        self.validate_required(self.enterprise_register_city, 'enterprise_register_city')
        self.validate_required(self.company_url, 'company_url')
        self.validate_required(self.listed, 'listed')
        self.validate_required(self.brief_introduction, 'brief_introduction')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.industry is not None:
            result['industry'] = self.industry
        if self.enterprise_legal_person is not None:
            result['enterprise_legal_person'] = self.enterprise_legal_person
        if self.registered_capital is not None:
            result['registered_capital'] = self.registered_capital
        if self.employee_count is not None:
            result['employee_count'] = self.employee_count
        if self.enterprise_register_province is not None:
            result['enterprise_register_province'] = self.enterprise_register_province
        if self.enterprise_register_city is not None:
            result['enterprise_register_city'] = self.enterprise_register_city
        if self.company_url is not None:
            result['company_url'] = self.company_url
        if self.listed is not None:
            result['listed'] = self.listed
        if self.brief_introduction is not None:
            result['brief_introduction'] = self.brief_introduction
        if self.sub_industry is not None:
            result['sub_industry'] = self.sub_industry
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('industry') is not None:
            self.industry = m.get('industry')
        if m.get('enterprise_legal_person') is not None:
            self.enterprise_legal_person = m.get('enterprise_legal_person')
        if m.get('registered_capital') is not None:
            self.registered_capital = m.get('registered_capital')
        if m.get('employee_count') is not None:
            self.employee_count = m.get('employee_count')
        if m.get('enterprise_register_province') is not None:
            self.enterprise_register_province = m.get('enterprise_register_province')
        if m.get('enterprise_register_city') is not None:
            self.enterprise_register_city = m.get('enterprise_register_city')
        if m.get('company_url') is not None:
            self.company_url = m.get('company_url')
        if m.get('listed') is not None:
            self.listed = m.get('listed')
        if m.get('brief_introduction') is not None:
            self.brief_introduction = m.get('brief_introduction')
        if m.get('sub_industry') is not None:
            self.sub_industry = m.get('sub_industry')
        return self


class ExpenditureContract(TeaModel):
    def __init__(
        self,
        contract_id: str = None,
        contract_name: str = None,
        status: str = None,
        gmt_start: str = None,
        gmt_end: str = None,
        signing_record: SignRecord = None,
        settlement_rule: ExpenditureSettlementRule = None,
        extend_info: str = None,
    ):
        # 支出合同id
        self.contract_id = contract_id
        # 支出合同名称
        self.contract_name = contract_name
        # 合同状态：
        # INIT("INIT","草稿", ""),
        # VALID("VALID","正式", ""),
        # INVALID("INVALID","作废", ""),
        # AUDIT_ING("AUDIT_ING", "审核中","STARTED"),
        # AUDIT_SUCCESS("AUDIT_SUCCESS", "审核成功","AGREED"),
        # AUDIT_FAIL("AUDIT_FAIL", "审核不通过", "DISAGREE"),
        self.status = status
        # 有效期开始时间
        self.gmt_start = gmt_start
        # 有效期结束时间
        self.gmt_end = gmt_end
        # 签约记录
        self.signing_record = signing_record
        # 支出结算规则
        self.settlement_rule = settlement_rule
        # 扩展信息
        self.extend_info = extend_info

    def validate(self):
        self.validate_required(self.contract_id, 'contract_id')
        self.validate_required(self.contract_name, 'contract_name')
        self.validate_required(self.status, 'status')
        if self.gmt_start is not None:
            self.validate_pattern(self.gmt_start, 'gmt_start', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_end is not None:
            self.validate_pattern(self.gmt_end, 'gmt_end', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.signing_record:
            self.signing_record.validate()
        if self.settlement_rule:
            self.settlement_rule.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.contract_id is not None:
            result['contract_id'] = self.contract_id
        if self.contract_name is not None:
            result['contract_name'] = self.contract_name
        if self.status is not None:
            result['status'] = self.status
        if self.gmt_start is not None:
            result['gmt_start'] = self.gmt_start
        if self.gmt_end is not None:
            result['gmt_end'] = self.gmt_end
        if self.signing_record is not None:
            result['signing_record'] = self.signing_record.to_map()
        if self.settlement_rule is not None:
            result['settlement_rule'] = self.settlement_rule.to_map()
        if self.extend_info is not None:
            result['extend_info'] = self.extend_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('contract_id') is not None:
            self.contract_id = m.get('contract_id')
        if m.get('contract_name') is not None:
            self.contract_name = m.get('contract_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('gmt_start') is not None:
            self.gmt_start = m.get('gmt_start')
        if m.get('gmt_end') is not None:
            self.gmt_end = m.get('gmt_end')
        if m.get('signing_record') is not None:
            temp_model = SignRecord()
            self.signing_record = temp_model.from_map(m['signing_record'])
        if m.get('settlement_rule') is not None:
            temp_model = ExpenditureSettlementRule()
            self.settlement_rule = temp_model.from_map(m['settlement_rule'])
        if m.get('extend_info') is not None:
            self.extend_info = m.get('extend_info')
        return self


class PartnerContactInformation(TeaModel):
    def __init__(
        self,
        name: str = None,
        phone: str = None,
        email: str = None,
        post_code: str = None,
        address: str = None,
    ):
        # 企业联系人姓名
        self.name = name
        # 企业联系人手机
        self.phone = phone
        # 企业联系邮箱
        self.email = email
        # 通信邮编
        self.post_code = post_code
        # 通信地址
        self.address = address

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.phone, 'phone')
        self.validate_required(self.email, 'email')
        self.validate_required(self.post_code, 'post_code')
        self.validate_required(self.address, 'address')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.phone is not None:
            result['phone'] = self.phone
        if self.email is not None:
            result['email'] = self.email
        if self.post_code is not None:
            result['post_code'] = self.post_code
        if self.address is not None:
            result['address'] = self.address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('email') is not None:
            self.email = m.get('email')
        if m.get('post_code') is not None:
            self.post_code = m.get('post_code')
        if m.get('address') is not None:
            self.address = m.get('address')
        return self


class ExpenditureQuotationItem(TeaModel):
    def __init__(
        self,
        out_unique_id: str = None,
        name: str = None,
        description: str = None,
        predict_transaction_amount: int = None,
    ):
        # 外部唯一id，sku-id
        self.out_unique_id = out_unique_id
        # 配置单商品名称
        self.name = name
        # 支出配置单对象描述
        self.description = description
        # 预估交易金额（分）
        self.predict_transaction_amount = predict_transaction_amount

    def validate(self):
        self.validate_required(self.out_unique_id, 'out_unique_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.description, 'description')
        self.validate_required(self.predict_transaction_amount, 'predict_transaction_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.out_unique_id is not None:
            result['out_unique_id'] = self.out_unique_id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.predict_transaction_amount is not None:
            result['predict_transaction_amount'] = self.predict_transaction_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('out_unique_id') is not None:
            self.out_unique_id = m.get('out_unique_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('predict_transaction_amount') is not None:
            self.predict_transaction_amount = m.get('predict_transaction_amount')
        return self


class SettlementRequest(TeaModel):
    def __init__(
        self,
        pay_type: str = None,
        bank_no: str = None,
        bank_account_name: str = None,
        bank_branch_name: str = None,
        alipay_account: str = None,
    ):
        # 结算方式：
        # 企业支付宝账号 Alipay
        # 银行卡账号 BankCard
        self.pay_type = pay_type
        # 银行卡账号
        self.bank_no = bank_no
        # 银行卡用户名称
        self.bank_account_name = bank_account_name
        # 银行支行名称
        self.bank_branch_name = bank_branch_name
        # 支付宝账号
        self.alipay_account = alipay_account

    def validate(self):
        self.validate_required(self.pay_type, 'pay_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pay_type is not None:
            result['pay_type'] = self.pay_type
        if self.bank_no is not None:
            result['bank_no'] = self.bank_no
        if self.bank_account_name is not None:
            result['bank_account_name'] = self.bank_account_name
        if self.bank_branch_name is not None:
            result['bank_branch_name'] = self.bank_branch_name
        if self.alipay_account is not None:
            result['alipay_account'] = self.alipay_account
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pay_type') is not None:
            self.pay_type = m.get('pay_type')
        if m.get('bank_no') is not None:
            self.bank_no = m.get('bank_no')
        if m.get('bank_account_name') is not None:
            self.bank_account_name = m.get('bank_account_name')
        if m.get('bank_branch_name') is not None:
            self.bank_branch_name = m.get('bank_branch_name')
        if m.get('alipay_account') is not None:
            self.alipay_account = m.get('alipay_account')
        return self


class PbcInfo(TeaModel):
    def __init__(
        self,
        branch_name: str = None,
        bank_code: str = None,
    ):
        # 支行名称
        self.branch_name = branch_name
        # 联行号数据
        self.bank_code = bank_code

    def validate(self):
        self.validate_required(self.branch_name, 'branch_name')
        self.validate_required(self.bank_code, 'bank_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.branch_name is not None:
            result['branch_name'] = self.branch_name
        if self.bank_code is not None:
            result['bank_code'] = self.bank_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('branch_name') is not None:
            self.branch_name = m.get('branch_name')
        if m.get('bank_code') is not None:
            self.bank_code = m.get('bank_code')
        return self


class CommodityPolicyRelation(TeaModel):
    def __init__(
        self,
        commodity_code: str = None,
        policy_id: str = None,
    ):
        # 商品code
        self.commodity_code = commodity_code
        # 政策ID
        self.policy_id = policy_id

    def validate(self):
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.policy_id, 'policy_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.policy_id is not None:
            result['policy_id'] = self.policy_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('policy_id') is not None:
            self.policy_id = m.get('policy_id')
        return self


class Participant(TeaModel):
    def __init__(
        self,
        role: str = None,
        work_no: str = None,
    ):
        # 参与人角色
        self.role = role
        # 参与人工号
        self.work_no = work_no

    def validate(self):
        self.validate_required(self.role, 'role')
        self.validate_required(self.work_no, 'work_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.role is not None:
            result['role'] = self.role
        if self.work_no is not None:
            result['work_no'] = self.work_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('role') is not None:
            self.role = m.get('role')
        if m.get('work_no') is not None:
            self.work_no = m.get('work_no')
        return self


class PartnerStandardContractQueryOption(TeaModel):
    def __init__(
        self,
        render_contract: bool = None,
        render_context: str = None,
    ):
        # 是否渲染
        self.render_contract = render_contract
        # 合同渲染上下文，jsonString格式，key值需要提前约定好
        # 
        self.render_context = render_context

    def validate(self):
        self.validate_required(self.render_contract, 'render_contract')
        self.validate_required(self.render_context, 'render_context')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.render_contract is not None:
            result['render_contract'] = self.render_contract
        if self.render_context is not None:
            result['render_context'] = self.render_context
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('render_contract') is not None:
            self.render_contract = m.get('render_contract')
        if m.get('render_context') is not None:
            self.render_context = m.get('render_context')
        return self


class ExpenditureQuotationRequest(TeaModel):
    def __init__(
        self,
        price_mode: str = None,
        quotation_items: List[ExpenditureQuotationItem] = None,
    ):
        # 定价模式：
        # Standard("Standard", "标准价"),
        # Customer("Customer", "自定义价格"),
        self.price_mode = price_mode
        # 支出配置单对象列表
        self.quotation_items = quotation_items

    def validate(self):
        self.validate_required(self.price_mode, 'price_mode')
        self.validate_required(self.quotation_items, 'quotation_items')
        if self.quotation_items:
            for k in self.quotation_items:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.price_mode is not None:
            result['price_mode'] = self.price_mode
        result['quotation_items'] = []
        if self.quotation_items is not None:
            for k in self.quotation_items:
                result['quotation_items'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('price_mode') is not None:
            self.price_mode = m.get('price_mode')
        self.quotation_items = []
        if m.get('quotation_items') is not None:
            for k in m.get('quotation_items'):
                temp_model = ExpenditureQuotationItem()
                self.quotation_items.append(temp_model.from_map(k))
        return self


class Province(TeaModel):
    def __init__(
        self,
        province_name: str = None,
    ):
        # 省份名称
        self.province_name = province_name

    def validate(self):
        self.validate_required(self.province_name, 'province_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.province_name is not None:
            result['province_name'] = self.province_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('province_name') is not None:
            self.province_name = m.get('province_name')
        return self


class ExpenditureProject(TeaModel):
    def __init__(
        self,
        stage: str = None,
        status: str = None,
        contract: ExpenditureContract = None,
        quotation: ExpenditureQuotation = None,
        collaboration_plan_id: int = None,
    ):
        # 项目阶段：
        # REQUIREMENT_CONFIRM("REQUIREMENT_CONFIRM", "需求确认", "SOLUTION"),
        # SOLUTION("SOLUTION", "方案沟通", "TALKS"),
        # TALKS("TALKS", "商务谈判", "SIGNED"),
        # SIGNED("SIGNED", "签约完成", "SIGNED"),
        # ABORT("ABORT", "项目终止", "ABORT"),
        # 
        self.stage = stage
        # 项目状态：
        # DOING("DOING","进行中"),
        # ABORTED("ABORTED","已终止"),
        # FINISHED("FINISHED","已完成"),
        self.status = status
        # 支出合同信息
        self.contract = contract
        # 支出配置单信息
        self.quotation = quotation
        # 合作计划id
        self.collaboration_plan_id = collaboration_plan_id

    def validate(self):
        self.validate_required(self.stage, 'stage')
        self.validate_required(self.status, 'status')
        if self.contract:
            self.contract.validate()
        if self.quotation:
            self.quotation.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.stage is not None:
            result['stage'] = self.stage
        if self.status is not None:
            result['status'] = self.status
        if self.contract is not None:
            result['contract'] = self.contract.to_map()
        if self.quotation is not None:
            result['quotation'] = self.quotation.to_map()
        if self.collaboration_plan_id is not None:
            result['collaboration_plan_id'] = self.collaboration_plan_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('stage') is not None:
            self.stage = m.get('stage')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('contract') is not None:
            temp_model = ExpenditureContract()
            self.contract = temp_model.from_map(m['contract'])
        if m.get('quotation') is not None:
            temp_model = ExpenditureQuotation()
            self.quotation = temp_model.from_map(m['quotation'])
        if m.get('collaboration_plan_id') is not None:
            self.collaboration_plan_id = m.get('collaboration_plan_id')
        return self


class Institution(TeaModel):
    def __init__(
        self,
        inst_id: str = None,
        inst_name: str = None,
        inst_code: str = None,
    ):
        # 机构id
        self.inst_id = inst_id
        # 机构名称
        self.inst_name = inst_name
        # 机构code
        self.inst_code = inst_code

    def validate(self):
        self.validate_required(self.inst_id, 'inst_id')
        self.validate_required(self.inst_name, 'inst_name')
        self.validate_required(self.inst_code, 'inst_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.inst_id is not None:
            result['inst_id'] = self.inst_id
        if self.inst_name is not None:
            result['inst_name'] = self.inst_name
        if self.inst_code is not None:
            result['inst_code'] = self.inst_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('inst_id') is not None:
            self.inst_id = m.get('inst_id')
        if m.get('inst_name') is not None:
            self.inst_name = m.get('inst_name')
        if m.get('inst_code') is not None:
            self.inst_code = m.get('inst_code')
        return self


class City(TeaModel):
    def __init__(
        self,
        city_name: str = None,
    ):
        # 城市名称
        self.city_name = city_name

    def validate(self):
        self.validate_required(self.city_name, 'city_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.city_name is not None:
            result['city_name'] = self.city_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('city_name') is not None:
            self.city_name = m.get('city_name')
        return self


class PartnerInformation(TeaModel):
    def __init__(
        self,
        tenant_id: str = None,
        basic_information: PartnerBasicInformation = None,
        contact_information: PartnerContactInformation = None,
        extend_info: str = None,
    ):
        # 合作方（商家、伙伴）用户id
        self.tenant_id = tenant_id
        # 合作方（商家、伙伴）基本信息
        self.basic_information = basic_information
        # 联系信息
        self.contact_information = contact_information
        # 除约定属性外的，其余商家主要信息
        self.extend_info = extend_info

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.basic_information, 'basic_information')
        if self.basic_information:
            self.basic_information.validate()
        self.validate_required(self.contact_information, 'contact_information')
        if self.contact_information:
            self.contact_information.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.basic_information is not None:
            result['basic_information'] = self.basic_information.to_map()
        if self.contact_information is not None:
            result['contact_information'] = self.contact_information.to_map()
        if self.extend_info is not None:
            result['extend_info'] = self.extend_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('basic_information') is not None:
            temp_model = PartnerBasicInformation()
            self.basic_information = temp_model.from_map(m['basic_information'])
        if m.get('contact_information') is not None:
            temp_model = PartnerContactInformation()
            self.contact_information = temp_model.from_map(m['contact_information'])
        if m.get('extend_info') is not None:
            self.extend_info = m.get('extend_info')
        return self


class PartnerStandardContractVersion(TeaModel):
    def __init__(
        self,
        name: str = None,
        preview_url: str = None,
        version: str = None,
    ):
        # 协议名称
        self.name = name
        # 协议可预览地址
        self.preview_url = preview_url
        # 协议版本
        self.version = version

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.preview_url, 'preview_url')
        self.validate_required(self.version, 'version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.preview_url is not None:
            result['preview_url'] = self.preview_url
        if self.version is not None:
            result['version'] = self.version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('preview_url') is not None:
            self.preview_url = m.get('preview_url')
        if m.get('version') is not None:
            self.version = m.get('version')
        return self


class SignRequest(TeaModel):
    def __init__(
        self,
        contract_type: str = None,
        seal_mode: str = None,
    ):
        # 合同类型
        self.contract_type = contract_type
        # 签约模式
        self.seal_mode = seal_mode

    def validate(self):
        self.validate_required(self.contract_type, 'contract_type')
        self.validate_required(self.seal_mode, 'seal_mode')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.contract_type is not None:
            result['contract_type'] = self.contract_type
        if self.seal_mode is not None:
            result['seal_mode'] = self.seal_mode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('contract_type') is not None:
            self.contract_type = m.get('contract_type')
        if m.get('seal_mode') is not None:
            self.seal_mode = m.get('seal_mode')
        return self


class QueryEcoCommodityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_name: str = None,
        offer_codes: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户name
        self.tenant_name = tenant_name
        # 商品信息列表
        self.offer_codes = offer_codes

    def validate(self):
        self.validate_required(self.tenant_name, 'tenant_name')
        self.validate_required(self.offer_codes, 'offer_codes')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.offer_codes is not None:
            result['offer_codes'] = self.offer_codes
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('offer_codes') is not None:
            self.offer_codes = m.get('offer_codes')
        return self


class QueryEcoCommodityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        commodity_policy_info: List[CommodityPolicyRelation] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品及其归属政策信息
        self.commodity_policy_info = commodity_policy_info

    def validate(self):
        if self.commodity_policy_info:
            for k in self.commodity_policy_info:
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
        result['commodity_policy_info'] = []
        if self.commodity_policy_info is not None:
            for k in self.commodity_policy_info:
                result['commodity_policy_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.commodity_policy_info = []
        if m.get('commodity_policy_info') is not None:
            for k in m.get('commodity_policy_info'):
                temp_model = CommodityPolicyRelation()
                self.commodity_policy_info.append(temp_model.from_map(k))
        return self


class ApplyPartnerSettleinRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        source: str = None,
        l_1partner_type: str = None,
        l_2partner_type: str = None,
        business_no: str = None,
        partner_information: PartnerInformation = None,
        participants: List[Participant] = None,
        sign_request: SignRequest = None,
        extend_info: str = None,
        apply_time: str = None,
        apply_operate_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户来源-用于租户隔离
        self.source = source
        # 入驻的一级伙伴类型
        self.l_1partner_type = l_1partner_type
        # 入驻的二级合作类型
        self.l_2partner_type = l_2partner_type
        # 入驻申请业务单据号-幂等使用
        self.business_no = business_no
        # 合作方信息
        self.partner_information = partner_information
        # 参与人列表
        self.participants = participants
        # 签约请求
        self.sign_request = sign_request
        # 入驻申请扩展信息
        self.extend_info = extend_info
        # 入驻申请时间
        self.apply_time = apply_time
        # 入驻申请类型：新签、改签、续签
        self.apply_operate_type = apply_operate_type

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.l_1partner_type, 'l_1partner_type')
        self.validate_required(self.l_2partner_type, 'l_2partner_type')
        self.validate_required(self.business_no, 'business_no')
        self.validate_required(self.partner_information, 'partner_information')
        if self.partner_information:
            self.partner_information.validate()
        self.validate_required(self.participants, 'participants')
        if self.participants:
            for k in self.participants:
                if k:
                    k.validate()
        self.validate_required(self.sign_request, 'sign_request')
        if self.sign_request:
            self.sign_request.validate()
        self.validate_required(self.apply_time, 'apply_time')
        if self.apply_time is not None:
            self.validate_pattern(self.apply_time, 'apply_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.apply_operate_type, 'apply_operate_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.source is not None:
            result['source'] = self.source
        if self.l_1partner_type is not None:
            result['l1_partner_type'] = self.l_1partner_type
        if self.l_2partner_type is not None:
            result['l2_partner_type'] = self.l_2partner_type
        if self.business_no is not None:
            result['business_no'] = self.business_no
        if self.partner_information is not None:
            result['partner_information'] = self.partner_information.to_map()
        result['participants'] = []
        if self.participants is not None:
            for k in self.participants:
                result['participants'].append(k.to_map() if k else None)
        if self.sign_request is not None:
            result['sign_request'] = self.sign_request.to_map()
        if self.extend_info is not None:
            result['extend_info'] = self.extend_info
        if self.apply_time is not None:
            result['apply_time'] = self.apply_time
        if self.apply_operate_type is not None:
            result['apply_operate_type'] = self.apply_operate_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('l1_partner_type') is not None:
            self.l_1partner_type = m.get('l1_partner_type')
        if m.get('l2_partner_type') is not None:
            self.l_2partner_type = m.get('l2_partner_type')
        if m.get('business_no') is not None:
            self.business_no = m.get('business_no')
        if m.get('partner_information') is not None:
            temp_model = PartnerInformation()
            self.partner_information = temp_model.from_map(m['partner_information'])
        self.participants = []
        if m.get('participants') is not None:
            for k in m.get('participants'):
                temp_model = Participant()
                self.participants.append(temp_model.from_map(k))
        if m.get('sign_request') is not None:
            temp_model = SignRequest()
            self.sign_request = temp_model.from_map(m['sign_request'])
        if m.get('extend_info') is not None:
            self.extend_info = m.get('extend_info')
        if m.get('apply_time') is not None:
            self.apply_time = m.get('apply_time')
        if m.get('apply_operate_type') is not None:
            self.apply_operate_type = m.get('apply_operate_type')
        return self


class ApplyPartnerSettleinResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        error_message: str = None,
        apply_id: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果编码
        self.code = code
        # 错误描述
        self.error_message = error_message
        # 入驻申请记录id
        self.apply_id = apply_id

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
        if self.code is not None:
            result['code'] = self.code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.apply_id is not None:
            result['apply_id'] = self.apply_id
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
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('apply_id') is not None:
            self.apply_id = m.get('apply_id')
        return self


class CancelPartnerSettleinRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        source: str = None,
        apply_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户来源-用于租户隔离
        self.source = source
        # 入驻申请id
        self.apply_id = apply_id

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.apply_id, 'apply_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.source is not None:
            result['source'] = self.source
        if self.apply_id is not None:
            result['apply_id'] = self.apply_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('apply_id') is not None:
            self.apply_id = m.get('apply_id')
        return self


class CancelPartnerSettleinResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        error_message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果码
        self.code = code
        # 错误描述
        self.error_message = error_message

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
        if self.code is not None:
            result['code'] = self.code
        if self.error_message is not None:
            result['error_message'] = self.error_message
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
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        return self


class QueryPartnerSettleinRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        source: str = None,
        apply_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户来源-用于租户隔离
        self.source = source
        # 入驻申请时，返回的申请id
        self.apply_id = apply_id

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.apply_id, 'apply_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.source is not None:
            result['source'] = self.source
        if self.apply_id is not None:
            result['apply_id'] = self.apply_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('apply_id') is not None:
            self.apply_id = m.get('apply_id')
        return self


class QueryPartnerSettleinResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        error_message: str = None,
        status: str = None,
        gmt_start: str = None,
        gmt_end: str = None,
        sign_record: SignRecord = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果码
        self.code = code
        # 错误描述
        self.error_message = error_message
        # 签约状态
        self.status = status
        # 开始时间
        self.gmt_start = gmt_start
        # 结束时间
        self.gmt_end = gmt_end
        # 签约信息
        self.sign_record = sign_record

    def validate(self):
        if self.gmt_start is not None:
            self.validate_pattern(self.gmt_start, 'gmt_start', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_end is not None:
            self.validate_pattern(self.gmt_end, 'gmt_end', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.sign_record:
            self.sign_record.validate()

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
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.status is not None:
            result['status'] = self.status
        if self.gmt_start is not None:
            result['gmt_start'] = self.gmt_start
        if self.gmt_end is not None:
            result['gmt_end'] = self.gmt_end
        if self.sign_record is not None:
            result['sign_record'] = self.sign_record.to_map()
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
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('gmt_start') is not None:
            self.gmt_start = m.get('gmt_start')
        if m.get('gmt_end') is not None:
            self.gmt_end = m.get('gmt_end')
        if m.get('sign_record') is not None:
            temp_model = SignRecord()
            self.sign_record = temp_model.from_map(m['sign_record'])
        return self


class QuerySettleinContractRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        source: str = None,
        l_1partner_type: str = None,
        l_2partner_type: str = None,
        option: PartnerStandardContractQueryOption = None,
        render_context: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户来源-用户租户间功能和数据隔离
        self.source = source
        # 一级合作类型
        self.l_1partner_type = l_1partner_type
        # 二级合作类型
        self.l_2partner_type = l_2partner_type
        # 伙伴标准合同查询扩展选项
        self.option = option
        # 合同渲染上下文，jsonString格式，key值需要提前约定好
        self.render_context = render_context

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.l_1partner_type, 'l_1partner_type')
        self.validate_required(self.l_2partner_type, 'l_2partner_type')
        if self.option:
            self.option.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.source is not None:
            result['source'] = self.source
        if self.l_1partner_type is not None:
            result['l1_partner_type'] = self.l_1partner_type
        if self.l_2partner_type is not None:
            result['l2_partner_type'] = self.l_2partner_type
        if self.option is not None:
            result['option'] = self.option.to_map()
        if self.render_context is not None:
            result['render_context'] = self.render_context
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('l1_partner_type') is not None:
            self.l_1partner_type = m.get('l1_partner_type')
        if m.get('l2_partner_type') is not None:
            self.l_2partner_type = m.get('l2_partner_type')
        if m.get('option') is not None:
            temp_model = PartnerStandardContractQueryOption()
            self.option = temp_model.from_map(m['option'])
        if m.get('render_context') is not None:
            self.render_context = m.get('render_context')
        return self


class QuerySettleinContractResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        error_message: str = None,
        valid_version: PartnerStandardContractVersion = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果码
        self.code = code
        # 错误描述
        self.error_message = error_message
        # 生效的标准合同版本
        self.valid_version = valid_version

    def validate(self):
        if self.valid_version:
            self.valid_version.validate()

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
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.valid_version is not None:
            result['valid_version'] = self.valid_version.to_map()
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
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('valid_version') is not None:
            temp_model = PartnerStandardContractVersion()
            self.valid_version = temp_model.from_map(m['valid_version'])
        return self


class CreateExpenditureProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        source: str = None,
        cooperation_plan_id: int = None,
        business_no: str = None,
        tenant_id: str = None,
        participants: List[Participant] = None,
        expenditure_quotation_request: ExpenditureQuotationRequest = None,
        sign_request: SignRequest = None,
        settlement_request: SettlementRequest = None,
        valid_time: str = None,
        invalid_time: str = None,
        extend_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户来源-用于租户间功能和数据隔离
        self.source = source
        # 合作计划id
        self.cooperation_plan_id = cooperation_plan_id
        # 业务单据号-用于幂等
        self.business_no = business_no
        # 合作方-用户id
        self.tenant_id = tenant_id
        # 参与人列表
        self.participants = participants
        # 支出配置单请求信息
        self.expenditure_quotation_request = expenditure_quotation_request
        # 签约请求
        self.sign_request = sign_request
        # 结算请求
        self.settlement_request = settlement_request
        # 生效时间
        self.valid_time = valid_time
        # 失效时间
        self.invalid_time = invalid_time
        # 扩展信息
        self.extend_info = extend_info

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.cooperation_plan_id, 'cooperation_plan_id')
        self.validate_required(self.business_no, 'business_no')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.participants, 'participants')
        if self.participants:
            for k in self.participants:
                if k:
                    k.validate()
        self.validate_required(self.expenditure_quotation_request, 'expenditure_quotation_request')
        if self.expenditure_quotation_request:
            self.expenditure_quotation_request.validate()
        self.validate_required(self.sign_request, 'sign_request')
        if self.sign_request:
            self.sign_request.validate()
        self.validate_required(self.settlement_request, 'settlement_request')
        if self.settlement_request:
            self.settlement_request.validate()
        if self.valid_time is not None:
            self.validate_pattern(self.valid_time, 'valid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.invalid_time, 'invalid_time')
        if self.invalid_time is not None:
            self.validate_pattern(self.invalid_time, 'invalid_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.extend_info, 'extend_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.source is not None:
            result['source'] = self.source
        if self.cooperation_plan_id is not None:
            result['cooperation_plan_id'] = self.cooperation_plan_id
        if self.business_no is not None:
            result['business_no'] = self.business_no
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        result['participants'] = []
        if self.participants is not None:
            for k in self.participants:
                result['participants'].append(k.to_map() if k else None)
        if self.expenditure_quotation_request is not None:
            result['expenditure_quotation_request'] = self.expenditure_quotation_request.to_map()
        if self.sign_request is not None:
            result['sign_request'] = self.sign_request.to_map()
        if self.settlement_request is not None:
            result['settlement_request'] = self.settlement_request.to_map()
        if self.valid_time is not None:
            result['valid_time'] = self.valid_time
        if self.invalid_time is not None:
            result['invalid_time'] = self.invalid_time
        if self.extend_info is not None:
            result['extend_info'] = self.extend_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('cooperation_plan_id') is not None:
            self.cooperation_plan_id = m.get('cooperation_plan_id')
        if m.get('business_no') is not None:
            self.business_no = m.get('business_no')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        self.participants = []
        if m.get('participants') is not None:
            for k in m.get('participants'):
                temp_model = Participant()
                self.participants.append(temp_model.from_map(k))
        if m.get('expenditure_quotation_request') is not None:
            temp_model = ExpenditureQuotationRequest()
            self.expenditure_quotation_request = temp_model.from_map(m['expenditure_quotation_request'])
        if m.get('sign_request') is not None:
            temp_model = SignRequest()
            self.sign_request = temp_model.from_map(m['sign_request'])
        if m.get('settlement_request') is not None:
            temp_model = SettlementRequest()
            self.settlement_request = temp_model.from_map(m['settlement_request'])
        if m.get('valid_time') is not None:
            self.valid_time = m.get('valid_time')
        if m.get('invalid_time') is not None:
            self.invalid_time = m.get('invalid_time')
        if m.get('extend_info') is not None:
            self.extend_info = m.get('extend_info')
        return self


class CreateExpenditureProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        error_message: str = None,
        project_id: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果码
        self.code = code
        # 错误描述
        self.error_message = error_message
        # 项目id，用于后续交互使用
        self.project_id = project_id

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
        if self.code is not None:
            result['code'] = self.code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.project_id is not None:
            result['project_id'] = self.project_id
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
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class QueryExpenditureProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        source: str = None,
        project_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户来源-用于租户间功能和数据的隔离
        self.source = source
        # 项目id
        self.project_id = project_id

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.project_id, 'project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.source is not None:
            result['source'] = self.source
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class QueryExpenditureProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        error_message: str = None,
        detail: ExpenditureProject = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果码
        self.code = code
        # 错误描述
        self.error_message = error_message
        # 支出项目信息
        self.detail = detail

    def validate(self):
        if self.detail:
            self.detail.validate()

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
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.detail is not None:
            result['detail'] = self.detail.to_map()
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
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('detail') is not None:
            temp_model = ExpenditureProject()
            self.detail = temp_model.from_map(m['detail'])
        return self


class CancelExpenditureProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        source: str = None,
        project_id: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户来源-用于租户间功能和数据的隔离
        self.source = source
        # 项目id
        self.project_id = project_id

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.project_id, 'project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.source is not None:
            result['source'] = self.source
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class CancelExpenditureProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        error_message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果码
        self.code = code
        # 错误描述
        self.error_message = error_message

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
        if self.code is not None:
            result['code'] = self.code
        if self.error_message is not None:
            result['error_message'] = self.error_message
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
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        return self


class ConfirmExpenditureProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        source: str = None,
        project_id: int = None,
        confirm_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户
        self.source = source
        # 项目id
        self.project_id = project_id
        # 客户确认时间
        self.confirm_time = confirm_time

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.confirm_time, 'confirm_time')
        if self.confirm_time is not None:
            self.validate_pattern(self.confirm_time, 'confirm_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.source is not None:
            result['source'] = self.source
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.confirm_time is not None:
            result['confirm_time'] = self.confirm_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('confirm_time') is not None:
            self.confirm_time = m.get('confirm_time')
        return self


class ConfirmExpenditureProjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        error_message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果码
        self.code = code
        # 错误描述
        self.error_message = error_message

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
        if self.code is not None:
            result['code'] = self.code
        if self.error_message is not None:
            result['error_message'] = self.error_message
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
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        return self


class QueryStandardAgreementRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        source: str = None,
        l_1partner_type: str = None,
        l_2partner_type: str = None,
        scene: str = None,
        option: PartnerStandardContractQueryOption = None,
        render_context: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户来源-用户租户间功能和数据隔离
        self.source = source
        # 一级合作类型
        # 
        self.l_1partner_type = l_1partner_type
        # 二级合作类型
        self.l_2partner_type = l_2partner_type
        # 标准额合同场景
        self.scene = scene
        # 伙伴标准合同查询扩展选项
        # 
        self.option = option
        # 合同渲染上下文，jsonString格式，key值需要提前约定好
        self.render_context = render_context

    def validate(self):
        self.validate_required(self.source, 'source')
        self.validate_required(self.l_1partner_type, 'l_1partner_type')
        self.validate_required(self.l_2partner_type, 'l_2partner_type')
        self.validate_required(self.scene, 'scene')
        if self.option:
            self.option.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.source is not None:
            result['source'] = self.source
        if self.l_1partner_type is not None:
            result['l1_partner_type'] = self.l_1partner_type
        if self.l_2partner_type is not None:
            result['l2_partner_type'] = self.l_2partner_type
        if self.scene is not None:
            result['scene'] = self.scene
        if self.option is not None:
            result['option'] = self.option.to_map()
        if self.render_context is not None:
            result['render_context'] = self.render_context
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('source') is not None:
            self.source = m.get('source')
        if m.get('l1_partner_type') is not None:
            self.l_1partner_type = m.get('l1_partner_type')
        if m.get('l2_partner_type') is not None:
            self.l_2partner_type = m.get('l2_partner_type')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('option') is not None:
            temp_model = PartnerStandardContractQueryOption()
            self.option = temp_model.from_map(m['option'])
        if m.get('render_context') is not None:
            self.render_context = m.get('render_context')
        return self


class QueryStandardAgreementResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        error_message: str = None,
        valid_version: PartnerStandardContractVersion = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果码
        self.code = code
        # 错误描述
        self.error_message = error_message
        # 生效的标准合同版本
        self.valid_version = valid_version

    def validate(self):
        if self.valid_version:
            self.valid_version.validate()

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
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.valid_version is not None:
            result['valid_version'] = self.valid_version.to_map()
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
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('valid_version') is not None:
            temp_model = PartnerStandardContractVersion()
            self.valid_version = temp_model.from_map(m['valid_version'])
        return self


class QueryAreaProvinceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        province: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 省份, 空:全部省份, 不为空筛选关键字省份
        self.province = province

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.province is not None:
            result['province'] = self.province
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('province') is not None:
            self.province = m.get('province')
        return self


class QueryAreaProvinceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        provinces: List[Province] = None,
        error_message: str = None,
        code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 省份信息列表
        self.provinces = provinces
        # 错误描述
        self.error_message = error_message
        # 结果码
        self.code = code

    def validate(self):
        if self.provinces:
            for k in self.provinces:
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
        result['provinces'] = []
        if self.provinces is not None:
            for k in self.provinces:
                result['provinces'].append(k.to_map() if k else None)
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.code is not None:
            result['code'] = self.code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.provinces = []
        if m.get('provinces') is not None:
            for k in m.get('provinces'):
                temp_model = Province()
                self.provinces.append(temp_model.from_map(k))
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('code') is not None:
            self.code = m.get('code')
        return self


class QueryAreaCityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        province: str = None,
        city: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 省份名称
        self.province = province
        # 城市
        self.city = city

    def validate(self):
        self.validate_required(self.province, 'province')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.province is not None:
            result['province'] = self.province
        if self.city is not None:
            result['city'] = self.city
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('province') is not None:
            self.province = m.get('province')
        if m.get('city') is not None:
            self.city = m.get('city')
        return self


class QueryAreaCityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        cities: List[City] = None,
        code: str = None,
        error_message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 城市列表
        self.cities = cities
        # 结果码
        self.code = code
        # 错误描述
        self.error_message = error_message

    def validate(self):
        if self.cities:
            for k in self.cities:
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
        result['cities'] = []
        if self.cities is not None:
            for k in self.cities:
                result['cities'].append(k.to_map() if k else None)
        if self.code is not None:
            result['code'] = self.code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.cities = []
        if m.get('cities') is not None:
            for k in m.get('cities'):
                temp_model = City()
                self.cities.append(temp_model.from_map(k))
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        return self


class QueryPbcInstitutionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        inst_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 机构名称关键字
        self.inst_name = inst_name

    def validate(self):
        self.validate_required(self.inst_name, 'inst_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.inst_name is not None:
            result['inst_name'] = self.inst_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('inst_name') is not None:
            self.inst_name = m.get('inst_name')
        return self


class QueryPbcInstitutionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        institutions: List[Institution] = None,
        code: str = None,
        error_message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 银行机构信息列表
        self.institutions = institutions
        # 结果码
        self.code = code
        # 错误描述
        self.error_message = error_message

    def validate(self):
        if self.institutions:
            for k in self.institutions:
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
        result['institutions'] = []
        if self.institutions is not None:
            for k in self.institutions:
                result['institutions'].append(k.to_map() if k else None)
        if self.code is not None:
            result['code'] = self.code
        if self.error_message is not None:
            result['error_message'] = self.error_message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.institutions = []
        if m.get('institutions') is not None:
            for k in m.get('institutions'):
                temp_model = Institution()
                self.institutions.append(temp_model.from_map(k))
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        return self


class QueryPbcNameRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        province: str = None,
        city: str = None,
        inst_id: str = None,
        branch_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 省份名称
        self.province = province
        # 城市名称
        self.city = city
        # 银行机构id
        self.inst_id = inst_id
        # 支行名称关键字
        self.branch_name = branch_name

    def validate(self):
        self.validate_required(self.province, 'province')
        self.validate_required(self.city, 'city')
        self.validate_required(self.inst_id, 'inst_id')
        self.validate_required(self.branch_name, 'branch_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.province is not None:
            result['province'] = self.province
        if self.city is not None:
            result['city'] = self.city
        if self.inst_id is not None:
            result['inst_id'] = self.inst_id
        if self.branch_name is not None:
            result['branch_name'] = self.branch_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('province') is not None:
            self.province = m.get('province')
        if m.get('city') is not None:
            self.city = m.get('city')
        if m.get('inst_id') is not None:
            self.inst_id = m.get('inst_id')
        if m.get('branch_name') is not None:
            self.branch_name = m.get('branch_name')
        return self


class QueryPbcNameResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pbc_infos: List[PbcInfo] = None,
        error_message: str = None,
        code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询到的支行信息列表
        self.pbc_infos = pbc_infos
        # 错误描述
        self.error_message = error_message
        # 结果码
        self.code = code

    def validate(self):
        if self.pbc_infos:
            for k in self.pbc_infos:
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
        result['pbc_infos'] = []
        if self.pbc_infos is not None:
            for k in self.pbc_infos:
                result['pbc_infos'].append(k.to_map() if k else None)
        if self.error_message is not None:
            result['error_message'] = self.error_message
        if self.code is not None:
            result['code'] = self.code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.pbc_infos = []
        if m.get('pbc_infos') is not None:
            for k in m.get('pbc_infos'):
                temp_model = PbcInfo()
                self.pbc_infos.append(temp_model.from_map(k))
        if m.get('error_message') is not None:
            self.error_message = m.get('error_message')
        if m.get('code') is not None:
            self.code = m.get('code')
        return self


