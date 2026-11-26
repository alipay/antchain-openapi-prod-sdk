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


class ConversionDataDTO(TeaModel):
    def __init__(
        self,
        conversion_type: str = None,
        conversion_count: int = None,
    ):
        # 转化目标类型
        self.conversion_type = conversion_type
        # 目标转化量
        self.conversion_count = conversion_count

    def validate(self):
        self.validate_required(self.conversion_type, 'conversion_type')
        self.validate_required(self.conversion_count, 'conversion_count')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.conversion_type is not None:
            result['conversion_type'] = self.conversion_type
        if self.conversion_count is not None:
            result['conversion_count'] = self.conversion_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('conversion_type') is not None:
            self.conversion_type = m.get('conversion_type')
        if m.get('conversion_count') is not None:
            self.conversion_count = m.get('conversion_count')
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


class StatisticalDataDTO(TeaModel):
    def __init__(
        self,
        project: str = None,
        dimension_id: str = None,
        time_period: str = None,
        start_time: str = None,
        end_time: str = None,
        cost_money: str = None,
        media_impression_count: int = None,
        media_click_count: int = None,
        conversion_data_list: List[ConversionDataDTO] = None,
    ):
        # 项目标识
        self.project = project
        # 统计维度id
        self.dimension_id = dimension_id
        # 时间维度
        self.time_period = time_period
        # 开始时间
        self.start_time = start_time
        # 结束时间
        self.end_time = end_time
        # 花费金额
        self.cost_money = cost_money
        # 曝光量
        self.media_impression_count = media_impression_count
        # 点击量
        self.media_click_count = media_click_count
        # 目标转化量相关数据
        self.conversion_data_list = conversion_data_list

    def validate(self):
        self.validate_required(self.project, 'project')
        self.validate_required(self.dimension_id, 'dimension_id')
        self.validate_required(self.time_period, 'time_period')
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')
        self.validate_required(self.cost_money, 'cost_money')
        self.validate_required(self.media_impression_count, 'media_impression_count')
        self.validate_required(self.media_click_count, 'media_click_count')
        self.validate_required(self.conversion_data_list, 'conversion_data_list')
        if self.conversion_data_list:
            for k in self.conversion_data_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project is not None:
            result['project'] = self.project
        if self.dimension_id is not None:
            result['dimension_id'] = self.dimension_id
        if self.time_period is not None:
            result['time_period'] = self.time_period
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.cost_money is not None:
            result['cost_money'] = self.cost_money
        if self.media_impression_count is not None:
            result['media_impression_count'] = self.media_impression_count
        if self.media_click_count is not None:
            result['media_click_count'] = self.media_click_count
        result['conversion_data_list'] = []
        if self.conversion_data_list is not None:
            for k in self.conversion_data_list:
                result['conversion_data_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project') is not None:
            self.project = m.get('project')
        if m.get('dimension_id') is not None:
            self.dimension_id = m.get('dimension_id')
        if m.get('time_period') is not None:
            self.time_period = m.get('time_period')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('cost_money') is not None:
            self.cost_money = m.get('cost_money')
        if m.get('media_impression_count') is not None:
            self.media_impression_count = m.get('media_impression_count')
        if m.get('media_click_count') is not None:
            self.media_click_count = m.get('media_click_count')
        self.conversion_data_list = []
        if m.get('conversion_data_list') is not None:
            for k in m.get('conversion_data_list'):
                temp_model = ConversionDataDTO()
                self.conversion_data_list.append(temp_model.from_map(k))
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


