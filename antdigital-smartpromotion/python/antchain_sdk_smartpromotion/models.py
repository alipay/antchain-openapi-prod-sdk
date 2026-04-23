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


class ProductSpecOption(TeaModel):
    def __init__(
        self,
        spec_key: str = None,
        display_name: str = None,
        spec_value: str = None,
    ):
        # 规格key
        self.spec_key = spec_key
        # 规格名称
        self.display_name = display_name
        # 规格值
        self.spec_value = spec_value

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.spec_key is not None:
            result['spec_key'] = self.spec_key
        if self.display_name is not None:
            result['display_name'] = self.display_name
        if self.spec_value is not None:
            result['spec_value'] = self.spec_value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('spec_key') is not None:
            self.spec_key = m.get('spec_key')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        if m.get('spec_value') is not None:
            self.spec_value = m.get('spec_value')
        return self


class FileInfo(TeaModel):
    def __init__(
        self,
        file_name: str = None,
        file_key: str = None,
    ):
        # 文件名称
        self.file_name = file_name
        # 文件key
        self.file_key = file_key

    def validate(self):
        self.validate_required(self.file_name, 'file_name')
        self.validate_required(self.file_key, 'file_key')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.file_key is not None:
            result['file_key'] = self.file_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('file_key') is not None:
            self.file_key = m.get('file_key')
        return self


class PaymentItem(TeaModel):
    def __init__(
        self,
        amount: int = None,
        payment_type: str = None,
    ):
        # 付款金额，单位分
        self.amount = amount
        # 付款项目类型
        self.payment_type = payment_type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.amount is not None:
            result['amount'] = self.amount
        if self.payment_type is not None:
            result['payment_type'] = self.payment_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('amount') is not None:
            self.amount = m.get('amount')
        if m.get('payment_type') is not None:
            self.payment_type = m.get('payment_type')
        return self


class ProductSpecValue(TeaModel):
    def __init__(
        self,
        spec_value: str = None,
        image_file_key: str = None,
        large_image_file_key: str = None,
    ):
        # 规格值
        self.spec_value = spec_value
        # 规格图片key
        self.image_file_key = image_file_key
        # 规格图片http链接
        self.large_image_file_key = large_image_file_key

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.spec_value is not None:
            result['spec_value'] = self.spec_value
        if self.image_file_key is not None:
            result['image_file_key'] = self.image_file_key
        if self.large_image_file_key is not None:
            result['large_image_file_key'] = self.large_image_file_key
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('spec_value') is not None:
            self.spec_value = m.get('spec_value')
        if m.get('image_file_key') is not None:
            self.image_file_key = m.get('image_file_key')
        if m.get('large_image_file_key') is not None:
            self.large_image_file_key = m.get('large_image_file_key')
        return self


class LeasePriceProp(TeaModel):
    def __init__(
        self,
        merchant_sku_id: str = None,
        product_spec_option_list: List[ProductSpecOption] = None,
        spec_image_file_key: str = None,
        large_spec_image_file_key: str = None,
        origin_total_rent_money: int = None,
        total_rent_money: int = None,
        origin_daily_rent_money: int = None,
        daily_rent_money: int = None,
        stock_quantity: int = None,
        renew_price: int = None,
        buyout_price: int = None,
        for_sale: bool = None,
    ):
        # 商户商品skuId
        self.merchant_sku_id = merchant_sku_id
        # 商品规格列表
        self.product_spec_option_list = product_spec_option_list
        # 规格图片
        self.spec_image_file_key = spec_image_file_key
        # 规格图片
        self.large_spec_image_file_key = large_spec_image_file_key
        # 原订单总金额（单位分）
        self.origin_total_rent_money = origin_total_rent_money
        # 现订单总金额（单位分）
        self.total_rent_money = total_rent_money
        # 原日租金（单位分）
        self.origin_daily_rent_money = origin_daily_rent_money
        # 现日租金（单位分）
        self.daily_rent_money = daily_rent_money
        # 库存
        self.stock_quantity = stock_quantity
        # 续租价（单位分）
        self.renew_price = renew_price
        # 买断价（单位分）
        self.buyout_price = buyout_price
        # 是否可售卖
        self.for_sale = for_sale

    def validate(self):
        if self.product_spec_option_list:
            for k in self.product_spec_option_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.merchant_sku_id is not None:
            result['merchant_sku_id'] = self.merchant_sku_id
        result['product_spec_option_list'] = []
        if self.product_spec_option_list is not None:
            for k in self.product_spec_option_list:
                result['product_spec_option_list'].append(k.to_map() if k else None)
        if self.spec_image_file_key is not None:
            result['spec_image_file_key'] = self.spec_image_file_key
        if self.large_spec_image_file_key is not None:
            result['large_spec_image_file_key'] = self.large_spec_image_file_key
        if self.origin_total_rent_money is not None:
            result['origin_total_rent_money'] = self.origin_total_rent_money
        if self.total_rent_money is not None:
            result['total_rent_money'] = self.total_rent_money
        if self.origin_daily_rent_money is not None:
            result['origin_daily_rent_money'] = self.origin_daily_rent_money
        if self.daily_rent_money is not None:
            result['daily_rent_money'] = self.daily_rent_money
        if self.stock_quantity is not None:
            result['stock_quantity'] = self.stock_quantity
        if self.renew_price is not None:
            result['renew_price'] = self.renew_price
        if self.buyout_price is not None:
            result['buyout_price'] = self.buyout_price
        if self.for_sale is not None:
            result['for_sale'] = self.for_sale
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('merchant_sku_id') is not None:
            self.merchant_sku_id = m.get('merchant_sku_id')
        self.product_spec_option_list = []
        if m.get('product_spec_option_list') is not None:
            for k in m.get('product_spec_option_list'):
                temp_model = ProductSpecOption()
                self.product_spec_option_list.append(temp_model.from_map(k))
        if m.get('spec_image_file_key') is not None:
            self.spec_image_file_key = m.get('spec_image_file_key')
        if m.get('large_spec_image_file_key') is not None:
            self.large_spec_image_file_key = m.get('large_spec_image_file_key')
        if m.get('origin_total_rent_money') is not None:
            self.origin_total_rent_money = m.get('origin_total_rent_money')
        if m.get('total_rent_money') is not None:
            self.total_rent_money = m.get('total_rent_money')
        if m.get('origin_daily_rent_money') is not None:
            self.origin_daily_rent_money = m.get('origin_daily_rent_money')
        if m.get('daily_rent_money') is not None:
            self.daily_rent_money = m.get('daily_rent_money')
        if m.get('stock_quantity') is not None:
            self.stock_quantity = m.get('stock_quantity')
        if m.get('renew_price') is not None:
            self.renew_price = m.get('renew_price')
        if m.get('buyout_price') is not None:
            self.buyout_price = m.get('buyout_price')
        if m.get('for_sale') is not None:
            self.for_sale = m.get('for_sale')
        return self


class MerchantPerformanceRedeemResultInfo(TeaModel):
    def __init__(
        self,
        redeem_way: str = None,
        redeem_time: str = None,
        redeem_reason: str = None,
        redeem_type: str = None,
        redeem_amount: int = None,
        redeem_status: str = None,
    ):
        # 回购支付方式
        # ONLINE-线上
        # OFFLINE-线下
        self.redeem_way = redeem_way
        # 回购时间
        self.redeem_time = redeem_time
        # 回购原因
        # ACTIVE_REDEEM("ACTIVE_REDEEM", "自主赎回"),
        # RENTING_OUT_REDEEM("RENTING_OUT_REDEEM",
        # "退租赎回"),
        # RENTING_AND_RESALE_REDEEM("RENTING_AND_RESALE_REDEEM",
        # "租转售赎回");
        self.redeem_reason = redeem_reason
        # 回购类型
        # TRANSFER，转账代偿
        # WITHHOLD，代扣代偿
        self.redeem_type = redeem_type
        # 回购金额（分）
        self.redeem_amount = redeem_amount
        # 回购状态
        # PAYING 回购中
        # SUCCESS 成功
        # FAILED 失败
        self.redeem_status = redeem_status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.redeem_way is not None:
            result['redeem_way'] = self.redeem_way
        if self.redeem_time is not None:
            result['redeem_time'] = self.redeem_time
        if self.redeem_reason is not None:
            result['redeem_reason'] = self.redeem_reason
        if self.redeem_type is not None:
            result['redeem_type'] = self.redeem_type
        if self.redeem_amount is not None:
            result['redeem_amount'] = self.redeem_amount
        if self.redeem_status is not None:
            result['redeem_status'] = self.redeem_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('redeem_way') is not None:
            self.redeem_way = m.get('redeem_way')
        if m.get('redeem_time') is not None:
            self.redeem_time = m.get('redeem_time')
        if m.get('redeem_reason') is not None:
            self.redeem_reason = m.get('redeem_reason')
        if m.get('redeem_type') is not None:
            self.redeem_type = m.get('redeem_type')
        if m.get('redeem_amount') is not None:
            self.redeem_amount = m.get('redeem_amount')
        if m.get('redeem_status') is not None:
            self.redeem_status = m.get('redeem_status')
        return self


