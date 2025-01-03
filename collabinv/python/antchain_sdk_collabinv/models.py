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


class FeatureSetInfo(TeaModel):
    def __init__(
        self,
        featureset_code: str = None,
        featureset_name: str = None,
        nums: str = None,
        desc: str = None,
    ):
        # 特征集编码
        self.featureset_code = featureset_code
        # 名称
        self.featureset_name = featureset_name
        # 数量
        self.nums = nums
        # 描述
        self.desc = desc

    def validate(self):
        self.validate_required(self.featureset_code, 'featureset_code')
        self.validate_required(self.featureset_name, 'featureset_name')
        self.validate_required(self.nums, 'nums')
        self.validate_required(self.desc, 'desc')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.featureset_code is not None:
            result['featureset_code'] = self.featureset_code
        if self.featureset_name is not None:
            result['featureset_name'] = self.featureset_name
        if self.nums is not None:
            result['nums'] = self.nums
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('featureset_code') is not None:
            self.featureset_code = m.get('featureset_code')
        if m.get('featureset_name') is not None:
            self.featureset_name = m.get('featureset_name')
        if m.get('nums') is not None:
            self.nums = m.get('nums')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class GwCallDataStats(TeaModel):
    def __init__(
        self,
        invoke_tenant: str = None,
        invoke_tenant_id: str = None,
        access_key: str = None,
        invoke_count: str = None,
        success_count: str = None,
        id: str = None,
    ):
        # 租户
        self.invoke_tenant = invoke_tenant
        # 租户ID
        self.invoke_tenant_id = invoke_tenant_id
        # 公key
        self.access_key = access_key
        # 调用数量
        self.invoke_count = invoke_count
        # 调用查得统计
        self.success_count = success_count
        # id
        self.id = id

    def validate(self):
        self.validate_required(self.id, 'id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.invoke_tenant is not None:
            result['invoke_tenant'] = self.invoke_tenant
        if self.invoke_tenant_id is not None:
            result['invoke_tenant_id'] = self.invoke_tenant_id
        if self.access_key is not None:
            result['access_key'] = self.access_key
        if self.invoke_count is not None:
            result['invoke_count'] = self.invoke_count
        if self.success_count is not None:
            result['success_count'] = self.success_count
        if self.id is not None:
            result['id'] = self.id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('invoke_tenant') is not None:
            self.invoke_tenant = m.get('invoke_tenant')
        if m.get('invoke_tenant_id') is not None:
            self.invoke_tenant_id = m.get('invoke_tenant_id')
        if m.get('access_key') is not None:
            self.access_key = m.get('access_key')
        if m.get('invoke_count') is not None:
            self.invoke_count = m.get('invoke_count')
        if m.get('success_count') is not None:
            self.success_count = m.get('success_count')
        if m.get('id') is not None:
            self.id = m.get('id')
        return self


class PageInfo(TeaModel):
    def __init__(
        self,
        total: int = None,
        page_index: int = None,
        page_size: int = None,
    ):
        # 总数量
        self.total = total
        # 当前页
        self.page_index = page_index
        # 页容量
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.page_index, 'page_index')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total is not None:
            result['total'] = self.total
        if self.page_index is not None:
            result['page_index'] = self.page_index
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryLocationInternalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id_number: str = None,
        phone_no: str = None,
        start_time: str = None,
        end_time: str = None,
        center_position: str = None,
        distinct_county: str = None,
        inv_type: int = None,
        api_service_level: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # md5加密的身份证号
        self.id_number = id_number
        # md5加密的手机号
        self.phone_no = phone_no
        # 定位时间范围开始时间
        self.start_time = start_time
        # 定位时间范围结束时间
        self.end_time = end_time
        # 核查中心位置（经度,纬度）
        self.center_position = center_position
        # 核查省市区县范围
        self.distinct_county = distinct_county
        # 协查类型：
        # 0: 为经纬度精准定位协查 (默认)
        # 1:  为区县定位 (省-市-区/县) 协查
        self.inv_type = inv_type
        # 服务级别与结果值定义
        self.api_service_level = api_service_level

    def validate(self):
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')
        self.validate_required(self.api_service_level, 'api_service_level')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id_number is not None:
            result['id_number'] = self.id_number
        if self.phone_no is not None:
            result['phone_no'] = self.phone_no
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.center_position is not None:
            result['center_position'] = self.center_position
        if self.distinct_county is not None:
            result['distinct_county'] = self.distinct_county
        if self.inv_type is not None:
            result['inv_type'] = self.inv_type
        if self.api_service_level is not None:
            result['api_service_level'] = self.api_service_level
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id_number') is not None:
            self.id_number = m.get('id_number')
        if m.get('phone_no') is not None:
            self.phone_no = m.get('phone_no')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('center_position') is not None:
            self.center_position = m.get('center_position')
        if m.get('distinct_county') is not None:
            self.distinct_county = m.get('distinct_county')
        if m.get('inv_type') is not None:
            self.inv_type = m.get('inv_type')
        if m.get('api_service_level') is not None:
            self.api_service_level = m.get('api_service_level')
        return self


class QueryLocationInternalResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        confidence_value: str = None,
        ext_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 置信度取值：A/B/C
        self.confidence_value = confidence_value
        # 扩展字段，其他信息
        self.ext_info = ext_info

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
        if self.confidence_value is not None:
            result['confidence_value'] = self.confidence_value
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('confidence_value') is not None:
            self.confidence_value = m.get('confidence_value')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class QueryLocationTradeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        id_number: str = None,
        phone_no: str = None,
        caller_id: str = None,
        start_time: str = None,
        end_time: str = None,
        center_position: str = None,
        distinct_county: str = None,
        inv_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # md5加密的身份证号
        self.id_number = id_number
        # md5加密的手机号
        self.phone_no = phone_no
        # 调用者用户ID（或外部系统业务ID）
        self.caller_id = caller_id
        # 定位时间范围开始时间
        self.start_time = start_time
        # 定位时间范围结束时间
        self.end_time = end_time
        # 核查中心位置（经度,纬度）
        self.center_position = center_position
        # 核查省市区县范围
        self.distinct_county = distinct_county
        # 协查类型：
        # 0: 为经纬度精准定位协查 (默认)
        # 1:  为区县定位 (省-市-区/县) 协查
        self.inv_type = inv_type

    def validate(self):
        if self.id_number is not None:
            self.validate_max_length(self.id_number, 'id_number', 32)
        if self.phone_no is not None:
            self.validate_max_length(self.phone_no, 'phone_no', 32)
        self.validate_required(self.caller_id, 'caller_id')
        if self.caller_id is not None:
            self.validate_max_length(self.caller_id, 'caller_id', 128)
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_max_length(self.start_time, 'start_time', 19)
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_max_length(self.end_time, 'end_time', 19)
        if self.center_position is not None:
            self.validate_max_length(self.center_position, 'center_position', 64)
        if self.distinct_county is not None:
            self.validate_max_length(self.distinct_county, 'distinct_county', 128)
        if self.inv_type is not None:
            self.validate_max_length(self.inv_type, 'inv_type', 2)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.id_number is not None:
            result['id_number'] = self.id_number
        if self.phone_no is not None:
            result['phone_no'] = self.phone_no
        if self.caller_id is not None:
            result['caller_id'] = self.caller_id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.center_position is not None:
            result['center_position'] = self.center_position
        if self.distinct_county is not None:
            result['distinct_county'] = self.distinct_county
        if self.inv_type is not None:
            result['inv_type'] = self.inv_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('id_number') is not None:
            self.id_number = m.get('id_number')
        if m.get('phone_no') is not None:
            self.phone_no = m.get('phone_no')
        if m.get('caller_id') is not None:
            self.caller_id = m.get('caller_id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('center_position') is not None:
            self.center_position = m.get('center_position')
        if m.get('distinct_county') is not None:
            self.distinct_county = m.get('distinct_county')
        if m.get('inv_type') is not None:
            self.inv_type = m.get('inv_type')
        return self


class QueryLocationTradeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        confidence_value: str = None,
        ext_info: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 置信度取值：A/B/C
        self.confidence_value = confidence_value
        # 扩展字段，其他信息
        self.ext_info = ext_info

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
        if self.confidence_value is not None:
            result['confidence_value'] = self.confidence_value
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('confidence_value') is not None:
            self.confidence_value = m.get('confidence_value')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class PushModelSamplefileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        begin_date: str = None,
        end_date: str = None,
        org_nums: int = None,
        sample_code: str = None,
        file_path: str = None,
        file_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 开始日期：示例 YYYYMMDD
        self.begin_date = begin_date
        # 样本内采样日期截止日：YYYYMMDD
        self.end_date = end_date
        # 样本数据量
        self.org_nums = org_nums
        # 样本批次号，唯一，建议：租户code+时间戳
        self.sample_code = sample_code
        # 文件路径，bucket 下路径
        self.file_path = file_path
        # 文件名,以.csv结尾，分隔符为  ","号
        self.file_name = file_name

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.begin_date, 'begin_date')
        self.validate_required(self.end_date, 'end_date')
        self.validate_required(self.org_nums, 'org_nums')
        self.validate_required(self.sample_code, 'sample_code')
        self.validate_required(self.file_path, 'file_path')
        self.validate_required(self.file_name, 'file_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.begin_date is not None:
            result['begin_date'] = self.begin_date
        if self.end_date is not None:
            result['end_date'] = self.end_date
        if self.org_nums is not None:
            result['org_nums'] = self.org_nums
        if self.sample_code is not None:
            result['sample_code'] = self.sample_code
        if self.file_path is not None:
            result['file_path'] = self.file_path
        if self.file_name is not None:
            result['file_name'] = self.file_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('begin_date') is not None:
            self.begin_date = m.get('begin_date')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        if m.get('org_nums') is not None:
            self.org_nums = m.get('org_nums')
        if m.get('sample_code') is not None:
            self.sample_code = m.get('sample_code')
        if m.get('file_path') is not None:
            self.file_path = m.get('file_path')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        return self


class PushModelSamplefileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        loop_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 轮训编码
        self.loop_code = loop_code

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
        if self.loop_code is not None:
            result['loop_code'] = self.loop_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('loop_code') is not None:
            self.loop_code = m.get('loop_code')
        return self


class ExecModelSampletaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        sample_code: str = None,
        task_code: str = None,
        task_type: str = None,
        sample_task_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 样本批次号，唯一，建议：租户code+时间戳
        self.sample_code = sample_code
        # 特征集编码或模型编码，依据类型使用
        self.task_code = task_code
        # 任务类型：特征集 FEATURESET、模型分 MODEL
        self.task_type = task_type
        # 本次事件序号编码
        self.sample_task_code = sample_task_code

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.sample_code, 'sample_code')
        self.validate_required(self.task_code, 'task_code')
        self.validate_required(self.task_type, 'task_type')
        self.validate_required(self.sample_task_code, 'sample_task_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.sample_code is not None:
            result['sample_code'] = self.sample_code
        if self.task_code is not None:
            result['task_code'] = self.task_code
        if self.task_type is not None:
            result['task_type'] = self.task_type
        if self.sample_task_code is not None:
            result['sample_task_code'] = self.sample_task_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('sample_code') is not None:
            self.sample_code = m.get('sample_code')
        if m.get('task_code') is not None:
            self.task_code = m.get('task_code')
        if m.get('task_type') is not None:
            self.task_type = m.get('task_type')
        if m.get('sample_task_code') is not None:
            self.sample_task_code = m.get('sample_task_code')
        return self


class ExecModelSampletaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        loop_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 轮训编码
        self.loop_code = loop_code

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
        if self.loop_code is not None:
            result['loop_code'] = self.loop_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('loop_code') is not None:
            self.loop_code = m.get('loop_code')
        return self


class QueryModelSampletaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        loop_code: str = None,
        phase: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 事件查询序号编码，在有loop_code接口返回值的异步接口的值
        # 如：antchain.zkcollabinv.model.samplefile.push、antchain.zkcollabinv.model.sampletask.exec
        self.loop_code = loop_code
        # 阶段：poc_050 样本提交阶段，poc_500 任务跑批阶段
        self.phase = phase

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.loop_code, 'loop_code')
        self.validate_required(self.phase, 'phase')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.loop_code is not None:
            result['loop_code'] = self.loop_code
        if self.phase is not None:
            result['phase'] = self.phase
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('loop_code') is not None:
            self.loop_code = m.get('loop_code')
        if m.get('phase') is not None:
            self.phase = m.get('phase')
        return self


class QueryModelSampletaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        progress: str = None,
        files: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 任务进度
        self.progress = progress
        # 有输出的时候会有值
        self.files = files

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
        if self.progress is not None:
            result['progress'] = self.progress
        if self.files is not None:
            result['files'] = self.files
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('progress') is not None:
            self.progress = m.get('progress')
        if m.get('files') is not None:
            self.files = m.get('files')
        return self


class QueryModelFeaturesetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        page_info: PageInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 分页信息
        self.page_info = page_info

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.page_info, 'page_info')
        if self.page_info:
            self.page_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class QueryModelFeaturesetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        featuresets: List[FeatureSetInfo] = None,
        page_info: PageInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 特征列表
        self.featuresets = featuresets
        # 分页信息
        self.page_info = page_info

    def validate(self):
        if self.featuresets:
            for k in self.featuresets:
                if k:
                    k.validate()
        if self.page_info:
            self.page_info.validate()

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
        result['featuresets'] = []
        if self.featuresets is not None:
            for k in self.featuresets:
                result['featuresets'].append(k.to_map() if k else None)
        if self.page_info is not None:
            result['page_info'] = self.page_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.featuresets = []
        if m.get('featuresets') is not None:
            for k in m.get('featuresets'):
                temp_model = FeatureSetInfo()
                self.featuresets.append(temp_model.from_map(k))
        if m.get('page_info') is not None:
            temp_model = PageInfo()
            self.page_info = temp_model.from_map(m['page_info'])
        return self


class SubmitModelInstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_code: str = None,
        model_file_path: str = None,
        features_file_path: str = None,
        demo_file_path: str = None,
        model_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户编码
        self.tenant_code = tenant_code
        # 模型文件路径
        self.model_file_path = model_file_path
        # 特征集路径
        self.features_file_path = features_file_path
        # 示例文件路径
        self.demo_file_path = demo_file_path
        # 模型编码，同一租户下唯一，后续回溯生产调用标记
        self.model_code = model_code

    def validate(self):
        self.validate_required(self.tenant_code, 'tenant_code')
        self.validate_required(self.model_file_path, 'model_file_path')
        self.validate_required(self.features_file_path, 'features_file_path')
        self.validate_required(self.model_code, 'model_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_code is not None:
            result['tenant_code'] = self.tenant_code
        if self.model_file_path is not None:
            result['model_file_path'] = self.model_file_path
        if self.features_file_path is not None:
            result['features_file_path'] = self.features_file_path
        if self.demo_file_path is not None:
            result['demo_file_path'] = self.demo_file_path
        if self.model_code is not None:
            result['model_code'] = self.model_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_code') is not None:
            self.tenant_code = m.get('tenant_code')
        if m.get('model_file_path') is not None:
            self.model_file_path = m.get('model_file_path')
        if m.get('features_file_path') is not None:
            self.features_file_path = m.get('features_file_path')
        if m.get('demo_file_path') is not None:
            self.demo_file_path = m.get('demo_file_path')
        if m.get('model_code') is not None:
            self.model_code = m.get('model_code')
        return self


class SubmitModelInstanceResponse(TeaModel):
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


class QueryModelStatsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        invoke_day: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # yyyyMMdd
        self.invoke_day = invoke_day
        # 类型：TENANT  租户；AK key维度
        self.type = type

    def validate(self):
        self.validate_required(self.invoke_day, 'invoke_day')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.invoke_day is not None:
            result['invoke_day'] = self.invoke_day
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('invoke_day') is not None:
            self.invoke_day = m.get('invoke_day')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class QueryModelStatsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        datas: List[GwCallDataStats] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据
        self.datas = datas

    def validate(self):
        if self.datas:
            for k in self.datas:
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
        result['datas'] = []
        if self.datas is not None:
            for k in self.datas:
                result['datas'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.datas = []
        if m.get('datas') is not None:
            for k in m.get('datas'):
                temp_model = GwCallDataStats()
                self.datas.append(temp_model.from_map(k))
        return self


class QueryModelCommonscoreRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_no: str = None,
        model_code: str = None,
        user_id: str = None,
        user_id_type: str = None,
        hash_type: str = None,
        customer_code: str = None,
        trans_no: str = None,
        user_id_encrypt_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户授权编码
        self.auth_no = auth_no
        # 模型编码
        self.model_code = model_code
        # 用户id（客户身份证号/手机号的md5/sha256散列值）
        self.user_id = user_id
        # 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
        self.user_id_type = user_id_type
        # user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
        self.hash_type = hash_type
        # 客户编码
        self.customer_code = customer_code
        # 流水号，串联链路用，非必填
        self.trans_no = trans_no
        # hash_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
        self.user_id_encrypt_type = user_id_encrypt_type

    def validate(self):
        self.validate_required(self.auth_no, 'auth_no')
        self.validate_required(self.model_code, 'model_code')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_id_type, 'user_id_type')
        self.validate_required(self.hash_type, 'hash_type')
        self.validate_required(self.customer_code, 'customer_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_no is not None:
            result['auth_no'] = self.auth_no
        if self.model_code is not None:
            result['model_code'] = self.model_code
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_id_type is not None:
            result['user_id_type'] = self.user_id_type
        if self.hash_type is not None:
            result['hash_type'] = self.hash_type
        if self.customer_code is not None:
            result['customer_code'] = self.customer_code
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        if self.user_id_encrypt_type is not None:
            result['user_id_encrypt_type'] = self.user_id_encrypt_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('auth_no') is not None:
            self.auth_no = m.get('auth_no')
        if m.get('model_code') is not None:
            self.model_code = m.get('model_code')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_id_type') is not None:
            self.user_id_type = m.get('user_id_type')
        if m.get('hash_type') is not None:
            self.hash_type = m.get('hash_type')
        if m.get('customer_code') is not None:
            self.customer_code = m.get('customer_code')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        if m.get('user_id_encrypt_type') is not None:
            self.user_id_encrypt_type = m.get('user_id_encrypt_type')
        return self


class QueryModelCommonscoreResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        score: str = None,
        trans_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模型分
        self.score = score
        # 流水号
        self.trans_no = trans_no

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
        if self.score is not None:
            result['score'] = self.score
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        return self


class BatchqueryModelCommonscoreRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_ids: List[str] = None,
        auth_nos: List[str] = None,
        model_code: str = None,
        user_id_type: str = None,
        hash_type: str = None,
        customer_code: str = None,
        trans_no: str = None,
        user_id_encrypt_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户ID
        self.user_ids = user_ids
        # 用户授权编码
        self.auth_nos = auth_nos
        # 模型编码
        self.model_code = model_code
        # 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
        self.user_id_type = user_id_type
        # user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
        self.hash_type = hash_type
        # 客户编码
        self.customer_code = customer_code
        # 流水号，串联链路用，非必填
        self.trans_no = trans_no
        # hash_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
        self.user_id_encrypt_type = user_id_encrypt_type

    def validate(self):
        self.validate_required(self.user_ids, 'user_ids')
        self.validate_required(self.model_code, 'model_code')
        self.validate_required(self.user_id_type, 'user_id_type')
        self.validate_required(self.hash_type, 'hash_type')
        self.validate_required(self.customer_code, 'customer_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_ids is not None:
            result['user_ids'] = self.user_ids
        if self.auth_nos is not None:
            result['auth_nos'] = self.auth_nos
        if self.model_code is not None:
            result['model_code'] = self.model_code
        if self.user_id_type is not None:
            result['user_id_type'] = self.user_id_type
        if self.hash_type is not None:
            result['hash_type'] = self.hash_type
        if self.customer_code is not None:
            result['customer_code'] = self.customer_code
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        if self.user_id_encrypt_type is not None:
            result['user_id_encrypt_type'] = self.user_id_encrypt_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_ids') is not None:
            self.user_ids = m.get('user_ids')
        if m.get('auth_nos') is not None:
            self.auth_nos = m.get('auth_nos')
        if m.get('model_code') is not None:
            self.model_code = m.get('model_code')
        if m.get('user_id_type') is not None:
            self.user_id_type = m.get('user_id_type')
        if m.get('hash_type') is not None:
            self.hash_type = m.get('hash_type')
        if m.get('customer_code') is not None:
            self.customer_code = m.get('customer_code')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        if m.get('user_id_encrypt_type') is not None:
            self.user_id_encrypt_type = m.get('user_id_encrypt_type')
        return self


class BatchqueryModelCommonscoreResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        scores: List[str] = None,
        ratings: List[str] = None,
        trans_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 分数
        self.scores = scores
        # 意向
        self.ratings = ratings
        # 流水号
        self.trans_no = trans_no

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
        if self.scores is not None:
            result['scores'] = self.scores
        if self.ratings is not None:
            result['ratings'] = self.ratings
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('scores') is not None:
            self.scores = m.get('scores')
        if m.get('ratings') is not None:
            self.ratings = m.get('ratings')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        return self


class QueryModelMultiscoreRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        auth_no: str = None,
        spec_code: str = None,
        user_id: str = None,
        user_id_type: str = None,
        hash_type: str = None,
        customer_code: str = None,
        trans_no: str = None,
        user_id_encrypt_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户授权编码（授权渠道）
        # 
        self.auth_no = auth_no
        # 规格编码(相应对接人负责)
        self.spec_code = spec_code
        # 用户id（客户身份证号/手机号的md5/sha256散列值）
        self.user_id = user_id
        # 用户id类型（身份证号：ID_NO；手机号：MOBILE_NO）
        self.user_id_type = user_id_type
        # user_id 散列类型: "MD5"：MD5（小写）, "SHA256" ： SHA256（小写）， "SM3"： SM3（小写）
        self.hash_type = hash_type
        # 客户编码
        # 
        self.customer_code = customer_code
        # 流水号，串联链路用，非必填
        self.trans_no = trans_no
        # hash_type类型的散列后的操作，默认为空不加密。 如启用，需要对散列后的user_id 加密，可选用如下算法，类型1、AES/ECB/PKCS5PADDING 在加密后的二进制需要以字符集UTF-8，编码base64 方式赋值给user_id传输。 示例：AES秘钥：base64_aes_key = "CZqWzQ5JL8s5Zx2XVpGZGw=="，报文：plaintext = "Hello, 蚂蚁。" ，使用算法： AES/ECB/PKCS5PADDING ；密文：SI1wU1ePSFoMy5YzuxclFkbZ/FIXUHPRDbKBW85WolY=，配置了此项user_id应该传输此密文。
        self.user_id_encrypt_type = user_id_encrypt_type

    def validate(self):
        self.validate_required(self.auth_no, 'auth_no')
        self.validate_required(self.spec_code, 'spec_code')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.user_id_type, 'user_id_type')
        self.validate_required(self.hash_type, 'hash_type')
        self.validate_required(self.customer_code, 'customer_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.auth_no is not None:
            result['auth_no'] = self.auth_no
        if self.spec_code is not None:
            result['spec_code'] = self.spec_code
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_id_type is not None:
            result['user_id_type'] = self.user_id_type
        if self.hash_type is not None:
            result['hash_type'] = self.hash_type
        if self.customer_code is not None:
            result['customer_code'] = self.customer_code
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        if self.user_id_encrypt_type is not None:
            result['user_id_encrypt_type'] = self.user_id_encrypt_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('auth_no') is not None:
            self.auth_no = m.get('auth_no')
        if m.get('spec_code') is not None:
            self.spec_code = m.get('spec_code')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_id_type') is not None:
            self.user_id_type = m.get('user_id_type')
        if m.get('hash_type') is not None:
            self.hash_type = m.get('hash_type')
        if m.get('customer_code') is not None:
            self.customer_code = m.get('customer_code')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        if m.get('user_id_encrypt_type') is not None:
            self.user_id_encrypt_type = m.get('user_id_encrypt_type')
        return self


class QueryModelMultiscoreResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        score: str = None,
        trans_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 模型分
        self.score = score
        # 流水号
        self.trans_no = trans_no

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
        if self.score is not None:
            result['score'] = self.score
        if self.trans_no is not None:
            result['trans_no'] = self.trans_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('trans_no') is not None:
            self.trans_no = m.get('trans_no')
        return self


