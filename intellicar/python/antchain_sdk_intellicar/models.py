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


