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


