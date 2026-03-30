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


class BatteryReportData(TeaModel):
    def __init__(
        self,
        vin_code: str = None,
        evaluate_time: str = None,
        current_soh: str = None,
        soh_lv_str: str = None,
        volume_score_recession: str = None,
        volume_score_recession_lv_str: str = None,
        volume_score_recession_narrate: str = None,
        safeguard_status: int = None,
        safeguard_end_time: str = None,
        initial_soh: str = None,
        initial_soh_evaluate_time: str = None,
        initial_charge_seq: str = None,
        sageguard_max_sub_soh: str = None,
        compensation_triggered: bool = None,
        year_soh_title: List[str] = None,
        cur_estimate_year_soh: List[str] = None,
        peer_estimate_year_soh: List[str] = None,
        battery_manufacturer: str = None,
        nominal_energy: str = None,
        rate_capacity: str = None,
        battery_type: str = None,
        manufacturer_date: str = None,
        rights_desc: str = None,
        right_status: str = None,
        soh_suggest: List[str] = None,
    ):
        # VIN码
        self.vin_code = vin_code
        # 评估时间，报告生成时间 yyyy-MM-dd HH:mm:ss
        self.evaluate_time = evaluate_time
        # 当前 SOH（%），数值 0-100
        self.current_soh = current_soh
        # SOH 评级：优秀 100-95 良好 95-90 中等 90-85 较差 85-80 差 80 以下
        self.soh_lv_str = soh_lv_str
        # 电池衰退水平值
        self.volume_score_recession = volume_score_recession
        # 安全风险水平：低 较低 较高 高
        self.volume_score_recession_lv_str = volume_score_recession_lv_str
        # 安全风险水平解读文案
        self.volume_score_recession_narrate = volume_score_recession_narrate
        # 保障状态 0：未保障 1：保障中 2：保障结束
        self.safeguard_status = safeguard_status
        # 保障截止期 yyyy-MM-dd HH:mm:ss
        self.safeguard_end_time = safeguard_end_time
        # 本轮首检 SOH（%）数值 0-100
        self.initial_soh = initial_soh
        # 本轮首检 评估时间 yyyy-MM-dd HH:mm:ss
        self.initial_soh_evaluate_time = initial_soh_evaluate_time
        # 本轮首检 充电单号
        self.initial_charge_seq = initial_charge_seq
        # 触发赔付 SOH（%），数值 0-100
        self.sageguard_max_sub_soh = sageguard_max_sub_soh
        # 是否触发赔付，当前 SOH≤触发赔付 SOH 时为 true
        self.compensation_triggered = compensation_triggered
        # SOH 衰退预测-X 轴标题（年）
        self.year_soh_title = year_soh_title
        # 本车电池衰退预测，逐年 SOH（%）
        self.cur_estimate_year_soh = cur_estimate_year_soh
        # 同类型车电池衰退预测，逐年 SOH（%）
        self.peer_estimate_year_soh = peer_estimate_year_soh
        # 电池厂商
        self.battery_manufacturer = battery_manufacturer
        # 标称能量，单位 kWh
        self.nominal_energy = nominal_energy
        # 标称容量，单位 Ah
        self.rate_capacity = rate_capacity
        # 电池类型
        self.battery_type = battery_type
        # 车辆生产年份
        self.manufacturer_date = manufacturer_date
        # 权益说明文案
        self.rights_desc = rights_desc
        # 权益说明-状态
        self.right_status = right_status
        # 电池健康度-建议
        self.soh_suggest = soh_suggest

    def validate(self):
        self.validate_required(self.vin_code, 'vin_code')
        self.validate_required(self.evaluate_time, 'evaluate_time')
        self.validate_required(self.current_soh, 'current_soh')
        self.validate_required(self.soh_lv_str, 'soh_lv_str')
        self.validate_required(self.volume_score_recession, 'volume_score_recession')
        self.validate_required(self.volume_score_recession_lv_str, 'volume_score_recession_lv_str')
        self.validate_required(self.volume_score_recession_narrate, 'volume_score_recession_narrate')
        self.validate_required(self.safeguard_status, 'safeguard_status')
        self.validate_required(self.safeguard_end_time, 'safeguard_end_time')
        self.validate_required(self.initial_soh, 'initial_soh')
        self.validate_required(self.initial_soh_evaluate_time, 'initial_soh_evaluate_time')
        self.validate_required(self.initial_charge_seq, 'initial_charge_seq')
        self.validate_required(self.sageguard_max_sub_soh, 'sageguard_max_sub_soh')
        self.validate_required(self.compensation_triggered, 'compensation_triggered')
        self.validate_required(self.year_soh_title, 'year_soh_title')
        self.validate_required(self.cur_estimate_year_soh, 'cur_estimate_year_soh')
        self.validate_required(self.peer_estimate_year_soh, 'peer_estimate_year_soh')
        self.validate_required(self.battery_manufacturer, 'battery_manufacturer')
        self.validate_required(self.nominal_energy, 'nominal_energy')
        self.validate_required(self.rate_capacity, 'rate_capacity')
        self.validate_required(self.battery_type, 'battery_type')
        self.validate_required(self.manufacturer_date, 'manufacturer_date')
        self.validate_required(self.rights_desc, 'rights_desc')
        self.validate_required(self.right_status, 'right_status')
        self.validate_required(self.soh_suggest, 'soh_suggest')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.vin_code is not None:
            result['vin_code'] = self.vin_code
        if self.evaluate_time is not None:
            result['evaluate_time'] = self.evaluate_time
        if self.current_soh is not None:
            result['current_soh'] = self.current_soh
        if self.soh_lv_str is not None:
            result['soh_lv_str'] = self.soh_lv_str
        if self.volume_score_recession is not None:
            result['volume_score_recession'] = self.volume_score_recession
        if self.volume_score_recession_lv_str is not None:
            result['volume_score_recession_lv_str'] = self.volume_score_recession_lv_str
        if self.volume_score_recession_narrate is not None:
            result['volume_score_recession_narrate'] = self.volume_score_recession_narrate
        if self.safeguard_status is not None:
            result['safeguard_status'] = self.safeguard_status
        if self.safeguard_end_time is not None:
            result['safeguard_end_time'] = self.safeguard_end_time
        if self.initial_soh is not None:
            result['initial_soh'] = self.initial_soh
        if self.initial_soh_evaluate_time is not None:
            result['initial_soh_evaluate_time'] = self.initial_soh_evaluate_time
        if self.initial_charge_seq is not None:
            result['initial_charge_seq'] = self.initial_charge_seq
        if self.sageguard_max_sub_soh is not None:
            result['sageguard_max_sub_soh'] = self.sageguard_max_sub_soh
        if self.compensation_triggered is not None:
            result['compensation_triggered'] = self.compensation_triggered
        if self.year_soh_title is not None:
            result['year_soh_title'] = self.year_soh_title
        if self.cur_estimate_year_soh is not None:
            result['cur_estimate_year_soh'] = self.cur_estimate_year_soh
        if self.peer_estimate_year_soh is not None:
            result['peer_estimate_year_soh'] = self.peer_estimate_year_soh
        if self.battery_manufacturer is not None:
            result['battery_manufacturer'] = self.battery_manufacturer
        if self.nominal_energy is not None:
            result['nominal_energy'] = self.nominal_energy
        if self.rate_capacity is not None:
            result['rate_capacity'] = self.rate_capacity
        if self.battery_type is not None:
            result['battery_type'] = self.battery_type
        if self.manufacturer_date is not None:
            result['manufacturer_date'] = self.manufacturer_date
        if self.rights_desc is not None:
            result['rights_desc'] = self.rights_desc
        if self.right_status is not None:
            result['right_status'] = self.right_status
        if self.soh_suggest is not None:
            result['soh_suggest'] = self.soh_suggest
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('vin_code') is not None:
            self.vin_code = m.get('vin_code')
        if m.get('evaluate_time') is not None:
            self.evaluate_time = m.get('evaluate_time')
        if m.get('current_soh') is not None:
            self.current_soh = m.get('current_soh')
        if m.get('soh_lv_str') is not None:
            self.soh_lv_str = m.get('soh_lv_str')
        if m.get('volume_score_recession') is not None:
            self.volume_score_recession = m.get('volume_score_recession')
        if m.get('volume_score_recession_lv_str') is not None:
            self.volume_score_recession_lv_str = m.get('volume_score_recession_lv_str')
        if m.get('volume_score_recession_narrate') is not None:
            self.volume_score_recession_narrate = m.get('volume_score_recession_narrate')
        if m.get('safeguard_status') is not None:
            self.safeguard_status = m.get('safeguard_status')
        if m.get('safeguard_end_time') is not None:
            self.safeguard_end_time = m.get('safeguard_end_time')
        if m.get('initial_soh') is not None:
            self.initial_soh = m.get('initial_soh')
        if m.get('initial_soh_evaluate_time') is not None:
            self.initial_soh_evaluate_time = m.get('initial_soh_evaluate_time')
        if m.get('initial_charge_seq') is not None:
            self.initial_charge_seq = m.get('initial_charge_seq')
        if m.get('sageguard_max_sub_soh') is not None:
            self.sageguard_max_sub_soh = m.get('sageguard_max_sub_soh')
        if m.get('compensation_triggered') is not None:
            self.compensation_triggered = m.get('compensation_triggered')
        if m.get('year_soh_title') is not None:
            self.year_soh_title = m.get('year_soh_title')
        if m.get('cur_estimate_year_soh') is not None:
            self.cur_estimate_year_soh = m.get('cur_estimate_year_soh')
        if m.get('peer_estimate_year_soh') is not None:
            self.peer_estimate_year_soh = m.get('peer_estimate_year_soh')
        if m.get('battery_manufacturer') is not None:
            self.battery_manufacturer = m.get('battery_manufacturer')
        if m.get('nominal_energy') is not None:
            self.nominal_energy = m.get('nominal_energy')
        if m.get('rate_capacity') is not None:
            self.rate_capacity = m.get('rate_capacity')
        if m.get('battery_type') is not None:
            self.battery_type = m.get('battery_type')
        if m.get('manufacturer_date') is not None:
            self.manufacturer_date = m.get('manufacturer_date')
        if m.get('rights_desc') is not None:
            self.rights_desc = m.get('rights_desc')
        if m.get('right_status') is not None:
            self.right_status = m.get('right_status')
        if m.get('soh_suggest') is not None:
            self.soh_suggest = m.get('soh_suggest')
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


