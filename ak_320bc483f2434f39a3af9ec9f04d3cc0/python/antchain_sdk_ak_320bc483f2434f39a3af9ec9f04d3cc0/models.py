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


class SignatoryInfo(TeaModel):
    def __init__(
        self,
        pos_page: str = None,
        pos_x: str = None,
        pos_y: str = None,
        width: str = None,
    ):
        # 页码信息 （骑缝签署页码为1-2这种，其余情况都是数字）
        self.pos_page = pos_page
        # x坐标
        self.pos_x = pos_x
        # y坐标
        self.pos_y = pos_y
        # 签署区宽 (默认为100)
        self.width = width

    def validate(self):
        self.validate_required(self.pos_page, 'pos_page')
        self.validate_required(self.pos_x, 'pos_x')
        self.validate_required(self.pos_y, 'pos_y')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pos_page is not None:
            result['pos_page'] = self.pos_page
        if self.pos_x is not None:
            result['pos_x'] = self.pos_x
        if self.pos_y is not None:
            result['pos_y'] = self.pos_y
        if self.width is not None:
            result['width'] = self.width
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pos_page') is not None:
            self.pos_page = m.get('pos_page')
        if m.get('pos_x') is not None:
            self.pos_x = m.get('pos_x')
        if m.get('pos_y') is not None:
            self.pos_y = m.get('pos_y')
        if m.get('width') is not None:
            self.width = m.get('width')
        return self


