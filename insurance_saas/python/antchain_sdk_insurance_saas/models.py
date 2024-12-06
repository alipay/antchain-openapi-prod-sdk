# -*- coding: utf-8 -*-
# This file is auto-generated, don't edit it. Thanks.
from Tea.model import TeaModel


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


