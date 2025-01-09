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


class EventData(TeaModel):
    def __init__(
        self,
        content: str = None,
        trust_iot_device_id: int = None,
        biz_id: str = None,
        signature: str = None,
        extra_data: str = None,
    ):
        # 数据内容
        self.content = content
        # 可信设备ID
        self.trust_iot_device_id = trust_iot_device_id
        # 业务ID
        self.biz_id = biz_id
        # 数据签名
        self.signature = signature
        # 设备数据间接上报时，服务端补充数据
        self.extra_data = extra_data

    def validate(self):
        self.validate_required(self.content, 'content')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.content is not None:
            result['content'] = self.content
        if self.trust_iot_device_id is not None:
            result['trust_iot_device_id'] = self.trust_iot_device_id
        if self.biz_id is not None:
            result['biz_id'] = self.biz_id
        if self.signature is not None:
            result['signature'] = self.signature
        if self.extra_data is not None:
            result['extra_data'] = self.extra_data
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('content') is not None:
            self.content = m.get('content')
        if m.get('trust_iot_device_id') is not None:
            self.trust_iot_device_id = m.get('trust_iot_device_id')
        if m.get('biz_id') is not None:
            self.biz_id = m.get('biz_id')
        if m.get('signature') is not None:
            self.signature = m.get('signature')
        if m.get('extra_data') is not None:
            self.extra_data = m.get('extra_data')
        return self


