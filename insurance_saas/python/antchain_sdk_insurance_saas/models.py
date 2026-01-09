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


class FileNode(TeaModel):
    def __init__(
        self,
        url: str = None,
        name: str = None,
    ):
        # 可访问的文件链接
        self.url = url
        # 文件名
        self.name = name

    def validate(self):
        self.validate_required(self.url, 'url')
        self.validate_required(self.name, 'name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.url is not None:
            result['url'] = self.url
        if self.name is not None:
            result['name'] = self.name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('name') is not None:
            self.name = m.get('name')
        return self


class Insured(TeaModel):
    def __init__(
        self,
        insured_name: str = None,
        insured_card_type: str = None,
        insured_card_code: str = None,
        insured_contact_info: str = None,
    ):
        # 被保人名称
        self.insured_name = insured_name
        # 被保人证件类型
        self.insured_card_type = insured_card_type
        # 被保人证件号码
        self.insured_card_code = insured_card_code
        # 被保人联系方式
        self.insured_contact_info = insured_contact_info

    def validate(self):
        self.validate_required(self.insured_name, 'insured_name')
        if self.insured_name is not None:
            self.validate_max_length(self.insured_name, 'insured_name', 32)
        self.validate_required(self.insured_card_type, 'insured_card_type')
        if self.insured_card_type is not None:
            self.validate_max_length(self.insured_card_type, 'insured_card_type', 32)
        self.validate_required(self.insured_card_code, 'insured_card_code')
        if self.insured_card_code is not None:
            self.validate_max_length(self.insured_card_code, 'insured_card_code', 32)
        if self.insured_contact_info is not None:
            self.validate_max_length(self.insured_contact_info, 'insured_contact_info', 128)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.insured_name is not None:
            result['insured_name'] = self.insured_name
        if self.insured_card_type is not None:
            result['insured_card_type'] = self.insured_card_type
        if self.insured_card_code is not None:
            result['insured_card_code'] = self.insured_card_code
        if self.insured_contact_info is not None:
            result['insured_contact_info'] = self.insured_contact_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('insured_name') is not None:
            self.insured_name = m.get('insured_name')
        if m.get('insured_card_type') is not None:
            self.insured_card_type = m.get('insured_card_type')
        if m.get('insured_card_code') is not None:
            self.insured_card_code = m.get('insured_card_code')
        if m.get('insured_contact_info') is not None:
            self.insured_contact_info = m.get('insured_contact_info')
        return self


class Applicant(TeaModel):
    def __init__(
        self,
        applicant_name: str = None,
        applicant_card_type: str = None,
        applicant_card_code: str = None,
        applicant_contact_info: str = None,
    ):
        # 投保人名称
        self.applicant_name = applicant_name
        # 投保人证件类型
        self.applicant_card_type = applicant_card_type
        # 投保人证件号码
        self.applicant_card_code = applicant_card_code
        # 投保人联系方式
        self.applicant_contact_info = applicant_contact_info

    def validate(self):
        self.validate_required(self.applicant_name, 'applicant_name')
        if self.applicant_name is not None:
            self.validate_max_length(self.applicant_name, 'applicant_name', 32)
        self.validate_required(self.applicant_card_type, 'applicant_card_type')
        if self.applicant_card_type is not None:
            self.validate_max_length(self.applicant_card_type, 'applicant_card_type', 32)
        self.validate_required(self.applicant_card_code, 'applicant_card_code')
        if self.applicant_card_code is not None:
            self.validate_max_length(self.applicant_card_code, 'applicant_card_code', 32)
        if self.applicant_contact_info is not None:
            self.validate_max_length(self.applicant_contact_info, 'applicant_contact_info', 128)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.applicant_name is not None:
            result['applicant_name'] = self.applicant_name
        if self.applicant_card_type is not None:
            result['applicant_card_type'] = self.applicant_card_type
        if self.applicant_card_code is not None:
            result['applicant_card_code'] = self.applicant_card_code
        if self.applicant_contact_info is not None:
            result['applicant_contact_info'] = self.applicant_contact_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('applicant_name') is not None:
            self.applicant_name = m.get('applicant_name')
        if m.get('applicant_card_type') is not None:
            self.applicant_card_type = m.get('applicant_card_type')
        if m.get('applicant_card_code') is not None:
            self.applicant_card_code = m.get('applicant_card_code')
        if m.get('applicant_contact_info') is not None:
            self.applicant_contact_info = m.get('applicant_contact_info')
        return self


class EntrustGuaranteeProduct(TeaModel):
    def __init__(
        self,
        guarantee_expiry_date: int = None,
        guarantee_effective_date: int = None,
        waiting_period_dead_line: int = None,
        policy_no: str = None,
        guarantee_product_code: str = None,
        insurance_product_code: str = None,
        insurance_product_name: str = None,
    ):
        # 保障失效时间
        self.guarantee_expiry_date = guarantee_expiry_date
        # 保障生效时间
        self.guarantee_effective_date = guarantee_effective_date
        # 保险等待期结束时间
        self.waiting_period_dead_line = waiting_period_dead_line
        # 保单号
        self.policy_no = policy_no
        # 平台定义产品码值
        self.guarantee_product_code = guarantee_product_code
        # 保险公司的产品code
        self.insurance_product_code = insurance_product_code
        # 保险公司的产品描述
        self.insurance_product_name = insurance_product_name

    def validate(self):
        self.validate_required(self.guarantee_expiry_date, 'guarantee_expiry_date')
        self.validate_required(self.guarantee_effective_date, 'guarantee_effective_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.guarantee_expiry_date is not None:
            result['guarantee_expiry_date'] = self.guarantee_expiry_date
        if self.guarantee_effective_date is not None:
            result['guarantee_effective_date'] = self.guarantee_effective_date
        if self.waiting_period_dead_line is not None:
            result['waiting_period_dead_line'] = self.waiting_period_dead_line
        if self.policy_no is not None:
            result['policy_no'] = self.policy_no
        if self.guarantee_product_code is not None:
            result['guarantee_product_code'] = self.guarantee_product_code
        if self.insurance_product_code is not None:
            result['insurance_product_code'] = self.insurance_product_code
        if self.insurance_product_name is not None:
            result['insurance_product_name'] = self.insurance_product_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('guarantee_expiry_date') is not None:
            self.guarantee_expiry_date = m.get('guarantee_expiry_date')
        if m.get('guarantee_effective_date') is not None:
            self.guarantee_effective_date = m.get('guarantee_effective_date')
        if m.get('waiting_period_dead_line') is not None:
            self.waiting_period_dead_line = m.get('waiting_period_dead_line')
        if m.get('policy_no') is not None:
            self.policy_no = m.get('policy_no')
        if m.get('guarantee_product_code') is not None:
            self.guarantee_product_code = m.get('guarantee_product_code')
        if m.get('insurance_product_code') is not None:
            self.insurance_product_code = m.get('insurance_product_code')
        if m.get('insurance_product_name') is not None:
            self.insurance_product_name = m.get('insurance_product_name')
        return self


class QueryInquiryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        inquiry_no_inner: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 询价id
        self.inquiry_no_inner = inquiry_no_inner

    def validate(self):
        self.validate_required(self.inquiry_no_inner, 'inquiry_no_inner')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.inquiry_no_inner is not None:
            result['inquiry_no_inner'] = self.inquiry_no_inner
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('inquiry_no_inner') is not None:
            self.inquiry_no_inner = m.get('inquiry_no_inner')
        return self


class QueryInquiryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 报价内容
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class SubmitInquiryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        inquiry_no: str = None,
        inquire_platform: str = None,
        single_insurance_amount: str = None,
        total_insurance_amount: str = None,
        material_list: str = None,
        object_list: str = None,
        insurance_company_no: str = None,
        trustworthy_value_insurance_type_code: str = None,
        insurance_project_code: str = None,
        insurance_options_code: str = None,
        inquirer: str = None,
        applicant: str = None,
        insured_list: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # inquiryNo
        self.inquiry_no = inquiry_no
        # 询价平台
        self.inquire_platform = inquire_platform
        # 单次保额
        self.single_insurance_amount = single_insurance_amount
        # 总保额
        self.total_insurance_amount = total_insurance_amount
        # 询价基础材料列表
        self.material_list = material_list
        # 询价标的列表
        self.object_list = object_list
        # 保司编号
        self.insurance_company_no = insurance_company_no
        # 保险产品编码
        self.trustworthy_value_insurance_type_code = trustworthy_value_insurance_type_code
        # 保司项目代码
        self.insurance_project_code = insurance_project_code
        # 保司方案代码
        self.insurance_options_code = insurance_options_code
        # 询价人(名称、证件号、证件类型)
        self.inquirer = inquirer
        # 投保人(可空)
        self.applicant = applicant
        # 被保人列表(可空)
        self.insured_list = insured_list

    def validate(self):
        self.validate_required(self.inquiry_no, 'inquiry_no')
        self.validate_required(self.inquire_platform, 'inquire_platform')
        self.validate_required(self.single_insurance_amount, 'single_insurance_amount')
        self.validate_required(self.total_insurance_amount, 'total_insurance_amount')
        self.validate_required(self.insurance_company_no, 'insurance_company_no')
        self.validate_required(self.trustworthy_value_insurance_type_code, 'trustworthy_value_insurance_type_code')
        self.validate_required(self.insurance_project_code, 'insurance_project_code')
        self.validate_required(self.insurance_options_code, 'insurance_options_code')
        self.validate_required(self.inquirer, 'inquirer')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.inquiry_no is not None:
            result['inquiry_no'] = self.inquiry_no
        if self.inquire_platform is not None:
            result['inquire_platform'] = self.inquire_platform
        if self.single_insurance_amount is not None:
            result['single_insurance_amount'] = self.single_insurance_amount
        if self.total_insurance_amount is not None:
            result['total_insurance_amount'] = self.total_insurance_amount
        if self.material_list is not None:
            result['material_list'] = self.material_list
        if self.object_list is not None:
            result['object_list'] = self.object_list
        if self.insurance_company_no is not None:
            result['insurance_company_no'] = self.insurance_company_no
        if self.trustworthy_value_insurance_type_code is not None:
            result['trustworthy_value_insurance_type_code'] = self.trustworthy_value_insurance_type_code
        if self.insurance_project_code is not None:
            result['insurance_project_code'] = self.insurance_project_code
        if self.insurance_options_code is not None:
            result['insurance_options_code'] = self.insurance_options_code
        if self.inquirer is not None:
            result['inquirer'] = self.inquirer
        if self.applicant is not None:
            result['applicant'] = self.applicant
        if self.insured_list is not None:
            result['insured_list'] = self.insured_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('inquiry_no') is not None:
            self.inquiry_no = m.get('inquiry_no')
        if m.get('inquire_platform') is not None:
            self.inquire_platform = m.get('inquire_platform')
        if m.get('single_insurance_amount') is not None:
            self.single_insurance_amount = m.get('single_insurance_amount')
        if m.get('total_insurance_amount') is not None:
            self.total_insurance_amount = m.get('total_insurance_amount')
        if m.get('material_list') is not None:
            self.material_list = m.get('material_list')
        if m.get('object_list') is not None:
            self.object_list = m.get('object_list')
        if m.get('insurance_company_no') is not None:
            self.insurance_company_no = m.get('insurance_company_no')
        if m.get('trustworthy_value_insurance_type_code') is not None:
            self.trustworthy_value_insurance_type_code = m.get('trustworthy_value_insurance_type_code')
        if m.get('insurance_project_code') is not None:
            self.insurance_project_code = m.get('insurance_project_code')
        if m.get('insurance_options_code') is not None:
            self.insurance_options_code = m.get('insurance_options_code')
        if m.get('inquirer') is not None:
            self.inquirer = m.get('inquirer')
        if m.get('applicant') is not None:
            self.applicant = m.get('applicant')
        if m.get('insured_list') is not None:
            self.insured_list = m.get('insured_list')
        return self


class SubmitInquiryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 报价内容
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class QueryDataDisasterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        area_code: str = None,
        disaster_type: str = None,
        start_date: str = None,
        end_date: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 行政区域代码
        self.area_code = area_code
        # 灾害类型：df:⼤⻛，by:暴⾬，xz:雪灾
        self.disaster_type = disaster_type
        # 查询起始日期
        self.start_date = start_date
        # 查询截止日期
        self.end_date = end_date

    def validate(self):
        self.validate_required(self.area_code, 'area_code')
        self.validate_required(self.disaster_type, 'disaster_type')
        self.validate_required(self.start_date, 'start_date')
        self.validate_required(self.end_date, 'end_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.area_code is not None:
            result['area_code'] = self.area_code
        if self.disaster_type is not None:
            result['disaster_type'] = self.disaster_type
        if self.start_date is not None:
            result['start_date'] = self.start_date
        if self.end_date is not None:
            result['end_date'] = self.end_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('area_code') is not None:
            self.area_code = m.get('area_code')
        if m.get('disaster_type') is not None:
            self.disaster_type = m.get('disaster_type')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        return self


class QueryDataDisasterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 历史灾害内容
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class QueryDataWeatherRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        area_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 行政区域代码
        self.area_code = area_code

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.area_code is not None:
            result['area_code'] = self.area_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('area_code') is not None:
            self.area_code = m.get('area_code')
        return self


class QueryDataWeatherResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 实时气象内容
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class SyncQuoteRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        inquiry_no: str = None,
        inquire_platform: str = None,
        single_insurance_amount: str = None,
        total_insurance_amount: str = None,
        material_list: str = None,
        object_list: str = None,
        insurance_company_no: str = None,
        trustworthy_value_insurance_type_code: str = None,
        insurance_project_code: str = None,
        insurance_options_code: str = None,
        inquirer: str = None,
        applicant: str = None,
        insured_list: str = None,
        quotation: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 询价申请号
        self.inquiry_no = inquiry_no
        # 询价平台
        self.inquire_platform = inquire_platform
        # 单次保额
        self.single_insurance_amount = single_insurance_amount
        # 总保额
        self.total_insurance_amount = total_insurance_amount
        # 询价基础材料
        self.material_list = material_list
        # 标的材料列表
        self.object_list = object_list
        # 保司编号
        self.insurance_company_no = insurance_company_no
        # 保险产品编码
        self.trustworthy_value_insurance_type_code = trustworthy_value_insurance_type_code
        # 保司项目代码
        self.insurance_project_code = insurance_project_code
        # 保司方案代码
        self.insurance_options_code = insurance_options_code
        # 询价人
        self.inquirer = inquirer
        # 投保人
        self.applicant = applicant
        # 被保人列表
        self.insured_list = insured_list
        # 报价结果
        self.quotation = quotation

    def validate(self):
        self.validate_required(self.single_insurance_amount, 'single_insurance_amount')
        self.validate_required(self.total_insurance_amount, 'total_insurance_amount')
        self.validate_required(self.insurance_company_no, 'insurance_company_no')
        self.validate_required(self.trustworthy_value_insurance_type_code, 'trustworthy_value_insurance_type_code')
        self.validate_required(self.insurance_project_code, 'insurance_project_code')
        self.validate_required(self.insurance_options_code, 'insurance_options_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.inquiry_no is not None:
            result['inquiry_no'] = self.inquiry_no
        if self.inquire_platform is not None:
            result['inquire_platform'] = self.inquire_platform
        if self.single_insurance_amount is not None:
            result['single_insurance_amount'] = self.single_insurance_amount
        if self.total_insurance_amount is not None:
            result['total_insurance_amount'] = self.total_insurance_amount
        if self.material_list is not None:
            result['material_list'] = self.material_list
        if self.object_list is not None:
            result['object_list'] = self.object_list
        if self.insurance_company_no is not None:
            result['insurance_company_no'] = self.insurance_company_no
        if self.trustworthy_value_insurance_type_code is not None:
            result['trustworthy_value_insurance_type_code'] = self.trustworthy_value_insurance_type_code
        if self.insurance_project_code is not None:
            result['insurance_project_code'] = self.insurance_project_code
        if self.insurance_options_code is not None:
            result['insurance_options_code'] = self.insurance_options_code
        if self.inquirer is not None:
            result['inquirer'] = self.inquirer
        if self.applicant is not None:
            result['applicant'] = self.applicant
        if self.insured_list is not None:
            result['insured_list'] = self.insured_list
        if self.quotation is not None:
            result['quotation'] = self.quotation
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('inquiry_no') is not None:
            self.inquiry_no = m.get('inquiry_no')
        if m.get('inquire_platform') is not None:
            self.inquire_platform = m.get('inquire_platform')
        if m.get('single_insurance_amount') is not None:
            self.single_insurance_amount = m.get('single_insurance_amount')
        if m.get('total_insurance_amount') is not None:
            self.total_insurance_amount = m.get('total_insurance_amount')
        if m.get('material_list') is not None:
            self.material_list = m.get('material_list')
        if m.get('object_list') is not None:
            self.object_list = m.get('object_list')
        if m.get('insurance_company_no') is not None:
            self.insurance_company_no = m.get('insurance_company_no')
        if m.get('trustworthy_value_insurance_type_code') is not None:
            self.trustworthy_value_insurance_type_code = m.get('trustworthy_value_insurance_type_code')
        if m.get('insurance_project_code') is not None:
            self.insurance_project_code = m.get('insurance_project_code')
        if m.get('insurance_options_code') is not None:
            self.insurance_options_code = m.get('insurance_options_code')
        if m.get('inquirer') is not None:
            self.inquirer = m.get('inquirer')
        if m.get('applicant') is not None:
            self.applicant = m.get('applicant')
        if m.get('insured_list') is not None:
            self.insured_list = m.get('insured_list')
        if m.get('quotation') is not None:
            self.quotation = m.get('quotation')
        return self


class SyncQuoteResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务返回值
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class ApplyUnderwritingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        quotation_no_inner: str = None,
        insurance_application_no: str = None,
        insurance_company_no: str = None,
        trustworthy_value_insurance_type_code: str = None,
        insurance_project_code: str = None,
        insurance_options_code: str = None,
        applicant: str = None,
        insured_list: str = None,
        beneficiary_list: str = None,
        object_list: str = None,
        insurance_period_start: str = None,
        insurance_period_end: str = None,
        insurance_period: int = None,
        applied_insurance_amount: str = None,
        applied_premium: str = None,
        premium_rate: str = None,
        quotation: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 报价单编号（蚂蚁内部）
        self.quotation_no_inner = quotation_no_inner
        # 承保申请号（保司）
        self.insurance_application_no = insurance_application_no
        # 保司编码
        self.insurance_company_no = insurance_company_no
        # 保险产品编码
        self.trustworthy_value_insurance_type_code = trustworthy_value_insurance_type_code
        # 保司项目代码
        self.insurance_project_code = insurance_project_code
        # 保司方案代码
        self.insurance_options_code = insurance_options_code
        # 投保人信息(名称、证件号、证件类型)
        self.applicant = applicant
        # 被保人列表(可空)
        self.insured_list = insured_list
        # 受益人列表(可空)
        self.beneficiary_list = beneficiary_list
        # 投保标的列表
        self.object_list = object_list
        # 保险起期 yyyy-MM-dd HH:mm:ss
        self.insurance_period_start = insurance_period_start
        # 保险止期 yyyy-MM-dd HH:mm:ss
        self.insurance_period_end = insurance_period_end
        # 保期（天）
        self.insurance_period = insurance_period
        # 申请保额， {
        # "cent": 20000,
        # "currency": "CNY"
        # }
        self.applied_insurance_amount = applied_insurance_amount
        # 保费
        self.applied_premium = applied_premium
        # 保费费率
        self.premium_rate = premium_rate
        # 承保申请的报价相关内容
        self.quotation = quotation

    def validate(self):
        self.validate_required(self.insurance_application_no, 'insurance_application_no')
        self.validate_required(self.insurance_company_no, 'insurance_company_no')
        self.validate_required(self.trustworthy_value_insurance_type_code, 'trustworthy_value_insurance_type_code')
        self.validate_required(self.insurance_project_code, 'insurance_project_code')
        self.validate_required(self.insurance_options_code, 'insurance_options_code')
        self.validate_required(self.applicant, 'applicant')
        self.validate_required(self.insurance_period_start, 'insurance_period_start')
        self.validate_required(self.insurance_period, 'insurance_period')
        self.validate_required(self.applied_insurance_amount, 'applied_insurance_amount')
        self.validate_required(self.applied_premium, 'applied_premium')
        self.validate_required(self.premium_rate, 'premium_rate')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.quotation_no_inner is not None:
            result['quotation_no_inner'] = self.quotation_no_inner
        if self.insurance_application_no is not None:
            result['insurance_application_no'] = self.insurance_application_no
        if self.insurance_company_no is not None:
            result['insurance_company_no'] = self.insurance_company_no
        if self.trustworthy_value_insurance_type_code is not None:
            result['trustworthy_value_insurance_type_code'] = self.trustworthy_value_insurance_type_code
        if self.insurance_project_code is not None:
            result['insurance_project_code'] = self.insurance_project_code
        if self.insurance_options_code is not None:
            result['insurance_options_code'] = self.insurance_options_code
        if self.applicant is not None:
            result['applicant'] = self.applicant
        if self.insured_list is not None:
            result['insured_list'] = self.insured_list
        if self.beneficiary_list is not None:
            result['beneficiary_list'] = self.beneficiary_list
        if self.object_list is not None:
            result['object_list'] = self.object_list
        if self.insurance_period_start is not None:
            result['insurance_period_start'] = self.insurance_period_start
        if self.insurance_period_end is not None:
            result['insurance_period_end'] = self.insurance_period_end
        if self.insurance_period is not None:
            result['insurance_period'] = self.insurance_period
        if self.applied_insurance_amount is not None:
            result['applied_insurance_amount'] = self.applied_insurance_amount
        if self.applied_premium is not None:
            result['applied_premium'] = self.applied_premium
        if self.premium_rate is not None:
            result['premium_rate'] = self.premium_rate
        if self.quotation is not None:
            result['quotation'] = self.quotation
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('quotation_no_inner') is not None:
            self.quotation_no_inner = m.get('quotation_no_inner')
        if m.get('insurance_application_no') is not None:
            self.insurance_application_no = m.get('insurance_application_no')
        if m.get('insurance_company_no') is not None:
            self.insurance_company_no = m.get('insurance_company_no')
        if m.get('trustworthy_value_insurance_type_code') is not None:
            self.trustworthy_value_insurance_type_code = m.get('trustworthy_value_insurance_type_code')
        if m.get('insurance_project_code') is not None:
            self.insurance_project_code = m.get('insurance_project_code')
        if m.get('insurance_options_code') is not None:
            self.insurance_options_code = m.get('insurance_options_code')
        if m.get('applicant') is not None:
            self.applicant = m.get('applicant')
        if m.get('insured_list') is not None:
            self.insured_list = m.get('insured_list')
        if m.get('beneficiary_list') is not None:
            self.beneficiary_list = m.get('beneficiary_list')
        if m.get('object_list') is not None:
            self.object_list = m.get('object_list')
        if m.get('insurance_period_start') is not None:
            self.insurance_period_start = m.get('insurance_period_start')
        if m.get('insurance_period_end') is not None:
            self.insurance_period_end = m.get('insurance_period_end')
        if m.get('insurance_period') is not None:
            self.insurance_period = m.get('insurance_period')
        if m.get('applied_insurance_amount') is not None:
            self.applied_insurance_amount = m.get('applied_insurance_amount')
        if m.get('applied_premium') is not None:
            self.applied_premium = m.get('applied_premium')
        if m.get('premium_rate') is not None:
            self.premium_rate = m.get('premium_rate')
        if m.get('quotation') is not None:
            self.quotation = m.get('quotation')
        return self


class ApplyUnderwritingResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 承保申请结果
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class QueryUnderwritingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        insurance_application_no_inner: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 承保申请号（蚂蚁内部）
        self.insurance_application_no_inner = insurance_application_no_inner

    def validate(self):
        self.validate_required(self.insurance_application_no_inner, 'insurance_application_no_inner')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.insurance_application_no_inner is not None:
            result['insurance_application_no_inner'] = self.insurance_application_no_inner
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('insurance_application_no_inner') is not None:
            self.insurance_application_no_inner = m.get('insurance_application_no_inner')
        return self


class QueryUnderwritingResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 承保申请结果
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class QueryPolicyFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        insurance_policy_no_inner: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 蚂蚁侧保单唯一ID
        self.insurance_policy_no_inner = insurance_policy_no_inner

    def validate(self):
        self.validate_required(self.insurance_policy_no_inner, 'insurance_policy_no_inner')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.insurance_policy_no_inner is not None:
            result['insurance_policy_no_inner'] = self.insurance_policy_no_inner
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('insurance_policy_no_inner') is not None:
            self.insurance_policy_no_inner = m.get('insurance_policy_no_inner')
        return self


class QueryPolicyFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        oss_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询的保单信息
        self.oss_url = oss_url

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
        if self.oss_url is not None:
            result['oss_url'] = self.oss_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('oss_url') is not None:
            self.oss_url = m.get('oss_url')
        return self


class ApplyInsureRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        insurance_application_no: str = None,
        insurance_company_no: str = None,
        trustworthy_value_insurance_type_code: str = None,
        insurance_project_code: str = None,
        insurance_options_code: str = None,
        applicant: str = None,
        insured_list: str = None,
        beneficiary_list: str = None,
        insurance_period_start: str = None,
        insurance_period_end: str = None,
        applied_insurance_amount: str = None,
        insurance_period: int = None,
        insured_object_list: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 投保申请号-外部，业务侧需保证唯一
        self.insurance_application_no = insurance_application_no
        # 保司编码
        self.insurance_company_no = insurance_company_no
        # 保险产品编码
        self.trustworthy_value_insurance_type_code = trustworthy_value_insurance_type_code
        # 保司项目代码
        self.insurance_project_code = insurance_project_code
        # 保司方案代码
        self.insurance_options_code = insurance_options_code
        # 投保人信息(名称-memberName、证件号-certNo、证件类型-certType、手机号-memberMobileNo)
        self.applicant = applicant
        # 被保人列表(可空)，json格式参见投保人信息
        self.insured_list = insured_list
        # 受益人列表(可空)
        self.beneficiary_list = beneficiary_list
        # 保险起期
        self.insurance_period_start = insurance_period_start
        # 保险止期
        self.insurance_period_end = insurance_period_end
        # 申请保额，支持多币种， { "cent": 10000, "currency": "CNY" }
        self.applied_insurance_amount = applied_insurance_amount
        # 保期，单位：天
        self.insurance_period = insurance_period
        # 投保标的List，动态字段，根据险种所配置的标的传值
        self.insured_object_list = insured_object_list

    def validate(self):
        self.validate_required(self.insurance_application_no, 'insurance_application_no')
        self.validate_required(self.insurance_company_no, 'insurance_company_no')
        self.validate_required(self.trustworthy_value_insurance_type_code, 'trustworthy_value_insurance_type_code')
        self.validate_required(self.insurance_project_code, 'insurance_project_code')
        self.validate_required(self.insurance_options_code, 'insurance_options_code')
        self.validate_required(self.applicant, 'applicant')
        self.validate_required(self.insurance_period_start, 'insurance_period_start')
        self.validate_required(self.applied_insurance_amount, 'applied_insurance_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.insurance_application_no is not None:
            result['insurance_application_no'] = self.insurance_application_no
        if self.insurance_company_no is not None:
            result['insurance_company_no'] = self.insurance_company_no
        if self.trustworthy_value_insurance_type_code is not None:
            result['trustworthy_value_insurance_type_code'] = self.trustworthy_value_insurance_type_code
        if self.insurance_project_code is not None:
            result['insurance_project_code'] = self.insurance_project_code
        if self.insurance_options_code is not None:
            result['insurance_options_code'] = self.insurance_options_code
        if self.applicant is not None:
            result['applicant'] = self.applicant
        if self.insured_list is not None:
            result['insured_list'] = self.insured_list
        if self.beneficiary_list is not None:
            result['beneficiary_list'] = self.beneficiary_list
        if self.insurance_period_start is not None:
            result['insurance_period_start'] = self.insurance_period_start
        if self.insurance_period_end is not None:
            result['insurance_period_end'] = self.insurance_period_end
        if self.applied_insurance_amount is not None:
            result['applied_insurance_amount'] = self.applied_insurance_amount
        if self.insurance_period is not None:
            result['insurance_period'] = self.insurance_period
        if self.insured_object_list is not None:
            result['insured_object_list'] = self.insured_object_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('insurance_application_no') is not None:
            self.insurance_application_no = m.get('insurance_application_no')
        if m.get('insurance_company_no') is not None:
            self.insurance_company_no = m.get('insurance_company_no')
        if m.get('trustworthy_value_insurance_type_code') is not None:
            self.trustworthy_value_insurance_type_code = m.get('trustworthy_value_insurance_type_code')
        if m.get('insurance_project_code') is not None:
            self.insurance_project_code = m.get('insurance_project_code')
        if m.get('insurance_options_code') is not None:
            self.insurance_options_code = m.get('insurance_options_code')
        if m.get('applicant') is not None:
            self.applicant = m.get('applicant')
        if m.get('insured_list') is not None:
            self.insured_list = m.get('insured_list')
        if m.get('beneficiary_list') is not None:
            self.beneficiary_list = m.get('beneficiary_list')
        if m.get('insurance_period_start') is not None:
            self.insurance_period_start = m.get('insurance_period_start')
        if m.get('insurance_period_end') is not None:
            self.insurance_period_end = m.get('insurance_period_end')
        if m.get('applied_insurance_amount') is not None:
            self.applied_insurance_amount = m.get('applied_insurance_amount')
        if m.get('insurance_period') is not None:
            self.insurance_period = m.get('insurance_period')
        if m.get('insured_object_list') is not None:
            self.insured_object_list = m.get('insured_object_list')
        return self


class ApplyInsureResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 投保申请结果，不同险种可能返回不同，具体参见相关文档
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class NotifyPolicyResultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        insurance_application_no_inner: str = None,
        policy_no: str = None,
        insurance_amount: str = None,
        insurance_premium: str = None,
        insurance_period_start: str = None,
        insurance_period_end: str = None,
        policy_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 蚂蚁承保申请号
        self.insurance_application_no_inner = insurance_application_no_inner
        # 保单号
        self.policy_no = policy_no
        # 保额，JSON格式
        self.insurance_amount = insurance_amount
        # 保费,json格式
        self.insurance_premium = insurance_premium
        # 保险起期 yyyy-MM-dd HH:mm:ss
        self.insurance_period_start = insurance_period_start
        # 保险止期 yyyy-MM-dd HH:mm:ss
        self.insurance_period_end = insurance_period_end
        # 电子保单URL
        self.policy_url = policy_url

    def validate(self):
        self.validate_required(self.insurance_application_no_inner, 'insurance_application_no_inner')
        self.validate_required(self.policy_no, 'policy_no')
        self.validate_required(self.insurance_amount, 'insurance_amount')
        self.validate_required(self.insurance_premium, 'insurance_premium')
        self.validate_required(self.insurance_period_start, 'insurance_period_start')
        self.validate_required(self.insurance_period_end, 'insurance_period_end')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.insurance_application_no_inner is not None:
            result['insurance_application_no_inner'] = self.insurance_application_no_inner
        if self.policy_no is not None:
            result['policy_no'] = self.policy_no
        if self.insurance_amount is not None:
            result['insurance_amount'] = self.insurance_amount
        if self.insurance_premium is not None:
            result['insurance_premium'] = self.insurance_premium
        if self.insurance_period_start is not None:
            result['insurance_period_start'] = self.insurance_period_start
        if self.insurance_period_end is not None:
            result['insurance_period_end'] = self.insurance_period_end
        if self.policy_url is not None:
            result['policy_url'] = self.policy_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('insurance_application_no_inner') is not None:
            self.insurance_application_no_inner = m.get('insurance_application_no_inner')
        if m.get('policy_no') is not None:
            self.policy_no = m.get('policy_no')
        if m.get('insurance_amount') is not None:
            self.insurance_amount = m.get('insurance_amount')
        if m.get('insurance_premium') is not None:
            self.insurance_premium = m.get('insurance_premium')
        if m.get('insurance_period_start') is not None:
            self.insurance_period_start = m.get('insurance_period_start')
        if m.get('insurance_period_end') is not None:
            self.insurance_period_end = m.get('insurance_period_end')
        if m.get('policy_url') is not None:
            self.policy_url = m.get('policy_url')
        return self


class NotifyPolicyResultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 保单同步结果
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class ApplyClaimRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        claim_notification_form_no: str = None,
        insurance_policy_no: str = None,
        insurance_company_no: str = None,
        trustworthy_value_insurance_type_code: str = None,
        insurance_options_code: str = None,
        insurance_project_code: str = None,
        loss_occurred_time: str = None,
        loss_occurred_reason: str = None,
        loss_occurred_address: str = None,
        object_list: str = None,
        claim_notification_amount_local_currency: str = None,
        reporter: str = None,
        material_list: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 报案单号
        self.claim_notification_form_no = claim_notification_form_no
        # 保单号
        self.insurance_policy_no = insurance_policy_no
        # 保司编号
        self.insurance_company_no = insurance_company_no
        # 保险产品代码
        self.trustworthy_value_insurance_type_code = trustworthy_value_insurance_type_code
        # 保司项目代码
        self.insurance_options_code = insurance_options_code
        # 保司项目代码
        self.insurance_project_code = insurance_project_code
        # 出险时间
        self.loss_occurred_time = loss_occurred_time
        # 出险原因
        self.loss_occurred_reason = loss_occurred_reason
        # 出险地点
        self.loss_occurred_address = loss_occurred_address
        # 出险标的列表
        self.object_list = object_list
        # 报案金额
        self.claim_notification_amount_local_currency = claim_notification_amount_local_currency
        # 报案人
        self.reporter = reporter
        # 报案材料列表
        self.material_list = material_list

    def validate(self):
        self.validate_required(self.claim_notification_form_no, 'claim_notification_form_no')
        self.validate_required(self.insurance_policy_no, 'insurance_policy_no')
        self.validate_required(self.insurance_company_no, 'insurance_company_no')
        self.validate_required(self.loss_occurred_time, 'loss_occurred_time')
        self.validate_required(self.loss_occurred_reason, 'loss_occurred_reason')
        self.validate_required(self.loss_occurred_address, 'loss_occurred_address')
        self.validate_required(self.claim_notification_amount_local_currency, 'claim_notification_amount_local_currency')
        self.validate_required(self.reporter, 'reporter')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.claim_notification_form_no is not None:
            result['claim_notification_form_no'] = self.claim_notification_form_no
        if self.insurance_policy_no is not None:
            result['insurance_policy_no'] = self.insurance_policy_no
        if self.insurance_company_no is not None:
            result['insurance_company_no'] = self.insurance_company_no
        if self.trustworthy_value_insurance_type_code is not None:
            result['trustworthy_value_insurance_type_code'] = self.trustworthy_value_insurance_type_code
        if self.insurance_options_code is not None:
            result['insurance_options_code'] = self.insurance_options_code
        if self.insurance_project_code is not None:
            result['insurance_project_code'] = self.insurance_project_code
        if self.loss_occurred_time is not None:
            result['loss_occurred_time'] = self.loss_occurred_time
        if self.loss_occurred_reason is not None:
            result['loss_occurred_reason'] = self.loss_occurred_reason
        if self.loss_occurred_address is not None:
            result['loss_occurred_address'] = self.loss_occurred_address
        if self.object_list is not None:
            result['object_list'] = self.object_list
        if self.claim_notification_amount_local_currency is not None:
            result['claim_notification_amount_local_currency'] = self.claim_notification_amount_local_currency
        if self.reporter is not None:
            result['reporter'] = self.reporter
        if self.material_list is not None:
            result['material_list'] = self.material_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('claim_notification_form_no') is not None:
            self.claim_notification_form_no = m.get('claim_notification_form_no')
        if m.get('insurance_policy_no') is not None:
            self.insurance_policy_no = m.get('insurance_policy_no')
        if m.get('insurance_company_no') is not None:
            self.insurance_company_no = m.get('insurance_company_no')
        if m.get('trustworthy_value_insurance_type_code') is not None:
            self.trustworthy_value_insurance_type_code = m.get('trustworthy_value_insurance_type_code')
        if m.get('insurance_options_code') is not None:
            self.insurance_options_code = m.get('insurance_options_code')
        if m.get('insurance_project_code') is not None:
            self.insurance_project_code = m.get('insurance_project_code')
        if m.get('loss_occurred_time') is not None:
            self.loss_occurred_time = m.get('loss_occurred_time')
        if m.get('loss_occurred_reason') is not None:
            self.loss_occurred_reason = m.get('loss_occurred_reason')
        if m.get('loss_occurred_address') is not None:
            self.loss_occurred_address = m.get('loss_occurred_address')
        if m.get('object_list') is not None:
            self.object_list = m.get('object_list')
        if m.get('claim_notification_amount_local_currency') is not None:
            self.claim_notification_amount_local_currency = m.get('claim_notification_amount_local_currency')
        if m.get('reporter') is not None:
            self.reporter = m.get('reporter')
        if m.get('material_list') is not None:
            self.material_list = m.get('material_list')
        return self


class ApplyClaimResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 报案响应
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class CancelClaimRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        claim_notification_form_no_inner: str = None,
        biz_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 报案单编号（蚂蚁内部）
        self.claim_notification_form_no_inner = claim_notification_form_no_inner
        # 报案撤销附加内容
        self.biz_info = biz_info

    def validate(self):
        self.validate_required(self.claim_notification_form_no_inner, 'claim_notification_form_no_inner')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.claim_notification_form_no_inner is not None:
            result['claim_notification_form_no_inner'] = self.claim_notification_form_no_inner
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('claim_notification_form_no_inner') is not None:
            self.claim_notification_form_no_inner = m.get('claim_notification_form_no_inner')
        if m.get('biz_info') is not None:
            self.biz_info = m.get('biz_info')
        return self


class CancelClaimResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # biz_result
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class UpdateClaimMaterialRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        claim_notification_form_no_inner: str = None,
        claim_notification_no: str = None,
        material_list: str = None,
        is_finished: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 报案单号（蚂蚁内部）
        self.claim_notification_form_no_inner = claim_notification_form_no_inner
        # 报案号（保司）
        self.claim_notification_no = claim_notification_no
        # 报案材料列表
        self.material_list = material_list
        # 不传值，默认（1-已完毕）
        # 0：未完毕
        # 1：已完毕
        self.is_finished = is_finished

    def validate(self):
        self.validate_required(self.claim_notification_form_no_inner, 'claim_notification_form_no_inner')
        self.validate_required(self.claim_notification_no, 'claim_notification_no')
        self.validate_required(self.material_list, 'material_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.claim_notification_form_no_inner is not None:
            result['claim_notification_form_no_inner'] = self.claim_notification_form_no_inner
        if self.claim_notification_no is not None:
            result['claim_notification_no'] = self.claim_notification_no
        if self.material_list is not None:
            result['material_list'] = self.material_list
        if self.is_finished is not None:
            result['is_finished'] = self.is_finished
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('claim_notification_form_no_inner') is not None:
            self.claim_notification_form_no_inner = m.get('claim_notification_form_no_inner')
        if m.get('claim_notification_no') is not None:
            self.claim_notification_no = m.get('claim_notification_no')
        if m.get('material_list') is not None:
            self.material_list = m.get('material_list')
        if m.get('is_finished') is not None:
            self.is_finished = m.get('is_finished')
        return self


class UpdateClaimMaterialResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # biz_result
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class ConfirmClaimSettleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        claim_notification_form_no_inner: str = None,
        biz_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 报案单编号（蚂蚁内部）
        self.claim_notification_form_no_inner = claim_notification_form_no_inner
        # 附加内容
        self.biz_info = biz_info

    def validate(self):
        self.validate_required(self.claim_notification_form_no_inner, 'claim_notification_form_no_inner')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.claim_notification_form_no_inner is not None:
            result['claim_notification_form_no_inner'] = self.claim_notification_form_no_inner
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('claim_notification_form_no_inner') is not None:
            self.claim_notification_form_no_inner = m.get('claim_notification_form_no_inner')
        if m.get('biz_info') is not None:
            self.biz_info = m.get('biz_info')
        return self


class ConfirmClaimSettleResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # biz_result
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class FinishClaimSettleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        claim_notification_form_no_inner: str = None,
        claim_notification_no: str = None,
        accept_result: str = None,
        accept_note: str = None,
        trade_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 报案单编号（蚂蚁内部）
        self.claim_notification_form_no_inner = claim_notification_form_no_inner
        # 报案号（保司）
        self.claim_notification_no = claim_notification_no
        # 赔付受理结果：01--受理、02--拒赔
        self.accept_result = accept_result
        # 受理结论
        self.accept_note = accept_note
        # 支付信息
        self.trade_info = trade_info

    def validate(self):
        self.validate_required(self.claim_notification_form_no_inner, 'claim_notification_form_no_inner')
        self.validate_required(self.accept_result, 'accept_result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.claim_notification_form_no_inner is not None:
            result['claim_notification_form_no_inner'] = self.claim_notification_form_no_inner
        if self.claim_notification_no is not None:
            result['claim_notification_no'] = self.claim_notification_no
        if self.accept_result is not None:
            result['accept_result'] = self.accept_result
        if self.accept_note is not None:
            result['accept_note'] = self.accept_note
        if self.trade_info is not None:
            result['trade_info'] = self.trade_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('claim_notification_form_no_inner') is not None:
            self.claim_notification_form_no_inner = m.get('claim_notification_form_no_inner')
        if m.get('claim_notification_no') is not None:
            self.claim_notification_no = m.get('claim_notification_no')
        if m.get('accept_result') is not None:
            self.accept_result = m.get('accept_result')
        if m.get('accept_note') is not None:
            self.accept_note = m.get('accept_note')
        if m.get('trade_info') is not None:
            self.trade_info = m.get('trade_info')
        return self


class FinishClaimSettleResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # biz_result
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class ApplyEndorsementStrategyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        insurance_application_no_inner: str = None,
        applicant: str = None,
        insured_list: str = None,
        beneficiary_list: str = None,
        object_list: str = None,
        insurance_period_start: str = None,
        insurance_period_end: str = None,
        insurance_period: int = None,
        applied_insurance_amount: str = None,
        applied_premium: str = None,
        premium_rate: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 承保申请编号（蚂蚁内部）
        self.insurance_application_no_inner = insurance_application_no_inner
        # 投保人信息(名称、证件号、证件类型)
        self.applicant = applicant
        # 被保人列表
        self.insured_list = insured_list
        # 受益人列表
        self.beneficiary_list = beneficiary_list
        # 投保标的列表
        self.object_list = object_list
        # 保险起期 yyyy-MM-dd HH:mm:ss
        self.insurance_period_start = insurance_period_start
        # 保险止期 yyyy-MM-dd HH:mm:ss
        self.insurance_period_end = insurance_period_end
        # 保期（天）
        self.insurance_period = insurance_period
        # 申请保额， { "cent": 20000, "currency": "CNY" }
        self.applied_insurance_amount = applied_insurance_amount
        # 保费， { "cent": 20000, "currency": "CNY" }
        self.applied_premium = applied_premium
        # 保费费率
        self.premium_rate = premium_rate

    def validate(self):
        self.validate_required(self.insurance_application_no_inner, 'insurance_application_no_inner')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.insurance_application_no_inner is not None:
            result['insurance_application_no_inner'] = self.insurance_application_no_inner
        if self.applicant is not None:
            result['applicant'] = self.applicant
        if self.insured_list is not None:
            result['insured_list'] = self.insured_list
        if self.beneficiary_list is not None:
            result['beneficiary_list'] = self.beneficiary_list
        if self.object_list is not None:
            result['object_list'] = self.object_list
        if self.insurance_period_start is not None:
            result['insurance_period_start'] = self.insurance_period_start
        if self.insurance_period_end is not None:
            result['insurance_period_end'] = self.insurance_period_end
        if self.insurance_period is not None:
            result['insurance_period'] = self.insurance_period
        if self.applied_insurance_amount is not None:
            result['applied_insurance_amount'] = self.applied_insurance_amount
        if self.applied_premium is not None:
            result['applied_premium'] = self.applied_premium
        if self.premium_rate is not None:
            result['premium_rate'] = self.premium_rate
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('insurance_application_no_inner') is not None:
            self.insurance_application_no_inner = m.get('insurance_application_no_inner')
        if m.get('applicant') is not None:
            self.applicant = m.get('applicant')
        if m.get('insured_list') is not None:
            self.insured_list = m.get('insured_list')
        if m.get('beneficiary_list') is not None:
            self.beneficiary_list = m.get('beneficiary_list')
        if m.get('object_list') is not None:
            self.object_list = m.get('object_list')
        if m.get('insurance_period_start') is not None:
            self.insurance_period_start = m.get('insurance_period_start')
        if m.get('insurance_period_end') is not None:
            self.insurance_period_end = m.get('insurance_period_end')
        if m.get('insurance_period') is not None:
            self.insurance_period = m.get('insurance_period')
        if m.get('applied_insurance_amount') is not None:
            self.applied_insurance_amount = m.get('applied_insurance_amount')
        if m.get('applied_premium') is not None:
            self.applied_premium = m.get('applied_premium')
        if m.get('premium_rate') is not None:
            self.premium_rate = m.get('premium_rate')
        return self


class ApplyEndorsementStrategyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 承保申请结果
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class SyncPolicyResultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        insurance_application_no: str = None,
        insurance_company_no: str = None,
        trustworthy_value_insurance_type_code: str = None,
        insurance_project_code: str = None,
        insurance_options_code: str = None,
        applicant: str = None,
        insured_list: str = None,
        beneficiary_list: str = None,
        object_list: str = None,
        policy_no: str = None,
        insurance_amount: str = None,
        insurance_premium: str = None,
        insurance_period_start: str = None,
        insurance_period_end: str = None,
        policy_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 投保申请号-外部，业务侧需保证唯一
        self.insurance_application_no = insurance_application_no
        # 保司编码
        self.insurance_company_no = insurance_company_no
        # 保险产品编码
        self.trustworthy_value_insurance_type_code = trustworthy_value_insurance_type_code
        # 保司项目代码
        self.insurance_project_code = insurance_project_code
        # 保司方案代码
        self.insurance_options_code = insurance_options_code
        # 投保人信息(名称-memberName、证件号-certNo、证件类型-certType、手机号-memberMobileNo)
        self.applicant = applicant
        # 被保人列表(可空)
        self.insured_list = insured_list
        # 受益人列表(可空)
        self.beneficiary_list = beneficiary_list
        # 投保标的List，动态字段，根据险种所配置的标的传值
        self.object_list = object_list
        # 保单号
        self.policy_no = policy_no
        # 保额，JSON格式
        self.insurance_amount = insurance_amount
        # 保费,json格式
        # 
        self.insurance_premium = insurance_premium
        # 保险起期 yyyy-MM-dd HH:mm:ss
        self.insurance_period_start = insurance_period_start
        # 保险止期 yyyy-MM-dd HH:mm:ss
        self.insurance_period_end = insurance_period_end
        # 电子保单URL
        self.policy_url = policy_url

    def validate(self):
        self.validate_required(self.insurance_application_no, 'insurance_application_no')
        self.validate_required(self.insurance_company_no, 'insurance_company_no')
        self.validate_required(self.trustworthy_value_insurance_type_code, 'trustworthy_value_insurance_type_code')
        self.validate_required(self.insurance_project_code, 'insurance_project_code')
        self.validate_required(self.insurance_options_code, 'insurance_options_code')
        self.validate_required(self.applicant, 'applicant')
        self.validate_required(self.object_list, 'object_list')
        self.validate_required(self.policy_no, 'policy_no')
        self.validate_required(self.insurance_amount, 'insurance_amount')
        self.validate_required(self.insurance_premium, 'insurance_premium')
        self.validate_required(self.insurance_period_start, 'insurance_period_start')
        self.validate_required(self.insurance_period_end, 'insurance_period_end')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.insurance_application_no is not None:
            result['insurance_application_no'] = self.insurance_application_no
        if self.insurance_company_no is not None:
            result['insurance_company_no'] = self.insurance_company_no
        if self.trustworthy_value_insurance_type_code is not None:
            result['trustworthy_value_insurance_type_code'] = self.trustworthy_value_insurance_type_code
        if self.insurance_project_code is not None:
            result['insurance_project_code'] = self.insurance_project_code
        if self.insurance_options_code is not None:
            result['insurance_options_code'] = self.insurance_options_code
        if self.applicant is not None:
            result['applicant'] = self.applicant
        if self.insured_list is not None:
            result['insured_list'] = self.insured_list
        if self.beneficiary_list is not None:
            result['beneficiary_list'] = self.beneficiary_list
        if self.object_list is not None:
            result['object_list'] = self.object_list
        if self.policy_no is not None:
            result['policy_no'] = self.policy_no
        if self.insurance_amount is not None:
            result['insurance_amount'] = self.insurance_amount
        if self.insurance_premium is not None:
            result['insurance_premium'] = self.insurance_premium
        if self.insurance_period_start is not None:
            result['insurance_period_start'] = self.insurance_period_start
        if self.insurance_period_end is not None:
            result['insurance_period_end'] = self.insurance_period_end
        if self.policy_url is not None:
            result['policy_url'] = self.policy_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('insurance_application_no') is not None:
            self.insurance_application_no = m.get('insurance_application_no')
        if m.get('insurance_company_no') is not None:
            self.insurance_company_no = m.get('insurance_company_no')
        if m.get('trustworthy_value_insurance_type_code') is not None:
            self.trustworthy_value_insurance_type_code = m.get('trustworthy_value_insurance_type_code')
        if m.get('insurance_project_code') is not None:
            self.insurance_project_code = m.get('insurance_project_code')
        if m.get('insurance_options_code') is not None:
            self.insurance_options_code = m.get('insurance_options_code')
        if m.get('applicant') is not None:
            self.applicant = m.get('applicant')
        if m.get('insured_list') is not None:
            self.insured_list = m.get('insured_list')
        if m.get('beneficiary_list') is not None:
            self.beneficiary_list = m.get('beneficiary_list')
        if m.get('object_list') is not None:
            self.object_list = m.get('object_list')
        if m.get('policy_no') is not None:
            self.policy_no = m.get('policy_no')
        if m.get('insurance_amount') is not None:
            self.insurance_amount = m.get('insurance_amount')
        if m.get('insurance_premium') is not None:
            self.insurance_premium = m.get('insurance_premium')
        if m.get('insurance_period_start') is not None:
            self.insurance_period_start = m.get('insurance_period_start')
        if m.get('insurance_period_end') is not None:
            self.insurance_period_end = m.get('insurance_period_end')
        if m.get('policy_url') is not None:
            self.policy_url = m.get('policy_url')
        return self


class SyncPolicyResultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 保单同步结果
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class QueryInsureResultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        trustworthy_value_insurance_type_code: str = None,
        insurance_company_no: str = None,
        notice_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 保险产品编码
        self.trustworthy_value_insurance_type_code = trustworthy_value_insurance_type_code
        # 保司编码
        self.insurance_company_no = insurance_company_no
        # 通知单号,投保申请时会返回
        self.notice_no = notice_no

    def validate(self):
        self.validate_required(self.trustworthy_value_insurance_type_code, 'trustworthy_value_insurance_type_code')
        self.validate_required(self.insurance_company_no, 'insurance_company_no')
        self.validate_required(self.notice_no, 'notice_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.trustworthy_value_insurance_type_code is not None:
            result['trustworthy_value_insurance_type_code'] = self.trustworthy_value_insurance_type_code
        if self.insurance_company_no is not None:
            result['insurance_company_no'] = self.insurance_company_no
        if self.notice_no is not None:
            result['notice_no'] = self.notice_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('trustworthy_value_insurance_type_code') is not None:
            self.trustworthy_value_insurance_type_code = m.get('trustworthy_value_insurance_type_code')
        if m.get('insurance_company_no') is not None:
            self.insurance_company_no = m.get('insurance_company_no')
        if m.get('notice_no') is not None:
            self.notice_no = m.get('notice_no')
        return self


class QueryInsureResultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        notice_no: str = None,
        payment_status: str = None,
        policy_no: str = None,
        insurance_amount: str = None,
        insurance_premium: str = None,
        effect_date: str = None,
        expire_date: str = None,
        out_policy_url: str = None,
        insurance_application_no: str = None,
        insurance_application_no_inner: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 通知单号
        self.notice_no = notice_no
        # 付款状态
        self.payment_status = payment_status
        # 保单号
        self.policy_no = policy_no
        # 保额(人民币)
        self.insurance_amount = insurance_amount
        # 保费(人民币)
        self.insurance_premium = insurance_premium
        # 保险起期
        self.effect_date = effect_date
        # 保险止期
        self.expire_date = expire_date
        # 电子保单URL
        self.out_policy_url = out_policy_url
        # 投保申请号-外部
        self.insurance_application_no = insurance_application_no
        # 交易流水号
        self.insurance_application_no_inner = insurance_application_no_inner

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
        if self.notice_no is not None:
            result['notice_no'] = self.notice_no
        if self.payment_status is not None:
            result['payment_status'] = self.payment_status
        if self.policy_no is not None:
            result['policy_no'] = self.policy_no
        if self.insurance_amount is not None:
            result['insurance_amount'] = self.insurance_amount
        if self.insurance_premium is not None:
            result['insurance_premium'] = self.insurance_premium
        if self.effect_date is not None:
            result['effect_date'] = self.effect_date
        if self.expire_date is not None:
            result['expire_date'] = self.expire_date
        if self.out_policy_url is not None:
            result['out_policy_url'] = self.out_policy_url
        if self.insurance_application_no is not None:
            result['insurance_application_no'] = self.insurance_application_no
        if self.insurance_application_no_inner is not None:
            result['insurance_application_no_inner'] = self.insurance_application_no_inner
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('notice_no') is not None:
            self.notice_no = m.get('notice_no')
        if m.get('payment_status') is not None:
            self.payment_status = m.get('payment_status')
        if m.get('policy_no') is not None:
            self.policy_no = m.get('policy_no')
        if m.get('insurance_amount') is not None:
            self.insurance_amount = m.get('insurance_amount')
        if m.get('insurance_premium') is not None:
            self.insurance_premium = m.get('insurance_premium')
        if m.get('effect_date') is not None:
            self.effect_date = m.get('effect_date')
        if m.get('expire_date') is not None:
            self.expire_date = m.get('expire_date')
        if m.get('out_policy_url') is not None:
            self.out_policy_url = m.get('out_policy_url')
        if m.get('insurance_application_no') is not None:
            self.insurance_application_no = m.get('insurance_application_no')
        if m.get('insurance_application_no_inner') is not None:
            self.insurance_application_no_inner = m.get('insurance_application_no_inner')
        return self


class ApplyInsureTestRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        insurance_application_no: str = None,
        insurance_company_no: str = None,
        trustworthy_value_insurance_type_code: str = None,
        insurance_project_code: str = None,
        insurance_options_code: str = None,
        applicant: str = None,
        insured_list: str = None,
        beneficiary_list: str = None,
        insurance_period_start: str = None,
        insurance_period_end: str = None,
        applied_insurance_amount: str = None,
        insurance_period: str = None,
        insured_object_list: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # insurance_application_no
        self.insurance_application_no = insurance_application_no
        # insurance_company_no
        self.insurance_company_no = insurance_company_no
        # trustworthy_value_insurance_type_code
        self.trustworthy_value_insurance_type_code = trustworthy_value_insurance_type_code
        # insurance_project_code
        self.insurance_project_code = insurance_project_code
        # insurance_options_code
        self.insurance_options_code = insurance_options_code
        # applicant
        self.applicant = applicant
        # insured_list
        self.insured_list = insured_list
        # beneficiary_list
        self.beneficiary_list = beneficiary_list
        # insurance_period_start
        self.insurance_period_start = insurance_period_start
        # insurance_period_end
        self.insurance_period_end = insurance_period_end
        # applied_insurance_amount
        self.applied_insurance_amount = applied_insurance_amount
        # insurance_period
        self.insurance_period = insurance_period
        # insured_object_list
        self.insured_object_list = insured_object_list

    def validate(self):
        self.validate_required(self.insurance_application_no, 'insurance_application_no')
        self.validate_required(self.insurance_company_no, 'insurance_company_no')
        self.validate_required(self.trustworthy_value_insurance_type_code, 'trustworthy_value_insurance_type_code')
        self.validate_required(self.insurance_project_code, 'insurance_project_code')
        self.validate_required(self.insurance_options_code, 'insurance_options_code')
        self.validate_required(self.applicant, 'applicant')
        self.validate_required(self.insurance_period_start, 'insurance_period_start')
        self.validate_required(self.applied_insurance_amount, 'applied_insurance_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.insurance_application_no is not None:
            result['insurance_application_no'] = self.insurance_application_no
        if self.insurance_company_no is not None:
            result['insurance_company_no'] = self.insurance_company_no
        if self.trustworthy_value_insurance_type_code is not None:
            result['trustworthy_value_insurance_type_code'] = self.trustworthy_value_insurance_type_code
        if self.insurance_project_code is not None:
            result['insurance_project_code'] = self.insurance_project_code
        if self.insurance_options_code is not None:
            result['insurance_options_code'] = self.insurance_options_code
        if self.applicant is not None:
            result['applicant'] = self.applicant
        if self.insured_list is not None:
            result['insured_list'] = self.insured_list
        if self.beneficiary_list is not None:
            result['beneficiary_list'] = self.beneficiary_list
        if self.insurance_period_start is not None:
            result['insurance_period_start'] = self.insurance_period_start
        if self.insurance_period_end is not None:
            result['insurance_period_end'] = self.insurance_period_end
        if self.applied_insurance_amount is not None:
            result['applied_insurance_amount'] = self.applied_insurance_amount
        if self.insurance_period is not None:
            result['insurance_period'] = self.insurance_period
        if self.insured_object_list is not None:
            result['insured_object_list'] = self.insured_object_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('insurance_application_no') is not None:
            self.insurance_application_no = m.get('insurance_application_no')
        if m.get('insurance_company_no') is not None:
            self.insurance_company_no = m.get('insurance_company_no')
        if m.get('trustworthy_value_insurance_type_code') is not None:
            self.trustworthy_value_insurance_type_code = m.get('trustworthy_value_insurance_type_code')
        if m.get('insurance_project_code') is not None:
            self.insurance_project_code = m.get('insurance_project_code')
        if m.get('insurance_options_code') is not None:
            self.insurance_options_code = m.get('insurance_options_code')
        if m.get('applicant') is not None:
            self.applicant = m.get('applicant')
        if m.get('insured_list') is not None:
            self.insured_list = m.get('insured_list')
        if m.get('beneficiary_list') is not None:
            self.beneficiary_list = m.get('beneficiary_list')
        if m.get('insurance_period_start') is not None:
            self.insurance_period_start = m.get('insurance_period_start')
        if m.get('insurance_period_end') is not None:
            self.insurance_period_end = m.get('insurance_period_end')
        if m.get('applied_insurance_amount') is not None:
            self.applied_insurance_amount = m.get('applied_insurance_amount')
        if m.get('insurance_period') is not None:
            self.insurance_period = m.get('insurance_period')
        if m.get('insured_object_list') is not None:
            self.insured_object_list = m.get('insured_object_list')
        return self


class ApplyInsureTestResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # biz_result
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class SubmitInvestigateCaseRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        report_no: str = None,
        out_case_no: str = None,
        policy_no: str = None,
        entrust_insurance_company_id: str = None,
        invest_end_time: int = None,
        entrust_name: str = None,
        entrust_tel: str = None,
        entrust_time: int = None,
        accident_tel: str = None,
        accident_name: str = None,
        accident_card_no: str = None,
        accident_card_type: str = None,
        accident_desc: str = None,
        accident_address_info: str = None,
        accident_address_detail: str = None,
        accident_time: int = None,
        reporter_tel: str = None,
        reporter_name: str = None,
        reporter_card_no: str = None,
        reporter_card_type: str = None,
        reporter_relation_to_accident: str = None,
        report_time: int = None,
        event_address_info: str = None,
        event_address_detail: str = None,
        confirm_hospital: str = None,
        confirm_hospital_address_info: str = None,
        confirm_illness_name: str = None,
        product_type: str = None,
        file_list: List[FileNode] = None,
        entrust_guarantee_product_list: List[EntrustGuaranteeProduct] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 报案号 - 外部唯一ID
        self.report_no = report_no
        # 外部单据号
        self.out_case_no = out_case_no
        # 案件号
        self.policy_no = policy_no
        # 委托的保司ID
        self.entrust_insurance_company_id = entrust_insurance_company_id
        # 要求完成时间，时间戳
        self.invest_end_time = invest_end_time
        # 委托联系人
        self.entrust_name = entrust_name
        # 委托联系人电话
        self.entrust_tel = entrust_tel
        # 委托时间，时间戳
        self.entrust_time = entrust_time
        # 出险人电话号码
        self.accident_tel = accident_tel
        # 出险人姓名
        self.accident_name = accident_name
        # 出险人证件号
        self.accident_card_no = accident_card_no
        # 出险人证件类型，10-身份证/11-户口本/13-军官证/17-港澳通行证/18-台湾通行证/51-护照/99-其他
        self.accident_card_type = accident_card_type
        # 出险经过
        self.accident_desc = accident_desc
        # 出险人地址中文名
        self.accident_address_info = accident_address_info
        # 出险人详细住址
        self.accident_address_detail = accident_address_detail
        # 出险日期，时间戳
        self.accident_time = accident_time
        # 报案人电话号码
        self.reporter_tel = reporter_tel
        # 报案人姓名
        self.reporter_name = reporter_name
        # 报案人证件号
        self.reporter_card_no = reporter_card_no
        # 报案人证件类型，10-身份证/11-户口本/13-军官证/17-港澳通行证/18-台湾通行证/51-护照/99-其他
        self.reporter_card_type = reporter_card_type
        # 报案人与出险人的关系
        # 1本人，2配偶，3父母，4子女，5其他
        self.reporter_relation_to_accident = reporter_relation_to_accident
        # 报案时间，时间戳
        self.report_time = report_time
        # 事故发生地址中文名，格式：省-市-区，如浙江省-杭州市-西湖区
        self.event_address_info = event_address_info
        # 事故发生详细地点
        self.event_address_detail = event_address_detail
        # 确诊医院
        self.confirm_hospital = confirm_hospital
        # 确诊医院地址信息，格式：省-市-区，如浙江省-杭州市-西湖区
        self.confirm_hospital_address_info = confirm_hospital_address_info
        # 确诊疾病名称
        self.confirm_illness_name = confirm_illness_name
        # 产品大类 重疾或者医疗险
        self.product_type = product_type
        # 文件列表
        self.file_list = file_list
        # 委托险种集合信息
        self.entrust_guarantee_product_list = entrust_guarantee_product_list

    def validate(self):
        self.validate_required(self.report_no, 'report_no')
        self.validate_required(self.out_case_no, 'out_case_no')
        self.validate_required(self.entrust_insurance_company_id, 'entrust_insurance_company_id')
        self.validate_required(self.invest_end_time, 'invest_end_time')
        self.validate_required(self.entrust_name, 'entrust_name')
        self.validate_required(self.entrust_tel, 'entrust_tel')
        self.validate_required(self.entrust_time, 'entrust_time')
        self.validate_required(self.accident_tel, 'accident_tel')
        self.validate_required(self.accident_name, 'accident_name')
        self.validate_required(self.accident_card_no, 'accident_card_no')
        self.validate_required(self.accident_card_type, 'accident_card_type')
        self.validate_required(self.accident_desc, 'accident_desc')
        self.validate_required(self.accident_address_info, 'accident_address_info')
        self.validate_required(self.accident_address_detail, 'accident_address_detail')
        self.validate_required(self.accident_time, 'accident_time')
        self.validate_required(self.reporter_tel, 'reporter_tel')
        self.validate_required(self.reporter_name, 'reporter_name')
        self.validate_required(self.reporter_card_no, 'reporter_card_no')
        self.validate_required(self.reporter_card_type, 'reporter_card_type')
        self.validate_required(self.reporter_relation_to_accident, 'reporter_relation_to_accident')
        self.validate_required(self.event_address_info, 'event_address_info')
        self.validate_required(self.event_address_detail, 'event_address_detail')
        self.validate_required(self.confirm_hospital, 'confirm_hospital')
        self.validate_required(self.confirm_hospital_address_info, 'confirm_hospital_address_info')
        self.validate_required(self.confirm_illness_name, 'confirm_illness_name')
        self.validate_required(self.product_type, 'product_type')
        self.validate_required(self.file_list, 'file_list')
        if self.file_list:
            for k in self.file_list:
                if k:
                    k.validate()
        self.validate_required(self.entrust_guarantee_product_list, 'entrust_guarantee_product_list')
        if self.entrust_guarantee_product_list:
            for k in self.entrust_guarantee_product_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.report_no is not None:
            result['report_no'] = self.report_no
        if self.out_case_no is not None:
            result['out_case_no'] = self.out_case_no
        if self.policy_no is not None:
            result['policy_no'] = self.policy_no
        if self.entrust_insurance_company_id is not None:
            result['entrust_insurance_company_id'] = self.entrust_insurance_company_id
        if self.invest_end_time is not None:
            result['invest_end_time'] = self.invest_end_time
        if self.entrust_name is not None:
            result['entrust_name'] = self.entrust_name
        if self.entrust_tel is not None:
            result['entrust_tel'] = self.entrust_tel
        if self.entrust_time is not None:
            result['entrust_time'] = self.entrust_time
        if self.accident_tel is not None:
            result['accident_tel'] = self.accident_tel
        if self.accident_name is not None:
            result['accident_name'] = self.accident_name
        if self.accident_card_no is not None:
            result['accident_card_no'] = self.accident_card_no
        if self.accident_card_type is not None:
            result['accident_card_type'] = self.accident_card_type
        if self.accident_desc is not None:
            result['accident_desc'] = self.accident_desc
        if self.accident_address_info is not None:
            result['accident_address_info'] = self.accident_address_info
        if self.accident_address_detail is not None:
            result['accident_address_detail'] = self.accident_address_detail
        if self.accident_time is not None:
            result['accident_time'] = self.accident_time
        if self.reporter_tel is not None:
            result['reporter_tel'] = self.reporter_tel
        if self.reporter_name is not None:
            result['reporter_name'] = self.reporter_name
        if self.reporter_card_no is not None:
            result['reporter_card_no'] = self.reporter_card_no
        if self.reporter_card_type is not None:
            result['reporter_card_type'] = self.reporter_card_type
        if self.reporter_relation_to_accident is not None:
            result['reporter_relation_to_accident'] = self.reporter_relation_to_accident
        if self.report_time is not None:
            result['report_time'] = self.report_time
        if self.event_address_info is not None:
            result['event_address_info'] = self.event_address_info
        if self.event_address_detail is not None:
            result['event_address_detail'] = self.event_address_detail
        if self.confirm_hospital is not None:
            result['confirm_hospital'] = self.confirm_hospital
        if self.confirm_hospital_address_info is not None:
            result['confirm_hospital_address_info'] = self.confirm_hospital_address_info
        if self.confirm_illness_name is not None:
            result['confirm_illness_name'] = self.confirm_illness_name
        if self.product_type is not None:
            result['product_type'] = self.product_type
        result['file_list'] = []
        if self.file_list is not None:
            for k in self.file_list:
                result['file_list'].append(k.to_map() if k else None)
        result['entrust_guarantee_product_list'] = []
        if self.entrust_guarantee_product_list is not None:
            for k in self.entrust_guarantee_product_list:
                result['entrust_guarantee_product_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('report_no') is not None:
            self.report_no = m.get('report_no')
        if m.get('out_case_no') is not None:
            self.out_case_no = m.get('out_case_no')
        if m.get('policy_no') is not None:
            self.policy_no = m.get('policy_no')
        if m.get('entrust_insurance_company_id') is not None:
            self.entrust_insurance_company_id = m.get('entrust_insurance_company_id')
        if m.get('invest_end_time') is not None:
            self.invest_end_time = m.get('invest_end_time')
        if m.get('entrust_name') is not None:
            self.entrust_name = m.get('entrust_name')
        if m.get('entrust_tel') is not None:
            self.entrust_tel = m.get('entrust_tel')
        if m.get('entrust_time') is not None:
            self.entrust_time = m.get('entrust_time')
        if m.get('accident_tel') is not None:
            self.accident_tel = m.get('accident_tel')
        if m.get('accident_name') is not None:
            self.accident_name = m.get('accident_name')
        if m.get('accident_card_no') is not None:
            self.accident_card_no = m.get('accident_card_no')
        if m.get('accident_card_type') is not None:
            self.accident_card_type = m.get('accident_card_type')
        if m.get('accident_desc') is not None:
            self.accident_desc = m.get('accident_desc')
        if m.get('accident_address_info') is not None:
            self.accident_address_info = m.get('accident_address_info')
        if m.get('accident_address_detail') is not None:
            self.accident_address_detail = m.get('accident_address_detail')
        if m.get('accident_time') is not None:
            self.accident_time = m.get('accident_time')
        if m.get('reporter_tel') is not None:
            self.reporter_tel = m.get('reporter_tel')
        if m.get('reporter_name') is not None:
            self.reporter_name = m.get('reporter_name')
        if m.get('reporter_card_no') is not None:
            self.reporter_card_no = m.get('reporter_card_no')
        if m.get('reporter_card_type') is not None:
            self.reporter_card_type = m.get('reporter_card_type')
        if m.get('reporter_relation_to_accident') is not None:
            self.reporter_relation_to_accident = m.get('reporter_relation_to_accident')
        if m.get('report_time') is not None:
            self.report_time = m.get('report_time')
        if m.get('event_address_info') is not None:
            self.event_address_info = m.get('event_address_info')
        if m.get('event_address_detail') is not None:
            self.event_address_detail = m.get('event_address_detail')
        if m.get('confirm_hospital') is not None:
            self.confirm_hospital = m.get('confirm_hospital')
        if m.get('confirm_hospital_address_info') is not None:
            self.confirm_hospital_address_info = m.get('confirm_hospital_address_info')
        if m.get('confirm_illness_name') is not None:
            self.confirm_illness_name = m.get('confirm_illness_name')
        if m.get('product_type') is not None:
            self.product_type = m.get('product_type')
        self.file_list = []
        if m.get('file_list') is not None:
            for k in m.get('file_list'):
                temp_model = FileNode()
                self.file_list.append(temp_model.from_map(k))
        self.entrust_guarantee_product_list = []
        if m.get('entrust_guarantee_product_list') is not None:
            for k in m.get('entrust_guarantee_product_list'):
                temp_model = EntrustGuaranteeProduct()
                self.entrust_guarantee_product_list.append(temp_model.from_map(k))
        return self


class SubmitInvestigateCaseResponse(TeaModel):
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


class QueryReverseCommissionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        out_case_no: str = None,
        entrust_insurance_company_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 案件号-外部唯一
        self.out_case_no = out_case_no
        # 委托的保司ID
        self.entrust_insurance_company_id = entrust_insurance_company_id

    def validate(self):
        self.validate_required(self.out_case_no, 'out_case_no')
        self.validate_required(self.entrust_insurance_company_id, 'entrust_insurance_company_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.out_case_no is not None:
            result['out_case_no'] = self.out_case_no
        if self.entrust_insurance_company_id is not None:
            result['entrust_insurance_company_id'] = self.entrust_insurance_company_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('out_case_no') is not None:
            self.out_case_no = m.get('out_case_no')
        if m.get('entrust_insurance_company_id') is not None:
            self.entrust_insurance_company_id = m.get('entrust_insurance_company_id')
        return self


class QueryReverseCommissionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 回销结果
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class GetEmbedcardUrlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        insurance_type_code: str = None,
        insurance_company_no: str = None,
        embed_product_code: str = None,
        is_need_inquiry: bool = None,
        trade_no: str = None,
        scheme_name: str = None,
        applicant: Applicant = None,
        insured: Insured = None,
        subject_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 险种编码
        self.insurance_type_code = insurance_type_code
        # 保司编码
        self.insurance_company_no = insurance_company_no
        # 嵌入式产品编码
        self.embed_product_code = embed_product_code
        # 是否需要询价
        self.is_need_inquiry = is_need_inquiry
        # 交易流水号，调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。 yyyyMMdd请传递当前时间。 身份标识可自定义。 其他编码建议为随机值。 当极端场景中，系统会返回错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
        self.trade_no = trade_no
        # 方案名称
        self.scheme_name = scheme_name
        # 投保人
        self.applicant = applicant
        # 被保人
        self.insured = insured
        # 投保标的
        self.subject_info = subject_info

    def validate(self):
        self.validate_required(self.insurance_type_code, 'insurance_type_code')
        if self.insurance_type_code is not None:
            self.validate_max_length(self.insurance_type_code, 'insurance_type_code', 32)
        self.validate_required(self.insurance_company_no, 'insurance_company_no')
        if self.insurance_company_no is not None:
            self.validate_max_length(self.insurance_company_no, 'insurance_company_no', 32)
        self.validate_required(self.embed_product_code, 'embed_product_code')
        if self.embed_product_code is not None:
            self.validate_max_length(self.embed_product_code, 'embed_product_code', 32)
        self.validate_required(self.is_need_inquiry, 'is_need_inquiry')
        self.validate_required(self.trade_no, 'trade_no')
        if self.trade_no is not None:
            self.validate_max_length(self.trade_no, 'trade_no', 128)
        self.validate_required(self.scheme_name, 'scheme_name')
        if self.scheme_name is not None:
            self.validate_max_length(self.scheme_name, 'scheme_name', 32)
        self.validate_required(self.applicant, 'applicant')
        if self.applicant:
            self.applicant.validate()
        self.validate_required(self.insured, 'insured')
        if self.insured:
            self.insured.validate()
        self.validate_required(self.subject_info, 'subject_info')
        if self.subject_info is not None:
            self.validate_max_length(self.subject_info, 'subject_info', 1000)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.insurance_type_code is not None:
            result['insurance_type_code'] = self.insurance_type_code
        if self.insurance_company_no is not None:
            result['insurance_company_no'] = self.insurance_company_no
        if self.embed_product_code is not None:
            result['embed_product_code'] = self.embed_product_code
        if self.is_need_inquiry is not None:
            result['is_need_inquiry'] = self.is_need_inquiry
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        if self.scheme_name is not None:
            result['scheme_name'] = self.scheme_name
        if self.applicant is not None:
            result['applicant'] = self.applicant.to_map()
        if self.insured is not None:
            result['insured'] = self.insured.to_map()
        if self.subject_info is not None:
            result['subject_info'] = self.subject_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('insurance_type_code') is not None:
            self.insurance_type_code = m.get('insurance_type_code')
        if m.get('insurance_company_no') is not None:
            self.insurance_company_no = m.get('insurance_company_no')
        if m.get('embed_product_code') is not None:
            self.embed_product_code = m.get('embed_product_code')
        if m.get('is_need_inquiry') is not None:
            self.is_need_inquiry = m.get('is_need_inquiry')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        if m.get('scheme_name') is not None:
            self.scheme_name = m.get('scheme_name')
        if m.get('applicant') is not None:
            temp_model = Applicant()
            self.applicant = temp_model.from_map(m['applicant'])
        if m.get('insured') is not None:
            temp_model = Insured()
            self.insured = temp_model.from_map(m['insured'])
        if m.get('subject_info') is not None:
            self.subject_info = m.get('subject_info')
        return self


class GetEmbedcardUrlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trade_no: str = None,
        insurance_type_code: str = None,
        insurance_company_no: str = None,
        embed_product_code: str = None,
        embed_product_url: str = None,
        scheme_name: str = None,
        premium: str = None,
        inquiry_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易流水号
        self.trade_no = trade_no
        # 险种编码
        self.insurance_type_code = insurance_type_code
        # 保司编码
        self.insurance_company_no = insurance_company_no
        # 嵌入式产品编码
        self.embed_product_code = embed_product_code
        # 嵌入式产品URL地址
        self.embed_product_url = embed_product_url
        # 方案名称
        self.scheme_name = scheme_name
        # 保费
        self.premium = premium
        # 询价编码
        self.inquiry_no = inquiry_no

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
        if self.insurance_type_code is not None:
            result['insurance_type_code'] = self.insurance_type_code
        if self.insurance_company_no is not None:
            result['insurance_company_no'] = self.insurance_company_no
        if self.embed_product_code is not None:
            result['embed_product_code'] = self.embed_product_code
        if self.embed_product_url is not None:
            result['embed_product_url'] = self.embed_product_url
        if self.scheme_name is not None:
            result['scheme_name'] = self.scheme_name
        if self.premium is not None:
            result['premium'] = self.premium
        if self.inquiry_no is not None:
            result['inquiry_no'] = self.inquiry_no
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
        if m.get('insurance_type_code') is not None:
            self.insurance_type_code = m.get('insurance_type_code')
        if m.get('insurance_company_no') is not None:
            self.insurance_company_no = m.get('insurance_company_no')
        if m.get('embed_product_code') is not None:
            self.embed_product_code = m.get('embed_product_code')
        if m.get('embed_product_url') is not None:
            self.embed_product_url = m.get('embed_product_url')
        if m.get('scheme_name') is not None:
            self.scheme_name = m.get('scheme_name')
        if m.get('premium') is not None:
            self.premium = m.get('premium')
        if m.get('inquiry_no') is not None:
            self.inquiry_no = m.get('inquiry_no')
        return self


class IssueEmbedcardPaysucRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        insurance_type_code: str = None,
        insurance_company_no: str = None,
        embed_product_code: str = None,
        trade_no: str = None,
        scheme_name: str = None,
        premium: str = None,
        premium_payment_channel: str = None,
        premium_payment_no: str = None,
        premium_payment_amount: str = None,
        premium_payment_time: str = None,
        inquiry_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 险种编码
        self.insurance_type_code = insurance_type_code
        # 保司编码
        self.insurance_company_no = insurance_company_no
        # 嵌入式产品编码
        self.embed_product_code = embed_product_code
        # 交易流水号
        self.trade_no = trade_no
        # 方案名称
        self.scheme_name = scheme_name
        # 保费，保留2位小数
        self.premium = premium
        # 保费支付渠道，01-支付宝、02-微信支付、03-银行卡支付、04-平台账户余额支付
        self.premium_payment_channel = premium_payment_channel
        # 保费支付流水号
        self.premium_payment_no = premium_payment_no
        # 保费支付金额，保留2位小数
        self.premium_payment_amount = premium_payment_amount
        # 保费支付时间
        self.premium_payment_time = premium_payment_time
        # 询价编码
        self.inquiry_no = inquiry_no

    def validate(self):
        self.validate_required(self.insurance_type_code, 'insurance_type_code')
        if self.insurance_type_code is not None:
            self.validate_max_length(self.insurance_type_code, 'insurance_type_code', 32)
        self.validate_required(self.insurance_company_no, 'insurance_company_no')
        if self.insurance_company_no is not None:
            self.validate_max_length(self.insurance_company_no, 'insurance_company_no', 32)
        self.validate_required(self.embed_product_code, 'embed_product_code')
        if self.embed_product_code is not None:
            self.validate_max_length(self.embed_product_code, 'embed_product_code', 32)
        self.validate_required(self.trade_no, 'trade_no')
        if self.trade_no is not None:
            self.validate_max_length(self.trade_no, 'trade_no', 128)
        self.validate_required(self.scheme_name, 'scheme_name')
        if self.scheme_name is not None:
            self.validate_max_length(self.scheme_name, 'scheme_name', 32)
        self.validate_required(self.premium, 'premium')
        self.validate_required(self.premium_payment_channel, 'premium_payment_channel')
        if self.premium_payment_channel is not None:
            self.validate_max_length(self.premium_payment_channel, 'premium_payment_channel', 32)
        self.validate_required(self.premium_payment_no, 'premium_payment_no')
        if self.premium_payment_no is not None:
            self.validate_max_length(self.premium_payment_no, 'premium_payment_no', 128)
        self.validate_required(self.premium_payment_amount, 'premium_payment_amount')
        self.validate_required(self.premium_payment_time, 'premium_payment_time')
        if self.premium_payment_time is not None:
            self.validate_pattern(self.premium_payment_time, 'premium_payment_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.inquiry_no, 'inquiry_no')
        if self.inquiry_no is not None:
            self.validate_max_length(self.inquiry_no, 'inquiry_no', 32)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.insurance_type_code is not None:
            result['insurance_type_code'] = self.insurance_type_code
        if self.insurance_company_no is not None:
            result['insurance_company_no'] = self.insurance_company_no
        if self.embed_product_code is not None:
            result['embed_product_code'] = self.embed_product_code
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        if self.scheme_name is not None:
            result['scheme_name'] = self.scheme_name
        if self.premium is not None:
            result['premium'] = self.premium
        if self.premium_payment_channel is not None:
            result['premium_payment_channel'] = self.premium_payment_channel
        if self.premium_payment_no is not None:
            result['premium_payment_no'] = self.premium_payment_no
        if self.premium_payment_amount is not None:
            result['premium_payment_amount'] = self.premium_payment_amount
        if self.premium_payment_time is not None:
            result['premium_payment_time'] = self.premium_payment_time
        if self.inquiry_no is not None:
            result['inquiry_no'] = self.inquiry_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('insurance_type_code') is not None:
            self.insurance_type_code = m.get('insurance_type_code')
        if m.get('insurance_company_no') is not None:
            self.insurance_company_no = m.get('insurance_company_no')
        if m.get('embed_product_code') is not None:
            self.embed_product_code = m.get('embed_product_code')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        if m.get('scheme_name') is not None:
            self.scheme_name = m.get('scheme_name')
        if m.get('premium') is not None:
            self.premium = m.get('premium')
        if m.get('premium_payment_channel') is not None:
            self.premium_payment_channel = m.get('premium_payment_channel')
        if m.get('premium_payment_no') is not None:
            self.premium_payment_no = m.get('premium_payment_no')
        if m.get('premium_payment_amount') is not None:
            self.premium_payment_amount = m.get('premium_payment_amount')
        if m.get('premium_payment_time') is not None:
            self.premium_payment_time = m.get('premium_payment_time')
        if m.get('inquiry_no') is not None:
            self.inquiry_no = m.get('inquiry_no')
        return self


class IssueEmbedcardPaysucResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trade_no: str = None,
        insurance_type_code: str = None,
        insurance_company_no: str = None,
        embed_product_code: str = None,
        scheme_name: str = None,
        insure_start: str = None,
        insure_end: str = None,
        premium: str = None,
        amount: str = None,
        inquiry_no: str = None,
        voucher_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易流水号
        self.trade_no = trade_no
        # 险种编码
        self.insurance_type_code = insurance_type_code
        # 保司编码
        self.insurance_company_no = insurance_company_no
        # 嵌入式产品编码
        self.embed_product_code = embed_product_code
        # 方案名称
        self.scheme_name = scheme_name
        # 保险起期
        self.insure_start = insure_start
        # 保险止期
        self.insure_end = insure_end
        # 保费，保留2位小数
        self.premium = premium
        # 保额，保留2位小数
        self.amount = amount
        # 询价编码
        self.inquiry_no = inquiry_no
        # 保险凭证号
        self.voucher_no = voucher_no

    def validate(self):
        if self.insure_start is not None:
            self.validate_pattern(self.insure_start, 'insure_start', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.insure_end is not None:
            self.validate_pattern(self.insure_end, 'insure_end', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
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
        if self.insurance_type_code is not None:
            result['insurance_type_code'] = self.insurance_type_code
        if self.insurance_company_no is not None:
            result['insurance_company_no'] = self.insurance_company_no
        if self.embed_product_code is not None:
            result['embed_product_code'] = self.embed_product_code
        if self.scheme_name is not None:
            result['scheme_name'] = self.scheme_name
        if self.insure_start is not None:
            result['insure_start'] = self.insure_start
        if self.insure_end is not None:
            result['insure_end'] = self.insure_end
        if self.premium is not None:
            result['premium'] = self.premium
        if self.amount is not None:
            result['amount'] = self.amount
        if self.inquiry_no is not None:
            result['inquiry_no'] = self.inquiry_no
        if self.voucher_no is not None:
            result['voucher_no'] = self.voucher_no
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
        if m.get('insurance_type_code') is not None:
            self.insurance_type_code = m.get('insurance_type_code')
        if m.get('insurance_company_no') is not None:
            self.insurance_company_no = m.get('insurance_company_no')
        if m.get('embed_product_code') is not None:
            self.embed_product_code = m.get('embed_product_code')
        if m.get('scheme_name') is not None:
            self.scheme_name = m.get('scheme_name')
        if m.get('insure_start') is not None:
            self.insure_start = m.get('insure_start')
        if m.get('insure_end') is not None:
            self.insure_end = m.get('insure_end')
        if m.get('premium') is not None:
            self.premium = m.get('premium')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('inquiry_no') is not None:
            self.inquiry_no = m.get('inquiry_no')
        if m.get('voucher_no') is not None:
            self.voucher_no = m.get('voucher_no')
        return self


class GetEmbedoemautoinsuranceUrlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_no: str = None,
        product_code: str = None,
        biz_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 调用方生成的唯一编码，参考格式： yyyyMMdd_xxxxx，已接口请求的当前日期开头；
        self.request_no = request_no
        # 产品编码
        self.product_code = product_code
        # 业务参数，json格式
        self.biz_info = biz_info

    def validate(self):
        self.validate_required(self.request_no, 'request_no')
        if self.request_no is not None:
            self.validate_max_length(self.request_no, 'request_no', 128)
        self.validate_required(self.product_code, 'product_code')
        if self.product_code is not None:
            self.validate_max_length(self.product_code, 'product_code', 64)
        self.validate_required(self.biz_info, 'biz_info')
        if self.biz_info is not None:
            self.validate_max_length(self.biz_info, 'biz_info', 1000)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_no is not None:
            result['request_no'] = self.request_no
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.biz_info is not None:
            result['biz_info'] = self.biz_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_no') is not None:
            self.request_no = m.get('request_no')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('biz_info') is not None:
            self.biz_info = m.get('biz_info')
        return self


class GetEmbedoemautoinsuranceUrlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        url: str = None,
        request_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # url链接
        self.url = url
        # 请求流水号
        self.request_no = request_no

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
        if self.request_no is not None:
            result['request_no'] = self.request_no
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
        if m.get('request_no') is not None:
            self.request_no = m.get('request_no')
        return self


class GetRightplatformUrlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        right_apply_no: str = None,
        apply_limit_amount: str = None,
        data_licensor: str = None,
        callback_url: str = None,
        product_code: str = None,
        tbr_name: str = None,
        tbr_phone: str = None,
        tbr_id_card: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 权益申请编号
        self.right_apply_no = right_apply_no
        # 申请额度，最多保留小数点后两位
        self.apply_limit_amount = apply_limit_amount
        # 数据授权方名称
        self.data_licensor = data_licensor
        # 回调场景方地址
        self.callback_url = callback_url
        # 产品编码
        self.product_code = product_code
        # 用户姓名 加密后传输
        self.tbr_name = tbr_name
        # 用户手机号，加密 && 脱敏传输
        self.tbr_phone = tbr_phone
        # 身份证， 加密 && 脱敏传输
        self.tbr_id_card = tbr_id_card

    def validate(self):
        self.validate_required(self.right_apply_no, 'right_apply_no')
        self.validate_required(self.apply_limit_amount, 'apply_limit_amount')
        self.validate_required(self.data_licensor, 'data_licensor')
        self.validate_required(self.callback_url, 'callback_url')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.tbr_name, 'tbr_name')
        self.validate_required(self.tbr_phone, 'tbr_phone')
        self.validate_required(self.tbr_id_card, 'tbr_id_card')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.right_apply_no is not None:
            result['right_apply_no'] = self.right_apply_no
        if self.apply_limit_amount is not None:
            result['apply_limit_amount'] = self.apply_limit_amount
        if self.data_licensor is not None:
            result['data_licensor'] = self.data_licensor
        if self.callback_url is not None:
            result['callback_url'] = self.callback_url
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.tbr_name is not None:
            result['tbr_name'] = self.tbr_name
        if self.tbr_phone is not None:
            result['tbr_phone'] = self.tbr_phone
        if self.tbr_id_card is not None:
            result['tbr_id_card'] = self.tbr_id_card
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('right_apply_no') is not None:
            self.right_apply_no = m.get('right_apply_no')
        if m.get('apply_limit_amount') is not None:
            self.apply_limit_amount = m.get('apply_limit_amount')
        if m.get('data_licensor') is not None:
            self.data_licensor = m.get('data_licensor')
        if m.get('callback_url') is not None:
            self.callback_url = m.get('callback_url')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('tbr_name') is not None:
            self.tbr_name = m.get('tbr_name')
        if m.get('tbr_phone') is not None:
            self.tbr_phone = m.get('tbr_phone')
        if m.get('tbr_id_card') is not None:
            self.tbr_id_card = m.get('tbr_id_card')
        return self


class GetRightplatformUrlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        right_apply_no: str = None,
        right_url: str = None,
        product_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 权益申请编号
        self.right_apply_no = right_apply_no
        # 权益产品地址
        self.right_url = right_url
        # 两轮车延保险产品id
        # 
        self.product_id = product_id

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
        if self.right_apply_no is not None:
            result['right_apply_no'] = self.right_apply_no
        if self.right_url is not None:
            result['right_url'] = self.right_url
        if self.product_id is not None:
            result['product_id'] = self.product_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('right_apply_no') is not None:
            self.right_apply_no = m.get('right_apply_no')
        if m.get('right_url') is not None:
            self.right_url = m.get('right_url')
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        return self


class UpdateRightplatformApplyinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        right_apply_no: str = None,
        apply_limit_amount: str = None,
        apply_status: str = None,
        apply_info: str = None,
        product_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 申请权益编号
        self.right_apply_no = right_apply_no
        # 申请额度
        self.apply_limit_amount = apply_limit_amount
        # 申请额度状态
        self.apply_status = apply_status
        # 投保信息，json字符串
        self.apply_info = apply_info
        # 产品编码
        self.product_code = product_code

    def validate(self):
        self.validate_required(self.right_apply_no, 'right_apply_no')
        self.validate_required(self.apply_limit_amount, 'apply_limit_amount')
        self.validate_required(self.apply_status, 'apply_status')
        self.validate_required(self.apply_info, 'apply_info')
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.right_apply_no is not None:
            result['right_apply_no'] = self.right_apply_no
        if self.apply_limit_amount is not None:
            result['apply_limit_amount'] = self.apply_limit_amount
        if self.apply_status is not None:
            result['apply_status'] = self.apply_status
        if self.apply_info is not None:
            result['apply_info'] = self.apply_info
        if self.product_code is not None:
            result['product_code'] = self.product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('right_apply_no') is not None:
            self.right_apply_no = m.get('right_apply_no')
        if m.get('apply_limit_amount') is not None:
            self.apply_limit_amount = m.get('apply_limit_amount')
        if m.get('apply_status') is not None:
            self.apply_status = m.get('apply_status')
        if m.get('apply_info') is not None:
            self.apply_info = m.get('apply_info')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        return self


class UpdateRightplatformApplyinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        right_apply_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 申请权益编号
        self.right_apply_no = right_apply_no

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
        if self.right_apply_no is not None:
            result['right_apply_no'] = self.right_apply_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('right_apply_no') is not None:
            self.right_apply_no = m.get('right_apply_no')
        return self


class NotifyInterestScenesubjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_no: str = None,
        interest_no: str = None,
        product_code: str = None,
        apply_limit_amount: str = None,
        apply_limit_status: str = None,
        interest_subject_info: str = None,
        interest_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求流水号，每次请求不一样
        self.request_no = request_no
        # 权益流水号
        self.interest_no = interest_no
        # 产品编码
        self.product_code = product_code
        # 申请审批额度，单位元
        self.apply_limit_amount = apply_limit_amount
        # 申请额度审批状态
        self.apply_limit_status = apply_limit_status
        # 权益标的信息,JSON字符串
        self.interest_subject_info = interest_subject_info
        # 权益版本
        self.interest_version = interest_version

    def validate(self):
        self.validate_required(self.request_no, 'request_no')
        self.validate_required(self.interest_no, 'interest_no')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.apply_limit_status, 'apply_limit_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_no is not None:
            result['request_no'] = self.request_no
        if self.interest_no is not None:
            result['interest_no'] = self.interest_no
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.apply_limit_amount is not None:
            result['apply_limit_amount'] = self.apply_limit_amount
        if self.apply_limit_status is not None:
            result['apply_limit_status'] = self.apply_limit_status
        if self.interest_subject_info is not None:
            result['interest_subject_info'] = self.interest_subject_info
        if self.interest_version is not None:
            result['interest_version'] = self.interest_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_no') is not None:
            self.request_no = m.get('request_no')
        if m.get('interest_no') is not None:
            self.interest_no = m.get('interest_no')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('apply_limit_amount') is not None:
            self.apply_limit_amount = m.get('apply_limit_amount')
        if m.get('apply_limit_status') is not None:
            self.apply_limit_status = m.get('apply_limit_status')
        if m.get('interest_subject_info') is not None:
            self.interest_subject_info = m.get('interest_subject_info')
        if m.get('interest_version') is not None:
            self.interest_version = m.get('interest_version')
        return self


class NotifyInterestScenesubjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # json字符串
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class QueryInterestSuppliersubjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        order_no: str = None,
        interest_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 订单号
        self.order_no = order_no
        # 权益流水号
        self.interest_no = interest_no

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.interest_no, 'interest_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.interest_no is not None:
            result['interest_no'] = self.interest_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('interest_no') is not None:
            self.interest_no = m.get('interest_no')
        return self


class QueryInterestSuppliersubjectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # json字符串
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class NotifyInterestSupplierpolicyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_no: str = None,
        interest_no: str = None,
        policy_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求流水号，每次推送需要唯一
        self.request_no = request_no
        # 我方权益申请流水号
        self.interest_no = interest_no
        # 保单信息 json字符串
        self.policy_info = policy_info

    def validate(self):
        self.validate_required(self.request_no, 'request_no')
        self.validate_required(self.interest_no, 'interest_no')
        self.validate_required(self.policy_info, 'policy_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_no is not None:
            result['request_no'] = self.request_no
        if self.interest_no is not None:
            result['interest_no'] = self.interest_no
        if self.policy_info is not None:
            result['policy_info'] = self.policy_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_no') is not None:
            self.request_no = m.get('request_no')
        if m.get('interest_no') is not None:
            self.interest_no = m.get('interest_no')
        if m.get('policy_info') is not None:
            self.policy_info = m.get('policy_info')
        return self


class NotifyInterestSupplierpolicyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # json字符串
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class GetInterestUrlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        right_apply_no: str = None,
        apply_limit_amount: str = None,
        data_licensor: str = None,
        callback_url: str = None,
        product_code: str = None,
        tbr_name: str = None,
        tbr_phone: str = None,
        tbr_id_card: str = None,
        scene_info: str = None,
        interest_version: str = None,
        product_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 权益申请编号，重新提交需要不一样
        self.right_apply_no = right_apply_no
        # 
        # 申请额度，最多保留小数点后两位，单位元
        self.apply_limit_amount = apply_limit_amount
        # 
        # 数据授权方名称
        self.data_licensor = data_licensor
        # 回调场景方地址
        self.callback_url = callback_url
        # 权益产品编码，暂时固定
        self.product_code = product_code
        # 用户姓名 明文
        self.tbr_name = tbr_name
        # 用户手机号，明文
        self.tbr_phone = tbr_phone
        # 用户身份证，明文
        self.tbr_id_card = tbr_id_card
        # 场景方信息,JSON字符串
        self.scene_info = scene_info
        # 权益版本
        self.interest_version = interest_version
        # 产品信息
        self.product_info = product_info

    def validate(self):
        self.validate_required(self.right_apply_no, 'right_apply_no')
        self.validate_required(self.apply_limit_amount, 'apply_limit_amount')
        self.validate_required(self.data_licensor, 'data_licensor')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.tbr_name, 'tbr_name')
        self.validate_required(self.tbr_phone, 'tbr_phone')
        self.validate_required(self.tbr_id_card, 'tbr_id_card')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.right_apply_no is not None:
            result['right_apply_no'] = self.right_apply_no
        if self.apply_limit_amount is not None:
            result['apply_limit_amount'] = self.apply_limit_amount
        if self.data_licensor is not None:
            result['data_licensor'] = self.data_licensor
        if self.callback_url is not None:
            result['callback_url'] = self.callback_url
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.tbr_name is not None:
            result['tbr_name'] = self.tbr_name
        if self.tbr_phone is not None:
            result['tbr_phone'] = self.tbr_phone
        if self.tbr_id_card is not None:
            result['tbr_id_card'] = self.tbr_id_card
        if self.scene_info is not None:
            result['scene_info'] = self.scene_info
        if self.interest_version is not None:
            result['interest_version'] = self.interest_version
        if self.product_info is not None:
            result['product_info'] = self.product_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('right_apply_no') is not None:
            self.right_apply_no = m.get('right_apply_no')
        if m.get('apply_limit_amount') is not None:
            self.apply_limit_amount = m.get('apply_limit_amount')
        if m.get('data_licensor') is not None:
            self.data_licensor = m.get('data_licensor')
        if m.get('callback_url') is not None:
            self.callback_url = m.get('callback_url')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('tbr_name') is not None:
            self.tbr_name = m.get('tbr_name')
        if m.get('tbr_phone') is not None:
            self.tbr_phone = m.get('tbr_phone')
        if m.get('tbr_id_card') is not None:
            self.tbr_id_card = m.get('tbr_id_card')
        if m.get('scene_info') is not None:
            self.scene_info = m.get('scene_info')
        if m.get('interest_version') is not None:
            self.interest_version = m.get('interest_version')
        if m.get('product_info') is not None:
            self.product_info = m.get('product_info')
        return self


class GetInterestUrlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # json字符串
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class QueryInterestSceneorderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_no: str = None,
        interest_no: str = None,
        product_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求流水号
        self.request_no = request_no
        # 我方权益申请流水号
        self.interest_no = interest_no
        # 产品编码
        self.product_code = product_code

    def validate(self):
        self.validate_required(self.request_no, 'request_no')
        self.validate_required(self.interest_no, 'interest_no')
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_no is not None:
            result['request_no'] = self.request_no
        if self.interest_no is not None:
            result['interest_no'] = self.interest_no
        if self.product_code is not None:
            result['product_code'] = self.product_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_no') is not None:
            self.request_no = m.get('request_no')
        if m.get('interest_no') is not None:
            self.interest_no = m.get('interest_no')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        return self


class QueryInterestSceneorderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # json字符串
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class NotifyInterestSupplierorderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_no: str = None,
        order_no: str = None,
        interest_no: str = None,
        user_permit_status: str = None,
        order_status: str = None,
        refund_amount: str = None,
        refund_time: str = None,
        notary_status: str = None,
        payment_time: str = None,
        interest_version: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求流水号，每次唯一
        self.request_no = request_no
        # 贵方订单号
        self.order_no = order_no
        # 我方权益编号
        self.interest_no = interest_no
        # 用户授权状态
        self.user_permit_status = user_permit_status
        # 权益订单状态
        self.order_status = order_status
        # 退款金额，单位元
        self.refund_amount = refund_amount
        # 退款时间
        self.refund_time = refund_time
        # 公证状态
        self.notary_status = notary_status
        # 支付时间
        self.payment_time = payment_time
        # 版本号
        self.interest_version = interest_version

    def validate(self):
        self.validate_required(self.request_no, 'request_no')
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.interest_no, 'interest_no')
        self.validate_required(self.user_permit_status, 'user_permit_status')
        self.validate_required(self.order_status, 'order_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_no is not None:
            result['request_no'] = self.request_no
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.interest_no is not None:
            result['interest_no'] = self.interest_no
        if self.user_permit_status is not None:
            result['user_permit_status'] = self.user_permit_status
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.refund_amount is not None:
            result['refund_amount'] = self.refund_amount
        if self.refund_time is not None:
            result['refund_time'] = self.refund_time
        if self.notary_status is not None:
            result['notary_status'] = self.notary_status
        if self.payment_time is not None:
            result['payment_time'] = self.payment_time
        if self.interest_version is not None:
            result['interest_version'] = self.interest_version
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_no') is not None:
            self.request_no = m.get('request_no')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('interest_no') is not None:
            self.interest_no = m.get('interest_no')
        if m.get('user_permit_status') is not None:
            self.user_permit_status = m.get('user_permit_status')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('refund_amount') is not None:
            self.refund_amount = m.get('refund_amount')
        if m.get('refund_time') is not None:
            self.refund_time = m.get('refund_time')
        if m.get('notary_status') is not None:
            self.notary_status = m.get('notary_status')
        if m.get('payment_time') is not None:
            self.payment_time = m.get('payment_time')
        if m.get('interest_version') is not None:
            self.interest_version = m.get('interest_version')
        return self


class NotifyInterestSupplierorderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # json字符串
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class ReceiveLeadMarketRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        lead_id: str = None,
        product_code: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 线索唯一id
        self.lead_id = lead_id
        # 本次固定传LMKT_LEADS_TRANSFER
        self.product_code = product_code
        # 业务参数，json
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.lead_id, 'lead_id')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.biz_content, 'biz_content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.lead_id is not None:
            result['lead_id'] = self.lead_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('lead_id') is not None:
            self.lead_id = m.get('lead_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class ReceiveLeadMarketResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回结果
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


class GetMarketingInsureurlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_id: str = None,
        product_code: str = None,
        channel_code: str = None,
        issue_org: str = None,
        channel_product_code: str = None,
        channel_product_type: str = None,
        insurance_plan: str = None,
        first_channel: str = None,
        second_channel: str = None,
        advertising_position: str = None,
        device_type: str = None,
        device_id: str = None,
        click_time: str = None,
        scene_order_no: str = None,
        applicant_name: str = None,
        applicant_cert_no: str = None,
        applicant_phone: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求 id，做防重校验逻辑
        # 接口根据 requestId 做防重校验逻辑，若重复会报错
        self.request_id = request_id
        # 产品编码
        self.product_code = product_code
        # 保司编码
        self.channel_code = channel_code
        # 保司出单机构编码，若没有同保司编码
        self.issue_org = issue_org
        # 保司产品编码
        self.channel_product_code = channel_product_code
        # 保险产品类型，枚举：
        # STANDARD（均分）
        # PREMIUM（大小均分）
        # GIFT_TRANSFER（赠转商）
        self.channel_product_type = channel_product_type
        # 保险方案
        self.insurance_plan = insurance_plan
        # 一级渠道编码
        self.first_channel = first_channel
        # 二级渠道编码
        self.second_channel = second_channel
        # 三级渠道/广告版位
        self.advertising_position = advertising_position
        # 设备类型/用户类型，枚举：
        # muid
        # oaid
        # caid
        # imei
        # idfa
        # userid
        self.device_type = device_type
        # 设备编号/用户编号
        self.device_id = device_id
        # 点击时间 yyyy-MM-dd HH:mm:ss
        self.click_time = click_time
        # 订单编号
        self.scene_order_no = scene_order_no
        # 投保人姓名
        self.applicant_name = applicant_name
        # 投保人证件号
        self.applicant_cert_no = applicant_cert_no
        # 投保人联系方式
        self.applicant_phone = applicant_phone

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        if self.request_id is not None:
            self.validate_max_length(self.request_id, 'request_id', 128)
        self.validate_required(self.product_code, 'product_code')
        if self.product_code is not None:
            self.validate_max_length(self.product_code, 'product_code', 128)
        self.validate_required(self.channel_code, 'channel_code')
        if self.channel_code is not None:
            self.validate_max_length(self.channel_code, 'channel_code', 64)
        self.validate_required(self.issue_org, 'issue_org')
        if self.issue_org is not None:
            self.validate_max_length(self.issue_org, 'issue_org', 64)
        self.validate_required(self.channel_product_code, 'channel_product_code')
        if self.channel_product_code is not None:
            self.validate_max_length(self.channel_product_code, 'channel_product_code', 64)
        self.validate_required(self.channel_product_type, 'channel_product_type')
        if self.channel_product_type is not None:
            self.validate_max_length(self.channel_product_type, 'channel_product_type', 64)
        self.validate_required(self.insurance_plan, 'insurance_plan')
        if self.insurance_plan is not None:
            self.validate_max_length(self.insurance_plan, 'insurance_plan', 20)
        self.validate_required(self.first_channel, 'first_channel')
        if self.first_channel is not None:
            self.validate_max_length(self.first_channel, 'first_channel', 64)
        if self.second_channel is not None:
            self.validate_max_length(self.second_channel, 'second_channel', 64)
        if self.advertising_position is not None:
            self.validate_max_length(self.advertising_position, 'advertising_position', 64)
        self.validate_required(self.device_type, 'device_type')
        if self.device_type is not None:
            self.validate_max_length(self.device_type, 'device_type', 64)
        self.validate_required(self.device_id, 'device_id')
        if self.device_id is not None:
            self.validate_max_length(self.device_id, 'device_id', 64)
        self.validate_required(self.click_time, 'click_time')
        if self.click_time is not None:
            self.validate_max_length(self.click_time, 'click_time', 20)
        self.validate_required(self.scene_order_no, 'scene_order_no')
        if self.scene_order_no is not None:
            self.validate_max_length(self.scene_order_no, 'scene_order_no', 64)
        if self.applicant_name is not None:
            self.validate_max_length(self.applicant_name, 'applicant_name', 64)
        if self.applicant_cert_no is not None:
            self.validate_max_length(self.applicant_cert_no, 'applicant_cert_no', 64)
        if self.applicant_phone is not None:
            self.validate_max_length(self.applicant_phone, 'applicant_phone', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.channel_code is not None:
            result['channel_code'] = self.channel_code
        if self.issue_org is not None:
            result['issue_org'] = self.issue_org
        if self.channel_product_code is not None:
            result['channel_product_code'] = self.channel_product_code
        if self.channel_product_type is not None:
            result['channel_product_type'] = self.channel_product_type
        if self.insurance_plan is not None:
            result['insurance_plan'] = self.insurance_plan
        if self.first_channel is not None:
            result['first_channel'] = self.first_channel
        if self.second_channel is not None:
            result['second_channel'] = self.second_channel
        if self.advertising_position is not None:
            result['advertising_position'] = self.advertising_position
        if self.device_type is not None:
            result['device_type'] = self.device_type
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.click_time is not None:
            result['click_time'] = self.click_time
        if self.scene_order_no is not None:
            result['scene_order_no'] = self.scene_order_no
        if self.applicant_name is not None:
            result['applicant_name'] = self.applicant_name
        if self.applicant_cert_no is not None:
            result['applicant_cert_no'] = self.applicant_cert_no
        if self.applicant_phone is not None:
            result['applicant_phone'] = self.applicant_phone
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('channel_code') is not None:
            self.channel_code = m.get('channel_code')
        if m.get('issue_org') is not None:
            self.issue_org = m.get('issue_org')
        if m.get('channel_product_code') is not None:
            self.channel_product_code = m.get('channel_product_code')
        if m.get('channel_product_type') is not None:
            self.channel_product_type = m.get('channel_product_type')
        if m.get('insurance_plan') is not None:
            self.insurance_plan = m.get('insurance_plan')
        if m.get('first_channel') is not None:
            self.first_channel = m.get('first_channel')
        if m.get('second_channel') is not None:
            self.second_channel = m.get('second_channel')
        if m.get('advertising_position') is not None:
            self.advertising_position = m.get('advertising_position')
        if m.get('device_type') is not None:
            self.device_type = m.get('device_type')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('click_time') is not None:
            self.click_time = m.get('click_time')
        if m.get('scene_order_no') is not None:
            self.scene_order_no = m.get('scene_order_no')
        if m.get('applicant_name') is not None:
            self.applicant_name = m.get('applicant_name')
        if m.get('applicant_cert_no') is not None:
            self.applicant_cert_no = m.get('applicant_cert_no')
        if m.get('applicant_phone') is not None:
            self.applicant_phone = m.get('applicant_phone')
        return self


class GetMarketingInsureurlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
        first_channel: str = None,
        second_channel: str = None,
        advertising_position: str = None,
        scene_order_no: str = None,
        click_id: str = None,
        insure_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求 id
        self.request_id = request_id
        # 一级渠道编码
        self.first_channel = first_channel
        # 二级渠道编码
        self.second_channel = second_channel
        # 三级渠道/广告版位
        self.advertising_position = advertising_position
        # 订单号
        self.scene_order_no = scene_order_no
        # 特征编码
        self.click_id = click_id
        # 投保页面URL
        self.insure_url = insure_url

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
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.first_channel is not None:
            result['first_channel'] = self.first_channel
        if self.second_channel is not None:
            result['second_channel'] = self.second_channel
        if self.advertising_position is not None:
            result['advertising_position'] = self.advertising_position
        if self.scene_order_no is not None:
            result['scene_order_no'] = self.scene_order_no
        if self.click_id is not None:
            result['click_id'] = self.click_id
        if self.insure_url is not None:
            result['insure_url'] = self.insure_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('first_channel') is not None:
            self.first_channel = m.get('first_channel')
        if m.get('second_channel') is not None:
            self.second_channel = m.get('second_channel')
        if m.get('advertising_position') is not None:
            self.advertising_position = m.get('advertising_position')
        if m.get('scene_order_no') is not None:
            self.scene_order_no = m.get('scene_order_no')
        if m.get('click_id') is not None:
            self.click_id = m.get('click_id')
        if m.get('insure_url') is not None:
            self.insure_url = m.get('insure_url')
        return self


class CallbackMarketingEventRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_id: str = None,
        click_id: str = None,
        click_time: str = None,
        event_code: str = None,
        event_time: str = None,
        first_channel: str = None,
        second_channel: str = None,
        advertising_position: str = None,
        event_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求 id，做防重校验逻辑
        # 接口根据 requestId 做防重校验逻辑，若重复会报错
        # 
        self.request_id = request_id
        # 特征编码
        self.click_id = click_id
        # 点击时间
        self.click_time = click_time
        # 事件类型，枚举：
        # RESERVATION_CHECK（留资）；
        # FIRST_PICK_FREE（领增）；
        # LOW_INSURANCE（低价险）；
        # HIGH_INSURANCE（高价险）；
        self.event_code = event_code
        # 事件完成时间（yyyy-MM-dd  HH:mm:ss）
        self.event_time = event_time
        # 一级渠道编码
        self.first_channel = first_channel
        # 二级渠道编码
        self.second_channel = second_channel
        # 三级渠道/广告版位
        self.advertising_position = advertising_position
        # 业务字段，json格式
        self.event_info = event_info

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        if self.request_id is not None:
            self.validate_max_length(self.request_id, 'request_id', 128)
        self.validate_required(self.click_id, 'click_id')
        if self.click_id is not None:
            self.validate_max_length(self.click_id, 'click_id', 64)
        self.validate_required(self.click_time, 'click_time')
        if self.click_time is not None:
            self.validate_max_length(self.click_time, 'click_time', 20)
        self.validate_required(self.event_code, 'event_code')
        if self.event_code is not None:
            self.validate_max_length(self.event_code, 'event_code', 20)
        self.validate_required(self.event_time, 'event_time')
        if self.event_time is not None:
            self.validate_max_length(self.event_time, 'event_time', 20)
        self.validate_required(self.first_channel, 'first_channel')
        if self.first_channel is not None:
            self.validate_max_length(self.first_channel, 'first_channel', 64)
        if self.second_channel is not None:
            self.validate_max_length(self.second_channel, 'second_channel', 64)
        if self.advertising_position is not None:
            self.validate_max_length(self.advertising_position, 'advertising_position', 64)
        self.validate_required(self.event_info, 'event_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.click_id is not None:
            result['click_id'] = self.click_id
        if self.click_time is not None:
            result['click_time'] = self.click_time
        if self.event_code is not None:
            result['event_code'] = self.event_code
        if self.event_time is not None:
            result['event_time'] = self.event_time
        if self.first_channel is not None:
            result['first_channel'] = self.first_channel
        if self.second_channel is not None:
            result['second_channel'] = self.second_channel
        if self.advertising_position is not None:
            result['advertising_position'] = self.advertising_position
        if self.event_info is not None:
            result['event_info'] = self.event_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('click_id') is not None:
            self.click_id = m.get('click_id')
        if m.get('click_time') is not None:
            self.click_time = m.get('click_time')
        if m.get('event_code') is not None:
            self.event_code = m.get('event_code')
        if m.get('event_time') is not None:
            self.event_time = m.get('event_time')
        if m.get('first_channel') is not None:
            self.first_channel = m.get('first_channel')
        if m.get('second_channel') is not None:
            self.second_channel = m.get('second_channel')
        if m.get('advertising_position') is not None:
            self.advertising_position = m.get('advertising_position')
        if m.get('event_info') is not None:
            self.event_info = m.get('event_info')
        return self


class CallbackMarketingEventResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求 id
        self.request_id = request_id

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
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class CallbackMarketingPolicycancelRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_id: str = None,
        policy_no: str = None,
        cancel_time: str = None,
        end_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求 id，做防重校验逻辑
        # 接口根据 requestId 做防重校验逻辑，若重复会报错
        self.request_id = request_id
        # 保单号（可脱敏处理）
        self.policy_no = policy_no
        # 退保时间（yyyy-MM-dd  HH:mm:ss）
        self.cancel_time = cancel_time
        # 保险止期（yyyy-MM-dd  HH:mm:ss）
        self.end_time = end_time

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.policy_no, 'policy_no')
        self.validate_required(self.cancel_time, 'cancel_time')
        self.validate_required(self.end_time, 'end_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.policy_no is not None:
            result['policy_no'] = self.policy_no
        if self.cancel_time is not None:
            result['cancel_time'] = self.cancel_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('policy_no') is not None:
            self.policy_no = m.get('policy_no')
        if m.get('cancel_time') is not None:
            self.cancel_time = m.get('cancel_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        return self


class CallbackMarketingPolicycancelResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求 id
        self.request_id = request_id

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
        if self.request_id is not None:
            result['request_id'] = self.request_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        return self


class QueryLeadMarketRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_code: str = None,
        lead_id: str = None,
        biz_content: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品编码
        self.product_code = product_code
        # 请求时的线索唯一id
        self.lead_id = lead_id
        # 业务参数
        self.biz_content = biz_content

    def validate(self):
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.lead_id, 'lead_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.lead_id is not None:
            result['lead_id'] = self.lead_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('lead_id') is not None:
            self.lead_id = m.get('lead_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        return self


class QueryLeadMarketResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # JSON字符串
        self.biz_result = biz_result

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
        if self.biz_result is not None:
            result['biz_result'] = self.biz_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_result') is not None:
            self.biz_result = m.get('biz_result')
        return self


