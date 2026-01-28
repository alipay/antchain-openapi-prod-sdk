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


class EnterpriseLcaAssessmentItem(TeaModel):
    def __init__(
        self,
        material_code: str = None,
        assessment_item_name: str = None,
        emission_amount: str = None,
        transport_emission_amount: str = None,
    ):
        # 物料编码
        self.material_code = material_code
        # 数据明细名称
        self.assessment_item_name = assessment_item_name
        # 物料直接碳排放评估量
        self.emission_amount = emission_amount
        # 物料运输碳排放评估量
        self.transport_emission_amount = transport_emission_amount

    def validate(self):
        self.validate_required(self.material_code, 'material_code')
        self.validate_required(self.assessment_item_name, 'assessment_item_name')
        self.validate_required(self.emission_amount, 'emission_amount')
        self.validate_required(self.transport_emission_amount, 'transport_emission_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.material_code is not None:
            result['material_code'] = self.material_code
        if self.assessment_item_name is not None:
            result['assessment_item_name'] = self.assessment_item_name
        if self.emission_amount is not None:
            result['emission_amount'] = self.emission_amount
        if self.transport_emission_amount is not None:
            result['transport_emission_amount'] = self.transport_emission_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('material_code') is not None:
            self.material_code = m.get('material_code')
        if m.get('assessment_item_name') is not None:
            self.assessment_item_name = m.get('assessment_item_name')
        if m.get('emission_amount') is not None:
            self.emission_amount = m.get('emission_amount')
        if m.get('transport_emission_amount') is not None:
            self.transport_emission_amount = m.get('transport_emission_amount')
        return self


class TransportActiveData(TeaModel):
    def __init__(
        self,
        transport_code: str = None,
        equipment: str = None,
        distance: str = None,
        is_empty_load: bool = None,
    ):
        # 运输方式编码
        self.transport_code = transport_code
        # 运输设备
        self.equipment = equipment
        # 运输里程
        self.distance = distance
        # 是否空载
        self.is_empty_load = is_empty_load

    def validate(self):
        self.validate_required(self.transport_code, 'transport_code')
        self.validate_required(self.equipment, 'equipment')
        self.validate_required(self.distance, 'distance')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.transport_code is not None:
            result['transport_code'] = self.transport_code
        if self.equipment is not None:
            result['equipment'] = self.equipment
        if self.distance is not None:
            result['distance'] = self.distance
        if self.is_empty_load is not None:
            result['is_empty_load'] = self.is_empty_load
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('transport_code') is not None:
            self.transport_code = m.get('transport_code')
        if m.get('equipment') is not None:
            self.equipment = m.get('equipment')
        if m.get('distance') is not None:
            self.distance = m.get('distance')
        if m.get('is_empty_load') is not None:
            self.is_empty_load = m.get('is_empty_load')
        return self


class EnterpriseLcaStageAssessmentItem(TeaModel):
    def __init__(
        self,
        lca_stage: str = None,
        lca_stage_carbon_rate: str = None,
        lca_stage_carbon_emissions: str = None,
        lca_assessment_datum: List[EnterpriseLcaAssessmentItem] = None,
    ):
        # LCA阶段
        self.lca_stage = lca_stage
        # 阶段排放占比
        self.lca_stage_carbon_rate = lca_stage_carbon_rate
        # 阶段排放量
        self.lca_stage_carbon_emissions = lca_stage_carbon_emissions
        # 阶段评估明细数据
        self.lca_assessment_datum = lca_assessment_datum

    def validate(self):
        self.validate_required(self.lca_stage, 'lca_stage')
        self.validate_required(self.lca_stage_carbon_rate, 'lca_stage_carbon_rate')
        self.validate_required(self.lca_stage_carbon_emissions, 'lca_stage_carbon_emissions')
        self.validate_required(self.lca_assessment_datum, 'lca_assessment_datum')
        if self.lca_assessment_datum:
            for k in self.lca_assessment_datum:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.lca_stage is not None:
            result['lca_stage'] = self.lca_stage
        if self.lca_stage_carbon_rate is not None:
            result['lca_stage_carbon_rate'] = self.lca_stage_carbon_rate
        if self.lca_stage_carbon_emissions is not None:
            result['lca_stage_carbon_emissions'] = self.lca_stage_carbon_emissions
        result['lca_assessment_datum'] = []
        if self.lca_assessment_datum is not None:
            for k in self.lca_assessment_datum:
                result['lca_assessment_datum'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('lca_stage') is not None:
            self.lca_stage = m.get('lca_stage')
        if m.get('lca_stage_carbon_rate') is not None:
            self.lca_stage_carbon_rate = m.get('lca_stage_carbon_rate')
        if m.get('lca_stage_carbon_emissions') is not None:
            self.lca_stage_carbon_emissions = m.get('lca_stage_carbon_emissions')
        self.lca_assessment_datum = []
        if m.get('lca_assessment_datum') is not None:
            for k in m.get('lca_assessment_datum'):
                temp_model = EnterpriseLcaAssessmentItem()
                self.lca_assessment_datum.append(temp_model.from_map(k))
        return self


class DepositFieldValue(TeaModel):
    def __init__(
        self,
        name: str = None,
        value: str = None,
    ):
        # 存证数据字段名
        self.name = name
        # 存证数据字段值
        self.value = value

    def validate(self):
        self.validate_required(self.name, 'name')

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


class InputStreamActiveData(TeaModel):
    def __init__(
        self,
        material_code: str = None,
        amount: str = None,
        unit: str = None,
        transport_list: List[TransportActiveData] = None,
    ):
        # 物料编码
        self.material_code = material_code
        # 用量，非负，最多6位小数
        self.amount = amount
        # 单位
        self.unit = unit
        # 运输信息列表
        self.transport_list = transport_list

    def validate(self):
        self.validate_required(self.material_code, 'material_code')
        self.validate_required(self.amount, 'amount')
        self.validate_required(self.unit, 'unit')
        if self.transport_list:
            for k in self.transport_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.material_code is not None:
            result['material_code'] = self.material_code
        if self.amount is not None:
            result['amount'] = self.amount
        if self.unit is not None:
            result['unit'] = self.unit
        result['transport_list'] = []
        if self.transport_list is not None:
            for k in self.transport_list:
                result['transport_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('material_code') is not None:
            self.material_code = m.get('material_code')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        self.transport_list = []
        if m.get('transport_list') is not None:
            for k in m.get('transport_list'):
                temp_model = TransportActiveData()
                self.transport_list.append(temp_model.from_map(k))
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


class InverterGeneration(TeaModel):
    def __init__(
        self,
        inv_sn: str = None,
        manufacturer: str = None,
        daily: str = None,
        total: str = None,
    ):
        # 逆变器SN
        self.inv_sn = inv_sn
        # 生产商名称
        self.manufacturer = manufacturer
        # 当日发电量，最多3位小数
        self.daily = daily
        # 累计发电量，最多3位小数
        self.total = total

    def validate(self):
        self.validate_required(self.inv_sn, 'inv_sn')
        self.validate_required(self.manufacturer, 'manufacturer')
        self.validate_required(self.daily, 'daily')
        self.validate_required(self.total, 'total')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.inv_sn is not None:
            result['inv_sn'] = self.inv_sn
        if self.manufacturer is not None:
            result['manufacturer'] = self.manufacturer
        if self.daily is not None:
            result['daily'] = self.daily
        if self.total is not None:
            result['total'] = self.total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('inv_sn') is not None:
            self.inv_sn = m.get('inv_sn')
        if m.get('manufacturer') is not None:
            self.manufacturer = m.get('manufacturer')
        if m.get('daily') is not None:
            self.daily = m.get('daily')
        if m.get('total') is not None:
            self.total = m.get('total')
        return self


class LcaStageCarbonItem(TeaModel):
    def __init__(
        self,
        lca_stage_code: str = None,
        lca_stage_carbon_amount: str = None,
    ):
        # 生命周期阶段：
        # [MaterialPurchase]-原材料，[ProductManufacture]-生产制造，[ProductSale]-分销，[ProductUsage]-产品使用，[ProductWithdraw]-处置/再生利用
        self.lca_stage_code = lca_stage_code
        # 阶段碳排放量
        self.lca_stage_carbon_amount = lca_stage_carbon_amount

    def validate(self):
        self.validate_required(self.lca_stage_code, 'lca_stage_code')
        self.validate_required(self.lca_stage_carbon_amount, 'lca_stage_carbon_amount')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.lca_stage_code is not None:
            result['lca_stage_code'] = self.lca_stage_code
        if self.lca_stage_carbon_amount is not None:
            result['lca_stage_carbon_amount'] = self.lca_stage_carbon_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('lca_stage_code') is not None:
            self.lca_stage_code = m.get('lca_stage_code')
        if m.get('lca_stage_carbon_amount') is not None:
            self.lca_stage_carbon_amount = m.get('lca_stage_carbon_amount')
        return self


class OutputStreamActiveData(TeaModel):
    def __init__(
        self,
        material_code: str = None,
        amount: str = None,
        unit: str = None,
        unit_price: str = None,
        disposal_type_code: str = None,
        transport_list: List[TransportActiveData] = None,
    ):
        # 物料编码
        self.material_code = material_code
        # 用量，非负，最多6位小数
        self.amount = amount
        # 单位
        self.unit = unit
        # 单价（仅产品用，产品不传时默认为空）
        self.unit_price = unit_price
        # 处置方式编码（仅废弃物用）
        self.disposal_type_code = disposal_type_code
        # 运输信息列表（仅废弃物用）
        self.transport_list = transport_list

    def validate(self):
        self.validate_required(self.material_code, 'material_code')
        self.validate_required(self.amount, 'amount')
        self.validate_required(self.unit, 'unit')
        if self.transport_list:
            for k in self.transport_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.material_code is not None:
            result['material_code'] = self.material_code
        if self.amount is not None:
            result['amount'] = self.amount
        if self.unit is not None:
            result['unit'] = self.unit
        if self.unit_price is not None:
            result['unit_price'] = self.unit_price
        if self.disposal_type_code is not None:
            result['disposal_type_code'] = self.disposal_type_code
        result['transport_list'] = []
        if self.transport_list is not None:
            for k in self.transport_list:
                result['transport_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('material_code') is not None:
            self.material_code = m.get('material_code')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('unit_price') is not None:
            self.unit_price = m.get('unit_price')
        if m.get('disposal_type_code') is not None:
            self.disposal_type_code = m.get('disposal_type_code')
        self.transport_list = []
        if m.get('transport_list') is not None:
            for k in m.get('transport_list'):
                temp_model = TransportActiveData()
                self.transport_list.append(temp_model.from_map(k))
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
        emission: str = None,
        rate: str = None,
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


class LcaCalcResult(TeaModel):
    def __init__(
        self,
        record_no: str = None,
        carbon_amount: str = None,
        lca_stage_assessment_datum: List[EnterpriseLcaStageAssessmentItem] = None,
        record_date: str = None,
        custom_context: str = None,
    ):
        # 速算记录编号
        self.record_no = record_no
        # 碳足迹排放量
        self.carbon_amount = carbon_amount
        # 各阶段评估数据明细
        self.lca_stage_assessment_datum = lca_stage_assessment_datum
        # 速算发起时间
        self.record_date = record_date
        # 自定义业务标识
        self.custom_context = custom_context

    def validate(self):
        self.validate_required(self.record_no, 'record_no')
        self.validate_required(self.carbon_amount, 'carbon_amount')
        self.validate_required(self.lca_stage_assessment_datum, 'lca_stage_assessment_datum')
        if self.lca_stage_assessment_datum:
            for k in self.lca_stage_assessment_datum:
                if k:
                    k.validate()
        self.validate_required(self.record_date, 'record_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.record_no is not None:
            result['record_no'] = self.record_no
        if self.carbon_amount is not None:
            result['carbon_amount'] = self.carbon_amount
        result['lca_stage_assessment_datum'] = []
        if self.lca_stage_assessment_datum is not None:
            for k in self.lca_stage_assessment_datum:
                result['lca_stage_assessment_datum'].append(k.to_map() if k else None)
        if self.record_date is not None:
            result['record_date'] = self.record_date
        if self.custom_context is not None:
            result['custom_context'] = self.custom_context
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('record_no') is not None:
            self.record_no = m.get('record_no')
        if m.get('carbon_amount') is not None:
            self.carbon_amount = m.get('carbon_amount')
        self.lca_stage_assessment_datum = []
        if m.get('lca_stage_assessment_datum') is not None:
            for k in m.get('lca_stage_assessment_datum'):
                temp_model = EnterpriseLcaStageAssessmentItem()
                self.lca_stage_assessment_datum.append(temp_model.from_map(k))
        if m.get('record_date') is not None:
            self.record_date = m.get('record_date')
        if m.get('custom_context') is not None:
            self.custom_context = m.get('custom_context')
        return self


class FinanceReportDetail(TeaModel):
    def __init__(
        self,
        file: EnterpriseDocumentFile = None,
        report_no: str = None,
        report_name: str = None,
        has_sealed: bool = None,
        report_time: str = None,
        report_submitter: str = None,
        generate_type: str = None,
        compare_year: str = None,
        base_year: str = None,
        company_name: str = None,
        area_name: str = None,
        industry_name: str = None,
        company_id: str = None,
    ):
        # 文件
        self.file = file
        # 报告编号
        self.report_no = report_no
        # 报告名称
        self.report_name = report_name
        # 是否盖章
        self.has_sealed = has_sealed
        # 报告时间
        self.report_time = report_time
        # 报告提交人
        self.report_submitter = report_submitter
        # 报告生成方式
        self.generate_type = generate_type
        # 对比年，报告年
        self.compare_year = compare_year
        # 基准年
        self.base_year = base_year
        # 企业名称
        self.company_name = company_name
        # 区域名称
        self.area_name = area_name
        # 行业名称
        self.industry_name = industry_name
        # 社会统一信用代码
        self.company_id = company_id

    def validate(self):
        self.validate_required(self.file, 'file')
        if self.file:
            self.file.validate()
        self.validate_required(self.report_no, 'report_no')
        self.validate_required(self.report_name, 'report_name')
        self.validate_required(self.has_sealed, 'has_sealed')
        self.validate_required(self.report_time, 'report_time')
        self.validate_required(self.report_submitter, 'report_submitter')
        self.validate_required(self.generate_type, 'generate_type')
        self.validate_required(self.compare_year, 'compare_year')
        self.validate_required(self.base_year, 'base_year')
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.area_name, 'area_name')
        self.validate_required(self.industry_name, 'industry_name')
        self.validate_required(self.company_id, 'company_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.file is not None:
            result['file'] = self.file.to_map()
        if self.report_no is not None:
            result['report_no'] = self.report_no
        if self.report_name is not None:
            result['report_name'] = self.report_name
        if self.has_sealed is not None:
            result['has_sealed'] = self.has_sealed
        if self.report_time is not None:
            result['report_time'] = self.report_time
        if self.report_submitter is not None:
            result['report_submitter'] = self.report_submitter
        if self.generate_type is not None:
            result['generate_type'] = self.generate_type
        if self.compare_year is not None:
            result['compare_year'] = self.compare_year
        if self.base_year is not None:
            result['base_year'] = self.base_year
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.area_name is not None:
            result['area_name'] = self.area_name
        if self.industry_name is not None:
            result['industry_name'] = self.industry_name
        if self.company_id is not None:
            result['company_id'] = self.company_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file') is not None:
            temp_model = EnterpriseDocumentFile()
            self.file = temp_model.from_map(m['file'])
        if m.get('report_no') is not None:
            self.report_no = m.get('report_no')
        if m.get('report_name') is not None:
            self.report_name = m.get('report_name')
        if m.get('has_sealed') is not None:
            self.has_sealed = m.get('has_sealed')
        if m.get('report_time') is not None:
            self.report_time = m.get('report_time')
        if m.get('report_submitter') is not None:
            self.report_submitter = m.get('report_submitter')
        if m.get('generate_type') is not None:
            self.generate_type = m.get('generate_type')
        if m.get('compare_year') is not None:
            self.compare_year = m.get('compare_year')
        if m.get('base_year') is not None:
            self.base_year = m.get('base_year')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('area_name') is not None:
            self.area_name = m.get('area_name')
        if m.get('industry_name') is not None:
            self.industry_name = m.get('industry_name')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
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
        reduction_amount: str = None,
        reduction_ratio: str = None,
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


class DataAssetInfo(TeaModel):
    def __init__(
        self,
        dataset_did: str = None,
        user_did: str = None,
        dataset_name: str = None,
        data_type: str = None,
    ):
        # 数据资产DID
        self.dataset_did = dataset_did
        # 数据资产所有方DID
        self.user_did = user_did
        # 数据资产名称
        self.dataset_name = dataset_name
        # 数据类型
        self.data_type = data_type

    def validate(self):
        self.validate_required(self.dataset_did, 'dataset_did')
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.dataset_name, 'dataset_name')
        self.validate_required(self.data_type, 'data_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.dataset_did is not None:
            result['dataset_did'] = self.dataset_did
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.dataset_name is not None:
            result['dataset_name'] = self.dataset_name
        if self.data_type is not None:
            result['data_type'] = self.data_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('dataset_did') is not None:
            self.dataset_did = m.get('dataset_did')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('dataset_name') is not None:
            self.dataset_name = m.get('dataset_name')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        return self


class EmissionCounteractionStatistics(TeaModel):
    def __init__(
        self,
        assert_type: str = None,
        assert_type_name: str = None,
        counteraction_amount: str = None,
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


class DeviceGeneration(TeaModel):
    def __init__(
        self,
        device_no: str = None,
        inverter_generations: List[InverterGeneration] = None,
    ):
        # 设备内部编号，注册设备后获取
        self.device_no = device_no
        # 逆变器发电量列表
        self.inverter_generations = inverter_generations

    def validate(self):
        self.validate_required(self.device_no, 'device_no')
        self.validate_required(self.inverter_generations, 'inverter_generations')
        if self.inverter_generations:
            for k in self.inverter_generations:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_no is not None:
            result['device_no'] = self.device_no
        result['inverter_generations'] = []
        if self.inverter_generations is not None:
            for k in self.inverter_generations:
                result['inverter_generations'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_no') is not None:
            self.device_no = m.get('device_no')
        self.inverter_generations = []
        if m.get('inverter_generations') is not None:
            for k in m.get('inverter_generations'):
                temp_model = InverterGeneration()
                self.inverter_generations.append(temp_model.from_map(k))
        return self


class CarbonAccountInfo(TeaModel):
    def __init__(
        self,
        user_did: str = None,
        user_name: str = None,
    ):
        # 账户did
        self.user_did = user_did
        # 账户名称
        self.user_name = user_name

    def validate(self):
        self.validate_required(self.user_did, 'user_did')
        self.validate_required(self.user_name, 'user_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.user_name is not None:
            result['user_name'] = self.user_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
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


class DataDepositInfo(TeaModel):
    def __init__(
        self,
        data_value: List[DepositFieldValue] = None,
        tx_id: str = None,
        user_id: str = None,
        deposit_content: str = None,
        status: str = None,
        timestamp: int = None,
    ):
        # 存证字段值
        self.data_value = data_value
        # 数据存证区块链交易ID
        self.tx_id = tx_id
        # 数据存证操作用户ID
        self.user_id = user_id
        # 存证数据内容
        self.deposit_content = deposit_content
        # 存证执行状态
        self.status = status
        # 存证执行(发起)时间
        self.timestamp = timestamp

    def validate(self):
        self.validate_required(self.data_value, 'data_value')
        if self.data_value:
            for k in self.data_value:
                if k:
                    k.validate()
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.deposit_content, 'deposit_content')
        self.validate_required(self.status, 'status')
        self.validate_required(self.timestamp, 'timestamp')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['data_value'] = []
        if self.data_value is not None:
            for k in self.data_value:
                result['data_value'].append(k.to_map() if k else None)
        if self.tx_id is not None:
            result['tx_id'] = self.tx_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.deposit_content is not None:
            result['deposit_content'] = self.deposit_content
        if self.status is not None:
            result['status'] = self.status
        if self.timestamp is not None:
            result['timestamp'] = self.timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.data_value = []
        if m.get('data_value') is not None:
            for k in m.get('data_value'):
                temp_model = DepositFieldValue()
                self.data_value.append(temp_model.from_map(k))
        if m.get('tx_id') is not None:
            self.tx_id = m.get('tx_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('deposit_content') is not None:
            self.deposit_content = m.get('deposit_content')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('timestamp') is not None:
            self.timestamp = m.get('timestamp')
        return self


class CarbonOffsetAcquisitionItem(TeaModel):
    def __init__(
        self,
        acquisition_item_no: str = None,
        project_no: str = None,
        account_did: str = None,
        occurrent_time: str = None,
        scenario_code: str = None,
        scenario_name: str = None,
        platform_no: str = None,
        active_datum: List[AnyAmountItem] = None,
        offset_volume: str = None,
        carbon_energy: int = None,
    ):
        # 采集数据单号
        self.acquisition_item_no = acquisition_item_no
        # 碳补偿项目编号
        self.project_no = project_no
        # 参与账户DID
        self.account_did = account_did
        # 发生时间
        self.occurrent_time = occurrent_time
        # 发生场景编码
        self.scenario_code = scenario_code
        # 发生场景名称
        self.scenario_name = scenario_name
        # 碳普惠平台编码，如果非平台采集数据，则显示为自采编码：Self
        self.platform_no = platform_no
        # 活动数据原始值，多个活动数据列表
        self.active_datum = active_datum
        # 减碳量
        self.offset_volume = offset_volume
        # 碳能量值
        self.carbon_energy = carbon_energy

    def validate(self):
        self.validate_required(self.acquisition_item_no, 'acquisition_item_no')
        self.validate_required(self.project_no, 'project_no')
        self.validate_required(self.account_did, 'account_did')
        self.validate_required(self.occurrent_time, 'occurrent_time')
        self.validate_required(self.scenario_code, 'scenario_code')
        self.validate_required(self.scenario_name, 'scenario_name')
        self.validate_required(self.platform_no, 'platform_no')
        if self.active_datum:
            for k in self.active_datum:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.acquisition_item_no is not None:
            result['acquisition_item_no'] = self.acquisition_item_no
        if self.project_no is not None:
            result['project_no'] = self.project_no
        if self.account_did is not None:
            result['account_did'] = self.account_did
        if self.occurrent_time is not None:
            result['occurrent_time'] = self.occurrent_time
        if self.scenario_code is not None:
            result['scenario_code'] = self.scenario_code
        if self.scenario_name is not None:
            result['scenario_name'] = self.scenario_name
        if self.platform_no is not None:
            result['platform_no'] = self.platform_no
        result['active_datum'] = []
        if self.active_datum is not None:
            for k in self.active_datum:
                result['active_datum'].append(k.to_map() if k else None)
        if self.offset_volume is not None:
            result['offset_volume'] = self.offset_volume
        if self.carbon_energy is not None:
            result['carbon_energy'] = self.carbon_energy
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('acquisition_item_no') is not None:
            self.acquisition_item_no = m.get('acquisition_item_no')
        if m.get('project_no') is not None:
            self.project_no = m.get('project_no')
        if m.get('account_did') is not None:
            self.account_did = m.get('account_did')
        if m.get('occurrent_time') is not None:
            self.occurrent_time = m.get('occurrent_time')
        if m.get('scenario_code') is not None:
            self.scenario_code = m.get('scenario_code')
        if m.get('scenario_name') is not None:
            self.scenario_name = m.get('scenario_name')
        if m.get('platform_no') is not None:
            self.platform_no = m.get('platform_no')
        self.active_datum = []
        if m.get('active_datum') is not None:
            for k in m.get('active_datum'):
                temp_model = AnyAmountItem()
                self.active_datum.append(temp_model.from_map(k))
        if m.get('offset_volume') is not None:
            self.offset_volume = m.get('offset_volume')
        if m.get('carbon_energy') is not None:
            self.carbon_energy = m.get('carbon_energy')
        return self


class EmissionsCityStatistics(TeaModel):
    def __init__(
        self,
        city_no: str = None,
        city_name: str = None,
        emission_amount: str = None,
        emission_amount_today: str = None,
        reduction_amount: str = None,
        reduction_amount_today: str = None,
        counteraction_amount: str = None,
        counteraction_amount_today: str = None,
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


class AuthenticationInfoVO(TeaModel):
    def __init__(
        self,
        authentication_no: str = None,
        authorizer_did: str = None,
        authorizer_name: str = None,
        authorized_did: str = None,
        authorized_name: str = None,
        data_transfer_type: str = None,
        authentication_deetail: str = None,
        status: str = None,
    ):
        # 授权记录编码
        self.authentication_no = authentication_no
        # 收取方did
        self.authorizer_did = authorizer_did
        # 授权方名称
        self.authorizer_name = authorizer_name
        # 被授权方did
        self.authorized_did = authorized_did
        # 被授权方名称
        self.authorized_name = authorized_name
        # 数据协作类型
        self.data_transfer_type = data_transfer_type
        # 授权详情
        self.authentication_deetail = authentication_deetail
        # 授权状态
        self.status = status

    def validate(self):
        self.validate_required(self.authentication_no, 'authentication_no')
        self.validate_required(self.authorizer_did, 'authorizer_did')
        self.validate_required(self.authorizer_name, 'authorizer_name')
        self.validate_required(self.authorized_did, 'authorized_did')
        self.validate_required(self.authorized_name, 'authorized_name')
        self.validate_required(self.data_transfer_type, 'data_transfer_type')
        self.validate_required(self.authentication_deetail, 'authentication_deetail')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.authentication_no is not None:
            result['authentication_no'] = self.authentication_no
        if self.authorizer_did is not None:
            result['authorizer_did'] = self.authorizer_did
        if self.authorizer_name is not None:
            result['authorizer_name'] = self.authorizer_name
        if self.authorized_did is not None:
            result['authorized_did'] = self.authorized_did
        if self.authorized_name is not None:
            result['authorized_name'] = self.authorized_name
        if self.data_transfer_type is not None:
            result['data_transfer_type'] = self.data_transfer_type
        if self.authentication_deetail is not None:
            result['authentication_deetail'] = self.authentication_deetail
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('authentication_no') is not None:
            self.authentication_no = m.get('authentication_no')
        if m.get('authorizer_did') is not None:
            self.authorizer_did = m.get('authorizer_did')
        if m.get('authorizer_name') is not None:
            self.authorizer_name = m.get('authorizer_name')
        if m.get('authorized_did') is not None:
            self.authorized_did = m.get('authorized_did')
        if m.get('authorized_name') is not None:
            self.authorized_name = m.get('authorized_name')
        if m.get('data_transfer_type') is not None:
            self.data_transfer_type = m.get('data_transfer_type')
        if m.get('authentication_deetail') is not None:
            self.authentication_deetail = m.get('authentication_deetail')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class PlatformCustomerSummary(TeaModel):
    def __init__(
        self,
        customer_id: str = None,
        customer_name: str = None,
        contact_person: str = None,
        contact_telephone: str = None,
        contact_email: str = None,
        social_credit_code: str = None,
    ):
        # 三方平台的客户ID
        self.customer_id = customer_id
        # 三方平台客户名称
        self.customer_name = customer_name
        # 联系人
        self.contact_person = contact_person
        # 联系电话
        self.contact_telephone = contact_telephone
        # 联系邮箱
        self.contact_email = contact_email
        # 统一社会信用代码
        self.social_credit_code = social_credit_code

    def validate(self):
        self.validate_required(self.customer_id, 'customer_id')
        self.validate_required(self.customer_name, 'customer_name')
        self.validate_required(self.contact_person, 'contact_person')
        self.validate_required(self.contact_telephone, 'contact_telephone')
        self.validate_required(self.social_credit_code, 'social_credit_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.customer_name is not None:
            result['customer_name'] = self.customer_name
        if self.contact_person is not None:
            result['contact_person'] = self.contact_person
        if self.contact_telephone is not None:
            result['contact_telephone'] = self.contact_telephone
        if self.contact_email is not None:
            result['contact_email'] = self.contact_email
        if self.social_credit_code is not None:
            result['social_credit_code'] = self.social_credit_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('customer_name') is not None:
            self.customer_name = m.get('customer_name')
        if m.get('contact_person') is not None:
            self.contact_person = m.get('contact_person')
        if m.get('contact_telephone') is not None:
            self.contact_telephone = m.get('contact_telephone')
        if m.get('contact_email') is not None:
            self.contact_email = m.get('contact_email')
        if m.get('social_credit_code') is not None:
            self.social_credit_code = m.get('social_credit_code')
        return self


class EmissionsLocationStatistics(TeaModel):
    def __init__(
        self,
        location_no: str = None,
        location_name: str = None,
        emission_amount: str = None,
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


class DataTypeInfo(TeaModel):
    def __init__(
        self,
        data_type_no: str = None,
        data_type_name: str = None,
        data_type_config: str = None,
        data_json_schema: str = None,
    ):
        # 数据类型编码
        self.data_type_no = data_type_no
        # 数据类型名称
        self.data_type_name = data_type_name
        # 数据类型配置
        self.data_type_config = data_type_config
        # 数据JSON格式检查
        self.data_json_schema = data_json_schema

    def validate(self):
        self.validate_required(self.data_type_no, 'data_type_no')
        self.validate_required(self.data_type_name, 'data_type_name')
        self.validate_required(self.data_type_config, 'data_type_config')
        self.validate_required(self.data_json_schema, 'data_json_schema')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.data_type_no is not None:
            result['data_type_no'] = self.data_type_no
        if self.data_type_name is not None:
            result['data_type_name'] = self.data_type_name
        if self.data_type_config is not None:
            result['data_type_config'] = self.data_type_config
        if self.data_json_schema is not None:
            result['data_json_schema'] = self.data_json_schema
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('data_type_no') is not None:
            self.data_type_no = m.get('data_type_no')
        if m.get('data_type_name') is not None:
            self.data_type_name = m.get('data_type_name')
        if m.get('data_type_config') is not None:
            self.data_type_config = m.get('data_type_config')
        if m.get('data_json_schema') is not None:
            self.data_json_schema = m.get('data_json_schema')
        return self


class LcaCarbonDatum(TeaModel):
    def __init__(
        self,
        lca_carbon_amount: str = None,
        lca_report_file_url: str = None,
        lca_detail_file_url: str = None,
        life_cycle_boundary: str = None,
        lca_start_date: str = None,
        lca_end_date: str = None,
        lca_stage_carbon_datum: List[LcaStageCarbonItem] = None,
    ):
        # LCA碳排放总量
        self.lca_carbon_amount = lca_carbon_amount
        # 足迹报告pdf文件下载地址（30分钟内下载有效）
        self.lca_report_file_url = lca_report_file_url
        # 足迹分析结果详情文件地址（30分钟内下载有效）
        self.lca_detail_file_url = lca_detail_file_url
        # B2B-从摇篮到大门，B2C-从摇篮到坟墓
        self.life_cycle_boundary = life_cycle_boundary
        # 足迹开始时间，格式：yyyyMMdd
        self.lca_start_date = lca_start_date
        # 足迹结束时间 格式：yyyyMMdd
        self.lca_end_date = lca_end_date
        # 分阶段碳排放量列表
        self.lca_stage_carbon_datum = lca_stage_carbon_datum

    def validate(self):
        self.validate_required(self.lca_carbon_amount, 'lca_carbon_amount')
        self.validate_required(self.lca_report_file_url, 'lca_report_file_url')
        self.validate_required(self.lca_detail_file_url, 'lca_detail_file_url')
        self.validate_required(self.life_cycle_boundary, 'life_cycle_boundary')
        self.validate_required(self.lca_start_date, 'lca_start_date')
        self.validate_required(self.lca_end_date, 'lca_end_date')
        self.validate_required(self.lca_stage_carbon_datum, 'lca_stage_carbon_datum')
        if self.lca_stage_carbon_datum:
            for k in self.lca_stage_carbon_datum:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.lca_carbon_amount is not None:
            result['lca_carbon_amount'] = self.lca_carbon_amount
        if self.lca_report_file_url is not None:
            result['lca_report_file_url'] = self.lca_report_file_url
        if self.lca_detail_file_url is not None:
            result['lca_detail_file_url'] = self.lca_detail_file_url
        if self.life_cycle_boundary is not None:
            result['life_cycle_boundary'] = self.life_cycle_boundary
        if self.lca_start_date is not None:
            result['lca_start_date'] = self.lca_start_date
        if self.lca_end_date is not None:
            result['lca_end_date'] = self.lca_end_date
        result['lca_stage_carbon_datum'] = []
        if self.lca_stage_carbon_datum is not None:
            for k in self.lca_stage_carbon_datum:
                result['lca_stage_carbon_datum'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('lca_carbon_amount') is not None:
            self.lca_carbon_amount = m.get('lca_carbon_amount')
        if m.get('lca_report_file_url') is not None:
            self.lca_report_file_url = m.get('lca_report_file_url')
        if m.get('lca_detail_file_url') is not None:
            self.lca_detail_file_url = m.get('lca_detail_file_url')
        if m.get('life_cycle_boundary') is not None:
            self.life_cycle_boundary = m.get('life_cycle_boundary')
        if m.get('lca_start_date') is not None:
            self.lca_start_date = m.get('lca_start_date')
        if m.get('lca_end_date') is not None:
            self.lca_end_date = m.get('lca_end_date')
        self.lca_stage_carbon_datum = []
        if m.get('lca_stage_carbon_datum') is not None:
            for k in m.get('lca_stage_carbon_datum'):
                temp_model = LcaStageCarbonItem()
                self.lca_stage_carbon_datum.append(temp_model.from_map(k))
        return self


class TransferPathAnalysis(TeaModel):
    def __init__(
        self,
        field: str = None,
        index_number: str = None,
        index_content: str = None,
        detail: str = None,
        target: str = None,
    ):
        # 所属领域
        self.field = field
        # 目录编号
        self.index_number = index_number
        # 目录内容
        self.index_content = index_content
        # 技术标准说明
        self.detail = detail
        # 企业是否采取该路径
        self.target = target

    def validate(self):
        self.validate_required(self.field, 'field')
        self.validate_required(self.index_number, 'index_number')
        self.validate_required(self.index_content, 'index_content')
        self.validate_required(self.detail, 'detail')
        self.validate_required(self.target, 'target')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.field is not None:
            result['field'] = self.field
        if self.index_number is not None:
            result['index_number'] = self.index_number
        if self.index_content is not None:
            result['index_content'] = self.index_content
        if self.detail is not None:
            result['detail'] = self.detail
        if self.target is not None:
            result['target'] = self.target
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('field') is not None:
            self.field = m.get('field')
        if m.get('index_number') is not None:
            self.index_number = m.get('index_number')
        if m.get('index_content') is not None:
            self.index_content = m.get('index_content')
        if m.get('detail') is not None:
            self.detail = m.get('detail')
        if m.get('target') is not None:
            self.target = m.get('target')
        return self


class AuthorizePolicy(TeaModel):
    def __init__(
        self,
        policy_id: str = None,
        description: str = None,
        authorize_config: str = None,
    ):
        # 授权策略ID
        self.policy_id = policy_id
        # 授权策略描述
        self.description = description
        # 授权策略配置
        self.authorize_config = authorize_config

    def validate(self):
        self.validate_required(self.policy_id, 'policy_id')
        self.validate_required(self.description, 'description')
        self.validate_required(self.authorize_config, 'authorize_config')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.policy_id is not None:
            result['policy_id'] = self.policy_id
        if self.description is not None:
            result['description'] = self.description
        if self.authorize_config is not None:
            result['authorize_config'] = self.authorize_config
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('policy_id') is not None:
            self.policy_id = m.get('policy_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('authorize_config') is not None:
            self.authorize_config = m.get('authorize_config')
        return self


class EnterpriseProductOutline(TeaModel):
    def __init__(
        self,
        enterprise_custom_code: str = None,
        product_name: str = None,
        specification: str = None,
        product_description: str = None,
        product_category_name: str = None,
        brand_information: str = None,
    ):
        # 产品自定义编码
        # 
        self.enterprise_custom_code = enterprise_custom_code
        # 产品名称
        # 
        self.product_name = product_name
        # 规格型号
        self.specification = specification
        # 产品描述
        self.product_description = product_description
        # 产品分类名称
        self.product_category_name = product_category_name
        # 品牌信息
        self.brand_information = brand_information

    def validate(self):
        self.validate_required(self.enterprise_custom_code, 'enterprise_custom_code')
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.specification, 'specification')
        self.validate_required(self.product_category_name, 'product_category_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.enterprise_custom_code is not None:
            result['enterprise_custom_code'] = self.enterprise_custom_code
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.specification is not None:
            result['specification'] = self.specification
        if self.product_description is not None:
            result['product_description'] = self.product_description
        if self.product_category_name is not None:
            result['product_category_name'] = self.product_category_name
        if self.brand_information is not None:
            result['brand_information'] = self.brand_information
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('enterprise_custom_code') is not None:
            self.enterprise_custom_code = m.get('enterprise_custom_code')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('specification') is not None:
            self.specification = m.get('specification')
        if m.get('product_description') is not None:
            self.product_description = m.get('product_description')
        if m.get('product_category_name') is not None:
            self.product_category_name = m.get('product_category_name')
        if m.get('brand_information') is not None:
            self.brand_information = m.get('brand_information')
        return self


class CarbonOffsetActiveDataDetail(TeaModel):
    def __init__(
        self,
        active_data_no: str = None,
        active_data_name: str = None,
        active_data_unit: str = None,
        description: str = None,
        active_data_value: str = None,
    ):
        # 活动数据编号
        self.active_data_no = active_data_no
        # 活动数据名称
        self.active_data_name = active_data_name
        # 活动数据单位
        self.active_data_unit = active_data_unit
        # 活动数据描述文案
        self.description = description
        # 活动数据值
        self.active_data_value = active_data_value

    def validate(self):
        self.validate_required(self.active_data_no, 'active_data_no')
        self.validate_required(self.active_data_value, 'active_data_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.active_data_no is not None:
            result['active_data_no'] = self.active_data_no
        if self.active_data_name is not None:
            result['active_data_name'] = self.active_data_name
        if self.active_data_unit is not None:
            result['active_data_unit'] = self.active_data_unit
        if self.description is not None:
            result['description'] = self.description
        if self.active_data_value is not None:
            result['active_data_value'] = self.active_data_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('active_data_no') is not None:
            self.active_data_no = m.get('active_data_no')
        if m.get('active_data_name') is not None:
            self.active_data_name = m.get('active_data_name')
        if m.get('active_data_unit') is not None:
            self.active_data_unit = m.get('active_data_unit')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('active_data_value') is not None:
            self.active_data_value = m.get('active_data_value')
        return self


class EnterpriseMemberSummary(TeaModel):
    def __init__(
        self,
        account_did: str = None,
        name: str = None,
        mobile: str = None,
        register_time: str = None,
    ):
        # 机构会员DID
        self.account_did = account_did
        # 会员姓名，数据脱敏处理返回
        self.name = name
        # 会员手机号码，数据脱敏处理返回
        self.mobile = mobile
        # 会员注册时间
        self.register_time = register_time

    def validate(self):
        self.validate_required(self.account_did, 'account_did')
        self.validate_required(self.register_time, 'register_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.account_did is not None:
            result['account_did'] = self.account_did
        if self.name is not None:
            result['name'] = self.name
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.register_time is not None:
            result['register_time'] = self.register_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('account_did') is not None:
            self.account_did = m.get('account_did')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('register_time') is not None:
            self.register_time = m.get('register_time')
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


class EnterpriseProductSummary(TeaModel):
    def __init__(
        self,
        enterprise_custom_code: str = None,
        product_name: str = None,
        specification: str = None,
        product_description: str = None,
        product_category_name: str = None,
        brand_information: str = None,
        process_flow_file_list: List[EnterpriseDocumentFile] = None,
        product_picture_file_list: List[EnterpriseDocumentFile] = None,
    ):
        # 产品自定义编码
        self.enterprise_custom_code = enterprise_custom_code
        # 产品名称
        self.product_name = product_name
        # 规格型号
        self.specification = specification
        # 产品描述
        self.product_description = product_description
        # 产品分类名称
        self.product_category_name = product_category_name
        # 品牌信息
        self.brand_information = brand_information
        # 工艺流程文件路径，上传文件后由上传文件接口提供，最多支持上传3个工艺流程文件
        self.process_flow_file_list = process_flow_file_list
        # 产品图片文件路径，上传文件后由上传文件接口提供，最多支持上传8个产品图片文件
        self.product_picture_file_list = product_picture_file_list

    def validate(self):
        self.validate_required(self.enterprise_custom_code, 'enterprise_custom_code')
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.specification, 'specification')
        self.validate_required(self.product_category_name, 'product_category_name')
        if self.process_flow_file_list:
            for k in self.process_flow_file_list:
                if k:
                    k.validate()
        if self.product_picture_file_list:
            for k in self.product_picture_file_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.enterprise_custom_code is not None:
            result['enterprise_custom_code'] = self.enterprise_custom_code
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.specification is not None:
            result['specification'] = self.specification
        if self.product_description is not None:
            result['product_description'] = self.product_description
        if self.product_category_name is not None:
            result['product_category_name'] = self.product_category_name
        if self.brand_information is not None:
            result['brand_information'] = self.brand_information
        result['process_flow_file_list'] = []
        if self.process_flow_file_list is not None:
            for k in self.process_flow_file_list:
                result['process_flow_file_list'].append(k.to_map() if k else None)
        result['product_picture_file_list'] = []
        if self.product_picture_file_list is not None:
            for k in self.product_picture_file_list:
                result['product_picture_file_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('enterprise_custom_code') is not None:
            self.enterprise_custom_code = m.get('enterprise_custom_code')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('specification') is not None:
            self.specification = m.get('specification')
        if m.get('product_description') is not None:
            self.product_description = m.get('product_description')
        if m.get('product_category_name') is not None:
            self.product_category_name = m.get('product_category_name')
        if m.get('brand_information') is not None:
            self.brand_information = m.get('brand_information')
        self.process_flow_file_list = []
        if m.get('process_flow_file_list') is not None:
            for k in m.get('process_flow_file_list'):
                temp_model = EnterpriseDocumentFile()
                self.process_flow_file_list.append(temp_model.from_map(k))
        self.product_picture_file_list = []
        if m.get('product_picture_file_list') is not None:
            for k in m.get('product_picture_file_list'):
                temp_model = EnterpriseDocumentFile()
                self.product_picture_file_list.append(temp_model.from_map(k))
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


class LcaProjectTrace(TeaModel):
    def __init__(
        self,
        project_no: str = None,
        life_cycle_boundary: str = None,
        product_no: str = None,
        lca_carbon_amount: str = None,
        product_name: str = None,
        specification: str = None,
        lca_start_date: str = None,
        lca_end_date: str = None,
        trace_status: str = None,
    ):
        # 碳足迹编码
        self.project_no = project_no
        # 碳足迹生命周期边界
        self.life_cycle_boundary = life_cycle_boundary
        # 产品编码
        self.product_no = product_no
        # 碳足迹项目排放量
        self.lca_carbon_amount = lca_carbon_amount
        # 产品名称
        self.product_name = product_name
        # 产品规格型号
        self.specification = specification
        # 碳足迹开始时间
        self.lca_start_date = lca_start_date
        # 碳足迹结束时间
        self.lca_end_date = lca_end_date
        # 溯源状态
        self.trace_status = trace_status

    def validate(self):
        self.validate_required(self.project_no, 'project_no')
        self.validate_required(self.life_cycle_boundary, 'life_cycle_boundary')
        self.validate_required(self.product_no, 'product_no')
        self.validate_required(self.lca_carbon_amount, 'lca_carbon_amount')
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.specification, 'specification')
        self.validate_required(self.lca_start_date, 'lca_start_date')
        self.validate_required(self.lca_end_date, 'lca_end_date')
        self.validate_required(self.trace_status, 'trace_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_no is not None:
            result['project_no'] = self.project_no
        if self.life_cycle_boundary is not None:
            result['life_cycle_boundary'] = self.life_cycle_boundary
        if self.product_no is not None:
            result['product_no'] = self.product_no
        if self.lca_carbon_amount is not None:
            result['lca_carbon_amount'] = self.lca_carbon_amount
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.specification is not None:
            result['specification'] = self.specification
        if self.lca_start_date is not None:
            result['lca_start_date'] = self.lca_start_date
        if self.lca_end_date is not None:
            result['lca_end_date'] = self.lca_end_date
        if self.trace_status is not None:
            result['trace_status'] = self.trace_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_no') is not None:
            self.project_no = m.get('project_no')
        if m.get('life_cycle_boundary') is not None:
            self.life_cycle_boundary = m.get('life_cycle_boundary')
        if m.get('product_no') is not None:
            self.product_no = m.get('product_no')
        if m.get('lca_carbon_amount') is not None:
            self.lca_carbon_amount = m.get('lca_carbon_amount')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('specification') is not None:
            self.specification = m.get('specification')
        if m.get('lca_start_date') is not None:
            self.lca_start_date = m.get('lca_start_date')
        if m.get('lca_end_date') is not None:
            self.lca_end_date = m.get('lca_end_date')
        if m.get('trace_status') is not None:
            self.trace_status = m.get('trace_status')
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


class LcaStageActiveData(TeaModel):
    def __init__(
        self,
        lca_stage: str = None,
        input_stream_list: List[InputStreamActiveData] = None,
        output_stream_list: List[OutputStreamActiveData] = None,
    ):
        # LCA阶段
        self.lca_stage = lca_stage
        # 输入流活动数据列表
        self.input_stream_list = input_stream_list
        # 输出流活动数据列表
        self.output_stream_list = output_stream_list

    def validate(self):
        self.validate_required(self.lca_stage, 'lca_stage')
        self.validate_required(self.input_stream_list, 'input_stream_list')
        if self.input_stream_list:
            for k in self.input_stream_list:
                if k:
                    k.validate()
        self.validate_required(self.output_stream_list, 'output_stream_list')
        if self.output_stream_list:
            for k in self.output_stream_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.lca_stage is not None:
            result['lca_stage'] = self.lca_stage
        result['input_stream_list'] = []
        if self.input_stream_list is not None:
            for k in self.input_stream_list:
                result['input_stream_list'].append(k.to_map() if k else None)
        result['output_stream_list'] = []
        if self.output_stream_list is not None:
            for k in self.output_stream_list:
                result['output_stream_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('lca_stage') is not None:
            self.lca_stage = m.get('lca_stage')
        self.input_stream_list = []
        if m.get('input_stream_list') is not None:
            for k in m.get('input_stream_list'):
                temp_model = InputStreamActiveData()
                self.input_stream_list.append(temp_model.from_map(k))
        self.output_stream_list = []
        if m.get('output_stream_list') is not None:
            for k in m.get('output_stream_list'):
                temp_model = OutputStreamActiveData()
                self.output_stream_list.append(temp_model.from_map(k))
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
        total_emission: str = None,
        total_emission_today: str = None,
        total_reduction: str = None,
        total_reduction_today: str = None,
        total_counteraction: str = None,
        total_counteraction_today: str = None,
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


class AddPdcpAuthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        authentication_no: str = None,
        authorizer_did: str = None,
        authorized_did: str = None,
        data_transfer_type: str = None,
        authentication_detail: str = None,
        status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权记录的唯一标记
        self.authentication_no = authentication_no
        # 授权方did
        self.authorizer_did = authorizer_did
        # 被授权方did
        self.authorized_did = authorized_did
        # 数据协作类型
        self.data_transfer_type = data_transfer_type
        # 授权详情
        self.authentication_detail = authentication_detail
        # 授权状态
        self.status = status

    def validate(self):
        self.validate_required(self.authentication_no, 'authentication_no')
        self.validate_required(self.authorizer_did, 'authorizer_did')
        self.validate_required(self.authorized_did, 'authorized_did')
        self.validate_required(self.data_transfer_type, 'data_transfer_type')
        self.validate_required(self.authentication_detail, 'authentication_detail')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.authentication_no is not None:
            result['authentication_no'] = self.authentication_no
        if self.authorizer_did is not None:
            result['authorizer_did'] = self.authorizer_did
        if self.authorized_did is not None:
            result['authorized_did'] = self.authorized_did
        if self.data_transfer_type is not None:
            result['data_transfer_type'] = self.data_transfer_type
        if self.authentication_detail is not None:
            result['authentication_detail'] = self.authentication_detail
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('authentication_no') is not None:
            self.authentication_no = m.get('authentication_no')
        if m.get('authorizer_did') is not None:
            self.authorizer_did = m.get('authorizer_did')
        if m.get('authorized_did') is not None:
            self.authorized_did = m.get('authorized_did')
        if m.get('data_transfer_type') is not None:
            self.data_transfer_type = m.get('data_transfer_type')
        if m.get('authentication_detail') is not None:
            self.authentication_detail = m.get('authentication_detail')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class AddPdcpAuthResponse(TeaModel):
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


class UpdatePdcpAuthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        authentication_no: str = None,
        status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权记录编码
        self.authentication_no = authentication_no
        # 授权状态
        self.status = status

    def validate(self):
        self.validate_required(self.authentication_no, 'authentication_no')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.authentication_no is not None:
            result['authentication_no'] = self.authentication_no
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('authentication_no') is not None:
            self.authentication_no = m.get('authentication_no')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class UpdatePdcpAuthResponse(TeaModel):
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


class QueryGatewayAccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_name: str = None,
        page_number: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 企业名称
        self.user_name = user_name
        # 当前页码，默认1
        self.page_number = page_number
        # 页面大小，默认20
        self.page_size = page_size

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
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryGatewayAccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        account_info_list: List[CarbonAccountInfo] = None,
        total: int = None,
        page_number: int = None,
        page_size: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 账户信息列表
        self.account_info_list = account_info_list
        # 总量
        self.total = total
        # 当前页面
        self.page_number = page_number
        # 页面大小
        self.page_size = page_size

    def validate(self):
        if self.account_info_list:
            for k in self.account_info_list:
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
        result['account_info_list'] = []
        if self.account_info_list is not None:
            for k in self.account_info_list:
                result['account_info_list'].append(k.to_map() if k else None)
        if self.total is not None:
            result['total'] = self.total
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.account_info_list = []
        if m.get('account_info_list') is not None:
            for k in m.get('account_info_list'):
                temp_model = CarbonAccountInfo()
                self.account_info_list.append(temp_model.from_map(k))
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryPdcpAuthRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        authentication_no: str = None,
        authorizer_did: str = None,
        authorizer_name: str = None,
        authorized_did: str = None,
        authorized_name: str = None,
        data_transfer_type: str = None,
        status: str = None,
        page_number: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权记录编码
        self.authentication_no = authentication_no
        # 授权方did
        self.authorizer_did = authorizer_did
        # 模糊匹配
        self.authorizer_name = authorizer_name
        # 被授权方did
        self.authorized_did = authorized_did
        # 模糊匹配
        self.authorized_name = authorized_name
        # 数据协作类型
        self.data_transfer_type = data_transfer_type
        # 授权状态
        self.status = status
        # 当前页面
        self.page_number = page_number
        # 页面大小
        self.page_size = page_size

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
        if self.authentication_no is not None:
            result['authentication_no'] = self.authentication_no
        if self.authorizer_did is not None:
            result['authorizer_did'] = self.authorizer_did
        if self.authorizer_name is not None:
            result['authorizer_name'] = self.authorizer_name
        if self.authorized_did is not None:
            result['authorized_did'] = self.authorized_did
        if self.authorized_name is not None:
            result['authorized_name'] = self.authorized_name
        if self.data_transfer_type is not None:
            result['data_transfer_type'] = self.data_transfer_type
        if self.status is not None:
            result['status'] = self.status
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('authentication_no') is not None:
            self.authentication_no = m.get('authentication_no')
        if m.get('authorizer_did') is not None:
            self.authorizer_did = m.get('authorizer_did')
        if m.get('authorizer_name') is not None:
            self.authorizer_name = m.get('authorizer_name')
        if m.get('authorized_did') is not None:
            self.authorized_did = m.get('authorized_did')
        if m.get('authorized_name') is not None:
            self.authorized_name = m.get('authorized_name')
        if m.get('data_transfer_type') is not None:
            self.data_transfer_type = m.get('data_transfer_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryPdcpAuthResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        page_number: int = None,
        page_size: int = None,
        authentication_info_list: List[AuthenticationInfoVO] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总量
        self.total = total
        # 当前页面
        self.page_number = page_number
        # 页面大小
        self.page_size = page_size
        # 授权信息
        self.authentication_info_list = authentication_info_list

    def validate(self):
        if self.authentication_info_list:
            for k in self.authentication_info_list:
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
        if self.total is not None:
            result['total'] = self.total
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['authentication_info_list'] = []
        if self.authentication_info_list is not None:
            for k in self.authentication_info_list:
                result['authentication_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.authentication_info_list = []
        if m.get('authentication_info_list') is not None:
            for k in m.get('authentication_info_list'):
                temp_model = AuthenticationInfoVO()
                self.authentication_info_list.append(temp_model.from_map(k))
        return self


class QueryPdcpDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        authentication_no: str = None,
        data_type: str = None,
        page_number: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权记录编码
        self.authentication_no = authentication_no
        # 数据类型
        self.data_type = data_type
        # 当前页面
        self.page_number = page_number
        # 页面大小
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.data_type, 'data_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.authentication_no is not None:
            result['authentication_no'] = self.authentication_no
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('authentication_no') is not None:
            self.authentication_no = m.get('authentication_no')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryPdcpDataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        page_number: int = None,
        page_size: int = None,
        data_list: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总数
        self.total = total
        # 当前页面
        self.page_number = page_number
        # 页面大小
        self.page_size = page_size
        # 数据列表
        self.data_list = data_list

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
        if self.total is not None:
            result['total'] = self.total
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.data_list is not None:
            result['data_list'] = self.data_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('data_list') is not None:
            self.data_list = m.get('data_list')
        return self


class DetailPdcpDepositRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_type: str = None,
        data_id: str = None,
        tx_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据类型名称，用户标识记录的数据类型。
        self.data_type = data_type
        # 存证数据ID，存证数据唯一标识ID。
        self.data_id = data_id
        # 数据存证区块链交易ID，对应数据版本号。 若未指定，返回最近的版本。
        self.tx_id = tx_id

    def validate(self):
        self.validate_required(self.data_type, 'data_type')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.tx_id is not None:
            result['tx_id'] = self.tx_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('tx_id') is not None:
            self.tx_id = m.get('tx_id')
        return self


class DetailPdcpDepositResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data_type: str = None,
        data_id: str = None,
        deposit_data: DataDepositInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证数据类型
        self.data_type = data_type
        # 存证数据唯一ID
        self.data_id = data_id
        # 存证数据内容
        self.deposit_data = deposit_data

    def validate(self):
        if self.deposit_data:
            self.deposit_data.validate()

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
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.deposit_data is not None:
            result['deposit_data'] = self.deposit_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('deposit_data') is not None:
            temp_model = DataDepositInfo()
            self.deposit_data = temp_model.from_map(m['deposit_data'])
        return self


class QueryPdcpDtraceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_type: str = None,
        data_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 存证数据类型名称
        self.data_type = data_type
        # 存证数据ID
        self.data_id = data_id

    def validate(self):
        self.validate_required(self.data_type, 'data_type')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.data_id is not None:
            result['data_id'] = self.data_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        return self


class QueryPdcpDtraceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data_type: str = None,
        data_id: str = None,
        versions: List[DataDepositInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证数据类型名称
        self.data_type = data_type
        # 存证数据ID
        self.data_id = data_id
        # 存证数据版本列表
        self.versions = versions

    def validate(self):
        if self.versions:
            for k in self.versions:
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
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.data_id is not None:
            result['data_id'] = self.data_id
        result['versions'] = []
        if self.versions is not None:
            for k in self.versions:
                result['versions'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        self.versions = []
        if m.get('versions') is not None:
            for k in m.get('versions'):
                temp_model = DataDepositInfo()
                self.versions.append(temp_model.from_map(k))
        return self


class CheckPdcpDtraceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_type: str = None,
        data_id: str = None,
        tx_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 存证数据类型名称
        self.data_type = data_type
        # 存证数据ID
        self.data_id = data_id
        # 存证操作区块链交易ID，即存证数据版本号。若未指定，检查当前最新版本。
        self.tx_id = tx_id

    def validate(self):
        self.validate_required(self.data_type, 'data_type')
        self.validate_required(self.data_id, 'data_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.data_id is not None:
            result['data_id'] = self.data_id
        if self.tx_id is not None:
            result['tx_id'] = self.tx_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('data_id') is not None:
            self.data_id = m.get('data_id')
        if m.get('tx_id') is not None:
            self.tx_id = m.get('tx_id')
        return self


class CheckPdcpDtraceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        deposit_data: DataDepositInfo = None,
        block_number: int = None,
        deposit_type: str = None,
        on_chain_data: str = None,
        off_chain_data: str = None,
        consistent: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 存证操作内容
        self.deposit_data = deposit_data
        # 区块链编号
        self.block_number = block_number
        # 数据存证方式
        self.deposit_type = deposit_type
        # 链上数据
        self.on_chain_data = on_chain_data
        # 链下数据
        self.off_chain_data = off_chain_data
        # 链上-链下数据是否一致
        self.consistent = consistent

    def validate(self):
        if self.deposit_data:
            self.deposit_data.validate()

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
        if self.deposit_data is not None:
            result['deposit_data'] = self.deposit_data.to_map()
        if self.block_number is not None:
            result['block_number'] = self.block_number
        if self.deposit_type is not None:
            result['deposit_type'] = self.deposit_type
        if self.on_chain_data is not None:
            result['on_chain_data'] = self.on_chain_data
        if self.off_chain_data is not None:
            result['off_chain_data'] = self.off_chain_data
        if self.consistent is not None:
            result['consistent'] = self.consistent
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('deposit_data') is not None:
            temp_model = DataDepositInfo()
            self.deposit_data = temp_model.from_map(m['deposit_data'])
        if m.get('block_number') is not None:
            self.block_number = m.get('block_number')
        if m.get('deposit_type') is not None:
            self.deposit_type = m.get('deposit_type')
        if m.get('on_chain_data') is not None:
            self.on_chain_data = m.get('on_chain_data')
        if m.get('off_chain_data') is not None:
            self.off_chain_data = m.get('off_chain_data')
        if m.get('consistent') is not None:
            self.consistent = m.get('consistent')
        return self


class BatchqueryPdcpDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_type: str = None,
        authorizer_did: str = None,
        authorized_did: str = None,
        page_number: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务数据类型，查询该数据类型的授权数据
        self.data_type = data_type
        # 授权方身份ID，若指定查询该用户授权的数据
        self.authorizer_did = authorizer_did
        # 被授权方身份ID，若指定查询授权给该用户的数据
        self.authorized_did = authorized_did
        # 当前页面，默认1
        self.page_number = page_number
        # 分页大小，默认20
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.data_type, 'data_type')
        self.validate_required(self.page_number, 'page_number')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.authorizer_did is not None:
            result['authorizer_did'] = self.authorizer_did
        if self.authorized_did is not None:
            result['authorized_did'] = self.authorized_did
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('authorizer_did') is not None:
            self.authorizer_did = m.get('authorizer_did')
        if m.get('authorized_did') is not None:
            self.authorized_did = m.get('authorized_did')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class BatchqueryPdcpDataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        page_number: int = None,
        page_size: int = None,
        data_list: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总记录条数
        self.total = total
        # 当前页面
        self.page_number = page_number
        # 分页大小
        self.page_size = page_size
        # 数据列表
        self.data_list = data_list

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
        if self.total is not None:
            result['total'] = self.total
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.data_list is not None:
            result['data_list'] = self.data_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('data_list') is not None:
            self.data_list = m.get('data_list')
        return self


class QueryPdcpOwndataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_type: str = None,
        user_did: str = None,
        page_number: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务数据类型
        self.data_type = data_type
        # 拥有数据的用户
        self.user_did = user_did
        # 当前分页，默认1
        self.page_number = page_number
        # 分页大小，默认20
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.data_type, 'data_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.user_did is not None:
            result['user_did'] = self.user_did
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryPdcpOwndataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        page_number: int = None,
        page_size: int = None,
        data_list: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总记录条数
        self.total = total
        # 当前分页
        self.page_number = page_number
        # 分页大小
        self.page_size = page_size
        # 数据记录列表
        self.data_list = data_list

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
        if self.total is not None:
            result['total'] = self.total
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.data_list is not None:
            result['data_list'] = self.data_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('data_list') is not None:
            self.data_list = m.get('data_list')
        return self


class QueryPdcpDataassetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_number: int = None,
        page_size: int = None,
        data_type_no: str = None,
        user_did: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前页码，默认1
        self.page_number = page_number
        # 页面大小，默认20
        self.page_size = page_size
        # 数据类型
        self.data_type_no = data_type_no
        # 数据资产所有者
        self.user_did = user_did

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
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.data_type_no is not None:
            result['data_type_no'] = self.data_type_no
        if self.user_did is not None:
            result['user_did'] = self.user_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('data_type_no') is not None:
            self.data_type_no = m.get('data_type_no')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        return self


class QueryPdcpDataassetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        page_number: int = None,
        page_size: int = None,
        data_asset_list: List[DataAssetInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总量
        self.total = total
        # 当前页面
        self.page_number = page_number
        # 页面大小
        self.page_size = page_size
        # 数据资产信息
        self.data_asset_list = data_asset_list

    def validate(self):
        if self.data_asset_list:
            for k in self.data_asset_list:
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
        if self.total is not None:
            result['total'] = self.total
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['data_asset_list'] = []
        if self.data_asset_list is not None:
            for k in self.data_asset_list:
                result['data_asset_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.data_asset_list = []
        if m.get('data_asset_list') is not None:
            for k in m.get('data_asset_list'):
                temp_model = DataAssetInfo()
                self.data_asset_list.append(temp_model.from_map(k))
        return self


class RegisterPdcpDataassetRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_type_no: str = None,
        user_did: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据类型编码
        self.data_type_no = data_type_no
        # 数据资产所有者id
        self.user_did = user_did

    def validate(self):
        self.validate_required(self.data_type_no, 'data_type_no')
        self.validate_required(self.user_did, 'user_did')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_type_no is not None:
            result['data_type_no'] = self.data_type_no
        if self.user_did is not None:
            result['user_did'] = self.user_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_type_no') is not None:
            self.data_type_no = m.get('data_type_no')
        if m.get('user_did') is not None:
            self.user_did = m.get('user_did')
        return self


class RegisterPdcpDataassetResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        dataset_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 资产id
        self.dataset_id = dataset_id

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
        if self.dataset_id is not None:
            result['dataset_id'] = self.dataset_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('dataset_id') is not None:
            self.dataset_id = m.get('dataset_id')
        return self


class AddAuthAdminRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        policy_id: str = None,
        description: str = None,
        authorize_config: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 授权策略ID
        self.policy_id = policy_id
        # 授权策略描述
        self.description = description
        # 授权策略配置
        self.authorize_config = authorize_config

    def validate(self):
        self.validate_required(self.policy_id, 'policy_id')
        self.validate_required(self.description, 'description')
        self.validate_required(self.authorize_config, 'authorize_config')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.policy_id is not None:
            result['policy_id'] = self.policy_id
        if self.description is not None:
            result['description'] = self.description
        if self.authorize_config is not None:
            result['authorize_config'] = self.authorize_config
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('policy_id') is not None:
            self.policy_id = m.get('policy_id')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('authorize_config') is not None:
            self.authorize_config = m.get('authorize_config')
        return self


class AddAuthAdminResponse(TeaModel):
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


class PagequeryAuthAdminRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_number: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前查询页数
        self.page_number = page_number
        # 每页记录条数，默认为20
        self.page_size = page_size

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
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryAuthAdminResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        authorize_policy_list: List[AuthorizePolicy] = None,
        total: int = None,
        page_number: int = None,
        page_size: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权策略配置
        self.authorize_policy_list = authorize_policy_list
        # 总数量
        self.total = total
        # 当前页
        self.page_number = page_number
        # 每页条数
        self.page_size = page_size

    def validate(self):
        if self.authorize_policy_list:
            for k in self.authorize_policy_list:
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
        result['authorize_policy_list'] = []
        if self.authorize_policy_list is not None:
            for k in self.authorize_policy_list:
                result['authorize_policy_list'].append(k.to_map() if k else None)
        if self.total is not None:
            result['total'] = self.total
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.authorize_policy_list = []
        if m.get('authorize_policy_list') is not None:
            for k in m.get('authorize_policy_list'):
                temp_model = AuthorizePolicy()
                self.authorize_policy_list.append(temp_model.from_map(k))
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryAuthAdminRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        policy_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据授权策略ID
        self.policy_id = policy_id

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
        if self.policy_id is not None:
            result['policy_id'] = self.policy_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('policy_id') is not None:
            self.policy_id = m.get('policy_id')
        return self


class QueryAuthAdminResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data: AuthorizePolicy = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 授权策略
        self.data = data

    def validate(self):
        if self.data:
            self.data.validate()

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
        if self.data is not None:
            result['data'] = self.data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('data') is not None:
            temp_model = AuthorizePolicy()
            self.data = temp_model.from_map(m['data'])
        return self


class AddDataassetTypeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        data_type_no: str = None,
        data_type_name: str = None,
        data_type_config: str = None,
        data_json_schema: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据类型编码
        self.data_type_no = data_type_no
        # 数据类型名称
        self.data_type_name = data_type_name
        # 数据类型配置
        self.data_type_config = data_type_config
        # 数据JSON格式检查
        self.data_json_schema = data_json_schema

    def validate(self):
        self.validate_required(self.data_type_no, 'data_type_no')
        self.validate_required(self.data_type_name, 'data_type_name')
        self.validate_required(self.data_type_config, 'data_type_config')
        self.validate_required(self.data_json_schema, 'data_json_schema')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.data_type_no is not None:
            result['data_type_no'] = self.data_type_no
        if self.data_type_name is not None:
            result['data_type_name'] = self.data_type_name
        if self.data_type_config is not None:
            result['data_type_config'] = self.data_type_config
        if self.data_json_schema is not None:
            result['data_json_schema'] = self.data_json_schema
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('data_type_no') is not None:
            self.data_type_no = m.get('data_type_no')
        if m.get('data_type_name') is not None:
            self.data_type_name = m.get('data_type_name')
        if m.get('data_type_config') is not None:
            self.data_type_config = m.get('data_type_config')
        if m.get('data_json_schema') is not None:
            self.data_json_schema = m.get('data_json_schema')
        return self


class AddDataassetTypeResponse(TeaModel):
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


class PagequeryDataassetTypeRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        page_number: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 当前查询页数
        self.page_number = page_number
        # 每页记录条数，默认为20
        self.page_size = page_size

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
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryDataassetTypeResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data_type_info: List[DataTypeInfo] = None,
        total: int = None,
        page_number: int = None,
        page_size: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # DataTypeInfo
        self.data_type_info = data_type_info
        # 总数量
        self.total = total
        # 1
        self.page_number = page_number
        # pageSize
        self.page_size = page_size

    def validate(self):
        if self.data_type_info:
            for k in self.data_type_info:
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
        result['data_type_info'] = []
        if self.data_type_info is not None:
            for k in self.data_type_info:
                result['data_type_info'].append(k.to_map() if k else None)
        if self.total is not None:
            result['total'] = self.total
        if self.page_number is not None:
            result['page_number'] = self.page_number
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data_type_info = []
        if m.get('data_type_info') is not None:
            for k in m.get('data_type_info'):
                temp_model = DataTypeInfo()
                self.data_type_info.append(temp_model.from_map(k))
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('page_number') is not None:
            self.page_number = m.get('page_number')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class StartDatasetCollectingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dataset_id: str = None,
        user_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部数据ID
        self.dataset_id = dataset_id
        # 采集数据所属用户ID
        self.user_id = user_id

    def validate(self):
        self.validate_required(self.dataset_id, 'dataset_id')
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
        if self.dataset_id is not None:
            result['dataset_id'] = self.dataset_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dataset_id') is not None:
            self.dataset_id = m.get('dataset_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class StartDatasetCollectingResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 数据采集任务ID，扩展用
        self.task_id = task_id

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
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryDatasetCollectingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        dataset_id: str = None,
        user_id: str = None,
        task_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 外部数据ID
        self.dataset_id = dataset_id
        # 操作用户ID
        self.user_id = user_id
        # 数据采集任务ID，若无查询最新的采集任务
        self.task_id = task_id

    def validate(self):
        self.validate_required(self.dataset_id, 'dataset_id')
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
        if self.dataset_id is not None:
            result['dataset_id'] = self.dataset_id
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.task_id is not None:
            result['task_id'] = self.task_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('dataset_id') is not None:
            self.dataset_id = m.get('dataset_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('task_id') is not None:
            self.task_id = m.get('task_id')
        return self


class QueryDatasetCollectingResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
        data_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 采集状态
        self.status = status
        # 采集数据记录数
        self.data_count = data_count

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
        if self.status is not None:
            result['status'] = self.status
        if self.data_count is not None:
            result['data_count'] = self.data_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('data_count') is not None:
            self.data_count = m.get('data_count')
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


class RegisterEcarEnterprisememberRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        account_did: str = None,
        name: str = None,
        identity_card_code: str = None,
        mobile: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 注册会员在蚂蚁DIS服务的DID账号
        self.account_did = account_did
        # 注册会员姓名
        self.name = name
        # 注册会员身份证号码
        self.identity_card_code = identity_card_code
        # 手机号码
        self.mobile = mobile

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
        if self.account_did is not None:
            result['account_did'] = self.account_did
        if self.name is not None:
            result['name'] = self.name
        if self.identity_card_code is not None:
            result['identity_card_code'] = self.identity_card_code
        if self.mobile is not None:
            result['mobile'] = self.mobile
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('account_did') is not None:
            self.account_did = m.get('account_did')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('identity_card_code') is not None:
            self.identity_card_code = m.get('identity_card_code')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        return self


class RegisterEcarEnterprisememberResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        account_did: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 蚂蚁DIS服务的DID账号
        self.account_did = account_did

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
        if self.account_did is not None:
            result['account_did'] = self.account_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('account_did') is not None:
            self.account_did = m.get('account_did')
        return self


class AddEcarOffsetacquisitionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        acquisition_item_no: str = None,
        project_no: str = None,
        account_did: str = None,
        occurrent_time: str = None,
        scenario_code: str = None,
        active_data_list: List[AnyAmountItem] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 活动数据采集单号
        self.acquisition_item_no = acquisition_item_no
        # 碳普惠减碳项目编号
        self.project_no = project_no
        # 参与的碳账户DID
        self.account_did = account_did
        # 发生时间，格式为yyyy-MM-DD HH:MM:SS（到秒）或 yyyy-MM-DD（按日录入）
        self.occurrent_time = occurrent_time
        # 发生场景，需要按照约定的场景编码提交
        self.scenario_code = scenario_code
        # 活动数据列表
        self.active_data_list = active_data_list

    def validate(self):
        self.validate_required(self.acquisition_item_no, 'acquisition_item_no')
        self.validate_required(self.project_no, 'project_no')
        self.validate_required(self.account_did, 'account_did')
        self.validate_required(self.occurrent_time, 'occurrent_time')
        self.validate_required(self.scenario_code, 'scenario_code')
        self.validate_required(self.active_data_list, 'active_data_list')
        if self.active_data_list:
            for k in self.active_data_list:
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
        if self.acquisition_item_no is not None:
            result['acquisition_item_no'] = self.acquisition_item_no
        if self.project_no is not None:
            result['project_no'] = self.project_no
        if self.account_did is not None:
            result['account_did'] = self.account_did
        if self.occurrent_time is not None:
            result['occurrent_time'] = self.occurrent_time
        if self.scenario_code is not None:
            result['scenario_code'] = self.scenario_code
        result['active_data_list'] = []
        if self.active_data_list is not None:
            for k in self.active_data_list:
                result['active_data_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('acquisition_item_no') is not None:
            self.acquisition_item_no = m.get('acquisition_item_no')
        if m.get('project_no') is not None:
            self.project_no = m.get('project_no')
        if m.get('account_did') is not None:
            self.account_did = m.get('account_did')
        if m.get('occurrent_time') is not None:
            self.occurrent_time = m.get('occurrent_time')
        if m.get('scenario_code') is not None:
            self.scenario_code = m.get('scenario_code')
        self.active_data_list = []
        if m.get('active_data_list') is not None:
            for k in m.get('active_data_list'):
                temp_model = AnyAmountItem()
                self.active_data_list.append(temp_model.from_map(k))
        return self


class AddEcarOffsetacquisitionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        acquisition_item_no: str = None,
        carbon_emission_amount: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 活动数据采集单号
        self.acquisition_item_no = acquisition_item_no
        # 减碳量，最多4位小数
        self.carbon_emission_amount = carbon_emission_amount

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
        if self.acquisition_item_no is not None:
            result['acquisition_item_no'] = self.acquisition_item_no
        if self.carbon_emission_amount is not None:
            result['carbon_emission_amount'] = self.carbon_emission_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('acquisition_item_no') is not None:
            self.acquisition_item_no = m.get('acquisition_item_no')
        if m.get('carbon_emission_amount') is not None:
            self.carbon_emission_amount = m.get('carbon_emission_amount')
        return self


class AddEcarOffsettranslateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        translation_item_no: str = None,
        project_no: str = None,
        drawing_account_did: str = None,
        receipt_account_did: str = None,
        translation_ammount: str = None,
        translation_type: str = None,
        occurrent_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 转移业务流水单号
        self.translation_item_no = translation_item_no
        # 碳补偿项目编号
        self.project_no = project_no
        # 出账账户DID
        self.drawing_account_did = drawing_account_did
        # 转移入账账户DID
        self.receipt_account_did = receipt_account_did
        # 转移减碳量额度，最多六位小数
        self.translation_ammount = translation_ammount
        # 业务类型包括，默认不需要传入，默认值为Translation
        self.translation_type = translation_type
        # 发生时间，格式为yyyy-MM-DD HH:MM:SS
        self.occurrent_time = occurrent_time

    def validate(self):
        self.validate_required(self.translation_item_no, 'translation_item_no')
        self.validate_required(self.project_no, 'project_no')
        self.validate_required(self.drawing_account_did, 'drawing_account_did')
        self.validate_required(self.receipt_account_did, 'receipt_account_did')
        self.validate_required(self.translation_ammount, 'translation_ammount')
        self.validate_required(self.occurrent_time, 'occurrent_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.translation_item_no is not None:
            result['translation_item_no'] = self.translation_item_no
        if self.project_no is not None:
            result['project_no'] = self.project_no
        if self.drawing_account_did is not None:
            result['drawing_account_did'] = self.drawing_account_did
        if self.receipt_account_did is not None:
            result['receipt_account_did'] = self.receipt_account_did
        if self.translation_ammount is not None:
            result['translation_ammount'] = self.translation_ammount
        if self.translation_type is not None:
            result['translation_type'] = self.translation_type
        if self.occurrent_time is not None:
            result['occurrent_time'] = self.occurrent_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('translation_item_no') is not None:
            self.translation_item_no = m.get('translation_item_no')
        if m.get('project_no') is not None:
            self.project_no = m.get('project_no')
        if m.get('drawing_account_did') is not None:
            self.drawing_account_did = m.get('drawing_account_did')
        if m.get('receipt_account_did') is not None:
            self.receipt_account_did = m.get('receipt_account_did')
        if m.get('translation_ammount') is not None:
            self.translation_ammount = m.get('translation_ammount')
        if m.get('translation_type') is not None:
            self.translation_type = m.get('translation_type')
        if m.get('occurrent_time') is not None:
            self.occurrent_time = m.get('occurrent_time')
        return self


class AddEcarOffsettranslateResponse(TeaModel):
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


class AuthEcarOffsetdatumRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        account_did: str = None,
        carbon_offset_platform_no: str = None,
        platform_account_id: str = None,
        auth_keyword_list: List[AnyKeywordItem] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 会员在蚂蚁DIS服务的账户DID
        self.account_did = account_did
        # 碳普惠平台编码，如蚂蚁森林编码为Antforest
        self.carbon_offset_platform_no = carbon_offset_platform_no
        # 平台方会员账户ID
        self.platform_account_id = platform_account_id
        # 授权关键数据列表，KV结构列表
        self.auth_keyword_list = auth_keyword_list

    def validate(self):
        self.validate_required(self.account_did, 'account_did')
        self.validate_required(self.carbon_offset_platform_no, 'carbon_offset_platform_no')
        self.validate_required(self.platform_account_id, 'platform_account_id')
        self.validate_required(self.auth_keyword_list, 'auth_keyword_list')
        if self.auth_keyword_list:
            for k in self.auth_keyword_list:
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
        if self.account_did is not None:
            result['account_did'] = self.account_did
        if self.carbon_offset_platform_no is not None:
            result['carbon_offset_platform_no'] = self.carbon_offset_platform_no
        if self.platform_account_id is not None:
            result['platform_account_id'] = self.platform_account_id
        result['auth_keyword_list'] = []
        if self.auth_keyword_list is not None:
            for k in self.auth_keyword_list:
                result['auth_keyword_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('account_did') is not None:
            self.account_did = m.get('account_did')
        if m.get('carbon_offset_platform_no') is not None:
            self.carbon_offset_platform_no = m.get('carbon_offset_platform_no')
        if m.get('platform_account_id') is not None:
            self.platform_account_id = m.get('platform_account_id')
        self.auth_keyword_list = []
        if m.get('auth_keyword_list') is not None:
            for k in m.get('auth_keyword_list'):
                temp_model = AnyKeywordItem()
                self.auth_keyword_list.append(temp_model.from_map(k))
        return self


class AuthEcarOffsetdatumResponse(TeaModel):
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


class ListEcarOffsetdatumRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_no: str = None,
        account_did: str = None,
        occurrent_start_time: str = None,
        occurrent_end_time: str = None,
        carbon_offset_platform_no: str = None,
        scenario_code: List[str] = None,
        current: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 碳补偿项目编码
        self.project_no = project_no
        # 账户DID
        self.account_did = account_did
        # 发生开始时间
        self.occurrent_start_time = occurrent_start_time
        # 数据发生截止时间
        self.occurrent_end_time = occurrent_end_time
        # 碳普惠平台编码
        self.carbon_offset_platform_no = carbon_offset_platform_no
        # 发生场景编码，需指定相关碳普惠平台的场景编码，可以指定多个场景
        self.scenario_code = scenario_code
        # 分页查询数据时的页码，从1开始，不传入时默认值为1
        self.current = current
        # 每页数据量，默认值为20，取值范围为[10,200]
        self.page_size = page_size

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
        if self.project_no is not None:
            result['project_no'] = self.project_no
        if self.account_did is not None:
            result['account_did'] = self.account_did
        if self.occurrent_start_time is not None:
            result['occurrent_start_time'] = self.occurrent_start_time
        if self.occurrent_end_time is not None:
            result['occurrent_end_time'] = self.occurrent_end_time
        if self.carbon_offset_platform_no is not None:
            result['carbon_offset_platform_no'] = self.carbon_offset_platform_no
        if self.scenario_code is not None:
            result['scenario_code'] = self.scenario_code
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_no') is not None:
            self.project_no = m.get('project_no')
        if m.get('account_did') is not None:
            self.account_did = m.get('account_did')
        if m.get('occurrent_start_time') is not None:
            self.occurrent_start_time = m.get('occurrent_start_time')
        if m.get('occurrent_end_time') is not None:
            self.occurrent_end_time = m.get('occurrent_end_time')
        if m.get('carbon_offset_platform_no') is not None:
            self.carbon_offset_platform_no = m.get('carbon_offset_platform_no')
        if m.get('scenario_code') is not None:
            self.scenario_code = m.get('scenario_code')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListEcarOffsetdatumResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current: int = None,
        page_size: int = None,
        total: int = None,
        list: List[CarbonOffsetAcquisitionItem] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前查询的页码
        self.current = current
        # 每页记录条数
        self.page_size = page_size
        # 记录总条数
        self.total = total
        # 碳普惠减碳数据明细
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
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
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
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = CarbonOffsetAcquisitionItem()
                self.list.append(temp_model.from_map(k))
        return self


class ListEcarEnterprisememberRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        register_start_time: str = None,
        register_end_time: str = None,
        current: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 会员注册开始时间
        self.register_start_time = register_start_time
        # 会员注册结束时间
        self.register_end_time = register_end_time
        # 当前查询页码，默认值为1
        self.current = current
        # 每页记录条数，默认为20，取值范围为[10,200]
        self.page_size = page_size

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
        if self.register_start_time is not None:
            result['register_start_time'] = self.register_start_time
        if self.register_end_time is not None:
            result['register_end_time'] = self.register_end_time
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('register_start_time') is not None:
            self.register_start_time = m.get('register_start_time')
        if m.get('register_end_time') is not None:
            self.register_end_time = m.get('register_end_time')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ListEcarEnterprisememberResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current: int = None,
        page_size: int = None,
        total: int = None,
        list: List[EnterpriseMemberSummary] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前查询的页码
        self.current = current
        # 每页记录条数
        self.page_size = page_size
        # 记录总条数
        self.total = total
        # 会员资料列表
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
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
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
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total') is not None:
            self.total = m.get('total')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = EnterpriseMemberSummary()
                self.list.append(temp_model.from_map(k))
        return self


class PreviewEcarOffsetdatumRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 碳普惠项目编码
        self.project_no = project_no

    def validate(self):
        self.validate_required(self.project_no, 'project_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_no is not None:
            result['project_no'] = self.project_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_no') is not None:
            self.project_no = m.get('project_no')
        return self


class PreviewEcarOffsetdatumResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        register_member_total: int = None,
        carbon_energy_total: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 注册会员总数
        self.register_member_total = register_member_total
        # 碳总能量值
        self.carbon_energy_total = carbon_energy_total

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
        if self.register_member_total is not None:
            result['register_member_total'] = self.register_member_total
        if self.carbon_energy_total is not None:
            result['carbon_energy_total'] = self.carbon_energy_total
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('register_member_total') is not None:
            self.register_member_total = m.get('register_member_total')
        if m.get('carbon_energy_total') is not None:
            self.carbon_energy_total = m.get('carbon_energy_total')
        return self


class DetailEcarEnterprisememberRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        mobile: str = None,
        identity_card_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 注册会员手机号码
        self.mobile = mobile
        # 注册会员身份证号码
        self.identity_card_code = identity_card_code

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
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.identity_card_code is not None:
            result['identity_card_code'] = self.identity_card_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('identity_card_code') is not None:
            self.identity_card_code = m.get('identity_card_code')
        return self


class DetailEcarEnterprisememberResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        account_did: str = None,
        name: str = None,
        mobile: str = None,
        register_time: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 账户DID
        self.account_did = account_did
        # 会员姓名，脱敏处理
        self.name = name
        # 会员手机号码，脱敏处理
        self.mobile = mobile
        # 注册时间
        self.register_time = register_time

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
        if self.account_did is not None:
            result['account_did'] = self.account_did
        if self.name is not None:
            result['name'] = self.name
        if self.mobile is not None:
            result['mobile'] = self.mobile
        if self.register_time is not None:
            result['register_time'] = self.register_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('account_did') is not None:
            self.account_did = m.get('account_did')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('mobile') is not None:
            self.mobile = m.get('mobile')
        if m.get('register_time') is not None:
            self.register_time = m.get('register_time')
        return self


class QueryEcarOffsetaccountRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        project_no: str = None,
        account_did: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 碳普惠项目编码
        self.project_no = project_no
        # 账户DID
        self.account_did = account_did

    def validate(self):
        self.validate_required(self.project_no, 'project_no')
        self.validate_required(self.account_did, 'account_did')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.project_no is not None:
            result['project_no'] = self.project_no
        if self.account_did is not None:
            result['account_did'] = self.account_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('project_no') is not None:
            self.project_no = m.get('project_no')
        if m.get('account_did') is not None:
            self.account_did = m.get('account_did')
        return self


class QueryEcarOffsetaccountResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        project_no: str = None,
        account_did: str = None,
        offset_balance: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 碳普惠项目编码
        self.project_no = project_no
        # 账户DID
        self.account_did = account_did
        # 账户减碳量余额
        self.offset_balance = offset_balance

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
        if self.project_no is not None:
            result['project_no'] = self.project_no
        if self.account_did is not None:
            result['account_did'] = self.account_did
        if self.offset_balance is not None:
            result['offset_balance'] = self.offset_balance
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('project_no') is not None:
            self.project_no = m.get('project_no')
        if m.get('account_did') is not None:
            self.account_did = m.get('account_did')
        if m.get('offset_balance') is not None:
            self.offset_balance = m.get('offset_balance')
        return self


class DetailEcarOffsetdatumRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        acquisition_item_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务发生时的调用方的业务单号
        self.acquisition_item_no = acquisition_item_no

    def validate(self):
        self.validate_required(self.acquisition_item_no, 'acquisition_item_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.acquisition_item_no is not None:
            result['acquisition_item_no'] = self.acquisition_item_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('acquisition_item_no') is not None:
            self.acquisition_item_no = m.get('acquisition_item_no')
        return self


class DetailEcarOffsetdatumResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        project_no: str = None,
        project_name: str = None,
        account_did: str = None,
        acquisition_item_no: str = None,
        occurrent_time: str = None,
        scenario_code: str = None,
        scenario_name: str = None,
        platform_no: str = None,
        offset_volume: str = None,
        carbon_energy: int = None,
        active_data_list: List[CarbonOffsetActiveDataDetail] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 碳补偿项目编码
        self.project_no = project_no
        # 碳普惠项目名称
        self.project_name = project_name
        # 会员账户DID
        self.account_did = account_did
        # 采集数据单号
        # 
        self.acquisition_item_no = acquisition_item_no
        # 发生时间
        self.occurrent_time = occurrent_time
        # 发生场景编码
        self.scenario_code = scenario_code
        # 发生场景名称
        self.scenario_name = scenario_name
        # 碳普惠平台编码，如果非平台采集数据，则显示为自采编码：Self
        self.platform_no = platform_no
        # 减碳量
        self.offset_volume = offset_volume
        # 碳能量值
        self.carbon_energy = carbon_energy
        # 活动数据详情列表
        self.active_data_list = active_data_list

    def validate(self):
        if self.active_data_list:
            for k in self.active_data_list:
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
        if self.project_no is not None:
            result['project_no'] = self.project_no
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.account_did is not None:
            result['account_did'] = self.account_did
        if self.acquisition_item_no is not None:
            result['acquisition_item_no'] = self.acquisition_item_no
        if self.occurrent_time is not None:
            result['occurrent_time'] = self.occurrent_time
        if self.scenario_code is not None:
            result['scenario_code'] = self.scenario_code
        if self.scenario_name is not None:
            result['scenario_name'] = self.scenario_name
        if self.platform_no is not None:
            result['platform_no'] = self.platform_no
        if self.offset_volume is not None:
            result['offset_volume'] = self.offset_volume
        if self.carbon_energy is not None:
            result['carbon_energy'] = self.carbon_energy
        result['active_data_list'] = []
        if self.active_data_list is not None:
            for k in self.active_data_list:
                result['active_data_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('project_no') is not None:
            self.project_no = m.get('project_no')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('account_did') is not None:
            self.account_did = m.get('account_did')
        if m.get('acquisition_item_no') is not None:
            self.acquisition_item_no = m.get('acquisition_item_no')
        if m.get('occurrent_time') is not None:
            self.occurrent_time = m.get('occurrent_time')
        if m.get('scenario_code') is not None:
            self.scenario_code = m.get('scenario_code')
        if m.get('scenario_name') is not None:
            self.scenario_name = m.get('scenario_name')
        if m.get('platform_no') is not None:
            self.platform_no = m.get('platform_no')
        if m.get('offset_volume') is not None:
            self.offset_volume = m.get('offset_volume')
        if m.get('carbon_energy') is not None:
            self.carbon_energy = m.get('carbon_energy')
        self.active_data_list = []
        if m.get('active_data_list') is not None:
            for k in m.get('active_data_list'):
                temp_model = CarbonOffsetActiveDataDetail()
                self.active_data_list.append(temp_model.from_map(k))
        return self


class DetailEcarOffsettranslateRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        translation_item_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 减碳数据转移记录业务方的业务单号
        self.translation_item_no = translation_item_no

    def validate(self):
        self.validate_required(self.translation_item_no, 'translation_item_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.translation_item_no is not None:
            result['translation_item_no'] = self.translation_item_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('translation_item_no') is not None:
            self.translation_item_no = m.get('translation_item_no')
        return self


class DetailEcarOffsettranslateResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        translation_item_no: str = None,
        occurrence_time: str = None,
        amount: str = None,
        project_no: str = None,
        project_name: str = None,
        drawing_account_did: str = None,
        receipt_account_did: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务方的业务单号
        self.translation_item_no = translation_item_no
        # 发生时间
        self.occurrence_time = occurrence_time
        # 业务发生量：转移量
        self.amount = amount
        # 碳补偿项目编码
        self.project_no = project_no
        # 碳普惠项目名称
        self.project_name = project_name
        # 转出碳账户DID
        self.drawing_account_did = drawing_account_did
        # 转入碳账户DID
        self.receipt_account_did = receipt_account_did

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
        if self.translation_item_no is not None:
            result['translation_item_no'] = self.translation_item_no
        if self.occurrence_time is not None:
            result['occurrence_time'] = self.occurrence_time
        if self.amount is not None:
            result['amount'] = self.amount
        if self.project_no is not None:
            result['project_no'] = self.project_no
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.drawing_account_did is not None:
            result['drawing_account_did'] = self.drawing_account_did
        if self.receipt_account_did is not None:
            result['receipt_account_did'] = self.receipt_account_did
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('translation_item_no') is not None:
            self.translation_item_no = m.get('translation_item_no')
        if m.get('occurrence_time') is not None:
            self.occurrence_time = m.get('occurrence_time')
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('project_no') is not None:
            self.project_no = m.get('project_no')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('drawing_account_did') is not None:
            self.drawing_account_did = m.get('drawing_account_did')
        if m.get('receipt_account_did') is not None:
            self.receipt_account_did = m.get('receipt_account_did')
        return self


class SubmitEcarLcaassementRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
        status: str = None,
        project_summary: str = None,
        process_datum: str = None,
        assement_result: str = None,
        assement_report: str = None,
        extra_datum: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单编号，碳矩阵关联的订单编号，业务主键
        self.order_no = order_no
        # LCA产品评估状态，返回约定的状态编码
        self.status = status
        # 项目摘要信息，包括有关产品详情和报告时间等，JSON格式，按照约定的格式解析成碳矩阵对应的碳足迹项目和产品信息
        self.project_summary = project_summary
        # 产品工序数据，JSON格式，按照约定的格式解析成碳矩阵对应的工序信息
        self.process_datum = process_datum
        # 碳足迹评估结果数据，JSON格式，按照约定的格式解析成碳矩阵对应的评估结果
        self.assement_result = assement_result
        # 碳足迹评估报告，包括一些报告文件地址等，JSON格式，碳矩阵下载保存对应的报告文件
        self.assement_report = assement_report
        # 扩展信息，JSON格式，预留需提交的数据
        self.extra_datum = extra_datum

    def validate(self):
        self.validate_required(self.order_no, 'order_no')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.status is not None:
            result['status'] = self.status
        if self.project_summary is not None:
            result['project_summary'] = self.project_summary
        if self.process_datum is not None:
            result['process_datum'] = self.process_datum
        if self.assement_result is not None:
            result['assement_result'] = self.assement_result
        if self.assement_report is not None:
            result['assement_report'] = self.assement_report
        if self.extra_datum is not None:
            result['extra_datum'] = self.extra_datum
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('project_summary') is not None:
            self.project_summary = m.get('project_summary')
        if m.get('process_datum') is not None:
            self.process_datum = m.get('process_datum')
        if m.get('assement_result') is not None:
            self.assement_result = m.get('assement_result')
        if m.get('assement_report') is not None:
            self.assement_report = m.get('assement_report')
        if m.get('extra_datum') is not None:
            self.extra_datum = m.get('extra_datum')
        return self


class SubmitEcarLcaassementResponse(TeaModel):
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


class UploadEcarPlaformfileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        file_name: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 上传的文件名
        self.file_name = file_name
        # 待上传文件
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
        if self.file_name is not None:
            result['file_name'] = self.file_name
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
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class UploadEcarPlaformfileResponse(TeaModel):
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
        # 文档地址信息
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


class SubmitEcarLcaorderwithcustomerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        customer: PlatformCustomerSummary = None,
        product: EnterpriseProductSummary = None,
        order_time: str = None,
        order_amount: str = None,
        source_order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 客户信息
        self.customer = customer
        # 产品信息
        self.product = product
        # 订单时间，格式：yyyy-MM-dd HH:mm:ss
        self.order_time = order_time
        # 订单金额，订单金额只能为有效数字（整数不得大于10位，小数不得大于6位）
        self.order_amount = order_amount
        # 来源于三方平台的订单编号
        self.source_order_no = source_order_no

    def validate(self):
        self.validate_required(self.customer, 'customer')
        if self.customer:
            self.customer.validate()
        self.validate_required(self.product, 'product')
        if self.product:
            self.product.validate()
        self.validate_required(self.order_time, 'order_time')
        self.validate_required(self.order_amount, 'order_amount')
        self.validate_required(self.source_order_no, 'source_order_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.customer is not None:
            result['customer'] = self.customer.to_map()
        if self.product is not None:
            result['product'] = self.product.to_map()
        if self.order_time is not None:
            result['order_time'] = self.order_time
        if self.order_amount is not None:
            result['order_amount'] = self.order_amount
        if self.source_order_no is not None:
            result['source_order_no'] = self.source_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('customer') is not None:
            temp_model = PlatformCustomerSummary()
            self.customer = temp_model.from_map(m['customer'])
        if m.get('product') is not None:
            temp_model = EnterpriseProductSummary()
            self.product = temp_model.from_map(m['product'])
        if m.get('order_time') is not None:
            self.order_time = m.get('order_time')
        if m.get('order_amount') is not None:
            self.order_amount = m.get('order_amount')
        if m.get('source_order_no') is not None:
            self.source_order_no = m.get('source_order_no')
        return self


class SubmitEcarLcaorderwithcustomerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_no: str = None,
        source_order_no: str = None,
        carbon_account_no: str = None,
        order_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单编号
        self.order_no = order_no
        # 来源于三方平台的订单编号
        self.source_order_no = source_order_no
        # 碳账户编号，碳矩阵为客户分配的碳账户编号
        self.carbon_account_no = carbon_account_no
        # 订单状态，Pending——处理中，Closed——已关闭，Finished——已完成
        self.order_status = order_status

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
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.source_order_no is not None:
            result['source_order_no'] = self.source_order_no
        if self.carbon_account_no is not None:
            result['carbon_account_no'] = self.carbon_account_no
        if self.order_status is not None:
            result['order_status'] = self.order_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('source_order_no') is not None:
            self.source_order_no = m.get('source_order_no')
        if m.get('carbon_account_no') is not None:
            self.carbon_account_no = m.get('carbon_account_no')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        return self


class GetEcarPlaformauthtokenRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        customer_id: str = None,
        carbon_account_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 三方平台的客户ID
        self.customer_id = customer_id
        # 碳账户编号，碳矩阵为客户分配的碳账户编号，跟前面三方平台的客户customer_id必须任意传一个参数，优先使用customer_id查询客户
        self.carbon_account_no = carbon_account_no

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
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.carbon_account_no is not None:
            result['carbon_account_no'] = self.carbon_account_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('carbon_account_no') is not None:
            self.carbon_account_no = m.get('carbon_account_no')
        return self


class GetEcarPlaformauthtokenResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        customer_id: str = None,
        carbon_account_no: str = None,
        access_token: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 三方平台客户ID
        self.customer_id = customer_id
        # 碳账户编号，碳矩阵为客户分配的碳账户编号
        self.carbon_account_no = carbon_account_no
        # 授权三方平台客户信登的TOKEN
        self.access_token = access_token

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
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.carbon_account_no is not None:
            result['carbon_account_no'] = self.carbon_account_no
        if self.access_token is not None:
            result['access_token'] = self.access_token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('carbon_account_no') is not None:
            self.carbon_account_no = m.get('carbon_account_no')
        if m.get('access_token') is not None:
            self.access_token = m.get('access_token')
        return self


class QueryEcarLcaorderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        order_no: str = None,
        source_order_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 订单号码
        self.order_no = order_no
        # 来源于三方平台的订单编号，跟前面的订单编号order_no必须任传一个进行订单查询。优先使用碳矩阵平台生成的订单编号查询
        self.source_order_no = source_order_no

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
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.source_order_no is not None:
            result['source_order_no'] = self.source_order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('source_order_no') is not None:
            self.source_order_no = m.get('source_order_no')
        return self


class QueryEcarLcaorderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_no: str = None,
        source_order_no: str = None,
        customer_id: str = None,
        carbon_account_no: str = None,
        order_status: str = None,
        product: EnterpriseProductOutline = None,
        lca_carbon_datum: LcaCarbonDatum = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # LCA订单单号
        self.order_no = order_no
        # 来源于三方平台的订单编号
        self.source_order_no = source_order_no
        # 三方平台客户ID，在三方平台唯一
        self.customer_id = customer_id
        # 碳账户编号，碳矩阵为客户分配的碳账户编号
        self.carbon_account_no = carbon_account_no
        # Pending——待分配，Closed——已关闭，Allocated——已分配，Finished——已完成
        self.order_status = order_status
        # 产品概要信息
        self.product = product
        # 足迹计算信息
        self.lca_carbon_datum = lca_carbon_datum

    def validate(self):
        if self.product:
            self.product.validate()
        if self.lca_carbon_datum:
            self.lca_carbon_datum.validate()

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
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.source_order_no is not None:
            result['source_order_no'] = self.source_order_no
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.carbon_account_no is not None:
            result['carbon_account_no'] = self.carbon_account_no
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.product is not None:
            result['product'] = self.product.to_map()
        if self.lca_carbon_datum is not None:
            result['lca_carbon_datum'] = self.lca_carbon_datum.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('source_order_no') is not None:
            self.source_order_no = m.get('source_order_no')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('carbon_account_no') is not None:
            self.carbon_account_no = m.get('carbon_account_no')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('product') is not None:
            temp_model = EnterpriseProductOutline()
            self.product = temp_model.from_map(m['product'])
        if m.get('lca_carbon_datum') is not None:
            temp_model = LcaCarbonDatum()
            self.lca_carbon_datum = temp_model.from_map(m['lca_carbon_datum'])
        return self


class BatchcreateEcarGreencertificategenerationRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        date: str = None,
        inverter_generations: List[InverterGeneration] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 数据发生时间
        self.date = date
        # 逆变器发电量列表
        self.inverter_generations = inverter_generations

    def validate(self):
        self.validate_required(self.date, 'date')
        self.validate_required(self.inverter_generations, 'inverter_generations')
        if self.inverter_generations:
            for k in self.inverter_generations:
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
        if self.date is not None:
            result['date'] = self.date
        result['inverter_generations'] = []
        if self.inverter_generations is not None:
            for k in self.inverter_generations:
                result['inverter_generations'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('date') is not None:
            self.date = m.get('date')
        self.inverter_generations = []
        if m.get('inverter_generations') is not None:
            for k in m.get('inverter_generations'):
                temp_model = InverterGeneration()
                self.inverter_generations.append(temp_model.from_map(k))
        return self


class BatchcreateEcarGreencertificategenerationResponse(TeaModel):
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


class SubmitEcarLcacalcRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        material_code: str = None,
        process_no: str = None,
        life_cycle_boundary: str = None,
        functional_unit: str = None,
        functional_amount: str = None,
        stage_active_data_list: List[LcaStageActiveData] = None,
        custom_context: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 目标产品编码
        self.material_code = material_code
        # 授权过程编码
        self.process_no = process_no
        # 生命周期边界
        self.life_cycle_boundary = life_cycle_boundary
        # 产品功能单位
        self.functional_unit = functional_unit
        # 功能单位数量
        self.functional_amount = functional_amount
        # 各阶段活动数据
        self.stage_active_data_list = stage_active_data_list
        # 自定义业务标识
        self.custom_context = custom_context

    def validate(self):
        self.validate_required(self.material_code, 'material_code')
        self.validate_required(self.process_no, 'process_no')
        self.validate_required(self.life_cycle_boundary, 'life_cycle_boundary')
        self.validate_required(self.functional_unit, 'functional_unit')
        self.validate_required(self.functional_amount, 'functional_amount')
        self.validate_required(self.stage_active_data_list, 'stage_active_data_list')
        if self.stage_active_data_list:
            for k in self.stage_active_data_list:
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
        if self.material_code is not None:
            result['material_code'] = self.material_code
        if self.process_no is not None:
            result['process_no'] = self.process_no
        if self.life_cycle_boundary is not None:
            result['life_cycle_boundary'] = self.life_cycle_boundary
        if self.functional_unit is not None:
            result['functional_unit'] = self.functional_unit
        if self.functional_amount is not None:
            result['functional_amount'] = self.functional_amount
        result['stage_active_data_list'] = []
        if self.stage_active_data_list is not None:
            for k in self.stage_active_data_list:
                result['stage_active_data_list'].append(k.to_map() if k else None)
        if self.custom_context is not None:
            result['custom_context'] = self.custom_context
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('material_code') is not None:
            self.material_code = m.get('material_code')
        if m.get('process_no') is not None:
            self.process_no = m.get('process_no')
        if m.get('life_cycle_boundary') is not None:
            self.life_cycle_boundary = m.get('life_cycle_boundary')
        if m.get('functional_unit') is not None:
            self.functional_unit = m.get('functional_unit')
        if m.get('functional_amount') is not None:
            self.functional_amount = m.get('functional_amount')
        self.stage_active_data_list = []
        if m.get('stage_active_data_list') is not None:
            for k in m.get('stage_active_data_list'):
                temp_model = LcaStageActiveData()
                self.stage_active_data_list.append(temp_model.from_map(k))
        if m.get('custom_context') is not None:
            self.custom_context = m.get('custom_context')
        return self


class SubmitEcarLcacalcResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        record_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 速算记录编号
        self.record_no = record_no

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
        if self.record_no is not None:
            result['record_no'] = self.record_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('record_no') is not None:
            self.record_no = m.get('record_no')
        return self


class QueryEcarLcacalcRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        record_no_list: List[str] = None,
        start_date: str = None,
        end_date: str = None,
        current: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 速算记录编号列表
        self.record_no_list = record_no_list
        # 开始日期，yyyy-MM-dd
        self.start_date = start_date
        # 结束日期，yyyy-MM-dd
        self.end_date = end_date
        # 分页查询页码，从1开始，不传时默认为1
        self.current = current
        # 每页记录条数，取值范围[10, 200]，不传时默认为20
        self.page_size = page_size

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
        if self.record_no_list is not None:
            result['record_no_list'] = self.record_no_list
        if self.start_date is not None:
            result['start_date'] = self.start_date
        if self.end_date is not None:
            result['end_date'] = self.end_date
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('record_no_list') is not None:
            self.record_no_list = m.get('record_no_list')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryEcarLcacalcResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        current: int = None,
        page_size: int = None,
        total: int = None,
        start_date: str = None,
        end_date: str = None,
        list: List[LcaCalcResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 当前查询页码
        self.current = current
        # 每页记录条数
        self.page_size = page_size
        # 记录总条数
        self.total = total
        # 开始日期
        self.start_date = start_date
        # 结束日期
        self.end_date = end_date
        # Lca速算记录列表
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
        if self.current is not None:
            result['current'] = self.current
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.total is not None:
            result['total'] = self.total
        if self.start_date is not None:
            result['start_date'] = self.start_date
        if self.end_date is not None:
            result['end_date'] = self.end_date
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
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        self.list = []
        if m.get('list') is not None:
            for k in m.get('list'):
                temp_model = LcaCalcResult()
                self.list.append(temp_model.from_map(k))
        return self


class SubmitEcarGreencertificategenerationfileRequest(TeaModel):
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
        # 发电量文件id
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


class SubmitEcarGreencertificategenerationfileResponse(TeaModel):
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


class QueryLcaprojectTracetenantRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class QueryLcaprojectTracetenantResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        tenant_id: str = None,
        enterprise_name: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 租户id
        self.tenant_id = tenant_id
        # 企业名称
        self.enterprise_name = enterprise_name

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
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.enterprise_name is not None:
            result['enterprise_name'] = self.enterprise_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('enterprise_name') is not None:
            self.enterprise_name = m.get('enterprise_name')
        return self


class ListLcaprojectTraceprojectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        specification: str = None,
        limit: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 产品规格
        self.specification = specification
        # 列表数量
        self.limit = limit

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.specification, 'specification')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.specification is not None:
            result['specification'] = self.specification
        if self.limit is not None:
            result['limit'] = self.limit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('specification') is not None:
            self.specification = m.get('specification')
        if m.get('limit') is not None:
            self.limit = m.get('limit')
        return self


class ListLcaprojectTraceprojectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        list: List[LcaProjectTrace] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 查询LCA项目列表
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
                temp_model = LcaProjectTrace()
                self.list.append(temp_model.from_map(k))
        return self


class DetailLcaprojectTraceprojectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        project_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 项目编码
        self.project_no = project_no

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.project_no, 'project_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.project_no is not None:
            result['project_no'] = self.project_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('project_no') is not None:
            self.project_no = m.get('project_no')
        return self


class DetailLcaprojectTraceprojectResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        transport_emission_amount: str = None,
        emission_amount: str = None,
        waste_transport_emission_amount: str = None,
        emission_unit: str = None,
        waste_disposal_emission_amount: str = None,
        manufacture_emission_amount: str = None,
        energy_emission_amount: str = None,
        environment_emission_amount: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 原材料运输排放量
        self.transport_emission_amount = transport_emission_amount
        # 碳足迹总排放量
        self.emission_amount = emission_amount
        # 废弃物运输排放量
        self.waste_transport_emission_amount = waste_transport_emission_amount
        # 碳足迹排放单位
        self.emission_unit = emission_unit
        # 废弃物处置排放量
        self.waste_disposal_emission_amount = waste_disposal_emission_amount
        # 原材料制造排放量
        self.manufacture_emission_amount = manufacture_emission_amount
        # 能耗使用排放量
        self.energy_emission_amount = energy_emission_amount
        # 环境排放排放量
        self.environment_emission_amount = environment_emission_amount

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
        if self.transport_emission_amount is not None:
            result['transport_emission_amount'] = self.transport_emission_amount
        if self.emission_amount is not None:
            result['emission_amount'] = self.emission_amount
        if self.waste_transport_emission_amount is not None:
            result['waste_transport_emission_amount'] = self.waste_transport_emission_amount
        if self.emission_unit is not None:
            result['emission_unit'] = self.emission_unit
        if self.waste_disposal_emission_amount is not None:
            result['waste_disposal_emission_amount'] = self.waste_disposal_emission_amount
        if self.manufacture_emission_amount is not None:
            result['manufacture_emission_amount'] = self.manufacture_emission_amount
        if self.energy_emission_amount is not None:
            result['energy_emission_amount'] = self.energy_emission_amount
        if self.environment_emission_amount is not None:
            result['environment_emission_amount'] = self.environment_emission_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('transport_emission_amount') is not None:
            self.transport_emission_amount = m.get('transport_emission_amount')
        if m.get('emission_amount') is not None:
            self.emission_amount = m.get('emission_amount')
        if m.get('waste_transport_emission_amount') is not None:
            self.waste_transport_emission_amount = m.get('waste_transport_emission_amount')
        if m.get('emission_unit') is not None:
            self.emission_unit = m.get('emission_unit')
        if m.get('waste_disposal_emission_amount') is not None:
            self.waste_disposal_emission_amount = m.get('waste_disposal_emission_amount')
        if m.get('manufacture_emission_amount') is not None:
            self.manufacture_emission_amount = m.get('manufacture_emission_amount')
        if m.get('energy_emission_amount') is not None:
            self.energy_emission_amount = m.get('energy_emission_amount')
        if m.get('environment_emission_amount') is not None:
            self.environment_emission_amount = m.get('environment_emission_amount')
        return self


class OperateLcaprojectTracebindingRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        tenant_id: str = None,
        project_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户id
        self.tenant_id = tenant_id
        # 项目编码
        self.project_no = project_no

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.project_no, 'project_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.project_no is not None:
            result['project_no'] = self.project_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('project_no') is not None:
            self.project_no = m.get('project_no')
        return self


class OperateLcaprojectTracebindingResponse(TeaModel):
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


class AddFinanceEmissionRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        enterprise_no: str = None,
        company_id: str = None,
        plan_code: str = None,
        emission_dosage: str = None,
        year: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 银行碳账号
        self.enterprise_no = enterprise_no
        # 企业统一社会信用代码
        self.company_id = company_id
        # 排放盘查方案
        self.plan_code = plan_code
        # 排放量
        self.emission_dosage = emission_dosage
        # 年份
        self.year = year

    def validate(self):
        self.validate_required(self.enterprise_no, 'enterprise_no')
        self.validate_required(self.company_id, 'company_id')
        self.validate_required(self.plan_code, 'plan_code')
        self.validate_required(self.emission_dosage, 'emission_dosage')
        self.validate_required(self.year, 'year')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.enterprise_no is not None:
            result['enterprise_no'] = self.enterprise_no
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.plan_code is not None:
            result['plan_code'] = self.plan_code
        if self.emission_dosage is not None:
            result['emission_dosage'] = self.emission_dosage
        if self.year is not None:
            result['year'] = self.year
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('enterprise_no') is not None:
            self.enterprise_no = m.get('enterprise_no')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('plan_code') is not None:
            self.plan_code = m.get('plan_code')
        if m.get('emission_dosage') is not None:
            self.emission_dosage = m.get('emission_dosage')
        if m.get('year') is not None:
            self.year = m.get('year')
        return self


class AddFinanceEmissionResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        emission_amount: str = None,
        order_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 碳排放量
        self.emission_amount = emission_amount
        # 订单号
        self.order_no = order_no

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
        if self.emission_amount is not None:
            result['emission_amount'] = self.emission_amount
        if self.order_no is not None:
            result['order_no'] = self.order_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('emission_amount') is not None:
            self.emission_amount = m.get('emission_amount')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        return self


class AddFinanceCompanyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        enterprise_no: str = None,
        company_id: str = None,
        company_name: str = None,
        industry_code: str = None,
        area_code: str = None,
        company_submitter: str = None,
        register_year: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 银行碳账户
        self.enterprise_no = enterprise_no
        # 企业统一信用代码或者项目编号
        self.company_id = company_id
        # 企业名称或者项目名称
        self.company_name = company_name
        # 行业编码，枚举值
        self.industry_code = industry_code
        # 地区编码
        self.area_code = area_code
        # 提交人
        self.company_submitter = company_submitter
        # 企业或项目注册年份
        self.register_year = register_year

    def validate(self):
        self.validate_required(self.enterprise_no, 'enterprise_no')
        self.validate_required(self.company_id, 'company_id')
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.industry_code, 'industry_code')
        self.validate_required(self.area_code, 'area_code')
        self.validate_required(self.company_submitter, 'company_submitter')
        self.validate_required(self.register_year, 'register_year')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.enterprise_no is not None:
            result['enterprise_no'] = self.enterprise_no
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.industry_code is not None:
            result['industry_code'] = self.industry_code
        if self.area_code is not None:
            result['area_code'] = self.area_code
        if self.company_submitter is not None:
            result['company_submitter'] = self.company_submitter
        if self.register_year is not None:
            result['register_year'] = self.register_year
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('enterprise_no') is not None:
            self.enterprise_no = m.get('enterprise_no')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('industry_code') is not None:
            self.industry_code = m.get('industry_code')
        if m.get('area_code') is not None:
            self.area_code = m.get('area_code')
        if m.get('company_submitter') is not None:
            self.company_submitter = m.get('company_submitter')
        if m.get('register_year') is not None:
            self.register_year = m.get('register_year')
        return self


class AddFinanceCompanyResponse(TeaModel):
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


class UpdateFinanceCompanyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        enterprise_no: str = None,
        company_id: str = None,
        company_name: str = None,
        industry_code: str = None,
        area_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 银行碳账户
        self.enterprise_no = enterprise_no
        # 企业统一信用代码
        self.company_id = company_id
        # 企业或者项目名称
        self.company_name = company_name
        # 行业编码
        self.industry_code = industry_code
        # 地区编码
        self.area_code = area_code

    def validate(self):
        self.validate_required(self.enterprise_no, 'enterprise_no')
        self.validate_required(self.company_id, 'company_id')
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.industry_code, 'industry_code')
        self.validate_required(self.area_code, 'area_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.enterprise_no is not None:
            result['enterprise_no'] = self.enterprise_no
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.industry_code is not None:
            result['industry_code'] = self.industry_code
        if self.area_code is not None:
            result['area_code'] = self.area_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('enterprise_no') is not None:
            self.enterprise_no = m.get('enterprise_no')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('industry_code') is not None:
            self.industry_code = m.get('industry_code')
        if m.get('area_code') is not None:
            self.area_code = m.get('area_code')
        return self


class UpdateFinanceCompanyResponse(TeaModel):
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


class DeleteFinanceCompanyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        enterprise_no: str = None,
        company_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 银行碳账户
        self.enterprise_no = enterprise_no
        # 企业统一信用代码或者项目id
        self.company_id = company_id

    def validate(self):
        self.validate_required(self.enterprise_no, 'enterprise_no')
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
        if self.enterprise_no is not None:
            result['enterprise_no'] = self.enterprise_no
        if self.company_id is not None:
            result['company_id'] = self.company_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('enterprise_no') is not None:
            self.enterprise_no = m.get('enterprise_no')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        return self


class DeleteFinanceCompanyResponse(TeaModel):
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


class ListFinanceReportRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        enterprise_no: str = None,
        company_id: str = None,
        compare_year: str = None,
        base_year: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 银行碳账户
        self.enterprise_no = enterprise_no
        # 企业统一信用代码或者项目id
        self.company_id = company_id
        # 报告年，当前年，对比年
        self.compare_year = compare_year
        # 基准年，被对比年
        self.base_year = base_year

    def validate(self):
        self.validate_required(self.enterprise_no, 'enterprise_no')
        self.validate_required(self.company_id, 'company_id')
        self.validate_required(self.compare_year, 'compare_year')
        self.validate_required(self.base_year, 'base_year')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.enterprise_no is not None:
            result['enterprise_no'] = self.enterprise_no
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.compare_year is not None:
            result['compare_year'] = self.compare_year
        if self.base_year is not None:
            result['base_year'] = self.base_year
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('enterprise_no') is not None:
            self.enterprise_no = m.get('enterprise_no')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('compare_year') is not None:
            self.compare_year = m.get('compare_year')
        if m.get('base_year') is not None:
            self.base_year = m.get('base_year')
        return self


class ListFinanceReportResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        list: List[FinanceReportDetail] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 报告列表
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
                temp_model = FinanceReportDetail()
                self.list.append(temp_model.from_map(k))
        return self


class CreateFinanceReportRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        enterprise_no: str = None,
        company_id: str = None,
        compare_year: str = None,
        base_year: str = None,
        transfer_path_analysis_list: List[TransferPathAnalysis] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 银行碳账户
        self.enterprise_no = enterprise_no
        # 企业社会统一信用编码
        self.company_id = company_id
        # 对比年
        self.compare_year = compare_year
        # 基准年份
        self.base_year = base_year
        # 转型路径分析
        self.transfer_path_analysis_list = transfer_path_analysis_list

    def validate(self):
        self.validate_required(self.enterprise_no, 'enterprise_no')
        self.validate_required(self.company_id, 'company_id')
        self.validate_required(self.compare_year, 'compare_year')
        self.validate_required(self.base_year, 'base_year')
        self.validate_required(self.transfer_path_analysis_list, 'transfer_path_analysis_list')
        if self.transfer_path_analysis_list:
            for k in self.transfer_path_analysis_list:
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
        if self.enterprise_no is not None:
            result['enterprise_no'] = self.enterprise_no
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.compare_year is not None:
            result['compare_year'] = self.compare_year
        if self.base_year is not None:
            result['base_year'] = self.base_year
        result['transfer_path_analysis_list'] = []
        if self.transfer_path_analysis_list is not None:
            for k in self.transfer_path_analysis_list:
                result['transfer_path_analysis_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('enterprise_no') is not None:
            self.enterprise_no = m.get('enterprise_no')
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('compare_year') is not None:
            self.compare_year = m.get('compare_year')
        if m.get('base_year') is not None:
            self.base_year = m.get('base_year')
        self.transfer_path_analysis_list = []
        if m.get('transfer_path_analysis_list') is not None:
            for k in m.get('transfer_path_analysis_list'):
                temp_model = TransferPathAnalysis()
                self.transfer_path_analysis_list.append(temp_model.from_map(k))
        return self


class CreateFinanceReportResponse(TeaModel):
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


class UpdateFinanceReportRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        report_no: str = None,
        enterprise_no: str = None,
        report_singer: str = None,
        report_oss_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 报告单号
        self.report_no = report_no
        # 银行碳账号
        self.enterprise_no = enterprise_no
        # 报告盖章人
        self.report_singer = report_singer
        # 可以直接公网可以下载的oss地址
        self.report_oss_url = report_oss_url

    def validate(self):
        self.validate_required(self.report_no, 'report_no')
        self.validate_required(self.enterprise_no, 'enterprise_no')
        self.validate_required(self.report_singer, 'report_singer')
        self.validate_required(self.report_oss_url, 'report_oss_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.report_no is not None:
            result['report_no'] = self.report_no
        if self.enterprise_no is not None:
            result['enterprise_no'] = self.enterprise_no
        if self.report_singer is not None:
            result['report_singer'] = self.report_singer
        if self.report_oss_url is not None:
            result['report_oss_url'] = self.report_oss_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('report_no') is not None:
            self.report_no = m.get('report_no')
        if m.get('enterprise_no') is not None:
            self.enterprise_no = m.get('enterprise_no')
        if m.get('report_singer') is not None:
            self.report_singer = m.get('report_singer')
        if m.get('report_oss_url') is not None:
            self.report_oss_url = m.get('report_oss_url')
        return self


class UpdateFinanceReportResponse(TeaModel):
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


