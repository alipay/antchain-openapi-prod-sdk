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


class ContactInfo(TeaModel):
    def __init__(
        self,
        contact_name: str = None,
        contact_phone: str = None,
    ):
        # 联系人
        self.contact_name = contact_name
        # 联系电话
        self.contact_phone = contact_phone

    def validate(self):
        self.validate_required(self.contact_name, 'contact_name')
        self.validate_required(self.contact_phone, 'contact_phone')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.contact_name is not None:
            result['contact_name'] = self.contact_name
        if self.contact_phone is not None:
            result['contact_phone'] = self.contact_phone
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('contact_name') is not None:
            self.contact_name = m.get('contact_name')
        if m.get('contact_phone') is not None:
            self.contact_phone = m.get('contact_phone')
        return self


class CertificateData(TeaModel):
    def __init__(
        self,
        task_id: str = None,
        user_id: str = None,
        dci_code: str = None,
        certificate_url: str = None,
    ):
        # 任务ID
        self.task_id = task_id
        # 版权用户UID
        self.user_id = user_id
        # DCI码
        self.dci_code = dci_code
        # 证书下载的链接地址
        self.certificate_url = certificate_url

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.dci_code, 'dci_code')
        self.validate_required(self.certificate_url, 'certificate_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.dci_code is not None:
            result['dci_code'] = self.dci_code
        if self.certificate_url is not None:
            result['certificate_url'] = self.certificate_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('dci_code') is not None:
            self.dci_code = m.get('dci_code')
        if m.get('certificate_url') is not None:
            self.certificate_url = m.get('certificate_url')
        return self


class InvoiceInfo(TeaModel):
    def __init__(
        self,
        invoice_type: str = None,
        invoice_header: str = None,
        taxpayer_number: str = None,
        registered_address: str = None,
        registered_tel: str = None,
        open_account_tel: str = None,
        open_account_bank: str = None,
        bank_account: str = None,
    ):
        # 发票类型 InvoiceTypeEnum目前只支持普票
        # (NORMAL,ELC,普票)
        # (SPECIAL,VAT,专票)
        self.invoice_type = invoice_type
        # 发票抬头（著作权人之一）
        self.invoice_header = invoice_header
        # 纳税人识别号（机构必填）
        self.taxpayer_number = taxpayer_number
        # 注册地址（专票必填）
        self.registered_address = registered_address
        # 注册电话（专票必填）
        self.registered_tel = registered_tel
        # 开户电话（专票必填）
        self.open_account_tel = open_account_tel
        # 开户银行（专票必填）
        self.open_account_bank = open_account_bank
        # 银行账号（专票必填）
        self.bank_account = bank_account

    def validate(self):
        self.validate_required(self.invoice_type, 'invoice_type')
        self.validate_required(self.invoice_header, 'invoice_header')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.invoice_type is not None:
            result['invoice_type'] = self.invoice_type
        if self.invoice_header is not None:
            result['invoice_header'] = self.invoice_header
        if self.taxpayer_number is not None:
            result['taxpayer_number'] = self.taxpayer_number
        if self.registered_address is not None:
            result['registered_address'] = self.registered_address
        if self.registered_tel is not None:
            result['registered_tel'] = self.registered_tel
        if self.open_account_tel is not None:
            result['open_account_tel'] = self.open_account_tel
        if self.open_account_bank is not None:
            result['open_account_bank'] = self.open_account_bank
        if self.bank_account is not None:
            result['bank_account'] = self.bank_account
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('invoice_type') is not None:
            self.invoice_type = m.get('invoice_type')
        if m.get('invoice_header') is not None:
            self.invoice_header = m.get('invoice_header')
        if m.get('taxpayer_number') is not None:
            self.taxpayer_number = m.get('taxpayer_number')
        if m.get('registered_address') is not None:
            self.registered_address = m.get('registered_address')
        if m.get('registered_tel') is not None:
            self.registered_tel = m.get('registered_tel')
        if m.get('open_account_tel') is not None:
            self.open_account_tel = m.get('open_account_tel')
        if m.get('open_account_bank') is not None:
            self.open_account_bank = m.get('open_account_bank')
        if m.get('bank_account') is not None:
            self.bank_account = m.get('bank_account')
        return self


class OrderItem(TeaModel):
    def __init__(
        self,
        item_id: str = None,
        item_type: str = None,
    ):
        # 项目ID
        self.item_id = item_id
        # 项目类型（数登申请）
        self.item_type = item_type

    def validate(self):
        self.validate_required(self.item_id, 'item_id')
        self.validate_required(self.item_type, 'item_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.item_id is not None:
            result['item_id'] = self.item_id
        if self.item_type is not None:
            result['item_type'] = self.item_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('item_id') is not None:
            self.item_id = m.get('item_id')
        if m.get('item_type') is not None:
            self.item_type = m.get('item_type')
        return self


class AdditionalFileInfo(TeaModel):
    def __init__(
        self,
        content_summary_file_id: str = None,
        ownership_file_ids: List[str] = None,
        portrait_auth_file_id: str = None,
        others_work_auth_file_id: str = None,
        other_file_id_list: List[str] = None,
        font_authorize_file_id: str = None,
    ):
        # 内容梗概文件fileId
        self.content_summary_file_id = content_summary_file_id
        # 权利归属证明文件
        self.ownership_file_ids = ownership_file_ids
        # 肖像权授权文件fileId
        self.portrait_auth_file_id = portrait_auth_file_id
        # 他人作品授权文件fileId
        self.others_work_auth_file_id = others_work_auth_file_id
        # 其他文件fileId列表
        self.other_file_id_list = other_file_id_list
        # 商用授权字体授权文件fileId
        self.font_authorize_file_id = font_authorize_file_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.content_summary_file_id is not None:
            result['content_summary_file_id'] = self.content_summary_file_id
        if self.ownership_file_ids is not None:
            result['ownership_file_ids'] = self.ownership_file_ids
        if self.portrait_auth_file_id is not None:
            result['portrait_auth_file_id'] = self.portrait_auth_file_id
        if self.others_work_auth_file_id is not None:
            result['others_work_auth_file_id'] = self.others_work_auth_file_id
        if self.other_file_id_list is not None:
            result['other_file_id_list'] = self.other_file_id_list
        if self.font_authorize_file_id is not None:
            result['font_authorize_file_id'] = self.font_authorize_file_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('content_summary_file_id') is not None:
            self.content_summary_file_id = m.get('content_summary_file_id')
        if m.get('ownership_file_ids') is not None:
            self.ownership_file_ids = m.get('ownership_file_ids')
        if m.get('portrait_auth_file_id') is not None:
            self.portrait_auth_file_id = m.get('portrait_auth_file_id')
        if m.get('others_work_auth_file_id') is not None:
            self.others_work_auth_file_id = m.get('others_work_auth_file_id')
        if m.get('other_file_id_list') is not None:
            self.other_file_id_list = m.get('other_file_id_list')
        if m.get('font_authorize_file_id') is not None:
            self.font_authorize_file_id = m.get('font_authorize_file_id')
        return self


class DciExplanationInfo(TeaModel):
    def __init__(
        self,
        creation_purpose: str = None,
        creation_process: str = None,
        originality: str = None,
        font_copyright: str = None,
        font_types: List[str] = None,
    ):
        # 创作目的，描述作品创作的目的
        self.creation_purpose = creation_purpose
        # 创作过程，具体的创作过程
        self.creation_process = creation_process
        # 阐述作品的独创性
        self.originality = originality
        # 创作过程涉及到字体使用相关版权说明
        self.font_copyright = font_copyright
        # 创作过程涉及到字体使用相关版权说明
        # 
        self.font_types = font_types

    def validate(self):
        self.validate_required(self.creation_purpose, 'creation_purpose')
        self.validate_required(self.creation_process, 'creation_process')
        self.validate_required(self.originality, 'originality')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.creation_purpose is not None:
            result['creation_purpose'] = self.creation_purpose
        if self.creation_process is not None:
            result['creation_process'] = self.creation_process
        if self.originality is not None:
            result['originality'] = self.originality
        if self.font_copyright is not None:
            result['font_copyright'] = self.font_copyright
        if self.font_types is not None:
            result['font_types'] = self.font_types
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('creation_purpose') is not None:
            self.creation_purpose = m.get('creation_purpose')
        if m.get('creation_process') is not None:
            self.creation_process = m.get('creation_process')
        if m.get('originality') is not None:
            self.originality = m.get('originality')
        if m.get('font_copyright') is not None:
            self.font_copyright = m.get('font_copyright')
        if m.get('font_types') is not None:
            self.font_types = m.get('font_types')
        return self


class CreateBlockchainBccrDciRegistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_content_id: str = None,
        explanation_info: DciExplanationInfo = None,
        additional_file_info: AdditionalFileInfo = None,
        invoice_info: InvoiceInfo = None,
        client_token: str = None,
        creation_statement: str = None,
        ancillary_evidence_path_list: List[str] = None,
        applyer_contact_info: ContactInfo = None,
        platform_contact_info: ContactInfo = None,
        right_scope_desc: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # DC123456
        self.dci_content_id = dci_content_id
        # 数登申请声明
        self.explanation_info = explanation_info
        # 补充文件相关信息
        self.additional_file_info = additional_file_info
        # 发票信息--当前支持普票
        self.invoice_info = invoice_info
        # 幂等字段
        self.client_token = client_token
        # 废弃待删除
        self.creation_statement = creation_statement
        # 废弃待删除
        self.ancillary_evidence_path_list = ancillary_evidence_path_list
        # 申领人联系信息
        self.applyer_contact_info = applyer_contact_info
        # 代理人联系信息
        self.platform_contact_info = platform_contact_info
        # 权利描述
        self.right_scope_desc = right_scope_desc

    def validate(self):
        self.validate_required(self.dci_content_id, 'dci_content_id')
        self.validate_required(self.explanation_info, 'explanation_info')
        if self.explanation_info:
            self.explanation_info.validate()
        if self.additional_file_info:
            self.additional_file_info.validate()
        if self.invoice_info:
            self.invoice_info.validate()
        self.validate_required(self.client_token, 'client_token')
        if self.applyer_contact_info:
            self.applyer_contact_info.validate()
        if self.platform_contact_info:
            self.platform_contact_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        if self.explanation_info is not None:
            result['explanation_info'] = self.explanation_info.to_map()
        if self.additional_file_info is not None:
            result['additional_file_info'] = self.additional_file_info.to_map()
        if self.invoice_info is not None:
            result['invoice_info'] = self.invoice_info.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.creation_statement is not None:
            result['creation_statement'] = self.creation_statement
        if self.ancillary_evidence_path_list is not None:
            result['ancillary_evidence_path_list'] = self.ancillary_evidence_path_list
        if self.applyer_contact_info is not None:
            result['applyer_contact_info'] = self.applyer_contact_info.to_map()
        if self.platform_contact_info is not None:
            result['platform_contact_info'] = self.platform_contact_info.to_map()
        if self.right_scope_desc is not None:
            result['right_scope_desc'] = self.right_scope_desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        if m.get('explanation_info') is not None:
            temp_model = DciExplanationInfo()
            self.explanation_info = temp_model.from_map(m['explanation_info'])
        if m.get('additional_file_info') is not None:
            temp_model = AdditionalFileInfo()
            self.additional_file_info = temp_model.from_map(m['additional_file_info'])
        if m.get('invoice_info') is not None:
            temp_model = InvoiceInfo()
            self.invoice_info = temp_model.from_map(m['invoice_info'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('creation_statement') is not None:
            self.creation_statement = m.get('creation_statement')
        if m.get('ancillary_evidence_path_list') is not None:
            self.ancillary_evidence_path_list = m.get('ancillary_evidence_path_list')
        if m.get('applyer_contact_info') is not None:
            temp_model = ContactInfo()
            self.applyer_contact_info = temp_model.from_map(m['applyer_contact_info'])
        if m.get('platform_contact_info') is not None:
            temp_model = ContactInfo()
            self.platform_contact_info = temp_model.from_map(m['platform_contact_info'])
        if m.get('right_scope_desc') is not None:
            self.right_scope_desc = m.get('right_scope_desc')
        return self


class CreateBlockchainBccrDciRegistrationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        digital_register_id: str = None,
        error_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数登申请id
        self.digital_register_id = digital_register_id
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
        if self.digital_register_id is not None:
            result['digital_register_id'] = self.digital_register_id
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
        if m.get('digital_register_id') is not None:
            self.digital_register_id = m.get('digital_register_id')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class QueryBlockchainBccrDciRegistrationsubmitRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dci_content_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # dci内容id
        self.dci_content_id = dci_content_id

    def validate(self):
        self.validate_required(self.dci_content_id, 'dci_content_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        return self


class QueryBlockchainBccrDciRegistrationsubmitResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数登提交状态
        self.content_status = content_status

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
        if self.content_status is not None:
            result['content_status'] = self.content_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content_status') is not None:
            self.content_status = m.get('content_status')
        return self


class QueryBlockchainBccrDciRegistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        digital_register_id: str = None,
        dci_content_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数登申请id
        self.digital_register_id = digital_register_id
        # dci申领id
        self.dci_content_id = dci_content_id

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
        if self.digital_register_id is not None:
            result['digital_register_id'] = self.digital_register_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('digital_register_id') is not None:
            self.digital_register_id = m.get('digital_register_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        return self


class QueryBlockchainBccrDciRegistrationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        content_status: str = None,
        register_cert_tx_hash: str = None,
        register_cert_block_height: str = None,
        register_cert_tsr: str = None,
        register_cert_png_file_id: str = None,
        register_sample_file_id: str = None,
        register_sample_png_file_id: str = None,
        register_download_times_left: int = None,
        error_reason: str = None,
        error_reason_cn: str = None,
        invoice_file_id_list: List[str] = None,
        apply_register_time: str = None,
        reg_number: str = None,
        digital_register_id: str = None,
        dci_content_id: str = None,
        digital_register_status: str = None,
        digital_register_apply_time: str = None,
        digital_register_completion_time: str = None,
        digital_register_cert_png_url: str = None,
        digital_register_sample_png_url: str = None,
        download_times_left: int = None,
        invoice_url_list: List[str] = None,
        fail_detail: str = None,
        amend_type: str = None,
        apply_form_url: str = None,
        flow_number: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 废弃待删除
        self.content_status = content_status
        # 废弃待删除
        self.register_cert_tx_hash = register_cert_tx_hash
        # 废弃待删除
        self.register_cert_block_height = register_cert_block_height
        # 废弃待删除
        self.register_cert_tsr = register_cert_tsr
        # 废弃待删除
        self.register_cert_png_file_id = register_cert_png_file_id
        # 废弃待删除
        self.register_sample_file_id = register_sample_file_id
        # 废弃待删除
        self.register_sample_png_file_id = register_sample_png_file_id
        # 废弃待删除
        self.register_download_times_left = register_download_times_left
        # 废弃待删除
        self.error_reason = error_reason
        # 废弃待删除
        self.error_reason_cn = error_reason_cn
        # 废弃待删除
        self.invoice_file_id_list = invoice_file_id_list
        # 废弃待删除
        self.apply_register_time = apply_register_time
        # 数登登记号
        self.reg_number = reg_number
        # 数登id
        self.digital_register_id = digital_register_id
        # dci申领id
        self.dci_content_id = dci_content_id
        # 数登状态
        self.digital_register_status = digital_register_status
        # 数登申请时间
        self.digital_register_apply_time = digital_register_apply_time
        # 数登完成时间
        self.digital_register_completion_time = digital_register_completion_time
        # 数登证书预览图url
        self.digital_register_cert_png_url = digital_register_cert_png_url
        # 样本证书预览图url
        self.digital_register_sample_png_url = digital_register_sample_png_url
        # 证书本月剩余下载次数
        self.download_times_left = download_times_left
        # 发票下载链接list
        self.invoice_url_list = invoice_url_list
        # 数登失败详情
        self.fail_detail = fail_detail
        # 补正类型
        self.amend_type = amend_type
        # 用户申请表url
        self.apply_form_url = apply_form_url
        # 数登流水号
        self.flow_number = flow_number

    def validate(self):
        if self.apply_register_time is not None:
            self.validate_pattern(self.apply_register_time, 'apply_register_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.digital_register_apply_time is not None:
            self.validate_pattern(self.digital_register_apply_time, 'digital_register_apply_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.digital_register_completion_time is not None:
            self.validate_pattern(self.digital_register_completion_time, 'digital_register_completion_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

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
        if self.content_status is not None:
            result['content_status'] = self.content_status
        if self.register_cert_tx_hash is not None:
            result['register_cert_tx_hash'] = self.register_cert_tx_hash
        if self.register_cert_block_height is not None:
            result['register_cert_block_height'] = self.register_cert_block_height
        if self.register_cert_tsr is not None:
            result['register_cert_tsr'] = self.register_cert_tsr
        if self.register_cert_png_file_id is not None:
            result['register_cert_png_file_id'] = self.register_cert_png_file_id
        if self.register_sample_file_id is not None:
            result['register_sample_file_id'] = self.register_sample_file_id
        if self.register_sample_png_file_id is not None:
            result['register_sample_png_file_id'] = self.register_sample_png_file_id
        if self.register_download_times_left is not None:
            result['register_download_times_left'] = self.register_download_times_left
        if self.error_reason is not None:
            result['error_reason'] = self.error_reason
        if self.error_reason_cn is not None:
            result['error_reason_cn'] = self.error_reason_cn
        if self.invoice_file_id_list is not None:
            result['invoice_file_id_list'] = self.invoice_file_id_list
        if self.apply_register_time is not None:
            result['apply_register_time'] = self.apply_register_time
        if self.reg_number is not None:
            result['reg_number'] = self.reg_number
        if self.digital_register_id is not None:
            result['digital_register_id'] = self.digital_register_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        if self.digital_register_status is not None:
            result['digital_register_status'] = self.digital_register_status
        if self.digital_register_apply_time is not None:
            result['digital_register_apply_time'] = self.digital_register_apply_time
        if self.digital_register_completion_time is not None:
            result['digital_register_completion_time'] = self.digital_register_completion_time
        if self.digital_register_cert_png_url is not None:
            result['digital_register_cert_png_url'] = self.digital_register_cert_png_url
        if self.digital_register_sample_png_url is not None:
            result['digital_register_sample_png_url'] = self.digital_register_sample_png_url
        if self.download_times_left is not None:
            result['download_times_left'] = self.download_times_left
        if self.invoice_url_list is not None:
            result['invoice_url_list'] = self.invoice_url_list
        if self.fail_detail is not None:
            result['fail_detail'] = self.fail_detail
        if self.amend_type is not None:
            result['amend_type'] = self.amend_type
        if self.apply_form_url is not None:
            result['apply_form_url'] = self.apply_form_url
        if self.flow_number is not None:
            result['flow_number'] = self.flow_number
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('content_status') is not None:
            self.content_status = m.get('content_status')
        if m.get('register_cert_tx_hash') is not None:
            self.register_cert_tx_hash = m.get('register_cert_tx_hash')
        if m.get('register_cert_block_height') is not None:
            self.register_cert_block_height = m.get('register_cert_block_height')
        if m.get('register_cert_tsr') is not None:
            self.register_cert_tsr = m.get('register_cert_tsr')
        if m.get('register_cert_png_file_id') is not None:
            self.register_cert_png_file_id = m.get('register_cert_png_file_id')
        if m.get('register_sample_file_id') is not None:
            self.register_sample_file_id = m.get('register_sample_file_id')
        if m.get('register_sample_png_file_id') is not None:
            self.register_sample_png_file_id = m.get('register_sample_png_file_id')
        if m.get('register_download_times_left') is not None:
            self.register_download_times_left = m.get('register_download_times_left')
        if m.get('error_reason') is not None:
            self.error_reason = m.get('error_reason')
        if m.get('error_reason_cn') is not None:
            self.error_reason_cn = m.get('error_reason_cn')
        if m.get('invoice_file_id_list') is not None:
            self.invoice_file_id_list = m.get('invoice_file_id_list')
        if m.get('apply_register_time') is not None:
            self.apply_register_time = m.get('apply_register_time')
        if m.get('reg_number') is not None:
            self.reg_number = m.get('reg_number')
        if m.get('digital_register_id') is not None:
            self.digital_register_id = m.get('digital_register_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        if m.get('digital_register_status') is not None:
            self.digital_register_status = m.get('digital_register_status')
        if m.get('digital_register_apply_time') is not None:
            self.digital_register_apply_time = m.get('digital_register_apply_time')
        if m.get('digital_register_completion_time') is not None:
            self.digital_register_completion_time = m.get('digital_register_completion_time')
        if m.get('digital_register_cert_png_url') is not None:
            self.digital_register_cert_png_url = m.get('digital_register_cert_png_url')
        if m.get('digital_register_sample_png_url') is not None:
            self.digital_register_sample_png_url = m.get('digital_register_sample_png_url')
        if m.get('download_times_left') is not None:
            self.download_times_left = m.get('download_times_left')
        if m.get('invoice_url_list') is not None:
            self.invoice_url_list = m.get('invoice_url_list')
        if m.get('fail_detail') is not None:
            self.fail_detail = m.get('fail_detail')
        if m.get('amend_type') is not None:
            self.amend_type = m.get('amend_type')
        if m.get('apply_form_url') is not None:
            self.apply_form_url = m.get('apply_form_url')
        if m.get('flow_number') is not None:
            self.flow_number = m.get('flow_number')
        return self


class GetBlockchainBccrDciRegistrationcertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        digital_register_id: str = None,
        client_token: str = None,
        dci_content_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数登申请id
        self.digital_register_id = digital_register_id
        # 幂等字段
        self.client_token = client_token
        # 废弃待删除
        self.dci_content_id = dci_content_id

    def validate(self):
        self.validate_required(self.digital_register_id, 'digital_register_id')
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.digital_register_id is not None:
            result['digital_register_id'] = self.digital_register_id
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('digital_register_id') is not None:
            self.digital_register_id = m.get('digital_register_id')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        return self


class GetBlockchainBccrDciRegistrationcertResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        cert_status: str = None,
        certificate_url: str = None,
        error_reason: str = None,
        error_reason_cn: str = None,
        digital_register_status: str = None,
        download_url: str = None,
        download_times_left: int = None,
        fail_detail: str = None,
        digital_register_cert_url: str = None,
        digital_register_sample_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 废弃待删除
        self.cert_status = cert_status
        # 废弃待删除
        self.certificate_url = certificate_url
        # 废弃待删除
        self.error_reason = error_reason
        # 废弃待删除
        self.error_reason_cn = error_reason_cn
        # 数登状态
        self.digital_register_status = digital_register_status
        # 数登证书&样本证书压缩包url
        self.download_url = download_url
        # 剩余下载次数
        self.download_times_left = download_times_left
        # 失败详情
        self.fail_detail = fail_detail
        # 数登证书下载链接
        self.digital_register_cert_url = digital_register_cert_url
        # 数登样本证书下载链接
        self.digital_register_sample_url = digital_register_sample_url

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
        if self.cert_status is not None:
            result['cert_status'] = self.cert_status
        if self.certificate_url is not None:
            result['certificate_url'] = self.certificate_url
        if self.error_reason is not None:
            result['error_reason'] = self.error_reason
        if self.error_reason_cn is not None:
            result['error_reason_cn'] = self.error_reason_cn
        if self.digital_register_status is not None:
            result['digital_register_status'] = self.digital_register_status
        if self.download_url is not None:
            result['download_url'] = self.download_url
        if self.download_times_left is not None:
            result['download_times_left'] = self.download_times_left
        if self.fail_detail is not None:
            result['fail_detail'] = self.fail_detail
        if self.digital_register_cert_url is not None:
            result['digital_register_cert_url'] = self.digital_register_cert_url
        if self.digital_register_sample_url is not None:
            result['digital_register_sample_url'] = self.digital_register_sample_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('cert_status') is not None:
            self.cert_status = m.get('cert_status')
        if m.get('certificate_url') is not None:
            self.certificate_url = m.get('certificate_url')
        if m.get('error_reason') is not None:
            self.error_reason = m.get('error_reason')
        if m.get('error_reason_cn') is not None:
            self.error_reason_cn = m.get('error_reason_cn')
        if m.get('digital_register_status') is not None:
            self.digital_register_status = m.get('digital_register_status')
        if m.get('download_url') is not None:
            self.download_url = m.get('download_url')
        if m.get('download_times_left') is not None:
            self.download_times_left = m.get('download_times_left')
        if m.get('fail_detail') is not None:
            self.fail_detail = m.get('fail_detail')
        if m.get('digital_register_cert_url') is not None:
            self.digital_register_cert_url = m.get('digital_register_cert_url')
        if m.get('digital_register_sample_url') is not None:
            self.digital_register_sample_url = m.get('digital_register_sample_url')
        return self


class CreateBlockchainBccrDciRegistrationcertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
        user_id: str = None,
        dci_code: str = None,
        reg_number: str = None,
        qr_code_url: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id
        # 版权用户ID
        self.user_id = user_id
        # DCI码
        self.dci_code = dci_code
        # 登记号
        self.reg_number = reg_number
        # 二维码
        self.qr_code_url = qr_code_url
        # 客户端token
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.dci_code, 'dci_code')
        self.validate_required(self.reg_number, 'reg_number')
        self.validate_required(self.qr_code_url, 'qr_code_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.dci_code is not None:
            result['dci_code'] = self.dci_code
        if self.reg_number is not None:
            result['reg_number'] = self.reg_number
        if self.qr_code_url is not None:
            result['qr_code_url'] = self.qr_code_url
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('dci_code') is not None:
            self.dci_code = m.get('dci_code')
        if m.get('reg_number') is not None:
            self.reg_number = m.get('reg_number')
        if m.get('qr_code_url') is not None:
            self.qr_code_url = m.get('qr_code_url')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class CreateBlockchainBccrDciRegistrationcertResponse(TeaModel):
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


class QueryBlockchainBccrDciRegistrationcertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.task_id, 'task_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryBlockchainBccrDciRegistrationcertResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        certificate_data: CertificateData = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 证书信息
        self.certificate_data = certificate_data

    def validate(self):
        if self.certificate_data:
            self.certificate_data.validate()

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
        if self.certificate_data is not None:
            result['certificate_data'] = self.certificate_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('certificate_data') is not None:
            temp_model = CertificateData()
            self.certificate_data = temp_model.from_map(m['certificate_data'])
        return self


class GetBlockchainBccrDciPayurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        digital_register_id: str = None,
        client_token: str = None,
        dci_user_id: str = None,
        dci_content_id: str = None,
        pay_ment: str = None,
        invoice_info: InvoiceInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数登申请id
        self.digital_register_id = digital_register_id
        # 幂等字段
        self.client_token = client_token
        # 废弃待删除
        self.dci_user_id = dci_user_id
        # 废弃待删除
        self.dci_content_id = dci_content_id
        # 废弃待删除
        self.pay_ment = pay_ment
        # 废弃待删除
        self.invoice_info = invoice_info

    def validate(self):
        self.validate_required(self.digital_register_id, 'digital_register_id')
        self.validate_required(self.client_token, 'client_token')
        if self.invoice_info:
            self.invoice_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.digital_register_id is not None:
            result['digital_register_id'] = self.digital_register_id
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        if self.pay_ment is not None:
            result['pay_ment'] = self.pay_ment
        if self.invoice_info is not None:
            result['invoice_info'] = self.invoice_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('digital_register_id') is not None:
            self.digital_register_id = m.get('digital_register_id')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        if m.get('pay_ment') is not None:
            self.pay_ment = m.get('pay_ment')
        if m.get('invoice_info') is not None:
            temp_model = InvoiceInfo()
            self.invoice_info = temp_model.from_map(m['invoice_info'])
        return self


class GetBlockchainBccrDciPayurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pay_url: str = None,
        error_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 支付链接
        self.pay_url = pay_url
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
        if self.pay_url is not None:
            result['pay_url'] = self.pay_url
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
        if m.get('pay_url') is not None:
            self.pay_url = m.get('pay_url')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class QueryBlockchainBccrDciPayRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        digital_register_id: str = None,
        dci_user_id: str = None,
        dci_content_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数登申请id
        self.digital_register_id = digital_register_id
        # 废弃待删除
        self.dci_user_id = dci_user_id
        # 废弃待删除
        self.dci_content_id = dci_content_id

    def validate(self):
        self.validate_required(self.digital_register_id, 'digital_register_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.digital_register_id is not None:
            result['digital_register_id'] = self.digital_register_id
        if self.dci_user_id is not None:
            result['dci_user_id'] = self.dci_user_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('digital_register_id') is not None:
            self.digital_register_id = m.get('digital_register_id')
        if m.get('dci_user_id') is not None:
            self.dci_user_id = m.get('dci_user_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        return self


class QueryBlockchainBccrDciPayResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pay_status: str = None,
        pay_state: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 支付状态
        # （INIT 用户点击支付，待获取链接；GET_PAY_URL_FAIL 获取支付链接失败；PAY_FAIL 支付失败；TIMEOUT 支付超时；PAY_SUCCESS 支付成功；PAYING 支付中；PAY_EXCEPTION	支付异常，待重试）
        self.pay_status = pay_status
        # 废弃待删除
        self.pay_state = pay_state

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
        if self.pay_status is not None:
            result['pay_status'] = self.pay_status
        if self.pay_state is not None:
            result['pay_state'] = self.pay_state
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pay_status') is not None:
            self.pay_status = m.get('pay_status')
        if m.get('pay_state') is not None:
            self.pay_state = m.get('pay_state')
        return self


class CallbackBlockchainBccrDciPayresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
        app_id: str = None,
        order_id: str = None,
        pay_ment: str = None,
        money: str = None,
        result_content: str = None,
        code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 与中心约定的任务ID，同一个作品可能会发起多次登记
        self.task_id = task_id
        # 平台Id
        self.app_id = app_id
        # 订单ID
        self.order_id = order_id
        # 支付方式 (ALIPAY,0,支付宝)
        self.pay_ment = pay_ment
        # 订单金额
        self.money = money
        # 结果描述，如：支付成功
        self.result_content = result_content
        # 状态，2001代表支付成功
        self.code = code

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.app_id, 'app_id')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.pay_ment, 'pay_ment')
        self.validate_required(self.money, 'money')
        self.validate_required(self.result_content, 'result_content')
        self.validate_required(self.code, 'code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.app_id is not None:
            result['app_id'] = self.app_id
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.pay_ment is not None:
            result['pay_ment'] = self.pay_ment
        if self.money is not None:
            result['money'] = self.money
        if self.result_content is not None:
            result['result_content'] = self.result_content
        if self.code is not None:
            result['code'] = self.code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('app_id') is not None:
            self.app_id = m.get('app_id')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('pay_ment') is not None:
            self.pay_ment = m.get('pay_ment')
        if m.get('money') is not None:
            self.money = m.get('money')
        if m.get('result_content') is not None:
            self.result_content = m.get('result_content')
        if m.get('code') is not None:
            self.code = m.get('code')
        return self


class CallbackBlockchainBccrDciPayresultResponse(TeaModel):
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


class RefuseBlockchainBccrDciRegistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        task_id: str = None,
        code: str = None,
        fail_detail: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务ID
        self.task_id = task_id
        # 复审失败原因
        self.code = code
        # 失败详情
        self.fail_detail = fail_detail
        # 幂等字段
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.task_id, 'task_id')
        self.validate_required(self.code, 'code')
        self.validate_required(self.fail_detail, 'fail_detail')
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        if self.code is not None:
            result['code'] = self.code
        if self.fail_detail is not None:
            result['fail_detail'] = self.fail_detail
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('fail_detail') is not None:
            self.fail_detail = m.get('fail_detail')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class RefuseBlockchainBccrDciRegistrationResponse(TeaModel):
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


class RetryBlockchainBccrDciRegistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        digital_register_id: str = None,
        dci_content_id: str = None,
        explanation_info: DciExplanationInfo = None,
        additional_file_info: AdditionalFileInfo = None,
        client_token: str = None,
        right_scope_desc: str = None,
        applyer_contact_info: ContactInfo = None,
        platform_contact_info: ContactInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 待补正数登申请id
        self.digital_register_id = digital_register_id
        # 替换dci申领id
        self.dci_content_id = dci_content_id
        # 数登申请声明
        self.explanation_info = explanation_info
        # 补充文件信息
        self.additional_file_info = additional_file_info
        # 幂等字段
        self.client_token = client_token
        # 权利描述
        self.right_scope_desc = right_scope_desc
        # 申领人联系信息
        self.applyer_contact_info = applyer_contact_info
        # 代理人联系信息
        self.platform_contact_info = platform_contact_info

    def validate(self):
        self.validate_required(self.digital_register_id, 'digital_register_id')
        self.validate_required(self.explanation_info, 'explanation_info')
        if self.explanation_info:
            self.explanation_info.validate()
        if self.additional_file_info:
            self.additional_file_info.validate()
        self.validate_required(self.client_token, 'client_token')
        if self.applyer_contact_info:
            self.applyer_contact_info.validate()
        if self.platform_contact_info:
            self.platform_contact_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.digital_register_id is not None:
            result['digital_register_id'] = self.digital_register_id
        if self.dci_content_id is not None:
            result['dci_content_id'] = self.dci_content_id
        if self.explanation_info is not None:
            result['explanation_info'] = self.explanation_info.to_map()
        if self.additional_file_info is not None:
            result['additional_file_info'] = self.additional_file_info.to_map()
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.right_scope_desc is not None:
            result['right_scope_desc'] = self.right_scope_desc
        if self.applyer_contact_info is not None:
            result['applyer_contact_info'] = self.applyer_contact_info.to_map()
        if self.platform_contact_info is not None:
            result['platform_contact_info'] = self.platform_contact_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('digital_register_id') is not None:
            self.digital_register_id = m.get('digital_register_id')
        if m.get('dci_content_id') is not None:
            self.dci_content_id = m.get('dci_content_id')
        if m.get('explanation_info') is not None:
            temp_model = DciExplanationInfo()
            self.explanation_info = temp_model.from_map(m['explanation_info'])
        if m.get('additional_file_info') is not None:
            temp_model = AdditionalFileInfo()
            self.additional_file_info = temp_model.from_map(m['additional_file_info'])
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('right_scope_desc') is not None:
            self.right_scope_desc = m.get('right_scope_desc')
        if m.get('applyer_contact_info') is not None:
            temp_model = ContactInfo()
            self.applyer_contact_info = temp_model.from_map(m['applyer_contact_info'])
        if m.get('platform_contact_info') is not None:
            temp_model = ContactInfo()
            self.platform_contact_info = temp_model.from_map(m['platform_contact_info'])
        return self


class RetryBlockchainBccrDciRegistrationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        error_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
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
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class CloseBlockchainBccrDciRegistrationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        digital_register_id: str = None,
        name: str = None,
        mobile_no: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数登id
        self.digital_register_id = digital_register_id
        # 退费人名称
        self.name = name
        # 联系手机号
        self.mobile_no = mobile_no
        # 幂等字段
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.digital_register_id, 'digital_register_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.mobile_no, 'mobile_no')
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.digital_register_id is not None:
            result['digital_register_id'] = self.digital_register_id
        if self.name is not None:
            result['name'] = self.name
        if self.mobile_no is not None:
            result['mobile_no'] = self.mobile_no
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('digital_register_id') is not None:
            self.digital_register_id = m.get('digital_register_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('mobile_no') is not None:
            self.mobile_no = m.get('mobile_no')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class CloseBlockchainBccrDciRegistrationResponse(TeaModel):
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


class CreateBlockchainBccrOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        client_token: str = None,
        request_id: str = None,
        invoice_info: InvoiceInfo = None,
        order_item: List[OrderItem] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 幂等字段
        self.client_token = client_token
        # 幂等id【标废弃， 幂等id已client_token为准】
        self.request_id = request_id
        # 发票信息
        self.invoice_info = invoice_info
        # 订单明细列表
        self.order_item = order_item

    def validate(self):
        self.validate_required(self.client_token, 'client_token')
        self.validate_required(self.invoice_info, 'invoice_info')
        if self.invoice_info:
            self.invoice_info.validate()
        self.validate_required(self.order_item, 'order_item')
        if self.order_item:
            for k in self.order_item:
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
        if self.client_token is not None:
            result['client_token'] = self.client_token
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.invoice_info is not None:
            result['invoice_info'] = self.invoice_info.to_map()
        result['order_item'] = []
        if self.order_item is not None:
            for k in self.order_item:
                result['order_item'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('invoice_info') is not None:
            temp_model = InvoiceInfo()
            self.invoice_info = temp_model.from_map(m['invoice_info'])
        self.order_item = []
        if m.get('order_item') is not None:
            for k in m.get('order_item'):
                temp_model = OrderItem()
                self.order_item.append(temp_model.from_map(k))
        return self


class CreateBlockchainBccrOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        error_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 用于查询支付链接
        self.order_id = order_id
        # 创建订单失败
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
        if self.order_id is not None:
            result['order_id'] = self.order_id
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
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class QueryBlockchainBccrOrderPayurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单id
        self.order_id = order_id

    def validate(self):
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


class QueryBlockchainBccrOrderPayurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pay_url: str = None,
        error_msg: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 支付链接
        self.pay_url = pay_url
        # 查询支付链接失败
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
        if self.pay_url is not None:
            result['pay_url'] = self.pay_url
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
        if m.get('pay_url') is not None:
            self.pay_url = m.get('pay_url')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class FinishBlockchainBccrDciRegistrationcertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        reg_number: str = None,
        certificate_url: str = None,
        sample_url: str = None,
        client_token: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 登记号
        self.reg_number = reg_number
        # 数登证书地址
        self.certificate_url = certificate_url
        # 数登样本地址
        self.sample_url = sample_url
        # 客户端幂等token
        self.client_token = client_token

    def validate(self):
        self.validate_required(self.reg_number, 'reg_number')
        self.validate_required(self.client_token, 'client_token')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.reg_number is not None:
            result['reg_number'] = self.reg_number
        if self.certificate_url is not None:
            result['certificate_url'] = self.certificate_url
        if self.sample_url is not None:
            result['sample_url'] = self.sample_url
        if self.client_token is not None:
            result['client_token'] = self.client_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('reg_number') is not None:
            self.reg_number = m.get('reg_number')
        if m.get('certificate_url') is not None:
            self.certificate_url = m.get('certificate_url')
        if m.get('sample_url') is not None:
            self.sample_url = m.get('sample_url')
        if m.get('client_token') is not None:
            self.client_token = m.get('client_token')
        return self


class FinishBlockchainBccrDciRegistrationcertResponse(TeaModel):
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


