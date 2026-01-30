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


class PriceConditionAttr(TeaModel):
    def __init__(
        self,
        attr_code: str = None,
        attr_value_code: str = None,
        attr_value_name: str = None,
        operator: str = None,
    ):
        # 属性code
        self.attr_code = attr_code
        # 属性值code
        self.attr_value_code = attr_value_code
        # 属性值名称
        self.attr_value_name = attr_value_name
        # 运算符，只有在约束条件中会出现
        self.operator = operator

    def validate(self):
        self.validate_required(self.attr_code, 'attr_code')
        self.validate_required(self.attr_value_code, 'attr_value_code')
        self.validate_required(self.attr_value_name, 'attr_value_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.attr_code is not None:
            result['attr_code'] = self.attr_code
        if self.attr_value_code is not None:
            result['attr_value_code'] = self.attr_value_code
        if self.attr_value_name is not None:
            result['attr_value_name'] = self.attr_value_name
        if self.operator is not None:
            result['operator'] = self.operator
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('attr_code') is not None:
            self.attr_code = m.get('attr_code')
        if m.get('attr_value_code') is not None:
            self.attr_value_code = m.get('attr_value_code')
        if m.get('attr_value_name') is not None:
            self.attr_value_name = m.get('attr_value_name')
        if m.get('operator') is not None:
            self.operator = m.get('operator')
        return self


class CommodityAttribute(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
        default_value: str = None,
        value_type: str = None,
        value_range: str = None,
        display_type: str = None,
        tips: str = None,
        unit: str = None,
    ):
        # 属性编码
        self.code = code
        # 属性名
        self.name = name
        # 默认值
        self.default_value = default_value
        # 属性值类型，离散值：DISCRETE，数值：NUMBER
        self.value_type = value_type
        # 当是离散值类型时，为多个离散值逗号分隔
        # 当是数值类型时，为JSON，结构为{"rangeType":"open", "min":1, "max": 100, "step:1}
        self.value_range = value_range
        # 展示类型
        self.display_type = display_type
        # 提示文案
        self.tips = tips
        # 单位
        self.unit = unit

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.default_value, 'default_value')
        self.validate_required(self.value_type, 'value_type')
        self.validate_required(self.value_range, 'value_range')
        self.validate_required(self.display_type, 'display_type')
        self.validate_required(self.tips, 'tips')
        self.validate_required(self.unit, 'unit')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.default_value is not None:
            result['default_value'] = self.default_value
        if self.value_type is not None:
            result['value_type'] = self.value_type
        if self.value_range is not None:
            result['value_range'] = self.value_range
        if self.display_type is not None:
            result['display_type'] = self.display_type
        if self.tips is not None:
            result['tips'] = self.tips
        if self.unit is not None:
            result['unit'] = self.unit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('default_value') is not None:
            self.default_value = m.get('default_value')
        if m.get('value_type') is not None:
            self.value_type = m.get('value_type')
        if m.get('value_range') is not None:
            self.value_range = m.get('value_range')
        if m.get('display_type') is not None:
            self.display_type = m.get('display_type')
        if m.get('tips') is not None:
            self.tips = m.get('tips')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        return self


class NoExtendPrice(TeaModel):
    def __init__(
        self,
        condition_attrs: List[PriceConditionAttr] = None,
        ladder_start: str = None,
        ladder_end: str = None,
        price: str = None,
        pricing_method: str = None,
        ladder_interval_type: str = None,
        price_object_code: str = None,
        pricing_mode: str = None,
        unit: str = None,
        ladder_price_fixed: bool = None,
    ):
        # 定价条件
        self.condition_attrs = condition_attrs
        # 阶梯开始
        self.ladder_start = ladder_start
        # 阶梯结束
        self.ladder_end = ladder_end
        # 签约价
        self.price = price
        # 计价方法：具体公式、阶梯方法、自定义
        self.pricing_method = pricing_method
        # 阶梯区间类型，左开右闭/左闭右开
        self.ladder_interval_type = ladder_interval_type
        # 定价对象code
        self.price_object_code = price_object_code
        # 计价模式：公式、阶梯、自定义
        self.pricing_mode = pricing_mode
        # 价格单位
        self.unit = unit
        # 是否阶梯总价
        self.ladder_price_fixed = ladder_price_fixed

    def validate(self):
        if self.condition_attrs:
            for k in self.condition_attrs:
                if k:
                    k.validate()
        self.validate_required(self.ladder_start, 'ladder_start')
        self.validate_required(self.ladder_end, 'ladder_end')
        self.validate_required(self.price, 'price')
        self.validate_required(self.pricing_method, 'pricing_method')
        self.validate_required(self.ladder_interval_type, 'ladder_interval_type')
        self.validate_required(self.price_object_code, 'price_object_code')
        self.validate_required(self.pricing_mode, 'pricing_mode')
        self.validate_required(self.unit, 'unit')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['condition_attrs'] = []
        if self.condition_attrs is not None:
            for k in self.condition_attrs:
                result['condition_attrs'].append(k.to_map() if k else None)
        if self.ladder_start is not None:
            result['ladder_start'] = self.ladder_start
        if self.ladder_end is not None:
            result['ladder_end'] = self.ladder_end
        if self.price is not None:
            result['price'] = self.price
        if self.pricing_method is not None:
            result['pricing_method'] = self.pricing_method
        if self.ladder_interval_type is not None:
            result['ladder_interval_type'] = self.ladder_interval_type
        if self.price_object_code is not None:
            result['price_object_code'] = self.price_object_code
        if self.pricing_mode is not None:
            result['pricing_mode'] = self.pricing_mode
        if self.unit is not None:
            result['unit'] = self.unit
        if self.ladder_price_fixed is not None:
            result['ladder_price_fixed'] = self.ladder_price_fixed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.condition_attrs = []
        if m.get('condition_attrs') is not None:
            for k in m.get('condition_attrs'):
                temp_model = PriceConditionAttr()
                self.condition_attrs.append(temp_model.from_map(k))
        if m.get('ladder_start') is not None:
            self.ladder_start = m.get('ladder_start')
        if m.get('ladder_end') is not None:
            self.ladder_end = m.get('ladder_end')
        if m.get('price') is not None:
            self.price = m.get('price')
        if m.get('pricing_method') is not None:
            self.pricing_method = m.get('pricing_method')
        if m.get('ladder_interval_type') is not None:
            self.ladder_interval_type = m.get('ladder_interval_type')
        if m.get('price_object_code') is not None:
            self.price_object_code = m.get('price_object_code')
        if m.get('pricing_mode') is not None:
            self.pricing_mode = m.get('pricing_mode')
        if m.get('unit') is not None:
            self.unit = m.get('unit')
        if m.get('ladder_price_fixed') is not None:
            self.ladder_price_fixed = m.get('ladder_price_fixed')
        return self


class OrderDuration(TeaModel):
    def __init__(
        self,
        duration_type: str = None,
        duration_value: int = None,
    ):
        # 周期类型，YEAR：年；MONTH：月；DAY：日
        self.duration_type = duration_type
        # 订购周期值
        self.duration_value = duration_value

    def validate(self):
        self.validate_required(self.duration_type, 'duration_type')
        self.validate_required(self.duration_value, 'duration_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.duration_type is not None:
            result['duration_type'] = self.duration_type
        if self.duration_value is not None:
            result['duration_value'] = self.duration_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('duration_type') is not None:
            self.duration_type = m.get('duration_type')
        if m.get('duration_value') is not None:
            self.duration_value = m.get('duration_value')
        return self


class PostPayPrice(TeaModel):
    def __init__(
        self,
        currency_value: str = None,
        duration: OrderDuration = None,
        no_extend_prices: List[NoExtendPrice] = None,
    ):
        # 币种单位值，156（CNY)
        self.currency_value = currency_value
        # 价格周期
        self.duration = duration
        # 非继承型一客一价
        self.no_extend_prices = no_extend_prices

    def validate(self):
        if self.duration:
            self.duration.validate()
        if self.no_extend_prices:
            for k in self.no_extend_prices:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.currency_value is not None:
            result['currency_value'] = self.currency_value
        if self.duration is not None:
            result['duration'] = self.duration.to_map()
        result['no_extend_prices'] = []
        if self.no_extend_prices is not None:
            for k in self.no_extend_prices:
                result['no_extend_prices'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('currency_value') is not None:
            self.currency_value = m.get('currency_value')
        if m.get('duration') is not None:
            temp_model = OrderDuration()
            self.duration = temp_model.from_map(m['duration'])
        self.no_extend_prices = []
        if m.get('no_extend_prices') is not None:
            for k in m.get('no_extend_prices'):
                temp_model = NoExtendPrice()
                self.no_extend_prices.append(temp_model.from_map(k))
        return self


class CommodityOrderAttribute(TeaModel):
    def __init__(
        self,
        code: str = None,
        value: str = None,
        value_unit: str = None,
    ):
        # 属性编码
        self.code = code
        # 属性值
        self.value = value
        # 属性值单位，部分数值型属性有多种单位，需要填入；其他情况不需要填
        self.value_unit = value_unit

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.value, 'value')
        self.validate_required(self.value_unit, 'value_unit')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.value is not None:
            result['value'] = self.value
        if self.value_unit is not None:
            result['value_unit'] = self.value_unit
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('value') is not None:
            self.value = m.get('value')
        if m.get('value_unit') is not None:
            self.value_unit = m.get('value_unit')
        return self


class PrepayAmount(TeaModel):
    def __init__(
        self,
        amount: str = None,
        currency: str = None,
    ):
        # 指定预付费金额
        self.amount = amount
        # 币种单位，CNY\USD等标准币种单位编码
        self.currency = currency

    def validate(self):
        self.validate_required(self.amount, 'amount')
        self.validate_required(self.currency, 'currency')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.amount is not None:
            result['amount'] = self.amount
        if self.currency is not None:
            result['currency'] = self.currency
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        return self


class FulfillmentOptions(TeaModel):
    def __init__(
        self,
        deplay: bool = None,
        start_time: str = None,
        spi_skip: bool = None,
    ):
        # 是否延迟履约，默认false
        self.deplay = deplay
        # 实际履约开始时间，默认支付完成时间；只有deplay=true时，start_time才生效
        self.start_time = start_time
        # 跳过SPI回调，默认false，优先级高于商品上默认的接入属性
        self.spi_skip = spi_skip

    def validate(self):
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.deplay is not None:
            result['deplay'] = self.deplay
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.spi_skip is not None:
            result['spi_skip'] = self.spi_skip
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('deplay') is not None:
            self.deplay = m.get('deplay')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('spi_skip') is not None:
            self.spi_skip = m.get('spi_skip')
        return self


class ComboCommodityOrder(TeaModel):
    def __init__(
        self,
        commodity_code: str = None,
        status: str = None,
        instance_ids: List[str] = None,
    ):
        # 商品编码
        self.commodity_code = commodity_code
        # 状态
        self.status = status
        # 实例ID列表
        self.instance_ids = instance_ids

    def validate(self):
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.status, 'status')
        self.validate_required(self.instance_ids, 'instance_ids')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.status is not None:
            result['status'] = self.status
        if self.instance_ids is not None:
            result['instance_ids'] = self.instance_ids
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('instance_ids') is not None:
            self.instance_ids = m.get('instance_ids')
        return self