class BatteryReportResult(TeaModel):
    def __init__(
        self,
        order_id: str = None,
        guarantee_code: str = None,
        current_start_charge_seq: str = None,
        charge: bool = None,
        check_type: int = None,
        report_data: BatteryReportData = None,
    ):
        # 订单号 (可使用该 ID 将报告转图片)
        self.order_id = order_id
        # 保障码，VIN 在 7 天内首次检测时生成，每轮保障采用同一保障码
        self.guarantee_code = guarantee_code
        # 当前充电单号
        self.current_start_charge_seq = current_start_charge_seq
        # 是否计费
        self.charge = charge
        # 检测类型 6601：首检 6602：复核
        self.check_type = check_type
        # 报告数据
        self.report_data = report_data

    def validate(self):
        self.validate_required(self.order_id, 'order_id')
        self.validate_required(self.guarantee_code, 'guarantee_code')
        self.validate_required(self.current_start_charge_seq, 'current_start_charge_seq')
        self.validate_required(self.charge, 'charge')
        self.validate_required(self.check_type, 'check_type')
        self.validate_required(self.report_data, 'report_data')
        if self.report_data:
            self.report_data.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.order_id is not None:
            result['order_id'] = self.order_id
        if self.guarantee_code is not None:
            result['guarantee_code'] = self.guarantee_code
        if self.current_start_charge_seq is not None:
            result['current_start_charge_seq'] = self.current_start_charge_seq
        if self.charge is not None:
            result['charge'] = self.charge
        if self.check_type is not None:
            result['check_type'] = self.check_type
        if self.report_data is not None:
            result['report_data'] = self.report_data.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('order_id') is not None:
            self.order_id = m.get('order_id')
        if m.get('guarantee_code') is not None:
            self.guarantee_code = m.get('guarantee_code')
        if m.get('current_start_charge_seq') is not None:
            self.current_start_charge_seq = m.get('current_start_charge_seq')
        if m.get('charge') is not None:
            self.charge = m.get('charge')
        if m.get('check_type') is not None:
            self.check_type = m.get('check_type')
        if m.get('report_data') is not None:
            temp_model = BatteryReportData()
            self.report_data = temp_model.from_map(m['report_data'])
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


