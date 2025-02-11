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


class AssetElementRelationInfo(TeaModel):
    def __init__(
        self,
        source_element_id: str = None,
        target_element_id: str = None,
        relation_type: int = None,
        relation_dependency_type: str = None,
        relation_dependency: str = None,
        transform_relation_dependency: str = None,
        project_id: str = None,
        source_element_name: str = None,
        target_element_name: str = None,
    ):
        # 来源要素ID
        self.source_element_id = source_element_id
        # 目标要素ID
        self.target_element_id = target_element_id
        # 关联类型
        self.relation_type = relation_type
        # 关联依据类型
        self.relation_dependency_type = relation_dependency_type
        # 关联依据
        self.relation_dependency = relation_dependency
        # 关系依据, 支持泛型反序列化的格式
        self.transform_relation_dependency = transform_relation_dependency
        # 项目ID
        self.project_id = project_id
        # 来源要素名称
        self.source_element_name = source_element_name
        # 目标要素名称
        self.target_element_name = target_element_name

    def validate(self):
        self.validate_required(self.source_element_id, 'source_element_id')
        self.validate_required(self.target_element_id, 'target_element_id')
        self.validate_required(self.relation_type, 'relation_type')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.source_element_name, 'source_element_name')
        self.validate_required(self.target_element_name, 'target_element_name')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.source_element_id is not None:
            result['source_element_id'] = self.source_element_id
        if self.target_element_id is not None:
            result['target_element_id'] = self.target_element_id
        if self.relation_type is not None:
            result['relation_type'] = self.relation_type
        if self.relation_dependency_type is not None:
            result['relation_dependency_type'] = self.relation_dependency_type
        if self.relation_dependency is not None:
            result['relation_dependency'] = self.relation_dependency
        if self.transform_relation_dependency is not None:
            result['transform_relation_dependency'] = self.transform_relation_dependency
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.source_element_name is not None:
            result['source_element_name'] = self.source_element_name
        if self.target_element_name is not None:
            result['target_element_name'] = self.target_element_name
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('source_element_id') is not None:
            self.source_element_id = m.get('source_element_id')
        if m.get('target_element_id') is not None:
            self.target_element_id = m.get('target_element_id')
        if m.get('relation_type') is not None:
            self.relation_type = m.get('relation_type')
        if m.get('relation_dependency_type') is not None:
            self.relation_dependency_type = m.get('relation_dependency_type')
        if m.get('relation_dependency') is not None:
            self.relation_dependency = m.get('relation_dependency')
        if m.get('transform_relation_dependency') is not None:
            self.transform_relation_dependency = m.get('transform_relation_dependency')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('source_element_name') is not None:
            self.source_element_name = m.get('source_element_name')
        if m.get('target_element_name') is not None:
            self.target_element_name = m.get('target_element_name')
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


