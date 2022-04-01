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


class PriceConstraintConditionVO(TeaModel):
    def __init__(
        self,
        id: int = None,
        price_constraint_id: int = None,
        spec_condition_code: str = None,
        operator: str = None,
        target_value: str = None,
        spec_condition_name: str = None,
        target_value_name: str = None,
        description: str = None,
    ):
        # 约束ID
        self.id = id
        # 价格约束ID
        self.price_constraint_id = price_constraint_id
        # 规格条件CODE
        self.spec_condition_code = spec_condition_code
        # 条件关系比较符
        self.operator = operator
        # 待比较对象的值
        self.target_value = target_value
        # 特定场景下set才会有值
        self.spec_condition_name = spec_condition_name
        # 特定场景下set才会有值
        self.target_value_name = target_value_name
        # 描述
        self.description = description

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.price_constraint_id, 'price_constraint_id')

    def to_map(self):
        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.price_constraint_id is not None:
            result['price_constraint_id'] = self.price_constraint_id
        if self.spec_condition_code is not None:
            result['spec_condition_code'] = self.spec_condition_code
        if self.operator is not None:
            result['operator'] = self.operator
        if self.target_value is not None:
            result['target_value'] = self.target_value
        if self.spec_condition_name is not None:
            result['spec_condition_name'] = self.spec_condition_name
        if self.target_value_name is not None:
            result['target_value_name'] = self.target_value_name
        if self.description is not None:
            result['description'] = self.description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('price_constraint_id') is not None:
            self.price_constraint_id = m.get('price_constraint_id')
        if m.get('spec_condition_code') is not None:
            self.spec_condition_code = m.get('spec_condition_code')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        if m.get('target_value') is not None:
            self.target_value = m.get('target_value')
        if m.get('spec_condition_name') is not None:
            self.spec_condition_name = m.get('spec_condition_name')
        if m.get('target_value_name') is not None:
            self.target_value_name = m.get('target_value_name')
        if m.get('description') is not None:
            self.description = m.get('description')
        return self