class ComboCommodity(TeaModel):
    def __init__(
        self,
        name: str = None,
        unique_code: str = None,
        inner_code: str = None,
        type: str = None,
        charge_type: str = None,
        attrs: List[CommodityAttribute] = None,
        quantity: int = None,
        extends_config: str = None,
    ):
        # 商品名称
        self.name = name
        # 商品在套餐中的唯一编码，当一个套餐中存在两个一样的商品时，编码会不一样
        self.unique_code = unique_code
        # 商品主数据编码
        self.inner_code = inner_code
        # 商品类型，资源包：attach
        self.type = type
        # 付费方式，预付：PREPAY，按量付费：POSTPAY
        self.charge_type = charge_type
        # 销售属性列表
        self.attrs = attrs
        # 商品数量
        self.quantity = quantity
        # 扩展信息，JSON结构，包含标签、个性化配置等数据
        self.extends_config = extends_config

    def validate(self):
        self.validate_required(self.name, 'name')
        self.validate_required(self.unique_code, 'unique_code')
        self.validate_required(self.inner_code, 'inner_code')
        self.validate_required(self.type, 'type')
        self.validate_required(self.charge_type, 'charge_type')
        self.validate_required(self.attrs, 'attrs')
        if self.attrs:
            for k in self.attrs:
                if k:
                    k.validate()
        self.validate_required(self.quantity, 'quantity')
        self.validate_required(self.extends_config, 'extends_config')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.name is not None:
            result['name'] = self.name
        if self.unique_code is not None:
            result['unique_code'] = self.unique_code
        if self.inner_code is not None:
            result['inner_code'] = self.inner_code
        if self.type is not None:
            result['type'] = self.type
        if self.charge_type is not None:
            result['charge_type'] = self.charge_type
        result['attrs'] = []
        if self.attrs is not None:
            for k in self.attrs:
                result['attrs'].append(k.to_map() if k else None)
        if self.quantity is not None:
            result['quantity'] = self.quantity
        if self.extends_config is not None:
            result['extends_config'] = self.extends_config
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('unique_code') is not None:
            self.unique_code = m.get('unique_code')
        if m.get('inner_code') is not None:
            self.inner_code = m.get('inner_code')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('charge_type') is not None:
            self.charge_type = m.get('charge_type')
        self.attrs = []
        if m.get('attrs') is not None:
            for k in m.get('attrs'):
                temp_model = CommodityAttribute()
                self.attrs.append(temp_model.from_map(k))
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        if m.get('extends_config') is not None:
            self.extends_config = m.get('extends_config')
        return self


class PayOptions(TeaModel):
    def __init__(
        self,
        pay_channel: str = None,
        payment_method: str = None,
    ):
        # 系统自动会根据账号类型、当前OU进行付费渠道判定；如果传入的付款渠道不满足，则报错
        self.pay_channel = pay_channel
        # 支付方式，例如：直付通
        self.payment_method = payment_method

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pay_channel is not None:
            result['pay_channel'] = self.pay_channel
        if self.payment_method is not None:
            result['payment_method'] = self.payment_method
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pay_channel') is not None:
            self.pay_channel = m.get('pay_channel')
        if m.get('payment_method') is not None:
            self.payment_method = m.get('payment_method')
        return self


class ProvisionOption(TeaModel):
    def __init__(
        self,
        order_start_time: str = None,
    ):
        # 订单开始时间 (ISO 8601 UTC)，可自定义覆盖默认值
        self.order_start_time = order_start_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_start_time is not None:
            result['order_start_time'] = self.order_start_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_start_time') is not None:
            self.order_start_time = m.get('order_start_time')
        return self


class InstanceCapacity(TeaModel):
    def __init__(
        self,
        instance_id: str = None,
        current_capacity: str = None,
        initial_capacity: str = None,
        start_time: str = None,
        end_time: str = None,
        status: str = None,
        commodity_code: str = None,
        rel_postpay_commodity: str = None,
    ):
        # 实例ID
        self.instance_id = instance_id
        # 当前剩余容量
        self.current_capacity = current_capacity
        # 初始容量
        self.initial_capacity = initial_capacity
        # 起始时间
        self.start_time = start_time
        # 截止时间
        self.end_time = end_time
        # Valid：有效；Closed：已用完；Expired:已到期
        self.status = status
        # 资源包对应商品码
        self.commodity_code = commodity_code
        # 关联按量商品码
        self.rel_postpay_commodity = rel_postpay_commodity

    def validate(self):
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.current_capacity, 'current_capacity')
        self.validate_required(self.initial_capacity, 'initial_capacity')
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.status, 'status')
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.rel_postpay_commodity, 'rel_postpay_commodity')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.current_capacity is not None:
            result['current_capacity'] = self.current_capacity
        if self.initial_capacity is not None:
            result['initial_capacity'] = self.initial_capacity
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.status is not None:
            result['status'] = self.status
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.rel_postpay_commodity is not None:
            result['rel_postpay_commodity'] = self.rel_postpay_commodity
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('current_capacity') is not None:
            self.current_capacity = m.get('current_capacity')
        if m.get('initial_capacity') is not None:
            self.initial_capacity = m.get('initial_capacity')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('rel_postpay_commodity') is not None:
            self.rel_postpay_commodity = m.get('rel_postpay_commodity')
        return self


class CommoditySyncCommonBuyInfo(TeaModel):
    def __init__(
        self,
        common_buy_sale_group_list_json: List[str] = None,
        offer_attr_list_json: List[str] = None,
        prod_offer_region_list_json: List[str] = None,
        offer_attr_group_list_json: List[str] = None,
        offer_extend_attr_list_json: List[str] = None,
        offer_common_buy_group_list_json: List[str] = None,
        offer_attr_constraints_list_fson: List[str] = None,
        offer_rule_group_list_json: List[str] = None,
    ):
        # 商品列表配置 ListJson字符串
        self.common_buy_sale_group_list_json = common_buy_sale_group_list_json
        # 规格配置 ListJson字符串
        self.offer_attr_list_json = offer_attr_list_json
        # Region配置 ListJson字符串
        self.prod_offer_region_list_json = prod_offer_region_list_json
        # 费用项配置 ListJson字符串
        self.offer_attr_group_list_json = offer_attr_group_list_json
        # 属性配置 ListJson字符串
        self.offer_extend_attr_list_json = offer_extend_attr_list_json
        # 界面归类配置 ListJson字符串
        self.offer_common_buy_group_list_json = offer_common_buy_group_list_json
        # 规格约束配置 ListJson字符串
        self.offer_attr_constraints_list_fson = offer_attr_constraints_list_fson
        # 售卖规则配置 ListJson字符串
        self.offer_rule_group_list_json = offer_rule_group_list_json

    def validate(self):
        self.validate_required(self.common_buy_sale_group_list_json, 'common_buy_sale_group_list_json')
        self.validate_required(self.offer_attr_list_json, 'offer_attr_list_json')
        self.validate_required(self.prod_offer_region_list_json, 'prod_offer_region_list_json')
        self.validate_required(self.offer_attr_group_list_json, 'offer_attr_group_list_json')
        self.validate_required(self.offer_extend_attr_list_json, 'offer_extend_attr_list_json')
        self.validate_required(self.offer_common_buy_group_list_json, 'offer_common_buy_group_list_json')
        self.validate_required(self.offer_attr_constraints_list_fson, 'offer_attr_constraints_list_fson')
        self.validate_required(self.offer_rule_group_list_json, 'offer_rule_group_list_json')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.common_buy_sale_group_list_json is not None:
            result['common_buy_sale_group_list_json'] = self.common_buy_sale_group_list_json
        if self.offer_attr_list_json is not None:
            result['offer_attr_list_json'] = self.offer_attr_list_json
        if self.prod_offer_region_list_json is not None:
            result['prod_offer_region_list_json'] = self.prod_offer_region_list_json
        if self.offer_attr_group_list_json is not None:
            result['offer_attr_group_list_json'] = self.offer_attr_group_list_json
        if self.offer_extend_attr_list_json is not None:
            result['offer_extend_attr_list_json'] = self.offer_extend_attr_list_json
        if self.offer_common_buy_group_list_json is not None:
            result['offer_common_buy_group_list_json'] = self.offer_common_buy_group_list_json
        if self.offer_attr_constraints_list_fson is not None:
            result['offer_attr_constraints_list_fson'] = self.offer_attr_constraints_list_fson
        if self.offer_rule_group_list_json is not None:
            result['offer_rule_group_list_json'] = self.offer_rule_group_list_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('common_buy_sale_group_list_json') is not None:
            self.common_buy_sale_group_list_json = m.get('common_buy_sale_group_list_json')
        if m.get('offer_attr_list_json') is not None:
            self.offer_attr_list_json = m.get('offer_attr_list_json')
        if m.get('prod_offer_region_list_json') is not None:
            self.prod_offer_region_list_json = m.get('prod_offer_region_list_json')
        if m.get('offer_attr_group_list_json') is not None:
            self.offer_attr_group_list_json = m.get('offer_attr_group_list_json')
        if m.get('offer_extend_attr_list_json') is not None:
            self.offer_extend_attr_list_json = m.get('offer_extend_attr_list_json')
        if m.get('offer_common_buy_group_list_json') is not None:
            self.offer_common_buy_group_list_json = m.get('offer_common_buy_group_list_json')
        if m.get('offer_attr_constraints_list_fson') is not None:
            self.offer_attr_constraints_list_fson = m.get('offer_attr_constraints_list_fson')
        if m.get('offer_rule_group_list_json') is not None:
            self.offer_rule_group_list_json = m.get('offer_rule_group_list_json')
        return self