class RealtimeMktAudience(TeaModel):
    def __init__(
        self,
        encrypted_user_id: str = None,
        ext_info: str = None,
    ):
        # 加密用户标识
        self.encrypted_user_id = encrypted_user_id
        # 扩展信息
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.encrypted_user_id, 'encrypted_user_id')
        self.validate_required(self.ext_info, 'ext_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.encrypted_user_id is not None:
            result['encrypted_user_id'] = self.encrypted_user_id
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('encrypted_user_id') is not None:
            self.encrypted_user_id = m.get('encrypted_user_id')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
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


class UploadAntcloudInsuranceMktFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        biz_content: str = None,
        request_id: str = None,
        product_code: str = None,
        data_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 文件唯一id
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 业务入参json格式字符串
        self.biz_content = biz_content
        # 请求id，每一次请求保持唯一，若重复，则报错；
        self.request_id = request_id
        # 产品编码，蚂蚁分配
        self.product_code = product_code
        # 数据类型，
        # 营销人群底包--MKT_AUD_SRC，
        # 营销人群托管底包--MKT_AUD_HOSTING_SRC
        self.data_type = data_type

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        if self.biz_content is not None:
            self.validate_max_length(self.biz_content, 'biz_content', 1024)
        self.validate_required(self.request_id, 'request_id')
        if self.request_id is not None:
            self.validate_max_length(self.request_id, 'request_id', 128)
        self.validate_required(self.product_code, 'product_code')
        if self.product_code is not None:
            self.validate_max_length(self.product_code, 'product_code', 64)
        self.validate_required(self.data_type, 'data_type')
        if self.data_type is not None:
            self.validate_max_length(self.data_type, 'data_type', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.data_type is not None:
            result['data_type'] = self.data_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        return self


class UploadAntcloudInsuranceMktFileResponse(TeaModel):
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
        # 请求id
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


class CallbackAntcloudInsuranceMktEffectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_id: str = None,
        project_id: str = None,
        marketing_mode: str = None,
        insure_short_url: str = None,
        encryption_type: str = None,
        encrypted_user_id: str = None,
        landing_visit_id: str = None,
        click_time: str = None,
        event_time: str = None,
        node_type: str = None,
        node_info: str = None,
        product_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求id，每一次请求保持唯一；若重复，则更新原数据；
        self.request_id = request_id
        # 项目ID，待蚂蚁分配
        self.project_id = project_id
        # 营销模式，AI_HANGUP_SMS("AI挂短")，
        # AI_OFFICIAL_ACCOUNT("AI公众号"),
        # BPO_WECHAT("BPO企微"),
        # AI_BPO("AI_BPO")
        self.marketing_mode = marketing_mode
        # 投保特征短链
        self.insure_short_url = insure_short_url
        # 加密类型：MD5，32位[小]
        self.encryption_type = encryption_type
        # 加密用户标识
        self.encrypted_user_id = encrypted_user_id
        # 应以识别当前用户点击投保页面的唯一标识
        self.landing_visit_id = landing_visit_id
        # 用户点击进入页面时间（格式：yyyy-MM-dd HH:mm:ss）
        self.click_time = click_time
        # 事件完成时间（yyyy-MM-dd HH:mm:ss）
        self.event_time = event_time
        # 节点类型
        self.node_type = node_type
        # 节点详细信息
        self.node_info = node_info
        # 产品 ID
        self.product_id = product_id

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        if self.request_id is not None:
            self.validate_max_length(self.request_id, 'request_id', 128)
        self.validate_required(self.project_id, 'project_id')
        if self.project_id is not None:
            self.validate_max_length(self.project_id, 'project_id', 64)
        if self.marketing_mode is not None:
            self.validate_max_length(self.marketing_mode, 'marketing_mode', 64)
        if self.insure_short_url is not None:
            self.validate_max_length(self.insure_short_url, 'insure_short_url', 256)
        self.validate_required(self.encryption_type, 'encryption_type')
        if self.encryption_type is not None:
            self.validate_max_length(self.encryption_type, 'encryption_type', 32)
        self.validate_required(self.encrypted_user_id, 'encrypted_user_id')
        if self.encrypted_user_id is not None:
            self.validate_max_length(self.encrypted_user_id, 'encrypted_user_id', 64)
        self.validate_required(self.landing_visit_id, 'landing_visit_id')
        if self.landing_visit_id is not None:
            self.validate_max_length(self.landing_visit_id, 'landing_visit_id', 128)
        if self.click_time is not None:
            self.validate_max_length(self.click_time, 'click_time', 32)
        self.validate_required(self.event_time, 'event_time')
        if self.event_time is not None:
            self.validate_max_length(self.event_time, 'event_time', 32)
        self.validate_required(self.node_type, 'node_type')
        if self.node_type is not None:
            self.validate_max_length(self.node_type, 'node_type', 64)
        if self.node_info is not None:
            self.validate_max_length(self.node_info, 'node_info', 2048)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.marketing_mode is not None:
            result['marketing_mode'] = self.marketing_mode
        if self.insure_short_url is not None:
            result['insure_short_url'] = self.insure_short_url
        if self.encryption_type is not None:
            result['encryption_type'] = self.encryption_type
        if self.encrypted_user_id is not None:
            result['encrypted_user_id'] = self.encrypted_user_id
        if self.landing_visit_id is not None:
            result['landing_visit_id'] = self.landing_visit_id
        if self.click_time is not None:
            result['click_time'] = self.click_time
        if self.event_time is not None:
            result['event_time'] = self.event_time
        if self.node_type is not None:
            result['node_type'] = self.node_type
        if self.node_info is not None:
            result['node_info'] = self.node_info
        if self.product_id is not None:
            result['product_id'] = self.product_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('marketing_mode') is not None:
            self.marketing_mode = m.get('marketing_mode')
        if m.get('insure_short_url') is not None:
            self.insure_short_url = m.get('insure_short_url')
        if m.get('encryption_type') is not None:
            self.encryption_type = m.get('encryption_type')
        if m.get('encrypted_user_id') is not None:
            self.encrypted_user_id = m.get('encrypted_user_id')
        if m.get('landing_visit_id') is not None:
            self.landing_visit_id = m.get('landing_visit_id')
        if m.get('click_time') is not None:
            self.click_time = m.get('click_time')
        if m.get('event_time') is not None:
            self.event_time = m.get('event_time')
        if m.get('node_type') is not None:
            self.node_type = m.get('node_type')
        if m.get('node_info') is not None:
            self.node_info = m.get('node_info')
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        return self


class CallbackAntcloudInsuranceMktEffectResponse(TeaModel):
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
        # 请求id
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


class CallbackAntcloudInsuranceMktLiveeffectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_id: str = None,
        project_id: str = None,
        marketing_mode: str = None,
        encryption_type: str = None,
        encrypted_user_id: str = None,
        event_time: str = None,
        node_type: str = None,
        node_info: str = None,
        landing_page_url: str = None,
        click_id: str = None,
        product_id: str = None,
        ip: str = None,
        ua: str = None,
        live_room_id: str = None,
        live_start_time: str = None,
        ext_info: str = None,
        live_session_id: str = None,
        marketing_channel: str = None,
        rta_trace_id: str = None,
        rta_exp_id: str = None,
        rtb_trace_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求id，每一次请求保持唯一；若重复，则更新原数据；
        self.request_id = request_id
        # 项目ID，待蚂蚁分配
        self.project_id = project_id
        # 营销模式
        # LIVE_STREAMING("直播")
        # ADVERTISING_TRAFFIC（"广告投流")
        self.marketing_mode = marketing_mode
        # 加密类型：MD5，32位[小]
        self.encryption_type = encryption_type
        # 加密用户标识
        self.encrypted_user_id = encrypted_user_id
        # 事件完成时间（yyyy-MM-dd HH:mm:ss）
        self.event_time = event_time
        # 节点类型
        self.node_type = node_type
        # 节点详细信息
        self.node_info = node_info
        # 只需要传输母链
        self.landing_page_url = landing_page_url
        # N	点击 ID，来自落地页 URL、小程序 path 的埋点
        self.click_id = click_id
        # 产品 ID-固定参数，与商品详情页的 H5 进行绑定
        # 或者通过埋点数据获取
        self.product_id = product_id
        # 用户 IP
        self.ip = ip
        # ua
        self.ua = ua
        # 直播间号 - 动参，每日直播时添加至 URL
        self.live_room_id = live_room_id
        # 直播间开播时间 - 动参（yyyy-MM-dd HH:mm:ss）
        self.live_start_time = live_start_time
        # 扩展字段
        self.ext_info = ext_info
        # 直播间开播场次-动参，每日每场直播时添加至 URl（唯一ID 生成规则：直播间 ID 后两位+开播时间的年（后两位）月日时分
        # 举例：若直播间 ID 为 kxz123456，开播时间为 2026-06-18 17：22，此时唯一 ID 为：562606181722
        # ）
        self.live_session_id = live_session_id
        # 媒体渠道
        self.marketing_channel = marketing_channel
        # 256	rta追踪 ID
        self.rta_trace_id = rta_trace_id
        # rta 实验 ID
        self.rta_exp_id = rta_exp_id
        # RTB追踪ID
        self.rtb_trace_id = rtb_trace_id

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.marketing_mode, 'marketing_mode')
        self.validate_required(self.event_time, 'event_time')
        self.validate_required(self.node_type, 'node_type')
        self.validate_required(self.landing_page_url, 'landing_page_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.marketing_mode is not None:
            result['marketing_mode'] = self.marketing_mode
        if self.encryption_type is not None:
            result['encryption_type'] = self.encryption_type
        if self.encrypted_user_id is not None:
            result['encrypted_user_id'] = self.encrypted_user_id
        if self.event_time is not None:
            result['event_time'] = self.event_time
        if self.node_type is not None:
            result['node_type'] = self.node_type
        if self.node_info is not None:
            result['node_info'] = self.node_info
        if self.landing_page_url is not None:
            result['landing_page_url'] = self.landing_page_url
        if self.click_id is not None:
            result['click_id'] = self.click_id
        if self.product_id is not None:
            result['product_id'] = self.product_id
        if self.ip is not None:
            result['ip'] = self.ip
        if self.ua is not None:
            result['ua'] = self.ua
        if self.live_room_id is not None:
            result['live_room_id'] = self.live_room_id
        if self.live_start_time is not None:
            result['live_start_time'] = self.live_start_time
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        if self.live_session_id is not None:
            result['live_session_id'] = self.live_session_id
        if self.marketing_channel is not None:
            result['marketing_channel'] = self.marketing_channel
        if self.rta_trace_id is not None:
            result['rta_trace_id'] = self.rta_trace_id
        if self.rta_exp_id is not None:
            result['rta_exp_id'] = self.rta_exp_id
        if self.rtb_trace_id is not None:
            result['rtb_trace_id'] = self.rtb_trace_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('marketing_mode') is not None:
            self.marketing_mode = m.get('marketing_mode')
        if m.get('encryption_type') is not None:
            self.encryption_type = m.get('encryption_type')
        if m.get('encrypted_user_id') is not None:
            self.encrypted_user_id = m.get('encrypted_user_id')
        if m.get('event_time') is not None:
            self.event_time = m.get('event_time')
        if m.get('node_type') is not None:
            self.node_type = m.get('node_type')
        if m.get('node_info') is not None:
            self.node_info = m.get('node_info')
        if m.get('landing_page_url') is not None:
            self.landing_page_url = m.get('landing_page_url')
        if m.get('click_id') is not None:
            self.click_id = m.get('click_id')
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        if m.get('ip') is not None:
            self.ip = m.get('ip')
        if m.get('ua') is not None:
            self.ua = m.get('ua')
        if m.get('live_room_id') is not None:
            self.live_room_id = m.get('live_room_id')
        if m.get('live_start_time') is not None:
            self.live_start_time = m.get('live_start_time')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        if m.get('live_session_id') is not None:
            self.live_session_id = m.get('live_session_id')
        if m.get('marketing_channel') is not None:
            self.marketing_channel = m.get('marketing_channel')
        if m.get('rta_trace_id') is not None:
            self.rta_trace_id = m.get('rta_trace_id')
        if m.get('rta_exp_id') is not None:
            self.rta_exp_id = m.get('rta_exp_id')
        if m.get('rtb_trace_id') is not None:
            self.rtb_trace_id = m.get('rtb_trace_id')
        return self


class CallbackAntcloudInsuranceMktLiveeffectResponse(TeaModel):
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
        # 请求id
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


class ApplyAntcloudInsuranceMktRealtimemktRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_id: str = None,
        project_id: str = None,
        encryption_type: str = None,
        realtime_mkt_audience_list: List[RealtimeMktAudience] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求id
        self.request_id = request_id
        # 项目ID，待蚂蚁分配
        self.project_id = project_id
        # 加密类型，MD5，32位[小]
        self.encryption_type = encryption_type
        # 实时营销人群列表
        self.realtime_mkt_audience_list = realtime_mkt_audience_list

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.encryption_type, 'encryption_type')
        self.validate_required(self.realtime_mkt_audience_list, 'realtime_mkt_audience_list')
        if self.realtime_mkt_audience_list:
            for k in self.realtime_mkt_audience_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.encryption_type is not None:
            result['encryption_type'] = self.encryption_type
        result['realtime_mkt_audience_list'] = []
        if self.realtime_mkt_audience_list is not None:
            for k in self.realtime_mkt_audience_list:
                result['realtime_mkt_audience_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('encryption_type') is not None:
            self.encryption_type = m.get('encryption_type')
        self.realtime_mkt_audience_list = []
        if m.get('realtime_mkt_audience_list') is not None:
            for k in m.get('realtime_mkt_audience_list'):
                temp_model = RealtimeMktAudience()
                self.realtime_mkt_audience_list.append(temp_model.from_map(k))
        return self


class ApplyAntcloudInsuranceMktRealtimemktResponse(TeaModel):
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
        # 请求id
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


class CallbackAntcloudInsuranceMktMonitordataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_id: str = None,
        data_type: str = None,
        data_content: str = None,
        project_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 回传请求对应id
        self.request_id = request_id
        # 监测数据回传数据类型，仅支持: POLICY_DATA（保单信息）, CANCELLATION_DATA（退保信息）, RENEWAL_DATA（续费信息）
        self.data_type = data_type
        # 监测数据回传内容
        self.data_content = data_content
        # 与待传营销数据相关联的项目id 结合数科网关租户id进行鉴权
        self.project_id = project_id

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.data_type, 'data_type')
        self.validate_required(self.data_content, 'data_content')
        self.validate_required(self.project_id, 'project_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.data_content is not None:
            result['data_content'] = self.data_content
        if self.project_id is not None:
            result['project_id'] = self.project_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('data_content') is not None:
            self.data_content = m.get('data_content')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        return self


class CallbackAntcloudInsuranceMktMonitordataResponse(TeaModel):
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
        # 回传请求对应id
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


class CallbackAntcloudInsuranceMktMediastatisticaldataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_id: str = None,
        project_id: str = None,
        media_source: str = None,
        dimension: str = None,
        statistical_data_list: List[StatisticalDataDTO] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求id
        self.request_id = request_id
        # 项目id
        self.project_id = project_id
        # 数据渠道来源，广点通(gdt) / 巨量引擎(oceanengine) / 快手(kuaishou) / 百度(baidu)
        self.media_source = media_source
        # 统计维度，区分账号（ACCOUNT） 、广告计划(ADVERTISEMENT) 、 素材（MATERIAL）
        self.dimension = dimension
        # 统计数据
        self.statistical_data_list = statistical_data_list

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.media_source, 'media_source')
        self.validate_required(self.dimension, 'dimension')
        self.validate_required(self.statistical_data_list, 'statistical_data_list')
        if self.statistical_data_list:
            for k in self.statistical_data_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.media_source is not None:
            result['media_source'] = self.media_source
        if self.dimension is not None:
            result['dimension'] = self.dimension
        result['statistical_data_list'] = []
        if self.statistical_data_list is not None:
            for k in self.statistical_data_list:
                result['statistical_data_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('media_source') is not None:
            self.media_source = m.get('media_source')
        if m.get('dimension') is not None:
            self.dimension = m.get('dimension')
        self.statistical_data_list = []
        if m.get('statistical_data_list') is not None:
            for k in m.get('statistical_data_list'):
                temp_model = StatisticalDataDTO()
                self.statistical_data_list.append(temp_model.from_map(k))
        return self


class CallbackAntcloudInsuranceMktMediastatisticaldataResponse(TeaModel):
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
        # 请求id
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


class CallbackAntcloudInsuranceMktEffectsimpleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_id: str = None,
        project_id: str = None,
        marketing_mode: str = None,
        insure_short_url: str = None,
        encryption_type: str = None,
        encrypted_user_id: str = None,
        landing_visit_id: str = None,
        node_type: str = None,
        node_status: str = None,
        event_time: str = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求id，每一次请求保持唯一；若重复，则更新原数据
        self.request_id = request_id
        # 项目ID，待蚂蚁分配
        self.project_id = project_id
        # 营销模式，枚举：LIVE_STREAMING-直播投流、ADVERTISING-广告投流、AI_WECHAT-AI企微、BPO_SHORT_HANG-BPO挂短、BPO_OFFICIAL_ACCOUNT-BPO公众号、SMS-短信
        self.marketing_mode = marketing_mode
        # 投保特征短链，挂短模式必填
        self.insure_short_url = insure_short_url
        # 加密类型：MD5，32位[小]
        self.encryption_type = encryption_type
        # 加密用户标识
        self.encrypted_user_id = encrypted_user_id
        # 用以识别当前用户点击投保页面的唯一标识
        self.landing_visit_id = landing_visit_id
        # 事件类型（节点类：LIVE_STREAMING_START/LIVE_STREAMING_END/FORM_SUBMIT/POLICY_ISSUE/PREMIUM_PAYMENT/UNDERWRITING；标签类：LABEL_SMS_SEND/LABEL_ADD/LABEL_RENEWAL_M2/LABEL_RENEWAL_M3/LABEL_INTENTION）
        self.node_type = node_type
        # 事件状态，节点类：0-未完成 1-已完成；标签类：支持1-X格式（X为标签值）
        self.node_status = node_status
        # 事件完成时间（yyyy-MM-dd HH:mm:ss）
        self.event_time = event_time
        # 扩展json字段，最大2048字符，用于传递isfrommy数据源、年化保费等扩展信息
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.encryption_type, 'encryption_type')
        self.validate_required(self.encrypted_user_id, 'encrypted_user_id')
        self.validate_required(self.landing_visit_id, 'landing_visit_id')
        self.validate_required(self.node_type, 'node_type')
        self.validate_required(self.node_status, 'node_status')
        self.validate_required(self.event_time, 'event_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.marketing_mode is not None:
            result['marketing_mode'] = self.marketing_mode
        if self.insure_short_url is not None:
            result['insure_short_url'] = self.insure_short_url
        if self.encryption_type is not None:
            result['encryption_type'] = self.encryption_type
        if self.encrypted_user_id is not None:
            result['encrypted_user_id'] = self.encrypted_user_id
        if self.landing_visit_id is not None:
            result['landing_visit_id'] = self.landing_visit_id
        if self.node_type is not None:
            result['node_type'] = self.node_type
        if self.node_status is not None:
            result['node_status'] = self.node_status
        if self.event_time is not None:
            result['event_time'] = self.event_time
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('marketing_mode') is not None:
            self.marketing_mode = m.get('marketing_mode')
        if m.get('insure_short_url') is not None:
            self.insure_short_url = m.get('insure_short_url')
        if m.get('encryption_type') is not None:
            self.encryption_type = m.get('encryption_type')
        if m.get('encrypted_user_id') is not None:
            self.encrypted_user_id = m.get('encrypted_user_id')
        if m.get('landing_visit_id') is not None:
            self.landing_visit_id = m.get('landing_visit_id')
        if m.get('node_type') is not None:
            self.node_type = m.get('node_type')
        if m.get('node_status') is not None:
            self.node_status = m.get('node_status')
        if m.get('event_time') is not None:
            self.event_time = m.get('event_time')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class CallbackAntcloudInsuranceMktEffectsimpleResponse(TeaModel):
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
        # 请求id
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


class ApplyAntcloudInsuranceMktserviceproviderAudiencecircleRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_id: str = None,
        project_id: str = None,
        biz_scene: str = None,
        encryption_type: str = None,
        encrypted_user_ids: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求id，每一次请求保持唯一；
        self.request_id = request_id
        # 项目ID，待蚂蚁分配
        self.project_id = project_id
        # 业务场景标识
        self.biz_scene = biz_scene
        # 加密类型，MD5 32位小写
        self.encryption_type = encryption_type
        # 加密用户标识
        self.encrypted_user_ids = encrypted_user_ids

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.biz_scene, 'biz_scene')
        self.validate_required(self.encryption_type, 'encryption_type')
        self.validate_required(self.encrypted_user_ids, 'encrypted_user_ids')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.biz_scene is not None:
            result['biz_scene'] = self.biz_scene
        if self.encryption_type is not None:
            result['encryption_type'] = self.encryption_type
        if self.encrypted_user_ids is not None:
            result['encrypted_user_ids'] = self.encrypted_user_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('biz_scene') is not None:
            self.biz_scene = m.get('biz_scene')
        if m.get('encryption_type') is not None:
            self.encryption_type = m.get('encryption_type')
        if m.get('encrypted_user_ids') is not None:
            self.encrypted_user_ids = m.get('encrypted_user_ids')
        return self


class ApplyAntcloudInsuranceMktserviceproviderAudiencecircleResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
        batch_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求id，每一次请求保持唯一；
        self.request_id = request_id
        # 批次号
        self.batch_no = batch_no

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
        if self.batch_no is not None:
            result['batch_no'] = self.batch_no
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
        if m.get('batch_no') is not None:
            self.batch_no = m.get('batch_no')
        return self


class GetAntcloudInsuranceMktExtresulturlRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_id: str = None,
        project_id: str = None,
        upload_mkt_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求id，每一次请求保持唯一，若重复，则报错
        self.request_id = request_id
        # 项目ID，蚂蚁分配
        self.project_id = project_id
        # 上传营销标识，来源于上传结果通知中的uploadMktNo
        self.upload_mkt_no = upload_mkt_no

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        if self.request_id is not None:
            self.validate_max_length(self.request_id, 'request_id', 128)
        self.validate_required(self.project_id, 'project_id')
        if self.project_id is not None:
            self.validate_max_length(self.project_id, 'project_id', 64)
        self.validate_required(self.upload_mkt_no, 'upload_mkt_no')
        if self.upload_mkt_no is not None:
            self.validate_max_length(self.upload_mkt_no, 'upload_mkt_no', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.upload_mkt_no is not None:
            result['upload_mkt_no'] = self.upload_mkt_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('upload_mkt_no') is not None:
            self.upload_mkt_no = m.get('upload_mkt_no')
        return self


class GetAntcloudInsuranceMktExtresulturlResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
        file_url: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求id
        self.request_id = request_id
        # 析出文件下载链接（OSS签名URL，当前有效期24小时）；为空表示析出结果尚未生成，请稍后重试。从底包上传开始7日内链接失效仍可继续获取
        self.file_url = file_url

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        if self.request_id is not None:
            self.validate_max_length(self.request_id, 'request_id', 128)
        if self.file_url is not None:
            self.validate_max_length(self.file_url, 'file_url', 1024)

    def to_map(self):
        _map = super().to_map()
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
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        return self


class ReceiveAntcloudInsuranceLeadOpportunitiesRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        request_id: str = None,
        product_code: str = None,
        biz_content: str = None,
        biz_type: str = None,
        action_type: str = None,
        accept_no: str = None,
        update_cycle: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # string
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 请求id，每一次请求保持唯一，若重复，则报错；
        self.request_id = request_id
        # 产品编码，蚂蚁分配
        self.product_code = product_code
        # 业务入参json格式字符串
        self.biz_content = biz_content
        # 固定值：PAST_MED（既往症人群评分）业务场景
        self.biz_type = biz_type
        # 场景类型:FULL_PUSH-首次下发，携带底包文件,TRIGGER_PUSH-圈客周期变更触发，不携带文件；不传按 FULL_PUSH 处理
        self.action_type = action_type
        # TRIGGER_PUSH 须传,首次 FULL_PUSH 受理回执返回的受理号，蚂蚁校验存在对应首次下发记录（查无记录受理失败）；FULL_PUSH 由蚂蚁生成并随受理回执返回
        self.accept_no = accept_no
        # 圈客周期,每周示例：{"cycleType":"WEEKLY","cycleValue":3,"time":"10:00"}，每月示例：每月10号	{"cycleType":"MONTHLY","cycleValue":10,"time":"10:00"}
        self.update_cycle = update_cycle

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.action_type, 'action_type')
        self.validate_required(self.update_cycle, 'update_cycle')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.biz_content is not None:
            result['biz_content'] = self.biz_content
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.action_type is not None:
            result['action_type'] = self.action_type
        if self.accept_no is not None:
            result['accept_no'] = self.accept_no
        if self.update_cycle is not None:
            result['update_cycle'] = self.update_cycle
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('biz_content') is not None:
            self.biz_content = m.get('biz_content')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('action_type') is not None:
            self.action_type = m.get('action_type')
        if m.get('accept_no') is not None:
            self.accept_no = m.get('accept_no')
        if m.get('update_cycle') is not None:
            self.update_cycle = m.get('update_cycle')
        return self


class ReceiveAntcloudInsuranceLeadOpportunitiesResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        request_id: str = None,
        accept_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 请求id
        self.request_id = request_id
        # 受理号：FULL_PUSH 为蚂蚁生成的受理号；TRIGGER_PUSH 为原批次受理号
        self.accept_no = accept_no

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
        if self.accept_no is not None:
            result['accept_no'] = self.accept_no
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
        if m.get('accept_no') is not None:
            self.accept_no = m.get('accept_no')
        return self


class PostbackAntcloudInsuranceLeadReceiveRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
        request_id: str = None,
        notify_type: str = None,
        action_type: str = None,
        notify_info: str = None,
        accept_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # string
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id
        # 请求id，每一次请求保持唯一，若重复，则报错；
        self.request_id = request_id
        # 通知类型：固定 LEAD_PUSH_NOTIFY（既往症线索推送通知）
        self.notify_type = notify_type
        # 动作类型：首次-FULL_PUSH，周期-TRIGGER_PUSH
        self.action_type = action_type
        # json格式数据updateCycle等字段
        self.notify_info = notify_info
        # 客户「既往症线索周期变更」受理号透传，供给方回传结果文件时随请求带回
        self.accept_no = accept_no

    def validate(self):
        self.validate_required(self.file_id, 'file_id')
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.notify_type, 'notify_type')
        self.validate_required(self.action_type, 'action_type')
        self.validate_required(self.accept_no, 'accept_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.file_object is not None:
            result['fileObject'] = self.file_object
        if self.file_object_name is not None:
            result['fileObjectName'] = self.file_object_name
        if self.file_id is not None:
            result['file_id'] = self.file_id
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.notify_type is not None:
            result['notify_type'] = self.notify_type
        if self.action_type is not None:
            result['action_type'] = self.action_type
        if self.notify_info is not None:
            result['notify_info'] = self.notify_info
        if self.accept_no is not None:
            result['accept_no'] = self.accept_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('notify_type') is not None:
            self.notify_type = m.get('notify_type')
        if m.get('action_type') is not None:
            self.action_type = m.get('action_type')
        if m.get('notify_info') is not None:
            self.notify_info = m.get('notify_info')
        if m.get('accept_no') is not None:
            self.accept_no = m.get('accept_no')
        return self


class PostbackAntcloudInsuranceLeadReceiveResponse(TeaModel):
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
        # 请求ID
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


