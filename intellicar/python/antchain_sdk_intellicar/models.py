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


class GdCustomerUv(TeaModel):
    def __init__(
        self,
        total: int = None,
        count: int = None,
        sort: int = None,
    ):
        # uv指数数量
        self.total = total
        # uv指数数量
        self.count = count
        # uv指数排序
        # 
        self.sort = sort

    def validate(self):
        self.validate_required(self.total, 'total')
        self.validate_required(self.count, 'count')
        self.validate_required(self.sort, 'sort')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total is not None:
            result['total'] = self.total
        if self.count is not None:
            result['count'] = self.count
        if self.sort is not None:
            result['sort'] = self.sort
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('count') is not None:
            self.count = m.get('count')
        if m.get('sort') is not None:
            self.sort = m.get('sort')
        return self


class GdCustomerPv(TeaModel):
    def __init__(
        self,
        total: int = None,
        count: int = None,
        sort: int = None,
    ):
        # 重叠指数pv历史指数数量（时间类型为季度、半年、年时，不展示）
        self.total = total
        # 重叠指数pv指数数量
        self.count = count
        # 重叠指数pv指数排序
        self.sort = sort

    def validate(self):
        self.validate_required(self.total, 'total')
        self.validate_required(self.count, 'count')
        self.validate_required(self.sort, 'sort')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total is not None:
            result['total'] = self.total
        if self.count is not None:
            result['count'] = self.count
        if self.sort is not None:
            result['sort'] = self.sort
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('count') is not None:
            self.count = m.get('count')
        if m.get('sort') is not None:
            self.sort = m.get('sort')
        return self