class SignUrlResp(TeaModel):
    def __init__(
        self,
        type: int = None,
        name: str = None,
        cert_no: str = None,
        url: str = None,
        short_url: str = None,
        sign_filed_id: str = None,
    ):
        # 0-企业 1-用户
        self.type = type
        # 企业名称或用户姓名
        self.name = name
        # 社会信用代码或身份证号
        self.cert_no = cert_no
        # 手动签署url（长链接）
        self.url = url
        # 手动签署url(端链接)
        self.short_url = short_url
        # 电子合同签署区id
        self.sign_filed_id = sign_filed_id

    def validate(self):
        self.validate_required(self.type, 'type')
        self.validate_required(self.name, 'name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.sign_filed_id, 'sign_filed_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.name is not None:
            result['name'] = self.name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.url is not None:
            result['url'] = self.url
        if self.short_url is not None:
            result['short_url'] = self.short_url
        if self.sign_filed_id is not None:
            result['sign_filed_id'] = self.sign_filed_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('short_url') is not None:
            self.short_url = m.get('short_url')
        if m.get('sign_filed_id') is not None:
            self.sign_filed_id = m.get('sign_filed_id')
        return self


class SignUserInfo(TeaModel):
    def __init__(
        self,
        id_number: str = None,
        name: str = None,
        sign_area_list: List[SignatoryInfo] = None,
    ):
        # 身份证号
        self.id_number = id_number
        # 姓名
        self.name = name
        # 签署区列表
        self.sign_area_list = sign_area_list

    def validate(self):
        self.validate_required(self.id_number, 'id_number')
        self.validate_required(self.name, 'name')
        self.validate_required(self.sign_area_list, 'sign_area_list')
        if self.sign_area_list:
            for k in self.sign_area_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id_number is not None:
            result['id_number'] = self.id_number
        if self.name is not None:
            result['name'] = self.name
        result['sign_area_list'] = []
        if self.sign_area_list is not None:
            for k in self.sign_area_list:
                result['sign_area_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id_number') is not None:
            self.id_number = m.get('id_number')
        if m.get('name') is not None:
            self.name = m.get('name')
        self.sign_area_list = []
        if m.get('sign_area_list') is not None:
            for k in m.get('sign_area_list'):
                temp_model = SignatoryInfo()
                self.sign_area_list.append(temp_model.from_map(k))
        return self


class ContractSignResponse(TeaModel):
    def __init__(
        self,
        flow_id: str = None,
        sign_url_list: List[SignUrlResp] = None,
    ):
        # 流程id
        self.flow_id = flow_id
        # 签署链接数组
        self.sign_url_list = sign_url_list

    def validate(self):
        self.validate_required(self.flow_id, 'flow_id')
        self.validate_required(self.sign_url_list, 'sign_url_list')
        if self.sign_url_list:
            for k in self.sign_url_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        result['sign_url_list'] = []
        if self.sign_url_list is not None:
            for k in self.sign_url_list:
                result['sign_url_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        self.sign_url_list = []
        if m.get('sign_url_list') is not None:
            for k in m.get('sign_url_list'):
                temp_model = SignUrlResp()
                self.sign_url_list.append(temp_model.from_map(k))
        return self


class SignEnterpriseInfo(TeaModel):
    def __init__(
        self,
        organization_name: str = None,
        uscc: str = None,
        name: str = None,
        id_number: str = None,
        sign_type: int = None,
        sign_area_list: List[SignatoryInfo] = None,
    ):
        # 公司名称
        self.organization_name = organization_name
        # 社会统一信用代码
        self.uscc = uscc
        # 法人姓名
        self.name = name
        # 法人身份证号码
        self.id_number = id_number
        # 签署模式0、自动签署1、手动签署（用户只能手动）
        # 
        self.sign_type = sign_type
        # 签署区列表
        self.sign_area_list = sign_area_list

    def validate(self):
        self.validate_required(self.organization_name, 'organization_name')
        self.validate_required(self.uscc, 'uscc')
        self.validate_required(self.name, 'name')
        self.validate_required(self.id_number, 'id_number')
        self.validate_required(self.sign_type, 'sign_type')
        self.validate_required(self.sign_area_list, 'sign_area_list')
        if self.sign_area_list:
            for k in self.sign_area_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.organization_name is not None:
            result['organization_name'] = self.organization_name
        if self.uscc is not None:
            result['uscc'] = self.uscc
        if self.name is not None:
            result['name'] = self.name
        if self.id_number is not None:
            result['id_number'] = self.id_number
        if self.sign_type is not None:
            result['sign_type'] = self.sign_type
        result['sign_area_list'] = []
        if self.sign_area_list is not None:
            for k in self.sign_area_list:
                result['sign_area_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('organization_name') is not None:
            self.organization_name = m.get('organization_name')
        if m.get('uscc') is not None:
            self.uscc = m.get('uscc')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('id_number') is not None:
            self.id_number = m.get('id_number')
        if m.get('sign_type') is not None:
            self.sign_type = m.get('sign_type')
        self.sign_area_list = []
        if m.get('sign_area_list') is not None:
            for k in m.get('sign_area_list'):
                temp_model = SignatoryInfo()
                self.sign_area_list.append(temp_model.from_map(k))
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


class SignAntsaasStaffingcContractSendRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        contract_file: str = None,
        contract_type: int = None,
        contract_name: str = None,
        contract_file_type: str = None,
        simple_form_fields: str = None,
        sign_platform: str = None,
        sign_user_list: List[SignUserInfo] = None,
        sign_enterprise_list: List[SignEnterpriseInfo] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 合同或模版文件
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 合同文件（base64格式）
        self.contract_file = contract_file
        # 合同类型（1合同文件 2合同模板）
        self.contract_type = contract_type
        # 合同名称
        self.contract_name = contract_name
        # 合同文件类型 （pdf、word）
        self.contract_file_type = contract_file_type
        # 合同模版参数，json格式，以key value格式存储，合同类型属于模板必填
        self.simple_form_fields = simple_form_fields
        # 签署平台（ALIPAY或H5）
        self.sign_platform = sign_platform
        # 合同用户信息列表
        self.sign_user_list = sign_user_list
        # 合同企业信息列表
        self.sign_enterprise_list = sign_enterprise_list

    def validate(self):
        self.validate_required(self.contract_file, 'contract_file')
        self.validate_required(self.contract_type, 'contract_type')
        self.validate_required(self.contract_name, 'contract_name')
        self.validate_required(self.contract_file_type, 'contract_file_type')
        self.validate_required(self.sign_platform, 'sign_platform')
        self.validate_required(self.sign_user_list, 'sign_user_list')
        if self.sign_user_list:
            for k in self.sign_user_list:
                if k:
                    k.validate()
        self.validate_required(self.sign_enterprise_list, 'sign_enterprise_list')
        if self.sign_enterprise_list:
            for k in self.sign_enterprise_list:
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
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.contract_file is not None:
            result['contract_file'] = self.contract_file
        if self.contract_type is not None:
            result['contract_type'] = self.contract_type
        if self.contract_name is not None:
            result['contract_name'] = self.contract_name
        if self.contract_file_type is not None:
            result['contract_file_type'] = self.contract_file_type
        if self.simple_form_fields is not None:
            result['simple_form_fields'] = self.simple_form_fields
        if self.sign_platform is not None:
            result['sign_platform'] = self.sign_platform
        result['sign_user_list'] = []
        if self.sign_user_list is not None:
            for k in self.sign_user_list:
                result['sign_user_list'].append(k.to_map() if k else None)
        result['sign_enterprise_list'] = []
        if self.sign_enterprise_list is not None:
            for k in self.sign_enterprise_list:
                result['sign_enterprise_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('contract_file') is not None:
            self.contract_file = m.get('contract_file')
        if m.get('contract_type') is not None:
            self.contract_type = m.get('contract_type')
        if m.get('contract_name') is not None:
            self.contract_name = m.get('contract_name')
        if m.get('contract_file_type') is not None:
            self.contract_file_type = m.get('contract_file_type')
        if m.get('simple_form_fields') is not None:
            self.simple_form_fields = m.get('simple_form_fields')
        if m.get('sign_platform') is not None:
            self.sign_platform = m.get('sign_platform')
        self.sign_user_list = []
        if m.get('sign_user_list') is not None:
            for k in m.get('sign_user_list'):
                temp_model = SignUserInfo()
                self.sign_user_list.append(temp_model.from_map(k))
        self.sign_enterprise_list = []
        if m.get('sign_enterprise_list') is not None:
            for k in m.get('sign_enterprise_list'):
                temp_model = SignEnterpriseInfo()
                self.sign_enterprise_list.append(temp_model.from_map(k))
        return self


class SignAntsaasStaffingcContractSendResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        response: ContractSignResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 发起签约返回结果
        self.response = response

    def validate(self):
        if self.response:
            self.response.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.response is not None:
            result['response'] = self.response.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('response') is not None:
            temp_model = ContractSignResponse()
            self.response = temp_model.from_map(m['response'])
        return self


class QueryAntsaasStaffingcContractSignRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        flow_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 流程id
        self.flow_id = flow_id

    def validate(self):
        self.validate_required(self.flow_id, 'flow_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        return self


class QueryAntsaasStaffingcContractSignResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        flow_id: str = None,
        contract_validity: int = None,
        flow_desc: str = None,
        flow_start_time: str = None,
        flow_end_time: str = None,
        flow_status: int = None,
        file_id: str = None,
        file_name: str = None,
        file_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 流程id
        self.flow_id = flow_id
        # 文件有效截止日期
        self.contract_validity = contract_validity
        # 流程描述
        self.flow_desc = flow_desc
        # 流程开始时间
        self.flow_start_time = flow_start_time
        # 流程结束时间
        self.flow_end_time = flow_end_time
        # 流程状态（0-草稿、1-签署中、2-完成、3-撤销、4-终止、5-过期、6-删除、7-拒签）
        self.flow_status = flow_status
        # 合同文件id
        self.file_id = file_id
        # 合同文件名称
        self.file_name = file_name
        # 合同文件下载地址（1小时内有效）
        self.file_url = file_url

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
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.contract_validity is not None:
            result['contract_validity'] = self.contract_validity
        if self.flow_desc is not None:
            result['flow_desc'] = self.flow_desc
        if self.flow_start_time is not None:
            result['flow_start_time'] = self.flow_start_time
        if self.flow_end_time is not None:
            result['flow_end_time'] = self.flow_end_time
        if self.flow_status is not None:
            result['flow_status'] = self.flow_status
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_url is not None:
            result['file_url'] = self.file_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('contract_validity') is not None:
            self.contract_validity = m.get('contract_validity')
        if m.get('flow_desc') is not None:
            self.flow_desc = m.get('flow_desc')
        if m.get('flow_start_time') is not None:
            self.flow_start_time = m.get('flow_start_time')
        if m.get('flow_end_time') is not None:
            self.flow_end_time = m.get('flow_end_time')
        if m.get('flow_status') is not None:
            self.flow_status = m.get('flow_status')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
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