class AssetElementInfo(TeaModel):
    def __init__(
        self,
        project_id: str = None,
        element_id: str = None,
        element_name: str = None,
        element_type: str = None,
        from_type: str = None,
        data_element_type: str = None,
        property_list: str = None,
        transform_property_list: str = None,
        frequency: str = None,
        physics_element_type_code: str = None,
        biz_type: str = None,
        persistent_location: str = None,
        element_instance_config: str = None,
        element_instance_info: str = None,
        property_source_type: int = None,
        property_source_id: str = None,
        primary_key_info: str = None,
        remark: str = None,
    ):
        # 项目ID
        self.project_id = project_id
        # 要素ID
        self.element_id = element_id
        # 要素名称
        self.element_name = element_name
        # 要素类型
        self.element_type = element_type
        # 数据来源渠道， 物理要素非必填；数据要素必填；
        self.from_type = from_type
        # 平台领域类型， 物理要素非必填；数据要素必填；
        self.data_element_type = data_element_type
        # 属性列表， 物理要素非必填；数据要素必填；
        self.property_list = property_list
        # 格式处理过的属性列表（支持泛型反序列化）
        self.transform_property_list = transform_property_list
        # 数据上报频率
        self.frequency = frequency
        # 物理要素类型码，包含iot和资管的
        self.physics_element_type_code = physics_element_type_code
        # 业务类型
        self.biz_type = biz_type
        # 该要素的存储位置， index代表数据流转顺序，location为库表/logstore名称，remark备注
        self.persistent_location = persistent_location
        # 要素实例信息，用于捞取最小闭环数据
        self.element_instance_config = element_instance_config
        # 要素实例
        self.element_instance_info = element_instance_info
        # 属性列表来源平台 1.IOT 2.DM
        self.property_source_type = property_source_type
        # 拉取数据字段code请求值
        self.property_source_id = property_source_id
        # 要素主键字段信息
        self.primary_key_info = primary_key_info
        # 备注
        self.remark = remark

    def validate(self):
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.element_id, 'element_id')
        self.validate_required(self.element_type, 'element_type')
        self.validate_required(self.physics_element_type_code, 'physics_element_type_code')

    def to_map(self):
        _map = super().to_map()
        if _map is not None:
            return _map

        result = dict()
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.element_id is not None:
            result['element_id'] = self.element_id
        if self.element_name is not None:
            result['element_name'] = self.element_name
        if self.element_type is not None:
            result['element_type'] = self.element_type
        if self.from_type is not None:
            result['from_type'] = self.from_type
        if self.data_element_type is not None:
            result['data_element_type'] = self.data_element_type
        if self.property_list is not None:
            result['property_list'] = self.property_list
        if self.transform_property_list is not None:
            result['transform_property_list'] = self.transform_property_list
        if self.frequency is not None:
            result['frequency'] = self.frequency
        if self.physics_element_type_code is not None:
            result['physics_element_type_code'] = self.physics_element_type_code
        if self.biz_type is not None:
            result['biz_type'] = self.biz_type
        if self.persistent_location is not None:
            result['persistent_location'] = self.persistent_location
        if self.element_instance_config is not None:
            result['element_instance_config'] = self.element_instance_config
        if self.element_instance_info is not None:
            result['element_instance_info'] = self.element_instance_info
        if self.property_source_type is not None:
            result['property_source_type'] = self.property_source_type
        if self.property_source_id is not None:
            result['property_source_id'] = self.property_source_id
        if self.primary_key_info is not None:
            result['primary_key_info'] = self.primary_key_info
        if self.remark is not None:
            result['remark'] = self.remark
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('element_id') is not None:
            self.element_id = m.get('element_id')
        if m.get('element_name') is not None:
            self.element_name = m.get('element_name')
        if m.get('element_type') is not None:
            self.element_type = m.get('element_type')
        if m.get('from_type') is not None:
            self.from_type = m.get('from_type')
        if m.get('data_element_type') is not None:
            self.data_element_type = m.get('data_element_type')
        if m.get('property_list') is not None:
            self.property_list = m.get('property_list')
        if m.get('transform_property_list') is not None:
            self.transform_property_list = m.get('transform_property_list')
        if m.get('frequency') is not None:
            self.frequency = m.get('frequency')
        if m.get('physics_element_type_code') is not None:
            self.physics_element_type_code = m.get('physics_element_type_code')
        if m.get('biz_type') is not None:
            self.biz_type = m.get('biz_type')
        if m.get('persistent_location') is not None:
            self.persistent_location = m.get('persistent_location')
        if m.get('element_instance_config') is not None:
            self.element_instance_config = m.get('element_instance_config')
        if m.get('element_instance_info') is not None:
            self.element_instance_info = m.get('element_instance_info')
        if m.get('property_source_type') is not None:
            self.property_source_type = m.get('property_source_type')
        if m.get('property_source_id') is not None:
            self.property_source_id = m.get('property_source_id')
        if m.get('primary_key_info') is not None:
            self.primary_key_info = m.get('primary_key_info')
        if m.get('remark') is not None:
            self.remark = m.get('remark')
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


