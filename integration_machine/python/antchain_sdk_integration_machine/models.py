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


class SceneInfo(TeaModel):
    def __init__(
        self,
        scene_name: str = None,
        scene_code: str = None,
    ):
        # 场所名称
        self.scene_name = scene_name
        # 场所码
        self.scene_code = scene_code

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.scene_name is not None:
            result['scene_name'] = self.scene_name
        if self.scene_code is not None:
            result['scene_code'] = self.scene_code
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('scene_name') is not None:
            self.scene_name = m.get('scene_name')
        if m.get('scene_code') is not None:
            self.scene_code = m.get('scene_code')
        return self


class TravelInfo(TeaModel):
    def __init__(
        self,
        travel_code: str = None,
        travel_factor: str = None,
    ):
        # 行程码信息
        # 1:没去过疫情区，绿码;
        # 2:去过疫情区，红码;
        # 3:其他，黄码;
        # 0:行程信息不全;
        # -1:查询失败
        self.travel_code = travel_code
        # 行程码异常原因
        self.travel_factor = travel_factor

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.travel_code is not None:
            result['travel_code'] = self.travel_code
        if self.travel_factor is not None:
            result['travel_factor'] = self.travel_factor
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('travel_code') is not None:
            self.travel_code = m.get('travel_code')
        if m.get('travel_factor') is not None:
            self.travel_factor = m.get('travel_factor')
        return self


class AntigenInfo(TeaModel):
    def __init__(
        self,
        antigen_result: str = None,
        antigen_timestamp: int = None,
    ):
        # 抗原检测状态
        self.antigen_result = antigen_result
        # 抗原检测时间戳
        self.antigen_timestamp = antigen_timestamp

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.antigen_result is not None:
            result['antigen_result'] = self.antigen_result
        if self.antigen_timestamp is not None:
            result['antigen_timestamp'] = self.antigen_timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('antigen_result') is not None:
            self.antigen_result = m.get('antigen_result')
        if m.get('antigen_timestamp') is not None:
            self.antigen_timestamp = m.get('antigen_timestamp')
        return self


class NucleicAcidInfo(TeaModel):
    def __init__(
        self,
        report_type: str = None,
        report_result: str = None,
        report_organization: str = None,
        report_timestamp: int = None,
    ):
        # 检测类型
        self.report_type = report_type
        # 检测结果
        self.report_result = report_result
        # 检测机构
        self.report_organization = report_organization
        # 检测时间戳(单位: ms)
        self.report_timestamp = report_timestamp

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.report_type is not None:
            result['report_type'] = self.report_type
        if self.report_result is not None:
            result['report_result'] = self.report_result
        if self.report_organization is not None:
            result['report_organization'] = self.report_organization
        if self.report_timestamp is not None:
            result['report_timestamp'] = self.report_timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('report_type') is not None:
            self.report_type = m.get('report_type')
        if m.get('report_result') is not None:
            self.report_result = m.get('report_result')
        if m.get('report_organization') is not None:
            self.report_organization = m.get('report_organization')
        if m.get('report_timestamp') is not None:
            self.report_timestamp = m.get('report_timestamp')
        return self


class VaccinationInfo(TeaModel):
    def __init__(
        self,
        vaccination_code: str = None,
        vaccination_desc: str = None,
        vaccination_timestamp: int = None,
    ):
        # 疫苗接种信息：
        # 0:查询失败
        # 1:未接种
        # 2:已接种一针
        # 3:完成接种
        self.vaccination_code = vaccination_code
        # 疫苗接种信息
        self.vaccination_desc = vaccination_desc
        # 疫苗接种时间戳（单位：ms）
        self.vaccination_timestamp = vaccination_timestamp

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.vaccination_code is not None:
            result['vaccination_code'] = self.vaccination_code
        if self.vaccination_desc is not None:
            result['vaccination_desc'] = self.vaccination_desc
        if self.vaccination_timestamp is not None:
            result['vaccination_timestamp'] = self.vaccination_timestamp
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('vaccination_code') is not None:
            self.vaccination_code = m.get('vaccination_code')
        if m.get('vaccination_desc') is not None:
            self.vaccination_desc = m.get('vaccination_desc')
        if m.get('vaccination_timestamp') is not None:
            self.vaccination_timestamp = m.get('vaccination_timestamp')
        return self


