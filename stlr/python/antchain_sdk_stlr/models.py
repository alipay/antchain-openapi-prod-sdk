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


class EmissionsCategoryStatistics(TeaModel):
    def __init__(
        self,
        emission_dategory_no: str = None,
        emission_category_name: str = None,
        emissions: int = None,
    ):
        # 排放类型编码
        self.emission_dategory_no = emission_dategory_no
        # 排放类型名称
        self.emission_category_name = emission_category_name
        # 排放量
        self.emissions = emissions

    def validate(self):
        self.validate_required(self.emission_dategory_no, 'emission_dategory_no')
        self.validate_required(self.emission_category_name, 'emission_category_name')
        self.validate_required(self.emissions, 'emissions')

    def to_map(self):
        result = dict()
        if self.emission_dategory_no is not None:
            result['emission_dategory_no'] = self.emission_dategory_no
        if self.emission_category_name is not None:
            result['emission_category_name'] = self.emission_category_name
        if self.emissions is not None:
            result['emissions'] = self.emissions
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('emission_dategory_no') is not None:
            self.emission_dategory_no = m.get('emission_dategory_no')
        if m.get('emission_category_name') is not None:
            self.emission_category_name = m.get('emission_category_name')
        if m.get('emissions') is not None:
            self.emissions = m.get('emissions')
        return self


class EmissionsReductionStatistics(TeaModel):
    def __init__(
        self,
        reduction_type: str = None,
        reduction_measure_name: str = None,
        reduction_proposal_no: str = None,
        reduction_emissions: int = None,
        unit: str = None,
    ):
        # 减排措施类型，可选值：EnergySubstitution-能源替代，SelfDefining-自定义
        self.reduction_type = reduction_type
        # 减排措施名称
        self.reduction_measure_name = reduction_measure_name
        # 减排方案编码
        self.reduction_proposal_no = reduction_proposal_no
        # 减排量
        self.reduction_emissions = reduction_emissions
        # 减排量单位
        self.unit = unit

    def validate(self):
        self.validate_required(self.reduction_type, 'reduction_type')
        self.validate_required(self.reduction_measure_name, 'reduction_measure_name')
        self.validate_required(self.reduction_proposal_no, 'reduction_proposal_no')
        self.validate_required(self.reduction_emissions, 'reduction_emissions')
        self.validate_required(self.unit, 'unit')

    def to_map(self):
        result = dict()
        if self.reduction_type is not None:
            result['reduction_type'] = self.reduction_type
        if self.reduction_measure_name is not None:
            result['reduction_measure_name'] = self.reduction_measure_name
        if self.reduction_proposal_no is not None:
            result['reduction_proposal_no'] = self.reduction_proposal_no
        if self.reduction_emissions is not None:
            result['reduction_emissions'] = self.reduction_emissions
        if self.unit is not None:
            result['unit'] = self.unit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('reduction_type') is not None:
            self.reduction_type = m.get('reduction_type')
        if m.get('reduction_measure_name') is not None:
            self.reduction_measure_name = m.get('reduction_measure_name')
        if m.get('reduction_proposal_no') is not None:
            self.reduction_proposal_no = m.get('reduction_proposal_no')
        if m.get('reduction_emissions') is not None:
            self.reduction_emissions = m.get('reduction_emissions')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        return self