class CommodityInstance(TeaModel):
    def __init__(
        self,
        biz_no: str = None,
        commodity_code: str = None,
        ou: str = None,
        order_type: str = None,
        duration: OrderDuration = None,
        coupon_id: str = None,
        quantity: int = None,
        commodity_attrs: List[CommodityOrderAttribute] = None,
        fulfillment_options: FulfillmentOptions = None,
        instance_id: str = None,
        prepay_amount: PrepayAmount = None,
        post_pay_price: PostPayPrice = None,
    ):
        # 订单号
        self.biz_no = biz_no
        # 商品编码
        self.commodity_code = commodity_code
        # 销售主体，不传默认ZL6
        self.ou = ou
        # 订单类型，NEW：新购；RENEW：续费； MODIFY：变配 不填默认新购
        self.order_type = order_type
        # 订购时长
        self.duration = duration
        # 优惠券ID
        self.coupon_id = coupon_id
        # 数量，不填默认1
        self.quantity = quantity
        # 
        # 商品订购属性，开通型商品部需要填写
        self.commodity_attrs = commodity_attrs
        # 履约选项
        self.fulfillment_options = fulfillment_options
        # 实例ID，续费/变配场景必传
        self.instance_id = instance_id
        # 预付费订单金额。仅白名单商品且batchBizNo是合法的合同ID的情况，才允许指定预付订单金额
        self.prepay_amount = prepay_amount
        # 后付商品签约价，用于在履约阶段生成一客一价
        self.post_pay_price = post_pay_price

    def validate(self):
        self.validate_required(self.commodity_code, 'commodity_code')
        if self.duration:
            self.duration.validate()
        if self.commodity_attrs:
            for k in self.commodity_attrs:
                if k:
                    k.validate()
        if self.fulfillment_options:
            self.fulfillment_options.validate()
        if self.prepay_amount:
            self.prepay_amount.validate()
        if self.post_pay_price:
            self.post_pay_price.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.ou is not None:
            result['ou'] = self.ou
        if self.order_type is not None:
            result['order_type'] = self.order_type
        if self.duration is not None:
            result['duration'] = self.duration.to_map()
        if self.coupon_id is not None:
            result['coupon_id'] = self.coupon_id
        if self.quantity is not None:
            result['quantity'] = self.quantity
        result['commodity_attrs'] = []
        if self.commodity_attrs is not None:
            for k in self.commodity_attrs:
                result['commodity_attrs'].append(k.to_map() if k else None)
        if self.fulfillment_options is not None:
            result['fulfillment_options'] = self.fulfillment_options.to_map()
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.prepay_amount is not None:
            result['prepay_amount'] = self.prepay_amount.to_map()
        if self.post_pay_price is not None:
            result['post_pay_price'] = self.post_pay_price.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('ou') is not None:
            self.ou = m.get('ou')
        if m.get('order_type') is not None:
            self.order_type = m.get('order_type')
        if m.get('duration') is not None:
            temp_model = OrderDuration()
            self.duration = temp_model.from_map(m['duration'])
        if m.get('coupon_id') is not None:
            self.coupon_id = m.get('coupon_id')
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        self.commodity_attrs = []
        if m.get('commodity_attrs') is not None:
            for k in m.get('commodity_attrs'):
                temp_model = CommodityOrderAttribute()
                self.commodity_attrs.append(temp_model.from_map(k))
        if m.get('fulfillment_options') is not None:
            temp_model = FulfillmentOptions()
            self.fulfillment_options = temp_model.from_map(m['fulfillment_options'])
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('prepay_amount') is not None:
            temp_model = PrepayAmount()
            self.prepay_amount = temp_model.from_map(m['prepay_amount'])
        if m.get('post_pay_price') is not None:
            temp_model = PostPayPrice()
            self.post_pay_price = temp_model.from_map(m['post_pay_price'])
        return self