class AntigenInformation(TeaModel):
    def __init__(
        self,
        antigen_result: str = None,
        antigen_time: str = None,
    ):
        # 抗原结果
        self.antigen_result = antigen_result
        # 抗原时间
        self.antigen_time = antigen_time

    def validate(self):
        self.validate_required(self.antigen_result, 'antigen_result')
        self.validate_required(self.antigen_time, 'antigen_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.antigen_result is not None:
            result['antigen_result'] = self.antigen_result
        if self.antigen_time is not None:
            result['antigen_time'] = self.antigen_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('antigen_result') is not None:
            self.antigen_result = m.get('antigen_result')
        if m.get('antigen_time') is not None:
            self.antigen_time = m.get('antigen_time')
        return self


class NucleicAcidInformation(TeaModel):
    def __init__(
        self,
        nucleic_acid_result: str = None,
        nucleic_acid_time: str = None,
    ):
        # 核酸结果
        self.nucleic_acid_result = nucleic_acid_result
        # 核酸时间
        self.nucleic_acid_time = nucleic_acid_time

    def validate(self):
        self.validate_required(self.nucleic_acid_result, 'nucleic_acid_result')
        self.validate_required(self.nucleic_acid_time, 'nucleic_acid_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.nucleic_acid_result is not None:
            result['nucleic_acid_result'] = self.nucleic_acid_result
        if self.nucleic_acid_time is not None:
            result['nucleic_acid_time'] = self.nucleic_acid_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('nucleic_acid_result') is not None:
            self.nucleic_acid_result = m.get('nucleic_acid_result')
        if m.get('nucleic_acid_time') is not None:
            self.nucleic_acid_time = m.get('nucleic_acid_time')
        return self


class VaccinationInformation(TeaModel):
    def __init__(
        self,
        vaccination_status: str = None,
        vaccination_time: str = None,
    ):
        # 疫苗接种状态(0查询失败 1未接种 2已接种一针 3完成接种)
        self.vaccination_status = vaccination_status
        # 疫苗接种时间
        self.vaccination_time = vaccination_time

    def validate(self):
        self.validate_required(self.vaccination_status, 'vaccination_status')
        self.validate_required(self.vaccination_time, 'vaccination_time')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.vaccination_status is not None:
            result['vaccination_status'] = self.vaccination_status
        if self.vaccination_time is not None:
            result['vaccination_time'] = self.vaccination_time
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('vaccination_status') is not None:
            self.vaccination_status = m.get('vaccination_status')
        if m.get('vaccination_time') is not None:
            self.vaccination_time = m.get('vaccination_time')
        return self


class ArgsNameValue(TeaModel):
    def __init__(
        self,
        args_name: str = None,
        args_key: str = None,
        args_value: str = None,
        args_mark: str = None,
    ):
        # 设备参数名称
        self.args_name = args_name
        # 设备参数key
        self.args_key = args_key
        # 设备参数value
        self.args_value = args_value
        # 设备参数标识(ip,mac,bizid)
        self.args_mark = args_mark

    def validate(self):
        self.validate_required(self.args_key, 'args_key')
        self.validate_required(self.args_value, 'args_value')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.args_name is not None:
            result['args_name'] = self.args_name
        if self.args_key is not None:
            result['args_key'] = self.args_key
        if self.args_value is not None:
            result['args_value'] = self.args_value
        if self.args_mark is not None:
            result['args_mark'] = self.args_mark
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('args_name') is not None:
            self.args_name = m.get('args_name')
        if m.get('args_key') is not None:
            self.args_key = m.get('args_key')
        if m.get('args_value') is not None:
            self.args_value = m.get('args_value')
        if m.get('args_mark') is not None:
            self.args_mark = m.get('args_mark')
        return self


class SceneInformation(TeaModel):
    def __init__(
        self,
        scene_address: str = None,
        scene_id: str = None,
    ):
        # 场所地址
        self.scene_address = scene_address
        # 场所ID
        self.scene_id = scene_id

    def validate(self):
        self.validate_required(self.scene_address, 'scene_address')
        self.validate_required(self.scene_id, 'scene_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.scene_address is not None:
            result['scene_address'] = self.scene_address
        if self.scene_id is not None:
            result['scene_id'] = self.scene_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('scene_address') is not None:
            self.scene_address = m.get('scene_address')
        if m.get('scene_id') is not None:
            self.scene_id = m.get('scene_id')
        return self


class HealthInfoLog(TeaModel):
    def __init__(
        self,
        cert_no: str = None,
        cert_name: str = None,
        health_code: str = None,
        temperature: str = None,
        travel_info: TravelInfo = None,
        nucleic_acid_info: NucleicAcidInfo = None,
        vaccination_info: VaccinationInfo = None,
        antigen_info: AntigenInfo = None,
        scene_info: SceneInfo = None,
        channel_pass_state: str = None,
        longitude: str = None,
        latitude: str = None,
        pass_mode: str = None,
        pass_duration: str = None,
        pass_time: str = None,
        pass_result: str = None,
    ):
        # 身份证号
        self.cert_no = cert_no
        # 姓名
        self.cert_name = cert_name
        # 健康码颜色(绿色:1,黄码:2,红码:3,灰码:4)
        self.health_code = health_code
        # 体温
        self.temperature = temperature
        # 行程信息
        # 
        self.travel_info = travel_info
        # 核酸信息
        # 
        self.nucleic_acid_info = nucleic_acid_info
        # 疫苗信息
        # 
        self.vaccination_info = vaccination_info
        # 抗原信息
        # 
        self.antigen_info = antigen_info
        # 场所信息
        # 
        self.scene_info = scene_info
        # 数据源通行状态 0:禁止通行,1:允许通行
        # 
        self.channel_pass_state = channel_pass_state
        # 经度
        # 
        self.longitude = longitude
        # 纬度
        self.latitude = latitude
        # 通行方式（1:自动刷脸, 2:刷证非1:1, 3:刷证1:1, 4:反扫, 5:刷奥智定制卡, 6:手动刷脸, 99:刷苏州市民卡
        # 
        self.pass_mode = pass_mode
        # 通行时长(单位:毫秒)
        # 
        self.pass_duration = pass_duration
        # 通行时间
        # 
        self.pass_time = pass_time
        # 通行结果(0:禁止通行,1:允许通行)
        # 
        self.pass_result = pass_result

    def validate(self):
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.cert_name, 'cert_name')
        self.validate_required(self.health_code, 'health_code')
        self.validate_required(self.temperature, 'temperature')
        self.validate_required(self.travel_info, 'travel_info')
        if self.travel_info:
            self.travel_info.validate()
        self.validate_required(self.nucleic_acid_info, 'nucleic_acid_info')
        if self.nucleic_acid_info:
            self.nucleic_acid_info.validate()
        self.validate_required(self.vaccination_info, 'vaccination_info')
        if self.vaccination_info:
            self.vaccination_info.validate()
        self.validate_required(self.antigen_info, 'antigen_info')
        if self.antigen_info:
            self.antigen_info.validate()
        self.validate_required(self.scene_info, 'scene_info')
        if self.scene_info:
            self.scene_info.validate()
        self.validate_required(self.channel_pass_state, 'channel_pass_state')
        self.validate_required(self.longitude, 'longitude')
        self.validate_required(self.latitude, 'latitude')
        self.validate_required(self.pass_mode, 'pass_mode')
        self.validate_required(self.pass_duration, 'pass_duration')
        self.validate_required(self.pass_time, 'pass_time')
        self.validate_required(self.pass_result, 'pass_result')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.cert_name is not None:
            result['cert_name'] = self.cert_name
        if self.health_code is not None:
            result['health_code'] = self.health_code
        if self.temperature is not None:
            result['temperature'] = self.temperature
        if self.travel_info is not None:
            result['travel_info'] = self.travel_info.to_map()
        if self.nucleic_acid_info is not None:
            result['nucleic_acid_info'] = self.nucleic_acid_info.to_map()
        if self.vaccination_info is not None:
            result['vaccination_info'] = self.vaccination_info.to_map()
        if self.antigen_info is not None:
            result['antigen_info'] = self.antigen_info.to_map()
        if self.scene_info is not None:
            result['scene_info'] = self.scene_info.to_map()
        if self.channel_pass_state is not None:
            result['channel_pass_state'] = self.channel_pass_state
        if self.longitude is not None:
            result['longitude'] = self.longitude
        if self.latitude is not None:
            result['latitude'] = self.latitude
        if self.pass_mode is not None:
            result['pass_mode'] = self.pass_mode
        if self.pass_duration is not None:
            result['pass_duration'] = self.pass_duration
        if self.pass_time is not None:
            result['pass_time'] = self.pass_time
        if self.pass_result is not None:
            result['pass_result'] = self.pass_result
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('cert_name') is not None:
            self.cert_name = m.get('cert_name')
        if m.get('health_code') is not None:
            self.health_code = m.get('health_code')
        if m.get('temperature') is not None:
            self.temperature = m.get('temperature')
        if m.get('travel_info') is not None:
            temp_model = TravelInfo()
            self.travel_info = temp_model.from_map(m['travel_info'])
        if m.get('nucleic_acid_info') is not None:
            temp_model = NucleicAcidInfo()
            self.nucleic_acid_info = temp_model.from_map(m['nucleic_acid_info'])
        if m.get('vaccination_info') is not None:
            temp_model = VaccinationInfo()
            self.vaccination_info = temp_model.from_map(m['vaccination_info'])
        if m.get('antigen_info') is not None:
            temp_model = AntigenInfo()
            self.antigen_info = temp_model.from_map(m['antigen_info'])
        if m.get('scene_info') is not None:
            temp_model = SceneInfo()
            self.scene_info = temp_model.from_map(m['scene_info'])
        if m.get('channel_pass_state') is not None:
            self.channel_pass_state = m.get('channel_pass_state')
        if m.get('longitude') is not None:
            self.longitude = m.get('longitude')
        if m.get('latitude') is not None:
            self.latitude = m.get('latitude')
        if m.get('pass_mode') is not None:
            self.pass_mode = m.get('pass_mode')
        if m.get('pass_duration') is not None:
            self.pass_duration = m.get('pass_duration')
        if m.get('pass_time') is not None:
            self.pass_time = m.get('pass_time')
        if m.get('pass_result') is not None:
            self.pass_result = m.get('pass_result')
        return self


class HealthInfo(TeaModel):
    def __init__(
        self,
        health_code: str = None,
        health_factor: str = None,
    ):
        # 健康码编码：
        # 1:绿色 ，
        # 2:黄色 ，
        # 3:红色 ，
        # 4.灰码 。
        self.health_code = health_code
        # 健康码红色原因
        self.health_factor = health_factor

    def validate(self):
        pass

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.health_code is not None:
            result['health_code'] = self.health_code
        if self.health_factor is not None:
            result['health_factor'] = self.health_factor
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('health_code') is not None:
            self.health_code = m.get('health_code')
        if m.get('health_factor') is not None:
            self.health_factor = m.get('health_factor')
        return self


class HealthStatistics(TeaModel):
    def __init__(
        self,
        statistics_date: str = None,
        total_count: int = None,
        cert_count: int = None,
        face_count: int = None,
        inverse_count: int = None,
        pass_count: int = None,
        stop_count: int = None,
    ):
        # 统计日期
        self.statistics_date = statistics_date
        # 通行总数
        self.total_count = total_count
        # 刷证数
        self.cert_count = cert_count
        # 刷脸数
        self.face_count = face_count
        # 二维码反扫数
        self.inverse_count = inverse_count
        # 正常通行数
        self.pass_count = pass_count
        # 禁止通行数
        self.stop_count = stop_count

    def validate(self):
        self.validate_required(self.statistics_date, 'statistics_date')
        self.validate_required(self.total_count, 'total_count')
        self.validate_required(self.cert_count, 'cert_count')
        self.validate_required(self.face_count, 'face_count')
        self.validate_required(self.inverse_count, 'inverse_count')
        self.validate_required(self.pass_count, 'pass_count')
        self.validate_required(self.stop_count, 'stop_count')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.statistics_date is not None:
            result['statistics_date'] = self.statistics_date
        if self.total_count is not None:
            result['total_count'] = self.total_count
        if self.cert_count is not None:
            result['cert_count'] = self.cert_count
        if self.face_count is not None:
            result['face_count'] = self.face_count
        if self.inverse_count is not None:
            result['inverse_count'] = self.inverse_count
        if self.pass_count is not None:
            result['pass_count'] = self.pass_count
        if self.stop_count is not None:
            result['stop_count'] = self.stop_count
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('statistics_date') is not None:
            self.statistics_date = m.get('statistics_date')
        if m.get('total_count') is not None:
            self.total_count = m.get('total_count')
        if m.get('cert_count') is not None:
            self.cert_count = m.get('cert_count')
        if m.get('face_count') is not None:
            self.face_count = m.get('face_count')
        if m.get('inverse_count') is not None:
            self.inverse_count = m.get('inverse_count')
        if m.get('pass_count') is not None:
            self.pass_count = m.get('pass_count')
        if m.get('stop_count') is not None:
            self.stop_count = m.get('stop_count')
        return self


class TravelInformation(TeaModel):
    def __init__(
        self,
        travel_code: str = None,
        travel_path: str = None,
    ):
        # 1:没去过疫情区，绿码;
        # 2:去过疫情区，红码;
        # 3:其他，黄码;
        # 0:行程信息不全;
        # -1查询失败
        self.travel_code = travel_code
        # 行程途径地
        self.travel_path = travel_path

    def validate(self):
        self.validate_required(self.travel_code, 'travel_code')
        self.validate_required(self.travel_path, 'travel_path')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.travel_code is not None:
            result['travel_code'] = self.travel_code
        if self.travel_path is not None:
            result['travel_path'] = self.travel_path
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('travel_code') is not None:
            self.travel_code = m.get('travel_code')
        if m.get('travel_path') is not None:
            self.travel_path = m.get('travel_path')
        return self


class QueryHealthinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        serial_no: str = None,
        corp_name: str = None,
        name: str = None,
        cert_no: str = None,
        health_types: str = None,
        pass_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备SN
        self.serial_no = serial_no
        # 设备厂商
        self.corp_name = corp_name
        # 被查询人姓名
        self.name = name
        # 被查询人身份证号
        self.cert_no = cert_no
        # 防疫信息类型,枚举值如下：
        # 健康信息 health ,
        # 疫苗信息 vaccination ,
        # 核酸信息 nucleicAcid ,
        # 行程信息 travel ,
        # 抗原信息 antigen ,
        # 场景信息  scene .
        # 需要有多项信息类型时，用"|"分隔开。eg: "health|nucleicAcid"
        self.health_types = health_types
        # 通行记录ID
        self.pass_id = pass_id

    def validate(self):
        self.validate_required(self.serial_no, 'serial_no')
        self.validate_required(self.corp_name, 'corp_name')
        self.validate_required(self.name, 'name')
        self.validate_required(self.cert_no, 'cert_no')
        self.validate_required(self.health_types, 'health_types')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.serial_no is not None:
            result['serial_no'] = self.serial_no
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.name is not None:
            result['name'] = self.name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.health_types is not None:
            result['health_types'] = self.health_types
        if self.pass_id is not None:
            result['pass_id'] = self.pass_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('serial_no') is not None:
            self.serial_no = m.get('serial_no')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('health_types') is not None:
            self.health_types = m.get('health_types')
        if m.get('pass_id') is not None:
            self.pass_id = m.get('pass_id')
        return self


class QueryHealthinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        health_info: HealthInfo = None,
        nucleic_acid_info: NucleicAcidInfo = None,
        travel_info: TravelInfo = None,
        vaccination_info: VaccinationInfo = None,
        antigen_info: AntigenInfo = None,
        scene_info: SceneInfo = None,
        pass_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 健康信息
        self.health_info = health_info
        # 核酸信息
        self.nucleic_acid_info = nucleic_acid_info
        # 行程信息
        # 
        self.travel_info = travel_info
        # 疫苗接种信息
        self.vaccination_info = vaccination_info
        # 抗原信息
        self.antigen_info = antigen_info
        # 场所信息
        self.scene_info = scene_info
        # 通行记录ID
        self.pass_id = pass_id

    def validate(self):
        if self.health_info:
            self.health_info.validate()
        if self.nucleic_acid_info:
            self.nucleic_acid_info.validate()
        if self.travel_info:
            self.travel_info.validate()
        if self.vaccination_info:
            self.vaccination_info.validate()
        if self.antigen_info:
            self.antigen_info.validate()
        if self.scene_info:
            self.scene_info.validate()

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
        if self.health_info is not None:
            result['health_info'] = self.health_info.to_map()
        if self.nucleic_acid_info is not None:
            result['nucleic_acid_info'] = self.nucleic_acid_info.to_map()
        if self.travel_info is not None:
            result['travel_info'] = self.travel_info.to_map()
        if self.vaccination_info is not None:
            result['vaccination_info'] = self.vaccination_info.to_map()
        if self.antigen_info is not None:
            result['antigen_info'] = self.antigen_info.to_map()
        if self.scene_info is not None:
            result['scene_info'] = self.scene_info.to_map()
        if self.pass_id is not None:
            result['pass_id'] = self.pass_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('health_info') is not None:
            temp_model = HealthInfo()
            self.health_info = temp_model.from_map(m['health_info'])
        if m.get('nucleic_acid_info') is not None:
            temp_model = NucleicAcidInfo()
            self.nucleic_acid_info = temp_model.from_map(m['nucleic_acid_info'])
        if m.get('travel_info') is not None:
            temp_model = TravelInfo()
            self.travel_info = temp_model.from_map(m['travel_info'])
        if m.get('vaccination_info') is not None:
            temp_model = VaccinationInfo()
            self.vaccination_info = temp_model.from_map(m['vaccination_info'])
        if m.get('antigen_info') is not None:
            temp_model = AntigenInfo()
            self.antigen_info = temp_model.from_map(m['antigen_info'])
        if m.get('scene_info') is not None:
            temp_model = SceneInfo()
            self.scene_info = temp_model.from_map(m['scene_info'])
        if m.get('pass_id') is not None:
            self.pass_id = m.get('pass_id')
        return self


class PushHealthinfologRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        pass_id: str = None,
        serial_no: str = None,
        corp_name: str = None,
        cost_time: int = None,
        pass_result: str = None,
        name: str = None,
        cert_no: str = None,
        error_type: str = None,
        error_code: str = None,
        error_msg: str = None,
        temperature: str = None,
        health_info: HealthInfo = None,
        nucleic_acid_info: NucleicAcidInfo = None,
        travel_info: TravelInfo = None,
        vaccination_info: VaccinationInfo = None,
        antigen_info: AntigenInfo = None,
        scene_info: SceneInfo = None,
        pass_mode: str = None,
        longitude: str = None,
        latitude: str = None,
        channel_pass_state: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 通行记录ID
        self.pass_id = pass_id
        # 设备SN
        self.serial_no = serial_no
        # 设备厂商
        # 
        self.corp_name = corp_name
        # 通行时长(ms)
        self.cost_time = cost_time
        # 通行结果
        self.pass_result = pass_result
        # 被查询人姓名
        # 
        self.name = name
        # 被查询人身份证号
        self.cert_no = cert_no
        # 异常类型
        self.error_type = error_type
        # 错误码
        self.error_code = error_code
        # 错误信息
        self.error_msg = error_msg
        # 体温
        self.temperature = temperature
        # 健康信息
        self.health_info = health_info
        # 核酸信息
        self.nucleic_acid_info = nucleic_acid_info
        # 行程信息
        # 
        self.travel_info = travel_info
        # 疫苗接种信息
        self.vaccination_info = vaccination_info
        # 抗原信息
        self.antigen_info = antigen_info
        # 场所信息
        # 
        self.scene_info = scene_info
        # 通行方式(1:自动刷脸, 2:刷证非1:1, 3:刷证1:1, 4:反扫, 5:刷奥智定制卡, 6:手动刷脸)
        self.pass_mode = pass_mode
        # 经度
        self.longitude = longitude
        # 纬度
        self.latitude = latitude
        # 数据源通行状态 0:禁止通行,1:允许通行
        self.channel_pass_state = channel_pass_state

    def validate(self):
        self.validate_required(self.pass_id, 'pass_id')
        self.validate_required(self.serial_no, 'serial_no')
        self.validate_required(self.corp_name, 'corp_name')
        self.validate_required(self.cost_time, 'cost_time')
        if self.health_info:
            self.health_info.validate()
        if self.nucleic_acid_info:
            self.nucleic_acid_info.validate()
        if self.travel_info:
            self.travel_info.validate()
        if self.vaccination_info:
            self.vaccination_info.validate()
        if self.antigen_info:
            self.antigen_info.validate()
        if self.scene_info:
            self.scene_info.validate()

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.pass_id is not None:
            result['pass_id'] = self.pass_id
        if self.serial_no is not None:
            result['serial_no'] = self.serial_no
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.cost_time is not None:
            result['cost_time'] = self.cost_time
        if self.pass_result is not None:
            result['pass_result'] = self.pass_result
        if self.name is not None:
            result['name'] = self.name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.error_type is not None:
            result['error_type'] = self.error_type
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        if self.temperature is not None:
            result['temperature'] = self.temperature
        if self.health_info is not None:
            result['health_info'] = self.health_info.to_map()
        if self.nucleic_acid_info is not None:
            result['nucleic_acid_info'] = self.nucleic_acid_info.to_map()
        if self.travel_info is not None:
            result['travel_info'] = self.travel_info.to_map()
        if self.vaccination_info is not None:
            result['vaccination_info'] = self.vaccination_info.to_map()
        if self.antigen_info is not None:
            result['antigen_info'] = self.antigen_info.to_map()
        if self.scene_info is not None:
            result['scene_info'] = self.scene_info.to_map()
        if self.pass_mode is not None:
            result['pass_mode'] = self.pass_mode
        if self.longitude is not None:
            result['longitude'] = self.longitude
        if self.latitude is not None:
            result['latitude'] = self.latitude
        if self.channel_pass_state is not None:
            result['channel_pass_state'] = self.channel_pass_state
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('pass_id') is not None:
            self.pass_id = m.get('pass_id')
        if m.get('serial_no') is not None:
            self.serial_no = m.get('serial_no')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('cost_time') is not None:
            self.cost_time = m.get('cost_time')
        if m.get('pass_result') is not None:
            self.pass_result = m.get('pass_result')
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('error_type') is not None:
            self.error_type = m.get('error_type')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        if m.get('temperature') is not None:
            self.temperature = m.get('temperature')
        if m.get('health_info') is not None:
            temp_model = HealthInfo()
            self.health_info = temp_model.from_map(m['health_info'])
        if m.get('nucleic_acid_info') is not None:
            temp_model = NucleicAcidInfo()
            self.nucleic_acid_info = temp_model.from_map(m['nucleic_acid_info'])
        if m.get('travel_info') is not None:
            temp_model = TravelInfo()
            self.travel_info = temp_model.from_map(m['travel_info'])
        if m.get('vaccination_info') is not None:
            temp_model = VaccinationInfo()
            self.vaccination_info = temp_model.from_map(m['vaccination_info'])
        if m.get('antigen_info') is not None:
            temp_model = AntigenInfo()
            self.antigen_info = temp_model.from_map(m['antigen_info'])
        if m.get('scene_info') is not None:
            temp_model = SceneInfo()
            self.scene_info = temp_model.from_map(m['scene_info'])
        if m.get('pass_mode') is not None:
            self.pass_mode = m.get('pass_mode')
        if m.get('longitude') is not None:
            self.longitude = m.get('longitude')
        if m.get('latitude') is not None:
            self.latitude = m.get('latitude')
        if m.get('channel_pass_state') is not None:
            self.channel_pass_state = m.get('channel_pass_state')
        return self


class PushHealthinfologResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        pass_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 通行记录ID
        self.pass_id = pass_id

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
        if self.pass_id is not None:
            result['pass_id'] = self.pass_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('pass_id') is not None:
            self.pass_id = m.get('pass_id')
        return self


class GetHealthinfoRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        serial_no: str = None,
        corp_name: str = None,
        qr_code: str = None,
        health_types: str = None,
        pass_id: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备SN
        # 
        self.serial_no = serial_no
        # 设备厂商
        # 
        self.corp_name = corp_name
        # 健康身份二维码
        self.qr_code = qr_code
        # 防疫信息类型,枚举值如下： 健康信息 health , 疫苗信息 vaccination , 核酸信息 nucleicAcid , 行程信息 travel , 抗原信息 antigen , 场景信息 scene . 需要有多项信息类型时，用"|"分隔开。eg: "health|nucleicAcid"
        self.health_types = health_types
        # 通行记录ID
        # 
        self.pass_id = pass_id

    def validate(self):
        self.validate_required(self.serial_no, 'serial_no')
        self.validate_required(self.corp_name, 'corp_name')
        self.validate_required(self.qr_code, 'qr_code')
        self.validate_required(self.health_types, 'health_types')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.serial_no is not None:
            result['serial_no'] = self.serial_no
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.qr_code is not None:
            result['qr_code'] = self.qr_code
        if self.health_types is not None:
            result['health_types'] = self.health_types
        if self.pass_id is not None:
            result['pass_id'] = self.pass_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('serial_no') is not None:
            self.serial_no = m.get('serial_no')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('qr_code') is not None:
            self.qr_code = m.get('qr_code')
        if m.get('health_types') is not None:
            self.health_types = m.get('health_types')
        if m.get('pass_id') is not None:
            self.pass_id = m.get('pass_id')
        return self


class GetHealthinfoResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        health_info: HealthInfo = None,
        nucleic_acid_info: NucleicAcidInfo = None,
        travel_info: TravelInfo = None,
        vaccination_info: VaccinationInfo = None,
        antigen_info: AntigenInfo = None,
        scene_info: SceneInfo = None,
        name: str = None,
        cert_no: str = None,
        pass_id: str = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 健康信息
        # 
        self.health_info = health_info
        # 核酸信息
        # 
        self.nucleic_acid_info = nucleic_acid_info
        # 行程信息
        # 
        self.travel_info = travel_info
        # 疫苗接种信息
        # 
        self.vaccination_info = vaccination_info
        # 抗原信息
        # 
        self.antigen_info = antigen_info
        # 场所信息
        # 
        self.scene_info = scene_info
        # 被查询人姓名
        self.name = name
        # 被查询人身份证号
        # 
        self.cert_no = cert_no
        # 通行记录ID
        self.pass_id = pass_id

    def validate(self):
        if self.health_info:
            self.health_info.validate()
        if self.nucleic_acid_info:
            self.nucleic_acid_info.validate()
        if self.travel_info:
            self.travel_info.validate()
        if self.vaccination_info:
            self.vaccination_info.validate()
        if self.antigen_info:
            self.antigen_info.validate()
        if self.scene_info:
            self.scene_info.validate()

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
        if self.health_info is not None:
            result['health_info'] = self.health_info.to_map()
        if self.nucleic_acid_info is not None:
            result['nucleic_acid_info'] = self.nucleic_acid_info.to_map()
        if self.travel_info is not None:
            result['travel_info'] = self.travel_info.to_map()
        if self.vaccination_info is not None:
            result['vaccination_info'] = self.vaccination_info.to_map()
        if self.antigen_info is not None:
            result['antigen_info'] = self.antigen_info.to_map()
        if self.scene_info is not None:
            result['scene_info'] = self.scene_info.to_map()
        if self.name is not None:
            result['name'] = self.name
        if self.cert_no is not None:
            result['cert_no'] = self.cert_no
        if self.pass_id is not None:
            result['pass_id'] = self.pass_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        if m.get('health_info') is not None:
            temp_model = HealthInfo()
            self.health_info = temp_model.from_map(m['health_info'])
        if m.get('nucleic_acid_info') is not None:
            temp_model = NucleicAcidInfo()
            self.nucleic_acid_info = temp_model.from_map(m['nucleic_acid_info'])
        if m.get('travel_info') is not None:
            temp_model = TravelInfo()
            self.travel_info = temp_model.from_map(m['travel_info'])
        if m.get('vaccination_info') is not None:
            temp_model = VaccinationInfo()
            self.vaccination_info = temp_model.from_map(m['vaccination_info'])
        if m.get('antigen_info') is not None:
            temp_model = AntigenInfo()
            self.antigen_info = temp_model.from_map(m['antigen_info'])
        if m.get('scene_info') is not None:
            temp_model = SceneInfo()
            self.scene_info = temp_model.from_map(m['scene_info'])
        if m.get('name') is not None:
            self.name = m.get('name')
        if m.get('cert_no') is not None:
            self.cert_no = m.get('cert_no')
        if m.get('pass_id') is not None:
            self.pass_id = m.get('pass_id')
        return self


class QueryDeviceargsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        serial_no: str = None,
        corp_name: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备SN
        self.serial_no = serial_no
        # 设备厂商
        self.corp_name = corp_name

    def validate(self):
        self.validate_required(self.serial_no, 'serial_no')
        self.validate_required(self.corp_name, 'corp_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.serial_no is not None:
            result['serial_no'] = self.serial_no
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('serial_no') is not None:
            self.serial_no = m.get('serial_no')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        return self


class QueryDeviceargsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        args_name_value_list: List[ArgsNameValue] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 设备参数列表
        self.args_name_value_list = args_name_value_list

    def validate(self):
        if self.args_name_value_list:
            for k in self.args_name_value_list:
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
        result['args_name_value_list'] = []
        if self.args_name_value_list is not None:
            for k in self.args_name_value_list:
                result['args_name_value_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.args_name_value_list = []
        if m.get('args_name_value_list') is not None:
            for k in m.get('args_name_value_list'):
                temp_model = ArgsNameValue()
                self.args_name_value_list.append(temp_model.from_map(k))
        return self


class InitDeviceargsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        serial_no: str = None,
        corp_name: str = None,
        args_name_value_list: List[ArgsNameValue] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备sn
        self.serial_no = serial_no
        # 设备厂商
        self.corp_name = corp_name
        # 设备参数名称/key/value列表
        self.args_name_value_list = args_name_value_list

    def validate(self):
        self.validate_required(self.serial_no, 'serial_no')
        self.validate_required(self.corp_name, 'corp_name')
        self.validate_required(self.args_name_value_list, 'args_name_value_list')
        if self.args_name_value_list:
            for k in self.args_name_value_list:
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
        if self.serial_no is not None:
            result['serial_no'] = self.serial_no
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        result['args_name_value_list'] = []
        if self.args_name_value_list is not None:
            for k in self.args_name_value_list:
                result['args_name_value_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('serial_no') is not None:
            self.serial_no = m.get('serial_no')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        self.args_name_value_list = []
        if m.get('args_name_value_list') is not None:
            for k in m.get('args_name_value_list'):
                temp_model = ArgsNameValue()
                self.args_name_value_list.append(temp_model.from_map(k))
        return self


class InitDeviceargsResponse(TeaModel):
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


class QueryHealthinfologRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        start_time: str = None,
        end_time: str = None,
        page_num: int = None,
        page_size: int = None,
        serial_no: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 开始时间(开始时间-结束时间最大时间为7天)
        self.start_time = start_time
        # 结束时间
        self.end_time = end_time
        # 页码
        self.page_num = page_num
        # 每页条数
        self.page_size = page_size
        # 设备号
        self.serial_no = serial_no

    def validate(self):
        self.validate_required(self.start_time, 'start_time')
        self.validate_required(self.end_time, 'end_time')
        self.validate_required(self.page_num, 'page_num')
        if self.page_num is not None:
            self.validate_minimum(self.page_num, 'page_num', 1)
        self.validate_required(self.page_size, 'page_size')
        if self.page_size is not None:
            self.validate_maximum(self.page_size, 'page_size', 500)
            self.validate_minimum(self.page_size, 'page_size', 1)

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.start_time is not None:
            result['start_time'] = self.start_time
        if self.end_time is not None:
            result['end_time'] = self.end_time
        if self.page_num is not None:
            result['page_num'] = self.page_num
        if self.page_size is not None:
            result['page_size'] = self.page_size
        if self.serial_no is not None:
            result['serial_no'] = self.serial_no
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('start_time') is not None:
            self.start_time = m.get('start_time')
        if m.get('end_time') is not None:
            self.end_time = m.get('end_time')
        if m.get('page_num') is not None:
            self.page_num = m.get('page_num')
        if m.get('page_size') is not None:
            self.page_size = m.get('page_size')
        if m.get('serial_no') is not None:
            self.serial_no = m.get('serial_no')
        return self


class QueryHealthinfologResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        total: int = None,
        pages: int = None,
        data_list: List[HealthInfoLog] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 总条数
        self.total = total
        # 总页数
        self.pages = pages
        # 列表数据
        self.data_list = data_list

    def validate(self):
        if self.data_list:
            for k in self.data_list:
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
        if self.pages is not None:
            result['pages'] = self.pages
        result['data_list'] = []
        if self.data_list is not None:
            for k in self.data_list:
                result['data_list'].append(k.to_map() if k else None)
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
        if m.get('pages') is not None:
            self.pages = m.get('pages')
        self.data_list = []
        if m.get('data_list') is not None:
            for k in m.get('data_list'):
                temp_model = HealthInfoLog()
                self.data_list.append(temp_model.from_map(k))
        return self


class QueryHealthstatisticsRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        start_date: str = None,
        end_date: str = None,
        type: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 开始日期
        self.start_date = start_date
        # 结束日期(为空或等于开始日期时为查询当天)
        self.end_date = end_date
        # 统计类型(通行人数统计：PERSON，通行次数统计：NUMBER)
        self.type = type

    def validate(self):
        self.validate_required(self.start_date, 'start_date')
        self.validate_required(self.type, 'type')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.start_date is not None:
            result['start_date'] = self.start_date
        if self.end_date is not None:
            result['end_date'] = self.end_date
        if self.type is not None:
            result['type'] = self.type
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('start_date') is not None:
            self.start_date = m.get('start_date')
        if m.get('end_date') is not None:
            self.end_date = m.get('end_date')
        if m.get('type') is not None:
            self.type = m.get('type')
        return self


class QueryHealthstatisticsResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        data_list: List[HealthStatistics] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 日结统计数据
        self.data_list = data_list

    def validate(self):
        if self.data_list:
            for k in self.data_list:
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
        result['data_list'] = []
        if self.data_list is not None:
            for k in self.data_list:
                result['data_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.data_list = []
        if m.get('data_list') is not None:
            for k in m.get('data_list'):
                temp_model = HealthStatistics()
                self.data_list.append(temp_model.from_map(k))
        return self


