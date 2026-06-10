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


class FixedDiscountCoupon(TeaModel):
    def __init__(
        self,
        discount_amount_max: int = None,
        discount_percent: int = None,
        transaction_minimum: int = None,
    ):
        # 【最高折扣金额】 最高折扣金额，单位分
        self.discount_amount_max = discount_amount_max
        # 【折扣百分比】 折扣百分比，例如88-八八折
        self.discount_percent = discount_percent
        # 【门槛】 使用券金额门槛，单位分
        self.transaction_minimum = transaction_minimum

    def validate(self):
        self.validate_required(self.discount_amount_max, 'discount_amount_max')
        self.validate_required(self.discount_percent, 'discount_percent')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.discount_amount_max is not None:
            result['discount_amount_max'] = self.discount_amount_max
        if self.discount_percent is not None:
            result['discount_percent'] = self.discount_percent
        if self.transaction_minimum is not None:
            result['transaction_minimum'] = self.transaction_minimum
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('discount_amount_max') is not None:
            self.discount_amount_max = m.get('discount_amount_max')
        if m.get('discount_percent') is not None:
            self.discount_percent = m.get('discount_percent')
        if m.get('transaction_minimum') is not None:
            self.transaction_minimum = m.get('transaction_minimum')
        return self


class FixedNormalCoupon(TeaModel):
    def __init__(
        self,
        coupon_amount: int = None,
        transaction_minimum: int = None,
    ):
        # 【面额】 面额，单位：分。
        self.coupon_amount = coupon_amount
        # 【门槛】 使用券金额门槛，单位：分。
        self.transaction_minimum = transaction_minimum

    def validate(self):
        self.validate_required(self.coupon_amount, 'coupon_amount')
        self.validate_required(self.transaction_minimum, 'transaction_minimum')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.coupon_amount is not None:
            result['coupon_amount'] = self.coupon_amount
        if self.transaction_minimum is not None:
            result['transaction_minimum'] = self.transaction_minimum
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('coupon_amount') is not None:
            self.coupon_amount = m.get('coupon_amount')
        if m.get('transaction_minimum') is not None:
            self.transaction_minimum = m.get('transaction_minimum')
        return self