class OfferMaster(TeaModel):
    def __init__(
        self,
        inner_code: str = None,
        format_code: str = None,
        outer_code: str = None,
        name: str = None,
        description: str = None,
        product_code: str = None,
        service_code: str = None,
        spu_code: str = None,
    ):
        # 内部商品码
        self.inner_code = inner_code
        # 用于展示的格式化商品编码
        self.format_code = format_code
        # 外部商品编码
        self.outer_code = outer_code
        # 商品名称
        self.name = name
        # 商品描述
        self.description = description
        # 产品code
        self.product_code = product_code
        # 渠道产品编码
        self.service_code = service_code
        # l4编码
        self.spu_code = spu_code

    def validate(self):
        self.validate_required(self.inner_code, 'inner_code')
        self.validate_required(self.format_code, 'format_code')
        self.validate_required(self.outer_code, 'outer_code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.description, 'description')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.service_code, 'service_code')
        self.validate_required(self.spu_code, 'spu_code')

    def to_map(self):
        result = dict()
        if self.inner_code is not None:
            result['inner_code'] = self.inner_code
        if self.format_code is not None:
            result['format_code'] = self.format_code
        if self.outer_code is not None:
            result['outer_code'] = self.outer_code
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.service_code is not None:
            result['service_code'] = self.service_code
        if self.spu_code is not None:
            result['spu_code'] = self.spu_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('inner_code') is not None:
            self.inner_code = m.get('inner_code')
        if m.get('format_code') is not None:
            self.format_code = m.get('format_code')
        if m.get('outer_code') is not None:
            self.outer_code = m.get('outer_code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('service_code') is not None:
            self.service_code = m.get('service_code')
        if m.get('spu_code') is not None:
            self.spu_code = m.get('spu_code')
        return self


class PriceConstraintResultVO(TeaModel):
    def __init__(
        self,
        id: int = None,
        price_constraint_id: int = None,
        base_price: str = None,
        adjust_price: str = None,
        bd_price: str = None,
        cost_price: str = None,
        ladder_start: str = None,
        ladder_end: str = None,
        price_unit: str = None,
        ladder_price_fixed: bool = None,
    ):
        # 价格id
        self.id = id
        # 价格约束ID
        self.price_constraint_id = price_constraint_id
        # 基础价格费率
        self.base_price = base_price
        # 基础保底价
        self.adjust_price = adjust_price
        # BD销售最低价费率
        self.bd_price = bd_price
        # 成本价费率
        self.cost_price = cost_price
        # 阶梯区间最小值
        self.ladder_start = ladder_start
        # 阶梯区间结束值
        self.ladder_end = ladder_end
        # 价格单位，例如：元/每次
        self.price_unit = price_unit
        # 是否阶梯固定价
        self.ladder_price_fixed = ladder_price_fixed

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.price_constraint_id, 'price_constraint_id')

    def to_map(self):
        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.price_constraint_id is not None:
            result['price_constraint_id'] = self.price_constraint_id
        if self.base_price is not None:
            result['base_price'] = self.base_price
        if self.adjust_price is not None:
            result['adjust_price'] = self.adjust_price
        if self.bd_price is not None:
            result['bd_price'] = self.bd_price
        if self.cost_price is not None:
            result['cost_price'] = self.cost_price
        if self.ladder_start is not None:
            result['ladder_start'] = self.ladder_start
        if self.ladder_end is not None:
            result['ladder_end'] = self.ladder_end
        if self.price_unit is not None:
            result['price_unit'] = self.price_unit
        if self.ladder_price_fixed is not None:
            result['ladder_price_fixed'] = self.ladder_price_fixed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('price_constraint_id') is not None:
            self.price_constraint_id = m.get('price_constraint_id')
        if m.get('base_price') is not None:
            self.base_price = m.get('base_price')
        if m.get('adjust_price') is not None:
            self.adjust_price = m.get('adjust_price')
        if m.get('bd_price') is not None:
            self.bd_price = m.get('bd_price')
        if m.get('cost_price') is not None:
            self.cost_price = m.get('cost_price')
        if m.get('ladder_start') is not None:
            self.ladder_start = m.get('ladder_start')
        if m.get('ladder_end') is not None:
            self.ladder_end = m.get('ladder_end')
        if m.get('price_unit') is not None:
            self.price_unit = m.get('price_unit')
        if m.get('ladder_price_fixed') is not None:
            self.ladder_price_fixed = m.get('ladder_price_fixed')
        return self


class AcceptanceDetail(TeaModel):
    def __init__(
        self,
        name: str = None,
        price: str = None,
    ):
        # 客户名称
        self.name = name
        # 客户价格
        self.price = price

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.price is not None:
            result['price'] = self.price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('price') is not None:
            self.price = m.get('price')
        return self


class AdditionDetail(TeaModel):
    def __init__(
        self,
        name: str = None,
        profit: str = None,
        technical_score: str = None,
        brand_score: str = None,
        bd_price_predict: str = None,
    ):
        # 友商名称
        self.name = name
        # 友商价格
        self.profit = profit
        # 技术分调整
        self.technical_score = technical_score
        # 品牌分调整
        self.brand_score = brand_score
        # BD权限价预估
        self.bd_price_predict = bd_price_predict

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.profit is not None:
            result['profit'] = self.profit
        if self.technical_score is not None:
            result['technical_score'] = self.technical_score
        if self.brand_score is not None:
            result['brand_score'] = self.brand_score
        if self.bd_price_predict is not None:
            result['bd_price_predict'] = self.bd_price_predict
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('profit') is not None:
            self.profit = m.get('profit')
        if m.get('technical_score') is not None:
            self.technical_score = m.get('technical_score')
        if m.get('brand_score') is not None:
            self.brand_score = m.get('brand_score')
        if m.get('bd_price_predict') is not None:
            self.bd_price_predict = m.get('bd_price_predict')
        return self


class CostInfo(TeaModel):
    def __init__(
        self,
        cost_reason: str = None,
        predict_profit: str = None,
    ):
        # 成本法原因
        self.cost_reason = cost_reason
        # 预期毛利率
        self.predict_profit = predict_profit

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.cost_reason is not None:
            result['cost_reason'] = self.cost_reason
        if self.predict_profit is not None:
            result['predict_profit'] = self.predict_profit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cost_reason') is not None:
            self.cost_reason = m.get('cost_reason')
        if m.get('predict_profit') is not None:
            self.predict_profit = m.get('predict_profit')
        return self


class PriceConstraintVO(TeaModel):
    def __init__(
        self,
        id: int = None,
        price_plan_id: int = None,
        name: str = None,
        description: str = None,
        price_constraint_condition_vo_list: List[PriceConstraintConditionVO] = None,
        price_constraint_result_vo_list: List[PriceConstraintResultVO] = None,
    ):
        # 定价计划ID
        self.id = id
        # 定价计划ID
        self.price_plan_id = price_plan_id
        # 定价计划名称
        self.name = name
        # 描述
        self.description = description
        # 约束条件列表
        self.price_constraint_condition_vo_list = price_constraint_condition_vo_list
        # 约束结果列表
        self.price_constraint_result_vo_list = price_constraint_result_vo_list

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.price_plan_id, 'price_plan_id')
        if self.price_constraint_condition_vo_list:
            for k in self.price_constraint_condition_vo_list:
                if k:
                    k.validate()
        if self.price_constraint_result_vo_list:
            for k in self.price_constraint_result_vo_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.price_plan_id is not None:
            result['price_plan_id'] = self.price_plan_id
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        result['price_constraint_condition_vo_list'] = []
        if self.price_constraint_condition_vo_list is not None:
            for k in self.price_constraint_condition_vo_list:
                result['price_constraint_condition_vo_list'].append(k.to_map() if k else None)
        result['price_constraint_result_vo_list'] = []
        if self.price_constraint_result_vo_list is not None:
            for k in self.price_constraint_result_vo_list:
                result['price_constraint_result_vo_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('price_plan_id') is not None:
            self.price_plan_id = m.get('price_plan_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        self.price_constraint_condition_vo_list = []
        if m.get('price_constraint_condition_vo_list') is not None:
            for k in m.get('price_constraint_condition_vo_list'):
                temp_model = PriceConstraintConditionVO()
                self.price_constraint_condition_vo_list.append(temp_model.from_map(k))
        self.price_constraint_result_vo_list = []
        if m.get('price_constraint_result_vo_list') is not None:
            for k in m.get('price_constraint_result_vo_list'):
                temp_model = PriceConstraintResultVO()
                self.price_constraint_result_vo_list.append(temp_model.from_map(k))
        return self


class CustomerValueDetail(TeaModel):
    def __init__(
        self,
        name: str = None,
        profit: str = None,
        ant_divide: str = None,
        bd_price_predict: str = None,
    ):
        # 名称
        self.name = name
        # 友商价格
        self.profit = profit
        # 蚂蚁收益
        self.ant_divide = ant_divide
        # BD权限价预估
        self.bd_price_predict = bd_price_predict

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.profit is not None:
            result['profit'] = self.profit
        if self.ant_divide is not None:
            result['ant_divide'] = self.ant_divide
        if self.bd_price_predict is not None:
            result['bd_price_predict'] = self.bd_price_predict
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('profit') is not None:
            self.profit = m.get('profit')
        if m.get('ant_divide') is not None:
            self.ant_divide = m.get('ant_divide')
        if m.get('bd_price_predict') is not None:
            self.bd_price_predict = m.get('bd_price_predict')
        return self


class PriceLimitStrategyDTO(TeaModel):
    def __init__(
        self,
        creator: str = None,
        modifier: str = None,
        deleted: bool = None,
        price_plan_id: int = None,
        duration_type: str = None,
        guarantee_price: str = None,
        guarantee_cost_price: str = None,
    ):
        # 创建人
        self.creator = creator
        # 修改人
        self.modifier = modifier
        # 是否删除
        self.deleted = deleted
        # 定价计划ID
        self.price_plan_id = price_plan_id
        # 保底周期,year年、month月
        self.duration_type = duration_type
        # 保底价格
        self.guarantee_price = guarantee_price
        # 产品成本
        self.guarantee_cost_price = guarantee_cost_price

    def validate(self):
        self.validate_required(self.price_plan_id, 'price_plan_id')

    def to_map(self):
        result = dict()
        if self.creator is not None:
            result['creator'] = self.creator
        if self.modifier is not None:
            result['modifier'] = self.modifier
        if self.deleted is not None:
            result['deleted'] = self.deleted
        if self.price_plan_id is not None:
            result['price_plan_id'] = self.price_plan_id
        if self.duration_type is not None:
            result['duration_type'] = self.duration_type
        if self.guarantee_price is not None:
            result['guarantee_price'] = self.guarantee_price
        if self.guarantee_cost_price is not None:
            result['guarantee_cost_price'] = self.guarantee_cost_price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('modifier') is not None:
            self.modifier = m.get('modifier')
        if m.get('deleted') is not None:
            self.deleted = m.get('deleted')
        if m.get('price_plan_id') is not None:
            self.price_plan_id = m.get('price_plan_id')
        if m.get('duration_type') is not None:
            self.duration_type = m.get('duration_type')
        if m.get('guarantee_price') is not None:
            self.guarantee_price = m.get('guarantee_price')
        if m.get('guarantee_cost_price') is not None:
            self.guarantee_cost_price = m.get('guarantee_cost_price')
        return self


class MarketInfo(TeaModel):
    def __init__(
        self,
        market_logic: str = None,
        acceptance_details: List[AcceptanceDetail] = None,
        addition_details: List[AdditionDetail] = None,
    ):
        # 市场逻辑
        self.market_logic = market_logic
        # 潜客接受度
        self.acceptance_details = acceptance_details
        # 基于竞品及加成
        self.addition_details = addition_details

    def validate(self):
        if self.acceptance_details:
            for k in self.acceptance_details:
                if k:
                    k.validate()
        if self.addition_details:
            for k in self.addition_details:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.market_logic is not None:
            result['market_logic'] = self.market_logic
        result['acceptance_details'] = []
        if self.acceptance_details is not None:
            for k in self.acceptance_details:
                result['acceptance_details'].append(k.to_map() if k else None)
        result['addition_details'] = []
        if self.addition_details is not None:
            for k in self.addition_details:
                result['addition_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('market_logic') is not None:
            self.market_logic = m.get('market_logic')
        self.acceptance_details = []
        if m.get('acceptance_details') is not None:
            for k in m.get('acceptance_details'):
                temp_model = AcceptanceDetail()
                self.acceptance_details.append(temp_model.from_map(k))
        self.addition_details = []
        if m.get('addition_details') is not None:
            for k in m.get('addition_details'):
                temp_model = AdditionDetail()
                self.addition_details.append(temp_model.from_map(k))
        return self


class ProductSpu(TeaModel):
    def __init__(
        self,
        spu_code: str = None,
        spu_name: str = None,
        spu_desc: str = None,
        delivery_mode: str = None,
        product_code: str = None,
        involved_one_party: bool = None,
        segment: str = None,
        offer_master: List[OfferMaster] = None,
    ):
        # SPU编码
        self.spu_code = spu_code
        # SPU名称
        self.spu_name = spu_name
        # spu描述
        self.spu_desc = spu_desc
        # 交付模式，ONLINE/OFFLINE
        self.delivery_mode = delivery_mode
        # 归属产品码
        self.product_code = product_code
        # 是否涉及一方化
        self.involved_one_party = involved_one_party
        # technical_product:技术产品，technical_service:技术服务，solution_se:标准解决方案，saas:标准化SaaS，saas+:SaaS +，trading_network:交易网络
        self.segment = segment
        # sku数据
        self.offer_master = offer_master

    def validate(self):
        self.validate_required(self.spu_code, 'spu_code')
        self.validate_required(self.spu_name, 'spu_name')
        self.validate_required(self.spu_desc, 'spu_desc')
        self.validate_required(self.delivery_mode, 'delivery_mode')
        self.validate_required(self.product_code, 'product_code')
        self.validate_required(self.involved_one_party, 'involved_one_party')
        self.validate_required(self.segment, 'segment')
        self.validate_required(self.offer_master, 'offer_master')
        if self.offer_master:
            for k in self.offer_master:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.spu_code is not None:
            result['spu_code'] = self.spu_code
        if self.spu_name is not None:
            result['spu_name'] = self.spu_name
        if self.spu_desc is not None:
            result['spu_desc'] = self.spu_desc
        if self.delivery_mode is not None:
            result['delivery_mode'] = self.delivery_mode
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.involved_one_party is not None:
            result['involved_one_party'] = self.involved_one_party
        if self.segment is not None:
            result['segment'] = self.segment
        result['offer_master'] = []
        if self.offer_master is not None:
            for k in self.offer_master:
                result['offer_master'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('spu_code') is not None:
            self.spu_code = m.get('spu_code')
        if m.get('spu_name') is not None:
            self.spu_name = m.get('spu_name')
        if m.get('spu_desc') is not None:
            self.spu_desc = m.get('spu_desc')
        if m.get('delivery_mode') is not None:
            self.delivery_mode = m.get('delivery_mode')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('involved_one_party') is not None:
            self.involved_one_party = m.get('involved_one_party')
        if m.get('segment') is not None:
            self.segment = m.get('segment')
        self.offer_master = []
        if m.get('offer_master') is not None:
            for k in m.get('offer_master'):
                temp_model = OfferMaster()
                self.offer_master.append(temp_model.from_map(k))
        return self


class BusinessProduct(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
        business_line: str = None,
        product_line: str = None,
        product_spu: List[ProductSpu] = None,
    ):
        # 业务产品code
        self.code = code
        # 产品线名称
        self.name = name
        # 归属业务线
        self.business_line = business_line
        # 归属产品线
        self.product_line = product_line
        # spu列表
        self.product_spu = product_spu

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.business_line, 'business_line')
        self.validate_required(self.product_line, 'product_line')
        self.validate_required(self.product_spu, 'product_spu')
        if self.product_spu:
            for k in self.product_spu:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.business_line is not None:
            result['business_line'] = self.business_line
        if self.product_line is not None:
            result['product_line'] = self.product_line
        result['product_spu'] = []
        if self.product_spu is not None:
            for k in self.product_spu:
                result['product_spu'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('business_line') is not None:
            self.business_line = m.get('business_line')
        if m.get('product_line') is not None:
            self.product_line = m.get('product_line')
        self.product_spu = []
        if m.get('product_spu') is not None:
            for k in m.get('product_spu'):
                temp_model = ProductSpu()
                self.product_spu.append(temp_model.from_map(k))
        return self


class PricePlanVO(TeaModel):
    def __init__(
        self,
        id: int = None,
        commodity_code: str = None,
        price_object_code: str = None,
        name: str = None,
        type: str = None,
        tenant_id: str = None,
        contract_id: str = None,
        policy_id: str = None,
        business_project_id: str = None,
        execute_condition: str = None,
        priority: int = None,
        no_match_rule: str = None,
        pricing_mode: str = None,
        pricing_method: str = None,
        ladder_interval_type: str = None,
        parent_price_plan_id: int = None,
        status: str = None,
        start_time: str = None,
        end_time: str = None,
        creator: str = None,
        modifier: str = None,
        gmt_create: str = None,
        gmt_modified: str = None,
        basis: str = None,
        price_condition_codes: str = None,
        price_safe_area: str = None,
        template_code: str = None,
        bpms_process_id: str = None,
        strategy: str = None,
        price_stage: str = None,
        price_constraint_vo_list: List[PriceConstraintVO] = None,
        price_limit_strategy_dto: List[PriceLimitStrategyDTO] = None,
        sale_channel: List[str] = None,
        official_sell_discount: str = None,
        customer_value_info: CustomerValueDetail = None,
        market_info: MarketInfo = None,
        cost_info: CostInfo = None,
    ):
        # 定价计划ID
        self.id = id
        # 商品CODE
        self.commodity_code = commodity_code
        # 定价对象CODE
        self.price_object_code = price_object_code
        # 定价计划名称
        self.name = name
        # 定价计划类型
        self.type = type
        # 租户ID
        self.tenant_id = tenant_id
        # 合同ID
        self.contract_id = contract_id
        # 政策ID
        self.policy_id = policy_id
        # 商务项目ID
        self.business_project_id = business_project_id
        # 执行条件
        self.execute_condition = execute_condition
        # 优先级
        self.priority = priority
        # 价格匹配不到处理策略：抛异常，继续询价
        self.no_match_rule = no_match_rule
        # 计价模式：公式、阶梯、自定义
        self.pricing_mode = pricing_mode
        # 计价方法：具体公式、阶梯方法、自定义
        self.pricing_method = pricing_method
        # 阶梯区间类型，左开右闭/左闭右开
        self.ladder_interval_type = ladder_interval_type
        # 父定价计划ID
        self.parent_price_plan_id = parent_price_plan_id
        # 定价计划状态，编辑中、预发生效、线上生效、失效
        self.status = status
        # 生效起始时间
        self.start_time = start_time
        # 生效结束时间
        self.end_time = end_time
        # 创建者
        self.creator = creator
        # 修改者
        self.modifier = modifier
        # 创建时间
        self.gmt_create = gmt_create
        # 修改时间
        self.gmt_modified = gmt_modified
        # 是否是基础价格
        self.basis = basis
        # 价格条件，多个以分号分隔
        self.price_condition_codes = price_condition_codes
        # 价格安全区间，格式 min,max如0,100
        self.price_safe_area = price_safe_area
        # 关联模板
        self.template_code = template_code
        # 关联审批流程
        self.bpms_process_id = bpms_process_id
        # 定价策略
        self.strategy = strategy
        # 定价阶段
        self.price_stage = price_stage
        # 定价计划对应的约束，只有在明确需要查询定价约束时才会手动set进去
        self.price_constraint_vo_list = price_constraint_vo_list
        # 价格限制策略
        self.price_limit_strategy_dto = price_limit_strategy_dto
        # 销售渠道
        self.sale_channel = sale_channel
        # 官网售卖折扣设置
        self.official_sell_discount = official_sell_discount
        # 客户法详情
        self.customer_value_info = customer_value_info
        # 市场法详情
        self.market_info = market_info
        # 成本法详情
        self.cost_info = cost_info

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.price_object_code, 'price_object_code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.type, 'type')
        self.validate_required(self.priority, 'priority')
        self.validate_required(self.status, 'status')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.gmt_modified, 'gmt_modified')
        if self.gmt_modified is not None:
            self.validate_pattern(self.gmt_modified, 'gmt_modified', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.price_safe_area, 'price_safe_area')
        if self.price_constraint_vo_list:
            for k in self.price_constraint_vo_list:
                if k:
                    k.validate()
        if self.price_limit_strategy_dto:
            for k in self.price_limit_strategy_dto:
                if k:
                    k.validate()
        if self.customer_value_info:
            self.customer_value_info.validate()
        if self.market_info:
            self.market_info.validate()
        if self.cost_info:
            self.cost_info.validate()

    def to_map(self):
        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.price_object_code is not None:
            result['price_object_code'] = self.price_object_code
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.contract_id is not None:
            result['contract_id'] = self.contract_id
        if self.policy_id is not None:
            result['policy_id'] = self.policy_id
        if self.business_project_id is not None:
            result['business_project_id'] = self.business_project_id
        if self.execute_condition is not None:
            result['execute_condition'] = self.execute_condition
        if self.priority is not None:
            result['priority'] = self.priority
        if self.no_match_rule is not None:
            result['no_match_rule'] = self.no_match_rule
        if self.pricing_mode is not None:
            result['pricing_mode'] = self.pricing_mode
        if self.pricing_method is not None:
            result['pricing_method'] = self.pricing_method
        if self.ladder_interval_type is not None:
            result['ladder_interval_type'] = self.ladder_interval_type
        if self.parent_price_plan_id is not None:
            result['parent_price_plan_id'] = self.parent_price_plan_id
        if self.status is not None:
            result['status'] = self.status
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.creator is not None:
            result['creator'] = self.creator
        if self.modifier is not None:
            result['modifier'] = self.modifier
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        if self.gmt_modified is not None:
            result['gmt_modified'] = self.gmt_modified
        if self.basis is not None:
            result['basis'] = self.basis
        if self.price_condition_codes is not None:
            result['price_condition_codes'] = self.price_condition_codes
        if self.price_safe_area is not None:
            result['price_safe_area'] = self.price_safe_area
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.bpms_process_id is not None:
            result['bpms_process_id'] = self.bpms_process_id
        if self.strategy is not None:
            result['strategy'] = self.strategy
        if self.price_stage is not None:
            result['price_stage'] = self.price_stage
        result['price_constraint_vo_list'] = []
        if self.price_constraint_vo_list is not None:
            for k in self.price_constraint_vo_list:
                result['price_constraint_vo_list'].append(k.to_map() if k else None)
        result['price_limit_strategy_dto'] = []
        if self.price_limit_strategy_dto is not None:
            for k in self.price_limit_strategy_dto:
                result['price_limit_strategy_dto'].append(k.to_map() if k else None)
        if self.sale_channel is not None:
            result['sale_channel'] = self.sale_channel
        if self.official_sell_discount is not None:
            result['official_sell_discount'] = self.official_sell_discount
        if self.customer_value_info is not None:
            result['customer_value_info'] = self.customer_value_info.to_map()
        if self.market_info is not None:
            result['market_info'] = self.market_info.to_map()
        if self.cost_info is not None:
            result['cost_info'] = self.cost_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('price_object_code') is not None:
            self.price_object_code = m.get('price_object_code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('contract_id') is not None:
            self.contract_id = m.get('contract_id')
        if m.get('policy_id') is not None:
            self.policy_id = m.get('policy_id')
        if m.get('business_project_id') is not None:
            self.business_project_id = m.get('business_project_id')
        if m.get('execute_condition') is not None:
            self.execute_condition = m.get('execute_condition')
        if m.get('priority') is not None:
            self.priority = m.get('priority')
        if m.get('no_match_rule') is not None:
            self.no_match_rule = m.get('no_match_rule')
        if m.get('pricing_mode') is not None:
            self.pricing_mode = m.get('pricing_mode')
        if m.get('pricing_method') is not None:
            self.pricing_method = m.get('pricing_method')
        if m.get('ladder_interval_type') is not None:
            self.ladder_interval_type = m.get('ladder_interval_type')
        if m.get('parent_price_plan_id') is not None:
            self.parent_price_plan_id = m.get('parent_price_plan_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('creator') is not None:
            self.creator = m.get('creator')
        if m.get('modifier') is not None:
            self.modifier = m.get('modifier')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        if m.get('gmt_modified') is not None:
            self.gmt_modified = m.get('gmt_modified')
        if m.get('basis') is not None:
            self.basis = m.get('basis')
        if m.get('price_condition_codes') is not None:
            self.price_condition_codes = m.get('price_condition_codes')
        if m.get('price_safe_area') is not None:
            self.price_safe_area = m.get('price_safe_area')
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('bpms_process_id') is not None:
            self.bpms_process_id = m.get('bpms_process_id')
        if m.get('strategy') is not None:
            self.strategy = m.get('strategy')
        if m.get('price_stage') is not None:
            self.price_stage = m.get('price_stage')
        self.price_constraint_vo_list = []
        if m.get('price_constraint_vo_list') is not None:
            for k in m.get('price_constraint_vo_list'):
                temp_model = PriceConstraintVO()
                self.price_constraint_vo_list.append(temp_model.from_map(k))
        self.price_limit_strategy_dto = []
        if m.get('price_limit_strategy_dto') is not None:
            for k in m.get('price_limit_strategy_dto'):
                temp_model = PriceLimitStrategyDTO()
                self.price_limit_strategy_dto.append(temp_model.from_map(k))
        if m.get('sale_channel') is not None:
            self.sale_channel = m.get('sale_channel')
        if m.get('official_sell_discount') is not None:
            self.official_sell_discount = m.get('official_sell_discount')
        if m.get('customer_value_info') is not None:
            temp_model = CustomerValueDetail()
            self.customer_value_info = temp_model.from_map(m['customer_value_info'])
        if m.get('market_info') is not None:
            temp_model = MarketInfo()
            self.market_info = temp_model.from_map(m['market_info'])
        if m.get('cost_info') is not None:
            temp_model = CostInfo()
            self.cost_info = temp_model.from_map(m['cost_info'])
        return self


class ProductLine(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
        business_line_code: str = None,
        business_product: List[BusinessProduct] = None,
    ):
        # 溯源产品
        self.code = code
        # 产品线名称
        self.name = name
        # 业务产品线code
        self.business_line_code = business_line_code
        # l3
        self.business_product = business_product

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.business_line_code, 'business_line_code')
        self.validate_required(self.business_product, 'business_product')
        if self.business_product:
            for k in self.business_product:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.business_line_code is not None:
            result['business_line_code'] = self.business_line_code
        result['business_product'] = []
        if self.business_product is not None:
            for k in self.business_product:
                result['business_product'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('business_line_code') is not None:
            self.business_line_code = m.get('business_line_code')
        self.business_product = []
        if m.get('business_product') is not None:
            for k in m.get('business_product'):
                temp_model = BusinessProduct()
                self.business_product.append(temp_model.from_map(k))
        return self


class PriceObjectFee(TeaModel):
    def __init__(
        self,
        price_object_code: str = None,
        price_object_name: str = None,
        price: str = None,
        price_type: str = None,
        settle_type: str = None,
        currency: str = None,
        price_plan_vo: PricePlanVO = None,
        price_constraint_vo: PriceConstraintVO = None,
        extends_map: str = None,
        bd_price: str = None,
        cost_price: str = None,
    ):
        # 收费项CODE
        self.price_object_code = price_object_code
        # 收费项名称
        self.price_object_name = price_object_name
        # 高精度价格12位
        self.price = price
        # 价格类型，标准价格，一客一价
        self.price_type = price_type
        # 结算信息
        self.settle_type = settle_type
        # 币种
        self.currency = currency
        # 命中的定价计划
        self.price_plan_vo = price_plan_vo
        # 命中的定价计划约束
        self.price_constraint_vo = price_constraint_vo
        # 扩展信息
        self.extends_map = extends_map
        # BD销售价格区间
        self.bd_price = bd_price
        # 最低成本价
        self.cost_price = cost_price

    def validate(self):
        if self.price_plan_vo:
            self.price_plan_vo.validate()
        if self.price_constraint_vo:
            self.price_constraint_vo.validate()

    def to_map(self):
        result = dict()
        if self.price_object_code is not None:
            result['price_object_code'] = self.price_object_code
        if self.price_object_name is not None:
            result['price_object_name'] = self.price_object_name
        if self.price is not None:
            result['price'] = self.price
        if self.price_type is not None:
            result['price_type'] = self.price_type
        if self.settle_type is not None:
            result['settle_type'] = self.settle_type
        if self.currency is not None:
            result['currency'] = self.currency
        if self.price_plan_vo is not None:
            result['price_plan_vo'] = self.price_plan_vo.to_map()
        if self.price_constraint_vo is not None:
            result['price_constraint_vo'] = self.price_constraint_vo.to_map()
        if self.extends_map is not None:
            result['extends_map'] = self.extends_map
        if self.bd_price is not None:
            result['bd_price'] = self.bd_price
        if self.cost_price is not None:
            result['cost_price'] = self.cost_price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('price_object_code') is not None:
            self.price_object_code = m.get('price_object_code')
        if m.get('price_object_name') is not None:
            self.price_object_name = m.get('price_object_name')
        if m.get('price') is not None:
            self.price = m.get('price')
        if m.get('price_type') is not None:
            self.price_type = m.get('price_type')
        if m.get('settle_type') is not None:
            self.settle_type = m.get('settle_type')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('price_plan_vo') is not None:
            temp_model = PricePlanVO()
            self.price_plan_vo = temp_model.from_map(m['price_plan_vo'])
        if m.get('price_constraint_vo') is not None:
            temp_model = PriceConstraintVO()
            self.price_constraint_vo = temp_model.from_map(m['price_constraint_vo'])
        if m.get('extends_map') is not None:
            self.extends_map = m.get('extends_map')
        if m.get('bd_price') is not None:
            self.bd_price = m.get('bd_price')
        if m.get('cost_price') is not None:
            self.cost_price = m.get('cost_price')
        return self


class ProductBaseInfo(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
        name_en: str = None,
        short_code: str = None,
    ):
        # 产品码，系统内部识别
        self.code = code
        # 产品名称
        self.name = name
        # 产品英文名称
        self.name_en = name_en
        # 产品短码，管理维度识别
        self.short_code = short_code

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.short_code, 'short_code')

    def to_map(self):
        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.name_en is not None:
            result['name_en'] = self.name_en
        if self.short_code is not None:
            result['short_code'] = self.short_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('name_en') is not None:
            self.name_en = m.get('name_en')
        if m.get('short_code') is not None:
            self.short_code = m.get('short_code')
        return self


class BusinessLine(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
        product_line: List[ProductLine] = None,
    ):
        # 产品线code
        self.code = code
        # 1级产品线name
        self.name = name
        # L2
        self.product_line = product_line

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.product_line, 'product_line')
        if self.product_line:
            for k in self.product_line:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        result['product_line'] = []
        if self.product_line is not None:
            for k in self.product_line:
                result['product_line'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        self.product_line = []
        if m.get('product_line') is not None:
            for k in m.get('product_line'):
                temp_model = ProductLine()
                self.product_line.append(temp_model.from_map(k))
        return self


class CustomerValueInfo(TeaModel):
    def __init__(
        self,
        customer_value_details: List[CustomerValueDetail] = None,
    ):
        # 客户价价值法信息
        self.customer_value_details = customer_value_details

    def validate(self):
        if self.customer_value_details:
            for k in self.customer_value_details:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        result['customer_value_details'] = []
        if self.customer_value_details is not None:
            for k in self.customer_value_details:
                result['customer_value_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.customer_value_details = []
        if m.get('customer_value_details') is not None:
            for k in m.get('customer_value_details'):
                temp_model = CustomerValueDetail()
                self.customer_value_details.append(temp_model.from_map(k))
        return self


class InquiryPriceResponse(TeaModel):
    def __init__(
        self,
        price: str = None,
        currency: str = None,
        bd_price: str = None,
        cost_price: str = None,
        price_object_fee_list: List[PriceObjectFee] = None,
    ):
        # 高精度12位价格
        self.price = price
        # 币种
        self.currency = currency
        # BD销售价格(高精度12位)
        self.bd_price = bd_price
        # 最低成本价(高精度12位)
        self.cost_price = cost_price
        # 收费项结果明细列表
        self.price_object_fee_list = price_object_fee_list

    def validate(self):
        if self.price_object_fee_list:
            for k in self.price_object_fee_list:
                if k:
                    k.validate()

    def to_map(self):
        result = dict()
        if self.price is not None:
            result['price'] = self.price
        if self.currency is not None:
            result['currency'] = self.currency
        if self.bd_price is not None:
            result['bd_price'] = self.bd_price
        if self.cost_price is not None:
            result['cost_price'] = self.cost_price
        result['price_object_fee_list'] = []
        if self.price_object_fee_list is not None:
            for k in self.price_object_fee_list:
                result['price_object_fee_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('price') is not None:
            self.price = m.get('price')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('bd_price') is not None:
            self.bd_price = m.get('bd_price')
        if m.get('cost_price') is not None:
            self.cost_price = m.get('cost_price')
        self.price_object_fee_list = []
        if m.get('price_object_fee_list') is not None:
            for k in m.get('price_object_fee_list'):
                temp_model = PriceObjectFee()
                self.price_object_fee_list.append(temp_model.from_map(k))
        return self


class Commodity(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
        status: str = None,
    ):
        # 商品编码
        self.code = code
        # 商品名称
        self.name = name
        # 商品状态
        self.status = status

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.status, 'status')

    def to_map(self):
        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class QueryProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 产品码,可以为空
        self.code = code

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.code is not None:
            result['code'] = self.code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('code') is not None:
            self.code = m.get('code')
        return self


class QueryProductResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        product_array: List[ProductBaseInfo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 产品列表
        self.product_array = product_array

    def validate(self):
        if self.product_array:
            for k in self.product_array:
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
        result['product_array'] = []
        if self.product_array is not None:
            for k in self.product_array:
                result['product_array'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.product_array = []
        if m.get('product_array') is not None:
            for k in m.get('product_array'):
                temp_model = ProductBaseInfo()
                self.product_array.append(temp_model.from_map(k))
        return self


class ExportCommodityConfigRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        commodity_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商品编码
        self.commodity_code = commodity_code

    def validate(self):
        self.validate_required(self.commodity_code, 'commodity_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        return self


class ExportCommodityConfigResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        config: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 导出的商品配置数据
        self.config = config

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
        if self.config is not None:
            result['config'] = self.config
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('config') is not None:
            self.config = m.get('config')
        return self


class PagequeryCommodityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_code: str = None,
        status: str = None,
        page_no: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 业务产品编码
        self.product_code = product_code
        # 商品状态
        self.status = status
        # 页数，不填则默认1
        self.page_no = page_no
        # 每页页数，不填则默认20
        self.page_size = page_size

    def validate(self):
        pass

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.status is not None:
            result['status'] = self.status
        if self.page_no is not None:
            result['page_no'] = self.page_no
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class PagequeryCommodityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        commodities: List[Commodity] = None,
        total_count: int = None,
        page_no: int = None,
        page_size: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品列表
        self.commodities = commodities
        # 商品总数
        self.total_count = total_count
        # 当前页数
        self.page_no = page_no
        # 每页页数
        self.page_size = page_size

    def validate(self):
        if self.commodities:
            for k in self.commodities:
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
        result['commodities'] = []
        if self.commodities is not None:
            for k in self.commodities:
                result['commodities'].append(k.to_map() if k else None)
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.page_no is not None:
            result['page_no'] = self.page_no
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
        self.commodities = []
        if m.get('commodities') is not None:
            for k in m.get('commodities'):
                temp_model = Commodity()
                self.commodities.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class ImportProductRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        biz_no: str = None,
        business_line: str = None,
        product_line: str = None,
        name: str = None,
        description: str = None,
        pds: List[str] = None,
        pd_leaders: List[str] = None,
        dev_leaders: List[str] = None,
        devs: List[str] = None,
        operator: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 幂等编码，需要唯一
        self.biz_no = biz_no
        # 所属业务线
        self.business_line = business_line
        # 所属产品线
        self.product_line = product_line
        # 产品名称
        self.name = name
        # 产品描述
        self.description = description
        # pd
        self.pds = pds
        # pd负责人
        self.pd_leaders = pd_leaders
        # 研发负责人
        self.dev_leaders = dev_leaders
        # 研发人员
        self.devs = devs
        # 操作人
        self.operator = operator

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.business_line, 'business_line')
        self.validate_required(self.product_line, 'product_line')
        self.validate_required(self.name, 'name')
        self.validate_required(self.description, 'description')
        self.validate_required(self.pds, 'pds')
        self.validate_required(self.pd_leaders, 'pd_leaders')
        self.validate_required(self.dev_leaders, 'dev_leaders')
        self.validate_required(self.operator, 'operator')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.business_line is not None:
            result['business_line'] = self.business_line
        if self.product_line is not None:
            result['product_line'] = self.product_line
        if self.name is not None:
            result['name'] = self.name
        if self.description is not None:
            result['description'] = self.description
        if self.pds is not None:
            result['pds'] = self.pds
        if self.pd_leaders is not None:
            result['pd_leaders'] = self.pd_leaders
        if self.dev_leaders is not None:
            result['dev_leaders'] = self.dev_leaders
        if self.devs is not None:
            result['devs'] = self.devs
        if self.operator is not None:
            result['operator'] = self.operator
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('business_line') is not None:
            self.business_line = m.get('business_line')
        if m.get('product_line') is not None:
            self.product_line = m.get('product_line')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('pds') is not None:
            self.pds = m.get('pds')
        if m.get('pd_leaders') is not None:
            self.pd_leaders = m.get('pd_leaders')
        if m.get('dev_leaders') is not None:
            self.dev_leaders = m.get('dev_leaders')
        if m.get('devs') is not None:
            self.devs = m.get('devs')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        return self


class ImportProductResponse(TeaModel):
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


class QueryCommodityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        keyword: str = None,
        limit: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 关键词，模糊查询商品名称、商品code、商品格式化编码
        self.keyword = keyword
        # 搜索返回条数限制
        self.limit = limit

    def validate(self):
        self.validate_required(self.keyword, 'keyword')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.keyword is not None:
            result['keyword'] = self.keyword
        if self.limit is not None:
            result['limit'] = self.limit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('keyword') is not None:
            self.keyword = m.get('keyword')
        if m.get('limit') is not None:
            self.limit = m.get('limit')
        return self


class QueryCommodityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        commoditys: List[Commodity] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品列表
        self.commoditys = commoditys

    def validate(self):
        if self.commoditys:
            for k in self.commoditys:
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
        result['commoditys'] = []
        if self.commoditys is not None:
            for k in self.commoditys:
                result['commoditys'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.commoditys = []
        if m.get('commoditys') is not None:
            for k in m.get('commoditys'):
                temp_model = Commodity()
                self.commoditys.append(temp_model.from_map(k))
        return self


class BindCommodityAccessRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        commodity_code: str = None,
        access_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商品编码
        self.commodity_code = commodity_code
        # 服务接入码
        self.access_code = access_code

    def validate(self):
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.access_code, 'access_code')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.access_code is not None:
            result['access_code'] = self.access_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('access_code') is not None:
            self.access_code = m.get('access_code')
        return self


class BindCommodityAccessResponse(TeaModel):
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


class QueryProductLineRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        need_product: bool = None,
        need_sku: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 是否查询l3级产品
        self.need_product = need_product
        # 是否查询l5
        self.need_sku = need_sku

    def validate(self):
        self.validate_required(self.need_product, 'need_product')
        self.validate_required(self.need_sku, 'need_sku')

    def to_map(self):
        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.need_product is not None:
            result['need_product'] = self.need_product
        if self.need_sku is not None:
            result['need_sku'] = self.need_sku
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('need_product') is not None:
            self.need_product = m.get('need_product')
        if m.get('need_sku') is not None:
            self.need_sku = m.get('need_sku')
        return self


class QueryProductLineResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        product_tree: List[BusinessLine] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 产品树JSON字符串
        self.product_tree = product_tree

    def validate(self):
        if self.product_tree:
            for k in self.product_tree:
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
        result['product_tree'] = []
        if self.product_tree is not None:
            for k in self.product_tree:
                result['product_tree'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.product_tree = []
        if m.get('product_tree') is not None:
            for k in m.get('product_tree'):
                temp_model = BusinessLine()
                self.product_tree.append(temp_model.from_map(k))
        return self


