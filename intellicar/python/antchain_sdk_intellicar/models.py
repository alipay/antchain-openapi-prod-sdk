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


class CarUserInfo(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        phone_num: str = None,
        city_code: str = None,
        user_cert_name: str = None,
        user_cert_no: str = None,
        user_gender: str = None,
        nick: str = None,
    ):
        # 唯一标识用户的id
        self.user_id = user_id
        # 手机号
        self.phone_num = phone_num
        # 城市编码
        self.city_code = city_code
        # 姓名
        self.user_cert_name = user_cert_name
        # 证件号码
        self.user_cert_no = user_cert_no
        # 性别
        self.user_gender = user_gender
        # 昵称
        self.nick = nick

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.phone_num, 'phone_num')
        self.validate_required(self.city_code, 'city_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        if self.city_code is not None:
            result['city_code'] = self.city_code
        if self.user_cert_name is not None:
            result['user_cert_name'] = self.user_cert_name
        if self.user_cert_no is not None:
            result['user_cert_no'] = self.user_cert_no
        if self.user_gender is not None:
            result['user_gender'] = self.user_gender
        if self.nick is not None:
            result['nick'] = self.nick
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        if m.get('city_code') is not None:
            self.city_code = m.get('city_code')
        if m.get('user_cert_name') is not None:
            self.user_cert_name = m.get('user_cert_name')
        if m.get('user_cert_no') is not None:
            self.user_cert_no = m.get('user_cert_no')
        if m.get('user_gender') is not None:
            self.user_gender = m.get('user_gender')
        if m.get('nick') is not None:
            self.nick = m.get('nick')
        return self


class NewCarInfo(TeaModel):
    def __init__(
        self,
        car_series: str = None,
        finaical_plan: str = None,
        car_series_id: str = None,
        submit_id: str = None,
        purcharse_time: str = None,
        user_info: CarUserInfo = None,
        match_source: str = None,
        qc_car_series_id: str = None,
    ):
        # 车系
        self.car_series = car_series
        # 金融方案
        self.finaical_plan = finaical_plan
        # 车系id
        self.car_series_id = car_series_id
        # 请求提交唯一id
        self.submit_id = submit_id
        # 预计购买时间
        self.purcharse_time = purcharse_time
        # 用户信息
        self.user_info = user_info
        # 懂车帝或者汽车之家
        self.match_source = match_source
        # 汽车之家车型id
        self.qc_car_series_id = qc_car_series_id

    def validate(self):
        self.validate_required(self.car_series, 'car_series')
        self.validate_required(self.user_info, 'user_info')
        if self.user_info:
            self.user_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.car_series is not None:
            result['car_series'] = self.car_series
        if self.finaical_plan is not None:
            result['finaical_plan'] = self.finaical_plan
        if self.car_series_id is not None:
            result['car_series_id'] = self.car_series_id
        if self.submit_id is not None:
            result['submit_id'] = self.submit_id
        if self.purcharse_time is not None:
            result['purcharse_time'] = self.purcharse_time
        if self.user_info is not None:
            result['user_info'] = self.user_info.to_map()
        if self.match_source is not None:
            result['match_source'] = self.match_source
        if self.qc_car_series_id is not None:
            result['qc_car_series_id'] = self.qc_car_series_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('car_series') is not None:
            self.car_series = m.get('car_series')
        if m.get('finaical_plan') is not None:
            self.finaical_plan = m.get('finaical_plan')
        if m.get('car_series_id') is not None:
            self.car_series_id = m.get('car_series_id')
        if m.get('submit_id') is not None:
            self.submit_id = m.get('submit_id')
        if m.get('purcharse_time') is not None:
            self.purcharse_time = m.get('purcharse_time')
        if m.get('user_info') is not None:
            temp_model = CarUserInfo()
            self.user_info = temp_model.from_map(m['user_info'])
        if m.get('match_source') is not None:
            self.match_source = m.get('match_source')
        if m.get('qc_car_series_id') is not None:
            self.qc_car_series_id = m.get('qc_car_series_id')
        return self


class BasicCarInfo(TeaModel):
    def __init__(
        self,
        license_no: str = None,
        vin: str = None,
        engine_no: str = None,
        register_date: str = None,
        model_code: str = None,
        use_nature_code: str = None,
        mortgage: bool = None,
    ):
        # 车牌号
        self.license_no = license_no
        # 车架号
        self.vin = vin
        # 发动机号
        self.engine_no = engine_no
        # 初登日期
        self.register_date = register_date
        # 车辆型号
        self.model_code = model_code
        # 营运性质
        self.use_nature_code = use_nature_code
        # 是否抵押
        self.mortgage = mortgage

    def validate(self):
        self.validate_required(self.license_no, 'license_no')
        self.validate_required(self.vin, 'vin')
        self.validate_required(self.engine_no, 'engine_no')
        self.validate_required(self.register_date, 'register_date')
        self.validate_required(self.model_code, 'model_code')
        self.validate_required(self.use_nature_code, 'use_nature_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.license_no is not None:
            result['license_no'] = self.license_no
        if self.vin is not None:
            result['vin'] = self.vin
        if self.engine_no is not None:
            result['engine_no'] = self.engine_no
        if self.register_date is not None:
            result['register_date'] = self.register_date
        if self.model_code is not None:
            result['model_code'] = self.model_code
        if self.use_nature_code is not None:
            result['use_nature_code'] = self.use_nature_code
        if self.mortgage is not None:
            result['mortgage'] = self.mortgage
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('license_no') is not None:
            self.license_no = m.get('license_no')
        if m.get('vin') is not None:
            self.vin = m.get('vin')
        if m.get('engine_no') is not None:
            self.engine_no = m.get('engine_no')
        if m.get('register_date') is not None:
            self.register_date = m.get('register_date')
        if m.get('model_code') is not None:
            self.model_code = m.get('model_code')
        if m.get('use_nature_code') is not None:
            self.use_nature_code = m.get('use_nature_code')
        if m.get('mortgage') is not None:
            self.mortgage = m.get('mortgage')
        return self


class CyUserInfo(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        user_name: str = None,
        id_card: str = None,
        phone_num: str = None,
    ):
        # 用户id
        self.user_id = user_id
        # 用户名
        self.user_name = user_name
        # 证件号
        self.id_card = id_card
        # 手机号
        self.phone_num = phone_num

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.phone_num, 'phone_num')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.user_name is not None:
            result['user_name'] = self.user_name
        if self.id_card is not None:
            result['id_card'] = self.id_card
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('user_name') is not None:
            self.user_name = m.get('user_name')
        if m.get('id_card') is not None:
            self.id_card = m.get('id_card')
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        return self


class CarOwnerUserInfo(TeaModel):
    def __init__(
        self,
        user_id: str = None,
        phone_num: str = None,
    ):
        # 用户id
        self.user_id = user_id
        # 手机号
        self.phone_num = phone_num

    def validate(self):
        self.validate_required(self.user_id, 'user_id')
        self.validate_required(self.phone_num, 'phone_num')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.user_id is not None:
            result['user_id'] = self.user_id
        if self.phone_num is not None:
            result['phone_num'] = self.phone_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('user_id') is not None:
            self.user_id = m.get('user_id')
        if m.get('phone_num') is not None:
            self.phone_num = m.get('phone_num')
        return self


class CarBusinessPrice(TeaModel):
    def __init__(
        self,
        brand_id: str = None,
        brand_name: str = None,
        car_series_id: str = None,
        car_series: str = None,
        car_id: str = None,
        car_name: str = None,
        car_year: str = None,
        city_code: str = None,
        city_name: str = None,
        series_guide_price: str = None,
        official_price: int = None,
        full_price: int = None,
        naked_price: int = None,
        purchase_tax: int = None,
        vehicle_vessel_tax: int = None,
        business_insurance: int = None,
        extra_content: str = None,
    ):
        # 品牌id
        self.brand_id = brand_id
        # 品牌名称
        self.brand_name = brand_name
        # 车系id
        self.car_series_id = car_series_id
        # 车系名称
        self.car_series = car_series
        # 车型id
        self.car_id = car_id
        # 车型名称
        self.car_name = car_name
        # 年款
        self.car_year = car_year
        # 城市code
        self.city_code = city_code
        # 城市名称
        self.city_name = city_name
        # 车系指导价（范围值） 单位到分
        self.series_guide_price = series_guide_price
        # 车型指导价（具体值）单位到分
        self.official_price = official_price
        # 车主成交价（具体值）单位到分
        self.full_price = full_price
        # 车主裸车价（具体值）单位到分
        self.naked_price = naked_price
        # 购置税（具体值）单位到分
        self.purchase_tax = purchase_tax
        # 车船税（具体值）单位到分
        self.vehicle_vessel_tax = vehicle_vessel_tax
        # 商业险（具体值）单位到分
        self.business_insurance = business_insurance
        # json 扩展字段
        self.extra_content = extra_content

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.brand_id is not None:
            result['brand_id'] = self.brand_id
        if self.brand_name is not None:
            result['brand_name'] = self.brand_name
        if self.car_series_id is not None:
            result['car_series_id'] = self.car_series_id
        if self.car_series is not None:
            result['car_series'] = self.car_series
        if self.car_id is not None:
            result['car_id'] = self.car_id
        if self.car_name is not None:
            result['car_name'] = self.car_name
        if self.car_year is not None:
            result['car_year'] = self.car_year
        if self.city_code is not None:
            result['city_code'] = self.city_code
        if self.city_name is not None:
            result['city_name'] = self.city_name
        if self.series_guide_price is not None:
            result['series_guide_price'] = self.series_guide_price
        if self.official_price is not None:
            result['official_price'] = self.official_price
        if self.full_price is not None:
            result['full_price'] = self.full_price
        if self.naked_price is not None:
            result['naked_price'] = self.naked_price
        if self.purchase_tax is not None:
            result['purchase_tax'] = self.purchase_tax
        if self.vehicle_vessel_tax is not None:
            result['vehicle_vessel_tax'] = self.vehicle_vessel_tax
        if self.business_insurance is not None:
            result['business_insurance'] = self.business_insurance
        if self.extra_content is not None:
            result['extra_content'] = self.extra_content
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('brand_id') is not None:
            self.brand_id = m.get('brand_id')
        if m.get('brand_name') is not None:
            self.brand_name = m.get('brand_name')
        if m.get('car_series_id') is not None:
            self.car_series_id = m.get('car_series_id')
        if m.get('car_series') is not None:
            self.car_series = m.get('car_series')
        if m.get('car_id') is not None:
            self.car_id = m.get('car_id')
        if m.get('car_name') is not None:
            self.car_name = m.get('car_name')
        if m.get('car_year') is not None:
            self.car_year = m.get('car_year')
        if m.get('city_code') is not None:
            self.city_code = m.get('city_code')
        if m.get('city_name') is not None:
            self.city_name = m.get('city_name')
        if m.get('series_guide_price') is not None:
            self.series_guide_price = m.get('series_guide_price')
        if m.get('official_price') is not None:
            self.official_price = m.get('official_price')
        if m.get('full_price') is not None:
            self.full_price = m.get('full_price')
        if m.get('naked_price') is not None:
            self.naked_price = m.get('naked_price')
        if m.get('purchase_tax') is not None:
            self.purchase_tax = m.get('purchase_tax')
        if m.get('vehicle_vessel_tax') is not None:
            self.vehicle_vessel_tax = m.get('vehicle_vessel_tax')
        if m.get('business_insurance') is not None:
            self.business_insurance = m.get('business_insurance')
        if m.get('extra_content') is not None:
            self.extra_content = m.get('extra_content')
        return self


class UsedCarValuation(TeaModel):
    def __init__(
        self,
        referenceprice: str = None,
        newcarprice: str = None,
        url: str = None,
        conditiona: str = None,
        conditionb: str = None,
        conditionc: str = None,
    ):
        # 评估金额(万)
        self.referenceprice = referenceprice
        # 官方报价(参考)(万)
        self.newcarprice = newcarprice
        # 车型图片(参考)
        self.url = url
        # 车况好(万)(三个价格用"-"分隔,第一个是较小值第二个是...
        self.conditiona = conditiona
        # 车况正常(万)
        self.conditionb = conditionb
        # 车况差(万)
        self.conditionc = conditionc

    def validate(self):
        self.validate_required(self.referenceprice, 'referenceprice')
        self.validate_required(self.newcarprice, 'newcarprice')
        self.validate_required(self.url, 'url')
        self.validate_required(self.conditiona, 'conditiona')
        self.validate_required(self.conditionb, 'conditionb')
        self.validate_required(self.conditionc, 'conditionc')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.referenceprice is not None:
            result['referenceprice'] = self.referenceprice
        if self.newcarprice is not None:
            result['newcarprice'] = self.newcarprice
        if self.url is not None:
            result['url'] = self.url
        if self.conditiona is not None:
            result['conditiona'] = self.conditiona
        if self.conditionb is not None:
            result['conditionb'] = self.conditionb
        if self.conditionc is not None:
            result['conditionc'] = self.conditionc
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('referenceprice') is not None:
            self.referenceprice = m.get('referenceprice')
        if m.get('newcarprice') is not None:
            self.newcarprice = m.get('newcarprice')
        if m.get('url') is not None:
            self.url = m.get('url')
        if m.get('conditiona') is not None:
            self.conditiona = m.get('conditiona')
        if m.get('conditionb') is not None:
            self.conditionb = m.get('conditionb')
        if m.get('conditionc') is not None:
            self.conditionc = m.get('conditionc')
        return self


class UsedCarInfo(TeaModel):
    def __init__(
        self,
        lead_id: str = None,
        city_name: str = None,
        pid: str = None,
        cid: str = None,
        brand_name: str = None,
        series_name: str = None,
        spec_id: str = None,
        spec_name: str = None,
        first_reg_time: str = None,
        mileage: str = None,
    ):
        # 渠道方线索业务id
        self.lead_id = lead_id
        # 城市名称
        self.city_name = city_name
        # 省份id
        self.pid = pid
        # 城市id
        self.cid = cid
        # 品牌名称
        self.brand_name = brand_name
        # 车系名称
        self.series_name = series_name
        # 汽车之家车型id
        self.spec_id = spec_id
        # 车型名称
        self.spec_name = spec_name
        # 首次上牌时间格式 yyyy/MM/dd
        self.first_reg_time = first_reg_time
        # 行驶公里数(km)
        self.mileage = mileage

    def validate(self):
        self.validate_required(self.lead_id, 'lead_id')
        self.validate_required(self.city_name, 'city_name')
        self.validate_required(self.pid, 'pid')
        self.validate_required(self.cid, 'cid')
        self.validate_required(self.spec_id, 'spec_id')
        self.validate_required(self.first_reg_time, 'first_reg_time')
        self.validate_required(self.mileage, 'mileage')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.lead_id is not None:
            result['lead_id'] = self.lead_id
        if self.city_name is not None:
            result['city_name'] = self.city_name
        if self.pid is not None:
            result['pid'] = self.pid
        if self.cid is not None:
            result['cid'] = self.cid
        if self.brand_name is not None:
            result['brand_name'] = self.brand_name
        if self.series_name is not None:
            result['series_name'] = self.series_name
        if self.spec_id is not None:
            result['spec_id'] = self.spec_id
        if self.spec_name is not None:
            result['spec_name'] = self.spec_name
        if self.first_reg_time is not None:
            result['first_reg_time'] = self.first_reg_time
        if self.mileage is not None:
            result['mileage'] = self.mileage
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('lead_id') is not None:
            self.lead_id = m.get('lead_id')
        if m.get('city_name') is not None:
            self.city_name = m.get('city_name')
        if m.get('pid') is not None:
            self.pid = m.get('pid')
        if m.get('cid') is not None:
            self.cid = m.get('cid')
        if m.get('brand_name') is not None:
            self.brand_name = m.get('brand_name')
        if m.get('series_name') is not None:
            self.series_name = m.get('series_name')
        if m.get('spec_id') is not None:
            self.spec_id = m.get('spec_id')
        if m.get('spec_name') is not None:
            self.spec_name = m.get('spec_name')
        if m.get('first_reg_time') is not None:
            self.first_reg_time = m.get('first_reg_time')
        if m.get('mileage') is not None:
            self.mileage = m.get('mileage')
        return self


class BatchSubmitCarResult(TeaModel):
    def __init__(
        self,
        submit_id: str = None,
        is_success: bool = None,
        push_result_code: str = None,
    ):
        # 提交线索唯一请求id
        self.submit_id = submit_id
        # 是否成功
        self.is_success = is_success
        # OK NO_DEMAND 无线索需求，需要重试 INVALID 无效，不要重试
        self.push_result_code = push_result_code

    def validate(self):
        self.validate_required(self.submit_id, 'submit_id')
        self.validate_required(self.is_success, 'is_success')
        self.validate_required(self.push_result_code, 'push_result_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.submit_id is not None:
            result['submit_id'] = self.submit_id
        if self.is_success is not None:
            result['is_success'] = self.is_success
        if self.push_result_code is not None:
            result['push_result_code'] = self.push_result_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('submit_id') is not None:
            self.submit_id = m.get('submit_id')
        if m.get('is_success') is not None:
            self.is_success = m.get('is_success')
        if m.get('push_result_code') is not None:
            self.push_result_code = m.get('push_result_code')
        return self


class CarInfo(TeaModel):
    def __init__(
        self,
        license_no: str = None,
        vin: str = None,
        engine_no: str = None,
        register_date: str = None,
        model_code: str = None,
    ):
        # 车牌号
        self.license_no = license_no
        # 车架号
        self.vin = vin
        # 发动机号
        self.engine_no = engine_no
        # 注册日期
        self.register_date = register_date
        # 车型
        self.model_code = model_code

    def validate(self):
        self.validate_required(self.license_no, 'license_no')
        self.validate_required(self.vin, 'vin')
        self.validate_required(self.engine_no, 'engine_no')
        self.validate_required(self.register_date, 'register_date')
        self.validate_required(self.model_code, 'model_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.license_no is not None:
            result['license_no'] = self.license_no
        if self.vin is not None:
            result['vin'] = self.vin
        if self.engine_no is not None:
            result['engine_no'] = self.engine_no
        if self.register_date is not None:
            result['register_date'] = self.register_date
        if self.model_code is not None:
            result['model_code'] = self.model_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('license_no') is not None:
            self.license_no = m.get('license_no')
        if m.get('vin') is not None:
            self.vin = m.get('vin')
        if m.get('engine_no') is not None:
            self.engine_no = m.get('engine_no')
        if m.get('register_date') is not None:
            self.register_date = m.get('register_date')
        if m.get('model_code') is not None:
            self.model_code = m.get('model_code')
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


class PushCarloanRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        basic_car_info: BasicCarInfo = None,
        user_info: CarUserInfo = None,
        scene_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 车信息
        self.basic_car_info = basic_car_info
        # 用户信息
        self.user_info = user_info
        # 场景码
        self.scene_code = scene_code

    def validate(self):
        self.validate_required(self.basic_car_info, 'basic_car_info')
        if self.basic_car_info:
            self.basic_car_info.validate()
        self.validate_required(self.user_info, 'user_info')
        if self.user_info:
            self.user_info.validate()
        self.validate_required(self.scene_code, 'scene_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.basic_car_info is not None:
            result['basic_car_info'] = self.basic_car_info.to_map()
        if self.user_info is not None:
            result['user_info'] = self.user_info.to_map()
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('basic_car_info') is not None:
            temp_model = BasicCarInfo()
            self.basic_car_info = temp_model.from_map(m['basic_car_info'])
        if m.get('user_info') is not None:
            temp_model = CarUserInfo()
            self.user_info = temp_model.from_map(m['user_info'])
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        return self


class PushCarloanResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        push_success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否推送成功
        self.push_success = push_success

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
        if self.push_success is not None:
            result['push_success'] = self.push_success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('push_success') is not None:
            self.push_success = m.get('push_success')
        return self


class RegisterCarownerRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene_code: str = None,
        user_info: CarOwnerUserInfo = None,
        car_info: CarInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 唯一场景码
        self.scene_code = scene_code
        # 用户基本信息
        self.user_info = user_info
        # 车辆信息
        self.car_info = car_info

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.user_info, 'user_info')
        if self.user_info:
            self.user_info.validate()
        self.validate_required(self.car_info, 'car_info')
        if self.car_info:
            self.car_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.user_info is not None:
            result['user_info'] = self.user_info.to_map()
        if self.car_info is not None:
            result['car_info'] = self.car_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('user_info') is not None:
            temp_model = CarOwnerUserInfo()
            self.user_info = temp_model.from_map(m['user_info'])
        if m.get('car_info') is not None:
            temp_model = CarInfo()
            self.car_info = temp_model.from_map(m['car_info'])
        return self


class RegisterCarownerResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        push_success: bool = None,
        token: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.push_success = push_success
        # token
        self.token = token

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
        if self.push_success is not None:
            result['push_success'] = self.push_success
        if self.token is not None:
            result['token'] = self.token
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('push_success') is not None:
            self.push_success = m.get('push_success')
        if m.get('token') is not None:
            self.token = m.get('token')
        return self


class BatchcreateNewcarRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene_code: str = None,
        new_car_info: List[NewCarInfo] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # testchannleCode
        self.scene_code = scene_code
        # 新车线索集合
        self.new_car_info = new_car_info

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.new_car_info, 'new_car_info')
        if self.new_car_info:
            for k in self.new_car_info:
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
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        result['new_car_info'] = []
        if self.new_car_info is not None:
            for k in self.new_car_info:
                result['new_car_info'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        self.new_car_info = []
        if m.get('new_car_info') is not None:
            for k in m.get('new_car_info'):
                temp_model = NewCarInfo()
                self.new_car_info.append(temp_model.from_map(k))
        return self


class BatchcreateNewcarResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        batch_submit_car_result: List[BatchSubmitCarResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 批量提交结果
        self.batch_submit_car_result = batch_submit_car_result

    def validate(self):
        if self.batch_submit_car_result:
            for k in self.batch_submit_car_result:
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
        result['batch_submit_car_result'] = []
        if self.batch_submit_car_result is not None:
            for k in self.batch_submit_car_result:
                result['batch_submit_car_result'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.batch_submit_car_result = []
        if m.get('batch_submit_car_result') is not None:
            for k in m.get('batch_submit_car_result'):
                temp_model = BatchSubmitCarResult()
                self.batch_submit_car_result.append(temp_model.from_map(k))
        return self


class SubmitNewcarRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene_code: str = None,
        user_info: CarUserInfo = None,
        car_series: str = None,
        finaical_plan: str = None,
        purcharse_time: str = None,
        car_series_id: str = None,
        submit_id: str = None,
        qc_car_series_id: str = None,
        match_source: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        self.scene_code = scene_code
        # 用户信息
        self.user_info = user_info
        # 车系
        self.car_series = car_series
        # 金融方案
        self.finaical_plan = finaical_plan
        # 
        # 预计购买时间
        self.purcharse_time = purcharse_time
        # xxxx
        self.car_series_id = car_series_id
        # 提交线索的唯一id
        self.submit_id = submit_id
        # 汽车之家车系id
        self.qc_car_series_id = qc_car_series_id
        # 匹配源
        self.match_source = match_source

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.user_info, 'user_info')
        if self.user_info:
            self.user_info.validate()
        self.validate_required(self.car_series, 'car_series')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.user_info is not None:
            result['user_info'] = self.user_info.to_map()
        if self.car_series is not None:
            result['car_series'] = self.car_series
        if self.finaical_plan is not None:
            result['finaical_plan'] = self.finaical_plan
        if self.purcharse_time is not None:
            result['purcharse_time'] = self.purcharse_time
        if self.car_series_id is not None:
            result['car_series_id'] = self.car_series_id
        if self.submit_id is not None:
            result['submit_id'] = self.submit_id
        if self.qc_car_series_id is not None:
            result['qc_car_series_id'] = self.qc_car_series_id
        if self.match_source is not None:
            result['match_source'] = self.match_source
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('user_info') is not None:
            temp_model = CarUserInfo()
            self.user_info = temp_model.from_map(m['user_info'])
        if m.get('car_series') is not None:
            self.car_series = m.get('car_series')
        if m.get('finaical_plan') is not None:
            self.finaical_plan = m.get('finaical_plan')
        if m.get('purcharse_time') is not None:
            self.purcharse_time = m.get('purcharse_time')
        if m.get('car_series_id') is not None:
            self.car_series_id = m.get('car_series_id')
        if m.get('submit_id') is not None:
            self.submit_id = m.get('submit_id')
        if m.get('qc_car_series_id') is not None:
            self.qc_car_series_id = m.get('qc_car_series_id')
        if m.get('match_source') is not None:
            self.match_source = m.get('match_source')
        return self


class SubmitNewcarResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        push_result_code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # OK NO_DEMAND 无线索需求，需要重试 INVALID 无效，不要重试
        self.push_result_code = push_result_code

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
        if self.push_result_code is not None:
            result['push_result_code'] = self.push_result_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('push_result_code') is not None:
            self.push_result_code = m.get('push_result_code')
        return self


class RegisterCarownerCyRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene_code: str = None,
        user_info: CyUserInfo = None,
        car_info: CarInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 唯一场景码
        self.scene_code = scene_code
        # 用户基本信息
        self.user_info = user_info
        # 车辆信息
        self.car_info = car_info

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.user_info, 'user_info')
        if self.user_info:
            self.user_info.validate()
        self.validate_required(self.car_info, 'car_info')
        if self.car_info:
            self.car_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.user_info is not None:
            result['user_info'] = self.user_info.to_map()
        if self.car_info is not None:
            result['car_info'] = self.car_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('user_info') is not None:
            temp_model = CyUserInfo()
            self.user_info = temp_model.from_map(m['user_info'])
        if m.get('car_info') is not None:
            temp_model = CarInfo()
            self.car_info = temp_model.from_map(m['car_info'])
        return self


class RegisterCarownerCyResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        push_success: bool = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 是否成功
        self.push_success = push_success

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
        if self.push_success is not None:
            result['push_success'] = self.push_success
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('push_success') is not None:
            self.push_success = m.get('push_success')
        return self


class QueryCarPriceRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        car_id: str = None,
        series_id: str = None,
        city_code: str = None,
        page_num: int = None,
        page_size: int = None,
        id_type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 车型id
        self.car_id = car_id
        # 车系id
        self.series_id = series_id
        # 城市code
        self.city_code = city_code
        # 页码
        self.page_num = page_num
        # 每页大小
        self.page_size = page_size
        # QC或者DCD的id查询价格
        self.id_type = id_type

    def validate(self):
        self.validate_required(self.page_num, 'page_num')
        self.validate_required(self.page_size, 'page_size')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.car_id is not None:
            result['car_id'] = self.car_id
        if self.series_id is not None:
            result['series_id'] = self.series_id
        if self.city_code is not None:
            result['city_code'] = self.city_code
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.id_type is not None:
            result['id_type'] = self.id_type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('car_id') is not None:
            self.car_id = m.get('car_id')
        if m.get('series_id') is not None:
            self.series_id = m.get('series_id')
        if m.get('city_code') is not None:
            self.city_code = m.get('city_code')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('id_type') is not None:
            self.id_type = m.get('id_type')
        return self


class QueryCarPriceResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total_pages: int = None,
        page_num: int = None,
        data: List[CarBusinessPrice] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总页数
        self.total_pages = total_pages
        # 当前页码
        self.page_num = page_num
        # 
        # 车辆业务价格
        self.data = data

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
        if self.total_pages is not None:
            result['total_pages'] = self.total_pages
        if self.page_num is not None:
            result['page_num'] = self.page_num
        result['data'] = []
        if self.data is not None:
            for k in self.data:
                result['data'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('total_pages') is not None:
            self.total_pages = m.get('total_pages')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        self.data = []
        if m.get('data') is not None:
            for k in m.get('data'):
                temp_model = CarBusinessPrice()
                self.data.append(temp_model.from_map(k))
        return self


class ImportCarFileRequest(TeaModel):
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
        # xx
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


class ImportCarFileResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # xx
        self.code = code

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
        if self.code is not None:
            result['code'] = self.code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        return self


class QueryUsedcarRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene_code: str = None,
        used_car_info: UsedCarInfo = None,
        user_info: CarOwnerUserInfo = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        self.scene_code = scene_code
        # 二手车信息
        self.used_car_info = used_car_info
        # 用户基本信息
        self.user_info = user_info

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.used_car_info, 'used_car_info')
        if self.used_car_info:
            self.used_car_info.validate()
        self.validate_required(self.user_info, 'user_info')
        if self.user_info:
            self.user_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        if self.used_car_info is not None:
            result['used_car_info'] = self.used_car_info.to_map()
        if self.user_info is not None:
            result['user_info'] = self.user_info.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('used_car_info') is not None:
            temp_model = UsedCarInfo()
            self.used_car_info = temp_model.from_map(m['used_car_info'])
        if m.get('user_info') is not None:
            temp_model = CarOwnerUserInfo()
            self.user_info = temp_model.from_map(m['user_info'])
        return self


class QueryUsedcarResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        used_car_valuation: UsedCarValuation = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 二手车估值信息
        self.used_car_valuation = used_car_valuation

    def validate(self):
        if self.used_car_valuation:
            self.used_car_valuation.validate()

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
        if self.used_car_valuation is not None:
            result['used_car_valuation'] = self.used_car_valuation.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('used_car_valuation') is not None:
            temp_model = UsedCarValuation()
            self.used_car_valuation = temp_model.from_map(m['used_car_valuation'])
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