class SyncAssetelementProjectRequest(TeaModel):
    def __init__(
        self,
        auth_token: str = None,
        product_instance_id: str = None,
        cover_exist_project: bool = None,
        destination: str = None,
        project_id: str = None,
        project_name: str = None,
        root_elements: str = None,
        read_only: bool = None,
        remark: str = None,
        attachment_list: str = None,
        pd_owner: str = None,
        asset_element_info_list: List[AssetElementInfo] = None,
        asset_element_relation_info_list: List[AssetElementRelationInfo] = None,
    ):
        # OAuth模式下的授权token
        self.auth_token = auth_token
        self.product_instance_id = product_instance_id
        # 若要素项目已存在，是否进行全量覆盖
        self.cover_exist_project = cover_exist_project
        # 同步目标
        self.destination = destination
        # 项目ID
        self.project_id = project_id
        # 项目名称
        self.project_name = project_name
        # 根元素ID列表
        self.root_elements = root_elements
        # 是否只读
        self.read_only = read_only
        # 备注
        self.remark = remark
        # 附件列表
        self.attachment_list = attachment_list
        # 产品Owner
        self.pd_owner = pd_owner
        # 要素列表
        self.asset_element_info_list = asset_element_info_list
        # 要素关系列表
        self.asset_element_relation_info_list = asset_element_relation_info_list

    def validate(self):
        self.validate_required(self.cover_exist_project, 'cover_exist_project')
        self.validate_required(self.destination, 'destination')
        self.validate_required(self.project_id, 'project_id')
        self.validate_required(self.project_name, 'project_name')
        self.validate_required(self.read_only, 'read_only')
        if self.asset_element_info_list:
            for k in self.asset_element_info_list:
                if k:
                    k.validate()
        if self.asset_element_relation_info_list:
            for k in self.asset_element_relation_info_list:
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
        if self.cover_exist_project is not None:
            result['cover_exist_project'] = self.cover_exist_project
        if self.destination is not None:
            result['destination'] = self.destination
        if self.project_id is not None:
            result['project_id'] = self.project_id
        if self.project_name is not None:
            result['project_name'] = self.project_name
        if self.root_elements is not None:
            result['root_elements'] = self.root_elements
        if self.read_only is not None:
            result['read_only'] = self.read_only
        if self.remark is not None:
            result['remark'] = self.remark
        if self.attachment_list is not None:
            result['attachment_list'] = self.attachment_list
        if self.pd_owner is not None:
            result['pd_owner'] = self.pd_owner
        result['asset_element_info_list'] = []
        if self.asset_element_info_list is not None:
            for k in self.asset_element_info_list:
                result['asset_element_info_list'].append(k.to_map() if k else None)
        result['asset_element_relation_info_list'] = []
        if self.asset_element_relation_info_list is not None:
            for k in self.asset_element_relation_info_list:
                result['asset_element_relation_info_list'].append(k.to_map() if k else None)
        return result

    def from_map(self, m: dict = None):
        m = m or dict()
        if m.get('auth_token') is not None:
            self.auth_token = m.get('auth_token')
        if m.get('product_instance_id') is not None:
            self.product_instance_id = m.get('product_instance_id')
        if m.get('cover_exist_project') is not None:
            self.cover_exist_project = m.get('cover_exist_project')
        if m.get('destination') is not None:
            self.destination = m.get('destination')
        if m.get('project_id') is not None:
            self.project_id = m.get('project_id')
        if m.get('project_name') is not None:
            self.project_name = m.get('project_name')
        if m.get('root_elements') is not None:
            self.root_elements = m.get('root_elements')
        if m.get('read_only') is not None:
            self.read_only = m.get('read_only')
        if m.get('remark') is not None:
            self.remark = m.get('remark')
        if m.get('attachment_list') is not None:
            self.attachment_list = m.get('attachment_list')
        if m.get('pd_owner') is not None:
            self.pd_owner = m.get('pd_owner')
        self.asset_element_info_list = []
        if m.get('asset_element_info_list') is not None:
            for k in m.get('asset_element_info_list'):
                temp_model = AssetElementInfo()
                self.asset_element_info_list.append(temp_model.from_map(k))
        self.asset_element_relation_info_list = []
        if m.get('asset_element_relation_info_list') is not None:
            for k in m.get('asset_element_relation_info_list'):
                temp_model = AssetElementRelationInfo()
                self.asset_element_relation_info_list.append(temp_model.from_map(k))
        return self


class SyncAssetelementProjectResponse(TeaModel):
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