class BatteryReport(TeaModel):
    def __init__(
        self,
        start_charge_seq: str = None,
        vin_code: str = None,
        publication_no: str = None,
        total_power: str = None,
        total_charge_soc: str = None,
        start_soc: str = None,
        end_soc: str = None,
        nominal_energy: str = None,
        city_id: str = None,
        register_date: str = None,
    ):
        # 充电单号，最大长度/规则：32
        self.start_charge_seq = start_charge_seq
        # VIN，最大长度/规则：17位
        self.vin_code = vin_code
        # 公告号，最大长度/规则36
        self.publication_no = publication_no
        # 本次累积充电量，单位kWh；最大长度/规则：整数位<=10,小数位<=2
        self.total_power = total_power
        # 本次累积充入SOC（%）；最大长度/规则：0-100,小数位<=2
        self.total_charge_soc = total_charge_soc
        # 本次充电开始SOC(%)；最大长度/规则：0-100,小数位<=2
        self.start_soc = start_soc
        # 本次充电截止SOC(%)；最大长度/规则：0-100,小数位<=2
        self.end_soc = end_soc
        # 标称能量，单位kWh；最大长度/规则：0-1000,小数位<=2
        self.nominal_energy = nominal_energy
        # 充电城市ID；最大长度/规则：30
        self.city_id = city_id
        # 注册日期；最大长度/规则：yyyy-MM-dd
        self.register_date = register_date

    def validate(self):
        self.validate_required(self.start_charge_seq, 'start_charge_seq')
        self.validate_required(self.vin_code, 'vin_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.start_charge_seq is not None:
            result['start_charge_seq'] = self.start_charge_seq
        if self.vin_code is not None:
            result['vin_code'] = self.vin_code
        if self.publication_no is not None:
            result['publication_no'] = self.publication_no
        if self.total_power is not None:
            result['total_power'] = self.total_power
        if self.total_charge_soc is not None:
            result['total_charge_soc'] = self.total_charge_soc
        if self.start_soc is not None:
            result['start_soc'] = self.start_soc
        if self.end_soc is not None:
            result['end_soc'] = self.end_soc
        if self.nominal_energy is not None:
            result['nominal_energy'] = self.nominal_energy
        if self.city_id is not None:
            result['city_id'] = self.city_id
        if self.register_date is not None:
            result['register_date'] = self.register_date
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('start_charge_seq') is not None:
            self.start_charge_seq = m.get('start_charge_seq')
        if m.get('vin_code') is not None:
            self.vin_code = m.get('vin_code')
        if m.get('publication_no') is not None:
            self.publication_no = m.get('publication_no')
        if m.get('total_power') is not None:
            self.total_power = m.get('total_power')
        if m.get('total_charge_soc') is not None:
            self.total_charge_soc = m.get('total_charge_soc')
        if m.get('start_soc') is not None:
            self.start_soc = m.get('start_soc')
        if m.get('end_soc') is not None:
            self.end_soc = m.get('end_soc')
        if m.get('nominal_energy') is not None:
            self.nominal_energy = m.get('nominal_energy')
        if m.get('city_id') is not None:
            self.city_id = m.get('city_id')
        if m.get('register_date') is not None:
            self.register_date = m.get('register_date')
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


class QueryBatteryReportRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        battery_report: BatteryReport = None,
        operator_platform: str = None,
        station_name: str = None,
        station_id: str = None,
        pile_id: str = None,
        gun_no: int = None,
        charge_order_no: str = None,
        charge_power: str = None,
        service_fee: str = None,
        electricity_fee: str = None,
        charge_start_time: str = None,
        charge_end_time: str = None,
        scene_code: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 充电报告
        self.battery_report = battery_report
        # 桩所属运营平台
        self.operator_platform = operator_platform
        # 场站名称
        self.station_name = station_name
        # 场站ID
        self.station_id = station_id
        # 桩ID
        self.pile_id = pile_id
        # 枪序号（充电端口号）
        self.gun_no = gun_no
        # 充电订单号
        self.charge_order_no = charge_order_no
        # 充电量，单位kWh
        self.charge_power = charge_power
        # 服务费，单位元
        self.service_fee = service_fee
        # 电费，单位元
        self.electricity_fee = electricity_fee
        # 充电开始时间
        self.charge_start_time = charge_start_time
        # 充电结束时间
        self.charge_end_time = charge_end_time
        # 租户场景码
        self.scene_code = scene_code

    def validate(self):
        self.validate_required(self.battery_report, 'battery_report')
        if self.battery_report:
            self.battery_report.validate()
        self.validate_required(self.operator_platform, 'operator_platform')
        self.validate_required(self.station_name, 'station_name')
        self.validate_required(self.station_id, 'station_id')
        self.validate_required(self.pile_id, 'pile_id')
        self.validate_required(self.gun_no, 'gun_no')
        self.validate_required(self.charge_order_no, 'charge_order_no')
        self.validate_required(self.charge_power, 'charge_power')
        self.validate_required(self.service_fee, 'service_fee')
        self.validate_required(self.electricity_fee, 'electricity_fee')
        self.validate_required(self.charge_start_time, 'charge_start_time')
        self.validate_required(self.charge_end_time, 'charge_end_time')
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
        if self.battery_report is not None:
            result['battery_report'] = self.battery_report.to_map()
        if self.operator_platform is not None:
            result['operator_platform'] = self.operator_platform
        if self.station_name is not None:
            result['station_name'] = self.station_name
        if self.station_id is not None:
            result['station_id'] = self.station_id
        if self.pile_id is not None:
            result['pile_id'] = self.pile_id
        if self.gun_no is not None:
            result['gun_no'] = self.gun_no
        if self.charge_order_no is not None:
            result['charge_order_no'] = self.charge_order_no
        if self.charge_power is not None:
            result['charge_power'] = self.charge_power
        if self.service_fee is not None:
            result['service_fee'] = self.service_fee
        if self.electricity_fee is not None:
            result['electricity_fee'] = self.electricity_fee
        if self.charge_start_time is not None:
            result['charge_start_time'] = self.charge_start_time
        if self.charge_end_time is not None:
            result['charge_end_time'] = self.charge_end_time
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('battery_report') is not None:
            temp_model = BatteryReport()
            self.battery_report = temp_model.from_map(m['battery_report'])
        if m.get('operator_platform') is not None:
            self.operator_platform = m.get('operator_platform')
        if m.get('station_name') is not None:
            self.station_name = m.get('station_name')
        if m.get('station_id') is not None:
            self.station_id = m.get('station_id')
        if m.get('pile_id') is not None:
            self.pile_id = m.get('pile_id')
        if m.get('gun_no') is not None:
            self.gun_no = m.get('gun_no')
        if m.get('charge_order_no') is not None:
            self.charge_order_no = m.get('charge_order_no')
        if m.get('charge_power') is not None:
            self.charge_power = m.get('charge_power')
        if m.get('service_fee') is not None:
            self.service_fee = m.get('service_fee')
        if m.get('electricity_fee') is not None:
            self.electricity_fee = m.get('electricity_fee')
        if m.get('charge_start_time') is not None:
            self.charge_start_time = m.get('charge_start_time')
        if m.get('charge_end_time') is not None:
            self.charge_end_time = m.get('charge_end_time')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        return self


class QueryBatteryReportResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        code: str = None,
        msg: str = None,
        result: BatteryReportResult = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 成功或失败的编码
        self.code = code
        # 成功或失败的提示语
        self.msg = msg
        # 返回数据（code=100时返回）
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
        if self.code is not None:
            result['code'] = self.code
        if self.msg is not None:
            result['msg'] = self.msg
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
        if m.get('code') is not None:
            self.code = m.get('code')
        if m.get('msg') is not None:
            self.msg = m.get('msg')
        if m.get('result') is not None:
            temp_model = BatteryReportResult()
            self.result = temp_model.from_map(m['result'])
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


