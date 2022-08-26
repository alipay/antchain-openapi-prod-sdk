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


class AnyStatisticalItem(TeaModel):
    def __init__(
        self,
        item_code: str = None,
        amount: str = None,
        unit: str = None,
        unit_label: str = None,
    ):
        # 统计项目编码
        self.item_code = item_code
        # 数据值，按字符串输出，最多保留6位小数
        self.amount = amount
        # 单位编码
        self.unit = unit
        # 单位标签
        self.unit_label = unit_label

    def validate(self):
        self.validate_required(self.item_code, 'item_code')
        self.validate_required(self.amount, 'amount')
        self.validate_required(self.unit, 'unit')
        self.validate_required(self.unit_label, 'unit_label')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.item_code is not None:
            result['item_code'] = self.item_code
        if self.amount is not None:
            result['amount'] = self.amount
        if self.unit is not None:
            result['unit'] = self.unit
        if self.unit_label is not None:
            result['unit_label'] = self.unit_label
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('item_code') is not None:
            self.item_code = m.get('item_code')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('unit_label') is not None:
            self.unit_label = m.get('unit_label')
        return self


class EnterpriseDocumentFile(TeaModel):
    def __init__(
        self,
        document_name: str = None,
        document_address: str = None,
    ):
        # 文档名称
        self.document_name = document_name
        # 文件地址
        self.document_address = document_address

    def validate(self):
        self.validate_required(self.document_name, 'document_name')
        self.validate_required(self.document_address, 'document_address')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.document_name is not None:
            result['document_name'] = self.document_name
        if self.document_address is not None:
            result['document_address'] = self.document_address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('document_name') is not None:
            self.document_name = m.get('document_name')
        if m.get('document_address') is not None:
            self.document_address = m.get('document_address')
        return self