class RultMetric(TeaModel):
    def __init__(
        self,
        metric_code: str = None,
        metric_value: str = None,
    ):
        # 度量编码
        self.metric_code = metric_code
        # 度量聚合结果
        self.metric_value = metric_value

    def validate(self):
        self.validate_required(self.metric_code, 'metric_code')
        self.validate_required(self.metric_value, 'metric_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.metric_code is not None:
            result['metric_code'] = self.metric_code
        if self.metric_value is not None:
            result['metric_value'] = self.metric_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('metric_code') is not None:
            self.metric_code = m.get('metric_code')
        if m.get('metric_value') is not None:
            self.metric_value = m.get('metric_value')
        return self


class CutToMessage(TeaModel):
    def __init__(
        self,
        single_price_max: int = None,
        cut_to_price: int = None,
    ):
        # 【可用优惠的商品最高单价】 可用优惠的商品最高单价，单位：分。
        self.single_price_max = single_price_max
        # 【减至后的优惠单价】 减至后的优惠单价，单位：分。
        self.cut_to_price = cut_to_price

    def validate(self):
        self.validate_required(self.single_price_max, 'single_price_max')
        self.validate_required(self.cut_to_price, 'cut_to_price')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.single_price_max is not None:
            result['single_price_max'] = self.single_price_max
        if self.cut_to_price is not None:
            result['cut_to_price'] = self.cut_to_price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('single_price_max') is not None:
            self.single_price_max = m.get('single_price_max')
        if m.get('cut_to_price') is not None:
            self.cut_to_price = m.get('cut_to_price')
        return self


class AvailableRegion(TeaModel):
    def __init__(
        self,
        type: str = None,
        province: str = None,
        city: str = None,
        district: str = None,
        country: str = None,
    ):
        # 【类型】 消费金可用地域的类型，COUNTRY表示国家级别可用，PROVINCE表示省级可用，CITY表示市级可用，DISTRICT表示区级可用。
        # 可选取值
        # PROVINCE:  地域信息精确到省级
        # CITY:  地域信息精确到市级
        # DISTRICT:  地域信息精确到区级
        # COUNTRY:  地域信息精确到国家级
        self.type = type
        # 【省】 消费金可用省
        self.province = province
        # 【市】 消费金可用
        self.city = city
        # 【区】 消费金可用区
        self.district = district
        # 【国家】 消费金可用国家
        self.country = country

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.type is not None:
            result['type'] = self.type
        if self.province is not None:
            result['province'] = self.province
        if self.city is not None:
            result['city'] = self.city
        if self.district is not None:
            result['district'] = self.district
        if self.country is not None:
            result['country'] = self.country
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('province') is not None:
            self.province = m.get('province')
        if m.get('city') is not None:
            self.city = m.get('city')
        if m.get('district') is not None:
            self.district = m.get('district')
        if m.get('country') is not None:
            self.country = m.get('country')
        return self


class Dimension(TeaModel):
    def __init__(
        self,
        dimension: str = None,
        dimension_value: str = None,
    ):
        # 维度
        self.dimension = dimension
        # 维度值
        self.dimension_value = dimension_value

    def validate(self):
        self.validate_required(self.dimension, 'dimension')
        self.validate_required(self.dimension_value, 'dimension_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.dimension is not None:
            result['dimension'] = self.dimension
        if self.dimension_value is not None:
            result['dimension_value'] = self.dimension_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('dimension') is not None:
            self.dimension = m.get('dimension')
        if m.get('dimension_value') is not None:
            self.dimension_value = m.get('dimension_value')
        return self


class StockUseRule(TeaModel):
    def __init__(
        self,
        max_coupons: int = None,
        max_amount: int = None,
        max_amount_by_day: int = None,
        fixed_normal_coupon: FixedNormalCoupon = None,
        max_coupons_per_user: int = None,
        coupon_type: str = None,
        goods_tag: List[str] = None,
        trade_type: List[str] = None,
        combine_use: bool = None,
        fixed_discount_coupon: FixedDiscountCoupon = None,
    ):
        # 【发放总上限】 最大发券数
        self.max_coupons = max_coupons
        # 【总预算】 总消耗金额，单位：分。
        self.max_amount = max_amount
        # 【单天发放上限金额】 单天最高消耗金额，单位：分。
        self.max_amount_by_day = max_amount_by_day
        # 【固定面额批次特定信息】 固定面额发券或消费金批次特定信息。
        self.fixed_normal_coupon = fixed_normal_coupon
        # 【单个用户可领个数】 单个用户可领个数
        self.max_coupons_per_user = max_coupons_per_user
        # 【券或消费金类型】 券或消费金类型
        # 枚举值：
        # NORMAL：满减券
        # CUT_TO：减至券
        self.coupon_type = coupon_type
        # 【订单优惠标记】 订单优惠标记 (该字段暂未开放返回)
        # 特殊规则：单个优惠标记的字符长度为【1，128】,条目个数限制为【1，50】。
        self.goods_tag = goods_tag
        # 【指定支付模式】默认不限制(该字段暂未开放返回)，枚举值：
        # 可选取值
        # MICROAPP:  小程序支付
        # APPPAY:  APP支付
        # PPAY:  免密支付
        # CARD:  刷卡支付
        # FACE:  人脸支付
        # OTHER:  其他支付，公众号、扫码等
        self.trade_type = trade_type
        # 【是否可叠加其他优惠】 枚举值：
        # true：是
        # false：否
        self.combine_use = combine_use
        # 【固定折扣特定信息】
        self.fixed_discount_coupon = fixed_discount_coupon

    def validate(self):
        self.validate_required(self.max_coupons, 'max_coupons')
        self.validate_required(self.max_amount, 'max_amount')
        self.validate_required(self.max_amount_by_day, 'max_amount_by_day')
        self.validate_required(self.fixed_normal_coupon, 'fixed_normal_coupon')
        if self.fixed_normal_coupon:
            self.fixed_normal_coupon.validate()
        self.validate_required(self.max_coupons_per_user, 'max_coupons_per_user')
        if self.fixed_discount_coupon:
            self.fixed_discount_coupon.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.max_coupons is not None:
            result['max_coupons'] = self.max_coupons
        if self.max_amount is not None:
            result['max_amount'] = self.max_amount
        if self.max_amount_by_day is not None:
            result['max_amount_by_day'] = self.max_amount_by_day
        if self.fixed_normal_coupon is not None:
            result['fixed_normal_coupon'] = self.fixed_normal_coupon.to_map()
        if self.max_coupons_per_user is not None:
            result['max_coupons_per_user'] = self.max_coupons_per_user
        if self.coupon_type is not None:
            result['coupon_type'] = self.coupon_type
        if self.goods_tag is not None:
            result['goods_tag'] = self.goods_tag
        if self.trade_type is not None:
            result['trade_type'] = self.trade_type
        if self.combine_use is not None:
            result['combine_use'] = self.combine_use
        if self.fixed_discount_coupon is not None:
            result['fixed_discount_coupon'] = self.fixed_discount_coupon.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('max_coupons') is not None:
            self.max_coupons = m.get('max_coupons')
        if m.get('max_amount') is not None:
            self.max_amount = m.get('max_amount')
        if m.get('max_amount_by_day') is not None:
            self.max_amount_by_day = m.get('max_amount_by_day')
        if m.get('fixed_normal_coupon') is not None:
            temp_model = FixedNormalCoupon()
            self.fixed_normal_coupon = temp_model.from_map(m['fixed_normal_coupon'])
        if m.get('max_coupons_per_user') is not None:
            self.max_coupons_per_user = m.get('max_coupons_per_user')
        if m.get('coupon_type') is not None:
            self.coupon_type = m.get('coupon_type')
        if m.get('goods_tag') is not None:
            self.goods_tag = m.get('goods_tag')
        if m.get('trade_type') is not None:
            self.trade_type = m.get('trade_type')
        if m.get('combine_use') is not None:
            self.combine_use = m.get('combine_use')
        if m.get('fixed_discount_coupon') is not None:
            temp_model = FixedDiscountCoupon()
            self.fixed_discount_coupon = temp_model.from_map(m['fixed_discount_coupon'])
        return self


class WxStockData(TeaModel):
    def __init__(
        self,
        stock_id: str = None,
        stock_creator_mchid: str = None,
        stock_name: str = None,
        status: str = None,
        create_time: str = None,
        description: str = None,
        stock_use_rule: StockUseRule = None,
        available_begin_time: str = None,
        available_end_time: str = None,
        distributed_coupons: int = None,
        no_cash: bool = None,
        start_time: str = None,
        stop_time: str = None,
        cut_to_message: CutToMessage = None,
        singleitem: bool = None,
        stock_type: str = None,
        card_id: str = None,
        business_type: str = None,
        available_region_list: List[AvailableRegion] = None,
        available_industry_list: List[str] = None,
    ):
        # 【批次号】 微信为每个代金券批次分配的唯一id。
        self.stock_id = stock_id
        # 【批次创建方商户号】 微信为创建方商户分配的商户号
        self.stock_creator_mchid = stock_creator_mchid
        # 【批次名称】 批次名称
        self.stock_name = stock_name
        # 【批次状态】 批次状态，枚举值：
        # unactivated：未激活
        # audit：审核中
        # running：运行中
        # stoped：已停止
        # paused：暂停发放
        self.status = status
        # 【创建时间】 批次创建时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
        self.create_time = create_time
        # 【使用说明】 批次描述信息
        self.description = description
        # 【满减券/消费金批次使用规则】 满减券或消费金批次特定信息。
        self.stock_use_rule = stock_use_rule
        # 【可用开始时间】 可用开始时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
        self.available_begin_time = available_begin_time
        # 【可用结束时间】 可用结束时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
        self.available_end_time = available_end_time
        # 【已发券或消费金数量】 已发券或消费金数量
        self.distributed_coupons = distributed_coupons
        # 【是否无资金流】 是否无资金流。枚举值：
        # true：是
        # false：否
        self.no_cash = no_cash
        # 【激活批次的时间】 批次激活开启时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
        self.start_time = start_time
        # 【终止批次的时间】 批次永久停止时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss.sss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss.sss表示时分秒毫秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35.120+08:00表示，北京时间2015年5月20日 13点29分35秒。
        self.stop_time = stop_time
        # 【减至批次特定信息】 单品优惠特定信息
        self.cut_to_message = cut_to_message
        # 【是否单品优惠】 枚举值：
        # true：是
        # false：否
        self.singleitem = singleitem
        # 【批次类型】 批次类型
        # 枚举值：
        # NORMAL：代金券批次
        # DISCOUNT_CUT：立减与折扣
        # OTHER：其他
        self.stock_type = stock_type
        # 【卡包ID】 微信卡包ID
        self.card_id = card_id
        # 【业务类型】 细分业务类型，仅有当business_type=MULTIUSE时，才会返回，枚举值：
        # MULTIUSE：消费金
        # 可选取值
        # MULTIUSE:  消费金类型
        self.business_type = business_type
        # 消费金可用地域列表，仅有当business_type=MULTIUSE时，才会返回
        self.available_region_list = available_region_list
        # 【消费金可用行业】 消费金可用行业列表，仅有当business_type=MULTIUSE时，才会返回
        self.available_industry_list = available_industry_list

    def validate(self):
        self.validate_required(self.stock_id, 'stock_id')
        self.validate_required(self.stock_creator_mchid, 'stock_creator_mchid')
        self.validate_required(self.stock_name, 'stock_name')
        self.validate_required(self.status, 'status')
        self.validate_required(self.create_time, 'create_time')
        self.validate_required(self.description, 'description')
        if self.stock_use_rule:
            self.stock_use_rule.validate()
        self.validate_required(self.available_begin_time, 'available_begin_time')
        self.validate_required(self.available_end_time, 'available_end_time')
        self.validate_required(self.distributed_coupons, 'distributed_coupons')
        self.validate_required(self.no_cash, 'no_cash')
        if self.cut_to_message:
            self.cut_to_message.validate()
        self.validate_required(self.singleitem, 'singleitem')
        self.validate_required(self.stock_type, 'stock_type')
        if self.available_region_list:
            for k in self.available_region_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.stock_id is not None:
            result['stock_id'] = self.stock_id
        if self.stock_creator_mchid is not None:
            result['stock_creator_mchid'] = self.stock_creator_mchid
        if self.stock_name is not None:
            result['stock_name'] = self.stock_name
        if self.status is not None:
            result['status'] = self.status
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.description is not None:
            result['description'] = self.description
        if self.stock_use_rule is not None:
            result['stock_use_rule'] = self.stock_use_rule.to_map()
        if self.available_begin_time is not None:
            result['available_begin_time'] = self.available_begin_time
        if self.available_end_time is not None:
            result['available_end_time'] = self.available_end_time
        if self.distributed_coupons is not None:
            result['distributed_coupons'] = self.distributed_coupons
        if self.no_cash is not None:
            result['no_cash'] = self.no_cash
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.stop_time is not None:
            result['stop_time'] = self.stop_time
        if self.cut_to_message is not None:
            result['cut_to_message'] = self.cut_to_message.to_map()
        if self.singleitem is not None:
            result['singleitem'] = self.singleitem
        if self.stock_type is not None:
            result['stock_type'] = self.stock_type
        if self.card_id is not None:
            result['card_id'] = self.card_id
        if self.business_type is not None:
            result['business_type'] = self.business_type
        result['available_region_list'] = []
        if self.available_region_list is not None:
            for k in self.available_region_list:
                result['available_region_list'].append(k.to_map() if k else None)
        if self.available_industry_list is not None:
            result['available_industry_list'] = self.available_industry_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('stock_id') is not None:
            self.stock_id = m.get('stock_id')
        if m.get('stock_creator_mchid') is not None:
            self.stock_creator_mchid = m.get('stock_creator_mchid')
        if m.get('stock_name') is not None:
            self.stock_name = m.get('stock_name')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('description') is not None:
            self.description = m.get('description')
        if m.get('stock_use_rule') is not None:
            temp_model = StockUseRule()
            self.stock_use_rule = temp_model.from_map(m['stock_use_rule'])
        if m.get('available_begin_time') is not None:
            self.available_begin_time = m.get('available_begin_time')
        if m.get('available_end_time') is not None:
            self.available_end_time = m.get('available_end_time')
        if m.get('distributed_coupons') is not None:
            self.distributed_coupons = m.get('distributed_coupons')
        if m.get('no_cash') is not None:
            self.no_cash = m.get('no_cash')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('stop_time') is not None:
            self.stop_time = m.get('stop_time')
        if m.get('cut_to_message') is not None:
            temp_model = CutToMessage()
            self.cut_to_message = temp_model.from_map(m['cut_to_message'])
        if m.get('singleitem') is not None:
            self.singleitem = m.get('singleitem')
        if m.get('stock_type') is not None:
            self.stock_type = m.get('stock_type')
        if m.get('card_id') is not None:
            self.card_id = m.get('card_id')
        if m.get('business_type') is not None:
            self.business_type = m.get('business_type')
        self.available_region_list = []
        if m.get('available_region_list') is not None:
            for k in m.get('available_region_list'):
                temp_model = AvailableRegion()
                self.available_region_list.append(temp_model.from_map(k))
        if m.get('available_industry_list') is not None:
            self.available_industry_list = m.get('available_industry_list')
        return self


class Metric(TeaModel):
    def __init__(
        self,
        metric_code: str = None,
        metric_column: str = None,
        function_type: str = None,
    ):
        # 度量编码
        self.metric_code = metric_code
        # 计算列
        self.metric_column = metric_column
        # 计算方式
        self.function_type = function_type

    def validate(self):
        self.validate_required(self.metric_code, 'metric_code')
        self.validate_required(self.metric_column, 'metric_column')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.metric_code is not None:
            result['metric_code'] = self.metric_code
        if self.metric_column is not None:
            result['metric_column'] = self.metric_column
        if self.function_type is not None:
            result['function_type'] = self.function_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('metric_code') is not None:
            self.metric_code = m.get('metric_code')
        if m.get('metric_column') is not None:
            self.metric_column = m.get('metric_column')
        if m.get('function_type') is not None:
            self.function_type = m.get('function_type')
        return self


class BizNoCondition(TeaModel):
    def __init__(
        self,
        dimension: str = None,
        value_scope: List[str] = None,
    ):
        # 枚举
        # CITY 城市
        # BLOCK 区县
        # AGE 年龄
        self.dimension = dimension
        # 枚举范围，每个维度的值是或的关系,需要校验场景和取值范围是否匹配
        # CITY:区划码
        # BLOCK:区划码（底包暂不支持）
        # AGE:30+、40+、50+（底包暂不支持
        self.value_scope = value_scope

    def validate(self):
        self.validate_required(self.dimension, 'dimension')
        self.validate_required(self.value_scope, 'value_scope')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.dimension is not None:
            result['dimension'] = self.dimension
        if self.value_scope is not None:
            result['value_scope'] = self.value_scope
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('dimension') is not None:
            self.dimension = m.get('dimension')
        if m.get('value_scope') is not None:
            self.value_scope = m.get('value_scope')
        return self


class BatchResult(TeaModel):
    def __init__(
        self,
        biz_no: str = None,
        biz_no_type: str = None,
        result: str = None,
        result_code: str = None,
    ):
        # 业务号
        self.biz_no = biz_no
        # 业务号类型
        self.biz_no_type = biz_no_type
        # 结果
        self.result = result
        # 结果码
        self.result_code = result_code

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')
        if self.biz_no is not None:
            self.validate_max_length(self.biz_no, 'biz_no', 64)
        self.validate_required(self.biz_no_type, 'biz_no_type')
        if self.biz_no_type is not None:
            self.validate_max_length(self.biz_no_type, 'biz_no_type', 32)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.biz_no_type is not None:
            result['biz_no_type'] = self.biz_no_type
        if self.result is not None:
            result['result'] = self.result
        if self.result_code is not None:
            result['result_code'] = self.result_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('biz_no_type') is not None:
            self.biz_no_type = m.get('biz_no_type')
        if m.get('result') is not None:
            self.result = m.get('result')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        return self


class TaskDetailResult(TeaModel):
    def __init__(
        self,
        total_count: int = None,
        success_count: int = None,
        fail_count: int = None,
        processing_count: int = None,
        error_info: str = None,
    ):
        # 总数量
        self.total_count = total_count
        # 成功数量
        self.success_count = success_count
        # 失败数量
        self.fail_count = fail_count
        # 处理中数量
        self.processing_count = processing_count
        # 当状态为无效时，显示具体的错误信息
        self.error_info = error_info

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.success_count is not None:
            result['success_count'] = self.success_count
        if self.fail_count is not None:
            result['fail_count'] = self.fail_count
        if self.processing_count is not None:
            result['processing_count'] = self.processing_count
        if self.error_info is not None:
            result['error_info'] = self.error_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('success_count') is not None:
            self.success_count = m.get('success_count')
        if m.get('fail_count') is not None:
            self.fail_count = m.get('fail_count')
        if m.get('processing_count') is not None:
            self.processing_count = m.get('processing_count')
        if m.get('error_info') is not None:
            self.error_info = m.get('error_info')
        return self


class DwsResult(TeaModel):
    def __init__(
        self,
        dimension_list: List[Dimension] = None,
        metric_list: List[RultMetric] = None,
    ):
        # 维度列表
        self.dimension_list = dimension_list
        # 度量列表
        self.metric_list = metric_list

    def validate(self):
        self.validate_required(self.dimension_list, 'dimension_list')
        if self.dimension_list:
            for k in self.dimension_list:
                if k:
                    k.validate()
        self.validate_required(self.metric_list, 'metric_list')
        if self.metric_list:
            for k in self.metric_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['dimension_list'] = []
        if self.dimension_list is not None:
            for k in self.dimension_list:
                result['dimension_list'].append(k.to_map() if k else None)
        result['metric_list'] = []
        if self.metric_list is not None:
            for k in self.metric_list:
                result['metric_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.dimension_list = []
        if m.get('dimension_list') is not None:
            for k in m.get('dimension_list'):
                temp_model = Dimension()
                self.dimension_list.append(temp_model.from_map(k))
        self.metric_list = []
        if m.get('metric_list') is not None:
            for k in m.get('metric_list'):
                temp_model = RultMetric()
                self.metric_list.append(temp_model.from_map(k))
        return self


class FilterCondition(TeaModel):
    def __init__(
        self,
        filter_column: str = None,
        filter_type: str = None,
        value_list: List[str] = None,
    ):
        # 过滤列
        self.filter_column = filter_column
        # 过滤方式
        self.filter_type = filter_type
        # 值列表
        self.value_list = value_list

    def validate(self):
        self.validate_required(self.filter_column, 'filter_column')
        self.validate_required(self.value_list, 'value_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.filter_column is not None:
            result['filter_column'] = self.filter_column
        if self.filter_type is not None:
            result['filter_type'] = self.filter_type
        if self.value_list is not None:
            result['value_list'] = self.value_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('filter_column') is not None:
            self.filter_column = m.get('filter_column')
        if m.get('filter_type') is not None:
            self.filter_type = m.get('filter_type')
        if m.get('value_list') is not None:
            self.value_list = m.get('value_list')
        return self


class Address(TeaModel):
    def __init__(
        self,
        city: str = None,
        district: str = None,
    ):
        # 市级
        self.city = city
        # 区、县级
        self.district = district

    def validate(self):
        self.validate_required(self.city, 'city')
        if self.city is not None:
            self.validate_max_length(self.city, 'city', 6)
        if self.district is not None:
            self.validate_max_length(self.district, 'district', 6)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.city is not None:
            result['city'] = self.city
        if self.district is not None:
            result['district'] = self.district
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('city') is not None:
            self.city = m.get('city')
        if m.get('district') is not None:
            self.district = m.get('district')
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


class JudgeCrowdPrefermentRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_no: str = None,
        biz_no_type: str = None,
        encrypt_type: str = None,
        properties: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务号：可以标识用户的编码，例如手机号，身份证号等，通过业务号类型来控制，与biz_no_type和encrypt_type共同确定编码形式。
        self.biz_no = biz_no
        # 业务号类型：1-手机号，2-支付宝用户id
        self.biz_no_type = biz_no_type
        # 加密方式：0-不加密，1-SHA1，2-MD5
        self.encrypt_type = encrypt_type
        # json结构，可以传递自定义参数
        self.properties = properties

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')
        self.validate_required(self.biz_no_type, 'biz_no_type')
        self.validate_required(self.encrypt_type, 'encrypt_type')
        if self.properties is not None:
            self.validate_max_length(self.properties, 'properties', 512)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.biz_no_type is not None:
            result['biz_no_type'] = self.biz_no_type
        if self.encrypt_type is not None:
            result['encrypt_type'] = self.encrypt_type
        if self.properties is not None:
            result['properties'] = self.properties
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('biz_no_type') is not None:
            self.biz_no_type = m.get('biz_no_type')
        if m.get('encrypt_type') is not None:
            self.encrypt_type = m.get('encrypt_type')
        if m.get('properties') is not None:
            self.properties = m.get('properties')
        return self


class JudgeCrowdPrefermentResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        is_preferment: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否优待群体：YES-是，NO-否
        self.is_preferment = is_preferment

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
        if self.is_preferment is not None:
            result['is_preferment'] = self.is_preferment
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('is_preferment') is not None:
            self.is_preferment = m.get('is_preferment')
        return self


class SubmitScenedataTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
        biz_no_type: str = None,
        source_mark: str = None,
        expect_condition: List[BizNoCondition] = None,
        out_batch_no: str = None,
        task_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 【场景】约定的场景枚举
        self.scene = scene
        # 【业务号类型】该字段逐步废弃，枚举-PHONE_SHA1，PHONE_MD5
        self.biz_no_type = biz_no_type
        # 【来源标识】适配客户的来源，可能是客户的任务/AK
        self.source_mark = source_mark
        # 【动态参数】任务动态参数信息
        self.expect_condition = expect_condition
        # 【外部批次号】和任务类型组成唯一键
        self.out_batch_no = out_batch_no
        # 【任务类型】SDS根据类型触发异步处理流程
        self.task_type = task_type

    def validate(self):
        self.validate_required(self.scene, 'scene')
        if self.scene is not None:
            self.validate_max_length(self.scene, 'scene', 32)
        if self.biz_no_type is not None:
            self.validate_max_length(self.biz_no_type, 'biz_no_type', 32)
        if self.source_mark is not None:
            self.validate_max_length(self.source_mark, 'source_mark', 32)
        if self.expect_condition:
            for k in self.expect_condition:
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
        if self.scene is not None:
            result['scene'] = self.scene
        if self.biz_no_type is not None:
            result['biz_no_type'] = self.biz_no_type
        if self.source_mark is not None:
            result['source_mark'] = self.source_mark
        result['expect_condition'] = []
        if self.expect_condition is not None:
            for k in self.expect_condition:
                result['expect_condition'].append(k.to_map() if k else None)
        if self.out_batch_no is not None:
            result['out_batch_no'] = self.out_batch_no
        if self.task_type is not None:
            result['task_type'] = self.task_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('biz_no_type') is not None:
            self.biz_no_type = m.get('biz_no_type')
        if m.get('source_mark') is not None:
            self.source_mark = m.get('source_mark')
        self.expect_condition = []
        if m.get('expect_condition') is not None:
            for k in m.get('expect_condition'):
                temp_model = BizNoCondition()
                self.expect_condition.append(temp_model.from_map(k))
        if m.get('out_batch_no') is not None:
            self.out_batch_no = m.get('out_batch_no')
        if m.get('task_type') is not None:
            self.task_type = m.get('task_type')
        return self


class SubmitScenedataTaskResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        batch_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 创建任务成功后，返回批次号
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
        if m.get('batch_no') is not None:
            self.batch_no = m.get('batch_no')
        return self


class UploadScenedataFileRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        batch_no: str = None,
        file_object: BinaryIO = None,
        file_object_name: str = None,
        file_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 批次号
        self.batch_no = batch_no
        # 文件参数
        # 待上传文件
        self.file_object = file_object
        # 待上传文件名
        self.file_object_name = file_object_name
        self.file_id = file_id

    def validate(self):
        self.validate_required(self.batch_no, 'batch_no')
        if self.batch_no is not None:
            self.validate_max_length(self.batch_no, 'batch_no', 64)
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
        if self.batch_no is not None:
            result['batch_no'] = self.batch_no
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
        if m.get('batch_no') is not None:
            self.batch_no = m.get('batch_no')
        if m.get('fileObject') is not None:
            self.file_object = m.get('fileObject')
        if m.get('fileObjectName') is not None:
            self.file_object_name = m.get('fileObjectName')
        if m.get('file_id') is not None:
            self.file_id = m.get('file_id')
        return self


class UploadScenedataFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        status: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # batchNo对应的任务状态，上传后，返回RECEIVED
        self.status = status

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
        return self


class BatchqueryScenedataTaskresultRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        batch_no: str = None,
        cursor: str = None,
        sync_num: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 批次号
        self.batch_no = batch_no
        # 游标，上一次的最后一条
        self.cursor = cursor
        # 本次同步数量
        self.sync_num = sync_num

    def validate(self):
        self.validate_required(self.batch_no, 'batch_no')
        if self.batch_no is not None:
            self.validate_max_length(self.batch_no, 'batch_no', 64)
        if self.cursor is not None:
            self.validate_max_length(self.cursor, 'cursor', 256)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.batch_no is not None:
            result['batch_no'] = self.batch_no
        if self.cursor is not None:
            result['cursor'] = self.cursor
        if self.sync_num is not None:
            result['sync_num'] = self.sync_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('batch_no') is not None:
            self.batch_no = m.get('batch_no')
        if m.get('cursor') is not None:
            self.cursor = m.get('cursor')
        if m.get('sync_num') is not None:
            self.sync_num = m.get('sync_num')
        return self


class BatchqueryScenedataTaskresultResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        sync_status: str = None,
        last_cursor: str = None,
        result_list: List[BatchResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 0-未开始
        # 1-可继续
        # 2-结束
        self.sync_status = sync_status
        # 本次的最后一个游标，保存起来下一次使用
        self.last_cursor = last_cursor
        # 结果列表
        self.result_list = result_list

    def validate(self):
        if self.result_list:
            for k in self.result_list:
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
        if self.sync_status is not None:
            result['sync_status'] = self.sync_status
        if self.last_cursor is not None:
            result['last_cursor'] = self.last_cursor
        result['result_list'] = []
        if self.result_list is not None:
            for k in self.result_list:
                result['result_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('sync_status') is not None:
            self.sync_status = m.get('sync_status')
        if m.get('last_cursor') is not None:
            self.last_cursor = m.get('last_cursor')
        self.result_list = []
        if m.get('result_list') is not None:
            for k in m.get('result_list'):
                temp_model = BatchResult()
                self.result_list.append(temp_model.from_map(k))
        return self


class QueryScenedataOnlineRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        biz_no: str = None,
        biz_no_type: str = None,
        scene: str = None,
        source_mark: str = None,
        condition: BizNoCondition = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 业务号，根据biz_no_type修改类型
        self.biz_no = biz_no
        # 业务号类型
        self.biz_no_type = biz_no_type
        # 场景，根据此参数路由适配到不同数据源
        self.scene = scene
        # 来源标识
        self.source_mark = source_mark
        # 条件，目前只支持IN的逻辑
        self.condition = condition

    def validate(self):
        self.validate_required(self.biz_no, 'biz_no')
        if self.biz_no is not None:
            self.validate_max_length(self.biz_no, 'biz_no', 256)
        self.validate_required(self.biz_no_type, 'biz_no_type')
        if self.biz_no_type is not None:
            self.validate_max_length(self.biz_no_type, 'biz_no_type', 64)
        self.validate_required(self.scene, 'scene')
        if self.scene is not None:
            self.validate_max_length(self.scene, 'scene', 32)
        if self.source_mark is not None:
            self.validate_max_length(self.source_mark, 'source_mark', 32)
        if self.condition:
            self.condition.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.biz_no_type is not None:
            result['biz_no_type'] = self.biz_no_type
        if self.scene is not None:
            result['scene'] = self.scene
        if self.source_mark is not None:
            result['source_mark'] = self.source_mark
        if self.condition is not None:
            result['condition'] = self.condition.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('biz_no_type') is not None:
            self.biz_no_type = m.get('biz_no_type')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('source_mark') is not None:
            self.source_mark = m.get('source_mark')
        if m.get('condition') is not None:
            temp_model = BizNoCondition()
            self.condition = temp_model.from_map(m['condition'])
        return self


class QueryScenedataOnlineResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 结果字段，可以是Y/程度值/自定义加密串
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


class QueryScenedataTaskinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        batch_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 批次号
        self.batch_no = batch_no

    def validate(self):
        self.validate_required(self.batch_no, 'batch_no')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.batch_no is not None:
            result['batch_no'] = self.batch_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('batch_no') is not None:
            self.batch_no = m.get('batch_no')
        return self


class QueryScenedataTaskinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        task_status: str = None,
        biz_date: str = None,
        scene: str = None,
        task_type: str = None,
        tenant_id: str = None,
        source_mark: str = None,
        create_time: str = None,
        result: TaskDetailResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # -1-无效，0-待处理，1-处理中，2-处理完成
        self.task_status = task_status
        # 业务日期
        self.biz_date = biz_date
        # 场景
        self.scene = scene
        # 任务类型
        self.task_type = task_type
        # 批次所属租户id
        self.tenant_id = tenant_id
        # 来源标识
        self.source_mark = source_mark
        # 任务创建时间
        self.create_time = create_time
        # 批次统计结果信息
        self.result = result

    def validate(self):
        if self.result:
            self.result.validate()

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
        if self.task_status is not None:
            result['task_status'] = self.task_status
        if self.biz_date is not None:
            result['biz_date'] = self.biz_date
        if self.scene is not None:
            result['scene'] = self.scene
        if self.task_type is not None:
            result['task_type'] = self.task_type
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.source_mark is not None:
            result['source_mark'] = self.source_mark
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.result is not None:
            result['result'] = self.result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('task_status') is not None:
            self.task_status = m.get('task_status')
        if m.get('biz_date') is not None:
            self.biz_date = m.get('biz_date')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('task_type') is not None:
            self.task_type = m.get('task_type')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('source_mark') is not None:
            self.source_mark = m.get('source_mark')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('result') is not None:
            temp_model = TaskDetailResult()
            self.result = temp_model.from_map(m['result'])
        return self


class QueryScenedataDwsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        batch_no: str = None,
        biz_type: str = None,
        dimension_list: List[str] = None,
        metric_list: List[Metric] = None,
        filter_condition_list: List[FilterCondition] = None,
        page_num: int = None,
        page_size: int = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 任务批次号
        self.batch_no = batch_no
        # 业务类型
        self.biz_type = biz_type
        # 维度列表
        self.dimension_list = dimension_list
        # 度量列表
        self.metric_list = metric_list
        # 过滤条件列表
        self.filter_condition_list = filter_condition_list
        # 页码,默认1
        self.page_num = page_num
        # 每页数量,默认50
        self.page_size = page_size

    def validate(self):
        self.validate_required(self.batch_no, 'batch_no')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.dimension_list, 'dimension_list')
        self.validate_required(self.metric_list, 'metric_list')
        if self.metric_list:
            for k in self.metric_list:
                if k:
                    k.validate()
        if self.filter_condition_list:
            for k in self.filter_condition_list:
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
        if self.batch_no is not None:
            result['batch_no'] = self.batch_no
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.dimension_list is not None:
            result['dimension_list'] = self.dimension_list
        result['metric_list'] = []
        if self.metric_list is not None:
            for k in self.metric_list:
                result['metric_list'].append(k.to_map() if k else None)
        result['filter_condition_list'] = []
        if self.filter_condition_list is not None:
            for k in self.filter_condition_list:
                result['filter_condition_list'].append(k.to_map() if k else None)
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('batch_no') is not None:
            self.batch_no = m.get('batch_no')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('dimension_list') is not None:
            self.dimension_list = m.get('dimension_list')
        self.metric_list = []
        if m.get('metric_list') is not None:
            for k in m.get('metric_list'):
                temp_model = Metric()
                self.metric_list.append(temp_model.from_map(k))
        self.filter_condition_list = []
        if m.get('filter_condition_list') is not None:
            for k in m.get('filter_condition_list'):
                temp_model = FilterCondition()
                self.filter_condition_list.append(temp_model.from_map(k))
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        return self


class QueryScenedataDwsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_size: int = None,
        page_num: int = None,
        page_size: int = None,
        result_list: List[DwsResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总量
        self.total_size = total_size
        # 页码
        self.page_num = page_num
        # 每页数量
        self.page_size = page_size
        # 结果列表
        self.result_list = result_list

    def validate(self):
        if self.result_list:
            for k in self.result_list:
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
        if self.total_size is not None:
            result['total_size'] = self.total_size
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        result['result_list'] = []
        if self.result_list is not None:
            for k in self.result_list:
                result['result_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_size') is not None:
            self.total_size = m.get('total_size')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        self.result_list = []
        if m.get('result_list') is not None:
            for k in m.get('result_list'):
                temp_model = DwsResult()
                self.result_list.append(temp_model.from_map(k))
        return self


class QueryFavorStocksRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        offset: int = None,
        limit: int = None,
        stock_creator_mchid: str = None,
        create_start_time: str = None,
        create_end_time: str = None,
        status: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 【分页页码】 页码从0开始，默认第0页
        self.offset = offset
        # 【分页大小】 分页大小，最大10
        self.limit = limit
        # 【创建批次的商户号】 批次创建方商户号。
        # 校验规则：接口传入的批次号需由stock_creator_mchid所创建。
        self.stock_creator_mchid = stock_creator_mchid
        # 【起始时间】 起始创建时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35+08:00表示，北京时间2015年5月20日 13点29分35秒。
        # 校验规则：get请求，参数在 url中，需要进行 url 编码传递
        self.create_start_time = create_start_time
        # 【终止时间】 终止创建时间，遵循rfc3339标准格式，格式为yyyy-MM-DDTHH:mm:ss+TIMEZONE，yyyy-MM-DD表示年月日，T出现在字符串中，表示time元素的开头，HH:mm:ss表示时分秒，TIMEZONE表示时区（+08:00表示东八区时间，领先UTC 8小时，即北京时间）。例如：2015-05-20T13:29:35+08:00表示，北京时间2015年5月20日 13点29分35秒。
        # 校验规则：get请求，参数在 url中，需要进行 url 编码传递
        self.create_end_time = create_end_time
        # 【批次状态】 批次状态，枚举值：
        # unactivated：未激活
        # audit：审核中
        # running：运行中
        # stoped：已停止
        # paused：暂停发放
        self.status = status

    def validate(self):
        self.validate_required(self.offset, 'offset')
        self.validate_required(self.limit, 'limit')
        self.validate_required(self.stock_creator_mchid, 'stock_creator_mchid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.offset is not None:
            result['offset'] = self.offset
        if self.limit is not None:
            result['limit'] = self.limit
        if self.stock_creator_mchid is not None:
            result['stock_creator_mchid'] = self.stock_creator_mchid
        if self.create_start_time is not None:
            result['create_start_time'] = self.create_start_time
        if self.create_end_time is not None:
            result['create_end_time'] = self.create_end_time
        if self.status is not None:
            result['status'] = self.status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('offset') is not None:
            self.offset = m.get('offset')
        if m.get('limit') is not None:
            self.limit = m.get('limit')
        if m.get('stock_creator_mchid') is not None:
            self.stock_creator_mchid = m.get('stock_creator_mchid')
        if m.get('create_start_time') is not None:
            self.create_start_time = m.get('create_start_time')
        if m.get('create_end_time') is not None:
            self.create_end_time = m.get('create_end_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        return self


class QueryFavorStocksResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_count: int = None,
        data: List[WxStockData] = None,
        limit: int = None,
        offset: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 【批次总数】 经过条件筛选，查询到的批次总数量。
        self.total_count = total_count
        # 【批次详情】 批次详情
        self.data = data
        # 【分页大小】 分页大小，最大10
        self.limit = limit
        # 【分页页码】 页码从0开始，默认第0页
        self.offset = offset

    def validate(self):
        if self.data:
            for k in self.data:
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
        if self.total_count is not None:
            result['total_count'] = self.total_count
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        if self.limit is not None:
            result['limit'] = self.limit
        if self.offset is not None:
            result['offset'] = self.offset
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = WxStockData()
                self.data.append(temp_model.from_map(k))
        if m.get('limit') is not None:
            self.limit = m.get('limit')
        if m.get('offset') is not None:
            self.offset = m.get('offset')
        return self


class DownloadStockUseflowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bill_date: str = None,
        stock_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 格式：yyyy-MM-DD，仅支持近1年的日期账单数据下载，账单日期需早于当前日期，且在批次有效期内。
        self.bill_date = bill_date
        # 【批次号】单次请求仅支持单批次，校验批次号合法性，需要为创建方创建的批次号，支持全场券、单品券、全场立减、全场折扣、单品立减
        self.stock_id = stock_id

    def validate(self):
        self.validate_required(self.bill_date, 'bill_date')
        self.validate_required(self.stock_id, 'stock_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bill_date is not None:
            result['bill_date'] = self.bill_date
        if self.stock_id is not None:
            result['stock_id'] = self.stock_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bill_date') is not None:
            self.bill_date = m.get('bill_date')
        if m.get('stock_id') is not None:
            self.stock_id = m.get('stock_id')
        return self


class DownloadStockUseflowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        url: str = None,
        stock_useflow_hash: str = None,
        stock_useflow_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 【下载链接】流水文件下载链接，30s内有效
        self.url = url
        # 【核销批次账单文件摘要】默认算法SHA1
        self.stock_useflow_hash = stock_useflow_hash
        # 【核销批次账单记录总条数】记录该批次在该请求日期下的核销记录条数
        self.stock_useflow_count = stock_useflow_count

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
        if self.stock_useflow_hash is not None:
            result['stock_useflow_hash'] = self.stock_useflow_hash
        if self.stock_useflow_count is not None:
            result['stock_useflow_count'] = self.stock_useflow_count
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
        if m.get('stock_useflow_hash') is not None:
            self.stock_useflow_hash = m.get('stock_useflow_hash')
        if m.get('stock_useflow_count') is not None:
            self.stock_useflow_count = m.get('stock_useflow_count')
        return self


class DownloadStockRefundflowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        bill_date: str = None,
        stock_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 格式yyyy-MM- dd仅支持近1年的日期账单数据下载，账单日期需早于当前日期，且在批次有效期内。
        self.bill_date = bill_date
        # 单次请求仅支持单批次，校验批次号合法性，需要为创建方创建的批次号，支持全场券、单品券、全场立减、全场折扣、单品立减。
        self.stock_id = stock_id

    def validate(self):
        self.validate_required(self.bill_date, 'bill_date')
        self.validate_required(self.stock_id, 'stock_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.bill_date is not None:
            result['bill_date'] = self.bill_date
        if self.stock_id is not None:
            result['stock_id'] = self.stock_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('bill_date') is not None:
            self.bill_date = m.get('bill_date')
        if m.get('stock_id') is not None:
            self.stock_id = m.get('stock_id')
        return self


class DownloadStockRefundflowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        url: str = None,
        stock_refundflow_hash: str = None,
        stock_refundflow_count: int = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 【下载链接】流水文件下载链接，30s内有效
        self.url = url
        # 【退款批次账单文件摘要】默认算法SHA1
        self.stock_refundflow_hash = stock_refundflow_hash
        # 【退款批次账单记录总条数】记录该批次在请求日期下的退款记录条数
        self.stock_refundflow_count = stock_refundflow_count

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
        if self.stock_refundflow_hash is not None:
            result['stock_refundflow_hash'] = self.stock_refundflow_hash
        if self.stock_refundflow_count is not None:
            result['stock_refundflow_count'] = self.stock_refundflow_count
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
        if m.get('stock_refundflow_hash') is not None:
            self.stock_refundflow_hash = m.get('stock_refundflow_hash')
        if m.get('stock_refundflow_count') is not None:
            self.stock_refundflow_count = m.get('stock_refundflow_count')
        return self


class UpdateScenedataTaskRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        batch_no: str = None,
        async_task_status: str = None,
        expect_condition: List[BizNoCondition] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 【批次号】submit接口返回的批次号
        self.batch_no = batch_no
        # 【异步任务上下线】INIT-初始化异步任务，异步任务开始执行，同时可以修改拓展参数，必须先下线才能初始化。INVALID-下线异步任务，停止异步任务执行。传空不修改。一次只能提一个任务状态变更。
        self.async_task_status = async_task_status
        # 【拓展参数】下线后，可以修改拓展参数，再次上线后生效。处理该拓展参数的任务，需要对参数做校验，避免参数改动太大，任务恢复异常。
        self.expect_condition = expect_condition

    def validate(self):
        self.validate_required(self.batch_no, 'batch_no')
        self.validate_required(self.async_task_status, 'async_task_status')
        if self.expect_condition:
            for k in self.expect_condition:
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
        if self.batch_no is not None:
            result['batch_no'] = self.batch_no
        if self.async_task_status is not None:
            result['async_task_status'] = self.async_task_status
        result['expect_condition'] = []
        if self.expect_condition is not None:
            for k in self.expect_condition:
                result['expect_condition'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('batch_no') is not None:
            self.batch_no = m.get('batch_no')
        if m.get('async_task_status') is not None:
            self.async_task_status = m.get('async_task_status')
        self.expect_condition = []
        if m.get('expect_condition') is not None:
            for k in m.get('expect_condition'):
                temp_model = BizNoCondition()
                self.expect_condition.append(temp_model.from_map(k))
        return self


class UpdateScenedataTaskResponse(TeaModel):
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


