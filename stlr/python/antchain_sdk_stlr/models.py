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


class CertProductAuthDO(TeaModel):
    def __init__(
        self,
        product_id: str = None,
        product_name: str = None,
    ):
        # 三方平台产品ID
        self.product_id = product_id
        # 三方平台产品名称
        self.product_name = product_name

    def validate(self):
        self.validate_required(self.product_id, 'product_id')
        self.validate_required(self.product_name, 'product_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_id is not None:
            result['product_id'] = self.product_id
        if self.product_name is not None:
            result['product_name'] = self.product_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        return self


class EmissionsCategoryStatistics(TeaModel):
    def __init__(
        self,
        emission_dategory_no: str = None,
        emission_category_name: str = None,
        emission: int = None,
        rate: int = None,
        unit: str = None,
    ):
        # 排放类型编码
        self.emission_dategory_no = emission_dategory_no
        # 排放类型名称
        self.emission_category_name = emission_category_name
        # 排放量
        self.emission = emission
        # 排放占比，可直接换算成百分数即为百分占比
        self.rate = rate
        # 排放量单位
        self.unit = unit

    def validate(self):
        self.validate_required(self.emission_dategory_no, 'emission_dategory_no')
        self.validate_required(self.emission_category_name, 'emission_category_name')
        self.validate_required(self.emission, 'emission')
        self.validate_required(self.rate, 'rate')
        self.validate_required(self.unit, 'unit')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.emission_dategory_no is not None:
            result['emission_dategory_no'] = self.emission_dategory_no
        if self.emission_category_name is not None:
            result['emission_category_name'] = self.emission_category_name
        if self.emission is not None:
            result['emission'] = self.emission
        if self.rate is not None:
            result['rate'] = self.rate
        if self.unit is not None:
            result['unit'] = self.unit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('emission_dategory_no') is not None:
            self.emission_dategory_no = m.get('emission_dategory_no')
        if m.get('emission_category_name') is not None:
            self.emission_category_name = m.get('emission_category_name')
        if m.get('emission') is not None:
            self.emission = m.get('emission')
        if m.get('rate') is not None:
            self.rate = m.get('rate')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        return self


class CertProductInfoDO(TeaModel):
    def __init__(
        self,
        certification_no: str = None,
        certification_type: str = None,
        certification_name: str = None,
        authentication_name: str = None,
        issue_time: str = None,
        invalid_time: str = None,
        certification_agent: str = None,
        manufacturer: str = None,
        cproduct_firm: str = None,
        certification_level: str = None,
        cproduct_name: str = None,
        cproduct_model: str = None,
        certification_file_address: str = None,
        auth_products: List[CertProductAuthDO] = None,
    ):
        # 同证书信息显示
        self.certification_no = certification_no
        # 同证书信息显示
        self.certification_type = certification_type
        # 同证书信息显示
        self.certification_name = certification_name
        # 同证书信息显示
        self.authentication_name = authentication_name
        # 证书颁发时间
        self.issue_time = issue_time
        # 证书到期时间
        self.invalid_time = invalid_time
        # 同证书信息显示
        self.certification_agent = certification_agent
        # 同证书信息显示
        self.manufacturer = manufacturer
        # 同证书信息显示
        self.cproduct_firm = cproduct_firm
        # 同证书信息显示
        self.certification_level = certification_level
        # 同证书信息显示
        self.cproduct_name = cproduct_name
        # 同证书信息显示
        self.cproduct_model = cproduct_model
        # 证书文件地址
        self.certification_file_address = certification_file_address
        # 证书授权的三方平台产品列表
        self.auth_products = auth_products

    def validate(self):
        self.validate_required(self.certification_no, 'certification_no')
        self.validate_required(self.certification_type, 'certification_type')
        self.validate_required(self.certification_name, 'certification_name')
        self.validate_required(self.authentication_name, 'authentication_name')
        self.validate_required(self.issue_time, 'issue_time')
        self.validate_required(self.invalid_time, 'invalid_time')
        self.validate_required(self.certification_agent, 'certification_agent')
        self.validate_required(self.certification_file_address, 'certification_file_address')
        if self.auth_products:
            for k in self.auth_products:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.certification_no is not None:
            result['certification_no'] = self.certification_no
        if self.certification_type is not None:
            result['certification_type'] = self.certification_type
        if self.certification_name is not None:
            result['certification_name'] = self.certification_name
        if self.authentication_name is not None:
            result['authentication_name'] = self.authentication_name
        if self.issue_time is not None:
            result['issue_time'] = self.issue_time
        if self.invalid_time is not None:
            result['invalid_time'] = self.invalid_time
        if self.certification_agent is not None:
            result['certification_agent'] = self.certification_agent
        if self.manufacturer is not None:
            result['manufacturer'] = self.manufacturer
        if self.cproduct_firm is not None:
            result['cproduct_firm'] = self.cproduct_firm
        if self.certification_level is not None:
            result['certification_level'] = self.certification_level
        if self.cproduct_name is not None:
            result['cproduct_name'] = self.cproduct_name
        if self.cproduct_model is not None:
            result['cproduct_model'] = self.cproduct_model
        if self.certification_file_address is not None:
            result['certification_file_address'] = self.certification_file_address
        result['auth_products'] = []
        if self.auth_products is not None:
            for k in self.auth_products:
                result['auth_products'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('certification_no') is not None:
            self.certification_no = m.get('certification_no')
        if m.get('certification_type') is not None:
            self.certification_type = m.get('certification_type')
        if m.get('certification_name') is not None:
            self.certification_name = m.get('certification_name')
        if m.get('authentication_name') is not None:
            self.authentication_name = m.get('authentication_name')
        if m.get('issue_time') is not None:
            self.issue_time = m.get('issue_time')
        if m.get('invalid_time') is not None:
            self.invalid_time = m.get('invalid_time')
        if m.get('certification_agent') is not None:
            self.certification_agent = m.get('certification_agent')
        if m.get('manufacturer') is not None:
            self.manufacturer = m.get('manufacturer')
        if m.get('cproduct_firm') is not None:
            self.cproduct_firm = m.get('cproduct_firm')
        if m.get('certification_level') is not None:
            self.certification_level = m.get('certification_level')
        if m.get('cproduct_name') is not None:
            self.cproduct_name = m.get('cproduct_name')
        if m.get('cproduct_model') is not None:
            self.cproduct_model = m.get('cproduct_model')
        if m.get('certification_file_address') is not None:
            self.certification_file_address = m.get('certification_file_address')
        self.auth_products = []
        if m.get('auth_products') is not None:
            for k in m.get('auth_products'):
                temp_model = CertProductAuthDO()
                self.auth_products.append(temp_model.from_map(k))
        return self


class AnnualMonthEmissionDatum(TeaModel):
    def __init__(
        self,
        year: str = None,
        month: str = None,
        value: str = None,
    ):
        # 统计的年份
        self.year = year
        # 统计的月份
        self.month = month
        # 统计排放量
        self.value = value

    def validate(self):
        self.validate_required(self.year, 'year')
        self.validate_required(self.month, 'month')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.year is not None:
            result['year'] = self.year
        if self.month is not None:
            result['month'] = self.month
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('year') is not None:
            self.year = m.get('year')
        if m.get('month') is not None:
            self.month = m.get('month')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class GreenOperationStatisticsByType(TeaModel):
    def __init__(
        self,
        green_operation_type: str = None,
        green_operation_type_name: str = None,
        green_energy_amount: int = None,
        green_operation_records: int = None,
    ):
        # 绿色行为类型
        self.green_operation_type = green_operation_type
        # 绿色行为类型名称
        self.green_operation_type_name = green_operation_type_name
        # 绿色行为产生的绿色能量值
        self.green_energy_amount = green_energy_amount
        # 相关类型的绿色行为记录数
        self.green_operation_records = green_operation_records

    def validate(self):
        self.validate_required(self.green_operation_type, 'green_operation_type')
        self.validate_required(self.green_operation_type_name, 'green_operation_type_name')
        self.validate_required(self.green_energy_amount, 'green_energy_amount')
        self.validate_required(self.green_operation_records, 'green_operation_records')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.green_operation_type is not None:
            result['green_operation_type'] = self.green_operation_type
        if self.green_operation_type_name is not None:
            result['green_operation_type_name'] = self.green_operation_type_name
        if self.green_energy_amount is not None:
            result['green_energy_amount'] = self.green_energy_amount
        if self.green_operation_records is not None:
            result['green_operation_records'] = self.green_operation_records
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('green_operation_type') is not None:
            self.green_operation_type = m.get('green_operation_type')
        if m.get('green_operation_type_name') is not None:
            self.green_operation_type_name = m.get('green_operation_type_name')
        if m.get('green_energy_amount') is not None:
            self.green_energy_amount = m.get('green_energy_amount')
        if m.get('green_operation_records') is not None:
            self.green_operation_records = m.get('green_operation_records')
        return self


class EmissionsReductionStatistics(TeaModel):
    def __init__(
        self,
        reduction_method: str = None,
        reduction_method_name: str = None,
        reduction_amount: int = None,
        reduction_ratio: int = None,
        data_unit: str = None,
    ):
        # 减排方法
        self.reduction_method = reduction_method
        # 减排方法名称
        self.reduction_method_name = reduction_method_name
        # 减排量
        self.reduction_amount = reduction_amount
        # 减排量占比
        self.reduction_ratio = reduction_ratio
        # 减排量单位
        self.data_unit = data_unit

    def validate(self):
        self.validate_required(self.reduction_method, 'reduction_method')
        self.validate_required(self.reduction_method_name, 'reduction_method_name')
        self.validate_required(self.reduction_amount, 'reduction_amount')
        self.validate_required(self.reduction_ratio, 'reduction_ratio')
        self.validate_required(self.data_unit, 'data_unit')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.reduction_method is not None:
            result['reduction_method'] = self.reduction_method
        if self.reduction_method_name is not None:
            result['reduction_method_name'] = self.reduction_method_name
        if self.reduction_amount is not None:
            result['reduction_amount'] = self.reduction_amount
        if self.reduction_ratio is not None:
            result['reduction_ratio'] = self.reduction_ratio
        if self.data_unit is not None:
            result['data_unit'] = self.data_unit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('reduction_method') is not None:
            self.reduction_method = m.get('reduction_method')
        if m.get('reduction_method_name') is not None:
            self.reduction_method_name = m.get('reduction_method_name')
        if m.get('reduction_amount') is not None:
            self.reduction_amount = m.get('reduction_amount')
        if m.get('reduction_ratio') is not None:
            self.reduction_ratio = m.get('reduction_ratio')
        if m.get('data_unit') is not None:
            self.data_unit = m.get('data_unit')
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
        _map = super().to_map()
        if _map is not None:
            return _map

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


class EmissionCounteractionStatistics(TeaModel):
    def __init__(
        self,
        assert_type: str = None,
        assert_type_name: str = None,
        counteraction_amount: int = None,
        data_unit: str = None,
    ):
        # 碳抵消类别
        self.assert_type = assert_type
        # 碳抵消类别名称
        self.assert_type_name = assert_type_name
        # 抵消量
        self.counteraction_amount = counteraction_amount
        # 排放量单位，默认为：tCO2e
        self.data_unit = data_unit

    def validate(self):
        self.validate_required(self.assert_type, 'assert_type')
        self.validate_required(self.assert_type_name, 'assert_type_name')
        self.validate_required(self.counteraction_amount, 'counteraction_amount')
        self.validate_required(self.data_unit, 'data_unit')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.assert_type is not None:
            result['assert_type'] = self.assert_type
        if self.assert_type_name is not None:
            result['assert_type_name'] = self.assert_type_name
        if self.counteraction_amount is not None:
            result['counteraction_amount'] = self.counteraction_amount
        if self.data_unit is not None:
            result['data_unit'] = self.data_unit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('assert_type') is not None:
            self.assert_type = m.get('assert_type')
        if m.get('assert_type_name') is not None:
            self.assert_type_name = m.get('assert_type_name')
        if m.get('counteraction_amount') is not None:
            self.counteraction_amount = m.get('counteraction_amount')
        if m.get('data_unit') is not None:
            self.data_unit = m.get('data_unit')
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


class AccountRegisterResponse(TeaModel):
    def __init__(
        self,
        user_did: str = None,
    ):
        # 账户did
        self.user_did = user_did

    def validate(self):
        self.validate_required(self.user_did, 'user_did')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_did is not None:
            result['user_did'] = self.user_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
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


class BlockchainDTO(TeaModel):
    def __init__(
        self,
        tx_hash: str = None,
        block_number: int = None,
    ):
        # 交易hash
        self.tx_hash = tx_hash
        # 当前块高
        self.block_number = block_number

    def validate(self):
        self.validate_required(self.tx_hash, 'tx_hash')
        self.validate_required(self.block_number, 'block_number')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tx_hash is not None:
            result['tx_hash'] = self.tx_hash
        if self.block_number is not None:
            result['block_number'] = self.block_number
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tx_hash') is not None:
            self.tx_hash = m.get('tx_hash')
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        return self


class EmissionsCityStatistics(TeaModel):
    def __init__(
        self,
        city_no: str = None,
        city_name: str = None,
        emission_amount: int = None,
        emission_amount_today: int = None,
        reduction_amount: int = None,
        reduction_amount_today: int = None,
        counteraction_amount: int = None,
        counteraction_amount_today: int = None,
        data_unit: str = None,
    ):
        # 城市编码
        self.city_no = city_no
        # 城市名称
        self.city_name = city_name
        # 累计排放量
        self.emission_amount = emission_amount
        # 今日新增碳排放量
        self.emission_amount_today = emission_amount_today
        # 总减碳量
        self.reduction_amount = reduction_amount
        # 今日减碳量
        self.reduction_amount_today = reduction_amount_today
        # 总抵消量
        self.counteraction_amount = counteraction_amount
        # 今日抵消量
        self.counteraction_amount_today = counteraction_amount_today
        # 排放量单位，默认为：
        self.data_unit = data_unit

    def validate(self):
        self.validate_required(self.city_no, 'city_no')
        self.validate_required(self.city_name, 'city_name')
        self.validate_required(self.emission_amount, 'emission_amount')
        self.validate_required(self.emission_amount_today, 'emission_amount_today')
        self.validate_required(self.reduction_amount, 'reduction_amount')
        self.validate_required(self.reduction_amount_today, 'reduction_amount_today')
        self.validate_required(self.counteraction_amount, 'counteraction_amount')
        self.validate_required(self.counteraction_amount_today, 'counteraction_amount_today')
        self.validate_required(self.data_unit, 'data_unit')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.city_no is not None:
            result['city_no'] = self.city_no
        if self.city_name is not None:
            result['city_name'] = self.city_name
        if self.emission_amount is not None:
            result['emission_amount'] = self.emission_amount
        if self.emission_amount_today is not None:
            result['emission_amount_today'] = self.emission_amount_today
        if self.reduction_amount is not None:
            result['reduction_amount'] = self.reduction_amount
        if self.reduction_amount_today is not None:
            result['reduction_amount_today'] = self.reduction_amount_today
        if self.counteraction_amount is not None:
            result['counteraction_amount'] = self.counteraction_amount
        if self.counteraction_amount_today is not None:
            result['counteraction_amount_today'] = self.counteraction_amount_today
        if self.data_unit is not None:
            result['data_unit'] = self.data_unit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('city_no') is not None:
            self.city_no = m.get('city_no')
        if m.get('city_name') is not None:
            self.city_name = m.get('city_name')
        if m.get('emission_amount') is not None:
            self.emission_amount = m.get('emission_amount')
        if m.get('emission_amount_today') is not None:
            self.emission_amount_today = m.get('emission_amount_today')
        if m.get('reduction_amount') is not None:
            self.reduction_amount = m.get('reduction_amount')
        if m.get('reduction_amount_today') is not None:
            self.reduction_amount_today = m.get('reduction_amount_today')
        if m.get('counteraction_amount') is not None:
            self.counteraction_amount = m.get('counteraction_amount')
        if m.get('counteraction_amount_today') is not None:
            self.counteraction_amount_today = m.get('counteraction_amount_today')
        if m.get('data_unit') is not None:
            self.data_unit = m.get('data_unit')
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
        _map = super().to_map()
        if _map is not None:
            return _map

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


class EmissionsLocationStatistics(TeaModel):
    def __init__(
        self,
        location_no: str = None,
        location_name: str = None,
        emission_amount: int = None,
        data_unit: str = None,
    ):
        # 盘查单元编码
        self.location_no = location_no
        # 盘查单元名称
        self.location_name = location_name
        # 盘查单元排放量
        self.emission_amount = emission_amount
        # 排放量单位，默认为：tCO2e
        self.data_unit = data_unit

    def validate(self):
        self.validate_required(self.location_no, 'location_no')
        self.validate_required(self.location_name, 'location_name')
        self.validate_required(self.emission_amount, 'emission_amount')
        self.validate_required(self.data_unit, 'data_unit')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.location_no is not None:
            result['location_no'] = self.location_no
        if self.location_name is not None:
            result['location_name'] = self.location_name
        if self.emission_amount is not None:
            result['emission_amount'] = self.emission_amount
        if self.data_unit is not None:
            result['data_unit'] = self.data_unit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('location_no') is not None:
            self.location_no = m.get('location_no')
        if m.get('location_name') is not None:
            self.location_name = m.get('location_name')
        if m.get('emission_amount') is not None:
            self.emission_amount = m.get('emission_amount')
        if m.get('data_unit') is not None:
            self.data_unit = m.get('data_unit')
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


class GreenOperationStatisticsByFrequence(TeaModel):
    def __init__(
        self,
        occurrence_period: str = None,
        green_energy_amount: int = None,
        green_operation_records: int = None,
    ):
        # 绿色行为发生时期
        self.occurrence_period = occurrence_period
        # 绿色行为产生的绿色能量值
        self.green_energy_amount = green_energy_amount
        # 时期内发生绿色行为的记录条数
        self.green_operation_records = green_operation_records

    def validate(self):
        self.validate_required(self.occurrence_period, 'occurrence_period')
        self.validate_required(self.green_energy_amount, 'green_energy_amount')
        self.validate_required(self.green_operation_records, 'green_operation_records')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.occurrence_period is not None:
            result['occurrence_period'] = self.occurrence_period
        if self.green_energy_amount is not None:
            result['green_energy_amount'] = self.green_energy_amount
        if self.green_operation_records is not None:
            result['green_operation_records'] = self.green_operation_records
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('occurrence_period') is not None:
            self.occurrence_period = m.get('occurrence_period')
        if m.get('green_energy_amount') is not None:
            self.green_energy_amount = m.get('green_energy_amount')
        if m.get('green_operation_records') is not None:
            self.green_operation_records = m.get('green_operation_records')
        return self


class GreenOperationRecordSummary(TeaModel):
    def __init__(
        self,
        green_operation_no: str = None,
        green_operation_type: str = None,
        green_operation_type_name: str = None,
        enterprise_biz_no: str = None,
        occurrence_time: str = None,
        green_energy_amount: int = None,
    ):
        # 绿色行为记录编码
        self.green_operation_no = green_operation_no
        # 绿色行为类型
        self.green_operation_type = green_operation_type
        # 绿色行为类型名称
        self.green_operation_type_name = green_operation_type_name
        # 发生绿色行为的相关业务单号
        self.enterprise_biz_no = enterprise_biz_no
        # 绿色行为发生时间，格式应如：2021-07-21 12:11:11
        self.occurrence_time = occurrence_time
        # 绿色行为的绿色能量值
        self.green_energy_amount = green_energy_amount

    def validate(self):
        self.validate_required(self.green_operation_no, 'green_operation_no')
        self.validate_required(self.green_operation_type, 'green_operation_type')
        self.validate_required(self.green_operation_type_name, 'green_operation_type_name')
        self.validate_required(self.enterprise_biz_no, 'enterprise_biz_no')
        self.validate_required(self.occurrence_time, 'occurrence_time')
        self.validate_required(self.green_energy_amount, 'green_energy_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.green_operation_no is not None:
            result['green_operation_no'] = self.green_operation_no
        if self.green_operation_type is not None:
            result['green_operation_type'] = self.green_operation_type
        if self.green_operation_type_name is not None:
            result['green_operation_type_name'] = self.green_operation_type_name
        if self.enterprise_biz_no is not None:
            result['enterprise_biz_no'] = self.enterprise_biz_no
        if self.occurrence_time is not None:
            result['occurrence_time'] = self.occurrence_time
        if self.green_energy_amount is not None:
            result['green_energy_amount'] = self.green_energy_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('green_operation_no') is not None:
            self.green_operation_no = m.get('green_operation_no')
        if m.get('green_operation_type') is not None:
            self.green_operation_type = m.get('green_operation_type')
        if m.get('green_operation_type_name') is not None:
            self.green_operation_type_name = m.get('green_operation_type_name')
        if m.get('enterprise_biz_no') is not None:
            self.enterprise_biz_no = m.get('enterprise_biz_no')
        if m.get('occurrence_time') is not None:
            self.occurrence_time = m.get('occurrence_time')
        if m.get('green_energy_amount') is not None:
            self.green_energy_amount = m.get('green_energy_amount')
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
        _map = super().to_map()
        if _map is not None:
            return _map

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
        _map = super().to_map()
        if _map is not None:
            return _map

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
        _map = super().to_map()
        if _map is not None:
            return _map

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
        _map = super().to_map()
        if _map is not None:
            return _map

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
        _map = super().to_map()
        if _map is not None:
            return _map

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


class QueryEmissionTotalRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        activity_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 活动编码
        self.activity_no = activity_no

    def validate(self):
        self.validate_required(self.activity_no, 'activity_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.activity_no is not None:
            result['activity_no'] = self.activity_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('activity_no') is not None:
            self.activity_no = m.get('activity_no')
        return self


class QueryEmissionTotalResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_emission: int = None,
        total_emission_today: int = None,
        total_reduction: int = None,
        total_reduction_today: int = None,
        total_counteraction: int = None,
        total_counteraction_today: int = None,
        data_unit: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 累计排放量
        self.total_emission = total_emission
        # 今日新增碳排放量
        self.total_emission_today = total_emission_today
        # 累计减碳量
        self.total_reduction = total_reduction
        # 今日减碳量
        self.total_reduction_today = total_reduction_today
        # 累计抵消量
        self.total_counteraction = total_counteraction
        # 今日抵消量
        self.total_counteraction_today = total_counteraction_today
        # 排放数据单位
        self.data_unit = data_unit

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
        if self.total_emission is not None:
            result['total_emission'] = self.total_emission
        if self.total_emission_today is not None:
            result['total_emission_today'] = self.total_emission_today
        if self.total_reduction is not None:
            result['total_reduction'] = self.total_reduction
        if self.total_reduction_today is not None:
            result['total_reduction_today'] = self.total_reduction_today
        if self.total_counteraction is not None:
            result['total_counteraction'] = self.total_counteraction
        if self.total_counteraction_today is not None:
            result['total_counteraction_today'] = self.total_counteraction_today
        if self.data_unit is not None:
            result['data_unit'] = self.data_unit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_emission') is not None:
            self.total_emission = m.get('total_emission')
        if m.get('total_emission_today') is not None:
            self.total_emission_today = m.get('total_emission_today')
        if m.get('total_reduction') is not None:
            self.total_reduction = m.get('total_reduction')
        if m.get('total_reduction_today') is not None:
            self.total_reduction_today = m.get('total_reduction_today')
        if m.get('total_counteraction') is not None:
            self.total_counteraction = m.get('total_counteraction')
        if m.get('total_counteraction_today') is not None:
            self.total_counteraction_today = m.get('total_counteraction_today')
        if m.get('data_unit') is not None:
            self.data_unit = m.get('data_unit')
        return self


class QueryEmissionGroupbycategoryRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        activity_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 活动编码
        self.activity_no = activity_no

    def validate(self):
        self.validate_required(self.activity_no, 'activity_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.activity_no is not None:
            result['activity_no'] = self.activity_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('activity_no') is not None:
            self.activity_no = m.get('activity_no')
        return self


class QueryEmissionGroupbycategoryResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        list: List[EmissionsCategoryStatistics] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 按照排放类型分组统计的排放量结果列表
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
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
                temp_model = EmissionsCategoryStatistics()
                self.list.append(temp_model.from_map(k))
        return self


class QueryEmissionGroupbylocationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        activity_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 活动编码
        self.activity_no = activity_no

    def validate(self):
        self.validate_required(self.activity_no, 'activity_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.activity_no is not None:
            result['activity_no'] = self.activity_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('activity_no') is not None:
            self.activity_no = m.get('activity_no')
        return self


class QueryEmissionGroupbylocationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        list: List[EmissionsLocationStatistics] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 按照排放单元分组统计的碳排放量列表
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
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
                temp_model = EmissionsLocationStatistics()
                self.list.append(temp_model.from_map(k))
        return self


class QueryEmissionGroupbycityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        activity_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 活动编码
        self.activity_no = activity_no

    def validate(self):
        self.validate_required(self.activity_no, 'activity_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.activity_no is not None:
            result['activity_no'] = self.activity_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('activity_no') is not None:
            self.activity_no = m.get('activity_no')
        return self


class QueryEmissionGroupbycityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        list: List[EmissionsCityStatistics] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 按城市分组统计的碳排放量列表
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
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
                temp_model = EmissionsCityStatistics()
                self.list.append(temp_model.from_map(k))
        return self


class QueryEmissionReductionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        activity_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 活动编码
        self.activity_no = activity_no

    def validate(self):
        self.validate_required(self.activity_no, 'activity_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.activity_no is not None:
            result['activity_no'] = self.activity_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('activity_no') is not None:
            self.activity_no = m.get('activity_no')
        return self


class QueryEmissionReductionResponse(TeaModel):
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
        # 减排量按减排方法分组统计
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
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


class QueryEmissionCounteractionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        activity_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 活动编码
        self.activity_no = activity_no

    def validate(self):
        self.validate_required(self.activity_no, 'activity_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.activity_no is not None:
            result['activity_no'] = self.activity_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('activity_no') is not None:
            self.activity_no = m.get('activity_no')
        return self


class QueryEmissionCounteractionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        list: List[EmissionCounteractionStatistics] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 碳抵消量按抵消类型分组统计
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
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
                temp_model = EmissionCounteractionStatistics()
                self.list.append(temp_model.from_map(k))
        return self


class RegisterPdcpAccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_type: str = None,
        user_name: str = None,
        user_id: str = None,
        cert_type: str = None,
        cert_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # PERSON("个人"),
        # ENTERPRISE("企业")
        self.user_type = user_type
        # 用户名称
        self.user_name = user_name
        # 用户ID
        self.user_id = user_id
        # PASSPORT("护照"),
        # RESIDENT("身份证"),
        # NATIONAL_LEGAL_MERGE("统一社会信用代码")
        self.cert_type = cert_type
        # 证件号码
        self.cert_no = cert_no

    def validate(self):
        self.validate_required(self.user_type, 'user_type')
        self.validate_required(self.user_name, 'user_name')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.cert_type, 'cert_type')
        self.validate_required(self.cert_no, 'cert_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        return self


class RegisterPdcpAccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        carbon_account_info: AccountRegisterResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 账户开通结果
        self.carbon_account_info = carbon_account_info

    def validate(self):
        if self.carbon_account_info:
            self.carbon_account_info.validate()

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
        if self.carbon_account_info is not None:
            result['carbon_account_info'] = self.carbon_account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('carbon_account_info') is not None:
            temp_model = AccountRegisterResponse()
            self.carbon_account_info = temp_model.from_map(m['carbon_account_info'])
        return self


class PushPdcpBlockchainRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tx_msg_id: str = None,
        user_id: str = None,
        data_type: str = None,
        encrypt_type: str = None,
        deposit_data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 消息ID
        self.tx_msg_id = tx_msg_id
        # 用户ID
        self.user_id = user_id
        # 数据类型，枚举定义
        self.data_type = data_type
        # 密文类型
        self.encrypt_type = encrypt_type
        # 待存证数据，根据数据类型序列化为json。并加密传输
        self.deposit_data = deposit_data

    def validate(self):
        self.validate_required(self.tx_msg_id, 'tx_msg_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.data_type, 'data_type')
        self.validate_required(self.encrypt_type, 'encrypt_type')
        self.validate_required(self.deposit_data, 'deposit_data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tx_msg_id is not None:
            result['tx_msg_id'] = self.tx_msg_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.encrypt_type is not None:
            result['encrypt_type'] = self.encrypt_type
        if self.deposit_data is not None:
            result['deposit_data'] = self.deposit_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tx_msg_id') is not None:
            self.tx_msg_id = m.get('tx_msg_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('encrypt_type') is not None:
            self.encrypt_type = m.get('encrypt_type')
        if m.get('deposit_data') is not None:
            self.deposit_data = m.get('deposit_data')
        return self


class PushPdcpBlockchainResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_data: BlockchainDTO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 上链信息: 交易hash，块高
        self.tx_data = tx_data

    def validate(self):
        if self.tx_data:
            self.tx_data.validate()

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
        if self.tx_data is not None:
            result['tx_data'] = self.tx_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tx_data') is not None:
            temp_model = BlockchainDTO()
            self.tx_data = temp_model.from_map(m['tx_data'])
        return self


class UploadPdcpBlockchainRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tx_msg_id: str = None,
        user_id: str = None,
        data_type: str = None,
        encrypt_type: str = None,
        deposit_data: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求ID
        self.tx_msg_id = tx_msg_id
        # 用户ID
        self.user_id = user_id
        # 数据类型
        self.data_type = data_type
        # 加密类型
        self.encrypt_type = encrypt_type
        # 待存证数据，根据数据类型序列化后加密传输
        self.deposit_data = deposit_data

    def validate(self):
        self.validate_required(self.tx_msg_id, 'tx_msg_id')
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.data_type, 'data_type')
        self.validate_required(self.encrypt_type, 'encrypt_type')
        self.validate_required(self.deposit_data, 'deposit_data')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tx_msg_id is not None:
            result['tx_msg_id'] = self.tx_msg_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.encrypt_type is not None:
            result['encrypt_type'] = self.encrypt_type
        if self.deposit_data is not None:
            result['deposit_data'] = self.deposit_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tx_msg_id') is not None:
            self.tx_msg_id = m.get('tx_msg_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('encrypt_type') is not None:
            self.encrypt_type = m.get('encrypt_type')
        if m.get('deposit_data') is not None:
            self.deposit_data = m.get('deposit_data')
        return self


class UploadPdcpBlockchainResponse(TeaModel):
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


class GetPdcpBlockchainRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tx_msg_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求ID
        self.tx_msg_id = tx_msg_id

    def validate(self):
        self.validate_required(self.tx_msg_id, 'tx_msg_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tx_msg_id is not None:
            result['tx_msg_id'] = self.tx_msg_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tx_msg_id') is not None:
            self.tx_msg_id = m.get('tx_msg_id')
        return self


class GetPdcpBlockchainResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tx_data: BlockchainDTO = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回上链信息
        self.tx_data = tx_data

    def validate(self):
        if self.tx_data:
            self.tx_data.validate()

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
        if self.tx_data is not None:
            result['tx_data'] = self.tx_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tx_data') is not None:
            temp_model = BlockchainDTO()
            self.tx_data = temp_model.from_map(m['tx_data'])
        return self


class QueryPdcpAccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 用户ID
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class QueryPdcpAccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        carbon_account_info: AccountRegisterResponse = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 开户结果
        self.carbon_account_info = carbon_account_info

    def validate(self):
        if self.carbon_account_info:
            self.carbon_account_info.validate()

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
        if self.carbon_account_info is not None:
            result['carbon_account_info'] = self.carbon_account_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('carbon_account_info') is not None:
            temp_model = AccountRegisterResponse()
            self.carbon_account_info = temp_model.from_map(m['carbon_account_info'])
        return self


class AddEcarAvitivedataRequest(TeaModel):
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


class AddEcarAvitivedataResponse(TeaModel):
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


class DetailEcarAvitivedataRequest(TeaModel):
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


class DetailEcarAvitivedataResponse(TeaModel):
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


class CountEcarActivedataRequest(TeaModel):
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


class CountEcarActivedataResponse(TeaModel):
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


class UploadEcarFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # Port的文件内容
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.file_id, 'file_id')

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
        return self


class UploadEcarFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        document_name: str = None,
        document_address: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 文档名称
        self.document_name = document_name
        # 碳矩阵存放的文件地址
        self.document_address = document_address

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
        if self.document_name is not None:
            result['document_name'] = self.document_name
        if self.document_address is not None:
            result['document_address'] = self.document_address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('document_name') is not None:
            self.document_name = m.get('document_name')
        if m.get('document_address') is not None:
            self.document_address = m.get('document_address')
        return self


class AddEcarGreenoperationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        green_operation_type: str = None,
        enterprise_biz_no: str = None,
        occurrence_time: str = None,
        ext_info: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 绿色行为类型，目前支持包括：
        # ElectronicInvoice(电子发票),
        # LowCarbonCommodity(低碳商品),
        # ReusableBag(环保减塑)
        # OfflinePayment(线下支付)
        # GreenOrder(绿色订单，可以同时解析出低碳商品、环保减塑、线下支付等多种绿色行为)
        self.green_operation_type = green_operation_type
        # 绿色行为相关的业务单号
        self.enterprise_biz_no = enterprise_biz_no
        # 发生时间，格式应如：2021-07-21 12:11:11
        self.occurrence_time = occurrence_time
        # 绿色行为数据扩展信息，必须为JSON格式，碳矩阵将分析解析数据检查获取相关的绿色行为数据
        self.ext_info = ext_info

    def validate(self):
        self.validate_required(self.green_operation_type, 'green_operation_type')
        self.validate_required(self.enterprise_biz_no, 'enterprise_biz_no')
        self.validate_required(self.occurrence_time, 'occurrence_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.green_operation_type is not None:
            result['green_operation_type'] = self.green_operation_type
        if self.enterprise_biz_no is not None:
            result['enterprise_biz_no'] = self.enterprise_biz_no
        if self.occurrence_time is not None:
            result['occurrence_time'] = self.occurrence_time
        if self.ext_info is not None:
            result['ext_info'] = self.ext_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('green_operation_type') is not None:
            self.green_operation_type = m.get('green_operation_type')
        if m.get('enterprise_biz_no') is not None:
            self.enterprise_biz_no = m.get('enterprise_biz_no')
        if m.get('occurrence_time') is not None:
            self.occurrence_time = m.get('occurrence_time')
        if m.get('ext_info') is not None:
            self.ext_info = m.get('ext_info')
        return self


class AddEcarGreenoperationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        list: List[GreenOperationRecordSummary] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回记录的多种绿色行为数据摘要信息
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
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
                temp_model = GreenOperationRecordSummary()
                self.list.append(temp_model.from_map(k))
        return self


class CountEcarGreenoperationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        statistic_frequence: str = None,
        occurrence_start_time: str = None,
        occurrence_end_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 绿色行为统计频率，可选值：
        # Monthly(分月统计),
        # Daily(按每日统计)
        # 
        self.statistic_frequence = statistic_frequence
        # 统计数据的发生起始时间，格式应如：2021-07-21 12:11:11
        self.occurrence_start_time = occurrence_start_time
        # 统计数据的发生结束时间，格式应如：2021-07-21 12:11:11，不传为当日最近时间
        self.occurrence_end_time = occurrence_end_time

    def validate(self):
        self.validate_required(self.statistic_frequence, 'statistic_frequence')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.statistic_frequence is not None:
            result['statistic_frequence'] = self.statistic_frequence
        if self.occurrence_start_time is not None:
            result['occurrence_start_time'] = self.occurrence_start_time
        if self.occurrence_end_time is not None:
            result['occurrence_end_time'] = self.occurrence_end_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('statistic_frequence') is not None:
            self.statistic_frequence = m.get('statistic_frequence')
        if m.get('occurrence_start_time') is not None:
            self.occurrence_start_time = m.get('occurrence_start_time')
        if m.get('occurrence_end_time') is not None:
            self.occurrence_end_time = m.get('occurrence_end_time')
        return self


class CountEcarGreenoperationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        green_energy_total: int = None,
        green_energy_unit: str = None,
        green_operation_records: int = None,
        statistics_by_frequence_list: List[GreenOperationStatisticsByFrequence] = None,
        statistics_by_type_list: List[GreenOperationStatisticsByType] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 绿色行为产生的绿色能量总量
        self.green_energy_total = green_energy_total
        # 绿色能量单位，默认为g
        self.green_energy_unit = green_energy_unit
        # 绿色行为记录数据
        self.green_operation_records = green_operation_records
        # 按频率统计的绿色行为数据列表
        self.statistics_by_frequence_list = statistics_by_frequence_list
        # 按绿色行为类型统计的绿色行为数据列表
        self.statistics_by_type_list = statistics_by_type_list

    def validate(self):
        if self.statistics_by_frequence_list:
            for k in self.statistics_by_frequence_list:
                if k:
                    k.validate()
        if self.statistics_by_type_list:
            for k in self.statistics_by_type_list:
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
        if self.green_energy_total is not None:
            result['green_energy_total'] = self.green_energy_total
        if self.green_energy_unit is not None:
            result['green_energy_unit'] = self.green_energy_unit
        if self.green_operation_records is not None:
            result['green_operation_records'] = self.green_operation_records
        result['statistics_by_frequence_list'] = []
        if self.statistics_by_frequence_list is not None:
            for k in self.statistics_by_frequence_list:
                result['statistics_by_frequence_list'].append(k.to_map() if k else None)
        result['statistics_by_type_list'] = []
        if self.statistics_by_type_list is not None:
            for k in self.statistics_by_type_list:
                result['statistics_by_type_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('green_energy_total') is not None:
            self.green_energy_total = m.get('green_energy_total')
        if m.get('green_energy_unit') is not None:
            self.green_energy_unit = m.get('green_energy_unit')
        if m.get('green_operation_records') is not None:
            self.green_operation_records = m.get('green_operation_records')
        self.statistics_by_frequence_list = []
        if m.get('statistics_by_frequence_list') is not None:
            for k in m.get('statistics_by_frequence_list'):
                temp_model = GreenOperationStatisticsByFrequence()
                self.statistics_by_frequence_list.append(temp_model.from_map(k))
        self.statistics_by_type_list = []
        if m.get('statistics_by_type_list') is not None:
            for k in m.get('statistics_by_type_list'):
                temp_model = GreenOperationStatisticsByType()
                self.statistics_by_type_list.append(temp_model.from_map(k))
        return self


class ListEcarGreenoperationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        limit: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 限制的记录条数
        self.limit = limit

    def validate(self):
        self.validate_required(self.limit, 'limit')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.limit is not None:
            result['limit'] = self.limit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('limit') is not None:
            self.limit = m.get('limit')
        return self


class ListEcarGreenoperationResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        list: List[GreenOperationRecordSummary] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 最近发生的绿色行为数据列表
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
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
                temp_model = GreenOperationRecordSummary()
                self.list.append(temp_model.from_map(k))
        return self


class PreviewEcarAvitivedataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        year: int = None,
        comparison_standard: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 请求统计的年份，默认为当前年份
        self.year = year
        # 统计比较运算是的基准：
        # LastYear(去年同期比较),
        # CriteriaYear(同基准年比较)。
        # 默认与去年同期比较。
        self.comparison_standard = comparison_standard

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
        if self.year is not None:
            result['year'] = self.year
        if self.comparison_standard is not None:
            result['comparison_standard'] = self.comparison_standard
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('year') is not None:
            self.year = m.get('year')
        if m.get('comparison_standard') is not None:
            self.comparison_standard = m.get('comparison_standard')
        return self


class PreviewEcarAvitivedataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_emissions: str = None,
        subtract_reductions: str = None,
        net_reductions: str = None,
        year_compare_last_per: str = None,
        unit: str = None,
        unit_label: str = None,
        list: List[AnnualMonthEmissionDatum] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总排放量，最多保留6位小数
        self.total_emissions = total_emissions
        # 核减减排量，最多保留6位小数
        self.subtract_reductions = subtract_reductions
        # 净排放量，核减后的碳排放量
        self.net_reductions = net_reductions
        # 年同比
        self.year_compare_last_per = year_compare_last_per
        # 碳排放量单位
        self.unit = unit
        # 碳排放量单位显示标签
        self.unit_label = unit_label
        # 各月份排放数据列表
        self.list = list

    def validate(self):
        if self.list:
            for k in self.list:
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
        if self.total_emissions is not None:
            result['total_emissions'] = self.total_emissions
        if self.subtract_reductions is not None:
            result['subtract_reductions'] = self.subtract_reductions
        if self.net_reductions is not None:
            result['net_reductions'] = self.net_reductions
        if self.year_compare_last_per is not None:
            result['year_compare_last_per'] = self.year_compare_last_per
        if self.unit is not None:
            result['unit'] = self.unit
        if self.unit_label is not None:
            result['unit_label'] = self.unit_label
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
        if m.get('total_emissions') is not None:
            self.total_emissions = m.get('total_emissions')
        if m.get('subtract_reductions') is not None:
            self.subtract_reductions = m.get('subtract_reductions')
        if m.get('net_reductions') is not None:
            self.net_reductions = m.get('net_reductions')
        if m.get('year_compare_last_per') is not None:
            self.year_compare_last_per = m.get('year_compare_last_per')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('unit_label') is not None:
            self.unit_label = m.get('unit_label')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = AnnualMonthEmissionDatum()
                self.list.append(temp_model.from_map(k))
        return self


class QueryThirdCertRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        product_id: str = None,
        certification_type: str = None,
        cproduct_name: str = None,
        cproduct_model: str = None,
        cproduct_firm: str = None,
        company_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 三方平台的产品ID
        self.product_id = product_id
        # GreenProductCertification ：绿色产品认证证书
        # GarbonNeutrality ： 碳中和证书
        # GreenhouseGasInventory 温室气体核查证书
        self.certification_type = certification_type
        # 证书文件中的产品名称
        self.cproduct_name = cproduct_name
        # 证书文件中的产品型号
        self.cproduct_model = cproduct_model
        # 证书文件中的生产商名称
        self.cproduct_firm = cproduct_firm
        # 三方平台的企业ID
        self.company_id = company_id

    def validate(self):
        self.validate_required(self.company_id, 'company_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.product_id is not None:
            result['product_id'] = self.product_id
        if self.certification_type is not None:
            result['certification_type'] = self.certification_type
        if self.cproduct_name is not None:
            result['cproduct_name'] = self.cproduct_name
        if self.cproduct_model is not None:
            result['cproduct_model'] = self.cproduct_model
        if self.cproduct_firm is not None:
            result['cproduct_firm'] = self.cproduct_firm
        if self.company_id is not None:
            result['company_id'] = self.company_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        if m.get('certification_type') is not None:
            self.certification_type = m.get('certification_type')
        if m.get('cproduct_name') is not None:
            self.cproduct_name = m.get('cproduct_name')
        if m.get('cproduct_model') is not None:
            self.cproduct_model = m.get('cproduct_model')
        if m.get('cproduct_firm') is not None:
            self.cproduct_firm = m.get('cproduct_firm')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        return self


class QueryThirdCertResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        certifications: List[CertProductInfoDO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 证书列表
        self.certifications = certifications

    def validate(self):
        if self.certifications:
            for k in self.certifications:
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
        result['certifications'] = []
        if self.certifications is not None:
            for k in self.certifications:
                result['certifications'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.certifications = []
        if m.get('certifications') is not None:
            for k in m.get('certifications'):
                temp_model = CertProductInfoDO()
                self.certifications.append(temp_model.from_map(k))
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