class SingleTermDetail(TeaModel):
    def __init__(
        self,
        period_num: int = None,
        pay_amount: int = None,
    ):
        # 期数
        self.period_num = period_num
        # 支付金额
        self.pay_amount = pay_amount

    def validate(self):
        self.validate_required(self.period_num, 'period_num')
        if self.period_num is not None:
            self.validate_minimum(self.period_num, 'period_num', 1)
        self.validate_required(self.pay_amount, 'pay_amount')
        if self.pay_amount is not None:
            self.validate_minimum(self.pay_amount, 'pay_amount', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.pay_amount is not None:
            result['pay_amount'] = self.pay_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('pay_amount') is not None:
            self.pay_amount = m.get('pay_amount')
        return self


class OperationDivideTransInDetailInfo(TeaModel):
    def __init__(
        self,
        trans_in_name: str = None,
        trans_in_user_id: str = None,
        divide_amount: int = None,
        desc: str = None,
        divide_status: str = None,
    ):
        # 分账收入方名称
        self.trans_in_name = trans_in_name
        # 分账收入方支付宝用户id, 支付宝2088id
        self.trans_in_user_id = trans_in_user_id
        # 分账金额，单位为分
        self.divide_amount = divide_amount
        # 分账描述
        self.desc = desc
        # INIT("INIT", "初始化"),
        # PROCESSING("PROCESSING", "处理中"),
        # FAILED("FAILED", "失败"),
        # SUCCESS("SUCCESS", "分账成功");
        self.divide_status = divide_status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.trans_in_name is not None:
            result['trans_in_name'] = self.trans_in_name
        if self.trans_in_user_id is not None:
            result['trans_in_user_id'] = self.trans_in_user_id
        if self.divide_amount is not None:
            result['divide_amount'] = self.divide_amount
        if self.desc is not None:
            result['desc'] = self.desc
        if self.divide_status is not None:
            result['divide_status'] = self.divide_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('trans_in_name') is not None:
            self.trans_in_name = m.get('trans_in_name')
        if m.get('trans_in_user_id') is not None:
            self.trans_in_user_id = m.get('trans_in_user_id')
        if m.get('divide_amount') is not None:
            self.divide_amount = m.get('divide_amount')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        if m.get('divide_status') is not None:
            self.divide_status = m.get('divide_status')
        return self


class LeasePricePlan(TeaModel):
    def __init__(
        self,
        rental_plan: str = None,
        rental_period: int = None,
        lease_price_prop_list: List[LeasePriceProp] = None,
    ):
        # 租赁方案
        self.rental_plan = rental_plan
        # 租赁周期
        self.rental_period = rental_period
        # 租赁价格属性列表
        self.lease_price_prop_list = lease_price_prop_list

    def validate(self):
        if self.lease_price_prop_list:
            for k in self.lease_price_prop_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.rental_plan is not None:
            result['rental_plan'] = self.rental_plan
        if self.rental_period is not None:
            result['rental_period'] = self.rental_period
        result['lease_price_prop_list'] = []
        if self.lease_price_prop_list is not None:
            for k in self.lease_price_prop_list:
                result['lease_price_prop_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('rental_plan') is not None:
            self.rental_plan = m.get('rental_plan')
        if m.get('rental_period') is not None:
            self.rental_period = m.get('rental_period')
        self.lease_price_prop_list = []
        if m.get('lease_price_prop_list') is not None:
            for k in m.get('lease_price_prop_list'):
                temp_model = LeasePriceProp()
                self.lease_price_prop_list.append(temp_model.from_map(k))
        return self


class StaticDataModuleDetail(TeaModel):
    def __init__(
        self,
        property_text: str = None,
        property_value: str = None,
        icon: str = None,
        grey_icon: str = None,
        children_detail_list: str = None,
        has_children: bool = None,
    ):
        # 描述
        self.property_text = property_text
        # 商户类型
        self.property_value = property_value
        # 图标
        self.icon = icon
        # 置灰图标
        self.grey_icon = grey_icon
        # 叶子结点，目前存的一级类目下的二级类目
        self.children_detail_list = children_detail_list
        # 是否有叶子结点
        self.has_children = has_children

    def validate(self):
        self.validate_required(self.property_text, 'property_text')
        self.validate_required(self.property_value, 'property_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.property_text is not None:
            result['property_text'] = self.property_text
        if self.property_value is not None:
            result['property_value'] = self.property_value
        if self.icon is not None:
            result['icon'] = self.icon
        if self.grey_icon is not None:
            result['grey_icon'] = self.grey_icon
        if self.children_detail_list is not None:
            result['children_detail_list'] = self.children_detail_list
        if self.has_children is not None:
            result['has_children'] = self.has_children
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('property_text') is not None:
            self.property_text = m.get('property_text')
        if m.get('property_value') is not None:
            self.property_value = m.get('property_value')
        if m.get('icon') is not None:
            self.icon = m.get('icon')
        if m.get('grey_icon') is not None:
            self.grey_icon = m.get('grey_icon')
        if m.get('children_detail_list') is not None:
            self.children_detail_list = m.get('children_detail_list')
        if m.get('has_children') is not None:
            self.has_children = m.get('has_children')
        return self


class SiteInfo(TeaModel):
    def __init__(
        self,
        tiny_app_id: str = None,
        site_name: str = None,
        screenshot_file: FileInfo = None,
        site_url: str = None,
        site_type: str = None,
    ):
        # 小程序id
        self.tiny_app_id = tiny_app_id
        # 站点名称
        self.site_name = site_name
        # 
        # 截图照片
        self.screenshot_file = screenshot_file
        # 站点地址
        self.site_url = site_url
        # 站点类型
        # 网站: 01
        # APP: 02
        # 服务窗: 03
        # 公众号: 04
        # 其他: 05
        # 支付宝小程序: 06
        # 手机网站/H5: 07
        self.site_type = site_type

    def validate(self):
        if self.screenshot_file:
            self.screenshot_file.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tiny_app_id is not None:
            result['tiny_app_id'] = self.tiny_app_id
        if self.site_name is not None:
            result['site_name'] = self.site_name
        if self.screenshot_file is not None:
            result['screenshot_file'] = self.screenshot_file.to_map()
        if self.site_url is not None:
            result['site_url'] = self.site_url
        if self.site_type is not None:
            result['site_type'] = self.site_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tiny_app_id') is not None:
            self.tiny_app_id = m.get('tiny_app_id')
        if m.get('site_name') is not None:
            self.site_name = m.get('site_name')
        if m.get('screenshot_file') is not None:
            temp_model = FileInfo()
            self.screenshot_file = temp_model.from_map(m['screenshot_file'])
        if m.get('site_url') is not None:
            self.site_url = m.get('site_url')
        if m.get('site_type') is not None:
            self.site_type = m.get('site_type')
        return self


class ScalperQueryOrderItem(TeaModel):
    def __init__(
        self,
        order_items_name: str = None,
        order_items_quantity: int = None,
        order_items_price: int = None,
    ):
        # 订单商品名称
        self.order_items_name = order_items_name
        # 订单商品数量
        self.order_items_quantity = order_items_quantity
        # 订单商品价格，单位：分
        self.order_items_price = order_items_price

    def validate(self):
        if self.order_items_name is not None:
            self.validate_max_length(self.order_items_name, 'order_items_name', 256)
        if self.order_items_quantity is not None:
            self.validate_maximum(self.order_items_quantity, 'order_items_quantity', 100000)
            self.validate_minimum(self.order_items_quantity, 'order_items_quantity', 1)
        if self.order_items_price is not None:
            self.validate_maximum(self.order_items_price, 'order_items_price', 10000000)
            self.validate_minimum(self.order_items_price, 'order_items_price', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_items_name is not None:
            result['order_items_name'] = self.order_items_name
        if self.order_items_quantity is not None:
            result['order_items_quantity'] = self.order_items_quantity
        if self.order_items_price is not None:
            result['order_items_price'] = self.order_items_price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_items_name') is not None:
            self.order_items_name = m.get('order_items_name')
        if m.get('order_items_quantity') is not None:
            self.order_items_quantity = m.get('order_items_quantity')
        if m.get('order_items_price') is not None:
            self.order_items_price = m.get('order_items_price')
        return self


class SignProductMerchant(TeaModel):
    def __init__(
        self,
        merchant_product_id: str = None,
        merchant_brand: str = None,
        merchant_logo: str = None,
        large_merchant_logo: str = None,
        grayed: bool = None,
    ):
        # 商户商品spuId
        self.merchant_product_id = merchant_product_id
        # 商户品牌
        self.merchant_brand = merchant_brand
        # 商户logo
        self.merchant_logo = merchant_logo
        # 商户logo
        self.large_merchant_logo = large_merchant_logo
        # 是否置灰
        self.grayed = grayed

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.merchant_product_id is not None:
            result['merchant_product_id'] = self.merchant_product_id
        if self.merchant_brand is not None:
            result['merchant_brand'] = self.merchant_brand
        if self.merchant_logo is not None:
            result['merchant_logo'] = self.merchant_logo
        if self.large_merchant_logo is not None:
            result['large_merchant_logo'] = self.large_merchant_logo
        if self.grayed is not None:
            result['grayed'] = self.grayed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('merchant_product_id') is not None:
            self.merchant_product_id = m.get('merchant_product_id')
        if m.get('merchant_brand') is not None:
            self.merchant_brand = m.get('merchant_brand')
        if m.get('merchant_logo') is not None:
            self.merchant_logo = m.get('merchant_logo')
        if m.get('large_merchant_logo') is not None:
            self.large_merchant_logo = m.get('large_merchant_logo')
        if m.get('grayed') is not None:
            self.grayed = m.get('grayed')
        return self


class ProductSpecConfig(TeaModel):
    def __init__(
        self,
        spec_key: str = None,
        display_name: str = None,
        spec_value_list: List[ProductSpecValue] = None,
    ):
        # 规格名称
        self.spec_key = spec_key
        # 规格名称
        self.display_name = display_name
        # 允许值列表
        self.spec_value_list = spec_value_list

    def validate(self):
        if self.spec_value_list:
            for k in self.spec_value_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.spec_key is not None:
            result['spec_key'] = self.spec_key
        if self.display_name is not None:
            result['display_name'] = self.display_name
        result['spec_value_list'] = []
        if self.spec_value_list is not None:
            for k in self.spec_value_list:
                result['spec_value_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('spec_key') is not None:
            self.spec_key = m.get('spec_key')
        if m.get('display_name') is not None:
            self.display_name = m.get('display_name')
        self.spec_value_list = []
        if m.get('spec_value_list') is not None:
            for k in m.get('spec_value_list'):
                temp_model = ProductSpecValue()
                self.spec_value_list.append(temp_model.from_map(k))
        return self


class SubRentRiskItem(TeaModel):
    def __init__(
        self,
        risk_name: str = None,
        risk_rank: str = None,
        risk_desc: str = None,
    ):
        # 风险名称。枚举值：BASE_PERFORMANCE - 基础履约风险；OVERDUE - 逾期风险；MULTI_RENT - 共租风险。
        self.risk_name = risk_name
        # 风险等级。枚举值：RANK0-无法判断；RANK1-极低风险；RANK2-低风险；RANK3-中风险；RANK4-高风险；RANK5-极高风险。
        self.risk_rank = risk_rank
        # 风险描述
        self.risk_desc = risk_desc

    def validate(self):
        self.validate_required(self.risk_name, 'risk_name')
        self.validate_required(self.risk_rank, 'risk_rank')
        self.validate_required(self.risk_desc, 'risk_desc')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.risk_name is not None:
            result['risk_name'] = self.risk_name
        if self.risk_rank is not None:
            result['risk_rank'] = self.risk_rank
        if self.risk_desc is not None:
            result['risk_desc'] = self.risk_desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('risk_name') is not None:
            self.risk_name = m.get('risk_name')
        if m.get('risk_rank') is not None:
            self.risk_rank = m.get('risk_rank')
        if m.get('risk_desc') is not None:
            self.risk_desc = m.get('risk_desc')
        return self


class OrderRepayStrategy(TeaModel):
    def __init__(
        self,
        term_index: int = None,
        rental_money: int = None,
        pay_day: str = None,
        payment_item_list: List[PaymentItem] = None,
        no_performance: str = None,
    ):
        # 还款期数
        self.term_index = term_index
        # 每期应还租金(分)
        self.rental_money = rental_money
        # 每期应付时间
        self.pay_day = pay_day
        # 付款项目列表
        self.payment_item_list = payment_item_list
        # 是否无需履约
        self.no_performance = no_performance

    def validate(self):
        if self.payment_item_list:
            for k in self.payment_item_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.term_index is not None:
            result['term_index'] = self.term_index
        if self.rental_money is not None:
            result['rental_money'] = self.rental_money
        if self.pay_day is not None:
            result['pay_day'] = self.pay_day
        result['payment_item_list'] = []
        if self.payment_item_list is not None:
            for k in self.payment_item_list:
                result['payment_item_list'].append(k.to_map() if k else None)
        if self.no_performance is not None:
            result['no_performance'] = self.no_performance
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('term_index') is not None:
            self.term_index = m.get('term_index')
        if m.get('rental_money') is not None:
            self.rental_money = m.get('rental_money')
        if m.get('pay_day') is not None:
            self.pay_day = m.get('pay_day')
        self.payment_item_list = []
        if m.get('payment_item_list') is not None:
            for k in m.get('payment_item_list'):
                temp_model = PaymentItem()
                self.payment_item_list.append(temp_model.from_map(k))
        if m.get('no_performance') is not None:
            self.no_performance = m.get('no_performance')
        return self


class ExpandProcessInfo(TeaModel):
    def __init__(
        self,
        process_node: str = None,
        is_submitted: bool = None,
        audit_status: str = None,
    ):
        # TENANT_INDIRECT_MAINCLASS(间联类目)
        # TENANT_ENDPOINT（回调地址）
        # CUSTOM_SERVICE_INFO（客服信息）
        # AGENTCUSTOMERPESONINFO（间联客诉人员）
        # MERCHANT_EXPAND（商户进件）
        self.process_node = process_node
        # 是否已提交
        self.is_submitted = is_submitted
        # 审核通过
        self.audit_status = audit_status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.process_node is not None:
            result['process_node'] = self.process_node
        if self.is_submitted is not None:
            result['is_submitted'] = self.is_submitted
        if self.audit_status is not None:
            result['audit_status'] = self.audit_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('process_node') is not None:
            self.process_node = m.get('process_node')
        if m.get('is_submitted') is not None:
            self.is_submitted = m.get('is_submitted')
        if m.get('audit_status') is not None:
            self.audit_status = m.get('audit_status')
        return self


class InsureProductInfo(TeaModel):
    def __init__(
        self,
        product_id: str = None,
        product_imei_id: str = None,
        purchase_amount: int = None,
    ):
        # 商品库id
        self.product_id = product_id
        # 商品设备编号
        self.product_imei_id = product_imei_id
        # 商品采购价，单位：分
        self.purchase_amount = purchase_amount

    def validate(self):
        self.validate_required(self.product_id, 'product_id')
        if self.product_id is not None:
            self.validate_max_length(self.product_id, 'product_id', 128)
        self.validate_required(self.product_imei_id, 'product_imei_id')
        if self.product_imei_id is not None:
            self.validate_max_length(self.product_imei_id, 'product_imei_id', 256)
        self.validate_required(self.purchase_amount, 'purchase_amount')
        if self.purchase_amount is not None:
            self.validate_maximum(self.purchase_amount, 'purchase_amount', 100000000)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_id is not None:
            result['product_id'] = self.product_id
        if self.product_imei_id is not None:
            result['product_imei_id'] = self.product_imei_id
        if self.purchase_amount is not None:
            result['purchase_amount'] = self.purchase_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        if m.get('product_imei_id') is not None:
            self.product_imei_id = m.get('product_imei_id')
        if m.get('purchase_amount') is not None:
            self.purchase_amount = m.get('purchase_amount')
        return self


class TemplateInfo(TeaModel):
    def __init__(
        self,
        template_id: str = None,
        template_version: int = None,
        template_args: str = None,
        merchant_id: str = None,
    ):
        # 模板id
        self.template_id = template_id
        # 模板版本，不传取最新模板
        self.template_version = template_version
        # 模板参数，JSON格式，其中key对应模板中的名称，value对应其要渲染的值
        self.template_args = template_args
        # 模板所属商户id
        self.merchant_id = merchant_id

    def validate(self):
        self.validate_required(self.template_id, 'template_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.template_version is not None:
            result['template_version'] = self.template_version
        if self.template_args is not None:
            result['template_args'] = self.template_args
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        if m.get('template_args') is not None:
            self.template_args = m.get('template_args')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        return self


class OrderInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        order_create_time: str = None,
        order_pay_time: str = None,
        total_rent_money: int = None,
        rent_term: int = None,
        rent_unit: str = None,
        order_status: str = None,
        order_sub_status: str = None,
        deposit_price: int = None,
        buy_out_price: int = None,
        logistic_type: str = None,
        due_mode: int = None,
        down_payment: int = None,
        merchant_id: str = None,
        merchant_name: str = None,
        divide_start_term_index: int = None,
        promotion_id: str = None,
        fund_mode: str = None,
        pay_channel: str = None,
    ):
        # 订单id
        self.order_id = order_id
        # 订单创建时间
        self.order_create_time = order_create_time
        # 订单支付时间
        self.order_pay_time = order_pay_time
        # 租金总额(分)
        self.total_rent_money = total_rent_money
        # 租期
        self.rent_term = rent_term
        # 租期单位
        self.rent_unit = rent_unit
        # 订单状态
        self.order_status = order_status
        # 订单子状态
        self.order_sub_status = order_sub_status
        # 免押金额（分）
        self.deposit_price = deposit_price
        # 到期买断价(分)
        self.buy_out_price = buy_out_price
        # 物流方案
        self.logistic_type = logistic_type
        # 到期形式
        # NA(0, "无意义"),
        # BUYOUT(1, "到期买断或归还"),
        # FREE_ON_RENT(2, "租满即送"),
        # RENEW_LEASE(3, "续租"),;
        self.due_mode = due_mode
        # 首付款金额(分)
        self.down_payment = down_payment
        # 商户统一社会信用代码
        self.merchant_id = merchant_id
        # 商户名称
        self.merchant_name = merchant_name
        # 订单开始履约期数
        self.divide_start_term_index = divide_start_term_index
        # 订单关联的营销id
        self.promotion_id = promotion_id
        # 融资类型
        # SUPPLY_CHAIN_FINANCE
        self.fund_mode = fund_mode
        # 订单支付渠道
        # ALIPAY
        # JDPAY
        self.pay_channel = pay_channel

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.order_create_time is not None:
            result['order_create_time'] = self.order_create_time
        if self.order_pay_time is not None:
            result['order_pay_time'] = self.order_pay_time
        if self.total_rent_money is not None:
            result['total_rent_money'] = self.total_rent_money
        if self.rent_term is not None:
            result['rent_term'] = self.rent_term
        if self.rent_unit is not None:
            result['rent_unit'] = self.rent_unit
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.order_sub_status is not None:
            result['order_sub_status'] = self.order_sub_status
        if self.deposit_price is not None:
            result['deposit_price'] = self.deposit_price
        if self.buy_out_price is not None:
            result['buy_out_price'] = self.buy_out_price
        if self.logistic_type is not None:
            result['logistic_type'] = self.logistic_type
        if self.due_mode is not None:
            result['due_mode'] = self.due_mode
        if self.down_payment is not None:
            result['down_payment'] = self.down_payment
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.divide_start_term_index is not None:
            result['divide_start_term_index'] = self.divide_start_term_index
        if self.promotion_id is not None:
            result['promotion_id'] = self.promotion_id
        if self.fund_mode is not None:
            result['fund_mode'] = self.fund_mode
        if self.pay_channel is not None:
            result['pay_channel'] = self.pay_channel
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('order_create_time') is not None:
            self.order_create_time = m.get('order_create_time')
        if m.get('order_pay_time') is not None:
            self.order_pay_time = m.get('order_pay_time')
        if m.get('total_rent_money') is not None:
            self.total_rent_money = m.get('total_rent_money')
        if m.get('rent_term') is not None:
            self.rent_term = m.get('rent_term')
        if m.get('rent_unit') is not None:
            self.rent_unit = m.get('rent_unit')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('order_sub_status') is not None:
            self.order_sub_status = m.get('order_sub_status')
        if m.get('deposit_price') is not None:
            self.deposit_price = m.get('deposit_price')
        if m.get('buy_out_price') is not None:
            self.buy_out_price = m.get('buy_out_price')
        if m.get('logistic_type') is not None:
            self.logistic_type = m.get('logistic_type')
        if m.get('due_mode') is not None:
            self.due_mode = m.get('due_mode')
        if m.get('down_payment') is not None:
            self.down_payment = m.get('down_payment')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('divide_start_term_index') is not None:
            self.divide_start_term_index = m.get('divide_start_term_index')
        if m.get('promotion_id') is not None:
            self.promotion_id = m.get('promotion_id')
        if m.get('fund_mode') is not None:
            self.fund_mode = m.get('fund_mode')
        if m.get('pay_channel') is not None:
            self.pay_channel = m.get('pay_channel')
        return self


class NoticeInfo(TeaModel):
    def __init__(
        self,
        notice_id: int = None,
        title: str = None,
        notice_create_time: str = None,
        unread: bool = None,
    ):
        # 通知id
        self.notice_id = notice_id
        # 通知标题
        self.title = title
        # 通知创建时间
        self.notice_create_time = notice_create_time
        # 是否未读
        self.unread = unread

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.notice_id is not None:
            result['notice_id'] = self.notice_id
        if self.title is not None:
            result['title'] = self.title
        if self.notice_create_time is not None:
            result['notice_create_time'] = self.notice_create_time
        if self.unread is not None:
            result['unread'] = self.unread
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('notice_id') is not None:
            self.notice_id = m.get('notice_id')
        if m.get('title') is not None:
            self.title = m.get('title')
        if m.get('notice_create_time') is not None:
            self.notice_create_time = m.get('notice_create_time')
        if m.get('unread') is not None:
            self.unread = m.get('unread')
        return self


class AuditInfo(TeaModel):
    def __init__(
        self,
        stage: str = None,
        audit_subject: str = None,
        status: str = None,
        apply_date_str: str = None,
        fail_reason: str = None,
    ):
        # 审核步骤
        self.stage = stage
        # 审核主体
        self.audit_subject = audit_subject
        # 审核状态
        self.status = status
        # 审核时间
        self.apply_date_str = apply_date_str
        # 审核失败描述
        self.fail_reason = fail_reason

    def validate(self):
        self.validate_required(self.stage, 'stage')
        self.validate_required(self.audit_subject, 'audit_subject')
        self.validate_required(self.status, 'status')
        self.validate_required(self.apply_date_str, 'apply_date_str')
        self.validate_required(self.fail_reason, 'fail_reason')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.stage is not None:
            result['stage'] = self.stage
        if self.audit_subject is not None:
            result['audit_subject'] = self.audit_subject
        if self.status is not None:
            result['status'] = self.status
        if self.apply_date_str is not None:
            result['apply_date_str'] = self.apply_date_str
        if self.fail_reason is not None:
            result['fail_reason'] = self.fail_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('stage') is not None:
            self.stage = m.get('stage')
        if m.get('audit_subject') is not None:
            self.audit_subject = m.get('audit_subject')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('apply_date_str') is not None:
            self.apply_date_str = m.get('apply_date_str')
        if m.get('fail_reason') is not None:
            self.fail_reason = m.get('fail_reason')
        return self


class LegalInfoUpdate(TeaModel):
    def __init__(
        self,
        legal_name: str = None,
        legal_cert_no: str = None,
        legal_cert_front_file: FileInfo = None,
        legal_cert_back_file: FileInfo = None,
    ):
        # 法人名称
        self.legal_name = legal_name
        # 法人证件号
        self.legal_cert_no = legal_cert_no
        # 法人证件正面
        self.legal_cert_front_file = legal_cert_front_file
        # 法人证件反面
        self.legal_cert_back_file = legal_cert_back_file

    def validate(self):
        if self.legal_cert_front_file:
            self.legal_cert_front_file.validate()
        if self.legal_cert_back_file:
            self.legal_cert_back_file.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.legal_name is not None:
            result['legal_name'] = self.legal_name
        if self.legal_cert_no is not None:
            result['legal_cert_no'] = self.legal_cert_no
        if self.legal_cert_front_file is not None:
            result['legal_cert_front_file'] = self.legal_cert_front_file.to_map()
        if self.legal_cert_back_file is not None:
            result['legal_cert_back_file'] = self.legal_cert_back_file.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('legal_name') is not None:
            self.legal_name = m.get('legal_name')
        if m.get('legal_cert_no') is not None:
            self.legal_cert_no = m.get('legal_cert_no')
        if m.get('legal_cert_front_file') is not None:
            temp_model = FileInfo()
            self.legal_cert_front_file = temp_model.from_map(m['legal_cert_front_file'])
        if m.get('legal_cert_back_file') is not None:
            temp_model = FileInfo()
            self.legal_cert_back_file = temp_model.from_map(m['legal_cert_back_file'])
        return self


class AssetPackagePromisePlan(TeaModel):
    def __init__(
        self,
        period_num: int = None,
        pay_day: str = None,
        total_amount: int = None,
        principal_amount: int = None,
        interest_amount: int = None,
        order_count: int = None,
    ):
        # 账期
        self.period_num = period_num
        # 还款时间yyyy-MM-dd
        self.pay_day = pay_day
        # 计划还款总额，单位为分
        self.total_amount = total_amount
        # 本金，单位为分
        self.principal_amount = principal_amount
        # 利息，单位为分
        self.interest_amount = interest_amount
        # 构成订单数
        self.order_count = order_count

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.pay_day is not None:
            result['pay_day'] = self.pay_day
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.principal_amount is not None:
            result['principal_amount'] = self.principal_amount
        if self.interest_amount is not None:
            result['interest_amount'] = self.interest_amount
        if self.order_count is not None:
            result['order_count'] = self.order_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('pay_day') is not None:
            self.pay_day = m.get('pay_day')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('principal_amount') is not None:
            self.principal_amount = m.get('principal_amount')
        if m.get('interest_amount') is not None:
            self.interest_amount = m.get('interest_amount')
        if m.get('order_count') is not None:
            self.order_count = m.get('order_count')
        return self


class PurchaseQueryModel(TeaModel):
    def __init__(
        self,
        out_order_no: str = None,
        order_no: str = None,
        bank_card_no: str = None,
        company_name: str = None,
        sales_amount: int = None,
    ):
        # 支付宝外部交易号
        self.out_order_no = out_order_no
        # 支付宝内部生成的交易号
        self.order_no = order_no
        # 银行卡号
        self.bank_card_no = bank_card_no
        # 公司名称
        self.company_name = company_name
        # 金额，用户购买或使用服务时产生的具体金额，单位：分
        self.sales_amount = sales_amount

    def validate(self):
        if self.out_order_no is not None:
            self.validate_max_length(self.out_order_no, 'out_order_no', 128)
        if self.order_no is not None:
            self.validate_max_length(self.order_no, 'order_no', 50)
        if self.bank_card_no is not None:
            self.validate_max_length(self.bank_card_no, 'bank_card_no', 52)
        if self.company_name is not None:
            self.validate_max_length(self.company_name, 'company_name', 50)
        if self.sales_amount is not None:
            self.validate_maximum(self.sales_amount, 'sales_amount', 10000000)
            self.validate_minimum(self.sales_amount, 'sales_amount', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.out_order_no is not None:
            result['out_order_no'] = self.out_order_no
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.bank_card_no is not None:
            result['bank_card_no'] = self.bank_card_no
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.sales_amount is not None:
            result['sales_amount'] = self.sales_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('out_order_no') is not None:
            self.out_order_no = m.get('out_order_no')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('bank_card_no') is not None:
            self.bank_card_no = m.get('bank_card_no')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('sales_amount') is not None:
            self.sales_amount = m.get('sales_amount')
        return self


class RiskScene(TeaModel):
    def __init__(
        self,
        scene_code: str = None,
        decision: str = None,
    ):
        # 风险场景编码
        self.scene_code = scene_code
        # 该场景的风险决策结果
        self.decision = decision

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.decision, 'decision')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.decision is not None:
            result['decision'] = self.decision
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        return self


class RelationPage(TeaModel):
    def __init__(
        self,
        relation_id: str = None,
        company_name: str = None,
        merchant_id: str = None,
        status: str = None,
        subject_merchant_id: str = None,
        subject_company_name: str = None,
        pay_channel: str = None,
    ):
        # 分账关系id
        self.relation_id = relation_id
        # 分账公司名称
        self.company_name = company_name
        # 分账公司名称统一社会信用代码
        self.merchant_id = merchant_id
        # 审核状态
        self.status = status
        # 商户公司统一社会信用代码
        self.subject_merchant_id = subject_merchant_id
        # 商户公司名称
        self.subject_company_name = subject_company_name
        # 支付渠道
        # ALIPAY
        # JDPAY
        self.pay_channel = pay_channel

    def validate(self):
        self.validate_required(self.relation_id, 'relation_id')
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.status, 'status')
        self.validate_required(self.subject_merchant_id, 'subject_merchant_id')
        self.validate_required(self.subject_company_name, 'subject_company_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.relation_id is not None:
            result['relation_id'] = self.relation_id
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.status is not None:
            result['status'] = self.status
        if self.subject_merchant_id is not None:
            result['subject_merchant_id'] = self.subject_merchant_id
        if self.subject_company_name is not None:
            result['subject_company_name'] = self.subject_company_name
        if self.pay_channel is not None:
            result['pay_channel'] = self.pay_channel
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('relation_id') is not None:
            self.relation_id = m.get('relation_id')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('subject_merchant_id') is not None:
            self.subject_merchant_id = m.get('subject_merchant_id')
        if m.get('subject_company_name') is not None:
            self.subject_company_name = m.get('subject_company_name')
        if m.get('pay_channel') is not None:
            self.pay_channel = m.get('pay_channel')
        return self


class BaddebtQueryModel(TeaModel):
    def __init__(
        self,
        service_category: str = None,
        total_amount: int = None,
        total_quantity: int = None,
        user_name: str = None,
        isv_pid: str = None,
        apdid: str = None,
    ):
        # 服务分类，服务二级分类
        self.service_category = service_category
        # 总金额，用户购买或使用服务时产生的具体金额
        self.total_amount = total_amount
        # 商品数量，用户购买或使用服务时产生的具体商品数量
        self.total_quantity = total_quantity
        # 用户姓名
        self.user_name = user_name
        # 服务商 pid
        self.isv_pid = isv_pid
        # 终端唯一标识
        self.apdid = apdid

    def validate(self):
        if self.service_category is not None:
            self.validate_max_length(self.service_category, 'service_category', 128)
        if self.total_amount is not None:
            self.validate_maximum(self.total_amount, 'total_amount', 10000000)
            self.validate_minimum(self.total_amount, 'total_amount', 1)
        if self.total_quantity is not None:
            self.validate_maximum(self.total_quantity, 'total_quantity', 10000)
            self.validate_minimum(self.total_quantity, 'total_quantity', 1)
        if self.user_name is not None:
            self.validate_max_length(self.user_name, 'user_name', 128)
        if self.isv_pid is not None:
            self.validate_max_length(self.isv_pid, 'isv_pid', 128)
        if self.apdid is not None:
            self.validate_max_length(self.apdid, 'apdid', 128)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.service_category is not None:
            result['service_category'] = self.service_category
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.total_quantity is not None:
            result['total_quantity'] = self.total_quantity
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.isv_pid is not None:
            result['isv_pid'] = self.isv_pid
        if self.apdid is not None:
            result['apdid'] = self.apdid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('service_category') is not None:
            self.service_category = m.get('service_category')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('total_quantity') is not None:
            self.total_quantity = m.get('total_quantity')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('isv_pid') is not None:
            self.isv_pid = m.get('isv_pid')
        if m.get('apdid') is not None:
            self.apdid = m.get('apdid')
        return self


class CompanyInfoUpdate(TeaModel):
    def __init__(
        self,
        business_license_file: FileInfo = None,
        product_main_class: str = None,
        company_name: str = None,
        company_alias_name: str = None,
        tenant_id: str = None,
        company_mobile: str = None,
        company_address: str = None,
        contact_name: str = None,
        contact_mobile: str = None,
        merchant_type: str = None,
    ):
        # 营业执照文件信息
        self.business_license_file = business_license_file
        # 业务类型 枚举
        self.product_main_class = product_main_class
        # 公司名称
        self.company_name = company_name
        # 公司别名
        self.company_alias_name = company_alias_name
        # 公司数科租户id
        self.tenant_id = tenant_id
        # 公司联系电话
        self.company_mobile = company_mobile
        # 公司联系地址
        self.company_address = company_address
        # 联系人姓名
        self.contact_name = contact_name
        # 联系人手机号码
        self.contact_mobile = contact_mobile
        # 商户类型： 01：企业；07：个体工商户 默认不填为01
        self.merchant_type = merchant_type

    def validate(self):
        if self.business_license_file:
            self.business_license_file.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.business_license_file is not None:
            result['business_license_file'] = self.business_license_file.to_map()
        if self.product_main_class is not None:
            result['product_main_class'] = self.product_main_class
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.company_alias_name is not None:
            result['company_alias_name'] = self.company_alias_name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.company_mobile is not None:
            result['company_mobile'] = self.company_mobile
        if self.company_address is not None:
            result['company_address'] = self.company_address
        if self.contact_name is not None:
            result['contact_name'] = self.contact_name
        if self.contact_mobile is not None:
            result['contact_mobile'] = self.contact_mobile
        if self.merchant_type is not None:
            result['merchant_type'] = self.merchant_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('business_license_file') is not None:
            temp_model = FileInfo()
            self.business_license_file = temp_model.from_map(m['business_license_file'])
        if m.get('product_main_class') is not None:
            self.product_main_class = m.get('product_main_class')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('company_alias_name') is not None:
            self.company_alias_name = m.get('company_alias_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('company_mobile') is not None:
            self.company_mobile = m.get('company_mobile')
        if m.get('company_address') is not None:
            self.company_address = m.get('company_address')
        if m.get('contact_name') is not None:
            self.contact_name = m.get('contact_name')
        if m.get('contact_mobile') is not None:
            self.contact_mobile = m.get('contact_mobile')
        if m.get('merchant_type') is not None:
            self.merchant_type = m.get('merchant_type')
        return self


class SalesChannel(TeaModel):
    def __init__(
        self,
        channel_code: str = None,
        channel_name: str = None,
        channel_level: int = None,
    ):
        # 渠道码
        self.channel_code = channel_code
        # 渠道名称
        self.channel_name = channel_name
        # 渠道级别，从小到大代表级别由高到低
        self.channel_level = channel_level

    def validate(self):
        self.validate_required(self.channel_code, 'channel_code')
        self.validate_required(self.channel_name, 'channel_name')
        self.validate_required(self.channel_level, 'channel_level')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.channel_code is not None:
            result['channel_code'] = self.channel_code
        if self.channel_name is not None:
            result['channel_name'] = self.channel_name
        if self.channel_level is not None:
            result['channel_level'] = self.channel_level
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('channel_code') is not None:
            self.channel_code = m.get('channel_code')
        if m.get('channel_name') is not None:
            self.channel_name = m.get('channel_name')
        if m.get('channel_level') is not None:
            self.channel_level = m.get('channel_level')
        return self


class MerchantOrderFulfillmentInfo(TeaModel):
    def __init__(
        self,
        term_index: int = None,
        lease_term_index: int = None,
        rental_return_state: str = None,
        return_way: str = None,
        pay_type: str = None,
        total_money: int = None,
        return_time: str = None,
        return_voucher_serial: str = None,
        alipay_trade_no: str = None,
        fund_company_name: str = None,
        payment_description: str = None,
    ):
        # 还款期数
        self.term_index = term_index
        # 订单用户租期编号
        self.lease_term_index = lease_term_index
        # 租期归还状态
        self.rental_return_state = rental_return_state
        # 还款方式
        self.return_way = return_way
        # 支付类型
        self.pay_type = pay_type
        # 实际到账金额
        self.total_money = total_money
        # 实际还款时间(yyyy-MM-dd HH:mm:ss)
        self.return_time = return_time
        # 外部交易流水号
        self.return_voucher_serial = return_voucher_serial
        # 支付宝交易流水号
        self.alipay_trade_no = alipay_trade_no
        # 资方公司名称
        self.fund_company_name = fund_company_name
        # 支付描述
        self.payment_description = payment_description

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.term_index is not None:
            result['term_index'] = self.term_index
        if self.lease_term_index is not None:
            result['lease_term_index'] = self.lease_term_index
        if self.rental_return_state is not None:
            result['rental_return_state'] = self.rental_return_state
        if self.return_way is not None:
            result['return_way'] = self.return_way
        if self.pay_type is not None:
            result['pay_type'] = self.pay_type
        if self.total_money is not None:
            result['total_money'] = self.total_money
        if self.return_time is not None:
            result['return_time'] = self.return_time
        if self.return_voucher_serial is not None:
            result['return_voucher_serial'] = self.return_voucher_serial
        if self.alipay_trade_no is not None:
            result['alipay_trade_no'] = self.alipay_trade_no
        if self.fund_company_name is not None:
            result['fund_company_name'] = self.fund_company_name
        if self.payment_description is not None:
            result['payment_description'] = self.payment_description
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('term_index') is not None:
            self.term_index = m.get('term_index')
        if m.get('lease_term_index') is not None:
            self.lease_term_index = m.get('lease_term_index')
        if m.get('rental_return_state') is not None:
            self.rental_return_state = m.get('rental_return_state')
        if m.get('return_way') is not None:
            self.return_way = m.get('return_way')
        if m.get('pay_type') is not None:
            self.pay_type = m.get('pay_type')
        if m.get('total_money') is not None:
            self.total_money = m.get('total_money')
        if m.get('return_time') is not None:
            self.return_time = m.get('return_time')
        if m.get('return_voucher_serial') is not None:
            self.return_voucher_serial = m.get('return_voucher_serial')
        if m.get('alipay_trade_no') is not None:
            self.alipay_trade_no = m.get('alipay_trade_no')
        if m.get('fund_company_name') is not None:
            self.fund_company_name = m.get('fund_company_name')
        if m.get('payment_description') is not None:
            self.payment_description = m.get('payment_description')
        return self


class TerminateApplyEvidence(TeaModel):
    def __init__(
        self,
        terminate_apply_reason: str = None,
        terminate_apply_refer: str = None,
        user_phone_num: str = None,
        terminate_apply_evidences: List[str] = None,
        terminate_operate_time: str = None,
    ):
        # 用户申请解约问题类型
        self.terminate_apply_reason = terminate_apply_reason
        # 用户申请解约问题描述
        self.terminate_apply_refer = terminate_apply_refer
        # 用户联系电话
        self.user_phone_num = user_phone_num
        # 用户申请解约证据（图片、视频）
        self.terminate_apply_evidences = terminate_apply_evidences
        # 用户申请提交材料时间
        self.terminate_operate_time = terminate_operate_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.terminate_apply_reason is not None:
            result['terminate_apply_reason'] = self.terminate_apply_reason
        if self.terminate_apply_refer is not None:
            result['terminate_apply_refer'] = self.terminate_apply_refer
        if self.user_phone_num is not None:
            result['user_phone_num'] = self.user_phone_num
        if self.terminate_apply_evidences is not None:
            result['terminate_apply_evidences'] = self.terminate_apply_evidences
        if self.terminate_operate_time is not None:
            result['terminate_operate_time'] = self.terminate_operate_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('terminate_apply_reason') is not None:
            self.terminate_apply_reason = m.get('terminate_apply_reason')
        if m.get('terminate_apply_refer') is not None:
            self.terminate_apply_refer = m.get('terminate_apply_refer')
        if m.get('user_phone_num') is not None:
            self.user_phone_num = m.get('user_phone_num')
        if m.get('terminate_apply_evidences') is not None:
            self.terminate_apply_evidences = m.get('terminate_apply_evidences')
        if m.get('terminate_operate_time') is not None:
            self.terminate_operate_time = m.get('terminate_operate_time')
        return self


class OrderLogisticInfo(TeaModel):
    def __init__(
        self,
        logistic_order_id: str = None,
        logistic_status: str = None,
    ):
        # 物流单号
        self.logistic_order_id = logistic_order_id
        # 物流状态
        self.logistic_status = logistic_status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.logistic_order_id is not None:
            result['logistic_order_id'] = self.logistic_order_id
        if self.logistic_status is not None:
            result['logistic_status'] = self.logistic_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('logistic_order_id') is not None:
            self.logistic_order_id = m.get('logistic_order_id')
        if m.get('logistic_status') is not None:
            self.logistic_status = m.get('logistic_status')
        return self


class MerchantHoldingInfo(TeaModel):
    def __init__(
        self,
        holding_type_name: str = None,
        holding_company: str = None,
        certificate_number: str = None,
        long_date: bool = None,
        expire_date: str = None,
    ):
        # 控股类型名称
        # 企业股东:ENTERPRISE_SHAREHOLDER
        # 个人股东:PERSONAL_SHAREHOLDER
        self.holding_type_name = holding_type_name
        # 控股公司名称
        self.holding_company = holding_company
        # 证件号码
        self.certificate_number = certificate_number
        # 证件是否长期有效
        # 长期true，
        # 否则false
        self.long_date = long_date
        # 失效时间
        # 商户控股信息longdate为true 时，可为空 ，格式YYYY-MM-DD
        self.expire_date = expire_date

    def validate(self):
        self.validate_required(self.holding_type_name, 'holding_type_name')
        self.validate_required(self.holding_company, 'holding_company')
        self.validate_required(self.certificate_number, 'certificate_number')
        self.validate_required(self.long_date, 'long_date')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.holding_type_name is not None:
            result['holding_type_name'] = self.holding_type_name
        if self.holding_company is not None:
            result['holding_company'] = self.holding_company
        if self.certificate_number is not None:
            result['certificate_number'] = self.certificate_number
        if self.long_date is not None:
            result['long_date'] = self.long_date
        if self.expire_date is not None:
            result['expire_date'] = self.expire_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('holding_type_name') is not None:
            self.holding_type_name = m.get('holding_type_name')
        if m.get('holding_company') is not None:
            self.holding_company = m.get('holding_company')
        if m.get('certificate_number') is not None:
            self.certificate_number = m.get('certificate_number')
        if m.get('long_date') is not None:
            self.long_date = m.get('long_date')
        if m.get('expire_date') is not None:
            self.expire_date = m.get('expire_date')
        return self


class AssetPackagePlanAllocateDetail(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        tenant_id: str = None,
        type: str = None,
        period_num: int = None,
        pay_day: str = None,
        pay_amount: int = None,
        divide_ratio: str = None,
        divide_amount: int = None,
    ):
        # 订单id
        self.order_id = order_id
        # 商户租户id
        self.tenant_id = tenant_id
        # 类型
        # PERFORMANCE 履约
        # ASSET_PACKAGE_EXCESS 资产包超额
        self.type = type
        # 用户还款期数
        self.period_num = period_num
        # 用户还款时间yyyy-MM-dd
        self.pay_day = pay_day
        # 用户还款金额，单位为分
        self.pay_amount = pay_amount
        # 分账比例(不存储实时计算)，保留两位小数，比例统一类型。
        self.divide_ratio = divide_ratio
        # 商户履约分账金额
        self.divide_amount = divide_amount

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.type is not None:
            result['type'] = self.type
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.pay_day is not None:
            result['pay_day'] = self.pay_day
        if self.pay_amount is not None:
            result['pay_amount'] = self.pay_amount
        if self.divide_ratio is not None:
            result['divide_ratio'] = self.divide_ratio
        if self.divide_amount is not None:
            result['divide_amount'] = self.divide_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('pay_day') is not None:
            self.pay_day = m.get('pay_day')
        if m.get('pay_amount') is not None:
            self.pay_amount = m.get('pay_amount')
        if m.get('divide_ratio') is not None:
            self.divide_ratio = m.get('divide_ratio')
        if m.get('divide_amount') is not None:
            self.divide_amount = m.get('divide_amount')
        return self


class ApplicationInfo(TeaModel):
    def __init__(
        self,
        application_scene: str = None,
        tiny_app_id: str = None,
        site_name: str = None,
        sit_url: str = None,
        merchant_name: str = None,
        merchant_service_name: str = None,
        merchant_service_desc: str = None,
        site_info: List[SiteInfo] = None,
    ):
        # 应用场景（payChannel =JDPAY仅支持MINI_APP）
        # MINI_APP 小程序
        # APP 自有app
        # ALL 两种都有
        self.application_scene = application_scene
        # 小程序id
        self.tiny_app_id = tiny_app_id
        # 小程序名称
        self.site_name = site_name
        # 网站地址（pay_channel=ALIPAY必填）
        self.sit_url = sit_url
        # 商户名称。（pay_channel=ALIPAY必填）
        # 修改后的商户名称，将同步支付宝代扣签约页面字段展示
        # 
        self.merchant_name = merchant_name
        # 商户服务名称。（pay_channel=ALIPAY必填）
        # 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
        self.merchant_service_name = merchant_service_name
        # 商户服务描述。（pay_channel=ALIPAY必填）
        # 修改后的商户服务描述，将同步支付宝代扣签约页面字段展示
        self.merchant_service_desc = merchant_service_desc
        # 站点信息
        self.site_info = site_info

    def validate(self):
        if self.site_info:
            for k in self.site_info:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.application_scene is not None:
            result['application_scene'] = self.application_scene
        if self.tiny_app_id is not None:
            result['tiny_app_id'] = self.tiny_app_id
        if self.site_name is not None:
            result['site_name'] = self.site_name
        if self.sit_url is not None:
            result['sit_url'] = self.sit_url
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.merchant_service_name is not None:
            result['merchant_service_name'] = self.merchant_service_name
        if self.merchant_service_desc is not None:
            result['merchant_service_desc'] = self.merchant_service_desc
        result['site_info'] = []
        if self.site_info is not None:
            for k in self.site_info:
                result['site_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('application_scene') is not None:
            self.application_scene = m.get('application_scene')
        if m.get('tiny_app_id') is not None:
            self.tiny_app_id = m.get('tiny_app_id')
        if m.get('site_name') is not None:
            self.site_name = m.get('site_name')
        if m.get('sit_url') is not None:
            self.sit_url = m.get('sit_url')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('merchant_service_name') is not None:
            self.merchant_service_name = m.get('merchant_service_name')
        if m.get('merchant_service_desc') is not None:
            self.merchant_service_desc = m.get('merchant_service_desc')
        self.site_info = []
        if m.get('site_info') is not None:
            for k in m.get('site_info'):
                temp_model = SiteInfo()
                self.site_info.append(temp_model.from_map(k))
        return self


class ItemDetail(TeaModel):
    def __init__(
        self,
        goods_category: str = None,
        item_name: str = None,
        quantity: int = None,
    ):
        # 租赁商品类目，可选类型：
        # RENT_PHONE - 手机租赁；RENT_COMPUTER - 电脑/平板租赁；RENT_CAMERA - 数码摄像租赁；RENT_DIGITAL - 数码其他租赁；RENT_STATIONERY - 电子词典/电纸书/文化用品租赁；RENT_CLOTHING - 服装租赁
        self.goods_category = goods_category
        # 租赁商品名称
        self.item_name = item_name
        # 租赁商品数量
        self.quantity = quantity

    def validate(self):
        if self.goods_category is not None:
            self.validate_max_length(self.goods_category, 'goods_category', 30)
        if self.item_name is not None:
            self.validate_max_length(self.item_name, 'item_name', 128)
        if self.quantity is not None:
            self.validate_maximum(self.quantity, 'quantity', 10000)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.goods_category is not None:
            result['goods_category'] = self.goods_category
        if self.item_name is not None:
            result['item_name'] = self.item_name
        if self.quantity is not None:
            result['quantity'] = self.quantity
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('goods_category') is not None:
            self.goods_category = m.get('goods_category')
        if m.get('item_name') is not None:
            self.item_name = m.get('item_name')
        if m.get('quantity') is not None:
            self.quantity = m.get('quantity')
        return self


class RiskGoModel(TeaModel):
    def __init__(
        self,
        risk_type: str = None,
        risk_value: str = None,
        risk_desc: str = None,
        info_code: str = None,
    ):
        # 风险类型。
        # 枚举值：MARKETING_PURCHASE_COMMON 营销抢购风险识别；INDUSTRY_SCALPER_COMMON 行业黄牛风险识别；MARKETING_AWARDING_COMMON 营销发奖风险识别；INDUSTRY_FARMING_COMMON 行业刷单风险识别；INDUSTRY_BADDEBT_COMMON 履约坏账风险识别
        self.risk_type = risk_type
        # 风险等级。
        # 枚举：rank0 无法判断；rank1 极低风险；rank2 较低风险；rank3 中风险；rank4 高风险；rank5 极高风险
        self.risk_value = risk_value
        # 风险描述
        self.risk_desc = risk_desc
        # 风险标签
        self.info_code = info_code

    def validate(self):
        self.validate_required(self.risk_type, 'risk_type')
        self.validate_required(self.risk_value, 'risk_value')
        self.validate_required(self.risk_desc, 'risk_desc')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.risk_type is not None:
            result['risk_type'] = self.risk_type
        if self.risk_value is not None:
            result['risk_value'] = self.risk_value
        if self.risk_desc is not None:
            result['risk_desc'] = self.risk_desc
        if self.info_code is not None:
            result['info_code'] = self.info_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('risk_type') is not None:
            self.risk_type = m.get('risk_type')
        if m.get('risk_value') is not None:
            self.risk_value = m.get('risk_value')
        if m.get('risk_desc') is not None:
            self.risk_desc = m.get('risk_desc')
        if m.get('info_code') is not None:
            self.info_code = m.get('info_code')
        return self


class SingleCancelModel(TeaModel):
    def __init__(
        self,
        period_num: int = None,
        gmt_pay: str = None,
        pay_off_amount: int = None,
        pay_off_type: str = None,
        pay_off_no: str = None,
        pay_off_bank_name: str = None,
    ):
        # 第几期
        self.period_num = period_num
        # 其他方式还款的时间
        self.gmt_pay = gmt_pay
        # 取消订单某一期代扣计划中以其他方式还款金额，单位为分
        self.pay_off_amount = pay_off_amount
        # 变更其他方式还款WECHAT:微信; BANK:银行
        # ALIPAY:支付宝
        # CASH:现金
        self.pay_off_type = pay_off_type
        # 通过其他方式还款单号;例如银行流水号或微信流水号
        self.pay_off_no = pay_off_no
        # 其他方式还款银行名称，还款方式为银行时必填
        self.pay_off_bank_name = pay_off_bank_name

    def validate(self):
        self.validate_required(self.period_num, 'period_num')
        if self.period_num is not None:
            self.validate_minimum(self.period_num, 'period_num', 1)
        self.validate_required(self.gmt_pay, 'gmt_pay')
        if self.gmt_pay is not None:
            self.validate_pattern(self.gmt_pay, 'gmt_pay', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.pay_off_amount, 'pay_off_amount')
        if self.pay_off_amount is not None:
            self.validate_minimum(self.pay_off_amount, 'pay_off_amount', 0)
        if self.pay_off_type is not None:
            self.validate_max_length(self.pay_off_type, 'pay_off_type', 64)
        if self.pay_off_no is not None:
            self.validate_max_length(self.pay_off_no, 'pay_off_no', 64)
        if self.pay_off_bank_name is not None:
            self.validate_max_length(self.pay_off_bank_name, 'pay_off_bank_name', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.gmt_pay is not None:
            result['gmt_pay'] = self.gmt_pay
        if self.pay_off_amount is not None:
            result['pay_off_amount'] = self.pay_off_amount
        if self.pay_off_type is not None:
            result['pay_off_type'] = self.pay_off_type
        if self.pay_off_no is not None:
            result['pay_off_no'] = self.pay_off_no
        if self.pay_off_bank_name is not None:
            result['pay_off_bank_name'] = self.pay_off_bank_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('gmt_pay') is not None:
            self.gmt_pay = m.get('gmt_pay')
        if m.get('pay_off_amount') is not None:
            self.pay_off_amount = m.get('pay_off_amount')
        if m.get('pay_off_type') is not None:
            self.pay_off_type = m.get('pay_off_type')
        if m.get('pay_off_no') is not None:
            self.pay_off_no = m.get('pay_off_no')
        if m.get('pay_off_bank_name') is not None:
            self.pay_off_bank_name = m.get('pay_off_bank_name')
        return self


class RiskModel(TeaModel):
    def __init__(
        self,
        scene_code: str = None,
        score: str = None,
        delinquency_rate: str = None,
        risk_advice: str = None,
        risk_rank: str = None,
        flow_id: str = None,
        mob_three_score: str = None,
        fpd_thirty_score: str = None,
    ):
        # 风险场景编码
        self.scene_code = scene_code
        # 该风险场景的风险分值
        self.score = score
        # 逾期率
        self.delinquency_rate = delinquency_rate
        # 风险建议
        self.risk_advice = risk_advice
        # 风险等级
        self.risk_rank = risk_rank
        # 流程id
        self.flow_id = flow_id
        # 拒量模型捞回分
        self.mob_three_score = mob_three_score
        # 拒量模型首逾分
        self.fpd_thirty_score = fpd_thirty_score

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.score, 'score')
        self.validate_required(self.flow_id, 'flow_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.score is not None:
            result['score'] = self.score
        if self.delinquency_rate is not None:
            result['delinquency_rate'] = self.delinquency_rate
        if self.risk_advice is not None:
            result['risk_advice'] = self.risk_advice
        if self.risk_rank is not None:
            result['risk_rank'] = self.risk_rank
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        if self.mob_three_score is not None:
            result['mob_three_score'] = self.mob_three_score
        if self.fpd_thirty_score is not None:
            result['fpd_thirty_score'] = self.fpd_thirty_score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('score') is not None:
            self.score = m.get('score')
        if m.get('delinquency_rate') is not None:
            self.delinquency_rate = m.get('delinquency_rate')
        if m.get('risk_advice') is not None:
            self.risk_advice = m.get('risk_advice')
        if m.get('risk_rank') is not None:
            self.risk_rank = m.get('risk_rank')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        if m.get('mob_three_score') is not None:
            self.mob_three_score = m.get('mob_three_score')
        if m.get('fpd_thirty_score') is not None:
            self.fpd_thirty_score = m.get('fpd_thirty_score')
        return self


class SceneProductInfoResp(TeaModel):
    def __init__(
        self,
        platform_product_id: str = None,
        product_name: str = None,
        first_cover_image_url: str = None,
        large_first_cover_image_url: str = None,
        spec_config_list: List[ProductSpecConfig] = None,
        rental_plan: List[str] = None,
        rental_period: List[int] = None,
        support_renew: bool = None,
        support_buyout: bool = None,
        lowest_daily_rent_money: int = None,
        lowest_daily_rent_money_yuan: str = None,
        highest_daily_rent_money: int = None,
        highest_daily_rent_money_yuan: str = None,
        added_flag: bool = None,
        sign_product_merchant_list: List[SignProductMerchant] = None,
        sign_product_merchant_count: int = None,
        apply_product_merchant_list: List[SignProductMerchant] = None,
        apply_product_merchant_count: int = None,
        display_status: str = None,
        delivery_mode: str = None,
    ):
        # 平台商品id
        self.platform_product_id = platform_product_id
        # 商品名称
        self.product_name = product_name
        # 封面首图url链接
        self.first_cover_image_url = first_cover_image_url
        # 封面首图url链接
        self.large_first_cover_image_url = large_first_cover_image_url
        # 产品规格列表
        self.spec_config_list = spec_config_list
        # 租赁方案
        self.rental_plan = rental_plan
        # 租赁周期
        self.rental_period = rental_period
        # 可续租
        self.support_renew = support_renew
        # 可买断
        self.support_buyout = support_buyout
        # 最低日租金
        self.lowest_daily_rent_money = lowest_daily_rent_money
        # 最低日租金
        self.lowest_daily_rent_money_yuan = lowest_daily_rent_money_yuan
        # 最高日租金
        self.highest_daily_rent_money = highest_daily_rent_money
        # 最高日租金
        self.highest_daily_rent_money_yuan = highest_daily_rent_money_yuan
        # 添加标志
        self.added_flag = added_flag
        # 报名商家列表
        self.sign_product_merchant_list = sign_product_merchant_list
        # 报名商家数量
        self.sign_product_merchant_count = sign_product_merchant_count
        # 适用商家列表
        self.apply_product_merchant_list = apply_product_merchant_list
        # 适用商家数量
        self.apply_product_merchant_count = apply_product_merchant_count
        # 场景商品上下架状态
        self.display_status = display_status
        # 推广方式
        self.delivery_mode = delivery_mode

    def validate(self):
        if self.spec_config_list:
            for k in self.spec_config_list:
                if k:
                    k.validate()
        if self.sign_product_merchant_list:
            for k in self.sign_product_merchant_list:
                if k:
                    k.validate()
        if self.apply_product_merchant_list:
            for k in self.apply_product_merchant_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.platform_product_id is not None:
            result['platform_product_id'] = self.platform_product_id
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.first_cover_image_url is not None:
            result['first_cover_image_url'] = self.first_cover_image_url
        if self.large_first_cover_image_url is not None:
            result['large_first_cover_image_url'] = self.large_first_cover_image_url
        result['spec_config_list'] = []
        if self.spec_config_list is not None:
            for k in self.spec_config_list:
                result['spec_config_list'].append(k.to_map() if k else None)
        if self.rental_plan is not None:
            result['rental_plan'] = self.rental_plan
        if self.rental_period is not None:
            result['rental_period'] = self.rental_period
        if self.support_renew is not None:
            result['support_renew'] = self.support_renew
        if self.support_buyout is not None:
            result['support_buyout'] = self.support_buyout
        if self.lowest_daily_rent_money is not None:
            result['lowest_daily_rent_money'] = self.lowest_daily_rent_money
        if self.lowest_daily_rent_money_yuan is not None:
            result['lowest_daily_rent_money_yuan'] = self.lowest_daily_rent_money_yuan
        if self.highest_daily_rent_money is not None:
            result['highest_daily_rent_money'] = self.highest_daily_rent_money
        if self.highest_daily_rent_money_yuan is not None:
            result['highest_daily_rent_money_yuan'] = self.highest_daily_rent_money_yuan
        if self.added_flag is not None:
            result['added_flag'] = self.added_flag
        result['sign_product_merchant_list'] = []
        if self.sign_product_merchant_list is not None:
            for k in self.sign_product_merchant_list:
                result['sign_product_merchant_list'].append(k.to_map() if k else None)
        if self.sign_product_merchant_count is not None:
            result['sign_product_merchant_count'] = self.sign_product_merchant_count
        result['apply_product_merchant_list'] = []
        if self.apply_product_merchant_list is not None:
            for k in self.apply_product_merchant_list:
                result['apply_product_merchant_list'].append(k.to_map() if k else None)
        if self.apply_product_merchant_count is not None:
            result['apply_product_merchant_count'] = self.apply_product_merchant_count
        if self.display_status is not None:
            result['display_status'] = self.display_status
        if self.delivery_mode is not None:
            result['delivery_mode'] = self.delivery_mode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('platform_product_id') is not None:
            self.platform_product_id = m.get('platform_product_id')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('first_cover_image_url') is not None:
            self.first_cover_image_url = m.get('first_cover_image_url')
        if m.get('large_first_cover_image_url') is not None:
            self.large_first_cover_image_url = m.get('large_first_cover_image_url')
        self.spec_config_list = []
        if m.get('spec_config_list') is not None:
            for k in m.get('spec_config_list'):
                temp_model = ProductSpecConfig()
                self.spec_config_list.append(temp_model.from_map(k))
        if m.get('rental_plan') is not None:
            self.rental_plan = m.get('rental_plan')
        if m.get('rental_period') is not None:
            self.rental_period = m.get('rental_period')
        if m.get('support_renew') is not None:
            self.support_renew = m.get('support_renew')
        if m.get('support_buyout') is not None:
            self.support_buyout = m.get('support_buyout')
        if m.get('lowest_daily_rent_money') is not None:
            self.lowest_daily_rent_money = m.get('lowest_daily_rent_money')
        if m.get('lowest_daily_rent_money_yuan') is not None:
            self.lowest_daily_rent_money_yuan = m.get('lowest_daily_rent_money_yuan')
        if m.get('highest_daily_rent_money') is not None:
            self.highest_daily_rent_money = m.get('highest_daily_rent_money')
        if m.get('highest_daily_rent_money_yuan') is not None:
            self.highest_daily_rent_money_yuan = m.get('highest_daily_rent_money_yuan')
        if m.get('added_flag') is not None:
            self.added_flag = m.get('added_flag')
        self.sign_product_merchant_list = []
        if m.get('sign_product_merchant_list') is not None:
            for k in m.get('sign_product_merchant_list'):
                temp_model = SignProductMerchant()
                self.sign_product_merchant_list.append(temp_model.from_map(k))
        if m.get('sign_product_merchant_count') is not None:
            self.sign_product_merchant_count = m.get('sign_product_merchant_count')
        self.apply_product_merchant_list = []
        if m.get('apply_product_merchant_list') is not None:
            for k in m.get('apply_product_merchant_list'):
                temp_model = SignProductMerchant()
                self.apply_product_merchant_list.append(temp_model.from_map(k))
        if m.get('apply_product_merchant_count') is not None:
            self.apply_product_merchant_count = m.get('apply_product_merchant_count')
        if m.get('display_status') is not None:
            self.display_status = m.get('display_status')
        if m.get('delivery_mode') is not None:
            self.delivery_mode = m.get('delivery_mode')
        return self


class ScalperQueryModel(TeaModel):
    def __init__(
        self,
        registration_phone: str = None,
        certificate_date: str = None,
        login_phone: str = None,
        registration_cert: str = None,
        login_cert: str = None,
        registration_date: str = None,
        cert_type: int = None,
        bank_card_no: str = None,
        email_address: str = None,
        imei: str = None,
        imsi: str = None,
        mac_address: str = None,
        apdid: str = None,
        out_order_no: str = None,
        order_no: str = None,
        sales_amount: int = None,
        user_name: str = None,
        mailing_phone: str = None,
        mailing_address: str = None,
        is_employee: str = None,
        channel: str = None,
        isv_pid: str = None,
        store_mcc_desc: str = None,
        customer_id: str = None,
        order_items_info_list: List[ScalperQueryOrderItem] = None,
    ):
        # 注册手机号，填写咨询对象所关联的注册手机号
        self.registration_phone = registration_phone
        # 认证时间，填写风险咨询对象所关联的账号的真实身份认证时间
        self.certificate_date = certificate_date
        # 登录手机号，填写风险咨询对象关联账号的登录手机号
        self.login_phone = login_phone
        # 注册账号身份证，填写风险咨询对象所关联账号的注册身份证信息
        self.registration_cert = registration_cert
        # 登录账号身份证，登录账号的身份证号码
        self.login_cert = login_cert
        # 注册时间，填写风险咨询对象所关联的账号的注册时间
        self.registration_date = registration_date
        # 证件类型；枚举值：1 - 身份证；2 - 护照
        self.cert_type = cert_type
        # 银行卡号
        self.bank_card_no = bank_card_no
        # 用户邮箱
        self.email_address = email_address
        # 手机序列号
        self.imei = imei
        # 国际移动用户识别码
        self.imsi = imsi
        # mac 地址或设备唯一标识
        self.mac_address = mac_address
        # 设备号，设备唯一号码
        self.apdid = apdid
        # 支付宝外部交易号
        self.out_order_no = out_order_no
        # 所咨询的唯一支付宝交易号
        self.order_no = order_no
        # 用户购买或使用服务时产生的具体金额总数，单位：分
        self.sales_amount = sales_amount
        # 用户姓名
        self.user_name = user_name
        # 收货手机号，用于区分 mobile_no 所填的手机号
        self.mailing_phone = mailing_phone
        # 收货地址
        self.mailing_address = mailing_address
        # 是否为员工账号，枚举值：1 - 是
        self.is_employee = is_employee
        # 渠道，枚举值：alipay - 支付宝；app - 自有app；pc - 电脑端
        self.channel = channel
        # 服务商 pid
        self.isv_pid = isv_pid
        # 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
        self.store_mcc_desc = store_mcc_desc
        # 消费者 id，外部会员账号
        self.customer_id = customer_id
        # 订单所有商品信息列表
        self.order_items_info_list = order_items_info_list

    def validate(self):
        if self.registration_phone is not None:
            self.validate_max_length(self.registration_phone, 'registration_phone', 20)
        if self.certificate_date is not None:
            self.validate_max_length(self.certificate_date, 'certificate_date', 20)
        if self.login_phone is not None:
            self.validate_max_length(self.login_phone, 'login_phone', 20)
        if self.registration_cert is not None:
            self.validate_max_length(self.registration_cert, 'registration_cert', 30)
        if self.login_cert is not None:
            self.validate_max_length(self.login_cert, 'login_cert', 30)
        if self.registration_date is not None:
            self.validate_max_length(self.registration_date, 'registration_date', 20)
        if self.cert_type is not None:
            self.validate_maximum(self.cert_type, 'cert_type', 2)
            self.validate_minimum(self.cert_type, 'cert_type', 1)
        if self.bank_card_no is not None:
            self.validate_max_length(self.bank_card_no, 'bank_card_no', 50)
        if self.email_address is not None:
            self.validate_max_length(self.email_address, 'email_address', 35)
        if self.imei is not None:
            self.validate_max_length(self.imei, 'imei', 100)
        if self.imsi is not None:
            self.validate_max_length(self.imsi, 'imsi', 100)
        if self.mac_address is not None:
            self.validate_max_length(self.mac_address, 'mac_address', 30)
        if self.apdid is not None:
            self.validate_max_length(self.apdid, 'apdid', 128)
        if self.out_order_no is not None:
            self.validate_max_length(self.out_order_no, 'out_order_no', 128)
        if self.order_no is not None:
            self.validate_max_length(self.order_no, 'order_no', 128)
        if self.sales_amount is not None:
            self.validate_maximum(self.sales_amount, 'sales_amount', 1000000)
            self.validate_minimum(self.sales_amount, 'sales_amount', 1)
        if self.user_name is not None:
            self.validate_max_length(self.user_name, 'user_name', 50)
        if self.mailing_phone is not None:
            self.validate_max_length(self.mailing_phone, 'mailing_phone', 20)
        if self.mailing_address is not None:
            self.validate_max_length(self.mailing_address, 'mailing_address', 128)
        if self.is_employee is not None:
            self.validate_max_length(self.is_employee, 'is_employee', 10)
        if self.channel is not None:
            self.validate_max_length(self.channel, 'channel', 10)
        if self.isv_pid is not None:
            self.validate_max_length(self.isv_pid, 'isv_pid', 128)
        if self.store_mcc_desc is not None:
            self.validate_max_length(self.store_mcc_desc, 'store_mcc_desc', 20)
        if self.customer_id is not None:
            self.validate_max_length(self.customer_id, 'customer_id', 128)
        if self.order_items_info_list:
            for k in self.order_items_info_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.registration_phone is not None:
            result['registration_phone'] = self.registration_phone
        if self.certificate_date is not None:
            result['certificate_date'] = self.certificate_date
        if self.login_phone is not None:
            result['login_phone'] = self.login_phone
        if self.registration_cert is not None:
            result['registration_cert'] = self.registration_cert
        if self.login_cert is not None:
            result['login_cert'] = self.login_cert
        if self.registration_date is not None:
            result['registration_date'] = self.registration_date
        if self.cert_type is not None:
            result['cert_type'] = self.cert_type
        if self.bank_card_no is not None:
            result['bank_card_no'] = self.bank_card_no
        if self.email_address is not None:
            result['email_address'] = self.email_address
        if self.imei is not None:
            result['imei'] = self.imei
        if self.imsi is not None:
            result['imsi'] = self.imsi
        if self.mac_address is not None:
            result['mac_address'] = self.mac_address
        if self.apdid is not None:
            result['apdid'] = self.apdid
        if self.out_order_no is not None:
            result['out_order_no'] = self.out_order_no
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.sales_amount is not None:
            result['sales_amount'] = self.sales_amount
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.mailing_phone is not None:
            result['mailing_phone'] = self.mailing_phone
        if self.mailing_address is not None:
            result['mailing_address'] = self.mailing_address
        if self.is_employee is not None:
            result['is_employee'] = self.is_employee
        if self.channel is not None:
            result['channel'] = self.channel
        if self.isv_pid is not None:
            result['isv_pid'] = self.isv_pid
        if self.store_mcc_desc is not None:
            result['store_mcc_desc'] = self.store_mcc_desc
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        result['order_items_info_list'] = []
        if self.order_items_info_list is not None:
            for k in self.order_items_info_list:
                result['order_items_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('registration_phone') is not None:
            self.registration_phone = m.get('registration_phone')
        if m.get('certificate_date') is not None:
            self.certificate_date = m.get('certificate_date')
        if m.get('login_phone') is not None:
            self.login_phone = m.get('login_phone')
        if m.get('registration_cert') is not None:
            self.registration_cert = m.get('registration_cert')
        if m.get('login_cert') is not None:
            self.login_cert = m.get('login_cert')
        if m.get('registration_date') is not None:
            self.registration_date = m.get('registration_date')
        if m.get('cert_type') is not None:
            self.cert_type = m.get('cert_type')
        if m.get('bank_card_no') is not None:
            self.bank_card_no = m.get('bank_card_no')
        if m.get('email_address') is not None:
            self.email_address = m.get('email_address')
        if m.get('imei') is not None:
            self.imei = m.get('imei')
        if m.get('imsi') is not None:
            self.imsi = m.get('imsi')
        if m.get('mac_address') is not None:
            self.mac_address = m.get('mac_address')
        if m.get('apdid') is not None:
            self.apdid = m.get('apdid')
        if m.get('out_order_no') is not None:
            self.out_order_no = m.get('out_order_no')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('sales_amount') is not None:
            self.sales_amount = m.get('sales_amount')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('mailing_phone') is not None:
            self.mailing_phone = m.get('mailing_phone')
        if m.get('mailing_address') is not None:
            self.mailing_address = m.get('mailing_address')
        if m.get('is_employee') is not None:
            self.is_employee = m.get('is_employee')
        if m.get('channel') is not None:
            self.channel = m.get('channel')
        if m.get('isv_pid') is not None:
            self.isv_pid = m.get('isv_pid')
        if m.get('store_mcc_desc') is not None:
            self.store_mcc_desc = m.get('store_mcc_desc')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        self.order_items_info_list = []
        if m.get('order_items_info_list') is not None:
            for k in m.get('order_items_info_list'):
                temp_model = ScalperQueryOrderItem()
                self.order_items_info_list.append(temp_model.from_map(k))
        return self


class UserSyncInfo(TeaModel):
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


class CompanyInfo(TeaModel):
    def __init__(
        self,
        business_license_file: FileInfo = None,
        business_license_cert_expire_flag: bool = None,
        business_license_cert_effect_date: str = None,
        business_license_cert_expire_date: str = None,
        product_main_class: str = None,
        company_name: str = None,
        company_alias_name: str = None,
        tenant_id: str = None,
        merchant_id: str = None,
        merchant_type: str = None,
        company_mobile: str = None,
        company_address: str = None,
        contact_name: str = None,
        contact_mobile: str = None,
        contact_address_province_code: str = None,
        contact_address_province_name: str = None,
        contact_address_city_code: str = None,
        contact_address_city_name: str = None,
        contact_address_detail: str = None,
        contact_email: str = None,
        bind_alipay_no: str = None,
        settle_alipay_no: str = None,
        bind_alipay_uid: str = None,
        business_scope: str = None,
        bank_opening_license_file: FileInfo = None,
        cooperation_agreement_file: FileInfo = None,
    ):
        # 营业执照文件信息
        self.business_license_file = business_license_file
        # 证件是否长期有效
        # true：长期，false：非长期
        # payChannel =JDPAY必填
        self.business_license_cert_expire_flag = business_license_cert_expire_flag
        # 证件有效期开始日期(payChannel =JDPAY)
        # 1.certExpireFlag=false时必填，时间格式:yyyy-MM-dd
        # 2. 商户为企业个体户时，无论certExpireFlag是否长期，该字段均必填
        self.business_license_cert_effect_date = business_license_cert_effect_date
        # 证件有效期结束日期（payChannel =JDPAY选填参数）
        # certExpireFlag为false必填，时间格式：yyyy-MM-dd
        self.business_license_cert_expire_date = business_license_cert_expire_date
        # 业务类型 枚举
        self.product_main_class = product_main_class
        # 公司名称
        self.company_name = company_name
        # 公司别名
        self.company_alias_name = company_alias_name
        # 公司数科租户id
        self.tenant_id = tenant_id
        # 统一社会信用代码
        self.merchant_id = merchant_id
        # 商户类型： 01：企业；07：个体工商户
        # 默认不填为01
        self.merchant_type = merchant_type
        # 公司联系电话
        self.company_mobile = company_mobile
        # 公司联系地址
        self.company_address = company_address
        # 联系人姓名
        self.contact_name = contact_name
        # 联系人手机号码
        self.contact_mobile = contact_mobile
        # 联系地址-省份code(payChannel =JDPAY必填)
        self.contact_address_province_code = contact_address_province_code
        # 联系地址-省份名称（payChannel =JDPAY必填）
        self.contact_address_province_name = contact_address_province_name
        # 联系地址-市code（payChannel =JDPAY必填）
        # 
        self.contact_address_city_code = contact_address_city_code
        # 联系人地址-市名称（payChannel =JDPAY必填）
        self.contact_address_city_name = contact_address_city_name
        # 联系人详细地址（payChannel =JDPAY必填）
        self.contact_address_detail = contact_address_detail
        # 联系人邮箱（pay_channel=JDPAY必填）
        self.contact_email = contact_email
        # 绑定企业支付宝账号（pay_channel=ALIPAY必填）
        self.bind_alipay_no = bind_alipay_no
        # 结算企业支付宝账号（pay_channel=ALIPAY必填）
        self.settle_alipay_no = settle_alipay_no
        # 绑定支付宝uid（pay_channel=ALIPAY必填）
        self.bind_alipay_uid = bind_alipay_uid
        # 经营范围
        # payChannel =JDPAY必填
        self.business_scope = business_scope
        # 开户许可证（payChannel =JDPAY必填）
        # 
        self.bank_opening_license_file = bank_opening_license_file
        # 商户和租赁平台合作协议图片（pay_channel=JDPAY必填）
        # 
        self.cooperation_agreement_file = cooperation_agreement_file

    def validate(self):
        self.validate_required(self.business_license_file, 'business_license_file')
        if self.business_license_file:
            self.business_license_file.validate()
        self.validate_required(self.product_main_class, 'product_main_class')
        self.validate_required(self.company_name, 'company_name')
        self.validate_required(self.company_alias_name, 'company_alias_name')
        self.validate_required(self.merchant_id, 'merchant_id')
        self.validate_required(self.contact_name, 'contact_name')
        self.validate_required(self.contact_mobile, 'contact_mobile')
        if self.bank_opening_license_file:
            self.bank_opening_license_file.validate()
        if self.cooperation_agreement_file:
            self.cooperation_agreement_file.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.business_license_file is not None:
            result['business_license_file'] = self.business_license_file.to_map()
        if self.business_license_cert_expire_flag is not None:
            result['business_license_cert_expire_flag'] = self.business_license_cert_expire_flag
        if self.business_license_cert_effect_date is not None:
            result['business_license_cert_effect_date'] = self.business_license_cert_effect_date
        if self.business_license_cert_expire_date is not None:
            result['business_license_cert_expire_date'] = self.business_license_cert_expire_date
        if self.product_main_class is not None:
            result['product_main_class'] = self.product_main_class
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.company_alias_name is not None:
            result['company_alias_name'] = self.company_alias_name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.merchant_type is not None:
            result['merchant_type'] = self.merchant_type
        if self.company_mobile is not None:
            result['company_mobile'] = self.company_mobile
        if self.company_address is not None:
            result['company_address'] = self.company_address
        if self.contact_name is not None:
            result['contact_name'] = self.contact_name
        if self.contact_mobile is not None:
            result['contact_mobile'] = self.contact_mobile
        if self.contact_address_province_code is not None:
            result['contact_address_province_code'] = self.contact_address_province_code
        if self.contact_address_province_name is not None:
            result['contact_address_province_name'] = self.contact_address_province_name
        if self.contact_address_city_code is not None:
            result['contact_address_city_code'] = self.contact_address_city_code
        if self.contact_address_city_name is not None:
            result['contact_address_city_name'] = self.contact_address_city_name
        if self.contact_address_detail is not None:
            result['contact_address_detail'] = self.contact_address_detail
        if self.contact_email is not None:
            result['contact_email'] = self.contact_email
        if self.bind_alipay_no is not None:
            result['bind_alipay_no'] = self.bind_alipay_no
        if self.settle_alipay_no is not None:
            result['settle_alipay_no'] = self.settle_alipay_no
        if self.bind_alipay_uid is not None:
            result['bind_alipay_uid'] = self.bind_alipay_uid
        if self.business_scope is not None:
            result['business_scope'] = self.business_scope
        if self.bank_opening_license_file is not None:
            result['bank_opening_license_file'] = self.bank_opening_license_file.to_map()
        if self.cooperation_agreement_file is not None:
            result['cooperation_agreement_file'] = self.cooperation_agreement_file.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('business_license_file') is not None:
            temp_model = FileInfo()
            self.business_license_file = temp_model.from_map(m['business_license_file'])
        if m.get('business_license_cert_expire_flag') is not None:
            self.business_license_cert_expire_flag = m.get('business_license_cert_expire_flag')
        if m.get('business_license_cert_effect_date') is not None:
            self.business_license_cert_effect_date = m.get('business_license_cert_effect_date')
        if m.get('business_license_cert_expire_date') is not None:
            self.business_license_cert_expire_date = m.get('business_license_cert_expire_date')
        if m.get('product_main_class') is not None:
            self.product_main_class = m.get('product_main_class')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('company_alias_name') is not None:
            self.company_alias_name = m.get('company_alias_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('merchant_type') is not None:
            self.merchant_type = m.get('merchant_type')
        if m.get('company_mobile') is not None:
            self.company_mobile = m.get('company_mobile')
        if m.get('company_address') is not None:
            self.company_address = m.get('company_address')
        if m.get('contact_name') is not None:
            self.contact_name = m.get('contact_name')
        if m.get('contact_mobile') is not None:
            self.contact_mobile = m.get('contact_mobile')
        if m.get('contact_address_province_code') is not None:
            self.contact_address_province_code = m.get('contact_address_province_code')
        if m.get('contact_address_province_name') is not None:
            self.contact_address_province_name = m.get('contact_address_province_name')
        if m.get('contact_address_city_code') is not None:
            self.contact_address_city_code = m.get('contact_address_city_code')
        if m.get('contact_address_city_name') is not None:
            self.contact_address_city_name = m.get('contact_address_city_name')
        if m.get('contact_address_detail') is not None:
            self.contact_address_detail = m.get('contact_address_detail')
        if m.get('contact_email') is not None:
            self.contact_email = m.get('contact_email')
        if m.get('bind_alipay_no') is not None:
            self.bind_alipay_no = m.get('bind_alipay_no')
        if m.get('settle_alipay_no') is not None:
            self.settle_alipay_no = m.get('settle_alipay_no')
        if m.get('bind_alipay_uid') is not None:
            self.bind_alipay_uid = m.get('bind_alipay_uid')
        if m.get('business_scope') is not None:
            self.business_scope = m.get('business_scope')
        if m.get('bank_opening_license_file') is not None:
            temp_model = FileInfo()
            self.bank_opening_license_file = temp_model.from_map(m['bank_opening_license_file'])
        if m.get('cooperation_agreement_file') is not None:
            temp_model = FileInfo()
            self.cooperation_agreement_file = temp_model.from_map(m['cooperation_agreement_file'])
        return self


class MerchantExpandSummaryPage(TeaModel):
    def __init__(
        self,
        pay_expand_id: str = None,
        pay_channel: str = None,
        status: str = None,
        create_time: str = None,
        update_time: str = None,
    ):
        # 进件id
        self.pay_expand_id = pay_expand_id
        # 支付渠道
        # JDPAY
        # ALIPAY
        self.pay_channel = pay_channel
        # 进件审核状态
        self.status = status
        # 创建时间
        self.create_time = create_time
        # 最后修改时间
        self.update_time = update_time

    def validate(self):
        self.validate_required(self.pay_expand_id, 'pay_expand_id')
        self.validate_required(self.pay_channel, 'pay_channel')
        self.validate_required(self.status, 'status')
        self.validate_required(self.create_time, 'create_time')
        self.validate_required(self.update_time, 'update_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        if self.pay_channel is not None:
            result['pay_channel'] = self.pay_channel
        if self.status is not None:
            result['status'] = self.status
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.update_time is not None:
            result['update_time'] = self.update_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        if m.get('pay_channel') is not None:
            self.pay_channel = m.get('pay_channel')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('update_time') is not None:
            self.update_time = m.get('update_time')
        return self


class UserPerformanceInfo(TeaModel):
    def __init__(
        self,
        period_num: int = None,
        pay_date: str = None,
        pay_money: int = None,
    ):
        # 履约期数
        self.period_num = period_num
        # 履约时间，格式 yyyy-MM-dd
        # 针对签收日作为起租日模式,未签收时：以签收日开始计算
        self.pay_date = pay_date
        # 履约金额，单位为分
        self.pay_money = pay_money

    def validate(self):
        self.validate_required(self.period_num, 'period_num')
        self.validate_required(self.pay_date, 'pay_date')
        self.validate_required(self.pay_money, 'pay_money')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.pay_date is not None:
            result['pay_date'] = self.pay_date
        if self.pay_money is not None:
            result['pay_money'] = self.pay_money
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('pay_date') is not None:
            self.pay_date = m.get('pay_date')
        if m.get('pay_money') is not None:
            self.pay_money = m.get('pay_money')
        return self


class MarketingScoreQueryInfo(TeaModel):
    def __init__(
        self,
        phone_num: str = None,
    ):
        # 手机号码
        self.phone_num = phone_num

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        return self


class InsureOrderInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        insure_id: str = None,
        product_name: str = None,
        insure_start_time: str = None,
        insure_end_time: str = None,
        insure_amount: int = None,
        insure_premium: int = None,
        status: str = None,
        policy_url: str = None,
        validate_code: str = None,
    ):
        # 商家订单ID
        self.order_id = order_id
        # 投保编号（承保id）
        self.insure_id = insure_id
        # 商品名称
        self.product_name = product_name
        # 保险开始时间
        self.insure_start_time = insure_start_time
        # 保险终止时间
        self.insure_end_time = insure_end_time
        # 投保金额（保额），单位分 100代表1元
        self.insure_amount = insure_amount
        # 投保费用（保费），单位分 100代表1元
        self.insure_premium = insure_premium
        # 投保状态枚举
        self.status = status
        # 电子保单下载链接
        self.policy_url = policy_url
        # 验真码
        self.validate_code = validate_code

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.insure_id is not None:
            result['insure_id'] = self.insure_id
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.insure_start_time is not None:
            result['insure_start_time'] = self.insure_start_time
        if self.insure_end_time is not None:
            result['insure_end_time'] = self.insure_end_time
        if self.insure_amount is not None:
            result['insure_amount'] = self.insure_amount
        if self.insure_premium is not None:
            result['insure_premium'] = self.insure_premium
        if self.status is not None:
            result['status'] = self.status
        if self.policy_url is not None:
            result['policy_url'] = self.policy_url
        if self.validate_code is not None:
            result['validate_code'] = self.validate_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('insure_id') is not None:
            self.insure_id = m.get('insure_id')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('insure_start_time') is not None:
            self.insure_start_time = m.get('insure_start_time')
        if m.get('insure_end_time') is not None:
            self.insure_end_time = m.get('insure_end_time')
        if m.get('insure_amount') is not None:
            self.insure_amount = m.get('insure_amount')
        if m.get('insure_premium') is not None:
            self.insure_premium = m.get('insure_premium')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('policy_url') is not None:
            self.policy_url = m.get('policy_url')
        if m.get('validate_code') is not None:
            self.validate_code = m.get('validate_code')
        return self


class SignUrlResult(TeaModel):
    def __init__(
        self,
        url: str = None,
        short_url: str = None,
        sign_msg: str = None,
    ):
        # 签署（长）链接
        self.url = url
        # 签署短链接
        self.short_url = short_url
        # 签署链接提示信息
        self.sign_msg = sign_msg

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.url is not None:
            result['url'] = self.url
        if self.short_url is not None:
            result['short_url'] = self.short_url
        if self.sign_msg is not None:
            result['sign_msg'] = self.sign_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('short_url') is not None:
            self.short_url = m.get('short_url')
        if m.get('sign_msg') is not None:
            self.sign_msg = m.get('sign_msg')
        return self


class DataDownloadInfo(TeaModel):
    def __init__(
        self,
        merchant_id: str = None,
        biz_no: str = None,
        status: str = None,
        type: str = None,
        start_time: str = None,
        end_time: str = None,
        create_time: str = None,
        result_info: str = None,
        fund_mode: str = None,
        loan_channel: str = None,
        fund_id: str = None,
        merchant_name: str = None,
        fund_name: str = None,
    ):
        # 商户社会统一信用代码
        self.merchant_id = merchant_id
        # 流水号
        self.biz_no = biz_no
        # 状态
        self.status = status
        # TRADE_PROMISE_BILL: 交易履约账单
        self.type = type
        # 筛选开始时间
        self.start_time = start_time
        # 筛选结束时间
        self.end_time = end_time
        # 任务创建时间
        self.create_time = create_time
        # 下载结果
        self.result_info = result_info
        # 融资类型
        self.fund_mode = fund_mode
        # 放款渠道
        self.loan_channel = loan_channel
        # 资方社会统一信用代码
        self.fund_id = fund_id
        # 公司名称
        self.merchant_name = merchant_name
        # 资方公司名称
        self.fund_name = fund_name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.status is not None:
            result['status'] = self.status
        if self.type is not None:
            result['type'] = self.type
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.result_info is not None:
            result['result_info'] = self.result_info
        if self.fund_mode is not None:
            result['fund_mode'] = self.fund_mode
        if self.loan_channel is not None:
            result['loan_channel'] = self.loan_channel
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.fund_name is not None:
            result['fund_name'] = self.fund_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('result_info') is not None:
            self.result_info = m.get('result_info')
        if m.get('fund_mode') is not None:
            self.fund_mode = m.get('fund_mode')
        if m.get('loan_channel') is not None:
            self.loan_channel = m.get('loan_channel')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('fund_name') is not None:
            self.fund_name = m.get('fund_name')
        return self


class CustomerPersonInfo(TeaModel):
    def __init__(
        self,
        alipay_logon_id: str = None,
        alipay_bind_mobile: str = None,
        customer_service_name: str = None,
    ):
        # 客诉处理员支付宝账号
        self.alipay_logon_id = alipay_logon_id
        # 客诉处理员支付宝绑定手机号
        self.alipay_bind_mobile = alipay_bind_mobile
        # 客服人员名称
        self.customer_service_name = customer_service_name

    def validate(self):
        self.validate_required(self.alipay_logon_id, 'alipay_logon_id')
        self.validate_required(self.alipay_bind_mobile, 'alipay_bind_mobile')
        self.validate_required(self.customer_service_name, 'customer_service_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.alipay_logon_id is not None:
            result['alipay_logon_id'] = self.alipay_logon_id
        if self.alipay_bind_mobile is not None:
            result['alipay_bind_mobile'] = self.alipay_bind_mobile
        if self.customer_service_name is not None:
            result['customer_service_name'] = self.customer_service_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('alipay_logon_id') is not None:
            self.alipay_logon_id = m.get('alipay_logon_id')
        if m.get('alipay_bind_mobile') is not None:
            self.alipay_bind_mobile = m.get('alipay_bind_mobile')
        if m.get('customer_service_name') is not None:
            self.customer_service_name = m.get('customer_service_name')
        return self


class ApplySceneProductMerchantInfo(TeaModel):
    def __init__(
        self,
        merchant_product_id: str = None,
        merchant_brand: str = None,
        merchant_logo: str = None,
        large_merchant_logo: str = None,
        grayed: bool = None,
        choosed: bool = None,
    ):
        # 商户商品spuId
        self.merchant_product_id = merchant_product_id
        # 商户品牌
        self.merchant_brand = merchant_brand
        # logo
        self.merchant_logo = merchant_logo
        # logo
        self.large_merchant_logo = large_merchant_logo
        # 是否置灰
        self.grayed = grayed
        # 是否勾选
        self.choosed = choosed

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.merchant_product_id is not None:
            result['merchant_product_id'] = self.merchant_product_id
        if self.merchant_brand is not None:
            result['merchant_brand'] = self.merchant_brand
        if self.merchant_logo is not None:
            result['merchant_logo'] = self.merchant_logo
        if self.large_merchant_logo is not None:
            result['large_merchant_logo'] = self.large_merchant_logo
        if self.grayed is not None:
            result['grayed'] = self.grayed
        if self.choosed is not None:
            result['choosed'] = self.choosed
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('merchant_product_id') is not None:
            self.merchant_product_id = m.get('merchant_product_id')
        if m.get('merchant_brand') is not None:
            self.merchant_brand = m.get('merchant_brand')
        if m.get('merchant_logo') is not None:
            self.merchant_logo = m.get('merchant_logo')
        if m.get('large_merchant_logo') is not None:
            self.large_merchant_logo = m.get('large_merchant_logo')
        if m.get('grayed') is not None:
            self.grayed = m.get('grayed')
        if m.get('choosed') is not None:
            self.choosed = m.get('choosed')
        return self


class ApplicationInfoUpdate(TeaModel):
    def __init__(
        self,
        application_scene: str = None,
        tiny_app_id: str = None,
        site_name: str = None,
        sit_url: str = None,
        merchant_name: str = None,
        merchant_service_name: str = None,
        merchant_service_desc: str = None,
        site_info: List[SiteInfo] = None,
    ):
        # 应用场景 MINI_APP 小程序 APP 自有app ALL 两种都有
        self.application_scene = application_scene
        # 小程序id
        self.tiny_app_id = tiny_app_id
        # 小程序名称
        self.site_name = site_name
        # http://asdasas.com
        self.sit_url = sit_url
        # 商户名称。 修改后的商户名称，将同步支付宝代扣签约页面字段展示
        self.merchant_name = merchant_name
        # 商户服务名称。 修改后的商户服务名称，将同步支付宝代扣签约页面字段展示
        self.merchant_service_name = merchant_service_name
        # 商户服务描述。 修改后的商户服务描述，将同步支付宝代扣签约页面字段展示
        self.merchant_service_desc = merchant_service_desc
        # 站点信息
        self.site_info = site_info

    def validate(self):
        if self.site_info:
            for k in self.site_info:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.application_scene is not None:
            result['application_scene'] = self.application_scene
        if self.tiny_app_id is not None:
            result['tiny_app_id'] = self.tiny_app_id
        if self.site_name is not None:
            result['site_name'] = self.site_name
        if self.sit_url is not None:
            result['sit_url'] = self.sit_url
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.merchant_service_name is not None:
            result['merchant_service_name'] = self.merchant_service_name
        if self.merchant_service_desc is not None:
            result['merchant_service_desc'] = self.merchant_service_desc
        result['site_info'] = []
        if self.site_info is not None:
            for k in self.site_info:
                result['site_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('application_scene') is not None:
            self.application_scene = m.get('application_scene')
        if m.get('tiny_app_id') is not None:
            self.tiny_app_id = m.get('tiny_app_id')
        if m.get('site_name') is not None:
            self.site_name = m.get('site_name')
        if m.get('sit_url') is not None:
            self.sit_url = m.get('sit_url')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('merchant_service_name') is not None:
            self.merchant_service_name = m.get('merchant_service_name')
        if m.get('merchant_service_desc') is not None:
            self.merchant_service_desc = m.get('merchant_service_desc')
        self.site_info = []
        if m.get('site_info') is not None:
            for k in m.get('site_info'):
                temp_model = SiteInfo()
                self.site_info.append(temp_model.from_map(k))
        return self


class AssetPackageFinancePlan(TeaModel):
    def __init__(
        self,
        version: int = None,
        status: str = None,
        loan_rate: str = None,
        loan_money: int = None,
        loan_money_yuan: str = None,
        interest_accrual_method: str = None,
        day_count_convention: int = None,
        allin_financing_cost_rate: str = None,
        repayment_method: str = None,
        repayment_frequency: str = None,
        finance_num: int = None,
        pay_day: int = None,
        merchant_compensation_day: int = None,
        unreleased_amount: int = None,
    ):
        # 版本号，从1开始
        self.version = version
        # 状态，ENABLE：启用，不启用时默认null
        self.status = status
        # 放款比例
        # 0~100，保留小数2位
        self.loan_rate = loan_rate
        # 放款金额，单位分
        self.loan_money = loan_money
        # 放款金额，单位元
        self.loan_money_yuan = loan_money_yuan
        # 计息方式，枚举：
        # ● 年化利率：APR
        # ● 固定金额：FIXED_AMOUNT
        # ● 固定比例：FIXED_RATE
        self.interest_accrual_method = interest_accrual_method
        # 年计息天数
        self.day_count_convention = day_count_convention
        # 息费率
        self.allin_financing_cost_rate = allin_financing_cost_rate
        # 还款方式，枚举：
        # ● 等额本息：EQUAL_INSTALLMENT_METHOD
        self.repayment_method = repayment_method
        # 还款频率，枚举：
        # ● 按月：MONTH
        self.repayment_frequency = repayment_frequency
        # 融资期数，范围0~36
        self.finance_num = finance_num
        # 计划还款日期，范围1～28
        self.pay_day = pay_day
        # 触发商家代偿时间，单位天
        self.merchant_compensation_day = merchant_compensation_day
        # 订单未还款总金额，单位分
        self.unreleased_amount = unreleased_amount

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.version is not None:
            result['version'] = self.version
        if self.status is not None:
            result['status'] = self.status
        if self.loan_rate is not None:
            result['loan_rate'] = self.loan_rate
        if self.loan_money is not None:
            result['loan_money'] = self.loan_money
        if self.loan_money_yuan is not None:
            result['loan_money_yuan'] = self.loan_money_yuan
        if self.interest_accrual_method is not None:
            result['interest_accrual_method'] = self.interest_accrual_method
        if self.day_count_convention is not None:
            result['day_count_convention'] = self.day_count_convention
        if self.allin_financing_cost_rate is not None:
            result['allin_financing_cost_rate'] = self.allin_financing_cost_rate
        if self.repayment_method is not None:
            result['repayment_method'] = self.repayment_method
        if self.repayment_frequency is not None:
            result['repayment_frequency'] = self.repayment_frequency
        if self.finance_num is not None:
            result['finance_num'] = self.finance_num
        if self.pay_day is not None:
            result['pay_day'] = self.pay_day
        if self.merchant_compensation_day is not None:
            result['merchant_compensation_day'] = self.merchant_compensation_day
        if self.unreleased_amount is not None:
            result['unreleased_amount'] = self.unreleased_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('version') is not None:
            self.version = m.get('version')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('loan_rate') is not None:
            self.loan_rate = m.get('loan_rate')
        if m.get('loan_money') is not None:
            self.loan_money = m.get('loan_money')
        if m.get('loan_money_yuan') is not None:
            self.loan_money_yuan = m.get('loan_money_yuan')
        if m.get('interest_accrual_method') is not None:
            self.interest_accrual_method = m.get('interest_accrual_method')
        if m.get('day_count_convention') is not None:
            self.day_count_convention = m.get('day_count_convention')
        if m.get('allin_financing_cost_rate') is not None:
            self.allin_financing_cost_rate = m.get('allin_financing_cost_rate')
        if m.get('repayment_method') is not None:
            self.repayment_method = m.get('repayment_method')
        if m.get('repayment_frequency') is not None:
            self.repayment_frequency = m.get('repayment_frequency')
        if m.get('finance_num') is not None:
            self.finance_num = m.get('finance_num')
        if m.get('pay_day') is not None:
            self.pay_day = m.get('pay_day')
        if m.get('merchant_compensation_day') is not None:
            self.merchant_compensation_day = m.get('merchant_compensation_day')
        if m.get('unreleased_amount') is not None:
            self.unreleased_amount = m.get('unreleased_amount')
        return self


class OrderGoodsModel(TeaModel):
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


class PlatformProductInfoResp(TeaModel):
    def __init__(
        self,
        apply_status: str = None,
        refuse_reason: str = None,
        platform_product_id: str = None,
        merchant_product_id: str = None,
        product_name: str = None,
        first_cover_image_url: str = None,
        large_first_cover_image_url: str = None,
        display_status: str = None,
        spec_config_list: List[ProductSpecConfig] = None,
        rental_plan: List[str] = None,
        rental_period: List[int] = None,
        support_renew: bool = None,
        support_buyout: bool = None,
        lowest_daily_rent_money: int = None,
        lowest_daily_rent_money_yuan: str = None,
        highest_daily_rent_money: int = None,
        highest_daily_rent_money_yuan: str = None,
    ):
        # 申请单状态
        self.apply_status = apply_status
        # 审核原因
        self.refuse_reason = refuse_reason
        # 平台商品id
        self.platform_product_id = platform_product_id
        # 商家商品id
        self.merchant_product_id = merchant_product_id
        # 商品名称
        self.product_name = product_name
        # 封面首图url链接
        self.first_cover_image_url = first_cover_image_url
        # 封面首图url链接
        self.large_first_cover_image_url = large_first_cover_image_url
        # 商品上架状态
        self.display_status = display_status
        # 产品规格列表
        self.spec_config_list = spec_config_list
        # 租赁方案
        self.rental_plan = rental_plan
        # 租赁周期
        self.rental_period = rental_period
        # 可续租
        self.support_renew = support_renew
        # 可买断
        self.support_buyout = support_buyout
        # 最低日租金(单位分)
        self.lowest_daily_rent_money = lowest_daily_rent_money
        # 最低日租金(单位元)
        self.lowest_daily_rent_money_yuan = lowest_daily_rent_money_yuan
        # 最高日租金(单位分)
        self.highest_daily_rent_money = highest_daily_rent_money
        # 最高日租金(单位元)
        self.highest_daily_rent_money_yuan = highest_daily_rent_money_yuan

    def validate(self):
        if self.spec_config_list:
            for k in self.spec_config_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.apply_status is not None:
            result['apply_status'] = self.apply_status
        if self.refuse_reason is not None:
            result['refuse_reason'] = self.refuse_reason
        if self.platform_product_id is not None:
            result['platform_product_id'] = self.platform_product_id
        if self.merchant_product_id is not None:
            result['merchant_product_id'] = self.merchant_product_id
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.first_cover_image_url is not None:
            result['first_cover_image_url'] = self.first_cover_image_url
        if self.large_first_cover_image_url is not None:
            result['large_first_cover_image_url'] = self.large_first_cover_image_url
        if self.display_status is not None:
            result['display_status'] = self.display_status
        result['spec_config_list'] = []
        if self.spec_config_list is not None:
            for k in self.spec_config_list:
                result['spec_config_list'].append(k.to_map() if k else None)
        if self.rental_plan is not None:
            result['rental_plan'] = self.rental_plan
        if self.rental_period is not None:
            result['rental_period'] = self.rental_period
        if self.support_renew is not None:
            result['support_renew'] = self.support_renew
        if self.support_buyout is not None:
            result['support_buyout'] = self.support_buyout
        if self.lowest_daily_rent_money is not None:
            result['lowest_daily_rent_money'] = self.lowest_daily_rent_money
        if self.lowest_daily_rent_money_yuan is not None:
            result['lowest_daily_rent_money_yuan'] = self.lowest_daily_rent_money_yuan
        if self.highest_daily_rent_money is not None:
            result['highest_daily_rent_money'] = self.highest_daily_rent_money
        if self.highest_daily_rent_money_yuan is not None:
            result['highest_daily_rent_money_yuan'] = self.highest_daily_rent_money_yuan
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('apply_status') is not None:
            self.apply_status = m.get('apply_status')
        if m.get('refuse_reason') is not None:
            self.refuse_reason = m.get('refuse_reason')
        if m.get('platform_product_id') is not None:
            self.platform_product_id = m.get('platform_product_id')
        if m.get('merchant_product_id') is not None:
            self.merchant_product_id = m.get('merchant_product_id')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('first_cover_image_url') is not None:
            self.first_cover_image_url = m.get('first_cover_image_url')
        if m.get('large_first_cover_image_url') is not None:
            self.large_first_cover_image_url = m.get('large_first_cover_image_url')
        if m.get('display_status') is not None:
            self.display_status = m.get('display_status')
        self.spec_config_list = []
        if m.get('spec_config_list') is not None:
            for k in m.get('spec_config_list'):
                temp_model = ProductSpecConfig()
                self.spec_config_list.append(temp_model.from_map(k))
        if m.get('rental_plan') is not None:
            self.rental_plan = m.get('rental_plan')
        if m.get('rental_period') is not None:
            self.rental_period = m.get('rental_period')
        if m.get('support_renew') is not None:
            self.support_renew = m.get('support_renew')
        if m.get('support_buyout') is not None:
            self.support_buyout = m.get('support_buyout')
        if m.get('lowest_daily_rent_money') is not None:
            self.lowest_daily_rent_money = m.get('lowest_daily_rent_money')
        if m.get('lowest_daily_rent_money_yuan') is not None:
            self.lowest_daily_rent_money_yuan = m.get('lowest_daily_rent_money_yuan')
        if m.get('highest_daily_rent_money') is not None:
            self.highest_daily_rent_money = m.get('highest_daily_rent_money')
        if m.get('highest_daily_rent_money_yuan') is not None:
            self.highest_daily_rent_money_yuan = m.get('highest_daily_rent_money_yuan')
        return self


class DeliveryDetail(TeaModel):
    def __init__(
        self,
        receiver_name: str = None,
        receiver_mobile: str = None,
        receiver_address: str = None,
    ):
        # 收件人姓名
        self.receiver_name = receiver_name
        # 收件人手机号
        self.receiver_mobile = receiver_mobile
        # 收件人地址
        self.receiver_address = receiver_address

    def validate(self):
        if self.receiver_name is not None:
            self.validate_max_length(self.receiver_name, 'receiver_name', 32)
        if self.receiver_mobile is not None:
            self.validate_max_length(self.receiver_mobile, 'receiver_mobile', 32)
        if self.receiver_address is not None:
            self.validate_max_length(self.receiver_address, 'receiver_address', 256)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.receiver_name is not None:
            result['receiver_name'] = self.receiver_name
        if self.receiver_mobile is not None:
            result['receiver_mobile'] = self.receiver_mobile
        if self.receiver_address is not None:
            result['receiver_address'] = self.receiver_address
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('receiver_name') is not None:
            self.receiver_name = m.get('receiver_name')
        if m.get('receiver_mobile') is not None:
            self.receiver_mobile = m.get('receiver_mobile')
        if m.get('receiver_address') is not None:
            self.receiver_address = m.get('receiver_address')
        return self


class PlatformOrderLeadResultInfo(TeaModel):
    def __init__(
        self,
        scene_name: str = None,
        platform_order_id: str = None,
        delivery_id: str = None,
        product_title: str = None,
        order_create_time: str = None,
        user_name: str = None,
        user_phone: str = None,
        merchant_brand_name: str = None,
        merchant_brand_logo_url: str = None,
        approval_status: str = None,
        remark: str = None,
    ):
        # 场景名称
        self.scene_name = scene_name
        # 平台订单号
        self.platform_order_id = platform_order_id
        # 平台订单派发id
        self.delivery_id = delivery_id
        # 商品名称
        self.product_title = product_title
        # 订单提交时间
        self.order_create_time = order_create_time
        # 用户姓名（脱敏）
        self.user_name = user_name
        # 用户手机号（脱敏）
        self.user_phone = user_phone
        # 商家品牌名称
        self.merchant_brand_name = merchant_brand_name
        # 商家品牌logoUrl
        self.merchant_brand_logo_url = merchant_brand_logo_url
        # 审核状态
        self.approval_status = approval_status
        # 备注
        self.remark = remark

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.scene_name is not None:
            result['scene_name'] = self.scene_name
        if self.platform_order_id is not None:
            result['platform_order_id'] = self.platform_order_id
        if self.delivery_id is not None:
            result['delivery_id'] = self.delivery_id
        if self.product_title is not None:
            result['product_title'] = self.product_title
        if self.order_create_time is not None:
            result['order_create_time'] = self.order_create_time
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_phone is not None:
            result['user_phone'] = self.user_phone
        if self.merchant_brand_name is not None:
            result['merchant_brand_name'] = self.merchant_brand_name
        if self.merchant_brand_logo_url is not None:
            result['merchant_brand_logo_url'] = self.merchant_brand_logo_url
        if self.approval_status is not None:
            result['approval_status'] = self.approval_status
        if self.remark is not None:
            result['remark'] = self.remark
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('scene_name') is not None:
            self.scene_name = m.get('scene_name')
        if m.get('platform_order_id') is not None:
            self.platform_order_id = m.get('platform_order_id')
        if m.get('delivery_id') is not None:
            self.delivery_id = m.get('delivery_id')
        if m.get('product_title') is not None:
            self.product_title = m.get('product_title')
        if m.get('order_create_time') is not None:
            self.order_create_time = m.get('order_create_time')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_phone') is not None:
            self.user_phone = m.get('user_phone')
        if m.get('merchant_brand_name') is not None:
            self.merchant_brand_name = m.get('merchant_brand_name')
        if m.get('merchant_brand_logo_url') is not None:
            self.merchant_brand_logo_url = m.get('merchant_brand_logo_url')
        if m.get('approval_status') is not None:
            self.approval_status = m.get('approval_status')
        if m.get('remark') is not None:
            self.remark = m.get('remark')
        return self


class BatchLoanResultData(TeaModel):
    def __init__(
        self,
        biz_no: str = None,
        status: str = None,
        type: str = None,
        create_time: str = None,
        agree_loan_count: int = None,
        reject_loan_count: int = None,
        loan_fail_count: int = None,
        file_url: str = None,
    ):
        # 流水号
        self.biz_no = biz_no
        # 状态
        self.status = status
        # FUND_BATCH_LOAN: 批量放款
        self.type = type
        # 任务创建时间
        self.create_time = create_time
        # 同意放款数据
        self.agree_loan_count = agree_loan_count
        # 拒绝放款数量
        self.reject_loan_count = reject_loan_count
        # 放款失败数量
        self.loan_fail_count = loan_fail_count
        # 放款失败结果文件
        self.file_url = file_url

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.biz_no is not None:
            result['biz_no'] = self.biz_no
        if self.status is not None:
            result['status'] = self.status
        if self.type is not None:
            result['type'] = self.type
        if self.create_time is not None:
            result['create_time'] = self.create_time
        if self.agree_loan_count is not None:
            result['agree_loan_count'] = self.agree_loan_count
        if self.reject_loan_count is not None:
            result['reject_loan_count'] = self.reject_loan_count
        if self.loan_fail_count is not None:
            result['loan_fail_count'] = self.loan_fail_count
        if self.file_url is not None:
            result['file_url'] = self.file_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('biz_no') is not None:
            self.biz_no = m.get('biz_no')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        if m.get('agree_loan_count') is not None:
            self.agree_loan_count = m.get('agree_loan_count')
        if m.get('reject_loan_count') is not None:
            self.reject_loan_count = m.get('reject_loan_count')
        if m.get('loan_fail_count') is not None:
            self.loan_fail_count = m.get('loan_fail_count')
        if m.get('file_url') is not None:
            self.file_url = m.get('file_url')
        return self


class FarmingQueryModel(TeaModel):
    def __init__(
        self,
        out_order_no: str = None,
        order_no: str = None,
        sales_amount: int = None,
        bank_card_no: str = None,
        isv_pid: str = None,
        store_mcc_desc: str = None,
        outlet_address: str = None,
        company_name: str = None,
        store_name: str = None,
    ):
        # 支付宝外部交易号
        self.out_order_no = out_order_no
        # 支付宝内部交易号
        self.order_no = order_no
        # 金额，用户购买或使用服务时产生的具体金额，单位：分
        self.sales_amount = sales_amount
        # 银行卡号
        self.bank_card_no = bank_card_no
        # 服务商 pid
        self.isv_pid = isv_pid
        # 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
        self.store_mcc_desc = store_mcc_desc
        # 门店地址；不需要传城市和行政区
        self.outlet_address = outlet_address
        # 公司名称
        self.company_name = company_name
        # 店铺名称
        self.store_name = store_name

    def validate(self):
        if self.out_order_no is not None:
            self.validate_max_length(self.out_order_no, 'out_order_no', 128)
        if self.order_no is not None:
            self.validate_max_length(self.order_no, 'order_no', 128)
        if self.sales_amount is not None:
            self.validate_maximum(self.sales_amount, 'sales_amount', 10000000)
            self.validate_minimum(self.sales_amount, 'sales_amount', 1)
        if self.bank_card_no is not None:
            self.validate_max_length(self.bank_card_no, 'bank_card_no', 128)
        if self.isv_pid is not None:
            self.validate_max_length(self.isv_pid, 'isv_pid', 128)
        if self.store_mcc_desc is not None:
            self.validate_max_length(self.store_mcc_desc, 'store_mcc_desc', 30)
        if self.outlet_address is not None:
            self.validate_max_length(self.outlet_address, 'outlet_address', 128)
        if self.company_name is not None:
            self.validate_max_length(self.company_name, 'company_name', 128)
        if self.store_name is not None:
            self.validate_max_length(self.store_name, 'store_name', 128)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.out_order_no is not None:
            result['out_order_no'] = self.out_order_no
        if self.order_no is not None:
            result['order_no'] = self.order_no
        if self.sales_amount is not None:
            result['sales_amount'] = self.sales_amount
        if self.bank_card_no is not None:
            result['bank_card_no'] = self.bank_card_no
        if self.isv_pid is not None:
            result['isv_pid'] = self.isv_pid
        if self.store_mcc_desc is not None:
            result['store_mcc_desc'] = self.store_mcc_desc
        if self.outlet_address is not None:
            result['outlet_address'] = self.outlet_address
        if self.company_name is not None:
            result['company_name'] = self.company_name
        if self.store_name is not None:
            result['store_name'] = self.store_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('out_order_no') is not None:
            self.out_order_no = m.get('out_order_no')
        if m.get('order_no') is not None:
            self.order_no = m.get('order_no')
        if m.get('sales_amount') is not None:
            self.sales_amount = m.get('sales_amount')
        if m.get('bank_card_no') is not None:
            self.bank_card_no = m.get('bank_card_no')
        if m.get('isv_pid') is not None:
            self.isv_pid = m.get('isv_pid')
        if m.get('store_mcc_desc') is not None:
            self.store_mcc_desc = m.get('store_mcc_desc')
        if m.get('outlet_address') is not None:
            self.outlet_address = m.get('outlet_address')
        if m.get('company_name') is not None:
            self.company_name = m.get('company_name')
        if m.get('store_name') is not None:
            self.store_name = m.get('store_name')
        return self


class TemplateTextAreaComponent(TeaModel):
    def __init__(
        self,
        template_code: str = None,
        template_version: str = None,
        component_type: str = None,
        component_name: str = None,
        required: bool = None,
        line: int = None,
        multi_name: str = None,
        pre_element_code: str = None,
    ):
        # 模板编码
        self.template_code = template_code
        # 模版版本号
        self.template_version = template_version
        # 组件类型，INPUT:单行文本 TEXTAREA:多行文本
        self.component_type = component_type
        # 组件名称（占位符）
        self.component_name = component_name
        # 是否必填
        self.required = required
        # 预估文本行数
        self.line = line
        # 多行文本域名称
        self.multi_name = multi_name
        # 前端传入的文本域映射字段
        self.pre_element_code = pre_element_code

    def validate(self):
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.template_version, 'template_version')
        self.validate_required(self.component_type, 'component_type')
        self.validate_required(self.component_name, 'component_name')
        self.validate_required(self.required, 'required')
        self.validate_required(self.multi_name, 'multi_name')
        self.validate_required(self.pre_element_code, 'pre_element_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.template_version is not None:
            result['template_version'] = self.template_version
        if self.component_type is not None:
            result['component_type'] = self.component_type
        if self.component_name is not None:
            result['component_name'] = self.component_name
        if self.required is not None:
            result['required'] = self.required
        if self.line is not None:
            result['line'] = self.line
        if self.multi_name is not None:
            result['multi_name'] = self.multi_name
        if self.pre_element_code is not None:
            result['pre_element_code'] = self.pre_element_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        if m.get('component_type') is not None:
            self.component_type = m.get('component_type')
        if m.get('component_name') is not None:
            self.component_name = m.get('component_name')
        if m.get('required') is not None:
            self.required = m.get('required')
        if m.get('line') is not None:
            self.line = m.get('line')
        if m.get('multi_name') is not None:
            self.multi_name = m.get('multi_name')
        if m.get('pre_element_code') is not None:
            self.pre_element_code = m.get('pre_element_code')
        return self


class OrderProductInfo(TeaModel):
    def __init__(
        self,
        product_id: str = None,
        product_name: str = None,
        product_number: int = None,
    ):
        # 商品编码
        self.product_id = product_id
        # 商品名称
        self.product_name = product_name
        # 商品数量
        self.product_number = product_number

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.product_id is not None:
            result['product_id'] = self.product_id
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.product_number is not None:
            result['product_number'] = self.product_number
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('product_number') is not None:
            self.product_number = m.get('product_number')
        return self


class GoodsInfo(TeaModel):
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


class AgreementTerminateApplyInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        terminate_apply_id: str = None,
        order_gmt_create: str = None,
        gmt_terminate_apply: str = None,
        handle_status: str = None,
        merchant_handle_duration: str = None,
        merchant_handle_duration_type: str = None,
    ):
        # 订单ID
        self.order_id = order_id
        # 解约申请号
        self.terminate_apply_id = terminate_apply_id
        # 订单创建时间
        self.order_gmt_create = order_gmt_create
        # 解约申请时间
        self.gmt_terminate_apply = gmt_terminate_apply
        # 处理状态
        self.handle_status = handle_status
        # 商家处理超时时长
        self.merchant_handle_duration = merchant_handle_duration
        # 商家处理超时时长
        self.merchant_handle_duration_type = merchant_handle_duration_type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.terminate_apply_id is not None:
            result['terminate_apply_id'] = self.terminate_apply_id
        if self.order_gmt_create is not None:
            result['order_gmt_create'] = self.order_gmt_create
        if self.gmt_terminate_apply is not None:
            result['gmt_terminate_apply'] = self.gmt_terminate_apply
        if self.handle_status is not None:
            result['handle_status'] = self.handle_status
        if self.merchant_handle_duration is not None:
            result['merchant_handle_duration'] = self.merchant_handle_duration
        if self.merchant_handle_duration_type is not None:
            result['merchant_handle_duration_type'] = self.merchant_handle_duration_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('terminate_apply_id') is not None:
            self.terminate_apply_id = m.get('terminate_apply_id')
        if m.get('order_gmt_create') is not None:
            self.order_gmt_create = m.get('order_gmt_create')
        if m.get('gmt_terminate_apply') is not None:
            self.gmt_terminate_apply = m.get('gmt_terminate_apply')
        if m.get('handle_status') is not None:
            self.handle_status = m.get('handle_status')
        if m.get('merchant_handle_duration') is not None:
            self.merchant_handle_duration = m.get('merchant_handle_duration')
        if m.get('merchant_handle_duration_type') is not None:
            self.merchant_handle_duration_type = m.get('merchant_handle_duration_type')
        return self


class LegalInfo(TeaModel):
    def __init__(
        self,
        legal_name: str = None,
        legal_cert_no: str = None,
        legal_cert_front_file: FileInfo = None,
        legal_cert_back_file: FileInfo = None,
        legal_cert_expire_flag: bool = None,
        legal_mobile: str = None,
        legal_effect_date: str = None,
        legal_expire_date: str = None,
    ):
        # 法人名称
        self.legal_name = legal_name
        # 法人证件号
        self.legal_cert_no = legal_cert_no
        # 法人证件正面（人像面）
        self.legal_cert_front_file = legal_cert_front_file
        # 法人证件反面
        self.legal_cert_back_file = legal_cert_back_file
        # 法人证件是否长期有效（payChannel =JDPAY必填）
        # true：长期，false：非长期
        # 
        self.legal_cert_expire_flag = legal_cert_expire_flag
        # 法人手机号（payChannel =JDPAY必填）
        self.legal_mobile = legal_mobile
        # 证件有效期开始日期（payChannel =JDPAY必填）
        # legalCertExpireFlag=false/true时都必填，时间格式:yyyy-MM-dd
        self.legal_effect_date = legal_effect_date
        # 证件有效期结束（payChannel =JDPAY选填）
        # legalCertExpireFlag=false时必填，时间格式:yyyy-MM-dd
        self.legal_expire_date = legal_expire_date

    def validate(self):
        self.validate_required(self.legal_name, 'legal_name')
        self.validate_required(self.legal_cert_no, 'legal_cert_no')
        self.validate_required(self.legal_cert_front_file, 'legal_cert_front_file')
        if self.legal_cert_front_file:
            self.legal_cert_front_file.validate()
        self.validate_required(self.legal_cert_back_file, 'legal_cert_back_file')
        if self.legal_cert_back_file:
            self.legal_cert_back_file.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.legal_name is not None:
            result['legal_name'] = self.legal_name
        if self.legal_cert_no is not None:
            result['legal_cert_no'] = self.legal_cert_no
        if self.legal_cert_front_file is not None:
            result['legal_cert_front_file'] = self.legal_cert_front_file.to_map()
        if self.legal_cert_back_file is not None:
            result['legal_cert_back_file'] = self.legal_cert_back_file.to_map()
        if self.legal_cert_expire_flag is not None:
            result['legal_cert_expire_flag'] = self.legal_cert_expire_flag
        if self.legal_mobile is not None:
            result['legal_mobile'] = self.legal_mobile
        if self.legal_effect_date is not None:
            result['legal_effect_date'] = self.legal_effect_date
        if self.legal_expire_date is not None:
            result['legal_expire_date'] = self.legal_expire_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('legal_name') is not None:
            self.legal_name = m.get('legal_name')
        if m.get('legal_cert_no') is not None:
            self.legal_cert_no = m.get('legal_cert_no')
        if m.get('legal_cert_front_file') is not None:
            temp_model = FileInfo()
            self.legal_cert_front_file = temp_model.from_map(m['legal_cert_front_file'])
        if m.get('legal_cert_back_file') is not None:
            temp_model = FileInfo()
            self.legal_cert_back_file = temp_model.from_map(m['legal_cert_back_file'])
        if m.get('legal_cert_expire_flag') is not None:
            self.legal_cert_expire_flag = m.get('legal_cert_expire_flag')
        if m.get('legal_mobile') is not None:
            self.legal_mobile = m.get('legal_mobile')
        if m.get('legal_effect_date') is not None:
            self.legal_effect_date = m.get('legal_effect_date')
        if m.get('legal_expire_date') is not None:
            self.legal_expire_date = m.get('legal_expire_date')
        return self


class OrderFinanceInfo(TeaModel):
    def __init__(
        self,
        total_money: int = None,
        apply_status: str = None,
        loan_apply_date: str = None,
        loan_time: str = None,
        loan_serial_number: str = None,
        fund_divide_alipay_logon_id: str = None,
        fund_divide_alipay_uid: str = None,
        fund_withhold_alipay_logon_id: str = None,
        fund_withhold_alipay_uid: str = None,
        fee_paid_role: str = None,
        loan_channel: str = None,
        loan_payee_account: str = None,
        paid_company_id: str = None,
        bank_name: str = None,
        finance_status: str = None,
        payment_item_list: List[str] = None,
        transfer_compensate_in_account_type: str = None,
    ):
        # 放款金额
        self.total_money = total_money
        # 放款状态
        self.apply_status = apply_status
        # 融资申请时间(yyyy-MM-dd HH:mm:ss)
        self.loan_apply_date = loan_apply_date
        # 放款时间(yyyy-MM-dd HH:mm:ss)
        self.loan_time = loan_time
        # 放款交易流水号
        self.loan_serial_number = loan_serial_number
        # 资方分账户登录号
        self.fund_divide_alipay_logon_id = fund_divide_alipay_logon_id
        # 资方分账户uid
        self.fund_divide_alipay_uid = fund_divide_alipay_uid
        # 资方代扣户登录号
        self.fund_withhold_alipay_logon_id = fund_withhold_alipay_logon_id
        # 资方代扣户uid
        self.fund_withhold_alipay_uid = fund_withhold_alipay_uid
        # 手续费支付方
        self.fee_paid_role = fee_paid_role
        # 放款渠道
        self.loan_channel = loan_channel
        # 放款账户
        self.loan_payee_account = loan_payee_account
        # 付款公司统一社会信用代码
        self.paid_company_id = paid_company_id
        # 银行名称
        self.bank_name = bank_name
        # 融资状态
        self.finance_status = finance_status
        # 收款项目列表
        self.payment_item_list = payment_item_list
        # 转账代偿收款类型
        self.transfer_compensate_in_account_type = transfer_compensate_in_account_type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total_money is not None:
            result['total_money'] = self.total_money
        if self.apply_status is not None:
            result['apply_status'] = self.apply_status
        if self.loan_apply_date is not None:
            result['loan_apply_date'] = self.loan_apply_date
        if self.loan_time is not None:
            result['loan_time'] = self.loan_time
        if self.loan_serial_number is not None:
            result['loan_serial_number'] = self.loan_serial_number
        if self.fund_divide_alipay_logon_id is not None:
            result['fund_divide_alipay_logon_id'] = self.fund_divide_alipay_logon_id
        if self.fund_divide_alipay_uid is not None:
            result['fund_divide_alipay_uid'] = self.fund_divide_alipay_uid
        if self.fund_withhold_alipay_logon_id is not None:
            result['fund_withhold_alipay_logon_id'] = self.fund_withhold_alipay_logon_id
        if self.fund_withhold_alipay_uid is not None:
            result['fund_withhold_alipay_uid'] = self.fund_withhold_alipay_uid
        if self.fee_paid_role is not None:
            result['fee_paid_role'] = self.fee_paid_role
        if self.loan_channel is not None:
            result['loan_channel'] = self.loan_channel
        if self.loan_payee_account is not None:
            result['loan_payee_account'] = self.loan_payee_account
        if self.paid_company_id is not None:
            result['paid_company_id'] = self.paid_company_id
        if self.bank_name is not None:
            result['bank_name'] = self.bank_name
        if self.finance_status is not None:
            result['finance_status'] = self.finance_status
        if self.payment_item_list is not None:
            result['payment_item_list'] = self.payment_item_list
        if self.transfer_compensate_in_account_type is not None:
            result['transfer_compensate_in_account_type'] = self.transfer_compensate_in_account_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total_money') is not None:
            self.total_money = m.get('total_money')
        if m.get('apply_status') is not None:
            self.apply_status = m.get('apply_status')
        if m.get('loan_apply_date') is not None:
            self.loan_apply_date = m.get('loan_apply_date')
        if m.get('loan_time') is not None:
            self.loan_time = m.get('loan_time')
        if m.get('loan_serial_number') is not None:
            self.loan_serial_number = m.get('loan_serial_number')
        if m.get('fund_divide_alipay_logon_id') is not None:
            self.fund_divide_alipay_logon_id = m.get('fund_divide_alipay_logon_id')
        if m.get('fund_divide_alipay_uid') is not None:
            self.fund_divide_alipay_uid = m.get('fund_divide_alipay_uid')
        if m.get('fund_withhold_alipay_logon_id') is not None:
            self.fund_withhold_alipay_logon_id = m.get('fund_withhold_alipay_logon_id')
        if m.get('fund_withhold_alipay_uid') is not None:
            self.fund_withhold_alipay_uid = m.get('fund_withhold_alipay_uid')
        if m.get('fee_paid_role') is not None:
            self.fee_paid_role = m.get('fee_paid_role')
        if m.get('loan_channel') is not None:
            self.loan_channel = m.get('loan_channel')
        if m.get('loan_payee_account') is not None:
            self.loan_payee_account = m.get('loan_payee_account')
        if m.get('paid_company_id') is not None:
            self.paid_company_id = m.get('paid_company_id')
        if m.get('bank_name') is not None:
            self.bank_name = m.get('bank_name')
        if m.get('finance_status') is not None:
            self.finance_status = m.get('finance_status')
        if m.get('payment_item_list') is not None:
            self.payment_item_list = m.get('payment_item_list')
        if m.get('transfer_compensate_in_account_type') is not None:
            self.transfer_compensate_in_account_type = m.get('transfer_compensate_in_account_type')
        return self


class AppletRiskModel(TeaModel):
    def __init__(
        self,
        code: str = None,
        record_id: str = None,
        risk_rank: str = None,
        risk_name: str = None,
        risk_desc: str = None,
        flow_id: str = None,
        sub_risk_result_list: List[SubRentRiskItem] = None,
        error_msg: str = None,
    ):
        # 智租风控调用结果码，10000 表示调用成功。
        self.code = code
        # 风险咨询事件ID
        self.record_id = record_id
        # 风险等级。枚举值：RANK0-无法判断；RANK1-极低风险；RANK2-低风险；RANK3-中风险；RANK4-高风险；RANK5-极高风险
        self.risk_rank = risk_rank
        # 风险名称
        self.risk_name = risk_name
        # 风险等级中文描述
        self.risk_desc = risk_desc
        # 流程id
        self.flow_id = flow_id
        # 子风险结果列表
        self.sub_risk_result_list = sub_risk_result_list
        # 调用失败错误提示信息，仅调用失败时返回该字段信息。
        self.error_msg = error_msg

    def validate(self):
        self.validate_required(self.code, 'code')
        self.validate_required(self.record_id, 'record_id')
        self.validate_required(self.risk_rank, 'risk_rank')
        self.validate_required(self.risk_name, 'risk_name')
        self.validate_required(self.risk_desc, 'risk_desc')
        self.validate_required(self.flow_id, 'flow_id')
        if self.sub_risk_result_list:
            for k in self.sub_risk_result_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.code is not None:
            result['code'] = self.code
        if self.record_id is not None:
            result['record_id'] = self.record_id
        if self.risk_rank is not None:
            result['risk_rank'] = self.risk_rank
        if self.risk_name is not None:
            result['risk_name'] = self.risk_name
        if self.risk_desc is not None:
            result['risk_desc'] = self.risk_desc
        if self.flow_id is not None:
            result['flow_id'] = self.flow_id
        result['sub_risk_result_list'] = []
        if self.sub_risk_result_list is not None:
            for k in self.sub_risk_result_list:
                result['sub_risk_result_list'].append(k.to_map() if k else None)
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('record_id') is not None:
            self.record_id = m.get('record_id')
        if m.get('risk_rank') is not None:
            self.risk_rank = m.get('risk_rank')
        if m.get('risk_name') is not None:
            self.risk_name = m.get('risk_name')
        if m.get('risk_desc') is not None:
            self.risk_desc = m.get('risk_desc')
        if m.get('flow_id') is not None:
            self.flow_id = m.get('flow_id')
        self.sub_risk_result_list = []
        if m.get('sub_risk_result_list') is not None:
            for k in m.get('sub_risk_result_list'):
                temp_model = SubRentRiskItem()
                self.sub_risk_result_list.append(temp_model.from_map(k))
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        return self


class OrderWithholdContractInfo(TeaModel):
    def __init__(
        self,
        withholding_contract_id: str = None,
        contract_status: str = None,
    ):
        # 支付宝外部代扣协议号
        self.withholding_contract_id = withholding_contract_id
        # 用户代扣协议状态
        self.contract_status = contract_status

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.withholding_contract_id is not None:
            result['withholding_contract_id'] = self.withholding_contract_id
        if self.contract_status is not None:
            result['contract_status'] = self.contract_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('withholding_contract_id') is not None:
            self.withholding_contract_id = m.get('withholding_contract_id')
        if m.get('contract_status') is not None:
            self.contract_status = m.get('contract_status')
        return self


class MerchantOrderRepayStrategy(TeaModel):
    def __init__(
        self,
        term_index: int = None,
        lease_term_index: int = None,
        pay_money: int = None,
        to_compensate_date: str = None,
        fund_id: str = None,
        fund_company_name: str = None,
    ):
        # 分账期数(关联商户履约)
        self.term_index = term_index
        # 还款期数(关联用户还款承诺)
        self.lease_term_index = lease_term_index
        # 分账金额
        self.pay_money = pay_money
        # 转代偿时间，yyyy-MM-dd
        self.to_compensate_date = to_compensate_date
        # 资方社会统一信用代码
        self.fund_id = fund_id
        # 资方公司名称
        self.fund_company_name = fund_company_name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.term_index is not None:
            result['term_index'] = self.term_index
        if self.lease_term_index is not None:
            result['lease_term_index'] = self.lease_term_index
        if self.pay_money is not None:
            result['pay_money'] = self.pay_money
        if self.to_compensate_date is not None:
            result['to_compensate_date'] = self.to_compensate_date
        if self.fund_id is not None:
            result['fund_id'] = self.fund_id
        if self.fund_company_name is not None:
            result['fund_company_name'] = self.fund_company_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('term_index') is not None:
            self.term_index = m.get('term_index')
        if m.get('lease_term_index') is not None:
            self.lease_term_index = m.get('lease_term_index')
        if m.get('pay_money') is not None:
            self.pay_money = m.get('pay_money')
        if m.get('to_compensate_date') is not None:
            self.to_compensate_date = m.get('to_compensate_date')
        if m.get('fund_id') is not None:
            self.fund_id = m.get('fund_id')
        if m.get('fund_company_name') is not None:
            self.fund_company_name = m.get('fund_company_name')
        return self


class MerchantPayChannelInfo(TeaModel):
    def __init__(
        self,
        pay_channel: str = None,
        bind_alipay_no: str = None,
        settle_alipay_no: str = None,
        bind_alipay_uid: str = None,
        bank_num: str = None,
        bank_cnap: str = None,
        bank_account_type: str = None,
        sub_merchant_id: str = None,
        pay_expand_id: str = None,
    ):
        # ALIPAY 支付宝
        # JDPAY京东支付
        self.pay_channel = pay_channel
        # 绑定企业支付宝账号
        self.bind_alipay_no = bind_alipay_no
        # 结算企业支付宝账号
        self.settle_alipay_no = settle_alipay_no
        # 绑定支付宝uid
        self.bind_alipay_uid = bind_alipay_uid
        # 结算银行卡账号
        self.bank_num = bank_num
        # 联行号
        self.bank_cnap = bank_cnap
        # 结算账户类型
        # merchant_type=01企业时：ENTERPRISE
        # 03:民办非企业：ENTERPRISE
        # 07个体工商户时：PERSON或 ENTERPRISE
        self.bank_account_type = bank_account_type
        # 二级商户id
        self.sub_merchant_id = sub_merchant_id
        # 进件流水号
        self.pay_expand_id = pay_expand_id

    def validate(self):
        self.validate_required(self.pay_channel, 'pay_channel')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pay_channel is not None:
            result['pay_channel'] = self.pay_channel
        if self.bind_alipay_no is not None:
            result['bind_alipay_no'] = self.bind_alipay_no
        if self.settle_alipay_no is not None:
            result['settle_alipay_no'] = self.settle_alipay_no
        if self.bind_alipay_uid is not None:
            result['bind_alipay_uid'] = self.bind_alipay_uid
        if self.bank_num is not None:
            result['bank_num'] = self.bank_num
        if self.bank_cnap is not None:
            result['bank_cnap'] = self.bank_cnap
        if self.bank_account_type is not None:
            result['bank_account_type'] = self.bank_account_type
        if self.sub_merchant_id is not None:
            result['sub_merchant_id'] = self.sub_merchant_id
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pay_channel') is not None:
            self.pay_channel = m.get('pay_channel')
        if m.get('bind_alipay_no') is not None:
            self.bind_alipay_no = m.get('bind_alipay_no')
        if m.get('settle_alipay_no') is not None:
            self.settle_alipay_no = m.get('settle_alipay_no')
        if m.get('bind_alipay_uid') is not None:
            self.bind_alipay_uid = m.get('bind_alipay_uid')
        if m.get('bank_num') is not None:
            self.bank_num = m.get('bank_num')
        if m.get('bank_cnap') is not None:
            self.bank_cnap = m.get('bank_cnap')
        if m.get('bank_account_type') is not None:
            self.bank_account_type = m.get('bank_account_type')
        if m.get('sub_merchant_id') is not None:
            self.sub_merchant_id = m.get('sub_merchant_id')
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        return self


class DivideBindingTransInInfo(TeaModel):
    def __init__(
        self,
        alipay_pid: str = None,
    ):
        # 分账方支付宝pid
        self.alipay_pid = alipay_pid

    def validate(self):
        self.validate_required(self.alipay_pid, 'alipay_pid')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.alipay_pid is not None:
            result['alipay_pid'] = self.alipay_pid
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('alipay_pid') is not None:
            self.alipay_pid = m.get('alipay_pid')
        return self


class SignMerchantLeaseConfig(TeaModel):
    def __init__(
        self,
        merchant_product_id: str = None,
        merchant_brand: str = None,
        merchant_logo: str = None,
        large_merchant_logo: str = None,
        grayed: bool = None,
        rental_plan: List[str] = None,
        rental_plan_intro: str = None,
        rental_period: List[int] = None,
        support_renew: bool = None,
        support_buyout: bool = None,
        lease_price_plan_list: List[LeasePricePlan] = None,
        free_shipping_out: bool = None,
        free_shipping_back: bool = None,
        shipping_duration_type: str = None,
        value_added_service_intro: str = None,
        detail_page_intro: str = None,
        service_promise_intro: List[str] = None,
    ):
        # 商户商品spuId
        self.merchant_product_id = merchant_product_id
        # 商户品牌
        self.merchant_brand = merchant_brand
        # logo
        self.merchant_logo = merchant_logo
        # logo
        self.large_merchant_logo = large_merchant_logo
        # 是否置灰
        self.grayed = grayed
        # 租赁方案
        self.rental_plan = rental_plan
        # 租赁方案说明
        self.rental_plan_intro = rental_plan_intro
        # 租赁周期
        self.rental_period = rental_period
        # 可续租
        self.support_renew = support_renew
        # 可买断
        self.support_buyout = support_buyout
        # 租赁价格方案列表
        self.lease_price_plan_list = lease_price_plan_list
        # 寄出是否包邮
        self.free_shipping_out = free_shipping_out
        # 寄回是否包邮
        self.free_shipping_back = free_shipping_back
        # 发货时效
        self.shipping_duration_type = shipping_duration_type
        # 增值服务介绍
        self.value_added_service_intro = value_added_service_intro
        # 详情页介绍
        self.detail_page_intro = detail_page_intro
        # 服务承诺
        self.service_promise_intro = service_promise_intro

    def validate(self):
        if self.lease_price_plan_list:
            for k in self.lease_price_plan_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.merchant_product_id is not None:
            result['merchant_product_id'] = self.merchant_product_id
        if self.merchant_brand is not None:
            result['merchant_brand'] = self.merchant_brand
        if self.merchant_logo is not None:
            result['merchant_logo'] = self.merchant_logo
        if self.large_merchant_logo is not None:
            result['large_merchant_logo'] = self.large_merchant_logo
        if self.grayed is not None:
            result['grayed'] = self.grayed
        if self.rental_plan is not None:
            result['rental_plan'] = self.rental_plan
        if self.rental_plan_intro is not None:
            result['rental_plan_intro'] = self.rental_plan_intro
        if self.rental_period is not None:
            result['rental_period'] = self.rental_period
        if self.support_renew is not None:
            result['support_renew'] = self.support_renew
        if self.support_buyout is not None:
            result['support_buyout'] = self.support_buyout
        result['lease_price_plan_list'] = []
        if self.lease_price_plan_list is not None:
            for k in self.lease_price_plan_list:
                result['lease_price_plan_list'].append(k.to_map() if k else None)
        if self.free_shipping_out is not None:
            result['free_shipping_out'] = self.free_shipping_out
        if self.free_shipping_back is not None:
            result['free_shipping_back'] = self.free_shipping_back
        if self.shipping_duration_type is not None:
            result['shipping_duration_type'] = self.shipping_duration_type
        if self.value_added_service_intro is not None:
            result['value_added_service_intro'] = self.value_added_service_intro
        if self.detail_page_intro is not None:
            result['detail_page_intro'] = self.detail_page_intro
        if self.service_promise_intro is not None:
            result['service_promise_intro'] = self.service_promise_intro
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('merchant_product_id') is not None:
            self.merchant_product_id = m.get('merchant_product_id')
        if m.get('merchant_brand') is not None:
            self.merchant_brand = m.get('merchant_brand')
        if m.get('merchant_logo') is not None:
            self.merchant_logo = m.get('merchant_logo')
        if m.get('large_merchant_logo') is not None:
            self.large_merchant_logo = m.get('large_merchant_logo')
        if m.get('grayed') is not None:
            self.grayed = m.get('grayed')
        if m.get('rental_plan') is not None:
            self.rental_plan = m.get('rental_plan')
        if m.get('rental_plan_intro') is not None:
            self.rental_plan_intro = m.get('rental_plan_intro')
        if m.get('rental_period') is not None:
            self.rental_period = m.get('rental_period')
        if m.get('support_renew') is not None:
            self.support_renew = m.get('support_renew')
        if m.get('support_buyout') is not None:
            self.support_buyout = m.get('support_buyout')
        self.lease_price_plan_list = []
        if m.get('lease_price_plan_list') is not None:
            for k in m.get('lease_price_plan_list'):
                temp_model = LeasePricePlan()
                self.lease_price_plan_list.append(temp_model.from_map(k))
        if m.get('free_shipping_out') is not None:
            self.free_shipping_out = m.get('free_shipping_out')
        if m.get('free_shipping_back') is not None:
            self.free_shipping_back = m.get('free_shipping_back')
        if m.get('shipping_duration_type') is not None:
            self.shipping_duration_type = m.get('shipping_duration_type')
        if m.get('value_added_service_intro') is not None:
            self.value_added_service_intro = m.get('value_added_service_intro')
        if m.get('detail_page_intro') is not None:
            self.detail_page_intro = m.get('detail_page_intro')
        if m.get('service_promise_intro') is not None:
            self.service_promise_intro = m.get('service_promise_intro')
        return self


class TemplateComponent(TeaModel):
    def __init__(
        self,
        template_code: str = None,
        id: str = None,
        name: str = None,
        uk: str = None,
        placeholder: str = None,
        enable_edit: str = None,
        required: str = None,
        type: str = None,
        value: str = None,
    ):
        # 模板编码
        self.template_code = template_code
        # 组件（文本域）id
        self.id = id
        # 组件（文本域）名称
        self.name = name
        # 组件（文本域）的唯一标识
        self.uk = uk
        # 占位符，组件（文本域）的展示样式值
        self.placeholder = placeholder
        # 组件（文本域）是否可以编辑。取值：Y/N
        self.enable_edit = enable_edit
        # 是否必填，取值：Y/N
        self.required = required
        # 组件（文本域）类型，INPUT:单行文本 TEXTAREA:多行文本
        self.type = type
        # 组件（文本域）值
        self.value = value

    def validate(self):
        self.validate_required(self.template_code, 'template_code')
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.value, 'value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.template_code is not None:
            result['template_code'] = self.template_code
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.uk is not None:
            result['uk'] = self.uk
        if self.placeholder is not None:
            result['placeholder'] = self.placeholder
        if self.enable_edit is not None:
            result['enable_edit'] = self.enable_edit
        if self.required is not None:
            result['required'] = self.required
        if self.type is not None:
            result['type'] = self.type
        if self.value is not None:
            result['value'] = self.value
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('template_code') is not None:
            self.template_code = m.get('template_code')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('uk') is not None:
            self.uk = m.get('uk')
        if m.get('placeholder') is not None:
            self.placeholder = m.get('placeholder')
        if m.get('enable_edit') is not None:
            self.enable_edit = m.get('enable_edit')
        if m.get('required') is not None:
            self.required = m.get('required')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('value') is not None:
            self.value = m.get('value')
        return self


class StaticData(TeaModel):
    def __init__(
        self,
        module_name: str = None,
        module_detail_list: List[StaticDataModuleDetail] = None,
    ):
        # 商户类型
        self.module_name = module_name
        # 静态数据详情
        self.module_detail_list = module_detail_list

    def validate(self):
        self.validate_required(self.module_name, 'module_name')
        self.validate_required(self.module_detail_list, 'module_detail_list')
        if self.module_detail_list:
            for k in self.module_detail_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.module_name is not None:
            result['module_name'] = self.module_name
        result['module_detail_list'] = []
        if self.module_detail_list is not None:
            for k in self.module_detail_list:
                result['module_detail_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('module_name') is not None:
            self.module_name = m.get('module_name')
        self.module_detail_list = []
        if m.get('module_detail_list') is not None:
            for k in m.get('module_detail_list'):
                temp_model = StaticDataModuleDetail()
                self.module_detail_list.append(temp_model.from_map(k))
        return self


class MerchantAgentPage(TeaModel):
    def __init__(
        self,
        pay_expand_id: str = None,
        agent_name: str = None,
        tenant_id: str = None,
        biz_type: str = None,
        pay_expand_status: str = None,
    ):
        # 进件id
        self.pay_expand_id = pay_expand_id
        # 
        # 代理企业名称
        self.agent_name = agent_name
        # 租户8位id
        self.tenant_id = tenant_id
        # 业务类型
        self.biz_type = biz_type
        # 进件审核状态 枚举
        self.pay_expand_status = pay_expand_status

    def validate(self):
        self.validate_required(self.pay_expand_id, 'pay_expand_id')
        self.validate_required(self.agent_name, 'agent_name')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.biz_type, 'biz_type')
        self.validate_required(self.pay_expand_status, 'pay_expand_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.pay_expand_id is not None:
            result['pay_expand_id'] = self.pay_expand_id
        if self.agent_name is not None:
            result['agent_name'] = self.agent_name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.pay_expand_status is not None:
            result['pay_expand_status'] = self.pay_expand_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('pay_expand_id') is not None:
            self.pay_expand_id = m.get('pay_expand_id')
        if m.get('agent_name') is not None:
            self.agent_name = m.get('agent_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('pay_expand_status') is not None:
            self.pay_expand_status = m.get('pay_expand_status')
        return self


class OrderPromiseInfo(TeaModel):
    def __init__(
        self,
        repay_strategy_list: List[OrderRepayStrategy] = None,
    ):
        # 订单还款策略
        self.repay_strategy_list = repay_strategy_list

    def validate(self):
        if self.repay_strategy_list:
            for k in self.repay_strategy_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        result['repay_strategy_list'] = []
        if self.repay_strategy_list is not None:
            for k in self.repay_strategy_list:
                result['repay_strategy_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        self.repay_strategy_list = []
        if m.get('repay_strategy_list') is not None:
            for k in m.get('repay_strategy_list'):
                temp_model = OrderRepayStrategy()
                self.repay_strategy_list.append(temp_model.from_map(k))
        return self


class ProductInfo(TeaModel):
    def __init__(
        self,
        merchant_id: str = None,
        product_name: str = None,
        product_id: str = None,
        product_model: str = None,
        product_version: str = None,
        product_price: int = None,
        main_class: str = None,
        sub_class: str = None,
        product_brand: str = None,
    ):
        # 商家社会统一信用代码
        self.merchant_id = merchant_id
        # 商品名称
        self.product_name = product_name
        # 商品id
        self.product_id = product_id
        # 商品规格
        self.product_model = product_model
        # 商品版本
        self.product_version = product_version
        # 指导价(单位分)
        self.product_price = product_price
        # 一级类目
        self.main_class = main_class
        # 二级类目
        self.sub_class = sub_class
        # 品牌
        self.product_brand = product_brand

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.product_name is not None:
            result['product_name'] = self.product_name
        if self.product_id is not None:
            result['product_id'] = self.product_id
        if self.product_model is not None:
            result['product_model'] = self.product_model
        if self.product_version is not None:
            result['product_version'] = self.product_version
        if self.product_price is not None:
            result['product_price'] = self.product_price
        if self.main_class is not None:
            result['main_class'] = self.main_class
        if self.sub_class is not None:
            result['sub_class'] = self.sub_class
        if self.product_brand is not None:
            result['product_brand'] = self.product_brand
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('product_name') is not None:
            self.product_name = m.get('product_name')
        if m.get('product_id') is not None:
            self.product_id = m.get('product_id')
        if m.get('product_model') is not None:
            self.product_model = m.get('product_model')
        if m.get('product_version') is not None:
            self.product_version = m.get('product_version')
        if m.get('product_price') is not None:
            self.product_price = m.get('product_price')
        if m.get('main_class') is not None:
            self.main_class = m.get('main_class')
        if m.get('sub_class') is not None:
            self.sub_class = m.get('sub_class')
        if m.get('product_brand') is not None:
            self.product_brand = m.get('product_brand')
        return self


class InnerCreditInfo(TeaModel):
    def __init__(
        self,
        content_id: str = None,
        content_type: str = None,
        credit_name: str = None,
        credit_file_url: str = None,
        credit_content: str = None,
        create_time: str = None,
    ):
        # 凭证内容id
        self.content_id = content_id
        # 资产凭证的类型，可支持：FILE(文件)、TEXT(文本)、JSON_TEXT(JSON文本)
        self.content_type = content_type
        # 资产凭证名称
        self.credit_name = credit_name
        # 凭证文件下载链接
        self.credit_file_url = credit_file_url
        # 上传的文本内容
        self.credit_content = credit_content
        # 凭证创建时间(yyyy-MM-dd HH:mm:ss)
        self.create_time = create_time

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.content_id is not None:
            result['content_id'] = self.content_id
        if self.content_type is not None:
            result['content_type'] = self.content_type
        if self.credit_name is not None:
            result['credit_name'] = self.credit_name
        if self.credit_file_url is not None:
            result['credit_file_url'] = self.credit_file_url
        if self.credit_content is not None:
            result['credit_content'] = self.credit_content
        if self.create_time is not None:
            result['create_time'] = self.create_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('content_id') is not None:
            self.content_id = m.get('content_id')
        if m.get('content_type') is not None:
            self.content_type = m.get('content_type')
        if m.get('credit_name') is not None:
            self.credit_name = m.get('credit_name')
        if m.get('credit_file_url') is not None:
            self.credit_file_url = m.get('credit_file_url')
        if m.get('credit_content') is not None:
            self.credit_content = m.get('credit_content')
        if m.get('create_time') is not None:
            self.create_time = m.get('create_time')
        return self


class PromiseInfo(TeaModel):
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


class FundAssertReport(TeaModel):
    def __init__(
        self,
        delivery_month: str = None,
        total_bill_amount: int = None,
        average_term: str = None,
        cancelled_bill_amount: int = None,
        total_bill_amount_yperiod: int = None,
        average_term_yperiod: str = None,
        cancelled_bill_amount_yperiod: int = None,
        bill_amount_overdue_by_1day_or_more: str = None,
        bill_amount_overdue_by_1day_or_more_yperiod: str = None,
        bill_amount_overdue_by_30days_or_more: str = None,
        bill_amount_overdue_by_30days_or_more_yperiod: str = None,
    ):
        # 投放月份 (整月)
        self.delivery_month = delivery_month
        # 账单金额
        self.total_bill_amount = total_bill_amount
        # 平均期限
        self.average_term = average_term
        # 状态为取消的账单金额
        self.cancelled_bill_amount = cancelled_bill_amount
        # Y期的订单的账单金额
        self.total_bill_amount_yperiod = total_bill_amount_yperiod
        # 已到Y期订单中Y期平均期限(y期订单的平均期限)
        self.average_term_yperiod = average_term_yperiod
        # Y期的订单中状态为取消的账单金额
        self.cancelled_bill_amount_yperiod = cancelled_bill_amount_yperiod
        # 状态为逾期1天及以上的账单金额
        self.bill_amount_overdue_by_1day_or_more = bill_amount_overdue_by_1day_or_more
        # Y期的订单中状态为逾期1天及以上的账单金额
        self.bill_amount_overdue_by_1day_or_more_yperiod = bill_amount_overdue_by_1day_or_more_yperiod
        # 状态为逾期30天及以上的账单金额
        self.bill_amount_overdue_by_30days_or_more = bill_amount_overdue_by_30days_or_more
        # Y期的订单中状态为逾期30天及以上的账单金额
        self.bill_amount_overdue_by_30days_or_more_yperiod = bill_amount_overdue_by_30days_or_more_yperiod

    def validate(self):
        self.validate_required(self.delivery_month, 'delivery_month')
        self.validate_required(self.total_bill_amount, 'total_bill_amount')
        self.validate_required(self.average_term, 'average_term')
        self.validate_required(self.cancelled_bill_amount, 'cancelled_bill_amount')
        self.validate_required(self.total_bill_amount_yperiod, 'total_bill_amount_yperiod')
        self.validate_required(self.average_term_yperiod, 'average_term_yperiod')
        self.validate_required(self.cancelled_bill_amount_yperiod, 'cancelled_bill_amount_yperiod')
        self.validate_required(self.bill_amount_overdue_by_1day_or_more, 'bill_amount_overdue_by_1day_or_more')
        self.validate_required(self.bill_amount_overdue_by_1day_or_more_yperiod, 'bill_amount_overdue_by_1day_or_more_yperiod')
        self.validate_required(self.bill_amount_overdue_by_30days_or_more, 'bill_amount_overdue_by_30days_or_more')
        self.validate_required(self.bill_amount_overdue_by_30days_or_more_yperiod, 'bill_amount_overdue_by_30days_or_more_yperiod')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.delivery_month is not None:
            result['delivery_month'] = self.delivery_month
        if self.total_bill_amount is not None:
            result['total_bill_amount'] = self.total_bill_amount
        if self.average_term is not None:
            result['average_term'] = self.average_term
        if self.cancelled_bill_amount is not None:
            result['cancelled_bill_amount'] = self.cancelled_bill_amount
        if self.total_bill_amount_yperiod is not None:
            result['total_bill_amount_y_period'] = self.total_bill_amount_yperiod
        if self.average_term_yperiod is not None:
            result['average_term_y_period'] = self.average_term_yperiod
        if self.cancelled_bill_amount_yperiod is not None:
            result['cancelled_bill_amount_y_period'] = self.cancelled_bill_amount_yperiod
        if self.bill_amount_overdue_by_1day_or_more is not None:
            result['bill_amount_overdue_by1day_or_more'] = self.bill_amount_overdue_by_1day_or_more
        if self.bill_amount_overdue_by_1day_or_more_yperiod is not None:
            result['bill_amount_overdue_by1day_or_more_y_period'] = self.bill_amount_overdue_by_1day_or_more_yperiod
        if self.bill_amount_overdue_by_30days_or_more is not None:
            result['bill_amount_overdue_by30_days_or_more'] = self.bill_amount_overdue_by_30days_or_more
        if self.bill_amount_overdue_by_30days_or_more_yperiod is not None:
            result['bill_amount_overdue_by30_days_or_more_y_period'] = self.bill_amount_overdue_by_30days_or_more_yperiod
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('delivery_month') is not None:
            self.delivery_month = m.get('delivery_month')
        if m.get('total_bill_amount') is not None:
            self.total_bill_amount = m.get('total_bill_amount')
        if m.get('average_term') is not None:
            self.average_term = m.get('average_term')
        if m.get('cancelled_bill_amount') is not None:
            self.cancelled_bill_amount = m.get('cancelled_bill_amount')
        if m.get('total_bill_amount_y_period') is not None:
            self.total_bill_amount_yperiod = m.get('total_bill_amount_y_period')
        if m.get('average_term_y_period') is not None:
            self.average_term_yperiod = m.get('average_term_y_period')
        if m.get('cancelled_bill_amount_y_period') is not None:
            self.cancelled_bill_amount_yperiod = m.get('cancelled_bill_amount_y_period')
        if m.get('bill_amount_overdue_by1day_or_more') is not None:
            self.bill_amount_overdue_by_1day_or_more = m.get('bill_amount_overdue_by1day_or_more')
        if m.get('bill_amount_overdue_by1day_or_more_y_period') is not None:
            self.bill_amount_overdue_by_1day_or_more_yperiod = m.get('bill_amount_overdue_by1day_or_more_y_period')
        if m.get('bill_amount_overdue_by30_days_or_more') is not None:
            self.bill_amount_overdue_by_30days_or_more = m.get('bill_amount_overdue_by30_days_or_more')
        if m.get('bill_amount_overdue_by30_days_or_more_y_period') is not None:
            self.bill_amount_overdue_by_30days_or_more_yperiod = m.get('bill_amount_overdue_by30_days_or_more_y_period')
        return self


class CustomerServiceInfo(TeaModel):
    def __init__(
        self,
        merchant_id: str = None,
        merchant_name: str = None,
        process_type: str = None,
    ):
        # 公司社会统一信息代码
        self.merchant_id = merchant_id
        # 公司名称
        self.merchant_name = merchant_name
        # 处理类型:
        # MERCHANT_PROCESS("MERCHANT_PROCESS", "商家处理"),
        # PROXY_PROCESS("PROXY_PROCESS", "服务商代处理"),
        self.process_type = process_type

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.process_type is not None:
            result['process_type'] = self.process_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('process_type') is not None:
            self.process_type = m.get('process_type')
        return self


class OperationDivideTransInModel(TeaModel):
    def __init__(
        self,
        trans_in_user_id: str = None,
        divide_amount: int = None,
        desc: str = None,
    ):
        # 分账收入方支付宝用户id, 支付宝2088id
        self.trans_in_user_id = trans_in_user_id
        # 分账金额，单位为分
        # 
        self.divide_amount = divide_amount
        # 分账描述
        self.desc = desc

    def validate(self):
        self.validate_required(self.trans_in_user_id, 'trans_in_user_id')
        if self.trans_in_user_id is not None:
            self.validate_max_length(self.trans_in_user_id, 'trans_in_user_id', 64)
        self.validate_required(self.divide_amount, 'divide_amount')
        if self.divide_amount is not None:
            self.validate_minimum(self.divide_amount, 'divide_amount', 1)
        if self.desc is not None:
            self.validate_max_length(self.desc, 'desc', 64)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.trans_in_user_id is not None:
            result['trans_in_user_id'] = self.trans_in_user_id
        if self.divide_amount is not None:
            result['divide_amount'] = self.divide_amount
        if self.desc is not None:
            result['desc'] = self.desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('trans_in_user_id') is not None:
            self.trans_in_user_id = m.get('trans_in_user_id')
        if m.get('divide_amount') is not None:
            self.divide_amount = m.get('divide_amount')
        if m.get('desc') is not None:
            self.desc = m.get('desc')
        return self


class MerchantBaseInfo(TeaModel):
    def __init__(
        self,
        tenant_id: str = None,
        brand_name: str = None,
        brand_logo: str = None,
        merchant_app_link: str = None,
        merchant_phone: str = None,
        submit_time: str = None,
        status: str = None,
        brand_name_snapshot: str = None,
        brand_logo_snapshot: str = None,
        merchant_app_link_snapshot: str = None,
        merchant_phone_snapshot: str = None,
        submit_time_snapshot: str = None,
        refuse_reason_snapshot: str = None,
    ):
        # 租户id
        self.tenant_id = tenant_id
        # 品牌名称
        self.brand_name = brand_name
        # 品牌logo
        self.brand_logo = brand_logo
        # 商家小程序链接
        self.merchant_app_link = merchant_app_link
        # 商家更新电话
        self.merchant_phone = merchant_phone
        # 提交时间
        self.submit_time = submit_time
        # 审核状态
        self.status = status
        # 品牌名称-审核中
        self.brand_name_snapshot = brand_name_snapshot
        # 品牌logo-审核中
        self.brand_logo_snapshot = brand_logo_snapshot
        # 商家小程序链接_审核中
        self.merchant_app_link_snapshot = merchant_app_link_snapshot
        # 商家电话_审核中
        self.merchant_phone_snapshot = merchant_phone_snapshot
        # 更新时间_审核中
        self.submit_time_snapshot = submit_time_snapshot
        # 驳回原因_审核中
        self.refuse_reason_snapshot = refuse_reason_snapshot

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.brand_name is not None:
            result['brand_name'] = self.brand_name
        if self.brand_logo is not None:
            result['brand_logo'] = self.brand_logo
        if self.merchant_app_link is not None:
            result['merchant_app_link'] = self.merchant_app_link
        if self.merchant_phone is not None:
            result['merchant_phone'] = self.merchant_phone
        if self.submit_time is not None:
            result['submit_time'] = self.submit_time
        if self.status is not None:
            result['status'] = self.status
        if self.brand_name_snapshot is not None:
            result['brand_name_snapshot'] = self.brand_name_snapshot
        if self.brand_logo_snapshot is not None:
            result['brand_logo_snapshot'] = self.brand_logo_snapshot
        if self.merchant_app_link_snapshot is not None:
            result['merchant_app_link_snapshot'] = self.merchant_app_link_snapshot
        if self.merchant_phone_snapshot is not None:
            result['merchant_phone_snapshot'] = self.merchant_phone_snapshot
        if self.submit_time_snapshot is not None:
            result['submit_time_snapshot'] = self.submit_time_snapshot
        if self.refuse_reason_snapshot is not None:
            result['refuse_reason_snapshot'] = self.refuse_reason_snapshot
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('brand_name') is not None:
            self.brand_name = m.get('brand_name')
        if m.get('brand_logo') is not None:
            self.brand_logo = m.get('brand_logo')
        if m.get('merchant_app_link') is not None:
            self.merchant_app_link = m.get('merchant_app_link')
        if m.get('merchant_phone') is not None:
            self.merchant_phone = m.get('merchant_phone')
        if m.get('submit_time') is not None:
            self.submit_time = m.get('submit_time')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('brand_name_snapshot') is not None:
            self.brand_name_snapshot = m.get('brand_name_snapshot')
        if m.get('brand_logo_snapshot') is not None:
            self.brand_logo_snapshot = m.get('brand_logo_snapshot')
        if m.get('merchant_app_link_snapshot') is not None:
            self.merchant_app_link_snapshot = m.get('merchant_app_link_snapshot')
        if m.get('merchant_phone_snapshot') is not None:
            self.merchant_phone_snapshot = m.get('merchant_phone_snapshot')
        if m.get('submit_time_snapshot') is not None:
            self.submit_time_snapshot = m.get('submit_time_snapshot')
        if m.get('refuse_reason_snapshot') is not None:
            self.refuse_reason_snapshot = m.get('refuse_reason_snapshot')
        return self


class AssetPackageOrderInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        status: str = None,
        out_reason: str = None,
        order_credit_line: int = None,
        order_merchant_repayment_money: int = None,
        divide_start_term_index: int = None,
    ):
        # 订单id
        self.order_id = order_id
        # 订单状态
        self.status = status
        # 出包原因
        self.out_reason = out_reason
        # 订单用信额度
        self.order_credit_line = order_credit_line
        # 商户应还款金额
        self.order_merchant_repayment_money = order_merchant_repayment_money
        # 订单分账起始账期
        self.divide_start_term_index = divide_start_term_index

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.status, 'status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.status is not None:
            result['status'] = self.status
        if self.out_reason is not None:
            result['out_reason'] = self.out_reason
        if self.order_credit_line is not None:
            result['order_credit_line'] = self.order_credit_line
        if self.order_merchant_repayment_money is not None:
            result['order_merchant_repayment_money'] = self.order_merchant_repayment_money
        if self.divide_start_term_index is not None:
            result['divide_start_term_index'] = self.divide_start_term_index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('out_reason') is not None:
            self.out_reason = m.get('out_reason')
        if m.get('order_credit_line') is not None:
            self.order_credit_line = m.get('order_credit_line')
        if m.get('order_merchant_repayment_money') is not None:
            self.order_merchant_repayment_money = m.get('order_merchant_repayment_money')
        if m.get('divide_start_term_index') is not None:
            self.divide_start_term_index = m.get('divide_start_term_index')
        return self


class OperateDivideInfo(TeaModel):
    def __init__(
        self,
        period_num: int = None,
        operation_divide_trans_in_list: List[OperationDivideTransInDetailInfo] = None,
    ):
        # 当前用户履约的租期编号
        self.period_num = period_num
        # 经营分账收入方结果信息
        self.operation_divide_trans_in_list = operation_divide_trans_in_list

    def validate(self):
        if self.operation_divide_trans_in_list:
            for k in self.operation_divide_trans_in_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.period_num is not None:
            result['period_num'] = self.period_num
        result['operation_divide_trans_in_list'] = []
        if self.operation_divide_trans_in_list is not None:
            for k in self.operation_divide_trans_in_list:
                result['operation_divide_trans_in_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        self.operation_divide_trans_in_list = []
        if m.get('operation_divide_trans_in_list') is not None:
            for k in m.get('operation_divide_trans_in_list'):
                temp_model = OperationDivideTransInDetailInfo()
                self.operation_divide_trans_in_list.append(temp_model.from_map(k))
        return self


class OrderFulfillmentInfo(TeaModel):
    def __init__(
        self,
        lease_term_index: int = None,
        rental_return_state: str = None,
        real_repay_money: int = None,
        rental_money: int = None,
        return_time: str = None,
        return_way: str = None,
        return_voucher_serial: str = None,
        alipay_trade_no: str = None,
    ):
        # 租期编号
        self.lease_term_index = lease_term_index
        # 租期归还状态
        self.rental_return_state = rental_return_state
        # 实际还款金额(分)
        self.real_repay_money = real_repay_money
        # 租金(分)
        self.rental_money = rental_money
        # 每期实付时间
        self.return_time = return_time
        # 周期性代扣
        self.return_way = return_way
        # 还款流水号
        self.return_voucher_serial = return_voucher_serial
        # 支付宝协议号
        self.alipay_trade_no = alipay_trade_no

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.lease_term_index is not None:
            result['lease_term_index'] = self.lease_term_index
        if self.rental_return_state is not None:
            result['rental_return_state'] = self.rental_return_state
        if self.real_repay_money is not None:
            result['real_repay_money'] = self.real_repay_money
        if self.rental_money is not None:
            result['rental_money'] = self.rental_money
        if self.return_time is not None:
            result['return_time'] = self.return_time
        if self.return_way is not None:
            result['return_way'] = self.return_way
        if self.return_voucher_serial is not None:
            result['return_voucher_serial'] = self.return_voucher_serial
        if self.alipay_trade_no is not None:
            result['alipay_trade_no'] = self.alipay_trade_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('lease_term_index') is not None:
            self.lease_term_index = m.get('lease_term_index')
        if m.get('rental_return_state') is not None:
            self.rental_return_state = m.get('rental_return_state')
        if m.get('real_repay_money') is not None:
            self.real_repay_money = m.get('real_repay_money')
        if m.get('rental_money') is not None:
            self.rental_money = m.get('rental_money')
        if m.get('return_time') is not None:
            self.return_time = m.get('return_time')
        if m.get('return_way') is not None:
            self.return_way = m.get('return_way')
        if m.get('return_voucher_serial') is not None:
            self.return_voucher_serial = m.get('return_voucher_serial')
        if m.get('alipay_trade_no') is not None:
            self.alipay_trade_no = m.get('alipay_trade_no')
        return self


class CompanySummaryInfo(TeaModel):
    def __init__(
        self,
        merchant_id: str = None,
        merchant_name: str = None,
    ):
        # 社会统一信用代码
        self.merchant_id = merchant_id
        # 公司名称
        self.merchant_name = merchant_name

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.merchant_id is not None:
            result['merchant_id'] = self.merchant_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('merchant_id') is not None:
            self.merchant_id = m.get('merchant_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        return self


class OrderSearchInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        agreement_no: str = None,
        order_create_time: str = None,
        total_rent_money: int = None,
        rent_term: int = None,
        rent_unit: str = None,
        order_status: str = None,
        user_name: str = None,
        user_phone_number: str = None,
    ):
        # 订单id
        self.order_id = order_id
        # 支付宝代扣协议号
        self.agreement_no = agreement_no
        # 订单创建时间
        self.order_create_time = order_create_time
        # 租金总额（单位分）
        self.total_rent_money = total_rent_money
        # 租期
        self.rent_term = rent_term
        # 租期单位
        self.rent_unit = rent_unit
        # 订单状态
        self.order_status = order_status
        # 承租人名称
        self.user_name = user_name
        # 承租人手机号
        self.user_phone_number = user_phone_number

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.agreement_no is not None:
            result['agreement_no'] = self.agreement_no
        if self.order_create_time is not None:
            result['order_create_time'] = self.order_create_time
        if self.total_rent_money is not None:
            result['total_rent_money'] = self.total_rent_money
        if self.rent_term is not None:
            result['rent_term'] = self.rent_term
        if self.rent_unit is not None:
            result['rent_unit'] = self.rent_unit
        if self.order_status is not None:
            result['order_status'] = self.order_status
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_phone_number is not None:
            result['user_phone_number'] = self.user_phone_number
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('agreement_no') is not None:
            self.agreement_no = m.get('agreement_no')
        if m.get('order_create_time') is not None:
            self.order_create_time = m.get('order_create_time')
        if m.get('total_rent_money') is not None:
            self.total_rent_money = m.get('total_rent_money')
        if m.get('rent_term') is not None:
            self.rent_term = m.get('rent_term')
        if m.get('rent_unit') is not None:
            self.rent_unit = m.get('rent_unit')
        if m.get('order_status') is not None:
            self.order_status = m.get('order_status')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_phone_number') is not None:
            self.user_phone_number = m.get('user_phone_number')
        return self


class PromotionScene(TeaModel):
    def __init__(
        self,
        tenant_id: str = None,
        scene_code: str = None,
        scene_name: str = None,
        scene_remark: str = None,
        scene_product_amount: int = None,
        online_scene_product_amount: int = None,
    ):
        # 租户id
        self.tenant_id = tenant_id
        # 场景码
        self.scene_code = scene_code
        # 场景名称
        self.scene_name = scene_name
        # 场景备注
        self.scene_remark = scene_remark
        # 场景商品数量
        self.scene_product_amount = scene_product_amount
        # 已上线场景商品数量
        self.online_scene_product_amount = online_scene_product_amount

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.scene_name is not None:
            result['scene_name'] = self.scene_name
        if self.scene_remark is not None:
            result['scene_remark'] = self.scene_remark
        if self.scene_product_amount is not None:
            result['scene_product_amount'] = self.scene_product_amount
        if self.online_scene_product_amount is not None:
            result['online_scene_product_amount'] = self.online_scene_product_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('scene_name') is not None:
            self.scene_name = m.get('scene_name')
        if m.get('scene_remark') is not None:
            self.scene_remark = m.get('scene_remark')
        if m.get('scene_product_amount') is not None:
            self.scene_product_amount = m.get('scene_product_amount')
        if m.get('online_scene_product_amount') is not None:
            self.online_scene_product_amount = m.get('online_scene_product_amount')
        return self


class MerchantPerformanceRepaySupportInfo(TeaModel):
    def __init__(
        self,
        support_repay: bool = None,
        term_index: int = None,
    ):
        # 是否支持还款取消
        self.support_repay = support_repay
        # 商户履约期数
        self.term_index = term_index

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.support_repay is not None:
            result['support_repay'] = self.support_repay
        if self.term_index is not None:
            result['term_index'] = self.term_index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('support_repay') is not None:
            self.support_repay = m.get('support_repay')
        if m.get('term_index') is not None:
            self.term_index = m.get('term_index')
        return self


class OrderPromiseExcelInfo(TeaModel):
    def __init__(
        self,
        download_url: str = None,
        file_type: str = None,
        task_status: str = None,
    ):
        # 文件下载地址
        self.download_url = download_url
        # 文件类型,订单明细表:ORDER_DETAIL 还款记录表:ORDER_FULFILLMENT
        self.file_type = file_type
        # 任务状态
        # ● RUNNING:生成中
        # ● SUCCESS:已生成
        # ● FAILED:失败
        self.task_status = task_status

    def validate(self):
        self.validate_required(self.file_type, 'file_type')
        self.validate_required(self.task_status, 'task_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.download_url is not None:
            result['download_url'] = self.download_url
        if self.file_type is not None:
            result['file_type'] = self.file_type
        if self.task_status is not None:
            result['task_status'] = self.task_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('download_url') is not None:
            self.download_url = m.get('download_url')
        if m.get('file_type') is not None:
            self.file_type = m.get('file_type')
        if m.get('task_status') is not None:
            self.task_status = m.get('task_status')
        return self


class AssetPackageCreatePromisePlanParams(TeaModel):
    def __init__(
        self,
        period_num: int = None,
        pay_day: str = None,
        total_amount: int = None,
        principal_amount: int = None,
        interest_amount: int = None,
    ):
        # 账期
        self.period_num = period_num
        # 还款时间yyyy-MM-dd
        self.pay_day = pay_day
        # 计划还款总额，单位为分
        self.total_amount = total_amount
        # 本金，单位为分
        self.principal_amount = principal_amount
        # 利息，单位为分
        self.interest_amount = interest_amount

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.pay_day is not None:
            result['pay_day'] = self.pay_day
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.principal_amount is not None:
            result['principal_amount'] = self.principal_amount
        if self.interest_amount is not None:
            result['interest_amount'] = self.interest_amount
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('pay_day') is not None:
            self.pay_day = m.get('pay_day')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('principal_amount') is not None:
            self.principal_amount = m.get('principal_amount')
        if m.get('interest_amount') is not None:
            self.interest_amount = m.get('interest_amount')
        return self


class RiskStrategy(TeaModel):
    def __init__(
        self,
        id: str = None,
        name: str = None,
        decision: str = None,
        scene_code: str = None,
    ):
        # 策略ID
        self.id = id
        # 策略名称
        self.name = name
        # 策略决策结果
        self.decision = decision
        # 风险场景编码
        self.scene_code = scene_code

    def validate(self):
        self.validate_required(self.id, 'id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.decision, 'decision')
        self.validate_required(self.scene_code, 'scene_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.id is not None:
            result['id'] = self.id
        if self.name is not None:
            result['name'] = self.name
        if self.decision is not None:
            result['decision'] = self.decision
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('decision') is not None:
            self.decision = m.get('decision')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        return self


class MerchantSettleInfo(TeaModel):
    def __init__(
        self,
        bank_num: str = None,
        bank_cnap: str = None,
        bank_account_type: str = None,
        bank_branch_name: str = None,
        bank_name: str = None,
    ):
        # 结算银行卡账号
        self.bank_num = bank_num
        # 联行号
        self.bank_cnap = bank_cnap
        # 结算账户类型
        # merchant_type=01企业时：ENTERPRISE
        # 03:民办非企业：ENTERPRISE
        # 07个体工商户时：PERSON或 ENTERPRISE
        self.bank_account_type = bank_account_type
        # 支行名称
        self.bank_branch_name = bank_branch_name
        # 银行名称
        self.bank_name = bank_name

    def validate(self):
        self.validate_required(self.bank_num, 'bank_num')
        self.validate_required(self.bank_cnap, 'bank_cnap')
        self.validate_required(self.bank_account_type, 'bank_account_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.bank_num is not None:
            result['bank_num'] = self.bank_num
        if self.bank_cnap is not None:
            result['bank_cnap'] = self.bank_cnap
        if self.bank_account_type is not None:
            result['bank_account_type'] = self.bank_account_type
        if self.bank_branch_name is not None:
            result['bank_branch_name'] = self.bank_branch_name
        if self.bank_name is not None:
            result['bank_name'] = self.bank_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('bank_num') is not None:
            self.bank_num = m.get('bank_num')
        if m.get('bank_cnap') is not None:
            self.bank_cnap = m.get('bank_cnap')
        if m.get('bank_account_type') is not None:
            self.bank_account_type = m.get('bank_account_type')
        if m.get('bank_branch_name') is not None:
            self.bank_branch_name = m.get('bank_branch_name')
        if m.get('bank_name') is not None:
            self.bank_name = m.get('bank_name')
        return self


class KnowledgeInfo(TeaModel):
    def __init__(
        self,
        tenant_id: str = None,
        id: int = None,
        type: str = None,
        question: str = None,
        answer: str = None,
        has_order: bool = None,
        has_app_link: bool = None,
        has_manual: bool = None,
        status: str = None,
        refuse_reason: str = None,
    ):
        # 租户id
        self.tenant_id = tenant_id
        # 主键id
        self.id = id
        # 类型
        self.type = type
        # 问题
        self.question = question
        # 答案
        self.answer = answer
        # 是否选择订单
        self.has_order = has_order
        # 是否带小程序链接
        self.has_app_link = has_app_link
        # 是否转人工
        self.has_manual = has_manual
        # 状态
        self.status = status
        # 驳回原因
        self.refuse_reason = refuse_reason

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.id is not None:
            result['id'] = self.id
        if self.type is not None:
            result['type'] = self.type
        if self.question is not None:
            result['question'] = self.question
        if self.answer is not None:
            result['answer'] = self.answer
        if self.has_order is not None:
            result['has_order'] = self.has_order
        if self.has_app_link is not None:
            result['has_app_link'] = self.has_app_link
        if self.has_manual is not None:
            result['has_manual'] = self.has_manual
        if self.status is not None:
            result['status'] = self.status
        if self.refuse_reason is not None:
            result['refuse_reason'] = self.refuse_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('id') is not None:
            self.id = m.get('id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('question') is not None:
            self.question = m.get('question')
        if m.get('answer') is not None:
            self.answer = m.get('answer')
        if m.get('has_order') is not None:
            self.has_order = m.get('has_order')
        if m.get('has_app_link') is not None:
            self.has_app_link = m.get('has_app_link')
        if m.get('has_manual') is not None:
            self.has_manual = m.get('has_manual')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('refuse_reason') is not None:
            self.refuse_reason = m.get('refuse_reason')
        return self


class MarketingScoreInfo(TeaModel):
    def __init__(
        self,
        phone_num: str = None,
        score: str = None,
    ):
        # 手机号
        self.phone_num = phone_num
        # 营销分
        self.score = score

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        if self.score is not None:
            result['score'] = self.score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        if m.get('score') is not None:
            self.score = m.get('score')
        return self


class MerchantSupportEvidence(TeaModel):
    def __init__(
        self,
        merchant_operate_time: str = None,
        merchant_refuse_reason: str = None,
        merchant_refuse_evidences: List[str] = None,
    ):
        # 商家操作(拒绝)时间
        self.merchant_operate_time = merchant_operate_time
        # 商家拒绝原因
        self.merchant_refuse_reason = merchant_refuse_reason
        # 商家拒绝举证材料
        self.merchant_refuse_evidences = merchant_refuse_evidences

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.merchant_operate_time is not None:
            result['merchant_operate_time'] = self.merchant_operate_time
        if self.merchant_refuse_reason is not None:
            result['merchant_refuse_reason'] = self.merchant_refuse_reason
        if self.merchant_refuse_evidences is not None:
            result['merchant_refuse_evidences'] = self.merchant_refuse_evidences
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('merchant_operate_time') is not None:
            self.merchant_operate_time = m.get('merchant_operate_time')
        if m.get('merchant_refuse_reason') is not None:
            self.merchant_refuse_reason = m.get('merchant_refuse_reason')
        if m.get('merchant_refuse_evidences') is not None:
            self.merchant_refuse_evidences = m.get('merchant_refuse_evidences')
        return self


class OrderContractInfo(TeaModel):
    def __init__(
        self,
        sign_no: str = None,
        sign_time: str = None,
        contract_type: str = None,
        agreement_type: str = None,
        template_id: str = None,
        file_name: str = None,
        download_url: str = None,
    ):
        # 电子合同签署单号
        self.sign_no = sign_no
        # 签署时间
        self.sign_time = sign_time
        # 合同签署类型
        self.contract_type = contract_type
        # 文件合同类型
        self.agreement_type = agreement_type
        # 模板ID
        self.template_id = template_id
        # 模板文件名称
        self.file_name = file_name
        # 合同文件下载地址
        self.download_url = download_url

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.sign_no is not None:
            result['sign_no'] = self.sign_no
        if self.sign_time is not None:
            result['sign_time'] = self.sign_time
        if self.contract_type is not None:
            result['contract_type'] = self.contract_type
        if self.agreement_type is not None:
            result['agreement_type'] = self.agreement_type
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.file_name is not None:
            result['file_name'] = self.file_name
        if self.download_url is not None:
            result['download_url'] = self.download_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('sign_no') is not None:
            self.sign_no = m.get('sign_no')
        if m.get('sign_time') is not None:
            self.sign_time = m.get('sign_time')
        if m.get('contract_type') is not None:
            self.contract_type = m.get('contract_type')
        if m.get('agreement_type') is not None:
            self.agreement_type = m.get('agreement_type')
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('file_name') is not None:
            self.file_name = m.get('file_name')
        if m.get('download_url') is not None:
            self.download_url = m.get('download_url')
        return self


class MerchantPerformanceRedeemInfo(TeaModel):
    def __init__(
        self,
        support_redeem: bool = None,
        support_redeem_type_list: List[str] = None,
        merchant_performance_redeem_result_info: MerchantPerformanceRedeemResultInfo = None,
    ):
        # 是否展示“剩余账期提前回购”
        self.support_redeem = support_redeem
        # 可选回购类型
        # TRANSFER("TRANSFER", "转账代偿"),
        # WITHHOLD("WITHHOLD", "代扣代偿"),
        self.support_redeem_type_list = support_redeem_type_list
        # 商户履约赎回结果信息
        self.merchant_performance_redeem_result_info = merchant_performance_redeem_result_info

    def validate(self):
        if self.merchant_performance_redeem_result_info:
            self.merchant_performance_redeem_result_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.support_redeem is not None:
            result['support_redeem'] = self.support_redeem
        if self.support_redeem_type_list is not None:
            result['support_redeem_type_list'] = self.support_redeem_type_list
        if self.merchant_performance_redeem_result_info is not None:
            result['merchant_performance_redeem_result_info'] = self.merchant_performance_redeem_result_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('support_redeem') is not None:
            self.support_redeem = m.get('support_redeem')
        if m.get('support_redeem_type_list') is not None:
            self.support_redeem_type_list = m.get('support_redeem_type_list')
        if m.get('merchant_performance_redeem_result_info') is not None:
            temp_model = MerchantPerformanceRedeemResultInfo()
            self.merchant_performance_redeem_result_info = temp_model.from_map(m['merchant_performance_redeem_result_info'])
        return self


class PendingEventInfo(TeaModel):
    def __init__(
        self,
        event_id: str = None,
        type: str = None,
        status: str = None,
        content_subject: str = None,
        effective_start_time: str = None,
        effective_end_time: str = None,
        content_type: str = None,
        content_details: str = None,
    ):
        # 事件id
        self.event_id = event_id
        # 通知:NOTIFICATION
        # 确认函:CONFIRMATION
        self.type = type
        # ("PENDING","待办中"),  ("CONFIRMED","确认"),
        # ("REJECTED","已拒绝")
        # ("FAILED","失败"),("EXPIRED","已过期");
        self.status = status
        # 待办内容主题
        self.content_subject = content_subject
        # 事件有效期开始
        self.effective_start_time = effective_start_time
        # 事件有效期结束
        self.effective_end_time = effective_end_time
        # 待办类型
        # text
        # link
        self.content_type = content_type
        # 待办详情，
        # content_type=text，是富文本
        # content_type=link，是fileKey,通过antchain.ato.inner.file.download获取文件访问链接
        self.content_details = content_details

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.event_id is not None:
            result['event_id'] = self.event_id
        if self.type is not None:
            result['type'] = self.type
        if self.status is not None:
            result['status'] = self.status
        if self.content_subject is not None:
            result['content_subject'] = self.content_subject
        if self.effective_start_time is not None:
            result['effective_start_time'] = self.effective_start_time
        if self.effective_end_time is not None:
            result['effective_end_time'] = self.effective_end_time
        if self.content_type is not None:
            result['content_type'] = self.content_type
        if self.content_details is not None:
            result['content_details'] = self.content_details
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('event_id') is not None:
            self.event_id = m.get('event_id')
        if m.get('type') is not None:
            self.type = m.get('type')
        if m.get('status') is not None:
            self.status = m.get('status')
        if m.get('content_subject') is not None:
            self.content_subject = m.get('content_subject')
        if m.get('effective_start_time') is not None:
            self.effective_start_time = m.get('effective_start_time')
        if m.get('effective_end_time') is not None:
            self.effective_end_time = m.get('effective_end_time')
        if m.get('content_type') is not None:
            self.content_type = m.get('content_type')
        if m.get('content_details') is not None:
            self.content_details = m.get('content_details')
        return self


class PriceDetail(TeaModel):
    def __init__(
        self,
        period_num: int = None,
        deposit_price: int = None,
        buyout_price: int = None,
        initial_rent_price: int = None,
    ):
        # 商品租赁期数
        self.period_num = period_num
        # 押金，单位：分。
        self.deposit_price = deposit_price
        # 买断价格，单位：分
        self.buyout_price = buyout_price
        # 首期租金，单位：分
        self.initial_rent_price = initial_rent_price

    def validate(self):
        self.validate_required(self.period_num, 'period_num')
        if self.period_num is not None:
            self.validate_maximum(self.period_num, 'period_num', 1000)
        self.validate_required(self.deposit_price, 'deposit_price')
        if self.deposit_price is not None:
            self.validate_maximum(self.deposit_price, 'deposit_price', 10000000)
        self.validate_required(self.buyout_price, 'buyout_price')
        if self.buyout_price is not None:
            self.validate_maximum(self.buyout_price, 'buyout_price', 10000000)
        self.validate_required(self.initial_rent_price, 'initial_rent_price')
        if self.initial_rent_price is not None:
            self.validate_maximum(self.initial_rent_price, 'initial_rent_price', 10000000)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.period_num is not None:
            result['period_num'] = self.period_num
        if self.deposit_price is not None:
            result['deposit_price'] = self.deposit_price
        if self.buyout_price is not None:
            result['buyout_price'] = self.buyout_price
        if self.initial_rent_price is not None:
            result['initial_rent_price'] = self.initial_rent_price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('period_num') is not None:
            self.period_num = m.get('period_num')
        if m.get('deposit_price') is not None:
            self.deposit_price = m.get('deposit_price')
        if m.get('buyout_price') is not None:
            self.buyout_price = m.get('buyout_price')
        if m.get('initial_rent_price') is not None:
            self.initial_rent_price = m.get('initial_rent_price')
        return self


class OrderMsgInfo(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        msg_id: str = None,
        msg_publish_type: str = None,
        msg_create_time: str = None,
        msg_status: str = None,
        msg_retry_time: int = None,
        msg_content: str = None,
        msg_callback_url: str = None,
        new_msg_callback_url: str = None,
    ):
        # 订单id
        # 
        self.order_id = order_id
        # 消息ID
        # 
        self.msg_id = msg_id
        # 消息类型
        # 
        self.msg_publish_type = msg_publish_type
        # 消息创建时间
        # 
        self.msg_create_time = msg_create_time
        # 消息投递状态 SUCCESS 成功 FAIL 失败 WAIT 等待投递重试
        self.msg_status = msg_status
        # 消息重投次数
        # 
        self.msg_retry_time = msg_retry_time
        # 消息体内容
        self.msg_content = msg_content
        # 消息回调地址
        self.msg_callback_url = msg_callback_url
        # 新回调地址
        self.new_msg_callback_url = new_msg_callback_url

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.msg_id, 'msg_id')
        self.validate_required(self.msg_publish_type, 'msg_publish_type')
        self.validate_required(self.msg_create_time, 'msg_create_time')
        if self.msg_create_time is not None:
            self.validate_pattern(self.msg_create_time, 'msg_create_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.msg_status, 'msg_status')
        self.validate_required(self.msg_retry_time, 'msg_retry_time')
        self.validate_required(self.msg_content, 'msg_content')
        self.validate_required(self.msg_callback_url, 'msg_callback_url')
        self.validate_required(self.new_msg_callback_url, 'new_msg_callback_url')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.msg_id is not None:
            result['msg_id'] = self.msg_id
        if self.msg_publish_type is not None:
            result['msg_publish_type'] = self.msg_publish_type
        if self.msg_create_time is not None:
            result['msg_create_time'] = self.msg_create_time
        if self.msg_status is not None:
            result['msg_status'] = self.msg_status
        if self.msg_retry_time is not None:
            result['msg_retry_time'] = self.msg_retry_time
        if self.msg_content is not None:
            result['msg_content'] = self.msg_content
        if self.msg_callback_url is not None:
            result['msg_callback_url'] = self.msg_callback_url
        if self.new_msg_callback_url is not None:
            result['new_msg_callback_url'] = self.new_msg_callback_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('msg_id') is not None:
            self.msg_id = m.get('msg_id')
        if m.get('msg_publish_type') is not None:
            self.msg_publish_type = m.get('msg_publish_type')
        if m.get('msg_create_time') is not None:
            self.msg_create_time = m.get('msg_create_time')
        if m.get('msg_status') is not None:
            self.msg_status = m.get('msg_status')
        if m.get('msg_retry_time') is not None:
            self.msg_retry_time = m.get('msg_retry_time')
        if m.get('msg_content') is not None:
            self.msg_content = m.get('msg_content')
        if m.get('msg_callback_url') is not None:
            self.msg_callback_url = m.get('msg_callback_url')
        if m.get('new_msg_callback_url') is not None:
            self.new_msg_callback_url = m.get('new_msg_callback_url')
        return self


class AwardingQueryModel(TeaModel):
    def __init__(
        self,
        opposing_userid: str = None,
        opposing_open_id: str = None,
        service_category: str = None,
        isv_pid: str = None,
        bank_card_no: str = None,
        imei: str = None,
        imsi: str = None,
        sales_amount: int = None,
        user_name: str = None,
        store_mcc_desc: str = None,
        customer_id: str = None,
        qr_code: str = None,
    ):
        # 对方支付宝账户 uid，用于表示两个账户在业务交互中的对方账户，如人传人活动用户A会拉用户B来注册领奖，其中用户B为对方账户
        self.opposing_userid = opposing_userid
        # 对方支付宝账户openid，营销发奖风险识别场景，userid 与 open_id 至少传入一个
        self.opposing_open_id = opposing_open_id
        # 服务二级分类
        self.service_category = service_category
        # 服务商 pid
        self.isv_pid = isv_pid
        # 银行卡号
        self.bank_card_no = bank_card_no
        # 手机序列号
        self.imei = imei
        # 国际移动用户识别码
        self.imsi = imsi
        # 金额，用户购买或使用服务时产生的具体金额，单位：分
        self.sales_amount = sales_amount
        # 用户姓名
        self.user_name = user_name
        # 门店行业类目，枚举值：CATERING - 餐饮；LEISURE - 休闲；MEDICAL - 医疗
        self.store_mcc_desc = store_mcc_desc
        # 消费者 id，外部会员账号
        self.customer_id = customer_id
        # 填入想要咨询风控的二维码值，需为唯一值
        self.qr_code = qr_code

    def validate(self):
        if self.opposing_userid is not None:
            self.validate_max_length(self.opposing_userid, 'opposing_userid', 128)
        if self.opposing_open_id is not None:
            self.validate_max_length(self.opposing_open_id, 'opposing_open_id', 128)
        if self.service_category is not None:
            self.validate_max_length(self.service_category, 'service_category', 128)
        if self.isv_pid is not None:
            self.validate_max_length(self.isv_pid, 'isv_pid', 128)
        if self.bank_card_no is not None:
            self.validate_max_length(self.bank_card_no, 'bank_card_no', 128)
        if self.imei is not None:
            self.validate_max_length(self.imei, 'imei', 128)
        if self.imsi is not None:
            self.validate_max_length(self.imsi, 'imsi', 128)
        if self.sales_amount is not None:
            self.validate_maximum(self.sales_amount, 'sales_amount', 10000000)
            self.validate_minimum(self.sales_amount, 'sales_amount', 1)
        if self.user_name is not None:
            self.validate_max_length(self.user_name, 'user_name', 128)
        if self.store_mcc_desc is not None:
            self.validate_max_length(self.store_mcc_desc, 'store_mcc_desc', 30)
        self.validate_required(self.customer_id, 'customer_id')
        if self.customer_id is not None:
            self.validate_max_length(self.customer_id, 'customer_id', 128)
        if self.qr_code is not None:
            self.validate_max_length(self.qr_code, 'qr_code', 256)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.opposing_userid is not None:
            result['opposing_userid'] = self.opposing_userid
        if self.opposing_open_id is not None:
            result['opposing_open_id'] = self.opposing_open_id
        if self.service_category is not None:
            result['service_category'] = self.service_category
        if self.isv_pid is not None:
            result['isv_pid'] = self.isv_pid
        if self.bank_card_no is not None:
            result['bank_card_no'] = self.bank_card_no
        if self.imei is not None:
            result['imei'] = self.imei
        if self.imsi is not None:
            result['imsi'] = self.imsi
        if self.sales_amount is not None:
            result['sales_amount'] = self.sales_amount
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.store_mcc_desc is not None:
            result['store_mcc_desc'] = self.store_mcc_desc
        if self.customer_id is not None:
            result['customer_id'] = self.customer_id
        if self.qr_code is not None:
            result['qr_code'] = self.qr_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('opposing_userid') is not None:
            self.opposing_userid = m.get('opposing_userid')
        if m.get('opposing_open_id') is not None:
            self.opposing_open_id = m.get('opposing_open_id')
        if m.get('service_category') is not None:
            self.service_category = m.get('service_category')
        if m.get('isv_pid') is not None:
            self.isv_pid = m.get('isv_pid')
        if m.get('bank_card_no') is not None:
            self.bank_card_no = m.get('bank_card_no')
        if m.get('imei') is not None:
            self.imei = m.get('imei')
        if m.get('imsi') is not None:
            self.imsi = m.get('imsi')
        if m.get('sales_amount') is not None:
            self.sales_amount = m.get('sales_amount')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('store_mcc_desc') is not None:
            self.store_mcc_desc = m.get('store_mcc_desc')
        if m.get('customer_id') is not None:
            self.customer_id = m.get('customer_id')
        if m.get('qr_code') is not None:
            self.qr_code = m.get('qr_code')
        return self


class OrderUserInfo(TeaModel):
    def __init__(
        self,
        user_name: str = None,
        user_phone_number: str = None,
        user_address: str = None,
        alipay_uid: str = None,
        lessee_type: int = None,
        user_id: str = None,
    ):
        # 承租人名称
        self.user_name = user_name
        # 承租人手机号
        self.user_phone_number = user_phone_number
        # 地址
        self.user_address = user_address
        # 支付宝账号
        self.alipay_uid = alipay_uid
        # 租赁类别
        # 1:个人用户
        # 2:企业用户
        self.lessee_type = lessee_type
        # 承租人身份证
        self.user_id = user_id

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_phone_number is not None:
            result['user_phone_number'] = self.user_phone_number
        if self.user_address is not None:
            result['user_address'] = self.user_address
        if self.alipay_uid is not None:
            result['alipay_uid'] = self.alipay_uid
        if self.lessee_type is not None:
            result['lessee_type'] = self.lessee_type
        if self.user_id is not None:
            result['user_id'] = self.user_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_phone_number') is not None:
            self.user_phone_number = m.get('user_phone_number')
        if m.get('user_address') is not None:
            self.user_address = m.get('user_address')
        if m.get('alipay_uid') is not None:
            self.alipay_uid = m.get('alipay_uid')
        if m.get('lessee_type') is not None:
            self.lessee_type = m.get('lessee_type')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        return self


class AgreementPage(TeaModel):
    def __init__(
        self,
        agreement_id: str = None,
        merchant_name: str = None,
        tenant_id: str = None,
        product_main_class: str = None,
        agreement_type: str = None,
        sign_status: str = None,
    ):
        # 协议id
        self.agreement_id = agreement_id
        # 代理企业名称
        self.merchant_name = merchant_name
        # 租户8位id
        self.tenant_id = tenant_id
        # 业务类型 枚举
        self.product_main_class = product_main_class
        # 协议类型 枚举
        self.agreement_type = agreement_type
        # 租户签约状态 枚举
        self.sign_status = sign_status

    def validate(self):
        self.validate_required(self.agreement_id, 'agreement_id')
        self.validate_required(self.merchant_name, 'merchant_name')
        self.validate_required(self.tenant_id, 'tenant_id')
        self.validate_required(self.product_main_class, 'product_main_class')
        self.validate_required(self.agreement_type, 'agreement_type')
        self.validate_required(self.sign_status, 'sign_status')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.agreement_id is not None:
            result['agreement_id'] = self.agreement_id
        if self.merchant_name is not None:
            result['merchant_name'] = self.merchant_name
        if self.tenant_id is not None:
            result['tenant_id'] = self.tenant_id
        if self.product_main_class is not None:
            result['product_main_class'] = self.product_main_class
        if self.agreement_type is not None:
            result['agreement_type'] = self.agreement_type
        if self.sign_status is not None:
            result['sign_status'] = self.sign_status
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('agreement_id') is not None:
            self.agreement_id = m.get('agreement_id')
        if m.get('merchant_name') is not None:
            self.merchant_name = m.get('merchant_name')
        if m.get('tenant_id') is not None:
            self.tenant_id = m.get('tenant_id')
        if m.get('product_main_class') is not None:
            self.product_main_class = m.get('product_main_class')
        if m.get('agreement_type') is not None:
            self.agreement_type = m.get('agreement_type')
        if m.get('sign_status') is not None:
            self.sign_status = m.get('sign_status')
        return self


class FundMngLoanApplyResult(TeaModel):
    def __init__(
        self,
        loan_apply_status: str = None,
        loan_fail_reason: str = None,
    ):
        # 放款状态
        self.loan_apply_status = loan_apply_status
        # 融资申请失败原因
        self.loan_fail_reason = loan_fail_reason

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.loan_apply_status is not None:
            result['loan_apply_status'] = self.loan_apply_status
        if self.loan_fail_reason is not None:
            result['loan_fail_reason'] = self.loan_fail_reason
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('loan_apply_status') is not None:
            self.loan_apply_status = m.get('loan_apply_status')
        if m.get('loan_fail_reason') is not None:
            self.loan_fail_reason = m.get('loan_fail_reason')
        return self


class SignAccount(TeaModel):
    def __init__(
        self,
        company_id: str = None,
        company_role: str = None,
        user_name: str = None,
        user_id_number: str = None,
        user_type: str = None,
        user_email: str = None,
        user_mobile: str = None,
        tag: str = None,
        get_sign_url: bool = None,
    ):
        # 公司统一社会信用代码（userType=ORGANIZATION必传）
        self.company_id = company_id
        # 公司角色（userType=ORGANIZATION必传） MERCHANT=商户;FINANCIER=资方
        self.company_role = company_role
        # 用户姓名（userType=PERSON必传，需要RSA加密）
        self.user_name = user_name
        # 用户身份证号（userType=PERSON必传，需要RSA加密）
        self.user_id_number = user_id_number
        # 签署人类型，PERSON=个人;ORGANIZATION=机构
        self.user_type = user_type
        # 用户邮箱（userType=PERSON必传，需要RSA加密）
        self.user_email = user_email
        # 用户手机号（userType=PERSON必传，需要RSA加密）
        self.user_mobile = user_mobile
        # 签署标签（对应模版配置中的tag）
        self.tag = tag
        # 是否获取签署链接
        self.get_sign_url = get_sign_url

    def validate(self):
        self.validate_required(self.user_type, 'user_type')
        self.validate_required(self.tag, 'tag')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.company_id is not None:
            result['company_id'] = self.company_id
        if self.company_role is not None:
            result['company_role'] = self.company_role
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.user_id_number is not None:
            result['user_id_number'] = self.user_id_number
        if self.user_type is not None:
            result['user_type'] = self.user_type
        if self.user_email is not None:
            result['user_email'] = self.user_email
        if self.user_mobile is not None:
            result['user_mobile'] = self.user_mobile
        if self.tag is not None:
            result['tag'] = self.tag
        if self.get_sign_url is not None:
            result['get_sign_url'] = self.get_sign_url
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('company_id') is not None:
            self.company_id = m.get('company_id')
        if m.get('company_role') is not None:
            self.company_role = m.get('company_role')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('user_id_number') is not None:
            self.user_id_number = m.get('user_id_number')
        if m.get('user_type') is not None:
            self.user_type = m.get('user_type')
        if m.get('user_email') is not None:
            self.user_email = m.get('user_email')
        if m.get('user_mobile') is not None:
            self.user_mobile = m.get('user_mobile')
        if m.get('tag') is not None:
            self.tag = m.get('tag')
        if m.get('get_sign_url') is not None:
            self.get_sign_url = m.get('get_sign_url')
        return self


class CreditUtilizationOrder(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        order_credit_line: int = None,
        order_merchant_repayment_money: int = None,
        divide_start_term_index: int = None,
    ):
        # 123
        self.order_id = order_id
        # 订单用信额度，单位为分
        self.order_credit_line = order_credit_line
        # 订单商户应还金额，单位为分
        self.order_merchant_repayment_money = order_merchant_repayment_money
        # 分账起始日期
        self.divide_start_term_index = divide_start_term_index

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        if self.order_id is not None:
            self.validate_max_length(self.order_id, 'order_id', 50)
        self.validate_required(self.order_credit_line, 'order_credit_line')
        if self.order_credit_line is not None:
            self.validate_minimum(self.order_credit_line, 'order_credit_line', 1)
        self.validate_required(self.order_merchant_repayment_money, 'order_merchant_repayment_money')
        if self.order_merchant_repayment_money is not None:
            self.validate_minimum(self.order_merchant_repayment_money, 'order_merchant_repayment_money', 1)
        self.validate_required(self.divide_start_term_index, 'divide_start_term_index')
        if self.divide_start_term_index is not None:
            self.validate_minimum(self.divide_start_term_index, 'divide_start_term_index', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.order_credit_line is not None:
            result['order_credit_line'] = self.order_credit_line
        if self.order_merchant_repayment_money is not None:
            result['order_merchant_repayment_money'] = self.order_merchant_repayment_money
        if self.divide_start_term_index is not None:
            result['divide_start_term_index'] = self.divide_start_term_index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('order_credit_line') is not None:
            self.order_credit_line = m.get('order_credit_line')
        if m.get('order_merchant_repayment_money') is not None:
            self.order_merchant_repayment_money = m.get('order_merchant_repayment_money')
        if m.get('divide_start_term_index') is not None:
            self.divide_start_term_index = m.get('divide_start_term_index')
        return self


class ActivePayOrder(TeaModel):
    def __init__(
        self,
        trade_no: str = None,
        trade_status: str = None,
        status_reason_code: str = None,
        status_reason_msg: str = None,
        total_amount: int = None,
        paid_amount: int = None,
        receipt_amount: int = None,
        gmt_pay: str = None,
        gmt_create: str = None,
        multi_pay_detail: List[SingleTermDetail] = None,
    ):
        # 支付宝支付订单号，用于拉起主动支付页面
        self.trade_no = trade_no
        # 状态
        # INIT：交易创建
        # FAILED：付款失败
        # SUCCESS：付款成功
        self.trade_status = trade_status
        # 状态原因码
        self.status_reason_code = status_reason_code
        # 超时关闭
        self.status_reason_msg = status_reason_msg
        # 本次交易支付的订单金额，单位为分
        # 付款成功或付款成功之后的状态必填
        self.total_amount = total_amount
        # 用户在交易中支付的金额，单位为分
        # 付款成功的状态必填
        self.paid_amount = paid_amount
        # 商家在交易中实际收到的款项，单位为分
        # 付款成功的状态必填
        self.receipt_amount = receipt_amount
        # 交易支付时间
        # 付款成功的状态必填
        self.gmt_pay = gmt_pay
        # 支付单据创建时间
        self.gmt_create = gmt_create
        # 多期合并支付明细
        self.multi_pay_detail = multi_pay_detail

    def validate(self):
        self.validate_required(self.trade_no, 'trade_no')
        if self.trade_no is not None:
            self.validate_max_length(self.trade_no, 'trade_no', 64)
        self.validate_required(self.trade_status, 'trade_status')
        if self.trade_status is not None:
            self.validate_max_length(self.trade_status, 'trade_status', 64)
        if self.total_amount is not None:
            self.validate_minimum(self.total_amount, 'total_amount', 1)
        if self.paid_amount is not None:
            self.validate_minimum(self.paid_amount, 'paid_amount', 1)
        if self.receipt_amount is not None:
            self.validate_minimum(self.receipt_amount, 'receipt_amount', 1)
        if self.gmt_pay is not None:
            self.validate_pattern(self.gmt_pay, 'gmt_pay', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.gmt_create is not None:
            self.validate_pattern(self.gmt_create, 'gmt_create', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.multi_pay_detail:
            for k in self.multi_pay_detail:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        if self.trade_status is not None:
            result['trade_status'] = self.trade_status
        if self.status_reason_code is not None:
            result['status_reason_code'] = self.status_reason_code
        if self.status_reason_msg is not None:
            result['status_reason_msg'] = self.status_reason_msg
        if self.total_amount is not None:
            result['total_amount'] = self.total_amount
        if self.paid_amount is not None:
            result['paid_amount'] = self.paid_amount
        if self.receipt_amount is not None:
            result['receipt_amount'] = self.receipt_amount
        if self.gmt_pay is not None:
            result['gmt_pay'] = self.gmt_pay
        if self.gmt_create is not None:
            result['gmt_create'] = self.gmt_create
        result['multi_pay_detail'] = []
        if self.multi_pay_detail is not None:
            for k in self.multi_pay_detail:
                result['multi_pay_detail'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        if m.get('trade_status') is not None:
            self.trade_status = m.get('trade_status')
        if m.get('status_reason_code') is not None:
            self.status_reason_code = m.get('status_reason_code')
        if m.get('status_reason_msg') is not None:
            self.status_reason_msg = m.get('status_reason_msg')
        if m.get('total_amount') is not None:
            self.total_amount = m.get('total_amount')
        if m.get('paid_amount') is not None:
            self.paid_amount = m.get('paid_amount')
        if m.get('receipt_amount') is not None:
            self.receipt_amount = m.get('receipt_amount')
        if m.get('gmt_pay') is not None:
            self.gmt_pay = m.get('gmt_pay')
        if m.get('gmt_create') is not None:
            self.gmt_create = m.get('gmt_create')
        self.multi_pay_detail = []
        if m.get('multi_pay_detail') is not None:
            for k in m.get('multi_pay_detail'):
                temp_model = SingleTermDetail()
                self.multi_pay_detail.append(temp_model.from_map(k))
        return self


class RejectRiskModel(TeaModel):
    def __init__(
        self,
        mob_three_score: str = None,
        fpd_thirty_score: str = None,
    ):
        # 拒量模型捞回分
        self.mob_three_score = mob_three_score
        # 拒量模型首逾分
        self.fpd_thirty_score = fpd_thirty_score

    def validate(self):
        self.validate_required(self.mob_three_score, 'mob_three_score')
        self.validate_required(self.fpd_thirty_score, 'fpd_thirty_score')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.mob_three_score is not None:
            result['mob_three_score'] = self.mob_three_score
        if self.fpd_thirty_score is not None:
            result['fpd_thirty_score'] = self.fpd_thirty_score
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('mob_three_score') is not None:
            self.mob_three_score = m.get('mob_three_score')
        if m.get('fpd_thirty_score') is not None:
            self.fpd_thirty_score = m.get('fpd_thirty_score')
        return self


class PageQuery(TeaModel):
    def __init__(
        self,
        page_size: int = None,
        page_index: int = None,
    ):
        # 页大小
        self.page_size = page_size
        # 当前页
        self.page_index = page_index

    def validate(self):
        self.validate_required(self.page_size, 'page_size')
        self.validate_required(self.page_index, 'page_index')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.page_index is not None:
            result['page_index'] = self.page_index
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('page_index') is not None:
            self.page_index = m.get('page_index')
        return self


class TemplateArgs(TeaModel):
    def __init__(
        self,
        template_id: str = None,
        template_version: str = None,
        template_args: str = None,
    ):
        # 模板id
        self.template_id = template_id
        # 模板版本
        self.template_version = template_version
        # 模板参数，JSON格式，其中key对应模板中的名称，value对应其要渲染的值
        self.template_args = template_args

    def validate(self):
        self.validate_required(self.template_id, 'template_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.template_id is not None:
            result['template_id'] = self.template_id
        if self.template_version is not None:
            result['template_version'] = self.template_version
        if self.template_args is not None:
            result['template_args'] = self.template_args
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('template_id') is not None:
            self.template_id = m.get('template_id')
        if m.get('template_version') is not None:
            self.template_version = m.get('template_version')
        if m.get('template_args') is not None:
            self.template_args = m.get('template_args')
        return self


class QueryAntchainAtoPromotionUserunvisitedappidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        user_id: str = None,
        app_id_list: List[str] = None,
        default_app_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 支付宝用户uid
        self.user_id = user_id
        # 订阅的appid列表，不支持的appid会自动忽略
        self.app_id_list = app_id_list
        # 默认appid，无法判断推荐结果时返回此默认值
        self.default_app_id = default_app_id

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.app_id_list, 'app_id_list')
        self.validate_required(self.default_app_id, 'default_app_id')

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
        if self.app_id_list is not None:
            result['app_id_list'] = self.app_id_list
        if self.default_app_id is not None:
            result['default_app_id'] = self.default_app_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('app_id_list') is not None:
            self.app_id_list = m.get('app_id_list')
        if m.get('default_app_id') is not None:
            self.default_app_id = m.get('default_app_id')
        return self


class QueryAntchainAtoPromotionUserunvisitedappidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        recommend_app_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 推荐的appid
        self.recommend_app_id = recommend_app_id

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
        if self.recommend_app_id is not None:
            result['recommend_app_id'] = self.recommend_app_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('recommend_app_id') is not None:
            self.recommend_app_id = m.get('recommend_app_id')
        return self


