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


class CargoDetail(TeaModel):
    def __init__(
        self,
        cargo_sequence_no: str = None,
        cargo_name: str = None,
        cargo_specification: str = None,
        cargo_quantity: str = None,
        cargo_unit_price: str = None,
    ):
        # 货物序号
        self.cargo_sequence_no = cargo_sequence_no
        # 货物名称
        self.cargo_name = cargo_name
        # 货物规格
        self.cargo_specification = cargo_specification
        # 货物数量
        self.cargo_quantity = cargo_quantity
        # 货物单价，小数位只支持2位
        self.cargo_unit_price = cargo_unit_price

    def validate(self):
        self.validate_required(self.cargo_sequence_no, 'cargo_sequence_no')
        self.validate_required(self.cargo_name, 'cargo_name')
        self.validate_required(self.cargo_specification, 'cargo_specification')
        self.validate_required(self.cargo_quantity, 'cargo_quantity')
        self.validate_required(self.cargo_unit_price, 'cargo_unit_price')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cargo_sequence_no is not None:
            result['cargo_sequence_no'] = self.cargo_sequence_no
        if self.cargo_name is not None:
            result['cargo_name'] = self.cargo_name
        if self.cargo_specification is not None:
            result['cargo_specification'] = self.cargo_specification
        if self.cargo_quantity is not None:
            result['cargo_quantity'] = self.cargo_quantity
        if self.cargo_unit_price is not None:
            result['cargo_unit_price'] = self.cargo_unit_price
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cargo_sequence_no') is not None:
            self.cargo_sequence_no = m.get('cargo_sequence_no')
        if m.get('cargo_name') is not None:
            self.cargo_name = m.get('cargo_name')
        if m.get('cargo_specification') is not None:
            self.cargo_specification = m.get('cargo_specification')
        if m.get('cargo_quantity') is not None:
            self.cargo_quantity = m.get('cargo_quantity')
        if m.get('cargo_unit_price') is not None:
            self.cargo_unit_price = m.get('cargo_unit_price')
        return self


class ApplyInsurglobifyprodOspiinsureRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        trade_no: str = None,
        external_channel_code: str = None,
        external_product_code: str = None,
        ch_scheme_name: str = None,
        ch_project_name: str = None,
        insured_amount: str = None,
        premium: str = None,
        total_premium: str = None,
        currency: str = None,
        big_pol_no: str = None,
        insure_start: str = None,
        timezone: str = None,
        tbr_name: str = None,
        tbr_id_type: str = None,
        tbr_id_no: str = None,
        bbr_name: str = None,
        bbr_id_type: str = None,
        bbr_id_no: str = None,
        rela_order_no: str = None,
        pick_up_time: str = None,
        courier_company: str = None,
        courier_number: str = None,
        cargo_type: str = None,
        cargo_total_quantity: str = None,
        cargo_total_weight: str = None,
        cargo_total_worth: str = None,
        sell_id: str = None,
        sell_naic_code: str = None,
        start_place_iso_country: str = None,
        start_place_province_city: str = None,
        start_place: str = None,
        start_place_postcode: str = None,
        buy_id: str = None,
        iso_country: str = None,
        destination_province_city: str = None,
        destination: str = None,
        cargo_details: List[CargoDetail] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 调用方生成的唯一编码，系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
        self.trade_no = trade_no
        # 保司编码
        self.external_channel_code = external_channel_code
        # 险种编码
        self.external_product_code = external_product_code
        # 保险方案名
        self.ch_scheme_name = ch_scheme_name
        # 保险项目名
        self.ch_project_name = ch_project_name
        # 总保额，小数位只支持2位
        self.insured_amount = insured_amount
        # 保费，小数位只支持2位
        self.premium = premium
        # 总保费，小数位只支持2位
        self.total_premium = total_premium
        # 币种，使用ISO 4217代码；
        # CNY：人民币
        # USD：美元
        # EUR：欧元
        # GBP：英镑
        # JPY：日元
        # CHF：瑞士法郎
        # SGD：新加坡元
        self.currency = currency
        # 关联的大保单编号
        self.big_pol_no = big_pol_no
        # 保险起期(ISO 8601格式，2026-01-11T14:30:00+02:00)
        self.insure_start = insure_start
        # 时区
        # Asia/Shanghai
        # Europe/Berlin
        # America/New_York
        # Pacific/Auckland
        # Europe/Berlin
        self.timezone = timezone
        # 投保人名称
        self.tbr_name = tbr_name
        # 投保人证件类型
        # // 个人
        # // 护照
        # PASSPORT
        # // 国民身份证
        # NATIONAL_ID
        # // 居留许可
        # RESIDENCE_PERMIT
        # // 个人税号
        # TAX_ID
        # // 企业
        # // 公司注册号（最常用）
        # COMPANY_REGISTRATION
        # // 增值税号
        # VAT_NUMBER
        # // 企业税号
        # TAX_ID
        self.tbr_id_type = tbr_id_type
        # 投保人证件号
        self.tbr_id_no = tbr_id_no
        # 被保人名称
        self.bbr_name = bbr_name
        # 被保人证件类型
        # // 个人
        # // 护照
        # PASSPORT
        # // 国民身份证
        # NATIONAL_ID
        # // 居留许可
        # RESIDENCE_PERMIT
        # // 个人税号
        # TAX_ID
        # // 企业
        # // 公司注册号（最常用）
        # COMPANY_REGISTRATION
        # // 增值税号
        # VAT_NUMBER
        # // 企业税号
        # TAX_ID
        self.bbr_id_type = bbr_id_type
        # 被保人证件号
        self.bbr_id_no = bbr_id_no
        # 订单号
        self.rela_order_no = rela_order_no
        # 寄件时间(ISO 8601格式，2026-01-11T14:30:00+02:00)
        self.pick_up_time = pick_up_time
        # 快递公司名称
        self.courier_company = courier_company
        # 快递单号
        self.courier_number = courier_number
        # 货物大类
        self.cargo_type = cargo_type
        # 货物总数量（件）
        self.cargo_total_quantity = cargo_total_quantity
        # 货物总重量
        self.cargo_total_weight = cargo_total_weight
        # 货物总价值，小数位只支持2位
        self.cargo_total_worth = cargo_total_worth
        # 卖家脱敏唯一标识
        self.sell_id = sell_id
        # 卖家NAIC代码
        self.sell_naic_code = sell_naic_code
        # 出发地ISO国别
        self.start_place_iso_country = start_place_iso_country
        # 出发地省市
        self.start_place_province_city = start_place_province_city
        # 出发地详细地址
        self.start_place = start_place
        # 出发地邮编
        self.start_place_postcode = start_place_postcode
        # 买家脱敏唯一标识
        self.buy_id = buy_id
        # 目的地ISO国别
        self.iso_country = iso_country
        # 湖南省长沙市
        self.destination_province_city = destination_province_city
        # 目的地详细地址
        self.destination = destination
        # 货物明细列表
        self.cargo_details = cargo_details

    def validate(self):
        self.validate_required(self.trade_no, 'trade_no')
        if self.trade_no is not None:
            self.validate_max_length(self.trade_no, 'trade_no', 50)
        self.validate_required(self.external_channel_code, 'external_channel_code')
        if self.external_channel_code is not None:
            self.validate_max_length(self.external_channel_code, 'external_channel_code', 10)
        self.validate_required(self.external_product_code, 'external_product_code')
        if self.external_product_code is not None:
            self.validate_max_length(self.external_product_code, 'external_product_code', 10)
        self.validate_required(self.ch_scheme_name, 'ch_scheme_name')
        if self.ch_scheme_name is not None:
            self.validate_max_length(self.ch_scheme_name, 'ch_scheme_name', 20)
        self.validate_required(self.ch_project_name, 'ch_project_name')
        if self.ch_project_name is not None:
            self.validate_max_length(self.ch_project_name, 'ch_project_name', 20)
        self.validate_required(self.insured_amount, 'insured_amount')
        if self.insured_amount is not None:
            self.validate_max_length(self.insured_amount, 'insured_amount', 20)
        self.validate_required(self.premium, 'premium')
        if self.premium is not None:
            self.validate_max_length(self.premium, 'premium', 20)
        self.validate_required(self.total_premium, 'total_premium')
        if self.total_premium is not None:
            self.validate_max_length(self.total_premium, 'total_premium', 20)
        self.validate_required(self.currency, 'currency')
        if self.currency is not None:
            self.validate_max_length(self.currency, 'currency', 3)
        self.validate_required(self.big_pol_no, 'big_pol_no')
        if self.big_pol_no is not None:
            self.validate_max_length(self.big_pol_no, 'big_pol_no', 200)
        self.validate_required(self.insure_start, 'insure_start')
        if self.insure_start is not None:
            self.validate_max_length(self.insure_start, 'insure_start', 50)
        self.validate_required(self.timezone, 'timezone')
        if self.timezone is not None:
            self.validate_max_length(self.timezone, 'timezone', 20)
        self.validate_required(self.tbr_name, 'tbr_name')
        if self.tbr_name is not None:
            self.validate_max_length(self.tbr_name, 'tbr_name', 100)
        self.validate_required(self.tbr_id_type, 'tbr_id_type')
        if self.tbr_id_type is not None:
            self.validate_max_length(self.tbr_id_type, 'tbr_id_type', 20)
        self.validate_required(self.tbr_id_no, 'tbr_id_no')
        if self.tbr_id_no is not None:
            self.validate_max_length(self.tbr_id_no, 'tbr_id_no', 100)
        self.validate_required(self.bbr_name, 'bbr_name')
        if self.bbr_name is not None:
            self.validate_max_length(self.bbr_name, 'bbr_name', 100)
        self.validate_required(self.bbr_id_type, 'bbr_id_type')
        if self.bbr_id_type is not None:
            self.validate_max_length(self.bbr_id_type, 'bbr_id_type', 20)
        self.validate_required(self.bbr_id_no, 'bbr_id_no')
        if self.bbr_id_no is not None:
            self.validate_max_length(self.bbr_id_no, 'bbr_id_no', 100)
        self.validate_required(self.rela_order_no, 'rela_order_no')
        if self.rela_order_no is not None:
            self.validate_max_length(self.rela_order_no, 'rela_order_no', 100)
        self.validate_required(self.pick_up_time, 'pick_up_time')
        if self.pick_up_time is not None:
            self.validate_max_length(self.pick_up_time, 'pick_up_time', 50)
        self.validate_required(self.courier_company, 'courier_company')
        if self.courier_company is not None:
            self.validate_max_length(self.courier_company, 'courier_company', 100)
        self.validate_required(self.courier_number, 'courier_number')
        if self.courier_number is not None:
            self.validate_max_length(self.courier_number, 'courier_number', 100)
        self.validate_required(self.cargo_type, 'cargo_type')
        if self.cargo_type is not None:
            self.validate_max_length(self.cargo_type, 'cargo_type', 256)
        self.validate_required(self.cargo_total_quantity, 'cargo_total_quantity')
        if self.cargo_total_quantity is not None:
            self.validate_max_length(self.cargo_total_quantity, 'cargo_total_quantity', 100)
        self.validate_required(self.cargo_total_weight, 'cargo_total_weight')
        if self.cargo_total_weight is not None:
            self.validate_max_length(self.cargo_total_weight, 'cargo_total_weight', 200)
        self.validate_required(self.cargo_total_worth, 'cargo_total_worth')
        if self.cargo_total_worth is not None:
            self.validate_max_length(self.cargo_total_worth, 'cargo_total_worth', 20)
        self.validate_required(self.sell_id, 'sell_id')
        if self.sell_id is not None:
            self.validate_max_length(self.sell_id, 'sell_id', 100)
        self.validate_required(self.sell_naic_code, 'sell_naic_code')
        if self.sell_naic_code is not None:
            self.validate_max_length(self.sell_naic_code, 'sell_naic_code', 50)
        self.validate_required(self.start_place_iso_country, 'start_place_iso_country')
        if self.start_place_iso_country is not None:
            self.validate_max_length(self.start_place_iso_country, 'start_place_iso_country', 10)
        self.validate_required(self.start_place_province_city, 'start_place_province_city')
        if self.start_place_province_city is not None:
            self.validate_max_length(self.start_place_province_city, 'start_place_province_city', 50)
        self.validate_required(self.start_place, 'start_place')
        if self.start_place is not None:
            self.validate_max_length(self.start_place, 'start_place', 500)
        self.validate_required(self.start_place_postcode, 'start_place_postcode')
        if self.start_place_postcode is not None:
            self.validate_max_length(self.start_place_postcode, 'start_place_postcode', 50)
        self.validate_required(self.buy_id, 'buy_id')
        if self.buy_id is not None:
            self.validate_max_length(self.buy_id, 'buy_id', 100)
        self.validate_required(self.iso_country, 'iso_country')
        if self.iso_country is not None:
            self.validate_max_length(self.iso_country, 'iso_country', 10)
        self.validate_required(self.destination_province_city, 'destination_province_city')
        if self.destination_province_city is not None:
            self.validate_max_length(self.destination_province_city, 'destination_province_city', 50)
        self.validate_required(self.destination, 'destination')
        if self.destination is not None:
            self.validate_max_length(self.destination, 'destination', 500)
        self.validate_required(self.cargo_details, 'cargo_details')
        if self.cargo_details:
            for k in self.cargo_details:
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
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        if self.external_channel_code is not None:
            result['external_channel_code'] = self.external_channel_code
        if self.external_product_code is not None:
            result['external_product_code'] = self.external_product_code
        if self.ch_scheme_name is not None:
            result['ch_scheme_name'] = self.ch_scheme_name
        if self.ch_project_name is not None:
            result['ch_project_name'] = self.ch_project_name
        if self.insured_amount is not None:
            result['insured_amount'] = self.insured_amount
        if self.premium is not None:
            result['premium'] = self.premium
        if self.total_premium is not None:
            result['total_premium'] = self.total_premium
        if self.currency is not None:
            result['currency'] = self.currency
        if self.big_pol_no is not None:
            result['big_pol_no'] = self.big_pol_no
        if self.insure_start is not None:
            result['insure_start'] = self.insure_start
        if self.timezone is not None:
            result['timezone'] = self.timezone
        if self.tbr_name is not None:
            result['tbr_name'] = self.tbr_name
        if self.tbr_id_type is not None:
            result['tbr_id_type'] = self.tbr_id_type
        if self.tbr_id_no is not None:
            result['tbr_id_no'] = self.tbr_id_no
        if self.bbr_name is not None:
            result['bbr_name'] = self.bbr_name
        if self.bbr_id_type is not None:
            result['bbr_id_type'] = self.bbr_id_type
        if self.bbr_id_no is not None:
            result['bbr_id_no'] = self.bbr_id_no
        if self.rela_order_no is not None:
            result['rela_order_no'] = self.rela_order_no
        if self.pick_up_time is not None:
            result['pick_up_time'] = self.pick_up_time
        if self.courier_company is not None:
            result['courier_company'] = self.courier_company
        if self.courier_number is not None:
            result['courier_number'] = self.courier_number
        if self.cargo_type is not None:
            result['cargo_type'] = self.cargo_type
        if self.cargo_total_quantity is not None:
            result['cargo_total_quantity'] = self.cargo_total_quantity
        if self.cargo_total_weight is not None:
            result['cargo_total_weight'] = self.cargo_total_weight
        if self.cargo_total_worth is not None:
            result['cargo_total_worth'] = self.cargo_total_worth
        if self.sell_id is not None:
            result['sell_id'] = self.sell_id
        if self.sell_naic_code is not None:
            result['sell_naic_code'] = self.sell_naic_code
        if self.start_place_iso_country is not None:
            result['start_place_iso_country'] = self.start_place_iso_country
        if self.start_place_province_city is not None:
            result['start_place_province_city'] = self.start_place_province_city
        if self.start_place is not None:
            result['start_place'] = self.start_place
        if self.start_place_postcode is not None:
            result['start_place_postcode'] = self.start_place_postcode
        if self.buy_id is not None:
            result['buy_id'] = self.buy_id
        if self.iso_country is not None:
            result['iso_country'] = self.iso_country
        if self.destination_province_city is not None:
            result['destination_province_city'] = self.destination_province_city
        if self.destination is not None:
            result['destination'] = self.destination
        result['cargo_details'] = []
        if self.cargo_details is not None:
            for k in self.cargo_details:
                result['cargo_details'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        if m.get('external_channel_code') is not None:
            self.external_channel_code = m.get('external_channel_code')
        if m.get('external_product_code') is not None:
            self.external_product_code = m.get('external_product_code')
        if m.get('ch_scheme_name') is not None:
            self.ch_scheme_name = m.get('ch_scheme_name')
        if m.get('ch_project_name') is not None:
            self.ch_project_name = m.get('ch_project_name')
        if m.get('insured_amount') is not None:
            self.insured_amount = m.get('insured_amount')
        if m.get('premium') is not None:
            self.premium = m.get('premium')
        if m.get('total_premium') is not None:
            self.total_premium = m.get('total_premium')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('big_pol_no') is not None:
            self.big_pol_no = m.get('big_pol_no')
        if m.get('insure_start') is not None:
            self.insure_start = m.get('insure_start')
        if m.get('timezone') is not None:
            self.timezone = m.get('timezone')
        if m.get('tbr_name') is not None:
            self.tbr_name = m.get('tbr_name')
        if m.get('tbr_id_type') is not None:
            self.tbr_id_type = m.get('tbr_id_type')
        if m.get('tbr_id_no') is not None:
            self.tbr_id_no = m.get('tbr_id_no')
        if m.get('bbr_name') is not None:
            self.bbr_name = m.get('bbr_name')
        if m.get('bbr_id_type') is not None:
            self.bbr_id_type = m.get('bbr_id_type')
        if m.get('bbr_id_no') is not None:
            self.bbr_id_no = m.get('bbr_id_no')
        if m.get('rela_order_no') is not None:
            self.rela_order_no = m.get('rela_order_no')
        if m.get('pick_up_time') is not None:
            self.pick_up_time = m.get('pick_up_time')
        if m.get('courier_company') is not None:
            self.courier_company = m.get('courier_company')
        if m.get('courier_number') is not None:
            self.courier_number = m.get('courier_number')
        if m.get('cargo_type') is not None:
            self.cargo_type = m.get('cargo_type')
        if m.get('cargo_total_quantity') is not None:
            self.cargo_total_quantity = m.get('cargo_total_quantity')
        if m.get('cargo_total_weight') is not None:
            self.cargo_total_weight = m.get('cargo_total_weight')
        if m.get('cargo_total_worth') is not None:
            self.cargo_total_worth = m.get('cargo_total_worth')
        if m.get('sell_id') is not None:
            self.sell_id = m.get('sell_id')
        if m.get('sell_naic_code') is not None:
            self.sell_naic_code = m.get('sell_naic_code')
        if m.get('start_place_iso_country') is not None:
            self.start_place_iso_country = m.get('start_place_iso_country')
        if m.get('start_place_province_city') is not None:
            self.start_place_province_city = m.get('start_place_province_city')
        if m.get('start_place') is not None:
            self.start_place = m.get('start_place')
        if m.get('start_place_postcode') is not None:
            self.start_place_postcode = m.get('start_place_postcode')
        if m.get('buy_id') is not None:
            self.buy_id = m.get('buy_id')
        if m.get('iso_country') is not None:
            self.iso_country = m.get('iso_country')
        if m.get('destination_province_city') is not None:
            self.destination_province_city = m.get('destination_province_city')
        if m.get('destination') is not None:
            self.destination = m.get('destination')
        self.cargo_details = []
        if m.get('cargo_details') is not None:
            for k in m.get('cargo_details'):
                temp_model = CargoDetail()
                self.cargo_details.append(temp_model.from_map(k))
        return self


class ApplyInsurglobifyprodOspiinsureResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trade_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易流水号
        self.trade_no = trade_no

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
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        return self


class ApplyInsurglobifyprodOspiclaimRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        trade_no: str = None,
        external_channel_code: str = None,
        external_product_code: str = None,
        big_pol_no: str = None,
        rela_order_no: str = None,
        damaged_cargo_name: str = None,
        incident_cause: str = None,
        accident_time: str = None,
        sale_date: str = None,
        timezone: str = None,
        claim_status: str = None,
        cargo_type: str = None,
        claim_paid_time: str = None,
        claim_category: str = None,
        claim_paid_desc: str = None,
        claim_paid_amount: str = None,
        currency: str = None,
        claim_incident_type: str = None,
        claim_verdict_desc: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 调用方生成的唯一编码，系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
        self.trade_no = trade_no
        # 保司编码
        self.external_channel_code = external_channel_code
        # 险种编码
        self.external_product_code = external_product_code
        # 大保单号
        self.big_pol_no = big_pol_no
        # 投保订单号
        self.rela_order_no = rela_order_no
        # 受损货物名称
        self.damaged_cargo_name = damaged_cargo_name
        # 出险原因
        self.incident_cause = incident_cause
        # 出险日期(ISO 8601格式，2026-01-11T14:30:00+02:00)
        self.accident_time = accident_time
        # 销售日期(ISO 8601格式，2026-01-11T14:30:00+02:00)
        self.sale_date = sale_date
        # 时区
        # Asia/Shanghai
        # Europe/Berlin
        # America/New_York
        # Pacific/Auckland
        # Europe/Berlin
        self.timezone = timezone
        # 索赔状态（Open / Under Review / In Payment Process / Closed / Rejected / Cancelled）
        self.claim_status = claim_status
        # 货物大类
        self.cargo_type = cargo_type
        # 平台赔付日期(ISO 8601格式，2026-01-11T14:30:00+02:00)
        self.claim_paid_time = claim_paid_time
        # 索赔类别(Valid / Fraudulent / Invalid
        self.claim_category = claim_category
        # 索赔被拒原因
        self.claim_paid_desc = claim_paid_desc
        # 索赔总金额，小数位只支持2位
        self.claim_paid_amount = claim_paid_amount
        # 币种，使用ISO 4217代码；
        # CNY：人民币
        # USD：美元
        # EUR：欧元
        # GBP：英镑
        # JPY：日元
        # CHF：瑞士法郎
        # SGD：新加坡元
        self.currency = currency
        # 索赔事件类型(Loss / Theft / Breakage / Non-Delivery）
        self.claim_incident_type = claim_incident_type
        # 索赔事件详情情况
        self.claim_verdict_desc = claim_verdict_desc

    def validate(self):
        self.validate_required(self.trade_no, 'trade_no')
        if self.trade_no is not None:
            self.validate_max_length(self.trade_no, 'trade_no', 50)
        self.validate_required(self.external_channel_code, 'external_channel_code')
        if self.external_channel_code is not None:
            self.validate_max_length(self.external_channel_code, 'external_channel_code', 10)
        self.validate_required(self.external_product_code, 'external_product_code')
        if self.external_product_code is not None:
            self.validate_max_length(self.external_product_code, 'external_product_code', 10)
        self.validate_required(self.big_pol_no, 'big_pol_no')
        if self.big_pol_no is not None:
            self.validate_max_length(self.big_pol_no, 'big_pol_no', 100)
        self.validate_required(self.rela_order_no, 'rela_order_no')
        if self.rela_order_no is not None:
            self.validate_max_length(self.rela_order_no, 'rela_order_no', 200)
        self.validate_required(self.damaged_cargo_name, 'damaged_cargo_name')
        if self.damaged_cargo_name is not None:
            self.validate_max_length(self.damaged_cargo_name, 'damaged_cargo_name', 100)
        self.validate_required(self.incident_cause, 'incident_cause')
        if self.incident_cause is not None:
            self.validate_max_length(self.incident_cause, 'incident_cause', 50)
        self.validate_required(self.accident_time, 'accident_time')
        if self.accident_time is not None:
            self.validate_max_length(self.accident_time, 'accident_time', 50)
        self.validate_required(self.sale_date, 'sale_date')
        if self.sale_date is not None:
            self.validate_max_length(self.sale_date, 'sale_date', 50)
        self.validate_required(self.timezone, 'timezone')
        if self.timezone is not None:
            self.validate_max_length(self.timezone, 'timezone', 20)
        self.validate_required(self.claim_status, 'claim_status')
        if self.claim_status is not None:
            self.validate_max_length(self.claim_status, 'claim_status', 20)
        self.validate_required(self.cargo_type, 'cargo_type')
        if self.cargo_type is not None:
            self.validate_max_length(self.cargo_type, 'cargo_type', 256)
        self.validate_required(self.claim_paid_time, 'claim_paid_time')
        if self.claim_paid_time is not None:
            self.validate_max_length(self.claim_paid_time, 'claim_paid_time', 50)
        self.validate_required(self.claim_category, 'claim_category')
        if self.claim_category is not None:
            self.validate_max_length(self.claim_category, 'claim_category', 20)
        self.validate_required(self.claim_paid_desc, 'claim_paid_desc')
        if self.claim_paid_desc is not None:
            self.validate_max_length(self.claim_paid_desc, 'claim_paid_desc', 256)
        self.validate_required(self.claim_paid_amount, 'claim_paid_amount')
        if self.claim_paid_amount is not None:
            self.validate_max_length(self.claim_paid_amount, 'claim_paid_amount', 20)
        self.validate_required(self.currency, 'currency')
        self.validate_required(self.claim_incident_type, 'claim_incident_type')
        if self.claim_incident_type is not None:
            self.validate_max_length(self.claim_incident_type, 'claim_incident_type', 20)
        self.validate_required(self.claim_verdict_desc, 'claim_verdict_desc')
        if self.claim_verdict_desc is not None:
            self.validate_max_length(self.claim_verdict_desc, 'claim_verdict_desc', 526)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        if self.external_channel_code is not None:
            result['external_channel_code'] = self.external_channel_code
        if self.external_product_code is not None:
            result['external_product_code'] = self.external_product_code
        if self.big_pol_no is not None:
            result['big_pol_no'] = self.big_pol_no
        if self.rela_order_no is not None:
            result['rela_order_no'] = self.rela_order_no
        if self.damaged_cargo_name is not None:
            result['damaged_cargo_name'] = self.damaged_cargo_name
        if self.incident_cause is not None:
            result['incident_cause'] = self.incident_cause
        if self.accident_time is not None:
            result['accident_time'] = self.accident_time
        if self.sale_date is not None:
            result['sale_date'] = self.sale_date
        if self.timezone is not None:
            result['timezone'] = self.timezone
        if self.claim_status is not None:
            result['claim_status'] = self.claim_status
        if self.cargo_type is not None:
            result['cargo_type'] = self.cargo_type
        if self.claim_paid_time is not None:
            result['claim_paid_time'] = self.claim_paid_time
        if self.claim_category is not None:
            result['claim_category'] = self.claim_category
        if self.claim_paid_desc is not None:
            result['claim_paid_desc'] = self.claim_paid_desc
        if self.claim_paid_amount is not None:
            result['claim_paid_amount'] = self.claim_paid_amount
        if self.currency is not None:
            result['currency'] = self.currency
        if self.claim_incident_type is not None:
            result['claim_incident_type'] = self.claim_incident_type
        if self.claim_verdict_desc is not None:
            result['claim_verdict_desc'] = self.claim_verdict_desc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        if m.get('external_channel_code') is not None:
            self.external_channel_code = m.get('external_channel_code')
        if m.get('external_product_code') is not None:
            self.external_product_code = m.get('external_product_code')
        if m.get('big_pol_no') is not None:
            self.big_pol_no = m.get('big_pol_no')
        if m.get('rela_order_no') is not None:
            self.rela_order_no = m.get('rela_order_no')
        if m.get('damaged_cargo_name') is not None:
            self.damaged_cargo_name = m.get('damaged_cargo_name')
        if m.get('incident_cause') is not None:
            self.incident_cause = m.get('incident_cause')
        if m.get('accident_time') is not None:
            self.accident_time = m.get('accident_time')
        if m.get('sale_date') is not None:
            self.sale_date = m.get('sale_date')
        if m.get('timezone') is not None:
            self.timezone = m.get('timezone')
        if m.get('claim_status') is not None:
            self.claim_status = m.get('claim_status')
        if m.get('cargo_type') is not None:
            self.cargo_type = m.get('cargo_type')
        if m.get('claim_paid_time') is not None:
            self.claim_paid_time = m.get('claim_paid_time')
        if m.get('claim_category') is not None:
            self.claim_category = m.get('claim_category')
        if m.get('claim_paid_desc') is not None:
            self.claim_paid_desc = m.get('claim_paid_desc')
        if m.get('claim_paid_amount') is not None:
            self.claim_paid_amount = m.get('claim_paid_amount')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        if m.get('claim_incident_type') is not None:
            self.claim_incident_type = m.get('claim_incident_type')
        if m.get('claim_verdict_desc') is not None:
            self.claim_verdict_desc = m.get('claim_verdict_desc')
        return self


class ApplyInsurglobifyprodOspiclaimResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trade_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易流水号
        self.trade_no = trade_no

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
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        return self


class UploadInsurglobifyprodMonthlypremiumbillRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        trade_no: str = None,
        external_channel_code: str = None,
        external_product_code: str = None,
        ch_scheme_name: str = None,
        big_pol_no: str = None,
        billing_year: str = None,
        billing_month: str = None,
        package_count: str = None,
        premium: str = None,
        taxa_amount: str = None,
        total_premium: str = None,
        currency: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 调用方生成的唯一编码，系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
        self.trade_no = trade_no
        # 保司编码
        self.external_channel_code = external_channel_code
        # 险种编码
        self.external_product_code = external_product_code
        # 保险方案名
        self.ch_scheme_name = ch_scheme_name
        # 关联的大保单号
        self.big_pol_no = big_pol_no
        # 账单年度
        self.billing_year = billing_year
        # 账单月份
        self.billing_month = billing_month
        # 包裹总数
        self.package_count = package_count
        # 净保费，小数位只支持2位
        self.premium = premium
        # 税费，小数位只支持2位
        self.taxa_amount = taxa_amount
        # 总保费（含税费），小数位只支持2位
        self.total_premium = total_premium
        # 币种，使用ISO 4217代码；
        # CNY：人民币
        # USD：美元
        # EUR：欧元
        # GBP：英镑
        # JPY：日元
        # CHF：瑞士法郎
        # SGD：新加坡元
        self.currency = currency

    def validate(self):
        self.validate_required(self.trade_no, 'trade_no')
        if self.trade_no is not None:
            self.validate_max_length(self.trade_no, 'trade_no', 50)
        self.validate_required(self.external_channel_code, 'external_channel_code')
        if self.external_channel_code is not None:
            self.validate_max_length(self.external_channel_code, 'external_channel_code', 10)
        self.validate_required(self.external_product_code, 'external_product_code')
        if self.external_product_code is not None:
            self.validate_max_length(self.external_product_code, 'external_product_code', 10)
        self.validate_required(self.ch_scheme_name, 'ch_scheme_name')
        if self.ch_scheme_name is not None:
            self.validate_max_length(self.ch_scheme_name, 'ch_scheme_name', 20)
        self.validate_required(self.big_pol_no, 'big_pol_no')
        if self.big_pol_no is not None:
            self.validate_max_length(self.big_pol_no, 'big_pol_no', 200)
        self.validate_required(self.billing_year, 'billing_year')
        if self.billing_year is not None:
            self.validate_max_length(self.billing_year, 'billing_year', 4)
        self.validate_required(self.billing_month, 'billing_month')
        if self.billing_month is not None:
            self.validate_max_length(self.billing_month, 'billing_month', 2)
        self.validate_required(self.package_count, 'package_count')
        if self.package_count is not None:
            self.validate_max_length(self.package_count, 'package_count', 256)
        self.validate_required(self.premium, 'premium')
        if self.premium is not None:
            self.validate_max_length(self.premium, 'premium', 20)
        self.validate_required(self.taxa_amount, 'taxa_amount')
        if self.taxa_amount is not None:
            self.validate_max_length(self.taxa_amount, 'taxa_amount', 20)
        self.validate_required(self.total_premium, 'total_premium')
        if self.total_premium is not None:
            self.validate_max_length(self.total_premium, 'total_premium', 20)
        self.validate_required(self.currency, 'currency')
        if self.currency is not None:
            self.validate_max_length(self.currency, 'currency', 3)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        if self.external_channel_code is not None:
            result['external_channel_code'] = self.external_channel_code
        if self.external_product_code is not None:
            result['external_product_code'] = self.external_product_code
        if self.ch_scheme_name is not None:
            result['ch_scheme_name'] = self.ch_scheme_name
        if self.big_pol_no is not None:
            result['big_pol_no'] = self.big_pol_no
        if self.billing_year is not None:
            result['billing_year'] = self.billing_year
        if self.billing_month is not None:
            result['billing_month'] = self.billing_month
        if self.package_count is not None:
            result['package_count'] = self.package_count
        if self.premium is not None:
            result['premium'] = self.premium
        if self.taxa_amount is not None:
            result['taxa_amount'] = self.taxa_amount
        if self.total_premium is not None:
            result['total_premium'] = self.total_premium
        if self.currency is not None:
            result['currency'] = self.currency
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        if m.get('external_channel_code') is not None:
            self.external_channel_code = m.get('external_channel_code')
        if m.get('external_product_code') is not None:
            self.external_product_code = m.get('external_product_code')
        if m.get('ch_scheme_name') is not None:
            self.ch_scheme_name = m.get('ch_scheme_name')
        if m.get('big_pol_no') is not None:
            self.big_pol_no = m.get('big_pol_no')
        if m.get('billing_year') is not None:
            self.billing_year = m.get('billing_year')
        if m.get('billing_month') is not None:
            self.billing_month = m.get('billing_month')
        if m.get('package_count') is not None:
            self.package_count = m.get('package_count')
        if m.get('premium') is not None:
            self.premium = m.get('premium')
        if m.get('taxa_amount') is not None:
            self.taxa_amount = m.get('taxa_amount')
        if m.get('total_premium') is not None:
            self.total_premium = m.get('total_premium')
        if m.get('currency') is not None:
            self.currency = m.get('currency')
        return self


class UploadInsurglobifyprodMonthlypremiumbillResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trade_no: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 交易流水号
        self.trade_no = trade_no

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
        if self.trade_no is not None:
            result['trade_no'] = self.trade_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('trade_no') is not None:
            self.trade_no = m.get('trade_no')
        return self


