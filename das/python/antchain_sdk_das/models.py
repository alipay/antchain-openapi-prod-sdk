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