class EventSpecs(TeaModel):
    def __init__(
        self,
        event_model_id: str = None,
        biz_type: str = None,
        submit_date: str = None,
        return_hash: bool = None,
    ):
        # 物模型事件ID
        self.event_model_id = event_model_id
        # 业务数据标识
        self.biz_type = biz_type
        # 
        # submit_date	STRING	否	2024-08-15
        # 
        self.submit_date = submit_date
        # 冗余字段，请忽略
        self.return_hash = return_hash

    def validate(self):
        self.validate_required(self.event_model_id, 'event_model_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.event_model_id is not None:
            result['event_model_id'] = self.event_model_id
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.submit_date is not None:
            result['submit_date'] = self.submit_date
        if self.return_hash is not None:
            result['return_hash'] = self.return_hash
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('event_model_id') is not None:
            self.event_model_id = m.get('event_model_id')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('submit_date') is not None:
            self.submit_date = m.get('submit_date')
        if m.get('return_hash') is not None:
            self.return_hash = m.get('return_hash')
        return self


class TrustiotDeviceIdMap(TeaModel):
    def __init__(
        self,
        trustiot_device_id: int = None,
        device_id: str = None,
    ):
        # 可信设备ID
        self.trustiot_device_id = trustiot_device_id
        # 设备ID
        self.device_id = device_id

    def validate(self):
        self.validate_required(self.trustiot_device_id, 'trustiot_device_id')
        self.validate_required(self.device_id, 'device_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.trustiot_device_id is not None:
            result['trustiot_device_id'] = self.trustiot_device_id
        if self.device_id is not None:
            result['device_id'] = self.device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('trustiot_device_id') is not None:
            self.trustiot_device_id = m.get('trustiot_device_id')
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        return self


class RegByDeviceIdParm(TeaModel):
    def __init__(
        self,
        device_id: str = None,
        device_data_model_id: str = None,
        device_feature: str = None,
        with_exist_device_id: bool = None,
        device_type_code: int = None,
        initial_price: int = None,
        factory_time: str = None,
        release_time: str = None,
        extra_info: str = None,
        owner: str = None,
        owner_name: str = None,
        device_imei: str = None,
        device_name: str = None,
        corp_name: str = None,
    ):
        # 一般是业务上唯一的设备ID/资产编码
        self.device_id = device_id
        # 物模型事件ID
        self.device_data_model_id = device_data_model_id
        # 固定填写RAW_DATA
        self.device_feature = device_feature
        # true : 设备ID已存在时返回存在的设备关联字段; false : 设备ID已存在时直接抛出异常；
        self.with_exist_device_id = with_exist_device_id
        # 设备类型编码，联系蚂蚁侧获取设备类型编码
        self.device_type_code = device_type_code
        # 设备单价 单位：分
        self.initial_price = initial_price
        # 出厂时间
        self.factory_time = factory_time
        # 投放时间
        self.release_time = release_time
        # 额外信息，联系蚂蚁侧获取参数格式
        self.extra_info = extra_info
        # 资产所有人标识（统一社会信用代码）
        self.owner = owner
        # 资产所有人名称
        self.owner_name = owner_name
        # 设备IMEI
        self.device_imei = device_imei
        # 设备名称/设备型号
        self.device_name = device_name
        # 生产厂商名
        self.corp_name = corp_name

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.device_type_code, 'device_type_code')
        if self.factory_time is not None:
            self.validate_pattern(self.factory_time, 'factory_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.release_time is not None:
            self.validate_pattern(self.release_time, 'release_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.device_data_model_id is not None:
            result['device_data_model_id'] = self.device_data_model_id
        if self.device_feature is not None:
            result['device_feature'] = self.device_feature
        if self.with_exist_device_id is not None:
            result['with_exist_device_id'] = self.with_exist_device_id
        if self.device_type_code is not None:
            result['device_type_code'] = self.device_type_code
        if self.initial_price is not None:
            result['initial_price'] = self.initial_price
        if self.factory_time is not None:
            result['factory_time'] = self.factory_time
        if self.release_time is not None:
            result['release_time'] = self.release_time
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.owner is not None:
            result['owner'] = self.owner
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        if self.device_imei is not None:
            result['device_imei'] = self.device_imei
        if self.device_name is not None:
            result['device_name'] = self.device_name
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('device_data_model_id') is not None:
            self.device_data_model_id = m.get('device_data_model_id')
        if m.get('device_feature') is not None:
            self.device_feature = m.get('device_feature')
        if m.get('with_exist_device_id') is not None:
            self.with_exist_device_id = m.get('with_exist_device_id')
        if m.get('device_type_code') is not None:
            self.device_type_code = m.get('device_type_code')
        if m.get('initial_price') is not None:
            self.initial_price = m.get('initial_price')
        if m.get('factory_time') is not None:
            self.factory_time = m.get('factory_time')
        if m.get('release_time') is not None:
            self.release_time = m.get('release_time')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        if m.get('device_imei') is not None:
            self.device_imei = m.get('device_imei')
        if m.get('device_name') is not None:
            self.device_name = m.get('device_name')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        return self


class RegByDeviceParm(TeaModel):
    def __init__(
        self,
        device_id: str = None,
        device_data_model_id: str = None,
        device_reg_content: str = None,
        device_reg_signature: str = None,
        sdk_id: str = None,
        device_type_code: int = None,
        initial_price: int = None,
        factory_time: str = None,
        release_time: str = None,
        extra_info: str = None,
        owner: str = None,
        owner_name: str = None,
        device_name: str = None,
        device_imei: str = None,
    ):
        # 一般是业务上唯一的设备ID/资产编码
        self.device_id = device_id
        # 物模型事件ID
        self.device_data_model_id = device_data_model_id
        # 设备端经过蚂蚁SDK或模组初始化得到的注册信息
        self.device_reg_content = device_reg_content
        # 蚂蚁侧SDK或模组对device_reg_content的签名
        self.device_reg_signature = device_reg_signature
        # sdk版本号，由蚂蚁侧提供
        self.sdk_id = sdk_id
        # 设备类型编码，联系蚂蚁侧获取设备类型编码
        self.device_type_code = device_type_code
        # 设备单价 单位：分
        self.initial_price = initial_price
        # 出厂时间
        self.factory_time = factory_time
        # 投放时间
        self.release_time = release_time
        # 额外信息，联系蚂蚁侧获取参数格式
        self.extra_info = extra_info
        # 资产所有人标识（统一社会信用代码）
        self.owner = owner
        # 资产所有人名称
        self.owner_name = owner_name
        # 设备名称/型号
        self.device_name = device_name
        # 设备IMEI
        self.device_imei = device_imei

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.device_reg_content, 'device_reg_content')
        self.validate_required(self.device_reg_signature, 'device_reg_signature')
        self.validate_required(self.sdk_id, 'sdk_id')
        self.validate_required(self.device_type_code, 'device_type_code')
        if self.factory_time is not None:
            self.validate_pattern(self.factory_time, 'factory_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        if self.release_time is not None:
            self.validate_pattern(self.release_time, 'release_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.device_data_model_id is not None:
            result['device_data_model_id'] = self.device_data_model_id
        if self.device_reg_content is not None:
            result['device_reg_content'] = self.device_reg_content
        if self.device_reg_signature is not None:
            result['device_reg_signature'] = self.device_reg_signature
        if self.sdk_id is not None:
            result['sdk_id'] = self.sdk_id
        if self.device_type_code is not None:
            result['device_type_code'] = self.device_type_code
        if self.initial_price is not None:
            result['initial_price'] = self.initial_price
        if self.factory_time is not None:
            result['factory_time'] = self.factory_time
        if self.release_time is not None:
            result['release_time'] = self.release_time
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.owner is not None:
            result['owner'] = self.owner
        if self.owner_name is not None:
            result['owner_name'] = self.owner_name
        if self.device_name is not None:
            result['device_name'] = self.device_name
        if self.device_imei is not None:
            result['device_imei'] = self.device_imei
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('device_data_model_id') is not None:
            self.device_data_model_id = m.get('device_data_model_id')
        if m.get('device_reg_content') is not None:
            self.device_reg_content = m.get('device_reg_content')
        if m.get('device_reg_signature') is not None:
            self.device_reg_signature = m.get('device_reg_signature')
        if m.get('sdk_id') is not None:
            self.sdk_id = m.get('sdk_id')
        if m.get('device_type_code') is not None:
            self.device_type_code = m.get('device_type_code')
        if m.get('initial_price') is not None:
            self.initial_price = m.get('initial_price')
        if m.get('factory_time') is not None:
            self.factory_time = m.get('factory_time')
        if m.get('release_time') is not None:
            self.release_time = m.get('release_time')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('owner') is not None:
            self.owner = m.get('owner')
        if m.get('owner_name') is not None:
            self.owner_name = m.get('owner_name')
        if m.get('device_name') is not None:
            self.device_name = m.get('device_name')
        if m.get('device_imei') is not None:
            self.device_imei = m.get('device_imei')
        return self


class Device(TeaModel):
    def __init__(
        self,
        device_id: str = None,
        device_data_model_id: str = None,
        scene: str = None,
        device_imei: str = None,
        device_name: str = None,
        corp_name: str = None,
        device_iccid: str = None,
        extra_info: str = None,
        device_type_code: str = None,
        initial_price: int = None,
        release_time: str = None,
        factory_time: str = None,
        device_status: str = None,
        trustiot_device_id: int = None,
    ):
        # 设备ID，一般是设备的出厂编码或业务上的资产ID
        self.device_id = device_id
        # 物模型事件ID
        self.device_data_model_id = device_data_model_id
        # 场景码
        self.scene = scene
        # imei号
        self.device_imei = device_imei
        # 设备名称
        self.device_name = device_name
        # 设备厂商名称
        self.corp_name = corp_name
        # 设备ICCID
        self.device_iccid = device_iccid
        # 设备扩展信息
        self.extra_info = extra_info
        # 设备类型编码
        self.device_type_code = device_type_code
        # 单价
        self.initial_price = initial_price
        # 投放时间
        self.release_time = release_time
        # 出厂时间
        self.factory_time = factory_time
        # 设备状态，取值范围：NORMAL、OFFLINE、UNREGISTER
        self.device_status = device_status
        # 可信设备ID
        self.trustiot_device_id = trustiot_device_id

    def validate(self):
        self.validate_required(self.device_id, 'device_id')
        self.validate_required(self.device_data_model_id, 'device_data_model_id')
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.device_imei, 'device_imei')
        self.validate_required(self.device_type_code, 'device_type_code')
        self.validate_required(self.initial_price, 'initial_price')
        self.validate_required(self.release_time, 'release_time')
        if self.release_time is not None:
            self.validate_pattern(self.release_time, 'release_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.factory_time, 'factory_time')
        if self.factory_time is not None:
            self.validate_pattern(self.factory_time, 'factory_time', '\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})')
        self.validate_required(self.trustiot_device_id, 'trustiot_device_id')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.device_id is not None:
            result['device_id'] = self.device_id
        if self.device_data_model_id is not None:
            result['device_data_model_id'] = self.device_data_model_id
        if self.scene is not None:
            result['scene'] = self.scene
        if self.device_imei is not None:
            result['device_imei'] = self.device_imei
        if self.device_name is not None:
            result['device_name'] = self.device_name
        if self.corp_name is not None:
            result['corp_name'] = self.corp_name
        if self.device_iccid is not None:
            result['device_iccid'] = self.device_iccid
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        if self.device_type_code is not None:
            result['device_type_code'] = self.device_type_code
        if self.initial_price is not None:
            result['initial_price'] = self.initial_price
        if self.release_time is not None:
            result['release_time'] = self.release_time
        if self.factory_time is not None:
            result['factory_time'] = self.factory_time
        if self.device_status is not None:
            result['device_status'] = self.device_status
        if self.trustiot_device_id is not None:
            result['trustiot_device_id'] = self.trustiot_device_id
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('device_id') is not None:
            self.device_id = m.get('device_id')
        if m.get('device_data_model_id') is not None:
            self.device_data_model_id = m.get('device_data_model_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        if m.get('device_imei') is not None:
            self.device_imei = m.get('device_imei')
        if m.get('device_name') is not None:
            self.device_name = m.get('device_name')
        if m.get('corp_name') is not None:
            self.corp_name = m.get('corp_name')
        if m.get('device_iccid') is not None:
            self.device_iccid = m.get('device_iccid')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        if m.get('device_type_code') is not None:
            self.device_type_code = m.get('device_type_code')
        if m.get('initial_price') is not None:
            self.initial_price = m.get('initial_price')
        if m.get('release_time') is not None:
            self.release_time = m.get('release_time')
        if m.get('factory_time') is not None:
            self.factory_time = m.get('factory_time')
        if m.get('device_status') is not None:
            self.device_status = m.get('device_status')
        if m.get('trustiot_device_id') is not None:
            self.trustiot_device_id = m.get('trustiot_device_id')
        return self


class SendCollectorResult(TeaModel):
    def __init__(
        self,
        original_index: int = None,
        error_code: str = None,
        error_msg: str = None,
        extra_info: str = None,
    ):
        # 原入参的数组索引
        # 
        self.original_index = original_index
        # 失败数据对应的异常码，成功时该字段为空
        self.error_code = error_code
        # 异常信息
        self.error_msg = error_msg
        # 返回的扩展信息
        self.extra_info = extra_info

    def validate(self):
        self.validate_required(self.original_index, 'original_index')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.original_index is not None:
            result['original_index'] = self.original_index
        if self.error_code is not None:
            result['error_code'] = self.error_code
        if self.error_msg is not None:
            result['error_msg'] = self.error_msg
        if self.extra_info is not None:
            result['extra_info'] = self.extra_info
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('original_index') is not None:
            self.original_index = m.get('original_index')
        if m.get('error_code') is not None:
            self.error_code = m.get('error_code')
        if m.get('error_msg') is not None:
            self.error_msg = m.get('error_msg')
        if m.get('extra_info') is not None:
            self.extra_info = m.get('extra_info')
        return self


class CreateDistributedeviceBydeviceidmulRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
        device_param_list: List[RegByDeviceIdParm] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        self.scene = scene
        # 设备注册信息集合
        self.device_param_list = device_param_list

    def validate(self):
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.device_param_list, 'device_param_list')
        if self.device_param_list:
            for k in self.device_param_list:
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
        result['device_param_list'] = []
        if self.device_param_list is not None:
            for k in self.device_param_list:
                result['device_param_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        self.device_param_list = []
        if m.get('device_param_list') is not None:
            for k in m.get('device_param_list'):
                temp_model = RegByDeviceIdParm()
                self.device_param_list.append(temp_model.from_map(k))
        return self


class CreateDistributedeviceBydeviceidmulResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trustiot_device_id_list: List[TrustiotDeviceIdMap] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 可信设备ID集合
        self.trustiot_device_id_list = trustiot_device_id_list

    def validate(self):
        if self.trustiot_device_id_list:
            for k in self.trustiot_device_id_list:
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
        result['trustiot_device_id_list'] = []
        if self.trustiot_device_id_list is not None:
            for k in self.trustiot_device_id_list:
                result['trustiot_device_id_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.trustiot_device_id_list = []
        if m.get('trustiot_device_id_list') is not None:
            for k in m.get('trustiot_device_id_list'):
                temp_model = TrustiotDeviceIdMap()
                self.trustiot_device_id_list.append(temp_model.from_map(k))
        return self


class CreateDistributedeviceBydevicemulRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
        device_param_list: List[RegByDeviceParm] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码，由蚂蚁侧定义
        self.scene = scene
        # 设备注册信息集合, 数组长度不超过50
        self.device_param_list = device_param_list

    def validate(self):
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.device_param_list, 'device_param_list')
        if self.device_param_list:
            for k in self.device_param_list:
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
        result['device_param_list'] = []
        if self.device_param_list is not None:
            for k in self.device_param_list:
                result['device_param_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        self.device_param_list = []
        if m.get('device_param_list') is not None:
            for k in m.get('device_param_list'):
                temp_model = RegByDeviceParm()
                self.device_param_list.append(temp_model.from_map(k))
        return self


class CreateDistributedeviceBydevicemulResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        trustiot_device_id_list: List[TrustiotDeviceIdMap] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 可信设备ID集合
        self.trustiot_device_id_list = trustiot_device_id_list

    def validate(self):
        if self.trustiot_device_id_list:
            for k in self.trustiot_device_id_list:
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
        result['trustiot_device_id_list'] = []
        if self.trustiot_device_id_list is not None:
            for k in self.trustiot_device_id_list:
                result['trustiot_device_id_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.trustiot_device_id_list = []
        if m.get('trustiot_device_id_list') is not None:
            for k in m.get('trustiot_device_id_list'):
                temp_model = TrustiotDeviceIdMap()
                self.trustiot_device_id_list.append(temp_model.from_map(k))
        return self


class SendEventDataRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        scene: str = None,
        event_data_list: List[EventData] = None,
        event_specs: EventSpecs = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 场景码
        self.scene = scene
        # 事件数据列表
        self.event_data_list = event_data_list
        # 事件数据领域参数
        self.event_specs = event_specs

    def validate(self):
        self.validate_required(self.scene, 'scene')
        self.validate_required(self.event_data_list, 'event_data_list')
        if self.event_data_list:
            for k in self.event_data_list:
                if k:
                    k.validate()
        self.validate_required(self.event_specs, 'event_specs')
        if self.event_specs:
            self.event_specs.validate()

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
        result['event_data_list'] = []
        if self.event_data_list is not None:
            for k in self.event_data_list:
                result['event_data_list'].append(k.to_map() if k else None)
        if self.event_specs is not None:
            result['event_specs'] = self.event_specs.to_map()
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        self.event_data_list = []
        if m.get('event_data_list') is not None:
            for k in m.get('event_data_list'):
                temp_model = EventData()
                self.event_data_list.append(temp_model.from_map(k))
        if m.get('event_specs') is not None:
            temp_model = EventSpecs()
            self.event_specs = temp_model.from_map(m['event_specs'])
        return self


class SendEventDataResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        result_list: List[SendCollectorResult] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 上报数据返回的上链结果
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
        self.result_list = []
        if m.get('result_list') is not None:
            for k in m.get('result_list'):
                temp_model = SendCollectorResult()
                self.result_list.append(temp_model.from_map(k))
        return self


class GetDeviceBydeviceidRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        device_id_list: List[str] = None,
        scene: str = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 设备id集合
        self.device_id_list = device_id_list
        # 场景码
        self.scene = scene

    def validate(self):
        self.validate_required(self.device_id_list, 'device_id_list')
        self.validate_required(self.scene, 'scene')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.auth_token is not None:
            result['auth_token'] = self.auth_token
        if self.product_instance_id is not None:
            result['product_instance_id'] = self.product_instance_id
        if self.device_id_list is not None:
            result['device_id_list'] = self.device_id_list
        if self.scene is not None:
            result['scene'] = self.scene
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('device_id_list') is not None:
            self.device_id_list = m.get('device_id_list')
        if m.get('scene') is not None:
            self.scene = m.get('scene')
        return self


class GetDeviceBydeviceidResponse(TeaModel):
    def __init__(
        self,
        req_msg_id: str = None,
        result_code: str = None,
        result_msg: str = None,
        device_list: List[Device] = None,
        miss_device_id_list: List[str] = None,
        success_device_id_list: List[str] = None,
    ):
        # 请求唯一ID，用于链路跟踪和问题排查
        self.req_msg_id = req_msg_id
        # 结果码，一般OK表示调用成功
        self.result_code = result_code
        # 异常信息的文本描述
        self.result_msg = result_msg
        # 设备详情
        self.device_list = device_list
        # 设备信息不存在的deviceId集合
        self.miss_device_id_list = miss_device_id_list
        # 成功获取到设备信息的deviceid集合
        self.success_device_id_list = success_device_id_list

    def validate(self):
        if self.device_list:
            for k in self.device_list:
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
        result['device_list'] = []
        if self.device_list is not None:
            for k in self.device_list:
                result['device_list'].append(k.to_map() if k else None)
        if self.miss_device_id_list is not None:
            result['miss_device_id_list'] = self.miss_device_id_list
        if self.success_device_id_list is not None:
            result['success_device_id_list'] = self.success_device_id_list
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('req_msg_id') is not None:
            self.req_msg_id = m.get('req_msg_id')
        if m.get('result_code') is not None:
            self.result_code = m.get('result_code')
        if m.get('result_msg') is not None:
            self.result_msg = m.get('result_msg')
        self.device_list = []
        if m.get('device_list') is not None:
            for k in m.get('device_list'):
                temp_model = Device()
                self.device_list.append(temp_model.from_map(k))
        if m.get('miss_device_id_list') is not None:
            self.miss_device_id_list = m.get('miss_device_id_list')
        if m.get('success_device_id_list') is not None:
            self.success_device_id_list = m.get('success_device_id_list')
        return self