class Coupon(TeaModel):
    def __init__(
        self,
        id: int = None,
        display_name: str = None,
        name: str = None,
        type: str = None,
        amount_in_cent: str = None,
        used_amount_in_cent: str = None,
        status: str = None,
        start_time: str = None,
        end_time: str = None,
        youhui_template_id: int = None,
        discount_rate: str = None,
        full_amount_in_cent: str = None,
        usage_count: int = None,
        used_count: int = None,
        product_list: str = None,
        order_type_list: str = None,
    ):
        # 优惠券ID
        # 
        self.id = id
        # 优惠券名称,前端展示
        # 
        self.display_name = display_name
        # 优惠券模板名称
        # 
        self.name = name
        # 优惠券类型，VOUCHER：抵用券;CERTAIN：满减券；DISCOUNT：折扣券
        # 
        self.type = type
        # 优惠券总金额，单位（分）。可使用金额需要根据 amount - usedAmount 得出
        # 
        self.amount_in_cent = amount_in_cent
        # 已使用金额，单位(分）
        # 
        self.used_amount_in_cent = used_amount_in_cent
        # 状态，AVAILABLE-有效/EXPIRED-已过期/EXHAUSTED-已用完/ABANDONED-已作废
        # 
        self.status = status
        # 有效期开始时间
        # 
        self.start_time = start_time
        # 有效期结束时间
        # 
        self.end_time = end_time
        # 模板id
        # 
        self.youhui_template_id = youhui_template_id
        # 优惠券=折扣券时使用，如0.75
        # 
        self.discount_rate = discount_rate
        # 优惠券类型=满减券时使用，如满200000分
        # 
        self.full_amount_in_cent = full_amount_in_cent
        # 可以使用的总次数
        # 
        self.usage_count = usage_count
        # 已使用次数（冻结次数）
        # 
        self.used_count = used_count
        # 适用产品：通用/ECS/RDS
        self.product_list = product_list
        # 适用订单类型
        # 
        self.order_type_list = order_type_list

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.display_name, 'display_name')
        self.validate_required(self.name, 'name')
        self.validate_required(self.type, 'type')
        self.validate_required(self.status, 'status')
        self.validate_required(self.start_time, 'start_time')
        if self.start_time is not None:
            self.validate_pattern(self.start_time, 'start_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.end_time, 'end_time')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.youhui_template_id, 'youhui_template_id')
        self.validate_required(self.usage_count, 'usage_count')
        self.validate_required(self.used_count, 'used_count')
        self.validate_required(self.product_list, 'product_list')
        self.validate_required(self.order_type_list, 'order_type_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.display_name is not None:
            result['display_name'] = self.display_name
        if self.name is not None:
            result['name'] = self.name
        if self.type is not None:
            result['type'] = self.type
        if self.amount_in_cent is not None:
            result['amount_in_cent'] = self.amount_in_cent
        if self.used_amount_in_cent is not None:
            result['used_amount_in_cent'] = self.used_amount_in_cent
        if self.status is not None:
            result['status'] = self.status
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.youhui_template_id is not None:
            result['youhui_template_id'] = self.youhui_template_id
        if self.discount_rate is not None:
            result['discount_rate'] = self.discount_rate
        if self.full_amount_in_cent is not None:
            result['full_amount_in_cent'] = self.full_amount_in_cent
        if self.usage_count is not None:
            result['usage_count'] = self.usage_count
        if self.used_count is not None:
            result['used_count'] = self.used_count
        if self.product_list is not None:
            result['product_list'] = self.product_list
        if self.order_type_list is not None:
            result['order_type_list'] = self.order_type_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('amount_in_cent') is not None:
            self.amount_in_cent = m.get('amount_in_cent')
        if m.get('used_amount_in_cent') is not None:
            self.used_amount_in_cent = m.get('used_amount_in_cent')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('youhui_template_id') is not None:
            self.youhui_template_id = m.get('youhui_template_id')
        if m.get('discount_rate') is not None:
            self.discount_rate = m.get('discount_rate')
        if m.get('full_amount_in_cent') is not None:
            self.full_amount_in_cent = m.get('full_amount_in_cent')
        if m.get('usage_count') is not None:
            self.usage_count = m.get('usage_count')
        if m.get('used_count') is not None:
            self.used_count = m.get('used_count')
        if m.get('product_list') is not None:
            self.product_list = m.get('product_list')
        if m.get('order_type_list') is not None:
            self.order_type_list = m.get('order_type_list')
        return self


class ComboOrder(TeaModel):
    def __init__(
        self,
        tenant_id: str = None,
        biz_no: str = None,
        order_id: str = None,
        combo_code: str = None,
        combo_name: str = None,
        status: str = None,
        provision_status: str = None,
        original_amount: str = None,
        discount_amount: str = None,
        coupon_amount: str = None,
        pay_amount: str = None,
        gmt_create: str = None,
        commodity_orders: List[ComboCommodityOrder] = None,
        pay_time: str = None,
        pay_channel: str = None,
    ):
        # 租户ID
        self.tenant_id = tenant_id
        # 业务流水号
        self.biz_no = biz_no
        # 套餐订单号
        self.order_id = order_id
        # 套餐编码
        self.combo_code = combo_code
        # 套餐名称，下单时的套餐名称
        self.combo_name = combo_name
        # 订单状态，CREATED：创建；CANCEL：取消；PAYING：支付中；PAID：支付完成
        self.status = status
        # 履约生产状态，INCOMPLETE:未完成、COMPLETED:完成
        self.provision_status = provision_status
        # 订单原始金额
        self.original_amount = original_amount
        # 折扣金额
        self.discount_amount = discount_amount
        # 优惠金额
        self.coupon_amount = coupon_amount
        # 实付金额
        self.pay_amount = pay_amount
        # 下单时间
        self.gmt_create = gmt_create
        # 套餐内商品订单列表
        self.commodity_orders = commodity_orders
        # 支付完成时间
        self.pay_time = pay_time
        # 支付渠道
        self.pay_channel = pay_channel

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.combo_code, 'combo_code')
        self.validate_required(self.combo_name, 'combo_name')
        self.validate_required(self.status, 'status')
        self.validate_required(self.provision_status, 'provision_status')
        self.validate_required(self.original_amount, 'original_amount')
        self.validate_required(self.discount_amount, 'discount_amount')
        self.validate_required(self.coupon_amount, 'coupon_amount')
        self.validate_required(self.pay_amount, 'pay_amount')
        self.validate_required(self.gmt_create, 'gmt_create')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.commodity_orders, 'commodity_orders')
        if self.commodity_orders:
            for k in self.commodity_orders:
                if k:
                    k.validate()
        self.validate_required(self.pay_time, 'pay_time')
        if self.pay_time is not None:
            self.validate_pattern(self.pay_time, 'pay_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.pay_channel, 'pay_channel')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.combo_code is not None:
            result['combo_code'] = self.combo_code
        if self.combo_name is not None:
            result['combo_name'] = self.combo_name
        if self.status is not None:
            result['status'] = self.status
        if self.provision_status is not None:
            result['provision_status'] = self.provision_status
        if self.original_amount is not None:
            result['original_amount'] = self.original_amount
        if self.discount_amount is not None:
            result['discount_amount'] = self.discount_amount
        if self.coupon_amount is not None:
            result['coupon_amount'] = self.coupon_amount
        if self.pay_amount is not None:
            result['pay_amount'] = self.pay_amount
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        result['commodity_orders'] = []
        if self.commodity_orders is not None:
            for k in self.commodity_orders:
                result['commodity_orders'].append(k.to_map() if k else None)
        if self.pay_time is not None:
            result['pay_time'] = self.pay_time
        if self.pay_channel is not None:
            result['pay_channel'] = self.pay_channel
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('combo_code') is not None:
            self.combo_code = m.get('combo_code')
        if m.get('combo_name') is not None:
            self.combo_name = m.get('combo_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('provision_status') is not None:
            self.provision_status = m.get('provision_status')
        if m.get('original_amount') is not None:
            self.original_amount = m.get('original_amount')
        if m.get('discount_amount') is not None:
            self.discount_amount = m.get('discount_amount')
        if m.get('coupon_amount') is not None:
            self.coupon_amount = m.get('coupon_amount')
        if m.get('pay_amount') is not None:
            self.pay_amount = m.get('pay_amount')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        self.commodity_orders = []
        if m.get('commodity_orders') is not None:
            for k in m.get('commodity_orders'):
                temp_model = ComboCommodityOrder()
                self.commodity_orders.append(temp_model.from_map(k))
        if m.get('pay_time') is not None:
            self.pay_time = m.get('pay_time')
        if m.get('pay_channel') is not None:
            self.pay_channel = m.get('pay_channel')
        return self


class CommodityPricing(TeaModel):
    def __init__(self):
        pass

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        return self


class InstanceLabel(TeaModel):
    def __init__(
        self,
        instance_key: str = None,
        instance_value: str = None,
    ):
        # 标签名。
        # 传递isvId
        self.instance_key = instance_key
        # 标签值
        self.instance_value = instance_value

    def validate(self):
        self.validate_required(self.instance_key, 'instance_key')
        self.validate_required(self.instance_value, 'instance_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.instance_key is not None:
            result['instance_key'] = self.instance_key
        if self.instance_value is not None:
            result['instance_value'] = self.instance_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('instance_key') is not None:
            self.instance_key = m.get('instance_key')
        if m.get('instance_value') is not None:
            self.instance_value = m.get('instance_value')
        return self


class PriceStrategy(TeaModel):
    def __init__(
        self,
        follow_tenant_id: str = None,
    ):
        # 继承租户在商品下的价格，仅后付费商品生效
        self.follow_tenant_id = follow_tenant_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.follow_tenant_id is not None:
            result['follow_tenant_id'] = self.follow_tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('follow_tenant_id') is not None:
            self.follow_tenant_id = m.get('follow_tenant_id')
        return self


class OfferSyncCommonBuyInfo(TeaModel):
    def __init__(
        self,
        common_buy_sale_group_list_json: List[str] = None,
        offer_attr_list_json: List[str] = None,
        prod_offer_region_list_json: List[str] = None,
        offer_attr_group_list_json: List[str] = None,
        offer_extend_attr_list_json: List[str] = None,
        offer_common_buy_group_list_json: List[str] = None,
        offer_attr_constraints_list_json: List[str] = None,
        offer_rule_group_list_json: List[str] = None,
    ):
        # 商品列表配置 ListJson字符串
        self.common_buy_sale_group_list_json = common_buy_sale_group_list_json
        # 规格配置 ListJson字符串
        self.offer_attr_list_json = offer_attr_list_json
        # Region配置 ListJson字符串
        self.prod_offer_region_list_json = prod_offer_region_list_json
        # 费用项配置 ListJson字符串
        self.offer_attr_group_list_json = offer_attr_group_list_json
        # 属性配置 ListJson字符串
        self.offer_extend_attr_list_json = offer_extend_attr_list_json
        # 界面归类配置 ListJson字符串
        self.offer_common_buy_group_list_json = offer_common_buy_group_list_json
        # 规格约束配置 ListJson字符串
        self.offer_attr_constraints_list_json = offer_attr_constraints_list_json
        # 售卖规则配置 ListJson字符串
        self.offer_rule_group_list_json = offer_rule_group_list_json

    def validate(self):
        self.validate_required(self.common_buy_sale_group_list_json, 'common_buy_sale_group_list_json')
        self.validate_required(self.offer_attr_list_json, 'offer_attr_list_json')
        self.validate_required(self.prod_offer_region_list_json, 'prod_offer_region_list_json')
        self.validate_required(self.offer_attr_group_list_json, 'offer_attr_group_list_json')
        self.validate_required(self.offer_extend_attr_list_json, 'offer_extend_attr_list_json')
        self.validate_required(self.offer_common_buy_group_list_json, 'offer_common_buy_group_list_json')
        self.validate_required(self.offer_attr_constraints_list_json, 'offer_attr_constraints_list_json')
        self.validate_required(self.offer_rule_group_list_json, 'offer_rule_group_list_json')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.common_buy_sale_group_list_json is not None:
            result['common_buy_sale_group_list_json'] = self.common_buy_sale_group_list_json
        if self.offer_attr_list_json is not None:
            result['offer_attr_list_json'] = self.offer_attr_list_json
        if self.prod_offer_region_list_json is not None:
            result['prod_offer_region_list_json'] = self.prod_offer_region_list_json
        if self.offer_attr_group_list_json is not None:
            result['offer_attr_group_list_json'] = self.offer_attr_group_list_json
        if self.offer_extend_attr_list_json is not None:
            result['offer_extend_attr_list_json'] = self.offer_extend_attr_list_json
        if self.offer_common_buy_group_list_json is not None:
            result['offer_common_buy_group_list_json'] = self.offer_common_buy_group_list_json
        if self.offer_attr_constraints_list_json is not None:
            result['offer_attr_constraints_list_json'] = self.offer_attr_constraints_list_json
        if self.offer_rule_group_list_json is not None:
            result['offer_rule_group_list_json'] = self.offer_rule_group_list_json
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('common_buy_sale_group_list_json') is not None:
            self.common_buy_sale_group_list_json = m.get('common_buy_sale_group_list_json')
        if m.get('offer_attr_list_json') is not None:
            self.offer_attr_list_json = m.get('offer_attr_list_json')
        if m.get('prod_offer_region_list_json') is not None:
            self.prod_offer_region_list_json = m.get('prod_offer_region_list_json')
        if m.get('offer_attr_group_list_json') is not None:
            self.offer_attr_group_list_json = m.get('offer_attr_group_list_json')
        if m.get('offer_extend_attr_list_json') is not None:
            self.offer_extend_attr_list_json = m.get('offer_extend_attr_list_json')
        if m.get('offer_common_buy_group_list_json') is not None:
            self.offer_common_buy_group_list_json = m.get('offer_common_buy_group_list_json')
        if m.get('offer_attr_constraints_list_json') is not None:
            self.offer_attr_constraints_list_json = m.get('offer_attr_constraints_list_json')
        if m.get('offer_rule_group_list_json') is not None:
            self.offer_rule_group_list_json = m.get('offer_rule_group_list_json')
        return self


class CreateTradeOrderResult(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        biz_no: str = None,
        instance_ids: List[str] = None,
        pay_status: str = None,
        order_error_code: str = None,
        order_error_description: str = None,
    ):
        # 订单号
        self.order_id = order_id
        # 下单时的订单号
        self.biz_no = biz_no
        # 实例ID列表
        self.instance_ids = instance_ids
        # 订单状态
        self.pay_status = pay_status
        # 订购错误码
        self.order_error_code = order_error_code
        # 订购错误描述
        self.order_error_description = order_error_description

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.pay_status, 'pay_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.instance_ids is not None:
            result['instance_ids'] = self.instance_ids
        if self.pay_status is not None:
            result['pay_status'] = self.pay_status
        if self.order_error_code is not None:
            result['order_error_code'] = self.order_error_code
        if self.order_error_description is not None:
            result['order_error_description'] = self.order_error_description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('instance_ids') is not None:
            self.instance_ids = m.get('instance_ids')
        if m.get('pay_status') is not None:
            self.pay_status = m.get('pay_status')
        if m.get('order_error_code') is not None:
            self.order_error_code = m.get('order_error_code')
        if m.get('order_error_description') is not None:
            self.order_error_description = m.get('order_error_description')
        return self


class CommodityEnquiryPrice(TeaModel):
    def __init__(
        self,
        commodity_code: str = None,
        commodity_name: str = None,
        pay_amount: str = None,
        original_amount: str = None,
        discount_amount: str = None,
        coupon_amount: str = None,
        subscription_unused_amount: str = None,
        activity_code: str = None,
        activity_name: str = None,
        price_plan_id: int = None,
        price_constraint_id: int = None,
        currency: str = None,
        min_duration_of_valid_pay_amount: OrderDuration = None,
        discount_rate: str = None,
        original_bd_amount: str = None,
        original_cost_amount: str = None,
    ):
        # 商品主数据编码
        self.commodity_code = commodity_code
        # 商品名称
        self.commodity_name = commodity_name
        # 预付-支付金额
        self.pay_amount = pay_amount
        # 预付费-原始金额
        self.original_amount = original_amount
        # 预付费-折扣金额
        self.discount_amount = discount_amount
        # 预付费-优惠券抵扣金额
        self.coupon_amount = coupon_amount
        # 原订购剩余价值，用于变配场景
        self.subscription_unused_amount = subscription_unused_amount
        # 命中的活动编码
        self.activity_code = activity_code
        # 命中的活动名称
        self.activity_name = activity_name
        # 命中的定价计划ID
        self.price_plan_id = price_plan_id
        # 命中的定价约束ID
        self.price_constraint_id = price_constraint_id
        # 币种，元：CNY
        self.currency = currency
        # 基于剩余价值变配场景下，预测的支付金额正常的最小订购周期
        self.min_duration_of_valid_pay_amount = min_duration_of_valid_pay_amount
        # 预付费-折扣率
        self.discount_rate = discount_rate
        # 原始BD权限价金额，白名单商品会返回此价格
        self.original_bd_amount = original_bd_amount
        # 原始成本价金额，白名单商品会返回此价格
        self.original_cost_amount = original_cost_amount

    def validate(self):
        self.validate_required(self.commodity_code, 'commodity_code')
        self.validate_required(self.commodity_name, 'commodity_name')
        self.validate_required(self.pay_amount, 'pay_amount')
        self.validate_required(self.original_amount, 'original_amount')
        self.validate_required(self.discount_amount, 'discount_amount')
        self.validate_required(self.coupon_amount, 'coupon_amount')
        self.validate_required(self.subscription_unused_amount, 'subscription_unused_amount')
        self.validate_required(self.activity_code, 'activity_code')
        self.validate_required(self.activity_name, 'activity_name')
        self.validate_required(self.price_plan_id, 'price_plan_id')
        self.validate_required(self.price_constraint_id, 'price_constraint_id')
        self.validate_required(self.currency, 'currency')
        if self.min_duration_of_valid_pay_amount:
            self.min_duration_of_valid_pay_amount.validate()
        self.validate_required(self.discount_rate, 'discount_rate')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.commodity_name is not None:
            result['commodity_name'] = self.commodity_name
        if self.pay_amount is not None:
            result['pay_amount'] = self.pay_amount
        if self.original_amount is not None:
            result['original_amount'] = self.original_amount
        if self.discount_amount is not None:
            result['discount_amount'] = self.discount_amount
        if self.coupon_amount is not None:
            result['coupon_amount'] = self.coupon_amount
        if self.subscription_unused_amount is not None:
            result['subscription_unused_amount'] = self.subscription_unused_amount
        if self.activity_code is not None:
            result['activity_code'] = self.activity_code
        if self.activity_name is not None:
            result['activity_name'] = self.activity_name
        if self.price_plan_id is not None:
            result['price_plan_id'] = self.price_plan_id
        if self.price_constraint_id is not None:
            result['price_constraint_id'] = self.price_constraint_id
        if self.currency is not None:
            result['currency'] = self.currency
        if self.min_duration_of_valid_pay_amount is not None:
            result['min_duration_of_valid_pay_amount'] = self.min_duration_of_valid_pay_amount.to_map()
        if self.discount_rate is not None:
            result['discount_rate'] = self.discount_rate
        if self.original_bd_amount is not None:
            result['original_bd_amount'] = self.original_bd_amount
        if self.original_cost_amount is not None:
            result['original_cost_amount'] = self.original_cost_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('commodity_name') is not None:
            self.commodity_name = m.get('commodity_name')
        if m.get('pay_amount') is not None:
            self.pay_amount = m.get('pay_amount')
        if m.get('original_amount') is not None:
            self.original_amount = m.get('original_amount')
        if m.get('discount_amount') is not None:
            self.discount_amount = m.get('discount_amount')
        if m.get('coupon_amount') is not None:
            self.coupon_amount = m.get('coupon_amount')
        if m.get('subscription_unused_amount') is not None:
            self.subscription_unused_amount = m.get('subscription_unused_amount')
        if m.get('activity_code') is not None:
            self.activity_code = m.get('activity_code')
        if m.get('activity_name') is not None:
            self.activity_name = m.get('activity_name')
        if m.get('price_plan_id') is not None:
            self.price_plan_id = m.get('price_plan_id')
        if m.get('price_constraint_id') is not None:
            self.price_constraint_id = m.get('price_constraint_id')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('min_duration_of_valid_pay_amount') is not None:
            temp_model = OrderDuration()
            self.min_duration_of_valid_pay_amount = temp_model.from_map(m['min_duration_of_valid_pay_amount'])
        if m.get('discount_rate') is not None:
            self.discount_rate = m.get('discount_rate')
        if m.get('original_bd_amount') is not None:
            self.original_bd_amount = m.get('original_bd_amount')
        if m.get('original_cost_amount') is not None:
            self.original_cost_amount = m.get('original_cost_amount')
        return self


class Combo(TeaModel):
    def __init__(
        self,
        code: str = None,
        name: str = None,
        vid: str = None,
        description: str = None,
        extends_config: str = None,
        status: str = None,
        commodities: List[ComboCommodity] = None,
    ):
        # 套餐名称
        self.code = code
        # 套餐编码
        self.name = name
        # 套餐版本号
        self.vid = vid
        # 套餐描述
        self.description = description
        # 扩展信息，JSON结构，包含标签、个性化配置等数据
        self.extends_config = extends_config
        # 状态
        self.status = status
        # 套餐内商品列表
        self.commodities = commodities

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.name, 'name')
        self.validate_required(self.vid, 'vid')
        self.validate_required(self.description, 'description')
        self.validate_required(self.extends_config, 'extends_config')
        self.validate_required(self.status, 'status')
        self.validate_required(self.commodities, 'commodities')
        if self.commodities:
            for k in self.commodities:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.name is not None:
            result['name'] = self.name
        if self.vid is not None:
            result['vid'] = self.vid
        if self.description is not None:
            result['description'] = self.description
        if self.extends_config is not None:
            result['extends_config'] = self.extends_config
        if self.status is not None:
            result['status'] = self.status
        result['commodities'] = []
        if self.commodities is not None:
            for k in self.commodities:
                result['commodities'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('vid') is not None:
            self.vid = m.get('vid')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('extends_config') is not None:
            self.extends_config = m.get('extends_config')
        if m.get('status') is not None:
            self.status = m.get('status')
        self.commodities = []
        if m.get('commodities') is not None:
            for k in m.get('commodities'):
                temp_model = ComboCommodity()
                self.commodities.append(temp_model.from_map(k))
        return self


class Instance(TeaModel):
    def __init__(
        self,
        tenant_id: str = None,
        instance_id: str = None,
        product_name: str = None,
        charge_type: str = None,
        status: str = None,
    ):
        # 租户id
        self.tenant_id = tenant_id
        # 实例id
        self.instance_id = instance_id
        # 商品code
        self.product_name = product_name
        # 付费类型 PREPAY_BY_MONTH 预付 AFTER_PAY_BY_HOUR 后付 MIX_PAY 混合付
        self.charge_type = charge_type
        # 状态 CREATING 创建中 FAILED 创建失败  STARTED 运行中 STOPPED 已停服  RELEASED 已释放
        self.status = status

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.instance_id, 'instance_id')
        self.validate_required(self.product_name, 'product_name')
        self.validate_required(self.charge_type, 'charge_type')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.charge_type is not None:
            result['charge_type'] = self.charge_type
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('charge_type') is not None:
            self.charge_type = m.get('charge_type')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class CreateOrderResult(TeaModel):
    def __init__(
        self,
        bsn_no: str = None,
        order_id: str = None,
        normal_order_line_id: str = None,
        order_status: str = None,
        instance_ids: str = None,
        order_error_code: str = None,
        order_error_description: str = None,
    ):
        # 下单时指定的业务流水号。二级订单号
        self.bsn_no = bsn_no
        # 一级订单号
        self.order_id = order_id
        # 二级订单号
        self.normal_order_line_id = normal_order_line_id
        # 订单状态
        self.order_status = order_status
        # 实例列表
        self.instance_ids = instance_ids
        # 订购错误码
        self.order_error_code = order_error_code
        # 订购错误描述
        self.order_error_description = order_error_description

    def validate(self):
        self.validate_required(self.bsn_no, 'bsn_no')
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.normal_order_line_id, 'normal_order_line_id')
        self.validate_required(self.order_status, 'order_status')
        self.validate_required(self.instance_ids, 'instance_ids')
        self.validate_required(self.order_error_code, 'order_error_code')
        self.validate_required(self.order_error_description, 'order_error_description')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.bsn_no is not None:
            result['bsn_no'] = self.bsn_no
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.normal_order_line_id is not None:
            result['normal_order_line_id'] = self.normal_order_line_id
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.instance_ids is not None:
            result['instance_ids'] = self.instance_ids
        if self.order_error_code is not None:
            result['order_error_code'] = self.order_error_code
        if self.order_error_description is not None:
            result['order_error_description'] = self.order_error_description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('bsn_no') is not None:
            self.bsn_no = m.get('bsn_no')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('normal_order_line_id') is not None:
            self.normal_order_line_id = m.get('normal_order_line_id')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('instance_ids') is not None:
            self.instance_ids = m.get('instance_ids')
        if m.get('order_error_code') is not None:
            self.order_error_code = m.get('order_error_code')
        if m.get('order_error_description') is not None:
            self.order_error_description = m.get('order_error_description')
        return self


class QueryInstanceCapacityRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        tenant_name: str = None,
        status: str = None,
        commodity_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID，和租户名称二选一必填
        self.tenant_id = tenant_id
        # 8位租户名，和租户ID二选一必填
        self.tenant_name = tenant_name
        # 资源包状态，不传则默认查询有效；Valid：有效；Closed：已用完；Expired：已到期
        # 
        self.status = status
        # 资源包商品码
        self.commodity_code = commodity_code

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.status is not None:
            result['status'] = self.status
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        return self


class QueryInstanceCapacityResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        instance_capacitys: List[InstanceCapacity] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 实例容量列表
        self.instance_capacitys = instance_capacitys

    def validate(self):
        if self.instance_capacitys:
            for k in self.instance_capacitys:
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
        result['instance_capacitys'] = []
        if self.instance_capacitys is not None:
            for k in self.instance_capacitys:
                result['instance_capacitys'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.instance_capacitys = []
        if m.get('instance_capacitys') is not None:
            for k in m.get('instance_capacitys'):
                temp_model = InstanceCapacity()
                self.instance_capacitys.append(temp_model.from_map(k))
        return self


class QueryMarketingCouponRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        product_codes: List[str] = None,
        coupon_type: str = None,
        biz_time: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 商品code
        self.product_codes = product_codes
        # 优惠券类型:VOUCHER 抵用券, CERTAIN 满减券,DISCOUNT 折扣券
        self.coupon_type = coupon_type
        # 业务发生时间
        self.biz_time = biz_time

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.product_codes, 'product_codes')
        self.validate_required(self.biz_time, 'biz_time')
        if self.biz_time is not None:
            self.validate_pattern(self.biz_time, 'biz_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.product_codes is not None:
            result['product_codes'] = self.product_codes
        if self.coupon_type is not None:
            result['coupon_type'] = self.coupon_type
        if self.biz_time is not None:
            result['biz_time'] = self.biz_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('product_codes') is not None:
            self.product_codes = m.get('product_codes')
        if m.get('coupon_type') is not None:
            self.coupon_type = m.get('coupon_type')
        if m.get('biz_time') is not None:
            self.biz_time = m.get('biz_time')
        return self


class QueryMarketingCouponResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        coupon_list: List[Coupon] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 优惠券列表
        self.coupon_list = coupon_list

    def validate(self):
        if self.coupon_list:
            for k in self.coupon_list:
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
        result['coupon_list'] = []
        if self.coupon_list is not None:
            for k in self.coupon_list:
                result['coupon_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.coupon_list = []
        if m.get('coupon_list') is not None:
            for k in m.get('coupon_list'):
                temp_model = Coupon()
                self.coupon_list.append(temp_model.from_map(k))
        return self


class SendMarketingCouponRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        biz_no: str = None,
        tenant_id: str = None,
        template_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 外部业务流水号，用于幂等判断
        # 
        self.biz_no = biz_no
        # 租户ID
        # 
        self.tenant_id = tenant_id
        # 优惠券模板ID，营销后台申请获取
        # 
        self.template_id = template_id

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.template_id, 'template_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.template_id is not None:
            result['template_id'] = self.template_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        return self


class SendMarketingCouponResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        coupon_id: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 优惠券id
        # 
        self.coupon_id = coupon_id

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
        if self.coupon_id is not None:
            result['coupon_id'] = self.coupon_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('coupon_id') is not None:
            self.coupon_id = m.get('coupon_id')
        return self


class SyncOfferCommonbuyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        request_id: str = None,
        offer_code: str = None,
        request_work_no: str = None,
        offer_common_buy_sync_info: OfferSyncCommonBuyInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 请求id offerCode_yyyyMMddHHm0(最后一位固定为0幂等用，请求10分钟内只能触发一次)
        self.request_id = request_id
        # 需要同步的商品code
        self.offer_code = offer_code
        # 操作人工号
        self.request_work_no = request_work_no
        # 商品同步commonBuy的配置列表对应json
        self.offer_common_buy_sync_info = offer_common_buy_sync_info

    def validate(self):
        self.validate_required(self.request_id, 'request_id')
        self.validate_required(self.offer_code, 'offer_code')
        self.validate_required(self.request_work_no, 'request_work_no')
        self.validate_required(self.offer_common_buy_sync_info, 'offer_common_buy_sync_info')
        if self.offer_common_buy_sync_info:
            self.offer_common_buy_sync_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.request_id is not None:
            result['request_id'] = self.request_id
        if self.offer_code is not None:
            result['offer_code'] = self.offer_code
        if self.request_work_no is not None:
            result['request_work_no'] = self.request_work_no
        if self.offer_common_buy_sync_info is not None:
            result['offer_common_buy_sync_info'] = self.offer_common_buy_sync_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('request_id') is not None:
            self.request_id = m.get('request_id')
        if m.get('offer_code') is not None:
            self.offer_code = m.get('offer_code')
        if m.get('request_work_no') is not None:
            self.request_work_no = m.get('request_work_no')
        if m.get('offer_common_buy_sync_info') is not None:
            temp_model = OfferSyncCommonBuyInfo()
            self.offer_common_buy_sync_info = temp_model.from_map(m['offer_common_buy_sync_info'])
        return self


class SyncOfferCommonbuyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否触发同步商品信息异步处理
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class CreateOrderAfterRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_list: List[str] = None,
        tenant_id: str = None,
        biz_no: str = None,
        instance_labels: List[InstanceLabel] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 待开通类商品列表
        self.product_list = product_list
        # 租户id
        self.tenant_id = tenant_id
        # 下单交易流水号，唯一
        self.biz_no = biz_no
        # 标签对象
        self.instance_labels = instance_labels

    def validate(self):
        self.validate_required(self.product_list, 'product_list')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_no, 'biz_no')
        if self.instance_labels:
            for k in self.instance_labels:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_list is not None:
            result['product_list'] = self.product_list
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        result['instance_labels'] = []
        if self.instance_labels is not None:
            for k in self.instance_labels:
                result['instance_labels'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_list') is not None:
            self.product_list = m.get('product_list')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        self.instance_labels = []
        if m.get('instance_labels') is not None:
            for k in m.get('instance_labels'):
                temp_model = InstanceLabel()
                self.instance_labels.append(temp_model.from_map(k))
        return self


class CreateOrderAfterResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        biz_no: str = None,
        create_order_response_list: List[CreateOrderResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 业务流水号
        self.biz_no = biz_no
        # 下单返回值。里面有实例id和二级订单号等关键字段。
        self.create_order_response_list = create_order_response_list

    def validate(self):
        if self.create_order_response_list:
            for k in self.create_order_response_list:
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
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        result['create_order_response_list'] = []
        if self.create_order_response_list is not None:
            for k in self.create_order_response_list:
                result['create_order_response_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        self.create_order_response_list = []
        if m.get('create_order_response_list') is not None:
            for k in m.get('create_order_response_list'):
                temp_model = CreateOrderResult()
                self.create_order_response_list.append(temp_model.from_map(k))
        return self


class CreateOrderWorkflowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_list: List[str] = None,
        tenant_id: str = None,
        biz_no: str = None,
        instance_labels: List[InstanceLabel] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 待开通类商品列表
        self.product_list = product_list
        # 租户id
        self.tenant_id = tenant_id
        # 下单交易流水号，唯一
        self.biz_no = biz_no
        # 标签对象
        self.instance_labels = instance_labels

    def validate(self):
        self.validate_required(self.product_list, 'product_list')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.instance_labels, 'instance_labels')
        if self.instance_labels:
            for k in self.instance_labels:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_list is not None:
            result['product_list'] = self.product_list
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        result['instance_labels'] = []
        if self.instance_labels is not None:
            for k in self.instance_labels:
                result['instance_labels'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_list') is not None:
            self.product_list = m.get('product_list')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        self.instance_labels = []
        if m.get('instance_labels') is not None:
            for k in m.get('instance_labels'):
                temp_model = InstanceLabel()
                self.instance_labels.append(temp_model.from_map(k))
        return self


class CreateOrderWorkflowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        create_order_response_list: List[CreateOrderResult] = None,
        biz_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 下单返回值。里面有实例id和二级订单号等关键字段。
        self.create_order_response_list = create_order_response_list
        # 下单流水号
        self.biz_no = biz_no

    def validate(self):
        if self.create_order_response_list:
            for k in self.create_order_response_list:
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
        result['create_order_response_list'] = []
        if self.create_order_response_list is not None:
            for k in self.create_order_response_list:
                result['create_order_response_list'].append(k.to_map() if k else None)
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.create_order_response_list = []
        if m.get('create_order_response_list') is not None:
            for k in m.get('create_order_response_list'):
                temp_model = CreateOrderResult()
                self.create_order_response_list.append(temp_model.from_map(k))
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        return self


class GetComboRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        combo_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 套餐编码
        self.combo_code = combo_code

    def validate(self):
        self.validate_required(self.combo_code, 'combo_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.combo_code is not None:
            result['combo_code'] = self.combo_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('combo_code') is not None:
            self.combo_code = m.get('combo_code')
        return self


class GetComboResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        combo: Combo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 套餐结构
        self.combo = combo

    def validate(self):
        if self.combo:
            self.combo.validate()

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
        if self.combo is not None:
            result['combo'] = self.combo.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('combo') is not None:
            temp_model = Combo()
            self.combo = temp_model.from_map(m['combo'])
        return self


class QueryComboPriceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        combo_code: str = None,
        tenant_id: str = None,
        tenant_name: str = None,
        order_type: str = None,
        coupon_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 套餐编码
        self.combo_code = combo_code
        # 租户ID，和租户名二选一必填
        self.tenant_id = tenant_id
        # 8位租户名，和租户ID二选一必填
        self.tenant_name = tenant_name
        # 订单类型，新购：NEW，不填则默认NEW
        self.order_type = order_type
        # 优惠券ID
        self.coupon_id = coupon_id

    def validate(self):
        self.validate_required(self.combo_code, 'combo_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.combo_code is not None:
            result['combo_code'] = self.combo_code
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.order_type is not None:
            result['order_type'] = self.order_type
        if self.coupon_id is not None:
            result['coupon_id'] = self.coupon_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('combo_code') is not None:
            self.combo_code = m.get('combo_code')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('order_type') is not None:
            self.order_type = m.get('order_type')
        if m.get('coupon_id') is not None:
            self.coupon_id = m.get('coupon_id')
        return self


class QueryComboPriceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        combo_pay_amount: str = None,
        combo_coupon_amount: str = None,
        combo_discount_amount: str = None,
        combo_original_amount: str = None,
        currency: str = None,
        commodity_enquiry_prices: List[CommodityEnquiryPrice] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 套餐付款金额
        self.combo_pay_amount = combo_pay_amount
        # 套餐优惠金额
        self.combo_coupon_amount = combo_coupon_amount
        # 套餐折扣金额
        self.combo_discount_amount = combo_discount_amount
        # 套餐原始金额
        self.combo_original_amount = combo_original_amount
        # 币种，元：CNY
        self.currency = currency
        # 商品询价明细
        self.commodity_enquiry_prices = commodity_enquiry_prices

    def validate(self):
        if self.commodity_enquiry_prices:
            for k in self.commodity_enquiry_prices:
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
        if self.combo_pay_amount is not None:
            result['combo_pay_amount'] = self.combo_pay_amount
        if self.combo_coupon_amount is not None:
            result['combo_coupon_amount'] = self.combo_coupon_amount
        if self.combo_discount_amount is not None:
            result['combo_discount_amount'] = self.combo_discount_amount
        if self.combo_original_amount is not None:
            result['combo_original_amount'] = self.combo_original_amount
        if self.currency is not None:
            result['currency'] = self.currency
        result['commodity_enquiry_prices'] = []
        if self.commodity_enquiry_prices is not None:
            for k in self.commodity_enquiry_prices:
                result['commodity_enquiry_prices'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('combo_pay_amount') is not None:
            self.combo_pay_amount = m.get('combo_pay_amount')
        if m.get('combo_coupon_amount') is not None:
            self.combo_coupon_amount = m.get('combo_coupon_amount')
        if m.get('combo_discount_amount') is not None:
            self.combo_discount_amount = m.get('combo_discount_amount')
        if m.get('combo_original_amount') is not None:
            self.combo_original_amount = m.get('combo_original_amount')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        self.commodity_enquiry_prices = []
        if m.get('commodity_enquiry_prices') is not None:
            for k in m.get('commodity_enquiry_prices'):
                temp_model = CommodityEnquiryPrice()
                self.commodity_enquiry_prices.append(temp_model.from_map(k))
        return self


class CreateComboOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        scene_code: str = None,
        biz_no: str = None,
        combo_code: str = None,
        tenant_id: str = None,
        tenant_name: str = None,
        operator_id: str = None,
        duration: OrderDuration = None,
        coupon_id: str = None,
        instance_labels: List[InstanceLabel] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 场景接入码，中台分配
        self.scene_code = scene_code
        # 业务流水号，用于幂等
        self.biz_no = biz_no
        # 套餐编码
        self.combo_code = combo_code
        # 租户ID，和租户名二选一必填
        # 
        self.tenant_id = tenant_id
        # 8位租户名，和租户ID二选一必填
        # 
        self.tenant_name = tenant_name
        # 操作人ID，为空则等于当前租户ID
        self.operator_id = operator_id
        # 订购周期，当套餐中包含包周期型的商品，必填
        self.duration = duration
        # 优惠券ID
        self.coupon_id = coupon_id
        # [{"instance_key":"isvId","instance_value":"邀请码},{"instance_key":"policyId","instance_value":"政策id}]
        self.instance_labels = instance_labels

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.combo_code, 'combo_code')
        if self.duration:
            self.duration.validate()
        if self.instance_labels:
            for k in self.instance_labels:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.combo_code is not None:
            result['combo_code'] = self.combo_code
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.duration is not None:
            result['duration'] = self.duration.to_map()
        if self.coupon_id is not None:
            result['coupon_id'] = self.coupon_id
        result['instance_labels'] = []
        if self.instance_labels is not None:
            for k in self.instance_labels:
                result['instance_labels'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('combo_code') is not None:
            self.combo_code = m.get('combo_code')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('duration') is not None:
            temp_model = OrderDuration()
            self.duration = temp_model.from_map(m['duration'])
        if m.get('coupon_id') is not None:
            self.coupon_id = m.get('coupon_id')
        self.instance_labels = []
        if m.get('instance_labels') is not None:
            for k in m.get('instance_labels'):
                temp_model = InstanceLabel()
                self.instance_labels.append(temp_model.from_map(k))
        return self


class CreateComboOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        combo_order_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 套餐下单订单号
        self.combo_order_id = combo_order_id

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
        if self.combo_order_id is not None:
            result['combo_order_id'] = self.combo_order_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('combo_order_id') is not None:
            self.combo_order_id = m.get('combo_order_id')
        return self


class QueryComboOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        tenant_name: str = None,
        status: str = None,
        combo_code: str = None,
        begin_time: str = None,
        end_time: str = None,
        page_size: int = None,
        page_no: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID，租户ID和租户名称二选一必填
        self.tenant_id = tenant_id
        # 租户名称，租户ID和租户名称二选一必填
        self.tenant_name = tenant_name
        # 订单状态
        self.status = status
        # 套餐编码
        self.combo_code = combo_code
        # 下单开始时间
        self.begin_time = begin_time
        # 下单结束时间
        self.end_time = end_time
        # 每页数量，不传默认20
        self.page_size = page_size
        # 当前页数，不传则默认1
        self.page_no = page_no

    def validate(self):
        if self.begin_time is not None:
            self.validate_pattern(self.begin_time, 'begin_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.end_time is not None:
            self.validate_pattern(self.end_time, 'end_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.status is not None:
            result['status'] = self.status
        if self.combo_code is not None:
            result['combo_code'] = self.combo_code
        if self.begin_time is not None:
            result['begin_time'] = self.begin_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_no is not None:
            result['page_no'] = self.page_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('combo_code') is not None:
            self.combo_code = m.get('combo_code')
        if m.get('begin_time') is not None:
            self.begin_time = m.get('begin_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        return self


class QueryComboOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        orders: List[ComboOrder] = None,
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
        # 套餐订单列表
        self.orders = orders
        # 总数
        self.total_count = total_count
        # 当前页数
        self.page_no = page_no
        # 每页数量
        self.page_size = page_size

    def validate(self):
        if self.orders:
            for k in self.orders:
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
        result['orders'] = []
        if self.orders is not None:
            for k in self.orders:
                result['orders'].append(k.to_map() if k else None)
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
        self.orders = []
        if m.get('orders') is not None:
            for k in m.get('orders'):
                temp_model = ComboOrder()
                self.orders.append(temp_model.from_map(k))
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('page_no') is not None:
            self.page_no = m.get('page_no')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryComboRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        category_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 类目编码
        self.category_code = category_code

    def validate(self):
        self.validate_required(self.category_code, 'category_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.category_code is not None:
            result['category_code'] = self.category_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('category_code') is not None:
            self.category_code = m.get('category_code')
        return self


class QueryComboResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        combos: List[Combo] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 套餐列表
        self.combos = combos

    def validate(self):
        if self.combos:
            for k in self.combos:
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
        result['combos'] = []
        if self.combos is not None:
            for k in self.combos:
                result['combos'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.combos = []
        if m.get('combos') is not None:
            for k in m.get('combos'):
                temp_model = Combo()
                self.combos.append(temp_model.from_map(k))
        return self


class PayComboOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        combo_order_id: str = None,
        pay_channel: str = None,
        pay_mode: str = None,
        pay_return_url: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 套餐订单号
        self.combo_order_id = combo_order_id
        # 支付渠道，客资：FINANCIAL_FUND；财资：CUSTOMER_FUND；支付通：ALIPAY
        self.pay_channel = pay_channel
        # 支付模式，PAGE：页面确认支付；AUTO：系统自动扣款
        # 支付通模式只支持PAGE
        self.pay_mode = pay_mode
        # 支付回跳地址，当pay_mode=PAGE时，必传
        self.pay_return_url = pay_return_url

    def validate(self):
        self.validate_required(self.combo_order_id, 'combo_order_id')
        self.validate_required(self.pay_channel, 'pay_channel')
        self.validate_required(self.pay_mode, 'pay_mode')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.combo_order_id is not None:
            result['combo_order_id'] = self.combo_order_id
        if self.pay_channel is not None:
            result['pay_channel'] = self.pay_channel
        if self.pay_mode is not None:
            result['pay_mode'] = self.pay_mode
        if self.pay_return_url is not None:
            result['pay_return_url'] = self.pay_return_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('combo_order_id') is not None:
            self.combo_order_id = m.get('combo_order_id')
        if m.get('pay_channel') is not None:
            self.pay_channel = m.get('pay_channel')
        if m.get('pay_mode') is not None:
            self.pay_mode = m.get('pay_mode')
        if m.get('pay_return_url') is not None:
            self.pay_return_url = m.get('pay_return_url')
        return self


class PayComboOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pay_url: str = None,
        pay_order_id: str = None,
        pay_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 页面支付地址
        self.pay_url = pay_url
        # 支付订单号
        self.pay_order_id = pay_order_id
        # 支付状态，
        # SUCCESS：已支付;
        # INIT：未支付;
        # PROCESS：支付中;
        # CANCEL：取消支付;
        self.pay_status = pay_status

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
        if self.pay_order_id is not None:
            result['pay_order_id'] = self.pay_order_id
        if self.pay_status is not None:
            result['pay_status'] = self.pay_status
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
        if m.get('pay_order_id') is not None:
            self.pay_order_id = m.get('pay_order_id')
        if m.get('pay_status') is not None:
            self.pay_status = m.get('pay_status')
        return self


class CreateOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        biz_no: str = None,
        tenant_id: str = None,
        tenant_name: str = None,
        operator_id: str = None,
        commodity_code: str = None,
        ou: str = None,
        order_type: str = None,
        duration: OrderDuration = None,
        coupon_id: str = None,
        quantity: int = None,
        commodity_attrs: List[CommodityOrderAttribute] = None,
        fulfillment_options: FulfillmentOptions = None,
        pay_options: PayOptions = None,
        price_strategy: PriceStrategy = None,
        instance_id: str = None,
        sale_market: str = None,
        extended_properties: str = None,
        batch_biz_no: str = None,
        prepay_amount: PrepayAmount = None,
        post_pay_price: PostPayPrice = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 业务流水号，调用方指定，幂等号
        self.biz_no = biz_no
        # 租户ID，和租户名称二选一必填
        self.tenant_id = tenant_id
        # 租户名称，和租户ID二选一必填
        self.tenant_name = tenant_name
        # 操作人ID，不填则默认和租户ID一致
        self.operator_id = operator_id
        # 商品编码
        self.commodity_code = commodity_code
        # 销售主体，不传默认ZL6
        self.ou = ou
        # 订单类型，NEW：新购；RENEW：续费； MODIFY：变配
        # 不填默认新购
        self.order_type = order_type
        # 订购周期对象，当商品是周期订阅类型时，必填
        self.duration = duration
        # 优惠券ID
        self.coupon_id = coupon_id
        # 数量，不填默认1
        self.quantity = quantity
        # 商品订购属性，开通型商品部需要填写
        self.commodity_attrs = commodity_attrs
        # 履约选项
        self.fulfillment_options = fulfillment_options
        # 支付选项
        self.pay_options = pay_options
        # 价格策略
        self.price_strategy = price_strategy
        # 实例ID，续费/变配场景必传
        self.instance_id = instance_id
        # 售卖市场。10100000：鹊凿市场；12000002：国际ZAN市场；其他市场编码请联系中台获取
        self.sale_market = sale_market
        # 扩展属性，JSON字符串
        self.extended_properties = extended_properties
        # 批次流水号，外部合同下单场景，传入向中台申请的合同ID
        self.batch_biz_no = batch_biz_no
        # 预付费订单金额。仅白名单商品且batchBizNo是合法的合同ID的情况，才允许指定预付订单金额
        self.prepay_amount = prepay_amount
        # 后付商品签约价，用于在履约阶段生成一客一价
        self.post_pay_price = post_pay_price

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.commodity_code, 'commodity_code')
        if self.duration:
            self.duration.validate()
        if self.commodity_attrs:
            for k in self.commodity_attrs:
                if k:
                    k.validate()
        if self.fulfillment_options:
            self.fulfillment_options.validate()
        if self.pay_options:
            self.pay_options.validate()
        if self.price_strategy:
            self.price_strategy.validate()
        self.validate_required(self.sale_market, 'sale_market')
        if self.prepay_amount:
            self.prepay_amount.validate()
        if self.post_pay_price:
            self.post_pay_price.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.ou is not None:
            result['ou'] = self.ou
        if self.order_type is not None:
            result['order_type'] = self.order_type
        if self.duration is not None:
            result['duration'] = self.duration.to_map()
        if self.coupon_id is not None:
            result['coupon_id'] = self.coupon_id
        if self.quantity is not None:
            result['quantity'] = self.quantity
        result['commodity_attrs'] = []
        if self.commodity_attrs is not None:
            for k in self.commodity_attrs:
                result['commodity_attrs'].append(k.to_map() if k else None)
        if self.fulfillment_options is not None:
            result['fulfillment_options'] = self.fulfillment_options.to_map()
        if self.pay_options is not None:
            result['pay_options'] = self.pay_options.to_map()
        if self.price_strategy is not None:
            result['price_strategy'] = self.price_strategy.to_map()
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        if self.sale_market is not None:
            result['sale_market'] = self.sale_market
        if self.extended_properties is not None:
            result['extended_properties'] = self.extended_properties
        if self.batch_biz_no is not None:
            result['batch_biz_no'] = self.batch_biz_no
        if self.prepay_amount is not None:
            result['prepay_amount'] = self.prepay_amount.to_map()
        if self.post_pay_price is not None:
            result['post_pay_price'] = self.post_pay_price.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('ou') is not None:
            self.ou = m.get('ou')
        if m.get('order_type') is not None:
            self.order_type = m.get('order_type')
        if m.get('duration') is not None:
            temp_model = OrderDuration()
            self.duration = temp_model.from_map(m['duration'])
        if m.get('coupon_id') is not None:
            self.coupon_id = m.get('coupon_id')
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        self.commodity_attrs = []
        if m.get('commodity_attrs') is not None:
            for k in m.get('commodity_attrs'):
                temp_model = CommodityOrderAttribute()
                self.commodity_attrs.append(temp_model.from_map(k))
        if m.get('fulfillment_options') is not None:
            temp_model = FulfillmentOptions()
            self.fulfillment_options = temp_model.from_map(m['fulfillment_options'])
        if m.get('pay_options') is not None:
            temp_model = PayOptions()
            self.pay_options = temp_model.from_map(m['pay_options'])
        if m.get('price_strategy') is not None:
            temp_model = PriceStrategy()
            self.price_strategy = temp_model.from_map(m['price_strategy'])
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        if m.get('sale_market') is not None:
            self.sale_market = m.get('sale_market')
        if m.get('extended_properties') is not None:
            self.extended_properties = m.get('extended_properties')
        if m.get('batch_biz_no') is not None:
            self.batch_biz_no = m.get('batch_biz_no')
        if m.get('prepay_amount') is not None:
            temp_model = PrepayAmount()
            self.prepay_amount = temp_model.from_map(m['prepay_amount'])
        if m.get('post_pay_price') is not None:
            temp_model = PostPayPrice()
            self.post_pay_price = temp_model.from_map(m['post_pay_price'])
        return self


class CreateOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        instance_ids: List[str] = None,
        pay_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单号
        self.order_id = order_id
        # 实例ID列表
        self.instance_ids = instance_ids
        # 支付状态
        self.pay_status = pay_status

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
        if self.instance_ids is not None:
            result['instance_ids'] = self.instance_ids
        if self.pay_status is not None:
            result['pay_status'] = self.pay_status
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
        if m.get('instance_ids') is not None:
            self.instance_ids = m.get('instance_ids')
        if m.get('pay_status') is not None:
            self.pay_status = m.get('pay_status')
        return self


class GetComboOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        combo_order_id: str = None,
        include_fulfill_info: bool = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 套餐订单ID
        self.combo_order_id = combo_order_id
        # 是否包含履约信息
        self.include_fulfill_info = include_fulfill_info

    def validate(self):
        self.validate_required(self.combo_order_id, 'combo_order_id')
        self.validate_required(self.include_fulfill_info, 'include_fulfill_info')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.combo_order_id is not None:
            result['combo_order_id'] = self.combo_order_id
        if self.include_fulfill_info is not None:
            result['include_fulfill_info'] = self.include_fulfill_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('combo_order_id') is not None:
            self.combo_order_id = m.get('combo_order_id')
        if m.get('include_fulfill_info') is not None:
            self.include_fulfill_info = m.get('include_fulfill_info')
        return self


class GetComboOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order: ComboOrder = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 套餐订单详情
        self.order = order

    def validate(self):
        if self.order:
            self.order.validate()

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
        if self.order is not None:
            result['order'] = self.order.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('order') is not None:
            temp_model = ComboOrder()
            self.order = temp_model.from_map(m['order'])
        return self


class CancelOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        order_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 订单ID
        # 
        self.order_id = order_id
        # 下单时的租户ID
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class CancelOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否取消成功
        self.result = result

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
        if self.result is not None:
            result['result'] = self.result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        return self


class BatchcreateOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        batch_order_scene: str = None,
        batch_order_bsn_no: str = None,
        sale_market: str = None,
        tenant_id: str = None,
        tenant_name: str = None,
        operator_id: str = None,
        pay_options: PayOptions = None,
        commodity_instance_list: List[CommodityInstance] = None,
        extended_properties: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 批量下单场景编码 BatchOrderSceneEnum.online_acboss.getCode()
        self.batch_order_scene = batch_order_scene
        # 批量下单批次号
        self.batch_order_bsn_no = batch_order_bsn_no
        # 销售市场 com.antgroup.actradeprod.common.service.model.order.enums.SaleMarketEnum
        self.sale_market = sale_market
        # 租户Id
        self.tenant_id = tenant_id
        # 租户名称
        self.tenant_name = tenant_name
        # 操作人ID，不填则默认和租户ID一致
        self.operator_id = operator_id
        # 支付选项
        self.pay_options = pay_options
        # 商品实例列表
        self.commodity_instance_list = commodity_instance_list
        # 扩展属性，JSON字符串
        self.extended_properties = extended_properties

    def validate(self):
        self.validate_required(self.batch_order_scene, 'batch_order_scene')
        self.validate_required(self.batch_order_bsn_no, 'batch_order_bsn_no')
        self.validate_required(self.sale_market, 'sale_market')
        if self.pay_options:
            self.pay_options.validate()
        self.validate_required(self.commodity_instance_list, 'commodity_instance_list')
        if self.commodity_instance_list:
            for k in self.commodity_instance_list:
                if k:
                    k.validate()
        self.validate_required(self.extended_properties, 'extended_properties')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.batch_order_scene is not None:
            result['batch_order_scene'] = self.batch_order_scene
        if self.batch_order_bsn_no is not None:
            result['batch_order_bsn_no'] = self.batch_order_bsn_no
        if self.sale_market is not None:
            result['sale_market'] = self.sale_market
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.operator_id is not None:
            result['operator_id'] = self.operator_id
        if self.pay_options is not None:
            result['pay_options'] = self.pay_options.to_map()
        result['commodity_instance_list'] = []
        if self.commodity_instance_list is not None:
            for k in self.commodity_instance_list:
                result['commodity_instance_list'].append(k.to_map() if k else None)
        if self.extended_properties is not None:
            result['extended_properties'] = self.extended_properties
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('batch_order_scene') is not None:
            self.batch_order_scene = m.get('batch_order_scene')
        if m.get('batch_order_bsn_no') is not None:
            self.batch_order_bsn_no = m.get('batch_order_bsn_no')
        if m.get('sale_market') is not None:
            self.sale_market = m.get('sale_market')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('operator_id') is not None:
            self.operator_id = m.get('operator_id')
        if m.get('pay_options') is not None:
            temp_model = PayOptions()
            self.pay_options = temp_model.from_map(m['pay_options'])
        self.commodity_instance_list = []
        if m.get('commodity_instance_list') is not None:
            for k in m.get('commodity_instance_list'):
                temp_model = CommodityInstance()
                self.commodity_instance_list.append(temp_model.from_map(k))
        if m.get('extended_properties') is not None:
            self.extended_properties = m.get('extended_properties')
        return self


class BatchcreateOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pay_status: str = None,
        create_trade_order_results: List[CreateTradeOrderResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 支付状态
        self.pay_status = pay_status
        # 批量下单列表返回
        self.create_trade_order_results = create_trade_order_results

    def validate(self):
        if self.create_trade_order_results:
            for k in self.create_trade_order_results:
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
        if self.pay_status is not None:
            result['pay_status'] = self.pay_status
        result['create_trade_order_results'] = []
        if self.create_trade_order_results is not None:
            for k in self.create_trade_order_results:
                result['create_trade_order_results'].append(k.to_map() if k else None)
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
        self.create_trade_order_results = []
        if m.get('create_trade_order_results') is not None:
            for k in m.get('create_trade_order_results'):
                temp_model = CreateTradeOrderResult()
                self.create_trade_order_results.append(temp_model.from_map(k))
        return self


class BatchcancelOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        batch_order_bsn_no: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 批次号
        self.batch_order_bsn_no = batch_order_bsn_no
        # 租户Id
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.batch_order_bsn_no, 'batch_order_bsn_no')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.batch_order_bsn_no is not None:
            result['batch_order_bsn_no'] = self.batch_order_bsn_no
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('batch_order_bsn_no') is not None:
            self.batch_order_bsn_no = m.get('batch_order_bsn_no')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class BatchcancelOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: bool = None,
        create_trade_order_result: List[CreateTradeOrderResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否取消成功
        # 
        self.result = result
        # 取消订单结果
        self.create_trade_order_result = create_trade_order_result

    def validate(self):
        if self.create_trade_order_result:
            for k in self.create_trade_order_result:
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
        if self.result is not None:
            result['result'] = self.result
        result['create_trade_order_result'] = []
        if self.create_trade_order_result is not None:
            for k in self.create_trade_order_result:
                result['create_trade_order_result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('result') is not None:
            self.result = m.get('result')
        self.create_trade_order_result = []
        if m.get('create_trade_order_result') is not None:
            for k in m.get('create_trade_order_result'):
                temp_model = CreateTradeOrderResult()
                self.create_trade_order_result.append(temp_model.from_map(k))
        return self


class ExecOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        order_id: str = None,
        tenant_id: str = None,
        provision_options: ProvisionOption = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 订单号
        self.order_id = order_id
        # 租户标识
        self.tenant_id = tenant_id
        # 开通参数
        self.provision_options = provision_options

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.tenant_id, 'tenant_id')
        if self.provision_options:
            self.provision_options.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.provision_options is not None:
            result['provision_options'] = self.provision_options.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('provision_options') is not None:
            temp_model = ProvisionOption()
            self.provision_options = temp_model.from_map(m['provision_options'])
        return self


class ExecOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        success: bool = None,
        instance_ids: List[str] = None,
        order_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 执行结果
        self.success = success
        # 实例ID列表
        self.instance_ids = instance_ids
        # 操作订单状态
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
        if self.success is not None:
            result['success'] = self.success
        if self.instance_ids is not None:
            result['instance_ids'] = self.instance_ids
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
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('instance_ids') is not None:
            self.instance_ids = m.get('instance_ids')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        return self


class RefundOrderRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        order_id: str = None,
        tenant_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 订单号
        self.order_id = order_id
        # 租户标识
        self.tenant_id = tenant_id

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.tenant_id, 'tenant_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        return self


class RefundOrderResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        order_id: str = None,
        success: bool = None,
        order_status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 订单号
        self.order_id = order_id
        # 执行结果
        self.success = success
        # 操作订单状态
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
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.success is not None:
            result['success'] = self.success
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
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('success') is not None:
            self.success = m.get('success')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        return self


class ExistPricePersonalizedRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        product_code: str = None,
        price_object_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户ID
        self.tenant_id = tenant_id
        # 商品code
        self.product_code = product_code
        # 收费项编码，只有当商品存在多收费项的时候需要传入
        self.price_object_code = price_object_code

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.product_code, 'product_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.product_code is not None:
            result['product_code'] = self.product_code
        if self.price_object_code is not None:
            result['price_object_code'] = self.price_object_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('product_code') is not None:
            self.product_code = m.get('product_code')
        if m.get('price_object_code') is not None:
            self.price_object_code = m.get('price_object_code')
        return self


class ExistPricePersonalizedResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        exist: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否存在
        self.exist = exist

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
        if self.exist is not None:
            result['exist'] = self.exist
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('exist') is not None:
            self.exist = m.get('exist')
        return self


class QueryPriceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        commodity_code: str = None,
        tenant_id: str = None,
        tenant_name: str = None,
        quantity: int = None,
        biz_time: str = None,
        order_duration: OrderDuration = None,
        commodity_order_attrs: List[CommodityOrderAttribute] = None,
        currency: str = None,
        coupon_id: str = None,
        order_type: str = None,
        instance_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 商品主数据编码
        self.commodity_code = commodity_code
        # 租户ID，和租户名称二选一必填
        self.tenant_id = tenant_id
        # 8位租户名，和租户ID二选一必选
        self.tenant_name = tenant_name
        # 商品数量，不传则默认1
        self.quantity = quantity
        # 业务发生时间，不传则默认当前时间
        self.biz_time = biz_time
        # 订购周期，基于周期定价的商品必填
        self.order_duration = order_duration
        # 商品规格列表，按实际商品定义的和价格相关的属性传入
        # 1.续费询价不需要传
        # 2.变配询价需要传入变化的规格属性
        self.commodity_order_attrs = commodity_order_attrs
        # 币种，元：CNY，不传默认CNY
        self.currency = currency
        # 优惠券ID
        self.coupon_id = coupon_id
        # 不填默认为NEW；NEW：新购；RENEW：续费；MODIFY：变配
        self.order_type = order_type
        # 实例ID，续费/变配场景必传
        self.instance_id = instance_id

    def validate(self):
        self.validate_required(self.commodity_code, 'commodity_code')
        if self.biz_time is not None:
            self.validate_pattern(self.biz_time, 'biz_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.order_duration:
            self.order_duration.validate()
        if self.commodity_order_attrs:
            for k in self.commodity_order_attrs:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.commodity_code is not None:
            result['commodity_code'] = self.commodity_code
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.tenant_name is not None:
            result['tenant_name'] = self.tenant_name
        if self.quantity is not None:
            result['quantity'] = self.quantity
        if self.biz_time is not None:
            result['biz_time'] = self.biz_time
        if self.order_duration is not None:
            result['order_duration'] = self.order_duration.to_map()
        result['commodity_order_attrs'] = []
        if self.commodity_order_attrs is not None:
            for k in self.commodity_order_attrs:
                result['commodity_order_attrs'].append(k.to_map() if k else None)
        if self.currency is not None:
            result['currency'] = self.currency
        if self.coupon_id is not None:
            result['coupon_id'] = self.coupon_id
        if self.order_type is not None:
            result['order_type'] = self.order_type
        if self.instance_id is not None:
            result['instance_id'] = self.instance_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('commodity_code') is not None:
            self.commodity_code = m.get('commodity_code')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('tenant_name') is not None:
            self.tenant_name = m.get('tenant_name')
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        if m.get('biz_time') is not None:
            self.biz_time = m.get('biz_time')
        if m.get('order_duration') is not None:
            temp_model = OrderDuration()
            self.order_duration = temp_model.from_map(m['order_duration'])
        self.commodity_order_attrs = []
        if m.get('commodity_order_attrs') is not None:
            for k in m.get('commodity_order_attrs'):
                temp_model = CommodityOrderAttribute()
                self.commodity_order_attrs.append(temp_model.from_map(k))
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('coupon_id') is not None:
            self.coupon_id = m.get('coupon_id')
        if m.get('order_type') is not None:
            self.order_type = m.get('order_type')
        if m.get('instance_id') is not None:
            self.instance_id = m.get('instance_id')
        return self


class QueryPriceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        commodity_enquiry_price: CommodityEnquiryPrice = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 商品询价结果
        self.commodity_enquiry_price = commodity_enquiry_price

    def validate(self):
        if self.commodity_enquiry_price:
            self.commodity_enquiry_price.validate()

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
        if self.commodity_enquiry_price is not None:
            result['commodity_enquiry_price'] = self.commodity_enquiry_price.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('commodity_enquiry_price') is not None:
            temp_model = CommodityEnquiryPrice()
            self.commodity_enquiry_price = temp_model.from_map(m['commodity_enquiry_price'])
        return self


class QueryWareslifeInstanceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        tenant_id: str = None,
        product_codes: List[str] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        # 租户id
        self.tenant_id = tenant_id
        # 商品code
        self.product_codes = product_codes

    def validate(self):
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.product_codes, 'product_codes')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.product_codes is not None:
            result['product_codes'] = self.product_codes
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('product_codes') is not None:
            self.product_codes = m.get('product_codes')
        return self


class QueryWareslifeInstanceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        instances: List[Instance] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 实例列表
        self.instances = instances

    def validate(self):
        if self.instances:
            for k in self.instances:
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
        result['instances'] = []
        if self.instances is not None:
            for k in self.instances:
                result['instances'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.instances = []
        if m.get('instances') is not None:
            for k in m.get('instances'):
                temp_model = Instance()
                self.instances.append(temp_model.from_map(k))
        return self