class DailyEmissions(TeaModel):
    def __init__(
        self,
        date: str = None,
        value: int = None,
    ):
        # 日期
        self.date = date
        # 排放量值
        self.value = value

    def validate(self):
        self.validate_required(self.date, 'date')
        self.validate_required(self.value, 'value')

    def to_map(self):
        result = dict()
        if self.date is not None:
            result['date'] = self.date
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('date') is not None:
            self.date = m.get('date')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class EmissionsScopeStatistics(TeaModel):
    def __init__(
        self,
        inventory_scope_no: str = None,
        inventory_scope_name: str = None,
        emissions: int = None,
        percentage: int = None,
        category_emissions_list: List[EmissionsCategoryStatistics] = None,
    ):
        # 盘查范围编码
        self.inventory_scope_no = inventory_scope_no
        # 盘查范围名称
        self.inventory_scope_name = inventory_scope_name
        # 碳排放量
        self.emissions = emissions
        # 排放占比
        self.percentage = percentage
        # 范围下各分类排放数据
        self.category_emissions_list = category_emissions_list

    def validate(self):
        self.validate_required(self.inventory_scope_no, 'inventory_scope_no')
        self.validate_required(self.inventory_scope_name, 'inventory_scope_name')
        self.validate_required(self.emissions, 'emissions')
        self.validate_required(self.percentage, 'percentage')
        self.validate_required(self.category_emissions_list, 'category_emissions_list')
        if self.category_emissions_list:
            for k in self.category_emissions_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.inventory_scope_no is not None:
            result['inventory_scope_no'] = self.inventory_scope_no
        if self.inventory_scope_name is not None:
            result['inventory_scope_name'] = self.inventory_scope_name
        if self.emissions is not None:
            result['emissions'] = self.emissions
        if self.percentage is not None:
            result['percentage'] = self.percentage
        result['category_emissions_list'] = []
        if self.category_emissions_list is not None:
            for k in self.category_emissions_list:
                result['category_emissions_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('inventory_scope_no') is not None:
            self.inventory_scope_no = m.get('inventory_scope_no')
        if m.get('inventory_scope_name') is not None:
            self.inventory_scope_name = m.get('inventory_scope_name')
        if m.get('emissions') is not None:
            self.emissions = m.get('emissions')
        if m.get('percentage') is not None:
            self.percentage = m.get('percentage')
        self.category_emissions_list = []
        if m.get('category_emissions_list') is not None:
            for k in m.get('category_emissions_list'):
                temp_model = EmissionsCategoryStatistics()
                self.category_emissions_list.append(temp_model.from_map(k))
        return self


class DescribeAcarActivityRequest(TeaModel):
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


class DescribeAcarActivityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sponsor: str = None,
        activity_name: str = None,
        enterprise_name: str = None,
        enterprise_no: str = None,
        enterprise_start_date: str = None,
        enterprise_end_date: str = None,
        authed: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 活动主办方名称
        self.sponsor = sponsor
        # 大型活动名称
        self.activity_name = activity_name
        # 当前开展的活动主体名称
        self.enterprise_name = enterprise_name
        # 当前活动主体编码
        self.enterprise_no = enterprise_no
        # 当前主体活动开始日期
        self.enterprise_start_date = enterprise_start_date
        # 当前主体活动结束日期
        self.enterprise_end_date = enterprise_end_date
        # 当前活动是否已经经过碳排放认证
        self.authed = authed

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
        if self.sponsor is not None:
            result['sponsor'] = self.sponsor
        if self.activity_name is not None:
            result['activity_name'] = self.activity_name
        if self.enterprise_name is not None:
            result['enterprise_name'] = self.enterprise_name
        if self.enterprise_no is not None:
            result['enterprise_no'] = self.enterprise_no
        if self.enterprise_start_date is not None:
            result['enterprise_start_date'] = self.enterprise_start_date
        if self.enterprise_end_date is not None:
            result['enterprise_end_date'] = self.enterprise_end_date
        if self.authed is not None:
            result['authed'] = self.authed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sponsor') is not None:
            self.sponsor = m.get('sponsor')
        if m.get('activity_name') is not None:
            self.activity_name = m.get('activity_name')
        if m.get('enterprise_name') is not None:
            self.enterprise_name = m.get('enterprise_name')
        if m.get('enterprise_no') is not None:
            self.enterprise_no = m.get('enterprise_no')
        if m.get('enterprise_start_date') is not None:
            self.enterprise_start_date = m.get('enterprise_start_date')
        if m.get('enterprise_end_date') is not None:
            self.enterprise_end_date = m.get('enterprise_end_date')
        if m.get('authed') is not None:
            self.authed = m.get('authed')
        return self


class DescribeAcarDailyemissionsRequest(TeaModel):
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


class DescribeAcarDailyemissionsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        net_emissions: int = None,
        total_emissions: int = None,
        unit: str = None,
        finish_timestamp: str = None,
        daily_emissions_list: List[DailyEmissions] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 净排放量
        self.net_emissions = net_emissions
        # 累计到当前时间的总碳排放量
        self.total_emissions = total_emissions
        # 排放量单位
        self.unit = unit
        # 当前计算完成时间
        self.finish_timestamp = finish_timestamp
        # 活动期间每日累计的总碳排放量
        self.daily_emissions_list = daily_emissions_list

    def validate(self):
        if self.daily_emissions_list:
            for k in self.daily_emissions_list:
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
        if self.net_emissions is not None:
            result['net_emissions'] = self.net_emissions
        if self.total_emissions is not None:
            result['total_emissions'] = self.total_emissions
        if self.unit is not None:
            result['unit'] = self.unit
        if self.finish_timestamp is not None:
            result['finish_timestamp'] = self.finish_timestamp
        result['daily_emissions_list'] = []
        if self.daily_emissions_list is not None:
            for k in self.daily_emissions_list:
                result['daily_emissions_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('net_emissions') is not None:
            self.net_emissions = m.get('net_emissions')
        if m.get('total_emissions') is not None:
            self.total_emissions = m.get('total_emissions')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('finish_timestamp') is not None:
            self.finish_timestamp = m.get('finish_timestamp')
        self.daily_emissions_list = []
        if m.get('daily_emissions_list') is not None:
            for k in m.get('daily_emissions_list'):
                temp_model = DailyEmissions()
                self.daily_emissions_list.append(temp_model.from_map(k))
        return self


class DescribeAcarScopemissionRequest(TeaModel):
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


class DescribeAcarScopemissionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_emissions: int = None,
        unit: str = None,
        scope_emissions_list: List[EmissionsScopeStatistics] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总排放量
        self.total_emissions = total_emissions
        # 单位
        self.unit = unit
        # 各范围的排放情况列表
        self.scope_emissions_list = scope_emissions_list

    def validate(self):
        if self.scope_emissions_list:
            for k in self.scope_emissions_list:
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
        if self.total_emissions is not None:
            result['total_emissions'] = self.total_emissions
        if self.unit is not None:
            result['unit'] = self.unit
        result['scope_emissions_list'] = []
        if self.scope_emissions_list is not None:
            for k in self.scope_emissions_list:
                result['scope_emissions_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_emissions') is not None:
            self.total_emissions = m.get('total_emissions')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        self.scope_emissions_list = []
        if m.get('scope_emissions_list') is not None:
            for k in m.get('scope_emissions_list'):
                temp_model = EmissionsScopeStatistics()
                self.scope_emissions_list.append(temp_model.from_map(k))
        return self


class DescribeAcarReductionemissionsRequest(TeaModel):
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


class DescribeAcarReductionemissionsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        list: List[EmissionsReductionStatistics] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 减排情况列表
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
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
        result['list'] = []
        if self.list is not None:
            for k in self.list:
                result['list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = EmissionsReductionStatistics()
                self.list.append(temp_model.from_map(k))
        return self


class DescribeAcarLastemissiondataRequest(TeaModel):
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


class DescribeAcarLastemissiondataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        enterprise_no: str = None,
        inventory_scope_no: str = None,
        inventory_scope_name: str = None,
        emission_category_no: str = None,
        emission_category_name: str = None,
        emission_source_no: str = None,
        emission_source_name: str = None,
        enterprise_workspace_no: str = None,
        enterprise_workspace_name: str = None,
        emissions_analysis_factor_no: str = None,
        emissions_analysis_factor_value: str = None,
        occurrence_date: str = None,
        emission_data_entry_item_no: str = None,
        emission_dource_dosage: int = None,
        dosage_unit: str = None,
        submitter_no: str = None,
        submitter_name: str = None,
        submission_time: str = None,
        data_entry_type: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 主体活动编码
        self.enterprise_no = enterprise_no
        # 盘查范围编码
        self.inventory_scope_no = inventory_scope_no
        # 盘查范围名称
        self.inventory_scope_name = inventory_scope_name
        # 排放类型编码
        self.emission_category_no = emission_category_no
        # 排放类型名称
        self.emission_category_name = emission_category_name
        # 排放源编码
        self.emission_source_no = emission_source_no
        # 排放源名称
        self.emission_source_name = emission_source_name
        # 活动场馆编码
        self.enterprise_workspace_no = enterprise_workspace_no
        # 活动场馆名称
        self.enterprise_workspace_name = enterprise_workspace_name
        # 排放量计算要素编码
        self.emissions_analysis_factor_no = emissions_analysis_factor_no
        # 排放量计算要素值
        self.emissions_analysis_factor_value = emissions_analysis_factor_value
        # 发生日期
        self.occurrence_date = occurrence_date
        # 排放数据录入明细编码
        self.emission_data_entry_item_no = emission_data_entry_item_no
        # 排放源用量
        self.emission_dource_dosage = emission_dource_dosage
        # 用量单位：
        # WNm3("万Nm3","天然气消耗用量单位"),
        # GJ("GJ","燃烧产生的热量单位或外购热力单位"),
        # t("t","制冷剂、灭火器填充剂、化石燃料消耗的质量单位，或者化粪池BOD产生量单位"),
        # MWh("MWh","外购电力或数据中心用电量单位"),
        # km("km","公里，通勤用车或员工差旅旅程单位"),
        # tCO2e("tCO2e","吨二氧化碳当量，排放气体产生的二氧化碳当量"),
        # PCT("%","百分比，如碳氧化率，或者气体逸散率");
        self.dosage_unit = dosage_unit
        # 数据录入人账号
        self.submitter_no = submitter_no
        # 提交人姓名
        self.submitter_name = submitter_name
        # 数据录入时间
        self.submission_time = submission_time
        # 盘查排放类型的数据录入方式：
        # ManualEntry("手动录入方式"),
        # FileUpload("文件导入方式"),
        # AutoGeneration("自动产生");
        self.data_entry_type = data_entry_type

    def validate(self):
        if self.submission_time is not None:
            self.validate_pattern(self.submission_time, 'submission_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        result = dict()
        if self.req_msg_id is not None:
            result['req_msg_id'] = self.req_msg_id
        if self.result_code is not None:
            result['result_code'] = self.result_code
        if self.result_msg is not None:
            result['result_msg'] = self.result_msg
        if self.enterprise_no is not None:
            result['enterprise_no'] = self.enterprise_no
        if self.inventory_scope_no is not None:
            result['inventory_scope_no'] = self.inventory_scope_no
        if self.inventory_scope_name is not None:
            result['inventory_scope_name'] = self.inventory_scope_name
        if self.emission_category_no is not None:
            result['emission_category_no'] = self.emission_category_no
        if self.emission_category_name is not None:
            result['emission_category_name'] = self.emission_category_name
        if self.emission_source_no is not None:
            result['emission_source_no'] = self.emission_source_no
        if self.emission_source_name is not None:
            result['emission_source_name'] = self.emission_source_name
        if self.enterprise_workspace_no is not None:
            result['enterprise_workspace_no'] = self.enterprise_workspace_no
        if self.enterprise_workspace_name is not None:
            result['enterprise_workspace_name'] = self.enterprise_workspace_name
        if self.emissions_analysis_factor_no is not None:
            result['emissions_analysis_factor_no'] = self.emissions_analysis_factor_no
        if self.emissions_analysis_factor_value is not None:
            result['emissions_analysis_factor_value'] = self.emissions_analysis_factor_value
        if self.occurrence_date is not None:
            result['occurrence_date'] = self.occurrence_date
        if self.emission_data_entry_item_no is not None:
            result['emission_data_entry_item_no'] = self.emission_data_entry_item_no
        if self.emission_dource_dosage is not None:
            result['emission_dource_dosage'] = self.emission_dource_dosage
        if self.dosage_unit is not None:
            result['dosage_unit'] = self.dosage_unit
        if self.submitter_no is not None:
            result['submitter_no'] = self.submitter_no
        if self.submitter_name is not None:
            result['submitter_name'] = self.submitter_name
        if self.submission_time is not None:
            result['submission_time'] = self.submission_time
        if self.data_entry_type is not None:
            result['data_entry_type'] = self.data_entry_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('enterprise_no') is not None:
            self.enterprise_no = m.get('enterprise_no')
        if m.get('inventory_scope_no') is not None:
            self.inventory_scope_no = m.get('inventory_scope_no')
        if m.get('inventory_scope_name') is not None:
            self.inventory_scope_name = m.get('inventory_scope_name')
        if m.get('emission_category_no') is not None:
            self.emission_category_no = m.get('emission_category_no')
        if m.get('emission_category_name') is not None:
            self.emission_category_name = m.get('emission_category_name')
        if m.get('emission_source_no') is not None:
            self.emission_source_no = m.get('emission_source_no')
        if m.get('emission_source_name') is not None:
            self.emission_source_name = m.get('emission_source_name')
        if m.get('enterprise_workspace_no') is not None:
            self.enterprise_workspace_no = m.get('enterprise_workspace_no')
        if m.get('enterprise_workspace_name') is not None:
            self.enterprise_workspace_name = m.get('enterprise_workspace_name')
        if m.get('emissions_analysis_factor_no') is not None:
            self.emissions_analysis_factor_no = m.get('emissions_analysis_factor_no')
        if m.get('emissions_analysis_factor_value') is not None:
            self.emissions_analysis_factor_value = m.get('emissions_analysis_factor_value')
        if m.get('occurrence_date') is not None:
            self.occurrence_date = m.get('occurrence_date')
        if m.get('emission_data_entry_item_no') is not None:
            self.emission_data_entry_item_no = m.get('emission_data_entry_item_no')
        if m.get('emission_dource_dosage') is not None:
            self.emission_dource_dosage = m.get('emission_dource_dosage')
        if m.get('dosage_unit') is not None:
            self.dosage_unit = m.get('dosage_unit')
        if m.get('submitter_no') is not None:
            self.submitter_no = m.get('submitter_no')
        if m.get('submitter_name') is not None:
            self.submitter_name = m.get('submitter_name')
        if m.get('submission_time') is not None:
            self.submission_time = m.get('submission_time')
        if m.get('data_entry_type') is not None:
            self.data_entry_type = m.get('data_entry_type')
        return self


