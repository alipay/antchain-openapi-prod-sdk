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


class EnterpriseStaff(TeaModel):
    def __init__(
        self,
        name: str = None,
        type: str = None,
        type_join: List[str] = None,
    ):
        # 主要人员名称
        self.name = name
        # 法人类型，1-人;2-公司
        self.type = type
        # 经理
        self.type_join = type_join

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.type_join is not None:
            result['type_join'] = self.type_join
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('type_join') is not None:
            self.type_join = m.get('type_join')
        return self


class InterfaceInput(TeaModel):
    def __init__(
        self,
        name: str = None,
        type: str = None,
        description: str = None,
        required: bool = None,
    ):
        # 接口入参名称
        self.name = name
        # 接口入参类型
        self.type = type
        # 接口入参描述
        self.description = description
        # 接口入参是否必填
        self.required = required

    def validate(self):
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 50)
        if self.type is not None:
            self.validate_max_length(self.type, 'type', 50)
        if self.description is not None:
            self.validate_max_length(self.description, 'description', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.description is not None:
            result['description'] = self.description
        if self.required is not None:
            result['required'] = self.required
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('required') is not None:
            self.required = m.get('required')
        return self


class InterfaceOutput(TeaModel):
    def __init__(
        self,
        name: str = None,
        type: str = None,
        description: str = None,
    ):
        # 接口出参名称
        self.name = name
        # 接口出参类型
        self.type = type
        # 接口出参描述
        self.description = description

    def validate(self):
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 50)
        if self.type is not None:
            self.validate_max_length(self.type, 'type', 50)
        if self.description is not None:
            self.validate_max_length(self.description, 'description', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class Agreement(TeaModel):
    def __init__(
        self,
        agreement_code: str = None,
        agreement_name: str = None,
        agreement_type: str = None,
        agreement_url: str = None,
        agreement_file_oss_key: str = None,
        agreement_file_original_name: str = None,
        download_url: str = None,
    ):
        # 协议编码
        self.agreement_code = agreement_code
        # 协议名称
        self.agreement_name = agreement_name
        # 协议类型
        self.agreement_type = agreement_type
        # 第三方原始协议链接
        self.agreement_url = agreement_url
        # 协议文件上传目录
        self.agreement_file_oss_key = agreement_file_oss_key
        # 上传时的协议原始文件名
        self.agreement_file_original_name = agreement_file_original_name
        # 下载链接
        self.download_url = download_url

    def validate(self):
        self.validate_required(self.agreement_code, 'agreement_code')
        self.validate_required(self.agreement_name, 'agreement_name')
        self.validate_required(self.agreement_type, 'agreement_type')
        self.validate_required(self.agreement_url, 'agreement_url')
        self.validate_required(self.agreement_file_oss_key, 'agreement_file_oss_key')
        self.validate_required(self.agreement_file_original_name, 'agreement_file_original_name')
        self.validate_required(self.download_url, 'download_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.agreement_code is not None:
            result['agreement_code'] = self.agreement_code
        if self.agreement_name is not None:
            result['agreement_name'] = self.agreement_name
        if self.agreement_type is not None:
            result['agreement_type'] = self.agreement_type
        if self.agreement_url is not None:
            result['agreement_url'] = self.agreement_url
        if self.agreement_file_oss_key is not None:
            result['agreement_file_oss_key'] = self.agreement_file_oss_key
        if self.agreement_file_original_name is not None:
            result['agreement_file_original_name'] = self.agreement_file_original_name
        if self.download_url is not None:
            result['download_url'] = self.download_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('agreement_code') is not None:
            self.agreement_code = m.get('agreement_code')
        if m.get('agreement_name') is not None:
            self.agreement_name = m.get('agreement_name')
        if m.get('agreement_type') is not None:
            self.agreement_type = m.get('agreement_type')
        if m.get('agreement_url') is not None:
            self.agreement_url = m.get('agreement_url')
        if m.get('agreement_file_oss_key') is not None:
            self.agreement_file_oss_key = m.get('agreement_file_oss_key')
        if m.get('agreement_file_original_name') is not None:
            self.agreement_file_original_name = m.get('agreement_file_original_name')
        if m.get('download_url') is not None:
            self.download_url = m.get('download_url')
        return self


class ProductProviderInfo(TeaModel):
    def __init__(
        self,
        product_identity_id: str = None,
        source_enterprise_code: str = None,
        source_enterprise_name: str = None,
    ):
        # 数据产品标识
        self.product_identity_id = product_identity_id
        # 数据源企业code
        self.source_enterprise_code = source_enterprise_code
        # 数据源企业名称
        self.source_enterprise_name = source_enterprise_name

    def validate(self):
        self.validate_required(self.product_identity_id, 'product_identity_id')
        self.validate_required(self.source_enterprise_code, 'source_enterprise_code')
        self.validate_required(self.source_enterprise_name, 'source_enterprise_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_identity_id is not None:
            result['product_identity_id'] = self.product_identity_id
        if self.source_enterprise_code is not None:
            result['source_enterprise_code'] = self.source_enterprise_code
        if self.source_enterprise_name is not None:
            result['source_enterprise_name'] = self.source_enterprise_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_identity_id') is not None:
            self.product_identity_id = m.get('product_identity_id')
        if m.get('source_enterprise_code') is not None:
            self.source_enterprise_code = m.get('source_enterprise_code')
        if m.get('source_enterprise_name') is not None:
            self.source_enterprise_name = m.get('source_enterprise_name')
        return self


class TmCoownerInfo(TeaModel):
    def __init__(
        self,
        coowner_name_cn: str = None,
        coowner_addr_cn: str = None,
        coowner_name_en: str = None,
        coowner_addr_en: str = None,
    ):
        # 共有人中文名称
        self.coowner_name_cn = coowner_name_cn
        # 共有人中文地址
        self.coowner_addr_cn = coowner_addr_cn
        # 共有人英文名称
        self.coowner_name_en = coowner_name_en
        # 共有人英文地址
        self.coowner_addr_en = coowner_addr_en

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.coowner_name_cn is not None:
            result['coowner_name_cn'] = self.coowner_name_cn
        if self.coowner_addr_cn is not None:
            result['coowner_addr_cn'] = self.coowner_addr_cn
        if self.coowner_name_en is not None:
            result['coowner_name_en'] = self.coowner_name_en
        if self.coowner_addr_en is not None:
            result['coowner_addr_en'] = self.coowner_addr_en
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('coowner_name_cn') is not None:
            self.coowner_name_cn = m.get('coowner_name_cn')
        if m.get('coowner_addr_cn') is not None:
            self.coowner_addr_cn = m.get('coowner_addr_cn')
        if m.get('coowner_name_en') is not None:
            self.coowner_name_en = m.get('coowner_name_en')
        if m.get('coowner_addr_en') is not None:
            self.coowner_addr_en = m.get('coowner_addr_en')
        return self


class AuthContent(TeaModel):
    def __init__(
        self,
        product_code_list: List[str] = None,
        product_param: str = None,
        auth_content_code: str = None,
        auth_content_name: str = None,
    ):
        # 产品code列表
        self.product_code_list = product_code_list
        # 数据产品入参,JSON数组
        self.product_param = product_param
        # C端展示授权内容code
        self.auth_content_code = auth_content_code
        # C端展示授权内容名称
        self.auth_content_name = auth_content_name

    def validate(self):
        self.validate_required(self.product_code_list, 'product_code_list')
        self.validate_required(self.product_param, 'product_param')
        self.validate_required(self.auth_content_code, 'auth_content_code')
        self.validate_required(self.auth_content_name, 'auth_content_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_code_list is not None:
            result['product_code_list'] = self.product_code_list
        if self.product_param is not None:
            result['product_param'] = self.product_param
        if self.auth_content_code is not None:
            result['auth_content_code'] = self.auth_content_code
        if self.auth_content_name is not None:
            result['auth_content_name'] = self.auth_content_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_code_list') is not None:
            self.product_code_list = m.get('product_code_list')
        if m.get('product_param') is not None:
            self.product_param = m.get('product_param')
        if m.get('auth_content_code') is not None:
            self.auth_content_code = m.get('auth_content_code')
        if m.get('auth_content_name') is not None:
            self.auth_content_name = m.get('auth_content_name')
        return self


class StockHolder(TeaModel):
    def __init__(
        self,
        org_holder_type: str = None,
        invest_date: str = None,
        invest_rate: str = None,
        subscript_amt: str = None,
        or_holder_name: str = None,
    ):
        # 股东类型
        self.org_holder_type = org_holder_type
        # 出资时间
        self.invest_date = invest_date
        # 占比
        self.invest_rate = invest_rate
        # 出资金额
        self.subscript_amt = subscript_amt
        # 股东名
        self.or_holder_name = or_holder_name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.org_holder_type is not None:
            result['org_holder_type'] = self.org_holder_type
        if self.invest_date is not None:
            result['invest_date'] = self.invest_date
        if self.invest_rate is not None:
            result['invest_rate'] = self.invest_rate
        if self.subscript_amt is not None:
            result['subscript_amt'] = self.subscript_amt
        if self.or_holder_name is not None:
            result['or_holder_name'] = self.or_holder_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('org_holder_type') is not None:
            self.org_holder_type = m.get('org_holder_type')
        if m.get('invest_date') is not None:
            self.invest_date = m.get('invest_date')
        if m.get('invest_rate') is not None:
            self.invest_rate = m.get('invest_rate')
        if m.get('subscript_amt') is not None:
            self.subscript_amt = m.get('subscript_amt')
        if m.get('or_holder_name') is not None:
            self.or_holder_name = m.get('or_holder_name')
        return self


class EnterpriseBasicInfo(TeaModel):
    def __init__(
        self,
        reg_status: str = None,
        establish_time: str = None,
        reg_capital: str = None,
        industry: str = None,
        staff_list: List[EnterpriseStaff] = None,
        type: str = None,
        reg_capital_currency: str = None,
        legal_person_name: str = None,
        reg_number: str = None,
        credit_code: str = None,
        name: str = None,
        company_org_type: str = None,
        base: str = None,
    ):
        # 企业状态
        self.reg_status = reg_status
        # 成立日期(注册日期)
        self.establish_time = establish_time
        # 注册资本
        self.reg_capital = reg_capital
        # 行业
        self.industry = industry
        # 主要人员
        self.staff_list = staff_list
        # 法人类型，1-人;2-公司
        self.type = type
        # 注册资本币种:人民币、美元、欧元等
        self.reg_capital_currency = reg_capital_currency
        # 法人姓名
        self.legal_person_name = legal_person_name
        # 注册号
        self.reg_number = reg_number
        # 统一社会信用代码
        self.credit_code = credit_code
        # 企业名
        self.name = name
        # 企业类型
        self.company_org_type = company_org_type
        # 省份简称
        self.base = base

    def validate(self):
        if self.staff_list:
            for k in self.staff_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.reg_status is not None:
            result['reg_status'] = self.reg_status
        if self.establish_time is not None:
            result['establish_time'] = self.establish_time
        if self.reg_capital is not None:
            result['reg_capital'] = self.reg_capital
        if self.industry is not None:
            result['industry'] = self.industry
        result['staff_list'] = []
        if self.staff_list is not None:
            for k in self.staff_list:
                result['staff_list'].append(k.to_map() if k else None)
        if self.type is not None:
            result['type'] = self.type
        if self.reg_capital_currency is not None:
            result['reg_capital_currency'] = self.reg_capital_currency
        if self.legal_person_name is not None:
            result['legal_person_name'] = self.legal_person_name
        if self.reg_number is not None:
            result['reg_number'] = self.reg_number
        if self.credit_code is not None:
            result['credit_code'] = self.credit_code
        if self.name is not None:
            result['name'] = self.name
        if self.company_org_type is not None:
            result['company_org_type'] = self.company_org_type
        if self.base is not None:
            result['base'] = self.base
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('reg_status') is not None:
            self.reg_status = m.get('reg_status')
        if m.get('establish_time') is not None:
            self.establish_time = m.get('establish_time')
        if m.get('reg_capital') is not None:
            self.reg_capital = m.get('reg_capital')
        if m.get('industry') is not None:
            self.industry = m.get('industry')
        self.staff_list = []
        if m.get('staff_list') is not None:
            for k in m.get('staff_list'):
                temp_model = EnterpriseStaff()
                self.staff_list.append(temp_model.from_map(k))
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('reg_capital_currency') is not None:
            self.reg_capital_currency = m.get('reg_capital_currency')
        if m.get('legal_person_name') is not None:
            self.legal_person_name = m.get('legal_person_name')
        if m.get('reg_number') is not None:
            self.reg_number = m.get('reg_number')
        if m.get('credit_code') is not None:
            self.credit_code = m.get('credit_code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('company_org_type') is not None:
            self.company_org_type = m.get('company_org_type')
        if m.get('base') is not None:
            self.base = m.get('base')
        return self


class DataSourceInterface(TeaModel):
    def __init__(
        self,
        address: str = None,
        interface_request_method: str = None,
        interface_input: List[InterfaceInput] = None,
        interface_output: List[InterfaceOutput] = None,
    ):
        # 数据源接口访问地址
        self.address = address
        # 数据源接口请求方法类型
        self.interface_request_method = interface_request_method
        # 数据源接口入参列表
        self.interface_input = interface_input
        # 数据源接口出参列表
        self.interface_output = interface_output

    def validate(self):
        self.validate_required(self.address, 'address')
        if self.address is not None:
            self.validate_max_length(self.address, 'address', 100)
        self.validate_required(self.interface_request_method, 'interface_request_method')
        if self.interface_request_method is not None:
            self.validate_max_length(self.interface_request_method, 'interface_request_method', 50)
        if self.interface_input:
            for k in self.interface_input:
                if k:
                    k.validate()
        if self.interface_output:
            for k in self.interface_output:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.address is not None:
            result['address'] = self.address
        if self.interface_request_method is not None:
            result['interface_request_method'] = self.interface_request_method
        result['interface_input'] = []
        if self.interface_input is not None:
            for k in self.interface_input:
                result['interface_input'].append(k.to_map() if k else None)
        result['interface_output'] = []
        if self.interface_output is not None:
            for k in self.interface_output:
                result['interface_output'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('interface_request_method') is not None:
            self.interface_request_method = m.get('interface_request_method')
        self.interface_input = []
        if m.get('interface_input') is not None:
            for k in m.get('interface_input'):
                temp_model = InterfaceInput()
                self.interface_input.append(temp_model.from_map(k))
        self.interface_output = []
        if m.get('interface_output') is not None:
            for k in m.get('interface_output'):
                temp_model = InterfaceOutput()
                self.interface_output.append(temp_model.from_map(k))
        return self


class DomesticTmGoodsInfo(TeaModel):
    def __init__(
        self,
        goods_cn_name: str = None,
        similar_code: str = None,
    ):
        # 商品中文名称
        self.goods_cn_name = goods_cn_name
        # 类似群编码
        self.similar_code = similar_code

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.goods_cn_name is not None:
            result['goods_cn_name'] = self.goods_cn_name
        if self.similar_code is not None:
            result['similar_code'] = self.similar_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('goods_cn_name') is not None:
            self.goods_cn_name = m.get('goods_cn_name')
        if m.get('similar_code') is not None:
            self.similar_code = m.get('similar_code')
        return self


class WorkExperiencesInfo(TeaModel):
    def __init__(
        self,
        work_start_time: int = None,
        work_end_time: int = None,
        company_name: str = None,
        work_desc: str = None,
        job_name: str = None,
        profession_name: str = None,
    ):
        # 工作开始日期
        self.work_start_time = work_start_time
        # 工作结束日期
        self.work_end_time = work_end_time
        # 公司名称
        self.company_name = company_name
        # 工作描述
        self.work_desc = work_desc
        # 职业
        self.job_name = job_name
        # 行业名称
        self.profession_name = profession_name

    def validate(self):
        if self.work_start_time is not None:
            self.validate_maximum(self.work_start_time, 'work_start_time', 32)
        if self.work_end_time is not None:
            self.validate_maximum(self.work_end_time, 'work_end_time', 32)
        if self.company_name is not None:
            self.validate_max_length(self.company_name, 'company_name', 128)
        if self.work_desc is not None:
            self.validate_max_length(self.work_desc, 'work_desc', 1024)
        if self.job_name is not None:
            self.validate_max_length(self.job_name, 'job_name', 128)
        if self.profession_name is not None:
            self.validate_max_length(self.profession_name, 'profession_name', 128)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.work_start_time is not None:
            result['work_start_time'] = self.work_start_time
        if self.work_end_time is not None:
            result['work_end_time'] = self.work_end_time
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.work_desc is not None:
            result['work_desc'] = self.work_desc
        if self.job_name is not None:
            result['job_name'] = self.job_name
        if self.profession_name is not None:
            result['profession_name'] = self.profession_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('work_start_time') is not None:
            self.work_start_time = m.get('work_start_time')
        if m.get('work_end_time') is not None:
            self.work_end_time = m.get('work_end_time')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('work_desc') is not None:
            self.work_desc = m.get('work_desc')
        if m.get('job_name') is not None:
            self.job_name = m.get('job_name')
        if m.get('profession_name') is not None:
            self.profession_name = m.get('profession_name')
        return self


class ProductParamInfo(TeaModel):
    def __init__(
        self,
        biz_type: str = None,
        param_key: str = None,
        param_type: str = None,
        param_desc: str = None,
    ):
        # 参数业务类型
        self.biz_type = biz_type
        # 参数key
        self.param_key = param_key
        # 参数类型
        self.param_type = param_type
        # 参数描述
        self.param_desc = param_desc

    def validate(self):
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.param_key, 'param_key')
        self.validate_required(self.param_type, 'param_type')
        self.validate_required(self.param_desc, 'param_desc')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.param_key is not None:
            result['param_key'] = self.param_key
        if self.param_type is not None:
            result['param_type'] = self.param_type
        if self.param_desc is not None:
            result['param_desc'] = self.param_desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('param_key') is not None:
            self.param_key = m.get('param_key')
        if m.get('param_type') is not None:
            self.param_type = m.get('param_type')
        if m.get('param_desc') is not None:
            self.param_desc = m.get('param_desc')
        return self


class BasicCarInfo(TeaModel):
    def __init__(
        self,
        license_no: str = None,
        license_type: str = None,
        vin: str = None,
        engine_no: str = None,
    ):
        # 号牌号码
        self.license_no = license_no
        # 号牌种类，枚举值
        self.license_type = license_type
        # 车架号
        self.vin = vin
        # 发动机号
        self.engine_no = engine_no

    def validate(self):
        self.validate_required(self.license_no, 'license_no')
        self.validate_required(self.license_type, 'license_type')
        self.validate_required(self.vin, 'vin')
        self.validate_required(self.engine_no, 'engine_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.license_no is not None:
            result['license_no'] = self.license_no
        if self.license_type is not None:
            result['license_type'] = self.license_type
        if self.vin is not None:
            result['vin'] = self.vin
        if self.engine_no is not None:
            result['engine_no'] = self.engine_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('license_no') is not None:
            self.license_no = m.get('license_no')
        if m.get('license_type') is not None:
            self.license_type = m.get('license_type')
        if m.get('vin') is not None:
            self.vin = m.get('vin')
        if m.get('engine_no') is not None:
            self.engine_no = m.get('engine_no')
        return self


class VehicleLicenseInfo(TeaModel):
    def __init__(
        self,
        brand_name: str = None,
        body_color: str = None,
        properties: str = None,
        type: str = None,
        vehicle_type: str = None,
        engine_number: str = None,
        engine_model: str = None,
        first_registry_date: str = None,
        inspection_expire_date: str = None,
        vehicle_status: str = None,
        passengers: str = None,
        retirement_date: str = None,
        fuel_type: str = None,
        displacement: str = None,
        pps_date: str = None,
        maximum_power: str = None,
        shaft: str = None,
        wheel_base: str = None,
        front_tread: str = None,
        rear_tread: str = None,
        cross_weight: str = None,
        curb_weight: str = None,
        load_weight: str = None,
        vin: str = None,
        plate_number: str = None,
        plate_type: str = None,
        inspection_date: str = None,
    ):
        # 品牌名称
        self.brand_name = brand_name
        # 车身颜色
        self.body_color = body_color
        # 使用性质
        self.properties = properties
        # 车型
        self.type = type
        # 车辆类型
        self.vehicle_type = vehicle_type
        # 发动机号
        self.engine_number = engine_number
        # 发动机型号
        self.engine_model = engine_model
        # 初次登记日期
        self.first_registry_date = first_registry_date
        # 检验失效日期
        self.inspection_expire_date = inspection_expire_date
        # 车辆状态
        self.vehicle_status = vehicle_status
        # 核定载客数
        self.passengers = passengers
        # 强制报废期止
        self.retirement_date = retirement_date
        # 燃料种类
        self.fuel_type = fuel_type
        # 排量
        self.displacement = displacement
        # 出厂日期
        self.pps_date = pps_date
        # 最大功率
        self.maximum_power = maximum_power
        # 轴数
        self.shaft = shaft
        # 轴距
        self.wheel_base = wheel_base
        # 前轮距
        self.front_tread = front_tread
        # 后轮距
        self.rear_tread = rear_tread
        # 总重量
        self.cross_weight = cross_weight
        # 整备质量
        self.curb_weight = curb_weight
        # 核定载质量
        self.load_weight = load_weight
        # 车架号
        self.vin = vin
        # 车牌号
        self.plate_number = plate_number
        # 车牌种类
        self.plate_type = plate_type
        # 检车日期
        self.inspection_date = inspection_date

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.brand_name is not None:
            result['brand_name'] = self.brand_name
        if self.body_color is not None:
            result['body_color'] = self.body_color
        if self.properties is not None:
            result['properties'] = self.properties
        if self.type is not None:
            result['type'] = self.type
        if self.vehicle_type is not None:
            result['vehicle_type'] = self.vehicle_type
        if self.engine_number is not None:
            result['engine_number'] = self.engine_number
        if self.engine_model is not None:
            result['engine_model'] = self.engine_model
        if self.first_registry_date is not None:
            result['first_registry_date'] = self.first_registry_date
        if self.inspection_expire_date is not None:
            result['inspection_expire_date'] = self.inspection_expire_date
        if self.vehicle_status is not None:
            result['vehicle_status'] = self.vehicle_status
        if self.passengers is not None:
            result['passengers'] = self.passengers
        if self.retirement_date is not None:
            result['retirement_date'] = self.retirement_date
        if self.fuel_type is not None:
            result['fuel_type'] = self.fuel_type
        if self.displacement is not None:
            result['displacement'] = self.displacement
        if self.pps_date is not None:
            result['pps_date'] = self.pps_date
        if self.maximum_power is not None:
            result['maximum_power'] = self.maximum_power
        if self.shaft is not None:
            result['shaft'] = self.shaft
        if self.wheel_base is not None:
            result['wheel_base'] = self.wheel_base
        if self.front_tread is not None:
            result['front_tread'] = self.front_tread
        if self.rear_tread is not None:
            result['rear_tread'] = self.rear_tread
        if self.cross_weight is not None:
            result['cross_weight'] = self.cross_weight
        if self.curb_weight is not None:
            result['curb_weight'] = self.curb_weight
        if self.load_weight is not None:
            result['load_weight'] = self.load_weight
        if self.vin is not None:
            result['vin'] = self.vin
        if self.plate_number is not None:
            result['plate_number'] = self.plate_number
        if self.plate_type is not None:
            result['plate_type'] = self.plate_type
        if self.inspection_date is not None:
            result['inspection_date'] = self.inspection_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('brand_name') is not None:
            self.brand_name = m.get('brand_name')
        if m.get('body_color') is not None:
            self.body_color = m.get('body_color')
        if m.get('properties') is not None:
            self.properties = m.get('properties')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('vehicle_type') is not None:
            self.vehicle_type = m.get('vehicle_type')
        if m.get('engine_number') is not None:
            self.engine_number = m.get('engine_number')
        if m.get('engine_model') is not None:
            self.engine_model = m.get('engine_model')
        if m.get('first_registry_date') is not None:
            self.first_registry_date = m.get('first_registry_date')
        if m.get('inspection_expire_date') is not None:
            self.inspection_expire_date = m.get('inspection_expire_date')
        if m.get('vehicle_status') is not None:
            self.vehicle_status = m.get('vehicle_status')
        if m.get('passengers') is not None:
            self.passengers = m.get('passengers')
        if m.get('retirement_date') is not None:
            self.retirement_date = m.get('retirement_date')
        if m.get('fuel_type') is not None:
            self.fuel_type = m.get('fuel_type')
        if m.get('displacement') is not None:
            self.displacement = m.get('displacement')
        if m.get('pps_date') is not None:
            self.pps_date = m.get('pps_date')
        if m.get('maximum_power') is not None:
            self.maximum_power = m.get('maximum_power')
        if m.get('shaft') is not None:
            self.shaft = m.get('shaft')
        if m.get('wheel_base') is not None:
            self.wheel_base = m.get('wheel_base')
        if m.get('front_tread') is not None:
            self.front_tread = m.get('front_tread')
        if m.get('rear_tread') is not None:
            self.rear_tread = m.get('rear_tread')
        if m.get('cross_weight') is not None:
            self.cross_weight = m.get('cross_weight')
        if m.get('curb_weight') is not None:
            self.curb_weight = m.get('curb_weight')
        if m.get('load_weight') is not None:
            self.load_weight = m.get('load_weight')
        if m.get('vin') is not None:
            self.vin = m.get('vin')
        if m.get('plate_number') is not None:
            self.plate_number = m.get('plate_number')
        if m.get('plate_type') is not None:
            self.plate_type = m.get('plate_type')
        if m.get('inspection_date') is not None:
            self.inspection_date = m.get('inspection_date')
        return self


class EducationExperiencesInfo(TeaModel):
    def __init__(
        self,
        degree: str = None,
        location: str = None,
        school_name: str = None,
        education_status: str = None,
        year: int = None,
        month: int = None,
    ):
        # 学历
        self.degree = degree
        # 受教育地点
        self.location = location
        # 学校名称
        self.school_name = school_name
        # 教育状态
        self.education_status = education_status
        # 年
        self.year = year
        # 月
        self.month = month

    def validate(self):
        if self.degree is not None:
            self.validate_max_length(self.degree, 'degree', 32)
        if self.location is not None:
            self.validate_max_length(self.location, 'location', 128)
        if self.school_name is not None:
            self.validate_max_length(self.school_name, 'school_name', 128)
        if self.education_status is not None:
            self.validate_max_length(self.education_status, 'education_status', 128)
        if self.year is not None:
            self.validate_maximum(self.year, 'year', 6)
        if self.month is not None:
            self.validate_maximum(self.month, 'month', 5)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.degree is not None:
            result['degree'] = self.degree
        if self.location is not None:
            result['location'] = self.location
        if self.school_name is not None:
            result['school_name'] = self.school_name
        if self.education_status is not None:
            result['education_status'] = self.education_status
        if self.year is not None:
            result['year'] = self.year
        if self.month is not None:
            result['month'] = self.month
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('degree') is not None:
            self.degree = m.get('degree')
        if m.get('location') is not None:
            self.location = m.get('location')
        if m.get('school_name') is not None:
            self.school_name = m.get('school_name')
        if m.get('education_status') is not None:
            self.education_status = m.get('education_status')
        if m.get('year') is not None:
            self.year = m.get('year')
        if m.get('month') is not None:
            self.month = m.get('month')
        return self


class EducationInfo(TeaModel):
    def __init__(
        self,
        major: str = None,
        education_level: str = None,
        graduation_date: str = None,
        education_type: str = None,
        project_211: bool = None,
        project_985: bool = None,
        double_first_class: bool = None,
    ):
        # 专业
        self.major = major
        # 学历等级代码
        self.education_level = education_level
        # 毕业日期
        self.graduation_date = graduation_date
        # 学习形式
        self.education_type = education_type
        # 是否211
        self.project_211 = project_211
        # 是否985
        self.project_985 = project_985
        # 是否双一流
        self.double_first_class = double_first_class

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.major is not None:
            result['major'] = self.major
        if self.education_level is not None:
            result['education_level'] = self.education_level
        if self.graduation_date is not None:
            result['graduation_date'] = self.graduation_date
        if self.education_type is not None:
            result['education_type'] = self.education_type
        if self.project_211 is not None:
            result['project211'] = self.project_211
        if self.project_985 is not None:
            result['project985'] = self.project_985
        if self.double_first_class is not None:
            result['double_first_class'] = self.double_first_class
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('major') is not None:
            self.major = m.get('major')
        if m.get('education_level') is not None:
            self.education_level = m.get('education_level')
        if m.get('graduation_date') is not None:
            self.graduation_date = m.get('graduation_date')
        if m.get('education_type') is not None:
            self.education_type = m.get('education_type')
        if m.get('project211') is not None:
            self.project_211 = m.get('project211')
        if m.get('project985') is not None:
            self.project_985 = m.get('project985')
        if m.get('double_first_class') is not None:
            self.double_first_class = m.get('double_first_class')
        return self


class CarUserInfo(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        phone_num: str = None,
        user_cert_name: str = None,
        user_cert_no: str = None,
    ):
        # 唯一标识用户的id
        self.user_id = user_id
        # 手机号
        self.phone_num = phone_num
        # 姓名
        self.user_cert_name = user_cert_name
        # 证件号码
        self.user_cert_no = user_cert_no

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.phone_num, 'phone_num')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        if self.user_cert_name is not None:
            result['user_cert_name'] = self.user_cert_name
        if self.user_cert_no is not None:
            result['user_cert_no'] = self.user_cert_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        if m.get('user_cert_name') is not None:
            self.user_cert_name = m.get('user_cert_name')
        if m.get('user_cert_no') is not None:
            self.user_cert_no = m.get('user_cert_no')
        return self


class AuthPersonEnterpriseInfo(TeaModel):
    def __init__(
        self,
        enterprise_name: str = None,
        enterprise_credit_num: str = None,
        enterprise_legal_person_name: str = None,
        enterprise_legal_person_id: str = None,
        enterprise_legal_person_phone_num: int = None,
    ):
        # 企业名称
        self.enterprise_name = enterprise_name
        # 企业统一社会信用码
        self.enterprise_credit_num = enterprise_credit_num
        # 企业法人姓名
        self.enterprise_legal_person_name = enterprise_legal_person_name
        # 企业法人身份证号
        self.enterprise_legal_person_id = enterprise_legal_person_id
        # 企业法人电话号码
        self.enterprise_legal_person_phone_num = enterprise_legal_person_phone_num

    def validate(self):
        self.validate_required(self.enterprise_name, 'enterprise_name')
        self.validate_required(self.enterprise_credit_num, 'enterprise_credit_num')
        self.validate_required(self.enterprise_legal_person_name, 'enterprise_legal_person_name')
        self.validate_required(self.enterprise_legal_person_id, 'enterprise_legal_person_id')
        self.validate_required(self.enterprise_legal_person_phone_num, 'enterprise_legal_person_phone_num')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.enterprise_name is not None:
            result['enterprise_name'] = self.enterprise_name
        if self.enterprise_credit_num is not None:
            result['enterprise_credit_num'] = self.enterprise_credit_num
        if self.enterprise_legal_person_name is not None:
            result['enterprise_legal_person_name'] = self.enterprise_legal_person_name
        if self.enterprise_legal_person_id is not None:
            result['enterprise_legal_person_id'] = self.enterprise_legal_person_id
        if self.enterprise_legal_person_phone_num is not None:
            result['enterprise_legal_person_phone_num'] = self.enterprise_legal_person_phone_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('enterprise_name') is not None:
            self.enterprise_name = m.get('enterprise_name')
        if m.get('enterprise_credit_num') is not None:
            self.enterprise_credit_num = m.get('enterprise_credit_num')
        if m.get('enterprise_legal_person_name') is not None:
            self.enterprise_legal_person_name = m.get('enterprise_legal_person_name')
        if m.get('enterprise_legal_person_id') is not None:
            self.enterprise_legal_person_id = m.get('enterprise_legal_person_id')
        if m.get('enterprise_legal_person_phone_num') is not None:
            self.enterprise_legal_person_phone_num = m.get('enterprise_legal_person_phone_num')
        return self


class EnterprisePersonInfo(TeaModel):
    def __init__(
        self,
        org_name: str = None,
        stockholder: StockHolder = None,
        basic_info: EnterpriseBasicInfo = None,
        relationship: List[str] = None,
    ):
        # 查询人对应企业名
        self.org_name = org_name
        # 查询人持股信息
        self.stockholder = stockholder
        # 查询人所在公司基本信息
        self.basic_info = basic_info
        # 查询人与这家企业的关联:sh 股东;lp 法人;tm 高管
        self.relationship = relationship

    def validate(self):
        if self.stockholder:
            self.stockholder.validate()
        if self.basic_info:
            self.basic_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.org_name is not None:
            result['org_name'] = self.org_name
        if self.stockholder is not None:
            result['stockholder'] = self.stockholder.to_map()
        if self.basic_info is not None:
            result['basic_info'] = self.basic_info.to_map()
        if self.relationship is not None:
            result['relationship'] = self.relationship
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('org_name') is not None:
            self.org_name = m.get('org_name')
        if m.get('stockholder') is not None:
            temp_model = StockHolder()
            self.stockholder = temp_model.from_map(m['stockholder'])
        if m.get('basic_info') is not None:
            temp_model = EnterpriseBasicInfo()
            self.basic_info = temp_model.from_map(m['basic_info'])
        if m.get('relationship') is not None:
            self.relationship = m.get('relationship')
        return self


class VehicleLicenseCertResult(TeaModel):
    def __init__(
        self,
        plate_number: bool = None,
        plate_type: bool = None,
        owner: bool = None,
    ):
        # 与车辆的车牌号是否一致
        self.plate_number = plate_number
        # 与车辆对应号牌种类是否一致
        self.plate_type = plate_type
        # 与车辆所有人是否一致
        self.owner = owner

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.plate_number is not None:
            result['plate_number'] = self.plate_number
        if self.plate_type is not None:
            result['plate_type'] = self.plate_type
        if self.owner is not None:
            result['owner'] = self.owner
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('plate_number') is not None:
            self.plate_number = m.get('plate_number')
        if m.get('plate_type') is not None:
            self.plate_type = m.get('plate_type')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        return self


class PartialCarInfo(TeaModel):
    def __init__(
        self,
        license_no: str = None,
        vin: str = None,
        engine_no: str = None,
        register_date: str = None,
        model_code: str = None,
        use_nature_code: str = None,
    ):
        # 车牌号码
        self.license_no = license_no
        # 车架号
        self.vin = vin
        # 发动机号
        self.engine_no = engine_no
        # 初登日期
        self.register_date = register_date
        # 车辆型号
        self.model_code = model_code
        # 营运性质
        self.use_nature_code = use_nature_code

    def validate(self):
        self.validate_required(self.license_no, 'license_no')
        self.validate_required(self.vin, 'vin')
        self.validate_required(self.engine_no, 'engine_no')
        self.validate_required(self.register_date, 'register_date')
        self.validate_required(self.model_code, 'model_code')
        self.validate_required(self.use_nature_code, 'use_nature_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.license_no is not None:
            result['license_no'] = self.license_no
        if self.vin is not None:
            result['vin'] = self.vin
        if self.engine_no is not None:
            result['engine_no'] = self.engine_no
        if self.register_date is not None:
            result['register_date'] = self.register_date
        if self.model_code is not None:
            result['model_code'] = self.model_code
        if self.use_nature_code is not None:
            result['use_nature_code'] = self.use_nature_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('license_no') is not None:
            self.license_no = m.get('license_no')
        if m.get('vin') is not None:
            self.vin = m.get('vin')
        if m.get('engine_no') is not None:
            self.engine_no = m.get('engine_no')
        if m.get('register_date') is not None:
            self.register_date = m.get('register_date')
        if m.get('model_code') is not None:
            self.model_code = m.get('model_code')
        if m.get('use_nature_code') is not None:
            self.use_nature_code = m.get('use_nature_code')
        return self


class EnterpriseBaseInfo(TeaModel):
    def __init__(
        self,
        org_name: str = None,
        credit_code: str = None,
        reg_number: str = None,
        invest_rate: str = None,
        relationship: str = None,
    ):
        # 机构名称
        self.org_name = org_name
        # 统一社会信用代码
        self.credit_code = credit_code
        # 企业公司注册证号
        self.reg_number = reg_number
        # 持股比例
        self.invest_rate = invest_rate
        # 查询人与这家企业的关联
        self.relationship = relationship

    def validate(self):
        self.validate_required(self.org_name, 'org_name')
        self.validate_required(self.credit_code, 'credit_code')
        self.validate_required(self.reg_number, 'reg_number')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.org_name is not None:
            result['org_name'] = self.org_name
        if self.credit_code is not None:
            result['credit_code'] = self.credit_code
        if self.reg_number is not None:
            result['reg_number'] = self.reg_number
        if self.invest_rate is not None:
            result['invest_rate'] = self.invest_rate
        if self.relationship is not None:
            result['relationship'] = self.relationship
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('org_name') is not None:
            self.org_name = m.get('org_name')
        if m.get('credit_code') is not None:
            self.credit_code = m.get('credit_code')
        if m.get('reg_number') is not None:
            self.reg_number = m.get('reg_number')
        if m.get('invest_rate') is not None:
            self.invest_rate = m.get('invest_rate')
        if m.get('relationship') is not None:
            self.relationship = m.get('relationship')
        return self


class DataSource(TeaModel):
    def __init__(
        self,
        id: str = None,
        address: str = None,
    ):
        # 数据源ID
        self.id = id
        # 数据源接口地址
        self.address = address

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.address, 'address')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.address is not None:
            result['address'] = self.address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('address') is not None:
            self.address = m.get('address')
        return self


class DriverLicenseInfo(TeaModel):
    def __init__(
        self,
        gender: str = None,
        issue_date: str = None,
        valid_end_date: str = None,
        valid_start_date: str = None,
        driver_license_status: str = None,
        first_issue_date: str = None,
        allow_drive_car: str = None,
        driver_license_type: str = None,
    ):
        # 性别，字典
        self.gender = gender
        # 驾驶证发证日期,当前日期减去实际日期的天数所在区间
        self.issue_date = issue_date
        # 驾驶证有效终止日期
        self.valid_end_date = valid_end_date
        # 驾驶证有效起始日期
        self.valid_start_date = valid_start_date
        # 驾驶证状态，字典
        self.driver_license_status = driver_license_status
        # 初次领证时间
        self.first_issue_date = first_issue_date
        # 准驾车型，字典
        self.allow_drive_car = allow_drive_car
        # 驾驶证种类，字典
        self.driver_license_type = driver_license_type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.gender is not None:
            result['gender'] = self.gender
        if self.issue_date is not None:
            result['issue_date'] = self.issue_date
        if self.valid_end_date is not None:
            result['valid_end_date'] = self.valid_end_date
        if self.valid_start_date is not None:
            result['valid_start_date'] = self.valid_start_date
        if self.driver_license_status is not None:
            result['driver_license_status'] = self.driver_license_status
        if self.first_issue_date is not None:
            result['first_issue_date'] = self.first_issue_date
        if self.allow_drive_car is not None:
            result['allow_drive_car'] = self.allow_drive_car
        if self.driver_license_type is not None:
            result['driver_license_type'] = self.driver_license_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('gender') is not None:
            self.gender = m.get('gender')
        if m.get('issue_date') is not None:
            self.issue_date = m.get('issue_date')
        if m.get('valid_end_date') is not None:
            self.valid_end_date = m.get('valid_end_date')
        if m.get('valid_start_date') is not None:
            self.valid_start_date = m.get('valid_start_date')
        if m.get('driver_license_status') is not None:
            self.driver_license_status = m.get('driver_license_status')
        if m.get('first_issue_date') is not None:
            self.first_issue_date = m.get('first_issue_date')
        if m.get('allow_drive_car') is not None:
            self.allow_drive_car = m.get('allow_drive_car')
        if m.get('driver_license_type') is not None:
            self.driver_license_type = m.get('driver_license_type')
        return self


class EducationTagInfo(TeaModel):
    def __init__(
        self,
        major: str = None,
        education_level: str = None,
        graduation_date: str = None,
        education_type: str = None,
        admission_date: str = None,
        school_type: str = None,
        education_type_code: str = None,
        school_name: str = None,
    ):
        # 专业名称
        self.major = major
        # 学历等级代码
        self.education_level = education_level
        # 
        # 毕业日期
        self.graduation_date = graduation_date
        # 学习形式
        self.education_type = education_type
        # 入学时间
        self.admission_date = admission_date
        # 学校类型
        self.school_type = school_type
        # 学习形式字典code
        self.education_type_code = education_type_code
        # 学校名称
        self.school_name = school_name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.major is not None:
            result['major'] = self.major
        if self.education_level is not None:
            result['education_level'] = self.education_level
        if self.graduation_date is not None:
            result['graduation_date'] = self.graduation_date
        if self.education_type is not None:
            result['education_type'] = self.education_type
        if self.admission_date is not None:
            result['admission_date'] = self.admission_date
        if self.school_type is not None:
            result['school_type'] = self.school_type
        if self.education_type_code is not None:
            result['education_type_code'] = self.education_type_code
        if self.school_name is not None:
            result['school_name'] = self.school_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('major') is not None:
            self.major = m.get('major')
        if m.get('education_level') is not None:
            self.education_level = m.get('education_level')
        if m.get('graduation_date') is not None:
            self.graduation_date = m.get('graduation_date')
        if m.get('education_type') is not None:
            self.education_type = m.get('education_type')
        if m.get('admission_date') is not None:
            self.admission_date = m.get('admission_date')
        if m.get('school_type') is not None:
            self.school_type = m.get('school_type')
        if m.get('education_type_code') is not None:
            self.education_type_code = m.get('education_type_code')
        if m.get('school_name') is not None:
            self.school_name = m.get('school_name')
        return self


class DetailCarInfo(TeaModel):
    def __init__(
        self,
        license_no: str = None,
        license_type: str = None,
        vin: str = None,
        engine_no: str = None,
        register_date: str = None,
        model_code: str = None,
        use_nature_code: str = None,
        fuel_type: str = None,
        displacement: str = None,
    ):
        # 号牌号码
        self.license_no = license_no
        # 号牌种类，枚举值
        # 
        self.license_type = license_type
        # 车架号
        self.vin = vin
        # 发动机号
        self.engine_no = engine_no
        # 初登日期
        self.register_date = register_date
        # 车辆型号
        self.model_code = model_code
        # 是否营运车辆，枚举值
        self.use_nature_code = use_nature_code
        # 能源种类，枚举值
        self.fuel_type = fuel_type
        # 排量，数字
        self.displacement = displacement

    def validate(self):
        self.validate_required(self.license_no, 'license_no')
        self.validate_required(self.license_type, 'license_type')
        self.validate_required(self.vin, 'vin')
        self.validate_required(self.engine_no, 'engine_no')
        self.validate_required(self.register_date, 'register_date')
        self.validate_required(self.model_code, 'model_code')
        self.validate_required(self.use_nature_code, 'use_nature_code')
        self.validate_required(self.fuel_type, 'fuel_type')
        self.validate_required(self.displacement, 'displacement')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.license_no is not None:
            result['license_no'] = self.license_no
        if self.license_type is not None:
            result['license_type'] = self.license_type
        if self.vin is not None:
            result['vin'] = self.vin
        if self.engine_no is not None:
            result['engine_no'] = self.engine_no
        if self.register_date is not None:
            result['register_date'] = self.register_date
        if self.model_code is not None:
            result['model_code'] = self.model_code
        if self.use_nature_code is not None:
            result['use_nature_code'] = self.use_nature_code
        if self.fuel_type is not None:
            result['fuel_type'] = self.fuel_type
        if self.displacement is not None:
            result['displacement'] = self.displacement
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('license_no') is not None:
            self.license_no = m.get('license_no')
        if m.get('license_type') is not None:
            self.license_type = m.get('license_type')
        if m.get('vin') is not None:
            self.vin = m.get('vin')
        if m.get('engine_no') is not None:
            self.engine_no = m.get('engine_no')
        if m.get('register_date') is not None:
            self.register_date = m.get('register_date')
        if m.get('model_code') is not None:
            self.model_code = m.get('model_code')
        if m.get('use_nature_code') is not None:
            self.use_nature_code = m.get('use_nature_code')
        if m.get('fuel_type') is not None:
            self.fuel_type = m.get('fuel_type')
        if m.get('displacement') is not None:
            self.displacement = m.get('displacement')
        return self


class AuthConfigListResponse(TeaModel):
    def __init__(
        self,
        scene_code: str = None,
        auth_type: str = None,
        source_space_id: str = None,
        auth_enterprise_code: str = None,
        target_name: str = None,
        auth_app_name: str = None,
        auth_content_list: List[AuthContent] = None,
        product_identity_id_list: List[str] = None,
        auth_count: int = None,
        auth_status: bool = None,
        have_agreement: bool = None,
    ):
        # 场景码
        self.scene_code = scene_code
        # 授权类型
        self.auth_type = auth_type
        # 数据源连接器空间id
        self.source_space_id = source_space_id
        # 被授权方企业信用代码
        self.auth_enterprise_code = auth_enterprise_code
        # 接入方企业名称
        self.target_name = target_name
        # 被授权应用名称
        self.auth_app_name = auth_app_name
        # 授权内容列表
        self.auth_content_list = auth_content_list
        # 国标产品标识码列表
        self.product_identity_id_list = product_identity_id_list
        # 授权次数
        self.auth_count = auth_count
        # 授权状态
        self.auth_status = auth_status
        # 是否有协议
        self.have_agreement = have_agreement

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.auth_type, 'auth_type')
        self.validate_required(self.source_space_id, 'source_space_id')
        self.validate_required(self.auth_enterprise_code, 'auth_enterprise_code')
        self.validate_required(self.target_name, 'target_name')
        self.validate_required(self.auth_app_name, 'auth_app_name')
        self.validate_required(self.auth_content_list, 'auth_content_list')
        if self.auth_content_list:
            for k in self.auth_content_list:
                if k:
                    k.validate()
        self.validate_required(self.product_identity_id_list, 'product_identity_id_list')
        self.validate_required(self.auth_count, 'auth_count')
        self.validate_required(self.auth_status, 'auth_status')
        self.validate_required(self.have_agreement, 'have_agreement')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        if self.source_space_id is not None:
            result['source_space_id'] = self.source_space_id
        if self.auth_enterprise_code is not None:
            result['auth_enterprise_code'] = self.auth_enterprise_code
        if self.target_name is not None:
            result['target_name'] = self.target_name
        if self.auth_app_name is not None:
            result['auth_app_name'] = self.auth_app_name
        result['auth_content_list'] = []
        if self.auth_content_list is not None:
            for k in self.auth_content_list:
                result['auth_content_list'].append(k.to_map() if k else None)
        if self.product_identity_id_list is not None:
            result['product_identity_id_list'] = self.product_identity_id_list
        if self.auth_count is not None:
            result['auth_count'] = self.auth_count
        if self.auth_status is not None:
            result['auth_status'] = self.auth_status
        if self.have_agreement is not None:
            result['have_agreement'] = self.have_agreement
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        if m.get('source_space_id') is not None:
            self.source_space_id = m.get('source_space_id')
        if m.get('auth_enterprise_code') is not None:
            self.auth_enterprise_code = m.get('auth_enterprise_code')
        if m.get('target_name') is not None:
            self.target_name = m.get('target_name')
        if m.get('auth_app_name') is not None:
            self.auth_app_name = m.get('auth_app_name')
        self.auth_content_list = []
        if m.get('auth_content_list') is not None:
            for k in m.get('auth_content_list'):
                temp_model = AuthContent()
                self.auth_content_list.append(temp_model.from_map(k))
        if m.get('product_identity_id_list') is not None:
            self.product_identity_id_list = m.get('product_identity_id_list')
        if m.get('auth_count') is not None:
            self.auth_count = m.get('auth_count')
        if m.get('auth_status') is not None:
            self.auth_status = m.get('auth_status')
        if m.get('have_agreement') is not None:
            self.have_agreement = m.get('have_agreement')
        return self


class StringPair(TeaModel):
    def __init__(
        self,
        key: str = None,
        value: str = None,
    ):
        # key
        self.key = key
        # 对应key的具体value
        self.value = value

    def validate(self):
        self.validate_required(self.key, 'key')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.key is not None:
            result['key'] = self.key
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('key') is not None:
            self.key = m.get('key')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class DomesticTmExtensionInfo(TeaModel):
    def __init__(
        self,
        tm_logo_url: str = None,
        goods_info: List[DomesticTmGoodsInfo] = None,
    ):
        # 商标logo URL地址
        self.tm_logo_url = tm_logo_url
        # 商品与服务信息列表
        self.goods_info = goods_info

    def validate(self):
        if self.goods_info:
            for k in self.goods_info:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tm_logo_url is not None:
            result['tm_logo_url'] = self.tm_logo_url
        result['goods_info'] = []
        if self.goods_info is not None:
            for k in self.goods_info:
                result['goods_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tm_logo_url') is not None:
            self.tm_logo_url = m.get('tm_logo_url')
        self.goods_info = []
        if m.get('goods_info') is not None:
            for k in m.get('goods_info'):
                temp_model = DomesticTmGoodsInfo()
                self.goods_info.append(temp_model.from_map(k))
        return self


class AuthRecordListResponse(TeaModel):
    def __init__(
        self,
        request_id: str = None,
        user_did: str = None,
        user_info: str = None,
        auth_content: AuthContent = None,
        auth_result: bool = None,
        request_time: str = None,
        agreement_list: List[Agreement] = None,
    ):
        # 授权请求id
        self.request_id = request_id
        # 授权用户did
        self.user_did = user_did
        # 授权用户信息
        self.user_info = user_info
        # 授权内容
        self.auth_content = auth_content
        # 授权结果
        self.auth_result = auth_result
        # 授权请求时间
        self.request_time = request_time
        # 协议列表
        self.agreement_list = agreement_list

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.user_info, 'user_info')
        self.validate_required(self.auth_content, 'auth_content')
        if self.auth_content:
            self.auth_content.validate()
        self.validate_required(self.auth_result, 'auth_result')
        self.validate_required(self.request_time, 'request_time')
        if self.request_time is not None:
            self.validate_pattern(self.request_time, 'request_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.agreement_list, 'agreement_list')
        if self.agreement_list:
            for k in self.agreement_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.user_info is not None:
            result['user_info'] = self.user_info
        if self.auth_content is not None:
            result['auth_content'] = self.auth_content.to_map()
        if self.auth_result is not None:
            result['auth_result'] = self.auth_result
        if self.request_time is not None:
            result['request_time'] = self.request_time
        result['agreement_list'] = []
        if self.agreement_list is not None:
            for k in self.agreement_list:
                result['agreement_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('user_info') is not None:
            self.user_info = m.get('user_info')
        if m.get('auth_content') is not None:
            temp_model = AuthContent()
            self.auth_content = temp_model.from_map(m['auth_content'])
        if m.get('auth_result') is not None:
            self.auth_result = m.get('auth_result')
        if m.get('request_time') is not None:
            self.request_time = m.get('request_time')
        self.agreement_list = []
        if m.get('agreement_list') is not None:
            for k in m.get('agreement_list'):
                temp_model = Agreement()
                self.agreement_list.append(temp_model.from_map(k))
        return self


class ProductProviderGroup(TeaModel):
    def __init__(
        self,
        product_provider_list: List[ProductProviderInfo] = None,
        product_param: str = None,
        auth_content_code: str = None,
    ):
        # 产品供应商信息
        self.product_provider_list = product_provider_list
        # 数据产品入参,JSON数组
        self.product_param = product_param
        # C端展示授权内容code
        self.auth_content_code = auth_content_code

    def validate(self):
        self.validate_required(self.product_provider_list, 'product_provider_list')
        if self.product_provider_list:
            for k in self.product_provider_list:
                if k:
                    k.validate()
        self.validate_required(self.product_param, 'product_param')
        self.validate_required(self.auth_content_code, 'auth_content_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['product_provider_list'] = []
        if self.product_provider_list is not None:
            for k in self.product_provider_list:
                result['product_provider_list'].append(k.to_map() if k else None)
        if self.product_param is not None:
            result['product_param'] = self.product_param
        if self.auth_content_code is not None:
            result['auth_content_code'] = self.auth_content_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.product_provider_list = []
        if m.get('product_provider_list') is not None:
            for k in m.get('product_provider_list'):
                temp_model = ProductProviderInfo()
                self.product_provider_list.append(temp_model.from_map(k))
        if m.get('product_param') is not None:
            self.product_param = m.get('product_param')
        if m.get('auth_content_code') is not None:
            self.auth_content_code = m.get('auth_content_code')
        return self


class ResumeSkillInfo(TeaModel):
    def __init__(
        self,
        skill_name: str = None,
    ):
        # 技能标签名字
        self.skill_name = skill_name

    def validate(self):
        if self.skill_name is not None:
            self.validate_max_length(self.skill_name, 'skill_name', 128)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.skill_name is not None:
            result['skill_name'] = self.skill_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('skill_name') is not None:
            self.skill_name = m.get('skill_name')
        return self


class BeAuthedPersonInfo(TeaModel):
    def __init__(
        self,
        enterprise_name: str = None,
        enterprise_credit_num: str = None,
        enterprise_legal_person_name: str = None,
        enterprise_legal_person_id: str = None,
    ):
        # 企业名称
        self.enterprise_name = enterprise_name
        # 企业统一社会信用码
        self.enterprise_credit_num = enterprise_credit_num
        # 企业法人姓名
        self.enterprise_legal_person_name = enterprise_legal_person_name
        # 企业法人身份证号
        self.enterprise_legal_person_id = enterprise_legal_person_id

    def validate(self):
        self.validate_required(self.enterprise_name, 'enterprise_name')
        self.validate_required(self.enterprise_credit_num, 'enterprise_credit_num')
        self.validate_required(self.enterprise_legal_person_name, 'enterprise_legal_person_name')
        self.validate_required(self.enterprise_legal_person_id, 'enterprise_legal_person_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.enterprise_name is not None:
            result['enterprise_name'] = self.enterprise_name
        if self.enterprise_credit_num is not None:
            result['enterprise_credit_num'] = self.enterprise_credit_num
        if self.enterprise_legal_person_name is not None:
            result['enterprise_legal_person_name'] = self.enterprise_legal_person_name
        if self.enterprise_legal_person_id is not None:
            result['enterprise_legal_person_id'] = self.enterprise_legal_person_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('enterprise_name') is not None:
            self.enterprise_name = m.get('enterprise_name')
        if m.get('enterprise_credit_num') is not None:
            self.enterprise_credit_num = m.get('enterprise_credit_num')
        if m.get('enterprise_legal_person_name') is not None:
            self.enterprise_legal_person_name = m.get('enterprise_legal_person_name')
        if m.get('enterprise_legal_person_id') is not None:
            self.enterprise_legal_person_id = m.get('enterprise_legal_person_id')
        return self


class AuthPersonIndividualInfo(TeaModel):
    def __init__(
        self,
        individual_name: str = None,
        individual_id: str = None,
        individual_phone_num: int = None,
    ):
        # 姓名
        self.individual_name = individual_name
        # 身份证号
        self.individual_id = individual_id
        # 电话号码
        self.individual_phone_num = individual_phone_num

    def validate(self):
        self.validate_required(self.individual_name, 'individual_name')
        self.validate_required(self.individual_id, 'individual_id')
        self.validate_required(self.individual_phone_num, 'individual_phone_num')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.individual_name is not None:
            result['individual_name'] = self.individual_name
        if self.individual_id is not None:
            result['individual_id'] = self.individual_id
        if self.individual_phone_num is not None:
            result['individual_phone_num'] = self.individual_phone_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('individual_name') is not None:
            self.individual_name = m.get('individual_name')
        if m.get('individual_id') is not None:
            self.individual_id = m.get('individual_id')
        if m.get('individual_phone_num') is not None:
            self.individual_phone_num = m.get('individual_phone_num')
        return self


class DomesticTmInfo(TeaModel):
    def __init__(
        self,
        tm_name: str = None,
        tm_reg_num: str = None,
        int_cls: str = None,
        tm_status: str = None,
        property_bgn_date: str = None,
        reg_date: str = None,
        is_share: bool = None,
        coowner_infos: List[TmCoownerInfo] = None,
        property_end_date: str = None,
        form_type: str = None,
        owner_name_cn: str = None,
        owner_addr_cn: str = None,
        owner_name_en: str = None,
        owner_addr_en: str = None,
        applicant_name_cn: str = None,
        applicant_addr_cn: str = None,
        applicant_name_en: str = None,
        applicant_addr_en: str = None,
        owner_uscc: str = None,
        tid: str = None,
    ):
        # 商标名称
        self.tm_name = tm_name
        # 注册证号
        self.tm_reg_num = tm_reg_num
        # 国际分类
        self.int_cls = int_cls
        # 商标状态
        self.tm_status = tm_status
        # 专用期开始时间
        self.property_bgn_date = property_bgn_date
        # 注册日期
        # 
        self.reg_date = reg_date
        # 是否共有商标
        self.is_share = is_share
        # 商标共有人信息(共有商标才有该数据)
        self.coowner_infos = coowner_infos
        # 专用期结束时间
        self.property_end_date = property_end_date
        # 商标类别
        self.form_type = form_type
        # 权利人中文名称
        self.owner_name_cn = owner_name_cn
        # 权利人中文地址
        self.owner_addr_cn = owner_addr_cn
        # 权利人英文名称
        self.owner_name_en = owner_name_en
        # 权利人英文地址
        self.owner_addr_en = owner_addr_en
        # 申请人中文名称
        self.applicant_name_cn = applicant_name_cn
        # 申请人中文地址
        self.applicant_addr_cn = applicant_addr_cn
        # 申请人外文名称
        self.applicant_name_en = applicant_name_en
        # 申请人英文地址
        self.applicant_addr_en = applicant_addr_en
        # 权利人社会信用统一代码
        self.owner_uscc = owner_uscc
        # 商标唯一标识码
        self.tid = tid

    def validate(self):
        if self.coowner_infos:
            for k in self.coowner_infos:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tm_name is not None:
            result['tm_name'] = self.tm_name
        if self.tm_reg_num is not None:
            result['tm_reg_num'] = self.tm_reg_num
        if self.int_cls is not None:
            result['int_cls'] = self.int_cls
        if self.tm_status is not None:
            result['tm_status'] = self.tm_status
        if self.property_bgn_date is not None:
            result['property_bgn_date'] = self.property_bgn_date
        if self.reg_date is not None:
            result['reg_date'] = self.reg_date
        if self.is_share is not None:
            result['is_share'] = self.is_share
        result['coowner_infos'] = []
        if self.coowner_infos is not None:
            for k in self.coowner_infos:
                result['coowner_infos'].append(k.to_map() if k else None)
        if self.property_end_date is not None:
            result['property_end_date'] = self.property_end_date
        if self.form_type is not None:
            result['form_type'] = self.form_type
        if self.owner_name_cn is not None:
            result['owner_name_cn'] = self.owner_name_cn
        if self.owner_addr_cn is not None:
            result['owner_addr_cn'] = self.owner_addr_cn
        if self.owner_name_en is not None:
            result['owner_name_en'] = self.owner_name_en
        if self.owner_addr_en is not None:
            result['owner_addr_en'] = self.owner_addr_en
        if self.applicant_name_cn is not None:
            result['applicant_name_cn'] = self.applicant_name_cn
        if self.applicant_addr_cn is not None:
            result['applicant_addr_cn'] = self.applicant_addr_cn
        if self.applicant_name_en is not None:
            result['applicant_name_en'] = self.applicant_name_en
        if self.applicant_addr_en is not None:
            result['applicant_addr_en'] = self.applicant_addr_en
        if self.owner_uscc is not None:
            result['owner_uscc'] = self.owner_uscc
        if self.tid is not None:
            result['tid'] = self.tid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tm_name') is not None:
            self.tm_name = m.get('tm_name')
        if m.get('tm_reg_num') is not None:
            self.tm_reg_num = m.get('tm_reg_num')
        if m.get('int_cls') is not None:
            self.int_cls = m.get('int_cls')
        if m.get('tm_status') is not None:
            self.tm_status = m.get('tm_status')
        if m.get('property_bgn_date') is not None:
            self.property_bgn_date = m.get('property_bgn_date')
        if m.get('reg_date') is not None:
            self.reg_date = m.get('reg_date')
        if m.get('is_share') is not None:
            self.is_share = m.get('is_share')
        self.coowner_infos = []
        if m.get('coowner_infos') is not None:
            for k in m.get('coowner_infos'):
                temp_model = TmCoownerInfo()
                self.coowner_infos.append(temp_model.from_map(k))
        if m.get('property_end_date') is not None:
            self.property_end_date = m.get('property_end_date')
        if m.get('form_type') is not None:
            self.form_type = m.get('form_type')
        if m.get('owner_name_cn') is not None:
            self.owner_name_cn = m.get('owner_name_cn')
        if m.get('owner_addr_cn') is not None:
            self.owner_addr_cn = m.get('owner_addr_cn')
        if m.get('owner_name_en') is not None:
            self.owner_name_en = m.get('owner_name_en')
        if m.get('owner_addr_en') is not None:
            self.owner_addr_en = m.get('owner_addr_en')
        if m.get('applicant_name_cn') is not None:
            self.applicant_name_cn = m.get('applicant_name_cn')
        if m.get('applicant_addr_cn') is not None:
            self.applicant_addr_cn = m.get('applicant_addr_cn')
        if m.get('applicant_name_en') is not None:
            self.applicant_name_en = m.get('applicant_name_en')
        if m.get('applicant_addr_en') is not None:
            self.applicant_addr_en = m.get('applicant_addr_en')
        if m.get('owner_uscc') is not None:
            self.owner_uscc = m.get('owner_uscc')
        if m.get('tid') is not None:
            self.tid = m.get('tid')
        return self


class DataSourceInfo(TeaModel):
    def __init__(
        self,
        biz_uuid: str = None,
        name: str = None,
        provider: str = None,
        data_owner_type: str = None,
        data_source_interface_info: DataSourceInterface = None,
    ):
        # 数据源biz_uuid
        self.biz_uuid = biz_uuid
        # 数据源名称
        self.name = name
        # 数据提供方
        self.provider = provider
        # 枚举值：ENTERPRISE、INDIVIDUAL
        self.data_owner_type = data_owner_type
        # 数据源接口信息
        self.data_source_interface_info = data_source_interface_info

    def validate(self):
        self.validate_required(self.biz_uuid, 'biz_uuid')
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 20)
        self.validate_required(self.provider, 'provider')
        if self.provider is not None:
            self.validate_max_length(self.provider, 'provider', 30)
        self.validate_required(self.data_owner_type, 'data_owner_type')
        self.validate_required(self.data_source_interface_info, 'data_source_interface_info')
        if self.data_source_interface_info:
            self.data_source_interface_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_uuid is not None:
            result['biz_uuid'] = self.biz_uuid
        if self.name is not None:
            result['name'] = self.name
        if self.provider is not None:
            result['provider'] = self.provider
        if self.data_owner_type is not None:
            result['data_owner_type'] = self.data_owner_type
        if self.data_source_interface_info is not None:
            result['data_source_interface_info'] = self.data_source_interface_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_uuid') is not None:
            self.biz_uuid = m.get('biz_uuid')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('provider') is not None:
            self.provider = m.get('provider')
        if m.get('data_owner_type') is not None:
            self.data_owner_type = m.get('data_owner_type')
        if m.get('data_source_interface_info') is not None:
            temp_model = DataSourceInterface()
            self.data_source_interface_info = temp_model.from_map(m['data_source_interface_info'])
        return self


class EnterpriseCaseInfo(TeaModel):
    def __init__(
        self,
        case_info: str = None,
        case_code: str = None,
        case_create_time: str = None,
        case_status: str = None,
        publish_status: str = None,
        exec_name: str = None,
        exec_court_name: str = None,
        exec_money: str = None,
        gist_id: str = None,
        case_type: str = None,
        create_time: str = None,
    ):
        # 立案信息
        self.case_info = case_info
        # 案件号
        self.case_code = case_code
        # 立案时间
        self.case_create_time = case_create_time
        # 案件状态
        self.case_status = case_status
        # 公示状态
        self.publish_status = publish_status
        # 被执行人姓名
        self.exec_name = exec_name
        # 执行法院
        self.exec_court_name = exec_court_name
        # 执行标的(元)
        self.exec_money = exec_money
        # 关联裁判文书
        self.gist_id = gist_id
        # 案由
        self.case_type = case_type
        # 创建时间
        self.create_time = create_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.case_info is not None:
            result['case_info'] = self.case_info
        if self.case_code is not None:
            result['case_code'] = self.case_code
        if self.case_create_time is not None:
            result['case_create_time'] = self.case_create_time
        if self.case_status is not None:
            result['case_status'] = self.case_status
        if self.publish_status is not None:
            result['publish_status'] = self.publish_status
        if self.exec_name is not None:
            result['exec_name'] = self.exec_name
        if self.exec_court_name is not None:
            result['exec_court_name'] = self.exec_court_name
        if self.exec_money is not None:
            result['exec_money'] = self.exec_money
        if self.gist_id is not None:
            result['gist_id'] = self.gist_id
        if self.case_type is not None:
            result['case_type'] = self.case_type
        if self.create_time is not None:
            result['create_time'] = self.create_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('case_info') is not None:
            self.case_info = m.get('case_info')
        if m.get('case_code') is not None:
            self.case_code = m.get('case_code')
        if m.get('case_create_time') is not None:
            self.case_create_time = m.get('case_create_time')
        if m.get('case_status') is not None:
            self.case_status = m.get('case_status')
        if m.get('publish_status') is not None:
            self.publish_status = m.get('publish_status')
        if m.get('exec_name') is not None:
            self.exec_name = m.get('exec_name')
        if m.get('exec_court_name') is not None:
            self.exec_court_name = m.get('exec_court_name')
        if m.get('exec_money') is not None:
            self.exec_money = m.get('exec_money')
        if m.get('gist_id') is not None:
            self.gist_id = m.get('gist_id')
        if m.get('case_type') is not None:
            self.case_type = m.get('case_type')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        return self


class AuthProductGroup(TeaModel):
    def __init__(
        self,
        product_code_list: List[str] = None,
        product_param: str = None,
        auth_content_code: str = None,
    ):
        # 产品code列表
        self.product_code_list = product_code_list
        # 数据产品入参,JSON数组
        self.product_param = product_param
        # C端展示授权内容code
        self.auth_content_code = auth_content_code

    def validate(self):
        self.validate_required(self.product_code_list, 'product_code_list')
        self.validate_required(self.product_param, 'product_param')
        self.validate_required(self.auth_content_code, 'auth_content_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_code_list is not None:
            result['product_code_list'] = self.product_code_list
        if self.product_param is not None:
            result['product_param'] = self.product_param
        if self.auth_content_code is not None:
            result['auth_content_code'] = self.auth_content_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_code_list') is not None:
            self.product_code_list = m.get('product_code_list')
        if m.get('product_param') is not None:
            self.product_param = m.get('product_param')
        if m.get('auth_content_code') is not None:
            self.auth_content_code = m.get('auth_content_code')
        return self


class EducationStatus(TeaModel):
    def __init__(
        self,
        project_211: bool = None,
        project_985: bool = None,
        double_first_class: bool = None,
        admission_date: str = None,
        educational_system: str = None,
        registered_student_status: bool = None,
    ):
        # 是否211院校
        self.project_211 = project_211
        # 是否985院校
        self.project_985 = project_985
        # boolean	是否双一流院校
        self.double_first_class = double_first_class
        # 入学时间
        self.admission_date = admission_date
        # 学制，字典
        self.educational_system = educational_system
        # boolean	是否注册学籍
        self.registered_student_status = registered_student_status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_211 is not None:
            result['project211'] = self.project_211
        if self.project_985 is not None:
            result['project985'] = self.project_985
        if self.double_first_class is not None:
            result['double_first_class'] = self.double_first_class
        if self.admission_date is not None:
            result['admission_date'] = self.admission_date
        if self.educational_system is not None:
            result['educational_system'] = self.educational_system
        if self.registered_student_status is not None:
            result['registered_student_status'] = self.registered_student_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project211') is not None:
            self.project_211 = m.get('project211')
        if m.get('project985') is not None:
            self.project_985 = m.get('project985')
        if m.get('double_first_class') is not None:
            self.double_first_class = m.get('double_first_class')
        if m.get('admission_date') is not None:
            self.admission_date = m.get('admission_date')
        if m.get('educational_system') is not None:
            self.educational_system = m.get('educational_system')
        if m.get('registered_student_status') is not None:
            self.registered_student_status = m.get('registered_student_status')
        return self


class CertificatesInfo(TeaModel):
    def __init__(
        self,
        certificate_name: str = None,
    ):
        # 证书名称
        self.certificate_name = certificate_name

    def validate(self):
        if self.certificate_name is not None:
            self.validate_max_length(self.certificate_name, 'certificate_name', 128)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.certificate_name is not None:
            result['certificate_name'] = self.certificate_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('certificate_name') is not None:
            self.certificate_name = m.get('certificate_name')
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


class UploadApplicationBatchqueryfileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_md_5: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        data_set_id: str = None,
        unique_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件md5
        self.file_md_5 = file_md_5
        # 文件id
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 数据集id，开发者提供
        self.data_set_id = data_set_id
        # 幂等id，同一批任务需使用相同的uniqueId，文件不一样但uniqueId一样，只会有一个任务，任务信息以第一次请求为准
        self.unique_id = unique_id

    def validate(self):
        self.validate_required(self.file_md_5, 'file_md_5')
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.data_set_id, 'data_set_id')
        self.validate_required(self.unique_id, 'unique_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_md_5 is not None:
            result['file_md5'] = self.file_md_5
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.unique_id is not None:
            result['unique_id'] = self.unique_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_md5') is not None:
            self.file_md_5 = m.get('file_md5')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('unique_id') is not None:
            self.unique_id = m.get('unique_id')
        return self


class UploadApplicationBatchqueryfileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        query_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 离线任务查询id，批量任务结束后可通过该字段查询结果
        # 
        self.query_id = query_id

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
        if self.query_id is not None:
            result['query_id'] = self.query_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('query_id') is not None:
            self.query_id = m.get('query_id')
        return self


class QueryApplicationBatchqueryresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        query_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 上传待查询数据集文件后得到的查询id，在此接口进行结果查询
        # 
        self.query_id = query_id

    def validate(self):
        self.validate_required(self.query_id, 'query_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.query_id is not None:
            result['query_id'] = self.query_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('query_id') is not None:
            self.query_id = m.get('query_id')
        return self


class QueryApplicationBatchqueryresultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        file_path: str = None,
        message: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果文件临时链接
        # 
        self.file_path = file_path
        # 描述结果文件完成进度：
        # 如：
        # 余额不足，部分内容查询完成
        self.message = message

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
        if self.file_path is not None:
            result['file_path'] = self.file_path
        if self.message is not None:
            result['message'] = self.message
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('file_path') is not None:
            self.file_path = m.get('file_path')
        if m.get('message') is not None:
            self.message = m.get('message')
        return self


class QueryApplicationDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_set_id: str = None,
        index: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据集id，开发者提供
        self.data_set_id = data_set_id
        # 查询数据参数，json串
        self.index = index

    def validate(self):
        self.validate_required(self.data_set_id, 'data_set_id')
        self.validate_required(self.index, 'index')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.index is not None:
            result['index'] = self.index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('index') is not None:
            self.index = m.get('index')
        return self


class QueryApplicationDataResponse(TeaModel):
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
        # 查询结果
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


class QueryApplicationIpeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_set_id: str = None,
        index: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据集id，开发者提供
        self.data_set_id = data_set_id
        # 企业信息
        self.index = index

    def validate(self):
        self.validate_required(self.data_set_id, 'data_set_id')
        self.validate_required(self.index, 'index')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.index is not None:
            result['index'] = self.index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('index') is not None:
            self.index = m.get('index')
        return self


class QueryApplicationIpeResponse(TeaModel):
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
        # 查询结果
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


class QueryDomesticTrademarkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tm_name: str = None,
        tm_reg_num: str = None,
        tm_owner_name: str = None,
        tm_owner_uscc: str = None,
        data_set_id: str = None,
        page_size: int = None,
        page_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 商标名称
        self.tm_name = tm_name
        # 商标注册证号
        self.tm_reg_num = tm_reg_num
        # 商标所有人名称
        self.tm_owner_name = tm_owner_name
        # 商标所有人社会信用统一代码
        self.tm_owner_uscc = tm_owner_uscc
        # 数据集ID
        self.data_set_id = data_set_id
        # 每页的数量
        self.page_size = page_size
        # 当前页码，从0开始。
        self.page_num = page_num

    def validate(self):
        self.validate_required(self.data_set_id, 'data_set_id')
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.page_num, 'page_num')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tm_name is not None:
            result['tm_name'] = self.tm_name
        if self.tm_reg_num is not None:
            result['tm_reg_num'] = self.tm_reg_num
        if self.tm_owner_name is not None:
            result['tm_owner_name'] = self.tm_owner_name
        if self.tm_owner_uscc is not None:
            result['tm_owner_uscc'] = self.tm_owner_uscc
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_num is not None:
            result['page_num'] = self.page_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tm_name') is not None:
            self.tm_name = m.get('tm_name')
        if m.get('tm_reg_num') is not None:
            self.tm_reg_num = m.get('tm_reg_num')
        if m.get('tm_owner_name') is not None:
            self.tm_owner_name = m.get('tm_owner_name')
        if m.get('tm_owner_uscc') is not None:
            self.tm_owner_uscc = m.get('tm_owner_uscc')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        return self


class QueryDomesticTrademarkResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tm_infos: List[DomesticTmInfo] = None,
        tm_total: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商标信息列表
        self.tm_infos = tm_infos
        # 商标总数
        self.tm_total = tm_total

    def validate(self):
        if self.tm_infos:
            for k in self.tm_infos:
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
        result['tm_infos'] = []
        if self.tm_infos is not None:
            for k in self.tm_infos:
                result['tm_infos'].append(k.to_map() if k else None)
        if self.tm_total is not None:
            result['tm_total'] = self.tm_total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.tm_infos = []
        if m.get('tm_infos') is not None:
            for k in m.get('tm_infos'):
                temp_model = DomesticTmInfo()
                self.tm_infos.append(temp_model.from_map(k))
        if m.get('tm_total') is not None:
            self.tm_total = m.get('tm_total')
        return self


class GetDomesticTrademarklogoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_set_id: str = None,
        tm_reg_num: str = None,
        tm_form_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据集ID
        self.data_set_id = data_set_id
        # 商标注册证号
        self.tm_reg_num = tm_reg_num
        # 商标类别
        self.tm_form_type = tm_form_type

    def validate(self):
        self.validate_required(self.data_set_id, 'data_set_id')
        self.validate_required(self.tm_reg_num, 'tm_reg_num')
        self.validate_required(self.tm_form_type, 'tm_form_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.tm_reg_num is not None:
            result['tm_reg_num'] = self.tm_reg_num
        if self.tm_form_type is not None:
            result['tm_form_type'] = self.tm_form_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('tm_reg_num') is not None:
            self.tm_reg_num = m.get('tm_reg_num')
        if m.get('tm_form_type') is not None:
            self.tm_form_type = m.get('tm_form_type')
        return self


class GetDomesticTrademarklogoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tm_logo_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商标logo下载地址
        self.tm_logo_url = tm_logo_url

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
        if self.tm_logo_url is not None:
            result['tm_logo_url'] = self.tm_logo_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tm_logo_url') is not None:
            self.tm_logo_url = m.get('tm_logo_url')
        return self


class QueryEncryptEnterpriseinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_set_id: str = None,
        encrypt_parameters: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据集ID
        self.data_set_id = data_set_id
        # 加密的查询参数
        self.encrypt_parameters = encrypt_parameters

    def validate(self):
        self.validate_required(self.data_set_id, 'data_set_id')
        self.validate_required(self.encrypt_parameters, 'encrypt_parameters')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.encrypt_parameters is not None:
            result['encrypt_parameters'] = self.encrypt_parameters
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('encrypt_parameters') is not None:
            self.encrypt_parameters = m.get('encrypt_parameters')
        return self


class QueryEncryptEnterpriseinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        encrypt_data: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 加密的企业工商信息
        self.encrypt_data = encrypt_data

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
        if self.encrypt_data is not None:
            result['encrypt_data'] = self.encrypt_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('encrypt_data') is not None:
            self.encrypt_data = m.get('encrypt_data')
        return self


class UploadApplicationAuthfileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_set_id: str = None,
        file_md_5: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        file_name: str = None,
        file_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据集id，开发者提供
        # 
        self.data_set_id = data_set_id
        # 文件md5
        self.file_md_5 = file_md_5
        # 文件id
        # 
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 协议名称
        self.file_name = file_name
        # 授权协议文件版本号
        self.file_version = file_version

    def validate(self):
        self.validate_required(self.data_set_id, 'data_set_id')
        self.validate_required(self.file_md_5, 'file_md_5')
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_version, 'file_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.file_md_5 is not None:
            result['file_md5'] = self.file_md_5
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_version is not None:
            result['file_version'] = self.file_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('file_md5') is not None:
            self.file_md_5 = m.get('file_md5')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_version') is not None:
            self.file_version = m.get('file_version')
        return self


class UploadApplicationAuthfileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        file_index: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权协议索引号
        self.file_index = file_index

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
        if self.file_index is not None:
            result['file_index'] = self.file_index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('file_index') is not None:
            self.file_index = m.get('file_index')
        return self


class CheckApplicationHascarRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_set_id: str = None,
        user_authed: bool = None,
        file_index: str = None,
        user_name: str = None,
        user_cert_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据集id，开发者提供
        # 
        self.data_set_id = data_set_id
        # 是否授权
        self.user_authed = user_authed
        # 授权协议索引
        self.file_index = file_index
        # 用户名称
        self.user_name = user_name
        # 待核验车主身份证号
        self.user_cert_no = user_cert_no

    def validate(self):
        self.validate_required(self.data_set_id, 'data_set_id')
        self.validate_required(self.user_authed, 'user_authed')
        self.validate_required(self.file_index, 'file_index')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.user_cert_no, 'user_cert_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.user_authed is not None:
            result['user_authed'] = self.user_authed
        if self.file_index is not None:
            result['file_index'] = self.file_index
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_cert_no is not None:
            result['user_cert_no'] = self.user_cert_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('user_authed') is not None:
            self.user_authed = m.get('user_authed')
        if m.get('file_index') is not None:
            self.file_index = m.get('file_index')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_cert_no') is not None:
            self.user_cert_no = m.get('user_cert_no')
        return self


class CheckApplicationHascarResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        has_car: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否有车，true：有车；false：无车
        self.has_car = has_car

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
        if self.has_car is not None:
            result['has_car'] = self.has_car
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('has_car') is not None:
            self.has_car = m.get('has_car')
        return self


class QueryApplicationBasecarinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_set_id: str = None,
        user_authed: bool = None,
        file_index: str = None,
        user_name: str = None,
        user_cert_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据集id，开发者提供
        self.data_set_id = data_set_id
        # 是否授权
        # 
        self.user_authed = user_authed
        # 授权协议索引
        # 
        self.file_index = file_index
        # 待核验车主姓名
        self.user_name = user_name
        # 待核验车主身份证号
        self.user_cert_no = user_cert_no

    def validate(self):
        self.validate_required(self.data_set_id, 'data_set_id')
        self.validate_required(self.user_authed, 'user_authed')
        self.validate_required(self.file_index, 'file_index')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.user_cert_no, 'user_cert_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.user_authed is not None:
            result['user_authed'] = self.user_authed
        if self.file_index is not None:
            result['file_index'] = self.file_index
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_cert_no is not None:
            result['user_cert_no'] = self.user_cert_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('user_authed') is not None:
            self.user_authed = m.get('user_authed')
        if m.get('file_index') is not None:
            self.file_index = m.get('file_index')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_cert_no') is not None:
            self.user_cert_no = m.get('user_cert_no')
        return self


class QueryApplicationBasecarinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[BasicCarInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 车辆信息
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = BasicCarInfo()
                self.data.append(temp_model.from_map(k))
        return self


class QueryApplicationDetailcarinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_set_id: str = None,
        user_authed: bool = None,
        file_index: str = None,
        user_name: str = None,
        user_cert_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据集id，开发者提供
        # 
        self.data_set_id = data_set_id
        # 是否授权
        # 
        self.user_authed = user_authed
        # 授权协议索引
        # 
        self.file_index = file_index
        # 待核验车主姓名
        # 
        self.user_name = user_name
        # 待核验车主身份证号
        # 
        self.user_cert_no = user_cert_no

    def validate(self):
        self.validate_required(self.data_set_id, 'data_set_id')
        self.validate_required(self.user_authed, 'user_authed')
        self.validate_required(self.file_index, 'file_index')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.user_cert_no, 'user_cert_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.user_authed is not None:
            result['user_authed'] = self.user_authed
        if self.file_index is not None:
            result['file_index'] = self.file_index
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_cert_no is not None:
            result['user_cert_no'] = self.user_cert_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('user_authed') is not None:
            self.user_authed = m.get('user_authed')
        if m.get('file_index') is not None:
            self.file_index = m.get('file_index')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_cert_no') is not None:
            self.user_cert_no = m.get('user_cert_no')
        return self


class QueryApplicationDetailcarinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[DetailCarInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 车辆详细信息
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = DetailCarInfo()
                self.data.append(temp_model.from_map(k))
        return self


class SignApplicationResumeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_set_id: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据源id
        self.data_set_id = data_set_id
        # 用户唯一id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.data_set_id, 'data_set_id')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class SignApplicationResumeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        auth_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户授权支付宝链接
        self.auth_url = auth_url

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
        if self.auth_url is not None:
            result['auth_url'] = self.auth_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('auth_url') is not None:
            self.auth_url = m.get('auth_url')
        return self


class QueryApplicationResumeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_set_id: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据源id，开发者提供
        self.data_set_id = data_set_id
        # 用户唯一id
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.data_set_id, 'data_set_id')
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class QueryApplicationResumeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user_name: str = None,
        gender: str = None,
        birthday: str = None,
        phone: str = None,
        head_pic_url: str = None,
        skills: List[ResumeSkillInfo] = None,
        certificates: List[CertificatesInfo] = None,
        work_experiences: List[WorkExperiencesInfo] = None,
        education_experiences: List[EducationExperiencesInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 姓名
        self.user_name = user_name
        # 性别
        self.gender = gender
        # 生日
        self.birthday = birthday
        # 手机号
        self.phone = phone
        # 头像图片url
        self.head_pic_url = head_pic_url
        # 简历技能
        self.skills = skills
        # 证书信息
        self.certificates = certificates
        # 工作经历
        self.work_experiences = work_experiences
        # 教育经历
        self.education_experiences = education_experiences

    def validate(self):
        if self.skills:
            for k in self.skills:
                if k:
                    k.validate()
        if self.certificates:
            for k in self.certificates:
                if k:
                    k.validate()
        if self.work_experiences:
            for k in self.work_experiences:
                if k:
                    k.validate()
        if self.education_experiences:
            for k in self.education_experiences:
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
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.gender is not None:
            result['gender'] = self.gender
        if self.birthday is not None:
            result['birthday'] = self.birthday
        if self.phone is not None:
            result['phone'] = self.phone
        if self.head_pic_url is not None:
            result['head_pic_url'] = self.head_pic_url
        result['skills'] = []
        if self.skills is not None:
            for k in self.skills:
                result['skills'].append(k.to_map() if k else None)
        result['certificates'] = []
        if self.certificates is not None:
            for k in self.certificates:
                result['certificates'].append(k.to_map() if k else None)
        result['work_experiences'] = []
        if self.work_experiences is not None:
            for k in self.work_experiences:
                result['work_experiences'].append(k.to_map() if k else None)
        result['education_experiences'] = []
        if self.education_experiences is not None:
            for k in self.education_experiences:
                result['education_experiences'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('gender') is not None:
            self.gender = m.get('gender')
        if m.get('birthday') is not None:
            self.birthday = m.get('birthday')
        if m.get('phone') is not None:
            self.phone = m.get('phone')
        if m.get('head_pic_url') is not None:
            self.head_pic_url = m.get('head_pic_url')
        self.skills = []
        if m.get('skills') is not None:
            for k in m.get('skills'):
                temp_model = ResumeSkillInfo()
                self.skills.append(temp_model.from_map(k))
        self.certificates = []
        if m.get('certificates') is not None:
            for k in m.get('certificates'):
                temp_model = CertificatesInfo()
                self.certificates.append(temp_model.from_map(k))
        self.work_experiences = []
        if m.get('work_experiences') is not None:
            for k in m.get('work_experiences'):
                temp_model = WorkExperiencesInfo()
                self.work_experiences.append(temp_model.from_map(k))
        self.education_experiences = []
        if m.get('education_experiences') is not None:
            for k in m.get('education_experiences'):
                temp_model = EducationExperiencesInfo()
                self.education_experiences.append(temp_model.from_map(k))
        return self


class QueryDetailcarinfoPesonandlicRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_set_id: str = None,
        user_authed: bool = None,
        file_index: str = None,
        user_name: str = None,
        user_cert_no: str = None,
        license_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据集id，开发者提供
        # 
        self.data_set_id = data_set_id
        # 是否授权
        # 
        self.user_authed = user_authed
        # 授权协议索引
        # 
        self.file_index = file_index
        # 待核验车主姓名
        # 
        self.user_name = user_name
        # 待核验车主身份证号
        # 
        self.user_cert_no = user_cert_no
        # 号牌号码
        self.license_no = license_no

    def validate(self):
        self.validate_required(self.data_set_id, 'data_set_id')
        self.validate_required(self.user_authed, 'user_authed')
        self.validate_required(self.file_index, 'file_index')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.license_no, 'license_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.user_authed is not None:
            result['user_authed'] = self.user_authed
        if self.file_index is not None:
            result['file_index'] = self.file_index
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_cert_no is not None:
            result['user_cert_no'] = self.user_cert_no
        if self.license_no is not None:
            result['license_no'] = self.license_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('user_authed') is not None:
            self.user_authed = m.get('user_authed')
        if m.get('file_index') is not None:
            self.file_index = m.get('file_index')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_cert_no') is not None:
            self.user_cert_no = m.get('user_cert_no')
        if m.get('license_no') is not None:
            self.license_no = m.get('license_no')
        return self


class QueryDetailcarinfoPesonandlicResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: DetailCarInfo = None,
        owner: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 车辆详细信息
        self.data = data
        # 是否是该人名下的车，true表示是，false表示否
        self.owner = owner

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
        if self.data is not None:
            result['data'] = self.data.to_map()
        if self.owner is not None:
            result['owner'] = self.owner
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
            temp_model = DetailCarInfo()
            self.data = temp_model.from_map(m['data'])
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        return self


class QueryIdnumberEducationtaginfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_set_id: str = None,
        user_authed: bool = None,
        file_index: str = None,
        user_name: str = None,
        user_cert_no: str = None,
        user_tel: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据源id
        self.data_set_id = data_set_id
        # 用户是否已授权
        self.user_authed = user_authed
        # 该接口对应的授权协议索引号
        self.file_index = file_index
        # 用户姓名
        self.user_name = user_name
        # 用户身份证号
        self.user_cert_no = user_cert_no
        # 用户手机号
        self.user_tel = user_tel

    def validate(self):
        self.validate_required(self.data_set_id, 'data_set_id')
        self.validate_required(self.user_authed, 'user_authed')
        self.validate_required(self.file_index, 'file_index')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.user_cert_no, 'user_cert_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.user_authed is not None:
            result['user_authed'] = self.user_authed
        if self.file_index is not None:
            result['file_index'] = self.file_index
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_cert_no is not None:
            result['user_cert_no'] = self.user_cert_no
        if self.user_tel is not None:
            result['user_tel'] = self.user_tel
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('user_authed') is not None:
            self.user_authed = m.get('user_authed')
        if m.get('file_index') is not None:
            self.file_index = m.get('file_index')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_cert_no') is not None:
            self.user_cert_no = m.get('user_cert_no')
        if m.get('user_tel') is not None:
            self.user_tel = m.get('user_tel')
        return self


class QueryIdnumberEducationtaginfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: EducationTagInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 教育信息
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
        if m.get('data') is not None:
            temp_model = EducationTagInfo()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryPhonenumberEducationinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_set_id: str = None,
        user_authed: bool = None,
        file_index: str = None,
        user_name: str = None,
        user_tel: str = None,
        user_cert_no: str = None,
        type_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据源id
        self.data_set_id = data_set_id
        # 用户是否已授权
        self.user_authed = user_authed
        # 该接口对应的授权协议索引号
        self.file_index = file_index
        # 用户姓名
        self.user_name = user_name
        # 用户手机号
        self.user_tel = user_tel
        # 身份证号
        self.user_cert_no = user_cert_no
        # 类型指示码
        self.type_code = type_code

    def validate(self):
        self.validate_required(self.data_set_id, 'data_set_id')
        self.validate_required(self.user_authed, 'user_authed')
        self.validate_required(self.file_index, 'file_index')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.type_code, 'type_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.user_authed is not None:
            result['user_authed'] = self.user_authed
        if self.file_index is not None:
            result['file_index'] = self.file_index
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_tel is not None:
            result['user_tel'] = self.user_tel
        if self.user_cert_no is not None:
            result['user_cert_no'] = self.user_cert_no
        if self.type_code is not None:
            result['type_code'] = self.type_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('user_authed') is not None:
            self.user_authed = m.get('user_authed')
        if m.get('file_index') is not None:
            self.file_index = m.get('file_index')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_tel') is not None:
            self.user_tel = m.get('user_tel')
        if m.get('user_cert_no') is not None:
            self.user_cert_no = m.get('user_cert_no')
        if m.get('type_code') is not None:
            self.type_code = m.get('type_code')
        return self


class QueryPhonenumberEducationinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: EducationTagInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 教育信息
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
        if m.get('data') is not None:
            temp_model = EducationTagInfo()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryApplicationUnifiedentranceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_index: str = None,
        params: str = None,
        user_authed: bool = None,
        data_set_id: str = None,
        token: str = None,
        scene_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权协议索引
        self.file_index = file_index
        # 整个需求的入参，map json
        self.params = params
        # 是否授权
        self.user_authed = user_authed
        # 数据集服务id
        self.data_set_id = data_set_id
        # 授权token
        self.token = token
        # token授权场景码
        self.scene_code = scene_code

    def validate(self):
        self.validate_required(self.params, 'params')
        self.validate_required(self.data_set_id, 'data_set_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_index is not None:
            result['file_index'] = self.file_index
        if self.params is not None:
            result['params'] = self.params
        if self.user_authed is not None:
            result['user_authed'] = self.user_authed
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.token is not None:
            result['token'] = self.token
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_index') is not None:
            self.file_index = m.get('file_index')
        if m.get('params') is not None:
            self.params = m.get('params')
        if m.get('user_authed') is not None:
            self.user_authed = m.get('user_authed')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        return self


class QueryApplicationUnifiedentranceResponse(TeaModel):
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
        # 具体返回，map json
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


class QueryApplicationDriverlicensecertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_set_id: str = None,
        user_authed: bool = None,
        file_index: str = None,
        user_cert_no: str = None,
        user_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据集id，开发者提供
        self.data_set_id = data_set_id
        # 是否授权
        self.user_authed = user_authed
        # 授权协议索引
        self.file_index = file_index
        # 身份证号
        self.user_cert_no = user_cert_no
        # 姓名
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.data_set_id, 'data_set_id')
        self.validate_required(self.user_authed, 'user_authed')
        self.validate_required(self.file_index, 'file_index')
        self.validate_required(self.user_cert_no, 'user_cert_no')
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
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.user_authed is not None:
            result['user_authed'] = self.user_authed
        if self.file_index is not None:
            result['file_index'] = self.file_index
        if self.user_cert_no is not None:
            result['user_cert_no'] = self.user_cert_no
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('user_authed') is not None:
            self.user_authed = m.get('user_authed')
        if m.get('file_index') is not None:
            self.file_index = m.get('file_index')
        if m.get('user_cert_no') is not None:
            self.user_cert_no = m.get('user_cert_no')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        return self


class QueryApplicationDriverlicensecertResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        driver_license_info: DriverLicenseInfo = None,
        cert_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 驾驶证信息
        self.driver_license_info = driver_license_info
        # 身份证与姓名是否一致，字典
        self.cert_result = cert_result

    def validate(self):
        if self.driver_license_info:
            self.driver_license_info.validate()

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
        if self.driver_license_info is not None:
            result['driver_license_info'] = self.driver_license_info.to_map()
        if self.cert_result is not None:
            result['cert_result'] = self.cert_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('driver_license_info') is not None:
            temp_model = DriverLicenseInfo()
            self.driver_license_info = temp_model.from_map(m['driver_license_info'])
        if m.get('cert_result') is not None:
            self.cert_result = m.get('cert_result')
        return self


class QueryApplicationVehiclelicensecertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_set_id: str = None,
        user_authed: bool = None,
        file_index: str = None,
        plate_number: str = None,
        plate_type: str = None,
        owner: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据集id，开发者提供
        self.data_set_id = data_set_id
        # 是否授权
        self.user_authed = user_authed
        # 授权协议索引
        self.file_index = file_index
        # 车牌号
        self.plate_number = plate_number
        # 号牌种类，枚举
        self.plate_type = plate_type
        # 所有人姓名
        self.owner = owner

    def validate(self):
        self.validate_required(self.data_set_id, 'data_set_id')
        self.validate_required(self.user_authed, 'user_authed')
        self.validate_required(self.file_index, 'file_index')
        self.validate_required(self.plate_number, 'plate_number')
        self.validate_required(self.plate_type, 'plate_type')
        self.validate_required(self.owner, 'owner')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.user_authed is not None:
            result['user_authed'] = self.user_authed
        if self.file_index is not None:
            result['file_index'] = self.file_index
        if self.plate_number is not None:
            result['plate_number'] = self.plate_number
        if self.plate_type is not None:
            result['plate_type'] = self.plate_type
        if self.owner is not None:
            result['owner'] = self.owner
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('user_authed') is not None:
            self.user_authed = m.get('user_authed')
        if m.get('file_index') is not None:
            self.file_index = m.get('file_index')
        if m.get('plate_number') is not None:
            self.plate_number = m.get('plate_number')
        if m.get('plate_type') is not None:
            self.plate_type = m.get('plate_type')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        return self


class QueryApplicationVehiclelicensecertResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        vehicle_license_info: VehicleLicenseInfo = None,
        vehicle_license_cert_result: VehicleLicenseCertResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 行驶证信息
        self.vehicle_license_info = vehicle_license_info
        # 行驶证核验结果
        self.vehicle_license_cert_result = vehicle_license_cert_result

    def validate(self):
        if self.vehicle_license_info:
            self.vehicle_license_info.validate()
        if self.vehicle_license_cert_result:
            self.vehicle_license_cert_result.validate()

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
        if self.vehicle_license_info is not None:
            result['vehicle_license_info'] = self.vehicle_license_info.to_map()
        if self.vehicle_license_cert_result is not None:
            result['vehicle_license_cert_result'] = self.vehicle_license_cert_result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('vehicle_license_info') is not None:
            temp_model = VehicleLicenseInfo()
            self.vehicle_license_info = temp_model.from_map(m['vehicle_license_info'])
        if m.get('vehicle_license_cert_result') is not None:
            temp_model = VehicleLicenseCertResult()
            self.vehicle_license_cert_result = temp_model.from_map(m['vehicle_license_cert_result'])
        return self


class QueryApplicationEducationstatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_set_id: str = None,
        user_authed: bool = None,
        file_index: str = None,
        user_name: str = None,
        user_cert_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 需求ID
        self.data_set_id = data_set_id
        # 用户是否已经授权
        self.user_authed = user_authed
        # 授权文件索引
        self.file_index = file_index
        # 姓名
        self.user_name = user_name
        # 身份证号
        self.user_cert_no = user_cert_no

    def validate(self):
        self.validate_required(self.data_set_id, 'data_set_id')
        self.validate_required(self.user_authed, 'user_authed')
        self.validate_required(self.file_index, 'file_index')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.user_cert_no, 'user_cert_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.user_authed is not None:
            result['user_authed'] = self.user_authed
        if self.file_index is not None:
            result['file_index'] = self.file_index
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_cert_no is not None:
            result['user_cert_no'] = self.user_cert_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('user_authed') is not None:
            self.user_authed = m.get('user_authed')
        if m.get('file_index') is not None:
            self.file_index = m.get('file_index')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_cert_no') is not None:
            self.user_cert_no = m.get('user_cert_no')
        return self


class QueryApplicationEducationstatusResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[EducationStatus] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 学籍信息
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = EducationStatus()
                self.data.append(temp_model.from_map(k))
        return self


class UploadServiceAuthfileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        file_md_5: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        file_name: str = None,
        file_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待获取数据类型的服务id
        self.service_id = service_id
        # 文件md5
        self.file_md_5 = file_md_5
        # 文件id
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 协议名称
        self.file_name = file_name
        # 授权协议文件版本号
        self.file_version = file_version

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.file_md_5, 'file_md_5')
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_version, 'file_version')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.file_md_5 is not None:
            result['file_md5'] = self.file_md_5
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_version is not None:
            result['file_version'] = self.file_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('file_md5') is not None:
            self.file_md_5 = m.get('file_md5')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_version') is not None:
            self.file_version = m.get('file_version')
        return self


class UploadServiceAuthfileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        file_index: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权协议索引号
        self.file_index = file_index

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
        if self.file_index is not None:
            result['file_index'] = self.file_index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('file_index') is not None:
            self.file_index = m.get('file_index')
        return self


class QueryDomestictrademarkExtensioninfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_set_id: str = None,
        tid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据集ID
        self.data_set_id = data_set_id
        # 商标唯一标识号
        self.tid = tid

    def validate(self):
        self.validate_required(self.data_set_id, 'data_set_id')
        self.validate_required(self.tid, 'tid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.tid is not None:
            result['tid'] = self.tid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('tid') is not None:
            self.tid = m.get('tid')
        return self


class QueryDomestictrademarkExtensioninfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: List[DomesticTmGoodsInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商标扩展商品与服务信息
        self.data = data

    def validate(self):
        if self.data:
            for k in self.data:
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
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = DomesticTmGoodsInfo()
                self.data.append(temp_model.from_map(k))
        return self


class GetApplicationFileentranceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_set_id: str = None,
        user_authed: bool = None,
        file_index: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据集ID
        self.data_set_id = data_set_id
        # 用户是否授权
        self.user_authed = user_authed
        # 授权文件ID
        self.file_index = file_index

    def validate(self):
        self.validate_required(self.data_set_id, 'data_set_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.user_authed is not None:
            result['user_authed'] = self.user_authed
        if self.file_index is not None:
            result['file_index'] = self.file_index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('user_authed') is not None:
            self.user_authed = m.get('user_authed')
        if m.get('file_index') is not None:
            self.file_index = m.get('file_index')
        return self


class GetApplicationFileentranceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 临时下载地址
        self.url = url

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
        if self.url is not None:
            result['url'] = self.url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('url') is not None:
            self.url = m.get('url')
        return self


class InitUnifiedentranceAsyncRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_index: str = None,
        params: str = None,
        user_authed: str = None,
        data_set_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权协议索引
        self.file_index = file_index
        # 整个需求的入参，map json
        self.params = params
        # 是否授权
        self.user_authed = user_authed
        # 数据集服务id
        self.data_set_id = data_set_id

    def validate(self):
        self.validate_required(self.params, 'params')
        self.validate_required(self.data_set_id, 'data_set_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_index is not None:
            result['file_index'] = self.file_index
        if self.params is not None:
            result['params'] = self.params
        if self.user_authed is not None:
            result['user_authed'] = self.user_authed
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_index') is not None:
            self.file_index = m.get('file_index')
        if m.get('params') is not None:
            self.params = m.get('params')
        if m.get('user_authed') is not None:
            self.user_authed = m.get('user_authed')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        return self


class InitUnifiedentranceAsyncResponse(TeaModel):
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
        # 具体返回，map json
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


class QueryUnifiedentranceAsyncRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        params: str = None,
        data_set_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 整个需求的入参，map json
        self.params = params
        # 数据集服务id
        self.data_set_id = data_set_id

    def validate(self):
        self.validate_required(self.params, 'params')
        self.validate_required(self.data_set_id, 'data_set_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.params is not None:
            result['params'] = self.params
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('params') is not None:
            self.params = m.get('params')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        return self


class QueryUnifiedentranceAsyncResponse(TeaModel):
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
        # 具体返回，map json
        # 
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


class QueryMainsiteUnifiedentranceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_index: str = None,
        params: str = None,
        user_authed: bool = None,
        data_set_id: str = None,
        token: str = None,
        scene_code: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权协议索引
        self.file_index = file_index
        # 整个需求的入参，map json
        self.params = params
        # 是否授权
        self.user_authed = user_authed
        # 数据集服务id
        self.data_set_id = data_set_id
        # 
        # 授权token
        self.token = token
        # token授权场景码
        self.scene_code = scene_code
        # 实际调用的租户ID
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.params, 'params')
        self.validate_required(self.data_set_id, 'data_set_id')
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
        if self.file_index is not None:
            result['file_index'] = self.file_index
        if self.params is not None:
            result['params'] = self.params
        if self.user_authed is not None:
            result['user_authed'] = self.user_authed
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        if self.token is not None:
            result['token'] = self.token
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_index') is not None:
            self.file_index = m.get('file_index')
        if m.get('params') is not None:
            self.params = m.get('params')
        if m.get('user_authed') is not None:
            self.user_authed = m.get('user_authed')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryMainsiteUnifiedentranceResponse(TeaModel):
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
        # 具体返回，map json
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


class GetApplicationProxysignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        sign_params: str = None,
        data_set_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 代签名相关参数
        self.sign_params = sign_params
        # 对应的服务id
        self.data_set_id = data_set_id

    def validate(self):
        self.validate_required(self.sign_params, 'sign_params')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.sign_params is not None:
            result['sign_params'] = self.sign_params
        if self.data_set_id is not None:
            result['data_set_id'] = self.data_set_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('sign_params') is not None:
            self.sign_params = m.get('sign_params')
        if m.get('data_set_id') is not None:
            self.data_set_id = m.get('data_set_id')
        return self


class GetApplicationProxysignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sign: str = None,
        ext: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 代客签名结果
        self.sign = sign
        # 扩展字段
        self.ext = ext

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
        if self.sign is not None:
            result['sign'] = self.sign
        if self.ext is not None:
            result['ext'] = self.ext
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sign') is not None:
            self.sign = m.get('sign')
        if m.get('ext') is not None:
            self.ext = m.get('ext')
        return self


class QueryApplicationChannelunifiedentranceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_index: str = None,
        params: str = None,
        user_authed: bool = None,
        service_id: str = None,
        scene_code: str = None,
        token: str = None,
        customer_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权文件ID
        self.file_index = file_index
        # 整个需求的入参，map json
        self.params = params
        # 是否授权
        self.user_authed = user_authed
        # 数据集服务id
        self.service_id = service_id
        # token授权场景码
        self.scene_code = scene_code
        # 
        # 授权token
        self.token = token
        # 客户ID
        self.customer_id = customer_id

    def validate(self):
        self.validate_required(self.params, 'params')
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.customer_id, 'customer_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_index is not None:
            result['file_index'] = self.file_index
        if self.params is not None:
            result['params'] = self.params
        if self.user_authed is not None:
            result['user_authed'] = self.user_authed
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.token is not None:
            result['token'] = self.token
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_index') is not None:
            self.file_index = m.get('file_index')
        if m.get('params') is not None:
            self.params = m.get('params')
        if m.get('user_authed') is not None:
            self.user_authed = m.get('user_authed')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        return self


class QueryApplicationChannelunifiedentranceResponse(TeaModel):
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
        # 具体返回，map json
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


class UploadApplicationChannelauthfileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        service_id: str = None,
        file_md_5: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        file_name: str = None,
        file_version: str = None,
        customer_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 服务id，开发者提供
        self.service_id = service_id
        # 文件md5
        self.file_md_5 = file_md_5
        # 文件ID
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 协议名称
        self.file_name = file_name
        # 授权协议文件版本号
        self.file_version = file_version
        # 客户ID
        self.customer_id = customer_id

    def validate(self):
        self.validate_required(self.service_id, 'service_id')
        self.validate_required(self.file_md_5, 'file_md_5')
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_version, 'file_version')
        self.validate_required(self.customer_id, 'customer_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.service_id is not None:
            result['service_id'] = self.service_id
        if self.file_md_5 is not None:
            result['file_md5'] = self.file_md_5
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_version is not None:
            result['file_version'] = self.file_version
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('service_id') is not None:
            self.service_id = m.get('service_id')
        if m.get('file_md5') is not None:
            self.file_md_5 = m.get('file_md5')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_version') is not None:
            self.file_version = m.get('file_version')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        return self


class UploadApplicationChannelauthfileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        file_index: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权协议索引号
        self.file_index = file_index

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
        if self.file_index is not None:
            result['file_index'] = self.file_index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('file_index') is not None:
            self.file_index = m.get('file_index')
        return self


class QueryApplicationMarriageRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_param: str = None,
        product_code: str = None,
        method_code: str = None,
        inst_code: str = None,
        algorithm: str = None,
        encryption: bool = None,
        encryption_key: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求参数json
        self.biz_param = biz_param
        # 产品code
        self.product_code = product_code
        # 调用的方法
        self.method_code = method_code
        # 租户编码
        self.inst_code = inst_code
        # RSA-DESede 代表数字信封：采用 rsa 非对称算法，DESede 对称算法
        self.algorithm = algorithm
        # 是否采用加密算法
        self.encryption = encryption
        # 对称秘钥加密后的数据
        self.encryption_key = encryption_key

    def validate(self):
        self.validate_required(self.biz_param, 'biz_param')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.method_code, 'method_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_param is not None:
            result['biz_param'] = self.biz_param
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.method_code is not None:
            result['method_code'] = self.method_code
        if self.inst_code is not None:
            result['inst_code'] = self.inst_code
        if self.algorithm is not None:
            result['algorithm'] = self.algorithm
        if self.encryption is not None:
            result['encryption'] = self.encryption
        if self.encryption_key is not None:
            result['encryption_key'] = self.encryption_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_param') is not None:
            self.biz_param = m.get('biz_param')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('method_code') is not None:
            self.method_code = m.get('method_code')
        if m.get('inst_code') is not None:
            self.inst_code = m.get('inst_code')
        if m.get('algorithm') is not None:
            self.algorithm = m.get('algorithm')
        if m.get('encryption') is not None:
            self.encryption = m.get('encryption')
        if m.get('encryption_key') is not None:
            self.encryption_key = m.get('encryption_key')
        return self


class QueryApplicationMarriageResponse(TeaModel):
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
        # 返回数据
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


class GetDasLinkRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        be_authed_person_app_biz_uuid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 被授权人接入应用biz_uuid
        self.be_authed_person_app_biz_uuid = be_authed_person_app_biz_uuid

    def validate(self):
        self.validate_required(self.be_authed_person_app_biz_uuid, 'be_authed_person_app_biz_uuid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.be_authed_person_app_biz_uuid is not None:
            result['be_authed_person_app_biz_uuid'] = self.be_authed_person_app_biz_uuid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('be_authed_person_app_biz_uuid') is not None:
            self.be_authed_person_app_biz_uuid = m.get('be_authed_person_app_biz_uuid')
        return self


class GetDasLinkResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        token: str = None,
        link: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # H5应用身份认证信息
        self.token = token
        # 带有token 信息的H5页面链接
        self.link = link

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
        if self.token is not None:
            result['token'] = self.token
        if self.link is not None:
            result['link'] = self.link
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('token') is not None:
            self.token = m.get('token')
        if m.get('link') is not None:
            self.link = m.get('link')
        return self


class GetDasEnterprisevcRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_instance_biz_uuid: str = None,
        auth_person_enterprise_info: AuthPersonEnterpriseInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权实例biz_uuid
        self.auth_instance_biz_uuid = auth_instance_biz_uuid
        # 授权企业信息
        self.auth_person_enterprise_info = auth_person_enterprise_info

    def validate(self):
        self.validate_required(self.auth_instance_biz_uuid, 'auth_instance_biz_uuid')
        self.validate_required(self.auth_person_enterprise_info, 'auth_person_enterprise_info')
        if self.auth_person_enterprise_info:
            self.auth_person_enterprise_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_instance_biz_uuid is not None:
            result['auth_instance_biz_uuid'] = self.auth_instance_biz_uuid
        if self.auth_person_enterprise_info is not None:
            result['auth_person_enterprise_info'] = self.auth_person_enterprise_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('auth_instance_biz_uuid') is not None:
            self.auth_instance_biz_uuid = m.get('auth_instance_biz_uuid')
        if m.get('auth_person_enterprise_info') is not None:
            temp_model = AuthPersonEnterpriseInfo()
            self.auth_person_enterprise_info = temp_model.from_map(m['auth_person_enterprise_info'])
        return self


class GetDasEnterprisevcResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        vc: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # VC 内容
        self.vc = vc

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
        if self.vc is not None:
            result['vc'] = self.vc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('vc') is not None:
            self.vc = m.get('vc')
        return self


class GetDasIndividualvcRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_instance_biz_uuid: str = None,
        authed_person_individual_info: AuthPersonIndividualInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权实例biz_uuid
        self.auth_instance_biz_uuid = auth_instance_biz_uuid
        # 授权人个人信息
        self.authed_person_individual_info = authed_person_individual_info

    def validate(self):
        self.validate_required(self.auth_instance_biz_uuid, 'auth_instance_biz_uuid')
        self.validate_required(self.authed_person_individual_info, 'authed_person_individual_info')
        if self.authed_person_individual_info:
            self.authed_person_individual_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_instance_biz_uuid is not None:
            result['auth_instance_biz_uuid'] = self.auth_instance_biz_uuid
        if self.authed_person_individual_info is not None:
            result['authed_person_individual_info'] = self.authed_person_individual_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('auth_instance_biz_uuid') is not None:
            self.auth_instance_biz_uuid = m.get('auth_instance_biz_uuid')
        if m.get('authed_person_individual_info') is not None:
            temp_model = AuthPersonIndividualInfo()
            self.authed_person_individual_info = temp_model.from_map(m['authed_person_individual_info'])
        return self


class GetDasIndividualvcResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        vc: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # VC
        self.vc = vc

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
        if self.vc is not None:
            result['vc'] = self.vc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('vc') is not None:
            self.vc = m.get('vc')
        return self


class SendDasSmsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        receive_phone_num: int = None,
        auth_instance_biz_uuid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 接收方电话号码
        self.receive_phone_num = receive_phone_num
        # 授权实例biz_uuid
        self.auth_instance_biz_uuid = auth_instance_biz_uuid

    def validate(self):
        self.validate_required(self.receive_phone_num, 'receive_phone_num')
        self.validate_required(self.auth_instance_biz_uuid, 'auth_instance_biz_uuid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.receive_phone_num is not None:
            result['receive_phone_num'] = self.receive_phone_num
        if self.auth_instance_biz_uuid is not None:
            result['auth_instance_biz_uuid'] = self.auth_instance_biz_uuid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('receive_phone_num') is not None:
            self.receive_phone_num = m.get('receive_phone_num')
        if m.get('auth_instance_biz_uuid') is not None:
            self.auth_instance_biz_uuid = m.get('auth_instance_biz_uuid')
        return self


class SendDasSmsResponse(TeaModel):
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


class AuthDasSmsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        verification_code: str = None,
        auth_instance_biz_uuid: str = None,
        auth_person_enterprise_info: AuthPersonEnterpriseInfo = None,
        auth_person_individual_info: AuthPersonIndividualInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 手机验证码
        self.verification_code = verification_code
        # 授权实例biz_uuid
        self.auth_instance_biz_uuid = auth_instance_biz_uuid
        # 授权企业信息
        self.auth_person_enterprise_info = auth_person_enterprise_info
        # 授权人个人信息
        self.auth_person_individual_info = auth_person_individual_info

    def validate(self):
        self.validate_required(self.verification_code, 'verification_code')
        self.validate_required(self.auth_instance_biz_uuid, 'auth_instance_biz_uuid')
        if self.auth_person_enterprise_info:
            self.auth_person_enterprise_info.validate()
        if self.auth_person_individual_info:
            self.auth_person_individual_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.verification_code is not None:
            result['verification_code'] = self.verification_code
        if self.auth_instance_biz_uuid is not None:
            result['auth_instance_biz_uuid'] = self.auth_instance_biz_uuid
        if self.auth_person_enterprise_info is not None:
            result['auth_person_enterprise_info'] = self.auth_person_enterprise_info.to_map()
        if self.auth_person_individual_info is not None:
            result['auth_person_individual_info'] = self.auth_person_individual_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('verification_code') is not None:
            self.verification_code = m.get('verification_code')
        if m.get('auth_instance_biz_uuid') is not None:
            self.auth_instance_biz_uuid = m.get('auth_instance_biz_uuid')
        if m.get('auth_person_enterprise_info') is not None:
            temp_model = AuthPersonEnterpriseInfo()
            self.auth_person_enterprise_info = temp_model.from_map(m['auth_person_enterprise_info'])
        if m.get('auth_person_individual_info') is not None:
            temp_model = AuthPersonIndividualInfo()
            self.auth_person_individual_info = temp_model.from_map(m['auth_person_individual_info'])
        return self


class AuthDasSmsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        auth_status: str = None,
        vc: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权状态
        self.auth_status = auth_status
        # VC
        self.vc = vc

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
        if self.auth_status is not None:
            result['auth_status'] = self.auth_status
        if self.vc is not None:
            result['vc'] = self.vc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('auth_status') is not None:
            self.auth_status = m.get('auth_status')
        if m.get('vc') is not None:
            self.vc = m.get('vc')
        return self


class VerifyDasEnterpriseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_instance_biz_uuid: str = None,
        vc: str = None,
        be_authed_person_info: BeAuthedPersonInfo = None,
        auth_person_enterprise_info: AuthPersonEnterpriseInfo = None,
        data_source_info: List[DataSource] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 被授权企业接入应用ID
        self.auth_instance_biz_uuid = auth_instance_biz_uuid
        # VC完整内容
        self.vc = vc
        # 被授权企业信息
        self.be_authed_person_info = be_authed_person_info
        # 授权人企业信息
        self.auth_person_enterprise_info = auth_person_enterprise_info
        # 需要访问的数据源信息列表
        self.data_source_info = data_source_info

    def validate(self):
        self.validate_required(self.auth_instance_biz_uuid, 'auth_instance_biz_uuid')
        self.validate_required(self.vc, 'vc')
        self.validate_required(self.be_authed_person_info, 'be_authed_person_info')
        if self.be_authed_person_info:
            self.be_authed_person_info.validate()
        self.validate_required(self.auth_person_enterprise_info, 'auth_person_enterprise_info')
        if self.auth_person_enterprise_info:
            self.auth_person_enterprise_info.validate()
        self.validate_required(self.data_source_info, 'data_source_info')
        if self.data_source_info:
            for k in self.data_source_info:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_instance_biz_uuid is not None:
            result['auth_instance_biz_uuid'] = self.auth_instance_biz_uuid
        if self.vc is not None:
            result['vc'] = self.vc
        if self.be_authed_person_info is not None:
            result['be_authed_person_info'] = self.be_authed_person_info.to_map()
        if self.auth_person_enterprise_info is not None:
            result['auth_person_enterprise_info'] = self.auth_person_enterprise_info.to_map()
        result['data_source_info'] = []
        if self.data_source_info is not None:
            for k in self.data_source_info:
                result['data_source_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('auth_instance_biz_uuid') is not None:
            self.auth_instance_biz_uuid = m.get('auth_instance_biz_uuid')
        if m.get('vc') is not None:
            self.vc = m.get('vc')
        if m.get('be_authed_person_info') is not None:
            temp_model = BeAuthedPersonInfo()
            self.be_authed_person_info = temp_model.from_map(m['be_authed_person_info'])
        if m.get('auth_person_enterprise_info') is not None:
            temp_model = AuthPersonEnterpriseInfo()
            self.auth_person_enterprise_info = temp_model.from_map(m['auth_person_enterprise_info'])
        self.data_source_info = []
        if m.get('data_source_info') is not None:
            for k in m.get('data_source_info'):
                temp_model = DataSource()
                self.data_source_info.append(temp_model.from_map(k))
        return self


class VerifyDasEnterpriseResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        failed_reason: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 核验结果
        self.success = success
        # 核验失败原因
        self.failed_reason = failed_reason

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
        if self.failed_reason is not None:
            result['failed_reason'] = self.failed_reason
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
        if m.get('failed_reason') is not None:
            self.failed_reason = m.get('failed_reason')
        return self


class VerifyDasIndividualRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_instance_biz_uuid: str = None,
        vc: str = None,
        be_authed_person_info: BeAuthedPersonInfo = None,
        auth_person_individual_info: AuthPersonIndividualInfo = None,
        data_source_info: List[DataSource] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权实例biz_uuid
        self.auth_instance_biz_uuid = auth_instance_biz_uuid
        # VC完整内容
        self.vc = vc
        # 被授权企业信息
        self.be_authed_person_info = be_authed_person_info
        # 授权人个人信息
        self.auth_person_individual_info = auth_person_individual_info
        # 需要访问的数据源信息列表
        self.data_source_info = data_source_info

    def validate(self):
        self.validate_required(self.auth_instance_biz_uuid, 'auth_instance_biz_uuid')
        self.validate_required(self.vc, 'vc')
        self.validate_required(self.be_authed_person_info, 'be_authed_person_info')
        if self.be_authed_person_info:
            self.be_authed_person_info.validate()
        self.validate_required(self.auth_person_individual_info, 'auth_person_individual_info')
        if self.auth_person_individual_info:
            self.auth_person_individual_info.validate()
        self.validate_required(self.data_source_info, 'data_source_info')
        if self.data_source_info:
            for k in self.data_source_info:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_instance_biz_uuid is not None:
            result['auth_instance_biz_uuid'] = self.auth_instance_biz_uuid
        if self.vc is not None:
            result['vc'] = self.vc
        if self.be_authed_person_info is not None:
            result['be_authed_person_info'] = self.be_authed_person_info.to_map()
        if self.auth_person_individual_info is not None:
            result['auth_person_individual_info'] = self.auth_person_individual_info.to_map()
        result['data_source_info'] = []
        if self.data_source_info is not None:
            for k in self.data_source_info:
                result['data_source_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('auth_instance_biz_uuid') is not None:
            self.auth_instance_biz_uuid = m.get('auth_instance_biz_uuid')
        if m.get('vc') is not None:
            self.vc = m.get('vc')
        if m.get('be_authed_person_info') is not None:
            temp_model = BeAuthedPersonInfo()
            self.be_authed_person_info = temp_model.from_map(m['be_authed_person_info'])
        if m.get('auth_person_individual_info') is not None:
            temp_model = AuthPersonIndividualInfo()
            self.auth_person_individual_info = temp_model.from_map(m['auth_person_individual_info'])
        self.data_source_info = []
        if m.get('data_source_info') is not None:
            for k in m.get('data_source_info'):
                temp_model = DataSource()
                self.data_source_info.append(temp_model.from_map(k))
        return self


class VerifyDasIndividualResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        failed_reason: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 核验结果
        self.success = success
        # 核验失败原因
        self.failed_reason = failed_reason

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
        if self.failed_reason is not None:
            result['failed_reason'] = self.failed_reason
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
        if m.get('failed_reason') is not None:
            self.failed_reason = m.get('failed_reason')
        return self


class CreateDasDatasourceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        provider: str = None,
        data_owner_type: str = None,
        data_source_interface: DataSourceInterface = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据源名称
        self.name = name
        # 数据源提供方
        self.provider = provider
        # 枚举值：ENTERPRISE、INDIVIDUAL
        self.data_owner_type = data_owner_type
        # 数据源接口定义
        self.data_source_interface = data_source_interface

    def validate(self):
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 20)
        self.validate_required(self.provider, 'provider')
        if self.provider is not None:
            self.validate_max_length(self.provider, 'provider', 30)
        self.validate_required(self.data_owner_type, 'data_owner_type')
        self.validate_required(self.data_source_interface, 'data_source_interface')
        if self.data_source_interface:
            self.data_source_interface.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.provider is not None:
            result['provider'] = self.provider
        if self.data_owner_type is not None:
            result['data_owner_type'] = self.data_owner_type
        if self.data_source_interface is not None:
            result['data_source_interface'] = self.data_source_interface.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('provider') is not None:
            self.provider = m.get('provider')
        if m.get('data_owner_type') is not None:
            self.data_owner_type = m.get('data_owner_type')
        if m.get('data_source_interface') is not None:
            temp_model = DataSourceInterface()
            self.data_source_interface = temp_model.from_map(m['data_source_interface'])
        return self


class CreateDasDatasourceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_uuid: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据源 biz_uuid
        self.biz_uuid = biz_uuid

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
        if self.biz_uuid is not None:
            result['biz_uuid'] = self.biz_uuid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_uuid') is not None:
            self.biz_uuid = m.get('biz_uuid')
        return self


class UpdateDasDatasourceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_uuid: str = None,
        name: str = None,
        provider: str = None,
        data_owner_type: str = None,
        data_source_interface: DataSourceInterface = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 要修改的数据源biz_uuid
        self.biz_uuid = biz_uuid
        # 数据源名称
        self.name = name
        # 数据源提供方
        self.provider = provider
        # 枚举值：ENTERPRISE、INDIVIDUAL
        self.data_owner_type = data_owner_type
        # 数据源接口定义
        self.data_source_interface = data_source_interface

    def validate(self):
        self.validate_required(self.biz_uuid, 'biz_uuid')
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 20)
        self.validate_required(self.provider, 'provider')
        if self.provider is not None:
            self.validate_max_length(self.provider, 'provider', 30)
        self.validate_required(self.data_owner_type, 'data_owner_type')
        self.validate_required(self.data_source_interface, 'data_source_interface')
        if self.data_source_interface:
            self.data_source_interface.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_uuid is not None:
            result['biz_uuid'] = self.biz_uuid
        if self.name is not None:
            result['name'] = self.name
        if self.provider is not None:
            result['provider'] = self.provider
        if self.data_owner_type is not None:
            result['data_owner_type'] = self.data_owner_type
        if self.data_source_interface is not None:
            result['data_source_interface'] = self.data_source_interface.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_uuid') is not None:
            self.biz_uuid = m.get('biz_uuid')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('provider') is not None:
            self.provider = m.get('provider')
        if m.get('data_owner_type') is not None:
            self.data_owner_type = m.get('data_owner_type')
        if m.get('data_source_interface') is not None:
            temp_model = DataSourceInterface()
            self.data_source_interface = temp_model.from_map(m['data_source_interface'])
        return self


class UpdateDasDatasourceResponse(TeaModel):
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


class DeleteDasDatasourceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_uuid: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 要删除的数据源biz_uuid
        self.biz_uuid = biz_uuid

    def validate(self):
        self.validate_required(self.biz_uuid, 'biz_uuid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_uuid is not None:
            result['biz_uuid'] = self.biz_uuid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_uuid') is not None:
            self.biz_uuid = m.get('biz_uuid')
        return self


class DeleteDasDatasourceResponse(TeaModel):
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


class QueryDasDatasourceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        name: str = None,
        provider: str = None,
        data_owner_type: str = None,
        address: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据源名称
        self.name = name
        # 数据源提供方
        self.provider = provider
        # 枚举值：ENTERPRISE、INDIVIDUAL
        self.data_owner_type = data_owner_type
        # 数据源接口访问地址
        self.address = address

    def validate(self):
        self.validate_required(self.name, 'name')
        if self.name is not None:
            self.validate_max_length(self.name, 'name', 20)
        if self.provider is not None:
            self.validate_max_length(self.provider, 'provider', 30)
        if self.address is not None:
            self.validate_max_length(self.address, 'address', 100)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.name is not None:
            result['name'] = self.name
        if self.provider is not None:
            result['provider'] = self.provider
        if self.data_owner_type is not None:
            result['data_owner_type'] = self.data_owner_type
        if self.address is not None:
            result['address'] = self.address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('provider') is not None:
            self.provider = m.get('provider')
        if m.get('data_owner_type') is not None:
            self.data_owner_type = m.get('data_owner_type')
        if m.get('address') is not None:
            self.address = m.get('address')
        return self


class QueryDasDatasourceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data_sources: List[DataSourceInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据源信息列表
        self.data_sources = data_sources

    def validate(self):
        if self.data_sources:
            for k in self.data_sources:
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
        result['data_sources'] = []
        if self.data_sources is not None:
            for k in self.data_sources:
                result['data_sources'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data_sources = []
        if m.get('data_sources') is not None:
            for k in m.get('data_sources'):
                temp_model = DataSourceInfo()
                self.data_sources.append(temp_model.from_map(k))
        return self


class VerifyDasAuthresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_source_biz_uuids: List[str] = None,
        be_authed_person_app_name: str = None,
        auth_person_enterprise_credit_num: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据源biz_uuid列表
        self.data_source_biz_uuids = data_source_biz_uuids
        # 被授权企业接入应用名称
        self.be_authed_person_app_name = be_authed_person_app_name
        # 授权企业统一社会信用码
        self.auth_person_enterprise_credit_num = auth_person_enterprise_credit_num

    def validate(self):
        self.validate_required(self.data_source_biz_uuids, 'data_source_biz_uuids')
        self.validate_required(self.be_authed_person_app_name, 'be_authed_person_app_name')
        self.validate_required(self.auth_person_enterprise_credit_num, 'auth_person_enterprise_credit_num')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_source_biz_uuids is not None:
            result['data_source_biz_uuids'] = self.data_source_biz_uuids
        if self.be_authed_person_app_name is not None:
            result['be_authed_person_app_name'] = self.be_authed_person_app_name
        if self.auth_person_enterprise_credit_num is not None:
            result['auth_person_enterprise_credit_num'] = self.auth_person_enterprise_credit_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_source_biz_uuids') is not None:
            self.data_source_biz_uuids = m.get('data_source_biz_uuids')
        if m.get('be_authed_person_app_name') is not None:
            self.be_authed_person_app_name = m.get('be_authed_person_app_name')
        if m.get('auth_person_enterprise_credit_num') is not None:
            self.auth_person_enterprise_credit_num = m.get('auth_person_enterprise_credit_num')
        return self


class VerifyDasAuthresultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        auth_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权状态: 未授权，已授权
        self.auth_status = auth_status

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
        if self.auth_status is not None:
            result['auth_status'] = self.auth_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('auth_status') is not None:
            self.auth_status = m.get('auth_status')
        return self


class AuthDasAuthresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_source_biz_uuids: List[str] = None,
        be_authed_person_app_name: str = None,
        auth_person_enterprise_info: AuthPersonEnterpriseInfo = None,
        auth_person_individual_info: AuthPersonIndividualInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据源biz_uuid列表
        self.data_source_biz_uuids = data_source_biz_uuids
        # 被授权企业接入应用名称
        self.be_authed_person_app_name = be_authed_person_app_name
        # 授权企业信息
        self.auth_person_enterprise_info = auth_person_enterprise_info
        # 授权人信息
        self.auth_person_individual_info = auth_person_individual_info

    def validate(self):
        self.validate_required(self.data_source_biz_uuids, 'data_source_biz_uuids')
        self.validate_required(self.be_authed_person_app_name, 'be_authed_person_app_name')
        if self.auth_person_enterprise_info:
            self.auth_person_enterprise_info.validate()
        if self.auth_person_individual_info:
            self.auth_person_individual_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_source_biz_uuids is not None:
            result['data_source_biz_uuids'] = self.data_source_biz_uuids
        if self.be_authed_person_app_name is not None:
            result['be_authed_person_app_name'] = self.be_authed_person_app_name
        if self.auth_person_enterprise_info is not None:
            result['auth_person_enterprise_info'] = self.auth_person_enterprise_info.to_map()
        if self.auth_person_individual_info is not None:
            result['auth_person_individual_info'] = self.auth_person_individual_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_source_biz_uuids') is not None:
            self.data_source_biz_uuids = m.get('data_source_biz_uuids')
        if m.get('be_authed_person_app_name') is not None:
            self.be_authed_person_app_name = m.get('be_authed_person_app_name')
        if m.get('auth_person_enterprise_info') is not None:
            temp_model = AuthPersonEnterpriseInfo()
            self.auth_person_enterprise_info = temp_model.from_map(m['auth_person_enterprise_info'])
        if m.get('auth_person_individual_info') is not None:
            temp_model = AuthPersonIndividualInfo()
            self.auth_person_individual_info = temp_model.from_map(m['auth_person_individual_info'])
        return self


class AuthDasAuthresultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        auth_instance_biz_uuid: str = None,
        auth_result_biz_uuid: str = None,
        vc: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权实例biz_uuid
        self.auth_instance_biz_uuid = auth_instance_biz_uuid
        # 授权详情biz_uuid
        self.auth_result_biz_uuid = auth_result_biz_uuid
        # VC 完整信息
        self.vc = vc

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
        if self.auth_instance_biz_uuid is not None:
            result['auth_instance_biz_uuid'] = self.auth_instance_biz_uuid
        if self.auth_result_biz_uuid is not None:
            result['auth_result_biz_uuid'] = self.auth_result_biz_uuid
        if self.vc is not None:
            result['vc'] = self.vc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('auth_instance_biz_uuid') is not None:
            self.auth_instance_biz_uuid = m.get('auth_instance_biz_uuid')
        if m.get('auth_result_biz_uuid') is not None:
            self.auth_result_biz_uuid = m.get('auth_result_biz_uuid')
        if m.get('vc') is not None:
            self.vc = m.get('vc')
        return self


class AddAuthConfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        parent_scene_code: str = None,
        source_service_node_id: str = None,
        source_tenant_id: str = None,
        target_service_node_id: str = None,
        auth_enterprise_code: str = None,
        target_name: str = None,
        auth_app_name: str = None,
        enterprise_logo: str = None,
        auth_purpose: str = None,
        auth_desc: str = None,
        auth_type: str = None,
        enable_show_proof_vc: bool = None,
        enable_show_auth_record: bool = None,
        product_group_list: List[ProductProviderGroup] = None,
        user_type: str = None,
        agreement_list: List[Agreement] = None,
        background_color: str = None,
        use_facial_recognition: bool = None,
        use_scope_list: List[str] = None,
        inner_success_callback_url: str = None,
        outside_success_callback_url: str = None,
        public_key: str = None,
        start_auth_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 复用的场景码
        self.parent_scene_code = parent_scene_code
        # 数据源可信空间id
        self.source_service_node_id = source_service_node_id
        # 数据源租户id
        self.source_tenant_id = source_tenant_id
        # 使用方可信空间id
        self.target_service_node_id = target_service_node_id
        # 被授权方企业信用代码
        self.auth_enterprise_code = auth_enterprise_code
        # 被授权方名称
        self.target_name = target_name
        # 业务应用名称
        self.auth_app_name = auth_app_name
        # 客户应用logo的oss key
        self.enterprise_logo = enterprise_logo
        # 用途说明
        self.auth_purpose = auth_purpose
        # 授权描述
        self.auth_desc = auth_desc
        # 授权形式
        self.auth_type = auth_type
        # C端是否显示凭证数据
        self.enable_show_proof_vc = enable_show_proof_vc
        # C端是否显示授权记录
        self.enable_show_auth_record = enable_show_auth_record
        # 授权服务产品列表
        self.product_group_list = product_group_list
        # 用户类型
        self.user_type = user_type
        # 授权协议
        self.agreement_list = agreement_list
        # 主题颜色
        self.background_color = background_color
        # 使用刷脸识别
        self.use_facial_recognition = use_facial_recognition
        # 页面使用范围列表
        self.use_scope_list = use_scope_list
        # 授权成功端内跳转地址
        self.inner_success_callback_url = inner_success_callback_url
        # 授权成功端外跳转地址
        self.outside_success_callback_url = outside_success_callback_url
        # 公钥
        self.public_key = public_key
        # 发起授权页面的链接
        self.start_auth_url = start_auth_url

    def validate(self):
        self.validate_required(self.source_service_node_id, 'source_service_node_id')
        self.validate_required(self.source_tenant_id, 'source_tenant_id')
        self.validate_required(self.target_service_node_id, 'target_service_node_id')
        self.validate_required(self.auth_enterprise_code, 'auth_enterprise_code')
        self.validate_required(self.target_name, 'target_name')
        self.validate_required(self.auth_app_name, 'auth_app_name')
        self.validate_required(self.enterprise_logo, 'enterprise_logo')
        self.validate_required(self.auth_purpose, 'auth_purpose')
        self.validate_required(self.auth_type, 'auth_type')
        if self.product_group_list:
            for k in self.product_group_list:
                if k:
                    k.validate()
        if self.agreement_list:
            for k in self.agreement_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.parent_scene_code is not None:
            result['parent_scene_code'] = self.parent_scene_code
        if self.source_service_node_id is not None:
            result['source_service_node_id'] = self.source_service_node_id
        if self.source_tenant_id is not None:
            result['source_tenant_id'] = self.source_tenant_id
        if self.target_service_node_id is not None:
            result['target_service_node_id'] = self.target_service_node_id
        if self.auth_enterprise_code is not None:
            result['auth_enterprise_code'] = self.auth_enterprise_code
        if self.target_name is not None:
            result['target_name'] = self.target_name
        if self.auth_app_name is not None:
            result['auth_app_name'] = self.auth_app_name
        if self.enterprise_logo is not None:
            result['enterprise_logo'] = self.enterprise_logo
        if self.auth_purpose is not None:
            result['auth_purpose'] = self.auth_purpose
        if self.auth_desc is not None:
            result['auth_desc'] = self.auth_desc
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        if self.enable_show_proof_vc is not None:
            result['enable_show_proof_vc'] = self.enable_show_proof_vc
        if self.enable_show_auth_record is not None:
            result['enable_show_auth_record'] = self.enable_show_auth_record
        result['product_group_list'] = []
        if self.product_group_list is not None:
            for k in self.product_group_list:
                result['product_group_list'].append(k.to_map() if k else None)
        if self.user_type is not None:
            result['user_type'] = self.user_type
        result['agreement_list'] = []
        if self.agreement_list is not None:
            for k in self.agreement_list:
                result['agreement_list'].append(k.to_map() if k else None)
        if self.background_color is not None:
            result['background_color'] = self.background_color
        if self.use_facial_recognition is not None:
            result['use_facial_recognition'] = self.use_facial_recognition
        if self.use_scope_list is not None:
            result['use_scope_list'] = self.use_scope_list
        if self.inner_success_callback_url is not None:
            result['inner_success_callback_url'] = self.inner_success_callback_url
        if self.outside_success_callback_url is not None:
            result['outside_success_callback_url'] = self.outside_success_callback_url
        if self.public_key is not None:
            result['public_key'] = self.public_key
        if self.start_auth_url is not None:
            result['start_auth_url'] = self.start_auth_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('parent_scene_code') is not None:
            self.parent_scene_code = m.get('parent_scene_code')
        if m.get('source_service_node_id') is not None:
            self.source_service_node_id = m.get('source_service_node_id')
        if m.get('source_tenant_id') is not None:
            self.source_tenant_id = m.get('source_tenant_id')
        if m.get('target_service_node_id') is not None:
            self.target_service_node_id = m.get('target_service_node_id')
        if m.get('auth_enterprise_code') is not None:
            self.auth_enterprise_code = m.get('auth_enterprise_code')
        if m.get('target_name') is not None:
            self.target_name = m.get('target_name')
        if m.get('auth_app_name') is not None:
            self.auth_app_name = m.get('auth_app_name')
        if m.get('enterprise_logo') is not None:
            self.enterprise_logo = m.get('enterprise_logo')
        if m.get('auth_purpose') is not None:
            self.auth_purpose = m.get('auth_purpose')
        if m.get('auth_desc') is not None:
            self.auth_desc = m.get('auth_desc')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        if m.get('enable_show_proof_vc') is not None:
            self.enable_show_proof_vc = m.get('enable_show_proof_vc')
        if m.get('enable_show_auth_record') is not None:
            self.enable_show_auth_record = m.get('enable_show_auth_record')
        self.product_group_list = []
        if m.get('product_group_list') is not None:
            for k in m.get('product_group_list'):
                temp_model = ProductProviderGroup()
                self.product_group_list.append(temp_model.from_map(k))
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        self.agreement_list = []
        if m.get('agreement_list') is not None:
            for k in m.get('agreement_list'):
                temp_model = Agreement()
                self.agreement_list.append(temp_model.from_map(k))
        if m.get('background_color') is not None:
            self.background_color = m.get('background_color')
        if m.get('use_facial_recognition') is not None:
            self.use_facial_recognition = m.get('use_facial_recognition')
        if m.get('use_scope_list') is not None:
            self.use_scope_list = m.get('use_scope_list')
        if m.get('inner_success_callback_url') is not None:
            self.inner_success_callback_url = m.get('inner_success_callback_url')
        if m.get('outside_success_callback_url') is not None:
            self.outside_success_callback_url = m.get('outside_success_callback_url')
        if m.get('public_key') is not None:
            self.public_key = m.get('public_key')
        if m.get('start_auth_url') is not None:
            self.start_auth_url = m.get('start_auth_url')
        return self


class AddAuthConfigResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        scene_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 场景码
        self.scene_code = scene_code

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
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        return self


class UpdateAuthConfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene_code: str = None,
        parent_scene_code: str = None,
        source_service_node_id: str = None,
        source_tenant_id: str = None,
        target_service_node_id: str = None,
        auth_enterprise_code: str = None,
        target_name: str = None,
        auth_app_name: str = None,
        enterprise_logo: str = None,
        auth_purpose: str = None,
        auth_desc: str = None,
        auth_type: str = None,
        enable_show_proof_vc: bool = None,
        enable_show_auth_record: bool = None,
        product_group_list: List[ProductProviderGroup] = None,
        user_type: str = None,
        agreement_list: List[Agreement] = None,
        background_color: str = None,
        use_facial_recognition: bool = None,
        use_scope_list: List[str] = None,
        inner_success_callback_url: str = None,
        outside_success_callback_url: str = None,
        public_key: str = None,
        start_auth_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        self.scene_code = scene_code
        # 复用的场景码
        self.parent_scene_code = parent_scene_code
        # 数据源可信空间id
        self.source_service_node_id = source_service_node_id
        # 数据源租户id
        self.source_tenant_id = source_tenant_id
        # 使用方可信空间id
        self.target_service_node_id = target_service_node_id
        # 被授权方企业信用代码
        self.auth_enterprise_code = auth_enterprise_code
        # 被授权方名称
        self.target_name = target_name
        # 业务应用名称
        self.auth_app_name = auth_app_name
        # 客户应用logo的oss key
        self.enterprise_logo = enterprise_logo
        # 用途说明
        self.auth_purpose = auth_purpose
        # 授权描述
        self.auth_desc = auth_desc
        # 授权形式
        self.auth_type = auth_type
        # C端是否显示凭证数据
        self.enable_show_proof_vc = enable_show_proof_vc
        # C端是否显示授权记录
        self.enable_show_auth_record = enable_show_auth_record
        # 授权服务产品列表
        self.product_group_list = product_group_list
        # 用户类型
        self.user_type = user_type
        # 授权协议
        self.agreement_list = agreement_list
        # 主题颜色
        self.background_color = background_color
        # 使用刷脸识别
        self.use_facial_recognition = use_facial_recognition
        # 页面使用范围列表
        self.use_scope_list = use_scope_list
        # 授权成功端内跳转地址
        self.inner_success_callback_url = inner_success_callback_url
        # 授权成功端外跳转地址
        self.outside_success_callback_url = outside_success_callback_url
        # 公钥
        self.public_key = public_key
        # 发起授权页面的链接
        self.start_auth_url = start_auth_url

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.source_service_node_id, 'source_service_node_id')
        self.validate_required(self.source_tenant_id, 'source_tenant_id')
        self.validate_required(self.target_service_node_id, 'target_service_node_id')
        self.validate_required(self.auth_enterprise_code, 'auth_enterprise_code')
        self.validate_required(self.target_name, 'target_name')
        self.validate_required(self.auth_app_name, 'auth_app_name')
        self.validate_required(self.enterprise_logo, 'enterprise_logo')
        self.validate_required(self.auth_purpose, 'auth_purpose')
        self.validate_required(self.auth_type, 'auth_type')
        if self.product_group_list:
            for k in self.product_group_list:
                if k:
                    k.validate()
        if self.agreement_list:
            for k in self.agreement_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.parent_scene_code is not None:
            result['parent_scene_code'] = self.parent_scene_code
        if self.source_service_node_id is not None:
            result['source_service_node_id'] = self.source_service_node_id
        if self.source_tenant_id is not None:
            result['source_tenant_id'] = self.source_tenant_id
        if self.target_service_node_id is not None:
            result['target_service_node_id'] = self.target_service_node_id
        if self.auth_enterprise_code is not None:
            result['auth_enterprise_code'] = self.auth_enterprise_code
        if self.target_name is not None:
            result['target_name'] = self.target_name
        if self.auth_app_name is not None:
            result['auth_app_name'] = self.auth_app_name
        if self.enterprise_logo is not None:
            result['enterprise_logo'] = self.enterprise_logo
        if self.auth_purpose is not None:
            result['auth_purpose'] = self.auth_purpose
        if self.auth_desc is not None:
            result['auth_desc'] = self.auth_desc
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        if self.enable_show_proof_vc is not None:
            result['enable_show_proof_vc'] = self.enable_show_proof_vc
        if self.enable_show_auth_record is not None:
            result['enable_show_auth_record'] = self.enable_show_auth_record
        result['product_group_list'] = []
        if self.product_group_list is not None:
            for k in self.product_group_list:
                result['product_group_list'].append(k.to_map() if k else None)
        if self.user_type is not None:
            result['user_type'] = self.user_type
        result['agreement_list'] = []
        if self.agreement_list is not None:
            for k in self.agreement_list:
                result['agreement_list'].append(k.to_map() if k else None)
        if self.background_color is not None:
            result['background_color'] = self.background_color
        if self.use_facial_recognition is not None:
            result['use_facial_recognition'] = self.use_facial_recognition
        if self.use_scope_list is not None:
            result['use_scope_list'] = self.use_scope_list
        if self.inner_success_callback_url is not None:
            result['inner_success_callback_url'] = self.inner_success_callback_url
        if self.outside_success_callback_url is not None:
            result['outside_success_callback_url'] = self.outside_success_callback_url
        if self.public_key is not None:
            result['public_key'] = self.public_key
        if self.start_auth_url is not None:
            result['start_auth_url'] = self.start_auth_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('parent_scene_code') is not None:
            self.parent_scene_code = m.get('parent_scene_code')
        if m.get('source_service_node_id') is not None:
            self.source_service_node_id = m.get('source_service_node_id')
        if m.get('source_tenant_id') is not None:
            self.source_tenant_id = m.get('source_tenant_id')
        if m.get('target_service_node_id') is not None:
            self.target_service_node_id = m.get('target_service_node_id')
        if m.get('auth_enterprise_code') is not None:
            self.auth_enterprise_code = m.get('auth_enterprise_code')
        if m.get('target_name') is not None:
            self.target_name = m.get('target_name')
        if m.get('auth_app_name') is not None:
            self.auth_app_name = m.get('auth_app_name')
        if m.get('enterprise_logo') is not None:
            self.enterprise_logo = m.get('enterprise_logo')
        if m.get('auth_purpose') is not None:
            self.auth_purpose = m.get('auth_purpose')
        if m.get('auth_desc') is not None:
            self.auth_desc = m.get('auth_desc')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        if m.get('enable_show_proof_vc') is not None:
            self.enable_show_proof_vc = m.get('enable_show_proof_vc')
        if m.get('enable_show_auth_record') is not None:
            self.enable_show_auth_record = m.get('enable_show_auth_record')
        self.product_group_list = []
        if m.get('product_group_list') is not None:
            for k in m.get('product_group_list'):
                temp_model = ProductProviderGroup()
                self.product_group_list.append(temp_model.from_map(k))
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        self.agreement_list = []
        if m.get('agreement_list') is not None:
            for k in m.get('agreement_list'):
                temp_model = Agreement()
                self.agreement_list.append(temp_model.from_map(k))
        if m.get('background_color') is not None:
            self.background_color = m.get('background_color')
        if m.get('use_facial_recognition') is not None:
            self.use_facial_recognition = m.get('use_facial_recognition')
        if m.get('use_scope_list') is not None:
            self.use_scope_list = m.get('use_scope_list')
        if m.get('inner_success_callback_url') is not None:
            self.inner_success_callback_url = m.get('inner_success_callback_url')
        if m.get('outside_success_callback_url') is not None:
            self.outside_success_callback_url = m.get('outside_success_callback_url')
        if m.get('public_key') is not None:
            self.public_key = m.get('public_key')
        if m.get('start_auth_url') is not None:
            self.start_auth_url = m.get('start_auth_url')
        return self


class UpdateAuthConfigResponse(TeaModel):
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


class UploadAuthAgreementRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_type: str = None,
        auth_enterprise_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件类型
        self.file_type = file_type
        # 被授权方企业信用代码
        self.auth_enterprise_code = auth_enterprise_code

    def validate(self):
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.auth_enterprise_code, 'auth_enterprise_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.auth_enterprise_code is not None:
            result['auth_enterprise_code'] = self.auth_enterprise_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('auth_enterprise_code') is not None:
            self.auth_enterprise_code = m.get('auth_enterprise_code')
        return self


class UploadAuthAgreementResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        access_id: str = None,
        policy: str = None,
        signature: str = None,
        dir: str = None,
        host: str = None,
        expire: str = None,
        callback: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 访问id
        self.access_id = access_id
        # 策略
        self.policy = policy
        # 签名
        self.signature = signature
        # 目录
        self.dir = dir
        # 主机
        self.host = host
        # 过期时间
        self.expire = expire
        # 回调地址
        self.callback = callback

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
        if self.access_id is not None:
            result['access_id'] = self.access_id
        if self.policy is not None:
            result['policy'] = self.policy
        if self.signature is not None:
            result['signature'] = self.signature
        if self.dir is not None:
            result['dir'] = self.dir
        if self.host is not None:
            result['host'] = self.host
        if self.expire is not None:
            result['expire'] = self.expire
        if self.callback is not None:
            result['callback'] = self.callback
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('access_id') is not None:
            self.access_id = m.get('access_id')
        if m.get('policy') is not None:
            self.policy = m.get('policy')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        if m.get('dir') is not None:
            self.dir = m.get('dir')
        if m.get('host') is not None:
            self.host = m.get('host')
        if m.get('expire') is not None:
            self.expire = m.get('expire')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        return self


class UploadAuthPictureRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_type: str = None,
        auth_enterprise_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 文件类型
        self.file_type = file_type
        # 被授权方企业信用代码
        self.auth_enterprise_code = auth_enterprise_code

    def validate(self):
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.auth_enterprise_code, 'auth_enterprise_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.auth_enterprise_code is not None:
            result['auth_enterprise_code'] = self.auth_enterprise_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('auth_enterprise_code') is not None:
            self.auth_enterprise_code = m.get('auth_enterprise_code')
        return self


class UploadAuthPictureResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        access_id: str = None,
        policy: str = None,
        signature: str = None,
        dir: str = None,
        host: str = None,
        expire: str = None,
        callback: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 访问id
        self.access_id = access_id
        # 策略
        self.policy = policy
        # 签名
        self.signature = signature
        # 目录
        self.dir = dir
        # 主机
        self.host = host
        # 过期时间
        self.expire = expire
        # 回调地址
        self.callback = callback

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
        if self.access_id is not None:
            result['access_id'] = self.access_id
        if self.policy is not None:
            result['policy'] = self.policy
        if self.signature is not None:
            result['signature'] = self.signature
        if self.dir is not None:
            result['dir'] = self.dir
        if self.host is not None:
            result['host'] = self.host
        if self.expire is not None:
            result['expire'] = self.expire
        if self.callback is not None:
            result['callback'] = self.callback
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('access_id') is not None:
            self.access_id = m.get('access_id')
        if m.get('policy') is not None:
            self.policy = m.get('policy')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        if m.get('dir') is not None:
            self.dir = m.get('dir')
        if m.get('host') is not None:
            self.host = m.get('host')
        if m.get('expire') is not None:
            self.expire = m.get('expire')
        if m.get('callback') is not None:
            self.callback = m.get('callback')
        return self


class ListAuthContentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        return self


class ListAuthContentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data_list: List[AuthContent] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权内容列表
        self.data_list = data_list

    def validate(self):
        if self.data_list:
            for k in self.data_list:
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
        result['data_list'] = []
        if self.data_list is not None:
            for k in self.data_list:
                result['data_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data_list = []
        if m.get('data_list') is not None:
            for k in m.get('data_list'):
                temp_model = AuthContent()
                self.data_list.append(temp_model.from_map(k))
        return self


class ListAuthConfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        source_service_node_id: str = None,
        source_tenant_id: str = None,
        target_name: str = None,
        auth_app_name: str = None,
        auth_content_code_list: List[str] = None,
        product_identity_id_list: List[str] = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据源可信空间id
        self.source_service_node_id = source_service_node_id
        # 数据源租户id
        self.source_tenant_id = source_tenant_id
        # 客户名称
        self.target_name = target_name
        # 业务应用名称
        self.auth_app_name = auth_app_name
        # 授权内容code列表
        self.auth_content_code_list = auth_content_code_list
        # 国标产品标识码列表
        self.product_identity_id_list = product_identity_id_list
        # 页码
        self.page_num = page_num
        # 每页数量
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.source_service_node_id, 'source_service_node_id')
        self.validate_required(self.source_tenant_id, 'source_tenant_id')
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.source_service_node_id is not None:
            result['source_service_node_id'] = self.source_service_node_id
        if self.source_tenant_id is not None:
            result['source_tenant_id'] = self.source_tenant_id
        if self.target_name is not None:
            result['target_name'] = self.target_name
        if self.auth_app_name is not None:
            result['auth_app_name'] = self.auth_app_name
        if self.auth_content_code_list is not None:
            result['auth_content_code_list'] = self.auth_content_code_list
        if self.product_identity_id_list is not None:
            result['product_identity_id_list'] = self.product_identity_id_list
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('source_service_node_id') is not None:
            self.source_service_node_id = m.get('source_service_node_id')
        if m.get('source_tenant_id') is not None:
            self.source_tenant_id = m.get('source_tenant_id')
        if m.get('target_name') is not None:
            self.target_name = m.get('target_name')
        if m.get('auth_app_name') is not None:
            self.auth_app_name = m.get('auth_app_name')
        if m.get('auth_content_code_list') is not None:
            self.auth_content_code_list = m.get('auth_content_code_list')
        if m.get('product_identity_id_list') is not None:
            self.product_identity_id_list = m.get('product_identity_id_list')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListAuthConfigResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        count: int = None,
        total_pages: int = None,
        data_list: List[AuthConfigListResponse] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总条数
        self.count = count
        # 总页数
        self.total_pages = total_pages
        # 列表记录
        self.data_list = data_list

    def validate(self):
        if self.data_list:
            for k in self.data_list:
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
        if self.count is not None:
            result['count'] = self.count
        if self.total_pages is not None:
            result['total_pages'] = self.total_pages
        result['data_list'] = []
        if self.data_list is not None:
            for k in self.data_list:
                result['data_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('count') is not None:
            self.count = m.get('count')
        if m.get('total_pages') is not None:
            self.total_pages = m.get('total_pages')
        self.data_list = []
        if m.get('data_list') is not None:
            for k in m.get('data_list'):
                temp_model = AuthConfigListResponse()
                self.data_list.append(temp_model.from_map(k))
        return self


class UpdateAuthStatusRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        source_service_node_id: str = None,
        source_tenant_id: str = None,
        auth_enterprise_code: str = None,
        scene_code: str = None,
        auth_status: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据源可信空间id
        self.source_service_node_id = source_service_node_id
        # 数据源租户id
        self.source_tenant_id = source_tenant_id
        # 被授权方企业信用代码
        self.auth_enterprise_code = auth_enterprise_code
        # 场景码
        self.scene_code = scene_code
        # 授权状态
        self.auth_status = auth_status

    def validate(self):
        self.validate_required(self.source_service_node_id, 'source_service_node_id')
        self.validate_required(self.source_tenant_id, 'source_tenant_id')
        self.validate_required(self.auth_enterprise_code, 'auth_enterprise_code')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.auth_status, 'auth_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.source_service_node_id is not None:
            result['source_service_node_id'] = self.source_service_node_id
        if self.source_tenant_id is not None:
            result['source_tenant_id'] = self.source_tenant_id
        if self.auth_enterprise_code is not None:
            result['auth_enterprise_code'] = self.auth_enterprise_code
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.auth_status is not None:
            result['auth_status'] = self.auth_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('source_service_node_id') is not None:
            self.source_service_node_id = m.get('source_service_node_id')
        if m.get('source_tenant_id') is not None:
            self.source_tenant_id = m.get('source_tenant_id')
        if m.get('auth_enterprise_code') is not None:
            self.auth_enterprise_code = m.get('auth_enterprise_code')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('auth_status') is not None:
            self.auth_status = m.get('auth_status')
        return self


class UpdateAuthStatusResponse(TeaModel):
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


class DetailAuthConfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        source_service_node_id: str = None,
        source_tenant_id: str = None,
        scene_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据源可信空间id
        self.source_service_node_id = source_service_node_id
        # 数据源租户id
        self.source_tenant_id = source_tenant_id
        # 场景码
        self.scene_code = scene_code

    def validate(self):
        self.validate_required(self.source_service_node_id, 'source_service_node_id')
        self.validate_required(self.source_tenant_id, 'source_tenant_id')
        self.validate_required(self.scene_code, 'scene_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.source_service_node_id is not None:
            result['source_service_node_id'] = self.source_service_node_id
        if self.source_tenant_id is not None:
            result['source_tenant_id'] = self.source_tenant_id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('source_service_node_id') is not None:
            self.source_service_node_id = m.get('source_service_node_id')
        if m.get('source_tenant_id') is not None:
            self.source_tenant_id = m.get('source_tenant_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        return self


class DetailAuthConfigResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        auth_status: bool = None,
        scene_code: str = None,
        start_auth_url: str = None,
        source_space_id: str = None,
        public_key: str = None,
        enterprise_code: str = None,
        background_color: str = None,
        target_name: str = None,
        auth_app_name: str = None,
        have_authed_count: int = None,
        enterprise_logo: str = None,
        cancel_auth_count: int = None,
        enterprise_logo_url: str = None,
        auth_purpose: str = None,
        auth_desc: str = None,
        auth_type: str = None,
        user_type: str = None,
        use_scope_list: List[str] = None,
        auth_content_list: List[AuthContent] = None,
        agreement_list: List[Agreement] = None,
        use_facial_recognition: bool = None,
        enable_show_proof_vc: bool = None,
        enable_show_auth_record: bool = None,
        inner_success_callback_url: str = None,
        outside_success_callback_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权状态
        self.auth_status = auth_status
        # 场景码
        self.scene_code = scene_code
        # 发起授权页面的url链接
        self.start_auth_url = start_auth_url
        # 数据源连接器空间id
        self.source_space_id = source_space_id
        # 公钥
        self.public_key = public_key
        # 被授权方企业信用代码
        self.enterprise_code = enterprise_code
        # 主题颜色
        self.background_color = background_color
        # 接入方企业名称
        self.target_name = target_name
        # 被授权应用名称
        self.auth_app_name = auth_app_name
        # 已授权数量
        self.have_authed_count = have_authed_count
        # 公司logo
        self.enterprise_logo = enterprise_logo
        # 已取消授权数量
        self.cancel_auth_count = cancel_auth_count
        # 公司logo访问链接
        self.enterprise_logo_url = enterprise_logo_url
        # 用途说明
        self.auth_purpose = auth_purpose
        # 场景描述
        self.auth_desc = auth_desc
        # 授权类型
        self.auth_type = auth_type
        # 用户类型
        self.user_type = user_type
        # 页面使用范围列表
        self.use_scope_list = use_scope_list
        # 授权内容列表
        self.auth_content_list = auth_content_list
        # 协议列表
        self.agreement_list = agreement_list
        # 是否使用人脸识别
        self.use_facial_recognition = use_facial_recognition
        # C端是否显示凭证数据
        self.enable_show_proof_vc = enable_show_proof_vc
        # C端是否显示授权记录
        self.enable_show_auth_record = enable_show_auth_record
        # 授权成功端内跳转地址
        self.inner_success_callback_url = inner_success_callback_url
        # 授权成功端外跳转地址
        self.outside_success_callback_url = outside_success_callback_url

    def validate(self):
        if self.auth_content_list:
            for k in self.auth_content_list:
                if k:
                    k.validate()
        if self.agreement_list:
            for k in self.agreement_list:
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
        if self.auth_status is not None:
            result['auth_status'] = self.auth_status
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.start_auth_url is not None:
            result['start_auth_url'] = self.start_auth_url
        if self.source_space_id is not None:
            result['source_space_id'] = self.source_space_id
        if self.public_key is not None:
            result['public_key'] = self.public_key
        if self.enterprise_code is not None:
            result['enterprise_code'] = self.enterprise_code
        if self.background_color is not None:
            result['background_color'] = self.background_color
        if self.target_name is not None:
            result['target_name'] = self.target_name
        if self.auth_app_name is not None:
            result['auth_app_name'] = self.auth_app_name
        if self.have_authed_count is not None:
            result['have_authed_count'] = self.have_authed_count
        if self.enterprise_logo is not None:
            result['enterprise_logo'] = self.enterprise_logo
        if self.cancel_auth_count is not None:
            result['cancel_auth_count'] = self.cancel_auth_count
        if self.enterprise_logo_url is not None:
            result['enterprise_logo_url'] = self.enterprise_logo_url
        if self.auth_purpose is not None:
            result['auth_purpose'] = self.auth_purpose
        if self.auth_desc is not None:
            result['auth_desc'] = self.auth_desc
        if self.auth_type is not None:
            result['auth_type'] = self.auth_type
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.use_scope_list is not None:
            result['use_scope_list'] = self.use_scope_list
        result['auth_content_list'] = []
        if self.auth_content_list is not None:
            for k in self.auth_content_list:
                result['auth_content_list'].append(k.to_map() if k else None)
        result['agreement_list'] = []
        if self.agreement_list is not None:
            for k in self.agreement_list:
                result['agreement_list'].append(k.to_map() if k else None)
        if self.use_facial_recognition is not None:
            result['use_facial_recognition'] = self.use_facial_recognition
        if self.enable_show_proof_vc is not None:
            result['enable_show_proof_vc'] = self.enable_show_proof_vc
        if self.enable_show_auth_record is not None:
            result['enable_show_auth_record'] = self.enable_show_auth_record
        if self.inner_success_callback_url is not None:
            result['inner_success_callback_url'] = self.inner_success_callback_url
        if self.outside_success_callback_url is not None:
            result['outside_success_callback_url'] = self.outside_success_callback_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('auth_status') is not None:
            self.auth_status = m.get('auth_status')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('start_auth_url') is not None:
            self.start_auth_url = m.get('start_auth_url')
        if m.get('source_space_id') is not None:
            self.source_space_id = m.get('source_space_id')
        if m.get('public_key') is not None:
            self.public_key = m.get('public_key')
        if m.get('enterprise_code') is not None:
            self.enterprise_code = m.get('enterprise_code')
        if m.get('background_color') is not None:
            self.background_color = m.get('background_color')
        if m.get('target_name') is not None:
            self.target_name = m.get('target_name')
        if m.get('auth_app_name') is not None:
            self.auth_app_name = m.get('auth_app_name')
        if m.get('have_authed_count') is not None:
            self.have_authed_count = m.get('have_authed_count')
        if m.get('enterprise_logo') is not None:
            self.enterprise_logo = m.get('enterprise_logo')
        if m.get('cancel_auth_count') is not None:
            self.cancel_auth_count = m.get('cancel_auth_count')
        if m.get('enterprise_logo_url') is not None:
            self.enterprise_logo_url = m.get('enterprise_logo_url')
        if m.get('auth_purpose') is not None:
            self.auth_purpose = m.get('auth_purpose')
        if m.get('auth_desc') is not None:
            self.auth_desc = m.get('auth_desc')
        if m.get('auth_type') is not None:
            self.auth_type = m.get('auth_type')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('use_scope_list') is not None:
            self.use_scope_list = m.get('use_scope_list')
        self.auth_content_list = []
        if m.get('auth_content_list') is not None:
            for k in m.get('auth_content_list'):
                temp_model = AuthContent()
                self.auth_content_list.append(temp_model.from_map(k))
        self.agreement_list = []
        if m.get('agreement_list') is not None:
            for k in m.get('agreement_list'):
                temp_model = Agreement()
                self.agreement_list.append(temp_model.from_map(k))
        if m.get('use_facial_recognition') is not None:
            self.use_facial_recognition = m.get('use_facial_recognition')
        if m.get('enable_show_proof_vc') is not None:
            self.enable_show_proof_vc = m.get('enable_show_proof_vc')
        if m.get('enable_show_auth_record') is not None:
            self.enable_show_auth_record = m.get('enable_show_auth_record')
        if m.get('inner_success_callback_url') is not None:
            self.inner_success_callback_url = m.get('inner_success_callback_url')
        if m.get('outside_success_callback_url') is not None:
            self.outside_success_callback_url = m.get('outside_success_callback_url')
        return self


class ListAuthRecordRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        source_service_node_id: str = None,
        source_tenant_id: str = None,
        scene_code: str = None,
        user_info: str = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据源可信空间id
        self.source_service_node_id = source_service_node_id
        # 数据源租户id
        self.source_tenant_id = source_tenant_id
        # 场景码
        self.scene_code = scene_code
        # 用户信息
        self.user_info = user_info
        # 页码
        self.page_num = page_num
        # 分页大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.source_service_node_id, 'source_service_node_id')
        self.validate_required(self.source_tenant_id, 'source_tenant_id')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.source_service_node_id is not None:
            result['source_service_node_id'] = self.source_service_node_id
        if self.source_tenant_id is not None:
            result['source_tenant_id'] = self.source_tenant_id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.user_info is not None:
            result['user_info'] = self.user_info
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('source_service_node_id') is not None:
            self.source_service_node_id = m.get('source_service_node_id')
        if m.get('source_tenant_id') is not None:
            self.source_tenant_id = m.get('source_tenant_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('user_info') is not None:
            self.user_info = m.get('user_info')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListAuthRecordResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        count: int = None,
        total_pages: int = None,
        data_list: List[AuthRecordListResponse] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总条数
        self.count = count
        # 总页数
        self.total_pages = total_pages
        # 列表记录
        self.data_list = data_list

    def validate(self):
        if self.data_list:
            for k in self.data_list:
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
        if self.count is not None:
            result['count'] = self.count
        if self.total_pages is not None:
            result['total_pages'] = self.total_pages
        result['data_list'] = []
        if self.data_list is not None:
            for k in self.data_list:
                result['data_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('count') is not None:
            self.count = m.get('count')
        if m.get('total_pages') is not None:
            self.total_pages = m.get('total_pages')
        self.data_list = []
        if m.get('data_list') is not None:
            for k in m.get('data_list'):
                temp_model = AuthRecordListResponse()
                self.data_list.append(temp_model.from_map(k))
        return self


class DownloadAuthAgreementRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        request_id: str = None,
        agreement_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求id
        self.request_id = request_id
        # 协议code
        self.agreement_code = agreement_code

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.agreement_code, 'agreement_code')

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
        if self.agreement_code is not None:
            result['agreement_code'] = self.agreement_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('agreement_code') is not None:
            self.agreement_code = m.get('agreement_code')
        return self


class DownloadAuthAgreementResponse(TeaModel):
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
        # 下载链接
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


class VerifyDataAuthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        user_type: str = None,
        scene_code: str = None,
        source_space_id: str = None,
        enterprise_code: str = None,
        authorized_token: str = None,
        product_identity_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户id
        self.user_id = user_id
        # 用户表示类型
        self.user_type = user_type
        # 场景码
        self.scene_code = scene_code
        # 数据源连接器空间id
        self.source_space_id = source_space_id
        # 企业信用代码
        self.enterprise_code = enterprise_code
        # 授权token
        self.authorized_token = authorized_token
        # 国标产品标识码
        self.product_identity_id = product_identity_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.source_space_id, 'source_space_id')
        self.validate_required(self.enterprise_code, 'enterprise_code')
        self.validate_required(self.authorized_token, 'authorized_token')
        self.validate_required(self.product_identity_id, 'product_identity_id')

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
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.source_space_id is not None:
            result['source_space_id'] = self.source_space_id
        if self.enterprise_code is not None:
            result['enterprise_code'] = self.enterprise_code
        if self.authorized_token is not None:
            result['authorized_token'] = self.authorized_token
        if self.product_identity_id is not None:
            result['product_identity_id'] = self.product_identity_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('source_space_id') is not None:
            self.source_space_id = m.get('source_space_id')
        if m.get('enterprise_code') is not None:
            self.enterprise_code = m.get('enterprise_code')
        if m.get('authorized_token') is not None:
            self.authorized_token = m.get('authorized_token')
        if m.get('product_identity_id') is not None:
            self.product_identity_id = m.get('product_identity_id')
        return self


class VerifyDataAuthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        verify_result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 核验结果
        self.verify_result = verify_result

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
        if self.verify_result is not None:
            result['verify_result'] = self.verify_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('verify_result') is not None:
            self.verify_result = m.get('verify_result')
        return self


class QueryProductParamRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        source_space_id: str = None,
        enterprise_code: str = None,
        product_identity_id: str = None,
        scene_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 空间id
        self.source_space_id = source_space_id
        # 企业代码
        self.enterprise_code = enterprise_code
        # 国标产品标识码
        self.product_identity_id = product_identity_id
        # 场景码
        self.scene_code = scene_code

    def validate(self):
        self.validate_required(self.source_space_id, 'source_space_id')
        self.validate_required(self.enterprise_code, 'enterprise_code')
        self.validate_required(self.product_identity_id, 'product_identity_id')
        self.validate_required(self.scene_code, 'scene_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.source_space_id is not None:
            result['source_space_id'] = self.source_space_id
        if self.enterprise_code is not None:
            result['enterprise_code'] = self.enterprise_code
        if self.product_identity_id is not None:
            result['product_identity_id'] = self.product_identity_id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('source_space_id') is not None:
            self.source_space_id = m.get('source_space_id')
        if m.get('enterprise_code') is not None:
            self.enterprise_code = m.get('enterprise_code')
        if m.get('product_identity_id') is not None:
            self.product_identity_id = m.get('product_identity_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        return self


class QueryProductParamResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        user_type: str = None,
        param_info_list: List[ProductParamInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用户表示类型
        self.user_type = user_type
        # 产品参数信息列表
        self.param_info_list = param_info_list

    def validate(self):
        if self.param_info_list:
            for k in self.param_info_list:
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
        if self.user_type is not None:
            result['user_type'] = self.user_type
        result['param_info_list'] = []
        if self.param_info_list is not None:
            for k in self.param_info_list:
                result['param_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        self.param_info_list = []
        if m.get('param_info_list') is not None:
            for k in m.get('param_info_list'):
                temp_model = ProductParamInfo()
                self.param_info_list.append(temp_model.from_map(k))
        return self


class CallbackAuthDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        authorized_token: str = None,
        data_detail: str = None,
        product_identity_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权token
        self.authorized_token = authorized_token
        # 数据详情 JSONObject
        self.data_detail = data_detail
        # 国标产品标识码
        self.product_identity_id = product_identity_id

    def validate(self):
        self.validate_required(self.authorized_token, 'authorized_token')
        self.validate_required(self.data_detail, 'data_detail')
        self.validate_required(self.product_identity_id, 'product_identity_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.authorized_token is not None:
            result['authorized_token'] = self.authorized_token
        if self.data_detail is not None:
            result['data_detail'] = self.data_detail
        if self.product_identity_id is not None:
            result['product_identity_id'] = self.product_identity_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('authorized_token') is not None:
            self.authorized_token = m.get('authorized_token')
        if m.get('data_detail') is not None:
            self.data_detail = m.get('data_detail')
        if m.get('product_identity_id') is not None:
            self.product_identity_id = m.get('product_identity_id')
        return self


class CallbackAuthDataResponse(TeaModel):
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


class CallbackAuthRecordRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        alipay_user_id: str = None,
        scene_code: str = None,
        user_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 蚂蚁统一会员ID
        self.alipay_user_id = alipay_user_id
        # 授权场景码
        self.scene_code = scene_code
        # 授权的用户信息JSON字符串，根据场景码配置的用户类型传不同的JSON字符串，二要素传{"name":"张三","certNo":"1101111111"}，证件号类型传{"certNo":"1101111111"}
        self.user_info = user_info

    def validate(self):
        self.validate_required(self.alipay_user_id, 'alipay_user_id')
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.user_info, 'user_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.alipay_user_id is not None:
            result['alipay_user_id'] = self.alipay_user_id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.user_info is not None:
            result['user_info'] = self.user_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('alipay_user_id') is not None:
            self.alipay_user_id = m.get('alipay_user_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('user_info') is not None:
            self.user_info = m.get('user_info')
        return self


class CallbackAuthRecordResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        auth_token: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权token
        self.auth_token = auth_token

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
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        return self


class ListAuthAgreementRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        return self


class ListAuthAgreementResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        agreement_info_list: List[Agreement] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 默认的授权协议列表
        self.agreement_info_list = agreement_info_list

    def validate(self):
        if self.agreement_info_list:
            for k in self.agreement_info_list:
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
        result['agreement_info_list'] = []
        if self.agreement_info_list is not None:
            for k in self.agreement_info_list:
                result['agreement_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.agreement_info_list = []
        if m.get('agreement_info_list') is not None:
            for k in m.get('agreement_info_list'):
                temp_model = Agreement()
                self.agreement_info_list.append(temp_model.from_map(k))
        return self


class StartProductAuthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        source_space_id: str = None,
        enterprise_code: str = None,
        product_identity_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 空间id
        self.source_space_id = source_space_id
        # 企业代码
        self.enterprise_code = enterprise_code
        # 国标产品标识码
        self.product_identity_id = product_identity_id

    def validate(self):
        self.validate_required(self.source_space_id, 'source_space_id')
        self.validate_required(self.enterprise_code, 'enterprise_code')
        self.validate_required(self.product_identity_id, 'product_identity_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.source_space_id is not None:
            result['source_space_id'] = self.source_space_id
        if self.enterprise_code is not None:
            result['enterprise_code'] = self.enterprise_code
        if self.product_identity_id is not None:
            result['product_identity_id'] = self.product_identity_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('source_space_id') is not None:
            self.source_space_id = m.get('source_space_id')
        if m.get('enterprise_code') is not None:
            self.enterprise_code = m.get('enterprise_code')
        if m.get('product_identity_id') is not None:
            self.product_identity_id = m.get('product_identity_id')
        return self


class StartProductAuthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        need_auth: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否需要授权
        self.need_auth = need_auth

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
        if self.need_auth is not None:
            result['need_auth'] = self.need_auth
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('need_auth') is not None:
            self.need_auth = m.get('need_auth')
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