class AnyAmountItem(TeaModel):
    def __init__(
        self,
        item_code: str = None,
        item_amount: str = None,
    ):
        # 数据项编码
        self.item_code = item_code
        # 数据值，按字符串输出，最多保留6位小数
        self.item_amount = item_amount

    def validate(self):
        self.validate_required(self.item_code, 'item_code')
        self.validate_required(self.item_amount, 'item_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.item_code is not None:
            result['item_code'] = self.item_code
        if self.item_amount is not None:
            result['item_amount'] = self.item_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('item_code') is not None:
            self.item_code = m.get('item_code')
        if m.get('item_amount') is not None:
            self.item_amount = m.get('item_amount')
        return self


class AnyKeywordItem(TeaModel):
    def __init__(
        self,
        item_code: str = None,
        item_value: str = None,
    ):
        # 项目编码
        self.item_code = item_code
        # 项目值
        self.item_value = item_value

    def validate(self):
        self.validate_required(self.item_code, 'item_code')
        self.validate_required(self.item_value, 'item_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.item_code is not None:
            result['item_code'] = self.item_code
        if self.item_value is not None:
            result['item_value'] = self.item_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('item_code') is not None:
            self.item_code = m.get('item_code')
        if m.get('item_value') is not None:
            self.item_value = m.get('item_value')
        return self


class CountAntchainCarbonEcarActivedataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        inventory_item_no: str = None,
        occurrence_start_time: str = None,
        occurrence_end_time: str = None,
        emission_source_element_list: List[AnyKeywordItem] = None,
        extension_value_list: List[AnyKeywordItem] = None,
        extra_statistic_item_list: List[AnyKeywordItem] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 盘查排放项编码
        self.inventory_item_no = inventory_item_no
        # 发生起始时间，格式为：yyyy-MM-dd HH:mm:ss，将统计起始时间之后的活动数据
        self.occurrence_start_time = occurrence_start_time
        # 发生结束时间，格式为：yyyy-MM-dd HH:mm:ss，将统计结束时间之前、起始时间之后的活动数据
        self.occurrence_end_time = occurrence_end_time
        # 活动数据附加要素信息，将统计满足相关要素值的活动数据
        self.emission_source_element_list = emission_source_element_list
        # 活动数据扩展信息，将统计满足相关要素值的活动数据
        self.extension_value_list = extension_value_list
        # 附加的扩展统计条目，条目K为统计数据结果编码，V为统计计算公式，
        # 公式可用参数：dataEntryCount(统计排放数据条数)、totalEmissions(总碳排放量)、activeDataAmounts.{活动数据编码}（活动数据量）
        # 比如马士基计算百公里排放量公式：totalEmissions/(activeDataAmounts.AD1+activeDataAmounts.AD3)*100
        self.extra_statistic_item_list = extra_statistic_item_list

    def validate(self):
        self.validate_required(self.inventory_item_no, 'inventory_item_no')
        self.validate_required(self.occurrence_start_time, 'occurrence_start_time')
        self.validate_required(self.occurrence_end_time, 'occurrence_end_time')
        if self.emission_source_element_list:
            for k in self.emission_source_element_list:
                if k:
                    k.validate()
        if self.extension_value_list:
            for k in self.extension_value_list:
                if k:
                    k.validate()
        if self.extra_statistic_item_list:
            for k in self.extra_statistic_item_list:
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
        if self.inventory_item_no is not None:
            result['inventory_item_no'] = self.inventory_item_no
        if self.occurrence_start_time is not None:
            result['occurrence_start_time'] = self.occurrence_start_time
        if self.occurrence_end_time is not None:
            result['occurrence_end_time'] = self.occurrence_end_time
        result['emission_source_element_list'] = []
        if self.emission_source_element_list is not None:
            for k in self.emission_source_element_list:
                result['emission_source_element_list'].append(k.to_map() if k else None)
        result['extension_value_list'] = []
        if self.extension_value_list is not None:
            for k in self.extension_value_list:
                result['extension_value_list'].append(k.to_map() if k else None)
        result['extra_statistic_item_list'] = []
        if self.extra_statistic_item_list is not None:
            for k in self.extra_statistic_item_list:
                result['extra_statistic_item_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('inventory_item_no') is not None:
            self.inventory_item_no = m.get('inventory_item_no')
        if m.get('occurrence_start_time') is not None:
            self.occurrence_start_time = m.get('occurrence_start_time')
        if m.get('occurrence_end_time') is not None:
            self.occurrence_end_time = m.get('occurrence_end_time')
        self.emission_source_element_list = []
        if m.get('emission_source_element_list') is not None:
            for k in m.get('emission_source_element_list'):
                temp_model = AnyKeywordItem()
                self.emission_source_element_list.append(temp_model.from_map(k))
        self.extension_value_list = []
        if m.get('extension_value_list') is not None:
            for k in m.get('extension_value_list'):
                temp_model = AnyKeywordItem()
                self.extension_value_list.append(temp_model.from_map(k))
        self.extra_statistic_item_list = []
        if m.get('extra_statistic_item_list') is not None:
            for k in m.get('extra_statistic_item_list'):
                temp_model = AnyKeywordItem()
                self.extra_statistic_item_list.append(temp_model.from_map(k))
        return self


class CountAntchainCarbonEcarActivedataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data_entry_count: int = None,
        total_emissions: str = None,
        active_data_amount_list: List[AnyStatisticalItem] = None,
        emissions_intensity: str = None,
        each_month_emissions: str = None,
        extra_statistic_datum_list: List[AnyAmountItem] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 指定时间区间内的活动数据笔数
        self.data_entry_count = data_entry_count
        # 总碳排放量
        self.total_emissions = total_emissions
        # 各活动数据用量累计
        self.active_data_amount_list = active_data_amount_list
        # 碳排放强度，碳排放总量/订单笔数，按字符串输出，最多保留6位小数
        self.emissions_intensity = emissions_intensity
        # 每月排放量，排放量总计/指定时间区间内的月份数，按字符串输出，最多保留6位小数
        self.each_month_emissions = each_month_emissions
        # 额外统计数据统计结果
        self.extra_statistic_datum_list = extra_statistic_datum_list

    def validate(self):
        if self.active_data_amount_list:
            for k in self.active_data_amount_list:
                if k:
                    k.validate()
        if self.extra_statistic_datum_list:
            for k in self.extra_statistic_datum_list:
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
        if self.data_entry_count is not None:
            result['data_entry_count'] = self.data_entry_count
        if self.total_emissions is not None:
            result['total_emissions'] = self.total_emissions
        result['active_data_amount_list'] = []
        if self.active_data_amount_list is not None:
            for k in self.active_data_amount_list:
                result['active_data_amount_list'].append(k.to_map() if k else None)
        if self.emissions_intensity is not None:
            result['emissions_intensity'] = self.emissions_intensity
        if self.each_month_emissions is not None:
            result['each_month_emissions'] = self.each_month_emissions
        result['extra_statistic_datum_list'] = []
        if self.extra_statistic_datum_list is not None:
            for k in self.extra_statistic_datum_list:
                result['extra_statistic_datum_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data_entry_count') is not None:
            self.data_entry_count = m.get('data_entry_count')
        if m.get('total_emissions') is not None:
            self.total_emissions = m.get('total_emissions')
        self.active_data_amount_list = []
        if m.get('active_data_amount_list') is not None:
            for k in m.get('active_data_amount_list'):
                temp_model = AnyStatisticalItem()
                self.active_data_amount_list.append(temp_model.from_map(k))
        if m.get('emissions_intensity') is not None:
            self.emissions_intensity = m.get('emissions_intensity')
        if m.get('each_month_emissions') is not None:
            self.each_month_emissions = m.get('each_month_emissions')
        self.extra_statistic_datum_list = []
        if m.get('extra_statistic_datum_list') is not None:
            for k in m.get('extra_statistic_datum_list'):
                temp_model = AnyAmountItem()
                self.extra_statistic_datum_list.append(temp_model.from_map(k))
        return self


class AddAntchainCarbonEcarAvitivedataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        enterprise_biz_no: str = None,
        inventory_item_no: str = None,
        occurrence_start_time: str = None,
        occurrence_end_time: str = None,
        emission_source_dosage_list: List[AnyAmountItem] = None,
        emission_source_element_list: List[AnyKeywordItem] = None,
        extension_value_list: List[AnyKeywordItem] = None,
        voucher_file_list: List[EnterpriseDocumentFile] = None,
        remark: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 活动数据业务单号
        self.enterprise_biz_no = enterprise_biz_no
        # 盘查排放项编码
        self.inventory_item_no = inventory_item_no
        # 发生起始时间，格式为：yyyy-MM-dd HH:mm:ss
        self.occurrence_start_time = occurrence_start_time
        # 发生结束时间，格式为：yyyy-MM-dd HH:mm:ss
        self.occurrence_end_time = occurrence_end_time
        # 排放源用量值列表
        self.emission_source_dosage_list = emission_source_dosage_list
        # 活动数据附加要素值列表
        self.emission_source_element_list = emission_source_element_list
        # 活动数据扩展信息值列表
        self.extension_value_list = extension_value_list
        # 凭证文件列表，每个文件通过接口/open/api/file/upload上传
        self.voucher_file_list = voucher_file_list
        # 备注
        self.remark = remark

    def validate(self):
        self.validate_required(self.enterprise_biz_no, 'enterprise_biz_no')
        if self.enterprise_biz_no is not None:
            self.validate_max_length(self.enterprise_biz_no, 'enterprise_biz_no', 64)
        self.validate_required(self.inventory_item_no, 'inventory_item_no')
        self.validate_required(self.occurrence_start_time, 'occurrence_start_time')
        self.validate_required(self.occurrence_end_time, 'occurrence_end_time')
        self.validate_required(self.emission_source_dosage_list, 'emission_source_dosage_list')
        if self.emission_source_dosage_list:
            for k in self.emission_source_dosage_list:
                if k:
                    k.validate()
        if self.emission_source_element_list:
            for k in self.emission_source_element_list:
                if k:
                    k.validate()
        if self.extension_value_list:
            for k in self.extension_value_list:
                if k:
                    k.validate()
        if self.voucher_file_list:
            for k in self.voucher_file_list:
                if k:
                    k.validate()
        if self.remark is not None:
            self.validate_max_length(self.remark, 'remark', 512)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.enterprise_biz_no is not None:
            result['enterprise_biz_no'] = self.enterprise_biz_no
        if self.inventory_item_no is not None:
            result['inventory_item_no'] = self.inventory_item_no
        if self.occurrence_start_time is not None:
            result['occurrence_start_time'] = self.occurrence_start_time
        if self.occurrence_end_time is not None:
            result['occurrence_end_time'] = self.occurrence_end_time
        result['emission_source_dosage_list'] = []
        if self.emission_source_dosage_list is not None:
            for k in self.emission_source_dosage_list:
                result['emission_source_dosage_list'].append(k.to_map() if k else None)
        result['emission_source_element_list'] = []
        if self.emission_source_element_list is not None:
            for k in self.emission_source_element_list:
                result['emission_source_element_list'].append(k.to_map() if k else None)
        result['extension_value_list'] = []
        if self.extension_value_list is not None:
            for k in self.extension_value_list:
                result['extension_value_list'].append(k.to_map() if k else None)
        result['voucher_file_list'] = []
        if self.voucher_file_list is not None:
            for k in self.voucher_file_list:
                result['voucher_file_list'].append(k.to_map() if k else None)
        if self.remark is not None:
            result['remark'] = self.remark
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('enterprise_biz_no') is not None:
            self.enterprise_biz_no = m.get('enterprise_biz_no')
        if m.get('inventory_item_no') is not None:
            self.inventory_item_no = m.get('inventory_item_no')
        if m.get('occurrence_start_time') is not None:
            self.occurrence_start_time = m.get('occurrence_start_time')
        if m.get('occurrence_end_time') is not None:
            self.occurrence_end_time = m.get('occurrence_end_time')
        self.emission_source_dosage_list = []
        if m.get('emission_source_dosage_list') is not None:
            for k in m.get('emission_source_dosage_list'):
                temp_model = AnyAmountItem()
                self.emission_source_dosage_list.append(temp_model.from_map(k))
        self.emission_source_element_list = []
        if m.get('emission_source_element_list') is not None:
            for k in m.get('emission_source_element_list'):
                temp_model = AnyKeywordItem()
                self.emission_source_element_list.append(temp_model.from_map(k))
        self.extension_value_list = []
        if m.get('extension_value_list') is not None:
            for k in m.get('extension_value_list'):
                temp_model = AnyKeywordItem()
                self.extension_value_list.append(temp_model.from_map(k))
        self.voucher_file_list = []
        if m.get('voucher_file_list') is not None:
            for k in m.get('voucher_file_list'):
                temp_model = EnterpriseDocumentFile()
                self.voucher_file_list.append(temp_model.from_map(k))
        if m.get('remark') is not None:
            self.remark = m.get('remark')
        return self


class AddAntchainCarbonEcarAvitivedataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        emission_data_entry_item_no: str = None,
        enterprise_biz_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 排放数据录入明细编码
        self.emission_data_entry_item_no = emission_data_entry_item_no
        # 企业业务单号
        self.enterprise_biz_no = enterprise_biz_no

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
        if self.emission_data_entry_item_no is not None:
            result['emission_data_entry_item_no'] = self.emission_data_entry_item_no
        if self.enterprise_biz_no is not None:
            result['enterprise_biz_no'] = self.enterprise_biz_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('emission_data_entry_item_no') is not None:
            self.emission_data_entry_item_no = m.get('emission_data_entry_item_no')
        if m.get('enterprise_biz_no') is not None:
            self.enterprise_biz_no = m.get('enterprise_biz_no')
        return self


class DetailAntchainCarbonEcarAvitivedataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        emission_data_entry_item_no: str = None,
        enterprise_biz_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 排放数据录入明细编码
        self.emission_data_entry_item_no = emission_data_entry_item_no
        # 企业业务单号
        self.enterprise_biz_no = enterprise_biz_no

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
        if self.emission_data_entry_item_no is not None:
            result['emission_data_entry_item_no'] = self.emission_data_entry_item_no
        if self.enterprise_biz_no is not None:
            result['enterprise_biz_no'] = self.enterprise_biz_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('emission_data_entry_item_no') is not None:
            self.emission_data_entry_item_no = m.get('emission_data_entry_item_no')
        if m.get('enterprise_biz_no') is not None:
            self.enterprise_biz_no = m.get('enterprise_biz_no')
        return self


class DetailAntchainCarbonEcarAvitivedataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        emission_data_entry_item_no: str = None,
        enterprise_biz_no: str = None,
        occurrence_start_time: str = None,
        occurrence_end_time: str = None,
        carbon_chain_trade_hash: str = None,
        emission_statistical_amount: str = None,
        emission_source_no: str = None,
        emission_source_name: str = None,
        enterprise_location_no: str = None,
        enterprise_location_name: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 企业排放数据录入明细编码
        self.emission_data_entry_item_no = emission_data_entry_item_no
        # 企业业务单号
        self.enterprise_biz_no = enterprise_biz_no
        # 发生起始时间，格式为：yyyy-MM-dd HH:mm:ss
        self.occurrence_start_time = occurrence_start_time
        # 发生结束时间，格式为：yyyy-MM-dd HH:mm:ss
        self.occurrence_end_time = occurrence_end_time
        # 链上交易Hash
        self.carbon_chain_trade_hash = carbon_chain_trade_hash
        # 总的碳排放用量，按字符串输出，最多保留6位小数
        self.emission_statistical_amount = emission_statistical_amount
        # 排放源编码
        self.emission_source_no = emission_source_no
        # 排放源名称
        self.emission_source_name = emission_source_name
        # 排放单元编码
        self.enterprise_location_no = enterprise_location_no
        # 排放单元名称
        self.enterprise_location_name = enterprise_location_name

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
        if self.emission_data_entry_item_no is not None:
            result['emission_data_entry_item_no'] = self.emission_data_entry_item_no
        if self.enterprise_biz_no is not None:
            result['enterprise_biz_no'] = self.enterprise_biz_no
        if self.occurrence_start_time is not None:
            result['occurrence_start_time'] = self.occurrence_start_time
        if self.occurrence_end_time is not None:
            result['occurrence_end_time'] = self.occurrence_end_time
        if self.carbon_chain_trade_hash is not None:
            result['carbon_chain_trade_hash'] = self.carbon_chain_trade_hash
        if self.emission_statistical_amount is not None:
            result['emission_statistical_amount'] = self.emission_statistical_amount
        if self.emission_source_no is not None:
            result['emission_source_no'] = self.emission_source_no
        if self.emission_source_name is not None:
            result['emission_source_name'] = self.emission_source_name
        if self.enterprise_location_no is not None:
            result['enterprise_location_no'] = self.enterprise_location_no
        if self.enterprise_location_name is not None:
            result['enterprise_location_name'] = self.enterprise_location_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('emission_data_entry_item_no') is not None:
            self.emission_data_entry_item_no = m.get('emission_data_entry_item_no')
        if m.get('enterprise_biz_no') is not None:
            self.enterprise_biz_no = m.get('enterprise_biz_no')
        if m.get('occurrence_start_time') is not None:
            self.occurrence_start_time = m.get('occurrence_start_time')
        if m.get('occurrence_end_time') is not None:
            self.occurrence_end_time = m.get('occurrence_end_time')
        if m.get('carbon_chain_trade_hash') is not None:
            self.carbon_chain_trade_hash = m.get('carbon_chain_trade_hash')
        if m.get('emission_statistical_amount') is not None:
            self.emission_statistical_amount = m.get('emission_statistical_amount')
        if m.get('emission_source_no') is not None:
            self.emission_source_no = m.get('emission_source_no')
        if m.get('emission_source_name') is not None:
            self.emission_source_name = m.get('emission_source_name')
        if m.get('enterprise_location_no') is not None:
            self.enterprise_location_no = m.get('enterprise_location_no')
        if m.get('enterprise_location_name') is not None:
            self.enterprise_location_name = m.get('enterprise_location_name')
        return self