class GdDest(TeaModel):
    def __init__(
        self,
        uv: GdCustomerUv = None,
        pv: GdCustomerPv = None,
        brand_id: str = None,
        shop_id: str = None,
        citycode: str = None,
        pcode: str = None,
        countrycode: str = None,
    ):
        # 流出指数uv指数
        self.uv = uv
        # 流出指数pv指数
        self.pv = pv
        # 流出品牌id
        self.brand_id = brand_id
        # 流出店铺id，数据类型为店铺时返回该属性与值
        self.shop_id = shop_id
        # 城市编码，数据类型为店铺或者城市时返回该属性与值
        self.citycode = citycode
        # 省份编码，数据类型为省份时返回该属性与值
        self.pcode = pcode
        # 数据类型为全国时返回该属性与值
        self.countrycode = countrycode

    def validate(self):
        self.validate_required(self.uv, 'uv')
        if self.uv:
            self.uv.validate()
        self.validate_required(self.pv, 'pv')
        if self.pv:
            self.pv.validate()
        self.validate_required(self.brand_id, 'brand_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.uv is not None:
            result['uv'] = self.uv.to_map()
        if self.pv is not None:
            result['pv'] = self.pv.to_map()
        if self.brand_id is not None:
            result['brand_id'] = self.brand_id
        if self.shop_id is not None:
            result['shop_id'] = self.shop_id
        if self.citycode is not None:
            result['citycode'] = self.citycode
        if self.pcode is not None:
            result['pcode'] = self.pcode
        if self.countrycode is not None:
            result['countrycode'] = self.countrycode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('uv') is not None:
            temp_model = GdCustomerUv()
            self.uv = temp_model.from_map(m['uv'])
        if m.get('pv') is not None:
            temp_model = GdCustomerPv()
            self.pv = temp_model.from_map(m['pv'])
        if m.get('brand_id') is not None:
            self.brand_id = m.get('brand_id')
        if m.get('shop_id') is not None:
            self.shop_id = m.get('shop_id')
        if m.get('citycode') is not None:
            self.citycode = m.get('citycode')
        if m.get('pcode') is not None:
            self.pcode = m.get('pcode')
        if m.get('countrycode') is not None:
            self.countrycode = m.get('countrycode')
        return self


class GdSrc(TeaModel):
    def __init__(
        self,
        uv: GdCustomerUv = None,
        pv: GdCustomerPv = None,
        brand_id: str = None,
        shop_id: str = None,
        citycode: str = None,
        pcode: str = None,
        countrycode: str = None,
    ):
        # 流入指数uv指数
        self.uv = uv
        # 流入指数pv指数
        self.pv = pv
        # 流入品牌id
        self.brand_id = brand_id
        # 流入店铺id，数据类型为店铺时返回该属性与值
        self.shop_id = shop_id
        # 流入城市编码，数据类型为店铺或者城市时返回该属性与值
        self.citycode = citycode
        # 省份编码，数据类型为省份时返回该属性与值
        self.pcode = pcode
        # 数据类型为全国时返回该属性与值
        self.countrycode = countrycode

    def validate(self):
        self.validate_required(self.uv, 'uv')
        if self.uv:
            self.uv.validate()
        self.validate_required(self.pv, 'pv')
        if self.pv:
            self.pv.validate()
        self.validate_required(self.brand_id, 'brand_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.uv is not None:
            result['uv'] = self.uv.to_map()
        if self.pv is not None:
            result['pv'] = self.pv.to_map()
        if self.brand_id is not None:
            result['brand_id'] = self.brand_id
        if self.shop_id is not None:
            result['shop_id'] = self.shop_id
        if self.citycode is not None:
            result['citycode'] = self.citycode
        if self.pcode is not None:
            result['pcode'] = self.pcode
        if self.countrycode is not None:
            result['countrycode'] = self.countrycode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('uv') is not None:
            temp_model = GdCustomerUv()
            self.uv = temp_model.from_map(m['uv'])
        if m.get('pv') is not None:
            temp_model = GdCustomerPv()
            self.pv = temp_model.from_map(m['pv'])
        if m.get('brand_id') is not None:
            self.brand_id = m.get('brand_id')
        if m.get('shop_id') is not None:
            self.shop_id = m.get('shop_id')
        if m.get('citycode') is not None:
            self.citycode = m.get('citycode')
        if m.get('pcode') is not None:
            self.pcode = m.get('pcode')
        if m.get('countrycode') is not None:
            self.countrycode = m.get('countrycode')
        return self


class Overlap(TeaModel):
    def __init__(
        self,
        uv: GdCustomerUv = None,
        pv: GdCustomerPv = None,
        brand_id: str = None,
        shop_id: str = None,
        citycode: str = None,
        pcode: str = None,
        countrycode: str = None,
    ):
        # 重叠指数uv指数
        self.uv = uv
        # 重叠指数pv指数
        self.pv = pv
        # 重叠品牌id
        self.brand_id = brand_id
        # 重叠店铺id，数据类型为店铺时返回该属性与值
        self.shop_id = shop_id
        # 重叠城市编码，数据类型为城市时返回该属性与值
        self.citycode = citycode
        # 重叠省份编码，数据类型为省份时返回该属性与值
        self.pcode = pcode
        # 数据类型为全国时返回该属性与值
        self.countrycode = countrycode

    def validate(self):
        self.validate_required(self.uv, 'uv')
        if self.uv:
            self.uv.validate()
        self.validate_required(self.pv, 'pv')
        if self.pv:
            self.pv.validate()
        self.validate_required(self.brand_id, 'brand_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.uv is not None:
            result['uv'] = self.uv.to_map()
        if self.pv is not None:
            result['pv'] = self.pv.to_map()
        if self.brand_id is not None:
            result['brand_id'] = self.brand_id
        if self.shop_id is not None:
            result['shop_id'] = self.shop_id
        if self.citycode is not None:
            result['citycode'] = self.citycode
        if self.pcode is not None:
            result['pcode'] = self.pcode
        if self.countrycode is not None:
            result['countrycode'] = self.countrycode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('uv') is not None:
            temp_model = GdCustomerUv()
            self.uv = temp_model.from_map(m['uv'])
        if m.get('pv') is not None:
            temp_model = GdCustomerPv()
            self.pv = temp_model.from_map(m['pv'])
        if m.get('brand_id') is not None:
            self.brand_id = m.get('brand_id')
        if m.get('shop_id') is not None:
            self.shop_id = m.get('shop_id')
        if m.get('citycode') is not None:
            self.citycode = m.get('citycode')
        if m.get('pcode') is not None:
            self.pcode = m.get('pcode')
        if m.get('countrycode') is not None:
            self.countrycode = m.get('countrycode')
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


class SpecList(TeaModel):
    def __init__(
        self,
        brand_id: str = None,
        brand_name: str = None,
        factory_id: str = None,
        factory_name: str = None,
        series_id: str = None,
        series_name: str = None,
        spec_id: str = None,
        spec_name: str = None,
    ):
        # 品牌Id
        self.brand_id = brand_id
        # 品牌名称
        self.brand_name = brand_name
        # 厂商id
        self.factory_id = factory_id
        # 厂商名称
        self.factory_name = factory_name
        # 车系id
        self.series_id = series_id
        # 车系名称
        self.series_name = series_name
        # 车型Id
        self.spec_id = spec_id
        # 车型名称
        self.spec_name = spec_name

    def validate(self):
        self.validate_required(self.brand_id, 'brand_id')
        self.validate_required(self.brand_name, 'brand_name')
        self.validate_required(self.factory_id, 'factory_id')
        self.validate_required(self.factory_name, 'factory_name')
        self.validate_required(self.series_id, 'series_id')
        self.validate_required(self.series_name, 'series_name')
        self.validate_required(self.spec_id, 'spec_id')
        self.validate_required(self.spec_name, 'spec_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.brand_id is not None:
            result['brand_id'] = self.brand_id
        if self.brand_name is not None:
            result['brand_name'] = self.brand_name
        if self.factory_id is not None:
            result['factory_id'] = self.factory_id
        if self.factory_name is not None:
            result['factory_name'] = self.factory_name
        if self.series_id is not None:
            result['series_id'] = self.series_id
        if self.series_name is not None:
            result['series_name'] = self.series_name
        if self.spec_id is not None:
            result['spec_id'] = self.spec_id
        if self.spec_name is not None:
            result['spec_name'] = self.spec_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('brand_id') is not None:
            self.brand_id = m.get('brand_id')
        if m.get('brand_name') is not None:
            self.brand_name = m.get('brand_name')
        if m.get('factory_id') is not None:
            self.factory_id = m.get('factory_id')
        if m.get('factory_name') is not None:
            self.factory_name = m.get('factory_name')
        if m.get('series_id') is not None:
            self.series_id = m.get('series_id')
        if m.get('series_name') is not None:
            self.series_name = m.get('series_name')
        if m.get('spec_id') is not None:
            self.spec_id = m.get('spec_id')
        if m.get('spec_name') is not None:
            self.spec_name = m.get('spec_name')
        return self


class GdStoreRecord(TeaModel):
    def __init__(
        self,
        shop_id: str = None,
        name: str = None,
        address: str = None,
        pname: str = None,
        cityname: str = None,
        brand_id: str = None,
        brand_name: str = None,
        office_code: str = None,
        lon: str = None,
        lat: str = None,
        version_list: List[str] = None,
    ):
        # 店铺ID
        self.shop_id = shop_id
        # 店铺名称
        self.name = name
        # 店铺地址
        self.address = address
        # 店铺所在省份
        self.pname = pname
        # 店铺所在城市
        self.cityname = cityname
        # 品牌id
        self.brand_id = brand_id
        # 品牌名称
        self.brand_name = brand_name
        # 经销商代码
        self.office_code = office_code
        # 经度
        self.lon = lon
        # 纬度
        self.lat = lat
        # 店铺数据版本集合
        self.version_list = version_list

    def validate(self):
        self.validate_required(self.shop_id, 'shop_id')
        self.validate_required(self.name, 'name')
        self.validate_required(self.address, 'address')
        self.validate_required(self.pname, 'pname')
        self.validate_required(self.cityname, 'cityname')
        self.validate_required(self.brand_id, 'brand_id')
        self.validate_required(self.brand_name, 'brand_name')
        self.validate_required(self.office_code, 'office_code')
        self.validate_required(self.lon, 'lon')
        self.validate_required(self.lat, 'lat')
        self.validate_required(self.version_list, 'version_list')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.shop_id is not None:
            result['shop_id'] = self.shop_id
        if self.name is not None:
            result['name'] = self.name
        if self.address is not None:
            result['address'] = self.address
        if self.pname is not None:
            result['pname'] = self.pname
        if self.cityname is not None:
            result['cityname'] = self.cityname
        if self.brand_id is not None:
            result['brand_id'] = self.brand_id
        if self.brand_name is not None:
            result['brand_name'] = self.brand_name
        if self.office_code is not None:
            result['office_code'] = self.office_code
        if self.lon is not None:
            result['lon'] = self.lon
        if self.lat is not None:
            result['lat'] = self.lat
        if self.version_list is not None:
            result['version_list'] = self.version_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('shop_id') is not None:
            self.shop_id = m.get('shop_id')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('address') is not None:
            self.address = m.get('address')
        if m.get('pname') is not None:
            self.pname = m.get('pname')
        if m.get('cityname') is not None:
            self.cityname = m.get('cityname')
        if m.get('brand_id') is not None:
            self.brand_id = m.get('brand_id')
        if m.get('brand_name') is not None:
            self.brand_name = m.get('brand_name')
        if m.get('office_code') is not None:
            self.office_code = m.get('office_code')
        if m.get('lon') is not None:
            self.lon = m.get('lon')
        if m.get('lat') is not None:
            self.lat = m.get('lat')
        if m.get('version_list') is not None:
            self.version_list = m.get('version_list')
        return self


class GdPotentialCustomerRecord(TeaModel):
    def __init__(
        self,
        uv: GdCustomerUv = None,
        citycode: str = None,
        pv: GdCustomerPv = None,
        shop_id: str = None,
        brand_id: str = None,
        shop_num: int = None,
        time: str = None,
        pcode: str = None,
        countrycode: str = None,
    ):
        # uv指数
        self.uv = uv
        # 城市编码，数据类型为店铺或者城市时返回该属性与值
        self.citycode = citycode
        # pv指数
        self.pv = pv
        # 店铺id，数据类型为店铺时返回该属性与值
        self.shop_id = shop_id
        # 品牌id
        self.brand_id = brand_id
        # 店铺数量（dataType!=SHOP时返回该字段）
        self.shop_num = shop_num
        # 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM）
        self.time = time
        # 省份编码，数据类型为省份时返回该属性与值
        self.pcode = pcode
        # 数据类型为全国时返回该属性与值
        self.countrycode = countrycode

    def validate(self):
        self.validate_required(self.uv, 'uv')
        if self.uv:
            self.uv.validate()
        self.validate_required(self.pv, 'pv')
        if self.pv:
            self.pv.validate()
        self.validate_required(self.brand_id, 'brand_id')
        self.validate_required(self.time, 'time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.uv is not None:
            result['uv'] = self.uv.to_map()
        if self.citycode is not None:
            result['citycode'] = self.citycode
        if self.pv is not None:
            result['pv'] = self.pv.to_map()
        if self.shop_id is not None:
            result['shop_id'] = self.shop_id
        if self.brand_id is not None:
            result['brand_id'] = self.brand_id
        if self.shop_num is not None:
            result['shop_num'] = self.shop_num
        if self.time is not None:
            result['time'] = self.time
        if self.pcode is not None:
            result['pcode'] = self.pcode
        if self.countrycode is not None:
            result['countrycode'] = self.countrycode
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('uv') is not None:
            temp_model = GdCustomerUv()
            self.uv = temp_model.from_map(m['uv'])
        if m.get('citycode') is not None:
            self.citycode = m.get('citycode')
        if m.get('pv') is not None:
            temp_model = GdCustomerPv()
            self.pv = temp_model.from_map(m['pv'])
        if m.get('shop_id') is not None:
            self.shop_id = m.get('shop_id')
        if m.get('brand_id') is not None:
            self.brand_id = m.get('brand_id')
        if m.get('shop_num') is not None:
            self.shop_num = m.get('shop_num')
        if m.get('time') is not None:
            self.time = m.get('time')
        if m.get('pcode') is not None:
            self.pcode = m.get('pcode')
        if m.get('countrycode') is not None:
            self.countrycode = m.get('countrycode')
        return self


class GdCustomersRecord(TeaModel):
    def __init__(
        self,
        citycode: str = None,
        brand_id: str = None,
        shop_id: str = None,
        time: str = None,
        overlap_list: List[Overlap] = None,
        overlap_list_num: str = None,
        src_list: List[GdSrc] = None,
        src_list_num: str = None,
        dest_list: List[GdDest] = None,
        dest_list_num: str = None,
    ):
        # 城市编码，数据类型为店铺或者城市时返回该属性与值
        self.citycode = citycode
        # 品牌id
        self.brand_id = brand_id
        # 店铺id，数据类型为店铺或者店铺品牌时返回该属性与值
        self.shop_id = shop_id
        # 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM）
        self.time = time
        # 重叠指数集合
        self.overlap_list = overlap_list
        # 重叠指数集合条数
        self.overlap_list_num = overlap_list_num
        # 流入指数集合
        self.src_list = src_list
        # 流入指数条数
        self.src_list_num = src_list_num
        # 流出指数集合
        self.dest_list = dest_list
        # 流出指数条数
        self.dest_list_num = dest_list_num

    def validate(self):
        self.validate_required(self.citycode, 'citycode')
        self.validate_required(self.brand_id, 'brand_id')
        self.validate_required(self.shop_id, 'shop_id')
        self.validate_required(self.time, 'time')
        self.validate_required(self.overlap_list, 'overlap_list')
        if self.overlap_list:
            for k in self.overlap_list:
                if k:
                    k.validate()
        self.validate_required(self.overlap_list_num, 'overlap_list_num')
        self.validate_required(self.src_list, 'src_list')
        if self.src_list:
            for k in self.src_list:
                if k:
                    k.validate()
        self.validate_required(self.src_list_num, 'src_list_num')
        self.validate_required(self.dest_list, 'dest_list')
        if self.dest_list:
            for k in self.dest_list:
                if k:
                    k.validate()
        self.validate_required(self.dest_list_num, 'dest_list_num')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.citycode is not None:
            result['citycode'] = self.citycode
        if self.brand_id is not None:
            result['brand_id'] = self.brand_id
        if self.shop_id is not None:
            result['shop_id'] = self.shop_id
        if self.time is not None:
            result['time'] = self.time
        result['overlap_list'] = []
        if self.overlap_list is not None:
            for k in self.overlap_list:
                result['overlap_list'].append(k.to_map() if k else None)
        if self.overlap_list_num is not None:
            result['overlap_list_num'] = self.overlap_list_num
        result['src_list'] = []
        if self.src_list is not None:
            for k in self.src_list:
                result['src_list'].append(k.to_map() if k else None)
        if self.src_list_num is not None:
            result['src_list_num'] = self.src_list_num
        result['dest_list'] = []
        if self.dest_list is not None:
            for k in self.dest_list:
                result['dest_list'].append(k.to_map() if k else None)
        if self.dest_list_num is not None:
            result['dest_list_num'] = self.dest_list_num
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('citycode') is not None:
            self.citycode = m.get('citycode')
        if m.get('brand_id') is not None:
            self.brand_id = m.get('brand_id')
        if m.get('shop_id') is not None:
            self.shop_id = m.get('shop_id')
        if m.get('time') is not None:
            self.time = m.get('time')
        self.overlap_list = []
        if m.get('overlap_list') is not None:
            for k in m.get('overlap_list'):
                temp_model = Overlap()
                self.overlap_list.append(temp_model.from_map(k))
        if m.get('overlap_list_num') is not None:
            self.overlap_list_num = m.get('overlap_list_num')
        self.src_list = []
        if m.get('src_list') is not None:
            for k in m.get('src_list'):
                temp_model = GdSrc()
                self.src_list.append(temp_model.from_map(k))
        if m.get('src_list_num') is not None:
            self.src_list_num = m.get('src_list_num')
        self.dest_list = []
        if m.get('dest_list') is not None:
            for k in m.get('dest_list'):
                temp_model = GdDest()
                self.dest_list.append(temp_model.from_map(k))
        if m.get('dest_list_num') is not None:
            self.dest_list_num = m.get('dest_list_num')
        return self


class CityResult(TeaModel):
    def __init__(
        self,
        city_id: str = None,
        city_name: str = None,
    ):
        # 城市Id
        self.city_id = city_id
        # 城市名称
        self.city_name = city_name

    def validate(self):
        self.validate_required(self.city_id, 'city_id')
        self.validate_required(self.city_name, 'city_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.city_id is not None:
            result['city_id'] = self.city_id
        if self.city_name is not None:
            result['city_name'] = self.city_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('city_id') is not None:
            self.city_id = m.get('city_id')
        if m.get('city_name') is not None:
            self.city_name = m.get('city_name')
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


class GdStoreInfo(TeaModel):
    def __init__(
        self,
        total: int = None,
        current: int = None,
        pages: int = None,
        size: int = None,
        records: List[GdStoreRecord] = None,
    ):
        # 数据总数
        self.total = total
        # 当前展示页
        self.current = current
        # 数据总页数
        self.pages = pages
        # 每页显示数据条数
        self.size = size
        # 数据集合
        self.records = records

    def validate(self):
        self.validate_required(self.total, 'total')
        self.validate_required(self.current, 'current')
        self.validate_required(self.pages, 'pages')
        self.validate_required(self.size, 'size')
        self.validate_required(self.records, 'records')
        if self.records:
            for k in self.records:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.total is not None:
            result['total'] = self.total
        if self.current is not None:
            result['current'] = self.current
        if self.pages is not None:
            result['pages'] = self.pages
        if self.size is not None:
            result['size'] = self.size
        result['records'] = []
        if self.records is not None:
            for k in self.records:
                result['records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('pages') is not None:
            self.pages = m.get('pages')
        if m.get('size') is not None:
            self.size = m.get('size')
        self.records = []
        if m.get('records') is not None:
            for k in m.get('records'):
                temp_model = GdStoreRecord()
                self.records.append(temp_model.from_map(k))
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


class GdCustomerInfo(TeaModel):
    def __init__(
        self,
        time_range: str = None,
        total: int = None,
        current: int = None,
        pages: int = None,
        size: int = None,
        records: List[GdCustomersRecord] = None,
    ):
        # 时间范围（查询年度数据时，返回该字段）
        self.time_range = time_range
        # 数据总数
        self.total = total
        # 当前展示页
        self.current = current
        # 数据总页数
        self.pages = pages
        # 每页显示数据条数
        self.size = size
        # 数据集合
        self.records = records

    def validate(self):
        self.validate_required(self.total, 'total')
        self.validate_required(self.current, 'current')
        self.validate_required(self.pages, 'pages')
        self.validate_required(self.size, 'size')
        self.validate_required(self.records, 'records')
        if self.records:
            for k in self.records:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.time_range is not None:
            result['time_range'] = self.time_range
        if self.total is not None:
            result['total'] = self.total
        if self.current is not None:
            result['current'] = self.current
        if self.pages is not None:
            result['pages'] = self.pages
        if self.size is not None:
            result['size'] = self.size
        result['records'] = []
        if self.records is not None:
            for k in self.records:
                result['records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('time_range') is not None:
            self.time_range = m.get('time_range')
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('pages') is not None:
            self.pages = m.get('pages')
        if m.get('size') is not None:
            self.size = m.get('size')
        self.records = []
        if m.get('records') is not None:
            for k in m.get('records'):
                temp_model = GdCustomersRecord()
                self.records.append(temp_model.from_map(k))
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


class SpecResult(TeaModel):
    def __init__(
        self,
        after_spec_id: str = None,
        spec_list: List[SpecList] = None,
    ):
        # 下一页数据拉取传递的值
        self.after_spec_id = after_spec_id
        # 车型Id列表
        self.spec_list = spec_list

    def validate(self):
        self.validate_required(self.after_spec_id, 'after_spec_id')
        self.validate_required(self.spec_list, 'spec_list')
        if self.spec_list:
            for k in self.spec_list:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.after_spec_id is not None:
            result['after_spec_id'] = self.after_spec_id
        result['spec_list'] = []
        if self.spec_list is not None:
            for k in self.spec_list:
                result['spec_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('after_spec_id') is not None:
            self.after_spec_id = m.get('after_spec_id')
        self.spec_list = []
        if m.get('spec_list') is not None:
            for k in m.get('spec_list'):
                temp_model = SpecList()
                self.spec_list.append(temp_model.from_map(k))
        return self


class GdCustomerFlow(TeaModel):
    def __init__(
        self,
        current: int = None,
        data_type: str = None,
        time_type: str = None,
        main_brand: str = None,
        time: str = None,
        brand_limit: str = None,
        data_limit: str = None,
        base_self: int = None,
    ):
        # 当前页面
        self.current = current
        # 数据类型（SHOP：店铺；CITY：城市；PROVINCE：省份；COUNTRY：全国；SHOP_BRAND：店铺品牌(仅限竞品)）
        self.data_type = data_type
        # 时间类型（DAY：天；WEEK：周；MONTH：月；仅针对城市和店铺品牌的竞品数据支持的时间类型为，季度：QUARTER；半年：HALF；年：YEAR）
        self.time_type = time_type
        # 主品牌id
        self.main_brand = main_brand
        # 时间（时间类型为天时：yyyyMMdd；时间类型为周时：yyyyWW；时间类型为月时：yyyyMM；时间类型为季度时：yyyyQQ；时间类型为半年时：yyyyBB；时间类型为年时：yyyy；）
        self.time = time
        # 品牌id，以”,”分隔
        self.brand_limit = brand_limit
        # 数据指数类型（pv、uv中选择，多个以”,”分隔）
        self.data_limit = data_limit
        # 数据统计逻辑（0：默认值，基于本品或竞品获取；1：基于本品获取）
        self.base_self = base_self

    def validate(self):
        self.validate_required(self.current, 'current')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.current is not None:
            result['current'] = self.current
        if self.data_type is not None:
            result['data_type'] = self.data_type
        if self.time_type is not None:
            result['time_type'] = self.time_type
        if self.main_brand is not None:
            result['main_brand'] = self.main_brand
        if self.time is not None:
            result['time'] = self.time
        if self.brand_limit is not None:
            result['brand_limit'] = self.brand_limit
        if self.data_limit is not None:
            result['data_limit'] = self.data_limit
        if self.base_self is not None:
            result['base_self'] = self.base_self
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('data_type') is not None:
            self.data_type = m.get('data_type')
        if m.get('time_type') is not None:
            self.time_type = m.get('time_type')
        if m.get('main_brand') is not None:
            self.main_brand = m.get('main_brand')
        if m.get('time') is not None:
            self.time = m.get('time')
        if m.get('brand_limit') is not None:
            self.brand_limit = m.get('brand_limit')
        if m.get('data_limit') is not None:
            self.data_limit = m.get('data_limit')
        if m.get('base_self') is not None:
            self.base_self = m.get('base_self')
        return self


class GdPotentialCustomerInfo(TeaModel):
    def __init__(
        self,
        time_range: str = None,
        total: int = None,
        current: int = None,
        pages: int = None,
        size: int = None,
        records: List[GdPotentialCustomerRecord] = None,
    ):
        # 时间范围（查询月度或年度数据时，返回该字段）
        self.time_range = time_range
        # 数据总数
        self.total = total
        # 当前展示页
        self.current = current
        # 数据总页数
        self.pages = pages
        # 每页显示数据条数
        self.size = size
        # 数据集合
        self.records = records

    def validate(self):
        self.validate_required(self.total, 'total')
        self.validate_required(self.current, 'current')
        self.validate_required(self.pages, 'pages')
        self.validate_required(self.size, 'size')
        self.validate_required(self.records, 'records')
        if self.records:
            for k in self.records:
                if k:
                    k.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.time_range is not None:
            result['time_range'] = self.time_range
        if self.total is not None:
            result['total'] = self.total
        if self.current is not None:
            result['current'] = self.current
        if self.pages is not None:
            result['pages'] = self.pages
        if self.size is not None:
            result['size'] = self.size
        result['records'] = []
        if self.records is not None:
            for k in self.records:
                result['records'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('time_range') is not None:
            self.time_range = m.get('time_range')
        if m.get('total') is not None:
            self.total = m.get('total')
        if m.get('current') is not None:
            self.current = m.get('current')
        if m.get('pages') is not None:
            self.pages = m.get('pages')
        if m.get('size') is not None:
            self.size = m.get('size')
        self.records = []
        if m.get('records') is not None:
            for k in m.get('records'):
                temp_model = GdPotentialCustomerRecord()
                self.records.append(temp_model.from_map(k))
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


class SubmitIonchiRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        submit_id: str = None,
        mobile_md_5: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 线索唯一标识
        self.submit_id = submit_id
        # 手机号md5
        self.mobile_md_5 = mobile_md_5

    def validate(self):
        self.validate_required(self.submit_id, 'submit_id')
        self.validate_required(self.mobile_md_5, 'mobile_md_5')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.submit_id is not None:
            result['submit_id'] = self.submit_id
        if self.mobile_md_5 is not None:
            result['mobile_md5'] = self.mobile_md_5
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('submit_id') is not None:
            self.submit_id = m.get('submit_id')
        if m.get('mobile_md5') is not None:
            self.mobile_md_5 = m.get('mobile_md5')
        return self


class SubmitIonchiResponse(TeaModel):
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
        # 推送数科客户成功
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


class QueryNewcarQczjRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        query_type: str = None,
        after_spec_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 查询类型
        self.query_type = query_type
        # 批量拉取数据时，上一次返回的afterSpecId
        self.after_spec_id = after_spec_id

    def validate(self):
        self.validate_required(self.query_type, 'query_type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.query_type is not None:
            result['query_type'] = self.query_type
        if self.after_spec_id is not None:
            result['after_spec_id'] = self.after_spec_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('query_type') is not None:
            self.query_type = m.get('query_type')
        if m.get('after_spec_id') is not None:
            self.after_spec_id = m.get('after_spec_id')
        return self


class QueryNewcarQczjResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        returncode: str = None,
        message: str = None,
        city_result: List[CityResult] = None,
        spec_result: SpecResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 0代表成功，其余代表失败
        self.returncode = returncode
        # 失败时错误消息
        self.message = message
        # 城市结果结构体
        self.city_result = city_result
        # 车型结果结构体
        self.spec_result = spec_result

    def validate(self):
        if self.city_result:
            for k in self.city_result:
                if k:
                    k.validate()
        if self.spec_result:
            self.spec_result.validate()

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
        if self.returncode is not None:
            result['returncode'] = self.returncode
        if self.message is not None:
            result['message'] = self.message
        result['city_result'] = []
        if self.city_result is not None:
            for k in self.city_result:
                result['city_result'].append(k.to_map() if k else None)
        if self.spec_result is not None:
            result['spec_result'] = self.spec_result.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('returncode') is not None:
            self.returncode = m.get('returncode')
        if m.get('message') is not None:
            self.message = m.get('message')
        self.city_result = []
        if m.get('city_result') is not None:
            for k in m.get('city_result'):
                temp_model = CityResult()
                self.city_result.append(temp_model.from_map(k))
        if m.get('spec_result') is not None:
            temp_model = SpecResult()
            self.spec_result = temp_model.from_map(m['spec_result'])
        return self


class QueryGdFlowRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene_code: str = None,
        gd_customer_flow: GdCustomerFlow = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 租户ID
        self.scene_code = scene_code
        # 实际请求体
        self.gd_customer_flow = gd_customer_flow

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.gd_customer_flow, 'gd_customer_flow')
        if self.gd_customer_flow:
            self.gd_customer_flow.validate()

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
        if self.gd_customer_flow is not None:
            result['gd_customer_flow'] = self.gd_customer_flow.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('gd_customer_flow') is not None:
            temp_model = GdCustomerFlow()
            self.gd_customer_flow = temp_model.from_map(m['gd_customer_flow'])
        return self


class QueryGdFlowResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        code: int = None,
        request_link_id: str = None,
        data: GdCustomerInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回消息
        self.msg = msg
        # 返回编码，值为10000表示成功，其余值表示失败
        self.code = code
        # 随机返回id
        self.request_link_id = request_link_id
        # 返回数据
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
        if self.msg is not None:
            result['msg'] = self.msg
        if self.code is not None:
            result['code'] = self.code
        if self.request_link_id is not None:
            result['request_link_id'] = self.request_link_id
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('request_link_id') is not None:
            self.request_link_id = m.get('request_link_id')
        if m.get('data') is not None:
            temp_model = GdCustomerInfo()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryGdStoreRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene_code: str = None,
        gd_customer_flow: GdCustomerFlow = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        self.scene_code = scene_code
        # 查询店铺基本信息请求体
        self.gd_customer_flow = gd_customer_flow

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.gd_customer_flow, 'gd_customer_flow')
        if self.gd_customer_flow:
            self.gd_customer_flow.validate()

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
        if self.gd_customer_flow is not None:
            result['gd_customer_flow'] = self.gd_customer_flow.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('gd_customer_flow') is not None:
            temp_model = GdCustomerFlow()
            self.gd_customer_flow = temp_model.from_map(m['gd_customer_flow'])
        return self


class QueryGdStoreResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        code: str = None,
        request_link_id: str = None,
        data: GdStoreInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回消息
        self.msg = msg
        # 返回编码，值为10000表示成功，其余值表示失败
        self.code = code
        # 随即返回ID
        self.request_link_id = request_link_id
        # 返回数据
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
        if self.msg is not None:
            result['msg'] = self.msg
        if self.code is not None:
            result['code'] = self.code
        if self.request_link_id is not None:
            result['request_link_id'] = self.request_link_id
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('request_link_id') is not None:
            self.request_link_id = m.get('request_link_id')
        if m.get('data') is not None:
            temp_model = GdStoreInfo()
            self.data = temp_model.from_map(m['data'])
        return self


class QueryGdPoentialRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene_code: str = None,
        gd_customer_flow: GdCustomerFlow = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        self.scene_code = scene_code
        # 潜客指数接口请求体
        self.gd_customer_flow = gd_customer_flow

    def validate(self):
        self.validate_required(self.scene_code, 'scene_code')
        self.validate_required(self.gd_customer_flow, 'gd_customer_flow')
        if self.gd_customer_flow:
            self.gd_customer_flow.validate()

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
        if self.gd_customer_flow is not None:
            result['gd_customer_flow'] = self.gd_customer_flow.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        if m.get('gd_customer_flow') is not None:
            temp_model = GdCustomerFlow()
            self.gd_customer_flow = temp_model.from_map(m['gd_customer_flow'])
        return self


class QueryGdPoentialResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        msg: str = None,
        code: int = None,
        request_link_id: str = None,
        data: GdPotentialCustomerInfo = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 返回消息
        self.msg = msg
        # 返回编码，值为10000表示成功，其余值表示失败
        self.code = code
        # 随机返回id
        self.request_link_id = request_link_id
        # 返回数据
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
        if self.msg is not None:
            result['msg'] = self.msg
        if self.code is not None:
            result['code'] = self.code
        if self.request_link_id is not None:
            result['request_link_id'] = self.request_link_id
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
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('request_link_id') is not None:
            self.request_link_id = m.get('request_link_id')
        if m.get('data') is not None:
            temp_model = GdPotentialCustomerInfo()
            self.data = temp_model.from_map(m['data'])
        return self


